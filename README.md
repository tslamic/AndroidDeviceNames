
Android Device Names [![Build Status](https://travis-ci.org/tslamic/AndroidDeviceNames.svg?branch=master)](https://travis-ci.org/tslamic/AndroidDeviceNames)
===================

Android Device Names is a 14 kB library that transforms the device model name into something people can understand. For example, a useless `SM-N910W8` becomes `Samsung Galaxy Note 4`. Here's how to use it:

```java
// returns "Samsung Galaxy Note 4"
DeviceNames.getDeviceName("SM-N910W8", "Unknown Device");
```

To get the name of the device you're currently running on, use

```java
DeviceNames.getCurrentDeviceName("Unknown Device");
```

Currently, the library recognises about [400 devices](https://github.com/tslamic/AndroidDeviceNames/blob/master/generator/devices/cached.devices). In case the device model is not in the list, a fallback is returned:

```java
// returns "Unknown Device"
DeviceNames.getDeviceName("unknown_device_model", "Unknown Device");
```

How does it work?
---

The `DeviceNames` class is generated with a [Python script](https://github.com/tslamic/AndroidDeviceNames/blob/master/generator/adn.py). `getDeviceName` uses if-elif-else statements to determine the device name. Here's an excerpt:

```java
public static String getDeviceName(String model, String fallback) {
    if (android.text.TextUtils.isEmpty(model)) {
        return fallback;
    }
    final char c = Character.toUpperCase(model.charAt(0));
    switch (c) {
        // before stuff
        case 'B':
            if ("bq_Aquaris_5".equals(model)) {
                return "bq Aquaris 5";
            } else if ("bq_Aquaris_5_HD".equals(model)) {
                return "bq Aquaris 5 HD";
            }
            break;
        case 'E':
            if ("EVO".equals(model)) {
                return "HTC Evo";
            }
            break;
        // after stuff
    }
    return fallback;
}
```

There's no memory overhead and performance is great. With over 400 device names, a battered Samsung Galaxy S3 handles the worst case scenario, according to *Traceview*, in less than **5 ms**.

How to get it?
---

The library will be available on maven central in a few days. Until then, just copy-paste the [`DeviceNames`](https://github.com/tslamic/AndroidDeviceNames/blob/master/lib/adn/androiddevicenames/src/main/java/tslamic/github/io/adn/DeviceNames.java) class into your project.

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