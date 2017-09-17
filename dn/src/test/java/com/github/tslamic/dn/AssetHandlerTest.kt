package com.github.tslamic.dn

import com.github.tslamic.dn.impl.AssetHandler
import com.google.common.truth.Truth.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class AssetHandlerTest {
  @JvmField @Rule val folder = TemporaryFolder()

  @Test
  fun unzip_withZipFile_properlyUnzips() {
    val destination = folder.newFile("destination")
    val resource = resourceInputStream(DUMMY_ZIP)

    val unzipped = AssetHandler.unzip(resource, destination)

    assertThat(unzipped).isTrue()
    assertThat(destination.readText()).isEqualTo(DUMMY_ZIP_CONTENT)
  }
}
