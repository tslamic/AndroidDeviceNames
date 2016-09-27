
Android Device Names [![Build Status](https://travis-ci.org/tslamic/AndroidDeviceNames.svg?branch=master)](https://travis-ci.org/tslamic/AndroidDeviceNames)
===================

Android Device Names is a 14 kB library that transforms the device model name into something people can understand. For example, a useless `SM-N910W8` becomes `Samsung Galaxy Note 4`. 

First, add the following to your list of dependencies:

```groovy
compile 'com.github.tslamic.adn:library:1.1'
```

Then, use it:

```java
// Returns the device name or null if the device model 
// is not in the list.
DeviceNames.getCurrentDeviceName();
```

You can provide your own default value, if `null` is not good enough:

```java
// Returns the device name or "Unknown Device" 
// if the device model is not in the list.
DeviceNames.getCurrentDeviceName("Unknown Device");
```

If you want to provide the device model yourself, the following should do the trick:

```java
DeviceNames.getDeviceName("SM-N910W8", "Unknown Device");
```

About
---

This library was designed with a specific goal in mind - avoiding memory overhead. Here's a detailed [blog post](http://tslamic.github.io/creating-android-device-names/) in case you're interested in details. Currently, the library recognises [10483 devices](https://github.com/corcoran/AndroidDeviceNames/blob/master/generator/devices/cached.devices).

Acknowledgements
---

A big thank you to [Meetup](https://github.com/meetup/android-device-names) for inspiration and the device list.

License
---

    Copyright 2015 tslamic

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
