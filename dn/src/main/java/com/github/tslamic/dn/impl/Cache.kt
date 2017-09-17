package com.github.tslamic.dn.impl

import android.content.Context
import android.content.SharedPreferences
import android.support.annotation.WorkerThread
import com.github.tslamic.dn.BuildConfig
import com.github.tslamic.dn.DeviceNamesDatabase
import java.io.File

internal const val PREFS_NAME = "__dn__"
internal const val PREFS_VERSION = "version"
internal const val ASSET_NAME = "dn.db.zip"
internal const val LOCAL_DATABASE_PATH = "dn.db"

internal class Cache internal constructor(context: Context,
    private val database: File = context.getDatabasePath(LOCAL_DATABASE_PATH)) {

  private val assets = context.assets
  private val prefs: SharedPreferences =
      context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

  /**
   * Returns the currently cached version.
   */
  fun getVersion() = prefs.getInt(PREFS_VERSION, 0)

  /**
   * Updates cached version to be the latest.
   */
  fun setCurrentVersion() = prefs.edit()
      .putInt(PREFS_VERSION, BuildConfig.DATABASE_VERSION).apply()

  /**
   * Returns `true` if current cached version of the database is out of date,
   * `false` otherwise.
   */
  fun isStale() = BuildConfig.DATABASE_VERSION != getVersion()

  /**
   * Returns the latest database version.
   */
  @WorkerThread
  fun database(): DeviceNamesDatabase {
    if (isStale()) {
      updateDatabase(ASSET_NAME)
    }
    return DeviceNamesDatabaseImpl(database)
  }

  /**
   * Updates the database to the latest version.
   */
  @WorkerThread
  fun updateDatabase(assetName: String): Boolean {
    val stream = assets.open(assetName)
    if (AssetHandler.unzip(stream, database)) {
      setCurrentVersion()
      return true
    }
    return false
  }
}
