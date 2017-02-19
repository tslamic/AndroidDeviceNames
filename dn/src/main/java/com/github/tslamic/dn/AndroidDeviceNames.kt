package com.github.tslamic.dn

import android.content.Context

object AndroidDeviceNames {
  /**
   * Returns a [DeviceNames] instance. Use this if you need is a single query.
   */
  @JvmStatic fun deviceNames(context: Context): DeviceNames {
    val database = deviceNamesDatabase(context)
    return DeviceNamesImpl(database)
  }

  /**
   * Returns a [DeviceNamesDatabase]. Use this if you need to perform multiple queries.
   * Ensure you invoke [DeviceNamesDatabase.open] before querying
   * and [DeviceNamesDatabase.close] when you're done.
   */
  @JvmStatic fun deviceNamesDatabase(context: Context): DeviceNamesDatabase {
    val db = DatabaseImpl(context)
    return DeviceNamesDatabaseImpl(db)
  }
}
