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
package tslamic.github.io.adn;

// Generated on 15 Jun 2016 14:35:08 with adn.py version 0.0.1
// Number of supported devices: 6104
public final class DeviceNames {

    /**
     * Returns a user-friendly name of current device. Same as calling {@code
     * getDeviceName(android.os.Build.MODEL, null)}.
     *
     * @return {@code String} name of this device or {@code null} if device model
     * is not listed.
     */
    public static String getCurrentDeviceName() {
        return getDeviceName(android.os.Build.MODEL, null);
    }

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
        String deviceName;
        final char c = Character.toUpperCase(model.charAt(0));
        switch (c) {
            case 'A':
                deviceName = aMethod(model);
                break;
            case 'B':
                deviceName = bMethod(model);
                break;
            case 'C':
                deviceName = cMethod(model);
                break;
            case 'D':
                deviceName = dMethod(model);
                break;
            case 'E':
                deviceName = eMethod(model);
                break;
            case 'F':
                deviceName = fMethod(model);
                break;
            case 'G':
                deviceName = gMethod(model);
                break;
            case 'H':
                deviceName = hMethod(model);
                break;
            case 'I':
                deviceName = iMethod(model);
                break;
            case 'J':
                deviceName = jMethod(model);
                break;
            case 'K':
                deviceName = kMethod(model);
                break;
            case 'L':
                deviceName = lMethod(model);
                break;
            case 'M':
                deviceName = mMethod(model);
                break;
            case 'N':
                deviceName = nMethod(model);
                break;
            case 'O':
                deviceName = oMethod(model);
                break;
            case 'P':
                deviceName = pMethod(model);
                break;
            case 'Q':
                deviceName = qMethod(model);
                break;
            case 'R':
                deviceName = rMethod(model);
                break;
            case 'S':
                deviceName = sMethod(model);
                break;
            case 'T':
                deviceName = tMethod(model);
                break;
            case 'U':
                deviceName = uMethod(model);
                break;
            case 'V':
                deviceName = vMethod(model);
                break;
            case 'W':
                deviceName = wMethod(model);
                break;
            case 'X':
                deviceName = xMethod(model);
                break;
            case 'Y':
                deviceName = yMethod(model);
                break;
            case 'Z':
                deviceName = zMethod(model);
                break;
                default:
                deviceName = otherMethod(model);

        }
        if (deviceName.isEmpty()) deviceName = fallback;
        return deviceName;
    }

    public static String aMethod (String model) {
        if ("ASUS_Z00XSB".equals(model)) { return "Asus ZenFone Zoom (ZX551ML)"; }
        else if ("ASUS_Z00XSA".equals(model)) { return "Asus ZenFone Zoom (ZX551ML)"; }
        else if ("A1601".equals(model)) { return "Oppo A1601"; }
        else if ("A1603".equals(model)) { return "Oppo A1603"; }
        else if ("A51".equals(model)) { return "Oppo A51"; }
        else if ("A52".equals(model)) { return "Lava A52"; }
        else if ("A54".equals(model)) { return "Micromax A54"; }
        else if ("A57".equals(model)) { return "Micromax A57"; }
        else if ("ASUS_Z011D".equals(model)) { return "Asus ZenFone 2 Laser (ZE601KL)"; }
        else if ("A5C".equals(model)) { return "TaiwanMobile A5C"; }
        else if ("ADR8995".equals(model)) { return "Pantech Apache"; }
        else if ("AT7-A".equals(model)) { return "Toshiba AT7-A"; }
        else if ("AV7".equals(model)) { return "AV7"; }
        else if ("A110Q".equals(model)) { return "Micromax CANVAS 2 PLUS"; }
        else if ("A53w".equals(model)) { return "Oppo A53w"; }
        else if ("A53f".equals(model)) { return "Oppo A53f"; }
        else if ("A240".equals(model)) { return "Micromax A240"; }
        else if ("A91".equals(model)) { return "Micromax A91"; }
        else if ("A1-713HD".equals(model)) { return "Acer Iconia Tab 7"; }
        else if ("ASUS_Z008D".equals(model)) { return "Asus ZenFone 2 (ZE550ML)"; }
        else if ("ASUS_Z00MD".equals(model)) { return "Asus ZenFone 2 Laser (ZE600KL)"; }
        else if ("Atom".equals(model)) { return "Explay Atom"; }
        else if ("A716_Inspire_Life".equals(model)) { return "Gtel A716 Inspire Life"; }
        else if ("A3-A30".equals(model)) { return "Acer A3-A30"; }
        else if ("ATV".equals(model)) { return "Explay ATV"; }
        else if ("A51w".equals(model)) { return "Oppo A51w"; }
        else if ("A51f".equals(model)) { return "Oppo A51fa"; }
        else if ("A511".equals(model)) { return "Acer Iconia Tab A511"; }
        else if ("A510".equals(model)) { return "Acer Iconia Tab A510"; }
        else if ("AO5510".equals(model)) { return "Yureka"; }
        else if ("AT7003".equals(model)) { return "Haier AT7003"; }
        else if ("ATH-TL00".equals(model)) { return "Huawei ATH-TL00"; }
        else if ("ADR6425LVW".equals(model)) { return "HTC Rezound 4G"; }
        else if ("A3-A11".equals(model)) { return "Acer A3-A11"; }
        else if ("A3-A10".equals(model)) { return "Acer A3-A10"; }
        else if ("Aquaris_M4.5".equals(model)) { return "bq Aquaris M4.5"; }
        else if ("a5".equals(model)) { return "ZTE Blade"; }
        else if ("a4".equals(model)) { return "Southern Telecom a4"; }
        else if ("AN200".equals(model)) { return "SK Telesys AN200"; }
        else if ("AT400".equals(model)) { return "Toshiba AT400"; }
        else if ("AS985".equals(model)) { return "LGE LG G3"; }
        else if ("AS986".equals(model)) { return "LGE LG G4"; }
        else if ("AX1020".equals(model)) { return "BMobile AX1020"; }
        else if ("AT300SE".equals(model)) { return "Toshiba AT400"; }
        else if ("ASUS_Z00LD".equals(model)) { return "Asus ZenFone 2 Laser (ZE550KL)"; }
        else if ("ASUS_T00P".equals(model)) { return "Asus ZenFone 5 LTE (A500KL)"; }
        else if ("ASUS_X013DA".equals(model)) { return "Asus Zenfone GO"; }
        else if ("ASUS_X013DB".equals(model)) { return "Asus ZenFone Go"; }
        else if ("ADR6410LVW".equals(model)) { return "HTC Droid Incredible 4G"; }
        else if ("ADR6300".equals(model)) { return "HTC Droid Incredible"; }
        else if ("ADR930L".equals(model)) { return "Pantech ADR930L"; }
        else if ("ASUS_T00T".equals(model)) { return "Asus PadFone X mini (PF450CL)"; }
        else if ("ASUS_T00Q".equals(model)) { return "Asus ZenFone 4 (A450CG)"; }
        else if ("ASUS_T00N".equals(model)) { return "Asus PadFone S (PF500KL)"; }
        else if ("ASUS_T00J".equals(model)) { return "Asus ZenFone 5"; }
        else if ("ASUS_T00K".equals(model)) { return "Asus ZenFone 5 (A502CG)"; }
        else if ("ASUS_T00I".equals(model)) { return "Asus ZenFone 4 (A400CG)"; }
        else if ("ASUS_T00F".equals(model)) { return "Asus ZenFone 5 (A500CG)"; }
        else if ("ASUS_T00G".equals(model)) { return "Asus ZenFone 6 (A600CG)"; }
        else if ("ASUS_T00E".equals(model)) { return "Asus PadFone mini"; }
        else if ("ASUS_Z00UD".equals(model)) { return "Asus ZenFone Selfie (ZD551KL)"; }
        else if ("A712".equals(model)) { return "Astro Queo A712"; }
        else if ("A-TT00".equals(model)) { return "Haier A-TT00"; }
        else if ("A3-A20FHD".equals(model)) { return "Acer Iconia Tab 10"; }
        else if ("A100".equals(model)) { return "ZTE V9"; }
        else if ("ATH-AL00".equals(model)) { return "Huawei ATH-AL00"; }
        else if ("ASUS_Z00WD".equals(model)) { return "Asus ZenFone 2 Laser (ZE550KG)"; }
        else if ("ALCATEL_ONE_TOUCH_5020X_Orange".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("AST21".equals(model)) { return "Asus MeMO Pad 8 (AST21)"; }
        else if ("ADR6410LRA".equals(model)) { return "HTC DROID Incredible 4G LTE"; }
        else if ("AP54".equals(model)) { return "Haier AP54"; }
        else if ("A1-713".equals(model)) { return "Acer Iconia Tab 7"; }
        else if ("AK815".equals(model)) { return "LGE G Pad 8+"; }
        else if ("ALCATEL_one_touch_990S".equals(model)) { return "TCT (Alcatel) One Touch 990S"; }
        else if ("ALCATEL_one_touch_990A".equals(model)) { return "TCT (Alcatel) One Touch 990A"; }
        else if ("AT374".equals(model)) { return "Toshiba AT7-B"; }
        else if ("A2107A-H".equals(model)) { return "Lenovo A2107A"; }
        else if ("ALCATEL_one_touch_908".equals(model)) { return "TCT (Alcatel) One Touch 908"; }
        else if ("ASUS_X014D".equals(model)) { return "Asus Zenfone GO"; }
        else if ("A31c".equals(model)) { return "Oppo A31c"; }
        else if ("A31u".equals(model)) { return "Oppo A31u"; }
        else if ("A31t".equals(model)) { return "Oppo A13t"; }
        else if ("AS01M".equals(model)) { return "Cathay AS01M"; }
        else if ("ADR6410OM".equals(model)) { return "HTC DROID Incredible 4G LTE"; }
        else if ("A1-830".equals(model)) { return "Acer A1-830"; }
        else if ("AX660".equals(model)) { return "BMobile AX660"; }
        else if ("AM-H200".equals(model)) { return "TCT (Alcatel) Sol"; }
        else if ("ADR910L".equals(model)) { return "Pantech ADR910L"; }
        else if ("AQ710A".equals(model)) { return "Intel AQ710A"; }
        else if ("A6_Lite".equals(model)) { return "AllView A6 Lite"; }
        else if ("A08S".equals(model)) { return "AboCom A08SM"; }
        else if ("A33f".equals(model)) { return "Oppo A33f"; }
        else if ("A33t".equals(model)) { return "Oppo A33t"; }
        else if ("A33w".equals(model)) { return "Oppo A33w"; }
        else if ("ATH-TL00H".equals(model)) { return "Huawei ATH-TL00H"; }
        else if ("A101".equals(model)) { return "Acer Iconia Tab A100 (VanGogh)"; }
        else if ("Alcatel9007T".equals(model)) { return "TCT (Alcatel) Alcatel9007T"; }
        else if ("AX600C".equals(model)) { return "Panasonic AX600C"; }
        else if ("ASUS_Z00LDC".equals(model)) { return "Asus ZenFone 2 Laser (ZE550KL)"; }
        else if ("AC50DHE".equals(model)) { return "Archos 50 d Helium"; }
        else if ("A7100_X3".equals(model)) { return "Gtel A7100 X3"; }
        else if ("A463BG".equals(model)) { return "TCT (Alcatel) Pixi3-3.5 TF"; }
        else if ("AX501Q".equals(model)) { return "AllView AX501Q"; }
        else if ("A1-840FHD".equals(model)) { return "Acer Iconia Tab 8"; }
        else if ("alcatel_5098O".equals(model)) { return "TCT (Alcatel) 5098O"; }
        else if ("A520L".equals(model)) { return "TCT (Alcatel) A520L"; }
        else if ("A5801".equals(model)) { return "Cellon A5801"; }
        else if ("ALCATEL_ONE_TOUCH_7041X".equals(model)) { return "Alcatel One Touch Pop C7"; }
        else if ("A37f".equals(model)) { return "Oppo A37f"; }
        else if ("ADR3010".equals(model)) { return "TCT (Alcatel) ONE TOUCH Ultra 960c"; }
        else if ("ALCATEL_ONE_TOUCH_Fierce".equals(model)) { return "ALCATEL ONE TOUCH Fierce"; }
        else if ("AT7-B".equals(model)) { return "Toshiba AT7-B"; }
        else if ("AT7-C".equals(model)) { return "Toshiba AT7-C"; }
        else if ("ALCATEL_one_touch_918A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 918A"; }
        else if ("ALCATEL_one_touch_983".equals(model)) { return "TCT (Alcatel) ONE TOUCH 983"; }
        else if ("ALCATEL_one_touch_985".equals(model)) { return "TCT (Alcatel) Alcatel one touch 985"; }
        else if ("ASUS_Z00AD".equals(model)) { return "Asus Zenfone 2"; }
        else if ("A27".equals(model)) { return "Micromax A27"; }
        else if ("Aloha".equals(model)) { return "LGE Ally"; }
        else if ("AX1060".equals(model)) { return "BMobile AX1060"; }
        else if ("A5_Easy_TM".equals(model)) { return "AllView A5 Easy"; }
        else if ("ASUS_Z00EDB".equals(model)) { return "Asus ZenFone 2 Laser (ZE500KL)"; }
        else if ("A1".equals(model)) { return "ZTE A1R"; }
        else if ("A3".equals(model)) { return "BenQ A3"; }
        else if ("A2".equals(model)) { return "ZTE A2"; }
        else if ("A5".equals(model)) { return "Southern Telecom A5"; }
        else if ("A6".equals(model)) { return "Polaroid A6"; }
        else if ("AZDroid".equals(model)) { return "AZBox AZDroid"; }
        else if ("A5_Quad_Plus".equals(model)) { return "AllView A5 Quad Plus"; }
        else if ("archer".equals(model)) { return "Samsung Galaxy A"; }
        else if ("AX1055".equals(model)) { return "BMobile AX1055"; }
        else if ("A920".equals(model)) { return "AZPEN A920"; }
        else if ("A846L".equals(model)) { return "TCT (Alcatel) A846L"; }
        else if ("A210".equals(model)) { return "Micromax CANVAS 4"; }
        else if ("A211".equals(model)) { return "Acer Iconia Tab A211"; }
        else if ("ASUS_Z010DA".equals(model)) { return "Asus Zenfone MAX"; }
        else if ("ASUS_Z010DB".equals(model)) { return "Asus Zenfone MAX"; }
        else if ("A460G".equals(model)) { return "TCT (Alcatel) Pixi3-4 TF"; }
        else if ("AK330S".equals(model)) { return "Acer AK330s"; }
        else if ("A6S".equals(model)) { return "TaiwanMobile A6S"; }
        else if ("A67".equals(model)) { return "Lava A67"; }
        else if ("ASUS_Z00ED".equals(model)) { return "Asus ZenFone 2 Laser (ZE500KL)"; }
        else if ("AA3-600".equals(model)) { return "Acer Aspire A3"; }
        else if ("ALE-L02".equals(model)) { return "Huawei ALE-L02"; }
        else if ("Ally".equals(model)) { return "LGE Ally"; }
        else if ("A1-841".equals(model)) { return "Acer Iconia Tab 8"; }
        else if ("A1-840".equals(model)) { return "Acer Iconia Tab 8"; }
        else if ("ASUS_Z00XS".equals(model)) { return "Asus ZenFone Zoom (ZX551ML)"; }
        else if ("ALCATEL_ONE_TOUCH_4005D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4005D"; }
        else if ("A4C".equals(model)) { return "ZTE Bouygues Telecom Bs 402"; }
        else if ("A44".equals(model)) { return "Micromax A44"; }
        else if ("A45".equals(model)) { return "Micromax A45"; }
        else if ("ADR6400L".equals(model)) { return "HTC Thunderbolt"; }
        else if ("A7_Lite".equals(model)) { return "AllView A7 Lite"; }
        else if ("ALE-L23".equals(model)) { return "Huawei ALE-L23"; }
        else if ("ALE-L21".equals(model)) { return "Huawei ALE-L21"; }
        else if ("AM506".equals(model)) { return "Amgoo AM506"; }
        else if ("A250".equals(model)) { return "Micromax CANVAS TURBO"; }
        else if ("AM-H100".equals(model)) { return "TCT (Alcatel) AM-H100"; }
        else if ("Arc".equals(model)) { return "Kobo Arc"; }
        else if ("A5_Lite".equals(model)) { return "AllView A5 Lite"; }
        else if ("A5_Easy".equals(model)) { return "AllView A5 Easy"; }
        else if ("A068".equals(model)) { return "Micromax BOLT"; }
        else if ("ASUS_Z002".equals(model)) { return "Asus ZenFone 6 (A601CG)"; }
        else if ("ASUS_Z007".equals(model)) { return "Asus ZenFone C (ZC451CG)"; }
        else if ("A3-A20".equals(model)) { return "Acer Iconia Tab 10"; }
        else if ("A500".equals(model)) { return "Acer Picasso"; }
        else if ("A501".equals(model)) { return "Acer Picasso"; }
        else if ("A6_Duo".equals(model)) { return "AllView A6 Duo"; }
        else if ("A87".equals(model)) { return "Micromax A87"; }
        else if ("A84".equals(model)) { return "Micromax A84"; }
        else if ("A88".equals(model)) { return "Micromax A88"; }
        else if ("A89".equals(model)) { return "Micromax A89"; }
        else if ("AZ210A".equals(model)) { return "Intel Orange San Diego"; }
        else if ("AZ210B".equals(model)) { return "Intel Orange avec Intel Inside"; }
        else if ("ALCATEL_ONE_TOUCH_5020D_Orange".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("Aero1021/P1021HCBA4C1VXX".equals(model)) { return "Gigabyte TM105A"; }
        else if ("A51kc".equals(model)) { return "Oppo A51kc"; }
        else if ("ALCATEL_ONE_TOUCH_985".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 985"; }
        else if ("A37fw".equals(model)) { return "Oppo A37fw"; }
        else if ("A554C".equals(model)) { return "TCT (Alcatel) Juke-A554C"; }
        else if ("ADR6350".equals(model)) { return "HTC Droid Incredible 2"; }
        else if ("ASUS_Z00ADB".equals(model)) { return "Asus ZenFone 2 (ZE551ML)"; }
        else if ("AV10".equals(model)) { return "AV10"; }
        else if ("Amazing_P5".equals(model)) { return "ZTE myPad P5"; }
        else if ("ALCATEL_ONE_TOUCH_5035X".equals(model)) { return "Alcatel One Touch X Pop"; }
        else if ("Ahiga".equals(model)) { return "Mobiwire Ahiga"; }
        else if ("ALCATEL_one_touch_903".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 903"; }
        else if ("AQT80".equals(model)) { return "Sprint Slate 8 Tablet"; }
        else if ("AS876".equals(model)) { return "LGE LG-AS876"; }
        else if ("ALCATEL_one_touch_906Y".equals(model)) { return "TCT (Alcatel) One Touch 906"; }
        else if ("Alcatel_one_touch_908F_Orange".equals(model)) { return "TCT (Alcatel) One Touch 908"; }
        else if ("A3-A40".equals(model)) { return "Acer A3-A40"; }
        else if ("ADR6330VW".equals(model)) { return "HTC Rhyme"; }
        else if ("AT1S0".equals(model)) { return "Toshiba Thrive 7"; }
        else if ("AQT100".equals(model)) { return "Sprint AQT100"; }
        else if ("ASUS_Z00RD".equals(model)) { return "Asus ZenFone 2 Laser (ZE500KG)"; }
        else if ("A700".equals(model)) { return "Acer Iconia Tab A700"; }
        else if ("A701".equals(model)) { return "Acer Iconia Tab A701"; }
        else if ("A1-724".equals(model)) { return "Acer Iconia TalkTab 7"; }
        else if ("ASUS_Z00TD".equals(model)) { return "Asus ZenFone 2 Laser (ZE551KL)"; }
        else if ("A80RG11".equals(model)) { return "Archos Quechua Tablet 8"; }
        else if ("A720".equals(model)) { return "AZPEN A720"; }
        else if ("A853".equals(model)) { return "Motorola Droid"; }
        else if ("A854".equals(model)) { return "Motorola Droid"; }
        else if ("A1601fw".equals(model)) { return "Oppo A1601fw"; }
        else if ("ASUS_Transformer_Pad_TF300T".equals(model)) { return "Asus Transformer Pad"; }
        else if ("AND1E".equals(model)) { return "Philips Android 2014"; }
        else if ("A111".equals(model)) { return "Micromax A111"; }
        else if ("A110".equals(model)) { return "Acer A110"; }
        else if ("A116".equals(model)) { return "Micromax A116"; }
        else if ("ASUS_Z00UDA".equals(model)) { return "Asus ZenFone Selfie (ZD551KL)"; }
        else if ("A11t".equals(model)) { return "Oppo A11t"; }
        else if ("A11w".equals(model)) { return "OPPO A11w"; }
        else if ("A11f".equals(model)) { return "Oppo A11f"; }
        else if ("AC50BHE".equals(model)) { return "Archos 50b Helium"; }
        else if ("AS740".equals(model)) { return "LGE Ally"; }
        else if ("ASUS_Transformer_Pad_TF700T".equals(model)) { return "ASUS Transformer Pad Infinity"; }
        else if ("ALCATEL_one_touch_918".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 918"; }
        else if ("AX7OO".equals(model)) { return "BMobile AX700"; }
        else if ("A714_Vivo_Play".equals(model)) { return "Gtel A714 Vivo Play"; }
        else if ("A53fw".equals(model)) { return "Oppo A53fw"; }
        else if ("AD7003".equals(model)) { return "COMIO AD7003"; }
        else if ("Aster".equals(model)) { return "Vertu Aster"; }
        else if ("A40C".equals(model)) { return "Azumi A40C"; }
        else if ("AT100".equals(model)) { return "Toshiba AT100"; }
        else if ("AX4Nano_plus".equals(model)) { return "AllView AX4 Nano Plus"; }
        else if ("ATH-CL00".equals(model)) { return "Huawei ATH-CL00"; }
        else if ("Aquaris_E4.5".equals(model)) { return "bq Aquaris E4.5"; }
        else if ("Akta_A4".equals(model)) { return "GSmart Akta A4"; }
        else if ("AC45BHE".equals(model)) { return "Archos 45b Helium"; }
        else if ("AX1030".equals(model)) { return "BMobile AX1030"; }
        else if ("Aura_Power".equals(model)) { return "Karbonn Aura Power"; }
        else if ("asus_google_cube".equals(model)) { return "Asus Cube"; }
        else if ("Antares".equals(model)) { return "Tonino Lamborghini Antares"; }
        else if ("ASUS_Z00ADA".equals(model)) { return "Asus ZenFone 2 (ZE551ML)"; }
        else if ("A521L".equals(model)) { return "TCT (Alcatel) A521L"; }
        else if ("ALCATEL_one_touch_990".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("ALCATEL_one_touch_995".equals(model)) { return "TCT (Alcatel) ATEL ONE TOUCH 995"; }
        else if ("A33".equals(model)) { return "Oppo A33"; }
        else if ("A31".equals(model)) { return "Oppo A31"; }
        else if ("A5_Quad_Plus_TM".equals(model)) { return "AllView A5 Quad Plus"; }
        else if ("ATH-UL00".equals(model)) { return "Huawei ATH-UL00"; }
        else if ("A1-810".equals(model)) { return "Acer Iconia A1-810"; }
        else if ("A1-811".equals(model)) { return "Acer A1-811"; }
        else if ("A0001".equals(model)) { return "OnePlus One"; }
        else if ("ASUS_T00I-D".equals(model)) { return "Asus ZenFone 4 (A400CG)"; }
        else if ("Air".equals(model)) { return "Mobicell Air"; }
        else if ("A17".equals(model)) { return "Toshiba AT7-C"; }
        else if ("A11".equals(model)) { return "Oppo A11"; }
        else if ("A1P".equals(model)) { return "ZTE A1P"; }
        else if ("A1R".equals(model)) { return "ZTE A1R"; }
        else if ("AK330".equals(model)) { return "Acer Liquid Gallant E350"; }
        else if ("A01SH".equals(model)) { return "Sharp A01SH"; }
        else if ("A955".equals(model)) { return "Motorola Droid II"; }
        else if ("A953".equals(model)) { return "Motorola Milestone2"; }
        else if ("A726_Infinity_Lite".equals(model)) { return "Gtel A726 Infinity Lite"; }
        else if ("A450TL".equals(model)) { return "TCT (Alcatel) A450TL"; }
        else if ("Andromax-c".equals(model)) { return "Hisense Andromax-c"; }
        else if ("A621BL".equals(model)) { return "TCT (Alcatel) A621BL"; }
        else if ("A79".equals(model)) { return "HKC A79 Tablet"; }
        else if ("A78".equals(model)) { return "Micromax A78"; }
        else if ("A75".equals(model)) { return "Micromax A75"; }
        else if ("A73".equals(model)) { return "Micromax A73"; }
        else if ("A71".equals(model)) { return "Lava A71"; }
        else if ("AS650C".equals(model)) { return "Panasonic AS650C"; }
        else if ("A930".equals(model)) { return "Enspert MG"; }
        else if ("ASUS_Z010D".equals(model)) { return "Asus Zenfone MAX (ZC550KL)"; }
        else if ("ASUS_Z00YD".equals(model)) { return "ASUS Live"; }
        else if ("A1-850".equals(model)) { return "Acer Iconia One 8"; }
        else if ("A205".equals(model)) { return "Toshiba Astro-20"; }
        else if ("A204".equals(model)) { return "Toshiba A204"; }
        else if ("A200".equals(model)) { return "Acer Iconia Tab A200"; }
        else if ("Aquaris_A4.5".equals(model)) { return "bq Aquaris A4.5"; }
        return "";

    }
    public static String cMethod (String model) {
        if ("CT50".equals(model)) { return "Honeywell Dolphin CT50"; }
        else if ("C6943".equals(model)) { return "Sony Ericsson Xperia Z1"; }
        else if ("CK07T".equals(model)) { return "ClickN Kids"; }
        else if ("CHM-U01".equals(model)) { return "Huawei CHM-U01"; }
        else if ("C6616".equals(model)) { return "Sony Xperia Z"; }
        else if ("C5120".equals(model)) { return "Kyocera Milano"; }
        else if ("C5121".equals(model)) { return "Kyocera Milano"; }
        else if ("Cosmic".equals(model)) { return "Explay Cosmic"; }
        else if ("Coolpad7920".equals(model)) { return "Coolpad7920"; }
        else if ("chagall".equals(model)) { return "Pegatron chagall"; }
        else if ("calgary".equals(model)) { return "Motorola Devour"; }
        else if ("CT10".equals(model)) { return "IDeaUSA CT10"; }
        else if ("C6903".equals(model)) { return "Sony Xperia Z1"; }
        else if ("C6902".equals(model)) { return "Sony Xperia Z1"; }
        else if ("C6906".equals(model)) { return "Sony Ericsson Xperia Z1"; }
        else if ("Che1-CL20".equals(model)) { return "Huawei Che1-CL20"; }
        else if ("Coolpad8295M".equals(model)) { return "Coolpad CP8295M"; }
        else if ("C1+".equals(model)) { return "Condor C1+"; }
        else if ("Coolpad8908".equals(model)) { return "Coolpad8908"; }
        else if ("CINKPLUS".equals(model)) { return "Enspert WIKO CINK+"; }
        else if ("Clear".equals(model)) { return "Wintec T750"; }
        else if ("Coolmini".equals(model)) { return "Coolpad Coolmini"; }
        else if ("Connect503".equals(model)) { return "Logicom Connect503"; }
        else if ("Connect502".equals(model)) { return "Sourcing Creation Connect502"; }
        else if ("Connect504".equals(model)) { return "Sourcing Creation Connect 504"; }
        else if ("Coolpad8198T".equals(model)) { return "Coolpad8198T"; }
        else if ("C9660".equals(model)) { return "YotaPhone C9660"; }
        else if ("Clempad2_XL".equals(model)) { return "Clementoni Clempad 4.4 XL"; }
        else if ("C1904".equals(model)) { return "Sony Xperia M"; }
        else if ("C1905".equals(model)) { return "Sony Xperia M"; }
        else if ("CKT3".equals(model)) { return "ESI Enterprises CKT3"; }
        else if ("C5503".equals(model)) { return "Sony Xperia ZR"; }
        else if ("Carl".equals(model)) { return "ZTE Racer"; }
        else if ("CSL_Spice_MI700".equals(model)) { return "Foxconn CSL Spice MI700"; }
        else if ("C8690".equals(model)) { return "Cellon CJ-1984"; }
        else if ("Che1-L04".equals(model)) { return "Huawei Che1-L04"; }
        else if ("C6Quad_4G".equals(model)) { return "AllView C6 Quad 4G"; }
        else if ("Cygnus45".equals(model)) { return "MobiWire Cygnus"; }
        else if ("CMB405".equals(model)) { return "Hisense CMB405"; }
        else if ("Che2-L11".equals(model)) { return "Huawei Che2-L11"; }
        else if ("Clempad_HR".equals(model)) { return "Clementoni Clempad HR"; }
        else if ("CT726".equals(model)) { return "Carrefour CT726"; }
        else if ("Cherry_Mobile_Touch_HD".equals(model)) { return "Cherry Mobile Touch HD"; }
        else if ("CHERRY".equals(model)) { return "Mobicell CHERRY"; }
        else if ("Cynus_F10".equals(model)) { return "Mobistel Cynus F10"; }
        else if ("C6843".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("Cynus_F9_4G".equals(model)) { return "Mobistel Cynus F9 4G"; }
        else if ("CT7".equals(model)) { return "IDeaUSA CT7"; }
        else if ("CT3".equals(model)) { return "Olive Oil OliveOil Model 3"; }
        else if ("CT8".equals(model)) { return "iDea USA CT8"; }
        else if ("C5215".equals(model)) { return "Kyocera Hydro EDGE"; }
        else if ("CF10".equals(model)) { return "Saltillo CF10"; }
        else if ("C15150m".equals(model)) { return "KD Interactive C15150m"; }
        else if ("CD8100".equals(model)) { return "Kyocera LifeWatch Universal Gateway"; }
        else if ("C14100".equals(model)) { return "KD Interactive Kurio Tab - Extrem"; }
        else if ("C6802".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("C6806".equals(model)) { return "Sony Ericsson Xperia Z Ultra"; }
        else if ("CP-DX70".equals(model)) { return "Cisco Desktop Collaboration Experience DX70"; }
        else if ("CLEMPADCALL".equals(model)) { return "Clementoni Clempad Call"; }
        else if ("C525c".equals(model)) { return "HTC One SV"; }
        else if ("C6750".equals(model)) { return "Kyocera Hydro Elite"; }
        else if ("C6806_GPe".equals(model)) { return "Sony Smartphone Z Ultra Google Play edition"; }
        else if ("Cinema".equals(model)) { return "Enspert DARKSIDE"; }
        else if ("CT1020W".equals(model)) { return "Carrefour CT1020W"; }
        else if ("CMP749".equals(model)) { return "Anydata iCraig CMP749"; }
        else if ("CMP748".equals(model)) { return "Anydata iCraig CMP748"; }
        else if ("Cybook-Tablet".equals(model)) { return "Booken Cybook Tablet"; }
        else if ("C6730".equals(model)) { return "Kyocera Hydro Icon"; }
        else if ("CETAB9ML9".equals(model)) { return "Haier CETAB9ML9"; }
        else if ("CEH1".equals(model)) { return "Sanyo CEH1"; }
        else if ("Clempad2_special".equals(model)) { return "Clementoni Clempad 4.4 Basic Special"; }
        else if ("CS180".equals(model)) { return "Infocus CS1 8.0"; }
        else if ("CHM-CL00".equals(model)) { return "Huawei CHM-CL00"; }
        else if ("C1504".equals(model)) { return "Sony Xperia E"; }
        else if ("C1505".equals(model)) { return "Sony Xperia E"; }
        else if ("Clempad_HR_Plus".equals(model)) { return "Clementoni Clempad HR Plus"; }
        else if ("Cygnus".equals(model)) { return "MobiWire Cygnus"; }
        else if ("C6506".equals(model)) { return "Sony Xperia ZL"; }
        else if ("C6503".equals(model)) { return "Sony Xperia ZL"; }
        else if ("C6502".equals(model)) { return "Sony Xperia ZL"; }
        else if ("CMB501".equals(model)) { return "Hisense CMB501"; }
        else if ("C5170".equals(model)) { return "Kyocera Hydro"; }
        else if ("CUBOT_ONE".equals(model)) { return "Cubot One"; }
        else if ("C6522".equals(model)) { return "Kyocera Hydro XTRM"; }
        else if ("C6740N".equals(model)) { return "Kyocera Hydro WAVE"; }
        else if ("CT1000".equals(model)) { return "Nuvision TM1088"; }
        else if ("CP-D403".equals(model)) { return "Megahouse CP-D403"; }
        else if ("CETAB7ML9".equals(model)) { return "Haier CETAB7ML9"; }
        else if ("C2105".equals(model)) { return "Sony Xperia L"; }
        else if ("C2104".equals(model)) { return "Sony Xperia L"; }
        else if ("C2107".equals(model)) { return "Infocus C7"; }
        else if ("Cygnus_mini".equals(model)) { return "Mobiwire Cygnus mini"; }
        else if ("Comet".equals(model)) { return "Huawei IDEOS"; }
        else if ("C600".equals(model)) { return "QLA C600"; }
        else if ("CI".equals(model)) { return "Cellon CI"; }
        else if ("Coolpad8085Q".equals(model)) { return "Coolpad8085Q"; }
        else if ("Commtiva-N700".equals(model)) { return "Foxconn Commtiva N700"; }
        else if ("C6606".equals(model)) { return "Sony Xperia Z"; }
        else if ("C6602".equals(model)) { return "Sony Xperia Z"; }
        else if ("C6603".equals(model)) { return "Sony Xperia Z"; }
        else if ("C02BB1".equals(model)) { return "KDDI Power Up Unit"; }
        else if ("CER2".equals(model)) { return "Sanyo CER2"; }
        else if ("CER3".equals(model)) { return "Sanyo CER3"; }
        else if ("C6530N".equals(model)) { return "Kyocera Hydro Life"; }
        else if ("CP3700A".equals(model)) { return "Coolpad 3700A"; }
        else if ("C6916".equals(model)) { return "Sony Xperia Z1S"; }
        else if ("Che1-CL10".equals(model)) { return "Huawei Che1-CL10"; }
        else if ("CHC-U23".equals(model)) { return "Huawei CHC-U23"; }
        else if ("Clempad_HR_XL".equals(model)) { return "Clementoni Clempad 5.0 XL"; }
        else if ("C6522N".equals(model)) { return "Kyocera Hydro XTRM"; }
        else if ("CMP797".equals(model)) { return "iCraig CMP797"; }
        else if ("CMP793".equals(model)) { return "iCraig CMP793"; }
        else if ("CMP791".equals(model)) { return "iCraig CMP791"; }
        else if ("CMP798".equals(model)) { return "iCraig CMP798"; }
        else if ("CHC-U01".equals(model)) { return "Huawei CHC-U01"; }
        else if ("CHC-U03".equals(model)) { return "Huawei CHC-U03"; }
        else if ("C1605".equals(model)) { return "Sony Xperia E dual"; }
        else if ("C1604".equals(model)) { return "Sony Xperia E dual"; }
        else if ("C20".equals(model)) { return "Hisense c20ae"; }
        else if ("Connect551".equals(model)) { return "Sourcing Creation Connect551"; }
        else if ("Classic".equals(model)) { return "GSmart Classic"; }
        else if ("CETAB10KML9".equals(model)) { return "Haier CETAB10KML9"; }
        else if ("Coolpad8750".equals(model)) { return "Coolpad CP8750"; }
        else if ("C15100m".equals(model)) { return "KD Interactive C15100m"; }
        else if ("C15100i".equals(model)) { return "KD Interactive C15100i"; }
        else if ("Chacer".equals(model)) { return "AG Mobile Chacer"; }
        else if ("CT710".equals(model)) { return "Anydata Carrefour CT710"; }
        else if ("C8817D".equals(model)) { return "Huawei C8817D"; }
        else if ("CT2200".equals(model)) { return "Quanta CT2200"; }
        else if ("C8660".equals(model)) { return "Cellon SM55"; }
        else if ("CARBON_PRO4543".equals(model)) { return "Polaroid V45M"; }
        else if ("C-4".equals(model)) { return "Hisense C-4"; }
        else if ("C2004".equals(model)) { return "Sony Xperia M dual"; }
        else if ("C2005".equals(model)) { return "Sony Xperia M dual"; }
        else if ("C6833".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("C3668".equals(model)) { return "Cellon C3668"; }
        else if ("CP-DX80".equals(model)) { return "Cisco Desktop Collaboration Experience DX80"; }
        else if ("Coolpad_5218D".equals(model)) { return "Coolpad5218D"; }
        else if ("Che2-L23".equals(model)) { return "Huawei Che2-L23"; }
        else if ("CEA3".equals(model)) { return "Sanyo CEA3"; }
        else if ("CEA1".equals(model)) { return "Sanyo CEA1"; }
        else if ("Che2-UL00".equals(model)) { return "Huawei Che2-UL00"; }
        else if ("CJ-1984".equals(model)) { return "Cellon CJ-1984"; }
        else if ("Che2-TL00M".equals(model)) { return "Huawei Che2-TL00M"; }
        else if ("Che2-TL00H".equals(model)) { return "Huawei Che2-TL00H"; }
        else if ("CT820".equals(model)) { return "Carrefour CT820"; }
        else if ("CT825".equals(model)) { return "Haier CT825"; }
        else if ("CT826".equals(model)) { return "Carrefour CT826"; }
        else if ("CP-DX650".equals(model)) { return "Cisco CP-DX650"; }
        else if ("C6743".equals(model)) { return "Kyocera Hydro REACH"; }
        else if ("C6742".equals(model)) { return "Kyocera Hydro VIEW"; }
        else if ("C6740".equals(model)) { return "Kyocera Hydro WAVE"; }
        else if ("CEM1".equals(model)) { return "Sanyo 55CE6139M1"; }
        else if ("C6725".equals(model)) { return "Kyocera Hydro VIBE"; }
        else if ("CDP7TAB4C8".equals(model)) { return "Haier CDP7TAB4C8"; }
        else if ("C6_Duo".equals(model)) { return "AllView C6 Duo"; }
        else if ("COUPLE".equals(model)) { return "Foxconn MUSN COUPLE"; }
        else if ("Che2-TL00".equals(model)) { return "Huawei Che2-TL00"; }
        else if ("CP-VL5A".equals(model)) { return "Hipstreet CP-VL5A"; }
        else if ("Clempad2_plus".equals(model)) { return "Clementoni Clempad 4.4 Plus"; }
        else if ("CMB510".equals(model)) { return "Hisense CMB510"; }
        else if ("CLP293".equals(model)) { return "iCraig CLP293"; }
        else if ("CT1030".equals(model)) { return "Haier CT1030"; }
        else if ("CM990".equals(model)) { return "Huawei Evolution III"; }
        else if ("C5502".equals(model)) { return "Sony Xperia ZR"; }
        else if ("Craft".equals(model)) { return "Explay Craft"; }
        else if ("C5155".equals(model)) { return "Kyocera Rise"; }
        else if ("C5302".equals(model)) { return "Sony Xperia SP"; }
        else if ("C5303".equals(model)) { return "Sony Xperia SP"; }
        else if ("C5306".equals(model)) { return "Sony Xperia SP"; }
        else if ("CS-1A13".equals(model)) { return "Dell Cloud Connect"; }
        else if ("C2305".equals(model)) { return "Sony Xperia C"; }
        else if ("C2304".equals(model)) { return "Sony Xperia C"; }
        else if ("C6530".equals(model)) { return "Kyocera Hydro LIFE"; }
        else if ("CT1010".equals(model)) { return "Enspert Carrefour CT1010"; }
        return "";

    }
    public static String bMethod (String model) {
        if ("b1-720".equals(model)) { return "Acer B1-720"; }
        else if ("B502".equals(model)) { return "BenQ B502"; }
        else if ("Bmobile_AX810".equals(model)) { return "BMobile AX810"; }
        else if ("b1-721".equals(model)) { return "Acer B1-721"; }
        else if ("BASE_Lutea_3".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 997D"; }
        else if ("BNT-710".equals(model)) { return "RCA BNT-710"; }
        else if ("B1-A71".equals(model)) { return "Acer B1-A71"; }
        else if ("B505".equals(model)) { return "BenQ B505"; }
        else if ("Beeline_Pro_3".equals(model)) { return "Beeline Pro 3"; }
        else if ("BKO-S200".equals(model)) { return "SK Broadband B tv smart"; }
        else if ("B1-820".equals(model)) { return "Acer B1-820"; }
        else if ("B502_SA".equals(model)) { return "BenQ B502"; }
        else if ("bq_Aquaris_5_HD".equals(model)) { return "bq Aquaris 5 HD"; }
        else if ("B8405".equals(model)) { return "ZTE V815W"; }
        else if ("B760H".equals(model)) { return "ZTE B760E"; }
        else if ("B760E".equals(model)) { return "ZTE B760E"; }
        else if ("Brilliant".equals(model)) { return "Explay Brilliant"; }
        else if ("B15".equals(model)) { return "CAT B15"; }
        else if ("BOSCH_E10316".equals(model)) { return "Medion LIFETAB E10316"; }
        else if ("B1-730HD".equals(model)) { return "Acer Iconia One 7"; }
        else if ("B1-750".equals(model)) { return "Acer Iconia One 7"; }
        else if ("BNT-700K".equals(model)) { return "BLUEDOT BNT-700K"; }
        else if ("BARRY".equals(model)) { return "WIKO Barry"; }
        else if ("B1-710".equals(model)) { return "Acer B1-710"; }
        else if ("B1-711".equals(model)) { return "Acer B1-711"; }
        else if ("B506_TW".equals(model)) { return "BenQ B506"; }
        else if ("BB8252".equals(model)) { return "Bigben BB8252"; }
        else if ("B1-730".equals(model)) { return "Acer Iconia One 7"; }
        else if ("BLADE_N880".equals(model)) { return "ZTE Blade"; }
        else if ("Boost".equals(model)) { return "AG Mobile Boost"; }
        else if ("BM180".equals(model)) { return "Bluebird BM180"; }
        else if ("BLOOM".equals(model)) { return "Wiko BLOOM"; }
        else if ("Bay".equals(model)) { return "HighScreen Bay"; }
        else if ("BT210".equals(model)) { return "Intel Yolo"; }
        else if ("Baker".equals(model)) { return "ZTE Baker"; }
        else if ("BT230".equals(model)) { return "Intel Etisalat E-20"; }
        else if ("bq_Aquaris_5".equals(model)) { return "bq Aquaris 5"; }
        else if ("BIRDY".equals(model)) { return "Wiko BIRDY"; }
        else if ("BP-1001".equals(model)) { return "WoongjinThinkbig"; }
        else if ("Bit".equals(model)) { return "Explay Bit"; }
        else if ("B-KOOL".equals(model)) { return "Wiko B-KOOL"; }
        else if ("B1-810".equals(model)) { return "Acer Iconia One 8"; }
        else if ("BouygtelTV".equals(model)) { return "Bouygues Telecom Bbox Miami"; }
        else if ("B1-850".equals(model)) { return "Acer B1-850"; }
        else if ("B15Q".equals(model)) { return "Cat B15Q"; }
        else if ("B1-723".equals(model)) { return "Acer B1-723"; }
        else if ("BS472".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("BHX-S100".equals(model)) { return "SK Broadband B tv smart"; }
        else if ("B50".equals(model)) { return "BenQ B50"; }
        return "";

    }
    public static String eMethod (String model) {
        if ("E6560T".equals(model)) { return "Kyocera DuraForce"; }
        else if ("E6560L".equals(model)) { return "Kyocera DuraForce"; }
        else if ("E6560C".equals(model)) { return "Kyocera DuraForce"; }
        else if ("E6833".equals(model)) { return "Sony Xperia Z5 Premium Dual"; }
        else if ("EVA-AL00".equals(model)) { return "Huawei P9"; }
        else if ("E2033".equals(model)) { return "Sony Xperia E4g Dual"; }
        else if ("Epic_P7".equals(model)) { return "Vonino Epic P7"; }
        else if ("E5653".equals(model)) { return "Sony Xperia M5"; }
        else if ("Eluga_A2".equals(model)) { return "Panasonic Eluga A2"; }
        else if ("EK-GN120".equals(model)) { return "Samsung Galaxy NX"; }
        else if ("E6853".equals(model)) { return "Sony Xperia Z5 Premium"; }
        else if ("E6782".equals(model)) { return "Kyocera Brigadier"; }
        else if ("EGQ780".equals(model)) { return "Ematic EGQ780"; }
        else if ("E3_Living".equals(model)) { return "AllView E3 Living"; }
        else if ("EGD172".equals(model)) { return "Ematic EGD172"; }
        else if ("E400".equals(model)) { return "NGM Italia SRL NGM Youcolor E400"; }
        else if ("E6683".equals(model)) { return "Sony Xperia Z5 dual"; }
        else if ("ETBW11AA".equals(model)) { return "ASUS ETBW11AA"; }
        else if ("EK-KC120S".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("EK-KC120L".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("E506plus".equals(model)) { return "NGM Italia SRL E506plus"; }
        else if ("EM01F".equals(model)) { return "Fujitsu ARROWS S EM01F"; }
        else if ("E9771".equals(model)) { return "Gigabyte E9771"; }
        else if ("EVA-L19".equals(model)) { return "Huawei P9"; }
        else if ("ETL-S5042".equals(model)) { return "Etuline ETL-S5042"; }
        else if ("ELITE8Q".equals(model)) { return "Prestige ELITE8Q"; }
        else if ("EG929".equals(model)) { return "Hisense EG929"; }
        else if ("EG970".equals(model)) { return "Hisense EG970"; }
        else if ("EGQ178".equals(model)) { return "Ematic EGQ178"; }
        else if ("EG680".equals(model)) { return "Smartfren EG680"; }
        else if ("E600".equals(model)) { return "Acer Liquid E600"; }
        else if ("EASY1".equals(model)) { return "ucall EASY1"; }
        else if ("E-Tab10".equals(model)) { return "GeneralMobile E-Tab10"; }
        else if ("eZeeTab10D12-S".equals(model)) { return "Storex eZeeTab10D12-S"; }
        else if ("E815".equals(model)) { return "BYD K-Touch E815"; }
        else if ("Elite8QS".equals(model)) { return "Prestige ELITE8QS"; }
        else if ("E10319".equals(model)) { return "Medion microstar E10319"; }
        else if ("E6715".equals(model)) { return "Kyocera TorqueXT"; }
        else if ("E6782L".equals(model)) { return "Kyocera DuraScout"; }
        else if ("Elite9QL".equals(model)) { return "Visual Land Prestige Elite9QL"; }
        else if ("E39".equals(model)) { return "Acer Liquid E700"; }
        else if ("EB-A71GJ".equals(model)) { return "Sharp EB-A71GJ"; }
        else if ("E5823".equals(model)) { return "Sony Xperia Z5 Compact"; }
        else if ("EVO".equals(model)) { return "HTC Evo"; }
        else if ("E2171SS".equals(model)) { return "Hisense Sero7"; }
        else if ("EM63".equals(model)) { return "DOPO EM63 Tablet"; }
        else if ("EGS017".equals(model)) { return "Ematic EGS017"; }
        else if ("E4_Lite".equals(model)) { return "AllView E4 Lite"; }
        else if ("E5803".equals(model)) { return "Sony Xperia Z5 Compact"; }
        else if ("EGQ307".equals(model)) { return "Ematic EGQ307"; }
        else if ("EGP008".equals(model)) { return "Anydata ematic EGP008"; }
        else if ("EuroleaguePhone".equals(model)) { return "Euroleague I7a"; }
        else if ("E5633".equals(model)) { return "Sony Xperia M5 Dual"; }
        else if ("EG606".equals(model)) { return "Hisense EG606"; }
        else if ("Elite13Q".equals(model)) { return "Visual Land Prestige Elite13Q"; }
        else if ("EG980".equals(model)) { return "SKnetworks EG980"; }
        else if ("ETL-S4521".equals(model)) { return "Etuline ETL-S4521"; }
        else if ("EB-4063-X".equals(model)) { return "Panasonic EB-4063-X"; }
        else if ("EVA-DL00".equals(model)) { return "Huawei P9"; }
        else if ("Eris".equals(model)) { return "HTC Droid Eris"; }
        else if ("E6653".equals(model)) { return "Sony Xperia Z5"; }
        else if ("E15i".equals(model)) { return "Sony Ericsson Xperia X8"; }
        else if ("Elite11Q".equals(model)) { return "Visual Land Prestige Elite11Q"; }
        else if ("E6883".equals(model)) { return "Sony Xperia Z5 Premium Dual"; }
        else if ("EM9".equals(model)) { return "Emerson EM9"; }
        else if ("ELUGA_I2".equals(model)) { return "Panasonic Eluga I2"; }
        else if ("EGQ347".equals(model)) { return "Ematic EGQ347"; }
        else if ("EVA-CL00".equals(model)) { return "Huawei P9"; }
        else if ("E6633".equals(model)) { return "Sony Xperia Z5 dual"; }
        else if ("ETH102".equals(model)) { return "Ematic ETH102"; }
        else if ("era_X".equals(model)) { return "Lava Xolo Era X"; }
        else if ("E5533".equals(model)) { return "Sony Xperia C5 Ultra Dual"; }
        else if ("EGQ367".equals(model)) { return "Ematic EGQ367"; }
        else if ("EGP010".equals(model)) { return "Anydata ematic EGP010"; }
        else if ("E506".equals(model)) { return "NGM Italia SRL NGM Youcolor E506"; }
        else if ("E507".equals(model)) { return "NGM Italia SRL NGM Youcolor E507"; }
        else if ("E505".equals(model)) { return "NGM Italia SRL NGM Youcolor E505"; }
        else if ("E500".equals(model)) { return "TCT (Alcatel) E500"; }
        else if ("E501".equals(model)) { return "NGM Italia SRL NGM Youcolor E501"; }
        else if ("EVIANT_EVT10Q".equals(model)) { return "Eviant EVC10Q"; }
        else if ("E2043".equals(model)) { return "Sony Xperia E4g Dual"; }
        else if ("E2281UK".equals(model)) { return "Hisense Sero 8"; }
        else if ("E5553".equals(model)) { return "Sony Xperia C5 Ultra"; }
        else if ("Elite8QI".equals(model)) { return "Visual Land Prestige Elite8QI"; }
        else if ("EK-GC110".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("Elite8QL".equals(model)) { return "Visual Land Prestige Elite8QL"; }
        else if ("E380".equals(model)) { return "Acer Liquid E3"; }
        else if ("E2281".equals(model)) { return "Hisense Sero 8"; }
        else if ("EV-S100".equals(model)) { return "KT Tech EV-S100"; }
        else if ("E3_Sign".equals(model)) { return "AllView E3 Sign"; }
        else if ("E2371CH".equals(model)) { return "Hisense E2371CH"; }
        else if ("EGQ223".equals(model)) { return "Ematic EGQ223"; }
        else if ("Explosion".equals(model)) { return "Cellon Explosion"; }
        else if ("E6790TM".equals(model)) { return "Kyocera DuraForce XD"; }
        else if ("E2171MX".equals(model)) { return "Hisense Sero 7"; }
        else if ("E2281SS".equals(model)) { return "Hisense Sero8"; }
        else if ("EVA-AL10".equals(model)) { return "Huawei P9"; }
        else if ("EVA-TL00".equals(model)) { return "Huawei P9"; }
        else if ("EM756".equals(model)) { return "Southern Telecom Emerson EM756"; }
        else if ("E1052GP".equals(model)) { return "LOGICOM E1052GP"; }
        else if ("E2171CA".equals(model)) { return "Hisense Sero 7"; }
        else if ("Endeavour101".equals(model)) { return "Nuvision TM1088"; }
        else if ("E2281MX".equals(model)) { return "Hisense Sero 8"; }
        else if ("E852GP".equals(model)) { return "LOGICOM E852GP"; }
        else if ("EGS102".equals(model)) { return "Anydata ematic EGS102"; }
        else if ("EGS109".equals(model)) { return "EMATICEGS109"; }
        else if ("EG98".equals(model)) { return "Hisense EG98"; }
        else if ("Event".equals(model)) { return "Event"; }
        else if ("eye3".equals(model)) { return "HKT eye3"; }
        else if ("eH811".equals(model)) { return "Huawei eH811"; }
        else if ("EK-GC200".equals(model)) { return "Samsung Galaxy Camera 2"; }
        else if ("EVA-L29".equals(model)) { return "Huawei P9"; }
        else if ("Elite7Q".equals(model)) { return "Prestige ELITE7Q"; }
        else if ("ELITE9Q".equals(model)) { return "Prestige ELITE9Q"; }
        else if ("E450".equals(model)) { return "NGM Italia SRL NGM Youcolor E450"; }
        else if ("EK-KC100K".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("EK-KC100S".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("E6533".equals(model)) { return "Sony Xperia Z3+ Dual"; }
        else if ("E8".equals(model)) { return "QMobile E8"; }
        else if ("E4".equals(model)) { return "Turk Telekom E4"; }
        else if ("EI".equals(model)) { return "Cellon EI"; }
        else if ("ET7050D".equals(model)) { return "Impecca ET7050D"; }
        else if ("E860".equals(model)) { return "Hisense E860"; }
        else if ("EGD103".equals(model)) { return "Ematic EGD103"; }
        else if ("EG978".equals(model)) { return "SKnetworks EG978TW"; }
        else if ("EG668".equals(model)) { return "SKnetworks EG68BE"; }
        else if ("EK-8680".equals(model)) { return "Cellon EK-8680"; }
        else if ("EF500".equals(model)) { return "Bluebird EF500"; }
        else if ("EG950".equals(model)) { return "Hisense EG950"; }
        else if ("E350".equals(model)) { return "Logicom E350"; }
        else if ("E5606".equals(model)) { return "Sony Xperia M5"; }
        else if ("E5603".equals(model)) { return "Sony Xperia M5"; }
        else if ("E6553".equals(model)) { return "Sony Xperia Z3+"; }
        else if ("Essentielb-Pixis".equals(model)) { return "essentielb Pyxis"; }
        else if ("E10i".equals(model)) { return "Sony Ericsson Xperia X10 Mini"; }
        else if ("E10a".equals(model)) { return "Sony Ericsson Xperia X10 mini"; }
        else if ("EverClassic".equals(model)) { return "Enspert WIKO CINK PEAX"; }
        else if ("EVC8Q".equals(model)) { return "Eviant EVC8Q"; }
        else if ("E505plus".equals(model)) { return "NGM Italia SRL E505 Plus"; }
        else if ("EGS004".equals(model)) { return "Anydata ematic EGS004"; }
        else if ("E2281CA".equals(model)) { return "Hisense Sero 8"; }
        else if ("Elite7QL".equals(model)) { return "Visual Land Prestige Elite7QL"; }
        else if ("Elite7QS".equals(model)) { return "Visual Land Prestige Elite7QS"; }
        else if ("E310".equals(model)) { return "Acer Liquid Mini"; }
        else if ("EB-L76G-B".equals(model)) { return "Sharp Media Tablet"; }
        else if ("E5643".equals(model)) { return "Sony Xperia M5 Dual"; }
        else if ("e-tab4".equals(model)) { return "General Mobile E-tab 4"; }
        else if ("Elite10Q".equals(model)) { return "Prestige ELITE10Q"; }
        else if ("E2371".equals(model)) { return "Hisense Sero7 LE"; }
        else if ("EGQ337".equals(model)) { return "Ematic EGQ337"; }
        else if ("E2171TK".equals(model)) { return "Hisense Sero 7"; }
        else if ("ECHO".equals(model)) { return "Mobicell ECHO"; }
        else if ("E5663".equals(model)) { return "Sony Xperia M5 Dual"; }
        else if ("era_4G".equals(model)) { return "Lava Era 4G"; }
        else if ("EVA-L09".equals(model)) { return "Huawei P9"; }
        else if ("EGD213".equals(model)) { return "Ematic EGD213"; }
        else if ("E2_Jump".equals(model)) { return "AllView E2 Jump"; }
        else if ("E5506".equals(model)) { return "Sony Xperia C5 Ultra"; }
        else if ("Elite10QI".equals(model)) { return "Visual Land Prestige Elite10QI"; }
        else if ("Elite10QL".equals(model)) { return "Visual Land Prestige Elite10QL"; }
        else if ("Elite10QS".equals(model)) { return "Visual Land Prestige Elite10QS"; }
        else if ("eZeeTab7D15-M".equals(model)) { return "Storex eZeeTab7D15-M"; }
        else if ("Easy".equals(model)) { return "Explay Easy"; }
        else if ("E270BSA".equals(model)) { return "Hisense E270BSA"; }
        else if ("E2053".equals(model)) { return "Sony Xperia E4g"; }
        else if ("E2281TK".equals(model)) { return "Hisense Sero 8"; }
        else if ("EGQ377".equals(model)) { return "Ematic EGQ377"; }
        else if ("EK-GC100".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("Elite".equals(model)) { return "Panasonic Elite 18"; }
        else if ("EveryPad2".equals(model)) { return "Lenovo A3500-F"; }
        else if ("E6603".equals(model)) { return "Sony Xperia Z5"; }
        else if ("E2070".equals(model)) { return "Hisense E2070"; }
        else if ("EGD078".equals(model)) { return "Ematic EGD078"; }
        else if ("EF400".equals(model)) { return "Bluebird EF400"; }
        else if ("EK-GC120".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("EGQ327M".equals(model)) { return "Ematic EGQ327M"; }
        else if ("E6508".equals(model)) { return "Sony Xperia Z4v"; }
        else if ("E601M".equals(model)) { return "Hisense E601M"; }
        else if ("EK-GN120A".equals(model)) { return "Samsung Galaxy NX"; }
        else if ("EveryPad".equals(model)) { return "Lenovo EveryPad"; }
        else if ("E5563".equals(model)) { return "Sony Xperia C5 Ultra Dual"; }
        else if ("EIII".equals(model)) { return "Cellon EIII"; }
        else if ("Etab5".equals(model)) { return "General Mobile Etab5"; }
        else if ("EK-GN100".equals(model)) { return "Samsung Galaxy Camera"; }
        return "";

    }
    public static String dMethod (String model) {
        if ("D000-000001-S85".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000010-N".equals(model)) { return "NEC LifeTouch Note"; }
        else if ("DA222HQL".equals(model)) { return "Acer DA222HQL"; }
        else if ("DA221HQL".equals(model)) { return "Acer DA221HQL"; }
        else if ("D2005".equals(model)) { return "Sony Xperia E1"; }
        else if ("D2004".equals(model)) { return "Sony Xperia E1"; }
        else if ("Dslide710".equals(model)) { return "Danew DSlide 710"; }
        else if ("DL900".equals(model)) { return "TCT (Alcatel) DL900"; }
        else if ("DM009SH".equals(model)) { return "Sharp DM009SH"; }
        else if ("DM-01H".equals(model)) { return "Sharp Disney Mobile on docomo DM-01H"; }
        else if ("DM-01G".equals(model)) { return "LGE DM-01G"; }
        else if ("D6683".equals(model)) { return "Sony Xperia Z3 Dual"; }
        else if ("D000-000011-N".equals(model)) { return "NEC LifeTouch Note"; }
        else if ("d-02H".equals(model)) { return "Huawei M2-802LD"; }
        else if ("D2212".equals(model)) { return "Sony Xperia E3 Dual"; }
        else if ("D2-961G".equals(model)) { return "Haier D2-961G"; }
        else if ("dTV01".equals(model)) { return "Huawei M220"; }
        else if ("D000-000001-K01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("Discovery".equals(model)) { return "Explay Discovery"; }
        else if ("DROID_Pro".equals(model)) { return "Motorola Droid Pro"; }
        else if ("D000-000001-C01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-S01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-S00".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-S05".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D2533".equals(model)) { return "Sony Xperia C3"; }
        else if ("DM016SH".equals(model)) { return "Sharp DM016SH"; }
        else if ("D000-000001-S25".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D2114".equals(model)) { return "Sony Xperia E1"; }
        else if ("D000-000013-101".equals(model)) { return "NEC LifeTouch B"; }
        else if ("d-01H".equals(model)) { return "Huawei M2-A04L"; }
        else if ("D6603".equals(model)) { return "Sony Xperia Z3"; }
        else if ("DMTAB-IN08A".equals(model)) { return "Nabi DreamTab HD8 Tablet"; }
        else if ("D000-000001-R04".equals(model)) { return "NEC LifeTouch S"; }
        else if ("DARKFULL".equals(model)) { return "WIKO DARKFULL"; }
        else if ("D000-000002-001".equals(model)) { return "NEC LifeTouch W"; }
        else if ("DARKNIGHT".equals(model)) { return "WIKO DARKNIGHT"; }
        else if ("DL701Q".equals(model)) { return "DigiLand DL701Q"; }
        else if ("D5106".equals(model)) { return "Sony Xperia T3"; }
        else if ("D5103".equals(model)) { return "Sony Xperia T3"; }
        else if ("D5102".equals(model)) { return "Sony Xperia T3"; }
        else if ("DDA800R".equals(model)) { return "iRiver DMT580D"; }
        else if ("D6643".equals(model)) { return "Sony Xperia Z3"; }
        else if ("D6646".equals(model)) { return "Sony Xperia Z3"; }
        else if ("DM010SH".equals(model)) { return "Sharp DM010SH"; }
        else if ("D000-000002-W01".equals(model)) { return "NEC LifeTouch W"; }
        else if ("D000-000002-W02".equals(model)) { return "NEC LifeTouch W"; }
        else if ("D2316".equals(model)) { return "Sony Xperia M2"; }
        else if ("D000-000018-004".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D5788".equals(model)) { return "Sony Xperia J1 Compact"; }
        else if ("Digital2-Deluxe".equals(model)) { return "Digital2 Deluxe"; }
        else if ("DARKSIDE".equals(model)) { return "Enspert DARKSIDE"; }
        else if ("DPA23D".equals(model)) { return "Dopo DPA23D"; }
        else if ("Desire_HD".equals(model)) { return "HTC Desire HD"; }
        else if ("D5316".equals(model)) { return "Sony Xperia T2 Ultra"; }
        else if ("D6502".equals(model)) { return "Sony Xperia Z2"; }
        else if ("D6503".equals(model)) { return "Sony Xperia Z2"; }
        else if ("DMC-CM1".equals(model)) { return "Panasonic LUMIX CM1"; }
        else if ("D000-000001-B02".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-B01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-R02".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-R03".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-R01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000007-D01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D819".equals(model)) { return "TCT (Alcatel) D819"; }
        else if ("DPM1081".equals(model)) { return "Dopo DPM1081"; }
        else if ("D2403".equals(model)) { return "Sony Xperia M2 Aqua"; }
        else if ("D2406".equals(model)) { return "Sony Xperia M2 Aqua"; }
        else if ("D6543".equals(model)) { return "Sony Xperia Z2"; }
        else if ("D6708".equals(model)) { return "Sony Xperia Z3v"; }
        else if ("D6563".equals(model)) { return "Sony Xperia Z2a"; }
        else if ("DA226HQ".equals(model)) { return "Acer DA226HQ"; }
        else if ("DM015K".equals(model)) { return "Kyocera DM015K"; }
        else if ("DROID2_GLOBAL".equals(model)) { return "Motorola Droid 2 Global"; }
        else if ("D5833".equals(model)) { return "Sony Xperia Z3 Compact"; }
        else if ("D2-751G".equals(model)) { return "Haier D2-751G"; }
        else if ("DMTAB-NV08B".equals(model)) { return "Nabi DreamTab HD8 Tablet"; }
        else if ("D2-927G".equals(model)) { return "Haier D2-927G"; }
        else if ("DL1010Q".equals(model)) { return "DigiLand DL1010Q"; }
        else if ("d-01G".equals(model)) { return "Huawei d-01G"; }
        else if ("dL1".equals(model)) { return "Panasonic ELUGA"; }
        else if ("Droid".equals(model)) { return "Motorola Droid"; }
        else if ("D2206".equals(model)) { return "Sony Xperia E3"; }
        else if ("D2203".equals(model)) { return "Sony Xperia E3"; }
        else if ("D2202".equals(model)) { return "Sony Xperia E3"; }
        else if ("DA222HQLA".equals(model)) { return "Acer DA222HQLA"; }
        else if ("DL1008M".equals(model)) { return "DigiLand DL1008M"; }
        else if ("D2502".equals(model)) { return "Sony Xperia C3 Dual"; }
        else if ("Devour".equals(model)) { return "Motorola Devour"; }
        else if ("DROID_BIONIC".equals(model)) { return "Motorola Droid Bionic"; }
        else if ("D45".equals(model)) { return "TCT (Alcatel) Soul 4.5"; }
        else if ("D2243".equals(model)) { return "Sony Xperia E3"; }
        else if ("D000-000018-102".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D000-000018-101".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D000-000018-104".equals(model)) { return "NEC LifeTouch B"; }
        else if ("DM011SH".equals(model)) { return "Sharp DM011SH"; }
        else if ("D5503".equals(model)) { return "Sony Xperia Z1"; }
        else if ("DM012SH".equals(model)) { return "Sharp DM012SH"; }
        else if ("DPM7827".equals(model)) { return "Dopo DPM7827"; }
        else if ("DROID_RAZR_HD".equals(model)) { return "Motorola Droid Razr HD"; }
        else if ("D5316N".equals(model)) { return "Sony Xperia T2 Ultra"; }
        else if ("D000-000019-001".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D2104".equals(model)) { return "Sony Xperia E1 dual"; }
        else if ("D2105".equals(model)) { return "Sony Xperia E1 dual"; }
        else if ("D6616".equals(model)) { return "Sony Xperiz Z3"; }
        else if ("DA220HQL".equals(model)) { return "Acer DA220HQL"; }
        else if ("DROID4".equals(model)) { return "Motorola Droid 4"; }
        else if ("DROID2".equals(model)) { return "Motorola Droid 2"; }
        else if ("DROID3".equals(model)) { return "Motorola Droid 3"; }
        else if ("D2-721G".equals(model)) { return "Haier D2-721"; }
        else if ("DROIDX".equals(model)) { return "Motorola Droid X"; }
        else if ("Dslide971DC".equals(model)) { return "DANEW Dslide971DC"; }
        else if ("D6633".equals(model)) { return "Sony Xperia Z3 Dual"; }
        else if ("DM013SH".equals(model)) { return "Sharp DM013SH"; }
        else if ("DM014SH".equals(model)) { return "Sharp Disney Mobile DM014SH"; }
        else if ("DL700D".equals(model)) { return "DigiLand DL700D"; }
        else if ("D2-M".equals(model)) { return "Hisense D2-M"; }
        else if ("DA241HL".equals(model)) { return "Acer DA241HL"; }
        else if ("DROID_X2".equals(model)) { return "Motorola Droid X2"; }
        else if ("DW-21(A)".equals(model)) { return "Wistron DW-21(A)"; }
        else if ("D000-000019-002".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D6653".equals(model)) { return "Sony Xperia Z3"; }
        else if ("D5306".equals(model)) { return "Sony Xperia T2 Ultra"; }
        else if ("DP-X1".equals(model)) { return "Onkyo DP-X1"; }
        else if ("D2305".equals(model)) { return "Sony Xperia M2"; }
        else if ("D2306".equals(model)) { return "Sony Xperia M2"; }
        else if ("D2302".equals(model)) { return "Sony Xperia M2"; }
        else if ("D2303".equals(model)) { return "Sony Xperia M2"; }
        else if ("DMT580D".equals(model)) { return "iRiver DMT580D"; }
        else if ("D820X".equals(model)) { return "TCT (Alcatel) D820X"; }
        else if ("D5322".equals(model)) { return "Sony Xperia T2 Ultra dual"; }
        else if ("DX00C".equals(model)) { return "Panasonic TH-49DX400C"; }
        else if ("DSlide750".equals(model)) { return "Danew DSlide 750"; }
        else if ("DWA1015D".equals(model)) { return "DigitalStream DWA1015D Tablet"; }
        else if ("Dream".equals(model)) { return "WIKO DARKFULL"; }
        else if ("DA223HQL".equals(model)) { return "Acer DA223HQL"; }
        else if ("DT101Bv51".equals(model)) { return "ESI Enterprises DT101Bv51"; }
        else if ("D000-000018-002".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D000-000018-003".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D000-000018-001".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D820".equals(model)) { return "TCT (Alcatel) D820"; }
        else if ("DROID_RAZR".equals(model)) { return "Motorola Droid Razr"; }
        else if ("D75E".equals(model)) { return "Honeywell D75E"; }
        else if ("D2-727".equals(model)) { return "Anydata D2-727G"; }
        else if ("DP7856K".equals(model)) { return "Dopo DP7856K"; }
        else if ("DMX-ST7A".equals(model)) { return "Dreamax DMX-ST7A"; }
        else if ("D5803".equals(model)) { return "Sony Xperia Z3 Compact"; }
        else if ("DA245HQL".equals(model)) { return "Acer DA245HQL"; }
        else if ("D5303".equals(model)) { return "Sony Xperia T2 Ultra"; }
        else if ("DP7CPRO".equals(model)) { return "Tecno DroiPad 7C Pro"; }
        else if ("DT7v51B".equals(model)) { return "ESI Enterprises DT7v51B"; }
        else if ("DL750".equals(model)) { return "TCT (Alcatel) TCL DL750"; }
        return "";

    }
    public static String gMethod (String model) {
        if ("GT-P5220".equals(model)) { return "Samsung Galaxy Tab3 10.1"; }
        else if ("GT-S7390".equals(model)) { return "Samsung Galaxy Trend Lite"; }
        else if ("GT-S7392".equals(model)) { return "Samsung Galaxy Trend Duos"; }
        else if ("G630-U251".equals(model)) { return "Huawei G630-U251"; }
        else if ("GN9010".equals(model)) { return "Gionee S6"; }
        else if ("GT-P7320".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("GT-I9208".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("GT-I9200".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("GT-N7100T".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("GT-I9205".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("GN8001".equals(model)) { return "Gionee GN8001"; }
        else if ("GT-S7500W".equals(model)) { return "Samsung Galaxy Ace Plus"; }
        else if ("GT-S7500T".equals(model)) { return "Samsung Galaxy Ace Plus"; }
        else if ("GT-S7500L".equals(model)) { return "Samsung Galaxy Ace Plus"; }
        else if ("GT-N7108D".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("GS-918".equals(model)) { return "DOPO GS-918"; }
        else if ("GT-P6800".equals(model)) { return "Samsung Galaxy Tab 7.7"; }
        else if ("GT-P6201".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("GT-I5500B".equals(model)) { return "Samsung Europa"; }
        else if ("GT-I5500L".equals(model)) { return "Samsung Europa"; }
        else if ("GT-I5500M".equals(model)) { return "Samsung Europa"; }
        else if ("GT-N7102i".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("GT-P5210XD1".equals(model)) { return "Samsung Galaxy Tab3 10.1"; }
        else if ("GT-I9230".equals(model)) { return "Samsung Galaxy Golden"; }
        else if ("GT-I9515L".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-S6802".equals(model)) { return "Samsung Galaxy Ace Duos"; }
        else if ("GT-S6800".equals(model)) { return "Samsung Galaxy Ace Advance"; }
        else if ("GT-I9300T".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("GT-I9300I".equals(model)) { return "Samsung Galaxy S3 Neo Plus"; }
        else if ("GT-I9000M".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-I9000B".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-I9000T".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-B9150".equals(model)) { return "Samsung Homesync"; }
        else if ("GT-S7572".equals(model)) { return "Samsung Galaxy Trend Duos"; }
        else if ("GT-I9018".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-I9010".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-S5830".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5838".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5831i".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-I8190".equals(model)) { return "Samsung Galaxy S III Mini"; }
        else if ("GX2".equals(model)) { return "GSmart GX2"; }
        else if ("GT-S6352".equals(model)) { return "Samsung Galaxy Ace Duos"; }
        else if ("GT-S6358".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-I9505X".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9505G".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("G526-L22".equals(model)) { return "Huawei G526"; }
        else if ("GT-I9295".equals(model)) { return "Samsung Galaxy S4 Active"; }
        else if ("GT-S5312".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5310".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S7278U".equals(model)) { return "Samsung Galaxy Ace3 Duos"; }
        else if ("GT-S5690R".equals(model)) { return "Samsung Galaxy Xcover"; }
        else if ("GT-S5690L".equals(model)) { return "Samsung Galaxy Xcover"; }
        else if ("GT-S5690M".equals(model)) { return "Samsung Galaxy Xcover"; }
        else if ("GN152".equals(model)) { return "Gionee GN152"; }
        else if ("GEM-701L".equals(model)) { return "Huawei X2"; }
        else if ("GT-I9050".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-N7108".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("GT-I9507V".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-N7100".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("GT-N7102".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("GT-N7105".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("Glacier".equals(model)) { return "Gigabyte TM105A"; }
        else if ("GT-I9060M".equals(model)) { return "Samsung Galaxy Grand Neo Plus"; }
        else if ("GT-I9060L".equals(model)) { return "Samsung Galaxy Grand Neo"; }
        else if ("GT-I9060I".equals(model)) { return "Samsung Galaxy Grand Neo Plus"; }
        else if ("GT-I9060C".equals(model)) { return "Samsung Galaxy Grand Neo Plus"; }
        else if ("GT-I8200Q".equals(model)) { return "Samsung Galaxy S3 Mini Value Edition"; }
        else if ("GSmart7Tab".equals(model)) { return "Gigabyte TM75A"; }
        else if ("GT-I9100P".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("GT-I9100T".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("GT-S6312".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("GT-S6310".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("GT-I9100G".equals(model)) { return "Samsung Galaxy S2 Plus"; }
        else if ("GT-I9100M".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("GT-B7510L".equals(model)) { return "Samsung Galaxy Pro"; }
        else if ("GT-B7510B".equals(model)) { return "Samsung Galaxy Pro"; }
        else if ("GT-S7262".equals(model)) { return "Samsung Galaxy Star Plus"; }
        else if ("GT-S5360L".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GEM-703L".equals(model)) { return "Huawei X2"; }
        else if ("GT-S5360B".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GT-S5360T".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("G31s".equals(model)) { return "Haier G31s"; }
        else if ("GT-S5369".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GT-I9070".equals(model)) { return "Samsung Galaxy S Advance"; }
        else if ("GT-S5283B".equals(model)) { return "Samsung Galaxy Star Trios"; }
        else if ("GT-S6500".equals(model)) { return "Samsung Galaxy Mini2"; }
        else if ("G630-U20".equals(model)) { return "Huawei G630-U20"; }
        else if ("GN5001S".equals(model)) { return "Gionee GN5001S"; }
        else if ("GN5001L".equals(model)) { return "Gionee GN5001L"; }
        else if ("GT-I9515".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-S5301L".equals(model)) { return "Samsung Galaxy Pocket Plus"; }
        else if ("GT-S5301B".equals(model)) { return "Samsung Galaxy Pocket Plus"; }
        else if ("GT-I9210T".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("GT-I9008L".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GETAWAY".equals(model)) { return "Wiko GETAWAY"; }
        else if ("GALAPAD_S6".equals(model)) { return "Galapad S6"; }
        else if ("GT-S7278".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-S6313T".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("GTV100".equals(model)) { return "Netgear NeoTVPrime"; }
        else if ("GT-I8260".equals(model)) { return "Samsung Galaxy Core"; }
        else if ("GT-I8268".equals(model)) { return "Samsung Galaxy Duos"; }
        else if ("GT-S5303B".equals(model)) { return "Samsung Galaxy Y Plus"; }
        else if ("GT-I8160L".equals(model)) { return "Samsung Galaxy Ace2"; }
        else if ("GT-I8160P".equals(model)) { return "Samsung Galaxy Ace2"; }
        else if ("GT-S7272C".equals(model)) { return "Samsung Galaxy Ace3 Duos"; }
        else if ("GT-S5570B".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("G2-3GP".equals(model)) { return "Hisense G2-3GP"; }
        else if ("GT-S5570I".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("GT-S5570L".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("GT540R".equals(model)) { return "LGE Swift"; }
        else if ("GT-P1013".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-P1010".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("G620S-UL00".equals(model)) { return "Huawei G620S-UL00"; }
        else if ("GT-I9300".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("GT-I9305".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("GT-I9308".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("GT-I5800L".equals(model)) { return "Samsung Galaxy Apollo"; }
        else if ("GT-I5800D".equals(model)) { return "Samsung Galaxy Apollo"; }
        else if ("GT-S5670".equals(model)) { return "Samsung Galaxy Fit"; }
        else if ("G621-TL00M".equals(model)) { return "Huawei G621-TL00M"; }
        else if ("GT-S6010".equals(model)) { return "Samsung Galaxy Music"; }
        else if ("GT-S6012".equals(model)) { return "Samsung Galaxy Music Duos"; }
        else if ("GT-S7583T".equals(model)) { return "Samsung Galaxy Trend Plus"; }
        else if ("G735-L23".equals(model)) { return "Huawei G735-L23"; }
        else if ("GT-P5100".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("GT-I8530".equals(model)) { return "Samsung Galaxy Beam"; }
        else if ("Galaxy_Nexus".equals(model)) { return "Samsung Galaxy Nexus"; }
        else if ("GT-S7270L".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-S5280".equals(model)) { return "Samsung Galaxy Star"; }
        else if ("GT-S5282".equals(model)) { return "Samsung Galaxy Star"; }
        else if ("GT-S5670L".equals(model)) { return "Samsung Galaxy Fit"; }
        else if ("GT-N5120".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("G735-L03".equals(model)) { return "Huawei G735-L03"; }
        else if ("G700".equals(model)) { return "Haier G700"; }
        else if ("GT-B5510".equals(model)) { return "Samsung Galaxy Y Pro"; }
        else if ("GT-B5512".equals(model)) { return "Samsung Galaxy Y Pro Duos"; }
        else if ("GT-I8160".equals(model)) { return "Samsung Galaxy Ace 2"; }
        else if ("GT540".equals(model)) { return "LGE Swift"; }
        else if ("GT-P7511".equals(model)) { return "Samsung Galaxy Tab 10.1 N"; }
        else if ("GT-P7510".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("GT-N5100".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("GT-N5105".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("G615-U10".equals(model)) { return "Huawei G615-U10"; }
        else if ("GT-I9158".equals(model)) { return "Samsung Galaxy Mega 5.8"; }
        else if ("GT-I9152".equals(model)) { return "Samsung Galaxy Mega 5.8"; }
        else if ("GT-I9150".equals(model)) { return "Samsung Galaxy Mega 5.8"; }
        else if ("GDENTMY7317".equals(model)) { return "ENTITY GDENTMY7317"; }
        else if ("GT-S7568I".equals(model)) { return "Samsung Galaxy Trend"; }
        else if ("GT-P3100B".equals(model)) { return "Samsung Galaxy Tab2 7.0"; }
        else if ("GoTab_GBT10".equals(model)) { return "My Go GoTab GBT10"; }
        else if ("GT-I8558".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("GT-I8552".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("GT-N7000".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("GT-N7005".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("GT-I9070P".equals(model)) { return "Samsung Galaxy S Advance"; }
        else if ("G620S-L02".equals(model)) { return "Huawei G620S-L02"; }
        else if ("G620S-L03".equals(model)) { return "Huawei G620S-L03"; }
        else if ("G620S-L01".equals(model)) { return "Huawei G620S-L01"; }
        else if ("G7-TL00".equals(model)) { return "Huawei G7-TL00"; }
        else if ("GT-P6211".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("GT-S6790".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-810".equals(model)) { return "Acer GT-810"; }
        else if ("GT-I8190L".equals(model)) { return "Samsung Galaxy S3 Mini"; }
        else if ("GT-I9197".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("GT-I9195".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("GT-I9192".equals(model)) { return "Samsung Galaxy S4 Mini Duos"; }
        else if ("GT-I9190".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("GT-I9198".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("GR-TB10S".equals(model)) { return "Anydata Grundig GR-TB10S Tablet"; }
        else if ("GT-P3110".equals(model)) { return "Samsung Galaxy Tab 2"; }
        else if ("GT-P3113".equals(model)) { return "Samsung Galaxy Tab 2 7.0"; }
        else if ("GT540GO".equals(model)) { return "LGE Swift"; }
        else if ("GEM-703LT".equals(model)) { return "Huawei X2"; }
        else if ("GT-S7390E".equals(model)) { return "Samsung Galaxy Fresh"; }
        else if ("GT-S7390G".equals(model)) { return "Samsung Galaxy Fresh"; }
        else if ("GT-S7390L".equals(model)) { return "Samsung Galaxy Trend Lite"; }
        else if ("GT-S7710L".equals(model)) { return "Samsung Galaxy Xcover2"; }
        else if ("GT-P6200L".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("GT-I5500".equals(model)) { return "Samsung Galaxy Europa"; }
        else if ("GT-I5503".equals(model)) { return "Samsung Galaxy Europa"; }
        else if ("GT-I5508".equals(model)) { return "Samsung Galaxy Europa"; }
        else if ("GT-S5690".equals(model)) { return "Samsung Galaxy Xcover"; }
        else if ("GT-P5210".equals(model)) { return "Samsung Galaxy Tab 3 10.1"; }
        else if ("GT-N8005".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("GT-N8000".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("GT-I8262".equals(model)) { return "Samsung Galaxy Core"; }
        else if ("GT-I8730".equals(model)) { return "Samsung Galaxy Express"; }
        else if ("GT-I9192I".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("G100W".equals(model)) { return "Acer Picasso"; }
        else if ("GT-P7100".equals(model)) { return "Samsung Galaxy Tab 10.1 v"; }
        else if ("GT-S7562L".equals(model)) { return "Samsung Galaxy S DUOS"; }
        else if ("GT-S7562C".equals(model)) { return "Samsung Galaxy Trend Duos"; }
        else if ("GT-S7562i".equals(model)) { return "Samsung Galaxy Trend Duos"; }
        else if ("GT-S7392L".equals(model)) { return "Samsung Galaxy Trend"; }
        else if ("gucci".equals(model)) { return "Xiaomi HM NOTE 1S CT"; }
        else if ("GN5002".equals(model)) { return "Gionee GN5002"; }
        else if ("GN5001".equals(model)) { return "Gionee GN5001"; }
        else if ("GT-S5660M".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("GT-S5660L".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("GT-S5660B".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("GT-N8020".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("G1-725".equals(model)) { return "Acer Iconia One 7"; }
        else if ("GT-S5310C".equals(model)) { return "Samsung Galaxy Pocket SS"; }
        else if ("GN9008".equals(model)) { return "Gionee E8"; }
        else if ("GN9006".equals(model)) { return "Gionee GN9006"; }
        else if ("GN9007".equals(model)) { return "Gionee GN9007"; }
        else if ("GN9005".equals(model)) { return "Gionee S5.1"; }
        else if ("GN9000".equals(model)) { return "Gionee GN9000"; }
        else if ("GT-I9168I".equals(model)) { return "Samsung Galaxy Grand Neo"; }
        else if ("GT-S7560M".equals(model)) { return "Samsung Galaxy Ace II X"; }
        else if ("GT-S7710".equals(model)) { return "Samsung Galaxy Xcover2"; }
        else if ("GT-I9235".equals(model)) { return "Samsung Galaxy Golden"; }
        else if ("GT-S7898".equals(model)) { return "Samsung Galaxy Trend2"; }
        else if ("GT-P7310".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("GT-P1000T".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-P1000R".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-P1000N".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-P1000L".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-P1000M".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-I8200N".equals(model)) { return "Samsung Galaxy S3 Mini Value Edition"; }
        else if ("GT-I8200L".equals(model)) { return "Samsung Galaxy S3 Mini"; }
        else if ("GT-I9152P".equals(model)) { return "Samsung Galaxy Mega Plus"; }
        else if ("GT-I9210".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("G7-L03".equals(model)) { return "Huawei G7-L03"; }
        else if ("G7-L01".equals(model)) { return "HUAWEI G7-L01"; }
        else if ("GT-S6818".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S6810".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S6812".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT540f".equals(model)) { return "LGE Swift"; }
        else if ("GT-S6108".equals(model)) { return "Samsung Galaxy Y Pop"; }
        else if ("GT-S6102".equals(model)) { return "Samsung Galaxy Y Duos"; }
        else if ("GT-I9301I".equals(model)) { return "Samsung Galaxy S3 Neo"; }
        else if ("GT-I9301Q".equals(model)) { return "Samsung Galaxy S3 Neo"; }
        else if ("GT-S7500".equals(model)) { return "Samsung Galaxy Ace Plus"; }
        else if ("GT-S7508".equals(model)) { return "Samsung Galaxy Ace Plus"; }
        else if ("GT-P6810".equals(model)) { return "Samsung Galaxy Tab 7.7"; }
        else if ("GT-P6210".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("GT-I9000".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-I9001".equals(model)) { return "Samsung Galaxy S Plus"; }
        else if ("GT-I9003".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-B5510B".equals(model)) { return "Samsung Galaxy Y Pro"; }
        else if ("GT-B5510L".equals(model)) { return "Samsung Galaxy Y Pro"; }
        else if ("GT-I9508C".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9508V".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("G526-L11".equals(model)) { return "Huawei G526"; }
        else if ("GT-I5503T".equals(model)) { return "Samsung Europa"; }
        else if ("GT-I9128".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-S5302B".equals(model)) { return "Samsung Galaxy Pocket"; }
        else if ("GT-B9120".equals(model)) { return "Samsung Absolute"; }
        else if ("GT-S7898I".equals(model)) { return "Samsung Galaxy Trend2"; }
        else if ("GT-S7566".equals(model)) { return "Samsung Galaxy S duos"; }
        else if ("GT-S7562".equals(model)) { return "Samsung Galaxy S Duos"; }
        else if ("GT-S7560".equals(model)) { return "Samsung Galaxy Ace2 X"; }
        else if ("GT-S7568".equals(model)) { return "Samsung Galaxy S Duos"; }
        else if ("GT-B5512B".equals(model)) { return "Samsung Galaxy Y Pro Duos"; }
        else if ("GT-S5830D".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830F".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830G".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830B".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830C".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830L".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830M".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("G526-L33".equals(model)) { return "Huawei G526"; }
        else if ("GT-S5830T".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830i".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("Glow".equals(model)) { return "Laiq Glow"; }
        else if ("G3SMNTA22".equals(model)) { return "AOC-A2272PW4T"; }
        else if ("G3SMNTA24".equals(model)) { return "AOC-A2472PW4T"; }
        else if ("GAMETAB-ONE".equals(model)) { return "Bigben GAMETAB-ONE"; }
        else if ("GT-I9080E".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-I9080L".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-N7105T".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("GT-P6200".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("GT-I9305T".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("GT-I9003L".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-S6293T".equals(model)) { return "Samsung Roy VE DTV"; }
        else if ("G320".equals(model)) { return "Plaisio G320"; }
        else if ("GT-I9063T".equals(model)) { return "Samsung Galaxy Grand Neo Duos"; }
        else if ("GV7790".equals(model)) { return "Prestigio GV7790"; }
        else if ("G610-U00".equals(model)) { return "Huawei G610"; }
        else if ("GT-I8730T".equals(model)) { return "Samsung Galaxy Express"; }
        else if ("GT-I9082i".equals(model)) { return "Samsung Galaxy Grand duos"; }
        else if ("GT-I9082C".equals(model)) { return "Samsung Galaxy Grand Neo"; }
        else if ("GT-I9082L".equals(model)) { return "Samsung Galaxy Grand Duos"; }
        else if ("GT-S5301".equals(model)) { return "Samsung Galaxy Pocket Plus"; }
        else if ("GT-S5300".equals(model)) { return "Samsung Galaxy Pocket"; }
        else if ("GT-S5303".equals(model)) { return "Samsung Galaxy Y Plus"; }
        else if ("GT-S5302".equals(model)) { return "Samsung Galaxy Pocket"; }
        else if ("G740-L00".equals(model)) { return "Huawei G740"; }
        else if ("gprimelteacg".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("GT-I9060".equals(model)) { return "Samsung Galaxy Grand Neo"; }
        else if ("G630-U10".equals(model)) { return "Huawei G630-U10"; }
        else if ("GT-I9118".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GravityQuad".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("GT-I5700R".equals(model)) { return "Samsung Galaxy Spica"; }
        else if ("GT-I5700L".equals(model)) { return "Samsung Galaxy Spica"; }
        else if ("GT-S5368".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GT-S5367".equals(model)) { return "Samsung Galaxy Y TV"; }
        else if ("GT-S5363".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GT-S5360".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GT-S7275B".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-S7275T".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-S7275R".equals(model)) { return "Samsung Galaxy Ace 3"; }
        else if ("GT-S7275Y".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GEM-702L".equals(model)) { return "Huawei X2"; }
        else if ("G527-U081".equals(model)) { return "Huawei G527"; }
        else if ("GT-S7580".equals(model)) { return "Samsung Galaxy Trend Plus"; }
        else if ("GT-S7582".equals(model)) { return "Samsung Galaxy S Duos2"; }
        else if ("GT-S7275".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-S7272".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-S7270".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-I9158V".equals(model)) { return "Samsung Galaxy Mega Plus"; }
        else if ("GT-I9158P".equals(model)) { return "Samsung Galaxy Mega Plus"; }
        else if ("GT-I9082".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-S5670B".equals(model)) { return "Samsung Galaxy Fit"; }
        else if ("GT-I9505".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9507".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9506".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9500".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9502".equals(model)) { return "Samsung Galaxy S4 Duos"; }
        else if ("GT-I9508".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-S5300L".equals(model)) { return "Samsung Galaxy Pocket"; }
        else if ("GT-S5300B".equals(model)) { return "Samsung Galaxy Pocket"; }
        else if ("GT-I9105P".equals(model)) { return "Samsung Galaxy S2 Plus"; }
        else if ("GT-S7273T".equals(model)) { return "Samsung Galaxy S2 Duos TV"; }
        else if ("Garminfone".equals(model)) { return "Garmin Nuvifone"; }
        else if ("GN9010L".equals(model)) { return "Gionee GN9010L"; }
        else if ("G620-L75".equals(model)) { return "Huawei G620-L75"; }
        else if ("G6".equals(model)) { return "Claresta G6"; }
        else if ("G5".equals(model)) { return "Claresta G5"; }
        else if ("G4".equals(model)) { return "Claresta G4"; }
        else if ("G3".equals(model)) { return "BYD INHON G3"; }
        else if ("G1".equals(model)) { return "Hisense G1"; }
        else if ("GT-S5660".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("GT-S7580L".equals(model)) { return "Samsung Galaxy Trend Plus"; }
        else if ("GT-S7580E".equals(model)) { return "Samsung Galaxy Trend Plus"; }
        else if ("GT-S5312M".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5312L".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5312C".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5312B".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-I8258".equals(model)) { return "Samsung Galaxy M Style"; }
        else if ("GT-I8250".equals(model)) { return "Samsung Galaxy Beam"; }
        else if ("GT-S6792L".equals(model)) { return "Samsung Galaxy Fame Lite Duos"; }
        else if ("GR-TB7".equals(model)) { return "TCT (Alcatel) ONE TOUCH T10"; }
        else if ("GT-P1000".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("G2SMNT".equals(model)) { return "Philips S221C3A"; }
        else if ("GT-S5310N".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5310M".equals(model)) { return "Samsung Galaxy Pocket SS"; }
        else if ("G735-L12".equals(model)) { return "Huawei G735-L12"; }
        else if ("GT-I9100".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("GT-P5113".equals(model)) { return "Samsnung Galaxy Tab 2 10.1"; }
        else if ("GT-P5110".equals(model)) { return "Samsung Galaxy Tab 2"; }
        else if ("GT-S6310T".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("GT-S7582L".equals(model)) { return "Samsung Galaxy S Duos2"; }
        else if ("GT-S6310L".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("GT-S6310N".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("G621-TL00".equals(model)) { return "Huawei G621-TL00"; }
        else if ("GT-S6310B".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("GT-I9305N".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("GT-S6810E".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S5310B".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5310G".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5310E".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S6810B".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S6810M".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S6810L".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S5310I".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5310L".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S6810P".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S5310T".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-I9103".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("GT-I9105".equals(model)) { return "Samsung Galaxy S2 Plus"; }
        else if ("GT-I9108".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("GT-S6790L".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S6790E".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-B7810".equals(model)) { return "Samsung Galaxy M Pro2"; }
        else if ("GT-S6790N".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S6010L".equals(model)) { return "Samsung Galaxy Music"; }
        else if ("GT-P7500D".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("GT-P7503".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("GT-P7501".equals(model)) { return "Samsung Galaxy Tab 10.1 N"; }
        else if ("Gravity".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("google_sdk".equals(model)) { return "Android Emulator"; }
        else if ("GT-N8010".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("GT-B5330".equals(model)) { return "Samsung Galaxy Chat"; }
        else if ("GT-I5510L".equals(model)) { return "Samsung Europa"; }
        else if ("GT-S6812C".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S6812B".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-I9168".equals(model)) { return "Samsung Galaxy Grand Neo"; }
        else if ("GT-I8190N".equals(model)) { return "Samsung Galaxy S III Mini"; }
        else if ("GT-I8190T".equals(model)) { return "Samsung Galaxy S3 Mini"; }
        else if ("GOA".equals(model)) { return "Wiko GOA"; }
        else if ("G3SMNTS22".equals(model)) { return "Philips PHP-S221C4AFD"; }
        else if ("G3SMNTS23".equals(model)) { return "Philips PHP-S231C4AFD"; }
        else if ("GT-S6012B".equals(model)) { return "Samsung Galaxy Music Duos"; }
        else if ("GT-I5800".equals(model)) { return "Samsung Galaxy Apollo"; }
        else if ("GT-I5801".equals(model)) { return "Samsung Galaxy Apollo"; }
        else if ("GT-N5110".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("GT-I9128I".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-I9128E".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-I9128V".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-I8150".equals(model)) { return "Samsung Galaxy W"; }
        else if ("GW620".equals(model)) { return "LGE Eve"; }
        else if ("GT-P7500".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("GT-I5700".equals(model)) { return "Samsung Galaxy Spica"; }
        else if ("GT-S6102E".equals(model)) { return "Samsung Galaxy Y Duos"; }
        else if ("GT-S6102B".equals(model)) { return "Samsung Galaxy Y Duos"; }
        else if ("GT-S5660V".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("GT-P3105".equals(model)) { return "Samsung Galaxy Tab2 7.0"; }
        else if ("GT-P3100".equals(model)) { return "Samsung Galaxy Tab 2"; }
        else if ("G30".equals(model)) { return "Haier G30"; }
        else if ("GT-I9268".equals(model)) { return "Samsung Galaxy Premier"; }
        else if ("GT-I9260".equals(model)) { return "Samsung Galaxy Premier"; }
        else if ("GT-S6500T".equals(model)) { return "Samsung Galaxy Mini2"; }
        else if ("GT-I5510".equals(model)) { return "Samsung Galaxy Europa"; }
        else if ("GT-S6500L".equals(model)) { return "Samsung Galaxy Mini2"; }
        else if ("GT-S5570".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("GT-S6500D".equals(model)) { return "Samsung Galaxy Mini2"; }
        else if ("GT-S5578".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("GT-I8550E".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("GT-I8550L".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("GT-B5330L".equals(model)) { return "Samsung Galaxy Chat"; }
        else if ("GT-B5330B".equals(model)) { return "Samsung Galaxy Chat"; }
        else if ("GT-I9308I".equals(model)) { return "Samsung Galaxy S3 Neo Plus"; }
        else if ("GT-I8580".equals(model)) { return "Samsung Galaxy Core Advance"; }
        else if ("GT-I8150T".equals(model)) { return "Samsung Galaxy W"; }
        else if ("GT-I8150B".equals(model)) { return "Samsung Galaxy W"; }
        else if ("GT-I9195X".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("GT-I9195T".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("GT-I9195I".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("GT-I9195L".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("GT-S6818V".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-i5700".equals(model)) { return "Samsung Galaxy Spica"; }
        else if ("GT-S5839i".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("Ghost".equals(model)) { return "AG Mobile Ghost"; }
        else if ("GT-I8262B".equals(model)) { return "Samsung Galaxy S3 Duos"; }
        else if ("GT-B7510".equals(model)) { return "Samsung Galaxy Pro"; }
        else if ("GT-I8552B".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("GT-P5200".equals(model)) { return "Samsung Galaxy Tab3 10.1"; }
        else if ("GT-B9062".equals(model)) { return "Samsung Galaxy (China)"; }
        else if ("GT-N8013".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("G1-715".equals(model)) { return "Acer G1-715"; }
        else if ("GT-I8200".equals(model)) { return "Samsung Galaxy S3 Mini Value Edition"; }
        else if ("GT-I8260E".equals(model)) { return "Samsung Galaxy Core Safe"; }
        else if ("GT-I8260L".equals(model)) { return "Samsung Galaxy Core"; }
        else if ("GT-S6802B".equals(model)) { return "Samsung Galaxy Ace Duos"; }
        else if ("GT-I9220".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("GT-I9228".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("Golf".equals(model)) { return "WIKO IGGY"; }
        else if ("GT-S6812i".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-P7300".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        return "";

    }
    public static String fMethod (String model) {
        if ("F5180".equals(model)) { return "Hisense F5180"; }
        else if ("F-07D".equals(model)) { return "Fujitsu ARROWS mu F-07D"; }
        else if ("F-074".equals(model)) { return "Fujitsu ARROWS mu F-07D"; }
        else if ("FJJB091".equals(model)) { return "Fujitsu ARROWS mu F-07D"; }
        else if ("FMT-NM7116-01".equals(model)) { return "Future Mobile Technology netsurferDUAL 7"; }
        else if ("F-05G".equals(model)) { return "Fujitsu F-05G"; }
        else if ("F-05F".equals(model)) { return "Fujitsu F-05F"; }
        else if ("F-05E".equals(model)) { return "Fujitsu ARROWS Tab F-05E"; }
        else if ("F-05D".equals(model)) { return "Fujitsu ARROWS X LTE F-05D"; }
        else if ("FS402".equals(model)) { return "Fly FS402"; }
        else if ("FS401".equals(model)) { return "Fly Stratus 1"; }
        else if ("FS404".equals(model)) { return "Fly Stratus 3"; }
        else if ("FS405".equals(model)) { return "Fly Stratus 4"; }
        else if ("F-03E".equals(model)) { return "Fujitsu ARROWS Kiss F-03E"; }
        else if ("F-03D".equals(model)) { return "Fujitsu ARROWS Kiss F-03D"; }
        else if ("F-03G".equals(model)) { return "Fujitsu F-03G"; }
        else if ("F-03F".equals(model)) { return "Fujitsu F-03F"; }
        else if ("FS505".equals(model)) { return "Fly Nimbus 7"; }
        else if ("FW8977-ED".equals(model)) { return "Verssed FW8977-ED"; }
        else if ("F-01F".equals(model)) { return "Fujitsu F-01F"; }
        else if ("F-01D".equals(model)) { return "Fujitsu ARROWS Tab LTE F-01D"; }
        else if ("F-01H".equals(model)) { return "Fujitsu F-01H"; }
        else if ("Fog".equals(model)) { return "Explay Fog"; }
        else if ("Fresh_NF".equals(model)) { return "Explay Fresh"; }
        else if ("falcon".equals(model)) { return "Borqs Falcon"; }
        else if ("F5122".equals(model)) { return "Sony Xperia X"; }
        else if ("F5121".equals(model)) { return "Sony Xperia X"; }
        else if ("FZ-X1".equals(model)) { return "Panasonic FZ-X1"; }
        else if ("FZ-A1B".equals(model)) { return "Panasonic FZ-A1"; }
        else if ("F52_05".equals(model)) { return "BenQ F52"; }
        else if ("ForwardRuby".equals(model)) { return "NGM Italia SRL Ruby"; }
        else if ("FEVER".equals(model)) { return "Wiko FEVER"; }
        else if ("FP-U320-INF-WLTW".equals(model)) { return "InFocus FP-U320-INF-WLTW"; }
        else if ("F-07E".equals(model)) { return "Fujitsu Disney Mobile on docomo F-07E"; }
        else if ("FARTM9334P1".equals(model)) { return "Fujitsu FARTM9334P1"; }
        else if ("FunTab2".equals(model)) { return "Ematic FunTab 2"; }
        else if ("F-09E".equals(model)) { return "Fujitsu F-09E"; }
        else if ("F-09D".equals(model)) { return "Fujitsu F-09D ANTEPRIMA"; }
        else if ("First".equals(model)) { return "Positivo First"; }
        else if ("FTJ152C".equals(model)) { return "Plusone FTJ152C"; }
        else if ("F301".equals(model)) { return "Gionee F301"; }
        else if ("F303".equals(model)) { return "Gionee F303"; }
        else if ("FZ-N1".equals(model)) { return "Panasonic FZ-N1"; }
        else if ("ForwardEndurance".equals(model)) { return "NGM Italia SRL Endurance"; }
        else if ("FMT-NT8A42-01".equals(model)) { return "Future Mobile Technology Dual 8"; }
        else if ("FXC-5A".equals(model)) { return "geanee FXC-5A"; }
        else if ("F-06E".equals(model)) { return "Fujitsu ARROWS NX F-06E"; }
        else if ("FT142D".equals(model)) { return "ZTE FT142D"; }
        else if ("F5281".equals(model)) { return "Hisense Sero 8 pro"; }
        else if ("FDR-A03L".equals(model)) { return "HUAWEI MediaPad T2 10.0 pro"; }
        else if ("F-10D".equals(model)) { return "Fujitsu ARROWS X F-10D"; }
        else if ("FS551".equals(model)) { return "Fly Nimbus 4"; }
        else if ("FTJ152D".equals(model)) { return "Plusone Kiwami"; }
        else if ("FTJ152B".equals(model)) { return "Plusone Priori3S"; }
        else if ("FTJ152A".equals(model)) { return "Plusone Priori 3"; }
        else if ("Fly_IQ442".equals(model)) { return "Enspert CINK SLIM"; }
        else if ("FMT-NM7058-03".equals(model)) { return "Future Mobile Technology FMT-NM7058-03"; }
        else if ("FGAD".equals(model)) { return "Royaltek FGAD"; }
        else if ("FZ-B2B".equals(model)) { return "Panasonic FZ-B2"; }
        else if ("FZ-B2D".equals(model)) { return "Panasonic FZ-B2D"; }
        else if ("FDR-A01w".equals(model)) { return "HUAWEI MediaPad T2 10.0 pro"; }
        else if ("FDR-A01L".equals(model)) { return "HUAWEI MediaPad T2 10.0 pro"; }
        else if ("F-12D".equals(model)) { return "Fujitsu Raku-Raku SMART PHONE F-12D"; }
        else if ("F-12C".equals(model)) { return "Fujitsu F-12C"; }
        else if ("FS451".equals(model)) { return "Fly FS451"; }
        else if ("FS452".equals(model)) { return "Fly Nimbus 2"; }
        else if ("FV-FG6".equals(model)) { return "FaceVsion OC1020A"; }
        else if ("F1fw".equals(model)) { return "Oppo F1fw"; }
        else if ("FT103".equals(model)) { return "Quanta FT103"; }
        else if ("FL7008".equals(model)) { return "Reliance FL7008"; }
        else if ("FHMD001".equals(model)) { return "Fujitsu FHMD001"; }
        else if ("F-06F".equals(model)) { return "Fujitsu F-06F"; }
        else if ("F-04E".equals(model)) { return "Fujitsu ARROWS V F-04E"; }
        else if ("F-04F".equals(model)) { return "Fujitsu F-04F"; }
        else if ("F-04G".equals(model)) { return "Fujitsu F-04G"; }
        else if ("FieldBook_E1".equals(model)) { return "Logic Instrument FieldBook E1"; }
        else if ("FP2".equals(model)) { return "Fairphone FP2"; }
        else if ("Farabi".equals(model)) { return "Vestel Farabi"; }
        else if ("F-02H".equals(model)) { return "Fujitsu F-02H"; }
        else if ("F-02F".equals(model)) { return "Fujitsu F-02F"; }
        else if ("F-02G".equals(model)) { return "Fujitsu F-02G"; }
        else if ("F-02E".equals(model)) { return "Fujitsu ARROWS X F-02E"; }
        else if ("f400".equals(model)) { return "EMTEC F400"; }
        else if ("Fresh".equals(model)) { return "Explay Fresh"; }
        else if ("Favorite".equals(model)) { return "Explay Favorite"; }
        else if ("FARTM933KZ".equals(model)) { return "Fujitsu FARTM933KZ"; }
        else if ("Fly".equals(model)) { return "SK Telesys Fly"; }
        else if ("F3".equals(model)) { return "BenQ F3"; }
        else if ("FTJ161A".equals(model)) { return "Plusone FTJ161A"; }
        else if ("FLOW".equals(model)) { return "Lechpol FLOW"; }
        else if ("F5070".equals(model)) { return "Hisense F5070"; }
        else if ("FMT-NM7054-01".equals(model)) { return "Future Mobile Technology FMT-NM7054-01"; }
        else if ("FMT-NM7054-03".equals(model)) { return "Future Mobile Technology FMT-NM7054-03"; }
        else if ("FAR70B".equals(model)) { return "Fujitsu ARROWS Tab Wi-Fi FAR70B"; }
        else if ("F-08D".equals(model)) { return "Fujitsu Disney Mobile on docomo F-08D"; }
        else if ("F-08E".equals(model)) { return "Fujitsu Raku-Raku SMART PHONE2 F-08E"; }
        else if ("F270BW".equals(model)) { return "Hisense F270BW"; }
        else if ("F103L".equals(model)) { return "Gionee F103L"; }
        else if ("F103S".equals(model)) { return "Gionee F103S"; }
        else if ("F105".equals(model)) { return "Gionee F105"; }
        else if ("F103".equals(model)) { return "Gionee F103"; }
        else if ("F1f".equals(model)) { return "Oppo F1w"; }
        else if ("F1w".equals(model)) { return "Oppo F1w"; }
        else if ("FJT21".equals(model)) { return "Fujitsu ARROWS Tab FJT21"; }
        else if ("FS502".equals(model)) { return "Fly FS502"; }
        else if ("FS501".equals(model)) { return "Fly Nimbus3"; }
        else if ("FS506".equals(model)) { return "Fly Cirrus 3"; }
        else if ("FS504".equals(model)) { return "Fly Cirrus 2"; }
        else if ("FJL22".equals(model)) { return "Fujitsu ARROWS Z FJL22"; }
        else if ("FJL21".equals(model)) { return "Fujitsu ARROWS ef FJL21"; }
        else if ("Flare_X_V2".equals(model)) { return "Cherry Mobile Flare X"; }
        else if ("Funtab3".equals(model)) { return "Ematic FunTab 3"; }
        else if ("FunTabPlay".equals(model)) { return "Ematic FunTab 3"; }
        else if ("Forge".equals(model)) { return "Razer Forge TV"; }
        else if ("F5281CH".equals(model)) { return "Hisense F5281CH"; }
        else if ("F105L".equals(model)) { return "Gionee F105L"; }
        else if ("FARTMB611Y".equals(model)) { return "Fujitsu FARTMB611Y"; }
        else if ("FP-U320-711-WWAN".equals(model)) { return "SAKAISIO FP-U320-711-WWAN"; }
        else if ("FWTA-T1000".equals(model)) { return "Finggo FWTA-T1000"; }
        else if ("F-11D".equals(model)) { return "Fujitsu ARROWS Me F-11D"; }
        else if ("ForwardZero".equals(model)) { return "NGM Italia SRL ForwardZero"; }
        else if ("FLY_IQ4400_AF".equals(model)) { return "Fly Iris"; }
        else if ("FWSP-S1000".equals(model)) { return "Finggo FWSP-S1000"; }
        else if ("FP-U320-711-WIFI".equals(model)) { return "SAKAISIO FP-U320-711-WIFI"; }
        return "";

    }
    public static String iMethod (String model) {
        if ("I216A".equals(model)) { return "TCT (Alcatel) I216A"; }
        else if ("IdeaTabA1000L-F".equals(model)) { return "Lenovo A1000L"; }
        else if ("Indigo".equals(model)) { return "Explay Indigo"; }
        else if ("Infinix-X552".equals(model)) { return "INFINIX-X552"; }
        else if ("Infinix-X551".equals(model)) { return "Infinix HOT NOTE"; }
        else if ("IGGY".equals(model)) { return "WIKO IGGY"; }
        else if ("Ideos".equals(model)) { return "Huawei IDEOS"; }
        else if ("itel_it1550".equals(model)) { return "Itel it1550"; }
        else if ("IdeaTabA1010-T".equals(model)) { return "Lenovo IdeaTab A1010"; }
        else if ("IF236a".equals(model)) { return "InFocus Big Tab"; }
        else if ("IS04".equals(model)) { return "Fujitsu REGZA Phone T-01C"; }
        else if ("IS05".equals(model)) { return "Sharp IS05"; }
        else if ("IS01".equals(model)) { return "Sharp IS01"; }
        else if ("IS03".equals(model)) { return "Sharp IS03"; }
        else if ("IQ4516".equals(model)) { return "Fly IQ4516 Octa"; }
        else if ("IQ4513".equals(model)) { return "Fly IQ4513"; }
        else if ("IM-A770K".equals(model)) { return "Pantech VEGA RACER"; }
        else if ("INFINIX-X551".equals(model)) { return "INFINIX-X551"; }
        else if ("IS15SH".equals(model)) { return "Sharp AQUOS PHONE SL IS15SH"; }
        else if ("ICON".equals(model)) { return "Cellon ICON"; }
        else if ("Idol2S_Orange".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("I50".equals(model)) { return "Haier I50"; }
        else if ("IS11S".equals(model)) { return "Sony Ericsson Xperia Acro"; }
        else if ("IS11T".equals(model)) { return "Fujitsu REGZA Phone IS11T"; }
        else if ("IS11N".equals(model)) { return "NEC MEDIAS BR IS11N"; }
        else if ("INSIGNIA_550i".equals(model)) { return "GoClever INSIGNIA 550i"; }
        else if ("IQ456".equals(model)) { return "Fly Era Life 2"; }
        else if ("IQ459".equals(model)) { return "Fly Evo Chic 2"; }
        else if ("IM-A900L".equals(model)) { return "Pantech VEGA Secret UP"; }
        else if ("IM-A900K".equals(model)) { return "Pantech VEGA Secret UP"; }
        else if ("IM-A900S".equals(model)) { return "Pantech VEGA Secret UP"; }
        else if ("IM-A860L".equals(model)) { return "Pantech IM-A860L"; }
        else if ("IM-A860S".equals(model)) { return "Pantech IM-A860S"; }
        else if ("IQ4551".equals(model)) { return "Fly IQ4551"; }
        else if ("ISW13HT".equals(model)) { return "HTC ISW13HT"; }
        else if ("IQ434".equals(model)) { return "Fly IQ434"; }
        else if ("IR8Q".equals(model)) { return "Viewsonic"; }
        else if ("ILIUM_X100".equals(model)) { return "Lanix X100"; }
        else if ("IN610".equals(model)) { return "Infocus IN610"; }
        else if ("ITQ701".equals(model)) { return "iRiver Wow TAB +"; }
        else if ("ITQ700".equals(model)) { return "iRiver Wow(Window of the world)"; }
        else if ("ITP-E410W".equals(model)) { return "SK Telesys ITP-E410W"; }
        else if ("IS11LG".equals(model)) { return "LGE Optimus EX"; }
        else if ("i4901".equals(model)) { return "IDEA i4901"; }
        else if ("IS13SH".equals(model)) { return "Sharp AQUOS PHONE IS13SH"; }
        else if ("ISW11K".equals(model)) { return "Kyocera DIGNO"; }
        else if ("IM-A780L".equals(model)) { return "Pantech VEGA RACER"; }
        else if ("IM-A920S".equals(model)) { return "Pantech IM-A920S"; }
        else if ("IR10Q".equals(model)) { return "Viewsonic"; }
        else if ("IM-A710K".equals(model)) { return "Pantech Vega X"; }
        else if ("I212".equals(model)) { return "TCT (Alcatel) Pixo 7"; }
        else if ("I213".equals(model)) { return "TCT (Alcatel) Pixo 7"; }
        else if ("I211".equals(model)) { return "TCT (Alcatel) Pixo 7"; }
        else if ("ISW11SC".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("ITQ1000".equals(model)) { return "iRiver WOW Tab+(ITQ1000)"; }
        else if ("IQ4490i".equals(model)) { return "Fly IQ4490i"; }
        else if ("I216X".equals(model)) { return "TCT (Alcatel) I216X"; }
        else if ("INGO-TAB".equals(model)) { return "Haier INGO-TAB"; }
        else if ("IM-A760S".equals(model)) { return "Pantech IM-A760S"; }
        else if ("IM-A840SP".equals(model)) { return "Pantech IM-840SP"; }
        else if ("IdeaPadA10".equals(model)) { return "Lenovo A10"; }
        else if ("ISW16SH".equals(model)) { return "Sharp AQUOS PHONE SERIE ISW16SH"; }
        else if ("Ilium_L1000".equals(model)) { return "Lanix ILIUM L1000"; }
        else if ("IN335".equals(model)) { return "InFocus IN335"; }
        else if ("IM-A870K".equals(model)) { return "Pantech IM-A870K"; }
        else if ("IM-A870L".equals(model)) { return "Pantech IM-A870L"; }
        else if ("IM-A870S".equals(model)) { return "Pantech IM-A870S"; }
        else if ("I-K1".equals(model)) { return "iRiver ULALA"; }
        else if ("IM-A720L".equals(model)) { return "Pantech Vega X"; }
        else if ("ido".equals(model)) { return "Xiaomi Redmi 3"; }
        else if ("i785Q".equals(model)) { return "IView SupraPad i785Q"; }
        else if ("iliumPAD".equals(model)) { return "Gigabyte mexico"; }
        else if ("IQ4418".equals(model)) { return "Fly IQ4418"; }
        else if ("IQ4416".equals(model)) { return "Fly IQ4416"; }
        else if ("IQ4415".equals(model)) { return "Fly IQ4415"; }
        else if ("IM-A820L".equals(model)) { return "Pantech Vega LTE M"; }
        else if ("i7".equals(model)) { return "Venturer i7"; }
        else if ("Imperium7".equals(model)) { return "Explay Imperium 7"; }
        else if ("Imperium8".equals(model)) { return "Explay Imperium 8"; }
        else if ("I110".equals(model)) { return "Acer Liquid C1"; }
        else if ("IM-A690L".equals(model)) { return "Pantech Mirach"; }
        else if ("IMD501".equals(model)) { return "Enspert CINK KING"; }
        else if ("IM-A880S".equals(model)) { return "Pantech IM-A880S"; }
        else if ("IF195a".equals(model)) { return "InFocus Big Tab"; }
        else if ("IQ4507".equals(model)) { return "Fly Dune 3"; }
        else if ("IQ4509".equals(model)) { return "Fly IQ4509"; }
        else if ("itel_it1505".equals(model)) { return "Itel it1505"; }
        else if ("IS12S".equals(model)) { return "Sony Ericsson Xperia acro HD"; }
        else if ("IS12F".equals(model)) { return "Fujitsu ARROWS ES IS12F"; }
        else if ("IS12SH".equals(model)) { return "Sharp AQUOS PHONE IS12SH"; }
        else if ("IM-A800S".equals(model)) { return "Pantech IM-A800S"; }
        else if ("IS11SH".equals(model)) { return "Sharp AQUOS PHONE IS11SH"; }
        else if ("i700".equals(model)) { return "IView SupraPad i700"; }
        else if ("IS14SH".equals(model)) { return "Sharp AQUOS PHONE IS14SH"; }
        else if ("ISW12HT".equals(model)) { return "HTC EVO 3D ISW12HT"; }
        else if ("IM-A775C".equals(model)) { return "Pantech IM-A775C"; }
        else if ("ISW11M".equals(model)) { return "Motorola Photon 4G"; }
        else if ("IM-A840S".equals(model)) { return "Pantech IM-A840S"; }
        else if ("ISW11F".equals(model)) { return "Fujitsu ARROWS Z ISW11F"; }
        else if ("IM-A830KE".equals(model)) { return "Pantech IM-A830KE"; }
        else if ("IS17SH".equals(model)) { return "Sharp AQUOS PHONE CL IS17SH"; }
        else if ("IN810".equals(model)) { return "Infocus IN810"; }
        else if ("IN815".equals(model)) { return "Infocus IN815"; }
        else if ("I10A-LE".equals(model)) { return "Anydata Leader I10A-LE"; }
        else if ("ISW13F".equals(model)) { return "Fujitsu ARROWS Z ISW13F"; }
        else if ("IN260".equals(model)) { return "InFocus IN260"; }
        else if ("IM-A730S".equals(model)) { return "Pantech IM-A730S"; }
        else if ("IM-A830L".equals(model)) { return "Pantech IM-A830L"; }
        else if ("IM-A830K".equals(model)) { return "Pantech IM-A830K"; }
        else if ("IM-A830S".equals(model)) { return "Pantech IM-A830S"; }
        else if ("I221".equals(model)) { return "TCT (Alcatel) I221"; }
        else if ("I220".equals(model)) { return "TCT (Alcatel) I220"; }
        else if ("I7A-LE".equals(model)) { return "Haier GF88"; }
        else if ("INFINIX-X600".equals(model)) { return "INFINIX-X600"; }
        else if ("IM-T100K".equals(model)) { return "Pantech AT1"; }
        else if ("ITP-R208W".equals(model)) { return "SK Telesys ITP-R208W"; }
        else if ("IM-A890L".equals(model)) { return "Pantech VEGA Secret Note"; }
        else if ("IM-A890K".equals(model)) { return "Pantech VEGA Secret Note"; }
        else if ("IM-A890S".equals(model)) { return "Pantech VEGA Secret Note"; }
        else if ("IM5".equals(model)) { return "Kodak IM5"; }
        else if ("IR7Q".equals(model)) { return "ViewSonic ViewPad IR7Q"; }
        else if ("IM-A810S".equals(model)) { return "Pantech IM-A810S"; }
        else if ("IdeaTabA1000-G".equals(model)) { return "Lenovo A1000-G"; }
        else if ("IdeaTabA1000-F".equals(model)) { return "Lenovo A1000"; }
        else if ("IM-A810K".equals(model)) { return "Pantech IM-A810K"; }
        else if ("IQ4413_Quad".equals(model)) { return "Fly IQ4413 Quad"; }
        else if ("IdeaTabA5000-E".equals(model)) { return "Lenovo IdeaTab A5000"; }
        else if ("ilium_Pad_E7".equals(model)) { return "Lanix ilium Pad E7"; }
        else if ("Infinity".equals(model)) { return "NGM Infinity"; }
        else if ("iRULU_V3".equals(model)) { return "USA111 iRULU V3"; }
        else if ("IM-A750K".equals(model)) { return "Pantech Mirach A"; }
        else if ("IM-A740S".equals(model)) { return "Pantech IM-A740S"; }
        else if ("ITP-R408W".equals(model)) { return "TUNTUN English DREAM PAD"; }
        else if ("icube-830".equals(model)) { return "SK Telesys icube-830"; }
        else if ("Ice-Twist".equals(model)) { return "Huawei Ice-Twist"; }
        else if ("Ilium_PAD_i7".equals(model)) { return "Lanix ilium PAD i7"; }
        else if ("IQ4601".equals(model)) { return "Fly IQ4601"; }
        else if ("IdeaTabA1020-T".equals(model)) { return "Lenovo IdeaTab A1020"; }
        else if ("IM-A910L".equals(model)) { return "Pantech IM-A910L"; }
        else if ("IM-A910K".equals(model)) { return "Pantech IM-A910K"; }
        else if ("IM-A690S".equals(model)) { return "Pantech Mirach"; }
        else if ("IM-A910S".equals(model)) { return "Pantech IM-A910S"; }
        else if ("IM-A850S".equals(model)) { return "Pantech IM-A850S"; }
        else if ("IM-A850K".equals(model)) { return "Pantech IM-A850K"; }
        else if ("IM-A850L".equals(model)) { return "Pantech IM-A850L"; }
        else if ("Ilium_L950".equals(model)) { return "Lanix ILIUM L950"; }
        else if ("IQ4406".equals(model)) { return "Fly Era Nano 6"; }
        else if ("IQ4407".equals(model)) { return "Fly ERA Nano 7"; }
        else if ("IQ4400".equals(model)) { return "Fly Era Nano 8"; }
        else if ("IQ4401".equals(model)) { return "Fly IQ4401"; }
        else if ("IN265".equals(model)) { return "7Eleven IN265"; }
        else if ("IQ436i".equals(model)) { return "Fly Era Nano 9"; }
        else if ("IM-A725L".equals(model)) { return "Pantech ef14lv"; }
        else if ("IM-A860K".equals(model)) { return "Pantech IM-A860K"; }
        else if ("Infinity-10.1-v2".equals(model)) { return "Infinity-10.1-v2"; }
        else if ("Infinity-10.1-v3".equals(model)) { return "Infinity-10.1-v3"; }
        return "";

    }
    public static String hMethod (String model) {
        if ("HTC_D626ph".equals(model)) { return "HTC Desire 626G+ dual sim"; }
        else if ("H30-T00".equals(model)) { return "Huawei H30-T00"; }
        else if ("HTC_Desire_320".equals(model)) { return "HTC Desire320"; }
        else if ("HTC_PH39100".equals(model)) { return "HTC Vivid 4G"; }
        else if ("H8_Life".equals(model)) { return "AllView Viva H8 Life"; }
        else if ("Hit".equals(model)) { return "Explay Hit"; }
        else if ("HW-03E".equals(model)) { return "Huawei HW-03E"; }
        else if ("HUAWEI-M835".equals(model)) { return "Huawei M835"; }
        else if ("HS-10DTB4".equals(model)) { return "Haier HS-10DTB4"; }
        else if ("HS-10DTB8".equals(model)) { return "Hipstreet HS-10DTB8"; }
        else if ("HTC6525LVW".equals(model)) { return "HTC One M8"; }
        else if ("HTC_0P6A1".equals(model)) { return "HTC Desire 300"; }
        else if ("HS-9DTB7A".equals(model)) { return "Hipstreet HS-9DTB7A"; }
        else if ("HWT31".equals(model)) { return "Huawei HWT31"; }
        else if ("HS-T966".equals(model)) { return "Hisense HS-T966"; }
        else if ("HS-T967".equals(model)) { return "Hisense HS-T967"; }
        else if ("HTC_Desire_300".equals(model)) { return "HTC Desire 300"; }
        else if ("H882L".equals(model)) { return "Huawei H882L"; }
        else if ("HS-U98".equals(model)) { return "Hisense HS-U98"; }
        else if ("HS-U980".equals(model)) { return "Hisense HS-U980"; }
        else if ("HS-T968S".equals(model)) { return "Hisense HS-T968S"; }
        else if ("HS-U609".equals(model)) { return "Hisense U609"; }
        else if ("HS-U978".equals(model)) { return "Hisense HS-U978"; }
        else if ("HS-U602".equals(model)) { return "Hisense U602"; }
        else if ("HTC_0P9C2".equals(model)) { return "HTC Desire 816"; }
        else if ("HS-U601".equals(model)) { return "Hisense HS-U601"; }
        else if ("HS-U606".equals(model)) { return "Hisense U606AE"; }
        else if ("HS-U971".equals(model)) { return "Hisense HS-U971"; }
        else if ("HS-10DTB12".equals(model)) { return "Hipstreet HS-10DTB12"; }
        else if ("HTC-Z710a".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HTC_M10h".equals(model)) { return "HTC 10"; }
        else if ("HS-7DTB29-8GB".equals(model)) { return "Haier HS-7DTB29-8GB"; }
        else if ("HS-U950".equals(model)) { return "Hisense HS-U950"; }
        else if ("HS-H800T".equals(model)) { return "Hisense H800T"; }
        else if ("Huawei-U8652".equals(model)) { return "Huawei U8652"; }
        else if ("HG-9041".equals(model)) { return "Haier HG-9041"; }
        else if ("HTC_One_mini_601e".equals(model)) { return "HTC One mini 601E"; }
        else if ("HTC_D826y".equals(model)) { return "HTC Desire 826"; }
        else if ("HW-W820".equals(model)) { return "Cellon HWW820"; }
        else if ("H30-T10".equals(model)) { return "Huawei Honor3"; }
        else if ("HS-U936".equals(model)) { return "Hisense HS-U936"; }
        else if ("HS-U939".equals(model)) { return "Hisense HS-U939"; }
        else if ("HTC_0P9O2".equals(model)) { return "HTC Desire 610"; }
        else if ("HSG1279".equals(model)) { return "HANNSpree HSG1279"; }
        else if ("HTC_PO582".equals(model)) { return "HTC One mini"; }
        else if ("HTC_Incredible_S".equals(model)) { return "HTC Incredible S"; }
        else if ("HTC_D828x".equals(model)) { return "HTC Desire 828"; }
        else if ("HM_NOTE_1LTE".equals(model)) { return "Xiaomi Redmi Note 4G"; }
        else if ("HS-U912".equals(model)) { return "Hisense HS-U912"; }
        else if ("HS-T978".equals(model)) { return "Hisense HS-T978"; }
        else if ("HS-L682".equals(model)) { return "Hisense L682"; }
        else if ("HTC_M910x".equals(model)) { return "HTC Desire EYE"; }
        else if ("hisense_gx1200v".equals(model)) { return "Hisense TV"; }
        else if ("HTC-X710a".equals(model)) { return "HTC Velocity 4G"; }
        else if ("HTC6600LVW".equals(model)) { return "HTCOneMaxVZW"; }
        else if ("HTC_Desire_500".equals(model)) { return "HTC Desire 500"; }
        else if ("HS-U9".equals(model)) { return "Hisense HS-U9"; }
        else if ("HTC_D630x".equals(model)) { return "HTC Desire 626"; }
        else if ("HW-SCL-L32".equals(model)) { return "Huawei Y6"; }
        else if ("HS-G610".equals(model)) { return "Hisense HS-G610"; }
        else if ("H300".equals(model)) { return "Symphony H300"; }
        else if ("HTC_PN071".equals(model)) { return "HTC One"; }
        else if ("HS-E968".equals(model)) { return "Hisense HS-E968"; }
        else if ("HS-U610".equals(model)) { return "Hisense U610"; }
        else if ("HTC_M8x".equals(model)) { return "HTC One (M8)"; }
        else if ("HTC331ZLVW".equals(model)) { return "HTCDesire612VZW"; }
        else if ("HS-T968".equals(model)) { return "Hisense HS-T968"; }
        else if ("HTC_Desire_200".equals(model)) { return "HTC Desire 200"; }
        else if ("HTC_One".equals(model)) { return "HTC One"; }
        else if ("H220".equals(model)) { return "Cherry Mobile H220"; }
        else if ("HS-X5T".equals(model)) { return "Hisense HS-X5T"; }
        else if ("HS-I630T".equals(model)) { return "Hisense HS-I630T"; }
        else if ("HS-I630M".equals(model)) { return "Hisense HS-I630M"; }
        else if ("Huawei_8100-9".equals(model)) { return "Huawei T-Mobile Pulse"; }
        else if ("HTC_Glacier".equals(model)) { return "HTC Glacier"; }
        else if ("HTC_0P6B6".equals(model)) { return "HTC One (M8)"; }
        else if ("HS-EG971".equals(model)) { return "Hisense HS-EG971"; }
        else if ("HS-EG978".equals(model)) { return "Hisense EG978"; }
        else if ("HuaweiG510-0100-orange".equals(model)) { return "Huawei G510"; }
        else if ("HS-E620M".equals(model)) { return "Hisense HS-E620M"; }
        else if ("HTC_7060".equals(model)) { return "HTC Desire 7060"; }
        else if ("HS-U970E".equals(model)) { return "Hisense HS-U970E"; }
        else if ("HS-EG958".equals(model)) { return "Hisense HS-EG958"; }
        else if ("HSG1351".equals(model)) { return "HannSpree HSG1351"; }
        else if ("HS_10DTB12A".equals(model)) { return "Hipstreet HS-10DTB12A"; }
        else if ("HTV31".equals(model)) { return "HTC HTV31"; }
        else if ("HTC_D610x".equals(model)) { return "HTC Desire 610"; }
        else if ("HTC_One_mini".equals(model)) { return "HTC One mini"; }
        else if ("HS-EG939".equals(model)) { return "Hisense HS-EG939"; }
        else if ("H60-L11".equals(model)) { return "Huawei H60-L11"; }
        else if ("H60-L12".equals(model)) { return "Huawei H60-L12"; }
        else if ("HS-U970".equals(model)) { return "Hisense HS-U970"; }
        else if ("HTC_A9u".equals(model)) { return "HTC One A9"; }
        else if ("HTC_Desire_610".equals(model)) { return "HTC Desire 610"; }
        else if ("HTCD200LVW".equals(model)) { return "HTC Desire 626"; }
        else if ("H30-C00".equals(model)) { return "Huawei H30-C00"; }
        else if ("HTX21".equals(model)) { return "HTC KDDI Infobar A02"; }
        else if ("HTC_0PKX2".equals(model)) { return "HTC Desire 626"; }
        else if ("HW-H60-J1".equals(model)) { return "Huawei H60-J1"; }
        else if ("HY1-5085".equals(model)) { return "Hyundai HY1-5085"; }
        else if ("HTC_One_mini_2".equals(model)) { return "HTC One mini 2"; }
        else if ("HS-7DTB40-8GB".equals(model)) { return "Hipstreet HS-7DTB40-8GB"; }
        else if ("HTC_0PJA10".equals(model)) { return "HTC One M9"; }
        else if ("Hydro".equals(model)) { return "Kyocera Hydro PLUS"; }
        else if ("HS-7DTB25".equals(model)) { return "Haier HS-7DTB25"; }
        else if ("HS-7DTB27".equals(model)) { return "Hipstreet HS-7DTB27"; }
        else if ("HERO200".equals(model)) { return "HTC Hero"; }
        else if ("HTL23".equals(model)) { return "HTC HTL23"; }
        else if ("HTL22".equals(model)) { return "HTC J One"; }
        else if ("HTL21".equals(model)) { return "HTC J Butterfly"; }
        else if ("HTC_0PKV1".equals(model)) { return "HTC ONE M8s"; }
        else if ("HS-T939".equals(model)) { return "Hisense HS-T939"; }
        else if ("HTC_Desire_S".equals(model)) { return "HTC Desire S"; }
        else if ("HyasongT1".equals(model)) { return "Haier Hyasong T1"; }
        else if ("HTC_Desire_C".equals(model)) { return "HTC Desire C"; }
        else if ("HTC6435LVW".equals(model)) { return "HTC Droid DNA"; }
        else if ("HTC_D626x".equals(model)) { return "HTC Desire 626"; }
        else if ("HTCEVOV4G".equals(model)) { return "HTC Evo V 4G"; }
        else if ("HS_7DTB35".equals(model)) { return "Hipstreet HS-7DTB35"; }
        else if ("HUAWEI_Y300-0100".equals(model)) { return "Huawei Ascend Y300"; }
        else if ("HTC_B810x".equals(model)) { return "HTC Butterfly 2"; }
        else if ("HS-E200T".equals(model)) { return "Hisense E200T"; }
        else if ("HS-U988".equals(model)) { return "Hisense U988E-2"; }
        else if ("HTC_E9sx".equals(model)) { return "HTC One E9s dual sim"; }
        else if ("HS-T959S".equals(model)) { return "Hisense HS-T959S"; }
        else if ("HIGHWAY".equals(model)) { return "WIKO HIGHWAY"; }
        else if ("HS-T970".equals(model)) { return "Hisense HS-T970"; }
        else if ("HTC6435LRA".equals(model)) { return "HTC DROID DNA"; }
        else if ("HuaweiG510-0100".equals(model)) { return "Huawei G510"; }
        else if ("HM-N501-FL".equals(model)) { return "Haier HM-N501-FL"; }
        else if ("HS-U966".equals(model)) { return "Hisense HS-U966"; }
        else if ("HS-U961".equals(model)) { return "Hisense HS-U961"; }
        else if ("HTC_D530u".equals(model)) { return "HTC Desire 530"; }
        else if ("HTC_One_S".equals(model)) { return "HTC One S"; }
        else if ("HTC_One_V".equals(model)) { return "HTC One V"; }
        else if ("HTC_One_X".equals(model)) { return "HTC One X"; }
        else if ("HS-T959S1".equals(model)) { return "Hisense HS-T959S1"; }
        else if ("HTC-P715a".equals(model)) { return "HTC Puccini"; }
        else if ("HTC_0PCV2".equals(model)) { return "HTC Desire 510"; }
        else if ("HS-T959".equals(model)) { return "Hisense HS-T959"; }
        else if ("HTC_D620u".equals(model)) { return "HTC Desire 620 dual sim"; }
        else if ("HTC_D620h".equals(model)) { return "HTC Desire 620G dual sim"; }
        else if ("HTC_Desire".equals(model)) { return "HTC Desire"; }
        else if ("HUAWEI".equals(model)) { return "HUAWEI GX8"; }
        else if ("HTC_V1".equals(model)) { return "HTC Desire 310"; }
        else if ("HS-U800".equals(model)) { return "Hisense U800E-1"; }
        else if ("HTC_VLE_U".equals(model)) { return "HTC One S"; }
        else if ("HS-EG936D".equals(model)) { return "EG936D Hisense"; }
        else if ("HERO_X".equals(model)) { return "Mobicell HERO X"; }
        else if ("HTC_Butterfly_s_901s".equals(model)) { return "HTC Butterfly S"; }
        else if ("HTC_D526h".equals(model)) { return "HTC Desire 526G+ dual sim"; }
        else if ("HTC_One_M8".equals(model)) { return "HTC One M8"; }
        else if ("HTC_One_M9".equals(model)) { return "HTC One M9"; }
        else if ("HTC_D310n".equals(model)) { return "HTC Desire 310"; }
        else if ("HTC-X315E".equals(model)) { return "HTC Sensation XL with Beats Audio X315e"; }
        else if ("HS-U820".equals(model)) { return "Hisense HS-U820"; }
        else if ("HS-U929".equals(model)) { return "Hisense HS-U929"; }
        else if ("HTC331ZLVWPP".equals(model)) { return "HTCDesire612VZW"; }
        else if ("HS-U800E-1".equals(model)) { return "Hisense U800E-1"; }
        else if ("HTC_Flyer_P512_NA".equals(model)) { return "HTC Flyer"; }
        else if ("HTC_B830x".equals(model)) { return "HTC Butterfly 3"; }
        else if ("Hol-U19".equals(model)) { return "Huawei Hol-U19"; }
        else if ("Hol-U10".equals(model)) { return "Huawei Hol-U10"; }
        else if ("HTC_X9u".equals(model)) { return "HTC One X9 dual sim"; }
        else if ("HTCONE".equals(model)) { return "HTC One"; }
        else if ("HTC0P3P7".equals(model)) { return "HTC One max"; }
        else if ("HS-L695".equals(model)) { return "Hisense L695W"; }
        else if ("HS-L691".equals(model)) { return "Hisense l691"; }
        else if ("Huawei-U8687".equals(model)) { return "Huawei U8687"; }
        else if ("HTC_D825u".equals(model)) { return "HTC Desire 825"; }
        else if ("H7S".equals(model)) { return "Techno H7S"; }
        else if ("HTC_0P6B".equals(model)) { return "HTC One M8"; }
        else if ("HS-T9".equals(model)) { return "Hisense HS-T9"; }
        else if ("H30-U10".equals(model)) { return "Huawei Honor3"; }
        else if ("H30-L02".equals(model)) { return "Huawei H30-L02"; }
        else if ("HS_9DTB37".equals(model)) { return "Haier HS-9DTB37"; }
        else if ("HTCD200LVWPP".equals(model)) { return "HTC Desire 626"; }
        else if ("HUAWEI_P6-U06".equals(model)) { return "Huawei Ascend P6"; }
        else if ("HUAWEI_G510-0251".equals(model)) { return "Huawei Ascend G510"; }
        else if ("HTC6515LVW".equals(model)) { return "HTC One remix"; }
        else if ("HS-EG916".equals(model)) { return "HIsense HS-EG916"; }
        else if ("HP_10_Tablet".equals(model)) { return "HP Tablet 10"; }
        else if ("HTC_Desire_510".equals(model)) { return "HTC Desire 510"; }
        else if ("HS-X68T".equals(model)) { return "Hisense HS-X68T"; }
        else if ("HTC_M9u".equals(model)) { return "HTC One M9"; }
        else if ("HTC_One_X+".equals(model)) { return "HTC One X+"; }
        else if ("HTC_Desire_HD_A9191".equals(model)) { return "HTC Desire HD"; }
        else if ("HS-10DTB41-8GB".equals(model)) { return "Hipstreet HS-10DTB41-8GB"; }
        else if ("HTC_One_XL".equals(model)) { return "HTC One XL"; }
        else if ("HS-EG981".equals(model)) { return "Hisense EG981"; }
        else if ("HS-EG980".equals(model)) { return "Hisense HS-EG980"; }
        else if ("HS-EG98C".equals(model)) { return "Hisense HS-EG98C"; }
        else if ("Hydro_PLUS".equals(model)) { return "Kyocera Hydro PLUS"; }
        else if ("HS-E600M".equals(model)) { return "Hisense HS-E600M"; }
        else if ("HTCEVODesign4G".equals(model)) { return "HTC Evo Design 4G"; }
        else if ("HTC-A510a".equals(model)) { return "HTC Wildfire S"; }
        else if ("HTC0P4E1".equals(model)) { return "HTC Desire 601"; }
        else if ("HS-X6T".equals(model)) { return "Hisense HS-X6T"; }
        else if ("H7".equals(model)) { return "Hisense Vidaa"; }
        else if ("HTC_D816d".equals(model)) { return "HTC D816d"; }
        else if ("HS-EG966".equals(model)) { return "Hisense HS-EG966"; }
        else if ("Hashtag".equals(model)) { return "AG Mobile HASHTAG"; }
        else if ("HTC_D816x".equals(model)) { return "HTC Desire 816"; }
        else if ("HTC_S710E".equals(model)) { return "HTC Incredible S"; }
        else if ("HM_1SW".equals(model)) { return "Xiaomi Redmi"; }
        else if ("HTC6535LVW".equals(model)) { return "HTC One M9"; }
        else if ("HTC_709d".equals(model)) { return "HTC Desire 700 dual sim"; }
        else if ("HS-E936".equals(model)) { return "Hisense HS-E936"; }
        else if ("H60-L21".equals(model)) { return "Huawei H60-L21"; }
        else if ("HS-L671".equals(model)) { return "Hisense L671W"; }
        else if ("HS-T980".equals(model)) { return "Hisense HS-T980"; }
        else if ("HS-E917".equals(model)) { return "Hisense HS-E917"; }
        else if ("HSG1341".equals(model)) { return "HannSpree HSG1341"; }
        else if ("HS-EG929".equals(model)) { return "Hisense HS-EG929"; }
        else if ("H60-L02".equals(model)) { return "Huawei H60-L02"; }
        else if ("H60-L03".equals(model)) { return "Huawei H60-L03"; }
        else if ("H60-L01".equals(model)) { return "Huawei H60-L01"; }
        else if ("H60-L04".equals(model)) { return "Huawei H60-L04"; }
        else if ("H940".equals(model)) { return "Cherry Mobile One"; }
        else if ("H450R".equals(model)) { return "ANS Trailblazer"; }
        else if ("HTC6500LVW".equals(model)) { return "HTC One"; }
        else if ("HTC_M8MINx".equals(model)) { return "HTC One mini 2"; }
        else if ("HTC6535LRA".equals(model)) { return "HTC One M9"; }
        else if ("HTC_Amaze_4G".equals(model)) { return "HTC Amaze 4G"; }
        else if ("HTC_M8Sx".equals(model)) { return "HTC One (E8)"; }
        else if ("HTC_M8Sy".equals(model)) { return "HTC One (E8) dual sim"; }
        else if ("HTC_M8Sd".equals(model)) { return "HTC One E8 dual"; }
        else if ("HS-7DTB35".equals(model)) { return "Hipstreet HS-7DTB35"; }
        else if ("HS-U688".equals(model)) { return "U688 Hisense"; }
        else if ("HS-X1".equals(model)) { return "Hisense X1E1"; }
        else if ("HTC_M9pw".equals(model)) { return "HTC One M9+"; }
        else if ("HW-W900".equals(model)) { return "Cellon HW-W900"; }
        else if ("HTC_D820pi".equals(model)) { return "HTC Desire 820G PLUS dual sim"; }
        else if ("Hol-T00".equals(model)) { return "Huawei Hol-T00"; }
        else if ("HTCD100LVW".equals(model)) { return "HTC Desire 526"; }
        else if ("HTC_Sensation_4G".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HTC_One_max".equals(model)) { return "HTC One max"; }
        else if ("H-27".equals(model)) { return "Opticon H-27"; }
        else if ("HS-E260T".equals(model)) { return "Hisense E260T"; }
        else if ("HTC_603h".equals(model)) { return "HTC Desire 501"; }
        else if ("HT-I860".equals(model)) { return "Haier HT-I860"; }
        else if ("HS-T928".equals(model)) { return "Hisense HS-T928"; }
        else if ("HS-T926".equals(model)) { return "Hisense HS-T926"; }
        else if ("HTCD100LVWPP".equals(model)) { return "HTC Desire 526"; }
        else if ("HS-X8C".equals(model)) { return "Hisense HS-X8C"; }
        else if ("HS-X8T".equals(model)) { return "Hisense HS-X8T"; }
        else if ("HS-X8U".equals(model)) { return "Hisense HS-X8U"; }
        else if ("Houston".equals(model)) { return "Cellon Houston"; }
        else if ("HTC_Sensation_Z710e".equals(model)) { return "HTC Sensation"; }
        else if ("HM_NOTE_1W".equals(model)) { return "Xiaomi Redmi Note"; }
        else if ("HTC6545LVW".equals(model)) { return "HTC 10"; }
        else if ("HTC-PG762".equals(model)) { return "HTC Wildfire S A515c"; }
        return "";

    }
    public static String kMethod (String model) {
        if ("KYOCERA-E6790".equals(model)) { return "Kyocera DuraForce XD"; }
        else if ("KYY24".equals(model)) { return "Kyocera TORQUE G01"; }
        else if ("KYY22".equals(model)) { return "Kyocera URBANO L02"; }
        else if ("KYY23".equals(model)) { return "Kyocera URBANO L03"; }
        else if ("Kestrel".equals(model)) { return "Huawei G535-L11"; }
        else if ("KALOS".equals(model)) { return "Bungbungame KALOS"; }
        else if ("K00L".equals(model)) { return "Asus MeMO Pad HD 8 (ME180A)"; }
        else if ("K00X".equals(model)) { return "Asus MeMO Pad 7 LTE (ME7530CL)"; }
        else if ("K013C".equals(model)) { return "Asus MeMO Pad 7"; }
        else if ("K01B".equals(model)) { return "Asus Transformer Pad (TF303K)"; }
        else if ("K01A".equals(model)) { return "Asus MeMO Pad 7 (ME70C)"; }
        else if ("K01F".equals(model)) { return "Asus Fonepad 7 (FE171MG)"; }
        else if ("K01E".equals(model)) { return "Asus MeMO Pad (ME103K)"; }
        else if ("K01H".equals(model)) { return "Asus MeMO Pad 8 (ME581C)"; }
        else if ("K01N".equals(model)) { return "Asus Fonepad 7 (FE171CG)"; }
        else if ("K01Q".equals(model)) { return "Asus Fonepad 7 LTE (FE375CL)"; }
        else if ("K01U".equals(model)) { return "Asus MeMO Pad 7 (ME171C)"; }
        else if ("K012".equals(model)) { return "Asus Fonepad 7 (FE170CG)"; }
        else if ("K013".equals(model)) { return "Asus MeMO Pad 7 (ME176CX)"; }
        else if ("K010".equals(model)) { return "Best Buy Transformer Pad (TF103C)"; }
        else if ("K011".equals(model)) { return "Asus MeMO Pad 8 (ME181CX)"; }
        else if ("K016".equals(model)) { return "Asus Fonepad 8 (FE380CXG)"; }
        else if ("K017".equals(model)) { return "Asus MeMO Pad 7 (ME170C)"; }
        else if ("K014".equals(model)) { return "Asus Transformer Pad (TF303CL)"; }
        else if ("K015".equals(model)) { return "Asus MeMO Pad 8 (ME581CL)"; }
        else if ("K018".equals(model)) { return "Asus Transformer Pad (TF103CG)"; }
        else if ("K019".equals(model)) { return "Asus Fonepad 7(FE375CXG)"; }
        else if ("Kate".equals(model)) { return "Wenu Kate"; }
        else if ("KIS".equals(model)) { return "ZTE KIS"; }
        else if ("Kurio4S".equals(model)) { return "KD Interactive Kurio4S"; }
        else if ("KYOCERA-E6560".equals(model)) { return "Kyocera DuraForce"; }
        else if ("K7/PTAB782".equals(model)) { return "Polaroid K7"; }
        else if ("KYY21".equals(model)) { return "Kyocera URBANO L01"; }
        else if ("K83".equals(model)) { return "ZTE K83"; }
        else if ("K00C".equals(model)) { return "Asus Transformer Pad Infinity (TF701T)"; }
        else if ("KR076".equals(model)) { return "TCT (Alcatel) 8057"; }
        else if ("KFJWI".equals(model)) { return "Kindle Fire HD 8.9"; }
        else if ("KFJWA".equals(model)) { return "Kindle Fire HD 8.9"; }
        else if ("KITE".equals(model)) { return "Wiko KITE"; }
        else if ("KIW-TL00H".equals(model)) { return "Huawei Honor 5X"; }
        else if ("KurioPhone".equals(model)) { return "KD Interactive Kurio Phone"; }
        else if ("KC-S301AE".equals(model)) { return "Kyocera S301"; }
        else if ("KYV36".equals(model)) { return "Kyocera DIGNO rafre"; }
        else if ("KYV37".equals(model)) { return "Kyocera Qua phone (KYV37)"; }
        else if ("KYV34".equals(model)) { return "Kyocera URBANO V02"; }
        else if ("KYV35".equals(model)) { return "Kyocera TORQUE G02"; }
        else if ("KYV32".equals(model)) { return "Kyocera BASIO"; }
        else if ("KYV33".equals(model)) { return "Kyocera INFOBAR A03"; }
        else if ("KYV31".equals(model)) { return "Kyocera URBANO V01"; }
        else if ("Kindle_Fire".equals(model)) { return "Kindle Fire"; }
        else if ("KAZAM_Trooper_450L".equals(model)) { return "KAZAM Trooper 450L"; }
        else if ("KM-E100".equals(model)) { return "KT Tech TAKE SUIT"; }
        else if ("K012_2".equals(model)) { return "Asus MeMO Pad 7 (FE7010CG)"; }
        else if ("KYL23".equals(model)) { return "Kyocera miraie"; }
        else if ("KYL22".equals(model)) { return "Kyocera DIGNO"; }
        else if ("KYL21".equals(model)) { return "Kyocera DIGNO S"; }
        else if ("KCP01K".equals(model)) { return "Kyocera LUCE"; }
        else if ("KC-01".equals(model)) { return "Kyocera KC-01"; }
        else if ("KYOCERA-C6745".equals(model)) { return "Kyocera Hydro AIR"; }
        else if ("Kali_8".equals(model)) { return "NJoy Kali 8"; }
        else if ("KUNO4".equals(model)) { return "Archos Kuno"; }
        else if ("Kurio7S".equals(model)) { return "KD Interactive Kurio7S"; }
        else if ("K007".equals(model)) { return "Asus MeMO Pad 7 (ME572C)"; }
        else if ("K00E".equals(model)) { return "Asus Fonepad 7 (ME372CG)"; }
        else if ("K00G".equals(model)) { return "Asus Fonepad Note 6 (ME560CG)"; }
        else if ("K00F".equals(model)) { return "Asus MeMO Pad 10 (ME102A)"; }
        else if ("K00Y".equals(model)) { return "Asus Fonepad 7 LTE (ME372CL)"; }
        else if ("K00Z".equals(model)) { return "Asus Fonepad 7 (ME175CG)"; }
        else if ("K00U".equals(model)) { return "Asus MeMo Pad HD 7 (ME173XX)"; }
        else if ("K00R".equals(model)) { return "Asus MeMO Pad 7 LTE (ME572CL)"; }
        else if ("K97".equals(model)) { return "ZTE K97"; }
        else if ("K-KOOL".equals(model)) { return "Wiko K-KOOL"; }
        else if ("KC-S701".equals(model)) { return "Kyocera TORQUE(KC-S701)"; }
        else if ("KFOT".equals(model)) { return "Kindle Fire"; }
        else if ("KSP8000".equals(model)) { return "Kyocera Echo"; }
        else if ("Kurio10S".equals(model)) { return "KD Interactive Kurio10S"; }
        else if ("KTAB".equals(model)) { return "DEA Factory KTAB"; }
        else if ("KFTT".equals(model)) { return "Kindle Fire HD 7"; }
        else if ("K1".equals(model)) { return "Lenovo K1"; }
        else if ("K5".equals(model)) { return "Kubo K5"; }
        else if ("KYOCERA-C6742".equals(model)) { return "Kyocera Hydro VIEW"; }
        return "";

    }
    public static String jMethod (String model) {
        if ("JERRY".equals(model)) { return "Wiko JERRY"; }
        else if ("Joy_TV".equals(model)) { return "Explay Joy TV"; }
        else if ("JT-B1".equals(model)) { return "Panasonic JT-B1"; }
        else if ("JT1241".equals(model)) { return "Anydata Jiateng JT1241"; }
        else if ("J730U".equals(model)) { return "TCT (Alcatel) 730U"; }
        else if ("JIMMY".equals(model)) { return "Wiko JIMMY"; }
        else if ("JM-250".equals(model)) { return "BenQ JM-250"; }
        else if ("J630".equals(model)) { return "TCT (Alcatel) TCL J630"; }
        else if ("JD-150".equals(model)) { return "BenQ JD-150"; }
        return "";

    }
    public static String mMethod (String model) {
        if ("M812C".equals(model)) { return "TCT (Alcatel) M812C"; }
        else if ("MoovaShuffle".equals(model)) { return "Boost Moova Shuffle"; }
        else if ("MTN-E70".equals(model)) { return "MTN-E70"; }
        else if ("M811".equals(model)) { return "CMCC M811"; }
        else if ("MotoA953".equals(model)) { return "Motorola Milestone2"; }
        else if ("MD210".equals(model)) { return "Haier MD210"; }
        else if ("M220".equals(model)) { return "Huawei M220"; }
        else if ("M5".equals(model)) { return "Mint M5"; }
        else if ("M4".equals(model)) { return "Mint M4"; }
        else if ("M7".equals(model)) { return "CZ Electronics M7 Sapphire"; }
        else if ("M3".equals(model)) { return "Gionee M3"; }
        else if ("M2".equals(model)) { return "Gionee M2"; }
        else if ("MS4A".equals(model)) { return "ZTE MS4A"; }
        else if ("MS4C".equals(model)) { return "Huawei MS4C"; }
        else if ("MST711".equals(model)) { return "Trio MST711"; }
        else if ("MTC_982O".equals(model)) { return "TPS MTC 982o"; }
        else if ("MID4X07".equals(model)) { return "Polaroid MID4X07"; }
        else if ("MTN-S730".equals(model)) { return "MTN Group MTN Smart S730"; }
        else if ("MiTV2".equals(model)) { return "Xiaomi MiTV2"; }
        else if ("MiBOX_PRO".equals(model)) { return "Xiaomi MIBOXPRO"; }
        else if ("myPadP4".equals(model)) { return "ZTE V9S"; }
        else if ("MB886".equals(model)) { return "Motorola Atrix HD"; }
        else if ("MotoroiX".equals(model)) { return "Motorola Droid X"; }
        else if ("M620".equals(model)) { return "Huawei M620"; }
        else if ("M821H".equals(model)) { return "Hisense M821H"; }
        else if ("ME302C".equals(model)) { return "Asus MeMo Pad 10 (ME302C)"; }
        else if ("ME501".equals(model)) { return "Motorola Cliq-XT"; }
        else if ("MID210".equals(model)) { return "Takara MID210"; }
        else if ("Mach".equals(model)) { return "Cellon Mach"; }
        else if ("M9300".equals(model)) { return "Kyocera Echo"; }
        else if ("M1092R".equals(model)) { return "Ditecma M1092R"; }
        else if ("M601".equals(model)) { return "BYD M601"; }
        else if ("ME525".equals(model)) { return "Motorola Defy"; }
        else if ("MI-438".equals(model)) { return "Spice Stellar Mi-438"; }
        else if ("Maxwell-10".equals(model)) { return "Gigaset Maxwell-10"; }
        else if ("MWND1".equals(model)) { return "Acer MWND1"; }
        else if ("MegaFon_SP-AI".equals(model)) { return "TCT (Alcatel) Megafon Login"; }
        else if ("M7808".equals(model)) { return "Haier M7808"; }
        else if ("movo".equals(model)) { return "TCL LE50UHDE5692G"; }
        else if ("MB511".equals(model)) { return "Motorola Flipout"; }
        else if ("MT-803G".equals(model)) { return "Huawei T802"; }
        else if ("MT11a".equals(model)) { return "Sony Ericsson Xperia neo V"; }
        else if ("MID7055".equals(model)) { return "Anydata COBY MID7055"; }
        else if ("movo_la".equals(model)) { return "TCL L55E6700UDS"; }
        else if ("MusicPAD".equals(model)) { return "Vonino MusicPAD"; }
        else if ("MW6617".equals(model)) { return "Lazer MW6617"; }
        else if ("M8047IU".equals(model)) { return "Brightstar M8046IU"; }
        else if ("MT-700".equals(model)) { return "Haier MT-700"; }
        else if ("MID7065".equals(model)) { return "Anydata Coby MID7065"; }
        else if ("Max3-65".equals(model)) { return "Letv Max3-65"; }
        else if ("MicromaxP480".equals(model)) { return "Micromax Canvas Tab"; }
        else if ("MotoE2".equals(model)) { return "Motorola Moto E"; }
        else if ("MT-734G".equals(model)) { return "Apex MT-734G"; }
        else if ("MPDC706".equals(model)) { return "MPman MPDC706"; }
        else if ("MT15a".equals(model)) { return "Sony Ericsson Xperia neo"; }
        else if ("M35t".equals(model)) { return "Sony Xperia SP"; }
        else if ("M35h".equals(model)) { return "Sony Xperia SP"; }
        else if ("MotoG3".equals(model)) { return "Motorola Moto G"; }
        else if ("M532".equals(model)) { return "Fujitsu STYLISTIC M532"; }
        else if ("MiTV".equals(model)) { return "Xiaomi China"; }
        else if ("M24IS820".equals(model)) { return "FBC M24IS820"; }
        else if ("MT500".equals(model)) { return "Micromax CANVAS BLAZE"; }
        else if ("MFC2_Plus".equals(model)) { return "Clementoni My first Clempad 4.4 Plus"; }
        else if ("MotoMB511".equals(model)) { return "Motorola Flipout"; }
        else if ("ME811".equals(model)) { return "Motorola Droid X"; }
        else if ("M370".equals(model)) { return "InFocus M370"; }
        else if ("M02".equals(model)) { return "Fujitsu arrows M02"; }
        else if ("M01".equals(model)) { return "Fujitsu ARROWS M01"; }
        else if ("MFLogin3T".equals(model)) { return "MegaFon MFLogin3T"; }
        else if ("MFC145FR1".equals(model)) { return "Lexibook Fluo"; }
        else if ("M311".equals(model)) { return "Huawei Honor Box voice"; }
        else if ("M310".equals(model)) { return "Huawei M310"; }
        else if ("MTC975".equals(model)) { return "TCT (Alcatel) MTC975"; }
        else if ("M9000".equals(model)) { return "ZTE V793"; }
        else if ("M502".equals(model)) { return "NGM Italia SRL M502"; }
        else if ("MB855".equals(model)) { return "Motorola Photon 4G"; }
        else if ("Mi438S".equals(model)) { return "Nexian journey one"; }
        else if ("MTC_SMART_Surf_4G".equals(model)) { return "MobileTeleSystem MTC SMART Surf 4G"; }
        else if ("M330".equals(model)) { return "Huawei China"; }
        else if ("MACARON".equals(model)) { return "Wiko MACARON"; }
        else if ("M-MP7NB3G".equals(model)) { return "Nextbook M-MP7NB3G"; }
        else if ("MT3A".equals(model)) { return "MegaFon MT3A"; }
        else if ("MC36".equals(model)) { return "Zebra MC36"; }
        else if ("MTN-8978P".equals(model)) { return "MTN-8978P"; }
        else if ("MICROSTAR_E10319".equals(model)) { return "Medion LIFETAB E10320"; }
        else if ("ME600".equals(model)) { return "Motorola Backflip"; }
        else if ("MF97G".equals(model)) { return "ZTE MF97G"; }
        else if ("MF97E".equals(model)) { return "ZTE MF97E"; }
        else if ("MF97B".equals(model)) { return "ZTE Spro 2"; }
        else if ("MF97A".equals(model)) { return "ZTE MF97A"; }
        else if ("MF97V".equals(model)) { return "ZTE Spro 2"; }
        else if ("MS4B".equals(model)) { return "MegaFon MS4B"; }
        else if ("MB501".equals(model)) { return "Motorola Cliq-XT"; }
        else if ("MB810".equals(model)) { return "Motorola Droid X"; }
        else if ("MZ609".equals(model)) { return "Motorola XOOM 2"; }
        else if ("MZ604".equals(model)) { return "Motorola XOOM"; }
        else if ("MZ605".equals(model)) { return "Motorola XOOM"; }
        else if ("MZ606".equals(model)) { return "Motorola XOOM"; }
        else if ("MZ601".equals(model)) { return "Motorola XOOM"; }
        else if ("MotionE11".equals(model)) { return "Edcon Motion E1.1"; }
        else if ("MT8000".equals(model)) { return "Anydata Eviant MT8000"; }
        else if ("MS6".equals(model)) { return "Multilaser Ms6"; }
        else if ("MS5".equals(model)) { return "Trimble Navigation PeopleNet ConnectedTablet"; }
        else if ("M865".equals(model)) { return "Huawei M865"; }
        else if ("M860".equals(model)) { return "Huawei M860"; }
        else if ("MD7081".equals(model)) { return "AMTC MD7081"; }
        else if ("MB526".equals(model)) { return "Motorola Defy"; }
        else if ("MFLoginPh".equals(model)) { return "MegaFon MFLoginPh"; }
        else if ("MT7A".equals(model)) { return "ZTE V72"; }
        else if ("Motorola_Electrify".equals(model)) { return "Motorola Electrify"; }
        else if ("MFC_HR_Plus".equals(model)) { return "Clementoni My First Clempad HR Plus"; }
        else if ("Mi-4c".equals(model)) { return "Xiaomi Mi 4c"; }
        else if ("Motorola-XT502".equals(model)) { return "Motorola Quench XT3"; }
        else if ("Moova-Soul".equals(model)) { return "Boost Moova Soul"; }
        else if ("MD7008".equals(model)) { return "AMTC MD7008"; }
        else if ("MITO_A10".equals(model)) { return "Mito A10"; }
        else if ("MTN-TBW5982C3".equals(model)) { return "MTN-5982C3"; }
        else if ("M821".equals(model)) { return "Hisense M821"; }
        else if ("M823".equals(model)) { return "TCT (Alcatel) n1 max"; }
        else if ("Matrix".equals(model)) { return "Mobicell Matrix"; }
        else if ("M5_lite".equals(model)) { return "Gionee M5 Lite"; }
        else if ("MY16ADA".equals(model)) { return "Honda Accord"; }
        else if ("M8402".equals(model)) { return "ZTE M8402"; }
        else if ("M210".equals(model)) { return "Infocus M210"; }
        else if ("MD7053G".equals(model)) { return "Kennex MD7053G"; }
        else if ("ME301T".equals(model)) { return "ASUS MeMO Pad Smart 10"; }
        else if ("MB300".equals(model)) { return "Motorola Backflip"; }
        else if ("MID8065".equals(model)) { return "Anydata Coby MID8065"; }
        else if ("MH-CHANNELS".equals(model)) { return "Mohu MH-CHANNELS"; }
        else if ("MS50".equals(model)) { return "Multilaser MS50"; }
        else if ("MOTWX435KT".equals(model)) { return "Motorola Triumph"; }
        else if ("MID4X10".equals(model)) { return "Polaroid MID4X10"; }
        else if ("M377".equals(model)) { return "InFocus M377"; }
        else if ("Micromax_D200".equals(model)) { return "Micromax Bolt"; }
        else if ("MID1028".equals(model)) { return "Polaroid MID1028"; }
        else if ("Marquis_MP977".equals(model)) { return "Anydata Marquis Tablet"; }
        else if ("M372".equals(model)) { return "InFocus M372"; }
        else if ("ME511".equals(model)) { return "Motorola Flipout"; }
        else if ("MT25i".equals(model)) { return "Sony Ericsson Xperia neo L"; }
        else if ("MW-7615P".equals(model)) { return "Lazer MW-7615P"; }
        else if ("MB525".equals(model)) { return "Motorola Defy"; }
        else if ("MTAB-09541AB".equals(model)) { return "Memorex MTAB-09541AB"; }
        else if ("ME722".equals(model)) { return "Motorola Milestone2"; }
        else if ("MTC_968".equals(model)) { return "TCT (Alcatel) TCL A988"; }
        else if ("MM-3202".equals(model)) { return "iRiver MM3202"; }
        else if ("MM-3201".equals(model)) { return "iRiver MM3202"; }
        else if ("MiBOX1S".equals(model)) { return "Xiaomi China"; }
        else if ("MB865".equals(model)) { return "Motorola Atrix 2"; }
        else if ("MTAB-08530A".equals(model)) { return "Memorex MTAB-08530A"; }
        else if ("MFC510FR1".equals(model)) { return "Lexibook Fluo XL Premium Edition"; }
        else if ("MT27i".equals(model)) { return "Sony Ericsson Xperia sola"; }
        else if ("ME302KL".equals(model)) { return "Asus MeMO Pad FHD 10 (ME302KL)"; }
        else if ("MDB342X".equals(model)) { return "Mobily MDB342X"; }
        else if ("MTAB-07530A".equals(model)) { return "Memorex MTAB-07530A"; }
        else if ("MB502".equals(model)) { return "Motorola Charm"; }
        else if ("MID1065".equals(model)) { return "Anydata Coby MID1065"; }
        else if ("MS3A".equals(model)) { return "Haier MEGAFON MS3A"; }
        else if ("MS3B".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("MotoG3-TE".equals(model)) { return "Motorola Moto G Turbo Edition"; }
        else if ("MotoE2(4G-LTE)".equals(model)) { return "Moto E2"; }
        else if ("Metal_Tablet_10".equals(model)) { return "TJC Metal Tablet"; }
        else if ("MTC_SMART_Start_2".equals(model)) { return "MobileTeleSystem SMART Start 2"; }
        else if ("MiSS".equals(model)) { return "Bunbungame MiSS"; }
        else if ("M01T".equals(model)) { return "Fujitsu arrows Tab M01T"; }
        else if ("MH350".equals(model)) { return "Fujitsu STYLISTIC MH350"; }
        else if ("MTN-S720i".equals(model)) { return "MTN-S720i"; }
        else if ("ME172V".equals(model)) { return "Asus MeMO PAD"; }
        else if ("MT2L03".equals(model)) { return "Huawei MT2L03LITE"; }
        else if ("M5L".equals(model)) { return "Gionee M5L"; }
        else if ("MPDC1006".equals(model)) { return "MPman MPDC1006"; }
        else if ("MT15i".equals(model)) { return "Sony Ericsson Xperia neo"; }
        else if ("MID107".equals(model)) { return "Takara MID 107"; }
        else if ("MTS-SP100".equals(model)) { return "ZTE Racer"; }
        else if ("Monterra".equals(model)) { return "Garmin Monterra"; }
        else if ("MG080D1T".equals(model)) { return "TSUNAMi Tablet Tsunami TSTA080D1"; }
        else if ("MIT700".equals(model)) { return "iRiver DMT580D"; }
        else if ("MF97W".equals(model)) { return "ZTE MF97W"; }
        else if ("myTouch_4G_Slide".equals(model)) { return "HTC myTouch 4G Slide"; }
        else if ("M3s".equals(model)) { return "CZ Electronics M3s"; }
        else if ("M3-2200".equals(model)) { return "Acer M3-2200"; }
        else if ("M3S".equals(model)) { return "Gionee M3S"; }
        else if ("ME173X".equals(model)) { return "Asus MeMO Pad HD 7"; }
        else if ("Milestone".equals(model)) { return "Motorola Droid"; }
        else if ("MB200".equals(model)) { return "Motorola CLIQ"; }
        else if ("MiBOX2".equals(model)) { return "Xiaomi MiBOX2"; }
        else if ("MicromaxP680".equals(model)) { return "Micromax Canvas tab"; }
        else if ("M2mini".equals(model)) { return "Gionee M2mini"; }
        else if ("M220c".equals(model)) { return "Huawei M220"; }
        else if ("M10".equals(model)) { return "Monster M10"; }
        else if ("MT-733G".equals(model)) { return "MiiA MT-733G"; }
        else if ("M555".equals(model)) { return "Fujitsu ARROWS M555"; }
        else if ("ME860".equals(model)) { return "Motorola Atrix"; }
        else if ("M35c".equals(model)) { return "Sony Ericsson Xperia SP"; }
        else if ("M305".equals(model)) { return "Fujitsu M305"; }
        else if ("M721".equals(model)) { return "Allfine M721"; }
        else if ("morrison".equals(model)) { return "Motorola CLIQ"; }
        else if ("MK16i".equals(model)) { return "Sony Ericsson Xperia pro"; }
        else if ("MK16a".equals(model)) { return "Sony Ericsson Xperia pro"; }
        else if ("ML01-M7S-Quad-Core".equals(model)) { return "Multilaser M7s Quad Core"; }
        else if ("MTN-S620".equals(model)) { return "MTN-S620"; }
        else if ("M1_Plus".equals(model)) { return "Explay M1 Plus"; }
        else if ("MFC_HR".equals(model)) { return "Clementoni My First Clempad HR"; }
        else if ("M321".equals(model)) { return "Huawei Honor Box"; }
        else if ("ME371MG".equals(model)) { return "ASUS Fonepad ME371MG"; }
        else if ("MD1005".equals(model)) { return "Lazer MD1005 Tablet"; }
        else if ("MD1001".equals(model)) { return "AMTC MD1001 Tablet"; }
        else if ("MSP4507".equals(model)) { return "Manta MSP4507"; }
        else if ("MaxiIQ".equals(model)) { return "Pegatron MaxiIQ"; }
        else if ("ME525+".equals(model)) { return "Motorola Defy"; }
        else if ("M51w".equals(model)) { return "Sony Xperia Z1 Compact"; }
        else if ("M511".equals(model)) { return "Infocus M511"; }
        else if ("M510".equals(model)) { return "Infocus M511"; }
        else if ("MFC191FR2".equals(model)) { return "Lexibook Fluo XL"; }
        else if ("M512".equals(model)) { return "Infocus M512"; }
        else if ("M518".equals(model)) { return "Infocus M518"; }
        else if ("MFC2_Special".equals(model)) { return "Clementoni My first Clempad 4.4 Basic Special"; }
        else if ("M701".equals(model)) { return "Hisense M701"; }
        else if ("M702".equals(model)) { return "Fujitsu STYLISTIC M702"; }
        else if ("MF8604".equals(model)) { return "ZTE Blade"; }
        else if ("MID7317CP".equals(model)) { return "Anydata Auchan MID7317CP Tablet"; }
        else if ("M470BSA".equals(model)) { return "Hisense M470BSA"; }
        else if ("M470BSG".equals(model)) { return "Hisense M470BSG"; }
        else if ("M470BSD".equals(model)) { return "Hisense M470BSD"; }
        else if ("M470BSE".equals(model)) { return "Hisense M470BSE"; }
        else if ("M470BSS".equals(model)) { return "Hisense M470BSS"; }
        else if ("M3mini".equals(model)) { return "Gionee M3mini"; }
        else if ("M3101BCD".equals(model)) { return "Hisense M3101BCD"; }
        else if ("MI_3W".equals(model)) { return "Xiaomi Mi 3"; }
        else if ("MB860".equals(model)) { return "Motorola Atrix 4G"; }
        else if ("MB861".equals(model)) { return "Motorola Atrix"; }
        else if ("M370i".equals(model)) { return "InFocus M370i"; }
        else if ("msm8625".equals(model)) { return "Hisense HS-EG929"; }
        else if ("MZ617".equals(model)) { return "Motorola XOOM 2"; }
        else if ("MY1306P".equals(model)) { return "Lazer MY1306P"; }
        else if ("M97".equals(model)) { return "Anydata Matsunichi M97"; }
        else if ("MTAB-07535AK".equals(model)) { return "Memorex MTAB-0753AK"; }
        else if ("MT11i".equals(model)) { return "Sony Ericsson Xperia neo V"; }
        else if ("MY15ADA".equals(model)) { return "Honda Pilot"; }
        return "";

    }
    public static String lMethod (String model) {
        if ("LG-VM701".equals(model)) { return "LGE Optimus Slider"; }
        else if ("LED32K600J".equals(model)) { return "Hisense LED32K600J"; }
        else if ("LG-F520S".equals(model)) { return "LGE AKA"; }
        else if ("LG-P920h".equals(model)) { return "LGE Optimus 3D"; }
        else if ("LG-F520K".equals(model)) { return "LGE TBD"; }
        else if ("LG-F520L".equals(model)) { return "LGE AKA"; }
        else if ("LG-SU640".equals(model)) { return "LGE Optimus LTE"; }
        else if ("LG-MS690".equals(model)) { return "LGE Optimus One"; }
        else if ("LG-P815L".equals(model)) { return "LGE LG G Pad II 8.3"; }
        else if ("Luno".equals(model)) { return "Orange Luno"; }
        else if ("LG-C550".equals(model)) { return "LGE Optimus Chat"; }
        else if ("LG-C555".equals(model)) { return "LGE Optimus Chat"; }
        else if ("LG-H440AR".equals(model)) { return "LGE LG Spirit LTE"; }
        else if ("LG-P768".equals(model)) { return "LG Optimus L9"; }
        else if ("LG-P769".equals(model)) { return "LG Optimus L9"; }
        else if ("LG-P760".equals(model)) { return "LG Optimus L9"; }
        else if ("LG-P765".equals(model)) { return "LGE LG Optimus L9"; }
        else if ("LCD-LX565A".equals(model)) { return "Sharp LCD-LX565A"; }
        else if ("L7".equals(model)) { return "Camelus L7"; }
        else if ("L9".equals(model)) { return "Polaroid L9"; }
        else if ("LED46K360J".equals(model)) { return "Hisense LED46K360J"; }
        else if ("LG-AS780".equals(model)) { return "LGE LG Optimus F7"; }
        else if ("LED55K370".equals(model)) { return "Hisense LED55K370"; }
        else if ("LED55XT810X3DU".equals(model)) { return "Hisense LED55XT810X3DU"; }
        else if ("LG-D693".equals(model)) { return "LGE G3 Stylus"; }
        else if ("LG-D690".equals(model)) { return "LGE G Vista"; }
        else if ("LG-VS700".equals(model)) { return "LGE LG Enlighten"; }
        else if ("L-07C".equals(model)) { return "LGE Marquee"; }
        else if ("LG-GW620".equals(model)) { return "LGE Eve"; }
        else if ("LG-MS770".equals(model)) { return "LG Motion 4G"; }
        else if ("LED42K360J".equals(model)) { return "Hisense LED42K360J"; }
        else if ("LT18a".equals(model)) { return "Sony Ericsson Xperia arc S"; }
        else if ("LED50G05".equals(model)) { return "Hisense LED50G05"; }
        else if ("LG-E460f".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LGL86C".equals(model)) { return "LGE Optimus Core"; }
        else if ("LG-C800".equals(model)) { return "LG myTouch Q"; }
        else if ("LG-H961S".equals(model)) { return "LGE V10"; }
        else if ("LG-H961N".equals(model)) { return "LGE V10"; }
        else if ("LG-P490L".equals(model)) { return "LGE LG G Pad 8.0 LTE"; }
        else if ("LED42K560X3D".equals(model)) { return "Hisense LED42K560X3D"; }
        else if ("LG-F690S".equals(model)) { return "LGE LG X cam"; }
        else if ("LC-58UE1H".equals(model)) { return "Sharp LC-58UE1H"; }
        else if ("LC-58UE1M".equals(model)) { return "Sharp LC-58UE1M"; }
        else if ("LIFETAB_E10310".equals(model)) { return "Lenovo LIFETAB E10310"; }
        else if ("LIFETAB_E10316".equals(model)) { return "Medion LIFETAB E10316"; }
        else if ("LGLS996".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LGLS991".equals(model)) { return "LGE LG G4"; }
        else if ("LGLS990".equals(model)) { return "LG G3"; }
        else if ("LGLS992".equals(model)) { return "LGE LG G5"; }
        else if ("LED50K660X3D".equals(model)) { return "Hisense LED50K660X3D"; }
        else if ("LG-MS695".equals(model)) { return "LGE LG OPTIMUS M+"; }
        else if ("LG-H631MX".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LGUS375".equals(model)) { return "LGE LG Phoenix 2"; }
        else if ("LE43B7600A".equals(model)) { return "Haier LE43B7600A"; }
        else if ("LG-H900".equals(model)) { return "LGE V10"; }
        else if ("LG-H901".equals(model)) { return "LGE V10"; }
        else if ("LED32K360J".equals(model)) { return "Hisense LED32K360J"; }
        else if ("LG-V500".equals(model)) { return "LGE LG G Pad 8.3"; }
        else if ("LG-D955".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-D956".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-D951".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-D950".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-D959".equals(model)) { return "LG G Flex"; }
        else if ("LG-D958".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-K420".equals(model)) { return "LGE LG K10"; }
        else if ("LG-V498S1".equals(model)) { return "LGE G Pad II 8.0"; }
        else if ("LG-V498S2".equals(model)) { return "LGE G Pad II 8.0"; }
        else if ("LG-P713GO".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("LGLK430".equals(model)) { return "LGE LG G Pad F7.0"; }
        else if ("LG-P880g".equals(model)) { return "LGE Optimus 4X HD"; }
        else if ("LED39K280J3D".equals(model)) { return "Hisense LED39K280J3D"; }
        else if ("LG-F600S".equals(model)) { return "LGE V10"; }
        else if ("L-EMENT500L".equals(model)) { return "Logicom L-EMENT500"; }
        else if ("LG-F600K".equals(model)) { return "LGE V10"; }
        else if ("LG-F600L".equals(model)) { return "LGE V10"; }
        else if ("LG-D385".equals(model)) { return "LGE LG L80 Dual"; }
        else if ("LG-D380".equals(model)) { return "LGE LG L80 Dual"; }
        else if ("LG-H650".equals(model)) { return "LGE LG Zero"; }
        else if ("LG-X170fTV".equals(model)) { return "LGE LG Prime II"; }
        else if ("LIFETAB_P733X".equals(model)) { return "Medion LIFETAB P733x"; }
        else if ("LG-V525".equals(model)) { return "LGE LG G Pad III 8.0 FHD"; }
        else if ("LG-V521".equals(model)) { return "LGE LG G Pad X 8.0"; }
        else if ("LG-FL40L".equals(model)) { return "LGE 070 touch"; }
        else if ("l5400".equals(model)) { return "Toshiba L5450ME"; }
        else if ("LG-F180L".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-F180K".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-F180S".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LGL35G".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LS-4505".equals(model)) { return "Lyf LS-4505"; }
        else if ("LS-4503".equals(model)) { return "Lyf LS-4503"; }
        else if ("LG-X180g".equals(model)) { return "LGE LG ZONE"; }
        else if ("LG-V507L".equals(model)) { return "LGE LG G Pad 8.3 homeBoy"; }
        else if ("LG-LU3700".equals(model)) { return "LGE Optimus One"; }
        else if ("LG-E440g".equals(model)) { return "LG Optimus L4 II"; }
        else if ("LG-E440f".equals(model)) { return "LGE LG Optimus L4 II"; }
        else if ("LG-P659H".equals(model)) { return "LGE Optimus F3"; }
        else if ("LG-D165AR".equals(model)) { return "LGE Optimus L40"; }
        else if ("LG-P708g".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LenovoA3300-GV".equals(model)) { return "Lenovo A3300-GV"; }
        else if ("LG-P659".equals(model)) { return "LGE Optimus F3"; }
        else if ("LENNY".equals(model)) { return "Wiko LENNY"; }
        else if ("LG-D631".equals(model)) { return "LGE LG G Vista"; }
        else if ("LG-P350f".equals(model)) { return "LGE LG Pecan"; }
        else if ("LG-P350g".equals(model)) { return "LGE LG Pecan"; }
        else if ("LG-F370K".equals(model)) { return "LGE LG F70"; }
        else if ("LG-F370L".equals(model)) { return "LGE LG F70"; }
        else if ("LG-F370S".equals(model)) { return "LGE LG F70"; }
        else if ("LG-H630".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-H631".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-H636".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-SU760".equals(model)) { return "LGE Optimus 3D"; }
        else if ("LG-P870h".equals(model)) { return "LGE Optimus F5"; }
        else if ("LE55M7000CF".equals(model)) { return "Haier LE55M7000CF"; }
        else if ("LT610".equals(model)) { return "LT610"; }
        else if ("LG-F570S".equals(model)) { return "LGE LG F570S"; }
        else if ("LG-F670S".equals(model)) { return "LGE LG K10"; }
        else if ("LG-F670L".equals(model)) { return "LGE LG K10"; }
        else if ("LG-F670K".equals(model)) { return "LGE LG K10"; }
        else if ("LG-H788TR".equals(model)) { return "LGE LG AKA"; }
        else if ("LG-F470K".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-F470L".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-E730".equals(model)) { return "LGE Optimus Sol"; }
        else if ("LG-F470S".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-E739".equals(model)) { return "LG MyTouch e739"; }
        else if ("LG-LU6800".equals(model)) { return "LGE Optimus Big"; }
        else if ("LED32K360J3D".equals(model)) { return "Hisense LED32K360J3D"; }
        else if ("LT26w".equals(model)) { return "Sony Ericsson Xperia acro S"; }
        else if ("L39t".equals(model)) { return "Sony Xperia Z1"; }
        else if ("L39u".equals(model)) { return "Sony Xperia Z1"; }
        else if ("LG-F160S".equals(model)) { return "LGE LG optimus LTE2"; }
        else if ("L39h".equals(model)) { return "Sony Xperia Z1"; }
        else if ("LT26i".equals(model)) { return "Sony Xperia S"; }
        else if ("LG-H635".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-E617G".equals(model)) { return "LGE Optimus L5"; }
        else if ("LIFETAB_E7316".equals(model)) { return "Medion LIFETAB E7316"; }
        else if ("LIFETAB_E7313".equals(model)) { return "Medion LIFETAB E7313"; }
        else if ("LIFETAB_E7310".equals(model)) { return "Lenovo LIFETAB E7310"; }
        else if ("LED32K600X3D".equals(model)) { return "Hisense LED32K600X3D"; }
        else if ("LG-P720h".equals(model)) { return "LGE Optimus 3D MAX"; }
        else if ("l3453".equals(model)) { return "Toshiba L5450C"; }
        else if ("LG-D610".equals(model)) { return "LGE G2 MINI"; }
        else if ("LG-D618".equals(model)) { return "LGE G2 MINI"; }
        else if ("LG-V700".equals(model)) { return "LGE G Pad 10.1"; }
        else if ("LG-H340".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LG-H342".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LG-H343".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LT18i".equals(model)) { return "Sony Ericsson Xperia arc S"; }
        else if ("LG-LS970".equals(model)) { return "LG Optimus G"; }
        else if ("L-EMENT550".equals(model)) { return "Logicom L-EMENT550"; }
        else if ("L-EMENT551".equals(model)) { return "Logicom L-EMENT551"; }
        else if ("LG-D157f".equals(model)) { return "LGE LG-D157f"; }
        else if ("LIFETAB_S1034X".equals(model)) { return "Medion LIFETAB S1034X"; }
        else if ("LGL31L".equals(model)) { return "LGE LG F70"; }
        else if ("LG-K330".equals(model)) { return "LGE LG M1"; }
        else if ("LG-K332".equals(model)) { return "LGE LG M1"; }
        else if ("LED32K220".equals(model)) { return "Hisense LED32K220"; }
        else if ("LG-F300S".equals(model)) { return "LGE VU3"; }
        else if ("LG-D400".equals(model)) { return "LGE L90"; }
        else if ("LG-D405".equals(model)) { return "LGE L90"; }
        else if ("LG-F300L".equals(model)) { return "LGE VU3"; }
        else if ("LG-F300K".equals(model)) { return "LGE VU3"; }
        else if ("LE48M7000CF".equals(model)) { return "Haier LE48M7000CF"; }
        else if ("LG-F260S".equals(model)) { return "LGE LG Optimus LTE3"; }
        else if ("LG-D213AR".equals(model)) { return "LGE L50 Sporty"; }
        else if ("LG-E615f".equals(model)) { return "LGE LG Optimus L5 Dual"; }
        else if ("LED48L288".equals(model)) { return "Hisense LED48L288"; }
        else if ("LG-L40G".equals(model)) { return "LGE Optimus L5"; }
        else if ("LG-SU870".equals(model)) { return "LGE Optimus 3D MAX"; }
        else if ("LG-V700n".equals(model)) { return "LGE G Pad 10.1"; }
        else if ("LT650".equals(model)) { return "QMobile LT650"; }
        else if ("LGL55C".equals(model)) { return "LG LGL55C"; }
        else if ("LG-X155".equals(model)) { return "LGE LG Max"; }
        else if ("LG-LS995".equals(model)) { return "LGE LG G Flex"; }
        else if ("LC-A11A".equals(model)) { return "Sharp LC-A11A"; }
        else if ("LGL33L".equals(model)) { return "LGE LG SUNSET"; }
        else if ("LG-D180f".equals(model)) { return "LGE Optimus L40"; }
        else if ("LED65K600X3D".equals(model)) { return "Hisense LED65K600X3D"; }
        else if ("LG-E445".equals(model)) { return "LGE LG Optimus L4 II Dual"; }
        else if ("LG-E440".equals(model)) { return "LGE LG Optimus L4 II"; }
        else if ("LGMS631".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LED39K600X3DU".equals(model)) { return "Hisense LED39K600X3DU"; }
        else if ("LG-D852".equals(model)) { return "G3"; }
        else if ("LG-D857".equals(model)) { return "LGE LG G3"; }
        else if ("LG-LS696".equals(model)) { return "LGE LG Optimus Elite"; }
        else if ("LT22i".equals(model)) { return "Sony Xperia P"; }
        else if ("LG-X130g".equals(model)) { return "LGE L45"; }
        else if ("LED55XT880G3DU".equals(model)) { return "Hisense LED55XT880G3DU"; }
        else if ("LGL21G".equals(model)) { return "LGE LG Destiny"; }
        else if ("LG-H420".equals(model)) { return "LGE LG Spirit"; }
        else if ("LG-H422".equals(model)) { return "LGE LG Volt"; }
        else if ("LED50K360J".equals(model)) { return "Hisense LED50K360J"; }
        else if ("LT25i".equals(model)) { return "Sony Xperia V"; }
        else if ("LG-E410B".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E410f".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E410g".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E410c".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E410i".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LED48K681X3DU".equals(model)) { return "Hisense LED48K681X3DU"; }
        else if ("LG-X132".equals(model)) { return "LGE L45"; }
        else if ("LG-X137".equals(model)) { return "LGE L60"; }
        else if ("L-06DJOJO".equals(model)) { return "LGE Optimus Vu"; }
        else if ("LG-F220K".equals(model)) { return "LGE Optimus GK"; }
        else if ("LGUK410".equals(model)) { return "LGE G Pad 7.0 LTE"; }
        else if ("LG-D290AR".equals(model)) { return "LGE L Fino"; }
        else if ("LG-E460".equals(model)) { return "LG Optimus L5 II"; }
        else if ("LG-K371".equals(model)) { return "LGE LG Phoenix 2"; }
        else if ("LG-K373".equals(model)) { return "LGE LG Phoenix 2"; }
        else if ("LGMS659".equals(model)) { return "LGE Optimus F3"; }
        else if ("LED55K600X3D".equals(model)) { return "Hisense LED55K600X3D"; }
        else if ("LED47K600X3D".equals(model)) { return "Hisense LED47K600X3D"; }
        else if ("LG-P880".equals(model)) { return "LGE Optimus 4X HD"; }
        else if ("LS-5504".equals(model)) { return "ZTE N939Sc"; }
        else if ("LG-H443".equals(model)) { return "LGE LG Escape2"; }
        else if ("LG-H442".equals(model)) { return "LGE LG Volt 4G"; }
        else if ("LG-H440".equals(model)) { return "LGE LG Spirit LTE"; }
        else if ("LG-H445".equals(model)) { return "LGE LG Escape2"; }
        else if ("LED55K610X3D".equals(model)) { return "Hisense LED55K610X3D"; }
        else if ("LE40U5000A".equals(model)) { return "Haier LE40U5000A"; }
        else if ("LED46K330X3D".equals(model)) { return "Hisense LED46K330X3D"; }
        else if ("LED60K380".equals(model)) { return "Hisense LED60K380"; }
        else if ("LG-H320".equals(model)) { return "LGE LG Leon"; }
        else if ("LG-H326".equals(model)) { return "LGE LG Leon TV"; }
        else if ("LG-H324".equals(model)) { return "LGE LG Leon"; }
        else if ("LG-P940".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("LG-F690L".equals(model)) { return "LGE LG X cam"; }
        else if ("LG-H850".equals(model)) { return "LGE LG G5"; }
        else if ("LI902T9IN".equals(model)) { return "Auchan LI902T9IN"; }
        else if ("LG-P713TR".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("LED42K600A3D".equals(model)) { return "Hisense LED42K600A3D"; }
        else if ("LG-F120L".equals(model)) { return "LGE LG Optimus LTE Tag"; }
        else if ("LG-F120K".equals(model)) { return "LGE LG Optimus LTE Tag"; }
        else if ("LENNY2".equals(model)) { return "Wiko LENNY2"; }
        else if ("LENNY3".equals(model)) { return "Wiko LENNY3"; }
        else if ("LG-F120S".equals(model)) { return "LGE LG Optimus LTE Tag"; }
        else if ("LCD-S3A-01".equals(model)) { return "Sharp LCD-S3A-01"; }
        else if ("LG-E400".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LG-D806".equals(model)) { return "LGE LG G2"; }
        else if ("LG-D805".equals(model)) { return "G2"; }
        else if ("LG-D803".equals(model)) { return "G2"; }
        else if ("LG-D802".equals(model)) { return "LG G2"; }
        else if ("LG-D801".equals(model)) { return "LG G2"; }
        else if ("LG-D800".equals(model)) { return "LG G2"; }
        else if ("LG-K350".equals(model)) { return "LGE LG K8 LTE"; }
        else if ("LG-D693n".equals(model)) { return "LGE G3 Stylus"; }
        else if ("LG-E435g".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LG-E435f".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LG-V905R".equals(model)) { return "LGE Optimus Pad"; }
        else if ("LG-F320L".equals(model)) { return "LGE LG G2"; }
        else if ("LG-E435k".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LG-F320S".equals(model)) { return "LGE LG G2"; }
        else if ("LED42K600X3D".equals(model)) { return "Hisense LED42K600X3D"; }
        else if ("LG-E989".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-E988".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-E987".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-E980".equals(model)) { return "LG Optimus G Pro"; }
        else if ("LG-V607L".equals(model)) { return "LGE Homeboy2"; }
        else if ("LG-X165g".equals(model)) { return "LGE LG Max"; }
        else if ("LGL25L".equals(model)) { return "LGE Optimus F3"; }
        else if ("LG-H221AR".equals(model)) { return "LGE LG Joy"; }
        else if ("LG-E615".equals(model)) { return "LGE LG Optimus L5 Dual"; }
        else if ("LG-E612".equals(model)) { return "LGE Optimus L5"; }
        else if ("LT-NA7F".equals(model)) { return "NEC LifeTouch Note"; }
        else if ("LT900".equals(model)) { return "Lava XOLO LT900"; }
        else if ("LG-P920".equals(model)) { return "LGE Optimus 3D"; }
        else if ("LG-P925".equals(model)) { return "LGE Thrill 4G"; }
        else if ("LG-D170".equals(model)) { return "LGE Optimus L40"; }
        else if ("LGL39C".equals(model)) { return "LGE LG L39C"; }
        else if ("LG-F510K".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-F510L".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-F510S".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-H340n".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LG-D821".equals(model)) { return "LG Nexus 5"; }
        else if ("LG-D820".equals(model)) { return "LG Nexus 5 USA"; }
        else if ("LG-AS330".equals(model)) { return "LGE LG M1"; }
        else if ("LED65XT880G3DU".equals(model)) { return "Hisense LED65XT880G3DU"; }
        else if ("LG-E420".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E425".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LED65XT880G3DF".equals(model)) { return "Hisense LED65XT880G3DF"; }
        else if ("LED42K370".equals(model)) { return "Hisense LED42K370"; }
        else if ("LED32G180".equals(model)) { return "Hisense LED32G180"; }
        else if ("LGLS740".equals(model)) { return "LG Volt"; }
        else if ("LED32K370".equals(model)) { return "Hisense LED32K370"; }
        else if ("LG-D486".equals(model)) { return "LGE Wine Smart"; }
        else if ("LG-F200LS".equals(model)) { return "LGE Optimus Vu2"; }
        else if ("LG-F610S".equals(model)) { return "LGE LG Wine Smart Jazz"; }
        else if ("LG-P655H".equals(model)) { return "LGE Optimus F3"; }
        else if ("LG-P655K".equals(model)) { return "LGE Optimus F3"; }
        else if ("LED58K280J".equals(model)) { return "Hisense LED58K280J"; }
        else if ("LED58K280U".equals(model)) { return "Hisense LED58K280U"; }
        else if ("LS-5008".equals(model)) { return "ZTE Blade S6"; }
        else if ("LS-5009".equals(model)) { return "Lyf LS-5009"; }
        else if ("LS-5004".equals(model)) { return "Lyf LS-5004"; }
        else if ("LG-LW770".equals(model)) { return "LGE LG Optimus Regard"; }
        else if ("LG-LS855".equals(model)) { return "LGE Marquee"; }
        else if ("LG-D802TR".equals(model)) { return "LGE LG G2"; }
        else if ("LG-D950G".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-P698".equals(model)) { return "LGE Optimus Net Dual"; }
        else if ("LG-P690".equals(model)) { return "LGE Optimus Spirit"; }
        else if ("l4300".equals(model)) { return "Toshiba L4300"; }
        else if ("Logicom-S9782".equals(model)) { return "Haier Logicom S9782"; }
        else if ("LGL82VL".equals(model)) { return "LGE LG Stylo 2"; }
        else if ("LT26ii".equals(model)) { return "Sony Ericsson Xperia SL"; }
        else if ("LGLS885".equals(model)) { return "LGE G3 Vigor"; }
        else if ("LG-LU3000".equals(model)) { return "LGE Optimus Mach"; }
        else if ("LG-E425c".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LG-E470f".equals(model)) { return "LGE LG Optimus L4 II Tri"; }
        else if ("LG-E425f".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LG-E425g".equals(model)) { return "LG Optimus L3 II"; }
        else if ("LG-E425j".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("L8301".equals(model)) { return "ZTE C310"; }
        else if ("LG-CX670".equals(model)) { return "LGE Optimus One"; }
        else if ("LC-42LE860H".equals(model)) { return "Sharp LC-42LE860H"; }
        else if ("LC-42LE860M".equals(model)) { return "Sharp LC-42LE860M"; }
        else if ("LG-V930".equals(model)) { return "LGE LG Gpad X 10.1"; }
        else if ("LG-D150".equals(model)) { return "LGE LG-D150"; }
        else if ("LED84XT900G3D".equals(model)) { return "Hisense LED84XT900G3D"; }
        else if ("LG-H810".equals(model)) { return "LGE LG G4"; }
        else if ("LG-H811".equals(model)) { return "LG G4"; }
        else if ("LG-H812".equals(model)) { return "LGE LG G4"; }
        else if ("LG-H815".equals(model)) { return "G4"; }
        else if ("LG-H818".equals(model)) { return "LGE LG G4"; }
        else if ("LG-H819".equals(model)) { return "LGE LG G4"; }
        else if ("LG-X145".equals(model)) { return "LGE L60"; }
        else if ("LG-K130".equals(model)) { return "LGE LG K4 LTE"; }
        else if ("Leader".equals(model)) { return "Explay Leader"; }
        else if ("LGMS323".equals(model)) { return "LG Optimus L70"; }
        else if ("LG-F160K".equals(model)) { return "LGE LG optimus LTE2"; }
        else if ("LG-D725PR".equals(model)) { return "LGE G3 S"; }
        else if ("LG-F160L".equals(model)) { return "LGE LG optimus LTE2"; }
        else if ("LG-US780".equals(model)) { return "LGE LG Optimus F7"; }
        else if ("LED65XT800X3DU".equals(model)) { return "Hisense LED65XT800X3DU"; }
        else if ("LED50K680X3DU".equals(model)) { return "Hisense LED50K680X3DU"; }
        else if ("LED65XT890G3D".equals(model)) { return "Hisense LED65XT890G3D"; }
        else if ("LED48K380U".equals(model)) { return "Hisense LED48K380U"; }
        else if ("LG-P500h".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-F560K".equals(model)) { return "LGE G Stylo"; }
        else if ("LG-E980h".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LT28at".equals(model)) { return "Sony Ericsson Xperia ion"; }
        else if ("LG-C800G".equals(model)) { return "LGE Optimus Hub"; }
        else if ("LED75XT910G3DU".equals(model)) { return "Hisense LED75XT910G3DU"; }
        else if ("LG-H635A".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LS-5021".equals(model)) { return "Lyf LS-5021"; }
        else if ("LG-AS840".equals(model)) { return "LGE LG Optimus LTE Tag"; }
        else if ("LED42L288".equals(model)) { return "Hisense LED42L288"; }
        else if ("LG-F440L".equals(model)) { return "LGE Ice cream Smart"; }
        else if ("LED47K610J3DP".equals(model)) { return "Hisense LED47K610J3DP"; }
        else if ("LG-D520".equals(model)) { return "LGE LG Optimus F3Q"; }
        else if ("LED55L288".equals(model)) { return "Hisense LED55L288"; }
        else if ("LG-H525".equals(model)) { return "LGE LG G4c"; }
        else if ("LG-H830".equals(model)) { return "LGE LG G5"; }
        else if ("LG-H831".equals(model)) { return "LGE LG G5"; }
        else if ("LG-H520".equals(model)) { return "LGE LG Magna LTE"; }
        else if ("LG-H522".equals(model)) { return "LGE LG Prime Plus 4G"; }
        else if ("LG-VS450PP".equals(model)) { return "LGE Optimus Exceed 2"; }
        else if ("LG-H740".equals(model)) { return "LGE LG G Vista 2"; }
        else if ("LED50K370".equals(model)) { return "Hisense LED50K370"; }
        else if ("LED40K260X3D".equals(model)) { return "Hisense LED40K260X3D"; }
        else if ("LT-TLA".equals(model)) { return "NEC LifeTouch L"; }
        else if ("LG-P716".equals(model)) { return "LGE Optimus L7II"; }
        else if ("LG-P715".equals(model)) { return "LGE LG Optimus L7II"; }
        else if ("LG-P714".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("LG-P713".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("LG-P712".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("LG-P710".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("LG-F590".equals(model)) { return "LGE L5000"; }
        else if ("LED42K680X3DU".equals(model)) { return "Hisense LED42K680X3DU"; }
        else if ("LG-E451g".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-AS730".equals(model)) { return "LGE LG Optimus Select"; }
        else if ("LG-V400Y1".equals(model)) { return "LGE G Pad 7.0"; }
        else if ("LIFETAB_S7316".equals(model)) { return "Medion LIFETAB E7316"; }
        else if ("LG-D610TR".equals(model)) { return "LGE G2 MINI"; }
        else if ("LG-V400".equals(model)) { return "LGE Gpad 7.0"; }
        else if ("LG-D290".equals(model)) { return "LGE L Fino"; }
        else if ("LG-D295".equals(model)) { return "LGE L Fino"; }
        else if ("LT28i".equals(model)) { return "Sony Ericsson Xperia ion"; }
        else if ("LT28h".equals(model)) { return "Sony Ericsson Xperia ion"; }
        else if ("LE49U5000A".equals(model)) { return "Haier LE49U5000A"; }
        else if ("LG-LG870".equals(model)) { return "LGE LG Optimus F7"; }
        else if ("LG-D500".equals(model)) { return "LGE Optimus F6"; }
        else if ("LG-D505".equals(model)) { return "LGE Optimus F6"; }
        else if ("LG-P925g".equals(model)) { return "LGE LG Optimus 3D"; }
        else if ("LG-H502".equals(model)) { return "LGE LG Magna"; }
        else if ("LG-H500".equals(model)) { return "LGE LG Magna"; }
        else if ("LED55XT780G3D".equals(model)) { return "Hisense LED55XT780G3D"; }
        else if ("LG-X190".equals(model)) { return "LGE LG RAY"; }
        else if ("LG-E730f".equals(model)) { return "LGE Optimus Sol"; }
        else if ("LED55K380U".equals(model)) { return "Hisense LED55K380U"; }
        else if ("LG-K535".equals(model)) { return "LGE LG Stylus2 Plus"; }
        else if ("LG-K530".equals(model)) { return "LGE LG Stylus2 4G"; }
        else if ("LED58XT880J3DU".equals(model)) { return "Hisense LED58XT880J3DU"; }
        else if ("LED50L288".equals(model)) { return "Hisense LED50L288"; }
        else if ("LGLS675".equals(model)) { return "LGE LG M1"; }
        else if ("L-EMENT_TAB1042BTK".equals(model)) { return "Logicom L-EMENTTAB1042"; }
        else if ("LG-P505CH".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-KU3700".equals(model)) { return "LGE Optimus One"; }
        else if ("LG-D315".equals(model)) { return "LGE LG F70"; }
        else if ("LS-6001".equals(model)) { return "Hipstreet LS-6001"; }
        else if ("LG-MS870".equals(model)) { return "LGE Spirit 4G"; }
        else if ("LED39K360J".equals(model)) { return "Hisense LED39K360J"; }
        else if ("LG-D320AR".equals(model)) { return "LGE L70"; }
        else if ("LE39M7000CF".equals(model)) { return "Haier LE39M7000CF"; }
        else if ("LG-P509".equals(model)) { return "LG Optimus T"; }
        else if ("LG-P506".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-P504".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-P505".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-P503".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-P500".equals(model)) { return "LGE LG Optimus One"; }
        else if ("L-IXIR_TAB_840".equals(model)) { return "Logicom L-IXIR TAB 840"; }
        else if ("LG-F480K".equals(model)) { return "LGE Wine Smart"; }
        else if ("LG-LG855".equals(model)) { return "LGE Marquee"; }
        else if ("LG-F480S".equals(model)) { return "LGE Wine Smart"; }
        else if ("LG-F460L".equals(model)) { return "LGE LG G3 Cat.6"; }
        else if ("LG-D725".equals(model)) { return "LGE G3 Vigor"; }
        else if ("LG-F640S".equals(model)) { return "LGE LG Volt S"; }
        else if ("LG-X135".equals(model)) { return "LGE L60"; }
        else if ("LED48K370".equals(model)) { return "Hisense LED48K370"; }
        else if ("LG-H788".equals(model)) { return "LGE LG AKA"; }
        else if ("LG-LU8300".equals(model)) { return "LGE Optimus PAD LTE"; }
        else if ("LG-D858HK".equals(model)) { return "LGE LG G3"; }
        else if ("LGAS323".equals(model)) { return "LGE L70"; }
        else if ("LG-E400R".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LG-E455f".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-E400g".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LG-E400f".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LG-E400b".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LG-D335".equals(model)) { return "LGE L Bello"; }
        else if ("LG-H959".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-H950".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-H955".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-F540K".equals(model)) { return "LGE LG Volt LTE"; }
        else if ("LG-F540S".equals(model)) { return "LGE LG Volt LTE"; }
        else if ("L-02D".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("L-02E".equals(model)) { return "LGE Optimus LIFE"; }
        else if ("LGL85C".equals(model)) { return "LGE Optimus Black"; }
        else if ("LGL44VL".equals(model)) { return "LGE LG Rebel"; }
        else if ("LG-H542".equals(model)) { return "LGE LG G4 Stylus"; }
        else if ("LG-H540".equals(model)) { return "LGE LG G4 Stylus"; }
        else if ("LGS01".equals(model)) { return "LGE Wine Smart"; }
        else if ("LT30a".equals(model)) { return "Sony Ericsson Xperia T"; }
        else if ("LT30p".equals(model)) { return "Sony Xperia T"; }
        else if ("LG-V411".equals(model)) { return "LGE G Pad 7.0 LTE"; }
        else if ("LG-E431g".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LenovoA3300-H".equals(model)) { return "Lenovo A3300"; }
        else if ("LG-K500n".equals(model)) { return "LGE LG X screen"; }
        else if ("LT29i".equals(model)) { return "Sony Ericsson Xperia TX"; }
        else if ("LED42K380U".equals(model)) { return "Hisense LED42K380U"; }
        else if ("LG-P778".equals(model)) { return "LGE LG Optimus L9"; }
        else if ("L-EMENT350".equals(model)) { return "Logicom L-EMENT350"; }
        else if ("L36h".equals(model)) { return "Sony Xperia Z"; }
        else if ("LG-F430L".equals(model)) { return "LGE Gx2"; }
        else if ("LGL34C".equals(model)) { return "LG Optimus Fuel"; }
        else if ("LG-D681".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D680".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D683".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D682".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D685".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D684".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D686".equals(model)) { return "LG G Pro Lite Dual"; }
        else if ("LG-D693AR".equals(model)) { return "LGE G3 Stylus"; }
        else if ("LG-P505R".equals(model)) { return "LGE LG Optimus One"; }
        else if ("L-04C".equals(model)) { return "LGE Optimus chat"; }
        else if ("L-04E".equals(model)) { return "LGE Optimus G Pro"; }
        else if ("L-01D".equals(model)) { return "LGE Optimus LTE"; }
        else if ("LED42G200".equals(model)) { return "Hisense LED42G200"; }
        else if ("LED47K560J3D".equals(model)) { return "Hisense LED47K560J3D"; }
        else if ("l5450".equals(model)) { return "Toshiba L5450ME"; }
        else if ("LED50K360X3D".equals(model)) { return "Hisense LED50K360X3D"; }
        else if ("LG-X170g".equals(model)) { return "LGE LG Prime II"; }
        else if ("LG-MS910".equals(model)) { return "LG Esteem"; }
        else if ("LG-D610AR".equals(model)) { return "LGE G2 MINI"; }
        else if ("LG-D335E".equals(model)) { return "LGE L Bello"; }
        else if ("LG-P698f".equals(model)) { return "LGE Optimus Net Dual"; }
        else if ("LED40L288".equals(model)) { return "Hisense LED40L288"; }
        else if ("LED50K260X3D".equals(model)) { return "Hisense LED50K260X3D"; }
        else if ("LG-V700WJ".equals(model)) { return "LGE G Pad 10.1"; }
        else if ("LG-H961AN".equals(model)) { return "LGE V10"; }
        else if ("LED46K360X3D".equals(model)) { return "Hisense LED46K360X3D"; }
        else if ("LG-D690n".equals(model)) { return "LGE G3 Stylus"; }
        else if ("LC-S3H-01".equals(model)) { return "Sharp LC-S3H-01"; }
        else if ("LG-D375".equals(model)) { return "LGE LG L80 Single"; }
        else if ("LG-D370".equals(model)) { return "LGE LG L80 Single"; }
        else if ("LG-D373".equals(model)) { return "LGE LG L80 Single"; }
        else if ("LG-D213".equals(model)) { return "LGE L50 Sporty"; }
        else if ("LG-F500K".equals(model)) { return "LGE LG G4"; }
        else if ("LG-F500L".equals(model)) { return "LGE LG G4"; }
        else if ("LG-F500S".equals(model)) { return "LGE LG G4"; }
        else if ("LG-V480".equals(model)) { return "LGE G pad 8.0"; }
        else if ("LG-P940h".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("L-06C".equals(model)) { return "LGE Optimus Pad"; }
        else if ("LG-X210".equals(model)) { return "LGE LG K7"; }
        else if ("LG-V510".equals(model)) { return "LGE LG G Pad 8.3 Google Play Edition"; }
        else if ("LG-K430".equals(model)) { return "LGE LG K10 LTE"; }
        else if ("LIFETAB_S1033X".equals(model)) { return "Medion LIFETAB S1033X"; }
        else if ("LG-P990hN".equals(model)) { return "LGE Optimus 2X"; }
        else if ("LG-C660R".equals(model)) { return "LGE Optimus Pro"; }
        else if ("LG-C660h".equals(model)) { return "LGE Optimus Pro"; }
        else if ("LT750".equals(model)) { return "Walton LT750"; }
        else if ("LG-F620K".equals(model)) { return "LGE LG Class"; }
        else if ("LG-F620L".equals(model)) { return "LGE LG Class"; }
        else if ("LG-F620S".equals(model)) { return "LGE LG Class"; }
        else if ("LG-KU5400".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("LG-E465f".equals(model)) { return "LGE LG Optimus L4 II"; }
        else if ("LG-E465g".equals(model)) { return "LGE LG Optimus L4 II"; }
        else if ("LG-X150".equals(model)) { return "LGE LG Bello II"; }
        else if ("LG-E975".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-E976".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-E977".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-E970".equals(model)) { return "LG Optimus G"; }
        else if ("LG-E971".equals(model)) { return "Optimus G"; }
        else if ("LG-E973".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-E612f".equals(model)) { return "LGE Optimus L5"; }
        else if ("LG-E612g".equals(model)) { return "LG Optimus L5 Dual"; }
        else if ("LG-E510".equals(model)) { return "LGE Optimus Hub"; }
        else if ("LGMS500".equals(model)) { return "LG Optimus F6"; }
        else if ("LAP255U".equals(model)) { return "LGU+ tvG woofer"; }
        else if ("LG-H820PR".equals(model)) { return "LGE LG G5"; }
        else if ("LG-VM696".equals(model)) { return "LG Optimus Elite"; }
        else if ("LG-D393".equals(model)) { return "LGE F60"; }
        else if ("LG-D392".equals(model)) { return "LGE F60"; }
        else if ("LG-D390".equals(model)) { return "LGE F60"; }
        else if ("LG-D120AR".equals(model)) { return "LGE L30 Sporty"; }
        else if ("LT15a".equals(model)) { return "Sony Ericsson Xperia arc"; }
        else if ("LT15i".equals(model)) { return "Sony Ericsson Xperia arc"; }
        else if ("LG-K410".equals(model)) { return "LGE LG K9"; }
        else if ("LT30at".equals(model)) { return "Sony Ericsson Xperia T"; }
        else if ("LED65XT900G3DU".equals(model)) { return "Hisense LED65XT900G3DU"; }
        else if ("LG-D390AR".equals(model)) { return "LGE F60"; }
        else if ("LED50K380U".equals(model)) { return "Hisense LED50K380U"; }
        else if ("LG-F350S".equals(model)) { return "LGE G Pro2"; }
        else if ("LG-F350K".equals(model)) { return "LGE G Pro2"; }
        else if ("LG-F350L".equals(model)) { return "LGE G Pro2"; }
        else if ("LG-H788SG".equals(model)) { return "LGE LG AKA"; }
        else if ("LGV32".equals(model)) { return "LGE LG G4"; }
        else if ("LGV31".equals(model)) { return "LGE LG G3"; }
        else if ("LCD-V3A".equals(model)) { return "Sharp LCD-V3A"; }
        else if ("LG-P875".equals(model)) { return "LGE Optimus F5"; }
        else if ("LG-P870".equals(model)) { return "LGE Optimus  LTE"; }
        else if ("LG-E467f".equals(model)) { return "LGE LG Optimus L4 II Dual"; }
        else if ("LCD-LX560A".equals(model)) { return "Sharp LCD-LX560A"; }
        else if ("LG-E610v".equals(model)) { return "LGE Optimus L5"; }
        else if ("LenovoA3300-HV".equals(model)) { return "Lenovo A3300"; }
        else if ("LG-KH5200".equals(model)) { return "LGE Eve"; }
        else if ("LG-E510g".equals(model)) { return "LGE Optimus Hub"; }
        else if ("LG-E510f".equals(model)) { return "LGE Optimus Hub"; }
        else if ("LIFETAB_E10320".equals(model)) { return "Medion LIFETAB E10320"; }
        else if ("LG-LU5400".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("LTB-HS".equals(model)) { return "NEC LifeTouch B"; }
        else if ("LG-H788n".equals(model)) { return "LGE LG AKA"; }
        else if ("LED65XT900X3DU".equals(model)) { return "Hisense LED65XT900X3DU"; }
        else if ("LG-D625".equals(model)) { return "LGE G2 mini 4G LTE"; }
        else if ("LG-D175f".equals(model)) { return "LGE Optimus L40"; }
        else if ("LG-D620".equals(model)) { return "LG G2 Mini"; }
        else if ("LGL22".equals(model)) { return "LGE LGL22"; }
        else if ("LGL23".equals(model)) { return "LGE LG G Flex"; }
        else if ("LGL21".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LGL24".equals(model)) { return "LGE LG G3"; }
        else if ("London".equals(model)) { return "Marshall London"; }
        else if ("LG-LS720".equals(model)) { return "LG Optimus F3"; }
        else if ("LED50K610X3D".equals(model)) { return "Hisense LED50K610X3D"; }
        else if ("LG-D722J".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-VS700PP".equals(model)) { return "LGE LG Enlighten"; }
        else if ("LC-50UE1H".equals(model)) { return "Sharp LC-50UE1H"; }
        else if ("LC-50UE1M".equals(model)) { return "Sharp LC-50UE1M"; }
        else if ("LG-F700S".equals(model)) { return "LGE LG G5"; }
        else if ("LG-F700K".equals(model)) { return "LGE LG G5"; }
        else if ("LG-VS410PP".equals(model)) { return "LGE Optimus Zone"; }
        else if ("LG-F700L".equals(model)) { return "LGE LG G5"; }
        else if ("LCD-UF30A".equals(model)) { return "Sharp LCD-UF30A"; }
        else if ("LED42K660X3D".equals(model)) { return "Hisense LED42K660X3D"; }
        else if ("L35h".equals(model)) { return "Sony Xperia ZL"; }
        else if ("LIFETAB_E732X".equals(model)) { return "Medion LIFETAB E732X"; }
        else if ("LG-SU540".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("LG-T540".equals(model)) { return "LGE LG Magna"; }
        else if ("LG-D605".equals(model)) { return "LGE LG Optimus L9 II"; }
        else if ("LG-F200L".equals(model)) { return "LGE Optimus Vu2"; }
        else if ("LG-F200S".equals(model)) { return "LGE Optimus Vu2"; }
        else if ("LG-T280".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LED55XT900X3DU".equals(model)) { return "Hisense LED55XT900X3DU"; }
        else if ("LG-AS811".equals(model)) { return "LGE LG G4"; }
        else if ("LC-A1H".equals(model)) { return "Sharp LC-A1H"; }
        else if ("LT668".equals(model)) { return "Hisense EG68AE"; }
        else if ("LED55K260X3D".equals(model)) { return "Hisense LED55K260X3D"; }
        else if ("LGL81AL".equals(model)) { return "LGE LG Stylo 2"; }
        else if ("LG-P720".equals(model)) { return "LGE Optimus 3D MAX"; }
        else if ("LG-C660".equals(model)) { return "LGE Optimus Pro"; }
        else if ("LED32K280J3D".equals(model)) { return "Hisense LED32K280J3D"; }
        else if ("LED65XT810X3DU".equals(model)) { return "Hisense LED65XT810X3DU"; }
        else if ("LED46K260X3D".equals(model)) { return "Hisense LED46K260X3D"; }
        else if ("Liquid".equals(model)) { return "Acer Liquid"; }
        else if ("LED39K600X3D".equals(model)) { return "Hisense LED39K600X3D"; }
        else if ("LED50XT880G3DU".equals(model)) { return "Hisense LED50XT880G3DU"; }
        else if ("LePanII".equals(model)) { return "Anydata LePanII"; }
        else if ("LED42K360X3D".equals(model)) { return "Hisense LED42K360X3D"; }
        else if ("LG-P690f".equals(model)) { return "LGE Optimus Spirit"; }
        else if ("LG-P690b".equals(model)) { return "LGE Optimus Net"; }
        else if ("LS670".equals(model)) { return "LG Optimus S"; }
        else if ("LG-F490L".equals(model)) { return "LGE G3 Screen"; }
        else if ("LG-P355".equals(model)) { return "LGE PecanV"; }
        else if ("LG-P350".equals(model)) { return "LGE LG Pecan"; }
        else if ("LED65XT880G3D".equals(model)) { return "Hisense LED65XT880G3D"; }
        else if ("LG-F480L".equals(model)) { return "LGE Wine Smart"; }
        else if ("LG-F650L".equals(model)) { return "LGE LG X screen"; }
        else if ("LG-F650S".equals(model)) { return "LGE LG X screen"; }
        else if ("LCD-LX460A".equals(model)) { return "Sharp LCD-LX460A"; }
        else if ("LG-C710h".equals(model)) { return "LGE Shine Plus with Google"; }
        else if ("LG-E415g".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E415f".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E405".equals(model)) { return "LGE LG Optimus L3 Dual"; }
        else if ("LG-P875h".equals(model)) { return "LGE Optimus F5"; }
        else if ("LIFETAB_P9514".equals(model)) { return "Medion Lifetab P9514"; }
        else if ("LGAS995".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-X160".equals(model)) { return "LGE LG Max"; }
        else if ("LGAS992".equals(model)) { return "LGE LG G5"; }
        else if ("LG-LS980".equals(model)) { return "LG G2"; }
        else if ("LG-E455".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-E450".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-D410".equals(model)) { return "LGE L90 Dual"; }
        else if ("LG-D415".equals(model)) { return "LG Optimus L90"; }
        else if ("LED39K610X3D".equals(model)) { return "Hisense LED39K610X3D"; }
        else if ("LG-V909".equals(model)) { return "LGE Optimus Pad"; }
        else if ("LG-V900".equals(model)) { return "LGE Optimus Pad"; }
        else if ("LG-V901".equals(model)) { return "LGE Optimus Pad"; }
        else if ("LGL15G".equals(model)) { return "LGE Y25"; }
        else if ("LG-D340f8".equals(model)) { return "LGE L70"; }
        else if ("LG-AS990".equals(model)) { return "LGE LG G3"; }
        else if ("LG-AS991".equals(model)) { return "LGE LG G4"; }
        else if ("LT25c".equals(model)) { return "Sony Ericsson Xperia V"; }
        else if ("LIFETAB_S831X".equals(model)) { return "Medion LIFETAB S831X"; }
        else if ("LG-H410".equals(model)) { return "LGE LG Wine Smart"; }
        else if ("LG-KU5900".equals(model)) { return "LGE Optimus Black"; }
        else if ("LG-F160LV".equals(model)) { return "LGE LG optimus LTE2"; }
        else if ("L50".equals(model)) { return "Haier L50"; }
        else if ("L52".equals(model)) { return "Haier L52"; }
        else if ("L55".equals(model)) { return "Inhon L55"; }
        else if ("LG-H900PR".equals(model)) { return "LGE V10"; }
        else if ("LG-SU880".equals(model)) { return "LGE Optimus EX"; }
        else if ("LG-H960".equals(model)) { return "LGE V10"; }
        else if ("LG-P970".equals(model)) { return "LGE Optimus Black"; }
        else if ("LC-55LE860M".equals(model)) { return "Sharp LC-55LE860M"; }
        else if ("LC-55LE860H".equals(model)) { return "Sharp LC-55LE860H"; }
        else if ("LED58XT880G3D".equals(model)) { return "Hisense LED58XT880G3D"; }
        else if ("LEMENT_TAB901".equals(model)) { return "Logicom LEMENTTAB901"; }
        else if ("LG-X147".equals(model)) { return "LGE L60"; }
        else if ("LG-X140".equals(model)) { return "LGE L60"; }
        else if ("LG-F320K".equals(model)) { return "LGE LG G2"; }
        else if ("LGL43AL".equals(model)) { return "LGE LG Rebel"; }
        else if ("LG-F240K".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-F240L".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-F240S".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-F400L".equals(model)) { return "LGE LG G3"; }
        else if ("LG-F400K".equals(model)) { return "LGE LG G3"; }
        else if ("LG-F400S".equals(model)) { return "LGE LG G3"; }
        else if ("LG-F720K".equals(model)) { return "LGE LG Stylus 2"; }
        else if ("LG-F720L".equals(model)) { return "LGE LG Stylus 2"; }
        else if ("LG-F720S".equals(model)) { return "LGE LG Stylus 2"; }
        else if ("LG-V400Y7".equals(model)) { return "LGE G Pad 7.0"; }
        else if ("LT-W1".equals(model)) { return "Hisense E100TAE"; }
        else if ("Lenovo_A2105".equals(model)) { return "Lenovo A2105"; }
        else if ("LC-LX565H".equals(model)) { return "Sharp LC-LX565H"; }
        else if ("LS-5506".equals(model)) { return "Reliance LS-5506"; }
        else if ("LS-5503".equals(model)) { return "ZTE Blade S6 Plus"; }
        else if ("LGUS550".equals(model)) { return "LGE LG Logos"; }
        else if ("LG-H525n".equals(model)) { return "LGE LG G4c"; }
        else if ("LG-E985T".equals(model)) { return "LGE LG-E985T"; }
        else if ("LED40K360J".equals(model)) { return "Hisense LED40K360J"; }
        else if ("LG-F310LR".equals(model)) { return "LGE LG Gx"; }
        else if ("LT-NA7".equals(model)) { return "NEC LifeTouch Note"; }
        else if ("LG-E411g".equals(model)) { return "LG Optimus L1 II"; }
        else if ("LG-E411f".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-H848".equals(model)) { return "LGE LG G5 SE"; }
        else if ("LG-H845".equals(model)) { return "LGE LG G5 SE"; }
        else if ("LG-H840".equals(model)) { return "LGE LG G5 SE"; }
        else if ("LG-D125".equals(model)) { return "LGE L30 Sporty"; }
        else if ("LG-D120".equals(model)) { return "LGE L30 Sporty"; }
        else if ("LI12210IN".equals(model)) { return "Auchan LI12210IN"; }
        else if ("L-EMENT501".equals(model)) { return "Logicom L-EMENT501"; }
        else if ("LGMS345".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LG-E410".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LGMS395".equals(model)) { return "LG Optimus F60"; }
        else if ("LG-E985".equals(model)) { return "LGE LG-E985T"; }
        else if ("LG-E986".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-UK495".equals(model)) { return "LGE LG G Pad F 8.0"; }
        else if ("LG-D375AR".equals(model)) { return "LGE LG L80 Single"; }
        else if ("LED42K610X3D".equals(model)) { return "Hisense LED42K610X3D"; }
        else if ("LG-P895".equals(model)) { return "LGE Optimus Vu"; }
        else if ("LG-V490".equals(model)) { return "LGE G pad 8.0 LTE"; }
        else if ("LG-V496".equals(model)) { return "LGE LG G Pad F 8.0"; }
        else if ("LG-V497".equals(model)) { return "LGE LG G Pad II 8.0LTE"; }
        else if ("LG-V495".equals(model)) { return "LGE LG G Pad F 8.0"; }
        else if ("LG-V498".equals(model)) { return "LGE G Pad II 8.0"; }
        else if ("LG-V499".equals(model)) { return "LGE LG G Pad F 8.0"; }
        else if ("LG-H340AR".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LED48K360X3D".equals(model)) { return "Hisense LED48K360X3D"; }
        else if ("L10".equals(model)) { return "Camelus L10"; }
        else if ("LED40K360X3D".equals(model)) { return "Hisense LED40K360X3D"; }
        else if ("LG-E475f".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-P930".equals(model)) { return "LGE Optimus LTE"; }
        else if ("LG-P936".equals(model)) { return "LGE Optimus LTE"; }
        else if ("LG-P935".equals(model)) { return "LGE Optimus LTE"; }
        else if ("LG-H868".equals(model)) { return "LGE LG G5"; }
        else if ("LG-H860".equals(model)) { return "LGE LG G5"; }
        else if ("LG-D107".equals(model)) { return "LGE L20"; }
        else if ("LG-D105".equals(model)) { return "LGE L20"; }
        else if ("LG-D100".equals(model)) { return "LGE L20"; }
        else if ("LG-E975T".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-E975K".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-E975w".equals(model)) { return "LGE Optimus GJ"; }
        else if ("LG-V940".equals(model)) { return "LGE LG G Pad II 10.1 FHD"; }
        else if ("LG-E435".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LG-E430".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LG-E455g".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LS-4004".equals(model)) { return "Hipstreet LS-4004"; }
        else if ("Life".equals(model)) { return "NGM Italia SRL LIFE"; }
        else if ("LED55K600A3D".equals(model)) { return "Hisense LED55K600A3D"; }
        else if ("LGLS751".equals(model)) { return "LGE LG Volt II"; }
        else if ("LG-P990".equals(model)) { return "LGE Optimus 2X"; }
        else if ("LG-AS680".equals(model)) { return "LGE Optimus 2"; }
        else if ("LG-LU6500".equals(model)) { return "LGE Optimus Q2"; }
        else if ("LED58K680X3DU".equals(model)) { return "Hisense LED58K680X3DU"; }
        else if ("LS-5010".equals(model)) { return "Reliance Smartphone JS LS-5010"; }
        else if ("LS-5017".equals(model)) { return "Hipstreet LS-5017"; }
        else if ("LS-5014".equals(model)) { return "Reliance LS-5014"; }
        else if ("LG-P705f".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LG-P705g".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LBOX500".equals(model)) { return "Lexibook Playdroid"; }
        else if ("LG-D331".equals(model)) { return "LGE LBello"; }
        else if ("LG-F100S".equals(model)) { return "LGE Optimus Vu"; }
        else if ("LG-F100L".equals(model)) { return "LGE Optimus Vu"; }
        else if ("L681".equals(model)) { return "Hisense L681"; }
        else if ("LG-D337".equals(model)) { return "LGE L Bello"; }
        else if ("LG-E610".equals(model)) { return "LG Optimus L5"; }
        else if ("LED32K360".equals(model)) { return "Hisense LED32K360"; }
        else if ("LED42K330X3D".equals(model)) { return "Hisense LED42K330X3D"; }
        else if ("LG-F340S".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-F340K".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-F340L".equals(model)) { return "LGE LG G Flex"; }
        else if ("LED40K370".equals(model)) { return "Hisense LED40K370"; }
        else if ("LT971".equals(model)) { return "hisense lt971"; }
        else if ("LG-F580L".equals(model)) { return "LGE Gentle"; }
        else if ("LG-F540L".equals(model)) { return "LGE LG Volt LTE"; }
        else if ("LED46K280J3D".equals(model)) { return "Hisense LED46K280J3D"; }
        else if ("LG-L38C".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LG-D331AR".equals(model)) { return "LGE LBello"; }
        else if ("LG-D160".equals(model)) { return "LGE Optimus L40"; }
        else if ("LG-D165".equals(model)) { return "LGE Optimus L40"; }
        else if ("LED55K680X3DU".equals(model)) { return "Hisense LED55K680X3DU"; }
        else if ("LG-H222".equals(model)) { return "LGE LG Joy"; }
        else if ("LG-K121".equals(model)) { return "LGE K4"; }
        else if ("LG-K120".equals(model)) { return "LGE LG K4 LTE"; }
        else if ("LG-H731".equals(model)) { return "LGE G4 vigor"; }
        else if ("LG-H735".equals(model)) { return "LGE LG G4 Beat"; }
        else if ("LG-H734".equals(model)) { return "LGE LG G4s"; }
        else if ("LG-H736".equals(model)) { return "LGE LG G4 Beat"; }
        else if ("LenovoA588t".equals(model)) { return "Lenovo A588t"; }
        else if ("LG-D838".equals(model)) { return "LGE G Pro2"; }
        else if ("LG-SU370".equals(model)) { return "LGE Optimus One"; }
        else if ("LC-xxLE570X".equals(model)) { return "Sharp LC-50LE570X"; }
        else if ("LGLS775".equals(model)) { return "LGE LG Stylo 2"; }
        else if ("LGLS770".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LC-50LE860H".equals(model)) { return "Sharp LC-50LE860H"; }
        else if ("LC-50LE860M".equals(model)) { return "Sharp LC-50LE860M"; }
        else if ("LG-V400S1".equals(model)) { return "LGE G Pad 7.0"; }
        else if ("LED40K681X3DU".equals(model)) { return "Hisense LED40K681X3DU"; }
        else if ("LG-LG730".equals(model)) { return "LG Venice"; }
        else if ("LT700".equals(model)) { return "QMobile LT700"; }
        else if ("LGL22C".equals(model)) { return "LGE LG Power"; }
        else if ("LG-C729".equals(model)) { return "LGE LG DOUBLEPLAY"; }
        else if ("LG-LS840".equals(model)) { return "LG Viper"; }
        else if ("LG-P970h".equals(model)) { return "LGE Optimus Black"; }
        else if ("LG-P970g".equals(model)) { return "LGE Optimus Black"; }
        else if ("LED50XT900X3DU".equals(model)) { return "Hisense LED50XT900X3DU"; }
        else if ("LED58K610X3D".equals(model)) { return "Hisense LED58K610X3D"; }
        else if ("LG-AK495".equals(model)) { return "LGE LG G Pad F 8.0"; }
        else if ("L-EMENT_TAB1042".equals(model)) { return "Logicom LEMENTTAB1042"; }
        else if ("L-EMENT_TAB1040".equals(model)) { return "Logicom L-EMENT TAB 1040"; }
        else if ("LED32K610X3D".equals(model)) { return "Hisense LED32K610X3D"; }
        else if ("LGL17AG".equals(model)) { return "LGE LG Classic"; }
        else if ("LE32U5000A".equals(model)) { return "Haier LE32U5000A"; }
        else if ("LenovoA1000L-F".equals(model)) { return "Lenovo IdeaTab A1000"; }
        else if ("LED65K560J3DTR".equals(model)) { return "Hisense LED65K560J3DTR"; }
        else if ("LCD-LX565A-B".equals(model)) { return "Sharp LCD-LX565A"; }
        else if ("LED65K560J3DTB".equals(model)) { return "Hisense LED65K560J3DTB"; }
        else if ("LED39K680X3DU".equals(model)) { return "Hisense LED39K680X3DU"; }
        else if ("LG-H820".equals(model)) { return "LGE LG G5"; }
        else if ("LG-F200K".equals(model)) { return "LGE Optimus Vu2"; }
        else if ("LG-D858".equals(model)) { return "LGE LG G3"; }
        else if ("LG-D859".equals(model)) { return "LGE LG G3"; }
        else if ("LG-D850".equals(model)) { return "LG G3"; }
        else if ("LG-D851".equals(model)) { return "LG G3"; }
        else if ("LG-D855".equals(model)) { return "LG G3"; }
        else if ("LG-D856".equals(model)) { return "LGE LG G3"; }
        else if ("LGMS330".equals(model)) { return "LGE LG M1"; }
        else if ("LG-D700".equals(model)) { return "LGE LG Optimus L9"; }
        else if ("LG-K500".equals(model)) { return "LGE LG X screen"; }
        else if ("LGL96G".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LG-D693TR".equals(model)) { return "LGE G3 Stylus"; }
        else if ("LG-E450B".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-D802T".equals(model)) { return "LGE LG G2"; }
        else if ("LG-E450f".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-E450g".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-E405f".equals(model)) { return "LGE LG Optimus L3 Dual"; }
        else if ("LG-E450j".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-MS840".equals(model)) { return "LGE LG Connect 4G"; }
        else if ("LG-H340GT".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LG-US730".equals(model)) { return "LGE Splendor"; }
        else if ("LG-D285".equals(model)) { return "LGE L65"; }
        else if ("LG-D280".equals(model)) { return "LGE L65"; }
        else if ("LGL75C".equals(model)) { return "LGE LG OPTIMUS ZIP"; }
        else if ("LG-P895qb".equals(model)) { return "LGE Optimus Vu"; }
        else if ("LG-E981h".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LS-5013".equals(model)) { return "Hipstreet LS-5013"; }
        else if ("LS-5016".equals(model)) { return "Lyf LS-5016"; }
        else if ("LG-D390n".equals(model)) { return "LGE F60"; }
        else if ("LED50XT880G3D".equals(model)) { return "Hisense LED50XT880G3D"; }
        else if ("LED65XT780G3D".equals(model)) { return "Hisense LED65XT780G3D"; }
        else if ("LED42K280J3D".equals(model)) { return "Hisense LED42K280J3D"; }
        else if ("LG-H779".equals(model)) { return "LGE LG AKA"; }
        else if ("LG-H778".equals(model)) { return "LGE LG AKA"; }
        else if ("LG-H440n".equals(model)) { return "LGE LG Spirit 4G LTE"; }
        else if ("LGAS375".equals(model)) { return "LGE LG K8"; }
        else if ("LG-F460S".equals(model)) { return "LGE LG G3 Cat.6"; }
        else if ("LG-P705".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LG-F460K".equals(model)) { return "LGE LG G3 Cat.6"; }
        else if ("LG-P700".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LG-K520".equals(model)) { return "LGE LG Stylus 2"; }
        else if ("LG-D728".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-D729".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-D722".equals(model)) { return "LGE G3 S"; }
        else if ("LG-D723".equals(model)) { return "LGE G3 S"; }
        else if ("LG-D726".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-D727".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-D724".equals(model)) { return "LGE G3 S"; }
        else if ("LGL41C".equals(model)) { return "LGE L70 CDMA"; }
        else if ("LED32L288".equals(model)) { return "Hisense LED32L288"; }
        else if ("LIFETAB_P891X".equals(model)) { return "Medion LIFETAB P891X"; }
        else if ("LG-D100AR".equals(model)) { return "LGE L20"; }
        else if ("LGLS660".equals(model)) { return "LG Tribute LS660"; }
        else if ("LG-V410".equals(model)) { return "LG G Pad 7.0"; }
        else if ("LG-D682TR".equals(model)) { return "LGE G Pro Lite"; }
        else if ("L-01E".equals(model)) { return "LGE LG Optimus G"; }
        else if ("L-01F".equals(model)) { return "G2"; }
        else if ("LGMS769".equals(model)) { return "LG Optimus L9"; }
        else if ("LG-US670".equals(model)) { return "LGE Optimus One"; }
        else if ("LGL16C".equals(model)) { return "LGE Y25"; }
        else if ("LG-E420f".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("L-05E".equals(model)) { return "LGE LG optimus it L-05E"; }
        else if ("l9450".equals(model)) { return "Toshiba L9450"; }
        else if ("LG-P725".equals(model)) { return "LGE Optimus 3D MAX"; }
        else if ("Light".equals(model)) { return "ZTE V9"; }
        else if ("LIFETAB_E7312".equals(model)) { return "Lenovo LIFETAB E7310"; }
        else if ("LED65K680X3DU".equals(model)) { return "Hisense LED65K680X3DU"; }
        else if ("LG-P990H".equals(model)) { return "LGE Optimus 2X"; }
        else if ("LG-P990h".equals(model)) { return "LGE Optimus 2X"; }
        else if ("LIFETAB_S785X".equals(model)) { return "Medion LIFETAB S785X"; }
        else if ("LG-F310L".equals(model)) { return "LGE LG Gx"; }
        else if ("LG-H968".equals(model)) { return "LGE V10"; }
        else if ("LG-H962".equals(model)) { return "LGE V10"; }
        else if ("LG-H630D".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-F410S".equals(model)) { return "LGE LG G3 A"; }
        else if ("LG-LW690".equals(model)) { return "LGE Optimus One"; }
        else if ("LG-LU6200".equals(model)) { return "LGE Optimus LTE"; }
        else if ("LG-D852G".equals(model)) { return "LGE LG G3"; }
        else if ("LG-AS695".equals(model)) { return "LGE Optimus Plus"; }
        else if ("L575".equals(model)) { return "Hyundai L575"; }
        else if ("LG-P999".equals(model)) { return "LG G2X P999"; }
        else if ("LIXIR1041".equals(model)) { return "Logicom L-IXIR TAB 1041"; }
        else if ("LG-H221".equals(model)) { return "LGE LG Joy"; }
        else if ("LG-H220".equals(model)) { return "LGE LG Joy"; }
        else if ("LG-SU660".equals(model)) { return "LGE Optimus 2X"; }
        else if ("LED39K360X3D".equals(model)) { return "Hisense LED39K360X3D"; }
        else if ("LED75XT890G3D".equals(model)) { return "Hisense LED75XT890G3D"; }
        else if ("LGL45C".equals(model)) { return "LGE Optimus Net"; }
        else if ("LG-D315l".equals(model)) { return "LGE LG F70"; }
        else if ("LT100K6900A".equals(model)) { return "Hisense LT100K6900A"; }
        else if ("LE43U5000A".equals(model)) { return "Haier LE43U5000A"; }
        else if ("LGUS990".equals(model)) { return "LGE LG G3"; }
        else if ("LGUS991".equals(model)) { return "LGE LG G4"; }
        else if ("LGUS992".equals(model)) { return "LGE LG G5"; }
        else if ("LGUS995".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LGLS620".equals(model)) { return "LGE L70"; }
        else if ("LG-D329".equals(model)) { return "LGE L70"; }
        else if ("LG-D325".equals(model)) { return "LGE L70"; }
        else if ("LG-D320".equals(model)) { return "LGE L70"; }
        else if ("LG-D321".equals(model)) { return "LGE LG Optimus L70"; }
        else if ("LAP250U".equals(model)) { return "LGU+ LAP250U"; }
        else if ("LG-D221".equals(model)) { return "LGE L50 Sporty"; }
        else if ("LG-D227".equals(model)) { return "LGE L50 Sporty"; }
        else if ("L-05D".equals(model)) { return "LGE LG optimus it L-05D"; }
        else if ("LED46K660X3D".equals(model)) { return "Hisense LED46K660X3D"; }
        else if ("LED42K610J3DP".equals(model)) { return "Hisense LED42K610J3DP"; }
        else if ("LG-X220".equals(model)) { return "LGE LG K5"; }
        else if ("LED32K360X3D".equals(model)) { return "Hisense LED32K360X3D"; }
        else if ("LG-D722AR".equals(model)) { return "LGE G3 S"; }
        else if ("LG-VK700".equals(model)) { return "LGE G Pad 10.1 LTE"; }
        return "";

    }
    public static String oMethod (String model) {
        if ("ONE_TOUCH_PIXI3D".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("one695_1_coho".equals(model)) { return "CloudFone Cloudpad One 6.95"; }
        else if ("one7_0_4".equals(model)) { return "CloudFone Cloudpad One 7.0"; }
        else if ("OCTA".equals(model)) { return "Positivo OCTA"; }
        else if ("OC1020A".equals(model)) { return "3Q OC1020A"; }
        else if ("OT-990C".equals(model)) { return "TCT (Alcatel) OT-990C"; }
        else if ("one8_0_1".equals(model)) { return "CloudFone Cloudpad One 8.0"; }
        else if ("One".equals(model)) { return "One"; }
        else if ("Optimus_Madrid".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 995"; }
        else if ("ODYSSEY".equals(model)) { return "Crosscall ODYSSEY"; }
        else if ("one695_1".equals(model)) { return "CloudFone Cloudpad One 6.95"; }
        else if ("Onyx".equals(model)) { return "Explay Onyx"; }
        else if ("Optimus_San_Remo".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6030X"; }
        else if ("OWN-I62S".equals(model)) { return "Entel OWN I62S"; }
        else if ("OP110".equals(model)) { return "Olivetti OP110"; }
        else if ("Orange_Daytona".equals(model)) { return "Huawei Ascend G510"; }
        else if ("OT-310".equals(model)) { return "Partner OT-310"; }
        else if ("ONE_TOUCH_960C".equals(model)) { return "TCT (Alcatel) ONE TOUCH Ultra 960c"; }
        else if ("Onliner4".equals(model)) { return "Explay Onliner 4"; }
        else if ("one8_0_1_coho".equals(model)) { return "CloudFone Cloudpad One 8.0"; }
        else if ("ONYX".equals(model)) { return "Mobicell ONYX"; }
        else if ("one7_0_4_coho".equals(model)) { return "CloudFone Cloudpad One 7.0"; }
        return "";

    }
    public static String nMethod (String model) {
        if ("NX529J".equals(model)) { return "ZTE NX529J"; }
        else if ("NX507J".equals(model)) { return "ZTE NX507J"; }
        else if ("NX507H".equals(model)) { return "ZTE NX507J"; }
        else if ("NX601J".equals(model)) { return "ZTE NX601J"; }
        else if ("N860".equals(model)) { return "ZTE Warp N860"; }
        else if ("N861".equals(model)) { return "ZTE N861"; }
        else if ("N5L".equals(model)) { return "NUU N5L"; }
        else if ("N5110".equals(model)) { return "Oppo N5110"; }
        else if ("N5111".equals(model)) { return "Oppo N1 mimi"; }
        else if ("N5116".equals(model)) { return "Oppo N1 mimi"; }
        else if ("N5117".equals(model)) { return "Oppo N5117"; }
        else if ("NX785QC8G".equals(model)) { return "Nextbook NX785QC8G"; }
        else if ("NX505J".equals(model)) { return "ZTE NX505J"; }
        else if ("NX16A11264".equals(model)) { return "Nextbook NX16A11264"; }
        else if ("N-08D".equals(model)) { return "NEC MEDIAS TAB UL N-08D"; }
        else if ("Next7D12".equals(model)) { return "Anydata Nextbook Next7D12 Tablet"; }
        else if ("N940Sc".equals(model)) { return "ZTE N940Sc"; }
        else if ("NEOS".equals(model)) { return "Astak NEOS"; }
        else if ("NWZ-Z1000Series".equals(model)) { return "Sony NWZ-Z1000"; }
        else if ("Nexus_5X".equals(model)) { return "Nexus 5X"; }
        else if ("NW-Z1000Series".equals(model)) { return "Sony NW-Z1000"; }
        else if ("N8730-411".equals(model)) { return "NEC AGT10"; }
        else if ("N9510".equals(model)) { return "ZTE N9510"; }
        else if ("N-06D".equals(model)) { return "NEC MEDIAS TAB N-06D"; }
        else if ("N-06E".equals(model)) { return "NEC MEDIAS  X N-06E"; }
        else if ("N-06C".equals(model)) { return "NEC MEDIAS WP N-06C"; }
        else if ("N9515".equals(model)) { return "ZTE N9515"; }
        else if ("N-01D".equals(model)) { return "NEC MEDIAS PP N-01D"; }
        else if ("NSZ-GS7/GX70".equals(model)) { return "Sony NSZGS7"; }
        else if ("N1".equals(model)) { return "Oppo N1"; }
        else if ("N3".equals(model)) { return "Star NO.1 N3"; }
        else if ("N6".equals(model)) { return "Gini N6"; }
        else if ("N800".equals(model)) { return "ZTE N800"; }
        else if ("Neon".equals(model)) { return "AG Mobile Neon"; }
        else if ("N-04D".equals(model)) { return "NEC MEDIAS LTE N-04D"; }
        else if ("N-04E".equals(model)) { return "NEC MEDIAS X N-04E"; }
        else if ("N-04C".equals(model)) { return "NEC MEDIAS N-04C"; }
        else if ("N918St".equals(model)) { return "ZTE N918St"; }
        else if ("NS-P16AT10".equals(model)) { return "Insignia NS-P16AT10"; }
        else if ("N-02E".equals(model)) { return "NEC MEDIAS U N-02E"; }
        else if ("NX402".equals(model)) { return "ZTE NX40X"; }
        else if ("NX401".equals(model)) { return "Nubia NX401"; }
        else if ("NEC-NE-201A1A".equals(model)) { return "NEC NE-201"; }
        else if ("N5206".equals(model)) { return "Oppo N3"; }
        else if ("N5207".equals(model)) { return "Oppo N3"; }
        else if ("N5209".equals(model)) { return "Oppo N3"; }
        else if ("NX785QC".equals(model)) { return "Nextbook NX785QC"; }
        else if ("NEC-101S".equals(model)) { return "NEC MEDIAS NEC-101S"; }
        else if ("NX510J".equals(model)) { return "ZTE NX510J"; }
        else if ("N880".equals(model)) { return "ZTE Blade"; }
        else if ("NX403A".equals(model)) { return "ZTE NX403A"; }
        else if ("N958St".equals(model)) { return "ZTE N958St"; }
        else if ("NX512J".equals(model)) { return "ZTE NX512J"; }
        else if ("N986".equals(model)) { return "ZTE N986"; }
        else if ("NEC-102".equals(model)) { return "NEC MEDIAS NEC-102"; }
        else if ("N9500".equals(model)) { return "ZTE N9500"; }
        else if ("N919D".equals(model)) { return "ZTE N919D"; }
        else if ("NX508J".equals(model)) { return "ZTE NX508J"; }
        else if ("NEO8-1".equals(model)) { return "Haier NEO8-1"; }
        else if ("N9521".equals(model)) { return "ZTE N9521"; }
        else if ("N9520".equals(model)) { return "ZTE N9520"; }
        else if ("N9835".equals(model)) { return "ZTE N9835"; }
        else if ("NB1022".equals(model)) { return "Nobis NB1022"; }
        else if ("NX501".equals(model)) { return "ZTE NX501"; }
        else if ("N9810".equals(model)) { return "ZTE N9810"; }
        else if ("NS-14T002".equals(model)) { return "INSIGNIA NS-14T002"; }
        else if ("NS-14T004".equals(model)) { return "Insignia Flex 10.1"; }
        else if ("NS-15AT10".equals(model)) { return "Insignia NS-15AT10"; }
        else if ("N790".equals(model)) { return "ZTE N790"; }
        else if ("NX406E".equals(model)) { return "ZTE NX406E"; }
        else if ("NB09".equals(model)) { return "Nobis NB09"; }
        else if ("NB07".equals(model)) { return "Nobis NB07"; }
        else if ("Now".equals(model)) { return "NGM Italia SRL Danamic Now"; }
        else if ("N8303".equals(model)) { return "ZTE N8303"; }
        else if ("NE501J".equals(model)) { return "ZTE NE501J"; }
        else if ("N850".equals(model)) { return "ZTE N850"; }
        else if ("NX404H".equals(model)) { return "ZTE NX404H"; }
        else if ("N4L".equals(model)) { return "NUU N4L"; }
        else if ("N9130".equals(model)) { return "ZTE N9130"; }
        else if ("N9132".equals(model)) { return "ZTE N9132"; }
        else if ("NX506J".equals(model)) { return "ZTE NX506J"; }
        else if ("N855D".equals(model)) { return "ZTE N855D"; }
        else if ("N799D".equals(model)) { return "ZTE N799D"; }
        else if ("NS-P16AT785HD".equals(model)) { return "Insignia MID7802RA"; }
        else if ("Nexus_S_4G".equals(model)) { return "Samsung Nexus S 4G"; }
        else if ("N-07D".equals(model)) { return "NEC MEDIAS X N-07D"; }
        else if ("NX007HD".equals(model)) { return "Anydata Nextbook NX007HD Tablet"; }
        else if ("Nexus_6P".equals(model)) { return "Nexus 6P"; }
        else if ("NX700QC".equals(model)) { return "Nextbook NX700QC"; }
        else if ("N-05E".equals(model)) { return "NEC MEDIAS W N-05E"; }
        else if ("N-05D".equals(model)) { return "NEC MEDIAS ES N-05D"; }
        else if ("NX008HD8G".equals(model)) { return "Anydata Nextbook NX008HD8G Tablet"; }
        else if ("NS-P16AT08".equals(model)) { return "Insignia NS-P16AT08"; }
        else if ("N810".equals(model)) { return "ZTE N810"; }
        else if ("N817".equals(model)) { return "ZTE N817"; }
        else if ("N818".equals(model)) { return "ZTE N818"; }
        else if ("N-03E".equals(model)) { return "NEC Disney Mobile on docomoN-03E"; }
        else if ("NB7022S".equals(model)) { return "Nobis NB7022S"; }
        else if ("N8730-41102".equals(model)) { return "NEC AGT10"; }
        else if ("N8730-41101".equals(model)) { return "NEC AGT10"; }
        else if ("NOBA".equals(model)) { return "Nyx mobile NOBA"; }
        else if ("N762".equals(model)) { return "ZTE N762"; }
        else if ("Nexus_10".equals(model)) { return "Google Nexus 10"; }
        else if ("Next7P12".equals(model)) { return "Anydata Nextbook Next7P12"; }
        else if ("NEBUPOS3".equals(model)) { return "EBN NEBUPOS3"; }
        else if ("NEO7-1".equals(model)) { return "Haier NEO7-1"; }
        else if ("NEO7-2".equals(model)) { return "Haier NEO7-2"; }
        else if ("Nexus_9".equals(model)) { return "Nexus 9"; }
        else if ("Nexus_7".equals(model)) { return "Asus Nexus 7"; }
        else if ("Nexus_6".equals(model)) { return "Nexus 6"; }
        else if ("Nexus_5".equals(model)) { return "Nexus 5"; }
        else if ("Nexus_4".equals(model)) { return "Google Nexus 4"; }
        else if ("Nexus_S".equals(model)) { return "Samsung Nexus S"; }
        else if ("N720".equals(model)) { return "ZTE N720"; }
        else if ("NX511J".equals(model)) { return "ZTE NX511J"; }
        else if ("NEO10-1".equals(model)) { return "Haier NEO10-1"; }
        else if ("NX513J".equals(model)) { return "ZTE NX513J"; }
        else if ("NE-103T".equals(model)) { return "NEC MEDIAS U NE-103T"; }
        else if ("N9180".equals(model)) { return "ZTE N9180"; }
        else if ("NXA8QC116".equals(model)) { return "Nextbook NXA8QC116"; }
        else if ("NEC-STR".equals(model)) { return "NEC LifeTouch L"; }
        else if ("NXA116QC164".equals(model)) { return "Nextbook NXA116QC164"; }
        else if ("N9518".equals(model)) { return "ZTE N9518"; }
        else if ("N9519".equals(model)) { return "ZTE Warp 7"; }
        else if ("N9516".equals(model)) { return "ZTE N9516"; }
        else if ("NXA8LTE116".equals(model)) { return "Nextbook NXA8LTE116"; }
        else if ("N3-2200".equals(model)) { return "Acer N3-2200"; }
        else if ("NX521J".equals(model)) { return "ZTE NX521J"; }
        else if ("NABI2-NV7A".equals(model)) { return "Nabi 2 Tablet"; }
        else if ("NEC909e".equals(model)) { return "NEC909e"; }
        else if ("NV8".equals(model)) { return "Ncredible NV8"; }
        else if ("NX405H".equals(model)) { return "ZTE NX405H"; }
        else if ("NE-202".equals(model)) { return "NEC MEDIAS NE-202"; }
        else if ("NSZ-GU1".equals(model)) { return "Sony BRAVIA Smart Stick"; }
        else if ("NS-P10A6100".equals(model)) { return "Insignia NS-P10A6100"; }
        else if ("NID-7011".equals(model)) { return "NAXA NID-7011"; }
        else if ("NS-15AT07".equals(model)) { return "Insignia NS-15AT07"; }
        else if ("NBX-T7014".equals(model)) { return "Noblex NBX-T7014"; }
        else if ("NX503J".equals(model)) { return "ZTE NX503J"; }
        else if ("NX503A".equals(model)) { return "Nubia NX503A"; }
        else if ("NXA101LTE116".equals(model)) { return "Nextbook NXA101LTE116"; }
        else if ("N1W".equals(model)) { return "OPPO N1W"; }
        else if ("N1T".equals(model)) { return "Oppo N1T"; }
        else if ("N986+".equals(model)) { return "ZTE N986D"; }
        else if ("N986D".equals(model)) { return "ZTE N986D"; }
        else if ("NS-13T001".equals(model)) { return "Anydata Insignia NS-13T001 Tablet"; }
        else if ("N9101".equals(model)) { return "ZTE N9101"; }
        else if ("N9100".equals(model)) { return "ZTE N9100"; }
        else if ("N850L".equals(model)) { return "ZTE N850L"; }
        else if ("NB7850S".equals(model)) { return "Nobis NB7850S"; }
        return "";

    }
    public static String qMethod (String model) {
        if ("QUANTUM_400_LITE".equals(model)) { return "GoClever QUANTUM 400 LITE"; }
        else if ("QH-10".equals(model)) { return "Huawei T102"; }
        else if ("QOOQ".equals(model)) { return "QOOQV3"; }
        else if ("Q4T7IN".equals(model)) { return "Auchan Q4T7IN"; }
        else if ("Q-Touch".equals(model)) { return "Plus4 Q-Touch"; }
        else if ("Q4T10INK".equals(model)) { return "Auchan QILIVE"; }
        else if ("Q6S5IN4G".equals(model)) { return "Auchan Q6S5IN4G"; }
        else if ("Q".equals(model)) { return "Cellon Q"; }
        else if ("Q4514".equals(model)) { return "Auchan Q.4514"; }
        else if ("Q4T7IN3G".equals(model)) { return "Auchan Q4T7IN3G"; }
        else if ("Qrypton7".equals(model)) { return "Gigabyte TM75A"; }
        else if ("Q5S55IN4G".equals(model)) { return "Auchan Q5S55IN4G"; }
        else if ("Q4T10IN".equals(model)) { return "Auchan Q4T10IN"; }
        else if ("QMV7A".equals(model)) { return "Verizon Ellipsis 7"; }
        else if ("QM164E".equals(model)) { return "Philips FHD Ultra Slim LED TV Powered by Android"; }
        else if ("Q882".equals(model)) { return "REACH Q882"; }
        else if ("Qrypton1010".equals(model)) { return "Gigabyte TM105A"; }
        else if ("QUANTUM_1010N".equals(model)) { return "GoClever QUANTUM 1010N"; }
        else if ("Q4S6IN4G".equals(model)) { return "Auchan Q4S6IN4G"; }
        else if ("Q4T8IN".equals(model)) { return "Auchan Q4T8IN"; }
        else if ("Q.3778".equals(model)) { return "Qilive Q.3778"; }
        else if ("Quest".equals(model)) { return "AG Mobile Quest"; }
        else if ("Q6T7INK".equals(model)) { return "Auchan Q6T7INK"; }
        else if ("Q5S5IN4G".equals(model)) { return "Auchan Q5S5IN4G"; }
        else if ("QMV7B".equals(model)) { return "Verizon Wireless Ellipsis 7 (QMV7B)"; }
        else if ("quattro".equals(model)) { return "Positivo quattro"; }
        else if ("QTAQZ3".equals(model)) { return "Verizon Wireless Ellipsis 8"; }
        else if ("QM163E".equals(model)) { return "Philips 4K Ultra Slim LED TV powered by Android"; }
        else if ("QTAIR7".equals(model)) { return "Verizon Wireless Ellipsis 10"; }
        else if ("QTAQZ3KID".equals(model)) { return "Verizon Wireless QTAQZ3KID"; }
        return "";

    }
    public static String pMethod (String model) {
        if ("P469".equals(model)) { return "Micromax Canvas Tabby"; }
        else if ("PLT7109G".equals(model)) { return "Proscan PLT7109G"; }
        else if ("PX3000".equals(model)) { return "Hisense PX3000"; }
        else if ("PRO10D".equals(model)) { return "Prestige PRO10D"; }
        else if ("PRO5043".equals(model)) { return "Polaroid PRO5043"; }
        else if ("PCSGOB10SF-A".equals(model)) { return "PC Smart PCSGOB10SF-A"; }
        else if ("PLT9650G".equals(model)) { return "Proscan PLT9650G"; }
        else if ("PantechP8000".equals(model)) { return "Pantech Crossover"; }
        else if ("PI7000".equals(model)) { return "Philips T8 PI7000"; }
        else if ("PI2010".equals(model)) { return "Philips PI2010"; }
        else if ("PI2011".equals(model)) { return "Philips PI2011"; }
        else if ("PTAB751".equals(model)) { return "Polaroid PTAB751"; }
        else if ("PSP3456DUO".equals(model)) { return "Prestigio PSP3456DUO"; }
        else if ("PAD1021".equals(model)) { return "Haier PAD1021"; }
        else if ("P01T_1".equals(model)) { return "Asus ZenPad 10 (Z300CL)"; }
        else if ("PLT7130G".equals(model)) { return "Proscan PLT7130G"; }
        else if ("PRO5023".equals(model)) { return "Polaroid Phantom 5"; }
        else if ("PNDPP44Q7GPBLK".equals(model)) { return "Haier PNDPP44Q7GPBLK"; }
        else if ("PLK-CL00".equals(model)) { return "Huawei PLK-CL00"; }
        else if ("PSP3531DUO".equals(model)) { return "Prestigio PSP3531DUO"; }
        else if ("P2M".equals(model)) { return "Gionee P2M"; }
        else if ("PSP3457DUO".equals(model)) { return "Prestigio PSP3457DUO"; }
        else if ("PAD712".equals(model)) { return "Haier PAD712"; }
        else if ("PTM-Z-mini".equals(model)) { return "Tecno PHANTOM-Z-mini"; }
        else if ("PSP5505DUO".equals(model)) { return "Prestigio MultiPhone 5505 DUO"; }
        else if ("PG86100".equals(model)) { return "HTC Evo 3D"; }
        else if ("P360X".equals(model)) { return "TCT (Alcatel) P360X"; }
        else if ("PRO8D".equals(model)) { return "Prestige PRO8D"; }
        else if ("PGN608".equals(model)) { return "Condor PGN608"; }
        else if ("PGPS7795".equals(model)) { return "Prestigio PGPS7795"; }
        else if ("P00A".equals(model)) { return "Asus ZenPad 8.0 (Z380M)"; }
        else if ("P00C".equals(model)) { return "Asus ZenPad 10 (Z300M)"; }
        else if ("P4S".equals(model)) { return "Gionee P4S"; }
        else if ("P001".equals(model)) { return "Asus ZenPad C 7.0 (Z170MG)"; }
        else if ("P002".equals(model)) { return "Asus ZenPad 7.0(Z370KL)"; }
        else if ("P008".equals(model)) { return "Verizon Wireless ASUS ZenPad Z8"; }
        else if ("P5Life_TM".equals(model)) { return "AllView P5 Life"; }
        else if ("pad_d85".equals(model)) { return "Haier"; }
        else if ("P771A".equals(model)) { return "Anydata HKC P771A"; }
        else if ("PI3900-93".equals(model)) { return "Philips PI3900"; }
        else if ("PX2700".equals(model)) { return "Hisense PX2700"; }
        else if ("PAD69H".equals(model)) { return "Haier"; }
        else if ("P022".equals(model)) { return "Asus Zenpad 8.0 (Z380C)"; }
        else if ("P023".equals(model)) { return "Asus ZenPad 10 (Z300C)"; }
        else if ("P021".equals(model)) { return "Asus ZenPad 10 (Z300CG)"; }
        else if ("P024".equals(model)) { return "Asus Zenpad 8.0 (Z380KL)"; }
        else if ("Prime".equals(model)) { return "Explay Prime"; }
        else if ("PLK-AL10".equals(model)) { return "Huawei PLK-AL10"; }
        else if ("PNDPP47GP".equals(model)) { return "Haier PNDPP47GP"; }
        else if ("PI4010G".equals(model)) { return "Philips PI4010G"; }
        else if ("PE-TL20".equals(model)) { return "Huawei PE-TL20"; }
        else if ("PGN605".equals(model)) { return "Condor PGN605"; }
        else if ("PGN607".equals(model)) { return "Condor PGN607"; }
        else if ("PGN606".equals(model)) { return "Condor PGN606"; }
        else if ("Pelephone-Y300-".equals(model)) { return "Huawei Y300"; }
        else if ("PRO5023PW".equals(model)) { return "Polaroid PRO5023PW"; }
        else if ("PSP5504DUO".equals(model)) { return "Prestigio MultiPhone 5504 DUO"; }
        else if ("PantechP9060".equals(model)) { return "Pantech Pocket"; }
        else if ("Primo81".equals(model)) { return "MSI Primo81"; }
        else if ("PSP5508DUO".equals(model)) { return "Prestigio Multiphone 5508 DUO"; }
        else if ("PLT8802G".equals(model)) { return "Proscan PLT8802G"; }
        else if ("P6_Pro".equals(model)) { return "AllView P6 Pro"; }
        else if ("P2".equals(model)) { return "Haier P2"; }
        else if ("P3".equals(model)) { return "Lava Flair P3"; }
        else if ("P6".equals(model)) { return "Gionee P6"; }
        else if ("P7".equals(model)) { return "Lava P7"; }
        else if ("P4".equals(model)) { return "Gionee P4"; }
        else if ("P5_Energy".equals(model)) { return "AllView P5 Energy"; }
        else if ("P001_2".equals(model)) { return "Asus ZenPadC 7.0 (Z170MG)"; }
        else if ("PLT7223G".equals(model)) { return "Anydata Proscan PLT7223G"; }
        else if ("PLT9609G".equals(model)) { return "Proscan PLT9609G"; }
        else if ("PI3106".equals(model)) { return "Philips PI3106"; }
        else if ("PI3105".equals(model)) { return "Philips PI3105"; }
        else if ("PRO7DS".equals(model)) { return "Prestige PRO7DS"; }
        else if ("PAP5430".equals(model)) { return "BYD Prestigio PAP5430"; }
        else if ("PSP3504DUO".equals(model)) { return "Prestigio PSP3504DUO"; }
        else if ("P509".equals(model)) { return "NGM Italia SRL P509"; }
        else if ("P508".equals(model)) { return "NGM Italia SRL P508"; }
        else if ("PLK-TL00".equals(model)) { return "Huawei PLK-TL00"; }
        else if ("PC36100".equals(model)) { return "HTC Evo 4G"; }
        else if ("PGN409".equals(model)) { return "Condor PGN409"; }
        else if ("PGN404".equals(model)) { return "Condor PGN404"; }
        else if ("PB99400".equals(model)) { return "HTC Desire"; }
        else if ("PGN-508".equals(model)) { return "Condor C6+"; }
        else if ("PGN-506".equals(model)) { return "Condor C7"; }
        else if ("PGN-507".equals(model)) { return "Condor A9"; }
        else if ("PSP3505DUO".equals(model)) { return "Prestigio PSP3505DUO"; }
        else if ("PadFone".equals(model)) { return "Asus PadFone"; }
        else if ("PSP3405DUO".equals(model)) { return "Prestigio PSP3405DUO"; }
        else if ("PHS-601".equals(model)) { return "Candor PHS-601"; }
        else if ("P6_Qmax".equals(model)) { return "AllView P6 Qmax"; }
        else if ("PSP5454DUO".equals(model)) { return "Prestigio PSP5454DUO"; }
        else if ("P900/Q900".equals(model)) { return "Polaroid P900"; }
        else if ("P01MA".equals(model)) { return "Asus ZenPad S 8.0 (Z580CA)"; }
        else if ("PMT3377_Wi".equals(model)) { return "Prestigio MultiPad Thunder 7.0i"; }
        else if ("P-05D".equals(model)) { return "Panasonic P-05D"; }
        else if ("PLT7100G".equals(model)) { return "Proscan PLT7100G"; }
        else if ("PowerFour".equals(model)) { return "HighScreen Power Four"; }
        else if ("Pulsar".equals(model)) { return "Explay Pulsar"; }
        else if ("Phoenix2".equals(model)) { return "Hipstreet Phoenix2"; }
        else if ("PNDPP44QC10".equals(model)) { return "pendo PNDPP44QC10"; }
        else if ("PSP7557".equals(model)) { return "Prestigio Grace"; }
        else if ("PGN509".equals(model)) { return "Condor PGN509"; }
        else if ("Panasonic_Eluga_I3".equals(model)) { return "Panasonic Eluga I3"; }
        else if ("PSP5517DUO".equals(model)) { return "Prestigio MultiPhone 5517 DUO"; }
        else if ("P-07C".equals(model)) { return "Panasonic P-07C"; }
        else if ("P-07D".equals(model)) { return "Panasonic ELUGA Power"; }
        else if ("PLT1065G".equals(model)) { return "Proscan PLT1065G"; }
        else if ("PSP5550DUO".equals(model)) { return "Prestigio PSP5550DUO"; }
        else if ("P350X".equals(model)) { return "TCT (Alcatel) P350X"; }
        else if ("POC2".equals(model)) { return "POC2"; }
        else if ("P-01D".equals(model)) { return "Panasonic P-01D"; }
        else if ("PixelV1".equals(model)) { return "Lava Pixel V1"; }
        else if ("PSP5470DUO".equals(model)) { return "Prestigio Grace X5"; }
        else if ("PLT7803G".equals(model)) { return "Proscan PLT7803G"; }
        else if ("PT2200".equals(model)) { return "BenQ PT2200"; }
        else if ("PX2800".equals(model)) { return "Hisense PX2800"; }
        else if ("PLT8223G".equals(model)) { return "Anydata Proscan PLT8223G"; }
        else if ("PI3910".equals(model)) { return "Philips PI3910"; }
        else if ("P-03E".equals(model)) { return "Panasonic ELUGA P"; }
        else if ("P5_eMagic_TM".equals(model)) { return "AllView P5 eMagic"; }
        else if ("P8_Energy_PRO".equals(model)) { return "AllView P8 Energy Pro"; }
        else if ("PC-TS508T1W".equals(model)) { return "NEC PC-508T1W"; }
        else if ("Pulse".equals(model)) { return "Huawei U8220"; }
        else if ("Pluri_M7".equals(model)) { return "Vonino Pluri M7"; }
        else if ("Primo_ZX2".equals(model)) { return "Walton Primo ZX2"; }
        else if ("PE-UL00".equals(model)) { return "Huawei PE-UL00"; }
        else if ("Pluri_Q8".equals(model)) { return "Vonino Pluri Q8"; }
        else if ("Panasonic_P61".equals(model)) { return "Panasonic P61"; }
        else if ("P6_lite".equals(model)) { return "AllView P6 Lite"; }
        else if ("P330X".equals(model)) { return "TCT (Alcatel) P330X"; }
        else if ("PMT3121_Wi".equals(model)) { return "Prestigio MULTIPAD WIZE 3121"; }
        else if ("PMT3017_WI".equals(model)) { return "Prestigio MultiPad Wize 3017"; }
        else if ("PantechP8010".equals(model)) { return "Pantech Flex"; }
        else if ("Planet".equals(model)) { return "Explay Planet"; }
        else if ("P470".equals(model)) { return "Micromax Canvas tab"; }
        else if ("PMT3341_3G".equals(model)) { return "Prestigio MULTIPAD WIZE 3341 3G"; }
        else if ("PLT7602G".equals(model)) { return "Proscan PLT7602G"; }
        else if ("PH44100".equals(model)) { return "HTC Evo Design 4G"; }
        else if ("PSP3530DUO".equals(model)) { return "Prestigio PSP3530DUO"; }
        else if ("PAD722".equals(model)) { return "Haier PAD722"; }
        else if ("P774A".equals(model)) { return "Anydata HKC P774A"; }
        else if ("PowerFive".equals(model)) { return "HighScreen Power Five"; }
        else if ("PLT8235G".equals(model)) { return "PROSCAN PLT8235G Tablet"; }
        else if ("P4_eMagic".equals(model)) { return "AllView P4 eMagic"; }
        else if ("PE-TL00M".equals(model)) { return "Huawei PE-TL00M"; }
        else if ("PSP3450DUO".equals(model)) { return "Prestigio PSP3450DUO"; }
        else if ("PI2000".equals(model)) { return "Philips PI2000"; }
        else if ("PSP3453DUO".equals(model)) { return "Prestigio WIZE A3"; }
        else if ("PSP3455DUO".equals(model)) { return "Prestigio Grace X3"; }
        else if ("P10".equals(model)) { return "Reeder P10"; }
        else if ("PMT7287C3G".equals(model)) { return "Prestigio PMT7287C3G"; }
        else if ("Panasonic_dL1".equals(model)) { return "Panasonic ELUGA dL1"; }
        else if ("P6_lite_TM".equals(model)) { return "AllView P6 Lite"; }
        else if ("PGN511".equals(model)) { return "Condor PGN511"; }
        else if ("PGN513".equals(model)) { return "Condor PGN513"; }
        else if ("PGN515".equals(model)) { return "Condor PGN515"; }
        else if ("PGN514".equals(model)) { return "Condor PGN514"; }
        else if ("PGN517".equals(model)) { return "Condor PGN517"; }
        else if ("PGN516".equals(model)) { return "Condor PGN516"; }
        else if ("PGN518".equals(model)) { return "Condor PGN518"; }
        else if ("PRO5544PEE01".equals(model)) { return "Polaroid PRO5544PEE01"; }
        else if ("PTL21".equals(model)) { return "Pantech PTL21"; }
        else if ("PLT9606G".equals(model)) { return "Proscan PLT9606G"; }
        else if ("PRO9D".equals(model)) { return "Prestige PRO9D"; }
        else if ("PC-TS708T1W".equals(model)) { return "NEC PC-708T1W"; }
        else if ("P3S".equals(model)) { return "Gionee P3S"; }
        else if ("PMT3009_Wi_C".equals(model)) { return "Prestigio MultiPad Wize 3009"; }
        else if ("PLT9649G".equals(model)) { return "Proscan PLT9649G"; }
        else if ("PRO5044PEE01".equals(model)) { return "Polaroid PRO5044PEE01"; }
        else if ("PantechP9090".equals(model)) { return "Pantech P9090"; }
        else if ("PNDPP44QC7".equals(model)) { return "pendo PNDPP44QC7"; }
        else if ("P8_Energy_mini".equals(model)) { return "AllView P8 Energy mini"; }
        else if ("PX7".equals(model)) { return "Hisense PX1900ES"; }
        else if ("PLK-L01".equals(model)) { return "Huawei PLK-L01"; }
        else if ("PRIMO".equals(model)) { return "Konrow Primo"; }
        else if ("P901".equals(model)) { return "Polaroid P901"; }
        else if ("P8_Energy".equals(model)) { return "AllView P8 Energy"; }
        else if ("P01W".equals(model)) { return "Asus ZenPad 7.0 (Z370C)"; }
        else if ("P01V".equals(model)) { return "Asus ZenPad 7.0 (Z370CG)"; }
        else if ("P01T".equals(model)) { return "ASUSPRO Tablet-M1000CL"; }
        else if ("P01Z".equals(model)) { return "Asus ZenPad C 7.0 (Z170C)"; }
        else if ("P01Y".equals(model)) { return "Asus ZenPad C 7.0 (Z170CG)"; }
        else if ("P01M".equals(model)) { return "Asus ZenPad S 8.0 (Z580C)"; }
        else if ("P5W".equals(model)) { return "Gionee P5W"; }
        else if ("P5_Pro".equals(model)) { return "AllView P5 Pro"; }
        else if ("P1000".equals(model)) { return "Polaroid P1000"; }
        else if ("P1001".equals(model)) { return "Polaroid P1001"; }
        else if ("P4_eMagic_TM".equals(model)) { return "AllView P4 eMagic"; }
        else if ("PI3205G".equals(model)) { return "Philips PI3205G"; }
        else if ("P886A".equals(model)) { return "Anydata HKC P886A"; }
        else if ("Prime11E".equals(model)) { return "Visual Land Prestige Prime11E"; }
        else if ("PC-TE508BAW".equals(model)) { return "NEC LaVieTab PC-TE508BAW"; }
        else if ("PMT3018_WI".equals(model)) { return "Prestigio MultiPad Wize 3018"; }
        else if ("P552".equals(model)) { return "NGM Italia SRL P552"; }
        else if ("P551".equals(model)) { return "NGM Italia SRL P551"; }
        else if ("PX1900".equals(model)) { return "Hisense PX1900"; }
        else if ("P102G".equals(model)) { return "Gigabyte P102g"; }
        else if ("P4501".equals(model)) { return "Medion P4501"; }
        else if ("PSP5457DUO".equals(model)) { return "Prestigio PSP5457DUO"; }
        else if ("PSP3404DUO".equals(model)) { return "Prestigio PSP3404DUO"; }
        else if ("P9C".equals(model)) { return "Reeder P9C"; }
        else if ("Primo_NX3".equals(model)) { return "Walton Primo NX3"; }
        else if ("PantechP9070".equals(model)) { return "Pantech Burst"; }
        else if ("Preo_P2".equals(model)) { return "Teknosa Preo P2"; }
        else if ("PSP5507DUO".equals(model)) { return "Prestigio PSP5507DUO"; }
        else if ("PI3110".equals(model)) { return "Philips PI3110"; }
        else if ("PE-TL10".equals(model)) { return "Huawei PE-TL10"; }
        else if ("PC_Smart_PTSGOB8".equals(model)) { return "PC Smart PTSGOB8"; }
        else if ("PNDPP410GP".equals(model)) { return "Haier PNDPP410GP"; }
        else if ("PMT3757_3G".equals(model)) { return "Prestigio Multipad Wize 3757 3G"; }
        else if ("P778A".equals(model)) { return "Anydata HKC P778A"; }
        else if ("PMT3108_3G".equals(model)) { return "Prestigio MULTIPAD WIZE 3108 3G"; }
        else if ("PI3210G".equals(model)) { return "Philips PI3210G"; }
        else if ("PLT7777".equals(model)) { return "Anydata Proscan PLT7777"; }
        else if ("PSP5506DUO".equals(model)) { return "Prestigio PSP5506DUO"; }
        else if ("PRIMO8".equals(model)) { return "THOMSON PRIMO8 Tablet"; }
        else if ("PRIMO7".equals(model)) { return "THOMSON PRIMO7 Tablet"; }
        else if ("PRO7D".equals(model)) { return "Anydata Visual Land Prestige 7D"; }
        else if ("PMT3787_3G".equals(model)) { return "Prestigio MULTIPAD WIZE 3787 3G"; }
        else if ("PGN410".equals(model)) { return "Condor PGN410"; }
        else if ("P6_lite_mTEL".equals(model)) { return "AllView P6 Lite"; }
        else if ("PSP3503DUO".equals(model)) { return "Prestigio PSP3503DUO"; }
        else if ("PX3100".equals(model)) { return "Hisense PX3100"; }
        else if ("PMT3027_Wi".equals(model)) { return "Prestigio MULTIPAD WIZE 3027"; }
        else if ("PSP5455DUO".equals(model)) { return "Prestigio MultiPhone 5455 DUO"; }
        else if ("PMT3037_3G".equals(model)) { return "Prestigio MultiPad Wize 3037 3G"; }
        else if ("Prime10ES".equals(model)) { return "Visual Land Prestige Prime10ES"; }
        else if ("P791".equals(model)) { return "Polaroid P791"; }
        else if ("PC-TE307N1W".equals(model)) { return "NEC PC-TE307N1W"; }
        else if ("Primo73".equals(model)) { return "MSI Primo73"; }
        else if ("Primo76".equals(model)) { return "MSI Primo76"; }
        else if ("PantechP4100".equals(model)) { return "Pantech Element"; }
        else if ("PLT7649G".equals(model)) { return "Proscan PLT7649G"; }
        else if ("P300".equals(model)) { return "Micromax P300"; }
        else if ("P6_eMagic".equals(model)) { return "AllView P6 eMagic"; }
        else if ("PSP5453DUO".equals(model)) { return "Prestigio MultiPhone 5453 DUO"; }
        else if ("P5L".equals(model)) { return "Gionee P5L"; }
        else if ("P6_Energy_TM".equals(model)) { return "AllView P6 Energy"; }
        else if ("PLK-TL01H".equals(model)) { return "Huawei PLK-TL01H"; }
        else if ("PLANET".equals(model)) { return "Pantech PLANET"; }
        else if ("PG06100".equals(model)) { return "HTC EVO Shift 4G"; }
        else if ("PLK-UL00".equals(model)) { return "Huawei PLK-UL00"; }
        else if ("PTBPT5QCB7".equals(model)) { return "Protab PTBPT5QCB7"; }
        else if ("PHS-402".equals(model)) { return "Hisense U606AE"; }
        else if ("Pegasus".equals(model)) { return "Mobiwire Pegasus"; }
        else if ("PSP7505DUO".equals(model)) { return "Prestigio Grace X7"; }
        else if ("PLT7804G".equals(model)) { return "Proscan PLT7804G"; }
        else if ("PHQ520".equals(model)) { return "Condor Griffe G5"; }
        else if ("PMT3308_3G".equals(model)) { return "Prestigio MULTIPAD WIZE 3308 3G"; }
        else if ("P-04D".equals(model)) { return "Panasonic P-04D"; }
        else if ("PC1038Q".equals(model)) { return "Allfine PC1038Q"; }
        else if ("Phantom".equals(model)) { return "Explay Phantom"; }
        else if ("PE-CL00".equals(model)) { return "Huawei PE-CL00"; }
        else if ("Patio100_3G".equals(model)) { return "Fujitsu Patio100"; }
        else if ("P5_eMagic".equals(model)) { return "AllView P5 eMagic"; }
        else if ("P480".equals(model)) { return "Micromax Canvas Tab"; }
        else if ("PSP3502DUO".equals(model)) { return "Prestigio PSP3502DUO"; }
        else if ("P8_Energy_mini_TM".equals(model)) { return "AllView P8 Energy mini"; }
        else if ("PAD841".equals(model)) { return "Haier PAD841"; }
        else if ("P-06D".equals(model)) { return "Panasonic ELUGA V"; }
        else if ("PTAB1051_PTAB1055".equals(model)) { return "Polaroid PTAB1051-PTAB1055"; }
        else if ("Patio100".equals(model)) { return "Fujitsu Patio100"; }
        else if ("Play".equals(model)) { return "WeTek Play"; }
        else if ("P5Life".equals(model)) { return "AllView P5Life"; }
        else if ("PSP3452DUO".equals(model)) { return "Prestigio Muze A3"; }
        else if ("PMT3331_3G".equals(model)) { return "Prestigio MULTIPAD WIZE 3331 3G"; }
        else if ("PMT3111_Wi".equals(model)) { return "Prestigio MULTIPAD WIZE 3111"; }
        else if ("P600".equals(model)) { return "Southern Telecom Polaroid Power P600"; }
        else if ("PAD1042".equals(model)) { return "Haier PAD1042"; }
        else if ("PSP5047DUO".equals(model)) { return "Prestigio PSP5047DUO"; }
        else if ("PX2000".equals(model)) { return "Hisense PX2000"; }
        else if ("PLT7650G".equals(model)) { return "Proscan PLT7650G"; }
        else if ("PMT5877C".equals(model)) { return "Prestigio PMT5877C"; }
        else if ("P70221".equals(model)) { return "Micromax Canvas Tab"; }
        else if ("Party".equals(model)) { return "Explay Party"; }
        else if ("PULP".equals(model)) { return "Wiko PULP"; }
        else if ("P275".equals(model)) { return "Micromax P275"; }
        else if ("PLT9602G".equals(model)) { return "Proscan PLT9602G"; }
        else if ("P776A".equals(model)) { return "Anydata HKC P776A"; }
        else if ("PMT3038_3G".equals(model)) { return "Prestigio MultiPad Wize 3038 3G"; }
        else if ("PADCT1010W".equals(model)) { return "Haier PADCT1010W"; }
        else if ("PSP5307DUO".equals(model)) { return "Prestigio PSP5307DUO"; }
        else if ("P-02D".equals(model)) { return "Panasonic P-02D"; }
        else if ("P-02E".equals(model)) { return "Panasonic ELUGA X"; }
        else if ("PNDPP48GP".equals(model)) { return "Anydata Pendo PNDPP48GP"; }
        else if ("PSP5551DUO".equals(model)) { return "Prestigio PSP5551DUO"; }
        return "";

    }
    public static String sMethod (String model) {
        if ("SM-A700YD".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SM-A800IZ".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SP4".equals(model)) { return "Kodak SP4"; }
        else if ("SPH-L720".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-C105".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-C101".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-S777C".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SOL21".equals(model)) { return "Sony Ericsson Xperia VL"; }
        else if ("SM-J120FN".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SH530U".equals(model)) { return "Foxconn SH530U"; }
        else if ("SM-N7505L".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SCH-R830".equals(model)) { return "Samsung Galaxy Axiom"; }
        else if ("SM-P555K".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-P555L".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-P555M".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-P555C".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-P555Y".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-N9108V".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SHF31".equals(model)) { return "Sharp AQUOS K SHF31"; }
        else if ("SHF32".equals(model)) { return "Sharp AQUOS K SHF32"; }
        else if ("S_plus".equals(model)) { return "Gionee S plus"; }
        else if ("SH-04D".equals(model)) { return "Sharp Q-pot.Phone SH-04D"; }
        else if ("SH-04E".equals(model)) { return "Sharp AQUOS PHONE EX SH-04E"; }
        else if ("SH-04F".equals(model)) { return "Sharp AQUOS ZETA SH-04F"; }
        else if ("SHV31".equals(model)) { return "Sharp AQUOS SERIE mini SHV31"; }
        else if ("SHV33".equals(model)) { return "Sharp AQUOS Compact SHV33"; }
        else if ("SHV32".equals(model)) { return "Sharp AQUOS SERIE SHV32"; }
        else if ("SBM206SH".equals(model)) { return "Sharp AQUOS PHONE Xx 206SH"; }
        else if ("SHW-M500W".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("SCH-I959".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-T561Y".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SM-T561M".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SHW-M180K".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SHW-M180L".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SHW-M180S".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SHW-M180W".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("Sonic".equals(model)) { return "Mobicell Mobicel"; }
        else if ("SM-G900M".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900L".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900K".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900I".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900H".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900F".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900X".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900V".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900T".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900S".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900P".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SOLARIN".equals(model)) { return "Sirin SOLARIN"; }
        else if ("SM-G860P".equals(model)) { return "Samsung Galaxy S5 Sport"; }
        else if ("SHV-E110S".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SMARTTVBOX".equals(model)) { return "Panasonic SmartTVBox"; }
        else if ("SAMSUNG-SGH-I997R".equals(model)) { return "Samsung Infuse"; }
        else if ("SM-G3586V".equals(model)) { return "Samsung Galaxy Core Lite"; }
        else if ("SPH-M920".equals(model)) { return "Samsung Transform"; }
        else if ("SHARP-ADS1".equals(model)) { return "Sharp ADS1"; }
        else if ("SCH-I545".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SUGAR".equals(model)) { return "Sugar"; }
        else if ("SHL21".equals(model)) { return "Sharp AQUOS PHONE SERIE SHL21"; }
        else if ("SHL22".equals(model)) { return "Sharp AQUOS PHONE  SERIE SHL22"; }
        else if ("SHL23".equals(model)) { return "Sharp AQUOS PHONE  SERIE SHL23"; }
        else if ("SHL24".equals(model)) { return "Sharp AQUOS PHONE  SERIE mini SHL24"; }
        else if ("SHL25".equals(model)) { return "Sharp AQUOS SERIE SHL25"; }
        else if ("SH-RM02".equals(model)) { return "Sharp AQUOS SH-RM02"; }
        else if ("SAMSUNG-SGH-I537".equals(model)) { return "Samsung Galaxy S4 Active"; }
        else if ("SAMSUNG-SGH-I827".equals(model)) { return "Samsung Galaxy Appeal"; }
        else if ("SM-G313U".equals(model)) { return "Samsung Galaxy Ace 4 Lite"; }
        else if ("SBM103SH".equals(model)) { return "Sharp AQUOS PHONE SoftBank 103SH"; }
        else if ("SGP561".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SM-N916S".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N916L".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N916K".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-A700S".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SM-A700F".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SM-A700K".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SM-A700H".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SM-A700L".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SM-A7000".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SH-02F".equals(model)) { return "Sharp AQUOS PHONE EX SH-02F"; }
        else if ("SH-02G".equals(model)) { return "Sharp Disney Mobile on docomo SH-02G"; }
        else if ("SH-02D".equals(model)) { return "Sharp AQUOS PHONE slider SH-02D"; }
        else if ("SH-02E".equals(model)) { return "Sharp AQUOS PHONE ZETA SH-02E"; }
        else if ("SH-02H".equals(model)) { return "Sharp AQUOS Compact SH-02H"; }
        else if ("SM-T567V".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SM-N915T3".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("ST27i".equals(model)) { return "Sony Ericsson Xperia go"; }
        else if ("SM-P555S".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("ST27a".equals(model)) { return "Sony Ericsson Xperia Go"; }
        else if ("SM-G360GY".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-T800X".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SAMSUNG-SGH-I497".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("SM-P555".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-P550".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SpiceMi-449".equals(model)) { return "Spice Smart Flo Mi-449"; }
        else if ("SM-G3508J".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SAMSUNG-SM-T217A".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SHV-E220S".equals(model)) { return "Samsung Galaxy Pop"; }
        else if ("SPH-M900".equals(model)) { return "Samsung Moment"; }
        else if ("S1052".equals(model)) { return "Logicom S1052"; }
        else if ("s4".equals(model)) { return "Gini s4"; }
        else if ("SM-T817R4".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SCH-J021".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-G150NL".equals(model)) { return "Samsung Galaxy Folder"; }
        else if ("SGH-I757M".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SH-04G".equals(model)) { return "Sharp AQUOS EVER SH-04G"; }
        else if ("SGH-T599".equals(model)) { return "Samsung Galaxy Exhibit"; }
        else if ("SCH-i889".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SAMSUNG-SM-T817A".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SUNNY".equals(model)) { return "Wiko SUNNY"; }
        else if ("SM-J710MN".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("S440".equals(model)) { return "Positivo S440"; }
        else if ("ST25i".equals(model)) { return "Sony Xperia U"; }
        else if ("ST25a".equals(model)) { return "Sony Xperia U"; }
        else if ("SBM102SH2".equals(model)) { return "Sharp AQUOS PHONE SoftBank  102SH II"; }
        else if ("SM-A310X".equals(model)) { return "Samsung Galaxy A3(2016)"; }
        else if ("SM-A310Y".equals(model)) { return "Samsung Galaxy A3(2016)"; }
        else if ("SM-A310F".equals(model)) { return "Samsung Galaxy A3(2016)"; }
        else if ("SM-A310M".equals(model)) { return "Samsung Galaxy A3(2016)"; }
        else if ("SM-G9009W".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SBM303SH".equals(model)) { return "Sharp AQUOS PHONE Xx mini 303SH"; }
        else if ("SCL-TL00H".equals(model)) { return "Huawei Honor 4A"; }
        else if ("SCH-i569".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("SM-G900T1".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900T3".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900T4".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-T230X".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SAMSUNG-SGH-I727".equals(model)) { return "Samsung Skyrocket"; }
        else if ("SM-T330X".equals(model)) { return "Samsung Galaxy Tab 4 8.0"; }
        else if ("SAMSUNG-SM-G530A".equals(model)) { return "Samsung Galaxy Go Prime"; }
        else if ("SHIELD".equals(model)) { return "NVidia Shield"; }
        else if ("SM-T530X".equals(model)) { return "Samsung Galaxy Tab4 10.1"; }
        else if ("SCH-I200PP".equals(model)) { return "Samsung Galaxy Stellar"; }
        else if ("SAMSUNG-SM-G930A".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SUNSET2".equals(model)) { return "Wiko SUNSET2"; }
        else if ("SM-N900R4".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SM-J110M".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-J110L".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-J110H".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-J110G".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-J110F".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("ST5000".equals(model)) { return "Seemahale Telecoms ST5000"; }
        else if ("SM-T315T".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("SUBLIM".equals(model)) { return "Enspert WIKO SUBLIM"; }
        else if ("S420".equals(model)) { return "Positivo One"; }
        else if ("ST23a".equals(model)) { return "Sony Xperia miro"; }
        else if ("ST23i".equals(model)) { return "Sony Ericsson Xperia miro"; }
        else if ("SM-N910W8".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SGH-T499Y".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("SM-A500W".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SGH-T499V".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("SM-G316M".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SM-G316U".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SM-G7102T".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-T113NU".equals(model)) { return "Samsung Galaxy Tab3V 7.0"; }
        else if ("SCH-M828C".equals(model)) { return "Samsung Galaxy Precedent"; }
        else if ("SC-02H".equals(model)) { return "Samsung SC-02H"; }
        else if ("SGH-T959V".equals(model)) { return "Samsung Galaxy S 4G"; }
        else if ("SM-N910R4".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("samsung-printer-tablet".equals(model)) { return "Samsung ProXpress M4580"; }
        else if ("SM-T320".equals(model)) { return "Samsung Galaxy Tab Pro 8.4"; }
        else if ("SX930C_CJ".equals(model)) { return "CJ HelloVision Hello TV Smart"; }
        else if ("SM-G900R6".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900R7".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900R4".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-N920W8".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-J100FN".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("ST10/ST10x".equals(model)) { return "Southern Telecom Smartab ST10"; }
        else if ("SCH-P739".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SmartTab_1004_XS".equals(model)) { return "Sourcing Creation Smart Tab 1004XS"; }
        else if ("SAMSUNG-SGH-I847".equals(model)) { return "Samsung Rugby Smart"; }
        else if ("SCH-I800".equals(model)) { return "Samsung Galaxy Tab 7.0"; }
        else if ("SM-G350".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SCH-R530M".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SCH-R530X".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SCH-R530U".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SKi630t".equals(model)) { return "Hisense SKi630t"; }
        else if ("SM-T320NU".equals(model)) { return "Samsung Galaxy Tab Pro 8.4"; }
        else if ("SHV-E140L".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SHV-E140K".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SHV-E140S".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SCH-I435L".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SGH-T889".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("SM-A8000".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SM-A800S".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SM-A800X".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SM-A800F".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("STV100-4".equals(model)) { return "BlackBerry PRIV by BlackBerry"; }
        else if ("SM-A800I".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SM-G530MU".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("ST21i".equals(model)) { return "Sony Xperia Tipo"; }
        else if ("SM-N915R4".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("ST21a".equals(model)) { return "Sony Xperia tipo"; }
        else if ("SCH-I629".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("S150".equals(model)) { return "SK Telesys S150"; }
        else if ("S8Q".equals(model)) { return "ZTE S8Q"; }
        else if ("SM-P355".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-P350".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SAMSUNG-SGH-I337Z".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SAMSUNG-SGH-I437".equals(model)) { return "Samsung Galaxy Express"; }
        else if ("SM-T116NQ".equals(model)) { return "Samsung Galaxy Tab3 Lite 7.0"; }
        else if ("SM-P905V".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-G9198".equals(model)) { return "Samsung SM-G9198"; }
        else if ("SM-P905M".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SAMSUNG-SM-J120AZ".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-G531BT".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G935P".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G361HU".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SHW-M240S".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("SPH-D710BST".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("SAMSUNG-SM-J321AZ".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("STJR700".equals(model)) { return "Smartab STJR700"; }
        else if ("SCH-I605".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("SHV-E330S".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SHV-E330L".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SHV-E330K".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SAMSUNG-SM-P907A".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SGH-I747M".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SM-G357FZ".equals(model)) { return "Samsung Galaxy Ace Style"; }
        else if ("SI4301".equals(model)) { return "BYD SI4301"; }
        else if ("SHW-M480W".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SGH-T679M".equals(model)) { return "Samsung Galaxy W"; }
        else if ("SM-A500F".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SPH-M930BST".equals(model)) { return "Samsung Transform Ultra"; }
        else if ("SM-T365".equals(model)) { return "Samsung Galaxy Tab4 Active"; }
        else if ("SM-T2105".equals(model)) { return "Samsung Galaxy Tab3 Kids"; }
        else if ("SM-G313HZ".equals(model)) { return "Samsung Galaxy S Duos3"; }
        else if ("SM-G313HY".equals(model)) { return "Samsung Galaxy Ace 4"; }
        else if ("SM-G313HN".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SGH-I727R".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("SM-T210X".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("SM-T210R".equals(model)) { return "Samsung Galaxy Tab 3 7.0"; }
        else if ("SM-T210L".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SHW-M480K".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SPH-L520".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SOT21".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SGH-M919".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SCH-R680".equals(model)) { return "Samsung Repp"; }
        else if ("SM-J510GN".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-G130M".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("Smartfive".equals(model)) { return "Konrow Smartfive"; }
        else if ("SM-J120ZN".equals(model)) { return "Samsung Galaxy J1(2016)"; }
        else if ("SAMSUNG-SGH-I997".equals(model)) { return "Samsung Infuse 4G"; }
        else if ("S4040".equals(model)) { return "Mobiwire S4040"; }
        else if ("ShakerBeat".equals(model)) { return "Boost ShakerBeat"; }
        else if ("SM-T537R4".equals(model)) { return "Samsung Galaxy Tab4 10.0"; }
        else if ("SCL21".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SCL23".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SCL22".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SCL24".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SBM007SH".equals(model)) { return "Sharp AQUOS PHONE THE HYBRID SoftBank 007SH"; }
        else if ("SM-G5306W".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SCH-R970C".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SAMSUNG-SGH-I437Z".equals(model)) { return "Samsung Galaxy Express"; }
        else if ("SAMSUNG-SGH-I437P".equals(model)) { return "Samsung Galaxy Express"; }
        else if ("SM-G928V".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SAMSUNG-SGH-I927R".equals(model)) { return "Samsung Galaxy S Glide"; }
        else if ("SM-G928S".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-T360".equals(model)) { return "Samsung Galaxy Tab4 Active"; }
        else if ("SM-N910T2".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-G3502C".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SM-G3502L".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SM-G3502I".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SM-G3502U".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SM-G3502T".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SCH-I925U".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-T365M".equals(model)) { return "Samsung Galaxy Tab4 Active"; }
        else if ("SM-T365Y".equals(model)) { return "Samsung Galaxy Tab 4 Active"; }
        else if ("SM-G313HU".equals(model)) { return "Samsung Galaxy Ace 4"; }
        else if ("SCH-I415".equals(model)) { return "Samsung Galaxy Stratosphere II"; }
        else if ("SPH-M830".equals(model)) { return "Samsung Galaxy Rush"; }
        else if ("SM-T900".equals(model)) { return "Samsung Galaxy Tab Pro 12.2"; }
        else if ("SM-T905".equals(model)) { return "Samsung Galaxy Tab Pro 12.2"; }
        else if ("SHW-M430W".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("STARTRAIL6".equals(model)) { return "SFR Star Trail 6"; }
        else if ("STARTRAIL5".equals(model)) { return "SFR Star Trail 5"; }
        else if ("SHV-E120S".equals(model)) { return "Samsung Galaxy S2 HD LTE"; }
        else if ("SHV-E120K".equals(model)) { return "Samsung Galaxy S2 HD LTE"; }
        else if ("SHV-E120L".equals(model)) { return "Samsung Galaxy S2 HD LTE"; }
        else if ("SCH-R940".equals(model)) { return "Samsung Galaxy S Lightray"; }
        else if ("SCH-I739".equals(model)) { return "Samsung Galaxy Trend2"; }
        else if ("SM-G9250".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G928W8".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-J710GN".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SCH-I939D".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("STV100-1".equals(model)) { return "BlackBerry PRIV by BlackBerry"; }
        else if ("STV100-3".equals(model)) { return "BlackBerry PRIV by BlackBerry"; }
        else if ("SM-J700T".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-J700P".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-J700M".equals(model)) { return "Samsung Galaxy J7"; }
        else if ("SH-13C".equals(model)) { return "Sharp AQUOS PHONE f SH-13C"; }
        else if ("SM-J700H".equals(model)) { return "Samsung Galaxy J7"; }
        else if ("SM-J700K".equals(model)) { return "Samsung Galaxy J7"; }
        else if ("SM-J700F".equals(model)) { return "Samsung Galaxy J7"; }
        else if ("SM-J7008".equals(model)) { return "Samsung Galaxy J7"; }
        else if ("S3T10IN".equals(model)) { return "Auchan S3T10IN"; }
        else if ("SGPT13".equals(model)) { return "Sony Xperia Tablet S"; }
        else if ("SGPT12".equals(model)) { return "Sony Xperia Tablet S"; }
        else if ("SH-01EVW".equals(model)) { return "Sharp SH-01E Vivienne Westwood"; }
        else if ("SM-G388F".equals(model)) { return "Samsung Galaxy Xcover3"; }
        else if ("SM-J510MN".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SGH-M819N".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SM-N9002".equals(model)) { return "Samsung Galaxy Note3 Duos"; }
        else if ("SM-N9006".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-N9007".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SM-N9005".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-N9008".equals(model)) { return "Samsung Galaxy Note3 Duos"; }
        else if ("SM-N9009".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SM-E700M".equals(model)) { return "Samsung Galaxy E7"; }
        else if ("SM-E700F".equals(model)) { return "Samsung Galaxy E7"; }
        else if ("SM-N900S".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-N900P".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-N900V".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-E7009".equals(model)) { return "Samsung Galaxy E7"; }
        else if ("SM-N900U".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SM-E7000".equals(model)) { return "Samsung Galaxy E7"; }
        else if ("SH930W".equals(model)) { return "Foxconn SH930W"; }
        else if ("SM-N900K".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SM-N900L".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SPH-M580".equals(model)) { return "Samsung Replenish"; }
        else if ("SHW-M220L".equals(model)) { return "Samsung Galaxy Neo"; }
        else if ("SHW-M340S".equals(model)) { return "Samsung Galaxy M Style"; }
        else if ("SCH-I435".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SAMSUNG-SM-T537A".equals(model)) { return "Samsung Galaxy Tab4 10.0"; }
        else if ("SAMSUNG-SM-G850A".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SGH-I957D".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SM-S975L".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SCH-R960".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SM-G800R4".equals(model)) { return "Samsung Galaxy S5 Mini"; }
        else if ("SCH-R740C".equals(model)) { return "Samsung Galaxy Discover"; }
        else if ("SHV-E470S".equals(model)) { return "Samsung Galaxy S4 Active"; }
        else if ("SHV-E270K".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("SHV-E270S".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("SCH-I337".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("S10-232L".equals(model)) { return "HUAWEI MediaPad 10 Link+"; }
        else if ("S4S5IN4G".equals(model)) { return "Auchan S4S5IN4G"; }
        else if ("SAMSUNG-SM-N915A".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("S480".equals(model)) { return "Positivo S480"; }
        else if ("SM-P601".equals(model)) { return "Samsung Galaxy Note 10.1 2014 Edition"; }
        else if ("SM-P602".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-P605".equals(model)) { return "Samsung Galaxy Note 10.1 2014 Edition"; }
        else if ("SM-T210".equals(model)) { return "Samsung Galaxy Tab 3"; }
        else if ("SM-J100H".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("S8-306L".equals(model)) { return "HUAWEI MediaPad M1 8.0"; }
        else if ("SM-G386W".equals(model)) { return "Samsung Galaxy Core"; }
        else if ("SM-G386T".equals(model)) { return "Samsung Galaxy Avant"; }
        else if ("SM-G386F".equals(model)) { return "Samsung Galaxy Core LTE"; }
        else if ("SM-A700X".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SH950C-CM".equals(model)) { return "LGE SH950C-CM"; }
        else if ("SM-G316HU".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SCH-I939".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SAMSUNG-SM-T707A".equals(model)) { return "Samsung Galaxy TabS 8.4"; }
        else if ("SM-A7009".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SM-T560NU".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("Surfer7773G".equals(model)) { return "Explay Surfer777 3G"; }
        else if ("SM-G3518".equals(model)) { return "Samsung Galaxy Core LTE"; }
        else if ("SM-G7202".equals(model)) { return "Samsung Galaxy Grand Max"; }
        else if ("SM-G7200".equals(model)) { return "Samsung Galaxy Grand Max"; }
        else if ("SCH-I100".equals(model)) { return "Samsung Gem"; }
        else if ("SM-A3009".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-A3000".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SGP611".equals(model)) { return "Sony Xperia Z3 Tablet Compact"; }
        else if ("SGP341".equals(model)) { return "Sony Ericsson Xperia Tablet Z"; }
        else if ("SGP612".equals(model)) { return "Sony Xperia Z3 Tablet Compact"; }
        else if ("SGH-I777M".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SM-A300M".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-A300G".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-A300F".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-A300Y".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-A300X".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SCH-S720C".equals(model)) { return "Samsung Proclaim"; }
        else if ("SM-J320ZN".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-T713".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SM-T710".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SM-T715".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SM-T719".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SCH-i579".equals(model)) { return "Samsung Galaxy Ace Duos"; }
        else if ("SM-G9300".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G9308".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930F".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930L".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930K".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930T".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930V".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930P".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930S".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930X".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SAMSUNG-SGH-I957D".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SAMSUNG-SGH-I957M".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SAMSUNG-SGH-I957R".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("S4T7IN".equals(model)) { return "Auchan S4T7IN"; }
        else if ("SM-T355C".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-T355Y".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-G920T1".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SCH-I869".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("SCH-I535PP".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SC-03G".equals(model)) { return "Samsung Galaxy Tab S 8.4"; }
        else if ("SC-03D".equals(model)) { return "Samsung Galaxy S2 LTE"; }
        else if ("SC-03E".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-G3558".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SM-G150N0".equals(model)) { return "Samsung Galaxy Folder"; }
        else if ("SM-G150NS".equals(model)) { return "Samsung Galaxy Folder"; }
        else if ("SM-G150NK".equals(model)) { return "Samsung Galaxy Folder"; }
        else if ("SAMSUNG-SM-G900A".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SCH-I545L".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-G530P".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G530T".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G530W".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G530Y".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SHV-E400K".equals(model)) { return "Samsung Galaxy Golden"; }
        else if ("SHV-E400S".equals(model)) { return "Samsung Galaxy Golden"; }
        else if ("SM-G530F".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G530H".equals(model)) { return "Samsung Galaxy Tab3 Lite 7.0"; }
        else if ("SM-G530M".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SAMSUNG-SM-T337A".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SGH-T769".equals(model)) { return "Samsung Galaxy S Blaze"; }
        else if ("SM-G155S".equals(model)) { return "Samsung Galaxy Folder"; }
        else if ("SM-G930W8".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SGH-T959W".equals(model)) { return "Samsung Galaxy S"; }
        else if ("SGH-T959P".equals(model)) { return "Samsung Galaxy S Fascinate"; }
        else if ("SGH-T959D".equals(model)) { return "Samsung Galaxy S Vibrant"; }
        else if ("S3T7IN3G".equals(model)) { return "Auchan S3T7IN3G"; }
        else if ("SM-G928N0".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SSR1-5-8M".equals(model)) { return "Sico SmartPhone SSR1-5-8M"; }
        else if ("SHV-E275S".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("SDU".equals(model)) { return "Panasonic SDU"; }
        else if ("SHW-M300W".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("SGP321".equals(model)) { return "Sony Ericsson Xperia Tablet Z"; }
        else if ("SM-J700T1".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("sp401".equals(model)) { return "Sourcing Creation sp401"; }
        else if ("SCH-R920".equals(model)) { return "Samsung Galaxy Attain"; }
        else if ("SM-G318HZ".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("ST26i".equals(model)) { return "Sony Xperia J"; }
        else if ("SCH-i559".equals(model)) { return "Samsung Galaxy Pop (CDMA)"; }
        else if ("SM-G9006W".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G130H".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("SM-G130E".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("SM-G130U".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("SGH-T959".equals(model)) { return "Samsung Galaxy S Vibrant"; }
        else if ("SM-T357W".equals(model)) { return "Samsung Galaxy Tab A S 8.0"; }
        else if ("SM-T357T".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-T377R4".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SM-J200GU".equals(model)) { return "Samsung Galaxy J2"; }
        else if ("SCH-R720".equals(model)) { return "Samsung Admire"; }
        else if ("SM-S765C".equals(model)) { return "Samsung Galaxy Ace Style"; }
        else if ("SC-01H".equals(model)) { return "Samsung SC-01H"; }
        else if ("SHV-E300".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("S550".equals(model)) { return "Positivo S550"; }
        else if ("SC-01C".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SC-01D".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("SC-01E".equals(model)) { return "Samsung Galaxy Tab 7.7 Plus"; }
        else if ("SC-01F".equals(model)) { return "Samsung SC-01F"; }
        else if ("SC-01G".equals(model)) { return "Samsung SC-01G"; }
        else if ("S40".equals(model)) { return "Cat S40"; }
        else if ("SHW-M380S".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("S8".equals(model)) { return "Aikun Solely Tab S8"; }
        else if ("SHW-M380W".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("S1".equals(model)) { return "Lava Flair S1"; }
        else if ("S7".equals(model)) { return "Aikun Solely Tab S7"; }
        else if ("S6".equals(model)) { return "Gionee S6"; }
        else if ("SM-J510FN".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SHW-M380K".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("SM-G3508I".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SM-T520".equals(model)) { return "Samsung Galaxy Tab Pro 10.1"; }
        else if ("SM-T525".equals(model)) { return "Samsung Galaxy Tap Pro 10.1"; }
        else if ("SGH-I257M".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SM-T817W".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-T817V".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-T817T".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-T817P".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SI".equals(model)) { return "Cellon SI"; }
        else if ("SM-G3559".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SNB02-NV7A".equals(model)) { return "Nabi 2S Tablet"; }
        else if ("SM-G355M".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SM-G355H".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SM-G7508Q".equals(model)) { return "Samsung Galaxy Mega2"; }
        else if ("SCV33".equals(model)) { return "Samsung Galaxy S7 edge"; }
        else if ("Samba".equals(model)) { return "Mobicell Samba"; }
        else if ("SH-03G".equals(model)) { return "Sharp AQUOS ZETA SH-03G"; }
        else if ("SM-G900RZWAUSC".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SU950".equals(model)) { return "LGE Optimus Z"; }
        else if ("SGH-N035".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-E500F".equals(model)) { return "Samsung Galaxy E5"; }
        else if ("SM-E500M".equals(model)) { return "Samsung Galaxy E5"; }
        else if ("SM-E500H".equals(model)) { return "Samsung Galaxy E5"; }
        else if ("SCH-S960L".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-G130BU".equals(model)) { return "Samsung Galaxy Young2 Pro"; }
        else if ("SM-G130BT".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("SM-T3777".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SM-J510K".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SBM204SH".equals(model)) { return "Sharp SBM204SH"; }
        else if ("SHV-E250S".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("SHV-E250L".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("SHV-E250K".equals(model)) { return "Samsung Galaxy Note 2"; }
        else if ("SM-T377P".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SM-T377T".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SM-T377V".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SM-T377W".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SCH-I535".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SCH-I829".equals(model)) { return "Samsung Galaxy Style Duos"; }
        else if ("SM-G361H".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-G361M".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-G361F".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SBM205SH".equals(model)) { return "Sharp AQUOS PHONE ss 205SH"; }
        else if ("SCH-I759".equals(model)) { return "Samsung Galaxy Infinite"; }
        else if ("S39h".equals(model)) { return "Sony Ericsson Xperia C"; }
        else if ("S60".equals(model)) { return "Southern Telecom Polaroid Snap S60"; }
        else if ("SGH-I337M".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-J500F".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SM-J500M".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SHW-M250S".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SHW-M250L".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SHW-M250K".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SGP512".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SGP511".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SM-T815C".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-T815Y".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SAMSUNG-SGH-I896".equals(model)) { return "Samsung Galaxy S Captivate"; }
        else if ("SAMSUNG-SGH-I897".equals(model)) { return "Samsung Captivate"; }
        else if ("SAMSUNG-SGH-I547".equals(model)) { return "Samsung Galaxy Rugby Pro"; }
        else if ("Shine".equals(model)) { return "Explay Shine"; }
        else if ("SM-J120F".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-J120G".equals(model)) { return "Samsung Galaxy J1(2016)"; }
        else if ("SM-J120M".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-J120H".equals(model)) { return "Samsung Galaxy J1(2016)"; }
        else if ("SM-J120W".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SPH-L600".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SGH-I927".equals(model)) { return "Samsung Captivate Glide"; }
        else if ("SCH-I925".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SCH-I699I".equals(model)) { return "Samsung China Telecom"; }
        else if ("SH8128U".equals(model)) { return "Sharp SH8128U"; }
        else if ("SM-G850FQ".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SGH-T859".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("SO-04G".equals(model)) { return "Sony Xperia A4"; }
        else if ("SO-04F".equals(model)) { return "Sony Xperia A2"; }
        else if ("SO-04E".equals(model)) { return "Sony Ericsson Xperia A"; }
        else if ("SO-04D".equals(model)) { return "Sony Ericsson Xperia GX"; }
        else if ("SM-G357M".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("SHV-E300S".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-G5500".equals(model)) { return "Samsung Galaxy On5"; }
        else if ("SHV-E300L".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SHV-E300K".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SPH-L900".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("SM-A510XZ".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SAMSUNG-SGH-I957".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SM-G935W8".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SPH-P100".equals(model)) { return "Samsung Galaxy Tab 7.0"; }
        else if ("SmartTab10".equals(model)) { return "ZTE SmartTab10"; }
        else if ("SCL-CL00".equals(model)) { return "Huawei Honor 4A"; }
        else if ("SGH-T999".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SMART64".equals(model)) { return "Binatone SMART64"; }
        else if ("SM-G920R4".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920R6".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920R7".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-N9008V".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("Swift".equals(model)) { return "AG Mobile Swift"; }
        else if ("SM-T375L".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SM-G930R4".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G900MD".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-T375S".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SCH-I510".equals(model)) { return "Samsung Droid Charge"; }
        else if ("S510".equals(model)) { return "Acer Liquid S1"; }
        else if ("SC-05D".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SC-05G".equals(model)) { return "Samsung SC-05G"; }
        else if ("SPH-L710".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SM-A510F".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510K".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510L".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510M".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510X".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510Y".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-T530NU".equals(model)) { return "Samsung Galaxy Tab 4 10.1"; }
        else if ("SCH-i909".equals(model)) { return "Samsung Galaxy S"; }
        else if ("SM-T561".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SM-T560".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SM-T562".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SM-T530NN".equals(model)) { return "Samsung Galaxy Tab4"; }
        else if ("SM-N900".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-A5100".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A5108".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-G720N0".equals(model)) { return "Samsung Galaxy Grand-Max"; }
        else if ("SM-A9100".equals(model)) { return "Samsung Galaxy A9 Pro"; }
        else if ("SHW-M250".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SGH-T879".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SRF79".equals(model)) { return "Smartab SRF79"; }
        else if ("SO-02H".equals(model)) { return "Sony Xperia Z5 Compact"; }
        else if ("SO-02C".equals(model)) { return "Sony Ericsson Xperia Acro"; }
        else if ("SO-02E".equals(model)) { return "Sony Ericsson Xperia Z"; }
        else if ("SO-02D".equals(model)) { return "Sony Ericsson Xperia S"; }
        else if ("SO-02G".equals(model)) { return "Sony Xperia Z3 Compact"; }
        else if ("SO-02F".equals(model)) { return "Sony Xperia Z1f"; }
        else if ("SH-09D".equals(model)) { return "Sharp AQUOS PHONE ZETA SH-09D"; }
        else if ("SM-N910T3".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SBM009SH".equals(model)) { return "Sharp AQUOS PHONE THE PREMIUM SoftBank 009SH"; }
        else if ("SM-A300XU".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-A300XZ".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-J320R4".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-G530R7".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G530R4".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SAMSUNG-SM-G925A".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-J320VPP".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-J105B".equals(model)) { return "Samsung Galaxy J1 Mini"; }
        else if ("SM-J105M".equals(model)) { return "Samsung Galaxy J1 Mini"; }
        else if ("SM-J105H".equals(model)) { return "Samsung Galaxy J1 Mini"; }
        else if ("SM-J105Y".equals(model)) { return "Samsung Galaxy J1 Mini"; }
        else if ("SM-T805Y".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805S".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805W".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805K".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805L".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805M".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SLIDE".equals(model)) { return "Wiko SLIDE"; }
        else if ("SM-T677NK".equals(model)) { return "Samsung Galaxy view"; }
        else if ("SM-T677NL".equals(model)) { return "Samsung Galaxy view"; }
        else if ("SM-T800".equals(model)) { return "Samsung Galaxy Tab S 10.5"; }
        else if ("SM-T807".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SHV-E210S".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SHV-E210K".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SHV-E210L".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("ST7001".equals(model)) { return "Essentielb ST7001 Tablet"; }
        else if ("S350".equals(model)) { return "BYD Solo S350"; }
        else if ("Skill".equals(model)) { return "Haier Skill"; }
        else if ("SBM302SH".equals(model)) { return "Sharp AQUOS PHONE Xx 302SH"; }
        else if ("Selecline-854599".equals(model)) { return "Auchan Selecline-854599"; }
        else if ("SM-C111".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("ST18i".equals(model)) { return "Sony Ericsson Xperia ray"; }
        else if ("SM-C115".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("SGP551".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SM-N9109W".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-G3812B".equals(model)) { return "Samsung Galaxy S3 Slim"; }
        else if ("SPH-D710VMUB".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("SBM107SHB".equals(model)) { return "Sharp SoftBank 107SH B"; }
        else if ("SM-J710F".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-J710K".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-J7109".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-J7108".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-G310HN".equals(model)) { return "Samsung Galaxy Ace Style"; }
        else if ("SH-07E".equals(model)) { return "Sharp AQUOS PHONE si SH-07E"; }
        else if ("SH-07D".equals(model)) { return "Sharp AQUOS PHONE st SH-07D"; }
        else if ("SHT21".equals(model)) { return "Sharp AQUOS PAD SHT21"; }
        else if ("SHT22".equals(model)) { return "Sharp AQUOS PAD  SHT22"; }
        else if ("SOL25".equals(model)) { return "Sony Xperia ZL2"; }
        else if ("SOL24".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("SOL26".equals(model)) { return "Sony Xperia Z3"; }
        else if ("SOL23".equals(model)) { return "Sony Xperia Z1"; }
        else if ("SOL22".equals(model)) { return "Sony Ericsson Xperia UL"; }
        else if ("SAMSUNG-SM-G920AZ".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-N9150".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-G360BT".equals(model)) { return "Samsung Galaxy Win2"; }
        else if ("SM-N915F".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915G".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915L".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915K".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915T".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915V".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915P".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915S".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915X".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SAF3011".equals(model)) { return "Gigabyte SAF3011"; }
        else if ("SH-M02-EVA20".equals(model)) { return "Sharp AQUOS SH-M02-EVA20"; }
        else if ("SM-G530T1".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SproutChannelCubby".equals(model)) { return "Ematic Sprout Channel Cubby"; }
        else if ("SM-G901F".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G5309W".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G130HN".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("SAMSUNG-SGH-I337".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-T230NU".equals(model)) { return "Samsung Galaxy Tab 4"; }
        else if ("SM-T230NT".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T230NY".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T807V".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T807T".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T807P".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SHW-M110S".equals(model)) { return "Samsung Galaxy S"; }
        else if ("SPH-P500".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("SAMSUNG-EK-GC100".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("SPH-M950".equals(model)) { return "Samsung Galaxy Reverb"; }
        else if ("SPH-M820-BST".equals(model)) { return "Samsung Galaxy Prevail"; }
        else if ("SHW-M290K".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("SHW-M290S".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("SM-G925R4".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925R7".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925R6".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("S01-orange".equals(model)) { return "Fujitsu STYLISTIC S01"; }
        else if ("SGP712".equals(model)) { return "Sony Xperia Z4 tablet"; }
        else if ("SM-G110M".equals(model)) { return "Samsung Galaxy Pocket2"; }
        else if ("SM-G110H".equals(model)) { return "Samsung Galaxy Pocket2"; }
        else if ("SM-G110B".equals(model)) { return "Samsung Galaxy Pocket2"; }
        else if ("SH8118U".equals(model)) { return "Sharp SH8118U"; }
        else if ("SAMSUNG-SGH-I527".equals(model)) { return "Samsung Galaxy Mega"; }
        else if ("ST700".equals(model)) { return "SMARTAB ST700"; }
        else if ("SCH-R820".equals(model)) { return "Samsung Galaxy Admire"; }
        else if ("SCH-R880".equals(model)) { return "Samsung Acclaim"; }
        else if ("SM-T116NY".equals(model)) { return "Samsung Galaxy Tab 3V 7.0"; }
        else if ("SM-T116NU".equals(model)) { return "Samsung Galaxy Tab3V 7.0"; }
        else if ("SCH-I915".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("SM-J500N0".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SP-5100".equals(model)) { return "Haier SP-5100"; }
        else if ("SM-T900X".equals(model)) { return "Samsung Galaxy Tab Pro 12.2"; }
        else if ("SH-05G".equals(model)) { return "Sharp AQUOS PAD SH-05G"; }
        else if ("SH-05F".equals(model)) { return "Sharp Disney Mobile on docomo SH-05F"; }
        else if ("SH-05E".equals(model)) { return "Sharp SH-05E"; }
        else if ("SGH-T839".equals(model)) { return "Samsung Sidekick"; }
        else if ("SCH-i929".equals(model)) { return "Samsung Galaxy S2 Duos"; }
        else if ("SM-G903F".equals(model)) { return "Samsung Galaxy S5 Neo"; }
        else if ("SM-G903M".equals(model)) { return "Samsung Galaxy S5 Neo"; }
        else if ("SM-G903W".equals(model)) { return "Samsung Galaxy S5 Neo"; }
        else if ("SM-T280".equals(model)) { return "Samsung Galaxy Tab E 7.0"; }
        else if ("SM-T285".equals(model)) { return "Samsung Galaxy Tab E 7.0"; }
        else if ("SM-T287".equals(model)) { return "Samsung Galaxy Tab E 7.0"; }
        else if ("SAMSUNG-SM-G530AZ".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SCH-S735C".equals(model)) { return "Samsung Galaxy Discover"; }
        else if ("SAMSUNG-SGH-I317".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("SM-S820L".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-J100MU".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-J100ML".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-G900W8".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SGH-I717R".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SGH-I717D".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SBM104SH".equals(model)) { return "Sharp AQUOS PHONE SoftBank 104SH"; }
        else if ("SGH-I717M".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("st70408_4_coho".equals(model)) { return "Trekstor SurfTab xintron i 7.0"; }
        else if ("SM-N920R7".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920R6".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920R4".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SPH-M930".equals(model)) { return "Samsung Transform Ultra"; }
        else if ("SM-G730V".equals(model)) { return "Samsung Galaxy S III Mini"; }
        else if ("SM-J100VPP".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-T710X".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SAMSUNG-SM-J120A".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-G750H".equals(model)) { return "Samsung Galaxy Mega2"; }
        else if ("SM-G750F".equals(model)) { return "Samsung Galaxy Mega2"; }
        else if ("SCH-I200".equals(model)) { return "Samsung Galaxy Stellar"; }
        else if ("SBM107SH".equals(model)) { return "Sharp PANTONE 5 SoftBank 107SH"; }
        else if ("ST13".equals(model)) { return "Southern Telecom ST13"; }
        else if ("SGP771".equals(model)) { return "Sony Xperia Z4 Tablet"; }
        else if ("SPH-D600".equals(model)) { return "Samsung Conquer 4G"; }
        else if ("SM-G9209".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G9208".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G9200".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-T285M".equals(model)) { return "Samsung Galaxy Tab E 7.0"; }
        else if ("SM-G920X".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920T".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920V".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920P".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920S".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920R".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920L".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SGH-T589".equals(model)) { return "Samsung Galaxy Q"; }
        else if ("SM-G920I".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920K".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-T677V".equals(model)) { return "Samsung Galaxy View"; }
        else if ("SM-G920F".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SPH-M580BST".equals(model)) { return "Samsung Replenish"; }
        else if ("SH-03C".equals(model)) { return "Sharp LYNX 3D SH-03C"; }
        else if ("SM-G9287C".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SH-03F".equals(model)) { return "Sharp SH-03F"; }
        else if ("SH-03H".equals(model)) { return "Sharp SH-03H"; }
        else if ("SAMSUNG-SM-G930AZ".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-J510S".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-J510H".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-J510L".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-T310X".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("SM-J510F".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-J5108".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-G386T1".equals(model)) { return "Samsung Galaxy Avant"; }
        else if ("SM-G7105L".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-G7105H".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("ST26a".equals(model)) { return "Sony Xperia J"; }
        else if ("SBM102SH".equals(model)) { return "Sharp AQUOS PHONE SoftBank 102SH"; }
        else if ("SM-G360FY".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("S450".equals(model)) { return "Positivo S450"; }
        else if ("S455".equals(model)) { return "Positivo Selfie"; }
        else if ("SH80F".equals(model)) { return "Sharp SH80F"; }
        else if ("SM-C115M".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("SM-C115L".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("SM-C115W".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("SM-T550X".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SHW-M486W".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SGH-T399".equals(model)) { return "Samsung Galaxy Light"; }
        else if ("S504".equals(model)) { return "Logicom S504"; }
        else if ("SH940C-LN".equals(model)) { return "LinkNet Smart Box HD"; }
        else if ("SM-G3589W".equals(model)) { return "Samsung Galaxy Core Lite"; }
        else if ("SM-N9000Q".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SM-G3606".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SGH-T889V".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("SM-G3509I".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SBM003SH".equals(model)) { return "Sharp GALAPAGOS SoftBank 003SH"; }
        else if ("SCH-I879E".equals(model)) { return "Samsung Galaxy Grand Neo+"; }
        else if ("SPH-M910".equals(model)) { return "Samsung VinsQ(M910)"; }
        else if ("SPH-L710T".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("S3T10IN3G".equals(model)) { return "Auchan S3T10IN3G"; }
        else if ("SCH-P709".equals(model)) { return "Samsung Galaxy Mega 5.8"; }
        else if ("SM-G360M".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-J111M".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-J111F".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-N7500Q".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SH-01H".equals(model)) { return "Sharp AQUOS ZETA SH-01H"; }
        else if ("SH-01G".equals(model)) { return "Sharp AQUOS ZETA SH-01G"; }
        else if ("SH-01F".equals(model)) { return "Sharp AQUOS PHONE ZETA  SH-01F"; }
        else if ("SH-01E".equals(model)) { return "Sharp AQUOS PHONE si SH-01E"; }
        else if ("SH-01D".equals(model)) { return "Sharp AQUOS PHONE SH-01D"; }
        else if ("SCH-I905".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("SCH-I679".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("SZJ-JS201".equals(model)) { return "Kyocera SZJ201"; }
        else if ("SPH-L300".equals(model)) { return "Samsung Galaxy Victory"; }
        else if ("SHV-E160S".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SHV-E160L".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SHV-E160K".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SAMSUNG-SGH-I467".equals(model)) { return "Samsung Galaxy Note 8"; }
        else if ("S51SE".equals(model)) { return "Sony Ericsson Xperia mini"; }
        else if ("Speedsurfer".equals(model)) { return "Huawei G535-L11"; }
        else if ("SM-G8508S".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-J510UN".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-G9008W".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SGH-N064".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-G313MY".equals(model)) { return "Samsung Galaxy Ace 4"; }
        else if ("STAIRWAY".equals(model)) { return "Enspert STAIRWAY"; }
        else if ("SM-P355C".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-P355Y".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-T337T".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SM-T337V".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SM-G550FY".equals(model)) { return "Samsung Galaxy On5"; }
        else if ("SCH-P729".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("STARXTREM".equals(model)) { return "ZTE STARXTREM"; }
        else if ("SAMSUNG-SGH-I857".equals(model)) { return "Samsung DoubleTime"; }
        else if ("SM-G7108".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-G7109".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-G7102".equals(model)) { return "Samsung Galaxy Grand II"; }
        else if ("SM-G7105".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-G7106".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-G710K".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-G710L".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-G710S".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-T677".equals(model)) { return "Samsung Galaxy View"; }
        else if ("SM-T670".equals(model)) { return "Samsung Galaxy View"; }
        else if ("SGH-T399N".equals(model)) { return "Samsung Galaxy Light"; }
        else if ("SGH-I547C".equals(model)) { return "Samsung Galaxy Rugby"; }
        else if ("SBM200SH".equals(model)) { return "Sharp PANTONE 6 SoftBank 200SH"; }
        else if ("SC-S01".equals(model)) { return "Sharp SC-S01"; }
        else if ("Solarin".equals(model)) { return "Sirin SOLARIN"; }
        else if ("SAMSUNG-SGH-I747Z".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("SH90B".equals(model)) { return "Sharp AQUOS PHONE SH90B"; }
        else if ("SFR-G8800".equals(model)) { return "SFR-G8800"; }
        else if ("STJR76".equals(model)) { return "Smartab STJR76"; }
        else if ("SM-C111M".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("SHW-M485W".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SAMSUNG-SM-J320AZ".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("S4T7IN3G".equals(model)) { return "Auchan S4T7IN3G"; }
        else if ("SBM106SH".equals(model)) { return "Sharp AQUOS PHONE Xx SoftBank 106SH"; }
        else if ("SM-N915W8".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("S4S4IN3G".equals(model)) { return "Auchan S4S4IN3G"; }
        else if ("SBM101SH".equals(model)) { return "Sharp AQUOS PHONE THE HYBRID SoftBank 101SH"; }
        else if ("SM-W2015".equals(model)) { return "Samsung Galaxy Golden 2"; }
        else if ("SM-W2014".equals(model)) { return "Samsung Montblanc"; }
        else if ("SM-W2016".equals(model)) { return "Samsung W2016"; }
        else if ("SM-T330".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SM-T331".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SCL-TL00".equals(model)) { return "Huawei Honor 4A"; }
        else if ("SO-03G".equals(model)) { return "Sony Xperia Z4"; }
        else if ("SM-T237V".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T237P".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SHV-E310L".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SHV-E310K".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SHV-E310S".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SCH-N719".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("SM-T335K".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SM-T335L".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("Si01BE".equals(model)) { return "SiAL Si01BE"; }
        else if ("Si01BB".equals(model)) { return "SiAL Bic camera"; }
        else if ("SAMSUNG-SM-G935A".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SCL-L01".equals(model)) { return "Huawei Y6"; }
        else if ("SCH-L710".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("S4S6IN3G".equals(model)) { return "Auchan S4S6IN3G"; }
        else if ("SH-M01".equals(model)) { return "Sharp AQUOS SH-M01"; }
        else if ("SH-M02".equals(model)) { return "Sharp AQUOS SH-M02"; }
        else if ("SM-J500FN".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SM-N910X".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SAMSUNG-SM-G890A".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SCH-i589".equals(model)) { return "Samsung Galaxy Ace Duos"; }
        else if ("SBM007SHK".equals(model)) { return "Sharp SoftBank 007SH KT"; }
        else if ("SBM007SHJ".equals(model)) { return "Sharp AQUOS PHONE THE HYBRID SoftBank 007SH J"; }
        else if ("SELFY".equals(model)) { return "Wiko SELFY"; }
        else if ("SM-G870F".equals(model)) { return "Samsung Galaxy S5 Active"; }
        else if ("SM-T520CC".equals(model)) { return "Samsung Galaxy Tab Pro 10.1 Chef Collection"; }
        else if ("SM-G360HU".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-J320N0".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-N750".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("S3T7IN".equals(model)) { return "Auchan S3T7IN"; }
        else if ("SO-05D".equals(model)) { return "Sony Ericsson Xperia SX"; }
        else if ("SM-A500Y".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500X".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500S".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-G3556D".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SM-A500H".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500K".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500M".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500L".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("Smartphone_Android_by_SFR_STARADDICT_II".equals(model)) { return "TCT (Alcatel) Smartphone Android by SFR STARADDICT II"; }
        else if ("SM-A500G".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-T217S".equals(model)) { return "Samsung Galaxy Tab 3 7.0"; }
        else if ("SM-T217T".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SM-T315".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("SM-T312".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("SM-T310".equals(model)) { return "Samsung Galaxy Tab 3 8.0"; }
        else if ("SM-T311".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("S6Plus".equals(model)) { return "Claresta S6Plus"; }
        else if ("SM-A5009".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A5000".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A9000".equals(model)) { return "Samsung Galaxy-A9(2016)"; }
        else if ("SM-G870W".equals(model)) { return "Samsung Galaxy S5 Active"; }
        else if ("SAMSUNG-SM-T677A".equals(model)) { return "Samsung Galaxy View"; }
        else if ("SM-A310N0".equals(model)) { return "Samsung Galaxy A3(2016)"; }
        else if ("SM-T235Y".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-N7505".equals(model)) { return "Samsung Galaxy Note 3 Neo"; }
        else if ("SM-N7507".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SM-N7502".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("Status".equals(model)) { return "AG Mobile Status"; }
        else if ("SBM005SH".equals(model)) { return "Sharp GALAPAGOS SoftBank 005SH"; }
        else if ("SM-E700H".equals(model)) { return "Samsung Galaxy E7"; }
        else if ("SM-T815N0".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-N750L".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SM-P607T".equals(model)) { return "Samsung Galaxy Note 10.1 2014 Edition"; }
        else if ("SM-N750K".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SM-N750S".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SP355AWG".equals(model)) { return "BYD SP355AWG"; }
        else if ("S201".equals(model)) { return "SK Telesys K2401"; }
        else if ("SM-N900T".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SBM006SH".equals(model)) { return "Sharp AQUOS PHONE SoftBank 006SH"; }
        else if ("SM-G9287".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G9280".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-N900W8".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-G928G".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928F".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928C".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928L".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928I".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928K".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928T".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-T537V".equals(model)) { return "Samsung Galaxy Tab4 10.0"; }
        else if ("SM-G928P".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SAMSUNG-SM-G900AZ".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G928X".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SGH-S959G".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SCH-S950C".equals(model)) { return "Samsung Galaxy S"; }
        else if ("SM-G600FY".equals(model)) { return "Samsung Galaxy On7"; }
        else if ("SM-G313M".equals(model)) { return "Samsung Galaxy Ace 4"; }
        else if ("SM-G313H".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SM-G313F".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SM-J320P".equals(model)) { return "Samsung Galaxy J3"; }
        else if ("SHW-M585D".equals(model)) { return "Samsung Galaxy Core Safe"; }
        else if ("SM-J320Y".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SAMSUNG-SM-N910A".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-J320F".equals(model)) { return "Samsung Galaxy J3"; }
        else if ("SM-J320G".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-J320H".equals(model)) { return "Samsung Galaxy J3"; }
        else if ("SCH-I619".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("SM-J320M".equals(model)) { return "Samsung Galaxy J3"; }
        else if ("STB7012".equals(model)) { return "Avoca STB7012"; }
        else if ("STB7013".equals(model)) { return "Avoca STB7013"; }
        else if ("S8-303L".equals(model)) { return "HUAWEI MediaPad M1 8.0"; }
        else if ("SM-A800YZ".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SGH-T999V".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SGH-T999L".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SGH-T999N".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-A500XZ".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-S920L".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SAMSUNG-SGH-I407".equals(model)) { return "Samsung Galaxy Amp"; }
        else if ("SPH-L720T".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SHW-M340L".equals(model)) { return "Samsung Galaxy M Style"; }
        else if ("SM-T211M".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SM-S906L".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SJ1-5".equals(model)) { return "Obi OBJ SJ1.5"; }
        else if ("SCH-I400".equals(model)) { return "Samsung Galaxy S Continuum"; }
        else if ("SCH-I405".equals(model)) { return "Samsung Stratosphere"; }
        else if ("SOT31".equals(model)) { return "Sony Xperia Z4 Tablet"; }
        else if ("SM-P605V".equals(model)) { return "Samsung Galaxy Note 10.1 2014 Edition"; }
        else if ("SM-P605S".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-P605L".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-P605M".equals(model)) { return "Samsung Galaxy Note 10.1 2014 Edition"; }
        else if ("SM-P605K".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-G5108Q".equals(model)) { return "Samsung Galaxy Core Max Duos"; }
        else if ("st70408_4".equals(model)) { return "Trekstor SurfTab xintron i 7.0"; }
        else if ("ST7/ST7x".equals(model)) { return "Southern Telecom Smartab ST7"; }
        else if ("SM-G720AX".equals(model)) { return "Samsung Galaxy Grand Max"; }
        else if ("SM-A5100X".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-G730W8".equals(model)) { return "Samsung Galaxy S3 Mini"; }
        else if ("SAMSUNG-SGH-I747".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SMART63".equals(model)) { return "Binatone Smart 63"; }
        else if ("SMART66".equals(model)) { return "Binatone Smart 66"; }
        else if ("SHW-M100S".equals(model)) { return "Samsung Galaxy A"; }
        else if ("SPH-P600".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("STB8098".equals(model)) { return "Avoca STB8098"; }
        else if ("SAMSUNG-SM-G928A".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-A510S".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SGH-I748".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-G313ML".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SM-G313MU".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SM-G530BT".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SKT01".equals(model)) { return "Kyocera TORQUE"; }
        else if ("SAMSUNG-SM-G870A".equals(model)) { return "Samsung Galaxy S5 Active"; }
        else if ("SH-10D".equals(model)) { return "Sharp AQUOS PHONE sv SH-10D"; }
        else if ("SH-10B".equals(model)) { return "Sharp LYNX SH-10B"; }
        else if ("SM-G389F".equals(model)) { return "Samsung Galaxy Xcover3"; }
        else if ("S5.1".equals(model)) { return "Gionee S5.1"; }
        else if ("S5.5".equals(model)) { return "Gionee S5.5"; }
        else if ("SM-P355M".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-T350".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-T355".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SpeedTAB".equals(model)) { return "HUAWEI MediaPad 10 Link+"; }
        else if ("SM-T239M".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T239C".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SAMSUNG-SM-G750A".equals(model)) { return "Samsung Galaxy Mega2"; }
        else if ("SM-T2397".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-G316ML".equals(model)) { return "Samsung Galaxy Ace4 Neo"; }
        else if ("SM-G316MY".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SM-G316H".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SPH-D710".equals(model)) { return "Samsung Epic"; }
        else if ("SCT21".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-G935K".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935L".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935F".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935X".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935S".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935V".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935T".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SCH-R950".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("SCL-AL00".equals(model)) { return "Huawei Honor 4A"; }
        else if ("SM-G9350".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G900FG".equals(model)) { return "Samsung Galaxy S5 Google Play Edition"; }
        else if ("SM-G900FD".equals(model)) { return "Samsung Galaxy S5 Dual SIM"; }
        else if ("SM-G900FQ".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SH631W".equals(model)) { return "Foxconn SHARP SH631W"; }
        else if ("SM-G360R6".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("S7842".equals(model)) { return "Logicom S7842"; }
        else if ("SGH-I497".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("ST950I-LN".equals(model)) { return "LinkNet ST950I-LN"; }
        else if ("Siru".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("SM-J200H".equals(model)) { return "Samsung Galaxy J2"; }
        else if ("SM-J200M".equals(model)) { return "Samsung Galaxy J2"; }
        else if ("SM-J200G".equals(model)) { return "Samsung Galaxy J2"; }
        else if ("SM-J200F".equals(model)) { return "Samsung Galaxy J2"; }
        else if ("SM-J200Y".equals(model)) { return "Samsung Galaxy J2"; }
        else if ("SH-12C".equals(model)) { return "Sharp AQUOS PHONE SH-12C"; }
        else if ("S4S5IN3G".equals(model)) { return "Auchan S4S5IN3G"; }
        else if ("SM-T807R4".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SHW-M580D".equals(model)) { return "Samsung Galaxy Core Safe"; }
        else if ("SGP412".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("SPH-D700".equals(model)) { return "Samsung Epic 4G"; }
        else if ("SM-T110".equals(model)) { return "Samsung Galaxy Tab3 Lite"; }
        else if ("SM-T111".equals(model)) { return "Samsung Galaxy Tab3 Lite"; }
        else if ("SM-T113".equals(model)) { return "Samsung Galaxy Tab3 Lite 7.0"; }
        else if ("SM-T116".equals(model)) { return "Samsung Galaxy Tab3 VE 7.0"; }
        else if ("SGH-T589R".equals(model)) { return "Samsung Galaxy Q"; }
        else if ("SGH-T589W".equals(model)) { return "Samsung Galaxy Q"; }
        else if ("SMT-i9100".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SM-G910S".equals(model)) { return "Samsung Galaxy Round"; }
        else if ("SHW-M190S".equals(model)) { return "Samsung Galaxy S"; }
        else if ("SGH-S970G".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-G850Y".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850X".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850S".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850W".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850K".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850M".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850L".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850F".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SGH-T989D".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("SM-G350E".equals(model)) { return "Samsung Galaxy Star2 Plus"; }
        else if ("SM-G350M".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SM-G930T1".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SPH-M840".equals(model)) { return "Samsung Galaxy Prevail 2"; }
        else if ("S8-303LT".equals(model)) { return "HUAWEI MediaPad M1 8.0"; }
        else if ("SM-G3502".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SGH-I537".equals(model)) { return "Samsung Galaxy S4 Active"; }
        else if ("SM-G3508".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SM-G3509".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SM-T2519".equals(model)) { return "Samsung Galaxy Tab Q"; }
        else if ("SM-N915FY".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SHV-E270L".equals(model)) { return "Samsung Baffin"; }
        else if ("SM-G318H".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SK17a".equals(model)) { return "Sony Ericsson Xperia mini pro"; }
        else if ("SK17i".equals(model)) { return "Sony Ericsson Xperia mini pro"; }
        else if ("SGH-I957M".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SGH-I957R".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SCH-I110".equals(model)) { return "Samsung Illusion"; }
        else if ("SBM203SH".equals(model)) { return "Sharp SoftBank AQUOS PHONE Xx 203SH"; }
        else if ("SGP351".equals(model)) { return "Sony Xperia Tablet Z"; }
        else if ("SM-G318MZ".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SM-G318ML".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SAMSUNG-SM-C105A".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-G5108".equals(model)) { return "Samsung Galaxy Core Max"; }
        else if ("SAMSUNG-SGH-I257".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SM-G350L".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SHV-E500S".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("SCH-R970".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-T705".equals(model)) { return "Samsung Galaxy TabS 8.4"; }
        else if ("SM-T700".equals(model)) { return "Samsung Galaxy Tab S"; }
        else if ("SCH-i509".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("SGH-I717".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SGH-T699".equals(model)) { return "Samsung Galaxy S Relay"; }
        else if ("SM-T325".equals(model)) { return "Samsung Galaxy Tab Pro 8.4"; }
        else if ("SGH-I467M".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("SM-G530FZ".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-A710X".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-A710Y".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-A710S".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-N9200".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-A710K".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-J320FN".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-A710L".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-A710M".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-A710F".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-A7108".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-N920C".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920F".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920G".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920I".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-A7100".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-N920K".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920L".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920P".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920S".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920T".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920V".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SCH-I589".equals(model)) { return "Samsung Galaxy Ace Duos"; }
        else if ("SM-A500YZ".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-T111M".equals(model)) { return "Samsung Galaxy Tab3 Lite"; }
        else if ("S30".equals(model)) { return "Cat S30"; }
        else if ("SM-T810X".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-P600".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("Smart_TAB_1003s".equals(model)) { return "Sourcing Creation ST1003S"; }
        else if ("SGH-T759".equals(model)) { return "Samsung Exhibit"; }
        else if ("SGH-N075T".equals(model)) { return "Samsung Galaxy J"; }
        else if ("S7-721u".equals(model)) { return "HUAWEI MediaPad 7 Youth2"; }
        else if ("SAMSUNG-SM-G730A".equals(model)) { return "Samsung Galaxy S3 Mini"; }
        else if ("SM-G710".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-J105F".equals(model)) { return "Samsung Galaxy J1 Mini"; }
        else if ("SHW-M440S".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SCH-R760X".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SLIDE2".equals(model)) { return "Wiko PULP FAB"; }
        else if ("SL930".equals(model)) { return "Gigaset SL930"; }
        else if ("SM-G930VL".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G800HQ".equals(model)) { return "Samsung Galaxy S5 mini"; }
        else if ("SM-G6000".equals(model)) { return "Samsung Galaxy On7"; }
        else if ("SZJ-JS101".equals(model)) { return "Fujitsu SZJ-JS101"; }
        else if ("SGP621".equals(model)) { return "Sony Xperia Z3 Tablet Compact"; }
        else if ("SHV-E170L".equals(model)) { return "Samsung Galaxy R-Style"; }
        else if ("SHV-E170K".equals(model)) { return "Samsung Galaxy R-Style"; }
        else if ("SHV-E170S".equals(model)) { return "Samsung Galaxy R-Style"; }
        else if ("SHV-E370K".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SHV-E370D".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SCH-R915".equals(model)) { return "Samsung Galaxy Indulge"; }
        else if ("ST21i2".equals(model)) { return "Sony Ericsson Xperia tipo dual"; }
        else if ("SCH-R910".equals(model)) { return "Samsung Galaxy Indulge"; }
        else if ("SAMSUNG-SM-J320A".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SOSMART_T5".equals(model)) { return "SOSMART T5"; }
        else if ("STR-9.6-Tablet".equals(model)) { return "MachSpeed STR-9.6-Tablet"; }
        else if ("SGH-I727".equals(model)) { return "Samsung Galaxy S2 Skyrocket"; }
        else if ("SM-G920W8".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SC-02E".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("SC-02D".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("SC-02G".equals(model)) { return "Samsung SC-02G"; }
        else if ("SC-02F".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SC-02C".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SC-02B".equals(model)) { return "Samsung Galaxy S"; }
        else if ("SCH-I879".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("SCH-I705".equals(model)) { return "Samsung Galaxy Tab2 7.0"; }
        else if ("S57".equals(model)) { return "Acer Liquid Jade Z"; }
        else if ("S56".equals(model)) { return "Acer Liquid Jade S"; }
        else if ("S55".equals(model)) { return "Acer Liquid Jade"; }
        else if ("S53".equals(model)) { return "Acer Liquid X1"; }
        else if ("S50".equals(model)) { return "Cat S50"; }
        else if ("S59".equals(model)) { return "Acer Liquid X2"; }
        else if ("SGH-T779".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("SM-G531Y".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G531F".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G531H".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-A700FD".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SM-G531M".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SUNSET".equals(model)) { return "Wiko SUNSET"; }
        else if ("SM-T707V".equals(model)) { return "Samsung Galaxy Tab S 8.4"; }
        else if ("SM-T255S".equals(model)) { return "Samsung Galaxy W"; }
        else if ("SMT-E5015".equals(model)) { return "Samsung olleh"; }
        else if ("SM-T320X".equals(model)) { return "Samsung Galaxy Tab Pro 8.4"; }
        else if ("S732".equals(model)) { return "Logicom S732"; }
        else if ("SM-E500YZ".equals(model)) { return "Samsung Galaxy E5"; }
        else if ("SHV-E500L".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("SCH-R830C".equals(model)) { return "Samsung Galaxy Admire 2"; }
        else if ("SM-J320YZ".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-G935R4".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SAMSUNG-SM-G800A".equals(model)) { return "Samsung Galaxy S5 mini"; }
        else if ("SGP641".equals(model)) { return "Sony Xperia Z3 Tablet Compact"; }
        else if ("SGP311".equals(model)) { return "Sony Ericsson Xperia Tablet Z"; }
        else if ("SGP312".equals(model)) { return "Sony Xperia Tablet Z"; }
        else if ("SAMSUNG-SGH-I927".equals(model)) { return "Samsung Captivate Glide"; }
        else if ("SM-J3109".equals(model)) { return "Samsung Galaxy J3"; }
        else if ("Style".equals(model)) { return "Explay Style"; }
        else if ("SGH-I527M".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SCH-R930".equals(model)) { return "Samsung Galaxy S Aviator"; }
        else if ("SM-J100Y".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-J100F".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-J100G".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-T212".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SM-T211".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SM-J100M".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-T215".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SGH-N045".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SCH-S968C".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SGH-I896".equals(model)) { return "Samsung Galaxy S Captivate"; }
        else if ("SAMSUNG-SM-G920A".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SHW-M570S".equals(model)) { return "Samsung Galaxy Core Advance"; }
        else if ("SM-P905F0".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-G360T1".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("S380".equals(model)) { return "Positivo S380"; }
        else if ("SCH-I815".equals(model)) { return "Samsung Galaxy Tab 7.7"; }
        else if ("SCH-R730".equals(model)) { return "Samsung Transfix"; }
        else if ("SHV-E275K".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("SH-01FDQ".equals(model)) { return "Sharp SH-01F DRAGON QUEST"; }
        else if ("ST17i".equals(model)) { return "Sony Ericsson Xperia active"; }
        else if ("S3015".equals(model)) { return "Entel S3015"; }
        else if ("SM-G3812".equals(model)) { return "Samsung Galaxy Win Pro"; }
        else if ("SM-G3815".equals(model)) { return "Samsung Galaxy Express II"; }
        else if ("SM-G3818".equals(model)) { return "Samsung Galaxy Win Pro"; }
        else if ("SM-G3819".equals(model)) { return "Samsung Galaxy Win Pro"; }
        else if ("SGH-I827D".equals(model)) { return "Samsung Galaxy Ace Q"; }
        else if ("SCV31".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SCV32".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SCH-I545PP".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SAMSUNG-SM-N920A".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-G3819D".equals(model)) { return "Samsung Galaxy Win Pro"; }
        else if ("SM-J500G".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SM-T536".equals(model)) { return "Samsung Galaxy Tab4 10.1"; }
        else if ("SM-J500H".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SM-T535".equals(model)) { return "Samsung Galaxy Tab4 10.0"; }
        else if ("SM-T533".equals(model)) { return "Samsung Galaxy Tab4 10.1"; }
        else if ("SM-T530".equals(model)) { return "Samsung Galaxy Tab4 10.1"; }
        else if ("SM-T531".equals(model)) { return "Samsung Galaxy Tab4 10.0"; }
        else if ("SM-J500Y".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SCH-R890".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SAMSUNG-SGH-I717".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SCH-R530C".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-N9106W".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-J5007".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SM-J5008".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SM-C105L".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-C105K".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-C105S".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-T705M".equals(model)) { return "Samsung Galaxy TabS 8.4"; }
        else if ("SM-G930R7".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930R6".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SO-05F".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SO-05G".equals(model)) { return "Sony Xperia Z4 Tablet"; }
        else if ("SM-T705C".equals(model)) { return "Samsung Galaxy Tab S 8.4"; }
        else if ("SM-T705Y".equals(model)) { return "Samsung Galaxy Tab S 8.4"; }
        else if ("SM-T705W".equals(model)) { return "Samsung Galaxy TabS 8.4"; }
        else if ("SM-J200BT".equals(model)) { return "Samsung Galaxy J2"; }
        else if ("SOV31".equals(model)) { return "Sony Xperia Z4"; }
        else if ("SOV32".equals(model)) { return "Sony Xperia Z5"; }
        else if ("SH-06DNERV".equals(model)) { return "Sharp SH-06D NERV"; }
        else if ("SM-T715N0".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SCH-R970X".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SGH-S730M".equals(model)) { return "Samsung Amazing"; }
        else if ("ST18a".equals(model)) { return "Sony Ericsson Xperia ray"; }
        else if ("SB506".equals(model)) { return "Gigabyte SB506"; }
        else if ("SM-T365F0".equals(model)) { return "Samsung Galaxy Tab4 Active"; }
        else if ("SM-G355HQ".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SHW-M305W".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SM-G355HN".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SAMSUNG-SM-G360AZ".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-T235".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T231".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T230".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T232".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T239".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T116BU".equals(model)) { return "Samsung Galaxy Tab Plus 7.0"; }
        else if ("SM-G800F".equals(model)) { return "Samsung Galaxy S5 Mini"; }
        else if ("SM-G800M".equals(model)) { return "Samsung Galaxy S5 mini"; }
        else if ("SM-G800H".equals(model)) { return "Samsung Galaxy S5 Mini"; }
        else if ("SM-G800X".equals(model)) { return "Samsung Galaxy S5 mini"; }
        else if ("SM-G800Y".equals(model)) { return "Samsung Galaxy S5 mini LTE"; }
        else if ("SM-T335".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SGH-T989".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("SC-06D".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("ST940I-UP".equals(model)) { return "LGU+ ST940I-UP"; }
        else if ("SM-T350X".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("S500".equals(model)) { return "Acer CloudMobile S500"; }
        else if ("SM-G3609".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-G3608".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("Smart501".equals(model)) { return "FarEasTone Smart501"; }
        else if ("Smart503".equals(model)) { return "Infocus Smart503"; }
        else if ("SM-N9208".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("S50c".equals(model)) { return "CatS50c"; }
        else if ("SM-G360H".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-S766C".equals(model)) { return "Samsung Galaxy Ace Style"; }
        else if ("SM-G360F".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-G360P".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-G360V".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-G360T".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SGH-M919V".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SGH-M919N".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-A300FU".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("ST15a".equals(model)) { return "Sony Ericsson Xperia mini"; }
        else if ("ST15i".equals(model)) { return "Sony Ericsson Xperia mini"; }
        else if ("SCC-U21".equals(model)) { return "Huawei Y6"; }
        else if ("SM-T550".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-T555".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-N920X".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SAMSUNG-SGH-I777".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("SM55".equals(model)) { return "Cellon SM55"; }
        else if ("StrikaPlay".equals(model)) { return "Boost StrikaPlay"; }
        else if ("SAMSUNG-SM-N900A".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SO-03H".equals(model)) { return "Sony Xperia Z5 Premium"; }
        else if ("SO-03C".equals(model)) { return "Sony Ericsson Xperia ray"; }
        else if ("SO-03F".equals(model)) { return "Sony Xperia Z2"; }
        else if ("SO-03D".equals(model)) { return "Sony Xperia acro HD"; }
        else if ("SO-03E".equals(model)) { return "Sony Ericsson Xperia Tablet Z"; }
        else if ("SH-08E".equals(model)) { return "Sharp AQUOS PAD SH-08E"; }
        else if ("SGH-T849".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SM-T555C".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-N910K".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N910H".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N910L".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N910C".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-N910G".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-N910F".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-N910S".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N910P".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-N910V".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-N910U".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N910T".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-A300YZ".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SHV-E230K".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SHV-E230L".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SHV-E230S".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-N9100".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("Spice_MI700".equals(model)) { return "Foxconn CSL Spice MI700"; }
        else if ("SCH-S738C".equals(model)) { return "Samsung Galaxy Centura"; }
        else if ("SM-G310R5".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("STB9097".equals(model)) { return "Avoca STB9097"; }
        else if ("SAMSUNG-SM-T807A".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SCH-R760".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SM-T715Y".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SGH-I317M".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("SM-T715C".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SC-04G".equals(model)) { return "Samsung SC-04G"; }
        else if ("SC-04F".equals(model)) { return "Samsung SC-04F"; }
        else if ("SC-04E".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-T815".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SM-T817".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-T810".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-T813".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-T819".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-A300H".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SCH-I509".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("SCH-I500".equals(model)) { return "Samsung Fascinate"; }
        else if ("SM-G925W8".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SmartTab7".equals(model)) { return "ZTE SmartTab7"; }
        else if ("SH8188U".equals(model)) { return "Sharp SH8188U"; }
        else if ("Smart402".equals(model)) { return "BYD Smart 402"; }
        else if ("S520".equals(model)) { return "Acer Liquid S2"; }
        else if ("SH837W".equals(model)) { return "Foxconn SHARP SH837W"; }
        else if ("SM-A500F1".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SGP521".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SM-A500FU".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SAMSUNG-SGH-I577".equals(model)) { return "Samsung Galaxy Exhilarate"; }
        else if ("SM-G925L".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925K".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925I".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925F".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925A".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925X".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925V".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925T".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925R".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925S".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925P".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SHW-M130K".equals(model)) { return "Samsung Galaxy K"; }
        else if ("SHW-M130L".equals(model)) { return "Samsung Galaxy U"; }
        else if ("SM-G3139D".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SCH-i705".equals(model)) { return "Samsung Galaxy Tab2 7.0"; }
        else if ("starTIM1".equals(model)) { return "Cellon starTIM1"; }
        else if ("SM-P905".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-P901".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-P900".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-T330NU".equals(model)) { return "Samsung Galaxy Tab 4 8.0"; }
        else if ("SO-01D".equals(model)) { return "Sony Ericsson Xperia PLAY"; }
        else if ("SO-01E".equals(model)) { return "Sony Ericsson Xperia AX"; }
        else if ("SO-01F".equals(model)) { return "Sony Xperia Z1"; }
        else if ("SO-01G".equals(model)) { return "Sony Xperia Z3"; }
        else if ("SO-01B".equals(model)) { return "Sony Ericsson Xperia X10"; }
        else if ("SO-01C".equals(model)) { return "Sony Ericsson Xperia Arc"; }
        else if ("SH-06F".equals(model)) { return "Sharp AQUOS PAD SH-06F"; }
        else if ("SH-06D".equals(model)) { return "Sharp AQUOS PHONE SH-06D"; }
        else if ("SH-06E".equals(model)) { return "Sharp AQUOS PHONE ZETA SH-06E"; }
        else if ("SO-01H".equals(model)) { return "Sony Xperia Z5"; }
        else if ("SGH-T869".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("SM-S978L".equals(model)) { return "Samsung Galaxy E5"; }
        else if ("SGH-T599V".equals(model)) { return "Samsung Galaxy Exhibit"; }
        else if ("SGH-T599N".equals(model)) { return "Samsung Galaxy Exhibit"; }
        else if ("SHP-SH630E".equals(model)) { return "Foxconn SHARP SH630E"; }
        else if ("SM-G906K".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G906L".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("ST21a2".equals(model)) { return "Sony Xperia tipo dual"; }
        else if ("SM-G906S".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G5308W".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SGH-T679".equals(model)) { return "Samsung Exhibit II"; }
        else if ("SH825Wi".equals(model)) { return "Sharp SH825wi"; }
        else if ("SGH-T499".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("SCH-W789".equals(model)) { return "Samsung Hennessy"; }
        return "";

    }
    public static String rMethod (String model) {
        if ("R827T".equals(model)) { return "OPPO R827T"; }
        else if ("RubikII7".equals(model)) { return "Plaisio Rubik-II"; }
        else if ("Rise".equals(model)) { return "Kyocera Rise"; }
        else if ("R833T".equals(model)) { return "Oppo R833T"; }
        else if ("RCT6293W23".equals(model)) { return "RCA RCT6293W23"; }
        else if ("R815T".equals(model)) { return "Oppo R815T"; }
        else if ("R815W".equals(model)) { return "Oppo R815W"; }
        else if ("R7Plus".equals(model)) { return "Oppo R7 Plus"; }
        else if ("R831K".equals(model)) { return "Oppo R831K"; }
        else if ("R831L".equals(model)) { return "OPPO R831L"; }
        else if ("R831S".equals(model)) { return "OPPO R831S"; }
        else if ("R819T".equals(model)) { return "Oppo R819T"; }
        else if ("RCT6573W23".equals(model)) { return "RCA RCT6573W23"; }
        else if ("R45".equals(model)) { return "Revtel R45"; }
        else if ("R831".equals(model)) { return "Oppo R831"; }
        else if ("R830".equals(model)) { return "OPPO R830"; }
        else if ("RCT6672W23".equals(model)) { return "RCA RCT6672W23"; }
        else if ("R815".equals(model)) { return "Oppo R815"; }
        else if ("R819".equals(model)) { return "Oppo R819"; }
        else if ("RCT6773W22".equals(model)) { return "RCA RCT6773W22"; }
        else if ("R809T".equals(model)) { return "Oppo R809T"; }
        else if ("R7kt".equals(model)) { return "Oppo R7kt"; }
        else if ("R7kf".equals(model)) { return "Oppo R7kf"; }
        else if ("R7kc".equals(model)) { return "Oppo R7kc"; }
        else if ("R850".equals(model)) { return "OPPO R850"; }
        else if ("R7Plusm".equals(model)) { return "Oppo R7 Plusm"; }
        else if ("Revue".equals(model)) { return "Logitech Revue"; }
        else if ("RM02".equals(model)) { return "Fujitsu RM02"; }
        else if ("R7".equals(model)) { return "Oppo R7"; }
        else if ("R1".equals(model)) { return "PIONEER R1"; }
        else if ("RCT6078W2".equals(model)) { return "Anydata RCA RCT6078W2"; }
        else if ("R7st".equals(model)) { return "Oppo R7st"; }
        else if ("R7sf".equals(model)) { return "Oppo R7sfg"; }
        else if ("R7sm".equals(model)) { return "Oppo R7sm"; }
        else if ("R8205".equals(model)) { return "Oppo R8205"; }
        else if ("R8207".equals(model)) { return "Oppo R8207"; }
        else if ("R8206".equals(model)) { return "Oppo R8206"; }
        else if ("R8201".equals(model)) { return "Oppo R8201"; }
        else if ("R8200".equals(model)) { return "Oppo R8200"; }
        else if ("RCT6273W26".equals(model)) { return "RCA RCT6273W26"; }
        else if ("Retro".equals(model)) { return "mobicel Retro"; }
        else if ("R1001".equals(model)) { return "Oppo R1001"; }
        else if ("RW107".equals(model)) { return "Sharp RW107"; }
        else if ("Rage".equals(model)) { return "AG Mobile Rage"; }
        else if ("R7plusf".equals(model)) { return "Oppo R7 Plusf"; }
        else if ("RCT6773W22B".equals(model)) { return "RCA 7 Voyager II"; }
        else if ("R2010".equals(model)) { return "OPPO R2010"; }
        else if ("R2017".equals(model)) { return "OPPO R2017"; }
        else if ("RioPlay".equals(model)) { return "Explay Rio Play"; }
        else if ("ROBBY".equals(model)) { return "Wiko ROBBY"; }
        else if ("RCT6303W87DK".equals(model)) { return "RCA 10 Viking Pro"; }
        else if ("R200".equals(model)) { return "Toughshield R200"; }
        else if ("RSEIII".equals(model)) { return "Audi AG RSE-III"; }
        else if ("RIO-L03".equals(model)) { return "HUAWEI G8"; }
        else if ("R8106".equals(model)) { return "Oppo R8106"; }
        else if ("R8107".equals(model)) { return "Oppo R5"; }
        else if ("R8109".equals(model)) { return "Oppo R5"; }
        else if ("RCT6773W42B".equals(model)) { return "RCA RCT6773W42B"; }
        else if ("R831T".equals(model)) { return "Oppo R831"; }
        else if ("R7Plust".equals(model)) { return "Oppo R7Plust"; }
        else if ("RCT6203W46L".equals(model)) { return "RCA Pro10 Edition II"; }
        else if ("R830S".equals(model)) { return "OPPO R830S"; }
        else if ("R823T".equals(model)) { return "Oppo R823T"; }
        else if ("RCT6002W46".equals(model)) { return "RCA RCT6002W46"; }
        else if ("R829".equals(model)) { return "OPPO R829"; }
        else if ("R820".equals(model)) { return "Oppo R820"; }
        else if ("R821".equals(model)) { return "Oppo R821"; }
        else if ("R7c".equals(model)) { return "Oppo R7c"; }
        else if ("R7f".equals(model)) { return "Oppo R7f"; }
        else if ("R7g".equals(model)) { return "Oppo R7g"; }
        else if ("R7s".equals(model)) { return "Oppo R7s"; }
        else if ("RCT6272W23".equals(model)) { return "RCA RCT6272W23"; }
        else if ("R6007".equals(model)) { return "OPPO R6007"; }
        else if ("R6006".equals(model)) { return "Oppo R6006"; }
        else if ("ref_SCTF".equals(model)) { return "LGE Smart Dios V8700"; }
        else if ("Racer".equals(model)) { return "ZTE Racer"; }
        else if ("Robin".equals(model)) { return "Nextbit Robin"; }
        else if ("RTC-tablet".equals(model)) { return "Asus RTC-700A"; }
        else if ("RCS13101T".equals(model)) { return "RCA RCS13101T"; }
        else if ("R7007".equals(model)) { return "OPPO R7007"; }
        else if ("R7005".equals(model)) { return "Oppo R7005"; }
        else if ("R829T".equals(model)) { return "OPPO R829T"; }
        else if ("RCT6077W2".equals(model)) { return "RCA RCT6077W2"; }
        else if ("RCT6691W3".equals(model)) { return "RCA RCT6691W3"; }
        else if ("RCT6673W-V1".equals(model)) { return "RCA RCT6673W-V1"; }
        else if ("R370L".equals(model)) { return "Orbic R370H"; }
        else if ("RS988".equals(model)) { return "LGE LG G5"; }
        else if ("R827".equals(model)) { return "Oppo R827"; }
        else if ("R7t".equals(model)) { return "Oppo R7t"; }
        else if ("RAINBOW".equals(model)) { return "Wiko RAINBOW"; }
        else if ("R8007".equals(model)) { return "OPPO R8007"; }
        else if ("R8006".equals(model)) { return "OPPO R8006"; }
        else if ("R8001".equals(model)) { return "OPPO R8001"; }
        else if ("R8000".equals(model)) { return "Oppo R8000"; }
        else if ("R800x".equals(model)) { return "Sony Ericsson Xperia PLAY"; }
        else if ("R800i".equals(model)) { return "Sony Ericsson Xperia Play"; }
        else if ("R800a".equals(model)) { return "Sony Ericsson Xperia PLAY"; }
        else if ("RCT6103W46".equals(model)) { return "RCA RCT6103W46"; }
        else if ("R1011".equals(model)) { return "Oppo R1011w"; }
        else if ("R800at".equals(model)) { return "Sony Ericsson Xperia PLAY"; }
        else if ("R821T".equals(model)) { return "Oppo R821T"; }
        else if ("R2001".equals(model)) { return "OPPO R2001"; }
        else if ("RCT6213W87DK".equals(model)) { return "RCA 11 Maven Pro"; }
        else if ("RCT6077W22".equals(model)) { return "RCA RCT6077W22"; }
        else if ("RCT6378W2".equals(model)) { return "RCA RCT6378W2"; }
        else if ("Roar_A50".equals(model)) { return "Symphony Roar A50"; }
        else if ("RCT6203W46".equals(model)) { return "RCA RCT6203W46"; }
        return "";

    }
    public static String uMethod (String model) {
        if ("umts".equals(model)) { return "Motorola Droid"; }
        else if ("U708".equals(model)) { return "OPPO U708"; }
        else if ("U707".equals(model)) { return "Oppo U707"; }
        else if ("U9180".equals(model)) { return "ZTE U9180"; }
        else if ("USCCADR3305".equals(model)) { return "Huawei M865"; }
        else if ("UTA200".equals(model)) { return "SK Telesys UTA200"; }
        else if ("UVP".equals(model)) { return "Ubiquiti UVP"; }
        else if ("U972".equals(model)) { return "Hisense u972"; }
        else if ("U970".equals(model)) { return "Hisense U970"; }
        else if ("U8652".equals(model)) { return "Huawei U8652"; }
        else if ("U705W".equals(model)) { return "Oppo Ulike2"; }
        else if ("U705T".equals(model)) { return "OPPO Ulike2"; }
        else if ("U707T".equals(model)) { return "Oppo U707T"; }
        else if ("UVP-X".equals(model)) { return "Ubiquiti UVP-X"; }
        else if ("U680C".equals(model)) { return "Teleepoch UMX U680C"; }
        else if ("Ultym5".equals(model)) { return "Huawei G535-L11"; }
        else if ("U8230".equals(model)) { return "Huawei U8230"; }
        else if ("U3".equals(model)) { return "Oppo U3"; }
        else if ("U2".equals(model)) { return "Anydata HCL ME TABLET PC U2"; }
        else if ("USCC-C6721".equals(model)) { return "Kyocera Hydro XTRM"; }
        else if ("U9500".equals(model)) { return "Huawei Ascend D"; }
        else if ("U966".equals(model)) { return "Hisense U966"; }
        else if ("U20a".equals(model)) { return "Sony Ericsson Xperia X10 mini pro"; }
        else if ("U20i".equals(model)) { return "Sony Ericsson Xperia X10 Mini Pro"; }
        else if ("U8220PLUS".equals(model)) { return "Huawei U8220"; }
        else if ("USS".equals(model)) { return "Ubiquiti USS"; }
        else if ("UNO_X8".equals(model)) { return "ODYS UNO X8"; }
        else if ("Ultra".equals(model)) { return "AG Mobile ULTRA"; }
        else if ("U675".equals(model)) { return "Teleepoch U675"; }
        else if ("USCC-E6762".equals(model)) { return "Kyocera DuraForce"; }
        else if ("U8100".equals(model)) { return "Huawei T-Mobile Pulse"; }
        else if ("U98".equals(model)) { return "Hisense HS-U98"; }
        else if ("USCCADR6230US".equals(model)) { return "HTC Wildfire S A515c"; }
        else if ("unknown".equals(model)) { return "Motorola Defy"; }
        else if ("U8220".equals(model)) { return "Huawei U8220"; }
        else if ("US740".equals(model)) { return "LGE Ally"; }
        return "";

    }
    public static String tMethod (String model) {
        if ("TL10RA3".equals(model)) { return "Amplify TL10RA3"; }
        else if ("TL10RA2".equals(model)) { return "ECS TL10RA2"; }
        else if ("titan_niibr_ds".equals(model)) { return "Motorola MOTO G"; }
        else if ("TM772".equals(model)) { return "Apex TM772"; }
        else if ("TBDG1073".equals(model)) { return "Zeki TBDG1073"; }
        else if ("TI320-DU".equals(model)) { return "LGUplus TV G"; }
        else if ("Telenor_One_Touch_C".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 985"; }
        else if ("T705/T708".equals(model)) { return "Positivo T705"; }
        else if ("TOM007".equals(model)) { return "TCT (Alcatel) P688L"; }
        else if ("Tab2A7-20F".equals(model)) { return "Lenovo TAB 2 A7-20F"; }
        else if ("T785B".equals(model)) { return "Haier T785B"; }
        else if ("titan_retbr_dstv".equals(model)) { return "Motorola Moto G"; }
        else if ("Trio-Stealth-G4-7.85".equals(model)) { return "Trio-Stealth-G4-7.85"; }
        else if ("TM105".equals(model)) { return "Gigabyte TM105"; }
        else if ("TegraNote-P1640".equals(model)) { return "NVidia TegraNote"; }
        else if ("T2702".equals(model)) { return "MJS T2702"; }
        else if ("thunderc".equals(model)) { return "LGE Optimus One"; }
        else if ("TC70RA1".equals(model)) { return "ECS TC70RA1"; }
        else if ("T10xTA".equals(model)) { return "Asus T101TA"; }
        else if ("T2HD".equals(model)) { return "Lumigon T2 HD"; }
        else if ("TM75A-V".equals(model)) { return "Gigabyte TM75A-V"; }
        else if ("TCL-D668".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH D668"; }
        else if ("TEI11011MST".equals(model)) { return "Mecer TEI11011"; }
        else if ("TECTOYTT2500".equals(model)) { return "Anydata TecToy TT-2500"; }
        else if ("TCL-J929L".equals(model)) { return "TCT (Alcatel) TCL J929L"; }
        else if ("Tab2A7-10F".equals(model)) { return "Lenovo TAB 2 A7-10F"; }
        else if ("T012".equals(model)) { return "Acer Liquid Z320"; }
        else if ("T1060C".equals(model)) { return "Positivo T1060"; }
        else if ("TCL_J210".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4010X"; }
        else if ("TCLJ330".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("TA80TA1".equals(model)) { return "Tinhvan TA80TA1"; }
        else if ("T1-701ua".equals(model)) { return "Huawei MediaPad"; }
        else if ("TC55CH".equals(model)) { return "MotorolaSolutionsInc. TC55CH"; }
        else if ("TX201LA".equals(model)) { return "ASUS Transformer Book Trio"; }
        else if ("T1-A21L".equals(model)) { return "Huawei T1 10"; }
        else if ("TBQC1063".equals(model)) { return "Zeki TBQC1063B"; }
        else if ("TVE9603I".equals(model)) { return "Carrefour CT1050"; }
        else if ("TAB-A01-SD".equals(model)) { return "Panasonic TAB-A01"; }
        else if ("TM105A".equals(model)) { return "Gigabyte TM105A"; }
        else if ("Titanium".equals(model)) { return "Motorola Opus One"; }
        else if ("TCL-D920".equals(model)) { return "TCT (Alcatel) TCL D920"; }
        else if ("T1-A23L".equals(model)) { return "Huawei T1 10"; }
        else if ("TAB-700".equals(model)) { return "Haier TAB-700"; }
        else if ("TR10CS2".equals(model)) { return "MG series Any 302"; }
        else if ("TCL_P689L".equals(model)) { return "TCT (Alcatel) TCL P689L"; }
        else if ("TegraNote-Premium".equals(model)) { return "NVidia TegraNote"; }
        else if ("TCL-S850L".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("TBQG1084".equals(model)) { return "Zeki TBQG1084"; }
        else if ("T-Mobile_G2_Touch".equals(model)) { return "HTC Hero"; }
        else if ("TX201LAF".equals(model)) { return "Asus TX201LAF"; }
        else if ("Tab870".equals(model)) { return "Bitmore Tab870"; }
        else if ("TBDG734".equals(model)) { return "Zeki TBDG734"; }
        else if ("Tab734".equals(model)) { return "Intenso Tab734"; }
        else if ("T852".equals(model)) { return "Audiovox T852 Tablet"; }
        else if ("TB100".equals(model)) { return "Gigabyte TB100"; }
        else if ("TF101-WiMAX".equals(model)) { return "Asus Eee Pad TF101-WiMAX"; }
        else if ("TCL-J736L".equals(model)) { return "TCT (Alcatel) TCL 736L"; }
        else if ("TC97RA1".equals(model)) { return "Tekwind TC97RA1"; }
        else if ("T-01D".equals(model)) { return "Fujitsu REGZA Phone T-01D"; }
        else if ("T-01C".equals(model)) { return "Fujitsu REGZA Phone T-01C"; }
        else if ("TECNO-C8".equals(model)) { return "TECNO-C8"; }
        else if ("TECNO-C5".equals(model)) { return "TECNO-C5"; }
        else if ("T03".equals(model)) { return "Acer Liquid Z630"; }
        else if ("T47_05".equals(model)) { return "BenQ T47"; }
        else if ("TBDG773".equals(model)) { return "Anydata Zeki TBDG773"; }
        else if ("TA70CA3".equals(model)) { return "Digilite TA70CA3"; }
        else if ("TA70CA2".equals(model)) { return "Digilite TA70CA2"; }
        else if ("TA70CA1".equals(model)) { return "Digilite TA70CA1"; }
        else if ("TAB700MPG".equals(model)) { return "Haier TAB-700"; }
        else if ("T06".equals(model)) { return "Acer Liquid Zest"; }
        else if ("T05".equals(model)) { return "Acer Liquid Z530S"; }
        else if ("T04".equals(model)) { return "Acer Liquid Z630S"; }
        else if ("T02".equals(model)) { return "Acer Liquid Z530"; }
        else if ("T01".equals(model)) { return "Acer Liquid Z330"; }
        else if ("TT101".equals(model)) { return "ZTE V9"; }
        else if ("Tasty".equals(model)) { return "HighScreen Tasty"; }
        else if ("TBQG855".equals(model)) { return "Zeki TBQG855"; }
        else if ("TH-65DR800C".equals(model)) { return "Panasonic TH-65DR800C"; }
        else if ("T705".equals(model)) { return "Positivo T705"; }
        else if ("T7".equals(model)) { return "Tobii DynaVox T7"; }
        else if ("T2".equals(model)) { return "Lumigon T2"; }
        else if ("T3".equals(model)) { return "ZTE T3"; }
        else if ("Trooper_X40".equals(model)) { return "KAZAM TROOPER X4.0"; }
        else if ("TP10RA1".equals(model)) { return "ECS TP10RA1"; }
        else if ("T1-701w".equals(model)) { return "Huawei MediaPad"; }
        else if ("T720".equals(model)) { return "Positivo Ypy AB7F"; }
        else if ("T1-A21w".equals(model)) { return "Huawei T1 10"; }
        else if ("Trekker-M1".equals(model)) { return "Crosscall Trekker- M1"; }
        else if ("T3000".equals(model)) { return "Infocus T3000"; }
        else if ("TECNO-Y3S".equals(model)) { return "TECNO-Y3S"; }
        else if ("Tab814S".equals(model)) { return "Intenso Tab814S"; }
        else if ("T705K".equals(model)) { return "Positivo T705"; }
        else if ("TM101A530L".equals(model)) { return "Nuvision TM101A530L"; }
        else if ("TC55".equals(model)) { return "Zebra TC55"; }
        else if ("TCL-J320D".equals(model)) { return "TCT (Alcatel) TCL-J320D"; }
        else if ("TF10EA2".equals(model)) { return "ECS TF10EA2"; }
        else if ("TR10CD3".equals(model)) { return "Amplify TR10CD3"; }
        else if ("TR10CD2".equals(model)) { return "MG series Any 303"; }
        else if ("TECNO-PHANTOM5".equals(model)) { return "TECNO-PHANTOM5"; }
        else if ("TH55DR600C".equals(model)) { return "Panasonic TH-55DR600C"; }
        else if ("T1060B".equals(model)) { return "Positivo T1060"; }
        else if ("TM700A520L".equals(model)) { return "Nuvision TM700A520L"; }
        else if ("TBDG874".equals(model)) { return "Zeki TBDG874 Tablet"; }
        else if ("TM75A-V2".equals(model)) { return "i-Buddie TM75A-V2"; }
        else if ("TA71CA3".equals(model)) { return "G53 TA71CA3"; }
        else if ("TC75".equals(model)) { return "Zebra Pollux"; }
        else if ("TC700H".equals(model)) { return "Zebra Pollux"; }
        else if ("T701".equals(model)) { return "Positivo T701 TV"; }
        else if ("Tornado".equals(model)) { return "Explay Tornado"; }
        else if ("T72HM3G".equals(model)) { return "Oysters T72HM3G"; }
        else if ("T4018".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("TE1".equals(model)) { return "Telefunken Enjoy TE1"; }
        else if ("TC80RA1".equals(model)) { return "Ceibal TC80RA1"; }
        else if ("TC80RA6".equals(model)) { return "Ceibal TC80RA6"; }
        else if ("T600M".equals(model)) { return "TCT (Alcatel) 8050E"; }
        else if ("TIT-AL00".equals(model)) { return "HUAWEI Y6 Pro"; }
        else if ("TrioStealth-7".equals(model)) { return "MachSpeed TrioStealth-7"; }
        else if ("TH-55DX600C".equals(model)) { return "Panasonic 55DX600C"; }
        else if ("Telenor_Smart".equals(model)) { return "Telenor Smart"; }
        else if ("Tornado3G".equals(model)) { return "Explay Tornado 3G"; }
        else if ("TREDNY".equals(model)) { return "Mobicell Trendy"; }
        else if ("TM9S775".equals(model)) { return "TMAX TM9S775"; }
        else if ("Telenor_SmartPlus".equals(model)) { return "Mobiwire Telenor SmartPlus"; }
        else if ("Torque".equals(model)) { return "Kyocera Torque"; }
        else if ("TQ150".equals(model)) { return "ZTE TQ150"; }
        else if ("TA10TA2".equals(model)) { return "Vulcan TA10TA2"; }
        else if ("TF101".equals(model)) { return "Asus Eee Pad TF101"; }
        else if ("T-101".equals(model)) { return "Huawei T101"; }
        else if ("Tab_2".equals(model)) { return "Beeline Tab 2"; }
        else if ("TECNO-L6".equals(model)) { return "Tecno Techno L6"; }
        else if ("TECNO-L5".equals(model)) { return "TECNO-L5"; }
        else if ("TC69CA2".equals(model)) { return "ECS TC69CA2"; }
        else if ("TA71CA5".equals(model)) { return "i-Buddie TA71CA5"; }
        else if ("TA71CA1".equals(model)) { return "i-Buddie TA71CA1"; }
        else if ("TA71CA2".equals(model)) { return "Vulcan TA71CA2"; }
        else if ("TCL_S725T".equals(model)) { return "TCT (Alcatel) TCL S725T"; }
        else if ("TA10CA4".equals(model)) { return "i-Buddie TA10CA4"; }
        else if ("TA10CA1".equals(model)) { return "i-Buddie TA10CA1"; }
        else if ("TA10CA3".equals(model)) { return "i-Buddie TA10CA3"; }
        else if ("TA10CA2".equals(model)) { return "i-Buddie TA10CA2"; }
        else if ("T1144".equals(model)) { return "IPRODA T1144"; }
        else if ("TMK27A2".equals(model)) { return "Haier TMK27A2"; }
        else if ("TECNO-J5".equals(model)) { return "TECNO-J5"; }
        else if ("TECNO-J7".equals(model)) { return "TECNO-J7"; }
        else if ("TO101".equals(model)) { return "ZTE V9"; }
        else if ("Trio-Stealth-G4-7".equals(model)) { return "Trio-Stealth G4 7"; }
        else if ("TPA60W".equals(model)) { return "Acer TPA60W"; }
        else if ("TLINK455".equals(model)) { return "Thomson TLink 455"; }
        else if ("TCL-J900C".equals(model)) { return "TCT (Alcatel) TCL-J900C"; }
        else if ("TECNO-A7S".equals(model)) { return "TECNO-A7S"; }
        else if ("TC8000".equals(model)) { return "Zebra TC8000"; }
        else if ("TDA02".equals(model)) { return "FBC M24IS810"; }
        else if ("TM785M3".equals(model)) { return "Nuvision TM785M3"; }
        else if ("T1-701u".equals(model)) { return "Huawei MediaPad"; }
        else if ("TH805".equals(model)) { return "Thinpad TH805"; }
        else if ("TP601E".equals(model)) { return "Neffos C5L"; }
        else if ("TP601C".equals(model)) { return "Neffos C5L"; }
        else if ("TP601B".equals(model)) { return "Neffos C5L"; }
        else if ("TP601A".equals(model)) { return "Neffos C5L"; }
        else if ("T-Mobile_G2".equals(model)) { return "T-Mobile G2"; }
        else if ("TCL-J210C".equals(model)) { return "TCT (Alcatel) TCL J210C"; }
        else if ("TBQG774".equals(model)) { return "Zeki TBQG774"; }
        else if ("TM785CH".equals(model)) { return "Apex TM785CH"; }
        else if ("TI10RA1".equals(model)) { return "ECS TI10RA1"; }
        else if ("TabMini".equals(model)) { return "Explay Tab Mini"; }
        else if ("TRIO-7.85".equals(model)) { return "TRIO-7.85"; }
        else if ("T1-A22L".equals(model)) { return "Huawei T1 10"; }
        else if ("TR10RS1".equals(model)) { return "ECS TR10RS1"; }
        else if ("Tostab03".equals(model)) { return "Toshiba AT100"; }
        else if ("Tele2_Mini".equals(model)) { return "Tele2 Mini"; }
        else if ("T1060".equals(model)) { return "Positivo T1060"; }
        else if ("T-Mobile_myTouch_Q".equals(model)) { return "T-Mobile myTouch Q"; }
        else if ("TM1088".equals(model)) { return "Nuvision TM1088"; }
        else if ("TM800A550L".equals(model)) { return "Nuvision TM800A550L"; }
        else if ("TOSPASB".equals(model)) { return "TOSHIBA STB10"; }
        else if ("TCL-P306C".equals(model)) { return "TCT (Alcatel) TCL-P306C"; }
        else if ("TB01".equals(model)) { return "Huawei M620"; }
        else if ("TL66".equals(model)) { return "Tonino Lamborghini Antares"; }
        else if ("T1-821W".equals(model)) { return "Huawei T1"; }
        else if ("T1-821L".equals(model)) { return "Huawei T1"; }
        else if ("T70".equals(model)) { return "TCT (Alcatel) T70"; }
        else if ("T10+".equals(model)) { return "Tobii DynaVox T10+"; }
        else if ("Telenor_Smart_Pro".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 991"; }
        else if ("Transformer_Prime_TF201".equals(model)) { return "Asus Eee Pad Transformer Prime"; }
        else if ("TD070VA1".equals(model)) { return "Acer Tab 7"; }
        else if ("TA80CA1".equals(model)) { return "i-Buddie TA80CA1"; }
        else if ("TA80CA2".equals(model)) { return "Casper TA80CA2"; }
        else if ("T-02D".equals(model)) { return "Fujitsu REGZA Phone T-02D"; }
        else if ("TCC893X_EVM".equals(model)) { return "Hyundai CAR AVN SYSTEM"; }
        else if ("ThinkVision28".equals(model)) { return "Lenovo ThinkVision28"; }
        else if ("TECNO_W4".equals(model)) { return "TECNO-W4"; }
        else if ("T10".equals(model)) { return "BYD DynaVox T10"; }
        else if ("TF201".equals(model)) { return "Asus Eee Pad Transformer Prime"; }
        else if ("TM800A510L".equals(model)) { return "Nuvision TM800A510L"; }
        else if ("TCL-P688L".equals(model)) { return "TCT (Alcatel) P688L"; }
        else if ("Trooper_X35".equals(model)) { return "KAZAM TROOPER X3.5"; }
        else if ("T730".equals(model)) { return "Wintec T730"; }
        else if ("TM106A510L".equals(model)) { return "Nuvision TM106A510L"; }
        else if ("Transformer_TF101".equals(model)) { return "Asus Eee Pad Transformer"; }
        else if ("TECNO-Y5".equals(model)) { return "TECNO-Y5"; }
        else if ("TECNO-Y4".equals(model)) { return "TECNO-Y4"; }
        else if ("TECNO-Y6".equals(model)) { return "TECNO-Y6"; }
        else if ("TECNO-Y3".equals(model)) { return "TECNO-Y3"; }
        else if ("TA272HUL".equals(model)) { return "Acer TA272HUL"; }
        else if ("TM75A".equals(model)) { return "Gigabyte TM75A"; }
        else if ("Trooper_X55".equals(model)) { return "KAZAM TROOPER X5.5"; }
        else if ("T752".equals(model)) { return "Audiovox T752 Tablet"; }
        else if ("TECNO-M6S".equals(model)) { return "TECNO-M6S"; }
        else if ("T07".equals(model)) { return "Acer Liquid Zest 4G"; }
        else if ("Telenor_OneTouch".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("TBQG884".equals(model)) { return "Zeki TBQG884"; }
        return "";

    }
    public static String wMethod (String model) {
        if ("WX445".equals(model)) { return "Motorola Citrus"; }
        else if ("Winner".equals(model)) { return "Explay Winner"; }
        else if ("Winner7".equals(model)) { return "Explay Winner 7"; }
        else if ("WA966".equals(model)) { return "SKnetworks WA966"; }
        else if ("WA960".equals(model)) { return "Hisense WA960"; }
        else if ("W909".equals(model)) { return "Gionee W909"; }
        else if ("WX04SH".equals(model)) { return "Sharp AQUOS PHONE es WX04SH"; }
        else if ("W627".equals(model)) { return "Haier"; }
        else if ("W626".equals(model)) { return "Anydata Philips W626"; }
        else if ("Winner8".equals(model)) { return "Explay Winner 8"; }
        else if ("W861".equals(model)) { return "Haier"; }
        else if ("W860".equals(model)) { return "Haier W860"; }
        else if ("WPT005".equals(model)) { return "iRiver WPT005"; }
        else if ("W900S".equals(model)) { return "Gionee W900S"; }
        else if ("WETAB700DG".equals(model)) { return "W.e. WETAB700DG"; }
        else if ("W1011A".equals(model)) { return "Wistron W1011A"; }
        else if ("w5".equals(model)) { return "Gini w5"; }
        else if ("WX05SH".equals(model)) { return "Sharp AQUOS PHONE WX05SH"; }
        else if ("WeTab1004B".equals(model)) { return "W.e. WeTab1004B"; }
        else if ("W757".equals(model)) { return "Haier W757"; }
        else if ("W717".equals(model)) { return "Haier W717"; }
        else if ("W80".equals(model)) { return "QMobile W80"; }
        else if ("WX442".equals(model)) { return "Motorola Citrus"; }
        else if ("W6620".equals(model)) { return "Philips W6620"; }
        else if ("W6360".equals(model)) { return "Gigabyte W6360"; }
        else if ("WA978".equals(model)) { return "SKnetworks WA978"; }
        else if ("WX10K".equals(model)) { return "Kyocera WX10K"; }
        else if ("WA-U420D".equals(model)) { return "Welgate WA-U420D"; }
        else if ("W2".equals(model)) { return "LT W2"; }
        else if ("Warp".equals(model)) { return "ZTE N860"; }
        else if ("WEBPAD1002".equals(model)) { return "Nuvision TM1088"; }
        else if ("WA912".equals(model)) { return "Hisense WA912"; }
        else if ("W270BD".equals(model)) { return "Hisense W270BD"; }
        else if ("W032I".equals(model)) { return "BYD WISKY W032I"; }
        else if ("WX04K".equals(model)) { return "Kyocera DIGNO Dual"; }
        else if ("WALKMAN".equals(model)) { return "Sony NW-ZX1"; }
        else if ("W55".equals(model)) { return "Qilive W55"; }
        else if ("W337".equals(model)) { return "Philips W337"; }
        else if ("W70".equals(model)) { return "QMobile W70"; }
        else if ("W6500".equals(model)) { return "Philips W6500"; }
        else if ("W3620".equals(model)) { return "Philips W3620"; }
        else if ("WAX".equals(model)) { return "Wiko WAX"; }
        else if ("WM8".equals(model)) { return "Hisense WM8"; }
        else if ("WT19i".equals(model)) { return "Sony Ericsson Live with Walkman"; }
        else if ("WT19a".equals(model)) { return "Sony Ericsson Xperia live"; }
        else if ("W5510".equals(model)) { return "Gigabyte W5510"; }
        return "";

    }
    public static String vMethod (String model) {
        if ("V917G".equals(model)) { return "ENVIZEN DIGITAL V917G"; }
        else if ("V817".equals(model)) { return "ZTE V817"; }
        else if ("V8285".equals(model)) { return "ZTE V8285"; }
        else if ("V2_Viper".equals(model)) { return "AllView V2 Viper"; }
        else if ("VK700".equals(model)) { return "LGE G Pad 10.1 LTE"; }
        else if ("V2_Viper_E".equals(model)) { return "AllView V2 Viper E"; }
        else if ("VSP355g".equals(model)) { return "Vestel VSP355g"; }
        else if ("VSP355s".equals(model)) { return "Vestel VSP355s"; }
        else if ("VS840PP".equals(model)) { return "LGE LG Lucid"; }
        else if ("V769M".equals(model)) { return "ZTE V769M"; }
        else if ("vision2_5".equals(model)) { return "Hisense Vision 2.5"; }
        else if ("V8110".equals(model)) { return "ZTE V8110"; }
        else if ("vsi8q_1".equals(model)) { return "ViewSonic ViewPadi8Q"; }
        else if ("V1_Viper_I4G".equals(model)) { return "AllView V1 Viper I4G"; }
        else if ("Viva_i7G".equals(model)) { return "AllView Viva i7G"; }
        else if ("V360".equals(model)) { return "Acer Liquid E1"; }
        else if ("vsi7q_1".equals(model)) { return "ViewSonic ViewPadi7Q"; }
        else if ("Veil".equals(model)) { return "Gryphon Veil"; }
        else if ("VSD241".equals(model)) { return "ViewSonic VSD241 Smart Display"; }
        else if ("VS415PP".equals(model)) { return "LGE LG Optimus Zone 2"; }
        else if ("V865M".equals(model)) { return "ZTE V865M"; }
        else if ("V8510".equals(model)) { return "Huawei Y330-U11"; }
        else if ("VS876".equals(model)) { return "LGE LG Lucid 3"; }
        else if ("VSP250s".equals(model)) { return "Vestel VSP250s"; }
        else if ("VSP250g".equals(model)) { return "Vestel VSP250g"; }
        else if ("VT10E".equals(model)) { return "Vestel VT10E"; }
        else if ("VF-1397".equals(model)) { return "TCT (Alcatel) VF-1397"; }
        else if ("VivaH7LTE".equals(model)) { return "AllView Viva H7 LTE"; }
        else if ("Venus_V3_5070".equals(model)) { return "Vestel Venus V3 5070"; }
        else if ("V972M".equals(model)) { return "ZTE LEO S1"; }
        else if ("Viva_i701G_TM".equals(model)) { return "AllView Viva i701G"; }
        else if ("Viva_H1001_LTE".equals(model)) { return "AllView Viva H1001 LTE"; }
        else if ("Vision20".equals(model)) { return "Hisense LED85XT910G3DU"; }
        else if ("VK410".equals(model)) { return "LGE GPAD 7.0 LTE"; }
        else if ("VSD221".equals(model)) { return "ViewSonic VSD221"; }
        else if ("VSD220".equals(model)) { return "Quanta VSD220"; }
        else if ("V1_Viper_S4G".equals(model)) { return "AllView V1 Viper S4G"; }
        else if ("V72C".equals(model)) { return "ZTE V72C"; }
        else if ("V2_Viper_I4G".equals(model)) { return "AllView V2 Viper I4G"; }
        else if ("V2_Viper_I_TM".equals(model)) { return "AllView V2 Viper I"; }
        else if ("VF-895N".equals(model)) { return "TCT (Alcatel) Vodafone 895"; }
        else if ("VS425".equals(model)) { return "LGE LG K4"; }
        else if ("V2s".equals(model)) { return "Lava V2s"; }
        else if ("V791".equals(model)) { return "ZTE V791"; }
        else if ("VS990".equals(model)) { return "LGE V10"; }
        else if ("Venus_V3_5040".equals(model)) { return "Vestel Venus V3 5040"; }
        else if ("V96A".equals(model)) { return "ZTE V96A"; }
        else if ("VENSTAR2050".equals(model)) { return "VENSTAR2050"; }
        else if ("Venus_V3_5020".equals(model)) { return "Vestel Venus V3 5020"; }
        else if ("Vision".equals(model)) { return "Hisense Vision"; }
        else if ("V1_Viper_I4G_TM".equals(model)) { return "AllView V1 Viper I4G"; }
        else if ("VS425PP".equals(model)) { return "LGE Zone3"; }
        else if ("VK815".equals(model)) { return "LGE LG G Pad X 8.3"; }
        else if ("VAP430".equals(model)) { return "Vizio StreamPlayer"; }
        else if ("VW_RCBKK1".equals(model)) { return "Panasonic Boukenkun-reciever"; }
        else if ("V6L".equals(model)) { return "Gionee ForwardZero"; }
        else if ("VFD1400".equals(model)) { return "Vodafone Tab Prime 7"; }
        else if ("vsi7q_1_coho".equals(model)) { return "ViewSonic ViewPadi7Q"; }
        else if ("V.45".equals(model)) { return "Nextel V.45"; }
        else if ("V.40".equals(model)) { return "Mobiwire V.40"; }
        else if ("VSP145M".equals(model)) { return "Vestel VSP145M"; }
        else if ("V4S".equals(model)) { return "Gionee V4S"; }
        else if ("Viva_C701".equals(model)) { return "AllView Viva C701"; }
        else if ("VS930_4G".equals(model)) { return "LG Spectrum 2"; }
        else if ("VP74-Vox".equals(model)) { return "Vestel VP74"; }
        else if ("V1_Viper_I4G_PL".equals(model)) { return "AllView V1 Viper I4G"; }
        else if ("VS920_4G".equals(model)) { return "LG Spectrum 4G"; }
        else if ("V.45S".equals(model)) { return "Mobiwire V.45"; }
        else if ("VM670".equals(model)) { return "LG Optimus V"; }
        else if ("V85".equals(model)) { return "Symphony V85"; }
        else if ("VS980_4G".equals(model)) { return "LG G2"; }
        else if ("VP73_Vox".equals(model)) { return "Vestel VP73"; }
        else if ("V100".equals(model)) { return "Symphony V100"; }
        else if ("VF695".equals(model)) { return "TCT (Alcatel) VF695"; }
        else if ("Venus".equals(model)) { return "Mobicell Mobicel"; }
        else if ("VP73_le".equals(model)) { return "Vestel VP73"; }
        else if ("V370".equals(model)) { return "Acer Liquid E2"; }
        else if ("V8602".equals(model)) { return "ZTE Grand X Quad Lite"; }
        else if ("V9180".equals(model)) { return "ZTE V9180"; }
        else if ("VP74-Orava".equals(model)) { return "Vestel VP74"; }
        else if ("V795(A3S)".equals(model)) { return "ZTE V795"; }
        else if ("VS810PP".equals(model)) { return "LGE F60"; }
        else if ("V883M".equals(model)) { return "ZTE LEO M1"; }
        else if ("Videocon_V7400".equals(model)) { return "Huawei T-Mobile Pulse"; }
        else if ("V1_Viper_L".equals(model)) { return "AllView V1 Viper L"; }
        else if ("V1_Viper_E".equals(model)) { return "AllView V1 Viper E"; }
        else if ("V100MD".equals(model)) { return "ENVIZEN DIGITAL V100MD"; }
        else if ("VP74-Telefunken".equals(model)) { return "Vestel VP74"; }
        else if ("V3".equals(model)) { return "Haier V3"; }
        else if ("V5".equals(model)) { return "ZTE NE501J"; }
        else if ("V7".equals(model)) { return "Polaroid V7"; }
        else if ("V9".equals(model)) { return "ZTE V9"; }
        else if ("VH777".equals(model)) { return "Hisense VH777"; }
        else if ("VP73_Hyundai".equals(model)) { return "Vestel VP73"; }
        else if ("Viva_i10HD".equals(model)) { return "AllView Viva i10HD"; }
        else if ("VivaH8LTE".equals(model)) { return "AllView Viva H8 LTE"; }
        else if ("VT785P2-Celcus".equals(model)) { return "Vestel VT785P2"; }
        else if ("VT785P2-Vestel".equals(model)) { return "Vestel VT785P2"; }
        else if ("Viva_H701_LTE_CZ".equals(model)) { return "AllView Viva i701G"; }
        else if ("V8507".equals(model)) { return "ZTE V829"; }
        else if ("V8502".equals(model)) { return "ZTE Blade"; }
        else if ("V8501".equals(model)) { return "ZTE V807"; }
        else if ("VP800".equals(model)) { return "Foxconn vizio VP800"; }
        else if ("VS870_4G".equals(model)) { return "LG Lucid 2"; }
        else if ("VSD231".equals(model)) { return "ViewSonic VSD231"; }
        else if ("V2_Viper_I".equals(model)) { return "AllView V2 Viper I"; }
        else if ("V2_Viper_X".equals(model)) { return "AllView V2 Viper X"; }
        else if ("VALENCIA".equals(model)) { return "TCT (Alcatel) ONE TOUCH 983"; }
        else if ("VS880".equals(model)) { return "LGE G Vista"; }
        else if ("V8514".equals(model)) { return "ZTE V8514"; }
        else if ("vsi8q_1_coho".equals(model)) { return "ViewSonic ViewPadi8Q"; }
        else if ("VS987".equals(model)) { return "LGE LG G5"; }
        else if ("VS986".equals(model)) { return "LG G4"; }
        else if ("V975".equals(model)) { return "ZTE V975"; }
        else if ("VIA-T7D-3G".equals(model)) { return "Casper VIA T7D 3G"; }
        else if ("Vortex".equals(model)) { return "LGE Optimus One"; }
        else if ("VP700".equals(model)) { return "Foxconn vizio VP700"; }
        else if ("VF-1497".equals(model)) { return "TCT (Alcatel) VF-1497"; }
        else if ("VP74-Finlux".equals(model)) { return "Vestel VP74"; }
        else if ("Venus_V3_5570".equals(model)) { return "Vestel Venus V3 5570"; }
        else if ("VP74-Celcus".equals(model)) { return "Vestel VP74"; }
        else if ("Viva_H801".equals(model)) { return "AllView Viva H801"; }
        else if ("V23GB".equals(model)) { return "Lava V2 3GB"; }
        else if ("VS985_4G".equals(model)) { return "LG G3 4G"; }
        else if ("VT785P2-Finlux".equals(model)) { return "Vestel VT785P2"; }
        else if ("V2_Viper_X_plus".equals(model)) { return "AllView V2 Viper X plus"; }
        else if ("VS840_4G".equals(model)) { return "LG Lucid 4G"; }
        else if ("Voyager".equals(model)) { return "Gigabyte TM75A"; }
        else if ("V55".equals(model)) { return "ZTE V55"; }
        else if ("Vox".equals(model)) { return "Kobo Vox"; }
        else if ("ViewPhone3".equals(model)) { return "Foxconn ViewPhone3"; }
        else if ("V72M".equals(model)) { return "ZTE V72M"; }
        else if ("VP74".equals(model)) { return "Vestel VP74"; }
        else if ("VP73".equals(model)) { return "Vestel VP73"; }
        else if ("VAX114".equals(model)) { return "Vaxcare VAX114"; }
        else if ("VIA-T7D".equals(model)) { return "Casper VIA T7D"; }
        else if ("Vega".equals(model)) { return "Explay Vega"; }
        else if ("VivaH10LTE".equals(model)) { return "AllView Viva H10 LTE"; }
        else if ("V9c".equals(model)) { return "ZTE V9"; }
        else if ("V9e".equals(model)) { return "ZTE V9"; }
        else if ("V9S".equals(model)) { return "ZTE V9S"; }
        else if ("V9C".equals(model)) { return "ZTE V9"; }
        else if ("V9A".equals(model)) { return "ZTE V9A"; }
        else if ("VS910_4G".equals(model)) { return "LG Revolution 4G"; }
        else if ("VK810_4G".equals(model)) { return "G Pad 8.3"; }
        else if ("VF685".equals(model)) { return "TCT (Alcatel) VF685"; }
        else if ("V.35".equals(model)) { return "VSN V.35"; }
        else if ("VS500".equals(model)) { return "LGE LG K8 V"; }
        else if ("VIE-L09".equals(model)) { return "Huawei P9 Plus"; }
        else if ("VP74-Luxor".equals(model)) { return "Vestel VP74"; }
        else if ("VP73_Myros".equals(model)) { return "Vestel VP73"; }
        else if ("VP100+".equals(model)) { return "Vestel VP100+"; }
        else if ("V8403".equals(model)) { return "ZTE V8403"; }
        else if ("V8402".equals(model)) { return "ZTE Racer"; }
        else if ("VIE-L29".equals(model)) { return "Huawei P9 Plus"; }
        else if ("V8200plus".equals(model)) { return "ZTE V8200plus"; }
        else if ("VIE-AL10".equals(model)) { return "Huawei P9 Plus"; }
        else if ("VT10E2".equals(model)) { return "Vestel VT10E2"; }
        else if ("VT785P2-Cleverpad".equals(model)) { return "Vestel VT785P2"; }
        else if ("Viva_i701G".equals(model)) { return "AllView Viva i701G"; }
        return "";

    }
    public static String yMethod (String model) {
        if ("YP-GH1".equals(model)) { return "Samsung IceTouch"; }
        else if ("Y340-U081".equals(model)) { return "Huawei Y340-U081"; }
        else if ("Y550-L02".equals(model)) { return "Huawei Y550-L02"; }
        else if ("Y550-L03".equals(model)) { return "Huawei Y550-L03"; }
        else if ("YPY_07STBF".equals(model)) { return "Positivo Ypy 07STBF"; }
        else if ("Yellowstone".equals(model)) { return "Google Project Tango Tablet Development Kit"; }
        else if ("YPY_07FTB".equals(model)) { return "Positivo Ypy 07FTB"; }
        else if ("YPY_07FTA".equals(model)) { return "Positivo YPY7 3G"; }
        else if ("YPY_S350".equals(model)) { return "Positivo Ypy S350"; }
        else if ("YP-GB1".equals(model)) { return "Samsung Galaxy Player 4"; }
        else if ("YP-GB70".equals(model)) { return "Samsung Galaxy Player"; }
        else if ("Y400".equals(model)) { return "Positivo BGH Y400"; }
        else if ("YPY_S405".equals(model)) { return "Positivo Ypy S405"; }
        else if ("YPY_S400".equals(model)) { return "Positivo YPY S400"; }
        else if ("YP-GB70D".equals(model)) { return "Samsung Galaxy player 70 Plus"; }
        else if ("Y320-U01".equals(model)) { return "Huawei Y320-U01"; }
        else if ("YPY_S460".equals(model)) { return "Positivo Ypy S460"; }
        else if ("YUREKA".equals(model)) { return "Yureka"; }
        else if ("YU5510A".equals(model)) { return "Yureka"; }
        else if ("YPY_10FTBF".equals(model)) { return "Positivo Ypy 10FTBF"; }
        else if ("YP-G1".equals(model)) { return "Samsung Galaxy Player 4.0"; }
        else if ("YU5010A".equals(model)) { return "YUPHORIA"; }
        else if ("YU5510".equals(model)) { return "Yureka"; }
        else if ("YP-GS1".equals(model)) { return "Samsung Galaxy Player 3.6"; }
        else if ("YPY_10STBF".equals(model)) { return "Positivo Ypy 10STBF"; }
        else if ("YPY_10FTB".equals(model)) { return "Positivo Ypy 10FTB"; }
        else if ("Y541-U02".equals(model)) { return "Huawei Y541-U02"; }
        else if ("YPY_10FTA".equals(model)) { return "Positivo YPY 10 3G"; }
        else if ("Y220-U05".equals(model)) { return "Huawei Y220"; }
        else if ("YPY_S500".equals(model)) { return "Positivo Ypy S500"; }
        else if ("YPY_S350_PLUS".equals(model)) { return "Positivo Ypy S350p"; }
        else if ("YPY_AB10DC".equals(model)) { return "Positivo Ypy AB10D"; }
        else if ("YPY_AB10DP".equals(model)) { return "Positivo Ypy AB10DP"; }
        else if ("Y538".equals(model)) { return "Huawei UNION"; }
        else if ("YPY_07FTBF".equals(model)) { return "Positivo Ypy 07FTBF"; }
        else if ("YP-GI2".equals(model)) { return "Samsung Galaxy 070"; }
        else if ("YP-GI1".equals(model)) { return "Samsung Galaxy Player 4.2"; }
        else if ("Y635-L21".equals(model)) { return "Huawei Y635-L21"; }
        else if ("Y511-U00".equals(model)) { return "Huawei Y511-U00"; }
        else if ("YPY_10STB".equals(model)) { return "Positivo Ypy 10STB"; }
        else if ("YPY_07STB".equals(model)) { return "Positivo Ypy 07STB"; }
        else if ("YPY_07STA".equals(model)) { return "Positivo YPY7 wifi"; }
        else if ("Y635-L01".equals(model)) { return "Huawei Y635-L01"; }
        else if ("YD201".equals(model)) { return "Yota Devices YotaPhone2"; }
        else if ("YBMK01".equals(model)) { return "iRiver Wow(Window of the world)"; }
        else if ("YPY_AB7DC".equals(model)) { return "Positivo AB7D"; }
        else if ("YPY_TQ7".equals(model)) { return "Positivo Ypy TQ7"; }
        else if ("YPY_AB7K".equals(model)) { return "Positivo Ypy AB7K"; }
        else if ("YPY_S450".equals(model)) { return "Positivo Ypy S450"; }
        else if ("Y511-T00".equals(model)) { return "Huawei Y511-T00"; }
        else if ("Y230".equals(model)) { return "Positivo BGH Y230"; }
        else if ("Y220-U00".equals(model)) { return "Huawei Y220"; }
        else if ("Yupiroid".equals(model)) { return "Hipstreet Yupiroid"; }
        else if ("YP-G50".equals(model)) { return "Samsung Galaxy Player 50"; }
        else if ("YU5050".equals(model)) { return "Micromax Yutopia"; }
        else if ("Y635-L02".equals(model)) { return "Huawei Y635-L02"; }
        else if ("Y635-L03".equals(model)) { return "Huawei Y635-L03"; }
        else if ("YP-GP1".equals(model)) { return "Samsung Galaxy Player 5.8"; }
        else if ("YPY_AB10D".equals(model)) { return "Positivo Ypy AB10"; }
        else if ("YP-G70".equals(model)) { return "Samsung Galaxy Player 5"; }
        else if ("Y220-U17".equals(model)) { return "Huawei Y220"; }
        else if ("Y220-U10".equals(model)) { return "Huawei Y220-U10"; }
        else if ("Y1000".equals(model)) { return "Positivo Y1000"; }
        else if ("YU5010".equals(model)) { return "YUPHORIA"; }
        else if ("YPY_AB7D".equals(model)) { return "Positivo AB7"; }
        return "";

    }
    public static String xMethod (String model) {
        if ("X400".equals(model)) { return "Positivo X400"; }
        else if ("XT1564".equals(model)) { return "Motorola Droid Maxx 2"; }
        else if ("XT1565".equals(model)) { return "Motorola Droid Maxx 2"; }
        else if ("XT1562".equals(model)) { return "Motorola Moto X Play"; }
        else if ("XT1563".equals(model)) { return "Motorola Moto X Play"; }
        else if ("XR6P10".equals(model)) { return "Vizio XR6P10"; }
        else if ("X55".equals(model)) { return "Ashna X55"; }
        else if ("XT1098".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1092".equals(model)) { return "Motorola MOTO X"; }
        else if ("XT1093".equals(model)) { return "Motorola MOTO X"; }
        else if ("XT1096".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1097".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1094".equals(model)) { return "Motorola MOTO X"; }
        else if ("XT1095".equals(model)) { return "Motorola Moto X"; }
        else if ("X06HT".equals(model)) { return "HTC Desire"; }
        else if ("X75".equals(model)) { return "QMobile X75"; }
        else if ("X8607".equals(model)) { return "ZTE Blade L3"; }
        else if ("X500".equals(model)) { return "ZTE X500"; }
        else if ("X50D".equals(model)) { return "TCT (Alcatel) X50D"; }
        else if ("XT1526".equals(model)) { return "Motorola Moto E"; }
        else if ("XL39h".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("X2_Soul_Mini".equals(model)) { return "AllView X2 Soul Mini"; }
        else if ("XT1058".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1056".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1055".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1052".equals(model)) { return "Moto X"; }
        else if ("XT1053".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1050".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1078".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT1079".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1072".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT1077".equals(model)) { return "Motorola Moto G with 4G LTE (2nd Gen)"; }
        else if ("XT555C".equals(model)) { return "Motorola Moto Defy XT"; }
        else if ("X35E".equals(model)) { return "TCT (Alcatel) X35E"; }
        else if ("XT910".equals(model)) { return "Motorola Droid RAZR"; }
        else if ("X35T".equals(model)) { return "Auchan Selecline X35T"; }
        else if ("XT621".equals(model)) { return "Motorola Master Touch XT621"; }
        else if ("XT627".equals(model)) { return "Motorola XT627"; }
        else if ("XT626".equals(model)) { return "Motorola Motoluxe"; }
        else if ("XT919".equals(model)) { return "Motorola RAZR D3"; }
        else if ("Xolo_X500".equals(model)) { return "Intel Xolo X500"; }
        else if ("XT1019".equals(model)) { return "Motorola Moto E"; }
        else if ("XT605".equals(model)) { return "Motorola XT605"; }
        else if ("XT1225".equals(model)) { return "Motorola Moto Turbo"; }
        else if ("XT1039".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1034".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1030".equals(model)) { return "Motorola Droid Mini"; }
        else if ("XT1031".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1032".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1033".equals(model)) { return "Motorola Moto G"; }
        else if ("X10a".equals(model)) { return "Sony Ericsson Xperia X10"; }
        else if ("X9180".equals(model)) { return "ZTE X9180"; }
        else if ("X2_Soul_Lite_TM".equals(model)) { return "AllView X2 Soul Lite"; }
        else if ("XT890".equals(model)) { return "MOTOROLA RAZR i"; }
        else if ("XT897".equals(model)) { return "Motorola Photo Q"; }
        else if ("XT830C".equals(model)) { return "Motorola MOTO E"; }
        else if ("X-tremer".equals(model)) { return "WIKO DARKNIGHT"; }
        else if ("XT687".equals(model)) { return "Motorola Motoluxe"; }
        else if ("XT685".equals(model)) { return "Motorola Motoluxe"; }
        else if ("XT682".equals(model)) { return "Motorola Motoluxe"; }
        else if ("X9009".equals(model)) { return "Oppo X9009"; }
        else if ("X9006".equals(model)) { return "OPPO X9006"; }
        else if ("X9007".equals(model)) { return "OPPO X9007"; }
        else if ("X9000".equals(model)) { return "Oppo X9000"; }
        else if ("XT916".equals(model)) { return "Motorola RAZR D1"; }
        else if ("XT915".equals(model)) { return "Motorola RAZR D1"; }
        else if ("XT914".equals(model)) { return "Motorola RAZR D1"; }
        else if ("XT918".equals(model)) { return "Motorola RAZR D1"; }
        else if ("X2_Soul_Style".equals(model)) { return "AllView X2 Soul Style"; }
        else if ("XCD35".equals(model)) { return "ZTE Blade"; }
        else if ("XT390".equals(model)) { return "Motorola Motosmart"; }
        else if ("XT535".equals(model)) { return "Motorola Moto Defy XT"; }
        else if ("XT937C".equals(model)) { return "Motorola Moto G"; }
        else if ("X909".equals(model)) { return "Oppo X909"; }
        else if ("X900".equals(model)) { return "Foxconn XOLO"; }
        else if ("XT702".equals(model)) { return "Motorola Droid"; }
        else if ("XT701".equals(model)) { return "Motorola Droid"; }
        else if ("XT1025".equals(model)) { return "Motorola Moto E"; }
        else if ("XT720".equals(model)) { return "Motorola Motoroi"; }
        else if ("X27".equals(model)) { return "IRULU X27"; }
        else if ("XT1528".equals(model)) { return "Motorola Moto E"; }
        else if ("XT897S".equals(model)) { return "Motorola Photon"; }
        else if ("XT557".equals(model)) { return "Motorola Moto Defy XT"; }
        else if ("XT556".equals(model)) { return "Motorola Moto Defy XT"; }
        else if ("XT1575".equals(model)) { return "Motorola Moto X Style"; }
        else if ("XT1570".equals(model)) { return "Motorola Moto X Style"; }
        else if ("XT1572".equals(model)) { return "Motorola Moto X Style"; }
        else if ("X66".equals(model)) { return "Ashna X66"; }
        else if ("XP6700".equals(model)) { return "Sonimtech XP6"; }
        else if ("XT1080".equals(model)) { return "Motorola Droid Ultra"; }
        else if ("XT1085".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1528O".equals(model)) { return "Motorola Moto E"; }
        else if ("XR6M10".equals(model)) { return "Vizio XR6M10"; }
        else if ("X300".equals(model)) { return "Aikun RX300"; }
        else if ("XT0000".equals(model)) { return "Motorola MOTO E"; }
        else if ("X2_Soul_Xtreme".equals(model)) { return "AllView X2 Soul Xtreme"; }
        else if ("XT1049".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1045".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1042".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT800".equals(model)) { return "Motorola Glam XT800"; }
        else if ("X3_Soul_PRO".equals(model)) { return "AllView X3 Soul Pro"; }
        else if ("XT615".equals(model)) { return "Motorola Motoluxe"; }
        else if ("X3_Soul".equals(model)) { return "AllView X3Soul"; }
        else if ("X9".equals(model)) { return "USA111 IRULU X9"; }
        else if ("X3".equals(model)) { return "Lava X3"; }
        else if ("X1".equals(model)) { return "Moxee Technologies X1"; }
        else if ("X7".equals(model)) { return "USA111 Irulu X7"; }
        else if ("X4".equals(model)) { return "NUU X4"; }
        else if ("XT1250".equals(model)) { return "Motorola DROID Turbo"; }
        else if ("XT1254".equals(model)) { return "Motorola Droid Turbo"; }
        else if ("X9009fw".equals(model)) { return "Oppo X9009fw"; }
        else if ("X2_Soul_Style_Plus".equals(model)) { return "AllView X2 Soul Style+"; }
        else if ("XT1064".equals(model)) { return "Moto G"; }
        else if ("XT1063".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT1060".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1069".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1068".equals(model)) { return "Motorola Moto G"; }
        else if ("X909T".equals(model)) { return "Oppo X909"; }
        else if ("X3_Soul_mini".equals(model)) { return "AllView X3 Soul mini"; }
        else if ("X4508".equals(model)) { return "Lazer X4508"; }
        else if ("X2_Soul_Lite".equals(model)) { return "AllView X2 Soul Lite"; }
        else if ("X10i".equals(model)) { return "Sony Ericsson Xperia X10"; }
        else if ("X100".equals(model)) { return "Moxee Technologies X100"; }
        else if ("XT1003".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT1002".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT1008".equals(model)) { return "Motorola Moto G"; }
        else if ("XT610".equals(model)) { return "Motorola Droid Pro"; }
        else if ("XT611".equals(model)) { return "Motorola Motoluxe"; }
        else if ("XT1028".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1023".equals(model)) { return "Motorola Moto E"; }
        else if ("XT1022".equals(model)) { return "Motorola Moto E"; }
        else if ("XT1021".equals(model)) { return "Motorola Moto X Play"; }
        else if ("X600".equals(model)) { return "Letv x600"; }
        else if ("XT881".equals(model)) { return "MOTOROLA ELECTRIFY 2"; }
        else if ("XT885".equals(model)) { return "Motorola Razr V"; }
        else if ("XT886".equals(model)) { return "Motorola Razr V"; }
        else if ("XT303".equals(model)) { return "Motorola Motosmart"; }
        else if ("XT300".equals(model)) { return "Motorola Spice"; }
        else if ("XT301".equals(model)) { return "Motorola Citrus"; }
        else if ("XT305".equals(model)) { return "Motorola Motosmart"; }
        else if ("XT320".equals(model)) { return "Motorola Defy Mini"; }
        else if ("XT920".equals(model)) { return "Motorola RAZR D3"; }
        else if ("XT925".equals(model)) { return "Motorola DROID RAZR HD"; }
        else if ("X40E".equals(model)) { return "Enspert Lazer X40E"; }
        else if ("XP7700".equals(model)) { return "Sonimtech XP7705"; }
        else if ("XT901".equals(model)) { return "Motorola Electrify M"; }
        else if ("XT907".equals(model)) { return "Motorola Droid Razr M"; }
        else if ("X2_Soul_Style_TM".equals(model)) { return "AllView X2 Soul Style"; }
        else if ("XT321".equals(model)) { return "Motorola Defy Mini"; }
        else if ("XT389".equals(model)) { return "Motorola Motosmart"; }
        else if ("X9079".equals(model)) { return "Oppo X9079"; }
        else if ("X9077".equals(model)) { return "Oppo X9077"; }
        else if ("X9076".equals(model)) { return "OPPO X9076"; }
        else if ("X9070".equals(model)) { return "OPPO X9070"; }
        else if ("X18".equals(model)) { return "iRulu X18"; }
        else if ("X10".equals(model)) { return "Moxee Technologies X10"; }
        else if ("X11".equals(model)) { return "Lava X11"; }
        else if ("XDP-100R".equals(model)) { return "Pioneer XDP-100R"; }
        else if ("XT939G".equals(model)) { return "Motorola Moto G"; }
        else if ("Xoom".equals(model)) { return "Motorola Xoom"; }
        else if ("X2_Soul_PRO".equals(model)) { return "AllView X2 Soul PRO"; }
        else if ("XT1585".equals(model)) { return "Motorola Droid Turbo 2"; }
        else if ("XT1580".equals(model)) { return "Motorola Moto X Force"; }
        else if ("XT1581".equals(model)) { return "Motorola Moto X Force"; }
        else if ("x600".equals(model)) { return "LeTV Le1"; }
        else if ("XT560".equals(model)) { return "Motorola Defy Pro"; }
        return "";

    }
    public static String zMethod (String model) {
        if ("Z120".equals(model)) { return "Acer Z120"; }
        else if ("Z787".equals(model)) { return "ZTE Z787"; }
        else if ("ZKB2A".equals(model)) { return "ZTE Spro 2"; }
        else if ("Z667".equals(model)) { return "ZTE Z667"; }
        else if ("ZTE-LINK".equals(model)) { return "ZTE Racer"; }
        else if ("Zero_Spin".equals(model)) { return "Vitsmo Zero Spin"; }
        else if ("Z850".equals(model)) { return "ZTE Z850"; }
        else if ("Z500".equals(model)) { return "Acer Liquid Z500"; }
        else if ("Z818L".equals(model)) { return "ZTE Z818L"; }
        else if ("Z520".equals(model)) { return "Acer Liquid Z520"; }
        else if ("Z828TL".equals(model)) { return "ZTE Z828"; }
        else if ("Z958".equals(model)) { return "ZTE Z958"; }
        else if ("Z959".equals(model)) { return "ZTE Z959"; }
        else if ("Z796C".equals(model)) { return "ZTE Z796C"; }
        else if ("Z750C".equals(model)) { return "ZTE Z750C"; }
        else if ("Z930L".equals(model)) { return "ZTE Z930L"; }
        else if ("Z12".equals(model)) { return "QMobile Z12"; }
        else if ("Z970".equals(model)) { return "ZTE ZMax"; }
        else if ("Z963U".equals(model)) { return "ZTE Z963U"; }
        else if ("Z768G".equals(model)) { return "ZTE Z768G"; }
        else if ("Z933".equals(model)) { return "ZTE Z933"; }
        else if ("ZTE-RACER".equals(model)) { return "ZTE Racer"; }
        else if ("Z740".equals(model)) { return "ZTE Z740"; }
        else if ("Z660G".equals(model)) { return "ZTE Z660G"; }
        else if ("Z667T".equals(model)) { return "ZTE Z667T"; }
        else if ("Z200".equals(model)) { return "Acer Liquid Z200"; }
        else if ("Z205".equals(model)) { return "Acer Liquid Z205"; }
        else if ("ZTE-Z990".equals(model)) { return "ZTE-Z990"; }
        else if ("Z665C".equals(model)) { return "ZTE Z665C"; }
        else if ("Z992".equals(model)) { return "ZTE Z992"; }
        else if ("Z993".equals(model)) { return "ZTE Z993"; }
        else if ("Z995".equals(model)) { return "ZTE Z995"; }
        else if ("Z220".equals(model)) { return "Acer Liquid Z220"; }
        else if ("Z998".equals(model)) { return "ZTE Z998"; }
        else if ("Z716BL".equals(model)) { return "ZTE Z716BL"; }
        else if ("Z936L".equals(model)) { return "ZTE Z936L"; }
        else if ("Z740G".equals(model)) { return "ZTE Z740G"; }
        else if ("Z205P".equals(model)) { return "Acer Liquid Z205"; }
        else if ("Z962BL".equals(model)) { return "ZTE Z962BL"; }
        else if ("Z980L".equals(model)) { return "ZTE Z980L"; }
        else if ("Z150".equals(model)) { return "Acer Liquid Z5"; }
        else if ("Z791G".equals(model)) { return "ZTE Z791G"; }
        else if ("Z410".equals(model)) { return "Acer Liquid Z410"; }
        else if ("Z826".equals(model)) { return "ZTE Z826"; }
        else if ("Z820".equals(model)) { return "ZTE Z820"; }
        else if ("Zilo".equals(model)) { return "Zilo"; }
        else if ("Z110".equals(model)) { return "Acer Z110"; }
        else if ("Z752C".equals(model)) { return "ZTE Z752C"; }
        else if ("Z130".equals(model)) { return "Acer Liquid Z3"; }
        else if ("Z792".equals(model)) { return "ZTE Z792"; }
        else if ("ZT-701".equals(model)) { return "AtGames-zooti ZOOTI PAD ZT-701"; }
        else if ("Zeus".equals(model)) { return "Sony Ericsson Xperia Play"; }
        else if ("Z955L".equals(model)) { return "ZTE Z955L"; }
        else if ("ZTE-Libra".equals(model)) { return "ZTE Blade"; }
        else if ("ZTE-V856".equals(model)) { return "ZTE-V856"; }
        else if ("Z819L".equals(model)) { return "ZTE Z819L"; }
        else if ("ZTE-BLADE".equals(model)) { return "ZTE-BLADE"; }
        else if ("Z753G".equals(model)) { return "ZTE Z753G"; }
        else if ("Z730".equals(model)) { return "ZTE Z730"; }
        else if ("Zenith".equals(model)) { return "AG Mobile Zenith"; }
        else if ("Z797C".equals(model)) { return "ZTE Z797C"; }
        else if ("Zoom".equals(model)) { return "AG Mobile Zoom"; }
        else if ("ZTE-SKATE".equals(model)) { return "ZTE-SKATE"; }
        else if ("Z968".equals(model)) { return "ZTE Uhura"; }
        else if ("Z795G".equals(model)) { return "ZTE Z795G"; }
        else if ("ZTE-X500".equals(model)) { return "ZTE-X500"; }
        else if ("Z777".equals(model)) { return "ZTE Z777"; }
        else if ("ZTE-LIBRA".equals(model)) { return "ZTE Blade"; }
        else if ("Z793C".equals(model)) { return "ZTE Z793C"; }
        else if ("Z828".equals(model)) { return "ZTE Z828"; }
        else if ("Z755".equals(model)) { return "ZTE Z755"; }
        else if ("Z00D".equals(model)) { return "Asus ZenFone 2 (ZE500CL)"; }
        else if ("Z8".equals(model)) { return "NUU Z8"; }
        else if ("Z1".equals(model)) { return "ZUK Z1"; }
        else if ("Zio".equals(model)) { return "Kyocera zio"; }
        else if ("Z987".equals(model)) { return "ZTE Z987"; }
        else if ("Z988".equals(model)) { return "ZTE Grand X Max 2"; }
        else if ("ZTE-N910".equals(model)) { return "ZTE-N910"; }
        else if ("ZTE_V5".equals(model)) { return "ZTE NE501J"; }
        else if ("Z600".equals(model)) { return "Ashna Z600"; }
        else if ("ZTE-Z990G".equals(model)) { return "ZTE-Z990G"; }
        else if ("Z160".equals(model)) { return "Acer Liquid Z4"; }
        else if ("Z832".equals(model)) { return "ZTE Z832"; }
        else if ("Z831".equals(model)) { return "ZTE Chapel"; }
        else if ("Z830".equals(model)) { return "ZTE Z830"; }
        else if ("Z963VL".equals(model)) { return "ZTE Z963VL"; }
        else if ("Z815".equals(model)) { return "ZTE Fanfare 2"; }
        else if ("Z813".equals(model)) { return "ZTE Z813"; }
        else if ("Z812".equals(model)) { return "ZTE Z812"; }
        else if ("ZTE-V6500".equals(model)) { return "ZTE-V6500"; }
        else if ("Z932L".equals(model)) { return "ZTE Z932L"; }
        return "";

    }
    public static String otherMethod (String model) {
        if ("7048A".equals(model)) { return "TCT (Alcatel) Go PLAY"; }
        else if ("7048X".equals(model)) { return "TCT (Alcatel) Go PLAY"; }
        else if ("7048S".equals(model)) { return "TCT (Alcatel) Go PLAY"; }
        else if ("9010X".equals(model)) { return "TCT (Alcatel) 9010X"; }
        else if ("800P31C".equals(model)) { return "Mecer 800P31C"; }
        else if ("8DTB40".equals(model)) { return "Hipstreet Electron 2"; }
        else if ("9DTB38".equals(model)) { return "Hipstreet 9DTB38"; }
        else if ("9DTB39".equals(model)) { return "Hipstreet 9DTB39"; }
        else if ("7048W".equals(model)) { return "TCT (Alcatel) Go PLAY"; }
        else if ("0PAJ5".equals(model)) { return "HTC One (E8)"; }
        else if ("009Z".equals(model)) { return "ZTE 009Z"; }
        else if ("41EA04".equals(model)) { return "Sanyo Benesse"; }
        else if ("6044D".equals(model)) { return "TCT (Alcatel) 6044D"; }
        else if ("8053".equals(model)) { return "TCT (Alcatel) 8053"; }
        else if ("8057".equals(model)) { return "TCT (Alcatel) 8057"; }
        else if ("8056".equals(model)) { return "TCT (Alcatel) 8056"; }
        else if ("8054".equals(model)) { return "TCT (Alcatel) 8054"; }
        else if ("5045X".equals(model)) { return "TCT (Alcatel) ALCATEL PIXI 4 (5)"; }
        else if ("4013M".equals(model)) { return "TCT (Alcatel) 4013M"; }
        else if ("5045I".equals(model)) { return "TCT (Alcatel) ALCATEL PIXI 4 (5)"; }
        else if ("5045G".equals(model)) { return "TCT (Alcatel) ALCATEL PIXI 4 (5)"; }
        else if ("5045D".equals(model)) { return "TCT (Alcatel) ALCATEL PIXI 4 (5)"; }
        else if ("785TB4".equals(model)) { return "Hipstreet 785TB4"; }
        else if ("3005".equals(model)) { return "Oppo 3005"; }
        else if ("3007".equals(model)) { return "Oppo 3007"; }
        else if ("3006".equals(model)) { return "Oppo 3006"; }
        else if ("3001".equals(model)) { return "Oppo 3001"; }
        else if ("3000".equals(model)) { return "Oppo 3000"; }
        else if ("3008".equals(model)) { return "Oppo 3008"; }
        else if ("5015D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)"; }
        else if ("5015E".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)"; }
        else if ("5015A".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)"; }
        else if ("5015X".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)"; }
        else if ("831C".equals(model)) { return "HTC One M8"; }
        else if ("9920".equals(model)) { return "Star Alps S9920"; }
        else if ("6042D".equals(model)) { return "TCT (Alcatel) 6042D"; }
        else if ("8079".equals(model)) { return "TCT (Alcatel) 8079"; }
        else if ("8070".equals(model)) { return "TCT (Alcatel) 8070"; }
        else if ("5017D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (4.5)"; }
        else if ("5017E".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (4.5)"; }
        else if ("5017A".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (4.5)"; }
        else if ("778TPC".equals(model)) { return "IView 778TPC"; }
        else if ("10DTB12A".equals(model)) { return "Hipstreet HS-10DTB12A"; }
        else if ("710C".equals(model)) { return "HTC 710C"; }
        else if ("401SH".equals(model)) { return "Sharp 401SH"; }
        else if ("001DL".equals(model)) { return "Dell Streak"; }
        else if ("401SO".equals(model)) { return "Sony Xperia Z3"; }
        else if ("5860E".equals(model)) { return "Coolpad Quattro 4G"; }
        else if ("6039A".equals(model)) { return "TCT (Alcatel) 6039A"; }
        else if ("6039K".equals(model)) { return "TCT (Alcatel) 6039K"; }
        else if ("6039J".equals(model)) { return "TCT (Alcatel) 6039J"; }
        else if ("6039H".equals(model)) { return "TCT (Alcatel) 6039H"; }
        else if ("6039S".equals(model)) { return "TCT (Alcatel) 6039S"; }
        else if ("6039Y".equals(model)) { return "TCT (Alcatel) 6039Y"; }
        else if ("0PM92".equals(model)) { return "HTC Desire 626s"; }
        else if ("6016D".equals(model)) { return "TCT (Alcatel) 6016D"; }
        else if ("6016A".equals(model)) { return "TCT (Alcatel) 6010A"; }
        else if ("201M".equals(model)) { return "MOTOROLA RAZR M"; }
        else if ("201K".equals(model)) { return "Kyocera Honeybee Touch"; }
        else if ("9021A".equals(model)) { return "TCT (Alcatel) 9021A"; }
        else if ("7050Y".equals(model)) { return "TCT (Alcatel) POP S9"; }
        else if ("4028J".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("4028A".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("4028E".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("306SH".equals(model)) { return "Sharp 306SH"; }
        else if ("4028S".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("305SH".equals(model)) { return "Sharp SoftBank 305SH"; }
        else if ("10DTB10".equals(model)) { return "Hipstreet Phantom"; }
        else if ("6037K".equals(model)) { return "TCT (Alcatel) 6037K"; }
        else if ("6037B".equals(model)) { return "TCT (Alcatel) 6037B"; }
        else if ("6037Y".equals(model)) { return "TCT (Alcatel) 6037Y"; }
        else if ("55AX600C".equals(model)) { return "Panasonic 55AX600C"; }
        else if ("001HT".equals(model)) { return "HTC Desire HD"; }
        else if ("9002W".equals(model)) { return "TCT (Alcatel) 9002W"; }
        else if ("9002X".equals(model)) { return "TCT (Alcatel) 9002X"; }
        else if ("9002A".equals(model)) { return "TCT (Alcatel) 9002A"; }
        else if ("9003X".equals(model)) { return "TCT (Alcatel) 9003X"; }
        else if ("5054X".equals(model)) { return "TCT (Alcatel) 5054X"; }
        else if ("2014501".equals(model)) { return "Xiaomi HM 1SLTETD"; }
        else if ("2014502".equals(model)) { return "Xiaomi HM 2A"; }
        else if ("4034G".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 4 (4)"; }
        else if ("201F".equals(model)) { return "Fujitsu ARROWS A SoftBank 201F"; }
        else if ("402SH".equals(model)) { return "Sharp AQUOS CRYSTAL X"; }
        else if ("4035D".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("403SC".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("403SH".equals(model)) { return "Sharp AQUOS CRYSTAL 2"; }
        else if ("4018X".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4018A".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4018D".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4018E".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4018F".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4018M".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4036E".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("2PQ93".equals(model)) { return "HTC One A9"; }
        else if ("4016D".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4015X"; }
        else if ("9006W".equals(model)) { return "TCT (Alcatel) 9006W"; }
        else if ("503SH".equals(model)) { return "Sharp AQUOS Xx2 mini"; }
        else if ("4009K".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("2014011".equals(model)) { return "Xiaomi HM 1STD"; }
        else if ("5050A".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("5050Y".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("5050X".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("5050S".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("502SH".equals(model)) { return "Sharp AQUOS Xx2"; }
        else if ("7DTB41".equals(model)) { return "Hipstreet Micron"; }
        else if ("101N".equals(model)) { return "NEC MEDIAS CH 101N"; }
        else if ("101K".equals(model)) { return "Kyocera HONEY BEE"; }
        else if ("101F".equals(model)) { return "Fujitsu ARROWS A SoftBank 101F"; }
        else if ("101P".equals(model)) { return "Panasonic 101P"; }
        else if ("4032D".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("4032E".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("4032X".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("4014E".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("4014A".equals(model)) { return "TCT (Alcatel) 4014A"; }
        else if ("4014M".equals(model)) { return "TCT (Alcatel) 4014M"; }
        else if ("4Game".equals(model)) { return "Explay 4Game"; }
        else if ("0PJA10".equals(model)) { return "HTC One M9"; }
        else if ("48AX600C".equals(model)) { return "Panasonic 48AX600C"; }
        else if ("31TL04".equals(model)) { return "Sanyo Benesse"; }
        else if ("8080".equals(model)) { return "TCT (Alcatel) 8080"; }
        else if ("404SH".equals(model)) { return "Sharp AQUOS Xx"; }
        else if ("404SC".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("5054S".equals(model)) { return "TCT (Alcatel) 5054S"; }
        else if ("5054T".equals(model)) { return "TCT (Alcatel) 5054T"; }
        else if ("5054W".equals(model)) { return "TCT (Alcatel) 5054W"; }
        else if ("1206".equals(model)) { return "Oppo 1206"; }
        else if ("1201".equals(model)) { return "OPPO 1201"; }
        else if ("5054A".equals(model)) { return "TCT (Alcatel) 5054A"; }
        else if ("5054D".equals(model)) { return "TCT (Alcatel) 5054D"; }
        else if ("8050X".equals(model)) { return "TCT (Alcatel) 8050X"; }
        else if ("8050D".equals(model)) { return "TCT (Alcatel) 8050D"; }
        else if ("8050E".equals(model)) { return "TCT (Alcatel) 8050E"; }
        else if ("8050G".equals(model)) { return "TCT (Alcatel) 8050G"; }
        else if ("4034D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 4 (4)"; }
        else if ("6050F".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("6050A".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("6050Y".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("6050W".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("7043Y".equals(model)) { return "TCT (Alcatel) POP 2 (5)"; }
        else if ("7043A".equals(model)) { return "TCT (Alcatel) POP 2 (5)"; }
        else if ("7043K".equals(model)) { return "TCT (Alcatel) POP 2 (5)"; }
        else if ("302HW".equals(model)) { return "Huawei P6S-L04"; }
        else if ("7DTB25".equals(model)) { return "Hipstreet 7DTB25"; }
        else if ("788TPCII".equals(model)) { return "IView 788TPCII"; }
        else if ("776TPCIII".equals(model)) { return "iView 776TPCIII"; }
        else if ("8744".equals(model)) { return "Spectralink 8744"; }
        else if ("2014813".equals(model)) { return "Xiaomi HM 2LTE-CMCC"; }
        else if ("402SO".equals(model)) { return "Sony Xperia Z4"; }
        else if ("5042G".equals(model)) { return "TCT (Alcatel) POP2 (4.5)"; }
        else if ("5042D".equals(model)) { return "TCT (Alcatel) POP 2"; }
        else if ("5042A".equals(model)) { return "TCT (Alcatel) POP 2"; }
        else if ("5042X".equals(model)) { return "TCT (Alcatel) POP 2"; }
        else if ("5042W".equals(model)) { return "TCT (Alcatel) POP2 (4.5)"; }
        else if ("5042T".equals(model)) { return "TCT (Alcatel) 5042T"; }
        else if ("7045Y".equals(model)) { return "TCT (Alcatel) 7045Y"; }
        else if ("8055".equals(model)) { return "TCT (Alcatel) 8055"; }
        else if ("920TPC".equals(model)) { return "IView 920TPC"; }
        else if ("4009M".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009A".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009F".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009E".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009X".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009S".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("6045B".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)"; }
        else if ("2014812".equals(model)) { return "Xiaomi HM 2LTE-CT"; }
        else if ("2014811".equals(model)) { return "Xiaomi HM 2LTE-CU"; }
        else if ("2014817".equals(model)) { return "Xiaomi HM 2LTE-SA"; }
        else if ("2014819".equals(model)) { return "Xiaomi HM 2LTE-BR"; }
        else if ("2014818".equals(model)) { return "Xiaomi HM 2LTE-IN"; }
        else if ("301F".equals(model)) { return "Fujitsu ARROWS A SoftBank 301F"; }
        else if ("8DTB38".equals(model)) { return "Hipstreet Electron"; }
        else if ("403HW".equals(model)) { return "HUAWEI MediaPad M1 8.0"; }
        else if ("6045Y".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)"; }
        else if ("6045O".equals(model)) { return "TCT (Alcatel) Nitro"; }
        else if ("6045I".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)"; }
        else if ("6045K".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)"; }
        else if ("6045F".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)"; }
        else if ("8063".equals(model)) { return "TCT (Alcatel) 8063"; }
        else if ("1107".equals(model)) { return "Oppo 1107"; }
        else if ("1105".equals(model)) { return "Oppo 1105"; }
        else if ("1100".equals(model)) { return "Oppo 1100"; }
        else if ("9015W".equals(model)) { return "TCT (Alcatel) 9015W"; }
        else if ("4027X".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("4027N".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("4027A".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("4027D".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("9001D".equals(model)) { return "TCT (Alcatel) 9001D"; }
        else if ("6043A".equals(model)) { return "TCT (Alcatel) 6043A"; }
        else if ("6043D".equals(model)) { return "TCT (Alcatel) 6043D"; }
        else if ("11DTB1".equals(model)) { return "Hipstreet Synergy"; }
        else if ("202F".equals(model)) { return "Fujitsu ARROWS A SoftBank 202F"; }
        else if ("7055A".equals(model)) { return "TCT (Alcatel) Hero2C"; }
        else if ("202K".equals(model)) { return "Kyocera DIGNO R"; }
        else if ("80-1".equals(model)) { return "Gigaset Maxwell-10"; }
        else if ("6014X".equals(model)) { return "TCT (Alcatel) 6014X"; }
        else if ("502ZT".equals(model)) { return "ZTE Spro 2"; }
        else if ("4017F".equals(model)) { return "TCT (Alcatel) PIXI4 (3.5)"; }
        else if ("402LG".equals(model)) { return "LGE Spray"; }
        else if ("7D-501u".equals(model)) { return "HUAWEI MediaPad X1 7.0"; }
        else if ("6016E".equals(model)) { return "TCT (Alcatel) 6016E"; }
        else if ("6016X".equals(model)) { return "TCT (Alcatel) 6016X"; }
        else if ("9003A".equals(model)) { return "TCT (Alcatel) 9003A"; }
        else if ("4035Y".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("4035X".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("4035A".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("501LV".equals(model)) { return "Lenovo Softbank 501LV"; }
        else if ("825_T-Mobile".equals(model)) { return "Doro Liberto 825"; }
        else if ("9020A".equals(model)) { return "TCT (Alcatel) 9020A"; }
        else if ("4003J".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("4003A".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("9788".equals(model)) { return "Gigabyte 9788"; }
        else if ("6036A".equals(model)) { return "TCT (Alcatel) Idol2 MINI S"; }
        else if ("6036X".equals(model)) { return "TCT (Alcatel) Idol2 MINI S"; }
        else if ("6036Y".equals(model)) { return "TCT (Alcatel) Idol2 MINI S"; }
        else if ("9001X".equals(model)) { return "TCT (Alcatel) 9001X"; }
        else if ("304SH".equals(model)) { return "Sharp AQUOS Xx 304SH"; }
        else if ("402HW".equals(model)) { return "HUAWEI MediaPad 10 Link+"; }
        else if ("9022X".equals(model)) { return "TCT (Alcatel) ONETOUCH PIXI 3 (8)"; }
        else if ("5025X".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)"; }
        else if ("5016A".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)"; }
        else if ("5025E".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)"; }
        else if ("5025D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)"; }
        else if ("5025G".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)"; }
        else if ("5070D".equals(model)) { return "TCT (Alcatel) 5070D"; }
        else if ("5016J".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)"; }
        else if ("14A-DA".equals(model)) { return "Honda A-DA"; }
        else if ("9007X".equals(model)) { return "TCT (Alcatel) ONETOUCH PIXI3(7)"; }
        else if ("9007A".equals(model)) { return "TCT (Alcatel) ONETOUCH PIXI3(7)"; }
        else if ("4017X".equals(model)) { return "TCT (Alcatel) PIXI4 (3.5)"; }
        else if ("4017A".equals(model)) { return "TCT (Alcatel) PIXI4 (3.5)"; }
        else if ("404KC".equals(model)) { return "Kyocera 404KC"; }
        else if ("10DTB42".equals(model)) { return "Hipstreet Pilot"; }
        else if ("10DTB44".equals(model)) { return "Hipstreet Phantom2"; }
        else if ("0PCV1".equals(model)) { return "HTC Desire 510"; }
        else if ("5098S".equals(model)) { return "TCT (Alcatel) 5098S"; }
        else if ("9005X".equals(model)) { return "TCT (Alcatel) 9005X"; }
        else if ("4033L".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("4045O".equals(model)) { return "TCT (Alcatel) POP2 (4)"; }
        else if ("4045L".equals(model)) { return "TCT (Alcatel) POP2 (4)"; }
        else if ("4045A".equals(model)) { return "TCT (Alcatel) POP2 (4)"; }
        else if ("4045D".equals(model)) { return "TCT (Alcatel) POP2 (4)"; }
        else if ("4045X".equals(model)) { return "TCT (Alcatel) POP2 (4)"; }
        else if ("4013E".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("4013D".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("4013K".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("4013J".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("4013X".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("302KC".equals(model)) { return "Kyocera DIGNO T"; }
        else if ("40TL04".equals(model)) { return "Sanyo Benesse"; }
        else if ("2013023".equals(model)) { return "Xiaomi China"; }
        else if ("2013022".equals(model)) { return "Xiaomi Hong Mi"; }
        else if ("102P".equals(model)) { return "Panasonic 102P"; }
        else if ("402ZT".equals(model)) { return "ZTE 402ZT"; }
        else if ("7040T".equals(model)) { return "TCT (Alcatel) 7040T"; }
        else if ("7040R".equals(model)) { return "TCT (Alcatel) 7040R"; }
        else if ("10.1Myros".equals(model)) { return "Vestel VP100+"; }
        else if ("7040N".equals(model)) { return "Alcatel One Touch Fierce 2"; }
        else if ("7DTB37".equals(model)) { return "Hipstreet 7DTB37"; }
        else if ("5019D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (4.5)"; }
        else if ("501SO".equals(model)) { return "Sony Xperia Z5"; }
        else if ("8030B".equals(model)) { return "TCT (Alcatel) 8030B"; }
        else if ("8030Y".equals(model)) { return "TCT (Alcatel) 8030Y"; }
        else if ("6070K".equals(model)) { return "TCT (Alcatel) IDOL 4S"; }
        else if ("6055K".equals(model)) { return "TCT (Alcatel) 6055K"; }
        else if ("7044X".equals(model)) { return "TCT (Alcatel) POP 2 (5)"; }
        else if ("7044A".equals(model)) { return "TCT (Alcatel) POP 2 (5)"; }
        else if ("503HW".equals(model)) { return "Huawei ALE-L02"; }
        else if ("800P71D".equals(model)) { return "Mecer 800P71D"; }
        else if ("4035X_Orange".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("204HW".equals(model)) { return "Huawei hw204HW"; }
        else if ("003Z".equals(model)) { return "ZTE Blade"; }
        else if ("003P".equals(model)) { return "Panasonic 003P"; }
        else if ("5065A".equals(model)) { return "TCT (Alcatel) 5065A"; }
        else if ("5065D".equals(model)) { return "TCT (Alcatel) 5065D"; }
        else if ("5065X".equals(model)) { return "TCT (Alcatel) 5065X"; }
        else if ("5065W".equals(model)) { return "TCT (Alcatel) 5065W"; }
        else if ("5560S".equals(model)) { return "Coolpad CP5660S"; }
        else if ("5038A".equals(model)) { return "TCT (Alcatel) Soul 4.5"; }
        else if ("5038E".equals(model)) { return "TCT (Alcatel) Soul 4.5"; }
        else if ("5038D".equals(model)) { return "TCT (Alcatel) 5038D"; }
        else if ("5038X".equals(model)) { return "TCT (Alcatel) SOUL 4.5"; }
        else if ("801EM".equals(model)) { return "Coolpad 801EM"; }
        else if ("801ES".equals(model)) { return "Coolpad801ES"; }
        else if ("4032A".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("101P51C".equals(model)) { return "Mecer 101P51C"; }
        return "";

    }


    private DeviceNames() {
    }

}
