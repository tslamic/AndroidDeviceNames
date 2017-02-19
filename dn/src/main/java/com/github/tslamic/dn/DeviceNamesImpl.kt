package com.github.tslamic.dn

class DeviceNamesImpl(val database: DeviceNamesDatabase) : DeviceNames {
  override fun deviceName(model: String, fallback: String?): String? {
    try {
      database.open()
      return database.deviceName(model, fallback)
    } finally {
      database.close()
    }
  }
}
