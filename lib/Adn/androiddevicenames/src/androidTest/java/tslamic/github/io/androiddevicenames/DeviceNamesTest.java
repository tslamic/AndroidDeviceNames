package tslamic.github.io.androiddevicenames;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DeviceNamesTest extends TestCase {

    private static final String FALLBACK = "fallback";

    public void testNull() throws Exception {
        final String result = DeviceNames.getDeviceName(null, FALLBACK);
        Assert.assertEquals(FALLBACK, result);
    }

    public void testEmpty() throws Exception {
        final String result = DeviceNames.getDeviceName("", FALLBACK);
        Assert.assertEquals(FALLBACK, result);
    }

    public void testActual() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G900RZWAUSC", FALLBACK);
        Assert.assertEquals("Galaxy S5", result);
    }

}
