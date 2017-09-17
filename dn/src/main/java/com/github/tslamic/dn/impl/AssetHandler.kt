package com.github.tslamic.dn.impl

import android.support.annotation.WorkerThread
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.util.zip.ZipInputStream

internal object AssetHandler {
  /**
   * Unzips a stream into the destination file.
   * Assumes the zip includes a single non-empty file.
   */
  @WorkerThread
  fun unzip(stream: InputStream, destination: File): Boolean {
    createParentDirectories(destination)

    val buffered = stream.buffered()
    ZipInputStream(buffered).use { src ->
      src.nextEntry
      destination.outputStream().use { dst ->
        src.copyTo(dst)
        return destination.length() > 0
      }
    }
  }

  /**
   * Creates all the parent directories for the given file, if missing.
   */
  private fun createParentDirectories(file: File) {
    val parent = file.parentFile
    if (!parent.exists() && !parent.mkdirs()) {
      throw IOException("${file.absolutePath} could not be created")
    }
  }
}
