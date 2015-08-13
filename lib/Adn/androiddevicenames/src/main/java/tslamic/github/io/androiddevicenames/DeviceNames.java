/*
 * Copyright (C) 2015 tslamic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tslamic.github.io.androiddevicenames;

// Generated on 13 Aug 2015 07:54:49 with adn.py version 0.0.1
// Number of supported devices: 419
public final class DeviceNames {

    /**
     * Returns a user-friendly name of current device. Same as calling {@code
     * getDeviceName(android.os.Build.MODEL, fallback)}.
     *
     * @param fallback fallback name if the device model is not listed.
     * @return {@code String} name of this device or fallback if device model
     * is not listed.
     */
    public static String getCurrentDeviceName(String fallback) {
        return getDeviceName(android.os.Build.MODEL, fallback);
    }

    /**
     * Returns a user-friendly name of the specified device model.
     *
     * @param model    the device model, e.g. {@code android.os.Build.MODEL}.
     * @param fallback fallback name if the device model is not listed.
     * @return {@code String} name of this device or fallback if device model
     * is not listed.
     */
    public static String getDeviceName(String model, String fallback) {
        if (android.text.TextUtils.isEmpty(model)) {
            return fallback;
        }
        final char c = Character.toUpperCase(model.charAt(0));
        switch (c) {
            case 'A':
                if ("ASUS_Transformer_Pad_TF700T".equals(model)) {
                    return "ASUS Transformer Pad TF700T";
                } else if ("ASUS_T00J".equals(model)) {
                    return "Asus ZenFone 5";
                } else if ("ADR6350".equals(model)) {
                    return "HTC Droid Incredible 2";
                } else if ("ALCATEL_ONE_TOUCH_7041X".equals(model)) {
                    return "Alcatel One Touch Pop C7";
                } else if ("ALCATEL_ONE_TOUCH_Fierce".equals(model)) {
                    return "ALCATEL ONE TOUCH Fierce";
                } else if ("ADR6400L".equals(model)) {
                    return "HTC Thunderbolt";
                } else if ("ALCATEL_ONE_TOUCH_5035X".equals(model)) {
                    return "Alcatel One Touch X Pop";
                } else if ("A1-810".equals(model)) {
                    return "Acer Iconia A1-810";
                } else if ("Aquaris_E4.5".equals(model)) {
                    return "bq Aquaris E4.5";
                } else if ("ASUS_Transformer_Pad_TF300T".equals(model)) {
                    return "Asus Transformer Pad";
                } else if ("A0001".equals(model)) {
                    return "OnePlus One";
                } else if ("ADR6425LVW".equals(model)) {
                    return "HTC Rezound 4G";
                } else if ("ADR6410LVW".equals(model)) {
                    return "HTC Droid Incredible 4G";
                } else if ("ADR6330VW".equals(model)) {
                    return "HTC Rhyme";
                } else if ("ADR6300".equals(model)) {
                    return "HTC Droid Incredible";
                }
                break;
            case 'C':
                if ("C6833".equals(model)) {
                    return "Sony Xperia Z Ultra";
                } else if ("C6903".equals(model)) {
                    return "Sony Xperia Z1";
                } else if ("C5170".equals(model)) {
                    return "Kyocera Hydro";
                } else if ("C2105".equals(model)) {
                    return "Sony Xperia L";
                } else if ("C1905".equals(model)) {
                    return "Sony Xperia M";
                } else if ("C6916".equals(model)) {
                    return "Sony Xperia Z1S";
                } else if ("C5302".equals(model)) {
                    return "Xperia SP";
                } else if ("C5303".equals(model)) {
                    return "Sony Xperia SP";
                } else if ("C5306".equals(model)) {
                    return "Xperia SP";
                } else if ("CUBOT_ONE".equals(model)) {
                    return "Cubot One";
                } else if ("CM990".equals(model)) {
                    return "Huawei Evolution III";
                } else if ("C5155".equals(model)) {
                    return "Kyocera Rise";
                } else if ("C6606".equals(model)) {
                    return "Sony Xperia Z";
                } else if ("C6603".equals(model)) {
                    return "Sony Xperia Z";
                }
                break;
            case 'B':
                if ("bq_Aquaris_5".equals(model)) {
                    return "bq Aquaris 5";
                } else if ("bq_Aquaris_5_HD".equals(model)) {
                    return "bq Aquaris 5 HD";
                }
                break;
            case 'E':
                if ("EVO".equals(model)) {
                    return "HTC Evo";
                }
                break;
            case 'D':
                if ("DROID_BIONIC".equals(model)) {
                    return "Motorola Droid Bionic";
                } else if ("DROID_Pro".equals(model)) {
                    return "Motorola Droid Pro";
                } else if ("D5803".equals(model)) {
                    return "Sony Xperia Z3 Compact";
                } else if ("D6603".equals(model)) {
                    return "Sony Xperia Z3";
                } else if ("D6503".equals(model)) {
                    return "Sony Xperia Z2";
                } else if ("DROID_RAZR".equals(model)) {
                    return "Motorola Droid Razr";
                } else if ("DROID2_GLOBAL".equals(model)) {
                    return "Motorola Droid 2 Global";
                } else if ("D5833".equals(model)) {
                    return "Xperia Z3 Compact";
                } else if ("DROID_X2".equals(model)) {
                    return "Motorola Droid X2";
                } else if ("D6653".equals(model)) {
                    return "Sony Xperia Z3";
                } else if ("D2316".equals(model)) {
                    return "Xperia M2";
                } else if ("D2005".equals(model)) {
                    return "Sony Xperia E1";
                } else if ("Droid".equals(model)) {
                    return "Motorola Droid";
                } else if ("DROID4".equals(model)) {
                    return "Motorola Droid 4";
                } else if ("DROID2".equals(model)) {
                    return "Motorola Droid 2";
                } else if ("DROID3".equals(model)) {
                    return "Motorola Droid 3";
                } else if ("DROIDX".equals(model)) {
                    return "Motorola Droid X";
                } else if ("D5503".equals(model)) {
                    return "Sony Xperia Z1";
                } else if ("DROID_RAZR_HD".equals(model)) {
                    return "Motorola Droid Razr HD";
                } else if ("D2305".equals(model)) {
                    return "Xperia M2";
                } else if ("D2306".equals(model)) {
                    return "Xperia M2";
                } else if ("D2302".equals(model)) {
                    return "Xperia M2";
                } else if ("D2303".equals(model)) {
                    return "Sony Xperia M2";
                } else if ("Desire_HD".equals(model)) {
                    return "HTC Desire HD";
                }
                break;
            case 'G':
                if ("GT-I9295".equals(model)) {
                    return "Samsung Galaxy S4 Active";
                } else if ("GT-I9000".equals(model)) {
                    return "Samsung Galaxy S";
                } else if ("GT-I9001".equals(model)) {
                    return "Samsung Galaxy S Plus";
                } else if ("GT-N8013".equals(model)) {
                    return "Samsung Galaxy Note 10.1";
                } else if ("google_sdk".equals(model)) {
                    return "Android Emulator";
                } else if ("GT-I9305T".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("GT-N8010".equals(model)) {
                    return "Samsung Galaxy Note 10.1";
                } else if ("GT-I9070".equals(model)) {
                    return "Samsung Galaxy S Advance";
                } else if ("GT-S5360".equals(model)) {
                    return "Samsung Galaxy Y";
                } else if ("GT-P5210".equals(model)) {
                    return "Samsung Galaxy Tab 3 10.1";
                } else if ("GT-N7000".equals(model)) {
                    return "Samsung Galaxy Note";
                } else if ("GT-I9300T".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("GT-I9300".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("GT-S5570".equals(model)) {
                    return "Samsung Galaxy Mini";
                } else if ("GT-N8000".equals(model)) {
                    return "Samsung Galaxy Note 10.1";
                } else if ("GT-I9063T".equals(model)) {
                    return "Samsung Galaxy Grand Neo Duos";
                } else if ("GT-I9305".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("GT-S7580".equals(model)) {
                    return "Samsung Galaxy Trend Plus";
                } else if ("GT-I8160".equals(model)) {
                    return "Samsung Galaxy Ace 2";
                } else if ("GT-S5301L".equals(model)) {
                    return "Samsung Galaxy Pocket Plus";
                } else if ("GT-P7510".equals(model)) {
                    return "Samsung Galaxy Tab 10.1";
                } else if ("GT-I8190N".equals(model)) {
                    return "Samsung Galaxy S III Mini";
                } else if ("GT-I8190L".equals(model)) {
                    return "Samsung Galaxy S3 Mini";
                } else if ("GT-I9082".equals(model)) {
                    return "Samsung Galaxy Grand";
                } else if ("GT-I8190".equals(model)) {
                    return "Samsung Galaxy S III Mini";
                } else if ("GT-S5830".equals(model)) {
                    return "Samsung Galaxy Ace";
                } else if ("GT-N7100".equals(model)) {
                    return "Samsung Galaxy Note II";
                } else if ("GT-N7105".equals(model)) {
                    return "Samsung Galaxy Note II";
                } else if ("Galaxy_Nexus".equals(model)) {
                    return "Samsung Galaxy Nexus";
                } else if ("GT-P3100".equals(model)) {
                    return "Samsung Galaxy Tab 2";
                } else if ("GT-I9505".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("GT-I9507".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("GT-I9506".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("GT-I9500".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("GT-S7560M".equals(model)) {
                    return "Samsung Galaxy Ace II X";
                } else if ("GT-S7562".equals(model)) {
                    return "Samsung Galaxy S Duos";
                } else if ("GT-N5110".equals(model)) {
                    return "Samsung Galaxy Note 8.0";
                } else if ("GT-P5113".equals(model)) {
                    return "Samsnung Galaxy Tab 2 10.1";
                } else if ("GT-P5110".equals(model)) {
                    return "Samsung Galaxy Tab 2";
                } else if ("GT-I9105P".equals(model)) {
                    return "Samsung Galaxy S2 Plus";
                } else if ("GT-S6310N".equals(model)) {
                    return "Samsung Galaxy Young";
                } else if ("GT-S5830i".equals(model)) {
                    return "Samsung Galaxy Ace";
                } else if ("GT-S6810P".equals(model)) {
                    return "Samsung Galaxy Fame";
                } else if ("GT-I9100".equals(model)) {
                    return "Samsung Galaxy S II";
                } else if ("GT-I9197".equals(model)) {
                    return "Galaxy S4 Mini";
                } else if ("GT-I9195".equals(model)) {
                    return "Samsung Galaxy S4 Mini";
                } else if ("GT-I9192".equals(model)) {
                    return "Samsung Galaxy S4 Mini Duos";
                } else if ("GT-I9190".equals(model)) {
                    return "Samsung Galaxy S4 Mini";
                } else if ("GT-I9210".equals(model)) {
                    return "Galaxy S2";
                } else if ("GT-I9198".equals(model)) {
                    return "Galaxy S4 Mini";
                } else if ("GT-I9060".equals(model)) {
                    return "Samsung Galaxy Grand Neo";
                } else if ("GT-P3110".equals(model)) {
                    return "Samsung Galaxy Tab 2";
                } else if ("GT-P3113".equals(model)) {
                    return "Samsung Galaxy Tab 2 7.0";
                } else if ("GT-I8262".equals(model)) {
                    return "Samsung Galaxy Core";
                } else if ("GT-I8260".equals(model)) {
                    return "Samsung Galaxy Core";
                } else if ("GT-I8550L".equals(model)) {
                    return "Samsung Galaxy Win";
                } else if ("GT-I9100P".equals(model)) {
                    return "Samsung Galaxy S II";
                } else if ("GT-I9100T".equals(model)) {
                    return "Samsung Galaxy S II";
                } else if ("GT-S6310".equals(model)) {
                    return "Samsung Galaxy Young";
                } else if ("GT-I9100M".equals(model)) {
                    return "Samsung Galaxy S II";
                } else if ("GT-N7105T".equals(model)) {
                    return "Samsung Galaxy Note II";
                }
                break;
            case 'F':
                break;
            case 'I':
                if ("ISW11SC".equals(model)) {
                    return "Galaxy S2";
                }
                break;
            case 'H':
                if ("HTC_Incredible_S".equals(model)) {
                    return "HTC Incredible S";
                } else if ("HTC_One_M8".equals(model)) {
                    return "HTC One M8";
                } else if ("HTC_Sensation_4G".equals(model)) {
                    return "HTC Sensation 4G";
                } else if ("HTC_Desire_HD_A9191".equals(model)) {
                    return "HTC Desire HD";
                } else if ("HTC_Desire".equals(model)) {
                    return "HTC Desire";
                } else if ("HTC6435LVW".equals(model)) {
                    return "HTC Droid DNA";
                } else if ("HTC_PH39100".equals(model)) {
                    return "HTC Vivid 4G";
                } else if ("HTC6500LVW".equals(model)) {
                    return "HTC One";
                } else if ("HM_1SW".equals(model)) {
                    return "Xiaomi Redmi";
                } else if ("HTC_VLE_U".equals(model)) {
                    return "HTC One S";
                } else if ("HTC_Desire_S".equals(model)) {
                    return "HTC Desire S";
                } else if ("HTC_Desire_C".equals(model)) {
                    return "HTC Desire C";
                } else if ("HTCEVODesign4G".equals(model)) {
                    return "HTC Evo Design 4G";
                } else if ("HTC_One".equals(model)) {
                    return "HTC One";
                } else if ("HTC_Desire_610".equals(model)) {
                    return "HTC Desire 610";
                } else if ("HTC_Amaze_4G".equals(model)) {
                    return "HTC Amaze 4G";
                } else if ("HTC_Glacier".equals(model)) {
                    return "HTC Glacier";
                } else if ("HTC_One_mini".equals(model)) {
                    return "HTC One mini";
                } else if ("HUAWEI_P6-U06".equals(model)) {
                    return "Huawei Ascend P6";
                } else if ("HTCEVOV4G".equals(model)) {
                    return "HTC Evo V 4G";
                } else if ("HTC_Desire_500".equals(model)) {
                    return "HTC Desire 500";
                } else if ("HTC_Sensation_Z710e".equals(model)) {
                    return "HTC Sensation";
                } else if ("HTC6525LVW".equals(model)) {
                    return "HTC One M8";
                } else if ("HTC_One_S".equals(model)) {
                    return "HTC One S";
                } else if ("HUAWEI_G510-0251".equals(model)) {
                    return "Huawei Ascend G510";
                } else if ("HTC_One_V".equals(model)) {
                    return "HTC One V";
                } else if ("HTC_One_X".equals(model)) {
                    return "HTC One X";
                } else if ("HTC_One_X+".equals(model)) {
                    return "HTC One X+";
                } else if ("HTCONE".equals(model)) {
                    return "HTC One";
                } else if ("HUAWEI_Y300-0100".equals(model)) {
                    return "Huawei Ascend Y300";
                } else if ("HTC_Desire_510".equals(model)) {
                    return "HTC Desire 510";
                } else if ("HTC_PN071".equals(model)) {
                    return "HTC One";
                }
                break;
            case 'K':
                if ("Kindle_Fire".equals(model)) {
                    return "Kindle Fire";
                } else if ("KFJWI".equals(model)) {
                    return "Kindle Fire HD 8.9";
                } else if ("KFJWA".equals(model)) {
                    return "Kindle Fire HD 8.9";
                } else if ("KFTT".equals(model)) {
                    return "Kindle Fire HD 7";
                } else if ("KFOT".equals(model)) {
                    return "Kindle Fire";
                }
                break;
            case 'J':
                break;
            case 'M':
                if ("Motorola_Electrify".equals(model)) {
                    return "Motorola Electrify";
                } else if ("myTouch_4G_Slide".equals(model)) {
                    return "HTC myTouch 4G Slide";
                } else if ("MB886".equals(model)) {
                    return "Motorola Atrix HD";
                } else if ("MOTWX435KT".equals(model)) {
                    return "Motorola Triumph";
                } else if ("MI_3W".equals(model)) {
                    return "Xiaomi Mi 3";
                } else if ("MB865".equals(model)) {
                    return "Motorola Atrix 2";
                } else if ("MB860".equals(model)) {
                    return "Motorola Atrix 4G";
                } else if ("MB855".equals(model)) {
                    return "Motorola Photon 4G";
                } else if ("ME173X".equals(model)) {
                    return "Asus MeMO Pad HD 7";
                }
                break;
            case 'L':
                if ("LG-E970".equals(model)) {
                    return "LG Optimus G";
                } else if ("LG-E971".equals(model)) {
                    return "Optimus G";
                } else if ("LG-E612g".equals(model)) {
                    return "LG Optimus L5 Dual";
                } else if ("LG-LS980".equals(model)) {
                    return "LG G2";
                } else if ("LG-D686".equals(model)) {
                    return "LG G Pro Lite Dual";
                } else if ("LG-P509".equals(model)) {
                    return "LG Optimus T";
                } else if ("LGMS500".equals(model)) {
                    return "LG Optimus F6";
                } else if ("LG-E411g".equals(model)) {
                    return "LG Optimus L1 II";
                } else if ("LGLS740".equals(model)) {
                    return "LG Volt";
                } else if ("LG-VM696".equals(model)) {
                    return "LG Optimus Elite";
                } else if ("LG-D803".equals(model)) {
                    return "G2";
                } else if ("LG-P769".equals(model)) {
                    return "LG Optimus L9";
                } else if ("LG-P760".equals(model)) {
                    return "LG Optimus L9";
                } else if ("LG-D415".equals(model)) {
                    return "LG Optimus L90";
                } else if ("LG-P768".equals(model)) {
                    return "LG Optimus L9";
                } else if ("LGL55C".equals(model)) {
                    return "LG LGL55C";
                } else if ("LT25i".equals(model)) {
                    return "Sony Xperia V";
                } else if ("LG-E739".equals(model)) {
                    return "LG MyTouch e739";
                } else if ("LGL34C".equals(model)) {
                    return "LG Optimus Fuel";
                } else if ("LT26i".equals(model)) {
                    return "Sony Xperia S";
                } else if ("LG-MS910".equals(model)) {
                    return "LG Esteem";
                } else if ("LG-D620".equals(model)) {
                    return "LG G2 Mini";
                } else if ("LG-MS770".equals(model)) {
                    return "LG Motion 4G";
                } else if ("LG-P999".equals(model)) {
                    return "LG G2X P999";
                } else if ("LG-E425g".equals(model)) {
                    return "LG Optimus L3 II";
                } else if ("LG-D805".equals(model)) {
                    return "G2";
                } else if ("LG-D802".equals(model)) {
                    return "LG G2";
                } else if ("LG-D801".equals(model)) {
                    return "LG G2";
                } else if ("LG-D800".equals(model)) {
                    return "LG G2";
                } else if ("LT22i".equals(model)) {
                    return "Sony Xperia P";
                } else if ("LG-H815".equals(model)) {
                    return "G4";
                } else if ("LG-LG730".equals(model)) {
                    return "LG Venice";
                } else if ("LG-C800".equals(model)) {
                    return "LG myTouch Q";
                } else if ("LG-LS840".equals(model)) {
                    return "LG Viper";
                } else if ("LGMS323".equals(model)) {
                    return "LG Optimus L70";
                } else if ("L-01F".equals(model)) {
                    return "G2";
                } else if ("LG-E980".equals(model)) {
                    return "LG Optimus G Pro";
                } else if ("LG-LS970".equals(model)) {
                    return "LG Optimus G";
                } else if ("LGMS769".equals(model)) {
                    return "LG Optimus L9";
                } else if ("LS670".equals(model)) {
                    return "LG Optimus S";
                } else if ("LGLS990".equals(model)) {
                    return "LG G3";
                } else if ("LG-LS720".equals(model)) {
                    return "LG Optimus F3";
                } else if ("LG-E610".equals(model)) {
                    return "LG Optimus L5";
                } else if ("LG-E440g".equals(model)) {
                    return "LG Optimus L4 II";
                } else if ("LT30p".equals(model)) {
                    return "Sony Xperia T";
                } else if ("LG-D850".equals(model)) {
                    return "LG G3";
                } else if ("LG-D851".equals(model)) {
                    return "LG G3";
                } else if ("LG-D852".equals(model)) {
                    return "G3";
                } else if ("LG-D855".equals(model)) {
                    return "LG G3";
                } else if ("LG-E460".equals(model)) {
                    return "LG Optimus L5 II";
                }
                break;
            case 'O':
                if ("Orange_Daytona".equals(model)) {
                    return "Huawei Ascend G510";
                }
                break;
            case 'N':
                if ("Nexus_9".equals(model)) {
                    return "Nexus 9";
                } else if ("Nexus_7".equals(model)) {
                    return "Asus Nexus 7";
                } else if ("Nexus_6".equals(model)) {
                    return "Nexus 6";
                } else if ("Nexus_5".equals(model)) {
                    return "Nexus 5";
                } else if ("Nexus_4".equals(model)) {
                    return "Google Nexus 4";
                } else if ("Nexus_S".equals(model)) {
                    return "Samsung Nexus S";
                } else if ("Nexus_S_4G".equals(model)) {
                    return "Samsung Nexus S 4G";
                } else if ("Nexus_10".equals(model)) {
                    return "Google Nexus 10";
                } else if ("N860".equals(model)) {
                    return "ZTE Warp N860";
                } else if ("N3".equals(model)) {
                    return "Star NO.1 N3";
                }
                break;
            case 'Q':
                if ("QMV7A".equals(model)) {
                    return "Verizon Ellipsis 7";
                }
                break;
            case 'P':
                if ("PC36100".equals(model)) {
                    return "HTC Evo 4G";
                } else if ("PG06100".equals(model)) {
                    return "HTC EVO Shift 4G";
                } else if ("PantechP9070".equals(model)) {
                    return "Pantech Burst";
                } else if ("PH44100".equals(model)) {
                    return "HTC Evo Design 4G";
                } else if ("PG86100".equals(model)) {
                    return "HTC Evo 3D";
                }
                break;
            case 'S':
                if ("SCH-I415".equals(model)) {
                    return "Samsung Galaxy Stratosphere II";
                } else if ("SCH-I800".equals(model)) {
                    return "Samsung Galaxy Tab 7.0";
                } else if ("SM-N910W8".equals(model)) {
                    return "Samsung Galaxy Note 4";
                } else if ("SPH-M830".equals(model)) {
                    return "Samsung Galaxy Rush";
                } else if ("SCH-R970".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("SAMSUNG-SGH-I777".equals(model)) {
                    return "Samsung Galaxy S II";
                } else if ("SM-T217S".equals(model)) {
                    return "Samsung Galaxy Tab 3 7.0";
                } else if ("SAMSUNG-SM-G870A".equals(model)) {
                    return "Samsung Galaxy S5 Active";
                } else if ("SM-T310".equals(model)) {
                    return "Samsung Galaxy Tab 3 8.0";
                } else if ("SHV-E300".equals(model)) {
                    return "Galaxy S4";
                } else if ("SM-G920V".equals(model)) {
                    return "Samsung Galaxy S6";
                } else if ("SM-G920R".equals(model)) {
                    return "Galaxy S6";
                } else if ("SM-G920I".equals(model)) {
                    return "Galaxy S6";
                } else if ("SM-G920F".equals(model)) {
                    return "Galaxy S6";
                } else if ("SPH-D710BST".equals(model)) {
                    return "Samsung Galaxy S II";
                } else if ("SGH-T999".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SAMSUNG-SM-N900A".equals(model)) {
                    return "Samsung Galaxy Note 3";
                } else if ("SGP312".equals(model)) {
                    return "Sony Xperia Tablet Z";
                } else if ("SAMSUNG-SGH-I927".equals(model)) {
                    return "Samsung Captivate Glide";
                } else if ("SM-N910G".equals(model)) {
                    return "Samsung Galaxy Note 4";
                } else if ("SM-N910F".equals(model)) {
                    return "Samsung Galaxy Note 4";
                } else if ("SM-G9200".equals(model)) {
                    return "Galaxy S6";
                } else if ("SM-N7505".equals(model)) {
                    return "Samsung Galaxy Note 3 Neo";
                } else if ("SM-G386T1".equals(model)) {
                    return "Samsung Galaxy Avant";
                } else if ("SAMSUNG-SGH-I337".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("SM-N910P".equals(model)) {
                    return "Samsung Galaxy Note 4";
                } else if ("SM-N910V".equals(model)) {
                    return "Samsung Galaxy Note 4";
                } else if ("SM-N910T".equals(model)) {
                    return "Samsung Galaxy Note 4";
                } else if ("SM-T230NU".equals(model)) {
                    return "Samsung Galaxy Tab 4";
                } else if ("SCH-I605".equals(model)) {
                    return "Samsung Galaxy Note II";
                } else if ("SGH-N045".equals(model)) {
                    return "Galaxy S4";
                } else if ("SGH-I257M".equals(model)) {
                    return "Samsung Galaxy S4 Mini";
                } else if ("SAMSUNG-SM-G920A".equals(model)) {
                    return "Samsung Galaxy S6";
                } else if ("SPH-L710".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SM-G900R4".equals(model)) {
                    return "Galaxy S5";
                } else if ("SGH-T399".equals(model)) {
                    return "Samsung Galaxy Light";
                } else if ("SM-G920T".equals(model)) {
                    return "Samsung Galaxy S6";
                } else if ("SCH-J021".equals(model)) {
                    return "Galaxy S3";
                } else if ("SPH-L720".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("SGH-I777M".equals(model)) {
                    return "Galaxy S2";
                } else if ("SGH-I747M".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SGH-I757M".equals(model)) {
                    return "Galaxy S2";
                } else if ("SM-N900W8".equals(model)) {
                    return "Samsung Galaxy Note 3";
                } else if ("SGH-T679".equals(model)) {
                    return "Samsung Exhibit II";
                } else if ("SCH-S738C".equals(model)) {
                    return "Samsung Galaxy Centura";
                } else if ("SPH-M820-BST".equals(model)) {
                    return "Samsung Galaxy Prevail";
                } else if ("SCH-S720C".equals(model)) {
                    return "Samsung Proclaim";
                } else if ("SCH-I959".equals(model)) {
                    return "Galaxy S4";
                } else if ("SCH-R760".equals(model)) {
                    return "Galaxy S2";
                } else if ("SPH-M930BST".equals(model)) {
                    return "Samsung Transform Ultra";
                } else if ("SAMSUNG-SGH-I747".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SM-T530NU".equals(model)) {
                    return "Samsung Galaxy Tab 4 10.1";
                } else if ("SGH-I727R".equals(model)) {
                    return "Samsung Galaxy S II";
                } else if ("SM-N910C".equals(model)) {
                    return "Samsung Galaxy Note 4";
                } else if ("SM-G3815".equals(model)) {
                    return "Samsung Galaxy Express II";
                } else if ("SM-N900".equals(model)) {
                    return "Samsung Galaxy Note 3";
                } else if ("SAMSUNG-SM-G730A".equals(model)) {
                    return "Samsung Galaxy S3 Mini";
                } else if ("SM-T210R".equals(model)) {
                    return "Samsung Galaxy Tab 3 7.0";
                } else if ("SPH-D710".equals(model)) {
                    return "Samsung Epic";
                } else if ("SC-04E".equals(model)) {
                    return "Galaxy S4";
                } else if ("SM-G900RZWAUSC".equals(model)) {
                    return "Galaxy S5";
                } else if ("SAMSUNG-SGH-I527".equals(model)) {
                    return "Samsung Galaxy Mega";
                } else if ("SCH-R530M".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SCH-R530C".equals(model)) {
                    return "Samsung Galaxy S3";
                } else if ("SM-G925A".equals(model)) {
                    return "Galaxy S6 Edge";
                } else if ("SCH-R530U".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SM-G900I".equals(model)) {
                    return "Samsung Galaxy S5";
                } else if ("SM-G900H".equals(model)) {
                    return "Samsung Galaxy S5";
                } else if ("SM-G900F".equals(model)) {
                    return "Samsung Galaxy S5";
                } else if ("SAMSUNG-SM-N910A".equals(model)) {
                    return "Samsung Galaxy Note 4";
                } else if ("SM-G900V".equals(model)) {
                    return "Samsung Galaxy S5";
                } else if ("SM-G900T".equals(model)) {
                    return "Samsung Galaxy S5";
                } else if ("SM-G900P".equals(model)) {
                    return "Samsung Galaxy S5";
                } else if ("SGH-N035".equals(model)) {
                    return "Galaxy S3";
                } else if ("SPH-L710T".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SAMSUNG-SGH-I717".equals(model)) {
                    return "Samsung Galaxy Note";
                } else if ("SGH-M919".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("SM-G925P".equals(model)) {
                    return "Galaxy S6 Edge";
                } else if ("SCH-I500".equals(model)) {
                    return "Samsung Fascinate";
                } else if ("SM-G860P".equals(model)) {
                    return "Samsung Galaxy S5 Sport";
                } else if ("SGH-T889".equals(model)) {
                    return "Samsung Galaxy Note II";
                } else if ("SGH-T999V".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SC-03E".equals(model)) {
                    return "Galaxy S3";
                } else if ("ST25i".equals(model)) {
                    return "Sony Xperia U";
                } else if ("SGH-T999L".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SM-N9006".equals(model)) {
                    return "Samsung Galaxy Note 3";
                } else if ("SM-N900P".equals(model)) {
                    return "Samsung Galaxy Note 3";
                } else if ("SM-N900V".equals(model)) {
                    return "Samsung Galaxy Note 3";
                } else if ("SM-N900T".equals(model)) {
                    return "Samsung Galaxy Note 3";
                } else if ("SHV-E250S".equals(model)) {
                    return "Samsung Galaxy Note II";
                } else if ("SPH-L720T".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("SHV-E250K".equals(model)) {
                    return "Samsung Galaxy Note 2";
                } else if ("SM-G7102".equals(model)) {
                    return "Samsung Galaxy Grand II";
                } else if ("SAMSUNG-SM-G900A".equals(model)) {
                    return "Samsung Galaxy S5";
                } else if ("SGH-I317M".equals(model)) {
                    return "Samsung Galaxy Note II";
                } else if ("SCH-I535".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SM-G925F".equals(model)) {
                    return "Galaxy S6 Edge";
                } else if ("SPH-L520".equals(model)) {
                    return "Samsung Galaxy S4 Mini";
                } else if ("SM-G925V".equals(model)) {
                    return "Galaxy S6 Edge";
                } else if ("SM-G925R".equals(model)) {
                    return "Galaxy S6 Edge";
                } else if ("SAMSUNG-SGH-I997".equals(model)) {
                    return "Samsung Infuse 4G";
                } else if ("ST21i".equals(model)) {
                    return "Sony Xperia Tipo";
                } else if ("SCH-I545".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("SGH-T769".equals(model)) {
                    return "Samsung Galaxy S Blaze";
                } else if ("SGH-N064".equals(model)) {
                    return "Galaxy S3";
                } else if ("SAMSUNG-SGH-I727".equals(model)) {
                    return "Samsung Skyrocket";
                } else if ("SGH-I337M".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("SCH-I435".equals(model)) {
                    return "Samsung Galaxy S4 Mini";
                } else if ("SM-G9250".equals(model)) {
                    return "Galaxy S6 Edge";
                } else if ("SPH-D710VMUB".equals(model)) {
                    return "Samsung Galaxy S II";
                } else if ("SPH-D700".equals(model)) {
                    return "Samsung Epic 4G";
                } else if ("SM-G920W8".equals(model)) {
                    return "Galaxy S6";
                } else if ("SAMSUNG-SGH-I537".equals(model)) {
                    return "Samsung Galaxy S4 Active";
                } else if ("SGH-T959V".equals(model)) {
                    return "Samsung Galaxy S 4G";
                } else if ("SC-02C".equals(model)) {
                    return "Galaxy S2";
                } else if ("SM-T800".equals(model)) {
                    return "Samsung Galaxy Tab S 10.5";
                } else if ("SAMSUNG-SGH-I897".equals(model)) {
                    return "Samsung Captivate";
                } else if ("SHV-E210S".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SHV-E210K".equals(model)) {
                    return "Samsung Galaxy S3";
                } else if ("SM-N9005".equals(model)) {
                    return "Samsung Galaxy Note 3";
                } else if ("SCH-I405".equals(model)) {
                    return "Samsung Stratosphere";
                } else if ("SCL21".equals(model)) {
                    return "Galaxy S3";
                } else if ("SAMSUNG-SGH-I317".equals(model)) {
                    return "Samsung Galaxy Note II";
                } else if ("SGH-T399N".equals(model)) {
                    return "Samsung Galaxy Light";
                } else if ("SM-G925T".equals(model)) {
                    return "Galaxy S6 Edge";
                } else if ("SM-G800F".equals(model)) {
                    return "Samsung Galaxy S5 Mini";
                } else if ("SPH-L300".equals(model)) {
                    return "Samsung Galaxy Victory";
                } else if ("SCH-I510".equals(model)) {
                    return "Samsung Droid Charge";
                } else if ("SGH-T989".equals(model)) {
                    return "Samsung Galaxy S II";
                } else if ("SM-G900W8".equals(model)) {
                    return "Samsung Galaxy S5";
                } else if ("SGH-T989D".equals(model)) {
                    return "Samsung Galaxy S II";
                } else if ("ST26i".equals(model)) {
                    return "Sony Xperia J";
                } else if ("SM-G925W8".equals(model)) {
                    return "Galaxy S6 Edge";
                } else if ("SGH-T599N".equals(model)) {
                    return "Samsung Galaxy Exhibit";
                } else if ("SC-06D".equals(model)) {
                    return "Galaxy S3";
                } else if ("SM-G386T".equals(model)) {
                    return "Samsung Galaxy Avant";
                } else if ("SCH-I337".equals(model)) {
                    return "Galaxy S4";
                } else if ("SCH-I939".equals(model)) {
                    return "Galaxy S3";
                } else if ("SPH-M840".equals(model)) {
                    return "Samsung Galaxy Prevail 2";
                } else if ("SCH-R720".equals(model)) {
                    return "Samsung Admire";
                } else if ("SCH-I200".equals(model)) {
                    return "Samsung Galaxy Stellar";
                } else if ("SM-P600".equals(model)) {
                    return "Samsung Galaxy Note 10.1";
                } else if ("SHW-M250".equals(model)) {
                    return "Galaxy S2";
                } else if ("SPH-L900".equals(model)) {
                    return "Samsung Galaxy Note II";
                } else if ("SCH-S968C".equals(model)) {
                    return "Samsung Galaxy S III";
                } else if ("SM-G920P".equals(model)) {
                    return "Samsung Galaxy S6";
                } else if ("SGH-T959".equals(model)) {
                    return "Samsung Galaxy S Vibrant";
                } else if ("SGH-M919N".equals(model)) {
                    return "Samsung Galaxy S4";
                } else if ("SPH-D600".equals(model)) {
                    return "Samsung Conquer 4G";
                }
                break;
            case 'R':
                break;
            case 'U':
                break;
            case 'T':
                if ("T-Mobile_myTouch_Q".equals(model)) {
                    return "T-Mobile myTouch Q";
                } else if ("Transformer_Prime_TF201".equals(model)) {
                    return "Asus Eee Pad Transformer Prime";
                } else if ("Transformer_TF101".equals(model)) {
                    return "Asus Eee Pad Transformer";
                } else if ("T-Mobile_G2".equals(model)) {
                    return "T-Mobile G2";
                }
                break;
            case 'W':
                break;
            case 'V':
                if ("VS985_4G".equals(model)) {
                    return "LG G3 4G";
                } else if ("VS840_4G".equals(model)) {
                    return "LG Lucid 4G";
                } else if ("VS870_4G".equals(model)) {
                    return "LG Lucid 2";
                } else if ("VS930_4G".equals(model)) {
                    return "LG Spectrum 2";
                } else if ("VS920_4G".equals(model)) {
                    return "LG Spectrum 4G";
                } else if ("VS910_4G".equals(model)) {
                    return "LG Revolution 4G";
                } else if ("VS980_4G".equals(model)) {
                    return "LG G2";
                } else if ("VM670".equals(model)) {
                    return "LG Optimus V";
                }
                break;
            case 'Y':
                break;
            case 'X':
                if ("XT1080".equals(model)) {
                    return "Motorola Droid Ultra";
                } else if ("XT1049".equals(model)) {
                    return "Motorola Moto X";
                } else if ("XT1045".equals(model)) {
                    return "Motorola Moto G";
                } else if ("XT1254".equals(model)) {
                    return "Motorola Droid Turbo";
                } else if ("XT1039".equals(model)) {
                    return "Motorola Moto G";
                } else if ("XT1034".equals(model)) {
                    return "Motorola Moto G";
                } else if ("XT1030".equals(model)) {
                    return "Motorola Droid Mini";
                } else if ("XT1031".equals(model)) {
                    return "Motorola Moto G";
                } else if ("XT1032".equals(model)) {
                    return "Motorola Moto G";
                } else if ("XT1033".equals(model)) {
                    return "Motorola Moto G";
                } else if ("XT897".equals(model)) {
                    return "Motorola Photo Q";
                } else if ("XT1096".equals(model)) {
                    return "Motorola Moto X";
                } else if ("XT1097".equals(model)) {
                    return "Motorola Moto X";
                } else if ("XT1095".equals(model)) {
                    return "Motorola Moto X";
                } else if ("XT1060".equals(model)) {
                    return "Motorola Moto X";
                } else if ("XT1068".equals(model)) {
                    return "Motorola Moto G";
                } else if ("XT907".equals(model)) {
                    return "Motorola Droid Razr M";
                } else if ("XT1058".equals(model)) {
                    return "Motorola Moto X";
                } else if ("XT1056".equals(model)) {
                    return "Motorola Moto X";
                } else if ("XT1053".equals(model)) {
                    return "Motorola Moto X";
                } else if ("XT1028".equals(model)) {
                    return "Motorola Moto G";
                } else if ("XT1022".equals(model)) {
                    return "Motorola Moto E";
                } else if ("Xoom".equals(model)) {
                    return "Motorola Xoom";
                }
                break;
            case 'Z':
                if ("Z970".equals(model)) {
                    return "ZTE ZMax";
                }
                break;
            default:
                if ("5860E".equals(model)) {
                    return "Coolpad Quattro 4G";
                } else if ("831C".equals(model)) {
                    return "HTC One M8";
                } else if ("9920".equals(model)) {
                    return "Star Alps S9920";
                }
                break;

        }
        return fallback;
    }

    private DeviceNames() {
    }

}
