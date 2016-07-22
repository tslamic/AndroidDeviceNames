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

// Generated on 22 Jul 2016 09:54:12 with adn.py version 0.0.1
// Number of supported devices: 9580
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
        else if ("Agora 4G+".equals(model)) { return "BenQ Kogan 4G+"; }
        else if ("A1603".equals(model)) { return "Oppo A1603"; }
        else if ("A51".equals(model)) { return "Oppo A51"; }
        else if ("A52".equals(model)) { return "Lava A52"; }
        else if ("A54".equals(model)) { return "Micromax A54"; }
        else if ("A57".equals(model)) { return "Micromax A57"; }
        else if ("ARCHOS 40C TIv2".equals(model)) { return "Archos 40c Titanium"; }
        else if ("A5C".equals(model)) { return "TaiwanMobile A5C"; }
        else if ("ARCHOS 97 CARBON".equals(model)) { return "Archos 97 Carbon"; }
        else if ("A1601".equals(model)) { return "Oppo A1601"; }
        else if ("Archos 59 Titanium".equals(model)) { return "Archos 59 Titanium"; }
        else if ("Archos 80 Xenon".equals(model)) { return "Archos 80 Xenon"; }
        else if ("Atom".equals(model)) { return "Explay Atom"; }
        else if ("ARCHOS 101G10".equals(model)) { return "Archos 101 XS"; }
        else if ("ARCHOS 80 TITANIUM".equals(model)) { return "Archos 80 Titanium"; }
        else if ("AQT80".equals(model)) { return "Sprint Slate 8 Tablet"; }
        else if ("Agora 4G".equals(model)) { return "BenQ Agora 4G"; }
        else if ("Acer S100".equals(model)) { return "Acer Liquid"; }
        else if ("Archos 70c Titanium".equals(model)) { return "Archos 70c Titanium"; }
        else if ("Alcatel 7046T".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH Victory"; }
        else if ("ADR8995".equals(model)) { return "Pantech Apache"; }
        else if ("Archos 50e Helium".equals(model)) { return "Archos 50e Helium"; }
        else if ("A7101_X3_mini".equals(model)) { return "Gtel A7101_X3_mini"; }
        else if ("ARCHOS 97B TITANIUM".equals(model)) { return "Archos 97b Titanium"; }
        else if ("ALCATEL one touch D920".equals(model)) { return "TCT (Alcatel) one touch D920"; }
        else if ("ALCATEL A564C".equals(model)) { return "TCT (Alcatel) ALCATEL A564C"; }
        else if ("ALCATEL A564R".equals(model)) { return "TCT (Alcatel) ALCATEL A564R"; }
        else if ("AV7".equals(model)) { return "AV7"; }
        else if ("A110Q".equals(model)) { return "Micromax CANVAS 2 PLUS"; }
        else if ("Aquaris M5".equals(model)) { return "bq Aquaris M5"; }
        else if ("A53w".equals(model)) { return "Oppo A53w"; }
        else if ("Archos 70b Xenon".equals(model)) { return "Archos 70b Xenon"; }
        else if ("A53f".equals(model)) { return "Oppo A53f"; }
        else if ("ASUS PadFone X".equals(model)) { return "Asus PadFone X (A91)"; }
        else if ("A240".equals(model)) { return "Micromax A240"; }
        else if ("Archos 101 Oxygen".equals(model)) { return "ARCHOS 101 Oxygen"; }
        else if ("A91".equals(model)) { return "Micromax A91"; }
        else if ("A1-713HD".equals(model)) { return "Acer Iconia Tab 7"; }
        else if ("Aquaris M10".equals(model)) { return "bq Aquaris M10"; }
        else if ("ASUS_Z008D".equals(model)) { return "Asus ZenFone 2 (ZE550ML)"; }
        else if ("ASUS_Z00MD".equals(model)) { return "Asus ZenFone 2 Laser (ZE600KL)"; }
        else if ("Archos 35b Titanium".equals(model)) { return "ARCHOS 35b Titanium"; }
        else if ("A716_Inspire_Life".equals(model)) { return "Gtel A716 Inspire Life"; }
        else if ("ALCATEL ONETOUCH 6043D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH 6043D"; }
        else if ("Archos 79c Neon".equals(model)) { return "Archos Bush 7.85 My Tablet"; }
        else if ("ASUS Tablet P1802-T".equals(model)) { return "ASUS Transformer AiO P1802"; }
        else if ("Amazing X5s".equals(model)) { return "ZTE Amazing X5s"; }
        else if ("A3-A30".equals(model)) { return "Acer A3-A30"; }
        else if ("ALCATEL ONE TOUCH 7040E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7040E"; }
        else if ("ALCATEL ONE TOUCH 7040D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7040D"; }
        else if ("ALCATEL ONE TOUCH 7040K".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7040K"; }
        else if ("ATV".equals(model)) { return "Explay ATV"; }
        else if ("ALCATEL ONE TOUCH 7040X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7040X"; }
        else if ("ASUS ZenWatch".equals(model)) { return "ASUS ZenWatch"; }
        else if ("ALCATEL 4015T".equals(model)) { return "TCT (Alcatel) ALCATEL 4015T"; }
        else if ("ALCATEL ONE TOUCH 6037B".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6037B"; }
        else if ("A51w".equals(model)) { return "Oppo A51w"; }
        else if ("A51f".equals(model)) { return "Oppo A51fa"; }
        else if ("Archos 64 Xenon".equals(model)) { return "Archos 64 Xenon"; }
        else if ("A511".equals(model)) { return "Acer Iconia Tab A511"; }
        else if ("A510".equals(model)) { return "Acer Iconia Tab A510"; }
        else if ("ALCATEL ONETOUCH 4037R".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH 4037R"; }
        else if ("AO5510".equals(model)) { return "Yureka"; }
        else if ("A727_Infinity_Pro".equals(model)) { return "Gtel A727_Infinity_Pro"; }
        else if ("AT7003".equals(model)) { return "Haier AT7003"; }
        else if ("Aquaris A4.5".equals(model)) { return "bq Aquaris A4.5"; }
        else if ("ATH-TL00".equals(model)) { return "Huawei ATH-TL00"; }
        else if ("ADR6425LVW".equals(model)) { return "HTC Rezound 4G"; }
        else if ("ALCATEL ONETOUCH P310A".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH P310A"; }
        else if ("A3-A11".equals(model)) { return "Acer A3-A11"; }
        else if ("A3-A10".equals(model)) { return "Acer A3-A10"; }
        else if ("ALCATEL ONE TOUCH 7042A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7042A"; }
        else if ("ALCATEL ONE TOUCH 7042E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7042E"; }
        else if ("ALCATEL ONE TOUCH 7042D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7042D"; }
        else if ("ALCATEL ONE TOUCH 985".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 985"; }
        else if ("Aquaris_M4.5".equals(model)) { return "bq Aquaris M4.5"; }
        else if ("Archos Chefpad".equals(model)) { return "Archos ChefPad"; }
        else if ("a5".equals(model)) { return "ZTE Blade"; }
        else if ("a4".equals(model)) { return "Southern Telecom a4"; }
        else if ("Aquaris_E4.5".equals(model)) { return "bq Aquaris E4.5"; }
        else if ("AN200".equals(model)) { return "SK Telesys AN200"; }
        else if ("AT400".equals(model)) { return "Toshiba AT400"; }
        else if ("Aquaris M5.5".equals(model)) { return "bq Aquaris M5.5"; }
        else if ("Archos 90 Copper".equals(model)) { return "ARCHOS 90 Copper"; }
        else if ("Archos 50 Titanium".equals(model)) { return "Archos 50 Titanium"; }
        else if ("AS985".equals(model)) { return "LGE LG G3"; }
        else if ("AS986".equals(model)) { return "LGE LG G4"; }
        else if ("ARCHOS 97 Platinum".equals(model)) { return "Archos 97 Platinum"; }
        else if ("Andromax I46D1G".equals(model)) { return "Smartfren I46D1G"; }
        else if ("ALCATEL ONE TOUCH 9002A".equals(model)) { return "TCT (Alcatel) 9002A"; }
        else if ("ALCATEL ONE TOUCH 8000D".equals(model)) { return "TCT (Alcatel) ONE TOUCH SCRIBE 5"; }
        else if ("ALCATEL ONE TOUCH 8000A".equals(model)) { return "TCT (Alcatel) ONE TOUCH SCRIBE 5"; }
        else if ("ALCATEL ONE TOUCH 7030Y".equals(model)) { return "MegaFon MS4B"; }
        else if ("ALCATEL ONE TOUCH 7030R".equals(model)) { return "MegaFon MS4B"; }
        else if ("ALCATEL ONE TOUCH 4037N".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4037N"; }
        else if ("Alcatel_7049D".equals(model)) { return "TCT (Alcatel) Alcatel_7049D"; }
        else if ("Aqua View".equals(model)) { return "Intex Aqua View"; }
        else if ("AT300SE".equals(model)) { return "Toshiba AT400"; }
        else if ("Alcatel_5056O".equals(model)) { return "TCT (Alcatel) Alcatel_5056O"; }
        else if ("AT1S0".equals(model)) { return "Toshiba Thrive 7"; }
        else if ("Archos 97 Cobalt".equals(model)) { return "Archos 97 Cobalt"; }
        else if ("ALCATEL ONE TOUCH 991T".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 991T"; }
        else if ("ASUS_Z00LD".equals(model)) { return "Asus ZenFone 2 Laser (ZE550KL)"; }
        else if ("arcelik_uhd_powermax_at".equals(model)) { return "Arcelik B55L 9682 5AS"; }
        else if ("ALCATEL ONE TOUCH 991D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 991D"; }
        else if ("Archos 40b Titanium Surround".equals(model)) { return "Archos 40b Titanium"; }
        else if ("ASUS Transformer Pad TF700KL".equals(model)) { return "ASUS Transformer Pad Infinity"; }
        else if ("ASUS_T00P".equals(model)) { return "Asus ZenFone 5 LTE (A500KL)"; }
        else if ("ASUS_Z00SD".equals(model)) { return "Asus Zenfone Go (ASUS_Z00SD)"; }
        else if ("ALCATEL ONE TOUCH 6040X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6040X"; }
        else if ("Altus 18".equals(model)) { return "Panasonic Altus 18"; }
        else if ("ALCATEL ONE TOUCH 6040D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6040D"; }
        else if ("ALCATEL ONE TOUCH 6040E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6040E"; }
        else if ("ALCATEL ONE TOUCH 6040A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6040A"; }
        else if ("ALCATEL ONE TOUCH 903D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 903D"; }
        else if ("ALCATEL ONE TOUCH 903A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 903A"; }
        else if ("ASUS_X013DA".equals(model)) { return "Asus Zenfone GO"; }
        else if ("ASUS_X013DB".equals(model)) { return "Asus ZenFone Go"; }
        else if ("ARCHOS 101G9".equals(model)) { return "Archos 101 G9"; }
        else if ("ARCHOS 97 XENON".equals(model)) { return "Archos 97 Xenon"; }
        else if ("ADR6410LVW".equals(model)) { return "HTC Droid Incredible 4G"; }
        else if ("ASUS K00S".equals(model)) { return "Asus MeMO Pad HD7 Dual SIM (ME175KG)"; }
        else if ("ADR6300".equals(model)) { return "HTC Droid Incredible"; }
        else if ("ARCHOS 97b PLATINUM".equals(model)) { return "Archos 97b Platinum"; }
        else if ("ADR930L".equals(model)) { return "Pantech ADR930L"; }
        else if ("ALCATEL ONETOUCH 6032".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH 6032"; }
        else if ("Archos 50c Helium".equals(model)) { return "ARCHOS 50c Helium"; }
        else if ("ASUS_T00T".equals(model)) { return "Asus PadFone X mini (PF450CL)"; }
        else if ("ASUS_T00Q".equals(model)) { return "Asus ZenFone 4 (A450CG)"; }
        else if ("ASUS_T00N".equals(model)) { return "Asus PadFone S (PF500KL)"; }
        else if ("ASUS_T00J".equals(model)) { return "Asus ZenFone 5"; }
        else if ("ASUS_T00K".equals(model)) { return "Asus ZenFone 5 (A502CG)"; }
        else if ("ASUS_T00I".equals(model)) { return "Asus ZenFone 4 (A400CG)"; }
        else if ("ASUS_T00F".equals(model)) { return "Asus ZenFone 5 (A500CG)"; }
        else if ("ASUS_T00G".equals(model)) { return "Asus ZenFone 6 (A600CG)"; }
        else if ("ASUS_T00E".equals(model)) { return "Asus PadFone mini"; }
        else if ("ALCATEL ONE TOUCH P320A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH P320A"; }
        else if ("ALCATEL ONE TOUCH Fierce".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH Fierce"; }
        else if ("ANDY 5EI".equals(model)) { return "Ddm ANDY 5EI"; }
        else if ("Acer Liquid".equals(model)) { return "Acer Liquid"; }
        else if ("ASUS MeMO Pad 7".equals(model)) { return "Asus MeMO Pad 7 LTE (ME375CL)"; }
        else if ("ASUS Transformer Pad TF502T".equals(model)) { return "ASUS Transformer Pad TF502T"; }
        else if ("A712".equals(model)) { return "Astro Queo A712"; }
        else if ("ASUS ZenFone 2".equals(model)) { return "Asus ZenFone 2 (ZE500CL)"; }
        else if ("Avea inTouch 3 Large".equals(model)) { return "ZTE Orange Reyo"; }
        else if ("ALCATEL ONETOUCH Flash Plus".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH Flash Plus"; }
        else if ("ALCATEL ONE TOUCH 7040A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7040A"; }
        else if ("ALCATEL ONETOUCH POP D3".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP D3"; }
        else if ("A-TT00".equals(model)) { return "Haier A-TT00"; }
        else if ("ARCHOS 101 XS 2".equals(model)) { return "Archos 101XS2"; }
        else if ("Alcatel 7030L".equals(model)) { return "TCT (Alcatel) A851L"; }
        else if ("A100".equals(model)) { return "ZTE V9"; }
        else if ("A101".equals(model)) { return "Acer Iconia Tab A100 (VanGogh)"; }
        else if ("ARCHOS 80 Platinum".equals(model)) { return "Archos 80 Platinum"; }
        else if ("ARCHOS 80 Carbon".equals(model)) { return "Archos 80 Carbon"; }
        else if ("ATH-AL00".equals(model)) { return "Huawei ATH-AL00"; }
        else if ("AT7-A".equals(model)) { return "Toshiba AT7-A"; }
        else if ("ASUS PadFone X mini".equals(model)) { return "Asus PadFone X mini (PF450CL)"; }
        else if ("ASUS Pad TF300T".equals(model)) { return "Asus Transformer Pad"; }
        else if ("ASUS_Z00WD".equals(model)) { return "Asus ZenFone 2 Laser (ZE550KG)"; }
        else if ("ALCATEL ONE TOUCH 6033X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6033X"; }
        else if ("A714_Vivo_Play".equals(model)) { return "Gtel A714 Vivo Play"; }
        else if ("ALCATEL ONE TOUCH 6033M".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6033X"; }
        else if ("ALCATEL ONE TOUCH 6033A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6033A"; }
        else if ("A1-724".equals(model)) { return "Acer Iconia TalkTab 7"; }
        else if ("ARCHOS 79 Platinum".equals(model)) { return "Archos 79 Platinium"; }
        else if ("A1-830".equals(model)) { return "Acer A1-830"; }
        else if ("ALCATEL_ONE_TOUCH_5020X_Orange".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("AST21".equals(model)) { return "Asus MeMO Pad 8 (AST21)"; }
        else if ("ADR6410LRA".equals(model)) { return "HTC DROID Incredible 4G LTE"; }
        else if ("ASUS Pad TF700T".equals(model)) { return "Asus TF700T"; }
        else if ("AP54".equals(model)) { return "Haier AP54"; }
        else if ("A3-A20FHD".equals(model)) { return "Acer Iconia Tab 10"; }
        else if ("Archos 101b Platinium".equals(model)) { return "Archos 101b Platinum"; }
        else if ("ALCATEL ONE TOUCH 908".equals(model)) { return "TCT (Alcatel) One Touch 908"; }
        else if ("ALCATEL ONE TOUCH 903".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 903"; }
        else if ("AK815".equals(model)) { return "LGE G Pad 8+"; }
        else if ("ALCATEL_one_touch_990S".equals(model)) { return "TCT (Alcatel) One Touch 990S"; }
        else if ("ALCATEL_one_touch_990A".equals(model)) { return "TCT (Alcatel) One Touch 990A"; }
        else if ("Archos 45 Helium 4G".equals(model)) { return "Archos 45 Helium 4G"; }
        else if ("Archos 45 Titanium".equals(model)) { return "Archos 45 Titanium"; }
        else if ("AT374".equals(model)) { return "Toshiba AT7-B"; }
        else if ("A2107A-H".equals(model)) { return "Lenovo A2107A"; }
        else if ("ARCHOS 70b TITANIUM".equals(model)) { return "Archos 70b Titanium"; }
        else if ("Andromax AD687G".equals(model)) { return "Smartfren Andromax AD687G"; }
        else if ("ALCATEL_one_touch_908".equals(model)) { return "TCT (Alcatel) One Touch 908"; }
        else if ("ALCATEL_one_touch_903".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 903"; }
        else if ("ASUS_X014D".equals(model)) { return "Asus Zenfone GO"; }
        else if ("ARCHOS GAMEPAD2".equals(model)) { return "Archos GamePad 2"; }
        else if ("A31c".equals(model)) { return "Oppo A31c"; }
        else if ("A31u".equals(model)) { return "Oppo A31u"; }
        else if ("A31t".equals(model)) { return "Oppo A13t"; }
        else if ("Archos 101 Helium".equals(model)) { return "Archos 101 Helium"; }
        else if ("AS01M".equals(model)) { return "Cathay AS01M"; }
        else if ("ADR6410OM".equals(model)) { return "HTC DROID Incredible 4G LTE"; }
        else if ("Archos 101 Cobalt".equals(model)) { return "Archos 101 Cobalt"; }
        else if ("AX660".equals(model)) { return "BMobile AX660"; }
        else if ("Aquaris M4.5".equals(model)) { return "bq Aquaris M4.5"; }
        else if ("ADR910L".equals(model)) { return "Pantech ADR910L"; }
        else if ("AXON WATCH".equals(model)) { return "ZTE AXON WATCH"; }
        else if ("Archos 50b Helium 4G".equals(model)) { return "Archos 50b Helium"; }
        else if ("ALCATEL ONE TOUCH 6010A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6010A"; }
        else if ("ALCATEL ONE TOUCH 6010D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6010X"; }
        else if ("ALCATEL ONE TOUCH 6010X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6010X"; }
        else if ("AQ710A".equals(model)) { return "Intel AQ710A"; }
        else if ("Alcatel A851L".equals(model)) { return "TCT (Alcatel) A851L"; }
        else if ("Aquaris E5 FHD".equals(model)) { return "bq Aquaris E5 FHD"; }
        else if ("A6_Lite".equals(model)) { return "AllView A6 Lite"; }
        else if ("Aquaris M10 FHD".equals(model)) { return "bq Aquaris M10 FHD"; }
        else if ("Agora 4G Pro".equals(model)) { return "BenQ Agora_4G_Pro"; }
        else if ("Archos 70 Helium".equals(model)) { return "Archos 70 Helium"; }
        else if ("ALCATEL_one_touch_4030A".equals(model)) { return "TCT (Alcatel) one_touch_4030_TLVE"; }
        else if ("Archos 101 Xenon".equals(model)) { return "Archos 101 Xenon"; }
        else if ("A08S".equals(model)) { return "AboCom A08SM"; }
        else if ("ASUS_Z00TD".equals(model)) { return "Asus ZenFone 2 Laser (ZE551KL)"; }
        else if ("Archos 101 Neon".equals(model)) { return "Archos 101 Neon"; }
        else if ("A33f".equals(model)) { return "Oppo A33f"; }
        else if ("A33t".equals(model)) { return "Oppo A33t"; }
        else if ("A33w".equals(model)) { return "Oppo A33w"; }
        else if ("Amazing A1".equals(model)) { return "ZTE Amazing A1"; }
        else if ("ALCATEL_ONE_TOUCH_6030X_Orange".equals(model)) { return "TCT (Alcatel) ALCATEL_ONE_TOUCH_6030X_Orange"; }
        else if ("Aqua Power 4G".equals(model)) { return "Intex Aqua Power 4G"; }
        else if ("ATH-TL00H".equals(model)) { return "Huawei ATH-TL00H"; }
        else if ("ALCATEL ONE TOUCH 5020W".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("ALCATEL ONE TOUCH 5020T".equals(model)) { return "TCT (Alcatel) TCL J300"; }
        else if ("ALCATEL ONE TOUCH 5020X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("ALCATEL ONE TOUCH 5020A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("ALCATEL ONE TOUCH 5020E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("ALCATEL ONE TOUCH 5020N".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020N"; }
        else if ("Archos 45c Platinum".equals(model)) { return "Archos 45c Platinum"; }
        else if ("Alcatel9007T".equals(model)) { return "TCT (Alcatel) Alcatel9007T"; }
        else if ("Archos 53 Titanium".equals(model)) { return "Archos 53 Titanium"; }
        else if ("AX600C".equals(model)) { return "Panasonic AX600C"; }
        else if ("ASUS ZenWatch 2".equals(model)) { return "ASUS ZenWatch 2"; }
        else if ("ALCATEL ONE TOUCH 6012X".equals(model)) { return "TCT (Alcatel) ONE TOUCH 6012D"; }
        else if ("ALCATEL ONE TOUCH 6012D".equals(model)) { return "TCT (Alcatel) ONE TOUCH 6012D"; }
        else if ("ALCATEL ONE TOUCH 4010A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4010X"; }
        else if ("ALCATEL ONE TOUCH 4010E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4010X"; }
        else if ("ALCATEL ONE TOUCH 4010D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4010X"; }
        else if ("ALCATEL ONE TOUCH 4010X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4010X"; }
        else if ("AURUS III".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("AK330".equals(model)) { return "Acer Liquid Gallant E350"; }
        else if ("Archos 52 Platinum".equals(model)) { return "ARCHOS 52 Platinum"; }
        else if ("ARCHOS 80 CHILDPAD".equals(model)) { return "Archos 80 Childpad"; }
        else if ("ASUS_Z00LDC".equals(model)) { return "Asus ZenFone 2 Laser (ZE550KL)"; }
        else if ("ALCATEL ONE TOUCH D668".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH D668"; }
        else if ("Amazing A4C".equals(model)) { return "ZTE Bouygues Telecom Bs 402"; }
        else if ("ARCHOS 70it2".equals(model)) { return "Archos 70it 2"; }
        else if ("Amazing A4S".equals(model)) { return "ZTE V815W"; }
        else if ("ALCATEL ONE TOUCH 6035L".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("ALCATEL ONE TOUCH 6035R".equals(model)) { return "TCT (Alcatel) Idol X"; }
        else if ("Archos 70 Carbon".equals(model)) { return "Archos Bush MyTablet 7"; }
        else if ("AC50DHE".equals(model)) { return "Archos 50 d Helium"; }
        else if ("ARCHOS 80XSK".equals(model)) { return "Archos 80 XS"; }
        else if ("ALCATEL ONE TOUCH 4037T".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4037N"; }
        else if ("ALCATEL ONE TOUCH 4037R".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH 4037R"; }
        else if ("ALCATEL ONE TOUCH 6010".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6010X"; }
        else if ("ARCHOS 70 Cobalt".equals(model)) { return "Archos 70 Cobalt"; }
        else if ("A7100_X3".equals(model)) { return "Gtel A7100 X3"; }
        else if ("Aquaris E10".equals(model)) { return "bq Aquaris E10"; }
        else if ("Archos 62 Xenon".equals(model)) { return "ARCHOS 62 Xenon"; }
        else if ("A463BG".equals(model)) { return "TCT (Alcatel) Pixi3-3.5 TF"; }
        else if ("ASUS Transformer 300".equals(model)) { return "Asus Transformer Pad"; }
        else if ("Archos 101b Neon".equals(model)) { return "Archos 101b Neon"; }
        else if ("AX501Q".equals(model)) { return "AllView AX501Q"; }
        else if ("ALCATEL ONE TOUCH FIERCE".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7024W"; }
        else if ("ALCATEL ONE TOUCH 922".equals(model)) { return "TCT (Alcatel) Vodafone 861"; }
        else if ("Archos 50b Neon".equals(model)) { return "ARCHOS 50b Neon"; }
        else if ("A1-840FHD".equals(model)) { return "Acer Iconia Tab 8"; }
        else if ("alcatel_5098O".equals(model)) { return "TCT (Alcatel) 5098O"; }
        else if ("A520L".equals(model)) { return "TCT (Alcatel) A520L"; }
        else if ("A5801".equals(model)) { return "Cellon A5801"; }
        else if ("ALCATEL_ONE_TOUCH_7041X".equals(model)) { return "Alcatel One Touch Pop C7"; }
        else if ("A37f".equals(model)) { return "Oppo A37f"; }
        else if ("Amazing A8".equals(model)) { return "TaiwanMobile Amazing A8"; }
        else if ("Amazing A6".equals(model)) { return "ZTE Grand X Quad Lite"; }
        else if ("Amazing A7".equals(model)) { return "ZTE Grand X 2"; }
        else if ("Amazing A4".equals(model)) { return "ZTE V807"; }
        else if ("Amazing A3".equals(model)) { return "ZTE V793"; }
        else if ("ALCATEL one touch 918".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 918"; }
        else if ("ADR3010".equals(model)) { return "TCT (Alcatel) ONE TOUCH Ultra 960c"; }
        else if ("ALCATEL ONE TOUCH 6032".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6032"; }
        else if ("A33".equals(model)) { return "Oppo A33"; }
        else if ("ALCATEL_ONE_TOUCH_Fierce".equals(model)) { return "ALCATEL ONE TOUCH Fierce"; }
        else if ("A3-A20".equals(model)) { return "Acer Iconia Tab 10"; }
        else if ("ALCATEL ONETOUCH 6050A".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("AT7-B".equals(model)) { return "Toshiba AT7-B"; }
        else if ("AT7-C".equals(model)) { return "Toshiba AT7-C"; }
        else if ("Archos 80b Helium".equals(model)) { return "Archos 80b Helium"; }
        else if ("ALCATEL_one_touch_918A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 918A"; }
        else if ("ALCATEL_one_touch_918D".equals(model)) { return "TCT (Alcatel) ALCATEL_one_touch_918D"; }
        else if ("ALCATEL_ONETOUCH_7053D".equals(model)) { return "TCT (Alcatel) ALCATEL_ONETOUCH_7053D"; }
        else if ("A715_Inspire_One".equals(model)) { return "Gtel A715_Inspire_One"; }
        else if ("Alcatel one touch 990 Orange".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("ALCATEL ONE TOUCH 992D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 992D"; }
        else if ("ALCATEL_one_touch_983".equals(model)) { return "TCT (Alcatel) ONE TOUCH 983"; }
        else if ("ALCATEL_one_touch_985".equals(model)) { return "TCT (Alcatel) Alcatel one touch 985"; }
        else if ("ASUS_Z00AD".equals(model)) { return "Asus Zenfone 2"; }
        else if ("A27".equals(model)) { return "Micromax A27"; }
        else if ("ARCHOS FAMILYPAD 2".equals(model)) { return "Archos FamilyPad 2"; }
        else if ("Archos 79 Cobalt".equals(model)) { return "Archos 79 Cobalt"; }
        else if ("AX1060".equals(model)) { return "BMobile AX1060"; }
        else if ("A5_Easy_TM".equals(model)) { return "AllView A5 Easy"; }
        else if ("A111".equals(model)) { return "Micromax A111"; }
        else if ("A110".equals(model)) { return "Acer A110"; }
        else if ("A7X_PTAB735X".equals(model)) { return "Polaroid A7X_PTAB735X"; }
        else if ("ASUS_Z00EDB".equals(model)) { return "Asus ZenFone 2 Laser (ZE500KL)"; }
        else if ("ALCATEL ONE TOUCH 4030Y_orange".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4030X"; }
        else if ("A1".equals(model)) { return "ZTE A1R"; }
        else if ("A3".equals(model)) { return "BenQ A3"; }
        else if ("A2".equals(model)) { return "ZTE A2"; }
        else if ("A5".equals(model)) { return "Southern Telecom A5"; }
        else if ("A6".equals(model)) { return "Polaroid A6"; }
        else if ("ARCHOS 80G9".equals(model)) { return "Archos 80 G9"; }
        else if ("Archos 101 Copper".equals(model)) { return "Archos 101 Copper"; }
        else if ("ARCHOS 50c Neon".equals(model)) { return "Archos 50c Neon"; }
        else if ("AZDroid".equals(model)) { return "AZBox AZDroid"; }
        else if ("A11w".equals(model)) { return "OPPO A11w"; }
        else if ("Archos 70 Platinum".equals(model)) { return "Archos 70 Platinum"; }
        else if ("Archos 50 Oxygen".equals(model)) { return "Archos 50 Oxygen"; }
        else if ("A5_Quad_Plus".equals(model)) { return "AllView A5 Quad Plus"; }
        else if ("archer".equals(model)) { return "Samsung Galaxy A"; }
        else if ("ALCATEL ONE TOUCH 5036D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5036D"; }
        else if ("ALCATEL ONE TOUCH 5036F".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5036F"; }
        else if ("ALCATEL ONE TOUCH 5036A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5036A"; }
        else if ("ALCATEL ONE TOUCH 5036X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5036X"; }
        else if ("Archos 101 DB".equals(model)) { return "Archos ArcBook"; }
        else if ("ALCATEL ONE TOUCH 930D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 930D"; }
        else if ("ALCATEL ONE TOUCH 930N".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 930D"; }
        else if ("Archos 45 Platinum".equals(model)) { return "Archos 45 Platinum"; }
        else if ("A920".equals(model)) { return "AZPEN A920"; }
        else if ("ALCATEL one touch 990".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("ALCATEL ONETOUCH 6032X".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH 6032X"; }
        else if ("A846L".equals(model)) { return "TCT (Alcatel) A846L"; }
        else if ("A210".equals(model)) { return "Micromax CANVAS 4"; }
        else if ("A211".equals(model)) { return "Acer Iconia Tab A211"; }
        else if ("ALCATEL_ONE_TOUCH_903".equals(model)) { return "TCT (Alcatel) ALCATEL_ONE_TOUCH_903"; }
        else if ("ASUS_Z010DA".equals(model)) { return "Asus Zenfone MAX"; }
        else if ("ASUS_Z010DD".equals(model)) { return "ASUS_ Zenfone Max"; }
        else if ("arc 7HD".equals(model)) { return "Kobo Arc 7HD"; }
        else if ("A460G".equals(model)) { return "TCT (Alcatel) Pixi3-4 TF"; }
        else if ("Amazing X5".equals(model)) { return "ZTE Q509T"; }
        else if ("Amazing X7".equals(model)) { return "ZTE Amazing X7"; }
        else if ("Amazing X6".equals(model)) { return "ZTE Amazing X6"; }
        else if ("Amazing X1".equals(model)) { return "ZTE T86"; }
        else if ("Amazing X3".equals(model)) { return "Taiwan Mobile Amazing X3"; }
        else if ("Amazing X2".equals(model)) { return "ZTE Amazing X2"; }
        else if ("Archos 50b Platinum".equals(model)) { return "Archos 50b Platinum"; }
        else if ("AK330S".equals(model)) { return "Acer AK330s"; }
        else if ("ALCATEL_ONE_TOUCH_6010X_Orange".equals(model)) { return "TCT (Alcatel) ALCATEL_ONE_TOUCH_6010X_Orange"; }
        else if ("ALCATEL ONE TOUCH 4027A".equals(model)) { return "TCT (Alcatel) ALCATEL_ONE_TOUCH_4027A"; }
        else if ("A6S".equals(model)) { return "TaiwanMobile A6S"; }
        else if ("ARCHOS GAMEPAD".equals(model)) { return "Archos GamePad"; }
        else if ("A67".equals(model)) { return "Lava A67"; }
        else if ("ASUS_Z00ED".equals(model)) { return "Asus ZenFone 2 Laser (ZE500KL)"; }
        else if ("AA3-600".equals(model)) { return "Acer Aspire A3"; }
        else if ("Avea inTouch 4".equals(model)) { return "ZTE Avea inTouch 4"; }
        else if ("Avea inTouch 3".equals(model)) { return "ZTE STARTRAIL 4"; }
        else if ("Avea inTouch 2".equals(model)) { return "ZTE Avea inTouch 2"; }
        else if ("ALE-L02".equals(model)) { return "Huawei ALE-L02"; }
        else if ("Ally".equals(model)) { return "LGE Ally"; }
        else if ("A1-841".equals(model)) { return "Acer Iconia Tab 8"; }
        else if ("A1-840".equals(model)) { return "Acer Iconia Tab 8"; }
        else if ("ALCATEL one touch J320".equals(model)) { return "TCT (Alcatel) ALCATEL one touch J320"; }
        else if ("ASUS_Z00XS".equals(model)) { return "Asus ZenFone Zoom (ZX551ML)"; }
        else if ("ALCATEL_ONE_TOUCH_4005D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4005D"; }
        else if ("ASUS_Transformer_Pad_TF700T".equals(model)) { return "ASUS Transformer Pad Infinity"; }
        else if ("Archos Smart Home Tablet".equals(model)) { return "Archos Smart Home Tablet"; }
        else if ("Archos 90b Copper".equals(model)) { return "Archos 90b Copper"; }
        else if ("A4C".equals(model)) { return "ZTE Bouygues Telecom Bs 402"; }
        else if ("A44".equals(model)) { return "Micromax A44"; }
        else if ("A45".equals(model)) { return "Micromax A45"; }
        else if ("ADR6400L".equals(model)) { return "HTC Thunderbolt"; }
        else if ("ALOO 6032".equals(model)) { return "TCT (Alcatel) ALOO 6032"; }
        else if ("ASUS Transformer Pad TF300T".equals(model)) { return "Asus Transformer Pad"; }
        else if ("A7_Lite".equals(model)) { return "AllView A7 Lite"; }
        else if ("ALE-L23".equals(model)) { return "Huawei ALE-L23"; }
        else if ("ALE-L21".equals(model)) { return "Huawei ALE-L21"; }
        else if ("Aloha".equals(model)) { return "LGE Ally"; }
        else if ("AM506".equals(model)) { return "Amgoo AM506"; }
        else if ("A770_XL7".equals(model)) { return "Gtel A770_XL7"; }
        else if ("Aquaris E4.5".equals(model)) { return "bq Aquaris E4.5"; }
        else if ("A250".equals(model)) { return "Micromax CANVAS TURBO"; }
        else if ("Archos 50 Neon".equals(model)) { return "Archos 50 Neon"; }
        else if ("AM-H100".equals(model)) { return "TCT (Alcatel) AM-H100"; }
        else if ("ASUS Transformer Pad TF700T".equals(model)) { return "Asus TF700T"; }
        else if ("Arc".equals(model)) { return "Kobo Arc"; }
        else if ("A5_Lite".equals(model)) { return "AllView A5 Lite"; }
        else if ("A5_Easy".equals(model)) { return "AllView A5 Easy"; }
        else if ("ALCATEL ONE TOUCH 7024W".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH Fierce"; }
        else if ("A068".equals(model)) { return "Micromax BOLT"; }
        else if ("ASUS_Z002".equals(model)) { return "Asus ZenFone 6 (A601CG)"; }
        else if ("ASUS_Z007".equals(model)) { return "Asus ZenFone C (ZC451CG)"; }
        else if ("ARCHOS 101 PLATINUM".equals(model)) { return "Archos 101 Platinum"; }
        else if ("A1-713".equals(model)) { return "Acer Iconia Tab 7"; }
        else if ("ARCHOS 101 Magnus".equals(model)) { return "Archos 101 Magnus"; }
        else if ("Alcatel_5098O".equals(model)) { return "TCT (Alcatel) 5098O"; }
        else if ("A500".equals(model)) { return "Acer Picasso"; }
        else if ("A501".equals(model)) { return "Acer Picasso"; }
        else if ("AN-NP40".equals(model)) { return "Sharp AN-NP40"; }
        else if ("ALCATEL ONE TOUCH P321".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH P321"; }
        else if ("Archos 80b Xenon".equals(model)) { return "Archos 80b xenon"; }
        else if ("ALCATEL one touch 890D".equals(model)) { return "TCT (Alcatel) One Touch 890D"; }
        else if ("ARCHOS 70it2G8".equals(model)) { return "Archos 70it 2"; }
        else if ("A87".equals(model)) { return "Micromax A87"; }
        else if ("A84".equals(model)) { return "Micromax A84"; }
        else if ("A88".equals(model)) { return "Micromax A88"; }
        else if ("A89".equals(model)) { return "Micromax A89"; }
        else if ("Android Edition StarTrail".equals(model)) { return "ZTE Blade"; }
        else if ("Aqua Pride".equals(model)) { return "Intex Aqua Pride"; }
        else if ("AZ210A".equals(model)) { return "Intel Orange San Diego"; }
        else if ("AZ210B".equals(model)) { return "Intel Orange avec Intel Inside"; }
        else if ("Android edition by sfr STARADDICT".equals(model)) { return "ZTE Android edition by sfr STARADDICT"; }
        else if ("ALCATEL_ONE_TOUCH_5020D_Orange".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("A51kc".equals(model)) { return "Oppo A51kc"; }
        else if ("Aster T".equals(model)) { return "Vertu Aster T"; }
        else if ("ALCATEL A845L".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("ARCHOS 40d Titanium".equals(model)) { return "Archos 40d Titanium"; }
        else if ("ALCATEL ONE TOUCH 7041D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7041D"; }
        else if ("ALCATEL ONE TOUCH 7041X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7041X"; }
        else if ("ARCHOS 80 COBALT".equals(model)) { return "Archos 80 Cobalt"; }
        else if ("Android Tablet FT7".equals(model)) { return "Cspire FT7"; }
        else if ("A37fw".equals(model)) { return "Oppo A37fw"; }
        else if ("A554C".equals(model)) { return "TCT (Alcatel) Juke-A554C"; }
        else if ("ALCATEL ONE TOUCH P320X".equals(model)) { return "TCT (Alcatel) ALCATEL_ONE_TOUCH_P320X"; }
        else if ("Amazing P6".equals(model)) { return "ZTE Amazing P6"; }
        else if ("Archos 101 Xenon v2".equals(model)) { return "Archos 101 Xenon"; }
        else if ("ARCHOS 101 CHILDPAD".equals(model)) { return "Archos 101 Childpad"; }
        else if ("Archos 40 Titanium".equals(model)) { return "Archos 40 Titanium"; }
        else if ("Aquaris E10 3G".equals(model)) { return "bq Aquaris E10 3G"; }
        else if ("ADR6350".equals(model)) { return "HTC Droid Incredible 2"; }
        else if ("ALCATEL ONE TOUCH 990".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("ALCATEL ONE TOUCH 991".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 991"; }
        else if ("ALCATEL ONE TOUCH 992".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 992D"; }
        else if ("ALCATEL ONE TOUCH 993".equals(model)) { return "TCT (Alcatel) TCL A988"; }
        else if ("Andromax I56D2G".equals(model)) { return "Hisense I56D2G"; }
        else if ("ALCATEL ONE TOUCH 997".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 997D"; }
        else if ("ARCHOS 70 Titanium".equals(model)) { return "Archos 70 Titanium"; }
        else if ("A713_Vivo_Pro".equals(model)) { return "Gtel A713_Vivo_Pro"; }
        else if ("Archos 101c Xenon".equals(model)) { return "Archos 101 Xenon"; }
        else if ("ASUS_Z00ADB".equals(model)) { return "Asus ZenFone 2 (ZE551ML)"; }
        else if ("AV10".equals(model)) { return "AV10"; }
        else if ("Amazing_P8".equals(model)) { return "ZTE K83"; }
        else if ("Amazing_P5".equals(model)) { return "ZTE myPad P5"; }
        else if ("ALCATEL_ONE_TOUCH_5035X".equals(model)) { return "Alcatel One Touch X Pop"; }
        else if ("ASUS Tablet P1801-T".equals(model)) { return "ASUS Transformer AiO P1801"; }
        else if ("AG_Tab_7_0".equals(model)) { return "AG Mobile AG_Tab_7_0"; }
        else if ("Ahiga".equals(model)) { return "Mobiwire Ahiga"; }
        else if ("ASUS ZenFone 2E".equals(model)) { return "Asus ZenFone 2 (ZE500CL)"; }
        else if ("ARCHOS 45b Helium".equals(model)) { return "Archos 45b Helium"; }
        else if ("ALCATEL ONE TOUCH 918A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 918A"; }
        else if ("ALCATEL ONE TOUCH 918D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 918D"; }
        else if ("ALCATEL ONETOUCH 5050X".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("AS876".equals(model)) { return "LGE LG-AS876"; }
        else if ("Archos 50 Platinum".equals(model)) { return "Archos 50 Platinum"; }
        else if ("ALCATEL_one_touch_906Y".equals(model)) { return "TCT (Alcatel) One Touch 906"; }
        else if ("Alcatel_one_touch_908F_Orange".equals(model)) { return "TCT (Alcatel) One Touch 908"; }
        else if ("ASUS Transformer Pad TF600T".equals(model)) { return "ASUS Transformer Pad TF600T"; }
        else if ("A3-A40".equals(model)) { return "Acer A3-A40"; }
        else if ("Archos 101c Neon".equals(model)) { return "Archos 101c Neon"; }
        else if ("ALCATEL ONE TOUCH 8020D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 8020D"; }
        else if ("ALCATEL ONE TOUCH 8020E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 8020E"; }
        else if ("ALCATEL ONE TOUCH 8020A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 8020A"; }
        else if ("ALCATEL ONE TOUCH 8020X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 8020X"; }
        else if ("ADR6330VW".equals(model)) { return "HTC Rhyme"; }
        else if ("Archos 40 Helium".equals(model)) { return "Archos 40 Helium"; }
        else if ("ALCATEL one touch 990C+".equals(model)) { return "TCT (Alcatel) ALCATEL one touch 990C+"; }
        else if ("AQT100".equals(model)) { return "Sprint AQT100"; }
        else if ("Acer Liquid Metal".equals(model)) { return "Acer LiquidMT"; }
        else if ("ALCATEL_ONE_TOUCH_985".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 985"; }
        else if ("ASUS_Z00RD".equals(model)) { return "Asus ZenFone 2 Laser (ZE500KG)"; }
        else if ("A700".equals(model)) { return "Acer Iconia Tab A700"; }
        else if ("A701".equals(model)) { return "Acer Iconia Tab A701"; }
        else if ("Archos 40c Titanium".equals(model)) { return "Archos 40c Titanium"; }
        else if ("ASUS_Z00UD".equals(model)) { return "Asus ZenFone Selfie (ZD551KL)"; }
        else if ("ARCHOS LUDOG10".equals(model)) { return "Archos TV Connect"; }
        else if ("ALCATEL ONE TOUCH 5037E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5037E"; }
        else if ("ALCATEL_one_touch_995S".equals(model)) { return "TCT (Alcatel) ALCATEL_one_touch_995S"; }
        else if ("ALCATEL_one_touch_995A".equals(model)) { return "TCT (Alcatel) ALCATEL_one_touch_995A"; }
        else if ("ALCATEL ONE TOUCH 7047X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7047X"; }
        else if ("ALCATEL ONE TOUCH 7047A".equals(model)) { return "TCT (Alcatel) ALCATEL_ONE_TOUCH_7047A"; }
        else if ("ALCATEL ONE TOUCH 7047D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7047D"; }
        else if ("ALCATEL ONE TOUCH 7047E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7047E"; }
        else if ("ARCHOS 97 TITANIUMHD".equals(model)) { return "Archos 97 Titanium HD"; }
        else if ("A912".equals(model)) { return "AstroQueo polaris_wifionly"; }
        else if ("A80RG11".equals(model)) { return "Archos Quechua Tablet 8"; }
        else if ("A720".equals(model)) { return "AZPEN A720"; }
        else if ("A853".equals(model)) { return "Motorola Droid"; }
        else if ("A854".equals(model)) { return "Motorola Droid"; }
        else if ("Archos 50 Diamond".equals(model)) { return "Archos 50 Diamond"; }
        else if ("A1601fw".equals(model)) { return "Oppo A1601fw"; }
        else if ("ALCATEL ONE TOUCH 6032A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6032A"; }
        else if ("ALCATEL ONE TOUCH 4029A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4030X"; }
        else if ("ASUS_Transformer_Pad_TF300T".equals(model)) { return "Asus Transformer Pad"; }
        else if ("ALCATEL ONE TOUCH 985D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 985D"; }
        else if ("ALCATEL ONE TOUCH 985N".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 985N"; }
        else if ("AND1E".equals(model)) { return "Philips Android 2014"; }
        else if ("A116".equals(model)) { return "Micromax A116"; }
        else if ("ASUS_Z00UDA".equals(model)) { return "Asus ZenFone Selfie (ZD551KL)"; }
        else if ("Archos 79 Xenon".equals(model)) { return "Archos 79 Xenon"; }
        else if ("A11t".equals(model)) { return "Oppo A11t"; }
        else if ("A11f".equals(model)) { return "Oppo A11f"; }
        else if ("AC50BHE".equals(model)) { return "Archos 50b Helium"; }
        else if ("AS740".equals(model)) { return "LGE Ally"; }
        else if ("AG Go-Tab Access".equals(model)) { return "AG Mobile AG_Go-Tab_Access"; }
        else if ("ALCATEL ONE TOUCH 6030X-orange".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6030X-orange"; }
        else if ("Altus 24".equals(model)) { return "Panasonic Altus 24"; }
        else if ("ALCATEL one touch 986+".equals(model)) { return "TCT (Alcatel) ALCATEL one touch 986+"; }
        else if ("ASUS_Z00VD".equals(model)) { return "Asus Zenfone Go (ASUS_Z00VD)"; }
        else if ("Amazing p5_Lite".equals(model)) { return "ZTE Amazing p5_Lite"; }
        else if ("Archos 70 Xenon".equals(model)) { return "Archos 70 Xenon"; }
        else if ("ARCHOS 80b PLATINUM".equals(model)) { return "Archos 80b Platinum"; }
        else if ("ALCATEL_one_touch_918".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 918"; }
        else if ("ALCATEL ONE TOUCH 6030X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6030X"; }
        else if ("ALCATEL ONE TOUCH 6030N".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6030N"; }
        else if ("ALCATEL ONE TOUCH 6030A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6030X"; }
        else if ("ALCATEL ONE TOUCH 6030D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6030X"; }
        else if ("AX7OO".equals(model)) { return "BMobile AX700"; }
        else if ("Algiz RT7".equals(model)) { return "Handheld Group Algiz RT7"; }
        else if ("ARCHOS 101b XS2".equals(model)) { return "Archos 101b XS2"; }
        else if ("ALCATEL ONE TOUCH 918S".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 918S"; }
        else if ("Autana LTE".equals(model)) { return "Huawei ALE-L23"; }
        else if ("ALCATEL ONE TOUCH 918".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 918"; }
        else if ("ASUS_Z00YD".equals(model)) { return "ASUS Live"; }
        else if ("Alcatel one touch 990S".equals(model)) { return "TCT (Alcatel) One Touch 990S"; }
        else if ("ALCATEL ONE TOUCH 918N".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH918N"; }
        else if ("A53fw".equals(model)) { return "Oppo A53fw"; }
        else if ("AD7003".equals(model)) { return "COMIO AD7003"; }
        else if ("Aster".equals(model)) { return "Vertu Aster"; }
        else if ("Archos 55 Helium Plus".equals(model)) { return "Archos 55 Helium Plus"; }
        else if ("ALCATEL ONE TOUCH 6010X-orange".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6010X"; }
        else if ("ALCATEL A995L".equals(model)) { return "TCT (Alcatel) POP S9"; }
        else if ("Archos 50 Oxygen Plus".equals(model)) { return "Archos 50 Oxygen plus"; }
        else if ("AS870 4G".equals(model)) { return "LGE Optimus F5"; }
        else if ("Archos 45 Neon".equals(model)) { return "Archos 45 Neon"; }
        else if ("A40C".equals(model)) { return "Azumi A40C"; }
        else if ("ALCATEL ONETOUCH 6032A".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH 6032A"; }
        else if ("arc 7".equals(model)) { return "Kobo Arc 7"; }
        else if ("ALCATEL ONE TOUCH 6032X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6032X"; }
        else if ("Archos 70 Copper".equals(model)) { return "Archos 70 Copper"; }
        else if ("AT100".equals(model)) { return "Toshiba AT100"; }
        else if ("ALCATEL ONE TOUCH 997D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 997D"; }
        else if ("Archos 70 Neon".equals(model)) { return "Archos 70 Neon"; }
        else if ("AX4Nano_plus".equals(model)) { return "AllView AX4 Nano Plus"; }
        else if ("Archos 96 Xenon".equals(model)) { return "Archos 96 Xenon"; }
        else if ("Archos 50c Oxygen".equals(model)) { return "Archos 50c Oxygen"; }
        else if ("ALCATEL ONE TOUCH 6034M".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("ALCATEL ONE TOUCH 6034L".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("ALCATEL ONE TOUCH 6034Y".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("ALCATEL ONE TOUCH 6034R".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("ALCATEL ONE TOUCH 991A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 991A"; }
        else if ("Andromax B16C2G".equals(model)) { return "Smartfren B16C2G"; }
        else if ("Andromax B16C2H".equals(model)) { return "Smartfren B16C2H"; }
        else if ("Archos 79 Neon".equals(model)) { return "Archos 79 Neon"; }
        else if ("Alpha Ice".equals(model)) { return "Cellon Alpha Ice"; }
        else if ("ALCATEL ONE TOUCH 5021E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("ATH-CL00".equals(model)) { return "Huawei ATH-CL00"; }
        else if ("ASUS_Z010DB".equals(model)) { return "Asus Zenfone MAX"; }
        else if ("Archos 70b Cobalt".equals(model)) { return "Archos 70b Cobalt"; }
        else if ("Archos 53 Platinum".equals(model)) { return "Archos 53 Platinum"; }
        else if ("Amazing A5S".equals(model)) { return "ZTE V831W"; }
        else if ("Akta_A4".equals(model)) { return "GSmart Akta A4"; }
        else if ("AC45BHE".equals(model)) { return "Archos 45b Helium"; }
        else if ("Archos 80 Helium 4G".equals(model)) { return "Archos 80 Helium"; }
        else if ("AX1030".equals(model)) { return "BMobile AX1030"; }
        else if ("Aura_Power".equals(model)) { return "Karbonn Aura Power"; }
        else if ("ALCATEL ONE TOUCH 4030Y".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4030X"; }
        else if ("ALCATEL ONE TOUCH 4030X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4030X"; }
        else if ("A5_Ready_TM".equals(model)) { return "AllView A5 Ready"; }
        else if ("ALCATEL ONE TOUCH 4030E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4030X"; }
        else if ("ALCATEL ONE TOUCH 4030D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4030X"; }
        else if ("asus_google_cube".equals(model)) { return "Asus Cube"; }
        else if ("Antares".equals(model)) { return "Tonino Lamborghini Antares"; }
        else if ("AM-H200".equals(model)) { return "TCT (Alcatel) Sol"; }
        else if ("Archos 55 Platinum".equals(model)) { return "Archos 55 platinum"; }
        else if ("Alcatel_5054O".equals(model)) { return "TCT (Alcatel) Alcatel_5054O"; }
        else if ("ALCATEL ONE TOUCH P310X".equals(model)) { return "TCT (Alcatel) ONE_TOUCH_P310X"; }
        else if ("ALCATEL ONE TOUCH P310A".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH P310A"; }
        else if ("Andromax G36C1H".equals(model)) { return "Smartfren G36C1H"; }
        else if ("Andromax G36C1G".equals(model)) { return "Smartfren G36C1G"; }
        else if ("ASUS_Z00ADA".equals(model)) { return "Asus ZenFone 2 (ZE551ML)"; }
        else if ("Aquaris X5".equals(model)) { return "bq Aquaris X5"; }
        else if ("Archos 50 Helium 4G".equals(model)) { return "Archos 50 Helium 4G"; }
        else if ("ALCATEL ONE TOUCH 993D".equals(model)) { return "TCT (Alcatel) TCL A988"; }
        else if ("A521L".equals(model)) { return "TCT (Alcatel) A521L"; }
        else if ("ALCATEL_one_touch_991".equals(model)) { return "TCT (Alcatel) ALCATEL_one_touch_991"; }
        else if ("ALCATEL_one_touch_990".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("ALCATEL_one_touch_995".equals(model)) { return "TCT (Alcatel) ATEL ONE TOUCH 995"; }
        else if ("A31".equals(model)) { return "Oppo A31"; }
        else if ("ASUS_L001".equals(model)) { return "Asus Zenfone Go"; }
        else if ("Archos 59 Xenon".equals(model)) { return "Archos 59 Xenon"; }
        else if ("Alcatel one touch 908F Orange".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("AX1055".equals(model)) { return "BMobile AX1055"; }
        else if ("ASUS_Z011D".equals(model)) { return "Asus ZenFone 2 Laser (ZE601KL)"; }
        else if ("ALCATEL_ONE_TOUCH_991_Orange".equals(model)) { return "TCT (Alcatel) ALCATEL_ONE_TOUCH_991_Orange"; }
        else if ("A5_Quad_Plus_TM".equals(model)) { return "AllView A5 Quad Plus"; }
        else if ("ATH-UL00".equals(model)) { return "Huawei ATH-UL00"; }
        else if ("A1-810".equals(model)) { return "Acer Iconia A1-810"; }
        else if ("A1-811".equals(model)) { return "Acer A1-811"; }
        else if ("Aquaris E6".equals(model)) { return "bq Aquaris E6"; }
        else if ("Aquaris E5".equals(model)) { return "bq Aquaris E5"; }
        else if ("Aquaris E4".equals(model)) { return "bq Aquaris E4"; }
        else if ("ASUS Transformer Pad TF300TG".equals(model)) { return "ASUS Transformer Pad TF300TG"; }
        else if ("ASUS Transformer Pad TF300TL".equals(model)) { return "ASUS Transformer Pad TF300TL"; }
        else if ("Archos 101d Neon".equals(model)) { return "Archos 101D Neon"; }
        else if ("A0001".equals(model)) { return "OnePlus One"; }
        else if ("ASUS_T00I-D".equals(model)) { return "Asus ZenFone 4 (A400CG)"; }
        else if ("Air".equals(model)) { return "Mobicell Air"; }
        else if ("Archos 90b Neon".equals(model)) { return "Archos 90b Neon"; }
        else if ("A6_Duo".equals(model)) { return "AllView A6 Duo"; }
        else if ("ALCATEL ONE TOUCH 5037A".equals(model)) { return "TCT (Alcatel) ALCATEL_ONE_TOUCH_5037A"; }
        else if ("ALCATEL ONE TOUCH 5037X".equals(model)) { return "TCT (Alcatel) ALCATEL_ONE_TOUCH_5037X"; }
        else if ("A17".equals(model)) { return "Toshiba AT7-C"; }
        else if ("A11".equals(model)) { return "Oppo A11"; }
        else if ("A1P".equals(model)) { return "ZTE A1P"; }
        else if ("A1R".equals(model)) { return "ZTE A1R"; }
        else if ("AX1020".equals(model)) { return "BMobile AX1020"; }
        else if ("A5_Ready".equals(model)) { return "AllView A5 Ready"; }
        else if ("A01SH".equals(model)) { return "Sharp A01SH"; }
        else if ("ALCATEL ONE TOUCH 6050Y".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("A205".equals(model)) { return "Toshiba Astro-20"; }
        else if ("A204".equals(model)) { return "Toshiba A204"; }
        else if ("ARCHOS 101 Titanium".equals(model)) { return "Archos 101 Titanium"; }
        else if ("A955".equals(model)) { return "Motorola Droid II"; }
        else if ("A953".equals(model)) { return "Motorola Milestone2"; }
        else if ("A726_Infinity_Lite".equals(model)) { return "Gtel A726 Infinity Lite"; }
        else if ("Agora Lite".equals(model)) { return "BenQ Agora_Lite"; }
        else if ("ALCATEL ONE TOUCH 7025D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7025D"; }
        else if ("A450TL".equals(model)) { return "TCT (Alcatel) A450TL"; }
        else if ("arc 10HD".equals(model)) { return "Kobo Arc 10HD"; }
        else if ("Andromax G46D1Z".equals(model)) { return "ZTE Andromax G46D1Z"; }
        else if ("ALCATEL ONE TOUCH 5035A".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5035D"; }
        else if ("ALCATEL ONE TOUCH 5035E".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5035D"; }
        else if ("ALCATEL ONE TOUCH 5035D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5035D"; }
        else if ("ALCATEL ONE TOUCH 5035X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5035D"; }
        else if ("ALCATEL ONE TOUCH 5020D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("Andromax-c".equals(model)) { return "Hisense Andromax-c"; }
        else if ("A621BL".equals(model)) { return "TCT (Alcatel) A621BL"; }
        else if ("Archos 70c Cobalt".equals(model)) { return "Archos 70c Cobalt"; }
        else if ("Archos 80c Platinum".equals(model)) { return "Archos80cpl_loreal"; }
        else if ("A79".equals(model)) { return "HKC A79 Tablet"; }
        else if ("A78".equals(model)) { return "Micromax A78"; }
        else if ("A75".equals(model)) { return "Micromax A75"; }
        else if ("A73".equals(model)) { return "Micromax A73"; }
        else if ("A71".equals(model)) { return "Lava A71"; }
        else if ("Archos 90 Neon".equals(model)) { return "Archos 90 Neon"; }
        else if ("AS650C".equals(model)) { return "Panasonic AS650C"; }
        else if ("ALCATEL ONE TOUCH 8008D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 8008D"; }
        else if ("ALCATEL ONE TOUCH 4005D".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4005D"; }
        else if ("Aquaris E5 HD".equals(model)) { return "bq Aquaris E5 HD"; }
        else if ("ALCATEL ONE TOUCH 7024N".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH Fierce"; }
        else if ("ALCATEL ONE TOUCH 7024R".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 7024W"; }
        else if ("A930".equals(model)) { return "Enspert MG"; }
        else if ("ASUS_Z010D".equals(model)) { return "Asus Zenfone MAX (ZC550KL)"; }
        else if ("Archos 101b Copper".equals(model)) { return "Archos 101b Copper"; }
        else if ("Alcatel_one_touch_918_Orange".equals(model)) { return "TCT (Alcatel) Alcatel_one_touch_918_Orange"; }
        else if ("A1-850".equals(model)) { return "Acer Iconia One 8"; }
        else if ("A200".equals(model)) { return "Acer Iconia Tab A200"; }
        else if ("Archos 50 Helium Plus".equals(model)) { return "Archos 50 Helium Plus"; }
        else if ("Aquaris_A4.5".equals(model)) { return "bq Aquaris A4.5"; }
        else if ("ALCATEL ONETOUCH POP 7 LTE".equals(model)) { return "TCT (Alcatel) 9015W"; }
        else if ("Andromax C46B2G".equals(model)) { return "Smartfren Andromax C46B2G"; }
        else if ("Andromax C46B2H".equals(model)) { return "Haier C46B2H"; }
        else if ("ALCATEL ONE TOUCH 8008X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 8008D"; }
        return "";

    }
    public static String cMethod (String model) {
        if ("CT50".equals(model)) { return "Honeywell Dolphin CT50"; }
        else if ("C6943".equals(model)) { return "Sony Ericsson Xperia Z1"; }
        else if ("CASIO WSD-F10".equals(model)) { return "Casio Smart Outdoor Watch WSD-F10"; }
        else if ("Coolpad 5108".equals(model)) { return "Coolpad CP5108"; }
        else if ("Coolpad 5109".equals(model)) { return "Coolpad 5109"; }
        else if ("Connect 5".equals(model)) { return "Logicom S504"; }
        else if ("Coolpad 7296".equals(model)) { return "Coolpad 7296"; }
        else if ("Coolpad 8297L-I00".equals(model)) { return "Coolpad 8297L-I00"; }
        else if ("CK07T".equals(model)) { return "ClickN Kids"; }
        else if ("Cellcom 4G".equals(model)) { return "ZTE V793"; }
        else if ("CHM-U01".equals(model)) { return "Huawei CHM-U01"; }
        else if ("C6616".equals(model)) { return "Sony Xperia Z"; }
        else if ("C5120".equals(model)) { return "Kyocera Milano"; }
        else if ("C5121".equals(model)) { return "Kyocera Milano"; }
        else if ("Coolpad 5210A".equals(model)) { return "Coolpad CP5210A"; }
        else if ("Coolpad 8089Q".equals(model)) { return "Coolpad CP8089Q"; }
        else if ("Coolpad7920".equals(model)) { return "Coolpad7920"; }
        else if ("chagall".equals(model)) { return "Pegatron chagall"; }
        else if ("calgary".equals(model)) { return "Motorola Devour"; }
        else if ("CT10".equals(model)) { return "IDeaUSA CT10"; }
        else if ("C6903".equals(model)) { return "Sony Xperia Z1"; }
        else if ("C6902".equals(model)) { return "Sony Xperia Z1"; }
        else if ("Che1-CL20".equals(model)) { return "Huawei Che1-CL20"; }
        else if ("Cynus_F9_4G".equals(model)) { return "Mobistel Cynus F9 4G"; }
        else if ("Coolpad A520".equals(model)) { return "Coolpad CPA520"; }
        else if ("Coolpad 5891Q".equals(model)) { return "Coolpad5891Q"; }
        else if ("Coolpad 5891S".equals(model)) { return "Coolpad 5891S"; }
        else if ("Coolpad8295M".equals(model)) { return "Coolpad CP8295M"; }
        else if ("Cinema".equals(model)) { return "Enspert DARKSIDE"; }
        else if ("C1+".equals(model)) { return "Condor C1+"; }
        else if ("Coolpad8908".equals(model)) { return "Coolpad8908"; }
        else if ("CINKPLUS".equals(model)) { return "Enspert WIKO CINK+"; }
        else if ("Clear".equals(model)) { return "Wintec T750"; }
        else if ("Coolmini".equals(model)) { return "Coolpad Coolmini"; }
        else if ("Coolpad 5217".equals(model)) { return "Coolpad 5217"; }
        else if ("Connect503".equals(model)) { return "Logicom Connect503"; }
        else if ("Connect502".equals(model)) { return "Sourcing Creation Connect502"; }
        else if ("Connect504".equals(model)) { return "Sourcing Creation Connect 504"; }
        else if ("Coolpad 8198W".equals(model)) { return "Coolpad 8198W"; }
        else if ("Cintiq Companion Hybrid 13HD".equals(model)) { return "WACOM Cintiq Companion Hybrid 13HD"; }
        else if ("Cynus F3".equals(model)) { return "Enspert Cynus F3"; }
        else if ("Cynus F4".equals(model)) { return "WIKO IGGY"; }
        else if ("CMP749".equals(model)) { return "Anydata iCraig CMP749"; }
        else if ("Coolpad 5879T".equals(model)) { return "Coolpad5879T"; }
        else if ("Coolpad 5200".equals(model)) { return "Coolpad 5200"; }
        else if ("Cosmote Xplore".equals(model)) { return "ZTE Cosmote Xplore"; }
        else if ("Coolpad CM001".equals(model)) { return "Coolpad CM001"; }
        else if ("Coolpad 9150W".equals(model)) { return "Coolpad 9150W"; }
        else if ("Clempad2_XL".equals(model)) { return "Clementoni Clempad 4.4 XL"; }
        else if ("C1904".equals(model)) { return "Sony Xperia M"; }
        else if ("C1905".equals(model)) { return "Sony Xperia M"; }
        else if ("CKT3".equals(model)) { return "ESI Enterprises CKT3"; }
        else if ("C5502".equals(model)) { return "Sony Xperia ZR"; }
        else if ("C5503".equals(model)) { return "Sony Xperia ZR"; }
        else if ("Carl".equals(model)) { return "ZTE Racer"; }
        else if ("CSL_Spice_MI700".equals(model)) { return "Foxconn CSL Spice MI700"; }
        else if ("C8690".equals(model)) { return "Cellon CJ-1984"; }
        else if ("Candy".equals(model)) { return "Mobicell Candy"; }
        else if ("Che1-L04".equals(model)) { return "Huawei Che1-L04"; }
        else if ("C6Quad_4G".equals(model)) { return "AllView C6 Quad 4G"; }
        else if ("Coolpad 7320".equals(model)) { return "Coolpad7320"; }
        else if ("Cygnus45".equals(model)) { return "MobiWire Cygnus"; }
        else if ("CMB405".equals(model)) { return "Hisense CMB405"; }
        else if ("CMP_765".equals(model)) { return "Haier CMP_765"; }
        else if ("Che2-L11".equals(model)) { return "Huawei Che2-L11"; }
        else if ("CN51 NC0".equals(model)) { return "Intermec CN51"; }
        else if ("Clempad_HR".equals(model)) { return "Clementoni Clempad HR"; }
        else if ("CT726".equals(model)) { return "Carrefour CT726"; }
        else if ("CHN-UCAN MJ".equals(model)) { return "CHN TELECOM CHN-UCAN MJ"; }
        else if ("Coolpad 8079".equals(model)) { return "Coolpad 8079"; }
        else if ("Cherry_Mobile_Touch_HD".equals(model)) { return "Cherry Mobile Touch HD"; }
        else if ("CHERRY".equals(model)) { return "Mobicell CHERRY"; }
        else if ("CN51 QCU".equals(model)) { return "Intermec CN51"; }
        else if ("CN51 QCF".equals(model)) { return "Intermec CN51"; }
        else if ("CN51 QC0".equals(model)) { return "Intermec CN51"; }
        else if ("Cynus_F10".equals(model)) { return "Mobistel Cynus F10"; }
        else if ("C6843".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("CN51 NN0".equals(model)) { return "Intermec CN51"; }
        else if ("CINK FIVE".equals(model)) { return "Enspert Wiko CINK FIVE"; }
        else if ("Coolpad 8970L".equals(model)) { return "Coolpad 8970L"; }
        else if ("CT7".equals(model)) { return "IDeaUSA CT7"; }
        else if ("CT3".equals(model)) { return "Olive Oil OliveOil Model 3"; }
        else if ("CT8".equals(model)) { return "iDea USA CT8"; }
        else if ("C5215".equals(model)) { return "Kyocera Hydro EDGE"; }
        else if ("CINK KING".equals(model)) { return "Enspert CINK KING"; }
        else if ("Coolpad 8735".equals(model)) { return "Coolpad CP8735"; }
        else if ("Coolpad 8736".equals(model)) { return "Coolpad 8736"; }
        else if ("CF10".equals(model)) { return "Saltillo CF10"; }
        else if ("CUBE_LTE".equals(model)) { return "Myphone Cube LTE"; }
        else if ("C15150m".equals(model)) { return "KD Interactive C15150m"; }
        else if ("CD8100".equals(model)) { return "Kyocera LifeWatch Universal Gateway"; }
        else if ("C14100".equals(model)) { return "KD Interactive Kurio Tab - Extrem"; }
        else if ("C6802".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("C6806".equals(model)) { return "Sony Ericsson Xperia Z Ultra"; }
        else if ("CP-DX70".equals(model)) { return "Cisco Desktop Collaboration Experience DX70"; }
        else if ("Coolpad8198T".equals(model)) { return "Coolpad8198T"; }
        else if ("CYCLONE_ODYSSEY".equals(model)) { return "Haier CYCLONE_ODYSSEY"; }
        else if ("CLEMPADCALL".equals(model)) { return "Clementoni Clempad Call"; }
        else if ("C525c".equals(model)) { return "HTC One SV"; }
        else if ("C6750".equals(model)) { return "Kyocera Hydro Elite"; }
        else if ("C6806_GPe".equals(model)) { return "Sony Smartphone Z Ultra Google Play edition"; }
        else if ("CT1020W".equals(model)) { return "Carrefour CT1020W"; }
        else if ("CMP748".equals(model)) { return "Anydata iCraig CMP748"; }
        else if ("Coolpad 8297D".equals(model)) { return "Coolpad 8297D"; }
        else if ("Coolpad 8297W".equals(model)) { return "Coolpad8297W"; }
        else if ("Cybook-Tablet".equals(model)) { return "Booken Cybook Tablet"; }
        else if ("Coolpad 7298A".equals(model)) { return "Coolpad7298A"; }
        else if ("Cosmote Smart Share".equals(model)) { return "ZTE Cosmote Smart Share"; }
        else if ("C6730".equals(model)) { return "Kyocera Hydro Icon"; }
        else if ("Classic".equals(model)) { return "GSmart Classic"; }
        else if ("Cosmic".equals(model)) { return "Explay Cosmic"; }
        else if ("CETAB9ML9".equals(model)) { return "Haier CETAB9ML9"; }
        else if ("CEH1".equals(model)) { return "Sanyo CEH1"; }
        else if ("Clempad2_special".equals(model)) { return "Clementoni Clempad 4.4 Basic Special"; }
        else if ("CS180".equals(model)) { return "Infocus CS1 8.0"; }
        else if ("CHM-CL00".equals(model)) { return "Huawei CHM-CL00"; }
        else if ("Connect 451".equals(model)) { return "Sourcing Creation Connect 451"; }
        else if ("C1504".equals(model)) { return "Sony Xperia E"; }
        else if ("C1505".equals(model)) { return "Sony Xperia E"; }
        else if ("Coolpad 5315".equals(model)) { return "Coolpad5315"; }
        else if ("Coolpad 5310".equals(model)) { return "Coolpad CP5310"; }
        else if ("Clempad_HR_Plus".equals(model)) { return "Clementoni Clempad HR Plus"; }
        else if ("Cygnus".equals(model)) { return "MobiWire Cygnus"; }
        else if ("C6506".equals(model)) { return "Sony Xperia ZL"; }
        else if ("C6503".equals(model)) { return "Sony Xperia ZL"; }
        else if ("C6502".equals(model)) { return "Sony Xperia ZL"; }
        else if ("Coolpad 5952".equals(model)) { return "Coolpad CP5952"; }
        else if ("Coolpad 5950".equals(model)) { return "Coolpad5950"; }
        else if ("Cynus T5".equals(model)) { return "Enspert Wiko CINK FIVE"; }
        else if ("Cynus T2".equals(model)) { return "Enspert CINK KING"; }
        else if ("CMB501".equals(model)) { return "Hisense CMB501"; }
        else if ("CP-DX650".equals(model)) { return "Cisco CP-DX650"; }
        else if ("C6906".equals(model)) { return "Sony Ericsson Xperia Z1"; }
        else if ("C5170".equals(model)) { return "Kyocera Hydro"; }
        else if ("CUBOT_ONE".equals(model)) { return "Cubot One"; }
        else if ("C6522".equals(model)) { return "Kyocera Hydro XTRM"; }
        else if ("Clempad2_plus".equals(model)) { return "Clementoni Clempad 4.4 Plus"; }
        else if ("CT1000".equals(model)) { return "Nuvision TM1088"; }
        else if ("Coolpad 7295C_C00".equals(model)) { return "Coolpad7295C_C00"; }
        else if ("Coolpad 7295T".equals(model)) { return "Coolpad7295T"; }
        else if ("Coolpad 7295A".equals(model)) { return "Coolpad 7295A"; }
        else if ("Coolpad 7295C".equals(model)) { return "Coolpad7295C"; }
        else if ("Cynus T6".equals(model)) { return "mobistel Cynus T6"; }
        else if ("Coolpad 7295+".equals(model)) { return "Coolpad 7295A"; }
        else if ("Cygnus mini".equals(model)) { return "Mobiwire Cygnus mini"; }
        else if ("Coolpad 9190L".equals(model)) { return "Coolpad CP9190L"; }
        else if ("CETAB7ML9".equals(model)) { return "Haier CETAB7ML9"; }
        else if ("Coolpad 9190_T00".equals(model)) { return "Coolpad 9190_T00"; }
        else if ("C2105".equals(model)) { return "Sony Xperia L"; }
        else if ("C2104".equals(model)) { return "Sony Xperia L"; }
        else if ("C2107".equals(model)) { return "Infocus C7"; }
        else if ("Cygnus_mini".equals(model)) { return "Mobiwire Cygnus mini"; }
        else if ("COOLPIX S810c".equals(model)) { return "Nikon COOLPIX S810c"; }
        else if ("Comet".equals(model)) { return "Huawei IDEOS"; }
        else if ("Coolpad 5218S".equals(model)) { return "Coolpad 5218S"; }
        else if ("Coolpad 8089".equals(model)) { return "Coolpad CP8089"; }
        else if ("Camelio Family tablet".equals(model)) { return "Anydata Vivitar Camelio Tablet"; }
        else if ("COOLPIX S800c".equals(model)) { return "Nikon COOLPIX"; }
        else if ("C600".equals(model)) { return "QLA C600"; }
        else if ("CI".equals(model)) { return "Cellon CI"; }
        else if ("Coolpad8085Q".equals(model)) { return "Coolpad8085Q"; }
        else if ("Commtiva-N700".equals(model)) { return "Foxconn Commtiva N700"; }
        else if ("C6606".equals(model)) { return "Sony Xperia Z"; }
        else if ("C6602".equals(model)) { return "Sony Xperia Z"; }
        else if ("C6603".equals(model)) { return "Sony Xperia Z"; }
        else if ("C6916".equals(model)) { return "Sony Xperia Z1S"; }
        else if ("C02BB1".equals(model)) { return "KDDI Power Up Unit"; }
        else if ("Coolpad 5219_C00".equals(model)) { return "Coolpad 5219_C00"; }
        else if ("CER2".equals(model)) { return "Sanyo CER2"; }
        else if ("CER3".equals(model)) { return "Sanyo CER3"; }
        else if ("C6530N".equals(model)) { return "Kyocera Hydro Life"; }
        else if ("CINK SLIM 2".equals(model)) { return "WIKO CINK SLIM 2"; }
        else if ("CMP 756".equals(model)) { return "ICRAIG CMP 756"; }
        else if ("Coolpad 5872".equals(model)) { return "Coolpad5872"; }
        else if ("Che1-CL10".equals(model)) { return "Huawei Che1-CL10"; }
        else if ("Casper_VIA_A6108".equals(model)) { return "Foxconn Casper_VIA_A6108"; }
        else if ("CHC-U23".equals(model)) { return "Huawei CHC-U23"; }
        else if ("Clempad_HR_XL".equals(model)) { return "Clementoni Clempad 5.0 XL"; }
        else if ("C6522N".equals(model)) { return "Kyocera Hydro XTRM"; }
        else if ("Coolpad 5951".equals(model)) { return "Coolpad 5951"; }
        else if ("Coolpad 5219".equals(model)) { return "Coolpad 5219"; }
        else if ("CMP797".equals(model)) { return "iCraig CMP797"; }
        else if ("CMP793".equals(model)) { return "iCraig CMP793"; }
        else if ("CMP791".equals(model)) { return "iCraig CMP791"; }
        else if ("CMP798".equals(model)) { return "iCraig CMP798"; }
        else if ("Coolpad_5218D".equals(model)) { return "Coolpad5218D"; }
        else if ("Coolpad 9970".equals(model)) { return "Coolpad CP9970"; }
        else if ("Coolpad 8021".equals(model)) { return "Coolpad CP8021"; }
        else if ("Coolpad 5216D".equals(model)) { return "Coolpad 5216D"; }
        else if ("CN51 QN0".equals(model)) { return "Intermec CN51"; }
        else if ("CEA1".equals(model)) { return "Sanyo CEA1"; }
        else if ("CHC-U01".equals(model)) { return "Huawei CHC-U01"; }
        else if ("CHC-U03".equals(model)) { return "Huawei CHC-U03"; }
        else if ("C1605".equals(model)) { return "Sony Xperia E dual"; }
        else if ("C1604".equals(model)) { return "Sony Xperia E dual"; }
        else if ("CN51 NCU".equals(model)) { return "Intermec CN51"; }
        else if ("CN51 NCF".equals(model)) { return "Intermec CN51"; }
        else if ("C20".equals(model)) { return "Hisense c20ae"; }
        else if ("Connect551".equals(model)) { return "Sourcing Creation Connect551"; }
        else if ("Cynus E7".equals(model)) { return "Mobistel Cynus E7"; }
        else if ("Condroid_X7".equals(model)) { return "Polaris_Condroid_X7"; }
        else if ("Coolpad8750".equals(model)) { return "Coolpad CP8750"; }
        else if ("C15100m".equals(model)) { return "KD Interactive C15100m"; }
        else if ("C15100i".equals(model)) { return "KD Interactive C15100i"; }
        else if ("Chacer".equals(model)) { return "AG Mobile Chacer"; }
        else if ("CT710".equals(model)) { return "Anydata Carrefour CT710"; }
        else if ("C5155".equals(model)) { return "Kyocera Rise"; }
        else if ("Coolpad Flo".equals(model)) { return "Coolpad Flo"; }
        else if ("Coolpad 7230S".equals(model)) { return "Coolpad 7230S"; }
        else if ("C8817D".equals(model)) { return "Huawei C8817D"; }
        else if ("CETAB10KML9".equals(model)) { return "Haier CETAB10KML9"; }
        else if ("CT2200".equals(model)) { return "Quanta CT2200"; }
        else if ("CNPC Security Pad S1".equals(model)) { return "HUAWEI MediaPad M1 8.0"; }
        else if ("C8660".equals(model)) { return "Cellon SM55"; }
        else if ("CARBON_PRO4543".equals(model)) { return "Polaroid V45M"; }
        else if ("Coolpad T1".equals(model)) { return "Coolpad CPT1"; }
        else if ("Coolpad 8720L".equals(model)) { return "Coolpad8720L"; }
        else if ("C-6".equals(model)) { return "Condor C_5"; }
        else if ("C-4".equals(model)) { return "Hisense C-4"; }
        else if ("C2004".equals(model)) { return "Sony Xperia M dual"; }
        else if ("C2005".equals(model)) { return "Sony Xperia M dual"; }
        else if ("C6833".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("Coolpad 7298D".equals(model)) { return "Coolpad7298D"; }
        else if ("C3668".equals(model)) { return "Cellon C3668"; }
        else if ("CP-DX80".equals(model)) { return "Cisco Desktop Collaboration Experience DX80"; }
        else if ("CINK PEAX".equals(model)) { return "Enspert WIKO CINK PEAX"; }
        else if ("Che2-L23".equals(model)) { return "Huawei Che2-L23"; }
        else if ("CEA3".equals(model)) { return "Sanyo CEA3"; }
        else if ("Coolpad 7275".equals(model)) { return "Coolpad 7275"; }
        else if ("Coolpad 7270".equals(model)) { return "Coolpad 7270"; }
        else if ("Coolpad 8729".equals(model)) { return "Coolpad 8729"; }
        else if ("Che2-UL00".equals(model)) { return "Huawei Che2-UL00"; }
        else if ("CJ-1984".equals(model)) { return "Cellon CJ-1984"; }
        else if ("CINK SLIM".equals(model)) { return "Enspert CINK SLIM"; }
        else if ("Coolpad 7251".equals(model)) { return "Coolpad 7251"; }
        else if ("Che2-TL00M".equals(model)) { return "Huawei Che2-TL00M"; }
        else if ("Che2-TL00H".equals(model)) { return "Huawei Che2-TL00H"; }
        else if ("CT820".equals(model)) { return "Carrefour CT820"; }
        else if ("CT825".equals(model)) { return "Haier CT825"; }
        else if ("CT826".equals(model)) { return "Carrefour CT826"; }
        else if ("C6743".equals(model)) { return "Kyocera Hydro REACH"; }
        else if ("C6742".equals(model)) { return "Kyocera Hydro VIEW"; }
        else if ("Coolpad 8705".equals(model)) { return "Coolpad8705"; }
        else if ("Coolpad 7061".equals(model)) { return "Coolpad 7061"; }
        else if ("C6740N".equals(model)) { return "Kyocera Hydro WAVE"; }
        else if ("Classic_Pro".equals(model)) { return "GSmart Classic_Pro"; }
        else if ("Coolpad 5892".equals(model)) { return "Coolpad5892"; }
        else if ("Coolpad 5891".equals(model)) { return "Coolpad 5891"; }
        else if ("C9660".equals(model)) { return "YotaPhone C9660"; }
        else if ("CEM1".equals(model)) { return "Sanyo 55CE6139M1"; }
        else if ("Coolpad 7232".equals(model)) { return "Coolpad 7232"; }
        else if ("Coolpad 7236".equals(model)) { return "Coolpad cp7236"; }
        else if ("Coolpad 9250L".equals(model)) { return "Coolpad CP9250L"; }
        else if ("C6725".equals(model)) { return "Kyocera Hydro VIBE"; }
        else if ("Coolpad 9970L".equals(model)) { return "Coolpad 9970L"; }
        else if ("CDP7TAB4C8".equals(model)) { return "Haier CDP7TAB4C8"; }
        else if ("C6_Duo".equals(model)) { return "AllView C6 Duo"; }
        else if ("Coolpad 8971".equals(model)) { return "Coolpad 8971"; }
        else if ("COUPLE".equals(model)) { return "Foxconn MUSN COUPLE"; }
        else if ("Che2-TL00".equals(model)) { return "Huawei Che2-TL00"; }
        else if ("Coolpad 8730L".equals(model)) { return "Coolpad 8730L"; }
        else if ("CP-VL5A".equals(model)) { return "Hipstreet CP-VL5A"; }
        else if ("CMB510".equals(model)) { return "Hisense CMB510"; }
        else if ("Constellation V".equals(model)) { return "Vertu Constellation V"; }
        else if ("CMP 759".equals(model)) { return "ICRAIG CMP 759"; }
        else if ("CP3700A".equals(model)) { return "Coolpad 3700A"; }
        else if ("Coolpad 7296S".equals(model)) { return "Coolpad7296S"; }
        else if ("CP-D403".equals(model)) { return "Megahouse CP-D403"; }
        else if ("Coolpad 7620L".equals(model)) { return "Coolpad 7620L"; }
        else if ("Coolpad 8122".equals(model)) { return "Coolpad 8122"; }
        else if ("C6740".equals(model)) { return "Kyocera Hydro WAVE"; }
        else if ("CLP293".equals(model)) { return "iCraig CLP293"; }
        else if ("Coolpad 5950T".equals(model)) { return "Coolpad5950T"; }
        else if ("CT1030".equals(model)) { return "Haier CT1030"; }
        else if ("CM990".equals(model)) { return "Huawei Evolution III"; }
        else if ("Craft".equals(model)) { return "Explay Craft"; }
        else if ("Coolpad 7270_W00".equals(model)) { return "Coolpad7270_W00"; }
        else if ("Coolpad 9976A".equals(model)) { return "Coolpad 9976A"; }
        else if ("C5302".equals(model)) { return "Sony Xperia SP"; }
        else if ("C5303".equals(model)) { return "Sony Xperia SP"; }
        else if ("C5306".equals(model)) { return "Sony Xperia SP"; }
        else if ("CS-1A13".equals(model)) { return "Dell Cloud Connect"; }
        else if ("C2305".equals(model)) { return "Sony Xperia C"; }
        else if ("C2304".equals(model)) { return "Sony Xperia C"; }
        else if ("Chronos_10".equals(model)) { return "Njoy Chronos_10"; }
        else if ("Chagall 10.1 WiFi".equals(model)) { return "Pegatron chagall"; }
        else if ("C6530".equals(model)) { return "Kyocera Hydro LIFE"; }
        else if ("CT301_W818".equals(model)) { return "Haier CT301_W818"; }
        else if ("CT1010".equals(model)) { return "Enspert Carrefour CT1010"; }
        return "";

    }
    public static String bMethod (String model) {
        if ("Beeline Pro".equals(model)) { return "ZTE Blade Q Lux"; }
        else if ("Blade Apex2".equals(model)) { return "ZTE Blade Apex2"; }
        else if ("b1-720".equals(model)) { return "Acer B1-720"; }
        else if ("Blade A465".equals(model)) { return "ZTE Blade A465"; }
        else if ("BLU TOUCHBOOK M7".equals(model)) { return "BLU TOUCHBOOK M7"; }
        else if ("B15".equals(model)) { return "CAT B15"; }
        else if ("B1-730HD".equals(model)) { return "Acer Iconia One 7"; }
        else if ("BLU STUDIO G PLUS".equals(model)) { return "Blu STUDIO G PLUS"; }
        else if ("Bmobile_AX810".equals(model)) { return "BMobile AX810"; }
        else if ("BLU NEO X PLUS".equals(model)) { return "Blu NEO X PLUS"; }
        else if ("Blade Q Maxi".equals(model)) { return "ZTE Orange Reyo"; }
        else if ("Bush 8.0 MyTablet".equals(model)) { return "Archos Bush 8.0 MyTablet"; }
        else if ("b1-721".equals(model)) { return "Acer B1-721"; }
        else if ("Blade L5".equals(model)) { return "ZTE Blade L5"; }
        else if ("Blade L2".equals(model)) { return "ZTE Blade L2"; }
        else if ("Blade L3".equals(model)) { return "ZTE Blade L3"; }
        else if ("BGH Joy Smart AXS D".equals(model)) { return "ZTE Blade L2"; }
        else if ("Beeline E700".equals(model)) { return "ZTE V807"; }
        else if ("BNT-710".equals(model)) { return "RCA BNT-710"; }
        else if ("B1-A71".equals(model)) { return "Acer B1-A71"; }
        else if ("Beeline Tab".equals(model)) { return "Beeline Tab"; }
        else if ("Bouygues Telecom Bs 402".equals(model)) { return "ZTE Bouygues Telecom Bs 402"; }
        else if ("Bouygues Telecom Bs 403".equals(model)) { return "Hisense U607"; }
        else if ("Blade A460".equals(model)) { return "ZTE Blade A460"; }
        else if ("B505".equals(model)) { return "BenQ B505"; }
        else if ("B502".equals(model)) { return "BenQ B502"; }
        else if ("BLU STUDIO ONE".equals(model)) { return "Blu Studio One"; }
        else if ("Beeline_Pro_3".equals(model)) { return "Beeline Pro 3"; }
        else if ("Blade G Pro".equals(model)) { return "ZTE V829"; }
        else if ("BGH Joy Smart A1".equals(model)) { return "ZTE V795"; }
        else if ("BGH Joy Smart A3".equals(model)) { return "ZTE V829"; }
        else if ("BGH Joy Smart A2".equals(model)) { return "ZTE V809"; }
        else if ("BKO-S200".equals(model)) { return "SK Broadband B tv smart"; }
        else if ("Boost View 5.0".equals(model)) { return "TCT (Alcatel) Boost View 5.0"; }
        else if ("Beeline M2".equals(model)) { return "ZTE V9"; }
        else if ("Bphone B1115".equals(model)) { return "BKAV Bphone"; }
        else if ("Blade L3 Plus".equals(model)) { return "ZTE Blade L3 Plus"; }
        else if ("BLADE A510".equals(model)) { return "ZTE BLADE A510"; }
        else if ("BT Home SmartPhone S II".equals(model)) { return "British Telecom HomeSmartphone d800"; }
        else if ("BLU STUDIO 7.0 LTE".equals(model)) { return "Blu STUDIO 7.0 LTE"; }
        else if ("BLACK 03".equals(model)) { return "ZTE V9"; }
        else if ("Beeline Pro 2".equals(model)) { return "Beeline Pro 2"; }
        else if ("Bittium Tough Mobile".equals(model)) { return "Bittium Tough Mobile"; }
        else if ("BGH Joy Smart A6".equals(model)) { return "ZTE Blade G Lux"; }
        else if ("BLU LIFE XL".equals(model)) { return "BLU LIFE XL"; }
        else if ("BGH Joy Smart AXS".equals(model)) { return "ZTE Blade L2"; }
        else if ("B502_SA".equals(model)) { return "BenQ B502"; }
        else if ("Blade L3 Lite".equals(model)) { return "ZTE Blade L3 Lite"; }
        else if ("Blade G Lux".equals(model)) { return "ZTE Blade G Lux"; }
        else if ("bq_Aquaris_5_HD".equals(model)) { return "bq Aquaris 5 HD"; }
        else if ("B8405".equals(model)) { return "ZTE V815W"; }
        else if ("B760H".equals(model)) { return "ZTE B760E"; }
        else if ("B760E".equals(model)) { return "ZTE B760E"; }
        else if ("Beeline Smart 6".equals(model)) { return "Beeline Smart 6"; }
        else if ("Brilliant".equals(model)) { return "Explay Brilliant"; }
        else if ("BRAVIA 4K GB".equals(model)) { return "Sony BRAVIA 4K GB"; }
        else if ("BOSCH_E10316".equals(model)) { return "Medion LIFETAB E10316"; }
        else if ("B1-750".equals(model)) { return "Acer Iconia One 7"; }
        else if ("BenQ F5".equals(model)) { return "BenQ F5"; }
        else if ("Beeline E600".equals(model)) { return "ZTE Beeline E600"; }
        else if ("Bucare Y330-U05".equals(model)) { return "Huawei Y330"; }
        else if ("Blade G LTE".equals(model)) { return "ZTE Blade G LTE"; }
        else if ("B1-820".equals(model)) { return "Acer B1-820"; }
        else if ("BRAVIA 2015".equals(model)) { return "Sony BRAVIA 4K 2015"; }
        else if ("BenQ A3s".equals(model)) { return "BenQ F4"; }
        else if ("BenQ A3c".equals(model)) { return "BenQ A3c"; }
        else if ("BNT-700K".equals(model)) { return "BLUEDOT BNT-700K"; }
        else if ("BUSH 7.85 TABLET".equals(model)) { return "Bush MyTablet 79"; }
        else if ("Bush 7.0 MyTablet".equals(model)) { return "Archos Bush 7.0 MyTablet"; }
        else if ("BARRY".equals(model)) { return "WIKO Barry"; }
        else if ("BGH Joy Smart A5C".equals(model)) { return "ZTE V815W"; }
        else if ("B1-710".equals(model)) { return "Acer B1-710"; }
        else if ("B1-711".equals(model)) { return "Acer B1-711"; }
        else if ("BGH Joy Smart A5d".equals(model)) { return "ZTE V815W"; }
        else if ("Blade A510".equals(model)) { return "ZTE BLADE A510"; }
        else if ("Blade V580".equals(model)) { return "ZTE Turk Telekom TT175"; }
        else if ("BGH Joy Smart A7G".equals(model)) { return "ZTE Blade Q Lux"; }
        else if ("B506_TW".equals(model)) { return "BenQ B506"; }
        else if ("Blade Super".equals(model)) { return "ZTE Grand X Pro"; }
        else if ("BB8252".equals(model)) { return "Bigben BB8252"; }
        else if ("B1-730".equals(model)) { return "Acer Iconia One 7"; }
        else if ("BLADE_N880".equals(model)) { return "ZTE Blade"; }
        else if ("Beeline Smart Dual".equals(model)) { return "Beeline Smart Dual"; }
        else if ("Blade S6".equals(model)) { return "ZTE Blade S6 Lite"; }
        else if ("BUSH 10.1 TABLET".equals(model)) { return "Archos My Tablet 101"; }
        else if ("Blade S6 Plus".equals(model)) { return "ZTE Blade S6 Plus"; }
        else if ("Bouygues Telecom Bs 351".equals(model)) { return "ZTE Bouygues Telecom Bs 351"; }
        else if ("BASE Lutea 2".equals(model)) { return "ZTE BASE Lutea 2"; }
        else if ("Boost".equals(model)) { return "AG Mobile Boost"; }
        else if ("Beeline Smart 2".equals(model)) { return "ZTE Beeline Smart 2"; }
        else if ("Beeline Smart 3".equals(model)) { return "Haier Beeline Smart 3"; }
        else if ("Beeline Smart 4".equals(model)) { return "Hipstreet Beeline smart 4"; }
        else if ("Beeline Smart 5".equals(model)) { return "Hipstreet Beeline_Smart_5"; }
        else if ("Blade Q2".equals(model)) { return "ZTE Blade Q2"; }
        else if ("BM180".equals(model)) { return "Bluebird BM180"; }
        else if ("BGH Joy Smart AXS II".equals(model)) { return "ZTE N918St"; }
        else if ("BLADE E01".equals(model)) { return "ZTE Blade A476"; }
        else if ("Beeline_Tab_Fast".equals(model)) { return "Beeline_Tab_Fast"; }
        else if ("Blade Q Lux".equals(model)) { return "ZTE Blade Q Lux"; }
        else if ("BLU LIFE ONE X".equals(model)) { return "Blu LIFE ONE X"; }
        else if ("Blade S".equals(model)) { return "ZTE blade S"; }
        else if ("BLADE III_IL".equals(model)) { return "ZTE BLADE III_IL"; }
        else if ("Beeline_Tab_IS".equals(model)) { return "Beeline_Tab IS"; }
        else if ("BenQ T3".equals(model)) { return "BenQ T3_17A"; }
        else if ("Blade S6 Lite".equals(model)) { return "ZTE Blade S6 Lite"; }
        else if ("bq Aquaris".equals(model)) { return "Anydata Aquaris I8"; }
        else if ("Blade A410".equals(model)) { return "ZTE Blade A410"; }
        else if ("BLOOM".equals(model)) { return "Wiko BLOOM"; }
        else if ("Bay".equals(model)) { return "HighScreen Bay"; }
        else if ("BLU DASH X LTE".equals(model)) { return "Blu DASH X LTE"; }
        else if ("Blade A475".equals(model)) { return "ZTE Blade A475"; }
        else if ("Blade C341".equals(model)) { return "ZTE T221"; }
        else if ("Blade L2 Plus".equals(model)) { return "ZTE Blade L2 Plus"; }
        else if ("Bphone B1111".equals(model)) { return "BKAV Bphone"; }
        else if ("Bphone B1112".equals(model)) { return "BKAV Bphone"; }
        else if ("Bphone B1114".equals(model)) { return "BKAV Bphone"; }
        else if ("Bphone B1116".equals(model)) { return "BKAV Bphone"; }
        else if ("Bs 451".equals(model)) { return "Bouygues Telecom Bs 451"; }
        else if ("BT210".equals(model)) { return "Intel Yolo"; }
        else if ("Boston 4G".equals(model)) { return "Gigabyte Boston 4G"; }
        else if ("BLU STUDIO C HD".equals(model)) { return "Blu Studio C HD"; }
        else if ("BLU STUDIO X MINI".equals(model)) { return "Blu Studio X Mini"; }
        else if ("Baker".equals(model)) { return "ZTE Baker"; }
        else if ("BGH JOY X2".equals(model)) { return "ZTE Blade A475"; }
        else if ("Beeline Fast".equals(model)) { return "Beeline Fast"; }
        else if ("BT230".equals(model)) { return "Intel Etisalat E-20"; }
        else if ("BLU DASH X".equals(model)) { return "Blu Dash X"; }
        else if ("bq_Aquaris_5".equals(model)) { return "bq Aquaris 5"; }
        else if ("BLU LIFE MARK".equals(model)) { return "Blu Life Mark"; }
        else if ("B-KOOL".equals(model)) { return "Wiko B-KOOL"; }
        else if ("BIRDY".equals(model)) { return "Wiko BIRDY"; }
        else if ("BP-1001".equals(model)) { return "WoongjinThinkbig"; }
        else if ("Bush Mytablet 2".equals(model)) { return "Archos Bush Mytablet 2"; }
        else if ("Bit".equals(model)) { return "Explay Bit"; }
        else if ("Blade Apex".equals(model)) { return "ZTE Blade Apex"; }
        else if ("BGH Joy X5".equals(model)) { return "ZTE BGH Joy X5"; }
        else if ("BLU STUDIO SELFIE 2".equals(model)) { return "Blu STUDIO SELFIE 2"; }
        else if ("BLU NEO ENERGY MINI".equals(model)) { return "Blu NEO ENERGY MINI"; }
        else if ("Bush 10.0 MyTablet".equals(model)) { return "Archos Bush 10.0 MyTablet"; }
        else if ("BLU STUDIO ONE PLUS".equals(model)) { return "Blu STUDIO ONE PLUS"; }
        else if ("BRAVIA 4K 2015".equals(model)) { return "Sony BRAVIA 4K 2015"; }
        else if ("BASE_Lutea_3".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 997D"; }
        else if ("B1-810".equals(model)) { return "Acer Iconia One 8"; }
        else if ("Blade S Lite".equals(model)) { return "ZTE Blade S Lite"; }
        else if ("BGH Joy V6".equals(model)) { return "ZTE Blade V6"; }
        else if ("BouygtelTV".equals(model)) { return "Bouygues Telecom Bbox Miami"; }
        else if ("Beeline E400".equals(model)) { return "ZTE Blade"; }
        else if ("BUSH 7.0 TABLET".equals(model)) { return "Archos Bush MyTablet 7"; }
        else if ("Blackphone 2".equals(model)) { return "Silent Circle Blackphone 2"; }
        else if ("Blade III".equals(model)) { return "ZTE Blade III"; }
        else if ("B1-850".equals(model)) { return "Acer B1-850"; }
        else if ("Blade V6".equals(model)) { return "ZTE Blade V6"; }
        else if ("Blade V+".equals(model)) { return "ZTE Blade V+"; }
        else if ("B15Q".equals(model)) { return "Cat B15Q"; }
        else if ("BGH Joy Smart A6d".equals(model)) { return "ZTE Blade G Lux"; }
        else if ("BASE Tab".equals(model)) { return "ZTE V9"; }
        else if ("Beeline Smart2".equals(model)) { return "ZTE V811"; }
        else if ("BASE lutea".equals(model)) { return "ZTE Blade"; }
        else if ("B1-723".equals(model)) { return "Acer B1-723"; }
        else if ("BS472".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("BHX-S100".equals(model)) { return "SK Broadband B tv smart"; }
        else if ("B50".equals(model)) { return "BenQ B50"; }
        else if ("B50_CHT".equals(model)) { return "BenQ B50_CHT"; }
        else if ("BLU NEO X".equals(model)) { return "Blu NEO X"; }
        else if ("BGH Joy Smart AXS II D".equals(model)) { return "ZTE N918St"; }
        else if ("Bs 501".equals(model)) { return "Coolpad Bs501"; }
        else if ("Blade Vec".equals(model)) { return "ZTE Blade Vec"; }
        return "";

    }
    public static String eMethod (String model) {
        if ("E2033".equals(model)) { return "Sony Xperia E4g Dual"; }
        else if ("E6560T".equals(model)) { return "Kyocera DuraForce"; }
        else if ("E6560L".equals(model)) { return "Kyocera DuraForce"; }
        else if ("E6560C".equals(model)) { return "Kyocera DuraForce"; }
        else if ("E6833".equals(model)) { return "Sony Xperia Z5 Premium Dual"; }
        else if ("EVA-AL00".equals(model)) { return "Huawei P9"; }
        else if ("Epic_P7".equals(model)) { return "Vonino Epic P7"; }
        else if ("E5653".equals(model)) { return "Sony Xperia M5"; }
        else if ("e6_plus".equals(model)) { return "Gini e6_plus"; }
        else if ("EK-GN120".equals(model)) { return "Samsung Galaxy NX"; }
        else if ("EB-A71GJ".equals(model)) { return "Sharp EB-A71GJ"; }
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
        else if ("EVA-DL00".equals(model)) { return "Huawei P9"; }
        else if ("EVA-L19".equals(model)) { return "Huawei P9"; }
        else if ("ETL-S5042".equals(model)) { return "Etuline ETL-S5042"; }
        else if ("ELITE8Q".equals(model)) { return "Prestige ELITE8Q"; }
        else if ("EG929".equals(model)) { return "Hisense EG929"; }
        else if ("ELITE 4.7 HD".equals(model)) { return "Cellon CJ-1984"; }
        else if ("EG970".equals(model)) { return "Hisense EG970"; }
        else if ("EGQ178".equals(model)) { return "Ematic EGQ178"; }
        else if ("EG680".equals(model)) { return "Smartfren EG680"; }
        else if ("E600".equals(model)) { return "Acer Liquid E600"; }
        else if ("EASY1".equals(model)) { return "ucall EASY1"; }
        else if ("E-Tab10".equals(model)) { return "GeneralMobile E-Tab10"; }
        else if ("eZeeTab10D12-S".equals(model)) { return "Storex eZeeTab10D12-S"; }
        else if ("E815".equals(model)) { return "BYD K-Touch E815"; }
        else if ("Energy X 2".equals(model)) { return "Blu Energy X 2"; }
        else if ("E10319".equals(model)) { return "Medion microstar E10319"; }
        else if ("EVA-CL00".equals(model)) { return "Huawei P9"; }
        else if ("E6715".equals(model)) { return "Kyocera TorqueXT"; }
        else if ("ERA G2 Touch".equals(model)) { return "HTC Hero"; }
        else if ("E6782L".equals(model)) { return "Kyocera DuraScout"; }
        else if ("Elite9QL".equals(model)) { return "Visual Land Prestige Elite9QL"; }
        else if ("E39".equals(model)) { return "Acer Liquid E700"; }
        else if ("E5823".equals(model)) { return "Sony Xperia Z5 Compact"; }
        else if ("EVO".equals(model)) { return "HTC Evo"; }
        else if ("E2171SS".equals(model)) { return "Hisense Sero7"; }
        else if ("EM63".equals(model)) { return "DOPO EM63 Tablet"; }
        else if ("Ematic EGD170".equals(model)) { return "Ematic EGD170"; }
        else if ("em_i8180".equals(model)) { return "Emdoor EM_I8180"; }
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
        else if ("e6".equals(model)) { return "Gini e6_plus"; }
        else if ("Eris".equals(model)) { return "HTC Droid Eris"; }
        else if ("E6653".equals(model)) { return "Sony Xperia Z5"; }
        else if ("E15i".equals(model)) { return "Sony Ericsson Xperia X8"; }
        else if ("Elite11Q".equals(model)) { return "Visual Land Prestige Elite11Q"; }
        else if ("E6883".equals(model)) { return "Sony Xperia Z5 Premium Dual"; }
        else if ("EM9".equals(model)) { return "Emerson EM9"; }
        else if ("ELUGA_I2".equals(model)) { return "Panasonic Eluga I2"; }
        else if ("EGQ347".equals(model)) { return "Ematic EGQ347"; }
        else if ("Edison 3".equals(model)) { return "bq Edison 3"; }
        else if ("ENERGY XL".equals(model)) { return "Blu ENERGY  XL"; }
        else if ("EIS01PT".equals(model)) { return "Pantech MIRACH_J"; }
        else if ("E6633".equals(model)) { return "Sony Xperia Z5 dual"; }
        else if ("ETH102".equals(model)) { return "Ematic ETH102"; }
        else if ("era_X".equals(model)) { return "Lava Xolo Era X"; }
        else if ("E5533".equals(model)) { return "Sony Xperia C5 Ultra Dual"; }
        else if ("EGQ367".equals(model)) { return "Ematic EGQ367"; }
        else if ("EGP010".equals(model)) { return "Anydata ematic EGP010"; }
        else if ("ELUGA Note".equals(model)) { return "Panasonic Eluga_Note"; }
        else if ("E506".equals(model)) { return "NGM Italia SRL NGM Youcolor E506"; }
        else if ("E507".equals(model)) { return "NGM Italia SRL NGM Youcolor E507"; }
        else if ("E505".equals(model)) { return "NGM Italia SRL NGM Youcolor E505"; }
        else if ("E500".equals(model)) { return "TCT (Alcatel) E500"; }
        else if ("E501".equals(model)) { return "NGM Italia SRL NGM Youcolor E501"; }
        else if ("EVIANT_EVT10Q".equals(model)) { return "Eviant EVC10Q"; }
        else if ("EM749_748".equals(model)) { return "Emerson EM749/748"; }
        else if ("E2043".equals(model)) { return "Sony Xperia E4g Dual"; }
        else if ("E2281TK".equals(model)) { return "Hisense Sero 8"; }
        else if ("E2281UK".equals(model)) { return "Hisense Sero 8"; }
        else if ("E5553".equals(model)) { return "Sony Xperia C5 Ultra"; }
        else if ("Elite8QI".equals(model)) { return "Visual Land Prestige Elite8QI"; }
        else if ("EK-GC110".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("E380".equals(model)) { return "Acer Liquid E3"; }
        else if ("ETAB_M7023G".equals(model)) { return "Hipstreet ETAB_M7023G"; }
        else if ("E2281".equals(model)) { return "Hisense Sero 8"; }
        else if ("EV-S100".equals(model)) { return "KT Tech EV-S100"; }
        else if ("E3_Sign".equals(model)) { return "AllView E3 Sign"; }
        else if ("EGQ223".equals(model)) { return "Ematic EGQ223"; }
        else if ("Etisalat Smartphone".equals(model)) { return "ZTE-V6500"; }
        else if ("E2171MX".equals(model)) { return "Hisense Sero 7"; }
        else if ("Explosion".equals(model)) { return "Cellon Explosion"; }
        else if ("Ex-Handy 09".equals(model)) { return "Sonim Ex-Handy 09"; }
        else if ("E6790TM".equals(model)) { return "Kyocera DuraForce XD"; }
        else if ("Eluga_A2".equals(model)) { return "Panasonic Eluga A2"; }
        else if ("Eluga_Arc_2".equals(model)) { return "Panasonic Eluga Arc 2"; }
        else if ("Evo Energy4".equals(model)) { return "Fly Evo Energy4"; }
        else if ("Ex-Handy 209".equals(model)) { return "Sonimtech XP6"; }
        else if ("E2281SS".equals(model)) { return "Hisense Sero8"; }
        else if ("ECHO".equals(model)) { return "Mobicell ECHO"; }
        else if ("EVA-AL10".equals(model)) { return "Huawei P9"; }
        else if ("EVA-TL00".equals(model)) { return "Huawei P9"; }
        else if ("EM756".equals(model)) { return "Southern Telecom Emerson EM756"; }
        else if ("E1052GP".equals(model)) { return "LOGICOM E1052GP"; }
        else if ("E2171CA".equals(model)) { return "Hisense Sero 7"; }
        else if ("Essentielb-Black Diamond".equals(model)) { return "Essentielb- Black Diamond"; }
        else if ("Endeavour101".equals(model)) { return "Nuvision TM1088"; }
        else if ("E2281MX".equals(model)) { return "Hisense Sero 8"; }
        else if ("E852GP".equals(model)) { return "LOGICOM E852GP"; }
        else if ("EB-WX1GJ".equals(model)) { return "Sharp EB-WX1GJ/EB-W51GJ"; }
        else if ("EGS102".equals(model)) { return "Anydata ematic EGS102"; }
        else if ("EGS109".equals(model)) { return "EMATICEGS109"; }
        else if ("EG98".equals(model)) { return "Hisense EG98"; }
        else if ("Event".equals(model)) { return "Event"; }
        else if ("eye3".equals(model)) { return "HKT eye3"; }
        else if ("Edison 3 mini".equals(model)) { return "bq Edison_3_mini"; }
        else if ("eH811".equals(model)) { return "Huawei eH811"; }
        else if ("EK-GC200".equals(model)) { return "Samsung Galaxy Camera 2"; }
        else if ("EVERCOSS A65".equals(model)) { return "Evercoss One X"; }
        else if ("EVA-L29".equals(model)) { return "Huawei P9"; }
        else if ("Elite7Q".equals(model)) { return "Prestige ELITE7Q"; }
        else if ("ELITE9Q".equals(model)) { return "Prestige ELITE9Q"; }
        else if ("EB-W51GJ".equals(model)) { return "Sharp EB-WX1GJ/EB-W51GJ"; }
        else if ("E450".equals(model)) { return "NGM Italia SRL NGM Youcolor E450"; }
        else if ("EK-KC100K".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("EK-KC100S".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("E6533".equals(model)) { return "Sony Xperia Z3+ Dual"; }
        else if ("EVA-L09".equals(model)) { return "Huawei P9"; }
        else if ("E8".equals(model)) { return "QMobile E8"; }
        else if ("E4".equals(model)) { return "Turk Telekom E4"; }
        else if ("EI".equals(model)) { return "Cellon EI"; }
        else if ("ET7050D".equals(model)) { return "Impecca ET7050D"; }
        else if ("Eco9 v1".equals(model)) { return "Panasonic Eco9 v1"; }
        else if ("Eco9 v2".equals(model)) { return "Panasonic Eco9 v2"; }
        else if ("E860".equals(model)) { return "Hisense E860"; }
        else if ("EGD103".equals(model)) { return "Ematic EGD103"; }
        else if ("EG978".equals(model)) { return "SKnetworks EG978TW"; }
        else if ("Elite8QS".equals(model)) { return "Prestige ELITE8QS"; }
        else if ("Elite8QL".equals(model)) { return "Visual Land Prestige Elite8QL"; }
        else if ("era 4K".equals(model)) { return "Lava XOLO era 4K"; }
        else if ("EG668".equals(model)) { return "SKnetworks EG68BE"; }
        else if ("EK-8680".equals(model)) { return "Cellon EK-8680"; }
        else if ("EF500".equals(model)) { return "Bluebird EF500"; }
        else if ("Elite 11".equals(model)) { return "Panasonic Elite 11"; }
        else if ("EG950".equals(model)) { return "Hisense EG950"; }
        else if ("ENERGY_DIAMOND_MINI".equals(model)) { return "Blu ENERGY_DIAMOND_MINI"; }
        else if ("E2371CH".equals(model)) { return "Hisense E2371CH"; }
        else if ("E350".equals(model)) { return "Logicom E350"; }
        else if ("E5606".equals(model)) { return "Sony Xperia M5"; }
        else if ("E6553".equals(model)) { return "Sony Xperia Z3+"; }
        else if ("Essentielb-Pixis".equals(model)) { return "essentielb Pyxis"; }
        else if ("Energy X LTE".equals(model)) { return "Blu Energy X LTE"; }
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
        else if ("E-Tab 4G".equals(model)) { return "Pegatron chagall"; }
        else if ("e-tab4".equals(model)) { return "General Mobile E-tab 4"; }
        else if ("Elite10Q".equals(model)) { return "Prestige ELITE10Q"; }
        else if ("E2371".equals(model)) { return "Hisense Sero7 LE"; }
        else if ("EGQ337".equals(model)) { return "Ematic EGQ337"; }
        else if ("E2171TK".equals(model)) { return "Hisense Sero 7"; }
        else if ("E5663".equals(model)) { return "Sony Xperia M5 Dual"; }
        else if ("era_4G".equals(model)) { return "Lava Era 4G"; }
        else if ("Eco11 v2".equals(model)) { return "Panasonic Eco11 v2"; }
        else if ("E5603".equals(model)) { return "Sony Xperia M5"; }
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
        else if ("Edison 3 3G".equals(model)) { return "Bq Edison 3 3G"; }
        else if ("EGQ377".equals(model)) { return "Ematic EGQ377"; }
        else if ("EK-GC100".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("Elite".equals(model)) { return "Panasonic Elite 18"; }
        else if ("EveryPad3".equals(model)) { return "Lenovo PB1-770M/Lenovo PHAB Plus"; }
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
        else if ("Enjoy TV Quad-Core Box".equals(model)) { return "Geniatech Enjoy TV Quad-Core Box"; }
        else if ("EveryPad".equals(model)) { return "Lenovo EveryPad"; }
        else if ("E5563".equals(model)) { return "Sony Xperia C5 Ultra Dual"; }
        else if ("EIII".equals(model)) { return "Cellon EIII"; }
        else if ("Etab5".equals(model)) { return "General Mobile Etab5"; }
        else if ("EK-GN100".equals(model)) { return "Samsung Galaxy Camera"; }
        return "";

    }
    public static String dMethod (String model) {
        if ("D000-000001-S85".equals(model)) { return "NEC LifeTouch S"; }
        else if ("DASH X PLUS LTE".equals(model)) { return "Blu DASH X PLUS LTE"; }
        else if ("D000-000010-N".equals(model)) { return "NEC LifeTouch Note"; }
        else if ("DA222HQL".equals(model)) { return "Acer DA222HQL"; }
        else if ("DA221HQL".equals(model)) { return "Acer DA221HQL"; }
        else if ("Desire L by HTC".equals(model)) { return "HTC Desire L by HTC"; }
        else if ("D2005".equals(model)) { return "Sony Xperia E1"; }
        else if ("D2004".equals(model)) { return "Sony Xperia E1"; }
        else if ("Digital2 Plus".equals(model)) { return "Digital2 Plus"; }
        else if ("D000-000019-002".equals(model)) { return "NEC LifeTouch B"; }
        else if ("Dslide710".equals(model)) { return "Danew DSlide 710"; }
        else if ("DL900".equals(model)) { return "TCT (Alcatel) DL900"; }
        else if ("DM009SH".equals(model)) { return "Sharp DM009SH"; }
        else if ("DM-01G".equals(model)) { return "LGE DM-01G"; }
        else if ("D6683".equals(model)) { return "Sony Xperia Z3 Dual"; }
        else if ("Dtac phone Joey Jet 2".equals(model)) { return "Hipstreet Joey Jet 2"; }
        else if ("D000-000011-N".equals(model)) { return "NEC LifeTouch Note"; }
        else if ("D2-961G".equals(model)) { return "Haier D2-961G"; }
        else if ("DROID Pro".equals(model)) { return "Motorola Droid Pro"; }
        else if ("D000-000001-K01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("DA220HQL".equals(model)) { return "Acer DA220HQL"; }
        else if ("DROID_Pro".equals(model)) { return "Motorola Droid Pro"; }
        else if ("Druid_L10".equals(model)) { return "Vonino Druid_L10"; }
        else if ("D000-000001-C01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-S01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-S00".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-S05".equals(model)) { return "NEC LifeTouch S"; }
        else if ("DM016SH".equals(model)) { return "Sharp DM016SH"; }
        else if ("DA245HQL".equals(model)) { return "Acer DA245HQL"; }
        else if ("Dynamic Racing 3".equals(model)) { return "NGM Italia SRL Dynamic Racing 3"; }
        else if ("DP3D8".equals(model)) { return "Anydata DOTPAD DP3D8 / Gadmei"; }
        else if ("D000-000001-S25".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D2114".equals(model)) { return "Sony Xperia E1"; }
        else if ("DROID BIONIC".equals(model)) { return "Motorola Droid Bionic"; }
        else if ("D000-000013-101".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D6603".equals(model)) { return "Sony Xperia Z3"; }
        else if ("DROID X2".equals(model)) { return "Motorola Droid X2"; }
        else if ("DARKFULL".equals(model)) { return "WIKO DARKFULL"; }
        else if ("D000-000002-001".equals(model)) { return "NEC LifeTouch W"; }
        else if ("Digital2 Platinum".equals(model)) { return "Digital2 Platinum"; }
        else if ("DARKNIGHT".equals(model)) { return "WIKO DARKNIGHT"; }
        else if ("Doro Liberto 810-orange".equals(model)) { return "Doro Liberto 810"; }
        else if ("DL701Q".equals(model)) { return "DigiLand DL701Q"; }
        else if ("D5106".equals(model)) { return "Sony Xperia T3"; }
        else if ("D5103".equals(model)) { return "Sony Xperia T3"; }
        else if ("D5102".equals(model)) { return "Sony Xperia T3"; }
        else if ("dopod A6288".equals(model)) { return "HTC Hero"; }
        else if ("DDA800R".equals(model)) { return "iRiver DMT580D"; }
        else if ("D6643".equals(model)) { return "Sony Xperia Z3"; }
        else if ("D6646".equals(model)) { return "Sony Xperia Z3"; }
        else if ("DM010SH".equals(model)) { return "Sharp DM010SH"; }
        else if ("D6543".equals(model)) { return "Sony Xperia Z2"; }
        else if ("Doro Liberto 822".equals(model)) { return "Doro Liberto 822 / 8030"; }
        else if ("Doro Liberto 820".equals(model)) { return "Doro Liberto 820"; }
        else if ("Doro Liberto 825".equals(model)) { return "Doro 825A"; }
        else if ("D000-000002-W01".equals(model)) { return "NEC LifeTouch W"; }
        else if ("D000-000002-W02".equals(model)) { return "NEC LifeTouch W"; }
        else if ("Dell Streak".equals(model)) { return "Dell Streak"; }
        else if ("D2316".equals(model)) { return "Sony Xperia M2"; }
        else if ("D000-000018-001".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D000-000018-004".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D5788".equals(model)) { return "Sony Xperia J1 Compact"; }
        else if ("Digital2-Deluxe".equals(model)) { return "Digital2 Deluxe"; }
        else if ("DARKSIDE".equals(model)) { return "Enspert DARKSIDE"; }
        else if ("DPA23D".equals(model)) { return "Dopo DPA23D"; }
        else if ("Desire_HD".equals(model)) { return "HTC Desire HD"; }
        else if ("D5316".equals(model)) { return "Sony Xperia T2 Ultra"; }
        else if ("D6502".equals(model)) { return "Sony Xperia Z2"; }
        else if ("D6503".equals(model)) { return "Sony Xperia Z2"; }
        else if ("D2-721G".equals(model)) { return "Haier D2-721"; }
        else if ("DM-01H".equals(model)) { return "Sharp Disney Mobile on docomo DM-01H"; }
        else if ("DMC-CM1".equals(model)) { return "Panasonic LUMIX CM1"; }
        else if ("DG-D07SGP".equals(model)) { return "Diginnos DG-D07S/GP"; }
        else if ("D000-000001-B02".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-B01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-R02".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-R03".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-R01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000001-R04".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D000-000007-D01".equals(model)) { return "NEC LifeTouch S"; }
        else if ("D819".equals(model)) { return "TCT (Alcatel) D819"; }
        else if ("DPM1081".equals(model)) { return "Dopo DPM1081"; }
        else if ("D2403".equals(model)) { return "Sony Xperia M2 Aqua"; }
        else if ("D2406".equals(model)) { return "Sony Xperia M2 Aqua"; }
        else if ("Digma Linx 4.5 PT452E".equals(model)) { return "BYD PT452E"; }
        else if ("Doro 824".equals(model)) { return "Doro 825A"; }
        else if ("D6708".equals(model)) { return "Sony Xperia Z3v"; }
        else if ("DA226HQ".equals(model)) { return "Acer DA226HQ"; }
        else if ("DIGICEL DL1000".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)"; }
        else if ("DM015K".equals(model)) { return "Kyocera DM015K"; }
        else if ("DROID2_GLOBAL".equals(model)) { return "Motorola Droid 2 Global"; }
        else if ("D2-751G".equals(model)) { return "Haier D2-751G"; }
        else if ("DMTAB-NV08B".equals(model)) { return "Nabi DreamTab HD8 Tablet"; }
        else if ("D2-927G".equals(model)) { return "Haier D2-927G"; }
        else if ("DL1010Q".equals(model)) { return "DigiLand DL1010Q"; }
        else if ("d-02H".equals(model)) { return "Huawei M2-802LD"; }
        else if ("Discovery".equals(model)) { return "Explay Discovery"; }
        else if ("Doro 8030".equals(model)) { return "Doro Liberto 822 / 8030"; }
        else if ("Doro 8031".equals(model)) { return "Doro Liberto 822 / 8030"; }
        else if ("d-01G".equals(model)) { return "Huawei d-01G"; }
        else if ("dL1".equals(model)) { return "Panasonic ELUGA"; }
        else if ("Discovery Air".equals(model)) { return "General Mobile Discovery Air"; }
        else if ("Droid".equals(model)) { return "Motorola Droid"; }
        else if ("D2212".equals(model)) { return "Sony Xperia E3 Dual"; }
        else if ("DS2310-70LP".equals(model)) { return "LIAONING YIYATONG DISNEY_Tablet_PC"; }
        else if ("D2206".equals(model)) { return "Sony Xperia E3"; }
        else if ("D2203".equals(model)) { return "Sony Xperia E3"; }
        else if ("D2202".equals(model)) { return "Sony Xperia E3"; }
        else if ("D6563".equals(model)) { return "Sony Xperia Z2a"; }
        else if ("DA222HQLA".equals(model)) { return "Acer DA222HQLA"; }
        else if ("DL1008M".equals(model)) { return "DigiLand DL1008M"; }
        else if ("D5503".equals(model)) { return "Sony Xperia Z1"; }
        else if ("Desire HD".equals(model)) { return "HTC Desire HD"; }
        else if ("DP7CPro-SGA1".equals(model)) { return "Tecno DP7CPro-SGA1"; }
        else if ("Dell M01M".equals(model)) { return "Dell Streak"; }
        else if ("DP10A".equals(model)) { return "Tecno Droipad10"; }
        else if ("D2502".equals(model)) { return "Sony Xperia C3 Dual"; }
        else if ("Devour".equals(model)) { return "Motorola Devour"; }
        else if ("DROID_BIONIC".equals(model)) { return "Motorola Droid Bionic"; }
        else if ("d-01H".equals(model)) { return "Huawei M2-A04L"; }
        else if ("D45".equals(model)) { return "TCT (Alcatel) Soul 4.5"; }
        else if ("dTV01".equals(model)) { return "Huawei M220"; }
        else if ("DIGICEL DL910".equals(model)) { return "ZTE Blade L3"; }
        else if ("D711HC_PG".equals(model)) { return "Inet-Tablet D711HC_PG"; }
        else if ("D2243".equals(model)) { return "Sony Xperia E3"; }
        else if ("D000-000018-102".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D000-000018-101".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D000-000018-104".equals(model)) { return "NEC LifeTouch B"; }
        else if ("Dolphin 70e Black".equals(model)) { return "Honeywell Dolphin 70e Black"; }
        else if ("D5803".equals(model)) { return "Sony Xperia Z3 Compact"; }
        else if ("DM011SH".equals(model)) { return "Sharp DM011SH"; }
        else if ("Dash 4.5".equals(model)) { return "Blu Dash 4.5"; }
        else if ("DM012SH".equals(model)) { return "Sharp DM012SH"; }
        else if ("DPM7827".equals(model)) { return "Dopo DPM7827"; }
        else if ("DROID PRO".equals(model)) { return "Motorola Droid Pro"; }
        else if ("D7911L3BC_OGS".equals(model)) { return "Inet-Tablet D7911L3BC_OGS"; }
        else if ("DROID_RAZR_HD".equals(model)) { return "Motorola Droid Razr HD"; }
        else if ("D5316N".equals(model)) { return "Sony Xperia T2 Ultra"; }
        else if ("D000-000019-001".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D2104".equals(model)) { return "Sony Xperia E1 dual"; }
        else if ("D2105".equals(model)) { return "Sony Xperia E1 dual"; }
        else if ("DMTAB-IN08A".equals(model)) { return "Nabi DreamTab HD8 Tablet"; }
        else if ("D6616".equals(model)) { return "Sony Xperiz Z3"; }
        else if ("DROID4".equals(model)) { return "Motorola Droid 4"; }
        else if ("DROID2".equals(model)) { return "Motorola Droid 2"; }
        else if ("DROID3".equals(model)) { return "Motorola Droid 3"; }
        else if ("DROIDX".equals(model)) { return "Motorola Droid X"; }
        else if ("Dslide971DC".equals(model)) { return "DANEW Dslide971DC"; }
        else if ("DIGICEL DL755".equals(model)) { return "ZTE T221"; }
        else if ("D6633".equals(model)) { return "Sony Xperia Z3 Dual"; }
        else if ("DM013SH".equals(model)) { return "Sharp DM013SH"; }
        else if ("DROID2 GLOBAL".equals(model)) { return "Motorola Droid II"; }
        else if ("DM014SH".equals(model)) { return "Sharp Disney Mobile DM014SH"; }
        else if ("DL700D".equals(model)) { return "DigiLand DL700D"; }
        else if ("D2533".equals(model)) { return "Sony Xperia C3"; }
        else if ("D5833".equals(model)) { return "Sony Xperia Z3 Compact"; }
        else if ("D2-M".equals(model)) { return "Hisense D2-M"; }
        else if ("DA241HL".equals(model)) { return "Acer DA241HL"; }
        else if ("DROID_X2".equals(model)) { return "Motorola Droid X2"; }
        else if ("D6653".equals(model)) { return "Sony Xperia Z3"; }
        else if ("DIGICEL DL800".equals(model)) { return "ZTE Blade G Lux"; }
        else if ("D5306".equals(model)) { return "Sony Xperia T2 Ultra"; }
        else if ("Doro Liberto 810".equals(model)) { return "Doro Liberto 810"; }
        else if ("DSlide 1013".equals(model)) { return "Danew Dslide 1013"; }
        else if ("DP-X1".equals(model)) { return "Onkyo DP-X1"; }
        else if ("D2305".equals(model)) { return "Sony Xperia M2"; }
        else if ("D2306".equals(model)) { return "Sony Xperia M2"; }
        else if ("D2302".equals(model)) { return "Sony Xperia M2"; }
        else if ("D2303".equals(model)) { return "Sony Xperia M2"; }
        else if ("DMT580D".equals(model)) { return "iRiver DMT580D"; }
        else if ("D5322".equals(model)) { return "Sony Xperia T2 Ultra dual"; }
        else if ("DAA738R".equals(model)) { return "RCA DAA730R / RCA DAA738R"; }
        else if ("DX00C".equals(model)) { return "Panasonic TH-49DX400C"; }
        else if ("DSlide750".equals(model)) { return "Danew DSlide 750"; }
        else if ("DWA1015D".equals(model)) { return "DigitalStream DWA1015D Tablet"; }
        else if ("Dream".equals(model)) { return "WIKO DARKFULL"; }
        else if ("DA223HQL".equals(model)) { return "Acer DA223HQL"; }
        else if ("DT101Bv51".equals(model)) { return "ESI Enterprises DT101Bv51"; }
        else if ("D000-000018-002".equals(model)) { return "NEC LifeTouch B"; }
        else if ("D000-000018-003".equals(model)) { return "NEC LifeTouch B"; }
        else if ("Delta Y360-U93".equals(model)) { return "Huawei Y360-U93"; }
        else if ("D820".equals(model)) { return "TCT (Alcatel) D820"; }
        else if ("DP7CPRO".equals(model)) { return "Tecno DroiPad 7C Pro"; }
        else if ("DROID_RAZR".equals(model)) { return "Motorola Droid Razr"; }
        else if ("D75E".equals(model)) { return "Honeywell D75E"; }
        else if ("D2-727".equals(model)) { return "Anydata D2-727G"; }
        else if ("DP7856K".equals(model)) { return "Dopo DP7856K"; }
        else if ("DMX-ST7A".equals(model)) { return "Dreamax DMX-ST7A"; }
        else if ("DROID RAZR HD".equals(model)) { return "Motorola RAZR HD"; }
        else if ("Doro Liberto 820 Mini".equals(model)) { return "Doro Liberto 820 Mini"; }
        else if ("Discovery II Mini".equals(model)) { return "General Mobile Discovery II Mini"; }
        else if ("DAA730R".equals(model)) { return "RCA DAA730R / RCA DAA738R"; }
        else if ("D820X".equals(model)) { return "TCT (Alcatel) D820X"; }
        else if ("DT7v51B".equals(model)) { return "ESI Enterprises DT7v51B"; }
        else if ("D5303".equals(model)) { return "Sony Xperia T2 Ultra"; }
        else if ("Dialog Q143L".equals(model)) { return "ZTE Dialog Q143L"; }
        else if ("DL750".equals(model)) { return "TCT (Alcatel) TCL DL750"; }
        return "";

    }
    public static String gMethod (String model) {
        if ("GT-P5220".equals(model)) { return "Samsung Galaxy Tab3 10.1"; }
        else if ("GT-S6812B".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GSmart SX1".equals(model)) { return "GSmart SX1"; }
        else if ("GSmart Maya M1 v2".equals(model)) { return "GSmart Maya M1 v2"; }
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
        else if ("Grand S Lite".equals(model)) { return "ZTE S118"; }
        else if ("GT-S7500W".equals(model)) { return "Samsung Galaxy Ace Plus"; }
        else if ("GT-S7500T".equals(model)) { return "Samsung Galaxy Ace Plus"; }
        else if ("Grand X In".equals(model)) { return "ZTE Grand X In"; }
        else if ("GT-S7500L".equals(model)) { return "Samsung Galaxy Ace Plus"; }
        else if ("GS-918".equals(model)) { return "DOPO GS-918"; }
        else if ("Grand S Flex".equals(model)) { return "ZTE Grand S Flex"; }
        else if ("Galaxy Nexus".equals(model)) { return "Samsung Galaxy Nexus"; }
        else if ("GT-P6800".equals(model)) { return "Samsung Galaxy Tab 7.7"; }
        else if ("GT-P6201".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("GT-S7710".equals(model)) { return "Samsung Galaxy Xcover2"; }
        else if ("G3SMNTS22".equals(model)) { return "Philips PHP-S221C4AFD"; }
        else if ("Grand X2 In".equals(model)) { return "ZTE Grand X2 In"; }
        else if ("Gear Live".equals(model)) { return "Samsung Gear Live"; }
        else if ("GT-I5500B".equals(model)) { return "Samsung Europa"; }
        else if ("GT-I5500L".equals(model)) { return "Samsung Europa"; }
        else if ("GT-I5500M".equals(model)) { return "Samsung Europa"; }
        else if ("GSmart Sierra S1".equals(model)) { return "GSmart Sierra S1"; }
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
        else if ("GT-S7580E".equals(model)) { return "Samsung Galaxy Trend Plus"; }
        else if ("Galaxy X".equals(model)) { return "Samsung Galaxy Nexus"; }
        else if ("GT-S7572".equals(model)) { return "Samsung Galaxy Trend Duos"; }
        else if ("GT-P7310".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("GT-I9010".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-P1000R".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-S5830".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5838".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5831i".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-I8190".equals(model)) { return "Samsung Galaxy S III Mini"; }
        else if ("GSmart T4".equals(model)) { return "GSmart T4"; }
        else if ("GT-S5310L".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GX2".equals(model)) { return "GSmart GX2"; }
        else if ("GT-S6352".equals(model)) { return "Samsung Galaxy Ace Duos"; }
        else if ("GT-S6358".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-I9505X".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("G630-U10".equals(model)) { return "Huawei G630-U10"; }
        else if ("GSmart Arty A3".equals(model)) { return "GSmart Arty A3"; }
        else if ("G526-L22".equals(model)) { return "Huawei G526"; }
        else if ("GSmart G1317D".equals(model)) { return "Gigabyte GSmart G1317"; }
        else if ("GT-I9150".equals(model)) { return "Samsung Galaxy Mega 5.8"; }
        else if ("GT-N5110".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("GDENTMY7317".equals(model)) { return "ENTITY GDENTMY7317"; }
        else if ("GSmart G1362".equals(model)) { return "Gigabyte GSmart G1362"; }
        else if ("GT-I9295".equals(model)) { return "Samsung Galaxy S4 Active"; }
        else if ("GT-S5312".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5310".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S7278U".equals(model)) { return "Samsung Galaxy Ace3 Duos"; }
        else if ("Grand Memo".equals(model)) { return "ZTE Grand Memo"; }
        else if ("GT-S5690R".equals(model)) { return "Samsung Galaxy Xcover"; }
        else if ("GT-S5690L".equals(model)) { return "Samsung Galaxy Xcover"; }
        else if ("GT-S5690M".equals(model)) { return "Samsung Galaxy Xcover"; }
        else if ("GN152".equals(model)) { return "Gionee GN152"; }
        else if ("GEM-701L".equals(model)) { return "Huawei X2"; }
        else if ("GSmart Maya M1".equals(model)) { return "GSmart Maya M1"; }
        else if ("GT-I9050".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-N7108".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("GT-I9507V".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-N7100".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("GT-N7102".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("GT-N7105".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("Glacier".equals(model)) { return "Gigabyte TM105A"; }
        else if ("GT-I9060L".equals(model)) { return "Samsung Galaxy Grand Neo"; }
        else if ("GT-I9060I".equals(model)) { return "Samsung Galaxy Grand Neo Plus"; }
        else if ("GT-I9060C".equals(model)) { return "Samsung Galaxy Grand Neo Plus"; }
        else if ("GT-I8200Q".equals(model)) { return "Samsung Galaxy S3 Mini Value Edition"; }
        else if ("GSmart7Tab".equals(model)) { return "Gigabyte TM75A"; }
        else if ("GT-I8200L".equals(model)) { return "Samsung Galaxy S3 Mini"; }
        else if ("Griffe G5".equals(model)) { return "Condor Griffe G5"; }
        else if ("GT-N7108D".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("GSmart G1345".equals(model)) { return "Gigabyte GSmart G1345"; }
        else if ("GSmart G1342".equals(model)) { return "Gigabyte GSmart G1342"; }
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
        else if ("GT-I8160P".equals(model)) { return "Samsung Galaxy Ace2"; }
        else if ("GT-S5360T".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GSmart Rio R1".equals(model)) { return "GSmart Rio R1"; }
        else if ("G31s".equals(model)) { return "Haier G31s"; }
        else if ("GT-S5369".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GT-I9070".equals(model)) { return "Samsung Galaxy S Advance"; }
        else if ("GT-S5283B".equals(model)) { return "Samsung Galaxy Star Trios"; }
        else if ("GSmart Alto A2".equals(model)) { return "GSmart Alto A2"; }
        else if ("G630-U20".equals(model)) { return "Huawei G630-U20"; }
        else if ("GN5001S".equals(model)) { return "Gionee GN5001S"; }
        else if ("GN5001L".equals(model)) { return "Gionee GN5001L"; }
        else if ("GT-I9515".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I8200".equals(model)) { return "Samsung Galaxy S3 Mini Value Edition"; }
        else if ("GT-S5301L".equals(model)) { return "Samsung Galaxy Pocket Plus"; }
        else if ("GT-S5301B".equals(model)) { return "Samsung Galaxy Pocket Plus"; }
        else if ("GT-I9210T".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("Garmin-Asus A50".equals(model)) { return "Garmin Nuvifone"; }
        else if ("GT-I9008L".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-S6500".equals(model)) { return "Samsung Galaxy Mini2"; }
        else if ("GETAWAY".equals(model)) { return "Wiko GETAWAY"; }
        else if ("GALAPAD_S6".equals(model)) { return "Galapad S6"; }
        else if ("GT-S7272".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-S7270".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-S6313T".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("GTV100".equals(model)) { return "Netgear NeoTVPrime"; }
        else if ("GT-I8260".equals(model)) { return "Samsung Galaxy Core"; }
        else if ("GT-I8268".equals(model)) { return "Samsung Galaxy Duos"; }
        else if ("GT-I8160L".equals(model)) { return "Samsung Galaxy Ace2"; }
        else if ("GT-S7272C".equals(model)) { return "Samsung Galaxy Ace3 Duos"; }
        else if ("GT-I9158V".equals(model)) { return "Samsung Galaxy Mega Plus"; }
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
        else if ("GT-I8550E".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("GSmart Tuku T2".equals(model)) { return "GSmart Tuku T2"; }
        else if ("GT-I5800L".equals(model)) { return "Samsung Galaxy Apollo"; }
        else if ("GT-I5800D".equals(model)) { return "Samsung Galaxy Apollo"; }
        else if ("GT-S5670".equals(model)) { return "Samsung Galaxy Fit"; }
        else if ("G621-TL00M".equals(model)) { return "Huawei G621-TL00M"; }
        else if ("G Watch".equals(model)) { return "LGE G Watch"; }
        else if ("GT-S6010".equals(model)) { return "Samsung Galaxy Music"; }
        else if ("GT-S6012".equals(model)) { return "Samsung Galaxy Music Duos"; }
        else if ("GT-S7583T".equals(model)) { return "Samsung Galaxy Trend Plus"; }
        else if ("G735-L23".equals(model)) { return "Huawei G735-L23"; }
        else if ("GT-I9082".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-P5100".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("GT-I8530".equals(model)) { return "Samsung Galaxy Beam"; }
        else if ("G Watch R".equals(model)) { return "LGE G Watch R"; }
        else if ("Galaxy_Nexus".equals(model)) { return "Samsung Galaxy Nexus"; }
        else if ("GT-S7270L".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-S5280".equals(model)) { return "Samsung Galaxy Star"; }
        else if ("GT-S5282".equals(model)) { return "Samsung Galaxy Star"; }
        else if ("GT-S5670L".equals(model)) { return "Samsung Galaxy Fit"; }
        else if ("Gigaset QV1030".equals(model)) { return "Gigaset QV1030"; }
        else if ("GT-N5120".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("G735-L03".equals(model)) { return "Huawei G735-L03"; }
        else if ("G700".equals(model)) { return "Haier G700"; }
        else if ("GW620".equals(model)) { return "LGE Eve"; }
        else if ("GSmart Mika M2".equals(model)) { return "GSmart Mika M2"; }
        else if ("GT-B5510".equals(model)) { return "Samsung Galaxy Y Pro"; }
        else if ("GT-B5512".equals(model)) { return "Samsung Galaxy Y Pro Duos"; }
        else if ("GT-I8160".equals(model)) { return "Samsung Galaxy Ace 2"; }
        else if ("GT540".equals(model)) { return "LGE Swift"; }
        else if ("GT-P7511".equals(model)) { return "Samsung Galaxy Tab 10.1 N"; }
        else if ("GT-P7510".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("GT-N5100".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("GT-N5105".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("General Mobile 4G Dual".equals(model)) { return "General Mobile 4G Dual"; }
        else if ("G615-U10".equals(model)) { return "Huawei G615-U10"; }
        else if ("GT-I9158".equals(model)) { return "Samsung Galaxy Mega 5.8"; }
        else if ("GT-I9152".equals(model)) { return "Samsung Galaxy Mega 5.8"; }
        else if ("GT-I9118".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-S7568I".equals(model)) { return "Samsung Galaxy Trend"; }
        else if ("GT-I9018".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-P3100B".equals(model)) { return "Samsung Galaxy Tab2 7.0"; }
        else if ("GSmart Saga S3".equals(model)) { return "GSmart Saga_S3"; }
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
        else if ("Grand X Pro".equals(model)) { return "ZTE Grand X Pro"; }
        else if ("GT-P6211".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("GM 5 Plus d".equals(model)) { return "General Mobile GM5 Plus d"; }
        else if ("GT-S6790".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-810".equals(model)) { return "Acer GT-810"; }
        else if ("GT-I9003".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-I8190L".equals(model)) { return "Samsung Galaxy S3 Mini"; }
        else if ("GT-B5510L".equals(model)) { return "Samsung Galaxy Y Pro"; }
        else if ("Gigaset QV831".equals(model)) { return "Gigaset QV831"; }
        else if ("Gigaset QV830".equals(model)) { return "Gigaset QV830"; }
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
        else if ("GS-1008".equals(model)) { return "Gigabyte PROSCAN PLT1066 / MAG MAGPAD / TEAC TEACTAB / DOPO GS-1008"; }
        else if ("GSmart Guru G1".equals(model)) { return "GSmart Guru G1"; }
        else if ("GT-S7390E".equals(model)) { return "Samsung Galaxy Fresh"; }
        else if ("GT-S7390G".equals(model)) { return "Samsung Galaxy Fresh"; }
        else if ("GT-S7390L".equals(model)) { return "Samsung Galaxy Trend Lite"; }
        else if ("GT-S7710L".equals(model)) { return "Samsung Galaxy Xcover2"; }
        else if ("GT-P6200L".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("GT-I5500".equals(model)) { return "Samsung Galaxy Europa"; }
        else if ("GT-I5508".equals(model)) { return "Samsung Galaxy Europa"; }
        else if ("GT-S5690".equals(model)) { return "Samsung Galaxy Xcover"; }
        else if ("GT-P5210".equals(model)) { return "Samsung Galaxy Tab 3 10.1"; }
        else if ("GT-N8005".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("GT-N8000".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("GT-I8262".equals(model)) { return "Samsung Galaxy Core"; }
        else if ("GT-I8730".equals(model)) { return "Samsung Galaxy Express"; }
        else if ("GT-I9192I".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("G100W".equals(model)) { return "Acer Picasso"; }
        else if ("Getac Z710".equals(model)) { return "Getac Z710"; }
        else if ("GT-P7100".equals(model)) { return "Samsung Galaxy Tab 10.1 v"; }
        else if ("GT-S5303B".equals(model)) { return "Samsung Galaxy Y Plus"; }
        else if ("GTB 850".equals(model)) { return "Grundig GTB850"; }
        else if ("Grand X".equals(model)) { return "ZTE Grand X"; }
        else if ("GT-S7562L".equals(model)) { return "Samsung Galaxy S DUOS"; }
        else if ("GT-S7562C".equals(model)) { return "Samsung Galaxy Trend Duos"; }
        else if ("GT-S7562i".equals(model)) { return "Samsung Galaxy Trend Duos"; }
        else if ("GSmart GS202".equals(model)) { return "Gigabyte GSmart GS202"; }
        else if ("GT-S7392L".equals(model)) { return "Samsung Galaxy Trend"; }
        else if ("GN5002".equals(model)) { return "Gionee GN5002"; }
        else if ("GT-S5660V".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("GT-S5660M".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("GT-S5660L".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("GT-N8020".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("G1-725".equals(model)) { return "Acer Iconia One 7"; }
        else if ("GSmart GS202+".equals(model)) { return "GSmart GS202+"; }
        else if ("General Mobile 4G".equals(model)) { return "General Mobile 4G"; }
        else if ("GN9008".equals(model)) { return "Gionee E8"; }
        else if ("GN9006".equals(model)) { return "Gionee GN9006"; }
        else if ("GN9007".equals(model)) { return "Gionee GN9007"; }
        else if ("GN9005".equals(model)) { return "Gionee S5.1"; }
        else if ("GN9000".equals(model)) { return "Gionee GN9000"; }
        else if ("GT-I9168I".equals(model)) { return "Samsung Galaxy Grand Neo"; }
        else if ("GT-S7560M".equals(model)) { return "Samsung Galaxy Ace II X"; }
        else if ("GT-I9235".equals(model)) { return "Samsung Galaxy Golden"; }
        else if ("GT-P1000T".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-P1000N".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-P1000L".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-P1000M".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-I8200N".equals(model)) { return "Samsung Galaxy S3 Mini Value Edition"; }
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
        else if ("GT-B5510B".equals(model)) { return "Samsung Galaxy Y Pro"; }
        else if ("GT-I9508C".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9508V".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("G526-L11".equals(model)) { return "Huawei G526"; }
        else if ("GT-I5503T".equals(model)) { return "Samsung Europa"; }
        else if ("GT-S5312L".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-I9128".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-B9120".equals(model)) { return "Samsung Absolute"; }
        else if ("GT-S7898I".equals(model)) { return "Samsung Galaxy Trend2"; }
        else if ("GT-S7566".equals(model)) { return "Samsung Galaxy S duos"; }
        else if ("GT-S7562".equals(model)) { return "Samsung Galaxy S Duos"; }
        else if ("GT-S7560".equals(model)) { return "Samsung Galaxy Ace2 X"; }
        else if ("GT-S7568".equals(model)) { return "Samsung Galaxy S Duos"; }
        else if ("GT-B5512B".equals(model)) { return "Samsung Galaxy Y Pro Duos"; }
        else if ("GT-S5830F".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830G".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830B".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830C".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830M".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("G526-L33".equals(model)) { return "Huawei G526"; }
        else if ("GT-S5830T".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830i".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("Glow".equals(model)) { return "Laiq Glow"; }
        else if ("G3SMNTA22".equals(model)) { return "AOC-A2272PW4T"; }
        else if ("G3SMNTA24".equals(model)) { return "AOC-A2472PW4T"; }
        else if ("GSmart Roma R2".equals(model)) { return "GSmart Roma R2"; }
        else if ("GAMETAB-ONE".equals(model)) { return "Bigben GAMETAB-ONE"; }
        else if ("GT-I9080E".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-I9080L".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-N7105T".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("GT-P6200".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("GT-S7898".equals(model)) { return "Samsung Galaxy Trend2"; }
        else if ("GT-I9003L".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-S6293T".equals(model)) { return "Samsung Roy VE DTV"; }
        else if ("G320".equals(model)) { return "Plaisio G320"; }
        else if ("GT-I9063T".equals(model)) { return "Samsung Galaxy Grand Neo Duos"; }
        else if ("GV7790".equals(model)) { return "Prestigio GV7790"; }
        else if ("G610-U00".equals(model)) { return "Huawei G610"; }
        else if ("GSmart G1355".equals(model)) { return "Gigabyte GSmart G1355"; }
        else if ("GT-I8730T".equals(model)) { return "Samsung Galaxy Express"; }
        else if ("GT-S5830D".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-S5830L".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("GT-I9082i".equals(model)) { return "Samsung Galaxy Grand duos"; }
        else if ("GT-I9082C".equals(model)) { return "Samsung Galaxy Grand Neo"; }
        else if ("GT-I9082L".equals(model)) { return "Samsung Galaxy Grand Duos"; }
        else if ("GSmart Rey R3".equals(model)) { return "GSmart Rey R3"; }
        else if ("GT-S5301".equals(model)) { return "Samsung Galaxy Pocket Plus"; }
        else if ("GT-S5300".equals(model)) { return "Samsung Galaxy Pocket"; }
        else if ("GT-S5303".equals(model)) { return "Samsung Galaxy Y Plus"; }
        else if ("GT-S5302".equals(model)) { return "Samsung Galaxy Pocket"; }
        else if ("G740-L00".equals(model)) { return "Huawei G740"; }
        else if ("gprimelteacg".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("GT-I9060".equals(model)) { return "Samsung Galaxy Grand Neo"; }
        else if ("G2SMNT".equals(model)) { return "Philips S221C3A"; }
        else if ("GT-I5503".equals(model)) { return "Samsung Galaxy Europa"; }
        else if ("GravityQuad".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("GT-I5700R".equals(model)) { return "Samsung Galaxy Spica"; }
        else if ("GT-I5700L".equals(model)) { return "Samsung Galaxy Spica"; }
        else if ("GT-S5368".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GT-S5367".equals(model)) { return "Samsung Galaxy Y TV"; }
        else if ("GT-S5360".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GT-S7275B".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-S7275T".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-S7275R".equals(model)) { return "Samsung Galaxy Ace 3"; }
        else if ("GEM-702L".equals(model)) { return "Huawei X2"; }
        else if ("G527-U081".equals(model)) { return "Huawei G527"; }
        else if ("GT-S7580".equals(model)) { return "Samsung Galaxy Trend Plus"; }
        else if ("GT-S7582".equals(model)) { return "Samsung Galaxy S Duos2"; }
        else if ("GT-S7275".equals(model)) { return "Samsung Galaxy S"; }
        else if ("GT-S7278".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-I9158P".equals(model)) { return "Samsung Galaxy Mega Plus"; }
        else if ("GSmart Aku A1".equals(model)) { return "GSmart Aku A1"; }
        else if ("GT-P7300".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("GT-S5363".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("GT-S5670B".equals(model)) { return "Samsung Galaxy Fit"; }
        else if ("GT-I9505".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9507".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9506".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9500".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-I9502".equals(model)) { return "Samsung Galaxy S4 Duos"; }
        else if ("GT-I9508".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GSmart G1315".equals(model)) { return "Gigabyte GSmart G1315"; }
        else if ("GSmart G1310".equals(model)) { return "Gigabyte GSmart G1310"; }
        else if ("GT-I8262B".equals(model)) { return "Samsung Galaxy S3 Duos"; }
        else if ("GT-S5300L".equals(model)) { return "Samsung Galaxy Pocket"; }
        else if ("GT-S5300B".equals(model)) { return "Samsung Galaxy Pocket"; }
        else if ("GT-I9105P".equals(model)) { return "Samsung Galaxy S2 Plus"; }
        else if ("GT-I9505G".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("GT-S7273T".equals(model)) { return "Samsung Galaxy S2 Duos TV"; }
        else if ("Garminfone".equals(model)) { return "Garmin Nuvifone"; }
        else if ("GN9010L".equals(model)) { return "Gionee GN9010L"; }
        else if ("G620-L75".equals(model)) { return "Huawei G620-L75"; }
        else if ("G6".equals(model)) { return "Claresta G6"; }
        else if ("G5".equals(model)) { return "Claresta G5"; }
        else if ("G4".equals(model)) { return "Claresta G4"; }
        else if ("G3".equals(model)) { return "BYD INHON G3"; }
        else if ("GT-S5660".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("GT-S7580L".equals(model)) { return "Samsung Galaxy Trend Plus"; }
        else if ("GT-S5312M".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5312C".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5312B".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-I8258".equals(model)) { return "Samsung Galaxy M Style"; }
        else if ("GT-I8250".equals(model)) { return "Samsung Galaxy Beam"; }
        else if ("GT-S6792L".equals(model)) { return "Samsung Galaxy Fame Lite Duos"; }
        else if ("GR-TB7".equals(model)) { return "TCT (Alcatel) ONE TOUCH T10"; }
        else if ("G2".equals(model)) { return "Anydata Mach_Speed Trio G2 Tablet"; }
        else if ("G1".equals(model)) { return "Hisense G1"; }
        else if ("GT-P1000".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("GT-S5310B".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S6810M".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S5310N".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5310M".equals(model)) { return "Samsung Galaxy Pocket SS"; }
        else if ("G735-L12".equals(model)) { return "Huawei G735-L12"; }
        else if ("GT-I9305T".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("GT-I9100".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("GT-P5113".equals(model)) { return "Samsnung Galaxy Tab 2 10.1"; }
        else if ("GT-P5110".equals(model)) { return "Samsung Galaxy Tab 2"; }
        else if ("GT-I9108".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("GT-S6310T".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("GT-S7582L".equals(model)) { return "Samsung Galaxy S Duos2"; }
        else if ("GT-S6310L".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("GT-S6310N".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("G621-TL00".equals(model)) { return "Huawei G621-TL00"; }
        else if ("GT-S6310B".equals(model)) { return "Samsung Galaxy Young"; }
        else if ("GT-I9305N".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("GT-S5310C".equals(model)) { return "Samsung Galaxy Pocket SS"; }
        else if ("GT-S5310G".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S5310E".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S6810B".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S6810L".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S5310I".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-S6810P".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S5310T".equals(model)) { return "Samsung Galaxy Pocket Neo"; }
        else if ("GT-I9103".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("GTB 1050".equals(model)) { return "Grundig GTB1050"; }
        else if ("GT-S6790L".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-S6790N".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-B7810".equals(model)) { return "Samsung Galaxy M Pro2"; }
        else if ("GT-S6790E".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("Graphos A10".equals(model)) { return "Olivetti Graphos A10"; }
        else if ("GT-P7500D".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("GT-P7503".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("GT-P7501".equals(model)) { return "Samsung Galaxy Tab 10.1 N"; }
        else if ("Gravity".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("GT-N8013".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("google_sdk".equals(model)) { return "Android Emulator"; }
        else if ("GT-S6812C".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-B5330".equals(model)) { return "Samsung Galaxy Chat"; }
        else if ("GT-I5510L".equals(model)) { return "Samsung Europa"; }
        else if ("GT-S6812i".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-I9168".equals(model)) { return "Samsung Galaxy Grand Neo"; }
        else if ("GT-S6810E".equals(model)) { return "Samsung Galaxy Fame"; }
        else if ("GT-I8190N".equals(model)) { return "Samsung Galaxy S III Mini"; }
        else if ("GT-I8190T".equals(model)) { return "Samsung Galaxy S3 Mini"; }
        else if ("GT-I9105".equals(model)) { return "Samsung Galaxy S2 Plus"; }
        else if ("GOA".equals(model)) { return "Wiko GOA"; }
        else if ("G3SMNTS23".equals(model)) { return "Philips PHP-S231C4AFD"; }
        else if ("GT-N8010".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("GT-S6012B".equals(model)) { return "Samsung Galaxy Music Duos"; }
        else if ("GT-I5800".equals(model)) { return "Samsung Galaxy Apollo"; }
        else if ("GT-I5801".equals(model)) { return "Samsung Galaxy Apollo"; }
        else if ("GM 5 Plus".equals(model)) { return "General Mobile GM5 Plus Turkcell"; }
        else if ("GT-I9128I".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-I9128E".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-I9128V".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("GT-I8260E".equals(model)) { return "Samsung Galaxy Core Safe"; }
        else if ("GS-718".equals(model)) { return "Anydata DOPO GMS-718 Tablet / Discovery"; }
        else if ("GT-S6010L".equals(model)) { return "Samsung Galaxy Music"; }
        else if ("gucci".equals(model)) { return "Xiaomi HM NOTE 1S CT"; }
        else if ("GT-I8150".equals(model)) { return "Samsung Galaxy W"; }
        else if ("GN5001".equals(model)) { return "Gionee GN5001"; }
        else if ("GT-P7500".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("GT-S7275Y".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("GT-I5700".equals(model)) { return "Samsung Galaxy Spica"; }
        else if ("GT-S6102E".equals(model)) { return "Samsung Galaxy Y Duos"; }
        else if ("GT-S6102B".equals(model)) { return "Samsung Galaxy Y Duos"; }
        else if ("GT-S5660B".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("GT-P3105".equals(model)) { return "Samsung Galaxy Tab2 7.0"; }
        else if ("GT-P3100".equals(model)) { return "Samsung Galaxy Tab 2"; }
        else if ("GTB 801".equals(model)) { return "Grundig TC69CA2"; }
        else if ("GiONEE S7".equals(model)) { return "Gionee GN9006"; }
        else if ("G30".equals(model)) { return "Haier G30"; }
        else if ("GT-I9268".equals(model)) { return "Samsung Galaxy Premier"; }
        else if ("GT-I9260".equals(model)) { return "Samsung Galaxy Premier"; }
        else if ("GT-S6500T".equals(model)) { return "Samsung Galaxy Mini2"; }
        else if ("GT-I5510".equals(model)) { return "Samsung Galaxy Europa"; }
        else if ("GT-S6500L".equals(model)) { return "Samsung Galaxy Mini2"; }
        else if ("GT-S5570".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("GT-S6500D".equals(model)) { return "Samsung Galaxy Mini2"; }
        else if ("GT-S5578".equals(model)) { return "Samsung Galaxy Mini"; }
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
        else if ("Gigabyte TB100".equals(model)) { return "Gigabyte TB100"; }
        else if ("GSmart Mika M3".equals(model)) { return "GSmart Mika M3"; }
        else if ("GT-B7510".equals(model)) { return "Samsung Galaxy Pro"; }
        else if ("GT-I8552B".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("GT-P5200".equals(model)) { return "Samsung Galaxy Tab3 10.1"; }
        else if ("GT-B9062".equals(model)) { return "Samsung Galaxy (China)"; }
        else if ("G1-715".equals(model)) { return "Acer G1-715"; }
        else if ("GT-I9060M".equals(model)) { return "Samsung Galaxy Grand Neo Plus"; }
        else if ("GT-S5302B".equals(model)) { return "Samsung Galaxy Pocket"; }
        else if ("GT-I8260L".equals(model)) { return "Samsung Galaxy Core"; }
        else if ("GT-S6802B".equals(model)) { return "Samsung Galaxy Ace Duos"; }
        else if ("GT-I9220".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("GT-I9228".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("Golf".equals(model)) { return "WIKO IGGY"; }
        return "";

    }
    public static String fMethod (String model) {
        if ("F52_09".equals(model)) { return "BenQ F52_09"; }
        else if ("F103 Pro".equals(model)) { return "Gionee F103 Pro"; }
        else if ("F5180".equals(model)) { return "Hisense F5180"; }
        else if ("FV-FG6".equals(model)) { return "FaceVsion OC1020A"; }
        else if ("F-07D".equals(model)) { return "Fujitsu ARROWS mu F-07D"; }
        else if ("F-074".equals(model)) { return "Fujitsu ARROWS mu F-07D"; }
        else if ("FJJB091".equals(model)) { return "Fujitsu ARROWS mu F-07D"; }
        else if ("Forward_Prime".equals(model)) { return "NGM Forward_Prime"; }
        else if ("First".equals(model)) { return "Positivo First"; }
        else if ("FHMD001".equals(model)) { return "Fujitsu FHMD001"; }
        else if ("Flylife Connect 7.85 3G 2".equals(model)) { return "Flylife Connect 7.85 3G 2"; }
        else if ("Forward Ruby".equals(model)) { return "NGM Italia SRL Ruby"; }
        else if ("FMT-NM7116-01".equals(model)) { return "Future Mobile Technology netsurferDUAL 7"; }
        else if ("Fly Ego Art 2".equals(model)) { return "Fly Ego Art 2"; }
        else if ("F-05G".equals(model)) { return "Fujitsu F-05G"; }
        else if ("F-05F".equals(model)) { return "Fujitsu F-05F"; }
        else if ("F-05E".equals(model)) { return "Fujitsu ARROWS Tab F-05E"; }
        else if ("F-05D".equals(model)) { return "Fujitsu ARROWS X LTE F-05D"; }
        else if ("Forward_EVOLVE".equals(model)) { return "Coolpad Forward_EVOLVE"; }
        else if ("FS402".equals(model)) { return "Fly FS402"; }
        else if ("FS401".equals(model)) { return "Fly Stratus 1"; }
        else if ("FS404".equals(model)) { return "Fly Stratus 3"; }
        else if ("FS405".equals(model)) { return "Fly Stratus 4"; }
        else if ("Freedom Plus LTE".equals(model)) { return "AG Mobile Freedom Plus LTE"; }
        else if ("F-03H".equals(model)) { return "Fujitsu F-03H"; }
        else if ("F-03E".equals(model)) { return "Fujitsu ARROWS Kiss F-03E"; }
        else if ("F-03D".equals(model)) { return "Fujitsu ARROWS Kiss F-03D"; }
        else if ("F-03G".equals(model)) { return "Fujitsu F-03G"; }
        else if ("F-03F".equals(model)) { return "Fujitsu F-03F"; }
        else if ("FW8977-ED".equals(model)) { return "Verssed FW8977-ED"; }
        else if ("F-01F".equals(model)) { return "Fujitsu F-01F"; }
        else if ("F-01D".equals(model)) { return "Fujitsu ARROWS Tab LTE F-01D"; }
        else if ("F-01H".equals(model)) { return "Fujitsu F-01H"; }
        else if ("Flylife Connect 7 3G 2".equals(model)) { return "Flylife Connect 7 3G 2"; }
        else if ("Fog".equals(model)) { return "Explay Fog"; }
        else if ("Fresh_NF".equals(model)) { return "Explay Fresh"; }
        else if ("Flag Mill v2".equals(model)) { return "JP Sacouto Flag Mill v2"; }
        else if ("falcon".equals(model)) { return "Borqs Falcon"; }
        else if ("F3".equals(model)) { return "BenQ F3"; }
        else if ("F5122".equals(model)) { return "Sony Xperia X"; }
        else if ("F5121".equals(model)) { return "Sony Xperia X"; }
        else if ("FZ-X1".equals(model)) { return "Panasonic FZ-X1"; }
        else if ("FLY IQ4503".equals(model)) { return "Fly IQ4503"; }
        else if ("FZ-A1B".equals(model)) { return "Panasonic FZ-A1"; }
        else if ("Fly IQ4514".equals(model)) { return "Fly IQ4514 Quad"; }
        else if ("F52_05".equals(model)) { return "BenQ F52"; }
        else if ("ForwardRuby".equals(model)) { return "NGM Italia SRL Ruby"; }
        else if ("FEVER".equals(model)) { return "Wiko FEVER"; }
        else if ("FAR7".equals(model)) { return "Fujitsu ARROWS Tab Wi-Fi FAR75A/70A"; }
        else if ("FP-U320-INF-WLTW".equals(model)) { return "InFocus FP-U320-INF-WLTW"; }
        else if ("F-07E".equals(model)) { return "Fujitsu Disney Mobile on docomo F-07E"; }
        else if ("FARTM9334P1".equals(model)) { return "Fujitsu FARTM9334P1"; }
        else if ("FunTab2".equals(model)) { return "Ematic FunTab 2"; }
        else if ("F-09E".equals(model)) { return "Fujitsu F-09E"; }
        else if ("F-09D".equals(model)) { return "Fujitsu F-09D ANTEPRIMA"; }
        else if ("F3313".equals(model)) { return "Sony Xperia E5"; }
        else if ("F3311".equals(model)) { return "Sony Xperia E5"; }
        else if ("F8132".equals(model)) { return "Sony Xperia X Performance"; }
        else if ("FLOW2".equals(model)) { return "Lechpol Kruger_Matz_FLOW2"; }
        else if ("FTJ152C".equals(model)) { return "Plusone FTJ152C"; }
        else if ("freebit PandA".equals(model)) { return "Enspert CINK KING"; }
        else if ("F301".equals(model)) { return "Gionee F301"; }
        else if ("F303".equals(model)) { return "Gionee F303"; }
        else if ("FreeTAB 10.1 Silver".equals(model)) { return "Modecom FreeTAB 10.1 Silver"; }
        else if ("FZ-N1".equals(model)) { return "Panasonic FZ-N1"; }
        else if ("ForwardEndurance".equals(model)) { return "NGM Italia SRL Endurance"; }
        else if ("FMT-NT8A42-01".equals(model)) { return "Future Mobile Technology Dual 8"; }
        else if ("FXC-5A".equals(model)) { return "geanee FXC-5A"; }
        else if ("Forge".equals(model)) { return "Razer Forge TV"; }
        else if ("F5281".equals(model)) { return "Hisense Sero 8 pro"; }
        else if ("FDR-A03L".equals(model)) { return "HUAWEI MediaPad T2 10.0 pro"; }
        else if ("F-10D".equals(model)) { return "Fujitsu ARROWS X F-10D"; }
        else if ("F3213".equals(model)) { return "Sony Xperia XA Ultra"; }
        else if ("FS551".equals(model)) { return "Fly Nimbus 4"; }
        else if ("FTJ152D".equals(model)) { return "Plusone Kiwami"; }
        else if ("FTJ152B".equals(model)) { return "Plusone Priori3S"; }
        else if ("FTJ152A".equals(model)) { return "Plusone Priori 3"; }
        else if ("Fly_IQ442".equals(model)) { return "Enspert CINK SLIM"; }
        else if ("FMT-NM7058-03".equals(model)) { return "Future Mobile Technology FMT-NM7058-03"; }
        else if ("FGAD".equals(model)) { return "Royaltek FGAD"; }
        else if ("FLOW".equals(model)) { return "Lechpol FLOW"; }
        else if ("FZ-B2B".equals(model)) { return "Panasonic FZ-B2"; }
        else if ("FZ-B2D".equals(model)) { return "Panasonic FZ-B2D"; }
        else if ("F5_06".equals(model)) { return "BenQ F5_06"; }
        else if ("FDR-A01w".equals(model)) { return "HUAWEI MediaPad T2 10.0 pro"; }
        else if ("FDR-A01L".equals(model)) { return "HUAWEI MediaPad T2 10.0 pro"; }
        else if ("F-12D".equals(model)) { return "Fujitsu Raku-Raku SMART PHONE F-12D"; }
        else if ("F-12C".equals(model)) { return "Fujitsu F-12C"; }
        else if ("FT142D".equals(model)) { return "ZTE FT142D"; }
        else if ("Flylife Connect 10.1 3G 2".equals(model)) { return "Flylife Connect 10.1"; }
        else if ("F3212".equals(model)) { return "Sony Xperia XA Ultra"; }
        else if ("F3211".equals(model)) { return "Sony Xperia XA Ultra"; }
        else if ("F3216".equals(model)) { return "Sony Xperia XA Ultra"; }
        else if ("F3215".equals(model)) { return "Sony Xperia XA Ultra"; }
        else if ("FS451".equals(model)) { return "Fly FS451"; }
        else if ("FS452".equals(model)) { return "Fly Nimbus 2"; }
        else if ("Fly IQ4405_Quad".equals(model)) { return "Fly EVO Chic 1"; }
        else if ("Fuel F2".equals(model)) { return "Lava iris Fuel F2"; }
        else if ("F1fw".equals(model)) { return "Oppo F1fw"; }
        else if ("FT103".equals(model)) { return "Quanta FT103"; }
        else if ("FL7008".equals(model)) { return "Reliance FL7008"; }
        else if ("F-06F".equals(model)) { return "Fujitsu F-06F"; }
        else if ("F-06E".equals(model)) { return "Fujitsu ARROWS NX F-06E"; }
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
        else if ("Freedom E".equals(model)) { return "AG Mobile Freedom E"; }
        else if ("Fresh".equals(model)) { return "Explay Fresh"; }
        else if ("Favorite".equals(model)) { return "Explay Favorite"; }
        else if ("FARTM933KZ".equals(model)) { return "Fujitsu FARTM933KZ"; }
        else if ("Fly".equals(model)) { return "SK Telesys Fly"; }
        else if ("FZ-A2A".equals(model)) { return "Panasonic FZ-A2A"; }
        else if ("Freebox Player Mini".equals(model)) { return "Freebox Mini 4K"; }
        else if ("Fly IQ4508".equals(model)) { return "Fly Dune 4"; }
        else if ("Fly IQ4505".equals(model)) { return "Fly IQ4505"; }
        else if ("FLY IQ4511".equals(model)) { return "Fly Tornado One"; }
        else if ("FTJ161A".equals(model)) { return "Plusone FTJ161A"; }
        else if ("F8131".equals(model)) { return "Sony Xperia X Performance"; }
        else if ("F3111".equals(model)) { return "Sony Xperia XA"; }
        else if ("F3112".equals(model)) { return "Sony Xperia XA"; }
        else if ("F3113".equals(model)) { return "Sony Xperia XA"; }
        else if ("F3115".equals(model)) { return "Sony Xperia XA"; }
        else if ("F3116".equals(model)) { return "Sony Xperia XA"; }
        else if ("F5070".equals(model)) { return "Hisense F5070"; }
        else if ("FMT-NM7054-01".equals(model)) { return "Future Mobile Technology FMT-NM7054-01"; }
        else if ("FMT-NM7054-03".equals(model)) { return "Future Mobile Technology FMT-NM7054-03"; }
        else if ("FAR70B".equals(model)) { return "Fujitsu ARROWS Tab Wi-Fi FAR70B"; }
        else if ("Fly IQ4602".equals(model)) { return "Fly IQ4602"; }
        else if ("F-08D".equals(model)) { return "Fujitsu Disney Mobile on docomo F-08D"; }
        else if ("F-08E".equals(model)) { return "Fujitsu Raku-Raku SMART PHONE2 F-08E"; }
        else if ("F270BW".equals(model)) { return "Hisense F270BW"; }
        else if ("F103L".equals(model)) { return "Gionee F103L"; }
        else if ("F103S".equals(model)) { return "Gionee F103S"; }
        else if ("F105".equals(model)) { return "Gionee F105"; }
        else if ("F103".equals(model)) { return "Gionee F103"; }
        else if ("F1f".equals(model)) { return "Oppo F1w"; }
        else if ("F1w".equals(model)) { return "Oppo F1w"; }
        else if ("Fly IQ4514 AF".equals(model)) { return "Fly IQ4514 Quad"; }
        else if ("FJT21".equals(model)) { return "Fujitsu ARROWS Tab FJT21"; }
        else if ("freebit PandA_m14".equals(model)) { return "TCT (Alcatel) freebit PandA_m14"; }
        else if ("FS502".equals(model)) { return "Fly FS502"; }
        else if ("FS501".equals(model)) { return "Fly Nimbus3"; }
        else if ("FS506".equals(model)) { return "Fly Cirrus 3"; }
        else if ("FS505".equals(model)) { return "Fly Nimbus 7"; }
        else if ("FS504".equals(model)) { return "Fly Cirrus 2"; }
        else if ("FJL22".equals(model)) { return "Fujitsu ARROWS Z FJL22"; }
        else if ("FJL21".equals(model)) { return "Fujitsu ARROWS ef FJL21"; }
        else if ("Flare_X_V2".equals(model)) { return "Cherry Mobile Flare X"; }
        else if ("Funtab3".equals(model)) { return "Ematic FunTab 3"; }
        else if ("F5_19".equals(model)) { return "BenQ F5_19"; }
        else if ("F5_16".equals(model)) { return "BenQ F5_16"; }
        else if ("FunTabPlay".equals(model)) { return "Ematic FunTab 3"; }
        else if ("FreeTAB 8015 IPS X4".equals(model)) { return "Modecom FreeTAB 8015 IPS X4 LTE"; }
        else if ("F5281CH".equals(model)) { return "Hisense F5281CH"; }
        else if ("F105L".equals(model)) { return "Gionee F105L"; }
        else if ("FARTMB611Y".equals(model)) { return "Fujitsu FARTMB611Y"; }
        else if ("FP-U320-711-WWAN".equals(model)) { return "SAKAISIO FP-U320-711-WWAN"; }
        else if ("FWTA-T1000".equals(model)) { return "Finggo FWTA-T1000"; }
        else if ("F-11D".equals(model)) { return "Fujitsu ARROWS Me F-11D"; }
        else if ("Fly IQ4418 AF".equals(model)) { return "Fly IQ4418"; }
        else if ("F5_18".equals(model)) { return "BenQ F5_18"; }
        else if ("F5_13".equals(model)) { return "BenQ F5_13"; }
        else if ("F5_15".equals(model)) { return "BenQ F5_15"; }
        else if ("ForwardZero".equals(model)) { return "NGM Italia SRL ForwardZero"; }
        else if ("Freebox Player Mini v2".equals(model)) { return "Freebox Mini 4K"; }
        else if ("FLY_IQ4400_AF".equals(model)) { return "Fly Iris"; }
        else if ("FWSP-S1000".equals(model)) { return "Finggo FWSP-S1000"; }
        else if ("FP-U320-711-WIFI".equals(model)) { return "SAKAISIO FP-U320-711-WIFI"; }
        return "";

    }
    public static String iMethod (String model) {
        if ("IdeaTabA1000L-F".equals(model)) { return "Lenovo A1000L"; }
        else if ("IdeaTab A3000-H".equals(model)) { return "Lenovo IdeaTab A3000"; }
        else if ("IdeaTab A3000-F".equals(model)) { return "Lenovo EveryPad"; }
        else if ("Indigo".equals(model)) { return "Explay Indigo"; }
        else if ("Infinix-X552".equals(model)) { return "INFINIX-X552"; }
        else if ("Infinix-X551".equals(model)) { return "Infinix HOT NOTE"; }
        else if ("IGGY".equals(model)) { return "WIKO IGGY"; }
        else if ("Ideos".equals(model)) { return "Huawei IDEOS"; }
        else if ("Ilium LT500".equals(model)) { return "Lanix Ilium LT500"; }
        else if ("itel_it1550".equals(model)) { return "Itel it1550"; }
        else if ("InFocus M510t".equals(model)) { return "Infocus M510t"; }
        else if ("ILIUM X110".equals(model)) { return "Lanix ILIUM X110"; }
        else if ("itel it1355".equals(model)) { return "Itel it1355"; }
        else if ("IdeaTabA1010-T".equals(model)) { return "Lenovo IdeaTab A1010"; }
        else if ("IQX KEN".equals(model)) { return "i-mobile IQX KEN"; }
        else if ("IF236a".equals(model)) { return "InFocus Big Tab"; }
        else if ("IS04".equals(model)) { return "Fujitsu REGZA Phone T-01C"; }
        else if ("IS05".equals(model)) { return "Sharp IS05"; }
        else if ("IS01".equals(model)) { return "Sharp IS01"; }
        else if ("IS03".equals(model)) { return "Sharp IS03"; }
        else if ("IQ4516".equals(model)) { return "Fly IQ4516 Octa"; }
        else if ("IQ4513".equals(model)) { return "Fly IQ4513"; }
        else if ("ideatv K82".equals(model)) { return "Lenovo ideatvK82 60LX750A  52LX750A  46LX750A  60LX850A  70LX850A 80LX850A"; }
        else if ("i-mobile M1703".equals(model)) { return "I-mobile i-note WiFi 1.1"; }
        else if ("IMD501".equals(model)) { return "Enspert CINK KING"; }
        else if ("IM-A770K".equals(model)) { return "Pantech VEGA RACER"; }
        else if ("INFINIX-X551".equals(model)) { return "INFINIX-X551"; }
        else if ("IS15SH".equals(model)) { return "Sharp AQUOS PHONE SL IS15SH"; }
        else if ("InFocus M550".equals(model)) { return "InFocus M550"; }
        else if ("InFocus M2_3G".equals(model)) { return "Infocus M2_3G"; }
        else if ("ICON".equals(model)) { return "Cellon ICON"; }
        else if ("Idol2S_Orange".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("I50".equals(model)) { return "Haier I50"; }
        else if ("IS11S".equals(model)) { return "Sony Ericsson Xperia Acro"; }
        else if ("IS11T".equals(model)) { return "Fujitsu REGZA Phone IS11T"; }
        else if ("IS11N".equals(model)) { return "NEC MEDIAS BR IS11N"; }
        else if ("iphone C600".equals(model)) { return "Gradiente iphone C600"; }
        else if ("INSIGNIA_550i".equals(model)) { return "GoClever INSIGNIA 550i"; }
        else if ("Infinix HOT 3 LTE".equals(model)) { return "Infinix HOT 3 LTE"; }
        else if ("IQ456".equals(model)) { return "Fly Era Life 2"; }
        else if ("IQ459".equals(model)) { return "Fly Evo Chic 2"; }
        else if ("IS11PT".equals(model)) { return "Pantech MIRACH_J"; }
        else if ("i-mobile IQ1-1".equals(model)) { return "Cellon IQ 1.1"; }
        else if ("InFocus M680".equals(model)) { return "InFocus M680"; }
        else if ("IM-A900L".equals(model)) { return "Pantech VEGA Secret UP"; }
        else if ("IM-A900K".equals(model)) { return "Pantech VEGA Secret UP"; }
        else if ("IM-A900S".equals(model)) { return "Pantech VEGA Secret UP"; }
        else if ("IQ4417 Quad".equals(model)) { return "Fly IQ4417 Quad"; }
        else if ("IM-A860K".equals(model)) { return "Pantech IM-A860K"; }
        else if ("IM-A860L".equals(model)) { return "Pantech IM-A860L"; }
        else if ("IM-A860S".equals(model)) { return "Pantech IM-A860S"; }
        else if ("IQ4551".equals(model)) { return "Fly IQ4551"; }
        else if ("ISW13HT".equals(model)) { return "HTC ISW13HT"; }
        else if ("IQ434".equals(model)) { return "Fly IQ434"; }
        else if ("ILIUM S520".equals(model)) { return "Lanix Ilium_S520"; }
        else if ("Infinix X509".equals(model)) { return "Infinix Zero 2"; }
        else if ("InFocus M512".equals(model)) { return "Infocus M512"; }
        else if ("Infinix X505".equals(model)) { return "Infinix X505"; }
        else if ("IR8Q".equals(model)) { return "Viewsonic"; }
        else if ("ILIUM_X100".equals(model)) { return "Lanix X100"; }
        else if ("IN610".equals(model)) { return "Infocus IN610"; }
        else if ("ITQ701".equals(model)) { return "iRiver Wow TAB +"; }
        else if ("ITQ700".equals(model)) { return "iRiver Wow(Window of the world)"; }
        else if ("InFocus M2".equals(model)) { return "InFocus M2"; }
        else if ("ITP-E410W".equals(model)) { return "SK Telesys ITP-E410W"; }
        else if ("IS11LG".equals(model)) { return "LGE Optimus EX"; }
        else if ("InFocus M535".equals(model)) { return "Infocus M535_00WW"; }
        else if ("InFocus M530".equals(model)) { return "InFocus M530"; }
        else if ("Internet TV Box".equals(model)) { return "Sony Internet TV"; }
        else if ("i4901".equals(model)) { return "IDEA i4901"; }
        else if ("IS13SH".equals(model)) { return "Sharp AQUOS PHONE IS13SH"; }
        else if ("Ilium X200".equals(model)) { return "Lanix Ilium X200"; }
        else if ("ISW11M".equals(model)) { return "Motorola Photon 4G"; }
        else if ("IM-A780L".equals(model)) { return "Pantech VEGA RACER"; }
        else if ("IM-A920S".equals(model)) { return "Pantech IM-A920S"; }
        else if ("IQ4420 Quad".equals(model)) { return "Fly IQ4420 Quad"; }
        else if ("IR10Q".equals(model)) { return "Viewsonic"; }
        else if ("IM-A710K".equals(model)) { return "Pantech Vega X"; }
        else if ("I212".equals(model)) { return "TCT (Alcatel) Pixo 7"; }
        else if ("I213".equals(model)) { return "TCT (Alcatel) Pixo 7"; }
        else if ("I211".equals(model)) { return "TCT (Alcatel) Pixo 7"; }
        else if ("Ice-Phone Mini".equals(model)) { return "Ice Phone Mini"; }
        else if ("InFocus M415".equals(model)) { return "InFocus M415"; }
        else if ("IQ4490i".equals(model)) { return "Fly IQ4490i"; }
        else if ("ITP-R408W".equals(model)) { return "TUNTUN English DREAM PAD"; }
        else if ("Ilium L1200".equals(model)) { return "Lanix Ilium L1200"; }
        else if ("InFocus M550 3D".equals(model)) { return "InFocus M550 3D"; }
        else if ("InFocus M330".equals(model)) { return "Infocus M330"; }
        else if ("IQ4504 Quad".equals(model)) { return "Fly IQ4504 Quad"; }
        else if ("I216X".equals(model)) { return "TCT (Alcatel) I216X"; }
        else if ("INGO-TAB".equals(model)) { return "Haier INGO-TAB"; }
        else if ("I216A".equals(model)) { return "TCT (Alcatel) I216A"; }
        else if ("InFocus M808i".equals(model)) { return "InFocus M808i"; }
        else if ("ILIUM PAD E10Si".equals(model)) { return "Lanix ILIUM PAD E10Si"; }
        else if ("IM-A760S".equals(model)) { return "Pantech IM-A760S"; }
        else if ("InFocus M810".equals(model)) { return "InFocus M810"; }
        else if ("InFocus M812".equals(model)) { return "InFocus M812"; }
        else if ("IM-A840SP".equals(model)) { return "Pantech IM-840SP"; }
        else if ("IdeaPadA10".equals(model)) { return "Lenovo A10"; }
        else if ("InFocus M310".equals(model)) { return "Infocus M310"; }
        else if ("i6 Metal HD".equals(model)) { return "Qmobile i6 Metal HD"; }
        else if ("ICRAIG_CMP771".equals(model)) { return "ICRAIG_CMP_771"; }
        else if ("ICRAIG_CMP770".equals(model)) { return "ICRAIG_CMP770"; }
        else if ("ICRAIG_CMP773".equals(model)) { return "ICRAIG_CMP_773"; }
        else if ("ISW16SH".equals(model)) { return "Sharp AQUOS PHONE SERIE ISW16SH"; }
        else if ("Ilium_L1000".equals(model)) { return "Lanix ILIUM L1000"; }
        else if ("iX101T1".equals(model)) { return "Xplore_Technologies RangerX"; }
        else if ("IN335".equals(model)) { return "InFocus IN335"; }
        else if ("IM-A870K".equals(model)) { return "Pantech IM-A870K"; }
        else if ("IM-A870L".equals(model)) { return "Pantech IM-A870L"; }
        else if ("IM-A870S".equals(model)) { return "Pantech IM-A870S"; }
        else if ("Ilium S130".equals(model)) { return "Lanix Ilium_S130"; }
        else if ("itel it1556".equals(model)) { return "Itel it1556"; }
        else if ("itel it1551".equals(model)) { return "Itel it1551"; }
        else if ("Internet TV".equals(model)) { return "Sony Internet TV"; }
        else if ("I-K1".equals(model)) { return "iRiver ULALA"; }
        else if ("IM-A720L".equals(model)) { return "Pantech Vega X"; }
        else if ("Infinix X405".equals(model)) { return "Infinix X405"; }
        else if ("I110".equals(model)) { return "Acer Liquid C1"; }
        else if ("IQ4409 Quad".equals(model)) { return "Fly IQ4409 Quad"; }
        else if ("ido".equals(model)) { return "Xiaomi Redmi 3"; }
        else if ("i785Q".equals(model)) { return "IView SupraPad i785Q"; }
        else if ("InFocus M425".equals(model)) { return "InFocus M425"; }
        else if ("InFocus M350".equals(model)) { return "InFocus M350"; }
        else if ("ILIUM L1100".equals(model)) { return "Lanix Ilium_L1100"; }
        else if ("itel it1702".equals(model)) { return "Itel it1702"; }
        else if ("IdeaTab S6000-F".equals(model)) { return "Lenovo IdeaTab S6000"; }
        else if ("IdeaTab S6000-H".equals(model)) { return "Lenovo IdeaTab S6000"; }
        else if ("Ilium_PAD_i7".equals(model)) { return "Lanix ilium PAD i7"; }
        else if ("iris pro 30".equals(model)) { return "Cellon iris pro 30"; }
        else if ("iliumPAD".equals(model)) { return "Gigabyte mexico"; }
        else if ("InFocus M812A".equals(model)) { return "InFocus M812A"; }
        else if ("InFocus M812i".equals(model)) { return "InFocus M812i"; }
        else if ("IQ4418".equals(model)) { return "Fly IQ4418"; }
        else if ("IQ4416".equals(model)) { return "Fly IQ4416"; }
        else if ("IQ4415".equals(model)) { return "Fly IQ4415"; }
        else if ("InFocus M320m".equals(model)) { return "Infocus M320m"; }
        else if ("InFocus M320e".equals(model)) { return "Infocus M320e"; }
        else if ("InFocus M320u".equals(model)) { return "Infocus M320u"; }
        else if ("IQ4601".equals(model)) { return "Fly IQ4601"; }
        else if ("INFOBAR C01".equals(model)) { return "Sharp INFOBAR C01"; }
        else if ("i-mobile IQ XA".equals(model)) { return "Cellon i-mobile IQ X"; }
        else if ("i-mobile IQ X2".equals(model)) { return "Cellon i-mobile IQ X2A"; }
        else if ("ILIUM S670".equals(model)) { return "Lanix ILIUM S670"; }
        else if ("InFocus M460".equals(model)) { return "InFocus M460"; }
        else if ("IM-A820L".equals(model)) { return "Pantech Vega LTE M"; }
        else if ("InFocus M2PLUS".equals(model)) { return "InFocus M2+"; }
        else if ("InFocus M810t".equals(model)) { return "InFocus M810t"; }
        else if ("Inspire HD".equals(model)) { return "HTC Desire HD"; }
        else if ("i-mobile i-STYLE 7A".equals(model)) { return "Cellon i-STYLE7A"; }
        else if ("i7".equals(model)) { return "Venturer i7"; }
        else if ("Imperium7".equals(model)) { return "Explay Imperium 7"; }
        else if ("Imperium8".equals(model)) { return "Explay Imperium 8"; }
        else if ("ISW11K".equals(model)) { return "Kyocera DIGNO"; }
        else if ("INHON PAPILIO G1".equals(model)) { return "Gigabyte PAPILIO G1"; }
        else if ("ILIUM L900".equals(model)) { return "Lanix ILIUM L900"; }
        else if ("ilium Pad E9".equals(model)) { return "Lanix ilium PAD E9"; }
        else if ("Ilium X500B".equals(model)) { return "Lanix Ilium X500B"; }
        else if ("IQ4512 Quad".equals(model)) { return "Fly IQ4512 Quad"; }
        else if ("IM-A910L".equals(model)) { return "Pantech IM-A910L"; }
        else if ("IM-A690S".equals(model)) { return "Pantech Mirach"; }
        else if ("IM-A690L".equals(model)) { return "Pantech Mirach"; }
        else if ("IM-A910S".equals(model)) { return "Pantech IM-A910S"; }
        else if ("IF195a".equals(model)) { return "InFocus Big Tab"; }
        else if ("IQ459 Quad".equals(model)) { return "Fly Evo Chic 2"; }
        else if ("IM-A880S".equals(model)) { return "Pantech IM-A880S"; }
        else if ("ideatv K91".equals(model)) { return "Lenovo IdeaTV"; }
        else if ("IQ4509".equals(model)) { return "Fly IQ4509"; }
        else if ("IUNI N1".equals(model)) { return "IUNI N1"; }
        else if ("itel_it1505".equals(model)) { return "Itel it1505"; }
        else if ("IS12F".equals(model)) { return "Fujitsu ARROWS ES IS12F"; }
        else if ("IS12SH".equals(model)) { return "Sharp AQUOS PHONE IS12SH"; }
        else if ("IM-A850K".equals(model)) { return "Pantech IM-A850K"; }
        else if ("IS17SH".equals(model)) { return "Sharp AQUOS PHONE CL IS17SH"; }
        else if ("IM-A800S".equals(model)) { return "Pantech IM-A800S"; }
        else if ("Infinix HOT 3 Pro".equals(model)) { return "Infinix HOT 3"; }
        else if ("i700".equals(model)) { return "IView SupraPad i700"; }
        else if ("IS14SH".equals(model)) { return "Sharp AQUOS PHONE IS14SH"; }
        else if ("IQ4421 Quad".equals(model)) { return "FLY IQ4421 Quad"; }
        else if ("InFocus M560".equals(model)) { return "InFocus M560"; }
        else if ("Ilium_S130".equals(model)) { return "Lanix Ilium_S130"; }
        else if ("IQ4505 Quad".equals(model)) { return "Fly IQ4505 Quad"; }
        else if ("IQ4507".equals(model)) { return "Fly Dune 3"; }
        else if ("ISW12HT".equals(model)) { return "HTC EVO 3D ISW12HT"; }
        else if ("i10".equals(model)) { return "SYMPHONY i10"; }
        else if ("IQ4602 Quad".equals(model)) { return "Fly IQ4602"; }
        else if ("IM-A775C".equals(model)) { return "Pantech IM-A775C"; }
        else if ("Infinix X511".equals(model)) { return "Infinix SURF 2"; }
        else if ("Infinix X510".equals(model)) { return "Infinix"; }
        else if ("IM-A840S".equals(model)) { return "Pantech IM-A840S"; }
        else if ("ISW11F".equals(model)) { return "Fujitsu ARROWS Z ISW11F"; }
        else if ("IQ4502 Quad".equals(model)) { return "Fly Era Energy 1"; }
        else if ("IM-A830KE".equals(model)) { return "Pantech IM-A830KE"; }
        else if ("IQ4514 Quad".equals(model)) { return "Fly IQ4514 Quad"; }
        else if ("i-mobile IQ X".equals(model)) { return "Cellon i-mobile IQ X"; }
        else if ("IS12S".equals(model)) { return "Sony Ericsson Xperia acro HD"; }
        else if ("IQ4511 Octa".equals(model)) { return "Fly Tornado One"; }
        else if ("ideatv S52".equals(model)) { return "Lenovo ideatv S52"; }
        else if ("i-mobile IQ II".equals(model)) { return "I-mobile IQ II"; }
        else if ("IN810".equals(model)) { return "Infocus IN810"; }
        else if ("IN815".equals(model)) { return "Infocus IN815"; }
        else if ("I10A-LE".equals(model)) { return "Anydata Leader I10A-LE"; }
        else if ("ISW13F".equals(model)) { return "Fujitsu ARROWS Z ISW13F"; }
        else if ("IM-A730S".equals(model)) { return "Pantech IM-A730S"; }
        else if ("itel it1407".equals(model)) { return "Itel it1407"; }
        else if ("IM-A830L".equals(model)) { return "Pantech IM-A830L"; }
        else if ("IM-A830K".equals(model)) { return "Pantech IM-A830K"; }
        else if ("IM-A830S".equals(model)) { return "Pantech IM-A830S"; }
        else if ("IS11SH".equals(model)) { return "Sharp AQUOS PHONE IS11SH"; }
        else if ("InFocus M260".equals(model)) { return "InFocus M260"; }
        else if ("Ilium L820".equals(model)) { return "Lanix ILIUM L820"; }
        else if ("iX101T1-2G".equals(model)) { return "Xplore_Technologies RangerX"; }
        else if ("Infinity POP".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4030X"; }
        else if ("I221".equals(model)) { return "TCT (Alcatel) I221"; }
        else if ("I220".equals(model)) { return "TCT (Alcatel) I220"; }
        else if ("ILIUM L1000".equals(model)) { return "Lanix ILIUM L1000"; }
        else if ("I7A-LE".equals(model)) { return "Haier GF88"; }
        else if ("Idea ULTRA".equals(model)) { return "Coolpad Idea ULTRA"; }
        else if ("ISW11SC".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("INFINIX-X600".equals(model)) { return "INFINIX-X600"; }
        else if ("IM-T100K".equals(model)) { return "Pantech AT1"; }
        else if ("ITP-R208W".equals(model)) { return "SK Telesys ITP-R208W"; }
        else if ("ILIUM L950".equals(model)) { return "Lanix ILIUM L950"; }
        else if ("IQ4503 Quad".equals(model)) { return "Fly IQ4503 Quad"; }
        else if ("IQ4513 Octa".equals(model)) { return "Fly IQ4513 Octa"; }
        else if ("Infinix X454".equals(model)) { return "Infinix RACE Blot2"; }
        else if ("Infinix X455".equals(model)) { return "Infinix RACE Bolt 3"; }
        else if ("Ilium L1050".equals(model)) { return "Lanix Ilium L1050"; }
        else if ("ITQ1000".equals(model)) { return "iRiver WOW Tab+(ITQ1000)"; }
        else if ("Idea ULTRA Pro".equals(model)) { return "Coolpad 7270I"; }
        else if ("IM-A890L".equals(model)) { return "Pantech VEGA Secret Note"; }
        else if ("IM-A890K".equals(model)) { return "Pantech VEGA Secret Note"; }
        else if ("IM-A890S".equals(model)) { return "Pantech VEGA Secret Note"; }
        else if ("InFocus M808".equals(model)) { return "InFocus M808"; }
        else if ("IM5".equals(model)) { return "Kodak IM5"; }
        else if ("ICRAIG_CLP291".equals(model)) { return "ICRAIG_CLP_291"; }
        else if ("IR7Q".equals(model)) { return "ViewSonic ViewPad IR7Q"; }
        else if ("InFocus M320".equals(model)) { return "Infocus M320"; }
        else if ("ideatv S61".equals(model)) { return "Lenovo S61"; }
        else if ("IM-A810S".equals(model)) { return "Pantech IM-A810S"; }
        else if ("IdeaTabA1000-G".equals(model)) { return "Lenovo A1000-G"; }
        else if ("IdeaTabA1000-F".equals(model)) { return "Lenovo A1000"; }
        else if ("IM-A810K".equals(model)) { return "Pantech IM-A810K"; }
        else if ("IQ4413_Quad".equals(model)) { return "Fly IQ4413 Quad"; }
        else if ("IdeaTabA5000-E".equals(model)) { return "Lenovo IdeaTab A5000"; }
        else if ("ideatv K72".equals(model)) { return "Lenovo 60K72"; }
        else if ("Ice-Phone Forever".equals(model)) { return "SK Telesys Ice-Phone Forever"; }
        else if ("ilium_Pad_E7".equals(model)) { return "Lanix ilium Pad E7"; }
        else if ("Infinity".equals(model)) { return "NGM Infinity"; }
        else if ("iRULU_V3".equals(model)) { return "USA111 iRULU V3"; }
        else if ("IQ458 Quad".equals(model)) { return "Fly IQ458 Quad Evo Tech 2"; }
        else if ("IM-A750K".equals(model)) { return "Pantech Mirach A"; }
        else if ("IM-A740S".equals(model)) { return "Pantech IM-A740S"; }
        else if ("ILIUM L200".equals(model)) { return "Lanix ILIUM L200"; }
        else if ("icube-830".equals(model)) { return "SK Telesys icube-830"; }
        else if ("Ice-Twist".equals(model)) { return "Huawei Ice-Twist"; }
        else if ("Ilium S106".equals(model)) { return "Lanix ilium_S106"; }
        else if ("IQ4516 Octa".equals(model)) { return "Fly IQ4516 Octa"; }
        else if ("IQ4414 Quad".equals(model)) { return "Fly Evo Tech 3"; }
        else if ("IdeaTabA1020-T".equals(model)) { return "Lenovo IdeaTab A1020"; }
        else if ("IQ4511 TR".equals(model)) { return "Fly Tornado One"; }
        else if ("IM-A910K".equals(model)) { return "Pantech IM-A910K"; }
        else if ("IN260".equals(model)) { return "InFocus IN260"; }
        else if ("IM-A850S".equals(model)) { return "Pantech IM-A850S"; }
        else if ("IM-A850L".equals(model)) { return "Pantech IM-A850L"; }
        else if ("Ilium_L950".equals(model)) { return "Lanix ILIUM L950"; }
        else if ("INFOBAR A01".equals(model)) { return "Sharp INFOBAR A01"; }
        else if ("IQ4515 Quad".equals(model)) { return "Fly IQ4515 Quad"; }
        else if ("IQ4406".equals(model)) { return "Fly Era Nano 6"; }
        else if ("IQ4407".equals(model)) { return "Fly ERA Nano 7"; }
        else if ("IQ4400".equals(model)) { return "Fly Era Nano 8"; }
        else if ("IQ4401".equals(model)) { return "Fly IQ4401"; }
        else if ("i-mobile IQ X2A".equals(model)) { return "Cellon i-mobile IQ X2A"; }
        else if ("InFocus M430".equals(model)) { return "InFocus M430"; }
        else if ("IN265".equals(model)) { return "7Eleven IN265"; }
        else if ("IQ4415 Quad".equals(model)) { return "Fly Era Style 3"; }
        else if ("IQ436i".equals(model)) { return "Fly Era Nano 9"; }
        else if ("IM-A725L".equals(model)) { return "Pantech ef14lv"; }
        else if ("ICRAIG_CLP288".equals(model)) { return "ICRAIG_CLP288"; }
        else if ("ILIUM X400".equals(model)) { return "Lanix X400"; }
        else if ("iRULU X11".equals(model)) { return "USA111 IRULU X11"; }
        else if ("itel it1508".equals(model)) { return "Itel it1508"; }
        else if ("itel it1506".equals(model)) { return "Itel it1506"; }
        else if ("itel it1507".equals(model)) { return "Itel it1507"; }
        else if ("Infinity-10.1-v2".equals(model)) { return "Infinity-10.1-v2"; }
        else if ("Infinity-10.1-v3".equals(model)) { return "Infinity-10.1-v3"; }
        else if ("iX101B1".equals(model)) { return "Xplore Technologies XSLATE_D10"; }
        else if ("i-mobile i-STYLE 7".equals(model)) { return "Cellon i-STYLE7"; }
        return "";

    }
    public static String hMethod (String model) {
        if ("Hisense E602M".equals(model)) { return "Hisense E620M"; }
        else if ("HTC_D626ph".equals(model)) { return "HTC Desire 626G+ dual sim"; }
        else if ("Hisense E602T".equals(model)) { return "Hisense E602T"; }
        else if ("HUAWEI Y600-U151".equals(model)) { return "Huawei Y600"; }
        else if ("HTC Desire 526".equals(model)) { return "HTC Desire 526"; }
        else if ("HTC_One_XL".equals(model)) { return "HTC One XL"; }
        else if ("HTC_D820ts".equals(model)) { return "HTC_D820ys"; }
        else if ("HTC D310w".equals(model)) { return "HTC Desire 310"; }
        else if ("HTC Desire EYE".equals(model)) { return "HTC Desire EYE"; }
        else if ("HTC Sensation XE with Beats Audio Z715e".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HTC Sensation XE with Beats Audio Z715a".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HTC Z560e".equals(model)) { return "HTC One S"; }
        else if ("HTC_D820f".equals(model)) { return "HTC_D820f"; }
        else if ("HTC_PH39100".equals(model)) { return "HTC Vivid 4G"; }
        else if ("HUAWEI TIT-TL00".equals(model)) { return "HUAWEI Y6 Pro"; }
        else if ("H8_Life".equals(model)) { return "AllView Viva H8 Life"; }
        else if ("HTC Desire 310".equals(model)) { return "HTC Desire 310"; }
        else if ("HIGHWAY 4G".equals(model)) { return "Wiko HIGHWAY 4G"; }
        else if ("HTC PROMIN_U".equals(model)) { return "HTC Desire V"; }
        else if ("Hit".equals(model)) { return "Explay Hit"; }
        else if ("HW-03E".equals(model)) { return "Huawei HW-03E"; }
        else if ("HTC K2_U".equals(model)) { return "HTC ONE SV"; }
        else if ("HP 7 Plus".equals(model)) { return "HP 7 Plus"; }
        else if ("HUAWEI B199".equals(model)) { return "Huawei B199"; }
        else if ("HUAWEI GRA-UL00".equals(model)) { return "Huawei GRA-UL00"; }
        else if ("HTC 0P6B900".equals(model)) { return "HTC One (M8 EYE)"; }
        else if ("HUAWEI-M835".equals(model)) { return "Huawei M835"; }
        else if ("HS-10DTB4".equals(model)) { return "Haier HS-10DTB4"; }
        else if ("HS-10DTB8".equals(model)) { return "Hipstreet HS-10DTB8"; }
        else if ("HTC Amaze 4G".equals(model)) { return "HTC_Amaze_4G"; }
        else if ("HTC Kingdom".equals(model)) { return "HTCEVODesign4G"; }
        else if ("HUAWEI Y550-L01".equals(model)) { return "Huawei Y550-L01"; }
        else if ("HUAWEI Y550-L02".equals(model)) { return "Huawei Y550-L02"; }
        else if ("HUAWEI Y550-L03".equals(model)) { return "Huawei Y550-L03"; }
        else if ("H30-T00".equals(model)) { return "Huawei H30-T00"; }
        else if ("HTC_0P6A1".equals(model)) { return "HTC Desire 300"; }
        else if ("HUAWEI Y360-U82".equals(model)) { return "Huawei Y360-U82"; }
        else if ("HUAWEI P6 S-U06".equals(model)) { return "Huawei P6S-U06"; }
        else if ("HUAWEI G660-L075".equals(model)) { return "Huawei G660-L075"; }
        else if ("HTC Desire 501 dual sim".equals(model)) { return "HTC Desire 501 dual sim"; }
        else if ("HTC-X710a".equals(model)) { return "HTC Velocity 4G"; }
        else if ("HTC Bee".equals(model)) { return "HTC Wildfire CDMA"; }
        else if ("HTC 0PM31".equals(model)) { return "HTC Desire 526"; }
        else if ("HUAWEI G730-T00".equals(model)) { return "Huawei G730"; }
        else if ("HTC Desire 500".equals(model)) { return "HTC Desire 500"; }
        else if ("HTC Desire 501".equals(model)) { return "HTC Desire 501"; }
        else if ("HTC 2PS5200".equals(model)) { return "HTC One X9"; }
        else if ("HTC T328w".equals(model)) { return "HTC Desire V"; }
        else if ("HTC Desire 728 dual sim".equals(model)) { return "HTC_D728x"; }
        else if ("Hisense E70-T".equals(model)) { return "Hisense E70-T"; }
        else if ("HUAWEI ALE-L04".equals(model)) { return "Huawei ALE-L04"; }
        else if ("HS-9DTB7A".equals(model)) { return "Hipstreet HS-9DTB7A"; }
        else if ("HWT31".equals(model)) { return "Huawei HWT31"; }
        else if ("HUAWEI WATCH".equals(model)) { return "HUAWEI WATCH"; }
        else if ("HS-T966".equals(model)) { return "Hisense HS-T966"; }
        else if ("HS-T967".equals(model)) { return "Hisense HS-T967"; }
        else if ("Huawei Y301A2".equals(model)) { return "Huawei Y301A2"; }
        else if ("Huawei Y301A1".equals(model)) { return "Huawei Y301A1"; }
        else if ("HTC_Desire_300".equals(model)) { return "HTC Desire 300"; }
        else if ("H882L".equals(model)) { return "Huawei H882L"; }
        else if ("HTC K2_UL".equals(model)) { return "HTC One SV"; }
        else if ("HUAWEI Y300-0151".equals(model)) { return "Huawei Y300"; }
        else if ("HS-U98".equals(model)) { return "Hisense HS-U98"; }
        else if ("HS-T968S".equals(model)) { return "Hisense HS-T968S"; }
        else if ("HS-U988".equals(model)) { return "Hisense U988E-2"; }
        else if ("HUAWEI G7500".equals(model)) { return "Huawei G7500"; }
        else if ("Hisense I632T".equals(model)) { return "Hisense I632T"; }
        else if ("Hisense I632M".equals(model)) { return "Hisense I632M"; }
        else if ("HUAWEI Y625-U43".equals(model)) { return "Huawei Y625-U43"; }
        else if ("HTC 0PL4100".equals(model)) { return "HTC Desire 526G+ dual sim"; }
        else if ("HUAWEI Y360-U103".equals(model)) { return "Huawei Y360-U103"; }
        else if ("HS-U609".equals(model)) { return "Hisense U609"; }
        else if ("HS-U978".equals(model)) { return "Hisense HS-U978"; }
        else if ("HS-U602".equals(model)) { return "Hisense U602"; }
        else if ("HTC_0P9C2".equals(model)) { return "HTC Desire 816"; }
        else if ("HS-U601".equals(model)) { return "Hisense HS-U601"; }
        else if ("HS-U606".equals(model)) { return "Hisense U606AE"; }
        else if ("HS-U971".equals(model)) { return "Hisense HS-U971"; }
        else if ("HTC_D820u".equals(model)) { return "HTC_D820u"; }
        else if ("HUAWEI G620-L72".equals(model)) { return "Huawei G620-L72"; }
        else if ("HS-10DTB12".equals(model)) { return "Hipstreet HS-10DTB12"; }
        else if ("HTC 6160".equals(model)) { return "HTC 6160"; }
        else if ("HTC 0PM11".equals(model)) { return "HTC Desire 626G+ dual sim"; }
        else if ("Hisense F21T".equals(model)) { return "Hisense F21T"; }
        else if ("HTC-Z710a".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HTC_Desire_320".equals(model)) { return "HTC Desire320"; }
        else if ("HTC_M9e".equals(model)) { return "HTC_M9e"; }
        else if ("HTC One A9".equals(model)) { return "HTC One A9"; }
        else if ("HTC_M10h".equals(model)) { return "HTC 10"; }
        else if ("HUAWEI G6-U00".equals(model)) { return "Huawei G6-U00"; }
        else if ("H58".equals(model)) { return "Symphony H58"; }
        else if ("HTC Aria".equals(model)) { return "HTC Aria"; }
        else if ("HUAWEI MT7-CL00".equals(model)) { return "Huawei MT7-CL00"; }
        else if ("HTC D626d".equals(model)) { return "HTC Desire 626"; }
        else if ("HTC D626t".equals(model)) { return "HTC D626t"; }
        else if ("Hisense E621T".equals(model)) { return "Hisense E621T"; }
        else if ("HS-7DTB29-8GB".equals(model)) { return "Haier HS-7DTB29-8GB"; }
        else if ("Hisense I630U".equals(model)) { return "Hisense I630U"; }
        else if ("HS-U950".equals(model)) { return "Hisense HS-U950"; }
        else if ("HTC J Z321e".equals(model)) { return "HTC J Z321e"; }
        else if ("HS-H800T".equals(model)) { return "Hisense H800T"; }
        else if ("HTC Desire 630 dual sim".equals(model)) { return "HTC Desire 630 dual sim"; }
        else if ("Huawei-U8652".equals(model)) { return "Huawei U8652"; }
        else if ("Hisense SoundTab MA-327".equals(model)) { return "Hisense SoundTab MA-327"; }
        else if ("HG-9041".equals(model)) { return "Haier HG-9041"; }
        else if ("Hisense D1-M".equals(model)) { return "Hisense D1-M"; }
        else if ("HTC 809d".equals(model)) { return "HTC 809d"; }
        else if ("HUAWEI Y321-U051".equals(model)) { return "Huawei Y321"; }
        else if ("HTC_D826y".equals(model)) { return "HTC Desire 826"; }
        else if ("HUAWEI TAG-CL00".equals(model)) { return "HUAWEI TANGO"; }
        else if ("HTC Status".equals(model)) { return "HTC Chacha"; }
        else if ("HUAWEI NXT-TL00".equals(model)) { return "Huawei Mate 8-TL00"; }
        else if ("HP 8".equals(model)) { return "HP 8"; }
        else if ("HP 7".equals(model)) { return "HP 7 Tablet"; }
        else if ("Hisense E360M".equals(model)) { return "Hisense E360M"; }
        else if ("HW-W820".equals(model)) { return "Cellon HWW820"; }
        else if ("HTC One M9PLUS".equals(model)) { return "HTC One M9PLUS"; }
        else if ("HTC 0PFH11".equals(model)) { return "HTC Desire EYE"; }
        else if ("HP Pro Slate 8".equals(model)) { return "HP Pro Slate 8"; }
        else if ("HUAWEI H871G".equals(model)) { return "HUAWEI H871G"; }
        else if ("HTC Desire 816 dual sim".equals(model)) { return "HTC Desire 816 dual sim"; }
        else if ("H30-T10".equals(model)) { return "Huawei Honor3"; }
        else if ("HS-U936".equals(model)) { return "Hisense HS-U936"; }
        else if ("HS-U939".equals(model)) { return "Hisense HS-U939"; }
        else if ("HUAWEI Y516-T00".equals(model)) { return "Huawei Y516-"; }
        else if ("HSG1279".equals(model)) { return "HANNSpree HSG1279"; }
        else if ("HTC_PO582".equals(model)) { return "HTC One mini"; }
        else if ("HUAWEI P7-L00".equals(model)) { return "Huawei P7-L00"; }
        else if ("HUAWEI P7-L05".equals(model)) { return "Huawei P7-L05"; }
        else if ("HUAWEI P7-L07".equals(model)) { return "Huawei P7-L07"; }
        else if ("HUAWEI P7-L09".equals(model)) { return "Huawei P7-L09"; }
        else if ("HUAWEI Y221-U22".equals(model)) { return "Huawei Y221-U22"; }
        else if ("HUAWEI Y518-T00".equals(model)) { return "Huawei Y518-T00"; }
        else if ("HP Slate 7 Beats Special Edition".equals(model)) { return "HP Slate 7 Beats Special Edition"; }
        else if ("HUAWEI G6-U251".equals(model)) { return "Huawei G6-U251"; }
        else if ("HTC Wildfire".equals(model)) { return "HTC Wildfire CDMA"; }
        else if ("HTC 0PAJ4".equals(model)) { return "HTC One (E8) dual sim"; }
        else if ("HUAWEI Y635-L02".equals(model)) { return "Huawei Y635-L02"; }
        else if ("HUAWEI Y635-L03".equals(model)) { return "Huawei Y635-L03"; }
        else if ("HTC_D828x".equals(model)) { return "HTC Desire 828"; }
        else if ("HTC One SV BLK".equals(model)) { return "HTC One SV BLK"; }
        else if ("HUAWEI G6-C00".equals(model)) { return "Huawei G6-C00"; }
        else if ("HUAWEI Y336-U02".equals(model)) { return "Huawei Y336-U02"; }
        else if ("HM 1S".equals(model)) { return "Xiaomi HM 1SC"; }
        else if ("HTC Hero S".equals(model)) { return "HTCEVODesign4G"; }
        else if ("HTC 7088".equals(model)) { return "HTC Desire 7088"; }
        else if ("HUAWEI G730-C00".equals(model)) { return "Huawei G730"; }
        else if ("HM 1AC".equals(model)) { return "Xiaomi HM 1SC"; }
        else if ("HS-U912".equals(model)) { return "Hisense HS-U912"; }
        else if ("HTC 0PE65".equals(model)) { return "HTC Desire 620G dual sim"; }
        else if ("HTC 0PE64".equals(model)) { return "HTC Desire 620"; }
        else if ("Hisense E625T".equals(model)) { return "Hisense E625T"; }
        else if ("HTC One X".equals(model)) { return "HTC Onex X"; }
        else if ("HTC One V".equals(model)) { return "HTC One V"; }
        else if ("HTC One S".equals(model)) { return "HTC One S"; }
        else if ("HM NOTE 1LTEW".equals(model)) { return "Xiaomi HM NOTE 1LTETD"; }
        else if ("HUAWEI MT2-L01".equals(model)) { return "Huawei MT2-L01"; }
        else if ("HUAWEI MT2-L02".equals(model)) { return "Huawei MT2-L02"; }
        else if ("HUAWEI MT2-L05".equals(model)) { return "Huawei MT2-L05"; }
        else if ("HS-T978".equals(model)) { return "Hisense HS-T978"; }
        else if ("HS-L682".equals(model)) { return "Hisense L682"; }
        else if ("HUAWEI SCL-L21".equals(model)) { return "Huawei Y6"; }
        else if ("HUAWEI G730-L075".equals(model)) { return "Huawei G730-L075"; }
        else if ("HTC One SV".equals(model)) { return "HTC One SV BLK"; }
        else if ("HTC M8w".equals(model)) { return "HTC One (M8)"; }
        else if ("HUAWEI Y221-U03".equals(model)) { return "Huawei Y221-U03"; }
        else if ("HTC_M910x".equals(model)) { return "HTC Desire EYE"; }
        else if ("HTC One dual 802d".equals(model)) { return "HTC One Dual 802d"; }
        else if ("HTC M10u".equals(model)) { return "HTC 10"; }
        else if ("HTC 901e".equals(model)) { return "HTC 9060"; }
        else if ("HUAWEI G610-T11".equals(model)) { return "Huawei G610-T11"; }
        else if ("HUAWEI MediaPad M1 8.0".equals(model)) { return "HUAWEI MediaPad M1 8.0"; }
        else if ("HP Slate 7 Plus".equals(model)) { return "HP Slate7 Plus"; }
        else if ("HTC ChaCha A810b".equals(model)) { return "HTC Chacha"; }
        else if ("hisense_gx1200v".equals(model)) { return "Hisense TV"; }
        else if ("HUAWEI MT7-TL00".equals(model)) { return "Huawei MT7-TL00"; }
        else if ("HUAWEI GRA-CL10".equals(model)) { return "Huawei GRA-CL10"; }
        else if ("HP Slate 7".equals(model)) { return "HP Slate 7"; }
        else if ("HTC 2PRG100".equals(model)) { return "HTC One S9"; }
        else if ("HTC Desire 816G dual sim".equals(model)) { return "HTC Desire 816G dual sim"; }
        else if ("Hisense E260U".equals(model)) { return "Hisense E260U"; }
        else if ("HTC 606w".equals(model)) { return "HTC Desire 606w"; }
        else if ("HTC One VX".equals(model)) { return "HTC One VX"; }
        else if ("HUAWEI SCL-L01".equals(model)) { return "Huawei Y6"; }
        else if ("HUAWEI SCL-L02".equals(model)) { return "Huawei Y6"; }
        else if ("HUAWEI SCL-L03".equals(model)) { return "Huawei Y6"; }
        else if ("HUAWEI SCL-L04".equals(model)) { return "Huawei Y6"; }
        else if ("HUAWEI CRR-TL00".equals(model)) { return "Huawei Mate S-TL00"; }
        else if ("HTC 2PUK1".equals(model)) { return "HTC Desire 825 dual sim"; }
        else if ("HTC 2PUK2".equals(model)) { return "HTC Desire 825"; }
        else if ("HTC One M8s".equals(model)) { return "HTC ONE M8s"; }
        else if ("HTC 0PM912".equals(model)) { return "HTC Desire626s"; }
        else if ("HUAWEI P6-T00V".equals(model)) { return "Huawei P6"; }
        else if ("HTC Desire 700 dual sim".equals(model)) { return "HTC Desire 700 dual sim"; }
        else if ("HTC One S Special Edition".equals(model)) { return "HTC One S Special Edition"; }
        else if ("HUAWEI MT1-T00".equals(model)) { return "Huawei Mate"; }
        else if ("HUAWEI P7 mini".equals(model)) { return "Huawei P7 mini"; }
        else if ("HUAWEI MT7-UL00".equals(model)) { return "Huawei MT7-UL00"; }
        else if ("HUAWEI P8max".equals(model)) { return "Huawei DAV"; }
        else if ("HTC 803e".equals(model)) { return "HTC 803e"; }
        else if ("HTC6600LVW".equals(model)) { return "HTCOneMaxVZW"; }
        else if ("HUAWEI Y320-U30".equals(model)) { return "Huawei Y320-U30"; }
        else if ("Hisense E613M".equals(model)) { return "Hisense E613M"; }
        else if ("HUAWEI TAG-AL00".equals(model)) { return "HUAWEI TANGO"; }
        else if ("HUAWEI H891L".equals(model)) { return "Huawei H891L"; }
        else if ("HTC Inspire 3D".equals(model)) { return "HTC EVO 3D X515m"; }
        else if ("HTC One_E8 dual sim".equals(model)) { return "HTC One (E8) dual sim"; }
        else if ("Hisense E51".equals(model)) { return "Hisense E51-F"; }
        else if ("HTC Sensation".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HS-U9".equals(model)) { return "Hisense HS-U9"; }
        else if ("HTC_D630x".equals(model)) { return "HTC Desire 626"; }
        else if ("HUAWEI G506-U151".equals(model)) { return "Huawei G506"; }
        else if ("HUAWEI G750-U10".equals(model)) { return "Huawei G750-U10"; }
        else if ("HW-SCL-L32".equals(model)) { return "Huawei Y6"; }
        else if ("HTC_M9ew".equals(model)) { return "HTC_M9ew"; }
        else if ("HTC 5060".equals(model)) { return "HTC Desire 500 dual sim"; }
        else if ("HUAWEI MediaPad T1 7.0 3G".equals(model)) { return "Huawei MediaPad"; }
        else if ("HTC 608t".equals(model)) { return "HTC desire 608t"; }
        else if ("HUAWEI ATH-UL01".equals(model)) { return "HUAWEI ShotX"; }
        else if ("HTC 919d".equals(model)) { return "HTC909d"; }
        else if ("HS-G610".equals(model)) { return "Hisense HS-G610"; }
        else if ("HUAWEI Y600-U40".equals(model)) { return "Huawei Y600-U40"; }
        else if ("H300".equals(model)) { return "Symphony H300"; }
        else if ("HTC Desire 820G dual sim".equals(model)) { return "HTC Desire 820G PLUS dual sim"; }
        else if ("HTC Desire 516 dual sim".equals(model)) { return "HTC Desire 516 dual sim"; }
        else if ("HTC_PN071".equals(model)) { return "HTC One"; }
        else if ("HS-E968".equals(model)) { return "Hisense HS-E968"; }
        else if ("HTC PRO_DS".equals(model)) { return "HTC Desire V"; }
        else if ("HTC PRO_DD".equals(model)) { return "HTC Desire VC"; }
        else if ("HTC 801e".equals(model)) { return "HTC One"; }
        else if ("HUAWEI Y530-U051".equals(model)) { return "Huawei Y530-U051"; }
        else if ("HUAWEI Y320-U10".equals(model)) { return "Huawei Y320-U10"; }
        else if ("HTC D828w".equals(model)) { return "HTC Desire 828"; }
        else if ("HTC Wildfire S A515c".equals(model)) { return "HTC Wildfire S A515c"; }
        else if ("HTC PO49120".equals(model)) { return "HTC 606w"; }
        else if ("HTC Desire 828 dual sim".equals(model)) { return "HTC Desire 828 dual sim"; }
        else if ("HUAWEI M881".equals(model)) { return "Huawei m881"; }
        else if ("HTC_M8x".equals(model)) { return "HTC One (M8)"; }
        else if ("HTC M8d".equals(model)) { return "HTC One (M8)"; }
        else if ("HTC One E9PLUS dual sim".equals(model)) { return "HTC One E9PLUS dual sim"; }
        else if ("HUAWEI Y320-U151".equals(model)) { return "Huawei Y320-U151"; }
        else if ("HTC331ZLVW".equals(model)) { return "HTCDesire612VZW"; }
        else if ("HS-T968".equals(model)) { return "Hisense HS-T968"; }
        else if ("HTC Desire 210 dual sim".equals(model)) { return "HTC Desire 210 dual sim"; }
        else if ("HUAWEI G7-UL20".equals(model)) { return "HUAWEI G7-UL20"; }
        else if ("HTC 2PRE2".equals(model)) { return "HTC Desire 828 dual sim"; }
        else if ("HTC 2PRE4".equals(model)) { return "HTC Desire 828"; }
        else if ("HTC_0P9O2".equals(model)) { return "HTC Desire 610"; }
        else if ("HUAWEI Y321-C00".equals(model)) { return "Huawei Y321"; }
        else if ("HTC_Desire_200".equals(model)) { return "HTC Desire 200"; }
        else if ("HTC_One".equals(model)) { return "HTC One"; }
        else if ("HUAWEI G350-U20".equals(model)) { return "Huawei G350"; }
        else if ("HUAWEI NXT-DL00".equals(model)) { return "Huawei Mate 8-DL00"; }
        else if ("H220".equals(model)) { return "Cherry Mobile H220"; }
        else if ("HS-X5T".equals(model)) { return "Hisense HS-X5T"; }
        else if ("HTC Desire 728G dual sim".equals(model)) { return "HTC Desire 728G dual sim"; }
        else if ("HS-I630T".equals(model)) { return "Hisense HS-I630T"; }
        else if ("Huawei_8100-9".equals(model)) { return "Huawei T-Mobile Pulse"; }
        else if ("HTC_Glacier".equals(model)) { return "HTC Glacier"; }
        else if ("HTC M8t".equals(model)) { return "HTC M8t"; }
        else if ("HTC Wildfire S A510b".equals(model)) { return "HTC Wildfire S"; }
        else if ("HS-EG971".equals(model)) { return "Hisense HS-EG971"; }
        else if ("HS-EG978".equals(model)) { return "Hisense EG978"; }
        else if ("HTC 0PKX2".equals(model)) { return "HTC Desire626"; }
        else if ("HUAWEI Y560-U12".equals(model)) { return "Huawei Y560-U12"; }
        else if ("HTC Desire 610".equals(model)) { return "Htc desire 610"; }
        else if ("HTC 0PL41".equals(model)) { return "HTC Desire 526GPLUS"; }
        else if ("HTC One SC T528d".equals(model)) { return "HTC One SC"; }
        else if ("HTC Desire L dual sim".equals(model)) { return "HTC T528w"; }
        else if ("HUAWEI SC-CL00".equals(model)) { return "Huawei SC-CL00"; }
        else if ("Hisense L695".equals(model)) { return "Hisense L695WE_2"; }
        else if ("HTC Desire 820 dual sim".equals(model)) { return "HTC Desire 820 dual sim"; }
        else if ("HTC Desire 825 dual sim".equals(model)) { return "HTC Desire 825 dual sim"; }
        else if ("HUAWEI G6-L33".equals(model)) { return "Huawei G6-L33"; }
        else if ("HTC One M9_Prime Camera Edition".equals(model)) { return "HTC_M9e"; }
        else if ("HUAWEI G606-T00".equals(model)) { return "Huawei G606"; }
        else if ("HTC D316d".equals(model)) { return "HTC D316d"; }
        else if ("HuaweiG510-0100-orange".equals(model)) { return "Huawei G510"; }
        else if ("HTC DLX_U".equals(model)) { return "HTC Butterfly"; }
        else if ("HUAWEI GRA-CL00".equals(model)) { return "Huawei GRA-CL00"; }
        else if ("HUAWEI G6-T00".equals(model)) { return "Huawei G6"; }
        else if ("HUAWEI G350-U00".equals(model)) { return "Huawei G350"; }
        else if ("HS-E620M".equals(model)) { return "Hisense HS-E620M"; }
        else if ("Hisense G610M".equals(model)) { return "Hisense G610M"; }
        else if ("HTC_7060".equals(model)) { return "HTC Desire 7060"; }
        else if ("HTC E9pw".equals(model)) { return "HTC E9pw"; }
        else if ("HTC E9pt".equals(model)) { return "HTC E9pt"; }
        else if ("HS-U970E".equals(model)) { return "Hisense HS-U970E"; }
        else if ("HUAWEI G730-U10".equals(model)) { return "Huawei G730-U10"; }
        else if ("HUAWEI Y360-U93".equals(model)) { return "Huawei Y360-U93"; }
        else if ("HS-EG958".equals(model)) { return "Hisense HS-EG958"; }
        else if ("Hisense LED55K360X3D".equals(model)) { return "Hisense LED55K360X3D"; }
        else if ("HUAWEI Y625-U51".equals(model)) { return "Huawei Y625-U51"; }
        else if ("HUAWEI M2-A01W".equals(model)) { return "Huawei LISZT"; }
        else if ("Hisense L676".equals(model)) { return "Hisense L676BE-2"; }
        else if ("HTC Desire 616 dual sim".equals(model)) { return "HTC Desire 616 dual sim"; }
        else if ("Hisense L671".equals(model)) { return "Hisense L671WE_2"; }
        else if ("Hisense L678".equals(model)) { return "Hisense L678"; }
        else if ("HSG1351".equals(model)) { return "HannSpree HSG1351"; }
        else if ("HUAWEI G350".equals(model)) { return "Huawei G350"; }
        else if ("HUAWEI G6-L11".equals(model)) { return "Huawei G6-L11"; }
        else if ("HP Slate 17".equals(model)) { return "HP Slate 17"; }
        else if ("HTC_X9u".equals(model)) { return "HTC One X9 dual sim"; }
        else if ("HM NOTE 1TD".equals(model)) { return "Xiaomi HM NOTE 1TD"; }
        else if ("HS_10DTB12A".equals(model)) { return "Hipstreet HS-10DTB12A"; }
        else if ("HTV31".equals(model)) { return "HTC HTV31"; }
        else if ("HTC_D610x".equals(model)) { return "HTC Desire 610"; }
        else if ("HTC T328d".equals(model)) { return "HTC Desire VC"; }
        else if ("HUAWEI Y618-T00".equals(model)) { return "HUAWEI Y618"; }
        else if ("HUAWEI Y325-T00".equals(model)) { return "Huawei Y325-T00"; }
        else if ("HMP8100_ATV_INT".equals(model)) { return "Philips HMP8100/98"; }
        else if ("HUAWEI M2-803L".equals(model)) { return "Huawei M2"; }
        else if ("HTC_One_mini".equals(model)) { return "HTC One mini"; }
        else if ("HUAWEI G700-T01".equals(model)) { return "Huawei G700-T01"; }
        else if ("HUAWEI G700-T00".equals(model)) { return "Huawei G700"; }
        else if ("HTC One mini 2".equals(model)) { return "HTC One mini 2"; }
        else if ("HUAWEI Y610-U00".equals(model)) { return "HUAWEI Y610"; }
        else if ("HUAWEI Y360-U72".equals(model)) { return "Huawei Y360-U72"; }
        else if ("HS-EG939".equals(model)) { return "Hisense HS-EG939"; }
        else if ("HTC 5088".equals(model)) { return "HTC Desire 5088"; }
        else if ("HUAWEI G730-U30".equals(model)) { return "Huawei G730-U30"; }
        else if ("H60-L11".equals(model)) { return "Huawei H60-L11"; }
        else if ("H60-L12".equals(model)) { return "Huawei H60-L12"; }
        else if ("HUAWEI Y625-U32".equals(model)) { return "Huawei Y625-U32"; }
        else if ("HP Slate 6 Voice Tab".equals(model)) { return "HP Slate 6 Voice Tab"; }
        else if ("Harris 12131-1000".equals(model)) { return "harris RF-3590-RT"; }
        else if ("HUAWEI Y520-U03".equals(model)) { return "Huawei Y520-U03"; }
        else if ("HUAWEI NXT-AL10".equals(model)) { return "Huawei Mate 8-AL10"; }
        else if ("HUAWEI C199".equals(model)) { return "HUAWEI C199"; }
        else if ("HUAWEI G700-U10".equals(model)) { return "Huawei G700-U10"; }
        else if ("HUAWEI Y600-U351".equals(model)) { return "Huawei Y600-U351"; }
        else if ("HUAWEI RIO-L01".equals(model)) { return "HUAWEI GX8"; }
        else if ("HUAWEI RIO-L02".equals(model)) { return "HUAWEI G8"; }
        else if ("HUAWEI RIO-L03".equals(model)) { return "HUAWEI G8"; }
        else if ("HUAWEI ATH-UL06".equals(model)) { return "HUAWEI ShotX"; }
        else if ("HM NOTE 1S".equals(model)) { return "Xiaomi HM NOTE 1S CT"; }
        else if ("HM NOTE 1W".equals(model)) { return "Xiaomi HM NOTE 1W"; }
        else if ("HUAWEI G7-TL00".equals(model)) { return "Huawei G7-TL00"; }
        else if ("HUAWEI Y541-U02".equals(model)) { return "Huawei Y541-U02"; }
        else if ("HUAWEI M2-801L".equals(model)) { return "Huawei M2"; }
        else if ("HUAWEI G750-T00".equals(model)) { return "Huawei G750-T00"; }
        else if ("HUAWEI G750-T01".equals(model)) { return "Huawei G750-T01"; }
        else if ("HUAWEI G610-U15".equals(model)) { return "Huawei G610-U15"; }
        else if ("HUAWEI M2-801W".equals(model)) { return "Huawei M2"; }
        else if ("HUAWEI GRA-TL00".equals(model)) { return "Huawei GRA-TL00"; }
        else if ("HTC Desire 816".equals(model)) { return "HTC Desire 816"; }
        else if ("HP Slate 8 Plus".equals(model)) { return "HP Slate 8 Plus"; }
        else if ("HTC_A9u".equals(model)) { return "HTC One A9"; }
        else if ("HS-EG916".equals(model)) { return "HIsense HS-EG916"; }
        else if ("HUAWEI Y625-U13".equals(model)) { return "Huawei Y625-U13"; }
        else if ("HUAWEI Y536A1".equals(model)) { return "HUAWEI Y536-A1"; }
        else if ("HTC_M9px".equals(model)) { return "HTC_M9px"; }
        else if ("HTC D820t".equals(model)) { return "HTC D820t"; }
        else if ("HTC D820u".equals(model)) { return "HTC D820u"; }
        else if ("HUAWEI G750-T01M".equals(model)) { return "Huawei G750-T01M"; }
        else if ("HUAWEI Y520-U22".equals(model)) { return "Huawei Y520-U22"; }
        else if ("HTC One E9 dual sim".equals(model)) { return "HTC One E9 dual sim"; }
        else if ("HUAWEI C8816D".equals(model)) { return "Huawei C8816D"; }
        else if ("HUAWEI Y511-U251".equals(model)) { return "Huawei Y511-U251"; }
        else if ("HTC 802t 16GB".equals(model)) { return "HTC One"; }
        else if ("HUAWEI Y330-U21".equals(model)) { return "Huawei Y330"; }
        else if ("HP 7 G2".equals(model)) { return "HP 7 G2"; }
        else if ("Harrier Tab from EE".equals(model)) { return "BenQ Harrier_Tab"; }
        else if ("HP Slate7 Extreme".equals(model)) { return "HP Slate 7 Extreme"; }
        else if ("HUAWEI G630-T00".equals(model)) { return "HUAWEI G630"; }
        else if ("HTC Rhyme S510b".equals(model)) { return "HTC Rhyme S510b"; }
        else if ("HTCD200LVW".equals(model)) { return "HTC Desire 626"; }
        else if ("H30-C00".equals(model)) { return "Huawei H30-C00"; }
        else if ("HUAWEI G535-L11".equals(model)) { return "Huawei G535-L11"; }
        else if ("hudl ht7s3".equals(model)) { return "Tesco Hudl HT7S3"; }
        else if ("HM 2A".equals(model)) { return "Xiaomi HM 2A"; }
        else if ("HUAWEI G610-U30".equals(model)) { return "Huawei G610"; }
        else if ("HUAWEI G750-T20".equals(model)) { return "Huawei G750-T20"; }
        else if ("HTC_Desire_610".equals(model)) { return "HTC Desire 610"; }
        else if ("HTC 0PLA1".equals(model)) { return "HTC One ME dual sim"; }
        else if ("HUAWEI TIT-CL10".equals(model)) { return "HUAWEI Y6 Pro"; }
        else if ("HTC_0P4E2".equals(model)) { return "HTC_0P4E2"; }
        else if ("HTC_0PKX2".equals(model)) { return "HTC Desire 626"; }
        else if ("HW-H60-J1".equals(model)) { return "Huawei H60-J1"; }
        else if ("Hisense C20".equals(model)) { return "Hisense c20"; }
        else if ("HTC 0PF120".equals(model)) { return "HTC Desire 320"; }
        else if ("HONOR H30-L02".equals(model)) { return "Huawei H30-L02"; }
        else if ("HONOR H30-L01".equals(model)) { return "Huawei H30-L01"; }
        else if ("HUAWEI Y360-U31".equals(model)) { return "Huawei Y360-U31"; }
        else if ("HY1-5085".equals(model)) { return "Hyundai HY1-5085"; }
        else if ("HTC_D310n".equals(model)) { return "HTC Desire 310"; }
        else if ("HTC Desire HD A9191".equals(model)) { return "HTC Desire HD"; }
        else if ("HUAWEI TIT-AL00".equals(model)) { return "HUAWEI Y6 Pro"; }
        else if ("HTC_One_mini_2".equals(model)) { return "HTC One mini 2"; }
        else if ("HTC Flyer P511e".equals(model)) { return "HTC Flyer"; }
        else if ("HS-7DTB40-8GB".equals(model)) { return "Hipstreet HS-7DTB40-8GB"; }
        else if ("HTC V2".equals(model)) { return "HTC Desire 516"; }
        else if ("HUAWEI G510-0010".equals(model)) { return "Huawei G510"; }
        else if ("HTC D826d".equals(model)) { return "HTC Desire D826"; }
        else if ("HTC POO_U".equals(model)) { return "HTC Desire X"; }
        else if ("HTC D826w".equals(model)) { return "HTC Desire 826"; }
        else if ("HTC D820ts".equals(model)) { return "HTC Desire 820s"; }
        else if ("HTC Desire 626G dual sim".equals(model)) { return "HTC Desire 626G+ dual sim"; }
        else if ("HTC 0P9O30".equals(model)) { return "HTC Desire 612"; }
        else if ("HUAWEI Y330-U08".equals(model)) { return "Huawei Y330-U08"; }
        else if ("HUAWEI Y330-U05".equals(model)) { return "Huawei Y330"; }
        else if ("HUAWEI Y330-U07".equals(model)) { return "Huawei Y330-U07"; }
        else if ("HUAWEI Y330-U01".equals(model)) { return "Huawei Y330-U01"; }
        else if ("Hydro".equals(model)) { return "Kyocera Hydro PLUS"; }
        else if ("HS-7DTB25".equals(model)) { return "Haier HS-7DTB25"; }
        else if ("HS-7DTB27".equals(model)) { return "Hipstreet HS-7DTB27"; }
        else if ("HUAWEI Ascend P6".equals(model)) { return "HUAWEI P6"; }
        else if ("HP Slate 10 HD".equals(model)) { return "HP Slate 7 HD"; }
        else if ("HERO200".equals(model)) { return "HTC Hero"; }
        else if ("HUAWEI M868".equals(model)) { return "Huawei M868"; }
        else if ("HUAWEI G730-U251".equals(model)) { return "Huawei G730-U251"; }
        else if ("HTC 2PQ83".equals(model)) { return "HTC Desire 728G dual sim"; }
        else if ("HTC 0PCV20".equals(model)) { return "HTC Desire 510"; }
        else if ("HUAWEI ALE-CL00".equals(model)) { return "Huawei ALE-CL00"; }
        else if ("HTC One dual sim".equals(model)) { return "HTC One Dual Sim"; }
        else if ("HUAWEI RIO-TL00".equals(model)) { return "HUAWEI G7 Plus"; }
        else if ("HTC 2PNT1".equals(model)) { return "HTC Desire 326G dual sim"; }
        else if ("HP 7 Plus G2".equals(model)) { return "HP 7 Plus G2"; }
        else if ("HUAWEI Y360-U42".equals(model)) { return "Huawei Y360-U42"; }
        else if ("HUAWEI SC-UL10".equals(model)) { return "Huawei SC-UL10"; }
        else if ("HTC Desire 626GPLUS dual sim".equals(model)) { return "HTC Desire 626G+ dual sim"; }
        else if ("HomeSurf742_AT7003".equals(model)) { return "Haier HomeSurf742_AT7003"; }
        else if ("HTL23".equals(model)) { return "HTC HTL23"; }
        else if ("HTL22".equals(model)) { return "HTC J One"; }
        else if ("HTL21".equals(model)) { return "HTC J Butterfly"; }
        else if ("HTC One X+".equals(model)) { return "HTC One X+"; }
        else if ("HTC Desire SV".equals(model)) { return "HTC Desire SV"; }
        else if ("HUAWEI P6-T00".equals(model)) { return "Huawei P6"; }
        else if ("HTC One XL".equals(model)) { return "HTC One XL"; }
        else if ("HTC_0PKV1".equals(model)) { return "HTC ONE M8s"; }
        else if ("HIGHWAY PURE".equals(model)) { return "Wiko HIGHWAY PURE"; }
        else if ("HS-T939".equals(model)) { return "Hisense HS-T939"; }
        else if ("HTC_Desire_S".equals(model)) { return "HTC Desire S"; }
        else if ("HyasongT1".equals(model)) { return "Haier Hyasong T1"; }
        else if ("HTC_Desire_C".equals(model)) { return "HTC Desire C"; }
        else if ("HM_NOTE_1LTE".equals(model)) { return "Xiaomi Redmi Note 4G"; }
        else if ("HTC_M8Sd".equals(model)) { return "HTC One E8 dual"; }
        else if ("HTC6435LVW".equals(model)) { return "HTC Droid DNA"; }
        else if ("HTC One max".equals(model)) { return "HTC One max"; }
        else if ("HUAWEI Y360-U12".equals(model)) { return "Huawei Y360-U12"; }
        else if ("HTC E9t".equals(model)) { return "HTC E9t"; }
        else if ("HTC_D626q".equals(model)) { return "HTC_D626q"; }
        else if ("HTC_D626x".equals(model)) { return "HTC Desire 626"; }
        else if ("HUAWEI Y535-C00".equals(model)) { return "Huawei Y535"; }
        else if ("HTC M9e".equals(model)) { return "HTC_M9e"; }
        else if ("HTC Explorer".equals(model)) { return "HTC Explorer A310e"; }
        else if ("HUAWEI G7-L01".equals(model)) { return "HUAWEI G7-L01"; }
        else if ("HUAWEI G7-L03".equals(model)) { return "Huawei G7-L03"; }
        else if ("HUAWEI G7-L02".equals(model)) { return "HUAWEI G7-L02"; }
        else if ("HTCEVOV4G".equals(model)) { return "HTC Evo V 4G"; }
        else if ("HS_7DTB35".equals(model)) { return "Hipstreet HS-7DTB35"; }
        else if ("HTC Raider X710e".equals(model)) { return "HTC Velocity 4G"; }
        else if ("HTC Sensation XE with Beats Audio".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HM 1SC".equals(model)) { return "Xiaomi HM 1SC"; }
        else if ("HUAWEI G521-L076".equals(model)) { return "Huawei G521-L076"; }
        else if ("HTC Desire 400 dual sim".equals(model)) { return "Htc desire 400 dual sim"; }
        else if ("HUAWEI_Y300-0100".equals(model)) { return "Huawei Ascend Y300"; }
        else if ("HTC 2PST1".equals(model)) { return "HTC Desrie D530"; }
        else if ("HTC Salsa C510e".equals(model)) { return "HTC Salsa C510e"; }
        else if ("HTC 2PST5".equals(model)) { return "HTC Desire 630 dual sim"; }
        else if ("HTC Salsa C510b".equals(model)) { return "HTC Salsa C510e"; }
        else if ("HTC Desire 820s dual sim".equals(model)) { return "HTC Desire 820s dual sim"; }
        else if ("HTC Desire 300".equals(model)) { return "HTC Desire 300"; }
        else if ("HTC Flyer".equals(model)) { return "HTC Flyer"; }
        else if ("HTC_B810x".equals(model)) { return "HTC Butterfly 2"; }
        else if ("Hisense I635T".equals(model)) { return "Hisense I635T"; }
        else if ("HS-E200T".equals(model)) { return "Hisense E200T"; }
        else if ("HTC 8160".equals(model)) { return "HTC 8160"; }
        else if ("HUAWEI CRR-CL00".equals(model)) { return "Huawei Mate S-CL00"; }
        else if ("HUAWEI GRA-UL10".equals(model)) { return "Huawei GRA-UL10"; }
        else if ("HTC One E9s dual sim".equals(model)) { return "HTC One E9s dual sim"; }
        else if ("HUAWEI P6-C00".equals(model)) { return "Huawei P6"; }
        else if ("HP Slate 6 Voice Tab II".equals(model)) { return "HP Slate 6 Voice Tab II"; }
        else if ("HTC Desire 620G dual sim".equals(model)) { return "HTC Desire 620G dual sim"; }
        else if ("Hudl HT7S3".equals(model)) { return "Tesco Hudl HT7S3"; }
        else if ("HTC PH39100".equals(model)) { return "HTC Velocity 4G"; }
        else if ("HTC_E9sx".equals(model)) { return "HTC One E9s dual sim"; }
        else if ("HTC One 801s".equals(model)) { return "HTC One 801e"; }
        else if ("HTC One 801e".equals(model)) { return "HTC One 801e"; }
        else if ("HUAWEI Y523-L176".equals(model)) { return "Huawei Y523-L176"; }
        else if ("HTC D626w".equals(model)) { return "HTC Desire D626w"; }
        else if ("HTC X920e".equals(model)) { return "HTC Butterfly"; }
        else if ("HTC Desire 526GPLUS dual sim".equals(model)) { return "HTC Desire 526G+ dual sim"; }
        else if ("HS_7DTB14".equals(model)) { return "Anydata HS_7DTB14"; }
        else if ("HTC Wildfire S".equals(model)) { return "HTC Wildfire S"; }
        else if ("HTC Desire 530".equals(model)) { return "HTC Desrie D530"; }
        else if ("HS-T959S".equals(model)) { return "Hisense HS-T959S"; }
        else if ("HIGHWAY".equals(model)) { return "WIKO HIGHWAY"; }
        else if ("HTC D816t".equals(model)) { return "HTC D816t"; }
        else if ("HTC D816w".equals(model)) { return "HTC D816w"; }
        else if ("HTC D816v".equals(model)) { return "HTC D816v"; }
        else if ("HTC D816e".equals(model)) { return "HTC D816e"; }
        else if ("HTC D816d".equals(model)) { return "HTC D816d"; }
        else if ("HTC D816h".equals(model)) { return "HTC Desire 816G dual sim"; }
        else if ("HTC Desire 600c dual sim".equals(model)) { return "HTC Desire 600c Dual SIM"; }
        else if ("HTC 0PF11".equals(model)) { return "HTC Desire 320"; }
        else if ("HP 7 VoiceTab".equals(model)) { return "HP 7 VoiceTab"; }
        else if ("HS-T970".equals(model)) { return "Hisense HS-T970"; }
        else if ("HTC Sensation 4G".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HTC_A510c".equals(model)) { return "HTC_A510c"; }
        else if ("Hisense E100T".equals(model)) { return "Hisense E100T"; }
        else if ("HTC6435LRA".equals(model)) { return "HTC DROID DNA"; }
        else if ("HTC Desire 320".equals(model)) { return "HTC Desire 320"; }
        else if ("Hisense M10-M".equals(model)) { return "Hisense M10-M"; }
        else if ("HTC Sensation XL with Beats Audio X315b".equals(model)) { return "HTC Sensation XL with Beats Audio X315e"; }
        else if ("HTC Sensation XL with Beats Audio X315e".equals(model)) { return "HTC Sensation XL with Beats Audio X315e"; }
        else if ("HUAWEI Ascend Y300".equals(model)) { return "Huawei Y300"; }
        else if ("HuaweiG510-0100".equals(model)) { return "Huawei G510"; }
        else if ("HM-N501-FL".equals(model)) { return "Haier HM-N501-FL"; }
        else if ("HUAWEI CRR-CL20".equals(model)) { return "Huawei Mate S-CL20"; }
        else if ("HUAWEI G510-0100".equals(model)) { return "Huawei G510"; }
        else if ("HUAWEI Y320-T00".equals(model)) { return "Huawei Y320-T00"; }
        else if ("Harrier Mini from EE".equals(model)) { return "BenQ Harrier Mini"; }
        else if ("HS-U966".equals(model)) { return "Hisense HS-U966"; }
        else if ("HS-U610".equals(model)) { return "Hisense U610"; }
        else if ("HS-U961".equals(model)) { return "Hisense HS-U961"; }
        else if ("HUAWEI G700-U20".equals(model)) { return "Huawei G700-U20"; }
        else if ("HTC_D530u".equals(model)) { return "HTC Desire 530"; }
        else if ("HTC Velocity 4G".equals(model)) { return "HTC Velocity 4G"; }
        else if ("HTC_One_S".equals(model)) { return "HTC One S"; }
        else if ("HTC_One_V".equals(model)) { return "HTC One V"; }
        else if ("HTC_One_X".equals(model)) { return "HTC One X"; }
        else if ("HTC 0P6B9".equals(model)) { return "HTC One (M8 Eye)"; }
        else if ("HTC 619d".equals(model)) { return "HTC 619d"; }
        else if ("HP Slate 8 Pro".equals(model)) { return "HP Slate8 Pro"; }
        else if ("HS-T959S1".equals(model)) { return "Hisense HS-T959S1"; }
        else if ("HUAWEI Y336-A1".equals(model)) { return "Huawei Y336-A1"; }
        else if ("HUAWEI TIT-CL00".equals(model)) { return "HUAWEI Y6 Pro"; }
        else if ("HTC Desire 526G dual sim".equals(model)) { return "HTC Desire 526G+ dual sim"; }
        else if ("HTC Desire 512".equals(model)) { return "HTC Desire 512"; }
        else if ("HTC Desire 510".equals(model)) { return "HTC Desire 510"; }
        else if ("HTC Glacier".equals(model)) { return "HTC myTouch 4G"; }
        else if ("HTC Hero".equals(model)) { return "HTC Hero"; }
        else if ("HUAWEI CRR-L09".equals(model)) { return "Huawei Mate S"; }
        else if ("HTC 9060".equals(model)) { return "HTC Butterfly s 9060"; }
        else if ("HTC V3".equals(model)) { return "HTC Desire 616 dual sim"; }
        else if ("HTC-P715a".equals(model)) { return "HTC Puccini"; }
        else if ("HTC_0PCV2".equals(model)) { return "HTC Desire 510"; }
        else if ("HS-T959".equals(model)) { return "Hisense HS-T959"; }
        else if ("HP Slate 6 VoiceTab Plus".equals(model)) { return "HP Slate 6 VoiceTab Plus"; }
        else if ("HTC One SC".equals(model)) { return "HTC One SC"; }
        else if ("Hudl 2".equals(model)) { return "Tesco hudl 2"; }
        else if ("HP Slate 7 VoiceTab Ultra".equals(model)) { return "HP Slate 7 VoiceTab Ultra"; }
        else if ("HTC EVO 3D X515a".equals(model)) { return "HTC EVO 3D X515m"; }
        else if ("HTC PG09410".equals(model)) { return "HTC Puccini"; }
        else if ("HTC_D620u".equals(model)) { return "HTC Desire 620 dual sim"; }
        else if ("HTC_D620h".equals(model)) { return "HTC Desire 620G dual sim"; }
        else if ("Hisense I631M".equals(model)) { return "Hisense I631M"; }
        else if ("HUAWEI G718".equals(model)) { return "Huawei G718"; }
        else if ("HTC_Desire".equals(model)) { return "HTC Desire"; }
        else if ("HTC Desire Eye".equals(model)) { return "HTC Desire EYE"; }
        else if ("HTC Magic".equals(model)) { return "HTC myTouch 3G"; }
        else if ("HUAWEI".equals(model)) { return "HUAWEI GX8"; }
        else if ("HUAWEI MT2-C00".equals(model)) { return "Huawei Mate2"; }
        else if ("HTC_V1".equals(model)) { return "HTC Desire 310"; }
        else if ("HUAWEI NXT-L29".equals(model)) { return "Huawei Mate 8-L29"; }
        else if ("HS-U800".equals(model)) { return "Hisense U800E-1"; }
        else if ("HUAWEI G700-U00".equals(model)) { return "Huawei G700"; }
        else if ("HUAWEI Y300-0100".equals(model)) { return "Huawei Y300"; }
        else if ("HTC_VLE_U".equals(model)) { return "HTC One S"; }
        else if ("HS-EG936D".equals(model)) { return "EG936D Hisense"; }
        else if ("HP 7.1".equals(model)) { return "HP 7.1"; }
        else if ("HTC One_M8 dual sim".equals(model)) { return "HTC One (M8)"; }
        else if ("HERO_X".equals(model)) { return "Mobicell HERO X"; }
        else if ("HUAWEI Y530-U00".equals(model)) { return "Huawei Y530"; }
        else if ("HTC 601e".equals(model)) { return "HTC 601e"; }
        else if ("HUAWEI D2-6070".equals(model)) { return "Huawei D2"; }
        else if ("HUAWEI Y221-U53".equals(model)) { return "Huawei Y221-U53"; }
        else if ("HTC Explorer A310b".equals(model)) { return "HTC Explorer A310e"; }
        else if ("HTC Explorer A310e".equals(model)) { return "HTC Explorer A310e"; }
        else if ("HTC_Butterfly_s_901s".equals(model)) { return "HTC Butterfly S"; }
        else if ("HTC_D526h".equals(model)) { return "HTC Desire 526G+ dual sim"; }
        else if ("HTC_One_M8".equals(model)) { return "HTC One M8"; }
        else if ("HTC_One_M9".equals(model)) { return "HTC One M9"; }
        else if ("HTC_D820ys".equals(model)) { return "HTC_D820ys"; }
        else if ("HTC Desire XC dual sim".equals(model)) { return "HTC Desire XC dual sim"; }
        else if ("HTC C2".equals(model)) { return "HTC Desire 516"; }
        else if ("HUAWEI G615-U10".equals(model)) { return "Huawei G615-U10"; }
        else if ("HUAWEI G6-U10".equals(model)) { return "Huawei G6-U10"; }
        else if ("Hisense F20T".equals(model)) { return "Hisense F20T"; }
        else if ("HTC 0PK72".equals(model)) { return "HTC 0PK72"; }
        else if ("HTC EVA_UTL".equals(model)) { return "HTC One XL"; }
        else if ("HTC6515LVW".equals(model)) { return "HTC One remix"; }
        else if ("HUAWEI Y600-U20".equals(model)) { return "Huawei Y600"; }
        else if ("HTC Aria A6380".equals(model)) { return "HTC Aria"; }
        else if ("HTC_D728x".equals(model)) { return "HTC_D728x"; }
        else if ("HTC-X315E".equals(model)) { return "HTC Sensation XL with Beats Audio X315e"; }
        else if ("Hisense H910".equals(model)) { return "Hisense H910-F01"; }
        else if ("HP Slate 10 Plus".equals(model)) { return "HP Slate 10 Plus"; }
        else if ("HS-U820".equals(model)) { return "Hisense HS-U820"; }
        else if ("Hisense E622M".equals(model)) { return "Hisense E622M"; }
        else if ("HS-U929".equals(model)) { return "Hisense HS-U929"; }
        else if ("HTC331ZLVWPP".equals(model)) { return "HTCDesire612VZW"; }
        else if ("HTC_One_mini_601e".equals(model)) { return "HTC One mini 601E"; }
        else if ("HTC D826sw".equals(model)) { return "HTC One E9s dual sim"; }
        else if ("Harrier from EE".equals(model)) { return "BenQ Harrier from EE"; }
        else if ("Hisense SoundTab MA-317".equals(model)) { return "Hisense SoundTab MA-317"; }
        else if ("HUAWEI P7-L12".equals(model)) { return "Huawei P7-L12"; }
        else if ("HUAWEI P7-L11".equals(model)) { return "HUAWEI P7-L11"; }
        else if ("HTC_0PFJ50".equals(model)) { return "HTC_0PFJ50"; }
        else if ("HUAWEI Y221-U33".equals(model)) { return "Huawei Y221-U33"; }
        else if ("HTC 8088".equals(model)) { return "HTC 8088"; }
        else if ("HTC_0PJA10".equals(model)) { return "HTC One M9"; }
        else if ("HUAWEI G6-U34".equals(model)) { return "Huawei G6-U34"; }
        else if ("HIGHWAY SIGNS".equals(model)) { return "Wiko HIGHWAY SIGNS"; }
        else if ("HTC Sensation Z710e".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HTC Sensation Z710a".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HTC One_M8 Eye".equals(model)) { return "HTC One (M8 Eye)"; }
        else if ("HUAWEI TAG-TL00".equals(model)) { return "HUAWEI TANGO"; }
        else if ("HTC_Sensation_4G".equals(model)) { return "HTC Sensation 4G"; }
        else if ("HTC Dream".equals(model)) { return "HTC G1"; }
        else if ("HTC Desire 620".equals(model)) { return "HTC Desire 620"; }
        else if ("HUAWEI Y600-U00".equals(model)) { return "Huawei Y600"; }
        else if ("HUAWEI Y221-U43".equals(model)) { return "Huawei Y221-U43"; }
        else if ("HS-U800E-1".equals(model)) { return "Hisense U800E-1"; }
        else if ("HP 8 G2".equals(model)) { return "HP 8 G2"; }
        else if ("HUAWEI G630-U00".equals(model)) { return "Huawei G630-U00"; }
        else if ("HTC Desire 816G".equals(model)) { return "HTC Desire815G"; }
        else if ("HUAWEI G521-L176".equals(model)) { return "Huawei G521-L176"; }
        else if ("Hisense E71-M".equals(model)) { return "Hisense E71-M"; }
        else if ("HTC_0P3P5".equals(model)) { return "HTC_0P3P5"; }
        else if ("HTC 10".equals(model)) { return "HTC 10"; }
        else if ("HTC_B830x".equals(model)) { return "HTC Butterfly 3"; }
        else if ("Hol-U19".equals(model)) { return "Huawei Hol-U19"; }
        else if ("Hol-U10".equals(model)) { return "Huawei Hol-U10"; }
        else if ("HTC Desire 825".equals(model)) { return "HTC Desire 825"; }
        else if ("HUAWEI Y221-U12".equals(model)) { return "Huawei Y221-U12"; }
        else if ("HTC One_E8".equals(model)) { return "HTC One_E8"; }
        else if ("HUAWEI Y360-U23".equals(model)) { return "Huawei Y360-U23"; }
        else if ("HUAWEI RIO-CL00".equals(model)) { return "HUAWEI RIO-CL00"; }
        else if ("HTC 8060".equals(model)) { return "HTC 8060"; }
        else if ("HUAWEI G610-T00".equals(model)) { return "Huawei G610"; }
        else if ("HTC-PG762".equals(model)) { return "HTC Wildfire S A515c"; }
        else if ("HTC6525LVW".equals(model)) { return "HTC One M8"; }
        else if ("HS-U970".equals(model)) { return "Hisense HS-U970"; }
        else if ("Hive V 3G".equals(model)) { return "Plaisio Hive V 3G"; }
        else if ("HUAWEI Y336-U12".equals(model)) { return "Huawei Y336-U12"; }
        else if ("HUAWEI NXT-L09".equals(model)) { return "Huawei Mate 8-L09"; }
        else if ("HTC Desire 626 dual sim".equals(model)) { return "HTC_D626q"; }
        else if ("HUAWEI H892L".equals(model)) { return "Huawei H892L"; }
        else if ("HTCONE".equals(model)) { return "HTC One"; }
        else if ("HUAWEI Y540-U01".equals(model)) { return "Huawei Y540-U01"; }
        else if ("HD PSEB v2".equals(model)) { return "Panasonic HDPSEB v2"; }
        else if ("Hisense E75T".equals(model)) { return "Hisense E75T"; }
        else if ("Hisense E20T".equals(model)) { return "Hisense E20T"; }
        else if ("Hisense E75M".equals(model)) { return "Hisense E75M"; }
        else if ("HTC0P3P7".equals(model)) { return "HTC One max"; }
        else if ("HTC M8Sd".equals(model)) { return "HTC One (E8)"; }
        else if ("HTC 709d".equals(model)) { return "HTC Desire 709d"; }
        else if ("HUAWEI P6-U06".equals(model)) { return "HUAWEI P6"; }
        else if ("HS-L691".equals(model)) { return "Hisense l691"; }
        else if ("HTC_Incredible_S".equals(model)) { return "HTC Incredible S"; }
        else if ("Huawei-U8687".equals(model)) { return "Huawei U8687"; }
        else if ("HTC ChaChaCha A810e".equals(model)) { return "HTC Chacha"; }
        else if ("HTC_D825u".equals(model)) { return "HTC Desire 825"; }
        else if ("HTC Ruby".equals(model)) { return "HTC_Amaze_4G"; }
        else if ("H7S".equals(model)) { return "Techno H7S"; }
        else if ("HS-I630M".equals(model)) { return "Hisense HS-I630M"; }
        else if ("HTC first".equals(model)) { return "HTC first"; }
        else if ("Hisense C1".equals(model)) { return "Hisense C1AE-1"; }
        else if ("HUAWEI Y550".equals(model)) { return "Huawei Y550-L03"; }
        else if ("HUAWEI MT7-L09".equals(model)) { return "HUAWEI MT7-L09"; }
        else if ("HP 10 Plus".equals(model)) { return "HP 10 Plus"; }
        else if ("HTC_0P6B".equals(model)) { return "HTC One M8"; }
        else if ("HUAWEI MT7-TL10".equals(model)) { return "Huawei MT7-TL10"; }
        else if ("Hisense I639T".equals(model)) { return "Hisense I639T"; }
        else if ("HUAWEI G7".equals(model)) { return "Huawei G7-L03"; }
        else if ("HS-T9".equals(model)) { return "Hisense HS-T9"; }
        else if ("Hisense I639M".equals(model)) { return "Hisense I639M"; }
        else if ("HTC Wildfire S A510e".equals(model)) { return "HTC Wildfire S"; }
        else if ("H-27".equals(model)) { return "Opticon H-27"; }
        else if ("Hisense E51-M".equals(model)) { return "Hisense E51-M"; }
        else if ("H30-U10".equals(model)) { return "Huawei Honor3"; }
        else if ("HUAWEI HN3-U00".equals(model)) { return "Huawei Honor3"; }
        else if ("HUAWEI HN3-U01".equals(model)) { return "Huawei Honor3"; }
        else if ("H30-L02".equals(model)) { return "Huawei H30-L02"; }
        else if ("HTC One M9s".equals(model)) { return "HTC_M9e"; }
        else if ("HTC 0PJA10".equals(model)) { return "HTC One M9"; }
        else if ("HTC Incredible S".equals(model)) { return "HTC Incredible S"; }
        else if ("HS_9DTB37".equals(model)) { return "Haier HS-9DTB37"; }
        else if ("HTCD200LVWPP".equals(model)) { return "HTC Desire 626"; }
        else if ("HTC 609d".equals(model)) { return "HTC Desire 609d"; }
        else if ("HUAWEI_P6-U06".equals(model)) { return "Huawei Ascend P6"; }
        else if ("HTC Gratia A6380".equals(model)) { return "HTC Aria"; }
        else if ("HTC Desire 200".equals(model)) { return "HTC Desire 200"; }
        else if ("HONOR H30-L01M".equals(model)) { return "Huawei H30-L01M"; }
        else if ("HUAWEI P6-U06-orange".equals(model)) { return "HUAWEI P6"; }
        else if ("HUAWEI RIO-UL00".equals(model)) { return "HUAWEI G7 Plus"; }
        else if ("HTC 802w".equals(model)) { return "HTC One"; }
        else if ("HTC 802t".equals(model)) { return "HTC One"; }
        else if ("HTC 802d".equals(model)) { return "HTC One"; }
        else if ("HUAWEI_G510-0251".equals(model)) { return "Huawei Ascend G510"; }
        else if ("HTC 0PFJ4".equals(model)) { return "HTC Desire 820"; }
        else if ("HUAWEI P7-L10".equals(model)) { return "Huawei P7-L10"; }
        else if ("HTC 0PL31".equals(model)) { return "HTC One E9 dual sim"; }
        else if ("HTC One M9".equals(model)) { return "HTC One M9"; }
        else if ("HUAWEI G616-L076".equals(model)) { return "Huawei G616-L076"; }
        else if ("HTC Butterfly".equals(model)) { return "HTC Butterfly"; }
        else if ("HTC_D820pi".equals(model)) { return "HTC Desire 820G PLUS dual sim"; }
        else if ("HTC Desire 612".equals(model)) { return "HTC Desire 612"; }
        else if ("HTC One".equals(model)) { return "HTC One Google Play edition"; }
        else if ("HP_10_Tablet".equals(model)) { return "HP Tablet 10"; }
        else if ("HTC_Desire_510".equals(model)) { return "HTC Desire 510"; }
        else if ("HS-X68T".equals(model)) { return "Hisense HS-X68T"; }
        else if ("HUAWEI MediaPad T1 8.0 4G".equals(model)) { return "Huawei t1_8p0lte"; }
        else if ("HTC_E9x".equals(model)) { return "HTC_E9x"; }
        else if ("HP SlateBook 14 PC".equals(model)) { return "HP SlateBook 14"; }
        else if ("HTC_M9u".equals(model)) { return "HTC One M9"; }
        else if ("HTC_One_X+".equals(model)) { return "HTC One X+"; }
        else if ("HTC X9u".equals(model)) { return "HTC One X9 dual sim"; }
        else if ("HTC_Desire_HD_A9191".equals(model)) { return "HTC Desire HD"; }
        else if ("HTC One S9".equals(model)) { return "HTC One S9"; }
        else if ("HS-10DTB41-8GB".equals(model)) { return "Hipstreet HS-10DTB41-8GB"; }
        else if ("HTC Desire 326G dual sim".equals(model)) { return "HTC Desire 326G dual sim"; }
        else if ("HP Slate7 Beats Special Edition".equals(model)) { return "HP Slate 7 Beats Special Edition"; }
        else if ("HTC 0PFH2".equals(model)) { return "HTC Desire EYE"; }
        else if ("HS-EG981".equals(model)) { return "Hisense EG981"; }
        else if ("HS-EG980".equals(model)) { return "Hisense HS-EG980"; }
        else if ("Hisense E50-T".equals(model)) { return "HIsense E50-T"; }
        else if ("HS-EG98C".equals(model)) { return "Hisense HS-EG98C"; }
        else if ("HUAWEI Y320-U01".equals(model)) { return "Huawei Y320-U01"; }
        else if ("HTC Desire 625".equals(model)) { return "HTC Desire 626s"; }
        else if ("HTC Desire 626".equals(model)) { return "HTC Desire626s"; }
        else if ("HTC Liberty".equals(model)) { return "HTC Aria"; }
        else if ("Hydro_PLUS".equals(model)) { return "Kyocera Hydro PLUS"; }
        else if ("HTC D820mt".equals(model)) { return "HTC D820 Mini"; }
        else if ("HTC D820mu".equals(model)) { return "HTC Desire D820mini"; }
        else if ("HTC Desire X".equals(model)) { return "Htc desire x"; }
        else if ("HTC Desire 826 dual sim".equals(model)) { return "HTC Desire 826 dual sim"; }
        else if ("HTC Desire S".equals(model)) { return "HTC Desire S"; }
        else if ("HTC Desire Q".equals(model)) { return "HTC Desire V"; }
        else if ("HTC Desire P".equals(model)) { return "HTC Desire P"; }
        else if ("HTC Desire V".equals(model)) { return "HTC Desire V"; }
        else if ("HTC Desire U".equals(model)) { return "HTC Desire V"; }
        else if ("HTC Desire C".equals(model)) { return "HTC Desire C"; }
        else if ("HTC E9w".equals(model)) { return "HTC E9w"; }
        else if ("HS-E600M".equals(model)) { return "Hisense HS-E600M"; }
        else if ("HTCEVODesign4G".equals(model)) { return "HTC Evo Design 4G"; }
        else if ("HTC_Desire_500".equals(model)) { return "HTC Desire 500"; }
        else if ("HUAWEI Y511-T00".equals(model)) { return "Huawei Y511-T00"; }
        else if ("HTC-A510a".equals(model)) { return "HTC Wildfire S"; }
        else if ("HUAWEI SCC-U21".equals(model)) { return "Huawei Y6"; }
        else if ("HTC DLXUB1".equals(model)) { return "HTC Butterfly"; }
        else if ("HTC_603h".equals(model)) { return "HTC Desire 501"; }
        else if ("HTC Acquire".equals(model)) { return "HTCEVODesign4G"; }
        else if ("HTC Flyer P512".equals(model)) { return "HTC Flyer"; }
        else if ("HTC0P4E1".equals(model)) { return "HTC Desire 601"; }
        else if ("HUAWEI LUA-U23".equals(model)) { return "HUAWEI ECO"; }
        else if ("HP 10".equals(model)) { return "HP 10"; }
        else if ("HS-U980".equals(model)) { return "Hisense HS-U980"; }
        else if ("HTC Desire 820q dual sim".equals(model)) { return "HTC Desire 820q dual sim"; }
        else if ("HTC ONE V".equals(model)) { return "HTC One V"; }
        else if ("HM NOTE 1LTE".equals(model)) { return "Xiaomi HM NOTE 1LTETD"; }
        else if ("HTX21".equals(model)) { return "HTC KDDI Infobar A02"; }
        else if ("HTC 0P9C8".equals(model)) { return "HTC 0P9C8"; }
        else if ("HTC One_M8".equals(model)) { return "HTC One (M8)"; }
        else if ("HUAWEI G730-U00".equals(model)) { return "Huawei G730"; }
        else if ("HS-X6T".equals(model)) { return "Hisense HS-X6T"; }
        else if ("HUAWEI G628-TL00".equals(model)) { return "Huawei G628-TL00"; }
        else if ("H7".equals(model)) { return "Hisense Vidaa"; }
        else if ("HUAWEI G630-U251".equals(model)) { return "Huawei G630-U251"; }
        else if ("HTC D728w".equals(model)) { return "HTC D728w"; }
        else if ("HTC_D816d".equals(model)) { return "HTC D816d"; }
        else if ("HS-EG966".equals(model)) { return "Hisense HS-EG966"; }
        else if ("Hashtag".equals(model)) { return "AG Mobile HASHTAG"; }
        else if ("HTC_D816x".equals(model)) { return "HTC Desire 816"; }
        else if ("HUAWEI Y560-U02".equals(model)) { return "Huawei Y560-U02"; }
        else if ("HUAWEI Y560-U03".equals(model)) { return "HUAWEI Y5"; }
        else if ("HTC Desire 601".equals(model)) { return "HTC Desire 601"; }
        else if ("HTC Desire 600".equals(model)) { return "HTC Desire 600"; }
        else if ("HUAWEI Y530".equals(model)) { return "Huawei Y530-U051"; }
        else if ("HUAWEI C8812".equals(model)) { return "Huawei C8812"; }
        else if ("HUAWEI C8816".equals(model)) { return "Huawei C8816"; }
        else if ("HUAWEI C8815".equals(model)) { return "Huawei C8815"; }
        else if ("HTC 9088".equals(model)) { return "HTC 9088"; }
        else if ("HUAWEI C8818".equals(model)) { return "Huawei C8818"; }
        else if ("Hisense L682".equals(model)) { return "Hisense L682"; }
        else if ("HTC M9w".equals(model)) { return "HTC M9w"; }
        else if ("HUAWEI G6-L22".equals(model)) { return "Huawei G6-L22"; }
        else if ("HUAWEI CRR-UL20".equals(model)) { return "Huawei Mate S-UL20"; }
        else if ("Hisense M20-T".equals(model)) { return "Hisense M20- T"; }
        else if ("HTC_S710E".equals(model)) { return "HTC Incredible S"; }
        else if ("HTC Desire X dual sim".equals(model)) { return "HTC Desire X dual sim"; }
        else if ("HTC A9w".equals(model)) { return "HTC One A9"; }
        else if ("HUAWEI G610-C00".equals(model)) { return "Huawei G610C"; }
        else if ("HUAWEI G620".equals(model)) { return "Huawei G620S-L03"; }
        else if ("HUAWEI Y560-L23".equals(model)) { return "HUAWEI Y5"; }
        else if ("HTC6535LVW".equals(model)) { return "HTC One M9"; }
        else if ("HTC_709d".equals(model)) { return "HTC Desire 700 dual sim"; }
        else if ("HTC EVO 3D X515m".equals(model)) { return "HTC EVO 3D X515m"; }
        else if ("HUAWEI G629-UL00".equals(model)) { return "Huawei G629-UL00"; }
        else if ("HTC T327w".equals(model)) { return "HTC Desire V"; }
        else if ("HS-E936".equals(model)) { return "Hisense HS-E936"; }
        else if ("HTC 301e".equals(model)) { return "HTC Desire 300"; }
        else if ("HTC Desire VC T328d".equals(model)) { return "HTC Desire VC"; }
        else if ("HTC M8si".equals(model)) { return "HTC M8si"; }
        else if ("HTC Desire 626s".equals(model)) { return "HTC Desire 626s"; }
        else if ("HTC Desire".equals(model)) { return "HTC Desire"; }
        else if ("HUAWEI G730-U27".equals(model)) { return "Huawei G730-U27"; }
        else if ("H60-L21".equals(model)) { return "Huawei H60-L21"; }
        else if ("HTC Desire U dual sim".equals(model)) { return "HTC Desire V"; }
        else if ("HUAWEI GRA-L09".equals(model)) { return "Huawei GRA-L09"; }
        else if ("HUAWEI P2-6070".equals(model)) { return "Huawei P2"; }
        else if ("HUAWEI Y560-U23".equals(model)) { return "Huawei Y560-U23"; }
        else if ("HUAWEI Y520-U12".equals(model)) { return "Huawei Y520-U12"; }
        else if ("HUAWEI Y320-C00".equals(model)) { return "Huawei Y320"; }
        else if ("HUAWEI CRR-UL00".equals(model)) { return "Huawei Mate S-UL00"; }
        else if ("HTC T329d".equals(model)) { return "HTC T329d"; }
        else if ("HTC M9pw".equals(model)) { return "HTC M9pw"; }
        else if ("HTC M9pt".equals(model)) { return "HTC One M9+"; }
        else if ("HUAWEI Y220-T10".equals(model)) { return "Huawei Y220-T10"; }
        else if ("HUAWEI G716-L070".equals(model)) { return "Huawei G716"; }
        else if ("HTC EVO Design C715e".equals(model)) { return "HTCEVODesign4G"; }
        else if ("HP Pro Slate 10 EE G1".equals(model)) { return "HP Pro Slate 10 EE G1"; }
        else if ("HTC_0P6B6".equals(model)) { return "HTC One (M8)"; }
        else if ("HUAWEI M2-802L".equals(model)) { return "Huawei M2"; }
        else if ("HUAWEI Y560-L01".equals(model)) { return "Huawei Y560-L01"; }
        else if ("HUAWEI MediaPad T1 10 4G".equals(model)) { return "Huawei T1 10"; }
        else if ("HUAWEI Y560-L03".equals(model)) { return "Huawei Y560-L03"; }
        else if ("HUAWEI Y560-L02".equals(model)) { return "HUAWEI Y5"; }
        else if ("HTC VLE_U".equals(model)) { return "HTC One S"; }
        else if ("HUAWEI Y300-0000".equals(model)) { return "Huawei Y300-0000"; }
        else if ("HS-L671".equals(model)) { return "Hisense L671W"; }
        else if ("HTC One M9PLUS_Prime Camera Edition".equals(model)) { return "HTC One M9+ (Prime Camera Edition)"; }
        else if ("HTC D516d".equals(model)) { return "HTC Desire 516"; }
        else if ("HTC D516w".equals(model)) { return "HTC Desire 516"; }
        else if ("HTC D516t".equals(model)) { return "HTC Desire 516"; }
        else if ("Hisense E71-T".equals(model)) { return "Hisense E71-T"; }
        else if ("HS-T980".equals(model)) { return "Hisense HS-T980"; }
        else if ("HS-E917".equals(model)) { return "Hisense HS-E917"; }
        else if ("Hisense I300T".equals(model)) { return "Hisense I300T"; }
        else if ("HP Pro Slate 12".equals(model)) { return "HP Pro Slate 12"; }
        else if ("HSG1341".equals(model)) { return "HannSpree HSG1341"; }
        else if ("HUAWEI Y360-U61".equals(model)) { return "Huawei Y360-U61"; }
        else if ("HTC Desire 526G".equals(model)) { return "HTC Desire 526GPLUS"; }
        else if ("HS-EG929".equals(model)) { return "Hisense HS-EG929"; }
        else if ("HUAWEI G610-T01".equals(model)) { return "Huawei G610-T01"; }
        else if ("HUAWEI Y635-CL00".equals(model)) { return "Huawei Y635-CL00"; }
        else if ("H60-L02".equals(model)) { return "Huawei H60-L02"; }
        else if ("H60-L03".equals(model)) { return "Huawei H60-L03"; }
        else if ("H60-L01".equals(model)) { return "Huawei H60-L01"; }
        else if ("H60-L04".equals(model)) { return "Huawei H60-L04"; }
        else if ("HUAWEI Y625-U21".equals(model)) { return "Huawei Y625-U21"; }
        else if ("H940".equals(model)) { return "Cherry Mobile One"; }
        else if ("HIGHWAY STAR".equals(model)) { return "Wiko HIGHWAY STAR"; }
        else if ("HUAWEI C8817E".equals(model)) { return "Huawei C8817E"; }
        else if ("HUAWEI C8817L".equals(model)) { return "Huawei C8817L"; }
        else if ("HS-X8U".equals(model)) { return "Hisense HS-X8U"; }
        else if ("HUAWEI Y520-U33".equals(model)) { return "Huawei Y520-U33"; }
        else if ("HTC Butterfly 2".equals(model)) { return "HTC Butterfly 2"; }
        else if ("HTC One ME dual sim".equals(model)) { return "HTC One ME dual sim"; }
        else if ("HUAWEI G520-5000".equals(model)) { return "Huawei G520"; }
        else if ("HTC Butterfly s".equals(model)) { return "HTC Butterfly S"; }
        else if ("H450R".equals(model)) { return "ANS Trailblazer"; }
        else if ("HUAWEI Y600D-C00".equals(model)) { return "Huawei Y600D-C00"; }
        else if ("HTC6500LVW".equals(model)) { return "HTC One"; }
        else if ("HP Slate 7 Voice Tab".equals(model)) { return "HP Voice Tab 7"; }
        else if ("HT-I860".equals(model)) { return "Haier HT-I860"; }
        else if ("HUAWEI Y330-C00".equals(model)) { return "Huawei Y330-C00"; }
        else if ("HTC M9ew".equals(model)) { return "HTC M9ew"; }
        else if ("HTC 0PGQ1".equals(model)) { return "HTC Desire 520"; }
        else if ("HTC_M8MINx".equals(model)) { return "HTC One mini 2"; }
        else if ("Hisense PX3000".equals(model)) { return "Hisense PX3000"; }
        else if ("HTC6535LRA".equals(model)) { return "HTC One M9"; }
        else if ("HUAWEI G610-U00".equals(model)) { return "Huawei G610"; }
        else if ("HTC_Amaze_4G".equals(model)) { return "HTC Amaze 4G"; }
        else if ("HTC Desire VC".equals(model)) { return "HTC Desire VC"; }
        else if ("Hisense M20-M".equals(model)) { return "Hisense M20-M"; }
        else if ("HTC_M8Sx".equals(model)) { return "HTC One (E8)"; }
        else if ("HTC_M8Sy".equals(model)) { return "HTC One (E8) dual sim"; }
        else if ("HMP8100_ATV_93".equals(model)) { return "Philips HMP8100/93"; }
        else if ("HTC D820us".equals(model)) { return "HTC Desire 820s"; }
        else if ("HUAWEI Y523-L076".equals(model)) { return "Huawei Y523-L076"; }
        else if ("HTC One mini".equals(model)) { return "HTC One mini"; }
        else if ("HTC_Flyer_P512_NA".equals(model)) { return "HTC Flyer"; }
        else if ("HS-7DTB39".equals(model)) { return "POLAROID A7_PTAB735"; }
        else if ("HS-7DTB35".equals(model)) { return "Hipstreet HS-7DTB35"; }
        else if ("HM 1SW".equals(model)) { return "Xiaomi HM 1SC"; }
        else if ("HS-U688".equals(model)) { return "U688 Hisense"; }
        else if ("HTC Desire 600 dual sim".equals(model)) { return "HTC Desire 600 Dual SIM"; }
        else if ("HS-X1".equals(model)) { return "Hisense X1E1"; }
        else if ("HTC_M9pw".equals(model)) { return "HTC One M9+"; }
        else if ("HW-W900".equals(model)) { return "Cellon HW-W900"; }
        else if ("HTC Mecha".equals(model)) { return "HTC Thunderbolt"; }
        else if ("HUAWEI Y511-U10".equals(model)) { return "Huawei Y511-U10"; }
        else if ("HTC 0PM92".equals(model)) { return "HTC Desire 626s"; }
        else if ("HTC 0PK71".equals(model)) { return "HTC One M9+ (Prime Camera Edition)"; }
        else if ("HTC_Sensation_Z710e".equals(model)) { return "HTC Sensation"; }
        else if ("HUAWEI G610-U20".equals(model)) { return "Huawei G610-U20"; }
        else if ("HS-L695".equals(model)) { return "Hisense L695W"; }
        else if ("Huawei 858".equals(model)) { return "Huawei V858"; }
        else if ("HTC Vision".equals(model)) { return "HTC G2"; }
        else if ("HP SlateBook 10 x2 PC".equals(model)) { return "HP SlateBook 10 x2 PC"; }
        else if ("Hol-T00".equals(model)) { return "Huawei Hol-T00"; }
        else if ("HTCD100LVW".equals(model)) { return "HTC Desire 526"; }
        else if ("HM NOTE 1LTETD".equals(model)) { return "Xiaomi HM NOTE 1LTETD"; }
        else if ("HTC Desire 820".equals(model)) { return "HTC Desire 820"; }
        else if ("HTC Desire 828".equals(model)) { return "HTC Desire 828"; }
        else if ("HM_NOTE_1W".equals(model)) { return "Xiaomi Redmi Note"; }
        else if ("HUAWEI Y535D-C00".equals(model)) { return "Huawei Y535D-C00"; }
        else if ("HTC Flyer P510e".equals(model)) { return "HTC Flyer"; }
        else if ("HTC_One_max".equals(model)) { return "HTC One max"; }
        else if ("HUAWEI Y320-U351".equals(model)) { return "Huawei Y320-U351"; }
        else if ("HP Slate 7 HD".equals(model)) { return "HP Slate 7 HD"; }
        else if ("HTC_E9pw".equals(model)) { return "HTC_E9pw"; }
        else if ("HTC D616w".equals(model)) { return "HTC Desire 616 dual sim"; }
        else if ("HUAWEI Y330-U11".equals(model)) { return "Huawei Y330-U11"; }
        else if ("HUAWEI Y330-U17".equals(model)) { return "Huawei Y330-U17"; }
        else if ("HUAWEI Y330-U15".equals(model)) { return "Huawei Y330-U15"; }
        else if ("HTC6545LVW".equals(model)) { return "HTC 10"; }
        else if ("HUAWEI G620-A2".equals(model)) { return "Huawei G620-A2"; }
        else if ("HS-E260T".equals(model)) { return "Hisense E260T"; }
        else if ("HUAWEI Y511-U30".equals(model)) { return "Huawei Y511-U30"; }
        else if ("HM_1SW".equals(model)) { return "Xiaomi Redmi"; }
        else if ("HUAWEI MT7-J1".equals(model)) { return "HUAWEI MT7-J1"; }
        else if ("HTC Panache".equals(model)) { return "HTC myTouch 4G"; }
        else if ("HS-T928".equals(model)) { return "Hisense HS-T928"; }
        else if ("HS-T926".equals(model)) { return "Hisense HS-T926"; }
        else if ("HTCD100LVWPP".equals(model)) { return "HTC Desire 526"; }
        else if ("HUAWEI Y360-U03".equals(model)) { return "Huawei Y360-U03"; }
        else if ("Hisense C1M".equals(model)) { return "Hisense C1M"; }
        else if ("Hisense C1T".equals(model)) { return "Hisense C1T"; }
        else if ("HS-X8C".equals(model)) { return "Hisense HS-X8C"; }
        else if ("HS-X8T".equals(model)) { return "Hisense HS-X8T"; }
        else if ("HTC Desire 601 dual sim".equals(model)) { return "HTC Desire 601 dual sim"; }
        else if ("HTC M9et".equals(model)) { return "HTC M9et"; }
        else if ("HUAWEI A199".equals(model)) { return "Huawei A199"; }
        else if ("HTC Desire 500 dual sim".equals(model)) { return "HTC Desire 500 dual sim"; }
        else if ("HTC Velocity 4G X710s".equals(model)) { return "HTC Velocity 4G"; }
        else if ("Houston".equals(model)) { return "Cellon Houston"; }
        else if ("HTC Desire 310 dual sim".equals(model)) { return "HTC Desire 310"; }
        else if ("HTC Desire 820G PLUS dual sim".equals(model)) { return "HTC Desire 820G PLUS dual sim"; }
        else if ("HUAWEI Y560-CL00".equals(model)) { return "Huawei Y560-CL00"; }
        else if ("HUAWEI C8813DQ".equals(model)) { return "Huawei C8813DQ"; }
        else if ("HUAWEI G7-L11".equals(model)) { return "HUAWEI G7-L11"; }
        else if ("HTC D610t".equals(model)) { return "HTC D610t"; }
        else if ("HTC Legend".equals(model)) { return "HTC Legend"; }
        else if ("HTC ChaCha A810e".equals(model)) { return "HTC Chacha"; }
        else if ("HUAWEI M2-A01L".equals(model)) { return "Huawei LISZT"; }
        else if ("HTC IncredibleS S710d".equals(model)) { return "HTC Incredible 2"; }
        else if ("HUAWEI NXT-CL00".equals(model)) { return "Huawei Mate 8-CL00"; }
        else if ("HTC S720e".equals(model)) { return "HTC S720e"; }
        else if ("HTC WF5w".equals(model)) { return "HTC WF5w"; }
        else if ("HTC PO091".equals(model)) { return "HTC PO091"; }
        else if ("HUAWEI C199s".equals(model)) { return "HUAWEI C199s"; }
        return "";

    }
    public static String kMethod (String model) {
        if ("KYOCERA-E6790".equals(model)) { return "Kyocera DuraForce XD"; }
        else if ("K-Touch L930i".equals(model)) { return "K-Touch L930i"; }
        else if ("KAZAM Trooper 650 4G".equals(model)) { return "KAZAM Trooper 650 4G"; }
        else if ("KAZAM Trooper 540".equals(model)) { return "KAZAM Trooper 540"; }
        else if ("KYY24".equals(model)) { return "Kyocera TORQUE G01"; }
        else if ("KYY22".equals(model)) { return "Kyocera URBANO L02"; }
        else if ("KYY23".equals(model)) { return "Kyocera URBANO L03"; }
        else if ("KYY21".equals(model)) { return "Kyocera URBANO L01"; }
        else if ("KurioPhone".equals(model)) { return "KD Interactive Kurio Phone"; }
        else if ("KLIPAD_SMART_D71".equals(model)) { return "KLIPAD_SMART_D71"; }
        else if ("Kestrel".equals(model)) { return "Huawei G535-L11"; }
        else if ("KAZAM Tornado 350".equals(model)) { return "KAZAM Tornado 350"; }
        else if ("KALOS".equals(model)) { return "Bungbungame KALOS"; }
        else if ("Kogan Agora 4G Lite".equals(model)) { return "BenQ Kogan Agora 4G Lite"; }
        else if ("K00L".equals(model)) { return "Asus MeMO Pad HD 8 (ME180A)"; }
        else if ("K012_2".equals(model)) { return "Asus MeMO Pad 7 (FE7010CG)"; }
        else if ("Kavak Y625-U03".equals(model)) { return "Huawei Y625-U03"; }
        else if ("K00X".equals(model)) { return "Asus MeMO Pad 7 LTE (ME7530CL)"; }
        else if ("K-Touch K3".equals(model)) { return "K-Touch K3"; }
        else if ("K013C".equals(model)) { return "Asus MeMO Pad 7"; }
        else if ("KAZAM Trooper 440L".equals(model)) { return "KAZAM Trooper 440L"; }
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
        else if ("K019".equals(model)) { return "Asus Fonepad 7(FE375CXG)"; }
        else if ("Kate".equals(model)) { return "Wenu Kate"; }
        else if ("KC-S701".equals(model)) { return "Kyocera TORQUE(KC-S701)"; }
        else if ("KIS".equals(model)) { return "ZTE KIS"; }
        else if ("KAZAM Trooper2 40".equals(model)) { return "KAZAM Trooper2 40"; }
        else if ("Kurio4S".equals(model)) { return "KD Interactive Kurio4S"; }
        else if ("K018".equals(model)) { return "Asus Transformer Pad (TF103CG)"; }
        else if ("KAZAM Trooper2 50".equals(model)) { return "KAZAM Trooper2 50"; }
        else if ("K-Touch 920".equals(model)) { return "K-Touch920"; }
        else if ("KTAB".equals(model)) { return "DEA Factory KTAB"; }
        else if ("KYOCERA-E6560".equals(model)) { return "Kyocera DuraForce"; }
        else if ("Konnect_350".equals(model)) { return "Haier Konnect_350"; }
        else if ("KAZAM Trooper 650".equals(model)) { return "KAZAM Trooper 650"; }
        else if ("KAZAM Thunder2 50".equals(model)) { return "KAZAM Thunder2 50"; }
        else if ("KPN Smart 300".equals(model)) { return "ZTE Grand X Pro"; }
        else if ("KAZAM Thunder 550L".equals(model)) { return "KAZAM Thunder 550L"; }
        else if ("K83".equals(model)) { return "ZTE K83"; }
        else if ("K85".equals(model)) { return "ZTE K85"; }
        else if ("K4-02 4G".equals(model)) { return "Kalley Klic"; }
        else if ("KAZAM Tornado2 50".equals(model)) { return "KAZAM Tornado2 50"; }
        else if ("KAZAM Tornado 455L".equals(model)) { return "KAZAM Tornado 455L"; }
        else if ("K00F".equals(model)) { return "Asus MeMO Pad 10 (ME102A)"; }
        else if ("KR076".equals(model)) { return "TCT (Alcatel) 8057"; }
        else if ("KFJWI".equals(model)) { return "Kindle Fire HD 8.9"; }
        else if ("KFJWA".equals(model)) { return "Kindle Fire HD 8.9"; }
        else if ("KITE".equals(model)) { return "Wiko KITE"; }
        else if ("KIW-TL00H".equals(model)) { return "Huawei Honor 5X"; }
        else if ("KIS PLUS".equals(model)) { return "ZTE KIS PLUS"; }
        else if ("KYV36".equals(model)) { return "Kyocera DIGNO rafre"; }
        else if ("KYV37".equals(model)) { return "Kyocera Qua phone (KYV37)"; }
        else if ("KYV34".equals(model)) { return "Kyocera URBANO V02"; }
        else if ("KYV35".equals(model)) { return "Kyocera TORQUE G02"; }
        else if ("KYV32".equals(model)) { return "Kyocera BASIO"; }
        else if ("KYV33".equals(model)) { return "Kyocera INFOBAR A03"; }
        else if ("KYV31".equals(model)) { return "Kyocera URBANO V01"; }
        else if ("Kindle_Fire".equals(model)) { return "Kindle Fire"; }
        else if ("Kyivstar Spark".equals(model)) { return "ZTE Blade"; }
        else if ("KAZAM Thunder 345L".equals(model)) { return "KAZAM Thunder 345L"; }
        else if ("KAZAM_Trooper_450L".equals(model)) { return "KAZAM Trooper 450L"; }
        else if ("KM-E100".equals(model)) { return "KT Tech TAKE SUIT"; }
        else if ("KYL23".equals(model)) { return "Kyocera miraie"; }
        else if ("KYL22".equals(model)) { return "Kyocera DIGNO"; }
        else if ("KYL21".equals(model)) { return "Kyocera DIGNO S"; }
        else if ("KAZAM Trooper 555".equals(model)) { return "KAZAM Trooper 555"; }
        else if ("KAZAM Trooper 551".equals(model)) { return "KAZAM Trooper 551"; }
        else if ("KAZAM Thunder 345 LTE".equals(model)) { return "KAZAM Thunder 345 LTE"; }
        else if ("KLIPAD_SMART_I745".equals(model)) { return "KLIPAD_SMART_I745"; }
        else if ("KAZAM Trooper 445L".equals(model)) { return "KAZAM Trooper 445L"; }
        else if ("Karbonn Titanium S5 Plus".equals(model)) { return "Coolpad Karbonn Titanium S5 Plus"; }
        else if ("KLIPAD_SMART_D791".equals(model)) { return "KLIPAD_SMART_D791"; }
        else if ("KPN Smart 400".equals(model)) { return "ZTE KPN Smart 400"; }
        else if ("K-Touch Tou ch 2c".equals(model)) { return "K-Touch Touch 2C"; }
        else if ("KIS C341".equals(model)) { return "ZTE T221"; }
        else if ("KC-S301AE".equals(model)) { return "Kyocera S301"; }
        else if ("KCP01K".equals(model)) { return "Kyocera LUCE"; }
        else if ("KC-01".equals(model)) { return "Kyocera KC-01"; }
        else if ("KYOCERA-C6745".equals(model)) { return "Kyocera Hydro AIR"; }
        else if ("Kali_8".equals(model)) { return "NJoy Kali 8"; }
        else if ("KUNO 4+".equals(model)) { return "Archos KUNO 4+"; }
        else if ("Karbonn_A1".equals(model)) { return "ZTE Karbonn_A1"; }
        else if ("KAZAM Thunder 350L".equals(model)) { return "KAZAM Thunder 350L"; }
        else if ("KUNO4".equals(model)) { return "Archos Kuno"; }
        else if ("Kurio7S".equals(model)) { return "KD Interactive Kurio7S"; }
        else if ("K007".equals(model)) { return "Asus MeMO Pad 7 (ME572C)"; }
        else if ("K00E".equals(model)) { return "Asus Fonepad 7 (ME372CG)"; }
        else if ("K00G".equals(model)) { return "Asus Fonepad Note 6 (ME560CG)"; }
        else if ("K00C".equals(model)) { return "Asus Transformer Pad Infinity (TF701T)"; }
        else if ("K00Y".equals(model)) { return "Asus Fonepad 7 LTE (ME372CL)"; }
        else if ("K00Z".equals(model)) { return "Asus Fonepad 7 (ME175CG)"; }
        else if ("K00U".equals(model)) { return "Asus MeMo Pad HD 7 (ME173XX)"; }
        else if ("K00R".equals(model)) { return "Asus MeMO Pad 7 LTE (ME572CL)"; }
        else if ("KIS II Max".equals(model)) { return "ZTE V815W"; }
        else if ("KAZAM Thunder 345".equals(model)) { return "KAZAM Thunder 345"; }
        else if ("KAZAM Trooper 451".equals(model)) { return "KAZAM Trooper 451"; }
        else if ("KAZAM Trooper 450".equals(model)) { return "KAZAM Trooper 450"; }
        else if ("KAZAM Trooper 455".equals(model)) { return "KAZAM Trooper 455"; }
        else if ("Kis T3".equals(model)) { return "ZTE Kis T3"; }
        else if ("K97".equals(model)) { return "ZTE K97"; }
        else if ("K-KOOL".equals(model)) { return "Wiko K-KOOL"; }
        else if ("KAZAM TV 45".equals(model)) { return "KAZAM TV 4.5"; }
        else if ("K-Touch M2s".equals(model)) { return "K-Touch M2s"; }
        else if ("KAZAM THUNDER2 45L".equals(model)) { return "KAZAM Thunder2 45L"; }
        else if ("KFOT".equals(model)) { return "Kindle Fire"; }
        else if ("KAZAM Trooper 550L".equals(model)) { return "KAZAM Trooper 550L"; }
        else if ("KAZAM Thunder 550".equals(model)) { return "KAZAM Thunder 550"; }
        else if ("KSP8000".equals(model)) { return "Kyocera Echo"; }
        else if ("Kurio10S".equals(model)) { return "KD Interactive Kurio10S"; }
        else if ("KFTT".equals(model)) { return "Kindle Fire HD 7"; }
        else if ("Kazam Trooper2 60".equals(model)) { return "KAZAM Trooper2 60"; }
        else if ("K1".equals(model)) { return "Lenovo K1"; }
        else if ("K5".equals(model)) { return "Kubo K5"; }
        else if ("KYOCERA-C6742".equals(model)) { return "Kyocera Hydro VIEW"; }
        else if ("K220_FHD".equals(model)) { return "Hisense K220_FHD"; }
        return "";

    }
    public static String jMethod (String model) {
        if ("JERRY".equals(model)) { return "Wiko JERRY"; }
        else if ("Joy_TV".equals(model)) { return "Explay Joy TV"; }
        else if ("JT-B1".equals(model)) { return "Panasonic JT-B1"; }
        else if ("JT1241".equals(model)) { return "Anydata Jiateng JT1241"; }
        else if ("J730U".equals(model)) { return "TCT (Alcatel) 730U"; }
        else if ("JIMMY".equals(model)) { return "Wiko JIMMY"; }
        else if ("Jax X".equals(model)) { return "Vonino Jax X"; }
        else if ("JM-250".equals(model)) { return "BenQ JM-250"; }
        else if ("JCI VA-10J".equals(model)) { return "VAIO VA-10J"; }
        else if ("JLab PRO-7".equals(model)) { return "JLab_PRO-7"; }
        else if ("J630".equals(model)) { return "TCT (Alcatel) TCL J630"; }
        else if ("JD-150".equals(model)) { return "BenQ JD-150"; }
        return "";

    }
    public static String mMethod (String model) {
        if ("MM-3201".equals(model)) { return "iRiver MM3202"; }
        else if ("MEDION E4002".equals(model)) { return "Lenovo E4002"; }
        else if ("MoovaShuffle".equals(model)) { return "Boost Moova Shuffle"; }
        else if ("Mini Mill v2".equals(model)) { return "JP Sacouto Mini Mill v2"; }
        else if ("M811".equals(model)) { return "CMCC M811"; }
        else if ("M812C".equals(model)) { return "TCT (Alcatel) M812C"; }
        else if ("MotoA953".equals(model)) { return "Motorola Milestone2"; }
        else if ("MD210".equals(model)) { return "Haier MD210"; }
        else if ("MTC Mini".equals(model)) { return "Huawei V858"; }
        else if ("Micromax Q412".equals(model)) { return "Micromax Canvas Play 4G"; }
        else if ("Micromax Q411".equals(model)) { return "Micromax Canvas FIRE4G"; }
        else if ("Micromax Q417".equals(model)) { return "Micromax Canvas Mega"; }
        else if ("Micromax Q416".equals(model)) { return "Micromax Canvas Pace 4G"; }
        else if ("Milestone XT720".equals(model)) { return "Motorola Motoroi"; }
        else if ("MediaPad 7 Classic".equals(model)) { return "Huawei Vogue7"; }
        else if ("MI MAX".equals(model)) { return "Xiaomi MI MAX"; }
        else if ("M370i".equals(model)) { return "InFocus M370i"; }
        else if ("MI 2".equals(model)) { return "Xiaomi MI 2"; }
        else if ("MI 3".equals(model)) { return "Xiaomi Mi 3"; }
        else if ("MI 5".equals(model)) { return "Xiaomi Mi 5"; }
        else if ("Micromax A118R".equals(model)) { return "Micromax CANVAS TUBE"; }
        else if ("Milestone X".equals(model)) { return "Motorola Droid X"; }
        else if ("Micromax E313".equals(model)) { return "Micromax Xpress 2"; }
        else if ("Micromax A34".equals(model)) { return "Micromax BOLT"; }
        else if ("MI 4S".equals(model)) { return "Xiaomi MI 4s"; }
        else if ("MI 4W".equals(model)) { return "Xiaomi MI 4LTE"; }
        else if ("MI 4C".equals(model)) { return "Xiaomi MI 4LTE"; }
        else if ("M220".equals(model)) { return "Huawei M220"; }
        else if ("MTC 960".equals(model)) { return "TCT (Alcatel) MTC 960"; }
        else if ("Micromax A72".equals(model)) { return "Micromax A72"; }
        else if ("M5".equals(model)) { return "Mint M5"; }
        else if ("M4".equals(model)) { return "Mint M4"; }
        else if ("M7".equals(model)) { return "CZ Electronics M7 Sapphire"; }
        else if ("M3".equals(model)) { return "Gionee M3"; }
        else if ("M2".equals(model)) { return "Gionee M2"; }
        else if ("MTC SMART Run".equals(model)) { return "Cellon MTC SMART Run"; }
        else if ("MS4A".equals(model)) { return "ZTE MS4A"; }
        else if ("MS4C".equals(model)) { return "Huawei MS4C"; }
        else if ("Micromax A096".equals(model)) { return "Micromax Canvas Fire3"; }
        else if ("Micromax A093".equals(model)) { return "Micromax Canvas Fire"; }
        else if ("Micromax A092".equals(model)) { return "MICROMAX UNITE"; }
        else if ("Micromax A091".equals(model)) { return "Micromax CANVAS ENGAGE"; }
        else if ("MTN-E70".equals(model)) { return "MTN-E70"; }
        else if ("MST711".equals(model)) { return "Trio MST711"; }
        else if ("MTC_982O".equals(model)) { return "TPS MTC 982o"; }
        else if ("Mozart".equals(model)) { return "Toshiba tt300/tt301/tt302"; }
        else if ("MID4X07".equals(model)) { return "Polaroid MID4X07"; }
        else if ("my Pad P3".equals(model)) { return "ZTE V9A"; }
        else if ("ME302KL".equals(model)) { return "Asus MeMO Pad FHD 10 (ME302KL)"; }
        else if ("MI 2A".equals(model)) { return "Xiaomi MI 2A"; }
        else if ("MI 2S".equals(model)) { return "Xiaomi MI 2"; }
        else if ("Micromax Q324".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax Q327".equals(model)) { return "Micromax Q327"; }
        else if ("Micromax Q450".equals(model)) { return "Micromax Sliver 5"; }
        else if ("MTN-S730".equals(model)) { return "MTN Group MTN Smart S730"; }
        else if ("MiTV2".equals(model)) { return "Xiaomi MiTV2"; }
        else if ("MS60".equals(model)) { return "Multilaser MS60"; }
        else if ("MiBOX_PRO".equals(model)) { return "Xiaomi MIBOXPRO"; }
        else if ("Micromax A114R".equals(model)) { return "Micromax CANVAS BEAT"; }
        else if ("MediaPad 7 Lite II".equals(model)) { return "Huawei Vogue7"; }
        else if ("myPadP4".equals(model)) { return "ZTE V9S"; }
        else if ("Micromax Q372".equals(model)) { return "Micromax Unite3"; }
        else if ("MB502".equals(model)) { return "Motorola Charm"; }
        else if ("MB526".equals(model)) { return "Motorola Defy"; }
        else if ("MB886".equals(model)) { return "Motorola Atrix HD"; }
        else if ("MotoroiX".equals(model)) { return "Motorola Droid X"; }
        else if ("MEDION P5001".equals(model)) { return "Coolpad MEDION P5001"; }
        else if ("MEDION Smartphone LIFE E3501".equals(model)) { return "ZTE MEDION Smartphone LIFE E3501"; }
        else if ("M620".equals(model)) { return "Huawei M620"; }
        else if ("M821H".equals(model)) { return "Hisense M821H"; }
        else if ("MID1065".equals(model)) { return "Anydata Coby MID1065"; }
        else if ("ME302C".equals(model)) { return "Asus MeMo Pad 10 (ME302C)"; }
        else if ("Moto 360".equals(model)) { return "Motorola Moto 360 (2nd Gen)"; }
        else if ("MOBICEL METRO2".equals(model)) { return "Mobicell METRO2"; }
        else if ("ME501".equals(model)) { return "Motorola Cliq-XT"; }
        else if ("MID210".equals(model)) { return "Takara MID210"; }
        else if ("Mach".equals(model)) { return "Cellon Mach"; }
        else if ("M9300".equals(model)) { return "Kyocera Echo"; }
        else if ("M1092R".equals(model)) { return "Ditecma M1092R"; }
        else if ("MegaFon_SP-A10".equals(model)) { return "TCT (Alcatel) MegaFon_SP-A10"; }
        else if ("M601".equals(model)) { return "BYD M601"; }
        else if ("MI NOTE LTE".equals(model)) { return "Xiaomi MI NOTE LTE"; }
        else if ("Milestone PLUS".equals(model)) { return "Motorola Droid Pro"; }
        else if ("MAGPAD".equals(model)) { return "Gigabyte PROSCAN PLT1066 / MAG MAGPAD / TEAC TEACTAB / DOPO GS-1008"; }
        else if ("ME525".equals(model)) { return "Motorola Defy"; }
        else if ("MI-438".equals(model)) { return "Spice Stellar Mi-438"; }
        else if ("Micromax A110Q".equals(model)) { return "Micromax CANVAS 2 PLUS"; }
        else if ("Maxwell-10".equals(model)) { return "Gigaset Maxwell-10"; }
        else if ("MWND1".equals(model)) { return "Acer MWND1"; }
        else if ("MediaPad X1".equals(model)) { return "HUAWEI MediaPad X1 7.0"; }
        else if ("Micromax AD3520".equals(model)) { return "Micromax Bolt"; }
        else if ("MTC SMART Run 4G".equals(model)) { return "ZTE Q509T"; }
        else if ("M7808".equals(model)) { return "Haier M7808"; }
        else if ("Micromax A99".equals(model)) { return "Micromax Canvas Xpress"; }
        else if ("movo".equals(model)) { return "TCL LE50UHDE5692G"; }
        else if ("Micromax Q345".equals(model)) { return "Micromax Canvas Selfie Lens"; }
        else if ("Micromax Q340".equals(model)) { return "Micromax Selfie 2"; }
        else if ("Micromax Q348".equals(model)) { return "Micromax Selfie 3"; }
        else if ("Micromax A315".equals(model)) { return "Micromax Canvas 4+"; }
        else if ("Micromax A316".equals(model)) { return "Micromax Canvas Hue 2"; }
        else if ("Micromax A311".equals(model)) { return "Micromax Canvas Nitro"; }
        else if ("M7s Dual ML03".equals(model)) { return "Multilaser M7s Dual Core"; }
        else if ("MT-803G".equals(model)) { return "Huawei T802"; }
        else if ("MediaPad 10 FHD".equals(model)) { return "Huawei S10"; }
        else if ("Micromax E471".equals(model)) { return "Micromax Canvas Knight2"; }
        else if ("MT11a".equals(model)) { return "Sony Ericsson Xperia neo V"; }
        else if ("Micromax P666".equals(model)) { return "Micromax Canvas tab"; }
        else if ("Micromax A102".equals(model)) { return "Micromax CANVAS DOODLE 3"; }
        else if ("Micromax A105".equals(model)) { return "Micromax CANVAS ENTICE"; }
        else if ("Micromax A106".equals(model)) { return "Micromax Unite2"; }
        else if ("Micromax A109".equals(model)) { return "Micromax Canvas XL2"; }
        else if ("meo smart a12".equals(model)) { return "ZTE V809"; }
        else if ("movo_la".equals(model)) { return "TCL L55E6700UDS"; }
        else if ("MusicPAD".equals(model)) { return "Vonino MusicPAD"; }
        else if ("Micromax AQ5000".equals(model)) { return "Micromax Canvas Hue"; }
        else if ("MB511".equals(model)) { return "Motorola Flipout"; }
        else if ("Micromax A310".equals(model)) { return "Micromax Canvas Nitro"; }
        else if ("Mi 4i".equals(model)) { return "Xiaomi Mi 4i"; }
        else if ("MW6617".equals(model)) { return "Lazer MW6617"; }
        else if ("Micromax AD4500".equals(model)) { return "Micromax Bolt"; }
        else if ("Movistar Motion".equals(model)) { return "ZTE Movistar Motion"; }
        else if ("M8047IU".equals(model)) { return "Brightstar M8046IU"; }
        else if ("MT-700".equals(model)) { return "Haier MT-700"; }
        else if ("MediaPad 7 Vogue".equals(model)) { return "Huawei Vogue7"; }
        else if ("Micromax A290".equals(model)) { return "Micromax Canvas Knight Cameo"; }
        else if ("Micromax E455".equals(model)) { return "Micromax Nitro 4G"; }
        else if ("Micromax A121".equals(model)) { return "Micromax CANVAS ELANZA 2"; }
        else if ("Micromax A120".equals(model)) { return "Micromax CANVAS 2 COLOURS"; }
        else if ("MTC SMART Sprint 4G".equals(model)) { return "MobileTeleSystem SMART_Sprint_4G"; }
        else if ("MT11i".equals(model)) { return "Sony Ericsson Xperia neo V"; }
        else if ("Micromax A96".equals(model)) { return "Micromax CANVAS POWER"; }
        else if ("Micromax S302".equals(model)) { return "Micromax Bolt"; }
        else if ("MID7065".equals(model)) { return "Anydata Coby MID7065"; }
        else if ("Max3-65".equals(model)) { return "Letv Max3-65"; }
        else if ("MediaPad X1 7.0".equals(model)) { return "HUAWEI MediaPad X1 7.0"; }
        else if ("Micromax A350".equals(model)) { return "Micromax CANVAS KNIGHT"; }
        else if ("MicromaxP480".equals(model)) { return "Micromax Canvas Tab"; }
        else if ("MotoE2".equals(model)) { return "Motorola Moto E"; }
        else if ("MID704DC".equals(model)) { return "LUXYA MID704DC Tablet / Bitmore Tab770"; }
        else if ("Micromax A108".equals(model)) { return "Micromax Canvas L"; }
        else if ("MTC 978".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("Movistar Express".equals(model)) { return "ZTE Movistar Express"; }
        else if ("Micromax P290".equals(model)) { return "Micromax Canvas tab"; }
        else if ("MI NOTE Pro".equals(model)) { return "Xiaomi MI NOTE Pro"; }
        else if ("MEDION LIFE P4310".equals(model)) { return "ZTE MEDION LIFE P4310"; }
        else if ("MT-734G".equals(model)) { return "Apex MT-734G"; }
        else if ("MiBOX_mini".equals(model)) { return "Xiaomi MiBOX_mini"; }
        else if ("MPDC706".equals(model)) { return "MPman MPDC706"; }
        else if ("MT15a".equals(model)) { return "Sony Ericsson Xperia neo"; }
        else if ("moii E996+".equals(model)) { return "BYD Moii E996+"; }
        else if ("Motorola Titanium".equals(model)) { return "Motorola Opus One"; }
        else if ("M35t".equals(model)) { return "Sony Xperia SP"; }
        else if ("M35h".equals(model)) { return "Sony Xperia SP"; }
        else if ("MotoG3".equals(model)) { return "Motorola Moto G"; }
        else if ("M350".equals(model)) { return "Fujitsu STYLISTIC M350/CA2"; }
        else if ("Mad Catz M.O.J.O.".equals(model)) { return "Mad Catz M.O.J.O."; }
        else if ("M532".equals(model)) { return "Fujitsu STYLISTIC M532"; }
        else if ("MiTV".equals(model)) { return "Xiaomi China"; }
        else if ("M24IS820".equals(model)) { return "FBC M24IS820"; }
        else if ("MT500".equals(model)) { return "Micromax CANVAS BLAZE"; }
        else if ("MD7305".equals(model)) { return "Anydata Lazer MD7305 Tablet / AMTC"; }
        else if ("MEO Smart A16".equals(model)) { return "ZTE Kis 3"; }
        else if ("MFC2_Plus".equals(model)) { return "Clementoni My first Clempad 4.4 Plus"; }
        else if ("Micromax A255".equals(model)) { return "Micromax Canvas Selfie"; }
        else if ("Micromax A250".equals(model)) { return "Micromax Canvas Turbo"; }
        else if ("MotoMB511".equals(model)) { return "Motorola Flipout"; }
        else if ("ME811".equals(model)) { return "Motorola Droid X"; }
        else if ("MediaPad 7 Youth".equals(model)) { return "Huawei S7"; }
        else if ("MI PAD 2".equals(model)) { return "Xiaomi MIPAD2"; }
        else if ("MOCHE SMART A16".equals(model)) { return "ZTE Kis 3"; }
        else if ("M370".equals(model)) { return "InFocus M370"; }
        else if ("Motorola XT720".equals(model)) { return "Motorola Motoroi"; }
        else if ("Micromax A069".equals(model)) { return "Micromax BOLT"; }
        else if ("Micromax A066".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax A067".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax A064".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax A065".equals(model)) { return "Micromax Bolt"; }
        else if ("MD Smart".equals(model)) { return "ZTE-U V760"; }
        else if ("M02".equals(model)) { return "Fujitsu arrows M02"; }
        else if ("M01".equals(model)) { return "Fujitsu ARROWS M01"; }
        else if ("MFLogin3T".equals(model)) { return "MegaFon MFLogin3T"; }
        else if ("MTAB-07530A".equals(model)) { return "Memorex MTAB-07530A"; }
        else if ("Micromax A104".equals(model)) { return "Micromax Canvas Fire"; }
        else if ("Micromax A107".equals(model)) { return "Micromax Canvas Fire4"; }
        else if ("MTN-TBW5982C3".equals(model)) { return "MTN-5982C3"; }
        else if ("Micromax AQ5001".equals(model)) { return "Micromax Canvas Juice2"; }
        else if ("MFC145FR1".equals(model)) { return "Lexibook Fluo"; }
        else if ("Micromax D320".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax D321".equals(model)) { return "Micromax Bolt"; }
        else if ("M311".equals(model)) { return "Huawei Honor Box voice"; }
        else if ("M310".equals(model)) { return "Huawei M310"; }
        else if ("MTC975".equals(model)) { return "TCT (Alcatel) MTC975"; }
        else if ("Micromax A82".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax A87".equals(model)) { return "Micromax A87"; }
        else if ("M9000".equals(model)) { return "ZTE V793"; }
        else if ("mobifone M9001".equals(model)) { return "ZTE_LEO_Q1"; }
        else if ("M502".equals(model)) { return "NGM Italia SRL M502"; }
        else if ("MY9308P".equals(model)) { return "Gigabyte Hipstreet 9DTB7 / Lazer MY9308P"; }
        else if ("MB855".equals(model)) { return "Motorola Photon 4G"; }
        else if ("Micromax D303".equals(model)) { return "Micromax Bolt"; }
        else if ("Mi438S".equals(model)) { return "Nexian journey one"; }
        else if ("MTC_SMART_Surf_4G".equals(model)) { return "MobileTeleSystem MTC SMART Surf 4G"; }
        else if ("M330".equals(model)) { return "Huawei China"; }
        else if ("MACARON".equals(model)) { return "Wiko MACARON"; }
        else if ("Micromax AQ4502".equals(model)) { return "Micromax Canvas A1"; }
        else if ("Micromax AQ4501".equals(model)) { return "Micromax Canvas A1"; }
        else if ("M-MP7NB3G".equals(model)) { return "Nextbook M-MP7NB3G"; }
        else if ("MT3A".equals(model)) { return "MegaFon MT3A"; }
        else if ("Motorola MOT-XT681".equals(model)) { return "Motorola Motoluxe"; }
        else if ("MEO Smart A75".equals(model)) { return "ZTE Blade L2"; }
        else if ("MTC 916".equals(model)) { return "ZTE Racer"; }
        else if ("MC36".equals(model)) { return "Zebra MC36"; }
        else if ("MTC_968".equals(model)) { return "TCT (Alcatel) TCL A988"; }
        else if ("MTC 1065".equals(model)) { return "TCT (Alcatel) EVO7"; }
        else if ("MediaPad 7 Youth 2".equals(model)) { return "HUAWEI MediaPad 7 Youth2"; }
        else if ("MTN-8978P".equals(model)) { return "MTN-8978P"; }
        else if ("MICROSTAR_E10319".equals(model)) { return "Medion LIFETAB E10320"; }
        else if ("M8402".equals(model)) { return "ZTE M8402"; }
        else if ("MegaFon_SP-AI".equals(model)) { return "TCT (Alcatel) Megafon Login"; }
        else if ("ME600".equals(model)) { return "Motorola Backflip"; }
        else if ("MF97G".equals(model)) { return "ZTE MF97G"; }
        else if ("MF97E".equals(model)) { return "ZTE MF97E"; }
        else if ("MF97B".equals(model)) { return "ZTE Spro 2"; }
        else if ("MF97W".equals(model)) { return "ZTE MF97W"; }
        else if ("MS4B".equals(model)) { return "MegaFon MS4B"; }
        else if ("Micromax Q469".equals(model)) { return "Micromax Canvas Play4G"; }
        else if ("MB501".equals(model)) { return "Motorola Cliq-XT"; }
        else if ("MTN Steppa 2 LTE".equals(model)) { return "MTN Group MTN Steppa 2 LTE"; }
        else if ("MB810".equals(model)) { return "Motorola Droid X"; }
        else if ("MZ609".equals(model)) { return "Motorola XOOM 2"; }
        else if ("MZ604".equals(model)) { return "Motorola XOOM"; }
        else if ("MZ605".equals(model)) { return "Motorola XOOM"; }
        else if ("MZ606".equals(model)) { return "Motorola XOOM"; }
        else if ("MZ601".equals(model)) { return "Motorola XOOM"; }
        else if ("Micromax EG111".equals(model)) { return "Micromax CANVAS DUET 2"; }
        else if ("MotionE11".equals(model)) { return "Edcon Motion E1.1"; }
        else if ("MID 1324".equals(model)) { return "Polaroid Infinite"; }
        else if ("MT8000".equals(model)) { return "Anydata Eviant MT8000"; }
        else if ("MS6".equals(model)) { return "Multilaser Ms6"; }
        else if ("MS5".equals(model)) { return "Trimble Navigation PeopleNet ConnectedTablet"; }
        else if ("M865".equals(model)) { return "Huawei M865"; }
        else if ("M860".equals(model)) { return "Huawei M860"; }
        else if ("MD7081".equals(model)) { return "AMTC MD7081"; }
        else if ("Mobile Sosh".equals(model)) { return "TCT (Alcatel) ONE TOUCH 6012D"; }
        else if ("Micromax A69".equals(model)) { return "Micromax BOLT"; }
        else if ("Micromax A67".equals(model)) { return "Micromax BOLT"; }
        else if ("MFLoginPh".equals(model)) { return "MegaFon MFLoginPh"; }
        else if ("MT7A".equals(model)) { return "ZTE V72"; }
        else if ("Motorola_Electrify".equals(model)) { return "Motorola Electrify"; }
        else if ("Micromax Q394".equals(model)) { return "Micromax Canvas Juice 3+"; }
        else if ("Micromax Q395".equals(model)) { return "Micromax Canvas AMAZE"; }
        else if ("Micromax Q391".equals(model)) { return "Micromax Canvas Doodle4"; }
        else if ("Micromax Q392".equals(model)) { return "Micromax Canvas Juice3"; }
        else if ("MID8065".equals(model)) { return "Anydata Coby MID8065"; }
        else if ("MFC_HR_Plus".equals(model)) { return "Clementoni My First Clempad HR Plus"; }
        else if ("MTC 950".equals(model)) { return "Huawei V858"; }
        else if ("MediaPad 10 Link+".equals(model)) { return "HUAWEI MediaPad 10 Link+"; }
        else if ("Mi-4c".equals(model)) { return "Xiaomi Mi 4c"; }
        else if ("myPad P4 Lite".equals(model)) { return "ZTE V72"; }
        else if ("moche smart a8".equals(model)) { return "TCT (Alcatel) tmn smarta8"; }
        else if ("MTC 970H".equals(model)) { return "MTC Vodafone Smart mini"; }
        else if ("Micromax Q400".equals(model)) { return "Micromax Canvas Blaze"; }
        else if ("Motorola-XT502".equals(model)) { return "Motorola Quench XT3"; }
        else if ("MediaPad 10 LINK".equals(model)) { return "Huawei S10"; }
        else if ("MTC 970".equals(model)) { return "TCT (Alcatel) MTC 970"; }
        else if ("MTC 972".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("Moova-Soul".equals(model)) { return "Boost Moova Soul"; }
        else if ("MD7008".equals(model)) { return "AMTC MD7008"; }
        else if ("MITO_A10".equals(model)) { return "Mito A10"; }
        else if ("MEDION X4701".equals(model)) { return "Hisense MEDION X4701"; }
        else if ("MI 4LTE".equals(model)) { return "Xiaomi MI 4LTE-CT"; }
        else if ("M823".equals(model)) { return "TCT (Alcatel) n1 max"; }
        else if ("Matrix".equals(model)) { return "Mobicell Matrix"; }
        else if ("MediaPad T1 8.0 Pro".equals(model)) { return "Huawei t1_8p0lte"; }
        else if ("M5_lite".equals(model)) { return "Gionee M5 Lite"; }
        else if ("MY16ADA".equals(model)) { return "Honda Accord"; }
        else if ("Micromax A24".equals(model)) { return "Micromax BOLT"; }
        else if ("Micromax Q325".equals(model)) { return "Micromax Bolt"; }
        else if ("M210".equals(model)) { return "Infocus M210"; }
        else if ("M5 mini".equals(model)) { return "Gionee M5 mini"; }
        else if ("MD7053G".equals(model)) { return "Kennex MD7053G"; }
        else if ("ME301T".equals(model)) { return "ASUS MeMO Pad Smart 10"; }
        else if ("MB300".equals(model)) { return "Motorola Backflip"; }
        else if ("MH-CHANNELS".equals(model)) { return "Mohu MH-CHANNELS"; }
        else if ("MS50".equals(model)) { return "Multilaser MS50"; }
        else if ("M4 SS4455".equals(model)) { return "M4tel M4 SS4455"; }
        else if ("M4 SS4451".equals(model)) { return "M4tel M4 SS4451"; }
        else if ("MOTWX435KT".equals(model)) { return "Motorola Triumph"; }
        else if ("Micromax A082".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax E352".equals(model)) { return "Micromax Nitro 3"; }
        else if ("Micromax E353".equals(model)) { return "Micromax Canvas Mega"; }
        else if ("Movistar Link".equals(model)) { return "ZTE Racer"; }
        else if ("MI 3W".equals(model)) { return "Xiaomi MI 3W"; }
        else if ("MID4X10".equals(model)) { return "Polaroid MID4X10"; }
        else if ("Micromax Q336".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax Q335".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax Q332".equals(model)) { return "Micromax BOLT"; }
        else if ("Micromax Q333".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax Q331".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax Q338".equals(model)) { return "Micromax BOLT"; }
        else if ("M377".equals(model)) { return "InFocus M377"; }
        else if ("Micromax_D200".equals(model)) { return "Micromax Bolt"; }
        else if ("MID1028".equals(model)) { return "Polaroid MID1028"; }
        else if ("Marquis_MP977".equals(model)) { return "Anydata Marquis Tablet"; }
        else if ("M372".equals(model)) { return "InFocus M372"; }
        else if ("Mtag 353".equals(model)) { return "Coolpad Mtag 353"; }
        else if ("Movitel M8410".equals(model)) { return "ZTE C310"; }
        else if ("myTouch_4G_Slide".equals(model)) { return "HTC myTouch 4G Slide"; }
        else if ("ME511".equals(model)) { return "Motorola Flipout"; }
        else if ("MediaPad 7 Lite+".equals(model)) { return "Huawei S7"; }
        else if ("MT25i".equals(model)) { return "Sony Ericsson Xperia neo L"; }
        else if ("MW-7615P".equals(model)) { return "Lazer MW-7615P"; }
        else if ("M821".equals(model)) { return "Hisense M821"; }
        else if ("MB525".equals(model)) { return "Motorola Defy"; }
        else if ("MI PAD".equals(model)) { return "Xiaomi MI PAD"; }
        else if ("MTAB-09541AB".equals(model)) { return "Memorex MTAB-09541AB"; }
        else if ("ME722".equals(model)) { return "Motorola Milestone2"; }
        else if ("Micromax Q334".equals(model)) { return "Micromax Canvas SPARK2"; }
        else if ("MM-3202".equals(model)) { return "iRiver MM3202"; }
        else if ("MiBOX1S".equals(model)) { return "Xiaomi China"; }
        else if ("Micromax E311".equals(model)) { return "Micromax Canvas Nitro2"; }
        else if ("moii E598".equals(model)) { return "ZTE-U V760"; }
        else if ("MTAB-08530A".equals(model)) { return "Memorex MTAB-08530A"; }
        else if ("MFC510FR1".equals(model)) { return "Lexibook Fluo XL Premium Edition"; }
        else if ("MT27i".equals(model)) { return "Sony Ericsson Xperia sola"; }
        else if ("MDB342X".equals(model)) { return "Mobily MDB342X"; }
        else if ("Micromax A57".equals(model)) { return "Micromax A57"; }
        else if ("Micromax Q379".equals(model)) { return "Micromax Unite 3"; }
        else if ("Micromax Q370".equals(model)) { return "Micromax Canvas Pep"; }
        else if ("Micromax Q371".equals(model)) { return "Micromax Canvas Pep"; }
        else if ("Micromax Q375".equals(model)) { return "Micromax Canvas Pep"; }
        else if ("Micromax A300".equals(model)) { return "Micromax CANVAS GOLD"; }
        else if ("mx50".equals(model)) { return "Getac MX50"; }
        else if ("M.T.T. Smart Fun".equals(model)) { return "MTT Smart Fun"; }
        else if ("MS3A".equals(model)) { return "Haier MEGAFON MS3A"; }
        else if ("MS3B".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("MotoG3-TE".equals(model)) { return "Motorola Moto G Turbo Edition"; }
        else if ("MEO Smart A80".equals(model)) { return "ZTE Blade L3"; }
        else if ("Micromax E481".equals(model)) { return "Micromax Canvas 5"; }
        else if ("Metal_Tablet_10".equals(model)) { return "TJC Metal Tablet"; }
        else if ("MyPhone UNO".equals(model)) { return "Myphone UNO"; }
        else if ("MTC_SMART_Start_2".equals(model)) { return "MobileTeleSystem SMART Start 2"; }
        else if ("Micromax Q355".equals(model)) { return "Micromax Canvas Play"; }
        else if ("move 2".equals(model)) { return "TCT (Alcatel) Moov2"; }
        else if ("M470BSS".equals(model)) { return "Hisense M470BSS"; }
        else if ("MiSS".equals(model)) { return "Bunbungame MiSS"; }
        else if ("M01T".equals(model)) { return "Fujitsu arrows Tab M01T"; }
        else if ("MH350".equals(model)) { return "Fujitsu STYLISTIC MH350"; }
        else if ("MTN-S720i".equals(model)) { return "MTN-S720i"; }
        else if ("Micromax A110".equals(model)) { return "Micromax A110"; }
        else if ("Micromax A117".equals(model)) { return "Micromax Canvas Magnus"; }
        else if ("ME172V".equals(model)) { return "Asus MeMO PAD"; }
        else if ("MTC 1055".equals(model)) { return "ZTE V9"; }
        else if ("MI_3W".equals(model)) { return "Xiaomi Mi 3"; }
        else if ("Micromax AE90".equals(model)) { return "Micromax CANVAS DUET"; }
        else if ("MT2L03".equals(model)) { return "Huawei MT2L03LITE"; }
        else if ("M5L".equals(model)) { return "Gionee M5L"; }
        else if ("MPDC1006".equals(model)) { return "MPman MPDC1006"; }
        else if ("MT15i".equals(model)) { return "Sony Ericsson Xperia neo"; }
        else if ("MID107".equals(model)) { return "Takara MID 107"; }
        else if ("MegaFon Login 3".equals(model)) { return "MegaFon Login 3"; }
        else if ("Meitu M4".equals(model)) { return "Meitu M4"; }
        else if ("MediaPad M1 8.0".equals(model)) { return "HUAWEI MediaPad M1 8.0"; }
        else if ("M.T.T. Master".equals(model)) { return "MTT Master"; }
        else if ("MTS-SP100".equals(model)) { return "ZTE Racer"; }
        else if ("Monterra".equals(model)) { return "Garmin Monterra"; }
        else if ("myPad P3".equals(model)) { return "ZTE V9A"; }
        else if ("myPad P2".equals(model)) { return "ZTE V9"; }
        else if ("myPad P5".equals(model)) { return "ZTE myPad P5"; }
        else if ("MG080D1T".equals(model)) { return "TSUNAMi Tablet Tsunami TSTA080D1"; }
        else if ("MEDION E4001".equals(model)) { return "Hisense MEDION E4001"; }
        else if ("MIT700".equals(model)) { return "iRiver DMT580D"; }
        else if ("Milestone X2".equals(model)) { return "Motorola Droid X2"; }
        else if ("MediaPad T1 8.0".equals(model)) { return "Huawei t1_8p0"; }
        else if ("MEO SMART A16".equals(model)) { return "ZTE Kis 3"; }
        else if ("MF97A".equals(model)) { return "ZTE MF97A"; }
        else if ("MF97V".equals(model)) { return "ZTE Spro 2"; }
        else if ("M3s".equals(model)) { return "CZ Electronics M3s"; }
        else if ("M3-2200".equals(model)) { return "Acer M3-2200"; }
        else if ("M3S".equals(model)) { return "Gionee M3S"; }
        else if ("Milestone".equals(model)) { return "Motorola Droid"; }
        else if ("MB200".equals(model)) { return "Motorola CLIQ"; }
        else if ("MiBOX2".equals(model)) { return "Xiaomi MiBOX2"; }
        else if ("MTC 982".equals(model)) { return "TCT (Alcatel) Vodafone 785"; }
        else if ("MicromaxP680".equals(model)) { return "Micromax Canvas tab"; }
        else if ("MID7055".equals(model)) { return "Anydata COBY MID7055"; }
        else if ("M2mini".equals(model)) { return "Gionee M2mini"; }
        else if ("myPhone Cube".equals(model)) { return "myPhone CUBE"; }
        else if ("Momodesign MD Droid".equals(model)) { return "ZTE Momodesign MD Droid"; }
        else if ("M220c".equals(model)) { return "Huawei M220"; }
        else if ("M10".equals(model)) { return "Monster M10"; }
        else if ("MT-733G".equals(model)) { return "MiiA MT-733G"; }
        else if ("M555".equals(model)) { return "Fujitsu ARROWS M555"; }
        else if ("ME860".equals(model)) { return "Motorola Atrix"; }
        else if ("M35c".equals(model)) { return "Sony Ericsson Xperia SP"; }
        else if ("M305".equals(model)) { return "Fujitsu M305"; }
        else if ("M721".equals(model)) { return "Allfine M721"; }
        else if ("morrison".equals(model)) { return "Motorola CLIQ"; }
        else if ("ME173X".equals(model)) { return "Asus MeMO Pad HD 7"; }
        else if ("MK16i".equals(model)) { return "Sony Ericsson Xperia pro"; }
        else if ("MK16a".equals(model)) { return "Sony Ericsson Xperia pro"; }
        else if ("Micromax A91".equals(model)) { return "Micromax A91"; }
        else if ("Micromax A94".equals(model)) { return "MICROMAX MAD"; }
        else if ("Micromax S301".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax S300".equals(model)) { return "Micromax Bolt"; }
        else if ("ML01-M7S-Quad-Core".equals(model)) { return "Multilaser M7s Quad Core"; }
        else if ("MTN-S620".equals(model)) { return "MTN-S620"; }
        else if ("Micromax A190".equals(model)) { return "Micromax Canvas HD Plus"; }
        else if ("Micromax Q491".equals(model)) { return "Micromax Doodle 4"; }
        else if ("M1_Plus".equals(model)) { return "Explay M1 Plus"; }
        else if ("MEDION E4502".equals(model)) { return "MEDION E4502"; }
        else if ("MFC_HR".equals(model)) { return "Clementoni My First Clempad HR"; }
        else if ("M321".equals(model)) { return "Huawei Honor Box"; }
        else if ("Movistar Prime".equals(model)) { return "ZTE Blade"; }
        else if ("MTAB-07535AK".equals(model)) { return "Memorex MTAB-0753AK"; }
        else if ("Model 2".equals(model)) { return "Oioo Model 2"; }
        else if ("Model 3".equals(model)) { return "Oioo Model 3"; }
        else if ("ME371MG".equals(model)) { return "ASUS Fonepad ME371MG"; }
        else if ("MD1005".equals(model)) { return "Lazer MD1005 Tablet"; }
        else if ("MD1001".equals(model)) { return "AMTC MD1001 Tablet"; }
        else if ("MSP4507".equals(model)) { return "Manta MSP4507"; }
        else if ("MaxiIQ".equals(model)) { return "Pegatron MaxiIQ"; }
        else if ("ME525+".equals(model)) { return "Motorola Defy"; }
        else if ("Micromax A200".equals(model)) { return "Micromax CANVAS TURBO MINI"; }
        else if ("M51w".equals(model)) { return "Sony Xperia Z1 Compact"; }
        else if ("MEO Smart A40".equals(model)) { return "ZTE Blade G Lux"; }
        else if ("M511".equals(model)) { return "Infocus M511"; }
        else if ("MFC191FR2".equals(model)) { return "Lexibook Fluo XL"; }
        else if ("M512".equals(model)) { return "Infocus M512"; }
        else if ("M518".equals(model)) { return "Infocus M518"; }
        else if ("Micromax P690".equals(model)) { return "Micromax Canvas Tab"; }
        else if ("MFC2_Special".equals(model)) { return "Clementoni My first Clempad 4.4 Basic Special"; }
        else if ("MTC 1078".equals(model)) { return "TCT (Alcatel) ONE TOUCH EVO7HD"; }
        else if ("M510".equals(model)) { return "Infocus M511"; }
        else if ("M701".equals(model)) { return "Hisense M701"; }
        else if ("M702".equals(model)) { return "Fujitsu STYLISTIC M702"; }
        else if ("MF8604".equals(model)) { return "ZTE Blade"; }
        else if ("Micromax A56".equals(model)) { return "Micromax A56"; }
        else if ("Micromax A50".equals(model)) { return "Micromax A50"; }
        else if ("MID7317CP".equals(model)) { return "Anydata Auchan MID7317CP Tablet"; }
        else if ("M470BSA".equals(model)) { return "Hisense M470BSA"; }
        else if ("M470BSG".equals(model)) { return "Hisense M470BSG"; }
        else if ("M470BSD".equals(model)) { return "Hisense M470BSD"; }
        else if ("M470BSE".equals(model)) { return "Hisense M470BSE"; }
        else if ("M3mini".equals(model)) { return "Gionee M3mini"; }
        else if ("M3101BCD".equals(model)) { return "Hisense M3101BCD"; }
        else if ("MB865".equals(model)) { return "Motorola Atrix 2"; }
        else if ("MB860".equals(model)) { return "Motorola Atrix 4G"; }
        else if ("MB861".equals(model)) { return "Motorola Atrix"; }
        else if ("msm8625".equals(model)) { return "Hisense HS-EG929"; }
        else if ("MZ617".equals(model)) { return "Motorola XOOM 2"; }
        else if ("Motorola Electrify".equals(model)) { return "Motorola Photon 4G"; }
        else if ("MY1306P".equals(model)) { return "Lazer MY1306P"; }
        else if ("M97".equals(model)) { return "Anydata Matsunichi M97"; }
        else if ("Micromax A73".equals(model)) { return "Micromax A73"; }
        else if ("Micromax A77".equals(model)) { return "Micromax Canvas Juice"; }
        else if ("Micromax A79".equals(model)) { return "Micromax Bolt"; }
        else if ("Micromax Q380".equals(model)) { return "Micromax Canvas Spark"; }
        else if ("MY15ADA".equals(model)) { return "Honda Pilot"; }
        return "";

    }
    public static String lMethod (String model) {
        if ("Lenovo A750e".equals(model)) { return "Lenovo A750e"; }
        else if ("LG-VM701".equals(model)) { return "LGE Optimus Slider"; }
        else if ("LED32K600J".equals(model)) { return "Hisense LED32K600J"; }
        else if ("LG-H735".equals(model)) { return "LGE LG G4 Beat"; }
        else if ("Lenovo S850t".equals(model)) { return "Lenovo S850t"; }
        else if ("LNV-Lenovo A375e".equals(model)) { return "Lenovo A375e"; }
        else if ("Lenovo A1900".equals(model)) { return "Lenovo A1900"; }
        else if ("LG-F520S".equals(model)) { return "LGE AKA"; }
        else if ("LED39K600X3D".equals(model)) { return "Hisense LED39K600X3D"; }
        else if ("LG-P920h".equals(model)) { return "LGE Optimus 3D"; }
        else if ("LG-F520K".equals(model)) { return "LGE TBD"; }
        else if ("LG-F520L".equals(model)) { return "LGE AKA"; }
        else if ("LG-SU640".equals(model)) { return "LGE Optimus LTE"; }
        else if ("Lenovo A228t".equals(model)) { return "Lenovo A228t"; }
        else if ("Lenovo A5100".equals(model)) { return "Lenovo A816"; }
        else if ("LG-P815L".equals(model)) { return "LGE LG G Pad II 8.3"; }
        else if ("Luno".equals(model)) { return "Orange Luno"; }
        else if ("LG-C550".equals(model)) { return "LGE Optimus Chat"; }
        else if ("LG-C555".equals(model)) { return "LGE Optimus Chat"; }
        else if ("LG-H440AR".equals(model)) { return "LGE LG Spirit LTE"; }
        else if ("LG-P768".equals(model)) { return "LG Optimus L9"; }
        else if ("LG-P769".equals(model)) { return "LG Optimus L9"; }
        else if ("Lenovo A5800-D".equals(model)) { return "Lenovo A5800-D"; }
        else if ("LG-P760".equals(model)) { return "LG Optimus L9"; }
        else if ("LG-P765".equals(model)) { return "LGE LG Optimus L9"; }
        else if ("LCD-LX565A".equals(model)) { return "Sharp LCD-LX565A"; }
        else if ("L7".equals(model)) { return "Camelus L7"; }
        else if ("L9".equals(model)) { return "Polaroid L9"; }
        else if ("Lenovo YT3-X50F".equals(model)) { return "Lenovo YT3-X50F/Yoga3 Tablet"; }
        else if ("LED46K360J".equals(model)) { return "Hisense LED46K360J"; }
        else if ("Logicom-S9782".equals(model)) { return "Haier Logicom S9782"; }
        else if ("LG-D683".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-AS780".equals(model)) { return "LGE LG Optimus F7"; }
        else if ("LED55K370".equals(model)) { return "Hisense LED55K370"; }
        else if ("LED55XT810X3DU".equals(model)) { return "Hisense LED55XT810X3DU"; }
        else if ("Lenovo A6020a40".equals(model)) { return "Lenovo K5"; }
        else if ("Lenovo A6020a41".equals(model)) { return "Lenovo K5"; }
        else if ("Lenovo A6020a46".equals(model)) { return "Lenovo K5 Plus"; }
        else if ("LG-D693".equals(model)) { return "LGE G3 Stylus"; }
        else if ("LG-D690".equals(model)) { return "LGE G Vista"; }
        else if ("Lenovo A828t".equals(model)) { return "Lenovo A828t"; }
        else if ("LG-VS700".equals(model)) { return "LGE LG Enlighten"; }
        else if ("L-07C".equals(model)) { return "LGE Marquee"; }
        else if ("LG-MS770".equals(model)) { return "LG Motion 4G"; }
        else if ("Lenovo K32c36".equals(model)) { return "Lenovo K32"; }
        else if ("Lenovo A536".equals(model)) { return "Lenovo A536"; }
        else if ("LED42K360J".equals(model)) { return "Hisense LED42K360J"; }
        else if ("Lenovo A880".equals(model)) { return "Lenovo"; }
        else if ("LED50G05".equals(model)) { return "Hisense LED50G05"; }
        else if ("LG-E460f".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("Lenovo A2020a40".equals(model)) { return "Lenovo A2020a40"; }
        else if ("LGL86C".equals(model)) { return "LGE Optimus Core"; }
        else if ("LG-C800".equals(model)) { return "LG myTouch Q"; }
        else if ("LG-H961S".equals(model)) { return "LGE V10"; }
        else if ("LG-H961N".equals(model)) { return "LGE V10"; }
        else if ("LG-P490L".equals(model)) { return "LGE LG G Pad 8.0 LTE"; }
        else if ("LED42K560X3D".equals(model)) { return "Hisense LED42K560X3D"; }
        else if ("LC-50LE860H".equals(model)) { return "Sharp LC-50LE860H"; }
        else if ("LC-50LE860M".equals(model)) { return "Sharp LC-50LE860M"; }
        else if ("LG-F690S".equals(model)) { return "LGE LG X cam"; }
        else if ("LC-58UE1H".equals(model)) { return "Sharp LC-58UE1H"; }
        else if ("LC-58UE1M".equals(model)) { return "Sharp LC-58UE1M"; }
        else if ("Lenovo A3800-d".equals(model)) { return "Lenovo A3800-D"; }
        else if ("LIFETAB_E10310".equals(model)) { return "Lenovo LIFETAB E10310"; }
        else if ("LIFETAB_E10316".equals(model)) { return "Medion LIFETAB E10316"; }
        else if ("Lenovo TAB 2 A10-70LC".equals(model)) { return "Lenovo TAB 2 A10"; }
        else if ("Lenovo A808t".equals(model)) { return "Lenovo A808t"; }
        else if ("LGLS996".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LGLS991".equals(model)) { return "LGE LG G4"; }
        else if ("LGLS990".equals(model)) { return "LG G3"; }
        else if ("LGLS992".equals(model)) { return "LGE LG G5"; }
        else if ("LED50K660X3D".equals(model)) { return "Hisense LED50K660X3D"; }
        else if ("Lenovo A305e".equals(model)) { return "Lenovo A305E"; }
        else if ("Lenovo A318t".equals(model)) { return "Lenovo A318t"; }
        else if ("LG-MS690".equals(model)) { return "LGE Optimus One"; }
        else if ("Lenovo A398t".equals(model)) { return "Lenovo A398t"; }
        else if ("LG-MS695".equals(model)) { return "LGE LG OPTIMUS M+"; }
        else if ("LG-H631MX".equals(model)) { return "LGE LG G Stylo"; }
        else if ("Lenovo A6800".equals(model)) { return "Lenovo A6800"; }
        else if ("LGUS375".equals(model)) { return "LGE LG Phoenix 2"; }
        else if ("Lenovo A2580".equals(model)) { return "Lenovo A2580"; }
        else if ("Liquid Metal".equals(model)) { return "Acer LiquidMT"; }
        else if ("LE43B7600A".equals(model)) { return "Haier LE43B7600A"; }
        else if ("LG-H900".equals(model)) { return "LGE V10"; }
        else if ("LG-H901".equals(model)) { return "LGE V10"; }
        else if ("LG-V500".equals(model)) { return "LGE LG G Pad 8.3"; }
        else if ("Lenovo S650".equals(model)) { return "Lenovo S650_ROW"; }
        else if ("LG-D955".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-D956".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-D950".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-D959".equals(model)) { return "LG G Flex"; }
        else if ("LG-D958".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-K420".equals(model)) { return "LGE LG K10"; }
        else if ("LG-K428".equals(model)) { return "LGE LG K10"; }
        else if ("LG-V498S1".equals(model)) { return "LGE G Pad II 8.0"; }
        else if ("LG-V498S2".equals(model)) { return "LGE G Pad II 8.0"; }
        else if ("Lenovo S860".equals(model)) { return "Lenovo S860"; }
        else if ("Lenovo TAB S8-50LC".equals(model)) { return "Lenovo TAB S8-50LC"; }
        else if ("Lenovo A398t+".equals(model)) { return "Lenovo A398t+"; }
        else if ("LG-P713GO".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("Lenovo A3500-H".equals(model)) { return "Lenovo A3500-H"; }
        else if ("Lenovo A3500-F".equals(model)) { return "Lenovo A3500-F"; }
        else if ("LGLK430".equals(model)) { return "LGE LG G Pad F7.0"; }
        else if ("LG-P880g".equals(model)) { return "LGE Optimus 4X HD"; }
        else if ("LED39K280J3D".equals(model)) { return "Hisense LED39K280J3D"; }
        else if ("Lenovo TAB S8-50L".equals(model)) { return "Lenovo TAB S8-50L"; }
        else if ("LG-F600S".equals(model)) { return "LGE V10"; }
        else if ("L-EMENT500L".equals(model)) { return "Logicom L-EMENT500"; }
        else if ("LS-5013".equals(model)) { return "Hipstreet LS-5013"; }
        else if ("LG-F600K".equals(model)) { return "LGE V10"; }
        else if ("LG-F600L".equals(model)) { return "LGE V10"; }
        else if ("LG-D385".equals(model)) { return "LGE LG L80 Dual"; }
        else if ("LG-D380".equals(model)) { return "LGE LG L80 Dual"; }
        else if ("LG-H810".equals(model)) { return "LGE LG G4"; }
        else if ("LG-D120AR".equals(model)) { return "LGE L30 Sporty"; }
        else if ("Lenovo A330e".equals(model)) { return "Lenovo A330e"; }
        else if ("LG-H650".equals(model)) { return "LGE LG Zero"; }
        else if ("LG-X170fTV".equals(model)) { return "LGE LG Prime II"; }
        else if ("LG-SU880".equals(model)) { return "LGE Optimus EX"; }
        else if ("Lenovo X2-EU".equals(model)) { return "Lenovo X2"; }
        else if ("Lenovo A6000-l".equals(model)) { return "Lenovo A6000-l"; }
        else if ("LG-V525".equals(model)) { return "LGE LG G Pad III 8.0 FHD"; }
        else if ("LG-V522".equals(model)) { return "LGE LG G Pad III 8.0"; }
        else if ("LG-C729".equals(model)) { return "LGE LG DOUBLEPLAY"; }
        else if ("LG-V521".equals(model)) { return "LGE LG G Pad X 8.0"; }
        else if ("LG-FL40L".equals(model)) { return "LGE 070 touch"; }
        else if ("l5400".equals(model)) { return "Toshiba L5450ME"; }
        else if ("LG-F180L".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-F180K".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-F180S".equals(model)) { return "LGE LG Optimus G"; }
        else if ("Liquid MT".equals(model)) { return "Acer LiquidMT"; }
        else if ("LGL35G".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("Lenovo S60-w".equals(model)) { return "Lenovo S60"; }
        else if ("LS-4505".equals(model)) { return "Lyf LS-4505"; }
        else if ("LS-4503".equals(model)) { return "Lyf LS-4503"; }
        else if ("LG-X180g".equals(model)) { return "LGE LG ZONE"; }
        else if ("Lenovo S820_ROW".equals(model)) { return "Lenovo S820"; }
        else if ("Lenovo A376".equals(model)) { return "Lenovo A376"; }
        else if ("LG-V507L".equals(model)) { return "LGE LG G Pad 8.3 homeBoy"; }
        else if ("Lenovo S5000-H".equals(model)) { return "Lenovo S5000"; }
        else if ("Lenovo K910e".equals(model)) { return "Lenovo K910e"; }
        else if ("Lenovo S5000-F".equals(model)) { return "Lenovo S5000"; }
        else if ("Lenovo K910L".equals(model)) { return "Lenovo K910L"; }
        else if ("LG-LU3700".equals(model)) { return "LGE Optimus One"; }
        else if ("LG-E440g".equals(model)) { return "LG Optimus L4 II"; }
        else if ("LG-E440f".equals(model)) { return "LGE LG Optimus L4 II"; }
        else if ("LG-P659H".equals(model)) { return "LGE Optimus F3"; }
        else if ("Lenovo S868t".equals(model)) { return "Lenovo S868"; }
        else if ("Lenovo K50-t3s".equals(model)) { return "Lenovo K50"; }
        else if ("Le Pan S".equals(model)) { return "Anydata Le Pan S"; }
        else if ("Luvo 001".equals(model)) { return "LUVO 001"; }
        else if ("LG-P708g".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LenovoA3300-GV".equals(model)) { return "Lenovo A3300-GV"; }
        else if ("LG-P659".equals(model)) { return "LGE Optimus F3"; }
        else if ("LG GW620R".equals(model)) { return "LGE Eve"; }
        else if ("LG-E415f".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG GW620F".equals(model)) { return "LGE Eve"; }
        else if ("LG GW620g".equals(model)) { return "LGE Eve"; }
        else if ("LENNY".equals(model)) { return "Wiko LENNY"; }
        else if ("Lenovo A3300-T".equals(model)) { return "Lenovo A3300"; }
        else if ("LifeStick".equals(model)) { return "CCC LifeStick"; }
        else if ("LG-D631".equals(model)) { return "LGE LG G Vista"; }
        else if ("LG-P350g".equals(model)) { return "LGE LG Pecan"; }
        else if ("Lenovo 2 A8-50F".equals(model)) { return "Lenovo TAB 2 A8-50F"; }
        else if ("LG-F370K".equals(model)) { return "LGE LG F70"; }
        else if ("Lenovo K30-T".equals(model)) { return "Lenovo K30-T"; }
        else if ("Lenovo K30-W".equals(model)) { return "Lenovo K30-W"; }
        else if ("Lenovo K30-E".equals(model)) { return "Lenovo K30-E"; }
        else if ("LG-F370S".equals(model)) { return "LGE LG F70"; }
        else if ("LG-H630".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-H631".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-H635".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-H636".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-SU760".equals(model)) { return "LGE Optimus 3D"; }
        else if ("Lenovo X2-CU".equals(model)) { return "Lenovo X2-CU/VIBE X2"; }
        else if ("LG-P870h".equals(model)) { return "LGE Optimus F5"; }
        else if ("LE55M7000CF".equals(model)) { return "Haier LE55M7000CF"; }
        else if ("LT610".equals(model)) { return "LT610"; }
        else if ("LG-F570S".equals(model)) { return "LGE LG F570S"; }
        else if ("Lenovo Z90-3".equals(model)) { return "Lenovo Z90/VIBE Shot"; }
        else if ("Lenovo TAB 2 A7-30F".equals(model)) { return "Lenovo TAB 2 A7-30F"; }
        else if ("LG-F670S".equals(model)) { return "LGE LG K10"; }
        else if ("LG-F670L".equals(model)) { return "LGE LG K10"; }
        else if ("LG-F670K".equals(model)) { return "LGE LG K10"; }
        else if ("Lenovo k52t38".equals(model)) { return "Lenovo K52t38"; }
        else if ("LG-H788TR".equals(model)) { return "LGE LG AKA"; }
        else if ("Lenovo A319".equals(model)) { return "Lenovo A319"; }
        else if ("LG-F470K".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-F470L".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-E730".equals(model)) { return "LGE Optimus Sol"; }
        else if ("LG-F470S".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-E739".equals(model)) { return "LG MyTouch e739"; }
        else if ("Lenovo S820".equals(model)) { return "Lenovo S820"; }
        else if ("Lenovo A766".equals(model)) { return "Lenovo A766"; }
        else if ("Lenovo A760".equals(model)) { return "Lenovo A760"; }
        else if ("LG-AK495".equals(model)) { return "LGE LG G Pad F 8.0"; }
        else if ("LG-LU6800".equals(model)) { return "LGE Optimus Big"; }
        else if ("LED32K360J3D".equals(model)) { return "Hisense LED32K360J3D"; }
        else if ("Lenovo A380t".equals(model)) { return "Lenovo A380t"; }
        else if ("LT26w".equals(model)) { return "Sony Ericsson Xperia acro S"; }
        else if ("L39t".equals(model)) { return "Sony Xperia Z1"; }
        else if ("L39h".equals(model)) { return "Sony Xperia Z1"; }
        else if ("LT26i".equals(model)) { return "Sony Xperia S"; }
        else if ("LG-GW620".equals(model)) { return "LGE Eve"; }
        else if ("LG-E617G".equals(model)) { return "LGE Optimus L5"; }
        else if ("LIFETAB_E7316".equals(model)) { return "Medion LIFETAB E7316"; }
        else if ("LIFETAB_E7313".equals(model)) { return "Medion LIFETAB E7313"; }
        else if ("LIFETAB_E7310".equals(model)) { return "Lenovo LIFETAB E7310"; }
        else if ("LED32K600X3D".equals(model)) { return "Hisense LED32K600X3D"; }
        else if ("LG-P720h".equals(model)) { return "LGE Optimus 3D MAX"; }
        else if ("l3453".equals(model)) { return "Toshiba L5450C"; }
        else if ("LGMS550".equals(model)) { return "LGE LG Stylus2 Plus"; }
        else if ("LG-D610".equals(model)) { return "LGE G2 MINI"; }
        else if ("LG-D618".equals(model)) { return "LGE G2 MINI"; }
        else if ("Lenovo A316i".equals(model)) { return "Lenovo A316i"; }
        else if ("Lenovo K920".equals(model)) { return "Lenovo K920/VIBE Z2 Pro"; }
        else if ("LG-H340".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LG-H342".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LG-H343".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("Lenovo X2-AP".equals(model)) { return "Lenovo  X2"; }
        else if ("LG-AS991".equals(model)) { return "LGE LG G4"; }
        else if ("Lenovo A396_TY".equals(model)) { return "Lenovo A396"; }
        else if ("Lenovo S580".equals(model)) { return "Lenovo S580"; }
        else if ("LGL17AG".equals(model)) { return "LGE LG Classic"; }
        else if ("LT18a".equals(model)) { return "Sony Ericsson Xperia arc S"; }
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
        else if ("Lenovo A7600".equals(model)) { return "Lenovo A7600"; }
        else if ("LG-F300S".equals(model)) { return "LGE VU3"; }
        else if ("LG-D400".equals(model)) { return "LGE L90"; }
        else if ("LG-D405".equals(model)) { return "LGE L90"; }
        else if ("LG-F300L".equals(model)) { return "LGE VU3"; }
        else if ("LG-F300K".equals(model)) { return "LGE VU3"; }
        else if ("LE48M7000CF".equals(model)) { return "Haier LE48M7000CF"; }
        else if ("LG-F260S".equals(model)) { return "LGE LG Optimus LTE3"; }
        else if ("LG-D213AR".equals(model)) { return "LGE L50 Sporty"; }
        else if ("Lenovo A890e".equals(model)) { return "Lenovo A890e"; }
        else if ("LG-E615f".equals(model)) { return "LGE LG Optimus L5 Dual"; }
        else if ("Lenovo PB1-770N".equals(model)) { return "Lenovo PB1-770N"; }
        else if ("Lenovo PB1-770M".equals(model)) { return "Lenovo PB1-770M/Lenovo PHAB Plus"; }
        else if ("LED48L288".equals(model)) { return "Hisense LED48L288"; }
        else if ("Lenovo PB1-770P".equals(model)) { return "Lenovo"; }
        else if ("Lenovo A670t".equals(model)) { return "Lenovo A670t"; }
        else if ("LG-L40G".equals(model)) { return "LGE Optimus L5"; }
        else if ("LED32K360J".equals(model)) { return "Hisense LED32K360J"; }
        else if ("LED39K600X3DU".equals(model)) { return "Hisense LED39K600X3DU"; }
        else if ("LG-SU870".equals(model)) { return "LGE Optimus 3D MAX"; }
        else if ("LG-V700n".equals(model)) { return "LGE G Pad 10.1"; }
        else if ("LG-D415".equals(model)) { return "LG Optimus L90"; }
        else if ("LT650".equals(model)) { return "QMobile LT650"; }
        else if ("LGL55C".equals(model)) { return "LG LGL55C"; }
        else if ("Lenovo S870e".equals(model)) { return "Lenovo S870e"; }
        else if ("LG-X155".equals(model)) { return "LGE LG Max"; }
        else if ("LG-LS995".equals(model)) { return "LGE LG G Flex"; }
        else if ("LaVieTab PC-TE510S1".equals(model)) { return "NEC LaVieTab PC-TE510S1L"; }
        else if ("Lenovo A7000-a".equals(model)) { return "Lenovo A7000"; }
        else if ("LGL33L".equals(model)) { return "LGE LG SUNSET"; }
        else if ("LG-D180f".equals(model)) { return "LGE Optimus L40"; }
        else if ("LED65K600X3D".equals(model)) { return "Hisense LED65K600X3D"; }
        else if ("LG-E445".equals(model)) { return "LGE LG Optimus L4 II Dual"; }
        else if ("LG-E440".equals(model)) { return "LGE LG Optimus L4 II"; }
        else if ("LGMS631".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LNV-Lenovo A630e".equals(model)) { return "Lenovo A630"; }
        else if ("LG-D852".equals(model)) { return "G3"; }
        else if ("LG-LS696".equals(model)) { return "LGE LG Optimus Elite"; }
        else if ("LT22i".equals(model)) { return "Sony Xperia P"; }
        else if ("LGL15G".equals(model)) { return "LGE Y25"; }
        else if ("LGL21G".equals(model)) { return "LGE LG Destiny"; }
        else if ("Los Angeles".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("LG-H420".equals(model)) { return "LGE LG Spirit"; }
        else if ("LG-K120GT".equals(model)) { return "LGE LG K4"; }
        else if ("Lenovo A7600-HV".equals(model)) { return "Lenovo A7600-HV"; }
        else if ("LED50K360J".equals(model)) { return "Hisense LED50K360J"; }
        else if ("LG-E410B".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E410f".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E410g".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E410c".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E410i".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("Lenovo A338t".equals(model)) { return "Lenovo A338t"; }
        else if ("LT25c".equals(model)) { return "Sony Ericsson Xperia V"; }
        else if ("Lenovo TAB 2 A7-30GC".equals(model)) { return "Lenovo A7-30GC"; }
        else if ("Lenovo P1c72".equals(model)) { return "Lenovo P1"; }
        else if ("Lenovo A238t".equals(model)) { return "Lenovo A238t"; }
        else if ("Lenovo A5000".equals(model)) { return "Lenovo A5000"; }
        else if ("Lenovo A706".equals(model)) { return "Lenovo A706"; }
        else if ("LG-H410".equals(model)) { return "LGE LG Wine Smart"; }
        else if ("Lenovo A3300-HV".equals(model)) { return "Lenovo A3300-HV"; }
        else if ("LG-X132".equals(model)) { return "LGE L45"; }
        else if ("LG-X137".equals(model)) { return "LGE L60"; }
        else if ("L-06DJOJO".equals(model)) { return "LGE Optimus Vu"; }
        else if ("LG-F220K".equals(model)) { return "LGE Optimus GK"; }
        else if ("LGUK410".equals(model)) { return "LGE G Pad 7.0 LTE"; }
        else if ("LG-P350f".equals(model)) { return "LGE LG Pecan"; }
        else if ("LG-D290AR".equals(model)) { return "LGE L Fino"; }
        else if ("Lenovo S938t".equals(model)) { return "Lenovo S938t"; }
        else if ("Lenovo A938t".equals(model)) { return "Lenovo A938t"; }
        else if ("LG-E460".equals(model)) { return "LG Optimus L5 II"; }
        else if ("Lenovo A806".equals(model)) { return "Lenovo A806"; }
        else if ("LG-K371".equals(model)) { return "LGE LG Phoenix 2"; }
        else if ("LG-K373".equals(model)) { return "LGE LG Phoenix 2"; }
        else if ("LGMS659".equals(model)) { return "LGE Optimus F3"; }
        else if ("LC-A11A".equals(model)) { return "Sharp LC-A11A"; }
        else if ("Lenovo P1a42".equals(model)) { return "Lenovo P1"; }
        else if ("Lenovo P1a41".equals(model)) { return "Lenovo P1"; }
        else if ("LenovoA1000L-F".equals(model)) { return "Lenovo IdeaTab A1000"; }
        else if ("Light Tab 2".equals(model)) { return "ZTE V9A"; }
        else if ("LED55K600X3D".equals(model)) { return "Hisense LED55K600X3D"; }
        else if ("LED47K600X3D".equals(model)) { return "Hisense LED47K600X3D"; }
        else if ("LG-P880".equals(model)) { return "LGE Optimus 4X HD"; }
        else if ("LS-5504".equals(model)) { return "ZTE N939Sc"; }
        else if ("L-ITE 402".equals(model)) { return "Logicom L-ITE402"; }
        else if ("Lenovo A656".equals(model)) { return "Lenovo A656"; }
        else if ("LG-V480".equals(model)) { return "LGE G pad 8.0"; }
        else if ("LG-D165AR".equals(model)) { return "LGE Optimus L40"; }
        else if ("Lenovo A706_ROW".equals(model)) { return "Lenovo A706_ROW"; }
        else if ("LG-H443".equals(model)) { return "LGE LG Escape2"; }
        else if ("LG-H442".equals(model)) { return "LGE LG Volt 4G"; }
        else if ("LG-H445".equals(model)) { return "LGE LG Escape2"; }
        else if ("LED55K610X3D".equals(model)) { return "Hisense LED55K610X3D"; }
        else if ("LAVA V5".equals(model)) { return "Lava V5"; }
        else if ("Lenovo S750".equals(model)) { return "Lenovo S750"; }
        else if ("Lenovo K860i".equals(model)) { return "Lenovo K860i"; }
        else if ("LG-F500K".equals(model)) { return "LGE LG G4"; }
        else if ("LaVieTab PC-TS507N1S".equals(model)) { return "NEC PC- TS507N1S"; }
        else if ("LE40U5000A".equals(model)) { return "Haier LE40U5000A"; }
        else if ("LED46K330X3D".equals(model)) { return "Hisense LED46K330X3D"; }
        else if ("LED60K380".equals(model)) { return "Hisense LED60K380"; }
        else if ("Le Max".equals(model)) { return "LeTV Le Max"; }
        else if ("Lenovo TAB 2 A10-70F".equals(model)) { return "Lenovo TAB 2 A10"; }
        else if ("Lenovo TAB 2 A10-70L".equals(model)) { return "Lenovo TAB 2 A10"; }
        else if ("LG-H320".equals(model)) { return "LGE LG Leon"; }
        else if ("LG-H326".equals(model)) { return "LGE LG Leon TV"; }
        else if ("LG-H324".equals(model)) { return "LGE LG Leon"; }
        else if ("Lenovo P1c58".equals(model)) { return "Lenovo P1"; }
        else if ("LG-F690L".equals(model)) { return "LGE LG X cam"; }
        else if ("LG-H850".equals(model)) { return "LGE LG G5"; }
        else if ("Lenovo A3500".equals(model)) { return "Lenovo A3500"; }
        else if ("LI902T9IN".equals(model)) { return "Auchan LI902T9IN"; }
        else if ("LNV-Lenovo A785e".equals(model)) { return "Lenovo A785e"; }
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
        else if ("Lenovo A820".equals(model)) { return "Lenovo A820"; }
        else if ("Lenovo A390".equals(model)) { return "Lenovo A390"; }
        else if ("LG-K350".equals(model)) { return "LGE LG K8 LTE"; }
        else if ("Lenovo S810t".equals(model)) { return "Lenovo S810t"; }
        else if ("Lenovo B8000-F".equals(model)) { return "Lenovo B8000-F"; }
        else if ("Lenovo S90-t".equals(model)) { return "Lenovo S90-T"; }
        else if ("Lenovo S90-u".equals(model)) { return "Lenovo S90-U"; }
        else if ("Lenovo B8000-H".equals(model)) { return "Lenovo B8000-H"; }
        else if ("Lenovo S90-A".equals(model)) { return "Lenovo S90-A"; }
        else if ("Lenovo A308t".equals(model)) { return "Lenovo A308t"; }
        else if ("LG-D693n".equals(model)) { return "LGE G3 Stylus"; }
        else if ("LG-E435f".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LG-V905R".equals(model)) { return "LGE Optimus Pad"; }
        else if ("LG-F320L".equals(model)) { return "LGE LG G2"; }
        else if ("LG-E435k".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("Lenovo A388t".equals(model)) { return "Lenovo A388t"; }
        else if ("LG-F320S".equals(model)) { return "LGE LG G2"; }
        else if ("Lenovo A850+".equals(model)) { return "Lenovo A850+"; }
        else if ("LG-E450g".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-E450j".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LED42K600X3D".equals(model)) { return "Hisense LED42K600X3D"; }
        else if ("LG-E989".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-E988".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-E987".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-E980".equals(model)) { return "LG Optimus G Pro"; }
        else if ("Lenovo A3500-FL".equals(model)) { return "Lenovo A3500-FL"; }
        else if ("LED55L288".equals(model)) { return "Hisense LED55L288"; }
        else if ("LG-V607L".equals(model)) { return "LGE Homeboy2"; }
        else if ("Lenovo X2-TR".equals(model)) { return "Lenovo X2-TR/VIBE X2"; }
        else if ("Lenovo X2-TO".equals(model)) { return "Lenovo X2-TO/VIBE X2"; }
        else if ("LG-X165g".equals(model)) { return "LGE LG Max"; }
        else if ("LG-H340GT".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LGL25L".equals(model)) { return "LGE Optimus F3"; }
        else if ("LG-H221AR".equals(model)) { return "LGE LG Joy"; }
        else if ("LG-E615".equals(model)) { return "LGE LG Optimus L5 Dual"; }
        else if ("LG-E612".equals(model)) { return "LGE Optimus L5"; }
        else if ("LT-NA7F".equals(model)) { return "NEC LifeTouch Note"; }
        else if ("Lenovo A768t".equals(model)) { return "Lenovo A768t"; }
        else if ("LG-H340AR".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LT900".equals(model)) { return "Lava XOLO LT900"; }
        else if ("Lenovo K910".equals(model)) { return "VIBE Z K910"; }
        else if ("LG-P920".equals(model)) { return "LGE Optimus 3D"; }
        else if ("Lenovo A369i".equals(model)) { return "Lenovo A369i"; }
        else if ("LG-D170".equals(model)) { return "LGE Optimus L40"; }
        else if ("LGL39C".equals(model)) { return "LGE LG L39C"; }
        else if ("LG-F510K".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-F510L".equals(model)) { return "LGE LG G Flex2"; }
        else if ("Le Pan TC1010".equals(model)) { return "Le Pan TC1010"; }
        else if ("LG-F510S".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-H340n".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("LG-D821".equals(model)) { return "LG Nexus 5"; }
        else if ("LG-D820".equals(model)) { return "LG Nexus 5 USA"; }
        else if ("LG-AS330".equals(model)) { return "LGE LG M1"; }
        else if ("LED65XT880G3DU".equals(model)) { return "Hisense LED65XT880G3DU"; }
        else if ("LG-E420".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-E425".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LED65XT880G3DF".equals(model)) { return "Hisense LED65XT880G3DF"; }
        else if ("L-EMENT 742".equals(model)) { return "Logicom L-EMENT TAB 742"; }
        else if ("L-EMENT 741".equals(model)) { return "Logicom L-EMENT TAB 741"; }
        else if ("LED42K370".equals(model)) { return "Hisense LED42K370"; }
        else if ("LED32G180".equals(model)) { return "Hisense LED32G180"; }
        else if ("LED32K370".equals(model)) { return "Hisense LED32K370"; }
        else if ("LG-D486".equals(model)) { return "LGE Wine Smart"; }
        else if ("LG-F200LS".equals(model)) { return "LGE Optimus Vu2"; }
        else if ("Lenovo A320t".equals(model)) { return "Lenovo A320t"; }
        else if ("LG-F610S".equals(model)) { return "LGE LG Wine Smart Jazz"; }
        else if ("LG-AS695".equals(model)) { return "LGE Optimus Plus"; }
        else if ("LED58K280J".equals(model)) { return "Hisense LED58K280J"; }
        else if ("Lenovo A2010l36".equals(model)) { return "Lenovo A2010l36"; }
        else if ("LED58K280U".equals(model)) { return "Hisense LED58K280U"; }
        else if ("Lenovo A678t".equals(model)) { return "Lenovo A678t"; }
        else if ("LS-5008".equals(model)) { return "ZTE Blade S6"; }
        else if ("LS-5009".equals(model)) { return "Lyf LS-5009"; }
        else if ("LS-5004".equals(model)) { return "Lyf LS-5004"; }
        else if ("LG-LS855".equals(model)) { return "LGE Marquee"; }
        else if ("LG-D802TR".equals(model)) { return "LGE LG G2"; }
        else if ("LG-D950G".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-P698".equals(model)) { return "LGE Optimus Net Dual"; }
        else if ("LG-P690".equals(model)) { return "LGE Optimus Spirit"; }
        else if ("l4300".equals(model)) { return "Toshiba L4300"; }
        else if ("LGL82VL".equals(model)) { return "LGE LG Stylo 2"; }
        else if ("LT26ii".equals(model)) { return "Sony Ericsson Xperia SL"; }
        else if ("LGLS885".equals(model)) { return "LGE G3 Vigor"; }
        else if ("Lenovo K30-TM".equals(model)) { return "Lenovo K30-TM"; }
        else if ("LG-LU3000".equals(model)) { return "LGE Optimus Mach"; }
        else if ("L701 TV".equals(model)) { return "Positivo Ypy"; }
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
        else if ("LG-H422".equals(model)) { return "LGE LG Volt"; }
        else if ("Lenovo A2010-a".equals(model)) { return "Lenovo A2010-a"; }
        else if ("Lenovo X3c50".equals(model)) { return "Lenovo X3c50"; }
        else if ("Lenovo YT3-850F".equals(model)) { return "Lenovo YT3-850F/Lenovo YOGATab3"; }
        else if ("LG-H811".equals(model)) { return "LG G4"; }
        else if ("LG-H815".equals(model)) { return "G4"; }
        else if ("LG-H818".equals(model)) { return "LGE LG G4"; }
        else if ("LG-H819".equals(model)) { return "LGE LG G4"; }
        else if ("Lenovo YT3-850L".equals(model)) { return "Lenovo YT3-850L/Lenovo YOGATab3"; }
        else if ("Lenovo YT3-850M".equals(model)) { return "Lenovo YT3-850M/Lenovo YOGATab3"; }
        else if ("LG-X140".equals(model)) { return "LGE L60"; }
        else if ("LG-K130".equals(model)) { return "LGE LG K4 LTE"; }
        else if ("Leader".equals(model)) { return "Explay Leader"; }
        else if ("LG-H820".equals(model)) { return "LGE LG G5"; }
        else if ("Lenovo A3910t30".equals(model)) { return "Lenovo A31910t30"; }
        else if ("LGMS323".equals(model)) { return "LG Optimus L70"; }
        else if ("LG-F160K".equals(model)) { return "LGE LG optimus LTE2"; }
        else if ("LG-D725PR".equals(model)) { return "LGE G3 S"; }
        else if ("LG-F160L".equals(model)) { return "LGE LG optimus LTE2"; }
        else if ("LG-US780".equals(model)) { return "LGE LG Optimus F7"; }
        else if ("LED65XT800X3DU".equals(model)) { return "Hisense LED65XT800X3DU"; }
        else if ("LG-F160S".equals(model)) { return "LGE LG optimus LTE2"; }
        else if ("Lenovo K50a40".equals(model)) { return "Lenovo K50"; }
        else if ("LED50K680X3DU".equals(model)) { return "Hisense LED50K680X3DU"; }
        else if ("Le Pan TC802A".equals(model)) { return "Le Pan TC802A"; }
        else if ("LED65XT890G3D".equals(model)) { return "Hisense LED65XT890G3D"; }
        else if ("LED48K380U".equals(model)) { return "Hisense LED48K380U"; }
        else if ("LG-P500h".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-F560K".equals(model)) { return "LGE G Stylo"; }
        else if ("Lenovo A5500".equals(model)) { return "Lenovo A5500"; }
        else if ("LG-E980h".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LT28at".equals(model)) { return "Sony Ericsson Xperia ion"; }
        else if ("LG-C800G".equals(model)) { return "LGE Optimus Hub"; }
        else if ("LED75XT910G3DU".equals(model)) { return "Hisense LED75XT910G3DU"; }
        else if ("LG-H635A".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LS-5021".equals(model)) { return "Lyf LS-5021"; }
        else if ("LG-AS840".equals(model)) { return "LGE LG Optimus LTE Tag"; }
        else if ("LED42L288".equals(model)) { return "Hisense LED42L288"; }
        else if ("LG-F440L".equals(model)) { return "LGE Ice cream Smart"; }
        else if ("Lenovo S898t+".equals(model)) { return "Lenovo S898t+"; }
        else if ("Lenovo S8-50LC".equals(model)) { return "Lenovo TAB S8-50LC"; }
        else if ("LED47K610J3DP".equals(model)) { return "Hisense LED47K610J3DP"; }
        else if ("LG-D520".equals(model)) { return "LGE LG Optimus F3Q"; }
        else if ("LG-D410".equals(model)) { return "LGE L90 Dual"; }
        else if ("Lenovo S820e".equals(model)) { return "Lenovo S820e"; }
        else if ("Lenovo X3c70".equals(model)) { return "Lenovo X3c70"; }
        else if ("Lenovo P90".equals(model)) { return "Lenovo P90"; }
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
        else if ("LG-P990".equals(model)) { return "LGE Optimus 2X"; }
        else if ("Lenovo A889".equals(model)) { return "Lenovo A889"; }
        else if ("LG-P716".equals(model)) { return "LGE Optimus L7II"; }
        else if ("LG-P715".equals(model)) { return "LGE LG Optimus L7II"; }
        else if ("LG-P714".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("LG-P713".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("LG-P712".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("LG-P710".equals(model)) { return "LGE LG Optimus L7 II"; }
        else if ("LED84XT900G3D".equals(model)) { return "Hisense LED84XT900G3D"; }
        else if ("LG-F590".equals(model)) { return "LGE L5000"; }
        else if ("LED42K680X3DU".equals(model)) { return "Hisense LED42K680X3DU"; }
        else if ("LG-E451g".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-AS730".equals(model)) { return "LGE LG Optimus Select"; }
        else if ("LG-V400Y1".equals(model)) { return "LGE G Pad 7.0"; }
        else if ("LIFETAB_S7316".equals(model)) { return "Medion LIFETAB E7316"; }
        else if ("LG-D610TR".equals(model)) { return "LGE G2 MINI"; }
        else if ("LG-V400".equals(model)) { return "LGE Gpad 7.0"; }
        else if ("LG-D290".equals(model)) { return "LGE L Fino"; }
        else if ("LNV-Lenovo A690e".equals(model)) { return "Lenovo A690e"; }
        else if ("LG-D295".equals(model)) { return "LGE L Fino"; }
        else if ("LT28i".equals(model)) { return "Sony Ericsson Xperia ion"; }
        else if ("LT28h".equals(model)) { return "Sony Ericsson Xperia ion"; }
        else if ("Lenovo TB2-X30L".equals(model)) { return "Lenovo TB2-X30L"; }
        else if ("Lenovo TB2-X30F".equals(model)) { return "Lenovo TB2-X30F"; }
        else if ("Lenovo 2 A7-30TC".equals(model)) { return "Lenovo TAB 2 A7-30TC"; }
        else if ("LG-D951".equals(model)) { return "LGE LG G Flex"; }
        else if ("LNV-Lenovo A385e".equals(model)) { return "Lenovo A385e"; }
        else if ("LE49U5000A".equals(model)) { return "Haier LE49U5000A"; }
        else if ("LG-LG870".equals(model)) { return "LGE LG Optimus F7"; }
        else if ("LED65XT780G3D".equals(model)) { return "Hisense LED65XT780G3D"; }
        else if ("LG-D500".equals(model)) { return "LGE Optimus F6"; }
        else if ("LG-D505".equals(model)) { return "LGE Optimus F6"; }
        else if ("Lenovo A358t".equals(model)) { return "Lenovo A358t"; }
        else if ("LG-P925g".equals(model)) { return "LGE LG Optimus 3D"; }
        else if ("Lenovo A3580".equals(model)) { return "Lenovo A3860"; }
        else if ("LG-H502".equals(model)) { return "LGE LG Magna"; }
        else if ("LG-H500".equals(model)) { return "LGE LG Magna"; }
        else if ("Lenovo B6000-F".equals(model)) { return "Lenovo B6000-F"; }
        else if ("LED55XT780G3D".equals(model)) { return "Hisense LED55XT780G3D"; }
        else if ("Lenovo A218t".equals(model)) { return "Lenovo A218t"; }
        else if ("LED46K360X3D".equals(model)) { return "Hisense LED46K360X3D"; }
        else if ("LED48K681X3DU".equals(model)) { return "Hisense LED48K681X3DU"; }
        else if ("LG-E730f".equals(model)) { return "LGE Optimus Sol"; }
        else if ("Lenovo S898t".equals(model)) { return "Lenovo S898t"; }
        else if ("LED55K380U".equals(model)) { return "Hisense LED55K380U"; }
        else if ("Lenovo B8080-H".equals(model)) { return "Lenovo B8080-H"; }
        else if ("LG-K535".equals(model)) { return "LGE LG Stylus2 Plus"; }
        else if ("LG-K530".equals(model)) { return "LGE LG Stylus2 4G"; }
        else if ("LED58XT880J3DU".equals(model)) { return "Hisense LED58XT880J3DU"; }
        else if ("Lenovo A858t".equals(model)) { return "Lenovo A858t"; }
        else if ("LGLS675".equals(model)) { return "LGE LG M1"; }
        else if ("Lenovo A805e".equals(model)) { return "Lenovo A805e"; }
        else if ("L-EMENT_TAB1042BTK".equals(model)) { return "Logicom L-EMENTTAB1042"; }
        else if ("LG-P505CH".equals(model)) { return "LGE LG Optimus One"; }
        else if ("Lenovo A300t".equals(model)) { return "Lenovo A300t"; }
        else if ("LG-KU3700".equals(model)) { return "LGE Optimus One"; }
        else if ("LG-D315".equals(model)) { return "LGE LG F70"; }
        else if ("LS-6001".equals(model)) { return "Hipstreet LS-6001"; }
        else if ("LG-MS870".equals(model)) { return "LGE Spirit 4G"; }
        else if ("LED39K360J".equals(model)) { return "Hisense LED39K360J"; }
        else if ("LG-X130g".equals(model)) { return "LGE L45"; }
        else if ("LG-T280".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LE39M7000CF".equals(model)) { return "Haier LE39M7000CF"; }
        else if ("LG-P506".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-P504".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-P505".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-P503".equals(model)) { return "LGE LG Optimus One"; }
        else if ("LG-P500".equals(model)) { return "LGE LG Optimus One"; }
        else if ("L-IXIR_TAB_840".equals(model)) { return "Logicom L-IXIR TAB 840"; }
        else if ("LG-F480L".equals(model)) { return "LGE Wine Smart"; }
        else if ("LG-F480K".equals(model)) { return "LGE Wine Smart"; }
        else if ("LG-LG855".equals(model)) { return "LGE Marquee"; }
        else if ("LG-F480S".equals(model)) { return "LGE Wine Smart"; }
        else if ("LG-F460L".equals(model)) { return "LGE LG G3 Cat.6"; }
        else if ("Lenovo S920".equals(model)) { return "Lenovo S920"; }
        else if ("Lenovo X2Pt5".equals(model)) { return "Lenovo X2 Pro"; }
        else if ("Lenovo S1La40".equals(model)) { return "Lenovo S1La40"; }
        else if ("LG-F640S".equals(model)) { return "LGE LG Volt S"; }
        else if ("Lenovo A7600-F".equals(model)) { return "Lenovo A7600-F"; }
        else if ("Lenovo P780".equals(model)) { return "Lenovo P780"; }
        else if ("Lenovo A7600-H".equals(model)) { return "Lenovo A7600-H"; }
        else if ("LED48K370".equals(model)) { return "Hisense LED48K370"; }
        else if ("LG-H788".equals(model)) { return "LGE LG AKA"; }
        else if ("LG-LU8300".equals(model)) { return "LGE Optimus PAD LTE"; }
        else if ("LG-D858HK".equals(model)) { return "LGE LG G3"; }
        else if ("l5550".equals(model)) { return "Toshiba L5550/L5551/L5552"; }
        else if ("LGAS323".equals(model)) { return "LGE L70"; }
        else if ("LGMS345".equals(model)) { return "LGE LG Leon 4G LTE"; }
        else if ("Lenovo A7600-m".equals(model)) { return "Lenovo A7600"; }
        else if ("LG-K550".equals(model)) { return "LGE LG Stylo 2 Plus"; }
        else if ("LG Google TV G3".equals(model)) { return "LGE Android TV G3"; }
        else if ("Light Tab".equals(model)) { return "ZTE V9"; }
        else if ("Lenovo A269".equals(model)) { return "Lenovo A269"; }
        else if ("LG-E400R".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LS-5503".equals(model)) { return "ZTE Blade S6 Plus"; }
        else if ("Lenovo A328t".equals(model)) { return "Lenovo A328t"; }
        else if ("LG-E455g".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-E400g".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LG-E400f".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LG-E400b".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("Lenovo A770e".equals(model)) { return "Lenovo A770e"; }
        else if ("LG-D331".equals(model)) { return "LGE LBello"; }
        else if ("LG-D335".equals(model)) { return "LGE L Bello"; }
        else if ("LG-D337".equals(model)) { return "LGE L Bello"; }
        else if ("Lenovo A208t".equals(model)) { return "Lenovo A208t"; }
        else if ("LG-H959".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-F540L".equals(model)) { return "LGE LG Volt LTE"; }
        else if ("LG-H955".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-F540K".equals(model)) { return "LGE LG Volt LTE"; }
        else if ("LG-F540S".equals(model)) { return "LGE LG Volt LTE"; }
        else if ("Lenovo A3600u".equals(model)) { return "Lenovo A3600u"; }
        else if ("L-02D".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("LIFETAB_P733X".equals(model)) { return "Medion LIFETAB P733x"; }
        else if ("LGL85C".equals(model)) { return "LGE Optimus Black"; }
        else if ("L-EMENT 400".equals(model)) { return "Logicom L-EMENT400"; }
        else if ("LGL44VL".equals(model)) { return "LGE LG Rebel"; }
        else if ("LG-H542".equals(model)) { return "LGE LG G4 Stylus"; }
        else if ("LG-H540".equals(model)) { return "LGE LG G4 Stylus"; }
        else if ("LGS01".equals(model)) { return "LGE Wine Smart"; }
        else if ("LT30a".equals(model)) { return "Sony Ericsson Xperia T"; }
        else if ("LT30p".equals(model)) { return "Sony Xperia T"; }
        else if ("LG-V411".equals(model)) { return "LGE G Pad 7.0 LTE"; }
        else if ("LG-E431g".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LenovoA3300-H".equals(model)) { return "Lenovo A3300"; }
        else if ("LG-LW690".equals(model)) { return "LGE Optimus One"; }
        else if ("LG-K500n".equals(model)) { return "LGE LG X screen"; }
        else if ("LT29i".equals(model)) { return "Sony Ericsson Xperia TX"; }
        else if ("LED42K380U".equals(model)) { return "Hisense LED42K380U"; }
        else if ("LG-P778".equals(model)) { return "LGE LG Optimus L9"; }
        else if ("L-EMENT350".equals(model)) { return "Logicom L-EMENT350"; }
        else if ("L36h".equals(model)) { return "Sony Xperia Z"; }
        else if ("LG-F430L".equals(model)) { return "LGE Gx2"; }
        else if ("LGL34C".equals(model)) { return "LG Optimus Fuel"; }
        else if ("Lenovo YT3-X50L".equals(model)) { return "Lenovo YT3-X50L/Yoga3 Tablet"; }
        else if ("Lenovo YT3-X50M".equals(model)) { return "Lenovo YT3-X50M/Yoga3 Tablet"; }
        else if ("LG-D681".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D680".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D682".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D685".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D684".equals(model)) { return "LGE G Pro Lite"; }
        else if ("LG-D686".equals(model)) { return "LG G Pro Lite Dual"; }
        else if ("LG-F500L".equals(model)) { return "LGE LG G4"; }
        else if ("Lenovo TAB 2 A7-30DC".equals(model)) { return "LenovoTAB2 A7-30DC"; }
        else if ("Lenovo A2860".equals(model)) { return "Lenovo A2860"; }
        else if ("LG-P505R".equals(model)) { return "LGE LG Optimus One"; }
        else if ("Lenovo S1a40".equals(model)) { return "Lenovo S1"; }
        else if ("LG-F310LR".equals(model)) { return "LGE LG Gx"; }
        else if ("L-04C".equals(model)) { return "LGE Optimus chat"; }
        else if ("L-04E".equals(model)) { return "LGE Optimus G Pro"; }
        else if ("LG KH5200".equals(model)) { return "LGE Eve"; }
        else if ("L-01D".equals(model)) { return "LGE Optimus LTE"; }
        else if ("Lenovo A658t".equals(model)) { return "Lenovo A658T"; }
        else if ("LED42G200".equals(model)) { return "Hisense LED42G200"; }
        else if ("LED47K560J3D".equals(model)) { return "Hisense LED47K560J3D"; }
        else if ("Lenovo A1000".equals(model)) { return "Lenovo A1000"; }
        else if ("l5450".equals(model)) { return "Toshiba L5450ME"; }
        else if ("L-IXIR TAB 701 3G".equals(model)) { return "Logicom L-IXIR TAB 701 3G"; }
        else if ("Lenovo B6000-H".equals(model)) { return "Lenovo B6000-H"; }
        else if ("LED50K360X3D".equals(model)) { return "Hisense LED50K360X3D"; }
        else if ("Lenovo S960".equals(model)) { return "Lenovo S960"; }
        else if ("LG-X170g".equals(model)) { return "LGE LG Prime II"; }
        else if ("Lenovo Z2".equals(model)) { return "Lenovo Z2"; }
        else if ("Lenovo A860e".equals(model)) { return "Lenovo A860e"; }
        else if ("LG-MS910".equals(model)) { return "LG Esteem"; }
        else if ("Lenovo TAB 2 A7-30H".equals(model)) { return "Lenovo A7-30H"; }
        else if ("Lenovo TAB 2 A7-30D".equals(model)) { return "Lenovo A7-30H"; }
        else if ("LG-D610AR".equals(model)) { return "LGE G2 MINI"; }
        else if ("LG-D335E".equals(model)) { return "LGE L Bello"; }
        else if ("Lenovo S858t".equals(model)) { return "Lenovo S858t"; }
        else if ("LG-P698f".equals(model)) { return "LGE Optimus Net Dual"; }
        else if ("LG-X190".equals(model)) { return "LGE LG RAY"; }
        else if ("LED40L288".equals(model)) { return "Hisense LED40L288"; }
        else if ("LED50K260X3D".equals(model)) { return "Hisense LED50K260X3D"; }
        else if ("LG-V700WJ".equals(model)) { return "LGE G Pad 10.1"; }
        else if ("LG-H961AN".equals(model)) { return "LGE V10"; }
        else if ("Lenovo K52t38".equals(model)) { return "Lenovo K52t38"; }
        else if ("LNV-Lenovo A560".equals(model)) { return "Lenovo A560"; }
        else if ("LG-D690n".equals(model)) { return "LGE G3 Stylus"; }
        else if ("LC-S3H-01".equals(model)) { return "Sharp LC-S3H-01"; }
        else if ("LT-8001".equals(model)) { return "Lyf LT-8001"; }
        else if ("LG-X135".equals(model)) { return "LGE L60"; }
        else if ("Lenovo TAB S8-50F".equals(model)) { return "Lenovo TAB S8-50F"; }
        else if ("LG-D375".equals(model)) { return "LGE LG L80 Single"; }
        else if ("LG-D370".equals(model)) { return "LGE LG L80 Single"; }
        else if ("LG-D373".equals(model)) { return "LGE LG L80 Single"; }
        else if ("Leopard MF800".equals(model)) { return "ZTE Leopard MF800"; }
        else if ("LG-D213".equals(model)) { return "LGE L50 Sporty"; }
        else if ("Lenovo TAB 2 A7-30HC".equals(model)) { return "Lenovo TAB 2 A7-30HC"; }
        else if ("Lenovo A529".equals(model)) { return "Lenovo A529"; }
        else if ("LG-F500S".equals(model)) { return "LGE LG G4"; }
        else if ("Lenovo A526".equals(model)) { return "Lenovo A526"; }
        else if ("LED58K610X3D".equals(model)) { return "Hisense LED58K610X3D"; }
        else if ("Lenovo A3500-HV".equals(model)) { return "Lenovo A3500"; }
        else if ("LG-P940h".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("L-06C".equals(model)) { return "LGE Optimus Pad"; }
        else if ("LG-X210".equals(model)) { return "LGE LG K7"; }
        else if ("LG-V510".equals(model)) { return "LGE LG G Pad 8.3 Google Play Edition"; }
        else if ("Lenovo A7010a48".equals(model)) { return "Lenovo VIBE X3 Lite"; }
        else if ("LenovoTV 32A3".equals(model)) { return "Lenovo 32A3   40A3   43A3   49A3"; }
        else if ("LG-K430".equals(model)) { return "LGE LG K10 LTE"; }
        else if ("Lenovo A680_ROW".equals(model)) { return "Lenovo A680"; }
        else if ("LIFETAB_S1033X".equals(model)) { return "Medion LIFETAB S1033X"; }
        else if ("LG-H440".equals(model)) { return "LGE LG Spirit LTE"; }
        else if ("LG-P990hN".equals(model)) { return "LGE Optimus 2X"; }
        else if ("LG-C660R".equals(model)) { return "LGE Optimus Pro"; }
        else if ("LG-C660h".equals(model)) { return "LGE Optimus Pro"; }
        else if ("Lenovo B8080-F".equals(model)) { return "Lenovo B8080"; }
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
        else if ("Lenovo Z90".equals(model)) { return "Lenovo Z90/VIBE Shot"; }
        else if ("LG-E612f".equals(model)) { return "LGE Optimus L5"; }
        else if ("LG-E612g".equals(model)) { return "LG Optimus L5 Dual"; }
        else if ("Lenovo K51c78".equals(model)) { return "Lenovo VIBE X3 Lite"; }
        else if ("Lenovo A7020a48".equals(model)) { return "Lenovo K5 Note"; }
        else if ("LGV31".equals(model)) { return "LGE LG G3"; }
        else if ("LG-E510".equals(model)) { return "LGE Optimus Hub"; }
        else if ("LGMS500".equals(model)) { return "LG Optimus F6"; }
        else if ("LAP255U".equals(model)) { return "LGU+ tvG woofer"; }
        else if ("LG-H820PR".equals(model)) { return "LGE LG G5"; }
        else if ("LG-VM696".equals(model)) { return "LG Optimus Elite"; }
        else if ("LG-D393".equals(model)) { return "LGE F60"; }
        else if ("LG-D392".equals(model)) { return "LGE F60"; }
        else if ("LG-D390".equals(model)) { return "LGE F60"; }
        else if ("LT15a".equals(model)) { return "Sony Ericsson Xperia arc"; }
        else if ("LT15i".equals(model)) { return "Sony Ericsson Xperia arc"; }
        else if ("LG-P655K".equals(model)) { return "LGE Optimus F3"; }
        else if ("Lenovo S660".equals(model)) { return "Lenovo S660"; }
        else if ("LG-K410".equals(model)) { return "LGE LG K9"; }
        else if ("LNV-Lenovo A370e".equals(model)) { return "Lenovo A370e"; }
        else if ("LT30at".equals(model)) { return "Sony Ericsson Xperia T"; }
        else if ("LED65XT900G3DU".equals(model)) { return "Hisense LED65XT900G3DU"; }
        else if ("LG-D390AR".equals(model)) { return "LGE F60"; }
        else if ("LED50K380U".equals(model)) { return "Hisense LED50K380U"; }
        else if ("LG-F350S".equals(model)) { return "LGE G Pro2"; }
        else if ("LG-KH5200".equals(model)) { return "LGE Eve"; }
        else if ("LG-F350K".equals(model)) { return "LGE G Pro2"; }
        else if ("LG-F350L".equals(model)) { return "LGE G Pro2"; }
        else if ("LG-H788SG".equals(model)) { return "LGE LG AKA"; }
        else if ("LGV32".equals(model)) { return "LGE LG G4"; }
        else if ("LCD-V3A".equals(model)) { return "Sharp LCD-V3A"; }
        else if ("LG-P875".equals(model)) { return "LGE Optimus F5"; }
        else if ("LG-E467f".equals(model)) { return "LGE LG Optimus L4 II Dual"; }
        else if ("LCD-LX560A".equals(model)) { return "Sharp LCD-LX560A"; }
        else if ("LG-E610v".equals(model)) { return "LGE Optimus L5"; }
        else if ("LenovoA3300-HV".equals(model)) { return "Lenovo A3300"; }
        else if ("LG-E510g".equals(model)) { return "LGE Optimus Hub"; }
        else if ("LG-E510f".equals(model)) { return "LGE Optimus Hub"; }
        else if ("Le X820".equals(model)) { return "Leeco Le Max2"; }
        else if ("LIFETAB_E10320".equals(model)) { return "Medion LIFETAB E10320"; }
        else if ("LG-LU5400".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("LTB-HS".equals(model)) { return "NEC LifeTouch B"; }
        else if ("Le X821".equals(model)) { return "Leeco Le Max2"; }
        else if ("LG-P930".equals(model)) { return "LGE Optimus LTE"; }
        else if ("LED65XT900X3DU".equals(model)) { return "Hisense LED65XT900X3DU"; }
        else if ("LUVO 001L".equals(model)) { return "LUVO-001L"; }
        else if ("LG-D625".equals(model)) { return "LGE G2 mini 4G LTE"; }
        else if ("LG-D175f".equals(model)) { return "LGE Optimus L40"; }
        else if ("LG-D620".equals(model)) { return "LG G2 Mini"; }
        else if ("LGL23".equals(model)) { return "LGE LG G Flex"; }
        else if ("LGL21".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LGL24".equals(model)) { return "LGE LG G3"; }
        else if ("London".equals(model)) { return "Marshall London"; }
        else if ("L-ITE 552".equals(model)) { return "Logicom L-ITE552"; }
        else if ("LG-LS720".equals(model)) { return "LG Optimus F3"; }
        else if ("Lenovo A560".equals(model)) { return "Lenovo A560"; }
        else if ("LED50K610X3D".equals(model)) { return "Hisense LED50K610X3D"; }
        else if ("LG-D722J".equals(model)) { return "LGE G3 Beat"; }
        else if ("LG-P870".equals(model)) { return "LGE Optimus  LTE"; }
        else if ("Lenovo A3600-d".equals(model)) { return "Lenovo A3600-D"; }
        else if ("LG-VS700PP".equals(model)) { return "LGE LG Enlighten"; }
        else if ("LNV-Lenovo A395e".equals(model)) { return "Lenovo A395e"; }
        else if ("Lenovo A369".equals(model)) { return "Lenovo A369"; }
        else if ("LC-50UE1H".equals(model)) { return "Sharp LC-50UE1H"; }
        else if ("LC-50UE1M".equals(model)) { return "Sharp LC-50UE1M"; }
        else if ("LG-F700S".equals(model)) { return "LGE LG G5"; }
        else if ("LG-F700K".equals(model)) { return "LGE LG G5"; }
        else if ("LG-VS410PP".equals(model)) { return "LGE Optimus Zone"; }
        else if ("LG-F700L".equals(model)) { return "LGE LG G5"; }
        else if ("Lenovo S856".equals(model)) { return "Lenovo S856"; }
        else if ("LCD-UF30A".equals(model)) { return "Sharp LCD-UF30A"; }
        else if ("LG-V940".equals(model)) { return "LGE LG G Pad II 10.1 FHD"; }
        else if ("Lenovo K900_ROW".equals(model)) { return "Lenovo K900"; }
        else if ("Linx PS474S".equals(model)) { return "Cellon Linx PS474S"; }
        else if ("LED42K660X3D".equals(model)) { return "Hisense LED42K660X3D"; }
        else if ("LG-H788n".equals(model)) { return "LGE LG AKA"; }
        else if ("L35h".equals(model)) { return "Sony Xperia ZL"; }
        else if ("LIFETAB_E732X".equals(model)) { return "Medion LIFETAB E732X"; }
        else if ("LG-SU540".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("LNV-Lenovo A505e".equals(model)) { return "Lenovo A505e"; }
        else if ("LG-T540".equals(model)) { return "LGE LG Magna"; }
        else if ("LG-D605".equals(model)) { return "LGE LG Optimus L9 II"; }
        else if ("LG-F200L".equals(model)) { return "LGE Optimus Vu2"; }
        else if ("LG-F200S".equals(model)) { return "LGE Optimus Vu2"; }
        else if ("LG-D320AR".equals(model)) { return "LGE L70"; }
        else if ("LED55XT900X3DU".equals(model)) { return "Hisense LED55XT900X3DU"; }
        else if ("LG-P940".equals(model)) { return "LGE PRADA 3.0"; }
        else if ("LG-AS811".equals(model)) { return "LGE LG G4"; }
        else if ("LGL22".equals(model)) { return "LGE LGL22"; }
        else if ("Lenovo PB1-750M".equals(model)) { return "Lenovo PB1-750M/Lenovo PHAB"; }
        else if ("LC-A1H".equals(model)) { return "Sharp LC-A1H"; }
        else if ("LT668".equals(model)) { return "Hisense EG68AE"; }
        else if ("LED55K260X3D".equals(model)) { return "Hisense LED55K260X3D"; }
        else if ("LG-P725".equals(model)) { return "LGE Optimus 3D MAX"; }
        else if ("LGL81AL".equals(model)) { return "LGE LG Stylo 2"; }
        else if ("LG-C660".equals(model)) { return "LGE Optimus Pro"; }
        else if ("LGUS550".equals(model)) { return "LGE LG Logos"; }
        else if ("LG-P509".equals(model)) { return "LG Optimus T"; }
        else if ("LED32K280J3D".equals(model)) { return "Hisense LED32K280J3D"; }
        else if ("LED65XT810X3DU".equals(model)) { return "Hisense LED65XT810X3DU"; }
        else if ("LED46K260X3D".equals(model)) { return "Hisense LED46K260X3D"; }
        else if ("LED50XT880G3DU".equals(model)) { return "Hisense LED50XT880G3DU"; }
        else if ("LePanII".equals(model)) { return "Anydata LePanII"; }
        else if ("Lenovo B8080-HV".equals(model)) { return "Lenovo B8080-HV"; }
        else if ("LED32K610X3D".equals(model)) { return "Hisense LED32K610X3D"; }
        else if ("LED42K360X3D".equals(model)) { return "Hisense LED42K360X3D"; }
        else if ("LG-P690f".equals(model)) { return "LGE Optimus Spirit"; }
        else if ("LG-P690b".equals(model)) { return "LGE Optimus Net"; }
        else if ("LS670".equals(model)) { return "LG Optimus S"; }
        else if ("LG-F490L".equals(model)) { return "LGE G3 Screen"; }
        else if ("LG-P355".equals(model)) { return "LGE PecanV"; }
        else if ("LG-P350".equals(model)) { return "LGE LG Pecan"; }
        else if ("Lenovo A5500-F".equals(model)) { return "Lenovo A5500-F"; }
        else if ("Lenovo A5500-H".equals(model)) { return "Lenovo A5500-H"; }
        else if ("LG-F650L".equals(model)) { return "LGE LG X screen"; }
        else if ("LG-F650S".equals(model)) { return "LGE LG X screen"; }
        else if ("LCD-LX460A".equals(model)) { return "Sharp LCD-LX460A"; }
        else if ("LG-C710h".equals(model)) { return "LGE Shine Plus with Google"; }
        else if ("LG-E415g".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("Lenovo A808t-i".equals(model)) { return "Lenovo A808t-i"; }
        else if ("LG-P875h".equals(model)) { return "LGE Optimus F5"; }
        else if ("Lenovo A396".equals(model)) { return "Lenovo A396"; }
        else if ("LIFETAB_P9514".equals(model)) { return "Medion Lifetab P9514"; }
        else if ("LGAS995".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LG-X160".equals(model)) { return "LGE LG Max"; }
        else if ("LGAS992".equals(model)) { return "LGE LG G5"; }
        else if ("LG-LS980".equals(model)) { return "LG G2"; }
        else if ("Lenovo S658t".equals(model)) { return "Lenovo S658t"; }
        else if ("Lenovo A858".equals(model)) { return "Lenovo A828"; }
        else if ("Lenovo A859".equals(model)) { return "Lenovo A859"; }
        else if ("Lenovo A328".equals(model)) { return "Lenovo A328"; }
        else if ("Lenovo A850".equals(model)) { return "Lenovo A850"; }
        else if ("LG-E455".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-E450".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG Optimus Elite".equals(model)) { return "LGE LG Optimus Elite"; }
        else if ("LED39K610X3D".equals(model)) { return "Hisense LED39K610X3D"; }
        else if ("LG-V909".equals(model)) { return "LGE Optimus Pad"; }
        else if ("LG-V900".equals(model)) { return "LGE Optimus Pad"; }
        else if ("LG-V901".equals(model)) { return "LGE Optimus Pad"; }
        else if ("LG-D340f8".equals(model)) { return "LGE L70"; }
        else if ("LG-AS990".equals(model)) { return "LGE LG G3"; }
        else if ("LT25i".equals(model)) { return "Sony Xperia V"; }
        else if ("Lenovo A616".equals(model)) { return "Lenovo A616"; }
        else if ("LIFETAB_S831X".equals(model)) { return "Medion LIFETAB S831X"; }
        else if ("LG-D100".equals(model)) { return "LGE L20"; }
        else if ("LG-KU5900".equals(model)) { return "LGE Optimus Black"; }
        else if ("LIFETAB_S785X".equals(model)) { return "Medion LIFETAB S785X"; }
        else if ("LG-F160LV".equals(model)) { return "LGE LG optimus LTE2"; }
        else if ("L50".equals(model)) { return "Haier L50"; }
        else if ("L52".equals(model)) { return "Haier L52"; }
        else if ("L55".equals(model)) { return "Inhon L55"; }
        else if ("LG-H900PR".equals(model)) { return "LGE V10"; }
        else if ("Le X507".equals(model)) { return "LeTV Le X507"; }
        else if ("Le X509".equals(model)) { return "LeTV Le X507"; }
        else if ("LG-H968".equals(model)) { return "LGE V10"; }
        else if ("LG-H960".equals(model)) { return "LGE V10"; }
        else if ("LG-P970".equals(model)) { return "LGE Optimus Black"; }
        else if ("LC-55LE860M".equals(model)) { return "Sharp LC-55LE860M"; }
        else if ("LC-55LE860H".equals(model)) { return "Sharp LC-55LE860H"; }
        else if ("LG-E435g".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LED58XT880G3D".equals(model)) { return "Hisense LED58XT880G3D"; }
        else if ("L-EMENT 740".equals(model)) { return "Logicom LEMENT TAB 740"; }
        else if ("LEMENT_TAB901".equals(model)) { return "Logicom LEMENTTAB901"; }
        else if ("LG-X147".equals(model)) { return "LGE L60"; }
        else if ("LG-X145".equals(model)) { return "LGE L60"; }
        else if ("LG-F320K".equals(model)) { return "LGE LG G2"; }
        else if ("LGL43AL".equals(model)) { return "LGE LG Rebel"; }
        else if ("LG-F240K".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-F240L".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-F240S".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-F400L".equals(model)) { return "LGE LG G3"; }
        else if ("LG-F400K".equals(model)) { return "LGE LG G3"; }
        else if ("LG-F400S".equals(model)) { return "LGE LG G3"; }
        else if ("LED55XT880G3DU".equals(model)) { return "Hisense LED55XT880G3DU"; }
        else if ("Lenovo P780_ROW".equals(model)) { return "Lenovo P780"; }
        else if ("LG-F720K".equals(model)) { return "LGE LG Stylus 2"; }
        else if ("LG-F720L".equals(model)) { return "LGE LG Stylus 2"; }
        else if ("LG-F720S".equals(model)) { return "LGE LG Stylus 2"; }
        else if ("LG-V400Y7".equals(model)) { return "LGE G Pad 7.0"; }
        else if ("LT-W1".equals(model)) { return "Hisense E100TAE"; }
        else if ("Lenovo A788t".equals(model)) { return "Lenovo A788t"; }
        else if ("Lenovo A708t".equals(model)) { return "Lenovo"; }
        else if ("LG-K535n".equals(model)) { return "LGE LG Stylus2 Plus"; }
        else if ("Lenovo S6000L-F".equals(model)) { return "Lenovo S6000L"; }
        else if ("Lenovo A628t".equals(model)) { return "Lenovo A628t"; }
        else if ("Lenovo_A2105".equals(model)) { return "Lenovo A2105"; }
        else if ("Lenovo K50-t5".equals(model)) { return "Lenovo K50"; }
        else if ("LC-LX565H".equals(model)) { return "Sharp LC-LX565H"; }
        else if ("Lenovo B6000-HV".equals(model)) { return "Lenovo B6000-HV"; }
        else if ("LS-5506".equals(model)) { return "Reliance LS-5506"; }
        else if ("LG-H525n".equals(model)) { return "LGE LG G4c"; }
        else if ("LG-E985T".equals(model)) { return "LGE LG-E985T"; }
        else if ("LED40K360J".equals(model)) { return "Hisense LED40K360J"; }
        else if ("Lenovo Z90a40".equals(model)) { return "Lenovo Z90a40/VIBE Shot"; }
        else if ("LG-D693AR".equals(model)) { return "LGE G3 Stylus"; }
        else if ("Lenovo K860".equals(model)) { return "Lenovo K860"; }
        else if ("LT-NA7".equals(model)) { return "NEC LifeTouch Note"; }
        else if ("Lenovo A916".equals(model)) { return "Lenovo A916"; }
        else if ("LG-E411g".equals(model)) { return "LG Optimus L1 II"; }
        else if ("LG-E411f".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LT680".equals(model)) { return "QMobile LT680"; }
        else if ("LG-H848".equals(model)) { return "LGE LG G5 SE"; }
        else if ("LG-H845".equals(model)) { return "LGE LG G5 SE"; }
        else if ("LG-H840".equals(model)) { return "LGE LG G5 SE"; }
        else if ("LG-D125".equals(model)) { return "LGE L30 Sporty"; }
        else if ("LG-D120".equals(model)) { return "LGE L30 Sporty"; }
        else if ("Lenovo TAB 2 A8-50L".equals(model)) { return "Lenovo A8-50"; }
        else if ("Lenovo S686".equals(model)) { return "Lenovo S686"; }
        else if ("Lenovo TAB 2 A8-50F".equals(model)) { return "Lenovo TAB 2 A8-50F"; }
        else if ("Lenovo S680".equals(model)) { return "Lenovo S680"; }
        else if ("LI12210IN".equals(model)) { return "Auchan LI12210IN"; }
        else if ("L-EMENT501".equals(model)) { return "Logicom L-EMENT501"; }
        else if ("LG-E410".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LGMS428".equals(model)) { return "LGE LG K10"; }
        else if ("LGMS395".equals(model)) { return "LG Optimus F60"; }
        else if ("Lenovo A816".equals(model)) { return "Lenovo A816"; }
        else if ("LG-E985".equals(model)) { return "LGE LG-E985T"; }
        else if ("LG-E986".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LG-UK495".equals(model)) { return "LGE LG G Pad F 8.0"; }
        else if ("LG-D375AR".equals(model)) { return "LGE LG L80 Single"; }
        else if ("Lenovo A720e".equals(model)) { return "Lenovo A720e"; }
        else if ("LED42K610X3D".equals(model)) { return "Hisense LED42K610X3D"; }
        else if ("LG-P895".equals(model)) { return "LGE Optimus Vu"; }
        else if ("Leopard MF900".equals(model)) { return "ZTE V807"; }
        else if ("LG-V490".equals(model)) { return "LGE G pad 8.0 LTE"; }
        else if ("LG-V496".equals(model)) { return "LGE LG G Pad F 8.0"; }
        else if ("LG-V497".equals(model)) { return "LGE LG G Pad II 8.0LTE"; }
        else if ("LG-V495".equals(model)) { return "LGE LG G Pad F 8.0"; }
        else if ("LG-V498".equals(model)) { return "LGE G Pad II 8.0"; }
        else if ("LG-V499".equals(model)) { return "LGE LG G Pad F 8.0"; }
        else if ("Lenovo A6000".equals(model)) { return "Lenovo A6000"; }
        else if ("LG Android TV V4".equals(model)) { return "LGE GA7800"; }
        else if ("LED65XT880G3D".equals(model)) { return "Hisense LED65XT880G3D"; }
        else if ("LG-F370L".equals(model)) { return "LGE LG F70"; }
        else if ("LED48K360X3D".equals(model)) { return "Hisense LED48K360X3D"; }
        else if ("Lenovo K50-T5".equals(model)) { return "Lenovo K50"; }
        else if ("L10".equals(model)) { return "Camelus L10"; }
        else if ("LED40K360X3D".equals(model)) { return "Hisense LED40K360X3D"; }
        else if ("LG-E475f".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-P936".equals(model)) { return "LGE Optimus LTE"; }
        else if ("LG-P935".equals(model)) { return "LGE Optimus LTE"; }
        else if ("LG-H868".equals(model)) { return "LGE LG G5"; }
        else if ("LG-H860".equals(model)) { return "LGE LG G5"; }
        else if ("LG-D107".equals(model)) { return "LGE L20"; }
        else if ("LG-D105".equals(model)) { return "LGE L20"; }
        else if ("LG-E975T".equals(model)) { return "LGE LG Optimus G"; }
        else if ("LG-E975K".equals(model)) { return "LGE LG Optimus G"; }
        else if ("Lenovo A830".equals(model)) { return "Lenovo A830"; }
        else if ("LG-E975w".equals(model)) { return "LGE Optimus GJ"; }
        else if ("Lenovo S850".equals(model)) { return "Lenovo S850"; }
        else if ("LG-E435".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LG-E430".equals(model)) { return "LGE LG Optimus L3 II"; }
        else if ("LG-E455f".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LS-4004".equals(model)) { return "Hipstreet LS-4004"; }
        else if ("LG-P999".equals(model)) { return "LG G2X P999"; }
        else if ("Life".equals(model)) { return "NGM Italia SRL LIFE"; }
        else if ("LED55K600A3D".equals(model)) { return "Hisense LED55K600A3D"; }
        else if ("LG Watch Urbane".equals(model)) { return "LGE LG Watch Urbane 2nd Edition LTE"; }
        else if ("LGLS751".equals(model)) { return "LGE LG Volt II"; }
        else if ("LED32K360".equals(model)) { return "Hisense LED32K360"; }
        else if ("LS-4008".equals(model)) { return "Reliance LS-4008"; }
        else if ("Lenovo TAB 2 A8-50LC".equals(model)) { return "Lenovo A8-50"; }
        else if ("LG-LU6500".equals(model)) { return "LGE Optimus Q2"; }
        else if ("LED58K680X3DU".equals(model)) { return "Hisense LED58K680X3DU"; }
        else if ("LS-5017".equals(model)) { return "Hipstreet LS-5017"; }
        else if ("LG-P705f".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LG-P705g".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("Lenovo S720".equals(model)) { return "Lenovo S720"; }
        else if ("LaVieTab PC-TE508S1".equals(model)) { return "NEC LaVieTab PC-TE508S1W/LaVieTab PC-TE508S1L"; }
        else if ("L-ITE 502 PLUS".equals(model)) { return "Logicom L-ITE 502 PLUS"; }
        else if ("LNV-Lenovo A380e".equals(model)) { return "Lenovo A380e"; }
        else if ("Lenovo P70-t".equals(model)) { return "Lenovo P70"; }
        else if ("LBOX500".equals(model)) { return "Lexibook Playdroid"; }
        else if ("LG-F100S".equals(model)) { return "LGE Optimus Vu"; }
        else if ("LG-F100L".equals(model)) { return "LGE Optimus Vu"; }
        else if ("L681".equals(model)) { return "Hisense L681"; }
        else if ("LG-E610".equals(model)) { return "LG Optimus L5"; }
        else if ("LED42K330X3D".equals(model)) { return "Hisense LED42K330X3D"; }
        else if ("LG-F340S".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-F340K".equals(model)) { return "LGE LG G Flex"; }
        else if ("LG-F340L".equals(model)) { return "LGE LG G Flex"; }
        else if ("LED40K370".equals(model)) { return "Hisense LED40K370"; }
        else if ("LT971".equals(model)) { return "hisense lt971"; }
        else if ("LG-F580L".equals(model)) { return "LGE Gentle"; }
        else if ("Lenovo K900".equals(model)) { return "Lenovo K900"; }
        else if ("LG-H950".equals(model)) { return "LGE LG G Flex2"; }
        else if ("LED46K280J3D".equals(model)) { return "Hisense LED46K280J3D"; }
        else if ("Lenovo A7-60HC".equals(model)) { return "Lenovo A7-60HC"; }
        else if ("LG-L38C".equals(model)) { return "LGE LG Optimus L3"; }
        else if ("LG-D331AR".equals(model)) { return "LGE LBello"; }
        else if ("LG-D160".equals(model)) { return "LGE Optimus L40"; }
        else if ("LG-D165".equals(model)) { return "LGE Optimus L40"; }
        else if ("Lenovo S968t".equals(model)) { return "Lenovo S968t"; }
        else if ("LED55K680X3DU".equals(model)) { return "Hisense LED55K680X3DU"; }
        else if ("Le Pan TC1020".equals(model)) { return "Le Pan TC1020"; }
        else if ("LG-H222".equals(model)) { return "LGE LG Joy"; }
        else if ("LG-K121".equals(model)) { return "LGE K4"; }
        else if ("LG-K120".equals(model)) { return "LGE LG K4 LTE"; }
        else if ("LG-H731".equals(model)) { return "LGE G4 vigor"; }
        else if ("LG-H734".equals(model)) { return "LGE LG G4s"; }
        else if ("LG-H736".equals(model)) { return "LGE LG G4 Beat"; }
        else if ("LenovoA588t".equals(model)) { return "Lenovo A588t"; }
        else if ("LG-D838".equals(model)) { return "LGE G Pro2"; }
        else if ("LNV-Lenovo A780e".equals(model)) { return "Lenovo A780e"; }
        else if ("LG-SU370".equals(model)) { return "LGE Optimus One"; }
        else if ("Lenovo 2 A8-50LC".equals(model)) { return "Lenovo A8-50"; }
        else if ("LC-xxLE570X".equals(model)) { return "Sharp LC-50LE570X"; }
        else if ("LGLS775".equals(model)) { return "LGE LG Stylo 2"; }
        else if ("LGLS770".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-V400S1".equals(model)) { return "LGE G Pad 7.0"; }
        else if ("Lenovo S90-e".equals(model)) { return "Lenovo S90"; }
        else if ("LED40K681X3DU".equals(model)) { return "Hisense LED40K681X3DU"; }
        else if ("LG-LG730".equals(model)) { return "LG Venice"; }
        else if ("LT700".equals(model)) { return "QMobile LT700"; }
        else if ("LGL22C".equals(model)) { return "LGE LG Power"; }
        else if ("Lenovo A316".equals(model)) { return "Lenovo A316"; }
        else if ("LG-LS840".equals(model)) { return "LG Viper"; }
        else if ("LG-D725".equals(model)) { return "LGE G3 Vigor"; }
        else if ("Lenovo S60-t".equals(model)) { return "Lenovo S60"; }
        else if ("Lenovo S60-a".equals(model)) { return "Lenovo S60"; }
        else if ("L-02E".equals(model)) { return "LGE Optimus LIFE"; }
        else if ("LG-P970h".equals(model)) { return "LGE Optimus Black"; }
        else if ("LG-P970g".equals(model)) { return "LGE Optimus Black"; }
        else if ("Lenovo Z90-7".equals(model)) { return "Lenovo Z90/VIBE Shot"; }
        else if ("LED50XT900X3DU".equals(model)) { return "Hisense LED50XT900X3DU"; }
        else if ("Lenovo Z2w".equals(model)) { return "Lenovo Z2w"; }
        else if ("LG-E405".equals(model)) { return "LGE LG Optimus L3 Dual"; }
        else if ("LG-AS680".equals(model)) { return "LGE Optimus 2"; }
        else if ("Lenovo S850e".equals(model)) { return "Lenovo S850e"; }
        else if ("LG-P925".equals(model)) { return "LGE Thrill 4G"; }
        else if ("Lenovo A606".equals(model)) { return "Lenovo A606"; }
        else if ("L-EMENT_TAB1042".equals(model)) { return "Logicom LEMENTTAB1042"; }
        else if ("L-EMENT_TAB1040".equals(model)) { return "Logicom L-EMENT TAB 1040"; }
        else if ("LG-H812".equals(model)) { return "LGE LG G4"; }
        else if ("LaVieTab PC-TE510N1B".equals(model)) { return "NEC PC-TE510N1B"; }
        else if ("LE32U5000A".equals(model)) { return "Haier LE32U5000A"; }
        else if ("Lenovo S90-L".equals(model)) { return "Lenovo S90-L"; }
        else if ("LNV-Lenovo A305e".equals(model)) { return "Lenovo A305E"; }
        else if ("LED65K560J3DTR".equals(model)) { return "Hisense LED65K560J3DTR"; }
        else if ("LCD-LX565A-B".equals(model)) { return "Sharp LCD-LX565A"; }
        else if ("Lenovo A355e".equals(model)) { return "Lenovo A355e"; }
        else if ("LED65K560J3DTB".equals(model)) { return "Hisense LED65K560J3DTB"; }
        else if ("LED39K680X3DU".equals(model)) { return "Hisense LED39K680X3DU"; }
        else if ("LG-F200K".equals(model)) { return "LGE Optimus Vu2"; }
        else if ("LG-D858".equals(model)) { return "LGE LG G3"; }
        else if ("LG-D859".equals(model)) { return "LGE LG G3"; }
        else if ("LG-D850".equals(model)) { return "LG G3"; }
        else if ("LG-D851".equals(model)) { return "LG G3"; }
        else if ("LG-D855".equals(model)) { return "LG G3"; }
        else if ("LG-D856".equals(model)) { return "LGE LG G3"; }
        else if ("LG-D857".equals(model)) { return "LGE LG G3"; }
        else if ("LGMS330".equals(model)) { return "LGE LG M1"; }
        else if ("LG-D700".equals(model)) { return "LGE LG Optimus L9"; }
        else if ("LG-K500".equals(model)) { return "LGE LG X screen"; }
        else if ("LGL96G".equals(model)) { return "LGE LG Optimus L7"; }
        else if ("LG-D693TR".equals(model)) { return "LGE G3 Stylus"; }
        else if ("LG-E450B".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("Lenovo A278t".equals(model)) { return "Lenovo A278t"; }
        else if ("LG-D802T".equals(model)) { return "LGE LG G2"; }
        else if ("LG-E450f".equals(model)) { return "LGE LG Optimus L5 II"; }
        else if ("LG-E405f".equals(model)) { return "LGE LG Optimus L3 Dual"; }
        else if ("Lenovo A820e".equals(model)) { return "Lenovo A820e"; }
        else if ("Lenovo A378t".equals(model)) { return "Lenovo A378t"; }
        else if ("LG-MS840".equals(model)) { return "LGE LG Connect 4G"; }
        else if ("Lenovo A820t".equals(model)) { return "Lenovo A820t"; }
        else if ("LG-US730".equals(model)) { return "LGE Splendor"; }
        else if ("LG-D285".equals(model)) { return "LGE L65"; }
        else if ("LG-D280".equals(model)) { return "LGE L65"; }
        else if ("LED50L288".equals(model)) { return "Hisense LED50L288"; }
        else if ("LGL75C".equals(model)) { return "LGE LG OPTIMUS ZIP"; }
        else if ("LG-P895qb".equals(model)) { return "LGE Optimus Vu"; }
        else if ("LG-E981h".equals(model)) { return "LGE LG Optimus G Pro"; }
        else if ("LS-5010".equals(model)) { return "Reliance Smartphone JS LS-5010"; }
        else if ("LS-5016".equals(model)) { return "Lyf LS-5016"; }
        else if ("LS-5014".equals(model)) { return "Reliance LS-5014"; }
        else if ("L39u".equals(model)) { return "Sony Xperia Z1"; }
        else if ("Lenovo A360t".equals(model)) { return "Lenovo A360t"; }
        else if ("Lenovo K80M".equals(model)) { return "Lenovo K80M"; }
        else if ("LG-D390n".equals(model)) { return "LGE F60"; }
        else if ("Lenovo K800".equals(model)) { return "Lenovo K800"; }
        else if ("LED50XT880G3D".equals(model)) { return "Hisense LED50XT880G3D"; }
        else if ("Lenovo TB3-710F".equals(model)) { return "Lenovo TB3-710F"; }
        else if ("LED42K280J3D".equals(model)) { return "Hisense LED42K280J3D"; }
        else if ("Lenovo P70-A".equals(model)) { return "Lenovo P70"; }
        else if ("LG Google TV".equals(model)) { return "LGE Android TV"; }
        else if ("LG-H779".equals(model)) { return "LGE LG AKA"; }
        else if ("LG-H778".equals(model)) { return "LGE LG AKA"; }
        else if ("LG-V700".equals(model)) { return "LGE G Pad 10.1"; }
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
        else if ("Lenovo A390_ROW".equals(model)) { return "Lenovo A390"; }
        else if ("LIFETAB_P891X".equals(model)) { return "Medion LIFETAB P891X"; }
        else if ("LG-D100AR".equals(model)) { return "LGE L20"; }
        else if ("LG GW620".equals(model)) { return "LGE Eve"; }
        else if ("LGLS620".equals(model)) { return "LGE L70"; }
        else if ("LGLS660".equals(model)) { return "LG Tribute LS660"; }
        else if ("LG-V410".equals(model)) { return "LG G Pad 7.0"; }
        else if ("Lenovo A3900".equals(model)) { return "Lenovo A3900"; }
        else if ("LG-D682TR".equals(model)) { return "LGE G Pro Lite"; }
        else if ("Lenovo A688t".equals(model)) { return "Lenovo A688t"; }
        else if ("Lenovo A2800-d".equals(model)) { return "Lenovo A2800"; }
        else if ("L-01E".equals(model)) { return "LGE LG Optimus G"; }
        else if ("L-01F".equals(model)) { return "G2"; }
        else if ("LGLS740".equals(model)) { return "LG Volt"; }
        else if ("LGMS769".equals(model)) { return "LG Optimus L9"; }
        else if ("Lenovo A936".equals(model)) { return "Lenovo A936"; }
        else if ("LG-US670".equals(model)) { return "LGE Optimus One"; }
        else if ("LG-D325".equals(model)) { return "LGE L70"; }
        else if ("LGL16C".equals(model)) { return "LGE Y25"; }
        else if ("LG-E420f".equals(model)) { return "LGE LG Optimus L1II"; }
        else if ("LG-D321".equals(model)) { return "LGE LG Optimus L70"; }
        else if ("llium Pad L8".equals(model)) { return "Lanix llium Pad L8"; }
        else if ("Lenovo N300".equals(model)) { return "Lenovo N300"; }
        else if ("Lenovo N308".equals(model)) { return "Lenovo N308"; }
        else if ("Lenovo S930".equals(model)) { return "Lenovo S930_ROW"; }
        else if ("Lenovo S939".equals(model)) { return "Lenovo S939"; }
        else if ("Lenovo A3000-H".equals(model)) { return "Lenovo A3000"; }
        else if ("Lenovo A390t".equals(model)) { return "Lenovo A390t"; }
        else if ("Lenovo A399".equals(model)) { return "Lenovo A399"; }
        else if ("L-05E".equals(model)) { return "LGE LG optimus it L-05E"; }
        else if ("Lenovo S668t".equals(model)) { return "Lenovo S668t"; }
        else if ("l9450".equals(model)) { return "Toshiba L9450"; }
        else if ("LG-P720".equals(model)) { return "LGE Optimus 3D MAX"; }
        else if ("Light".equals(model)) { return "ZTE V9"; }
        else if ("LG-K540".equals(model)) { return "LGE LG Stylo 2"; }
        else if ("LIFETAB_E7312".equals(model)) { return "Lenovo LIFETAB E7310"; }
        else if ("Lenovo 2 A7-30HC".equals(model)) { return "Lenovo TAB 2 A7-30HC"; }
        else if ("LED65K680X3DU".equals(model)) { return "Hisense LED65K680X3DU"; }
        else if ("Lenovo A680".equals(model)) { return "Lenovo A680"; }
        else if ("LG-P990H".equals(model)) { return "LGE Optimus 2X"; }
        else if ("Lenovo A368t".equals(model)) { return "Lenovo A368t"; }
        else if ("LG-P990h".equals(model)) { return "LGE Optimus 2X"; }
        else if ("LG-F310L".equals(model)) { return "LGE LG Gx"; }
        else if ("LG-H962".equals(model)) { return "LGE V10"; }
        else if ("LG-H630D".equals(model)) { return "LGE LG G Stylo"; }
        else if ("LG-F410S".equals(model)) { return "LGE LG G3 A"; }
        else if ("L-EMENT_TAB1040_BT".equals(model)) { return "Logicom L-EMENT_TAB1040_BT"; }
        else if ("LG-LU6200".equals(model)) { return "LGE Optimus LTE"; }
        else if ("LG-P655H".equals(model)) { return "LGE Optimus F3"; }
        else if ("LG-D852G".equals(model)) { return "LGE LG G3"; }
        else if ("Lenovo A360e".equals(model)) { return "Lenovo A360e"; }
        else if ("Lenovo A516".equals(model)) { return "Lenovo A516"; }
        else if ("L575".equals(model)) { return "Hyundai L575"; }
        else if ("LIXIR1041".equals(model)) { return "Logicom L-IXIR TAB 1041"; }
        else if ("Lenovo X3a40".equals(model)) { return "Lenovo X3a40"; }
        else if ("LG-H221".equals(model)) { return "LGE LG Joy"; }
        else if ("LG-H220".equals(model)) { return "LGE LG Joy"; }
        else if ("LG-SU660".equals(model)) { return "LGE Optimus 2X"; }
        else if ("LG Google TV G3 KR".equals(model)) { return "LGE Android TV"; }
        else if ("LED39K360X3D".equals(model)) { return "Hisense LED39K360X3D"; }
        else if ("Lenovo S860e".equals(model)) { return "Lenovo S860e"; }
        else if ("LED75XT890G3D".equals(model)) { return "Hisense LED75XT890G3D"; }
        else if ("LT100K6900A".equals(model)) { return "Hisense LT100K6900A"; }
        else if ("LNV-Lenovo K910e".equals(model)) { return "Lenovo K910e"; }
        else if ("LGL45C".equals(model)) { return "LGE Optimus Net"; }
        else if ("LG-D315l".equals(model)) { return "LGE LG F70"; }
        else if ("LE43U5000A".equals(model)) { return "Haier LE43U5000A"; }
        else if ("Lenovo TB3-850M".equals(model)) { return "Lenovo TAB 3 850M"; }
        else if ("Lenovo TB3-850F".equals(model)) { return "Lenovo TAB 3 850F"; }
        else if ("LGUS990".equals(model)) { return "LGE LG G3"; }
        else if ("LGUS991".equals(model)) { return "LGE LG G4"; }
        else if ("LGUS992".equals(model)) { return "LGE LG G5"; }
        else if ("LGUS995".equals(model)) { return "LGE LG G Flex2"; }
        else if ("Lenovo A269i".equals(model)) { return "Lenovo A269i"; }
        else if ("LG-D329".equals(model)) { return "LGE L70"; }
        else if ("LG-D320".equals(model)) { return "LGE L70"; }
        else if ("LAP250U".equals(model)) { return "LGU+ LAP250U"; }
        else if ("LNV-Lenovo S870e".equals(model)) { return "Lenovo S870e"; }
        else if ("LG-D221".equals(model)) { return "LGE L50 Sporty"; }
        else if ("LG-D227".equals(model)) { return "LGE L50 Sporty"; }
        else if ("L-05D".equals(model)) { return "LGE LG optimus it L-05D"; }
        else if ("LED46K660X3D".equals(model)) { return "Hisense LED46K660X3D"; }
        else if ("LED42K610J3DP".equals(model)) { return "Hisense LED42K610J3DP"; }
        else if ("LG-X220".equals(model)) { return "LGE LG K5"; }
        else if ("LED32K360X3D".equals(model)) { return "Hisense LED32K360X3D"; }
        else if ("LG-D722AR".equals(model)) { return "LGE G3 S"; }
        else if ("LG-LW770".equals(model)) { return "LGE LG Optimus Regard"; }
        else if ("Liquid".equals(model)) { return "Acer Liquid"; }
        else if ("Lenovo A5500-HV".equals(model)) { return "Lenovo A5500-HV"; }
        else if ("LG-VK700".equals(model)) { return "LGE G Pad 10.1 LTE"; }
        return "";

    }
    public static String oMethod (String model) {
        if ("ONE E1003".equals(model)) { return "OnePlus"; }
        else if ("Orange Roya".equals(model)) { return "Orange Roya"; }
        else if ("Orange Sego".equals(model)) { return "TCT (Alcatel) Orange_Sego"; }
        else if ("ONE_TOUCH_PIXI3D".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("one695_1_coho".equals(model)) { return "CloudFone Cloudpad One 6.95"; }
        else if ("Orange Tactile internet 2".equals(model)) { return "ZTE Blade"; }
        else if ("ONE TOUCH 4032A".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("OPPO R9 Plusm A".equals(model)) { return "Oppo R9PlusmA"; }
        else if ("OPPO A53m".equals(model)) { return "Oppo A53m"; }
        else if ("Omega HD 3".equals(model)) { return "Cherry Mobile Omega HD3"; }
        else if ("Orange Runo".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4030X"; }
        else if ("Orange Hi 4G".equals(model)) { return "ZTE Orange Hi 4G"; }
        else if ("ONE TOUCH 983".equals(model)) { return "TCT (Alcatel) ONE TOUCH 983"; }
        else if ("one7_0_4".equals(model)) { return "CloudFone Cloudpad One 7.0"; }
        else if ("ONE TOUCH 4016A".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4015X"; }
        else if ("ONE A2003".equals(model)) { return "OnePlus 2"; }
        else if ("OPPO R9".equals(model)) { return "OPPO R9"; }
        else if ("OCTA".equals(model)) { return "Positivo OCTA"; }
        else if ("Orange Tado".equals(model)) { return "ZTE Blade G Lux"; }
        else if ("OPPO R9 Plus A".equals(model)) { return "OPPO R9 Plus A"; }
        else if ("OC1020A".equals(model)) { return "3Q OC1020A"; }
        else if ("Optimus Barcelona".equals(model)) { return "ZTE Optimus Barcelona"; }
        else if ("OWN S4010".equals(model)) { return "TCT (Alcatel) OWN S4010"; }
        else if ("OT-990C".equals(model)) { return "TCT (Alcatel) OT-990C"; }
        else if ("one8_0_1".equals(model)) { return "CloudFone Cloudpad One 8.0"; }
        else if ("ONE TOUCH 960C".equals(model)) { return "TCT (Alcatel) ONE TOUCH Ultra 960c"; }
        else if ("OPPO A53".equals(model)) { return "Oppo A53"; }
        else if ("Orinoquia Gran Roraima S7-702u".equals(model)) { return "Huawei Youth"; }
        else if ("One".equals(model)) { return "One"; }
        else if ("Orange Dive 30".equals(model)) { return "ZTE Orange Dive 30"; }
        else if ("ONE TOUCH 6012X".equals(model)) { return "TCT (Alcatel) ONE TOUCH 6012X"; }
        else if ("ONE TOUCH 6012E".equals(model)) { return "TCT (Alcatel) ONE TOUCH 6012D"; }
        else if ("ONE TOUCH 6012D".equals(model)) { return "TCT (Alcatel) ONE TOUCH 6012D"; }
        else if ("ONE TOUCH 6012A".equals(model)) { return "TCT (Alcatel) ONE TOUCH 6012D"; }
        else if ("Optimus_Madrid".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 995"; }
        else if ("ODYSSEY".equals(model)) { return "Crosscall ODYSSEY"; }
        else if ("OPPO R7sPlus".equals(model)) { return "Oppo R7s Plus"; }
        else if ("ONE TOUCH 5036X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5036D"; }
        else if ("OWN S3010".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("onetouch_P689L".equals(model)) { return "TCT (Alcatel) onetouch_P689L"; }
        else if ("Orange Novi".equals(model)) { return "ZTE Orange Novi"; }
        else if ("one695_1".equals(model)) { return "CloudFone Cloudpad One 6.95"; }
        else if ("Onyx".equals(model)) { return "Explay Onyx"; }
        else if ("Optimus San Francisco".equals(model)) { return "ZTE Blade"; }
        else if ("OWN S3010D".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("OPPO A33m".equals(model)) { return "Oppo A33m"; }
        else if ("Orange Hiro".equals(model)) { return "TCT (Alcatel) ONE TOUCH 6012D"; }
        else if ("OWN S5010".equals(model)) { return "TCT (Alcatel) OWN S5010"; }
        else if ("ORINOQUIA Auyantepui+Y221-U03".equals(model)) { return "Huawei Y221-U03"; }
        else if ("Orange Yumo".equals(model)) { return "Huawei G740"; }
        else if ("Orange Kivo".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("OWN S5030".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("one touch T10".equals(model)) { return "TCT (Alcatel) T10"; }
        else if ("ONE TOUCH E710".equals(model)) { return "TCT (Alcatel) ONE TOUCH EVO7HD"; }
        else if ("OPPO R9 Plustm A".equals(model)) { return "Oppo R9PlustmA"; }
        else if ("OPPO A37m".equals(model)) { return "OPPO A37m"; }
        else if ("ONE TOUCH TAB 7".equals(model)) { return "TCT (Alcatel) ONE TOUCH TAB 7"; }
        else if ("Optimus_San_Remo".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 6030X"; }
        else if ("Orange Gova".equals(model)) { return "Huawei G535-L11"; }
        else if ("Orange Niva".equals(model)) { return "Orange idol S"; }
        else if ("ONE TOUCH C505C".equals(model)) { return "TCT (Alcatel) ONE TOUCH C505C"; }
        else if ("ONE TOUCH TAB 7HD".equals(model)) { return "TCT (Alcatel) ONE TOUCH TAB 7HD"; }
        else if ("OWN-I62S".equals(model)) { return "Entel OWN I62S"; }
        else if ("ONE TOUCH 4033E".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("ONE TOUCH 4033A".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("Optimus Zali".equals(model)) { return "ZTE Kis Pro"; }
        else if ("OPPO A59tm".equals(model)) { return "OPPO A59tm"; }
        else if ("OPPO R9t".equals(model)) { return "Oppo R9t"; }
        else if ("OPPO R9m".equals(model)) { return "Oppo R9m"; }
        else if ("ONE TOUCH 4033D".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("ONE TOUCH 4033X".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("OT-310".equals(model)) { return "Partner OT-310"; }
        else if ("Orange Nura".equals(model)) { return "Orange Nura"; }
        else if ("ONE TOUCH 4015D".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4015X"; }
        else if ("ONE TOUCH 4015A".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4015X"; }
        else if ("ONE TOUCH 4015N".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4015X"; }
        else if ("ONE TOUCH 4015X".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4015X"; }
        else if ("OP110".equals(model)) { return "Olivetti OP110"; }
        else if ("Orange_Daytona".equals(model)) { return "Huawei Ascend G510"; }
        else if ("Obi MV1".equals(model)) { return "Obi MV1"; }
        else if ("Orange Covo".equals(model)) { return "TCT (Alcatel) ONE TOUCH 6012D"; }
        else if ("ONE TOUCH IDOL MINI".equals(model)) { return "TCT (Alcatel) ONE TOUCH 6012D"; }
        else if ("Orinoquia Auyantepui Y210".equals(model)) { return "Huawei Y210"; }
        else if ("ONE TOUCH 8020D".equals(model)) { return "TCT (Alcatel) ONE TOUCH 8020D"; }
        else if ("Orange Zali".equals(model)) { return "ZTE Orange Zali"; }
        else if ("onetouch EVO7".equals(model)) { return "TCT (Alcatel) EVO7"; }
        else if ("Orange Infinity 8008X".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 8008D"; }
        else if ("ONE TOUCH 4011X".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4011X"; }
        else if ("Orange Yomi".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4015X"; }
        else if ("ONE TOUCH EVO8HD".equals(model)) { return "TCT (Alcatel) ONE TOUCH EVO8HD"; }
        else if ("ONE TOUCH TAB 8HD".equals(model)) { return "TCT (Alcatel) ONE TOUCH TAB 8HD"; }
        else if ("ONE_TOUCH_960C".equals(model)) { return "TCT (Alcatel) ONE TOUCH Ultra 960c"; }
        else if ("Onliner4".equals(model)) { return "Explay Onliner 4"; }
        else if ("OPPO A37tm".equals(model)) { return "OPPO A37tm"; }
        else if ("ONE TOUCH 4007E".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4007X"; }
        else if ("ONE TOUCH 4007D".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4007X"; }
        else if ("ONE TOUCH 4007A".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4007X"; }
        else if ("ONE TOUCH 4007X".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4007X"; }
        else if ("ONE TOUCH 4015X-orange".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4015X"; }
        else if ("OWN_S4025".equals(model)) { return "TCT (Alcatel) OWN_S4025"; }
        else if ("Omnis One".equals(model)) { return "tecmobile OmnisOne"; }
        else if ("Orange Reyo".equals(model)) { return "ZTE Orange Reyo"; }
        else if ("Oysters Pacific 800".equals(model)) { return "Hisense Oysters Pacific 800"; }
        else if ("OPPO R9tm".equals(model)) { return "Oppo R9tm"; }
        else if ("ONE TOUCH EVO7HD".equals(model)) { return "TCT (Alcatel) ONE TOUCH EVO8HD"; }
        else if ("OPPO R9 Plust A".equals(model)) { return "Oppo R9PlustA"; }
        else if ("one8_0_1_coho".equals(model)) { return "CloudFone Cloudpad One 8.0"; }
        else if ("ONYX".equals(model)) { return "Mobicell ONYX"; }
        else if ("OPPO A35".equals(model)) { return "Oppo A35"; }
        else if ("one touch D920".equals(model)) { return "TCT (Alcatel) one_touch_D920_ALIQ"; }
        else if ("Orange Monte Carlo".equals(model)) { return "ZTE Orange Monte Carlo"; }
        else if ("Orinoquia Gran Roraima + S7-722u".equals(model)) { return "Huawei Gran_Roraima"; }
        else if ("one touch 995C+".equals(model)) { return "TCT (Alcatel) one touch 995C+"; }
        else if ("Orange Rono".equals(model)) { return "ZTE Orange Rono"; }
        else if ("OPPO A59m".equals(model)) { return "OPPO A59m"; }
        else if ("OPPO A59t".equals(model)) { return "OPPO A59t"; }
        else if ("OPPO A59".equals(model)) { return "OPPO A59"; }
        else if ("one7_0_4_coho".equals(model)) { return "CloudFone Cloudpad One 7.0"; }
        else if ("One Pad".equals(model)) { return "ZTE V9"; }
        else if ("Orange Neva 80".equals(model)) { return "ZTE Orange Neva 80"; }
        else if ("OPPO A37t".equals(model)) { return "Oppo A37t"; }
        else if ("Orange Rise 30".equals(model)) { return "Orange Rise 30"; }
        else if ("Orinoquia Roraima S7-932u".equals(model)) { return "Huawei S7"; }
        else if ("Orange San Francisco".equals(model)) { return "ZTE Blade"; }
        else if ("ONEPLUS A3000".equals(model)) { return "OnePlus 3"; }
        else if ("ONE TOUCH P310A".equals(model)) { return "TCT (Alcatel) ONE_TOUCH_P310A"; }
        return "";

    }
    public static String nMethod (String model) {
        if ("NX529J".equals(model)) { return "ZTE NX529J"; }
        else if ("NX507J".equals(model)) { return "ZTE NX507J"; }
        else if ("NX507H".equals(model)) { return "ZTE NX507J"; }
        else if ("NX601J".equals(model)) { return "ZTE NX601J"; }
        else if ("N860".equals(model)) { return "ZTE Warp N860"; }
        else if ("N861".equals(model)) { return "ZTE N861"; }
        else if ("N-02E".equals(model)) { return "NEC MEDIAS U N-02E"; }
        else if ("NGM Orion".equals(model)) { return "Enspert orion"; }
        else if ("N5L".equals(model)) { return "NUU N5L"; }
        else if ("N5111".equals(model)) { return "Oppo N1 mimi"; }
        else if ("N5116".equals(model)) { return "Oppo N1 mimi"; }
        else if ("N5117".equals(model)) { return "Oppo N5117"; }
        else if ("NX785QC8G".equals(model)) { return "Nextbook NX785QC8G"; }
        else if ("NX402".equals(model)) { return "ZTE NX40X"; }
        else if ("NX008HI".equals(model)) { return "Anydata Nextbook NX008HI Tablet / Carrefour CT810"; }
        else if ("NX505J".equals(model)) { return "ZTE NX505J"; }
        else if ("NX16A11264".equals(model)) { return "Nextbook NX16A11264"; }
        else if ("NX403A".equals(model)) { return "ZTE NX403A"; }
        else if ("N-08D".equals(model)) { return "NEC MEDIAS TAB UL N-08D"; }
        else if ("Next7D12".equals(model)) { return "Anydata Nextbook Next7D12 Tablet"; }
        else if ("N940Sc".equals(model)) { return "ZTE N940Sc"; }
        else if ("NWZ-Z1000Series".equals(model)) { return "Sony NWZ-Z1000"; }
        else if ("Nexus_5X".equals(model)) { return "Nexus 5X"; }
        else if ("NW-Z1000Series".equals(model)) { return "Sony NW-Z1000"; }
        else if ("N9518".equals(model)) { return "ZTE N9518"; }
        else if ("N9519".equals(model)) { return "ZTE Warp 7"; }
        else if ("N-06D".equals(model)) { return "NEC MEDIAS TAB N-06D"; }
        else if ("N-06E".equals(model)) { return "NEC MEDIAS  X N-06E"; }
        else if ("N-06C".equals(model)) { return "NEC MEDIAS WP N-06C"; }
        else if ("N-01D".equals(model)) { return "NEC MEDIAS PP N-01D"; }
        else if ("Neffos C5 Max".equals(model)) { return "Neffos C5 Max"; }
        else if ("Nexus_S_4G".equals(model)) { return "Samsung Nexus S 4G"; }
        else if ("N1".equals(model)) { return "Oppo N1"; }
        else if ("N3".equals(model)) { return "Star NO.1 N3"; }
        else if ("N6".equals(model)) { return "Gini N6"; }
        else if ("N800".equals(model)) { return "ZTE N800"; }
        else if ("Neon".equals(model)) { return "AG Mobile Neon"; }
        else if ("N810 i7".equals(model)) { return "NESO N810 i7"; }
        else if ("N-04D".equals(model)) { return "NEC MEDIAS LTE N-04D"; }
        else if ("N-04E".equals(model)) { return "NEC MEDIAS X N-04E"; }
        else if ("N-04C".equals(model)) { return "NEC MEDIAS N-04C"; }
        else if ("NOS FIVE".equals(model)) { return "ZTE Blade A452"; }
        else if ("Nexus One".equals(model)) { return "HTC Nexus One"; }
        else if ("N918St".equals(model)) { return "ZTE N918St"; }
        else if ("NS-P16AT10".equals(model)) { return "Insignia NS-P16AT10"; }
        else if ("nuvi 3592".equals(model)) { return "Garmin nuvi 3592"; }
        else if ("NOS Roya".equals(model)) { return "Orange NOS Roya"; }
        else if ("NX401".equals(model)) { return "Nubia NX401"; }
        else if ("NX40X".equals(model)) { return "ZTE NX40X_APT"; }
        else if ("nubia Z5".equals(model)) { return "ZTE nubia Z5"; }
        else if ("NEC-NE-201A1A".equals(model)) { return "NEC NE-201"; }
        else if ("NX501_APT".equals(model)) { return "ZTE NX501_APT"; }
        else if ("N5206".equals(model)) { return "Oppo N3"; }
        else if ("N5207".equals(model)) { return "Oppo N3"; }
        else if ("N5209".equals(model)) { return "Oppo N3"; }
        else if ("N855D".equals(model)) { return "ZTE N855D"; }
        else if ("NX785QC".equals(model)) { return "Nextbook NX785QC"; }
        else if ("NX503A_Z4".equals(model)) { return "ZTE NX503A_Z4"; }
        else if ("NX510J".equals(model)) { return "ZTE NX510J"; }
        else if ("NEC-101S".equals(model)) { return "NEC MEDIAS NEC-101S"; }
        else if ("N880".equals(model)) { return "ZTE Blade"; }
        else if ("NOS NOVU".equals(model)) { return "ZTE Blade C370"; }
        else if ("NOS SLIM".equals(model)) { return "ZTE Blade S6"; }
        else if ("N958St".equals(model)) { return "ZTE N958St"; }
        else if ("NX512J".equals(model)) { return "ZTE NX512J"; }
        else if ("N986".equals(model)) { return "ZTE N986"; }
        else if ("N8300_Reliance".equals(model)) { return "ZTE N8300_Reliance"; }
        else if ("NEC-102".equals(model)) { return "NEC MEDIAS NEC-102"; }
        else if ("N9500".equals(model)) { return "ZTE N9500"; }
        else if ("NGM_Dynamic_Stylo".equals(model)) { return "NGM_Dynamic_Stylo"; }
        else if ("N919D".equals(model)) { return "ZTE N919D"; }
        else if ("NEO8-1".equals(model)) { return "Haier NEO8-1"; }
        else if ("NX40X_APT".equals(model)) { return "ZTE NX40X_APT"; }
        else if ("N9521".equals(model)) { return "ZTE N9521"; }
        else if ("N9520".equals(model)) { return "ZTE N9520"; }
        else if ("nuvifone A50".equals(model)) { return "Garmin Nuvifone"; }
        else if ("N9835".equals(model)) { return "ZTE N9835"; }
        else if ("NB1022".equals(model)) { return "Nobis NB1022"; }
        else if ("Nexus 6".equals(model)) { return "Motorola Nexus 6"; }
        else if ("Nexus 7".equals(model)) { return "Asus Nexus 7 (2013)"; }
        else if ("Nexus 4".equals(model)) { return "LGE Nexus 4"; }
        else if ("Nexus 5".equals(model)) { return "LGE Nexus 5"; }
        else if ("Nexus 9".equals(model)) { return "HTC Nexus 9 LTE"; }
        else if ("Nexus S".equals(model)) { return "Samsung Nexus S"; }
        else if ("Nura 2".equals(model)) { return "Orange Nura2"; }
        else if ("N8000_USA_RS".equals(model)) { return "ZTE N8000_USA_RS"; }
        else if ("NX503A".equals(model)) { return "Nubia NX503A"; }
        else if ("NGM M500".equals(model)) { return "NGM Italia SRL M500"; }
        else if ("NX501".equals(model)) { return "ZTE NX501"; }
        else if ("N9810".equals(model)) { return "ZTE N9810"; }
        else if ("NEC909e".equals(model)) { return "NEC909e"; }
        else if ("NS-14T002".equals(model)) { return "INSIGNIA NS-14T002"; }
        else if ("NS-14T004".equals(model)) { return "Insignia Flex 10.1"; }
        else if ("NS-15AT10".equals(model)) { return "Insignia NS-15AT10"; }
        else if ("N8000_USA_Cricket".equals(model)) { return "ZTE N8000_USA_Cricket"; }
        else if ("N790".equals(model)) { return "ZTE N790"; }
        else if ("NX406E".equals(model)) { return "ZTE NX406E"; }
        else if ("NB09".equals(model)) { return "Nobis NB09"; }
        else if ("NB07".equals(model)) { return "Nobis NB07"; }
        else if ("Now".equals(model)) { return "NGM Italia SRL Danamic Now"; }
        else if ("NE501J".equals(model)) { return "ZTE NE501J"; }
        else if ("NEOS".equals(model)) { return "Astak NEOS"; }
        else if ("Nexus 6P".equals(model)) { return "Huawei Nexus 6P"; }
        else if ("N-07D".equals(model)) { return "NEC MEDIAS X N-07D"; }
        else if ("NX404H".equals(model)) { return "ZTE NX404H"; }
        else if ("N4L".equals(model)) { return "NUU N4L"; }
        else if ("Neffos Y5L".equals(model)) { return "Neffos Y5L"; }
        else if ("N9130".equals(model)) { return "ZTE N9130"; }
        else if ("N9132".equals(model)) { return "ZTE N9132"; }
        else if ("NX506J".equals(model)) { return "ZTE NX506J"; }
        else if ("N799D".equals(model)) { return "ZTE N799D"; }
        else if ("NS-P16AT785HD".equals(model)) { return "Insignia MID7802RA"; }
        else if ("N8010_APT".equals(model)) { return "ZTE N8010_APT"; }
        else if ("N850".equals(model)) { return "ZTE N850"; }
        else if ("NX007HD".equals(model)) { return "Anydata Nextbook NX007HD Tablet"; }
        else if ("Nexus_6P".equals(model)) { return "Nexus 6P"; }
        else if ("N-05D".equals(model)) { return "NEC MEDIAS ES N-05D"; }
        else if ("Newman N2".equals(model)) { return "Cellon Newman N2"; }
        else if ("NX008HD8G".equals(model)) { return "Anydata Nextbook NX008HD8G Tablet"; }
        else if ("NS-P16AT08".equals(model)) { return "Insignia NS-P16AT08"; }
        else if ("N8303".equals(model)) { return "ZTE N8303"; }
        else if ("N810".equals(model)) { return "ZTE N810"; }
        else if ("N817".equals(model)) { return "ZTE N817"; }
        else if ("N-03E".equals(model)) { return "NEC Disney Mobile on docomoN-03E"; }
        else if ("Neffos C5".equals(model)) { return "Neffos C5"; }
        else if ("NB7022S".equals(model)) { return "Nobis NB7022S"; }
        else if ("NX700QC".equals(model)) { return "Nextbook NX700QC"; }
        else if ("Nexus Player".equals(model)) { return "Asus Nexus Player"; }
        else if ("N-05E".equals(model)) { return "NEC MEDIAS W N-05E"; }
        else if ("N8730-41102".equals(model)) { return "NEC AGT10"; }
        else if ("N8730-41101".equals(model)) { return "NEC AGT10"; }
        else if ("NOBA".equals(model)) { return "Nyx mobile NOBA"; }
        else if ("N762".equals(model)) { return "ZTE N762"; }
        else if ("Nexus_10".equals(model)) { return "Google Nexus 10"; }
        else if ("Next7P12".equals(model)) { return "Anydata Nextbook Next7P12"; }
        else if ("NEBUPOS3".equals(model)) { return "EBN NEBUPOS3"; }
        else if ("NGM P550".equals(model)) { return "NGM Italia SRL P550"; }
        else if ("NEO7-1".equals(model)) { return "Haier NEO7-1"; }
        else if ("NEO7-2".equals(model)) { return "Haier NEO7-2"; }
        else if ("NGM P503".equals(model)) { return "NGM Italia SRL P503"; }
        else if ("Nexus_9".equals(model)) { return "Nexus 9"; }
        else if ("Nexus_7".equals(model)) { return "Asus Nexus 7"; }
        else if ("Nexus_6".equals(model)) { return "Nexus 6"; }
        else if ("Nexus_5".equals(model)) { return "Nexus 5"; }
        else if ("Nexus_4".equals(model)) { return "Google Nexus 4"; }
        else if ("Nexus_S".equals(model)) { return "Samsung Nexus S"; }
        else if ("N720".equals(model)) { return "ZTE N720"; }
        else if ("nuvi 3595".equals(model)) { return "Garmin nuvi 3595"; }
        else if ("NBX-T7014".equals(model)) { return "Noblex NBX-T7014"; }
        else if ("N986+".equals(model)) { return "ZTE N986D"; }
        else if ("NX511J".equals(model)) { return "ZTE NX511J"; }
        else if ("NEO10-1".equals(model)) { return "Haier NEO10-1"; }
        else if ("Netphone 701".equals(model)) { return "ZTE Blade"; }
        else if ("Nexus S 4G".equals(model)) { return "Samsung Nexus S"; }
        else if ("NX513J".equals(model)) { return "ZTE NX513J"; }
        else if ("NE-103T".equals(model)) { return "NEC MEDIAS U NE-103T"; }
        else if ("N9180".equals(model)) { return "ZTE N9180"; }
        else if ("NXA8QC116".equals(model)) { return "Nextbook NXA8QC116"; }
        else if ("NEC-STR".equals(model)) { return "NEC LifeTouch L"; }
        else if ("Navo_QS".equals(model)) { return "Vonino Navo QS"; }
        else if ("NXA116QC164".equals(model)) { return "Nextbook NXA116QC164"; }
        else if ("N9510".equals(model)) { return "ZTE N9510"; }
        else if ("N9516".equals(model)) { return "ZTE N9516"; }
        else if ("N9515".equals(model)) { return "ZTE N9515"; }
        else if ("NX508J".equals(model)) { return "ZTE NX508J"; }
        else if ("Nuvola NP-1".equals(model)) { return "NanoTech Nuvola NP-1"; }
        else if ("NXA8LTE116".equals(model)) { return "Nextbook NXA8LTE116"; }
        else if ("N3-2200".equals(model)) { return "Acer N3-2200"; }
        else if ("NGM Vanity Smart".equals(model)) { return "Enspert vanitysmart"; }
        else if ("N818".equals(model)) { return "ZTE N818"; }
        else if ("NX521J".equals(model)) { return "ZTE NX521J"; }
        else if ("N8000_WHTE_CKT".equals(model)) { return "ZTE N8000_WHTE_CKT"; }
        else if ("Nanho_T775".equals(model)) { return "Hipstreet Nanho_T775"; }
        else if ("NewTab F1".equals(model)) { return "InFocus NewTab F1"; }
        else if ("NABI2-NV7A".equals(model)) { return "Nabi 2 Tablet"; }
        else if ("NV8".equals(model)) { return "Ncredible NV8"; }
        else if ("N8730-411".equals(model)) { return "NEC AGT10"; }
        else if ("Nexus 5X".equals(model)) { return "LGE Nexus 5X"; }
        else if ("N5110".equals(model)) { return "Oppo N5110"; }
        else if ("nuvi 3590".equals(model)) { return "Garmin nuvi 3590"; }
        else if ("NE-202".equals(model)) { return "NEC MEDIAS NE-202"; }
        else if ("NSZ-GU1".equals(model)) { return "Sony BRAVIA Smart Stick"; }
        else if ("NS-P10A6100".equals(model)) { return "Insignia NS-P10A6100"; }
        else if ("NID-7011".equals(model)) { return "NAXA NID-7011"; }
        else if ("NII Nextel".equals(model)) { return "Nextel V.45"; }
        else if ("NS-15AT07".equals(model)) { return "Insignia NS-15AT07"; }
        else if ("Nextel V.35".equals(model)) { return "Nextel V.35"; }
        else if ("NX503J".equals(model)) { return "ZTE NX503J"; }
        else if ("NXA101LTE116".equals(model)) { return "Nextbook NXA101LTE116"; }
        else if ("N1W".equals(model)) { return "OPPO N1W"; }
        else if ("N1T".equals(model)) { return "Oppo N1T"; }
        else if ("N765_APT".equals(model)) { return "ZTE N765_APT"; }
        else if ("N986D".equals(model)) { return "ZTE N986D"; }
        else if ("NS-13T001".equals(model)) { return "Anydata Insignia NS-13T001 Tablet"; }
        else if ("NX511J_V3".equals(model)) { return "ZTE NX511J_V3"; }
        else if ("N9101".equals(model)) { return "ZTE N9101"; }
        else if ("N9100".equals(model)) { return "ZTE N9100"; }
        else if ("N850L".equals(model)) { return "ZTE N850L"; }
        else if ("Nexus 10".equals(model)) { return "Samsung Nexus 10"; }
        else if ("NX405H".equals(model)) { return "ZTE NX405H"; }
        else if ("NB7850S".equals(model)) { return "Nobis NB7850S"; }
        return "";

    }
    public static String qMethod (String model) {
        if ("QPI-1".equals(model)) { return "sugar_aums QPOINT"; }
        else if ("QUANTUM_400_LITE".equals(model)) { return "GoClever QUANTUM 400 LITE"; }
        else if ("QH-10".equals(model)) { return "Huawei T102"; }
        else if ("QOOQ".equals(model)) { return "QOOQV3"; }
        else if ("Q4T7IN".equals(model)) { return "Auchan Q4T7IN"; }
        else if ("Q-Touch".equals(model)) { return "Plus4 Q-Touch"; }
        else if ("Q4T10INK".equals(model)) { return "Auchan QILIVE"; }
        else if ("Q6S5IN4G".equals(model)) { return "Auchan Q6S5IN4G"; }
        else if ("Q".equals(model)) { return "Cellon Q"; }
        else if ("Q4514".equals(model)) { return "Auchan Q.4514"; }
        else if ("Q4T7IN3G".equals(model)) { return "Auchan Q4T7IN3G"; }
        else if ("QILIVE 101".equals(model)) { return "Archos QiLive 101"; }
        else if ("Qrypton7".equals(model)) { return "Gigabyte TM75A"; }
        else if ("Q5S55IN4G".equals(model)) { return "Auchan Q5S55IN4G"; }
        else if ("QMobile L20".equals(model)) { return "Qmobile L20"; }
        else if ("QMobile S2 Plus".equals(model)) { return "QMobile S2 Plus"; }
        else if ("Q4T10IN".equals(model)) { return "Auchan Q4T10IN"; }
        else if ("Qilive 53".equals(model)) { return "Archos Qilive 53"; }
        else if ("Qilive 50".equals(model)) { return "Archos Auchan QiLive 50"; }
        else if ("Qilive 79".equals(model)) { return "Archos Qilive79"; }
        else if ("Q6T10IN4G".equals(model)) { return "Auchan Q6T10IN4G"; }
        else if ("QM164E".equals(model)) { return "Philips FHD Ultra Slim LED TV Powered by Android"; }
        else if ("Q Founder".equals(model)) { return "Fossil Q Founder"; }
        else if ("Q882".equals(model)) { return "REACH Q882"; }
        else if ("QiLive 8QC".equals(model)) { return "Archos Auchan Qilive8QC"; }
        else if ("QUANTUM_1010N".equals(model)) { return "GoClever QUANTUM 1010N"; }
        else if ("Qrypton1010".equals(model)) { return "Gigabyte TM105A"; }
        else if ("QMobile i6 Metal ONE".equals(model)) { return "Qmobile i6 Metal ONE"; }
        else if ("Q-Smart S21".equals(model)) { return "Cellon S21"; }
        else if ("Q4S6IN4G".equals(model)) { return "Auchan Q4S6IN4G"; }
        else if ("QUANTUM_550".equals(model)) { return "GoClever QUANTUM_550"; }
        else if ("Q4T8IN".equals(model)) { return "Auchan Q4T8IN"; }
        else if ("Q.3778".equals(model)) { return "Qilive Q.3778"; }
        else if ("Quest".equals(model)) { return "AG Mobile Quest"; }
        else if ("QiLive 97R".equals(model)) { return "Archos Auchan Qilive97R"; }
        else if ("Quantum Go".equals(model)) { return "Positivo Quantum Go"; }
        else if ("QUANTUM_700S".equals(model)) { return "GOCLEVER QUANTUM_700S/QUANTUM 700S"; }
        else if ("Q6T7INK".equals(model)) { return "Auchan Q6T7INK"; }
        else if ("Q5S5IN4G".equals(model)) { return "Auchan Q5S5IN4G"; }
        else if ("QMV7A".equals(model)) { return "Verizon Ellipsis 7"; }
        else if ("QMV7B".equals(model)) { return "Verizon Wireless Ellipsis 7 (QMV7B)"; }
        else if ("QMobile A1".equals(model)) { return "QMobile Pakistan"; }
        else if ("QMobile A3".equals(model)) { return "QMobile NOIR A3"; }
        else if ("QMobile A6".equals(model)) { return "QMobile NOIR A6"; }
        else if ("Q5002".equals(model)) { return "Haier StarQ_Q5002"; }
        else if ("Q7T7INK".equals(model)) { return "Auchan Q7T7INK"; }
        else if ("Qilive 45".equals(model)) { return "Archos Auchan QiLive 45"; }
        else if ("quattro".equals(model)) { return "Positivo quattro"; }
        else if ("Qilive 40".equals(model)) { return "Archos Auchan Qilive 40"; }
        else if ("QTAQZ3".equals(model)) { return "Verizon Wireless Ellipsis 8"; }
        else if ("Qilive 97R-2".equals(model)) { return "Archos Qilive 97R2"; }
        else if ("Qilive 7".equals(model)) { return "Archos Qilive 7"; }
        else if ("QiLive 97".equals(model)) { return "Archos Auchan Qilive97"; }
        else if ("Q6T7IN".equals(model)) { return "Auchan Q6T7IN"; }
        else if ("QiLive 8".equals(model)) { return "Archos Auchan Qilive8"; }
        else if ("Qilive 70v2".equals(model)) { return "Archos Qilive7V2"; }
        else if ("QM163E".equals(model)) { return "Philips 4K Ultra Slim LED TV powered by Android"; }
        else if ("Quechua Phone 5".equals(model)) { return "Archos Quechua Phone 5"; }
        else if ("QMobile Z10".equals(model)) { return "QMobile Z10"; }
        else if ("QTAIR7".equals(model)) { return "Verizon Wireless Ellipsis 10"; }
        else if ("QTAQZ3KID".equals(model)) { return "Verizon Wireless QTAQZ3KID"; }
        return "";

    }
    public static String pMethod (String model) {
        if ("P469".equals(model)) { return "Micromax Canvas Tabby"; }
        else if ("PNDPP44Q7GPBLK".equals(model)) { return "Haier PNDPP44Q7GPBLK"; }
        else if ("PLT7109G".equals(model)) { return "Proscan PLT7109G"; }
        else if ("PX3000".equals(model)) { return "Hisense PX3000"; }
        else if ("Pluri_M7".equals(model)) { return "Vonino Pluri M7"; }
        else if ("PRO10D".equals(model)) { return "Prestige PRO10D"; }
        else if ("PRO5043".equals(model)) { return "Polaroid PRO5043"; }
        else if ("Panasonic T11".equals(model)) { return "Panasonic T11"; }
        else if ("PMT5777_3G".equals(model)) { return "Prestigio PMT5777_3G"; }
        else if ("PMT3677_Wi".equals(model)) { return "Prestigio PMT3677_Wi"; }
        else if ("PCSGOB10SF-A".equals(model)) { return "PC Smart PCSGOB10SF-A"; }
        else if ("PLT9650G".equals(model)) { return "Proscan PLT9650G"; }
        else if ("PantechP8000".equals(model)) { return "Pantech Crossover"; }
        else if ("PI7000".equals(model)) { return "Philips T8 PI7000"; }
        else if ("PI2010".equals(model)) { return "Philips PI2010"; }
        else if ("PI2011".equals(model)) { return "Philips PI2011"; }
        else if ("Positivo BGH Mini".equals(model)) { return "Positivo Ypy Mini"; }
        else if ("PTAB751".equals(model)) { return "Polaroid PTAB751"; }
        else if ("PG06100".equals(model)) { return "HTC EVO Shift 4G"; }
        else if ("PAD1021".equals(model)) { return "Haier PAD1021"; }
        else if ("P01T_1".equals(model)) { return "Asus ZenPad 10 (Z300CL)"; }
        else if ("PLT7130G".equals(model)) { return "Proscan PLT7130G"; }
        else if ("PRO5023".equals(model)) { return "Polaroid Phantom 5"; }
        else if ("PMT3767_3G".equals(model)) { return "Prestigio PMT3767_3G"; }
        else if ("PLK-CL00".equals(model)) { return "Huawei PLK-CL00"; }
        else if ("PSP3531DUO".equals(model)) { return "Prestigio PSP3531DUO"; }
        else if ("Philips_W3500".equals(model)) { return "Philips_W3500"; }
        else if ("PMT7177_3G".equals(model)) { return "Prestigio PMT7177_3G"; }
        else if ("PSP3457DUO".equals(model)) { return "Prestigio PSP3457DUO"; }
        else if ("P01W".equals(model)) { return "Asus ZenPad 7.0 (Z370C)"; }
        else if ("PTM-Z-mini".equals(model)) { return "Tecno PHANTOM-Z-mini"; }
        else if ("PSP5505DUO".equals(model)) { return "Prestigio MultiPhone 5505 DUO"; }
        else if ("Panasonic ELUGA L 4G".equals(model)) { return "Panasonic ELUGA L 4G"; }
        else if ("PG86100".equals(model)) { return "HTC Evo 3D"; }
        else if ("PantechP9070".equals(model)) { return "Pantech Burst"; }
        else if ("P360X".equals(model)) { return "TCT (Alcatel) P360X"; }
        else if ("PRO8D".equals(model)) { return "Prestige PRO8D"; }
        else if ("PMT3177_3G".equals(model)) { return "Prestigio PMT3177_3G"; }
        else if ("Positivo Ypy L700".equals(model)) { return "Positivo Ypy L700"; }
        else if ("PGPS7795".equals(model)) { return "Prestigio PGPS7795"; }
        else if ("P00A".equals(model)) { return "Asus ZenPad 8.0 (Z380M)"; }
        else if ("P00C".equals(model)) { return "Asus ZenPad 10 (Z300M)"; }
        else if ("P4S".equals(model)) { return "Gionee P4S"; }
        else if ("P001".equals(model)) { return "Asus ZenPad C 7.0 (Z170MG)"; }
        else if ("P008".equals(model)) { return "Verizon Wireless ASUS ZenPad Z8"; }
        else if ("P5Life_TM".equals(model)) { return "AllView P5 Life"; }
        else if ("pad_d85".equals(model)) { return "Haier"; }
        else if ("P771A".equals(model)) { return "Anydata HKC P771A"; }
        else if ("Positivo Ypy L1000F".equals(model)) { return "Positivo Ypy L1000"; }
        else if ("PI3900-93".equals(model)) { return "Philips PI3900"; }
        else if ("PX2700".equals(model)) { return "Hisense PX2700"; }
        else if ("Philips W632".equals(model)) { return "Anydata Philips W632"; }
        else if ("PAD69H".equals(model)) { return "Haier"; }
        else if ("Positivo One".equals(model)) { return "Positivo One"; }
        else if ("Prestige 7G".equals(model)) { return "Prestige 7G"; }
        else if ("P4501".equals(model)) { return "Medion P4501"; }
        else if ("P022".equals(model)) { return "Asus Zenpad 8.0 (Z380C)"; }
        else if ("P023".equals(model)) { return "Asus ZenPad 10 (Z300C)"; }
        else if ("P021".equals(model)) { return "Asus ZenPad 10 (Z300CG)"; }
        else if ("P024".equals(model)) { return "Asus Zenpad 8.0 (Z380KL)"; }
        else if ("Phoenix 2".equals(model)) { return "Fly Phoenix 2"; }
        else if ("Prime".equals(model)) { return "Explay Prime"; }
        else if ("Panasonic P61".equals(model)) { return "Panasonic P61"; }
        else if ("P01Y_S".equals(model)) { return "Asus ZenPad C 7.0"; }
        else if ("P6 PRO".equals(model)) { return "Symphony P6 PRO"; }
        else if ("Personal Huawei G620S".equals(model)) { return "Huawei G620S-L03"; }
        else if ("PMT5287_4G".equals(model)) { return "Prestigio PMT5287_4G"; }
        else if ("PMT5001_3G".equals(model)) { return "Prestigio PMT5001_3G"; }
        else if ("PLK-AL10".equals(model)) { return "Huawei PLK-AL10"; }
        else if ("Philips W6610".equals(model)) { return "Philips W6610"; }
        else if ("PH44100".equals(model)) { return "HTC Evo Design 4G"; }
        else if ("PI4010G".equals(model)) { return "Philips PI4010G"; }
        else if ("PE-TL20".equals(model)) { return "Huawei PE-TL20"; }
        else if ("PGN608".equals(model)) { return "Condor PGN608"; }
        else if ("PGN605".equals(model)) { return "Condor PGN605"; }
        else if ("PGN607".equals(model)) { return "Condor PGN607"; }
        else if ("PGN606".equals(model)) { return "Condor PGN606"; }
        else if ("Pelephone-Y300-".equals(model)) { return "Huawei Y300"; }
        else if ("PRO5023PW".equals(model)) { return "Polaroid PRO5023PW"; }
        else if ("PSP5504DUO".equals(model)) { return "Prestigio MultiPhone 5504 DUO"; }
        else if ("Panasonic P41".equals(model)) { return "Panasonic P41"; }
        else if ("Primo81".equals(model)) { return "MSI Primo81"; }
        else if ("PSP5508DUO".equals(model)) { return "Prestigio Multiphone 5508 DUO"; }
        else if ("PLT8802G".equals(model)) { return "Proscan PLT8802G"; }
        else if ("PMT5011_3G".equals(model)) { return "Prestigio PMT5011_3G"; }
        else if ("Positivo US2070".equals(model)) { return "Positivo Union US2070"; }
        else if ("P6_Pro".equals(model)) { return "AllView P6 Pro"; }
        else if ("Positivo BGH Ypy L700 Kids".equals(model)) { return "Positivo Ypy Kids"; }
        else if ("Positivo BGH Y300".equals(model)) { return "Positivo mini I"; }
        else if ("P2".equals(model)) { return "Haier P2"; }
        else if ("P3".equals(model)) { return "Lava Flair P3"; }
        else if ("P6".equals(model)) { return "Gionee P6"; }
        else if ("P7".equals(model)) { return "Lava P7"; }
        else if ("P4".equals(model)) { return "Gionee P4"; }
        else if ("Primo R4 Plus".equals(model)) { return "Walton Primo R4 Plus"; }
        else if ("PantechP9060".equals(model)) { return "Pantech Pocket"; }
        else if ("PSP3404DUO".equals(model)) { return "Prestigio PSP3404DUO"; }
        else if ("PadFone T004".equals(model)) { return "Asus The new PadFone Infinity (A86)"; }
        else if ("PadFone T008".equals(model)) { return "Asus PadFone E (A68M)"; }
        else if ("PadFone T00C".equals(model)) { return "Asus PadFone mini"; }
        else if ("P001_2".equals(model)) { return "Asus ZenPadC 7.0 (Z170MG)"; }
        else if ("Panasonic ELUGA Z".equals(model)) { return "Panasonic Eluga Z"; }
        else if ("Panasonic ELUGA S".equals(model)) { return "Panasonic ELUGA S"; }
        else if ("Panasonic ELUGA U".equals(model)) { return "Panasonic ELUGA U"; }
        else if ("Panasonic ELUGA I".equals(model)) { return "Panasonic ELUGA I"; }
        else if ("Panasonic ELUGA A".equals(model)) { return "Panasonic ELUGA A"; }
        else if ("PLT7223G".equals(model)) { return "Anydata Proscan PLT7223G"; }
        else if ("PLT1077G_16G".equals(model)) { return "Proscan PLT1077G_16G"; }
        else if ("PLT9609G".equals(model)) { return "Proscan PLT9609G"; }
        else if ("PI3106".equals(model)) { return "Philips PI3106"; }
        else if ("PI3105".equals(model)) { return "Philips PI3105"; }
        else if ("PI3100".equals(model)) { return "Philips PI3100/98"; }
        else if ("Preo Teknosa P1".equals(model)) { return "ZTE Preo Teknosa P1"; }
        else if ("Positivo Ypy AB7EC".equals(model)) { return "Positivo YPY AB7"; }
        else if ("PAP5430".equals(model)) { return "BYD Prestigio PAP5430"; }
        else if ("Positivo Ypy 7 - TB07STA".equals(model)) { return "Positivo YPY7 wifi"; }
        else if ("Positivo Ypy L700 Ed. Especial".equals(model)) { return "Positivo Ypy L700"; }
        else if ("Panasonic P81".equals(model)) { return "Panasonic P81"; }
        else if ("Positivo Ypy AB10H".equals(model)) { return "Positivo Ypy AB10H"; }
        else if ("Positivo Ypy AB10E".equals(model)) { return "Positivo Ypy AB10E"; }
        else if ("PSP3504DUO".equals(model)) { return "Prestigio PSP3504DUO"; }
        else if ("P509".equals(model)) { return "NGM Italia SRL P509"; }
        else if ("P508".equals(model)) { return "NGM Italia SRL P508"; }
        else if ("PLK-TL00".equals(model)) { return "Huawei PLK-TL00"; }
        else if ("PMT5587_Wi".equals(model)) { return "Prestigio PMT5587_Wi"; }
        else if ("Panasonic ELUGA Icon 2".equals(model)) { return "Panasonic Eluga Icon 2"; }
        else if ("PC36100".equals(model)) { return "HTC Evo 4G"; }
        else if ("Positivo Next".equals(model)) { return "Positivo Next"; }
        else if ("Positivo Ypy AB7E".equals(model)) { return "Positivo YPY AB7"; }
        else if ("Positivo Ypy AB7F".equals(model)) { return "Positivo Ypy AB7F"; }
        else if ("Personal Huawei Y550".equals(model)) { return "Huawei Y550-L03"; }
        else if ("PGN409".equals(model)) { return "Condor PGN409"; }
        else if ("PGN404".equals(model)) { return "Condor PGN404"; }
        else if ("PB99400".equals(model)) { return "HTC Desire"; }
        else if ("PGN-508".equals(model)) { return "Condor C6+"; }
        else if ("PGN-506".equals(model)) { return "Condor C7"; }
        else if ("PGN-507".equals(model)) { return "Condor A9"; }
        else if ("PLT1077G".equals(model)) { return "Proscan PLT1077G(1GB/8GB)"; }
        else if ("PSP3505DUO".equals(model)) { return "Prestigio PSP3505DUO"; }
        else if ("PadFone".equals(model)) { return "Asus PadFone"; }
        else if ("PSP3405DUO".equals(model)) { return "Prestigio PSP3405DUO"; }
        else if ("PHS-601".equals(model)) { return "Candor PHS-601"; }
        else if ("P6_Qmax".equals(model)) { return "AllView P6 Qmax"; }
        else if ("PSP5454DUO".equals(model)) { return "Prestigio PSP5454DUO"; }
        else if ("Panasonic T44 Lite".equals(model)) { return "Panasonic T44 Lite"; }
        else if ("P01MA".equals(model)) { return "Asus ZenPad S 8.0 (Z580CA)"; }
        else if ("PSP5047DUO".equals(model)) { return "Prestigio PSP5047DUO"; }
        else if ("PMT3057_3G".equals(model)) { return "Prestigio PMT3057_3G"; }
        else if ("Positivo Ypy L700+ Kids".equals(model)) { return "Positivo Ypy Kids"; }
        else if ("PLT1065G".equals(model)) { return "Proscan PLT1065G"; }
        else if ("PMT3377_Wi".equals(model)) { return "Prestigio MultiPad Thunder 7.0i"; }
        else if ("P-05D".equals(model)) { return "Panasonic P-05D"; }
        else if ("PLT7100G".equals(model)) { return "Proscan PLT7100G"; }
        else if ("Positivo Ypy L700 Kids".equals(model)) { return "Positivo Ypy Kids"; }
        else if ("PowerFour".equals(model)) { return "HighScreen Power Four"; }
        else if ("Pulsar".equals(model)) { return "Explay Pulsar"; }
        else if ("Panasonic P41HD".equals(model)) { return "Panasonic P41 HD"; }
        else if ("Phoenix2".equals(model)) { return "Hipstreet Phoenix2"; }
        else if ("PNDPP44QC10".equals(model)) { return "pendo PNDPP44QC10"; }
        else if ("PSP7557".equals(model)) { return "Prestigio Grace"; }
        else if ("PGN509".equals(model)) { return "Condor PGN509"; }
        else if ("PMT3087_3G".equals(model)) { return "Prestigio PMT3087_3G"; }
        else if ("PMT3777_3G".equals(model)) { return "Prestigio PMT3777_3G"; }
        else if ("Panasonic_Eluga_I3".equals(model)) { return "Panasonic Eluga I3"; }
        else if ("PSP5517DUO".equals(model)) { return "Prestigio MultiPhone 5517 DUO"; }
        else if ("P-07C".equals(model)) { return "Panasonic P-07C"; }
        else if ("P-07D".equals(model)) { return "Panasonic ELUGA Power"; }
        else if ("PSP5550DUO".equals(model)) { return "Prestigio PSP5550DUO"; }
        else if ("P5_eMagic".equals(model)) { return "AllView P5 eMagic"; }
        else if ("P10".equals(model)) { return "Reeder P10"; }
        else if ("P350X".equals(model)) { return "TCT (Alcatel) P350X"; }
        else if ("PMT3031_3G".equals(model)) { return "Prestigio PMT3031_3G"; }
        else if ("POC2".equals(model)) { return "POC2"; }
        else if ("P-01D".equals(model)) { return "Panasonic P-01D"; }
        else if ("P901".equals(model)) { return "Polaroid P901"; }
        else if ("PI3100-93".equals(model)) { return "Philips PI3100/93"; }
        else if ("Positivo Ypy L1000".equals(model)) { return "Positivo Ypy L1000"; }
        else if ("PMT5008_3G".equals(model)) { return "Prestigio PMT5008_3G"; }
        else if ("Panasonic T40".equals(model)) { return "Panasonic T40"; }
        else if ("PixelV1".equals(model)) { return "Lava Pixel V1"; }
        else if ("PandA_m14".equals(model)) { return "TCT (Alcatel) PandA_m14"; }
        else if ("PSP5470DUO".equals(model)) { return "Prestigio Grace X5"; }
        else if ("PLT7803G".equals(model)) { return "Proscan PLT7803G"; }
        else if ("PT2200".equals(model)) { return "BenQ PT2200"; }
        else if ("PMT7787_3G".equals(model)) { return "Prestigio PMT7787_3G"; }
        else if ("PX2800".equals(model)) { return "Hisense PX2800"; }
        else if ("PLT8223G".equals(model)) { return "Anydata Proscan PLT8223G"; }
        else if ("Positivo BGH Y200".equals(model)) { return "Positivo BGH Y200"; }
        else if ("PI3910".equals(model)) { return "Philips PI3910"; }
        else if ("Positivo T750".equals(model)) { return "Positivo T750"; }
        else if ("P-03E".equals(model)) { return "Panasonic ELUGA P"; }
        else if ("P5_eMagic_TM".equals(model)) { return "AllView P5 eMagic"; }
        else if ("PMT3067_3G".equals(model)) { return "Prestigio PMT3067_3G"; }
        else if ("P5_Pro_TM".equals(model)) { return "AllView P5_Pro"; }
        else if ("Panasonic T21".equals(model)) { return "Panasonic T21"; }
        else if ("P8_Energy_PRO".equals(model)) { return "AllView P8 Energy Pro"; }
        else if ("PC-TS508T1W".equals(model)) { return "NEC PC-508T1W"; }
        else if ("Pulse".equals(model)) { return "Huawei U8220"; }
        else if ("Project Tango Tablet Development Kit".equals(model)) { return "Google Project Tango Tablet Development Kit"; }
        else if ("Philips W336".equals(model)) { return "Anydata Philips W336"; }
        else if ("Primo GH5".equals(model)) { return "Walton Primo GH5"; }
        else if ("PMT7008_4G".equals(model)) { return "Prestigio PMT7008_4G"; }
        else if ("PLANET".equals(model)) { return "Pantech PLANET"; }
        else if ("PE-UL00".equals(model)) { return "Huawei PE-UL00"; }
        else if ("Philips S337".equals(model)) { return "Philips S337"; }
        else if ("Panasonic_P61".equals(model)) { return "Panasonic P61"; }
        else if ("P6_lite".equals(model)) { return "AllView P6 Lite"; }
        else if ("P330X".equals(model)) { return "TCT (Alcatel) P330X"; }
        else if ("PMT3121_Wi".equals(model)) { return "Prestigio MULTIPAD WIZE 3121"; }
        else if ("PAD712".equals(model)) { return "Haier PAD712"; }
        else if ("PMT3017_WI".equals(model)) { return "Prestigio MultiPad Wize 3017"; }
        else if ("PantechP8010".equals(model)) { return "Pantech Flex"; }
        else if ("Planet".equals(model)) { return "Explay Planet"; }
        else if ("P470".equals(model)) { return "Micromax Canvas tab"; }
        else if ("PMT3341_3G".equals(model)) { return "Prestigio MULTIPAD WIZE 3341 3G"; }
        else if ("PLT7602G".equals(model)) { return "Proscan PLT7602G"; }
        else if ("Primo ZX2 mini".equals(model)) { return "Walton Primo ZX2 mini"; }
        else if ("Positivo T710".equals(model)) { return "Positivo T710"; }
        else if ("PSP3530DUO".equals(model)) { return "Prestigio PSP3530DUO"; }
        else if ("PAD722".equals(model)) { return "Haier PAD722"; }
        else if ("Panasonic ELUGA S Mini".equals(model)) { return "Panasonic ELUGA S Mini"; }
        else if ("Panasonic UN-W700".equals(model)) { return "Panasonic UN-W700"; }
        else if ("P774A".equals(model)) { return "Anydata HKC P774A"; }
        else if ("Panasonic ELUGA U2".equals(model)) { return "Panasonic ELUGA U2"; }
        else if ("PowerFive".equals(model)) { return "HighScreen Power Five"; }
        else if ("PLT8235G".equals(model)) { return "PROSCAN PLT8235G Tablet"; }
        else if ("P4_eMagic".equals(model)) { return "AllView P4 eMagic"; }
        else if ("PE-TL00M".equals(model)) { return "Huawei PE-TL00M"; }
        else if ("PSP3450DUO".equals(model)) { return "Prestigio PSP3450DUO"; }
        else if ("Positivo Ypy 7 - TB07FTA".equals(model)) { return "Positivo YPY7 3G"; }
        else if ("PI2000".equals(model)) { return "Philips PI2000"; }
        else if ("Primo RM2 mini".equals(model)) { return "Walton Primo RM2 mini"; }
        else if ("PI7100_93".equals(model)) { return "Philips PI7100/93"; }
        else if ("PSP3453DUO".equals(model)) { return "Prestigio WIZE A3"; }
        else if ("Positivo SX1000".equals(model)) { return "Positivo SX1000"; }
        else if ("PSP3455DUO".equals(model)) { return "Prestigio Grace X3"; }
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
        else if ("PMT3008_Wi_C".equals(model)) { return "Prestigio PMT3008_Wi"; }
        else if ("Philips W8555".equals(model)) { return "Philips W8555"; }
        else if ("PTL21".equals(model)) { return "Pantech PTL21"; }
        else if ("PLT9606G".equals(model)) { return "Proscan PLT9606G"; }
        else if ("PRO9D".equals(model)) { return "Prestige PRO9D"; }
        else if ("PC-TS708T1W".equals(model)) { return "NEC PC-708T1W"; }
        else if ("P3S".equals(model)) { return "Gionee P3S"; }
        else if ("PMT3009_Wi_C".equals(model)) { return "Prestigio MultiPad Wize 3009"; }
        else if ("Panasonic P31".equals(model)) { return "Panasonic P31"; }
        else if ("Power Ice".equals(model)) { return "HighScreen Power Ice"; }
        else if ("Philips V377".equals(model)) { return "Philips Xenium V377"; }
        else if ("Panasonic T41".equals(model)) { return "Panasonic T41"; }
        else if ("PLT9649G".equals(model)) { return "Proscan PLT9649G"; }
        else if ("PMT3018_WI".equals(model)) { return "Prestigio MultiPad Wize 3018"; }
        else if ("PRO5044PEE01".equals(model)) { return "Polaroid PRO5044PEE01"; }
        else if ("PMT3287_3G".equals(model)) { return "Prestigio PMT3287_3G"; }
        else if ("PantechP9090".equals(model)) { return "Pantech P9090"; }
        else if ("PNDPP44QC7".equals(model)) { return "pendo PNDPP44QC7"; }
        else if ("P8_Energy_mini".equals(model)) { return "AllView P8 Energy mini"; }
        else if ("PX7".equals(model)) { return "Hisense PX1900ES"; }
        else if ("PRIMO".equals(model)) { return "Konrow Primo"; }
        else if ("Primo 81".equals(model)) { return "MSI Primo81"; }
        else if ("Positivo Ypy L1050F".equals(model)) { return "Positivo Ypy L1050"; }
        else if ("Positivo Ypy L1050E".equals(model)) { return "Positivo Ypy L1050E"; }
        else if ("Panasonic T9".equals(model)) { return "Panasonic T9"; }
        else if ("P8_Energy".equals(model)) { return "AllView P8 Energy"; }
        else if ("P5L".equals(model)) { return "Gionee P5L"; }
        else if ("P01Z".equals(model)) { return "Asus ZenPad C 7.0 (Z170C)"; }
        else if ("P01Y".equals(model)) { return "Asus ZenPad C 7.0 (Z170CG)"; }
        else if ("P01M".equals(model)) { return "Asus ZenPad S 8.0 (Z580C)"; }
        else if ("P5W".equals(model)) { return "Gionee P5W"; }
        else if ("Panasonic P11".equals(model)) { return "Panasonic P11"; }
        else if ("PMT5487_3G".equals(model)) { return "Prestigio PMT5487_3G"; }
        else if ("P1000".equals(model)) { return "Polaroid P1000"; }
        else if ("P4_eMagic_TM".equals(model)) { return "AllView P4 eMagic"; }
        else if ("Positivo Mini TE".equals(model)) { return "Positivo Mini"; }
        else if ("PI3205G".equals(model)) { return "Philips PI3205G"; }
        else if ("PLT9602G".equals(model)) { return "Proscan PLT9602G"; }
        else if ("P886A".equals(model)) { return "Anydata HKC P886A"; }
        else if ("Prime11E".equals(model)) { return "Visual Land Prestige Prime11E"; }
        else if ("PURE XL".equals(model)) { return "Blu PURE XL"; }
        else if ("PLT7650G".equals(model)) { return "Proscan PLT7650G"; }
        else if ("Panasonic P77".equals(model)) { return "Panasonic P77"; }
        else if ("Panasonic P75".equals(model)) { return "Panasonic P75"; }
        else if ("P6_Energy".equals(model)) { return "AllView P6_Energy"; }
        else if ("Positivo Mini".equals(model)) { return "Positivo Mini"; }
        else if ("PC-TE508BAW".equals(model)) { return "NEC LaVieTab PC-TE508BAW"; }
        else if ("Philips W3568".equals(model)) { return "Philips W3568"; }
        else if ("P552".equals(model)) { return "NGM Italia SRL P552"; }
        else if ("P551".equals(model)) { return "NGM Italia SRL P551"; }
        else if ("P5_Energy".equals(model)) { return "AllView P5 Energy"; }
        else if ("PX1900".equals(model)) { return "Hisense PX1900"; }
        else if ("P102G".equals(model)) { return "Gigabyte P102g"; }
        else if ("P70221".equals(model)) { return "Micromax Canvas Tab"; }
        else if ("PSP5457DUO".equals(model)) { return "Prestigio PSP5457DUO"; }
        else if ("Party".equals(model)) { return "Explay Party"; }
        else if ("PMT7077_3G".equals(model)) { return "Prestigio PMT7077_3G"; }
        else if ("PMT3011_3G".equals(model)) { return "Prestigio PMT3011_3G"; }
        else if ("P9C".equals(model)) { return "Reeder P9C"; }
        else if ("Primo_NX3".equals(model)) { return "Walton Primo NX3"; }
        else if ("Panasonic P51".equals(model)) { return "Panasonic P51"; }
        else if ("Panasonic P55".equals(model)) { return "Panasonic P55"; }
        else if ("PULP 4G".equals(model)) { return "Wiko PULP 4G"; }
        else if ("PMT3021_3G".equals(model)) { return "Prestigio PMT3021_3G"; }
        else if ("P002".equals(model)) { return "Asus ZenPad 7.0(Z370KL)"; }
        else if ("P6 S-L04".equals(model)) { return "Huawei P6S"; }
        else if ("Preo_P2".equals(model)) { return "Teknosa Preo P2"; }
        else if ("PI3100Z3_93".equals(model)) { return "Philips PI3100Z3/93"; }
        else if ("PSP5507DUO".equals(model)) { return "Prestigio PSP5507DUO"; }
        else if ("PI3110".equals(model)) { return "Philips PI3110"; }
        else if ("PE-TL10".equals(model)) { return "Huawei PE-TL10"; }
        else if ("PNDPP47GP".equals(model)) { return "Haier PNDPP47GP"; }
        else if ("PMT5887_3G".equals(model)) { return "Prestigio PMT5887_3G"; }
        else if ("PC_Smart_PTSGOB8".equals(model)) { return "PC Smart PTSGOB8"; }
        else if ("Pixel C".equals(model)) { return "Google Pixel C"; }
        else if ("Power Rage".equals(model)) { return "HighScreen Power Rage"; }
        else if ("PNDPP410GP".equals(model)) { return "Haier PNDPP410GP"; }
        else if ("PMT3757_3G".equals(model)) { return "Prestigio Multipad Wize 3757 3G"; }
        else if ("PMT7287_3G".equals(model)) { return "Prestigio PMT7287_3G"; }
        else if ("P778A".equals(model)) { return "Anydata HKC P778A"; }
        else if ("PULP".equals(model)) { return "Wiko PULP"; }
        else if ("PMT3047_3G".equals(model)) { return "Prestigio PMT3047_3G"; }
        else if ("PMT3108_3G".equals(model)) { return "Prestigio MULTIPAD WIZE 3108 3G"; }
        else if ("PLT7777".equals(model)) { return "Anydata Proscan PLT7777"; }
        else if ("PMT5018_3G".equals(model)) { return "Prestigio PMT5018_3G"; }
        else if ("PSP5506DUO".equals(model)) { return "Prestigio PSP5506DUO"; }
        else if ("Panasonic UN-MT300".equals(model)) { return "Panasonic UN-MT300"; }
        else if ("PRIMO8".equals(model)) { return "THOMSON PRIMO8 Tablet"; }
        else if ("PRIMO7".equals(model)) { return "THOMSON PRIMO7 Tablet"; }
        else if ("PRO7D".equals(model)) { return "Anydata Visual Land Prestige 7D"; }
        else if ("PMT3787_3G".equals(model)) { return "Prestigio MULTIPAD WIZE 3787 3G"; }
        else if ("PGN410".equals(model)) { return "Condor PGN410"; }
        else if ("P6_lite_mTEL".equals(model)) { return "AllView P6 Lite"; }
        else if ("PMT3027_Wi".equals(model)) { return "Prestigio MULTIPAD WIZE 3027"; }
        else if ("PSP5455DUO".equals(model)) { return "Prestigio MultiPhone 5455 DUO"; }
        else if ("PMT3037_3G".equals(model)) { return "Prestigio MultiPad Wize 3037 3G"; }
        else if ("Prime10ES".equals(model)) { return "Visual Land Prestige Prime10ES"; }
        else if ("PX3100".equals(model)) { return "Hisense PX3100"; }
        else if ("PULP FAB 4G".equals(model)) { return "Wiko PULP FAB 4G"; }
        else if ("P791".equals(model)) { return "Polaroid P791"; }
        else if ("PC-TE307N1W".equals(model)) { return "NEC PC-TE307N1W"; }
        else if ("Positivo Ypy L700+".equals(model)) { return "Positivo Ypy L700"; }
        else if ("Primo GH5 mini".equals(model)) { return "Walton Primo GH5 mini"; }
        else if ("Primo73".equals(model)) { return "MSI Primo73"; }
        else if ("Primo76".equals(model)) { return "MSI Primo76"; }
        else if ("PantechP4100".equals(model)) { return "Pantech Element"; }
        else if ("PLT7649G".equals(model)) { return "Proscan PLT7649G"; }
        else if ("Positivo BGH 7Di-A".equals(model)) { return "Positivo BGH Y210"; }
        else if ("P300".equals(model)) { return "Micromax P300"; }
        else if ("P2M".equals(model)) { return "Gionee P2M"; }
        else if ("P6_eMagic".equals(model)) { return "AllView P6 eMagic"; }
        else if ("PRO7DS".equals(model)) { return "Prestige PRO7DS"; }
        else if ("PSP5453DUO".equals(model)) { return "Prestigio MultiPhone 5453 DUO"; }
        else if ("P01V".equals(model)) { return "Asus ZenPad 7.0 (Z370CG)"; }
        else if ("P01T".equals(model)) { return "ASUSPRO Tablet-M1000CL"; }
        else if ("P6_Energy_TM".equals(model)) { return "AllView P6 Energy"; }
        else if ("PLK-TL01H".equals(model)) { return "Huawei PLK-TL01H"; }
        else if ("P5_Pro".equals(model)) { return "AllView P5 Pro"; }
        else if ("PLK-UL00".equals(model)) { return "Huawei PLK-UL00"; }
        else if ("PTBPT5QCB7".equals(model)) { return "Protab PTBPT5QCB7"; }
        else if ("PadFone Infinity".equals(model)) { return "Asus PadFone Infinity"; }
        else if ("PHS-402".equals(model)) { return "Hisense U606AE"; }
        else if ("Pegasus".equals(model)) { return "Mobiwire Pegasus"; }
        else if ("PSP7505DUO".equals(model)) { return "Prestigio Grace X7"; }
        else if ("PadFone 2".equals(model)) { return "Asus PadFone 2"; }
        else if ("Philips V387".equals(model)) { return "Philips V387"; }
        else if ("Philips W832".equals(model)) { return "Anydata Philips W832"; }
        else if ("PSP3456DUO".equals(model)) { return "Prestigio PSP3456DUO"; }
        else if ("PLT7804G".equals(model)) { return "Proscan PLT7804G"; }
        else if ("PMT3038_3G".equals(model)) { return "Prestigio MultiPad Wize 3038 3G"; }
        else if ("PMT3277_3G".equals(model)) { return "Prestigio PMT3277_3G"; }
        else if ("Panasonic SV-ME1000".equals(model)) { return "Panasonic SV-ME1000"; }
        else if ("PHQ520".equals(model)) { return "Condor Griffe G5"; }
        else if ("PMT3308_3G".equals(model)) { return "Prestigio MULTIPAD WIZE 3308 3G"; }
        else if ("Panasonic ELUGA Arc".equals(model)) { return "Panasonic Eluga Arc"; }
        else if ("Prism II".equals(model)) { return "Huawei Prism II"; }
        else if ("P-04D".equals(model)) { return "Panasonic P-04D"; }
        else if ("Philips W536".equals(model)) { return "Anydata Philips W536"; }
        else if ("PC1038Q".equals(model)) { return "Allfine PC1038Q"; }
        else if ("Positivo Ypy L1050".equals(model)) { return "Positivo Ypy L1050"; }
        else if ("P1001".equals(model)) { return "Polaroid P1001"; }
        else if ("Primo R4".equals(model)) { return "Walton Primo R4"; }
        else if ("Phantom".equals(model)) { return "Explay Phantom"; }
        else if ("Prime L".equals(model)) { return "HighScreen Prime L"; }
        else if ("PMT5002_Wi".equals(model)) { return "Prestigio PMT5002_Wi"; }
        else if ("Panasonic P55 Novo".equals(model)) { return "Panasonic P55 Novo"; }
        else if ("PE-CL00".equals(model)) { return "Huawei PE-CL00"; }
        else if ("Patio100_3G".equals(model)) { return "Fujitsu Patio100"; }
        else if ("P5 mini".equals(model)) { return "Gionee P5 mini"; }
        else if ("P480".equals(model)) { return "Micromax Canvas Tab"; }
        else if ("Panasonic KX-PRXA10".equals(model)) { return "Panasonic KX-PRXA10"; }
        else if ("Panasonic KX-PRXA15".equals(model)) { return "Panasonic KX-PRXA15"; }
        else if ("PSP3502DUO".equals(model)) { return "Prestigio PSP3502DUO"; }
        else if ("P8_Energy_mini_TM".equals(model)) { return "AllView P8 Energy mini"; }
        else if ("PI3210G".equals(model)) { return "Philips PI3210G"; }
        else if ("PAD841".equals(model)) { return "Haier PAD841"; }
        else if ("P-06D".equals(model)) { return "Panasonic ELUGA V"; }
        else if ("PULP FAB".equals(model)) { return "Wiko PULP FAB"; }
        else if ("PTAB1051_PTAB1055".equals(model)) { return "Polaroid PTAB1051-PTAB1055"; }
        else if ("Patio100".equals(model)) { return "Fujitsu Patio100"; }
        else if ("Play".equals(model)) { return "WeTek Play"; }
        else if ("P5Life".equals(model)) { return "AllView P5Life"; }
        else if ("PSP3452DUO".equals(model)) { return "Prestigio Muze A3"; }
        else if ("Primo_ZX2".equals(model)) { return "Walton Primo ZX2"; }
        else if ("PMT5021_3G".equals(model)) { return "Prestigio PMT5021_3G"; }
        else if ("PMT3331_3G".equals(model)) { return "Prestigio MULTIPAD WIZE 3331 3G"; }
        else if ("PMT3111_Wi".equals(model)) { return "Prestigio MULTIPAD WIZE 3111"; }
        else if ("Positivo BGH Ypy L700".equals(model)) { return "Positivo Ypy"; }
        else if ("Positivo BGH Y210".equals(model)) { return "Positivo BGH Y210"; }
        else if ("PLK-L01".equals(model)) { return "Huawei PLK-L01"; }
        else if ("P600".equals(model)) { return "Southern Telecom Polaroid Power P600"; }
        else if ("Positivo Ypy AB10EC".equals(model)) { return "Positivo Ypy AB10E"; }
        else if ("Philips W8510".equals(model)) { return "Philips W8510"; }
        else if ("PAD1042".equals(model)) { return "Haier PAD1042"; }
        else if ("Pantech V955".equals(model)) { return "Pantech v955"; }
        else if ("Philips S398".equals(model)) { return "Philips Philps S398"; }
        else if ("PLT1066".equals(model)) { return "Gigabyte PROSCAN PLT1066 / MAG MAGPAD / TEAC TEACTAB / DOPO GS-1008"; }
        else if ("PSP3503DUO".equals(model)) { return "Prestigio PSP3503DUO"; }
        else if ("Positivo Mini I".equals(model)) { return "Positivo mini I"; }
        else if ("P776A".equals(model)) { return "Anydata HKC P776A"; }
        else if ("PI3900".equals(model)) { return "Philips PI3900/98"; }
        else if ("PMT5877C".equals(model)) { return "Prestigio PMT5877C"; }
        else if ("PAD_1042".equals(model)) { return "Haier PAD_1042"; }
        else if ("PADCT1010W".equals(model)) { return "Haier PADCT1010W"; }
        else if ("PSP5307DUO".equals(model)) { return "Prestigio PSP5307DUO"; }
        else if ("P-02D".equals(model)) { return "Panasonic P-02D"; }
        else if ("P-02E".equals(model)) { return "Panasonic ELUGA X"; }
        else if ("P330X_orange".equals(model)) { return "TCT (Alcatel) P330X_orange"; }
        else if ("PNDPP48GP".equals(model)) { return "Anydata Pendo PNDPP48GP"; }
        else if ("Philips S309".equals(model)) { return "Philips S309"; }
        else if ("Philips S308".equals(model)) { return "Philips S308"; }
        else if ("Panasonic T33".equals(model)) { return "Panasonic T33"; }
        else if ("Panasonic T30".equals(model)) { return "Panasonic T30"; }
        else if ("Panasonic T31".equals(model)) { return "Panasonic T31"; }
        else if ("PX2000".equals(model)) { return "Hisense PX2000"; }
        else if ("Pluri_Q8".equals(model)) { return "Vonino Pluri Q8"; }
        else if ("P275".equals(model)) { return "Micromax P275"; }
        else if ("PSP5551DUO".equals(model)) { return "Prestigio PSP5551DUO"; }
        return "";

    }
    public static String sMethod (String model) {
        if ("Sony Tablet P".equals(model)) { return "Sony Tablet P"; }
        else if ("SM-A700YD".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SM-A800IZ".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SP4".equals(model)) { return "Kodak SP4"; }
        else if ("SPH-L720".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-G9308".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-C105".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-C101".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-S777C".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("Sony Tablet S".equals(model)) { return "Sony Tablet S"; }
        else if ("SM-J120FN".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-N7505L".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SCH-R830".equals(model)) { return "Samsung Galaxy Axiom"; }
        else if ("SM-P555K".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-P555M".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-P555C".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-P555Y".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-P555S".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-N9108V".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SHF31".equals(model)) { return "Sharp AQUOS K SHF31"; }
        else if ("SHF32".equals(model)) { return "Sharp AQUOS K SHF32"; }
        else if ("S_plus".equals(model)) { return "Gionee S plus"; }
        else if ("SH-04H".equals(model)) { return "Sharp AQUOS ZETA SH-04H"; }
        else if ("SH-04D".equals(model)) { return "Sharp Q-pot.Phone SH-04D"; }
        else if ("SH-04E".equals(model)) { return "Sharp AQUOS PHONE EX SH-04E"; }
        else if ("SH-04F".equals(model)) { return "Sharp AQUOS ZETA SH-04F"; }
        else if ("S4T10IN3G".equals(model)) { return "Auchan S4T10IN3G"; }
        else if ("SHV31".equals(model)) { return "Sharp AQUOS SERIE mini SHV31"; }
        else if ("SHV33".equals(model)) { return "Sharp AQUOS Compact SHV33"; }
        else if ("SHV32".equals(model)) { return "Sharp AQUOS SERIE SHV32"; }
        else if ("SHV34".equals(model)) { return "Sharp AQUOS SERIE SHV34"; }
        else if ("SM-N910H".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SBM206SH".equals(model)) { return "Sharp AQUOS PHONE Xx 206SH"; }
        else if ("SHW-M500W".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("SM-T561Y".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SM-T561M".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SHW-M180K".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SHW-M180L".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SHW-M180S".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SHW-M180W".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("Sonic".equals(model)) { return "Mobicell Mobicel"; }
        else if ("SM-T355Y".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("Spro 2".equals(model)) { return "ZTE Spro 2"; }
        else if ("SM-G900M".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900L".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900K".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900I".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900H".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900X".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900V".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900T".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900S".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900P".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SOLARIN".equals(model)) { return "Sirin SOLARIN"; }
        else if ("SM-G860P".equals(model)) { return "Samsung Galaxy S5 Sport"; }
        else if ("SHV-E110S".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SMARTTVBOX".equals(model)) { return "Panasonic SmartTVBox"; }
        else if ("SAMSUNG-SM-J120AZ".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SPH-L520".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SHARP-ADS1".equals(model)) { return "Sharp ADS1"; }
        else if ("SCH-I545".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SUGAR".equals(model)) { return "Sugar"; }
        else if ("SHL21".equals(model)) { return "Sharp AQUOS PHONE SERIE SHL21"; }
        else if ("SHL22".equals(model)) { return "Sharp AQUOS PHONE  SERIE SHL22"; }
        else if ("SHL23".equals(model)) { return "Sharp AQUOS PHONE  SERIE SHL23"; }
        else if ("SHL25".equals(model)) { return "Sharp AQUOS SERIE SHL25"; }
        else if ("SH-RM02".equals(model)) { return "Sharp AQUOS SH-RM02"; }
        else if ("SAMSUNG-SGH-I537".equals(model)) { return "Samsung Galaxy S4 Active"; }
        else if ("SAMSUNG-SGH-I827".equals(model)) { return "Samsung Galaxy Appeal"; }
        else if ("SBM103SH".equals(model)) { return "Sharp AQUOS PHONE SoftBank 103SH"; }
        else if ("SGP561".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SH530U".equals(model)) { return "Foxconn SH530U"; }
        else if ("STK_Sync_5c".equals(model)) { return "Santok SYNC 5C"; }
        else if ("SCH-I535PP".equals(model)) { return "Samsung Galaxy S3"; }
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
        else if ("SCH-I939".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SH-02D".equals(model)) { return "Sharp AQUOS PHONE slider SH-02D"; }
        else if ("SH-02E".equals(model)) { return "Sharp AQUOS PHONE ZETA SH-02E"; }
        else if ("SH-02H".equals(model)) { return "Sharp AQUOS Compact SH-02H"; }
        else if ("SM-P555L".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-T230NY".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T567V".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("ST27i".equals(model)) { return "Sony Ericsson Xperia go"; }
        else if ("SM-G360GY".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-T800X".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-P555".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-P550".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SpiceMi-449".equals(model)) { return "Spice Smart Flo Mi-449"; }
        else if ("SM-G3508J".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SMART 4G 5.5 Enterprise".equals(model)) { return "TCT (Alcatel) SMART 4G 5.5 Enterprise"; }
        else if ("SAMSUNG-SM-T217A".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SHV-E220S".equals(model)) { return "Samsung Galaxy Pop"; }
        else if ("SPH-M900".equals(model)) { return "Samsung Moment"; }
        else if ("S1052".equals(model)) { return "Logicom S1052"; }
        else if ("S58A".equals(model)) { return "Acer Liquid Jade 2"; }
        else if ("s4".equals(model)) { return "Gini s4"; }
        else if ("SM-T817R4".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SCH-J021".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-G150NL".equals(model)) { return "Samsung Galaxy Folder"; }
        else if ("SGH-I757M".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SH-04G".equals(model)) { return "Sharp AQUOS EVER SH-04G"; }
        else if ("SGH-T599".equals(model)) { return "Samsung Galaxy Exhibit"; }
        else if ("SCH-i889".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SAMSUNG-SM-T817A".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SAMSUNG-EK-GC100".equals(model)) { return "Samsung Galaxy Camera"; }
        else if ("STJR76".equals(model)) { return "Smartab STJR76"; }
        else if ("SM-G530Y".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-J710MN".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("S440".equals(model)) { return "Positivo S440"; }
        else if ("SM-G530H".equals(model)) { return "Samsung Galaxy Tab3 Lite 7.0"; }
        else if ("SM-G730V".equals(model)) { return "Samsung Galaxy S III Mini"; }
        else if ("ST25i".equals(model)) { return "Sony Xperia U"; }
        else if ("ST25a".equals(model)) { return "Sony Xperia U"; }
        else if ("SBM102SH2".equals(model)) { return "Sharp AQUOS PHONE SoftBank  102SH II"; }
        else if ("SHW-M486W".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-A310Y".equals(model)) { return "Samsung Galaxy A3(2016)"; }
        else if ("SM-A310F".equals(model)) { return "Samsung Galaxy A3(2016)"; }
        else if ("SM-G9009W".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SBM303SH".equals(model)) { return "Sharp AQUOS PHONE Xx mini 303SH"; }
        else if ("SCL-TL00H".equals(model)) { return "Huawei Honor 4A"; }
        else if ("SGH-N064".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-G900T1".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900T3".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900T4".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-T230X".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("STARXTREM 4".equals(model)) { return "ZTE STARXTREM 4"; }
        else if ("SM-T330X".equals(model)) { return "Samsung Galaxy Tab 4 8.0"; }
        else if ("SAMSUNG-SM-G530A".equals(model)) { return "Samsung Galaxy Go Prime"; }
        else if ("SCH-I959".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SHIELD".equals(model)) { return "NVidia Shield"; }
        else if ("SM-T530X".equals(model)) { return "Samsung Galaxy Tab4 10.1"; }
        else if ("SCH-I200PP".equals(model)) { return "Samsung Galaxy Stellar"; }
        else if ("SM-N900R4".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("STARADDICT 4".equals(model)) { return "SFR STARADDICT 4"; }
        else if ("SM-J110M".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-J110L".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-J110H".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-J110G".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-J110F".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("ST5000".equals(model)) { return "Seemahale Telecoms ST5000"; }
        else if ("SHW-M240S".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("SM-T315T".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("SUBLIM".equals(model)) { return "Enspert WIKO SUBLIM"; }
        else if ("S420".equals(model)) { return "Positivo One"; }
        else if ("ST23a".equals(model)) { return "Sony Xperia miro"; }
        else if ("ST23i".equals(model)) { return "Sony Ericsson Xperia miro"; }
        else if ("Style 2".equals(model)) { return "AG Mobile Style_2"; }
        else if ("SGH-T499Y".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("SM-A500W".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SGH-T499V".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("SM-G316M".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SM-G316U".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SAMSUNG-SGH-I997R".equals(model)) { return "Samsung Infuse"; }
        else if ("SM-G7102T".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SCH-M828C".equals(model)) { return "Samsung Galaxy Precedent"; }
        else if ("SM-N910R4".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("samsung-printer-tablet".equals(model)) { return "Samsung ProXpress M4580"; }
        else if ("SM-T320".equals(model)) { return "Samsung Galaxy Tab Pro 8.4"; }
        else if ("SX930C_CJ".equals(model)) { return "CJ HelloVision Hello TV Smart"; }
        else if ("SM-G900R6".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900R7".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G900R4".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-N920W8".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("ST27a".equals(model)) { return "Sony Ericsson Xperia Go"; }
        else if ("SCH-P739".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SmartTab_1004_XS".equals(model)) { return "Sourcing Creation Smart Tab 1004XS"; }
        else if ("SAMSUNG-SGH-I847".equals(model)) { return "Samsung Rugby Smart"; }
        else if ("SCH-I800".equals(model)) { return "Samsung Galaxy Tab 7.0"; }
        else if ("SM-G350".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SSR1-5-8M".equals(model)) { return "Sico SmartPhone SSR1-5-8M"; }
        else if ("SCH-I545PP".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SCH-R530M".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SM-A9000".equals(model)) { return "Samsung Galaxy-A9(2016)"; }
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
        else if ("SM-N915T3".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-A800S".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SM-A800X".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SM-A800F".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SM-G900F".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-A800I".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SM-G530MU".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("ST21i".equals(model)) { return "Sony Xperia Tipo"; }
        else if ("SM-N915R4".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("S150".equals(model)) { return "SK Telesys S150"; }
        else if ("S8Q".equals(model)) { return "ZTE S8Q"; }
        else if ("SM-P355".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-P350".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SAMSUNG-SGH-I337Z".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SAMSUNG-SGH-I437".equals(model)) { return "Samsung Galaxy Express"; }
        else if ("SM-T116NQ".equals(model)) { return "Samsung Galaxy Tab3 Lite 7.0"; }
        else if ("SB510".equals(model)) { return "Gigabyte SB510 / IBT-102"; }
        else if ("SM-P905V".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-G9198".equals(model)) { return "Samsung SM-G9198"; }
        else if ("SM-P905M".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-G531BT".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-T719Y".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("Smart 505".equals(model)) { return "FarEasTone Smart 505"; }
        else if ("Smart 502".equals(model)) { return "BYD FarEastone Smart 502"; }
        else if ("SUNNY".equals(model)) { return "Wiko SUNNY"; }
        else if ("SM-G361HU".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SAMSUNG-SM-G891A".equals(model)) { return "Samsung Galaxy S7 Active"; }
        else if ("StarTrail III".equals(model)) { return "SFR Star Trail III"; }
        else if ("SPH-D710BST".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("SAMSUNG-SM-J321AZ".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("STJR700".equals(model)) { return "Smartab STJR700"; }
        else if ("SH8118U".equals(model)) { return "Sharp SH8118U"; }
        else if ("SCH-I605".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("Slate 21 Pro".equals(model)) { return "HP Slate 21 Pro"; }
        else if ("SHV-E330S".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SHV-E330L".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SHV-E330K".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SAMSUNG-SM-P907A".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("STARTRAIL 4".equals(model)) { return "ZTE STARTRAIL 4"; }
        else if ("SGH-I747M".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SHW-M480W".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SGH-T679M".equals(model)) { return "Samsung Galaxy W"; }
        else if ("SPH-M930BST".equals(model)) { return "Samsung Transform Ultra"; }
        else if ("SM-T365".equals(model)) { return "Samsung Galaxy Tab4 Active"; }
        else if ("SM-T2105".equals(model)) { return "Samsung Galaxy Tab3 Kids"; }
        else if ("SM-G3586V".equals(model)) { return "Samsung Galaxy Core Lite"; }
        else if ("SM-G313HY".equals(model)) { return "Samsung Galaxy Ace 4"; }
        else if ("SM-G313HU".equals(model)) { return "Samsung Galaxy Ace 4"; }
        else if ("SM-G313HN".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SGH-I727R".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("SM-T210X".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("SPH-M920".equals(model)) { return "Samsung Transform"; }
        else if ("SM-T210R".equals(model)) { return "Samsung Galaxy Tab 3 7.0"; }
        else if ("SM-T210L".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SM-T116BU".equals(model)) { return "Samsung Galaxy Tab Plus 7.0"; }
        else if ("SH-01EVW".equals(model)) { return "Sharp SH-01E Vivienne Westwood"; }
        else if ("SH825Wi".equals(model)) { return "Sharp SH825wi"; }
        else if ("SHW-M480K".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-G357FZ".equals(model)) { return "Samsung Galaxy Ace Style"; }
        else if ("SHIELD Android TV".equals(model)) { return "NVidia SHIELD Android TV"; }
        else if ("SOT21".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SI4301".equals(model)) { return "BYD SI4301"; }
        else if ("SGH-M919".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SCH-R680".equals(model)) { return "Samsung Repp"; }
        else if ("SM-G531H".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("Smartfive".equals(model)) { return "Konrow Smartfive"; }
        else if ("SM-J120ZN".equals(model)) { return "Samsung Galaxy J1(2016)"; }
        else if ("SAMSUNG-SGH-I997".equals(model)) { return "Samsung Infuse 4G"; }
        else if ("S01-orange".equals(model)) { return "Fujitsu STYLISTIC S01"; }
        else if ("SM-G130U".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("S4035 3G".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)"; }
        else if ("S4040".equals(model)) { return "Mobiwire S4040"; }
        else if ("ShakerBeat".equals(model)) { return "Boost ShakerBeat"; }
        else if ("SM-T537R4".equals(model)) { return "Samsung Galaxy Tab4 10.0"; }
        else if ("Stilo T715".equals(model)) { return "Positivo T715"; }
        else if ("SCL23".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SCL22".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SCL24".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SBM007SH".equals(model)) { return "Sharp AQUOS PHONE THE HYBRID SoftBank 007SH"; }
        else if ("SM-G5306W".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SCH-R970C".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SAMSUNG-SGH-I437Z".equals(model)) { return "Samsung Galaxy Express"; }
        else if ("SAMSUNG-SGH-I437P".equals(model)) { return "Samsung Galaxy Express"; }
        else if ("S3T10IN".equals(model)) { return "Auchan S3T10IN"; }
        else if ("SAMSUNG-SGH-I927R".equals(model)) { return "Samsung Galaxy S Glide"; }
        else if ("SM-T360".equals(model)) { return "Samsung Galaxy Tab4 Active"; }
        else if ("SHW-M250".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SM-N910T2".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-G3502L".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SM-G3502I".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SM-G3502U".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SM-G3502T".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SHL24".equals(model)) { return "Sharp AQUOS PHONE  SERIE mini SHL24"; }
        else if ("SM-G313HZ".equals(model)) { return "Samsung Galaxy S Duos3"; }
        else if ("SCH-I925U".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-T365M".equals(model)) { return "Samsung Galaxy Tab4 Active"; }
        else if ("SM-T365Y".equals(model)) { return "Samsung Galaxy Tab 4 Active"; }
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
        else if ("SC-01H".equals(model)) { return "Samsung SC-01H"; }
        else if ("SCH-I739".equals(model)) { return "Samsung Galaxy Trend2"; }
        else if ("SM-J710GN".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SCH-I939D".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("STV100-4".equals(model)) { return "BlackBerry PRIV by BlackBerry"; }
        else if ("SM-J700T".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-J700P".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-J700M".equals(model)) { return "Samsung Galaxy J7"; }
        else if ("SH-13C".equals(model)) { return "Sharp AQUOS PHONE f SH-13C"; }
        else if ("SM-J700K".equals(model)) { return "Samsung Galaxy J7"; }
        else if ("SM-J700F".equals(model)) { return "Samsung Galaxy J7"; }
        else if ("SM-J7008".equals(model)) { return "Samsung Galaxy J7"; }
        else if ("SM-G313U".equals(model)) { return "Samsung Galaxy Ace 4 Lite"; }
        else if ("SGPT13".equals(model)) { return "Sony Xperia Tablet S"; }
        else if ("SGPT12".equals(model)) { return "Sony Xperia Tablet S"; }
        else if ("SM-J510MN".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-S820L".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SGH-M819N".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SM-N9002".equals(model)) { return "Samsung Galaxy Note3 Duos"; }
        else if ("SM-N9006".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-N9007".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SM-N9008".equals(model)) { return "Samsung Galaxy Note3 Duos"; }
        else if ("SM-N9009".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SM-E700M".equals(model)) { return "Samsung Galaxy E7"; }
        else if ("SM-E700F".equals(model)) { return "Samsung Galaxy E7"; }
        else if ("SM-N900S".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-N900P".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-N900V".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-N900U".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SM-E7000".equals(model)) { return "Samsung Galaxy E7"; }
        else if ("SH930W".equals(model)) { return "Foxconn SH930W"; }
        else if ("SM-N900L".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SPH-M580".equals(model)) { return "Samsung Replenish"; }
        else if ("SHW-M220L".equals(model)) { return "Samsung Galaxy Neo"; }
        else if ("SHW-M340L".equals(model)) { return "Samsung Galaxy M Style"; }
        else if ("SHW-M340S".equals(model)) { return "Samsung Galaxy M Style"; }
        else if ("SAMSUNG-SM-G850A".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SAMSUNG-SM-G750A".equals(model)) { return "Samsung Galaxy Mega2"; }
        else if ("SM-S975L".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SCH-R960".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SM-G800R4".equals(model)) { return "Samsung Galaxy S5 Mini"; }
        else if ("SELFY 4G".equals(model)) { return "Wiko SELFY 4G"; }
        else if ("SM-T337T".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SCH-R740C".equals(model)) { return "Samsung Galaxy Discover"; }
        else if ("SHW-M580D".equals(model)) { return "Samsung Galaxy Core Safe"; }
        else if ("SHV-E270K".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("SHV-E270S".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("SCH-I337".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("S10-232L".equals(model)) { return "HUAWEI MediaPad 10 Link+"; }
        else if ("S4S5IN4G".equals(model)) { return "Auchan S4S5IN4G"; }
        else if ("SAMSUNG-SM-N915A".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("S480".equals(model)) { return "Positivo S480"; }
        else if ("SM-P600".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-P601".equals(model)) { return "Samsung Galaxy Note 10.1 2014 Edition"; }
        else if ("SM-P602".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-P605".equals(model)) { return "Samsung Galaxy Note 10.1 2014 Edition"; }
        else if ("SM-J100F".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-J100M".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-J100H".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("S8-306L".equals(model)) { return "HUAWEI MediaPad M1 8.0"; }
        else if ("SM-G386W".equals(model)) { return "Samsung Galaxy Core"; }
        else if ("SM-G386T".equals(model)) { return "Samsung Galaxy Avant"; }
        else if ("SM-G386F".equals(model)) { return "Samsung Galaxy Core LTE"; }
        else if ("SM-A700X".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SH950C-CM".equals(model)) { return "LGE SH950C-CM"; }
        else if ("Signature Touch".equals(model)) { return "Vertu Signature Touch"; }
        else if ("SHIELD Console".equals(model)) { return "NVidia SHIELD Android TV"; }
        else if ("SPH-M930".equals(model)) { return "Samsung Transform Ultra"; }
        else if ("SM-G316HU".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SH-02G".equals(model)) { return "Sharp Disney Mobile on docomo SH-02G"; }
        else if ("SAMSUNG-SM-T707A".equals(model)) { return "Samsung Galaxy TabS 8.4"; }
        else if ("SM-A7009".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SGH-S730M".equals(model)) { return "Samsung Amazing"; }
        else if ("Surfer7773G".equals(model)) { return "Explay Surfer777 3G"; }
        else if ("SM-G3518".equals(model)) { return "Samsung Galaxy Core LTE"; }
        else if ("SM-G7202".equals(model)) { return "Samsung Galaxy Grand Max"; }
        else if ("SM-G7200".equals(model)) { return "Samsung Galaxy Grand Max"; }
        else if ("Smartfren Andromax AD689G".equals(model)) { return "Smartfren AD689G"; }
        else if ("SM-G720AX".equals(model)) { return "Samsung Galaxy Grand Max"; }
        else if ("SM-A3009".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-A3000".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("STARNAUTE II".equals(model)) { return "ZTE STARNAUTE II"; }
        else if ("SGP611".equals(model)) { return "Sony Xperia Z3 Tablet Compact"; }
        else if ("SGP341".equals(model)) { return "Sony Ericsson Xperia Tablet Z"; }
        else if ("SGH-I777M".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SM-A300M".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-A300F".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("Sensation XL with Beats Audio".equals(model)) { return "HTC Sensation XL with Beats Audio X315e"; }
        else if ("SM-A300X".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SCH-S720C".equals(model)) { return "Samsung Proclaim"; }
        else if ("SM-J320ZN".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SHP-SH630E".equals(model)) { return "Foxconn SHARP SH630E"; }
        else if ("SM-T719".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SCH-i579".equals(model)) { return "Samsung Galaxy Ace Duos"; }
        else if ("SM-G9300".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930F".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930L".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930K".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930T".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930U".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930V".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930P".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930S".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G930X".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SAMSUNG-SGH-I957D".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SAMSUNG-SGH-I957M".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SAMSUNG-SGH-I957R".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("S4T7IN".equals(model)) { return "Auchan S4T7IN"; }
        else if ("SM-T355C".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-G920T1".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("Slider SL101".equals(model)) { return "Asus EeePad Slider SL101"; }
        else if ("SCH-I869".equals(model)) { return "Samsung Galaxy Win"; }
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
        else if ("SHV-E400K".equals(model)) { return "Samsung Galaxy Golden"; }
        else if ("SHV-E400S".equals(model)) { return "Samsung Galaxy Golden"; }
        else if ("SM-G530F".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G530M".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SAMSUNG-SM-T337A".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SGH-T769".equals(model)) { return "Samsung Galaxy S Blaze"; }
        else if ("SAMSUNG-SGH-I727".equals(model)) { return "Samsung Skyrocket"; }
        else if ("SM-G155S".equals(model)) { return "Samsung Galaxy Folder"; }
        else if ("SM-G930W8".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SGH-T959W".equals(model)) { return "Samsung Galaxy S"; }
        else if ("SGH-T959V".equals(model)) { return "Samsung Galaxy S 4G"; }
        else if ("SGH-T959P".equals(model)) { return "Samsung Galaxy S Fascinate"; }
        else if ("SGH-T959D".equals(model)) { return "Samsung Galaxy S Vibrant"; }
        else if ("S3T7IN3G".equals(model)) { return "Auchan S3T7IN3G"; }
        else if ("SM-G928N0".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SCH-R730".equals(model)) { return "Samsung Transfix"; }
        else if ("SDU".equals(model)) { return "Panasonic SDU"; }
        else if ("SNB02-NV7A".equals(model)) { return "Nabi 2S Tablet"; }
        else if ("SHW-M300W".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("SGP321".equals(model)) { return "Sony Ericsson Xperia Tablet Z"; }
        else if ("SM-J700T1".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("sp401".equals(model)) { return "Sourcing Creation sp401"; }
        else if ("SCH-R920".equals(model)) { return "Samsung Galaxy Attain"; }
        else if ("SM-G318HZ".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SCH-i559".equals(model)) { return "Samsung Galaxy Pop (CDMA)"; }
        else if ("SM-G9006W".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("Smartphone Android by SFR STARADDICT II".equals(model)) { return "TCT (Alcatel) Smartphone Android by SFR STARADDICT II"; }
        else if ("SAMSUNG-SGH-I497".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("SM-G130M".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("SM-G130H".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("SM-G130E".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("Starmobile KNIGHT".equals(model)) { return "Cellon Starmobile KNIGHT"; }
        else if ("SGH-T959".equals(model)) { return "Samsung Galaxy S Vibrant"; }
        else if ("SM-T357W".equals(model)) { return "Samsung Galaxy Tab A S 8.0"; }
        else if ("SM-T357T".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SKY IM-A600S".equals(model)) { return "Pantech Sirius"; }
        else if ("SM-T377R4".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("S8-821w".equals(model)) { return "Huawei t1_8p0lte"; }
        else if ("SM-J200GU".equals(model)) { return "Samsung Galaxy J2"; }
        else if ("SCH-R720".equals(model)) { return "Samsung Admire"; }
        else if ("SM-S765C".equals(model)) { return "Samsung Galaxy Ace Style"; }
        else if ("SHV-E300".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("S550".equals(model)) { return "Positivo S550"; }
        else if ("SC-01C".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SC-01D".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("SC-01E".equals(model)) { return "Samsung Galaxy Tab 7.7 Plus"; }
        else if ("SC-01F".equals(model)) { return "Samsung SC-01F"; }
        else if ("SC-01G".equals(model)) { return "Samsung SC-01G"; }
        else if ("S4T7IN3G".equals(model)) { return "Auchan S4T7IN3G"; }
        else if ("SM-G3812".equals(model)) { return "Samsung Galaxy Win Pro"; }
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
        else if ("SAMSUNG-SM-G930A".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-G3559".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SM-G355M".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SM-G355H".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SM-G7508Q".equals(model)) { return "Samsung Galaxy Mega2"; }
        else if ("SCL21".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("Samba".equals(model)) { return "Mobicell Samba"; }
        else if ("SM-G928V".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
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
        else if ("SBM204SH".equals(model)) { return "Sharp SBM204SH"; }
        else if ("Smart 403".equals(model)) { return "FarEasTone Smart 403"; }
        else if ("Smart 401".equals(model)) { return "BYD Smart 401"; }
        else if ("SHV-E250S".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("SHV-E250L".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("SM-T585N0".equals(model)) { return "Samsung Galaxy Tab A 10.1"; }
        else if ("SHV-E250K".equals(model)) { return "Samsung Galaxy Note 2"; }
        else if ("SM-T377P".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SM-T377T".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SM-T377V".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SM-T377W".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SCH-I535".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SCH-I829".equals(model)) { return "Samsung Galaxy Style Duos"; }
        else if ("San Francisco".equals(model)) { return "ZTE Blade"; }
        else if ("S6s".equals(model)) { return "Gionee S6s"; }
        else if ("SM-G361H".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-G361M".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-G361F".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SBM205SH".equals(model)) { return "Sharp AQUOS PHONE ss 205SH"; }
        else if ("SCH-I759".equals(model)) { return "Samsung Galaxy Infinite"; }
        else if ("S39h".equals(model)) { return "Sony Ericsson Xperia C"; }
        else if ("S60".equals(model)) { return "Southern Telecom Polaroid Snap S60"; }
        else if ("SGH-I337M".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("StarTrail TT".equals(model)) { return "Tunisie Telecom Star Trail by TT"; }
        else if ("SM-J500M".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SHW-M250S".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SHW-M250L".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SHW-M250K".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SGP512".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SGP511".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SM-T815C".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-T815Y".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SAMSUNG-SGH-I897".equals(model)) { return "Samsung Captivate"; }
        else if ("SAMSUNG-SGH-I547".equals(model)) { return "Samsung Galaxy Rugby Pro"; }
        else if ("Shine".equals(model)) { return "Explay Shine"; }
        else if ("SCH-R880".equals(model)) { return "Samsung Acclaim"; }
        else if ("SM-J120F".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-J120G".equals(model)) { return "Samsung Galaxy J1(2016)"; }
        else if ("SCH-i929".equals(model)) { return "Samsung Galaxy S2 Duos"; }
        else if ("SM-J120M".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-J120H".equals(model)) { return "Samsung Galaxy J1(2016)"; }
        else if ("SM-J120W".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SGH-I927".equals(model)) { return "Samsung Captivate Glide"; }
        else if ("SCH-I699I".equals(model)) { return "Samsung China Telecom"; }
        else if ("SH8128U".equals(model)) { return "Sharp SH8128U"; }
        else if ("SM-G850FQ".equals(model)) { return "Samsung Galaxy Alpha"; }
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
        else if ("S3T10IN3G".equals(model)) { return "Auchan S3T10IN3G"; }
        else if ("SM-G550T".equals(model)) { return "Samsung Galaxy On5"; }
        else if ("SAMSUNG-SGH-I957".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SM-G935W8".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SPH-P100".equals(model)) { return "Samsung Galaxy Tab 7.0"; }
        else if ("SmartTab10".equals(model)) { return "ZTE SmartTab10"; }
        else if ("SM-J5007".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SCL-CL00".equals(model)) { return "Huawei Honor 4A"; }
        else if ("Smart-Ex 201".equals(model)) { return "Sonimtech XP7"; }
        else if ("SMART Start".equals(model)) { return "ZTE V815W"; }
        else if ("SGH-T999".equals(model)) { return "Samsung Galaxy S III"; }
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
        else if ("Simba SX1".equals(model)) { return "GSmart Simba SX1"; }
        else if ("SC-05D".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("Signature Touch L".equals(model)) { return "Vertu Signature Touch"; }
        else if ("SPH-L710".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SM-T550X".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SAMSUNG-SGH-I747".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SM-A510F".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510K".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510L".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510M".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510S".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510X".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A510Y".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-T530NU".equals(model)) { return "Samsung Galaxy Tab 4 10.1"; }
        else if ("SM-T561".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SM-T560".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SM-T530NN".equals(model)) { return "Samsung Galaxy Tab4"; }
        else if ("SM-N900".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-A5100".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-A5108".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-G720N0".equals(model)) { return "Samsung Galaxy Grand-Max"; }
        else if ("SM-A9100".equals(model)) { return "Samsung Galaxy A9 Pro"; }
        else if ("SGH-T879".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SRF79".equals(model)) { return "Smartab SRF79"; }
        else if ("SM-A910F".equals(model)) { return "Samsung Galaxy A9 Pro"; }
        else if ("SO-02C".equals(model)) { return "Sony Ericsson Xperia Acro"; }
        else if ("SO-02D".equals(model)) { return "Sony Ericsson Xperia S"; }
        else if ("SO-02F".equals(model)) { return "Sony Xperia Z1f"; }
        else if ("SH-09D".equals(model)) { return "Sharp AQUOS PHONE ZETA SH-09D"; }
        else if ("SM-N910T3".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-G3502C".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SBM009SH".equals(model)) { return "Sharp AQUOS PHONE THE PREMIUM SoftBank 009SH"; }
        else if ("Smartfren Andromax AD681H".equals(model)) { return "Haier Smartfren Andromax AD681H"; }
        else if ("SH-06DNERV".equals(model)) { return "Sharp SH-06D NERV"; }
        else if ("SM-A300XZ".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-J320R4".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SMART 4G HD Voice".equals(model)) { return "Hisense M821T"; }
        else if ("SM-G530R4".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-J320VPP".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-J105B".equals(model)) { return "Samsung Galaxy J1 Mini"; }
        else if ("SM-J105M".equals(model)) { return "Samsung Galaxy J1 Mini"; }
        else if ("SM-J105H".equals(model)) { return "Samsung Galaxy J1 Mini"; }
        else if ("SM-J105Y".equals(model)) { return "Samsung Galaxy J1 Mini"; }
        else if ("STARSHINE 4".equals(model)) { return "Hisense STARSHINE 4"; }
        else if ("SM-T805Y".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805S".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805W".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805K".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805L".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805M".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SLIDE".equals(model)) { return "Wiko SLIDE"; }
        else if ("SM-T677NK".equals(model)) { return "Samsung Galaxy view"; }
        else if ("SM-T677NL".equals(model)) { return "Samsung Galaxy view"; }
        else if ("SM-J3109".equals(model)) { return "Samsung Galaxy J3"; }
        else if ("Smartphone Android by SFR STARXTREM II".equals(model)) { return "TCT (Alcatel) POP S9"; }
        else if ("SZJ-JS101".equals(model)) { return "Fujitsu SZJ-JS101"; }
        else if ("SM-T800".equals(model)) { return "Samsung Galaxy Tab S 10.5"; }
        else if ("SM-T807".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T805".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SHV-E210S".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SHV-E210K".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SHV-E210L".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("ST7001".equals(model)) { return "Essentielb ST7001 Tablet"; }
        else if ("SAMSUNG-SM-N920A".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("S350".equals(model)) { return "BYD Solo S350"; }
        else if ("Skill".equals(model)) { return "Haier Skill"; }
        else if ("SBM302SH".equals(model)) { return "Sharp AQUOS PHONE Xx 302SH"; }
        else if ("SM-C111".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("ST18i".equals(model)) { return "Sony Ericsson Xperia ray"; }
        else if ("SM-C115".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("SAMSUNG-SGH-I896".equals(model)) { return "Samsung Galaxy S Captivate"; }
        else if ("SM-T819Y".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SGP551".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SM-T819C".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-N9109W".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-G3812B".equals(model)) { return "Samsung Galaxy S3 Slim"; }
        else if ("SPH-D710VMUB".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("SBM107SHB".equals(model)) { return "Sharp SoftBank 107SH B"; }
        else if ("SM-T587".equals(model)) { return "Samsung Galaxy Tab A 10.1"; }
        else if ("SM-T580".equals(model)) { return "Samsung Galaxy Tab A 10.1"; }
        else if ("SM-J710F".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-J710K".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-J7109".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-J7108".equals(model)) { return "Samsung Galaxy J7(2016)"; }
        else if ("SM-G310HN".equals(model)) { return "Samsung Galaxy Ace Style"; }
        else if ("SH-07E".equals(model)) { return "Sharp AQUOS PHONE si SH-07E"; }
        else if ("SHT21".equals(model)) { return "Sharp AQUOS PAD SHT21"; }
        else if ("SHT22".equals(model)) { return "Sharp AQUOS PAD  SHT22"; }
        else if ("SOL25".equals(model)) { return "Sony Xperia ZL2"; }
        else if ("SOL24".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("SOL26".equals(model)) { return "Sony Xperia Z3"; }
        else if ("SOL21".equals(model)) { return "Sony Ericsson Xperia VL"; }
        else if ("SOL23".equals(model)) { return "Sony Xperia Z1"; }
        else if ("SOL22".equals(model)) { return "Sony Ericsson Xperia UL"; }
        else if ("SAMSUNG-SM-G920AZ".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-N9150".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-G360BT".equals(model)) { return "Samsung Galaxy Win2"; }
        else if ("Smart Monitor 17".equals(model)) { return "Panasonic SM17"; }
        else if ("SM-N915F".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915L".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915K".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915T".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915V".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915P".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915S".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-N915X".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SAF3011".equals(model)) { return "Gigabyte SAF3011"; }
        else if ("SM-G530T1".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SproutChannelCubby".equals(model)) { return "Ematic Sprout Channel Cubby"; }
        else if ("SM-G901F".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G5309W".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G130HN".equals(model)) { return "Samsung Galaxy Young2"; }
        else if ("SAMSUNG-SGH-I337".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-T230NU".equals(model)) { return "Samsung Galaxy Tab 4"; }
        else if ("SM-T230NT".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T807V".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T807T".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SM-T807P".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SHW-M110S".equals(model)) { return "Samsung Galaxy S"; }
        else if ("SPH-P500".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("SPH-M950".equals(model)) { return "Samsung Galaxy Reverb"; }
        else if ("SPH-M820-BST".equals(model)) { return "Samsung Galaxy Prevail"; }
        else if ("SHW-M290K".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("SHW-M290S".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("SBM003SH".equals(model)) { return "Sharp GALAPAGOS SoftBank 003SH"; }
        else if ("SM-G925R4".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925R7".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G925R6".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SKY IM-A650S".equals(model)) { return "Pantech Vega"; }
        else if ("SM-J320G".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SGP712".equals(model)) { return "Sony Xperia Z4 tablet"; }
        else if ("Smartfren Andromax AD6B1H".equals(model)) { return "Haier AD6B1H"; }
        else if ("SM-G110M".equals(model)) { return "Samsung Galaxy Pocket2"; }
        else if ("SM-G110H".equals(model)) { return "Samsung Galaxy Pocket2"; }
        else if ("SM-G110B".equals(model)) { return "Samsung Galaxy Pocket2"; }
        else if ("SAMSUNG-SGH-I527".equals(model)) { return "Samsung Galaxy Mega"; }
        else if ("SPH-M910".equals(model)) { return "Samsung VinsQ(M910)"; }
        else if ("ST700".equals(model)) { return "SMARTAB ST700"; }
        else if ("SCH-R820".equals(model)) { return "Samsung Galaxy Admire"; }
        else if ("SM-T116NY".equals(model)) { return "Samsung Galaxy Tab 3V 7.0"; }
        else if ("SM-T116NU".equals(model)) { return "Samsung Galaxy Tab3V 7.0"; }
        else if ("S4035_4G".equals(model)) { return "TCT (Alcatel) S4035_4G"; }
        else if ("SM-J500N0".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SP-5100".equals(model)) { return "Haier SP-5100"; }
        else if ("SM-T900X".equals(model)) { return "Samsung Galaxy Tab Pro 12.2"; }
        else if ("SH-05G".equals(model)) { return "Sharp AQUOS PAD SH-05G"; }
        else if ("SH-05F".equals(model)) { return "Sharp Disney Mobile on docomo SH-05F"; }
        else if ("SH-05E".equals(model)) { return "Sharp SH-05E"; }
        else if ("SGH-T839".equals(model)) { return "Samsung Sidekick"; }
        else if ("SM-G903F".equals(model)) { return "Samsung Galaxy S5 Neo"; }
        else if ("SM-G903M".equals(model)) { return "Samsung Galaxy S5 Neo"; }
        else if ("SM-G903W".equals(model)) { return "Samsung Galaxy S5 Neo"; }
        else if ("SM-T280".equals(model)) { return "Samsung Galaxy Tab E 7.0"; }
        else if ("SM-T285".equals(model)) { return "Samsung Galaxy Tab E 7.0"; }
        else if ("SM-T287".equals(model)) { return "Samsung Galaxy Tab E 7.0"; }
        else if ("SAMSUNG-SM-G530AZ".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SCH-S735C".equals(model)) { return "Samsung Galaxy Discover"; }
        else if ("STV100-1".equals(model)) { return "BlackBerry PRIV by BlackBerry"; }
        else if ("STV100-3".equals(model)) { return "BlackBerry PRIV by BlackBerry"; }
        else if ("SAMSUNG-SGH-I317".equals(model)) { return "Samsung Galaxy Note II"; }
        else if ("SM-J100MU".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-J100ML".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-G900W8".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SGH-I717R".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("STAIRWAY".equals(model)) { return "Enspert STAIRWAY"; }
        else if ("SGH-I717D".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SBM104SH".equals(model)) { return "Sharp AQUOS PHONE SoftBank 104SH"; }
        else if ("SGH-I717M".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("st70408_4_coho".equals(model)) { return "Trekstor SurfTab xintron i 7.0"; }
        else if ("SM-N920R7".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920R6".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-N920R4".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-T585C".equals(model)) { return "Samsung Galaxy Tab A 10.1"; }
        else if ("SM-J100VPP".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-T710X".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SAMSUNG-SM-J120A".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SK17a".equals(model)) { return "Sony Ericsson Xperia mini pro"; }
        else if ("SM-G750H".equals(model)) { return "Samsung Galaxy Mega2"; }
        else if ("SM-G750F".equals(model)) { return "Samsung Galaxy Mega2"; }
        else if ("SCH-I200".equals(model)) { return "Samsung Galaxy Stellar"; }
        else if ("SBM107SH".equals(model)) { return "Sharp PANTONE 5 SoftBank 107SH"; }
        else if ("Smartfren Andromax NC36B1G".equals(model)) { return "Smartfren NC36B1G"; }
        else if ("Smartfren Andromax NC36B1H".equals(model)) { return "Smartfren AndromaxNC36B1H"; }
        else if ("ST13".equals(model)) { return "Southern Telecom ST13"; }
        else if ("SGP771".equals(model)) { return "Sony Xperia Z4 Tablet"; }
        else if ("SPH-D600".equals(model)) { return "Samsung Conquer 4G"; }
        else if ("SM-G9209".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G9208".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G9200".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-T285M".equals(model)) { return "Samsung Galaxy Tab E 7.0"; }
        else if ("Spice Mi-498H".equals(model)) { return "Spice Dream Uno"; }
        else if ("SM-G920X".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920T".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920V".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920P".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920S".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920L".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SGH-T589".equals(model)) { return "Samsung Galaxy Q"; }
        else if ("SM-G920I".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-G920K".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SM-T677V".equals(model)) { return "Samsung Galaxy View"; }
        else if ("SM-G920F".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SPH-M580BST".equals(model)) { return "Samsung Replenish"; }
        else if ("SH-03C".equals(model)) { return "Sharp LYNX 3D SH-03C"; }
        else if ("SM-G9287C".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SH-03G".equals(model)) { return "Sharp AQUOS ZETA SH-03G"; }
        else if ("SH-03F".equals(model)) { return "Sharp SH-03F"; }
        else if ("SH-03H".equals(model)) { return "Sharp SH-03H"; }
        else if ("SAMSUNG-SM-G930AZ".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SM-J510S".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-J510H".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-J510L".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-T310X".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("SM-J510F".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-J5108".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SAMSUNG-SM-T377A".equals(model)) { return "Samsung Galaxy Tab E 8.0"; }
        else if ("SmartTAB 1002".equals(model)) { return "Teleepoch Essentiel B SmartTab 1002"; }
        else if ("SCH-I925".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-G386T1".equals(model)) { return "Samsung Galaxy Avant"; }
        else if ("ST26i".equals(model)) { return "Sony Xperia J"; }
        else if ("SM-G7105L".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("SM-G7105H".equals(model)) { return "Samsung Galaxy Grand2"; }
        else if ("ST26a".equals(model)) { return "Sony Xperia J"; }
        else if ("SBM102SH".equals(model)) { return "Sharp AQUOS PHONE SoftBank 102SH"; }
        else if ("SM-G360FY".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("S450".equals(model)) { return "Positivo S450"; }
        else if ("SH80F".equals(model)) { return "Sharp SH80F"; }
        else if ("SM-E7009".equals(model)) { return "Samsung Galaxy E7"; }
        else if ("SM-C115M".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("SM-C115L".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("SM-C115W".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("SM-A310X".equals(model)) { return "Samsung Galaxy A3(2016)"; }
        else if ("SM-N915G".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SM-A310M".equals(model)) { return "Samsung Galaxy A3(2016)"; }
        else if ("SGH-T399".equals(model)) { return "Samsung Galaxy Light"; }
        else if ("SH940C-LN".equals(model)) { return "LinkNet Smart Box HD"; }
        else if ("SM-G3589W".equals(model)) { return "Samsung Galaxy Core Lite"; }
        else if ("SM-N9000Q".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("STK Storm 3".equals(model)) { return "Santok Storm 3"; }
        else if ("SGH-T889V".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("SM-G3509I".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SCH-I879E".equals(model)) { return "Samsung Galaxy Grand Neo+"; }
        else if ("SM-G928W8".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SMART Sprint".equals(model)) { return "TPS SMART Sprint"; }
        else if ("SPH-L710T".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SCH-P709".equals(model)) { return "Samsung Galaxy Mega 5.8"; }
        else if ("starTIM tab 7".equals(model)) { return "TCT (Alcatel) EVO7"; }
        else if ("SM-G360M".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-J111M".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("SM-J111F".equals(model)) { return "Samsung Galaxy J1 Ace"; }
        else if ("STUDIO M HD".equals(model)) { return "Blu STUDIO M HD"; }
        else if ("SM-N7500Q".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SH-01H".equals(model)) { return "Sharp AQUOS ZETA SH-01H"; }
        else if ("SH-01G".equals(model)) { return "Sharp AQUOS ZETA SH-01G"; }
        else if ("SH-01F".equals(model)) { return "Sharp AQUOS PHONE ZETA  SH-01F"; }
        else if ("SH-01E".equals(model)) { return "Sharp AQUOS PHONE si SH-01E"; }
        else if ("SH-01D".equals(model)) { return "Sharp AQUOS PHONE SH-01D"; }
        else if ("SM-J700H".equals(model)) { return "Samsung Galaxy J7"; }
        else if ("SCH-I905".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("SCH-I679".equals(model)) { return "Samsung Galaxy Ace3"; }
        else if ("SM-N9005".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-N915W8".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SZJ-JS201".equals(model)) { return "Kyocera SZJ201"; }
        else if ("SPH-L300".equals(model)) { return "Samsung Galaxy Victory"; }
        else if ("SHV-E160L".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SHV-E160K".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SAMSUNG-SGH-I467".equals(model)) { return "Samsung Galaxy Note 8"; }
        else if ("SCH-I915".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("S51SE".equals(model)) { return "Sony Ericsson Xperia mini"; }
        else if ("Speedsurfer".equals(model)) { return "Huawei G535-L11"; }
        else if ("SM-G8508S".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-J510UN".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SM-G9008W".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G5108Q".equals(model)) { return "Samsung Galaxy Core Max Duos"; }
        else if ("SM-G313MY".equals(model)) { return "Samsung Galaxy Ace 4"; }
        else if ("SM-P355C".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-P355M".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-P355Y".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-T337V".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("Slate 21".equals(model)) { return "HP Slate21"; }
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
        else if ("SM-C111M".equals(model)) { return "Samsung Galaxy K Zoom"; }
        else if ("SHW-M485W".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SAMSUNG-SM-J320AZ".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SBM106SH".equals(model)) { return "Sharp AQUOS PHONE Xx SoftBank 106SH"; }
        else if ("SBM101SH".equals(model)) { return "Sharp AQUOS PHONE THE HYBRID SoftBank 101SH"; }
        else if ("SM-W2015".equals(model)) { return "Samsung Galaxy Golden 2"; }
        else if ("SM-W2014".equals(model)) { return "Samsung Montblanc"; }
        else if ("SM-W2016".equals(model)) { return "Samsung W2016"; }
        else if ("SM-T330".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SM-T331".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SCL-TL00".equals(model)) { return "Huawei Honor 4A"; }
        else if ("SHIELD Tablet".equals(model)) { return "NVidia SHIELD Tablet"; }
        else if ("SM-G388F".equals(model)) { return "Samsung Galaxy Xcover3"; }
        else if ("SM-T237P".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SHV-E310L".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SHV-E310K".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SHV-E310S".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SCH-N719".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("SM-T335K".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SM-T335L".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("Si01BE".equals(model)) { return "SiAL Si01BE"; }
        else if ("Si01BB".equals(model)) { return "SiAL Bic camera"; }
        else if ("SM-G935K".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935L".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SENSEIT L301".equals(model)) { return "SENSEIT L301"; }
        else if ("SCH-L710".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("S4S6IN3G".equals(model)) { return "Auchan S4S6IN3G"; }
        else if ("SH-M01".equals(model)) { return "Sharp AQUOS SH-M01"; }
        else if ("SH-M02".equals(model)) { return "Sharp AQUOS SH-M02"; }
        else if ("SM-J500FN".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SAMSUNG-SM-G890A".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SCH-i589".equals(model)) { return "Samsung Galaxy Ace Duos"; }
        else if ("SBM007SHK".equals(model)) { return "Sharp SoftBank 007SH KT"; }
        else if ("SBM007SHJ".equals(model)) { return "Sharp AQUOS PHONE THE HYBRID SoftBank 007SH J"; }
        else if ("SmartTab_8004".equals(model)) { return "Sourcing Creation SmartTab_8004"; }
        else if ("SELFY".equals(model)) { return "Wiko SELFY"; }
        else if ("SHV-E160S".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SM-T520CC".equals(model)) { return "Samsung Galaxy Tab Pro 10.1 Chef Collection"; }
        else if ("SM-G360HU".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-J320N0".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-G920R".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SH-M02-EVA20".equals(model)) { return "Sharp AQUOS SH-M02-EVA20"; }
        else if ("SM-N750".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("S3T7IN".equals(model)) { return "Auchan S3T7IN"; }
        else if ("SM-A500Y".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500X".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500S".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("STARSHINE III".equals(model)) { return "U606 Hisense"; }
        else if ("SM-N910W8".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-G3556D".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SM-A500H".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500K".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500M".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500L".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("Smartphone_Android_by_SFR_STARADDICT_II".equals(model)) { return "TCT (Alcatel) Smartphone Android by SFR STARADDICT II"; }
        else if ("SM-A500G".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500F".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SC-05G".equals(model)) { return "Samsung SC-05G"; }
        else if ("SM-T217S".equals(model)) { return "Samsung Galaxy Tab 3 7.0"; }
        else if ("SM-T217T".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SM-T315".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("SM-T312".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("SM-T310".equals(model)) { return "Samsung Galaxy Tab 3 8.0"; }
        else if ("SM-T311".equals(model)) { return "Samsung Galaxy Tab3 8.0"; }
        else if ("S6Plus".equals(model)) { return "Claresta S6Plus"; }
        else if ("SM-A5009".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A5000".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-G870F".equals(model)) { return "Samsung Galaxy S5 Active"; }
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
        else if ("SUNSET2".equals(model)) { return "Wiko SUNSET2"; }
        else if ("SM-T815N0".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("SM-N750L".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SM-P607T".equals(model)) { return "Samsung Galaxy Note 10.1 2014 Edition"; }
        else if ("SM-N750K".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SM-N750S".equals(model)) { return "Samsung Galaxy Note3 Neo"; }
        else if ("SP355AWG".equals(model)) { return "BYD SP355AWG"; }
        else if ("S201".equals(model)) { return "SK Telesys K2401"; }
        else if ("SM-N900T".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SBM006SH".equals(model)) { return "Sharp AQUOS PHONE SoftBank 006SH"; }
        else if ("S8-701w".equals(model)) { return "Huawei t1_8p0"; }
        else if ("S8-701u".equals(model)) { return "Huawei t1_8p0"; }
        else if ("SM-G9287".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G9280".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-N900W8".equals(model)) { return "Samsung Galaxy Note 3"; }
        else if ("SM-N900K".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("Smart-Ex 01".equals(model)) { return "Sonimtech XP7700Z1"; }
        else if ("SM-G928G".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928F".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928C".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928L".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928I".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928K".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928T".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-T537V".equals(model)) { return "Samsung Galaxy Tab4 10.0"; }
        else if ("SM-G928P".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SM-G928S".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SAMSUNG-SM-G900AZ".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G928X".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SGH-S959G".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SCH-S950C".equals(model)) { return "Samsung Galaxy S"; }
        else if ("Selecline 10".equals(model)) { return "Archos Auchan Selecline 10"; }
        else if ("SM-J100Y".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-G600FY".equals(model)) { return "Samsung Galaxy On7"; }
        else if ("SM-G313M".equals(model)) { return "Samsung Galaxy Ace 4"; }
        else if ("SM-G313H".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SM-G313F".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SM-J320P".equals(model)) { return "Samsung Galaxy J3"; }
        else if ("SHW-M585D".equals(model)) { return "Samsung Galaxy Core Safe"; }
        else if ("SM-J320V".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-J320Y".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SAMSUNG-SM-N910A".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-J320F".equals(model)) { return "Samsung Galaxy J3"; }
        else if ("SM-J320H".equals(model)) { return "Samsung Galaxy J3"; }
        else if ("SCH-I619".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("SM-J320M".equals(model)) { return "Samsung Galaxy J3"; }
        else if ("STARADDICT II Plus".equals(model)) { return "ZTE Grand X In"; }
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
        else if ("SM-T211M".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SM-S906L".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SJ1-5".equals(model)) { return "Obi OBJ SJ1.5"; }
        else if ("Spice Mi-515".equals(model)) { return "Coolpad7295I"; }
        else if ("SCH-I400".equals(model)) { return "Samsung Galaxy S Continuum"; }
        else if ("SCH-I405".equals(model)) { return "Samsung Stratosphere"; }
        else if ("SOT31".equals(model)) { return "Sony Xperia Z4 Tablet"; }
        else if ("SM-P605V".equals(model)) { return "Samsung Galaxy Note 10.1 2014 Edition"; }
        else if ("SCH-I435".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SM-P605S".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SM-P605M".equals(model)) { return "Samsung Galaxy Note 10.1 2014 Edition"; }
        else if ("SM-P605K".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("Soshphone 4G".equals(model)) { return "ZTE Soshphone 4G"; }
        else if ("st70408_4".equals(model)) { return "Trekstor SurfTab xintron i 7.0"; }
        else if ("SAMSUNG-SM-T537A".equals(model)) { return "Samsung Galaxy Tab4 10.0"; }
        else if ("SPH-L600".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SM-A5100X".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-G730W8".equals(model)) { return "Samsung Galaxy S3 Mini"; }
        else if ("SMART63".equals(model)) { return "Binatone Smart 63"; }
        else if ("SMART66".equals(model)) { return "Binatone Smart 66"; }
        else if ("SMART64".equals(model)) { return "Binatone SMART64"; }
        else if ("SHW-M100S".equals(model)) { return "Samsung Galaxy A"; }
        else if ("SPH-P600".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("STB8098".equals(model)) { return "Avoca STB8098"; }
        else if ("SAMSUNG-SM-G928A".equals(model)) { return "Samsung Galaxy S6 Edge+"; }
        else if ("SGH-I748".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("SM-G313ML".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SM-G313MU".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SCH-i909".equals(model)) { return "Samsung Galaxy S"; }
        else if ("SM-G530BT".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SKT01".equals(model)) { return "Kyocera TORQUE"; }
        else if ("SAMSUNG-SM-G870A".equals(model)) { return "Samsung Galaxy S5 Active"; }
        else if ("Smartfren Andromax AD9A1H".equals(model)) { return "Haier Smartfren Andromax AD9A1H"; }
        else if ("SM-T562".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("SH-10D".equals(model)) { return "Sharp AQUOS PHONE sv SH-10D"; }
        else if ("SH-10B".equals(model)) { return "Sharp LYNX SH-10B"; }
        else if ("SM-G389F".equals(model)) { return "Samsung Galaxy Xcover3"; }
        else if ("S5.1".equals(model)) { return "Gionee S5.1"; }
        else if ("S5.5".equals(model)) { return "Gionee S5.5"; }
        else if ("SM-T350".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SM-T355".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("SpeedTAB".equals(model)) { return "HUAWEI MediaPad 10 Link+"; }
        else if ("SM-T239M".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T239C".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T2397".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-G316ML".equals(model)) { return "Samsung Galaxy Ace4 Neo"; }
        else if ("SM-G316MY".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SM-G316H".equals(model)) { return "Samsung Galaxy Ace4"; }
        else if ("SPH-D710".equals(model)) { return "Samsung Epic"; }
        else if ("SCT21".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("STARADDICT III".equals(model)) { return "Coolpad STARADDICT III"; }
        else if ("Swift_Plus".equals(model)) { return "AG Mobile Swift_Plus"; }
        else if ("SM-G935F".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935X".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935S".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935P".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935V".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935U".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-G935T".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SCH-R950".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("Spice Mi-496".equals(model)) { return "Coolpad Spice Mi-496"; }
        else if ("Spice Mi-498".equals(model)) { return "Spice Dream Uno"; }
        else if ("SCL-AL00".equals(model)) { return "Huawei Honor 4A"; }
        else if ("SM-G9350".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SM-J3110".equals(model)) { return "Samsung Galaxy J3 Pro"; }
        else if ("Smartfren Andromax AD682H".equals(model)) { return "Smartfren Andromax AD682H"; }
        else if ("SM-G900FG".equals(model)) { return "Samsung Galaxy S5 Google Play Edition"; }
        else if ("SM-G900FD".equals(model)) { return "Samsung Galaxy S5 Dual SIM"; }
        else if ("SM-G900FQ".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SH631W".equals(model)) { return "Foxconn SHARP SH631W"; }
        else if ("SO-02H".equals(model)) { return "Sony Xperia Z5 Compact"; }
        else if ("SO-02E".equals(model)) { return "Sony Ericsson Xperia Z"; }
        else if ("SO-02G".equals(model)) { return "Sony Xperia Z3 Compact"; }
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
        else if ("SHV-E470S".equals(model)) { return "Samsung Galaxy S4 Active"; }
        else if ("S4S5IN3G".equals(model)) { return "Auchan S4S5IN3G"; }
        else if ("SM-T807R4".equals(model)) { return "Samsung Galaxy TabS 10.5"; }
        else if ("SGP412".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("SM-P605L".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SPH-D700".equals(model)) { return "Samsung Epic 4G"; }
        else if ("SM-T110".equals(model)) { return "Samsung Galaxy Tab3 Lite"; }
        else if ("SM-T111".equals(model)) { return "Samsung Galaxy Tab3 Lite"; }
        else if ("SM-T113".equals(model)) { return "Samsung Galaxy Tab3 Lite 7.0"; }
        else if ("SM-T116".equals(model)) { return "Samsung Galaxy Tab3 VE 7.0"; }
        else if ("SGH-T589R".equals(model)) { return "Samsung Galaxy Q"; }
        else if ("SGH-T589W".equals(model)) { return "Samsung Galaxy Q"; }
        else if ("SM-G910S".equals(model)) { return "Samsung Galaxy Round"; }
        else if ("SM-T113NU".equals(model)) { return "Samsung Galaxy Tab3V 7.0"; }
        else if ("SHW-M190S".equals(model)) { return "Samsung Galaxy S"; }
        else if ("SGH-S970G".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-G850M".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("STUDIO 5.5 HD".equals(model)) { return "Blu Studio 5.5 HD"; }
        else if ("SM-G850Y".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850X".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SMT-i9100".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SM-G850S".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850W".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850K".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850L".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G850F".equals(model)) { return "Samsung Galaxy Alpha"; }
        else if ("SM-G350E".equals(model)) { return "Samsung Galaxy Star2 Plus"; }
        else if ("SM-G350M".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SM-G930T1".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SPH-M840".equals(model)) { return "Samsung Galaxy Prevail 2"; }
        else if ("S8-303LT".equals(model)) { return "HUAWEI MediaPad M1 8.0"; }
        else if ("SM-G3502".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SGH-I537".equals(model)) { return "Samsung Galaxy S4 Active"; }
        else if ("SM-G3508".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SM-T2519".equals(model)) { return "Samsung Galaxy Tab Q"; }
        else if ("SM-N915FY".equals(model)) { return "Samsung Galaxy Note Edge"; }
        else if ("SHV-E270L".equals(model)) { return "Samsung Baffin"; }
        else if ("SM-G318H".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SGH-I957D".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SK17i".equals(model)) { return "Sony Ericsson Xperia mini pro"; }
        else if ("SGH-I957M".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SGH-T989D".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("STUDIO ENERGY 2".equals(model)) { return "Blu SUTDIO ENERGY 2"; }
        else if ("SGH-I957R".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SCH-I110".equals(model)) { return "Samsung Illusion"; }
        else if ("SBM203SH".equals(model)) { return "Sharp SoftBank AQUOS PHONE Xx 203SH"; }
        else if ("sico pro".equals(model)) { return "Sico SmartPhone SSR1-5-8M"; }
        else if ("SM-A300XU".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SGP351".equals(model)) { return "Sony Xperia Tablet Z"; }
        else if ("SM-G318MZ".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SM-G318ML".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("SAMSUNG-SM-C105A".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-G5108".equals(model)) { return "Samsung Galaxy Core Max"; }
        else if ("SAMSUNG-SGH-I257".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SM-G350L".equals(model)) { return "Samsung Galaxy Core Plus"; }
        else if ("SHV-E500S".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("SHV-E500L".equals(model)) { return "Samsung Galaxy Win"; }
        else if ("SCH-R970".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-T705".equals(model)) { return "Samsung Galaxy TabS 8.4"; }
        else if ("SM-T700".equals(model)) { return "Samsung Galaxy Tab S"; }
        else if ("SCH-i509".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("SGH-I717".equals(model)) { return "Samsung Galaxy Note"; }
        else if ("SGH-T859".equals(model)) { return "Samsung Galaxy Tab 10.1"; }
        else if ("SGH-T699".equals(model)) { return "Samsung Galaxy S Relay"; }
        else if ("SM-T325".equals(model)) { return "Samsung Galaxy Tab Pro 8.4"; }
        else if ("SGH-I467M".equals(model)) { return "Samsung Galaxy Note 8.0"; }
        else if ("SM-G530R7".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SAMSUNG-SM-G925A".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-G530FZ".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G3509".equals(model)) { return "Samsung Galaxy Trend3"; }
        else if ("SM-A710X".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-A710Y".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-A710S".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-N9200".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SM-J320FN".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-A710L".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-A710M".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-A710F".equals(model)) { return "Samsung Galaxy A7(2016)"; }
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
        else if ("SM-A500F1".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-A500YZ".equals(model)) { return "Samsung Galaxy A5"; }
        else if ("SM-T111M".equals(model)) { return "Samsung Galaxy Tab3 Lite"; }
        else if ("S30".equals(model)) { return "Cat S30"; }
        else if ("SM-T810X".equals(model)) { return "Samsung Galaxy Tab S2 9.7"; }
        else if ("Smart_TAB_1003s".equals(model)) { return "Sourcing Creation ST1003S"; }
        else if ("SGH-T759".equals(model)) { return "Samsung Exhibit"; }
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
        else if ("SM-J100FN".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("Smartfren Andromax AD688G".equals(model)) { return "Smartfren NEWAD688G"; }
        else if ("SM-G3139D".equals(model)) { return "Samsung Galaxy Ace4 Lite"; }
        else if ("Sparkle V".equals(model)) { return "Karbonn Sparkle V"; }
        else if ("SGP621".equals(model)) { return "Sony Xperia Z3 Tablet Compact"; }
        else if ("SHV-E170L".equals(model)) { return "Samsung Galaxy R-Style"; }
        else if ("SHV-E170K".equals(model)) { return "Samsung Galaxy R-Style"; }
        else if ("SHV-E170S".equals(model)) { return "Samsung Galaxy R-Style"; }
        else if ("SHV-E370K".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SHV-E370D".equals(model)) { return "Samsung Galaxy S4 Mini"; }
        else if ("SCH-R915".equals(model)) { return "Samsung Galaxy Indulge"; }
        else if ("ST21i2".equals(model)) { return "Sony Ericsson Xperia tipo dual"; }
        else if ("SCH-R910".equals(model)) { return "Samsung Galaxy Indulge"; }
        else if ("S455".equals(model)) { return "Positivo Selfie"; }
        else if ("SAMSUNG-SM-J320A".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SCH-i569".equals(model)) { return "Samsung Galaxy Gio"; }
        else if ("SOSMART_T5".equals(model)) { return "SOSMART T5"; }
        else if ("Spro 2 LTE".equals(model)) { return "ZTE Spro 2"; }
        else if ("STR-9.6-Tablet".equals(model)) { return "MachSpeed STR-9.6-Tablet"; }
        else if ("SGH-I727".equals(model)) { return "Samsung Galaxy S2 Skyrocket"; }
        else if ("SM-G920W8".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SC-02H".equals(model)) { return "Samsung SC-02H"; }
        else if ("SC-02E".equals(model)) { return "Samsung Galaxy Note2"; }
        else if ("SC-02D".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("SC-02G".equals(model)) { return "Samsung SC-02G"; }
        else if ("SC-02F".equals(model)) { return "Samsung Galaxy Note3"; }
        else if ("SC-02C".equals(model)) { return "Samsung Galaxy S2"; }
        else if ("SC-02B".equals(model)) { return "Samsung Galaxy S"; }
        else if ("Slim_Tab_8".equals(model)) { return "Kiano Slim_Tab_8"; }
        else if ("SCH-I879".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("SCH-I705".equals(model)) { return "Samsung Galaxy Tab2 7.0"; }
        else if ("S57".equals(model)) { return "Acer Liquid Jade Z"; }
        else if ("S56".equals(model)) { return "Acer Liquid Jade S"; }
        else if ("S55".equals(model)) { return "Acer Liquid Jade"; }
        else if ("S53".equals(model)) { return "Acer Liquid X1"; }
        else if ("S50".equals(model)) { return "Cat S50"; }
        else if ("S59".equals(model)) { return "Acer Liquid X2"; }
        else if ("STARTRAIL 6 4G".equals(model)) { return "Hisense STARTRAIL 6 4G"; }
        else if ("STARSHINE II".equals(model)) { return "SFR Star Shine II"; }
        else if ("SGH-T779".equals(model)) { return "Samsung Galaxy Tab2 10.1"; }
        else if ("SM-G531Y".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-G531F".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SM-J510GN".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SH-06D".equals(model)) { return "Sharp AQUOS PHONE SH-06D"; }
        else if ("SM-G531M".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SH-06E".equals(model)) { return "Sharp AQUOS PHONE ZETA SH-06E"; }
        else if ("SUNSET".equals(model)) { return "Wiko SUNSET"; }
        else if ("SM-T707V".equals(model)) { return "Samsung Galaxy Tab S 8.4"; }
        else if ("SM-T255S".equals(model)) { return "Samsung Galaxy W"; }
        else if ("SMT-E5015".equals(model)) { return "Samsung olleh"; }
        else if ("SM-T320X".equals(model)) { return "Samsung Galaxy Tab Pro 8.4"; }
        else if ("S732".equals(model)) { return "Logicom S732"; }
        else if ("SM-E500YZ".equals(model)) { return "Samsung Galaxy E5"; }
        else if ("SCH-R830C".equals(model)) { return "Samsung Galaxy Admire 2"; }
        else if ("SM-J320YZ".equals(model)) { return "Samsung Galaxy J3(2016)"; }
        else if ("SM-G935R4".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SAMSUNG-SM-G800A".equals(model)) { return "Samsung Galaxy S5 mini"; }
        else if ("S952".equals(model)) { return "SELECLINE MID_9526CM"; }
        else if ("SGP641".equals(model)) { return "Sony Xperia Z3 Tablet Compact"; }
        else if ("SGP311".equals(model)) { return "Sony Ericsson Xperia Tablet Z"; }
        else if ("SGP312".equals(model)) { return "Sony Xperia Tablet Z"; }
        else if ("SAMSUNG-SGH-I927".equals(model)) { return "Samsung Captivate Glide"; }
        else if ("Style".equals(model)) { return "Explay Style"; }
        else if ("SGH-I527M".equals(model)) { return "Samsung Galaxy Mega 6.3"; }
        else if ("SCH-R930".equals(model)) { return "Samsung Galaxy S Aviator"; }
        else if ("SM-J100G".equals(model)) { return "Samsung Galaxy J1"; }
        else if ("SM-T212".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SM-T211".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SM-T210".equals(model)) { return "Samsung Galaxy Tab 3"; }
        else if ("SM-T215".equals(model)) { return "Samsung Galaxy Tab3 7.0"; }
        else if ("SGH-N045".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SCH-S968C".equals(model)) { return "Samsung Galaxy S III"; }
        else if ("SGH-I896".equals(model)) { return "Samsung Galaxy S Captivate"; }
        else if ("SAMSUNG-SM-G920A".equals(model)) { return "Samsung Galaxy S6"; }
        else if ("SHW-M570S".equals(model)) { return "Samsung Galaxy Core Advance"; }
        else if ("STARXTREM II".equals(model)) { return "TCT (Alcatel) POP S9"; }
        else if ("SM-P905F0".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-G360T1".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SoshPhone 3".equals(model)) { return "ZTE SoshPhone 3"; }
        else if ("S380".equals(model)) { return "Positivo S380"; }
        else if ("SCH-I815".equals(model)) { return "Samsung Galaxy Tab 7.7"; }
        else if ("SHV-E275S".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("SHV-E275K".equals(model)) { return "Samsung Galaxy Grand"; }
        else if ("SH-01FDQ".equals(model)) { return "Sharp SH-01F DRAGON QUEST"; }
        else if ("S3015".equals(model)) { return "Entel S3015"; }
        else if ("SM-G3815".equals(model)) { return "Samsung Galaxy Express II"; }
        else if ("SM-G3818".equals(model)) { return "Samsung Galaxy Win Pro"; }
        else if ("SM-G3819".equals(model)) { return "Samsung Galaxy Win Pro"; }
        else if ("SM-J510K".equals(model)) { return "Samsung Galaxy J5(2016)"; }
        else if ("SGH-I827D".equals(model)) { return "Samsung Galaxy Ace Q"; }
        else if ("SCV31".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SCV32".equals(model)) { return "Samsung Galaxy A8"; }
        else if ("SCV33".equals(model)) { return "Samsung Galaxy S7 edge"; }
        else if ("S40".equals(model)) { return "Cat S40"; }
        else if ("SM-G3819D".equals(model)) { return "Samsung Galaxy Win Pro"; }
        else if ("SM-J500F".equals(model)) { return "Samsung Galaxy J5"; }
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
        else if ("SM-A510XZ".equals(model)) { return "Samsung Galaxy A5(2016)"; }
        else if ("SM-J5008".equals(model)) { return "Samsung Galaxy J5"; }
        else if ("SM-C105L".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-C105K".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-C105S".equals(model)) { return "Samsung Galaxy S4 Zoom"; }
        else if ("SM-T705M".equals(model)) { return "Samsung Galaxy TabS 8.4"; }
        else if ("SO-05D".equals(model)) { return "Sony Ericsson Xperia SX"; }
        else if ("SM-G930R6".equals(model)) { return "Samsung Galaxy S7"; }
        else if ("SO-05F".equals(model)) { return "Sony Xperia Z2 Tablet"; }
        else if ("SO-05G".equals(model)) { return "Sony Xperia Z4 Tablet"; }
        else if ("SM-T705C".equals(model)) { return "Samsung Galaxy Tab S 8.4"; }
        else if ("SM-T705Y".equals(model)) { return "Samsung Galaxy Tab S 8.4"; }
        else if ("SM-T705W".equals(model)) { return "Samsung Galaxy TabS 8.4"; }
        else if ("Selecline-854599".equals(model)) { return "Auchan Selecline-854599"; }
        else if ("SM-J200BT".equals(model)) { return "Samsung Galaxy J2"; }
        else if ("SOV31".equals(model)) { return "Sony Xperia Z4"; }
        else if ("SOV32".equals(model)) { return "Sony Xperia Z5"; }
        else if ("SM-T715N0".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SCH-R970X".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-G870F0".equals(model)) { return "Samsung Galaxy S5 Active"; }
        else if ("SM-T560NU".equals(model)) { return "Samsung Galaxy Tab E 9.6"; }
        else if ("ST18a".equals(model)) { return "Sony Ericsson Xperia ray"; }
        else if ("SB506".equals(model)) { return "Gigabyte SB506"; }
        else if ("SM-T365F0".equals(model)) { return "Samsung Galaxy Tab4 Active"; }
        else if ("SM-G355HQ".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("SHW-M305W".equals(model)) { return "Samsung Galaxy Tab 8.9"; }
        else if ("SM-G355HN".equals(model)) { return "Samsung Galaxy Core2"; }
        else if ("ST17i".equals(model)) { return "Sony Ericsson Xperia active"; }
        else if ("SAMSUNG-SM-G360AZ".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-T235".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T231".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T230".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T232".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SM-T239".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("S4S4IN3G".equals(model)) { return "Auchan S4S4IN3G"; }
        else if ("SM-G800F".equals(model)) { return "Samsung Galaxy S5 Mini"; }
        else if ("SM-G800M".equals(model)) { return "Samsung Galaxy S5 mini"; }
        else if ("SM-G800H".equals(model)) { return "Samsung Galaxy S5 Mini"; }
        else if ("SM-G800X".equals(model)) { return "Samsung Galaxy S5 mini"; }
        else if ("SM-G800Y".equals(model)) { return "Samsung Galaxy S5 mini LTE"; }
        else if ("SM-T335".equals(model)) { return "Samsung Galaxy Tab4 8.0"; }
        else if ("SGH-T989".equals(model)) { return "Samsung Galaxy S II"; }
        else if ("SC-06D".equals(model)) { return "Samsung Galaxy S3"; }
        else if ("ST940I-UP".equals(model)) { return "LGU+ ST940I-UP"; }
        else if ("Siragon SP-5000".equals(model)) { return "Siragon SP-5000"; }
        else if ("SM-T350X".equals(model)) { return "Samsung Galaxy Tab A 8.0"; }
        else if ("S500".equals(model)) { return "Acer CloudMobile S500"; }
        else if ("S504".equals(model)) { return "Logicom S504"; }
        else if ("SM-G3609".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-G3608".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-G3606".equals(model)) { return "Samsung Galaxy Core Prime"; }
        else if ("SM-A710K".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("Spice Mi-506".equals(model)) { return "Spice Stellar Mi-506"; }
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
        else if ("SM-A7108".equals(model)) { return "Samsung Galaxy A7(2016)"; }
        else if ("SM-N920C".equals(model)) { return "Samsung Galaxy Note5"; }
        else if ("SGH-M919V".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SGH-M919N".equals(model)) { return "Samsung Galaxy S4"; }
        else if ("SM-A300FU".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-G930R7".equals(model)) { return "Samsung Galaxy S7"; }
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
        else if ("SO-03G".equals(model)) { return "Sony Xperia Z4"; }
        else if ("SO-03D".equals(model)) { return "Sony Xperia acro HD"; }
        else if ("SO-03E".equals(model)) { return "Sony Ericsson Xperia Tablet Z"; }
        else if ("SH-08E".equals(model)) { return "Sharp AQUOS PAD SH-08E"; }
        else if ("SM-G550T1".equals(model)) { return "Samsung Galaxy On5"; }
        else if ("SGH-T849".equals(model)) { return "Samsung Galaxy Tab"; }
        else if ("SurfTab ST70204-3".equals(model)) { return "Trekstor SurfTab ST70204-3"; }
        else if ("SCH-I100".equals(model)) { return "Samsung Gem"; }
        else if ("SM-N910K".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N910L".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N910C".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-N910G".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-N910F".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-N910X".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N910S".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N910P".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-N910V".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-N910U".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("SM-N910T".equals(model)) { return "Samsung Galaxy Note 4"; }
        else if ("SM-A300YZ".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SHV-E230K".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SHV-E230L".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("SHV-E230S".equals(model)) { return "Samsung Galaxy Note 10.1"; }
        else if ("Skate Pro".equals(model)) { return "ZTE BLADE III"; }
        else if ("SM-N9100".equals(model)) { return "Samsung Galaxy Note4"; }
        else if ("ST21a2".equals(model)) { return "Sony Xperia tipo dual"; }
        else if ("SCH-S738C".equals(model)) { return "Samsung Galaxy Centura"; }
        else if ("SM-G310R5".equals(model)) { return "Samsung Galaxy Ace"; }
        else if ("SM-T237V".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("SGP612".equals(model)) { return "Sony Xperia Z3 Tablet Compact"; }
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
        else if ("SM-T585".equals(model)) { return "Samsung Galaxy Tab A 10.1"; }
        else if ("SM-J3119".equals(model)) { return "Samsung Galaxy J3 Pro"; }
        else if ("SM-A300H".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SM-A300G".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SCH-I509".equals(model)) { return "Samsung Galaxy Y"; }
        else if ("SCH-I500".equals(model)) { return "Samsung Fascinate"; }
        else if ("SM-G925W8".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SM-A300Y".equals(model)) { return "Samsung Galaxy A3"; }
        else if ("SmartTab7".equals(model)) { return "ZTE SmartTab7"; }
        else if ("SH8188U".equals(model)) { return "Sharp SH8188U"; }
        else if ("Smart402".equals(model)) { return "BYD Smart 402"; }
        else if ("S520".equals(model)) { return "Acer Liquid S2"; }
        else if ("STUDIO_G_HD".equals(model)) { return "Blu Studio G HD"; }
        else if ("ST21a".equals(model)) { return "Sony Xperia tipo"; }
        else if ("SH837W".equals(model)) { return "Foxconn SHARP SH837W"; }
        else if ("SCH-I629".equals(model)) { return "Samsung Galaxy Fame"; }
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
        else if ("SM-T116IR".equals(model)) { return "Samsung Galaxy Tab 3 Lite"; }
        else if ("SHW-M130L".equals(model)) { return "Samsung Galaxy U"; }
        else if ("SCH-i705".equals(model)) { return "Samsung Galaxy Tab2 7.0"; }
        else if ("starTIM1".equals(model)) { return "Cellon starTIM1"; }
        else if ("SM-P905".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-P901".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-P900".equals(model)) { return "Samsung Galaxy Note Pro 12.2"; }
        else if ("SM-T330NU".equals(model)) { return "Samsung Galaxy Tab 4 8.0"; }
        else if ("SM-G9250".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("SO-01D".equals(model)) { return "Sony Ericsson Xperia PLAY"; }
        else if ("SO-01E".equals(model)) { return "Sony Ericsson Xperia AX"; }
        else if ("SO-01F".equals(model)) { return "Sony Xperia Z1"; }
        else if ("SO-01G".equals(model)) { return "Sony Xperia Z3"; }
        else if ("SO-01B".equals(model)) { return "Sony Ericsson Xperia X10"; }
        else if ("SO-01C".equals(model)) { return "Sony Ericsson Xperia Arc"; }
        else if ("SH-06F".equals(model)) { return "Sharp AQUOS PAD SH-06F"; }
        else if ("SM-A700FD".equals(model)) { return "Samsung Galaxy A7"; }
        else if ("SmartWatch 3".equals(model)) { return "Sony SmartWatch 3"; }
        else if ("SO-01H".equals(model)) { return "Sony Xperia Z5"; }
        else if ("SGH-T869".equals(model)) { return "Samsung Galaxy Tab 7.0 Plus"; }
        else if ("SKY IM-A630K".equals(model)) { return "Pantech Izar"; }
        else if ("San Remo 4G".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("SM-S978L".equals(model)) { return "Samsung Galaxy E5"; }
        else if ("SGH-T599V".equals(model)) { return "Samsung Galaxy Exhibit"; }
        else if ("SGH-T599N".equals(model)) { return "Samsung Galaxy Exhibit"; }
        else if ("SM-T713".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SM-T710".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SM-T715".equals(model)) { return "Samsung Galaxy Tab S2 8.0"; }
        else if ("SM-T555C".equals(model)) { return "Samsung Galaxy Tab A 9.7"; }
        else if ("SM-G906K".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G906L".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("Spice_MI700".equals(model)) { return "Foxconn CSL Spice MI700"; }
        else if ("SM-G906S".equals(model)) { return "Samsung Galaxy S5"; }
        else if ("SM-G5308W".equals(model)) { return "Samsung Galaxy Grand Prime"; }
        else if ("SAMSUNG-SM-G935A".equals(model)) { return "Samsung Galaxy S7 Edge"; }
        else if ("SGH-T679".equals(model)) { return "Samsung Exhibit II"; }
        else if ("SGH-T499".equals(model)) { return "Samsung Galaxy Mini"; }
        else if ("SGH-N075T".equals(model)) { return "Samsung Galaxy J"; }
        else if ("SCH-W789".equals(model)) { return "Samsung Hennessy"; }
        else if ("SH-07D".equals(model)) { return "Sharp AQUOS PHONE st SH-07D"; }
        else if ("SCL-L01".equals(model)) { return "Huawei Y6"; }
        return "";

    }
    public static String rMethod (String model) {
        if ("RAINBOW UP 4G".equals(model)) { return "Wiko RAINBOW UP 4G"; }
        else if ("R827T".equals(model)) { return "OPPO R827T"; }
        else if ("RubikII7".equals(model)) { return "Plaisio Rubik-II"; }
        else if ("Rook from EE".equals(model)) { return "ZTE Rook from EE"; }
        else if ("R833T".equals(model)) { return "Oppo R833T"; }
        else if ("RCT6293W23".equals(model)) { return "RCA RCT6293W23"; }
        else if ("Remix Mini".equals(model)) { return "Jide Remix Mini"; }
        else if ("RAINBOW 4G".equals(model)) { return "Wiko RAINBOW 4G"; }
        else if ("R815T".equals(model)) { return "Oppo R815T"; }
        else if ("R815W".equals(model)) { return "Oppo R815W"; }
        else if ("R7Plus".equals(model)) { return "Oppo R7 Plus"; }
        else if ("RealPad MA7BX2".equals(model)) { return "ECS RealPad MA7BX2"; }
        else if ("R831K".equals(model)) { return "Oppo R831K"; }
        else if ("R831L".equals(model)) { return "OPPO R831L"; }
        else if ("R800x".equals(model)) { return "Sony Ericsson Xperia PLAY"; }
        else if ("R800i".equals(model)) { return "Sony Ericsson Xperia Play"; }
        else if ("RAINBOW JAM 4G".equals(model)) { return "Wiko RAINBOW LITE 4G"; }
        else if ("R819T".equals(model)) { return "Oppo R819T"; }
        else if ("RCT6573W23".equals(model)) { return "RCA RCT6573W23"; }
        else if ("R45".equals(model)) { return "Revtel R45"; }
        else if ("R831".equals(model)) { return "Oppo R831"; }
        else if ("RTK D1".equals(model)) { return "ZTE Racer"; }
        else if ("RIDGE FAB 4G".equals(model)) { return "Wiko RIDGE FAB 4G"; }
        else if ("RCT6672W23".equals(model)) { return "RCA RCT6672W23"; }
        else if ("R815".equals(model)) { return "Oppo R815"; }
        else if ("RCT6773W22".equals(model)) { return "RCA RCT6773W22"; }
        else if ("Rise".equals(model)) { return "Kyocera Rise"; }
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
        else if ("RAINBOW JAM".equals(model)) { return "Wiko RAINBOW JAM"; }
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
        else if ("RCT6773W22B".equals(model)) { return "RCA 7 Voyager II"; }
        else if ("R2010".equals(model)) { return "OPPO R2010"; }
        else if ("R2017".equals(model)) { return "OPPO R2017"; }
        else if ("RCT6303W87DK".equals(model)) { return "RCA 10 Viking Pro"; }
        else if ("R200".equals(model)) { return "Toughshield R200"; }
        else if ("RIO-L03".equals(model)) { return "HUAWEI G8"; }
        else if ("RCT6213W87DK".equals(model)) { return "RCA 11 Maven Pro"; }
        else if ("RTK V8".equals(model)) { return "ZTE Blade"; }
        else if ("R8106".equals(model)) { return "Oppo R8106"; }
        else if ("R8107".equals(model)) { return "Oppo R5"; }
        else if ("R8109".equals(model)) { return "Oppo R5"; }
        else if ("RPSPE4301".equals(model)) { return "TCT (Alcatel) ALCATEL_one_touch_995"; }
        else if ("RCT6773W42B".equals(model)) { return "RCA RCT6773W42B"; }
        else if ("RAZR HD".equals(model)) { return "MOTOROLA RAZR HD"; }
        else if ("R7Plust".equals(model)) { return "Oppo R7Plust"; }
        else if ("R7plusf".equals(model)) { return "Oppo R7 Plusf"; }
        else if ("Ridge 4G-Fever".equals(model)) { return "Wiko FEVER"; }
        else if ("R831S".equals(model)) { return "OPPO R831S"; }
        else if ("R831T".equals(model)) { return "Oppo R831"; }
        else if ("RCT6203W46L".equals(model)) { return "RCA Pro10 Edition II"; }
        else if ("R830S".equals(model)) { return "OPPO R830S"; }
        else if ("RCT6691W3".equals(model)) { return "RCA RCT6691W3"; }
        else if ("RCT6002W46".equals(model)) { return "RCA RCT6002W46"; }
        else if ("R829".equals(model)) { return "OPPO R829"; }
        else if ("R827".equals(model)) { return "Oppo R827"; }
        else if ("R820".equals(model)) { return "Oppo R820"; }
        else if ("R821".equals(model)) { return "Oppo R821"; }
        else if ("R7c".equals(model)) { return "Oppo R7c"; }
        else if ("R7f".equals(model)) { return "Oppo R7f"; }
        else if ("R7g".equals(model)) { return "Oppo R7g"; }
        else if ("R7s".equals(model)) { return "Oppo R7s"; }
        else if ("RAINBOW".equals(model)) { return "Wiko RAINBOW"; }
        else if ("RCT6272W23".equals(model)) { return "RCA RCT6272W23"; }
        else if ("R6007".equals(model)) { return "OPPO R6007"; }
        else if ("RioPlay".equals(model)) { return "Explay Rio Play"; }
        else if ("ref_SCTF".equals(model)) { return "LGE Smart Dios V8700"; }
        else if ("Racer".equals(model)) { return "ZTE Racer"; }
        else if ("Robin".equals(model)) { return "Nextbit Robin"; }
        else if ("R819".equals(model)) { return "Oppo R819"; }
        else if ("RTC-tablet".equals(model)) { return "Asus RTC-700A"; }
        else if ("ROBBY".equals(model)) { return "Wiko ROBBY"; }
        else if ("RCS13101T".equals(model)) { return "RCA RCS13101T"; }
        else if ("R7007".equals(model)) { return "OPPO R7007"; }
        else if ("R7005".equals(model)) { return "Oppo R7005"; }
        else if ("Redmi 3".equals(model)) { return "Xiaomi Redmi 3"; }
        else if ("RIDGE 4G".equals(model)) { return "Wiko RIDGE 4G"; }
        else if ("R829T".equals(model)) { return "OPPO R829T"; }
        else if ("RAINBOW LITE".equals(model)) { return "Wiko RAINBOW LITE"; }
        else if ("RCT6077W2".equals(model)) { return "RCA RCT6077W2"; }
        else if ("RCT6673W-V1".equals(model)) { return "RCA RCT6673W-V1"; }
        else if ("RS988".equals(model)) { return "LGE LG G5"; }
        else if ("R7t".equals(model)) { return "Oppo R7t"; }
        else if ("R8007".equals(model)) { return "OPPO R8007"; }
        else if ("R8006".equals(model)) { return "OPPO R8006"; }
        else if ("R8001".equals(model)) { return "OPPO R8001"; }
        else if ("R8000".equals(model)) { return "Oppo R8000"; }
        else if ("R800a".equals(model)) { return "Sony Ericsson Xperia PLAY"; }
        else if ("RAINBOW LITE 4G".equals(model)) { return "Wiko RAINBOW LITE 4G"; }
        else if ("R6006".equals(model)) { return "Oppo R6006"; }
        else if ("RCT6103W46".equals(model)) { return "RCA RCT6103W46"; }
        else if ("R1011".equals(model)) { return "Oppo R1011w"; }
        else if ("RAINBOW UP".equals(model)) { return "Wiko RAINBOW UP"; }
        else if ("R800at".equals(model)) { return "Sony Ericsson Xperia PLAY"; }
        else if ("R821T".equals(model)) { return "Oppo R821T"; }
        else if ("R830".equals(model)) { return "OPPO R830"; }
        else if ("R2001".equals(model)) { return "OPPO R2001"; }
        else if ("RTK V9".equals(model)) { return "ZTE V9"; }
        else if ("RCT6077W22".equals(model)) { return "RCA RCT6077W22"; }
        else if ("RCT6378W2".equals(model)) { return "RCA RCT6378W2"; }
        else if ("R823T".equals(model)) { return "Oppo R823T"; }
        else if ("RSEIII".equals(model)) { return "Audi AG RSE-III"; }
        else if ("R370L".equals(model)) { return "Orbic R370H"; }
        else if ("RACER III mini".equals(model)) { return "ZTE RACER III mini"; }
        else if ("Redmi Note 3".equals(model)) { return "Xiaomi Redmi Note 3"; }
        else if ("Redmi Note 2".equals(model)) { return "Xiaomi HM Note 2"; }
        else if ("RCT6203W46".equals(model)) { return "RCA RCT6203W46"; }
        else if ("Roar_A50".equals(model)) { return "Symphony Roar A50"; }
        return "";

    }
    public static String uMethod (String model) {
        if ("umts".equals(model)) { return "Motorola Droid"; }
        else if ("U708".equals(model)) { return "OPPO U708"; }
        else if ("U707".equals(model)) { return "Oppo U707"; }
        else if ("U705W".equals(model)) { return "Oppo Ulike2"; }
        else if ("U9180".equals(model)) { return "ZTE U9180"; }
        else if ("USCCADR3305".equals(model)) { return "Huawei M865"; }
        else if ("UZTE Blade Q Lux".equals(model)) { return "ZTE Blade Q Lux"; }
        else if ("UZTE V790".equals(model)) { return "ZTE UZTE V790"; }
        else if ("U972".equals(model)) { return "Hisense u972"; }
        else if ("U970".equals(model)) { return "Hisense U970"; }
        else if ("UZTE V817".equals(model)) { return "ZTE UZTE V817"; }
        else if ("URBANO PROGRESSO".equals(model)) { return "Kyocera URBANO PROGRESSO"; }
        else if ("U8652".equals(model)) { return "Huawei U8652"; }
        else if ("Ultym 5.2".equals(model)) { return "ZTE Ultym 5.2"; }
        else if ("U705T".equals(model)) { return "OPPO Ulike2"; }
        else if ("UVP Executive".equals(model)) { return "Ubiquiti UVP Executive"; }
        else if ("U707T".equals(model)) { return "Oppo U707T"; }
        else if ("Ultra Energy Plus".equals(model)) { return "Hyundai Ultra Energy Plus"; }
        else if ("UZTE Blade Q Pro".equals(model)) { return "ZTE V831W"; }
        else if ("UVP-X".equals(model)) { return "Ubiquiti UVP-X"; }
        else if ("UZTE V970".equals(model)) { return "ZTE V970"; }
        else if ("UZTE GRAND X Quad".equals(model)) { return "ZTE V987"; }
        else if ("U680C".equals(model)) { return "Teleepoch UMX U680C"; }
        else if ("Ultym5".equals(model)) { return "Huawei G535-L11"; }
        else if ("Ultra Style".equals(model)) { return "Hyundai Ultra Style"; }
        else if ("UZTE V889M".equals(model)) { return "ZTE V889M"; }
        else if ("U FEEL".equals(model)) { return "Wiko U FEEL"; }
        else if ("U3".equals(model)) { return "Oppo U3"; }
        else if ("U2".equals(model)) { return "Anydata HCL ME TABLET PC U2"; }
        else if ("USCC-C6721".equals(model)) { return "Kyocera Hydro XTRM"; }
        else if ("UVP".equals(model)) { return "Ubiquiti UVP"; }
        else if ("Ultra 2".equals(model)) { return "AG Mobile AG Ultra2"; }
        else if ("Ultra Charm".equals(model)) { return "Hyundai Ultra Charm"; }
        else if ("U9500".equals(model)) { return "Huawei Ascend D"; }
        else if ("U966".equals(model)) { return "Hisense U966"; }
        else if ("UZTE V807".equals(model)) { return "ZTE V807"; }
        else if ("UZTE V808".equals(model)) { return "ZTE V808"; }
        else if ("U20a".equals(model)) { return "Sony Ericsson Xperia X10 mini pro"; }
        else if ("U8220PLUS".equals(model)) { return "Huawei U8220"; }
        else if ("USS".equals(model)) { return "Ubiquiti USS"; }
        else if ("U20i".equals(model)) { return "Sony Ericsson Xperia X10 Mini Pro"; }
        else if ("UTA200".equals(model)) { return "SK Telesys UTA200"; }
        else if ("UNO_X8".equals(model)) { return "ODYS UNO X8"; }
        else if ("UVP Pro".equals(model)) { return "Ubiquiti UVP Pro"; }
        else if ("Ultra".equals(model)) { return "AG Mobile ULTRA"; }
        else if ("Ultra Latitude".equals(model)) { return "Hyundai Ultra Latitude"; }
        else if ("U8230".equals(model)) { return "Huawei U8230"; }
        else if ("U675".equals(model)) { return "Teleepoch U675"; }
        else if ("UNO X10".equals(model)) { return "ODYS UNO X10"; }
        else if ("UZTE GRAND V7".equals(model)) { return "ZTE V815W"; }
        else if ("USCC-E6762".equals(model)) { return "Kyocera DuraForce"; }
        else if ("U8100".equals(model)) { return "Huawei T-Mobile Pulse"; }
        else if ("U FEEL LITE".equals(model)) { return "Wiko U FEEL LITE"; }
        else if ("unknown".equals(model)) { return "Motorola Defy"; }
        else if ("Ultra Energy Lite".equals(model)) { return "Hyundai Ultra Energy Lite"; }
        else if ("U98".equals(model)) { return "Hisense HS-U98"; }
        else if ("USCCADR6230US".equals(model)) { return "HTC Wildfire S A515c"; }
        else if ("U8220".equals(model)) { return "Huawei U8220"; }
        else if ("US740".equals(model)) { return "LGE Ally"; }
        return "";

    }
    public static String tMethod (String model) {
        if ("TCL S950T".equals(model)) { return "TCT (Alcatel) TCL S950T"; }
        else if ("TL10RA3".equals(model)) { return "Amplify TL10RA3"; }
        else if ("TL10RA2".equals(model)) { return "ECS TL10RA2"; }
        else if ("TCL S820".equals(model)) { return "TCT (Alcatel) TCL S820"; }
        else if ("T705K".equals(model)) { return "Positivo T705"; }
        else if ("TCL D35".equals(model)) { return "TCT (Alcatel) TCL D35"; }
        else if ("TM772".equals(model)) { return "Apex TM772"; }
        else if ("Trio MINI".equals(model)) { return "Trio MINI"; }
        else if ("TBDG1073".equals(model)) { return "Zeki TBDG1073"; }
        else if ("TI320-DU".equals(model)) { return "LGUplus TV G"; }
        else if ("Telenor_One_Touch_C".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 985"; }
        else if ("TURKCELL T60".equals(model)) { return "ZTE TURKCELL T60"; }
        else if ("Tab2A7-20F".equals(model)) { return "Lenovo TAB 2 A7-20F"; }
        else if ("T785B".equals(model)) { return "Haier T785B"; }
        else if ("titan_retbr_dstv".equals(model)) { return "Motorola Moto G"; }
        else if ("TCL S960".equals(model)) { return "TCT (Alcatel) TCL S960"; }
        else if ("TCL P520L".equals(model)) { return "TCT (Alcatel) TCL P520L"; }
        else if ("TegraNote-P1640".equals(model)) { return "NVidia TegraNote"; }
        else if ("T2702".equals(model)) { return "MJS T2702"; }
        else if ("Transformer TF201".equals(model)) { return "Asus Eee Pad Transformer Prime"; }
        else if ("thunderc".equals(model)) { return "LGE Optimus One"; }
        else if ("TC70RA1".equals(model)) { return "ECS TC70RA1"; }
        else if ("T10xTA".equals(model)) { return "Asus T101TA"; }
        else if ("Telenor_One_Touch_S".equals(model)) { return "TCT (Alcatel) ALCATEL_one_touch_995"; }
        else if ("Telpad Quad S".equals(model)) { return "Huawei S7"; }
        else if ("T2HD".equals(model)) { return "Lumigon T2 HD"; }
        else if ("Telcel T20".equals(model)) { return "ZTE V793"; }
        else if ("TM75A-V".equals(model)) { return "Gigabyte TM75A-V"; }
        else if ("TURKCELL TURBO T50".equals(model)) { return "ZTE TURKCELL T50"; }
        else if ("TCL-D668".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH D668"; }
        else if ("Trio-Stealth G4 10.1".equals(model)) { return "Trio-Stealth-G4-101"; }
        else if ("TCL i708U".equals(model)) { return "TCT (Alcatel) TCL i708U"; }
        else if ("TECNO-J8".equals(model)) { return "TECNO-J8"; }
        else if ("TEI11011MST".equals(model)) { return "Mecer TEI11011"; }
        else if ("TECTOYTT2500".equals(model)) { return "Anydata TecToy TT-2500"; }
        else if ("Trio Stealth_10".equals(model)) { return "MachSpeed Trio Stealth_10 Tablet"; }
        else if ("TCL P360W".equals(model)) { return "TCT (Alcatel) TCL P360W"; }
        else if ("TOM007".equals(model)) { return "TCT (Alcatel) P688L"; }
        else if ("Tab2A7-10F".equals(model)) { return "Lenovo TAB 2 A7-10F"; }
        else if ("T012".equals(model)) { return "Acer Liquid Z320"; }
        else if ("TCL J320".equals(model)) { return "TCT (Alcatel) TCL J320"; }
        else if ("TCL_J210".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4010X"; }
        else if ("TL66".equals(model)) { return "Tonino Lamborghini Antares"; }
        else if ("TCLJ330".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("TA80TA1".equals(model)) { return "Tinhvan TA80TA1"; }
        else if ("Trio 7.85 vQ".equals(model)) { return "Trio 7.85 vQ"; }
        else if ("TCL J300".equals(model)) { return "TCT (Alcatel) TCL J300"; }
        else if ("TECNO-N2S".equals(model)) { return "TECNO-N2S"; }
        else if ("tmn smart a60".equals(model)) { return "ZTE tmn smart a60"; }
        else if ("TCL Y910".equals(model)) { return "TCT (Alcatel) TCL Y910"; }
        else if ("Tab734".equals(model)) { return "Intenso Tab734"; }
        else if ("TQ700".equals(model)) { return "GOCLEVER TQ700/QUANTUM 700/TAB"; }
        else if ("T102 PAD".equals(model)) { return "Huawei T102"; }
        else if ("TCL S700T".equals(model)) { return "TCT (Alcatel) TCL S700T"; }
        else if ("Trooper2 45".equals(model)) { return "KAZAM Trooper2 45"; }
        else if ("Turbo-X_epsilon".equals(model)) { return "Plaisio Turbo-X_epsilon"; }
        else if ("TX201LA".equals(model)) { return "ASUS Transformer Book Trio"; }
        else if ("Transformer TF101".equals(model)) { return "Asus Eee Pad Transformer"; }
        else if ("T1-A21w".equals(model)) { return "Huawei T1 10"; }
        else if ("T1-A21L".equals(model)) { return "Huawei T1 10"; }
        else if ("TBQC1063".equals(model)) { return "Zeki TBQC1063B"; }
        else if ("TCL S710".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 997D"; }
        else if ("TVE9603I".equals(model)) { return "Carrefour CT1050"; }
        else if ("TCL 302U".equals(model)) { return "TCT (Alcatel) TCL 302U"; }
        else if ("Tornado".equals(model)) { return "Explay Tornado"; }
        else if ("TM105A".equals(model)) { return "Gigabyte TM105A"; }
        else if ("TCL-D920".equals(model)) { return "TCT (Alcatel) TCL D920"; }
        else if ("TCL C995".equals(model)) { return "TCT (Alcatel) TCL C995"; }
        else if ("T1-A23L".equals(model)) { return "Huawei T1 10"; }
        else if ("TECNO-N6S".equals(model)) { return "TECNO-N6S"; }
        else if ("tmn smart a20".equals(model)) { return "ZTE V887"; }
        else if ("TR10CS2".equals(model)) { return "MG series Any 302"; }
        else if ("TR10CS1".equals(model)) { return "i-Buddie TR10CS1_P"; }
        else if ("TAB-840_G".equals(model)) { return "Anydata Digix TAB-840_G"; }
        else if ("TCL_P689L".equals(model)) { return "TCT (Alcatel) TCL P689L"; }
        else if ("TegraNote-Premium".equals(model)) { return "NVidia TegraNote"; }
        else if ("TCL-S850L".equals(model)) { return "TCT (Alcatel) Idol S"; }
        else if ("TBQG1084".equals(model)) { return "Zeki TBQG1084"; }
        else if ("T-Mobile_G2_Touch".equals(model)) { return "HTC Hero"; }
        else if ("TBDG734".equals(model)) { return "Zeki TBDG734"; }
        else if ("Telenor_Smart_HD".equals(model)) { return "TCT (Alcatel) ALCATEL_one_touch_995"; }
        else if ("Trio-Stealth-G4-7.85".equals(model)) { return "Trio-Stealth-G4-7.85"; }
        else if ("Telekom Puls".equals(model)) { return "TCT (Alcatel) Telekom_Puls"; }
        else if ("T852".equals(model)) { return "Audiovox T852 Tablet"; }
        else if ("TCL S600".equals(model)) { return "TCT (Alcatel) TCL S600"; }
        else if ("TB100".equals(model)) { return "Gigabyte TB100"; }
        else if ("TF101-WiMAX".equals(model)) { return "Asus Eee Pad TF101-WiMAX"; }
        else if ("T-Mobile G2 Touch".equals(model)) { return "HTC Hero"; }
        else if ("Thunder3 45 LTE".equals(model)) { return "KAZAM Thunder 345 LTE"; }
        else if ("TCL-J736L".equals(model)) { return "TCT (Alcatel) TCL 736L"; }
        else if ("TC97RA1".equals(model)) { return "Tekwind TC97RA1"; }
        else if ("T-01D".equals(model)) { return "Fujitsu REGZA Phone T-01D"; }
        else if ("T-01C".equals(model)) { return "Fujitsu REGZA Phone T-01C"; }
        else if ("TRENDY".equals(model)) { return "Mobicell Trendy"; }
        else if ("TM105".equals(model)) { return "Gigabyte TM105"; }
        else if ("TECNO-C9".equals(model)) { return "TECNO-C9"; }
        else if ("TECNO-C8".equals(model)) { return "TECNO-C8"; }
        else if ("TECNO-C5".equals(model)) { return "TECNO-C5"; }
        else if ("T47_09".equals(model)) { return "BenQ T47_09"; }
        else if ("TCL S530T".equals(model)) { return "TCT (Alcatel) TCL S530T"; }
        else if ("TBDG773".equals(model)) { return "Anydata Zeki TBDG773"; }
        else if ("TCL i806".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)"; }
        else if ("TCL P302C".equals(model)) { return "TCT (Alcatel) TCL P302C"; }
        else if ("TA70CA3".equals(model)) { return "Digilite TA70CA3"; }
        else if ("TA70CA2".equals(model)) { return "Digilite TA70CA2"; }
        else if ("TA70CA1".equals(model)) { return "Digilite TA70CA1"; }
        else if ("TCL M2M".equals(model)) { return "TCT (Alcatel) TCL M2M"; }
        else if ("TCL M2U".equals(model)) { return "TCT (Alcatel) TCL M2U"; }
        else if ("Tornado 348".equals(model)) { return "KAZAM Tornado 348"; }
        else if ("TCL S810".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5035D"; }
        else if ("TAB700MPG".equals(model)) { return "Haier TAB-700"; }
        else if ("TCL P606T".equals(model)) { return "TCT (Alcatel) TCL P606"; }
        else if ("T06".equals(model)) { return "Acer Liquid Zest"; }
        else if ("T05".equals(model)) { return "Acer Liquid Z530S"; }
        else if ("T04".equals(model)) { return "Acer Liquid Z630S"; }
        else if ("T02".equals(model)) { return "Acer Liquid Z530"; }
        else if ("T01".equals(model)) { return "Acer Liquid Z330"; }
        else if ("T08".equals(model)) { return "Acer Liquid Zest Plus"; }
        else if ("Tegra Note 7".equals(model)) { return "NVidia TegraNote"; }
        else if ("TIT-AL00".equals(model)) { return "HUAWEI Y6 Pro"; }
        else if ("T-Mobile myTouch 3G".equals(model)) { return "HTC myTouch 3G"; }
        else if ("TT101".equals(model)) { return "ZTE V9"; }
        else if ("Tasty".equals(model)) { return "HighScreen Tasty"; }
        else if ("TBQG855".equals(model)) { return "Zeki TBQG855"; }
        else if ("TRUE BEYOND 4G".equals(model)) { return "Quanta True Beyond 4G"; }
        else if ("TH-65DR800C".equals(model)) { return "Panasonic TH-65DR800C"; }
        else if ("T705".equals(model)) { return "Positivo T705"; }
        else if ("T701".equals(model)) { return "Positivo T701 TV"; }
        else if ("T700".equals(model)) { return "Toughshield T700_TABLET"; }
        else if ("T2".equals(model)) { return "Lumigon T2"; }
        else if ("T3".equals(model)) { return "ZTE T3"; }
        else if ("ThinkVision28".equals(model)) { return "Lenovo ThinkVision28"; }
        else if ("TECNO N5S".equals(model)) { return "TECNO N5S"; }
        else if ("Trooper_X40".equals(model)) { return "KAZAM TROOPER X4.0"; }
        else if ("TCL-P688L".equals(model)) { return "TCT (Alcatel) P688L"; }
        else if ("TP10RA1".equals(model)) { return "ECS TP10RA1"; }
        else if ("TCL S850".equals(model)) { return "TCT (Alcatel) TCL S850"; }
        else if ("T1-701w".equals(model)) { return "Huawei MediaPad"; }
        else if ("T720".equals(model)) { return "Positivo Ypy AB7F"; }
        else if ("TCL H900M".equals(model)) { return "TCT (Alcatel) TCL H900M"; }
        else if ("ThinkPad Tablet".equals(model)) { return "Lenovo Indigo"; }
        else if ("TCL J900".equals(model)) { return "TCT (Alcatel) TCL J900"; }
        else if ("Trekker-M1".equals(model)) { return "Crosscall Trekker- M1"; }
        else if ("T-Mobile Vivacity".equals(model)) { return "ZTE T-Mobile Vivacity"; }
        else if ("TECNO-Y3S".equals(model)) { return "TECNO-Y3S"; }
        else if ("Tab814S".equals(model)) { return "Intenso Tab814S"; }
        else if ("T1 7.0".equals(model)) { return "Huawei MediaPad"; }
        else if ("TCL P332U".equals(model)) { return "TCT (Alcatel) TCL P332U"; }
        else if ("TM101A530L".equals(model)) { return "Nuvision TM101A530L"; }
        else if ("TC55".equals(model)) { return "Zebra TC55"; }
        else if ("TCL J928".equals(model)) { return "TCT (Alcatel) TCL J928"; }
        else if ("TCL J920".equals(model)) { return "TCT (Alcatel) TCL J920"; }
        else if ("TCL Xess P17AA".equals(model)) { return "TCT (Alcatel) TCL_Xess_P17AA"; }
        else if ("TAG Heuer".equals(model)) { return "TAG Heuer Connected"; }
        else if ("TCL S950".equals(model)) { return "TCT (Alcatel) TCL S950"; }
        else if ("TURKCELL T50".equals(model)) { return "ZTE TURKCELL T50"; }
        else if ("Telpad Dual S".equals(model)) { return "Huawei S7"; }
        else if ("Telenor Smart Mini".equals(model)) { return "TCT (Alcatel) Telenor_Smart_Mini"; }
        else if ("TCL J938M".equals(model)) { return "TCT (Alcatel) TCL J938M"; }
        else if ("TCL-J320D".equals(model)) { return "TCT (Alcatel) TCL-J320D"; }
        else if ("TF10EA2".equals(model)) { return "ECS TF10EA2"; }
        else if ("TCL S720".equals(model)) { return "TCT (Alcatel) TCL S720"; }
        else if ("TR10CD3".equals(model)) { return "Amplify TR10CD3"; }
        else if ("TR10CD2".equals(model)) { return "MG series Any 303"; }
        else if ("TR10CD1".equals(model)) { return "i-Buddie TR10CD1_P"; }
        else if ("TECNO-PHANTOM5".equals(model)) { return "TECNO-PHANTOM5"; }
        else if ("TH55DR600C".equals(model)) { return "Panasonic TH-55DR600C"; }
        else if ("TCL T500L".equals(model)) { return "TCT (Alcatel) TCL T500L"; }
        else if ("T1060C".equals(model)) { return "Positivo T1060"; }
        else if ("T1060B".equals(model)) { return "Positivo T1060"; }
        else if ("TM700A520L".equals(model)) { return "Nuvision TM700A520L"; }
        else if ("TBDG874".equals(model)) { return "Zeki TBDG874 Tablet"; }
        else if ("TM75A-V2".equals(model)) { return "i-Buddie TM75A-V2"; }
        else if ("TCL J720".equals(model)) { return "TCT (Alcatel) TCL J720"; }
        else if ("TA71CA2".equals(model)) { return "Vulcan TA71CA2"; }
        else if ("TC75".equals(model)) { return "Zebra Pollux"; }
        else if ("TCL_6110A".equals(model)) { return "TCT (Alcatel) TCL_6110A"; }
        else if ("TC700H".equals(model)) { return "Zebra Pollux"; }
        else if ("T72HM3G".equals(model)) { return "Oysters T72HM3G"; }
        else if ("T4018".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("Turk Telekom TT175".equals(model)) { return "ZTE Turk Telekom TT175"; }
        else if ("TGW801G".equals(model)) { return "Condor TGW801G"; }
        else if ("TGW801L".equals(model)) { return "Condor TGW801L"; }
        else if ("TCL_J706T".equals(model)) { return "TCT (Alcatel) TCL_J706T"; }
        else if ("Turbo-X lamda".equals(model)) { return "Plaisio lamda"; }
        else if ("TE1".equals(model)) { return "Telefunken Enjoy TE1"; }
        else if ("TC80RA1".equals(model)) { return "Ceibal TC80RA1"; }
        else if ("TC80RA6".equals(model)) { return "Ceibal TC80RA6"; }
        else if ("TCL S700".equals(model)) { return "TCT (Alcatel) TCL S700"; }
        else if ("T600M".equals(model)) { return "TCT (Alcatel) 8050E"; }
        else if ("TCL D706".equals(model)) { return "TCT (Alcatel) TCL D706"; }
        else if ("TrioStealth-7".equals(model)) { return "MachSpeed TrioStealth-7"; }
        else if ("TH-55DX600C".equals(model)) { return "Panasonic 55DX600C"; }
        else if ("Telenor_Smart".equals(model)) { return "Telenor Smart"; }
        else if ("Tornado3G".equals(model)) { return "Explay Tornado 3G"; }
        else if ("TCL S900".equals(model)) { return "TCT (Alcatel) TCL S900"; }
        else if ("TOMMY".equals(model)) { return "Wiko TOMMY"; }
        else if ("TREDNY".equals(model)) { return "Mobicell Trendy"; }
        else if ("T801 PAD".equals(model)) { return "Huawei T801"; }
        else if ("TAB-A01-SD".equals(model)) { return "Panasonic TAB-A01"; }
        else if ("TCL P316L".equals(model)) { return "TCT (Alcatel) TCL P316L"; }
        else if ("tolino tab 7".equals(model)) { return "TrekStor tolino tab 7"; }
        else if ("tolino tab 8".equals(model)) { return "Trekstor tolino tab 8"; }
        else if ("Trio Stealth_8".equals(model)) { return "MachSpeed Trio Stealth_8 Tablet"; }
        else if ("Trio Stealth_9".equals(model)) { return "MachSpeed Trio Stealth_9 Tablet"; }
        else if ("T101 PAD".equals(model)) { return "Huawei T101"; }
        else if ("T7".equals(model)) { return "Tobii DynaVox T7"; }
        else if ("Turkcell Maxi Plus 5".equals(model)) { return "ZTE Turkcell Maxi Plus 5"; }
        else if ("TCL Y910T".equals(model)) { return "TCT (Alcatel) TCL Y910T"; }
        else if ("TM9S775".equals(model)) { return "TMAX TM9S775"; }
        else if ("TECNO-N8".equals(model)) { return "TECNO-N8"; }
        else if ("Telenor_SmartPlus".equals(model)) { return "Mobiwire Telenor SmartPlus"; }
        else if ("Trinity T900".equals(model)) { return "ESI Enterprises Trinity T900"; }
        else if ("TCL 6110A".equals(model)) { return "TCT (Alcatel) TCL_6110A"; }
        else if ("TQ150".equals(model)) { return "ZTE TQ150"; }
        else if ("TF101".equals(model)) { return "Asus Eee Pad TF101"; }
        else if ("TCL TAB 7".equals(model)) { return "TCT (Alcatel) ONE TOUCH TAB 7"; }
        else if ("T-101".equals(model)) { return "Huawei T101"; }
        else if ("Titanium".equals(model)) { return "Motorola Opus One"; }
        else if ("TCL i709M".equals(model)) { return "TCT (Alcatel) TCL i718M"; }
        else if ("TCL A990".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("Tab_2".equals(model)) { return "Beeline Tab 2"; }
        else if ("TStick".equals(model)) { return "CCC TSUTAYA Stick"; }
        else if ("TECNO-L6".equals(model)) { return "Tecno Techno L6"; }
        else if ("TECNO-L5".equals(model)) { return "TECNO-L5"; }
        else if ("TC69CA2".equals(model)) { return "ECS TC69CA2"; }
        else if ("TA71CA5".equals(model)) { return "i-Buddie TA71CA5"; }
        else if ("TA71CA1".equals(model)) { return "i-Buddie TA71CA1"; }
        else if ("Telenor Smart Pro 2".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5020D"; }
        else if ("TA71CA3".equals(model)) { return "G53 TA71CA3"; }
        else if ("TCL_S725T".equals(model)) { return "TCT (Alcatel) TCL S725T"; }
        else if ("TCL D768".equals(model)) { return "TCT (Alcatel) TCL D768"; }
        else if ("TA10CA4".equals(model)) { return "i-Buddie TA10CA4"; }
        else if ("TA10CA1".equals(model)) { return "i-Buddie TA10CA1"; }
        else if ("TA10CA3".equals(model)) { return "i-Buddie TA10CA3"; }
        else if ("TA10CA2".equals(model)) { return "i-Buddie TA10CA2"; }
        else if ("T1144".equals(model)) { return "IPRODA T1144"; }
        else if ("Thunder 347".equals(model)) { return "KAZAM Thunder 347"; }
        else if ("TMK27A2".equals(model)) { return "Haier TMK27A2"; }
        else if ("TECNO-J5".equals(model)) { return "TECNO-J5"; }
        else if ("TECNO-J7".equals(model)) { return "TECNO-J7"; }
        else if ("TO101".equals(model)) { return "ZTE V9"; }
        else if ("Trio-Stealth-G4-7".equals(model)) { return "Trio-Stealth G4 7"; }
        else if ("TCL S960T".equals(model)) { return "TCT (Alcatel) TCL S960T"; }
        else if ("TANK 4.5".equals(model)) { return "Compal TANK 4.5"; }
        else if ("TPA60W".equals(model)) { return "Acer TPA60W"; }
        else if ("TCL J610".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 5035D"; }
        else if ("TLINK455".equals(model)) { return "Thomson TLink 455"; }
        else if ("TCL J320T".equals(model)) { return "TCT (Alcatel) TCL J320T"; }
        else if ("TCL J320C".equals(model)) { return "TCT (Alcatel) TCL J320C"; }
        else if ("TCL J600T".equals(model)) { return "TCT (Alcatel) TCL J600T"; }
        else if ("Transformer Prime TF201".equals(model)) { return "Asus Eee Pad Transformer Prime"; }
        else if ("TAB-700".equals(model)) { return "Haier TAB-700"; }
        else if ("TCL-J900C".equals(model)) { return "TCT (Alcatel) TCL-J900C"; }
        else if ("TCL S500".equals(model)) { return "TCT (Alcatel) TCL S500"; }
        else if ("TA10TA2".equals(model)) { return "Vulcan TA10TA2"; }
        else if ("TU7_18222".equals(model)) { return "TUPAD TU7_58212_18222"; }
        else if ("TCL J310".equals(model)) { return "TCT (Alcatel) TCL J310"; }
        else if ("TC8000".equals(model)) { return "Zebra TC8000"; }
        else if ("TDA02".equals(model)) { return "FBC M24IS810"; }
        else if ("tmn smart a15".equals(model)) { return "ZTE tmn smart a15"; }
        else if ("TM785M3".equals(model)) { return "Nuvision TM785M3"; }
        else if ("tmn smart a18".equals(model)) { return "ZTE Grand X"; }
        else if ("TECNO-N2".equals(model)) { return "TECNO-N2"; }
        else if ("TCL Y900".equals(model)) { return "TCT (Alcatel) TCL Y900"; }
        else if ("TCL_U980".equals(model)) { return "TCT (Alcatel) TCL_U980"; }
        else if ("Tab770".equals(model)) { return "Bitmore LUXYA MID704DC Tablet / Bitmore Tab770"; }
        else if ("T1-701u".equals(model)) { return "Huawei MediaPad"; }
        else if ("TH805".equals(model)) { return "Thinpad TH805"; }
        else if ("TP601E".equals(model)) { return "Neffos C5L"; }
        else if ("TP601C".equals(model)) { return "Neffos C5L"; }
        else if ("TP601B".equals(model)) { return "Neffos C5L"; }
        else if ("TP601A".equals(model)) { return "Neffos C5L"; }
        else if ("Torque".equals(model)) { return "Kyocera Torque"; }
        else if ("T-Mobile_G2".equals(model)) { return "T-Mobile G2"; }
        else if ("TC55CH".equals(model)) { return "MotorolaSolutionsInc. TC55CH"; }
        else if ("TCL S520".equals(model)) { return "TCT (Alcatel) TCL S520"; }
        else if ("TCL Y710".equals(model)) { return "TCT (Alcatel) ONE TOUCH SCRIBE 5"; }
        else if ("TCL-J210C".equals(model)) { return "TCT (Alcatel) TCL J210C"; }
        else if ("TBQG774".equals(model)) { return "Zeki TBQG774"; }
        else if ("TM785CH".equals(model)) { return "Apex TM785CH"; }
        else if ("Transformer TF101G".equals(model)) { return "Asus Transformer TF101G"; }
        else if ("TI10RA1".equals(model)) { return "ECS TI10RA1"; }
        else if ("TECNO PP7E-DLA1".equals(model)) { return "Tecno PhonePad 7 II"; }
        else if ("TCL P606".equals(model)) { return "TCT (Alcatel) TCL P606"; }
        else if ("TCL P600".equals(model)) { return "TCT (Alcatel) TCL P606"; }
        else if ("TCL P500M".equals(model)) { return "TCT (Alcatel) TCL P500M"; }
        else if ("TrekStor SurfTab breeze 9.6 quad 3G".equals(model)) { return "Trekstor SurfTab breeze 9.6 quad 3G"; }
        else if ("TECNO H5S".equals(model)) { return "Tecno H5S"; }
        else if ("TAB-740_G".equals(model)) { return "Digix TAB-740_G"; }
        else if ("TCL S300T".equals(model)) { return "TCT (Alcatel) TCL S300T"; }
        else if ("TAB A10-80HC".equals(model)) { return "Lenovo TAB A10-80HC"; }
        else if ("TabMini".equals(model)) { return "Explay Tab Mini"; }
        else if ("TRIO-7.85".equals(model)) { return "TRIO-7.85"; }
        else if ("T1-A22L".equals(model)) { return "Huawei T1 10"; }
        else if ("TCL D40 DUAL".equals(model)) { return "TCT (Alcatel) TCL D40 DUAL"; }
        else if ("TECNO P5S".equals(model)) { return "Techno P5"; }
        else if ("Tostab03".equals(model)) { return "Toshiba AT100"; }
        else if ("TCL J738M".equals(model)) { return "TCT (Alcatel) TCL 738M"; }
        else if ("Tele2_Mini".equals(model)) { return "Tele2 Mini"; }
        else if ("TR10RS1".equals(model)) { return "ECS TR10RS1"; }
        else if ("T1060".equals(model)) { return "Positivo T1060"; }
        else if ("TX201LAF".equals(model)) { return "Asus TX201LAF"; }
        else if ("T-Mobile_myTouch_Q".equals(model)) { return "T-Mobile myTouch Q"; }
        else if ("T1-701ua".equals(model)) { return "Huawei MediaPad"; }
        else if ("TM1088".equals(model)) { return "Nuvision TM1088"; }
        else if ("TCL P631M".equals(model)) { return "TCT (Alcatel) TCL P631M"; }
        else if ("TCL S830U".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("TECNO P3S".equals(model)) { return "Gigabyte TECNO P3S"; }
        else if ("TCL J620".equals(model)) { return "TCT (Alcatel) TCL J620"; }
        else if ("TCL D662".equals(model)) { return "TCT (Alcatel) TCL D662"; }
        else if ("Telpad QS".equals(model)) { return "Huawei S7"; }
        else if ("TCL D668".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH D668"; }
        else if ("T-Mobile G2".equals(model)) { return "HTC G2"; }
        else if ("T55".equals(model)) { return "BenQ T55"; }
        else if ("tolino tab 8.9".equals(model)) { return "TrekStor tolino tab 8.9"; }
        else if ("tmn smart a8".equals(model)) { return "TCT (Alcatel) tmn smarta8"; }
        else if ("tmn smart a7".equals(model)) { return "ZTE tmn smart a7"; }
        else if ("tmn smart a6".equals(model)) { return "ZTE V793"; }
        else if ("TOSPASB".equals(model)) { return "TOSHIBA STB10"; }
        else if ("TCL-P306C".equals(model)) { return "TCT (Alcatel) TCL-P306C"; }
        else if ("TM800A550L".equals(model)) { return "Nuvision TM800A550L"; }
        else if ("TCL_J636D".equals(model)) { return "TCT (Alcatel) TCL_J636D"; }
        else if ("Tactile internet".equals(model)) { return "Huawei T-Mobile Pulse"; }
        else if ("TCL P301C".equals(model)) { return "TCT (Alcatel) TCL P301C"; }
        else if ("TCL P301M".equals(model)) { return "TCT (Alcatel) TCL P301M"; }
        else if ("T47_05".equals(model)) { return "BenQ T47"; }
        else if ("TB01".equals(model)) { return "Huawei M620"; }
        else if ("TAB 7 DUAL CORE".equals(model)) { return "TCT (Alcatel) TAB 7 DUAL CORE"; }
        else if ("T1-821W".equals(model)) { return "Huawei T1"; }
        else if ("T1-821L".equals(model)) { return "Huawei T1"; }
        else if ("T1-821w".equals(model)) { return "Huawei t1_8p0lte"; }
        else if ("TaiWan Mobile T2".equals(model)) { return "ZTE Racer"; }
        else if ("TCL S800".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 997D"; }
        else if ("T70".equals(model)) { return "TCT (Alcatel) T70"; }
        else if ("T3000".equals(model)) { return "Infocus T3000"; }
        else if ("Tab870".equals(model)) { return "Bitmore Tab870"; }
        else if ("T10+".equals(model)) { return "Tobii DynaVox T10+"; }
        else if ("Telenor_Smart_Pro".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 991"; }
        else if ("Transformer_Prime_TF201".equals(model)) { return "Asus Eee Pad Transformer Prime"; }
        else if ("TCL D920".equals(model)) { return "TCT (Alcatel) TCL D920"; }
        else if ("TD070VA1".equals(model)) { return "Acer Tab 7"; }
        else if ("TA80CA1".equals(model)) { return "i-Buddie TA80CA1"; }
        else if ("TA80CA2".equals(model)) { return "Casper TA80CA2"; }
        else if ("T1-823L".equals(model)) { return "Huawei t1_8p0lte"; }
        else if ("T-02D".equals(model)) { return "Fujitsu REGZA Phone T-02D"; }
        else if ("TCL ONE TOUCH 990".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("TCL S860".equals(model)) { return "TCT (Alcatel) TCL S860"; }
        else if ("TCL J726T".equals(model)) { return "TCT (Alcatel) TCL J726T"; }
        else if ("T802 PAD".equals(model)) { return "Huawei T802"; }
        else if ("TCC893X_EVM".equals(model)) { return "Hyundai CAR AVN SYSTEM"; }
        else if ("Trinity T101".equals(model)) { return "ESI Enterprises Trinity T101"; }
        else if ("TECNO_W4".equals(model)) { return "TECNO-W4"; }
        else if ("T10".equals(model)) { return "BYD DynaVox T10"; }
        else if ("TF201".equals(model)) { return "Asus Eee Pad Transformer Prime"; }
        else if ("Turbo-X Coral II".equals(model)) { return "Plaisio Coral II"; }
        else if ("Telenor Touch Mini".equals(model)) { return "ZTE-U V760"; }
        else if ("TM800A510L".equals(model)) { return "Nuvision TM800A510L"; }
        else if ("TCL i718M".equals(model)) { return "TCT (Alcatel) TCL i718M"; }
        else if ("TECNO M3S".equals(model)) { return "Tecno M3"; }
        else if ("TCL P728M".equals(model)) { return "TCT (Alcatel) TCL P728M"; }
        else if ("TCL P618L".equals(model)) { return "TCT (Alcatel) TCL P618L"; }
        else if ("Trooper_X35".equals(model)) { return "KAZAM TROOPER X3.5"; }
        else if ("TCL J630T".equals(model)) { return "TCT (Alcatel) TCL J630T"; }
        else if ("T730".equals(model)) { return "Wintec T730"; }
        else if ("TCL A865".equals(model)) { return "TCT (Alcatel) TCL A865"; }
        else if ("TCL A506".equals(model)) { return "TCT (Alcatel) TCL A506"; }
        else if ("TCL J210C".equals(model)) { return "TCT (Alcatel) TCL J210C"; }
        else if ("Tele2fon v4".equals(model)) { return "Tele2fon V4"; }
        else if ("Tele2fon v5".equals(model)) { return "Tele2fon V5"; }
        else if ("T-Mobile myTouch 3G Slide".equals(model)) { return "HTC myTouch 3G Slide"; }
        else if ("TCL P331M".equals(model)) { return "TCT (Alcatel) TCL P331M"; }
        else if ("TECNO-A7S".equals(model)) { return "TECNO-A7S"; }
        else if ("TCL P502U".equals(model)) { return "TCT (Alcatel) TCL P502U"; }
        else if ("Telenor Smart 2".equals(model)) { return "TCT (Alcatel) ALCATEL ONE TOUCH 4010X"; }
        else if ("TCL-J929L".equals(model)) { return "TCT (Alcatel) TCL J929L"; }
        else if ("TM106A510L".equals(model)) { return "Nuvision TM106A510L"; }
        else if ("TCL J926T".equals(model)) { return "TCT (Alcatel) TCL J926T"; }
        else if ("Transformer_TF101".equals(model)) { return "Asus Eee Pad Transformer"; }
        else if ("TECNO-Y5".equals(model)) { return "TECNO-Y5"; }
        else if ("TECNO-Y4".equals(model)) { return "TECNO-Y4"; }
        else if ("TECNO-Y6".equals(model)) { return "TECNO-Y6"; }
        else if ("TECNO-Y3".equals(model)) { return "TECNO-Y3"; }
        else if ("TA272HUL".equals(model)) { return "Acer TA272HUL"; }
        else if ("TCL D55".equals(model)) { return "TCT (Alcatel) TCL D55"; }
        else if ("TM75A".equals(model)) { return "Gigabyte TM75A"; }
        else if ("titan_niibr_ds".equals(model)) { return "Motorola MOTO G"; }
        else if ("TCL S838M".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("TCL J900T".equals(model)) { return "TCT (Alcatel) TCL J900T"; }
        else if ("Trio AXS 3G".equals(model)) { return "Trio AXS 3G"; }
        else if ("Trooper_X55".equals(model)) { return "KAZAM TROOPER X5.5"; }
        else if ("Telenor Touch Plus".equals(model)) { return "ZTE Telenor Touch Plus"; }
        else if ("TrekStor SurfTab breeze 9.6 quad".equals(model)) { return "Trekstor SurfTab breeze 9.6 quad"; }
        else if ("TEACTAB".equals(model)) { return "Gigabyte PROSCAN PLT1066 / MAG MAGPAD / TEAC TEACTAB / DOPO GS-1008"; }
        else if ("TCL S720T".equals(model)) { return "TCT (Alcatel) TCL S720T"; }
        else if ("Turbo-X_pi_4G".equals(model)) { return "Plaisio Turbo-X_pi_4G"; }
        else if ("T752".equals(model)) { return "Audiovox T752 Tablet"; }
        else if ("TECNO-M6S".equals(model)) { return "TECNO-M6S"; }
        else if ("TECNO PP7E-SLA1".equals(model)) { return "Tecno PhonePad 7 II"; }
        else if ("T07".equals(model)) { return "Acer Liquid Zest 4G"; }
        else if ("Telenor_OneTouch".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("T03".equals(model)) { return "Acer Liquid Z630"; }
        else if ("TECNO-W3".equals(model)) { return "TECNO-W3"; }
        else if ("TURKCELL T40".equals(model)) { return "ZTE TURKCELL T40"; }
        else if ("TBQG884".equals(model)) { return "Zeki TBQG884"; }
        else if ("TAB-750_G".equals(model)) { return "Sophix_Digix TAB-750_G"; }
        return "";

    }
    public static String wMethod (String model) {
        if ("WX445".equals(model)) { return "Motorola Citrus"; }
        else if ("Winner".equals(model)) { return "Explay Winner"; }
        else if ("Winner7".equals(model)) { return "Explay Winner 7"; }
        else if ("Wileyfox Swift".equals(model)) { return "Wileyfox Swift"; }
        else if ("WA966".equals(model)) { return "SKnetworks WA966"; }
        else if ("WA960".equals(model)) { return "Hisense WA960"; }
        else if ("W909".equals(model)) { return "Gionee W909"; }
        else if ("WX04SH".equals(model)) { return "Sharp AQUOS PHONE es WX04SH"; }
        else if ("W627".equals(model)) { return "Haier"; }
        else if ("W626".equals(model)) { return "Anydata Philips W626"; }
        else if ("Winner8".equals(model)) { return "Explay Winner 8"; }
        else if ("W861".equals(model)) { return "Haier"; }
        else if ("W860".equals(model)) { return "Haier W860"; }
        else if ("W032I_C3".equals(model)) { return "Tesco W032I_C3"; }
        else if ("W900S".equals(model)) { return "Gionee W900S"; }
        else if ("WETAB700DG".equals(model)) { return "W.e. WETAB700DG"; }
        else if ("w5".equals(model)) { return "Gini w5"; }
        else if ("WX05SH".equals(model)) { return "Sharp AQUOS PHONE WX05SH"; }
        else if ("WeTab1004B".equals(model)) { return "W.e. WeTab1004B"; }
        else if ("W757".equals(model)) { return "Haier W757"; }
        else if ("W900 LTE".equals(model)) { return "Cherry Mobile Cherry W900 LTE"; }
        else if ("W717".equals(model)) { return "Haier W717"; }
        else if ("Wileyfox Storm".equals(model)) { return "Wileyfox Storm"; }
        else if ("W80".equals(model)) { return "QMobile W80"; }
        else if ("WoozeI45".equals(model)) { return "Sourcing Creation WoozeI45"; }
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
        else if ("W1011A".equals(model)) { return "Wistron W1011A"; }
        else if ("WPT005".equals(model)) { return "iRiver WPT005"; }
        else if ("WX04K".equals(model)) { return "Kyocera DIGNO Dual"; }
        else if ("WALKMAN".equals(model)) { return "Sony NW-ZX1"; }
        else if ("W55".equals(model)) { return "Qilive W55"; }
        else if ("W337".equals(model)) { return "Philips W337"; }
        else if ("W70".equals(model)) { return "QMobile W70"; }
        else if ("W6500".equals(model)) { return "Philips W6500"; }
        else if ("W3620".equals(model)) { return "Philips W3620"; }
        else if ("WAX".equals(model)) { return "Wiko WAX"; }
        else if ("Webpad_7005".equals(model)) { return "Sourcing Creation webpad_7005"; }
        else if ("WayteQ Libra".equals(model)) { return "ZTE Blade"; }
        else if ("WM8".equals(model)) { return "Hisense WM8"; }
        else if ("WT19i".equals(model)) { return "Sony Ericsson Live with Walkman"; }
        else if ("WT19a".equals(model)) { return "Sony Ericsson Xperia live"; }
        else if ("WIKO-CINK SLIM".equals(model)) { return "Enspert CINK SLIM"; }
        else if ("W5510".equals(model)) { return "Gigabyte W5510"; }
        return "";

    }
    public static String vMethod (String model) {
        if ("V917G".equals(model)) { return "ENVIZEN DIGITAL V917G"; }
        else if ("Vodafone Smart 4 turbo".equals(model)) { return "Coolpad VodafoneSmart4turbo"; }
        else if ("V817".equals(model)) { return "ZTE V817"; }
        else if ("V8285".equals(model)) { return "ZTE V8285"; }
        else if ("Venue 7 3741".equals(model)) { return "Dell Venue 7"; }
        else if ("VSD231".equals(model)) { return "ViewSonic VSD231"; }
        else if ("VK700".equals(model)) { return "LGE G Pad 10.1 LTE"; }
        else if ("VSP355g".equals(model)) { return "Vestel VSP355g"; }
        else if ("VSP355s".equals(model)) { return "Vestel VSP355s"; }
        else if ("Vodafone Smart Tab 3G".equals(model)) { return "TCT (Alcatel) Vodafone_Smart_Tab_3G"; }
        else if ("VS840PP".equals(model)) { return "LGE LG Lucid"; }
        else if ("vivo PD1523A".equals(model)) { return "Vivo V3Max A"; }
        else if ("VEON_C8680".equals(model)) { return "Cellon VEON_C8680"; }
        else if ("vision2_1".equals(model)) { return "Hisense vision2_1"; }
        else if ("V8110".equals(model)) { return "ZTE V8110"; }
        else if ("vsi8q_1".equals(model)) { return "ViewSonic ViewPadi8Q"; }
        else if ("V1_Viper_I4G".equals(model)) { return "AllView V1 Viper I4G"; }
        else if ("Venue 7 3740".equals(model)) { return "Dell Venue 7"; }
        else if ("Viva_H701_LTE".equals(model)) { return "AllView Viva_H701_LTE"; }
        else if ("Viva_i7G".equals(model)) { return "AllView Viva i7G"; }
        else if ("Viva_H1001_LTE".equals(model)) { return "AllView Viva H1001 LTE"; }
        else if ("VIBE X2Pt5".equals(model)) { return "Lenovo X2 Pro"; }
        else if ("V360".equals(model)) { return "Acer Liquid E1"; }
        else if ("vivo PD1515BA".equals(model)) { return "Vivo X6SPlusA"; }
        else if ("vsi7q_1".equals(model)) { return "ViewSonic ViewPadi7Q"; }
        else if ("Viva_C701".equals(model)) { return "AllView Viva C701"; }
        else if ("VSD241".equals(model)) { return "ViewSonic VSD241 Smart Display"; }
        else if ("VSD242".equals(model)) { return "ViewSonic VSD242"; }
        else if ("VS415PP".equals(model)) { return "LGE LG Optimus Zone 2"; }
        else if ("vivo V3".equals(model)) { return "Vivo V3"; }
        else if ("vivo V1".equals(model)) { return "Vivo V1"; }
        else if ("VK410".equals(model)) { return "LGE GPAD 7.0 LTE"; }
        else if ("V8514".equals(model)) { return "ZTE V8514"; }
        else if ("V8510".equals(model)) { return "Huawei Y330-U11"; }
        else if ("VS876".equals(model)) { return "LGE LG Lucid 3"; }
        else if ("VSP250s".equals(model)) { return "Vestel VSP250s"; }
        else if ("VSP250g".equals(model)) { return "Vestel VSP250g"; }
        else if ("VT10E".equals(model)) { return "Vestel VT10E"; }
        else if ("VF-1397".equals(model)) { return "TCT (Alcatel) VF-1397"; }
        else if ("VivaH7LTE".equals(model)) { return "AllView Viva H7 LTE"; }
        else if ("Vodafone 985N".equals(model)) { return "TCT (Alcatel) Vodafone 985N"; }
        else if ("V8000_USA_Cricket".equals(model)) { return "ZTE V8000_USA_Cricket"; }
        else if ("Vodafone Smart Tab III 10".equals(model)) { return "Lenovo IdeaTab S6000"; }
        else if ("Venus_V3_5040_2GB".equals(model)) { return "Vestel Venus_V3_5040"; }
        else if ("Viva_i701G_TM".equals(model)) { return "AllView Viva i701G"; }
        else if ("Vision20".equals(model)) { return "Hisense LED85XT910G3DU"; }
        else if ("VSD221".equals(model)) { return "ViewSonic VSD221"; }
        else if ("VSD220".equals(model)) { return "Quanta VSD220"; }
        else if ("V1_Viper_S4G".equals(model)) { return "AllView V1 Viper S4G"; }
        else if ("V769M".equals(model)) { return "ZTE V769M"; }
        else if ("V2_Viper_I4G".equals(model)) { return "AllView V2 Viper I4G"; }
        else if ("V2_Viper_I_TM".equals(model)) { return "AllView V2 Viper I"; }
        else if ("VF-895N".equals(model)) { return "TCT (Alcatel) Vodafone 895"; }
        else if ("VS425".equals(model)) { return "LGE LG K4"; }
        else if ("VIETTEL V8506".equals(model)) { return "Huawei Y511-U30"; }
        else if ("Vodacom Power Tab 10".equals(model)) { return "TCT (Alcatel) VF-1296"; }
        else if ("Vodafone Smart Chat".equals(model)) { return "ZTE Vodafone Smart Chat"; }
        else if ("vision2_5".equals(model)) { return "Hisense Vision 2.5"; }
        else if ("vivo Y11".equals(model)) { return "Vivo Y11"; }
        else if ("vivo Y15".equals(model)) { return "Vivo Y15"; }
        else if ("VP73_Telefunken".equals(model)) { return "Telefunken VP73_Telefunken"; }
        else if ("vivo Y937".equals(model)) { return "Vivo Y937"; }
        else if ("VFD 600".equals(model)) { return "Vodafone VDF 600"; }
        else if ("Venue8 3840".equals(model)) { return "Dell Venue 8"; }
        else if ("V2s".equals(model)) { return "Lava V2s"; }
        else if ("vivo PD1515A".equals(model)) { return "Vivo X6Plus A"; }
        else if ("vivo X5Pro".equals(model)) { return "Vivo X5Pro"; }
        else if ("V791".equals(model)) { return "ZTE V791"; }
        else if ("VS990".equals(model)) { return "LGE V10"; }
        else if ("V765M".equals(model)) { return "ZTE_LEO_Q1"; }
        else if ("Venus_V3_5040".equals(model)) { return "Vestel Venus V3 5040"; }
        else if ("vivo Y37".equals(model)) { return "Vivo V1Max"; }
        else if ("vivo Y35".equals(model)) { return "Vivo Y35"; }
        else if ("vivo Y33".equals(model)) { return "Vivo Y33"; }
        else if ("VERSSED vp3".equals(model)) { return "Edcon Verssed Platinum VP3.0"; }
        else if ("VENSTAR2050".equals(model)) { return "VENSTAR2050"; }
        else if ("Vip Racer III".equals(model)) { return "ZTE Vip Racer III"; }
        else if ("Venus_V3_5020".equals(model)) { return "Vestel Venus V3 5020"; }
        else if ("Vision".equals(model)) { return "Hisense Vision"; }
        else if ("V1_Viper_I4G_TM".equals(model)) { return "AllView V1 Viper I4G"; }
        else if ("VS425PP".equals(model)) { return "LGE Zone3"; }
        else if ("VK815".equals(model)) { return "LGE LG G Pad X 8.3"; }
        else if ("VW_RCBKK1".equals(model)) { return "Panasonic Boukenkun-reciever"; }
        else if ("V6L".equals(model)) { return "Gionee ForwardZero"; }
        else if ("VFD1400".equals(model)) { return "Vodafone Tab Prime 7"; }
        else if ("vsi7q_1_coho".equals(model)) { return "ViewSonic ViewPadi7Q"; }
        else if ("V.45".equals(model)) { return "Nextel V.45"; }
        else if ("Venue 8 7840".equals(model)) { return "Dell Venue 8"; }
        else if ("VSP145M".equals(model)) { return "Vestel VSP145M"; }
        else if ("V4S".equals(model)) { return "Gionee V4S"; }
        else if ("Venue 8 7840 LTE".equals(model)) { return "Dell Venue 8"; }
        else if ("V2_Viper".equals(model)) { return "AllView V2 Viper"; }
        else if ("VS930_4G".equals(model)) { return "LG Spectrum 2"; }
        else if ("VP74-Vox".equals(model)) { return "Vestel VP74"; }
        else if ("V1_Viper_I4G_PL".equals(model)) { return "AllView V1 Viper I4G"; }
        else if ("VS920_4G".equals(model)) { return "LG Spectrum 4G"; }
        else if ("V.45S".equals(model)) { return "Mobiwire V.45"; }
        else if ("Vega".equals(model)) { return "Explay Vega"; }
        else if ("vivo Y21L".equals(model)) { return "Vivo Y21L"; }
        else if ("VM670".equals(model)) { return "LG Optimus V"; }
        else if ("VFD 1100".equals(model)) { return "TCT (Alcatel) VFD1100"; }
        else if ("vivo X6D".equals(model)) { return "Vivo X6D"; }
        else if ("VTSH v1".equals(model)) { return "Panasonic VTSH v1"; }
        else if ("V85".equals(model)) { return "Symphony V85"; }
        else if ("vivo PD1415A".equals(model)) { return "Vivo X6A"; }
        else if ("VS980_4G".equals(model)) { return "LG G2"; }
        else if ("VP73_Vox".equals(model)) { return "Vestel VP73"; }
        else if ("V100".equals(model)) { return "Symphony V100"; }
        else if ("Vodafone 875".equals(model)) { return "VF Vodafone Smart mini"; }
        else if ("VF695".equals(model)) { return "TCT (Alcatel) VF695"; }
        else if ("Viewphone Q5".equals(model)) { return "ViewSonic Q5"; }
        else if ("Vodafone Smart II".equals(model)) { return "TCT (Alcatel) VF 860"; }
        else if ("VK810 4G".equals(model)) { return "LGE LG G Pad 8.3 LTE"; }
        else if ("Vodafone 858".equals(model)) { return "Huawei V858"; }
        else if ("vivo PD1524B".equals(model)) { return "Vivo V3M A"; }
        else if ("VP73_le".equals(model)) { return "Vestel VP73"; }
        else if ("VS930 4G".equals(model)) { return "LGE Spectrum 2"; }
        else if ("vivo V3Max+ A".equals(model)) { return "Vivo V3Max + A"; }
        else if ("Venue 7 3730".equals(model)) { return "Dell Venue 7"; }
        else if ("VS980 4G".equals(model)) { return "LGE LG G2"; }
        else if ("V8602".equals(model)) { return "ZTE Grand X Quad Lite"; }
        else if ("VS840 4G".equals(model)) { return "LGE LG Lucid"; }
        else if ("Venue7 3740 LTE".equals(model)) { return "Dell Venue 7"; }
        else if ("Vip Droid".equals(model)) { return "ZTE Racer"; }
        else if ("vivo Y31".equals(model)) { return "Vivo Y31"; }
        else if ("V9180".equals(model)) { return "ZTE V9180"; }
        else if ("vivo PD1522A".equals(model)) { return "Vivo Xplay5A"; }
        else if ("VP74-Orava".equals(model)) { return "Vestel VP74"; }
        else if ("VS950 4G".equals(model)) { return "LGE Intuition"; }
        else if ("VS810PP".equals(model)) { return "LGE F60"; }
        else if ("V883M".equals(model)) { return "ZTE LEO M1"; }
        else if ("Videocon_V7400".equals(model)) { return "Huawei T-Mobile Pulse"; }
        else if ("V1_Viper_L".equals(model)) { return "AllView V1 Viper L"; }
        else if ("V1_Viper_E".equals(model)) { return "AllView V1 Viper E"; }
        else if ("V100MD".equals(model)) { return "ENVIZEN DIGITAL V100MD"; }
        else if ("VP74-Telefunken".equals(model)) { return "Vestel VP74"; }
        else if ("Vodafone 958".equals(model)) { return "TCT (Alcatel) One Touch 990"; }
        else if ("vivo Y15S".equals(model)) { return "Vivo Y15S"; }
        else if ("Vodafone Smart Tab 4G".equals(model)) { return "TCT (Alcatel) Vodafone_Smart_Tab_4G"; }
        else if ("V3".equals(model)) { return "Haier V3"; }
        else if ("V4".equals(model)) { return "USA111 iRULU_V4"; }
        else if ("V5".equals(model)) { return "ZTE NE501J"; }
        else if ("V7".equals(model)) { return "Polaroid V7"; }
        else if ("V9".equals(model)) { return "ZTE V9"; }
        else if ("VH777".equals(model)) { return "Hisense VH777"; }
        else if ("VP73_Hyundai".equals(model)) { return "Vestel VP73"; }
        else if ("vivo X5Max S".equals(model)) { return "Vivo X5Max S"; }
        else if ("V96A".equals(model)) { return "ZTE V96A"; }
        else if ("Vodafone Smart Tab 4".equals(model)) { return "TCT (Alcatel) Vodafone Smart Tab 4"; }
        else if ("Vodafone 975".equals(model)) { return "TCT (Alcatel) Vodafone Smart III"; }
        else if ("Viva_i10HD".equals(model)) { return "AllView Viva i10HD"; }
        else if ("Verssed VP2".equals(model)) { return "Edcon Platiunm vp.2"; }
        else if ("Verssed VP1".equals(model)) { return "Edcon Platiunm vp.1"; }
        else if ("Venue8 3840 LTE".equals(model)) { return "Dell Venue 8"; }
        else if ("VivaH8LTE".equals(model)) { return "AllView Viva H8 LTE"; }
        else if ("VT785P2-Celcus".equals(model)) { return "Vestel VT785P2"; }
        else if ("V865M".equals(model)) { return "ZTE V865M"; }
        else if ("VT785P2-Vestel".equals(model)) { return "Vestel VT785P2"; }
        else if ("Vodafone Smart 4G".equals(model)) { return "Coolpad Vodafone Smart 4G"; }
        else if ("vivo PD1501D".equals(model)) { return "Vivo X6Plus D"; }
        else if ("vivo X6S A".equals(model)) { return "Vivo X6S A"; }
        else if ("Viva_H701_LTE_CZ".equals(model)) { return "AllView Viva i701G"; }
        else if ("V8507".equals(model)) { return "ZTE V829"; }
        else if ("V8502".equals(model)) { return "ZTE Blade"; }
        else if ("V8501".equals(model)) { return "ZTE V807"; }
        else if ("VS870_4G".equals(model)) { return "LG Lucid 2"; }
        else if ("Venue 8 3840".equals(model)) { return "Dell Venue 8"; }
        else if ("V2_Viper_I".equals(model)) { return "AllView V2 Viper I"; }
        else if ("V2_Viper_E".equals(model)) { return "AllView V2 Viper E"; }
        else if ("V2_Viper_X".equals(model)) { return "AllView V2 Viper X"; }
        else if ("VALENCIA".equals(model)) { return "TCT (Alcatel) ONE TOUCH 983"; }
        else if ("vivo V3Max".equals(model)) { return "Vivo V3Max"; }
        else if ("VS880".equals(model)) { return "LGE G Vista"; }
        else if ("V Tab 7010".equals(model)) { return "Vestel V Tab 7010"; }
        else if ("VERSSED vp2.1".equals(model)) { return "Edcon VERSSED platinum vp.2.1"; }
        else if ("Venus_V3_5070".equals(model)) { return "Vestel Venus V3 5070"; }
        else if ("Venue 10 7040".equals(model)) { return "Dell Venue 7040"; }
        else if ("Vodafone Tab grand 6".equals(model)) { return "TCT (Alcatel) VF-1296"; }
        else if ("vivo Y923".equals(model)) { return "Vivo PD1419V"; }
        else if ("vsi8q_1_coho".equals(model)) { return "ViewSonic ViewPadi8Q"; }
        else if ("VS870 4G".equals(model)) { return "LGE LG Lucid 2"; }
        else if ("VS987".equals(model)) { return "LGE LG G5"; }
        else if ("VS986".equals(model)) { return "LG G4"; }
        else if ("vivo Y51".equals(model)) { return "Vivo Y51"; }
        else if ("Video Handset".equals(model)) { return "Panasonic VHS v2"; }
        else if ("VIDAA_TV".equals(model)) { return "Hisense VIDAA_TV"; }
        else if ("Vortex".equals(model)) { return "LGE Optimus One"; }
        else if ("Venus".equals(model)) { return "Mobicell Mobicel"; }
        else if ("vivo X5Max".equals(model)) { return "Vivo X5Max"; }
        else if ("V975".equals(model)) { return "ZTE V975"; }
        else if ("Venue7 3740".equals(model)) { return "Dell Venue 7"; }
        else if ("VIA-T7D-3G".equals(model)) { return "Casper VIA T7D 3G"; }
        else if ("Veil".equals(model)) { return "Gryphon Veil"; }
        else if ("Venus_V3_5030".equals(model)) { return "Vestel venus_v3_5030"; }
        else if ("VAP430".equals(model)) { return "Vizio StreamPlayer"; }
        else if ("VP700".equals(model)) { return "Foxconn vizio VP700"; }
        else if ("VF-1497".equals(model)) { return "TCT (Alcatel) VF-1497"; }
        else if ("vivo Y28".equals(model)) { return "Vivo Y28"; }
        else if ("vivo Y21".equals(model)) { return "Vivo Y21"; }
        else if ("vivo Y22".equals(model)) { return "Vivo Y22"; }
        else if ("vivo Y27".equals(model)) { return "Vivo Y27"; }
        else if ("Venue 7 HSPA+".equals(model)) { return "Dell Venue 7"; }
        else if ("VP74-Finlux".equals(model)) { return "Vestel VP74"; }
        else if ("Vodafone 975N".equals(model)) { return "TCT (Alcatel) Vodafone Smart III (with NFC)"; }
        else if ("VS910 4G".equals(model)) { return "LGE LG Revolution"; }
        else if ("Vexia Zippers".equals(model)) { return "BYD Zippers"; }
        else if ("Venus_V3_5570".equals(model)) { return "Vestel Venus V3 5570"; }
        else if ("VIVO 5".equals(model)) { return "Blu VIVO 5"; }
        else if ("vivo X5MaxV".equals(model)) { return "Vivo X5MaxV"; }
        else if ("VP74-Celcus".equals(model)) { return "Vestel VP74"; }
        else if ("Venue 10 5050".equals(model)) { return "Dell Venue 10"; }
        else if ("Venus_V3_5010".equals(model)) { return "Vestel venus_v3_5010"; }
        else if ("VP800".equals(model)) { return "Foxconn vizio VP800"; }
        else if ("vivo Xplay5A".equals(model)) { return "Vivo Xplay5A"; }
        else if ("vivo V3Lite".equals(model)) { return "Vivo V3Lite"; }
        else if ("VS890 4G".equals(model)) { return "LGE Enact"; }
        else if ("V75".equals(model)) { return "SYMPHONY V75"; }
        else if ("VFD 1400".equals(model)) { return "Vodafone Tab Prime 7"; }
        else if ("vivo Y51A".equals(model)) { return "Vivo Y51A"; }
        else if ("Viva_H801".equals(model)) { return "AllView Viva H801"; }
        else if ("V23GB".equals(model)) { return "Lava V2 3GB"; }
        else if ("Vodafone Blade V".equals(model)) { return "ZTE Blade V"; }
        else if ("VS985_4G".equals(model)) { return "LG G3 4G"; }
        else if ("Venue 8 HSPA+".equals(model)) { return "Dell Venue 8"; }
        else if ("VT785P2-Finlux".equals(model)) { return "Vestel VT785P2"; }
        else if ("V2_Viper_X_plus".equals(model)) { return "AllView V2 Viper X plus"; }
        else if ("VS840_4G".equals(model)) { return "LG Lucid 4G"; }
        else if ("Voyager".equals(model)) { return "Gigabyte TM75A"; }
        else if ("V55".equals(model)) { return "ZTE V55"; }
        else if ("Vox".equals(model)) { return "Kobo Vox"; }
        else if ("vivo Y35A".equals(model)) { return "Vivo Y35A"; }
        else if ("VIA_T41".equals(model)) { return "Casper VIA_T41"; }
        else if ("Venue 8 3830".equals(model)) { return "Dell Venue 8"; }
        else if ("ViewPhone3".equals(model)) { return "Foxconn ViewPhone3"; }
        else if ("V72C".equals(model)) { return "ZTE V72C"; }
        else if ("VFD 200".equals(model)) { return "ZTE VFD 200"; }
        else if ("V72M".equals(model)) { return "ZTE V72M"; }
        else if ("VP74".equals(model)) { return "Vestel VP74"; }
        else if ("VP73".equals(model)) { return "Vestel VP73"; }
        else if ("VAX114".equals(model)) { return "Vaxcare VAX114"; }
        else if ("VIA-T7D".equals(model)) { return "Casper VIA T7D"; }
        else if ("Vodafone 785".equals(model)) { return "TCT (Alcatel) Vodafone 785"; }
        else if ("VIVO XL".equals(model)) { return "Blu VIVO XL"; }
        else if ("VS920 4G".equals(model)) { return "LGE Spectrum"; }
        else if ("V.40".equals(model)) { return "Mobiwire V.40"; }
        else if ("VivaH10LTE".equals(model)) { return "AllView Viva H10 LTE"; }
        else if ("V9c".equals(model)) { return "ZTE V9"; }
        else if ("V9e".equals(model)) { return "ZTE V9"; }
        else if ("V9S".equals(model)) { return "ZTE V9S"; }
        else if ("V9C".equals(model)) { return "ZTE V9"; }
        else if ("V9A".equals(model)) { return "ZTE V9A"; }
        else if ("VS910_4G".equals(model)) { return "LG Revolution 4G"; }
        else if ("Vodafone Smart Tab III 7".equals(model)) { return "Lenovo IdeaTab A3000"; }
        else if ("VIETTEL V8411".equals(model)) { return "ZTE V797"; }
        else if ("vivo Y31L".equals(model)) { return "Vivo Y31L"; }
        else if ("vivo Y31i".equals(model)) { return "Vivo Y31i"; }
        else if ("vivo X5Pro V".equals(model)) { return "Vivo X5Pro V"; }
        else if ("vivo X5Pro D".equals(model)) { return "Vivo X5Pro D"; }
        else if ("VK810_4G".equals(model)) { return "G Pad 8.3"; }
        else if ("Vodafone 861".equals(model)) { return "TCT (Alcatel) Vodafone 861"; }
        else if ("VF685".equals(model)) { return "TCT (Alcatel) VF685"; }
        else if ("vivo X5".equals(model)) { return "Vivo X5"; }
        else if ("V.35".equals(model)) { return "VSN V.35"; }
        else if ("VS500".equals(model)) { return "LGE LG K8 V"; }
        else if ("VIE-L09".equals(model)) { return "Huawei P9 Plus"; }
        else if ("vivo Y13iL".equals(model)) { return "Vivo PD1304DL"; }
        else if ("vivo X5M".equals(model)) { return "Vivo X5M"; }
        else if ("VERTU Ti".equals(model)) { return "VERTU Ti"; }
        else if ("VP74-Luxor".equals(model)) { return "Vestel VP74"; }
        else if ("VP73_Myros".equals(model)) { return "Vestel VP73"; }
        else if ("V370".equals(model)) { return "Acer Liquid E2"; }
        else if ("VP100+".equals(model)) { return "Vestel VP100+"; }
        else if ("Vodafone 845".equals(model)) { return "Huawei U8120"; }
        else if ("V8403".equals(model)) { return "ZTE V8403"; }
        else if ("V8402".equals(model)) { return "ZTE Racer"; }
        else if ("Vodafone Smart 4".equals(model)) { return "Coolpad VodafoneSmart4"; }
        else if ("VIE-L29".equals(model)) { return "Huawei P9 Plus"; }
        else if ("V8200plus".equals(model)) { return "ZTE V8200plus"; }
        else if ("V972M".equals(model)) { return "ZTE LEO S1"; }
        else if ("VIE-AL10".equals(model)) { return "Huawei P9 Plus"; }
        else if ("VS985 4G".equals(model)) { return "LGE LG G3"; }
        else if ("Viva_i701G".equals(model)) { return "AllView Viva i701G"; }
        else if ("VT10E2".equals(model)) { return "Vestel VT10E2"; }
        else if ("VT785P2-Cleverpad".equals(model)) { return "Vestel VT785P2"; }
        else if ("Vodafone Smart ultra 6".equals(model)) { return "ZTE Vodafone Smart ultra 6"; }
        return "";

    }
    public static String yMethod (String model) {
        if ("YP-GH1".equals(model)) { return "Samsung IceTouch"; }
        else if ("YOGA Tablet 2 Pro-1380L".equals(model)) { return "Lenovo YOGA Tablet Pro-1380L/Yoga Tablet 2 Pro"; }
        else if ("YOGA Tablet 2-1050L".equals(model)) { return "Lenovo YOGA Tablet Pro-1050L/Yoga Tablet 2"; }
        else if ("Y220-U05".equals(model)) { return "Huawei Y220"; }
        else if ("YPY_S400".equals(model)) { return "Positivo YPY S400"; }
        else if ("Y550-L02".equals(model)) { return "Huawei Y550-L02"; }
        else if ("Y550-L03".equals(model)) { return "Huawei Y550-L03"; }
        else if ("YPY_07STBF".equals(model)) { return "Positivo Ypy 07STBF"; }
        else if ("Y88X Plus".equals(model)) { return "Dragontouch Y88X Plus"; }
        else if ("Yellowstone".equals(model)) { return "Google Project Tango Tablet Development Kit"; }
        else if ("YPY_07FTB".equals(model)) { return "Positivo Ypy 07FTB"; }
        else if ("YPY_07FTA".equals(model)) { return "Positivo YPY7 3G"; }
        else if ("YPY_S350".equals(model)) { return "Positivo Ypy S350"; }
        else if ("YP-GB1".equals(model)) { return "Samsung Galaxy Player 4"; }
        else if ("YP-GB70".equals(model)) { return "Samsung Galaxy Player"; }
        else if ("Y400".equals(model)) { return "Positivo BGH Y400"; }
        else if ("YPY_S405".equals(model)) { return "Positivo Ypy S405"; }
        else if ("YP-GB70D".equals(model)) { return "Samsung Galaxy player 70 Plus"; }
        else if ("Ypy AB10i".equals(model)) { return "Positivo Ypy AB10i"; }
        else if ("Y320-U01".equals(model)) { return "Huawei Y320-U01"; }
        else if ("YPY_S460".equals(model)) { return "Positivo Ypy S460"; }
        else if ("YUREKA".equals(model)) { return "Yureka"; }
        else if ("YOGA Tablet 2-1050LC".equals(model)) { return "Lenovo YOGA Tablet Pro-1050LC/Yoga Tablet 2"; }
        else if ("Ypy 7 - TB07STA".equals(model)) { return "Positivo YPY7 wifi"; }
        else if ("YPY_10FTBF".equals(model)) { return "Positivo Ypy 10FTBF"; }
        else if ("YOGA Tablet 2-1050F".equals(model)) { return "Lenovo YogaTablet2 -1050F"; }
        else if ("YOGA Tablet 2 Pro-1380F".equals(model)) { return "Lenovo YOGA Tablet Pro-1380F/Yoga Tablet 2 Pro"; }
        else if ("YP-G1".equals(model)) { return "Samsung Galaxy Player 4.0"; }
        else if ("Yupiroid".equals(model)) { return "Hipstreet Yupiroid"; }
        else if ("YU5010A".equals(model)) { return "YUPHORIA"; }
        else if ("YU5510".equals(model)) { return "Yureka"; }
        else if ("YP-GS1".equals(model)) { return "Samsung Galaxy Player 3.6"; }
        else if ("YPY_10STBF".equals(model)) { return "Positivo Ypy 10STBF"; }
        else if ("YPY_10FTB".equals(model)) { return "Positivo Ypy 10FTB"; }
        else if ("YPY_S500".equals(model)) { return "Positivo Ypy S500"; }
        else if ("YPY_S350_PLUS".equals(model)) { return "Positivo Ypy S350p"; }
        else if ("YPY_AB10DC".equals(model)) { return "Positivo Ypy AB10D"; }
        else if ("YPY_AB10DP".equals(model)) { return "Positivo Ypy AB10DP"; }
        else if ("Y538".equals(model)) { return "Huawei UNION"; }
        else if ("YPY_07FTBF".equals(model)) { return "Positivo Ypy 07FTBF"; }
        else if ("YOGA Tablet 2-830LC".equals(model)) { return "Lenovo YOGA Tablet Pro-830LC/Yoga Tablet 2"; }
        else if ("YP-GI2".equals(model)) { return "Samsung Galaxy 070"; }
        else if ("YP-GI1".equals(model)) { return "Samsung Galaxy Player 4.2"; }
        else if ("YOGA Tablet 2-830L".equals(model)) { return "Lenovo YOGA Tablet Pro-830L/Yoga Tablet 2"; }
        else if ("YOGA Tablet 2-830F".equals(model)) { return "Lenovo YogaTbalet2-830F"; }
        else if ("Y635-L21".equals(model)) { return "Huawei Y635-L21"; }
        else if ("Y511-U00".equals(model)) { return "Huawei Y511-U00"; }
        else if ("YPY_10STB".equals(model)) { return "Positivo Ypy 10STB"; }
        else if ("YPY_07STB".equals(model)) { return "Positivo Ypy 07STB"; }
        else if ("YPY_07STA".equals(model)) { return "Positivo YPY7 wifi"; }
        else if ("Y541-U02".equals(model)) { return "Huawei Y541-U02"; }
        else if ("YPY_10FTA".equals(model)) { return "Positivo YPY 10 3G"; }
        else if ("YD201".equals(model)) { return "Yota Devices YotaPhone2"; }
        else if ("YBMK01".equals(model)) { return "iRiver Wow(Window of the world)"; }
        else if ("YPY_AB7DC".equals(model)) { return "Positivo AB7D"; }
        else if ("YPY_TQ7".equals(model)) { return "Positivo Ypy TQ7"; }
        else if ("Ypy 7 - TB07FTA".equals(model)) { return "Positivo YPY7 3G"; }
        else if ("Y635-L01".equals(model)) { return "Huawei Y635-L01"; }
        else if ("YPY_AB7K".equals(model)) { return "Positivo Ypy AB7K"; }
        else if ("YPY_S450".equals(model)) { return "Positivo Ypy S450"; }
        else if ("Y511-T00".equals(model)) { return "Huawei Y511-T00"; }
        else if ("Y230".equals(model)) { return "Positivo BGH Y230"; }
        else if ("Y340-U081".equals(model)) { return "Huawei Y340-U081"; }
        else if ("YP-G50".equals(model)) { return "Samsung Galaxy Player 50"; }
        else if ("YU5050".equals(model)) { return "Micromax Yutopia"; }
        else if ("Y635-L02".equals(model)) { return "Huawei Y635-L02"; }
        else if ("Y635-L03".equals(model)) { return "Huawei Y635-L03"; }
        else if ("YP-GP1".equals(model)) { return "Samsung Galaxy Player 5.8"; }
        else if ("YPY_AB10D".equals(model)) { return "Positivo Ypy AB10"; }
        else if ("YP-G70".equals(model)) { return "Samsung Galaxy Player 5"; }
        else if ("Y220-U00".equals(model)) { return "Huawei Y220"; }
        else if ("Y220-U17".equals(model)) { return "Huawei Y220"; }
        else if ("Y220-U10".equals(model)) { return "Huawei Y220-U10"; }
        else if ("Y1000".equals(model)) { return "Positivo Y1000"; }
        else if ("YU5510A".equals(model)) { return "Yureka"; }
        else if ("YU5010".equals(model)) { return "YUPHORIA"; }
        else if ("YPY_AB7D".equals(model)) { return "Positivo AB7"; }
        return "";

    }
    public static String xMethod (String model) {
        if ("XT1564".equals(model)) { return "Motorola Droid Maxx 2"; }
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
        else if ("XO Learning tablet".equals(model)) { return "Anydata Vivitar XO Tablet"; }
        else if ("X500".equals(model)) { return "ZTE X500"; }
        else if ("XL39h".equals(model)) { return "Sony Xperia Z Ultra"; }
        else if ("X2_Soul_Mini".equals(model)) { return "AllView X2 Soul Mini"; }
        else if ("XT1058".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1056".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1055".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1052".equals(model)) { return "Moto X"; }
        else if ("XT1053".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1050".equals(model)) { return "Motorola Moto X"; }
        else if ("Xavy_T7".equals(model)) { return "Vonino Xavy_T7"; }
        else if ("XT1078".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT1079".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1072".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT555C".equals(model)) { return "Motorola Moto Defy XT"; }
        else if ("X35E".equals(model)) { return "TCT (Alcatel) X35E"; }
        else if ("XT910".equals(model)) { return "Motorola Droid RAZR"; }
        else if ("X35T".equals(model)) { return "Auchan Selecline X35T"; }
        else if ("XT621".equals(model)) { return "Motorola Master Touch XT621"; }
        else if ("XT627".equals(model)) { return "Motorola XT627"; }
        else if ("XT626".equals(model)) { return "Motorola Motoluxe"; }
        else if ("XT919".equals(model)) { return "Motorola RAZR D3"; }
        else if ("X501_USA_OM".equals(model)) { return "ZTE X501_USA_OM"; }
        else if ("Xolo_X500".equals(model)) { return "Intel Xolo X500"; }
        else if ("XT1019".equals(model)) { return "Motorola Moto E"; }
        else if ("XT605".equals(model)) { return "Motorola XT605"; }
        else if ("XT1225".equals(model)) { return "Motorola Moto Turbo"; }
        else if ("XT937C".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1039".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1034".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1031".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1032".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1033".equals(model)) { return "Motorola Moto G"; }
        else if ("X9180".equals(model)) { return "ZTE X9180"; }
        else if ("X2_Soul_Lite_TM".equals(model)) { return "AllView X2 Soul Lite"; }
        else if ("XT890".equals(model)) { return "MOTOROLA RAZR i"; }
        else if ("XT830C".equals(model)) { return "Motorola MOTO E"; }
        else if ("X-tremer".equals(model)) { return "WIKO DARKNIGHT"; }
        else if ("XT687".equals(model)) { return "Motorola Motoluxe"; }
        else if ("XT685".equals(model)) { return "Motorola Motoluxe"; }
        else if ("XT682".equals(model)) { return "Motorola Motoluxe"; }
        else if ("X501_USA_Cricket".equals(model)) { return "ZTE X501_USA_Cricket"; }
        else if ("X9009".equals(model)) { return "Oppo X9009"; }
        else if ("X9006".equals(model)) { return "OPPO X9006"; }
        else if ("X9007".equals(model)) { return "OPPO X9007"; }
        else if ("X9000".equals(model)) { return "Oppo X9000"; }
        else if ("XT916".equals(model)) { return "Motorola RAZR D1"; }
        else if ("XT915".equals(model)) { return "Motorola RAZR D1"; }
        else if ("XT914".equals(model)) { return "Motorola RAZR D1"; }
        else if ("XT918".equals(model)) { return "Motorola RAZR D1"; }
        else if ("XT1030".equals(model)) { return "Motorola Droid Mini"; }
        else if ("Xino Z46 X4+".equals(model)) { return "Modecom Xino Z46 X4+"; }
        else if ("X2_Soul_Style".equals(model)) { return "AllView X2 Soul Style"; }
        else if ("XCD35".equals(model)) { return "ZTE Blade"; }
        else if ("XT390".equals(model)) { return "Motorola Motosmart"; }
        else if ("XT535".equals(model)) { return "Motorola Moto Defy XT"; }
        else if ("X909".equals(model)) { return "Oppo X909"; }
        else if ("X900".equals(model)) { return "Foxconn XOLO"; }
        else if ("XT702".equals(model)) { return "Motorola Droid"; }
        else if ("XT701".equals(model)) { return "Motorola Droid"; }
        else if ("XOLO_X1000".equals(model)) { return "Foxconn XOLO_X1000"; }
        else if ("XT1025".equals(model)) { return "Motorola Moto E"; }
        else if ("XOLO T1000".equals(model)) { return "Hisense XOLO"; }
        else if ("XT720".equals(model)) { return "Motorola Motoroi"; }
        else if ("X501_USA_RS".equals(model)) { return "ZTE X501_USA_Cricket"; }
        else if ("X27".equals(model)) { return "IRULU X27"; }
        else if ("XT1526".equals(model)) { return "Motorola Moto E"; }
        else if ("XT1528".equals(model)) { return "Motorola Moto E"; }
        else if ("XT897S".equals(model)) { return "Motorola Photon"; }
        else if ("X47".equals(model)) { return "iRulu X47"; }
        else if ("XT557".equals(model)) { return "Motorola Moto Defy XT"; }
        else if ("XT556".equals(model)) { return "Motorola Moto Defy XT"; }
        else if ("XT1575".equals(model)) { return "Motorola Moto X Style"; }
        else if ("XT1570".equals(model)) { return "Motorola Moto X Style"; }
        else if ("XT1572".equals(model)) { return "Motorola Moto X Style"; }
        else if ("XOLO One HD".equals(model)) { return "Lava XOLO One HD"; }
        else if ("X66".equals(model)) { return "Ashna X66"; }
        else if ("XCD 28".equals(model)) { return "ZTE Racer"; }
        else if ("XP6700".equals(model)) { return "Sonimtech XP6"; }
        else if ("XT1085".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1528O".equals(model)) { return "Motorola Moto E"; }
        else if ("XOLO X910".equals(model)) { return "BYD X910"; }
        else if ("XR6M10".equals(model)) { return "Vizio XR6M10"; }
        else if ("X300".equals(model)) { return "Aikun RX300"; }
        else if ("XT0000".equals(model)) { return "Motorola MOTO E"; }
        else if ("X2_Soul_Xtreme".equals(model)) { return "AllView X2 Soul Xtreme"; }
        else if ("X1 7.0".equals(model)) { return "HUAWEI MediaPad X1 7.0"; }
        else if ("XT1045".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1042".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT800".equals(model)) { return "Motorola Glam XT800"; }
        else if ("X3_Soul_PRO".equals(model)) { return "AllView X3 Soul Pro"; }
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
        else if ("X-treme Play Tab".equals(model)) { return "Mach Speed xtreme"; }
        else if ("XT1060".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1069".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1068".equals(model)) { return "Motorola Moto G"; }
        else if ("X3-55 Pro".equals(model)) { return "Letv Super TV X3-55 Pro"; }
        else if ("X909T".equals(model)) { return "Oppo X909"; }
        else if ("X3_Soul_mini".equals(model)) { return "AllView X3 Soul mini"; }
        else if ("XT1080".equals(model)) { return "Motorola Droid Ultra"; }
        else if ("X4508".equals(model)) { return "Lazer X4508"; }
        else if ("X2_Soul_Lite".equals(model)) { return "AllView X2 Soul Lite"; }
        else if ("X10a".equals(model)) { return "Sony Ericsson Xperia X10"; }
        else if ("X10i".equals(model)) { return "Sony Ericsson Xperia X10"; }
        else if ("X100".equals(model)) { return "Moxee Technologies X100"; }
        else if ("XT1003".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT1002".equals(model)) { return "Motorola MOTO G"; }
        else if ("XT1008".equals(model)) { return "Motorola Moto G"; }
        else if ("XT610".equals(model)) { return "Motorola Droid Pro"; }
        else if ("XT611".equals(model)) { return "Motorola Motoluxe"; }
        else if ("XT615".equals(model)) { return "Motorola Motoluxe"; }
        else if ("Xavy_L8".equals(model)) { return "Vonino Xavy_L8"; }
        else if ("XT1028".equals(model)) { return "Motorola Moto G"; }
        else if ("XT1023".equals(model)) { return "Motorola Moto E"; }
        else if ("XT1022".equals(model)) { return "Motorola Moto E"; }
        else if ("XT1021".equals(model)) { return "Motorola Moto X Play"; }
        else if ("XT897".equals(model)) { return "Motorola Photo Q"; }
        else if ("X600".equals(model)) { return "Letv x600"; }
        else if ("XT881".equals(model)) { return "MOTOROLA ELECTRIFY 2"; }
        else if ("XT885".equals(model)) { return "Motorola Razr V"; }
        else if ("XT886".equals(model)) { return "Motorola Razr V"; }
        else if ("Xylo X".equals(model)) { return "Vonino Xylo X"; }
        else if ("XT303".equals(model)) { return "Motorola Motosmart"; }
        else if ("XT300".equals(model)) { return "Motorola Spice"; }
        else if ("XT301".equals(model)) { return "Motorola Citrus"; }
        else if ("Xlife-450Q".equals(model)) { return "Spice Xlife-450Q"; }
        else if ("XT305".equals(model)) { return "Motorola Motosmart"; }
        else if ("XT1049".equals(model)) { return "Motorola Moto X"; }
        else if ("XT1040".equals(model)) { return "Motorola Moto G w/4G LTE"; }
        else if ("XT320".equals(model)) { return "Motorola Defy Mini"; }
        else if ("XT321".equals(model)) { return "Motorola Defy Mini"; }
        else if ("XT920".equals(model)) { return "Motorola RAZR D3"; }
        else if ("XT925".equals(model)) { return "Motorola DROID RAZR HD"; }
        else if ("X40E".equals(model)) { return "Enspert Lazer X40E"; }
        else if ("XP7700".equals(model)) { return "Sonimtech XP7705"; }
        else if ("XT901".equals(model)) { return "Motorola Electrify M"; }
        else if ("XT907".equals(model)) { return "Motorola Droid Razr M"; }
        else if ("X400".equals(model)) { return "Positivo X400"; }
        else if ("X2_Soul_Style_TM".equals(model)) { return "AllView X2 Soul Style"; }
        else if ("XT1077".equals(model)) { return "Motorola Moto G with 4G LTE (2nd Gen)"; }
        else if ("XT389".equals(model)) { return "Motorola Motosmart"; }
        else if ("X9079".equals(model)) { return "Oppo X9079"; }
        else if ("X9077".equals(model)) { return "Oppo X9077"; }
        else if ("X9076".equals(model)) { return "OPPO X9076"; }
        else if ("X9070".equals(model)) { return "OPPO X9070"; }
        else if ("X50D".equals(model)) { return "TCT (Alcatel) X50D"; }
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
        if ("ZTE Blade L4 Pro".equals(model)) { return "ZTE Blade A475"; }
        else if ("ZTE B2015".equals(model)) { return "ZTE B2015"; }
        else if ("ZTE B2016".equals(model)) { return "ZTE B2016"; }
        else if ("Z787".equals(model)) { return "ZTE Z787"; }
        else if ("Z930L".equals(model)) { return "ZTE Z930L"; }
        else if ("ZTE Q7".equals(model)) { return "ZTE Q7"; }
        else if ("Z768G".equals(model)) { return "ZTE Z768G"; }
        else if ("ZTE Blade C370".equals(model)) { return "ZTE Blade C370"; }
        else if ("ZTE Blade A465".equals(model)) { return "ZTE Blade A465"; }
        else if ("ZTE Blade A460".equals(model)) { return "ZTE Blade A460"; }
        else if ("ZTE Blade A462".equals(model)) { return "ZTE Blade A462"; }
        else if ("ZTE_CLARO_Q1".equals(model)) { return "ZTE_LEO_Q1"; }
        else if ("ZTE V816W".equals(model)) { return "ZTE V815W"; }
        else if ("ZTE-C N600+".equals(model)) { return "ZTE Racer"; }
        else if ("Z667".equals(model)) { return "ZTE Z667"; }
        else if ("ZTE T28 Prepaid".equals(model)) { return "ZTE T28"; }
        else if ("ZTE-U V760".equals(model)) { return "ZTE-U V760"; }
        else if ("ZTE-LINK".equals(model)) { return "ZTE Racer"; }
        else if ("Zero_Spin".equals(model)) { return "Vitsmo Zero Spin"; }
        else if ("ZTE V815W".equals(model)) { return "ZTE V815W"; }
        else if ("Z120".equals(model)) { return "Acer Z120"; }
        else if ("ZTE T920".equals(model)) { return "ZTE T920"; }
        else if ("Z850".equals(model)) { return "ZTE Z850"; }
        else if ("Z500".equals(model)) { return "Acer Liquid Z500"; }
        else if ("ZTE T12".equals(model)) { return "ZTE T12"; }
        else if ("ZTE Grand X 2".equals(model)) { return "ZTE Grand X 2"; }
        else if ("ZTE Grand X2".equals(model)) { return "ZTE Grand X Quad Lite"; }
        else if ("ZTE-U V970M".equals(model)) { return "ZTE Grand X"; }
        else if ("ZTE Q701C".equals(model)) { return "ZTE_Q701C"; }
        else if ("ZTE Grand X Classic".equals(model)) { return "ZTE Grand X"; }
        else if ("ZTE Geek 2".equals(model)) { return "ZTE Blade Vec"; }
        else if ("ZTE C880A".equals(model)) { return "ZTE C880A"; }
        else if ("Z818L".equals(model)) { return "ZTE Z818L"; }
        else if ("ZTE C880S".equals(model)) { return "ZTE C880S"; }
        else if ("ZTE C880U".equals(model)) { return "ZTE C880U"; }
        else if ("ZTE Blade G Pro".equals(model)) { return "ZTE V829"; }
        else if ("ZTE Q508U".equals(model)) { return "ZTE Q508U"; }
        else if ("ZTE Blade D6 Lite 4G".equals(model)) { return "ZTE Blade D6 Lite 4G"; }
        else if ("Z520".equals(model)) { return "Acer Liquid Z520"; }
        else if ("ZTE N818".equals(model)) { return "ZTE N818"; }
        else if ("ZTE Blade AF5".equals(model)) { return "ZTE T221"; }
        else if ("ZTE Blade V2 Lite".equals(model)) { return "ZTE Q509T"; }
        else if ("Z828TL".equals(model)) { return "ZTE Z828"; }
        else if ("ZVII".equals(model)) { return "Symphony ZVII"; }
        else if ("Z958".equals(model)) { return "ZTE Z958"; }
        else if ("Z959".equals(model)) { return "ZTE Z959"; }
        else if ("Z796C".equals(model)) { return "ZTE Z796C"; }
        else if ("ZTE Blade Q Mini".equals(model)) { return "ZTE Blade Q Mini"; }
        else if ("ZTE T620".equals(model)) { return "ZTE T620"; }
        else if ("Z750C".equals(model)) { return "ZTE Z750C"; }
        else if ("ZTE Blade X9".equals(model)) { return "ZTE N939Sc"; }
        else if ("ZTE-U N720".equals(model)) { return "ZTE N720"; }
        else if ("ZTE-U N721".equals(model)) { return "ZTE-U N721"; }
        else if ("ZTE Blade G Plus".equals(model)) { return "ZTE V829"; }
        else if ("Z12".equals(model)) { return "QMobile Z12"; }
        else if ("ZTE U879".equals(model)) { return "ZTE U879"; }
        else if ("ZUK Z1".equals(model)) { return "ZUK Z1"; }
        else if ("ZTE N798+".equals(model)) { return "ZTE N798+"; }
        else if ("ZTE Kis Lite".equals(model)) { return "ZTE Kis Lite"; }
        else if ("ZTE V965".equals(model)) { return "ZTE V965"; }
        else if ("ZTE V968".equals(model)) { return "ZTE Grand X 2"; }
        else if ("ZTE V969".equals(model)) { return "ZTE V969"; }
        else if ("ZTE Blade Vec 4G".equals(model)) { return "ZTE Blade Vec 4G"; }
        else if ("Z970".equals(model)) { return "ZTE ZMax"; }
        else if ("ZTE V967S".equals(model)) { return "ZTE Grand X Quad Lite"; }
        else if ("ZTE Q801U".equals(model)) { return "ZTE Q801U"; }
        else if ("Z963U".equals(model)) { return "ZTE Z963U"; }
        else if ("ZTE Q705U".equals(model)) { return "ZTE Q705U"; }
        else if ("ZTE Grand S Flex".equals(model)) { return "ZTE Grand S Flex"; }
        else if ("ZTE-U V880".equals(model)) { return "ZTE Blade"; }
        else if ("ZTE T325".equals(model)) { return "ZTE T325"; }
        else if ("ZTE KIS II PRO".equals(model)) { return "ZTE V795"; }
        else if ("ZTE V886J".equals(model)) { return "ZTE 009Z"; }
        else if ("ZTE Switch X1".equals(model)) { return "ZTE Switch X1"; }
        else if ("ZTE Z932L".equals(model)) { return "ZTE Z932L"; }
        else if ("ZTE G601U".equals(model)) { return "ZTE G601U"; }
        else if ("ZTE T660".equals(model)) { return "ZTE Blade V6"; }
        else if ("ZTE B880".equals(model)) { return "ZTE B880"; }
        else if ("ZTE Kis 3".equals(model)) { return "ZTE Kis 3"; }
        else if ("ZTE Kis Q".equals(model)) { return "ZTE Kis Q"; }
        else if ("ZTE Q801T".equals(model)) { return "ZTE Q801T"; }
        else if ("ZTE Q801C".equals(model)) { return "ZTE_Q801C"; }
        else if ("ZTE Q801L".equals(model)) { return "ZTE_Q801L"; }
        else if ("ZTE Blade Apex".equals(model)) { return "ZTE Blade Apex"; }
        else if ("ZTE-RACER".equals(model)) { return "ZTE Racer"; }
        else if ("ZTE Blade V6".equals(model)) { return "ZTE Blade V6"; }
        else if ("ZTE Blade V2".equals(model)) { return "ZTE Blade V2"; }
        else if ("Z740".equals(model)) { return "ZTE Z740"; }
        else if ("ZTE Blade Vec".equals(model)) { return "ZTE Blade Vec"; }
        else if ("ZTE U817".equals(model)) { return "ZTE U817"; }
        else if ("ZTE U816".equals(model)) { return "ZTE U816"; }
        else if ("ZTE U818".equals(model)) { return "ZTE U818"; }
        else if ("ZTE N986".equals(model)) { return "ZTE N986"; }
        else if ("ZTE N983".equals(model)) { return "ZTE N983"; }
        else if ("ZTE Grand X2 In".equals(model)) { return "ZTE Grand X2 In"; }
        else if ("ZTE N900D".equals(model)) { return "ZTE N900D"; }
        else if ("ZTE V987".equals(model)) { return "ZTE V987"; }
        else if ("ZTE T809".equals(model)) { return "ZTE V809"; }
        else if ("Z667T".equals(model)) { return "ZTE Z667T"; }
        else if ("ZTE Grand X Quad Lite".equals(model)) { return "ZTE Grand X Quad Lite"; }
        else if ("ZTE V880H".equals(model)) { return "ZTE V965"; }
        else if ("ZTE V880E".equals(model)) { return "ZTE V880E"; }
        else if ("ZTE V880G".equals(model)) { return "ZTE V880G"; }
        else if ("Z933".equals(model)) { return "ZTE Z933"; }
        else if ("Z200".equals(model)) { return "Acer Liquid Z200"; }
        else if ("Z205".equals(model)) { return "Acer Liquid Z205"; }
        else if ("ZTE-T U880".equals(model)) { return "ZTE U880"; }
        else if ("Z665C".equals(model)) { return "ZTE Z665C"; }
        else if ("ZTE Geek 2 LTE".equals(model)) { return "ZTE Geek 2 LTE"; }
        else if ("ZTE KIS II".equals(model)) { return "ZTE V795"; }
        else if ("ZXY-ZTE_N8010".equals(model)) { return "ZTE ZXY-ZTE_N8010"; }
        else if ("ZTE BLADE L110".equals(model)) { return "ZTE BLADE L110"; }
        else if ("Z992".equals(model)) { return "ZTE Z992"; }
        else if ("Z995".equals(model)) { return "ZTE Z995"; }
        else if ("Z220".equals(model)) { return "Acer Liquid Z220"; }
        else if ("Z998".equals(model)) { return "ZTE Z998"; }
        else if ("Z716BL".equals(model)) { return "ZTE Z716BL"; }
        else if ("Z936L".equals(model)) { return "ZTE Z936L"; }
        else if ("ZUN XO".equals(model)) { return "Vonino ZUN XO"; }
        else if ("ZTE M901C".equals(model)) { return "ZTE M901C"; }
        else if ("ZTE Grand X".equals(model)) { return "ZTE V987"; }
        else if ("ZTE G717C".equals(model)) { return "ZTE G717C"; }
        else if ("ZTE V807".equals(model)) { return "ZTE V807"; }
        else if ("ZTE V809".equals(model)) { return "ZTE V809"; }
        else if ("ZTE N939St".equals(model)) { return "ZTE N939Sc"; }
        else if ("Z740G".equals(model)) { return "ZTE Z740G"; }
        else if ("ZTE Q301C".equals(model)) { return "ZTE Q301C"; }
        else if ("Z205P".equals(model)) { return "Acer Liquid Z205"; }
        else if ("Z962BL".equals(model)) { return "ZTE Z962BL"; }
        else if ("ZTE Libra".equals(model)) { return "ZTE Blade"; }
        else if ("ZTE Kis II".equals(model)) { return "ZTE V795"; }
        else if ("ZTE N880E".equals(model)) { return "ZTE N880E"; }
        else if ("ZTE N880G".equals(model)) { return "ZTE N880G"; }
        else if ("ZTE C880".equals(model)) { return "ZTE C880"; }
        else if ("ZTE G719C".equals(model)) { return "ZTE G719C"; }
        else if ("ZTE V829".equals(model)) { return "ZTE V829"; }
        else if ("ZTE N900".equals(model)) { return "ZTE N900"; }
        else if ("ZTE N909".equals(model)) { return "ZTE N909"; }
        else if ("ZTE Q519T".equals(model)) { return "ZTE Q519T"; }
        else if ("ZTE_N9511".equals(model)) { return "ZTE_N9511"; }
        else if ("ZTE Blade L5 Plus".equals(model)) { return "ZTE Blade L5 Plus"; }
        else if ("Z150".equals(model)) { return "Acer Liquid Z5"; }
        else if ("ZTE C310".equals(model)) { return "ZTE C310"; }
        else if ("ZTE G720C".equals(model)) { return "ZTE G720C"; }
        else if ("ZTE G720T".equals(model)) { return "ZTE G720T"; }
        else if ("ZTE GEEK II Pro 4G".equals(model)) { return "ZTE STAR"; }
        else if ("ZTE Blade V6 Lite".equals(model)) { return "ZTE Blade L6"; }
        else if ("ZTE Kis II Max plus".equals(model)) { return "ZTE V815W"; }
        else if ("ZTE BLADE A460".equals(model)) { return "ZTE Blade A460"; }
        else if ("ZTE U9815".equals(model)) { return "ZTE U9815"; }
        else if ("Z826".equals(model)) { return "ZTE Z826"; }
        else if ("Z820".equals(model)) { return "ZTE Z820"; }
        else if ("Zilo".equals(model)) { return "Zilo"; }
        else if ("ZTE Blade L3 Lite".equals(model)) { return "ZTE Blade L3 Lite"; }
        else if ("ZTE V9820".equals(model)) { return "ZTE V9820"; }
        else if ("ZTE N9835".equals(model)) { return "ZTE N9835"; }
        else if ("ZTE Blade V770".equals(model)) { return "ZTE Blade V770"; }
        else if ("ZTE Skate".equals(model)) { return "ZTE Skate"; }
        else if ("ZTE Kis II Max".equals(model)) { return "ZTE V815W"; }
        else if ("ZTE V7073".equals(model)) { return "ZTE V7073"; }
        else if ("ZKB2A".equals(model)) { return "ZTE Spro 2"; }
        else if ("ZTE Blade A5".equals(model)) { return "ZTE T221"; }
        else if ("Z110".equals(model)) { return "Acer Z110"; }
        else if ("ZTE T221".equals(model)) { return "ZTE T221"; }
        else if ("ZTE T220".equals(model)) { return "ZTE Blade C340"; }
        else if ("ZTE Blade D6 Lite 3G".equals(model)) { return "ZTE Blade D6 Lite 3G"; }
        else if ("ZTE Blade L3 Apex".equals(model)) { return "ZTE Blade L3 Apex"; }
        else if ("ZTE Blade Vec Pro".equals(model)) { return "ZTE Blade Vec Pro"; }
        else if ("ZTE Blade C320".equals(model)) { return "ZTE V815W"; }
        else if ("ZTE Blade A430".equals(model)) { return "ZTE Blade Q Lux"; }
        else if ("ZTE V887".equals(model)) { return "ZTE V887"; }
        else if ("ZTE V882".equals(model)) { return "ZTE 009Z"; }
        else if ("ZTE V880".equals(model)) { return "ZTE Blade"; }
        else if ("ZTE T520".equals(model)) { return "ZTE T520"; }
        else if ("ZTE Geek".equals(model)) { return "ZTE V975"; }
        else if ("ZTE V779M".equals(model)) { return "ZTE V779M"; }
        else if ("ZTE Blade C2".equals(model)) { return "ZTE V809"; }
        else if ("Z130".equals(model)) { return "Acer Liquid Z3"; }
        else if ("ZTE T60".equals(model)) { return "ZTE T60"; }
        else if ("Z792".equals(model)) { return "ZTE Z792"; }
        else if ("ZTE LEO M1".equals(model)) { return "ZTE LEO M1"; }
        else if ("ZTE Kis3 max".equals(model)) { return "ZTE Blade G Lux"; }
        else if ("ZTE Blade Q Maxi".equals(model)) { return "ZTE Orange Reyo"; }
        else if ("ZTE N5S".equals(model)) { return "ZTE N5S"; }
        else if ("ZTE N5L".equals(model)) { return "ZTE N5L"; }
        else if ("ZTE T792".equals(model)) { return "ZTE T792"; }
        else if ("ZTE V765M".equals(model)) { return "ZTE_LEO_Q1"; }
        else if ("ZT-701".equals(model)) { return "AtGames-zooti ZOOTI PAD ZT-701"; }
        else if ("ZTE Grand S II".equals(model)) { return "ZTE Grand S II"; }
        else if ("Zeus".equals(model)) { return "Sony Ericsson Xperia Play"; }
        else if ("ZTE Blade 2".equals(model)) { return "ZTE V818"; }
        else if ("ZTE Blade A450".equals(model)) { return "ZTE Q509T"; }
        else if ("ZTE Fit 4G Smart".equals(model)) { return "ZTE Blade Q Lux"; }
        else if ("ZTE Blade G2".equals(model)) { return "ZTE V965"; }
        else if ("ZTE Q2S-C".equals(model)) { return "ZTE Q2S-C"; }
        else if ("ZTE B816".equals(model)) { return "ZTE V815W"; }
        else if ("Z955L".equals(model)) { return "ZTE Z955L"; }
        else if ("ZTE T912".equals(model)) { return "ZTE Blade S6 Lite"; }
        else if ("ZTE T911".equals(model)) { return "ZTE T911"; }
        else if ("ZTE-Libra".equals(model)) { return "ZTE Blade"; }
        else if ("ZTE P_C880S".equals(model)) { return "ZTE P_C880S"; }
        else if ("ZTE Blade A470".equals(model)) { return "ZTE Blade A470"; }
        else if ("ZTE Blade A476".equals(model)) { return "ZTE Blade A476"; }
        else if ("ZTE Blade A475".equals(model)) { return "ZTE Blade A475"; }
        else if ("ZTE T610".equals(model)) { return "ZTE Blade A460"; }
        else if ("ZTE S2005".equals(model)) { return "ZTE S2005"; }
        else if ("ZTE-V6500".equals(model)) { return "ZTE-V6500"; }
        else if ("ZTE S2002".equals(model)) { return "ZTE STAR"; }
        else if ("ZTE N939Sc".equals(model)) { return "ZTE N939Sc"; }
        else if ("ZTE-V856".equals(model)) { return "ZTE-V856"; }
        else if ("Z819L".equals(model)) { return "ZTE Z819L"; }
        else if ("ZTE T28".equals(model)) { return "ZTE T28"; }
        else if ("ZTE U9180".equals(model)) { return "ZTE U9180"; }
        else if ("Z752C".equals(model)) { return "ZTE Z752C"; }
        else if ("ZTE Blade L370".equals(model)) { return "ZTE Blade L370"; }
        else if ("ZTE Blade L3".equals(model)) { return "ZTE Blade L3"; }
        else if ("ZTE Q509T".equals(model)) { return "ZTE Q509T"; }
        else if ("ZTE U889".equals(model)) { return "ZTE U889"; }
        else if ("ZTE V811W".equals(model)) { return "ZTE V811W"; }
        else if ("ZTE V811C".equals(model)) { return "ZTE V811C"; }
        else if ("ZTE-C N600".equals(model)) { return "ZTE Racer"; }
        else if ("ZTE Blade C342".equals(model)) { return "ZTE T221"; }
        else if ("ZTE Blade C341".equals(model)) { return "ZTE T221"; }
        else if ("ZTE Blade C340".equals(model)) { return "ZTE Blade C340"; }
        else if ("ZTE T630".equals(model)) { return "ZTE T630"; }
        else if ("ZTE R84".equals(model)) { return "ZTE T84"; }
        else if ("ZTE-BLADE".equals(model)) { return "ZTE-BLADE"; }
        else if ("ZTE R83".equals(model)) { return "ZTE R83"; }
        else if ("ZTE Q806T".equals(model)) { return "ZTE Q806T"; }
        else if ("Z753G".equals(model)) { return "ZTE Z753G"; }
        else if ("Z730".equals(model)) { return "ZTE Z730"; }
        else if ("ZTE N799D".equals(model)) { return "ZTE N799D"; }
        else if ("Z980L".equals(model)) { return "ZTE Z980L"; }
        else if ("Z797C".equals(model)) { return "ZTE Z797C"; }
        else if ("Zoom".equals(model)) { return "AG Mobile Zoom"; }
        else if ("ZTE Grand S II LTE".equals(model)) { return "ZTE Grand S II LTE"; }
        else if ("Zun X".equals(model)) { return "Vonino Zun X"; }
        else if ("ZTE_LEO_Q1".equals(model)) { return "ZTE_LEO_Q1"; }
        else if ("ZTE BLADE A5 PRO".equals(model)) { return "Zuk ZTE BLADE A5 PRO"; }
        else if ("ZTE V975".equals(model)) { return "ZTE V975"; }
        else if ("ZTE V970".equals(model)) { return "ZTE V970"; }
        else if ("Z968".equals(model)) { return "ZTE Uhura"; }
        else if ("ZTE Star 1".equals(model)) { return "ZTE STAR"; }
        else if ("ZTE Q802C".equals(model)) { return "ZTE Q802C"; }
        else if ("ZTE Blade III".equals(model)) { return "ZTE Blade III"; }
        else if ("Z832".equals(model)) { return "ZTE Z832"; }
        else if ("Z795G".equals(model)) { return "ZTE Z795G"; }
        else if ("ZTE Blade Apex2".equals(model)) { return "ZTE Blade Apex2"; }
        else if ("ZTE Blade Apex3".equals(model)) { return "ZTE Blade Apex3"; }
        else if ("ZTE T80".equals(model)) { return "ZTE T80"; }
        else if ("ZTE T82".equals(model)) { return "ZTE T82"; }
        else if ("ZTE T83".equals(model)) { return "ZTE T83"; }
        else if ("ZTE T84".equals(model)) { return "ZTE T84"; }
        else if ("ZTE T86".equals(model)) { return "ZTE T86"; }
        else if ("ZTE T88".equals(model)) { return "ZTE T88"; }
        else if ("ZTE Q201T".equals(model)) { return "ZTE Q201T"; }
        else if ("ZTE S221".equals(model)) { return "ZTE Grand S II"; }
        else if ("ZTE-X500".equals(model)) { return "ZTE-X500"; }
        else if ("ZTE Blade A570".equals(model)) { return "ZTE Blade A570"; }
        else if ("ZTE V768".equals(model)) { return "ZTE V768"; }
        else if ("ZTE Q503U".equals(model)) { return "ZTE Q503U"; }
        else if ("ZTE N795".equals(model)) { return "ZTE N795"; }
        else if ("Z777".equals(model)) { return "ZTE Z777"; }
        else if ("ZTE N798".equals(model)) { return "ZTE N798"; }
        else if ("ZTE BLADE C".equals(model)) { return "ZTE V807"; }
        else if ("ZTE V813W".equals(model)) { return "ZTE V813W"; }
        else if ("ZTE-C N880S".equals(model)) { return "ZTE Blade"; }
        else if ("ZTE Blade Buzz".equals(model)) { return "ZTE V815W"; }
        else if ("ZTE V956".equals(model)) { return "ZTE V956"; }
        else if ("ZTE GEEK II Pro".equals(model)) { return "ZTE GEEK II Pro"; }
        else if ("ZTE Blade C2 Plus".equals(model)) { return "ZTE V813W"; }
        else if ("ZTE-LIBRA".equals(model)) { return "ZTE Blade"; }
        else if ("Z793C".equals(model)) { return "ZTE Z793C"; }
        else if ("Zenith".equals(model)) { return "AG Mobile Zenith"; }
        else if ("ZTE Q7-C".equals(model)) { return "ZTE Q7-C"; }
        else if ("ZTE Blade L3 Plus".equals(model)) { return "ZTE Blade L3 Plus"; }
        else if ("ZTE T663".equals(model)) { return "ZTE Blade V6"; }
        else if ("ZTE-U V856".equals(model)) { return "ZTE-U V760"; }
        else if ("ZTE-U V857".equals(model)) { return "ZTE-U V760"; }
        else if ("ZTE-U V852".equals(model)) { return "ZTE Racer"; }
        else if ("Z660G".equals(model)) { return "ZTE Z660G"; }
        else if ("ZTE Q501U".equals(model)) { return "ZTE Q501U"; }
        else if ("ZTE Q501T".equals(model)) { return "ZTE Q501T"; }
        else if ("ZTE V9A".equals(model)) { return "ZTE V9A"; }
        else if ("Z755".equals(model)) { return "ZTE Z755"; }
        else if ("ZTE U809".equals(model)) { return "ZTE U809"; }
        else if ("ZTE Grand Memo LTE".equals(model)) { return "ZTE Grand Memo LTE"; }
        else if ("ZTE T311".equals(model)) { return "ZTE Blade Q Lux"; }
        else if ("ZTE N909D".equals(model)) { return "ZTE N909D"; }
        else if ("ZXY-ZTE_V6700".equals(model)) { return "ZTE ZXY-ZTE_V6700"; }
        else if ("ZTE Q2S-T".equals(model)) { return "ZTE Q2S-T"; }
        else if ("ZTE V769M".equals(model)) { return "ZTE V769M"; }
        else if ("ZTE Q101T".equals(model)) { return "ZTE Q101T"; }
        else if ("ZTE T816".equals(model)) { return "ZTE V815W"; }
        else if ("ZTE T815".equals(model)) { return "ZTE V815W"; }
        else if ("ZTE S2007".equals(model)) { return "ZTE S2007"; }
        else if ("ZTE STAR".equals(model)) { return "ZTE STAR"; }
        else if ("Z791G".equals(model)) { return "ZTE Z791G"; }
        else if ("ZTE T760".equals(model)) { return "ZTE T760"; }
        else if ("ZTE N928Dt".equals(model)) { return "ZTE N928Dt"; }
        else if ("ZTE S2004".equals(model)) { return "ZTE S2004"; }
        else if ("Zettaly Avy ZA-407".equals(model)) { return "Zettaly ZA-407"; }
        else if ("ZTE Blade Q1".equals(model)) { return "ZTE V815W"; }
        else if ("ZTE Blade Q3".equals(model)) { return "ZTE Blade Q3"; }
        else if ("ZTE_U N720".equals(model)) { return "ZTE N720"; }
        else if ("ZTE-Z990".equals(model)) { return "ZTE-Z990"; }
        else if ("ZTE Q507T".equals(model)) { return "ZTE Q507T"; }
        else if ("ZTE KIS Flex".equals(model)) { return "ZTE V793"; }
        else if ("Z00D".equals(model)) { return "Asus ZenFone 2 (ZE500CL)"; }
        else if ("ZTE V72".equals(model)) { return "ZTE V72"; }
        else if ("ZTE V70".equals(model)) { return "ZTE V70"; }
        else if ("ZTE V792C".equals(model)) { return "ZTE V792C"; }
        else if ("ZTE Q529T".equals(model)) { return "ZTE Q529T"; }
        else if ("ZTE Q529C".equals(model)) { return "ZTE Q529C"; }
        else if ("ZTE Q529E".equals(model)) { return "ZTE Q529E"; }
        else if ("Z8".equals(model)) { return "NUU Z8"; }
        else if ("Z1".equals(model)) { return "ZUK Z1"; }
        else if ("ZTE T617".equals(model)) { return "ZTE T617"; }
        else if ("ZTE Blade L6".equals(model)) { return "ZTE Blade L6"; }
        else if ("ZTE Blade L5".equals(model)) { return "ZTE Blade L5"; }
        else if ("ZTE Blade L2".equals(model)) { return "ZTE Blade L2"; }
        else if ("ZTE Kis II Max Plus".equals(model)) { return "ZTE V815W"; }
        else if ("ZTE GEEK II 4G".equals(model)) { return "ZTE GEEK II 4G"; }
        else if ("ZTE W1010".equals(model)) { return "ZTE AXON WATCH"; }
        else if ("ZTE Q505T".equals(model)) { return "ZTE Q505T"; }
        else if ("ZTE V5S".equals(model)) { return "ZTE V5S"; }
        else if ("ZTE V879".equals(model)) { return "ZTE V879"; }
        else if ("ZTE Grand Memo".equals(model)) { return "ZTE Grand Memo LTE"; }
        else if ("ZTE Blade G Lux".equals(model)) { return "ZTE Blade G Lux"; }
        else if ("ZTE Blade V220".equals(model)) { return "ZTE Blade V220"; }
        else if ("ZTE N919D".equals(model)) { return "ZTE N919D"; }
        else if ("ZTE N918St".equals(model)) { return "ZTE N918St"; }
        else if ("ZTE U988S".equals(model)) { return "ZTE U988S"; }
        else if ("ZTE-SKATE".equals(model)) { return "ZTE-SKATE"; }
        else if ("ZTE Blade Q Lux 3G".equals(model)) { return "ZTE Blade Q Lux"; }
        else if ("ZTE Geek 2 pro".equals(model)) { return "ZTE Geek 2 pro"; }
        else if ("ZTE V817".equals(model)) { return "ZTE V817"; }
        else if ("ZTE V818".equals(model)) { return "ZTE V818"; }
        else if ("ZTE Blade Q Lux".equals(model)) { return "ZTE Blade Q Lux"; }
        else if ("ZTE X850".equals(model)) { return "ZTE Racer"; }
        else if ("ZTE A2015".equals(model)) { return "ZTE A2015"; }
        else if ("ZTE Blade A452".equals(model)) { return "ZTE Blade A452"; }
        else if ("ZTE Blade HN".equals(model)) { return "ZTE Blade HN"; }
        else if ("Zio".equals(model)) { return "Kyocera zio"; }
        else if ("ZTE Blade VEC".equals(model)) { return "ZTE Blade VEC"; }
        else if ("ZTE Blade G LTE".equals(model)) { return "ZTE Blade G LTE"; }
        else if ("ZTE Grand Memo lite".equals(model)) { return "ZTE V5S"; }
        else if ("Z987".equals(model)) { return "ZTE Z987"; }
        else if ("Z988".equals(model)) { return "ZTE Grand X Max 2"; }
        else if ("ZTE V9800".equals(model)) { return "ZTE V9800"; }
        else if ("ZTE Blade V580".equals(model)) { return "ZTE Turk Telekom TT175"; }
        else if ("ZTE Blade S6 Plus".equals(model)) { return "ZTE Blade S6 Plus"; }
        else if ("ZTE M1001".equals(model)) { return "ZTE GEEK II Pro"; }
        else if ("ZTE Blade III Pro".equals(model)) { return "ZTE Blade III Pro"; }
        else if ("ZTE-N910".equals(model)) { return "ZTE-N910"; }
        else if ("ZTE V6700".equals(model)) { return "ZTE ZXY-ZTE_V6700"; }
        else if ("ZTE_V5".equals(model)) { return "ZTE NE501J"; }
        else if ("ZTE C2016".equals(model)) { return "ZTE C2016"; }
        else if ("ZTE Q805T".equals(model)) { return "ZTE Q805T"; }
        else if ("ZTE Maxx".equals(model)) { return "ZTE V815W"; }
        else if ("ZTE V831W".equals(model)) { return "ZTE V831W"; }
        else if ("ZTE K97".equals(model)) { return "ZTE K97"; }
        else if ("ZTE Kis Pro".equals(model)) { return "ZTE Kis Pro"; }
        else if ("ZTE Skate 2".equals(model)) { return "ZTE Grand X Quad Lite"; }
        else if ("ZTE Q5-C".equals(model)) { return "ZTE Q5-C"; }
        else if ("ZTE Q5-T".equals(model)) { return "ZTE Q5-T"; }
        else if ("ZTE V970M".equals(model)) { return "ZTE Grand X"; }
        else if ("ZTE U5S".equals(model)) { return "ZTE U5S"; }
        else if ("ZTE R880H".equals(model)) { return "ZTE V965"; }
        else if ("ZTE V811".equals(model)) { return "ZTE V811W"; }
        else if ("ZTE V812".equals(model)) { return "ZTE Blade C340"; }
        else if ("ZTE V889S".equals(model)) { return "ZTE V807"; }
        else if ("ZTE V889D".equals(model)) { return "ZTE V889D"; }
        else if ("ZTE V889M".equals(model)) { return "ZTE V889M"; }
        else if ("ZTE Q301T".equals(model)) { return "ZTE Q301T"; }
        else if ("ZTE N919".equals(model)) { return "ZTE N919"; }
        else if ("ZTE Q302C".equals(model)) { return "ZTE Q302C"; }
        else if ("ZTE-U X850".equals(model)) { return "ZTE Racer"; }
        else if ("ZTE U969".equals(model)) { return "ZTE U969"; }
        else if ("ZTE U968".equals(model)) { return "ZTE U968"; }
        else if ("ZTE V983".equals(model)) { return "ZTE V983"; }
        else if ("Z410".equals(model)) { return "Acer Liquid Z410"; }
        else if ("Z993".equals(model)) { return "ZTE Z993"; }
        else if ("ZTE Blade A410".equals(model)) { return "ZTE Orange Dive 30"; }
        else if ("ZTE Blade G".equals(model)) { return "ZTE Blade G"; }
        else if ("Z9 Plus".equals(model)) { return "QMobile Z9 Plus"; }
        else if ("ZTE Blade L".equals(model)) { return "ZTE V887"; }
        else if ("ZTE Blade V".equals(model)) { return "ZTE Blade V"; }
        else if ("ZTE Blade Q".equals(model)) { return "ZTE STARTRAIL 4"; }
        else if ("ZTE A2016".equals(model)) { return "ZTE A2016"; }
        else if ("ZTE V993W".equals(model)) { return "ZTE V993W"; }
        else if ("ZTE N9120".equals(model)) { return "ZTE N9120"; }
        else if ("Z600".equals(model)) { return "Ashna Z600"; }
        else if ("ZTE B795".equals(model)) { return "ZTE V795"; }
        else if ("ZTE B792".equals(model)) { return "ZTE T792"; }
        else if ("ZTE B790".equals(model)) { return "ZTE B790"; }
        else if ("ZTE Grand Era".equals(model)) { return "ZTE Grand Era"; }
        else if ("ZTE Grand X In".equals(model)) { return "ZTE Grand X In"; }
        else if ("Z160".equals(model)) { return "Acer Liquid Z4"; }
        else if ("ZTE V793".equals(model)) { return "ZTE V793"; }
        else if ("ZTE V791".equals(model)) { return "ZTE V791"; }
        else if ("ZTE V790".equals(model)) { return "ZTE V790"; }
        else if ("ZTE V797".equals(model)) { return "ZTE V797"; }
        else if ("ZTE V796".equals(model)) { return "ZTE Switch X1"; }
        else if ("ZTE V795".equals(model)) { return "ZTE V795"; }
        else if ("ZTE S2010".equals(model)) { return "ZTE S2010"; }
        else if ("ZTE S2014".equals(model)) { return "ZTE S2014"; }
        else if ("ZTE S2015".equals(model)) { return "ZTE S2015"; }
        else if ("Z831".equals(model)) { return "ZTE Chapel"; }
        else if ("Z830".equals(model)) { return "ZTE Z830"; }
        else if ("ZTE Q802T".equals(model)) { return "ZTE Q802T"; }
        else if ("ZTE BLADE A110".equals(model)) { return "ZTE BLADE A110"; }
        else if ("ZTE T230".equals(model)) { return "ZTE T221"; }
        else if ("ZTE Q802D".equals(model)) { return "ZTE Q802D"; }
        else if ("Z963VL".equals(model)) { return "ZTE Z963VL"; }
        else if ("ZTE LEO S2".equals(model)) { return "ZTE LEO S2"; }
        else if ("ZTE LEO S1".equals(model)) { return "ZTE LEO S1"; }
        else if ("ZTE S118".equals(model)) { return "ZTE S118"; }
        else if ("ZTE V830W".equals(model)) { return "ZTE Blade G Lux"; }
        else if ("ZTE V891".equals(model)) { return "ZTE V891"; }
        else if ("ZTE-Z990G".equals(model)) { return "ZTE-Z990G"; }
        else if ("ZTE T320".equals(model)) { return "ZTE V831W"; }
        else if ("Z815".equals(model)) { return "ZTE Fanfare 2"; }
        else if ("Z813".equals(model)) { return "ZTE Z813"; }
        else if ("Z812".equals(model)) { return "ZTE Z812"; }
        else if ("ZUK Z2131".equals(model)) { return "Zuk Z2"; }
        else if ("ZTE BLADE III".equals(model)) { return "ZTE BLADE III"; }
        else if ("Z932L".equals(model)) { return "ZTE Z932L"; }
        else if ("ZTE BLADE V0720".equals(model)) { return "ZTE BLADE V0720"; }
        else if ("Z828".equals(model)) { return "ZTE Z828"; }
        else if ("ZTE LEO Q1".equals(model)) { return "ZTE_LEO_Q1"; }
        else if ("ZTE LEO Q2".equals(model)) { return "ZTE V769M"; }
        else if ("ZTE Blade C310".equals(model)) { return "ZTE C310"; }
        else if ("ZTE Blade C312".equals(model)) { return "ZTE Blade C312"; }
        else if ("ZTE G718C".equals(model)) { return "ZTE G718C"; }
        else if ("ZTE T81".equals(model)) { return "ZTE T81"; }
        else if ("ZTE V808".equals(model)) { return "ZTE V808"; }
        else if ("ZTE A880".equals(model)) { return "ZTE A880"; }
        else if ("ZTE T790".equals(model)) { return "ZTE T790"; }
        return "";

    }
    public static String otherMethod (String model) {
        if ("7048A".equals(model)) { return "TCT (Alcatel) Go PLAY"; }
        else if ("7048X".equals(model)) { return "TCT (Alcatel) Go PLAY"; }
        else if ("7048W".equals(model)) { return "TCT (Alcatel) Go PLAY"; }
        else if ("7048S".equals(model)) { return "TCT (Alcatel) Go PLAY"; }
        else if ("9010X".equals(model)) { return "TCT (Alcatel) 9010X"; }
        else if ("800P31C".equals(model)) { return "Mecer 800P31C"; }
        else if ("8DTB40".equals(model)) { return "Hipstreet Electron 2"; }
        else if ("9DTB38".equals(model)) { return "Hipstreet 9DTB38"; }
        else if ("9DTB39".equals(model)) { return "Hipstreet 9DTB39"; }
        else if ("0PAJ5".equals(model)) { return "HTC One (E8)"; }
        else if ("009Z".equals(model)) { return "ZTE 009Z"; }
        else if ("41EA04".equals(model)) { return "Sanyo Benesse"; }
        else if ("6044D".equals(model)) { return "TCT (Alcatel) 6044D"; }
        else if ("0PJA10".equals(model)) { return "HTC One M9"; }
        else if ("101P51C".equals(model)) { return "Mecer 101P51C"; }
        else if ("8053".equals(model)) { return "TCT (Alcatel) 8053"; }
        else if ("8057".equals(model)) { return "TCT (Alcatel) 8057"; }
        else if ("8056".equals(model)) { return "TCT (Alcatel) 8056"; }
        else if ("8054".equals(model)) { return "TCT (Alcatel) 8054"; }
        else if ("6039K".equals(model)) { return "TCT (Alcatel) 6039K"; }
        else if ("4013J".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
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
        else if ("8070".equals(model)) { return "TCT (Alcatel) 8070"; }
        else if ("8MA-A 3G".equals(model)) { return "Positivo 8MA-A"; }
        else if ("4024E".equals(model)) { return "TCT (Alcatel) PLAY_P1"; }
        else if ("4024D".equals(model)) { return "TCT (Alcatel) PLAY_P1"; }
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
        else if ("6039J".equals(model)) { return "TCT (Alcatel) 6039J"; }
        else if ("6039H".equals(model)) { return "TCT (Alcatel) 6039H"; }
        else if ("6039S".equals(model)) { return "TCT (Alcatel) 6039S"; }
        else if ("6039Y".equals(model)) { return "TCT (Alcatel) 6039Y"; }
        else if ("0PM92".equals(model)) { return "HTC Desire 626s"; }
        else if ("201M".equals(model)) { return "MOTOROLA RAZR M"; }
        else if ("201K".equals(model)) { return "Kyocera Honeybee Touch"; }
        else if ("9021A".equals(model)) { return "TCT (Alcatel) 9021A"; }
        else if ("7050Y".equals(model)) { return "TCT (Alcatel) POP S9"; }
        else if ("4028A".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("4028E".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("306SH".equals(model)) { return "Sharp 306SH"; }
        else if ("4028S".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("305SH".equals(model)) { return "Sharp SoftBank 305SH"; }
        else if ("402ZT".equals(model)) { return "ZTE 402ZT"; }
        else if ("6037K".equals(model)) { return "TCT (Alcatel) 6037K"; }
        else if ("6037B".equals(model)) { return "TCT (Alcatel) 6037B"; }
        else if ("55AX600C".equals(model)) { return "Panasonic 55AX600C"; }
        else if ("001HT".equals(model)) { return "HTC Desire HD"; }
        else if ("9002W".equals(model)) { return "TCT (Alcatel) 9002W"; }
        else if ("9002X".equals(model)) { return "TCT (Alcatel) 9002X"; }
        else if ("9002A".equals(model)) { return "TCT (Alcatel) 9002A"; }
        else if ("9003X".equals(model)) { return "TCT (Alcatel) 9003X"; }
        else if ("5054W".equals(model)) { return "TCT (Alcatel) 5054W"; }
        else if ("9003A".equals(model)) { return "TCT (Alcatel) 9003A"; }
        else if ("2014501".equals(model)) { return "Xiaomi HM 1SLTETD"; }
        else if ("2014502".equals(model)) { return "Xiaomi HM 2A"; }
        else if ("4034F".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 4 (4)"; }
        else if ("4034G".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 4 (4)"; }
        else if ("5054D".equals(model)) { return "TCT (Alcatel) 5054D"; }
        else if ("201F".equals(model)) { return "Fujitsu ARROWS A SoftBank 201F"; }
        else if ("402SH".equals(model)) { return "Sharp AQUOS CRYSTAL X"; }
        else if ("403SC".equals(model)) { return "Samsung Galaxy Tab4 7.0"; }
        else if ("403SH".equals(model)) { return "Sharp AQUOS CRYSTAL 2"; }
        else if ("4018X".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4018A".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4018D".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4018E".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4018F".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4018M".equals(model)) { return "TCT (Alcatel) Soul 3.5"; }
        else if ("4036E".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("10DTB10".equals(model)) { return "Hipstreet Phantom"; }
        else if ("2PQ93".equals(model)) { return "HTC One A9"; }
        else if ("4016D".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4015X"; }
        else if ("9006W".equals(model)) { return "TCT (Alcatel) 9006W"; }
        else if ("503SH".equals(model)) { return "Sharp AQUOS Xx2 mini"; }
        else if ("6037Y".equals(model)) { return "TCT (Alcatel) 6037Y"; }
        else if ("4009K".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("2014011".equals(model)) { return "Xiaomi HM 1STD"; }
        else if ("5050A".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("5050Y".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("5050X".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("5050S".equals(model)) { return "TCT (Alcatel) POP S3"; }
        else if ("502SO".equals(model)) { return "Sony Xperia X Performance"; }
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
        else if ("48AX600C".equals(model)) { return "Panasonic 48AX600C"; }
        else if ("31TL04".equals(model)) { return "Sanyo Benesse"; }
        else if ("8080".equals(model)) { return "TCT (Alcatel) 8080"; }
        else if ("404SH".equals(model)) { return "Sharp AQUOS Xx"; }
        else if ("404SC".equals(model)) { return "Samsung Galaxy S6 Edge"; }
        else if ("5054S".equals(model)) { return "TCT (Alcatel) 5054S"; }
        else if ("5054T".equals(model)) { return "TCT (Alcatel) 5054T"; }
        else if ("5054X".equals(model)) { return "TCT (Alcatel) 5054X"; }
        else if ("1206".equals(model)) { return "Oppo 1206"; }
        else if ("1201".equals(model)) { return "OPPO 1201"; }
        else if ("5054A".equals(model)) { return "TCT (Alcatel) 5054A"; }
        else if ("8050X".equals(model)) { return "TCT (Alcatel) 8050X"; }
        else if ("8050D".equals(model)) { return "TCT (Alcatel) 8050D"; }
        else if ("8050E".equals(model)) { return "TCT (Alcatel) 8050E"; }
        else if ("8050G".equals(model)) { return "TCT (Alcatel) 8050G"; }
        else if ("506SH".equals(model)) { return "Sharp AQUOS Xx 3"; }
        else if ("4034D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 4 (4)"; }
        else if ("6050F".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("6050A".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("6050Y".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("6050W".equals(model)) { return "TCT (Alcatel) IDOL 2 S"; }
        else if ("7043Y".equals(model)) { return "TCT (Alcatel) POP 2 (5)"; }
        else if ("7043A".equals(model)) { return "TCT (Alcatel) POP 2 (5)"; }
        else if ("7043K".equals(model)) { return "TCT (Alcatel) POP 2 (5)"; }
        else if ("302HW".equals(model)) { return "Huawei P6S-L04"; }
        else if ("7045Y".equals(model)) { return "TCT (Alcatel) 7045Y"; }
        else if ("7DTB37".equals(model)) { return "Hipstreet 7DTB37"; }
        else if ("503KC".equals(model)) { return "Kyocera 503KC"; }
        else if ("788TPCII".equals(model)) { return "IView 788TPCII"; }
        else if ("8744".equals(model)) { return "Spectralink 8744"; }
        else if ("8741".equals(model)) { return "Spectralink PIVOT 8741/8753"; }
        else if ("2014813".equals(model)) { return "Xiaomi HM 2LTE-CMCC"; }
        else if ("402SO".equals(model)) { return "Sony Xperia Z4"; }
        else if ("5042G".equals(model)) { return "TCT (Alcatel) POP2 (4.5)"; }
        else if ("5042D".equals(model)) { return "TCT (Alcatel) POP 2"; }
        else if ("5042A".equals(model)) { return "TCT (Alcatel) POP 2"; }
        else if ("5042X".equals(model)) { return "TCT (Alcatel) POP 2"; }
        else if ("5042W".equals(model)) { return "TCT (Alcatel) POP2 (4.5)"; }
        else if ("5042T".equals(model)) { return "TCT (Alcatel) 5042T"; }
        else if ("8030Y".equals(model)) { return "TCT (Alcatel) 8030Y"; }
        else if ("8055".equals(model)) { return "TCT (Alcatel) 8055"; }
        else if ("2PS64".equals(model)) { return "HTC 10"; }
        else if ("9DTB7".equals(model)) { return "Gigabyte Hipstreet 9DTB7 / Lazer MY9308P"; }
        else if ("5045X".equals(model)) { return "TCT (Alcatel) ALCATEL PIXI 4 (5)"; }
        else if ("920TPC".equals(model)) { return "IView 920TPC"; }
        else if ("7DTB25".equals(model)) { return "Hipstreet 7DTB25"; }
        else if ("4009M".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009A".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009F".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009E".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009X".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("4009S".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (3.5)"; }
        else if ("5025D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)"; }
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
        else if ("6045B".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH IDOL 3 (5.5)"; }
        else if ("1107".equals(model)) { return "Oppo 1107"; }
        else if ("1105".equals(model)) { return "Oppo 1105"; }
        else if ("1100".equals(model)) { return "Oppo 1100"; }
        else if ("9015W".equals(model)) { return "TCT (Alcatel) 9015W"; }
        else if ("4027X".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("4027N".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("4027A".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("4027D".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("8063".equals(model)) { return "TCT (Alcatel) 8063"; }
        else if ("402HW".equals(model)) { return "HUAWEI MediaPad 10 Link+"; }
        else if ("6043A".equals(model)) { return "TCT (Alcatel) 6043A"; }
        else if ("6043D".equals(model)) { return "TCT (Alcatel) 6043D"; }
        else if ("11DTB1".equals(model)) { return "Hipstreet Synergy"; }
        else if ("202F".equals(model)) { return "Fujitsu ARROWS A SoftBank 202F"; }
        else if ("7055A".equals(model)) { return "TCT (Alcatel) Hero2C"; }
        else if ("202K".equals(model)) { return "Kyocera DIGNO R"; }
        else if ("9007A".equals(model)) { return "TCT (Alcatel) ONETOUCH PIXI3(7)"; }
        else if ("5010E".equals(model)) { return "TCT (Alcatel) PIXI 4 (5)"; }
        else if ("5010D".equals(model)) { return "TCT (Alcatel) PIXI 4 (5)"; }
        else if ("5010G".equals(model)) { return "TCT (Alcatel) PIXI 4 (5)"; }
        else if ("80-1".equals(model)) { return "Gigaset Maxwell-10"; }
        else if ("5010U".equals(model)) { return "TCT (Alcatel) PIXI 4 (5)"; }
        else if ("6014X".equals(model)) { return "TCT (Alcatel) 6014X"; }
        else if ("502ZT".equals(model)) { return "ZTE Spro 2"; }
        else if ("7053D".equals(model)) { return "TCT (Alcatel) ALCATEL_ONETOUCH_7053D"; }
        else if ("4017F".equals(model)) { return "TCT (Alcatel) PIXI4 (3.5)"; }
        else if ("402LG".equals(model)) { return "LGE Spray"; }
        else if ("7D-501u".equals(model)) { return "HUAWEI MediaPad X1 7.0"; }
        else if ("6016D".equals(model)) { return "TCT (Alcatel) 6016D"; }
        else if ("6016E".equals(model)) { return "TCT (Alcatel) 6016E"; }
        else if ("6016A".equals(model)) { return "TCT (Alcatel) 6010A"; }
        else if ("6016X".equals(model)) { return "TCT (Alcatel) 6016X"; }
        else if ("5016A".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)"; }
        else if ("4035Y".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("4035X".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("4035D".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("4035A".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("501LV".equals(model)) { return "Lenovo Softbank 501LV"; }
        else if ("825_T-Mobile".equals(model)) { return "Doro Liberto 825"; }
        else if ("9020A".equals(model)) { return "TCT (Alcatel) 9020A"; }
        else if ("4003J".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("4003A".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("9788".equals(model)) { return "Gigabyte 9788"; }
        else if ("8079".equals(model)) { return "TCT (Alcatel) 8079"; }
        else if ("6036A".equals(model)) { return "TCT (Alcatel) Idol2 MINI S"; }
        else if ("6036X".equals(model)) { return "TCT (Alcatel) Idol2 MINI S"; }
        else if ("6036Y".equals(model)) { return "TCT (Alcatel) Idol2 MINI S"; }
        else if ("9001X".equals(model)) { return "TCT (Alcatel) 9001X"; }
        else if ("9001D".equals(model)) { return "TCT (Alcatel) 9001D"; }
        else if ("9022X".equals(model)) { return "TCT (Alcatel) ONETOUCH PIXI 3 (8)"; }
        else if ("5025X".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)"; }
        else if ("5025E".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)"; }
        else if ("5025G".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5.5)"; }
        else if ("5070D".equals(model)) { return "TCT (Alcatel) 5070D"; }
        else if ("5016J".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH POP 3 (5)"; }
        else if ("14A-DA".equals(model)) { return "Honda A-DA"; }
        else if ("9007X".equals(model)) { return "TCT (Alcatel) ONETOUCH PIXI3(7)"; }
        else if ("4028J".equals(model)) { return "TCT (Alcatel) PIXI3(4.5)"; }
        else if ("4017X".equals(model)) { return "TCT (Alcatel) PIXI4 (3.5)"; }
        else if ("4017A".equals(model)) { return "TCT (Alcatel) PIXI4 (3.5)"; }
        else if ("404KC".equals(model)) { return "Kyocera 404KC"; }
        else if ("10DTB42".equals(model)) { return "Hipstreet Pilot"; }
        else if ("10DTB44".equals(model)) { return "Hipstreet Phantom2"; }
        else if ("5098S".equals(model)) { return "TCT (Alcatel) 5098S"; }
        else if ("9005X".equals(model)) { return "TCT (Alcatel) 9005X"; }
        else if ("4033L".equals(model)) { return "TCT (Alcatel) ONE TOUCH 4033X"; }
        else if ("0PCV1".equals(model)) { return "HTC Desire 510"; }
        else if ("304SH".equals(model)) { return "Sharp AQUOS Xx 304SH"; }
        else if ("4045O".equals(model)) { return "TCT (Alcatel) POP2 (4)"; }
        else if ("4045L".equals(model)) { return "TCT (Alcatel) POP2 (4)"; }
        else if ("4045A".equals(model)) { return "TCT (Alcatel) POP2 (4)"; }
        else if ("4045D".equals(model)) { return "TCT (Alcatel) POP2 (4)"; }
        else if ("4045X".equals(model)) { return "TCT (Alcatel) POP2 (4)"; }
        else if ("4013E".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("4013D".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("4013K".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("4013X".equals(model)) { return "TCT (Alcatel) PIXI3(4)"; }
        else if ("302KC".equals(model)) { return "Kyocera DIGNO T"; }
        else if ("40TL04".equals(model)) { return "Sanyo Benesse"; }
        else if ("2013023".equals(model)) { return "Xiaomi China"; }
        else if ("2013022".equals(model)) { return "Xiaomi Hong Mi"; }
        else if ("102P".equals(model)) { return "Panasonic 102P"; }
        else if ("7040T".equals(model)) { return "TCT (Alcatel) 7040T"; }
        else if ("7040R".equals(model)) { return "TCT (Alcatel) 7040R"; }
        else if ("10.1Myros".equals(model)) { return "Vestel VP100+"; }
        else if ("7040N".equals(model)) { return "Alcatel One Touch Fierce 2"; }
        else if ("5065N".equals(model)) { return "TCT (Alcatel) 5065N"; }
        else if ("4013M".equals(model)) { return "TCT (Alcatel) 4013M"; }
        else if ("5019D".equals(model)) { return "TCT (Alcatel) ALCATEL ONETOUCH PIXI 3 (4.5)"; }
        else if ("501SO".equals(model)) { return "Sony Xperia Z5"; }
        else if ("776TPCIII".equals(model)) { return "iView 776TPCIII"; }
        else if ("8030B".equals(model)) { return "TCT (Alcatel) 8030B"; }
        else if ("6070K".equals(model)) { return "TCT (Alcatel) IDOL 4S"; }
        else if ("6055B".equals(model)) { return "TCT (Alcatel) 6055B"; }
        else if ("6055K".equals(model)) { return "TCT (Alcatel) 6055K"; }
        else if ("7044X".equals(model)) { return "TCT (Alcatel) POP 2 (5)"; }
        else if ("7044A".equals(model)) { return "TCT (Alcatel) POP 2 (5)"; }
        else if ("101P51D".equals(model)) { return "Mecer 101P51D"; }
        else if ("503HW".equals(model)) { return "Huawei ALE-L02"; }
        else if ("800P71D".equals(model)) { return "Mecer 800P71D"; }
        else if ("8753".equals(model)) { return "Spectralink PIVOT 8741/8753"; }
        else if ("4035X_Orange".equals(model)) { return "TCT (Alcatel) Soul 4"; }
        else if ("204HW".equals(model)) { return "Huawei hw204HW"; }
        else if ("003Z".equals(model)) { return "ZTE Blade"; }
        else if ("003P".equals(model)) { return "Panasonic 003P"; }
        else if ("5010S".equals(model)) { return "TCT (Alcatel) PIXI 4 (5)"; }
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
        return "";

    }


    private DeviceNames() {
    }

}
