package com.github.tslamic.dn

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import java.io.File

class DeviceNamesDatabaseImpl(val context: Context) : DeviceNamesDatabase {
  val databaseFile: File = context.getDatabasePath("adn.db")
  var database: SQLiteDatabase? = null

  override fun open() {
    val timestamp = BuildConfig.GIT_TIMESTAMP
    val prefs = context.getSharedPreferences("__adn", Context.MODE_PRIVATE)
    val key = "timestamp"
    if (timestamp != prefs.getLong(key, 0)) {
      context.assets.open("adn.db").use { input ->
        databaseFile.outputStream().use { output ->
          if (input.copyTo(output) > 0) {
            prefs.edit().putLong(key, BuildConfig.GIT_TIMESTAMP).apply()
          }
        }
      }
    }
    val path = databaseFile.absolutePath
    database = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY)
  }

  override fun close() {
    database?.close()
  }

  override fun deviceName(model: String, fallback: String?): String? {
    if (database.isClosed()) {
      throw IllegalStateException("database closed")
    }
    database!!.rawQuery("SELECT name FROM adn WHERE model = ?", arrayOf(model)).use {
      if (it.moveToFirst()) {
        val name = it.getString(0)
        if (!name.isNullOrBlank()) {
          return name
        }
      }
      return fallback
    }
  }

  fun SQLiteDatabase?.isClosed(): Boolean {
    return this == null || !this.isOpen
  }
}
