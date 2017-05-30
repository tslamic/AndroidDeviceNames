# -*- coding: utf-8 -*-

"""
generator.py is a simple script that creates a sqlite database of Android
device models and its corresponding user-friendly names, e.g.:
SM-N910W8, Samsung Galaxy Note4.

This is part of AndroidDeviceNames library:
https://github.com/tslamic/AndroidDeviceNames

:copyright: (c) 2017 by Tadej Slamic (github.com/tslamic)
:license: Apache 2.0
"""

import StringIO
import csv
import os
import re
import sqlite3
import sys

try:
    import requests
    requests.packages.urllib3.disable_warnings()  # No sensitive data.
except ImportError:
    sys.exit("'requests' library required")

SQL_CREATE = '''
DROP TABLE IF EXISTS adn;
CREATE TABLE adn (
    _id INTEGER PRIMARY KEY,
    name TEXT,
    model TEXT UNIQUE
);
CREATE INDEX model_index ON adn (model);
'''

SQL_INSERT = '''
INSERT OR IGNORE INTO adn (name, model) VALUES (?, ?)
'''

SQL_COUNT = '''
SELECT Count(*) FROM adn
'''

RE_WHITESPACE = re.compile('\s+')


def _sanitize(string):
    """ Removes or replaces unsupported chars from a given string. """
    s = string.strip().replace('_', ' ')
    s = RE_WHITESPACE.sub(' ', s)
    return s


def _log(message):
    print message


def _main():
    gen = Generator(GooglePlayEngine(), CorcoranGithubEngine())
    gen.create_database()


class Generator(object):
    def __init__(self, *engines):
        """
        Constructs a new Generator instance using the list of provided
        Engines.
        """
        super(Generator, self).__init__()
        self.engines = engines

    def create_database(self, database_path=None):
        if database_path is None:
            database_path = os.path.join(os.getcwd(), 'dn.db')
        with sqlite3.connect(database_path) as db:
            db.executescript(SQL_CREATE)
            for engine in self.engines:
                devices = engine.devices()
                _log("engine {} found {} devices"
                     .format(engine.__class__.__name__, len(devices)))
                db.executemany(SQL_INSERT, devices)
            count = db.execute(SQL_COUNT).fetchone()[0]
            _log("total devices in the database: {}".format(count))


class Engine(object):
    def devices(self):
        """
        Returns a list of (name, model) tuples representing
        various devices.
        """
        raise NotImplementedError()


class GooglePlayEngine(Engine):
    """ Google Play supported devices. """

    ENCODING = 'UTF-16'
    URL = 'http://storage.googleapis.com/play_public/supported_devices.csv'

    def devices(self):
        tuple_list = []
        r = requests.get(self.URL, stream=True)
        r.raise_for_status()
        content = r.content.decode(self.ENCODING)
        reader = csv.reader(StringIO.StringIO(content), delimiter=',')
        next(reader)  # Skip header.
        for row in reader:
            name = _sanitize('%s %s' % (row[0], row[1]))
            model = row[3]
            if name and model:
                tuple_list.append((name, model,))
        return tuple_list


class CorcoranGithubEngine(Engine):
    """ Jeff Corcoran GitHub device list. """

    DELIMITER = ' = '
    URL = "https://github.com/corcoran/AndroidDeviceNames/blob/master" \
          "/generator/devices/cached.devices"

    def devices(self):
        tuple_list = []
        r = requests.get(self.URL)
        r.raise_for_status()
        content = r.content
        lines = content.split(os.linesep)
        for line in lines:
            if self.DELIMITER in line:
                model, name = line.split(self.DELIMITER)
                tuple_list.append((_sanitize(name), model,))
        return tuple_list


if __name__ == '__main__':
    _main()
