package com.github.tslamic.dn

import android.content.Context

class DeviceNamesImpl(context: Context) : DeviceNames {
  val database = DeviceNamesDatabaseImpl(context)

  override fun deviceName(model: String, fallback: String?): String? {
    try {
      database.open()
      return database.deviceName(model, fallback)
    } finally {
      database.close()
    }
  }
}
