package com.github.tslamic.dn

interface DeviceNames {
  /**
   * Returns a user-friendly name for current device.
   * @return name of this device or `null`.
   */
  fun currentDeviceName() = deviceName(android.os.Build.MODEL, null)

  /**
   * Returns a user-friendly name for current device.
   * @return name of this device or `fallback`.
   */
  fun currentDeviceName(fallback: String?) = deviceName(android.os.Build.MODEL, fallback)

  /**
   * Returns a user-friendly name for the specified model.
   * @return name of model or `fallback`.
   */
  fun deviceName(model: String, fallback: String?): String?
}
