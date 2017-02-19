package com.github.tslamic.dn

import android.database.sqlite.SQLiteDatabase

interface Database {
  /**
   * Copies the device database from the assets folder, if required.
   */
  fun copyFromAssets()

  /**
   * Returns the [SQLiteDatabase] device database instance.
   */
  fun instance(): SQLiteDatabase?
}
