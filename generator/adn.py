"""
Generates a simple Java class that can map an Android device model String to a
user friendly String.
"""

from string import Template
import time
import os

import requests

JAVA_ELSE_IF = 'else if ("%s".equals(%s)) { return "%s"; }\n'
JAVA_ELSE = 'else { return %s; }'
JAVA_PARAM_MODEL = "model"
JAVA_PARAM_FALLBACK = "fallback"
JAVA_TEMPLATE = "java.template"
JAVA_CLASS_NAME = "DeviceNames.java"


def generate_java_class(*sources):
    java_content = set()
    for source in sources:
        source_content = source.get_tuple_set()
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


class Source(object):
    """ Simple class providing random device name sources. """

    def get_tuple_set(self):
        """
        Returns a set of string tuples where the first item is the device
        model and the second item is a user-friendly name, e.g.:
            ("GT-I9500", "Samsung Galaxy S4")
        """
        raise NotImplementedError("implementation missing")


# Utils

def download_device_list(url, target, chunk=2048):
    """
    Downloads a file containing device information.

    :param url: the device list location
    :param target: the file path where device list will be saved
    """
    if not url:
        raise Exception("url not specified")
    with open(target, 'wb') as t:
        response = requests.get(url, stream=True)
        if not response.ok:
            raise Exception("download failed")
        for block in response.iter_content(chunk):
            t.write(block)


ONE_WEEK = 604800  # in seconds.


def is_stale(target, freshness_interval):
    """
    Determines if a device list is stale.

    :param target: the file path to be checked
    :param freshness_interval: elapsed seconds the target is considered fresh
    :return: True if device list should be refreshed, False otherwise
    """
    if os.path.exists(target):
        last_modified = os.path.getmtime(target)
        return time.time() - last_modified > freshness_interval
    return True


def create_tuple_content(target, line_handler, empty_name_handler=None):
    """
    Returns a set of string tuples where the first item is the device model
    and the second item is a user-friendly name, e.g.: ("GT-I9500", "Samsung
    Galaxy S4")

    :param target: the file path source
    :param line_handler: a function with the one param - currently read
    line. Returns a (model, name) string tuple, e.g.
    ("GT-I9500", "Samsung Galaxy S4")
    :param empty_name_handler: (optional) a function with one param - the
    device model string. This is only invoked if the second item returned from
    line_handler is empty. Returns a string.
    """
    content = set()
    with open(target, 'rb') as device_list:
        devices = device_list.readlines()
    for device in devices:
        model, name = line_handler(device)
        if not name and empty_name_handler:
            name = empty_name_handler(model)
        java_statement = JAVA_ELSE_IF % (model, JAVA_PARAM_MODEL, name)
        content.add(java_statement)
    return content


# Sources

class MeetupSource(Source):
    source_file = "meetup.devices"
    source_url = "https://raw.githubusercontent.com/meetup/android-device" \
                 "-names/master/android_models.properties"

    def get_tuple_set(self):
        if is_stale(self.source_file, ONE_WEEK):
            download_device_list(self.source_url, self.source_file)
        line_h = lambda l: (item.strip() for item in l.split('='))
        name_h = lambda m: m.replace("_", " ")
        return create_tuple_content(self.source_file, line_h, name_h)


class CustomDevicesSource(Source):
    source_file = "custom_devices.devices"

    def get_tuple_set(self):
        line_h = lambda l: (item.strip() for item in l.split('='))
        return create_tuple_content(self.source_file, line_h)


# Main

if __name__ == "__main__":
    generate_java_class(MeetupSource(), CustomDevicesSource())
