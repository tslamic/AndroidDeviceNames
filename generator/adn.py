"""
Generates a simple Java class that can map an Android device model String to a
user friendly String.
"""

from string import Template
import time
import os

import requests

MEETUP_FILE = 'devices.properties'
MEETUP_URL = "https://raw.githubusercontent.com/meetup/android-device-names" \
             "/master/android_models.properties"
CHUNK = 2048


def download_device_list(source):
    """ Downloads a file containing a number of device mappings from a url
    and saves it to the target file."""
    url = source.url()
    if not url:
        return
    with open(source.local_file_path(), 'wb') as devices:
        response = requests.get(url, stream=True)
        if not response.ok:
            raise Exception("cannot download the device list")
        for block in response.iter_content(CHUNK):
            devices.write(block)


WEEK_IN_SECONDS = 604800


def should_update_source(source):
    path = source.local_file_path()
    if os.path.exists(path):
        last_modified = os.path.getmtime(path)
        return time.time() - last_modified > WEEK_IN_SECONDS
    return True


JAVA_ELSE_IF = 'else if ("%s".equals(%s)) { return "%s"; }\n'
JAVA_ELSE = 'else { return %s; }'
JAVA_PARAM_MODEL = "model"
JAVA_PARAM_FALLBACK = "fallback"
JAVA_TEMPLATE = "java.template"
JAVA_CLASS_NAME = "DeviceNames.java"


def generate_java_class(*sources):
    java_content = set()
    for source in sources:
        source_content = generate_java_content(source)
        java_content = java_content.union(source_content)
    if java_content:
        content = list(java_content)
        content.append(JAVA_ELSE % JAVA_PARAM_FALLBACK)
        with open(JAVA_TEMPLATE, 'rb') as template:
            class_template = template.read()
        content = Template(class_template).substitute(
            template=''.join(content))
        with open(JAVA_CLASS_NAME, 'wb') as java_class:
            java_class.write(content)


def merge_java_content(*args):
    return {item for arg in args for item in arg}


def generate_java_content(source):
    if should_update_source(source):
        download_device_list(source)
    content = set()
    with open(source.local_file_path(), 'rb') as device_list:
        devices = device_list.readlines()
    if devices:
        for device in devices:
            model, name = source.line_splitter(device)
            if not name:
                name = source.empty_name_handler(model)
            java_statement = JAVA_ELSE_IF % (model, JAVA_PARAM_MODEL, name)
            content.add(java_statement)
    return content


class Source(object):
    def url(self):
        raise NotImplementedError("implementation missing")

    def local_file_path(self):
        raise NotImplementedError("implementation missing")

    def line_splitter(self, line):
        raise NotImplementedError("implementation missing")

    def empty_name_handler(self, model):
        raise NotImplementedError("implementation missing")


class MeetupSource(Source):
    def url(self):
        return "https://raw.githubusercontent.com/meetup/android-device" \
               "-names/master/android_models.properties"

    def local_file_path(self):
        return "meetup.devices"

    def line_splitter(self, line):
        return (item.strip() for item in line.split('='))

    def empty_name_handler(self, model):
        return model.replace("_", " ")


if __name__ == "__main__":
    generate_java_class(MeetupSource())
