Android Device Names
===================

Android Device Names is a tiny 14 kB library that transforms the device model name into something people can understand. For example:

```
// returns "Samsung Galaxy Note 4"
DeviceNames.getDeviceName("SM-N910W8", "Unknown Device");
```

To get the name of the device you're currently running on, use

```
DeviceNames.getCurrentDeviceName("Unknown Device");
```

What if my device is not on the list?
---

Currently, the library recognises about [400 devices](https://github.com/tslamic/AndroidDeviceNames/blob/master/generator/cached.devices). In case the device model is missing, a fallback is used instead:

```
// probably returns "My Awesome Fallback"
DeviceNames.getDeviceName("OMG-WTF-LOL", "My Awesome Fallback");
```

Memory and performance?
---

The `DeviceNames` class is generated with a [Python script](https://github.com/tslamic/AndroidDeviceNames/blob/master/generator/adn.py). `getDeviceName` method consists of if-elif-else statements, so there is no memory footprint, bar the string pool. 

The performance is great. With over 400 device names, a battered Samsung Galaxy S3 handles the worst case scenario, according to *Traceview*, in less than **5 ms**.

How to get it?
---

The library will be available on maven central in a few days. Until then, just copy-paste the [`DeviceNames`](https://github.com/tslamic/AndroidDeviceNames/blob/master/lib/Adn/androiddevicenames/src/main/java/tslamic/github/io/androiddevicenames/DeviceNames.java) class into your project.

A big thanks to [Meetup](https://github.com/meetup/android-device-names) where the idea for this project was born (and some files stolen). Cheers guys!

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