package com.github.tslamic.dn

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.nhaarman.mockito_kotlin.*
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DeviceNamesDatabaseTest {
  lateinit var sqlite: SQLiteDatabase
  lateinit var database: Database
  lateinit var deviceNames: DeviceNamesDatabase

  @Before
  fun setUp() {
    sqlite = mock()
    database = mock {
      on { instance() }.doReturn(sqlite)
    }
    deviceNames = DeviceNamesDatabaseImpl(database)
  }

  @Test fun open() {
    setSqliteOpen(true)
    deviceNames.open()
    verify(database, times(1)).copyFromAssets()
    verify(database, times(1)).instance()
  }

  @Test(expected = IllegalStateException::class) fun openTwice() {
    setSqliteOpen(true)
    deviceNames.open()
    deviceNames.open()
  }

  @Test(expected = IllegalStateException::class) fun openBadSqlite() {
    setSqliteOpen(false)
    deviceNames.open()
  }

  @Test(expected = IllegalStateException::class) fun deviceNamesClosed() {
    setSqliteOpen(false)
    deviceNames.deviceName("foo", "bar")
  }

  @Test fun deviceNames() {
    setSqliteOpen(true)
    whenever(sqlite.rawQuery(any(), anyArray())).thenReturn(mock<Cursor>())
    deviceNames.open()
    val result = deviceNames.deviceName("foo", "bar")
    Assert.assertEquals(result, "bar")
  }

  private fun setSqliteOpen(open: Boolean) {
    whenever(sqlite.isOpen).thenReturn(open)
  }
}
