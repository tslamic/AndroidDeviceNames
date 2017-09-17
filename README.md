Android Device Names [![Build Status](https://travis-ci.org/tslamic/AndroidDeviceNames.svg?branch=master)](https://travis-ci.org/tslamic/AndroidDeviceNames)
===

This tiny Android library transforms a device model name into something people can understand. For example, a useless `SM-N910W8` becomes `Samsung Galaxy Note4` with a single method call. :tada: It currently recognizes about 15k devices, including all [Google Play supported devices](https://support.google.com/googleplay/answer/1727131).

**It does not require network connectivity, ever. No, really.** 

To use it, add the following to your list of dependencies:

```groovy
compile 'com.github.tslamic:dn3:3.0'
```

There are two classes you can use:

 1. `DeviceNames` use this if all you need is a *single* query.
 2. `DeviceNamesDatabase` for multiple queries. Don't forget to close it afterwards!

RxJava2 is supported out of the box. Obtaining a `DeviceNames` instance is easy:

```java
AndroidDeviceNames.deviceNames(context)
  .subscribeOn(Schedulers.io())
  .observeOn(AndroidSchedulers.mainThread())
  .subscribe(names -> doSomethingWith(names));
```

but good ol' callbacks are supported too, in case you don't feel reactive:

```java
AndroidDeviceNames.deviceNames(context,
  new AndroidDeviceNames.Callback<DeviceNames>() {
    @Override 
    public void onReady(@NonNull DeviceNames instance) {
      String name = instance.currentDeviceName(); 
    }
  });
```

You can obtain an instance of `DeviceNamesDatabase` in a similar fashion. After you're done using it, don't forget to explicitly call `close()`. For example:
 
```java
@Override
protected void onStart() {
  super.onStart();
  AndroidDeviceNames.deviceNamesDatabase(this,
    new AndroidDeviceNames.Callback<DeviceNamesDatabase>() {
      @Override
      public void onReady(@NonNull DeviceNamesDatabase instance) {
        database = instance;
      }
    });
}

@Override
protected void onStop() {
  super.onStop();
  if (database != null) {
    database.close();
  }
}
```

Both `DeviceNames` and `DeviceNamesDatabase` come with three methods:

| method | description |
| -----: | :---------- |
| `currentDeviceName()` |  Returns a user-friendly current device name, or `null` if the model is unknown. |
| `currentDeviceName(String fallback)`| Same as above, but returns `fallback` if the model is unknown. |
| `deviceName(String model, String fallback)` | Returns a user-friendly name for the specified `model`, or `fallback`, if model is unknown. |

### Not backwards compatible with v1 or v2, sorry.

If you've been using AndroidDeviceNames v1 or v2, please note that this version is not backwards compatible. 
Updating should be trivial, result in minimal code change and is highly encouraged.

### Contributions

Special thanks to [@corcoran](https://github.com/corcoran) for making numerous improvements to the lib.

### In the wild

Here's the list of apps using this lib:

- [XDA Labs](https://www.xda-developers.com/xda-labs)

If you're using it in your app, and want to be on the above list, please let me know (create a pull request or open an issue).

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
