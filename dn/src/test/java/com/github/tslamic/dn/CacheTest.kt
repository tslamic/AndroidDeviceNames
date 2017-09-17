package com.github.tslamic.dn

import android.content.Context
import android.content.SharedPreferences
import android.content.res.AssetManager
import com.github.tslamic.dn.impl.Cache
import com.github.tslamic.dn.impl.PREFS_NAME
import com.github.tslamic.dn.impl.PREFS_VERSION
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import org.mockito.ArgumentCaptor
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnit
import java.io.File

class CacheTest {
  @JvmField @Rule val folder = TemporaryFolder()
  @JvmField @Rule val mockito = MockitoJUnit.rule()!!

  @Mock private lateinit var context: Context
  @Mock private lateinit var assets: AssetManager
  @Mock private lateinit var prefs: SharedPreferences
  @Mock private lateinit var editor: SharedPreferences.Editor

  private lateinit var database: File
  private lateinit var cache: Cache

  @Before
  fun setUp() {
    `when`(context.getSharedPreferences(eq(PREFS_NAME), anyInt())).thenReturn(prefs)
    `when`(prefs.edit()).thenReturn(editor)
    `when`(context.assets).thenReturn(assets)

    database = folder.newFile()
    cache = Cache(context, database)
  }

  @Test
  fun getVersion() {
    val version = 123
    setMockVersion(version)
    assertThat(cache.getVersion()).isEqualTo(version)
  }

  @Test
  fun setVersion() {
    val name = ArgumentCaptor.forClass(String::class.java)
    val version = ArgumentCaptor.forClass(Int::class.java)
    `when`(editor.putInt(name.capture(), version.capture())).thenReturn(editor)

    cache.setCurrentVersion()

    assertThat(name.value).isEqualTo(PREFS_VERSION)
    assertThat(version.value).isEqualTo(BuildConfig.DATABASE_VERSION)
  }

  @Test
  fun isStale_returnsTrue() {
    setMockVersion(-1)
    assertThat(cache.isStale()).isTrue()
  }

  @Test
  fun isStale_returnsFalse() {
    setMockVersion(BuildConfig.DATABASE_VERSION)
    assertThat(cache.isStale()).isFalse()
  }

  @Test
  fun update() {
    setMockVersion(-1)

    val stream = resourceInputStream(DUMMY_ZIP)
    `when`(assets.open(ArgumentMatchers.anyString())).thenReturn(stream)
    `when`(editor.putInt(ArgumentMatchers.anyString(), ArgumentMatchers.anyInt()))
        .thenReturn(editor)

    val updated = cache.updateDatabase("")

    assertThat(updated).isTrue()
    assertThat(database.readText()).isEqualTo(DUMMY_ZIP_CONTENT)
    verify(editor, times(1))
        .putInt(PREFS_VERSION, BuildConfig.DATABASE_VERSION)
  }

  private fun setMockVersion(version: Int) {
    `when`(prefs.getInt(eq(PREFS_VERSION), eq(0))).thenReturn(version)
  }
}
