package com.github.tslamic.dn.impl

import com.github.tslamic.dn.DeviceNames
import com.github.tslamic.dn.DeviceNamesDatabase

internal class DeviceNamesImpl(private val database: DeviceNamesDatabase) : DeviceNames {
  override fun deviceName(model: String, fallback: String?): String? {
    try {
      return database.deviceName(model, fallback)
    } finally {
      database.close()
    }
  }

  @Suppress("ProtectedInFinal")
  protected fun finalize() {
    // Safety net, in case DeviceNames is created but never used.
    database.close()
  }
}
