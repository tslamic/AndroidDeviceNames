package com.github.tslamic.dn

import android.content.Context
import android.content.SharedPreferences
import android.database.sqlite.SQLiteDatabase
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream

class DatabaseImpl(val context: Context) : Database {
  val prefs: SharedPreferences = context.getSharedPreferences("__dn__", Context.MODE_PRIVATE)
  val database: File = context.getDatabasePath("dn.db")
  val version: Long = 4L

  override fun copyFromAssets() {
    val key = "version"
    if (!database.isValid() || version != prefs.getLong(key, 0)) {
      if (!database.parentFile.exists() && !database.parentFile.mkdirs()) {
        throw IOException("context.getDatabasePath does not exist and could not be created")
      }
      val src = context.assets.open("dn.db")
      val dst = database.outputStream()
      copy(src, dst, key, version)
    }
  }

  override fun instance(): SQLiteDatabase? {
    if (database.isValid()) {
      return SQLiteDatabase.openDatabase(database.absolutePath, null, SQLiteDatabase.OPEN_READONLY)
    }
    return null
  }

  private fun copy(src: InputStream, dst: OutputStream, key: String, version: Long) {
    src.use { s ->
      dst.use { d ->
        if (s.copyTo(d) > 0) {
          prefs.edit().putLong(key, version).apply()
        }
      }
    }
  }

  private fun File.isValid(): Boolean {
    return this.exists() && this.length() > 0
  }
}
