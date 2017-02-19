package com.github.tslamic.dn

import android.database.sqlite.SQLiteDatabase

class DeviceNamesDatabaseImpl(val database: Database) : DeviceNamesDatabase {
  var sqlite: SQLiteDatabase? = null

  override fun open() {
    if (sqlite.isValid()) {
      throw IllegalStateException("the database is already open")
    }
    database.copyFromAssets()
    sqlite = database.instance()
    if (!sqlite.isValid()) {
      throw IllegalStateException("error opening the database")
    }
  }

  override fun close() {
    sqlite?.close()
  }

  override fun deviceName(model: String, fallback: String?): String? {
    if (!sqlite.isValid()) {
      throw IllegalStateException("open() must be invoked first")
    }
    sqlite!!.rawQuery("SELECT name FROM adn WHERE model = ?", arrayOf(model)).use { c ->
      if (c.moveToFirst()) {
        val name = c.getString(0)
        if (!name.isNullOrBlank()) {
          return name
        }
      }
      return fallback
    }
  }

  private fun SQLiteDatabase?.isValid(): Boolean {
    return this != null && isOpen
  }
}
