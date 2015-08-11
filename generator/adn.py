"""
Generates a simple Java class that can map an Android device model String to a
user friendly String.
"""

from string import Template
import time
import os
import re

try:
    import requests
except ImportError:
    requests = None  # Downloading disabled.

JAVA_ELSE_IF = 'else if ("%s".equals(%s)) { return "%s"; }\n'
JAVA_ELSE = 'else { return %s; }'
JAVA_PARAM_MODEL = "model"
JAVA_PARAM_FALLBACK = "fallback"
JAVA_TEMPLATE = "java.template"
JAVA_CLASS_NAME = "DeviceNames.java"


def generate_java_class(sources, collision_handler=None):
    """
    Generates the Java class.

    :param sources: a list of Source objects.
    :param collision_handler: (optional) a function for resolving duplicate
    entries.
    """
    java_dict = merge_source_dicts(sources, collision_handler)
    if not java_dict:
        raise Exception("sources contain no model-name pairs")
    content = []
    for model, name in java_dict.iteritems():
        java_statement = JAVA_ELSE_IF % (model, JAVA_PARAM_MODEL, name)
        content.append(java_statement)
    content.append(JAVA_ELSE % JAVA_PARAM_FALLBACK)
    with open(JAVA_TEMPLATE, 'rb') as template:
        class_template = template.read()
    content = Template(class_template).substitute(
        template=''.join(content))
    with open(JAVA_CLASS_NAME, 'wb') as java_class:
        java_class.write(content)


def merge_source_dicts(sources, collision_handler=None):
    """
    Merges multiple source model-name dicts into a single dict and returns it.

    :param sources: a list of Source objects.
    :param collision_handler: (optional) a function for resolving duplicate
    entries.
    """
    java_dict = {}
    for source in sources:
        source_dict = source.get_dict(collision_handler)
        if collision_handler is None:
            for model, name in source_dict.iteritems():
                java_dict[model] = name
        else:
            for model, name in source_dict.iteritems():
                if model in java_dict:
                    old_name = java_dict[model]
                    java_dict[model] = collision_handler(model, old_name, name)
                else:
                    java_dict[model] = name
    return java_dict


class Source(object):
    def get_dict(self, collision_handler=None):
        """
        Returns a dictionary where keys are device models and values are
        user-friendly name, e.g.: "GT-I9500" : "Samsung Galaxy S4"
        """
        raise NotImplementedError("implementation missing")


# Utils

def download_device_list(url, target, chunk=2048):
    """
    Downloads a file containing device information.

    :param url: the device list location
    :param target: the file path where device list will be saved
    """
    if requests is None:
        raise Exception("please install 'requests' lib")
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


def create_content_dict(target, device_handler, collision_handler):
    """
    Returns a set containing java if-else statements, mapping device models
    to its user-friendly names.

    :param target: the file path source
    :param device_handler: a function with one param (currently read
    line) returning a (model, name) string tuple, e.g.
    ("GT-I9500", "Samsung Galaxy S4")
    :param collision_handler: a function with three params:
    model, existing model name and a new model name. Returns a single name
    string.
    """
    with open(target, 'rb') as device_list:
        devices = device_list.readlines()
    content_dict = {}
    for device in devices:
        model, name = device_handler(device)
        if collision_handler is not None and model in content_dict:
            name = collision_handler(model, content_dict[model], name)
        content_dict[model] = name
    return content_dict


def exception_collision_handler(model, old, new):
    raise Exception("multiple names for '%s': '%s', '%s'" % (model, old, new))


# Sources

class MeetupSource(Source):
    source_file = "meetup.devices"
    source_url = "https://raw.githubusercontent.com/meetup/android-device" \
                 "-names/master/android_models.properties"

    def get_dict(self, collision_handler=exception_collision_handler):
        if is_stale(self.source_file, ONE_WEEK):
            download_device_list(self.source_url, self.source_file)
        return create_content_dict(self.source_file, self.device_handler,
                                   collision_handler)

    @staticmethod
    def device_handler(device_line):
        model, name = (d.strip() for d in device_line.split('='))
        if not name:
            name = model.replace("_", " ")
        return model, name


class CachedSource(Source):
    regex = re.compile("[a-z0-9_\s]+", re.IGNORECASE)

    def get_dict(self, collision_handler=None):
        handle = lambda l: self.device_handler(l, self.regex)
        return create_content_dict('cached.devices', handle, collision_handler)

    @staticmethod
    def device_handler(device_line, regex):
        model, name = (d.strip() for d in device_line.split('='))
        if not name:
            name = model.replace("_", " ")
        if not re.match(regex, model):
            raise Exception("model syntax failure: %s" % model)
        if not re.match(regex, name):
            raise Exception("name syntax failure: %s" % name)
        return model, name


# Main

if __name__ == "__main__":
    source_list = [CachedSource(), ]
    generate_java_class(source_list,
                        collision_handler=exception_collision_handler)
