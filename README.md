
Android Device Names v2
===

This tiny Android library transforms a device model name into something people can understand. For example, a useless `SM-N910W8` becomes `Samsung Galaxy Note4` with a single method call. :tada:

To use it, add the following to your list of dependencies:

```groovy
compile 'com.github.tslamic:dn2:1.0'
```

If you only want to extract the current device name, or perform a single query, `DeviceNames` is what you're after:

```java
DeviceNames names = AndroidDeviceNames.deviceNames(context);
String device = names.currentDeviceName();
```

For multiple queries, `DeviceNamesDatabase` will perform better. Since you have to explicitly open and close it, it's probably best to make it follow a lifecycle, e.g.:

```java
private DeviceNamesDatabase database;

@Override protected void onCreate(Bundle savedInstanceState) {
  // ...
  database = AndroidDeviceNames.deviceNamesDatabase(this);
}

@Override protected void onStart() {
  super.onStart();
  database.open();
}

@Override protected void onStop() {
  super.onStop();
  database.close();
}

String query(@NonNull String model) {
  return database.deviceName(model, "UNKNOWN");
}
```

Both `DeviceNames` and `DeviceNamesDatabase` offer three methods:

| method | description |
|:-|:-|
| `currentDeviceName()` |  Returns a user-friendly current device name, or `null` if the model is unknown. |
| `currentDeviceName(String fallback)`| Same as above, but returns `fallback` if the model is unknown. |
| `deviceName(String model, String fallback)` | Returns a user-friendly name for the specified `model`, or `fallback`, if the model is unknown. |

The library recognizes all [Google Play supported devices](https://support.google.com/googleplay/answer/1727131), which is currently a bit less than 13k devices.

### Not backwards compatible with v1

If you've been using AndroidDeviceNames v1, please note that v2 is not backwards compatible. Updating should be trivial and result in minimal code change though.

License
---

    Copyright 2017 Tadej Slamic

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.