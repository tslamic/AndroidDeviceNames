package com.github.tslamic.dn

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.os.Process.THREAD_PRIORITY_BACKGROUND
import com.github.tslamic.dn.impl.Cache
import com.github.tslamic.dn.impl.DeviceNamesImpl
import io.reactivex.Single
import kotlin.concurrent.thread

object AndroidDeviceNames {
  interface Callback<in T> {
    /**
     * Invoked when the instance is ready.
     */
    fun onReady(instance: T)
  }

  /**
   * Invokes the callback with [DeviceNames] instance. Use this if you need a single query.
   */
  @JvmStatic fun deviceNames(context: Context, callback: Callback<DeviceNames>) {
    deviceNamesDatabase(context, object : Callback<DeviceNamesDatabase> {
      override fun onReady(instance: DeviceNamesDatabase) {
        val names = DeviceNamesImpl(instance)
        callback.onReady(names)
      }
    })
  }

  /**
   * Returns a [DeviceNames] Single. Use this if you need a single query.
   */
  @JvmStatic fun deviceNames(context: Context): Single<DeviceNames> {
    return deviceNamesDatabase(context).map { DeviceNamesImpl(it) }
  }

  /**
   * Invokes the callback with [DeviceNamesDatabase] instance.
   * Use this if you need to perform multiple queries.
   * Ensure that [DeviceNamesDatabase.close] is called once the database is no longer needed.
   */
  @JvmStatic fun deviceNamesDatabase(context: Context, callback: Callback<DeviceNamesDatabase>) {
    val applicationContext = context.applicationContext
    thread(name = "AndroidDeviceNames", priority = THREAD_PRIORITY_BACKGROUND) {
      val cache = Cache(applicationContext)
      val database = cache.database()
      Handler(Looper.getMainLooper()).post { callback.onReady(database) }
    }
  }

  /**
   * Returns a [DeviceNamesDatabase] Single. Use this if you need to perform multiple queries.
   * Use this if you need to perform multiple queries.
   * Ensure that [DeviceNamesDatabase.close] is called once the database is no longer needed.
   */
  @JvmStatic fun deviceNamesDatabase(context: Context): Single<DeviceNamesDatabase> {
    val applicationContext = context.applicationContext
    return Single.just(Cache(applicationContext).database())
  }
}
