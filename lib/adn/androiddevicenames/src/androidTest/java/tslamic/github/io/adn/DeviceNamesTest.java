package tslamic.github.io.adn;

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

    public void testNotListed() throws Exception {
        final String result = DeviceNames.getDeviceName("UNKNOWN", FALLBACK);
        Assert.assertEquals(FALLBACK, result);
    }

    public void testDevice1() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-E970", FALLBACK);
        Assert.assertEquals("LG Optimus G", result);
    }

    public void testDevice2() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-E971", FALLBACK);
        Assert.assertEquals("Optimus G", result);
    }

    public void testDevice3() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I415", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Stratosphere II", result);
    }

    public void testDevice4() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I800", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 7.0", result);
    }

    public void testDevice5() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N910W8", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 4", result);
    }

    public void testDevice6() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-M830", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Rush", result);
    }

    public void testDevice7() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-R970", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice8() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-E612g", FALLBACK);
        Assert.assertEquals("LG Optimus L5 Dual", result);
    }

    public void testDevice9() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I777", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S II", result);
    }

    public void testDevice10() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-T217S", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 3 7.0", result);
    }

    public void testDevice11() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G870A", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5 Active", result);
    }

    public void testDevice12() throws Exception {
        final String result = DeviceNames.getDeviceName("Motorola_Electrify", FALLBACK);
        Assert.assertEquals("Motorola Electrify", result);
    }

    public void testDevice13() throws Exception {
        final String result = DeviceNames.getDeviceName("T-Mobile_myTouch_Q", FALLBACK);
        Assert.assertEquals("T-Mobile myTouch Q", result);
    }

    public void testDevice14() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-T310", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 3 8.0", result);
    }

    public void testDevice15() throws Exception {
        final String result = DeviceNames.getDeviceName("SHV-E300", FALLBACK);
        Assert.assertEquals("Galaxy S4", result);
    }

    public void testDevice16() throws Exception {
        final String result = DeviceNames.getDeviceName("ASUS_Transformer_Pad_TF700T", FALLBACK);
        Assert.assertEquals("ASUS Transformer Pad TF700T", result);
    }

    public void testDevice17() throws Exception {
        final String result = DeviceNames.getDeviceName("DROID_BIONIC", FALLBACK);
        Assert.assertEquals("Motorola Droid Bionic", result);
    }

    public void testDevice18() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G920V", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S6", result);
    }

    public void testDevice19() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Incredible_S", FALLBACK);
        Assert.assertEquals("HTC Incredible S", result);
    }

    public void testDevice20() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G920R", FALLBACK);
        Assert.assertEquals("Galaxy S6", result);
    }

    public void testDevice21() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-LS980", FALLBACK);
        Assert.assertEquals("LG G2", result);
    }

    public void testDevice22() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G920I", FALLBACK);
        Assert.assertEquals("Galaxy S6", result);
    }

    public void testDevice23() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G920F", FALLBACK);
        Assert.assertEquals("Galaxy S6", result);
    }

    public void testDevice24() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9295", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4 Active", result);
    }

    public void testDevice25() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_One_M8", FALLBACK);
        Assert.assertEquals("HTC One M8", result);
    }

    public void testDevice26() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-D710BST", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S II", result);
    }

    public void testDevice27() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D686", FALLBACK);
        Assert.assertEquals("LG G Pro Lite Dual", result);
    }

    public void testDevice28() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T999", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice29() throws Exception {
        final String result = DeviceNames.getDeviceName("C6833", FALLBACK);
        Assert.assertEquals("Sony Xperia Z Ultra", result);
    }

    public void testDevice30() throws Exception {
        final String result = DeviceNames.getDeviceName("DROID_Pro", FALLBACK);
        Assert.assertEquals("Motorola Droid Pro", result);
    }

    public void testDevice31() throws Exception {
        final String result = DeviceNames.getDeviceName("EVO", FALLBACK);
        Assert.assertEquals("HTC Evo", result);
    }

    public void testDevice32() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-N900A", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 3", result);
    }

    public void testDevice33() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1080", FALLBACK);
        Assert.assertEquals("Motorola Droid Ultra", result);
    }

    public void testDevice34() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Sensation_4G", FALLBACK);
        Assert.assertEquals("HTC Sensation 4G", result);
    }

    public void testDevice35() throws Exception {
        final String result = DeviceNames.getDeviceName("bq_Aquaris_5", FALLBACK);
        Assert.assertEquals("bq Aquaris 5", result);
    }

    public void testDevice36() throws Exception {
        final String result = DeviceNames.getDeviceName("D5803", FALLBACK);
        Assert.assertEquals("Sony Xperia Z3 Compact", result);
    }

    public void testDevice37() throws Exception {
        final String result = DeviceNames.getDeviceName("Nexus_9", FALLBACK);
        Assert.assertEquals("Nexus 9", result);
    }

    public void testDevice38() throws Exception {
        final String result = DeviceNames.getDeviceName("Nexus_7", FALLBACK);
        Assert.assertEquals("Asus Nexus 7", result);
    }

    public void testDevice39() throws Exception {
        final String result = DeviceNames.getDeviceName("Nexus_6", FALLBACK);
        Assert.assertEquals("Nexus 6", result);
    }

    public void testDevice40() throws Exception {
        final String result = DeviceNames.getDeviceName("Nexus_5", FALLBACK);
        Assert.assertEquals("Nexus 5", result);
    }

    public void testDevice41() throws Exception {
        final String result = DeviceNames.getDeviceName("Nexus_4", FALLBACK);
        Assert.assertEquals("Google Nexus 4", result);
    }

    public void testDevice42() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-P509", FALLBACK);
        Assert.assertEquals("LG Optimus T", result);
    }

    public void testDevice43() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9000", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S", result);
    }

    public void testDevice44() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9001", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S Plus", result);
    }

    public void testDevice45() throws Exception {
        final String result = DeviceNames.getDeviceName("LGMS500", FALLBACK);
        Assert.assertEquals("LG Optimus F6", result);
    }

    public void testDevice46() throws Exception {
        final String result = DeviceNames.getDeviceName("ASUS_T00J", FALLBACK);
        Assert.assertEquals("Asus ZenFone 5", result);
    }

    public void testDevice47() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-N8013", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 10.1", result);
    }

    public void testDevice48() throws Exception {
        final String result = DeviceNames.getDeviceName("Nexus_S", FALLBACK);
        Assert.assertEquals("Samsung Nexus S", result);
    }

    public void testDevice49() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-E411g", FALLBACK);
        Assert.assertEquals("LG Optimus L1 II", result);
    }

    public void testDevice50() throws Exception {
        final String result = DeviceNames.getDeviceName("google_sdk", FALLBACK);
        Assert.assertEquals("Android Emulator", result);
    }

    public void testDevice51() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9305T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice52() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-N8010", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 10.1", result);
    }

    public void testDevice53() throws Exception {
        final String result = DeviceNames.getDeviceName("SGP312", FALLBACK);
        Assert.assertEquals("Sony Xperia Tablet Z", result);
    }

    public void testDevice54() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I927", FALLBACK);
        Assert.assertEquals("Samsung Captivate Glide", result);
    }

    public void testDevice55() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9070", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S Advance", result);
    }

    public void testDevice56() throws Exception {
        final String result = DeviceNames.getDeviceName("LGLS740", FALLBACK);
        Assert.assertEquals("LG Volt", result);
    }

    public void testDevice57() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1049", FALLBACK);
        Assert.assertEquals("Motorola Moto X", result);
    }

    public void testDevice58() throws Exception {
        final String result = DeviceNames.getDeviceName("ADR6350", FALLBACK);
        Assert.assertEquals("HTC Droid Incredible 2", result);
    }

    public void testDevice59() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1045", FALLBACK);
        Assert.assertEquals("Motorola Moto G", result);
    }

    public void testDevice60() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N910G", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 4", result);
    }

    public void testDevice61() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N910F", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 4", result);
    }

    public void testDevice62() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G9200", FALLBACK);
        Assert.assertEquals("Galaxy S6", result);
    }

    public void testDevice63() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N7505", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 3 Neo", result);
    }

    public void testDevice64() throws Exception {
        final String result = DeviceNames.getDeviceName("myTouch_4G_Slide", FALLBACK);
        Assert.assertEquals("HTC myTouch 4G Slide", result);
    }

    public void testDevice65() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G386T1", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Avant", result);
    }

    public void testDevice66() throws Exception {
        final String result = DeviceNames.getDeviceName("Nexus_S_4G", FALLBACK);
        Assert.assertEquals("Samsung Nexus S 4G", result);
    }

    public void testDevice67() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I337", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice68() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N910P", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 4", result);
    }

    public void testDevice69() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Desire_HD_A9191", FALLBACK);
        Assert.assertEquals("HTC Desire HD", result);
    }

    public void testDevice70() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N910V", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 4", result);
    }

    public void testDevice71() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N910T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 4", result);
    }

    public void testDevice72() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-T230NU", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 4", result);
    }

    public void testDevice73() throws Exception {
        final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_7041X", FALLBACK);
        Assert.assertEquals("Alcatel One Touch Pop C7", result);
    }

    public void testDevice74() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I605", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note II", result);
    }

    public void testDevice75() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-N045", FALLBACK);
        Assert.assertEquals("Galaxy S4", result);
    }

    public void testDevice76() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-I257M", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4 Mini", result);
    }

    public void testDevice77() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Desire", FALLBACK);
        Assert.assertEquals("HTC Desire", result);
    }

    public void testDevice78() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-VM696", FALLBACK);
        Assert.assertEquals("LG Optimus Elite", result);
    }

    public void testDevice79() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G920A", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S6", result);
    }

    public void testDevice80() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S5360", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Y", result);
    }

    public void testDevice81() throws Exception {
        final String result = DeviceNames.getDeviceName("MB886", FALLBACK);
        Assert.assertEquals("Motorola Atrix HD", result);
    }

    public void testDevice82() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-P5210", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 3 10.1", result);
    }

    public void testDevice83() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-L710", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice84() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D803", FALLBACK);
        Assert.assertEquals("G2", result);
    }

    public void testDevice85() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-N7000", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note", result);
    }

    public void testDevice86() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G900R4", FALLBACK);
        Assert.assertEquals("Galaxy S5", result);
    }

    public void testDevice87() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-P769", FALLBACK);
        Assert.assertEquals("LG Optimus L9", result);
    }

    public void testDevice88() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-P760", FALLBACK);
        Assert.assertEquals("LG Optimus L9", result);
    }

    public void testDevice89() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9300T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice90() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D415", FALLBACK);
        Assert.assertEquals("LG Optimus L90", result);
    }

    public void testDevice91() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9300", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice92() throws Exception {
        final String result = DeviceNames.getDeviceName("MOTWX435KT", FALLBACK);
        Assert.assertEquals("Motorola Triumph", result);
    }

    public void testDevice93() throws Exception {
        final String result = DeviceNames.getDeviceName("D6603", FALLBACK);
        Assert.assertEquals("Sony Xperia Z3", result);
    }

    public void testDevice94() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T399", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Light", result);
    }

    public void testDevice95() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G920T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S6", result);
    }

    public void testDevice96() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC6435LVW", FALLBACK);
        Assert.assertEquals("HTC Droid DNA", result);
    }

    public void testDevice97() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-J021", FALLBACK);
        Assert.assertEquals("Galaxy S3", result);
    }

    public void testDevice98() throws Exception {
        final String result = DeviceNames.getDeviceName("Z970", FALLBACK);
        Assert.assertEquals("ZTE ZMax", result);
    }

    public void testDevice99() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S5570", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Mini", result);
    }

    public void testDevice100() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-P768", FALLBACK);
        Assert.assertEquals("LG Optimus L9", result);
    }

    public void testDevice101() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-L720", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice102() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_PH39100", FALLBACK);
        Assert.assertEquals("HTC Vivid 4G", result);
    }

    public void testDevice103() throws Exception {
        final String result = DeviceNames.getDeviceName("D6503", FALLBACK);
        Assert.assertEquals("Sony Xperia Z2", result);
    }

    public void testDevice104() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-I777M", FALLBACK);
        Assert.assertEquals("Galaxy S2", result);
    }

    public void testDevice105() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-I747M", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice106() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-N8000", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 10.1", result);
    }

    public void testDevice107() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC6500LVW", FALLBACK);
        Assert.assertEquals("HTC One", result);
    }

    public void testDevice108() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-I757M", FALLBACK);
        Assert.assertEquals("Galaxy S2", result);
    }

    public void testDevice109() throws Exception {
        final String result = DeviceNames.getDeviceName("HM_1SW", FALLBACK);
        Assert.assertEquals("Xiaomi Redmi", result);
    }

    public void testDevice110() throws Exception {
        final String result = DeviceNames.getDeviceName("5860E", FALLBACK);
        Assert.assertEquals("Coolpad Quattro 4G", result);
    }

    public void testDevice111() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9063T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Grand Neo Duos", result);
    }

    public void testDevice112() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N900W8", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 3", result);
    }

    public void testDevice113() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T679", FALLBACK);
        Assert.assertEquals("Samsung Exhibit II", result);
    }

    public void testDevice114() throws Exception {
        final String result = DeviceNames.getDeviceName("LGL55C", FALLBACK);
        Assert.assertEquals("LG LGL55C", result);
    }

    public void testDevice115() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-S738C", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Centura", result);
    }

    public void testDevice116() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-M820-BST", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Prevail", result);
    }

    public void testDevice117() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9305", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice118() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S7580", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Trend Plus", result);
    }

    public void testDevice119() throws Exception {
        final String result = DeviceNames.getDeviceName("Nexus_10", FALLBACK);
        Assert.assertEquals("Google Nexus 10", result);
    }

    public void testDevice120() throws Exception {
        final String result = DeviceNames.getDeviceName("LT25i", FALLBACK);
        Assert.assertEquals("Sony Xperia V", result);
    }

    public void testDevice121() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-S720C", FALLBACK);
        Assert.assertEquals("Samsung Proclaim", result);
    }

    public void testDevice122() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-E739", FALLBACK);
        Assert.assertEquals("LG MyTouch e739", result);
    }

    public void testDevice123() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I959", FALLBACK);
        Assert.assertEquals("Galaxy S4", result);
    }

    public void testDevice124() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_VLE_U", FALLBACK);
        Assert.assertEquals("HTC One S", result);
    }

    public void testDevice125() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-R760", FALLBACK);
        Assert.assertEquals("Galaxy S2", result);
    }

    public void testDevice126() throws Exception {
        final String result = DeviceNames.getDeviceName("Transformer_Prime_TF201", FALLBACK);
        Assert.assertEquals("Asus Eee Pad Transformer Prime", result);
    }

    public void testDevice127() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-M930BST", FALLBACK);
        Assert.assertEquals("Samsung Transform Ultra", result);
    }

    public void testDevice128() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I747", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice129() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I8160", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Ace 2", result);
    }

    public void testDevice130() throws Exception {
        final String result = DeviceNames.getDeviceName("C6903", FALLBACK);
        Assert.assertEquals("Sony Xperia Z1", result);
    }

    public void testDevice131() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S5301L", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Pocket Plus", result);
    }

    public void testDevice132() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-T530NU", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 4 10.1", result);
    }

    public void testDevice133() throws Exception {
        final String result = DeviceNames.getDeviceName("LGL34C", FALLBACK);
        Assert.assertEquals("LG Optimus Fuel", result);
    }

    public void testDevice134() throws Exception {
        final String result = DeviceNames.getDeviceName("LT26i", FALLBACK);
        Assert.assertEquals("Sony Xperia S", result);
    }

    public void testDevice135() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Desire_S", FALLBACK);
        Assert.assertEquals("HTC Desire S", result);
    }

    public void testDevice136() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-I727R", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S II", result);
    }

    public void testDevice137() throws Exception {
        final String result = DeviceNames.getDeviceName("MI_3W", FALLBACK);
        Assert.assertEquals("Xiaomi Mi 3", result);
    }

    public void testDevice138() throws Exception {
        final String result = DeviceNames.getDeviceName("DROID_RAZR", FALLBACK);
        Assert.assertEquals("Motorola Droid Razr", result);
    }

    public void testDevice139() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Desire_C", FALLBACK);
        Assert.assertEquals("HTC Desire C", result);
    }

    public void testDevice140() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N910C", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 4", result);
    }

    public void testDevice141() throws Exception {
        final String result = DeviceNames.getDeviceName("Transformer_TF101", FALLBACK);
        Assert.assertEquals("Asus Eee Pad Transformer", result);
    }

    public void testDevice142() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-MS910", FALLBACK);
        Assert.assertEquals("LG Esteem", result);
    }

    public void testDevice143() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G3815", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Express II", result);
    }

    public void testDevice144() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N900", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 3", result);
    }

    public void testDevice145() throws Exception {
        final String result = DeviceNames.getDeviceName("C5170", FALLBACK);
        Assert.assertEquals("Kyocera Hydro", result);
    }

    public void testDevice146() throws Exception {
        final String result = DeviceNames.getDeviceName("DROID2_GLOBAL", FALLBACK);
        Assert.assertEquals("Motorola Droid 2 Global", result);
    }

    public void testDevice147() throws Exception {
        final String result = DeviceNames.getDeviceName("C2105", FALLBACK);
        Assert.assertEquals("Sony Xperia L", result);
    }

    public void testDevice148() throws Exception {
        final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_Fierce", FALLBACK);
        Assert.assertEquals("ALCATEL ONE TOUCH Fierce", result);
    }

    public void testDevice149() throws Exception {
        final String result = DeviceNames.getDeviceName("D5833", FALLBACK);
        Assert.assertEquals("Xperia Z3 Compact", result);
    }

    public void testDevice150() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G730A", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S3 Mini", result);
    }

    public void testDevice151() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-T210R", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 3 7.0", result);
    }

    public void testDevice152() throws Exception {
        final String result = DeviceNames.getDeviceName("VS985_4G", FALLBACK);
        Assert.assertEquals("LG G3 4G", result);
    }

    public void testDevice153() throws Exception {
        final String result = DeviceNames.getDeviceName("N860", FALLBACK);
        Assert.assertEquals("ZTE Warp N860", result);
    }

    public void testDevice154() throws Exception {
        final String result = DeviceNames.getDeviceName("Kindle_Fire", FALLBACK);
        Assert.assertEquals("Kindle Fire", result);
    }

    public void testDevice155() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-P7510", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 10.1", result);
    }

    public void testDevice156() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I8190N", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III Mini", result);
    }

    public void testDevice157() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I8190L", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S3 Mini", result);
    }

    public void testDevice158() throws Exception {
        final String result = DeviceNames.getDeviceName("ADR6400L", FALLBACK);
        Assert.assertEquals("HTC Thunderbolt", result);
    }

    public void testDevice159() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-D710", FALLBACK);
        Assert.assertEquals("Samsung Epic", result);
    }

    public void testDevice160() throws Exception {
        final String result = DeviceNames.getDeviceName("SC-04E", FALLBACK);
        Assert.assertEquals("Galaxy S4", result);
    }

    public void testDevice161() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G900RZWAUSC", FALLBACK);
        Assert.assertEquals("Galaxy S5", result);
    }

    public void testDevice162() throws Exception {
        final String result = DeviceNames.getDeviceName("MB865", FALLBACK);
        Assert.assertEquals("Motorola Atrix 2", result);
    }

    public void testDevice163() throws Exception {
        final String result = DeviceNames.getDeviceName("Orange_Daytona", FALLBACK);
        Assert.assertEquals("Huawei Ascend G510", result);
    }

    public void testDevice164() throws Exception {
        final String result = DeviceNames.getDeviceName("MB860", FALLBACK);
        Assert.assertEquals("Motorola Atrix 4G", result);
    }

    public void testDevice165() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9082", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Grand", result);
    }

    public void testDevice166() throws Exception {
        final String result = DeviceNames.getDeviceName("C1905", FALLBACK);
        Assert.assertEquals("Sony Xperia M", result);
    }

    public void testDevice167() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D620", FALLBACK);
        Assert.assertEquals("LG G2 Mini", result);
    }

    public void testDevice168() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I527", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Mega", result);
    }

    public void testDevice169() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-R530M", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice170() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-R530C", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S3", result);
    }

    public void testDevice171() throws Exception {
        final String result = DeviceNames.getDeviceName("PC36100", FALLBACK);
        Assert.assertEquals("HTC Evo 4G", result);
    }

    public void testDevice172() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G925A", FALLBACK);
        Assert.assertEquals("Galaxy S6 Edge", result);
    }

    public void testDevice173() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-MS770", FALLBACK);
        Assert.assertEquals("LG Motion 4G", result);
    }

    public void testDevice174() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-R530U", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice175() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G900I", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5", result);
    }

    public void testDevice176() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G900H", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5", result);
    }

    public void testDevice177() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G900F", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5", result);
    }

    public void testDevice178() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-N910A", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 4", result);
    }

    public void testDevice179() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G900V", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5", result);
    }

    public void testDevice180() throws Exception {
        final String result = DeviceNames.getDeviceName("HTCEVODesign4G", FALLBACK);
        Assert.assertEquals("HTC Evo Design 4G", result);
    }

    public void testDevice181() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G900T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5", result);
    }

    public void testDevice182() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G900P", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5", result);
    }

    public void testDevice183() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-N035", FALLBACK);
        Assert.assertEquals("Galaxy S3", result);
    }

    public void testDevice184() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-L710T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice185() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_One", FALLBACK);
        Assert.assertEquals("HTC One", result);
    }

    public void testDevice186() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Desire_610", FALLBACK);
        Assert.assertEquals("HTC Desire 610", result);
    }

    public void testDevice187() throws Exception {
        final String result = DeviceNames.getDeviceName("PG06100", FALLBACK);
        Assert.assertEquals("HTC EVO Shift 4G", result);
    }

    public void testDevice188() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I717", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note", result);
    }

    public void testDevice189() throws Exception {
        final String result = DeviceNames.getDeviceName("PantechP9070", FALLBACK);
        Assert.assertEquals("Pantech Burst", result);
    }

    public void testDevice190() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-M919", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice191() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G925P", FALLBACK);
        Assert.assertEquals("Galaxy S6 Edge", result);
    }

    public void testDevice192() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I500", FALLBACK);
        Assert.assertEquals("Samsung Fascinate", result);
    }

    public void testDevice193() throws Exception {
        final String result = DeviceNames.getDeviceName("PH44100", FALLBACK);
        Assert.assertEquals("HTC Evo Design 4G", result);
    }

    public void testDevice194() throws Exception {
        final String result = DeviceNames.getDeviceName("ALCATEL_ONE_TOUCH_5035X", FALLBACK);
        Assert.assertEquals("Alcatel One Touch X Pop", result);
    }

    public void testDevice195() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G860P", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5 Sport", result);
    }

    public void testDevice196() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-P999", FALLBACK);
        Assert.assertEquals("LG G2X P999", result);
    }

    public void testDevice197() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T889", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note II", result);
    }

    public void testDevice198() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T999V", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice199() throws Exception {
        final String result = DeviceNames.getDeviceName("SC-03E", FALLBACK);
        Assert.assertEquals("Galaxy S3", result);
    }

    public void testDevice200() throws Exception {
        final String result = DeviceNames.getDeviceName("ST25i", FALLBACK);
        Assert.assertEquals("Sony Xperia U", result);
    }

    public void testDevice201() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1254", FALLBACK);
        Assert.assertEquals("Motorola Droid Turbo", result);
    }

    public void testDevice202() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Amaze_4G", FALLBACK);
        Assert.assertEquals("HTC Amaze 4G", result);
    }

    public void testDevice203() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T999L", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice204() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I8190", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III Mini", result);
    }

    public void testDevice205() throws Exception {
        final String result = DeviceNames.getDeviceName("PG86100", FALLBACK);
        Assert.assertEquals("HTC Evo 3D", result);
    }

    public void testDevice206() throws Exception {
        final String result = DeviceNames.getDeviceName("DROID_X2", FALLBACK);
        Assert.assertEquals("Motorola Droid X2", result);
    }

    public void testDevice207() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-E425g", FALLBACK);
        Assert.assertEquals("LG Optimus L3 II", result);
    }

    public void testDevice208() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D805", FALLBACK);
        Assert.assertEquals("G2", result);
    }

    public void testDevice209() throws Exception {
        final String result = DeviceNames.getDeviceName("C6916", FALLBACK);
        Assert.assertEquals("Sony Xperia Z1S", result);
    }

    public void testDevice210() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D802", FALLBACK);
        Assert.assertEquals("LG G2", result);
    }

    public void testDevice211() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D801", FALLBACK);
        Assert.assertEquals("LG G2", result);
    }

    public void testDevice212() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D800", FALLBACK);
        Assert.assertEquals("LG G2", result);
    }

    public void testDevice213() throws Exception {
        final String result = DeviceNames.getDeviceName("LT22i", FALLBACK);
        Assert.assertEquals("Sony Xperia P", result);
    }

    public void testDevice214() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N9006", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 3", result);
    }

    public void testDevice215() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S5830", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Ace", result);
    }

    public void testDevice216() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-N7100", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note II", result);
    }

    public void testDevice217() throws Exception {
        final String result = DeviceNames.getDeviceName("VS840_4G", FALLBACK);
        Assert.assertEquals("LG Lucid 4G", result);
    }

    public void testDevice218() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-N7105", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note II", result);
    }

    public void testDevice219() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-H815", FALLBACK);
        Assert.assertEquals("G4", result);
    }

    public void testDevice220() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N900P", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 3", result);
    }

    public void testDevice221() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N900V", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 3", result);
    }

    public void testDevice222() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N900T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 3", result);
    }

    public void testDevice223() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-LG730", FALLBACK);
        Assert.assertEquals("LG Venice", result);
    }

    public void testDevice224() throws Exception {
        final String result = DeviceNames.getDeviceName("SHV-E250S", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note II", result);
    }

    public void testDevice225() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-L720T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice226() throws Exception {
        final String result = DeviceNames.getDeviceName("SHV-E250K", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 2", result);
    }

    public void testDevice227() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G7102", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Grand II", result);
    }

    public void testDevice228() throws Exception {
        final String result = DeviceNames.getDeviceName("MB855", FALLBACK);
        Assert.assertEquals("Motorola Photon 4G", result);
    }

    public void testDevice229() throws Exception {
        final String result = DeviceNames.getDeviceName("Galaxy_Nexus", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Nexus", result);
    }

    public void testDevice230() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SM-G900A", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5", result);
    }

    public void testDevice231() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Glacier", FALLBACK);
        Assert.assertEquals("HTC Glacier", result);
    }

    public void testDevice232() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-I317M", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note II", result);
    }

    public void testDevice233() throws Exception {
        final String result = DeviceNames.getDeviceName("VS870_4G", FALLBACK);
        Assert.assertEquals("LG Lucid 2", result);
    }

    public void testDevice234() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I535", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice235() throws Exception {
        final String result = DeviceNames.getDeviceName("D6653", FALLBACK);
        Assert.assertEquals("Sony Xperia Z3", result);
    }

    public void testDevice236() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G925F", FALLBACK);
        Assert.assertEquals("Galaxy S6 Edge", result);
    }

    public void testDevice237() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-L520", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4 Mini", result);
    }

    public void testDevice238() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G925V", FALLBACK);
        Assert.assertEquals("Galaxy S6 Edge", result);
    }

    public void testDevice239() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-C800", FALLBACK);
        Assert.assertEquals("LG myTouch Q", result);
    }

    public void testDevice240() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G925R", FALLBACK);
        Assert.assertEquals("Galaxy S6 Edge", result);
    }

    public void testDevice241() throws Exception {
        final String result = DeviceNames.getDeviceName("QMV7A", FALLBACK);
        Assert.assertEquals("Verizon Ellipsis 7", result);
    }

    public void testDevice242() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-P3100", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 2", result);
    }

    public void testDevice243() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9505", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice244() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9507", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice245() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9506", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice246() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I997", FALLBACK);
        Assert.assertEquals("Samsung Infuse 4G", result);
    }

    public void testDevice247() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9500", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice248() throws Exception {
        final String result = DeviceNames.getDeviceName("ST21i", FALLBACK);
        Assert.assertEquals("Sony Xperia Tipo", result);
    }

    public void testDevice249() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_One_mini", FALLBACK);
        Assert.assertEquals("HTC One mini", result);
    }

    public void testDevice250() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I545", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice251() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1039", FALLBACK);
        Assert.assertEquals("Motorola Moto G", result);
    }

    public void testDevice252() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S7560M", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Ace II X", result);
    }

    public void testDevice253() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1034", FALLBACK);
        Assert.assertEquals("Motorola Moto G", result);
    }

    public void testDevice254() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1030", FALLBACK);
        Assert.assertEquals("Motorola Droid Mini", result);
    }

    public void testDevice255() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1031", FALLBACK);
        Assert.assertEquals("Motorola Moto G", result);
    }

    public void testDevice256() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1032", FALLBACK);
        Assert.assertEquals("Motorola Moto G", result);
    }

    public void testDevice257() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1033", FALLBACK);
        Assert.assertEquals("Motorola Moto G", result);
    }

    public void testDevice258() throws Exception {
        final String result = DeviceNames.getDeviceName("VS930_4G", FALLBACK);
        Assert.assertEquals("LG Spectrum 2", result);
    }

    public void testDevice259() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T769", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S Blaze", result);
    }

    public void testDevice260() throws Exception {
        final String result = DeviceNames.getDeviceName("D2316", FALLBACK);
        Assert.assertEquals("Xperia M2", result);
    }

    public void testDevice261() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-N064", FALLBACK);
        Assert.assertEquals("Galaxy S3", result);
    }

    public void testDevice262() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-LS840", FALLBACK);
        Assert.assertEquals("LG Viper", result);
    }

    public void testDevice263() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S7562", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S Duos", result);
    }

    public void testDevice264() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I727", FALLBACK);
        Assert.assertEquals("Samsung Skyrocket", result);
    }

    public void testDevice265() throws Exception {
        final String result = DeviceNames.getDeviceName("HUAWEI_P6-U06", FALLBACK);
        Assert.assertEquals("Huawei Ascend P6", result);
    }

    public void testDevice266() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-I337M", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice267() throws Exception {
        final String result = DeviceNames.getDeviceName("D2005", FALLBACK);
        Assert.assertEquals("Sony Xperia E1", result);
    }

    public void testDevice268() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I435", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4 Mini", result);
    }

    public void testDevice269() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G9250", FALLBACK);
        Assert.assertEquals("Galaxy S6 Edge", result);
    }

    public void testDevice270() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-D710VMUB", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S II", result);
    }

    public void testDevice271() throws Exception {
        final String result = DeviceNames.getDeviceName("HTCEVOV4G", FALLBACK);
        Assert.assertEquals("HTC Evo V 4G", result);
    }

    public void testDevice272() throws Exception {
        final String result = DeviceNames.getDeviceName("KFJWI", FALLBACK);
        Assert.assertEquals("Kindle Fire HD 8.9", result);
    }

    public void testDevice273() throws Exception {
        final String result = DeviceNames.getDeviceName("VS920_4G", FALLBACK);
        Assert.assertEquals("LG Spectrum 4G", result);
    }

    public void testDevice274() throws Exception {
        final String result = DeviceNames.getDeviceName("XT897", FALLBACK);
        Assert.assertEquals("Motorola Photo Q", result);
    }

    public void testDevice275() throws Exception {
        final String result = DeviceNames.getDeviceName("A1-810", FALLBACK);
        Assert.assertEquals("Acer Iconia A1-810", result);
    }

    public void testDevice276() throws Exception {
        final String result = DeviceNames.getDeviceName("C5302", FALLBACK);
        Assert.assertEquals("Xperia SP", result);
    }

    public void testDevice277() throws Exception {
        final String result = DeviceNames.getDeviceName("C5303", FALLBACK);
        Assert.assertEquals("Sony Xperia SP", result);
    }

    public void testDevice278() throws Exception {
        final String result = DeviceNames.getDeviceName("C5306", FALLBACK);
        Assert.assertEquals("Xperia SP", result);
    }

    public void testDevice279() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-D700", FALLBACK);
        Assert.assertEquals("Samsung Epic 4G", result);
    }

    public void testDevice280() throws Exception {
        final String result = DeviceNames.getDeviceName("Aquaris_E4.5", FALLBACK);
        Assert.assertEquals("bq Aquaris E4.5", result);
    }

    public void testDevice281() throws Exception {
        final String result = DeviceNames.getDeviceName("Droid", FALLBACK);
        Assert.assertEquals("Motorola Droid", result);
    }

    public void testDevice282() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Desire_500", FALLBACK);
        Assert.assertEquals("HTC Desire 500", result);
    }

    public void testDevice283() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G920W8", FALLBACK);
        Assert.assertEquals("Galaxy S6", result);
    }

    public void testDevice284() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I537", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4 Active", result);
    }

    public void testDevice285() throws Exception {
        final String result = DeviceNames.getDeviceName("LGMS323", FALLBACK);
        Assert.assertEquals("LG Optimus L70", result);
    }

    public void testDevice286() throws Exception {
        final String result = DeviceNames.getDeviceName("DROID4", FALLBACK);
        Assert.assertEquals("Motorola Droid 4", result);
    }

    public void testDevice287() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-N5110", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 8.0", result);
    }

    public void testDevice288() throws Exception {
        final String result = DeviceNames.getDeviceName("DROID2", FALLBACK);
        Assert.assertEquals("Motorola Droid 2", result);
    }

    public void testDevice289() throws Exception {
        final String result = DeviceNames.getDeviceName("DROID3", FALLBACK);
        Assert.assertEquals("Motorola Droid 3", result);
    }

    public void testDevice290() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T959V", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S 4G", result);
    }

    public void testDevice291() throws Exception {
        final String result = DeviceNames.getDeviceName("SC-02C", FALLBACK);
        Assert.assertEquals("Galaxy S2", result);
    }

    public void testDevice292() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-T800", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab S 10.5", result);
    }

    public void testDevice293() throws Exception {
        final String result = DeviceNames.getDeviceName("L-01F", FALLBACK);
        Assert.assertEquals("G2", result);
    }

    public void testDevice294() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I897", FALLBACK);
        Assert.assertEquals("Samsung Captivate", result);
    }

    public void testDevice295() throws Exception {
        final String result = DeviceNames.getDeviceName("831C", FALLBACK);
        Assert.assertEquals("HTC One M8", result);
    }

    public void testDevice296() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-P5113", FALLBACK);
        Assert.assertEquals("Samsnung Galaxy Tab 2 10.1", result);
    }

    public void testDevice297() throws Exception {
        final String result = DeviceNames.getDeviceName("SHV-E210S", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice298() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-P5110", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 2", result);
    }

    public void testDevice299() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Sensation_Z710e", FALLBACK);
        Assert.assertEquals("HTC Sensation", result);
    }

    public void testDevice300() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-E980", FALLBACK);
        Assert.assertEquals("LG Optimus G Pro", result);
    }

    public void testDevice301() throws Exception {
        final String result = DeviceNames.getDeviceName("SHV-E210K", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S3", result);
    }

    public void testDevice302() throws Exception {
        final String result = DeviceNames.getDeviceName("bq_Aquaris_5_HD", FALLBACK);
        Assert.assertEquals("bq Aquaris 5 HD", result);
    }

    public void testDevice303() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-N9005", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 3", result);
    }

    public void testDevice304() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9105P", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S2 Plus", result);
    }

    public void testDevice305() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I405", FALLBACK);
        Assert.assertEquals("Samsung Stratosphere", result);
    }

    public void testDevice306() throws Exception {
        final String result = DeviceNames.getDeviceName("SCL21", FALLBACK);
        Assert.assertEquals("Galaxy S3", result);
    }

    public void testDevice307() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S6310N", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Young", result);
    }

    public void testDevice308() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1096", FALLBACK);
        Assert.assertEquals("Motorola Moto X", result);
    }

    public void testDevice309() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1097", FALLBACK);
        Assert.assertEquals("Motorola Moto X", result);
    }

    public void testDevice310() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1095", FALLBACK);
        Assert.assertEquals("Motorola Moto X", result);
    }

    public void testDevice311() throws Exception {
        final String result = DeviceNames.getDeviceName("SAMSUNG-SGH-I317", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note II", result);
    }

    public void testDevice312() throws Exception {
        final String result = DeviceNames.getDeviceName("CUBOT_ONE", FALLBACK);
        Assert.assertEquals("Cubot One", result);
    }

    public void testDevice313() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC6525LVW", FALLBACK);
        Assert.assertEquals("HTC One M8", result);
    }

    public void testDevice314() throws Exception {
        final String result = DeviceNames.getDeviceName("VS910_4G", FALLBACK);
        Assert.assertEquals("LG Revolution 4G", result);
    }

    public void testDevice315() throws Exception {
        final String result = DeviceNames.getDeviceName("DROIDX", FALLBACK);
        Assert.assertEquals("Motorola Droid X", result);
    }

    public void testDevice316() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T399N", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Light", result);
    }

    public void testDevice317() throws Exception {
        final String result = DeviceNames.getDeviceName("ASUS_Transformer_Pad_TF300T", FALLBACK);
        Assert.assertEquals("Asus Transformer Pad", result);
    }

    public void testDevice318() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G925T", FALLBACK);
        Assert.assertEquals("Galaxy S6 Edge", result);
    }

    public void testDevice319() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1060", FALLBACK);
        Assert.assertEquals("Motorola Moto X", result);
    }

    public void testDevice320() throws Exception {
        final String result = DeviceNames.getDeviceName("9920", FALLBACK);
        Assert.assertEquals("Star Alps S9920", result);
    }

    public void testDevice321() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1068", FALLBACK);
        Assert.assertEquals("Motorola Moto G", result);
    }

    public void testDevice322() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G800F", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5 Mini", result);
    }

    public void testDevice323() throws Exception {
        final String result = DeviceNames.getDeviceName("D5503", FALLBACK);
        Assert.assertEquals("Sony Xperia Z1", result);
    }

    public void testDevice324() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-L300", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Victory", result);
    }

    public void testDevice325() throws Exception {
        final String result = DeviceNames.getDeviceName("A0001", FALLBACK);
        Assert.assertEquals("OnePlus One", result);
    }

    public void testDevice326() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-LS970", FALLBACK);
        Assert.assertEquals("LG Optimus G", result);
    }

    public void testDevice327() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_One_S", FALLBACK);
        Assert.assertEquals("HTC One S", result);
    }

    public void testDevice328() throws Exception {
        final String result = DeviceNames.getDeviceName("HUAWEI_G510-0251", FALLBACK);
        Assert.assertEquals("Huawei Ascend G510", result);
    }

    public void testDevice329() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_One_V", FALLBACK);
        Assert.assertEquals("HTC One V", result);
    }

    public void testDevice330() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I510", FALLBACK);
        Assert.assertEquals("Samsung Droid Charge", result);
    }

    public void testDevice331() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_One_X", FALLBACK);
        Assert.assertEquals("HTC One X", result);
    }

    public void testDevice332() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S5830i", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Ace", result);
    }

    public void testDevice333() throws Exception {
        final String result = DeviceNames.getDeviceName("ISW11SC", FALLBACK);
        Assert.assertEquals("Galaxy S2", result);
    }

    public void testDevice334() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_One_X+", FALLBACK);
        Assert.assertEquals("HTC One X+", result);
    }

    public void testDevice335() throws Exception {
        final String result = DeviceNames.getDeviceName("VS980_4G", FALLBACK);
        Assert.assertEquals("LG G2", result);
    }

    public void testDevice336() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S6810P", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Fame", result);
    }

    public void testDevice337() throws Exception {
        final String result = DeviceNames.getDeviceName("KFJWA", FALLBACK);
        Assert.assertEquals("Kindle Fire HD 8.9", result);
    }

    public void testDevice338() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9100", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S II", result);
    }

    public void testDevice339() throws Exception {
        final String result = DeviceNames.getDeviceName("LGMS769", FALLBACK);
        Assert.assertEquals("LG Optimus L9", result);
    }

    public void testDevice340() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T989", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S II", result);
    }

    public void testDevice341() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G900W8", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S5", result);
    }

    public void testDevice342() throws Exception {
        final String result = DeviceNames.getDeviceName("HTCONE", FALLBACK);
        Assert.assertEquals("HTC One", result);
    }

    public void testDevice343() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9197", FALLBACK);
        Assert.assertEquals("Galaxy S4 Mini", result);
    }

    public void testDevice344() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9195", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4 Mini", result);
    }

    public void testDevice345() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9192", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4 Mini Duos", result);
    }

    public void testDevice346() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9190", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4 Mini", result);
    }

    public void testDevice347() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9210", FALLBACK);
        Assert.assertEquals("Galaxy S2", result);
    }

    public void testDevice348() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9198", FALLBACK);
        Assert.assertEquals("Galaxy S4 Mini", result);
    }

    public void testDevice349() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T989D", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S II", result);
    }

    public void testDevice350() throws Exception {
        final String result = DeviceNames.getDeviceName("ST26i", FALLBACK);
        Assert.assertEquals("Sony Xperia J", result);
    }

    public void testDevice351() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G925W8", FALLBACK);
        Assert.assertEquals("Galaxy S6 Edge", result);
    }

    public void testDevice352() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T599N", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Exhibit", result);
    }

    public void testDevice353() throws Exception {
        final String result = DeviceNames.getDeviceName("SC-06D", FALLBACK);
        Assert.assertEquals("Galaxy S3", result);
    }

    public void testDevice354() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G386T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Avant", result);
    }

    public void testDevice355() throws Exception {
        final String result = DeviceNames.getDeviceName("XT907", FALLBACK);
        Assert.assertEquals("Motorola Droid Razr M", result);
    }

    public void testDevice356() throws Exception {
        final String result = DeviceNames.getDeviceName("LS670", FALLBACK);
        Assert.assertEquals("LG Optimus S", result);
    }

    public void testDevice357() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I337", FALLBACK);
        Assert.assertEquals("Galaxy S4", result);
    }

    public void testDevice358() throws Exception {
        final String result = DeviceNames.getDeviceName("CM990", FALLBACK);
        Assert.assertEquals("Huawei Evolution III", result);
    }

    public void testDevice359() throws Exception {
        final String result = DeviceNames.getDeviceName("LGLS990", FALLBACK);
        Assert.assertEquals("LG G3", result);
    }

    public void testDevice360() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-LS720", FALLBACK);
        Assert.assertEquals("LG Optimus F3", result);
    }

    public void testDevice361() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9060", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Grand Neo", result);
    }

    public void testDevice362() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I939", FALLBACK);
        Assert.assertEquals("Galaxy S3", result);
    }

    public void testDevice363() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1058", FALLBACK);
        Assert.assertEquals("Motorola Moto X", result);
    }

    public void testDevice364() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-M840", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Prevail 2", result);
    }

    public void testDevice365() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1056", FALLBACK);
        Assert.assertEquals("Motorola Moto X", result);
    }

    public void testDevice366() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1053", FALLBACK);
        Assert.assertEquals("Motorola Moto X", result);
    }

    public void testDevice367() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-P3110", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 2", result);
    }

    public void testDevice368() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-P3113", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Tab 2 7.0", result);
    }

    public void testDevice369() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-E610", FALLBACK);
        Assert.assertEquals("LG Optimus L5", result);
    }

    public void testDevice370() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-R720", FALLBACK);
        Assert.assertEquals("Samsung Admire", result);
    }

    public void testDevice371() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1028", FALLBACK);
        Assert.assertEquals("Motorola Moto G", result);
    }

    public void testDevice372() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-E440g", FALLBACK);
        Assert.assertEquals("LG Optimus L4 II", result);
    }

    public void testDevice373() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-I200", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Stellar", result);
    }

    public void testDevice374() throws Exception {
        final String result = DeviceNames.getDeviceName("XT1022", FALLBACK);
        Assert.assertEquals("Motorola Moto E", result);
    }

    public void testDevice375() throws Exception {
        final String result = DeviceNames.getDeviceName("LT30p", FALLBACK);
        Assert.assertEquals("Sony Xperia T", result);
    }

    public void testDevice376() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I8262", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Core", result);
    }

    public void testDevice377() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I8260", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Core", result);
    }

    public void testDevice378() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-P600", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note 10.1", result);
    }

    public void testDevice379() throws Exception {
        final String result = DeviceNames.getDeviceName("HUAWEI_Y300-0100", FALLBACK);
        Assert.assertEquals("Huawei Ascend Y300", result);
    }

    public void testDevice380() throws Exception {
        final String result = DeviceNames.getDeviceName("Xoom", FALLBACK);
        Assert.assertEquals("Motorola Xoom", result);
    }

    public void testDevice381() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I8550L", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Win", result);
    }

    public void testDevice382() throws Exception {
        final String result = DeviceNames.getDeviceName("ADR6425LVW", FALLBACK);
        Assert.assertEquals("HTC Rezound 4G", result);
    }

    public void testDevice383() throws Exception {
        final String result = DeviceNames.getDeviceName("SHW-M250", FALLBACK);
        Assert.assertEquals("Galaxy S2", result);
    }

    public void testDevice384() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-L900", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note II", result);
    }

    public void testDevice385() throws Exception {
        final String result = DeviceNames.getDeviceName("SCH-S968C", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S III", result);
    }

    public void testDevice386() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9100P", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S II", result);
    }

    public void testDevice387() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9100T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S II", result);
    }

    public void testDevice388() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D850", FALLBACK);
        Assert.assertEquals("LG G3", result);
    }

    public void testDevice389() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D851", FALLBACK);
        Assert.assertEquals("LG G3", result);
    }

    public void testDevice390() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D852", FALLBACK);
        Assert.assertEquals("G3", result);
    }

    public void testDevice391() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-D855", FALLBACK);
        Assert.assertEquals("LG G3", result);
    }

    public void testDevice392() throws Exception {
        final String result = DeviceNames.getDeviceName("SM-G920P", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S6", result);
    }

    public void testDevice393() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-S6310", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Young", result);
    }

    public void testDevice394() throws Exception {
        final String result = DeviceNames.getDeviceName("N3", FALLBACK);
        Assert.assertEquals("Star NO.1 N3", result);
    }

    public void testDevice395() throws Exception {
        final String result = DeviceNames.getDeviceName("C5155", FALLBACK);
        Assert.assertEquals("Kyocera Rise", result);
    }

    public void testDevice396() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-I9100M", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S II", result);
    }

    public void testDevice397() throws Exception {
        final String result = DeviceNames.getDeviceName("DROID_RAZR_HD", FALLBACK);
        Assert.assertEquals("Motorola Droid Razr HD", result);
    }

    public void testDevice398() throws Exception {
        final String result = DeviceNames.getDeviceName("D2305", FALLBACK);
        Assert.assertEquals("Xperia M2", result);
    }

    public void testDevice399() throws Exception {
        final String result = DeviceNames.getDeviceName("D2306", FALLBACK);
        Assert.assertEquals("Xperia M2", result);
    }

    public void testDevice400() throws Exception {
        final String result = DeviceNames.getDeviceName("KFTT", FALLBACK);
        Assert.assertEquals("Kindle Fire HD 7", result);
    }

    public void testDevice401() throws Exception {
        final String result = DeviceNames.getDeviceName("D2302", FALLBACK);
        Assert.assertEquals("Xperia M2", result);
    }

    public void testDevice402() throws Exception {
        final String result = DeviceNames.getDeviceName("D2303", FALLBACK);
        Assert.assertEquals("Sony Xperia M2", result);
    }

    public void testDevice403() throws Exception {
        final String result = DeviceNames.getDeviceName("Desire_HD", FALLBACK);
        Assert.assertEquals("HTC Desire HD", result);
    }

    public void testDevice404() throws Exception {
        final String result = DeviceNames.getDeviceName("ADR6410LVW", FALLBACK);
        Assert.assertEquals("HTC Droid Incredible 4G", result);
    }

    public void testDevice405() throws Exception {
        final String result = DeviceNames.getDeviceName("LG-E460", FALLBACK);
        Assert.assertEquals("LG Optimus L5 II", result);
    }

    public void testDevice406() throws Exception {
        final String result = DeviceNames.getDeviceName("ADR6330VW", FALLBACK);
        Assert.assertEquals("HTC Rhyme", result);
    }

    public void testDevice407() throws Exception {
        final String result = DeviceNames.getDeviceName("T-Mobile_G2", FALLBACK);
        Assert.assertEquals("T-Mobile G2", result);
    }

    public void testDevice408() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-T959", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S Vibrant", result);
    }

    public void testDevice409() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_Desire_510", FALLBACK);
        Assert.assertEquals("HTC Desire 510", result);
    }

    public void testDevice410() throws Exception {
        final String result = DeviceNames.getDeviceName("HTC_PN071", FALLBACK);
        Assert.assertEquals("HTC One", result);
    }

    public void testDevice411() throws Exception {
        final String result = DeviceNames.getDeviceName("SGH-M919N", FALLBACK);
        Assert.assertEquals("Samsung Galaxy S4", result);
    }

    public void testDevice412() throws Exception {
        final String result = DeviceNames.getDeviceName("C6606", FALLBACK);
        Assert.assertEquals("Sony Xperia Z", result);
    }

    public void testDevice413() throws Exception {
        final String result = DeviceNames.getDeviceName("C6603", FALLBACK);
        Assert.assertEquals("Sony Xperia Z", result);
    }

    public void testDevice414() throws Exception {
        final String result = DeviceNames.getDeviceName("VM670", FALLBACK);
        Assert.assertEquals("LG Optimus V", result);
    }

    public void testDevice415() throws Exception {
        final String result = DeviceNames.getDeviceName("ADR6300", FALLBACK);
        Assert.assertEquals("HTC Droid Incredible", result);
    }

    public void testDevice416() throws Exception {
        final String result = DeviceNames.getDeviceName("SPH-D600", FALLBACK);
        Assert.assertEquals("Samsung Conquer 4G", result);
    }

    public void testDevice417() throws Exception {
        final String result = DeviceNames.getDeviceName("ME173X", FALLBACK);
        Assert.assertEquals("Asus MeMO Pad HD 7", result);
    }

    public void testDevice418() throws Exception {
        final String result = DeviceNames.getDeviceName("GT-N7105T", FALLBACK);
        Assert.assertEquals("Samsung Galaxy Note II", result);
    }

    public void testDevice419() throws Exception {
        final String result = DeviceNames.getDeviceName("KFOT", FALLBACK);
        Assert.assertEquals("Kindle Fire", result);
    }

}
