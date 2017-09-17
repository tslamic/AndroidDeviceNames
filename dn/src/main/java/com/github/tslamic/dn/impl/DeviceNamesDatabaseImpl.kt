package com.github.tslamic.dn.impl

import android.database.sqlite.SQLiteDatabase
import com.github.tslamic.dn.DeviceNamesDatabase
import java.io.File

internal class DeviceNamesDatabaseImpl(database: File) : DeviceNamesDatabase {
  private val sqlite: SQLiteDatabase = SQLiteDatabase.openDatabase(database.absolutePath,
      null, SQLiteDatabase.OPEN_READONLY)

  override fun close() = sqlite.close()

  override fun deviceName(model: String, fallback: String?): String? = if (sqlite.isOpen) {
    query(model, fallback)
  } else {
    throw IllegalStateException("database is closed")
  }

  private fun query(model: String, fallback: String?): String? {
    val query = "SELECT name FROM adn WHERE model = ?"
    sqlite.rawQuery(query, arrayOf(model)).use { cursor ->
      return if (cursor.moveToFirst()) cursor.getString(0) else fallback
    }
  }
}
