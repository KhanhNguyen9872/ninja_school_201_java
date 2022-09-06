import javax.microedition.io.ConnectionNotFoundException;
import main.GameMidlet;
import java.util.Vector;
import java.io.IOException;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import main.GameCanvas;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class GameScr extends mScreen implements IActionListener
{
    public static GameScr Class8;
    public static int Class9;
    public static int Class10;
    public static int Class11;
    private static int Class170;
    private static int Class171;
    public static int Class12;
    public static int Class13;
    private static int Class172;
    public static int Class14;
    public static int Class15;
    public static int Class16;
    public static int Class17;
    private static int Class173;
    private static int Class174;
    private static int Class175;
    private static int Class176;
    public static int Class18;
    public static int Class19;
    private static int Class177;
    private static int Class178;
    public static int Class20;
    public static int Class21;
    public static int Class22;
    public static int Class23;
    private Command Class179;
    private Command Class180;
    private Command Class181;
    private Command Class182;
    private Command Class183;
    private Command Class184;
    private Command Class185;
    private Command Class186;
    public static int Class24;
    public static int Class25;
    public static SkillPaint[] sks;
    public static Game51[] Class27;
    public static Game99[] Class28;
    public static Game106[] efs;
    private int Class187;
    private boolean Class188;
    public static MyVector Class30;
    public static MyVector Class31;
    public static MyVector vParty;
    public static MyVector Class33;
    public static MyVector Class34;
    public static MyVector Class35;
    public static MyVector Class36;
    public static MyVector Class37;
    public static MyVector vCharInMap;
    public static MyVector vItemMap;
    private static MyVector Class189;
    private static MyVector Class190;
    public static MyVector vMob;
    public static MyVector vNpc;
    public static MyVector Class42;
    private static MyVector Class191;
    public static NClass[] Class43;
    private static int Class192;
    private static int Class193;
    public static int indexSelect;
    public static int indexRow;
    private static int Class194;
    public static int indexMenu;
    public static int Class47;
    private Item Class195;
    public static ItemOptionTemplate[] Class48;
    public static Game67[] Class49;
    private static Game50 Class196;
    public static Game50 Class50;
    public static Item[] Class51;
    public static Item[] Class52;
    public static Item[] Class53;
    public static Item[] Class54;
    public static Item[] Class55;
    public static Item[] Class56;
    public static Item[] Class57;
    public static Item[] Class58;
    public static Item[] Class59;
    public static Item[] Class60;
    public static Item[] Class61;
    public static Item[] Class62;
    public static Item[] Class63;
    public static Item[] Class64;
    public static Item[] Class65;
    public static Item[] Class66;
    public static Item[] Class67;
    public static Item[] Class68;
    public static Item[] Class69;
    public static Item[] Class70;
    public static Item[] Class71;
    public static Item[] Class72;
    public static Item[] Class73;
    public static Item[] Class74;
    public static Item[] Class75;
    public static Item[] Class76;
    public static Item[] Class77;
    public static Item[] arrItemTradeMe;
    public static Item[] arrItemTradeOrder;
    public static Item[] Class80;
    public static Game48[] Class81;
    public static short[] Class82;
    public int Class83;
    public static Item Class84;
    public static Item Class85;
    public static Item Class86;
    private static boolean Class197;
    private static boolean Class198;
    private static boolean Class199;
    private static boolean Class200;
    public static boolean Class87;
    private static boolean Class201;
    public static boolean Class88;
    private static boolean Class202;
    public static boolean Class89;
    public static boolean isPaintAlert;
    private static boolean Class203;
    private static boolean Class204;
    private static boolean Class205;
    public static boolean Class91;
    private static boolean Class206;
    private static boolean Class207;
    public static boolean Class92;
    private static boolean Class208;
    public static boolean Class93;
    private static boolean Class209;
    private static boolean Class210;
    private static boolean Class211;
    private static boolean Class212;
    private static boolean Class213;
    private static boolean Class214;
    private static boolean Class215;
    private static boolean Class216;
    private static boolean Class217;
    private static boolean Class218;
    private static boolean Class219;
    private static boolean Class220;
    private static boolean Class221;
    private static boolean Class222;
    private static boolean Class223;
    private static boolean Class224;
    private static boolean Class225;
    private static boolean Class226;
    private static boolean Class227;
    private static boolean Class228;
    private static boolean Class229;
    private static boolean Class230;
    private static boolean Class231;
    private static boolean Class232;
    private static boolean Class233;
    private static boolean Class234;
    private static boolean Class235;
    private static boolean Class236;
    public static boolean isPaintTrade;
    private static boolean isPaintZone;
    public static boolean TuDong;
    public static boolean Class96;
    private static boolean Class238;
    private static boolean Class239;
    private static boolean Class240;
    private static boolean Class241;
    private static boolean Class242;
    private static boolean Class243;
    private static boolean Class244;
    private static boolean Class245;
    private static boolean Class246;
    private static boolean Class247;
    private static boolean Class248;
    private static boolean Class249;
    private static boolean Class250;
    public static Char Class97;
    public static long[] Class98;
    public static int[] Class99;
    public static int[] Class100;
    public static int[] Class101;
    public static int[] Class102;
    public static int[] Class103;
    public static int[] Class104;
    public static int[] Class105;
    public static int[] Class106;
    public static int[] Class107;
    public static int[] Class108;
    private static int[] Class251;
    private int Class252;
    public int[] zones;
    private int[] Class254;
    public int typeTrade;
    public int typeTradeOrder;
    public int coinTrade;
    public int coinTradeOrder;
    public int Class113;
    private int Class255;
    private int Class256;
    private int Class257;
    private int Class258;
    public int Class114;
    public int Class115;
    private boolean isLockKey;
    public static byte[][] Class116;
    public static byte[][] Class117;
    private MyVector texts;
    private String textsTitle;
    private TField Class262;
    public static byte Class118;
    public static byte Class119;
    public static byte Class120;
    public static byte Class121;
    public static byte Class122;
    public static byte Class123;
    public static byte Class124;
    public static byte Class125;
    private static Image Class263;
    private static Image Class264;
    private static Image Class265;
    private static Image Class266;
    private static Image Class267;
    private static Image Class268;
    private static Image Class269;
    private static Image Class270;
    private static Image Class271;
    private static Image Class272;
    private static Image Class273;
    private static Image Class274;
    private static Image Class275;
    private static Image Class276;
    public static Image Class126;
    public static Image Class127;
    public static Image Class128;
    public static Image Class129;
    private static Image Class277;
    public static Image Class130;
    public static Image Class131;
    public String Class132;
    public String Class133;
    public int Class134;
    public int Class135;
    private static byte Class278;
    public static byte Class136;
    private int[] Class279;
    private int[] Class280;
    private int[] Class281;
    private int[] Class282;
    public long Class137;
    public String[] Class138;
    public int Class139;
    public int Class140;
    public String[] Class141;
    public static MyVector Class142;
    public static MyVector Class143;
    public static MyVector Class144;
    private static Image Class283;
    public static Image Class145;
    public static Image Class146;
    public static Image Class147;
    public static Image Class148;
    public static Image Class149;
    public static boolean Class150;
    public static boolean Class151;
    private static Skill[] Class284;
    private static Skill[] Class285;
    private Command Class286;
    private Command Class287;
    private Command Class288;
    private Command Class289;
    private Command Class290;
    private Command Class291;
    private static byte Class292;
    static int Class152;
    static int Class153;
    private long Class293;
    public static int Class154;
    public boolean Class155;
    private int Class294;
    private int Class295;
    private long Class296;
    private int Class297;
    private static int Class298;
    private static int Class299;
    private static int Class300;
    private static int Class301;
    private static int Class302;
    private static int Class303;
    private static int Class304;
    private static int Class305;
    private static int Class306;
    private static int Class307;
    private static int Class308;
    private static int Class309;
    private static int Class310;
    private static int Class311;
    private static int Class312;
    private static int Class313;
    private static int Class314;
    private static int[] xS;
    private static int[] yS;
    private static int xSkill;
    private static int Class318;
    private static int Class319;
    private static String[] Class320;
    private static int[] Class321;
    private static int[] Class322;
    private static int[] Class323;
    private static int[] Class324;
    private static int[] Class325;
    private static int[] Class326;
    private static int[] Class327;
    private static int[] Class328;
    private static int[] Class329;
    private static int[] Class330;
    private static int[] Class331;
    private static Image[] Class332;
    private static int Class333;
    private static int Class334;
    private static int Class335;
    private static int Class336;
    private static int Class337;
    private static int Class338;
    private static int Class339;
    private static int Class340;
    private static int Class341;
    private static int Class342;
    private static int Class343;
    private static int Class344;
    private static Image[] Class345;
    public static int Class156;
    public static int Class157;
    private static int Class346;
    private static boolean Class347;
    private int[] Class348;
    private int Class349;
    private int Class350;
    private String[] Class351;
    private String[] Class352;
    private int Class353;
    private Command Class354;
    private Command Class355;
    private Command Class356;
    private Command Class357;
    private Command Class358;
    private Command Class359;
    private Command Class360;
    private Command Class361;
    private Command Class362;
    private Command Class363;
    private Command Class364;
    private Command Class365;
    private Command Class366;
    private Command Class367;
    private Command Class368;
    private Command cmdCloseAll;
    private Command Class370;
    private Command Class371;
    private Command Class372;
    private Command Class373;
    private Command Class374;
    private Command Class375;
    private Command Class376;
    private Command Class377;
    private Command Class378;
    private Command Class379;
    private Command Class380;
    private Command Class381;
    private Command Class382;
    private Command Class383;
    private Command Class384;
    private Command Class385;
    private Command Class386;
    private Command Class387;
    private Command Class388;
    private Command Class389;
    private Command Class390;
    private Command Class391;
    private String Class392;
    private String Class393;
    private static int Class394;
    private static int Class395;
    public static int Class158;
    public static int Class159;
    private static int Class396;
    private static int Class397;
    private static int Class398;
    private static int Class399;
    private static int Class400;
    private static int Class401;
    private int Class402;
    private int[] Class403;
    private int[][] Class404;
    private int[] Class405;
    private static String Class406;
    public static int Class160;
    public static Game106 Class161;
    private static int Class407;
    private static int Class408;
    private static int Class409;
    private static int Class410;
    public Command Class162;
    private Command Class411;
    private Command Class412;
    private Command Class413;
    private Command Class414;
    private Command Class415;
    private Command Class416;
    private Command Class417;
    public static String Class163;
    public static String Class164;
    private int Class418;
    private int Class419;
    private String Class420;
    private long Class421;
    private static long Class422;
    private static int Class423;
    private static int[] Class424;
    private static int[] Class425;
    private static boolean Class426;
    public static int Class165;
    public static int Class166;
    public static int Class167;
    private short Class427;
    private short Class428;
    private short Class429;
    private String Class430;
    private String Class431;
    private String Class432;
    private String Class433;
    private String Class434;
    private long Class435;
    private boolean Class436;
    public static byte Class168;
    private mFont Class437;
    private byte[] Class438;
    private byte Class439;
    MyVector Class169;
    private int Class440;
    private int Class441;
    private int Class442;
    private int Class443;
    private int Class444;
    private int Class445;
    private int Class446;
    private int Class447;
    private int Class448;
    private int Class449;
    private int Class450;
    private int Class451;
    private int Class452;
    private int Class453;
    private int Class454;
    private int Class455;
    private String Class456;
    private int[][] Class457;
    private static int Class458;
    public static boolean cj;
    public static int ci;
    private static boolean ItemNhat;
    private static boolean ItemBan;
    private static boolean ItemVut;
    
    static {
        GameScr.ci = 0;
        GameScr.cj = true;
        GameScr.Class30 = new MyVector();
        GameScr.Class31 = new MyVector();
        GameScr.vParty = new MyVector();
        GameScr.Class33 = new MyVector();
        GameScr.Class34 = new MyVector();
        GameScr.Class35 = new MyVector();
        GameScr.Class36 = new MyVector();
        GameScr.Class37 = new MyVector();
        GameScr.vCharInMap = new MyVector();
        GameScr.vItemMap = new MyVector();
        GameScr.Class189 = new MyVector();
        GameScr.Class190 = new MyVector();
        GameScr.vMob = new MyVector();
        GameScr.vNpc = new MyVector();
        GameScr.Class42 = new MyVector();
        GameScr.Class191 = new MyVector();
        GameScr.Class192 = 28;
        GameScr.Class193 = 0;
        GameScr.indexSelect = 0;
        GameScr.indexRow = -1;
        GameScr.indexMenu = 0;
        GameScr.Class47 = -1;
        GameScr.Class196 = new Game50();
        GameScr.Class50 = new Game50();
        new MyVector();
        GameScr.Class199 = false;
        GameScr.Class200 = false;
        GameScr.Class87 = true;
        GameScr.Class88 = false;
        GameScr.Class202 = false;
        GameScr.Class89 = false;
        GameScr.isPaintAlert = false;
        GameScr.Class203 = false;
        GameScr.Class204 = false;
        GameScr.Class205 = false;
        GameScr.Class91 = false;
        GameScr.Class206 = false;
        GameScr.Class207 = false;
        GameScr.Class92 = false;
        GameScr.Class208 = false;
        GameScr.Class93 = false;
        GameScr.Class209 = false;
        GameScr.Class210 = false;
        GameScr.Class211 = false;
        GameScr.Class212 = false;
        GameScr.Class213 = false;
        GameScr.Class214 = false;
        GameScr.Class215 = false;
        GameScr.Class216 = false;
        GameScr.Class217 = false;
        GameScr.Class218 = false;
        GameScr.ItemVut = false;
        GameScr.ItemNhat = false;
        GameScr.ItemBan = false;
        GameScr.Class219 = false;
        GameScr.Class220 = false;
        GameScr.Class221 = false;
        GameScr.Class222 = false;
        GameScr.Class223 = false;
        GameScr.Class224 = false;
        GameScr.Class225 = false;
        GameScr.Class226 = false;
        GameScr.Class227 = false;
        GameScr.Class228 = false;
        GameScr.Class229 = false;
        GameScr.Class230 = false;
        GameScr.Class231 = false;
        GameScr.Class232 = false;
        GameScr.Class233 = false;
        GameScr.Class234 = false;
        GameScr.Class235 = false;
        GameScr.Class236 = false;
        GameScr.isPaintTrade = false;
        GameScr.isPaintZone = false;
        GameScr.TuDong = false;
        GameScr.Class96 = false;
        GameScr.Class238 = false;
        GameScr.Class239 = false;
        GameScr.Class240 = false;
        GameScr.Class241 = false;
        GameScr.Class249 = false;
        GameScr.Class250 = false;
        GameScr.Class251 = new int[] { 0, 5000, 40000, 135000, 320000, 625000, 1080000, 1715000, 2560000, 3645000, 5000000 };
        GameScr.Class278 = 0;
        GameScr.Class136 = 0;
        GameScr.Class142 = new MyVector();
        GameScr.Class143 = new MyVector();
        GameScr.Class144 = new MyVector();
        GameScr.Class150 = false;
        GameScr.Class151 = false;
        GameCanvas.Class51 = GameCanvas.Class3("/plus12.png");
        GameScr.Class283 = GameCanvas.Class3("/trung1.png");
        GameScr.Class277 = GameCanvas.Class3("/u/select.png");
        GameScr.Class126 = GameCanvas.Class3("/hd/tf.png");
        GameScr.Class145 = GameCanvas.Class3("/eff/g132.png");
        GameScr.Class146 = GameCanvas.Class3("/eff/g10.png");
        GameScr.Class147 = GameCanvas.Class3("/eff/g6.png");
        GameScr.Class148 = GameCanvas.Class3("/eff/g99.png");
        GameScr.Class149 = GameCanvas.Class3("/eff/g9.png");
        if (GameCanvas.Class6) {
            GameScr.Class270 = GameCanvas.Class3("/hd/button.png");
            GameScr.Class271 = GameCanvas.Class3("/hd/button2.png");
            GameScr.Class272 = GameCanvas.Class3("/hd/hpp.png");
            GameScr.Class273 = GameCanvas.Class3("/hd/mpp.png");
            GameScr.Class274 = GameCanvas.Class3("/hd/right.png");
            GameScr.Class275 = GameCanvas.Class3("/hd/right2.png");
            GameScr.Class276 = GameCanvas.Class3("/hd/skill.png");
            GameScr.Class129 = GameCanvas.Class3("/hd/btnlf.png");
            GameScr.Class265 = GameCanvas.Class3("/hd/arrow.png");
            GameScr.Class266 = GameCanvas.Class3("/hd/arrow2.png");
            GameScr.Class267 = GameCanvas.Class3("/hd/chat.png");
            GameScr.Class269 = GameCanvas.Class3("/hd/focus.png");
            GameScr.Class268 = GameCanvas.Class3("/hd/menu.png");
            GameScr.Class263 = GameCanvas.Class3("/hd/topbar.png");
            GameScr.Class264 = GameCanvas.Class3("/hd/transparent.png");
            GameScr.Class127 = GameCanvas.Class3("/hd/mapborder.png");
            GameScr.Class128 = GameCanvas.Class3("/hd/btnl.png");
        }
        GameScr.Class130 = GameCanvas.Class3("/hd/mat.png");
        GameScr.Class131 = GameCanvas.Class3("/hd/lua.png");
        final byte[] loaddata = TaskOrder.Loaddata("dataVersion");
        final byte[] loaddata2 = TaskOrder.Loaddata("mapVersion");
        final byte[] loaddata3 = TaskOrder.Loaddata("skillVersion");
        final byte[] loaddata4 = TaskOrder.Loaddata("itemVersion");
        if (loaddata != null) {
            GameScr.Class118 = loaddata[0];
        }
        if (loaddata2 != null) {
            GameScr.Class119 = loaddata2[0];
        }
        if (loaddata3 != null) {
            GameScr.Class120 = loaddata3[0];
        }
        if (loaddata4 != null) {
            GameScr.Class121 = loaddata4[0];
        }
        GameScr.Class284 = new Skill[3];
        GameScr.Class285 = new Skill[5];
        GameScr.Class153 = 0;
        GameScr.Class321 = new int[5];
        GameScr.Class322 = new int[5];
        GameScr.Class323 = new int[5];
        GameScr.Class324 = new int[5];
        GameScr.Class325 = new int[5];
        GameScr.Class320 = new String[5];
        GameScr.Class326 = new int[8];
        for (int i = 0; i < 5; ++i) {
            GameScr.Class325[i] = -1;
        }
        GameScr.Class158 = 140;
        GameScr.Class159 = 160;
        GameScr.Class400 = 6;
        GameScr.Class406 = "Shop Online";
        new MyVector();
        GameScr.Class160 = 0;
        GameScr.Class163 = "";
        GameScr.Class164 = "";
        GameScr.Class168 = 0;
        GameScr.Class458 = 0;
    }
    
    public static long Class2(final int n) {
        long n2 = 0L;
        for (int i = 0; i <= n; ++i) {
            n2 += GameScr.Class98[i];
        }
        return n2;
    }
    
    public static void Class6() {
        GameScr.vCharInMap.removeAllElements();
        GameScr.vItemMap.removeAllElements();
        GameScr.Class30.removeAllElements();
        Game21.Class1.removeAllElements();
        Game21.Class4.removeAllElements();
        Game21.Class3.removeAllElements();
        GameScr.Class189.removeAllElements();
        GameScr.Class190.removeAllElements();
        GameScr.vMob.removeAllElements();
        GameScr.vNpc.removeAllElements();
        GameScr.Class42.removeAllElements();
        Char.getMyChar().Class132.removeAllElements();
    }
    
    public static void Class7() {
        Service.gI().Class7("KSkill");
        Service.gI().Class7("OSkill");
        Service.gI().Class7("CSkill");
    }
    
    public static void Class8() {
        Service.gI().Class7("KSkill");
        Service.gI().Class7("OSkill");
        Service.gI().Class7("CSkill");
    }
    
    public static void Class1(final byte[] array) {
        GameScr.Class285 = new Skill[5];
        if (array == null) {
            for (int n = 0; n < GameScr.Class285.length && n < Char.getMyChar().vSkillFight.size(); ++n) {
                GameScr.Class285[n] = (Skill)Char.getMyChar().vSkillFight.elementAt(n);
            }
            Class40();
            return;
        }
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < Char.getMyChar().vSkillFight.size(); ++j) {
                final Skill skill;
                if ((skill = (Skill)Char.getMyChar().vSkillFight.elementAt(j)).template.id == array[i]) {
                    GameScr.Class285[i] = skill;
                    break;
                }
            }
        }
    }
    
    public static void Class2(final byte[] array) {
        GameScr.Class284 = new Skill[3];
        if (array == null) {
            for (int n = 0; n < GameScr.Class284.length && n < Char.getMyChar().vSkillFight.size(); ++n) {
                GameScr.Class284[n] = (Skill)Char.getMyChar().vSkillFight.elementAt(n);
            }
            Class41();
            return;
        }
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < Char.getMyChar().vSkillFight.size(); ++j) {
                final Skill skill;
                if ((skill = (Skill)Char.getMyChar().vSkillFight.elementAt(j)).template.id == array[i]) {
                    GameScr.Class284[i] = skill;
                    break;
                }
            }
        }
    }
    
    public static void Class3(final byte[] array) {
        if (array == null || array.length == 0) {
            if (Char.getMyChar().vSkillFight.size() > 0) {
                Char.getMyChar().myskill = (Skill)Char.getMyChar().vSkillFight.elementAt(0);
            }
        }
        else {
            for (int i = 0; i < Char.getMyChar().vSkillFight.size(); ++i) {
                final Skill skill;
                if ((skill = (Skill)Char.getMyChar().vSkillFight.elementAt(i)).template.id == array[0]) {
                    Char.getMyChar().myskill = skill;
                    Char.getMyChar().Class169 = skill;
                    break;
                }
            }
        }
        if (Char.getMyChar().myskill != null) {
            Service.gI().selectSkill(Char.getMyChar().myskill.template.id);
            Char.getMyChar();
        }
    }
    
    private static void Class1(final SkillTemplate skillTemplate) {
        final Skill class1 = Char.getMyChar().Class1(skillTemplate);
        final MyVector myVector = new MyVector();
        for (int i = 0; i < 5; ++i) {
            boolean b = false;
            if (GameScr.Class285[i] == null) {
                b = true;
            }
            final Object[] array;
            (array = new Object[2])[0] = class1;
            array[1] = new StringBuffer(String.valueOf(i)).toString();
            myVector.addElement(new Command(String.valueOf(Game86.Class159) + " " + (i + 1), 11120, array));
            if (b) {
                break;
            }
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class2(final SkillTemplate skillTemplate) {
        final Skill class1 = Char.getMyChar().Class1(skillTemplate);
        final String[] array = TField.Class19 ? Game86.Class160 : Game86.Class161;
        final MyVector myVector = new MyVector();
        for (int i = 0; i < 3; ++i) {
            final Object[] array2;
            (array2 = new Object[2])[0] = class1;
            array2[1] = new StringBuffer(String.valueOf(i)).toString();
            myVector.addElement(new Command(array[i], 11121, array2));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class40() {
        final byte[] array = new byte[GameScr.Class285.length];
        for (int i = 0; i < GameScr.Class285.length; ++i) {
            if (GameScr.Class285[i] == null) {
                array[i] = -1;
            }
            else {
                array[i] = GameScr.Class285[i].template.id;
            }
        }
        if (Char.getMyChar().isHuman) {
            Service.gI().Class1("OSkill", array, (byte)0);
            return;
        }
        Service.gI().Class1("OSkill", array, (byte)1);
    }
    
    private static void Class41() {
        final byte[] array = new byte[GameScr.Class284.length];
        for (int i = 0; i < GameScr.Class284.length; ++i) {
            if (GameScr.Class284[i] == null) {
                array[i] = -1;
            }
            else {
                array[i] = GameScr.Class284[i].template.id;
            }
        }
        if (Char.getMyChar().isHuman) {
            Service.gI().Class1("KSkill", array, (byte)0);
            return;
        }
        Service.gI().Class1("KSkill", array, (byte)1);
    }
    
    public static void Class1(final Skill skill) {
        if (skill.template.type == 0) {
            return;
        }
        for (int i = 0; i < GameScr.Class285.length; ++i) {
            if (GameScr.Class285[i] == null) {
                GameScr.Class285[i] = skill;
                break;
            }
        }
        for (int j = 0; j < GameScr.Class284.length; ++j) {
            if (GameScr.Class284[j] == null) {
                GameScr.Class284[j] = skill;
                break;
            }
        }
        if (Char.getMyChar().myskill == null) {
            Char.getMyChar().myskill = skill;
            if (Code.T instanceof Auto20) {
                Auto.KCTSA = skill;
            }
        }
        Class41();
        Class40();
    }
    
    public static boolean Class9() {
        for (int i = Char.getMyChar().arrItemBag.length - 1; i >= 0; --i) {
            if (Char.getMyChar().arrItemBag[i] == null) {
                return false;
            }
        }
        return true;
    }
    
    public static void Class1(final String[] array, final Npc npc) {
        final MyVector myVector = new MyVector();
        for (int i = 0; i < array.length; ++i) {
            myVector.addElement(new Command(array[i], 11057, npc));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class42() {
        GameScr.Class97 = Char.getMyChar();
        GameScr.indexMenu = 0;
        this.Class55();
    }
    
    private void Class43() {
        GameScr.Class97 = Char.getMyChar();
        GameScr.indexMenu = 1;
        this.Class55();
    }
    
    private void Class44() {
        GameScr.Class97 = Char.getMyChar();
        GameScr.indexMenu = 2;
        this.Class55();
    }
    
    private void Class45() {
        GameScr.Class97 = Char.getMyChar();
        GameScr.indexMenu = 3;
        this.Class55();
    }
    
    private void Class46() {
        GameScr.Class97 = Char.getMyChar();
        GameScr.indexMenu = 4;
        this.Class55();
    }
    
    private void Class47() {
        GameScr.Class97 = Char.getMyChar();
        GameScr.indexMenu = 5;
        this.Class55();
    }
    
    private void Class48() {
        GameScr.Class97 = Char.getMyChar();
        GameScr.indexMenu = 6;
        GameScr.Class458 = 0;
        this.Class55();
    }
    
    private void Class49() {
        GameScr.Class97 = Char.getMyChar();
        GameScr.indexMenu = 6;
        GameScr.Class458 = 1;
        this.Class55();
    }
    
    private void Class50() {
        GameScr.Class97 = Char.getMyChar();
        GameScr.indexMenu = 6;
        GameScr.Class458 = 2;
        this.Class55();
    }
    
    public static void Class10() {
        DataInputStream dataInputStream = null;
        try {
            final short short1;
            GameScr.Class28 = new Game99[short1 = (dataInputStream = new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("nj_part")))).readShort()];
            for (short n = 0; n < short1; ++n) {
                GameScr.Class28[n] = new Game99(dataInputStream.readByte());
                for (int i = 0; i < GameScr.Class28[n].Class1.length; ++i) {
                    GameScr.Class28[n].Class1[i] = new Game49();
                    GameScr.Class28[n].Class1[i].Class1 = dataInputStream.readShort();
                    GameScr.Class28[n].Class1[i].Class2 = dataInputStream.readByte();
                    GameScr.Class28[n].Class1[i].Class3 = dataInputStream.readByte();
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                dataInputStream.close();
            }
            catch (IOException ex2) {
                ex2.printStackTrace();
            }
        }
        try {
            dataInputStream.close();
        }
        catch (IOException ex3) {
            ex3.printStackTrace();
        }
    }
    
    public static void startWaitDlgWithoutCancel() {
        DataInputStream dataInputStream = null;
        try {
            final short short1;
            GameScr.efs = new Game106[short1 = (dataInputStream = new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("nj_effect")))).readShort()];
            for (short n = 0; n < short1; ++n) {
                GameScr.efs[n] = new Game106();
                GameScr.efs[n].Class1 = dataInputStream.readShort();
                GameScr.efs[n].Class2 = new Game90[dataInputStream.readByte()];
                for (int i = 0; i < GameScr.efs[n].Class2.length; ++i) {
                    GameScr.efs[n].Class2[i] = new Game90();
                    GameScr.efs[n].Class2[i].Class3 = dataInputStream.readShort();
                    GameScr.efs[n].Class2[i].Class1 = dataInputStream.readByte();
                    GameScr.efs[n].Class2[i].Class2 = dataInputStream.readByte();
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                dataInputStream.close();
            }
            catch (IOException ex2) {
                ex2.printStackTrace();
            }
        }
        try {
            dataInputStream.close();
        }
        catch (IOException ex3) {
            ex3.printStackTrace();
        }
    }
    
    public static void Class12() {
        DataInputStream dataInputStream = null;
        try {
            final short short1;
            GameScr.Class27 = new Game51[short1 = (dataInputStream = new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("nj_arrow")))).readShort()];
            for (short n = 0; n < short1; ++n) {
                GameScr.Class27[n] = new Game51();
                dataInputStream.readShort();
                GameScr.Class27[n].Class1[0] = dataInputStream.readShort();
                GameScr.Class27[n].Class1[1] = dataInputStream.readShort();
                GameScr.Class27[n].Class1[2] = dataInputStream.readShort();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                dataInputStream.close();
            }
            catch (IOException ex2) {
                ex2.printStackTrace();
            }
        }
        try {
            dataInputStream.close();
        }
        catch (IOException ex3) {
            ex3.printStackTrace();
        }
    }
    
    public static void Class13() {
        DataInputStream dataInputStream = null;
        try {
            final short short1 = (dataInputStream = new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("nj_skill")))).readShort();
            int n = 0;
            for (int i = 0; i < GameScr.Class43.length; ++i) {
                n += GameScr.Class43[i].Class3.length;
            }
            GameScr.sks = new SkillPaint[n];
            for (short n2 = 0; n2 < short1; ++n2) {
                final short short2 = dataInputStream.readShort();
                GameScr.sks[short2] = new SkillPaint();
                GameScr.sks[short2].id = dataInputStream.readShort();
                dataInputStream.readByte();
                GameScr.sks[short2].Class2 = new Game18[dataInputStream.readByte()];
                for (int j = 0; j < GameScr.sks[short2].Class2.length; ++j) {
                    GameScr.sks[short2].Class2[j] = new Game18();
                    GameScr.sks[short2].Class2[j].Class1 = dataInputStream.readByte();
                    GameScr.sks[short2].Class2[j].Class2 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class3 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class4 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class5 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class6 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class7 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class8 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class9 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class10 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class11 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class12 = dataInputStream.readShort();
                    GameScr.sks[short2].Class2[j].Class13 = dataInputStream.readShort();
                }
                GameScr.sks[short2].Class3 = new Game18[dataInputStream.readByte()];
                for (int k = 0; k < GameScr.sks[short2].Class3.length; ++k) {
                    GameScr.sks[short2].Class3[k] = new Game18();
                    GameScr.sks[short2].Class3[k].Class1 = dataInputStream.readByte();
                    GameScr.sks[short2].Class3[k].Class2 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class3 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class4 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class5 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class6 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class7 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class8 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class9 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class10 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class11 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class12 = dataInputStream.readShort();
                    GameScr.sks[short2].Class3[k].Class13 = dataInputStream.readShort();
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                dataInputStream.close();
            }
            catch (IOException ex2) {
                ex2.printStackTrace();
            }
        }
        try {
            dataInputStream.close();
        }
        catch (IOException ex3) {
            ex3.printStackTrace();
        }
    }
    
    public static void Class1(final long n) {
        long n2;
        int n3;
        for (n2 = n, n3 = 0; n3 < GameScr.Class98.length && n2 >= GameScr.Class98[n3]; n2 -= GameScr.Class98[n3], ++n3) {}
        final long[] array = { n3, n2 };
        Char.getMyChar().Class22 = (int)array[0];
        Char.getMyChar().Class30 = array[1];
    }
    
    public static GameScr gI() {
        if (GameScr.Class8 == null) {
            GameScr.Class8 = new GameScr();
        }
        return GameScr.Class8;
    }
    
    public static void Class15() {
        GameScr.Class8 = null;
        GameScr.Class75 = (GameScr.Class76 = (GameScr.Class77 = (GameScr.arrItemTradeMe = (GameScr.arrItemTradeOrder = null))));
        GameScr.Class84 = (GameScr.Class85 = null);
    }
    
    public final void Class16() {
        if (GameScr.Class332 == null) {
            GameScr.Class332 = new Image[3];
            for (int i = 0; i < 3; ++i) {
                GameScr.Class332[i] = GameCanvas.Class3("/e/sp" + i + ".png");
            }
        }
        GameScr.Class327 = new int[2];
        GameScr.Class328 = new int[2];
        GameScr.Class329 = new int[2];
        GameScr.Class330 = new int[2];
        GameScr.Class331 = new int[2];
        GameScr.Class329[0] = (GameScr.Class329[1] = -1);
        this.Class70();
        Res.Class1();
    }
    
    public GameScr() {
        this.Class187 = 0;
        this.Class188 = false;
        this.Class252 = 6;
        this.typeTrade = 0;
        this.typeTradeOrder = 0;
        this.coinTrade = 0;
        this.coinTradeOrder = 0;
        this.Class113 = 0;
        this.Class255 = 0;
        this.Class256 = 0;
        this.Class257 = 0;
        this.Class258 = -1;
        this.Class114 = -1;
        this.Class115 = -1;
        this.Class262 = null;
        this.Class132 = "";
        this.Class133 = "";
        this.Class279 = new int[2];
        this.Class280 = new int[2];
        this.Class138 = new String[] { "10000", "20000", "30000", "50000", "100000", "200000", "500000", "1000000", "5000000" };
        this.Class155 = false;
        this.Class294 = 0;
        this.Class295 = -1;
        this.Class297 = 0;
        this.Class348 = new int[] { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
        this.Class350 = 0;
        this.Class351 = null;
        this.Class352 = null;
        this.Class353 = 0;
        this.Class402 = 0;
        this.Class403 = new int[] { 0, 0, 0, 0, 600841, 600841, 667658, 667658, 3346944, 3346688, 4199680, 5052928, 3276851, 3932211, 4587571, 5046280, 6684682, 3359744 };
        this.Class404 = new int[][] { { 18687, 16869, 15052, 13235, 11161, 9344 }, { 45824, 39168, 32768, 26112, 19712, 13056 }, { 16744192, 15037184, 13395456, 11753728, 10046464, 8404992 }, { 13500671, 12058853, 10682572, 9371827, 7995545, 6684800 }, { 16711705, 15007767, 13369364, 11730962, 10027023, 8388621 } };
        this.Class405 = new int[] { 2, 1, 1, 1, 1, 1 };
        this.Class162 = new Command(Game86.Class369[0], 11038);
        this.Class418 = 30;
        this.Class419 = 0;
        this.Class420 = "";
        this.Class437 = mFont.Class6;
        this.Class438 = new byte[] { -1, -1, -1, -1, -1, -1 };
        this.Class439 = 0;
        this.Class169 = new MyVector();
        this.Class456 = "";
        this.Class457 = new int[][] { new int[2], { 200, 10 }, { 500, 20 }, { 1000, 50 }, { 2000, 100 }, { 5000, 200 }, { 10000, 500 }, { 20000, 1000 }, { 50000, 2000 }, { 100000, 5000 }, { 100000, 10000 } };
        if (GameCanvas.Class25 == 128 || GameCanvas.Class26 <= 208) {
            GameScr.Class192 = 20;
        }
        this.Class290 = new Command(Game86.Class207, 5043);
        this.Class291 = new Command(Game86.Class207, 5053);
        this.Class289 = new Command(Game86.Class107, 11002);
        this.Class288 = new Command(Game86.Class207, 11003);
        this.Class391 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11004);
        this.Class390 = new Command(Game86.Class71, 11005);
        this.Class287 = new Command(Game86.Class207, 11006);
        this.Class389 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11007);
        this.Class388 = new Command(Game86.Class71, 11008);
        this.Class387 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11009);
        this.Class386 = new Command(Game86.Class71, 11010);
        this.Class385 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11011);
        this.Class384 = new Command(Game86.Class71, 11012);
        this.Class383 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11013);
        this.Class382 = new Command(Game86.Class71, 11014);
        this.Class381 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11015);
        this.Class380 = new Command(Game86.Class71, 11016);
        this.Class377 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11017);
        this.Class379 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 13001);
        this.Class376 = new Command(Game86.Class71, 11018);
        this.Class378 = new Command(Game86.Class71, 13002);
        this.Class373 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11019);
        this.Class372 = new Command(Game86.Class71, 11020);
        this.Class370 = new Command(Game86.Class71, 14022);
        this.Class371 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 14023);
        this.Class375 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 14018);
        this.Class374 = new Command(Game86.Class71, 14019);
        this.cmdCloseAll = new Command(Game86.CLOSE, 11021);
        this.Class417 = new Command(Game86.Class119, 11022);
        this.Class416 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11023);
        this.Class414 = new Command(Game86.Class57, 2001);
        this.Class415 = new Command(Game86.Class58, 110244);
        this.Class413 = new Command(Game86.CLOSE, 11025);
        this.Class411 = new Command(Game86.Class55, 11026);
        this.Class412 = new Command(Game86.Class56, 110221);
        this.Class368 = new Command(Game86.Class119, 11027);
        this.Class367 = new Command(Game86.Class119, 11028);
        this.Class366 = new Command(Game86.Class119, 11029);
        this.Class365 = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11030);
        new Command(Game86.Class135, 11021);
        this.Class286 = new Command(Game86.Class27, 11000);
        this.Class184 = new Command("Focus", 11001);
        this.Class355 = new Command(Game86.Class199, 11032);
        this.Class356 = new Command(Game86.Class107, 11033);
        this.Class360 = new Command(Game86.Class62, 11034);
        this.Class361 = new Command(Game86.Class62, 14014);
        this.Class362 = new Command(Game86.Class62, 11035);
        this.Class363 = new Command(Game86.Class65, 11036);
        this.Class364 = new Command(Game86.Class62, 11037);
        this.Class357 = new Command(Game86.Class62, 339);
        this.Class358 = new Command(Game86.Class62, 340);
        this.Class359 = new Command(Game86.Class62, 343);
        this.Class354 = new Command(Game86.Class62, 402);
        new Command("240", 110381);
        new Command("360", 1103911);
        new Command("To\u00e0n Map", 110401);
        this.Class186 = new Command(Game86.Class505, 2003);
        final Command class186 = this.Class186;
        final int n = GameCanvas.Class25 / 2 - mScreen.Class5 / 2;
        final int class187 = GameCanvas.Class26 - 26;
        final int class188 = n;
        final Command command = class186;
        class186.Class6 = class188;
        command.Class7 = class187;
        if (GameCanvas.Class6 && GameCanvas.Class7) {
            this.Class286.Class6 = GameScr.Class9 - 135;
            this.Class286.Class7 = 6;
            this.Class286.Class5 = GameScr.Class268;
            this.Class184.Class6 = GameScr.Class9;
            this.Class184.Class7 = GameScr.Class10;
            if (GameCanvas.Class8) {
                this.Class286.Class6 = GameScr.Class9 / 2 - 38;
                this.Class286.Class7 = GameScr.Class10 - 34;
            }
        }
        this.Class184.Class5 = GameCanvas.Class3("/u/fc.png");
        super.left = this.Class286;
        super.right = this.Class184;
    }
    
    private void Class51() {
        if (!GameCanvas.Class6 || (GameCanvas.Class6 && GameCanvas.Class25 < 320) || (GameScr.Class93 && GameScr.indexMenu > 0) || (GameScr.Class238 && GameScr.indexMenu == 0)) {
            GameScr.Class92 = false;
        }
        GameScr.Class198 = false;
        if (Class27()) {
            this.Class29();
            super.right = this.cmdCloseAll;
            return;
        }
        this.Class36();
    }
    
    private void Class52() {
        if ((GameScr.Class193 <= 0 || GameScr.Class193 > 4) && !GameCanvas.Class6) {
            return;
        }
        GameCanvas.inputDlg.show(Game86.Class283, this.Class287, 1);
    }
    
    private void Class53() {
        if (GameScr.Class193 <= 0 || GameScr.Class193 > 4) {
            return;
        }
        GameCanvas.inputDlg.show(Game86.Class283, this.Class288, 1);
    }
    
    private void Class54() {
        if (!GameScr.Class91) {
            return;
        }
        GameCanvas.inputDlg.show(Game86.Class132, this.Class289, 0);
    }
    
    private void Class55() {
        GameScr.Class93 = true;
        setPopupSize(175, 200);
        this.Class36();
        if (GameScr.indexMenu == 3 && GameScr.Class97.charID == Char.getMyChar().charID) {
            Service.gI().Class6(GameScr.Class97.cName);
        }
        if (GameScr.indexMenu == 5) {
            this.Class281 = new int[5];
            this.Class282 = new int[5];
            GameScr.Class394 = GameScr.Class157 + 5;
            GameScr.Class395 = GameScr.Class156 + 35;
            this.Class281[0] = GameScr.Class394 + 5;
            this.Class282[0] = GameScr.Class395 + 35;
            this.Class281[1] = GameScr.Class394 + 5;
            this.Class282[1] = GameScr.Class395 + 70;
            this.Class281[2] = GameScr.Class394 + 131;
            this.Class282[2] = GameScr.Class395 + 35;
            this.Class281[3] = GameScr.Class394 + 131;
            this.Class282[3] = GameScr.Class395 + 70;
            this.Class281[4] = this.Class281[0] + GameScr.Class192 + 7;
            this.Class282[4] = this.Class282[0] - 5;
        }
        if (GameScr.indexMenu == 6) {
            this.Class281 = new int[5];
            this.Class282 = new int[5];
            GameScr.Class394 = GameScr.Class157 + 5;
            GameScr.Class395 = GameScr.Class156 + 35;
            this.Class281[0] = GameScr.Class394 + 5;
            this.Class282[0] = GameScr.Class395 + 35;
            this.Class281[1] = GameScr.Class394 + 5;
            this.Class282[1] = GameScr.Class395 + 70;
            this.Class281[2] = GameScr.Class394 + 131;
            this.Class282[2] = GameScr.Class395 + 35;
            this.Class281[3] = GameScr.Class394 + 131;
            this.Class282[3] = GameScr.Class395 + 70;
            this.Class281[4] = this.Class281[0] + GameScr.Class192 + 7;
            this.Class282[4] = this.Class282[0] - 5;
        }
        super.right = new Command(Game86.Class135, 11060);
    }
    
    private void Class56() {
        GameScr.Class50.Class1();
        GameScr.Class196.Class1();
        GameScr.Class198 = false;
        this.Class179 = new Command(Game86.Class163[0], 1100011);
        this.Class180 = new Command(Game86.Class163[1], 1100012);
        this.Class181 = new Command(Game86.Class163[2], 1100013);
        this.Class183 = new Command(Game86.Class163[3], 1100014);
        this.Class182 = new Command(Game86.Class163[4], 1100015);
        this.Class185 = new Command(Game86.Class163[6], 1100017);
        final MyVector myVector;
        (myVector = new MyVector()).addElement(this.Class179);
        myVector.addElement(this.Class180);
        myVector.addElement(this.Class181);
        myVector.addElement(this.Class183);
        myVector.addElement(this.Class182);
        myVector.addElement(new Command(Game86.Class163[5], 1100016));
        myVector.addElement(this.Class185);
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class57() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class383[0], 110002));
        myVector.addElement(new Command(Game86.Class383[1], 1100032));
        myVector.addElement(new Command(Game86.Class383[2], 1100033));
        myVector.addElement(new Command(Game86.Class19, 1100034));
        myVector.addElement(new Command(Game86.Class48, Game83.Class7(), 1004, null));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class58() {
        if (GameScr.Class292 > 0) {
            return;
        }
        final Command command = new Command(Game86.Class247[1], 110001);
        final Command command2 = new Command(Game86.Class247[3], 110003);
        final Command command3 = new Command(Game86.Class247[4], 110004);
        new Command(Game86.Class247[0], 110005);
        final Command command4 = new Command(Game86.Class247[6], 110006);
        new Command(Game86.Class247[7], 110007);
        new Command(Game86.Class247[8], 110008);
        new Command(Game86.Class247[9], 110009);
        new Command(Game86.Class247[10], 110010);
        new Command(Game86.Class247[11], 110011);
        new Command(Game86.Class247[12], 110012);
        new Command(Game86.Class247[13], 110013);
        new Command(Game86.Class247[14], 110014);
        new Command(Game86.Class247[15], 110015);
        new Command(Game86.Class247[16], 110016);
        new Command(Game86.Class247[17], 110017);
        final Command command5 = new Command(Game86.Class247[18], 110018);
        final Command command6 = new Command("X\u00e1c th\u1ef1c t\u00e0i kho\u1ea3n", 1100181);
        final MyVector myVector = new MyVector();
        if (Char.getMyChar().Class22 >= 3 && Game69.Class7()) {
            myVector.addElement(command6);
        }
        myVector.addElement(command);
        myVector.addElement(new Command("Auto", Selection.gI(), 1, 0));
        myVector.addElement(new Command("H\u01b0\u1edbng D\u1eabn", Selection.gI(), 27, 0));
        myVector.addElement(command2);
        myVector.addElement(command4);
        myVector.addElement(command5);
        myVector.addElement(new Command("R\u01b0\u01a1ng", Selection.gI(), 24, 0));
        myVector.addElement(new Command("T\u1ef1 S\u00e1t", Selection.gI(), 25, 0));
        myVector.addElement(new Command("Khu V\u1ef1c", Selection.gI(), 26, 0));
        myVector.addElement(command3);
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class59() {
        this.Class22();
        GameScr.Class203 = true;
        GameScr.indexMenu = this.Class187;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        super.left = new Command(Game86.Class247[2], 110002);
        super.center = new Command(Game86.Class157, 110019);
    }
    
    private void Class60() {
        this.Class22();
        GameScr.Class205 = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        Service.gI().Class4();
        this.Class19();
    }
    
    private void Class61() {
        this.Class22();
        if (this.Class114 > 0) {
            GameScr.indexRow = Char.Class11(this.Class114);
        }
        else {
            GameScr.indexRow = 0;
            this.Class114 = -1;
        }
        GameScr.Class236 = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
    }
    
    private void Class62() {
        this.Class22();
        GameScr.Class204 = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        this.Class20();
    }
    
    public final void Class17() {
        this.Class22();
        GameScr.Class202 = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        final Command command = null;
        super.center = command;
        super.left = command;
        GameScr.indexRow = 0;
    }
    
    public final void Class18() {
        this.Class22();
        GameScr.Class206 = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        final Command command = null;
        super.center = command;
        super.left = command;
        GameScr.indexRow = 0;
    }
    
    private void Class63() {
        this.Class22();
        GameScr.Class91 = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        super.left = new Command(Game86.Class109, 11044);
        super.center = null;
        GameScr.indexRow = 0;
        final Service gi = Service.gI();
        Message class3 = null;
        try {
            class3 = Service.Class3((byte)(-85));
            gi.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    private void Class64() {
        this.Class22();
        GameScr.Class207 = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        super.left = new Command(Game86.Class109, 14017);
        super.center = null;
        GameScr.indexRow = 0;
        final Service gi = Service.gI();
        Message class3 = null;
        try {
            class3 = Service.Class3((byte)(-84));
            gi.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class19() {
        if (GameScr.Class205) {
            final Command command = null;
            super.center = command;
            super.left = command;
            super.left = new Command(Game86.Class27, 11045);
            final Party party;
            if (GameScr.Class33.size() > 0 && GameScr.indexRow >= 0 && GameScr.indexRow < GameScr.Class33.size() && (party = (Party)GameScr.Class33.elementAt(GameScr.indexRow)) != null && !Char.getMyChar().cName.equals(party.name)) {
                super.center = new Command(Game86.Class119, 11046);
            }
        }
    }
    
    public final void Class20() {
        if (GameScr.Class204) {
            final Command command = null;
            super.center = command;
            super.left = command;
            GameScr.indexRow = 0;
            if (GameScr.vParty.size() == 0) {
                super.center = null;
                super.left = new Command(Game86.Class27, 11047);
                return;
            }
            final Party party;
            if ((party = GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                super.left = new Command(Game86.Class373, 11070, party);
                return;
            }
            super.left = new Command(Game86.Class372, 11071);
        }
    }
    
    private static void Class65() {
        if (TileMap.Class14 != 1) {
            MapScr.Class6().switchToMe();
        }
    }
    
    public final void Class1(final Message message) {
        InfoDlg.hide();
        try {
            final byte byte1;
            if ((byte1 = message.Class4.readByte()) <= 0) {
                return;
            }
            this.zones = new int[byte1];
            this.Class254 = new int[this.zones.length];
            for (int i = 0; i < this.zones.length; ++i) {
                this.zones[i] = message.Class4.readByte();
                this.Class254[i] = message.Class4.readByte();
            }
            GameScr.isPaintZone = true;
            GameScr.indexSelect = TileMap.zoneID;
            setPopupSize(175, 200);
            super.left = new Command(Game86.Class119, 11067);
            super.center = new Command("", 11067);
            super.right = this.cmdCloseAll;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final void Class21() {
        try {
            this.Class22();
            this.Class133 = "";
            this.typeTrade = 0;
            final int n = 0;
            this.coinTradeOrder = n;
            this.coinTrade = n;
            this.typeTradeOrder = n;
            this.typeTrade = n;
            GameScr.isPaintTrade = true;
            GameScr.arrItemTradeMe = new Item[12];
            GameScr.arrItemTradeOrder = new Item[12];
            GameScr.indexMenu = 0;
            setPopupSize(175, 200);
            super.right = this.cmdCloseAll;
        }
        catch (Exception ex) {}
    }
    
    public static final void Class1(final boolean b) {
        GameScr.Class9 = GameCanvas.Class25;
        if (!GameCanvas.Class6 || (GameCanvas.Class6 && !GameCanvas.Class7)) {
            GameScr.Class14 = 36;
            if (GameCanvas.Class6) {
                GameScr.Class14 += 3;
            }
        }
        else {
            GameScr.Class14 = 8;
        }
        GameScr.Class10 = GameCanvas.Class26 - GameScr.Class14 - 20;
        if (b) {
            GameScr.Class10 = GameCanvas.Class26;
        }
        if (GameCanvas.Class6 && GameCanvas.Class7) {
            GameScr.Class10 = GameCanvas.Class26;
        }
        if (GameCanvas.Class26 == 160) {
            GameScr.Class10 = 150;
        }
        GameScr.Class335 = GameScr.Class9;
        if (GameCanvas.Class25 > 176) {
            GameScr.Class335 -= 50;
        }
        GameScr.Class334 = GameCanvas.Class26 - Game25.Class6 - GameScr.Class14;
        final int class26 = GameCanvas.Class26;
        GameScr.Class11 = GameScr.Class9 >> 1;
        GameScr.Class13 = GameScr.Class10 >> 1;
        GameScr.Class12 = 2 * GameScr.Class10 / 3;
        GameScr.Class15 = GameScr.Class9 / 6;
        GameScr.Class170 = GameScr.Class9 / TileMap.Class9 + 2;
        GameScr.Class171 = GameScr.Class10 / TileMap.Class9 + 2;
        if (GameScr.Class9 % 24 != 0) {
            ++GameScr.Class170;
        }
        GameScr.Class177 = (TileMap.Class1 - 1) * TileMap.Class9 - GameScr.Class9;
        GameScr.Class178 = (TileMap.Class2 - 1) * TileMap.Class9 - GameScr.Class10;
        if (GameCanvas.Class6 && GameCanvas.Class7) {
            GameScr.Class178 += 60;
        }
        GameScr.Class16 = (GameScr.Class18 = Char.getMyChar().cx - GameScr.Class11 + GameScr.Class15 * Char.getMyChar().Class15);
        GameScr.Class17 = (GameScr.Class19 = Char.getMyChar().cy - GameScr.Class12);
        if (GameScr.Class16 < 24) {
            GameScr.Class16 = 24;
        }
        if (GameScr.Class16 > GameScr.Class177) {
            GameScr.Class16 = GameScr.Class177;
        }
        if (GameScr.Class17 < 0) {
            GameScr.Class17 = 0;
        }
        if (GameScr.Class17 > GameScr.Class178) {
            GameScr.Class17 = GameScr.Class178;
        }
        if ((GameScr.Class20 = GameScr.Class16 / TileMap.Class9 - 1) < 0) {
            GameScr.Class20 = 0;
        }
        GameScr.Class21 = GameScr.Class17 / TileMap.Class9;
        GameScr.Class22 = GameScr.Class20 + GameScr.Class170;
        GameScr.Class23 = GameScr.Class21 + GameScr.Class171;
        if (GameScr.Class21 < 0) {
            GameScr.Class21 = 0;
        }
        if (GameScr.Class23 > TileMap.Class2 - 1) {
            GameScr.Class23 = TileMap.Class2 - 1;
        }
        if ((TileMap.Class29 = GameScr.Class22 - GameScr.Class20 << 2) > TileMap.Class1) {
            TileMap.Class29 = TileMap.Class1;
        }
        if ((TileMap.Class30 = GameScr.Class23 - GameScr.Class21 << 2) > TileMap.Class2) {
            TileMap.Class30 = TileMap.Class2;
        }
        if ((TileMap.Class25 = (Char.getMyChar().cx - 2 * GameScr.Class9) / TileMap.Class9) < 0) {
            TileMap.Class25 = 0;
        }
        if ((TileMap.Class26 = TileMap.Class25 + TileMap.Class29) > TileMap.Class1) {
            TileMap.Class26 = TileMap.Class1;
        }
        if ((TileMap.Class27 = (Char.getMyChar().cy - 2 * GameScr.Class10) / TileMap.Class9) < 0) {
            TileMap.Class27 = 0;
        }
        if ((TileMap.Class28 = TileMap.Class27 + TileMap.Class30) > TileMap.Class2) {
            TileMap.Class28 = TileMap.Class2;
        }
        Game23.Class1().Class3 = GameScr.Class8;
        Game23.Class1().Class1.Class2 = GameCanvas.Class26 - 35 - Game23.Class1().Class1.Class4;
        if (!GameCanvas.Class6 || (GameCanvas.Class6 && !GameCanvas.Class7)) {
            TileMap.Class1(GameCanvas.Class25 - 51, GameScr.Class334 - 4, 50, 40);
        }
        else {
            TileMap.Class1(GameCanvas.Class25 - 60, 0, 60, 42);
        }
        if (GameCanvas.Class6) {
            GameScr.Class298 = GameScr.Class10 - 88;
            GameScr.Class301 = GameScr.Class9 - 100;
            GameScr.Class302 = 2;
            if (GameCanvas.Class8) {
                GameScr.Class301 = GameScr.Class9 / 2 - 2;
                GameScr.Class302 = GameScr.Class298 + 50;
            }
            GameScr.Class299 = 1;
            GameScr.Class300 = GameScr.Class298 + 50;
            GameScr.Class303 = 42;
            GameScr.Class304 = GameScr.Class298 + 50;
            GameScr.Class305 = GameScr.Class9 - 50;
            GameScr.Class306 = GameScr.Class298 + 35;
            GameScr.Class307 = 22;
            GameScr.Class308 = GameScr.Class298 + 19;
            GameScr.Class309 = GameScr.Class9 - 74;
            GameScr.Class310 = GameScr.Class298 + 13;
            GameScr.Class311 = GameScr.Class9 - 85;
            GameScr.Class312 = GameScr.Class298 + 50;
            GameScr.Class313 = GameScr.Class9 - 37;
            GameScr.Class314 = GameScr.Class298 - 1;
            if (GameCanvas.Class25 >= 450) {
                GameScr.Class308 -= 15;
                GameScr.Class307 += 28;
                GameScr.Class303 += 45;
                GameScr.Class299 += 10;
                GameScr.Class314 -= 12;
                GameScr.Class310 -= 7;
                GameScr.Class305 -= 18;
                GameScr.Class313 -= 10;
                GameScr.Class309 -= 17;
                GameScr.Class311 -= 24;
            }
            else if (GameCanvas.Class25 >= 360) {
                GameScr.Class308 -= 5;
                GameScr.Class307 += 6;
                GameScr.Class303 += 12;
                GameScr.Class314 -= 2;
                GameScr.Class310 -= 2;
                GameScr.Class309 -= 2;
                GameScr.Class311 -= 2;
            }
        }
        GameScr.xS = new int[GameScr.Class285.length];
        GameScr.yS = new int[GameScr.Class285.length];
        if (!GameCanvas.Class6) {
            GameScr.xSkill = 0;
            for (int i = 0; i < GameScr.yS.length; ++i) {
                GameScr.xS[i] = 2;
                GameScr.yS[i] = 2 + i * 25;
            }
            return;
        }
        if (GameCanvas.Class8) {
            GameScr.xSkill = 2;
            GameScr.Class318 = 55;
            GameScr.Class319 = 5;
            for (int j = 0; j < GameScr.xS.length; ++j) {
                final int[] xs = GameScr.xS;
                final int n = j;
                xs[n] = n * (25 + GameScr.Class319);
                GameScr.yS[j] = GameScr.Class318;
            }
            return;
        }
        if (GameCanvas.Class25 <= 320) {
            GameScr.xSkill = GameScr.Class11 - GameScr.Class285.length * 25 / 2 - 15;
        }
        else {
            GameScr.xSkill = GameScr.Class11 - GameScr.Class285.length * 25 / 2;
        }
        GameScr.Class318 = GameScr.Class298 + 58;
        GameScr.Class319 = 5;
        for (int k = 0; k < GameScr.xS.length; ++k) {
            final int[] xs2 = GameScr.xS;
            final int n2 = k;
            xs2[n2] = n2 * (25 + GameScr.Class319);
            GameScr.yS[k] = GameScr.Class318;
        }
    }
    
    private static boolean Class66() {
        if (Char.getMyChar().myskill != null && Char.getMyChar().cMP < Char.getMyChar().myskill.Class10) {
            InfoMe.Class1(Game86.Class265);
            return false;
        }
        if (Char.getMyChar().myskill == null || (Char.getMyChar().myskill.template.Class3 > 0 && Char.getMyChar().myskill.Class3 == 0)) {
            GameCanvas.setText(Game86.Class356);
            return false;
        }
        if (Char.getMyChar().arrItemBody[1] == null) {
            GameCanvas.setText(Game86.Class357);
            return false;
        }
        return true;
    }
    
    public final void Class22() {
        if (Char.getMyChar().arrItemBag != null) {
            if ((GameScr.Class233 || GameScr.Class242) && GameScr.Class75 != null) {
                for (int i = 0; i < GameScr.Class75.length; ++i) {
                    if (GameScr.Class75[i] != null) {
                        Char.getMyChar().arrItemBag[GameScr.Class75[i].indexUI] = GameScr.Class75[i];
                        GameScr.Class75[i] = null;
                    }
                }
            }
            if (GameScr.Class230) {
                if (GameScr.Class84 != null) {
                    Char.getMyChar().arrItemBag[GameScr.Class84.indexUI] = GameScr.Class84;
                    GameScr.Class84 = null;
                }
                if (GameScr.Class76 != null) {
                    for (int j = 0; j < GameScr.Class76.length; ++j) {
                        if (GameScr.Class76[j] != null) {
                            Char.getMyChar().arrItemBag[GameScr.Class76[j].indexUI] = GameScr.Class76[j];
                            GameScr.Class76[j] = null;
                        }
                    }
                }
            }
            if (GameScr.Class246) {
                if (GameScr.Class84 != null) {
                    Char.getMyChar().arrItemBag[GameScr.Class84.indexUI] = GameScr.Class84;
                    GameScr.Class84 = null;
                }
                if (GameScr.Class85 != null) {
                    Char.getMyChar().arrItemBag[GameScr.Class85.indexUI] = GameScr.Class85;
                    GameScr.Class85 = null;
                }
                if (GameScr.Class76 != null) {
                    for (int k = 0; k < GameScr.Class76.length; ++k) {
                        if (GameScr.Class76[k] != null) {
                            Char.getMyChar().arrItemBag[GameScr.Class76[k].indexUI] = GameScr.Class76[k];
                            GameScr.Class76[k] = null;
                        }
                    }
                }
            }
            if (GameScr.Class250 && GameScr.Class76 != null) {
                for (int l = 0; l < GameScr.Class76.length; ++l) {
                    if (GameScr.Class76[l] != null) {
                        Char.getMyChar().arrItemBag[GameScr.Class76[l].indexUI] = GameScr.Class76[l];
                        GameScr.Class76[l] = null;
                    }
                }
            }
            if (GameScr.Class89 && GameScr.Class86 != null) {
                Char.getMyChar().arrItemBag[GameScr.Class86.indexUI] = GameScr.Class86;
                GameScr.Class86 = null;
            }
            if (GameScr.Class231 && GameScr.Class80 != null) {
                for (int n = 0; n < GameScr.Class80.length; ++n) {
                    if (GameScr.Class80[n] != null) {
                        Char.getMyChar().arrItemBag[GameScr.Class80[n].indexUI] = GameScr.Class80[n];
                        GameScr.Class80[n] = null;
                    }
                }
            }
            if (GameScr.Class235 || GameScr.Class244 || GameScr.Class243 || GameScr.Class245) {
                if (GameScr.Class85 != null) {
                    Char.getMyChar().arrItemBag[GameScr.Class85.indexUI] = GameScr.Class85;
                    GameScr.Class85 = null;
                }
                if (GameScr.Class77 != null) {
                    for (int n2 = 0; n2 < GameScr.Class77.length; ++n2) {
                        if (GameScr.Class77[n2] != null) {
                            if (GameScr.Class243 || GameScr.Class244 || GameScr.Class245) {
                                Char.getMyChar().arrItemBag[GameScr.Class77[n2].indexUI] = GameScr.Class77[n2];
                            }
                            GameScr.Class77[n2] = null;
                        }
                    }
                }
            }
            if (GameScr.Class250 && GameScr.Class77 != null) {
                for (int n3 = 0; n3 < GameScr.Class77.length; ++n3) {
                    if (GameScr.Class77[n3] != null) {
                        Char.getMyChar().arrItemBag[GameScr.Class77[n3].indexUI] = GameScr.Class77[n3];
                        GameScr.Class77[n3] = null;
                    }
                }
            }
            if (GameScr.isPaintTrade) {
                InfoDlg.hide();
                if (this.coinTrade > 0) {
                    final Char myChar = Char.getMyChar();
                    myChar.xu += this.coinTrade;
                }
                if (GameScr.arrItemTradeMe != null) {
                    for (int n4 = 0; n4 < GameScr.arrItemTradeMe.length; ++n4) {
                        if (GameScr.arrItemTradeMe[n4] != null) {
                            Char.getMyChar().arrItemBag[GameScr.arrItemTradeMe[n4].indexUI] = GameScr.arrItemTradeMe[n4];
                            GameScr.arrItemTradeMe[n4] = null;
                        }
                    }
                }
                if (GameScr.arrItemTradeOrder != null) {
                    for (int n5 = 0; n5 < GameScr.arrItemTradeOrder.length; ++n5) {
                        GameScr.arrItemTradeOrder[n5] = null;
                    }
                }
            }
            if ((GameScr.Class247 || GameScr.Class248) && GameScr.Class85 != null) {
                Char.getMyChar().arrItemBag[GameScr.Class85.indexUI] = GameScr.Class85;
                GameScr.Class85 = null;
            }
        }
        if (GameScr.TuDong || GameScr.ItemNhat || GameScr.ItemBan || GameScr.ItemVut) {
            Selection.savedata();
        }
        if (GameScr.isPaintTrade) {
            Service.gI().cancelTrade();
        }
        GameCanvas.Class30.Class1 = false;
        final Game23 class1;
        (class1 = Game23.Class1()).Class1.setText("");
        class1.Class2 = false;
        Game23.Class1().Class6 = null;
        if (!GameCanvas.Class6) {
            GameScr.Class208 = false;
        }
        GameScr.Class88 = false;
        GameScr.Class232 = false;
        this.isLockKey = false;
        GameScr.isPaintZone = false;
        GameScr.TuDong = false;
        GameScr.ItemNhat = false;
        GameScr.ItemBan = false;
        GameScr.ItemVut = false;
        GameScr.Class93 = false;
        GameScr.Class92 = false;
        GameScr.Class203 = false;
        GameScr.Class204 = false;
        GameScr.Class96 = false;
        GameScr.Class238 = false;
        GameScr.Class240 = false;
        GameScr.Class239 = false;
        GameScr.Class236 = false;
        GameScr.Class205 = false;
        GameScr.Class91 = false;
        GameScr.Class241 = false;
        GameScr.Class206 = false;
        GameScr.Class202 = false;
        GameScr.Class207 = false;
        GameScr.isPaintAlert = false;
        GameScr.Class249 = false;
        this.typeTrade = 0;
        GameScr.Class209 = false;
        GameScr.Class210 = false;
        GameScr.Class211 = false;
        GameScr.Class212 = false;
        GameScr.Class213 = false;
        GameScr.Class214 = false;
        GameScr.Class215 = false;
        GameScr.Class216 = false;
        GameScr.Class217 = false;
        GameScr.Class218 = false;
        GameScr.Class219 = false;
        GameScr.Class220 = false;
        GameScr.Class221 = false;
        GameScr.Class222 = false;
        GameScr.Class223 = false;
        GameScr.Class224 = false;
        GameScr.Class225 = false;
        GameScr.Class226 = false;
        GameScr.Class227 = false;
        GameScr.Class228 = false;
        GameScr.Class229 = false;
        GameScr.Class230 = false;
        GameScr.Class89 = false;
        GameScr.Class231 = false;
        GameScr.Class235 = (GameScr.Class243 = (GameScr.Class244 = false));
        GameScr.isPaintTrade = false;
        GameScr.Class233 = (GameScr.Class242 = false);
        GameScr.Class234 = false;
        GameScr.Class246 = false;
        GameScr.Class245 = false;
        GameScr.Class250 = false;
        GameScr.Class247 = false;
        GameScr.Class248 = false;
        GameScr.indexMenu = 0;
        GameScr.indexSelect = 0;
        this.Class258 = -1;
        GameScr.indexRow = -1;
        GameScr.Class194 = 0;
        GameScr.Class193 = 0;
        final int n6 = 0;
        this.typeTradeOrder = n6;
        this.typeTrade = n6;
        super.left = this.Class286;
        super.right = this.Class184;
        final int[] array = null;
        this.Class282 = array;
        this.Class281 = array;
        super.center = null;
        if (Char.getMyChar().cHP <= 0 || Char.getMyChar().statusMe == 14 || Char.getMyChar().statusMe == 5) {
            if (GameCanvas.Class8) {
                this.Class162.Class1 = "";
            }
            super.center = this.Class162;
        }
        GameScr.Class50.Class1();
    }
    
    public final void Class1(final int n) {
        if (this.Class262 != null && this.Class262.Class5) {
            this.Class262.Class1(n);
        }
        super.Class1(n);
    }
    
    public final void Class5() {
        if (GameCanvas.Class30.Class1) {
            return;
        }
        if (InfoDlg.Class5) {
            return;
        }
        Label_1744: {
            if (GameCanvas.Class6 && !Game23.Class1().Class2 && !GameCanvas.Class30.Class1) {
                int n = -1;
                if (GameCanvas.Class15) {
                    for (int i = 0; i < this.Class279.length; ++i) {
                        if (GameCanvas.Class2(this.Class279[i], this.Class280[i], 100, 12) && GameCanvas.Class16) {
                            n = i;
                            break;
                        }
                    }
                }
                Label_0322: {
                    final int n2;
                    if ((n2 = n) != -1 && !Class83() && !Class27() && !Class85()) {
                        if (n2 == 0) {
                            if (ChatManager.gI().Class8.size() > 0) {
                                final ChatManager gi = ChatManager.gI();
                                int j = 3;
                            Label_0244:
                                while (true) {
                                    while (j < gi.Class1.size()) {
                                        final Game44 game44 = (Game44)gi.Class1.elementAt(j);
                                        for (int k = 0; k < gi.Class8.size(); ++k) {
                                            if (game44.Class2.equals(gi.Class8.elementAt(k).toString())) {
                                                final int n3 = j;
                                                break Label_0244;
                                            }
                                        }
                                        ++j;
                                        continue;
                                        int n3 = 0;
                                        ChatManager.gI().Class1(n3);
                                        this.Class166();
                                        this.Class279[0] = (this.Class280[0] = -1);
                                        break Label_0322;
                                    }
                                    final int n3 = -1;
                                    continue Label_0244;
                                }
                            }
                        }
                        else {
                            if (ChatManager.Class7) {
                                ChatManager.gI().Class1(1);
                            }
                            else if (ChatManager.Class6) {
                                ChatManager.gI().Class1(3);
                            }
                            this.Class166();
                            this.Class279[1] = (this.Class280[1] = -1);
                        }
                    }
                }
                boolean b = false;
                mScreen.Class7 = -1;
                if (GameCanvas.Class2(TileMap.Class18, TileMap.Class19, TileMap.wMiniMap, TileMap.hMiniMap) && GameCanvas.Class15 && GameCanvas.Class16) {
                    Class65();
                    b = true;
                }
                if (GameCanvas.Class6 && (!GameCanvas.Class30.Class1 || !GameCanvas.Class8)) {
                    if (GameCanvas.Class34 == null && ChatPopup.Class6 == null && !GameCanvas.Class30.Class1 && !Class83()) {
                        if (GameCanvas.Class2(GameScr.Class301, GameScr.Class302, 34, 34)) {
                            mScreen.Class7 = 15;
                            if (GameCanvas.Class15 && GameCanvas.Class16) {
                                Game23.Class1().setText(Game86.Class400[0]);
                                b = true;
                                GameCanvas.Class16 = false;
                                GameCanvas.Class15 = false;
                            }
                        }
                        if (!this.Class84()) {
                            if (!Char.getMyChar().Class4) {
                                if (GameCanvas.Class2(GameScr.Class307, GameScr.Class308, 34, 34)) {
                                    mScreen.Class7 = 3;
                                    GameCanvas.Class13[2] = true;
                                    this.Class67();
                                    b = true;
                                }
                                else if (GameCanvas.Class14) {
                                    GameCanvas.Class13[2] = false;
                                }
                                if (GameCanvas.Class2(GameScr.Class307 - 30, GameScr.Class308, 30, 34)) {
                                    GameCanvas.Class13[1] = true;
                                    this.Class67();
                                    b = true;
                                }
                                else if (GameCanvas.Class14) {
                                    GameCanvas.Class13[1] = false;
                                }
                                if (GameCanvas.Class2(GameScr.Class307 + 34, GameScr.Class308, 30, 34)) {
                                    GameCanvas.Class13[3] = true;
                                    this.Class67();
                                    b = true;
                                }
                                else if (GameCanvas.Class14) {
                                    GameCanvas.Class13[3] = false;
                                }
                                if (GameCanvas.Class2(GameScr.Class299, GameScr.Class300, 34, 34)) {
                                    mScreen.Class7 = 4;
                                    GameCanvas.Class13[4] = true;
                                    this.Class67();
                                    b = true;
                                }
                                else if (GameCanvas.Class14) {
                                    GameCanvas.Class13[4] = false;
                                }
                                if (GameCanvas.Class2(GameScr.Class303 - 5, GameScr.Class304, 40, 34)) {
                                    mScreen.Class7 = 6;
                                    GameCanvas.Class13[6] = true;
                                    this.Class67();
                                    b = true;
                                }
                                else if (GameCanvas.Class14) {
                                    GameCanvas.Class13[6] = false;
                                }
                                if (GameCanvas.Class2(GameScr.Class305, GameScr.Class306, 54, 54)) {
                                    GameCanvas.Class13[5] = true;
                                    mScreen.Class7 = 5;
                                    if (GameCanvas.Class16) {
                                        GameCanvas.Class12[5] = true;
                                        b = true;
                                    }
                                }
                            }
                            else {
                                if (GameCanvas.Class3(GameScr.Class299, GameScr.Class300, 34, 34) && GameCanvas.Class16) {
                                    this.Class5((byte)0);
                                    GameCanvas.Class8();
                                }
                                if (GameCanvas.Class3(GameScr.Class307, GameScr.Class308, 34, 34) && GameCanvas.Class16) {
                                    this.Class5((byte)1);
                                    GameCanvas.Class8();
                                }
                                if (GameCanvas.Class3(GameScr.Class303 - 5, GameScr.Class304, 40, 34) && GameCanvas.Class16) {
                                    this.Class5((byte)2);
                                    GameCanvas.Class8();
                                }
                            }
                            if (Char.getMyChar().ctaskId > 1) {
                                if (GameCanvas.Class2(GameScr.Class311, GameScr.Class312, 34, 34)) {
                                    mScreen.Class7 = 11;
                                    if (GameCanvas.Class15 && GameCanvas.Class16) {
                                        GameCanvas.Class12[11] = true;
                                        b = true;
                                    }
                                }
                                if (GameCanvas.Class2(GameScr.Class309, GameScr.Class310, 34, 34)) {
                                    mScreen.Class7 = 10;
                                    if (GameCanvas.Class15 && GameCanvas.Class16) {
                                        GameCanvas.Class12[10] = true;
                                        b = true;
                                    }
                                }
                                if (GameCanvas.Class2(GameScr.Class313, GameScr.Class314, 34, 34)) {
                                    mScreen.Class7 = 13;
                                    if (GameCanvas.Class15 && GameCanvas.Class16) {
                                        Char.getMyChar().Class21();
                                        b = true;
                                    }
                                }
                            }
                            if (Char.getMyChar().vSkill.size() >= 2 && (GameCanvas.Class2(GameScr.xSkill + GameScr.xS[0], GameScr.yS[0], GameScr.Class285.length * 30, 30) || (!GameCanvas.Class7 && GameCanvas.Class2(GameScr.xSkill + GameScr.xS[0], GameScr.yS[0], 30, GameScr.Class285.length * 25))) && GameCanvas.Class15 && GameCanvas.Class16) {
                                int class295;
                                if (!GameCanvas.Class7) {
                                    class295 = (GameCanvas.Class20 - (GameScr.Class318 + GameScr.yS[0])) / 25;
                                }
                                else {
                                    class295 = (GameCanvas.Class19 - (GameScr.xSkill + GameScr.xS[0])) / 30;
                                }
                                this.Class295 = class295;
                                if (GameScr.indexSelect < 0) {
                                    GameScr.indexSelect = 0;
                                }
                                if (this.Class295 > GameScr.Class285.length - 1) {
                                    this.Class295 = GameScr.Class285.length - 1;
                                }
                                b = true;
                                this.Class1(GameScr.Class285[this.Class295], false, true);
                                this.Class188 = true;
                            }
                            if (GameCanvas.Class16) {
                                GameCanvas.Class13[1] = false;
                                GameCanvas.Class13[2] = false;
                                GameCanvas.Class13[3] = false;
                                GameCanvas.Class13[4] = false;
                                GameCanvas.Class13[6] = false;
                            }
                            if (!b) {
                                if (!Class83() && !Class27() && !Class85()) {
                                    if (GameCanvas.Class15) {
                                        for (int l = 0; l < GameScr.vMob.size(); ++l) {
                                            final Mob mobFocus;
                                            if ((mobFocus = (Mob)GameScr.vMob.elementAt(l)).Class3() && GameCanvas.Class1(mobFocus.x - mobFocus.Class11 / 2, mobFocus.y - mobFocus.Class12, mobFocus.Class11, mobFocus.Class12) && GameCanvas.Class16) {
                                                Char.getMyChar().mobFocus = mobFocus;
                                                Char.getMyChar().Class22();
                                                Char.getMyChar().charFocus = null;
                                                Char.getMyChar().itemFocus = null;
                                                Char.Class165 = true;
                                                break Label_1744;
                                            }
                                        }
                                        for (int n4 = 0; n4 < GameScr.vNpc.size(); ++n4) {
                                            final Npc npcFocus;
                                            if ((npcFocus = (Npc)GameScr.vNpc.elementAt(n4)).Class17() && GameCanvas.Class1(npcFocus.cx - npcFocus.Class58 / 2, npcFocus.cy - npcFocus.Class59, npcFocus.Class58, npcFocus.Class59) && GameCanvas.Class16) {
                                                Char.getMyChar().mobFocus = null;
                                                Char.getMyChar().Class22();
                                                Char.getMyChar().npcFocus = npcFocus;
                                                Char.getMyChar().charFocus = null;
                                                Char.getMyChar().itemFocus = null;
                                                Char.Class165 = true;
                                                break Label_1744;
                                            }
                                        }
                                        for (int n5 = 0; n5 < GameScr.vCharInMap.size(); ++n5) {
                                            final Char charFocus;
                                            if ((charFocus = (Char)GameScr.vCharInMap.elementAt(n5)).Class17() && !charFocus.Class28() && GameCanvas.Class1(charFocus.cx - charFocus.Class58 / 2, charFocus.cy - charFocus.Class59, charFocus.Class58, charFocus.Class59) && GameCanvas.Class16) {
                                                Char.getMyChar().mobFocus = null;
                                                Char.getMyChar().Class22();
                                                Char.getMyChar().charFocus = charFocus;
                                                Char.getMyChar().itemFocus = null;
                                                Char.Class165 = true;
                                                break Label_1744;
                                            }
                                        }
                                        for (int n6 = 0; n6 < GameScr.vItemMap.size(); ++n6) {
                                            final ItemMap itemFocus;
                                            if (GameCanvas.Class1((itemFocus = (ItemMap)GameScr.vItemMap.elementAt(n6)).x - 12, itemFocus.y - 24, 24, 24) && GameCanvas.Class16) {
                                                Char.getMyChar().mobFocus = null;
                                                Char.getMyChar().Class22();
                                                Char.getMyChar().charFocus = null;
                                                Char.getMyChar().itemFocus = itemFocus;
                                                Char.Class165 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Label_2131: {
            if (TileMap.mapID != 130 && !Class68()) {
                final long currentTimeMillis = System.currentTimeMillis();
                if (GameCanvas.Class12[2] || GameCanvas.Class12[4] || GameCanvas.Class12[6] || GameCanvas.Class12[1] || GameCanvas.Class12[3]) {
                    GameScr.Class154 = 0;
                    if (this.Class155) {
                        Char.getMyChar().Class135 = false;
                        this.Class155 = false;
                    }
                }
                if (GameCanvas.Class12[5] && !Class83()) {
                    if (GameScr.Class154 == 0) {
                        if (currentTimeMillis - this.Class293 < 800L && ((Char.getMyChar().myskill == null || Char.getMyChar().cMP >= Char.getMyChar().myskill.Class10) && Char.getMyChar().myskill != null && (Char.getMyChar().myskill.template.Class3 <= 0 || Char.getMyChar().myskill.Class3 != 0) && Char.getMyChar().arrItemBody[1] != null) && Char.getMyChar().mobFocus != null) {
                            GameScr.Class154 = 10;
                            GameCanvas.Class12[5] = false;
                        }
                    }
                    else {
                        if (!this.Class155 && Char.getMyChar().statusMe != 14) {
                            this.Class155 = !this.Class155;
                            Char.getMyChar().Class135 = !Char.getMyChar().Class135;
                            this.Class293 = currentTimeMillis;
                            break Label_2131;
                        }
                        GameScr.Class154 = 0;
                        if (this.Class155) {
                            Char.getMyChar().Class135 = false;
                            this.Class155 = false;
                        }
                        GameCanvas.Class12[4] = (GameCanvas.Class12[6] = false);
                    }
                    this.Class293 = currentTimeMillis;
                }
                if (GameCanvas.gameTick % 10 == 0 && GameScr.Class154 > 0 && (Char.getMyChar().mobFocus != null || Char.getMyChar().itemFocus != null)) {
                    this.Class2(true);
                }
                if (GameScr.Class154 > 1) {
                    --GameScr.Class154;
                }
            }
        }
        if (GameCanvas.Class6) {
            if (GameCanvas.Class14 && !GameCanvas.Class16) {
                if (GameCanvas.Class2(GameScr.Class313, GameScr.Class314, 34, 34) && !GameScr.Class236 && GameCanvas.Class15 && GameCanvas.Class6()) {
                    this.Class61();
                }
            }
        }
        else if (GameCanvas.Class13[13] && !GameScr.Class236 && GameCanvas.Class6()) {
            this.Class61();
        }
        if (ChatPopup.Class6 != null) {
            final Command class296 = ChatPopup.Class6.Class5;
            if ((GameCanvas.Class12[5] || mScreen.Class1(class296)) && class296 != null) {
                GameCanvas.Class16 = false;
                GameCanvas.Class12[5] = false;
                mScreen.Class7 = -1;
                if (class296 != null) {
                    class296.Class1();
                }
            }
        }
        else if (!Game23.Class1().Class2) {
            if (mScreen.Class7 != -1 && GameCanvas.Class2(GameScr.Class299, GameScr.Class300, 34, 34)) {
                GameCanvas.Class16 = false;
            }
            if (mScreen.Class7 != -1 && GameCanvas.Class2(GameScr.Class303, GameScr.Class304, 34, 34)) {
                GameCanvas.Class16 = false;
            }
            if (mScreen.Class7 != -1 && GameCanvas.Class2(GameScr.Class307, GameScr.Class308, 34, 34)) {
                GameCanvas.Class16 = false;
            }
            if ((GameCanvas.Class12[12] || mScreen.Class1(GameCanvas.Class29.left)) && super.left != null) {
                GameCanvas.Class16 = false;
                GameCanvas.Class15 = false;
                GameCanvas.Class12[12] = false;
                mScreen.Class7 = -1;
                if (super.left != null) {
                    super.left.Class1();
                }
            }
            if ((GameCanvas.Class12[13] || mScreen.Class1(GameCanvas.Class29.right)) && super.right != null) {
                GameCanvas.Class16 = false;
                GameCanvas.Class15 = false;
                GameCanvas.Class12[13] = false;
                mScreen.Class7 = -1;
                if (super.right != null) {
                    super.right.Class1();
                }
            }
            if ((GameCanvas.Class12[5] || mScreen.Class1(GameCanvas.Class29.center)) && super.center != null) {
                GameCanvas.Class16 = false;
                GameCanvas.Class12[5] = false;
                mScreen.Class7 = -1;
                if (super.center != null) {
                    super.center.Class1();
                }
            }
        }
        else {
            if (Game23.Class1().Class4 != null && (GameCanvas.Class12[12] || mScreen.Class1(Game23.Class1().Class4)) && Game23.Class1().Class4 != null) {
                Game23.Class1().Class4.Class1();
            }
            if (Game23.Class1().Class5 != null && (GameCanvas.Class12[13] || mScreen.Class1(Game23.Class1().Class5)) && Game23.Class1().Class5 != null) {
                Game23.Class1().Class5.Class1();
            }
            if (Game23.Class1().Class6 != null && (GameCanvas.Class12[5] || mScreen.Class1(Game23.Class1().Class6)) && Game23.Class1().Class6 != null) {
                Game23.Class1().Class6.Class1();
            }
        }
        if (GameScr.isPaintZone && GameCanvas.Class34 == null) {
            boolean b2 = false;
            if (GameCanvas.Class12[4]) {
                if (--GameScr.indexSelect < 0) {
                    GameScr.indexSelect = this.zones.length - 1;
                }
                b2 = true;
            }
            else if (GameCanvas.Class12[6]) {
                if (++GameScr.indexSelect >= this.zones.length) {
                    GameScr.indexSelect = 0;
                }
                b2 = true;
            }
            else if (GameCanvas.Class12[8]) {
                if (GameScr.indexSelect + this.Class252 <= this.zones.length - 1) {
                    GameScr.indexSelect += this.Class252;
                }
                b2 = true;
            }
            else if (GameCanvas.Class12[2]) {
                if (GameScr.indexSelect - this.Class252 >= 0) {
                    GameScr.indexSelect -= this.Class252;
                }
                b2 = true;
            }
            if (b2) {
                GameScr.Class50.Class1(GameScr.indexSelect / GameScr.Class400 * GameScr.Class50.Class8);
                GameCanvas.Class8();
                GameCanvas.Class7();
            }
            final Game68 class297;
            if (GameCanvas.Class6 && ((class297 = GameScr.Class50.Class2()).Class1 || class297.Class3)) {
                GameScr.indexSelect = class297.Class2;
            }
        }
        Label_4068: {
            if (GameScr.Class202 || GameScr.Class204 || GameScr.Class205 || GameScr.Class91 || GameScr.Class207 || GameScr.Class236 || GameScr.Class206 || GameScr.Class241) {
                if (GameScr.Class241) {
                    final Game68 class298;
                    if (GameScr.Class241 && ((class298 = GameScr.Class50.Class2()).Class1 || class298.Class3)) {
                        if ((GameScr.indexSelect = class298.Class2) >= GameScr.Class81.length) {
                            GameScr.indexSelect = -1;
                        }
                        if (GameScr.indexSelect >= 0) {
                            GameScr.Class193 = 1;
                        }
                        this.Class29();
                    }
                }
                else {
                    if (GameScr.Class204) {
                        if (GameScr.vParty.size() == 0) {
                            break Label_4068;
                        }
                        if (GameCanvas.Class12[8]) {
                            if (++GameScr.indexRow >= GameScr.vParty.size()) {
                                GameScr.indexRow = GameScr.vParty.size() - 1;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        else if (GameCanvas.Class12[2]) {
                            if (--GameScr.indexRow < 0) {
                                GameScr.indexRow = 0;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        this.Class82();
                    }
                    else if (GameScr.Class205) {
                        if (GameCanvas.Class12[8]) {
                            if (++GameScr.indexRow >= GameScr.Class33.size()) {
                                GameScr.indexRow = GameScr.Class33.size() - 1;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        else if (GameCanvas.Class12[2]) {
                            if (--GameScr.indexRow < 0) {
                                GameScr.indexRow = 0;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        this.Class19();
                    }
                    else if (GameScr.Class91) {
                        if (GameCanvas.Class12[8]) {
                            if (++GameScr.indexRow >= GameScr.Class194) {
                                GameScr.indexRow = 0;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        else if (GameCanvas.Class12[2]) {
                            if (--GameScr.indexRow < 0) {
                                GameScr.indexRow = GameScr.Class194 - 1;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        this.Class81();
                    }
                    else if (GameScr.Class207) {
                        if (GameCanvas.Class12[8]) {
                            if (++GameScr.indexRow >= GameScr.Class194) {
                                GameScr.indexRow = 0;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        else if (GameCanvas.Class12[2]) {
                            if (--GameScr.indexRow < 0) {
                                GameScr.indexRow = GameScr.Class194 - 1;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        this.Class80();
                    }
                    else if (GameScr.Class236) {
                        if (GameCanvas.Class12[8]) {
                            if (++GameScr.indexRow >= GameScr.vCharInMap.size()) {
                                GameScr.indexRow = GameScr.vCharInMap.size() - 1;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        else if (GameCanvas.Class12[2]) {
                            if (--GameScr.indexRow < 0) {
                                GameScr.indexRow = 0;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        if (this.Class114 > 0 && !GameCanvas.Class6) {
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        this.Class77();
                    }
                    else if (GameScr.Class206) {
                        if (GameCanvas.Class12[8]) {
                            if (++GameScr.indexRow >= GameScr.Class35.size()) {
                                GameScr.indexRow = GameScr.Class35.size() - 1;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        else if (GameCanvas.Class12[2]) {
                            if (--GameScr.indexRow < 0) {
                                GameScr.indexRow = 0;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        this.Class79();
                    }
                    else if (GameScr.Class202) {
                        if (GameCanvas.Class12[8]) {
                            if (++GameScr.indexRow >= GameScr.Class35.size()) {
                                GameScr.indexRow = GameScr.Class35.size() - 1;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        else if (GameCanvas.Class12[2]) {
                            if (--GameScr.indexRow < 0) {
                                GameScr.indexRow = 0;
                            }
                            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                        }
                        this.Class78();
                    }
                    if (GameCanvas.Class6 && GameCanvas.Class34 == null && !GameCanvas.Class30.Class1) {
                        Vector vector = null;
                        if (GameScr.Class204) {
                            vector = GameScr.vParty;
                        }
                        else if (GameScr.Class91) {
                            vector = GameScr.Class34;
                        }
                        else if (GameScr.Class207) {
                            vector = GameScr.Class37;
                        }
                        else if (GameScr.Class205) {
                            vector = GameScr.Class33;
                        }
                        else if (GameScr.Class236) {
                            vector = GameScr.vCharInMap;
                        }
                        else if (GameScr.Class206) {
                            vector = GameScr.Class35;
                        }
                        else if (GameScr.Class202) {
                            vector = GameScr.Class35;
                        }
                        final Game68 class299;
                        if ((class299 = GameScr.Class50.Class2()).Class1 || class299.Class3) {
                            if ((GameScr.indexRow = class299.Class2) >= vector.size()) {
                                GameScr.indexRow = -1;
                            }
                            if (GameScr.Class204) {
                                this.Class82();
                            }
                            else if (GameScr.Class91) {
                                this.Class81();
                            }
                            else if (GameScr.Class207) {
                                this.Class80();
                            }
                            else if (GameScr.Class236) {
                                this.Class77();
                            }
                            else if (GameScr.Class206) {
                                this.Class79();
                            }
                            else if (GameScr.Class202) {
                                this.Class78();
                            }
                        }
                    }
                    GameCanvas.Class8();
                    GameCanvas.Class7();
                }
            }
        }
        this.Class28();
        this.Class72();
        if (GameScr.Class238) {
            if (GameScr.Class193 == 0) {
                if (GameCanvas.Class12[8]) {
                    if (Char.Class57 == null) {
                        GameScr.Class193 = 0;
                    }
                    else {
                        GameScr.Class193 = 1;
                    }
                    GameScr.indexSelect = 0;
                    GameScr.indexRow = -1;
                    if (GameScr.indexMenu == 0) {
                        GameScr.indexSelect = Char.Class57.Class5;
                    }
                    GameScr.Class50.Class1();
                    GameScr.Class196.Class1();
                }
                if (GameCanvas.Class12[4]) {
                    GameScr.indexSelect = 0;
                    GameScr.indexRow = -1;
                    --GameScr.indexMenu;
                    GameScr.Class50.Class1();
                    GameScr.Class196.Class1();
                    if (GameScr.indexMenu < 0) {
                        GameScr.indexMenu = Game86.Class346.length - 1;
                    }
                    if (GameScr.indexMenu >= Game86.Class346.length) {
                        GameScr.indexMenu = 0;
                    }
                    if (GameScr.indexMenu == 1 && GameScr.Class239) {
                        Service.gI().Class21();
                        GameScr.Class239 = false;
                    }
                    else if (GameScr.indexMenu == 2) {
                        Service.gI().Class22();
                    }
                    else if (GameScr.indexMenu == 3) {
                        Service.gI().Class23();
                    }
                    else if (GameScr.indexMenu == 4) {
                        Service.gI().Class22();
                    }
                    setPopupSize(175, 200);
                }
                if (GameCanvas.Class12[6]) {
                    GameScr.indexSelect = 0;
                    GameScr.indexRow = -1;
                    ++GameScr.indexMenu;
                    GameScr.Class50.Class1();
                    GameScr.Class196.Class1();
                    if (GameScr.indexMenu < 0) {
                        GameScr.indexMenu = Game86.Class346.length - 1;
                    }
                    if (GameScr.indexMenu >= Game86.Class346.length) {
                        GameScr.indexMenu = 0;
                    }
                    if (GameScr.indexMenu == 1 && GameScr.Class239) {
                        Service.gI().Class21();
                        GameScr.Class239 = false;
                    }
                    else if (GameScr.indexMenu == 2) {
                        Service.gI().Class22();
                    }
                    else if (GameScr.indexMenu == 3) {
                        Service.gI().Class23();
                    }
                    else if (GameScr.indexMenu == 4) {
                        Service.gI().Class22();
                    }
                    setPopupSize(175, 200);
                }
                this.Class74();
            }
            else if (GameScr.Class92) {
                if (GameCanvas.Class12[2]) {
                    if (--GameScr.indexRow < 0) {
                        GameScr.indexRow = GameScr.Class194 - 1;
                    }
                    GameScr.Class196.Class1(GameScr.indexRow * GameScr.Class196.Class8);
                }
                else if (GameCanvas.Class12[8]) {
                    if (++GameScr.indexRow >= GameScr.Class194) {
                        GameScr.indexRow = 0;
                    }
                    GameScr.Class196.Class1(GameScr.indexRow * GameScr.Class196.Class8);
                }
            }
            else {
                if (GameScr.indexRow < 0) {
                    GameScr.indexRow = 0;
                }
                if (GameScr.indexMenu == 2) {
                    if (Char.Class57 != null && Char.Class57.Class16 != null) {
                        if (GameCanvas.Class12[4]) {
                            if (--GameScr.indexSelect < 0) {
                                GameScr.indexSelect = Char.Class57.Class16.length - 1;
                            }
                        }
                        else if (GameCanvas.Class12[6]) {
                            if (++GameScr.indexSelect >= Char.Class57.Class16.length) {
                                GameScr.indexSelect = 0;
                            }
                        }
                        else if (GameCanvas.Class12[8]) {
                            if (GameScr.indexSelect + GameScr.Class400 <= Char.Class57.Class16.length - 1) {
                                GameScr.indexSelect += GameScr.Class400;
                            }
                        }
                        else if (GameCanvas.Class12[2]) {
                            if (GameScr.indexSelect >= 0 && GameScr.indexSelect < GameScr.Class400) {
                                GameScr.Class193 = 0;
                                GameScr.indexSelect = 0;
                            }
                            else if (GameScr.indexSelect - GameScr.Class400 >= 0) {
                                GameScr.indexSelect -= GameScr.Class400;
                            }
                        }
                        GameScr.Class50.Class1(GameScr.indexSelect / GameScr.Class400 * GameScr.Class50.Class8);
                    }
                }
                else if (GameScr.indexMenu == 0 && GameScr.Class193 == 1) {
                    if (GameCanvas.Class12[8]) {
                        ++GameScr.Class193;
                    }
                    else if (GameCanvas.Class12[2]) {
                        --GameScr.Class193;
                    }
                }
                else if (GameScr.indexMenu == 4) {
                    if (GameCanvas.Class12[2]) {
                        if (GameScr.indexRow == 0) {
                            --GameScr.Class193;
                            GameScr.indexRow = -1;
                        }
                        else {
                            --GameScr.indexRow;
                        }
                        GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                    }
                    else if (GameCanvas.Class12[8]) {
                        if (++GameScr.indexRow >= GameScr.Class194) {
                            GameScr.indexRow = 0;
                        }
                        GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                    }
                    else if (GameCanvas.Class12[4]) {
                        --this.Class439;
                        if (this.Class439 < 0) {
                            this.Class439 = 0;
                        }
                    }
                    else if (GameCanvas.Class12[6]) {
                        ++this.Class439;
                        if (this.Class439 > this.Class169.size() - 1) {
                            this.Class439 = (byte)(this.Class169.size() - 1);
                        }
                    }
                }
                else if (GameCanvas.Class12[2]) {
                    if (GameScr.indexRow == 0) {
                        --GameScr.Class193;
                        GameScr.indexRow = -1;
                    }
                    else {
                        --GameScr.indexRow;
                    }
                    GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                    if (GameScr.indexMenu == 1 && GameScr.Class239) {
                        Service.gI().Class21();
                        GameScr.Class239 = false;
                    }
                }
                else if (GameCanvas.Class12[8]) {
                    if (++GameScr.indexRow >= GameScr.Class194) {
                        GameScr.indexRow = 0;
                    }
                    GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                }
                this.Class74();
            }
            Label_5851: {
                if (GameCanvas.Class6) {
                    if (GameCanvas.Class34 == null && !GameCanvas.Class30.Class1) {
                        if (GameCanvas.Class16) {
                            if (GameCanvas.Class2(GameScr.Class157, GameScr.Class156, GameScr.Class158, this.Class418) && (!GameScr.Class92 || GameCanvas.Class25 >= 320) && GameCanvas.Class15) {
                                if (GameCanvas.Class2(GameScr.Class11 - 90, GameScr.Class156 + 5, 60, 40)) {
                                    GameScr.indexSelect = 0;
                                    --GameScr.indexMenu;
                                    GameScr.indexRow = 0;
                                }
                                if (GameCanvas.Class2(GameScr.Class11 + 20, GameScr.Class156 + 5, 60, 40)) {
                                    GameScr.indexSelect = 0;
                                    ++GameScr.indexMenu;
                                    GameScr.indexRow = 0;
                                }
                                GameScr.Class92 = false;
                                GameScr.Class50.Class1();
                                GameScr.Class196.Class1();
                                if (GameScr.indexMenu < 0) {
                                    GameScr.indexMenu = Game86.Class346.length - 1;
                                }
                                if (GameScr.indexMenu > Game86.Class346.length - 1) {
                                    GameScr.indexMenu = 0;
                                }
                                GameScr.Class193 = 1;
                                if (GameScr.indexMenu == 1 && GameScr.Class239) {
                                    Service.gI().Class21();
                                    GameScr.Class239 = false;
                                }
                                else if (GameScr.indexMenu == 2 && Char.Class57 != null && Char.Class57.Class16 == null) {
                                    Service.gI().Class22();
                                }
                                if (GameScr.indexMenu == 3) {
                                    Service.gI().Class23();
                                }
                                if (GameScr.indexMenu == 4) {
                                    Service.gI().Class22();
                                }
                                setPopupSize(175, 200);
                                this.Class74();
                            }
                            if (GameScr.indexMenu == 4) {
                                final int n7 = this.Class448 - this.Class450 / 2;
                                final int n8;
                                if (GameCanvas.Class2(n7, this.Class449 - this.Class450 / 2, (this.Class450 + 5) * this.Class169.size(), this.Class450) && (n8 = (GameCanvas.Class17 - n7) / (this.Class450 + 5)) >= 0 && n8 < this.Class169.size()) {
                                    this.Class439 = (byte)n8;
                                }
                            }
                        }
                        if (GameScr.Class92) {
                            final Game68 class300;
                            if ((class300 = GameScr.Class196.Class2()).Class1 || class300.Class3) {
                                GameScr.indexRow = class300.Class2;
                                GameScr.Class193 = 1;
                            }
                            if (GameCanvas.Class8) {
                                break Label_5851;
                            }
                        }
                        if (GameScr.indexMenu == 2) {
                            final Game68 class301;
                            if ((class301 = GameScr.Class50.Class2()).Class1 || class301.Class3) {
                                GameScr.indexSelect = class301.Class2;
                                GameScr.Class193 = 1;
                                this.Class2(1509, null);
                            }
                        }
                        else if (GameScr.indexMenu == 0 && GameCanvas.Class2(GameScr.Class157 + 18, GameScr.Class156 + 32, 5 * GameScr.Class192, GameScr.Class192) && GameCanvas.Class16 && GameCanvas.Class15) {
                            if (Char.Class57 != null) {
                                GameScr.indexSelect = Char.Class57.Class5;
                                GameScr.Class193 = 1;
                            }
                        }
                        else if (GameScr.indexMenu == 0 || GameScr.indexMenu == 3) {
                            final Game68 class302;
                            if (!GameScr.Class92 && ((class302 = GameScr.Class50.Class2()).Class1 || class302.Class3)) {
                                GameScr.indexRow = class302.Class2;
                                GameScr.Class193 = ((GameScr.indexMenu == 0) ? 2 : 1);
                                if (class302.Class3) {
                                    GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                                }
                            }
                        }
                        else {
                            final Game68 class303;
                            if (GameScr.indexMenu == 1 && GameScr.Class31.size() != 0 && ((class303 = GameScr.Class50.Class2()).Class1 || class303.Class3)) {
                                GameScr.indexRow = class303.Class2;
                                this.Class29();
                            }
                        }
                    }
                }
            }
            GameCanvas.Class8();
            GameCanvas.Class7();
        }
        if (GameScr.Class203) {
            if (GameScr.Class193 == 0) {
                if (GameScr.Class193 == 0 && GameCanvas.Class12[8]) {
                    GameScr.Class193 = 1;
                    GameScr.indexRow = -1;
                    GameScr.Class50.Class1();
                    GameScr.Class196.Class1();
                }
            }
            else {
                if (GameScr.indexRow < 0) {
                    GameScr.indexRow = 0;
                }
                if (GameCanvas.Class12[2]) {
                    if (GameScr.indexRow == 0) {
                        --GameScr.Class193;
                        GameScr.indexRow = -1;
                    }
                    else {
                        --GameScr.indexRow;
                    }
                    GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                }
                else if (GameCanvas.Class12[8]) {
                    if (++GameScr.indexRow >= GameScr.Class194) {
                        GameScr.indexRow = 0;
                    }
                    GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                }
            }
            final Game68 class304;
            if (GameCanvas.Class6 && ((class304 = GameScr.Class50.Class2()).Class1 || class304.Class3)) {
                GameScr.indexRow = class304.Class2;
                GameScr.Class193 = 1;
            }
        }
        this.Class75();
        this.Class76();
        if (Char.getMyChar().Class138 != null) {
            for (int n9 = 0; n9 < GameCanvas.Class12.length; ++n9) {
                if (GameCanvas.Class12[n9]) {
                    Char.getMyChar().Class138 = null;
                    break;
                }
            }
        }
        if (Game23.Class1().Class2 && GameCanvas.Class45 != 0) {
            final Game23 class305 = Game23.Class1();
            final int class306 = GameCanvas.Class45;
            final Game23 game45 = class305;
            if (class305.Class2) {
                game45.Class1.Class1(class306);
            }
            if (game45.Class1.getText().equals("")) {
                game45.Class5.Class1 = Game86.CLOSE;
            }
            else {
                game45.Class5.Class1 = Game86.Class49;
            }
            GameCanvas.Class45 = 0;
        }
        if (this.isLockKey) {
            GameCanvas.Class8();
            GameCanvas.Class7();
            return;
        }
        if (GameCanvas.Class30.Class1 || Class85() || Char.Class134) {
            return;
        }
        if (GameCanvas.Class12[10]) {
            GameCanvas.Class12[10] = false;
            Class24();
            GameCanvas.Class7();
        }
        if (GameCanvas.Class12[11]) {
            GameCanvas.Class12[11] = false;
            Class23();
            GameCanvas.Class7();
        }
        if (GameCanvas.Class45 != 0 && TField.Class19) {
            if (GameCanvas.Class45 == 32) {
                Class24();
                GameCanvas.Class45 = 0;
                GameCanvas.Class7();
            }
            else if (GameCanvas.Class45 == 64) {
                Class23();
                GameCanvas.Class45 = 0;
                GameCanvas.Class7();
            }
            else if (GameCanvas.Class45 == 48) {
                Class23();
                GameCanvas.Class45 = 0;
                GameCanvas.Class7();
            }
            else if (GameCanvas.Class45 == 63) {
                Class23();
                GameCanvas.Class45 = 0;
                GameCanvas.Class7();
            }
        }
        if (Char.getMyChar().Class150 != null) {
            return;
        }
        if (!Char.getMyChar().Class4) {
            if (Char.getMyChar().statusMe == 1) {
                if (GameCanvas.Class12[5]) {
                    this.Class2(GameCanvas.Class12[5] = false);
                }
                else if (GameCanvas.Class13[2]) {
                    if (!Char.getMyChar().Class135 && !Char.getMyChar().Class137) {
                        Class8(0);
                    }
                }
                else if (GameCanvas.Class13[1]) {
                    Char.getMyChar().Class15 = -1;
                    if (!Char.getMyChar().Class135 && !Char.getMyChar().Class137) {
                        Class8(-4);
                    }
                }
                else if (GameCanvas.Class13[3]) {
                    Char.getMyChar().Class15 = 1;
                    if (!Char.getMyChar().Class135 && !Char.getMyChar().Class137) {
                        Class8(4);
                    }
                }
                else if (GameCanvas.Class13[4]) {
                    Char.getMyChar();
                    if (Char.getMyChar().Class15 == 1) {
                        Char.getMyChar().Class15 = -1;
                    }
                    else if (!Char.getMyChar().Class135 && !Char.getMyChar().Class137) {
                        Char.getMyChar().statusMe = 2;
                        Char.getMyChar().Class11 = -Char.getMyChar().Class2();
                    }
                }
                else if (GameCanvas.Class13[6]) {
                    Char.getMyChar();
                    if (Char.getMyChar().Class15 == -1) {
                        Char.getMyChar().Class15 = 1;
                    }
                    else if (!Char.getMyChar().Class135 && !Char.getMyChar().Class137) {
                        Char.getMyChar().statusMe = 2;
                        Char.getMyChar().Class11 = Char.getMyChar().Class2();
                    }
                }
            }
            else if (Char.getMyChar().statusMe == 2) {
                if (GameCanvas.Class12[5]) {
                    this.Class2(GameCanvas.Class12[5] = false);
                }
                else if (GameCanvas.Class13[2]) {
                    Char.getMyChar().Class12 = (Char.getMyChar().Class60 ? -10 : -8);
                    Char.getMyChar().statusMe = 3;
                    Char.getMyChar().Class13 = 0;
                }
                else if (GameCanvas.Class13[1]) {
                    Char.getMyChar().Class15 = -1;
                    Char.getMyChar().Class12 = (Char.getMyChar().Class60 ? -10 : -8);
                    Char.getMyChar().Class11 = -4;
                    Char.getMyChar().statusMe = 3;
                    Char.getMyChar().Class13 = 0;
                }
                else if (GameCanvas.Class13[3]) {
                    Char.getMyChar().Class15 = 1;
                    Char.getMyChar().Class12 = (Char.getMyChar().Class60 ? -10 : -8);
                    Char.getMyChar().Class11 = 4;
                    Char.getMyChar().statusMe = 3;
                    Char.getMyChar().Class13 = 0;
                }
                else if (GameCanvas.Class13[4]) {
                    if (Char.getMyChar().Class15 == 1) {
                        Char.getMyChar().Class15 = -1;
                    }
                    else {
                        final Char myChar = Char.getMyChar();
                        final int class307 = -Char.getMyChar().Class2();
                        Char.getMyChar();
                        myChar.Class11 = class307;
                    }
                }
                else if (GameCanvas.Class13[6]) {
                    if (Char.getMyChar().Class15 == -1) {
                        Char.getMyChar().Class15 = 1;
                    }
                    else {
                        final Char myChar2 = Char.getMyChar();
                        final int class308 = Char.getMyChar().Class2();
                        Char.getMyChar();
                        myChar2.Class11 = class308;
                    }
                }
            }
            else if (Char.getMyChar().statusMe == 3) {
                if (GameCanvas.Class12[5]) {
                    this.Class2(GameCanvas.Class12[5] = false);
                }
                if (GameCanvas.Class13[4] || GameCanvas.Class13[1]) {
                    if (Char.getMyChar().Class15 == 1) {
                        Char.getMyChar().Class15 = -1;
                    }
                    else {
                        Char.getMyChar().Class11 = -Char.getMyChar().Class2();
                    }
                }
                else if (GameCanvas.Class13[6] || GameCanvas.Class13[3]) {
                    if (Char.getMyChar().Class15 == -1) {
                        Char.getMyChar().Class15 = 1;
                    }
                    else {
                        Char.getMyChar().Class11 = Char.getMyChar().Class2();
                    }
                }
                if ((GameCanvas.Class13[2] || GameCanvas.Class13[1] || GameCanvas.Class13[3]) && Char.getMyChar().Class60 && Char.getMyChar().Class13 == 0 && Char.getMyChar().Class12 > -4) {
                    final Char myChar3 = Char.getMyChar();
                    ++myChar3.Class13;
                    Char.getMyChar().Class12 = -7;
                }
            }
            else if (Char.getMyChar().statusMe == 4) {
                if (GameCanvas.Class12[5]) {
                    this.Class2(GameCanvas.Class12[5] = false);
                }
                if (GameCanvas.Class12[2]) {
                    GameCanvas.Class7();
                }
                if (GameCanvas.Class13[4]) {
                    if (Char.getMyChar().Class15 == 1) {
                        Char.getMyChar().Class15 = -1;
                    }
                    else {
                        Char.getMyChar().Class11 = -Char.getMyChar().Class2();
                    }
                }
                else if (GameCanvas.Class13[6]) {
                    if (Char.getMyChar().Class15 == -1) {
                        Char.getMyChar().Class15 = 1;
                    }
                    else {
                        Char.getMyChar().Class11 = Char.getMyChar().Class2();
                    }
                }
            }
            else if (Char.getMyChar().statusMe == 10) {
                if (GameCanvas.Class12[5]) {
                    this.Class2(GameCanvas.Class12[5] = false);
                }
                if (GameCanvas.Class13[2]) {
                    Char.getMyChar().Class12 = -10;
                    Char.getMyChar().statusMe = 3;
                    Char.getMyChar().Class13 = 0;
                }
                else if (GameCanvas.Class13[4]) {
                    if (Char.getMyChar().Class15 == 1) {
                        Char.getMyChar().Class15 = -1;
                    }
                    else {
                        Char.getMyChar().Class11 = -5;
                    }
                }
                else if (GameCanvas.Class13[6]) {
                    if (Char.getMyChar().Class15 == -1) {
                        Char.getMyChar().Class15 = 1;
                    }
                    else {
                        Char.getMyChar().Class11 = 5;
                    }
                }
            }
            else if (Char.getMyChar().statusMe == 7) {
                if (GameCanvas.Class12[5]) {
                    GameCanvas.Class12[5] = false;
                }
                if (GameCanvas.Class13[4]) {
                    if (Char.getMyChar().Class15 == 1) {
                        Char.getMyChar().Class15 = -1;
                    }
                    else {
                        Char.getMyChar().Class11 = -Char.getMyChar().Class2() + 2;
                    }
                }
                else if (GameCanvas.Class13[6]) {
                    if (Char.getMyChar().Class15 == -1) {
                        Char.getMyChar().Class15 = 1;
                    }
                    else {
                        Char.getMyChar().Class11 = Char.getMyChar().Class2() - 2;
                    }
                }
            }
            else if (Char.getMyChar().statusMe == 11) {
                if (GameCanvas.Class12[5]) {
                    this.Class2(GameCanvas.Class12[5] = false);
                }
                if (GameCanvas.Class13[2]) {
                    Char.getMyChar().Class12 = -10;
                    Char.getMyChar().statusMe = 3;
                    Char.getMyChar().Class13 = 0;
                }
            }
            if (GameCanvas.Class12[8] && GameCanvas.Class45 != 56) {
                GameCanvas.Class12[8] = false;
                this.Class69();
            }
        }
        else {
            this.Class217();
        }
        if (GameCanvas.Class45 != 0) {
            if (TField.Class19) {
                if (GameCanvas.Class45 == 113) {
                    this.Class188 = true;
                    if (GameScr.Class284[0] != null) {
                        this.Class1(GameScr.Class284[0], true, true);
                    }
                }
                else if (GameCanvas.Class45 == 119) {
                    this.Class188 = true;
                    if (GameScr.Class284[1] != null) {
                        this.Class1(GameScr.Class284[1], true, true);
                    }
                }
                else if (GameCanvas.Class45 == 101) {
                    this.Class188 = true;
                    if (GameScr.Class284[2] != null) {
                        this.Class1(GameScr.Class284[2], true, true);
                    }
                }
                else {
                    Game23.Class1().Class1(GameCanvas.Class45, this, Game86.Class400[0]);
                }
            }
            else if (!GameCanvas.Class2) {
                Game23.Class1().Class1(GameCanvas.Class45, this, Game86.Class400[0]);
            }
            else if (GameCanvas.Class45 == 55) {
                this.Class188 = true;
                if (GameScr.Class284[0] != null) {
                    this.Class1(GameScr.Class284[0], true, true);
                }
            }
            else if (GameCanvas.Class45 == 56) {
                this.Class188 = true;
                if (GameScr.Class284[1] != null) {
                    this.Class1(GameScr.Class284[1], true, true);
                }
            }
            else if (GameCanvas.Class45 == 57) {
                this.Class188 = true;
                if (GameScr.Class284[2] != null) {
                    this.Class1(GameScr.Class284[2], true, true);
                }
            }
            else if (GameCanvas.Class45 == 48) {
                Game23.Class1().setText(Game86.Class400[0]);
            }
            GameCanvas.Class45 = 0;
        }
    }
    
    private void Class67() {
        GameScr.Class154 = 0;
        final Char myChar = Char.getMyChar();
        final boolean b = false;
        myChar.Class135 = b;
        this.Class155 = b;
    }
    
    public static void Class23() {
        if (!Char.getMyChar().doUsePotion(17)) {
            for (int i = 0; i < Char.getMyChar().arrItemBag.length; ++i) {
                if (Char.getMyChar().arrItemBag[i] != null && Char.getMyChar().arrItemBag[i].template.type == 17) {
                    InfoMe.Class1(Game86.Class363);
                    return;
                }
            }
            if (GameScr.Class154 != 1) {
                InfoMe.Class1(Game86.Class364);
            }
        }
    }
    
    public static void Class24() {
        final int n = (int)(System.currentTimeMillis() / 1000L);
        for (int i = 0; i < Char.getMyChar().vEff.size(); ++i) {
            final Effect effect;
            if ((effect = (Effect)Char.getMyChar().vEff.elementAt(i)).template.id == 21 && effect.timeLenght - (n - effect.timeStart) >= 2) {
                return;
            }
        }
        if (!Char.getMyChar().doUsePotion(16)) {
            for (int j = 0; j < Char.getMyChar().arrItemBag.length; ++j) {
                if (Char.getMyChar().arrItemBag[j] != null && Char.getMyChar().arrItemBag[j].template.type == 16) {
                    InfoMe.Class1(Game86.Class363);
                    return;
                }
            }
            if (GameScr.Class154 != 1) {
                InfoMe.Class1(Game86.Class365);
            }
        }
    }
    
    private static boolean Class68() {
        return Char.getMyChar().mobFocus != null && ((Char.getMyChar().mobFocus.getTemplate().Class5 == 142 && Char.getMyChar().cTypePk == 4) || (Char.getMyChar().mobFocus.getTemplate().Class5 == 143 && Char.getMyChar().cTypePk == 5) || (Char.getMyChar().mobFocus.getTemplate().Class5 == 143 && Char.getMyChar().cTypePk == 6));
    }
    
    private void Class2(final boolean class170) {
        if (Char.getMyChar().statusMe != 14) {
            boolean class171 = false;
            Label_2276: {
                if (InfoDlg.Class5 || Char.getMyChar().Class136 || Char.Class134 || Char.getMyChar().Class137) {
                    class171 = false;
                }
                else if (Char.getMyChar().mobFocus != null && ((Char.getMyChar().mobFocus.templateId == 97 && Char.getMyChar().cTypePk == 4) || (Char.getMyChar().mobFocus.templateId == 98 && Char.getMyChar().cTypePk == 4) || (Char.getMyChar().mobFocus.templateId == 96 && Char.getMyChar().cTypePk == 5) || (Char.getMyChar().mobFocus.templateId == 99 && Char.getMyChar().cTypePk == 5) || (Char.getMyChar().mobFocus.templateId == 200 && Char.getMyChar().cTypePk == 4) || (Char.getMyChar().mobFocus.templateId == 199 && Char.getMyChar().cTypePk == 5) || (Char.getMyChar().mobFocus.templateId == 198 && Char.getMyChar().cTypePk == 6))) {
                    class171 = false;
                }
                else if (Char.getMyChar().myskill != null && Char.getMyChar().myskill.template.type == 2 && Char.getMyChar().npcFocus == null) {
                    class171 = Class66();
                }
                else if (Char.getMyChar().Class150 != null || (Char.getMyChar().charFocus != null && Char.getMyChar().charFocus.Class3) || (Char.getMyChar().mobFocus == null && Char.getMyChar().npcFocus == null && Char.getMyChar().charFocus == null && Char.getMyChar().itemFocus == null)) {
                    class171 = false;
                }
                else {
                    if (Char.getMyChar().mobFocus != null) {
                        if (Char.getMyChar().myskill == null) {
                            class171 = false;
                            break Label_2276;
                        }
                        if (Char.getMyChar().arrItemBody[1] == null) {
                            InfoMe.Class1(Game86.Class393);
                            class171 = false;
                            break Label_2276;
                        }
                        if (Char.getMyChar().mobFocus.status == 1 || Char.getMyChar().mobFocus.status == 0 || Char.getMyChar().myskill.template.type == 4) {
                            class171 = false;
                            break Label_2276;
                        }
                        if (!Class66()) {
                            class171 = false;
                            break Label_2276;
                        }
                        if (Char.getMyChar().cx < Char.getMyChar().mobFocus.x) {
                            Char.getMyChar().Class15 = 1;
                        }
                        else {
                            Char.getMyChar().Class15 = -1;
                        }
                        final int abs = Math.abs(Char.getMyChar().cx - Char.getMyChar().mobFocus.x);
                        final int abs2 = Math.abs(Char.getMyChar().cy - Char.getMyChar().mobFocus.y);
                        Char.getMyChar().Class11 = 0;
                        if (Char.getMyChar().Class3()) {
                            if (abs > Char.getMyChar().myskill.dx || abs2 > Char.getMyChar().myskill.dy) {
                                Char.getMyChar().Class138 = new Game58(Char.getMyChar().mobFocus.x, Char.getMyChar().cy);
                                GameCanvas.Class8();
                                GameCanvas.Class7();
                                class171 = false;
                                break Label_2276;
                            }
                            GameCanvas.Class8();
                            GameCanvas.Class7();
                        }
                        else if ((Char.getMyChar().myskill.template.id == 24 || Char.getMyChar().myskill.template.id == 40 || Char.getMyChar().myskill.template.id == 42) && abs <= Char.getMyChar().myskill.dx && abs2 <= Char.getMyChar().myskill.dy) {
                            GameCanvas.Class8();
                            GameCanvas.Class7();
                            Char.getMyChar().Class11 = 0;
                        }
                        else {
                            if (abs > Char.getMyChar().myskill.dx || abs2 > Char.getMyChar().myskill.dy || Char.getMyChar().cy < Char.getMyChar().mobFocus.y - 10) {
                                Char.getMyChar().Class138 = new Game58(Char.getMyChar().mobFocus.x + Char.getMyChar().mobFocus.dir * 12, Char.getMyChar().cy);
                                GameCanvas.Class8();
                                GameCanvas.Class7();
                                class171 = false;
                                break Label_2276;
                            }
                            GameCanvas.Class8();
                            GameCanvas.Class7();
                            Char.getMyChar().Class11 = 0;
                        }
                    }
                    else {
                        if (Char.getMyChar().npcFocus != null) {
                            if (Char.getMyChar().cx < Char.getMyChar().npcFocus.cx) {
                                Char.getMyChar().Class15 = 1;
                            }
                            else {
                                Char.getMyChar().Class15 = -1;
                            }
                            if (Char.getMyChar().cx < Char.getMyChar().npcFocus.cx) {
                                Char.getMyChar().npcFocus.Class15 = -1;
                            }
                            else {
                                Char.getMyChar().npcFocus.Class15 = 1;
                            }
                            final int abs3 = Math.abs(Char.getMyChar().cx - Char.getMyChar().npcFocus.cx);
                            final int abs4 = Math.abs(Char.getMyChar().cy - Char.getMyChar().npcFocus.cy);
                            if (abs3 < 60 && abs4 < 40) {
                                GameCanvas.Class8();
                                GameCanvas.Class7();
                                if (Char.getMyChar().npcFocus.template.npcTemplateId == 13) {
                                    InfoDlg.Class1();
                                    Service.gI().openUIZone();
                                }
                                else {
                                    Service.gI().openMenu(Char.getMyChar().npcFocus.template.npcTemplateId);
                                    InfoDlg.Class1();
                                }
                            }
                            else {
                                Char.getMyChar().Class138 = new Game58(Char.getMyChar().npcFocus.cx, Char.getMyChar().cy);
                                GameCanvas.Class8();
                                GameCanvas.Class7();
                            }
                            class171 = false;
                            break Label_2276;
                        }
                        if (Char.getMyChar().charFocus != null) {
                            if (Char.getMyChar().cx < Char.getMyChar().charFocus.cx) {
                                Char.getMyChar().Class15 = 1;
                            }
                            else {
                                Char.getMyChar().Class15 = -1;
                            }
                            final int abs5 = Math.abs(Char.getMyChar().cx - Char.getMyChar().charFocus.cx);
                            final int abs6 = Math.abs(Char.getMyChar().cy - Char.getMyChar().charFocus.cy);
                            Char.getMyChar();
                            if (!Char.Class2(Char.getMyChar().charFocus)) {
                                if (abs5 < 60 && abs6 < 40 && Char.getMyChar().charFocus.charID >= 0) {
                                    GameCanvas.Class8();
                                    if (Char.getMyChar().charFocus.statusMe != 14 && Char.getMyChar().charFocus.statusMe != 5 && TileMap.Class14 == 1) {
                                        class171 = false;
                                        break Label_2276;
                                    }
                                    if (!this.Class188) {
                                        final MyVector myVector;
                                        (myVector = new MyVector()).addElement(new Command(Game86.Class366[6], 110397));
                                        myVector.addElement(new Command(Game86.Class366[4], 110391));
                                        if ((Char.getMyChar().Class56 == 4 || Char.getMyChar().Class56 == 3 || Char.getMyChar().Class56 == 2) && Char.getMyChar().charFocus.Class55.equals("")) {
                                            myVector.addElement(new Command(Game86.Class366[8], 110398));
                                        }
                                        if ((Char.getMyChar().charFocus.Class56 == 4 || Char.getMyChar().charFocus.Class56 == 3 || Char.getMyChar().charFocus.Class56 == 2) && Char.getMyChar().Class55.equals("")) {
                                            myVector.addElement(new Command(Game86.Class366[9], 110399));
                                        }
                                        myVector.addElement(new Command(Game86.Class366[7], 12004, Char.getMyChar().charFocus.cName));
                                        if (Char.getMyChar().nClass.classId == 6) {
                                            myVector.addElement(new Command(String.valueOf(Game86.Class366[11]) + ": " + (Char.Class117 ? Game86.Class44 : Game86.Class43), 1103991));
                                        }
                                        if (Char.getMyChar().charFocus.statusMe != 14 && Char.getMyChar().charFocus.statusMe != 5) {
                                            myVector.addElement(new Command(Game86.Class366[0], 110392));
                                            myVector.addElement(new Command(Game86.Class366[1], 110393));
                                            myVector.addElement(new Command(Game86.Class366[2], 110394));
                                        }
                                        else if (Char.getMyChar().myskill.template.type == 4) {
                                            myVector.addElement(new Command(Game86.Class366[5], 110395));
                                        }
                                        myVector.addElement(new Command(Game86.Class366[3], 110396));
                                        GameCanvas.Class30.Class1(myVector);
                                        GameCanvas.Class30.Class20 = 5;
                                    }
                                    this.Class188 = false;
                                }
                                else {
                                    Char.getMyChar().Class138 = new Game58(Char.getMyChar().charFocus.cx, Char.getMyChar().cy);
                                    GameCanvas.Class8();
                                    GameCanvas.Class7();
                                }
                                class171 = false;
                                break Label_2276;
                            }
                            if (Char.getMyChar().myskill == null) {
                                class171 = false;
                                break Label_2276;
                            }
                            if (Char.getMyChar().arrItemBody[1] == null) {
                                InfoMe.Class1(Game86.Class393);
                                class171 = false;
                                break Label_2276;
                            }
                            if (!Class66()) {
                                class171 = false;
                                break Label_2276;
                            }
                            if (Char.getMyChar().cx < Char.getMyChar().charFocus.cx) {
                                Char.getMyChar().Class15 = 1;
                            }
                            else {
                                Char.getMyChar().Class15 = -1;
                            }
                            Char.getMyChar().Class11 = 0;
                            if (Char.getMyChar().Class3()) {
                                if (abs5 > Char.getMyChar().myskill.dx || abs6 > Char.getMyChar().myskill.dy) {
                                    Char.getMyChar().Class138 = new Game58(Char.getMyChar().charFocus.cx, Char.getMyChar().cy);
                                    GameCanvas.Class8();
                                    GameCanvas.Class7();
                                    class171 = false;
                                    break Label_2276;
                                }
                                GameCanvas.Class8();
                                GameCanvas.Class7();
                            }
                            else if ((Char.getMyChar().myskill.template.id == 24 || Char.getMyChar().myskill.template.id == 40 || Char.getMyChar().myskill.template.id == 42) && abs5 <= Char.getMyChar().myskill.dx && abs6 <= Char.getMyChar().myskill.dy) {
                                GameCanvas.Class8();
                                GameCanvas.Class7();
                                Char.getMyChar().Class11 = 0;
                            }
                            else {
                                if (abs5 > Char.getMyChar().myskill.dx || abs6 > Char.getMyChar().myskill.dy || Char.getMyChar().cy < Char.getMyChar().charFocus.cy) {
                                    Char.getMyChar().Class138 = new Game58(Char.getMyChar().charFocus.cx + Char.getMyChar().charFocus.Class15 * 12, Char.getMyChar().cy);
                                    GameCanvas.Class8();
                                    GameCanvas.Class7();
                                    class171 = false;
                                    break Label_2276;
                                }
                                GameCanvas.Class8();
                                GameCanvas.Class7();
                                Char.getMyChar().Class11 = 0;
                            }
                        }
                        else if (Char.getMyChar().itemFocus != null) {
                            if (Char.getMyChar().statusMe != 1) {
                                class171 = false;
                                break Label_2276;
                            }
                            if (Char.getMyChar().cx < Char.getMyChar().itemFocus.x) {
                                Char.getMyChar().Class15 = 1;
                            }
                            else {
                                Char.getMyChar().Class15 = -1;
                            }
                            final int abs7 = Math.abs(Char.getMyChar().cx - Char.getMyChar().itemFocus.x);
                            final int abs8 = Math.abs(Char.getMyChar().cy - Char.getMyChar().itemFocus.y);
                            if ((abs7 <= 35 && abs8 < 35) || (GameScr.Class154 != 0 && abs7 <= 48 && abs8 <= 48)) {
                                GameCanvas.Class8();
                                GameCanvas.Class7();
                                Service.gI().pickItem(Char.getMyChar().itemFocus.itemMapID);
                            }
                            else {
                                Char.getMyChar().Class138 = new Game58(Char.getMyChar().itemFocus.x, Char.getMyChar().cy);
                                GameCanvas.Class8();
                                GameCanvas.Class7();
                            }
                            class171 = false;
                            break Label_2276;
                        }
                    }
                    class171 = true;
                }
            }
            if (class171) {
                if (Class68()) {
                    final MyVector myVector2;
                    (myVector2 = new MyVector()).addElement(new Command(Game86.Class490, 151301));
                    GameCanvas.Class30.Class1(myVector2);
                    return;
                }
                if (Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.getTemplate().Class5 == 144 && TileMap.mapID == 130) {
                    final MyVector myVector3;
                    (myVector3 = new MyVector()).addElement(new Command(Game86.Class494, 151301));
                    GameCanvas.Class30.Class1(myVector3);
                    return;
                }
                Char.getMyChar().Class1(GameScr.sks[Char.getMyChar().myskill.template.id], 0);
                Char.getMyChar().Class170 = class170;
                if (Char.getMyChar().Class64) {
                    Char.getMyChar().Class64 = false;
                    Char.getMyChar().Class126 = System.currentTimeMillis();
                    if (Char.getMyChar().Class139 >= 500) {
                        Game16.Class1(60, Char.getMyChar(), 1);
                    }
                }
                if (Char.getMyChar().Class16() && !Char.getMyChar().Class65) {
                    Char.getMyChar().Class63 = false;
                    Char.getMyChar().Class65 = true;
                    Game16.Class1(60, Char.getMyChar(), 1);
                }
                if (Char.getMyChar().Class30() && !Char.getMyChar().Class65) {
                    Char.getMyChar().Class66 = false;
                    Char.getMyChar().Class65 = true;
                    Game16.Class1(60, Char.getMyChar(), 1);
                }
            }
        }
        if (!class170) {
            Char.getMyChar().Class169 = Char.getMyChar().myskill;
        }
    }
    
    private void Class69() {
        this.Class294 = 0;
        for (int i = 0; i < GameScr.Class285.length; ++i) {
            if (GameScr.Class285[i] != null) {
                ++this.Class294;
            }
        }
        if (this.Class294 > 1) {
            if (!GameScr.Class208 || this.Class295 == -1) {
                GameScr.Class208 = true;
                for (int j = 0; j < GameScr.Class285.length; ++j) {
                    if (GameScr.Class285[j] == Char.getMyChar().myskill) {
                        this.Class295 = j;
                        break;
                    }
                }
            }
            ++this.Class295;
            if (this.Class295 >= GameScr.Class285.length) {
                this.Class295 = 0;
            }
            if (GameScr.Class285[this.Class295] == null) {
                this.Class295 = 0;
            }
            super.center = new Command("", 11059);
            return;
        }
        InfoMe.Class2();
    }
    
    public final void Class1(final Skill skill, final boolean b, final boolean b2) {
        this.Class295 = -1;
        if (skill != null) {
            if (skill.template.type == 4 && Char.getMyChar().charFocus != null) {
                if (Char.getMyChar().charFocus.Class3) {
                    return;
                }
                if (Char.getMyChar().charFocus.statusMe == 14 || Char.getMyChar().charFocus.statusMe == 5) {
                    Service.gI().buffLive(Char.getMyChar().charFocus.charID);
                    if ((TileMap.tileTypeAtPixel(Char.getMyChar().cx, Char.getMyChar().cy) & 0x2) == 0x2) {
                        Char.getMyChar().Class1(GameScr.sks[49], 0);
                    }
                    else {
                        Char.getMyChar().Class1(GameScr.sks[49], 1);
                    }
                }
            }
            if (b2) {
                Service.gI().selectSkill(skill.template.id);
            }
        }
        if (skill.template.type != 2) {
            this.Class22();
        }
        if (skill != null) {
            Char.getMyChar().myskill = skill;
            if (skill.template.type == 1 && Code.T != null) {
                Auto.KCTSA = skill;
            }
            if (Char.getMyChar().npcFocus == null && skill.template.type != 4) {
                this.Class2(b);
            }
        }
    }
    
    public static void Class3(final int n) {
        final MyVector myVector = (n == 0) ? GameScr.Class34 : GameScr.Class37;
        for (int i = 0; i < myVector.size() - 1; ++i) {
            Game80 game80 = (Game80)myVector.elementAt(i);
            for (int j = i + 1; j < myVector.size(); ++j) {
                final Game80 game81;
                if ((game81 = (Game80)myVector.elementAt(j)).Class2 > game80.Class2) {
                    final Game80 game82 = game81;
                    final Game80 obj = game80;
                    game80 = game82;
                    myVector.setElementAt(game80, i);
                    myVector.setElementAt(obj, j);
                }
                else if (game81.Class2 == game80.Class2 && game80.Class1.compareTo(game81.Class1) > 0) {
                    final Game80 game83 = game81;
                    final Game80 obj2 = game80;
                    game80 = game83;
                    myVector.setElementAt(game80, i);
                    myVector.setElementAt(obj2, j);
                }
            }
        }
    }
    
    public static void Class25() {
        for (int i = 0; i < GameScr.Class31.size() - 1; ++i) {
            Game41 game41 = (Game41)GameScr.Class31.elementAt(i);
            for (int j = i + 1; j < GameScr.Class31.size(); ++j) {
                final Game41 game42 = (Game41)GameScr.Class31.elementAt(j);
                if (GameScr.Class199 && !GameScr.Class200) {
                    if (game42.Class5 && !game41.Class5) {
                        final Game41 game43 = game42;
                        final Game41 obj = game41;
                        game41 = game43;
                        GameScr.Class31.setElementAt(game41, i);
                        GameScr.Class31.setElementAt(obj, j);
                    }
                    else if (game42.Class5 && game41.Class5) {
                        if (game42.Class3 > game41.Class3) {
                            final Game41 game44 = game42;
                            final Game41 obj2 = game41;
                            game41 = game44;
                            GameScr.Class31.setElementAt(game41, i);
                            GameScr.Class31.setElementAt(obj2, j);
                        }
                        else if (game42.Class3 == game41.Class3) {
                            if (game42.Class6 > game41.Class6) {
                                final Game41 game45 = game42;
                                final Game41 obj3 = game41;
                                game41 = game45;
                                GameScr.Class31.setElementAt(game41, i);
                                GameScr.Class31.setElementAt(obj3, j);
                            }
                            else if (game41.Class6 == game42.Class6) {
                                if (game42.Class7 > game41.Class7) {
                                    final Game41 game46 = game42;
                                    final Game41 obj4 = game41;
                                    game41 = game46;
                                    GameScr.Class31.setElementAt(game41, i);
                                    GameScr.Class31.setElementAt(obj4, j);
                                }
                                else if (game41.Class7 == game42.Class7) {
                                    if (game42.Class2 > game41.Class2) {
                                        final Game41 game47 = game42;
                                        final Game41 obj5 = game41;
                                        game41 = game47;
                                        GameScr.Class31.setElementAt(game41, i);
                                        GameScr.Class31.setElementAt(obj5, j);
                                    }
                                    else if (game41.Class2 == game42.Class2 && game41.Class4.compareTo(game42.Class4) > 0) {
                                        final Game41 game48 = game42;
                                        final Game41 obj6 = game41;
                                        game41 = game48;
                                        GameScr.Class31.setElementAt(game41, i);
                                        GameScr.Class31.setElementAt(obj6, j);
                                    }
                                }
                            }
                        }
                    }
                }
                else if (GameScr.Class200) {
                    if (GameScr.Class199) {
                        if (game42.Class5 && !game41.Class5) {
                            final Game41 game49 = game42;
                            final Game41 obj7 = game41;
                            game41 = game49;
                            GameScr.Class31.setElementAt(game41, i);
                            GameScr.Class31.setElementAt(obj7, j);
                        }
                        else if (game42.Class5 && game41.Class5) {
                            if (game42.Class7 > game41.Class7) {
                                final Game41 game50 = game42;
                                final Game41 obj8 = game41;
                                game41 = game50;
                                GameScr.Class31.setElementAt(game41, i);
                                GameScr.Class31.setElementAt(obj8, j);
                            }
                            else if (game41.Class7 == game42.Class7) {
                                if (game42.Class6 > game41.Class6) {
                                    final Game41 game51 = game42;
                                    final Game41 obj9 = game41;
                                    game41 = game51;
                                    GameScr.Class31.setElementAt(game41, i);
                                    GameScr.Class31.setElementAt(obj9, j);
                                }
                                else if (game41.Class6 == game42.Class6) {
                                    if (game42.Class3 > game41.Class3) {
                                        final Game41 game52 = game42;
                                        final Game41 obj10 = game41;
                                        game41 = game52;
                                        GameScr.Class31.setElementAt(game41, i);
                                        GameScr.Class31.setElementAt(obj10, j);
                                    }
                                    else if (game42.Class3 == game41.Class3 && game41.Class2 == game42.Class2 && game41.Class4.compareTo(game42.Class4) > 0) {
                                        final Game41 game53 = game42;
                                        final Game41 obj11 = game41;
                                        game41 = game53;
                                        GameScr.Class31.setElementAt(game41, i);
                                        GameScr.Class31.setElementAt(obj11, j);
                                    }
                                }
                            }
                        }
                    }
                    else if (game42.Class7 > game41.Class7) {
                        final Game41 game54 = game42;
                        final Game41 obj12 = game41;
                        game41 = game54;
                        GameScr.Class31.setElementAt(game41, i);
                        GameScr.Class31.setElementAt(obj12, j);
                    }
                    else if (game41.Class7 == game42.Class7) {
                        if (game42.Class6 > game41.Class6) {
                            final Game41 game55 = game42;
                            final Game41 obj13 = game41;
                            game41 = game55;
                            GameScr.Class31.setElementAt(game41, i);
                            GameScr.Class31.setElementAt(obj13, j);
                        }
                        else if (game41.Class6 == game42.Class6) {
                            if (game42.Class3 > game41.Class3) {
                                final Game41 game56 = game42;
                                final Game41 obj14 = game41;
                                game41 = game56;
                                GameScr.Class31.setElementAt(game41, i);
                                GameScr.Class31.setElementAt(obj14, j);
                            }
                            else if (game42.Class3 == game41.Class3 && game41.Class2 == game42.Class2 && game41.Class4.compareTo(game42.Class4) > 0) {
                                final Game41 game57 = game42;
                                final Game41 obj15 = game41;
                                game41 = game57;
                                GameScr.Class31.setElementAt(game41, i);
                                GameScr.Class31.setElementAt(obj15, j);
                            }
                        }
                    }
                }
                else if (game42.Class3 > game41.Class3) {
                    final Game41 game58 = game42;
                    final Game41 obj16 = game41;
                    game41 = game58;
                    GameScr.Class31.setElementAt(game41, i);
                    GameScr.Class31.setElementAt(obj16, j);
                }
                else if (game42.Class3 == game41.Class3) {
                    if (game42.Class6 > game41.Class6) {
                        final Game41 game59 = game42;
                        final Game41 obj17 = game41;
                        game41 = game59;
                        GameScr.Class31.setElementAt(game41, i);
                        GameScr.Class31.setElementAt(obj17, j);
                    }
                    else if (game41.Class6 == game42.Class6) {
                        if (game42.Class7 > game41.Class7) {
                            final Game41 game60 = game42;
                            final Game41 obj18 = game41;
                            game41 = game60;
                            GameScr.Class31.setElementAt(game41, i);
                            GameScr.Class31.setElementAt(obj18, j);
                        }
                        else if (game41.Class7 == game42.Class7) {
                            if (game42.Class2 > game41.Class2) {
                                final Game41 game61 = game42;
                                final Game41 obj19 = game41;
                                game41 = game61;
                                GameScr.Class31.setElementAt(game41, i);
                                GameScr.Class31.setElementAt(obj19, j);
                            }
                            else if (game41.Class2 == game42.Class2 && game41.Class4.compareTo(game42.Class4) > 0) {
                                final Game41 game62 = game42;
                                final Game41 obj20 = game41;
                                game41 = game62;
                                GameScr.Class31.setElementAt(game41, i);
                                GameScr.Class31.setElementAt(obj20, j);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void Class26() {
        for (int i = 0; i < Char.getMyChar().vSkillFight.size() - 1; ++i) {
            Skill obj = (Skill)Char.getMyChar().vSkillFight.elementAt(i);
            for (int j = i + 1; j < Char.getMyChar().vSkillFight.size(); ++j) {
                final Skill skill;
                if ((skill = (Skill)Char.getMyChar().vSkillFight.elementAt(j)).template.id < obj.template.id) {
                    final Skill skill2 = skill;
                    final Skill obj2 = obj;
                    obj = skill2;
                    Char.getMyChar().vSkillFight.setElementAt(obj, i);
                    Char.getMyChar().vSkillFight.setElementAt(obj2, j);
                }
            }
        }
    }
    
    private static void Class8(final int class11) {
        Char.getMyChar().Class12 = (Char.getMyChar().Class60 ? -10 : -8);
        Char.getMyChar().Class11 = class11;
        Char.getMyChar().statusMe = 3;
        Char.getMyChar().Class13 = 0;
    }
    
    public final void Class4() {
        if (GameScr.indexMenu == 4 && GameCanvas.Class6 && mScreen.Class1(this.Class186) && this.Class186 != null) {
            GameCanvas.Class16 = false;
            GameCanvas.Class12[5] = false;
            mScreen.Class7 = -1;
            this.Class186.Class1();
        }
        this.Class349 = (this.Class349 + 1) % this.Class348.length;
        if (GameCanvas.gameTick % 200 == 0) {
            Char.Class18();
        }
        if (GameScr.Class152 != 0 && !GameCanvas.Class1) {
            GameScr.Class16 += Game20.Class1();
            if (++GameScr.Class153 > 20) {
                GameScr.Class152 = 0;
                GameScr.Class153 = 0;
            }
        }
        else if (GameScr.Class16 != GameScr.Class18 || GameScr.Class17 != GameScr.Class19) {
            if (!GameScr.Class150) {
                GameScr.Class175 = GameScr.Class18 - GameScr.Class16 << 2;
                GameScr.Class176 = GameScr.Class19 - GameScr.Class17 << 2;
            }
            else {
                GameScr.Class175 = GameScr.Class18 - GameScr.Class16 << 1;
                GameScr.Class176 = GameScr.Class19 - GameScr.Class17 << 2;
            }
            GameScr.Class173 += GameScr.Class175;
            GameScr.Class16 += GameScr.Class173 >> 4;
            GameScr.Class173 &= 0xF;
            GameScr.Class174 += GameScr.Class176;
            GameScr.Class17 += GameScr.Class174 >> 4;
            GameScr.Class174 &= 0xF;
            if (GameScr.Class16 < 24) {
                GameScr.Class16 = 24;
            }
            if (GameScr.Class16 > GameScr.Class177) {
                GameScr.Class16 = GameScr.Class177;
            }
            if (GameScr.Class17 < 0) {
                GameScr.Class17 = 0;
            }
            if (GameScr.Class17 > GameScr.Class178) {
                GameScr.Class17 = GameScr.Class178;
            }
        }
        if ((GameScr.Class20 = GameScr.Class16 / TileMap.Class9 - 1) < 0) {
            GameScr.Class20 = 0;
        }
        GameScr.Class21 = GameScr.Class17 / TileMap.Class9;
        GameScr.Class22 = GameScr.Class20 + GameScr.Class170;
        GameScr.Class23 = GameScr.Class21 + GameScr.Class171;
        if (GameScr.Class21 < 0) {
            GameScr.Class21 = 0;
        }
        if (GameScr.Class23 > TileMap.Class2 - 1) {
            GameScr.Class23 = TileMap.Class2 - 1;
        }
        if ((TileMap.Class25 = (Char.getMyChar().cx - 2 * GameScr.Class9) / TileMap.Class9) < 0) {
            TileMap.Class25 = 0;
        }
        if ((TileMap.Class26 = TileMap.Class25 + TileMap.Class29) > TileMap.Class1) {
            TileMap.Class25 = (TileMap.Class26 = TileMap.Class1) - TileMap.Class29;
        }
        if ((TileMap.Class27 = (Char.getMyChar().cy - 2 * GameScr.Class10) / TileMap.Class9) < 0) {
            TileMap.Class27 = 0;
        }
        if ((TileMap.Class28 = TileMap.Class27 + TileMap.Class30) > TileMap.Class2) {
            TileMap.Class27 = (TileMap.Class28 = TileMap.Class2) - TileMap.Class30;
        }
        GameScr.Class50.Class3();
        GameScr.Class196.Class3();
        final Game23 class1;
        if ((class1 = Game23.Class1()).Class2) {
            class1.Class1.Class3();
            class1.Class1.getClass();
        }
        if (GameScr.Class292 >= 0) {
            --GameScr.Class292;
        }
        TileMap.Class2();
        GameCanvas.Class1();
        GameCanvas.Class3();
        if (GameCanvas.Class3) {
            final MyVector myVector = new MyVector();
            final long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
                final Char char1;
                (char1 = (Char)GameScr.vCharInMap.elementAt(i)).Class8();
                if (char1.Class17()) {
                    if (char1.Class168 && currentTimeMillis - char1.Class5 > 10000L && currentTimeMillis - this.Class296 > 10000L) {
                        char1.Class168 = false;
                        char1.Class5 = currentTimeMillis;
                        myVector.addElement(char1);
                    }
                }
                else {
                    char1.Class5 = currentTimeMillis;
                    char1.Class168 = true;
                }
            }
            if (myVector.size() > 0) {
                final Service gi = Service.gI();
                final MyVector myVector2 = myVector;
                final Service service = gi;
                Message message = null;
                try {
                    (message = new Message((byte)25)).Class3.writeByte(myVector2.size());
                    for (int j = 0; j < myVector2.size(); ++j) {
                        message.Class3.writeInt(((Char)myVector2.elementAt(j)).charID);
                    }
                    service.temple.Class1(message);
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                finally {
                    message.Class2();
                }
                message.Class2();
                this.Class296 = currentTimeMillis;
            }
        }
        else {
            for (int k = 0; k < GameScr.vCharInMap.size(); ++k) {
                ((Char)GameScr.vCharInMap.elementAt(k)).Class8();
            }
        }
        Char.getMyChar().Class8();
        if (Char.getMyChar().statusMe == 1 && GameCanvas.gameTick % 100 == 0) {
            System.gc();
        }
        for (int l = 0; l < GameScr.vMob.size(); ++l) {
            ((Mob)GameScr.vMob.elementAt(l)).Class1();
        }
        for (int n = 0; n < GameScr.vNpc.size(); ++n) {
            ((Npc)GameScr.vNpc.elementAt(n)).Class8();
        }
        final GameCanvas class2 = GameCanvas.Class1();
        if (!GameCanvas.Class1) {
            for (int n2 = 0; n2 < 2; ++n2) {
                if (class2.Class48[n2] != -1) {
                    final int[] class3 = class2.Class48;
                    final int n3 = n2;
                    ++class3[n3];
                    if (class2.Class48[n2] >= 5) {
                        class2.Class48[n2] = -1;
                    }
                    if (n2 == 0) {
                        final int[] class4 = class2.Class46;
                        final int n4 = n2;
                        --class4[n4];
                    }
                    else {
                        final int[] class5 = class2.Class46;
                        final int n5 = n2;
                        ++class5[n5];
                    }
                    final int[] class6 = class2.Class47;
                    final int n6 = n2;
                    --class6[n6];
                }
            }
        }
        for (int n7 = 0; n7 < 5; ++n7) {
            if (GameScr.Class325[n7] != -1) {
                final int[] class7 = GameScr.Class325;
                final int n8 = n7;
                class7[n8] += Res.abs(GameScr.Class324[n7]);
                if (GameScr.Class325[n7] > 30) {
                    GameScr.Class325[n7] = -1;
                }
                final int[] class8 = GameScr.Class321;
                final int n9 = n7;
                class8[n9] += GameScr.Class323[n7];
                final int[] class9 = GameScr.Class322;
                final int n10 = n7;
                class9[n10] += GameScr.Class324[n7];
            }
        }
        for (int n11 = 0; n11 < GameScr.Class191.size(); ++n11) {
            final Game87 game88;
            final Game87 game87 = game88 = (Game87)GameScr.Class191.elementAt(n11);
            game87.Class2 -= game88.Class3;
            if (game88.Class4 - game88.Class2 > 150) {
                game88.Class5 = true;
            }
            if (((Game87)GameScr.Class191.elementAt(n11)).Class5) {
                GameScr.Class191.removeElementAt(n11);
            }
        }
        for (int n12 = 0; n12 < 2; ++n12) {
            if (GameScr.Class329[n12] != -1) {
                final int[] class10 = GameScr.Class329;
                final int n13 = n12;
                ++class10[n13];
                final int[] class11 = GameScr.Class327;
                final int n14 = n12;
                class11[n14] += GameScr.Class331[n12] << 2;
                final int[] class12 = GameScr.Class328;
                final int n15 = n12;
                --class12[n15];
                if (GameScr.Class329[n12] >= 6) {
                    GameScr.Class329[n12] = -1;
                }
                else {
                    GameScr.Class330[n12] = (GameScr.Class329[n12] >> 1) % 3;
                }
            }
        }
        if (GameScr.indexMenu != -1 && GameScr.Class396 != 0) {
            GameScr.Class399 = 0 - GameScr.Class396 << 2;
            GameScr.Class398 += GameScr.Class399;
            GameScr.Class396 += GameScr.Class398 >> 4;
            GameScr.Class398 &= 0xF;
        }
        GameCanvas.Class4();
        if (0 < GameScr.Class189.size()) {
            GameScr.Class189.elementAt(0);
            throw null;
        }
        for (int n16 = 0; n16 < GameScr.vItemMap.size(); ++n16) {
            final ItemMap obj;
            if ((obj = (ItemMap)GameScr.vItemMap.elementAt(n16)).status == 2 && obj.x == obj.xEnd && obj.y == obj.yEnd) {
                GameScr.vItemMap.removeElement(obj);
                if (Char.getMyChar().itemFocus != null && Char.getMyChar().itemFocus.equals(obj)) {
                    Char.getMyChar().itemFocus = null;
                }
            }
            else if (obj.status > 0) {
                if (obj.Class5 == 0) {
                    final ItemMap itemMap = obj;
                    itemMap.x = itemMap.xEnd;
                }
                if (obj.Class6 == 0) {
                    final ItemMap itemMap2 = obj;
                    itemMap2.y = itemMap2.yEnd;
                }
                if (obj.x != obj.xEnd) {
                    final ItemMap itemMap3 = obj;
                    itemMap3.x += obj.Class5;
                    if ((obj.Class5 > 0 && obj.x > obj.xEnd) || (obj.Class5 < 0 && obj.x < obj.xEnd)) {
                        final ItemMap itemMap4 = obj;
                        itemMap4.x = itemMap4.xEnd;
                    }
                }
                if (obj.y != obj.yEnd) {
                    final ItemMap itemMap5 = obj;
                    itemMap5.y += obj.Class6;
                    if ((obj.Class6 > 0 && obj.y > obj.yEnd) || (obj.Class6 < 0 && obj.y < obj.yEnd)) {
                        final ItemMap itemMap6 = obj;
                        itemMap6.y = itemMap6.yEnd;
                    }
                }
            }
            else {
                final ItemMap itemMap7 = obj;
                itemMap7.status -= 4;
                if (obj.status < -12) {
                    final ItemMap itemMap8 = obj;
                    itemMap8.y -= 12;
                    obj.status = 1;
                }
            }
        }
        for (int n17 = 0; n17 < GameScr.Class30.size(); ++n17) {
            final Game38 game89;
            if ((game89 = (Game38)GameScr.Class30.elementAt(n17)).Class7 == 1) {
                if (game89.Class8 == null) {
                    GameScr.Class30.removeElement(game89);
                }
                else if (game89.Class5 == 1) {
                    if (game89.Class2 > game89.Class4) {
                        final Game38 game90 = game89;
                        game90.Class2 -= 2;
                        final Game38 game91 = game89;
                        game91.Class1 += 1 - GameCanvas.gameTick % 3;
                    }
                    else {
                        game89.Class5 = 2;
                    }
                    game89.Class6 = 100;
                }
                else {
                    final Game38 game92 = game89;
                    --game92.Class6;
                    if (Res.abs(game89.Class8.cx - game89.Class1) < 50 || Res.abs(game89.Class8.cy - game89.Class2) < 50) {
                        final Game38 game93 = game89;
                        game93.Class1 += (game89.Class8.cx - game89.Class1) / 4;
                        final Game38 game94 = game89;
                        game94.Class2 += (game89.Class8.cy - game89.Class2) / 4;
                    }
                    else {
                        final Game38 game95 = game89;
                        game95.Class1 += (game89.Class8.cx - game89.Class1) / 10;
                        final Game38 game96 = game89;
                        game96.Class2 += (game89.Class8.cy - game89.Class2) / 10;
                    }
                    if (game89.Class6 < 0) {
                        final Game38 game97 = game89;
                        game97.Class1 = game97.Class8.cx;
                        final Game38 game98 = game89;
                        game98.Class2 = game98.Class8.cy - game89.Class8.Class59 / 2;
                        if (game89.Class6 < -5) {
                            GameScr.Class30.removeElement(game89);
                        }
                    }
                    else if (Res.abs(game89.Class8.cx - game89.Class1) < 10 && Res.abs(game89.Class8.cy - game89.Class2) < 10) {
                        GameScr.Class30.removeElement(game89);
                    }
                }
            }
            else if (game89.Class7 == 2) {
                for (int n18 = 0; n18 < game89.Class9.length; ++n18) {
                    final int[] class13 = game89.Class10;
                    final int n19 = n18;
                    class13[n19] -= GameCanvas.gameTick % 5;
                    if (game89.Class11[n18] == -1) {
                        final int[] class14 = game89.Class9;
                        final int n20 = n18;
                        --class14[n20];
                    }
                    else {
                        final int[] class15 = game89.Class9;
                        final int n21 = n18;
                        ++class15[n21];
                    }
                    if (game89.Class9[n18] <= game89.Class3 - 20 || game89.Class9[n18] >= game89.Class3 + 20) {
                        final int n22 = n18;
                        final int[] class16 = game89.Class11;
                        class16[n22] = -class16[n18];
                    }
                    if (game89.Class10[n18] < 0) {
                        GameScr.Class30.removeElement(game89);
                    }
                }
            }
        }
        if (0 >= GameScr.Class190.size()) {
            if ((TileMap.Class1 * TileMap.Class24 >= TileMap.wMiniMap || TileMap.Class2 * TileMap.Class24 >= TileMap.hMiniMap) && System.currentTimeMillis() / 100L > 20L) {
                TileMap.Class1();
            }
            for (int n23 = Game21.Class2.size() - 1; n23 >= 0; --n23) {
                Game21.Class1.removeElement(Game21.Class2.elementAt(n23));
                Game21.Class2.removeElementAt(n23);
            }
            for (int n24 = 0; n24 < Game21.Class1.size(); ++n24) {
                ((Game21)Game21.Class1.elementAt(n24)).switchToMe();
            }
            for (int n25 = 0; n25 < Game21.Class3.size(); ++n25) {
                ((Game21)Game21.Class3.elementAt(n25)).switchToMe();
            }
            for (int n26 = 0; n26 < Game21.Class4.size(); ++n26) {
                ((Game21)Game21.Class4.elementAt(n26)).switchToMe();
            }
            for (int n27 = 0; n27 < Mob.Class27.size(); ++n27) {
                final Game47 game99;
                if ((game99 = (Game47)Mob.Class27.elementAt(n27)) != null) {
                    final Game47 game100;
                    if ((game100 = game99).Class1()) {
                        if (game100.Class4 == 0) {
                            final Game47 game101 = game100;
                            ++game101.Class5;
                            final Game47 game102 = game100;
                            game102.Class2 += game100.Class5;
                            final Game47 game103 = game100;
                            ++game103.Class3;
                            if (game100.Class3 > 3) {
                                game100.Class3 = 0;
                            }
                            if ((TileMap.tileTypeAtPixel(game100.Class1, game100.Class2) & 0x2) == 0x2) {
                                game100.Class4 = 1;
                                game100.Class5 = 0;
                            }
                        }
                        else if (game100.Class4 == 1) {
                            final Game47 game104 = game100;
                            ++game104.Class3;
                            if (game100.Class3 > 6) {
                                game100.Class3 = 6;
                                Game47.Class6.status = 5;
                            }
                        }
                    }
                    if (game99.Class3 == 6) {
                        if (Game47.Class6 != null) {
                            Game47.Class6.status = 5;
                        }
                        Mob.Class27.removeElementAt(n27);
                    }
                }
            }
            Game2.Class1();
            if (this.Class114 >= 0 && GameScr.vCharInMap.size() > 0) {
                final int class17;
                if ((class17 = Char.Class11(this.Class114)) >= 0 && class17 < GameScr.vCharInMap.size()) {
                    final Char charFocus;
                    if ((charFocus = (Char)GameScr.vCharInMap.elementAt(class17)) != null && Char.Class1(charFocus) && !charFocus.Class3) {
                        Char.getMyChar().mobFocus = null;
                        Char.getMyChar().Class22();
                        Char.getMyChar().itemFocus = null;
                        Char.getMyChar();
                        Char.Class165 = true;
                        Char.getMyChar().charFocus = charFocus;
                    }
                }
                else {
                    this.Class114 = -1;
                    Char.getMyChar().charFocus = null;
                }
            }
            else {
                this.Class114 = -1;
            }
            Info.Class1();
            InfoMe.Class1();
            if (GameScr.Class97 != null && GameScr.Class97.charID != Char.getMyChar().charID) {
                GameScr.Class97.Class8();
            }
            ++this.Class297;
            if (this.Class297 > 3) {
                this.Class297 = 0;
            }
            if (GameScr.Class202) {
                GameScr.Class192 = 40;
            }
            else {
                GameScr.Class192 = 28;
            }
            Game39.Class2();
            Game39.Class3();
            if (GameCanvas.Class50) {
                GameCanvas.Class39.switchToMe();
            }
            return;
        }
        GameScr.Class190.elementAt(0);
        throw null;
    }
    
    public final void Class1(final mGraphics mGraphics) {
        if (Char.Class133) {
            mGraphics.setColor(0);
            mGraphics.fillRect(0, 0, GameCanvas.Class25, GameCanvas.Class26);
            mFont.Class6.Class1(mGraphics, Game86.Class134, GameCanvas.Class27, GameCanvas.Class28 + 20, 2);
            GameCanvas.Class1(GameCanvas.Class27, GameCanvas.Class28, mGraphics);
            return;
        }
        GameCanvas.Class1(mGraphics);
        mGraphics.Class1(-GameScr.Class16, -GameScr.Class17);
        for (int i = 0; i < GameScr.Class143.size(); ++i) {
            ((Game54)GameScr.Class143.elementAt(i)).Class1(mGraphics);
        }
        TileMap.Class1(mGraphics);
        for (int j = 0; j < GameScr.Class144.size(); ++j) {
            ((Game54)GameScr.Class144.elementAt(j)).Class1(mGraphics);
        }
        for (int k = 0; k < GameScr.vMob.size(); ++k) {
            ((Mob)GameScr.vMob.elementAt(k)).Class1(mGraphics);
        }
        for (int l = 0; l < Mob.Class27.size(); ++l) {
            final Game47 game47;
            if ((game47 = (Game47)Mob.Class27.elementAt(l)).Class1()) {
                mGraphics.Class1(GameScr.Class283, 0, game47.Class3 << 5, 32, 32, 0, game47.Class1, game47.Class2, 33);
            }
        }
        for (int n = 0; n < GameScr.Class42.size(); ++n) {
            final Game92 game49;
            final Game92 game48;
            if ((game48 = (game49 = (Game92)GameScr.Class42.elementAt(n))).Class1 >= GameScr.Class16 && game48.Class1 <= GameScr.Class16 + GameScr.Class9 && game48.Class2 >= GameScr.Class17 && game48.Class2 <= GameScr.Class17 + GameScr.Class10 + 30) {
                mFont.Class12.drawString(mGraphics, game49.Class3, game49.Class1, game49.Class2 - 32, 2, mFont.Class13);
                Game2.Class1(mGraphics, 1180, game49.Class1, game49.Class2, 0, 33);
                if (game49.Class4) {
                    Game2.Class1(mGraphics, 288, game49.Class1, game49.Class2, 0, 33);
                    game49.Class4 = false;
                }
            }
        }
        if (!Code.mNpc) {
            for (int n2 = 0; n2 < GameScr.vNpc.size(); ++n2) {
                ((Npc)GameScr.vNpc.elementAt(n2)).Class1(mGraphics);
            }
        }
        for (int index = 0; index < TileMap.vGo.size(); ++index) {
            final InfoDlg infoDlg;
            if ((infoDlg = TileMap.vGo.elementAt(index)).minY == 0 || infoDlg.maxY >= TileMap.pxh - 24) {
                if (infoDlg.maxY <= TileMap.pxh / 2) {
                    final int n3 = infoDlg.minX + (infoDlg.maxX - infoDlg.minX) / 2;
                    int n4 = infoDlg.minY + (infoDlg.maxY - infoDlg.minY) / 2 + this.Class297;
                    if (GameCanvas.Class6) {
                        n4 = infoDlg.maxY + (infoDlg.maxY - infoDlg.minY) + this.Class297 + 10;
                    }
                    Game2.Class1(mGraphics, 1213, n3, n4, 6, Game62.Class7);
                }
                else if (infoDlg.minY >= TileMap.pxh / 2) {
                    Game2.Class1(mGraphics, 1213, infoDlg.minX + (infoDlg.maxX - infoDlg.minX) / 2, infoDlg.minY - 12 - this.Class297, 4, Game62.Class7);
                }
            }
            else if (infoDlg.maxX <= TileMap.pxw / 2) {
                if (!GameCanvas.Class6) {
                    Game2.Class1(mGraphics, 1213, infoDlg.maxX + 12 + this.Class297, infoDlg.maxY - 12, 2, Game62.Class7);
                }
                else {
                    Game2.Class1(mGraphics, 1213, infoDlg.maxX + 12 + this.Class297, infoDlg.maxY - 32, 2, Game62.Class7);
                }
            }
            else if (infoDlg.minX >= TileMap.pxw / 2) {
                if (!GameCanvas.Class6) {
                    Game2.Class1(mGraphics, 1213, infoDlg.minX - 12 - this.Class297, infoDlg.maxY - 12, 0, Game62.Class7);
                }
                else {
                    Game2.Class1(mGraphics, 1213, infoDlg.minX - 12 - this.Class297, infoDlg.maxY - 32, 0, Game62.Class7);
                }
            }
        }
        mGraphics.Class4(0, -200, GameCanvas.Class25 - mGraphics.Class1(), 200 + GameCanvas.Class26 - mGraphics.Class2());
        GameCanvas.Class1().Class2(mGraphics);
        if (!Code.mChar) {
            for (int n5 = 0; n5 < GameScr.vCharInMap.size(); ++n5) {
                Char char1 = null;
                try {
                    char1 = (Char)GameScr.vCharInMap.elementAt(n5);
                }
                catch (Exception ex) {}
                if (char1 != null) {
                    if (TileMap.mapID == 111 && n5 > 19) {
                        char1.Class3(mGraphics);
                    }
                    else {
                        char1.Class1(mGraphics);
                    }
                }
            }
        }
        for (int n6 = 0; n6 < GameScr.vParty.size(); ++n6) {
            final Party party;
            if ((party = (Party)GameScr.vParty.elementAt(n6)).c != null && party.c != Char.getMyChar()) {
                party.c.Class2(mGraphics);
            }
        }
        for (int n7 = 0; n7 < 5; ++n7) {
            if (GameScr.Class325[n7] != -1 && GameCanvas.Class5(GameScr.Class321[n7], GameScr.Class322[n7])) {
                if (GameScr.Class326[n7] == 0) {
                    mFont.Class19.Class1(mGraphics, GameScr.Class320[n7], GameScr.Class321[n7], GameScr.Class322[n7], 2);
                }
                else if (GameScr.Class326[n7] == 1) {
                    mFont.Class18.Class1(mGraphics, GameScr.Class320[n7], GameScr.Class321[n7], GameScr.Class322[n7], 2);
                }
                else if (GameScr.Class326[n7] == 2) {
                    mFont.Class20.Class1(mGraphics, GameScr.Class320[n7], GameScr.Class321[n7], GameScr.Class322[n7], 2);
                }
                else if (GameScr.Class326[n7] == 3) {
                    mFont.Class6.drawString(mGraphics, GameScr.Class320[n7], GameScr.Class321[n7], GameScr.Class322[n7], 2, mFont.Class4);
                }
                else if (GameScr.Class326[n7] == 8) {
                    mFont.Class7.drawString(mGraphics, GameScr.Class320[n7], GameScr.Class321[n7], GameScr.Class322[n7], 2, mFont.Class4);
                }
                else if (GameScr.Class326[n7] == 4) {
                    Game2.Class1(mGraphics, 1062, GameScr.Class321[n7], GameScr.Class322[n7], 0, 3);
                }
                else if (GameScr.Class326[n7] == 5) {
                    mFont.Class22.Class1(mGraphics, GameScr.Class320[n7], GameScr.Class321[n7], GameScr.Class322[n7], 2);
                }
                else if (GameScr.Class326[n7] == 6) {
                    mFont.Class12.drawString(mGraphics, GameScr.Class320[n7], GameScr.Class321[n7], GameScr.Class322[n7], 2, mFont.Class14);
                }
                else if (GameScr.Class326[n7] == 7) {
                    Game2.Class1(mGraphics, 655, GameScr.Class321[n7], GameScr.Class322[n7], 0, 3);
                }
            }
        }
        for (int n8 = 0; n8 < GameScr.Class191.size(); ++n8) {
            final Game87 game50 = (Game87)GameScr.Class191.elementAt(n8);
            if (GameCanvas.gameTick % 10 < 8) {
                Game2.Class1(mGraphics, 1292, game50.Class1, game50.Class2, 0, 3);
            }
            else {
                Game2.Class1(mGraphics, 1291, game50.Class1, game50.Class2, 0, 3);
            }
        }
        for (int n9 = 0; n9 < 2; ++n9) {
            if (GameScr.Class329[n9] != -1) {
                if (GameScr.Class331[n9] == 1) {
                    mGraphics.Class1(GameScr.Class332[GameScr.Class330[n9]], GameScr.Class327[n9], GameScr.Class328[n9], 3);
                }
                else {
                    mGraphics.Class1(GameScr.Class332[GameScr.Class330[n9]], 0, 0, mGraphics.Class1(GameScr.Class332[GameScr.Class330[n9]]), mGraphics.Class2(GameScr.Class332[GameScr.Class330[n9]]), 2, GameScr.Class327[n9], GameScr.Class328[n9], 3);
                }
            }
        }
        Char.getMyChar().Class1(mGraphics);
        if (Char.getMyChar().Class4) {
            for (int n10 = 0; n10 < this.Class438.length; ++n10) {
                if (this.Class438[n10] != -1) {
                    int n11 = 0;
                    if (this.Class438[n10] == 0) {
                        n11 = 2;
                    }
                    else if (this.Class438[n10] == 1) {
                        n11 = 6;
                    }
                    else if (this.Class438[n10] == 2) {
                        n11 = 0;
                    }
                    Game2.Class1(mGraphics, 989, Char.getMyChar().cx + n10 * 10 - (this.Class438.length - 1) * 10 / 2, Char.getMyChar().cy - 40, n11, 3);
                }
            }
        }
        for (int n12 = 0; n12 < GameScr.Class190.size(); ++n12) {
            GameScr.Class190.elementAt(n12);
        }
        for (int n13 = 0; n13 < GameScr.vItemMap.size(); ++n13) {
            final ItemMap obj;
            if ((obj = (ItemMap)GameScr.vItemMap.elementAt(n13)).Class10 != null && obj.Class10.Class1 != null) {
                int status = 0;
                if (obj.status <= 0) {
                    status = obj.status;
                }
                mGraphics.Class1(obj.Class10.Class1, obj.x, obj.y + status, 33);
            }
            else {
                int status2 = 0;
                if (obj.status <= 0) {
                    status2 = obj.status;
                }
                Game2.Class1(mGraphics, obj.template.Class7, obj.x, obj.y + status2, 0, 33);
                if (Char.getMyChar().itemFocus != null && Char.getMyChar().itemFocus.equals(obj) && obj.status != 2) {
                    Game2.Class1(mGraphics, 988, obj.x, obj.y - 20, 0, 3);
                }
            }
        }
        for (int n14 = 0; n14 < GameScr.Class30.size(); ++n14) {
            ((Game38)GameScr.Class30.elementAt(n14)).Class1(mGraphics);
        }
        TileMap.Class3(mGraphics);
        if (Code.KCTSat > 0) {
            mGraphics.setColor(16711680);
            mGraphics.Class2(Code.KCTScx - Code.KCTSat, Code.KCTScy - Code.KCTSat, Code.KCTSat << 1, Code.KCTSat << 1);
        }
        if (Code.KCNhatXa > 0) {
            mGraphics.setColor(65280);
            mGraphics.Class2(Char.getMyChar().cx - Code.KCNhatXa, Char.getMyChar().cy - Code.KCNhatXa, Code.KCNhatXa << 1, Code.KCNhatXa << 1);
        }
        for (int n15 = 0; n15 < Game21.Class1.size(); ++n15) {
            ((Game21)Game21.Class1.elementAt(n15)).Class1(mGraphics);
        }
        for (int n16 = 0; n16 < GameScr.Class142.size(); ++n16) {
            ((Game54)GameScr.Class142.elementAt(n16)).Class1(mGraphics);
        }
        if (!GameCanvas.Class1) {
            for (int n17 = 0; n17 < Game21.Class4.size(); ++n17) {
                ((Game21)Game21.Class4.elementAt(n17)).Class1(mGraphics);
            }
        }
        for (int n18 = 0; n18 < GameScr.Class189.size(); ++n18) {
            GameScr.Class189.elementAt(n18);
        }
        try {
            final byte taskNpcId;
            if ((taskNpcId = getTaskNpcId()) != -1) {
                Char char2 = null;
                for (int n19 = 0; n19 < GameScr.vNpc.size(); ++n19) {
                    final Npc npc;
                    if ((npc = (Npc)GameScr.vNpc.elementAt(n19)).template.npcTemplateId == taskNpcId) {
                        if (char2 == null) {
                            char2 = npc;
                        }
                        else if (Res.abs(npc.cx - Char.getMyChar().cx) < Res.abs(char2.cx - Char.getMyChar().cx)) {
                            char2 = npc;
                        }
                    }
                }
                if (char2 != null && char2.statusMe != 15) {
                    if (char2.cx <= GameScr.Class16 || char2.cx >= GameScr.Class16 + GameScr.Class9 || char2.cy <= GameScr.Class17 || char2.cy >= GameScr.Class17 + GameScr.Class10) {
                        if (GameCanvas.gameTick % 10 >= 5) {
                            final int n20 = char2.cx - Char.getMyChar().cx;
                            final int n21 = char2.cy - Char.getMyChar().cy;
                            int n22 = 0;
                            int n23 = 0;
                            int n24 = 0;
                            if (n20 > 0 && n21 >= 0) {
                                if (Res.abs(n20) >= Res.abs(n21)) {
                                    n22 = GameScr.Class9 - 10;
                                    n23 = GameScr.Class10 / 2 + 30;
                                    if (GameCanvas.Class6) {
                                        n23 = GameScr.Class10 / 2 + 10;
                                    }
                                    n24 = 0;
                                }
                                else {
                                    n22 = GameScr.Class9 / 2;
                                    n23 = GameScr.Class10 - 10;
                                    n24 = 5;
                                }
                            }
                            else if (n20 >= 0 && n21 < 0) {
                                if (Res.abs(n20) >= Res.abs(n21)) {
                                    n22 = GameScr.Class9 - 10;
                                    n23 = GameScr.Class10 / 2 + 30;
                                    if (GameCanvas.Class6) {
                                        n23 = GameScr.Class10 / 2 + 10;
                                    }
                                    n24 = 0;
                                }
                                else {
                                    n22 = GameScr.Class9 / 2;
                                    n23 = 10;
                                    n24 = 6;
                                }
                            }
                            if (n20 < 0 && n21 >= 0) {
                                if (Res.abs(n20) >= Res.abs(n21)) {
                                    n22 = 10;
                                    n23 = GameScr.Class10 / 2 + 30;
                                    if (GameCanvas.Class6) {
                                        n23 = GameScr.Class10 / 2 + 10;
                                    }
                                    n24 = 3;
                                }
                                else {
                                    n22 = GameScr.Class9 / 2;
                                    n23 = GameScr.Class10 - 10;
                                    n24 = 5;
                                }
                            }
                            else if (n20 <= 0 && n21 < 0) {
                                if (Res.abs(n20) >= Res.abs(n21)) {
                                    n22 = 10;
                                    n23 = GameScr.Class10 / 2 + 30;
                                    if (GameCanvas.Class6) {
                                        n23 = GameScr.Class10 / 2 + 10;
                                    }
                                    n24 = 3;
                                }
                                else {
                                    n22 = GameScr.Class9 / 2;
                                    n23 = 10;
                                    n24 = 6;
                                }
                            }
                            Class2(mGraphics);
                            Game2.Class1(mGraphics, 992, n22, n23, n24, Game62.Class7);
                        }
                    }
                }
            }
        }
        catch (Exception ex2) {}
        if (GameCanvas.Class6) {
            Class2(mGraphics);
            this.Class71();
            int n25 = Char.getMyChar().cHP * GameScr.Class341 / Char.getMyChar().cMaxHP;
            final int n26 = Char.getMyChar().cMP * GameScr.Class342 / Char.getMyChar().cMaxMP;
            final int n27 = (int)(Char.getMyChar().Class30 * GameScr.Class343 / GameScr.Class98[Char.getMyChar().Class22]);
            if (n25 > GameScr.Class341) {
                n25 = 0;
            }
            mGraphics.setColor(-10585344);
            mGraphics.fillRect(0, GameScr.Class340 - 10, GameScr.Class343, 3);
            mGraphics.setColor(-10427136);
            mGraphics.fillRect(0, GameScr.Class340 - 10, n27, 3);
            mGraphics.setColor(-9756672);
            mGraphics.fillRect(0, GameScr.Class340 - 10, GameScr.Class343, 1);
            mGraphics.fillRect(0, GameScr.Class340 - 7, GameScr.Class343, 1);
            for (int n28 = 0; n28 < 10; ++n28) {
                mGraphics.fillRect(n28 * GameScr.Class343 / 10 - 1, GameScr.Class340 - 10, 1, 3);
            }
            mGraphics.setColor(-1769452);
            mGraphics.Class1(GameScr.Class264, GameScr.Class339 - 1, GameScr.Class340, 0);
            mGraphics.fillRect(GameScr.Class339, GameScr.Class340, n25, 9);
            mGraphics.setColor(-16755227);
            mGraphics.Class1(GameScr.Class264, GameScr.Class339 - 28, GameScr.Class340 + 13, 0);
            mGraphics.fillRect(GameScr.Class339, GameScr.Class340 + 16, n26, 7);
            mGraphics.Class1(GameScr.Class263, 0, GameScr.Class340 - 7, 0);
            mFont.Class21.Class1(mGraphics, new StringBuffer().append(Char.getMyChar().cHP).toString(), GameScr.Class339 + GameScr.Class341 / 2 - 30, GameScr.Class340 + 1, 0);
            mFont.Class21.Class1(mGraphics, new StringBuffer().append(Char.getMyChar().cMP).toString(), GameScr.Class339 + GameScr.Class341 / 2 - 30, GameScr.Class340 + 15, 0);
            mFont.Class17.Class1(mGraphics, new StringBuffer().append(Char.getMyChar().Class22).toString(), GameScr.Class339 - 27, GameScr.Class340 + 1, 2);
            long n29;
            if (Char.getMyChar().Class8 > 0L) {
                n29 = Char.getMyChar().Class8 * 10000L / GameScr.Class98[Char.getMyChar().Class22];
            }
            else {
                n29 = Char.getMyChar().Class30 * 10000L / GameScr.Class98[Char.getMyChar().Class22];
            }
            final int n30 = (int)(n29 % 100L);
            mFont.number_red.Class1(mGraphics, String.valueOf((Char.getMyChar().Class8 > 0L) ? new StringBuffer("-").append(n29 / 100L).toString() : new StringBuffer().append(n29 / 100L).toString()) + "." + ((n30 < 10) ? "0".concat(String.valueOf(n30)) : String.valueOf(n30)) + "%", GameScr.Class339 - 27, GameScr.Class340 + 13, 2);
        }
        if (!Char.getMyChar().Class4) {
            this.Class7(mGraphics);
            Class2(mGraphics);
            this.Class6(mGraphics);
            Class2(mGraphics);
            TileMap.Class2(mGraphics);
            mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
            if (!GameCanvas.Class6 || (GameCanvas.Class6 && !GameCanvas.Class7)) {
                mGraphics.Class4(0, GameScr.Class334 - 4, GameCanvas.Class25, 100);
                mGraphics.setColor(3612190);
                mGraphics.fillRect(GameScr.Class339 - 44, GameScr.Class340, 19, 19);
                mGraphics.setColor(265220);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 35, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 33, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 30, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 28, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 26, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 12, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 24, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 18, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 16, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 2, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 4, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 6, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 14, GameScr.Class338, 1);
                mGraphics.setColor(12562018);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 5, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 17, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 34, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 29, GameScr.Class338, 1);
                mGraphics.setColor(14667167);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 3, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 15, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 27, GameScr.Class338, 1);
                mGraphics.setColor(3355443);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 7, GameScr.Class338, 5);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 19, GameScr.Class338, 5);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 31, GameScr.Class338, 2);
                mGraphics.setColor(12281361);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 25, GameScr.Class338, 1);
                mGraphics.fillRect(GameScr.Class336, GameScr.Class334 + 13, GameScr.Class338, 1);
                mGraphics.Class1(GameScr.Class345[0], 0, GameScr.Class334 + 2, 0);
                mGraphics.Class1(GameScr.Class345[1], 0 + GameScr.Class335, GameScr.Class334 - 4, 24);
                int n31;
                if ((n31 = Char.getMyChar().cHP * GameScr.Class341 / Char.getMyChar().cMaxHP) > GameScr.Class341) {
                    n31 = 0;
                }
                mGraphics.setColor(7798784);
                mGraphics.fillRect(GameScr.Class339, GameScr.Class340, n31, 2);
                mGraphics.setColor(13369344);
                mGraphics.fillRect(GameScr.Class339, GameScr.Class340 + 1, n31, 4);
                int n32;
                if ((n32 = Char.getMyChar().cMP * GameScr.Class341 / Char.getMyChar().cMaxMP) > GameScr.Class341) {
                    n32 = 0;
                }
                mGraphics.setColor(4488);
                mGraphics.fillRect(GameScr.Class339, GameScr.Class340 + 12, n32, 2);
                mGraphics.setColor(4573);
                mGraphics.fillRect(GameScr.Class339, GameScr.Class340 + 14, n32, GameScr.Class344 - 2);
                final int n33 = (int)(Char.getMyChar().Class30 * GameScr.Class343 / GameScr.Class98[Char.getMyChar().Class22]);
                mGraphics.setColor(94373);
                mGraphics.fillRect(46, GameScr.Class334 + 31, n33, 1);
                mGraphics.setColor(65535);
                mGraphics.fillRect(46, GameScr.Class334 + 32, n33, 1);
                mFont.Class18.Class1(mGraphics, new StringBuffer().append(Char.getMyChar().Class22).toString(), 28, GameScr.Class334 + 9, 2);
                long n34;
                if (Char.getMyChar().Class8 > 0L) {
                    n34 = Char.getMyChar().Class8 * 10000L / GameScr.Class98[Char.getMyChar().Class22];
                }
                else {
                    n34 = Char.getMyChar().Class30 * 10000L / GameScr.Class98[Char.getMyChar().Class22];
                }
                final int n35 = (int)(n34 % 100L);
                mFont.number_red.Class1(mGraphics, String.valueOf((Char.getMyChar().Class8 > 0L) ? new StringBuffer("-").append(n34 / 100L).toString() : new StringBuffer().append(n34 / 100L).toString()) + "." + ((n35 < 10) ? "0".concat(String.valueOf(n35)) : String.valueOf(n35)) + "%", 24, GameScr.Class334 + 23, 2);
                mFont.Class20.Class1(mGraphics, new StringBuffer().append(GameScr.Class25).toString(), GameScr.Class335 - 11, GameScr.Class334 + 6, 2);
                mFont.Class20.Class1(mGraphics, new StringBuffer().append(GameScr.Class24).toString(), GameScr.Class335 - 11, GameScr.Class334 + 18, 2);
                mFont.Class21.Class1(mGraphics, new StringBuffer().append(Char.getMyChar().cHP).toString(), GameScr.Class339 + GameScr.Class341 / 2, GameScr.Class334 + 6, 2);
                mFont.Class21.Class1(mGraphics, new StringBuffer().append(Char.getMyChar().cMP).toString(), GameScr.Class339 + GameScr.Class341 / 2, GameScr.Class334 + 18, 2);
                if (Char.getMyChar().vSkillFight.size() > 0 && Char.getMyChar().myskill != null) {
                    Char.getMyChar().myskill.Class1(GameScr.Class336 - 28, GameScr.Class340 + 7, mGraphics);
                }
                mGraphics.setColor(9463099);
                mGraphics.fillRect(0, GameScr.Class334 + 35, GameCanvas.Class25, 1);
            }
            else {
                Game25.Class1(mGraphics);
            }
            if (GameCanvas.Class6) {
                GameScr.Class208 = true;
            }
            Class2(mGraphics);
            this.Class9(mGraphics);
            Class2(mGraphics);
            mGraphics.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26);
            for (int n36 = 0; n36 < Game21.Class3.size(); ++n36) {
                ((Game21)Game21.Class3.elementAt(n36)).Class1(mGraphics);
            }
            Class2(mGraphics);
            if (GameScr.Class93) {
                if (GameScr.indexMenu == 0) {
                    this.Class1(mGraphics, Game86.Class163);
                }
                this.Class14(mGraphics);
                Class30(mGraphics);
                Label_6972: {
                    if (GameScr.indexMenu == 3) {
                        Class2(mGraphics);
                        Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
                        if (GameScr.Class193 == 1) {
                            mGraphics.setColor(Game25.Class3);
                            mGraphics.fillRect(GameScr.Class157 + 7, GameScr.Class156 + 32, GameScr.Class158 - 14, GameScr.Class159 - 40);
                            mGraphics.setColor(16777215);
                        }
                        else {
                            mGraphics.setColor(10249521);
                        }
                        mGraphics.Class2(GameScr.Class157 + 7, GameScr.Class156 + 32, GameScr.Class158 - 14, GameScr.Class159 - 40);
                        Class1(mGraphics, Game86.Class163[GameScr.indexMenu], true);
                        GameScr.Class394 = GameScr.Class157 + 17;
                        GameScr.Class395 = GameScr.Class156 + 34;
                        GameScr.Class50.Class1(GameScr.Class194, 12, GameScr.Class157, GameScr.Class156 + 35, GameScr.Class158, GameScr.Class159 - 44, true, 1);
                        GameScr.Class50.Class1(mGraphics);
                        if (GameScr.Class278 == 0) {
                            GameScr.Class194 = 19;
                            int class395 = GameScr.Class395;
                            if (GameScr.Class97 == null) {
                                break Label_6972;
                            }
                            mFont.Class7.Class1(mGraphics, String.valueOf(Game86.Class249[0]) + GameScr.Class97.cName, GameScr.Class394, class395, 0);
                            final mFont number_red = mFont.number_red;
                            final String string = String.valueOf(Game86.Class249[1]) + GameScr.Class97.cPk;
                            final int class396 = GameScr.Class394;
                            class395 += 12;
                            number_red.Class1(mGraphics, string, class396, class395, 0);
                            final mFont number_red2 = mFont.number_red;
                            final String string2 = String.valueOf(Game86.Class249[2]) + GameScr.Class97.Class22;
                            final int class397 = GameScr.Class394;
                            class395 += 12;
                            number_red2.Class1(mGraphics, string2, class397, class395, 0);
                            final mFont class398 = mFont.Class10;
                            final String string3 = String.valueOf(Game86.Class249[3]) + GameScr.Class97.nClass.Class2;
                            final int class399 = GameScr.Class394;
                            class395 += 12;
                            class398.Class1(mGraphics, string3, class399, class395, 0);
                            final mFont class400 = mFont.Class10;
                            final String string4 = String.valueOf(Game86.Class249[4]) + Game86.Class297[GameScr.Class97.Class1()];
                            final int class401 = GameScr.Class394;
                            class395 += 12;
                            class400.Class1(mGraphics, string4, class401, class395, 0);
                            final mFont number_red3 = mFont.number_red;
                            final String string5 = String.valueOf(Game86.Class249[5]) + GameScr.Class97.cHP + "/" + GameScr.Class97.cMaxHP;
                            final int class402 = GameScr.Class394;
                            class395 += 12;
                            number_red3.Class1(mGraphics, string5, class402, class395, 0);
                            final mFont number_red4 = mFont.number_red;
                            final String string6 = String.valueOf(Game86.Class249[6]) + GameScr.Class97.cMP + "/" + GameScr.Class97.cMaxMP;
                            final int class403 = GameScr.Class394;
                            class395 += 12;
                            number_red4.Class1(mGraphics, string6, class403, class395, 0);
                            final mFont number_red5 = mFont.number_red;
                            final String string7 = String.valueOf(Game86.Class249[7]) + GameScr.Class97.Class2();
                            final int class404 = GameScr.Class394;
                            class395 += 12;
                            number_red5.Class1(mGraphics, string7, class404, class395, 0);
                            final mFont number_red6 = mFont.number_red;
                            final String string8 = String.valueOf(Game86.Class249[8]) + (GameScr.Class97.Class20 - GameScr.Class97.Class20 / 10) + "-" + GameScr.Class97.Class20;
                            final int class405 = GameScr.Class394;
                            class395 += 12;
                            number_red6.Class1(mGraphics, string8, class405, class395, 0);
                            final mFont number_red7 = mFont.number_red;
                            final String string9 = String.valueOf(Game86.Class249[9]) + GameScr.Class97.Class82;
                            final int class406 = GameScr.Class394;
                            class395 += 12;
                            number_red7.Class1(mGraphics, string9, class406, class395, 0);
                            final mFont number_red8 = mFont.number_red;
                            final String string10 = String.valueOf(Game86.Class249[10]) + GameScr.Class97.Class83;
                            final int class407 = GameScr.Class394;
                            class395 += 12;
                            number_red8.Class1(mGraphics, string10, class407, class395, 0);
                            final mFont number_red9 = mFont.number_red;
                            final String string11 = String.valueOf(Game86.Class249[11]) + GameScr.Class97.Class84;
                            final int class408 = GameScr.Class394;
                            class395 += 12;
                            number_red9.Class1(mGraphics, string11, class408, class395, 0);
                            final mFont number_red10 = mFont.number_red;
                            final String string12 = String.valueOf(Game86.Class249[12]) + GameScr.Class97.Class21;
                            final int class409 = GameScr.Class394;
                            class395 += 12;
                            number_red10.Class1(mGraphics, string12, class409, class395, 0);
                            final mFont number_red11 = mFont.number_red;
                            final String string13 = String.valueOf(Game86.Class249[13]) + GameScr.Class97.Class86;
                            final int class410 = GameScr.Class394;
                            class395 += 12;
                            number_red11.Class1(mGraphics, string13, class410, class395, 0);
                            final mFont number_red12 = mFont.number_red;
                            final String string14 = String.valueOf(Game86.Class249[14]) + GameScr.Class97.Class85;
                            final int class411 = GameScr.Class394;
                            class395 += 12;
                            number_red12.Class1(mGraphics, string14, class411, class395, 0);
                            final mFont number_red13 = mFont.number_red;
                            final String string15 = String.valueOf(Game86.Class249[15]) + GameScr.Class97.Class87;
                            final int class412 = GameScr.Class394;
                            class395 += 12;
                            number_red13.Class1(mGraphics, string15, class412, class395, 0);
                            final mFont number_red14 = mFont.number_red;
                            final String string16 = String.valueOf(Game86.Class249[16]) + GameScr.Class97.Class90;
                            final int class413 = GameScr.Class394;
                            class395 += 12;
                            number_red14.Class1(mGraphics, string16, class413, class395, 0);
                            final mFont number_red15 = mFont.number_red;
                            final String string17 = String.valueOf(Game86.Class249[17]) + GameScr.Class97.Class91;
                            final int class414 = GameScr.Class394;
                            class395 += 12;
                            number_red15.Class1(mGraphics, string17, class414, class395, 0);
                            final mFont number_red16 = mFont.number_red;
                            final String string18 = String.valueOf(Game86.Class249[18]) + GameScr.Class97.Class92;
                            final int class415 = GameScr.Class394;
                            class395 += 12;
                            number_red16.Class1(mGraphics, string18, class415, class395, 0);
                        }
                        else if (GameScr.Class278 == 1) {
                            GameScr.Class194 = 20;
                            int class416 = GameScr.Class395;
                            if (GameScr.Class97 == null) {
                                break Label_6972;
                            }
                            mFont.Class7.Class1(mGraphics, String.valueOf(Game86.Class252[15]) + (GameScr.Class97.Class55.equals("") ? Game86.Class223 : GameScr.Class97.Class55), GameScr.Class394, class416, 0);
                            final mFont number_red17 = mFont.number_red;
                            final String string19 = String.valueOf(Game86.Class252[0]) + GameScr.Class97.Class33;
                            final int class417 = GameScr.Class394;
                            class416 += 12;
                            number_red17.Class1(mGraphics, string19, class417, class416, 0);
                            final mFont class418 = mFont.Class10;
                            final String string20 = String.valueOf(Game86.Class252[11]) + GameScr.Class97.Class45 + "/20";
                            final int class419 = GameScr.Class394;
                            class416 += 12;
                            class418.Class1(mGraphics, string20, class419, class416, 0);
                            final mFont class420 = mFont.Class10;
                            final String string21 = String.valueOf(Game86.Class252[12]) + GameScr.Class97.Class46 + Game86.Class250;
                            final int class421 = GameScr.Class394;
                            class416 += 12;
                            class420.Class1(mGraphics, string21, class421, class416, 0);
                            final mFont class422 = mFont.Class10;
                            final String string22 = String.valueOf(Game86.Class252[16]) + GameScr.Class97.Class51 + Game86.Class250;
                            final int class423 = GameScr.Class394;
                            class416 += 12;
                            class422.Class1(mGraphics, string22, class423, class416, 0);
                            final mFont number_red18 = mFont.number_red;
                            final String string23 = String.valueOf(Game86.Class252[13]) + GameScr.Class97.Class47;
                            final int class424 = GameScr.Class394;
                            class416 += 12;
                            number_red18.Class1(mGraphics, string23, class424, class416, 0);
                            final mFont number_red19 = mFont.number_red;
                            final String string24 = String.valueOf(Game86.Class252[14]) + GameScr.Class97.Class48;
                            final int class425 = GameScr.Class394;
                            class416 += 12;
                            number_red19.Class1(mGraphics, string24, class425, class416, 0);
                            final mFont number_red20 = mFont.number_red;
                            final String string25 = String.valueOf(Game86.Class252[18]) + GameScr.Class97.Class49 + Game86.Class250;
                            final int class426 = GameScr.Class394;
                            class416 += 12;
                            number_red20.Class1(mGraphics, string25, class426, class416, 0);
                            final mFont number_red21 = mFont.number_red;
                            final String string26 = String.valueOf(Game86.Class252[19]) + GameScr.Class97.Class50 + Game86.Class250;
                            final int class427 = GameScr.Class394;
                            class416 += 12;
                            number_red21.Class1(mGraphics, string26, class427, class416, 0);
                            final mFont number_red22 = mFont.number_red;
                            final String string27 = String.valueOf(Game86.Class252[17]) + GameScr.Class97.Class44;
                            final int class428 = GameScr.Class394;
                            class416 += 12;
                            number_red22.Class1(mGraphics, string27, class428, class416, 0);
                            final mFont number_red23 = mFont.number_red;
                            final String string28 = String.valueOf(Game86.Class252[1]) + GameScr.Class97.Class35;
                            final int class429 = GameScr.Class394;
                            class416 += 12;
                            number_red23.Class1(mGraphics, string28, class429, class416, 0);
                            final mFont number_red24 = mFont.number_red;
                            final String string29 = String.valueOf(Game86.Class252[2]) + GameScr.Class97.Class37;
                            final int class430 = GameScr.Class394;
                            class416 += 12;
                            number_red24.Class1(mGraphics, string29, class430, class416, 0);
                            final mFont number_red25 = mFont.number_red;
                            final String string30 = String.valueOf(Game86.Class252[3]) + GameScr.Class97.Class39;
                            final int class431 = GameScr.Class394;
                            class416 += 12;
                            number_red25.Class1(mGraphics, string30, class431, class416, 0);
                            final mFont number_red26 = mFont.number_red;
                            final String string31 = String.valueOf(Game86.Class252[4]) + GameScr.Class97.Class41;
                            final int class432 = GameScr.Class394;
                            class416 += 12;
                            number_red26.Class1(mGraphics, string31, class432, class416, 0);
                            final mFont number_red27 = mFont.number_red;
                            final String string32 = String.valueOf(Game86.Class252[5]) + GameScr.Class97.Class43;
                            final int class433 = GameScr.Class394;
                            class416 += 12;
                            number_red27.Class1(mGraphics, string32, class433, class416, 0);
                            final mFont number_red28 = mFont.number_red;
                            final String string33 = String.valueOf(Game86.Class252[6]) + GameScr.Class97.Class34;
                            final int class434 = GameScr.Class394;
                            class416 += 12;
                            number_red28.Class1(mGraphics, string33, class434, class416, 0);
                            final mFont number_red29 = mFont.number_red;
                            final String string34 = String.valueOf(Game86.Class252[7]) + GameScr.Class97.Class36;
                            final int class435 = GameScr.Class394;
                            class416 += 12;
                            number_red29.Class1(mGraphics, string34, class435, class416, 0);
                            final mFont number_red30 = mFont.number_red;
                            final String string35 = String.valueOf(Game86.Class252[8]) + GameScr.Class97.Class38;
                            final int class436 = GameScr.Class394;
                            class416 += 12;
                            number_red30.Class1(mGraphics, string35, class436, class416, 0);
                            final mFont number_red31 = mFont.number_red;
                            final String string36 = String.valueOf(Game86.Class252[9]) + GameScr.Class97.Class40;
                            final int class437 = GameScr.Class394;
                            class416 += 12;
                            number_red31.Class1(mGraphics, string36, class437, class416, 0);
                            final mFont number_red32 = mFont.number_red;
                            final String string37 = String.valueOf(Game86.Class252[10]) + GameScr.Class97.Class42;
                            final int class438 = GameScr.Class394;
                            class416 += 12;
                            number_red32.Class1(mGraphics, string37, class438, class416, 0);
                        }
                        if (GameScr.Class193 == 1 && GameScr.indexRow >= 0) {
                            Game2.Class1(mGraphics, 942, GameScr.Class394 - 8, GameScr.Class395 + 2 + GameScr.indexRow * 12, 0, Game62.Class2);
                        }
                    }
                }
                this.Class10(mGraphics);
                this.Class11(mGraphics);
                this.Class48(mGraphics);
            }
            else if (Class27()) {
                if (GameScr.Class209) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class184, GameScr.Class70);
                    }
                    else if (GameScr.indexMenu == 1) {
                        Class1(mGraphics, Game86.Class184, GameScr.Class73);
                    }
                    else if (GameScr.indexMenu == 2) {
                        Class1(mGraphics, Game86.Class184, GameScr.Class74);
                    }
                    else if (GameScr.indexMenu == 3) {
                        Class1(mGraphics, Game86.Class184, GameScr.Class72);
                    }
                    else if (GameScr.indexMenu == 51) {
                        Class2(mGraphics, GameScr.Class74);
                    }
                }
                if (GameScr.Class211) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class164, GameScr.Class51);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class165);
                    }
                }
                if (GameScr.Class212) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class164, GameScr.Class52);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class165);
                    }
                }
                if (GameScr.Class213) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class164, GameScr.Class53);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class166);
                    }
                }
                if (GameScr.Class214) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class164, GameScr.Class54);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class166);
                    }
                }
                if (GameScr.Class215) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class164, GameScr.Class55);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class167);
                    }
                }
                if (GameScr.Class216) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class164, GameScr.Class56);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class167);
                    }
                }
                if (GameScr.Class217) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class164, GameScr.Class57);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class168);
                    }
                }
                if (GameScr.Class218) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class168, GameScr.Class58);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class168);
                    }
                }
                if (GameScr.Class219) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class164, GameScr.Class59);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class169);
                    }
                }
                if (GameScr.Class220) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class164, GameScr.Class60);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class169);
                    }
                }
                if (GameScr.Class221) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class170, GameScr.Class61);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class170);
                    }
                }
                if (GameScr.Class222) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class171, GameScr.Class62);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class171);
                    }
                }
                if (GameScr.Class223) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class172, GameScr.Class63);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class172);
                    }
                }
                if (GameScr.Class224) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class173, GameScr.Class64);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class173);
                    }
                }
                if (GameScr.Class225) {
                    if (GameScr.indexMenu == 0) {
                        Class1(mGraphics, Game86.Class174, GameScr.Class65);
                    }
                    else if (GameScr.indexMenu == 1) {
                        this.Class1(mGraphics, Game86.Class174);
                    }
                }
                if (GameScr.Class210) {
                    Class1(mGraphics, Game86.Class185, GameScr.Class71);
                }
                this.Class15(mGraphics);
                this.Class16(mGraphics);
                this.Class17(mGraphics);
                this.Class18(mGraphics);
                this.Class19(mGraphics);
                this.Class20(mGraphics);
                this.Class21(mGraphics);
                Class35(mGraphics);
                this.Class22(mGraphics);
                this.Class23(mGraphics);
                this.Class24(mGraphics);
                this.Class25(mGraphics);
                this.Class27(mGraphics);
                this.Class28(mGraphics);
                this.Class29(mGraphics);
                this.Class26(mGraphics);
                this.Class43(mGraphics);
                this.Class44(mGraphics);
                this.Class47(mGraphics);
                this.Class45(mGraphics);
                this.Class46(mGraphics);
                this.ItemNhat(mGraphics);
                this.ItemVut(mGraphics);
                this.ItemBan(mGraphics);
            }
            else if (GameScr.isPaintZone) {
                this.Class31(mGraphics);
            }
            Class3(mGraphics);
            this.Class37(mGraphics);
            this.Class5(mGraphics);
            Class34(mGraphics);
            Class33(mGraphics);
            Class36(mGraphics);
            Class4(mGraphics);
            this.Class12(mGraphics);
            this.Class38(mGraphics);
            Class40(mGraphics);
            Class2(mGraphics);
            if (GameCanvas.Class6 && GameCanvas.Class25 >= 320) {
                if (super.left != null && super.left != this.Class286) {
                    super.left.Class6 = GameCanvas.Class25 / 2 - 160;
                    super.left.Class7 = GameCanvas.Class26 - 26;
                }
                if (super.center != null) {
                    super.center.Class6 = GameCanvas.Class25 / 2 - 35;
                    super.center.Class7 = GameCanvas.Class26 - 26;
                }
                if (super.right != null && super.right != this.Class184) {
                    super.right.Class6 = GameCanvas.Class25 / 2 + 88;
                    super.right.Class7 = GameCanvas.Class26 - 26;
                }
            }
        }
        super.Class1(mGraphics);
        if (GameCanvas.Class6 && GameCanvas.Class7) {
            this.Class8(mGraphics);
            GameScr.Class208 = true;
        }
        Class2(mGraphics);
        this.Class32(mGraphics);
        Class2(mGraphics);
        this.Class41(mGraphics);
        Class2(mGraphics);
        Info.Class1(mGraphics);
        Class2(mGraphics);
        final Game23 class439;
        if ((class439 = Game23.Class1()).Class2) {
            class439.Class1.Class1(mGraphics);
        }
        Class2(mGraphics);
        InfoMe.Class1(mGraphics);
    }
    
    private static void Class3(final mGraphics mGraphics) {
        if (!GameScr.TuDong) {
            return;
        }
        Class2(mGraphics);
        Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
        if (GameScr.Class193 == 1) {
            mGraphics.setColor(Game25.Class3);
            mGraphics.fillRect(GameScr.Class157 + 7, GameScr.Class156 + 32, GameScr.Class158 - 14, GameScr.Class159 - 55);
            mGraphics.setColor(16777215);
        }
        else {
            mGraphics.setColor(10249521);
        }
        mGraphics.Class2(GameScr.Class157 + 7, GameScr.Class156 + 32, GameScr.Class158 - 14, GameScr.Class159 - 55);
        Class1(mGraphics, Game86.Class382[7], false);
        GameScr.Class394 = GameScr.Class157 + 17;
        GameScr.Class395 = GameScr.Class156 + 45;
        GameScr.Class194 = 7;
        GameScr.Class50.Class1(GameScr.Class194, 35, GameScr.Class157, GameScr.Class156 + 39, GameScr.Class158, GameScr.Class159 - 63, true, 1);
        GameScr.Class50.Class1(mGraphics);
        int class395 = GameScr.Class395;
        Class1(mGraphics, Game86.Class469[0], Char.Class109, String.valueOf(Char.aHpValue) + "%", GameScr.Class394, class395);
        final String s = Game86.Class469[1];
        final boolean class396 = Char.Class110;
        final String string = String.valueOf(Char.aMpValue) + "%";
        final int class397 = GameScr.Class394;
        class395 += 30;
        Class1(mGraphics, s, class396, string, class397, class395);
        final String s2 = Game86.Class469[2];
        final boolean class398 = Char.Class111;
        final String string2 = new StringBuffer(String.valueOf(Char.Class121)).toString();
        final int class399 = GameScr.Class394;
        class395 += 30;
        Class1(mGraphics, s2, class398, string2, class399, class395);
        final String s3 = Game86.Class469[3];
        final boolean isABuff = Char.isABuff;
        final String s4 = "";
        final int class400 = GameScr.Class394;
        class395 += 30;
        Class1(mGraphics, s3, isABuff, s4, class400, class395);
        final String s5 = Game86.Class469[4];
        final boolean isAPickYen = Char.isAPickYen;
        final String s6 = "";
        final int class401 = GameScr.Class394;
        class395 += 30;
        Class1(mGraphics, s5, isAPickYen, s6, class401, class395);
        final String s7 = Game86.Class469[5];
        final boolean class402 = Char.Class114;
        final String s8 = "";
        final int class403 = GameScr.Class394;
        class395 += 30;
        Class1(mGraphics, s7, class402, s8, class403, class395);
        final String s9 = Game86.Class469[6];
        final boolean class404 = Char.Class115;
        final String s10 = "";
        final int class405 = GameScr.Class394;
        class395 += 30;
        Class1(mGraphics, s9, class404, s10, class405, class395);
        final String s11 = Game86.Class469[7];
        final boolean class406 = Char.Class116;
        final String s12 = "";
        final int class407 = GameScr.Class394;
        class395 += 30;
        Class1(mGraphics, s11, class406, s12, class407, class395);
        if (GameScr.Class193 == 1 && GameScr.indexRow >= 0 && !GameCanvas.Class6) {
            Game2.Class1(mGraphics, 942, GameScr.Class394 - 8, GameScr.Class395 + 2 + GameScr.indexRow * 30, 0, Game62.Class2);
        }
        Class2(mGraphics);
        mFont.Class16.Class1(mGraphics, GameCanvas.Class6 ? Game86.Class471 : Game86.Class470, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 17, 2);
    }
    
    private static void Class1(final mGraphics mGraphics, final String s, final boolean b, final String s2, final int n, final int n2) {
        mGraphics.setColor(16777215);
        mGraphics.fillRect(n, n2, 12, 12);
        if (b) {
            mGraphics.setColor(9650442);
            mGraphics.drawLine(n + 2, n2 + 2, n + 2 + 7, n2 + 2 + 7);
            mGraphics.drawLine(n + 2, n2 + 2 + 7, n + 2 + 7, n2 + 2);
        }
        final mFont mFont;
        (mFont = (b ? mFont.number_red : mFont.Class13)).Class1(mGraphics, s, n + 18, n2, 0);
        if (s2.equals("")) {
            return;
        }
        mGraphics.setColor(Game25.Class2);
        mGraphics.fillRect(n + 115, n2 - 3, 30, 20);
        mGraphics.setColor(b ? 16777215 : 0);
        mGraphics.Class2(n + 115, n2 - 3, 30, 20);
        mFont.Class1(mGraphics, s2, n + 133, n2 + 2, 2);
    }
    
    private static void Class4(final mGraphics mGraphics) {
        if (GameScr.Class206) {
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, Game86.Class109, false);
            GameScr.Class394 = GameScr.Class157 + 5;
            GameScr.Class395 = GameScr.Class156 + 40;
            if (GameScr.Class35.size() == 0) {
                mFont.number_red.Class1(mGraphics, Game86.Class379, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + 40, 2);
                return;
            }
            mGraphics.setColor(-16770791);
            mGraphics.fillRect(GameScr.Class394 - 2, GameScr.Class395 - 2, GameScr.Class158 - 6, GameScr.Class192 * 5 + 8);
            Class2(mGraphics);
            GameScr.Class50.Class1(GameScr.Class35.size(), GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 4, true, 1);
            GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 6);
            GameScr.Class194 = GameScr.Class35.size();
            for (int i = 0; i < GameScr.Class35.size(); ++i) {
                Game103 game103 = null;
                try {
                    game103 = (Game103)GameScr.Class35.elementAt(i);
                }
                catch (Exception ex) {}
                if (game103 != null) {
                    if (GameScr.indexRow == i) {
                        mGraphics.setColor(Game25.Class2);
                        mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                        mGraphics.setColor(16777215);
                        mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                    }
                    else {
                        mGraphics.setColor(Game25.Class1);
                        mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                        mGraphics.setColor(13932896);
                        mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                    }
                    mFont.Class12.Class1(mGraphics, game103.Class2, GameScr.Class394 + (GameScr.Class158 - 10) / 2 - GameScr.Class158 / 4, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 2);
                    mFont.Class3.Class1(mGraphics, " vs ", GameScr.Class394 + (GameScr.Class158 - 10) / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 2);
                    mFont.Class12.Class1(mGraphics, game103.Class3, GameScr.Class394 + (GameScr.Class158 - 10) / 2 + GameScr.Class158 / 4, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 2);
                }
            }
            Class13(mGraphics);
        }
    }
    
    private void Class5(final mGraphics mGraphics) {
        if (GameScr.Class236) {
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, Game86.Class109, false);
            GameScr.Class394 = GameScr.Class157 + 5;
            GameScr.Class395 = GameScr.Class156 + 40;
            if (GameScr.vCharInMap.size() == 0) {
                mFont.number_red.Class1(mGraphics, Game86.Class319, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + 40, 2);
                return;
            }
            mGraphics.setColor(-16770791);
            mGraphics.fillRect(GameScr.Class394 - 2, GameScr.Class395 - 2, GameScr.Class158 - 6, GameScr.Class192 * 5 + 8);
            Class2(mGraphics);
            GameScr.Class50.Class1(GameScr.vCharInMap.size(), GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 4, true, 1);
            GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 6);
            GameScr.Class194 = GameScr.vCharInMap.size();
            for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
                Char char1 = null;
                try {
                    if ((char1 = (Char)GameScr.vCharInMap.elementAt(i)).Class3) {
                        continue;
                    }
                }
                catch (Exception ex) {}
                if (char1 != null) {
                    if (GameScr.indexRow == i) {
                        mGraphics.setColor(Game25.Class2);
                        mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                        mGraphics.setColor(16777215);
                        mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                    }
                    else {
                        mGraphics.setColor(Game25.Class1);
                        mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                        mGraphics.setColor(13932896);
                        mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                    }
                    Game2.Class1(mGraphics, 647, GameScr.Class394 + 12, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    if (this.Class114 > 0 && this.Class114 == char1.charID) {
                        mFont.Class12.Class1(mGraphics, String.valueOf(char1.cName) + " - " + Game86.Class126 + ": " + char1.Class22, GameScr.Class394 + 22, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 0);
                    }
                    else if (char1.statusMe == 14) {
                        mFont.Class13.Class1(mGraphics, String.valueOf(char1.cName) + " - " + Game86.Class126 + ": " + char1.Class22, GameScr.Class394 + 22, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 0);
                    }
                    else {
                        mFont.Class16.Class1(mGraphics, String.valueOf(char1.cName) + " - " + Game86.Class126 + ": " + char1.Class22, GameScr.Class394 + 22, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 0);
                    }
                }
            }
            Class13(mGraphics);
        }
    }
    
    private void Class6(final mGraphics mGraphics) {
        try {
            final int n = (int)(System.currentTimeMillis() / 1000L);
            int n2 = 5;
            if (GameCanvas.Class6 && GameCanvas.Class7) {
                n2 = 45 + Info.Class1;
            }
            if (GameCanvas.Class8 && Char.getMyChar().vSkillFight.size() > 4) {
                n2 += 25;
            }
            Class2(mGraphics);
            if (!GameCanvas.Class9) {
                for (int i = 0; i < Char.getMyChar().vEff.size(); ++i) {
                    final Effect effect = (Effect)Char.getMyChar().vEff.elementAt(i);
                    Game2.Class1(mGraphics, effect.template.iconId, GameCanvas.Class25 - 13 - (i * 13 << 1), n2 + 14, 0, 33);
                    final int n3;
                    if ((n3 = effect.timeLenght - (n - effect.timeStart)) >= 0) {
                        mFont.number_red.drawString(mGraphics, Game20.Class2(n3), GameCanvas.Class25 - 13 - (i * 13 << 1), n2 + 15, 2, mFont.Class13);
                    }
                }
                final int n4 = this.Class134 - (n - this.Class135);
                if (Char.getMyChar().vEff.size() > 0) {
                    n2 += 27;
                }
                if (n4 > 0) {
                    mFont.number_red.drawString(mGraphics, String.valueOf(Game86.Class110) + ": " + Game20.Class2(n4), GameCanvas.Class25 - 2, n2, 1, mFont.Class13);
                    n2 += 12;
                }
                if (TileMap.Class14 == 1) {
                    mFont.number_red.drawString(mGraphics, String.valueOf(Game86.Class111) + ": " + Char.getMyChar().Class105, GameCanvas.Class25 - 2, n2, 1, mFont.Class13);
                    n2 += 12;
                    mFont.number_red.drawString(mGraphics, String.valueOf(Game86.Class112) + ": " + Char.getMyChar().Class106, GameCanvas.Class25 - 2, n2, 1, mFont.Class13);
                    n2 += 12;
                }
                else if (TileMap.Class14 == 2 || TileMap.mapID == 114 || TileMap.mapID == 115 || TileMap.mapID == 116) {
                    mFont.number_red.drawString(mGraphics, String.valueOf(Game86.Class113) + ": " + Char.Class124, GameCanvas.Class25 - 2, n2, 1, mFont.Class13);
                    n2 += 12;
                }
                else if (TileMap.Class14 == 3) {
                    mFont.number_red.drawString(mGraphics, String.valueOf(Game86.Class113) + ": " + Char.Class125, GameCanvas.Class25 - 2, n2, 1, mFont.Class13);
                    n2 += 12;
                    mFont.number_red.drawString(mGraphics, Game86.Class251[Char.Class26()], GameCanvas.Class25 - 2, n2, 1, mFont.Class13);
                    n2 += 12;
                }
            }
            if (GameScr.vParty.size() > 0 && GameCanvas.Class25 > 128 && !Class27()) {
                n2 -= 18;
                for (int j = 0; j < GameScr.vParty.size(); ++j) {
                    final Party party;
                    if ((party = (Party)GameScr.vParty.elementAt(j)).c != null) {
                        final mFont number_red = mFont.number_red;
                        final String string = String.valueOf(party.name) + "(" + party.c.Class22 + ")";
                        final int n5 = GameCanvas.Class25 - 14;
                        n2 += 18;
                        number_red.drawString(mGraphics, string, n5, n2, 1, mFont.Class13);
                        party.c.Class1(mGraphics, GameCanvas.Class25 - 41, n2 + 12);
                        Game2.Class1(mGraphics, party.Class3, GameCanvas.Class25 - 7, n2 + 9, 0, 3);
                    }
                    else {
                        n2 += 16;
                        mFont.Class16.drawString(mGraphics, party.name, GameCanvas.Class25 - 14, n2 + 5, 1, mFont.Class13);
                        Game2.Class1(mGraphics, party.Class3, GameCanvas.Class25 - 7, n2 + 11, 0, 3);
                    }
                }
            }
        }
        catch (Exception ex) {}
    }
    
    public static void Class2(final mGraphics mGraphics) {
        mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        mGraphics.Class4(0, -200, GameCanvas.Class25, 200 + GameCanvas.Class26);
    }
    
    private void Class7(final mGraphics mGraphics) {
        try {
            if (GameCanvas.Class30.Class1) {
                return;
            }
            if (InfoDlg.Class1) {
                return;
            }
            if (Class83()) {
                return;
            }
            int n = -7;
            int n2 = 3;
            if ((!GameCanvas.Class6 || (GameCanvas.Class6 && !GameCanvas.Class7)) && GameScr.Class208) {
                n2 += 30;
            }
            if (GameCanvas.Class6) {
                n = -7 + (45 + Info.Class1);
                if (GameCanvas.Class8) {
                    n += 35;
                }
            }
            mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
            if (GameCanvas.Class9) {
                final int n3 = (int)(System.currentTimeMillis() / 1000L);
                for (int i = 0; i < Char.getMyChar().vEff.size(); ++i) {
                    final Effect effect = (Effect)Char.getMyChar().vEff.elementAt(i);
                    Game2.Class1(mGraphics, effect.template.iconId, n2 + 13 + (i * 13 << 1), n + 27, 0, 33);
                    final int n4;
                    if ((n4 = effect.timeLenght - (n3 - effect.timeStart)) >= 0) {
                        mFont.number_red.drawString(mGraphics, Game20.Class2(n4), n2 + 13 + (i * 13 << 1), n + 28, 2, mFont.Class13);
                    }
                }
                final int n5 = this.Class134 - (n3 - this.Class135);
                if (Char.getMyChar().vEff.size() > 0) {
                    n += 27;
                }
                if (n5 > 0) {
                    final mFont number_red = mFont.number_red;
                    final String string = String.valueOf(Game86.Class110) + ": " + Game20.Class2(n5);
                    final int n6 = n2;
                    n += 12;
                    number_red.drawString(mGraphics, string, n6, n, 0, mFont.Class13);
                }
            }
            if (Char.getMyChar().Class22 <= 20) {
                if (Char.getMyChar().Class31 > 0) {
                    final String string2 = "+" + Char.getMyChar().Class31 + " " + Game86.Class105;
                    final mFont class12 = mFont.Class12;
                    final String s2 = string2;
                    final int n7 = n2;
                    n += 12;
                    class12.drawString(mGraphics, s2, n7, n, 0, mFont.Class13);
                }
                if (Char.getMyChar().Class32 > 0) {
                    final String string3 = "+" + Char.getMyChar().Class32 + " " + Game86.Class106;
                    final mFont class13 = mFont.Class12;
                    final String s3 = string3;
                    final int n8 = n2;
                    n += 12;
                    class13.drawString(mGraphics, s3, n8, n, 0, mFont.Class13);
                }
            }
            if (Code.T != null) {
                n += 15;
                mFont.Class12.drawString(mGraphics, "HS b\u1eb1ng l\u01b0\u1ee3ng: " + (Code.BatTatHSL ? "B\u1eadt" : "T\u1eaft"), n2, n, 0, mFont.Class13);
                n += 15;
                ((GameCanvas.gameTick % 10 > 7) ? mFont.Class14 : mFont.Class12).drawString(mGraphics, Code.T.toString(), n2, n, 0, mFont.Class13);
            }
            if (Code.BatTatDanhChuyenVitri) {
                n += 15;
                mFont.Class12.drawString(mGraphics, "V\u1ecb tr\u00ed: " + (Code.intavt + 1) + "/" + Code.avtx.size(), n2, n, 0, mFont.Class13);
            }
            if (Code.NhanVat) {
                n += 12;
                mFont.Class8.Class1(mGraphics, "Nh\u00e2n v\u1eadt trong khu", n2, n, 0);
                for (int num2 = 0; num2 < GameScr.vCharInMap.size(); ++num2) {
                    final Object charfocus = GameScr.vCharInMap.elementAt(num2);
                    final Object s = num2 + ": " + ((Char)charfocus).cName + " " + ((Char)charfocus).cHP + "/" + ((Char)charfocus).cMaxHP;
                    n += 15;
                    mFont.Class12.Class1(mGraphics, (String)s, n2, n, 0);
                }
            }
            if (ChatManager.gI().Class8.size() > 0) {
                this.Class279[0] = n2;
                this.Class280[0] = n + 12;
                final String string4 = "+" + ChatManager.gI().Class8.size() + " " + Game86.Class100;
                if (GameCanvas.gameTick % 10 > 4) {
                    final mFont class14 = mFont.Class14;
                    final String s4 = string4;
                    final int n9 = n2;
                    n += 12;
                    class14.drawString(mGraphics, s4, n9, n, 0, mFont.Class13);
                }
                else {
                    final mFont class15 = mFont.Class12;
                    final String s5 = string4;
                    final int n10 = n2;
                    n += 12;
                    class15.drawString(mGraphics, s5, n10, n, 0, mFont.Class13);
                }
            }
            if (ChatManager.Class6 || ChatManager.Class7) {
                String s6 = "";
                this.Class279[1] = n2;
                this.Class280[1] = n + 12;
                if (ChatManager.Class6 && ChatManager.Class7) {
                    s6 = Game86.Class101[0];
                }
                else if (ChatManager.Class6) {
                    s6 = Game86.Class101[1];
                }
                else if (ChatManager.Class7) {
                    s6 = Game86.Class101[2];
                }
                if (GameCanvas.gameTick % 10 > 7) {
                    final mFont class16 = mFont.Class14;
                    final String s7 = s6;
                    final int n11 = n2;
                    n += 12;
                    class16.drawString(mGraphics, s7, n11, n, 0, mFont.Class13);
                }
                else {
                    final mFont class17 = mFont.Class12;
                    final String s8 = s6;
                    final int n12 = n2;
                    n += 12;
                    class17.drawString(mGraphics, s8, n12, n, 0, mFont.Class13);
                }
            }
            if (TileMap.Class14 != 3) {
                if (Char.getMyChar().isHuman) {
                    if (Char.getMyChar().taskMaint != null) {
                        String string5 = Char.getMyChar().taskMaint.subNames[Char.getMyChar().taskMaint.index];
                        for (int n13 = 0; string5 == null; string5 = Char.getMyChar().taskMaint.subNames[Char.getMyChar().taskMaint.index - n13]) {
                            ++n13;
                        }
                        if (Char.getMyChar().taskMaint.counts[Char.getMyChar().taskMaint.index] != -1) {
                            string5 = String.valueOf(string5) + " " + Char.getMyChar().taskMaint.count + "/" + Char.getMyChar().taskMaint.counts[Char.getMyChar().taskMaint.index];
                        }
                        if (GameCanvas.Class22 > 0 && GameCanvas.gameTick % 10 > 4) {
                            final mFont class18 = mFont.Class12;
                            final String s9 = string5;
                            final int n14 = n2;
                            n += 12;
                            class18.drawString(mGraphics, s9, n14, n, 0, mFont.Class13);
                        }
                        else {
                            final mFont number_red2 = mFont.number_red;
                            final String s10 = string5;
                            final int n15 = n2;
                            n += 12;
                            number_red2.drawString(mGraphics, s10, n15, n, 0, mFont.Class13);
                        }
                    }
                    else {
                        final byte taskMapId;
                        if ((taskMapId = getTaskMapId()) >= 0) {
                            final mFont number_red3 = mFont.number_red;
                            final String string6 = String.valueOf(Game86.Class232) + " " + TileMap.mapNames[taskMapId];
                            final int n16 = n2;
                            n += 12;
                            number_red3.drawString(mGraphics, string6, n16, n, 0, mFont.Class13);
                        }
                    }
                }
            }
            else if (Char.getMyChar().charFocus != null) {
                if (Char.getMyChar().charFocus.cTypePk == 4) {
                    final mFont number_red4 = mFont.number_red;
                    final String class19 = Game86.Class233;
                    final int n17 = n2;
                    n += 12;
                    number_red4.drawString(mGraphics, class19, n17, n, 0, mFont.Class13);
                }
                else if (Char.getMyChar().charFocus.cTypePk == 5) {
                    final mFont number_red5 = mFont.number_red;
                    final String class20 = Game86.Class234;
                    final int n18 = n2;
                    n += 12;
                    number_red5.drawString(mGraphics, class20, n18, n, 0, mFont.Class13);
                }
                else if (Char.getMyChar().charFocus.cTypePk == 6) {
                    final mFont number_red6 = mFont.number_red;
                    final String class21 = Game86.Class235;
                    final int n19 = n2;
                    n += 12;
                    number_red6.drawString(mGraphics, class21, n19, n, 0, mFont.Class13);
                }
            }
            else if (Char.getMyChar().mobFocus != null) {
                if (Char.getMyChar().mobFocus.templateId == 96) {
                    final mFont number_red7 = mFont.number_red;
                    final String class22 = Game86.Class234;
                    final int n20 = n2;
                    n += 12;
                    number_red7.drawString(mGraphics, class22, n20, n, 0, mFont.Class13);
                }
                else if (Char.getMyChar().mobFocus.templateId == 97) {
                    final mFont number_red8 = mFont.number_red;
                    final String class23 = Game86.Class233;
                    final int n21 = n2;
                    n += 12;
                    number_red8.drawString(mGraphics, class23, n21, n, 0, mFont.Class13);
                }
                else if (Char.getMyChar().mobFocus.templateId == 93) {
                    final mFont number_red9 = mFont.number_red;
                    final String class24 = Game86.Class235;
                    final int n22 = n2;
                    n += 12;
                    number_red9.drawString(mGraphics, class24, n22, n, 0, mFont.Class13);
                }
                else {
                    final mFont number_red10 = mFont.number_red;
                    final String class25 = Game86.Class236;
                    final int n23 = n2;
                    n += 12;
                    number_red10.drawString(mGraphics, class25, n23, n, 0, mFont.Class13);
                }
            }
            if (Char.getMyChar().mobFocus != null) {
                String obj = String.valueOf(Char.getMyChar().mobFocus.getTemplate().name) + " lv" + Char.getMyChar().mobFocus.level;
                if (Char.getMyChar().mobFocus.templateId != 0 && Char.getMyChar().mobFocus.templateId != 142 && Char.getMyChar().mobFocus.templateId != 143) {
                    obj = String.valueOf(obj) + ": " + Char.getMyChar().mobFocus.hp + "/" + Char.getMyChar().mobFocus.maxHp;
                }
                mGraphics.setColor(Char.getMyChar().mobFocus.Class4());
                n += 12;
                mGraphics.fillRect(n2, n + 3, 5, 5);
                mGraphics.setColor(0);
                mGraphics.Class2(n2, n + 3, 5, 5);
                mFont.number_red.drawString(mGraphics, obj, n2 + 12, n, 0, mFont.Class13);
            }
            else if (Char.getMyChar().npcFocus != null) {
                final mFont class26 = mFont.Class12;
                final String string7 = Char.getMyChar().npcFocus.template.name + " ID: " + Char.getMyChar().npcFocus.template.npcTemplateId;
                final int n24 = n2;
                n += 12;
                class26.drawString(mGraphics, string7, n24, n, 0, mFont.Class13);
            }
            else if (Char.getMyChar().charFocus != null) {
                mGraphics.setColor(Char.getMyChar().charFocus.getClassColor());
                n += 12;
                mGraphics.fillRect(n2, n + 3, 5, 5);
                mGraphics.setColor(0);
                mGraphics.Class2(n2, n + 3, 5, 5);
                mFont.number_red.drawString(mGraphics, String.valueOf(Char.getMyChar().charFocus.cName) + " lv" + Char.getMyChar().charFocus.Class22 + ": " + Char.getMyChar().charFocus.cHP + "/" + Char.getMyChar().charFocus.cMaxHP, n2 + 12, n, 0, mFont.Class13);
            }
            if (GameCanvas.Class9) {
                if (TileMap.Class14 == 1) {
                    final mFont number_red11 = mFont.number_red;
                    final String string8 = String.valueOf(Game86.Class111) + ": " + Char.getMyChar().Class105;
                    final int n25 = n2;
                    n += 12;
                    number_red11.drawString(mGraphics, string8, n25, n, 0, mFont.Class13);
                    final mFont number_red12 = mFont.number_red;
                    final String string9 = String.valueOf(Game86.Class112) + ": " + Char.getMyChar().Class106;
                    final int n26 = n2;
                    n += 12;
                    number_red12.drawString(mGraphics, string9, n26, n, 0, mFont.Class13);
                }
                else if (TileMap.Class14 == 2 || TileMap.mapID == 114 || TileMap.mapID == 115 || TileMap.mapID == 116) {
                    final mFont number_red13 = mFont.number_red;
                    final String string10 = String.valueOf(Game86.Class113) + ": " + Char.Class124;
                    final int n27 = n2;
                    n += 12;
                    number_red13.drawString(mGraphics, string10, n27, n, 0, mFont.Class13);
                }
                else if (TileMap.Class14 == 3) {
                    final mFont number_red14 = mFont.number_red;
                    final String string11 = String.valueOf(Game86.Class113) + ": " + Char.Class125;
                    final int n28 = n2;
                    n += 12;
                    number_red14.drawString(mGraphics, string11, n28, n, 0, mFont.Class13);
                    final mFont number_red15 = mFont.number_red;
                    final String s11 = Game86.Class251[Char.Class26()];
                    final int n29 = n2;
                    n += 12;
                    number_red15.drawString(mGraphics, s11, n29, n, 0, mFont.Class13);
                }
            }
            mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        }
        catch (Exception ex) {}
    }
    
    private void Class8(final mGraphics mGraphics) {
        if (!GameCanvas.Class6 || (GameCanvas.Class30.Class1 && GameCanvas.Class8)) {
            return;
        }
        if (GameCanvas.Class34 != null || ChatPopup.Class6 != null || GameCanvas.Class30.Class1 || Class83()) {
            return;
        }
        Class2(mGraphics);
        if (!Game23.Class1().Class2) {
            mGraphics.Class1(GameScr.Class267, GameScr.Class301 + 17, GameScr.Class302 + 17, 3);
        }
        if (this.Class84()) {
            return;
        }
        mGraphics.Class1(GameScr.Class270, GameScr.Class299, GameScr.Class300, 0);
        mGraphics.Class1(GameScr.Class265, 0, 0, mGraphics.Class1(GameScr.Class265), mGraphics.Class2(GameScr.Class265), 3, GameScr.Class299 + 15, GameScr.Class300 + 16, 3);
        if (mScreen.Class7 == 4) {
            mGraphics.Class1(GameScr.Class271, GameScr.Class299, GameScr.Class300, 0);
            mGraphics.Class1(GameScr.Class266, 0, 0, mGraphics.Class1(GameScr.Class265), mGraphics.Class2(GameScr.Class265), 3, GameScr.Class299 + 15, GameScr.Class300 + 16, 3);
        }
        mGraphics.Class1(GameScr.Class270, GameScr.Class303, GameScr.Class304, 0);
        mGraphics.Class1(GameScr.Class265, 0, 0, mGraphics.Class1(GameScr.Class265), mGraphics.Class2(GameScr.Class265), 0, GameScr.Class303 + 17, GameScr.Class304 + 16, 3);
        if (mScreen.Class7 == 6) {
            mGraphics.Class1(GameScr.Class271, GameScr.Class303, GameScr.Class304, 0);
            mGraphics.Class1(GameScr.Class266, 0, 0, mGraphics.Class1(GameScr.Class265), mGraphics.Class2(GameScr.Class265), 0, GameScr.Class303 + 17, GameScr.Class304 + 16, 3);
        }
        mGraphics.Class1(GameScr.Class270, GameScr.Class307, GameScr.Class308, 0);
        mGraphics.Class1(GameScr.Class265, 0, 0, mGraphics.Class1(GameScr.Class265), mGraphics.Class2(GameScr.Class265), 7, GameScr.Class307 + 17, GameScr.Class308 + 14, 3);
        if (mScreen.Class7 == 3) {
            mGraphics.Class1(GameScr.Class271, GameScr.Class307, GameScr.Class308, 0);
            mGraphics.Class1(GameScr.Class266, 0, 0, mGraphics.Class1(GameScr.Class265), mGraphics.Class2(GameScr.Class265), 7, GameScr.Class307 + 17, GameScr.Class308 + 14, 3);
        }
        if (Char.getMyChar().ctaskId > 1) {
            mGraphics.Class1(GameScr.Class270, GameScr.Class309, GameScr.Class310, 0);
            if (mScreen.Class7 == 10) {
                mGraphics.Class1(GameScr.Class271, GameScr.Class309, GameScr.Class310, 0);
            }
            mGraphics.Class1(GameScr.Class272, GameScr.Class309 + 16, GameScr.Class310 + 15, 3);
            mFont.Class21.Class1(mGraphics, new StringBuffer().append(GameScr.Class25).toString(), GameScr.Class309 + 22, GameScr.Class310 + 20, 1);
            mGraphics.Class1(GameScr.Class270, GameScr.Class311, GameScr.Class312, 0);
            if (mScreen.Class7 == 11) {
                mGraphics.Class1(GameScr.Class271, GameScr.Class311, GameScr.Class312, 0);
            }
            mGraphics.Class1(GameScr.Class273, GameScr.Class311 + 16, GameScr.Class312 + 15, 3);
            mFont.Class21.Class1(mGraphics, new StringBuffer().append(GameScr.Class24).toString(), GameScr.Class311 + 22, GameScr.Class312 + 20, 1);
            mGraphics.Class1(GameScr.Class270, GameScr.Class313, GameScr.Class314, 0);
            if (mScreen.Class7 == 13) {
                mGraphics.Class1(GameScr.Class271, GameScr.Class313, GameScr.Class314, 0);
            }
            mGraphics.Class1(GameScr.Class269, GameScr.Class313 + 16, GameScr.Class314 + 16, 3);
        }
        mGraphics.Class1(GameScr.Class274, GameScr.Class305, GameScr.Class306, 0);
        if (mScreen.Class7 == 5) {
            mGraphics.Class1(GameScr.Class275, GameScr.Class305, GameScr.Class306, 0);
        }
    }
    
    private void Class9(final mGraphics mGraphics) {
        if (GameCanvas.Class34 != null || ChatPopup.Class6 != null || GameCanvas.Class30.Class1 || Class83() || super.center == this.Class162) {
            return;
        }
        if (GameCanvas.Class6 && Char.getMyChar().vSkill.size() < 2) {
            return;
        }
        if (GameScr.Class208) {
            for (int i = 0; i < GameScr.Class285.length; ++i) {
                if (GameCanvas.Class8) {
                    if (Info.Class1 > 0) {
                        GameScr.yS[i] = 55 + Info.Class1;
                    }
                    else {
                        GameScr.yS[i] = 55;
                    }
                }
                if (GameCanvas.Class6 && GameCanvas.Class7) {
                    mGraphics.Class1(GameScr.Class276, GameScr.xSkill + GameScr.xS[i] - 1, GameScr.yS[i] - 1, 0);
                }
                else {
                    mGraphics.setColor(16764040);
                    mGraphics.Class2(GameScr.xSkill + GameScr.xS[i] - 1, GameScr.yS[i] - 1, 25, 25);
                }
                final Skill skill = GameScr.Class285[i];
                if (i == this.Class295 && !Class27() && GameCanvas.gameTick % 10 > 5) {
                    mGraphics.setColor(16777215);
                    mGraphics.fillRect(GameScr.xSkill + GameScr.xS[i] + 1, GameScr.yS[i] + 1, 22, 22);
                }
                else if (!GameCanvas.Class6) {
                    mGraphics.setColor(0);
                    mGraphics.fillRect(GameScr.xSkill + GameScr.xS[i], GameScr.yS[i], 24, 24);
                }
                if (skill != null) {
                    if (skill == Char.getMyChar().myskill) {
                        mGraphics.setColor(16711680);
                        mGraphics.Class2(GameScr.xSkill + GameScr.xS[i] - 1, GameScr.yS[i] - 1, 25, 25);
                    }
                    skill.Class1(GameScr.xSkill + GameScr.xS[i] + 12, GameScr.yS[i] + 12, mGraphics);
                    final long timeskill = skill.coolDown - System.currentTimeMillis() + skill.lastTimeUseThisSkill;
                    mFont.Class17.Class1(mGraphics, (timeskill > 0L) ? String.valueOf(timeskill / 1000L) : "", GameScr.xSkill + GameScr.xS[i] + 12, GameScr.yS[i] - 14, 2);
                }
            }
        }
    }
    
    public static final void Class1(final String s, final int n, final int n2, final int n3) {
        int n4 = -1;
        for (int i = 0; i < 5; ++i) {
            if (GameScr.Class325[i] == -1) {
                n4 = i;
                break;
            }
        }
        if (n4 == -1) {
            return;
        }
        GameScr.Class326[n4] = n3;
        GameScr.Class320[n4] = s;
        GameScr.Class321[n4] = n;
        GameScr.Class322[n4] = n2;
        GameScr.Class323[n4] = 0;
        GameScr.Class324[n4] = -2;
        GameScr.Class325[n4] = 0;
    }
    
    public static final void Class1(final int n, final int n2) {
        GameScr.Class191.addElement(new Game87(n, n2));
    }
    
    public static final boolean Class1(final int n, final int n2, final int n3) {
        final int n4 = (GameScr.Class329[0] != -1) ? 1 : 0;
        if (GameScr.Class329[n4] != -1) {
            return false;
        }
        GameScr.Class329[n4] = 0;
        GameScr.Class331[n4] = n3;
        GameScr.Class327[n4] = n;
        GameScr.Class328[n4] = n2;
        return true;
    }
    
    private void Class70() {
        if (GameScr.Class345 == null) {
            GameScr.Class345 = new Image[2];
            for (int i = 0; i < 2; ++i) {
                GameScr.Class345[i] = GameCanvas.Class3("/u/c" + i + ".png");
            }
        }
        GameScr.Class336 = mGraphics.Class1(GameScr.Class345[0]);
        GameScr.Class337 = mGraphics.Class1(GameScr.Class345[1]);
        GameScr.Class338 = GameScr.Class9 - GameScr.Class336 - GameScr.Class337 + 1;
        GameScr.Class339 = 63;
        GameScr.Class340 = GameScr.Class334 + 7;
        GameScr.Class341 = GameScr.Class9 - 84 - 30 + 15;
        GameScr.Class343 = GameScr.Class9 - 44 - 4;
        GameScr.Class344 = 5;
        if (GameCanvas.Class25 > 176) {
            GameScr.Class338 -= 50;
            GameScr.Class341 -= 50;
            GameScr.Class343 -= 50;
            GameScr.Class339 += 15;
            GameScr.Class341 -= 15;
        }
        this.Class71();
    }
    
    private void Class71() {
        if (!GameCanvas.Class6) {
            return;
        }
        GameScr.Class341 = 82;
        GameScr.Class342 = 57;
        GameScr.Class339 = 52;
        GameScr.Class340 = (GameCanvas.Class49 ? 25 : (10 + Info.Class1));
        GameScr.Class343 = GameScr.Class9 - 61;
        if (GameCanvas.Class8) {
            GameScr.Class301 = GameScr.Class9 / 2 - 2;
            GameScr.Class302 = GameScr.Class298 + 50;
        }
        else {
            this.Class286.Class7 = 6 + Info.Class1;
            GameScr.Class301 = GameScr.Class9 - 100;
            GameScr.Class302 = 2 + Info.Class1;
        }
        TileMap.Class1(GameCanvas.Class25 - 60, GameCanvas.Class49 ? 16 : Info.Class1, 60, 42);
    }
    
    private void Class10(final mGraphics mGraphics) {
        if (GameScr.indexMenu != 4) {
            return;
        }
        mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
        mGraphics.setColor(Game25.Class1);
        Class1(mGraphics, Game86.Class163[GameScr.indexMenu], true);
        if (GameScr.Class97.arrItemBody == null) {
            GameCanvas.Class1(GameScr.Class157 + 90, GameScr.Class156 + 75, mGraphics);
            mFont.Class7.Class1(mGraphics, Game86.Class25, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + 90, 2);
            return;
        }
        mGraphics.setColor(13606712);
        mGraphics.Class2(GameScr.Class157 + 33, GameScr.Class156 + (GameCanvas.Class9 ? 87 : 34), GameScr.Class158 - 67, GameCanvas.Class9 ? 76 : 128);
        final int n = GameScr.Class192 - 2;
        int n2 = 0;
        for (int i = 0; i < 16; ++i) {
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8) {
                mGraphics.setColor(0);
                mGraphics.fillRect(GameScr.Class157 + 4 + 1, GameScr.Class156 + 35 + i / 2 * n + 1, n - 1, n - 1);
                if (GameScr.Class346 == 0) {
                    if (Game86.Class296[i].length > 1) {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[i][0], GameScr.Class157 + 7 + 11, GameScr.Class156 + 36 + i / 2 * n + 2, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[i][1], GameScr.Class157 + 7 + 11, GameScr.Class156 + 36 + i / 2 * n + 2 + 9, 2);
                    }
                    else {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[i][0], GameScr.Class157 + 7 + 11, GameScr.Class156 + 36 + i / 2 * n + 2 + 5, 2);
                    }
                }
            }
            else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9) {
                mGraphics.setColor(0);
                mGraphics.fillRect(GameScr.Class157 + GameScr.Class158 - n - 4, GameScr.Class156 + 35 + i / 2 * n + 1, n - 1, n - 1);
                if (GameScr.Class346 == 0) {
                    if (Game86.Class296[i].length > 1) {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[i][0], GameScr.Class157 + GameScr.Class158 - n / 2 - 4, GameScr.Class156 + 36 + i / 2 * n + 2, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[i][1], GameScr.Class157 + GameScr.Class158 - n / 2 - 4, GameScr.Class156 + 36 + i / 2 * n + 2 + 9, 2);
                    }
                    else {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[i][0], GameScr.Class157 + GameScr.Class158 - n / 2 - 4, GameScr.Class156 + 36 + i / 2 * n + 2 + 5, 2);
                    }
                }
            }
            else if (i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15) {
                final int n3 = GameScr.Class157 + 4 + 1 + n2 * (n + 2);
                final int n4 = GameScr.Class156 + 35 + n * 5 + 1;
                mGraphics.setColor(0);
                mGraphics.fillRect(n3, GameScr.Class156 + 35 + n * 5 + 1, n - 1, n - 1);
                if (GameScr.Class346 == 0) {
                    if (Game86.Class296[i].length > 1) {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[i][0], n3 + n / 2, n4 + 2, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[i][1], n3 + n / 2, n4 + 2 + 9, 2);
                    }
                    else {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[i][0], n3 + n / 2, n4 + 2 + 5, 2);
                    }
                }
                ++n2;
            }
        }
        if (GameScr.Class346 == 0) {
            for (int j = 0; j < 16; ++j) {
                final Item item;
                if ((item = GameScr.Class97.arrItemBody[j]) != null) {
                    if (item.Class16 == null) {
                        item.Class16 = GameScr.efs[56];
                    }
                    if (item.indexUI == 0 || item.indexUI == 2 || item.indexUI == 4 || item.indexUI == 6 || item.indexUI == 8 || item.indexUI == 10) {
                        this.Class1(mGraphics, item, GameScr.Class157 + 4 - 1, GameScr.Class156 + 34 + item.indexUI / 2 * n, 0, 1);
                    }
                    else if (item.indexUI == 1 || item.indexUI == 3 || item.indexUI == 5 || item.indexUI == 7 || item.indexUI == 9) {
                        this.Class1(mGraphics, item, GameScr.Class157 + GameScr.Class158 - n - 5 - 1, GameScr.Class156 + 35 + item.indexUI / 2 * n - 1, 0, 1);
                    }
                    else if (item.indexUI == 11 || item.indexUI == 12 || item.indexUI == 13 || item.indexUI == 14 || item.indexUI == 15) {
                        if (item.indexUI == 10) {
                            n2 = 1;
                        }
                        else if (item.indexUI == 11) {
                            n2 = 2;
                        }
                        else if (item.indexUI == 12) {
                            n2 = 3;
                        }
                        else if (item.indexUI == 13) {
                            n2 = 4;
                        }
                        else if (item.indexUI == 14) {
                            n2 = 5;
                        }
                        else if (item.indexUI == 15) {
                            n2 = 6;
                        }
                        this.Class1(mGraphics, item, GameScr.Class157 + 2 + 1 + n2 * (n + 2) - n - 2, GameScr.Class156 + 35 + n * 5 - 1, 0, 1);
                    }
                    if (GameCanvas.gameTick % 4 == 0) {
                        final Item item2 = item;
                        ++item2.Class17;
                        if (item.Class17 >= item.Class16.Class2.length) {
                            item.Class17 = 0;
                        }
                    }
                }
            }
        }
        if (GameScr.Class346 > 0) {
            for (int k = 0; k < 16; ++k) {
                final Item item3;
                if ((item3 = GameScr.Class97.arrItemBody[k + GameScr.Class346]) != null) {
                    final int n5 = item3.indexUI - 16;
                    if (item3.Class16 == null) {
                        item3.Class16 = GameScr.efs[56];
                    }
                    if (n5 == 0 || n5 == 2 || n5 == 4 || n5 == 6 || n5 == 8 || n5 == 10) {
                        this.Class1(mGraphics, item3, GameScr.Class157 + 4 - 1, GameScr.Class156 + 34 + n5 / 2 * n, 0, 1);
                    }
                    else if (n5 == 1 || n5 == 3 || n5 == 5 || n5 == 7 || n5 == 9) {
                        this.Class1(mGraphics, item3, GameScr.Class157 + GameScr.Class158 - n - 5 - 1, GameScr.Class156 + 35 + n5 / 2 * n - 1, 0, 1);
                    }
                    else if (n5 == 11 || n5 == 12 || n5 == 13 || n5 == 14 || n5 == 15) {
                        if (n5 == 10) {
                            n2 = 1;
                        }
                        else if (n5 == 11) {
                            n2 = 2;
                        }
                        else if (n5 == 12) {
                            n2 = 3;
                        }
                        else if (n5 == 13) {
                            n2 = 4;
                        }
                        else if (n5 == 14) {
                            n2 = 5;
                        }
                        else if (n5 == 15) {
                            n2 = 6;
                        }
                        this.Class1(mGraphics, item3, GameScr.Class157 + 2 + 1 + n2 * (n + 2) - n - 2, GameScr.Class156 + 35 + n * 5 - 1, 0, 1);
                    }
                    if (GameCanvas.gameTick % 4 == 0) {
                        final Item item4 = item3;
                        ++item4.Class17;
                        if (item3.Class17 >= item3.Class16.Class2.length) {
                            item3.Class17 = 0;
                        }
                    }
                }
            }
        }
        for (int l = 0; l < 16; ++l) {
            if (GameScr.Class193 == 1 && l == GameScr.indexSelect) {
                if (l == 0 || l == 2 || l == 4 || l == 6 || l == 8) {
                    mGraphics.setColor(16777215);
                    final int n6 = GameScr.Class157 + 4;
                    final int n7 = GameScr.Class156 + 35 + l / 2 * n;
                    final int n8 = n;
                    mGraphics.Class2(n6, n7, n8, n8);
                    Class1(GameScr.Class157 + 5 - 2, GameScr.Class156 + 35 + l / 2 * n - 1, mGraphics);
                }
                else if (l == 1 || l == 3 || l == 5 || l == 7 || l == 9) {
                    mGraphics.setColor(16777215);
                    final int n9 = GameScr.Class157 + GameScr.Class158 - n - 4 - 1;
                    final int n10 = GameScr.Class156 + 35 + l / 2 * n;
                    final int n11 = n;
                    mGraphics.Class2(n9, n10, n11, n11);
                    Class1(GameScr.Class157 + GameScr.Class158 - n - 4 - 2, GameScr.Class156 + 35 + l / 2 * n - 1, mGraphics);
                }
                else if (l == 9 || l == 10 || l == 11 || l == 12 || l == 13 || l == 14 || l == 15) {
                    if (l == 9) {
                        n2 = 0;
                    }
                    else if (l == 10) {
                        n2 = 1;
                    }
                    else if (l == 11) {
                        n2 = 2;
                    }
                    else if (l == 12) {
                        n2 = 3;
                    }
                    else if (l == 13) {
                        n2 = 4;
                    }
                    else if (l == 14) {
                        n2 = 5;
                    }
                    else if (l == 15) {
                        n2 = 6;
                    }
                    final int n12 = GameScr.Class157 + 2 + 1 + n2 * (n + 2) - n;
                    final int n13 = GameScr.Class156 + 35 + n * 5;
                    mGraphics.setColor(16777215);
                    final int n14 = n12 - 1;
                    final int n15 = n13;
                    final int n16 = n;
                    mGraphics.Class2(n14, n15, n16, n16);
                    Class1(n12 - 2, n13 - 1, mGraphics);
                }
            }
        }
        final int n17 = GameCanvas.Class9 ? -25 : 16;
        Game99 game99 = GameScr.Class28[GameScr.Class97.head];
        final Game99 game100 = GameScr.Class28[GameScr.Class97.leg];
        final Game99 game101 = GameScr.Class28[GameScr.Class97.body];
        final Game99 game102 = GameScr.Class28[GameScr.Class97.Class144];
        if (GameScr.Class97.arrItemBody != null && GameScr.Class97.arrItemBody[11] != null) {
            game99 = GameScr.Class28[GameScr.Class97.arrItemBody[11].template.Class8];
        }
        if (game99.Class1 == null || game99.Class1.length < 8) {
            Char.getMyChar();
            game99 = Char.Class2(Char.getMyChar().cgender);
        }
        else {
            for (int n18 = 0; n18 < game99.Class1.length; ++n18) {
                if (game99.Class1[n18] == null || !Game2.Class1(game99.Class1[n18].Class1)) {
                    Char.getMyChar();
                    game99 = Char.Class2(Char.getMyChar().cgender);
                    break;
                }
            }
        }
        final int n19 = (GameScr.Class97.Class13 % 15 >= 5) ? 1 : 0;
        final int[] class19 = GameScr.Class97.Class19();
        if (GameScr.Class97.ID_WEA_PONE >= 0) {
            final Char class20 = GameScr.Class97;
            final int class21 = GameScr.Class11;
            final int n20 = GameScr.Class13 - 24;
            final int n21 = n19;
            final int n22 = n20;
            final int n23 = class21;
            final Char char1 = class20;
            final Game123 class22;
            if ((class22 = Char.Class1(class20.ID_WEA_PONE, false)) != null) {
                if (GameCanvas.gameTick % 6 == 0) {
                    int n24;
                    if ((n24 = class22.Class2.size() / 30) == 0) {
                        n24 = 1;
                    }
                    final Char char2 = char1;
                    char2.Class163 = (byte)((char2.Class163 + 1) % n24);
                }
                class22.Class1(mGraphics, n23, n22, char1.Class8(n21), 0);
            }
        }
        if (GameScr.Class97.ID_PP >= 0) {
            final Char class23 = GameScr.Class97;
            final int class24 = GameScr.Class11;
            final int n25 = GameScr.Class13 - 24;
            final int n26 = n19;
            final int n27 = n25;
            final int n28 = class24;
            final Char char3 = class23;
            final Game123 class25;
            if ((class25 = Char.Class1(class23.ID_PP, false)) != null) {
                class25.Class1(mGraphics, n28, n27, char3.Class4(n26), 0);
            }
        }
        if (class19 != null && GameScr.Class97.ID_PP == -1) {
            if (Char.getMyChar().Class107 == 0) {
                Game2.Class1(mGraphics, class19[Char.getMyChar().Class107], GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][1] + game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class2 - 2, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][2] + game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class3 + 16, 0, 0);
            }
            else if (Char.getMyChar().Class107 == 1) {
                Game2.Class1(mGraphics, class19[Char.getMyChar().Class107], GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][1] + game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class2 - 9, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][2] + game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class3 + 16, 0, 0);
            }
            else if (Char.getMyChar().Class107 == 2) {
                Game2.Class1(mGraphics, class19[Char.getMyChar().Class107], GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][1] + game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class2 - 12, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][2] + game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class3 + 16, 0, 0);
            }
            else {
                Game2.Class1(mGraphics, class19[Char.getMyChar().Class107], GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][1] + game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class2 - 9, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][2] + game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class3 + 16, 0, 0);
            }
        }
        GameScr.Class97.Class2(mGraphics, GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][1] + game101.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][0]].Class2 + 18, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][2] + game100.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][0]].Class3 + 5);
        if (GameScr.Class97.ID_WEA_PONE == -1) {
            Game2.Class1(mGraphics, game102.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][3][0]].Class1, GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][3][1] + game102.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][3][0]].Class2, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][3][2] + game102.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][3][0]].Class3, 0, 0);
        }
        if (GameScr.Class97.ID_LEG >= 0) {
            final Char class26 = GameScr.Class97;
            final int class27 = GameScr.Class11;
            final int n29 = GameScr.Class13 - 24;
            final int n30 = n19;
            final int n31 = n29;
            final int n32 = class27;
            final Char char4 = class26;
            final Game123 class28;
            if ((class28 = Char.Class1(class26.ID_LEG, false)) != null) {
                if (GameCanvas.gameTick % 6 == 0) {
                    int n33;
                    if ((n33 = class28.Class2.size() / 30) == 0) {
                        n33 = 1;
                    }
                    final Char char5 = char4;
                    char5.Class160 = (byte)((char5.Class160 + 1) % n33);
                }
                class28.Class1(mGraphics, n32, n31, char4.Class7(n30), 0);
                class28.Class2(mGraphics, n32, n31, char4.Class7(n30), 0);
            }
        }
        else {
            Game2.Class1(mGraphics, game100.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][0]].Class1, GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][1] + game100.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][0]].Class2, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][2] + game100.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][0]].Class3, 0, 0);
        }
        if (GameScr.Class97.ID_Body >= 0) {
            final Char class29 = GameScr.Class97;
            final int class30 = GameScr.Class11;
            final int n34 = GameScr.Class13 - 24;
            final int n35 = n19;
            final int n36 = n34;
            final int n37 = class30;
            final Char char6 = class29;
            final Game123 class31;
            if ((class31 = Char.Class1(class29.ID_Body, false)) != null) {
                if (GameCanvas.gameTick % 6 == 0) {
                    int n38;
                    if ((n38 = class31.Class2.size() / 30) == 0) {
                        n38 = 1;
                    }
                    final Char char7 = char6;
                    char7.Class159 = (byte)((char7.Class159 + 1) % n38);
                }
                class31.Class1(mGraphics, n37, n36, char6.Class6(n35), 0);
                class31.Class2(mGraphics, n37, n36, char6.Class6(n35), 0);
            }
        }
        else {
            Game2.Class1(mGraphics, game101.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][0]].Class1, GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][1] + game101.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][0]].Class2, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][2] + game101.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][0]].Class3, 0, 0);
        }
        if (GameScr.Class97.ID_HAIR >= 0) {
            final Char class32 = GameScr.Class97;
            final int class33 = GameScr.Class11;
            final int n39 = GameScr.Class13 - 24;
            final int n40 = n19;
            final int n41 = n39;
            final int n42 = class33;
            final Char char8 = class32;
            final Game123 class34;
            if ((class34 = Char.Class1(class32.ID_HAIR, false)) != null) {
                if (GameCanvas.gameTick % 6 == 0) {
                    int n43;
                    if ((n43 = class34.Class2.size() / 30) == 0) {
                        n43 = 1;
                    }
                    final Char char9 = char8;
                    char9.Class161 = (byte)((char9.Class161 + 1) % n43);
                }
                class34.Class1(mGraphics, n42, n41, char8.Class5(n40), 0);
                class34.Class2(mGraphics, n42, n41, char8.Class5(n40), 0);
            }
        }
        else {
            Game2.Class1(mGraphics, game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class1, GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][1] + game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class2, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][2] + game99.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][0][0]].Class3, 0, 0);
        }
        if (GameScr.Class97.ID_MAT_NA >= 0) {
            final Char class35 = GameScr.Class97;
            final int class36 = GameScr.Class11;
            final int n44 = GameScr.Class13 - 24;
            final int n45 = n19;
            final int n46 = n44;
            final int n47 = class36;
            final Char char10 = class35;
            final Game123 class37;
            if ((class37 = Char.Class1(class35.ID_MAT_NA, false)) != null) {
                if (GameCanvas.gameTick % 6 == 0) {
                    int n48;
                    if ((n48 = class37.Class2.size() / 30) == 0) {
                        n48 = 1;
                    }
                    final Char char11 = char10;
                    char11.Class164 = (byte)((char11.Class164 + 1) % n48);
                }
                class37.Class2(mGraphics, n47, n46, char10.Class9(n45), 0);
                class37.Class1(mGraphics, n47, n46, char10.Class9(n45), 0);
            }
        }
        GameScr.Class97.Class2(mGraphics, GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][1] + game101.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][0]].Class2 + 5, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][2] + game100.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][0]].Class3 + 5);
        GameScr.Class97.Class3(mGraphics, GameScr.Class11 + Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][1] + game101.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][2][0]].Class2 + 22, GameScr.Class13 + n17 - Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][2] + game100.Class1[Char.Class127[GameScr.Class97.Class13 % 15 >= 5][1][0]].Class3 + 5);
        if (GameScr.Class97.ID_PP >= 0) {
            final Char class38 = GameScr.Class97;
            final int class39 = GameScr.Class11;
            final int n49 = GameScr.Class13 - 24;
            final int n50 = n19;
            final int n51 = n49;
            final int n52 = class39;
            final Char char12 = class38;
            final Game123 class40;
            if ((class40 = Char.Class1(class38.ID_PP, false)) != null) {
                if (GameCanvas.gameTick % 10 == 0) {
                    int n53;
                    if ((n53 = class40.Class2.size() / 30) == 0) {
                        n53 = 1;
                    }
                    final Char char13 = char12;
                    char13.Class162 = (byte)((char13.Class162 + 1) % n53);
                }
                class40.Class2(mGraphics, n52, n51, char12.Class4(n50), 0);
            }
        }
        if (GameScr.Class97.ID_WEA_PONE >= 0) {
            final Char class41 = GameScr.Class97;
            final int class42 = GameScr.Class11;
            final int n54 = GameScr.Class13 - 24;
            final int n55 = n19;
            final int n56 = n54;
            final int n57 = class42;
            final Char char14 = class41;
            final Game123 class43;
            if ((class43 = Char.Class1(class41.ID_WEA_PONE, false)) != null) {
                if (GameCanvas.gameTick % 6 == 0) {
                    int n58;
                    if ((n58 = class43.Class2.size() / 30) == 0) {
                        n58 = 1;
                    }
                    final Char char15 = char14;
                    char15.Class163 = (byte)((char15.Class163 + 1) % n58);
                }
                class43.Class2(mGraphics, n57, n56, char14.Class8(n55), 0);
            }
        }
        if (this.Class186 != null && GameCanvas.Class6) {
            final Command class44;
            if (!(class44 = this.Class186).Class10) {
                mGraphics.Class1(GameScr.Class128, class44.Class6, class44.Class7, 0);
            }
            else {
                mGraphics.Class1(GameScr.Class129, class44.Class6, class44.Class7, 0);
            }
            mFont.Class6.Class1(mGraphics, class44.Class1, class44.Class6 + 36, class44.Class7 + 6, 2);
        }
    }
    
    private void Class11(final mGraphics mGraphics) {
        if (GameScr.indexMenu != 5) {
            return;
        }
        mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
        mGraphics.setColor(Game25.Class1);
        Class1(mGraphics, Game86.Class163[GameScr.indexMenu], true);
        Class2(mGraphics);
        mGraphics.setColor(0);
        mGraphics.fillRect(GameScr.Class157 + 2, GameScr.Class156 + 31, 171, GameScr.Class159 - 34);
        mGraphics.setColor(13606712);
        mGraphics.Class2(GameScr.Class157 + 3, GameScr.Class156 + 32, 168, GameScr.Class159 - 37);
        mGraphics.setColor(Game25.Class1);
        mGraphics.fillRect(GameScr.Class157 + 4, GameScr.Class156 + 34, 166, GameScr.Class159 - 39);
        if (GameScr.Class97.Class80[4] != null) {
            mFont.Class7.Class1(mGraphics, GameScr.Class97.Class80[4].template.name, GameScr.Class157 + 90, GameScr.Class395 + 2, 2);
            for (int n = GameScr.Class97.Class80[4].Class8 + 1, i = 0; i < n; ++i) {
                Game2.Class1(mGraphics, 628, GameScr.Class157 + 90 + i * 12 - n * 6, GameScr.Class395 + 20, 0, 3);
            }
        }
        else {
            mFont.Class7.Class1(mGraphics, Game86.Class477, GameScr.Class157 + 90, GameScr.Class395 + 2, 2);
        }
        for (int j = 0; j < GameScr.Class97.Class80.length - 1; ++j) {
            if (GameScr.Class97.Class80[j] != null) {
                this.Class1(mGraphics, GameScr.Class97.Class80[j], this.Class281[j], this.Class282[j]);
            }
            else {
                mGraphics.setColor(6425);
                mGraphics.fillRect(this.Class281[j] - 1, this.Class282[j] - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                if (j == 0) {
                    if (GameScr.Class97.Class16()) {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[22][0], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 - 10, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[22][1], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 + 2, 2);
                    }
                    else {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[19][0], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 - 10, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[19][1], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 + 2, 2);
                    }
                }
                else if (j == 1) {
                    if (GameScr.Class97.Class16()) {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[20][0], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 - 10, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[20][1], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 + 2, 2);
                    }
                    else {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[16][0], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 - 10, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[16][1], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 + 2, 2);
                    }
                }
                else if (j == 2) {
                    if (GameScr.Class97.Class16()) {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[21][0], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 - 10, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[21][1], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 + 2, 2);
                    }
                    else {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[17][0], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 - 10, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[17][1], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 + 2, 2);
                    }
                }
                else if (j == 3) {
                    if (GameScr.Class97.Class16()) {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[23][0], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 - 10, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[23][1], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 + 2, 2);
                    }
                    else {
                        mFont.Class13.Class1(mGraphics, Game86.Class296[18][0], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 - 10, 2);
                        mFont.Class13.Class1(mGraphics, Game86.Class296[18][1], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 + 2, 2);
                    }
                }
            }
            if (GameScr.indexSelect == j && GameScr.Class193 == 1 && GameScr.indexSelect < 4) {
                mGraphics.setColor(16777215);
            }
            else {
                mGraphics.setColor(12281361);
            }
            final int n2 = this.Class281[j];
            final int n3 = this.Class282[j];
            final int class192 = GameScr.Class192;
            mGraphics.Class2(n2, n3, class192, class192);
        }
        final int n4 = this.Class281[0] + GameScr.Class192 + 7;
        final int n5 = this.Class282[0] - 5;
        mGraphics.setColor(6425);
        mGraphics.fillRect(n4, n5, 84, 75);
        if (GameScr.indexSelect == 4) {
            mGraphics.setColor(16777215);
        }
        else {
            mGraphics.setColor(12281361);
        }
        mGraphics.Class2(n4, n5, 84, 75);
        int param = 0;
        int param2 = 0;
        int n6 = 0;
        int n7 = 0;
        int k = 0;
        if (GameScr.Class97.ID_HORSE >= 0) {
            final Char class193 = GameScr.Class97;
            final int n8 = n4 + 35;
            final int n9 = n5 + 55;
            final int n10 = this.Class348[this.Class349];
            final int n11 = n9;
            final int n12 = n8;
            final Char char1 = class193;
            final Game123 class194;
            if ((class194 = Char.Class1(class193.ID_HORSE, true)) != null && class194.Class7) {
                if (GameCanvas.gameTick % 10 == 0) {
                    int n13;
                    if ((n13 = class194.Class2.size() / class194.Class4.length) == 0) {
                        n13 = 1;
                    }
                    final Char char2 = char1;
                    char2.Class158 = (byte)((char2.Class158 + 1) % n13);
                }
                class194.Class1(mGraphics, n12, n11, char1.Class3(n10), 2);
                class194.Class2(mGraphics, n12, n11, char1.Class3(n10), 2);
            }
        }
        if (GameScr.Class97.Class80[4] != null) {
            if (GameScr.Class97.Class30()) {
                final int[][] array = (int[][])Game94.Class8.Class1(new StringBuffer(String.valueOf(GameScr.Class97.Class80[4].template.id)).toString());
                if (GameCanvas.gameTick % 20 > 15) {
                    Game2.Class1(mGraphics, array[0][0], n4 + 45 - 10, n5 + 35, 0, 3);
                }
                else {
                    Game2.Class1(mGraphics, array[0][1], n4 + 45 - 10, n5 + 35, 0, 3);
                }
            }
            else if (GameScr.Class97.Class16()) {
                if (GameScr.Class97.Class80[4].template.id == 485) {
                    if (GameScr.Class97.Class80[4].Class8 < 2) {
                        Game2.Class1(mGraphics, 1800, n4 + 45, n5 + 35, 0, 3);
                    }
                    else {
                        Game2.Class1(mGraphics, 2063, n4 + 45, n5 + 35, 0, 3);
                    }
                }
                else if (GameScr.Class97.Class80[4].template.id == 524) {
                    if (GameScr.Class97.Class80[4].Class8 < 2) {
                        Game2.Class1(mGraphics, 2067, n4 + 45, n5 + 35, 0, 3);
                    }
                    else {
                        Game2.Class1(mGraphics, 2071, n4 + 45, n5 + 35, 0, 3);
                    }
                }
            }
            else if (GameScr.Class97.Class15()) {
                if (GameScr.Class97.Class80[4].template.id == 443) {
                    if (GameScr.Class97.Class80[4].Class8 < 2) {
                        if (GameCanvas.gameTick % 20 > 15) {
                            Game2.Class1(mGraphics, 1801, n4 + 45, n5 + 35, 0, 3);
                        }
                        else {
                            Game2.Class1(mGraphics, 1802, n4 + 45, n5 + 35, 0, 3);
                        }
                    }
                    else if (GameCanvas.gameTick % 20 > 15) {
                        Game2.Class1(mGraphics, 2080, n4 + 45, n5 + 35, 0, 3);
                    }
                    else {
                        Game2.Class1(mGraphics, 2081, n4 + 45, n5 + 35, 0, 3);
                    }
                }
                else if (GameScr.Class97.Class80[4].template.id == 523) {
                    if (GameCanvas.gameTick % 20 > 15) {
                        Game2.Class1(mGraphics, 2062, n4 + 45, n5 + 35, 0, 3);
                    }
                    else {
                        Game2.Class1(mGraphics, 2061, n4 + 45, n5 + 35, 0, 3);
                    }
                }
            }
            if (GameScr.Class97.Class80[4].options != null) {
                for (int l = 0; l < GameScr.Class97.Class80[4].options.size(); ++l) {
                    final ItemOption itemOption;
                    if ((itemOption = (ItemOption)GameScr.Class97.Class80[4].options.elementAt(l)).optionTemplate.id == 65) {
                        param = itemOption.param;
                    }
                    else if (itemOption.optionTemplate.id == 66) {
                        param2 = itemOption.param;
                    }
                }
            }
            n6 = param * 85 / 1000;
            n7 = param2 * 85 / 1000;
            k = GameScr.Class97.Class80[4].upgrade + 1;
        }
        final int n14 = GameScr.Class394 + 5;
        int n15 = GameScr.Class395 + 112;
        mFont.Class7.Class1(mGraphics, String.valueOf(Game86.Class125) + ": ", n14, n15, 0);
        mFont.Class7.Class1(mGraphics, new StringBuffer(String.valueOf(k)).toString(), n14 + 70, n15, 0);
        if (GameScr.Class97.Class16()) {
            final mFont class195 = mFont.Class7;
            final String string = String.valueOf(Game86.Class492) + ": ";
            final int n16 = n14;
            n15 += 15;
            class195.Class1(mGraphics, string, n16, n15, 0);
        }
        else {
            final mFont class196 = mFont.Class7;
            final String string2 = String.valueOf(Game86.Class208) + ": ";
            final int n17 = n14;
            n15 += 15;
            class196.Class1(mGraphics, string2, n17, n15, 0);
        }
        mGraphics.setColor(6425);
        mGraphics.fillRect(n14 + 70, n15, 85, 14);
        mGraphics.setColor(371981);
        mGraphics.fillRect(n14 + 70, n15, n6, 14);
        mGraphics.setColor(5131338);
        mGraphics.Class2(n14 + 70, n15, 85, 14);
        mFont.number_red.Class1(mGraphics, String.valueOf(param) + "/1000", n14 + 113, n15 + 2, 2);
        if (GameScr.Class97.Class16()) {
            final mFont class197 = mFont.Class7;
            final String string3 = String.valueOf(Game86.Class493) + ": ";
            final int n18 = n14;
            n15 += 17;
            class197.Class1(mGraphics, string3, n18, n15, 0);
        }
        else {
            final mFont class198 = mFont.Class7;
            final String string4 = String.valueOf(Game86.Class476) + ": ";
            final int n19 = n14;
            n15 += 17;
            class198.Class1(mGraphics, string4, n19, n15, 0);
        }
        mGraphics.setColor(6425);
        mGraphics.fillRect(n14 + 70, n15, 85, 14);
        mGraphics.setColor(16711680);
        mGraphics.fillRect(n14 + 70, n15, n7, 14);
        mGraphics.setColor(5131338);
        mGraphics.Class2(n14 + 70, n15, 85, 14);
        mFont.number_red.Class1(mGraphics, String.valueOf(param2) + "/1000", n14 + 113, n15 + 2, 2);
    }
    
    private void Class12(final mGraphics mGraphics) {
        if (!GameScr.Class238) {
            return;
        }
        Class2(mGraphics);
        Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
        Class1(mGraphics, Game86.Class346[GameScr.indexMenu], true);
        if (GameScr.indexMenu == 0) {
            if (Char.Class57 == null || Char.Class57.Class1 == null || Char.Class57.Class1.equals("")) {
                GameScr.Class194 = 1;
                mFont.number_red.Class1(mGraphics, Game86.Class379, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + 40, 2);
                return;
            }
            final int[] array = { 1692, 1693, 1694, 1695, 1696 };
            for (int i = 0; i < 5; ++i) {
                mGraphics.setColor(6425);
                mGraphics.fillRect(GameScr.Class157 + i * GameScr.Class192 + 18, GameScr.Class156 + 32, GameScr.Class192 - 2, GameScr.Class192 - 2);
                if (GameScr.Class193 == 1 && i == GameScr.indexSelect) {
                    mGraphics.setColor(16777215);
                }
                else {
                    mGraphics.setColor(12281361);
                }
                mGraphics.Class2(GameScr.Class157 + i * GameScr.Class192 + 18, GameScr.Class156 + 32, GameScr.Class192 - 2, GameScr.Class192 - 2);
                if (i > Char.Class57.Class5 - 1) {
                    Game2.Class1(mGraphics, 1697, GameScr.Class157 + i * GameScr.Class192 + 18 + GameScr.Class192 / 2, GameScr.Class156 + 32 + GameScr.Class192 / 2, 0, 3);
                }
                else {
                    Game2.Class1(mGraphics, array[i], GameScr.Class157 + i * GameScr.Class192 + 18 + GameScr.Class192 / 2, GameScr.Class156 + 32 + GameScr.Class192 / 2, 0, 3);
                }
            }
            if (GameScr.Class193 == 2) {
                mGraphics.setColor(Game25.Class3);
                mGraphics.fillRect(GameScr.Class157 + 7, GameScr.Class156 + 60, GameScr.Class158 - 14, GameScr.Class159 - 68);
                mGraphics.setColor(16777215);
            }
            else {
                mGraphics.setColor(10249521);
            }
            mGraphics.Class2(GameScr.Class157 + 7, GameScr.Class156 + 60, GameScr.Class158 - 14, GameScr.Class159 - 68);
            GameScr.Class394 = GameScr.Class157 + 17;
            GameScr.Class395 = GameScr.Class156 + 62;
            GameScr.Class194 = 12;
            GameScr.Class50.Class1(GameScr.Class194, 12, GameScr.Class157, GameScr.Class156 + 62, GameScr.Class158, GameScr.Class159 - 72, true, 1);
            GameScr.Class50.Class1(mGraphics);
            mFont.Class6.Class1(mGraphics, String.valueOf(Game86.Class347[0]) + Char.Class57.Class1, GameScr.Class394, GameScr.Class395, 0);
            mFont.Class10.Class1(mGraphics, String.valueOf(Game86.Class347[1]) + Char.Class57.Class10, GameScr.Class394, GameScr.Class395 += 12, 0);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class347[2]) + Char.Class57.Class14 + "/" + (Char.Class57.Class4 * 5 + 45), GameScr.Class394, GameScr.Class395 += 12, 0);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class347[3]) + Char.Class57.Class4, GameScr.Class394, GameScr.Class395 += 12, 0);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class347[4]) + Char.Class57.Class2 + "/" + Char.Class57.Class3, GameScr.Class394, GameScr.Class395 += 12, 0);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class347[5]) + Game20.Class1(new StringBuffer(String.valueOf(Char.Class57.Class7)).toString()) + " " + Game86.Class287, GameScr.Class394, GameScr.Class395 += 12, 0);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class347[8]) + Game20.Class1(new StringBuffer(String.valueOf(Char.Class57.Class8)).toString()) + " " + Game86.Class287, GameScr.Class394, GameScr.Class395 += 12, 0);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class347[9]) + Game20.Class1(new StringBuffer(String.valueOf(Char.Class57.Class9)).toString()) + " " + Game86.Class287, GameScr.Class394, GameScr.Class395 += 12, 0);
            if (mFont.number_red.Class1(String.valueOf(Game86.Class347[10]) + Char.Class57.Class6 + " " + Game86.Class345) > GameScr.Class409 - 10) {
                this.Class2(mGraphics, mFont.number_red, String.valueOf(Game86.Class347[10]) + Char.Class57.Class6 + " " + Game86.Class345, GameScr.Class394, GameScr.Class395 += 12, GameScr.Class158 - 20);
            }
            else {
                mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class347[10]) + Char.Class57.Class6 + " " + Game86.Class345, GameScr.Class394, GameScr.Class395 += 12, 0);
            }
            if (mFont.number_red.Class1(String.valueOf(Game86.Class347[12]) + Char.Class57.Class15 + " " + Game86.Class345) > GameScr.Class409 - 10) {
                this.Class2(mGraphics, mFont.number_red, String.valueOf(Game86.Class347[12]) + Char.Class57.Class15 + " " + Game86.Class345, GameScr.Class394, GameScr.Class395 += 12, GameScr.Class158 - 20);
            }
            else {
                mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class347[12]) + Char.Class57.Class15 + " " + Game86.Class345, GameScr.Class394, GameScr.Class395 += 12, 0);
            }
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class347[6]) + Char.Class57.Class11, GameScr.Class394, GameScr.Class395 += 12, 0);
            if (this.Class351 == null) {
                this.Class351 = Class1(mFont.Class12, Char.Class57.Class13);
            }
            this.Class1(mGraphics, mFont.Class12, this.Class351, GameScr.Class394, GameScr.Class395 += 12);
            if (GameScr.Class193 == 2 && GameScr.indexRow >= 0) {
                Game2.Class1(mGraphics, 942, GameScr.Class394 - 8, GameScr.Class156 + 62 + 2 + GameScr.indexRow * 12, 0, Game62.Class2);
            }
            GameScr.Class50.Class1(GameScr.Class194, 12, GameScr.Class157, GameScr.Class156 + 62, GameScr.Class158, GameScr.Class159 - 72, true, 1);
        }
        else if (GameScr.indexMenu == 1) {
            GameScr.Class394 = GameScr.Class157 + 5;
            GameScr.Class395 = GameScr.Class156 + 32;
            if (GameScr.Class31.size() == 0) {
                mFont.number_red.Class1(mGraphics, Game86.Class379, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + 40, 2);
                return;
            }
            mGraphics.setColor(6425);
            mGraphics.fillRect(GameScr.Class394 - 2, GameScr.Class395 - 2, GameScr.Class158 - 6, GameScr.Class192 * 5 + 8);
            Class2(mGraphics);
            GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 6);
            this.Class350 = 0;
            for (int j = 0; j < GameScr.Class31.size(); ++j) {
                final Game41 game41 = (Game41)GameScr.Class31.elementAt(j);
                if (!GameScr.Class199 || game41.Class5) {
                    final int n = j;
                    final int class192 = GameScr.Class192;
                    final int n2 = n * (class192 + class192 / 2);
                    final int class193 = GameScr.Class50.Class2;
                    final int class194 = GameScr.Class192;
                    if (n2 >= class193 - (class194 + class194 / 2)) {
                        final int n3 = j;
                        final int class195 = GameScr.Class192;
                        if (n3 * (class195 + class195 / 2) < GameScr.Class50.Class2 + (GameScr.Class192 * 5 + 8)) {
                            if (GameScr.indexRow == this.Class350) {
                                mGraphics.setColor(Game25.Class2);
                                final int n4 = GameScr.Class394 + 2;
                                final int class196 = GameScr.Class395;
                                final int indexRow = GameScr.indexRow;
                                final int class197 = GameScr.Class192;
                                final int n5 = class196 + indexRow * (class197 + class197 / 2) + 2;
                                final int n6 = GameScr.Class158 - 15;
                                final int class198 = GameScr.Class192;
                                mGraphics.fillRect(n4, n5, n6, class198 + class198 / 2 - 4);
                                mGraphics.setColor(16777215);
                                final int n7 = GameScr.Class394 + 2;
                                final int class199 = GameScr.Class395;
                                final int indexRow2 = GameScr.indexRow;
                                final int class200 = GameScr.Class192;
                                final int n8 = class199 + indexRow2 * (class200 + class200 / 2) + 2;
                                final int n9 = GameScr.Class158 - 15;
                                final int class201 = GameScr.Class192;
                                mGraphics.Class2(n7, n8, n9, class201 + class201 / 2 - 4);
                            }
                            else {
                                mGraphics.setColor(Game25.Class1);
                                final int n10 = GameScr.Class394 + 2;
                                final int class202 = GameScr.Class395;
                                final int class203 = this.Class350;
                                final int class204 = GameScr.Class192;
                                final int n11 = class202 + class203 * (class204 + class204 / 2) + 2;
                                final int n12 = GameScr.Class158 - 15;
                                final int class205 = GameScr.Class192;
                                mGraphics.fillRect(n10, n11, n12, class205 + class205 / 2 - 4);
                                mGraphics.setColor(13932896);
                                final int n13 = GameScr.Class394 + 2;
                                final int class206 = GameScr.Class395;
                                final int class207 = this.Class350;
                                final int class208 = GameScr.Class192;
                                final int n14 = class206 + class207 * (class208 + class208 / 2) + 2;
                                final int n15 = GameScr.Class158 - 15;
                                final int class209 = GameScr.Class192;
                                mGraphics.Class2(n13, n14, n15, class209 + class209 / 2 - 4);
                            }
                            final int class210 = game41.Class1;
                            final int n16 = GameScr.Class394 + 12;
                            final int class211 = GameScr.Class395;
                            final int class212 = this.Class350;
                            final int class213 = GameScr.Class192;
                            Game2.Class1(mGraphics, class210, n16, class211 + class212 * (class213 + class213 / 2) + 13, 0, 3);
                            if (game41.Class3 == 4) {
                                final int n17 = 1216;
                                final int n18 = GameScr.Class394 + 12;
                                final int class214 = GameScr.Class395;
                                final int class215 = this.Class350;
                                final int class216 = GameScr.Class192;
                                Game2.Class1(mGraphics, n17, n18, class214 + class215 * (class216 + class216 / 2) + 30, 0, 3);
                                if (game41.Class5) {
                                    final mFont class217 = mFont.Class12;
                                    final String string = String.valueOf(Game86.Class385[0]) + " ";
                                    final int n19 = GameScr.Class394 + 22;
                                    final int class218 = GameScr.Class395;
                                    final int class219 = this.Class350;
                                    final int class220 = GameScr.Class192;
                                    class217.drawString(mGraphics, string, n19, class218 + class219 * (class220 + class220 / 2) + 5, 0, mFont.Class13);
                                    final mFont number_red = mFont.number_red;
                                    final String string2 = String.valueOf(game41.Class4) + " - " + Game86.Class126 + ": " + game41.Class2;
                                    final int n20 = GameScr.Class394 + 45;
                                    final int class221 = GameScr.Class395;
                                    final int class222 = this.Class350;
                                    final int class223 = GameScr.Class192;
                                    number_red.Class1(mGraphics, string2, n20, class221 + class222 * (class223 + class223 / 2) + 5, 0);
                                    final mFont class224 = mFont.Class16;
                                    final String string3 = String.valueOf(Game86.Class347[7]) + game41.Class6;
                                    final int n21 = GameScr.Class394 + 22;
                                    final int class225 = GameScr.Class395;
                                    final int class226 = this.Class350;
                                    final int class227 = GameScr.Class192;
                                    class224.Class1(mGraphics, string3, n21, class225 + class226 * (class227 + class227 / 2) + 16, 0);
                                    final mFont class228 = mFont.Class10;
                                    final String string4 = String.valueOf(Game86.Class347[11]) + game41.Class7;
                                    final int n22 = GameScr.Class394 + 22;
                                    final int class229 = GameScr.Class395;
                                    final int class230 = this.Class350;
                                    final int class231 = GameScr.Class192;
                                    class228.Class1(mGraphics, string4, n22, class229 + class230 * (class231 + class231 / 2) + 26, 0);
                                }
                                else {
                                    final mFont class232 = mFont.Class13;
                                    final String string5 = String.valueOf(Game86.Class385[0]) + " ";
                                    final int n23 = GameScr.Class394 + 22;
                                    final int class233 = GameScr.Class395;
                                    final int class234 = this.Class350;
                                    final int class235 = GameScr.Class192;
                                    class232.Class1(mGraphics, string5, n23, class233 + class234 * (class235 + class235 / 2) + 5, 0);
                                    final mFont class236 = mFont.Class13;
                                    final String string6 = String.valueOf(game41.Class4) + " - " + Game86.Class126 + ": " + game41.Class2;
                                    final int n24 = GameScr.Class394 + 45;
                                    final int class237 = GameScr.Class395;
                                    final int class238 = this.Class350;
                                    final int class239 = GameScr.Class192;
                                    class236.Class1(mGraphics, string6, n24, class237 + class238 * (class239 + class239 / 2) + 5, 0);
                                    final mFont class240 = mFont.Class13;
                                    final String string7 = String.valueOf(Game86.Class347[7]) + game41.Class6;
                                    final int n25 = GameScr.Class394 + 22;
                                    final int class241 = GameScr.Class395;
                                    final int class242 = this.Class350;
                                    final int class243 = GameScr.Class192;
                                    class240.Class1(mGraphics, string7, n25, class241 + class242 * (class243 + class243 / 2) + 16, 0);
                                    final mFont class244 = mFont.Class13;
                                    final String string8 = String.valueOf(Game86.Class347[11]) + game41.Class7;
                                    final int n26 = GameScr.Class394 + 22;
                                    final int class245 = GameScr.Class395;
                                    final int class246 = this.Class350;
                                    final int class247 = GameScr.Class192;
                                    class244.Class1(mGraphics, string8, n26, class245 + class246 * (class247 + class247 / 2) + 26, 0);
                                }
                            }
                            else if (game41.Class3 == 3) {
                                final int n27 = 1215;
                                final int n28 = GameScr.Class394 + 12;
                                final int class248 = GameScr.Class395;
                                final int class249 = this.Class350;
                                final int class250 = GameScr.Class192;
                                Game2.Class1(mGraphics, n27, n28, class248 + class249 * (class250 + class250 / 2) + 30, 0, 3);
                                if (game41.Class5) {
                                    final mFont class251 = mFont.Class12;
                                    final String string9 = String.valueOf(Game86.Class385[1]) + " ";
                                    final int n29 = GameScr.Class394 + 22;
                                    final int class252 = GameScr.Class395;
                                    final int class253 = this.Class350;
                                    final int class254 = GameScr.Class192;
                                    class251.drawString(mGraphics, string9, n29, class252 + class253 * (class254 + class254 / 2) + 5, 0, mFont.Class13);
                                    final mFont number_red2 = mFont.number_red;
                                    final String string10 = String.valueOf(game41.Class4) + " - " + Game86.Class126 + ": " + game41.Class2;
                                    final int n30 = GameScr.Class394 + 45;
                                    final int class255 = GameScr.Class395;
                                    final int class256 = this.Class350;
                                    final int class257 = GameScr.Class192;
                                    number_red2.Class1(mGraphics, string10, n30, class255 + class256 * (class257 + class257 / 2) + 5, 0);
                                    final mFont class258 = mFont.Class16;
                                    final String string11 = String.valueOf(Game86.Class347[7]) + game41.Class6;
                                    final int n31 = GameScr.Class394 + 22;
                                    final int class259 = GameScr.Class395;
                                    final int class260 = this.Class350;
                                    final int class261 = GameScr.Class192;
                                    class258.Class1(mGraphics, string11, n31, class259 + class260 * (class261 + class261 / 2) + 16, 0);
                                    final mFont class262 = mFont.Class10;
                                    final String string12 = String.valueOf(Game86.Class347[11]) + game41.Class7;
                                    final int n32 = GameScr.Class394 + 22;
                                    final int class263 = GameScr.Class395;
                                    final int class264 = this.Class350;
                                    final int class265 = GameScr.Class192;
                                    class262.Class1(mGraphics, string12, n32, class263 + class264 * (class265 + class265 / 2) + 26, 0);
                                }
                                else {
                                    final mFont class266 = mFont.Class13;
                                    final String string13 = String.valueOf(Game86.Class385[1]) + " ";
                                    final int n33 = GameScr.Class394 + 22;
                                    final int class267 = GameScr.Class395;
                                    final int class268 = this.Class350;
                                    final int class269 = GameScr.Class192;
                                    class266.Class1(mGraphics, string13, n33, class267 + class268 * (class269 + class269 / 2) + 5, 0);
                                    final mFont class270 = mFont.Class13;
                                    final String string14 = String.valueOf(game41.Class4) + " - " + Game86.Class126 + ": " + game41.Class2;
                                    final int n34 = GameScr.Class394 + 45;
                                    final int class271 = GameScr.Class395;
                                    final int class272 = this.Class350;
                                    final int class273 = GameScr.Class192;
                                    class270.Class1(mGraphics, string14, n34, class271 + class272 * (class273 + class273 / 2) + 5, 0);
                                    final mFont class274 = mFont.Class13;
                                    final String string15 = String.valueOf(Game86.Class347[7]) + game41.Class6;
                                    final int n35 = GameScr.Class394 + 22;
                                    final int class275 = GameScr.Class395;
                                    final int class276 = this.Class350;
                                    final int class277 = GameScr.Class192;
                                    class274.Class1(mGraphics, string15, n35, class275 + class276 * (class277 + class277 / 2) + 16, 0);
                                    final mFont class278 = mFont.Class13;
                                    final String string16 = String.valueOf(Game86.Class347[11]) + game41.Class7;
                                    final int n36 = GameScr.Class394 + 22;
                                    final int class279 = GameScr.Class395;
                                    final int class280 = this.Class350;
                                    final int class281 = GameScr.Class192;
                                    class278.Class1(mGraphics, string16, n36, class279 + class280 * (class281 + class281 / 2) + 26, 0);
                                }
                            }
                            else if (game41.Class3 == 2) {
                                final int n37 = 1217;
                                final int n38 = GameScr.Class394 + 12;
                                final int class282 = GameScr.Class395;
                                final int class283 = this.Class350;
                                final int class284 = GameScr.Class192;
                                Game2.Class1(mGraphics, n37, n38, class282 + class283 * (class284 + class284 / 2) + 30, 0, 3);
                                if (game41.Class5) {
                                    final mFont class285 = mFont.Class12;
                                    final String string17 = String.valueOf(Game86.Class385[2]) + " ";
                                    final int n39 = GameScr.Class394 + 22;
                                    final int class286 = GameScr.Class395;
                                    final int class287 = this.Class350;
                                    final int class288 = GameScr.Class192;
                                    class285.drawString(mGraphics, string17, n39, class286 + class287 * (class288 + class288 / 2) + 5, 0, mFont.Class13);
                                    final mFont number_red3 = mFont.number_red;
                                    final String string18 = String.valueOf(game41.Class4) + " - " + Game86.Class126 + ": " + game41.Class2;
                                    final int n40 = GameScr.Class394 + 45;
                                    final int class289 = GameScr.Class395;
                                    final int class290 = this.Class350;
                                    final int class291 = GameScr.Class192;
                                    number_red3.Class1(mGraphics, string18, n40, class289 + class290 * (class291 + class291 / 2) + 5, 0);
                                    final mFont class292 = mFont.Class16;
                                    final String string19 = String.valueOf(Game86.Class347[7]) + game41.Class6;
                                    final int n41 = GameScr.Class394 + 22;
                                    final int class293 = GameScr.Class395;
                                    final int class294 = this.Class350;
                                    final int class295 = GameScr.Class192;
                                    class292.Class1(mGraphics, string19, n41, class293 + class294 * (class295 + class295 / 2) + 16, 0);
                                    final mFont class296 = mFont.Class10;
                                    final String string20 = String.valueOf(Game86.Class347[11]) + game41.Class7;
                                    final int n42 = GameScr.Class394 + 22;
                                    final int class297 = GameScr.Class395;
                                    final int class298 = this.Class350;
                                    final int class299 = GameScr.Class192;
                                    class296.Class1(mGraphics, string20, n42, class297 + class298 * (class299 + class299 / 2) + 26, 0);
                                }
                                else {
                                    final mFont class300 = mFont.Class13;
                                    final String string21 = String.valueOf(Game86.Class385[2]) + " ";
                                    final int n43 = GameScr.Class394 + 22;
                                    final int class301 = GameScr.Class395;
                                    final int class302 = this.Class350;
                                    final int class303 = GameScr.Class192;
                                    class300.Class1(mGraphics, string21, n43, class301 + class302 * (class303 + class303 / 2) + 5, 0);
                                    final mFont class304 = mFont.Class13;
                                    final String string22 = String.valueOf(game41.Class4) + " - " + Game86.Class126 + ": " + game41.Class2;
                                    final int n44 = GameScr.Class394 + 45;
                                    final int class305 = GameScr.Class395;
                                    final int class306 = this.Class350;
                                    final int class307 = GameScr.Class192;
                                    class304.Class1(mGraphics, string22, n44, class305 + class306 * (class307 + class307 / 2) + 5, 0);
                                    final mFont class308 = mFont.Class13;
                                    final String string23 = String.valueOf(Game86.Class347[7]) + game41.Class6;
                                    final int n45 = GameScr.Class394 + 22;
                                    final int class309 = GameScr.Class395;
                                    final int class310 = this.Class350;
                                    final int class311 = GameScr.Class192;
                                    class308.Class1(mGraphics, string23, n45, class309 + class310 * (class311 + class311 / 2) + 16, 0);
                                    final mFont class312 = mFont.Class13;
                                    final String string24 = String.valueOf(Game86.Class347[11]) + game41.Class7;
                                    final int n46 = GameScr.Class394 + 22;
                                    final int class313 = GameScr.Class395;
                                    final int class314 = this.Class350;
                                    final int class315 = GameScr.Class192;
                                    class312.Class1(mGraphics, string24, n46, class313 + class314 * (class315 + class315 / 2) + 26, 0);
                                }
                            }
                            else if (game41.Class3 == 1) {
                                final int n47 = 1214;
                                final int n48 = GameScr.Class394 + 12;
                                final int class316 = GameScr.Class395;
                                final int class317 = this.Class350;
                                final int class318 = GameScr.Class192;
                                Game2.Class1(mGraphics, n47, n48, class316 + class317 * (class318 + class318 / 2) + 30, 0, 3);
                                if (game41.Class5) {
                                    final mFont class319 = mFont.Class12;
                                    final String string25 = String.valueOf(Game86.Class385[3]) + " ";
                                    final int n49 = GameScr.Class394 + 22;
                                    final int class320 = GameScr.Class395;
                                    final int class321 = this.Class350;
                                    final int class322 = GameScr.Class192;
                                    class319.drawString(mGraphics, string25, n49, class320 + class321 * (class322 + class322 / 2) + 5, 0, mFont.Class13);
                                    final mFont number_red4 = mFont.number_red;
                                    final String string26 = String.valueOf(game41.Class4) + " - " + Game86.Class126 + ": " + game41.Class2;
                                    final int n50 = GameScr.Class394 + 45;
                                    final int class323 = GameScr.Class395;
                                    final int class324 = this.Class350;
                                    final int class325 = GameScr.Class192;
                                    number_red4.Class1(mGraphics, string26, n50, class323 + class324 * (class325 + class325 / 2) + 5, 0);
                                    final mFont class326 = mFont.Class16;
                                    final String string27 = String.valueOf(Game86.Class347[7]) + game41.Class6;
                                    final int n51 = GameScr.Class394 + 22;
                                    final int class327 = GameScr.Class395;
                                    final int class328 = this.Class350;
                                    final int class329 = GameScr.Class192;
                                    class326.Class1(mGraphics, string27, n51, class327 + class328 * (class329 + class329 / 2) + 16, 0);
                                    final mFont class330 = mFont.Class10;
                                    final String string28 = String.valueOf(Game86.Class347[11]) + game41.Class7;
                                    final int n52 = GameScr.Class394 + 22;
                                    final int class331 = GameScr.Class395;
                                    final int class332 = this.Class350;
                                    final int class333 = GameScr.Class192;
                                    class330.Class1(mGraphics, string28, n52, class331 + class332 * (class333 + class333 / 2) + 26, 0);
                                }
                                else {
                                    final mFont class334 = mFont.Class13;
                                    final String string29 = String.valueOf(Game86.Class385[3]) + " ";
                                    final int n53 = GameScr.Class394 + 22;
                                    final int class335 = GameScr.Class395;
                                    final int class336 = this.Class350;
                                    final int class337 = GameScr.Class192;
                                    class334.Class1(mGraphics, string29, n53, class335 + class336 * (class337 + class337 / 2) + 5, 0);
                                    final mFont class338 = mFont.Class13;
                                    final String string30 = String.valueOf(game41.Class4) + " - " + Game86.Class126 + ": " + game41.Class2;
                                    final int n54 = GameScr.Class394 + 45;
                                    final int class339 = GameScr.Class395;
                                    final int class340 = this.Class350;
                                    final int class341 = GameScr.Class192;
                                    class338.Class1(mGraphics, string30, n54, class339 + class340 * (class341 + class341 / 2) + 5, 0);
                                    final mFont class342 = mFont.Class13;
                                    final String string31 = String.valueOf(Game86.Class347[7]) + game41.Class6;
                                    final int n55 = GameScr.Class394 + 22;
                                    final int class343 = GameScr.Class395;
                                    final int class344 = this.Class350;
                                    final int class345 = GameScr.Class192;
                                    class342.Class1(mGraphics, string31, n55, class343 + class344 * (class345 + class345 / 2) + 16, 0);
                                    final mFont class346 = mFont.Class13;
                                    final String string32 = String.valueOf(Game86.Class347[11]) + game41.Class7;
                                    final int n56 = GameScr.Class394 + 22;
                                    final int class347 = GameScr.Class395;
                                    final int class348 = this.Class350;
                                    final int class349 = GameScr.Class192;
                                    class346.Class1(mGraphics, string32, n56, class347 + class348 * (class349 + class349 / 2) + 26, 0);
                                }
                            }
                            else if (game41.Class5) {
                                final mFont number_red5 = mFont.number_red;
                                final String string33 = String.valueOf(game41.Class4) + " - " + Game86.Class126 + ": " + game41.Class2;
                                final int n57 = GameScr.Class394 + 22;
                                final int class350 = GameScr.Class395;
                                final int class351 = this.Class350;
                                final int class352 = GameScr.Class192;
                                number_red5.Class1(mGraphics, string33, n57, class350 + class351 * (class352 + class352 / 2) + 5, 0);
                                final mFont class353 = mFont.Class16;
                                final String string34 = String.valueOf(Game86.Class347[7]) + game41.Class6;
                                final int n58 = GameScr.Class394 + 22;
                                final int class354 = GameScr.Class395;
                                final int class355 = this.Class350;
                                final int class356 = GameScr.Class192;
                                class353.Class1(mGraphics, string34, n58, class354 + class355 * (class356 + class356 / 2) + 16, 0);
                                final mFont class357 = mFont.Class10;
                                final String string35 = String.valueOf(Game86.Class347[11]) + game41.Class7;
                                final int n59 = GameScr.Class394 + 22;
                                final int class358 = GameScr.Class395;
                                final int class359 = this.Class350;
                                final int class360 = GameScr.Class192;
                                class357.Class1(mGraphics, string35, n59, class358 + class359 * (class360 + class360 / 2) + 26, 0);
                            }
                            else {
                                final mFont class361 = mFont.Class13;
                                final String string36 = String.valueOf(game41.Class4) + " - " + Game86.Class126 + ": " + game41.Class2;
                                final int n60 = GameScr.Class394 + 22;
                                final int class362 = GameScr.Class395;
                                final int class363 = this.Class350;
                                final int class364 = GameScr.Class192;
                                class361.Class1(mGraphics, string36, n60, class362 + class363 * (class364 + class364 / 2) + 5, 0);
                                final mFont class365 = mFont.Class13;
                                final String string37 = String.valueOf(Game86.Class347[7]) + game41.Class6;
                                final int n61 = GameScr.Class394 + 22;
                                final int class366 = GameScr.Class395;
                                final int class367 = this.Class350;
                                final int class368 = GameScr.Class192;
                                class365.Class1(mGraphics, string37, n61, class366 + class367 * (class368 + class368 / 2) + 16, 0);
                                final mFont class369 = mFont.Class13;
                                final String string38 = String.valueOf(Game86.Class347[11]) + game41.Class7;
                                final int n62 = GameScr.Class394 + 22;
                                final int class370 = GameScr.Class395;
                                final int class371 = this.Class350;
                                final int class372 = GameScr.Class192;
                                class369.Class1(mGraphics, string38, n62, class370 + class371 * (class372 + class372 / 2) + 26, 0);
                            }
                        }
                    }
                    ++this.Class350;
                }
            }
            final Game50 class373 = GameScr.Class50;
            final int class374 = this.Class350;
            final int class375 = GameScr.Class192;
            class373.Class1(class374, class375 + class375 / 2, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 4, true, 1);
            GameScr.Class194 = this.Class350;
            Class13(mGraphics);
        }
        else {
            if (GameScr.indexMenu == 2) {
                GameScr.Class394 = GameScr.Class157 + 3;
                GameScr.Class395 = GameScr.Class156 + 32;
                mGraphics.setColor(6425);
                mGraphics.fillRect(GameScr.Class394 - 1, GameScr.Class395 - 1, GameScr.Class400 * GameScr.Class192 + 3, 5 * GameScr.Class192 + 3);
                Item[] class376;
                if (Char.Class57 == null || Char.Class57.Class16 == null) {
                    class376 = new Item[30];
                }
                else {
                    class376 = Char.Class57.Class16;
                }
                this.Class1(mGraphics, class376);
                return;
            }
            if (GameScr.indexMenu != 3) {
                if (GameScr.indexMenu == 4) {
                    this.Class42(mGraphics);
                }
                return;
            }
            if (Char.Class57 == null || Char.Class57.Class1 == null || Char.Class57.Class1.equals("") || Char.Class57.Class12.equals("")) {
                GameScr.Class194 = 1;
                mFont.number_red.Class1(mGraphics, Game86.Class379, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + 40, 2);
                return;
            }
            GameScr.Class194 = 1;
            GameScr.Class394 = GameScr.Class157 + 17;
            GameScr.Class395 = GameScr.Class156 + 34;
            GameScr.Class409 = GameScr.Class158 - 30;
            GameScr.Class50.Class1(mGraphics);
            if (this.Class352 == null) {
                this.Class352 = Class1(mFont.number_red, Char.Class57.Class12);
            }
            this.Class1(mGraphics, mFont.number_red, this.Class352, GameScr.Class394, GameScr.Class395);
            if (GameScr.Class193 == 1 && GameScr.indexRow >= 0) {
                Game2.Class1(mGraphics, 942, GameScr.Class394 - 8, GameScr.Class156 + 34 + 2 + GameScr.indexRow * 12, 0, Game62.Class2);
            }
            GameScr.Class50.Class1(GameScr.Class194, 12, GameScr.Class157, GameScr.Class156 + 35, GameScr.Class158, GameScr.Class159 - 44, true, 1);
        }
    }
    
    private static void Class13(final mGraphics mGraphics) {
        Class2(mGraphics);
        int n = GameScr.indexRow;
        if (GameScr.Class241) {
            n = GameScr.indexSelect;
        }
        if (n >= 0 && GameScr.Class194 > 0) {
            mFont.Class12.drawString(mGraphics, String.valueOf((n + 1 < GameScr.Class194) ? (n + 1) : GameScr.Class194) + "/" + GameScr.Class194, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 12, 2, mFont.Class13);
        }
    }
    
    private void Class72() {
        if (!GameScr.Class93 || GameScr.indexMenu == -1 || GameCanvas.Class34 != null) {
            return;
        }
        if (GameScr.Class193 == 0) {
            final Command command = null;
            super.center = command;
            super.left = command;
            if (GameScr.indexMenu == 0) {
                super.left = new Command(Game86.Class56, 110221);
            }
            if (GameCanvas.Class12[8]) {
                GameScr.Class193 = 1;
                GameScr.indexSelect = 0;
                GameScr.indexRow = 0;
                GameScr.Class50.Class1();
                GameScr.Class196.Class1();
            }
            if (GameCanvas.Class12[4]) {
                GameScr.indexSelect = 0;
                GameScr.indexRow = -1;
                --GameScr.indexMenu;
                GameScr.Class50.Class1();
                GameScr.Class196.Class1();
                if (GameScr.Class97.charID != Char.getMyChar().charID) {
                    if (GameScr.indexMenu < 3) {
                        GameScr.indexMenu = 5;
                    }
                }
                else if (GameScr.indexMenu < 0) {
                    GameScr.indexMenu = Game86.Class163.length - 1;
                }
                this.Class55();
            }
            if (GameCanvas.Class12[6]) {
                GameScr.indexSelect = 0;
                GameScr.indexRow = -1;
                ++GameScr.indexMenu;
                GameScr.Class50.Class1();
                GameScr.Class196.Class1();
                if (GameScr.Class97.charID != Char.getMyChar().charID) {
                    if (GameScr.indexMenu > 5) {
                        GameScr.indexMenu = 3;
                    }
                }
                else if (GameScr.indexMenu > Game86.Class163.length - 1) {
                    GameScr.indexMenu = 0;
                }
                this.Class55();
            }
            this.Class36();
        }
        else if (GameScr.Class92) {
            if (GameCanvas.Class12[2]) {
                if (--GameScr.indexRow < 0) {
                    GameScr.indexRow = GameScr.Class194 - 1;
                }
                GameScr.Class196.Class1(GameScr.indexRow * GameScr.Class196.Class8);
            }
            else if (GameCanvas.Class12[8]) {
                if (++GameScr.indexRow >= GameScr.Class194) {
                    GameScr.indexRow = 0;
                }
                GameScr.Class196.Class1(GameScr.indexRow * GameScr.Class196.Class8);
            }
        }
        else if (GameScr.indexMenu == 0) {
            if (GameCanvas.Class12[4]) {
                if (--GameScr.indexSelect < 0) {
                    GameScr.indexSelect = Char.getMyChar().arrItemBag.length - 1;
                }
                final Command command2 = null;
                super.center = command2;
                super.left = command2;
                this.Class36();
                GameScr.Class50.Class1(GameScr.indexSelect / GameScr.Class400 * GameScr.Class50.Class8);
            }
            else if (GameCanvas.Class12[6]) {
                if (++GameScr.indexSelect >= Char.getMyChar().arrItemBag.length) {
                    GameScr.indexSelect = 0;
                }
                final Command command3 = null;
                super.center = command3;
                super.left = command3;
                this.Class36();
                GameScr.Class50.Class1(GameScr.indexSelect / GameScr.Class400 * GameScr.Class50.Class8);
            }
            else if (GameCanvas.Class12[8]) {
                if (GameScr.indexSelect + GameScr.Class400 <= Char.getMyChar().arrItemBag.length - 1) {
                    GameScr.indexSelect += GameScr.Class400;
                }
                final Command command4 = null;
                super.center = command4;
                super.left = command4;
                this.Class36();
                GameScr.Class50.Class1(GameScr.indexSelect / GameScr.Class400 * GameScr.Class50.Class8);
            }
            else if (GameCanvas.Class12[2]) {
                if (GameScr.indexSelect >= 0 && GameScr.indexSelect < GameScr.Class400) {
                    GameScr.Class193 = 0;
                    GameScr.indexSelect = 0;
                }
                else if (GameScr.indexSelect - GameScr.Class400 >= 0) {
                    GameScr.indexSelect -= GameScr.Class400;
                }
                final Command command5 = null;
                super.center = command5;
                super.left = command5;
                this.Class36();
                GameScr.Class50.Class1(GameScr.indexSelect / GameScr.Class400 * GameScr.Class50.Class8);
            }
        }
        else if (GameScr.indexMenu == 1) {
            if (GameCanvas.Class12[2]) {
                if (GameScr.Class193 == 1 && GameScr.indexRow == -1) {
                    --GameScr.Class193;
                }
                else if (GameScr.Class193 == 1 && GameScr.indexRow >= 0) {
                    --GameScr.indexRow;
                }
                GameScr.Class196.Class1(GameScr.indexRow * GameScr.Class196.Class8);
            }
            else if (GameCanvas.Class12[8]) {
                if (GameScr.Class193 == 0) {
                    ++GameScr.Class193;
                }
                else if (GameScr.Class193 == 1) {
                    if (++GameScr.indexRow >= GameScr.Class194) {
                        GameScr.indexRow = 0;
                    }
                    GameScr.Class196.Class1(GameScr.indexRow * GameScr.Class196.Class8);
                }
                final Command command6 = null;
                super.center = command6;
                super.left = command6;
                this.Class36();
            }
            else if (GameCanvas.Class12[4]) {
                GameScr.indexRow = -1;
                if (GameScr.Class193 == 1 && --GameScr.indexSelect < 0) {
                    GameScr.indexSelect = Char.getMyChar().nClass.Class3.length - 1;
                }
                final Command command7 = null;
                super.center = command7;
                super.left = command7;
                this.Class36();
                GameScr.Class50.Class1(GameScr.indexSelect * GameScr.Class50.Class8);
                GameScr.Class196.Class1();
                GameScr.indexRow = 0;
            }
            else if (GameCanvas.Class12[6]) {
                GameScr.indexRow = -1;
                if (GameScr.Class193 == 1 && ++GameScr.indexSelect >= Char.getMyChar().nClass.Class3.length) {
                    GameScr.indexSelect = 0;
                }
                final Command command8 = null;
                super.center = command8;
                super.left = command8;
                this.Class36();
                GameScr.Class50.Class1(GameScr.indexSelect * GameScr.Class50.Class8);
                GameScr.Class196.Class1();
                GameScr.indexRow = 0;
            }
        }
        else if (GameScr.indexMenu == 2) {
            if (GameCanvas.Class12[2]) {
                --GameScr.Class193;
            }
            else if (GameCanvas.Class12[8]) {
                if (++GameScr.Class193 >= 5) {
                    GameScr.Class193 = 1;
                }
                final Command command9 = null;
                super.center = command9;
                super.left = command9;
                this.Class36();
            }
        }
        else if (GameScr.indexMenu == 3) {
            if (GameScr.indexRow < 0) {
                GameScr.indexRow = 0;
            }
            if (GameCanvas.Class12[2]) {
                if (GameScr.indexRow == 0) {
                    --GameScr.Class193;
                    GameScr.indexRow = -1;
                }
                else {
                    --GameScr.indexRow;
                }
                GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
            }
            else if (GameCanvas.Class12[8]) {
                if (++GameScr.indexRow >= GameScr.Class194) {
                    GameScr.indexRow = 0;
                }
                GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
            }
        }
        else if (GameScr.indexMenu == 4) {
            final int indexSelect = GameScr.indexSelect;
            if (GameScr.indexSelect == 11 || GameScr.indexSelect == 12 || GameScr.indexSelect == 13 || GameScr.indexSelect == 14) {
                if (GameCanvas.Class12[2] || GameCanvas.Class12[4]) {
                    --GameScr.indexSelect;
                }
                else if (GameCanvas.Class12[6] || GameCanvas.Class12[8]) {
                    ++GameScr.indexSelect;
                }
            }
            else if (GameScr.indexSelect == 9) {
                if (GameCanvas.Class12[2]) {
                    GameScr.indexSelect -= 2;
                }
                else if (GameCanvas.Class12[8]) {
                    GameScr.indexSelect = 15;
                }
                else if (GameCanvas.Class12[4]) {
                    --GameScr.indexSelect;
                }
                else if (GameCanvas.Class12[6]) {
                    ++GameScr.indexSelect;
                }
            }
            else if (GameScr.indexSelect == 10) {
                if (GameCanvas.Class12[2]) {
                    GameScr.indexSelect -= 2;
                }
                else if (GameCanvas.Class12[4]) {
                    --GameScr.indexSelect;
                }
                else if (GameCanvas.Class12[6] || GameCanvas.Class12[8]) {
                    ++GameScr.indexSelect;
                }
            }
            else if (GameScr.indexSelect == 15) {
                if (GameCanvas.Class12[2]) {
                    GameScr.indexSelect = 9;
                }
                else if (GameCanvas.Class12[4]) {
                    --GameScr.indexSelect;
                }
                else if (GameCanvas.Class12[8] || GameCanvas.Class12[6]) {
                    GameScr.indexSelect = 0;
                }
            }
            else if (GameCanvas.Class12[2]) {
                if (GameScr.indexSelect <= 1) {
                    GameScr.indexSelect = 0;
                    GameScr.Class193 = 0;
                }
                else {
                    GameScr.indexSelect -= 2;
                }
            }
            else if (GameCanvas.Class12[8]) {
                if ((GameScr.indexSelect += 2) > 15) {
                    GameScr.indexSelect = 0;
                }
            }
            else if (GameCanvas.Class12[4]) {
                if (--GameScr.indexSelect < 0) {
                    GameScr.indexSelect = 15;
                }
            }
            else if (GameCanvas.Class12[6] && ++GameScr.indexSelect > 11) {
                GameScr.indexSelect = 0;
            }
            if (indexSelect != GameScr.indexSelect) {
                final Command command10 = null;
                super.center = command10;
                super.left = command10;
                this.Class36();
            }
        }
        else if (GameScr.indexMenu == 5) {
            if (GameCanvas.Class12[2]) {
                if (GameScr.indexSelect == 4) {
                    GameScr.indexSelect = 0;
                    --GameScr.Class193;
                }
                else if (--GameScr.indexSelect < 0) {
                    GameScr.indexSelect = 0;
                    --GameScr.Class193;
                }
                this.Class36();
            }
            else if (GameCanvas.Class12[4]) {
                if (GameScr.indexSelect >= 2 && GameScr.indexSelect != 4) {
                    GameScr.indexSelect = 4;
                }
                else {
                    GameScr.indexSelect = 0;
                }
                this.Class36();
            }
            else if (GameCanvas.Class12[6]) {
                if (GameScr.indexSelect < 2) {
                    GameScr.indexSelect = 4;
                }
                else {
                    GameScr.indexSelect = 2;
                }
                this.Class36();
            }
            else if (GameCanvas.Class12[8]) {
                if (++GameScr.indexSelect >= 4) {
                    GameScr.indexSelect = 0;
                }
                this.Class36();
            }
        }
        else if (GameScr.indexMenu == 6) {
            if (GameScr.Class458 == 0) {
                if (GameCanvas.Class12[2]) {
                    if (GameScr.indexSelect == 4) {
                        GameScr.indexSelect = 0;
                        --GameScr.Class193;
                    }
                    else if (--GameScr.indexSelect < 0) {
                        GameScr.indexSelect = 0;
                        --GameScr.Class193;
                    }
                    this.Class36();
                }
                else if (GameCanvas.Class12[4]) {
                    if (GameScr.indexSelect >= 2 && GameScr.indexSelect != 4) {
                        GameScr.indexSelect = 4;
                    }
                    else {
                        GameScr.indexSelect = 0;
                    }
                    this.Class36();
                }
                else if (GameCanvas.Class12[6]) {
                    if (GameScr.indexSelect < 2) {
                        GameScr.indexSelect = 4;
                    }
                    else {
                        GameScr.indexSelect = 2;
                    }
                    this.Class36();
                }
                else if (GameCanvas.Class12[8]) {
                    if (++GameScr.indexSelect >= 4) {
                        GameScr.indexSelect = 0;
                    }
                    this.Class36();
                }
            }
            else if (GameScr.Class458 == 1) {
                if (GameCanvas.Class12[2]) {
                    --GameScr.Class193;
                }
                else if (GameCanvas.Class12[8]) {
                    if (++GameScr.Class193 >= 5) {
                        GameScr.Class193 = 1;
                    }
                    final Command command11 = null;
                    super.center = command11;
                    super.left = command11;
                    this.Class36();
                }
            }
            else if (GameCanvas.Class12[2]) {
                if (GameScr.Class193 == 1 && GameScr.indexRow == -1) {
                    --GameScr.Class193;
                }
                else if (GameScr.Class193 == 1 && GameScr.indexRow >= 0) {
                    --GameScr.indexRow;
                }
                GameScr.Class196.Class1(GameScr.indexRow * GameScr.Class196.Class8);
            }
            else if (GameCanvas.Class12[8]) {
                if (GameScr.Class193 == 0) {
                    ++GameScr.Class193;
                }
                else if (GameScr.Class193 == 1) {
                    if (++GameScr.indexRow >= GameScr.Class194) {
                        GameScr.indexRow = 0;
                    }
                    GameScr.Class196.Class1(GameScr.indexRow * GameScr.Class196.Class8);
                }
                final Command command12 = null;
                super.center = command12;
                super.left = command12;
                this.Class36();
            }
            else if (GameCanvas.Class12[4]) {
                GameScr.indexRow = -1;
                if (GameScr.Class193 == 1 && --GameScr.indexSelect < 0) {
                    GameScr.indexSelect = Char.getMyChar().nClass.Class3.length - 1;
                }
                final Command command13 = null;
                super.center = command13;
                super.left = command13;
                this.Class36();
                GameScr.Class50.Class1(GameScr.indexSelect * GameScr.Class50.Class8);
                GameScr.Class196.Class1();
                GameScr.indexRow = 0;
            }
            else if (GameCanvas.Class12[6]) {
                GameScr.indexRow = -1;
                if (GameScr.Class193 == 1 && ++GameScr.indexSelect >= Char.getMyChar().nClass.Class3.length) {
                    GameScr.indexSelect = 0;
                }
                final Command command14 = null;
                super.center = command14;
                super.left = command14;
                this.Class36();
                GameScr.Class50.Class1(GameScr.indexSelect * GameScr.Class50.Class8);
                GameScr.Class196.Class1();
                GameScr.indexRow = 0;
            }
        }
        Label_3956: {
            if (GameCanvas.Class6) {
                if (!GameCanvas.Class30.Class1 && GameCanvas.Class34 == null) {
                    if (GameCanvas.Class16 && GameCanvas.Class2(GameScr.Class157, GameScr.Class156, GameScr.Class158, this.Class418) && (!GameScr.Class92 || GameCanvas.Class25 >= 320) && GameCanvas.Class15) {
                        if (GameCanvas.Class2(GameScr.Class11 - 90, GameScr.Class156 + 5, 60, 40)) {
                            GameScr.indexSelect = 0;
                            --GameScr.indexMenu;
                        }
                        if (GameCanvas.Class2(GameScr.Class11 + 20, GameScr.Class156 + 5, 60, 40)) {
                            GameScr.indexSelect = 0;
                            ++GameScr.indexMenu;
                        }
                        GameScr.Class92 = false;
                        GameScr.Class50.Class1();
                        GameScr.Class196.Class1();
                        if (GameScr.Class97.charID != Char.getMyChar().charID) {
                            if (GameScr.indexMenu < 3) {
                                GameScr.indexMenu = Game86.Class163.length - 1;
                            }
                            if (GameScr.indexMenu > Game86.Class163.length - 1) {
                                GameScr.indexMenu = 3;
                            }
                        }
                        else {
                            if (GameScr.indexMenu < 0) {
                                GameScr.indexMenu = Game86.Class163.length - 1;
                            }
                            if (GameScr.indexMenu > Game86.Class163.length - 1) {
                                GameScr.indexMenu = 0;
                            }
                        }
                        GameScr.Class193 = 1;
                        GameScr.indexSelect = -1;
                        this.Class55();
                    }
                    if (GameScr.Class92) {
                        final Game68 class2;
                        if ((class2 = GameScr.Class196.Class2()).Class1 || class2.Class3) {
                            GameScr.indexRow = class2.Class2;
                            GameScr.Class193 = 1;
                        }
                        if (GameCanvas.Class8) {
                            break Label_3956;
                        }
                    }
                    if (GameScr.indexMenu == 0) {
                        final Game68 class3;
                        if ((class3 = GameScr.Class50.Class2()).Class1 || class3.Class3) {
                            if (GameScr.indexSelect != class3.Class2) {
                                GameScr.indexSelect = class3.Class2;
                                final Command command15 = null;
                                super.center = command15;
                                super.left = command15;
                                if (GameCanvas.Class8) {
                                    this.Class36();
                                }
                                else if (getItemFocus(3) != null) {
                                    this.Class198();
                                }
                                else {
                                    GameScr.Class92 = false;
                                    super.left = this.Class412;
                                }
                            }
                            GameScr.Class193 = 1;
                        }
                    }
                    else if (GameScr.indexMenu == 1) {
                        final Game68 class4;
                        if ((class4 = GameScr.Class50.Class2()).Class1 || class4.Class3) {
                            if (GameScr.indexSelect != class4.Class2) {
                                if ((GameScr.indexSelect = class4.Class2) >= Char.getMyChar().nClass.Class3.length) {
                                    GameScr.indexSelect = -1;
                                }
                                final Command command16 = null;
                                super.center = command16;
                                super.left = command16;
                                this.Class36();
                                GameScr.Class196.Class1();
                                GameScr.indexRow = 0;
                            }
                            GameScr.Class193 = 1;
                        }
                        else {
                            final Game68 class5;
                            if (((class5 = GameScr.Class196.Class2()).Class1 || class5.Class3) && GameScr.indexRow != class5.Class2) {
                                GameScr.indexRow = class5.Class2;
                            }
                        }
                    }
                    else if (GameScr.indexMenu == 2) {
                        if (GameCanvas.Class16 && GameCanvas.Class2(GameScr.Class157 + 5, GameScr.Class156 + 52, GameScr.Class158 - 10, 130) && GameCanvas.Class15) {
                            int n = (GameCanvas.Class18 - (GameScr.Class156 + 52)) / 32;
                            if (++n == this.Class353) {
                                final MyVector myVector;
                                (myVector = new MyVector()).addElement(new Command(Game86.Class103, 11064));
                                myVector.addElement(new Command(Game86.Class104, 11065));
                                GameCanvas.Class30.Class1(myVector);
                            }
                            GameScr.Class193 = n;
                            this.Class353 = n;
                            this.Class36();
                        }
                    }
                    else if (GameScr.indexMenu == 3) {
                        final Game68 class6;
                        if ((class6 = GameScr.Class50.Class2()).Class1 || class6.Class3) {
                            GameScr.indexRow = class6.Class2;
                            GameScr.Class193 = 1;
                        }
                    }
                    else if (GameScr.indexMenu == 4) {
                        if (GameCanvas.Class16) {
                            GameScr.Class193 = 1;
                            if (GameCanvas.Class2(GameScr.Class157 + 4, GameScr.Class156 + 35, GameScr.Class192, 130)) {
                                GameScr.indexSelect = (GameCanvas.Class18 - (GameScr.Class156 + 35)) / GameScr.Class192 << 1;
                                final Command command17 = null;
                                super.center = command17;
                                super.left = command17;
                                this.Class36();
                            }
                            if (GameCanvas.Class2(GameScr.Class157 + GameScr.Class158 - 30, GameScr.Class156 + 35, GameScr.Class192, 130)) {
                                GameScr.indexSelect = ((GameCanvas.Class20 - (GameScr.Class156 + 35)) / GameScr.Class192 << 1) + 1;
                                final Command command18 = null;
                                super.center = command18;
                                super.left = command18;
                                this.Class36();
                            }
                            if (GameCanvas.Class2(GameScr.Class157 + 4, GameScr.Class156 + 165, GameScr.Class158 - 8, GameScr.Class192)) {
                                int indexSelect2 = (GameCanvas.Class19 - (GameScr.Class157 + 4)) / GameScr.Class192;
                                indexSelect2 += 10;
                                GameScr.indexSelect = indexSelect2;
                                final Command command19 = null;
                                super.center = command19;
                                super.left = command19;
                                this.Class36();
                            }
                        }
                    }
                    else if (GameScr.indexMenu == 5) {
                        if (GameCanvas.Class16) {
                            for (int i = 0; i < this.Class281.length; ++i) {
                                if (i == 4) {
                                    if (GameCanvas.Class2(this.Class281[i], this.Class282[i], 84, 75) && GameCanvas.Class15) {
                                        GameScr.Class193 = 1;
                                        GameScr.indexSelect = 4;
                                        this.Class36();
                                        if (!GameCanvas.Class8 && super.center != null) {
                                            this.Class2(super.center.Class4, super.center.Class11);
                                        }
                                    }
                                }
                                else {
                                    final int n2 = this.Class281[i];
                                    final int n3 = this.Class282[i];
                                    final int class7 = GameScr.Class192;
                                    if (GameCanvas.Class2(n2, n3, class7, class7) && GameCanvas.Class15) {
                                        GameScr.Class193 = 1;
                                        GameScr.indexSelect = i;
                                        this.Class36();
                                        if (!GameCanvas.Class8) {
                                            if (GameScr.Class97.Class80[GameScr.indexSelect] != null) {
                                                this.Class2(super.center.Class4, super.center.Class11);
                                            }
                                            else {
                                                GameScr.Class92 = false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else if (GameScr.indexMenu == 6) {
                        if (GameScr.Class458 == 0) {
                            if (GameCanvas.Class16) {
                                for (int j = 0; j < this.Class281.length; ++j) {
                                    if (j == 4) {
                                        if (GameCanvas.Class2(this.Class281[j], this.Class282[j], 84, 75) && GameCanvas.Class15) {
                                            GameScr.Class193 = 1;
                                            GameScr.indexSelect = 4;
                                            this.Class36();
                                            if (!GameCanvas.Class8 && super.center != null) {
                                                this.Class2(super.center.Class4, super.center.Class11);
                                            }
                                        }
                                    }
                                    else {
                                        final int n4 = this.Class281[j];
                                        final int n5 = this.Class282[j];
                                        final int class8 = GameScr.Class192;
                                        if (GameCanvas.Class2(n4, n5, class8, class8) && GameCanvas.Class15) {
                                            GameScr.Class193 = 1;
                                            GameScr.indexSelect = j;
                                            this.Class36();
                                            if (!GameCanvas.Class8) {
                                                if (GameScr.Class97.Class80[GameScr.indexSelect] != null) {
                                                    this.Class2(super.center.Class4, super.center.Class11);
                                                }
                                                else {
                                                    GameScr.Class92 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        else if (GameScr.Class458 == 1) {
                            if (GameCanvas.Class16 && GameCanvas.Class2(GameScr.Class157 + 5, GameScr.Class156 + 52, GameScr.Class158 - 10, 130) && GameCanvas.Class15) {
                                int n6 = (GameCanvas.Class18 - (GameScr.Class156 + 52)) / 32;
                                if (++n6 == this.Class353) {
                                    Class229();
                                }
                                GameScr.Class193 = n6;
                                this.Class353 = n6;
                                this.Class36();
                            }
                        }
                        else {
                            final Game68 class9;
                            if ((class9 = GameScr.Class50.Class2()).Class1 || class9.Class3) {
                                if (GameScr.indexSelect != class9.Class2) {
                                    if ((GameScr.indexSelect = class9.Class2) >= Char.getMyChar().nClass.Class3.length) {
                                        GameScr.indexSelect = -1;
                                    }
                                    final Command command20 = null;
                                    super.center = command20;
                                    super.left = command20;
                                    this.Class36();
                                    GameScr.Class196.Class1();
                                    GameScr.indexRow = 0;
                                }
                                GameScr.Class193 = 1;
                            }
                            else {
                                final Game68 class10;
                                if (((class10 = GameScr.Class196.Class2()).Class1 || class10.Class3) && GameScr.indexRow != class10.Class2) {
                                    GameScr.indexRow = class10.Class2;
                                }
                            }
                        }
                    }
                }
            }
        }
        GameCanvas.Class8();
        GameCanvas.Class7();
    }
    
    private static Game41 Class73() {
        return (Game41)GameScr.Class31.elementAt(GameScr.indexRow);
    }
    
    private void Class74() {
        if (GameScr.Class92) {
            return;
        }
        final Command command = null;
        super.center = command;
        super.left = command;
        if (GameScr.indexMenu == 0) {
            if (Char.getMyChar().Class56 == 4) {
                super.left = new Command(Game86.Class384[0], 14004);
            }
            if (Char.getMyChar().Class56 == 3) {
                super.left = new Command(Game86.Class384[1], 14004);
            }
            if (Char.getMyChar().Class56 == 2) {
                super.left = new Command(Game86.Class384[2], 14004);
            }
            if (!Char.getMyChar().Class55.equals("")) {
                if (GameScr.Class193 == 1) {
                    super.center = new Command(Game86.Class50, 140101);
                    return;
                }
                super.center = new Command(Game86.Class386[3], 14010);
            }
        }
        else if (GameScr.indexMenu == 1) {
            final Game41 class73;
            if (GameScr.Class31.size() > 0 && GameScr.indexRow >= 0 && GameScr.indexRow < GameScr.Class31.size() && (class73 = Class73()) != null) {
                if (Char.getMyChar().Class56 == 4) {
                    super.left = new Command(Game86.Class384[0], 14005);
                }
                if (Char.getMyChar().Class56 == 3) {
                    super.left = new Command(Game86.Class384[1], 14005);
                }
                if (Char.getMyChar().Class56 != 4 && Char.getMyChar().Class56 != 3) {
                    super.left = new Command(Game86.Class384[4], 14005);
                }
                if (!class73.Class4.equals(Char.getMyChar().cName) && (!GameScr.Class199 || this.Class350 != 0)) {
                    super.center = new Command(Game86.Class119, 14006, class73.Class4);
                }
            }
        }
        else if (GameScr.indexMenu == 2 && GameScr.Class193 == 1) {
            if (Char.Class57 == null || Char.Class57.Class16 == null) {
                return;
            }
            super.left = new Command(Game86.Class119, 1508);
            if (!GameCanvas.Class9) {
                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 1509);
            }
        }
    }
    
    private void Class75() {
        if (!GameScr.isPaintAlert || GameCanvas.Class34 != null) {
            return;
        }
        int n = 0;
        if (GameCanvas.Class12[8]) {
            if (++GameScr.indexRow >= this.texts.size()) {
                GameScr.indexRow = 0;
            }
            n = 1;
        }
        else if (GameCanvas.Class12[2]) {
            if (--GameScr.indexRow < 0) {
                GameScr.indexRow = this.texts.size() - 1;
            }
            n = 1;
        }
        if (n != 0) {
            GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
            GameCanvas.Class8();
            GameCanvas.Class7();
        }
        final Game68 class2;
        if (GameCanvas.Class6 && ((class2 = GameScr.Class50.Class2()).Class1 || class2.Class3)) {
            GameScr.indexRow = class2.Class2;
            n = 1;
        }
        final Game44 class3;
        if (GameScr.Class96 && !GameCanvas.Class6 && (class3 = ChatManager.gI().Class5()).Class1 == 2 && GameScr.indexRow == 0) {
            Game23.Class1().Class6 = new Command(Game86.Class35, 120051, class3);
        }
        if (n != 0 && GameScr.indexRow >= 0 && GameScr.indexRow < this.texts.size()) {
            final String s = (String)this.texts.elementAt(GameScr.indexRow);
            this.Class393 = null;
            this.Class392 = null;
            super.center = null;
            Game23.Class1().Class6 = null;
            final int index;
            if ((index = s.indexOf("http://")) >= 0) {
                this.Class392 = s.substring(index);
                super.center = new Command(Game86.Class45, 12000);
                if (!GameCanvas.Class6) {
                    Game23.Class1().Class6 = new Command(Game86.Class45, null, 12000, null);
                }
            }
            else if (s.indexOf("@") >= 0) {
                final String trim;
                final int index2 = (trim = s.substring(2).trim()).indexOf("@");
                final String substring;
                final int index3;
                int endIndex;
                if ((index3 = (substring = trim.substring(index2)).indexOf(" ")) <= 0) {
                    endIndex = index2 + substring.length();
                }
                else {
                    endIndex = index3 + index2;
                }
                this.Class393 = trim.substring(index2 + 1, endIndex);
                if (!this.Class393.equals("") && !this.Class393.equals(Char.getMyChar().cName) && !this.Class393.equals(Game86.Class458.substring(0, 5)) && !this.Class393.equals(Game86.Class458)) {
                    super.center = new Command(Game86.Class119, 12009, this.Class393);
                    if (!GameCanvas.Class6) {
                        Game23.Class1().Class6 = new Command(Game86.Class119, null, 12009, this.Class393);
                    }
                }
                else {
                    this.Class393 = null;
                    super.center = null;
                }
            }
        }
    }
    
    private void Class76() {
        if (!GameScr.Class96) {
            return;
        }
        boolean b = false;
        if (GameCanvas.Class12[4]) {
            b = true;
            ChatManager.gI().Class2();
        }
        else if (GameCanvas.Class12[6]) {
            b = true;
            ChatManager.gI().Class1();
        }
        if (b) {
            this.Class166();
        }
        if (GameCanvas.Class6 && GameCanvas.Class6 && GameCanvas.Class2(GameScr.Class157, GameScr.Class156, GameScr.Class158, this.Class418) && (!GameScr.Class92 || GameCanvas.Class25 >= 320) && GameCanvas.Class15 && GameCanvas.Class16) {
            if (GameCanvas.Class2(GameScr.Class11 - 90, GameScr.Class156 + 5, 60, 40)) {
                ChatManager.gI().Class2();
                this.Class166();
            }
            if (GameCanvas.Class2(GameScr.Class11 + 20, GameScr.Class156 + 5, 60, 40)) {
                ChatManager.gI().Class1();
                this.Class166();
            }
        }
    }
    
    private void Class77() {
        if (GameScr.indexRow < 0 || GameScr.vCharInMap.size() <= 0) {
            final Command command = null;
            super.center = command;
            super.left = command;
            return;
        }
        if (Char.Class11(this.Class114) == GameScr.indexRow) {
            super.left = new Command(Game86.Class120, 14002);
            return;
        }
        super.left = new Command(Game86.Class119, 14003);
        super.center = new Command("", 14003);
    }
    
    private void Class78() {
        if (GameScr.Class35.size() > 0 && GameScr.indexRow >= 0 && GameScr.Class194 > 0) {
            super.center = new Command(Game86.Class22, 14024);
            super.left = new Command(Game86.Class23, 14025);
            return;
        }
        super.center = null;
        super.left = null;
    }
    
    private void Class79() {
        if (GameScr.Class35.size() > 0 && GameScr.indexRow >= 0 && GameScr.Class194 > 0) {
            super.center = new Command(Game86.Class119, 14021);
            return;
        }
        super.center = null;
    }
    
    private void Class80() {
        if (GameScr.Class37.size() > 0 && GameScr.indexRow >= 0 && GameScr.Class194 > 0) {
            super.center = new Command(Game86.Class119, 11078);
            return;
        }
        super.center = null;
    }
    
    private void Class81() {
        if (GameScr.Class34.size() > 0 && GameScr.indexRow >= 0 && GameScr.Class194 > 0 && GameScr.indexRow < GameScr.Class34.size()) {
            GameScr.Class34.elementAt(GameScr.indexRow);
            super.center = new Command(Game86.Class119, 11079);
            return;
        }
        super.center = null;
    }
    
    private void Class82() {
        super.center = null;
        if (GameScr.indexRow == -1) {
            return;
        }
        if (((Party)GameScr.vParty.elementAt(0)).charId == Char.getMyChar().charID) {
            final Party party;
            if ((party = (Party)GameScr.vParty.elementAt(GameScr.indexRow)).charId != Char.getMyChar().charID) {
                super.center = new Command(Game86.Class119, 11080, party.name);
            }
        }
        else {
            final Party party2;
            if ((party2 = (Party)GameScr.vParty.elementAt(GameScr.indexRow)).charId != Char.getMyChar().charID) {
                super.center = new Command(Game86.Class119, 12009, party2.name);
            }
        }
    }
    
    private static boolean Class83() {
        return GameScr.Class202 || GameScr.Class240 || GameScr.Class92 || GameScr.Class93 || GameScr.Class209 || GameScr.Class210 || GameScr.Class241 || GameScr.Class225 || GameScr.Class211 || GameScr.Class212 || GameScr.Class213 || GameScr.Class214 || GameScr.Class215 || GameScr.Class216 || GameScr.Class217 || GameScr.Class218 || GameScr.Class219 || GameScr.Class220 || GameScr.Class221 || GameScr.Class222 || GameScr.Class223 || GameScr.Class224 || GameScr.Class226 || GameScr.Class227 || GameScr.Class228 || GameScr.Class229 || GameScr.Class230 || GameScr.Class89 || GameScr.Class231 || GameScr.Class235 || GameScr.Class243 || GameScr.Class244 || GameScr.Class233 || GameScr.Class242 || GameScr.Class234 || GameScr.isPaintTrade || GameScr.isPaintAlert || GameScr.isPaintZone || GameScr.TuDong || GameScr.ItemBan || GameScr.ItemNhat || GameScr.ItemVut || GameScr.Class204 || GameScr.Class238 || GameScr.Class205 || GameScr.Class203 || GameScr.Class91 || GameScr.Class206 || GameScr.Class207 || GameScr.Class236 || GameScr.Class96 || GameScr.Class249 || GameScr.Class245 || GameScr.Class246 || GameScr.Class250 || GameScr.Class247 || GameScr.Class248;
    }
    
    private boolean Class84() {
        return !GameCanvas.Class6 || Char.Class133 || GameScr.isPaintZone || GameScr.TuDong || Game23.Class1().Class2 || (super.center == this.Class162 && GameCanvas.Class9) || (GameCanvas.Class34 != null || ChatPopup.Class6 != null || GameCanvas.Class30.Class1 || Class83());
    }
    
    public static boolean Class27() {
        return GameScr.TuDong || GameScr.ItemBan || GameScr.ItemNhat || GameScr.ItemVut || GameScr.Class209 || GameScr.Class240 || GameScr.Class210 || GameScr.Class225 || GameScr.Class211 || GameScr.Class212 || GameScr.Class213 || GameScr.Class214 || GameScr.Class215 || GameScr.Class216 || GameScr.Class217 || GameScr.Class218 || GameScr.Class219 || GameScr.Class220 || GameScr.Class221 || GameScr.Class222 || GameScr.Class223 || GameScr.Class224 || GameScr.Class226 || GameScr.Class227 || GameScr.Class228 || GameScr.Class229 || GameScr.Class230 || GameScr.Class241 || GameScr.Class89 || GameScr.Class231 || GameScr.Class235 || GameScr.Class243 || GameScr.Class244 || GameScr.Class233 || GameScr.Class242 || GameScr.Class234 || GameScr.isPaintTrade || GameScr.Class245 || GameScr.Class246 || GameScr.Class250 || GameScr.Class247 || GameScr.Class248;
    }
    
    private static boolean Class85() {
        return GameScr.TuDong || GameScr.TuDong || GameScr.ItemBan || GameScr.ItemNhat || GameScr.ItemVut || GameScr.Class92 || GameScr.Class240 || GameScr.Class93 || GameScr.Class209 || GameScr.Class210 || GameScr.Class225 || GameScr.Class211 || GameScr.Class212 || GameScr.Class213 || GameScr.Class214 || GameScr.Class215 || GameScr.Class216 || GameScr.Class217 || GameScr.Class218 || GameScr.Class219 || GameScr.Class220 || GameScr.Class221 || GameScr.Class222 || GameScr.Class223 || GameScr.Class224 || GameScr.Class226 || GameScr.Class227 || GameScr.Class228 || GameScr.Class229 || GameScr.Class230 || GameScr.Class241 || GameScr.Class89 || GameScr.Class231 || GameScr.Class235 || GameScr.Class243 || GameScr.Class244 || GameScr.Class233 || GameScr.Class242 || GameScr.Class234 || GameScr.isPaintTrade || GameScr.Class245 || GameScr.Class246 || GameScr.Class250 || GameScr.Class247 || GameScr.Class248;
    }
    
    private static boolean Class86() {
        return GameScr.Class202 || (GameScr.Class93 && GameScr.indexMenu == 6 && GameScr.Class458 != 0) || (GameScr.Class93 && GameScr.indexMenu > 0 && GameScr.indexMenu < 5) || GameScr.TuDong || GameScr.isPaintZone || (GameScr.Class238 && (GameScr.indexMenu == 0 || GameScr.indexMenu == 1 || GameScr.indexMenu == 3 || GameScr.indexMenu == 4)) || GameScr.Class236 || GameScr.Class204 || GameScr.Class205 || GameScr.Class91 || GameScr.Class206 || GameScr.Class207 || GameScr.Class203 || GameScr.Class96 || GameScr.isPaintAlert || GameScr.Class249;
    }
    
    private static void Class1(final Item item) {
        GameCanvas.inputDlg.show(Game86.Class285, new Command(Game86.Class107, 11055, item), 1);
    }
    
    private static void Class2(final Item item) {
        if (item.quantity > 1) {
            GameCanvas.inputDlg.show(Game86.Class285, new Command(Game86.Class107, 110562, item), 1);
            return;
        }
        GameCanvas.Class1(Game86.Class295, new Command(Game86.Class60, 11061, item), new Command(Game86.Class73, 1));
    }
    
    private static void Class87() {
        GameCanvas.inputDlg.show(Game86.Class284, new Command(Game86.Class107, 11042), 1);
    }
    
    private static void Class88() {
        GameCanvas.inputDlg.show(Game86.Class284, new Command(Game86.Class107, 110361), 1);
    }
    
    private static void Class89() {
        GameCanvas.inputDlg.show(Game86.Class284, new Command(Game86.Class107, 11043), 1);
    }
    
    public final void Class28() {
        if (GameCanvas.Class34 != null || !Class27()) {
            return;
        }
        if (GameScr.Class193 == 0) {
            final Command command = null;
            super.center = command;
            super.left = command;
            if (!GameScr.Class240) {
                if (GameScr.Class234) {
                    if (GameScr.Class163.equals("")) {
                        if (GameScr.indexMenu == 0) {
                            super.left = new Command(Game86.Class27, 11115);
                        }
                        else if (GameScr.indexMenu == 1) {
                            super.left = new Command(Game86.Class27, 11116);
                        }
                    }
                    else {
                        super.left = null;
                    }
                }
                else if (GameScr.indexMenu == 1 && GameScr.isPaintTrade && this.typeTrade == 0) {
                    super.left = this.Class363;
                }
                else if (GameScr.indexMenu == 1 && !GameScr.Class209 && !GameScr.Class210 && !GameScr.Class233 && !GameScr.Class242 && !GameScr.Class230 && !GameScr.Class231 && !GameScr.Class235 && !GameScr.Class243 && !GameScr.Class244 && !GameScr.isPaintTrade && !GameScr.Class241 && !GameScr.Class89 && !GameScr.Class245 && !GameScr.Class246 && !GameScr.Class250 && !GameScr.Class247 && !GameScr.Class248) {
                    super.left = new Command(Game86.Class56, 110221);
                }
                if (GameScr.Class242 && GameScr.indexMenu == 0) {
                    int n = 0;
                    int n2 = 0;
                    int n3 = 0;
                    int id = 0;
                    for (int i = 0; i < GameScr.Class75.length; ++i) {
                        final Item item;
                        if ((item = GameScr.Class75[i]) != null) {
                            if (item.template.id == 455) {
                                ++n;
                            }
                            else if (item.template.id == 456) {
                                ++n2;
                            }
                            else if (item.template.type == 26) {
                                ++n3;
                                id = item.template.id;
                            }
                        }
                    }
                    if (n >= 9 || n2 >= 9 || (id >= 10 && n >= 3 && n3 == 1) || (id >= 11 && n2 >= 3 && n3 == 1)) {
                        super.left = new Command(Game86.Class152, 1600);
                    }
                }
                else if (GameScr.Class243) {
                    try {
                        if (GameScr.indexMenu == 0) {
                            if (GameScr.Class193 == 1) {
                                if (GameScr.Class85 != null) {
                                    super.left = new Command(Game86.Class119, 11103);
                                }
                                else {
                                    GameScr.Class92 = false;
                                }
                                if (GameCanvas.Class9) {
                                    this.Class1(3, GameScr.Class85);
                                }
                                else {
                                    super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, GameScr.Class85);
                                }
                            }
                            else if (GameScr.Class193 == 2) {
                                final Item item2;
                                if ((item2 = GameScr.Class77[GameScr.indexSelect]) != null) {
                                    if (GameCanvas.Class9) {
                                        this.Class1(3, item2);
                                    }
                                    else {
                                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, item2);
                                    }
                                    super.left = new Command(Game86.Class62, 1605);
                                }
                                else {
                                    GameScr.Class92 = false;
                                }
                                if (GameScr.Class85 != null) {
                                    super.left = new Command(Game86.Class119, 1604);
                                }
                            }
                        }
                        else if (GameScr.indexMenu == 1) {
                            if (Char.getMyChar().arrItemBag[GameScr.indexSelect] == null) {
                                super.left = null;
                                GameScr.Class92 = false;
                            }
                            else {
                                super.left = new Command(Game86.Class119, 11106);
                            }
                        }
                    }
                    catch (Exception ex) {}
                }
                else if (GameScr.Class244) {
                    if (GameScr.indexMenu == 0) {
                        if (GameScr.Class193 == 1) {
                            if (GameScr.Class85 != null && GameScr.Class85.upgrade > 13) {
                                super.left = new Command(Game86.Class119, 11103);
                            }
                            else if (GameScr.Class85 != null) {
                                super.left = this.Class362;
                            }
                            else {
                                GameScr.Class92 = false;
                            }
                            if (GameCanvas.Class9) {
                                this.Class1(3, GameScr.Class85);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, GameScr.Class85);
                            }
                        }
                        else if (GameScr.Class193 == 2) {
                            final Item item3;
                            if ((item3 = GameScr.Class77[GameScr.indexSelect]) != null) {
                                if (GameCanvas.Class9) {
                                    this.Class1(3, item3);
                                }
                                else {
                                    super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, item3);
                                }
                            }
                            else {
                                GameScr.Class92 = false;
                            }
                            if (GameScr.Class85 != null && GameScr.Class85.upgrade > 13) {
                                super.left = new Command(Game86.Class119, 1604);
                            }
                        }
                    }
                    else if (GameScr.indexMenu == 1) {
                        if (Char.getMyChar().arrItemBag[GameScr.indexSelect] == null) {
                            super.left = null;
                            GameScr.Class92 = false;
                        }
                        else {
                            super.left = new Command(Game86.Class119, 1606);
                        }
                    }
                }
                if (GameScr.Class233 && GameScr.indexMenu == 0) {
                    int n4 = 0;
                    for (int j = 0; j < GameScr.Class75.length; ++j) {
                        if (GameScr.Class75[j] != null && ++n4 >= 2) {
                            super.left = new Command(Game86.Class152, 11062);
                            break;
                        }
                    }
                }
                if (GameScr.Class230 && GameScr.indexMenu == 0 && GameScr.Class84 != null) {
                    for (int k = 0; k < GameScr.Class76.length; ++k) {
                        if (GameScr.Class76[k] != null) {
                            super.center = new Command("", 110981);
                            super.left = new Command(Game86.Class152, 110981);
                            break;
                        }
                    }
                }
                if (GameScr.Class246 && GameScr.indexMenu == 0 && GameScr.Class84 != null && GameScr.Class85 != null) {
                    for (int l = 0; l < GameScr.Class76.length; ++l) {
                        if (GameScr.Class76[l] != null) {
                            super.center = new Command("", 341);
                            super.left = new Command(Game86.Class152, 341);
                            break;
                        }
                    }
                }
                if (GameScr.Class89 && GameScr.indexMenu == 0 && GameScr.Class86 != null && this.Class262 != null && !this.Class262.Class9.equals("") && Char.getMyChar().xu >= 5000) {
                    super.left = new Command(Game86.Class67, 15002);
                }
                if (GameScr.Class231 && GameScr.indexMenu == 0 && GameScr.Class193 == 0) {
                    for (int n5 = 0; n5 < GameScr.Class80.length; ++n5) {
                        if (GameScr.Class80[n5] == null) {
                            super.left = null;
                            break;
                        }
                        if (n5 == GameScr.Class80.length - 1) {
                            super.left = new Command(Game86.Class152, 140131);
                        }
                    }
                }
                if (GameScr.Class235 && GameScr.indexMenu == 0 && GameScr.Class85 != null && GameScr.Class85.upgrade > 0) {
                    super.left = new Command(Game86.Class152, 11105);
                }
                if (GameScr.isPaintTrade && GameScr.indexMenu == 0) {
                    if (this.typeTrade == 0) {
                        super.left = this.Class355;
                    }
                    else if (this.typeTrade == 1 && this.typeTradeOrder > 0 && this.Class113 - System.currentTimeMillis() / 1000L <= 0L) {
                        super.left = this.Class356;
                    }
                }
                if (GameCanvas.Class12[8]) {
                    GameScr.Class193 = 1;
                    GameScr.indexSelect = 0;
                    GameScr.indexRow = -1;
                    GameScr.Class50.Class1();
                    GameScr.Class196.Class1();
                    this.Class29();
                }
                if (GameCanvas.Class12[4]) {
                    GameScr.indexSelect = 0;
                    GameScr.indexRow = -1;
                    --GameScr.indexMenu;
                    GameScr.Class50.Class1();
                    GameScr.Class196.Class1();
                    if (GameScr.Class241) {
                        if (GameScr.indexMenu < 0) {
                            GameScr.indexMenu = Game86.Class457.length - 1;
                        }
                        Service.gI().menu((byte)0, 28, 0, GameScr.indexMenu);
                        GameScr.Class81 = null;
                        GameScr.indexSelect = -1;
                    }
                    else if (GameScr.Class210 || GameScr.TuDong) {
                        GameScr.indexMenu = 0;
                    }
                    else if (GameScr.indexMenu < 0) {
                        if (GameScr.Class209) {
                            GameScr.indexMenu = Game86.Class184.length - 1;
                        }
                        else {
                            GameScr.indexMenu = 1;
                        }
                    }
                    final Command command2 = null;
                    super.center = command2;
                    super.left = command2;
                    if (GameScr.Class209) {
                        Class91();
                    }
                    if (GameScr.Class210 && GameScr.Class71 == null && GameScr.indexMenu == 0) {
                        Service.gI().requestItem(35);
                    }
                }
                if (GameCanvas.Class12[6]) {
                    GameScr.indexSelect = 0;
                    GameScr.indexRow = -1;
                    ++GameScr.indexMenu;
                    GameScr.Class50.Class1();
                    GameScr.Class196.Class1();
                    if (GameScr.Class241) {
                        if (GameScr.indexMenu > Game86.Class457.length - 1) {
                            GameScr.indexMenu = 0;
                        }
                        Service.gI().menu((byte)0, 28, 0, GameScr.indexMenu);
                        GameScr.Class81 = null;
                        GameScr.indexSelect = -1;
                    }
                    else if (GameScr.Class210 || GameScr.TuDong) {
                        GameScr.indexMenu = 0;
                    }
                    else if (GameScr.Class209) {
                        if (GameScr.indexMenu > Game86.Class184.length - 1) {
                            GameScr.indexMenu = 0;
                        }
                    }
                    else if (GameScr.indexMenu > 1) {
                        GameScr.indexMenu = 0;
                    }
                    final Command command3 = null;
                    super.center = command3;
                    super.left = command3;
                    if (GameScr.Class209) {
                        Class91();
                    }
                    if (GameScr.Class210 && GameScr.Class71 == null && GameScr.indexMenu == 0) {
                        Service.gI().requestItem(35);
                    }
                }
            }
        }
        else if (GameScr.Class193 > 0) {
            if (GameScr.Class92) {
                if (GameCanvas.Class12[2]) {
                    if (--GameScr.indexRow < 0) {
                        GameScr.indexRow = GameScr.Class194 - 1;
                    }
                    GameScr.Class196.Class1(GameScr.indexRow * GameScr.Class196.Class8);
                }
                else if (GameCanvas.Class12[8]) {
                    if (++GameScr.indexRow >= GameScr.Class194) {
                        GameScr.indexRow = 0;
                    }
                    GameScr.Class196.Class1(GameScr.indexRow * GameScr.Class196.Class8);
                }
            }
            else {
                if (GameScr.TuDong) {
                    if (GameCanvas.Class12[2]) {
                        if (--GameScr.indexRow < 0) {
                            GameScr.indexRow = GameScr.Class194;
                        }
                        GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                    }
                    else if (GameCanvas.Class12[4]) {
                        if (GameScr.indexRow == 0) {
                            if ((Char.aHpValue -= 10) < 10) {
                                Char.aHpValue = 10;
                            }
                        }
                        else if (GameScr.indexRow == 1) {
                            if ((Char.aMpValue -= 10) < 10) {
                                Char.aMpValue = 10;
                            }
                        }
                        else if (GameScr.indexRow == 2 && (Char.Class121 -= 10) <= 0) {
                            Char.Class121 = 1;
                        }
                    }
                    else if (GameCanvas.Class12[6]) {
                        if (GameScr.indexRow == 0) {
                            if ((Char.aHpValue += 10) > 90) {
                                Char.aHpValue = 90;
                            }
                        }
                        else if (GameScr.indexRow == 1) {
                            if ((Char.aMpValue += 10) > 90) {
                                Char.aMpValue = 90;
                            }
                        }
                        else if (GameScr.indexRow == 2) {
                            if (Char.Class121 == 1) {
                                Char.Class121 = 10;
                            }
                            else if ((Char.Class121 += 10) > 70) {
                                Char.Class121 = 70;
                            }
                        }
                    }
                    else if (GameCanvas.Class12[8]) {
                        if (++GameScr.indexRow > GameScr.Class194) {
                            GameScr.indexRow = 0;
                        }
                        GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
                    }
                    if (!GameCanvas.Class6) {
                        GameCanvas.Class8();
                        GameCanvas.Class7();
                    }
                }
                else if (GameScr.isPaintTrade && GameScr.indexMenu == 0) {
                    if (GameScr.Class193 == 1) {
                        if (GameCanvas.Class12[4]) {
                            if (--GameScr.indexSelect < 0) {
                                GameScr.indexSelect = 11;
                            }
                            final Command command4 = null;
                            super.center = command4;
                            super.left = command4;
                            this.Class29();
                        }
                        else if (GameCanvas.Class12[6]) {
                            if (GameScr.indexSelect == 2) {
                                GameScr.Class193 = 2;
                                GameScr.indexSelect = 0;
                            }
                            else if (GameScr.indexSelect == 5) {
                                GameScr.Class193 = 2;
                                GameScr.indexSelect = 3;
                            }
                            else if (GameScr.indexSelect == 8) {
                                GameScr.Class193 = 2;
                                GameScr.indexSelect = 6;
                            }
                            else if (GameScr.indexSelect == 11) {
                                GameScr.Class193 = 2;
                                GameScr.indexSelect = 9;
                            }
                            else if (GameScr.indexSelect == 14) {
                                GameScr.Class193 = 2;
                                GameScr.indexSelect = 12;
                            }
                            else if (++GameScr.indexSelect >= 12) {
                                GameScr.indexSelect = 0;
                            }
                            final Command command5 = null;
                            super.center = command5;
                            super.left = command5;
                            this.Class29();
                        }
                        else if (GameCanvas.Class12[8]) {
                            if (GameScr.indexSelect + 3 <= 11) {
                                GameScr.indexSelect += 3;
                            }
                            final Command command6 = null;
                            super.center = command6;
                            super.left = command6;
                            this.Class29();
                        }
                        else if (GameCanvas.Class12[2]) {
                            if (GameScr.indexSelect >= 0 && GameScr.indexSelect < 3) {
                                GameScr.Class193 = 0;
                                GameScr.indexSelect = 0;
                            }
                            else if (GameScr.indexSelect - 3 >= 0) {
                                GameScr.indexSelect -= 3;
                            }
                            final Command command7 = null;
                            super.center = command7;
                            super.left = command7;
                            this.Class29();
                        }
                    }
                    else if (GameScr.Class193 == 2) {
                        if (GameCanvas.Class12[4]) {
                            if (GameScr.indexSelect == 0) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = 2;
                            }
                            else if (GameScr.indexSelect == 3) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = 5;
                            }
                            else if (GameScr.indexSelect == 6) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = 8;
                            }
                            else if (GameScr.indexSelect == 9) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = 11;
                            }
                            else if (GameScr.indexSelect == 12) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = 14;
                            }
                            else if (--GameScr.indexSelect < 0) {
                                GameScr.indexSelect = 11;
                            }
                            final Command command8 = null;
                            super.center = command8;
                            super.left = command8;
                            this.Class29();
                        }
                        else if (GameCanvas.Class12[6]) {
                            if (++GameScr.indexSelect >= 12) {
                                GameScr.indexSelect = 0;
                            }
                            final Command command9 = null;
                            super.center = command9;
                            super.left = command9;
                            this.Class29();
                        }
                        else if (GameCanvas.Class12[8]) {
                            if (GameScr.indexSelect + 3 <= 11) {
                                GameScr.indexSelect += 3;
                            }
                            final Command command10 = null;
                            super.center = command10;
                            super.left = command10;
                            this.Class29();
                        }
                        else if (GameCanvas.Class12[2]) {
                            if (GameScr.indexSelect >= 0 && GameScr.indexSelect < 3) {
                                GameScr.Class193 = 0;
                                GameScr.indexSelect = 0;
                            }
                            else if (GameScr.indexSelect - 3 >= 0) {
                                GameScr.indexSelect -= 3;
                            }
                            final Command command11 = null;
                            super.center = command11;
                            super.left = command11;
                            this.Class29();
                        }
                    }
                    if (!GameCanvas.Class6) {
                        GameCanvas.Class8();
                        GameCanvas.Class7();
                    }
                }
                else if (GameScr.Class240) {
                    if (GameCanvas.Class12[4]) {
                        if (--GameScr.indexSelect < 0) {
                            GameScr.indexSelect = 8;
                        }
                    }
                    else if (GameCanvas.Class12[6]) {
                        if (++GameScr.indexSelect > 8) {
                            GameScr.indexSelect = 0;
                        }
                    }
                    else if (GameCanvas.Class12[8]) {
                        if (GameScr.indexSelect + 3 < 9) {
                            GameScr.indexSelect += 3;
                        }
                    }
                    else if (GameCanvas.Class12[2] && GameScr.indexSelect - 3 >= 0) {
                        GameScr.indexSelect -= 3;
                    }
                    if (!GameCanvas.Class6) {
                        GameCanvas.Class8();
                        GameCanvas.Class7();
                    }
                }
                else if (GameScr.Class89 && GameScr.indexMenu == 0) {
                    if (GameCanvas.Class12[2]) {
                        if (--GameScr.Class193 < 0) {
                            GameScr.Class193 = 0;
                        }
                    }
                    else if (GameCanvas.Class12[8] && ++GameScr.Class193 > 2) {
                        GameScr.Class193 = 2;
                    }
                    this.Class29();
                }
                else if (GameScr.Class241) {
                    if (GameCanvas.Class12[4]) {
                        if (GameScr.Class81 != null) {
                            if ((GameScr.indexSelect -= 5) < 0) {
                                GameScr.indexSelect = GameScr.Class81.length - 1;
                            }
                            GameScr.Class50.Class1(GameScr.indexSelect * GameScr.Class50.Class8);
                            this.Class29();
                        }
                    }
                    else if (GameCanvas.Class12[6]) {
                        if (GameScr.Class81 != null) {
                            if ((GameScr.indexSelect += 5) >= GameScr.Class81.length) {
                                GameScr.indexSelect = 0;
                            }
                            GameScr.Class50.Class1(GameScr.indexSelect * GameScr.Class50.Class8);
                            this.Class29();
                        }
                    }
                    else if (GameCanvas.Class12[8]) {
                        if (GameScr.Class81 != null) {
                            if (++GameScr.indexSelect >= GameScr.Class81.length) {
                                GameScr.indexSelect = 0;
                            }
                            GameScr.Class50.Class1(GameScr.indexSelect * GameScr.Class50.Class8);
                            this.Class29();
                        }
                    }
                    else if (GameCanvas.Class12[2] && GameScr.Class81 != null) {
                        if (--GameScr.indexSelect < 0) {
                            GameScr.Class193 = 0;
                        }
                        GameScr.Class50.Class1(GameScr.indexSelect * GameScr.Class50.Class8);
                        this.Class29();
                    }
                    GameCanvas.Class8();
                    GameCanvas.Class7();
                }
                else if ((GameScr.Class250 || GameScr.Class246 || GameScr.Class230 || GameScr.Class231) && GameScr.Class193 == 1 && GameScr.indexMenu == 0) {
                    if (GameCanvas.Class12[4]) {
                        if (--GameScr.indexSelect < 0) {
                            GameScr.indexSelect = 1;
                        }
                        final Command command12 = null;
                        super.center = command12;
                        super.left = command12;
                        this.Class29();
                    }
                    else if (GameCanvas.Class12[6]) {
                        if (++GameScr.indexSelect > 1) {
                            GameScr.indexSelect = 0;
                        }
                        final Command command13 = null;
                        super.center = command13;
                        super.left = command13;
                        this.Class29();
                    }
                    else if (GameCanvas.Class12[8]) {
                        GameScr.Class193 = 2;
                        GameScr.indexSelect = 0;
                        final Command command14 = null;
                        super.center = command14;
                        super.left = command14;
                        this.Class29();
                    }
                    else if (GameCanvas.Class12[2]) {
                        GameScr.Class193 = 0;
                        GameScr.indexSelect = 0;
                        final Command command15 = null;
                        super.center = command15;
                        super.left = command15;
                        this.Class29();
                    }
                    if (!GameCanvas.Class6) {
                        GameCanvas.Class8();
                        GameCanvas.Class7();
                    }
                }
                else if ((GameScr.Class235 || GameScr.Class243 || GameScr.Class244 || GameScr.Class245) && GameScr.Class193 == 1 && GameScr.indexMenu == 0) {
                    if (GameCanvas.Class12[8]) {
                        GameScr.Class193 = 2;
                        GameScr.indexSelect = 0;
                        final Command command16 = null;
                        super.center = command16;
                        super.left = command16;
                        this.Class29();
                    }
                    else if (GameCanvas.Class12[2]) {
                        GameScr.Class193 = 0;
                        GameScr.indexSelect = 0;
                        final Command command17 = null;
                        super.center = command17;
                        super.left = command17;
                        this.Class29();
                    }
                    GameCanvas.Class8();
                    GameCanvas.Class7();
                }
                else if ((GameScr.Class247 || GameScr.Class248) && GameScr.indexMenu == 0) {
                    if (GameCanvas.Class12[2]) {
                        if (--GameScr.Class193 < 0) {
                            GameScr.Class193 = 0;
                        }
                    }
                    else if (GameCanvas.Class12[8] && ++GameScr.Class193 > 1) {
                        GameScr.Class193 = 1;
                    }
                    this.Class29();
                }
                final int class90 = Class90();
                if (GameCanvas.Class12[4]) {
                    if (--GameScr.indexSelect < 0) {
                        GameScr.indexSelect = class90 - 1;
                    }
                    final Command command18 = null;
                    super.center = command18;
                    super.left = command18;
                    this.Class29();
                    GameScr.Class50.Class1(GameScr.indexSelect / GameScr.Class400 * GameScr.Class50.Class8);
                }
                else if (GameCanvas.Class12[6]) {
                    if (++GameScr.indexSelect >= class90) {
                        GameScr.indexSelect = 0;
                    }
                    final Command command19 = null;
                    super.center = command19;
                    super.left = command19;
                    this.Class29();
                    GameScr.Class50.Class1(GameScr.indexSelect / GameScr.Class400 * GameScr.Class50.Class8);
                }
                else if (GameCanvas.Class12[8]) {
                    if (GameScr.indexSelect + GameScr.Class400 <= class90 - 1) {
                        GameScr.indexSelect += GameScr.Class400;
                    }
                    final Command command20 = null;
                    super.center = command20;
                    super.left = command20;
                    this.Class29();
                    GameScr.Class50.Class1(GameScr.indexSelect / GameScr.Class400 * GameScr.Class50.Class8);
                }
                else if (GameCanvas.Class12[2]) {
                    if (GameScr.indexSelect >= 0 && GameScr.indexSelect < GameScr.Class400) {
                        GameScr.Class193 = 0;
                        GameScr.indexSelect = 0;
                        if ((GameScr.Class246 || GameScr.Class230 || GameScr.Class235 || GameScr.Class243 || GameScr.Class244 || GameScr.Class231 || GameScr.Class245) && GameScr.indexMenu == 0) {
                            GameScr.Class193 = 1;
                        }
                    }
                    else if (GameScr.indexSelect - GameScr.Class400 >= 0) {
                        GameScr.indexSelect -= GameScr.Class400;
                    }
                    final Command command21 = null;
                    super.center = command21;
                    super.left = command21;
                    this.Class29();
                    GameScr.Class50.Class1(GameScr.indexSelect / GameScr.Class400 * GameScr.Class50.Class8);
                }
            }
        }
        Label_6892: {
            if (GameCanvas.Class6) {
                if (!GameCanvas.Class30.Class1 && GameCanvas.Class34 == null) {
                    if (GameCanvas.Class16 && GameCanvas.Class2(GameScr.Class157, GameScr.Class156, GameScr.Class158, this.Class418) && (!GameScr.Class92 || GameCanvas.Class25 >= 320) && GameCanvas.Class15) {
                        if (GameCanvas.Class2(GameScr.Class11 - 80, GameScr.Class156 + 5, 60, 40)) {
                            GameScr.indexSelect = 0;
                            --GameScr.indexMenu;
                            this.Class29();
                        }
                        if (GameCanvas.Class2(GameScr.Class11 + 10, GameScr.Class156 + 5, 60, 40)) {
                            GameScr.indexSelect = 0;
                            ++GameScr.indexMenu;
                            this.Class29();
                        }
                        GameScr.Class193 = 0;
                        if (!Class27()) {
                            if (GameScr.indexMenu < 0) {
                                GameScr.indexMenu = Game86.Class163.length - 1;
                            }
                            if (GameScr.indexMenu > Game86.Class163.length - 1) {
                                GameScr.indexMenu = 0;
                            }
                        }
                        else {
                            if (GameScr.Class209) {
                                if (GameScr.indexMenu < 0) {
                                    GameScr.indexMenu = Game86.Class184.length - 1;
                                }
                                else if (GameScr.indexMenu > Game86.Class184.length - 1) {
                                    GameScr.indexMenu = 0;
                                }
                                Class91();
                            }
                            else if (GameScr.Class241) {
                                if (GameScr.indexMenu < 0) {
                                    GameScr.indexMenu = Game86.Class457.length - 1;
                                }
                                else if (GameScr.indexMenu > Game86.Class457.length - 1) {
                                    GameScr.indexMenu = 0;
                                }
                                Service.gI().menu((byte)0, 28, 0, GameScr.indexMenu);
                                GameScr.indexSelect = -1;
                            }
                            else if (GameScr.Class210 || GameScr.TuDong) {
                                GameScr.indexMenu = 0;
                            }
                            else if (GameScr.indexMenu < 0) {
                                GameScr.indexMenu = 1;
                            }
                            else if (GameScr.indexMenu > 1) {
                                GameScr.indexMenu = 0;
                            }
                            if (GameScr.Class210) {
                                GameScr.indexMenu = 0;
                            }
                        }
                        GameScr.Class92 = false;
                        GameScr.Class50.Class1();
                    }
                    if (GameScr.Class92) {
                        final Game68 class91;
                        if ((class91 = GameScr.Class196.Class2()).Class1 || class91.Class3) {
                            GameScr.indexRow = class91.Class2;
                            GameScr.Class193 = 1;
                        }
                        if (!GameCanvas.Class9) {
                            break Label_6892;
                        }
                    }
                    if (GameScr.TuDong) {
                        final Game68 class92;
                        if (((class92 = GameScr.Class50.Class2()).Class3 || class92.Class1) && GameScr.indexSelect != class92.Class2) {
                            GameScr.Class193 = 1;
                            GameScr.indexRow = class92.Class2;
                            this.Class29();
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 16, GameScr.Class50.Class4 + 5, 16, 16, GameScr.Class50) && GameCanvas.Class15) {
                            Char.Class109 = !Char.Class109;
                            if (GameScr.Class136 == 1) {
                                Char.Class109 = false;
                                InfoMe.addInfo(Game86.Class475, 20, mFont.Class12);
                            }
                            GameCanvas.Class14 = false;
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 16, GameScr.Class50.Class4 + 35, 16, 16, GameScr.Class50) && GameCanvas.Class15) {
                            Char.Class110 = !Char.Class110;
                            if (GameScr.Class136 == 1) {
                                Char.Class110 = false;
                                InfoMe.addInfo(Game86.Class475, 20, mFont.Class12);
                            }
                            GameCanvas.Class14 = false;
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 16, GameScr.Class50.Class4 + 65, 16, 16, GameScr.Class50) && GameCanvas.Class15) {
                            Char.Class111 = !Char.Class111;
                            if (GameScr.Class136 == 1) {
                                Char.Class111 = false;
                                InfoMe.addInfo(Game86.Class475, 20, mFont.Class12);
                            }
                            GameCanvas.Class14 = false;
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 16, GameScr.Class50.Class4 + 95, 16, 16, GameScr.Class50) && GameCanvas.Class15) {
                            Char.isABuff = !Char.isABuff;
                            GameCanvas.Class14 = false;
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 16, GameScr.Class50.Class4 + 125, 16, 16, GameScr.Class50) && GameCanvas.Class15) {
                            Char.isAPickYen = !Char.isAPickYen;
                            GameCanvas.Class14 = false;
                            if (Char.isAPickYen) {
                                Char.Class114 = (Char.Class115 = (Char.Class116 = false));
                            }
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 16, GameScr.Class50.Class4 + 155, 16, 16, GameScr.Class50) && GameCanvas.Class15) {
                            Char.Class114 = !Char.Class114;
                            GameCanvas.Class14 = false;
                            if (Char.Class114) {
                                Char.isAPickYen = (Char.Class115 = (Char.Class116 = false));
                            }
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 16, GameScr.Class50.Class4 + 185, 16, 16, GameScr.Class50) && GameCanvas.Class15) {
                            Char.Class115 = !Char.Class115;
                            GameCanvas.Class14 = false;
                            if (Char.Class115) {
                                Char.isAPickYen = (Char.Class114 = (Char.Class116 = false));
                            }
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 16, GameScr.Class50.Class4 + 215, 16, 16, GameScr.Class50) && GameCanvas.Class15) {
                            Char.Class116 = !Char.Class116;
                            GameCanvas.Class14 = false;
                            if (Char.Class116) {
                                Char.isAPickYen = (Char.Class114 = (Char.Class115 = false));
                            }
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 131, GameScr.Class50.Class4 + 2, 30, 20, GameScr.Class50) && GameCanvas.Class15 && Char.Class109) {
                            GameCanvas.inputDlg.show(Game86.Class473, new Command(Game86.Class76, 1511), 1);
                            GameCanvas.Class14 = false;
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 131, GameScr.Class50.Class4 + 32, 30, 20, GameScr.Class50) && GameCanvas.Class15 && Char.Class110) {
                            GameCanvas.inputDlg.show(Game86.Class473, new Command(Game86.Class76, 1512), 1);
                            GameCanvas.Class14 = false;
                        }
                        if (GameCanvas.Class1(GameScr.Class50.Class3 + 131, GameScr.Class50.Class4 + 62, 30, 20, GameScr.Class50) && GameCanvas.Class15 && Char.Class111) {
                            final MyVector myVector;
                            (myVector = new MyVector()).addElement(new Command(Game86.Class474[0], 15130));
                            myVector.addElement(new Command(Game86.Class474[1], 15131));
                            myVector.addElement(new Command(Game86.Class474[2], 15132));
                            myVector.addElement(new Command(Game86.Class474[3], 15133));
                            myVector.addElement(new Command(Game86.Class474[4], 15134));
                            myVector.addElement(new Command(Game86.Class474[5], 15135));
                            myVector.addElement(new Command(Game86.Class474[6], 15136));
                            myVector.addElement(new Command(Game86.Class474[7], 15137));
                            GameCanvas.Class30.Class1(myVector);
                            GameCanvas.Class30.Class15 = true;
                        }
                    }
                    else if (GameScr.Class210 || GameScr.ItemBan || GameScr.ItemNhat || GameScr.ItemVut || GameScr.Class209 || GameScr.Class234 || GameScr.Class228 || GameScr.Class229 || GameScr.Class226 || GameScr.Class227 || GameScr.Class211 || GameScr.Class212 || GameScr.Class213 || GameScr.Class214 || GameScr.Class215 || GameScr.Class216 || GameScr.Class217 || GameScr.Class218 || GameScr.Class219 || GameScr.Class220 || GameScr.Class225 || GameScr.Class221 || GameScr.Class222 || GameScr.Class223 || GameScr.Class224) {
                        final Game68 class93;
                        if (((class93 = GameScr.Class50.Class2()).Class3 || class93.Class1) && GameScr.indexSelect != class93.Class2) {
                            GameScr.Class193 = 1;
                            GameScr.indexSelect = class93.Class2;
                            final Command command22 = null;
                            super.center = command22;
                            super.left = command22;
                            GameScr.Class92 = false;
                            this.Class29();
                        }
                    }
                    else if (GameScr.isPaintTrade) {
                        if (GameScr.indexMenu == 0) {
                            this.Class1(GameScr.Class157 + 4, GameScr.Class156 + this.Class418 + 15, 3, 4, 1);
                            this.Class1(GameScr.Class157 + GameScr.Class158 - 3 - 3 * GameScr.Class192, GameScr.Class156 + this.Class418 + 15, 3, 4, 2);
                        }
                        else {
                            final Game68 class94;
                            if (GameScr.indexMenu == 1 && ((class94 = GameScr.Class50.Class2()).Class3 || class94.Class1) && GameScr.indexSelect != class94.Class2) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = class94.Class2;
                                this.Class29();
                            }
                        }
                    }
                    else if (GameScr.Class233 || GameScr.Class242) {
                        if (GameScr.indexMenu == 0) {
                            this.Class1(GameScr.Class157 + 4, GameScr.Class156 + this.Class418 + 3, 6, 4, 1);
                        }
                        else {
                            final Game68 class95;
                            if (GameScr.indexMenu == 1 && ((class95 = GameScr.Class50.Class2()).Class3 || class95.Class1) && GameScr.indexSelect != class95.Class2) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = class95.Class2;
                                this.Class29();
                            }
                        }
                    }
                    else if (GameScr.Class235 || GameScr.Class243 || GameScr.Class244 || GameScr.Class245) {
                        if (GameScr.indexMenu == 0) {
                            final int n6 = GameScr.Class157 + 74;
                            final int n7 = GameScr.Class395 - GameScr.Class192 - 3;
                            final int class96 = GameScr.Class192;
                            if (GameCanvas.Class2(n6, n7, class96, class96)) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = 0;
                                this.Class29();
                            }
                            this.Class1(GameScr.Class157 + 4, GameScr.Class156 + 2 * this.Class418 + 5, 6, 4, 2);
                        }
                        else {
                            final Game68 class97;
                            if (GameScr.indexMenu == 1 && ((class97 = GameScr.Class50.Class2()).Class3 || class97.Class1) && GameScr.indexSelect != class97.Class2) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = class97.Class2;
                                this.Class29();
                            }
                        }
                    }
                    else if (GameScr.Class230 || GameScr.Class231 || GameScr.Class246) {
                        if (GameScr.indexMenu == 0) {
                            final int n8 = GameScr.Class157 + 45;
                            final int n9 = GameScr.Class156 + 32;
                            final int n10 = GameScr.Class157 + 100;
                            if (GameCanvas.Class16) {
                                if (GameCanvas.Class2(n8, n9, 29, 29)) {
                                    GameScr.Class193 = 1;
                                    GameScr.indexSelect = 0;
                                    this.Class29();
                                }
                                if (GameCanvas.Class2(n10, n9, 29, 29)) {
                                    GameScr.Class193 = 1;
                                    GameScr.indexSelect = 1;
                                    this.Class29();
                                    if (GameScr.Class233 && GameScr.indexMenu == 0) {
                                        for (int n11 = 0; n11 < GameScr.Class75.length; ++n11) {
                                            if (GameScr.Class75[n11] != null) {
                                                super.center = new Command(Game86.Class107, 11062);
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (GameCanvas.Class2(GameScr.Class157, GameScr.Class156 + 2 * this.Class418 + 5, GameScr.Class158, GameScr.Class159 - this.Class418 * 3)) {
                                    this.Class1(GameScr.Class157, GameScr.Class156 + 2 * this.Class418 + 5, 6, 3, 2);
                                }
                            }
                        }
                        else {
                            final Game68 class98;
                            if (GameScr.indexMenu == 1 && ((class98 = GameScr.Class50.Class2()).Class3 || class98.Class1) && GameScr.indexSelect != class98.Class2) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = class98.Class2;
                                this.Class29();
                            }
                        }
                    }
                    else if (GameScr.Class250) {
                        if (GameScr.indexMenu == 0) {
                            final Game68 class99;
                            if (((class99 = GameScr.Class50.Class2()).Class3 || class99.Class1) && GameScr.indexSelect != class99.Class2) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = class99.Class2;
                                final Command command23 = null;
                                super.center = command23;
                                super.left = command23;
                                GameScr.Class92 = false;
                                this.Class29();
                            }
                        }
                        else {
                            final Game68 class100;
                            if (GameScr.indexMenu == 1 && ((class100 = GameScr.Class50.Class2()).Class3 || class100.Class1) && GameScr.indexSelect != class100.Class2) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = class100.Class2;
                                this.Class29();
                            }
                        }
                    }
                    else if (GameScr.Class89) {
                        if (GameScr.indexMenu == 0) {
                            final int n12 = GameScr.Class157 + 75;
                            final int n13 = GameScr.Class156 + 69;
                            final int class101 = GameScr.Class192;
                            if (GameCanvas.Class2(n12, n13, class101, class101)) {
                                if (GameCanvas.Class15 && GameCanvas.Class16) {
                                    GameScr.Class193 = 1;
                                    this.Class29();
                                }
                            }
                            else if (GameCanvas.Class2(this.Class262.Class1, this.Class262.Class2, this.Class262.Class3, this.Class262.Class4) && GameCanvas.Class15 && GameCanvas.Class16) {
                                GameScr.Class193 = 2;
                                this.Class262.switchToMe();
                                this.Class29();
                            }
                        }
                        else {
                            final Game68 class102;
                            if (GameScr.indexMenu == 1 && ((class102 = GameScr.Class50.Class2()).Class3 || class102.Class1) && GameScr.indexSelect != class102.Class2) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = class102.Class2;
                                this.Class29();
                            }
                        }
                    }
                    else if (GameScr.Class240) {
                        if (GameCanvas.Class2(GameScr.Class394, GameScr.Class395, 120, 120) && GameCanvas.Class16 && GameCanvas.Class15) {
                            GameScr.indexSelect = (GameCanvas.Class19 - GameScr.Class394) / 40 + (GameCanvas.Class20 - GameScr.Class395) / 40 * 3;
                            GameScr.Class193 = 1;
                            this.Class29();
                            this.Class102();
                        }
                    }
                    else if (GameScr.Class247 || GameScr.Class248) {
                        if (GameScr.indexMenu == 0) {
                            final int n14 = GameScr.Class157 + 75;
                            final int n15 = GameScr.Class156 + 69;
                            final int class103 = GameScr.Class192;
                            if (GameCanvas.Class2(n14, n15, class103, class103) && GameCanvas.Class15 && GameCanvas.Class16) {
                                GameScr.Class193 = 1;
                                this.Class29();
                            }
                        }
                        else {
                            final Game68 class104;
                            if (GameScr.indexMenu == 1 && ((class104 = GameScr.Class50.Class2()).Class3 || class104.Class1) && GameScr.indexSelect != class104.Class2) {
                                GameScr.Class193 = 1;
                                GameScr.indexSelect = class104.Class2;
                                this.Class29();
                            }
                        }
                    }
                }
            }
        }
        GameCanvas.Class8();
        GameCanvas.Class7();
    }
    
    private static int Class90() {
        int n = 0;
        try {
            if (GameScr.Class210) {
                if (GameScr.Class71.length % GameScr.Class400 == 0) {
                    n = GameScr.Class71.length;
                }
                else {
                    n = (GameScr.Class71.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class209) {
                if (GameScr.indexMenu == 0) {
                    if (GameScr.Class70.length % GameScr.Class400 == 0) {
                        n = GameScr.Class70.length;
                    }
                    else {
                        n = (GameScr.Class70.length / GameScr.Class400 + 1) * GameScr.Class400;
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (GameScr.Class73.length % GameScr.Class400 == 0) {
                        n = GameScr.Class73.length;
                    }
                    else {
                        n = (GameScr.Class73.length / GameScr.Class400 + 1) * GameScr.Class400;
                    }
                }
                else if (GameScr.indexMenu == 2) {
                    if (GameScr.Class74.length % GameScr.Class400 == 0) {
                        n = GameScr.Class74.length;
                    }
                    else {
                        n = (GameScr.Class74.length / GameScr.Class400 + 1) * GameScr.Class400;
                    }
                }
                else if (GameScr.indexMenu == 51) {
                    if (GameScr.Class74.length % GameScr.Class400 == 0) {
                        n = GameScr.Class74.length;
                    }
                    else {
                        n = (GameScr.Class74.length / GameScr.Class400 + 1) * GameScr.Class400;
                    }
                }
            }
            else if (GameScr.Class211) {
                if (GameScr.Class51.length % GameScr.Class400 == 0) {
                    n = GameScr.Class51.length;
                }
                else {
                    n = (GameScr.Class51.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class212) {
                if (GameScr.Class52.length % GameScr.Class400 == 0) {
                    n = GameScr.Class52.length;
                }
                else {
                    n = (GameScr.Class52.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class213) {
                if (GameScr.Class53.length % GameScr.Class400 == 0) {
                    n = GameScr.Class53.length;
                }
                else {
                    n = (GameScr.Class53.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class214) {
                if (GameScr.Class54.length % GameScr.Class400 == 0) {
                    n = GameScr.Class54.length;
                }
                else {
                    n = (GameScr.Class54.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class215) {
                if (GameScr.Class55.length % GameScr.Class400 == 0) {
                    n = GameScr.Class55.length;
                }
                else {
                    n = (GameScr.Class55.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class216) {
                if (GameScr.Class56.length % GameScr.Class400 == 0) {
                    n = GameScr.Class56.length;
                }
                else {
                    n = (GameScr.Class56.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class217) {
                if (GameScr.Class57.length % GameScr.Class400 == 0) {
                    n = GameScr.Class57.length;
                }
                else {
                    n = (GameScr.Class57.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class218) {
                if (GameScr.Class58.length % GameScr.Class400 == 0) {
                    n = GameScr.Class58.length;
                }
                else {
                    n = (GameScr.Class58.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class219) {
                if (GameScr.Class59.length % GameScr.Class400 == 0) {
                    n = GameScr.Class59.length;
                }
                else {
                    n = (GameScr.Class59.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class220) {
                if (GameScr.Class60.length % GameScr.Class400 == 0) {
                    n = GameScr.Class60.length;
                }
                else {
                    n = (GameScr.Class60.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class221) {
                if (GameScr.Class61.length % GameScr.Class400 == 0) {
                    n = GameScr.Class61.length;
                }
                else {
                    n = (GameScr.Class61.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class222) {
                if (GameScr.Class62.length % GameScr.Class400 == 0) {
                    n = GameScr.Class62.length;
                }
                else {
                    n = (GameScr.Class62.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class223) {
                if (GameScr.Class63.length % GameScr.Class400 == 0) {
                    n = GameScr.Class63.length;
                }
                else {
                    n = (GameScr.Class63.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class224) {
                if (GameScr.Class64.length % GameScr.Class400 == 0) {
                    n = GameScr.Class64.length;
                }
                else {
                    n = (GameScr.Class64.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class225) {
                if (GameScr.Class65.length % GameScr.Class400 == 0) {
                    n = GameScr.Class65.length;
                }
                else {
                    n = (GameScr.Class65.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class226) {
                if (GameScr.Class66.length % GameScr.Class400 == 0) {
                    n = GameScr.Class66.length;
                }
                else {
                    n = (GameScr.Class66.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class227) {
                if (GameScr.Class67.length % GameScr.Class400 == 0) {
                    n = GameScr.Class67.length;
                }
                else {
                    n = (GameScr.Class67.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class228) {
                if (GameScr.Class68.length % GameScr.Class400 == 0) {
                    n = GameScr.Class68.length;
                }
                else {
                    n = (GameScr.Class68.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            else if (GameScr.Class229) {
                if (GameScr.Class69.length % GameScr.Class400 == 0) {
                    n = GameScr.Class69.length;
                }
                else {
                    n = (GameScr.Class69.length / GameScr.Class400 + 1) * GameScr.Class400;
                }
            }
            if (GameScr.Class234) {
                n = Char.getMyChar().Class78.length;
            }
            if (GameScr.indexMenu == 1 && !GameScr.Class209) {
                n = Char.getMyChar().arrItemBag.length;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        if ((GameScr.Class233 || GameScr.Class242 || GameScr.Class235 || GameScr.Class243 || GameScr.Class244 || GameScr.Class245) && GameScr.indexMenu == 0) {
            n = 24;
        }
        else if ((GameScr.Class246 || GameScr.Class230 || GameScr.Class231) && GameScr.indexMenu == 0) {
            n = 18;
        }
        else if (n < 30) {
            n = 30;
        }
        return n;
    }
    
    private static void Class91() {
        if (GameScr.indexMenu == 0) {
            Service.gI().requestItem(14);
            return;
        }
        if (GameScr.indexMenu == 1) {
            Service.gI().requestItem(15);
            return;
        }
        if (GameScr.indexMenu == 2) {
            Service.gI().requestItem(32);
            return;
        }
        if (GameScr.indexMenu == 3) {
            Service.gI().requestItem(34);
            return;
        }
        if (GameScr.indexMenu == 51) {
            Service.gI().requestItem(32);
        }
    }
    
    private void Class92() {
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect].quantity > 1) {
            super.left = new Command(Game86.Class67, 11072);
            return;
        }
        super.left = new Command(Game86.Class67, 11073);
    }
    
    public final void Class29() {
        final Command command = null;
        super.center = command;
        super.left = command;
        if (GameScr.indexSelect < 0) {
            return;
        }
        if (GameScr.TuDong) {
            if (GameScr.Class193 == 1 && !GameCanvas.Class6) {
                super.left = new Command(Game86.Class119, 1510);
            }
            return;
        }
        if (GameScr.Class240) {
            if (GameScr.Class193 == 1) {
                super.left = new Command(Game86.Class119, 1506);
                super.center = new Command("", 1507);
            }
            return;
        }
        if (GameScr.Class210) {
            if (GameScr.indexMenu == 0 && getItemFocus(35) != null) {
                super.left = this.Class370;
                if (!GameCanvas.Class9) {
                    super.center = this.Class371;
                    return;
                }
                this.Class4((byte)35);
            }
            return;
        }
        if (GameScr.Class209) {
            if (GameScr.indexMenu == 51) {
                if (getItemFocus(32) != null) {
                    super.left = this.Class378;
                    if (!GameCanvas.Class9) {
                        super.center = this.Class379;
                        return;
                    }
                    this.Class4((byte)32);
                }
            }
            else if (GameScr.indexMenu == 0) {
                if (getItemFocus(14) != null) {
                    super.left = this.Class372;
                    if (!GameCanvas.Class9) {
                        super.center = this.Class373;
                        return;
                    }
                    this.Class4((byte)14);
                }
            }
            else if (GameScr.indexMenu == 1) {
                if (getItemFocus(15) != null) {
                    super.left = this.Class376;
                    if (!GameCanvas.Class9) {
                        super.center = this.Class377;
                        return;
                    }
                    this.Class4((byte)15);
                }
            }
            else if (GameScr.indexMenu == 2) {
                if (getItemFocus(32) != null) {
                    super.left = this.Class378;
                    if (!GameCanvas.Class9) {
                        super.center = this.Class379;
                        return;
                    }
                    this.Class4((byte)32);
                }
            }
            else if (GameScr.indexMenu == 3 && getItemFocus(34) != null) {
                super.left = this.Class374;
                if (!GameCanvas.Class9) {
                    super.center = this.Class375;
                    return;
                }
                this.Class4((byte)34);
            }
            return;
        }
        if (GameScr.Class211) {
            if (GameScr.indexMenu == 0) {
                if (getItemFocus(20) != null) {
                    super.left = this.Class380;
                    if (!GameCanvas.Class9) {
                        super.center = this.Class381;
                    }
                    else {
                        this.Class4((byte)20);
                    }
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class212) {
            if (GameScr.indexMenu == 0) {
                if (getItemFocus(21) != null) {
                    super.left = this.Class382;
                    if (!GameCanvas.Class9) {
                        super.center = this.Class383;
                    }
                    else {
                        this.Class4((byte)21);
                    }
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class213) {
            if (GameScr.indexMenu == 0) {
                if (getItemFocus(22) != null) {
                    super.left = this.Class384;
                    if (!GameCanvas.Class9) {
                        super.center = this.Class385;
                    }
                    else {
                        this.Class4((byte)22);
                    }
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class214) {
            if (GameScr.indexMenu == 0) {
                if (getItemFocus(23) != null) {
                    super.left = this.Class386;
                    if (!GameCanvas.Class9) {
                        super.center = this.Class387;
                    }
                    else {
                        this.Class4((byte)23);
                    }
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class215) {
            if (GameScr.indexMenu == 0) {
                if (getItemFocus(24) != null) {
                    super.left = this.Class388;
                    if (!GameCanvas.Class9) {
                        super.center = this.Class389;
                    }
                    else {
                        this.Class4((byte)24);
                    }
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class216) {
            if (GameScr.indexMenu == 0) {
                if (getItemFocus(25) != null) {
                    super.left = this.Class390;
                    if (!GameCanvas.Class9) {
                        super.center = this.Class391;
                    }
                    else {
                        this.Class4((byte)25);
                    }
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class217) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus;
                if ((itemFocus = getItemFocus(26)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus);
                    if (!GameCanvas.Class9) {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11088, itemFocus);
                    }
                    else {
                        this.Class1(26, itemFocus);
                    }
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class218) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus2;
                if ((itemFocus2 = getItemFocus(27)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus2);
                    if (!GameCanvas.Class9) {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11089);
                    }
                    else {
                        this.Class1(27, itemFocus2);
                    }
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class219) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus3;
                if ((itemFocus3 = getItemFocus(28)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus3);
                    if (!GameCanvas.Class9) {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11090);
                    }
                    else {
                        this.Class1(28, itemFocus3);
                    }
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class220) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus4;
                if ((itemFocus4 = getItemFocus(29)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus4);
                    if (!GameCanvas.Class9) {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11091);
                    }
                    else {
                        this.Class1(29, itemFocus4);
                    }
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class221) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus5;
                if ((itemFocus5 = getItemFocus(16)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus5);
                    if (GameCanvas.Class9) {
                        this.Class1(16, itemFocus5);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 110923);
                    }
                }
                else {
                    GameScr.Class92 = false;
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class222) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus6;
                if ((itemFocus6 = getItemFocus(17)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus6);
                    if (GameCanvas.Class9) {
                        this.Class1(17, itemFocus6);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 110924);
                    }
                }
                else {
                    GameScr.Class92 = false;
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class223) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus7;
                if ((itemFocus7 = getItemFocus(18)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus7);
                    if (GameCanvas.Class9) {
                        this.Class1(18, itemFocus7);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 110925);
                    }
                }
                else {
                    GameScr.Class92 = false;
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class224) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus8;
                if ((itemFocus8 = getItemFocus(19)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus8);
                    if (GameCanvas.Class9) {
                        this.Class1(19, itemFocus8);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 110926);
                    }
                }
                else {
                    GameScr.Class92 = false;
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class225) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus9;
                if ((itemFocus9 = getItemFocus(2)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus9);
                    if (GameCanvas.Class9) {
                        this.Class1(2, itemFocus9);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11093);
                    }
                }
                else {
                    GameScr.Class92 = false;
                }
            }
            else if (GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                this.Class92();
            }
        }
        else if (GameScr.Class226) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus10;
                if ((itemFocus10 = getItemFocus(6)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus10);
                    if (GameCanvas.Class9) {
                        this.Class1(6, itemFocus10);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11094);
                    }
                }
            }
            else if (GameScr.indexMenu == 1) {
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                    this.Class92();
                }
                else {
                    super.left = this.Class412;
                }
            }
        }
        else if (GameScr.Class227) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus11;
                if ((itemFocus11 = getItemFocus(7)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus11);
                    if (GameCanvas.Class9) {
                        this.Class1(7, itemFocus11);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11095);
                    }
                }
            }
            else if (GameScr.indexMenu == 1) {
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                    this.Class92();
                }
                else {
                    super.left = this.Class412;
                }
            }
        }
        else if (GameScr.Class228) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus12;
                if ((itemFocus12 = getItemFocus(8)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus12);
                    if (GameCanvas.Class9) {
                        this.Class1(8, itemFocus12);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11096);
                    }
                }
            }
            else if (GameScr.indexMenu == 1) {
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                    this.Class92();
                }
                else {
                    super.left = this.Class412;
                }
            }
        }
        else if (GameScr.Class229) {
            if (GameScr.indexMenu == 0) {
                final Item itemFocus13;
                if ((itemFocus13 = getItemFocus(9)) != null) {
                    super.left = new Command(Game86.Class71, 11092, itemFocus13);
                    if (GameCanvas.Class9) {
                        this.Class1(9, itemFocus13);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11097);
                    }
                }
            }
            else if (GameScr.indexMenu == 1) {
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                    this.Class92();
                }
                else {
                    super.left = this.Class412;
                }
            }
        }
        else if (GameScr.Class230) {
            if (GameScr.indexMenu == 0) {
                if (GameScr.Class193 == 1) {
                    if (GameScr.Class84 != null) {
                        if (GameScr.indexSelect == 0) {
                            super.left = new Command(Game86.Class119, 11098);
                            if (GameCanvas.Class9) {
                                GameScr.Class198 = false;
                                this.Class1(3, GameScr.Class84);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11099);
                            }
                        }
                        else if (GameScr.indexSelect == 1 && !GameScr.Class84.Class16()) {
                            if (GameCanvas.Class9) {
                                GameScr.Class198 = true;
                                this.Class1(3, GameScr.Class84);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 110991);
                            }
                        }
                    }
                    else {
                        GameScr.Class92 = false;
                    }
                }
                else if (GameScr.Class193 == 2) {
                    final Item itemFocus14 = getItemFocus(10);
                    GameScr.Class198 = false;
                    if (itemFocus14 != null) {
                        super.left = new Command(Game86.Class119, 11100);
                        if (GameCanvas.Class9) {
                            this.Class1(3, itemFocus14);
                        }
                        else {
                            super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11101);
                        }
                    }
                    else {
                        super.left = null;
                        GameScr.Class92 = false;
                        if (GameScr.Class84 != null) {
                            for (int i = 0; i < GameScr.Class76.length; ++i) {
                                if (GameScr.Class76[i] != null) {
                                    super.left = new Command(Game86.Class152, 110981);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            else if (GameScr.indexMenu == 1) {
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                    super.left = new Command(Game86.Class119, 11102);
                }
                else {
                    super.left = null;
                }
            }
        }
        else if (GameScr.Class231) {
            if (GameScr.indexMenu == 0) {
                if (GameScr.Class193 == 1) {
                    if (GameScr.indexSelect == 0) {
                        if (GameScr.Class80[0] != null) {
                            super.left = new Command(Game86.Class119, 14013);
                            if (GameCanvas.Class9) {
                                this.Class1(3, GameScr.Class80[GameScr.indexSelect]);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 14016);
                            }
                        }
                    }
                    else if (GameScr.indexSelect == 1) {
                        if (GameScr.Class80[1] != null) {
                            super.left = new Command(Game86.Class119, 14013);
                            if (GameCanvas.Class9) {
                                this.Class1(3, GameScr.Class80[GameScr.indexSelect]);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 14016);
                            }
                        }
                    }
                    else {
                        GameScr.Class92 = false;
                    }
                }
                else if (GameScr.Class193 == 2) {
                    Item item = null;
                    final int n;
                    if ((n = GameScr.indexSelect + 2) <= GameScr.Class80.length - 1) {
                        item = GameScr.Class80[n];
                    }
                    if (item != null) {
                        super.left = new Command(Game86.Class62, 140151);
                        if (GameCanvas.Class9) {
                            this.Class1(3, item);
                        }
                        else {
                            super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 140161);
                        }
                    }
                    else {
                        super.left = new Command(Game86.Class152, 140131);
                        for (int j = 0; j < GameScr.Class80.length; ++j) {
                            if (GameScr.Class80[j] == null) {
                                super.left = null;
                                break;
                            }
                        }
                        GameScr.Class92 = false;
                    }
                }
            }
            else if (GameScr.indexMenu == 1) {
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                    super.left = new Command(Game86.Class119, 14012);
                }
                else {
                    super.left = null;
                }
            }
        }
        else if (GameScr.Class89) {
            if (GameScr.indexMenu == 0) {
                if (GameScr.Class193 == 2) {
                    this.Class262.Class5 = true;
                    super.right = this.Class262.Class23;
                }
                else {
                    this.Class262.Class5 = false;
                    super.right = this.cmdCloseAll;
                }
                int int1 = 0;
                try {
                    int1 = Integer.parseInt(this.Class262.Class9);
                }
                catch (Exception ex) {}
                if (GameScr.Class86 != null && int1 > 0 && Char.getMyChar().xu >= 5000) {
                    super.left = new Command(Game86.Class67, 15002);
                }
                if (GameScr.Class193 == 1 && GameScr.Class86 != null) {
                    super.left = new Command(Game86.Class119, 1500);
                    if (GameCanvas.Class9) {
                        this.Class1(3, GameScr.Class86);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 1501);
                    }
                }
            }
            else if (GameScr.indexMenu == 1) {
                super.right = this.cmdCloseAll;
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                    super.left = new Command(Game86.Class119, 1503);
                }
                else {
                    super.left = null;
                    GameScr.Class92 = false;
                }
            }
        }
        else {
            if (GameScr.Class241) {
                if (GameScr.Class193 == 1 && GameScr.Class81 != null && GameScr.indexSelect >= 0 && GameScr.indexSelect < GameScr.Class81.length && GameScr.Class81[GameScr.indexSelect] != null) {
                    super.left = new Command(Game86.Class119, 1504);
                    if (GameCanvas.Class9) {
                        this.Class2(1505, null);
                        return;
                    }
                    super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 1505);
                }
                return;
            }
            if (GameScr.Class235) {
                if (GameScr.indexMenu == 0) {
                    if (GameScr.Class193 == 1) {
                        if (GameScr.Class85 != null && GameScr.Class85.upgrade > 0) {
                            super.left = new Command(Game86.Class119, 11103);
                        }
                        else if (GameScr.Class85 != null) {
                            super.left = this.Class362;
                        }
                        else {
                            GameScr.Class92 = false;
                        }
                        if (GameCanvas.Class9) {
                            this.Class1(3, GameScr.Class85);
                        }
                        else {
                            super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, GameScr.Class85);
                        }
                    }
                    else if (GameScr.Class193 == 2) {
                        final Item item2;
                        if ((item2 = GameScr.Class77[GameScr.indexSelect]) != null) {
                            if (GameCanvas.Class9) {
                                this.Class1(3, item2);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, item2);
                            }
                        }
                        else {
                            GameScr.Class92 = false;
                        }
                        if (GameScr.Class85 != null && GameScr.Class85.upgrade > 0) {
                            super.left = new Command(Game86.Class152, 11105);
                        }
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] == null) {
                        super.left = null;
                        GameScr.Class92 = false;
                    }
                    else {
                        super.left = new Command(Game86.Class119, 11106);
                    }
                }
            }
            else if (GameScr.Class243) {
                try {
                    if (GameScr.indexMenu == 0) {
                        if (GameScr.Class193 == 1) {
                            if (GameScr.Class85 != null) {
                                super.left = new Command(Game86.Class119, 11103);
                            }
                            else {
                                GameScr.Class92 = false;
                            }
                            if (GameCanvas.Class9) {
                                this.Class1(3, GameScr.Class85);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, GameScr.Class85);
                            }
                        }
                        else if (GameScr.Class193 == 2) {
                            final Item item3;
                            if ((item3 = GameScr.Class77[GameScr.indexSelect]) != null) {
                                if (GameCanvas.Class9) {
                                    this.Class1(3, item3);
                                }
                                else {
                                    super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, item3);
                                }
                                super.left = new Command(Game86.Class62, 1605);
                            }
                            else {
                                GameScr.Class92 = false;
                            }
                            if (GameScr.Class85 != null) {
                                super.left = new Command(Game86.Class119, 1604);
                            }
                        }
                    }
                    else if (GameScr.indexMenu == 1) {
                        if (Char.getMyChar().arrItemBag[GameScr.indexSelect] == null) {
                            super.left = null;
                            GameScr.Class92 = false;
                        }
                        else {
                            super.left = new Command(Game86.Class119, 11106);
                        }
                    }
                }
                catch (Exception ex2) {}
            }
            else if (GameScr.Class244) {
                if (GameScr.indexMenu == 0) {
                    if (GameScr.Class193 == 1) {
                        if (GameScr.Class85 != null && GameScr.Class85.upgrade > 11) {
                            super.left = new Command(Game86.Class119, 11103);
                        }
                        else if (GameScr.Class85 != null) {
                            super.left = this.Class362;
                        }
                        else {
                            GameScr.Class92 = false;
                        }
                        if (GameCanvas.Class9) {
                            this.Class1(3, GameScr.Class85);
                        }
                        else {
                            super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, GameScr.Class85);
                        }
                    }
                    else if (GameScr.Class193 == 2) {
                        final Item item4;
                        if ((item4 = GameScr.Class77[GameScr.indexSelect]) != null) {
                            if (GameCanvas.Class9) {
                                this.Class1(3, item4);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, item4);
                            }
                        }
                        else {
                            GameScr.Class92 = false;
                        }
                        if (GameScr.Class85 != null && GameScr.Class85.upgrade > 11) {
                            super.left = new Command(Game86.Class119, 1604);
                        }
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] == null) {
                        super.left = null;
                        GameScr.Class92 = false;
                    }
                    else {
                        super.left = new Command(Game86.Class119, 1606);
                    }
                }
            }
            else if (GameScr.Class233) {
                if (GameScr.indexMenu == 0) {
                    int n2 = 0;
                    for (int n3 = 0; n3 < GameScr.Class75.length && (GameScr.Class75[n3] == null || ++n2 < 2); ++n3) {}
                    final Item itemFocus15;
                    if ((itemFocus15 = getItemFocus(11)) != null) {
                        if (n2 >= 2) {
                            super.left = new Command(Game86.Class119, 11107);
                        }
                        else {
                            super.left = new Command(Game86.Class62, 111071);
                        }
                        if (GameCanvas.Class9) {
                            this.Class1(3, itemFocus15);
                        }
                        else {
                            super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11108);
                        }
                    }
                    else {
                        GameScr.Class92 = false;
                        if (n2 >= 2) {
                            super.left = new Command(Game86.Class152, 11062);
                        }
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                        super.left = new Command(Game86.Class119, 11109);
                    }
                    else {
                        GameScr.Class92 = false;
                        super.left = null;
                    }
                }
            }
            else if (GameScr.Class242) {
                if (GameScr.indexMenu == 0) {
                    int n4 = 0;
                    int n5 = 0;
                    int n6 = 0;
                    int id = 0;
                    for (int k = 0; k < GameScr.Class75.length; ++k) {
                        final Item item5;
                        if ((item5 = GameScr.Class75[k]) != null) {
                            if (item5.template.id == 455) {
                                ++n4;
                            }
                            else if (item5.template.id == 456) {
                                ++n5;
                            }
                            else if (item5.template.type == 26) {
                                id = item5.template.id;
                                ++n6;
                            }
                        }
                        if (n4 >= 9 || n5 >= 9 || (id == 10 && n4 >= 3) || (id == 11 && n5 >= 3)) {
                            break;
                        }
                    }
                    final Item itemFocus16;
                    if ((itemFocus16 = getItemFocus(43)) != null) {
                        if (n4 == 9 || n5 == 9 || (id == 10 && n4 == 3 && n6 == 1) || (id == 11 && n5 == 3 && n6 == 1)) {
                            super.left = new Command(Game86.Class119, 1601);
                        }
                        else {
                            super.left = new Command(Game86.Class62, 111071);
                        }
                        if (GameCanvas.Class9) {
                            this.Class1(43, itemFocus16);
                        }
                        else {
                            super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 1602);
                        }
                    }
                    else {
                        GameScr.Class92 = false;
                        if (n4 >= 9 || n5 >= 9 || (id >= 10 && (n4 >= 3 || n5 >= 3))) {
                            super.left = new Command(Game86.Class152, 1600);
                        }
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                        super.left = new Command(Game86.Class119, 1603);
                    }
                    else {
                        GameScr.Class92 = false;
                        super.left = null;
                    }
                }
            }
            else if (GameScr.isPaintTrade) {
                if (GameScr.indexMenu == 0) {
                    if (GameScr.Class193 == 1) {
                        if (GameScr.arrItemTradeMe[GameScr.indexSelect] != null) {
                            if (this.typeTrade == 0) {
                                super.left = this.Class368;
                            }
                            else if (this.typeTrade == 1 && this.typeTradeOrder > 0 && this.Class113 - System.currentTimeMillis() / 1000L <= 0L) {
                                super.left = this.Class356;
                            }
                            if (GameCanvas.Class9) {
                                this.Class1(3, GameScr.arrItemTradeMe[GameScr.indexSelect]);
                            }
                            else {
                                super.center = this.Class365;
                            }
                        }
                        else {
                            GameScr.Class92 = false;
                            if (this.typeTrade == 0) {
                                super.left = this.Class355;
                            }
                            else if (this.typeTrade == 1 && this.typeTradeOrder > 0 && this.Class113 - System.currentTimeMillis() / 1000L <= 0L) {
                                super.left = this.Class356;
                            }
                        }
                    }
                    if (GameScr.Class193 == 2) {
                        if (GameScr.arrItemTradeOrder[GameScr.indexSelect] != null) {
                            if (GameCanvas.Class9) {
                                this.Class1(30, GameScr.arrItemTradeOrder[GameScr.indexSelect]);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11110);
                            }
                        }
                        else {
                            GameScr.Class92 = false;
                        }
                    }
                }
                else if (GameScr.indexMenu == 1 && this.typeTrade == 0) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                        super.left = this.Class367;
                    }
                    else {
                        super.left = this.Class363;
                    }
                }
            }
            else if (GameScr.ItemNhat) {
                if (GameScr.indexMenu == 0) {
                    if (GameScr.indexSelect >= 0 && GameScr.indexSelect <= Code.ShortItemNhat.length && Code.ShortItemNhat[GameScr.indexSelect] > 0) {
                        super.left = new Command("Delete", gI(), 1, 0);
                    }
                    else {
                        super.left = new Command("Sort", gI(), 2, 0);
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                        super.left = new Command("ADD", gI(), 3, 0);
                    }
                    else {
                        super.left = this.Class363;
                    }
                }
            }
            else if (GameScr.ItemBan) {
                if (GameScr.indexMenu == 0) {
                    if (GameScr.indexSelect >= 0 && GameScr.indexSelect <= Code.Itemdell.length && Code.Itemdell[GameScr.indexSelect] > 0) {
                        super.left = new Command("Delete", gI(), 4, 0);
                    }
                    else {
                        super.left = new Command("Sort", gI(), 5, 0);
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                        super.left = new Command("ADD", gI(), 6, 0);
                    }
                    else {
                        super.left = this.Class363;
                    }
                }
            }
            else if (GameScr.ItemVut) {
                if (GameScr.indexMenu == 0) {
                    if (GameScr.indexSelect >= 0 && GameScr.indexSelect <= Code.Boradat.length && Code.Boradat[GameScr.indexSelect] > 0) {
                        super.left = new Command("Delete", gI(), 7, 0);
                    }
                    else {
                        super.left = new Command("Sort", gI(), 8, 0);
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                        super.left = new Command("ADD", gI(), 9, 0);
                    }
                    else {
                        super.left = this.Class363;
                    }
                }
            }
            else if (GameScr.Class234) {
                if (GameScr.indexMenu == 0) {
                    final Item itemFocus17;
                    if ((itemFocus17 = getItemFocus(4)) != null) {
                        String s = Game86.Class61;
                        if (!GameScr.Class163.equals("")) {
                            s = GameScr.Class164;
                        }
                        super.left = new Command(s, 111101);
                        if (GameCanvas.Class9) {
                            this.Class1(4, itemFocus17);
                        }
                        else {
                            super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11111);
                        }
                    }
                    else if (GameScr.Class163.equals("")) {
                        super.left = new Command(Game86.Class56, 11112);
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                        super.left = new Command(Game86.Class66, 11113);
                    }
                    else {
                        super.left = this.Class412;
                    }
                }
            }
            else if (GameScr.Class245) {
                try {
                    if (GameScr.indexMenu == 0) {
                        if (GameScr.Class193 == 1) {
                            if (GameScr.Class85 != null) {
                                super.left = new Command(Game86.Class119, 11103);
                            }
                            else {
                                GameScr.Class92 = false;
                            }
                            if (GameCanvas.Class9) {
                                this.Class1(3, GameScr.Class85);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, GameScr.Class85);
                            }
                        }
                        else if (GameScr.Class193 == 2) {
                            final Item item6;
                            if ((item6 = GameScr.Class77[GameScr.indexSelect]) != null) {
                                if (GameCanvas.Class9) {
                                    this.Class1(3, item6);
                                }
                                else {
                                    super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, item6);
                                }
                                super.left = new Command(Game86.Class62, 1605);
                            }
                            else {
                                GameScr.Class92 = false;
                            }
                            if (GameScr.Class85 != null) {
                                super.left = new Command(Game86.Class119, 1604);
                            }
                        }
                    }
                    else if (GameScr.indexMenu == 1) {
                        if (Char.getMyChar().arrItemBag[GameScr.indexSelect] == null) {
                            super.left = null;
                            GameScr.Class92 = false;
                        }
                        else {
                            super.left = new Command(Game86.Class119, 222);
                        }
                    }
                }
                catch (Exception ex3) {}
            }
            else if (GameScr.Class246) {
                if (GameScr.indexMenu == 0) {
                    if (GameScr.Class193 == 1) {
                        if (GameScr.Class85 != null && GameScr.indexSelect == 0) {
                            super.left = new Command(Game86.Class119, 338);
                            if (GameCanvas.Class9) {
                                GameScr.Class198 = false;
                                this.Class1(3, GameScr.Class85);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 335);
                            }
                        }
                        if (GameScr.Class84 != null && GameScr.indexSelect == 1) {
                            super.left = new Command(Game86.Class119, 344);
                            if (GameCanvas.Class9) {
                                GameScr.Class198 = false;
                                this.Class1(3, GameScr.Class84);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 336);
                            }
                        }
                        if (GameScr.Class85 == null && GameScr.Class84 == null) {
                            GameScr.Class92 = false;
                        }
                    }
                    else if (GameScr.Class193 == 2) {
                        final Item itemFocus18 = getItemFocus(47);
                        GameScr.Class198 = false;
                        if (itemFocus18 != null) {
                            super.left = new Command(Game86.Class119, 345);
                            if (GameCanvas.Class9) {
                                this.Class1(3, itemFocus18);
                            }
                            else {
                                super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11101);
                            }
                        }
                        else {
                            super.left = null;
                            GameScr.Class92 = false;
                            if (GameScr.Class84 != null && GameScr.Class85 != null) {
                                for (int l = 0; l < GameScr.Class76.length; ++l) {
                                    if (GameScr.Class76[l] != null) {
                                        super.left = new Command(Game86.Class152, 341);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                        super.left = new Command(Game86.Class119, 337);
                    }
                    else {
                        super.left = null;
                    }
                }
            }
            else if (GameScr.Class250) {
                if (GameScr.indexMenu == 0) {
                    final Item itemFocus19 = getItemFocus(48);
                    GameScr.Class198 = false;
                    if (itemFocus19 != null) {
                        super.left = new Command(Game86.Class119, 401);
                        if (GameCanvas.Class9) {
                            this.Class1(3, itemFocus19);
                        }
                        else {
                            super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11101);
                        }
                    }
                    else {
                        for (int n7 = 0; n7 < GameScr.Class77.length; ++n7) {
                            if (GameScr.Class77[n7] != null) {
                                super.left = new Command(Game86.Class193[0], 403);
                                break;
                            }
                        }
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                        super.left = new Command(Game86.Class119, 400);
                    }
                    else {
                        super.left = null;
                    }
                }
            }
            else if (GameScr.Class247 || GameScr.Class248) {
                if (GameScr.indexMenu == 0) {
                    if (GameScr.Class85 != null) {
                        super.left = new Command(Game86.Class119, 11103);
                    }
                    else {
                        GameScr.Class92 = false;
                    }
                    if (GameCanvas.Class9) {
                        this.Class1(3, GameScr.Class85);
                    }
                    else {
                        super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11104, GameScr.Class85);
                    }
                }
                else if (GameScr.indexMenu == 1) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect] == null) {
                        super.left = null;
                        GameScr.Class92 = false;
                    }
                    else {
                        super.left = new Command(Game86.Class119, 405);
                    }
                }
            }
        }
        if (Class27() && GameScr.indexMenu == 1 && Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
            if (GameCanvas.Class9) {
                this.Class1(3, Char.getMyChar().arrItemBag[GameScr.indexSelect]);
                return;
            }
            super.center = new Command(GameCanvas.Class6 ? Game86.Class50 : "", 11114);
        }
    }
    
    public static void setPopupSize(int class158, int class159) {
        if (GameCanvas.Class25 == 128 || GameCanvas.Class26 <= 208) {
            class158 = 126;
            class159 = 160;
        }
        GameScr.Class158 = class158;
        GameScr.Class159 = class159;
        GameScr.Class157 = GameScr.Class11 - class158 / 2;
        GameScr.Class156 = GameScr.Class13 - class159 / 2;
        if (GameCanvas.Class26 <= 250) {
            GameScr.Class156 -= 10;
        }
        if (GameCanvas.Class9 && !Class86() && GameCanvas.Class29 instanceof GameScr) {
            GameScr.Class158 = 310;
            GameScr.Class157 = GameScr.Class9 / 2 - GameScr.Class158 / 2;
        }
        if (GameScr.Class156 < -10) {
            GameScr.Class156 = -10;
        }
        if (GameCanvas.Class26 > 208 && GameScr.Class156 < 0) {
            GameScr.Class156 = 0;
        }
        if (GameCanvas.Class26 == 208 && GameScr.Class156 < 10) {
            GameScr.Class156 = 10;
        }
    }
    
    private void Class1(final mGraphics mGraphics, final Skill skill) {
        if (Char.getMyChar().Class22 >= skill.Class4) {
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class228) + " " + skill.Class4, GameScr.Class394 + 5, this.Class402 += 12, 0);
        }
        else {
            mFont.Class14.Class1(mGraphics, String.valueOf(Game86.Class228) + " " + skill.Class4, GameScr.Class394 + 5, this.Class402 += 12, 0);
        }
        if (skill.template.type != 0) {
            GameScr.Class194 += 4;
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class313) + ": " + skill.maxFight, GameScr.Class394 + 5, this.Class402 += 12, 0);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class315) + ": " + skill.Class10, GameScr.Class394 + 5, this.Class402 += 12, 0);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class314) + ": " + skill.dx, GameScr.Class394 + 5, this.Class402 += 12, 0);
            final mFont number_red = mFont.number_red;
            final StringBuffer append = new StringBuffer(String.valueOf(Game86.Class316)).append(": ");
            String str;
            if (skill.coolDown % 1000 == 0) {
                str = new StringBuffer(String.valueOf(skill.coolDown / 1000)).toString();
            }
            else {
                final int n = skill.coolDown % 1000;
                str = String.valueOf(skill.coolDown / 1000) + "." + ((n % 100 == 0) ? (n / 100) : (n / 10));
            }
            number_red.Class1(mGraphics, append.append(str).append(" ").append(Game86.Class311).toString(), GameScr.Class394 + 5, this.Class402 += 12, 0);
        }
        ++GameScr.Class194;
    }
    
    private void Class2(final mGraphics mGraphics, final Skill skill) {
        final Game72[] class11 = skill.Class11;
        for (int i = 0; i < class11.length; ++i) {
            final Game72 game72 = class11[i];
            if (mFont.number_red.Class1(game72.Class1()) > 145) {
                final MyVector class12 = mFont.number_red.Class1(game72.Class1(), 145);
                for (int j = 0; j < class12.size(); ++j) {
                    mFont.number_red.Class1(mGraphics, class12.elementAt(j).toString(), GameScr.Class394 + 5, this.Class402 += 12, 0);
                    ++GameScr.Class194;
                }
            }
            else {
                mFont.number_red.Class1(mGraphics, game72.Class1(), GameScr.Class394 + 5, this.Class402 += 12, 0);
                ++GameScr.Class194;
            }
        }
    }
    
    private void Class14(final mGraphics mGraphics) {
        if (GameScr.indexMenu != 1) {
            return;
        }
        Class2(mGraphics);
        Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
        Class1(mGraphics, Game86.Class163[GameScr.indexMenu], true);
        mFont.Class7.Class1(mGraphics, Game86.Class264, GameScr.Class157 + 10, GameScr.Class156 + 32, 0);
        mFont.Class7.Class1(mGraphics, new StringBuffer().append(Char.getMyChar().Class32).toString(), GameScr.Class157 + GameScr.Class158 - 10, GameScr.Class156 + 32, 1);
        mGraphics.setColor(0);
        mGraphics.fillRect(GameScr.Class157 + 4, GameScr.Class156 + 44, GameScr.Class158 - 7, GameScr.Class192 + 3);
        mGraphics.setColor(12281361);
        mGraphics.Class2(GameScr.Class157 + 5, GameScr.Class156 + 45, GameScr.Class158 - 10, GameScr.Class192);
        if (GameScr.Class193 > 0) {
            mGraphics.setColor(Game25.Class4);
            mGraphics.Class2(GameScr.Class157 + 5, GameScr.Class156 + 48 + GameScr.Class192, GameScr.Class158 - 10, GameScr.Class159 - 64 - GameScr.Class192);
        }
        final int length = Char.getMyChar().nClass.Class3.length;
        GameScr.Class394 = GameScr.Class157 + 5;
        GameScr.Class395 = GameScr.Class156 + 45;
        GameScr.Class50.Class1(length, GameScr.Class192 + 2, GameScr.Class394 + 1, GameScr.Class395, GameScr.Class158 - 12, GameScr.Class192 + 2, false, 1);
        GameScr.Class50.Class1(mGraphics);
        for (int i = 0; i < length; ++i) {
            Game2.Class1(mGraphics, Char.getMyChar().nClass.Class3[i].iconId, GameScr.Class394 + i * (GameScr.Class192 + 2) + GameScr.Class192 / 2, GameScr.Class395 + GameScr.Class192 / 2, 0, 3);
            if (GameScr.Class193 == 1 && i == GameScr.indexSelect) {
                mGraphics.setColor(16777215);
                mGraphics.Class2(GameScr.Class394 + i * (GameScr.Class192 + 2) + 2, GameScr.Class395 + 2, GameScr.Class192 - 4, GameScr.Class192 - 4);
                Class1(GameScr.Class394 + i * (GameScr.Class192 + 2), GameScr.Class395, mGraphics);
            }
        }
        GameScr.Class394 += 8;
        GameScr.Class395 += 6;
        if (GameScr.Class193 == 1 && GameScr.indexSelect >= 0) {
            Class2(mGraphics);
            final SkillTemplate skillTemplate = Char.getMyChar().nClass.Class3[GameScr.indexSelect];
            GameScr.Class194 = 4 + skillTemplate.Class6.length;
            final Skill class1 = Char.getMyChar().Class1(skillTemplate);
            final int class2 = GameScr.Class157;
            final int n = GameScr.Class395 + GameScr.Class192 + 2;
            final int n2 = GameScr.Class158 - 6;
            final int n3 = GameScr.Class159 - 70 - GameScr.Class192;
            GameScr.Class196.Class1(mGraphics, class2, n, n2, n3);
            this.Class402 = GameScr.Class395 + 18;
            if (class1 == null) {
                final Skill skill = (skillTemplate.Class7.length > 1) ? skillTemplate.Class7[1] : skillTemplate.Class7[0];
                mFont.Class3.Class1(mGraphics, skillTemplate.Class2, GameScr.Class394 + 5, this.Class402 += 12, 0);
                for (int j = 0; j < skillTemplate.Class6.length; ++j) {
                    mFont.number_red.Class1(mGraphics, skillTemplate.Class6[j], GameScr.Class394 + 5, this.Class402 += 12, 0);
                }
                mFont.number_red.Class1(mGraphics, Game86.Class248[skillTemplate.type], GameScr.Class394 + 5, this.Class402 += 12, 0);
                mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class226) + ": " + skillTemplate.Class3, GameScr.Class394 + 5, this.Class402 += 12, 0);
                mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class224, String.valueOf(skill.Class3)), GameScr.Class394 + 5, this.Class402 += 12, 0);
                this.Class1(mGraphics, skill);
                this.Class2(mGraphics, skill);
            }
            else {
                mFont.Class7.Class1(mGraphics, skillTemplate.Class2, GameScr.Class394 + 5, this.Class402 += 12, 0);
                for (int k = 0; k < skillTemplate.Class6.length; ++k) {
                    mFont.number_red.Class1(mGraphics, skillTemplate.Class6[k], GameScr.Class394 + 5, this.Class402 += 12, 0);
                }
                mFont.number_red.Class1(mGraphics, Game86.Class248[skillTemplate.type], GameScr.Class394 + 5, this.Class402 += 12, 0);
                mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class226) + ": " + skillTemplate.Class3, GameScr.Class394 + 5, this.Class402 += 12, 0);
                if (class1.Class3 == skillTemplate.Class3) {
                    mFont.Class15.Class1(mGraphics, Game86.Class227, GameScr.Class394 + 5, this.Class402 += 12, 0);
                    this.Class1(mGraphics, class1);
                    this.Class2(mGraphics, class1);
                }
                else {
                    mFont.Class15.Class1(mGraphics, Game86.Class1(Game86.Class225, String.valueOf(class1.Class3)), GameScr.Class394 + 5, this.Class402 += 12, 0);
                    this.Class1(mGraphics, class1);
                    this.Class2(mGraphics, class1);
                    int l;
                    for (l = 0; l < skillTemplate.Class7.length; ++l) {
                        if (skillTemplate.Class7[l].equals(class1)) {
                            ++l;
                            break;
                        }
                    }
                    mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class224, String.valueOf(skillTemplate.Class7[l].Class3)), GameScr.Class394 + 5, this.Class402 += 12, 0);
                    this.Class1(mGraphics, skillTemplate.Class7[l]);
                    ++GameScr.Class194;
                    this.Class2(mGraphics, skillTemplate.Class7[l]);
                }
            }
            GameScr.Class196.Class1(GameScr.Class194, 12, class2, n, n2, n3, true, 1);
            if (GameScr.indexRow >= 0) {
                Game2.Class1(mGraphics, 942, GameScr.Class394 + 2, GameScr.Class395 + 32 + GameScr.indexRow * 12, 0, Game62.Class3);
            }
        }
    }
    
    private void Class1(final mGraphics mGraphics, final String[] array) {
        try {
            Class2(mGraphics);
            Class1(mGraphics, array, true);
            this.Class1(mGraphics, Char.getMyChar().arrItemBag);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void Class1(final mGraphics mGraphics, final Item[] array) {
        GameScr.Class401 = array.length / GameScr.Class400;
        GameScr.Class50.Class1(GameScr.Class401, GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class400 * GameScr.Class192, 5 * GameScr.Class192, true, 6);
        GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class50.Class5 + 2, GameScr.Class50.Class6 + 2);
        for (int i = 0; i < GameScr.Class401; ++i) {
            for (int j = 0; j < GameScr.Class400; ++j) {
                Game2.Class1(mGraphics, 154, GameScr.Class394 + j * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                mGraphics.setColor(12281361);
                final int n = GameScr.Class394 + j * GameScr.Class192;
                final int n2 = GameScr.Class395 + i * GameScr.Class192;
                final int class192 = GameScr.Class192;
                mGraphics.Class2(n, n2, class192, class192);
            }
        }
        for (int k = 0; k < array.length; ++k) {
            final Item item;
            if ((item = array[k]) != null) {
                final int n3 = item.indexUI / GameScr.Class400;
                final int n4 = item.indexUI - n3 * GameScr.Class400;
                this.Class1(mGraphics, item, GameScr.Class394 + n4 * GameScr.Class192, GameScr.Class395 + n3 * GameScr.Class192);
                if (item.quantity > 1) {
                    mFont.Class18.Class1(mGraphics, new StringBuffer().append(item.quantity).toString(), GameScr.Class394 + n4 * GameScr.Class192 + GameScr.Class192, GameScr.Class395 + n3 * GameScr.Class192 + GameScr.Class192 - mFont.Class18.Class1, 1);
                }
            }
        }
        if (GameScr.Class193 > 0 && GameScr.indexSelect >= 0) {
            final int n5 = GameScr.indexSelect / GameScr.Class400;
            final int n6 = GameScr.indexSelect - n5 * GameScr.Class400;
            mGraphics.setColor(16777215);
            final int n7 = GameScr.Class394 + n6 * GameScr.Class192;
            final int n8 = GameScr.Class395 + n5 * GameScr.Class192;
            final int class193 = GameScr.Class192;
            mGraphics.Class2(n7, n8, class193, class193);
            Class1(GameScr.Class394 + n6 * GameScr.Class192, GameScr.Class395 + n5 * GameScr.Class192, mGraphics);
        }
    }
    
    private static void Class1(final int n, final int n2, final mGraphics mGraphics) {
        mGraphics.Class1(GameScr.Class277, n - 5, n2 - 5, 0);
    }
    
    private static int Class9(int n) {
        final int n2 = GameScr.Class192 - 2;
        if ((n %= n2 << 2) >= 0 && n < n2) {
            return 0;
        }
        if (n2 <= n && n < n2 << 1) {
            return n % n2;
        }
        if (n2 << 1 <= n && n < n2 * 3) {
            return n2;
        }
        return n2 - n % n2;
    }
    
    private static int Class10(int n) {
        final int n2 = GameScr.Class192 - 2;
        if ((n %= n2 << 2) >= 0 && n < n2) {
            return n % n2;
        }
        if (n2 <= n && n < n2 << 1) {
            return n2;
        }
        if (n2 << 1 <= n && n < n2 * 3) {
            return n2 - n % n2;
        }
        return 0;
    }
    
    private static void Class2(final mGraphics mGraphics, final Item[] array) {
        try {
            Class2(mGraphics);
            final String class406 = GameScr.Class406;
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class287) + ": " + Game20.Class1(String.valueOf(Char.getMyChar().xu)), GameScr.Class157 + 6, GameScr.Class156 + GameScr.Class159 - 26, 0);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class288) + ": " + Game20.Class1(String.valueOf(Char.getMyChar().yen)), GameScr.Class157 + GameScr.Class158 - 6, GameScr.Class156 + GameScr.Class159 - 26, 1);
            if (GameScr.isPaintTrade) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.Class12.Class1(mGraphics, Game86.Class155, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 14, 2);
                }
            }
            else if (GameScr.Class233) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.Class12.Class1(mGraphics, Game86.Class153, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 14, 2);
                }
            }
            else if (GameScr.Class235) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.Class12.Class1(mGraphics, Game86.Class154, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 14, 2);
                }
            }
            else {
                mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class289) + ": " + Game20.Class1(String.valueOf(Char.getMyChar().luong)), GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 14, 2);
            }
            Class1(mGraphics, class406, false);
            GameScr.Class394 = GameScr.Class157 + 3;
            GameScr.Class395 = GameScr.Class156 + 32;
            mGraphics.setColor(6425);
            mGraphics.fillRect(GameScr.Class394 - 1, GameScr.Class395 - 1, GameScr.Class400 * GameScr.Class192 + 3, 5 * GameScr.Class192 + 3);
            if (array == null) {
                GameCanvas.Class1(GameScr.Class157 + 90, GameScr.Class156 + 75, mGraphics);
                mFont.Class7.Class1(mGraphics, Game86.Class25, GameScr.Class157 + 90, GameScr.Class156 + 90, 2);
                return;
            }
            if (array.length <= 30) {
                GameScr.Class401 = 5;
            }
            else if (array.length % GameScr.Class400 == 0) {
                GameScr.Class401 = array.length / GameScr.Class400;
            }
            else {
                GameScr.Class401 = array.length / GameScr.Class400 + 1;
            }
            GameScr.Class50.Class1(GameScr.Class401, GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class400 * GameScr.Class192, 5 * GameScr.Class192, true, 6);
            GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class50.Class5 + 2, GameScr.Class50.Class6 + 2);
            for (int i = 0; i < GameScr.Class401; ++i) {
                for (int j = 0; j < GameScr.Class400; ++j) {
                    Game2.Class1(mGraphics, 154, GameScr.Class394 + j * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    mGraphics.setColor(12281361);
                    final int n = GameScr.Class394 + j * GameScr.Class192;
                    final int n2 = GameScr.Class395 + i * GameScr.Class192;
                    final int class407 = GameScr.Class192;
                    mGraphics.Class2(n, n2, class407, class407);
                }
            }
            for (int k = 0; k < array.length; ++k) {
                final Item item;
                if ((item = array[k]) != null) {
                    final int n3 = item.indexUI / GameScr.Class400;
                    final int n4 = item.indexUI - n3 * GameScr.Class400;
                    if (!item.Class7) {
                        mGraphics.setColor(12083);
                        mGraphics.fillRect(GameScr.Class394 + n4 * GameScr.Class192 + 1, GameScr.Class395 + n3 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                        Game2.Class1(mGraphics, 154, GameScr.Class394 + n4 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n3 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    }
                    Game2.Class1(mGraphics, item.template.Class7, GameScr.Class394 + n4 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n3 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                }
            }
            if (GameScr.Class193 > 0 && GameScr.indexSelect >= 0) {
                final int n5 = GameScr.indexSelect / GameScr.Class400;
                final int n6 = GameScr.indexSelect - n5 * GameScr.Class400;
                mGraphics.setColor(16777215);
                final int n7 = GameScr.Class394 + n6 * GameScr.Class192;
                final int n8 = GameScr.Class395 + n5 * GameScr.Class192;
                final int class408 = GameScr.Class192;
                mGraphics.Class2(n7, n8, class408, class408);
                Class1(GameScr.Class394 + n6 * GameScr.Class192, GameScr.Class395 + n5 * GameScr.Class192, mGraphics);
            }
        }
        catch (Exception ex) {}
    }
    
    private static void Class1(final mGraphics mGraphics, final String[] array, final Item[] array2) {
        try {
            Class2(mGraphics);
            Class1(mGraphics, array, true);
            if (array2 == null) {
                GameCanvas.Class1(GameScr.Class157 + 90, GameScr.Class156 + 75, mGraphics);
                mFont.Class7.Class1(mGraphics, Game86.Class25, GameScr.Class157 + 90, GameScr.Class156 + 90, 2);
                return;
            }
            if (array2.length <= 30) {
                GameScr.Class401 = 5;
            }
            else if (array2.length % GameScr.Class400 == 0) {
                GameScr.Class401 = array2.length / GameScr.Class400;
            }
            else {
                GameScr.Class401 = array2.length / GameScr.Class400 + 1;
            }
            GameScr.Class50.Class1(GameScr.Class401, GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class400 * GameScr.Class192, 5 * GameScr.Class192, true, 6);
            GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class50.Class5 + 2, GameScr.Class50.Class6 + 2);
            for (int i = 0; i < GameScr.Class401; ++i) {
                for (int j = 0; j < GameScr.Class400; ++j) {
                    Game2.Class1(mGraphics, 154, GameScr.Class394 + j * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    mGraphics.setColor(12281361);
                    final int n = GameScr.Class394 + j * GameScr.Class192;
                    final int n2 = GameScr.Class395 + i * GameScr.Class192;
                    final int class192 = GameScr.Class192;
                    mGraphics.Class2(n, n2, class192, class192);
                }
            }
            for (int k = 0; k < array2.length; ++k) {
                final Item item;
                if ((item = array2[k]) != null) {
                    final int n3 = item.indexUI / GameScr.Class400;
                    final int n4 = item.indexUI - n3 * GameScr.Class400;
                    if (!item.Class7) {
                        mGraphics.setColor(12083);
                        mGraphics.fillRect(GameScr.Class394 + n4 * GameScr.Class192 + 1, GameScr.Class395 + n3 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                        Game2.Class1(mGraphics, 154, GameScr.Class394 + n4 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n3 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    }
                    Game2.Class1(mGraphics, item.template.Class7, GameScr.Class394 + n4 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n3 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                }
            }
            if (GameScr.Class193 > 0 && GameScr.indexSelect >= 0) {
                final int n5 = GameScr.indexSelect / GameScr.Class400;
                final int n6 = GameScr.indexSelect - n5 * GameScr.Class400;
                mGraphics.setColor(16777215);
                final int n7 = GameScr.Class394 + n6 * GameScr.Class192;
                final int n8 = GameScr.Class395 + n5 * GameScr.Class192;
                final int class193 = GameScr.Class192;
                mGraphics.Class2(n7, n8, class193, class193);
                Class1(GameScr.Class394 + n6 * GameScr.Class192, GameScr.Class395 + n5 * GameScr.Class192, mGraphics);
            }
        }
        catch (Exception ex) {}
    }
    
    private static void Class1(final mGraphics mGraphics, final String[] array, final boolean b) {
        Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
        if (b) {
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class287) + ": " + Game20.Class1(String.valueOf(Char.getMyChar().xu)), GameScr.Class157 + 6, GameScr.Class156 + GameScr.Class159 - 26, 0);
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class288) + ": " + Game20.Class1(String.valueOf(Char.getMyChar().yen)), GameScr.Class157 + GameScr.Class158 - 6, GameScr.Class156 + GameScr.Class159 - 26, 1);
            if (GameScr.isPaintTrade) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.Class12.Class1(mGraphics, Game86.Class155, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 14, 2);
                }
            }
            else if (GameScr.Class233) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.Class12.Class1(mGraphics, Game86.Class153, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 14, 2);
                }
            }
            else if (GameScr.Class235) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.Class12.Class1(mGraphics, Game86.Class154, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 14, 2);
                }
            }
            else {
                mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class289) + ": " + Game20.Class1(String.valueOf(Char.getMyChar().luong)), GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 14, 2);
            }
        }
        Class1(mGraphics, array[GameScr.indexMenu], array.length > 1);
        GameScr.Class394 = GameScr.Class157 + 3;
        GameScr.Class395 = GameScr.Class156 + 32;
        mGraphics.setColor(6425);
        mGraphics.fillRect(GameScr.Class394 - 1, GameScr.Class395 - 1, GameScr.Class400 * GameScr.Class192 + 3, 5 * GameScr.Class192 + 3);
    }
    
    private void Class1(final mGraphics mGraphics, final Item item, final int n, final int n2) {
        this.Class1(mGraphics, item, n, n2, 0, 0);
    }
    
    private void Class1(final mGraphics mGraphics, final Item item, final int n, final int n2, int n3, int n4) {
        if (!item.Class3()) {
            if ((n3 += item.upgrade) > 0) {
                if (n3 >= 4) {
                    mGraphics.setColor(this.Class403[n3]);
                    mGraphics.fillRect(n + 1 + n4, n2 + 1 + n4, GameScr.Class192 - 1 - (n4 << 1), GameScr.Class192 - 1 - (n4 << 1));
                    Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n2 + GameScr.Class192 / 2, 0, 3);
                }
                else {
                    Class1(mGraphics, item, n, n2, n4);
                }
                if (n3 > 0) {
                    final GameScr gameScr = this;
                    final int n5 = n + GameScr.Class192 / 2;
                    final int n6 = n2 + GameScr.Class192 / 2;
                    final int n7 = n3;
                    n4 = n6;
                    n3 = n5;
                    this = gameScr;
                    final int n8 = GameScr.Class192 - 2;
                    final int n9 = (n7 < 4) ? 0 : ((n7 < 8) ? 1 : ((n7 < 12) ? 2 : ((n7 <= 14) ? 3 : 4)));
                    for (int i = 0; i < this.Class405.length; ++i) {
                        final int n10 = n3 - n8 / 2 + Class10(GameCanvas.gameTick - (i << 2));
                        final int n11 = n4 - n8 / 2 + Class9(GameCanvas.gameTick - (i << 2));
                        mGraphics.setColor(this.Class404[n9][i]);
                        mGraphics.fillRect(n10 - this.Class405[i] / 2, n11 - this.Class405[i] / 2, this.Class405[i], this.Class405[i]);
                    }
                    if (n7 == 4 || n7 == 8) {
                        for (int j = 0; j < this.Class405.length; ++j) {
                            final int n12 = n3 - n8 / 2 + Class10(GameCanvas.gameTick - (n8 << 1) - (j << 2));
                            final int n13 = n4 - n8 / 2 + Class9(GameCanvas.gameTick - (n8 << 1) - (j << 2));
                            mGraphics.setColor(this.Class404[n9 - 1][j]);
                            mGraphics.fillRect(n12 - this.Class405[j] / 2, n13 - this.Class405[j] / 2, this.Class405[j], this.Class405[j]);
                        }
                    }
                    if (n7 != 1 && n7 != 4 && n7 != 8) {
                        for (int k = 0; k < this.Class405.length; ++k) {
                            final int n14 = n3 - n8 / 2 + Class10(GameCanvas.gameTick - (n8 << 1) - (k << 2));
                            final int n15 = n4 - n8 / 2 + Class9(GameCanvas.gameTick - (n8 << 1) - (k << 2));
                            mGraphics.setColor(this.Class404[n9][k]);
                            mGraphics.fillRect(n14 - this.Class405[k] / 2, n15 - this.Class405[k] / 2, this.Class405[k], this.Class405[k]);
                        }
                    }
                    if (n7 != 1 && n7 != 4 && n7 != 8 && n7 != 12 && n7 != 2 && n7 != 5 && n7 != 9) {
                        for (int l = 0; l < this.Class405.length; ++l) {
                            final int n16 = n3 - n8 / 2 + Class10(GameCanvas.gameTick - n8 - (l << 2));
                            final int n17 = n4 - n8 / 2 + Class9(GameCanvas.gameTick - n8 - (l << 2));
                            mGraphics.setColor(this.Class404[n9][l]);
                            mGraphics.fillRect(n16 - this.Class405[l] / 2, n17 - this.Class405[l] / 2, this.Class405[l], this.Class405[l]);
                        }
                    }
                    if (n7 != 1 && n7 != 4 && n7 != 8 && n7 != 12 && n7 != 2 && n7 != 5 && n7 != 9 && n7 != 13 && n7 != 3 && n7 != 6 && n7 != 10 && n7 != 15) {
                        for (int n18 = 0; n18 < this.Class405.length; ++n18) {
                            final int n19 = n3 - n8 / 2 + Class10(GameCanvas.gameTick - n8 * 3 - (n18 << 2));
                            final int n20 = n4 - n8 / 2 + Class9(GameCanvas.gameTick - n8 * 3 - (n18 << 2));
                            mGraphics.setColor(this.Class404[n9][n18]);
                            mGraphics.fillRect(n19 - this.Class405[n18] / 2, n20 - this.Class405[n18] / 2, this.Class405[n18], this.Class405[n18]);
                        }
                    }
                }
            }
            else {
                Class1(mGraphics, item, n, n2, n4);
            }
        }
        Game2.Class2(mGraphics, item.template.Class7, n + GameScr.Class192 / 2, n2 + GameScr.Class192 / 2);
    }
    
    private static void Class1(final mGraphics mGraphics, final Item item, final int n, final int n2, final int n3) {
        if (!item.Class7) {
            mGraphics.setColor(12083);
        }
        else {
            mGraphics.setColor(6425);
        }
        mGraphics.fillRect(n + 1 + n3, n2 + 1 + n3, GameScr.Class192 - 2 - (n3 << 1), GameScr.Class192 - 2 - (n3 << 1));
        Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n2 + GameScr.Class192 / 2, 0, 3);
    }
    
    private void Class2(final mGraphics mGraphics, final String[] array) {
        try {
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, array[GameScr.indexMenu], array.length > 1);
            GameScr.Class394 = GameScr.Class157 + 3;
            GameScr.Class395 = GameScr.Class156 + 34 + GameScr.Class192;
            final int n = GameScr.Class157 + 74;
            final int n2 = GameScr.Class395 - GameScr.Class192 - 3;
            GameScr.Class401 = 4;
            if (GameScr.Class85 != null) {
                this.Class1(mGraphics, GameScr.Class85, n, n2);
            }
            else {
                mGraphics.setColor(6425);
                mGraphics.fillRect(n - 1, n2 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n2 + GameScr.Class192 / 2, 0, 3);
            }
            mGraphics.setColor(12281361);
            final int n3 = n;
            final int n4 = n2;
            final int class192 = GameScr.Class192;
            mGraphics.Class2(n3, n4, class192, class192);
            mGraphics.setColor(6425);
            mGraphics.fillRect(GameScr.Class394 - 1, GameScr.Class395 - 1, GameScr.Class192 * GameScr.Class400 + 3, GameScr.Class192 * GameScr.Class401 + 3);
            for (int i = 0; i < GameScr.Class401; ++i) {
                for (int j = 0; j < GameScr.Class400; ++j) {
                    Game2.Class1(mGraphics, 154, GameScr.Class394 + j * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    mGraphics.setColor(12281361);
                    final int n5 = GameScr.Class394 + j * GameScr.Class192;
                    final int n6 = GameScr.Class395 + i * GameScr.Class192;
                    final int class193 = GameScr.Class192;
                    mGraphics.Class2(n5, n6, class193, class193);
                }
            }
            for (int k = 0; k < GameScr.Class77.length; ++k) {
                final Item item;
                if ((item = GameScr.Class77[k]) != null) {
                    final int n7 = k / GameScr.Class400;
                    final int n8 = k - n7 * GameScr.Class400;
                    if (!item.Class7) {
                        mGraphics.setColor(12083);
                        mGraphics.fillRect(GameScr.Class394 + n8 * GameScr.Class192 + 1, GameScr.Class395 + n7 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                    }
                    Game2.Class1(mGraphics, item.template.Class7, GameScr.Class394 + n8 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n7 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                }
            }
            if (GameScr.Class193 == 1) {
                mGraphics.setColor(16777215);
                final int n9 = n;
                final int n10 = n2;
                final int class194 = GameScr.Class192;
                mGraphics.Class2(n9, n10, class194, class194);
            }
            else if (GameScr.Class193 == 2) {
                final int n11 = GameScr.indexSelect / GameScr.Class400;
                final int n12 = GameScr.indexSelect - n11 * GameScr.Class400;
                mGraphics.setColor(16777215);
                final int n13 = GameScr.Class394 + n12 * GameScr.Class192;
                final int n14 = GameScr.Class395 + n11 * GameScr.Class192;
                final int class195 = GameScr.Class192;
                mGraphics.Class2(n13, n14, class195, class195);
            }
            if (GameScr.Class161 != null) {
                Game2.Class1(mGraphics, GameScr.Class161.Class2[GameScr.Class160].Class3, n + GameScr.Class192 / 2 + GameScr.Class161.Class2[GameScr.Class160].Class1, n2 + GameScr.Class192 / 2 + GameScr.Class161.Class2[GameScr.Class160].Class2, 0, 3);
                if (GameCanvas.gameTick % 2 == 0 && ++GameScr.Class160 >= GameScr.Class161.Class2.length) {
                    GameScr.Class160 = 0;
                    GameScr.Class161 = null;
                }
            }
            if (GameScr.Class243 && GameScr.Class85 != null) {
                ItemOption itemOption = null;
                for (int n15 = 0; n15 < GameScr.Class85.options.size() && (itemOption = (ItemOption)GameScr.Class85.options.elementAt(n15)).optionTemplate.id != 85; ++n15) {
                    itemOption = null;
                }
                if (itemOption != null) {
                    final int[] array2 = { 60, 45, 34, 26, 20, 15, 11, 8, 6 };
                    final int[] array3 = { 150000, 247500, 408375, 673819, 1111801, 2056832, 4010822, 7420021, 12243035 };
                    final byte[] array4 = { 3, 5, 9, 4, 7, 10, 5, 7, 9 };
                    mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class491) + ": " + Game20.Class1(new StringBuffer(String.valueOf(itemOption.param + 1)).toString()), GameScr.Class394 + 1, GameScr.Class395 + 114, 0);
                    mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class205) + array2[itemOption.param] + "%)", GameScr.Class394 + 70, GameScr.Class395 + 114, 0);
                    mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class28) + ": " + Game20.Class1(new StringBuffer(String.valueOf(array3[itemOption.param])).toString()) + " " + Game86.Class288 + ", " + array4[itemOption.param] + " " + ((itemOption.param < 3) ? Game86.Class495[1] : ((itemOption.param < 6) ? Game86.Class495[2] : Game86.Class495[3])), GameScr.Class394 + 1, GameScr.Class395 + 126, 0);
                    return;
                }
                mFont.Class14.Class1(mGraphics, Game86.Class487, GameScr.Class394 + 1, GameScr.Class395 + 120, 0);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void Class3(final mGraphics mGraphics, final String[] array) {
        try {
            Class2(mGraphics);
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, array[GameScr.indexMenu], array.length > 1);
            GameScr.Class394 = GameScr.Class157 + 3;
            GameScr.Class395 = GameScr.Class156 + 32;
            mGraphics.setColor(6425);
            GameScr.Class401 = 4;
            if (GameScr.Class233) {
                int n = 0;
                int n2 = 0;
                int n3 = 0;
                boolean b = false;
                for (int i = 0; i < GameScr.Class75.length; ++i) {
                    if (GameScr.Class75[i] != null) {
                        if (GameScr.Class75[i].Class7) {
                            b = true;
                        }
                        n += GameScr.Class99[GameScr.Class75[i].template.id];
                        ++n2;
                    }
                }
                if (n > 0) {
                    for (n3 = GameScr.Class99.length - 1; n3 >= 0 && n <= GameScr.Class99[n3]; --n3) {}
                }
                if (n3 >= GameScr.Class99.length - 1) {
                    n3 = GameScr.Class99.length - 2;
                }
                if (GameScr.Class197) {
                    if (n2 > 1) {
                        mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class200) + " " + (n3 + 2) + " " + (b ? Game86.Class39 : ""), GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 9, 0);
                        if (GameScr.Class103[n3 + 1] > Char.getMyChar().xu) {
                            mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class203, Game20.Class1(String.valueOf(GameScr.Class103[n3 + 1]))), GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 21, 0);
                        }
                        else {
                            mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class203, Game20.Class1(String.valueOf(GameScr.Class103[n3 + 1]))), GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 21, 0);
                        }
                        mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class204) + ": " + n * 100 / GameScr.Class99[n3 + 1] + "%", GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 33, 0);
                    }
                    else {
                        for (int j = 1; j <= 2; ++j) {
                            mFont.number_red.Class1(mGraphics, Game86.Class196[j], GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5 + (j - 1) * 12, 0);
                        }
                    }
                }
                else if (n2 > 1) {
                    mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class200) + " " + (n3 + 2) + " " + Game86.Class39, GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 9, 0);
                    if (GameScr.Class103[n3 + 1] > Char.getMyChar().xu + Char.getMyChar().yen) {
                        mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class201, Game20.Class1(String.valueOf(GameScr.Class103[n3 + 1]))), GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 21, 0);
                    }
                    else {
                        mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class201, Game20.Class1(String.valueOf(GameScr.Class103[n3 + 1]))), GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 21, 0);
                    }
                    mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class204) + ": " + n * 100 / GameScr.Class99[n3 + 1] + "%", GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 33, 0);
                }
                else {
                    for (int k = 0; k < 3; ++k) {
                        mFont.number_red.Class1(mGraphics, Game86.Class196[k], GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5 + k * 12, 0);
                    }
                }
            }
            else {
                mFont.number_red.Class1(mGraphics, Game86.Class478[0], GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 9, 0);
                mFont.number_red.Class1(mGraphics, Game86.Class478[1], GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 21, 0);
                mFont.number_red.Class1(mGraphics, Game86.Class478[2], GameScr.Class394 + 3, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 33, 0);
            }
            mGraphics.setColor(0);
            mGraphics.fillRect(GameScr.Class394, GameScr.Class395, GameScr.Class400 * GameScr.Class192 + 1, GameScr.Class401 * GameScr.Class192 + 1);
            for (int l = 0; l < GameScr.Class401; ++l) {
                for (int n4 = 0; n4 < GameScr.Class400; ++n4) {
                    Game2.Class1(mGraphics, 154, GameScr.Class394 + n4 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + l * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    mGraphics.setColor(12281361);
                    final int n5 = GameScr.Class394 + n4 * GameScr.Class192;
                    final int n6 = GameScr.Class395 + l * GameScr.Class192;
                    final int class192 = GameScr.Class192;
                    mGraphics.Class2(n5, n6, class192, class192);
                }
            }
            for (int n7 = 0; n7 < GameScr.Class75.length; ++n7) {
                final Item item;
                if ((item = GameScr.Class75[n7]) != null) {
                    final int n8 = n7 / GameScr.Class400;
                    final int n9 = n7 - n8 * GameScr.Class400;
                    if (!item.Class7) {
                        mGraphics.setColor(4543829);
                        mGraphics.fillRect(GameScr.Class394 + n9 * GameScr.Class192 + 1, GameScr.Class395 + n8 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                    }
                    Game2.Class1(mGraphics, item.template.Class7, GameScr.Class394 + n9 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n8 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                }
            }
            if (GameScr.Class193 > 0) {
                final int n10 = GameScr.indexSelect / GameScr.Class400;
                final int n11 = GameScr.indexSelect - n10 * GameScr.Class400;
                mGraphics.setColor(16777215);
                final int n12 = GameScr.Class394 + n11 * GameScr.Class192;
                final int n13 = GameScr.Class395 + n10 * GameScr.Class192;
                final int class193 = GameScr.Class192;
                mGraphics.Class2(n12, n13, class193, class193);
            }
            if (GameScr.Class161 != null) {
                Game2.Class1(mGraphics, GameScr.Class161.Class2[GameScr.Class160].Class3, GameScr.Class394 + GameScr.Class192 / 2 + GameScr.Class161.Class2[GameScr.Class160].Class1 + 1, GameScr.Class395 + GameScr.Class192 / 2 + 9 + GameScr.Class161.Class2[GameScr.Class160].Class2, 0, 3);
                if (GameCanvas.gameTick % 2 == 0 && ++GameScr.Class160 >= GameScr.Class161.Class2.length) {
                    GameScr.Class160 = 0;
                    GameScr.Class161 = null;
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void Class15(final mGraphics mGraphics) {
        if (GameScr.Class240) {
            Class2(mGraphics);
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            int class158 = GameScr.Class158;
            if (GameCanvas.Class9) {
                class158 = GameScr.Class158 / 2 + 20;
            }
            mGraphics.setColor(0);
            mGraphics.fillRect(GameScr.Class157 + 7, GameScr.Class156 + 31, class158 - 14, GameScr.Class159 - 58);
            mGraphics.setColor(-3170504);
            mGraphics.Class2(GameScr.Class157 + 8, GameScr.Class156 + 32, class158 - 16, GameScr.Class159 - 60);
            mGraphics.setColor(Game25.Class1);
            mGraphics.fillRect(GameScr.Class157 + 9, GameScr.Class156 + 33, class158 - 18, GameScr.Class159 - 62);
            Class1(mGraphics, Game86.Class460, false);
            GameScr.Class394 = GameScr.Class157 + 33;
            GameScr.Class395 = GameScr.Class156 + 40;
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    mGraphics.setColor(Game25.Class3);
                    mGraphics.fillRect(GameScr.Class394 + j * 40, GameScr.Class395 + 10 + i * 40, 29, 29);
                    mGraphics.setColor(-6527695);
                    mGraphics.Class2(GameScr.Class394 + j * 40, GameScr.Class395 + 10 + i * 40, 29, 29);
                    mGraphics.setColor(-6737152);
                    mGraphics.fillRect(GameScr.Class394 + j * 40 + 2, GameScr.Class395 + 12 + i * 40, 26, 26);
                    mGraphics.setColor(Game25.Class3);
                    mGraphics.fillRect(GameScr.Class394 + j * 40 + 4, GameScr.Class395 + 14 + i * 40, 22, 22);
                    Game2.Class1(mGraphics, 1414, GameScr.Class394 + j * 40 + 20 - 5, GameScr.Class395 + i * 40 + 20 + 4, 0, Game62.Class7);
                }
            }
            for (int k = 0; k < 9; ++k) {
                final int n = k / 3;
                final int n2 = k - n * 3;
                mGraphics mGraphics2 = null;
                int class159 = 0;
                Label_0842: {
                    if (GameScr.Class82 != null) {
                        mGraphics.setColor(-16770791);
                        mGraphics.fillRect(GameScr.Class394 + n2 * 40 + 4, GameScr.Class395 + 14 + n * 40, 22, 22);
                        mGraphics.setColor((k == GameScr.indexSelect) ? -1 : -6527695);
                        mGraphics.Class2(GameScr.Class394 + n2 * 40 + 4, GameScr.Class395 + 14 + n * 40, 21, 21);
                        Game2.Class1(mGraphics, 154, GameScr.Class394 + n2 * 40 + 17 - 3, GameScr.Class395 + 7 + n * 40 + 17, 0, 3);
                        if (System.currentTimeMillis() - this.Class137 < 1000L) {
                            if (k == GameScr.Class47) {
                                Game2.Class1(mGraphics, Game104.Class2(GameScr.Class82[GameScr.Class47]), GameScr.Class394 + n2 * 40 + 17 - 3, GameScr.Class395 + 7 + n * 40 + 17, 0, 3);
                            }
                            else {
                                Game2.Class1(mGraphics, 1414, GameScr.Class394 + n2 * 40 + 17 - 2, GameScr.Class395 + 7 + n * 40 + 17, 0, Game62.Class7);
                            }
                        }
                        else if (GameScr.Class82[k] < 0 || GameScr.Class82[k] >= Game104.Class1.Class1.size()) {
                            Game2.Class1(mGraphics, Game104.Class2((short)242), GameScr.Class394 + n2 * 40 + 17 - 3, GameScr.Class395 + 7 + n * 40 + 17, 0, 3);
                        }
                        else {
                            Game2.Class1(mGraphics, Game104.Class2(GameScr.Class82[k]), GameScr.Class394 + n2 * 40 + 17 - 3, GameScr.Class395 + 7 + n * 40 + 17, 0, 3);
                        }
                        if (GameScr.Class47 == k && this.Class139 > 0) {
                            this.Class141[k] = new StringBuffer(String.valueOf(this.Class139)).toString();
                        }
                        if (GameScr.Class193 != 1) {
                            continue;
                        }
                        if (GameScr.Class47 == k && GameCanvas.gameTick % 10 > 4) {
                            mGraphics2 = mGraphics;
                            class159 = -3368653;
                            break Label_0842;
                        }
                        if (k == GameScr.indexSelect) {
                            mGraphics2 = mGraphics;
                            class159 = -1;
                            break Label_0842;
                        }
                        mGraphics2 = mGraphics;
                    }
                    else {
                        if (GameScr.Class193 != 1) {
                            continue;
                        }
                        mGraphics2 = mGraphics;
                        if (k == GameScr.indexSelect) {
                            class159 = -1;
                            break Label_0842;
                        }
                    }
                    class159 = Game25.Class2;
                }
                mGraphics2.setColor(class159);
                mGraphics.Class2(GameScr.Class394 + n2 * 40, GameScr.Class395 + 10 + n * 40, 29, 29);
            }
            mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class461) + this.Class83, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 20, 2);
        }
    }
    
    private void Class16(final mGraphics mGraphics) {
        if (GameScr.Class226) {
            if (GameScr.indexMenu == 0) {
                Class1(mGraphics, Game86.Class175, GameScr.Class66);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class175);
            }
        }
    }
    
    private void Class17(final mGraphics mGraphics) {
        if (GameScr.Class227) {
            if (GameScr.indexMenu == 0) {
                Class1(mGraphics, Game86.Class176, GameScr.Class67);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class176);
            }
        }
    }
    
    private void Class18(final mGraphics mGraphics) {
        if (GameScr.Class228) {
            if (GameScr.indexMenu == 0) {
                Class1(mGraphics, Game86.Class177, GameScr.Class68);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class177);
            }
        }
    }
    
    private void Class19(final mGraphics mGraphics) {
        if (GameScr.Class229) {
            if (GameScr.indexMenu == 0) {
                Class1(mGraphics, Game86.Class178, GameScr.Class69);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class178);
            }
        }
    }
    
    private void Class20(mGraphics mGraphics) {
        if (GameScr.Class230) {
            if (GameScr.indexMenu == 0) {
                final GameScr gameScr = this;
                final mGraphics mGraphics2 = mGraphics;
                final String[] class179 = Game86.Class179;
                mGraphics = mGraphics2;
                this = gameScr;
                try {
                    GameScr.Class401 = 3;
                    Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
                    Class1(mGraphics, class179[GameScr.indexMenu], class179.length > 1);
                    GameScr.Class394 = GameScr.Class157 + 3;
                    GameScr.Class395 = GameScr.Class156 + 34 + GameScr.Class192;
                    final int n = GameScr.Class157 + 45;
                    final int n2 = GameScr.Class157 + 100;
                    final int n3 = GameScr.Class395 - GameScr.Class192 - 3;
                    if (GameScr.Class84 != null) {
                        this.Class1(mGraphics, GameScr.Class84, n, n3);
                        mGraphics.setColor(12281361);
                        final mGraphics mGraphics3 = mGraphics;
                        final int n4 = n;
                        final int n5 = n3;
                        final int class180 = GameScr.Class192;
                        mGraphics3.Class2(n4, n5, class180, class180);
                        mFont.Class12.Class1(mGraphics, "(+" + GameScr.Class84.upgrade + ")", n - 5, n3 + GameScr.Class192 / 2 - 5, 1);
                    }
                    else {
                        mGraphics.setColor(6425);
                        mGraphics.fillRect(n - 1, n3 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                        Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n3 + GameScr.Class192 / 2, 0, 3);
                        mGraphics.setColor(12281361);
                        final mGraphics mGraphics4 = mGraphics;
                        final int n6 = n;
                        final int n7 = n3;
                        final int class181 = GameScr.Class192;
                        mGraphics4.Class2(n6, n7, class181, class181);
                    }
                    Game2.Class1(mGraphics, 942, n + 43, GameScr.Class395 - 15, 0, Game62.Class7);
                    if (GameScr.Class84 != null && !GameScr.Class84.Class16()) {
                        this.Class1(mGraphics, GameScr.Class84, n2, n3, 1, 0);
                        mGraphics.setColor(12281361);
                        final mGraphics mGraphics5 = mGraphics;
                        final int n8 = n2;
                        final int n9 = n3;
                        final int class182 = GameScr.Class192;
                        mGraphics5.Class2(n8, n9, class182, class182);
                        mFont.Class12.Class1(mGraphics, "(+" + (GameScr.Class84.upgrade + 1) + ")", n2 + GameScr.Class192 + 10, n3 + GameScr.Class192 / 2 - 5, 0);
                    }
                    else {
                        mGraphics.setColor(6425);
                        mGraphics.fillRect(n2 - 1, n3 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                        Game2.Class1(mGraphics, 154, n2 + GameScr.Class192 / 2, n3 + GameScr.Class192 / 2, 0, 3);
                        mGraphics.setColor(12281361);
                        final mGraphics mGraphics6 = mGraphics;
                        final int n10 = n2;
                        final int n11 = n3;
                        final int class183 = GameScr.Class192;
                        mGraphics6.Class2(n10, n11, class183, class183);
                    }
                    if (GameScr.Class193 == 1) {
                        if (GameScr.indexSelect == 0) {
                            mGraphics.setColor(16777215);
                            final mGraphics mGraphics7 = mGraphics;
                            final int n12 = n;
                            final int n13 = n3;
                            final int class184 = GameScr.Class192;
                            mGraphics7.Class2(n12, n13, class184, class184);
                        }
                        if (GameScr.indexSelect == 1) {
                            mGraphics.setColor(16777215);
                            final mGraphics mGraphics8 = mGraphics;
                            final int n14 = n2;
                            final int n15 = n3;
                            final int class185 = GameScr.Class192;
                            mGraphics8.Class2(n14, n15, class185, class185);
                        }
                    }
                    if (GameScr.Class84 != null) {
                        if (GameScr.Class84.Class16()) {
                            if (!GameCanvas.Class9) {
                                mFont.Class12.Class1(mGraphics, Game86.Class197[3], GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5, 2);
                            }
                            else {
                                mFont.Class12.Class1(mGraphics, Game86.Class197[3], GameScr.Class157 + 7, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5, 0);
                            }
                        }
                        else {
                            int n16 = 0;
                            for (int i = 0; i < GameScr.Class76.length; ++i) {
                                if (GameScr.Class76[i] != null && GameScr.Class76[i].template.type == 26) {
                                    n16 += GameScr.Class99[GameScr.Class76[i].template.id];
                                }
                            }
                            int n17 = 0;
                            if (GameScr.Class84.Class18()) {
                                int j;
                                if ((j = n16 * 100 / GameScr.Class100[GameScr.Class84.upgrade]) > GameScr.Class107[GameScr.Class84.upgrade]) {
                                    j = GameScr.Class107[GameScr.Class84.upgrade];
                                }
                                if (GameScr.Class232) {
                                    j *= (int)1.5;
                                    n17 = GameScr.Class108[GameScr.Class84.upgrade];
                                }
                                if (GameScr.Class104[GameScr.Class84.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                                    mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class201, Game20.Class1(String.valueOf(GameScr.Class104[GameScr.Class84.upgrade]))), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5, 0);
                                }
                                else {
                                    mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class201, Game20.Class1(String.valueOf(GameScr.Class104[GameScr.Class84.upgrade]))), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5, 0);
                                }
                                if (n17 > Char.getMyChar().luong) {
                                    mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class202, new StringBuffer(String.valueOf(n17)).toString()), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 17, 0);
                                }
                                else {
                                    mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class202, new StringBuffer(String.valueOf(n17)).toString()), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 17, 0);
                                }
                                mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class204) + ": " + j + "%", GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 29, 0);
                            }
                            else if (GameScr.Class84.Class19()) {
                                int k;
                                if ((k = n16 * 100 / GameScr.Class101[GameScr.Class84.upgrade]) > GameScr.Class107[GameScr.Class84.upgrade]) {
                                    k = GameScr.Class107[GameScr.Class84.upgrade];
                                }
                                if (GameScr.Class232) {
                                    k *= (int)1.5;
                                    n17 = GameScr.Class108[GameScr.Class84.upgrade];
                                }
                                if (GameScr.Class105[GameScr.Class84.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                                    mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class201, Game20.Class1(String.valueOf(GameScr.Class105[GameScr.Class84.upgrade]))), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5, 0);
                                }
                                else {
                                    mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class201, Game20.Class1(String.valueOf(GameScr.Class105[GameScr.Class84.upgrade]))), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5, 0);
                                }
                                if (n17 > Char.getMyChar().luong) {
                                    mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class202, new StringBuffer(String.valueOf(n17)).toString()), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 17, 0);
                                }
                                else {
                                    mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class202, new StringBuffer(String.valueOf(n17)).toString()), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 17, 0);
                                }
                                mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class204) + ": " + k + "%", GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 29, 0);
                            }
                            else if (GameScr.Class84.Class20()) {
                                int l;
                                if ((l = n16 * 100 / GameScr.Class102[GameScr.Class84.upgrade]) > GameScr.Class107[GameScr.Class84.upgrade]) {
                                    l = GameScr.Class107[GameScr.Class84.upgrade];
                                }
                                if (GameScr.Class232) {
                                    l *= (int)1.5;
                                    n17 = GameScr.Class108[GameScr.Class84.upgrade];
                                }
                                if (GameScr.Class106[GameScr.Class84.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                                    mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class201, Game20.Class1(String.valueOf(GameScr.Class106[GameScr.Class84.upgrade]))), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5, 0);
                                }
                                else {
                                    mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class201, Game20.Class1(String.valueOf(GameScr.Class106[GameScr.Class84.upgrade]))), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5, 0);
                                }
                                if (n17 > Char.getMyChar().luong) {
                                    mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class202, new StringBuffer(String.valueOf(n17)).toString()), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 17, 0);
                                }
                                else {
                                    mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class202, new StringBuffer(String.valueOf(n17)).toString()), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 17, 0);
                                }
                                mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class204) + ": " + l + "%", GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 29, 0);
                            }
                        }
                    }
                    else {
                        for (int n18 = 0; n18 < 3; ++n18) {
                            mFont.number_red.Class1(mGraphics, Game86.Class197[n18], GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5 + n18 * 12, 0);
                        }
                    }
                    mGraphics.setColor(0);
                    mGraphics.fillRect(GameScr.Class394 - 1, GameScr.Class395 - 1, GameScr.Class400 * GameScr.Class192 + 3, GameScr.Class401 * GameScr.Class192 + 3);
                    for (int n19 = 0; n19 < GameScr.Class401; ++n19) {
                        for (int n20 = 0; n20 < GameScr.Class400; ++n20) {
                            Game2.Class1(mGraphics, 154, GameScr.Class394 + n20 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n19 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                            mGraphics.setColor(12281361);
                            final mGraphics mGraphics9 = mGraphics;
                            final int n21 = GameScr.Class394 + n20 * GameScr.Class192;
                            final int n22 = GameScr.Class395 + n19 * GameScr.Class192;
                            final int class186 = GameScr.Class192;
                            mGraphics9.Class2(n21, n22, class186, class186);
                        }
                    }
                    if (GameScr.Class193 == 2) {
                        final int n23 = GameScr.indexSelect / GameScr.Class400;
                        final int n24 = GameScr.indexSelect - n23 * GameScr.Class400;
                        mGraphics.setColor(16777215);
                        final mGraphics mGraphics10 = mGraphics;
                        final int n25 = GameScr.Class394 + n24 * GameScr.Class192;
                        final int n26 = GameScr.Class395 + n23 * GameScr.Class192;
                        final int class187 = GameScr.Class192;
                        mGraphics10.Class2(n25, n26, class187, class187);
                    }
                    for (int n27 = 0; n27 < GameScr.Class76.length; ++n27) {
                        final Item item;
                        if ((item = GameScr.Class76[n27]) != null) {
                            final int n28 = n27 / GameScr.Class400;
                            final int n29 = n27 - n28 * GameScr.Class400;
                            if (!item.Class7) {
                                mGraphics.setColor(12083);
                                mGraphics.fillRect(GameScr.Class394 + n29 * GameScr.Class192 + 1, GameScr.Class395 + n28 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                            }
                            Game2.Class1(mGraphics, item.template.Class7, GameScr.Class394 + n29 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n28 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                        }
                    }
                    if (GameScr.Class161 != null) {
                        Game2.Class1(mGraphics, GameScr.Class161.Class2[GameScr.Class160].Class3, n + GameScr.Class192 / 2 + GameScr.Class161.Class2[GameScr.Class160].Class1 + 1, n3 + GameScr.Class192 / 2 + 9 + GameScr.Class161.Class2[GameScr.Class160].Class2, 0, 3);
                        if (GameCanvas.gameTick % 2 == 0 && ++GameScr.Class160 >= GameScr.Class161.Class2.length) {
                            GameScr.Class160 = 0;
                            GameScr.Class161 = null;
                        }
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class179);
            }
        }
    }
    
    private void Class21(mGraphics mGraphics) {
        if (GameScr.Class89) {
            if (GameScr.indexMenu == 0) {
                final GameScr gameScr = this;
                final mGraphics mGraphics2 = mGraphics;
                final String[] class180 = Game86.Class180;
                mGraphics = mGraphics2;
                this = gameScr;
                try {
                    GameScr.Class401 = 5;
                    Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
                    Class1(mGraphics, class180, false);
                    mGraphics.setColor(6693376);
                    mGraphics.fillRect(GameScr.Class157 + 3, GameScr.Class156 + 32, 168, 140);
                    mGraphics.setColor(13408563);
                    mGraphics.Class2(GameScr.Class157 + 3, GameScr.Class156 + 32, 168, 140);
                    final int n = GameScr.Class157 + 74;
                    final int n2 = GameScr.Class156 + 40 + GameScr.Class192;
                    mFont.number_red.Class1(mGraphics, Game86.Class359, n + GameScr.Class192 / 2, n2 - GameScr.Class192 / 2 - 4, 2);
                    if (GameScr.Class86 != null) {
                        mGraphics.setColor(6425);
                        mGraphics.fillRect(n - 1, n2 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                        Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n2 + GameScr.Class192 / 2, 0, 3);
                        this.Class1(mGraphics, GameScr.Class86, n, n2);
                        if (GameScr.Class86.quantity > 1) {
                            mFont.Class18.Class1(mGraphics, String.valueOf(GameScr.Class86.quantity), n + GameScr.Class192, n2 + GameScr.Class192 / 2 + 6, 1);
                        }
                        mGraphics.setColor((GameScr.Class193 == 1) ? 16777215 : 12281361);
                        final mGraphics mGraphics3 = mGraphics;
                        final int n3 = n;
                        final int n4 = n2;
                        final int class181 = GameScr.Class192;
                        mGraphics3.Class2(n3, n4, class181, class181);
                    }
                    else {
                        mGraphics.setColor(6425);
                        mGraphics.fillRect(n - 1, n2 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                        Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n2 + GameScr.Class192 / 2, 0, 3);
                        mGraphics.setColor(12281361);
                        final mGraphics mGraphics4 = mGraphics;
                        final int n5 = n;
                        final int n6 = n2;
                        final int class182 = GameScr.Class192;
                        mGraphics4.Class2(n5, n6, class182, class182);
                    }
                    mFont.number_red.Class1(mGraphics, Game86.Class360, n + GameScr.Class192 / 2, n2 + 3 * GameScr.Class192 / 2 + 2, 2);
                    if (Char.getMyChar().xu < 5000) {
                        mFont.Class14.Class1(mGraphics, Game86.Class449, n + GameScr.Class192 / 2, GameScr.Class156 + GameScr.Class159 - 25, 2);
                        mFont.Class14.Class1(mGraphics, Game86.Class450, n + GameScr.Class192 / 2, GameScr.Class156 + GameScr.Class159 - 13, 2);
                    }
                    else {
                        mFont.number_red.Class1(mGraphics, Game86.Class449, n + GameScr.Class192 / 2, GameScr.Class156 + GameScr.Class159 - 25, 2);
                        mFont.number_red.Class1(mGraphics, Game86.Class450, n + GameScr.Class192 / 2, GameScr.Class156 + GameScr.Class159 - 13, 2);
                    }
                    this.Class262.Class1 = GameScr.Class157 + 40;
                    this.Class262.Class2 = GameScr.Class156 + 130;
                    this.Class262.Class1(mGraphics);
                    return;
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    return;
                }
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class180);
            }
        }
    }
    
    private void Class22(mGraphics mGraphics) {
        if (GameScr.Class231) {
            if (GameScr.indexMenu == 0) {
                final GameScr gameScr = this;
                final mGraphics mGraphics2 = mGraphics;
                final String[] class181 = Game86.Class181;
                mGraphics = mGraphics2;
                this = gameScr;
                try {
                    GameScr.Class401 = 3;
                    Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
                    Class1(mGraphics, class181[GameScr.indexMenu], class181.length > 1);
                    GameScr.Class394 = GameScr.Class157 + 3;
                    GameScr.Class395 = GameScr.Class156 + 34 + GameScr.Class192;
                    final int n = GameScr.Class157 + 45;
                    final int n2 = GameScr.Class157 + 100;
                    final int n3 = GameScr.Class395 - GameScr.Class192 - 3;
                    if (GameScr.Class80[0] != null) {
                        this.Class1(mGraphics, GameScr.Class80[0], n, n3);
                        mGraphics.setColor(12281361);
                        final mGraphics mGraphics3 = mGraphics;
                        final int n4 = n;
                        final int n5 = n3;
                        final int class182 = GameScr.Class192;
                        mGraphics3.Class2(n4, n5, class182, class182);
                        mFont.Class12.Class1(mGraphics, "(+" + GameScr.Class80[0].upgrade + ")", n - 5, n3 + GameScr.Class192 / 2 - 5, 1);
                    }
                    else {
                        mGraphics.setColor(6425);
                        mGraphics.fillRect(n - 1, n3 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                        Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n3 + GameScr.Class192 / 2, 0, 3);
                        mGraphics.setColor(12281361);
                        final mGraphics mGraphics4 = mGraphics;
                        final int n6 = n;
                        final int n7 = n3;
                        final int class183 = GameScr.Class192;
                        mGraphics4.Class2(n6, n7, class183, class183);
                    }
                    Game2.Class1(mGraphics, 942, n + 43, GameScr.Class395 - 15, 0, Game62.Class7);
                    if (GameScr.Class80[1] != null) {
                        final Item class184 = GameScr.Class80[1].Class1();
                        if (GameScr.Class80[0] != null && GameScr.Class80[0].template.type == class184.template.type && GameScr.Class80[1].template.level >= GameScr.Class80[0].template.level) {
                            class184.upgrade = GameScr.Class80[0].upgrade;
                        }
                        this.Class1(mGraphics, class184, n2, n3);
                        mGraphics.setColor(12281361);
                        final mGraphics mGraphics5 = mGraphics;
                        final int n8 = n2;
                        final int n9 = n3;
                        final int class185 = GameScr.Class192;
                        mGraphics5.Class2(n8, n9, class185, class185);
                        mFont.Class12.Class1(mGraphics, "(+" + class184.upgrade + ")", n2 + GameScr.Class192 + 10, n3 + GameScr.Class192 / 2 - 5, 0);
                    }
                    else {
                        mGraphics.setColor(6425);
                        mGraphics.fillRect(n2 - 1, n3 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                        Game2.Class1(mGraphics, 154, n2 + GameScr.Class192 / 2, n3 + GameScr.Class192 / 2, 0, 3);
                        mGraphics.setColor(12281361);
                        final mGraphics mGraphics6 = mGraphics;
                        final int n10 = n2;
                        final int n11 = n3;
                        final int class186 = GameScr.Class192;
                        mGraphics6.Class2(n10, n11, class186, class186);
                    }
                    if (GameScr.Class193 == 1) {
                        if (GameScr.indexSelect == 0) {
                            mGraphics.setColor(16777215);
                            final mGraphics mGraphics7 = mGraphics;
                            final int n12 = n;
                            final int n13 = n3;
                            final int class187 = GameScr.Class192;
                            mGraphics7.Class2(n12, n13, class187, class187);
                        }
                        if (GameScr.indexSelect == 1) {
                            mGraphics.setColor(16777215);
                            final mGraphics mGraphics8 = mGraphics;
                            final int n14 = n2;
                            final int n15 = n3;
                            final int class188 = GameScr.Class192;
                            mGraphics8.Class2(n14, n15, class188, class188);
                        }
                    }
                    mGraphics.setColor(0);
                    mGraphics.fillRect(GameScr.Class394 - 1, GameScr.Class395 - 1, GameScr.Class400 * GameScr.Class192 + 3, GameScr.Class401 * GameScr.Class192 + 3);
                    for (int i = 0; i < GameScr.Class401; ++i) {
                        for (int j = 0; j < GameScr.Class400; ++j) {
                            Game2.Class1(mGraphics, 154, GameScr.Class394 + j * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                            mGraphics.setColor(12281361);
                            final mGraphics mGraphics9 = mGraphics;
                            final int n16 = GameScr.Class394 + j * GameScr.Class192;
                            final int n17 = GameScr.Class395 + i * GameScr.Class192;
                            final int class189 = GameScr.Class192;
                            mGraphics9.Class2(n16, n17, class189, class189);
                        }
                    }
                    final Item item;
                    if ((item = GameScr.Class80[2]) != null) {
                        final int n18 = 0 / GameScr.Class400;
                        final int n19 = 0 - n18 * GameScr.Class400;
                        if (!item.Class7) {
                            mGraphics.setColor(12083);
                            mGraphics.fillRect(GameScr.Class394 + n19 * GameScr.Class192 + 1, GameScr.Class395 + n18 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                        }
                        Game2.Class1(mGraphics, item.template.Class7, GameScr.Class394 + n19 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n18 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    }
                    mFont.number_red.Class1(mGraphics, "- " + Game86.Class147[0], GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 10, 0);
                    mFont.number_red.Class1(mGraphics, "  " + Game86.Class147[1], GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 22, 0);
                    mFont.number_red.Class1(mGraphics, "- " + Game86.Class147[2], GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 34, 0);
                    if (GameScr.Class193 == 2) {
                        final int n20 = GameScr.indexSelect / GameScr.Class400;
                        final int n21 = GameScr.indexSelect - n20 * GameScr.Class400;
                        mGraphics.setColor(16777215);
                        final mGraphics mGraphics10 = mGraphics;
                        final int n22 = GameScr.Class394 + n21 * GameScr.Class192;
                        final int n23 = GameScr.Class395 + n20 * GameScr.Class192;
                        final int class190 = GameScr.Class192;
                        mGraphics10.Class2(n22, n23, class190, class190);
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class179);
            }
        }
    }
    
    private void Class23(final mGraphics mGraphics) {
        if (GameScr.Class235) {
            if (GameScr.indexMenu == 0) {
                this.Class2(mGraphics, Game86.Class186);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class186);
            }
        }
    }
    
    private void Class24(final mGraphics mGraphics) {
        if (GameScr.Class244) {
            if (GameScr.indexMenu == 0) {
                this.Class2(mGraphics, Game86.Class189);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class189);
            }
        }
    }
    
    private void Class25(final mGraphics mGraphics) {
        if (GameScr.Class243) {
            if (GameScr.indexMenu == 0) {
                this.Class2(mGraphics, Game86.Class190);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class190);
            }
        }
    }
    
    private void Class26(mGraphics mGraphics) {
        if (GameScr.isPaintTrade) {
            if (GameScr.indexMenu == 0) {
                final GameScr gameScr = this;
                final mGraphics mGraphics2 = mGraphics;
                final String[] class187 = Game86.Class187;
                mGraphics = mGraphics2;
                this = gameScr;
                try {
                    Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
                    Class1(mGraphics, class187[GameScr.indexMenu], class187.length > 1);
                    GameScr.Class394 = GameScr.Class157 + 3;
                    GameScr.Class395 = GameScr.Class156 + 45;
                    GameScr.Class401 = 4;
                    mFont.Class12.Class1(mGraphics, Char.getMyChar().cName, GameScr.Class394 + 1, GameScr.Class395 - 12, 0);
                    final int class188 = GameScr.Class394;
                    for (int i = 0; i < 3; ++i) {
                        if (i == this.typeTrade) {
                            mFont.Class10.Class1(mGraphics, String.valueOf(i + 1), class188 + 2 + i * 20, GameScr.Class395 + GameScr.Class401 * (GameScr.Class192 + 3) + 8, 0);
                        }
                        else {
                            mFont.Class13.Class1(mGraphics, String.valueOf(i + 1), class188 + 2 + i * 20, GameScr.Class395 + GameScr.Class401 * (GameScr.Class192 + 3) + 8, 0);
                        }
                        if (i < 2) {
                            Game2.Class1(mGraphics, 942, class188 + 14 + i * 20, GameScr.Class395 + GameScr.Class401 * (GameScr.Class192 + 3) + 13, 0, Game62.Class7);
                        }
                    }
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game20.Class1(String.valueOf(this.coinTrade))) + " " + Game86.Class287, GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 4, 0);
                    if (this.typeTrade == 0) {
                        mGraphics.setColor(0);
                    }
                    if (this.typeTrade == 1) {
                        mGraphics.setColor(210986);
                    }
                    if (this.typeTrade == 2) {
                        mGraphics.setColor(805690);
                    }
                    mGraphics.fillRect(GameScr.Class394 - 1, GameScr.Class395 - 1, GameScr.Class192 * 3 + 3, (GameScr.Class192 << 2) + 3);
                    for (int j = 0; j < GameScr.Class401; ++j) {
                        for (int k = 0; k < 3; ++k) {
                            Game2.Class1(mGraphics, 154, GameScr.Class394 + k * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + j * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                            mGraphics.setColor(12281361);
                            final mGraphics mGraphics3 = mGraphics;
                            final int n = GameScr.Class394 + k * GameScr.Class192;
                            final int n2 = GameScr.Class395 + j * GameScr.Class192;
                            final int class189 = GameScr.Class192;
                            mGraphics3.Class2(n, n2, class189, class189);
                        }
                    }
                    if (GameScr.Class193 == 1) {
                        final int n3 = GameScr.indexSelect / 3;
                        final int n4 = GameScr.indexSelect - n3 * 3;
                        mGraphics.setColor(16777215);
                        final mGraphics mGraphics4 = mGraphics;
                        final int n5 = GameScr.Class394 + n4 * GameScr.Class192;
                        final int n6 = GameScr.Class395 + n3 * GameScr.Class192;
                        final int class190 = GameScr.Class192;
                        mGraphics4.Class2(n5, n6, class190, class190);
                    }
                    if (GameScr.arrItemTradeMe != null) {
                        for (int l = 0; l < GameScr.arrItemTradeMe.length; ++l) {
                            final Item item;
                            if ((item = GameScr.arrItemTradeMe[l]) != null) {
                                final int n7 = l / 3;
                                final int n8 = l - n7 * 3;
                                if (!item.Class7) {
                                    mGraphics.setColor(12083);
                                    mGraphics.fillRect(GameScr.Class394 + n8 * GameScr.Class192 + 1, GameScr.Class395 + n7 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                                }
                                Game2.Class1(mGraphics, item.template.Class7, GameScr.Class394 + n8 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n7 * GameScr.Class192 + GameScr.Class192 / 2);
                                if (item.quantity > 1) {
                                    mFont.Class18.Class1(mGraphics, String.valueOf(item.quantity), GameScr.Class394 + n8 * GameScr.Class192 + GameScr.Class192, GameScr.Class395 + n7 * GameScr.Class192 + GameScr.Class192 - mFont.Class18.Class1, 1);
                                }
                                if (item.quantity > 1) {
                                    mFont.Class18.Class1(mGraphics, String.valueOf(item.quantity), GameScr.Class394 + n8 * GameScr.Class192 + GameScr.Class192, GameScr.Class395 + n7 * GameScr.Class192 + GameScr.Class192 - mFont.Class18.Class1, 1);
                                }
                            }
                        }
                    }
                    GameScr.Class394 = GameScr.Class157 + GameScr.Class158 - 2 - GameScr.Class192 * 3;
                    GameScr.Class401 = 4;
                    mFont.Class12.Class1(mGraphics, this.Class132, GameScr.Class157 + GameScr.Class158 - 2, GameScr.Class395 - 12, 1);
                    final int n9 = GameScr.Class157 + GameScr.Class158 - 3 - 60;
                    for (int n10 = 0; n10 < 3; ++n10) {
                        if (n10 == this.typeTradeOrder) {
                            mFont.Class10.Class1(mGraphics, String.valueOf(n10 + 1), n9 + 2 + n10 * 20, GameScr.Class395 + GameScr.Class401 * (GameScr.Class192 + 3) + 8, 0);
                        }
                        else {
                            mFont.Class13.Class1(mGraphics, String.valueOf(n10 + 1), n9 + 2 + n10 * 20, GameScr.Class395 + GameScr.Class401 * (GameScr.Class192 + 3) + 8, 0);
                        }
                        if (n10 < 2) {
                            Game2.Class1(mGraphics, 942, n9 + 14 + n10 * 20, GameScr.Class395 + GameScr.Class401 * (GameScr.Class192 + 3) + 13, 0, Game62.Class7);
                        }
                    }
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game20.Class1(String.valueOf(this.coinTradeOrder))) + " " + Game86.Class287, GameScr.Class157 + GameScr.Class158 - 2, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 4, 1);
                    if (this.typeTradeOrder == 0) {
                        mGraphics.setColor(0);
                    }
                    if (this.typeTradeOrder == 1) {
                        mGraphics.setColor(210986);
                    }
                    if (this.typeTradeOrder == 2) {
                        mGraphics.setColor(805690);
                    }
                    mGraphics.fillRect(GameScr.Class394 - 1, GameScr.Class395 - 1, GameScr.Class192 * 3 + 3, (GameScr.Class192 << 2) + 3);
                    for (int n11 = 0; n11 < GameScr.Class401; ++n11) {
                        for (int n12 = 0; n12 < 3; ++n12) {
                            Game2.Class1(mGraphics, 154, GameScr.Class394 + n12 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n11 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                            mGraphics.setColor(12281361);
                            final mGraphics mGraphics5 = mGraphics;
                            final int n13 = GameScr.Class394 + n12 * GameScr.Class192;
                            final int n14 = GameScr.Class395 + n11 * GameScr.Class192;
                            final int class191 = GameScr.Class192;
                            mGraphics5.Class2(n13, n14, class191, class191);
                        }
                    }
                    if (GameScr.Class193 == 2) {
                        final int n15 = GameScr.indexSelect / 3;
                        final int n16 = GameScr.indexSelect - n15 * 3;
                        mGraphics.setColor(16777215);
                        final mGraphics mGraphics6 = mGraphics;
                        final int n17 = GameScr.Class394 + n16 * GameScr.Class192;
                        final int n18 = GameScr.Class395 + n15 * GameScr.Class192;
                        final int class192 = GameScr.Class192;
                        mGraphics6.Class2(n17, n18, class192, class192);
                    }
                    if (GameScr.arrItemTradeOrder != null) {
                        for (int n19 = 0; n19 < GameScr.arrItemTradeOrder.length; ++n19) {
                            final Item item2;
                            if ((item2 = GameScr.arrItemTradeOrder[n19]) != null) {
                                final int n20 = n19 / 3;
                                final int n21 = n19 - n20 * 3;
                                if (!item2.Class7) {
                                    mGraphics.setColor(12083);
                                    mGraphics.fillRect(GameScr.Class394 + n21 * GameScr.Class192 + 1, GameScr.Class395 + n20 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                                }
                                Game2.Class1(mGraphics, item2.template.Class7, GameScr.Class394 + n21 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n20 * GameScr.Class192 + GameScr.Class192 / 2);
                                if (item2.quantity > 1) {
                                    mFont.Class18.Class1(mGraphics, String.valueOf(item2.quantity), GameScr.Class394 + n21 * GameScr.Class192 + GameScr.Class192, GameScr.Class395 + n20 * GameScr.Class192 + GameScr.Class192 - mFont.Class18.Class1, 1);
                                }
                                if (item2.quantity > 1) {
                                    mFont.Class18.Class1(mGraphics, String.valueOf(item2.quantity), GameScr.Class394 + n21 * GameScr.Class192 + GameScr.Class192, GameScr.Class395 + n20 * GameScr.Class192 + GameScr.Class192 - mFont.Class18.Class1, 1);
                                }
                            }
                        }
                    }
                    final int n22 = (int)(System.currentTimeMillis() / 1000L);
                    if (this.Class113 - n22 > 0 && this.typeTrade == 1 && this.typeTradeOrder == 1) {
                        mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class26) + " " + (this.Class113 - n22) + " " + Game86.Class311, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 13, 2);
                        return;
                    }
                    if (this.typeTrade == 0) {
                        mFont.number_red.Class1(mGraphics, Game86.Class156, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 13, 2);
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class187);
            }
        }
    }
    
    private void Class27(final mGraphics mGraphics) {
        if (GameScr.Class233) {
            if (GameScr.indexMenu == 0) {
                Class3(mGraphics, Game86.Class182);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class182);
            }
        }
    }
    
    private void Class28(final mGraphics mGraphics) {
        if (GameScr.Class242) {
            if (GameScr.indexMenu == 0) {
                Class3(mGraphics, Game86.Class188);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class188);
            }
        }
    }
    
    private void Class29(mGraphics mGraphics) {
        if (GameScr.Class234) {
            if (GameScr.indexMenu == 0) {
                final GameScr gameScr = this;
                final mGraphics mGraphics2 = mGraphics;
                final String[] class183 = Game86.Class183;
                mGraphics = mGraphics2;
                this = gameScr;
                try {
                    Class2(mGraphics);
                    Class1(mGraphics, class183, false);
                    if (Char.getMyChar().Class78 == null) {
                        GameCanvas.Class1(GameScr.Class157 + 90, GameScr.Class156 + 75, mGraphics);
                        mFont.Class7.Class1(mGraphics, Game86.Class25, GameScr.Class157 + 90, GameScr.Class156 + 90, 2);
                        return;
                    }
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class151) + ": " + Game20.Class1(String.valueOf(Char.getMyChar().Class68)), GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 18, 2);
                    this.Class1(mGraphics, Char.getMyChar().Class78);
                    return;
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    return;
                }
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class183);
            }
        }
    }
    
    private static void Class30(final mGraphics mGraphics) {
        if (GameScr.indexMenu != 2) {
            return;
        }
        mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
        Class1(mGraphics, Game86.Class163[GameScr.indexMenu], true);
        mFont.Class17.Class1(mGraphics, Game86.Class263, GameScr.Class157 + 10, GameScr.Class156 + 33, 0);
        mFont.Class17.Class1(mGraphics, new StringBuffer().append(Char.getMyChar().Class31).toString(), GameScr.Class157 + GameScr.Class158 - 10, GameScr.Class156 + 33, 1);
        final int n = (GameScr.Class159 - 80) / 5;
        for (int i = 0; i < Char.getMyChar().Class52.length; ++i) {
            mGraphics.setColor(Game25.Class4);
            if (GameScr.Class193 > 0 && GameScr.Class193 - 1 == i) {
                mGraphics.setColor(Game25.Class3);
                mGraphics.fillRect(GameScr.Class157 + 5, GameScr.Class156 + 52 + i * (n + 4), GameScr.Class158 - 10, n);
                mGraphics.setColor(Game25.Class5);
            }
            mGraphics.Class2(GameScr.Class157 + 5, GameScr.Class156 + 52 + i * (n + 4), GameScr.Class158 - 10, n);
            mFont.Class7.Class1(mGraphics, new StringBuffer().append(Char.getMyChar().Class52[i]).toString(), GameScr.Class157 + GameScr.Class158 - 10, GameScr.Class156 + 52 + (n - 10) / 2 + i * (n + 4), 1);
            mFont.Class7.Class1(mGraphics, Game86.Class255[i], GameScr.Class157 + 10, GameScr.Class156 + 52 + (n - 10) / 2 + i * (n + 4), 0);
        }
        if (GameScr.Class193 > 0) {
            switch (Char.getMyChar().nClass.classId) {
                case 0: {
                    mFont.Class16.Class1(mGraphics, Game86.Class395[0], GameScr.Class157 + 10, GameScr.Class156 + 52 + (n - 10) / 2 + 4 * (n + 4), 0);
                }
                case 1:
                case 3:
                case 5: {
                    mFont.Class16.Class1(mGraphics, Game86.Class396[GameScr.Class193 - 1], GameScr.Class157 + 10, GameScr.Class156 + 52 + (n - 10) / 2 + 4 * (n + 4), 0);
                }
                case 2:
                case 4:
                case 6: {
                    mFont.Class16.Class1(mGraphics, Game86.Class397[GameScr.Class193 - 1], GameScr.Class157 + 10, GameScr.Class156 + 52 + (n - 10) / 2 + 4 * (n + 4), 0);
                    break;
                }
            }
        }
    }
    
    public static Item getItemFocus(final int n) {
        try {
            if (GameScr.indexSelect < 0) {
                return null;
            }
            switch (n) {
                case 3: {
                    return Char.getMyChar().arrItemBag[GameScr.indexSelect];
                }
                case 4: {
                    return Char.getMyChar().Class78[GameScr.indexSelect];
                }
                case 5: {
                    return GameScr.Class97.arrItemBody[GameScr.indexSelect + GameScr.Class346];
                }
                case 20: {
                    if (GameScr.Class51.length > GameScr.indexSelect) {
                        return GameScr.Class51[GameScr.indexSelect];
                    }
                    return null;
                }
                case 21: {
                    if (GameScr.Class52.length > GameScr.indexSelect) {
                        return GameScr.Class52[GameScr.indexSelect];
                    }
                    return null;
                }
                case 22: {
                    if (GameScr.Class53.length > GameScr.indexSelect) {
                        return GameScr.Class53[GameScr.indexSelect];
                    }
                    return null;
                }
                case 23: {
                    if (GameScr.Class54.length > GameScr.indexSelect) {
                        return GameScr.Class54[GameScr.indexSelect];
                    }
                    return null;
                }
                case 24: {
                    if (GameScr.Class55.length > GameScr.indexSelect) {
                        return GameScr.Class55[GameScr.indexSelect];
                    }
                    return null;
                }
                case 25: {
                    if (GameScr.Class56.length > GameScr.indexSelect) {
                        return GameScr.Class56[GameScr.indexSelect];
                    }
                    return null;
                }
                case 26: {
                    if (GameScr.Class57.length > GameScr.indexSelect) {
                        return GameScr.Class57[GameScr.indexSelect];
                    }
                    return null;
                }
                case 27: {
                    if (GameScr.Class58.length > GameScr.indexSelect) {
                        return GameScr.Class58[GameScr.indexSelect];
                    }
                    return null;
                }
                case 28: {
                    if (GameScr.Class59.length > GameScr.indexSelect) {
                        return GameScr.Class59[GameScr.indexSelect];
                    }
                    return null;
                }
                case 29: {
                    if (GameScr.Class60.length > GameScr.indexSelect) {
                        return GameScr.Class60[GameScr.indexSelect];
                    }
                    return null;
                }
                case 16: {
                    if (GameScr.Class61.length > GameScr.indexSelect) {
                        return GameScr.Class61[GameScr.indexSelect];
                    }
                    return null;
                }
                case 17: {
                    if (GameScr.Class62.length > GameScr.indexSelect) {
                        return GameScr.Class62[GameScr.indexSelect];
                    }
                    return null;
                }
                case 18: {
                    if (GameScr.Class63.length > GameScr.indexSelect) {
                        return GameScr.Class63[GameScr.indexSelect];
                    }
                    return null;
                }
                case 19: {
                    if (GameScr.Class64.length > GameScr.indexSelect) {
                        return GameScr.Class64[GameScr.indexSelect];
                    }
                    return null;
                }
                case 2: {
                    if (GameScr.Class65.length > GameScr.indexSelect) {
                        return GameScr.Class65[GameScr.indexSelect];
                    }
                    return null;
                }
                case 6: {
                    if (GameScr.Class66.length > GameScr.indexSelect) {
                        return GameScr.Class66[GameScr.indexSelect];
                    }
                    return null;
                }
                case 7: {
                    if (GameScr.Class67.length > GameScr.indexSelect) {
                        return GameScr.Class67[GameScr.indexSelect];
                    }
                    return null;
                }
                case 8: {
                    if (GameScr.Class68.length > GameScr.indexSelect) {
                        return GameScr.Class68[GameScr.indexSelect];
                    }
                    return null;
                }
                case 9: {
                    if (GameScr.Class69.length > GameScr.indexSelect) {
                        return GameScr.Class69[GameScr.indexSelect];
                    }
                    return null;
                }
                case 14: {
                    if (GameScr.Class70.length > GameScr.indexSelect) {
                        return GameScr.Class70[GameScr.indexSelect];
                    }
                    return null;
                }
                case 35: {
                    if (GameScr.Class71.length > GameScr.indexSelect) {
                        return GameScr.Class71[GameScr.indexSelect];
                    }
                    return null;
                }
                case 15: {
                    if (GameScr.Class73.length > GameScr.indexSelect) {
                        return GameScr.Class73[GameScr.indexSelect];
                    }
                    return null;
                }
                case 51: {
                    if (GameScr.Class74.length > GameScr.indexSelect) {
                        return GameScr.Class74[GameScr.indexSelect];
                    }
                    return null;
                }
                case 32: {
                    if (GameScr.Class74.length > GameScr.indexSelect) {
                        return GameScr.Class74[GameScr.indexSelect];
                    }
                    return null;
                }
                case 11: {
                    return GameScr.Class75[GameScr.indexSelect];
                }
                case 43: {
                    return GameScr.Class75[GameScr.indexSelect];
                }
                case 44: {
                    return GameScr.Class77[GameScr.indexSelect];
                }
                case 45: {
                    return GameScr.Class77[GameScr.indexSelect];
                }
                case 10: {
                    return GameScr.Class76[GameScr.indexSelect];
                }
                case 34: {
                    if (GameScr.Class72.length > GameScr.indexSelect) {
                        return GameScr.Class72[GameScr.indexSelect];
                    }
                    return null;
                }
                case 46: {
                    return GameScr.Class77[GameScr.indexSelect];
                }
                case 47: {
                    return GameScr.Class76[GameScr.indexSelect];
                }
                case 48: {
                    return GameScr.Class77[GameScr.indexSelect];
                }
            }
        }
        catch (Exception ex) {}
        return null;
    }
    
    public static void Class30() {
        TileMap.Class4();
    }
    
    private static void Class1(final mGraphics mGraphics, String class163, final boolean b) {
        if (!GameScr.Class163.equals("")) {
            class163 = GameScr.Class163;
        }
        final int n = GameScr.Class9 / 2;
        mGraphics.setColor(Game25.Class3);
        mGraphics.Class2(n - mFont.Class17.Class1(class163) / 2 - 12, GameScr.Class156 + 4, mFont.Class17.Class1(class163) + 22, 24, 6, 6);
        if ((GameScr.Class193 == 0 || GameCanvas.Class6) && b) {
            Game2.Class1(mGraphics, 989, n - mFont.Class17.Class1(class163) / 2 - 15 - 7 - ((GameCanvas.gameTick % 8 <= 3) ? 2 : 0), GameScr.Class156 + 16, 2, Game62.Class7);
            Game2.Class1(mGraphics, 989, n + mFont.Class17.Class1(class163) / 2 + 15 + 5 + ((GameCanvas.gameTick % 8 <= 3) ? 2 : 0), GameScr.Class156 + 16, 0, Game62.Class7);
        }
        if (GameScr.Class193 == 0) {
            mGraphics.setColor(Game25.Class5);
        }
        else {
            mGraphics.setColor(Game25.Class4);
        }
        mGraphics.Class1(n - mFont.Class17.Class1(class163) / 2 - 12, GameScr.Class156 + 4, mFont.Class17.Class1(class163) + 22, 24, 6, 6);
        mFont.Class17.Class1(mGraphics, class163, n, GameScr.Class156 + 9, 2);
    }
    
    private void Class31(final mGraphics mGraphics) {
        if (!GameScr.isPaintZone) {
            return;
        }
        Class2(mGraphics);
        Class1(mGraphics, new String[] { Game86.Class341 }, false);
        mFont.Class12.Class1(mGraphics, TileMap.Class11, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 25, 2);
        if (GameScr.indexSelect >= 0 && GameScr.indexSelect < this.zones.length) {
            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class342) + ": " + this.zones[GameScr.indexSelect] + ", " + Game86.Class343 + ": " + this.Class254[GameScr.indexSelect], GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + GameScr.Class159 - 13, 2);
        }
        final int n = GameScr.indexSelect / this.Class252;
        final int n2 = GameScr.indexSelect % this.Class252;
        GameScr.Class401 = this.zones.length / this.Class252;
        if (this.zones.length % this.Class252 > 0) {
            ++GameScr.Class401;
        }
        if (GameScr.Class401 < 5) {
            GameScr.Class401 = 5;
        }
        GameScr.Class50.Class1(GameScr.Class401, GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class400 * GameScr.Class192 + 2, 5 * GameScr.Class192 + 2, true, 6);
        GameScr.Class50.Class1(mGraphics);
        int i = 0;
        for (int j = 0; j < GameScr.Class401; ++j) {
            for (int k = 0; k < this.Class252; ++k) {
                mGraphics.setColor(12281361);
                final int n3 = GameScr.Class394 + k * GameScr.Class192;
                final int n4 = GameScr.Class395 + j * GameScr.Class192;
                final int class192 = GameScr.Class192;
                mGraphics.Class2(n3, n4, class192, class192);
                if (i < this.zones.length) {
                    Game2.Class1(mGraphics, 154, GameScr.Class394 + k * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + j * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    if (this.zones[i] >= 20) {
                        mFont.Class3.Class1(mGraphics, String.valueOf(i), GameScr.Class394 + k * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + j * GameScr.Class192 + GameScr.Class192 / 2 - 4, 2);
                    }
                    else if (this.zones[i] >= 15) {
                        mFont.Class6.Class1(mGraphics, String.valueOf(i), GameScr.Class394 + k * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + j * GameScr.Class192 + GameScr.Class192 / 2 - 4, 2);
                    }
                    else {
                        mFont.Class7.Class1(mGraphics, String.valueOf(i), GameScr.Class394 + k * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + j * GameScr.Class192 + GameScr.Class192 / 2 - 4, 2);
                    }
                    ++i;
                }
            }
        }
        if (GameScr.indexSelect >= 0) {
            mGraphics.setColor(16777215);
            final int n5 = GameScr.Class394 + n2 * GameScr.Class192;
            final int n6 = GameScr.Class395 + n * GameScr.Class192;
            final int class193 = GameScr.Class192;
            mGraphics.Class2(n5, n6, class193, class193);
        }
    }
    
    private static void Class93() {
        int n = 0;
        int n2 = 0;
        boolean b = false;
        boolean b2 = false;
        for (int i = 0; i < GameScr.Class75.length; ++i) {
            if (GameScr.Class75[i] != null) {
                ++n;
                n2 += GameScr.Class99[GameScr.Class75[i].template.id];
                if (GameScr.Class75[i].template.id == 11) {
                    GameCanvas.Class35.Class1(Game86.Class321, null, new Command(Game86.CLOSE, 1), null);
                    GameCanvas.Class34 = GameCanvas.Class35;
                    return;
                }
            }
            if (GameScr.Class75[i] != null && GameScr.Class75[i].Class7) {
                b = true;
            }
            if (GameScr.Class75[i] != null && !GameScr.Class75[i].Class7) {
                b2 = true;
            }
        }
        if (n <= 1) {
            GameCanvas.Class35.Class1(Game86.Class317, null, new Command(Game86.CLOSE, 1), null);
            GameCanvas.Class34 = GameCanvas.Class35;
            return;
        }
        int n3;
        for (n3 = GameScr.Class99.length - 1; n3 >= 0 && n2 <= GameScr.Class99[n3]; --n3) {}
        if (n3 >= GameScr.Class99.length - 1) {
            n3 = GameScr.Class99.length - 2;
        }
        if (GameScr.Class197) {
            if (GameScr.Class103[n3 + 1] > Char.getMyChar().xu) {
                GameCanvas.Class35.Class1(Game86.Class323, null, new Command(Game86.CLOSE, 1), null);
                GameCanvas.Class34 = GameCanvas.Class35;
                return;
            }
            if (b) {
                GameCanvas.Class1(Game86.Class322, 88813, GameScr.Class75, 8882, null);
                return;
            }
            Service.gI().Class1(GameScr.Class75);
        }
        else {
            if (GameScr.Class103[n3 + 1] > Char.getMyChar().xu + Char.getMyChar().yen) {
                GameCanvas.Class35.Class1(Game86.Class323, null, new Command(Game86.CLOSE, 1), null);
                GameCanvas.Class34 = GameCanvas.Class35;
                return;
            }
            if (b2) {
                GameCanvas.Class1(Game86.Class322, 88814, GameScr.Class75, 8882, null);
                return;
            }
            Service.gI().Class2(GameScr.Class75);
        }
    }
    
    private static void Class94() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int id = 0;
        for (int i = 0; i < GameScr.Class75.length; ++i) {
            final Item item;
            if ((item = GameScr.Class75[i]) != null) {
                if (item.template.id == 455) {
                    ++n;
                }
                else if (item.template.id == 456) {
                    ++n2;
                }
                else if (item.template.type == 26) {
                    ++n3;
                    id = item.template.id;
                }
            }
        }
        if (n3 > 1) {
            GameCanvas.setText(Game86.Class481);
            return;
        }
        if (n > 9 || n2 > 9 || (id >= 10 && (n > 3 || n2 > 3))) {
            GameCanvas.setText(Game86.Class486);
            return;
        }
        if (n + n2 < 3) {
            GameCanvas.setText(Game86.Class485);
            return;
        }
        if ((id == 10 && n2 == 3) || (id == 11 && n == 3)) {
            GameCanvas.setText(Game86.Class482);
            return;
        }
        final Service gi = Service.gI();
        final Item[] class75 = GameScr.Class75;
        final Service service = gi;
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            message = new Message((byte)110);
            for (int j = 0; j < class75.length; ++j) {
                if (class75[j] != null && (class75[j].template.id == 10 || class75[j].template.id == 11)) {
                    message.Class3.writeByte(class75[j].indexUI);
                    break;
                }
            }
            for (int k = 0; k < class75.length; ++k) {
                if (class75[k] != null && (class75[k].template.id == 455 || class75[k].template.id == 456)) {
                    message.Class3.writeByte(class75[k].indexUI);
                }
            }
            service.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public static byte getTaskMapId() {
        if (Char.getMyChar().ctaskId >= GameScr.Class116.length) {
            return -3;
        }
        byte b;
        if (Char.getMyChar().taskMaint == null) {
            b = GameScr.Class117[Char.getMyChar().ctaskId][0];
        }
        else {
            b = GameScr.Class117[Char.getMyChar().ctaskId][Char.getMyChar().taskMaint.index + 1];
        }
        if (b == -1) {
            if (Char.getMyChar().nClass.classId == 0 && Char.getMyChar().ctaskId == 9) {
                b = -2;
            }
            else if (Char.getMyChar().nClass.classId == 0 || Char.getMyChar().nClass.classId == 1 || Char.getMyChar().nClass.classId == 2) {
                b = 1;
            }
            else if (Char.getMyChar().nClass.classId == 3 || Char.getMyChar().nClass.classId == 4) {
                b = 72;
            }
            else if (Char.getMyChar().nClass.classId == 5 || Char.getMyChar().nClass.classId == 6) {
                b = 27;
            }
        }
        return b;
    }
    
    public static byte getTaskNpcId() {
        try {
            if (Char.getMyChar().ctaskId >= GameScr.Class116.length) {
                return -3;
            }
            byte b;
            if (Char.getMyChar().taskMaint == null) {
                b = GameScr.Class116[Char.getMyChar().ctaskId][0];
            }
            else {
                b = GameScr.Class116[Char.getMyChar().ctaskId][Char.getMyChar().taskMaint.index + 1];
            }
            if (b == -1) {
                if (Char.getMyChar().nClass.classId == 0 && Char.getMyChar().ctaskId == 9) {
                    b = -2;
                }
                else if (Char.getMyChar().nClass.classId == 0 || Char.getMyChar().nClass.classId == 1 || Char.getMyChar().nClass.classId == 2) {
                    b = 9;
                }
                else if (Char.getMyChar().nClass.classId == 3 || Char.getMyChar().nClass.classId == 4) {
                    b = 10;
                }
                else if (Char.getMyChar().nClass.classId == 5 || Char.getMyChar().nClass.classId == 6) {
                    b = 11;
                }
            }
            return b;
        }
        catch (Exception ex) {
            return -1;
        }
    }
    
    private static void Class95() {
        int n = 0;
        for (int i = 0; i < GameScr.Class76.length; ++i) {
            if (GameScr.Class76[i] != null && GameScr.Class76[i].template.type == 26) {
                n += GameScr.Class99[GameScr.Class76[i].template.id];
            }
        }
        boolean b = false;
        boolean b2 = false;
        int n2 = 0;
        if (GameScr.Class84.Class18()) {
            if (GameScr.Class104[GameScr.Class84.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                b = true;
            }
            n2 = n * 100 / GameScr.Class100[GameScr.Class84.upgrade];
        }
        else if (GameScr.Class84.Class19()) {
            if (GameScr.Class105[GameScr.Class84.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                b = true;
            }
            n2 = n * 100 / GameScr.Class101[GameScr.Class84.upgrade];
        }
        else if (GameScr.Class84.Class20()) {
            if (GameScr.Class106[GameScr.Class84.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                b = true;
            }
            n2 = n * 100 / GameScr.Class102[GameScr.Class84.upgrade];
        }
        if (GameScr.Class232 && GameScr.Class108[GameScr.Class84.upgrade] > Char.getMyChar().luong) {
            b2 = true;
        }
        if (b) {
            InfoMe.addInfo(Game86.Class325, 15, mFont.Class14);
            return;
        }
        if (b2) {
            InfoMe.addInfo(Game86.Class324, 15, mFont.Class14);
            return;
        }
        if (n2 > 250) {
            GameCanvas.Class1(Game86.Class326, 88815, null, 8882, null);
            return;
        }
        Class33();
    }
    
    public static void Class33() {
        if (!GameScr.Class84.Class7) {
            GameCanvas.Class1(Game86.Class327, new Command(Game86.Class60, 11063), new Command(Game86.Class73, 1));
            return;
        }
        Service.gI().Class1(GameScr.Class84, GameScr.Class76, GameScr.Class232);
    }
    
    private static void Class96() {
        if (GameScr.Class245) {
            Service.gI().Class1((byte)1, null, GameScr.Class85, GameScr.Class77);
            return;
        }
        if (GameScr.Class243) {
            Service.gI().Class1(GameScr.Class85, GameScr.Class77);
            return;
        }
        if (GameScr.Class244) {
            Service.gI().Class2(GameScr.Class85, GameScr.Class77);
            return;
        }
        if (GameScr.Class85.upgrade == 0) {
            GameCanvas.Class35.Class1(Game86.Class328, null, new Command(Game86.CLOSE, 1), null);
            GameCanvas.Class34 = GameCanvas.Class35;
            return;
        }
        int n = -1;
        int n2 = 0;
        for (int i = 0; i < Char.getMyChar().arrItemBag.length; ++i) {
            if (Char.getMyChar().arrItemBag[i] == null) {
                ++n;
            }
        }
        for (int j = 0; j < GameScr.Class77.length; ++j) {
            if (GameScr.Class77[j] != null) {
                ++n2;
            }
        }
        if (n2 > n) {
            GameCanvas.Class35.Class1(Game86.Class329, null, new Command(Game86.CLOSE, 1), null);
            GameCanvas.Class34 = GameCanvas.Class35;
            return;
        }
        GameCanvas.Class1(Game86.Class330, new Command(Game86.Class60, 11087, GameScr.Class85), new Command(Game86.Class73, 1));
    }
    
    private void Class1(final Item item, final Command command) {
        this.Class1(3, item);
        if (command != null) {
            super.left = new Command(command.Class1, 11040);
        }
    }
    
    private void Class1(final int n, final Item class195) {
        if (class195 == null) {
            return;
        }
        this.Class195 = class195;
        GameScr.Class409 = 120;
        GameScr.Class410 = 120;
        if (GameCanvas.Class6 && !GameCanvas.Class8) {
            GameScr.Class410 += 18;
        }
        GameScr.Class92 = true;
        GameScr.Class196.Class1();
        GameScr.indexRow = 0;
        if (class195.Class6 == 0L) {
            if (GameScr.Class243 || GameScr.Class244 || GameScr.Class245 || GameScr.Class246 || GameScr.Class248 || GameScr.Class247) {
                Service.gI().requestItemInfo(class195.typeUI, class195.indexUI);
            }
            if (GameScr.Class241) {
                Service.gI().Class27(class195.Class3);
            }
            else if (GameScr.Class97.charID == Char.getMyChar().charID) {
                Service.gI().requestItemInfo(n, class195.indexUI);
            }
            else {
                Service.gI().Class4(GameScr.Class97.charID, class195.indexUI);
            }
        }
        if (n == 5) {
            Char.getMyChar().Class23();
        }
        if (!GameCanvas.Class6 || (GameCanvas.Class6 && GameCanvas.Class8) || (GameScr.Class93 && GameScr.indexMenu > 0 && GameScr.indexMenu < 4) || (GameScr.Class238 && GameScr.indexMenu == 0)) {
            super.center = this.Class413;
            super.right = null;
            super.left = null;
        }
        GameCanvas.Class8();
        GameCanvas.Class7();
    }
    
    public final void showAlert(final String textsTitle, final String s, final boolean b) {
        InfoDlg.hide();
        GameScr.isPaintAlert = true;
        this.isLockKey = true;
        GameScr.indexRow = 0;
        setPopupSize(175, 200);
        if (b) {
            GameScr.Class159 -= 60;
        }
        super.right = new Command(Game86.CLOSE, 3);
        final Command command = null;
        super.center = command;
        super.left = command;
        this.textsTitle = textsTitle;
        this.texts = mFont.Class9.Class1(s, GameScr.Class158 - 30);
    }
    
    public final void Class34() {
        GameScr.isPaintAlert = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        this.Class22();
    }
    
    public final void Class35() {
        GameScr.Class194 = this.texts.size();
        GameScr.Class50.Class1(GameScr.Class194, 12, GameScr.Class157, GameScr.Class395 + 12, GameScr.Class158, GameScr.Class159 - 42 - ((this.textsTitle != null) ? 10 : 0), true, 1);
        GameScr.indexRow = this.texts.size() - 1;
        GameScr.Class50.Class1(GameScr.indexRow * GameScr.Class50.Class8);
    }
    
    private void Class32(final mGraphics mGraphics) {
        if (this.texts == null || !GameScr.isPaintAlert) {
            return;
        }
        Class2(mGraphics);
        Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
        if (this.textsTitle != null) {
            Class1(mGraphics, this.textsTitle, GameScr.Class96);
        }
        GameScr.Class394 = GameScr.Class157 + 15;
        GameScr.Class395 = GameScr.Class156 + 15;
        if (this.textsTitle != null) {
            GameScr.Class395 += 10;
        }
        GameScr.Class194 = this.texts.size();
        GameScr.Class50.Class1(GameScr.Class194, 12, GameScr.Class157, GameScr.Class395 + 12, GameScr.Class158, GameScr.Class159 - 42 - ((this.textsTitle != null) ? 10 : 0), true, 1);
        GameScr.Class50.Class1(mGraphics);
        this.Class402 = GameScr.Class395;
        mFont mFont = mFont.number_red;
        String s;
        for (int n = 0; n < this.texts.size() && (s = (String)this.texts.elementAt(n)) != null && this.texts != null && mFont != null; ++n) {
            if (s.startsWith("c")) {
                if (s.startsWith("c0")) {
                    s = s.substring(2);
                    mFont = mFont.number_red;
                }
                else if (s.startsWith("c1")) {
                    s = s.substring(2);
                    mFont = mFont.Class6;
                }
                else if (s.startsWith("c2")) {
                    s = s.substring(2);
                    mFont = mFont.Class7;
                }
                else if (s.startsWith("c3")) {
                    s = s.substring(2);
                    mFont = mFont.Class12;
                }
                else if (s.startsWith("c4")) {
                    s = s.substring(2);
                    mFont = mFont.Class3;
                }
                else if (s.startsWith("c5")) {
                    s = s.substring(2);
                    mFont = mFont.Class14;
                }
                else if (s.startsWith("c6")) {
                    s = s.substring(2);
                    mFont = mFont.Class13;
                }
                else if (s.startsWith("c7")) {
                    s = s.substring(2);
                    mFont = mFont.Class4;
                }
                else if (s.startsWith("c8")) {
                    s = s.substring(2);
                    mFont = mFont.Class15;
                }
                else if (s.startsWith("c9")) {
                    s = s.substring(2);
                    mFont = mFont.Class16;
                }
            }
            mFont.Class1(mGraphics, s, GameScr.Class394 + 5, this.Class402 += 12, 0);
        }
        if (GameScr.indexRow >= 0) {
            Game2.Class1(mGraphics, 942, GameScr.Class394 - 5, GameScr.Class395 + 12 + 1 + GameScr.indexRow * 12, 0, Game62.Class2);
        }
    }
    
    private static void Class33(final mGraphics mGraphics) {
        if (GameScr.Class205) {
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, Game86.Class238, false);
            GameScr.Class394 = GameScr.Class157 + 5;
            GameScr.Class395 = GameScr.Class156 + 40;
            if (GameScr.Class33.size() == 0) {
                mFont.number_red.Class1(mGraphics, Game86.Class380, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + 40, 2);
            }
            else {
                mGraphics.setColor(6425);
                mGraphics.fillRect(GameScr.Class394 - 2, GameScr.Class395 - 2, GameScr.Class158 - 6, GameScr.Class192 * 5 + 8);
                Class2(mGraphics);
                GameScr.Class50.Class1(GameScr.Class33.size(), GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 4, true, 1);
                GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 6);
                GameScr.Class194 = GameScr.Class33.size();
                for (int i = 0; i < GameScr.Class33.size(); ++i) {
                    final Party party = (Party)GameScr.Class33.elementAt(i);
                    if (GameScr.indexRow == i) {
                        mGraphics.setColor(Game25.Class2);
                        mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                        mGraphics.setColor(16777215);
                        mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                    }
                    else {
                        mGraphics.setColor(Game25.Class1);
                        mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                        mGraphics.setColor(13932896);
                        mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                    }
                    Game2.Class1(mGraphics, 647, GameScr.Class394 + 12, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    mFont.number_red.Class1(mGraphics, String.valueOf(party.name) + " - " + Game86.Class126 + ": " + party.Class2 + " (" + party.Class7 + ")", GameScr.Class394 + 22, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 0);
                }
            }
            Class13(mGraphics);
        }
    }
    
    private static void Class34(final mGraphics mGraphics) {
        if (GameScr.Class204) {
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, Game86.Class237, false);
            GameScr.Class394 = GameScr.Class157 + 5;
            GameScr.Class395 = GameScr.Class156 + 40;
            if (GameScr.vParty.size() == 0) {
                mFont.number_red.Class1(mGraphics, Game86.Class378, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + 40, 2);
            }
            else {
                mGraphics.setColor(6425);
                mGraphics.fillRect(GameScr.Class394 - 2, GameScr.Class395 - 2, GameScr.Class158 - 6, GameScr.Class192 * 5 + 8);
                Class2(mGraphics);
                GameScr.Class50.Class1(GameScr.vParty.size(), GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 4, true, 1);
                GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 6);
                GameScr.Class194 = GameScr.vParty.size();
                for (int i = 0; i < GameScr.vParty.size(); ++i) {
                    final Party party = (Party)GameScr.vParty.elementAt(i);
                    if (GameScr.indexRow == i) {
                        mGraphics.setColor(Game25.Class2);
                        mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                        mGraphics.setColor(16777215);
                        mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                    }
                    else {
                        mGraphics.setColor(Game25.Class1);
                        mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                        mGraphics.setColor(13932896);
                        mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                    }
                    Game2.Class1(mGraphics, party.Class3, GameScr.Class394 + 12, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                    if (party.c == null) {
                        mFont.Class16.Class1(mGraphics, party.name, GameScr.Class394 + 22, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 0);
                    }
                    else if (i == 0) {
                        mFont.Class12.Class1(mGraphics, String.valueOf(party.name) + " - " + Game86.Class126 + ": " + party.c.Class22, GameScr.Class394 + 22, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 0);
                    }
                    else {
                        mFont.number_red.Class1(mGraphics, String.valueOf(party.name) + " - " + Game86.Class126 + ": " + party.c.Class22, GameScr.Class394 + 22, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 0);
                    }
                }
            }
            Class13(mGraphics);
        }
    }
    
    private static void Class35(final mGraphics mGraphics) {
        if (GameScr.Class241) {
            int class158 = GameScr.Class158;
            if (GameCanvas.Class9) {
                class158 = GameScr.Class158 / 2 + 20;
            }
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, Game86.Class457[GameScr.indexMenu], GameCanvas.Class6 || GameScr.Class193 == 0);
            mGraphics.setColor(6425);
            mGraphics.fillRect(GameScr.Class394 - 2, GameScr.Class395 - 2, class158 - 6, GameScr.Class192 * 5 + 4);
            if (GameScr.Class81 == null) {
                GameCanvas.Class1(GameScr.Class157 + 90, GameScr.Class156 + 75, mGraphics);
                mFont.Class7.Class1(mGraphics, Game86.Class25, GameScr.Class157 + 90, GameScr.Class156 + 90, 2);
                return;
            }
            final Game48[] class159 = GameScr.Class81;
            GameScr.Class394 = GameScr.Class157 + 5;
            GameScr.Class395 = GameScr.Class156 + 33;
            if (class159.length > 0) {
                GameScr.Class194 = class159.length;
                Class2(mGraphics);
                GameScr.Class50.Class1(GameScr.Class194, GameScr.Class192, GameScr.Class394, GameScr.Class395, class158 - 3, GameScr.Class192 * 5, true, 1);
                GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, class158 - 3, GameScr.Class192 * 5 + 2);
                for (int i = 0; i < class159.length; ++i) {
                    final Game48 game48;
                    if ((game48 = class159[i]) != null && game48.Class1 != null && game48.Class1.template != null) {
                        final int n = (int)(System.currentTimeMillis() / 1000L);
                        if (i * GameScr.Class192 >= GameScr.Class50.Class2 - GameScr.Class192 && i * GameScr.Class192 < GameScr.Class50.Class2 + (GameScr.Class192 * 5 + 4)) {
                            if (GameScr.indexSelect == i) {
                                mGraphics.setColor(Game25.Class2);
                                mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexSelect * GameScr.Class192 + 2, class158 - 15, GameScr.Class192 - 4);
                                mGraphics.setColor(16777215);
                                mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexSelect * GameScr.Class192 + 2, class158 - 15, GameScr.Class192 - 4);
                            }
                            else {
                                mGraphics.setColor(Game25.Class1);
                                mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, class158 - 15, GameScr.Class192 - 4);
                                mGraphics.setColor(13932896);
                                mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, class158 - 15, GameScr.Class192 - 4);
                            }
                            mGraphics.setColor(0);
                            mGraphics.fillRect(GameScr.Class394 + 4, GameScr.Class395 + i * GameScr.Class192 + 4, GameScr.Class192 - 1, GameScr.Class192 - 8);
                            mGraphics.setColor((GameScr.indexSelect == i) ? 16777215 : 12281361);
                            mGraphics.Class2(GameScr.Class394 + 4, GameScr.Class395 + i * GameScr.Class192 + 4, GameScr.Class192 - 1, GameScr.Class192 - 8);
                            Game2.Class1(mGraphics, game48.Class1.template.Class7, GameScr.Class394 + GameScr.Class192 / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                            if (game48.Class1.quantity > 1) {
                                mFont.Class18.Class1(mGraphics, String.valueOf(game48.Class1.quantity), GameScr.Class394 + GameScr.Class192, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 + 2, 1);
                            }
                            final int n2 = game48.Class3 - (n - game48.Class4);
                            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class453) + ": " + game48.Class5, GameScr.Class394 + GameScr.Class192 + 7, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - mFont.Class18.Class1 - 2, 0);
                            mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class70) + ": " + Game20.Class1(String.valueOf(game48.Class2)) + " " + Game86.Class287, GameScr.Class394 + GameScr.Class192 + 7, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - mFont.Class18.Class1 + 9, 0);
                            if (n2 < 60) {
                                mFont.Class15.Class1(mGraphics, Game86.Class455, GameScr.Class394 + class158 - 30, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - mFont.Class18.Class1 - 2, 2);
                                mFont.Class15.Class1(mGraphics, Game86.Class456, GameScr.Class394 + class158 - 30, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - mFont.Class18.Class1 + 9, 2);
                            }
                            else {
                                mFont.Class16.Class1(mGraphics, Game86.Class454, GameScr.Class394 + class158 - 30, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - mFont.Class18.Class1 - 2, 2);
                                mFont.Class16.Class1(mGraphics, Game20.Class2(n2), GameScr.Class394 + class158 - 30, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - mFont.Class18.Class1 + 9, 2);
                            }
                        }
                    }
                }
            }
            else {
                GameScr.Class194 = class159.length;
                mFont.number_red.Class1(mGraphics, Game86.Class379, GameScr.Class157 + class158 / 2, GameScr.Class156 + 40, 2);
            }
            Class13(mGraphics);
        }
    }
    
    private static void Class36(final mGraphics mGraphics) {
        if (GameScr.Class91 || GameScr.Class207) {
            final String s = GameScr.Class91 ? Game86.Class240[0] : Game86.Class240[1];
            final MyVector myVector = GameScr.Class91 ? GameScr.Class34 : GameScr.Class37;
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, s, false);
            if (myVector.size() > 0) {
                GameScr.Class394 = GameScr.Class157 + 5;
                GameScr.Class395 = GameScr.Class156 + 40;
                mGraphics.setColor(6425);
                mGraphics.fillRect(GameScr.Class394 - 2, GameScr.Class395 - 2, GameScr.Class158 - 6, GameScr.Class192 * 5 + 8);
                Class2(mGraphics);
                GameScr.Class50.Class1(myVector.size(), GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 4, true, 1);
                GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 6);
                GameScr.Class194 = myVector.size();
                int class194 = 0;
                for (int i = 0; i < myVector.size(); ++i) {
                    final Game80 game80 = (Game80)myVector.elementAt(i);
                    if (!GameScr.Class199 || game80.Class2 == 3) {
                        mFont mFont = mFont.Class13;
                        if (game80.Class2 == 1 || game80.Class2 == 2) {
                            mFont = mFont.Class16;
                        }
                        else if (game80.Class2 == 3) {
                            mFont = mFont.number_red;
                        }
                        else if (game80.Class2 == 4) {
                            mFont = mFont.Class14;
                        }
                        if (i * GameScr.Class192 >= GameScr.Class50.Class2 - GameScr.Class192 && i * GameScr.Class192 < GameScr.Class50.Class2 + (GameScr.Class192 * 5 + 8)) {
                            if (GameScr.indexRow == i) {
                                mGraphics.setColor(Game25.Class2);
                                mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                                mGraphics.setColor(16777215);
                                mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                            }
                            else {
                                mGraphics.setColor(Game25.Class1);
                                mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                                mGraphics.setColor(13932896);
                                mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                            }
                            if (game80.Class2 == 4) {
                                if (GameCanvas.gameTick % 10 > 7) {
                                    mFont.Class1(mGraphics, game80.Class1, GameScr.Class394 + 8, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 0);
                                }
                                else {
                                    mFont.Class12.Class1(mGraphics, game80.Class1, GameScr.Class394 + 8, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 0);
                                }
                                mFont.Class15.Class1(mGraphics, Game86.Class242, GameScr.Class394 + GameScr.Class158 - 15, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 1);
                            }
                            else {
                                mFont.Class1(mGraphics, game80.Class1, GameScr.Class394 + 8, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 6, 0);
                            }
                        }
                        ++class194;
                    }
                }
                GameScr.Class194 = class194;
                GameScr.Class50.Class1(class194, GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 5 + 4, true, 1);
            }
            else {
                mFont.number_red.Class1(mGraphics, GameScr.Class91 ? Game86.Class241 : Game86.Class257, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + 40, 2);
            }
            Class13(mGraphics);
        }
    }
    
    private void Class37(final mGraphics mGraphics) {
        if (GameScr.Class203) {
            GameScr.Class194 = 0;
            Class2(mGraphics);
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, Game86.Class230[GameScr.indexMenu], false);
            GameScr.Class394 = GameScr.Class157 + 10;
            GameScr.Class395 = GameScr.Class156 + 32;
            if (GameScr.indexMenu == 0) {
                int n = 0;
                GameScr.Class50.Class1(GameScr.Class194, 12, GameScr.Class157, GameScr.Class156 + 32, GameScr.Class158, GameScr.Class159 - 40, true, 1);
                GameScr.Class50.Class1(mGraphics);
                if (Char.getMyChar().taskMaint != null) {
                    for (int i = 0; i < Char.getMyChar().taskMaint.names.length; ++i) {
                        mFont.Class7.Class1(mGraphics, Char.getMyChar().taskMaint.names[i], GameScr.Class394, this.Class402 = GameScr.Class395, 0);
                        ++GameScr.Class194;
                    }
                    int n2 = 0;
                    for (int j = 0; j < Char.getMyChar().taskMaint.subNames.length; ++j) {
                        if (Char.getMyChar().taskMaint.subNames[j] != null) {
                            n2 = j;
                            final String string = "- " + Char.getMyChar().taskMaint.subNames[j];
                            if (Char.getMyChar().taskMaint.counts[j] != -1) {
                                if (Char.getMyChar().taskMaint.index == j) {
                                    final String string2 = String.valueOf(string) + " " + Char.getMyChar().taskMaint.count + "/" + Char.getMyChar().taskMaint.counts[j];
                                    if (Char.getMyChar().taskMaint.count == Char.getMyChar().taskMaint.counts[j]) {
                                        mFont.number_red.Class1(mGraphics, string2, GameScr.Class394 + 5, this.Class402 += 12, 0);
                                    }
                                    else {
                                        mFont mFont = mFont.Class13;
                                        if (n == 0) {
                                            n = 1;
                                            mFont = mFont.Class12;
                                        }
                                        mFont.Class1(mGraphics, string2, GameScr.Class394 + 5, this.Class402 += 12, 0);
                                    }
                                }
                                else if (Char.getMyChar().taskMaint.index > j) {
                                    mFont.number_red.Class1(mGraphics, String.valueOf(string) + " " + Char.getMyChar().taskMaint.counts[j] + "/" + Char.getMyChar().taskMaint.counts[j], GameScr.Class394 + 5, this.Class402 += 12, 0);
                                }
                                else {
                                    final String string3 = String.valueOf(string) + " 0/" + Char.getMyChar().taskMaint.counts[j];
                                    mFont mFont2 = mFont.Class13;
                                    if (n == 0) {
                                        n = 1;
                                        mFont2 = mFont.Class12;
                                    }
                                    mFont2.Class1(mGraphics, string3, GameScr.Class394 + 5, this.Class402 += 12, 0);
                                }
                            }
                            else if (Char.getMyChar().taskMaint.index > j) {
                                mFont.number_red.Class1(mGraphics, string, GameScr.Class394 + 5, this.Class402 += 12, 0);
                            }
                            else {
                                mFont mFont3 = mFont.Class13;
                                if (n == 0) {
                                    n = 1;
                                    mFont3 = mFont.Class12;
                                }
                                mFont3.Class1(mGraphics, string, GameScr.Class394 + 5, this.Class402 += 12, 0);
                            }
                            ++GameScr.Class194;
                        }
                        else if (Char.getMyChar().taskMaint.index <= j) {
                            final String string4 = "- " + Char.getMyChar().taskMaint.subNames[n2];
                            mFont mFont4 = mFont.Class13;
                            if (n == 0) {
                                n = 1;
                                mFont4 = mFont.Class12;
                            }
                            mFont4.Class1(mGraphics, string4, GameScr.Class394 + 5, this.Class402, 0);
                        }
                    }
                    this.Class402 += 5;
                    for (int k = 0; k < Char.getMyChar().taskMaint.details.length; ++k) {
                        mFont.number_red.Class1(mGraphics, Char.getMyChar().taskMaint.details[k], GameScr.Class394, this.Class402 += 12, 0);
                        ++GameScr.Class194;
                    }
                }
                else {
                    final byte taskMapId = getTaskMapId();
                    final byte taskNpcId = getTaskNpcId();
                    String s;
                    if (taskMapId == -3 || taskNpcId == -3) {
                        s = Game86.Class368[3];
                    }
                    else if (Char.getMyChar().taskMaint == null && Char.getMyChar().ctaskId == 9 && Char.getMyChar().nClass.classId == 0) {
                        s = Game86.Class370;
                    }
                    else {
                        if (taskNpcId < 0 || taskMapId < 0) {
                            return;
                        }
                        s = String.valueOf(Game86.Class368[0]) + Npc.arrtemplate[taskNpcId].name + Game86.Class368[1] + TileMap.mapNames[taskMapId] + Game86.Class368[2];
                    }
                    final String[] class2 = mFont.number_red.Class2(s, 150);
                    for (int l = 0; l < class2.length; ++l) {
                        if (l == 0) {
                            mFont.number_red.Class1(mGraphics, class2[l], GameScr.Class394 + 5, this.Class402 = GameScr.Class395, 0);
                        }
                        else {
                            mFont.number_red.Class1(mGraphics, class2[l], GameScr.Class394 + 5, this.Class402 += 12, 0);
                        }
                        ++GameScr.Class194;
                    }
                }
                if (GameScr.Class193 == 1 && GameScr.indexRow >= 0 && GameScr.Class194 > 0) {
                    Game2.Class1(mGraphics, 942, GameScr.Class394 - 8, GameScr.Class395 + 2 + GameScr.indexRow * 12, 0, Game62.Class2);
                }
                GameScr.Class50.Class1(GameScr.Class194, 12, GameScr.Class157, GameScr.Class156 + 32, GameScr.Class158, GameScr.Class159 - 44, true, 1);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class402 = GameScr.Class395 - 12;
                GameScr.Class50.Class1(Char.getMyChar().taskOrder.size(), 12, GameScr.Class157, GameScr.Class156 + 32, GameScr.Class158, GameScr.Class159 - 44, true, 1);
                GameScr.Class50.Class1(mGraphics);
                GameScr.Class194 = 0;
                for (int n3 = 0; n3 < Char.getMyChar().taskOrder.size(); ++n3) {
                    final TaskOrder taskOrder = (TaskOrder)Char.getMyChar().taskOrder.elementAt(n3);
                    mFont.Class7.Class1(mGraphics, taskOrder.name, GameScr.Class394 + 5, this.Class402 += 12, 0);
                    String s2 = "";
                    if (taskOrder.taskId == 0 || taskOrder.taskId == 3) {
                        s2 = String.valueOf(Game86.Class210) + " " + Mob.arrMobTemplate[taskOrder.killId].name;
                    }
                    else if (taskOrder.taskId == 1) {
                        s2 = String.valueOf(Game86.Class211) + " " + Mob.arrMobTemplate[taskOrder.killId].name;
                    }
                    else if (taskOrder.taskId == 2) {
                        s2 = Game86.Class459;
                    }
                    else if (taskOrder.taskId == 4) {
                        s2 = String.valueOf(Game86.Class212) + " " + Mob.arrMobTemplate[taskOrder.killId].name;
                    }
                    else if (taskOrder.taskId == 5) {
                        s2 = String.valueOf(Game86.Class213) + " " + Mob.arrMobTemplate[taskOrder.killId].name;
                    }
                    else if (taskOrder.taskId == 6) {
                        s2 = Game86.Class214;
                    }
                    if (taskOrder.taskId == 6) {
                        if (taskOrder.count == taskOrder.maxCount) {
                            mFont.number_red.Class1(mGraphics, s2, GameScr.Class394 + 5, this.Class402 += 12, 0);
                        }
                        else {
                            mFont.Class12.Class1(mGraphics, s2, GameScr.Class394 + 5, this.Class402 += 12, 0);
                        }
                    }
                    else if (taskOrder.count == taskOrder.maxCount) {
                        mFont.number_red.Class1(mGraphics, String.valueOf(s2) + " " + taskOrder.count + "/" + taskOrder.maxCount, GameScr.Class394 + 5, this.Class402 += 12, 0);
                    }
                    else {
                        mFont.Class12.Class1(mGraphics, String.valueOf(s2) + " " + taskOrder.count + "/" + taskOrder.maxCount, GameScr.Class394 + 5, this.Class402 += 12, 0);
                    }
                    GameScr.Class194 += 3;
                    GameScr.Class409 = GameScr.Class158 - 25;
                    this.Class1(mGraphics, mFont.number_red, taskOrder.description, GameScr.Class394 + 5, this.Class402 += 12, 0);
                    this.Class402 += 12;
                }
                if (this.Class140 > 0) {
                    mFont.number_red.Class1(mGraphics, Game86.Class5, GameScr.Class394 + 5, this.Class402 += 12, 0);
                    switch (this.Class140) {
                        case 1: {
                            mFont.number_red.Class1(mGraphics, Game86.Class6, GameScr.Class394 + 5, this.Class402 += 12, 0);
                            break;
                        }
                        case 2: {
                            mFont.number_red.Class1(mGraphics, Game86.Class7, GameScr.Class394 + 5, this.Class402 += 12, 0);
                            break;
                        }
                        case 3: {
                            mFont.number_red.Class1(mGraphics, Game86.Class8, GameScr.Class394 + 5, this.Class402 += 12, 0);
                            break;
                        }
                        case 4: {
                            mFont.number_red.Class1(mGraphics, Game86.Class9, GameScr.Class394 + 5, this.Class402 += 12, 0);
                            break;
                        }
                        case 5: {
                            mFont.number_red.Class1(mGraphics, Game86.Class10, GameScr.Class394 + 5, this.Class402 += 12, 0);
                            break;
                        }
                        case 6: {
                            mFont.number_red.Class1(mGraphics, Game86.Class11, GameScr.Class394 + 5, this.Class402 += 12, 0);
                            break;
                        }
                        case 7: {
                            mFont.number_red.Class1(mGraphics, Game86.Class12, GameScr.Class394 + 5, this.Class402 += 12, 0);
                            break;
                        }
                        case 8: {
                            mFont.number_red.Class1(mGraphics, Game86.Class13, GameScr.Class394 + 5, this.Class402 += 12, 0);
                            break;
                        }
                    }
                }
                if (GameScr.Class193 == 1 && GameScr.indexRow >= 0 && GameScr.Class194 > 0) {
                    Game2.Class1(mGraphics, 942, GameScr.Class394 - 8, GameScr.Class395 + 2 + GameScr.indexRow * 12, 0, Game62.Class2);
                }
                ++GameScr.Class194;
                GameScr.Class50.Class1(GameScr.Class194, 12, GameScr.Class157, GameScr.Class156 + 32, GameScr.Class158, GameScr.Class159 - 44, true, 1);
            }
        }
    }
    
    private static String[] Class1(final mFont mFont, final String s) {
        return mFont.Class2(s, GameScr.Class158 - 20);
    }
    
    private void Class1(final mGraphics mGraphics, mFont mFont, final String[] array, final int n, int n2) {
        final int n3 = n2;
        for (int i = 0; i < array.length; ++i) {
            String s;
            if ((s = array[i]).startsWith("c")) {
                if (s.startsWith("c0")) {
                    s = s.substring(2);
                    mFont = mFont.number_red;
                }
                else if (s.startsWith("c1")) {
                    s = s.substring(2);
                    mFont = mFont.Class12;
                }
                else if (s.startsWith("c2")) {
                    s = s.substring(2);
                    mFont = mFont.Class16;
                }
            }
            if (i == 0) {
                mFont.Class1(mGraphics, s, n, n2, 0);
            }
            else {
                if (i * GameScr.Class50.Class8 + n3 >= GameScr.Class50.Class2 - 12 && i * GameScr.Class50.Class8 < GameScr.Class50.Class2 + GameScr.Class159 - 44) {
                    final mFont mFont2 = mFont;
                    final String s2 = s;
                    n2 += 12;
                    mFont2.Class1(mGraphics, s2, n, n2, 0);
                }
                else {
                    n2 += 12;
                }
                this.Class402 += 12;
                ++GameScr.Class194;
            }
        }
    }
    
    private void Class1(final mGraphics mGraphics, final mFont mFont, final String s, final int n, int n2, final int n3) {
        final int n4 = (GameCanvas.Class6 && GameCanvas.Class25 >= 320) ? 20 : 10;
        final int n5 = n2;
        final String[] class2 = mFont.Class2(s, GameScr.Class409 - n4);
        for (int i = 0; i < class2.length; ++i) {
            if (i == 0) {
                mFont.Class1(mGraphics, class2[i], n, n2, n3);
            }
            else {
                if (i * GameScr.Class50.Class8 + n5 >= GameScr.Class50.Class2 - 12 && i * GameScr.Class50.Class8 < GameScr.Class50.Class2 + GameScr.Class159 - 44) {
                    final String s2 = class2[i];
                    n2 += 12;
                    mFont.Class1(mGraphics, s2, n, n2, n3);
                    this.Class402 += 12;
                }
                else {
                    n2 += 12;
                }
                ++GameScr.Class194;
            }
        }
    }
    
    private void Class2(final mGraphics mGraphics, final mFont mFont, final String s, final int n, int n2, int i) {
        final int n3 = n2;
        String[] class2;
        String s2;
        for (class2 = mFont.Class2(s, i), i = 0; i < class2.length; ++i) {
            if (i == 0) {
                mFont.Class1(mGraphics, class2[i], n, n2, 0);
            }
            else {
                if (i * GameScr.Class50.Class8 + n3 >= GameScr.Class50.Class2 - 12 && i * GameScr.Class50.Class8 < GameScr.Class50.Class2 + GameScr.Class159 - 44) {
                    s2 = class2[i];
                    n2 += 12;
                    mFont.Class1(mGraphics, s2, n, n2, 0);
                    this.Class402 += 12;
                }
                else {
                    n2 += 12;
                }
                ++GameScr.Class194;
            }
        }
    }
    
    private void Class38(final mGraphics mGraphics) {
        if (GameCanvas.Class9 && !Class86() && (Class85() || Class83() || Class27())) {
            Class97();
            Class39(mGraphics);
            Class2(mGraphics);
            this.Class1(mGraphics, mFont.number_red, Game86.Class121, GameScr.Class407 + GameScr.Class409 / 2, GameScr.Class408 + GameScr.Class410 / 2 - 20, 2);
        }
        if (!GameScr.Class92 || this.Class195 == null || this.Class195.template == null) {
            return;
        }
        Item item = this.Class195;
        if (GameScr.Class198 && !this.Class195.Class16() && GameScr.indexMenu == 0) {
            item = this.Class195.Class1(this.Class195.upgrade + 1);
        }
        if (GameScr.Class231 && GameScr.indexMenu == 0 && GameScr.Class193 == 1 && item.Class2() && item.upgrade == 0 && GameScr.Class80[0] != null && GameScr.Class80[0].template.type == GameScr.Class80[1].template.type && GameScr.Class80[1].template.level >= GameScr.Class80[0].template.level) {
            item = this.Class195.Class1(GameScr.Class80[0].upgrade);
        }
        Class2(mGraphics);
        if (item.Class6 != 0L && item.options != null && item.options.size() > 0) {
            for (int i = 0; i < item.options.size(); ++i) {
                final int class409;
                if ((class409 = ((ItemOption)item.options.elementAt(i)).Class1().length() * 5) > GameScr.Class409 && !GameCanvas.Class9) {
                    GameScr.Class409 = class409;
                }
            }
        }
        final int class410;
        if ((class410 = mFont.Class7.Class1(item.template.name) + 10) > GameScr.Class409 && !GameCanvas.Class9) {
            GameScr.Class409 = class410;
        }
        if (GameScr.Class409 > GameCanvas.Class25 - 4) {
            GameScr.Class409 = GameCanvas.Class25 - 4;
        }
        if (GameScr.Class410 > GameCanvas.Class26 - 4) {
            GameScr.Class409 = GameCanvas.Class26 - 4;
        }
        GameScr.Class407 = GameScr.Class9 / 2 - GameScr.Class409 / 2;
        GameScr.Class408 = GameScr.Class10 / 2 - GameScr.Class410 / 2;
        Class97();
        if (GameScr.Class407 < 2) {
            GameScr.Class407 = 2;
        }
        if (GameScr.Class408 < 2) {
            GameScr.Class408 = 2;
        }
        Class39(mGraphics);
        if (!GameScr.Class238 || GameScr.indexMenu != 0) {
            GameScr.Class196.Class1(mGraphics, GameScr.Class407, GameScr.Class408 + 2, GameScr.Class409, GameScr.Class410 - 2);
            GameScr.Class194 = 3;
            this.Class402 = GameScr.Class408 + 3;
            mFont mFont = mFont.Class7;
            if (item.Class3()) {
                if (item.Class8 > 0 && item.Class8 < 4) {
                    mFont = mFont.Class4;
                }
                else if (item.Class8 >= 4 && item.Class8 < 8) {
                    mFont = mFont.Class8;
                }
                else if (item.Class8 >= 8 && item.Class8 < 12) {
                    mFont = mFont.Class6;
                }
                else if (item.Class8 >= 12 && item.Class8 < 15) {
                    mFont = mFont.Class5;
                }
                else if (item.Class8 >= 15) {
                    mFont = mFont.Class3;
                }
            }
            else if (item.upgrade > 0 && item.upgrade < 4) {
                mFont = mFont.Class4;
            }
            else if (item.upgrade >= 4 && item.upgrade < 8) {
                mFont = mFont.Class8;
            }
            else if (item.upgrade >= 8 && item.upgrade < 12) {
                mFont = mFont.Class6;
            }
            else if (item.upgrade >= 12 && item.upgrade < 15) {
                mFont = mFont.Class5;
            }
            else if (item.upgrade >= 15) {
                mFont = mFont.Class3;
            }
            if (item.Class18 != null) {
                mGraphics.Class1(item.Class18, 0, 0, mGraphics.Class1(item.Class18), mGraphics.Class2(item.Class18), 0, GameScr.Class407 + GameScr.Class409 / 2, this.Class402 + GameScr.Class410 - 10, 33);
            }
            if (item.Class3()) {
                this.Class1(mGraphics, mFont, String.valueOf(item.template.name) + " + " + (item.Class8 + 1), GameScr.Class407 + 8, this.Class402, 0);
            }
            else {
                this.Class1(mGraphics, mFont, String.valueOf(item.template.name) + ((item.upgrade > 0) ? (" +" + item.upgrade) : ""), GameScr.Class407 + 8, this.Class402, 0);
            }
            if (item.upgrade >= 15 && !GameScr.Class201 && !item.Class3()) {
                if (mFont.Class2(String.valueOf(item.template.name) + ((item.upgrade > 0) ? (" +" + item.upgrade) : ""), GameScr.Class409 - ((GameCanvas.Class6 && GameCanvas.Class25 >= 320) ? 20 : 10)).length > 1) {
                    this.Class402 -= 12;
                }
                if (item.Class3()) {
                    this.Class1(mGraphics, mFont.Class7, item.template.name, GameScr.Class407 + 8, this.Class402, 0);
                }
                else {
                    this.Class1(mGraphics, mFont.Class7, String.valueOf(item.template.name) + ((item.upgrade > 0) ? (" +" + item.upgrade) : ""), GameScr.Class407 + 8, this.Class402, 0);
                }
            }
            if (item.Class2()) {
                this.Class402 += 12;
                ++GameScr.Class194;
                if (GameScr.Class201 && GameCanvas.gameTick % 5 == 0) {
                    GameScr.Class201 = !GameScr.Class201;
                }
                else if (!GameScr.Class201 && GameCanvas.gameTick % 5 == 0) {
                    GameScr.Class201 = !GameScr.Class201;
                }
                final int n = item.upgrade / 2 + 1;
                if (item.upgrade == 0) {
                    for (int j = 0; j < n; ++j) {
                        Game2.Class1(mGraphics, 633, GameScr.Class407 + 12 + j * 10, this.Class402 + 5, 0, Game62.Class7);
                    }
                }
                else if (item.upgrade > 0 && item.upgrade < 4) {
                    for (int k = 0; k < n; ++k) {
                        Game2.Class1(mGraphics, 625, GameScr.Class407 + 12 + k * 10, this.Class402 + 5, 0, Game62.Class7);
                    }
                    if (item.upgrade == 3) {
                        Game2.Class1(mGraphics, 635, GameScr.Class407 + 12 + n * 10, this.Class402 + 5, 0, Game62.Class7);
                    }
                }
                else if (item.upgrade >= 4 && item.upgrade < 8) {
                    for (int l = 0; l < n; ++l) {
                        Game2.Class1(mGraphics, 626, GameScr.Class407 + 12 + l * 10, this.Class402 + 5, 0, Game62.Class7);
                    }
                    if (item.upgrade % 2 != 0) {
                        Game2.Class1(mGraphics, 636, GameScr.Class407 + 12 + n * 10, this.Class402 + 5, 0, Game62.Class7);
                    }
                }
                else if (item.upgrade >= 8 && item.upgrade < 12) {
                    for (int n2 = 0; n2 < n; ++n2) {
                        if (GameScr.Class201) {
                            Game2.Class1(mGraphics, 627, GameScr.Class407 + 12 + n2 * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                        else {
                            Game2.Class1(mGraphics, 628, GameScr.Class407 + 12 + n2 * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                    }
                    if (item.upgrade % 2 != 0) {
                        if (GameScr.Class201) {
                            Game2.Class1(mGraphics, 637, GameScr.Class407 + 12 + n * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                        else {
                            Game2.Class1(mGraphics, 638, GameScr.Class407 + 12 + n * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                    }
                }
                else if (item.upgrade >= 12 && item.upgrade < 15) {
                    for (int n3 = 0; n3 < n; ++n3) {
                        if (GameScr.Class201) {
                            Game2.Class1(mGraphics, 629, GameScr.Class407 + 12 + n3 * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                        else {
                            Game2.Class1(mGraphics, 630, GameScr.Class407 + 12 + n3 * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                    }
                    if (item.upgrade % 2 != 0) {
                        if (GameScr.Class201) {
                            Game2.Class1(mGraphics, 639, GameScr.Class407 + 12 + n * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                        else {
                            Game2.Class1(mGraphics, 640, GameScr.Class407 + 12 + n * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                    }
                }
                else {
                    for (int n4 = 0; n4 < n; ++n4) {
                        if (GameScr.Class201) {
                            Game2.Class1(mGraphics, 631, GameScr.Class407 + 12 + n4 * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                        else {
                            Game2.Class1(mGraphics, 632, GameScr.Class407 + 12 + n4 * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                    }
                    if (item.upgrade % 2 != 0) {
                        if (GameScr.Class201) {
                            Game2.Class1(mGraphics, 641, GameScr.Class407 + 12 + n * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                        else {
                            Game2.Class1(mGraphics, 642, GameScr.Class407 + 12 + n * 10, this.Class402 + 5, 0, Game62.Class7);
                        }
                    }
                }
            }
            else if (item.Class3()) {
                this.Class402 += 12;
                for (int n5 = item.Class8 + 1, n6 = 0; n6 < n5; ++n6) {
                    Game2.Class1(mGraphics, 633, GameScr.Class407 + 12 + n6 * 10, this.Class402 + 5, 0, Game62.Class7);
                }
            }
            mFont.number_red.Class1(mGraphics, item.Class7 ? Game86.Class209 : Game86.Class215, GameScr.Class407 + 8, this.Class402 += 12, 0);
            if (item.Class2() || item.Class3()) {
                final Item item2;
                String s2;
                final String s = ((item2 = item).template.type == 12) ? (s2 = Game86.Class144) : ((item2.template.level < 10 || item2.template.type >= 10) ? (s2 = Game86.Class143) : ((item2.upgrade == 0) ? (s2 = Game86.Class142) : (s2 = null)));
                final String s3 = s2;
                if (s != null) {
                    this.Class1(mGraphics, mFont.number_red, s3, GameScr.Class407 + 8, this.Class402 += 12, 0);
                    ++GameScr.Class194;
                }
            }
            if (item.template.Class3 == 0 || item.template.Class3 == 1) {
                if (item.template.Class3 == Char.getMyChar().cgender) {
                    mFont.number_red.Class1(mGraphics, Game86.Class340[item.template.Class3], GameScr.Class407 + 8, this.Class402 += 12, 0);
                    ++GameScr.Class194;
                }
                else {
                    mFont.Class14.Class1(mGraphics, Game86.Class340[item.template.Class3], GameScr.Class407 + 8, this.Class402 += 12, 0);
                    ++GameScr.Class194;
                }
            }
            if (Char.getMyChar().Class22 != -1) {
                if (Char.getMyChar().Class22 >= item.template.level) {
                    this.Class1(mGraphics, mFont.number_red, String.valueOf(Game86.Class228) + " " + item.template.level, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                else {
                    this.Class1(mGraphics, mFont.Class14, String.valueOf(Game86.Class228) + " " + item.template.level, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
            }
            if ((item.template.id >= 40 && item.template.id <= 48) || item.template.id == 311 || item.template.id == 375 || item.template.id == 397 || item.template.id == 552 || item.template.id == 558) {
                if (Char.getMyChar().nClass.classId == 1) {
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[1].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                else {
                    mFont.Class14.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[1].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                ++GameScr.Class194;
            }
            else if ((item.template.id >= 49 && item.template.id <= 57) || item.template.id == 312 || item.template.id == 376 || item.template.id == 398 || item.template.id == 553 || item.template.id == 559) {
                if (Char.getMyChar().nClass.classId == 2) {
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[2].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                else {
                    mFont.Class14.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[2].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                ++GameScr.Class194;
            }
            else if ((item.template.id >= 58 && item.template.id <= 66) || item.template.id == 313 || item.template.id == 377 || item.template.id == 399 || item.template.id == 554 || item.template.id == 560) {
                if (Char.getMyChar().nClass.classId == 3) {
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[3].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                else {
                    mFont.Class14.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[3].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                ++GameScr.Class194;
            }
            else if ((item.template.id >= 67 && item.template.id <= 75) || item.template.id == 314 || item.template.id == 378 || item.template.id == 400 || item.template.id == 555 || item.template.id == 561) {
                if (Char.getMyChar().nClass.classId == 4) {
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[4].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                else {
                    mFont.Class14.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[4].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                ++GameScr.Class194;
            }
            else if ((item.template.id >= 76 && item.template.id <= 84) || item.template.id == 315 || item.template.id == 379 || item.template.id == 401 || item.template.id == 556 || item.template.id == 562) {
                if (Char.getMyChar().nClass.classId == 5) {
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[5].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                else {
                    mFont.Class14.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[5].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                ++GameScr.Class194;
            }
            else if ((item.template.id >= 85 && item.template.id <= 93) || item.template.id == 316 || item.template.id == 380 || item.template.id == 402 || item.template.id == 557 || item.template.id == 563) {
                if (Char.getMyChar().nClass.classId == 6) {
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[6].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                else {
                    mFont.Class14.Class1(mGraphics, String.valueOf(Game86.Class229) + " " + GameScr.Class43[6].Class2, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                ++GameScr.Class194;
            }
            if (!item.Class3()) {
                if (item.template.id == 420) {
                    if (Char.getMyChar().nClass.classId == 1 || Char.getMyChar().nClass.classId == 2) {
                        mFont.number_red.Class1(mGraphics, Game86.Class298[1], GameScr.Class407 + 8, this.Class402 += 12, 0);
                    }
                    else {
                        mFont.Class14.Class1(mGraphics, Game86.Class298[1], GameScr.Class407 + 8, this.Class402 += 12, 0);
                    }
                    ++GameScr.Class194;
                }
                else if (item.template.id == 421) {
                    if (Char.getMyChar().nClass.classId == 3 || Char.getMyChar().nClass.classId == 4) {
                        mFont.number_red.Class1(mGraphics, Game86.Class298[2], GameScr.Class407 + 8, this.Class402 += 12, 0);
                    }
                    else {
                        mFont.Class14.Class1(mGraphics, Game86.Class298[2], GameScr.Class407 + 8, this.Class402 += 12, 0);
                    }
                    ++GameScr.Class194;
                }
                else if (item.template.id == 422) {
                    if (Char.getMyChar().nClass.classId == 5 || Char.getMyChar().nClass.classId == 6) {
                        mFont.number_red.Class1(mGraphics, Game86.Class298[3], GameScr.Class407 + 8, this.Class402 += 12, 0);
                    }
                    else {
                        mFont.Class14.Class1(mGraphics, Game86.Class298[3], GameScr.Class407 + 8, this.Class402 += 12, 0);
                    }
                    ++GameScr.Class194;
                }
            }
            if (item.Class6 > 0L) {
                if (item.Class10() || item.Class11() || item.Class12() || item.Class13() || item.Class14() || item.Class15() || item.typeUI == 39) {
                    final int class411;
                    if ((class411 = mFont.Class9.Class1(String.valueOf(Game86.Class216) + ": " + item.Class6()) + 10) > GameScr.Class409 && !GameCanvas.Class9) {
                        GameScr.Class409 = class411;
                    }
                    this.Class1(mGraphics, mFont.Class12, String.valueOf(Game86.Class216) + ": " + item.Class6(), GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                else {
                    final int class412;
                    if ((class412 = mFont.Class9.Class1(String.valueOf(Game86.Class216) + ": " + item.Class5()) + 10) > GameScr.Class409 && !GameCanvas.Class9) {
                        GameScr.Class409 = class412;
                    }
                    this.Class1(mGraphics, mFont.Class12, String.valueOf(Game86.Class216) + ": " + item.Class5(), GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                ++GameScr.Class194;
            }
            if (!item.template.description.equals("")) {
                this.Class1(mGraphics, mFont.number_red, item.template.description, GameScr.Class407 + 8, this.Class402 += 12, 0);
                ++GameScr.Class194;
            }
            if (item.Class8() || item.typeUI == 37) {
                mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class217, Game20.Class1(String.valueOf(item.saleCoinLock))), GameScr.Class407 + 8, this.Class402 += 12, 0);
                ++GameScr.Class194;
            }
            else if (item.Class10() || item.Class11() || item.Class12() || item.Class13() || item.Class14() || item.Class15()) {
                if (item.Class10 > 0) {
                    if (item.Class15()) {
                        final int class413;
                        if ((class413 = mFont.Class9.Class1(Game86.Class1(Game86.Class219, Game20.Class1(String.valueOf(item.Class10)))) + 10) > GameScr.Class409 && !GameCanvas.Class9) {
                            GameScr.Class409 = class413;
                        }
                        mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class219, Game20.Class1(String.valueOf(item.Class10))), GameScr.Class407 + 8, this.Class402 += 12, 0);
                    }
                    else {
                        mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class218, Game20.Class1(String.valueOf(item.Class10))), GameScr.Class407 + 8, this.Class402 += 12, 0);
                    }
                    ++GameScr.Class194;
                }
                else if (item.Class11 > 0) {
                    mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class220, Game20.Class1(String.valueOf(item.Class11))), GameScr.Class407 + 8, this.Class402 += 12, 0);
                    ++GameScr.Class194;
                }
                else if (item.Class12 > 0) {
                    mFont.Class12.Class1(mGraphics, Game86.Class1(Game86.Class221, Game20.Class1(String.valueOf(item.Class12))), GameScr.Class407 + 8, this.Class402 += 12, 0);
                    ++GameScr.Class194;
                }
            }
            if (item.template.type == 33) {
                mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class125) + ": " + (item.upgrade + 1), GameScr.Class407 + 8, this.Class402 += 12, 0);
                ++GameScr.Class194;
            }
            if (item.Class2() && item.Class8 != 0) {
                mFont.Class10.Class1(mGraphics, Game86.Class298[item.Class8], GameScr.Class407 + 8, this.Class402 += 12, 0);
                ++GameScr.Class194;
            }
            if (item.Class6 != 0L && item.options != null && item.options.size() > 0) {
                int n7 = 0;
                int n8 = 0;
                for (int n9 = 0; n9 < item.options.size(); ++n9) {
                    final ItemOption itemOption = (ItemOption)item.options.elementAt(n9);
                    if (n7 == 0 && itemOption.optionTemplate.type == 2) {
                        n7 = 1;
                        String s4 = String.valueOf(Game86.Class353[0]) + ": ";
                        if (item.template.type == 1) {
                            s4 = String.valueOf(s4) + Game86.Class352[item.template.type] + "(" + Game86.Class354[this.Class195.Class8] + ")";
                        }
                        else if (item.template.type == 0) {
                            s4 = String.valueOf(s4) + Game86.Class352[6] + "(" + Game86.Class354[this.Class195.Class8] + "), " + Game86.Class352[5] + "(" + Game86.Class354[this.Class195.Class8] + ")";
                        }
                        else if (item.template.type == 6) {
                            s4 = String.valueOf(s4) + Game86.Class352[0] + "(" + Game86.Class354[this.Class195.Class8] + "), " + Game86.Class352[5] + "(" + Game86.Class354[this.Class195.Class8] + ")";
                        }
                        else if (item.template.type == 5) {
                            s4 = String.valueOf(s4) + Game86.Class352[0] + "(" + Game86.Class354[this.Class195.Class8] + "), " + Game86.Class352[6] + "(" + Game86.Class354[this.Class195.Class8] + ")";
                        }
                        else if (item.template.type == 2) {
                            s4 = String.valueOf(s4) + Game86.Class352[8] + "(" + Game86.Class354[this.Class195.Class8] + "), " + Game86.Class352[7] + "(" + Game86.Class354[this.Class195.Class8] + ")";
                        }
                        else if (item.template.type == 8) {
                            s4 = String.valueOf(s4) + Game86.Class352[2] + "(" + Game86.Class354[this.Class195.Class8] + "), " + Game86.Class352[7] + "(" + Game86.Class354[this.Class195.Class8] + ")";
                        }
                        else if (item.template.type == 7) {
                            s4 = String.valueOf(s4) + Game86.Class352[2] + "(" + Game86.Class354[this.Class195.Class8] + "), " + Game86.Class352[8] + "(" + Game86.Class354[this.Class195.Class8] + ")";
                        }
                        else if (item.template.type == 4) {
                            s4 = String.valueOf(s4) + Game86.Class352[3] + "(" + Game86.Class354[this.Class195.Class8] + "), " + Game86.Class352[9] + "(" + Game86.Class354[this.Class195.Class8] + ")";
                        }
                        else if (item.template.type == 3) {
                            s4 = String.valueOf(s4) + Game86.Class352[4] + "(" + Game86.Class354[this.Class195.Class8] + "), " + Game86.Class352[9] + "(" + Game86.Class354[this.Class195.Class8] + ")";
                        }
                        else if (item.template.type == 9) {
                            s4 = String.valueOf(s4) + Game86.Class352[4] + "(" + Game86.Class354[this.Class195.Class8] + "), " + Game86.Class352[3] + "(" + Game86.Class354[this.Class195.Class8] + ")";
                        }
                        final int class414;
                        if ((class414 = mFont.number_red.Class1(s4) + 15) > GameScr.Class409 && !GameCanvas.Class9) {
                            GameScr.Class409 = class414;
                        }
                        this.Class1(mGraphics, mFont.number_red, s4, GameScr.Class407 + 8, this.Class402 += 12, 0);
                        ++GameScr.Class194;
                    }
                    if (n8 == 0 && itemOption.optionTemplate.type > 2 && itemOption.optionTemplate.type < 8) {
                        n8 = 1;
                        mFont.number_red.Class1(mGraphics, Game86.Class353[1], GameScr.Class407 + 8, this.Class402 += 12, 0);
                        ++GameScr.Class194;
                    }
                    Label_7248: {
                        if (itemOption.optionTemplate.id == 65) {
                            this.Class1(mGraphics, mFont.Class15, (item.template.id == 485) ? Game20.Class1(itemOption.Class1(), Game86.Class208, Game86.Class492) : itemOption.Class1(), GameScr.Class407 + 8, this.Class402 += 12, 0);
                        }
                        else if (itemOption.optionTemplate.id == 66) {
                            this.Class1(mGraphics, mFont.Class10, (item.template.id == 485) ? Game20.Class1(itemOption.Class1(), Game86.Class476, Game86.Class493) : itemOption.Class1(), GameScr.Class407 + 8, this.Class402 += 12, 0);
                        }
                        else if (itemOption.optionTemplate.type == 0) {
                            this.Class1(mGraphics, mFont.Class10, item.Class9() ? itemOption.Class2() : itemOption.Class1(), GameScr.Class407 + 8, this.Class402 += 12, 0);
                        }
                        else if (itemOption.optionTemplate.type == 1) {
                            this.Class1(mGraphics, mFont.Class16, item.Class9() ? itemOption.Class2() : itemOption.Class1(), GameScr.Class407 + 8, this.Class402 += 12, 0);
                        }
                        else {
                            GameScr gameScr;
                            mGraphics mGraphics2;
                            mFont mFont2;
                            String class416;
                            if (itemOption.optionTemplate.type == 8) {
                                if (itemOption.optionTemplate.id == 85) {
                                    final mFont class415 = mFont.Class12;
                                    String s5;
                                    if (item.Class9()) {
                                        s5 = itemOption.Class2();
                                    }
                                    else {
                                        final ItemOption itemOption2 = itemOption;
                                        s5 = Game20.Class1(itemOption2.optionTemplate.name, "#", new StringBuffer(String.valueOf(itemOption2.param)).toString());
                                    }
                                    this.Class1(mGraphics, class415, s5, GameScr.Class407 + 8, this.Class402 += 12, 0);
                                    break Label_7248;
                                }
                                gameScr = this;
                                mGraphics2 = mGraphics;
                                mFont2 = mFont.Class4;
                                item.Class9();
                                class416 = itemOption.Class2();
                            }
                            else {
                                if ((itemOption.optionTemplate.type == 2 && item.typeUI == 5 && itemOption.active == 1) || (itemOption.optionTemplate.type == 3 && item.upgrade >= 4) || (itemOption.optionTemplate.type == 4 && item.upgrade >= 8) || (itemOption.optionTemplate.type == 5 && item.upgrade >= 12) || (itemOption.optionTemplate.type == 6 && item.upgrade >= 14) || (itemOption.optionTemplate.type == 7 && item.upgrade >= 16)) {
                                    this.Class1(mGraphics, mFont.Class16, item.Class9() ? itemOption.Class2() : itemOption.Class1(), GameScr.Class407 + 8, this.Class402 += 12, 0);
                                    break Label_7248;
                                }
                                gameScr = this;
                                mGraphics2 = mGraphics;
                                mFont2 = mFont.Class13;
                                class416 = (item.Class9() ? itemOption.Class2() : itemOption.Class1());
                            }
                            gameScr.Class1(mGraphics2, mFont2, class416, GameScr.Class407 + 8, this.Class402 += 12, 0);
                        }
                    }
                    ++GameScr.Class194;
                }
            }
            if (GameScr.Class240) {
                if (item.template.id == 12) {
                    mFont.Class14.Class1(mGraphics, String.valueOf(Game20.Class1(this.Class141[GameScr.indexSelect])) + " " + Game86.Class288, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                if (item.template.type >= 0 && item.template.type <= 9) {
                    mFont.Class12.Class1(mGraphics, Game86.Class463, GameScr.Class407 + 8, this.Class402 += 12, 0);
                }
                ++GameScr.Class194;
            }
            if (GameScr.indexRow >= 0 && (!GameCanvas.Class6 || (GameCanvas.Class6 && GameCanvas.Class25 < 320))) {
                Game2.Class1(mGraphics, 942, GameScr.Class407 + 1, GameScr.Class408 + 5 + GameScr.indexRow * 12, 0, Game62.Class2);
            }
            GameScr.Class196.Class1(GameScr.Class194, 12, GameScr.Class407, GameScr.Class408 + 2, GameScr.Class409, GameScr.Class410 - 4, true, 1);
            return;
        }
        if (Char.Class57 == null) {
            return;
        }
        this.Class402 = GameScr.Class408 - 9;
        GameScr.Class194 = 2;
        GameScr.Class196.Class1(mGraphics, GameScr.Class407, GameScr.Class408 + 2, GameScr.Class409, GameScr.Class410 - 2);
        GameScr.Class409 = mFont.number_red.Class1(Game86.Class468[Char.Class57.Class5][1]) + 10;
        for (int n10 = 0; n10 < 2; ++n10) {
            mFont.number_red.Class1(mGraphics, Game86.Class468[Char.Class57.Class5][n10], GameScr.Class407 + 8, this.Class402 += 12, 0);
        }
        if (GameScr.indexRow >= 0 && (!GameCanvas.Class6 || (GameCanvas.Class6 && GameCanvas.Class25 < 320))) {
            Game2.Class1(mGraphics, 942, GameScr.Class407 + 1, GameScr.Class408 + 5 + GameScr.indexRow * 12, 0, Game62.Class2);
        }
        GameScr.Class196.Class1(GameScr.Class194, 12, GameScr.Class407, GameScr.Class408 + 2, GameScr.Class409, GameScr.Class410 - 4, true, 1);
    }
    
    private static void Class39(final mGraphics mGraphics) {
        Class2(mGraphics);
        mGraphics.setColor(0);
        mGraphics.fillRect(GameScr.Class407 - 2, GameScr.Class408 - 2, GameScr.Class409 + 5, GameScr.Class410 + 5);
        mGraphics.setColor(13606712);
        mGraphics.Class2(GameScr.Class407 - 1, GameScr.Class408 - 1, GameScr.Class409 + 2, GameScr.Class410 + 2);
        mGraphics.setColor(Game25.Class1);
        mGraphics.fillRect(GameScr.Class407, GameScr.Class408, GameScr.Class409, GameScr.Class410);
    }
    
    private static void Class97() {
        if (!GameCanvas.Class9 || (GameScr.Class238 && GameScr.indexMenu == 0)) {
            return;
        }
        GameScr.Class407 = GameScr.Class157 + 175;
        GameScr.Class409 = GameScr.Class158 - 179;
        GameScr.Class408 = GameScr.Class156 + 33;
        GameScr.Class410 = 138;
        if (GameScr.isPaintTrade && GameScr.indexMenu == 0) {
            GameScr.Class407 = GameScr.Class157 + 6 + 3 * GameScr.Class192;
            GameScr.Class409 = GameScr.Class158 - (11 + 6 * GameScr.Class192);
        }
        if (GameScr.Class93) {
            if (GameScr.indexMenu == 4) {
                GameScr.Class407 = GameScr.Class157 + 33;
                GameScr.Class408 = GameScr.Class156 + 87;
                GameScr.Class409 = GameScr.Class158 - 67;
                GameScr.Class410 = 75;
                return;
            }
            if (GameScr.indexMenu == 5) {
                GameScr.Class410 = 161;
            }
        }
    }
    
    public final void Class36() {
        super.center = null;
        if (GameScr.Class193 == 0 && (GameScr.indexMenu == 1 || GameScr.indexMenu == 3 || GameScr.indexMenu == 4)) {
            super.left = null;
            return;
        }
        switch (GameScr.indexMenu) {
            case 0: {
                if (GameScr.Class193 != 1) {
                    break;
                }
                if (getItemFocus(3) == null) {
                    GameScr.Class92 = false;
                    super.left = this.Class412;
                    break;
                }
                super.left = this.Class417;
                if ((GameCanvas.Class6 && GameCanvas.Class25 < 320) || !GameCanvas.Class6) {
                    super.center = this.Class416;
                    break;
                }
                break;
            }
            case 1: {
                if (GameScr.Class193 != 1) {
                    break;
                }
                super.left = null;
                if (GameScr.indexSelect < 0) {
                    break;
                }
                final SkillTemplate skillTemplate = Char.getMyChar().nClass.Class3[GameScr.indexSelect];
                final Skill class1;
                if ((class1 = Char.getMyChar().Class1(skillTemplate)) == null) {
                    break;
                }
                if (class1.Class3 < skillTemplate.Class3) {
                    super.left = new Command(Game86.Class103, 14001);
                }
                if (class1.template.type == 1 || class1.template.type == 4 || class1.template.type == 2 || class1.template.type == 3) {
                    super.center = new Command(Game86.Class122, 11081);
                    break;
                }
                super.center = null;
                break;
            }
            case 2: {
                if (GameScr.Class193 > 0) {
                    super.left = new Command(Game86.Class103, 11084);
                    super.center = new Command("", 11084);
                    break;
                }
                break;
            }
            case 3: {
                super.left = null;
                super.center = new Command(Game86.Class157, 110854);
                break;
            }
            case 4: {
                if (GameScr.Class193 != 1) {
                    break;
                }
                super.left = null;
                final Item itemFocus;
                if ((itemFocus = getItemFocus(5)) != null) {
                    if (GameScr.Class97.charID == Char.getMyChar().charID) {
                        super.left = new Command(Game86.Class119, 11082);
                        if (GameCanvas.Class9) {
                            this.Class1(5, itemFocus);
                            break;
                        }
                        super.center = new Command(Game86.Class50, 11083);
                        break;
                    }
                    else {
                        if (GameCanvas.Class9) {
                            this.Class1(5, itemFocus);
                            break;
                        }
                        super.center = new Command(Game86.Class50, 11083);
                        break;
                    }
                }
                else {
                    GameScr.Class92 = false;
                    if (!GameCanvas.Class6 && GameScr.Class346 > 0) {
                        super.left = new Command(Game86.Class504, 2003);
                        break;
                    }
                    break;
                }
                break;
            }
            case 5: {
                super.left = null;
                if (GameScr.Class193 == 1 && GameScr.indexSelect >= 0 && GameScr.Class97.Class80[GameScr.indexSelect] != null) {
                    if (Char.getMyChar().charID == GameScr.Class97.charID) {
                        super.left = new Command(Game86.Class62, 1516);
                    }
                    super.center = new Command(GameCanvas.Class9 ? "" : Game86.Class50, 1515);
                    break;
                }
                break;
            }
            case 6: {
                if (GameScr.Class458 == 0) {
                    super.left = null;
                    if (GameScr.Class193 == 1 && GameScr.indexSelect >= 0 && GameScr.Class97.Class80[GameScr.indexSelect] != null) {
                        if (Char.getMyChar().charID == GameScr.Class97.charID) {
                            super.left = new Command(Game86.Class62, 501);
                        }
                        super.center = new Command(GameCanvas.Class9 ? "" : Game86.Class50, 503);
                        break;
                    }
                    break;
                }
                else if (GameScr.Class458 == 1) {
                    if (GameScr.Class193 > 0) {
                        super.left = new Command(Game86.Class103, 504);
                        break;
                    }
                    break;
                }
                else {
                    if (GameScr.Class193 == 1) {
                        super.left = null;
                        if (GameScr.indexSelect >= 0) {
                            final SkillTemplate skillTemplate2 = Char.getMyChar().nClass.Class3[GameScr.indexSelect];
                            final Skill class2;
                            if ((class2 = Char.getMyChar().Class1(skillTemplate2)) != null) {
                                if (class2.Class3 < skillTemplate2.Class3) {
                                    super.left = new Command(Game86.Class103, 14001);
                                }
                                if (class2.template.type == 1 || class2.template.type == 4 || class2.template.type == 2 || class2.template.type == 3) {
                                    super.center = new Command(Game86.Class122, 11081);
                                }
                                else {
                                    super.center = null;
                                }
                            }
                        }
                    }
                    if (GameScr.Class193 != 1) {
                        break;
                    }
                    super.left = null;
                    if (GameScr.indexSelect < 0) {
                        break;
                    }
                    final SkillTemplate skillTemplate3 = Char.getMyChar().nClass.Class3[GameScr.indexSelect];
                    final Skill class3;
                    if ((class3 = Char.getMyChar().Class1(skillTemplate3)) != null) {
                        if (class3.Class3 < skillTemplate3.Class3) {
                            super.left = new Command(Game86.Class103, 505);
                        }
                        super.center = null;
                        break;
                    }
                    break;
                }
                break;
            }
        }
        if (GameScr.indexMenu == 6) {
            super.right = new Command(Game86.Class119, 500);
            return;
        }
        if (GameScr.Class97.charID == Char.getMyChar().charID) {
            super.right = new Command(Game86.Class135, 11086);
            return;
        }
        super.right = this.cmdCloseAll;
    }
    
    public final void Class4(final int n) {
        GameScr.Class193 = 0;
        super.right = this.cmdCloseAll;
        switch (n) {
            case 51: {
                GameScr.Class209 = true;
                GameScr.indexMenu = 51;
                Service.gI().requestItem(51);
                break;
            }
            case 40: {
                GameScr.TuDong = true;
                GameScr.Class193 = 1;
                GameScr.indexRow = 0;
                this.Class29();
                break;
            }
            case 38: {
                GameScr.Class82 = null;
                GameScr.Class240 = true;
                GameScr.Class193 = 1;
                this.Class29();
                break;
            }
            case 14: {
                GameScr.Class209 = true;
                GameScr.indexMenu = 0;
                if (GameScr.Class70 == null) {
                    Service.gI().requestItem(14);
                    break;
                }
                break;
            }
            case 35: {
                GameScr.Class210 = true;
                GameScr.indexMenu = 0;
                if (GameScr.Class71 == null) {
                    Service.gI().requestItem(35);
                    break;
                }
                break;
            }
            case 15: {
                GameScr.Class209 = true;
                GameScr.indexMenu = 1;
                if (GameScr.Class73 == null) {
                    Service.gI().requestItem(15);
                    break;
                }
                break;
            }
            case 32: {
                GameScr.Class209 = true;
                GameScr.indexMenu = 2;
                if (GameScr.Class74 == null) {
                    Service.gI().requestItem(32);
                    break;
                }
                break;
            }
            case 34: {
                GameScr.Class209 = true;
                GameScr.indexMenu = 3;
                if (GameScr.Class72 == null) {
                    Service.gI().requestItem(34);
                    break;
                }
                break;
            }
            case 2: {
                GameScr.indexMenu = 0;
                GameScr.Class225 = true;
                if (GameScr.Class65 == null) {
                    Service.gI().requestItem(2);
                    break;
                }
                break;
            }
            case 20: {
                GameScr.indexMenu = 0;
                GameScr.Class211 = true;
                if (GameScr.Class51 == null) {
                    Service.gI().requestItem(20);
                    break;
                }
                break;
            }
            case 21: {
                GameScr.indexMenu = 0;
                GameScr.Class212 = true;
                if (GameScr.Class52 == null) {
                    Service.gI().requestItem(21);
                    break;
                }
                break;
            }
            case 22: {
                GameScr.indexMenu = 0;
                GameScr.Class213 = true;
                if (GameScr.Class53 == null) {
                    Service.gI().requestItem(22);
                    break;
                }
                break;
            }
            case 23: {
                GameScr.indexMenu = 0;
                GameScr.Class214 = true;
                if (GameScr.Class54 == null) {
                    Service.gI().requestItem(23);
                    break;
                }
                break;
            }
            case 24: {
                GameScr.indexMenu = 0;
                GameScr.Class215 = true;
                if (GameScr.Class55 == null) {
                    Service.gI().requestItem(24);
                    break;
                }
                break;
            }
            case 25: {
                GameScr.indexMenu = 0;
                GameScr.Class216 = true;
                if (GameScr.Class56 == null) {
                    Service.gI().requestItem(25);
                    break;
                }
                break;
            }
            case 26: {
                GameScr.indexMenu = 0;
                GameScr.Class217 = true;
                if (GameScr.Class57 == null) {
                    Service.gI().requestItem(26);
                    break;
                }
                break;
            }
            case 27: {
                GameScr.indexMenu = 0;
                GameScr.Class218 = true;
                if (GameScr.Class58 == null) {
                    Service.gI().requestItem(27);
                    break;
                }
                break;
            }
            case 28: {
                GameScr.indexMenu = 0;
                GameScr.Class219 = true;
                if (GameScr.Class59 == null) {
                    Service.gI().requestItem(28);
                    break;
                }
                break;
            }
            case 29: {
                GameScr.indexMenu = 0;
                GameScr.Class220 = true;
                if (GameScr.Class60 == null) {
                    Service.gI().requestItem(29);
                    break;
                }
                break;
            }
            case 16: {
                GameScr.indexMenu = 0;
                GameScr.Class221 = true;
                if (GameScr.Class61 == null) {
                    Service.gI().requestItem(16);
                    break;
                }
                break;
            }
            case 17: {
                GameScr.indexMenu = 0;
                GameScr.Class222 = true;
                if (GameScr.Class62 == null) {
                    Service.gI().requestItem(17);
                    break;
                }
                break;
            }
            case 18: {
                GameScr.indexMenu = 0;
                GameScr.Class223 = true;
                if (GameScr.Class63 == null) {
                    Service.gI().requestItem(18);
                    break;
                }
                break;
            }
            case 19: {
                GameScr.indexMenu = 0;
                GameScr.Class224 = true;
                if (GameScr.Class64 == null) {
                    Service.gI().requestItem(19);
                    break;
                }
                break;
            }
            case 6: {
                GameScr.indexMenu = 0;
                GameScr.Class226 = true;
                if (GameScr.Class66 == null) {
                    Service.gI().requestItem(6);
                    break;
                }
                break;
            }
            case 7: {
                GameScr.indexMenu = 0;
                GameScr.Class227 = true;
                if (GameScr.Class67 == null) {
                    Service.gI().requestItem(7);
                    break;
                }
                break;
            }
            case 8: {
                GameScr.indexMenu = 0;
                GameScr.Class228 = true;
                if (GameScr.Class68 == null) {
                    Service.gI().requestItem(8);
                    break;
                }
                break;
            }
            case 9: {
                GameScr.indexMenu = 0;
                GameScr.Class229 = true;
                if (GameScr.Class69 == null) {
                    Service.gI().requestItem(9);
                    break;
                }
                break;
            }
            case 4: {
                GameScr.indexMenu = 0;
                GameScr.Class234 = true;
                if (Char.getMyChar().Class78 == null) {
                    Service.gI().requestItem(4);
                    break;
                }
                break;
            }
            case 10: {
                GameScr.indexMenu = 0;
                GameScr.Class230 = true;
                GameScr.Class76 = new Item[18];
                break;
            }
            case 36: {
                GameScr.indexMenu = 0;
                GameScr.Class89 = true;
                GameScr.Class86 = null;
                this.Class262 = new TField();
                this.Class262.Class14 = 9;
                this.Class262.Class18 = 1;
                this.Class262.Class3 = 100;
                this.Class262.Class4 = mScreen.Class4 + 2;
                break;
            }
            case 37: {
                GameScr.Class241 = true;
                this.Class29();
                break;
            }
            case 33: {
                GameScr.indexMenu = 0;
                GameScr.Class231 = true;
                GameScr.Class80 = new Item[3];
                break;
            }
            case 31: {
                GameScr.indexMenu = 0;
                GameScr.Class230 = true;
                GameScr.Class232 = true;
                GameScr.Class76 = new Item[18];
                break;
            }
            case 11: {
                GameScr.indexMenu = 0;
                GameScr.Class233 = true;
                GameScr.Class197 = true;
                GameScr.Class75 = new Item[24];
                break;
            }
            case 12: {
                GameScr.indexMenu = 0;
                GameScr.Class233 = true;
                GameScr.Class197 = false;
                GameScr.Class75 = new Item[24];
                break;
            }
            case 13: {
                GameScr.indexMenu = 0;
                GameScr.Class235 = true;
                GameScr.Class77 = new Item[24];
                break;
            }
            case 43: {
                GameScr.indexMenu = 0;
                GameScr.Class242 = true;
                GameScr.Class75 = new Item[24];
                break;
            }
            case 44: {
                GameScr.indexMenu = 0;
                GameScr.Class243 = true;
                GameScr.Class77 = new Item[24];
                break;
            }
            case 45: {
                GameScr.indexMenu = 0;
                GameScr.Class244 = true;
                GameScr.Class77 = new Item[24];
                break;
            }
            case 46: {
                GameScr.indexMenu = 0;
                GameScr.Class245 = true;
                GameScr.Class77 = new Item[24];
                break;
            }
            case 47: {
                GameScr.indexMenu = 0;
                GameScr.Class246 = true;
                GameScr.Class76 = new Item[18];
                break;
            }
            case 48: {
                GameScr.indexMenu = 0;
                GameScr.Class250 = true;
                GameScr.Class77 = new Item[18];
                break;
            }
            case 49: {
                GameScr.indexMenu = 0;
                GameScr.Class247 = true;
                GameScr.Class85 = null;
                break;
            }
            case 50: {
                GameScr.indexMenu = 0;
                GameScr.Class248 = true;
                GameScr.Class85 = null;
                break;
            }
        }
        setPopupSize(175, 200);
    }
    
    public static Char Class5(final int n) {
        for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
            final Char char1;
            if ((char1 = (Char)GameScr.vCharInMap.elementAt(i)).charID == n) {
                return char1;
            }
        }
        return null;
    }
    
    public static Game92 Class6(final int n) {
        if (GameScr.Class42.size() > 0) {
            return (Game92)GameScr.Class42.elementAt(n);
        }
        return null;
    }
    
    public static void Class1(final String s, String str) {
        if (!GameScr.Class96 || GameCanvas.Class6) {
            Game23.Class1().Class2 = false;
        }
        GameScr.Class292 = 5;
        if (s.equals("")) {
            return;
        }
        if (str.equals(Game86.Class400[0])) {
            final Code code = Code.code;
            if (!Code.ChatMod(s)) {
                final Service gi = Service.gI();
                str = s;
                final Service service = gi;
                Message message = null;
                try {
                    (message = new Message((byte)(-23))).Class3.writeUTF(str);
                    service.temple.Class1(message);
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                finally {
                    message.Class2();
                }
                message.Class2();
                return;
            }
        }
        if (str.equals(Game86.Class401[0])) {
            if (GameScr.vParty.size() == 0) {
                ChatManager.gI().Class5().Class1(Game86.Class344);
                return;
            }
            final Service gi2 = Service.gI();
            str = s;
            final Service service2 = gi2;
            Message message2 = null;
            try {
                (message2 = new Message((byte)(-20))).Class3.writeUTF(str);
                service2.temple.Class1(message2);
            }
            catch (Exception ex2) {
                ex2.printStackTrace();
            }
            finally {
                message2.Class2();
            }
            message2.Class2();
        }
        else {
            if (str.equals(Game86.Class402[0])) {
                final Service gi3 = Service.gI();
                str = s;
                final Service service3 = gi3;
                Message message3 = null;
                try {
                    (message3 = new Message((byte)(-21))).Class3.writeUTF(str);
                    service3.temple.Class1(message3);
                }
                catch (Exception ex3) {
                    ex3.printStackTrace();
                }
                finally {
                    message3.Class2();
                }
                message3.Class2();
                return;
            }
            if (!str.equals(Game86.Class403[0])) {
                ChatManager.gI().Chat(str, Char.getMyChar().cName, s);
                final Service gi4 = Service.gI();
                str = str;
                final Service service4 = gi4;
                Message message4 = null;
                try {
                    (message4 = new Message((byte)(-22))).Class3.writeUTF(str);
                    message4.Class3.writeUTF(s);
                    service4.temple.Class1(message4);
                }
                catch (Exception ex4) {
                    ex4.printStackTrace();
                }
                finally {
                    message4.Class2();
                }
                message4.Class2();
                return;
            }
            if (Char.getMyChar().Class55.equals("")) {
                ChatManager.gI().Class5().Class1(Game86.Class349);
                return;
            }
            final Service gi5 = Service.gI();
            str = s;
            final Service service5 = gi5;
            Message message5 = null;
            try {
                (message5 = new Message((byte)(-19))).Class3.writeUTF(str);
                service5.temple.Class1(message5);
            }
            catch (Exception ex5) {
                ex5.printStackTrace();
            }
            finally {
                message5.Class2();
            }
            message5.Class2();
        }
    }
    
    private void Class98() {
        if (GameScr.Class96) {
            this.Class34();
            GameScr.Class96 = false;
            Game23.Class1().Class6 = null;
        }
    }
    
    private void Class1(int indexSelect, final int n, final int n2, int n3, final int class193) {
        if (GameScr.Class233 || GameScr.Class242 || GameScr.Class243 || GameScr.Class244 || GameScr.Class235 || GameScr.isPaintTrade || GameScr.Class230 || GameScr.Class231 || GameScr.Class89 || GameScr.Class245 || GameScr.Class246 || GameScr.Class247 || GameScr.Class248) {
            final int n4 = n2 * GameScr.Class192;
            n3 *= GameScr.Class192;
            GameScr.Class50.Class1();
            if (GameCanvas.Class2(indexSelect, n, n4, n3)) {
                GameScr.Class193 = class193;
                if (GameCanvas.Class15) {
                    if ((indexSelect = (GameCanvas.Class19 - indexSelect) / GameScr.Class192 + (GameCanvas.Class20 - n) / GameScr.Class192 * n2) / GameScr.Class400 < GameScr.Class401) {
                        GameScr.indexSelect = indexSelect;
                    }
                    final Command command = null;
                    super.center = command;
                    super.left = command;
                    if (GameScr.isPaintTrade) {
                        if (GameScr.indexSelect < 0) {
                            GameScr.indexSelect = 11;
                        }
                        if (GameScr.indexSelect > 11) {
                            GameScr.indexSelect = 11;
                        }
                    }
                    this.Class29();
                }
            }
        }
    }
    
    public final void Class2(int i, final Object o) {
        switch (i) {
            case 2004: {
                Game87.Class1("nhan qua ");
            }
            case 2003: {
                if (GameScr.Class346 == 0) {
                    GameScr.Class346 = 16;
                    this.Class186.Class1 = Game86.Class504;
                    return;
                }
                GameScr.Class346 = 0;
                this.Class186.Class1 = Game86.Class505;
                if (!GameCanvas.Class6) {
                    super.left = new Command(Game86.Class119, 11082);
                    return;
                }
                break;
            }
            case 2002: {
                GameCanvas.endDlg();
            }
            case 2001: {
                Service.gI().throwItem(GameScr.indexSelect);
            }
            case 1100181: {
                GameCanvas.Class1(Game86.Class4, new Command(Game86.Class502, 1100182), new Command(Game86.Class73, GameCanvas.instance, 8882, null));
            }
            case 1100182: {
                GameCanvas.Class34 = null;
                GameCanvas.Class32.Class6();
            }
            case 909090: {
                this.Class4(38);
            }
            case 1: {
                GameCanvas.endDlg();
            }
            case 2: {
                GameCanvas.endDlg();
                final Command command = null;
                super.center = command;
                super.left = command;
                this.Class29();
            }
            case 3: {
                this.Class34();
            }
            case 1000: {
                Service.gI().Class28();
                this.Class22();
            }
            case 2000: {
                Service.gI().Class29();
                this.Class22();
            }
            case 11000: {
                Class58();
            }
            case 110001: {
                this.Class56();
            }
            case 1100011: {
                this.Class42();
            }
            case 1100012: {
                this.Class43();
            }
            case 1100013: {
                this.Class44();
            }
            case 1100014: {
                this.Class45();
            }
            case 1100015: {
                this.Class46();
            }
            case 1100016: {
                this.Class47();
            }
            case 1100017: {
                this.Class48();
            }
            case 110002: {
                Class65();
            }
            case 110003: {
                Class57();
            }
            case 1100032: {
                this.Class59();
            }
            case 1100033: {
                Class125();
            }
            case 1100034: {
                Class213();
            }
            case 110004: {
                Class182();
            }
            case 1100041: {
                Class181();
            }
            case 110005: {
                this.Class4(14);
            }
            case 110006: {
                Class178();
            }
            case 1100061: {
                this.Class60();
            }
            case 1100062: {
                this.Class62();
            }
            case 1100063: {
                this.Class63();
            }
            case 1100064: {
                this.Class64();
            }
            case 1100065: {
                Class177();
            }
            case 11000651: {
                Class13(1);
            }
            case 11000652: {
                Class13(2);
            }
            case 11000653: {
                Class13(3);
            }
            case 1100067: {
                Class114();
            }
            case 11000671: {
                GameCanvas.Class1(Game86.Class414, 88836, null, 8882, null);
            }
            case 11000672: {
                GameCanvas.inputDlg.tfInput.Class2(6);
                GameCanvas.inputDlg.show(Game86.Class415, new Command(Game86.Class107, GameCanvas.instance, 88837, null), 1);
            }
            case 11000673: {
                GameCanvas.Class37.Class1(Game86.Class421, Game86.Class422);
                GameCanvas.Class37.Class1.Class2(6);
                GameCanvas.Class37.Class2.Class2(6);
                GameCanvas.Class37.Class1(Game86.Class415, new Command(Game86.CLOSE, GameCanvas.instance, 8882, null), new Command(Game86.Class107, GameCanvas.instance, 88838, null), 1, 1);
            }
            case 11000674: {
                GameCanvas.inputDlg.tfInput.Class2(6);
                GameCanvas.inputDlg.show(Game86.Class415, new Command(Game86.Class107, GameCanvas.instance, 88839, null), 1);
            }
            case 1100068: {
                this.Class4(40);
            }
            case 11000661: {
                GameScr.indexMenu = 0;
                this.Class124();
            }
            case 11000662: {
                GameScr.indexMenu = 1;
                this.Class124();
                Service.gI().Class21();
            }
            case 11000663: {
                GameScr.indexMenu = 2;
                this.Class124();
                Service.gI().Class22();
            }
            case 11000664: {
                GameScr.indexMenu = 3;
                this.Class124();
                Service.gI().Class23();
            }
            case 11000665: {
                if (GameScr.Class87 = !GameScr.Class87) {
                    TaskOrder.Class1(String.valueOf(Char.getMyChar().cName) + "vci", 1);
                    return;
                }
                TaskOrder.Class1(String.valueOf(Char.getMyChar().cName) + "vci", 0);
            }
            case 11000666: {
                GameScr.indexMenu = 4;
                this.Class124();
                Service.gI().Class22();
            }
            case 110007: {
                this.Class4(7);
            }
            case 110008: {
                this.Class4(6);
            }
            case 110009: {
                this.Class4(9);
            }
            case 110010: {
                this.Class4(8);
            }
            case 110011: {
                this.Class4(10);
            }
            case 110012: {
                this.Class4(11);
            }
            case 110013: {
                this.Class4(12);
            }
            case 110014: {
                this.Class4(4);
            }
            case 110015: {
                this.Class4(13);
            }
            case 110016: {
                Service.gI().openUIZone();
            }
            case 110017: {
                this.Class21();
            }
            case 110018: {
                Class165();
            }
            case 110019: {
                this.Class128();
            }
            case 11001: {
                Char.getMyChar().Class21();
            }
            case 11002: {
                Class212();
            }
            case 11003: {
                Class211();
            }
            case 11004: {
                this.Class4((byte)25);
            }
            case 11005: {
                Class209();
            }
            case 110051: {
                Class2((byte)25);
            }
            case 110052: {
                Class3((byte)25);
            }
            case 11006: {
                Class210();
            }
            case 11007: {
                this.Class4((byte)24);
            }
            case 11008: {
                Class208();
            }
            case 110081: {
                Class2((byte)24);
            }
            case 110082: {
                Class3((byte)24);
            }
            case 11009: {
                this.Class4((byte)23);
            }
            case 11010: {
                Class207();
            }
            case 110101: {
                Class2((byte)23);
            }
            case 110102: {
                Class3((byte)23);
            }
            case 11011: {
                this.Class4((byte)22);
            }
            case 11012: {
                Class206();
            }
            case 110121: {
                Class2((byte)22);
            }
            case 110122: {
                Class3((byte)22);
            }
            case 11013: {
                this.Class4((byte)21);
            }
            case 11014: {
                Class205();
            }
            case 110141: {
                Class2((byte)21);
            }
            case 110142: {
                Class3((byte)21);
            }
            case 11015: {
                this.Class4((byte)20);
            }
            case 11016: {
                Class204();
            }
            case 110161: {
                Class2((byte)20);
            }
            case 110162: {
                Class3((byte)20);
            }
            case 11017: {
                this.Class4((byte)15);
            }
            case 11018: {
                Class202();
            }
            case 110181: {
                Class2((byte)15);
            }
            case 110182: {
                Class3((byte)15);
            }
            case 11019: {
                this.Class4((byte)14);
            }
            case 11020: {
                Class201();
            }
            case 110201: {
                Class2((byte)14);
            }
            case 110202: {
                Class3((byte)14);
            }
            case 11021: {
                GameScr.Class163 = "";
                GameScr.Class164 = "";
                this.Class22();
            }
            case 11022: {
                this.Class199();
            }
            case 110221: {
                Class184();
            }
            case 11023: {
                this.Class198();
            }
            case 11024: {
                Class197();
            }
            case 110244: {
                Class196();
            }
            case 11025: {
                this.Class51();
            }
            case 11026: {
                Class195();
            }
            case 11027: {
                this.Class194();
            }
            case 11028: {
                this.Class193();
            }
            case 11029: {
                this.Class192();
            }
            case 11030: {
                this.Class191();
            }
            case 11032: {
                this.Class190();
            }
            case 11033: {
                this.Class189();
            }
            case 11034: {
                this.Class187();
            }
            case 11035: {
                this.Class186();
            }
            case 11036: {
                Class88();
            }
            case 110361: {
                this.Class175();
            }
            case 11037: {
                this.Class185();
            }
            case 11038: {
                Class183();
            }
            case 110382: {
                Service.gI().returnTownFromDead();
            }
            case 110383: {
                Service.gI().wakeUpFromDead();
            }
            case 110391: {
                this.Class14(1);
            }
            case 110392: {
                this.Class14(2);
            }
            case 110393: {
                this.Class14(3);
            }
            case 110394: {
                this.Class14(4);
            }
            case 110395: {
                this.Class14(5);
            }
            case 110396: {
                this.Class14(6);
            }
            case 110397: {
                this.Class14(7);
            }
            case 110398: {
                this.Class14(8);
            }
            case 110399: {
                this.Class14(9);
            }
            case 1103991: {
                this.Class14(10);
            }
            case 11040: {
                this.Class180();
            }
            case 11041: {
                this.Class179();
            }
            case 11042: {
                Class176();
            }
            case 11043: {
                Class174();
            }
            case 11044: {
                Class113();
            }
            case 110441: {
                this.Class54();
            }
            case 11045: {
                Class119();
            }
            case 110451: {
                Class173();
            }
            case 110452: {
                Class172();
            }
            case 11046: {
                Class118();
            }
            case 11047: {
                Class115();
            }
            case 110471: {
                Class171();
            }
            case 11048: {
                Class170();
            }
            case 11049: {
                Class87();
            }
            case 11050: {
                Class89();
            }
            case 11051: {
                Class169();
            }
            case 11052: {
                Service.gI().Class8(((Item)o).indexUI, GameCanvas.Class30.Class3);
            }
            case 11053: {
                Class7((Item)o);
            }
            case 110531: {
                Service.gI().Class8(((Item)o).indexUI, GameCanvas.Class30.Class3 + 3);
            }
            case 11054: {
                this.Class163();
            }
            case 11055: {
                Class6((Item)o);
            }
            case 110561: {
                GameCanvas.endDlg();
                this.Class29();
            }
            case 110562: {
                Class5((Item)o);
            }
            case 11057: {
                Service.gI().getTask(((Npc)o).template.npcTemplateId, GameCanvas.Class30.Class3);
            }
            case 11058: {
                final Item item = (Item)o;
                GameCanvas.endDlg();
                Service.gI().saleItem(item.indexUI, Integer.parseInt(GameCanvas.inputDlg.tfInput.getText()));
            }
            case 11059: {
                this.Class162();
            }
            case 11060: {
                this.Class161();
            }
            case 11061: {
                Class4((Item)o);
            }
            case 11062: {
                Class93();
            }
            case 11063: {
                Class160();
            }
            case 11064: {
                Service.gI().Class5(GameScr.Class193 - 1, 1);
                this.Class36();
            }
            case 11065: {
                this.Class52();
            }
            case 11066: {
                this.Class34();
                GameScr.Class96 = false;
                GameScr.Class88 = false;
                Game23.Class1().Class6 = null;
            }
            case 11067: {
                if (TileMap.zoneID != GameScr.indexSelect) {
                    Service.gI().requestChangeZone(GameScr.indexSelect, this.Class258);
                    return;
                }
                InfoMe.Class1(Game86.Class367);
            }
            case 11068: {
                this.Class6((String)o);
            }
            case 11069: {
                this.Class159();
            }
            case 11070: {
                Class1((Party)o);
            }
            case 110701: {
                Service.gI().outParty();
            }
            case 110702: {
                Service.gI().Class1(true);
            }
            case 110703: {
                Service.gI().Class1(false);
            }
            case 11071: {
                Service.gI().outParty();
            }
            case 11072: {
                Class158();
            }
            case 110721: {
                Service.gI().saleItem(GameScr.indexSelect, 1);
            }
            case 110722: {
                Class2(Char.getMyChar().arrItemBag[GameScr.indexSelect]);
            }
            case 110723: {
                Service.gI().saleItem(GameScr.indexSelect, Char.getMyChar().arrItemBag[GameScr.indexSelect].quantity);
            }
            case 11073: {
                Class2(Char.getMyChar().arrItemBag[GameScr.indexSelect]);
            }
            case 11074: {
                final MyVector myVector = (MyVector)o;
                this.Class1(Short.parseShort(String.valueOf(myVector.elementAt(0))), String.valueOf(myVector.elementAt(1)));
            }
            case 11075: {
                this.Class157();
            }
            case 11076: {
                Service.gI().addParty((String)o);
            }
            case 11077: {
                Class5((String)o);
            }
            case 110771: {
                final String s = (String)o;
                GameCanvas.endDlg();
                Service.gI().Class4(s);
            }
            case 11078: {
                Class156();
            }
            case 11079: {
                Class154();
            }
            case 110791: {
                Service.gI().addParty((String)o);
            }
            case 110792: {
                Class4((String)o);
            }
            case 1107921: {
                final String text = (String)o;
                GameCanvas.endDlg();
                Service.gI().Class4(text);
                setText(text);
            }
            case 1107931: {
                Service.gI().Class2((String)o);
            }
            case 1107932: {
                setText((String)o);
            }
            case 11080: {
                Class3((String)o);
            }
            case 110801: {
                Service.gI().Class21(GameScr.indexRow);
            }
            case 110802: {
                Service.gI().Class20(GameScr.indexRow);
            }
            case 110803: {
                Service.gI().Class2((String)o);
            }
            case 110804: {
                Class129();
            }
            case 1108041: {
                Service.gI().Class6((String)o);
                gI().Class22();
            }
            case 110805: {
                Class121();
            }
            case 11081: {
                Class152();
            }
            case 110811: {
                Class2(Char.getMyChar().nClass.Class3[GameScr.indexSelect]);
            }
            case 110812: {
                Class1(Char.getMyChar().nClass.Class3[GameScr.indexSelect]);
            }
            case 11082: {
                Class151();
            }
            case 110821: {
                Service.gI().Class1(GameScr.indexSelect + GameScr.Class346);
            }
            case 11083: {
                this.Class4((byte)5);
            }
            case 11084: {
                Class150();
            }
            case 110841: {
                Service.gI().Class5(GameScr.Class193 - 1, 1);
                this.Class36();
            }
            case 110842: {
                this.Class52();
            }
            case 11085: {
                Class149();
            }
            case 110851: {
                final Item item2 = (Item)o;
                Service.gI().buyItem(item2.typeUI, item2.indexUI, 1);
            }
            case 110852: {
                Class1((Item)o);
            }
            case 110854: {
                Class147();
            }
            case 11086: {
                this.Class148();
            }
            case 11087: {
                final Item item3 = (Item)o;
                GameCanvas.endDlg();
                Service.gI().Class1(item3);
            }
            case 11088: {
                this.Class4((byte)26);
            }
            case 11089: {
                this.Class4((byte)27);
            }
            case 11090: {
                this.Class4((byte)28);
            }
            case 11091: {
                this.Class4((byte)29);
            }
            case 11092: {
                Class3((Item)o);
            }
            case 110921: {
                final Item item4 = (Item)o;
                Service.gI().buyItem(item4.typeUI, item4.indexUI, 1);
            }
            case 110922: {
                Class1((Item)o);
            }
            case 110923: {
                this.Class4((byte)16);
            }
            case 110924: {
                this.Class4((byte)17);
            }
            case 110925: {
                this.Class4((byte)18);
            }
            case 110926: {
                this.Class4((byte)19);
            }
            case 11093: {
                this.Class4((byte)2);
            }
            case 11094: {
                this.Class4((byte)6);
            }
            case 11095: {
                this.Class4((byte)7);
            }
            case 11096: {
                this.Class4((byte)8);
            }
            case 11097: {
                this.Class4((byte)9);
            }
            case 11098: {
                this.Class146();
            }
            case 110981: {
                Class95();
            }
            case 11099: {
                GameScr.Class198 = false;
                this.Class1(3, GameScr.Class84);
            }
            case 110991: {
                GameScr.Class198 = true;
                this.Class1(3, GameScr.Class84);
            }
            case 11100: {
                Class144();
            }
            case 111001: {
                this.Class143();
            }
            case 11101: {
                this.Class1(3, getItemFocus(10));
            }
            case 11102: {
                this.Class139();
            }
            case 11103: {
                this.Class138();
            }
            case 111031: {
                if (GameScr.Class243) {
                    Service.gI().Class1(GameScr.Class85, GameScr.Class77);
                    return;
                }
                if (GameScr.Class244) {
                    Service.gI().Class2(GameScr.Class85, GameScr.Class77);
                    return;
                }
                if (GameScr.Class245) {
                    Service.gI().Class1((byte)1, null, GameScr.Class85, GameScr.Class77);
                    return;
                }
                if (GameScr.Class247) {
                    Service.gI().Class1((byte)2, null, GameScr.Class85, null);
                    return;
                }
                if (GameScr.Class248) {
                    Service.gI().Class1((byte)3, null, GameScr.Class85, null);
                    return;
                }
                break;
            }
            case 11104: {
                this.Class1(3, (Item)o);
            }
            case 11105: {
                Class96();
            }
            case 11106: {
                this.Class137();
            }
            case 11107: {
                Class136();
            }
            case 111071: {
                this.Class134();
            }
            case 11108: {
                this.Class4((byte)3);
            }
            case 11109: {
                this.Class133();
            }
            case 11110: {
                this.Class1(30, GameScr.arrItemTradeOrder[GameScr.indexSelect]);
            }
            case 111101: {
                Service.gI().Class3(getItemFocus(4).indexUI);
            }
            case 11111: {
                this.Class1(4, getItemFocus(4));
            }
            case 11112: {
                Service.gI().Class7();
            }
            case 11113: {
                Service.gI().Class4(Char.getMyChar().arrItemBag[GameScr.indexSelect].indexUI);
            }
            case 11114: {
                this.Class1(3, Char.getMyChar().arrItemBag[GameScr.indexSelect]);
            }
            case 11115: {
                Class131();
            }
            case 11116: {
                Class130();
            }
            case 11120: {
                final Object[] array = (Object[])o;
                GameScr.Class285[Integer.parseInt((String)array[1])] = (Skill)array[0];
                Class40();
            }
            case 11121: {
                final Object[] array2 = (Object[])o;
                GameScr.Class284[Integer.parseInt((String)array2[1])] = (Skill)array2[0];
                Class41();
            }
            case 12000: {
                this.Class168();
            }
            case 12001: {
                ChatManager.gI().Class1((int)o);
                this.Class166();
            }
            case 12002:
            case 12004: {
                final String s2 = (String)o;
                final Game44 class1;
                if ((class1 = ChatManager.gI().Class1(s2)) == null) {
                    ChatManager.gI().Class2(s2);
                    ChatManager.gI().Class3();
                }
                else {
                    ChatManager.gI().Class1(class1);
                }
                this.Class166();
                GameScr.Class204 = (GameScr.Class91 = (GameScr.Class207 = (GameScr.Class238 = (GameScr.Class205 = false))));
                Game23.Class1().Class6 = null;
            }
            case 12003: {
                this.Class63();
            }
            case 12005: {
                Class167();
            }
            case 120051: {
                ChatManager.gI().Class1.removeElement(o);
                if (ChatManager.gI().Class3 > ChatManager.gI().Class1.size() - 1) {
                    ChatManager.gI().Class2();
                }
                if (ChatManager.gI().Class5() != null) {
                    this.Class166();
                    return;
                }
                Game23.Class1().Class2 = false;
                this.Class22();
            }
            case 12006: {
                Class164();
            }
            case 120061: {
                ChatManager.Class4 = !ChatManager.Class4;
                GameCanvas.setText(String.valueOf(Game86.Class404) + (ChatManager.Class4 ? Game86.Class43 : Game86.Class44));
            }
            case 120062: {
                ChatManager.Class5 = !ChatManager.Class5;
                GameCanvas.setText(String.valueOf(Game86.Class405) + (ChatManager.Class5 ? Game86.Class43 : Game86.Class44));
            }
            case 12007: {
                this.Class419 = 1;
                this.Class420 = "";
                this.Class110();
            }
            case 120071: {
                this.Class419 = 2;
                if (GameCanvas.Class37.Class1.getText().equals("")) {
                    GameCanvas.setText(Game86.Class278);
                    return;
                }
                if (GameCanvas.Class37.Class2.getText().equals("")) {
                    GameCanvas.setText(Game86.Class279);
                    return;
                }
                this.Class420 = "Lo\u1ea1i th\u1ebb: " + GameCanvas.Class37.Class1.getText();
                this.Class420 = String.valueOf(this.Class420) + ", M\u1ec7nh gi\u00e1: " + GameCanvas.Class37.Class2.getText();
                GameCanvas.endDlg();
                this.Class110();
            }
            case 120072: {
                if (GameCanvas.Class37.Class1.getText().equals("")) {
                    GameCanvas.setText(Game86.Class280);
                    return;
                }
                if (GameCanvas.Class37.Class2.getText().equals("")) {
                    GameCanvas.setText(Game86.Class281);
                    return;
                }
                this.Class420 = String.valueOf(this.Class420) + ", S\u1ed1 seri: " + GameCanvas.Class37.Class1.getText();
                this.Class420 = String.valueOf(this.Class420) + ", Kho\u1ea3ng th\u1eddi gian n\u1ea1p: " + GameCanvas.Class37.Class2.getText();
                Service.gI().Class1(this.Class420);
                GameCanvas.endDlg();
            }
            case 12008: {
                Class109();
            }
            case 120081: {
                GameCanvas.inputDlg.tfInput.Class2(11);
                GameCanvas.inputDlg.show(Game86.Class416, new Command("OK", null, 120082, null), 1);
            }
            case 120082: {
                final String text2;
                if ((text2 = GameCanvas.inputDlg.tfInput.getText()).equals("")) {
                    GameCanvas.setText(Game86.Class417);
                    return;
                }
                Service.gI().Class1("S\u1ed1 \u0111i\u1ec7n tho\u1ea1i \u0111\u0103ng k\u00fd: ".concat(String.valueOf(text2)));
                GameCanvas.endDlg();
            }
            case 12009: {
                final String s3 = (String)o;
                final MyVector myVector2;
                (myVector2 = new MyVector()).addElement(new Command(Game86.Class366[7], 12002, s3));
                myVector2.addElement(new Command(Game86.Class388[2], 110803, s3));
                if (GameScr.Class204) {
                    myVector2.addElement(new Command(Game86.Class366[6], 110804));
                }
                if (GameScr.Class96) {
                    myVector2.addElement(new Command(Game86.Class29, 14020, s3));
                    myVector2.addElement(new Command(Game86.Class366[6], 1108041, s3));
                }
                GameCanvas.Class30.Class1(myVector2);
            }
            case 130011: {
                final Npc npc = (Npc)o;
                Service.gI().getTask(npc.template.npcTemplateId, 0);
                npc.Class6 = null;
                this.Class22();
            }
            case 130012: {
                ((Npc)o).Class6 = null;
                this.Class22();
            }
            case 13001: {
                this.Class4((byte)32);
            }
            case 13002: {
                Class203();
            }
            case 130021: {
                Class2((byte)32);
            }
            case 130022: {
                Class3((byte)32);
            }
            case 14001: {
                Class153();
            }
            case 140011: {
                Service.gI().Class6(Char.getMyChar().nClass.Class3[GameScr.indexSelect].id, 1);
                this.Class36();
            }
            case 140012: {
                this.Class53();
            }
            case 14002: {
                this.Class126();
            }
            case 14003: {
                this.Class127();
            }
            case 14004: {
                Class117();
            }
            case 140041: {
                GameCanvas.inputDlg.tfInput.Class2(180);
                GameCanvas.inputDlg.show(Game86.Class424, new Command(Game86.Class107, GameCanvas.instance, 88832, null), 0);
            }
            case 140042: {
                Service.gI().Class25();
            }
            case 140043: {
                GameCanvas.inputDlg.show(Game86.Class425, new Command(Game86.Class107, GameCanvas.instance, 88834, null), 0);
            }
            case 140044: {
                Service.gI().Class27();
            }
            case 14005: {
                Class122();
            }
            case 14006: {
                Class2((String)o);
            }
            case 14007: {
                Class111();
            }
            case 140071: {
                GameScr.indexRow = 0;
                GameScr.indexSelect = 0;
                GameScr.Class50.Class1();
                GameScr.Class199 = !GameScr.Class199;
                Class25();
            }
            case 140072: {
                GameScr.indexRow = 0;
                GameScr.indexSelect = 0;
                GameScr.Class50.Class1();
                GameScr.Class200 = !GameScr.Class200;
                Class25();
            }
            case 14008: {
                GameCanvas.Class1(Game86.Class293, new Command(Game86.Class60, 140081), new Command(Game86.Class73, 1));
            }
            case 140081: {
                Service.gI().Class24();
                GameCanvas.endDlg();
            }
            case 14009: {
                Class120();
            }
            case 140091: {
                Service.gI().Class1(((Game41)GameScr.Class31.elementAt(GameScr.indexRow)).Class4, 3);
            }
            case 140092: {
                Service.gI().Class1(((Game41)GameScr.Class31.elementAt(GameScr.indexRow)).Class4, 2);
            }
            case 140093: {
                GameCanvas.Class1(Game86.Class291, new Command(Game86.Class60, 1400931), new Command(Game86.Class73, 1));
            }
            case 140094: {
                GameCanvas.Class1(Game86.Class292, new Command(Game86.Class60, 1400941), new Command(Game86.Class73, 1));
            }
            case 1400931: {
                Service.gI().Class1(((Game41)GameScr.Class31.elementAt(GameScr.indexRow)).Class4, 0);
                GameCanvas.endDlg();
            }
            case 1400941: {
                Service.gI().Class8(((Game41)GameScr.Class31.elementAt(GameScr.indexRow)).Class4);
                GameCanvas.endDlg();
            }
            case 140095: {
                Service.gI().Class9(((Game41)GameScr.Class31.elementAt(GameScr.indexRow)).Class4);
            }
            case 140096: {
                final MyVector myVector3;
                (myVector3 = new MyVector()).addElement(new Command(Game86.Class464, 1400961));
                myVector3.addElement(new Command(Game86.Class465, 1400962));
                GameCanvas.Class30.Class1(myVector3);
            }
            case 1400961: {
                Service.gI().Class10(((Game41)GameScr.Class31.elementAt(GameScr.indexRow)).Class4);
            }
            case 1400962: {
                Service.gI().Class26();
            }
            case 14010: {
                GameCanvas.inputDlg.show(Game86.Class426, new Command(Game86.Class107, GameCanvas.instance, 88833, null), 1);
            }
            case 140101: {
                final Item item5;
                (item5 = new Item()).template = Game104.Class1((short)0);
                item5.Class6 = -1L;
                this.Class1(39, item5);
            }
            case 14011: {
                GameScr.Class88 = false;
            }
            case 14012: {
                this.Class140();
            }
            case 14013: {
                this.Class145();
            }
            case 140131: {
                GameCanvas.Class1(Game86.Class331, new Command(Game86.Class60, 140132), new Command(Game86.Class73, 1));
            }
            case 140132: {
                Class116();
            }
            case 14014: {
                this.Class188();
            }
            case 14015: {
                this.Class142();
            }
            case 140151: {
                this.Class141();
            }
            case 14016: {
                this.Class1(3, GameScr.Class80[GameScr.indexSelect]);
            }
            case 140161: {
                this.Class1(3, GameScr.Class80[2]);
            }
            case 14017: {
                Class112();
            }
            case 14018: {
                this.Class4((byte)34);
            }
            case 14019: {
                Class108();
            }
            case 140191: {
                Class2((byte)34);
            }
            case 140192: {
                Class3((byte)34);
            }
            case 14020: {
                if (Class123()) {
                    Service.gI().Class1((short)1, (String)o);
                    return;
                }
                GameCanvas.setText(Game86.Class413);
            }
            case 14021: {
                Class155();
            }
            case 14022: {
                Class200();
            }
            case 140221: {
                Class2((byte)35);
            }
            case 140222: {
                Class3((byte)35);
            }
            case 14023: {
                this.Class4((byte)35);
            }
            case 14024: {
                this.Class1((byte)1);
            }
            case 14025: {
                this.Class1((byte)0);
            }
            case 1500: {
                final MyVector myVector4;
                (myVector4 = new MyVector()).addElement(new Command(Game86.Class62, 15001));
                if (Char.getMyChar().xu >= 5000) {
                    myVector4.addElement(new Command(Game86.Class67, 15002));
                }
                GameCanvas.Class30.Class1(myVector4);
            }
            case 15001: {
                this.Class106();
            }
            case 15002: {
                try {
                    if ((i = Integer.parseInt(this.Class262.getText())) <= 0) {
                        GameCanvas.setText(Game86.Class443);
                    }
                    GameCanvas.Class1(Game86.Class1(Game86.Class451, Game20.Class1(new StringBuffer(String.valueOf(i)).toString())), new Command(Game86.Class60, 150021), new Command(Game86.Class73, 1));
                }
                catch (Exception ex) {
                    GameCanvas.setText(Game86.Class443);
                }
            }
            case 150021: {
                GameCanvas.Class10();
                i = 0;
                try {
                    i = Integer.parseInt(this.Class262.getText());
                }
                catch (Exception ex2) {}
                Service.gI().Class1(GameScr.Class86, i);
            }
            case 1501: {
                this.Class1(3, GameScr.Class86);
            }
            case 1502: {
                this.Class262.switchToMe();
            }
            case 1503: {
                Class107();
            }
            case 1504: {
                Class105();
            }
            case 15041: {
                Class104();
            }
            case 150411: {
                this.Class256 = 0;
                this.Class257 = 0;
                if (this.Class255 == 0) {
                    this.Class255 = 1;
                }
                else if (this.Class255 == 1) {
                    this.Class255 = 2;
                }
                else if (this.Class255 == 2) {
                    this.Class255 = 1;
                }
                this.Class103();
            }
            case 150412: {
                this.Class256 = 0;
                this.Class255 = 0;
                if (this.Class257 == 0) {
                    this.Class257 = 1;
                }
                else if (this.Class257 == 1) {
                    this.Class257 = 2;
                }
                else if (this.Class257 == 2) {
                    this.Class257 = 1;
                }
                this.Class103();
            }
            case 150413: {
                this.Class255 = 0;
                this.Class257 = 0;
                if (this.Class256 == 0) {
                    this.Class256 = 1;
                }
                else if (this.Class256 == 1) {
                    this.Class256 = 2;
                }
                else if (this.Class256 == 2) {
                    this.Class256 = 1;
                }
                this.Class103();
            }
            case 15042: {
                GameCanvas.Class1(Game86.Class1(Game86.Class452, Game20.Class1(new StringBuffer(String.valueOf(GameScr.Class81[GameScr.indexSelect].Class2)).toString())), new Command(Game86.Class60, 150421), new Command(Game86.Class73, 1));
            }
            case 150421: {
                GameCanvas.endDlg();
                Service.gI().Class28(GameScr.Class81[GameScr.indexSelect].Class1.Class3);
            }
            case 1505: {
                this.Class1(3, GameScr.Class81[GameScr.indexSelect].Class1);
            }
            case 1506: {
                if (GameScr.Class82 != null) {
                    this.Class139 = 0;
                    GameScr.Class92 = false;
                    GameScr.Class47 = -1;
                    GameScr.Class82 = null;
                    gI().left = new Command(Game86.Class119, 1506);
                    return;
                }
                GameScr.Class47 = GameScr.indexSelect;
                Service.gI().Class30();
                GameCanvas.startWaitDlgWithoutCancel();
            }
            case 1507: {
                this.Class102();
            }
            case 1508: {
                final MyVector myVector5 = new MyVector();
                final Item item6;
                if ((item6 = Char.Class57.Class16[GameScr.indexSelect]) != null) {
                    if (item6.template.id == 281) {
                        myVector5.addElement(new Command(Game86.Class55, 15081));
                    }
                    else {
                        myVector5.addElement(new Command(Game86.Class350, 15082));
                    }
                    GameCanvas.Class30.Class1(myVector5);
                    return;
                }
                break;
            }
            case 15081: {
                Service.gI().Class31();
            }
            case 15082: {
                GameCanvas.inputDlg.show(Game86.Class467, new Command(Game86.Class76, GameCanvas.instance, 88843, GameScr.indexSelect), 0);
            }
            case 1509: {
                if (GameScr.indexSelect >= 0 && Char.Class57 != null) {
                    this.Class1(39, Char.Class57.Class16[GameScr.indexSelect]);
                    return;
                }
                GameScr.Class92 = false;
            }
            case 1510: {
                Class101();
            }
            case 1511: {
                final String text3 = GameCanvas.inputDlg.tfInput.getText();
                GameCanvas.endDlg();
                try {
                    if (text3.equals("")) {
                        GameCanvas.setText(Game86.Class443);
                        return;
                    }
                    final int intValue;
                    if ((intValue = Integer.valueOf(text3)) < 10 || intValue > 90) {
                        GameCanvas.setText(Game86.Class443);
                        return;
                    }
                    Char.aHpValue = intValue;
                }
                catch (Exception ex3) {
                    GameCanvas.setText(Game86.Class443);
                }
            }
            case 1512: {
                final String text4 = GameCanvas.inputDlg.tfInput.getText();
                GameCanvas.endDlg();
                try {
                    if (text4.equals("")) {
                        GameCanvas.setText(Game86.Class443);
                        return;
                    }
                    final int intValue2;
                    if ((intValue2 = Integer.valueOf(text4)) < 10 || intValue2 > 90) {
                        GameCanvas.setText(Game86.Class443);
                        return;
                    }
                    Char.aMpValue = intValue2;
                }
                catch (Exception ex4) {
                    GameCanvas.setText(Game86.Class443);
                }
            }
            case 151301: {
                Service.gI().Class29(Char.getMyChar().mobFocus.getTemplate().Class5);
            }
            case 15130: {
                Char.Class121 = 1;
            }
            case 15131: {
                Char.Class121 = 10;
            }
            case 15132: {
                Char.Class121 = 20;
            }
            case 15133: {
                Char.Class121 = 30;
            }
            case 15134: {
                Char.Class121 = 40;
            }
            case 15135: {
                Char.Class121 = 50;
            }
            case 15136: {
                Char.Class121 = 60;
            }
            case 15137: {
                Char.Class121 = 70;
            }
            case 1515: {
                this.Class1(41, GameScr.Class97.Class80[GameScr.indexSelect]);
            }
            case 1516: {
                Service.gI().Class2(GameScr.indexSelect);
            }
            case 1600: {
                Class94();
            }
            case 1601: {
                Class135();
            }
            case 1602: {
                this.Class1(3, getItemFocus(43));
            }
            case 1603: {
                this.Class132();
            }
            case 1604: {
                final MyVector myVector6 = new MyVector();
                if (GameScr.Class77[GameScr.indexSelect] != null) {
                    myVector6.addElement(new Command(Game86.Class62, 1605));
                }
                myVector6.addElement(new Command(Game86.Class152, 11105));
                GameCanvas.Class30.Class1(myVector6);
            }
            case 1605: {
                this.Class100();
            }
            case 1606: {
                this.Class99();
            }
            case 999: {
                this.Class4(35);
            }
            case 9999: {
                this.Class4(37);
            }
            case 1700: {
                this.Class214();
            }
            case 1701: {
                Class215();
            }
            case 1702: {
                this.Class216();
            }
            case 222: {
                this.Class219();
            }
            case 333: {
                this.Class4(47);
            }
            case 334: {
                this.Class139();
            }
            case 335: {
                GameScr.Class198 = false;
                this.Class1(3, GameScr.Class85);
            }
            case 336: {
                GameScr.Class198 = false;
                this.Class1(3, GameScr.Class84);
            }
            case 337: {
                this.Class220();
            }
            case 338: {
                this.Class15(0);
            }
            case 344: {
                this.Class15(1);
            }
            case 345: {
                this.Class15(2);
            }
            case 339: {
                this.Class16(0);
            }
            case 340: {
                this.Class16(1);
            }
            case 343: {
                this.Class16(2);
            }
            case 341: {
                Class221();
            }
            case 342: {
                Class222();
            }
            case 400: {
                this.Class224();
            }
            case 401: {
                this.Class225();
            }
            case 402: {
                this.Class226();
            }
            case 403: {
                Class227();
            }
            case 405: {
                Class223();
            }
            case 500: {
                this.Class228();
            }
            case 501: {
                Service.gI().Class2(GameScr.indexSelect);
            }
            case 502: {
                this.Class48();
            }
            case 5021: {
                this.Class49();
            }
            case 5022: {
                this.Class50();
            }
            case 503: {
                this.Class1(41, GameScr.Class97.Class80[GameScr.indexSelect]);
            }
            case 504: {
                Class229();
            }
            case 5041: {
                Service.gI().Class5(GameScr.Class193 - 1, 1);
                this.Class36();
            }
            case 5042: {
                this.Class230();
            }
            case 5043: {
                Class231();
            }
            case 505: {
                Class232();
            }
            case 5051: {
                Service.gI().Class6(Char.getMyChar().nClass.Class3[GameScr.indexSelect].id, 1);
                this.Class36();
            }
            case 5052: {
                this.Class233();
            }
            case 5053: {
                Class234();
                break;
            }
        }
    }
    
    private void Class99() {
        try {
            if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id == 454) {
                if (GameScr.Class77 == null) {
                    GameScr.Class77 = new Item[24];
                }
                for (int i = 0; i < GameScr.Class77.length; ++i) {
                    if (i == 20) {
                        GameCanvas.setText(Game86.Class275);
                        return;
                    }
                    if (GameScr.Class77[i] == null) {
                        GameScr.Class77[i] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                        Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                        final Command command = null;
                        super.center = command;
                        super.left = command;
                        this.Class29();
                        return;
                    }
                }
                return;
            }
            if (Char.getMyChar().arrItemBag[GameScr.indexSelect].upgrade > 11) {
                if (GameScr.Class85 == null) {
                    GameScr.Class85 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                    Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                }
                else {
                    final Item class85 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                    Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                    Char.getMyChar().arrItemBag[GameScr.Class85.indexUI] = GameScr.Class85;
                    GameScr.Class85 = class85;
                }
                Service.gI().requestItemInfo(GameScr.Class85.typeUI, GameScr.Class85.indexUI);
                return;
            }
            GameCanvas.setText(Game86.Class489);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void Class100() {
        final Item itemFocus = getItemFocus(44);
        GameScr.Class77[GameScr.indexSelect] = null;
        Char.getMyChar().arrItemBag[itemFocus.indexUI] = itemFocus;
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private static void Class101() {
        if (GameScr.indexRow == 0) {
            Char.Class109 = !Char.Class109;
            if (GameScr.Class136 == 1) {
                Char.Class109 = false;
                InfoMe.addInfo(Game86.Class475, 20, mFont.Class12);
            }
        }
        else if (GameScr.indexRow == 1) {
            Char.Class110 = !Char.Class110;
            if (GameScr.Class136 == 1) {
                Char.Class110 = false;
                InfoMe.addInfo(Game86.Class475, 20, mFont.Class12);
            }
        }
        else if (GameScr.indexRow == 2) {
            Char.Class111 = !Char.Class111;
            if (GameScr.Class136 == 1) {
                Char.Class111 = false;
                InfoMe.addInfo(Game86.Class475, 20, mFont.Class12);
            }
        }
        else {
            if (GameScr.indexRow == 3) {
                Char.isABuff = !Char.isABuff;
                return;
            }
            if (GameScr.indexRow == 4) {
                if (Char.isAPickYen = !Char.isAPickYen) {
                    Char.Class114 = (Char.Class115 = (Char.Class116 = false));
                }
            }
            else if (GameScr.indexRow == 5) {
                if (Char.Class114 = !Char.Class114) {
                    Char.isAPickYen = (Char.Class115 = (Char.Class116 = false));
                }
            }
            else if (GameScr.indexRow == 6) {
                if (Char.Class115 = !Char.Class115) {
                    Char.isAPickYen = (Char.Class114 = (Char.Class116 = false));
                }
            }
            else if (GameScr.indexRow == 7 && (Char.Class116 = !Char.Class116)) {
                Char.isAPickYen = (Char.Class114 = (Char.Class115 = false));
            }
        }
    }
    
    private void Class102() {
        if (GameScr.Class82 != null) {
            final Item item;
            (item = new Item()).template = Game104.Class1(GameScr.Class82[GameScr.indexSelect]);
            this.Class1(38, item);
        }
    }
    
    private void Class103() {
        if (this.Class256 == 0 && this.Class255 == 0 && this.Class257 == 0) {
            return;
        }
        for (int i = 0; i < GameScr.Class81.length - 1; ++i) {
            for (int j = i + 1; j < GameScr.Class81.length; ++j) {
                if (this.Class255 == 1) {
                    if (GameScr.Class81[i].Class2 < GameScr.Class81[j].Class2) {
                        final Game48 game48 = GameScr.Class81[i];
                        final int n = i;
                        final Game48[] class81 = GameScr.Class81;
                        class81[n] = class81[j];
                        GameScr.Class81[j] = game48;
                    }
                }
                else if (this.Class255 == 2 && GameScr.Class81[i].Class2 > GameScr.Class81[j].Class2) {
                    final Game48 game49 = GameScr.Class81[i];
                    final int n2 = i;
                    final Game48[] class82 = GameScr.Class81;
                    class82[n2] = class82[j];
                    GameScr.Class81[j] = game49;
                }
                if (this.Class257 == 1) {
                    if (!GameScr.Class81[i].Class1.template.name.equals(GameScr.Class81[j].Class1.template.name) && GameScr.Class81[i].Class1.template.name.compareTo(GameScr.Class81[j].Class1.template.name) > 0) {
                        final Game48 game50 = GameScr.Class81[i];
                        final int n3 = i;
                        final Game48[] class83 = GameScr.Class81;
                        class83[n3] = class83[j];
                        GameScr.Class81[j] = game50;
                    }
                }
                else if (this.Class257 == 2 && !GameScr.Class81[i].Class1.template.name.equals(GameScr.Class81[j].Class1.template.name) && GameScr.Class81[i].Class1.template.name.compareTo(GameScr.Class81[j].Class1.template.name) < 0) {
                    final Game48 game51 = GameScr.Class81[i];
                    final int n4 = i;
                    final Game48[] class84 = GameScr.Class81;
                    class84[n4] = class84[j];
                    GameScr.Class81[j] = game51;
                }
                if (this.Class256 == 1) {
                    if (GameScr.Class81[i].Class1.template.level < GameScr.Class81[j].Class1.template.level) {
                        final Game48 game52 = GameScr.Class81[i];
                        final int n5 = i;
                        final Game48[] class85 = GameScr.Class81;
                        class85[n5] = class85[j];
                        GameScr.Class81[j] = game52;
                    }
                }
                else if (this.Class256 == 2 && GameScr.Class81[i].Class1.template.level > GameScr.Class81[j].Class1.template.level) {
                    final Game48 game53 = GameScr.Class81[i];
                    final int n6 = i;
                    final Game48[] class86 = GameScr.Class81;
                    class86[n6] = class86[j];
                    GameScr.Class81[j] = game53;
                }
            }
        }
    }
    
    private static void Class104() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class445, 150411));
        myVector.addElement(new Command(Game86.Class447, 150412));
        myVector.addElement(new Command(Game86.Class446, 150413));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class105() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class56, 15041));
        myVector.addElement(new Command(Game86.Class71, 15042));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class106() {
        Char.getMyChar().arrItemBag[GameScr.Class86.indexUI] = GameScr.Class86;
        GameScr.Class86 = null;
        final Command command = null;
        super.center = command;
        super.left = command;
    }
    
    private static void Class107() {
        final Item item;
        if ((item = Char.getMyChar().arrItemBag[GameScr.indexSelect]) == null) {
            return;
        }
        if (item.Class7 || item.Class15) {
            GameCanvas.setText(Game86.Class267);
            return;
        }
        if (GameScr.Class86 == null) {
            GameScr.Class86 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
            Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
            return;
        }
        final Item class86 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
        Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
        Char.getMyChar().arrItemBag[GameScr.Class86.indexUI] = GameScr.Class86;
        GameScr.Class86 = class86;
    }
    
    private static void Class108() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 140191));
        myVector.addElement(new Command(Game86.Class72, 140192));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class109() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class52, null, 120081, null));
        myVector.addElement(new Command(Game86.Class53, null, 12007, null));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class110() {
        if (this.Class419 == 1) {
            GameCanvas.Class37.Class1(Game86.Class431, Game86.Class430);
            GameCanvas.Class37.Class1(Game86.Class427, new Command(Game86.CLOSE, GameCanvas.Class1(), 8882, null), new Command(Game86.Class54, null, 120071, null), 0, 0);
            return;
        }
        GameCanvas.Class37.Class1(Game86.Class432, Game86.Class433);
        GameCanvas.Class37.Class1(Game86.Class428, new Command(Game86.CLOSE, GameCanvas.Class1(), 8882, null), new Command(Game86.Class76, null, 120072, null), 0, 0);
    }
    
    public static void setText(final String s) {
        for (int i = 0; i < GameScr.Class34.size(); ++i) {
            final Game80 game80;
            if ((game80 = (Game80)GameScr.Class34.elementAt(i)).Class1.equals(s) && game80.Class2 == 4) {
                GameScr.Class34.removeElementAt(i);
                break;
            }
        }
        for (int j = 0; j < GameScr.Class36.size(); ++j) {
            if (((Game80)GameScr.Class36.elementAt(j)).Class1.equals(s)) {
                GameScr.Class36.removeElementAt(j);
                return;
            }
        }
    }
    
    private static void Class111() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(String.valueOf(Game86.Class386[0]) + ": " + (GameScr.Class199 ? Game86.Class44 : Game86.Class43), 140071));
        myVector.addElement(new Command(Game86.Class387, 140072));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class112() {
        final MyVector myVector = new MyVector();
        myVector.addElement(new Command(String.valueOf(Game86.Class386[0]) + ": " + (GameScr.Class199 ? Game86.Class44 : Game86.Class43), 140071));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class113() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class392, 110441));
        myVector.addElement(new Command(String.valueOf(Game86.Class386[0]) + ": " + (GameScr.Class199 ? Game86.Class44 : Game86.Class43), 140071));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class114() {
        final MyVector myVector = new MyVector();
        if (GameScr.Class136 == 0) {
            myVector.addElement(new Command(Game86.Class47, 11000671));
        }
        else if (GameScr.Class136 == 1) {
            myVector.addElement(new Command(Game86.Class40, 11000672));
        }
        if (GameScr.Class136 == 1 || GameScr.Class136 == 2) {
            myVector.addElement(new Command(Game86.Class420, 11000674));
            myVector.addElement(new Command(Game86.Class419, 11000673));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class115() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class371, 110471));
        myVector.addElement(new Command(Game86.Class382[4], 1100061));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class116() {
        GameCanvas.endDlg();
        Service.gI().Class2(GameScr.Class80[0].indexUI, GameScr.Class80[1].indexUI, GameScr.Class80[2].indexUI);
    }
    
    private static void Class117() {
        final MyVector myVector = new MyVector();
        if (Char.getMyChar().Class56 == 3 || Char.getMyChar().Class56 == 4) {
            if (GameScr.Class193 == 1) {
                myVector.addElement(new Command(Game86.Class386[8], 140044));
            }
            myVector.addElement(new Command(Game86.Class386[2], 140041));
            myVector.addElement(new Command(Game86.Class386[5], 140042));
            if (Char.getMyChar().Class56 == 4) {
                myVector.addElement(new Command(Game86.Class386[4], 140043));
            }
            myVector.addElement(new Command(String.valueOf(Game86.Class366[10]) + ": " + (GameScr.Class87 ? Game86.Class44 : Game86.Class43), 11000665));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class118() {
        final Party party;
        if ((party = (Party)GameScr.Class33.elementAt(GameScr.indexRow)) != null && !Char.getMyChar().cName.equals(party.name)) {
            final MyVector myVector;
            (myVector = new MyVector()).addElement(new Command(Game86.Class366[6], 1108041, party.name));
            myVector.addElement(new Command(Game86.Class75, 12002, party.name));
            myVector.addElement(new Command(Game86.Class388[2], 110803, party.name));
            GameCanvas.Class30.Class1(myVector);
        }
    }
    
    private static void Class119() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class377, 110452));
        if (GameScr.Class33.size() > 0) {
            myVector.addElement(new Command(Game86.Class376, 110451));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class120() {
        final Game41 game41 = (Game41)GameScr.Class31.elementAt(GameScr.indexRow);
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class384[1], 140091, game41.Class4));
        myVector.addElement(new Command(Game86.Class384[2], 140092, game41.Class4));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class121() {
        final Game41 class73;
        if (GameScr.indexRow >= 0 && GameScr.indexRow < GameScr.Class31.size() && (class73 = Class73()) != null && !class73.Class4.equals("")) {
            Service.gI().Class6(class73.Class4);
            GameScr.Class238 = false;
            gI().Class22();
        }
    }
    
    private static void Class122() {
        final Game41 class73 = Class73();
        final MyVector myVector = new MyVector();
        if (Char.getMyChar().Class56 == 4) {
            if (class73.Class3 != 4) {
                if (class73.Class3 != 3 && class73.Class3 != 2) {
                    myVector.addElement(new Command(Game86.Class406, 14009, class73.Class4));
                }
                else {
                    myVector.addElement(new Command(Game86.Class407, 140093, class73.Class4));
                }
                if (TileMap.mapID == 98 || TileMap.mapID == 104) {
                    myVector.addElement(new Command(Game86.Class386[7], 140096, class73.Class4));
                }
                else {
                    myVector.addElement(new Command(Game86.Class386[6], 140095, class73.Class4));
                }
                myVector.addElement(new Command(Game86.Class408, 140094, class73.Class4));
            }
            myVector.addElement(new Command(Game86.Class48, 14007));
        }
        else if (Char.getMyChar().Class56 == 3) {
            if (class73.Class3 != 4 && !class73.Class4.equals(Char.getMyChar().cName)) {
                myVector.addElement(new Command(Game86.Class408, 140094, class73.Class4));
                if (TileMap.mapID == 98 || TileMap.mapID == 104) {
                    myVector.addElement(new Command(Game86.Class386[7], 140096, class73.Class4));
                }
                else {
                    myVector.addElement(new Command(Game86.Class386[6], 140095, class73.Class4));
                }
            }
            myVector.addElement(new Command(Game86.Class48, 14007));
            myVector.addElement(new Command(Game86.Class386[1], 14008, class73.Class4));
        }
        else {
            myVector.addElement(new Command(Game86.Class48, 14007));
            myVector.addElement(new Command(Game86.Class386[1], 14008, class73.Class4));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static boolean Class123() {
        for (int i = 0; i < Char.getMyChar().arrItemBag.length; ++i) {
            final Item item;
            if ((item = Char.getMyChar().arrItemBag[i]) != null && item.template.id == 279 && item.template.level <= Char.getMyChar().Class22) {
                return true;
            }
        }
        return false;
    }
    
    private static void Class2(final String s) {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class366[6], 110805));
        myVector.addElement(new Command(Game86.Class75, 12002, s));
        myVector.addElement(new Command(Game86.Class391, 110791, s));
        myVector.addElement(new Command(Game86.Class29, 14020, s));
        myVector.addElement(new Command(Game86.Class388[2], 110803, s));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class124() {
        GameScr.Class238 = true;
        GameScr.Class239 = true;
        GameScr.Class200 = false;
        final String[] array = null;
        this.Class352 = array;
        this.Class351 = array;
        setPopupSize(175, 200);
        this.Class29();
        super.right = this.cmdCloseAll;
        Service.gI().Class20();
    }
    
    private static void Class125() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class346[0], 11000661));
        myVector.addElement(new Command(Game86.Class346[1], 11000662));
        myVector.addElement(new Command(Game86.Class346[2], 11000663));
        myVector.addElement(new Command(Game86.Class346[3], 11000664));
        myVector.addElement(new Command(Game86.Class346[4], 11000666));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class126() {
        Char.getMyChar().charFocus = null;
        Char.Class165 = false;
        this.Class114 = -1;
        GameScr.Class236 = false;
        this.Class22();
    }
    
    private void Class127() {
        final Char charFocus;
        if (!(charFocus = (Char)GameScr.vCharInMap.elementAt(GameScr.indexRow)).Class3) {
            this.Class114 = charFocus.charID;
            Char.getMyChar().mobFocus = null;
            Char.getMyChar().Class22();
            Char.getMyChar().itemFocus = null;
            Char.getMyChar();
            Char.Class165 = true;
            GameScr.Class236 = false;
            Char.getMyChar().charFocus = charFocus;
        }
        this.Class22();
    }
    
    private void Class128() {
        if (GameScr.indexMenu == 0) {
            GameScr.indexMenu = 1;
        }
        else {
            GameScr.indexMenu = 0;
        }
        GameScr.indexRow = 0;
        this.Class187 = GameScr.indexMenu;
    }
    
    private static void Class129() {
        final Party party;
        if ((party = (Party)GameScr.vParty.elementAt(GameScr.indexRow)).c != null && party.c != Char.getMyChar()) {
            Service.gI().Class6(party.c.cName);
            GameScr.Class204 = false;
            gI().Class22();
        }
    }
    
    private static void Class130() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class56, 110221));
        myVector.addElement(new Command(Game86.Class64, 11050));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class131() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class56, 11048));
        myVector.addElement(new Command(Game86.Class63, 11049));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class132() {
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type == 26 || Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id == 455 || Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id == 456) {
            if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type == 26 && Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id < 10) {
                GameCanvas.setText(Game86.Class483);
                return;
            }
            short id = 0;
            int n = 0;
            final boolean b = GameScr.Class75[12] != null;
            for (int i = 0; i < GameScr.Class75.length; ++i) {
                if (GameScr.Class75[i] != null && GameScr.Class75[i].template.type != 26) {
                    id = GameScr.Class75[i].template.id;
                    ++n;
                }
            }
            for (int j = 0; j < GameScr.Class75.length; ++j) {
                if (GameScr.Class75[j] == null) {
                    if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type == 26) {
                        if (GameScr.Class75[12] == null) {
                            GameScr.Class75[12] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                            Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                        }
                        else {
                            final Item item = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                            Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                            Char.getMyChar().arrItemBag[GameScr.Class75[12].indexUI] = GameScr.Class75[12];
                            GameScr.Class75[12] = item;
                        }
                    }
                    else if (id > 0 && Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id != id) {
                        GameCanvas.setText(Game86.Class484);
                    }
                    else if ((b && n >= 3) || n >= 9) {
                        GameCanvas.setText(Game86.Class486);
                    }
                    else {
                        GameScr.Class75[j] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                        Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                    }
                    final Command command = null;
                    super.center = command;
                    super.left = command;
                    this.Class29();
                    return;
                }
            }
            GameCanvas.Class35.Class1(Game86.Class275, null, new Command(Game86.CLOSE, 2), null);
        }
        else if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id == 457) {
            GameCanvas.Class35.Class1(Game86.Class479, null, new Command(Game86.CLOSE, 2), null);
        }
        else {
            GameCanvas.Class35.Class1(Game86.Class480, null, new Command(Game86.CLOSE, 2), null);
        }
        GameCanvas.Class34 = GameCanvas.Class35;
    }
    
    private void Class133() {
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type == 26) {
            for (int i = 0; i < GameScr.Class75.length; ++i) {
                if (GameScr.Class75[i] == null) {
                    GameScr.Class75[i] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                    Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                    final Command command = null;
                    super.center = command;
                    super.left = command;
                    this.Class29();
                    return;
                }
            }
            GameCanvas.Class35.Class1(Game86.Class275, null, new Command(Game86.CLOSE, 2), null);
            GameCanvas.Class34 = GameCanvas.Class35;
            return;
        }
        GameCanvas.Class35.Class1(Game86.Class268, null, new Command(Game86.CLOSE, 2), null);
        GameCanvas.Class34 = GameCanvas.Class35;
    }
    
    private void Class134() {
        final Item itemFocus = getItemFocus(11);
        GameScr.Class75[GameScr.indexSelect] = null;
        Char.getMyChar().arrItemBag[itemFocus.indexUI] = itemFocus;
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private static void Class135() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class62, 111071));
        for (int i = 0; i < GameScr.Class75.length; ++i) {
            if (GameScr.Class75[i] != null) {
                myVector.addElement(new Command(Game86.Class152, 1600));
                break;
            }
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class136() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class62, 111071));
        for (int i = 0; i < GameScr.Class75.length; ++i) {
            if (GameScr.Class75[i] != null) {
                myVector.addElement(new Command(Game86.Class152, 11062));
                break;
            }
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class137() {
        try {
            if (GameScr.Class243) {
                if (!Char.getMyChar().arrItemBag[GameScr.indexSelect].Class2() && !Char.getMyChar().arrItemBag[GameScr.indexSelect].Class3() && Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id != 455 && Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id != 456 && Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id != 457) {
                    GameCanvas.Class35.Class1(Game86.Class487, null, new Command(Game86.CLOSE, 2), null);
                    GameCanvas.Class34 = GameCanvas.Class35;
                    return;
                }
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id == 455 || Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id == 456 || Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id == 457) {
                    if (GameScr.Class77 == null) {
                        GameScr.Class77 = new Item[24];
                    }
                    for (int i = 0; i < GameScr.Class77.length; ++i) {
                        if (GameScr.Class77[i] == null) {
                            GameScr.Class77[i] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                            Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                            final Command command = null;
                            super.center = command;
                            super.left = command;
                            this.Class29();
                            return;
                        }
                        if (i == GameScr.Class77.length - 1) {
                            GameCanvas.setText(Game86.Class275);
                        }
                    }
                    return;
                }
                ItemOption itemOption = null;
                for (int n = 0; n < Char.getMyChar().arrItemBag[GameScr.indexSelect].options.size() && (itemOption = (ItemOption)Char.getMyChar().arrItemBag[GameScr.indexSelect].options.elementAt(n)).optionTemplate.id != 85; ++n) {
                    itemOption = null;
                }
                if (itemOption != null && itemOption.param >= 9) {
                    GameCanvas.setText(Game86.Class496);
                    return;
                }
                if (GameScr.Class85 == null) {
                    GameScr.Class85 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                    Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                }
                else {
                    final Item class85 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                    Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                    Char.getMyChar().arrItemBag[GameScr.Class85.indexUI] = GameScr.Class85;
                    GameScr.Class85 = class85;
                }
                Service.gI().requestItemInfo(GameScr.Class85.typeUI, GameScr.Class85.indexUI);
            }
            else {
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect].Class2() && Char.getMyChar().arrItemBag[GameScr.indexSelect].upgrade > 0) {
                    if (GameScr.Class85 == null) {
                        GameScr.Class85 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                        Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                    }
                    else {
                        final Item class86 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                        Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                        Char.getMyChar().arrItemBag[GameScr.Class85.indexUI] = GameScr.Class85;
                        GameScr.Class85 = class86;
                    }
                    if (GameScr.Class85 != null) {
                        int n2 = 0;
                        if (GameScr.Class85.Class18()) {
                            for (int j = 0; j < GameScr.Class85.upgrade; ++j) {
                                n2 += GameScr.Class100[j];
                            }
                        }
                        else if (GameScr.Class85.Class19()) {
                            for (int k = 0; k < GameScr.Class85.upgrade; ++k) {
                                n2 += GameScr.Class101[k];
                            }
                        }
                        else if (GameScr.Class85.Class20()) {
                            for (int l = 0; l < GameScr.Class85.upgrade; ++l) {
                                n2 += GameScr.Class102[l];
                            }
                        }
                        int n3 = n2 / 2;
                        int n4 = 0;
                        GameScr.Class77 = new Item[24];
                        for (int n5 = GameScr.Class99.length - 1; n5 >= 0; --n5) {
                            if (n3 >= GameScr.Class99[n5]) {
                                GameScr.Class77[n4] = new Item();
                                GameScr.Class77[n4].typeUI = 3;
                                GameScr.Class77[n4].template = Game104.Class1((short)n5);
                                GameScr.Class77[n4].Class7 = GameScr.Class85.Class7;
                                GameScr.Class77[n4].Class6 = -1L;
                                n3 -= GameScr.Class99[n5];
                                ++n5;
                                ++n4;
                            }
                        }
                    }
                    final Command command2 = null;
                    super.center = command2;
                    super.left = command2;
                    this.Class29();
                    return;
                }
                GameCanvas.Class35.Class1(Game86.Class273, null, new Command(Game86.CLOSE, 2), null);
                GameCanvas.Class34 = GameCanvas.Class35;
            }
        }
        catch (Exception ex) {
            GameCanvas.Class35.Class1(Game86.Class487, null, new Command(Game86.CLOSE, 2), null);
            GameCanvas.Class34 = GameCanvas.Class35;
        }
    }
    
    private void Class138() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(this.Class362);
        if (GameScr.Class85 != null) {
            myVector.addElement(new Command(Game86.Class152, 111031));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class139() {
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect].Class2()) {
            if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.level < 10 || Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type >= 10) {
                GameCanvas.Class35.Class1(Game86.Class271, null, new Command(Game86.CLOSE, 2), null);
                GameCanvas.Class34 = GameCanvas.Class35;
                return;
            }
            if (Char.getMyChar().arrItemBag[GameScr.indexSelect].upgrade >= Char.getMyChar().arrItemBag[GameScr.indexSelect].Class17()) {
                GameCanvas.Class35.Class1(Game86.Class272, null, new Command(Game86.CLOSE, 2), null);
                GameCanvas.Class34 = GameCanvas.Class35;
                return;
            }
            if (GameScr.Class84 == null) {
                GameScr.Class84 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
            }
            else {
                final Item class84 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                Char.getMyChar().arrItemBag[GameScr.Class84.indexUI] = GameScr.Class84;
                GameScr.Class84 = class84;
            }
            final Command command = null;
            super.center = command;
            super.left = command;
            this.Class29();
        }
        else {
            if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type == 26 || Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type == 28) {
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type == 28) {
                    for (int i = 0; i < GameScr.Class76.length; ++i) {
                        if (GameScr.Class76[i] != null && GameScr.Class76[i].template.type == 28) {
                            final Item item = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                            Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                            Char.getMyChar().arrItemBag[GameScr.Class76[i].indexUI] = GameScr.Class76[i];
                            GameScr.Class76[i] = item;
                            return;
                        }
                    }
                }
                for (int j = 0; j < GameScr.Class76.length; ++j) {
                    if (GameScr.Class76[j] == null) {
                        GameScr.Class76[j] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                        Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                        final Command command2 = null;
                        super.center = command2;
                        super.left = command2;
                        this.Class29();
                        return;
                    }
                }
                GameCanvas.Class35.Class1(Game86.Class275, null, new Command(Game86.CLOSE, 2), null);
                GameCanvas.Class34 = GameCanvas.Class35;
                return;
            }
            GameCanvas.Class35.Class1(Game86.Class269, null, new Command(Game86.CLOSE, 2), null);
            GameCanvas.Class34 = GameCanvas.Class35;
        }
    }
    
    private void Class12(final int n) {
        if (GameScr.Class80[n] == null) {
            GameScr.Class80[n] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
            Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
        }
        else {
            final Item item = Char.getMyChar().arrItemBag[GameScr.indexSelect];
            Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
            Char.getMyChar().arrItemBag[GameScr.Class80[n].indexUI] = GameScr.Class80[n];
            GameScr.Class80[n] = item;
        }
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private void Class140() {
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect].Class2()) {
            if (Char.getMyChar().arrItemBag[GameScr.indexSelect].upgrade > 0) {
                this.Class12(0);
                return;
            }
            this.Class12(1);
        }
        else {
            if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id == 269 || Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id == 270 || Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id == 271) {
                this.Class12(2);
                return;
            }
            GameCanvas.Class35.Class1(Game86.Class270, null, new Command(Game86.CLOSE, 2), null);
            GameCanvas.Class34 = GameCanvas.Class35;
        }
    }
    
    private void Class141() {
        final Item item = GameScr.Class80[2];
        GameScr.Class80[2] = null;
        Char.getMyChar().arrItemBag[item.indexUI] = item;
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private void Class142() {
        final Item item = GameScr.Class80[GameScr.indexSelect];
        GameScr.Class80[GameScr.indexSelect] = null;
        Char.getMyChar().arrItemBag[item.indexUI] = item;
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private void Class143() {
        final Item itemFocus = getItemFocus(10);
        GameScr.Class76[GameScr.indexSelect] = null;
        Char.getMyChar().arrItemBag[itemFocus.indexUI] = itemFocus;
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private static void Class144() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class62, 111001));
        if (GameScr.Class84 != null) {
            for (int i = 0; i < GameScr.Class76.length; ++i) {
                if (GameScr.Class76[i] != null) {
                    myVector.addElement(new Command(Game86.Class152, 110981));
                    break;
                }
            }
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class145() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(this.Class361);
        for (int i = 0; i < GameScr.Class80.length; ++i) {
            if (GameScr.Class80[i] == null) {
                super.left = null;
                break;
            }
            if (i == GameScr.Class80.length - 1) {
                myVector.addElement(new Command(Game86.Class152, 140131));
            }
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class146() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(this.Class360);
        for (int i = 0; i < GameScr.Class76.length; ++i) {
            if (GameScr.Class76[i] != null) {
                myVector.addElement(new Command(Game86.Class152, 110981));
                break;
            }
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class3(final Item item) {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 110921, item));
        myVector.addElement(new Command(Game86.Class72, 110922, item));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class147() {
        GameScr.indexRow = 0;
        GameScr.Class50.Class1();
        if (GameScr.Class278 == 0) {
            GameScr.Class278 = 1;
            return;
        }
        GameScr.Class278 = 0;
    }
    
    private void Class148() {
        GameScr.indexMenu = 0;
        GameScr.Class93 = false;
        super.left = this.Class286;
        super.right = this.Class184;
        super.center = null;
        System.gc();
        this.Class22();
        this.Class56();
    }
    
    private static void Class149() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 110851));
        myVector.addElement(new Command(Game86.Class72, 110852));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class150() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class103, 110841));
        myVector.addElement(new Command(Game86.Class104, 110842));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class151() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class290, 110821));
        if (!GameCanvas.Class6) {
            if (GameScr.Class346 == 0) {
                myVector.addElement(new Command(Game86.Class505, 2003));
            }
            else {
                myVector.addElement(new Command(Game86.Class504, 2003));
            }
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class152() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class436[0], 110811));
        myVector.addElement(new Command(Game86.Class436[1], 110812));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class3(final String s) {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class388[0], 110801));
        myVector.addElement(new Command(Game86.Class388[1], 110802));
        myVector.addElement(new Command(Game86.Class388[2], 110803, s));
        myVector.addElement(new Command(Game86.Class366[7], 12002, s));
        myVector.addElement(new Command(Game86.Class366[6], 110804));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class153() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class103, 140011));
        myVector.addElement(new Command(Game86.Class104, 140012));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class4(final String s) {
        GameCanvas.Class1(Game86.Class394, new Command(Game86.Class60, 1107921, s), new Command(Game86.Class73, 1));
    }
    
    private static void Class154() {
        final Game80 game80 = (Game80)GameScr.Class34.elementAt(GameScr.indexRow);
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class366[6], 1108041, game80.Class1));
        myVector.addElement(new Command(Game86.Class75, 12002, game80.Class1));
        if (game80.Class2 == 4) {
            myVector.addElement(new Command(Game86.Class107, 1107931, game80.Class1));
            myVector.addElement(new Command(Game86.Class108, 1107932, game80.Class1));
        }
        else {
            myVector.addElement(new Command(Game86.Class391, 110791, game80.Class1));
            myVector.addElement(new Command(Game86.Class29, 14020, game80.Class1));
            myVector.addElement(new Command(Game86.Class49, 110792, game80.Class1));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class1(final byte b) {
        if (GameScr.indexRow < 0 || GameScr.indexRow >= GameScr.Class35.size()) {
            return;
        }
        try {
            final Game60 game60;
            String class2;
            if ((game60 = (Game60)GameScr.Class35.elementAt(GameScr.indexRow)) != null) {
                class2 = game60.Class2;
            }
            else {
                class2 = "raned=null";
            }
            Service.gI().Class1(b, class2);
            this.Class22();
        }
        catch (Exception ex) {}
    }
    
    private static void Class155() {
        if (GameScr.indexRow < 0 || GameScr.indexRow >= GameScr.Class35.size()) {
            return;
        }
        Service.gI().Class22(((Game103)GameScr.Class35.elementAt(GameScr.indexRow)).Class1);
    }
    
    private static void Class156() {
        final Game80 game80 = (Game80)GameScr.Class37.elementAt(GameScr.indexRow);
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class366[6], 1108041, game80.Class1));
        myVector.addElement(new Command(Game86.Class75, 12002, game80.Class1));
        myVector.addElement(new Command(Game86.Class391, 11076, game80.Class1));
        myVector.addElement(new Command(Game86.Class29, 14020, game80.Class1));
        myVector.addElement(new Command(Game86.Class49, 11077, game80.Class1));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class5(final String s) {
        GameCanvas.Class1(Game86.Class394, new Command(Game86.Class60, 110771, s), new Command(Game86.Class73, 1));
    }
    
    private void Class157() {
        GameScr.isPaintAlert = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        this.Class22();
    }
    
    private void Class1(final short n, final String s) {
        Game20.Class1(s, n);
        GameScr.isPaintAlert = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        this.Class22();
    }
    
    private static void Class158() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class67, 110721));
        myVector.addElement(new Command(Game86.Class68, 110722));
        myVector.addElement(new Command(Game86.Class69, 110723));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class1(final Party party) {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class372, 110701));
        if (!party.Class5) {
            myVector.addElement(new Command(Game86.Class374, 110702));
        }
        else {
            myVector.addElement(new Command(Game86.Class375, 110703));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class159() {
        GameScr.isPaintAlert = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        this.Class22();
    }
    
    private void Class6(final String s) {
        Game20.Class2(s);
        GameScr.isPaintAlert = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        this.Class22();
    }
    
    private static void Class160() {
        GameCanvas.endDlg();
        Service.gI().Class1(GameScr.Class84, GameScr.Class76, GameScr.Class232);
    }
    
    private static void Class4(final Item item) {
        GameCanvas.endDlg();
        Service.gI().saleItem(item.indexUI, 1);
    }
    
    private void Class161() {
        GameScr.indexMenu = 0;
        GameScr.Class93 = false;
        this.Class22();
        if (GameScr.Class97.charID == Char.getMyChar().charID) {
            this.Class56();
        }
    }
    
    private void Class162() {
        if (this.Class295 < 0 || this.Class295 >= GameScr.Class285.length) {
            return;
        }
        this.Class1(GameScr.Class285[this.Class295], false, true);
    }
    
    private static void Class5(final Item item) {
        final String class9;
        if ((class9 = GameCanvas.inputDlg.tfInput.Class9).trim().equals("")) {
            return;
        }
        int int1;
        try {
            int1 = Integer.parseInt(class9);
        }
        catch (Exception ex) {
            GameCanvas.endDlg();
            return;
        }
        if (int1 <= 0) {
            GameCanvas.endDlg();
            return;
        }
        if (int1 > item.quantity) {
            GameCanvas.setText(Game86.Class304);
            return;
        }
        GameCanvas.endDlg();
        GameCanvas.Class1(Game86.Class295, new Command(Game86.Class60, 11058, item), new Command(Game86.Class73, 1));
    }
    
    private static void Class6(final Item item) {
        final String class9;
        if ((class9 = GameCanvas.inputDlg.tfInput.Class9).trim().equals("")) {
            GameCanvas.Class35.Class1(Game86.Class300, null, new Command(Game86.CLOSE, 1), null);
            GameCanvas.Class34 = GameCanvas.Class35;
            return;
        }
        int int1;
        try {
            int1 = Integer.parseInt(class9);
        }
        catch (Exception ex) {
            GameCanvas.endDlg();
            return;
        }
        if (int1 <= 0) {
            GameCanvas.endDlg();
            return;
        }
        Service.gI().buyItem(item.typeUI, item.indexUI, int1);
        GameCanvas.endDlg();
    }
    
    private void Class163() {
        final int indexSelect = GameScr.indexSelect;
        this.Class22();
        this.Class258 = indexSelect;
        Service.gI().openUIZone();
    }
    
    private static void Class7(final Item item) {
        final MyVector myVector = new MyVector();
        for (int i = 1; i < Game86.Class351[3].length; ++i) {
            myVector.addElement(new Command(Game86.Class351[3][i], 110531, item));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class164() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(String.valueOf(Game86.Class404) + (ChatManager.Class4 ? Game86.Class43 : Game86.Class44), 120061));
        myVector.addElement(new Command(String.valueOf(Game86.Class405) + (ChatManager.Class5 ? Game86.Class43 : Game86.Class44), 120062));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class165() {
        final MyVector myVector = new MyVector();
        for (int i = 0; i < ChatManager.gI().Class1.size(); ++i) {
            myVector.addElement(new Command(((Game44)ChatManager.gI().Class1.elementAt(i)).Class2, 12001, (Object)i));
        }
        myVector.addElement(new Command(Game86.Class434, 12006));
        myVector.addElement(new Command(Game86.Class435, 12008));
        GameCanvas.Class30.Class1(myVector);
        GameScr.Class88 = true;
    }
    
    private void Class166() {
        final Game44 class5 = ChatManager.gI().Class5();
        GameScr.isPaintAlert = true;
        GameScr.Class96 = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        if (GameCanvas.Class26 - GameScr.Class159 < 40 && !GameCanvas.Class6) {
            GameScr.Class159 -= 52;
        }
        super.right = new Command(Game86.CLOSE, 11066);
        final Command command = null;
        super.center = command;
        super.left = command;
        if (!GameCanvas.Class6) {
            Class167();
        }
        else {
            super.left = new Command(Game86.Class75, 12005);
        }
        if (class5.Class1 == 2) {
            super.center = new Command(Game86.Class35, 120051, class5);
        }
        Game23.Class1().Class6 = null;
        this.textsTitle = class5.Class2;
        this.texts = class5.Class3;
        ChatManager.gI().Class5(class5.Class2);
        if (class5.Class1 == 1) {
            ChatManager.Class7 = false;
        }
        if (class5.Class1 == 4) {
            ChatManager.Class6 = false;
        }
        this.Class35();
    }
    
    private static void Class167() {
        final Game44 class5;
        if ((class5 = ChatManager.gI().Class5()).Class1 == 0) {
            Game23.Class1().setText(Game86.Class400[0]);
        }
        if (class5.Class1 == 1) {
            Game23.Class1().setText(Game86.Class401[0]);
        }
        if (class5.Class1 == 2) {
            Game23.Class1().setText(class5.Class2);
        }
        if (class5.Class1 == 3) {
            Game23.Class1().setText(Game86.Class402[0]);
        }
        if (class5.Class1 == 4) {
            Game23.Class1().setText(Game86.Class403[0]);
        }
    }
    
    private void Class168() {
        try {
            GameMidlet.Class6.platformRequest(this.Class392);
        }
        catch (ConnectionNotFoundException ex) {
            ((Throwable)ex).printStackTrace();
        }
    }
    
    private static void Class169() {
        GameCanvas.endDlg();
        Service.gI().useItem(GameScr.indexSelect);
    }
    
    private static void Class170() {
        Service.gI().Class7();
    }
    
    private static void Class171() {
        Service.gI().Class18();
    }
    
    private static void Class172() {
        GameScr.indexRow = 0;
        Service.gI().Class4();
    }
    
    private static void Class173() {
        final Party party;
        if (GameScr.indexRow >= 0 && GameScr.indexRow < GameScr.Class33.size() && (party = (Party)GameScr.Class33.elementAt(GameScr.indexRow)) != null) {
            Service.gI().Class5(party.name);
        }
    }
    
    private static void Class13(final int n) {
        switch (n) {
            case 1: {
                Service.gI().changePk(0);
            }
            case 2: {
                Service.gI().changePk(1);
            }
            case 3: {
                Service.gI().changePk(3);
                break;
            }
        }
    }
    
    private static void Class174() {
        final String class9;
        if ((class9 = GameCanvas.inputDlg.tfInput.Class9).trim().equals("")) {
            GameCanvas.endDlg();
            return;
        }
        int int1;
        try {
            int1 = Integer.parseInt(class9);
        }
        catch (Exception ex) {
            GameCanvas.endDlg();
            return;
        }
        if (int1 <= 0) {
            GameCanvas.endDlg();
            return;
        }
        if (Char.getMyChar().xu == 0 || int1 > Char.getMyChar().xu) {
            GameCanvas.setText(Game86.Class302);
            return;
        }
        Service.gI().Class9(int1);
        GameCanvas.endDlg();
    }
    
    private void Class175() {
        final String class9;
        if ((class9 = GameCanvas.inputDlg.tfInput.Class9).trim().equals("")) {
            GameCanvas.endDlg();
            return;
        }
        int int1;
        try {
            int1 = Integer.parseInt(class9);
        }
        catch (Exception ex) {
            GameCanvas.endDlg();
            return;
        }
        if (int1 <= 0) {
            GameCanvas.endDlg();
            return;
        }
        if (Char.getMyChar().xu == 0 || int1 > Char.getMyChar().xu) {
            GameCanvas.setText(Game86.Class301);
            return;
        }
        this.coinTrade += int1;
        final Char myChar = Char.getMyChar();
        myChar.xu -= int1;
        GameCanvas.endDlg();
    }
    
    private static void Class176() {
        final String class9;
        if ((class9 = GameCanvas.inputDlg.tfInput.Class9).trim().equals("")) {
            GameCanvas.endDlg();
            return;
        }
        int int1;
        try {
            int1 = Integer.parseInt(class9);
        }
        catch (Exception ex) {
            GameCanvas.endDlg();
            return;
        }
        if (int1 <= 0) {
            GameCanvas.endDlg();
            return;
        }
        if (Char.getMyChar().Class68 == 0 || int1 > Char.getMyChar().Class68) {
            GameCanvas.setText(Game86.Class303);
            return;
        }
        Service.gI().Class10(int1);
        GameCanvas.endDlg();
    }
    
    private static void Class177() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class381[0], 11000651));
        myVector.addElement(new Command(Game86.Class381[1], 11000652));
        myVector.addElement(new Command(Game86.Class381[3], 11000653));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class178() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class382[6], 1100067));
        myVector.addElement(new Command(Game86.Class382[3], 1100062));
        myVector.addElement(new Command(Game86.Class382[1], 1100063));
        myVector.addElement(new Command(Game86.Class382[2], 1100064));
        myVector.addElement(new Command(Game86.Class382[0], 1100065));
        myVector.addElement(new Command(Game86.Class382[7], 1100068));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class179() {
        this.Class51();
        if (super.right != null) {
            super.right.Class1();
        }
    }
    
    private void Class180() {
        this.Class51();
        if (super.left != null) {
            super.left.Class1();
        }
    }
    
    private void Class14(final int n) {
        if (Char.getMyChar().charFocus != null && !Char.getMyChar().charFocus.Class3) {
            switch (n) {
                case 1: {
                    Service.gI().addParty(Char.getMyChar().charFocus.cName);
                }
                case 2: {
                    Service.gI().tradeInvite(Char.getMyChar().charFocus.charID);
                }
                case 3: {
                    Service.gI().Class15(Char.getMyChar().charFocus.charID);
                }
                case 4: {
                    Service.gI().Class16(Char.getMyChar().charFocus.charID);
                }
                case 5: {
                    this.Class7(Char.getMyChar().charFocus.charID);
                }
                case 6: {
                    Service.gI().Class2(Char.getMyChar().charFocus.cName);
                }
                case 7: {
                    Service.gI().Class6(Char.getMyChar().charFocus.cName);
                    gI().Class22();
                }
                case 8: {
                    Service.gI().Class25(Char.getMyChar().charFocus.charID);
                }
                case 9: {
                    Service.gI().Class26(Char.getMyChar().charFocus.charID);
                }
                case 10: {
                    Char.Class117 = !Char.Class117;
                    Char.Class122 = Char.getMyChar().charFocus.charID;
                    break;
                }
            }
        }
    }
    
    public final void Class7(final int n) {
        if (System.currentTimeMillis() - this.Class421 > 500L) {
            Service.gI().buffLive(n);
            this.Class421 = System.currentTimeMillis();
        }
        if ((TileMap.tileTypeAtPixel(Char.getMyChar().cx, Char.getMyChar().cy) & 0x2) == 0x2) {
            Char.getMyChar().Class1(GameScr.sks[49], 0);
            return;
        }
        Char.getMyChar().Class1(GameScr.sks[49], 1);
    }
    
    private static void Class181() {
        GameCanvas.Class10();
        ChatManager.gI();
        ChatManager.Class2 = null;
        Session_ME.gI().Class2();
        RMS.Class1 = 9999;
        RMS.Class2 = System.currentTimeMillis() + 1000L;
        RMS.Class3 = true;
    }
    
    private static void Class182() {
        GameCanvas.Class1(Game86.Class127, new Command(Game86.Class60, 1100041), new Command(Game86.Class73, 1));
    }
    
    private static void Class183() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class369[1], 110381));
        myVector.addElement(new Command(Game86.Class369[2], 110382));
        myVector.addElement(new Command(Game86.Class369[3], 110383));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class184() {
        Service.gI().bagSort();
    }
    
    private void Class185() {
        final Item item = GameScr.arrItemTradeMe[GameScr.indexSelect];
        GameScr.arrItemTradeMe[GameScr.indexSelect] = null;
        Char.getMyChar().arrItemBag[item.indexUI] = item;
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private void Class186() {
        final Item class85 = GameScr.Class85;
        Char.getMyChar().arrItemBag[class85.indexUI] = class85;
        GameScr.Class85 = null;
        if (!GameScr.Class243 && !GameScr.Class244 && !GameScr.Class245 && GameScr.Class77 != null) {
            for (int i = 0; i < GameScr.Class77.length; ++i) {
                GameScr.Class77[i] = null;
            }
        }
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private void Class187() {
        final Item class84 = GameScr.Class84;
        Char.getMyChar().arrItemBag[class84.indexUI] = class84;
        GameScr.Class84 = null;
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private void Class188() {
        final Item item = GameScr.Class80[GameScr.indexSelect];
        Char.getMyChar().arrItemBag[item.indexUI] = item;
        GameScr.Class80[GameScr.indexSelect] = null;
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private void Class189() {
        Service.gI().tradeAccept();
        this.typeTrade = 2;
        if (gI().typeTrade >= 2 && gI().typeTradeOrder >= 2) {
            InfoDlg.Class1();
        }
    }
    
    private void Class190() {
        Service.gI().tradeItemLock(this.coinTrade, GameScr.arrItemTradeMe);
        this.typeTrade = 1;
        if (gI().typeTrade == 1 && gI().typeTradeOrder == 1) {
            gI().Class113 = (int)(System.currentTimeMillis() / 1000L + 5L);
        }
        super.left = this.Class356;
    }
    
    private void Class191() {
        this.Class1(3, GameScr.arrItemTradeMe[GameScr.indexSelect]);
    }
    
    private void Class192() {
        if (!Char.getMyChar().arrItemBag[GameScr.indexSelect].Class7) {
            for (int i = 0; i < GameScr.arrItemTradeMe.length; ++i) {
                if (GameScr.arrItemTradeMe[i] == null) {
                    GameScr.arrItemTradeMe[i] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                    Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                    final Command command = null;
                    super.center = command;
                    super.left = command;
                    this.Class29();
                    return;
                }
            }
            GameCanvas.Class35.Class1(Game86.Class274, null, new Command(Game86.CLOSE, 2), null);
            GameCanvas.Class34 = GameCanvas.Class35;
            return;
        }
        GameCanvas.Class35.Class1(Game86.Class266, null, new Command(Game86.CLOSE, 2), null);
        GameCanvas.Class34 = GameCanvas.Class35;
    }
    
    private void Class193() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(this.Class366);
        myVector.addElement(this.Class363);
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class194() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(this.Class364);
        if (this.typeTrade == 0) {
            myVector.addElement(this.Class355);
        }
        else if (this.typeTrade == 1 && this.typeTradeOrder > 0 && this.Class113 - System.currentTimeMillis() / 1000L <= 0L) {
            myVector.addElement(this.Class356);
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class195() {
        try {
            final Item itemFocus;
            if ((itemFocus = getItemFocus(3)).template.Class3 != 2 && itemFocus.template.Class3 != Char.getMyChar().cgender) {
                GameCanvas.Class35.Class1(Game86.Class318, null, new Command(Game86.CLOSE, 1), null);
                GameCanvas.Class34 = GameCanvas.Class35;
                return;
            }
            if (itemFocus.template.level > Char.getMyChar().Class22) {
                GameCanvas.Class35.Class1(Game86.Class320, null, new Command(Game86.CLOSE, 1), null);
                GameCanvas.Class34 = GameCanvas.Class35;
                return;
            }
            if ((itemFocus.Class2() || itemFocus.Class3()) && !itemFocus.Class7) {
                GameCanvas.Class1(Game86.Class294, new Command(Game86.Class60, 11051, null), new Command(Game86.Class73, 1));
                return;
            }
            if (itemFocus.template.id == 35 || itemFocus.template.id == 37) {
                final MyVector myVector = new MyVector();
                for (int i = 0; i < 3; ++i) {
                    myVector.addElement(new Command(Game86.Class351[i][0], 11052, itemFocus));
                }
                myVector.addElement(new Command(Game86.Class351[3][0], 11053, itemFocus));
                myVector.addElement(new Command(Game86.Class351[4][0], 11054));
                GameCanvas.Class30.Class1(myVector);
                return;
            }
            if (itemFocus.template.id == 514) {
                GameCanvas.Class37.Class1("\u0110\u1ebfn: ", "L\u1eddi ch\u00fac: ");
                GameCanvas.Class37.Class1("Ch\u00fac t\u1ebft", new Command(Game86.CLOSE, GameCanvas.instance, 8882, null), new Command("G\u1eedi", GameCanvas.instance, 1608, null), 0, 0);
                return;
            }
            if (itemFocus.template.id == 515) {
                GameCanvas.Class37.Class1("\u0110\u1ebfn: ", "L\u1eddi ch\u00fac: ");
                GameCanvas.Class37.Class1("Ch\u00fac t\u1ebft", new Command(Game86.CLOSE, GameCanvas.instance, 8882, null), new Command("G\u1eedi", GameCanvas.instance, 16081, null), 0, 0);
                return;
            }
            Service.gI().useItem(GameScr.indexSelect);
        }
        catch (Exception ex) {}
    }
    
    private static void Class196() {
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect] == null || Char.getMyChar().arrItemBag[GameScr.indexSelect].quantity <= 1) {
            return;
        }
        GameCanvas.inputDlg.show(Game86.Class429, new Command(Game86.Class76, GameCanvas.instance, 88835, new StringBuffer(String.valueOf(GameScr.indexSelect)).toString()), 1);
    }
    
    private static void Class197() {
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect] == null) {
            return;
        }
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect].Class7) {
            InfoMe.Class1(Game86.Class358);
            return;
        }
        GameCanvas.Class1(Game86.Class206, new Command(Game86.Class60, 2001), new Command(Game86.Class73, 2002));
    }
    
    private void Class198() {
        if (GameScr.Class193 == 1) {
            final Item itemFocus = getItemFocus(3);
            if (GameCanvas.Class9) {
                this.Class1(itemFocus, this.Class411);
                return;
            }
            this.Class1(itemFocus, null);
        }
    }
    
    private void Class199() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(this.Class411);
        myVector.addElement(this.Class414);
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
            final RMS game1 = AutoBuy.Game1(Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id);
            myVector.addElement(new Command((game1 == null) ? "\u0110\u1eb7t gi\u00e1" : game1.Game2, Selection.gI(), 11, 0));
            if (game1 != null) {
                myVector.addElement(new Command("H\u1ee7y Mua B\u00e1n", Selection.gI(), 13, 0));
            }
        }
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null && Char.getMyChar().arrItemBag[GameScr.indexSelect].quantity > 1) {
            myVector.addElement(this.Class415);
        }
        myVector.addElement(new Command(Game86.Class56, 110221));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class200() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 140221));
        myVector.addElement(new Command(Game86.Class72, 140222));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class201() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 110201));
        myVector.addElement(new Command(Game86.Class72, 110202));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class202() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 110181));
        myVector.addElement(new Command(Game86.Class72, 110182));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class203() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 130021));
        myVector.addElement(new Command(Game86.Class72, 130022));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class204() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 110161));
        myVector.addElement(new Command(Game86.Class72, 110162));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class205() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 110141));
        myVector.addElement(new Command(Game86.Class72, 110142));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class206() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 110121));
        myVector.addElement(new Command(Game86.Class72, 110122));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class207() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 110101));
        myVector.addElement(new Command(Game86.Class72, 110102));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class208() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 110081));
        myVector.addElement(new Command(Game86.Class72, 110082));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class209() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class71, 110051));
        myVector.addElement(new Command(Game86.Class72, 110052));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class2(final byte b) {
        final Item itemFocus = getItemFocus(b);
        Service.gI().buyItem(itemFocus.typeUI, itemFocus.indexUI, 1);
    }
    
    private static void Class3(final byte b) {
        Class1(getItemFocus(b));
    }
    
    private void Class4(final byte b) {
        final Item itemFocus = getItemFocus(b);
        this.Class1(itemFocus.typeUI, itemFocus);
    }
    
    private static void Class210() {
        final String class9;
        if ((class9 = GameCanvas.inputDlg.tfInput.Class9).trim().equals("")) {
            GameCanvas.setText(Game86.Class277);
            return;
        }
        int int1;
        try {
            int1 = Integer.parseInt(class9);
        }
        catch (Exception ex) {
            GameCanvas.endDlg();
            return;
        }
        if (int1 <= 0) {
            GameCanvas.endDlg();
            return;
        }
        if (Char.getMyChar().Class31 == 0 || int1 > Char.getMyChar().Class31) {
            GameCanvas.setText(Game86.Class276);
            return;
        }
        Service.gI().Class5(GameScr.Class193 - 1, int1);
        GameCanvas.endDlg();
    }
    
    private static void Class211() {
        final String class9;
        if ((class9 = GameCanvas.inputDlg.tfInput.Class9).trim().equals("")) {
            GameCanvas.setText(Game86.Class277);
            return;
        }
        int int1;
        try {
            int1 = Integer.parseInt(class9);
        }
        catch (Exception ex) {
            GameCanvas.endDlg();
            return;
        }
        if (Char.getMyChar().Class32 == 0 || int1 > Char.getMyChar().Class32) {
            GameCanvas.setText(Game86.Class277);
            GameCanvas.Class34 = GameCanvas.Class35;
            return;
        }
        Service.gI().Class6(Char.getMyChar().nClass.Class3[GameScr.indexSelect].id, int1);
        GameCanvas.endDlg();
    }
    
    private static void Class212() {
        final String class9;
        if ((class9 = GameCanvas.inputDlg.tfInput.Class9).trim().equals("")) {
            GameCanvas.setText(Game86.Class282);
            return;
        }
        Service.gI().Class2(class9);
        GameCanvas.endDlg();
    }
    
    public final void perform(final int n, final Object o) {
        if (n == 9999) {
            GameCanvas.instance.Class12();
        }
        if (n == 10) {
            super.right = this.cmdCloseAll;
            GameScr.indexMenu = 0;
            GameScr.ItemNhat = true;
            setPopupSize(175, 200);
            return;
        }
        if (n == 11) {
            super.right = this.cmdCloseAll;
            GameScr.indexMenu = 0;
            GameScr.ItemBan = true;
            setPopupSize(175, 200);
            return;
        }
        if (n == 12) {
            super.right = this.cmdCloseAll;
            GameScr.indexMenu = 0;
            GameScr.ItemVut = true;
            setPopupSize(175, 200);
            return;
        }
        if (n == 4) {
            Code.Game4(Code.Itemdell[GameScr.indexSelect]);
            return;
        }
        if (n == 5) {
            Code.Game13();
            return;
        }
        if (n == 6) {
            Code.Game3(Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id);
            return;
        }
        if (n == 1) {
            Code.Game2(Code.ShortItemNhat[GameScr.indexSelect]);
            return;
        }
        if (n == 2) {
            Code.Game12();
            return;
        }
        if (n == 3) {
            Code.Game1(Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id);
            return;
        }
        if (n == 7) {
            Code.Game6(Code.Boradat[GameScr.indexSelect]);
            return;
        }
        if (n == 8) {
            Code.Game15();
            return;
        }
        if (n == 9) {
            Code.Game5(Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id);
        }
    }
    
    public final void Class37() {
        this.Class36();
        GameScr.indexMenu = 3;
        GameScr.Class93 = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
    }
    
    public static void Class38() {
        GameScr.Class424 = new int[GameScr.vMob.size()];
        GameScr.Class425 = new int[GameScr.vMob.size()];
        for (int i = 0; i < GameScr.vMob.size(); ++i) {
            if (i != GameScr.Class423) {
                final Mob mob = (Mob)GameScr.vMob.elementAt(i);
                if (!GameScr.Class151) {
                    GameScr.Class424[i] = Math.abs(mob.xFirst - GameScr.Class165);
                    GameScr.Class425[i] = Math.abs(mob.yFirst - GameScr.Class166);
                }
                else {
                    GameScr.Class424[i] = Math.abs(mob.xFirst - Char.getMyChar().cx);
                    GameScr.Class425[i] = Math.abs(mob.yFirst - Char.getMyChar().cy);
                    GameScr.Class167 = 700;
                }
            }
        }
        if (GameScr.Class154 != 1 || Char.getMyChar().mobFocus != null || Char.getMyChar().npcFocus != null || Char.getMyChar().mobFocus != null || Char.getMyChar().statusMe == 14 || Char.getMyChar().cMP <= 0 || Char.getMyChar().itemFocus != null) {
            return;
        }
        if (System.currentTimeMillis() - GameScr.Class422 + 2000L >= 0L) {
            if (!GameScr.Class151 && Char.getMyChar().mobFocus != null && (Char.getMyChar().cx < GameScr.Class165 - GameScr.Class167 || Char.getMyChar().cy > GameScr.Class165 + GameScr.Class167 || Char.getMyChar().cy < GameScr.Class166 - GameScr.Class167 || Char.getMyChar().cy > GameScr.Class166 + GameScr.Class167)) {
                Char.getMyChar().cx = GameScr.Class165;
                Char.getMyChar().cy = GameScr.Class166;
            }
            for (int j = 0; j < GameScr.vMob.size(); ++j) {
                final Mob mobFocus;
                if (j != GameScr.Class423 && GameScr.Class424[j] < GameScr.Class167 && GameScr.Class425[j] < GameScr.Class167 && Char.getMyChar().mobFocus == null && (mobFocus = (Mob)GameScr.vMob.elementAt(j)).status != 0 && mobFocus.status != 1 && mobFocus.levelBoss != 3) {
                    Game16.Class1(141, Char.getMyChar().cx, Char.getMyChar().cy, 2);
                    Char.getMyChar().cx = mobFocus.xFirst;
                    Char.getMyChar().cy = mobFocus.yFirst;
                    Char.getMyChar().statusMe = 4;
                    Char.getMyChar().mobFocus = mobFocus;
                    Game16.Class1(141, Char.getMyChar().cx, Char.getMyChar().cy, 2);
                    Char.getMyChar().cxSend = mobFocus.xFirst;
                    Char.getMyChar().cySend = mobFocus.yFirst;
                    final Service gi = Service.gI();
                    final short mobId = mobFocus.mobId;
                    final Service service = gi;
                    Message message = null;
                    try {
                        (message = new Message((byte)119)).Class3.writeByte(mobId);
                        service.temple.Class1(message);
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    finally {
                        message.Class2();
                    }
                    message.Class2();
                    GameScr.Class423 = j;
                    GameScr.Class422 = System.currentTimeMillis();
                }
            }
        }
    }
    
    private static void Class40(final mGraphics mGraphics) {
        if (GameScr.Class202) {
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, Game86.Class22, false);
            GameScr.Class394 = GameScr.Class157 + 5;
            GameScr.Class395 = GameScr.Class156 + 40;
            if (GameScr.Class35.size() == 0) {
                mFont.number_red.Class1(mGraphics, Game86.Class379, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class156 + 40, 2);
                return;
            }
            mGraphics.setColor(-16770791);
            mGraphics.fillRect(GameScr.Class394 - 2, GameScr.Class395 - 2, GameScr.Class158 - 6, GameScr.Class192 * 3 + 8);
            Class2(mGraphics);
            GameScr.Class50.Class1(GameScr.Class35.size(), GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 3 + 4, true, 1);
            GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class158 - 3, GameScr.Class192 * 3 + 6);
            GameScr.Class194 = GameScr.Class35.size();
            for (int i = 0; i < GameScr.Class35.size(); ++i) {
                Game60 game60 = null;
                try {
                    game60 = (Game60)GameScr.Class35.elementAt(i);
                }
                catch (Exception ex) {}
                if (game60 != null) {
                    if (GameScr.indexRow == i) {
                        mGraphics.setColor(Game25.Class2);
                        mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                        mGraphics.setColor(16777215);
                        mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + GameScr.indexRow * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                    }
                    else {
                        mGraphics.setColor(Game25.Class1);
                        mGraphics.fillRect(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                        mGraphics.setColor(13932896);
                        mGraphics.Class2(GameScr.Class394 + 2, GameScr.Class395 + i * GameScr.Class192 + 2, GameScr.Class158 - 15, GameScr.Class192 - 4);
                    }
                    mFont.Class12.Class1(mGraphics, game60.Class2, GameScr.Class394 + (GameScr.Class158 - 10) / 2 - GameScr.Class158 / 4, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 10, 2);
                    mFont.Class12.Class1(mGraphics, "-", GameScr.Class394 + (GameScr.Class158 - 10) / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 10, 2);
                    mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class21) + ": " + game60.Class1, GameScr.Class394 + (GameScr.Class158 - 10) / 2 + GameScr.Class158 / 4, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 - 10, 2);
                    mFont.number_red.Class1(mGraphics, game60.Class3, GameScr.Class394 + GameScr.Class158 / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2 + 5, 2);
                }
            }
        }
    }
    
    private static void Class213() {
        Service.gI().Class1((short)102, "", GameScr.Class168);
    }
    
    private void Class214() {
        this.Class436 = true;
        Service.gI().Class1((short)101, "", GameScr.Class168);
    }
    
    private static void Class215() {
        GameCanvas.inputDlg.show(Game86.Class19, new Command(Game86.Class20, GameCanvas.instance, 1700, 1), 1);
    }
    
    public final void Class1(String string, final short class427, final String class428, final short class429, final String class430, final short n, final String class431, final String class432, final byte class433) {
        InfoDlg.hide();
        GameScr.Class249 = true;
        this.isLockKey = true;
        GameScr.indexRow = 0;
        setPopupSize(175, 200);
        super.left = null;
        super.center = new Command(Game86.Class20, 1701);
        super.right = new Command(Game86.CLOSE, 1702);
        GameScr.Class168 = class433;
        this.textsTitle = string;
        this.Class427 = class427;
        this.Class431 = class428;
        this.Class428 = class429;
        this.Class432 = class430;
        this.Class429 = n;
        this.Class433 = class431;
        this.Class434 = class432;
        string = ((this.Class434 == "") ? "" : (String.valueOf(Game86.Class17) + this.Class434 + Game86.Class287));
        string = "c3" + this.Class431 + "\n" + Game86.Class18 + n + "\n" + string + "\n\nc0" + this.Class433;
        this.texts = mFont.Class9.Class1(string, GameScr.Class158 - 30);
        this.Class435 = System.currentTimeMillis();
        this.Class430 = Class1(this.Class435, this.Class427);
        this.Class436 = false;
    }
    
    private static String Class1(final long n, final int n2) {
        final long n3;
        if ((n3 = (n + n2 * 1000 - System.currentTimeMillis()) / 1000L) <= 0L) {
            return "";
        }
        final long n4 = n3 / 60L;
        final long n5 = n3;
        if (n4 > 0L) {
            if (n4 < 10L) {
                if (n3 % 60L >= 0L && n3 % 60L < 10L) {
                    return "0" + n4 + ":0" + n3 % 60L;
                }
                return "0" + n4 + ":" + n3 % 60L;
            }
            else {
                if (n3 % 60L >= 0L && n3 % 60L < 10L) {
                    return String.valueOf(n4) + ":0" + n3 % 60L;
                }
                return String.valueOf(n4) + ":" + n3 % 60L;
            }
        }
        else {
            if (n5 < 10L) {
                return "0" + n5 + "s";
            }
            return String.valueOf(n5) + "s";
        }
    }
    
    private void Class216() {
        GameScr.Class249 = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        super.left = null;
        super.right = null;
        this.Class22();
    }
    
    private void Class41(final mGraphics mGraphics) {
        if (this.texts == null || !GameScr.Class249) {
            return;
        }
        if (!this.Class436) {
            if (this.Class429 > 1) {
                this.Class430 = Class1(this.Class435, this.Class427);
            }
            if (this.Class430 == "") {
                this.Class214();
            }
            final long n;
            if ((n = (this.Class435 + this.Class427 * 1000 - System.currentTimeMillis()) / 1000L) > 8L && n % 5L == 0L) {
                this.Class214();
            }
            if (n <= 10L) {
                super.center = null;
            }
            if (n <= 20L) {
                this.Class437 = mFont.Class3;
            }
            else {
                this.Class437 = mFont.Class6;
            }
        }
        Class2(mGraphics);
        Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
        if (this.textsTitle != null) {
            Class1(mGraphics, this.textsTitle, GameScr.Class96);
        }
        GameScr.Class394 = GameScr.Class157 + 15;
        GameScr.Class395 = GameScr.Class156 + 15;
        if (this.textsTitle != null) {
            GameScr.Class395 += 10;
        }
        this.Class437.Class1(mGraphics, this.Class430, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class395 + 12, 2);
        mFont.Class12.Class1(mGraphics, Game86.Class16, GameScr.Class157 + GameScr.Class158 / 2, GameScr.Class395 + 30, 2);
        final short class428 = this.Class428;
        final int n2 = GameScr.Class157 + GameScr.Class158 / 2;
        final int n3 = GameScr.Class395 + 42;
        final int n4 = GameScr.Class158 / 2;
        final String string = String.valueOf(this.Class428) + "." + this.Class432 + "%";
        final int n5 = n4;
        final int n6 = n3;
        final int n7 = n2;
        final short n8 = class428;
        mGraphics.setColor(0);
        mGraphics.fillRect(n7 - n5 / 2, n6, n5, 12);
        int n9;
        if ((n9 = n8 * n5 / 100) <= 0) {
            n9 = 1;
        }
        mGraphics.Class4(n7 - n5 / 2, n6, n9, 12);
        mGraphics.setColor(16711680);
        mGraphics.fillRect(n7 - n5 / 2, n6, n5, 12);
        Class2(mGraphics);
        mFont.Class12.Class1(mGraphics, string, GameScr.Class157 + GameScr.Class158 / 2, n6, 2);
        GameScr.Class194 = this.texts.size();
        GameScr.Class50.Class1(GameScr.Class194, 12, GameScr.Class157, GameScr.Class395 + 48, GameScr.Class158, GameScr.Class159 - 42 - ((this.textsTitle != null) ? 10 : 0), true, 1);
        GameScr.Class50.Class1(mGraphics);
        this.Class402 = GameScr.Class395 + 48;
        mFont mFont = mFont.number_red;
        String s;
        for (int n10 = 0; n10 < this.texts.size() && (s = (String)this.texts.elementAt(n10)) != null && this.texts != null && mFont != null; ++n10) {
            if (s.startsWith("c")) {
                if (s.startsWith("c0")) {
                    s = s.substring(2);
                    mFont = mFont.number_red;
                }
                else if (s.startsWith("c1")) {
                    s = s.substring(2);
                    mFont = mFont.Class6;
                }
                else if (s.startsWith("c2")) {
                    s = s.substring(2);
                    mFont = mFont.Class7;
                }
                else if (s.startsWith("c3")) {
                    s = s.substring(2);
                    mFont = mFont.Class12;
                }
                else if (s.startsWith("c4")) {
                    s = s.substring(2);
                    mFont = mFont.Class3;
                }
                else if (s.startsWith("c5")) {
                    s = s.substring(2);
                    mFont = mFont.Class14;
                }
                else if (s.startsWith("c6")) {
                    s = s.substring(2);
                    mFont = mFont.Class13;
                }
                else if (s.startsWith("c7")) {
                    s = s.substring(2);
                    mFont = mFont.Class4;
                }
                else if (s.startsWith("c8")) {
                    s = s.substring(2);
                    mFont = mFont.Class15;
                }
                else if (s.startsWith("c9")) {
                    s = s.substring(2);
                    mFont = mFont.Class16;
                }
            }
            mFont.Class1(mGraphics, s, GameScr.Class157 + GameScr.Class158 / 2, this.Class402 += 12, 2);
        }
    }
    
    public final void switchToMe() {
        TileMap.Game5sw();
        Session_ME.islock = false;
        Session_ME.Huyobj();
        TileMap.IsDangGoMap = false;
        Code.code.Start();
        super.switchToMe();
    }
    
    public final void Class39() {
        this.Class438 = new byte[] { -1, -1, -1, -1, -1, -1 };
    }
    
    private void Class217() {
        if (GameCanvas.Class13[4]) {
            this.Class5((byte)0);
            GameCanvas.Class8();
            return;
        }
        if (GameCanvas.Class13[2]) {
            this.Class5((byte)1);
            GameCanvas.Class8();
            return;
        }
        if (GameCanvas.Class13[6]) {
            this.Class5((byte)2);
            GameCanvas.Class8();
        }
    }
    
    private void Class5(final byte b) {
        for (int i = 0; i < this.Class438.length; ++i) {
            if (i != this.Class438.length - 1) {
                final int n = i;
                final byte[] class438 = this.Class438;
                class438[n] = class438[i + 1];
            }
            else {
                this.Class438[i] = b;
                Service.gI().Class4(b);
            }
        }
    }
    
    private void Class42(final mGraphics mGraphics) {
        try {
            GameScr.Class194 = 1;
            this.Class442 = GameScr.Class158;
            this.Class443 = GameScr.Class159;
            this.Class440 = GameScr.Class157;
            this.Class441 = GameScr.Class156;
            this.Class451 = this.Class440 + 25;
            this.Class452 = this.Class441 + 60;
            this.Class453 = this.Class442 - 50;
            this.Class454 = 70;
            this.Class446 = this.Class442 - 49;
            this.Class447 = 10;
            this.Class444 = GameCanvas.Class27 - this.Class446 / 2;
            this.Class445 = this.Class452 + this.Class454 - this.Class447;
            this.Class450 = 18;
            this.Class448 = GameCanvas.Class27 - (this.Class169.size() - 1) * ((this.Class450 + 5) / 2);
            this.Class449 = this.Class441 + this.Class443 - this.Class450 / 2 - 5;
            Game114 game114;
            if (this.Class169.size() > 0 && this.Class439 <= this.Class169.size()) {
                game114 = (Game114)this.Class169.elementAt(this.Class439);
            }
            else {
                game114 = null;
            }
            if (game114 == null) {
                mGraphics.setColor(13606712);
                mGraphics.Class2(this.Class451 - 1, this.Class452 - 1, this.Class453 + 1, this.Class454 + 1);
                mGraphics.Class4(this.Class451, this.Class452, this.Class453, this.Class454);
                mGraphics.setColor(6425);
                mGraphics.fillRect(this.Class451, this.Class452, this.Class453, this.Class454);
                return;
            }
            mFont.Class7.Class1(mGraphics, game114.Class1, GameCanvas.Class27, this.Class441 + 35, 2);
            mGraphics.setColor(13606712);
            mGraphics.Class2(this.Class451 - 1, this.Class452 - 1, this.Class453 + 1, this.Class454 + 1);
            mGraphics.Class4(this.Class451, this.Class452, this.Class453, this.Class454);
            mGraphics.setColor(6425);
            mGraphics.fillRect(this.Class451, this.Class452, this.Class453, this.Class454);
            Game2.Class1(mGraphics, game114.Class4, this.Class451 + this.Class453 / 2, this.Class452 + this.Class454 / 2 - 10, 0, 3);
            Class2(mGraphics);
            if (game114.Class5 >= 0) {
                this.Class456 = Res.Class1(game114.Class10, game114.Class5);
                if (!this.Class456.equals("")) {
                    mFont.Class12.Class1(mGraphics, String.valueOf(game114.Class6) + " " + this.Class456, this.Class451, this.Class445 + 15, 0);
                }
                else {
                    --this.Class455;
                    if (this.Class455 <= 0) {
                        Service.gI().Class22();
                        this.Class455 = 100;
                    }
                }
            }
            else {
                for (byte b = 0; b < game114.Class2; ++b) {
                    Game2.Class1(mGraphics, 628, this.Class440 + 95 + b * 12 - game114.Class2 * 6, this.Class441 + 50, 0, 3);
                }
                final int n3 = game114.Class8 * this.Class446 / game114.Class9;
                mGraphics.setColor(2506246);
                mGraphics.fillRect(this.Class444, this.Class445, this.Class446, this.Class447);
                mGraphics.setColor(371981);
                mGraphics.fillRect(this.Class444, this.Class445, n3, this.Class447);
                mGraphics.setColor(13606712);
                mGraphics.Class2(this.Class444, this.Class445, this.Class446, this.Class447);
                mFont.number_red.Class1(mGraphics, String.valueOf(game114.Class8) + "/" + game114.Class9, this.Class444 + this.Class446 / 2, this.Class445, 2);
                for (int i = 0; i < game114.Class7.size(); ++i) {
                    mFont.Class12.Class1(mGraphics, (String)game114.Class7.elementAt(i), this.Class451 + this.Class453 / 2, this.Class445 + 15 + i * 10, 2);
                }
            }
            for (int j = 0; j < this.Class169.size(); ++j) {
                Game114 game115;
                if (this.Class169.size() > 0 && j <= this.Class169.size()) {
                    game115 = (Game114)this.Class169.elementAt(j);
                }
                else {
                    game115 = null;
                }
                if (game115 != null) {
                    mGraphics.setColor(0);
                    mGraphics.fillRect(this.Class448 + j * (this.Class450 + 5) - this.Class450 / 2, this.Class449 - this.Class450 / 2, this.Class450, this.Class450);
                    Game2.Class1(mGraphics, 154, this.Class448 + j * (this.Class450 + 5), this.Class449, 0, 3);
                    mGraphics.setColor(12281361);
                    mGraphics.Class2(this.Class448 + j * (this.Class450 + 5) - this.Class450 / 2, this.Class449 - this.Class450 / 2, this.Class450, this.Class450);
                    Game2.Class1(mGraphics, game115.Class3, this.Class448 + j * (this.Class450 + 5), this.Class449, 0, 3);
                }
            }
            mGraphics.setColor(16777215);
            mGraphics.Class2(this.Class448 + this.Class439 * (this.Class450 + 5) - this.Class450 / 2, this.Class449 - this.Class450 / 2, this.Class450, this.Class450);
        }
        catch (Exception ex) {
            System.out.println("e:" + ex.toString());
        }
    }
    
    private void Class1(final Game114 game114) {
        this.Class169.addElement(game114);
    }
    
    private void Class218() {
        this.Class169.removeAllElements();
    }
    
    private void Class219() {
        try {
            if (GameScr.Class245 && Char.getMyChar().arrItemBag[GameScr.indexSelect].Class4()) {
                if (GameScr.Class85 != null) {
                    if (GameScr.Class77 == null) {
                        GameScr.Class77 = new Item[24];
                    }
                    for (int i = 0; i < GameScr.Class77.length; ++i) {
                        if (GameScr.Class77[i] == null) {
                            GameScr.Class77[i] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                            Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                            final Command command = null;
                            super.center = command;
                            super.left = command;
                            this.Class29();
                            return;
                        }
                        if (i == GameScr.Class77.length - 1) {
                            GameCanvas.setText(Game86.Class275);
                        }
                    }
                    return;
                }
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect].upgrade < 10) {
                    GameScr.Class85 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                    Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                    return;
                }
                GameCanvas.Class35.Class1(Game86.Class2, null, new Command(Game86.CLOSE, 2), null);
                GameCanvas.Class34 = GameCanvas.Class35;
            }
        }
        catch (Exception ex) {
            GameCanvas.Class35.Class1(Game86.Class2, null, new Command(Game86.CLOSE, 2), null);
            GameCanvas.Class34 = GameCanvas.Class35;
            ex.printStackTrace();
        }
    }
    
    private void Class220() {
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect].Class4()) {
            if (GameScr.Class85 == null) {
                GameScr.Class85 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
            }
            else {
                final Item class85 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                Char.getMyChar().arrItemBag[GameScr.Class85.indexUI] = GameScr.Class85;
                GameScr.Class85 = class85;
            }
            final Command command = null;
            super.center = command;
            super.left = command;
            this.Class29();
            return;
        }
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect].Class2()) {
            if (GameScr.Class84 == null) {
                GameScr.Class84 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
            }
            else {
                final Item class86 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                Char.getMyChar().arrItemBag[GameScr.Class84.indexUI] = GameScr.Class84;
                GameScr.Class84 = class86;
            }
            final Command command2 = null;
            super.center = command2;
            super.left = command2;
            this.Class29();
            return;
        }
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type == 26 || Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type == 28) {
            if (Char.getMyChar().arrItemBag[GameScr.indexSelect].template.type == 28) {
                for (int i = 0; i < GameScr.Class76.length; ++i) {
                    if (GameScr.Class76[i] != null && GameScr.Class76[i].template.type == 28) {
                        final Item item = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                        Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                        Char.getMyChar().arrItemBag[GameScr.Class76[i].indexUI] = GameScr.Class76[i];
                        GameScr.Class76[i] = item;
                        return;
                    }
                }
            }
            for (int j = 0; j < GameScr.Class76.length; ++j) {
                if (GameScr.Class76[j] == null) {
                    GameScr.Class76[j] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                    Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                    final Command command3 = null;
                    super.center = command3;
                    super.left = command3;
                    this.Class29();
                    return;
                }
            }
            GameCanvas.Class35.Class1(Game86.Class275, null, new Command(Game86.CLOSE, 2), null);
            GameCanvas.Class34 = GameCanvas.Class35;
            return;
        }
        GameCanvas.Class35.Class1(Game86.Class269, null, new Command(Game86.CLOSE, 2), null);
        GameCanvas.Class34 = GameCanvas.Class35;
    }
    
    private void Class15(final int n) {
        final MyVector myVector = new MyVector();
        if (n == 0) {
            myVector.addElement(this.Class357);
        }
        else if (n == 1) {
            myVector.addElement(this.Class358);
        }
        else if (n == 2) {
            myVector.addElement(this.Class359);
        }
        if (GameScr.Class84 != null && GameScr.Class85 != null) {
            for (int i = 0; i < GameScr.Class76.length; ++i) {
                if (GameScr.Class76[i] != null) {
                    myVector.addElement(new Command(Game86.Class152, 341));
                    break;
                }
            }
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class16(final int n) {
        Item item = GameScr.Class85;
        if (n == 1) {
            item = GameScr.Class84;
            GameScr.Class84 = null;
        }
        else if (n == 2) {
            item = getItemFocus(47);
            GameScr.Class76[GameScr.indexSelect] = null;
        }
        else {
            GameScr.Class85 = null;
        }
        Char.getMyChar().arrItemBag[item.indexUI] = item;
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private static void Class221() {
        int n = 0;
        for (int i = 0; i < GameScr.Class76.length; ++i) {
            if (GameScr.Class76[i] != null && GameScr.Class76[i].template.type == 26) {
                n += GameScr.Class99[GameScr.Class76[i].template.id];
            }
        }
        boolean b = false;
        int n2 = 0;
        if (GameScr.Class85 != null) {
            if (GameScr.Class106[GameScr.Class85.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                b = true;
            }
            n2 = n * 100 / GameScr.Class102[GameScr.Class85.upgrade];
        }
        if (b) {
            InfoMe.addInfo(Game86.Class325, 15, mFont.Class14);
            return;
        }
        if (n2 > 250) {
            GameCanvas.Class1(Game86.Class326, new Command(Game86.Class60, 342), new Command(Game86.Class73, 1));
            return;
        }
        if (GameScr.Class85 != null && GameScr.Class84 != null && GameScr.Class76.length > 0) {
            if (!GameScr.Class84.Class7) {
                GameCanvas.Class1(Game86.Class327, new Command(Game86.Class60, 342), new Command(Game86.Class73, 1));
                return;
            }
            Service.gI().Class1((byte)0, GameScr.Class84, GameScr.Class85, GameScr.Class76);
        }
    }
    
    private static void Class222() {
        GameCanvas.endDlg();
        if (GameScr.Class85 != null && GameScr.Class84 != null && GameScr.Class76.length > 0) {
            Service.gI().Class1((byte)0, GameScr.Class84, GameScr.Class85, GameScr.Class76);
        }
    }
    
    private void Class43(mGraphics mGraphics) {
        if (GameScr.Class245) {
            if (GameScr.indexMenu == 0) {
                final GameScr gameScr = this;
                final mGraphics mGraphics2 = mGraphics;
                final String[] class192 = Game86.Class192;
                mGraphics = mGraphics2;
                this = gameScr;
                try {
                    Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
                    Class1(mGraphics, class192[GameScr.indexMenu], class192.length > 1);
                    GameScr.Class394 = GameScr.Class157 + 3;
                    GameScr.Class395 = GameScr.Class156 + 34 + GameScr.Class192;
                    final int n = GameScr.Class157 + 74;
                    final int n2 = GameScr.Class395 - GameScr.Class192 - 3;
                    GameScr.Class401 = 4;
                    if (GameScr.Class85 != null) {
                        this.Class1(mGraphics, GameScr.Class85, n, n2);
                        final GameScr gameScr2 = this;
                        final mGraphics mGraphics3 = mGraphics;
                        final int n3 = n + 35;
                        final int n4 = n2 + 25;
                        final int n5 = n3;
                        final mGraphics mGraphics4 = mGraphics3;
                        final GameScr gameScr3 = gameScr2;
                        final int i = gameScr2.Class457[GameScr.Class85.upgrade][0];
                        int param = 0;
                        if (GameScr.Class85.options != null) {
                            for (int j = 0; j < GameScr.Class85.options.size(); ++j) {
                                final ItemOption itemOption;
                                if ((itemOption = (ItemOption)GameScr.Class85.options.elementAt(j)).optionTemplate.id == 104) {
                                    param = itemOption.param;
                                }
                            }
                        }
                        int n6 = 0;
                        for (int k = 0; k < GameScr.Class77.length; ++k) {
                            final Item item;
                            if ((item = GameScr.Class77[k]) != null) {
                                n6 += gameScr3.Class457[item.upgrade][1];
                            }
                        }
                        mGraphics4.setColor(0);
                        mGraphics4.fillRect(n5, n4 - 5, 60, 5);
                        int n7;
                        if ((n7 = param * 60 / i) <= 0) {
                            n7 = 0;
                        }
                        else if (n7 > 60) {
                            n7 = 60;
                        }
                        mGraphics4.setColor(-16711936);
                        mGraphics4.fillRect(n5, n4 - 5, n7, 5);
                        int n8;
                        if ((n8 = n6 * 60 / i) >= 60 - n7) {
                            n8 = 60 - n7;
                        }
                        mGraphics4.setColor(-16346586);
                        mGraphics4.fillRect(n5 + n7, n4 - 5, n8, 5);
                        mFont.Class12.Class1(mGraphics4, String.valueOf(n6 + param) + "/" + i, n5 + 30, n4 - 5 - 15, 2);
                    }
                    else {
                        mGraphics.setColor(6425);
                        mGraphics.fillRect(n - 1, n2 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                        Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n2 + GameScr.Class192 / 2, 0, 3);
                    }
                    mGraphics.setColor(12281361);
                    final mGraphics mGraphics5 = mGraphics;
                    final int n9 = n;
                    final int n10 = n2;
                    final int class193 = GameScr.Class192;
                    mGraphics5.Class2(n9, n10, class193, class193);
                    mGraphics.setColor(6425);
                    mGraphics.fillRect(GameScr.Class394 - 1, GameScr.Class395 - 1, GameScr.Class192 * GameScr.Class400 + 3, GameScr.Class192 * GameScr.Class401 + 3);
                    for (int l = 0; l < GameScr.Class401; ++l) {
                        for (int n11 = 0; n11 < GameScr.Class400; ++n11) {
                            Game2.Class1(mGraphics, 154, GameScr.Class394 + n11 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + l * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                            mGraphics.setColor(12281361);
                            final mGraphics mGraphics6 = mGraphics;
                            final int n12 = GameScr.Class394 + n11 * GameScr.Class192;
                            final int n13 = GameScr.Class395 + l * GameScr.Class192;
                            final int class194 = GameScr.Class192;
                            mGraphics6.Class2(n12, n13, class194, class194);
                        }
                    }
                    for (int n14 = 0; n14 < GameScr.Class77.length; ++n14) {
                        final Item item2;
                        if ((item2 = GameScr.Class77[n14]) != null) {
                            final int n15 = n14 / GameScr.Class400;
                            final int n16 = n14 - n15 * GameScr.Class400;
                            if (!item2.Class7) {
                                mGraphics.setColor(12083);
                                mGraphics.fillRect(GameScr.Class394 + n16 * GameScr.Class192 + 1, GameScr.Class395 + n15 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                            }
                            this.Class1(mGraphics, item2, GameScr.Class394 + n16 * GameScr.Class192, GameScr.Class395 + n15 * GameScr.Class192);
                            if (item2.quantity > 1) {
                                mFont.Class18.Class1(mGraphics, String.valueOf(item2.quantity), GameScr.Class394 + n16 * GameScr.Class192 + GameScr.Class192, GameScr.Class395 + n15 * GameScr.Class192 + GameScr.Class192 - mFont.Class18.Class1, 1);
                            }
                        }
                    }
                    if (GameScr.Class193 == 1) {
                        mGraphics.setColor(16777215);
                        final mGraphics mGraphics7 = mGraphics;
                        final int n17 = n;
                        final int n18 = n2;
                        final int class195 = GameScr.Class192;
                        mGraphics7.Class2(n17, n18, class195, class195);
                        return;
                    }
                    if (GameScr.Class193 == 2) {
                        final int n19 = GameScr.indexSelect / GameScr.Class400;
                        final int n20 = GameScr.indexSelect - n19 * GameScr.Class400;
                        mGraphics.setColor(16777215);
                        final mGraphics mGraphics8 = mGraphics;
                        final int n21 = GameScr.Class394 + n20 * GameScr.Class192;
                        final int n22 = GameScr.Class395 + n19 * GameScr.Class192;
                        final int class196 = GameScr.Class192;
                        mGraphics8.Class2(n21, n22, class196, class196);
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class192);
            }
        }
    }
    
    private void Class44(mGraphics mGraphics) {
        if (GameScr.Class246) {
            if (GameScr.indexMenu == 0) {
                final GameScr gameScr = this;
                final mGraphics mGraphics2 = mGraphics;
                final String[] class191 = Game86.Class191;
                mGraphics = mGraphics2;
                this = gameScr;
                try {
                    GameScr.Class401 = 3;
                    Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
                    Class1(mGraphics, class191[GameScr.indexMenu], class191.length > 1);
                    GameScr.Class394 = GameScr.Class157 + 3;
                    GameScr.Class395 = GameScr.Class156 + 34 + GameScr.Class192;
                    final int n = GameScr.Class157 + 45;
                    final int n2 = GameScr.Class157 + 100;
                    final int n3 = GameScr.Class395 - GameScr.Class192 - 3;
                    if (GameScr.Class85 != null) {
                        this.Class1(mGraphics, GameScr.Class85, n, n3);
                    }
                    else {
                        mGraphics.setColor(6425);
                        mGraphics.fillRect(n - 1, n3 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                        Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n3 + GameScr.Class192 / 2, 0, 3);
                    }
                    mGraphics.setColor(12281361);
                    final mGraphics mGraphics3 = mGraphics;
                    final int n4 = n;
                    final int n5 = n3;
                    final int class192 = GameScr.Class192;
                    mGraphics3.Class2(n4, n5, class192, class192);
                    if (GameScr.Class84 != null) {
                        this.Class1(mGraphics, GameScr.Class84, n2, n3);
                    }
                    else {
                        mGraphics.setColor(6425);
                        mGraphics.fillRect(n2 - 1, n3 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                        Game2.Class1(mGraphics, 154, n2 + GameScr.Class192 / 2, n3 + GameScr.Class192 / 2, 0, 3);
                    }
                    mGraphics.setColor(12281361);
                    final mGraphics mGraphics4 = mGraphics;
                    final int n6 = n;
                    final int n7 = n3;
                    final int class193 = GameScr.Class192;
                    mGraphics4.Class2(n6, n7, class193, class193);
                    final mGraphics mGraphics5 = mGraphics;
                    final int n8 = n2;
                    final int n9 = n3;
                    final int class194 = GameScr.Class192;
                    mGraphics5.Class2(n8, n9, class194, class194);
                    mFont.Class6.Class1(mGraphics, "+", n + GameScr.Class192 + 15, n3 + GameScr.Class192 / 2 - 5, 2);
                    if (GameScr.Class193 == 1) {
                        if (GameScr.indexSelect == 0) {
                            mGraphics.setColor(16777215);
                            final mGraphics mGraphics6 = mGraphics;
                            final int n10 = n;
                            final int n11 = n3;
                            final int class195 = GameScr.Class192;
                            mGraphics6.Class2(n10, n11, class195, class195);
                        }
                        if (GameScr.indexSelect == 1) {
                            mGraphics.setColor(16777215);
                            final mGraphics mGraphics7 = mGraphics;
                            final int n12 = n2;
                            final int n13 = n3;
                            final int class196 = GameScr.Class192;
                            mGraphics7.Class2(n12, n13, class196, class196);
                        }
                    }
                    for (int i = 0; i < GameScr.Class401; ++i) {
                        for (int j = 0; j < GameScr.Class400; ++j) {
                            mGraphics.setColor(6425);
                            mGraphics.fillRect(GameScr.Class394 + j * GameScr.Class192, GameScr.Class395 + i * GameScr.Class192, GameScr.Class192 + 3, GameScr.Class192 + 3);
                            Game2.Class1(mGraphics, 154, GameScr.Class394 + j * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                            mGraphics.setColor(12281361);
                            final mGraphics mGraphics8 = mGraphics;
                            final int n14 = GameScr.Class394 + j * GameScr.Class192;
                            final int n15 = GameScr.Class395 + i * GameScr.Class192;
                            final int class197 = GameScr.Class192;
                            mGraphics8.Class2(n14, n15, class197, class197);
                        }
                    }
                    if (GameScr.Class193 == 2) {
                        final int n16 = GameScr.indexSelect / GameScr.Class400;
                        final int n17 = GameScr.indexSelect - n16 * GameScr.Class400;
                        mGraphics.setColor(16777215);
                        final mGraphics mGraphics9 = mGraphics;
                        final int n18 = GameScr.Class394 + n17 * GameScr.Class192;
                        final int n19 = GameScr.Class395 + n16 * GameScr.Class192;
                        final int class198 = GameScr.Class192;
                        mGraphics9.Class2(n18, n19, class198, class198);
                    }
                    for (int k = 0; k < GameScr.Class76.length; ++k) {
                        final Item item;
                        if ((item = GameScr.Class76[k]) != null) {
                            final int n20 = k / GameScr.Class400;
                            final int n21 = k - n20 * GameScr.Class400;
                            if (!item.Class7) {
                                mGraphics.setColor(12083);
                                mGraphics.fillRect(GameScr.Class394 + n21 * GameScr.Class192 + 1, GameScr.Class395 + n20 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                            }
                            Game2.Class1(mGraphics, item.template.Class7, GameScr.Class394 + n21 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n20 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                        }
                    }
                    if (GameScr.Class84 != null && GameScr.Class85 != null) {
                        int n22 = 0;
                        for (int l = 0; l < GameScr.Class76.length; ++l) {
                            if (GameScr.Class76[l] != null && GameScr.Class76[l].template.type == 26) {
                                n22 += GameScr.Class99[GameScr.Class76[l].template.id];
                            }
                        }
                        int m;
                        if ((m = n22 * 100 / GameScr.Class102[GameScr.Class85.upgrade]) > GameScr.Class107[GameScr.Class85.upgrade]) {
                            m = GameScr.Class107[GameScr.Class85.upgrade];
                        }
                        if (GameScr.Class232) {
                            m *= (int)1.5;
                        }
                        mFont mFont = mFont.Class12;
                        int param = 0;
                        if (GameScr.Class85.options != null) {
                            for (int n23 = 0; n23 < GameScr.Class85.options.size(); ++n23) {
                                final ItemOption itemOption;
                                if ((itemOption = (ItemOption)GameScr.Class85.options.elementAt(n23)).optionTemplate.id == 123) {
                                    param = itemOption.param;
                                }
                            }
                        }
                        else {
                            Service.gI().requestItemInfo(GameScr.Class85.typeUI, GameScr.Class85.indexUI);
                        }
                        if (param > Char.getMyChar().xu + Char.getMyChar().yen) {
                            mFont = mFont.Class14;
                        }
                        mFont.Class1(mGraphics, Game86.Class1(Game86.Class201, Game20.Class1(new StringBuffer(String.valueOf(param)).toString())), GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5, 0);
                        mFont.Class12.Class1(mGraphics, String.valueOf(Game86.Class204) + ": " + m + "%", GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 17, 0);
                    }
                    else {
                        for (int n24 = 0; n24 < Game86.Class198.length; ++n24) {
                            mFont.number_red.Class1(mGraphics, Game86.Class198[n24], GameScr.Class394, GameScr.Class395 + GameScr.Class401 * GameScr.Class192 + 5 + n24 * 12, 0);
                        }
                    }
                    if (GameScr.Class161 != null) {
                        Game2.Class1(mGraphics, GameScr.Class161.Class2[GameScr.Class160].Class3, n2 + GameScr.Class192 / 2 + GameScr.Class161.Class2[GameScr.Class160].Class1 + 1, n3 + GameScr.Class192 / 2 + 9 + GameScr.Class161.Class2[GameScr.Class160].Class2, 0, 3);
                        if (GameCanvas.gameTick % 2 == 0 && ++GameScr.Class160 >= GameScr.Class161.Class2.length) {
                            GameScr.Class160 = 0;
                            GameScr.Class161 = null;
                        }
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class191);
            }
        }
    }
    
    private void Class45(final mGraphics mGraphics) {
        if (GameScr.Class247) {
            if (GameScr.indexMenu == 0) {
                this.Class1(mGraphics, Game86.Class194, (byte)0);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class194);
            }
        }
    }
    
    private void Class46(final mGraphics mGraphics) {
        if (GameScr.Class248) {
            if (GameScr.indexMenu == 0) {
                this.Class1(mGraphics, Game86.Class195, (byte)1);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class195);
            }
        }
    }
    
    private void Class1(final mGraphics mGraphics, final String[] array, final byte b) {
        try {
            GameScr.Class401 = 5;
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, array, false);
            mGraphics.setColor(6693376);
            mGraphics.fillRect(GameScr.Class157 + 3, GameScr.Class156 + 32, 168, 140);
            mGraphics.setColor(13408563);
            mGraphics.Class2(GameScr.Class157 + 3, GameScr.Class156 + 32, 168, 140);
            final int n = GameScr.Class157 + 74;
            final int n2 = GameScr.Class156 + 40 + GameScr.Class192;
            if (GameScr.Class85 != null) {
                mGraphics.setColor(6425);
                mGraphics.fillRect(n - 1, n2 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n2 + GameScr.Class192 / 2, 0, 3);
                this.Class1(mGraphics, GameScr.Class85, n, n2);
                if (GameScr.Class85.quantity > 1) {
                    mFont.Class18.Class1(mGraphics, new StringBuffer().append(GameScr.Class85.quantity).toString(), n + GameScr.Class192, n2 + GameScr.Class192 / 2 + 6, 1);
                }
                mGraphics.setColor((GameScr.Class193 == 1) ? 16777215 : 12281361);
                final int n3 = n;
                final int n4 = n2;
                final int class192 = GameScr.Class192;
                mGraphics.Class2(n3, n4, class192, class192);
            }
            else {
                mGraphics.setColor(6425);
                mGraphics.fillRect(n - 1, n2 - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                Game2.Class1(mGraphics, 154, n + GameScr.Class192 / 2, n2 + GameScr.Class192 / 2, 0, 3);
                mGraphics.setColor(12281361);
                final int n5 = n;
                final int n6 = n2;
                final int class193 = GameScr.Class192;
                mGraphics.Class2(n5, n6, class193, class193);
            }
            if (GameScr.Class85 != null) {
                int param = 0;
                if (GameScr.Class85.options != null) {
                    for (int i = 0; i < GameScr.Class85.options.size(); ++i) {
                        final ItemOption itemOption;
                        if ((itemOption = (ItemOption)GameScr.Class85.options.elementAt(i)).optionTemplate.id == 122) {
                            param = itemOption.param;
                        }
                    }
                }
                else {
                    Service.gI().requestItemInfo(GameScr.Class85.typeUI, GameScr.Class85.indexUI);
                }
                String s = Game86.Class361;
                String obj = String.valueOf(param) + Game86.Class288;
                String s2 = Game86.Class15;
                if (b == 0) {
                    s = Game86.Class360;
                    obj = String.valueOf(GameScr.Class251[GameScr.Class85.upgrade]) + Game86.Class287;
                    s2 = Game86.Class14;
                }
                mFont.number_red.Class1(mGraphics, s, n + GameScr.Class192 / 2, n2 + 3 * GameScr.Class192 / 2 + 2, 2);
                mFont.Class12.Class1(mGraphics, String.valueOf(obj), n + GameScr.Class192 / 2, n2 + 3 * GameScr.Class192 / 2 + 14, 2);
                final String[] class194 = mFont.number_red.Class2(s2, 130);
                for (int j = 0; j < class194.length; ++j) {
                    mFont.number_red.Class1(mGraphics, class194[j], n + GameScr.Class192 / 2, GameScr.Class156 + GameScr.Class159 - 25 + j * 12 - 2, 2);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void Class223() {
        try {
            if (GameScr.Class247) {
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect].Class4()) {
                    GameScr.Class85 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                    Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                }
            }
            else if (GameScr.Class248 && Char.getMyChar().arrItemBag[GameScr.indexSelect].Class2()) {
                GameScr.Class85 = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
            }
        }
        catch (Exception ex) {
            GameCanvas.Class35.Class1(Game86.Class3, null, new Command(Game86.CLOSE, 2), null);
            GameCanvas.Class34 = GameCanvas.Class35;
        }
    }
    
    private void Class47(mGraphics mGraphics) {
        if (GameScr.Class250) {
            if (GameScr.indexMenu == 0) {
                final mGraphics mGraphics2 = mGraphics;
                final String[] class193 = Game86.Class193;
                final Item[] class194 = GameScr.Class77;
                final String[] array = class193;
                mGraphics = mGraphics2;
                try {
                    Class2(mGraphics);
                    Class1(mGraphics, array, true);
                    if (class194 == null) {
                        GameCanvas.Class1(GameScr.Class157 + 90, GameScr.Class156 + 75, mGraphics);
                        mFont.Class7.Class1(mGraphics, Game86.Class25, GameScr.Class157 + 90, GameScr.Class156 + 90, 2);
                        return;
                    }
                    if (class194.length <= 30) {
                        GameScr.Class401 = 5;
                    }
                    else if (class194.length % GameScr.Class400 == 0) {
                        GameScr.Class401 = class194.length / GameScr.Class400;
                    }
                    else {
                        GameScr.Class401 = class194.length / GameScr.Class400 + 1;
                    }
                    GameScr.Class50.Class1(GameScr.Class401, GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class400 * GameScr.Class192, 5 * GameScr.Class192, true, 6);
                    GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class50.Class5 + 2, GameScr.Class50.Class6 + 2);
                    for (int i = 0; i < GameScr.Class401; ++i) {
                        for (int j = 0; j < GameScr.Class400; ++j) {
                            Game2.Class1(mGraphics, 154, GameScr.Class394 + j * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                            mGraphics.setColor(12281361);
                            final mGraphics mGraphics3 = mGraphics;
                            final int n = GameScr.Class394 + j * GameScr.Class192;
                            final int n2 = GameScr.Class395 + i * GameScr.Class192;
                            final int class195 = GameScr.Class192;
                            mGraphics3.Class2(n, n2, class195, class195);
                        }
                    }
                    for (int k = 0; k < class194.length; ++k) {
                        final Item item;
                        if ((item = class194[k]) != null) {
                            final int n3 = k / GameScr.Class400;
                            final int n4 = k - n3 * GameScr.Class400;
                            if (!item.Class7) {
                                mGraphics.setColor(12083);
                                mGraphics.fillRect(GameScr.Class394 + n4 * GameScr.Class192 + 1, GameScr.Class395 + n3 * GameScr.Class192 + 1, GameScr.Class192 - 1, GameScr.Class192 - 1);
                                Game2.Class1(mGraphics, 154, GameScr.Class394 + n4 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n3 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                            }
                            Game2.Class1(mGraphics, item.template.Class7, GameScr.Class394 + n4 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n3 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                        }
                    }
                    if (GameScr.Class193 > 0 && GameScr.indexSelect >= 0) {
                        final int n5 = GameScr.indexSelect / GameScr.Class400;
                        final int n6 = GameScr.indexSelect - n5 * GameScr.Class400;
                        mGraphics.setColor(16777215);
                        final mGraphics mGraphics4 = mGraphics;
                        final int n7 = GameScr.Class394 + n6 * GameScr.Class192;
                        final int n8 = GameScr.Class395 + n5 * GameScr.Class192;
                        final int class196 = GameScr.Class192;
                        mGraphics4.Class2(n7, n8, class196, class196);
                        Class1(GameScr.Class394 + n6 * GameScr.Class192, GameScr.Class395 + n5 * GameScr.Class192, mGraphics);
                    }
                }
                catch (Exception ex) {}
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Class193);
            }
        }
    }
    
    private void Class224() {
        for (int i = 0; i < GameScr.Class77.length; ++i) {
            if (GameScr.Class77[i] == null) {
                GameScr.Class77[i] = Char.getMyChar().arrItemBag[GameScr.indexSelect];
                Char.getMyChar().arrItemBag[GameScr.indexSelect] = null;
                final Command command = null;
                super.center = command;
                super.left = command;
                this.Class29();
                return;
            }
        }
    }
    
    private void Class225() {
        final MyVector myVector = new MyVector();
        for (int i = 0; i < GameScr.Class77.length; ++i) {
            if (GameScr.Class77[i] != null) {
                myVector.addElement(this.Class354);
                break;
            }
        }
        if (GameScr.Class77.length > 0) {
            myVector.addElement(new Command(Game86.Class193[0], 403));
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class226() {
        final Item itemFocus = getItemFocus(48);
        GameScr.Class77[GameScr.indexSelect] = null;
        Char.getMyChar().arrItemBag[itemFocus.indexUI] = itemFocus;
        final Command command = null;
        super.center = command;
        super.left = command;
        this.Class29();
    }
    
    private static void Class227() {
        Service.gI().Class3(GameScr.Class77);
    }
    
    private void Class48(final mGraphics mGraphics) {
        if (GameScr.indexMenu != 6) {
            return;
        }
        if (GameScr.Class458 == 0) {
            mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            mGraphics.setColor(Game25.Class1);
            Class1(mGraphics, Game86.Class163[GameScr.indexMenu], true);
            Class2(mGraphics);
            mGraphics.setColor(0);
            mGraphics.fillRect(GameScr.Class157 + 2, GameScr.Class156 + 31, 171, GameScr.Class159 - 34);
            mGraphics.setColor(13606712);
            mGraphics.Class2(GameScr.Class157 + 3, GameScr.Class156 + 32, 168, GameScr.Class159 - 37);
            mGraphics.setColor(Game25.Class1);
            mGraphics.fillRect(GameScr.Class157 + 4, GameScr.Class156 + 34, 166, GameScr.Class159 - 39);
            if (GameScr.Class97.Class81[4] != null) {
                mFont.Class7.Class1(mGraphics, GameScr.Class97.Class81[4].template.name, GameScr.Class157 + 90, GameScr.Class395 + 2, 2);
                for (int n = GameScr.Class97.Class81[4].Class8 + 1, i = 0; i < n; ++i) {
                    Game2.Class1(mGraphics, 628, GameScr.Class157 + 90 + i * 12 - n * 6, GameScr.Class395 + 20, 0, 3);
                }
            }
            for (int j = 0; j < GameScr.Class97.Class81.length - 1; ++j) {
                if (GameScr.Class97.Class81[j] != null) {
                    this.Class1(mGraphics, GameScr.Class97.Class81[j], this.Class281[j], this.Class282[j]);
                }
                else {
                    mGraphics.setColor(6425);
                    mGraphics.fillRect(this.Class281[j] - 1, this.Class282[j] - 1, GameScr.Class192 + 3, GameScr.Class192 + 3);
                    mFont.Class13.Class1(mGraphics, Game86.Class296[j + 24][0], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 - 10, 2);
                    mFont.Class13.Class1(mGraphics, Game86.Class296[j + 24][1], this.Class281[j] + GameScr.Class192 / 2, this.Class282[j] + GameScr.Class192 / 2 + 2, 2);
                }
                if (GameScr.indexSelect == j && GameScr.Class193 == 1 && GameScr.indexSelect < 4) {
                    mGraphics.setColor(16777215);
                }
                else {
                    mGraphics.setColor(12281361);
                }
                final int n2 = this.Class281[j];
                final int n3 = this.Class282[j];
                final int class192 = GameScr.Class192;
                mGraphics.Class2(n2, n3, class192, class192);
            }
            final int n4 = this.Class281[0] + GameScr.Class192 + 7;
            final int n5 = this.Class282[0] - 5;
            mGraphics.setColor(6425);
            mGraphics.fillRect(n4, n5, 84, 75);
            if (GameScr.indexSelect == 4) {
                mGraphics.setColor(16777215);
            }
            else {
                mGraphics.setColor(12281361);
            }
            mGraphics.Class2(n4, n5, 84, 75);
            int param = 0;
            int param2 = 0;
            int n6 = 0;
            int n7 = 0;
            int k = 0;
            if (GameScr.Class97.Class81[4] != null) {
                final int[][] array = (int[][])Game94.Class8.Class1(new StringBuffer(String.valueOf(GameScr.Class97.Class81[4].template.id)).toString());
                if (GameCanvas.gameTick % 20 > 15) {
                    Game2.Class1(mGraphics, array[0][0], n4 + 45 - 10, n5 + 35, 0, 3);
                }
                else {
                    Game2.Class1(mGraphics, array[0][1], n4 + 45 - 10, n5 + 35, 0, 3);
                }
                if (GameScr.Class97.Class81[4].options != null) {
                    for (int l = 0; l < GameScr.Class97.Class81[4].options.size(); ++l) {
                        final ItemOption itemOption;
                        if ((itemOption = (ItemOption)GameScr.Class97.Class81[4].options.elementAt(l)).optionTemplate.id == 65) {
                            param = itemOption.param;
                        }
                        else if (itemOption.optionTemplate.id == 66) {
                            param2 = itemOption.param;
                        }
                    }
                }
                n6 = param * 85 / 1000;
                n7 = param2 * 85 / 1000;
                k = GameScr.Class97.Class81[4].upgrade + 1;
            }
            final int n8 = GameScr.Class394 + 5;
            int n9 = GameScr.Class395 + 112;
            mFont.Class7.Class1(mGraphics, String.valueOf(Game86.Class125) + ": ", n8, n9, 0);
            mFont.Class7.Class1(mGraphics, new StringBuffer(String.valueOf(k)).toString(), n8 + 70, n9, 0);
            final mFont class193 = mFont.Class7;
            final String string = String.valueOf(Game86.Class208) + ": ";
            final int n10 = n8;
            n9 += 15;
            class193.Class1(mGraphics, string, n10, n9, 0);
            mGraphics.setColor(6425);
            mGraphics.fillRect(n8 + 70, n9, 85, 14);
            mGraphics.setColor(371981);
            mGraphics.fillRect(n8 + 70, n9, n6, 14);
            mGraphics.setColor(5131338);
            mGraphics.Class2(n8 + 70, n9, 85, 14);
            mFont.number_red.Class1(mGraphics, String.valueOf(param) + "/1000", n8 + 113, n9 + 2, 2);
            final mFont class194 = mFont.Class7;
            final String string2 = String.valueOf(Game86.Class255[2]) + ": ";
            final int n11 = n8;
            n9 += 17;
            class194.Class1(mGraphics, string2, n11, n9, 0);
            mGraphics.setColor(6425);
            mGraphics.fillRect(n8 + 70, n9, 85, 14);
            mGraphics.setColor(16711680);
            mGraphics.fillRect(n8 + 70, n9, n7, 14);
            mGraphics.setColor(5131338);
            mGraphics.Class2(n8 + 70, n9, 85, 14);
            mFont.number_red.Class1(mGraphics, String.valueOf(param2) + "/1000", n8 + 113, n9 + 2, 2);
            return;
        }
        if (GameScr.Class458 == 1) {
            mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, Game86.Class163[GameScr.indexMenu], true);
            mFont.Class17.Class1(mGraphics, Game86.Class263, GameScr.Class157 + 10, GameScr.Class156 + 33, 0);
            final mFont class195 = mFont.Class17;
            final StringBuffer sb = new StringBuffer();
            Char.getMyChar();
            class195.Class1(mGraphics, sb.append(0).toString(), GameScr.Class157 + GameScr.Class158 - 10, GameScr.Class156 + 33, 1);
            final int n12 = (GameScr.Class159 - 80) / 5;
            for (int n13 = 0; n13 < Char.getMyChar().Class53.length; ++n13) {
                mGraphics.setColor(Game25.Class4);
                if (GameScr.Class193 > 0 && GameScr.Class193 - 1 == n13) {
                    mGraphics.setColor(Game25.Class3);
                    mGraphics.fillRect(GameScr.Class157 + 5, GameScr.Class156 + 52 + n13 * (n12 + 4), GameScr.Class158 - 10, n12);
                    mGraphics.setColor(Game25.Class5);
                }
                mGraphics.Class2(GameScr.Class157 + 5, GameScr.Class156 + 52 + n13 * (n12 + 4), GameScr.Class158 - 10, n12);
                mFont.Class7.Class1(mGraphics, new StringBuffer().append(Char.getMyChar().Class53[n13]).toString(), GameScr.Class157 + GameScr.Class158 - 10, GameScr.Class156 + 52 + (n12 - 10) / 2 + n13 * (n12 + 4), 1);
                mFont.Class7.Class1(mGraphics, Game86.Class256[n13], GameScr.Class157 + 10, GameScr.Class156 + 52 + (n12 - 10) / 2 + n13 * (n12 + 4), 0);
            }
            if (GameScr.Class193 > 0) {
                mFont.Class16.Class1(mGraphics, Game86.Class398[GameScr.Class193 - 1], GameScr.Class157 + 10, GameScr.Class156 + 52 + (n12 - 10) / 2 + 4 * (n12 + 4), 0);
            }
        }
        else {
            Class2(mGraphics);
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            Class1(mGraphics, Game86.Class163[GameScr.indexMenu], true);
            mFont.Class7.Class1(mGraphics, Game86.Class264, GameScr.Class157 + 10, GameScr.Class156 + 32, 0);
            final mFont class196 = mFont.Class7;
            final StringBuffer sb2 = new StringBuffer();
            Char.getMyChar();
            class196.Class1(mGraphics, sb2.append(0).toString(), GameScr.Class157 + GameScr.Class158 - 10, GameScr.Class156 + 32, 1);
            mGraphics.setColor(0);
            mGraphics.fillRect(GameScr.Class157 + 4, GameScr.Class156 + 44, GameScr.Class158 - 7, GameScr.Class192 + 3);
            mGraphics.setColor(12281361);
            mGraphics.Class2(GameScr.Class157 + 5, GameScr.Class156 + 45, GameScr.Class158 - 10, GameScr.Class192);
            if (GameScr.Class193 > 0) {
                mGraphics.setColor(Game25.Class4);
                mGraphics.Class2(GameScr.Class157 + 5, GameScr.Class156 + 48 + GameScr.Class192, GameScr.Class158 - 10, GameScr.Class159 - 64 - GameScr.Class192);
            }
            final int length = Char.getMyChar().nClass.Class3.length;
            int n14 = GameScr.Class157 + 5;
            int n15 = GameScr.Class156 + 45;
            GameScr.Class50.Class1(length, GameScr.Class192 + 2, n14 + 1, n15, GameScr.Class158 - 12, GameScr.Class192 + 2, false, 1);
            GameScr.Class50.Class1(mGraphics);
            for (int n16 = 0; n16 < length; ++n16) {
                Game2.Class1(mGraphics, Char.getMyChar().nClass.Class3[n16].iconId, n14 + n16 * (GameScr.Class192 + 2) + GameScr.Class192 / 2, n15 + GameScr.Class192 / 2, 0, 3);
                if (GameScr.Class193 == 1 && n16 == GameScr.indexSelect) {
                    mGraphics.setColor(16777215);
                    mGraphics.Class2(n14 + n16 * (GameScr.Class192 + 2) + 2, n15 + 2, GameScr.Class192 - 4, GameScr.Class192 - 4);
                    Class1(n14 + n16 * (GameScr.Class192 + 2), n15, mGraphics);
                }
            }
            n14 += 8;
            n15 += 6;
            if (GameScr.Class193 == 1 && GameScr.indexSelect >= 0) {
                Class2(mGraphics);
                final SkillTemplate skillTemplate = Char.getMyChar().nClass.Class3[GameScr.indexSelect];
                GameScr.Class194 = 4 + skillTemplate.Class6.length;
                final Skill class197 = Char.getMyChar().Class1(skillTemplate);
                final int class198 = GameScr.Class157;
                final int n17 = n15 + GameScr.Class192 + 2;
                final int n18 = GameScr.Class158 - 6;
                final int n19 = GameScr.Class159 - 70 - GameScr.Class192;
                GameScr.Class196.Class1(mGraphics, class198, n17, n18, n19);
                this.Class402 = n15 + 18;
                if (class197 == null) {
                    final Skill skill = (skillTemplate.Class7.length > 1) ? skillTemplate.Class7[1] : skillTemplate.Class7[0];
                    mFont.Class3.Class1(mGraphics, skillTemplate.Class2, n14 + 5, this.Class402 += 12, 0);
                    for (int n20 = 0; n20 < skillTemplate.Class6.length; ++n20) {
                        mFont.number_red.Class1(mGraphics, skillTemplate.Class6[n20], n14 + 5, this.Class402 += 12, 0);
                    }
                    mFont.number_red.Class1(mGraphics, Game86.Class248[skillTemplate.type], n14 + 5, this.Class402 += 12, 0);
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class226) + ": " + skillTemplate.Class3, n14 + 5, this.Class402 += 12, 0);
                    mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class224, String.valueOf(skill.Class3)), n14 + 5, this.Class402 += 12, 0);
                    this.Class1(mGraphics, skill);
                    this.Class2(mGraphics, skill);
                }
                else {
                    mFont.Class7.Class1(mGraphics, skillTemplate.Class2, n14 + 5, this.Class402 += 12, 0);
                    for (int n21 = 0; n21 < skillTemplate.Class6.length; ++n21) {
                        mFont.number_red.Class1(mGraphics, skillTemplate.Class6[n21], n14 + 5, this.Class402 += 12, 0);
                    }
                    mFont.number_red.Class1(mGraphics, Game86.Class248[skillTemplate.type], n14 + 5, this.Class402 += 12, 0);
                    mFont.number_red.Class1(mGraphics, String.valueOf(Game86.Class226) + ": " + skillTemplate.Class3, n14 + 5, this.Class402 += 12, 0);
                    if (class197.Class3 == skillTemplate.Class3) {
                        mFont.Class15.Class1(mGraphics, Game86.Class227, n14 + 5, this.Class402 += 12, 0);
                        this.Class1(mGraphics, class197);
                        this.Class2(mGraphics, class197);
                    }
                    else {
                        mFont.Class15.Class1(mGraphics, Game86.Class1(Game86.Class225, String.valueOf(class197.Class3)), n14 + 5, this.Class402 += 12, 0);
                        this.Class1(mGraphics, class197);
                        this.Class2(mGraphics, class197);
                        int n22;
                        for (n22 = 0; n22 < skillTemplate.Class7.length; ++n22) {
                            if (skillTemplate.Class7[n22].equals(class197)) {
                                ++n22;
                                break;
                            }
                        }
                        mFont.Class14.Class1(mGraphics, Game86.Class1(Game86.Class224, String.valueOf(skillTemplate.Class7[n22].Class3)), n14 + 5, this.Class402 += 12, 0);
                        this.Class1(mGraphics, skillTemplate.Class7[n22]);
                        ++GameScr.Class194;
                        this.Class2(mGraphics, skillTemplate.Class7[n22]);
                    }
                }
                GameScr.Class196.Class1(GameScr.Class194, 12, class198, n17, n18, n19, true, 1);
                if (GameScr.indexRow >= 0) {
                    Game2.Class1(mGraphics, 942, n14 + 2, n15 + 32 + GameScr.indexRow * 12, 0, Game62.Class3);
                }
            }
        }
    }
    
    private void Class228() {
        final MyVector myVector = new MyVector();
        if (GameScr.Class458 == 0) {
            myVector.addElement(new Command(Game86.Class263, 5021));
            myVector.addElement(new Command(Game86.Class163[1], 5022));
            myVector.addElement(this.cmdCloseAll);
        }
        else if (GameScr.Class458 == 1) {
            myVector.addElement(new Command(Game86.Class163[GameScr.indexMenu], 502));
            myVector.addElement(new Command(Game86.Class163[1], 5022));
            myVector.addElement(this.cmdCloseAll);
        }
        else if (GameScr.Class458 == 2) {
            myVector.addElement(new Command(Game86.Class163[GameScr.indexMenu], 502));
            myVector.addElement(new Command(Game86.Class263, 5021));
            myVector.addElement(this.cmdCloseAll);
        }
        GameCanvas.Class30.Class1(myVector);
    }
    
    private static void Class229() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class103, 5041));
        myVector.addElement(new Command(Game86.Class104, 5042));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class230() {
        if ((GameScr.Class193 <= 0 || GameScr.Class193 > 4) && !GameCanvas.Class6) {
            return;
        }
        GameCanvas.inputDlg.show(Game86.Class283, this.Class290, 1);
    }
    
    private static void Class231() {
        final String class9;
        if ((class9 = GameCanvas.inputDlg.tfInput.Class9).trim().equals("")) {
            GameCanvas.setText(Game86.Class277);
            return;
        }
        int int1;
        try {
            int1 = Integer.parseInt(class9);
        }
        catch (Exception ex) {
            GameCanvas.endDlg();
            return;
        }
        if (int1 <= 0) {
            GameCanvas.endDlg();
            return;
        }
        if (Char.getMyChar().Class31 == 0 || int1 > Char.getMyChar().Class31) {
            GameCanvas.setText(Game86.Class276);
            return;
        }
        Service.gI().Class5(GameScr.Class193 - 1, int1);
        GameCanvas.endDlg();
    }
    
    private static void Class232() {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(new Command(Game86.Class103, 5051));
        myVector.addElement(new Command(Game86.Class104, 5052));
        GameCanvas.Class30.Class1(myVector);
    }
    
    private void Class233() {
        if (GameScr.Class193 <= 0 || GameScr.Class193 > 4) {
            return;
        }
        GameCanvas.inputDlg.show(Game86.Class283, this.Class291, 1);
    }
    
    private static void Class234() {
        final String class9;
        if ((class9 = GameCanvas.inputDlg.tfInput.Class9).trim().equals("")) {
            GameCanvas.setText(Game86.Class277);
            return;
        }
        int int1;
        try {
            int1 = Integer.parseInt(class9);
        }
        catch (Exception ex) {
            GameCanvas.endDlg();
            return;
        }
        if (Char.getMyChar().Class32 == 0 || int1 > Char.getMyChar().Class32) {
            GameCanvas.setText(Game86.Class277);
            GameCanvas.Class34 = GameCanvas.Class35;
            return;
        }
        Service.gI().Class6(Char.getMyChar().nClass.Class3[GameScr.indexSelect].id, int1);
        GameCanvas.endDlg();
    }
    
    public static Npc FindNpc(final int n) {
        final Char myChar = Char.getMyChar();
        final MyVector vNpc = GameScr.vNpc;
        int n2 = -1;
        Npc npc = null;
        for (int i = 0; i < vNpc.size(); ++i) {
            final Npc npc2;
            if ((npc2 = (Npc)vNpc.elementAt(i)) != null && n == npc2.template.npcTemplateId) {
                final int distance = Res.distance(myChar.cx, myChar.cy, npc2.cx, npc2.cy);
                if (n2 == -1 || distance < n2) {
                    n2 = distance;
                    npc = npc2;
                }
            }
        }
        return npc;
    }
    
    public static void PickNpca(final int n, final int n2, final int n3) {
        if (System.currentTimeMillis() < 500L) {
            Thread.sleep(500L - System.currentTimeMillis());
        }
        final Npc findNpc;
        if ((findNpc = FindNpc(n)) != null) {
            Char.Move(findNpc.cx, findNpc.cy);
            Char.getMyChar().npcFocus = findNpc;
            Service.gI().openMenu(findNpc.template.npcTemplateId);
            Service.gI().menu((byte)1, n, n2, n3);
        }
    }
    
    public static void Paint(final String s) {
        Service.gI().chat("[Ninja School 2.0.1] " + s);
    }
    
    public final void DSPK() {
        InfoDlg.hide();
        GameScr.isPaintAlert = true;
        this.isLockKey = true;
        GameScr.indexRow = 0;
        setPopupSize(175, 200);
        super.right = new Command(Game86.CLOSE, 3);
        final Command command = null;
        super.center = command;
        super.left = command;
        this.textsTitle = "DS PK";
        this.texts = DSPK.Game1();
    }
    
    public final void DSHS() {
        InfoDlg.hide();
        GameScr.isPaintAlert = true;
        this.isLockKey = true;
        GameScr.indexRow = 0;
        setPopupSize(175, 200);
        super.right = new Command(Game86.CLOSE, 3);
        final Command command = null;
        super.center = command;
        super.left = command;
        this.textsTitle = "DS H\u1ed3i Sinh";
        this.texts = Code.Game7();
    }
    
    private static void Game1(final mGraphics mGraphics, final short[] array) {
        GameScr.Class401 = array.length / GameScr.Class400;
        GameScr.Class50.Class1(GameScr.Class401, GameScr.Class192, GameScr.Class394, GameScr.Class395, GameScr.Class400 * GameScr.Class192, 5 * GameScr.Class192, true, 6);
        GameScr.Class50.Class1(mGraphics, GameScr.Class394, GameScr.Class395, GameScr.Class50.Class5 + 2, GameScr.Class50.Class6 + 2);
        for (int i = 0; i < GameScr.Class401; ++i) {
            for (int j = 0; j < GameScr.Class400; ++j) {
                Game2.Class1(mGraphics, 154, GameScr.Class394 + j * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + i * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                mGraphics.setColor(12281361);
                final int n = GameScr.Class394 + j * GameScr.Class192;
                final int n2 = GameScr.Class395 + i * GameScr.Class192;
                final int class192 = GameScr.Class192;
                mGraphics.Class2(n, n2, class192, class192);
            }
        }
        for (int k = 0; k < array.length; ++k) {
            final short n3;
            if ((n3 = array[k]) > 0) {
                final int n4 = k / GameScr.Class400;
                final int n5 = k - n4 * GameScr.Class400;
                final ItemTemplate class193;
                if ((class193 = Game104.Class1(n3)) != null) {
                    Game2.Class1(mGraphics, class193.Class7, GameScr.Class394 + n5 * GameScr.Class192 + GameScr.Class192 / 2, GameScr.Class395 + n4 * GameScr.Class192 + GameScr.Class192 / 2, 0, 3);
                }
            }
        }
        if (GameScr.Class193 > 0 && GameScr.indexSelect >= 0) {
            final int n6 = GameScr.indexSelect / GameScr.Class400;
            final int n7 = GameScr.indexSelect - n6 * GameScr.Class400;
            mGraphics.setColor(16777215);
            final int n8 = GameScr.Class394 + n7 * GameScr.Class192;
            final int n9 = GameScr.Class395 + n6 * GameScr.Class192;
            final int class194 = GameScr.Class192;
            mGraphics.Class2(n8, n9, class194, class194);
            Class1(GameScr.Class394 + n7 * GameScr.Class192, GameScr.Class395 + n6 * GameScr.Class192, mGraphics);
        }
    }
    
    private void ItemBan(final mGraphics mGraphics) {
        if (GameScr.ItemBan) {
            if (GameScr.indexMenu == 0) {
                Class2(mGraphics);
                Class1(mGraphics, Game86.Game508, false);
                Game1(mGraphics, Code.Itemdell);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Game508);
            }
        }
    }
    
    private void ItemNhat(final mGraphics mGraphics) {
        if (GameScr.ItemNhat) {
            if (GameScr.indexMenu == 0) {
                Class2(mGraphics);
                Class1(mGraphics, Game86.Game508, false);
                Game1(mGraphics, Code.ShortItemNhat);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Game508);
            }
        }
    }
    
    private void ItemVut(final mGraphics mGraphics) {
        if (GameScr.ItemVut) {
            if (GameScr.indexMenu == 0) {
                Class2(mGraphics);
                Class1(mGraphics, Game86.Game508, false);
                Game1(mGraphics, Code.Boradat);
                return;
            }
            if (GameScr.indexMenu == 1) {
                this.Class1(mGraphics, Game86.Game508);
            }
        }
    }
    
    public final void DSMB() {
        InfoDlg.hide();
        GameScr.isPaintAlert = true;
        this.isLockKey = true;
        GameScr.indexRow = 0;
        setPopupSize(175, 200);
        super.right = new Command(Game86.CLOSE, 3);
        final Command command = null;
        super.center = command;
        super.left = command;
        this.textsTitle = "DSMB";
        this.texts = AutoBuy.Game1();
    }
    
    public static void CK(final int game1) {
        new Thread(new CK(game1)).start();
    }
    
    public static void FindNpc2(final int n) {
        final Npc findNpc;
        if ((findNpc = FindNpc(n)) != null) {
            Char.Move(findNpc.cx, findNpc.cy);
            Char.getMyChar().npcFocus = findNpc;
            Service.gI().openMenu(findNpc.template.npcTemplateId);
        }
    }
}
