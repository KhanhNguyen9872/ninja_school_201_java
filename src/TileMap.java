import java.io.DataInputStream;
import main.GameMidlet;
import main.GameCanvas;
import java.util.Vector;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class TileMap
{
    public static int Class1;
    public static int Class2;
    public static int pxw;
    public static int pxh;
    public static int Class5;
    public static char[] Class6;
    public static int[] Class7;
    private static Image Class31;
    private static Image Class32;
    public static Image Class8;
    private static Image Class33;
    private static Image Class34;
    private static Image Class35;
    private static Image Class36;
    private static Image Class37;
    public static byte Class9;
    private static int Class38;
    private static int Class39;
    private static int Class40;
    private static int Class41;
    public static String Class10;
    public static String Class11;
    public static byte zoneID;
    public static byte Class13;
    public static byte Class14;
    public static short mapID;
    private static int Class42;
    private static int cmyMini;
    private static int Class44;
    private static int Class45;
    private static int Class46;
    private static int cmxMini;
    private static int Class48;
    private static int Class49;
    public static int wMiniMap;
    public static int hMiniMap;
    public static int Class18;
    public static int Class19;
    public static Vector vGo;
    public static String[] mapNames;
    public static Game40 Class22;
    public static Game40 Class23;
    private static int Class50;
    public static int Class24;
    public static int Class25;
    public static int Class26;
    public static int Class27;
    public static int Class28;
    public static int Class29;
    public static int Class30;
    private static int[] Class51;
    private static short[][] at2Short;
    private static boolean[] atBool;
    private static int[] atInt;
    private static short[] atShort;
    public static int MapMod;
    public static boolean IsDangGoMap;
    public static boolean isLockMap;
    private static Object objLockMap;
    public static short Game16666;
    
    static {
        TileMap.Game16666 = 0;
        TileMap.at2Short = new short[160][];
        TileMap.atBool = new boolean[160];
        TileMap.atInt = new int[160];
        TileMap.atShort = new short[160];
        TileMap.at2Short[0] = new short[] { 27 };
        TileMap.at2Short[1] = new short[] { 2, 3, 27, 72, 91, 94, 105, 114, 125, 157, 139, 113, 80 };
        TileMap.at2Short[2] = new short[] { 6, 1 };
        TileMap.at2Short[3] = new short[] { 1, 4 };
        TileMap.at2Short[4] = new short[] { 3, 5 };
        TileMap.at2Short[5] = new short[] { 7, 4 };
        TileMap.at2Short[6] = new short[] { 7, 2, 20, 21 };
        TileMap.at2Short[7] = new short[] { 6, 5, 8 };
        TileMap.at2Short[8] = new short[] { 7, 9 };
        TileMap.at2Short[9] = new short[] { 8, 10 };
        TileMap.at2Short[10] = new short[] { 9, 11, 17, 22, 32, 38, 43, 48, 139 };
        TileMap.at2Short[11] = new short[] { 12, 10 };
        TileMap.at2Short[12] = new short[] { 11, 57 };
        TileMap.at2Short[13] = new short[] { 57, 14 };
        TileMap.at2Short[14] = new short[] { 13, 15 };
        TileMap.at2Short[15] = new short[] { 14, 16 };
        TileMap.at2Short[16] = new short[] { 15, 17 };
        TileMap.at2Short[17] = new short[] { 16, 18, 10, 22, 32, 38, 43, 48, 139 };
        TileMap.at2Short[18] = new short[] { 17, 19 };
        TileMap.at2Short[19] = new short[] { 18, 58 };
        TileMap.at2Short[20] = new short[] { 6 };
        TileMap.at2Short[21] = new short[] { 22, 6 };
        TileMap.at2Short[22] = new short[] { 23, 21, 10, 17, 32, 38, 43, 48, 139 };
        TileMap.at2Short[23] = new short[] { 22, 69, 25 };
        TileMap.at2Short[24] = new short[] { 59, 36 };
        TileMap.at2Short[25] = new short[] { 23, 26 };
        TileMap.at2Short[26] = new short[] { 27, 25 };
        TileMap.at2Short[27] = new short[] { 26, 28, 1, 72, 91, 94, 105, 114, 125, 157, 139, 113, 80 };
        TileMap.at2Short[28] = new short[] { 27, 60 };
        TileMap.at2Short[29] = new short[] { 60, 30 };
        TileMap.at2Short[30] = new short[] { 29, 31 };
        TileMap.at2Short[31] = new short[] { 32, 30 };
        TileMap.at2Short[32] = new short[] { 31, 61, 10, 17, 22, 38, 43, 48, 139 };
        TileMap.at2Short[33] = new short[] { 61, 34 };
        TileMap.at2Short[34] = new short[] { 35, 33 };
        TileMap.at2Short[35] = new short[] { 34, 66 };
        TileMap.at2Short[36] = new short[] { 37, 24 };
        TileMap.at2Short[37] = new short[] { 36 };
        TileMap.at2Short[38] = new short[] { 67, 68, 10, 17, 22, 32, 43, 48, 139 };
        TileMap.at2Short[39] = new short[] { 72, 46, 40 };
        TileMap.at2Short[40] = new short[] { 39, 65, 41 };
        TileMap.at2Short[41] = new short[] { 42, 40, 43 };
        TileMap.at2Short[42] = new short[] { 62, 41 };
        TileMap.at2Short[43] = new short[] { 41, 44, 10, 17, 22, 32, 38, 48, 139 };
        TileMap.at2Short[44] = new short[] { 43, 45 };
        TileMap.at2Short[45] = new short[] { 44, 53 };
        TileMap.at2Short[46] = new short[] { 63, 39, 47 };
        TileMap.at2Short[47] = new short[] { 46, 48 };
        TileMap.at2Short[48] = new short[] { 47, 50, 10, 17, 22, 32, 38, 43, 139 };
        TileMap.at2Short[49] = new short[] { 50, 51 };
        TileMap.at2Short[50] = new short[] { 48, 49 };
        TileMap.at2Short[51] = new short[] { 52, 49 };
        TileMap.at2Short[52] = new short[] { 51, 64 };
        TileMap.at2Short[53] = new short[] { 54, 45 };
        TileMap.at2Short[54] = new short[] { 55, 53 };
        TileMap.at2Short[55] = new short[] { 54 };
        TileMap.at2Short[56] = new short[] { 72 };
        TileMap.at2Short[57] = new short[] { 12, 13 };
        TileMap.at2Short[58] = new short[] { 19 };
        TileMap.at2Short[59] = new short[] { 68, 24 };
        TileMap.at2Short[60] = new short[] { 28, 29 };
        TileMap.at2Short[61] = new short[] { 33, 32 };
        TileMap.at2Short[62] = new short[] { 42 };
        TileMap.at2Short[63] = new short[] { 46 };
        TileMap.at2Short[64] = new short[] { 52 };
        TileMap.at2Short[65] = new short[] { 40 };
        TileMap.at2Short[66] = new short[] { 67, 35 };
        TileMap.at2Short[67] = new short[] { 66, 38 };
        TileMap.at2Short[68] = new short[] { 59, 38 };
        TileMap.at2Short[69] = new short[] { 70, 23 };
        TileMap.at2Short[70] = new short[] { 69, 71 };
        TileMap.at2Short[71] = new short[] { 72, 70 };
        TileMap.at2Short[72] = new short[] { 71, 39, 1, 27, 91, 94, 105, 114, 125, 157, 139, 113, 80 };
        TileMap.at2Short[73] = new short[] { 1 };
        TileMap.at2Short[74] = new short[0];
        TileMap.at2Short[75] = new short[0];
        TileMap.at2Short[76] = new short[0];
        TileMap.at2Short[77] = new short[0];
        TileMap.at2Short[78] = new short[0];
        TileMap.at2Short[79] = new short[0];
        TileMap.at2Short[80] = new short[] { 81, 82, 83 };
        TileMap.at2Short[81] = new short[] { 80, 84 };
        TileMap.at2Short[82] = new short[] { 80, 85 };
        TileMap.at2Short[83] = new short[] { 80, 86 };
        TileMap.at2Short[84] = new short[] { 81, 87 };
        TileMap.at2Short[85] = new short[] { 82, 88 };
        TileMap.at2Short[86] = new short[] { 83, 89 };
        TileMap.at2Short[87] = new short[] { 84, 90 };
        TileMap.at2Short[88] = new short[] { 85, 90 };
        TileMap.at2Short[89] = new short[] { 86, 90 };
        TileMap.at2Short[90] = new short[0];
        TileMap.at2Short[91] = new short[] { 92 };
        TileMap.at2Short[92] = new short[] { 91, 93 };
        TileMap.at2Short[93] = new short[] { 92 };
        TileMap.at2Short[94] = new short[] { 95 };
        TileMap.at2Short[95] = new short[] { 94, 96 };
        TileMap.at2Short[96] = new short[] { 95, 97 };
        TileMap.at2Short[97] = new short[] { 96 };
        TileMap.at2Short[98] = new short[] { 99 };
        TileMap.at2Short[99] = new short[] { 98, 101, 100, 102 };
        TileMap.at2Short[100] = new short[] { 99, 103 };
        TileMap.at2Short[101] = new short[] { 99, 103 };
        TileMap.at2Short[102] = new short[] { 99, 103 };
        TileMap.at2Short[103] = new short[] { 101, 102, 104, 100 };
        TileMap.at2Short[104] = new short[] { 103 };
        TileMap.at2Short[105] = new short[] { 107, 106, 108 };
        TileMap.at2Short[106] = new short[] { 105, 109 };
        TileMap.at2Short[107] = new short[] { 105, 109 };
        TileMap.at2Short[108] = new short[] { 105, 109 };
        TileMap.at2Short[109] = new short[] { 106, 107, 108 };
        TileMap.at2Short[110] = new short[0];
        TileMap.at2Short[111] = new short[0];
        TileMap.at2Short[112] = new short[] { 113 };
        TileMap.at2Short[113] = new short[] { 112 };
        TileMap.at2Short[114] = new short[] { 115 };
        TileMap.at2Short[115] = new short[] { 114, 116 };
        TileMap.at2Short[116] = new short[] { 115 };
        TileMap.at2Short[117] = new short[0];
        TileMap.at2Short[118] = new short[0];
        TileMap.at2Short[119] = new short[0];
        TileMap.at2Short[120] = new short[0];
        TileMap.at2Short[121] = new short[0];
        TileMap.at2Short[122] = new short[0];
        TileMap.at2Short[123] = new short[0];
        TileMap.at2Short[124] = new short[0];
        TileMap.at2Short[125] = new short[] { 126 };
        TileMap.at2Short[126] = new short[] { 125, 127 };
        TileMap.at2Short[127] = new short[] { 126, 128 };
        TileMap.at2Short[128] = new short[] { 127 };
        TileMap.at2Short[129] = new short[0];
        TileMap.at2Short[130] = new short[0];
        TileMap.at2Short[131] = new short[0];
        TileMap.at2Short[132] = new short[0];
        TileMap.at2Short[133] = new short[0];
        TileMap.at2Short[134] = new short[] { 138 };
        TileMap.at2Short[135] = new short[] { 138 };
        TileMap.at2Short[136] = new short[] { 138 };
        TileMap.at2Short[137] = new short[] { 138 };
        TileMap.at2Short[138] = new short[] { 134, 135, 136, 137 };
        TileMap.at2Short[139] = new short[] { 140 };
        TileMap.at2Short[140] = new short[] { 139, 141 };
        TileMap.at2Short[141] = new short[] { 140, 142 };
        TileMap.at2Short[142] = new short[] { 141, 143 };
        TileMap.at2Short[143] = new short[] { 142, 144 };
        TileMap.at2Short[144] = new short[] { 143, 145 };
        TileMap.at2Short[145] = new short[] { 144, 146 };
        TileMap.at2Short[146] = new short[] { 145, 147 };
        TileMap.at2Short[147] = new short[] { 146, 148 };
        TileMap.at2Short[148] = new short[] { 147 };
        TileMap.at2Short[149] = new short[0];
        TileMap.at2Short[150] = new short[0];
        TileMap.at2Short[151] = new short[0];
        TileMap.at2Short[152] = new short[0];
        TileMap.at2Short[153] = new short[0];
        TileMap.at2Short[154] = new short[0];
        TileMap.at2Short[155] = new short[0];
        TileMap.at2Short[156] = new short[0];
        TileMap.at2Short[157] = new short[] { 158, 159 };
        TileMap.at2Short[158] = new short[] { 157, 159 };
        TileMap.at2Short[159] = new short[] { 158, 157 };
        TileMap.MapMod = -1;
        TileMap.IsDangGoMap = false;
        TileMap.isLockMap = false;
        TileMap.objLockMap = new Object();
        TileMap.Class9 = 24;
        TileMap.Class10 = null;
        TileMap.Class11 = "";
        TileMap.vGo = new Vector();
        TileMap.Class22 = new Game40();
        TileMap.Class23 = new Game40();
        TileMap.Class24 = 2;
        TileMap.Class51 = new int[] { 5257738, 8807192 };
    }
    
    public static void Class1(final int class18, final int class19, final int wMiniMap, final int hMiniMap) {
        TileMap.wMiniMap = wMiniMap;
        TileMap.hMiniMap = hMiniMap;
        TileMap.Class18 = class18;
        TileMap.Class19 = class19;
    }
    
    public static void Class1() {
        TileMap.Class46 = Char.getMyChar().cx / 12;
        TileMap.Class42 = Char.getMyChar().cy / 12;
        if (TileMap.Class46 > TileMap.Class1 * TileMap.Class24 - TileMap.wMiniMap / 2) {
            TileMap.Class46 = TileMap.Class1 * TileMap.Class24 - TileMap.wMiniMap;
        }
        else if (TileMap.Class46 < TileMap.wMiniMap / 2) {
            TileMap.Class46 = 0;
        }
        else {
            TileMap.Class46 -= TileMap.wMiniMap / 2;
        }
        if (TileMap.Class42 < TileMap.hMiniMap / 2) {
            TileMap.Class42 = 0;
        }
        else {
            TileMap.Class42 -= TileMap.hMiniMap / 2;
        }
        if (TileMap.Class42 > TileMap.Class2 * TileMap.Class24 - TileMap.hMiniMap) {
            TileMap.Class42 = TileMap.Class2 * TileMap.Class24 - TileMap.hMiniMap;
        }
    }
    
    public static void Class2() {
        if (TileMap.Class1 * TileMap.Class24 >= TileMap.wMiniMap || TileMap.Class2 * TileMap.Class24 >= TileMap.hMiniMap) {
            if (TileMap.cmyMini != TileMap.Class42) {
                TileMap.Class45 = TileMap.Class42 - TileMap.cmyMini << 2;
                TileMap.Class44 += TileMap.Class45;
                TileMap.cmyMini += TileMap.Class44 >> 4;
                TileMap.Class44 &= 0xF;
            }
            if (TileMap.cmxMini != TileMap.Class46) {
                TileMap.Class49 = TileMap.Class46 - TileMap.cmxMini << 2;
                TileMap.Class48 += TileMap.Class49;
                TileMap.cmxMini += TileMap.Class48 >> 4;
                TileMap.Class48 &= 0xF;
            }
        }
    }
    
    public static void Class3() {
        TileMap.Class31 = null;
        System.gc();
    }
    
    static final void Class4() {
        if (TileMap.Class36 == null) {
            TileMap.Class36 = GameCanvas.Class3("/t/uwt.png");
        }
        if (TileMap.Class33 == null) {
            TileMap.Class33 = GameCanvas.Class3("/t/wtf.png");
        }
        if (TileMap.Class34 == null) {
            TileMap.Class34 = GameCanvas.Class3("/t/twtf.png");
        }
        if (TileMap.Class35 == null) {
            TileMap.Class35 = GameCanvas.Class3("/t/wts.png");
        }
        if (TileMap.Class37 == null) {
            TileMap.Class37 = GameCanvas.Class3("/t/wts1.png");
        }
        System.gc();
    }
    
    public static void Class1(int i) {
        TileMap.pxh = TileMap.Class2 * TileMap.Class9;
        TileMap.pxw = TileMap.Class1 * TileMap.Class9;
        try {
            for (int j = 0; j < TileMap.Class1 * TileMap.Class2; ++j) {
                final int k = j;
                if (TileMap.Class22 != null && TileMap.Class22.Class1(new StringBuffer(String.valueOf(k)).toString()) != null) {
                    final int[] class7 = TileMap.Class7;
                    final int n = j;
                    class7[n] |= 0x2;
                }
                if (i == 4) {
                    if (TileMap.Class6[j] == '\u0001' || TileMap.Class6[j] == '\u0002' || TileMap.Class6[j] == '\u0003' || TileMap.Class6[j] == '\u0004' || TileMap.Class6[j] == '\u0005' || TileMap.Class6[j] == '\u0006' || TileMap.Class6[j] == '\t' || TileMap.Class6[j] == '\n' || TileMap.Class6[j] == 'O' || TileMap.Class6[j] == 'P' || TileMap.Class6[j] == '\r' || TileMap.Class6[j] == '\u000e' || TileMap.Class6[j] == '+' || TileMap.Class6[j] == ',' || TileMap.Class6[j] == '-' || TileMap.Class6[j] == '2') {
                        final int[] class8 = TileMap.Class7;
                        final int n2 = j;
                        class8[n2] |= 0x2;
                    }
                    if (TileMap.Class6[j] == '\t' || TileMap.Class6[j] == '\u000b') {
                        final int[] class9 = TileMap.Class7;
                        final int n3 = j;
                        class9[n3] |= 0x4;
                    }
                    if (TileMap.Class6[j] == '\n' || TileMap.Class6[j] == '\f') {
                        final int[] class10 = TileMap.Class7;
                        final int n4 = j;
                        class10[n4] |= 0x8;
                    }
                    if (TileMap.Class6[j] == '\r' || TileMap.Class6[j] == '\u000e') {
                        final int[] class11 = TileMap.Class7;
                        final int n5 = j;
                        class11[n5] |= 0x400;
                    }
                    if (TileMap.Class6[j] == 'L' || TileMap.Class6[j] == 'M') {
                        final int[] class12 = TileMap.Class7;
                        final int n6 = j;
                        class12[n6] |= 0x40;
                        if (TileMap.Class6[j] == 'N') {
                            final int[] class13 = TileMap.Class7;
                            final int n7 = j;
                            class13[n7] |= 0x1000;
                        }
                    }
                }
                if (i == 1) {
                    if (TileMap.Class6[j] == '\u0016') {
                        TileMap.Class50 = TileMap.Class6[j] - '\u0001';
                    }
                    if (TileMap.Class6[j] == '\u0001' || TileMap.Class6[j] == '\u0002' || TileMap.Class6[j] == '\u0003' || TileMap.Class6[j] == '\u0004' || TileMap.Class6[j] == '\u0005' || TileMap.Class6[j] == '\u0006' || TileMap.Class6[j] == '\u0007' || TileMap.Class6[j] == '$' || TileMap.Class6[j] == '%' || TileMap.Class6[j] == '6' || TileMap.Class6[j] == '[' || TileMap.Class6[j] == '\\' || TileMap.Class6[j] == ']' || TileMap.Class6[j] == '^' || TileMap.Class6[j] == 'I' || TileMap.Class6[j] == 'J' || TileMap.Class6[j] == 'a' || TileMap.Class6[j] == 'b' || TileMap.Class6[j] == 't' || TileMap.Class6[j] == 'u' || TileMap.Class6[j] == 'v' || TileMap.Class6[j] == 'x' || TileMap.Class6[j] == '=') {
                        final int[] class14 = TileMap.Class7;
                        final int n8 = j;
                        class14[n8] |= 0x2;
                    }
                    if (TileMap.Class6[j] == '\u0002' || TileMap.Class6[j] == '\u0003' || TileMap.Class6[j] == '\u0004' || TileMap.Class6[j] == '\u0005' || TileMap.Class6[j] == '\u0006' || TileMap.Class6[j] == '\u0014' || TileMap.Class6[j] == '\u0015' || TileMap.Class6[j] == '\u0016' || TileMap.Class6[j] == '\u0017' || TileMap.Class6[j] == '$' || TileMap.Class6[j] == '%' || TileMap.Class6[j] == '&' || TileMap.Class6[j] == '\'' || TileMap.Class6[j] == '=') {
                        final int[] class15 = TileMap.Class7;
                        final int n9 = j;
                        class15[n9] |= 0x1000;
                    }
                    if (TileMap.Class6[j] == '\b' || TileMap.Class6[j] == '\t' || TileMap.Class6[j] == '\n' || TileMap.Class6[j] == '\f' || TileMap.Class6[j] == '\r' || TileMap.Class6[j] == '\u000e' || TileMap.Class6[j] == '\u001e') {
                        final int[] class16 = TileMap.Class7;
                        final int n10 = j;
                        class16[n10] |= 0x10;
                    }
                    if (TileMap.Class6[j] == '\u0011') {
                        final int[] class17 = TileMap.Class7;
                        final int n11 = j;
                        class17[n11] |= 0x20;
                    }
                    if (TileMap.Class6[j] == '\u0012') {
                        final int[] class18 = TileMap.Class7;
                        final int n12 = j;
                        class18[n12] |= 0x80;
                    }
                    if (TileMap.Class6[j] == '%' || TileMap.Class6[j] == '&' || TileMap.Class6[j] == '=') {
                        final int[] class19 = TileMap.Class7;
                        final int n13 = j;
                        class19[n13] |= 0x4;
                    }
                    if (TileMap.Class6[j] == '$' || TileMap.Class6[j] == '\'' || TileMap.Class6[j] == '=') {
                        final int[] class20 = TileMap.Class7;
                        final int n14 = j;
                        class20[n14] |= 0x8;
                    }
                    if (TileMap.Class6[j] == '\u0013') {
                        final int[] class21 = TileMap.Class7;
                        final int n15 = j;
                        class21[n15] |= 0x40;
                        if ((TileMap.Class7[j - TileMap.Class1] & 0x1000) == 0x1000) {
                            final int[] class22 = TileMap.Class7;
                            final int n16 = j;
                            class22[n16] |= 0x1000;
                        }
                    }
                    if (TileMap.Class6[j] == '#') {
                        final int[] class23 = TileMap.Class7;
                        final int n17 = j;
                        class23[n17] |= 0x800;
                    }
                    if (TileMap.Class6[j] == '\u0007') {
                        final int[] class24 = TileMap.Class7;
                        final int n18 = j;
                        class24[n18] |= 0x400;
                    }
                    if (TileMap.Class6[j] == ' ' || TileMap.Class6[j] == '!' || TileMap.Class6[j] == '\"') {
                        final int[] class25 = TileMap.Class7;
                        final int n19 = j;
                        class25[n19] |= 0x100;
                    }
                }
                if (i == 2) {
                    if (TileMap.Class6[j] == '\u0016' || TileMap.Class6[j] == 'g' || TileMap.Class6[j] == 'o') {
                        TileMap.Class50 = TileMap.Class6[j] - '\u0001';
                    }
                    if (TileMap.Class6[j] == '\u0001' || TileMap.Class6[j] == '\u0002' || TileMap.Class6[j] == '\u0003' || TileMap.Class6[j] == '\u0004' || TileMap.Class6[j] == '\u0005' || TileMap.Class6[j] == '\u0006' || TileMap.Class6[j] == '\u0007' || TileMap.Class6[j] == '$' || TileMap.Class6[j] == '%' || TileMap.Class6[j] == '6' || TileMap.Class6[j] == '=' || TileMap.Class6[j] == 'I' || TileMap.Class6[j] == 'L' || TileMap.Class6[j] == 'M' || TileMap.Class6[j] == 'N' || TileMap.Class6[j] == 'O' || TileMap.Class6[j] == 'R' || TileMap.Class6[j] == 'S' || TileMap.Class6[j] == 'b' || TileMap.Class6[j] == 'c' || TileMap.Class6[j] == 'd' || TileMap.Class6[j] == 'f' || TileMap.Class6[j] == 'g' || TileMap.Class6[j] == 'l' || TileMap.Class6[j] == 'm' || TileMap.Class6[j] == 'n' || TileMap.Class6[j] == 'p' || TileMap.Class6[j] == 'q' || TileMap.Class6[j] == 't' || TileMap.Class6[j] == 'u' || TileMap.Class6[j] == '}' || TileMap.Class6[j] == '~' || TileMap.Class6[j] == '\u007f' || TileMap.Class6[j] == '\u0081' || TileMap.Class6[j] == '\u0082') {
                        final int[] class26 = TileMap.Class7;
                        final int n20 = j;
                        class26[n20] |= 0x2;
                    }
                    if (TileMap.Class6[j] == '\u0001' || TileMap.Class6[j] == '\u0003' || TileMap.Class6[j] == '\u0004' || TileMap.Class6[j] == '\u0005' || TileMap.Class6[j] == '\u0006' || TileMap.Class6[j] == '\u0014' || TileMap.Class6[j] == '\u0015' || TileMap.Class6[j] == '\u0016' || TileMap.Class6[j] == '\u0017' || TileMap.Class6[j] == '$' || TileMap.Class6[j] == '%' || TileMap.Class6[j] == '&' || TileMap.Class6[j] == '\'' || TileMap.Class6[j] == '7' || TileMap.Class6[j] == 'm' || TileMap.Class6[j] == 'o' || TileMap.Class6[j] == 'p' || TileMap.Class6[j] == 'q' || TileMap.Class6[j] == 'r' || TileMap.Class6[j] == 's' || TileMap.Class6[j] == 't' || TileMap.Class6[j] == '\u007f' || TileMap.Class6[j] == '\u0081' || TileMap.Class6[j] == '\u0082') {
                        final int[] class27 = TileMap.Class7;
                        final int n21 = j;
                        class27[n21] |= 0x1000;
                    }
                    if (TileMap.Class6[j] == '\b' || TileMap.Class6[j] == '\t' || TileMap.Class6[j] == '\n' || TileMap.Class6[j] == '\f' || TileMap.Class6[j] == '\r' || TileMap.Class6[j] == '\u000e' || TileMap.Class6[j] == '\u001e' || TileMap.Class6[j] == '\u0087') {
                        final int[] class28 = TileMap.Class7;
                        final int n22 = j;
                        class28[n22] |= 0x10;
                    }
                    if (TileMap.Class6[j] == '\u0011') {
                        final int[] class29 = TileMap.Class7;
                        final int n23 = j;
                        class29[n23] |= 0x20;
                    }
                    if (TileMap.Class6[j] == '\u0012') {
                        final int[] class30 = TileMap.Class7;
                        final int n24 = j;
                        class30[n24] |= 0x80;
                    }
                    if (TileMap.Class6[j] == '=' || TileMap.Class6[j] == '%' || TileMap.Class6[j] == '&' || TileMap.Class6[j] == '\u007f' || TileMap.Class6[j] == '\u0082' || TileMap.Class6[j] == '\u0083') {
                        final int[] class31 = TileMap.Class7;
                        final int n25 = j;
                        class31[n25] |= 0x4;
                    }
                    if (TileMap.Class6[j] == '=' || TileMap.Class6[j] == '$' || TileMap.Class6[j] == '\'' || TileMap.Class6[j] == '\u007f' || TileMap.Class6[j] == '\u0081' || TileMap.Class6[j] == '\u0084') {
                        final int[] class32 = TileMap.Class7;
                        final int n26 = j;
                        class32[n26] |= 0x8;
                    }
                    if (TileMap.Class6[j] == '\u0013') {
                        final int[] class33 = TileMap.Class7;
                        final int n27 = j;
                        class33[n27] |= 0x40;
                        if ((TileMap.Class7[j - TileMap.Class1] & 0x1000) == 0x1000) {
                            final int[] class34 = TileMap.Class7;
                            final int n28 = j;
                            class34[n28] |= 0x1000;
                        }
                    }
                    if (TileMap.Class6[j] == '\u0086') {
                        final int[] class35 = TileMap.Class7;
                        final int n29 = j;
                        class35[n29] |= 0x40;
                        if ((TileMap.Class7[j - TileMap.Class1] & 0x1000) == 0x1000) {
                            final int[] class36 = TileMap.Class7;
                            final int n30 = j;
                            class36[n30] |= 0x1000;
                        }
                    }
                    if (TileMap.Class6[j] == '#') {
                        final int[] class37 = TileMap.Class7;
                        final int n31 = j;
                        class37[n31] |= 0x800;
                    }
                    if (TileMap.Class6[j] == '\u0007') {
                        final int[] class38 = TileMap.Class7;
                        final int n32 = j;
                        class38[n32] |= 0x400;
                    }
                    if (TileMap.Class6[j] == ' ' || TileMap.Class6[j] == '!' || TileMap.Class6[j] == '\"') {
                        final int[] class39 = TileMap.Class7;
                        final int n33 = j;
                        class39[n33] |= 0x100;
                    }
                    if (TileMap.Class6[j] == '=' || TileMap.Class6[j] == '\u007f') {
                        final int[] class40 = TileMap.Class7;
                        final int n34 = j;
                        class40[n34] |= 0x2000;
                    }
                }
                if (i == 3) {
                    if (TileMap.Class6[j] == '\f' || TileMap.Class6[j] == '3' || TileMap.Class6[j] == 'X' || TileMap.Class6[j] == 't' || TileMap.Class6[j] == '\u0080') {
                        TileMap.Class50 = TileMap.Class6[j] - '\u0001';
                    }
                    if (TileMap.Class6[j] == 'm' || TileMap.Class6[j] == 'n') {
                        TileMap.Class50 = TileMap.Class6[j];
                    }
                    if (TileMap.Class6[j] == '\u0001' || TileMap.Class6[j] == '\u0002' || TileMap.Class6[j] == '\u0003' || TileMap.Class6[j] == '\u0004' || TileMap.Class6[j] == '\u0005' || TileMap.Class6[j] == '\u0006' || TileMap.Class6[j] == '\u0007' || TileMap.Class6[j] == '\u000b' || TileMap.Class6[j] == '\u000e' || TileMap.Class6[j] == '\u0011' || TileMap.Class6[j] == '+' || TileMap.Class6[j] == '3' || TileMap.Class6[j] == '?' || TileMap.Class6[j] == 'A' || TileMap.Class6[j] == 'C' || TileMap.Class6[j] == 'D' || TileMap.Class6[j] == 'G' || TileMap.Class6[j] == 'H' || TileMap.Class6[j] == 'S' || TileMap.Class6[j] == 'T' || TileMap.Class6[j] == 'U' || TileMap.Class6[j] == 'W' || TileMap.Class6[j] == '[' || TileMap.Class6[j] == '^' || TileMap.Class6[j] == 'a' || TileMap.Class6[j] == 'b' || TileMap.Class6[j] == 'j' || TileMap.Class6[j] == 'k' || TileMap.Class6[j] == 'o' || TileMap.Class6[j] == 'q' || TileMap.Class6[j] == 'u' || TileMap.Class6[j] == 'v' || TileMap.Class6[j] == 'w' || TileMap.Class6[j] == '}' || TileMap.Class6[j] == '~' || TileMap.Class6[j] == '\u0081' || TileMap.Class6[j] == '\u0082' || TileMap.Class6[j] == '\u0083' || TileMap.Class6[j] == '\u0085' || TileMap.Class6[j] == '\u0088' || TileMap.Class6[j] == '\u008a' || TileMap.Class6[j] == '\u008b' || TileMap.Class6[j] == '\u008e') {
                        final int[] class41 = TileMap.Class7;
                        final int n35 = j;
                        class41[n35] |= 0x2;
                    }
                    if (TileMap.Class6[j] == '|' || TileMap.Class6[j] == 't' || TileMap.Class6[j] == '{' || TileMap.Class6[j] == ',' || TileMap.Class6[j] == '\f' || TileMap.Class6[j] == '\u000f' || TileMap.Class6[j] == '\u0010' || TileMap.Class6[j] == '-' || TileMap.Class6[j] == '\n' || TileMap.Class6[j] == '\t') {
                        final int[] class42 = TileMap.Class7;
                        final int n36 = j;
                        class42[n36] |= 0x1000;
                    }
                    if (TileMap.Class6[j] == '\u0017') {
                        final int[] class43 = TileMap.Class7;
                        final int n37 = j;
                        class43[n37] |= 0x20;
                    }
                    if (TileMap.Class6[j] == '\u0018') {
                        final int[] class44 = TileMap.Class7;
                        final int n38 = j;
                        class44[n38] |= 0x80;
                    }
                    if (TileMap.Class6[j] == '\u0006' || TileMap.Class6[j] == '\u000f' || TileMap.Class6[j] == '3' || TileMap.Class6[j] == '_' || TileMap.Class6[j] == 'a' || TileMap.Class6[j] == 'j' || TileMap.Class6[j] == 'o' || TileMap.Class6[j] == '{' || TileMap.Class6[j] == '}' || TileMap.Class6[j] == '\u008a' || TileMap.Class6[j] == '\u008c') {
                        final int[] class45 = TileMap.Class7;
                        final int n39 = j;
                        class45[n39] |= 0x4;
                    }
                    if (TileMap.Class6[j] == '\u0007' || TileMap.Class6[j] == '\u0010' || TileMap.Class6[j] == '3' || TileMap.Class6[j] == '`' || TileMap.Class6[j] == 'b' || TileMap.Class6[j] == 'k' || TileMap.Class6[j] == 'o' || TileMap.Class6[j] == '|' || TileMap.Class6[j] == '~' || TileMap.Class6[j] == '\u008b' || TileMap.Class6[j] == '\u008d') {
                        final int[] class46 = TileMap.Class7;
                        final int n40 = j;
                        class46[n40] |= 0x8;
                    }
                    if (TileMap.Class6[j] == '\u0019') {
                        final int[] class47 = TileMap.Class7;
                        final int n41 = j;
                        class47[n41] |= 0x40;
                        if ((TileMap.Class7[j - TileMap.Class1] & 0x1000) == 0x1000) {
                            final int[] class48 = TileMap.Class7;
                            final int n42 = j;
                            class48[n42] |= 0x1000;
                        }
                    }
                    if (TileMap.Class6[j] == '\"') {
                        final int[] class49 = TileMap.Class7;
                        final int n43 = j;
                        class49[n43] |= 0x800;
                    }
                    if (TileMap.Class6[j] == '\u0011') {
                        final int[] class50 = TileMap.Class7;
                        final int n44 = j;
                        class50[n44] |= 0x400;
                    }
                    if (TileMap.Class6[j] == '!' || TileMap.Class6[j] == 'g' || TileMap.Class6[j] == 'h' || TileMap.Class6[j] == 'i' || TileMap.Class6[j] == '\u001a' || TileMap.Class6[j] == '!') {
                        final int[] class51 = TileMap.Class7;
                        final int n45 = j;
                        class51[n45] |= 0x100;
                    }
                    if (TileMap.Class6[j] == '3' || TileMap.Class6[j] == 'o' || TileMap.Class6[j] == 'D') {
                        final int[] class52 = TileMap.Class7;
                        final int n46 = j;
                        class52[n46] |= 0x2000;
                    }
                    if (TileMap.Class6[j] == 'R' || TileMap.Class6[j] == 'n' || TileMap.Class6[j] == '\u008f') {
                        final int[] class53 = TileMap.Class7;
                        final int n47 = j;
                        class53[n47] |= 0x4000;
                    }
                    if (TileMap.Class6[j] == 'q') {
                        final int[] class54 = TileMap.Class7;
                        final int n48 = j;
                        class54[n48] |= 0x10000;
                    }
                    if (TileMap.Class6[j] == '\u008e') {
                        final int[] class55 = TileMap.Class7;
                        final int n49 = j;
                        class55[n49] |= 0x8000;
                    }
                    if (TileMap.Class6[j] == '(' || TileMap.Class6[j] == ')') {
                        final int[] class56 = TileMap.Class7;
                        final int n50 = j;
                        class56[n50] |= 0x20000;
                    }
                    if (TileMap.Class6[j] == 'n') {
                        final int[] class57 = TileMap.Class7;
                        final int n51 = j;
                        class57[n51] |= 0x40000;
                    }
                    if (TileMap.Class6[j] == '\u008f') {
                        final int[] class58 = TileMap.Class7;
                        final int n52 = j;
                        class58[n52] |= 0x80000;
                    }
                }
            }
            TileMap.Class8 = Image.createImage(TileMap.Class1 * TileMap.Class24 * mGraphics.Class2, TileMap.Class2 * TileMap.Class24 * mGraphics.Class2);
            final mGraphics mGraphics;
            (mGraphics = new mGraphics(TileMap.Class8.getGraphics())).setColor(0);
            mGraphics.fillRect(0, 0, TileMap.Class1 * TileMap.Class24, TileMap.Class2 * TileMap.Class24);
            int l;
            int n53;
            mGraphics mGraphics2;
            Image class59;
            int n54;
            int n55;
            int class60;
            for (i = 0; i < TileMap.Class1; ++i) {
                for (l = 0; l < TileMap.Class2; ++l) {
                    if ((n53 = TileMap.Class6[l * TileMap.Class1 + i] - '\u0001') != -1) {
                        mGraphics2 = mGraphics;
                        class59 = TileMap.Class32;
                        n54 = 0;
                        n55 = n53 * TileMap.Class24;
                        class60 = TileMap.Class24;
                        mGraphics2.Class1(class59, n54, n55, class60, class60, 0, i * TileMap.Class24, l * TileMap.Class24, 0);
                    }
                }
            }
            if (!GameCanvas.Class1) {
                if (TileMap.mapID == 0 || TileMap.mapID <= 4 || (TileMap.mapID >= 16 && TileMap.mapID <= 18) || (TileMap.mapID >= 24 && TileMap.mapID <= 27) || TileMap.mapID == 22 || TileMap.mapID == 33 || TileMap.mapID == 34 || TileMap.mapID == 38 || TileMap.mapID == 57 || TileMap.mapID == 58 || TileMap.mapID == 60 || TileMap.mapID == 68 || (TileMap.mapID >= 70 && TileMap.mapID <= 75) || TileMap.mapID == 81) {
                    Game21.Class4.addElement(new Game26((byte)1, 10));
                }
                if ((TileMap.mapID >= 39 && TileMap.mapID <= 44) || (TileMap.mapID >= 46 && TileMap.mapID <= 48) || TileMap.mapID == 56 || (TileMap.mapID >= 62 && TileMap.mapID <= 65)) {
                    Game21.Class4.addElement(new Game26((byte)3, Res.Class2(150, 200)));
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Error Load Map");
            ex.printStackTrace();
            final GameMidlet class61 = GameMidlet.Class6;
            GameCanvas.Class11 = false;
            System.gc();
            class61.notifyDestroyed();
        }
    }
    
    public static final void Class1(final mGraphics mGraphics) {
        if (!Code.mMap) {
            for (int i = GameScr.Class20; i < GameScr.Class22; ++i) {
                for (int j = GameScr.Class21; j < GameScr.Class23; ++j) {
                    int n = TileMap.Class6[j * TileMap.Class1 + i] - '\u0001';
                    if ((Class5(i, j) & 0x100) != 0x100) {
                        if (TileMap.Class5 == 4 && (Class5(i, j) & 0x40) == 0x40) {
                            if ((n = TileMap.Class6[(j - 1) * TileMap.Class1 + i] - '\u0001') == 15) {
                                mGraphics.Class1(TileMap.Class31, 0, 17 * TileMap.Class9, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                continue;
                            }
                            if (n == 5) {
                                mGraphics.Class1(TileMap.Class31, 0, 7 * TileMap.Class9, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                continue;
                            }
                            if (n == 18 || n == 22 || n == 15) {
                                mGraphics.Class1(TileMap.Class31, 0, 17 * TileMap.Class9, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                continue;
                            }
                            if (n == 44 || n == 52 || n == 51) {
                                mGraphics.Class1(TileMap.Class31, 0, 56 * TileMap.Class9, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                continue;
                            }
                            if (n == 24 || n == 23 || n == 20 || n == 21 || n == 19 || n == 12 || n == 13) {
                                continue;
                            }
                            if (n != -1) {
                                mGraphics.Class1(TileMap.Class31, 0, n * TileMap.Class9, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                            }
                            else if (n == -1) {
                                continue;
                            }
                        }
                        if (TileMap.Class5 == 1) {
                            if ((Class5(i, j) & 0x20) == 0x20) {
                                mGraphics.Class1(TileMap.Class33, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                continue;
                            }
                            if ((Class5(i, j) & 0x40) == 0x40 || (Class5(i, j) & 0x800) == 0x800) {
                                if ((Class5(i, j - 1) & 0x20) == 0x20) {
                                    mGraphics.Class1(TileMap.Class33, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                    continue;
                                }
                                if ((Class5(i, j - 1) & 0x1000) == 0x1000) {
                                    mGraphics.Class1(TileMap.Class31, 0, 504, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                    continue;
                                }
                            }
                        }
                        if (TileMap.Class5 == 2) {
                            if ((Class5(i, j) & 0x20) == 0x20) {
                                mGraphics.Class1(TileMap.Class33, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                continue;
                            }
                            if (n == 17) {
                                mGraphics.Class1(TileMap.Class34, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                continue;
                            }
                            if (n == 133) {
                                mGraphics.Class1(TileMap.Class31, 0, 132 * TileMap.Class9, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                continue;
                            }
                            if ((Class5(i, j) & 0x40) == 0x40 || (Class5(i, j) & 0x800) == 0x800) {
                                if ((Class5(i, j - 1) & 0x20) == 0x20) {
                                    mGraphics.Class1(TileMap.Class33, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                    continue;
                                }
                                if ((Class5(i, j - 1) & 0x1000) == 0x1000) {
                                    final int class4;
                                    int class5;
                                    if ((class4 = Class4(i, j - 1)) == 55) {
                                        class5 = 54;
                                    }
                                    else if (class4 == 19 || class4 == 35) {
                                        if ((class5 = Class4(i, j - 2)) == 55) {
                                            class5 = 54;
                                        }
                                        else if (class5 < 40) {
                                            class5 = 21;
                                        }
                                    }
                                    else if (class4 < 40) {
                                        class5 = 21;
                                    }
                                    else {
                                        class5 = 110;
                                    }
                                    mGraphics.Class1(TileMap.Class31, 0, class5 * 24, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                    continue;
                                }
                            }
                        }
                        if (TileMap.Class5 == 3) {
                            if ((Class5(i, j) & 0x20) == 0x20) {
                                mGraphics.Class1(TileMap.Class33, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                continue;
                            }
                            if (n == 23) {
                                mGraphics.Class1(TileMap.Class34, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                continue;
                            }
                            if ((Class5(i, j) & 0x40) == 0x40 || (Class5(i, j) & 0x800) == 0x800) {
                                if ((Class5(i, j - 1) & 0x20) == 0x20) {
                                    mGraphics.Class1(TileMap.Class33, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                    continue;
                                }
                                if ((Class5(i, j - 1) & 0x1000) == 0x1000) {
                                    int n2;
                                    if ((n2 = Class4(i, j - 1)) == 25) {
                                        n2 = Class4(i, j - 2);
                                    }
                                    if (n2 == 45) {
                                        n2 = 44;
                                    }
                                    --n2;
                                    mGraphics.Class1(TileMap.Class31, 0, n2 * 24, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                    continue;
                                }
                            }
                        }
                        if ((Class5(i, j) & 0x10) == 0x10) {
                            TileMap.Class39 = i * TileMap.Class9 - GameScr.Class16 - GameScr.Class11;
                            TileMap.Class40 = (TileMap.Class9 - 2) * TileMap.Class39 / TileMap.Class9 + GameScr.Class11;
                            mGraphics.Class1(TileMap.Class31, 0, n * TileMap.Class9, 24, 24, 0, TileMap.Class40 + GameScr.Class16, j * TileMap.Class9, 0);
                        }
                        else if ((Class5(i, j) & 0x200) == 0x200) {
                            if (n != -1) {
                                mGraphics.Class1(TileMap.Class31, 0, n * TileMap.Class9, 24, 1, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                                mGraphics.Class1(TileMap.Class31, 0, n * TileMap.Class9, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9 + 1, 0);
                            }
                        }
                        else if (n != -1) {
                            mGraphics.Class1(TileMap.Class31, 0, n * TileMap.Class9, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                        }
                    }
                }
            }
        }
    }
    
    public static final void Class2(final mGraphics mGraphics) {
        if (!Code.mMap) {
            if (GameCanvas.Class25 <= 176) {
                return;
            }
            Res.Class1(mGraphics);
            mGraphics.Class1(TileMap.Class18 + 1, TileMap.Class19 + 2);
            int cmxMini = Char.getMyChar().cx / 12;
            int cmyMini = Char.getMyChar().cy / 12;
            mGraphics.setColor(0);
            mGraphics.fillRect(-2, -2, TileMap.wMiniMap + 2, TileMap.hMiniMap);
            mGraphics.Class4(-2, -2, TileMap.wMiniMap + 4, TileMap.hMiniMap + 4);
            for (int i = 0; i < 2; ++i) {
                mGraphics.setColor(TileMap.Class51[i]);
                mGraphics.Class2(i - 2, i - 2, TileMap.wMiniMap + 2 - (i << 1), TileMap.hMiniMap - (i << 1));
            }
            mGraphics.Class4(0, 0, TileMap.wMiniMap - 2, TileMap.hMiniMap - 3);
            if (mGraphics.Class1(TileMap.Class8) > TileMap.wMiniMap || mGraphics.Class2(TileMap.Class8) > TileMap.hMiniMap) {
                mGraphics.Class1(-TileMap.cmxMini, -TileMap.cmyMini);
            }
            mGraphics.Class1(TileMap.Class8, 0, 0, 0);
            for (int j = 0; j < Auto.AddMob.size(); ++j) {
                final Mob mob;
                cmxMini = (mob = (Mob)Auto.AddMob.elementAt(j)).x / 12;
                cmyMini = mob.y / 12;
                if (cmxMini < TileMap.cmxMini) {
                    cmxMini = TileMap.cmxMini;
                }
                if (cmyMini < TileMap.cmyMini) {
                    cmyMini = TileMap.cmyMini;
                }
                if (cmxMini > TileMap.cmxMini + TileMap.wMiniMap) {
                    cmxMini = TileMap.cmxMini + TileMap.wMiniMap;
                }
                if (cmyMini > TileMap.cmyMini + TileMap.hMiniMap) {
                    cmyMini = TileMap.cmyMini + TileMap.hMiniMap;
                }
                if (GameCanvas.gameTick % 10 < 8) {
                    mGraphics.setColor(16777215);
                    mGraphics.fillRect(cmxMini - 2, cmyMini - 2, 5, 5);
                    mGraphics.setColor((mob.levelBoss == 1) ? 255 : ((mob.levelBoss == 2) ? 16711935 : 65535));
                    mGraphics.fillRect(cmxMini - 1, cmyMini - 1, 3, 3);
                }
            }
            mGraphics.setColor(16777215);
            mGraphics.fillRect(cmxMini - 2, cmyMini - 2, 5, 5);
            mGraphics.setColor(16711680);
            mGraphics.fillRect(cmxMini - 1, cmyMini - 1, 3, 3);
            if (Code.BatTatDanhChuyenVitri) {
                for (int k = 0; k < Code.avtx.size(); ++k) {
                    final int n = (int)Code.avtx.elementAt(k) / 12;
                    final int n2 = (int)Code.avty.elementAt(k) / 12;
                    if (Code.intavt == k) {
                        mGraphics.setColor(16777215);
                        mGraphics.fillRect(n - 2, n2 - 2, 5, 5);
                    }
                    mGraphics.setColor(16777215);
                    mGraphics.fillRect(n - 1, n2 - 1, 3, 3);
                }
            }
            for (int l = 0; l < GameScr.vParty.size(); ++l) {
                final Party party;
                if ((party = (Party)GameScr.vParty.elementAt(l)).c != null && party.c != Char.getMyChar()) {
                    int cmxMini2 = party.c.cx / 12;
                    int cmyMini2 = party.c.cy / 12;
                    if (cmxMini2 < TileMap.cmxMini) {
                        cmxMini2 = TileMap.cmxMini;
                    }
                    if (cmyMini2 < TileMap.cmyMini) {
                        cmyMini2 = TileMap.cmyMini;
                    }
                    if (cmxMini2 > TileMap.cmxMini + TileMap.wMiniMap) {
                        cmxMini2 = TileMap.cmxMini + TileMap.wMiniMap;
                    }
                    if (cmyMini2 > TileMap.cmyMini + TileMap.hMiniMap) {
                        cmyMini2 = TileMap.cmyMini + TileMap.hMiniMap;
                    }
                    if (GameCanvas.gameTick % 10 < 8) {
                        mGraphics.setColor(16777215);
                        mGraphics.fillRect(cmxMini2 - 2, cmyMini2 - 2, 5, 5);
                        mGraphics.setColor(65280);
                        mGraphics.fillRect(cmxMini2 - 1, cmyMini2 - 1, 3, 3);
                    }
                }
            }
            Res.Class1(mGraphics);
            if (GameCanvas.Class6) {
                mGraphics.Class1(GameScr.Class127, TileMap.Class18 - 1, TileMap.Class19, 0);
            }
        }
    }
    
    public static final void Class3(final mGraphics mGraphics) {
        if (!Code.mMap) {
            if (GameCanvas.Class1) {
                return;
            }
            for (int i = GameScr.Class20; i < GameScr.Class22; ++i) {
                for (int j = GameScr.Class21; j < GameScr.Class23; ++j) {
                    Image image;
                    if (TileMap.Class5 == 4) {
                        image = TileMap.Class37;
                    }
                    else {
                        image = TileMap.Class35;
                    }
                    if ((Class5(i, j) & 0x800) == 0x800) {
                        mGraphics.Class1(TileMap.Class36, i, j, 0);
                    }
                    if ((Class5(i, j) & 0x40) == 0x40) {
                        mGraphics.Class1(image, 0, (GameCanvas.gameTick % 8 >> 2) * 24, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                    }
                    if ((Class5(i, j) & 0x100) == 0x100) {
                        mGraphics.Class1(TileMap.Class31, 0, (TileMap.Class6[j * TileMap.Class1 + i] - '\u0001') * TileMap.Class9, 24, 24, 0, i * TileMap.Class9, j * TileMap.Class9, 0);
                    }
                }
            }
            if (TileMap.Class5 != 4 && GameCanvas.Class6 && GameCanvas.Class7 && GameScr.Class23 >= TileMap.Class2 - 2) {
                for (int k = GameScr.Class20; k < GameScr.Class22; ++k) {
                    final int n = TileMap.Class2 - 2;
                    int class50 = TileMap.Class6[n * TileMap.Class1 + k] - '\u0001';
                    if ((Class5(k, n) & 0x20) == 0x20) {
                        for (int l = 1; l <= 4; ++l) {
                            mGraphics.Class1(TileMap.Class33, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, k * TileMap.Class9, (n + l) * TileMap.Class9, 0);
                        }
                    }
                    else {
                        if (TileMap.mapID == 64) {
                            TileMap.Class50 = 115;
                        }
                        if ((Class5(k, n) & 0x2) == 0x2 || (Class5(k, n) & 0x40) == 0x40) {
                            class50 = TileMap.Class50;
                        }
                        if (class50 >= 0) {
                            for (int n2 = 1; n2 <= 4; ++n2) {
                                mGraphics.Class1(TileMap.Class31, 0, class50 * TileMap.Class9, 24, 24, 0, k * TileMap.Class9, (n + n2) * TileMap.Class9, 0);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private static int Class4(final int n, final int n2) {
        try {
            return TileMap.Class6[n2 * TileMap.Class1 + n];
        }
        catch (Exception ex) {
            return 1000;
        }
    }
    
    private static int Class5(final int n, final int n2) {
        try {
            return TileMap.Class7[n2 * TileMap.Class1 + n];
        }
        catch (Exception ex) {
            return 1000;
        }
    }
    
    public static final int tileTypeAtPixel(final int n, final int n2) {
        try {
            return TileMap.Class7[n2 / TileMap.Class9 * TileMap.Class1 + n / TileMap.Class9];
        }
        catch (Exception ex) {
            return 1000;
        }
    }
    
    public static final boolean tileTypeAt(final int n, final int n2, final int n3) {
        try {
            return (TileMap.Class7[n2 / TileMap.Class9 * TileMap.Class1 + n / TileMap.Class9] & n3) == n3;
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    public static final void Class2(final int n, final int n2) {
        final int[] class7 = TileMap.Class7;
        final int n3 = n2 / TileMap.Class9 * TileMap.Class1 + n / TileMap.Class9;
        class7[n3] |= 0x200;
    }
    
    public static final void Class3(final int n, final int n2) {
        final int[] class7 = TileMap.Class7;
        final int n3 = n2 / TileMap.Class9 * TileMap.Class1 + n / TileMap.Class9;
        class7[n3] &= 0xFFFFFDFF;
    }
    
    public static final int tileYofPixel(final int n) {
        return n / TileMap.Class9 * TileMap.Class9;
    }
    
    public static final int Class3(final int n) {
        return n / TileMap.Class9 * TileMap.Class9;
    }
    
    public static void Class5() {
        final DataInputStream dataInputStream;
        TileMap.Class1 = (char)(dataInputStream = new DataInputStream("".getClass().getResourceAsStream("/map/" + TileMap.mapID))).read();
        TileMap.Class2 = (char)dataInputStream.read();
        TileMap.Class6 = new char[dataInputStream.available()];
        for (int i = 0; i < TileMap.Class1 * TileMap.Class2; ++i) {
            TileMap.Class6[i] = (char)dataInputStream.read();
        }
        TileMap.Class7 = new int[TileMap.Class6.length];
    }
    
    public static void Class6() {
        TileMap.Class31 = null;
        System.gc();
        TileMap.Class31 = GameCanvas.Class3("/t/" + TileMap.Class5 + ".png");
        TileMap.Class32 = GameCanvas.Class3("/t/mini_" + TileMap.Class5 + ".png");
    }
    
    public static int pMove(final int n, int tileYofPixel) {
        if ((tileTypeAtPixel(n, tileYofPixel - 16) & 0x4002) != 0x0) {
            tileYofPixel = tileYofPixel(tileYofPixel);
            for (int i = 24; i < 240; i += 24) {
                final int tileTypeAtPixel = tileTypeAtPixel(n, tileYofPixel - i);
                if (tileYofPixel - i > 0 && (tileTypeAtPixel & 0x4002) == 0x0) {
                    return tileYofPixel - i + 24;
                }
            }
            for (int j = 24; j < 120; j += 24) {
                final int tileTypeAtPixel2 = tileTypeAtPixel(n, tileYofPixel + j);
                if (tileYofPixel + j < TileMap.pxh && (tileTypeAtPixel2 & 0x4002) == 0x0) {
                    return tileYofPixel + j;
                }
            }
        }
        return tileYofPixel;
    }
    
    public static boolean typePk(final int n) {
        return n >= 134 && n <= 138;
    }
    
    public static void LockMap() {
        TileMap.isLockMap = true;
        synchronized (TileMap.objLockMap) {
            try {
                TileMap.objLockMap.wait(10000L);
            }
            catch (InterruptedException ex) {}
        }
        // monitorexit(TileMap.objLockMap)
    }
    
    public static void HuyLockMap() {
        if (TileMap.isLockMap) {
            TileMap.isLockMap = false;
            synchronized (TileMap.objLockMap) {
                TileMap.objLockMap.notifyAll();
            }
            // monitorexit(TileMap.objLockMap)
        }
    }
    
    public static boolean isTruong(final int n) {
        return n == 1 || n == 27 || n == 72;
    }
    
    public static boolean isLang(final int n) {
        return n == 10 || n == 17 || n == 22 || n == 32 || n == 38 || n == 43 || n == 48 || n == 138;
    }
    
    public static void NextMap(final int index) {
        final InfoDlg infoDlg;
        int minX = (infoDlg = TileMap.vGo.elementAt(index)).minX;
        int n = infoDlg.minY;
        if (infoDlg.minY != 0 && infoDlg.maxY < TileMap.pxh - 24) {
            if (infoDlg.maxX <= TileMap.pxw / 2) {
                minX = infoDlg.maxX + 12;
                n = infoDlg.maxY;
            }
            else if (infoDlg.minX >= TileMap.pxw / 2) {
                minX = infoDlg.minX - 12;
                n = infoDlg.maxY;
            }
        }
        else if (infoDlg.maxY <= TileMap.pxh / 2) {
            minX = (infoDlg.maxX + infoDlg.minX) / 2;
            n = infoDlg.maxY + 24;
        }
        else if (infoDlg.minY >= TileMap.pxh / 2) {
            minX = (infoDlg.maxX + infoDlg.minX) / 2 + 24;
            n = infoDlg.maxY - 48;
        }
        if (TileMap.mapID == 114 || TileMap.mapID == 115 || TileMap.mapID == 116) {
            Char.FixMove(minX, n);
        }
        else {
            Char.Move(minX, n);
        }
        Thread.sleep(10L);
        Service.gI().requestChangeMap();
    }
    
    public static boolean GoMap(final int n) {
        final short mapID = TileMap.mapID;
        TileMap.MapMod = n;
        final short n2 = mapID;
        MyVector myVector2 = null;
        MyVector myVector = null;
        Label_1369: {
            if (mapID < 0 || n2 >= TileMap.at2Short.length || n < 0 || n >= TileMap.at2Short.length) {
                myVector = (myVector2 = null);
            }
            else if (TileMap.at2Short[n2].length <= 0) {
                myVector = (myVector2 = null);
            }
            else {
                final TaskOrder findTask = Char.FindTask(0);
                for (int i = 0; i < TileMap.atBool.length; ++i) {
                    TileMap.atBool[i] = true;
                    TileMap.atInt[i] = -1;
                    TileMap.atShort[i] = -1;
                }
                TileMap.atInt[n2] = 0;
                while (TileMap.atBool[n]) {
                    int n3 = -1;
                    short n4 = -1;
                    for (int j = 0; j < TileMap.at2Short.length; ++j) {
                        if (TileMap.atBool[j] && TileMap.atInt[j] != -1 && (TileMap.atInt[j] < n3 || n3 == -1)) {
                            n3 = TileMap.atInt[j];
                            n4 = (short)j;
                        }
                    }
                    if (n4 == -1) {
                        myVector = (myVector2 = null);
                        break Label_1369;
                    }
                    TileMap.atBool[n4] = false;
                    final boolean truong = isTruong(n4);
                    final short[] array = TileMap.at2Short[n4];
                    for (int k = 0; k < array.length; ++k) {
                        final short n5 = array[k];
                        if (TileMap.atBool[n5]) {
                            final short n6 = n5;
                            boolean b = false;
                            Label_0383: {
                                if (Char.getMyChar().isHuman) {
                                    final int ctaskId = Char.getMyChar().ctaskId;
                                    if ((n6 == 1 || n6 == 27 || n6 == 72) && ctaskId < 6) {
                                        b = false;
                                        break Label_0383;
                                    }
                                    if ((n6 == 10 || n6 == 32 || n6 == 48) && ctaskId < 17) {
                                        b = false;
                                        break Label_0383;
                                    }
                                    if (n6 == 38 && ctaskId < 28) {
                                        b = false;
                                        break Label_0383;
                                    }
                                    if (n6 == 43 && ctaskId < 33) {
                                        b = false;
                                        break Label_0383;
                                    }
                                    if (n6 == 17 && ctaskId < 38) {
                                        b = false;
                                        break Label_0383;
                                    }
                                    if (n6 == 7 && ctaskId < 15) {
                                        b = false;
                                        break Label_0383;
                                    }
                                }
                                b = true;
                            }
                            if (b && (!truong || !isTruong(n5) || Char.getMyChar().ctaskId >= 9) && (TileMap.atInt[n5] == -1 || TileMap.atInt[n5] > TileMap.atInt[n4] + 1)) {
                                final short n7 = n5;
                                final int[] atInt = TileMap.atInt;
                                atInt[n7] = atInt[n4] + 1;
                                TileMap.atShort[n5] = n4;
                            }
                        }
                    }
                    if (truong && findTask != null && TileMap.atBool[findTask.mapId] && (TileMap.atInt[findTask.mapId] == -1 || TileMap.atInt[findTask.mapId] > TileMap.atInt[n4] + 1)) {
                        TileMap.atInt[findTask.mapId] = TileMap.atInt[n4] + 1;
                        TileMap.atShort[findTask.mapId] = n4;
                    }
                    if (truong) {
                        final short n8 = (short)(GameScr.cj ? 98 : 104);
                        if (TileMap.atInt[n8] == -1 || TileMap.atInt[n8] > TileMap.atInt[n4] + 1) {
                            final short n9 = n8;
                            final int[] atInt2 = TileMap.atInt;
                            atInt2[n9] = atInt2[n4] + 1;
                            TileMap.atShort[n8] = n4;
                        }
                    }
                    if (!Char.DungCoLenh || (TileMap.atInt[138] != -1 && TileMap.atInt[138] <= TileMap.atInt[n4] + 1)) {
                        continue;
                    }
                    TileMap.atInt[138] = TileMap.atInt[n4] + 1;
                    TileMap.atShort[138] = n4;
                }
                final MyVector myVector3;
                (myVector3 = new MyVector()).addElement(n);
                for (int l = n; l != n2; l = TileMap.atShort[l]) {
                    int m;
                    if (isLang(m = TileMap.atShort[l])) {
                        if (isLang(l) && l != 138) {
                            int n10 = 1;
                            if (l == 10) {
                                n10 = 1;
                            }
                            else if (l == 17) {
                                n10 = 2;
                            }
                            else if (l == 22) {
                                n10 = 3;
                            }
                            else if (l == 32) {
                                n10 = 4;
                            }
                            else if (l == 38) {
                                n10 = 5;
                            }
                            else if (l == 43) {
                                n10 = 6;
                            }
                            else if (l == 48) {
                                n10 = 7;
                            }
                            m = (m | Integer.MIN_VALUE | 0x7000000 | (n10 << 20 & 0xF00000));
                        }
                        else if (l == 139) {
                            m = (m | Integer.MIN_VALUE | 0x5000000 | 0x200000);
                        }
                    }
                    else if (isTruong(m)) {
                        if (isTruong(l)) {
                            int n11 = 0;
                            if (l == 1) {
                                n11 = 0;
                            }
                            else if (l == 27) {
                                n11 = 1;
                            }
                            else if (l == 72) {
                                n11 = 2;
                            }
                            m = (m | Integer.MIN_VALUE | 0x8000000 | (n11 << 20 & 0xF00000));
                        }
                        else if (findTask != null && l == findTask.mapId) {
                            m = (m | Integer.MIN_VALUE | 0x19000000 | (GameScr.ci << 20 & 0xF00000) | 0x30000);
                        }
                        else {
                            switch (l) {
                                case 80: {
                                    m = (m | Integer.MIN_VALUE | 0x100000 | 0x10000);
                                    break;
                                }
                                case 91: {
                                    m = (m | Integer.MIN_VALUE | 0x200000 | 0x10000);
                                    break;
                                }
                                case 94: {
                                    m = (m | Integer.MIN_VALUE | 0x200000 | 0x20000);
                                    break;
                                }
                                case 98: {
                                    m = (m | Integer.MIN_VALUE | 0x19000000 | (GameScr.ci + 2 << 20 & 0xF00000));
                                    break;
                                }
                                case 104: {
                                    m = (m | Integer.MIN_VALUE | 0x19000000 | (GameScr.ci + 2 << 20 & 0xF00000) | 0x10000);
                                    break;
                                }
                                case 105: {
                                    m = (m | Integer.MIN_VALUE | 0x200000 | 0x30000);
                                    break;
                                }
                                case 113: {
                                    m = (m | Integer.MIN_VALUE | 0x19000000 | (GameScr.ci + 3 << 20 & 0xF00000));
                                    break;
                                }
                                case 114: {
                                    m = (m | Integer.MIN_VALUE | 0x200000 | 0x40000);
                                    break;
                                }
                                case 125: {
                                    m = (m | Integer.MIN_VALUE | 0x200000 | 0x50000);
                                    break;
                                }
                                case 139: {
                                    m = (m | Integer.MIN_VALUE | 0x5000000 | 0x200000);
                                    break;
                                }
                                case 157: {
                                    m = (m | Integer.MIN_VALUE | 0x200000 | 0x60000);
                                    break;
                                }
                            }
                        }
                    }
                    myVector3.addElement(m);
                }
                final MyVector myVector4 = new MyVector();
                for (int n12 = myVector3.size() - 1; n12 >= 0; --n12) {
                    myVector4.addElement(myVector3.elementAt(n12));
                }
                myVector = (myVector2 = myVector4);
            }
        }
        final MyVector myVector5 = myVector2;
        if (myVector == null) {
            InfoMe.addInfo("Kh\u00f4ng th\u1ec3 chuy\u1ec3n map!", 50, mFont.number_red);
            return false;
        }
        TileMap.IsDangGoMap = true;
        Label_1839: {
            try {
                int mapID2 = TileMap.mapID;
                Block_78: {
                    Label_1548: {
                        Block_69: {
                            for (int n13 = 1; n13 < myVector5.size() && TileMap.IsDangGoMap; ++n13) {
                                if (mapID2 != TileMap.mapID) {
                                    break;
                                }
                                final int intValue = (int)myVector5.elementAt(n13 - 1);
                                mapID2 = ((int)myVector5.elementAt(n13) & 0xFFFF);
                                if (intValue < 0) {
                                    GameScr.PickNpca(intValue >> 24 & 0x7F, intValue >> 20 & 0xF, intValue >> 16 & 0xF);
                                }
                                else if ((intValue < 134 || intValue > 138) && mapID2 == 138) {
                                    if (Char.getMyChar().cPk > 0) {
                                        break Block_69;
                                    }
                                    final Item kiemTraiditem21;
                                    if ((kiemTraiditem21 = Char.KiemTraiditem21(490)) == null || kiemTraiditem21.template.id != 490) {
                                        break Label_1548;
                                    }
                                    System.out.println("Dung co lenh");
                                    Service.gI().useItem(kiemTraiditem21.indexUI);
                                }
                                else if (intValue == 0 || intValue == 56 || intValue == 73) {
                                    final Npc npcFocus;
                                    if ((npcFocus = (Npc)GameScr.vNpc.elementAt(0)) != null && npcFocus.statusMe != 15) {
                                        Char.Move(npcFocus.cx, npcFocus.cy);
                                        Char.getMyChar().npcFocus = npcFocus;
                                        Service.gI().requestItem(npcFocus.template.npcTemplateId);
                                        Service.gI().menu((byte)0, npcFocus.template.npcTemplateId, 0, 0);
                                        Service.gI().getTask(npcFocus.template.npcTemplateId, 0);
                                    }
                                }
                                else {
                                    int n14 = -1;
                                    for (int n15 = 0; n15 < TileMap.at2Short[intValue].length; ++n15) {
                                        if (TileMap.at2Short[intValue][n15] == mapID2) {
                                            n14 = n15;
                                            break;
                                        }
                                    }
                                    if (n14 == -1) {
                                        break Block_78;
                                    }
                                    NextMap(n14);
                                }
                                if (TileMap.mapID != mapID2) {
                                    LockMap();
                                }
                                Thread.sleep(100L);
                            }
                            break Label_1839;
                        }
                        InfoMe.addInfo("Hi\u1ebfu chi\u1ebfn qu\u00e1 cao!", 50, mFont.number_red);
                        return false;
                    }
                    if (Char.MuaCoLenh && Char.getMyChar().luong >= 10) {
                        Service.gI().buyItem(14, 29, 2);
                        LockGame.LOCKBUYITEM();
                        return false;
                    }
                    InfoMe.addInfo("Kh\u00f4ng \u0111\u1ee7 c\u1ed5 l\u1ec7nh!", 50, mFont.Class10);
                    return false;
                }
                InfoMe.addInfo("Kh\u00f4ng th\u1ec3 chuy\u1ec3n map!", 50, mFont.Class10);
                return false;
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return false;
            }
        }
        TileMap.IsDangGoMap = false;
        return TileMap.mapID == n;
    }
    
    public static boolean pMove2(final int n, int tileYofPixel, final int[] array) {
        tileYofPixel = tileYofPixel(tileYofPixel);
        if (tileTypeAt(n, tileYofPixel, 2)) {
            array[0] = n;
            array[1] = tileYofPixel;
            return true;
        }
        for (int i = 0; i < 5; ++i) {
            final int n2 = tileYofPixel + i * 24;
            for (int j = 0; j < 5; ++j) {
                final int n3 = n - 48 + j * 24;
                if (n2 < TileMap.pxh && n3 > 24 && n3 < TileMap.pxw - 24 && tileTypeAt(n3, n2, 2)) {
                    array[0] = n3;
                    array[1] = n2;
                    return true;
                }
            }
        }
        return false;
    }
    
    public static int GoVaoCharA(final int n, int tileYofPixel) {
        tileYofPixel = tileYofPixel(tileYofPixel);
        if (!tileTypeAt(n, tileYofPixel, 2)) {
            for (int i = 0; i < 7; ++i) {
                final int n2;
                if ((n2 = tileYofPixel - 48 + i * 24) > 0 && n2 < TileMap.pxh && tileTypeAt(n, n2, 2)) {
                    return n2;
                }
            }
        }
        return tileYofPixel;
    }
    
    public static boolean Game7hend(final int n) {
        return n == 91 || n == 92 || n == 93 || n == 94 || n == 95 || n == 96 || n == 97 || n == 105 || n == 106 || n == 107 || n == 108 || n == 109 || n == 114 || n == 115 || n == 116 || n == 125 || n == 126 || n == 127 || n == 128 || n == 157 || n == 158 || n == 159;
    }
    
    public static int VitriHaDong(final int n) {
        if (Game7hend(n)) {
            switch (n) {
                case 91: {
                    return 92;
                }
                case 92: {
                    return 93;
                }
                case 94: {
                    return 95;
                }
                case 95: {
                    return 96;
                }
                case 96: {
                    return 97;
                }
                case 105: {
                    return 106;
                }
                case 106: {
                    return 107;
                }
                case 107: {
                    return 108;
                }
                case 108: {
                    return 109;
                }
                case 114: {
                    return 115;
                }
                case 115: {
                    return 116;
                }
                case 125: {
                    return 126;
                }
                case 126: {
                    return 127;
                }
                case 127: {
                    return 128;
                }
                case 157: {
                    return 158;
                }
                case 158: {
                    return 159;
                }
                case 159: {
                    return 157;
                }
            }
        }
        return -1;
    }
    
    public static void Game5sw() {
        if (TileMap.Game16666 != TileMap.mapID) {
            switch (TileMap.mapID) {
                case 1: {}
                case 10: {}
                case 17: {}
                case 22: {}
                case 27: {}
                case 32: {}
                case 38: {}
                case 43: {}
                case 48: {}
                case 72: {}
            }
        }
    }
    
    public static int Game9ad(final int n) {
        if (Game7hend(n)) {
            switch (n) {
                case 92: {
                    return 91;
                }
                case 93: {
                    return 92;
                }
                case 95: {
                    return 94;
                }
                case 96: {
                    return 95;
                }
                case 97: {
                    return 96;
                }
                case 106: {
                    return 105;
                }
                case 107: {
                    return 106;
                }
                case 108: {
                    return 107;
                }
                case 109: {
                    return 108;
                }
                case 115: {
                    return 114;
                }
                case 116: {
                    return 115;
                }
                case 126: {
                    return 125;
                }
                case 127: {
                    return 126;
                }
                case 128: {
                    return 127;
                }
                case 158: {
                    return 157;
                }
                case 159: {
                    return 158;
                }
            }
        }
        return -1;
    }
    
    public static void NM(final int next) {
        GameCanvas.startWaitDlgWithoutCancel();
        new Thread(new NM(next)).start();
    }
    
    public static void GM(final int game1) {
        GameCanvas.startWaitDlgWithoutCancel();
        new Thread(new GM(game1)).start();
    }
}
