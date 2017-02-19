package com.github.tslamic.dn

interface DeviceNamesDatabase : DeviceNames {
  /**
   * Opens the database.
   */
  fun open()

  /**
   * Closes the database.
   */
  fun close()
}
