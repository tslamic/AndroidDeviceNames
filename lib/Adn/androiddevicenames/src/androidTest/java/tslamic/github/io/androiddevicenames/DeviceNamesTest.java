package tslamic.github.io.androiddevicenames;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.concurrent.TimeUnit;

public class DeviceNamesTest extends TestCase {

    private static final String FALLBACK = "fallback";

    private static final long DURATION_THRESHOLD =
            TimeUnit.NANOSECONDS.convert(10, TimeUnit.MILLISECONDS);

    public void testNull() throws Exception {
        final String result = DeviceNames.getDeviceName(null, FALLBACK);
        Assert.assertEquals(FALLBACK, result);
    }

    public void testEmpty() throws Exception {
        final String result = DeviceNames.getDeviceName("", FALLBACK);
        Assert.assertEquals(FALLBACK, result);
    }

    public void testDevice1() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-E970", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-E970", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice2() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-E971", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Optimus G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-E971", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice3() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I415", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Stratosphere II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I415", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice4() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I800", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 7.0", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I800", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice5() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N910W8", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N910W8", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice6() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-M830", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Rush", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-M830", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice7() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-R970", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-R970", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice8() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-E612g", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L5 Dual", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-E612g", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice9() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I777", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I777", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice10() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-T217S", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 3 7.0", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-T217S", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice11() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G870A", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5 Active", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SM-G870A", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice12() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Motorola_Electrify", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Electrify", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Motorola_Electrify", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice13() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("T-Mobile_myTouch_Q", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("T-Mobile myTouch Q", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "T-Mobile_myTouch_Q", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice14() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-T310", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 3 8.0", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-T310", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice15() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SHV-E300", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SHV-E300", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice16() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ASUS_Transformer_Pad_TF700T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("ASUS Transformer Pad TF700T", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ASUS_Transformer_Pad_TF700T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice17() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("DROID_BIONIC", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid Bionic", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "DROID_BIONIC", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice18() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G920V", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G920V", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice19() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Incredible_S", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Incredible S", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Incredible_S", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice20() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G920R", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G920R", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice21() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-LS980", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-LS980", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice22() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G920I", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G920I", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice23() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G920F", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G920F", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice24() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9295", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4 Active", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9295", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice25() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_One_M8", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One M8", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_One_M8", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice26() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-D710BST", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-D710BST", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice27() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D686", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G Pro Lite Dual", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D686", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice28() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T999", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T999", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice29() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C6833", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Z Ultra", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C6833", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice30() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("DROID_Pro", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid Pro", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "DROID_Pro", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice31() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("EVO", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Evo", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "EVO", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice32() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-N900A", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SM-N900A", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice33() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1080", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid Ultra", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1080", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice34() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Sensation_4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Sensation 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Sensation_4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice35() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("bq_Aquaris_5", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("bq Aquaris 5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "bq_Aquaris_5", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice36() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D5803", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Z3 Compact", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D5803", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice37() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Nexus_9", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Nexus 9", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Nexus_9", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice38() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Nexus_7", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Asus Nexus 7", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Nexus_7", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice39() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Nexus_6", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Nexus 6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Nexus_6", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice40() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Nexus_5", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Nexus 5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Nexus_5", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice41() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Nexus_4", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Google Nexus 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Nexus_4", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice42() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-P509", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus T", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-P509", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice43() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9000", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9000", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice44() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9001", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S Plus", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9001", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice45() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LGMS500", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus F6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LGMS500", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice46() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ASUS_T00J", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Asus ZenFone 5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ASUS_T00J", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice47() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-N8013", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 10.1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-N8013", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice48() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Nexus_S", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Nexus S", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Nexus_S", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice49() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-E411g", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L1 II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-E411g", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice50() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("google_sdk", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Android Emulator", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "google_sdk", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice51() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9305T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9305T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice52() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-N8010", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 10.1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-N8010", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice53() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGP312", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Tablet Z", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGP312", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice54() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I927", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Captivate Glide", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I927", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice55() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9070", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S Advance", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9070", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice56() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LGLS740", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Volt", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LGLS740", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice57() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1049", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1049", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice58() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ADR6350", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Droid Incredible 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ADR6350", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice59() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1045", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1045", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice60() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N910G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N910G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice61() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N910F", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N910F", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice62() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G9200", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G9200", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice63() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N7505", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 3 Neo", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N7505", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice64() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("myTouch_4G_Slide", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC myTouch 4G Slide", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "myTouch_4G_Slide", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice65() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G386T1", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Avant", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G386T1", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice66() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Nexus_S_4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Nexus S 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Nexus_S_4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice67() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I337", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I337", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice68() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N910P", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N910P", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice69() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Desire_HD_A9191", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Desire HD", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Desire_HD_A9191", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice70() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N910V", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N910V", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice71() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N910T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N910T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice72() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-T230NU", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-T230NU", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice73() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_7041X", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Alcatel One Touch Pop C7", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ALCATEL_ONE_TOUCH_7041X", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice74() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I605", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I605", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice75() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-N045", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-N045", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice76() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-I257M", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-I257M", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice77() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Desire", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Desire", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Desire", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice78() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-VM696", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus Elite", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-VM696", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice79() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G920A", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SM-G920A", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice80() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S5360", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Y", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S5360", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice81() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("MB886", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Atrix HD", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "MB886", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice82() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-P5210", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 3 10.1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-P5210", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice83() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-L710", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-L710", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice84() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D803", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("G2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D803", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice85() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-N7000", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-N7000", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice86() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G900R4", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G900R4", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice87() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-P769", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L9", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-P769", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice88() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-P760", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L9", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-P760", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice89() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9300T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9300T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice90() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D415", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L90", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D415", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice91() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9300", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9300", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice92() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("MOTWX435KT", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Triumph", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "MOTWX435KT", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice93() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D6603", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Z3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D6603", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice94() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T399", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Light", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T399", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice95() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G920T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G920T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice96() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC6435LVW", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Droid DNA", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC6435LVW", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice97() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-J021", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-J021", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice98() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Z970", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("ZTE ZMax", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Z970", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice99() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S5570", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S5570", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice100() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-P768", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L9", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-P768", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice101() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-L720", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-L720", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice102() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_PH39100", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Vivid 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_PH39100", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice103() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D6503", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Z2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D6503", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice104() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-I777M", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-I777M", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice105() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-I747M", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-I747M", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice106() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-N8000", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 10.1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-N8000", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice107() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC6500LVW", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC6500LVW", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice108() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-I757M", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-I757M", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice109() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HM_1SW", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Xiaomi Redmi", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HM_1SW", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice110() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("5860E", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Coolpad Quattro 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "5860E", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice111() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9063T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Grand Neo Duos", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9063T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice112() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N900W8", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N900W8", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice113() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T679", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Exhibit II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T679", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice114() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LGL55C", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG LGL55C", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LGL55C", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice115() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-S738C", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Centura", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-S738C", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice116() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-M820-BST", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Prevail", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-M820-BST", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice117() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9305", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9305", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice118() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S7580", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Trend Plus", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S7580", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice119() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Nexus_10", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Google Nexus 10", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Nexus_10", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice120() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LT25i", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia V", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LT25i", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice121() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-S720C", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Proclaim", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-S720C", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice122() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-E739", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG MyTouch e739", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-E739", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice123() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I959", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I959", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice124() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_VLE_U", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One S", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_VLE_U", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice125() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-R760", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-R760", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice126() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Transformer_Prime_TF201", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Asus Eee Pad Transformer Prime", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Transformer_Prime_TF201", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice127() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-M930BST", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Transform Ultra", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-M930BST", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice128() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I747", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I747", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice129() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I8160", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Ace 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I8160", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice130() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C6903", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Z1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C6903", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice131() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S5301L", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Pocket Plus", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S5301L", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice132() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-T530NU", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 4 10.1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-T530NU", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice133() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LGL34C", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus Fuel", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LGL34C", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice134() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LT26i", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia S", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LT26i", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice135() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Desire_S", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Desire S", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Desire_S", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice136() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-I727R", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-I727R", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice137() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("MI_3W", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Xiaomi Mi 3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "MI_3W", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice138() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("DROID_RAZR", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid Razr", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "DROID_RAZR", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice139() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Desire_C", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Desire C", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Desire_C", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice140() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N910C", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N910C", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice141() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Transformer_TF101", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Asus Eee Pad Transformer", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Transformer_TF101", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice142() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-MS910", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Esteem", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-MS910", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice143() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G3815", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Express II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G3815", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice144() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N900", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N900", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice145() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C5170", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Kyocera Hydro", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C5170", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice146() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("DROID2_GLOBAL", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid 2 Global", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "DROID2_GLOBAL", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice147() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C2105", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia L", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C2105", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice148() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_Fierce", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("ALCATEL ONE TOUCH Fierce", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ALCATEL_ONE_TOUCH_Fierce", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice149() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D5833", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Xperia Z3 Compact", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D5833", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice150() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G730A", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S3 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SM-G730A", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice151() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-T210R", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 3 7.0", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-T210R", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice152() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("VS985_4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G3 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "VS985_4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice153() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("N860", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("ZTE Warp N860", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "N860", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice154() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Kindle_Fire", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Kindle Fire", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Kindle_Fire", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice155() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-P7510", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-P7510", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice156() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I8190N", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I8190N", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice157() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I8190L", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S3 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I8190L", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice158() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ADR6400L", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Thunderbolt", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ADR6400L", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice159() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-D710", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Epic", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-D710", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice160() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SC-04E", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SC-04E", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice161() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G900RZWAUSC", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G900RZWAUSC", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice162() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("MB865", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Atrix 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "MB865", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice163() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Orange_Daytona", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Huawei Ascend G510", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Orange_Daytona", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice164() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("MB860", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Atrix 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "MB860", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice165() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9082", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Grand", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9082", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice166() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C1905", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia M", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C1905", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice167() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D620", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G2 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D620", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice168() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I527", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Mega", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I527", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice169() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-R530M", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-R530M", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice170() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-R530C", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-R530C", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice171() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("PC36100", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Evo 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "PC36100", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice172() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G925A", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6 Edge", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G925A", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice173() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-MS770", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Motion 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-MS770", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice174() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-R530U", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-R530U", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice175() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G900I", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G900I", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice176() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G900H", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G900H", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice177() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G900F", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G900F", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice178() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-N910A", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SM-N910A", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice179() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G900V", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G900V", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice180() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTCEVODesign4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Evo Design 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTCEVODesign4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice181() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G900T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G900T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice182() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G900P", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G900P", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice183() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-N035", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-N035", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice184() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-L710T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-L710T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice185() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_One", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_One", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice186() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Desire_610", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Desire 610", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Desire_610", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice187() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("PG06100", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC EVO Shift 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "PG06100", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice188() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I717", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I717", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice189() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("PantechP9070", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Pantech Burst", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "PantechP9070", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice190() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-M919", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-M919", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice191() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G925P", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6 Edge", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G925P", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice192() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I500", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Fascinate", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I500", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice193() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("PH44100", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Evo Design 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "PH44100", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice194() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_5035X", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Alcatel One Touch X Pop", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ALCATEL_ONE_TOUCH_5035X", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice195() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G860P", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5 Sport", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G860P", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice196() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-P999", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G2X P999", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-P999", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice197() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T889", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T889", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice198() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T999V", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T999V", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice199() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SC-03E", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SC-03E", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice200() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ST25i", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia U", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ST25i", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice201() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1254", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid Turbo", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1254", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice202() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Amaze_4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Amaze 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Amaze_4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice203() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T999L", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T999L", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice204() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I8190", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I8190", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice205() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("PG86100", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Evo 3D", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "PG86100", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice206() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("DROID_X2", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid X2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "DROID_X2", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice207() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-E425g", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L3 II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-E425g", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice208() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D805", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("G2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D805", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice209() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C6916", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Z1S", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C6916", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice210() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D802", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D802", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice211() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D801", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D801", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice212() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D800", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D800", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice213() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LT22i", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia P", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LT22i", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice214() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N9006", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N9006", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice215() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S5830", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Ace", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S5830", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice216() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-N7100", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-N7100", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice217() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("VS840_4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Lucid 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "VS840_4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice218() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-N7105", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-N7105", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice219() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-H815", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("G4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-H815", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice220() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N900P", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N900P", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice221() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N900V", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N900V", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice222() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N900T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N900T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice223() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-LG730", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Venice", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-LG730", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice224() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SHV-E250S", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SHV-E250S", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice225() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-L720T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-L720T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice226() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SHV-E250K", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SHV-E250K", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice227() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G7102", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Grand II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G7102", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice228() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("MB855", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Photon 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "MB855", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice229() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Galaxy_Nexus", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Nexus", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Galaxy_Nexus", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice230() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G900A", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SM-G900A", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice231() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Glacier", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Glacier", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Glacier", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice232() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-I317M", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-I317M", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice233() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("VS870_4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Lucid 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "VS870_4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice234() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I535", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I535", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice235() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D6653", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Z3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D6653", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice236() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G925F", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6 Edge", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G925F", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice237() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-L520", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-L520", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice238() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G925V", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6 Edge", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G925V", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice239() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-C800", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG myTouch Q", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-C800", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice240() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G925R", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6 Edge", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G925R", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice241() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("QMV7A", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Verizon Ellipsis 7", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "QMV7A", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice242() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-P3100", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-P3100", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice243() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9505", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9505", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice244() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9507", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9507", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice245() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9506", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9506", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice246() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I997", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Infuse 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I997", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice247() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9500", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9500", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice248() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ST21i", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Tipo", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ST21i", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice249() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_One_mini", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_One_mini", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice250() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I545", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I545", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice251() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1039", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1039", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice252() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S7560M", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Ace II X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S7560M", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice253() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1034", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1034", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice254() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1030", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1030", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice255() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1031", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1031", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice256() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1032", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1032", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice257() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1033", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1033", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice258() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("VS930_4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Spectrum 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "VS930_4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice259() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T769", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S Blaze", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T769", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice260() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D2316", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Xperia M2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D2316", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice261() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-N064", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-N064", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice262() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-LS840", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Viper", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-LS840", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice263() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S7562", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S Duos", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S7562", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice264() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I727", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Skyrocket", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I727", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice265() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HUAWEI_P6-U06", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Huawei Ascend P6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HUAWEI_P6-U06", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice266() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-I337M", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-I337M", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice267() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D2005", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia E1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D2005", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice268() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I435", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I435", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice269() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G9250", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6 Edge", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G9250", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice270() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-D710VMUB", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-D710VMUB", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice271() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTCEVOV4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Evo V 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTCEVOV4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice272() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("KFJWI", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Kindle Fire HD 8.9", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "KFJWI", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice273() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("VS920_4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Spectrum 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "VS920_4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice274() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT897", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Photo Q", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT897", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice275() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("A1-810", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Acer Iconia A1-810", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "A1-810", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice276() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C5302", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Xperia SP", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C5302", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice277() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C5303", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia SP", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C5303", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice278() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C5306", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Xperia SP", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C5306", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice279() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-D700", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Epic 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-D700", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice280() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Aquaris_E4.5", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("bq Aquaris E4.5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Aquaris_E4.5", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice281() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Droid", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Droid", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice282() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Desire_500", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Desire 500", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Desire_500", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice283() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G920W8", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G920W8", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice284() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I537", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4 Active", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I537", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice285() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LGMS323", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L70", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LGMS323", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice286() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("DROID4", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid 4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "DROID4", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice287() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-N5110", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 8.0", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-N5110", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice288() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("DROID2", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "DROID2", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice289() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("DROID3", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid 3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "DROID3", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice290() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T959V", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T959V", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice291() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SC-02C", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SC-02C", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice292() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-T800", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab S 10.5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-T800", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice293() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("L-01F", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("G2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "L-01F", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice294() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I897", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Captivate", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I897", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice295() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("831C", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One M8", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "831C", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice296() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-P5113", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsnung Galaxy Tab 2 10.1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-P5113", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice297() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SHV-E210S", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SHV-E210S", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice298() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-P5110", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-P5110", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice299() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Sensation_Z710e", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Sensation", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Sensation_Z710e", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice300() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-E980", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus G Pro", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-E980", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice301() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SHV-E210K", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SHV-E210K", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice302() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("bq_Aquaris_5_HD", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("bq Aquaris 5 HD", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "bq_Aquaris_5_HD", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice303() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-N9005", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-N9005", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice304() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9105P", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S2 Plus", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9105P", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice305() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I405", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Stratosphere", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I405", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice306() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCL21", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCL21", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice307() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S6310N", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Young", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S6310N", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice308() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1096", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1096", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice309() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1097", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1097", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice310() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1095", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1095", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice311() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I317", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SAMSUNG-SGH-I317", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice312() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("CUBOT_ONE", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Cubot One", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "CUBOT_ONE", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice313() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC6525LVW", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One M8", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC6525LVW", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice314() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("VS910_4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Revolution 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "VS910_4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice315() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("DROIDX", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "DROIDX", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice316() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T399N", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Light", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T399N", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice317() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ASUS_Transformer_Pad_TF300T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Asus Transformer Pad", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ASUS_Transformer_Pad_TF300T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice318() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G925T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6 Edge", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G925T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice319() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1060", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1060", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice320() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("9920", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Star Alps S9920", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "9920", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice321() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1068", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1068", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice322() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G800F", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G800F", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice323() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D5503", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Z1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D5503", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice324() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-L300", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Victory", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-L300", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice325() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("A0001", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("OnePlus One", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "A0001", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice326() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-LS970", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-LS970", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice327() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_One_S", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One S", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_One_S", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice328() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HUAWEI_G510-0251", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Huawei Ascend G510", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HUAWEI_G510-0251", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice329() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_One_V", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One V", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_One_V", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice330() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I510", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Droid Charge", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I510", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice331() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_One_X", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_One_X", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice332() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S5830i", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Ace", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S5830i", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice333() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ISW11SC", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ISW11SC", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice334() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_One_X+", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One X+", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_One_X+", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice335() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("VS980_4G", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "VS980_4G", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice336() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S6810P", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Fame", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S6810P", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice337() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("KFJWA", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Kindle Fire HD 8.9", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "KFJWA", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice338() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9100", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9100", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice339() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LGMS769", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L9", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LGMS769", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice340() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T989", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T989", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice341() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G900W8", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G900W8", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice342() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTCONE", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTCONE", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice343() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9197", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S4 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9197", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice344() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9195", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9195", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice345() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9192", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4 Mini Duos", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9192", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice346() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9190", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9190", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice347() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9210", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9210", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice348() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9198", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S4 Mini", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9198", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice349() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T989D", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T989D", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice350() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ST26i", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia J", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ST26i", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice351() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G925W8", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S6 Edge", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G925W8", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice352() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T599N", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Exhibit", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T599N", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice353() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SC-06D", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SC-06D", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice354() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G386T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Avant", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G386T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice355() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT907", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid Razr M", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT907", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice356() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LS670", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus S", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LS670", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice357() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I337", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I337", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice358() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("CM990", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Huawei Evolution III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "CM990", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice359() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LGLS990", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LGLS990", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice360() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-LS720", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus F3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-LS720", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice361() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9060", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Grand Neo", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9060", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice362() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I939", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I939", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice363() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1058", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1058", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice364() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-M840", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Prevail 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-M840", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice365() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1056", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1056", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice366() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1053", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto X", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1053", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice367() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-P3110", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-P3110", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice368() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-P3113", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Tab 2 7.0", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-P3113", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice369() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-E610", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L5", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-E610", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice370() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-R720", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Admire", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-R720", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice371() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1028", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1028", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice372() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-E440g", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L4 II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-E440g", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice373() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-I200", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Stellar", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-I200", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice374() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("XT1022", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Moto E", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "XT1022", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice375() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LT30p", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia T", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LT30p", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice376() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I8262", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Core", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I8262", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice377() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I8260", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Core", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I8260", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice378() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-P600", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note 10.1", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-P600", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice379() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HUAWEI_Y300-0100", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Huawei Ascend Y300", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HUAWEI_Y300-0100", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice380() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Xoom", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Xoom", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Xoom", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice381() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I8550L", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Win", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I8550L", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice382() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ADR6425LVW", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Rezound 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ADR6425LVW", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice383() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SHW-M250", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Galaxy S2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SHW-M250", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice384() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-L900", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-L900", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice385() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SCH-S968C", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S III", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SCH-S968C", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice386() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9100P", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9100P", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice387() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9100T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9100T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice388() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D850", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D850", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice389() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D851", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D851", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice390() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D852", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("G3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D852", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice391() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-D855", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG G3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-D855", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice392() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SM-G920P", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S6", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SM-G920P", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice393() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-S6310", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Young", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-S6310", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice394() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("N3", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Star NO.1 N3", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "N3", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice395() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C5155", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Kyocera Rise", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C5155", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice396() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-I9100M", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-I9100M", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice397() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("DROID_RAZR_HD", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Motorola Droid Razr HD", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "DROID_RAZR_HD", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice398() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D2305", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Xperia M2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D2305", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice399() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D2306", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Xperia M2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D2306", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice400() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("KFTT", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Kindle Fire HD 7", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "KFTT", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice401() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D2302", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Xperia M2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D2302", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice402() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("D2303", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia M2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "D2303", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice403() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("Desire_HD", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Desire HD", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "Desire_HD", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice404() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ADR6410LVW", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Droid Incredible 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ADR6410LVW", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice405() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("LG-E460", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus L5 II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "LG-E460", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice406() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ADR6330VW", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Rhyme", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ADR6330VW", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice407() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("T-Mobile_G2", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("T-Mobile G2", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "T-Mobile_G2", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice408() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-T959", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S Vibrant", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-T959", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice409() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_Desire_510", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Desire 510", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_Desire_510", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice410() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("HTC_PN071", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC One", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "HTC_PN071", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice411() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SGH-M919N", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy S4", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SGH-M919N", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice412() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C6606", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Z", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C6606", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice413() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("C6603", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Sony Xperia Z", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "C6603", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice414() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("VM670", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("LG Optimus V", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "VM670", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice415() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ADR6300", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("HTC Droid Incredible", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ADR6300", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice416() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("SPH-D600", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Conquer 4G", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "SPH-D600", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice417() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("ME173X", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Asus MeMO Pad HD 7", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "ME173X", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice418() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("GT-N7105T", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Samsung Galaxy Note II", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "GT-N7105T", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

    public void testDevice419() throws Exception {
        final long start = System.nanoTime();
        final String result = DeviceNames.getDeviceName("KFOT", FALLBACK);
        final long duration = System.nanoTime() - start;

        Assert.assertEquals("Kindle Fire", result);
        final String err = String.format("duration over threshold for %s: " +
                "expected: %d, actual: %d", "KFOT", DURATION_THRESHOLD, duration);
        Assert.assertTrue(err, duration < DURATION_THRESHOLD);
    }

}
