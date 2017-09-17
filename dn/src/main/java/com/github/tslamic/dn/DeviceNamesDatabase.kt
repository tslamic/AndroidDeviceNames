package com.github.tslamic.dn

// Not using java.io.Closeable because it clutters the API with IOException.
interface DeviceNamesDatabase : DeviceNames {
  /**
   * Closes the database.
   */
  fun close()
}
