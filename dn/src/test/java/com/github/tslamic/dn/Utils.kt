package com.github.tslamic.dn

import java.io.InputStream

const val DUMMY_ZIP = "hello.txt.zip"
const val DUMMY_ZIP_CONTENT = "Hello World\n"

fun resourceInputStream(resource: String): InputStream {
  val classloader = ClassLoader.getSystemClassLoader()
  return classloader.getResourceAsStream(resource)
}
