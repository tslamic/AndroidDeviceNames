package com.github.tslamic.dn

import android.content.Context

object AndroidDeviceNames {
  @JvmStatic fun deviceNames(context: Context): DeviceNames {
    return DeviceNamesImpl(context)
  }

  @JvmStatic fun deviceNamesDatabase(context: Context): DeviceNamesDatabase {
    return DeviceNamesDatabaseImpl(context)
  }
}
