import java.util.Enumeration;
import main.GameCanvas;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class Char extends Game19
{
    public boolean isHuman;
    public boolean Class3;
    public boolean Class4;
    private int Class171;
    private int Class172;
    public long Class5;
    public ChatPopup Class6;
    public long cEXP;
    public long Class8;
    private int Class173;
    private int Class174;
    public int cx;
    public int cy;
    public int Class11;
    public int Class12;
    public int Class13;
    private int Class175;
    private int Class176;
    public int statusMe;
    public int Class15;
    public int charID;
    public int cgender;
    public int ctaskId;
    private int Class177;
    public int Class19;
    public int Class20;
    public int Class21;
    public int Class22;
    public int cMP;
    public int cMaxMP;
    public int cHP;
    public int Class26;
    public int cMaxHP;
    private int Class178;
    public int Class28;
    public int Class29;
    public long Class30;
    public int Class31;
    public int Class32;
    public int Class33;
    public int Class34;
    public int Class35;
    public int Class36;
    public int Class37;
    public int Class38;
    public int Class39;
    public int Class40;
    public int Class41;
    public int Class42;
    public int Class43;
    public int Class44;
    public int Class45;
    public int Class46;
    public int Class47;
    public int Class48;
    public int Class49;
    public int Class50;
    public int Class51;
    public int[] Class52;
    public int[] Class53;
    public String cName;
    public String Class55;
    public byte Class56;
    public static Game117 Class57;
    public int Class58;
    public int Class59;
    private int Class179;
    private int Class180;
    public boolean Class60;
    private boolean Class181;
    public boolean Class61;
    private boolean Class182;
    private boolean Class183;
    public int Class62;
    private int Class184;
    public boolean Class63;
    public boolean Class64;
    public boolean Class65;
    private boolean Class185;
    public boolean Class66;
    public int xu;
    public int Class68;
    public int yen;
    public int luong;
    public NClass nClass;
    public MyVector vSkill;
    public MyVector vSkillFight;
    public MyVector vEff;
    private MyVector Class186;
    public Skill myskill;
    public Task taskMaint;
    private boolean Class187;
    public Item[] arrItemBag;
    public Item[] Class78;
    public Item[] arrItemBody;
    public Item[] Class80;
    public Item[] Class81;
    public short Class82;
    public short Class83;
    public short Class84;
    public short Class85;
    public short Class86;
    public short Class87;
    public byte cPk;
    public byte cTypePk;
    public short Class90;
    public short Class91;
    public short Class92;
    public Mob mobFocus;
    public Mob Class94;
    public Npc npcFocus;
    public Char charFocus;
    public ItemMap itemFocus;
    public MyVector Class98;
    public Mob[] Class99;
    public Char[] Class100;
    public short[] Class101;
    public int testCharId;
    public int killCharId;
    public byte Class104;
    public int Class105;
    public int Class106;
    public int Class107;
    private int Class188;
    private int Class189;
    public boolean Class108;
    public static boolean Class109;
    public static boolean Class110;
    public static boolean Class111;
    public static boolean isABuff;
    public static boolean isAPickYen;
    public static boolean Class114;
    public static boolean Class115;
    public static boolean Class116;
    public static boolean Class117;
    public static boolean Class118;
    public static int aHpValue;
    public static int aMpValue;
    public static int Class121;
    public static int Class122;
    private long Class190;
    public MyVector taskOrder;
    public static int Class124;
    public static int Class125;
    private long Class191;
    public long Class126;
    public static final int[][][] Class127;
    private static Char myChar;
    private int Class193;
    public int cxSend;
    public int cySend;
    public int Class130;
    public int Class131;
    public MyVector Class132;
    public static boolean Class133;
    public static boolean Class134;
    public boolean Class135;
    public boolean Class136;
    public boolean Class137;
    public Game58 Class138;
    private int Class194;
    private boolean Class195;
    private long Class196;
    public int Class139;
    private long timeSendmove;
    private static boolean Class198;
    private int Class199;
    private int Class200;
    private int Class201;
    private int Class202;
    private int Class203;
    private long Class204;
    private boolean Class205;
    public static byte[] Class140;
    private long Class206;
    private long Class207;
    private static short Class208;
    public short head;
    public short leg;
    public short body;
    public short Class144;
    public short Class145;
    public short Class146;
    private int Class209;
    public int Class147;
    private Game106 Class210;
    public Game106 Class148;
    private int Class211;
    private int Class212;
    private int Class213;
    private int Class214;
    private int Class215;
    private int Class216;
    private int Class217;
    private int Class218;
    private int Class219;
    private int Class220;
    private Game106 Class221;
    private Game106 Class222;
    private Game106 Class223;
    public Game24 Class149;
    public SkillPaint Class150;
    public EffectPaint[] effPaints;
    private int Class225;
    private byte Class226;
    private static Game71 Class227;
    private int Class228;
    private int Class229;
    private int Class230;
    private int Class231;
    private int Class232;
    private int Class233;
    private int Class234;
    private int Class235;
    private int Class236;
    private int[] Class237;
    private int Class238;
    private int Class239;
    private int Class240;
    private int Class241;
    private int Class242;
    private int Class243;
    private int Class244;
    private int Class245;
    private int Class246;
    private int Class247;
    private int Class248;
    private int Class249;
    private int Class250;
    private int Class251;
    private int Class252;
    private int Class253;
    public short ID_Body;
    public short ID_PP;
    public short ID_HAIR;
    public short ID_LEG;
    public short ID_HORSE;
    public short ID_NAME;
    public short ID_RANK;
    public short ID_MAT_NA;
    public short ID_Bien_Hinh;
    public short ID_WEA_PONE;
    private int Class257;
    private int Class258;
    private int Class259;
    private int Class260;
    private byte[] Class261;
    private byte Class262;
    int Class158;
    private short[] Class263;
    int Class159;
    int Class160;
    int Class161;
    int Class162;
    byte Class163;
    byte Class164;
    private int Class264;
    private int Class265;
    private byte Class266;
    public static boolean Class165;
    public short Class166;
    public short Class167;
    public boolean Class168;
    public Skill Class169;
    public boolean Class170;
    private int Class267;
    private int Class268;
    private int Class269;
    private int Class270;
    private int[][] Class271;
    private int Class272;
    private int Class273;
    private int Class274;
    public static boolean DungCoLenh;
    public static boolean MuaCoLenh;
    public static boolean DanhQuaiThuong;
    public static boolean DanhTheoNhom;
    public static boolean NePK;
    public static boolean ChuyenMapHetBos;
    public static boolean NhatHPMP;
    public static int LvHPMP;
    public static boolean NhatDa;
    public static int LvDa;
    public static boolean NhatTB;
    public static int LvTrangBi;
    public static boolean NhatVPNV;
    public static boolean NhatVPSK;
    public static boolean NhatSVC;
    public static boolean NhatAll;
    public static boolean SanTATL;
    public Char ThemChar1;
    public static boolean DungPhanThan;
    public static boolean DungKhiem;
    public static boolean DungDQAT;
    public static boolean DanhTA;
    public static boolean DanhTL;
    public static boolean ReMap;
    public static boolean LuyenDa;
    public static int LvLuyenDa;
    public static boolean TSMTrrong;
    public Char ThemChar2;
    public static boolean TuSat;
    public static boolean NhatTBLa;
    
    static {
        Char.DungCoLenh = true;
        Char.TuSat = true;
        Char.DanhQuaiThuong = true;
        Char.DanhTheoNhom = true;
        Char.NePK = true;
        Char.ChuyenMapHetBos = true;
        Char.NhatHPMP = true;
        Char.LvHPMP = 30;
        Char.NhatDa = true;
        Char.ReMap = true;
        Char.LvDa = 5;
        Char.NhatTB = true;
        Char.LvTrangBi = 30;
        Char.NhatVPNV = true;
        Char.NhatVPSK = true;
        Char.NhatSVC = true;
        Char.NhatAll = true;
        Char.SanTATL = true;
        Char.DanhTA = true;
        Char.DanhTL = true;
        Char.DungKhiem = true;
        Char.DungPhanThan = true;
        Char.TSMTrrong = true;
        Char.MuaCoLenh = true;
        Char.aHpValue = 20;
        Char.aMpValue = 20;
        Char.Class121 = 70;
        Class127 = new int[][][] { { { 0, -10, 32 }, { 1, -7, 7 }, { 1, -11, 15 }, { 1, -9, 45 } }, { { 0, -10, 33 }, { 1, -7, 7 }, { 1, -11, 16 }, { 1, -9, 46 } }, { { 1, -10, 33 }, { 2, -10, 11 }, { 2, -9, 16 }, { 1, -12, 49 } }, { { 1, -10, 32 }, { 3, -11, 9 }, { 3, -11, 16 }, { 1, -13, 47 } }, { { 1, -10, 34 }, { 4, -9, 9 }, { 4, -8, 16 }, { 1, -12, 47 } }, { { 1, -10, 34 }, { 5, -11, 11 }, { 5, -10, 17 }, { 1, -13, 49 } }, { { 1, -10, 33 }, { 6, -9, 9 }, { 6, -8, 16 }, { 1, -12, 47 } }, { { 0, -9, 36 }, { 7, -5, 15 }, { 7, -10, 21 }, { 1, -8, 49 } }, { { 4, -13, 26 }, new int[3], new int[3], new int[3] }, { { 5, -13, 25 }, new int[3], new int[3], new int[3] }, { { 6, -12, 26 }, new int[3], new int[3], new int[3] }, { { 7, -13, 25 }, new int[3], new int[3], new int[3] }, { { 0, -9, 35 }, { 8, -4, 13 }, { 8, -14, 27 }, { 1, -9, 49 } }, { { 0, -9, 31 }, { 9, -11, 8 }, { 10, -10, 17 }, new int[3] }, { { 2, -7, 33 }, { 9, -11, 8 }, { 11, -8, 15 }, new int[3] }, { { 2, -8, 32 }, { 9, -11, 8 }, { 12, -8, 14 }, new int[3] }, { { 2, -7, 32 }, { 9, -11, 8 }, { 13, -12, 15 }, new int[3] }, { { 0, -11, 31 }, { 9, -11, 8 }, { 14, -15, 18 }, new int[3] }, { { 2, -9, 32 }, { 9, -11, 8 }, { 15, -13, 19 }, new int[3] }, { { 2, -9, 31 }, { 9, -11, 8 }, { 16, -7, 22 }, new int[3] }, { { 2, -9, 32 }, { 9, -11, 8 }, { 17, -11, 18 }, new int[3] }, { { 3, -12, 34 }, { 8, -4, 13 }, { 8, -15, 25 }, { 1, -10, 46 } }, { { 0, -9, 32 }, { 8, -4, 9 }, { 10, -10, 18 }, new int[3] }, { { 2, -7, 34 }, { 8, -4, 9 }, { 11, -8, 16 }, new int[3] }, { { 2, -8, 33 }, { 8, -4, 9 }, { 12, -8, 15 }, new int[3] }, { { 2, -7, 33 }, { 8, -4, 9 }, { 13, -12, 16 }, new int[3] }, { { 0, -11, 32 }, { 7, -5, 9 }, { 14, -15, 19 }, new int[3] }, { { 2, -9, 33 }, { 7, -5, 9 }, { 15, -13, 20 }, new int[3] }, { { 2, -9, 32 }, { 7, -5, 9 }, { 16, -7, 23 }, new int[3] }, { { 2, -9, 33 }, { 7, -5, 9 }, { 17, -11, 19 }, new int[3] } };
        final int[] array = { -2, -6, 22, 21, 19, 22, 10, -2, -2, 5, 19 };
        final int[] array2 = { 9, 22, 25, 17, 26, 37, 36, 49, 50, 52, 36 };
        Char.Class198 = true;
        Char.Class140 = new byte[] { 0, 0, 0, -1, -1, -1, -2, -2, -2, -1, -1, -1 };
        Char.Class208 = 250;
        Char.Class227 = new Game71();
        Char.Class165 = false;
        System.out.println("Load Auto");
        try {
            final ByteArrayInputStream in = new ByteArrayInputStream(TaskOrder.Loaddata("V7ProSetting"));
            final DataInputStream dataInputStream;
            final int int1 = (dataInputStream = new DataInputStream(in)).readInt();
            System.out.println("lent V\u1ee9t: ".concat(String.valueOf(int1)));
            if (Code.Boradat.length < int1) {
                Code.Boradat = new short[10 * (int1 / 10 + 1)];
            }
            for (int i = 0; i < int1; ++i) {
                Code.Boradat[i] = dataInputStream.readShort();
            }
            final int int2 = dataInputStream.readInt();
            System.out.println("lent B\u00e1n: ".concat(String.valueOf(int2)));
            if (Code.Itemdell.length < int2) {
                Code.Itemdell = new short[10 * (int2 / 10 + 1)];
            }
            for (int j = 0; j < j; ++j) {
                Code.Itemdell[j] = dataInputStream.readShort();
            }
            in.close();
            dataInputStream.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int getdxSkill() {
        if (this.myskill != null) {
            return this.myskill.dx;
        }
        return 0;
    }
    
    public int getdySkill() {
        if (this.myskill != null) {
            return this.myskill.dy;
        }
        return 0;
    }
    
    public Char() {
        final short[] array = { -1, -1, -1, -1 };
        this.Class171 = 0;
        this.Class172 = 0;
        this.cx = 24;
        this.cy = 24;
        this.statusMe = 5;
        this.Class15 = 1;
        this.Class52 = new int[4];
        this.Class53 = new int[4];
        new MyVector();
        this.Class55 = "";
        this.Class58 = 22;
        this.Class59 = 32;
        this.Class179 = 11;
        this.Class180 = 16;
        this.Class60 = true;
        this.Class63 = false;
        this.Class64 = false;
        this.Class185 = false;
        this.Class66 = false;
        this.vSkill = new MyVector();
        this.vSkillFight = new MyVector();
        this.vEff = new MyVector();
        this.Class186 = new MyVector();
        this.Class187 = true;
        this.Class80 = new Item[5];
        this.Class81 = new Item[5];
        this.Class98 = new MyVector();
        this.testCharId = -9999;
        this.killCharId = -9999;
        this.Class190 = 0L;
        this.taskOrder = new MyVector();
        this.Class132 = new MyVector();
        this.Class194 = 0;
        this.Class196 = System.currentTimeMillis();
        this.Class139 = 0;
        this.Class204 = 0L;
        this.Class205 = false;
        this.Class145 = -1;
        this.Class146 = -1;
        this.Class209 = -1;
        this.Class147 = -1;
        this.Class221 = null;
        this.Class222 = null;
        this.Class223 = null;
        this.Class149 = null;
        this.Class228 = 0;
        this.Class229 = 0;
        this.Class230 = 0;
        this.Class231 = 0;
        this.Class232 = 0;
        this.Class233 = 0;
        this.Class234 = 0;
        this.Class235 = 0;
        this.Class236 = 0;
        this.Class237 = new int[] { 1715, 1737, 1714, 1738 };
        this.ID_Body = -1;
        this.ID_PP = -1;
        this.ID_HAIR = -1;
        this.ID_LEG = -1;
        this.ID_HORSE = -1;
        this.ID_NAME = -1;
        this.ID_RANK = -1;
        this.ID_MAT_NA = -1;
        this.ID_Bien_Hinh = -1;
        this.ID_WEA_PONE = -1;
        this.Class262 = 0;
        this.Class263 = new short[] { 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
        this.Class264 = 0;
        this.Class265 = 0;
        this.Class266 = 2;
        this.Class271 = new int[][] { { 3049, 3050 }, { 3051, 3051, 3052, 3052, 3053, 3053 }, { 3054 }, { 3055 }, { 3056 }, { 3049, 3049, 3049, 3050, 3050, 3050 } };
        this.statusMe = 6;
    }
    
    public final int Class1() {
        if (this.nClass.classId == 1 || this.nClass.classId == 2) {
            return 1;
        }
        if (this.nClass.classId == 3 || this.nClass.classId == 4) {
            return 2;
        }
        if (this.nClass.classId == 5 || this.nClass.classId == 6) {
            return 3;
        }
        return 0;
    }
    
    public final int Class2() {
        if (Code.Game32) {
            return Code.Game33;
        }
        if (this.Class64 || this.Class63) {
            return this.Class19 + 2;
        }
        return this.Class19;
    }
    
    public final boolean Class3() {
        return this.nClass.classId == 2 || this.nClass.classId == 4 || this.nClass.classId == 6;
    }
    
    public static Char getMyChar() {
        if (Char.myChar == null) {
            (Char.myChar = new Char()).Class61 = true;
            Char.myChar.Class181 = true;
            Char.myChar.Class207 = System.currentTimeMillis();
        }
        return Char.myChar;
    }
    
    public static void Class5() {
        Char.isABuff = (Char.Class118 = (Char.Class111 = (Char.Class109 = (Char.Class110 = (Char.Class116 = (Char.isAPickYen = (Char.Class114 = (Char.Class115 = (Char.Class117 = false)))))))));
        Char.myChar = null;
    }
    
    public final void Class1(final Message message) {
        try {
            this.Class19 = message.Class4.readByte();
            this.cMaxHP = message.Class4.readInt();
            this.cMaxMP = message.Class4.readInt();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Char.readParam()");
        }
    }
    
    public final void Class6() {
        try {
            final MyVector myVector = new MyVector();
            for (int i = 0; i < this.arrItemBag.length; ++i) {
                final Item item;
                if ((item = this.arrItemBag[i]) != null && item.template.isUpToUp && !item.Class15) {
                    myVector.addElement(item);
                }
            }
            for (int j = 0; j < myVector.size(); ++j) {
                final Item item2;
                if ((item2 = (Item)myVector.elementAt(j)) != null) {
                    for (int k = j + 1; k < myVector.size(); ++k) {
                        final Item item3;
                        if ((item3 = (Item)myVector.elementAt(k)) != null && item2.template.equals(item3.template) && item2.Class7 == item3.Class7) {
                            final Item item4 = item2;
                            item4.quantity += item3.quantity;
                            this.arrItemBag[item3.indexUI] = null;
                            myVector.setElementAt(null, k);
                        }
                    }
                }
            }
            for (int l = 0; l < this.arrItemBag.length; ++l) {
                if (this.arrItemBag[l] != null) {
                    for (int indexUI = 0; indexUI <= l; ++indexUI) {
                        if (this.arrItemBag[indexUI] == null) {
                            final int n = indexUI;
                            final Item[] arrItemBag = this.arrItemBag;
                            arrItemBag[n] = arrItemBag[l];
                            this.arrItemBag[indexUI].indexUI = indexUI;
                            this.arrItemBag[l] = null;
                            break;
                        }
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Char.bagSort()");
        }
    }
    
    public final void Class7() {
        try {
            final MyVector myVector = new MyVector();
            for (int i = 0; i < this.Class78.length; ++i) {
                final Item item;
                if ((item = this.Class78[i]) != null && item.template.isUpToUp && !item.Class15) {
                    myVector.addElement(item);
                }
            }
            for (int j = 0; j < myVector.size(); ++j) {
                final Item item2;
                if ((item2 = (Item)myVector.elementAt(j)) != null) {
                    for (int k = j + 1; k < myVector.size(); ++k) {
                        final Item item3;
                        if ((item3 = (Item)myVector.elementAt(k)) != null && item2.template.equals(item3.template) && item2.Class7 == item3.Class7) {
                            final Item item4 = item2;
                            item4.quantity += item3.quantity;
                            this.Class78[item3.indexUI] = null;
                            myVector.setElementAt(null, k);
                        }
                    }
                }
            }
            for (int l = 0; l < this.Class78.length; ++l) {
                if (this.Class78[l] != null) {
                    for (int indexUI = 0; indexUI <= l; ++indexUI) {
                        if (this.Class78[indexUI] == null) {
                            final int n = indexUI;
                            final Item[] class78 = this.Class78;
                            class78[n] = class78[l];
                            this.Class78[indexUI].indexUI = indexUI;
                            this.Class78[l] = null;
                            break;
                        }
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Char.boxSort()");
        }
    }
    
    public final void Class1(final int n) {
        final Item item;
        if ((item = this.arrItemBag[n]).Class2()) {
            item.Class7 = true;
            item.typeUI = 5;
            final Item item2 = this.arrItemBody[item.template.type];
            this.arrItemBag[n] = null;
            if (item2 != null) {
                item2.typeUI = 3;
                this.arrItemBody[item.template.type] = null;
                item2.indexUI = n;
                this.arrItemBag[n] = item2;
            }
            final Item item3 = item;
            item3.indexUI = item3.template.type;
            this.arrItemBody[item.indexUI] = item;
            for (int i = 0; i < this.arrItemBody.length; ++i) {
                final Item item4;
                if ((item4 = this.arrItemBody[i]) != null) {
                    if (item4.template.type == 1) {
                        this.Class144 = item4.template.Class8;
                    }
                    else if (item4.template.type == 2) {
                        this.body = item4.template.Class8;
                    }
                    else if (item4.template.type == 6) {
                        this.leg = item4.template.Class8;
                    }
                }
            }
            return;
        }
        if (item.Class3()) {
            item.Class7 = true;
            item.typeUI = 41;
            this.arrItemBag[n] = null;
            for (int j = 0; j < this.Class80.length; ++j) {
                final int n2;
                if ((n2 = item.template.type - 29) == j) {
                    final Item item5;
                    if ((item5 = this.Class80[n2]) != null) {
                        item5.typeUI = 41;
                        this.Class80[n2] = null;
                        item5.indexUI = n;
                        this.arrItemBag[n] = item5;
                    }
                    final Item item6 = item;
                    item6.indexUI = item6.template.type;
                    this.Class80[n2] = item;
                    return;
                }
            }
        }
    }
    
    public final Skill Class1(final SkillTemplate obj) {
        for (int i = 0; i < this.vSkill.size(); ++i) {
            final Skill skill;
            if ((skill = (Skill)this.vSkill.elementAt(i)).template.equals(obj)) {
                return skill;
            }
        }
        return null;
    }
    
    private boolean Class33() {
        for (int size = TileMap.vGo.size(), i = 0; i < size; i = (byte)(i + 1)) {
            final InfoDlg infoDlg = TileMap.vGo.elementAt(i);
            if (this.cx >= infoDlg.minX && this.cx <= infoDlg.maxX && this.cy >= infoDlg.minY && this.cy <= infoDlg.maxY) {
                return true;
            }
        }
        return false;
    }
    
    private static int Class2(final int n, final int n2) {
        return Res.abs(n - n2);
    }
    
    private void Class34() {
        if (this.ID_HORSE == -1) {
            this.Class264 = 0;
            this.Class265 = 0;
            return;
        }
        final Game123 class1;
        if ((class1 = Class1(this.ID_HORSE, true)) == null || !class1.Class7) {
            return;
        }
        if (this.Class261 == null) {
            this.Class261 = class1.Class11;
        }
        this.Class264 = class1.Class18;
        this.Class265 = class1.Class17;
        if (this.Class15 == 1) {
            this.Class265 = -this.Class265;
        }
        if (this.statusMe == 1 || this.statusMe == 6) {
            this.Class261 = class1.Class11;
            this.Class262 = 0;
        }
        else if (this.statusMe == 2 || this.statusMe == 10) {
            this.Class261 = class1.Class12;
            this.Class262 = (byte)(class1.Class12.length - 1);
        }
        else if (this.statusMe == 4) {
            this.Class261 = class1.Class14;
            this.Class262 = (byte)(class1.Class12.length + class1.Class11.length + class1.Class13.length - 3);
        }
        else if (this.statusMe == 3) {
            this.Class261 = class1.Class13;
            this.Class262 = (byte)(class1.Class12.length + class1.Class11.length - 2);
        }
        else {
            this.Class261 = class1.Class11;
            this.Class262 = 0;
        }
        if (GameCanvas.gameTick % 3 == 0) {
            this.Class201 = (this.Class201 + 1) % this.Class261.length;
            this.Class202 = class1.Class15[this.Class201 + this.Class262];
            this.Class260 = (this.Class260 + 1) % this.Class261.length;
        }
        this.Class62 = this.Class202;
    }
    
    public void Class8() {
        final Game123 class1;
        if (this.ID_NAME >= 0 && (class1 = Class1(this.ID_NAME, false)) != null && class1.Class4 != null) {
            ++this.Class239;
            if (this.Class239 > class1.Class4.length - 1) {
                this.Class239 = 0;
            }
            this.Class238 = class1.Class4[this.Class239];
        }
        final Game123 class2;
        if (this.ID_RANK >= 0 && (class2 = Class1(this.ID_RANK, false)) != null && class2.Class4 != null) {
            ++this.Class241;
            if (this.Class241 > class2.Class4.length - 1) {
                this.Class241 = 0;
            }
            this.Class240 = class2.Class4[this.Class241];
        }
        this.Class199 = this.cx;
        this.Class200 = this.cy;
        if (this.arrItemBody != null && this.arrItemBody[10] == null && this.Class94 != null) {
            this.Class94 = null;
        }
        if (this.ID_Bien_Hinh >= 0) {
            this.Class245 = (this.Class245 + 1) % 10;
        }
        if (this.ID_MAT_NA >= 0) {
            this.Class243 = (this.Class243 + 1) % 9;
        }
        if (this.ID_WEA_PONE >= 0) {
            this.Class247 = (this.Class247 + 1) % 10;
        }
        if (this.ID_LEG >= 0) {
            this.Class249 = (this.Class249 + 1) % 10;
        }
        if (this.ID_Body >= 0) {
            this.Class251 = (this.Class251 + 1) % 10;
        }
        if (this.ID_HAIR >= 0) {
            this.Class253 = (this.Class253 + 1) % 10;
        }
        if (this.ID_PP >= 0) {
            this.Class258 = (this.Class258 + 1) % 10;
        }
        if (this.Class61 && this.cHP > 0) {
            final int class3 = Class2(this.cxSend, this.cx);
            final int class4 = Class2(this.cySend, this.cy);
            if ((class3 > 0 || class4 > 0) && System.currentTimeMillis() - this.timeSendmove >= 250L) {
                Char.Class198 = true;
            }
            if (Char.Class198) {
                Char.Class198 = false;
                Service.gI().charMove(this.cx, this.cy);
                this.timeSendmove = System.currentTimeMillis();
                this.cxSend = this.cx;
                this.cySend = this.cy;
            }
        }
        if (this.Class94 != null) {
            if (this.Class94 != null && this.Class94.templateId >= 236) {
                if (this.Class94 != null) {
                    this.Class94.Class29 = this;
                }
                if (this.Class94.templateId == 122 || this.Class94.templateId == 70 || (this.Class94.getTemplate() != null && this.Class94.getTemplate().Class4 == 1)) {
                    if (this.Class94.status != 3) {
                        this.Class94.xFirst = this.cx + (3 - GameCanvas.gameTick % 6) * 6;
                        this.Class94.yFirst = this.cy - 60;
                    }
                    this.Class94.Class1();
                }
                else {
                    if (this.Class94.status != 3) {
                        if (this.Class15 == -1) {
                            this.Class94.xFirst = this.cx + 20;
                            this.Class94.yFirst = this.cy;
                            this.Class94.dir = this.Class15;
                            this.Class94.y = this.cy - 20;
                        }
                        else {
                            this.Class94.xFirst = this.cx - 20;
                            this.Class94.yFirst = this.cy;
                            this.Class94.dir = this.Class15;
                            this.Class94.y = this.cy - 20;
                        }
                        final int n = this.Class94.xFirst - this.Class94.x;
                        final int n2 = this.Class94.yFirst - this.Class94.y;
                        if (n > 50 || n < -50) {
                            final Mob class5 = this.Class94;
                            class5.x += n / 10;
                        }
                        else {
                            final Mob class6 = this.Class94;
                            class6.x += n;
                        }
                        if (n2 > 50 || n2 < -50) {
                            final Mob class7 = this.Class94;
                            class7.y += n2 / 10;
                        }
                    }
                    this.Class94.Class1();
                }
            }
            else if (this.Class94.templateId == 122 || this.Class94.templateId == 70 || (this.Class94.getTemplate() != null && this.Class94.getTemplate().Class4 == 1)) {
                if (this.Class94.status != 3) {
                    this.Class94.xFirst = this.cx + (3 - GameCanvas.gameTick % 6) * 6;
                    this.Class94.yFirst = this.cy - 60;
                    final int n3 = this.Class94.xFirst - this.Class94.x;
                    final int n4 = this.Class94.yFirst - this.Class94.y;
                    if (n3 > 50 || n3 < -50) {
                        final Mob class8 = this.Class94;
                        class8.x += n3 / 10;
                    }
                    if (n4 > 50 || n4 < -50) {
                        final Mob class9 = this.Class94;
                        class9.y += n4 / 10;
                    }
                }
                this.Class94.Class1();
            }
            else {
                if (this.Class94.status != 3) {
                    if (this.Class15 == -1) {
                        this.Class94.xFirst = this.cx + 20;
                        this.Class94.yFirst = this.cy;
                        this.Class94.dir = this.Class15;
                        this.Class94.y = this.cy - 20;
                    }
                    else {
                        this.Class94.xFirst = this.cx - 20;
                        this.Class94.yFirst = this.cy;
                        this.Class94.dir = this.Class15;
                        this.Class94.y = this.cy - 20;
                    }
                    final int n5 = this.Class94.xFirst - this.Class94.x;
                    final int n6 = this.Class94.yFirst - this.Class94.y;
                    if (n5 > 50 || n5 < -50) {
                        final Mob class10 = this.Class94;
                        class10.x += n5 / 10;
                    }
                    else {
                        final Mob class11 = this.Class94;
                        class11.x += n5;
                    }
                    if (n6 > 50 || n6 < -50) {
                        final Mob class12 = this.Class94;
                        class12.y += n6 / 10;
                    }
                }
                this.Class94.Class1();
            }
        }
        this.Class195 = false;
        if (this.Class104 > 0 && GameCanvas.gameTick % 2 == 0) {
            --this.Class104;
            if (this.Class104 == 30 || this.Class104 == 60) {
                this.Class104 = 0;
            }
        }
        if (this.myskill != null && (this.myskill.template.id == 77 || this.myskill.template.id == 73)) {
            this.Class36();
        }
        this.Class36();
        if (this.Class94 != null) {
            this.Class94.Class1();
        }
        if (this.Class149 != null) {
            this.Class149.Class1();
        }
        if (this.Class80[4] != null && this.Class80[4].options != null) {
            for (int i = 0; i < this.Class80[4].options.size(); ++i) {
                final ItemOption itemOption;
                if ((itemOption = (ItemOption)this.Class80[4].options.elementAt(i)).optionTemplate.id == 66) {
                    this.Class139 = itemOption.param;
                }
            }
        }
        if (this.Class64 && this.Class139 < 500) {
            this.Class64 = false;
        }
        if (this.Class64) {
            if (this.Class80[4].template.id == 443 && this.Class80[4].Class8 >= 2) {
                if (this.Class237[1] == 1737) {
                    this.Class268 -= 5;
                }
                Game120 game120;
                Game120 game121;
                if (this.Class15 != 1) {
                    game120 = new Game120(this.Class267 - 4, this.Class268, 0);
                    game121 = new Game120(this.Class267 - 1, this.Class268, 0);
                }
                else {
                    game120 = new Game120(this.Class267 + 4, this.Class268, 0);
                    game121 = new Game120(this.Class267 + 1, this.Class268, 0);
                }
                if (this.statusMe != 1 || this.statusMe != 6) {
                    this.Class186.addElement(game120);
                    this.Class186.addElement(game121);
                }
            }
            for (int j = 0; j < this.Class186.size(); ++j) {
                final Game120 game122;
                (game122 = (Game120)this.Class186.elementAt(j)).Class1();
                if (game122.Class1 >= 6) {
                    this.Class186.removeElementAt(j);
                }
            }
        }
        else if (this.Class63) {
            if (this.Class80[4].template.id == 524 && this.Class80[4].Class8 >= 2) {
                Game120 game123;
                Game120 game124;
                if (this.Class15 != 1) {
                    game123 = new Game120(this.Class267, this.Class268, 1);
                    game124 = new Game120(this.Class269, this.Class270, 1);
                }
                else {
                    game123 = new Game120(this.Class267, this.Class268, 1);
                    game124 = new Game120(this.Class269, this.Class270, 1);
                }
                if ((this.statusMe == 2 || this.statusMe == 10) && GameCanvas.gameTick % 3 == 0) {
                    this.Class186.addElement(game123);
                    this.Class186.addElement(game124);
                }
            }
            for (int k = 0; k < this.Class186.size(); ++k) {
                final Game120 game125;
                (game125 = (Game120)this.Class186.elementAt(k)).Class1();
                if (game125.Class1 >= 6) {
                    this.Class186.removeElementAt(k);
                }
            }
        }
        else {
            for (int l = 0; l < this.Class186.size(); ++l) {
                final Game120 game126;
                (game126 = (Game120)this.Class186.elementAt(l)).Class1();
                if (game126.Class1 >= 6) {
                    this.Class186.removeElementAt(l);
                }
            }
        }
        if (this.Class61 && Char.Class109 && this.cHP < this.cMaxHP * Char.aHpValue / 100 && System.currentTimeMillis() - this.Class196 > 5000L && this.statusMe != 14 && this.statusMe != 5 && this.cHP > 0) {
            if (this.vEff.size() == 0) {
                for (int n7 = 0; n7 < this.arrItemBag.length; ++n7) {
                    final Item item;
                    if ((item = this.arrItemBag[n7]) != null && item.template.type == 16 && item.template.level == Char.aHpValue) {
                        GameScr.gI();
                        GameScr.Class24();
                        this.Class196 = System.currentTimeMillis();
                        break;
                    }
                }
            }
            else {
                for (int n8 = 0; n8 < this.vEff.size() && ((Effect)getMyChar().vEff.elementAt(n8)).template.type != 17; ++n8) {
                    if (n8 == this.vEff.size() - 1) {
                        GameScr.gI();
                        GameScr.Class24();
                        this.Class196 = System.currentTimeMillis();
                    }
                }
            }
        }
        if (this.Class61 && Char.Class111 && GameCanvas.gameTick % 10 == 0 && !GameScr.TuDong && this.statusMe != 14 && this.statusMe != 5 && this.cHP > 0) {
            if (this.vEff.size() == 0) {
                for (int n9 = 0; n9 < this.arrItemBag.length; ++n9) {
                    final Item item2;
                    if ((item2 = this.arrItemBag[n9]) != null && item2.template.type == 18 && item2.template.level == Char.Class121) {
                        Service.gI().useItem(n9);
                        break;
                    }
                }
            }
            else {
                for (int n10 = 0; n10 < this.vEff.size() && ((Effect)getMyChar().vEff.elementAt(n10)).template.type != 0; ++n10) {
                    if (n10 == this.vEff.size() - 1) {
                        for (int n11 = 0; n11 < this.arrItemBag.length; ++n11) {
                            final Item item3;
                            if ((item3 = this.arrItemBag[n11]) != null && item3.template.type == 18 && item3.template.level == Char.Class121) {
                                Service.gI().useItem(n11);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (this.Class61 && Char.isABuff && Code.T == null && !TileMap.IsDangGoMap && getMyChar().statusMe != 14 && getMyChar().statusMe != 5 && this.cHP > 0 && System.currentTimeMillis() - this.Class190 > 500L) {
            for (int n12 = 0; n12 < this.vSkill.size(); ++n12) {
                boolean b = false;
                final Skill skill;
                if (((skill = (Skill)this.vSkill.elementAt(n12)).template.id < 67 || skill.template.id > 72) && skill != null && skill.template.type == 2 && !skill.isCooldown()) {
                    for (int n13 = 0; n13 < this.vEff.size(); ++n13) {
                        final Effect effect;
                        if ((effect = (Effect)this.vEff.elementAt(n13)) != null && effect.template.iconId == skill.template.iconId) {
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        GameScr.gI().Class1(skill, true, false);
                        Service.gI().sendUseSkillMyBuff();
                        this.Class9();
                        this.Class190 = System.currentTimeMillis();
                        break;
                    }
                }
            }
        }
        if (this.Class61 && Char.Class110 && this.cMP < this.cMaxMP * Char.aMpValue / 100 && GameCanvas.gameTick % 4 == 0 && this.statusMe != 14 && this.statusMe != 5 && this.cHP > 0) {
            GameScr.gI();
            GameScr.Class23();
        }
        final Char class13;
        if (this.Class61 && Char.Class117 && this.nClass.classId == 6 && Char.Class122 > 0 && getMyChar().statusMe != 14 && getMyChar().statusMe != 5 && (class13 = GameScr.Class5(Char.Class122)) != null && (class13.cHP <= 0 || class13.statusMe == 14 || class13.statusMe == 5 || Char.Class118)) {
            int n14 = 0;
            while (n14 < this.vSkill.size()) {
                final Skill myskill;
                if ((myskill = (Skill)getMyChar().vSkill.elementAt(n14)) != null && myskill.template.type == 4) {
                    if (Res.abs(this.cx - class13.cx) < myskill.dx && Res.abs(this.cy - class13.cy) < myskill.dy) {
                        getMyChar().myskill = myskill;
                        GameScr.gI().Class7(Char.Class122);
                        Char.Class118 = false;
                        this.Class9();
                        break;
                    }
                    InfoMe.addInfo(Game86.Class472, 20, mFont.number_red);
                    break;
                }
                else {
                    ++n14;
                }
            }
        }
        if (this.cHP > 0) {
            for (int n15 = 0; n15 < this.vEff.size(); ++n15) {
                final Effect effect2;
                if ((effect2 = (Effect)this.vEff.elementAt(n15)).template.type == 0 || effect2.template.type == 12) {
                    if (GameCanvas.Class23) {
                        this.cHP += effect2.Class4;
                        this.cMP += effect2.Class4;
                    }
                }
                else if (effect2.template.type == 4 || effect2.template.type == 17) {
                    if (GameCanvas.Class23) {
                        this.cHP += effect2.Class4;
                    }
                }
                else if (effect2.template.type == 13) {
                    if (GameCanvas.Class23) {
                        this.cHP -= this.cMaxHP * 3 / 100;
                        if (this.cHP <= 0) {
                            this.cHP = 1;
                        }
                    }
                }
                else if (effect2.template.type == 7) {
                    this.Class195 = true;
                }
                else if (effect2.template.type == 1) {
                    this.cHP = this.cHP;
                }
            }
            if (this.Class195) {
                ++this.Class194;
            }
            else {
                this.Class194 = 0;
            }
            if (this.Class28 > 0 && GameCanvas.Class24) {
                this.cHP += this.Class28;
            }
            if (this.Class29 > 0 && GameCanvas.Class24) {
                this.cMP += this.Class29;
            }
            if (this.cHP > this.cMaxHP) {
                this.cHP = this.cMaxHP;
            }
            if (this.cMP > this.cMaxMP) {
                this.cMP = this.cMaxMP;
            }
        }
        if (this.Class181) {
            GameScr.Class18 = this.cx - GameScr.Class11 + GameScr.Class15 * this.Class15;
            GameScr.Class19 = this.cy - GameScr.Class12;
        }
        this.Class184 = (this.Class184 + 1) % 100;
        if (this.Class61) {
            if (this.charFocus != null && (this.charFocus.Class28() || !GameScr.vCharInMap.contains(this.charFocus))) {
                this.charFocus = null;
            }
            if (this.cx < 10) {
                this.Class11 = 0;
                this.cx = 10;
            }
            else if (this.cx > TileMap.pxw - 10) {
                this.cx = TileMap.pxw - 10;
                this.Class11 = 0;
            }
            if (!Char.Class133 && this.Class33()) {
                Char.Class198 = true;
                Service.gI().requestChangeMap();
                Char.Class134 = true;
                Char.Class133 = true;
                GameCanvas.Class8();
                GameCanvas.Class7();
                return;
            }
            if (this.Class137) {
                this.Class137 = (System.currentTimeMillis() - this.Class191 < 2000L);
            }
            if (this.Class135) {
                this.Class138 = null;
            }
            if (this.Class138 != null && (this.statusMe == 1 || this.statusMe == 2)) {
                this.statusMe = 2;
                if (this.cx - this.Class138.Class1 > 0) {
                    this.Class15 = -1;
                    if (this.cx - this.Class138.Class1 <= 10) {
                        this.Class138 = null;
                    }
                }
                else {
                    this.Class15 = 1;
                    if (this.cx - this.Class138.Class1 >= -10) {
                        this.Class138 = null;
                    }
                }
                if (this.Class138 != null) {
                    this.Class11 = this.Class2() * this.Class15;
                    this.Class12 = 0;
                }
            }
            this.Class61();
            if (this.statusMe == 1 || this.statusMe == 6) {
                if (System.currentTimeMillis() - this.Class204 > 500L && this.Class205) {
                    Char.Class198 = true;
                    this.Class205 = false;
                    this.Class204 = System.currentTimeMillis();
                }
            }
            else {
                this.Class204 = System.currentTimeMillis();
                this.Class205 = true;
            }
        }
        else {
            if (GameCanvas.gameTick % 20 == 0 && this.charID >= 0) {
                this.Class187 = true;
                for (int n16 = 0; n16 < GameScr.vCharInMap.size(); ++n16) {
                    Char char1 = null;
                    try {
                        char1 = (Char)GameScr.vCharInMap.elementAt(n16);
                    }
                    catch (Exception ex) {}
                    if (char1 != null && !char1.equals(this) && ((char1.cy == this.cy && Res.abs(char1.cx - this.cx) < 35) || (this.cy - char1.cy < 32 && this.cy - char1.cy > 0 && Res.abs(char1.cx - this.cx) < 24))) {
                        this.Class187 = false;
                    }
                }
            }
            if (this.statusMe == 1 || this.statusMe == 6) {
                boolean b2 = false;
                if (this.Class138 != null) {
                    if (Class13(this.Class138.Class1 - this.cx) < 4 && Class13(this.Class138.Class2 - this.cy) < 4) {
                        this.cx = this.Class138.Class1;
                        this.cy = this.Class138.Class2;
                        this.Class138 = null;
                        if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 0x2) == 0x2) {
                            this.Class63();
                            GameCanvas.Class1().Class1(-1, this.cx + 8, this.cy);
                            GameCanvas.Class1().Class1(1, this.cx - 8, this.cy);
                        }
                        else {
                            this.statusMe = 4;
                            this.Class12 = 0;
                        }
                        b2 = true;
                    }
                    else if (this.cy == this.Class138.Class2) {
                        if (this.cx != this.Class138.Class1) {
                            this.cx = (this.cx + this.Class138.Class1) / 2;
                            this.Class62 = GameCanvas.gameTick % 5 + 2;
                        }
                    }
                    else if (this.cy < this.Class138.Class2) {
                        this.Class62 = 12;
                        this.cx = (this.cx + this.Class138.Class1) / 2;
                        if (this.Class12 < 0) {
                            this.Class12 = 0;
                        }
                        this.cy += this.Class12;
                        if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 0x2) == 0x2) {
                            GameCanvas.Class1().Class1(-1, this.cx + 8, this.cy);
                            GameCanvas.Class1().Class1(1, this.cx - 8, this.cy);
                        }
                        ++this.Class12;
                        if (this.Class12 > 16) {
                            this.cy = (this.cy + this.Class138.Class2) / 2;
                        }
                    }
                    else {
                        this.Class62 = 7;
                        this.cx = (this.cx + this.Class138.Class1) / 2;
                        this.cy = (this.cy + this.Class138.Class2) / 2;
                    }
                }
                else {
                    b2 = true;
                }
                if (b2 && this.Class132.size() > 0) {
                    if (this.Class132.size() > 5) {
                        this.Class138 = this.Class132.lastElement();
                        this.Class132.removeElementAt(0);
                        this.cx = this.Class138.Class1;
                        this.cy = this.Class138.Class2;
                        this.Class132.removeAllElements();
                        this.statusMe = 6;
                        this.Class138 = null;
                        return;
                    }
                    this.Class138 = this.Class132.firstElement();
                    this.Class132.removeElementAt(0);
                    if (this.Class138.Class3 == 2) {
                        this.statusMe = 2;
                        if (this.cx - this.Class138.Class1 > 0) {
                            this.Class15 = -1;
                        }
                        else if (this.cx - this.Class138.Class1 < 0) {
                            this.Class15 = 1;
                        }
                        this.Class11 = 5 * this.Class15;
                        this.Class12 = 0;
                    }
                    else if (this.Class138.Class3 == 3) {
                        this.statusMe = 3;
                        GameCanvas.Class1().Class1(-1, this.cx + 8, this.cy);
                        GameCanvas.Class1().Class1(1, this.cx - 8, this.cy);
                        if (this.cx - this.Class138.Class1 > 0) {
                            this.Class15 = -1;
                        }
                        else if (this.cx - this.Class138.Class1 < 0) {
                            this.Class15 = 1;
                        }
                        this.Class11 = Class13(this.cx - this.Class138.Class1) / 9 * this.Class15;
                        this.Class12 = -10;
                    }
                    else if (this.Class138.Class3 == 4) {
                        this.statusMe = 4;
                        if (this.cx - this.Class138.Class1 > 0) {
                            this.Class15 = -1;
                        }
                        else if (this.cx - this.Class138.Class1 < 0) {
                            this.Class15 = 1;
                        }
                        this.Class11 = Class13(this.cx - this.Class138.Class1) / 9 * this.Class15;
                        this.Class12 = 0;
                    }
                    else {
                        this.cx = this.Class138.Class1;
                        this.cy = this.Class138.Class2;
                        this.Class138 = null;
                    }
                }
                if (this.statusMe == 6) {
                    if (this.Class62 >= 8 && this.Class62 <= 11) {
                        ++this.Class62;
                        ++this.Class13;
                        if (this.Class62 > 11) {
                            this.Class62 = 8;
                        }
                        if (this.Class13 > 5) {
                            this.Class62 = 0;
                        }
                    }
                    if (this.Class62 <= 1) {
                        ++this.Class13;
                        if (this.Class13 > 6) {
                            this.Class62 = 0;
                        }
                        else {
                            this.Class62 = 1;
                        }
                        if (this.Class13 > 10) {
                            this.Class13 = 0;
                        }
                    }
                }
                this.Class173 = this.cx;
                this.Class174 = this.cy;
                if (System.currentTimeMillis() - this.Class126 > 7000L) {
                    if (!this.Class64 && this.Class15() && this.Class139 >= 500) {
                        this.Class64 = true;
                        Game16.Class1(60, this, 1);
                    }
                    if (this.Class63 && this.Class16()) {
                        this.Class63 = false;
                        this.Class65 = true;
                    }
                }
            }
        }
        if (this.Class226 > 0) {
            this.Class62 = 21;
            --this.Class226;
        }
        else {
            switch (this.statusMe) {
                case 1: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    if (this.Class64) {
                        if (this.Class15 == 1) {
                            this.Class267 = this.cx + 21 + 4;
                            this.Class268 = this.cy - 15;
                        }
                        else {
                            this.Class267 = this.cx - 24 - 4;
                            this.Class268 = this.cy - 15;
                        }
                    }
                    for (int n17 = 0; n17 < this.Class186.size(); ++n17) {
                        final Game120 game127;
                        (game127 = (Game120)this.Class186.elementAt(n17)).Class1();
                        if (game127.Class1 >= 6) {
                            this.Class186.removeElementAt(n17);
                        }
                    }
                    this.Class11 = 0;
                    this.Class12 = 0;
                    ++this.Class13;
                    this.Class173 = this.cx;
                    this.Class174 = this.cy;
                    if (this.Class13 > 30) {
                        this.Class13 = 0;
                    }
                    if (this.Class13 % 15 < 5) {
                        this.Class62 = 0;
                    }
                    else {
                        this.Class62 = 1;
                    }
                    this.Class62();
                    if (System.currentTimeMillis() - this.Class126 > 7000L) {
                        if (!this.Class64 && this.Class15() && this.Class139 >= 500) {
                            this.Class64 = true;
                            Game16.Class1(60, this, 1);
                        }
                        if (this.Class63 && this.Class16()) {
                            this.Class63 = false;
                            this.Class65 = true;
                        }
                    }
                    break;
                }
                case 2: {
                    if (this.Class63) {
                        ++this.Class172;
                        if (this.Class80[4].template.id == 485 && this.Class80[4].Class8 >= 4) {
                            this.Class185 = true;
                        }
                        if (this.Class172 > 20) {
                            this.Class185 = false;
                        }
                    }
                    if (this.Class64) {
                        if (this.Class15 == 1) {
                            if (this.Class237[this.Class233] == 1737) {
                                this.Class267 = this.cx + 21 + 4;
                                this.Class268 = this.cy - 19;
                            }
                            else {
                                this.Class267 = this.cx + 21 + 4;
                                this.Class268 = this.cy - 16;
                            }
                        }
                        else if (this.Class237[this.Class233] == 1737) {
                            this.Class267 = this.cx - 24 - 4;
                            this.Class268 = this.cy - 19;
                        }
                        else {
                            this.Class267 = this.cx - 24 - 4;
                            this.Class268 = this.cy - 16;
                        }
                    }
                    else if (this.Class63) {
                        if (this.Class15 == 1) {
                            this.Class267 = this.cx + 15;
                            this.Class269 = this.cx - 25;
                            this.Class268 = this.cy;
                            this.Class270 = this.cy;
                        }
                        else {
                            this.Class267 = this.cx - 18;
                            this.Class269 = this.cx + 25;
                            this.Class268 = this.cy;
                            this.Class270 = this.cy;
                        }
                    }
                    int class14 = 0;
                    if (!this.Class61 && this.Class138 != null) {
                        class14 = Class13(this.cx - this.Class138.Class1);
                    }
                    ++this.Class13;
                    if (this.Class13 >= 10) {
                        this.Class13 = 0;
                    }
                    this.Class62 = (this.Class13 >> 1) + 2;
                    if ((TileMap.tileTypeAtPixel(this.cx, this.cy - 1) & 0x40) == 0x40) {
                        this.cx += this.Class11 >> 1;
                    }
                    else {
                        this.cx += this.Class11;
                    }
                    if (this.Class15 == 1) {
                        if (GameScr.Class154 != 1) {
                            if (TileMap.tileTypeAt(this.cx + this.Class179, this.cy - this.Class180, 4)) {
                                if (this.Class61) {
                                    this.Class11 = 0;
                                    this.cx = TileMap.Class3(this.cx + this.Class179) - this.Class179;
                                }
                                else {
                                    this.Class38();
                                }
                            }
                        }
                        else if (TileMap.tileTypeAt(this.cx + this.Class179, this.cy - this.Class180, 4)) {
                            if (this.Class61) {
                                this.statusMe = 3;
                                if (this.statusMe == 3) {
                                    this.Class12 -= 10;
                                }
                            }
                            else {
                                this.Class38();
                            }
                        }
                    }
                    else if (GameScr.Class154 != 1) {
                        if (TileMap.tileTypeAt(this.cx - this.Class179 - 1, this.cy - this.Class180, 8)) {
                            if (this.Class61) {
                                this.Class11 = 0;
                                this.cx = TileMap.Class3(this.cx - this.Class179 - 1) + TileMap.Class9 + this.Class179;
                            }
                            else {
                                this.Class38();
                            }
                        }
                    }
                    else if (TileMap.tileTypeAt(this.cx - this.Class179 - 1, this.cy - this.Class180, 8)) {
                        if (this.Class61) {
                            this.statusMe = 3;
                            if (this.statusMe == 3) {
                                this.Class12 -= 10;
                            }
                        }
                        else {
                            this.Class38();
                        }
                    }
                    if (!this.Class66 && this.Class30()) {
                        this.Class66 = true;
                        this.Class65 = false;
                    }
                    if (!this.Class63 && this.Class16()) {
                        this.Class63 = true;
                        this.Class65 = false;
                    }
                    if (!this.Class64 && this.Class15() && this.Class139 >= 500) {
                        this.Class215 = Res.abs(this.cx - this.Class173);
                        this.Class218 = Res.abs(this.cy - this.Class174);
                        this.Class215 = ((this.Class215 > this.Class218) ? this.Class215 : this.Class218);
                        if ((this.Class61 && this.Class215 > 150) || (!this.Class61 && this.Class215 > 40)) {
                            this.Class64 = true;
                            Game16.Class1(60, this, 1);
                        }
                        final int n18 = 0;
                        this.Class218 = n18;
                        this.Class215 = n18;
                    }
                    if (this.Class61) {
                        if (this.Class11 > 0) {
                            --this.Class11;
                        }
                        else if (this.Class11 < 0) {
                            ++this.Class11;
                        }
                        else {
                            this.Class63();
                        }
                    }
                    if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 0x2) != 0x2) {
                        if (this.Class61) {
                            if ((this.cx - this.cxSend != 0 || this.cy - this.cySend != 0) && this.Class61) {
                                this.Class62 = 7;
                                this.statusMe = 4;
                                this.Class11 = 3 * this.Class15;
                                this.Class175 = 0;
                            }
                        }
                        else {
                            this.Class38();
                        }
                    }
                    if (!this.Class61 && this.Class138 != null && Class13(this.cx - this.Class138.Class1) > class14) {
                        this.Class38();
                    }
                    if (this.Class63 || this.Class66) {
                        if (GameCanvas.gameTick % 5 == 0) {
                            Game16.Class1(120, this.cx - (this.Class15 << 5), this.cy, 0, (byte)this.Class15);
                        }
                    }
                    else {
                        GameCanvas.Class1().Class1(this.Class15, this.cx - (this.Class15 << 3), this.cy);
                    }
                    this.Class62();
                    final int n19 = this.cx - (this.Class15 << 4);
                    final int cy = this.cy;
                    final int n20 = n19;
                    if (this.Class64 && this.Class80[4].Class8 >= 4 && this.Class1() > 0 && GameCanvas.gameTick % 8 == 0) {
                        if (this.Class1() == 1) {
                            Game16.Class1(116, n20, cy, 2);
                        }
                        else if (this.Class1() == 2) {
                            Game16.Class1(117, n20, cy, 2);
                        }
                        else if (this.Class1() == 3) {
                            Game16.Class1(118, n20, cy, 2);
                        }
                    }
                    break;
                }
                case 3: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    if (this.Class64) {
                        if (this.Class15 == 1) {
                            this.Class267 = this.cx + 21 + 4;
                            this.Class268 = this.cy - 30;
                        }
                        else {
                            this.Class267 = this.cx - 23 - 4;
                            this.Class268 = this.cy - 30;
                        }
                    }
                    this.Class39();
                    break;
                }
                case 4: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    if (this.Class64) {
                        if (this.Class15 == 1) {
                            this.Class267 = this.cx + 21 + 4;
                            this.Class268 = this.cy - 19;
                        }
                        else {
                            this.Class267 = this.cx - 24;
                            this.Class268 = this.cy - 20;
                        }
                    }
                    this.Class40();
                    break;
                }
                case 5: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    ++this.Class13;
                    this.cx += (this.Class175 - this.cx) / 4;
                    if (this.Class13 > 7) {
                        this.cy += (this.Class176 - this.cy) / 4;
                    }
                    else {
                        this.cy += this.Class13 - 10;
                    }
                    if (Res.abs(this.Class175 - this.cx) < 4 && Res.abs(this.Class176 - this.cy) < 10) {
                        this.cx = this.Class175;
                        this.cy = this.Class176;
                        this.statusMe = 14;
                        this.Class14(60);
                        if (this.Class61) {
                            GameScr.gI().Class22();
                        }
                    }
                    this.Class62 = 21;
                    break;
                }
                case 9: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    this.cx += this.Class11 * this.Class15;
                    this.cy += this.Class193;
                    ++this.Class193;
                    if (this.Class13 == 0) {
                        this.Class62 = 7;
                    }
                    else {
                        this.Class62 = 23;
                    }
                    if (this.Class60) {
                        if (this.Class193 == -3) {
                            this.Class62 = 8;
                        }
                        else if (this.Class193 == -2) {
                            this.Class62 = 9;
                        }
                        else if (this.Class193 == -1) {
                            this.Class62 = 10;
                        }
                        else if (this.Class193 == 0) {
                            this.Class62 = 11;
                        }
                    }
                    if (this.Class193 == 0) {
                        this.statusMe = 6;
                        this.Class132.firstElement().Class3 = 4;
                        this.Class13 = 0;
                        this.Class12 = 1;
                    }
                    break;
                }
                case 10: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    this.Class41();
                    break;
                }
                case 11: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    this.cy += this.Class12;
                    if (this.Class12 < 20 && GameCanvas.gameTick % 2 == 0) {
                        ++this.Class12;
                    }
                    this.Class62 = 7;
                    if (this.cy >= TileMap.pxh) {
                        this.cHP = 0;
                        this.statusMe = 5;
                        break;
                    }
                    if (TileMap.tileTypeAt(this.cx, this.cy, 2)) {
                        this.Class63();
                        final int n21 = 0;
                        this.Class12 = n21;
                        this.Class11 = n21;
                        final int n22 = 0;
                        this.Class175 = n22;
                        this.Class13 = n22;
                        this.cy = TileMap.Class3(this.cy);
                        break;
                    }
                    if (TileMap.tileTypeAt(this.cx, this.cy, 2048)) {
                        this.cHP = 0;
                        this.statusMe = 5;
                    }
                    break;
                }
                case 12: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    this.Class37();
                    break;
                }
                case 13: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    break;
                }
                case 14: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    break;
                }
                case 6: {
                    this.Class185 = false;
                    this.Class172 = 0;
                    if (this.Class62 == 21 && this.Class226 <= 0) {
                        this.Class62 = 0;
                        break;
                    }
                    break;
                }
            }
        }
        if (this.Class166 != 0 || this.Class167 != 0) {
            final short class15 = this.Class166;
            final short class16 = this.Class167;
            final short class17 = class15;
            if (this.Class61) {
                Char.Class134 = true;
                for (int n23 = 0; n23 < GameScr.vCharInMap.size(); ++n23) {
                    ((Char)GameScr.vCharInMap.elementAt(n23)).killCharId = -9999;
                }
            }
            this.statusMe = 5;
            this.Class175 = class17;
            this.Class176 = class16;
            this.Class13 = 0;
            this.cHP = 0;
            this.testCharId = -9999;
            this.killCharId = -9999;
            this.Class166 = 0;
            this.Class167 = 0;
        }
        if (this.Class101 != null) {
            if (this.Class101[0] == 0) {
                final short[] class18 = this.Class101;
                final int n24 = 0;
                ++class18[n24];
                Game16.Class1(60, this, 1);
            }
            else if (this.Class101[0] < 10) {
                final short[] class19 = this.Class101;
                final int n25 = 0;
                ++class19[n25];
            }
            else {
                this.cx = this.Class101[1];
                this.cy = this.Class101[2];
                this.Class101 = null;
                Game16.Class1(60, this, 1);
                if (this.Class61) {
                    if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 0x2) != 0x2) {
                        this.statusMe = 4;
                        getMyChar().setAutoSkillPaint(GameScr.sks[38], 1);
                    }
                    else {
                        getMyChar().setAutoSkillPaint(GameScr.sks[38], 0);
                    }
                }
            }
        }
        if (!this.Class61 && this.Class132.size() == 0 && this.Class130 != 0 && this.Class131 != 0 && this.Class138 == null) {
            if (this.Class130 != this.cx) {
                this.cx = this.Class130;
            }
            if (this.Class131 != this.cy) {
                this.cy = this.Class131;
            }
            if (this.cHP > 0) {
                this.statusMe = 6;
            }
        }
        this.Class65();
        this.Class35();
        this.Class1((byte)0, this.statusMe);
        if (this.ID_HORSE > 0) {
            this.Class66 = false;
            this.Class63 = false;
            this.Class64 = false;
        }
        this.Class66();
        this.Class34();
    }
    
    private void Class35() {
        if (!this.Class61) {
            if (this.Class62 == 12 && this.Class199 == this.cx && this.Class200 == this.cy) {
                ++this.Class203;
            }
            else if (this.Class62 == 0 && (TileMap.tileTypeAtPixel(this.cx, this.cy) & 0x2) != 0x2) {
                ++this.Class203;
            }
            else {
                this.Class203 = 0;
            }
            if (this.Class203 > 1) {
                for (int i = this.cy; i < this.cy + 150; i += 24) {
                    if ((TileMap.tileTypeAtPixel(this.cx, i) & 0x2) != 0x2) {
                        final int cy;
                        if ((cy = TileMap.tileYofPixel(i) + 24) - this.cy > 24) {
                            this.cy += (cy - this.cy) / 2;
                            if (!this.Class63 && !this.Class64 && !this.Class66) {
                                this.Class62 = 12;
                            }
                            this.Class132.removeAllElements();
                            this.Class138 = null;
                        }
                        else {
                            this.statusMe = 1;
                            this.Class132.removeAllElements();
                            this.Class138 = null;
                            this.Class11 = 0;
                            this.Class12 = 0;
                            this.Class13 = 0;
                            this.Class175 = 0;
                            this.Class176 = 0;
                            this.Class203 = 0;
                            this.Class130 = 0;
                            this.Class131 = 0;
                            this.cy = cy;
                        }
                        this.Class174 = this.cy;
                        return;
                    }
                }
            }
        }
    }
    
    private void Class36() {
        if (this.statusMe == 14 || this.statusMe == 5) {
            return;
        }
        if (this.Class150 != null && this.mobFocus != null && this.mobFocus.status == 0) {
            if (!this.Class61) {
                if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 0x2) == 0x2) {
                    this.Class63();
                }
                else {
                    this.statusMe = 6;
                }
            }
            this.Class211 = 0;
            this.Class150 = null;
            final Game106 class221 = null;
            this.Class223 = class221;
            this.Class222 = class221;
            this.Class221 = class221;
            final int class222 = 0;
            this.Class214 = class222;
            this.Class213 = class222;
            this.Class212 = class222;
            this.mobFocus = null;
            this.effPaints = null;
            this.Class149 = null;
        }
        if (this.Class150 != null && this.Class149 == null && this.Class211 >= this.Class42().length) {
            if (!this.Class61) {
                if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 0x2) == 0x2) {
                    this.Class63();
                }
                else {
                    this.statusMe = 6;
                }
            }
            this.Class211 = 0;
            this.Class150 = null;
            final Game106 class223 = null;
            this.Class223 = class223;
            this.Class222 = class223;
            this.Class221 = class223;
            final int class224 = 0;
            this.Class214 = class224;
            this.Class213 = class224;
            this.Class212 = class224;
            this.Class149 = null;
        }
        final Game18[] class225;
        if ((class225 = this.Class42()) != null) {
            if (this.Class61 && this.myskill.template.type == 2) {
                if (this.Class211 == class225.length - class225.length / 3) {
                    Service.gI().sendUseSkillMyBuff();
                    this.Class9();
                }
            }
            else if ((this.mobFocus != null || (!this.Class61 && this.charFocus != null) || (this.Class61 && this.charFocus != null && Class2(this.charFocus))) && this.Class149 == null && this.Class211 == class225.length - class225.length / 3) {
                this.Class14();
                if (this.Class61) {
                    this.Class9();
                }
            }
        }
    }
    
    public final void Class9() {
        if (System.currentTimeMillis() - this.Class206 > 500L) {
            if (this.myskill.template.type != 1 && this.Class169 != null) {
                this.myskill = this.Class169;
                Service.gI().selectSkill(this.myskill.template.id);
            }
            if (this.Class170) {
                if (this.Class169 != null) {
                    this.myskill = this.Class169;
                    Service.gI().selectSkill(this.myskill.template.id);
                }
            }
            else if (GameScr.Class154 != 1) {
                this.Class169 = this.myskill;
            }
            this.Class206 = System.currentTimeMillis();
        }
    }
    
    private void Class37() {
        ++this.Class13;
        if (this.Class15 == 1) {
            if ((TileMap.tileTypeAtPixel(this.cx + this.Class179, this.cy - this.Class180) & 0x4) == 0x4) {
                this.Class11 = 0;
            }
        }
        else if ((TileMap.tileTypeAtPixel(this.cx - this.Class179, this.cy - this.Class180) & 0x8) == 0x8) {
            this.Class11 = 0;
        }
        if (this.cy > this.Class59 && TileMap.tileTypeAt(this.cx, this.cy - this.Class59, 8192)) {
            if (!TileMap.tileTypeAt(this.cx, this.cy, 2)) {
                this.statusMe = 4;
                this.Class13 = 0;
                this.Class175 = 0;
                this.Class12 = 1;
            }
            else {
                this.cy = TileMap.tileYofPixel(this.cy);
            }
        }
        this.cx += this.Class11;
        this.cy += this.Class12;
        if (this.cy < 0) {
            final int n = 0;
            this.Class12 = n;
            this.cy = n;
        }
        if (this.Class12 == 0) {
            if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 0x2) != 0x2) {
                this.statusMe = 4;
                this.Class11 = (this.Class2() >> 1) * this.Class15;
                final int n2 = 0;
                this.Class175 = n2;
                this.Class13 = n2;
            }
        }
        else if (this.Class12 < 0) {
            ++this.Class12;
            if (this.Class12 == 0) {
                this.Class12 = 1;
            }
        }
        else {
            if (this.Class12 < 20 && this.Class13 % 5 == 0) {
                ++this.Class12;
            }
            if (this.Class12 > 3) {
                this.Class12 = 3;
            }
            if ((TileMap.tileTypeAtPixel(this.cx, this.cy + 3) & 0x2) == 0x2 && this.cy <= TileMap.Class3(this.cy + 3)) {
                final int n3 = 0;
                this.Class12 = n3;
                this.Class11 = n3;
                this.cy = TileMap.Class3(this.cy + 3);
            }
            if (TileMap.tileTypeAt(this.cx, this.cy, 64) && this.cy % TileMap.Class9 > 8) {
                this.statusMe = 10;
                this.Class11 = this.Class15 << 1;
                this.Class12 >>= 2;
                this.cy = TileMap.tileYofPixel(this.cy) + 12;
                this.statusMe = 11;
                return;
            }
            if (TileMap.tileTypeAt(this.cx, this.cy, 2048)) {
                this.statusMe = 11;
                return;
            }
        }
        if (this.Class11 > 0) {
            --this.Class11;
            return;
        }
        if (this.Class11 < 0) {
            ++this.Class11;
        }
    }
    
    private void Class38() {
        this.statusMe = 6;
        this.Class11 = 0;
        this.Class12 = 0;
        final int n = 0;
        this.Class175 = n;
        this.Class13 = n;
    }
    
    private static int Class13(final int n) {
        if (n > 0) {
            return n;
        }
        return -n;
    }
    
    private void Class39() {
        if (GameScr.Class154 == 1) {
            if (this.Class15 == 1) {
                this.Class11 = 5;
            }
            else {
                this.Class11 = -5;
            }
        }
        if (this.Class30()) {
            this.Class66 = true;
            this.Class65 = false;
        }
        if (this.Class16()) {
            this.Class63 = true;
            this.Class65 = false;
        }
        this.cx += this.Class11;
        this.cy += this.Class12;
        if (this.cy < 0) {
            this.cy = 0;
            this.Class12 = -1;
        }
        ++this.Class12;
        Label_0199: {
            if (!this.Class61 && this.Class138 != null) {
                final int class11;
                if ((class11 = this.Class138.Class1 - this.cx) > 0) {
                    if (this.Class11 > class11) {
                        this.Class11 = class11;
                    }
                    if (this.Class11 >= 0) {
                        break Label_0199;
                    }
                }
                else if (class11 < 0) {
                    if (this.Class11 < class11) {
                        this.Class11 = class11;
                    }
                    if (this.Class11 <= 0) {
                        break Label_0199;
                    }
                }
                this.Class11 = class11;
            }
        }
        if (this.Class13 == 0) {
            this.Class62 = 7;
        }
        else {
            this.Class62 = 23;
        }
        if (this.Class60) {
            if (this.Class12 == -3) {
                this.Class62 = 8;
            }
            else if (this.Class12 == -2) {
                this.Class62 = 9;
            }
            else if (this.Class12 == -1) {
                this.Class62 = 10;
            }
            else if (this.Class12 == 0) {
                this.Class62 = 11;
            }
        }
        if (this.Class15 == 1) {
            if ((TileMap.tileTypeAtPixel(this.cx + this.Class179, this.cy - 1) & 0x4) == 0x4 && this.cx <= TileMap.Class3(this.cx + this.Class179) + 12) {
                this.cx = TileMap.Class3(this.cx + this.Class179) - this.Class179;
                this.Class11 = 0;
            }
        }
        else if ((TileMap.tileTypeAtPixel(this.cx - this.Class179, this.cy - 1) & 0x8) == 0x8 && this.cx >= TileMap.Class3(this.cx - this.Class179) + 12) {
            this.cx = TileMap.Class3(this.cx + 24 - this.Class179) + this.Class179;
            this.Class11 = 0;
        }
        if (this.Class12 == 0) {
            if (this.Class61) {
                this.Class178 = this.cy;
                this.statusMe = 4;
                this.Class13 = 0;
                if (this.Class60) {
                    this.Class175 = 1;
                }
                else {
                    this.Class175 = 0;
                }
                this.Class12 = 1;
            }
            else {
                this.Class38();
            }
        }
        if (this.Class61 && !Char.Class133 && this.Class33()) {
            Char.Class133 = true;
            Char.Class198 = true;
            Service.gI().requestChangeMap();
            Char.Class134 = true;
            GameCanvas.Class8();
            GameCanvas.Class7();
            return;
        }
        if (this.Class176 < 0) {
            ++this.Class176;
        }
        if (this.cy > this.Class59 && TileMap.tileTypeAt(this.cx, this.cy - this.Class59, 8192)) {
            if (this.Class61) {
                this.statusMe = 4;
                this.Class13 = 0;
                this.Class175 = 0;
                this.Class12 = 1;
            }
            else {
                this.Class38();
            }
        }
        if (!this.Class61 && this.Class138 != null && this.cy < this.Class138.Class2) {
            this.Class38();
        }
    }
    
    private void Class40() {
        if (this.cy + 4 >= TileMap.pxh) {
            this.Class63();
            final int n = 0;
            this.Class12 = n;
            this.Class11 = n;
            return;
        }
        if (this.cy % 24 == 0 && (TileMap.tileTypeAtPixel(this.cx, this.cy) & 0x2) == 0x2) {
            if (this.Class61) {
                final int n2 = 0;
                this.Class12 = n2;
                this.Class11 = n2;
                final int n3 = 0;
                this.Class175 = n3;
                this.Class13 = n3;
                this.Class63();
                return;
            }
            this.Class38();
            this.Class62 = 0;
            GameCanvas.Class1().Class1(-1, this.cx + 8, this.cy);
            GameCanvas.Class1().Class1(1, this.cx - 8, this.cy);
        }
        this.Class62 = 12;
        this.cx += this.Class11;
        Label_0235: {
            if (!this.Class61 && this.Class138 != null) {
                final int class11;
                if ((class11 = this.Class138.Class1 - this.cx) > 0) {
                    if (this.Class11 > class11) {
                        this.Class11 = class11;
                    }
                    if (this.Class11 >= 0) {
                        break Label_0235;
                    }
                }
                else if (class11 < 0) {
                    if (this.Class11 < class11) {
                        this.Class11 = class11;
                    }
                    if (this.Class11 <= 0) {
                        break Label_0235;
                    }
                }
                this.Class11 = class11;
            }
        }
        this.cy += this.Class12;
        if (this.Class12 < 20) {
            ++this.Class12;
        }
        if (this.Class15 == 1) {
            if ((TileMap.tileTypeAtPixel(this.cx + this.Class179, this.cy - 1) & 0x4) == 0x4 && this.cx <= TileMap.Class3(this.cx + this.Class179) + 12) {
                this.cx = TileMap.Class3(this.cx + this.Class179) - this.Class179;
                this.Class11 = 0;
            }
        }
        else if ((TileMap.tileTypeAtPixel(this.cx - this.Class179, this.cy - 1) & 0x8) == 0x8 && this.cx >= TileMap.Class3(this.cx - this.Class179) + 12) {
            this.cx = TileMap.Class3(this.cx + 24 - this.Class179) + this.Class179;
            this.Class11 = 0;
        }
        if (this.Class12 <= 4 || (this.Class178 != 0 && this.Class178 > TileMap.tileYofPixel(this.cy + 3)) || (TileMap.tileTypeAtPixel(this.cx, this.cy + 3) & 0x2) != 0x2) {
            if (this.Class175 == 1) {
                if (this.Class12 == 3) {
                    this.Class62 = 11;
                }
                else if (this.Class12 == 2) {
                    this.Class62 = 8;
                }
                else if (this.Class12 == 1) {
                    this.Class62 = 9;
                }
                else if (this.Class12 == 0) {
                    this.Class62 = 10;
                }
            }
            else {
                this.Class62 = 12;
            }
            if (this.Class12 > 6 && TileMap.tileTypeAt(this.cx, this.cy, 64) && this.cy % TileMap.Class9 > 8) {
                this.cy = TileMap.tileYofPixel(this.cy) + 8;
                this.statusMe = 10;
                this.Class11 = this.Class15 << 1;
                this.Class12 >>= 2;
                this.cy = TileMap.tileYofPixel(this.cy) + 12;
            }
            if (!this.Class61) {
                if ((TileMap.tileTypeAtPixel(this.cx, this.cy + 1) & 0x2) == 0x2) {
                    this.Class62 = 0;
                }
                if (this.Class138 != null && this.cy > this.Class138.Class2) {
                    this.Class38();
                }
            }
            return;
        }
        if (this.Class61) {
            this.Class178 = 0;
            final int n4 = 0;
            this.Class12 = n4;
            this.Class11 = n4;
            final int n5 = 0;
            this.Class175 = n5;
            this.Class13 = n5;
            this.cy = TileMap.Class3(this.cy + 3);
            this.Class63();
            GameCanvas.Class1().Class1(-1, this.cx + 8, this.cy);
            GameCanvas.Class1().Class1(1, this.cx - 8, this.cy);
            return;
        }
        this.Class38();
        this.cy = TileMap.Class3(this.cy + 3);
        this.Class62 = 0;
        GameCanvas.Class1().Class1(-1, this.cx + 8, this.cy);
        GameCanvas.Class1().Class1(1, this.cx - 8, this.cy);
    }
    
    private void Class41() {
        if (!TileMap.tileTypeAt(this.cx, this.cy, 64)) {
            this.statusMe = 4;
        }
        ++this.Class13;
        if (this.Class13 >= 5) {
            this.Class13 = 0;
        }
        this.Class62 = this.Class13 + 2;
        if (this.Class15 == 1) {
            if (TileMap.tileTypeAt(this.cx + this.Class179, this.cy - 1, 4)) {
                this.Class11 = 0;
                this.cx = TileMap.Class3(this.cx + this.Class179) - this.Class179;
            }
        }
        else if (TileMap.tileTypeAt(this.cx - this.Class179 - 1, this.cy - 1, 8)) {
            this.Class11 = 0;
            this.cx = TileMap.Class3(this.cx - this.Class179 - 1) + TileMap.Class9 + this.Class179;
        }
        this.cx += this.Class11;
        if (this.Class11 > 0) {
            --this.Class11;
        }
        else if (this.Class11 < 0) {
            ++this.Class11;
        }
        else if (this.cx - this.cxSend != 0) {
            if (this.Class61 && System.currentTimeMillis() - (this.Class207 + Char.Class208) >= 0L) {
                Char.Class198 = true;
            }
            this.statusMe = 11;
        }
        GameCanvas.Class1();
        GameCanvas.Class4(this.cx, this.cy);
        GameCanvas.Class1().Class1(this.Class15, this.cx - (this.Class15 << 3), this.cy);
    }
    
    public final void Class10() {
        this.Class144 = 15;
        this.Class12();
        this.Class13();
    }
    
    public final void Class11() {
        this.Class144 = 15;
    }
    
    public static Game99 Class2(final int n) {
        try {
            if (n == 0) {
                return GameScr.Class28[27];
            }
            return GameScr.Class28[2];
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public final void Class12() {
        if (this.cgender == 0) {
            this.body = 10;
            return;
        }
        this.body = 1;
    }
    
    public final void Class13() {
        if (this.cgender == 0) {
            this.leg = 9;
            return;
        }
        this.leg = 0;
    }
    
    public final void Class1(final SkillPaint skillPaint, final int n) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.Class61) {
            if (currentTimeMillis - this.myskill.lastTimeUseThisSkill < this.myskill.coolDown) {
                this.myskill.paintCanNotUseSkill = true;
                return;
            }
            this.myskill.lastTimeUseThisSkill = currentTimeMillis;
            this.cMP -= this.myskill.Class10;
            if (this.cMP < 0) {
                this.cMP = 0;
            }
        }
        this.setAutoSkillPaint(skillPaint, n);
    }
    
    public void setAutoSkillPaint(final SkillPaint class150, final int class151) {
        this.Class150 = class150;
        this.Class225 = class151;
        this.Class211 = 0;
        final int class152 = 0;
        this.Class220 = class152;
        this.Class219 = class152;
        this.Class218 = class152;
        this.Class217 = class152;
        this.Class216 = class152;
        this.Class215 = class152;
        this.Class214 = class152;
        this.Class213 = class152;
        this.Class212 = class152;
        this.Class221 = null;
        this.Class222 = null;
        this.Class223 = null;
    }
    
    private Game18[] Class42() {
        if (this.Class150 == null) {
            return null;
        }
        if (this.Class225 == 0) {
            return this.Class150.Class2;
        }
        return this.Class150.Class3;
    }
    
    public final void Class14() {
        try {
            if (this.Class61) {
                if (this.myskill.template.type == 2) {
                    return;
                }
                if (this.myskill.template.id == 42 && !this.myskill.isCooldown()) {
                    this.Class137 = true;
                    this.Class191 = System.currentTimeMillis();
                }
                if (this.Class150 != null && (this.mobFocus != null || (this.charFocus != null && Class2(this.charFocus)))) {
                    this.Class3();
                    final int dx = this.myskill.dx;
                    final int dy = this.myskill.dy;
                    final MyVector myVector = new MyVector();
                    final MyVector myVector2 = new MyVector();
                    if (this.charFocus != null) {
                        myVector2.addElement(this.charFocus);
                        for (int n = 0; n < GameScr.vCharInMap.size() && myVector.size() + myVector2.size() < this.myskill.maxFight; ++n) {
                            final Char char1;
                            if ((char1 = (Char)GameScr.vCharInMap.elementAt(n)).statusMe != 14 && char1.statusMe != 5 && char1.statusMe != 15 && !char1.Class108 && !char1.equals(this.charFocus) && Class2(char1) && this.charFocus.cx - dx <= char1.cx && char1.cx <= this.charFocus.cx + dx && this.charFocus.cy - dy <= char1.cy && char1.cy <= this.charFocus.cy + dy && ((this.Class15 == -1 && char1.cx <= this.cx) || (this.Class15 == 1 && char1.cx >= this.cx))) {
                                myVector2.addElement(char1);
                            }
                        }
                        for (int i = 0; i < GameScr.vMob.size(); ++i) {
                            if (myVector.size() + myVector2.size() >= this.myskill.maxFight) {
                                break;
                            }
                            final Mob mob;
                            if ((mob = (Mob)GameScr.vMob.elementAt(i)).status != 1 && mob.status != 0 && this.charFocus.cx - dx <= mob.x && mob.x <= this.charFocus.cx + dx && this.charFocus.cy - dy <= mob.y && mob.y <= this.charFocus.cy + dy && ((this.Class15 == -1 && mob.x <= this.cx) || (this.Class15 == 1 && mob.x >= this.cx))) {
                                myVector.addElement(mob);
                            }
                        }
                    }
                    else if (this.mobFocus != null && this.mobFocus.status != 1 && this.mobFocus.status != 0) {
                        myVector.addElement(this.mobFocus);
                        for (int n2 = 0; n2 < GameScr.vMob.size() && myVector.size() + myVector2.size() < this.myskill.maxFight; ++n2) {
                            final Mob mob2;
                            if ((mob2 = (Mob)GameScr.vMob.elementAt(n2)).status != 1 && mob2.status != 0 && !mob2.equals(this.mobFocus) && this.mobFocus.x - 100 <= mob2.x && mob2.x <= this.mobFocus.x + 100 && this.mobFocus.y - 50 <= mob2.y && mob2.y <= this.mobFocus.y + 50) {
                                myVector.addElement(mob2);
                            }
                        }
                        for (int n3 = 0; n3 < GameScr.vCharInMap.size() && myVector.size() + myVector2.size() < this.myskill.maxFight; ++n3) {
                            final Char char2;
                            if ((char2 = (Char)GameScr.vCharInMap.elementAt(n3)).statusMe != 14 && char2.statusMe != 5 && char2.statusMe != 15 && !char2.Class108 && ((this.cTypePk >= 4 && this.cTypePk <= 6 && char2.cTypePk >= 4 && char2.cTypePk <= 6 && this.cTypePk != char2.cTypePk) || char2.cTypePk == 3 || this.cTypePk == 3 || (char2.cTypePk == 1 && this.cTypePk == 1) || (this.testCharId >= 0 && this.testCharId == char2.charID) || (this.killCharId >= 0 && this.killCharId == char2.charID)) && this.mobFocus.x - dx <= char2.cx && char2.cx <= this.mobFocus.x + dx && this.mobFocus.y - dy <= char2.cy && char2.cy <= this.mobFocus.y + dy && ((this.Class15 == -1 && char2.cx <= this.cx) || (this.Class15 == 1 && char2.cx >= this.cx))) {
                                myVector2.addElement(char2);
                            }
                        }
                    }
                    this.effPaints = new EffectPaint[myVector.size() + myVector2.size()];
                    for (int j = 0; j < myVector.size(); ++j) {
                        this.effPaints[j] = new EffectPaint();
                        this.effPaints[j].effCharPaint = GameScr.efs[this.Class150.id - 1];
                        this.effPaints[j].eMob = (Mob)myVector.elementAt(j);
                    }
                    for (int k = 0; k < myVector2.size(); ++k) {
                        this.effPaints[k + myVector.size()] = new EffectPaint();
                        this.effPaints[k + myVector.size()].effCharPaint = GameScr.efs[this.Class150.id - 1];
                        this.effPaints[k + myVector.size()].eChar = (Char)myVector2.elementAt(k);
                    }
                    if (this.effPaints.length > 1) {
                        EPosition ePosition = new EPosition();
                        if (this.effPaints[0].eMob != null) {
                            ePosition = new EPosition(this.effPaints[0].eMob.x, this.effPaints[0].eMob.y);
                        }
                        else if (this.effPaints[0].eChar != null) {
                            ePosition = new EPosition(this.effPaints[0].eChar.cx, this.effPaints[0].eChar.cy);
                        }
                        final MyVector myVector3 = new MyVector();
                        for (int l = 1; l < this.effPaints.length; ++l) {
                            if (this.effPaints[l].eMob != null) {
                                myVector3.addElement(new EPosition(this.effPaints[l].eMob.x, this.effPaints[l].eMob.y));
                            }
                            else if (this.effPaints[l].eChar != null) {
                                myVector3.addElement(new EPosition(this.effPaints[l].eChar.cx, this.effPaints[l].eChar.cy));
                            }
                            if (l > 5) {
                                break;
                            }
                        }
                        Lightning.addLight(myVector3, ePosition, this.getClassColor());
                    }
                    int n4 = 0;
                    if (this.mobFocus != null) {
                        n4 = 1;
                    }
                    else if (this.charFocus != null) {
                        n4 = 2;
                    }
                    if (this.Class61) {
                        Service.gI().sendPlayerAttack(myVector, myVector2, n4);
                    }
                }
            }
            else if (this.Class150 != null && (this.mobFocus != null || this.charFocus != null)) {
                if (this.Class99 != null && this.Class100 != null) {
                    this.effPaints = new EffectPaint[this.Class99.length + this.Class100.length];
                    for (int n5 = 0; n5 < this.Class99.length; ++n5) {
                        this.effPaints[n5] = new EffectPaint();
                        this.effPaints[n5].effCharPaint = GameScr.efs[this.Class150.id - 1];
                        this.effPaints[n5].eMob = this.Class99[n5];
                    }
                    for (int n6 = 0; n6 < this.Class100.length; ++n6) {
                        this.effPaints[n6 + this.Class99.length] = new EffectPaint();
                        this.effPaints[n6 + this.Class99.length].effCharPaint = GameScr.efs[this.Class150.id - 1];
                        this.effPaints[n6 + this.Class99.length].eChar = this.Class100[n6];
                    }
                    this.Class99 = null;
                    this.Class100 = null;
                }
                else if (this.Class99 != null) {
                    this.effPaints = new EffectPaint[this.Class99.length];
                    for (int n7 = 0; n7 < this.Class99.length; ++n7) {
                        this.effPaints[n7] = new EffectPaint();
                        this.effPaints[n7].effCharPaint = GameScr.efs[this.Class150.id - 1];
                        this.effPaints[n7].eMob = this.Class99[n7];
                    }
                    this.Class99 = null;
                }
                else if (this.Class100 != null) {
                    this.effPaints = new EffectPaint[this.Class100.length];
                    for (int n8 = 0; n8 < this.Class100.length; ++n8) {
                        this.effPaints[n8] = new EffectPaint();
                        this.effPaints[n8].effCharPaint = GameScr.efs[this.Class150.id - 1];
                        this.effPaints[n8].eChar = this.Class100[n8];
                    }
                    this.Class100 = null;
                }
                if (this.effPaints.length > 1 && this.effPaints[0] != null) {
                    EPosition ePosition2 = new EPosition();
                    if (this.effPaints[0].eMob != null) {
                        ePosition2 = new EPosition(this.effPaints[0].eMob.x, this.effPaints[0].eMob.y);
                    }
                    else if (this.effPaints[0].eChar != null) {
                        ePosition2 = new EPosition(this.effPaints[0].eChar.cx, this.effPaints[0].eChar.cy);
                    }
                    final MyVector myVector4 = new MyVector();
                    for (int n9 = 1; n9 < this.effPaints.length; ++n9) {
                        if (this.effPaints[n9].eMob != null) {
                            myVector4.addElement(new EPosition(this.effPaints[n9].eMob.x, this.effPaints[n9].eMob.y));
                        }
                        else if (this.effPaints[n9].eChar != null) {
                            myVector4.addElement(new EPosition(this.effPaints[n9].eChar.cx, this.effPaints[n9].eChar.cy));
                        }
                        if (n9 > 5) {
                            break;
                        }
                    }
                    Lightning.addLight(myVector4, ePosition2, this.getClassColor());
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final boolean Class15() {
        return this.ID_HORSE < 0 && (this.Class80 != null && this.Class80[4] != null && this.Class80[4].template != null && (this.Class80[4].template.id == 443 || this.Class80[4].template.id == 523));
    }
    
    public final boolean Class16() {
        return this.ID_HORSE < 0 && (this.Class80 != null && this.Class80[4] != null && this.Class80[4].template != null && (this.Class80[4].template.id == 485 || this.Class80[4].template.id == 524));
    }
    
    public final boolean Class17() {
        return this.cx >= GameScr.Class16 && this.cx <= GameScr.Class16 + GameScr.Class9 && this.cy >= GameScr.Class17 && this.cy <= GameScr.Class17 + GameScr.Class10 + 30;
    }
    
    static Game123 Class1(final short n, final boolean b) {
        if (n == -1) {
            return null;
        }
        Game123 game123;
        if ((game123 = (Game123)Char.Class227.Class1(new StringBuffer(String.valueOf(n)).toString())) == null) {
            game123 = new Game123(n, b);
            Char.Class227.Class1(new StringBuffer(String.valueOf(n)).toString(), game123);
            game123.Class1 = (int)(System.currentTimeMillis() / 1000L);
        }
        else {
            game123.Class1 = System.currentTimeMillis();
        }
        return game123;
    }
    
    public static void Class18() {
        final Enumeration<String> keys = Char.Class227.Class1.keys();
        while (keys.hasMoreElements()) {
            final String key = keys.nextElement();
            if ((System.currentTimeMillis() - ((Game123)Char.Class227.Class1(key)).Class1) / 1000L > 200L) {
                Char.Class227.Class1.remove(key);
            }
        }
    }
    
    public void Class1(final mGraphics mGraphics) {
        if (!this.Class17()) {
            if (this.Class150 != null) {
                this.Class211 = this.Class42().length;
                this.Class150 = null;
                this.effPaints = null;
                this.Class210 = null;
                this.Class148 = null;
                this.Class209 = -1;
                this.Class147 = -1;
            }
            return;
        }
        this.Class2(mGraphics, this.cx, this.cy, -this.Class228);
        if (this.statusMe == 15 || (this.Class101 != null && this.Class101[0] > 0)) {
            return;
        }
        this.Class3(mGraphics);
        if (this.Class150 != null && this.Class211 < this.Class42().length) {
            try {
                final Game18[] class42 = this.Class42();
                this.Class62 = class42[this.Class211].Class1;
                if (class42[this.Class211].Class2 != 0) {
                    this.Class221 = GameScr.efs[class42[this.Class211].Class2 - 1];
                    final int class43 = 0;
                    this.Class218 = class43;
                    this.Class215 = class43;
                    this.Class212 = class43;
                }
                if (class42[this.Class211].Class5 != 0) {
                    this.Class222 = GameScr.efs[class42[this.Class211].Class5 - 1];
                    final int class44 = 0;
                    this.Class219 = class44;
                    this.Class216 = class44;
                    this.Class213 = class44;
                }
                if (class42[this.Class211].Class8 != 0) {
                    this.Class223 = GameScr.efs[class42[this.Class211].Class8 - 1];
                    final int class45 = 0;
                    this.Class220 = class45;
                    this.Class217 = class45;
                    this.Class214 = class45;
                }
                final Game18[] array;
                if ((array = class42) != null && array[this.Class211] != null && array[this.Class211].Class11 != 0) {
                    this.Class149 = new Game24(this, GameScr.Class27[array[this.Class211].Class11 - 1]);
                    this.Class149.Class1 = 10;
                    this.Class149.Class2 = this.cx + array[this.Class211].Class12;
                    this.Class149.Class3 = this.cy + array[this.Class211].Class13;
                }
                this.Class6(mGraphics);
                if (this.Class15 == 1) {
                    if (this.Class221 != null) {
                        if (this.Class215 == 0) {
                            this.Class215 = class42[this.Class211].Class3;
                        }
                        if (this.Class218 == 0) {
                            this.Class218 = class42[this.Class211].Class4;
                        }
                        Game2.Class1(mGraphics, this.Class221.Class2[this.Class212].Class3, this.cx + this.Class215 + this.Class221.Class2[this.Class212].Class1, this.cy + this.Class218 + this.Class221.Class2[this.Class212].Class2, 0, 3);
                        ++this.Class212;
                        if (this.Class212 >= this.Class221.Class2.length) {
                            this.Class221 = null;
                            final int class46 = 0;
                            this.Class218 = class46;
                            this.Class215 = class46;
                            this.Class212 = class46;
                        }
                    }
                    if (this.Class222 != null) {
                        if (this.Class216 == 0) {
                            this.Class216 = class42[this.Class211].Class6;
                        }
                        if (this.Class219 == 0) {
                            this.Class219 = class42[this.Class211].Class7;
                        }
                        Game2.Class1(mGraphics, this.Class222.Class2[this.Class213].Class3, this.cx + this.Class216 + this.Class222.Class2[this.Class213].Class1, this.cy + this.Class219 + this.Class222.Class2[this.Class213].Class2, 0, 3);
                        ++this.Class213;
                        if (this.Class213 >= this.Class222.Class2.length) {
                            this.Class222 = null;
                            final int class47 = 0;
                            this.Class219 = class47;
                            this.Class216 = class47;
                            this.Class213 = class47;
                        }
                    }
                    if (this.Class223 != null) {
                        if (this.Class217 == 0) {
                            this.Class217 = class42[this.Class211].Class9;
                        }
                        if (this.Class220 == 0) {
                            this.Class220 = class42[this.Class211].Class10;
                        }
                        Game2.Class1(mGraphics, this.Class223.Class2[this.Class214].Class3, this.cx + this.Class217 + this.Class223.Class2[this.Class214].Class1, this.cy + this.Class220 + this.Class223.Class2[this.Class214].Class2, 0, 3);
                        ++this.Class214;
                        if (this.Class223.Class2 != null && this.Class214 >= this.Class223.Class2.length) {
                            this.Class223 = null;
                            final int class48 = 0;
                            this.Class220 = class48;
                            this.Class217 = class48;
                            this.Class214 = class48;
                        }
                    }
                }
                else {
                    if (this.Class221 != null) {
                        if (this.Class215 == 0) {
                            this.Class215 = class42[this.Class211].Class3;
                        }
                        if (this.Class218 == 0) {
                            this.Class218 = class42[this.Class211].Class4;
                        }
                        Game2.Class1(mGraphics, this.Class221.Class2[this.Class212].Class3, this.cx - this.Class215 - this.Class221.Class2[this.Class212].Class1, this.cy + this.Class218 + this.Class221.Class2[this.Class212].Class2, 2, 3);
                        ++this.Class212;
                        if (this.Class212 >= this.Class221.Class2.length) {
                            this.Class221 = null;
                            this.Class212 = 0;
                            this.Class215 = 0;
                            this.Class218 = 0;
                        }
                    }
                    if (this.Class222 != null) {
                        if (this.Class216 == 0) {
                            this.Class216 = class42[this.Class211].Class6;
                        }
                        if (this.Class219 == 0) {
                            this.Class219 = class42[this.Class211].Class7;
                        }
                        Game2.Class1(mGraphics, this.Class222.Class2[this.Class213].Class3, this.cx - this.Class216 - this.Class222.Class2[this.Class213].Class1, this.cy + this.Class219 + this.Class222.Class2[this.Class213].Class2, 2, 3);
                        ++this.Class213;
                        if (this.Class213 >= this.Class222.Class2.length) {
                            this.Class222 = null;
                            this.Class213 = 0;
                            this.Class216 = 0;
                            this.Class219 = 0;
                        }
                    }
                    if (this.Class223 != null) {
                        if (this.Class217 == 0) {
                            this.Class217 = class42[this.Class211].Class9;
                        }
                        if (this.Class220 == 0) {
                            this.Class220 = class42[this.Class211].Class10;
                        }
                        Game2.Class1(mGraphics, this.Class223.Class2[this.Class214].Class3, this.cx - this.Class217 - this.Class223.Class2[this.Class214].Class1, this.cy + this.Class220 + this.Class223.Class2[this.Class214].Class2, 2, 3);
                        ++this.Class214;
                        if (this.Class223.Class2 != null && this.Class214 >= this.Class223.Class2.length) {
                            this.Class223 = null;
                            this.Class214 = 0;
                            this.Class217 = 0;
                            this.Class220 = 0;
                        }
                    }
                }
                ++this.Class211;
            }
            catch (Exception ex2) {
                System.out.println("loi paint charskill");
            }
        }
        else {
            this.Class6(mGraphics);
        }
        Label_1603: {
            if (this.Class149 != null) {
                final Game24 class50;
                final int class49 = Res.Class1((class50 = this.Class149).Class4 - class50.Class2, -(class50.Class5 - class50.Class3));
                while (true) {
                    for (int i = 0; i < Game24.Class8.length - 1; ++i) {
                        if (class49 >= Game24.Class8[i] && class49 <= Game24.Class8[i + 1]) {
                            final int n = (i >= 16) ? 0 : i;
                            final int n2 = n;
                            Game2.Class1(mGraphics, class50.Class6.Class1[Game24.Class7[n2]], class50.Class2, class50.Class3, Game24.Class9[n2], 3);
                            break Label_1603;
                        }
                    }
                    final int n = 0;
                    continue;
                }
            }
        }
        if (this.effPaints != null) {
            for (int j = 0; j < this.effPaints.length; ++j) {
                if (this.effPaints[j] != null) {
                    if (this.effPaints[j].eMob != null) {
                        if (!this.effPaints[j].Class5) {
                            final Mob eMob;
                            if ((eMob = this.effPaints[j].eMob).hp > 0) {
                                eMob.Class13 = 4;
                                eMob.status = 7;
                            }
                            this.effPaints[j].eMob.Class30 = this;
                            if (this.Class61) {
                                getMyChar();
                                getMyChar();
                                Game20.Class1(11);
                            }
                            if (this.effPaints[j].eMob.templateId != 98 && this.effPaints[j].eMob.templateId != 99) {
                                GameScr.Class1(this.effPaints[j].eMob.x, this.effPaints[j].eMob.y - (this.effPaints[j].eMob.Class12 >> 1), this.Class15);
                            }
                            this.effPaints[j].Class5 = true;
                        }
                        Game2.Class1(mGraphics, this.effPaints[j].Class1(), this.effPaints[j].eMob.x, this.effPaints[j].eMob.y, 0, 33);
                    }
                    else if (this.effPaints[j].eChar != null) {
                        if (!this.effPaints[j].Class5) {
                            if (this.effPaints[j].eChar.charID >= 0) {
                                final Char eChar;
                                (eChar = this.effPaints[j].eChar).Class226 = 4;
                                eChar.Class14(49);
                            }
                            GameScr.Class1(this.effPaints[j].eChar.cx, this.effPaints[j].eChar.cy - (this.effPaints[j].eChar.Class59 >> 1), this.Class15);
                            this.effPaints[j].Class5 = true;
                        }
                        Game2.Class1(mGraphics, this.effPaints[j].Class1(), this.effPaints[j].eChar.cx, this.effPaints[j].eChar.cy, 0, 33);
                    }
                    final EffectPaint effectPaint = this.effPaints[j];
                    ++effectPaint.Class1;
                    if (this.effPaints[j].Class1 >= this.effPaints[j].effCharPaint.Class2.length) {
                        this.effPaints[j] = null;
                    }
                }
            }
        }
        if (this.Class209 >= 0 && this.Class210 != null) {
            Game2.Class1(mGraphics, this.Class210.Class2[this.Class209].Class3, this.cx + this.Class210.Class2[this.Class209].Class1, this.cy + this.Class210.Class2[this.Class209].Class2, 0, 3);
            if (GameCanvas.gameTick % 2 == 0) {
                ++this.Class209;
                if (this.Class209 >= this.Class210.Class2.length) {
                    this.Class209 = -1;
                    this.Class210 = null;
                }
            }
        }
        if (this.Class147 >= 0 && this.Class148 != null) {
            Game2.Class1(mGraphics, this.Class148.Class2[this.Class147].Class3, this.cx + this.Class148.Class2[this.Class147].Class1, this.cy + this.Class148.Class2[this.Class147].Class2, 0, 3);
            if (GameCanvas.gameTick % 2 == 0) {
                ++this.Class147;
                if (this.Class147 >= this.Class148.Class2.length) {
                    this.Class147 = -1;
                    this.Class148 = null;
                }
            }
        }
        if (this.Class195) {
            if (this.Class194 < 2) {
                Game2.Class1(mGraphics, 1366, this.cx, this.cy - this.Class180, 0, 3);
            }
            else if (this.Class194 < 4) {
                Game2.Class1(mGraphics, 1367, this.cx, this.cy - this.Class180, 0, 3);
            }
            else if (this.Class194 < 8) {
                Game2.Class1(mGraphics, 1368, this.cx, this.cy - this.Class180, 0, 3);
            }
            else if (GameCanvas.gameTick % 2 == 0) {
                Game2.Class1(mGraphics, 1369, this.cx, this.cy - this.Class180, 0, 3);
            }
            else {
                Game2.Class1(mGraphics, 1370, this.cx, this.cy - this.Class180, 0, 3);
            }
        }
        try {
            if (this.Class94 != null) {
                this.Class94.Class1(mGraphics);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        if (this.statusMe != 1 && this.statusMe != 6) {
            for (int k = 0; k < this.Class186.size(); ++k) {
                ((Game120)this.Class186.elementAt(k)).Class1(mGraphics);
            }
        }
        this.Class1(mGraphics, this.cx, this.cy, -this.Class228);
    }
    
    public final void Class1(final mGraphics mGraphics, final int n, final int n2) {
        int n3 = this.cHP * 26 / this.cMaxHP;
        if (this.statusMe != 5 && this.statusMe != 14 && n3 < 2) {
            n3 = 2;
        }
        else if (this.statusMe == 5 || this.statusMe == 14) {
            n3 = 0;
        }
        if (n3 > 26) {
            n3 = 0;
        }
        mGraphics.setColor(16777215);
        mGraphics.fillRect(n, n2, 26, 4);
        mGraphics.setColor(this.getClassColor());
        mGraphics.fillRect(n, n2, n3, 4);
        mGraphics.setColor(0);
        mGraphics.Class2(n, n2, 26, 4);
    }
    
    private int[] Class43() {
        int[] array = null;
        if (this.Class63 && this.Class80[4].template.id == 485 && this.Class80[4].Class8 >= 3) {
            array = new int[] { 2094, 2095, 2096 };
        }
        return array;
    }
    
    private int[] Class44() {
        int[] array = null;
        if (this.Class63) {
            array = new int[] { 2082, 2082, 2083, 2083, 2084, 2084, 2089, 2089, 2082, 2082, 2083, 2083 };
        }
        return array;
    }
    
    private int[] Class45() {
        int[] array = null;
        if (this.Class64) {
            array = new int[] { 2085, 2086, 2087, 2088 };
        }
        return array;
    }
    
    public final int[] Class19() {
        int[] array = null;
        int n = -1;
        if (this.Class61) {
            if (this.arrItemBody[12] != null) {
                n = this.arrItemBody[12].template.id;
            }
        }
        else {
            n = this.Class145;
        }
        if (n == -1) {
            return null;
        }
        if (n == 420) {
            if (this.Class64 || this.Class63 || this.Class66) {
                array = new int[] { 2029, 2030, 2031, 2030 };
            }
            else {
                array = new int[] { 1635, 1636, 1637, 1636 };
            }
        }
        else if (n == 421) {
            if (this.Class64 || this.Class63 || this.Class66) {
                array = new int[] { 2035, 2036, 2037, 2036 };
            }
            else {
                array = new int[] { 1652, 1653, 1654, 1653 };
            }
        }
        else if (n == 422) {
            if (this.Class64 || this.Class63 || this.Class66) {
                array = new int[] { 2032, 2033, 2034, 2033 };
            }
            else {
                array = new int[] { 1655, 1656, 1657, 1656 };
            }
        }
        return array;
    }
    
    public final int getClassColor() {
        int n = 9145227;
        if (this.nClass.classId == 1 || this.nClass.classId == 2) {
            n = 16711680;
        }
        else if (this.nClass.classId == 3 || this.nClass.classId == 4) {
            n = 33023;
        }
        else if (this.nClass.classId == 5 || this.nClass.classId == 6) {
            n = 7443811;
        }
        return n;
    }
    
    public final void Class2(final mGraphics mGraphics) {
        if (this.Class17()) {
            if (getMyChar().charFocus == null || !getMyChar().charFocus.equals(this)) {
                mFont.Class12.drawString(mGraphics, this.cName, this.cx, this.cy - this.Class59 - mFont.Class16.Class1 - 5, 2, mFont.Class13);
                return;
            }
            if (getMyChar().charFocus != null && getMyChar().charFocus.equals(this)) {
                mFont.Class12.drawString(mGraphics, this.cName, this.cx, this.cy - this.Class59 - mFont.Class16.Class1 - 10, 2, mFont.Class13);
            }
        }
    }
    
    public final void Class3(final mGraphics m) {
        this.Class228 = this.Class59 + 5;
        this.Class228 += ((this.Class64 || this.Class63 || this.Class66) ? 15 : 0);
        final Game123 class1;
        if (this.ID_HORSE >= 0 && (class1 = Class1(this.ID_HORSE, true)) != null && class1.Class7) {
            this.Class228 += class1.Class18;
        }
        if (this.Class108 && !this.Class61) {
            return;
        }
        boolean b = false;
        Label_0600: {
            if (this.Class61) {
                GameScr.gI();
                if (GameScr.Class154 == 1) {
                    if (!GameScr.gI().Class155) {
                        this.Class228 += mFont.Class9.Class1;
                        mFont.Class12.drawString(m, Game86.Class36, this.cx, this.cy - this.Class228, 2, mFont.Class13);
                    }
                    else {
                        this.Class228 += mFont.Class9.Class1;
                        mFont.Class12.drawString(m, Game86.Class37, this.cx, this.cy - this.Class228, 2, mFont.Class13);
                    }
                }
                else {
                    if (this.npcFocus == null && this.charFocus == null && this.mobFocus == null && this.itemFocus == null) {
                        b = true;
                        this.Class228 += mFont.Class9.Class1;
                        if (!this.isHuman) {
                            mFont.Class10.drawString(m, this.cName, this.cx, this.cy - this.Class228, 2, mFont.Class13);
                        }
                        else {
                            mFont.number_red.drawString(m, this.cName, this.cx, this.cy - this.Class228, 2, mFont.Class13);
                        }
                        ++this.Class228;
                    }
                    break Label_0600;
                }
            }
            else {
                if (getMyChar().charFocus != null && getMyChar().charFocus.equals(this)) {
                    b = true;
                    this.Class228 += 5;
                    this.Class1(m, this.cx - 13, this.cy - this.Class228);
                    this.Class228 += mFont.Class9.Class1;
                    if (!this.isHuman) {
                        mFont.Class10.drawString(m, this.cName, this.cx, this.cy - this.Class228, 2, mFont.Class13);
                    }
                    else {
                        mFont.number_red.drawString(m, this.cName, this.cx, this.cy - this.Class228, 2, mFont.Class13);
                    }
                    ++this.Class228;
                    break Label_0600;
                }
                if (!this.Class187) {
                    break Label_0600;
                }
                b = true;
                this.Class228 += mFont.Class9.Class1;
                if (!this.isHuman) {
                    mFont.Class10.drawString(m, this.cName, this.cx, this.cy - this.Class228, 2, mFont.Class13);
                }
                else if (this.ID_NAME < 0) {
                    mFont.number_red.drawString(m, this.cName, this.cx, this.cy - this.Class228, 2, mFont.Class13);
                }
            }
            ++this.Class228;
        }
        if (this.charID == -getMyChar().charID) {
            this.Class228 += mFont.Class9.Class1;
            mFont.Class12.drawString(m, String.valueOf(Game86.Class38) + " " + getMyChar().cName + " " + Game86.Class102, this.cx, this.cy - this.Class228, 2, mFont.Class13);
            ++this.Class228;
        }
        if (!this.Class55.equals("") && b) {
            this.Class228 += mFont.Class9.Class1 - 1;
            int n = 0;
            if (this.Class56 > 0) {
                n = 5;
            }
            mFont.number_red.drawString(m, this.Class55, this.cx + n, this.cy - this.Class228, 2, mFont.Class15);
            if (this.Class56 == 3) {
                Game2.Class1(m, 1215, this.cx - (mFont.number_red.Class1(this.Class55) / 2 + (7 - n)), this.cy - this.Class228 + 1, 0, 17);
            }
            else if (this.Class56 == 4) {
                Game2.Class1(m, 1216, this.cx - (mFont.number_red.Class1(this.Class55) / 2 + (7 - n)), this.cy - this.Class228 + 1, 0, 17);
            }
            else if (this.Class56 == 2) {
                Game2.Class1(m, 1217, this.cx - (mFont.number_red.Class1(this.Class55) / 2 + (7 - n)), this.cy - this.Class228 + 1, 0, 17);
            }
            ++this.Class228;
        }
        Selection.Line(m);
        if (this.Class104 > 0 && this.Class104 < 30) {
            this.Class228 += Game2.Class1[1117][4];
            Game2.Class1(m, 1117, this.cx, this.cy - this.Class228, 0, 17);
            ++this.Class228;
            return;
        }
        if (this.Class104 > 30 && this.Class104 < 60) {
            this.Class228 += Game2.Class1[1117][4];
            Game2.Class1(m, 1126, this.cx, this.cy - this.Class228, 0, 17);
            ++this.Class228;
            return;
        }
        if (this.Class104 > 60 && this.Class104 < 90) {
            this.Class228 += Game2.Class1[1117][4];
            Game2.Class1(m, 1118, this.cx, this.cy - this.Class228, 0, 17);
            ++this.Class228;
            return;
        }
        if (this.charID >= 0) {
            if (this.killCharId >= 0) {
                this.Class228 += Game2.Class1[1122][4];
                Game2.Class1(m, 1122, this.cx, this.cy - this.Class228, 0, 17);
                ++this.Class228;
                return;
            }
            if (this.cTypePk == 3) {
                this.Class228 += Game2.Class1[1121][4];
                Game2.Class1(m, 1121, this.cx, this.cy - this.Class228, 0, 17);
                ++this.Class228;
                return;
            }
            if (this.cTypePk == 2) {
                this.Class228 += Game2.Class1[1124][4];
                Game2.Class1(m, 1124, this.cx, this.cy - this.Class228, 0, 17);
                ++this.Class228;
                return;
            }
            if (this.cTypePk == 1) {
                this.Class228 += Game2.Class1[1123][4];
                Game2.Class1(m, 1123, this.cx, this.cy - this.Class228, 0, 17);
                ++this.Class228;
                return;
            }
            if (this.cTypePk == 4) {
                this.Class228 += Game2.Class1[1240][4];
                Game2.Class1(m, 1240, this.cx, this.cy - this.Class228, 0, 17);
                ++this.Class228;
                return;
            }
            if (this.cTypePk == 5) {
                this.Class228 += Game2.Class1[1241][4];
                Game2.Class1(m, 1241, this.cx, this.cy - this.Class228, 0, 17);
                ++this.Class228;
                return;
            }
            if (this.cTypePk == 6) {
                this.Class228 += Game2.Class1[1241][4];
                Game2.Class1(m, 1123, this.cx, this.cy - this.Class228, 0, 17);
                ++this.Class228;
                return;
            }
            if (this.testCharId > 0) {
                this.Class228 += Game2.Class1[1116][4];
                Game2.Class1(m, 1116, this.cx, this.cy - this.Class228, 0, 17);
                ++this.Class228;
            }
        }
    }
    
    private byte Class46() {
        final Game123 class1;
        if ((class1 = Class1(this.ID_HORSE, true)) == null || !class1.Class7) {
            return 0;
        }
        if (this.statusMe == 1 || this.statusMe == 6) {
            this.Class261 = class1.Class11;
        }
        else if (this.statusMe == 2 || this.statusMe == 10) {
            this.Class261 = class1.Class12;
        }
        else if (this.statusMe == 4) {
            this.Class261 = class1.Class14;
        }
        else if (this.statusMe == 3) {
            this.Class261 = class1.Class13;
        }
        else {
            this.Class261 = class1.Class11;
        }
        if (this.Class260 >= this.Class261.length) {
            return (byte)(this.Class261[this.Class261.length - 1] + this.Class259 * class1.Class16);
        }
        return (byte)(this.Class261[this.Class260] + this.Class259 * class1.Class16);
    }
    
    final int Class3(final int n) {
        return n + this.Class158 * 30;
    }
    
    private void Class3(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1;
        if ((class1 = Class1(this.ID_HORSE, true)) != null && class1.Class7) {
            if (GameCanvas.gameTick % 10 == 0) {
                int n4;
                if ((n4 = class1.Class2.size() / class1.Class4.length) == 0) {
                    n4 = 1;
                }
                this.Class158 = (byte)((this.Class158 + 1) % n4);
            }
            class1.Class1(mGraphics, n, n2, this.Class3(n3), 2);
            class1.Class2(mGraphics, n, n2, this.Class3(n3), 2);
        }
    }
    
    private int Class47() {
        if (!this.Class63 && !this.Class64 && !this.Class66 && this.ID_HORSE < 0) {
            return this.Class62 + this.Class244 * 30;
        }
        if (this.statusMe == 1 || this.statusMe == 6) {
            return this.Class62 + this.Class244 * 30;
        }
        return this.Class263[this.Class245] + this.Class244 * 30;
    }
    
    private int Class48() {
        if (!this.Class63 && !this.Class64 && !this.Class66 && this.ID_HORSE < 0) {
            return this.Class62 + this.Class248 * 30;
        }
        if (this.statusMe == 1 || this.statusMe == 6) {
            return this.Class62 + this.Class248 * 30;
        }
        return this.Class263[this.Class249] + this.Class248 * 30;
    }
    
    private int Class49() {
        if (!this.Class63 && !this.Class64 && !this.Class66) {
            return this.Class62 + this.Class242 * 30;
        }
        if (this.statusMe == 1 || this.statusMe == 6) {
            return this.Class62 + this.Class242 * 30;
        }
        return this.Class263[this.Class243] + this.Class242 * 30;
    }
    
    private int Class50() {
        if (!this.Class63 && !this.Class64 && !this.Class66) {
            return this.Class62 + this.Class246 * 30;
        }
        if (this.statusMe == 1 || this.statusMe == 6) {
            return this.Class62 + this.Class246 * 30;
        }
        return this.Class263[this.Class247] + this.Class246 * 30;
    }
    
    private int Class51() {
        if (!this.Class63 && !this.Class64 && !this.Class66) {
            return this.Class62 + this.Class250 * 30;
        }
        if (this.statusMe == 1 || this.statusMe == 6) {
            return this.Class62 + this.Class250 * 30;
        }
        return this.Class263[this.Class251] + this.Class250 * 30;
    }
    
    private int Class52() {
        if (!this.Class63 && !this.Class64 && !this.Class66) {
            return this.Class62 + this.Class252 * 30;
        }
        if (this.statusMe == 1 || this.statusMe == 6) {
            return this.Class62 + this.Class252 * 30;
        }
        return this.Class263[this.Class253] + this.Class252 * 30;
    }
    
    private int Class53() {
        if (!this.Class63 && !this.Class64 && !this.Class66 && this.ID_HORSE < 0) {
            return this.Class62 + this.Class257 * 30;
        }
        if (this.statusMe == 1 || this.statusMe == 6) {
            return this.Class62 + this.Class257 * 30;
        }
        return this.Class263[this.Class258] + this.Class257 * 30;
    }
    
    final int Class4(final int n) {
        return n + this.Class162 * 30;
    }
    
    final int Class5(final int n) {
        return n + this.Class161 * 30;
    }
    
    final int Class6(final int n) {
        return n + this.Class159 * 30;
    }
    
    final int Class7(final int n) {
        return n + this.Class160 * 30;
    }
    
    private void Class4(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1;
        if ((class1 = Class1(this.ID_PP, false)) != null) {
            class1.Class1(mGraphics, n, n2, this.Class4(n3), 0);
        }
    }
    
    private void Class5(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1;
        if ((class1 = Class1(this.ID_PP, false)) != null) {
            if (GameCanvas.gameTick % 10 == 0) {
                int n4;
                if ((n4 = class1.Class2.size() / 30) == 0) {
                    n4 = 1;
                }
                this.Class162 = (byte)((this.Class162 + 1) % n4);
            }
            class1.Class2(mGraphics, n, n2, this.Class4(n3), 0);
        }
    }
    
    final int Class8(final int n) {
        return n + this.Class163 * 30;
    }
    
    final int Class9(final int n) {
        return n + this.Class164 * 30;
    }
    
    private void Class6(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1;
        if ((class1 = Class1(this.ID_MAT_NA, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int n4;
                if ((n4 = class1.Class2.size() / 30) == 0) {
                    n4 = 1;
                }
                this.Class164 = (byte)((this.Class164 + 1) % n4);
            }
            class1.Class2(mGraphics, n, n2, this.Class9(n3), 0);
            class1.Class1(mGraphics, n, n2, this.Class9(n3), 0);
        }
    }
    
    private void Class7(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1;
        if ((class1 = Class1(this.ID_WEA_PONE, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int n4;
                if ((n4 = class1.Class2.size() / 30) == 0) {
                    n4 = 1;
                }
                this.Class163 = (byte)((this.Class163 + 1) % n4);
            }
            class1.Class2(mGraphics, n, n2, this.Class8(n3), 0);
        }
    }
    
    private void Class8(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1;
        if ((class1 = Class1(this.ID_WEA_PONE, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int n4;
                if ((n4 = class1.Class2.size() / 30) == 0) {
                    n4 = 1;
                }
                this.Class163 = (byte)((this.Class163 + 1) % n4);
            }
            class1.Class1(mGraphics, n, n2, this.Class8(n3), 0);
        }
    }
    
    private void Class9(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1;
        if ((class1 = Class1(this.ID_HAIR, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int n4;
                if ((n4 = class1.Class2.size() / 30) == 0) {
                    n4 = 1;
                }
                this.Class161 = (byte)((this.Class161 + 1) % n4);
            }
            class1.Class1(mGraphics, n, n2, this.Class5(n3), 0);
            class1.Class2(mGraphics, n, n2, this.Class5(n3), 0);
        }
    }
    
    private void Class10(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1;
        if ((class1 = Class1(this.ID_LEG, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int n4;
                if ((n4 = class1.Class2.size() / 30) == 0) {
                    n4 = 1;
                }
                this.Class160 = (byte)((this.Class160 + 1) % n4);
            }
            class1.Class1(mGraphics, n, n2, this.Class7(n3), 0);
            class1.Class2(mGraphics, n, n2, this.Class7(n3), 0);
        }
    }
    
    private void Class11(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1;
        if ((class1 = Class1(this.ID_Body, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int n4;
                if ((n4 = class1.Class2.size() / 30) == 0) {
                    n4 = 1;
                }
                this.Class159 = (byte)((this.Class159 + 1) % n4);
            }
            class1.Class1(mGraphics, n, n2, this.Class6(n3), 0);
            class1.Class2(mGraphics, n, n2, this.Class6(n3), 0);
        }
    }
    
    private void Class1(final mGraphics mGraphics, final int n, final int n2, final Game123 game123) {
        int class62 = 0;
        if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
            class62 = this.Class62 << 1;
        }
        if (game123 != null) {
            if (this.Class66) {
                int n3 = -2;
                if (this.Class15 == 1) {
                    n3 = 2;
                }
                if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                    class62 = this.Class62;
                }
                game123.Class1(mGraphics, n + this.Class55() + n3, n2 + class62 - this.Class56() + this.Class274 - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class50() : (5 + this.Class246 * 30), (this.Class15 == 1) ? 0 : 2);
                return;
            }
            if (this.Class64) {
                game123.Class1(mGraphics, n + this.Class55(), n2 + class62 - this.Class56() - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class50() : (5 + this.Class246 * 30), (this.Class15 == 1) ? 0 : 2);
                return;
            }
            if (this.Class63) {
                game123.Class1(mGraphics, n + this.Class55(), n2 + class62 - this.Class56() - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class50() : (5 + this.Class246 * 30), (this.Class15 == 1) ? 0 : 2);
                return;
            }
            if (this.ID_HORSE >= 0) {
                game123.Class1(mGraphics, n + this.Class55() + this.Class265, n2 - this.Class54() - this.Class56(), this.Class50(), (this.Class15 == 1) ? 0 : 2);
                return;
            }
            game123.Class1(mGraphics, n + this.Class55(), n2 - this.Class54(), this.Class50(), (this.Class15 == 1) ? 0 : 2);
        }
    }
    
    private void Class2(final mGraphics mGraphics, final int n, final int n2, final Game123 game123) {
        int class62 = 0;
        if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
            class62 = this.Class62 << 1;
        }
        if (game123 != null) {
            if (this.Class66) {
                int n3 = -2;
                if (this.Class15 == 1) {
                    n3 = 2;
                }
                if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                    class62 = this.Class62;
                }
                game123.Class2(mGraphics, n + this.Class55() + n3, n2 + class62 - this.Class56() + this.Class274 - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class50() : (5 + this.Class246 * 30), (this.Class15 == 1) ? 0 : 2);
                return;
            }
            if (this.Class64) {
                game123.Class2(mGraphics, n + this.Class55(), n2 + class62 - this.Class56() - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class50() : (5 + this.Class246 * 30), (this.Class15 == 1) ? 0 : 2);
                return;
            }
            if (this.Class63) {
                game123.Class2(mGraphics, n + this.Class55(), n2 + class62 - this.Class56() - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class50() : (5 + this.Class246 * 30), (this.Class15 == 1) ? 0 : 2);
                return;
            }
            if (this.ID_HORSE >= 0) {
                game123.Class2(mGraphics, n + this.Class55() + this.Class265, n2 - this.Class54() - this.Class56(), this.Class50(), (this.Class15 == 1) ? 0 : 2);
                return;
            }
            game123.Class2(mGraphics, n + this.Class55(), n2 - this.Class54(), this.Class50(), (this.Class15 == 1) ? 0 : 2);
        }
    }
    
    private void Class12(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1 = Class1(this.ID_Body, false);
        int n4 = 0;
        if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
            n4 = this.Class62 * n3;
        }
        if (class1 != null) {
            class1.Class1(mGraphics, n + this.Class55(), n2 + n4 - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class51() : (5 + this.Class250 * 30), (this.Class15 == 1) ? 0 : 2);
            class1.Class2(mGraphics, n + this.Class55(), n2 + n4 - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class51() : (5 + this.Class250 * 30), (this.Class15 == 1) ? 0 : 2);
        }
    }
    
    private int Class54() {
        int n = 0;
        if (this.Class63) {
            if (this.Class80[4].template.id == 485) {
                n = 4;
            }
            else {
                n = 6;
            }
        }
        if (this.Class66) {
            n = 2;
            if (this.statusMe == 3) {
                n = 4;
            }
        }
        return n;
    }
    
    private int Class55() {
        int n = 0;
        if (this.Class64) {
            n = 3;
            if (this.Class15 == 1) {
                n = -3;
            }
        }
        if (this.Class63) {
            if (this.Class80[4].template.id == 485) {
                n = 4;
                if (this.Class15 == 1) {
                    n = -4;
                }
            }
            else {
                n = 7;
                if (this.Class15 == 1) {
                    n = -7;
                }
            }
        }
        if (this.Class66) {
            n = 1;
            if (this.Class15 == 1) {
                n = -1;
            }
        }
        return n;
    }
    
    private void Class13(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        final Game123 class1 = Class1(this.ID_HAIR, false);
        int n4 = 0;
        if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
            n4 = this.Class62 * n3;
        }
        if (class1 != null) {
            class1.Class1(mGraphics, n + this.Class55(), n2 + n4 - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class52() : (5 + this.Class252 * 30), (this.Class15 == 1) ? 0 : 2);
            class1.Class2(mGraphics, n + this.Class55(), n2 + n4 - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class52() : (5 + this.Class252 * 30), (this.Class15 == 1) ? 0 : 2);
        }
    }
    
    private void Class14(final mGraphics mGraphics, final int n, final int n2, int n3) {
        if (this.ID_MAT_NA < 0) {
            return;
        }
        final Game123 class1 = Class1(this.ID_MAT_NA, false);
        int n4 = 0;
        if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
            n4 = this.Class62 * n3;
        }
        if (class1 != null) {
            if (this.Class64 && (this.Class80[4].template.id == 443 || this.Class80[4].template.id == 523)) {
                n3 = -2;
                if (this.statusMe == 1 || this.statusMe == 6) {
                    n3 = 0;
                }
                int n5 = 0;
                if (this.cgender == 1) {
                    n5 = 3;
                }
                if (this.statusMe == 1 || this.statusMe == 6) {
                    n5 = 0;
                }
                class1.Class1(mGraphics, n + n3, n2 + n4 - this.Class54() - n5, (this.statusMe == 1 || this.statusMe == 6) ? this.Class49() : (5 + this.Class242 * 30), (this.Class15 == 1) ? 0 : 2);
                class1.Class2(mGraphics, n + n3, n2 + n4 - this.Class54() - n5, (this.statusMe == 1 || this.statusMe == 6) ? this.Class49() : (5 + this.Class242 * 30), (this.Class15 == 1) ? 0 : 2);
                return;
            }
            class1.Class1(mGraphics, n + this.Class55(), n2 + n4 - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class49() : (5 + this.Class242 * 30), (this.Class15 == 1) ? 0 : 2);
            class1.Class2(mGraphics, n + this.Class55(), n2 + n4 - this.Class54(), (this.statusMe == 1 || this.statusMe == 6) ? this.Class49() : (5 + this.Class242 * 30), (this.Class15 == 1) ? 0 : 2);
        }
    }
    
    private void Class4(final mGraphics mGraphics) {
        final Game123 class1 = Class1(this.ID_PP, false);
        int class2 = 0;
        if (this.Class63) {
            if (this.Class80[4].template.id == 485) {
                if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                    class2 = this.Class62 << 1;
                }
                if (class1 != null) {
                    class1.Class1(mGraphics, this.cx + this.Class55(), this.cy - 9 + class2 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
                }
            }
            if (this.Class80[4].template.id == 524) {
                int n = 2;
                if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                    class2 = this.Class62 << 1;
                }
                if (this.Class15 == 1) {
                    n = -2;
                }
                if (class1 != null) {
                    class1.Class1(mGraphics, this.cx + n + this.Class55(), this.cy - 12 + class2 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
                }
            }
        }
        else if (this.Class64) {
            if (this.Class80[4].template.id == 523) {
                if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                    class2 = this.Class62 << 1;
                }
                int n2 = 2;
                if (this.Class15 == 1) {
                    n2 = -2;
                }
                if (class1 != null) {
                    class1.Class1(mGraphics, this.cx + n2 + this.Class55(), this.cy - 15 + class2 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
                }
            }
            else if (this.Class80[4].template.id == 443) {
                if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                    class2 = this.Class62 << 1;
                }
                int n3 = 2;
                if (this.Class15 == 1) {
                    n3 = -2;
                }
                if (class1 != null) {
                    class1.Class1(mGraphics, this.cx + n3 + this.Class55(), this.cy - 15 + class2 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
                }
            }
        }
        else if (this.Class66) {
            int n4 = -4;
            if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                class2 = this.Class62;
            }
            if (this.Class15 == 1) {
                n4 = 4;
            }
            if (class1 != null) {
                class1.Class1(mGraphics, this.cx + n4 + this.Class55(), this.cy - 18 + this.Class274 + class2 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
            }
        }
        else if (class1 != null) {
            class1.Class1(mGraphics, this.cx + this.Class265 + this.Class55(), this.cy - this.Class264 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
        }
    }
    
    private void Class5(final mGraphics mGraphics) {
        final Game123 class1 = Class1(this.ID_PP, false);
        int class2 = 0;
        if (this.Class63) {
            if (this.Class80[4].template.id == 485) {
                if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                    class2 = this.Class62 << 1;
                }
                if (class1 != null) {
                    class1.Class2(mGraphics, this.cx + this.Class55(), this.cy - 9 + class2 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
                }
            }
            if (this.Class80[4].template.id == 524) {
                int n = 2;
                if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                    class2 = this.Class62 << 1;
                }
                if (this.Class15 == 1) {
                    n = -2;
                }
                if (class1 != null) {
                    class1.Class2(mGraphics, this.cx + n + this.Class55(), this.cy - 12 + class2 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
                }
            }
        }
        else if (this.Class64) {
            if (this.Class80[4].template.id == 523) {
                int n2 = 2;
                if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                    class2 = this.Class62 << 1;
                }
                if (this.Class15 == 1) {
                    n2 = -2;
                }
                if (class1 != null) {
                    class1.Class2(mGraphics, this.cx + n2 + this.Class55(), this.cy - 15 + class2 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
                }
            }
            else if (this.Class80[4].template.id == 443) {
                if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                    class2 = this.Class62 << 1;
                }
                int n3 = 2;
                if (this.Class15 == 1) {
                    n3 = -2;
                }
                if (class1 != null) {
                    class1.Class2(mGraphics, this.cx + n3 + this.Class55(), this.cy - 15 + class2 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
                }
            }
        }
        else if (this.Class66) {
            int n4 = -4;
            if ((this.statusMe == 1 || this.statusMe == 6) && this.Class62 <= 1) {
                class2 = this.Class62;
            }
            if (this.Class15 == 1) {
                n4 = 4;
            }
            if (class1 != null) {
                class1.Class2(mGraphics, this.cx + n4 + this.Class55(), this.cy - 18 + this.Class274 + class2 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
            }
        }
        else if (class1 != null) {
            class1.Class2(mGraphics, this.cx + this.Class265 + this.Class55(), this.cy - this.Class264 - this.Class54(), this.Class53(), (this.Class15 == 1) ? 0 : 2);
        }
    }
    
    private int Class56() {
        final Game123 class1;
        if (this.ID_HORSE >= 0 && (class1 = Class1(this.ID_HORSE, true)) != null && class1.Class7) {
            return class1.Class18;
        }
        if (this.Class64 || this.Class63 || this.Class66) {
            return 12;
        }
        return 0;
    }
    
    private void Class6(final mGraphics mGraphics) {
        try {
            final Game123 class1;
            if ((class1 = Class1(this.ID_WEA_PONE, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int n;
                if ((n = class1.Class2.size() / 30) == 0) {
                    n = 1;
                }
                this.Class246 = (byte)((this.Class246 + 1) % n);
            }
            final Game123 class2;
            if ((class2 = Class1(this.ID_Bien_Hinh, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int n2;
                if ((n2 = class2.Class2.size() / 30) == 0) {
                    n2 = 1;
                }
                this.Class244 = (byte)((this.Class244 + 1) % n2);
            }
            final Game123 class3;
            if ((class3 = Class1(this.ID_MAT_NA, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int n3;
                if ((n3 = class3.Class2.size() / 30) == 0) {
                    n3 = 1;
                }
                this.Class242 = (byte)((this.Class242 + 1) % n3);
            }
            final Game123 class4 = Class1(this.ID_RANK, false);
            final Game123 class5 = Class1(this.ID_NAME, false);
            final Game123 class6;
            if ((class6 = Class1(this.ID_LEG, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int n4;
                if ((n4 = class6.Class2.size() / 30) == 0) {
                    n4 = 1;
                }
                this.Class248 = (byte)((this.Class248 + 1) % n4);
            }
            final Game123 class7;
            if ((class7 = Class1(this.ID_HORSE, true)) != null && class7.Class7 && GameCanvas.gameTick % 10 == 0) {
                int n5;
                if ((n5 = class7.Class2.size() / class7.Class4.length) == 0) {
                    n5 = 1;
                }
                this.Class259 = (byte)((this.Class259 + 1) % n5);
            }
            final Game123 class8;
            if ((class8 = Class1(this.ID_Body, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int n6;
                if ((n6 = class8.Class2.size() / 30) == 0) {
                    n6 = 1;
                }
                this.Class250 = (byte)((this.Class250 + 1) % n6);
            }
            final Game123 class9;
            if ((class9 = Class1(this.ID_HAIR, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int n7;
                if ((n7 = class9.Class2.size() / 30) == 0) {
                    n7 = 1;
                }
                this.Class252 = (byte)((this.Class252 + 1) % n7);
            }
            final Game123 class10;
            if ((class10 = Class1(this.ID_PP, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int n8;
                if ((n8 = class10.Class2.size() / 30) == 0) {
                    n8 = 1;
                }
                this.Class257 = (byte)((this.Class257 + 1) % n8);
            }
            Game99 game99 = GameScr.Class28[this.head];
            final Game99 game100 = GameScr.Class28[this.leg];
            final Game99 game101 = GameScr.Class28[this.body];
            Game99 game102 = GameScr.Class28[this.Class144];
            if (class1 != null) {
                game102 = null;
            }
            if (this.arrItemBody != null && this.arrItemBody[11] != null) {
                game99 = GameScr.Class28[this.arrItemBody[11].template.Class8];
                this.head = this.arrItemBody[11].template.Class8;
            }
            if (game99.Class1 == null || game99.Class1.length < 8) {
                game99 = Class2(this.cgender);
            }
            else {
                for (int i = 0; i < game99.Class1.length; ++i) {
                    if (game99.Class1[i] == null || !Game2.Class1(game99.Class1[i].Class1)) {
                        game99 = Class2(this.cgender);
                        break;
                    }
                }
            }
            final int[] array = (int[])((game99.Class1[Char.Class127[this.Class62][0][0]].Class1 <= 4) ? null : this.Class19());
            if ((((this.statusMe == 1 || this.statusMe == 6) && GameCanvas.gameTick % 10 == 0) || ((this.statusMe == 2 || this.statusMe == 10) && GameCanvas.gameTick % 2 == 0) || ((this.statusMe == 4 || this.statusMe == 3) && GameCanvas.gameTick % 3 == 0)) && array != null) {
                ++this.Class107;
                if (this.Class107 > array.length - 1) {
                    this.Class107 = 0;
                }
            }
            if (this.statusMe == 14) {
                if (this.Class30()) {
                    this.Class7(mGraphics);
                }
                else if (this.Class16()) {
                    if (this.Class80[4].template.id == 485) {
                        if (this.Class80[4].Class8 < 2) {
                            Game2.Class1(mGraphics, 1800, this.Class173, this.Class174, 2, 33);
                        }
                        else {
                            Game2.Class1(mGraphics, 2063, this.Class173, this.Class174, 2, 33);
                        }
                    }
                    else if (this.Class80[4].template.id == 524) {
                        if (this.Class80[4].Class8 < 2) {
                            Game2.Class1(mGraphics, 2064, this.Class173, this.Class174, 2, 33);
                        }
                        else {
                            Game2.Class1(mGraphics, 2068, this.Class173, this.Class174, 2, 33);
                        }
                    }
                }
                Game2.Class1(mGraphics, 1040, this.cx, this.cy, 0, 33);
            }
            else if (this.Class108) {
                if (this.Class61) {
                    if (GameCanvas.gameTick % 50 == 48 || GameCanvas.gameTick % 50 == 90) {
                        Game2.Class1(mGraphics, 1196, this.cx, this.cy - 18, 0, 3);
                    }
                    else {
                        Game2.Class1(mGraphics, 1195, this.cx, this.cy - 18, 0, 3);
                    }
                }
            }
            else {
                if (class1 != null) {
                    this.Class1(mGraphics, this.cx, this.cy, class1);
                }
                if (class2 != null) {
                    class2.Class1(mGraphics, this.cx, this.cy, this.Class47(), (this.Class15 == 1) ? 0 : 2);
                    class2.Class2(mGraphics, this.cx, this.cy, this.Class47(), (this.Class15 == 1) ? 0 : 2);
                }
                if (class7 != null) {
                    class7.Class1(mGraphics, this.cx, this.cy, this.Class46(), (this.Class15 == 1) ? 2 : 0);
                }
                if (class4 != null) {
                    class4.Class1(mGraphics, this.cx, this.cy - this.Class56(), this.Class240, (this.Class15 == 1) ? 0 : 2);
                }
                if (class5 != null) {
                    class5.Class1(mGraphics, this.cx, this.cy - this.Class56(), this.Class238, 0);
                }
                this.Class4(mGraphics);
                if (this.Class63) {
                    int n9 = 0;
                    int n10 = 0;
                    final int[] class11;
                    if ((class11 = this.Class43()) != null) {
                        ++this.Class188;
                        if (this.Class188 >= class11.length) {
                            this.Class188 = 0;
                        }
                    }
                    if (this.Class80[4].template.id == 485) {
                        if (this.Class80[4].Class8 < 2) {
                            Label_1471: {
                                int class12;
                                if (this.statusMe == 1 || this.statusMe == 6) {
                                    n9 = ((GameCanvas.gameTick % 20 > 12) ? 1 : 0);
                                    if ((class10 == null && class8 == null && class9 == null && class1 == null && class3 == null) || this.Class62 > 1) {
                                        break Label_1471;
                                    }
                                    class12 = this.Class62;
                                }
                                else {
                                    if (this.statusMe != 2 && this.statusMe != 10) {
                                        break Label_1471;
                                    }
                                    class12 = ((GameCanvas.gameTick % 6 > 3) ? 1 : 0);
                                }
                                n9 = class12;
                            }
                            if (this.statusMe == 3) {
                                n10 = -5 * this.Class15;
                            }
                            if (this.Class15 == 1) {
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 1711, this.cx, this.cy + 2, 0, 33);
                                }
                                else {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 1709 : 1710, this.cx, this.cy, 0, 33);
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 0, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 0, 33);
                                }
                                this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                            }
                            else {
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 1711, this.cx, this.cy + 2, 2, 33);
                                }
                                else {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 1709 : 1710, this.cx, this.cy, 2, 33);
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 2, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 2, 33);
                                }
                                this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                            }
                        }
                        else {
                            Label_2104: {
                                int class13;
                                if (this.statusMe == 1 || this.statusMe == 6) {
                                    n9 = ((GameCanvas.gameTick % 20 > 12) ? 1 : 0);
                                    if ((class10 == null && class8 == null && class9 == null && class1 == null && class3 == null) || this.Class62 > 1) {
                                        break Label_2104;
                                    }
                                    class13 = this.Class62;
                                }
                                else {
                                    if (this.statusMe != 2 && this.statusMe != 10) {
                                        break Label_2104;
                                    }
                                    class13 = ((GameCanvas.gameTick % 6 > 3) ? 1 : 0);
                                }
                                n9 = class13;
                            }
                            if (this.statusMe == 3) {
                                n10 = -5 * this.Class15;
                            }
                            if (this.Class15 == 1) {
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 2057, this.cx, this.cy + 2, 0, 33);
                                }
                                else if (!this.Class185) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2056 : 2055, this.cx, this.cy, 0, 33);
                                }
                                else {
                                    Game2.Class1(mGraphics, 2057, this.cx, this.cy, 0, 33);
                                }
                                if (this.statusMe == 2 && class11 != null) {
                                    Game2.Class1(mGraphics, class11[this.Class188], this.cx - 25, this.cy - 2, 0, 33);
                                }
                                if (!this.Class185) {
                                    if (class9 != null) {
                                        this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                    }
                                    else {
                                        Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 0, 17);
                                    }
                                    if (class8 != null) {
                                        this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                    }
                                    else {
                                        Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 0, 33);
                                    }
                                    this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    if (class9 != null) {
                                        this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                    }
                                    else {
                                        Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15 - 3, this.cy - 1 - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 0, 17);
                                    }
                                    if (class8 != null) {
                                        this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                    }
                                    else {
                                        Game2.Class1(mGraphics, this.Class58(), this.cx - 3 + this.Class231 * this.Class15, this.cy - 1 - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 0, 33);
                                    }
                                    this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                                }
                            }
                            else {
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 2057, this.cx, this.cy + 2, 2, 33);
                                }
                                else if (!this.Class185) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2056 : 2055, this.cx, this.cy, 2, 33);
                                }
                                else {
                                    Game2.Class1(mGraphics, 2057, this.cx, this.cy, 2, 33);
                                }
                                if (this.statusMe == 2 && class11 != null) {
                                    Game2.Class1(mGraphics, class11[this.Class188], this.cx + 25, this.cy - 2, 2, 33);
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 2, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 2, 33);
                                }
                                this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                            }
                        }
                    }
                    else if (this.Class80[4].template.id == 524) {
                        if (this.Class80[4].Class8 < 2) {
                            Label_3109: {
                                int class14;
                                if (this.statusMe == 1 || this.statusMe == 6) {
                                    n9 = ((GameCanvas.gameTick % 20 > 12) ? 1 : 0);
                                    if ((class10 == null && class8 == null && class9 == null && class1 == null && class3 == null) || this.Class62 > 1) {
                                        break Label_3109;
                                    }
                                    class14 = this.Class62;
                                }
                                else {
                                    if (this.statusMe != 2 && this.statusMe != 10) {
                                        break Label_3109;
                                    }
                                    class14 = ((GameCanvas.gameTick % 6 > 3) ? 1 : 0);
                                }
                                n9 = class14;
                            }
                            if (this.statusMe == 3) {
                                n10 = -5 * this.Class15;
                            }
                            if (this.Class15 == 1) {
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 2066, this.cx, this.cy + 2, 0, 33);
                                }
                                else {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2064 : 2065, this.cx, this.cy, 0, 33);
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 0, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 0, 33);
                                }
                                this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                            }
                            else {
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 2066, this.cx, this.cy + 2, 2, 33);
                                }
                                else {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2064 : 2065, this.cx, this.cy, 2, 33);
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 2, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 2, 33);
                                }
                                this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                            }
                        }
                        else if (this.Class80[4].Class8 >= 2 && this.Class80[4].Class8 < 4) {
                            final int[] class15;
                            if ((class15 = this.Class44()) != null) {
                                ++this.Class188;
                                if (this.Class188 >= class15.length) {
                                    this.Class188 = 0;
                                }
                            }
                            Label_3801: {
                                int class16;
                                if (this.statusMe == 1 || this.statusMe == 6) {
                                    n9 = ((GameCanvas.gameTick % 20 > 12) ? 1 : 0);
                                    if ((class10 == null && class8 == null && class9 == null && class1 == null && class3 == null) || this.Class62 > 1) {
                                        break Label_3801;
                                    }
                                    class16 = this.Class62;
                                }
                                else {
                                    if (this.statusMe != 2 && this.statusMe != 10) {
                                        break Label_3801;
                                    }
                                    class16 = ((GameCanvas.gameTick % 6 > 3) ? 1 : 0);
                                }
                                n9 = class16;
                            }
                            if (this.statusMe == 3) {
                                n10 = -5 * this.Class15;
                            }
                            if (this.Class15 == 1) {
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 2070, this.cx, this.cy + 2, 0, 33);
                                }
                                else if (this.statusMe == 4) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                }
                                else if (this.statusMe == 2 || this.statusMe == 10) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                }
                                else if (this.statusMe == 1 || this.statusMe == 6) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 0, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 0, 33);
                                }
                                this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                            }
                            else {
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 2070, this.cx, this.cy + 2, 2, 33);
                                }
                                if (this.statusMe == 4) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                }
                                else if (this.statusMe == 2 || this.statusMe == 10) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                }
                                else if (this.statusMe == 1 || this.statusMe == 6) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 2, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 2, 33);
                                }
                                this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                            }
                        }
                        else {
                            final int[] class17;
                            if ((class17 = this.Class44()) != null) {
                                ++this.Class188;
                                if (this.Class188 >= class17.length) {
                                    this.Class188 = 0;
                                }
                            }
                            Label_4676: {
                                int class18;
                                if (this.statusMe == 1 || this.statusMe == 6) {
                                    n9 = ((GameCanvas.gameTick % 20 > 12) ? 1 : 0);
                                    if ((class10 == null && class8 == null && class9 == null && class1 == null && class3 == null) || this.Class62 > 1) {
                                        break Label_4676;
                                    }
                                    class18 = this.Class62;
                                }
                                else {
                                    if (this.statusMe != 2 && this.statusMe != 10) {
                                        break Label_4676;
                                    }
                                    class18 = ((GameCanvas.gameTick % 6 > 3) ? 1 : 0);
                                }
                                n9 = class18;
                            }
                            if (this.statusMe == 3) {
                                n10 = -5 * this.Class15;
                            }
                            if (this.Class15 == 1) {
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 2070, this.cx, this.cy + 2, 0, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx + 13, this.cy - 17, 0, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx - 24, this.cy + 2, 0, 33);
                                }
                                else if (this.statusMe == 4) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx + 15, this.cy, 0, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx - 27, this.cy, 0, 33);
                                }
                                else if (this.statusMe == 2 || this.statusMe == 10) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx + 15, this.cy, 0, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx - 27, this.cy, 0, 33);
                                }
                                else if (this.statusMe == 1 || this.statusMe == 6) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx + 15, this.cy, 0, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx - 27, this.cy, 0, 33);
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 0, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 0, 33);
                                }
                                this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                            }
                            else {
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 2070, this.cx, this.cy + 2, 2, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx - 12, this.cy - 17, 2, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx + 25, this.cy + 3, 2, 33);
                                }
                                if (this.statusMe == 4) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx - 15, this.cy, 2, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx + 27, this.cy, 2, 33);
                                }
                                else if (this.statusMe == 2 || this.statusMe == 10) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx - 15, this.cy, 2, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx + 27, this.cy, 2, 33);
                                }
                                else if (this.statusMe == 1 || this.statusMe == 6) {
                                    Game2.Class1(mGraphics, (n9 == 0) ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx - 15, this.cy, 2, 33);
                                    Game2.Class1(mGraphics, class17[this.Class188], this.cx + 27, this.cy, 2, 33);
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + n10 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 + n9 + this.Class230, 2, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx, this.cy - 8, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 8 + n9 + this.Class232, 2, 33);
                                }
                                this.Class14(mGraphics, this.cx, this.cy - 8, 2);
                            }
                        }
                    }
                }
                else if (this.Class64) {
                    final int[] class19;
                    if ((class19 = this.Class45()) != null) {
                        ++this.Class189;
                        if (this.Class189 >= class19.length) {
                            this.Class189 = 0;
                        }
                    }
                    if (this.statusMe == 1 || this.statusMe == 6) {
                        this.Class233 = ((GameCanvas.gameTick % 20 > 12) ? 1 : 0);
                        if ((class10 != null || class8 != null || class9 != null || class1 != null || class3 != null) && this.Class62 <= 1) {
                            this.Class233 = this.Class62;
                        }
                        this.Class234 = -this.Class233;
                    }
                    else if (this.statusMe == 2 || this.statusMe == 10) {
                        if (GameCanvas.gameTick % 12 <= 3) {
                            this.Class233 = 0;
                        }
                        else if (GameCanvas.gameTick % 12 <= 6) {
                            this.Class233 = 1;
                            this.Class234 = 2;
                        }
                        else if (GameCanvas.gameTick % 12 <= 9) {
                            this.Class233 = 2;
                            this.Class234 = 4;
                        }
                        else {
                            this.Class233 = 3;
                            this.Class234 = 2;
                        }
                    }
                    final int[] array2 = { 2050, 2053, 2049, 2052 };
                    final int[] array3 = { 2075, 2078, 2074, 2079 };
                    final int[] array4 = { this.cy - 22, this.cy - 23, this.cy - 22, this.cy - 23 };
                    final int[] array5 = { this.cy - 22, this.cy - 23, this.cy - 22, this.cy - 22 };
                    if (this.statusMe == 3) {
                        this.Class235 = -5 * this.Class15;
                        this.Class236 = 5;
                    }
                    else {
                        this.Class235 = -3 * this.Class15;
                    }
                    if (this.Class80[4].template.id == 523) {
                        if (this.Class15 == 1) {
                            if (game102 != null) {
                                Game2.Class1(mGraphics, game102.Class1[Char.Class127[this.Class62][3][0]].Class1, this.cx + Char.Class127[this.Class62][3][1] + game102.Class1[Char.Class127[this.Class62][3][0]].Class2, this.cy - Char.Class127[this.Class62][3][2] + game102.Class1[Char.Class127[this.Class62][3][0]].Class3 - 10, 0, 0);
                            }
                            if (this.statusMe == 3) {
                                Game2.Class1(mGraphics, 2051, this.cx, this.cy, 0, 33);
                            }
                            else if (this.statusMe == 4) {
                                Game2.Class1(mGraphics, 2052, this.cx, this.cy, 0, 33);
                            }
                            else if (this.statusMe == 1 || this.statusMe == 6) {
                                Game2.Class1(mGraphics, (this.Class233 == 0) ? 2047 : 2048, this.cx, this.cy, 0, 33);
                            }
                            else if (this.statusMe == 2 || this.statusMe == 10) {
                                Game2.Class1(mGraphics, array2[this.Class233], this.cx, this.cy - this.Class234, 0, 33);
                            }
                            int n11 = 2;
                            if (this.Class15 == 1) {
                                n11 = -2;
                            }
                            if (class9 != null) {
                                this.Class13(mGraphics, this.cx + n11, this.cy - 15, 2);
                            }
                            else {
                                Game2.Class1(mGraphics, this.Class59(), this.cx + this.Class235 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 - this.Class236 - this.Class234 + this.Class230, 0, 17);
                            }
                            if (class8 != null) {
                                this.Class12(mGraphics, this.cx + n11, this.cy - 15, 2);
                            }
                            else {
                                Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class235 + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 9 - this.Class236 - this.Class234 + this.Class232, 0, 33);
                            }
                            this.Class14(mGraphics, this.cx + n11, this.cy - 15, 2);
                        }
                        else {
                            if (game102 != null) {
                                Game2.Class1(mGraphics, game102.Class1[Char.Class127[this.Class62][3][0]].Class1, this.cx - Char.Class127[this.Class62][3][1] - game102.Class1[Char.Class127[this.Class62][3][0]].Class2, this.cy - Char.Class127[this.Class62][3][2] + game102.Class1[Char.Class127[this.Class62][3][0]].Class3 - 10, 2, 24);
                            }
                            if (this.statusMe == 3) {
                                Game2.Class1(mGraphics, 2051, this.cx, this.cy, 2, 33);
                            }
                            else if (this.statusMe == 4) {
                                Game2.Class1(mGraphics, 2052, this.cx, this.cy, 2, 33);
                            }
                            else if (this.statusMe == 1 || this.statusMe == 6) {
                                Game2.Class1(mGraphics, (this.Class233 == 0) ? 2047 : 2048, this.cx, this.cy, 2, 33);
                            }
                            else if (this.statusMe == 2 || this.statusMe == 10) {
                                Game2.Class1(mGraphics, array2[this.Class233], this.cx, this.cy - this.Class234, 2, 33);
                            }
                            int n12 = 2;
                            if (this.Class15 == 1) {
                                n12 = -2;
                            }
                            if (class9 != null) {
                                this.Class13(mGraphics, this.cx + n12, this.cy - 15, 2);
                            }
                            else {
                                Game2.Class1(mGraphics, this.Class59(), this.cx + this.Class235 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 - this.Class236 - this.Class234 + this.Class230, 2, 17);
                            }
                            if (class8 != null) {
                                this.Class12(mGraphics, this.cx + n12, this.cy - 15, 2);
                            }
                            else {
                                Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class235 + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 9 - this.Class236 - this.Class234 + this.Class232, 2, 33);
                            }
                            this.Class14(mGraphics, this.cx + n12, this.cy - 15, 2);
                        }
                    }
                    else if (this.Class80[4].template.id == 443) {
                        if (this.Class80[4].Class8 >= 3) {
                            if (this.Class15 == 1) {
                                if (game102 != null) {
                                    Game2.Class1(mGraphics, game102.Class1[Char.Class127[this.Class62][3][0]].Class1, this.cx + Char.Class127[this.Class62][3][1] + game102.Class1[Char.Class127[this.Class62][3][0]].Class2, this.cy - Char.Class127[this.Class62][3][2] + game102.Class1[Char.Class127[this.Class62][3][0]].Class3 - 10, 0, 0);
                                }
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 2077, this.cx, this.cy, 0, 33);
                                    mGraphics.Class1(GameScr.Class130, 0, this.Class171 * 3, 3, 3, 0, this.cx + 21, this.cy - 30, 0);
                                }
                                else if (this.statusMe == 4) {
                                    Game2.Class1(mGraphics, 2076, this.cx, this.cy, 0, 33);
                                    mGraphics.Class1(GameScr.Class130, 0, this.Class171 * 3, 3, 3, 0, this.cx + 21, this.cy - 19, 0);
                                }
                                else if (this.statusMe == 1 || this.statusMe == 6) {
                                    Game2.Class1(mGraphics, (this.Class233 == 0) ? 2073 : 2072, this.cx, this.cy, 0, 33);
                                    mGraphics.Class1(GameScr.Class130, 0, this.Class171 * 3, 3, 3, 0, this.cx + 21, this.cy - 19, 0);
                                }
                                else if (this.statusMe == 2 || this.statusMe == 10) {
                                    Game2.Class1(mGraphics, array3[this.Class233], this.cx, this.cy - this.Class234, 0, 33);
                                    mGraphics.Class1(GameScr.Class130, 0, this.Class171 * 3, 3, 3, 0, this.cx + 21, array4[this.Class233], 0);
                                }
                                int n13 = 2;
                                if (this.Class15 == 1) {
                                    n13 = -2;
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx + n13, this.cy - 15, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + this.Class235 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 - this.Class236 - this.Class234 + this.Class230, 0, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx + n13, this.cy - 15, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class235 + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 9 - this.Class236 - this.Class234 + this.Class232, 0, 33);
                                }
                                this.Class14(mGraphics, this.cx + n13, this.cy - 15, 2);
                            }
                            else {
                                if (game102 != null) {
                                    Game2.Class1(mGraphics, game102.Class1[Char.Class127[this.Class62][3][0]].Class1, this.cx - Char.Class127[this.Class62][3][1] - game102.Class1[Char.Class127[this.Class62][3][0]].Class2, this.cy - Char.Class127[this.Class62][3][2] + game102.Class1[Char.Class127[this.Class62][3][0]].Class3 - 10, 2, 24);
                                }
                                if (this.statusMe == 3) {
                                    Game2.Class1(mGraphics, 2077, this.cx, this.cy, 2, 33);
                                    mGraphics.Class1(GameScr.Class130, 0, this.Class171 * 3, 3, 3, 0, this.cx - 23, this.cy - 30, 0);
                                }
                                else if (this.statusMe == 4) {
                                    Game2.Class1(mGraphics, 2076, this.cx, this.cy, 2, 33);
                                    mGraphics.Class1(GameScr.Class130, 0, this.Class171 * 3, 3, 3, 0, this.cx - 24, this.cy - 20, 0);
                                }
                                else if (this.statusMe == 1 || this.statusMe == 6) {
                                    Game2.Class1(mGraphics, (this.Class233 == 0) ? 2073 : 2072, this.cx, this.cy, 2, 33);
                                    mGraphics.Class1(GameScr.Class130, 0, this.Class171 * 3, 3, 3, 0, this.cx - 24, this.cy - 20, 0);
                                }
                                else if (this.statusMe == 2 || this.statusMe == 10) {
                                    Game2.Class1(mGraphics, array3[this.Class233], this.cx, this.cy - this.Class234, 2, 33);
                                    mGraphics.Class1(GameScr.Class130, 0, this.Class171 * 3, 3, 3, 0, this.cx - 24, array5[this.Class233], 0);
                                }
                                int n14 = 2;
                                if (this.Class15 == 1) {
                                    n14 = -2;
                                }
                                if (class9 != null) {
                                    this.Class13(mGraphics, this.cx + n14, this.cy - 15, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class59(), this.cx + this.Class235 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 - this.Class236 - this.Class234 + this.Class230, 2, 17);
                                }
                                if (class8 != null) {
                                    this.Class12(mGraphics, this.cx + n14, this.cy - 15, 2);
                                }
                                else {
                                    Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class235 + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 9 - this.Class236 - this.Class234 + this.Class232, 2, 33);
                                }
                                this.Class14(mGraphics, this.cx + n14, this.cy - 15, 2);
                            }
                        }
                        else if (this.Class15 == 1) {
                            if (game102 != null) {
                                Game2.Class1(mGraphics, game102.Class1[Char.Class127[this.Class62][3][0]].Class1, this.cx + Char.Class127[this.Class62][3][1] + game102.Class1[Char.Class127[this.Class62][3][0]].Class2, this.cy - Char.Class127[this.Class62][3][2] + game102.Class1[Char.Class127[this.Class62][3][0]].Class3 - 10, 0, 0);
                            }
                            if (this.statusMe == 3) {
                                Game2.Class1(mGraphics, 1716, this.cx, this.cy, 0, 33);
                            }
                            else if (this.statusMe == 4) {
                                Game2.Class1(mGraphics, 1717, this.cx, this.cy, 0, 33);
                            }
                            else if (this.statusMe == 1 || this.statusMe == 6) {
                                Game2.Class1(mGraphics, (this.Class233 == 0) ? 1712 : 1713, this.cx, this.cy, 0, 33);
                            }
                            else if (this.statusMe == 2 || this.statusMe == 10) {
                                Game2.Class1(mGraphics, this.Class237[this.Class233], this.cx, this.cy - this.Class234, 0, 33);
                            }
                            int n15 = 2;
                            if (this.Class15 == 1) {
                                n15 = -2;
                            }
                            if (class9 != null) {
                                this.Class13(mGraphics, this.cx + n15, this.cy - 14, 2);
                            }
                            else {
                                Game2.Class1(mGraphics, this.Class59(), this.cx + this.Class235 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 - this.Class236 - this.Class234 + this.Class230, 0, 17);
                            }
                            if (class8 != null) {
                                this.Class12(mGraphics, this.cx + n15, this.cy - 14, 2);
                            }
                            else {
                                Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class235 + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 9 - this.Class236 - this.Class234 + this.Class232, 0, 33);
                            }
                            this.Class14(mGraphics, this.cx + n15, this.cy - 14, 2);
                        }
                        else {
                            if (game102 != null) {
                                Game2.Class1(mGraphics, game102.Class1[Char.Class127[this.Class62][3][0]].Class1, this.cx - Char.Class127[this.Class62][3][1] - game102.Class1[Char.Class127[this.Class62][3][0]].Class2, this.cy - Char.Class127[this.Class62][3][2] + game102.Class1[Char.Class127[this.Class62][3][0]].Class3 - 10, 2, 24);
                            }
                            if (this.statusMe == 3) {
                                Game2.Class1(mGraphics, 1716, this.cx, this.cy, 2, 33);
                            }
                            else if (this.statusMe == 4) {
                                Game2.Class1(mGraphics, 1717, this.cx, this.cy, 2, 33);
                            }
                            else if (this.statusMe == 1 || this.statusMe == 6) {
                                Game2.Class1(mGraphics, (this.Class233 == 0) ? 1712 : 1713, this.cx, this.cy, 2, 33);
                            }
                            else if (this.statusMe == 2 || this.statusMe == 10) {
                                Game2.Class1(mGraphics, this.Class237[this.Class233], this.cx, this.cy - this.Class234, 2, 33);
                            }
                            int n16 = 2;
                            if (this.Class15 == 1) {
                                n16 = -2;
                            }
                            if (class9 != null) {
                                this.Class13(mGraphics, this.cx - n16, this.cy - 14, 2);
                            }
                            else {
                                Game2.Class1(mGraphics, this.Class59(), this.cx + this.Class235 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3 - 12 - this.Class236 - this.Class234 + this.Class230, 2, 17);
                            }
                            if (class8 != null) {
                                this.Class12(mGraphics, this.cx + n16, this.cy - 14, 2);
                            }
                            else {
                                Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class235 + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 9 - this.Class236 - this.Class234 + this.Class232, 2, 33);
                            }
                            this.Class14(mGraphics, this.cx + n16, this.cy - 14, 2);
                        }
                    }
                }
                else {
                    int n17 = 2;
                    int n18 = 24;
                    if (this.Class15 == 1) {
                        n17 = 0;
                        n18 = 0;
                    }
                    if (this.Class66) {
                        this.Class1(mGraphics, game102, game99, array);
                        this.Class5(mGraphics);
                        if (class5 != null) {
                            class5.Class2(mGraphics, this.cx, this.cy - this.Class56(), this.Class238, 0);
                        }
                        if (class4 != null) {
                            class4.Class2(mGraphics, this.cx, this.cy - this.Class56(), this.Class240, (this.Class15 == 1) ? 0 : 2);
                        }
                        if (class1 != null) {
                            this.Class2(mGraphics, this.cx, this.cy, class1);
                        }
                        return;
                    }
                    if (this.Class65) {
                        if (this.Class30()) {
                            this.Class7(mGraphics);
                        }
                        else if (!this.Class63 && !this.Class64) {
                            if (this.Class80[4].template.id == 485) {
                                if (this.Class80[4].Class8 <= 1) {
                                    Game2.Class1(mGraphics, 1800, this.Class173, this.Class174, 2, 33);
                                }
                                else {
                                    Game2.Class1(mGraphics, 2063, this.Class173, this.Class174, 2, 33);
                                }
                            }
                            else if (this.Class80[4].template.id == 524) {
                                if (this.Class80[4].Class8 <= 1) {
                                    Game2.Class1(mGraphics, 2067, this.Class173, this.Class174, 2, 33);
                                }
                                else {
                                    Game2.Class1(mGraphics, 2071, this.Class173, this.Class174, 2, 33);
                                }
                            }
                        }
                    }
                    if (array != null && class10 == null) {
                        Game2.Class1(mGraphics, array[this.Class107], this.cx + this.Class265 - 7 * this.Class15, this.cy - this.Class264 - 18, n17, 17);
                    }
                    if (game102 != null) {
                        Game2.Class1(mGraphics, game102.Class1[Char.Class127[this.Class62][3][0]].Class1, this.cx + this.Class265 + (Char.Class127[this.Class62][3][1] + game102.Class1[Char.Class127[this.Class62][3][0]].Class2) * this.Class15, this.cy - this.Class264 - Char.Class127[this.Class62][3][2] + game102.Class1[Char.Class127[this.Class62][3][0]].Class3, n17, n18);
                    }
                    if (class7 == null) {
                        if (class6 != null) {
                            class6.Class1(mGraphics, this.cx, this.cy, this.Class48(), (this.Class15 == 1) ? 0 : 2);
                            class6.Class2(mGraphics, this.cx, this.cy, this.Class48(), (this.Class15 == 1) ? 0 : 2);
                        }
                        else {
                            Game2.Class1(mGraphics, game100.Class1[Char.Class127[this.Class62][1][0]].Class1, this.cx + (Char.Class127[this.Class62][1][1] + game100.Class1[Char.Class127[this.Class62][1][0]].Class2) * this.Class15, this.cy - Char.Class127[this.Class62][1][2] + game100.Class1[Char.Class127[this.Class62][1][0]].Class3, n17, n18);
                        }
                    }
                    if (this.statusMe != 2) {
                        this.Class2(mGraphics, this.cx + 7 * this.Class15, this.cy - 2);
                    }
                    if (this.statusMe != 1 && this.statusMe != 6) {
                        if (class9 != null) {
                            class9.Class1(mGraphics, this.cx + this.Class265, this.cy - this.Class264, this.Class52(), (this.Class15 == 1) ? 0 : 2);
                            class9.Class2(mGraphics, this.cx + this.Class265, this.cy - this.Class264, this.Class52(), (this.Class15 == 1) ? 0 : 2);
                        }
                        else {
                            Game2.Class1(mGraphics, game99.Class1[Char.Class127[this.Class62][0][0]].Class1, this.cx + this.Class265 + (Char.Class127[this.Class62][0][1] + game99.Class1[Char.Class127[this.Class62][0][0]].Class2) * this.Class15, this.cy - this.Class264 - Char.Class127[this.Class62][0][2] + game99.Class1[Char.Class127[this.Class62][0][0]].Class3, n17, n18);
                        }
                    }
                    if (class8 != null) {
                        class8.Class1(mGraphics, this.cx + this.Class265, this.cy - this.Class264, this.Class51(), (this.Class15 == 1) ? 0 : 2);
                        class8.Class2(mGraphics, this.cx + this.Class265, this.cy - this.Class264, this.Class51(), (this.Class15 == 1) ? 0 : 2);
                    }
                    else {
                        Game2.Class1(mGraphics, game101.Class1[Char.Class127[this.Class62][2][0]].Class1, this.cx + this.Class265 + (Char.Class127[this.Class62][2][1] + game101.Class1[Char.Class127[this.Class62][2][0]].Class2) * this.Class15, this.cy - Char.Class127[this.Class62][2][2] + game101.Class1[Char.Class127[this.Class62][2][0]].Class3 - this.Class264, n17, n18);
                    }
                    if (this.statusMe == 1 || this.statusMe == 6) {
                        if (class9 != null) {
                            class9.Class1(mGraphics, this.cx + this.Class265, this.cy - this.Class264, this.Class52(), (this.Class15 == 1) ? 0 : 2);
                            class9.Class2(mGraphics, this.cx + this.Class265, this.cy - this.Class264, this.Class52(), (this.Class15 == 1) ? 0 : 2);
                        }
                        else {
                            Game2.Class1(mGraphics, game99.Class1[Char.Class127[this.Class62][0][0]].Class1, this.cx + this.Class265 + (Char.Class127[this.Class62][0][1] + game99.Class1[Char.Class127[this.Class62][0][0]].Class2) * this.Class15, this.cy - this.Class264 - Char.Class127[this.Class62][0][2] + game99.Class1[Char.Class127[this.Class62][0][0]].Class3, n17, n18);
                        }
                    }
                    if (class3 != null) {
                        class3.Class1(mGraphics, this.cx + this.Class265, this.cy - this.Class264, this.Class49(), (this.Class15 == 1) ? 0 : 2);
                        class3.Class2(mGraphics, this.cx + this.Class265, this.cy - this.Class264, this.Class49(), (this.Class15 == 1) ? 0 : 2);
                    }
                    if (this.statusMe == 2) {
                        this.Class4(mGraphics, this.cx - 14 * this.Class15, this.cy - 2);
                        this.Class3(mGraphics, this.cx + 7 * this.Class15, this.cy - 2);
                    }
                    else {
                        this.Class2(mGraphics, this.cx - 7 * this.Class15, this.cy - 2);
                        this.Class3(mGraphics, this.cx + 11 * this.Class15, this.cy - 2);
                    }
                }
                if (class7 != null) {
                    class7.Class2(mGraphics, this.cx, this.cy, this.Class46(), (this.Class15 == 1) ? 2 : 0);
                }
                this.Class5(mGraphics);
                if (class5 != null) {
                    class5.Class2(mGraphics, this.cx, this.cy - this.Class56(), this.Class238, 0);
                }
                if (class4 != null) {
                    class4.Class2(mGraphics, this.cx, this.cy - this.Class56(), this.Class240, (this.Class15 == 1) ? 0 : 2);
                }
                if (class1 != null) {
                    this.Class2(mGraphics, this.cx, this.cy, class1);
                }
            }
            if (this.Class136) {
                Game2.Class1(mGraphics, 290, this.cx, this.cy, 0, 33);
            }
        }
        catch (Exception ex) {}
    }
    
    private int Class57() {
        final Game94 game94;
        if ((game94 = (Game94)Game94.Class1.Class1(new StringBuffer(String.valueOf(this.leg)).toString())) != null) {
            return game94.Class11;
        }
        switch (this.leg) {
            case 0: {
                return 26;
            }
            case 4: {
                return 58;
            }
            case 6: {
                return 86;
            }
            case 8: {
                return 114;
            }
            case 9: {
                return 123;
            }
            case 17: {
                return 353;
            }
            case 19: {
                return 379;
            }
            case 21: {
                return 405;
            }
            case 30: {
                return 484;
            }
            case 33: {
                return 518;
            }
            case 35: {
                return 544;
            }
            case 37: {
                return 571;
            }
            case 39: {
                return 810;
            }
            case 43: {
                return 982;
            }
            case 95: {
                return 1156;
            }
            case 142: {
                return 1360;
            }
            case 155: {
                return 1494;
            }
            case 157: {
                return 1519;
            }
            default: {
                return 26;
            }
        }
    }
    
    private int Class58() {
        this.Class231 = 0;
        this.Class232 = 0;
        final Game99 game99 = GameScr.Class28[this.body];
        if (this.statusMe == 3) {
            final Game94 game100;
            final Game94 game101;
            if ((game100 = (Game94)Game94.Class4.Class1(new StringBuffer(String.valueOf(this.body)).toString())) != null && (game101 = (Game94)game100.Class7.Class1(new StringBuffer(String.valueOf(this.Class80[4].template.id)).toString())) != null) {
                this.Class231 = game101.Class9;
                this.Class232 = game101.Class10;
                if (game99 != null) {
                    return game99.Class1[this.Class266].Class1;
                }
                return game100.Class11;
            }
            else {
                switch (this.body) {
                    case 1: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -6;
                        }
                        return 13;
                    }
                    case 3: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -6;
                        }
                        return 45;
                    }
                    case 5: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 73;
                    }
                    case 7: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 101;
                    }
                    case 10: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 137;
                    }
                    case 18: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 365;
                    }
                    case 20: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 391;
                    }
                    case 22: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 417;
                    }
                    case 29: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -11;
                            this.Class232 = -6;
                        }
                        return 472;
                    }
                    case 32: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -11;
                            this.Class232 = -6;
                        }
                        return 506;
                    }
                    case 34: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 531;
                    }
                    case 36: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 559;
                    }
                    case 38: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 798;
                    }
                    case 42: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 970;
                    }
                    case 94: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -12;
                            this.Class232 = -7;
                        }
                        return 1142;
                    }
                    case 141: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 1348;
                    }
                    case 154: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -8;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -15;
                            this.Class232 = -3;
                        }
                        return 1487;
                    }
                    case 156: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -10;
                            this.Class232 = -7;
                        }
                        return 1507;
                    }
                    case 157: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 1812;
                    }
                    case 173: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 1838;
                    }
                    case 180: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 1959;
                    }
                    case 183: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 1987;
                    }
                    case 186: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -3;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -3;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -14;
                            this.Class232 = -5;
                        }
                        return 2117;
                    }
                    case 189: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -3;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -3;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -14;
                            this.Class232 = -5;
                        }
                        return 2144;
                    }
                    case 206: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -5;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -10;
                            this.Class232 = -6;
                        }
                        return 2459;
                    }
                    case 197: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -5;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -10;
                            this.Class232 = -6;
                        }
                        return 2342;
                    }
                    case 199: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -5;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -10;
                            this.Class232 = -6;
                        }
                        return 2373;
                    }
                    default: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -7;
                            this.Class232 = -6;
                        }
                        return 13;
                    }
                }
            }
        }
        else if (!this.Class185) {
            final Game94 game102;
            final Game94 game103;
            if ((game102 = (Game94)Game94.Class5.Class1(new StringBuffer(String.valueOf(this.body)).toString())) != null && (game103 = (Game94)game102.Class7.Class1(new StringBuffer(String.valueOf(this.Class80[4].template.id)).toString())) != null) {
                this.Class231 = game103.Class9;
                this.Class232 = game103.Class10;
                if (game99 != null) {
                    return game99.Class1[this.Class266].Class1;
                }
                return game102.Class11;
            }
            else {
                switch (this.body) {
                    case 1: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 2;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 2;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -5;
                            this.Class232 = -2;
                        }
                        return 9;
                    }
                    case 3: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -5;
                            this.Class232 = -3;
                        }
                        return 41;
                    }
                    case 5: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 70;
                    }
                    case 7: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 97;
                    }
                    case 10: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 133;
                    }
                    case 18: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 369;
                    }
                    case 20: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 395;
                    }
                    case 22: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 421;
                    }
                    case 29: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 468;
                    }
                    case 32: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 502;
                    }
                    case 34: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -5;
                            this.Class232 = -2;
                        }
                        return 540;
                    }
                    case 36: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -5;
                            this.Class232 = -2;
                        }
                        return 555;
                    }
                    case 38: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -5;
                            this.Class232 = -2;
                        }
                        return 794;
                    }
                    case 42: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -5;
                            this.Class232 = -2;
                        }
                        return 966;
                    }
                    case 94: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -5;
                            this.Class232 = -2;
                        }
                        return 1139;
                    }
                    case 141: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -2;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -2;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -7;
                            this.Class232 = -1;
                        }
                        return 1343;
                    }
                    case 154: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = 1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -3;
                            this.Class232 = -1;
                        }
                        return 1479;
                    }
                    case 156: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = 2;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        return 1502;
                    }
                    case 157: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 1808;
                    }
                    case 173: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 1834;
                    }
                    case 180: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 1955;
                    }
                    case 183: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        return 1983;
                    }
                    case 186: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -2;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -2;
                        }
                        return 2135;
                    }
                    case 189: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -2;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -2;
                        }
                        return 2135;
                    }
                    case 206: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -4;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -1;
                        }
                        return 2456;
                    }
                    case 197: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -4;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -5;
                            this.Class232 = -1;
                        }
                        return 2337;
                    }
                    case 199: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -4;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -5;
                            this.Class232 = -1;
                        }
                        return 2363;
                    }
                    default: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 2;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 2;
                            this.Class232 = -1;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -5;
                            this.Class232 = -2;
                        }
                        return 9;
                    }
                }
            }
        }
        else {
            final Game94 game104;
            final Game94 game105;
            if ((game104 = (Game94)Game94.Class6.Class1(new StringBuffer(String.valueOf(this.body)).toString())) != null && (game105 = (Game94)game104.Class7.Class1(new StringBuffer(String.valueOf(this.Class80[4].template.id)).toString())) != null) {
                this.Class231 = game105.Class9;
                this.Class232 = game105.Class10;
                if (game99 != null) {
                    return game99.Class1[this.Class266].Class1;
                }
                return game104.Class11;
            }
            else {
                switch (this.body) {
                    case 1: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -6;
                        }
                        return 13;
                    }
                    case 3: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -6;
                        }
                        return 45;
                    }
                    case 5: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 73;
                    }
                    case 7: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 101;
                    }
                    case 10: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 137;
                    }
                    case 18: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 365;
                    }
                    case 20: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 391;
                    }
                    case 22: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 417;
                    }
                    case 29: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -11;
                            this.Class232 = -6;
                        }
                        return 472;
                    }
                    case 32: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -11;
                            this.Class232 = -6;
                        }
                        return 506;
                    }
                    case 34: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 531;
                    }
                    case 36: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 559;
                    }
                    case 38: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 798;
                    }
                    case 42: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 970;
                    }
                    case 94: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 0;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 0;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -12;
                            this.Class232 = -7;
                        }
                        return 1142;
                    }
                    case 141: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -9;
                            this.Class232 = -7;
                        }
                        return 1348;
                    }
                    case 154: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -3;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -8;
                            this.Class232 = 0;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -15;
                            this.Class232 = -3;
                        }
                        return 1487;
                    }
                    case 156: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 1;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -4;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -10;
                            this.Class232 = -7;
                        }
                        return 1507;
                    }
                    case 157: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 1812;
                    }
                    case 173: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 1838;
                    }
                    case 180: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 1959;
                    }
                    case 183: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 4;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -8;
                            this.Class232 = -7;
                        }
                        return 1987;
                    }
                    case 186: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -3;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -3;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -14;
                            this.Class232 = -5;
                        }
                        return 2117;
                    }
                    case 189: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -3;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -3;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -6;
                            this.Class232 = -2;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -14;
                            this.Class232 = -5;
                        }
                        return 2144;
                    }
                    case 206: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -5;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -10;
                            this.Class232 = -6;
                        }
                        return 2459;
                    }
                    case 197: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -5;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -10;
                            this.Class232 = -6;
                        }
                        return 2342;
                    }
                    case 199: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = -1;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = -5;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -10;
                            this.Class232 = -6;
                        }
                        return 2373;
                    }
                    default: {
                        if (this.Class80[4].template.id == 443) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 523) {
                            this.Class231 = 3;
                            this.Class232 = -3;
                        }
                        else if (this.Class80[4].template.id == 485) {
                            this.Class231 = 0;
                            this.Class232 = -4;
                        }
                        else if (this.Class80[4].template.id == 524) {
                            this.Class231 = -7;
                            this.Class232 = -6;
                        }
                        return 13;
                    }
                }
            }
        }
    }
    
    private int Class59() {
        final int n = 0;
        this.Class230 = n;
        this.Class229 = n;
        final Game99 game99 = GameScr.Class28[this.head];
        if (this.statusMe == 3) {
            final Game94 game100;
            final Game94 game101;
            if ((game100 = (Game94)Game94.Class1.Class1(new StringBuffer(String.valueOf(this.head)).toString())) != null && (game101 = (Game94)game100.Class7.Class1(new StringBuffer(String.valueOf(this.Class80[4].template.id)).toString())) != null) {
                this.Class229 = game101.Class9;
                this.Class230 = game101.Class10;
                if (game99 != null) {
                    return game99.Class1[this.Class266].Class1;
                }
                return game100.Class11;
            }
            else {
                switch (this.head) {
                    case 2: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 33;
                    }
                    case 11: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 147;
                    }
                    case 23: {
                        this.Class229 = 1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 427;
                    }
                    case 24: {
                        this.Class229 = 1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 430;
                    }
                    case 25: {
                        this.Class229 = 3;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 433;
                    }
                    case 26: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 436;
                    }
                    case 27: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 439;
                    }
                    case 28: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 442;
                    }
                    case 112: {
                        this.Class229 = 1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 148;
                    }
                    case 113: {
                        this.Class229 = -1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 443;
                    }
                    case 124: {
                        this.Class229 = 1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1235;
                    }
                    case 125: {
                        this.Class229 = -1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1237;
                    }
                    case 126: {
                        this.Class229 = -1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1255;
                    }
                    case 127: {
                        this.Class229 = -1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1257;
                    }
                    case 137: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1309;
                    }
                    case 138: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1311;
                    }
                    case 139: {
                        this.Class229 = 2;
                        this.Class230 = -5;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1315;
                    }
                    case 140: {
                        this.Class229 = 3;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1313;
                    }
                    case 146: {
                        this.Class229 = 1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1416;
                    }
                    case 147: {
                        this.Class229 = -2;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1418;
                    }
                    case 148: {
                        this.Class229 = 0;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1422;
                    }
                    case 149: {
                        this.Class229 = -2;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1424;
                    }
                    case 150: {
                        this.Class229 = 0;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1441;
                    }
                    case 151: {
                        this.Class229 = -2;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1439;
                    }
                    case 152: {
                        this.Class229 = 1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1447;
                    }
                    case 153: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1445;
                    }
                    case 158: {
                        this.Class229 = -2;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1585;
                    }
                    case 159: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1589;
                    }
                    case 160: {
                        this.Class229 = 2;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1587;
                    }
                    case 161: {
                        this.Class229 = 3;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1595;
                    }
                    case 162: {
                        this.Class229 = -5;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1597;
                    }
                    case 163: {
                        this.Class229 = -3;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1604;
                    }
                    case 179: {
                        this.Class229 = 3;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1978;
                    }
                    case 182: {
                        this.Class229 = 3;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2006;
                    }
                    case 185: {
                        this.Class229 = -4;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2129;
                    }
                    case 188: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2156;
                    }
                    case 205: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2451;
                    }
                    case 210: {
                        this.Class229 = 0;
                        this.Class230 = -5;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2519;
                    }
                    case 211: {
                        this.Class229 = -1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2521;
                    }
                    case 212: {
                        this.Class229 = -2;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2523;
                    }
                    case 213: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2525;
                    }
                    case 214: {
                        this.Class229 = 1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2526;
                    }
                    default: {
                        this.Class229 = 2;
                        this.Class230 = -5;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 33;
                    }
                }
            }
        }
        else if (!this.Class185) {
            final Game94 game102;
            final Game94 game103;
            if ((game102 = (Game94)Game94.Class2.Class1(new StringBuffer(String.valueOf(this.head)).toString())) != null && (game103 = (Game94)game102.Class7.Class1(new StringBuffer(String.valueOf(this.Class80[4].template.id)).toString())) != null) {
                this.Class229 = game103.Class9;
                this.Class230 = game103.Class10;
                if (game99 != null) {
                    return game99.Class1[this.Class266].Class1;
                }
                return game102.Class11;
            }
            else {
                switch (this.head) {
                    case 2: {
                        this.Class229 = -1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 33;
                    }
                    case 11: {
                        this.Class229 = -2;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 147;
                    }
                    case 23: {
                        this.Class229 = -1;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 427;
                    }
                    case 24: {
                        this.Class229 = -1;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 430;
                    }
                    case 25: {
                        this.Class229 = 1;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 433;
                    }
                    case 26: {
                        this.Class229 = -2;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 436;
                    }
                    case 27: {
                        this.Class229 = -2;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 439;
                    }
                    case 28: {
                        this.Class229 = -2;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 442;
                    }
                    case 112: {
                        this.Class229 = -1;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 148;
                    }
                    case 113: {
                        this.Class229 = -3;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 443;
                    }
                    case 124: {
                        this.Class229 = -1;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1235;
                    }
                    case 125: {
                        this.Class229 = -1;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1237;
                    }
                    case 126: {
                        this.Class229 = -1;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1255;
                    }
                    case 127: {
                        this.Class229 = -3;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1257;
                    }
                    case 137: {
                        this.Class229 = -2;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1309;
                    }
                    case 138: {
                        this.Class229 = -2;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1311;
                    }
                    case 139: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1315;
                    }
                    case 140: {
                        this.Class229 = 1;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1313;
                    }
                    case 146: {
                        this.Class229 = -1;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1416;
                    }
                    case 147: {
                        this.Class229 = -4;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1418;
                    }
                    case 148: {
                        this.Class229 = -2;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1422;
                    }
                    case 149: {
                        this.Class229 = -4;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1424;
                    }
                    case 150: {
                        this.Class229 = -2;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1441;
                    }
                    case 151: {
                        this.Class229 = -4;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1439;
                    }
                    case 152: {
                        this.Class229 = -1;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1447;
                    }
                    case 153: {
                        this.Class229 = -2;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1445;
                    }
                    case 158: {
                        this.Class229 = -4;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1585;
                    }
                    case 159: {
                        this.Class229 = -2;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1589;
                    }
                    case 160: {
                        this.Class229 = 0;
                        this.Class230 = 0;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1587;
                    }
                    case 161: {
                        this.Class229 = 1;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1595;
                    }
                    case 162: {
                        this.Class229 = -7;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1597;
                    }
                    case 163: {
                        this.Class229 = -5;
                        this.Class230 = 0;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1604;
                    }
                    case 179: {
                        this.Class229 = 1;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 1978;
                    }
                    case 182: {
                        this.Class229 = 1;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 2006;
                    }
                    case 185: {
                        this.Class229 = -6;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 2129;
                    }
                    case 188: {
                        this.Class229 = -2;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 2156;
                    }
                    case 205: {
                        this.Class229 = -2;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 2451;
                    }
                    case 210: {
                        this.Class229 = -2;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 2519;
                    }
                    case 211: {
                        this.Class229 = -3;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 2521;
                    }
                    case 212: {
                        this.Class229 = -4;
                        this.Class230 = 0;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 2523;
                    }
                    case 213: {
                        this.Class229 = 0;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 2525;
                    }
                    case 214: {
                        this.Class229 = -1;
                        this.Class230 = -1;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 2526;
                    }
                    default: {
                        this.Class229 = -1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 5;
                                --this.Class230;
                            }
                        }
                        return 33;
                    }
                }
            }
        }
        else {
            final Game94 game104;
            final Game94 game105;
            if ((game104 = (Game94)Game94.Class3.Class1(new StringBuffer(String.valueOf(this.head)).toString())) != null && (game105 = (Game94)game104.Class7.Class1(new StringBuffer(String.valueOf(this.Class80[4].template.id)).toString())) != null) {
                this.Class229 = game105.Class9;
                this.Class230 = game105.Class10;
                if (game99 != null) {
                    return game99.Class1[this.Class266].Class1;
                }
                return game104.Class11;
            }
            else {
                switch (this.head) {
                    case 2: {
                        this.Class229 = 2;
                        this.Class230 = -5;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 33;
                    }
                    case 11: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 147;
                    }
                    case 23: {
                        this.Class229 = 1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 427;
                    }
                    case 24: {
                        this.Class229 = 1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 430;
                    }
                    case 25: {
                        this.Class229 = 3;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 433;
                    }
                    case 26: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 436;
                    }
                    case 27: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 439;
                    }
                    case 28: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 442;
                    }
                    case 112: {
                        this.Class229 = 1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 148;
                    }
                    case 113: {
                        this.Class229 = -1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 443;
                    }
                    case 124: {
                        this.Class229 = 1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1235;
                    }
                    case 125: {
                        this.Class229 = -1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1237;
                    }
                    case 126: {
                        this.Class229 = -1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1255;
                    }
                    case 127: {
                        this.Class229 = -1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1257;
                    }
                    case 137: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1309;
                    }
                    case 138: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1311;
                    }
                    case 139: {
                        this.Class229 = 2;
                        this.Class230 = -5;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1315;
                    }
                    case 140: {
                        this.Class229 = 3;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1313;
                    }
                    case 146: {
                        this.Class229 = 1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1416;
                    }
                    case 147: {
                        this.Class229 = -2;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1418;
                    }
                    case 148: {
                        this.Class229 = 0;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1422;
                    }
                    case 149: {
                        this.Class229 = -2;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1424;
                    }
                    case 150: {
                        this.Class229 = 0;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1441;
                    }
                    case 151: {
                        this.Class229 = -2;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1439;
                    }
                    case 152: {
                        this.Class229 = 1;
                        this.Class230 = -4;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1447;
                    }
                    case 153: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1445;
                    }
                    case 158: {
                        this.Class229 = -2;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1585;
                    }
                    case 159: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1589;
                    }
                    case 160: {
                        this.Class229 = 2;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1587;
                    }
                    case 161: {
                        this.Class229 = 3;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1595;
                    }
                    case 162: {
                        this.Class229 = -5;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1597;
                    }
                    case 163: {
                        this.Class229 = -3;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1604;
                    }
                    case 179: {
                        this.Class229 = 3;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 1978;
                    }
                    case 182: {
                        this.Class229 = 3;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2006;
                    }
                    case 185: {
                        this.Class229 = -4;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2129;
                    }
                    case 188: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2156;
                    }
                    case 205: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2451;
                    }
                    case 210: {
                        this.Class229 = 0;
                        this.Class230 = -5;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2519;
                    }
                    case 211: {
                        this.Class229 = -1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2521;
                    }
                    case 212: {
                        this.Class229 = -2;
                        this.Class230 = -2;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2523;
                    }
                    case 213: {
                        this.Class229 = 0;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2525;
                    }
                    case 214: {
                        this.Class229 = 1;
                        this.Class230 = -3;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 2526;
                    }
                    default: {
                        this.Class229 = 2;
                        this.Class230 = -5;
                        if (this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523) {
                            if (this.Class80[4].template.id == 485) {
                                this.Class229 -= 2;
                                ++this.Class230;
                            }
                            else if (this.Class80[4].template.id == 524) {
                                this.Class229 -= 7;
                                --this.Class230;
                            }
                        }
                        return 33;
                    }
                }
            }
        }
    }
    
    private int[] Class60() {
        if (this.statusMe != 6 && this.statusMe != 1 && this.statusMe != 2 && this.statusMe != 10 && this.statusMe != 11) {
            return null;
        }
        int[] array = null;
        if (this.Class61) {
            if (this.arrItemBody[13] != null) {
                if (this.arrItemBody[13].template.id == 425) {
                    array = new int[] { 1687, 1688, 1689, 1690, 1691 };
                }
                else if (this.arrItemBody[13].template.id == 426) {
                    array = new int[] { 1682, 1683, 1684, 1685, 1686 };
                }
                else if (this.arrItemBody[13].template.id == 427) {
                    array = new int[] { 1677, 1678, 1679, 1680, 1681 };
                }
            }
        }
        else {
            if (this.Class146 == -1) {
                return null;
            }
            if (this.Class146 == 425) {
                array = new int[] { 1687, 1688, 1689, 1690, 1691 };
            }
            else if (this.Class146 == 426) {
                array = new int[] { 1682, 1683, 1684, 1685, 1686 };
            }
            else if (this.Class146 == 427) {
                array = new int[] { 1677, 1678, 1679, 1680, 1681 };
            }
        }
        return array;
    }
    
    public final void Class2(final mGraphics mGraphics, final int n, final int n2) {
        final int[] class60;
        if ((class60 = this.Class60()) == null) {
            return;
        }
        final int n3;
        if ((n3 = GameCanvas.gameTick % 13) > 9) {
            Game2.Class1(mGraphics, class60[0], n, n2, 0, 33);
            return;
        }
        if (n3 > 6) {
            Game2.Class1(mGraphics, class60[1], n, n2 + 2, 0, 33);
            return;
        }
        if (n3 > 3) {
            Game2.Class1(mGraphics, class60[2], n - 2, n2 + 1, 0, 33);
            return;
        }
        Game2.Class1(mGraphics, class60[3], n - 2, n2, 0, 33);
    }
    
    private void Class4(final mGraphics mGraphics, final int n, final int n2) {
        final int[] class60;
        if ((class60 = this.Class60()) == null) {
            return;
        }
        final int n3 = (this.Class15 == 1) ? 6 : 5;
        final int n4 = (this.Class15 == -1) ? 40 : 36;
        final int n5;
        if ((n5 = GameCanvas.gameTick % 13) > 9) {
            Game2.Class1(mGraphics, class60[0], n, n2, n3, n4);
            return;
        }
        if (n5 > 6) {
            Game2.Class1(mGraphics, class60[1], n, n2, n3, n4);
            return;
        }
        if (n5 > 3) {
            Game2.Class1(mGraphics, class60[2], n, n2, n3, n4);
            return;
        }
        Game2.Class1(mGraphics, class60[3], n, n2, n3, n4);
    }
    
    public final void Class3(final mGraphics mGraphics, final int n, final int n2) {
        final int[] class60;
        if ((class60 = this.Class60()) == null) {
            return;
        }
        Game2.Class1(mGraphics, class60[4], n - 2, n2, 0, 33);
    }
    
    private void Class14(final int n) {
        this.Class209 = 0;
        this.Class210 = GameScr.efs[n];
    }
    
    public final void Class10(final int n) {
        this.Class147 = 0;
        this.Class148 = GameScr.efs[n];
    }
    
    public static int Class11(final int n) {
        for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
            if (((Char)GameScr.vCharInMap.elementAt(i)).charID == n) {
                return i;
            }
        }
        return -1;
    }
    
    public final void Class1(int n, int n2) {
        int n3 = 0;
        n -= this.cx;
        n2 -= this.cy;
        if (n == 0 && n2 == 0) {
            n3 = 1;
        }
        else if (n2 == 0) {
            n3 = 2;
            if (this.Class132.size() > 0) {
                Game58 game58 = null;
                try {
                    game58 = this.Class132.lastElement();
                }
                catch (Exception ex) {}
                if (game58 != null && TileMap.tileTypeAt(game58.Class1, game58.Class2, 64) && game58.Class2 % TileMap.Class9 > 8) {
                    n3 = 10;
                }
            }
            if (n < 0) {}
        }
        else if (n2 != 0) {
            if (n2 < 0) {
                n3 = 3;
            }
            if (n2 > 0) {
                n3 = 4;
            }
        }
        final int n4 = this.cx + n;
        n = this.cy + n2;
        this.Class132.addElement(new Game58(n4, n, n3));
        this.statusMe = 6;
    }
    
    private void Class61() {
        if (this.charFocus != null && this.charFocus.Class3) {
            this.charFocus = null;
        }
        if (Char.Class165 && this.charFocus != null && (this.charFocus.statusMe == 15 || this.charFocus.Class108)) {
            this.charFocus = null;
        }
        if (GameCanvas.gameTick % 2 == 0) {
            return;
        }
        if (Class2(this.charFocus)) {
            return;
        }
        int n = 0;
        if (this.nClass.classId == 0 || this.nClass.classId == 1 || this.nClass.classId == 3 || this.nClass.classId == 5) {
            if (GameScr.Class154 != 1) {
                n = 40;
            }
            else {
                n = 0;
            }
        }
        final int[] array = { -1, -1, -1, -1 };
        final int n2 = GameScr.Class16 - 10;
        final int n3 = GameScr.Class16 + GameCanvas.Class25 + 10;
        final int class17 = GameScr.Class17;
        final int n4 = GameScr.Class17 + GameCanvas.Class26 - GameScr.Class14 + 10;
        if (Char.Class165) {
            if ((this.mobFocus != null && this.mobFocus.status != 1 && this.mobFocus.status != 8 && this.mobFocus.status != 0 && n2 <= this.mobFocus.x && this.mobFocus.x <= n3 && class17 <= this.mobFocus.y && this.mobFocus.y <= n4) || (this.npcFocus != null && n2 <= this.npcFocus.cx && this.npcFocus.cx <= n3 && class17 <= this.npcFocus.cy && this.npcFocus.cy <= n4) || (this.charFocus != null && n2 <= this.charFocus.cx && this.charFocus.cx <= n3 && class17 <= this.charFocus.cy && this.charFocus.cy <= n4) || (this.itemFocus != null && n2 <= this.itemFocus.x && this.itemFocus.x <= n3 && class17 <= this.itemFocus.y && this.itemFocus.y <= n4)) {
                return;
            }
            Char.Class165 = false;
        }
        if (this.itemFocus == null) {
            for (int i = 0; i < GameScr.vItemMap.size(); ++i) {
                final ItemMap itemFocus = (ItemMap)GameScr.vItemMap.elementAt(i);
                final int abs = Math.abs(getMyChar().cx - itemFocus.x);
                final int abs2 = Math.abs(getMyChar().cy - itemFocus.y);
                final int n5 = (abs > abs2) ? abs : abs2;
                if (abs <= 48 && abs2 <= 48 && (this.itemFocus == null || n5 < array[3])) {
                    GameScr.gI();
                    if (GameScr.Class154 != 0) {
                        GameScr.gI();
                        if (GameScr.Class9()) {
                            if (itemFocus.template.type == 19) {
                                if (GameScr.Class150) {
                                    this.itemFocus = null;
                                }
                                else {
                                    this.itemFocus = itemFocus;
                                }
                                array[3] = n5;
                            }
                            continue;
                        }
                    }
                    if (Char.isAPickYen || Char.Class114 || Char.Class115 || Char.Class116) {
                        if ((Char.isAPickYen && itemFocus.template.type == 19) || (Char.Class114 && (itemFocus.template.type == 19 || itemFocus.template.type == 16 || itemFocus.template.type == 17)) || (Char.Class115 && (itemFocus.template.type == 19 || itemFocus.template.type == 16 || itemFocus.template.type == 17 || itemFocus.template.type == 26))) {
                            if (GameScr.Class150) {
                                this.itemFocus = null;
                            }
                            else {
                                this.itemFocus = itemFocus;
                            }
                            array[3] = n5;
                        }
                    }
                    else {
                        if (GameScr.Class150) {
                            this.itemFocus = null;
                        }
                        else {
                            this.itemFocus = itemFocus;
                        }
                        array[3] = n5;
                    }
                }
            }
        }
        else {
            if (n2 <= this.itemFocus.x && this.itemFocus.x <= n3 && class17 <= this.itemFocus.y && this.itemFocus.y <= n4) {
                this.Class15(3);
                return;
            }
            this.itemFocus = null;
            for (int j = 0; j < GameScr.vItemMap.size(); ++j) {
                final ItemMap itemFocus2 = (ItemMap)GameScr.vItemMap.elementAt(j);
                final int abs3 = Math.abs(getMyChar().cx - itemFocus2.x);
                final int abs4 = Math.abs(getMyChar().cy - itemFocus2.y);
                final int n6 = (abs3 > abs4) ? abs3 : abs4;
                if (n2 <= itemFocus2.x && itemFocus2.x <= n3 && class17 <= itemFocus2.y && itemFocus2.y <= n4 && (this.itemFocus == null || n6 < array[3])) {
                    GameScr.gI();
                    if (GameScr.Class154 != 0) {
                        GameScr.gI();
                        if (GameScr.Class9()) {
                            if (itemFocus2.template.type == 19) {
                                if (GameScr.Class150) {
                                    this.itemFocus = null;
                                }
                                else {
                                    this.itemFocus = itemFocus2;
                                }
                                array[3] = n6;
                            }
                            continue;
                        }
                    }
                    if (Char.isAPickYen || Char.Class114 || Char.Class115 || Char.Class116) {
                        if ((Char.isAPickYen && itemFocus2.template.type == 19) || (Char.Class114 && (itemFocus2.template.type == 19 || itemFocus2.template.type == 16 || itemFocus2.template.type == 17)) || (Char.Class115 && (itemFocus2.template.type == 19 || itemFocus2.template.type == 16 || itemFocus2.template.type == 17 || itemFocus2.template.type == 26))) {
                            if (GameScr.Class150) {
                                this.itemFocus = null;
                            }
                            else {
                                this.itemFocus = itemFocus2;
                            }
                            array[3] = n6;
                        }
                    }
                    else {
                        if (GameScr.Class150) {
                            this.itemFocus = null;
                        }
                        else {
                            this.itemFocus = itemFocus2;
                        }
                        array[3] = n6;
                    }
                }
            }
        }
        int n37;
        if (TileMap.Class14 == 3 || TileMap.mapID == 111) {
            final int n7 = getMyChar().cx - getMyChar().getdxSkill();
            final int n8 = getMyChar().cx + getMyChar().getdxSkill();
            final int n9 = getMyChar().cy - getMyChar().getdySkill() - n;
            int n10;
            if ((n10 = getMyChar().cy + getMyChar().getdySkill()) > getMyChar().cy + 30) {
                n10 = getMyChar().cy + 30;
            }
            if (this.mobFocus == null) {
                for (int k = 0; k < GameScr.vMob.size(); ++k) {
                    final Mob mobFocus = (Mob)GameScr.vMob.elementAt(k);
                    final int abs5 = Math.abs(getMyChar().cx - mobFocus.x);
                    final int abs6 = Math.abs(getMyChar().cy - mobFocus.y);
                    final int n11 = (abs5 > abs6) ? abs5 : abs6;
                    if ((mobFocus.templateId != 97 || getMyChar().cTypePk != 4) && (mobFocus.templateId != 96 || getMyChar().cTypePk != 5) && (mobFocus.templateId != 98 || getMyChar().cTypePk != 4) && (mobFocus.templateId != 167 || getMyChar().cTypePk != 4) && (mobFocus.templateId != 99 || getMyChar().cTypePk != 5) && (mobFocus.templateId != 166 || getMyChar().cTypePk != 5) && (mobFocus.templateId != 200 || getMyChar().cTypePk != 4) && (mobFocus.templateId != 199 || getMyChar().cTypePk != 5) && (mobFocus.templateId != 198 || getMyChar().cTypePk != 6) && (mobFocus.templateId != 202 || mobFocus.status != 8 || mobFocus.Class3()) && (!GameScr.Class150 || mobFocus.levelBoss != 3) && n7 <= mobFocus.x && mobFocus.x <= n8 && n9 <= mobFocus.y && mobFocus.y <= n10 && mobFocus.status != 0 && mobFocus.status != 1 && (this.mobFocus == null || n11 < array[0])) {
                        this.mobFocus = mobFocus;
                        array[0] = n11;
                    }
                }
            }
            else {
                if (this.mobFocus.status != 1 && this.mobFocus.status != 0 && n7 <= this.mobFocus.x && this.mobFocus.x <= n8 && n9 <= this.mobFocus.y && this.mobFocus.y <= n10) {
                    this.Class15(0);
                    return;
                }
                this.mobFocus = null;
                for (int l = 0; l < GameScr.vMob.size(); ++l) {
                    final Mob mobFocus2 = (Mob)GameScr.vMob.elementAt(l);
                    final int abs7 = Math.abs(getMyChar().cx - mobFocus2.x);
                    final int abs8 = Math.abs(getMyChar().cy - mobFocus2.y);
                    final int n12 = (abs7 > abs8) ? abs7 : abs8;
                    if ((mobFocus2.templateId != 97 || getMyChar().cTypePk != 4) && (mobFocus2.templateId != 96 || getMyChar().cTypePk != 5) && (mobFocus2.templateId != 98 || getMyChar().cTypePk != 4) && (mobFocus2.templateId != 167 || getMyChar().cTypePk != 4) && (mobFocus2.templateId != 99 || getMyChar().cTypePk != 5) && (mobFocus2.templateId != 166 || getMyChar().cTypePk != 5) && (mobFocus2.templateId != 200 || getMyChar().cTypePk != 4) && (mobFocus2.templateId != 199 || getMyChar().cTypePk != 5) && (mobFocus2.templateId != 198 || getMyChar().cTypePk != 6) && (mobFocus2.templateId != 202 || mobFocus2.status != 8 || mobFocus2.Class3()) && (!GameScr.Class150 || mobFocus2.levelBoss != 3) && n7 <= mobFocus2.x && mobFocus2.x <= n8 && n9 <= mobFocus2.y && mobFocus2.y <= n10 && mobFocus2.status != 0 && mobFocus2.status != 1 && (this.mobFocus == null || n12 < array[0])) {
                        this.mobFocus = mobFocus2;
                        array[0] = n12;
                    }
                }
            }
            int n13 = getMyChar().cx - 80;
            int n14 = getMyChar().cx + 80;
            int n15 = getMyChar().cy - 30;
            int n16 = getMyChar().cy + 30;
            if (this.npcFocus != null && this.npcFocus.template.npcTemplateId == 13) {
                n13 = getMyChar().cx - 20;
                n14 = getMyChar().cx + 20;
                n15 = getMyChar().cy - 10;
                n16 = getMyChar().cy + 10;
            }
            if (this.npcFocus == null) {
                for (int n17 = 0; n17 < GameScr.vNpc.size(); ++n17) {
                    final Npc npcFocus;
                    if ((npcFocus = (Npc)GameScr.vNpc.elementAt(n17)).statusMe != 15) {
                        final int abs9 = Math.abs(getMyChar().cx - npcFocus.cx);
                        final int abs10 = Math.abs(getMyChar().cy - npcFocus.cy);
                        final int n18 = (abs9 > abs10) ? abs9 : abs10;
                        int n19 = getMyChar().cx - 80;
                        int n20 = getMyChar().cx + 80;
                        int n21 = getMyChar().cy - 30;
                        int n22 = getMyChar().cy + 30;
                        if (npcFocus.template.npcTemplateId == 13) {
                            n19 = getMyChar().cx - 20;
                            n20 = getMyChar().cx + 20;
                            n21 = getMyChar().cy - 10;
                            n22 = getMyChar().cy + 10;
                        }
                        if (n19 <= npcFocus.cx && npcFocus.cx <= n20 && n21 <= npcFocus.cy && npcFocus.cy <= n22 && (this.npcFocus == null || n18 < array[1])) {
                            if (GameScr.Class150 && GameScr.Class154 == 1) {
                                break;
                            }
                            this.npcFocus = npcFocus;
                            array[1] = n18;
                        }
                    }
                }
            }
            else {
                if (n13 <= this.npcFocus.cx && this.npcFocus.cx <= n14 && n15 <= this.npcFocus.cy && this.npcFocus.cy <= n16) {
                    this.Class15(1);
                    return;
                }
                this.Class22();
                for (int n23 = 0; n23 < GameScr.vNpc.size(); ++n23) {
                    final Npc npcFocus2;
                    if ((npcFocus2 = (Npc)GameScr.vNpc.elementAt(n23)).statusMe != 15) {
                        final int abs11 = Math.abs(getMyChar().cx - npcFocus2.cx);
                        final int abs12 = Math.abs(getMyChar().cy - npcFocus2.cy);
                        final int n24 = (abs11 > abs12) ? abs11 : abs12;
                        int n25 = getMyChar().cx - 80;
                        int n26 = getMyChar().cx + 80;
                        int n27 = getMyChar().cy - 30;
                        int n28 = getMyChar().cy + 30;
                        if (npcFocus2.template.npcTemplateId == 13) {
                            n25 = getMyChar().cx - 20;
                            n26 = getMyChar().cx + 20;
                            n27 = getMyChar().cy - 10;
                            n28 = getMyChar().cy + 10;
                        }
                        if (n25 <= npcFocus2.cx && npcFocus2.cx <= n26 && n27 <= npcFocus2.cy && npcFocus2.cy <= n28 && (this.npcFocus == null || n24 < array[1])) {
                            if (GameScr.Class150 && GameScr.Class154 == 1) {
                                break;
                            }
                            this.npcFocus = npcFocus2;
                            array[1] = n24;
                        }
                    }
                }
            }
            final int n29 = getMyChar().cx - 40;
            final int n30 = getMyChar().cx + 40;
            final int n31 = getMyChar().cy - 30;
            final int n32 = getMyChar().cy + 30;
            if (this.charFocus == null) {
                for (int n33 = 0; n33 < GameScr.vCharInMap.size(); ++n33) {
                    final Char charFocus;
                    if (!(charFocus = (Char)GameScr.vCharInMap.elementAt(n33)).Class3) {
                        if (TileMap.mapID != 111) {
                            if (charFocus.statusMe == 15 || charFocus.Class108 || charFocus.cTypePk == Char.myChar.cTypePk || this.Class166 != 0 || this.Class167 != 0 || charFocus.statusMe == 14) {
                                continue;
                            }
                            if (charFocus.statusMe == 5) {
                                continue;
                            }
                        }
                        else {
                            if (charFocus.statusMe == 15 || charFocus.Class108 || this.Class166 != 0 || this.Class167 != 0) {
                                continue;
                            }
                            if (Char.myChar.nClass.classId == 6) {
                                if (Char.myChar.cTypePk == charFocus.cTypePk) {
                                    if (charFocus.statusMe != 14) {
                                        continue;
                                    }
                                    if (charFocus.statusMe != 5) {
                                        continue;
                                    }
                                }
                                else {
                                    if (charFocus.statusMe == 14) {
                                        continue;
                                    }
                                    if (charFocus.statusMe == 5) {
                                        continue;
                                    }
                                }
                            }
                            else if (Char.myChar.cTypePk == charFocus.cTypePk || charFocus.statusMe == 14 || charFocus.statusMe == 5) {
                                continue;
                            }
                        }
                        final int abs13 = Math.abs(getMyChar().cx - charFocus.cx);
                        final int abs14 = Math.abs(getMyChar().cy - charFocus.cy);
                        final int n34 = (abs13 > abs14) ? abs13 : abs14;
                        if (n29 <= charFocus.cx && charFocus.cx <= n30 && n31 <= charFocus.cy && charFocus.cy <= n32 && (this.charFocus == null || n34 < array[2])) {
                            this.charFocus = charFocus;
                            array[2] = n34;
                        }
                    }
                }
            }
            else {
                if (n29 <= this.charFocus.cx && this.charFocus.cx <= n30 && n31 <= this.charFocus.cy && this.charFocus.cy <= n32 && this.charFocus.statusMe != 15 && !this.charFocus.Class108 && this.charFocus.statusMe != 14 && this.charFocus.statusMe != 5) {
                    this.Class15(2);
                    return;
                }
                this.charFocus = null;
                for (int n35 = 0; n35 < GameScr.vCharInMap.size(); ++n35) {
                    final Char charFocus2;
                    if (!(charFocus2 = (Char)GameScr.vCharInMap.elementAt(n35)).Class3) {
                        if (TileMap.mapID != 111) {
                            if (charFocus2.statusMe == 15 || charFocus2.Class108 || charFocus2.cTypePk == Char.myChar.cTypePk || this.Class166 != 0 || this.Class167 != 0 || charFocus2.statusMe == 14) {
                                continue;
                            }
                            if (charFocus2.statusMe == 5) {
                                continue;
                            }
                        }
                        else {
                            if (charFocus2.statusMe == 15 || charFocus2.Class108 || this.Class166 != 0 || this.Class167 != 0) {
                                continue;
                            }
                            if (Char.myChar.nClass.classId == 6) {
                                if (Char.myChar.cTypePk == charFocus2.cTypePk) {
                                    if (charFocus2.statusMe != 14) {
                                        continue;
                                    }
                                    if (charFocus2.statusMe != 5) {
                                        continue;
                                    }
                                }
                                else {
                                    if (charFocus2.statusMe == 14) {
                                        continue;
                                    }
                                    if (charFocus2.statusMe == 5) {
                                        continue;
                                    }
                                }
                            }
                            else if (Char.myChar.cTypePk == charFocus2.cTypePk || charFocus2.statusMe == 14 || charFocus2.statusMe == 5) {
                                continue;
                            }
                        }
                        final int abs15 = Math.abs(getMyChar().cx - charFocus2.cx);
                        final int abs16 = Math.abs(getMyChar().cy - charFocus2.cy);
                        final int n36 = (abs15 > abs16) ? abs15 : abs16;
                        if (n29 <= charFocus2.cx && charFocus2.cx <= n30 && n31 <= charFocus2.cy && charFocus2.cy <= n32 && (this.charFocus == null || n36 < array[2])) {
                            this.charFocus = charFocus2;
                            array[2] = n36;
                        }
                    }
                }
            }
            n37 = -1;
            for (int n38 = 0; n38 < 4; ++n38) {
                if (n37 == -1) {
                    if (array[n38] != -1) {
                        n37 = n38;
                    }
                }
                else if (array[n38] < array[n37] && array[n38] != -1) {
                    n37 = n38;
                }
            }
        }
        else {
            final int n39 = getMyChar().cx - getMyChar().getdxSkill() - 10;
            final int n40 = getMyChar().cx + getMyChar().getdxSkill() + 10;
            final int n41 = getMyChar().cy - getMyChar().getdySkill() - n;
            int n42;
            if ((n42 = getMyChar().cy + getMyChar().getdySkill()) > getMyChar().cy + 30) {
                n42 = getMyChar().cy + 30;
            }
            if (this.mobFocus == null) {
                for (int n43 = 0; n43 < GameScr.vMob.size(); ++n43) {
                    final Mob mobFocus3 = (Mob)GameScr.vMob.elementAt(n43);
                    final int abs17 = Math.abs(getMyChar().cx - mobFocus3.x);
                    final int abs18 = Math.abs(getMyChar().cy - mobFocus3.y);
                    final int n44 = (abs17 > abs18) ? abs17 : abs18;
                    if ((mobFocus3.templateId != 97 || getMyChar().cTypePk != 4) && (mobFocus3.templateId != 98 || getMyChar().cTypePk != 4) && (mobFocus3.templateId != 167 || getMyChar().cTypePk != 4) && (mobFocus3.templateId != 99 || getMyChar().cTypePk != 5) && (mobFocus3.templateId != 96 || getMyChar().cTypePk != 5) && (mobFocus3.templateId != 166 || getMyChar().cTypePk != 5) && (mobFocus3.templateId != 200 || getMyChar().cTypePk != 4) && (mobFocus3.templateId != 199 || getMyChar().cTypePk != 5) && (mobFocus3.templateId != 198 || getMyChar().cTypePk != 6) && (mobFocus3.templateId != 202 || mobFocus3.status != 8 || mobFocus3.Class3()) && (!GameScr.Class150 || mobFocus3.levelBoss != 3) && mobFocus3.templateId != 202 && n39 <= mobFocus3.x && mobFocus3.x <= n40 && n41 <= mobFocus3.y && mobFocus3.y <= n42 && mobFocus3.status != 0 && mobFocus3.status != 1 && (this.mobFocus == null || n44 < array[0])) {
                        this.mobFocus = mobFocus3;
                        array[0] = n44;
                    }
                }
            }
            else {
                if (this.mobFocus.status != 1 && this.mobFocus.status != 0 && n39 <= this.mobFocus.x && this.mobFocus.x <= n40 && n41 <= this.mobFocus.y && this.mobFocus.y <= n42) {
                    this.Class15(0);
                    return;
                }
                this.mobFocus = null;
                for (int n45 = 0; n45 < GameScr.vMob.size(); ++n45) {
                    final Mob mobFocus4 = (Mob)GameScr.vMob.elementAt(n45);
                    final int abs19 = Math.abs(getMyChar().cx - mobFocus4.x);
                    final int abs20 = Math.abs(getMyChar().cy - mobFocus4.y);
                    final int n46 = (abs19 > abs20) ? abs19 : abs20;
                    if ((mobFocus4.templateId != 97 || getMyChar().cTypePk != 4) && (mobFocus4.templateId != 96 || getMyChar().cTypePk != 5) && (mobFocus4.templateId != 98 || getMyChar().cTypePk != 4) && (mobFocus4.templateId != 167 || getMyChar().cTypePk != 4) && (mobFocus4.templateId != 99 || getMyChar().cTypePk != 5) && (mobFocus4.templateId != 166 || getMyChar().cTypePk != 5) && (mobFocus4.templateId != 96 || getMyChar().cTypePk != 6) && (mobFocus4.templateId != 99 || getMyChar().cTypePk != 6) && (mobFocus4.templateId != 166 || getMyChar().cTypePk != 6) && (mobFocus4.templateId != 202 || mobFocus4.status != 8 || mobFocus4.Class3()) && (!GameScr.Class150 || mobFocus4.levelBoss != 3) && mobFocus4.templateId != 202 && n39 <= mobFocus4.x && mobFocus4.x <= n40 && n41 <= mobFocus4.y && mobFocus4.y <= n42 && mobFocus4.status != 0 && mobFocus4.status != 1 && (this.mobFocus == null || n46 < array[0])) {
                        this.mobFocus = mobFocus4;
                        array[0] = n46;
                    }
                }
            }
            int n47 = getMyChar().cx - 80;
            int n48 = getMyChar().cx + 80;
            int n49 = getMyChar().cy - 30;
            int n50 = getMyChar().cy + 30;
            if (this.npcFocus != null && this.npcFocus.template.npcTemplateId == 13) {
                n47 = getMyChar().cx - 20;
                n48 = getMyChar().cx + 20;
                n49 = getMyChar().cy - 10;
                n50 = getMyChar().cy + 10;
            }
            if (this.npcFocus == null) {
                for (int n51 = 0; n51 < GameScr.vNpc.size(); ++n51) {
                    final Npc npcFocus3;
                    if ((npcFocus3 = (Npc)GameScr.vNpc.elementAt(n51)).statusMe != 15 && TileMap.Class14 != 1) {
                        final int abs21 = Math.abs(getMyChar().cx - npcFocus3.cx);
                        final int abs22 = Math.abs(getMyChar().cy - npcFocus3.cy);
                        final int n52 = (abs21 > abs22) ? abs21 : abs22;
                        n47 = getMyChar().cx - 80;
                        n48 = getMyChar().cx + 80;
                        n49 = getMyChar().cy - 30;
                        n50 = getMyChar().cy + 30;
                        if (npcFocus3.template.npcTemplateId == 13) {
                            n47 = getMyChar().cx - 20;
                            n48 = getMyChar().cx + 20;
                            n49 = getMyChar().cy - 10;
                            n50 = getMyChar().cy + 10;
                        }
                        if (n47 <= npcFocus3.cx && npcFocus3.cx <= n48 && n49 <= npcFocus3.cy && npcFocus3.cy <= n50 && (this.npcFocus == null || n52 < array[1])) {
                            if (GameScr.Class150 && GameScr.Class154 == 1) {
                                break;
                            }
                            this.npcFocus = npcFocus3;
                            array[1] = n52;
                        }
                    }
                }
            }
            else {
                if (n47 <= this.npcFocus.cx && this.npcFocus.cx <= n48 && n49 <= this.npcFocus.cy && this.npcFocus.cy <= n50) {
                    this.Class15(1);
                    return;
                }
                this.Class22();
                for (int n53 = 0; n53 < GameScr.vNpc.size(); ++n53) {
                    final Npc npcFocus4;
                    if ((npcFocus4 = (Npc)GameScr.vNpc.elementAt(n53)).statusMe != 15 && TileMap.Class14 != 1) {
                        final int abs23 = Math.abs(getMyChar().cx - npcFocus4.cx);
                        final int abs24 = Math.abs(getMyChar().cy - npcFocus4.cy);
                        final int n54 = (abs23 > abs24) ? abs23 : abs24;
                        n47 = getMyChar().cx - 80;
                        n48 = getMyChar().cx + 80;
                        n49 = getMyChar().cy - 30;
                        n50 = getMyChar().cy + 30;
                        if (npcFocus4.template.npcTemplateId == 13) {
                            n47 = getMyChar().cx - 20;
                            n48 = getMyChar().cx + 20;
                            n49 = getMyChar().cy - 10;
                            n50 = getMyChar().cy + 10;
                        }
                        if (n47 <= npcFocus4.cx && npcFocus4.cx <= n48 && n49 <= npcFocus4.cy && npcFocus4.cy <= n50 && (this.npcFocus == null || n54 < array[1])) {
                            if (GameScr.Class150 && GameScr.Class154 == 1) {
                                break;
                            }
                            this.npcFocus = npcFocus4;
                            array[1] = n54;
                        }
                    }
                }
            }
            if (this.charFocus == null) {
                for (int n55 = 0; n55 < GameScr.vCharInMap.size(); ++n55) {
                    final Char charFocus3;
                    if (!(charFocus3 = (Char)GameScr.vCharInMap.elementAt(n55)).Class3 && charFocus3.statusMe != 15 && !charFocus3.Class108 && charFocus3.charID < -1 && this.Class166 == 0 && this.Class167 == 0 && charFocus3.statusMe != 14 && charFocus3.statusMe != 5) {
                        final int abs25 = Math.abs(getMyChar().cx - charFocus3.cx);
                        final int abs26 = Math.abs(getMyChar().cy - charFocus3.cy);
                        final int n56 = (abs25 > abs26) ? abs25 : abs26;
                        if (n47 <= charFocus3.cx && charFocus3.cx <= n48 && n49 <= charFocus3.cy && charFocus3.cy <= n50 && (this.charFocus == null || n56 < array[2])) {
                            this.charFocus = charFocus3;
                            array[2] = n56;
                        }
                    }
                }
            }
            else {
                if (n47 <= this.charFocus.cx && this.charFocus.cx <= n48 && n49 <= this.charFocus.cy && this.charFocus.cy <= n50 && this.charFocus.statusMe != 15 && !this.charFocus.Class108) {
                    this.Class15(2);
                    return;
                }
                this.charFocus = null;
                for (int n57 = 0; n57 < GameScr.vCharInMap.size(); ++n57) {
                    final Char charFocus4;
                    if (!(charFocus4 = (Char)GameScr.vCharInMap.elementAt(n57)).Class3 && charFocus4.statusMe != 15 && !charFocus4.Class108 && charFocus4.charID < 0 && this.Class166 == 0 && this.Class167 == 0 && charFocus4.statusMe != 14 && charFocus4.statusMe != 5) {
                        final int abs27 = Math.abs(getMyChar().cx - charFocus4.cx);
                        final int abs28 = Math.abs(getMyChar().cy - charFocus4.cy);
                        final int n58 = (abs27 > abs28) ? abs27 : abs28;
                        if (n47 <= charFocus4.cx && charFocus4.cx <= n48 && n49 <= charFocus4.cy && charFocus4.cy <= n50 && (this.charFocus == null || n58 < array[2])) {
                            this.charFocus = charFocus4;
                            array[2] = n58;
                        }
                    }
                }
            }
            n37 = -1;
            for (int n59 = 0; n59 < 4; ++n59) {
                if (n37 == -1) {
                    if (array[n59] != -1) {
                        n37 = n59;
                    }
                }
                else if (array[n59] < array[n37] && array[n59] != -1) {
                    n37 = n59;
                }
            }
            if (GameScr.Class150 && GameScr.Class154 == 1 && !GameScr.gI().Class155) {
                GameScr.Class38();
            }
        }
        this.Class15(n37);
    }
    
    private void Class15(final int n) {
        if (n == 0) {
            this.Class22();
            this.charFocus = null;
            this.itemFocus = null;
            return;
        }
        if (n == 1) {
            this.mobFocus = null;
            this.charFocus = null;
            this.itemFocus = null;
            return;
        }
        if (n == 2) {
            this.mobFocus = null;
            this.Class22();
            this.itemFocus = null;
            return;
        }
        if (n == 3) {
            this.mobFocus = null;
            this.Class22();
            this.charFocus = null;
        }
    }
    
    public static boolean Class1(final Char char1) {
        final int class16 = GameScr.Class16;
        final int n = GameScr.Class16 + GameCanvas.Class25;
        final int n2 = GameScr.Class17 + 10;
        final int n3 = GameScr.Class17 + GameScr.Class10;
        return char1.statusMe != 15 && !char1.Class108 && class16 <= char1.cx && char1.cx <= n && n2 <= char1.cy && char1.cy <= n3;
    }
    
    public final void Class21() {
        if (this.charFocus != null && this.charFocus.Class3) {
            this.charFocus = null;
        }
        if (getMyChar().Class150 != null || getMyChar().Class149 != null) {
            return;
        }
        this.Class98.removeAllElements();
        int n = 0;
        final int n2 = GameScr.Class16 + 10;
        final int n3 = GameScr.Class16 + GameCanvas.Class25 - 10;
        final int n4 = GameScr.Class17 + 10;
        final int n5 = GameScr.Class17 + GameScr.Class10;
        if (TileMap.Class14 == 3 || TileMap.mapID == 111) {
            if (TileMap.mapID == 98 || TileMap.mapID == 104) {
                for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
                    final Char char1;
                    if (!(char1 = (Char)GameScr.vCharInMap.elementAt(i)).Class3 && char1.statusMe != 15 && !char1.Class108 && n2 <= char1.cx && char1.cx <= n3 && n4 <= char1.cy && char1.cy <= n5) {
                        this.Class98.addElement(char1);
                        if (this.charFocus != null && char1.equals(this.charFocus)) {
                            n = this.Class98.size();
                        }
                    }
                }
            }
            else {
                for (int j = 0; j < GameScr.vCharInMap.size(); ++j) {
                    final Char char2;
                    if (!(char2 = (Char)GameScr.vCharInMap.elementAt(j)).Class3 && char2.statusMe != 15 && !char2.Class108 && n2 <= char2.cx && char2.cx <= n3 && n4 <= char2.cy && char2.cy <= n5) {
                        if (TileMap.mapID != 111) {
                            if (char2.cTypePk != getMyChar().cTypePk && char2.statusMe != 14 && char2.statusMe != 5) {
                                this.Class98.addElement(char2);
                                if (this.charFocus != null && char2.equals(this.charFocus)) {
                                    n = this.Class98.size();
                                }
                            }
                        }
                        else if (Char.myChar.cTypePk == 0) {
                            this.Class98.addElement(char2);
                            if (this.charFocus != null && char2.equals(this.charFocus)) {
                                n = this.Class98.size();
                            }
                        }
                        else if (Char.myChar.nClass.classId == 6) {
                            if (Char.myChar.cTypePk == char2.cTypePk) {
                                if (char2.statusMe == 14 || char2.statusMe == 5) {
                                    this.Class98.addElement(char2);
                                    if (this.charFocus != null && char2.equals(this.charFocus)) {
                                        n = this.Class98.size();
                                    }
                                }
                            }
                            else if ((Char.myChar.cTypePk != 4 || char2.cTypePk == 5 || char2.cTypePk == 6) && (Char.myChar.cTypePk != 5 || char2.cTypePk == 4 || char2.cTypePk == 6) && (Char.myChar.cTypePk != 6 || char2.cTypePk == 4 || char2.cTypePk == 5) && char2.statusMe != 14 && char2.statusMe != 5) {
                                this.Class98.addElement(char2);
                                if (this.charFocus != null && char2.equals(this.charFocus)) {
                                    n = this.Class98.size();
                                }
                            }
                        }
                        else if ((Char.myChar.cTypePk != 4 || char2.cTypePk == 5 || char2.cTypePk == 6) && (Char.myChar.cTypePk != 5 || char2.cTypePk == 4 || char2.cTypePk == 6) && (Char.myChar.cTypePk != 6 || char2.cTypePk == 4 || char2.cTypePk == 5) && char2.statusMe != 14 && char2.statusMe != 5) {
                            this.Class98.addElement(char2);
                            if (this.charFocus != null && char2.equals(this.charFocus)) {
                                n = this.Class98.size();
                            }
                        }
                    }
                }
            }
            for (int k = 0; k < GameScr.vItemMap.size(); ++k) {
                final ItemMap itemMap = (ItemMap)GameScr.vItemMap.elementAt(k);
                if (n2 <= itemMap.x && itemMap.x <= n3 && n4 <= itemMap.y && itemMap.y <= n5) {
                    this.Class98.addElement(itemMap);
                    if (this.itemFocus != null && itemMap.equals(this.itemFocus)) {
                        n = this.Class98.size();
                    }
                }
            }
            for (int l = 0; l < GameScr.vMob.size(); ++l) {
                final Mob mob;
                if (((mob = (Mob)GameScr.vMob.elementAt(l)).templateId != 97 || getMyChar().cTypePk != 4) && (mob.templateId != 98 || getMyChar().cTypePk != 4) && (mob.templateId != 167 || getMyChar().cTypePk != 4) && (mob.templateId != 96 || getMyChar().cTypePk != 5) && (mob.templateId != 99 || getMyChar().cTypePk != 5) && (mob.templateId != 166 || getMyChar().cTypePk != 5) && (mob.templateId != 200 || getMyChar().cTypePk != 4) && (mob.templateId != 199 || getMyChar().cTypePk != 5) && (mob.templateId != 198 || getMyChar().cTypePk != 6) && (mob.templateId != 202 || mob.status != 8 || mob.Class3()) && mob.status != 1 && mob.status != 0 && n2 <= mob.x && mob.x <= n3 && n4 <= mob.y && mob.y <= n5) {
                    this.Class98.addElement(mob);
                    if (this.mobFocus != null && mob.equals(this.mobFocus)) {
                        n = this.Class98.size();
                    }
                }
            }
            for (int n6 = 0; n6 < GameScr.vNpc.size(); ++n6) {
                final Npc npc;
                if ((npc = (Npc)GameScr.vNpc.elementAt(n6)).statusMe != 15 && n2 <= npc.cx && npc.cx <= n3 && n4 <= npc.cy && npc.cy <= n5) {
                    this.Class98.addElement(npc);
                    if (this.npcFocus != null && npc.equals(this.npcFocus)) {
                        n = this.Class98.size();
                    }
                }
            }
            if (this.Class98.size() <= 0) {
                this.mobFocus = null;
                this.Class22();
                this.charFocus = null;
                this.itemFocus = null;
                Char.Class165 = false;
                return;
            }
            if (n >= this.Class98.size()) {
                n = 0;
            }
            if (this.Class98.elementAt(n) instanceof Char) {
                this.mobFocus = null;
                this.Class22();
                this.charFocus = (Char)this.Class98.elementAt(n);
                this.itemFocus = null;
                Char.Class165 = true;
                return;
            }
            if (this.Class98.elementAt(n) instanceof Npc) {
                this.mobFocus = null;
                this.Class22();
                this.npcFocus = (Npc)this.Class98.elementAt(n);
                this.charFocus = null;
                this.itemFocus = null;
                Char.Class165 = true;
                return;
            }
            if (this.Class98.elementAt(n) instanceof Mob) {
                this.mobFocus = (Mob)this.Class98.elementAt(n);
                this.Class22();
                this.charFocus = null;
                this.itemFocus = null;
                Char.Class165 = true;
                return;
            }
            if (this.Class98.elementAt(n) instanceof ItemMap) {
                this.mobFocus = null;
                this.Class22();
                this.charFocus = null;
                this.itemFocus = (ItemMap)this.Class98.elementAt(n);
                Char.Class165 = true;
            }
        }
        else {
            for (int n7 = 0; n7 < GameScr.vItemMap.size(); ++n7) {
                final ItemMap itemMap2 = (ItemMap)GameScr.vItemMap.elementAt(n7);
                if (n2 <= itemMap2.x && itemMap2.x <= n3 && n4 <= itemMap2.y && itemMap2.y <= n5) {
                    this.Class98.addElement(itemMap2);
                    if (this.itemFocus != null && itemMap2.equals(this.itemFocus)) {
                        n = this.Class98.size();
                    }
                }
            }
            for (int n8 = 0; n8 < GameScr.vMob.size(); ++n8) {
                final Mob mob2;
                if (((mob2 = (Mob)GameScr.vMob.elementAt(n8)).templateId != 97 || getMyChar().cTypePk != 4) && (mob2.templateId != 96 || getMyChar().cTypePk != 5) && (mob2.templateId != 98 || getMyChar().cTypePk != 4) && (mob2.templateId != 167 || getMyChar().cTypePk != 4) && (mob2.templateId != 99 || getMyChar().cTypePk != 5) && (mob2.templateId != 166 || getMyChar().cTypePk != 5) && (mob2.templateId != 200 || getMyChar().cTypePk != 4) && (mob2.templateId != 199 || getMyChar().cTypePk != 5) && (mob2.templateId != 198 || getMyChar().cTypePk != 6) && (mob2.templateId != 202 || mob2.status != 8 || mob2.Class3()) && mob2.status != 1 && mob2.status != 0 && n2 <= mob2.x && mob2.x <= n3 && n4 <= mob2.y && mob2.y <= n5) {
                    this.Class98.addElement(mob2);
                    if (this.mobFocus != null && mob2.equals(this.mobFocus)) {
                        n = this.Class98.size();
                    }
                }
            }
            for (int n9 = 0; n9 < GameScr.vNpc.size(); ++n9) {
                final Npc npc2;
                if ((npc2 = (Npc)GameScr.vNpc.elementAt(n9)).statusMe != 15 && n2 <= npc2.cx && npc2.cx <= n3 && n4 <= npc2.cy && npc2.cy <= n5) {
                    this.Class98.addElement(npc2);
                    if (this.npcFocus != null && npc2.equals(this.npcFocus)) {
                        n = this.Class98.size();
                    }
                }
            }
            for (int n10 = 0; n10 < GameScr.vCharInMap.size(); ++n10) {
                final Char char3;
                if (!(char3 = (Char)GameScr.vCharInMap.elementAt(n10)).Class3 && char3.statusMe != 15 && !char3.Class108 && n2 <= char3.cx && char3.cx <= n3 && n4 <= char3.cy && char3.cy <= n5) {
                    this.Class98.addElement(char3);
                    if (this.charFocus != null && char3.equals(this.charFocus)) {
                        n = this.Class98.size();
                    }
                }
            }
            if (this.Class98.size() > 0) {
                if (n >= this.Class98.size()) {
                    n = 0;
                }
                if (this.Class98.elementAt(n) instanceof Mob) {
                    this.mobFocus = (Mob)this.Class98.elementAt(n);
                    this.Class22();
                    this.charFocus = null;
                    this.itemFocus = null;
                    Char.Class165 = true;
                    return;
                }
                if (this.Class98.elementAt(n) instanceof Npc) {
                    this.mobFocus = null;
                    this.Class22();
                    this.npcFocus = (Npc)this.Class98.elementAt(n);
                    this.charFocus = null;
                    this.itemFocus = null;
                    Char.Class165 = true;
                    return;
                }
                if (this.Class98.elementAt(n) instanceof Char) {
                    this.mobFocus = null;
                    this.Class22();
                    this.charFocus = (Char)this.Class98.elementAt(n);
                    this.itemFocus = null;
                    Char.Class165 = true;
                    return;
                }
                if (this.Class98.elementAt(n) instanceof ItemMap) {
                    this.mobFocus = null;
                    this.Class22();
                    this.charFocus = null;
                    this.itemFocus = (ItemMap)this.Class98.elementAt(n);
                    Char.Class165 = true;
                }
            }
            else {
                this.mobFocus = null;
                this.Class22();
                this.charFocus = null;
                this.itemFocus = null;
                Char.Class165 = false;
            }
        }
    }
    
    public final void Class22() {
        if (this.Class61 && this.npcFocus != null) {
            this.npcFocus.Class6 = null;
            this.npcFocus = null;
        }
    }
    
    private void Class62() {
        if (GameCanvas.Class1) {
            return;
        }
        if (TileMap.tileTypeAt(this.cx, this.cy + 1, 1024)) {
            TileMap.Class2(this.cx, this.cy + 1);
            TileMap.Class2(this.cx, this.cy - 2);
        }
        if (TileMap.tileTypeAt(this.cx - TileMap.Class9, this.cy + 1, 512)) {
            TileMap.Class3(this.cx - TileMap.Class9, this.cy + 1);
            TileMap.Class3(this.cx - TileMap.Class9, this.cy - 2);
        }
        if (TileMap.tileTypeAt(this.cx + TileMap.Class9, this.cy + 1, 512)) {
            TileMap.Class3(this.cx + TileMap.Class9, this.cy + 1);
            TileMap.Class3(this.cx + TileMap.Class9, this.cy - 2);
        }
    }
    
    public final void Class2(final Message message) {
        try {
            this.Class1(message);
            getMyChar().Class28 = message.Class4.readShort();
            getMyChar().Class29 = message.Class4.readShort();
            final int unsignedByte = message.Class4.readUnsignedByte();
            final Item item;
            (item = this.Class80[unsignedByte]).typeUI = 3;
            this.Class80[unsignedByte] = null;
            item.indexUI = message.Class4.readUnsignedByte();
            this.arrItemBag[item.indexUI] = item;
            if (unsignedByte == 4) {
                final boolean b = false;
                this.Class65 = b;
                this.Class63 = b;
                this.Class64 = b;
                this.Class66 = b;
            }
            GameScr.Class92 = false;
            GameScr.gI().Class36();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final void Class3(final Message message) {
        try {
            this.Class1(message);
            getMyChar().Class28 = message.Class4.readShort();
            getMyChar().Class29 = message.Class4.readShort();
            final Item item;
            (item = this.arrItemBody[message.Class4.readUnsignedByte()]).typeUI = 3;
            if (item.indexUI == 1) {
                this.Class144 = 15;
            }
            else if (item.indexUI == 2) {
                this.Class12();
            }
            else if (item.indexUI == 6) {
                this.Class13();
            }
            this.arrItemBody[item.indexUI] = null;
            item.indexUI = message.Class4.readUnsignedByte();
            getMyChar().head = message.Class4.readShort();
            this.arrItemBag[item.indexUI] = item;
            final GameScr gi = GameScr.gI();
            final GameScr gi2 = GameScr.gI();
            final Command command = null;
            gi2.center = command;
            gi.left = command;
            GameScr.gI().Class36();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Char.itemBodyToBag()");
        }
    }
    
    public final void Class4(final Message message) {
        try {
            final int unsignedByte = message.Class4.readUnsignedByte();
            final int unsignedByte2 = message.Class4.readUnsignedByte();
            final Item item;
            if ((item = this.arrItemBag[unsignedByte]) != null) {
                if (item.template.type == 16) {
                    GameScr.Class25 -= item.quantity;
                }
                if (item.template.type == 17) {
                    GameScr.Class24 -= item.quantity;
                }
                this.arrItemBag[unsignedByte] = null;
                if (this.Class78[unsignedByte2] == null) {
                    item.indexUI = unsignedByte2;
                    item.typeUI = 4;
                    this.Class78[unsignedByte2] = item;
                }
                else {
                    final Item item2 = this.Class78[unsignedByte2];
                    item2.quantity += item.quantity;
                }
            }
            final GameScr gi = GameScr.gI();
            final GameScr gi2 = GameScr.gI();
            final Command command = null;
            gi2.center = command;
            gi.left = command;
            GameScr.gI().Class28();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Char.itemBagToBox()");
        }
    }
    
    public final void Class5(final Message message) {
        try {
            final int unsignedByte = message.Class4.readUnsignedByte();
            final int unsignedByte2 = message.Class4.readUnsignedByte();
            final Item item;
            if ((item = this.Class78[unsignedByte]) != null) {
                if (item.template.type == 16) {
                    GameScr.Class25 += item.quantity;
                }
                if (item.template.type == 17) {
                    GameScr.Class24 += item.quantity;
                }
                this.Class78[unsignedByte] = null;
                if (this.arrItemBag[unsignedByte2] == null) {
                    item.indexUI = unsignedByte2;
                    item.typeUI = 3;
                    this.arrItemBag[unsignedByte2] = item;
                }
                else {
                    final Item item2 = this.arrItemBag[unsignedByte2];
                    item2.quantity += item.quantity;
                }
            }
            final GameScr gi = GameScr.gI();
            final GameScr gi2 = GameScr.gI();
            final Command command = null;
            gi2.center = command;
            gi.left = command;
            GameScr.gI().Class28();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Char.itemBoxToBag()");
        }
    }
    
    public static void Class1(final Message message, final boolean b) {
        try {
            for (int i = 0; i < GameScr.Class75.length; ++i) {
                GameScr.Class75[i] = null;
            }
            final byte byte1 = message.Class4.readByte();
            final Item item;
            (item = new Item()).typeUI = 3;
            item.indexUI = message.Class4.readByte();
            item.template = Game104.Class1(message.Class4.readShort());
            item.Class7 = message.Class4.readBoolean();
            item.Class15 = message.Class4.readBoolean();
            item.quantity = 1;
            if (b) {
                getMyChar().xu = message.Class4.readInt();
            }
            else {
                getMyChar().yen = message.Class4.readInt();
                try {
                    getMyChar().xu = message.Class4.readInt();
                }
                catch (Exception ex2) {}
            }
            GameScr.Class75[0] = item;
            GameScr.Class161 = GameScr.efs[53];
            GameScr.Class160 = 0;
            final GameScr gi = GameScr.gI();
            final GameScr gi2 = GameScr.gI();
            final Command command = null;
            gi2.center = command;
            gi.left = command;
            GameScr.gI().Class29();
            GameCanvas.endDlg();
            if (byte1 == 1) {
                InfoMe.Class1(String.valueOf(Game86.Class146) + " " + item.template.name);
                return;
            }
            InfoMe.addInfo(String.valueOf(Game86.Class145) + " " + Game104.Class1((short)(item.template.id + 1)).name + " " + Game86.Class148 + " " + item.template.name, 25, mFont.Class14);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Char.itemBagToBox()");
        }
    }
    
    private static void Class1(final Item item, final int n) {
        int n2 = 0;
        if (item != null && item.options != null) {
            for (int i = 0; i < item.options.size(); ++i) {
                final ItemOption itemOption;
                (itemOption = (ItemOption)item.options.elementAt(i)).active = 0;
                if (itemOption.optionTemplate.type == 2) {
                    if (n2 < n) {
                        itemOption.active = 1;
                        ++n2;
                    }
                }
                else if (itemOption.optionTemplate.type == 3 && item.upgrade >= 4) {
                    itemOption.active = 1;
                }
                else if (itemOption.optionTemplate.type == 4 && item.upgrade >= 8) {
                    itemOption.active = 1;
                }
                else if (itemOption.optionTemplate.type == 5 && item.upgrade >= 12) {
                    itemOption.active = 1;
                }
                else if (itemOption.optionTemplate.type == 6 && item.upgrade >= 14) {
                    itemOption.active = 1;
                }
                else if (itemOption.optionTemplate.type == 7 && item.upgrade >= 16) {
                    itemOption.active = 1;
                }
            }
        }
    }
    
    public final void Class23() {
        int n = 2;
        int n2 = 2;
        int n3 = 2;
        if (this.arrItemBody[0] == null) {
            --n;
        }
        if (this.arrItemBody[6] == null) {
            --n;
        }
        if (this.arrItemBody[5] == null) {
            --n;
        }
        Class1(this.arrItemBody[0], n);
        Class1(this.arrItemBody[6], n);
        Class1(this.arrItemBody[5], n);
        if (this.arrItemBody[2] == null) {
            --n2;
        }
        if (this.arrItemBody[8] == null) {
            --n2;
        }
        if (this.arrItemBody[7] == null) {
            --n2;
        }
        Class1(this.arrItemBody[2], n2);
        Class1(this.arrItemBody[8], n2);
        Class1(this.arrItemBody[7], n2);
        if (this.arrItemBody[4] == null) {
            --n3;
        }
        if (this.arrItemBody[3] == null) {
            --n3;
        }
        if (this.arrItemBody[9] == null) {
            --n3;
        }
        if (this.arrItemBody[1] != null) {
            if (this.arrItemBody[1].Class8 == this.Class1()) {
                if (this.arrItemBody[1].options != null) {
                    for (int i = 0; i < this.arrItemBody[1].options.size(); ++i) {
                        final ItemOption itemOption;
                        if ((itemOption = (ItemOption)this.arrItemBody[1].options.elementAt(i)).optionTemplate.type == 2) {
                            itemOption.active = 1;
                        }
                    }
                }
            }
            else if (this.arrItemBody[1].options != null) {
                for (int j = 0; j < this.arrItemBody[1].options.size(); ++j) {
                    final ItemOption itemOption2;
                    if ((itemOption2 = (ItemOption)this.arrItemBody[1].options.elementAt(j)).optionTemplate.type == 2) {
                        itemOption2.active = 0;
                    }
                }
            }
        }
        Class1(this.arrItemBody[4], n3);
        Class1(this.arrItemBody[3], n3);
        Class1(this.arrItemBody[9], n3);
    }
    
    public final void Class1(final int i, final int n, final boolean b, final int n2) {
        this.cHP -= i;
        this.cMP -= n;
        if (!this.Class61) {
            this.cHP = this.Class26;
        }
        if (this.cHP < 0) {
            this.cHP = 0;
        }
        if (this.cMP < 0) {
            this.cMP = 0;
        }
        if (this.cHP <= 0 && this.statusMe != 14 && this.statusMe != 5) {
            this.cHP = 1;
        }
        if (i <= 0) {
            if (this.Class61) {
                GameScr.Class1("", this.cx, this.cy - this.Class59, 7);
            }
            else {
                GameScr.Class1("", this.cx, this.cy - this.Class59, 4);
            }
        }
        else {
            GameScr.Class1("-".concat(String.valueOf(i)), this.cx, this.cy - this.Class59, 0);
        }
        if (i > 0) {
            this.Class226 = 4;
        }
        if (b) {
            if (n2 == 114) {
                Game16.Class1(32, this.cx, this.cy - this.Class180, 1);
                return;
            }
            if (n2 == 115) {
                Game16.Class1(85, this.cx, this.cy, 1);
                return;
            }
            if (n2 == 139) {
                GameScr.Class152 = 1;
                GameScr.Class153 = 0;
                Game16.Class1(91, this, 2);
                return;
            }
            if (n2 == 144) {
                Game16.Class1(91, this, 1);
            }
        }
        else {
            this.Class14(49);
        }
    }
    
    public final void Class1(final short class166, final short class167) {
        this.Class166 = class166;
        this.Class167 = class167;
    }
    
    private void Class63() {
        this.Class172 = 0;
        this.statusMe = 1;
        this.Class126 = System.currentTimeMillis();
    }
    
    public final void Class24() {
        this.cHP = this.cMaxHP;
        this.cMP = this.cMaxMP;
        this.Class63();
        final int class13 = 0;
        this.Class176 = class13;
        this.Class175 = class13;
        this.Class13 = class13;
        Game16.Class1(20, this, 2);
        GameScr.gI().center = null;
    }
    
    public final boolean doUsePotion(final int n) {
        if (this.arrItemBag == null) {
            return false;
        }
        for (int i = 0; i < this.arrItemBag.length; ++i) {
            if (this.arrItemBag[i] != null && this.arrItemBag[i].template.type == n && this.arrItemBag[i].template.level <= Char.myChar.Class22) {
                Service.gI().useItem(i);
                return true;
            }
        }
        return false;
    }
    
    private static boolean Class64() {
        return TileMap.mapID == 1 || TileMap.mapID == 27 || TileMap.mapID == 72 || TileMap.mapID == 10 || TileMap.mapID == 17 || TileMap.mapID == 22 || TileMap.mapID == 32 || TileMap.mapID == 38 || TileMap.mapID == 43 || TileMap.mapID == 48;
    }
    
    public static boolean Class2(final Char char1) {
        if (char1 != null && char1.Class3) {
            return false;
        }
        if (char1 == null || getMyChar().myskill == null || getMyChar().myskill.template.type == 2 || getMyChar().myskill.template.type == 3 || (getMyChar().myskill.template.type == 4 && char1.statusMe != 14 && char1.statusMe != 5)) {
            return false;
        }
        Label_0354: {
            if ((getMyChar().cTypePk == 6 && (char1.cTypePk == 4 || char1.cTypePk == 5)) || (getMyChar().cTypePk == 4 && (char1.cTypePk == 5 || char1.cTypePk == 6)) || (getMyChar().cTypePk == 5 && (char1.cTypePk == 4 || char1.cTypePk == 6))) {
                getMyChar();
                if (!Class3(char1) && !Class64()) {
                    break Label_0354;
                }
            }
            if (char1.cTypePk == 3) {
                getMyChar();
                if (!Class3(char1) && !Class64()) {
                    break Label_0354;
                }
            }
            if (getMyChar().cTypePk == 3) {
                getMyChar();
                if (!Class3(char1) && !Class64()) {
                    break Label_0354;
                }
            }
            if (getMyChar().cTypePk == 1 && char1.cTypePk == 1) {
                getMyChar();
                if (!Class3(char1) && !Class64()) {
                    break Label_0354;
                }
            }
            if ((getMyChar().testCharId < 0 || getMyChar().testCharId != char1.charID) && (getMyChar().killCharId < 0 || getMyChar().killCharId != char1.charID || Class64()) && (char1.killCharId < 0 || char1.killCharId != getMyChar().charID || Class64())) {
                return false;
            }
        }
        if (char1.statusMe != 14 && char1.statusMe != 5) {
            return true;
        }
        return false;
    }
    
    private static boolean Class3(final Char char1) {
        for (int i = 0; i < GameScr.vParty.size(); ++i) {
            if (char1.charID == ((Party)GameScr.vParty.elementAt(i)).charId) {
                return true;
            }
        }
        return false;
    }
    
    public static void Class25() {
        getMyChar().Class10(21);
        getMyChar().taskMaint = null;
        for (int i = 0; i < getMyChar().arrItemBag.length; ++i) {
            if (getMyChar().arrItemBag[i] != null && (getMyChar().arrItemBag[i].template.type == 25 || getMyChar().arrItemBag[i].template.type == 23 || getMyChar().arrItemBag[i].template.type == 24)) {
                getMyChar().arrItemBag[i] = null;
            }
        }
        Npc.Class31();
    }
    
    public static int Class26() {
        if (Char.Class125 >= 4000) {
            return 4;
        }
        if (Char.Class125 >= 1500) {
            return 3;
        }
        if (Char.Class125 >= 600) {
            return 2;
        }
        if (Char.Class125 >= 200) {
            return 1;
        }
        return 0;
    }
    
    private void Class65() {
        ++this.Class171;
        if (this.Class171 > 5) {
            this.Class171 = 0;
        }
    }
    
    public final boolean zisHuman() {
        return this.isHuman;
    }
    
    public final boolean Class28() {
        return this.Class3;
    }
    
    public final void Class29() {
        this.Class271 = (int[][])Game94.Class8.Class1(new StringBuffer(String.valueOf(this.Class80[4].template.id)).toString());
    }
    
    public final boolean Class30() {
        return this.ID_HORSE < 0 && (this.Class80 != null && this.Class80[4] != null && this.Class80[4].template != null && this.Class80[4].template.id != 443 && this.Class80[4].template.id != 523 && this.Class80[4].template.id != 485 && this.Class80[4].template.id != 524);
    }
    
    private void Class66() {
        if (this.ID_HORSE >= 0 || !this.Class66) {
            return;
        }
        ++this.Class272;
        if (this.Class65) {
            this.Class273 = 5;
        }
        else if (this.statusMe == 1 || this.statusMe == 6) {
            this.Class273 = 0;
            this.Class272 = ((GameCanvas.gameTick % 20 > 12) ? 1 : 0);
            if (this.ID_PP >= 0) {
                this.Class272 = this.Class62;
            }
            this.Class274 = this.Class272;
        }
        else if (this.statusMe == 2 || this.statusMe == 10) {
            this.Class273 = 1;
            final int n = this.Class271[this.Class273].length / 3;
            if (this.Class272 < n) {
                this.Class274 = 0;
            }
            else if (this.Class272 < n << 1) {
                this.Class274 = 1;
            }
            else {
                this.Class274 = 2;
            }
        }
        else if (this.statusMe == 3) {
            this.Class273 = 2;
        }
        else if (this.statusMe == 4) {
            this.Class273 = 3;
        }
        else if (this.statusMe == 14) {
            this.Class273 = 4;
        }
        if (this.Class272 > this.Class271[this.Class273].length - 1) {
            this.Class272 = 0;
        }
    }
    
    private void Class7(final mGraphics mGraphics) {
        int n = 2;
        if (this.Class15 == 1) {
            n = 0;
        }
        Game2.Class1(mGraphics, this.Class271[this.Class273][this.Class272], this.cx, this.cy, n, 33);
    }
    
    private void Class1(final mGraphics mGraphics, final Game99 game99, final Game99 game100, final int[] array) {
        int n = 2;
        int n2 = 24;
        if (this.Class15 == 1) {
            n = 0;
            n2 = 0;
        }
        if (game99 != null) {
            Game2.Class1(mGraphics, game99.Class1[Char.Class127[this.Class62][3][0]].Class1, this.cx + (Char.Class127[this.Class62][3][1] + game99.Class1[Char.Class127[this.Class62][3][0]].Class2) * this.Class15, this.cy - Char.Class127[this.Class62][3][2] + game99.Class1[Char.Class127[this.Class62][3][0]].Class3 - 10 + this.Class274, n, n2);
        }
        if (array != null && this.ID_PP == -1) {
            Game2.Class1(mGraphics, array[this.Class107], this.cx + this.Class235 + (this.Class231 - 7) * this.Class15, this.cy - Game2.Class2(this.Class57()) - 19 + this.Class232 + this.Class274, n, 17);
        }
        int n3 = -4;
        if (this.Class15 == 1) {
            n3 = 4;
        }
        Game2.Class1(mGraphics, this.Class271[this.Class273][this.Class272], this.cx, this.cy, n, 33);
        if (this.ID_Body >= 0) {
            this.Class12(mGraphics, this.cx + n3 + this.Class55(), this.cy - 18 + this.Class274 - this.Class54(), 1);
        }
        else {
            Game2.Class1(mGraphics, this.Class58(), this.cx + this.Class235 + this.Class231 * this.Class15, this.cy - Game2.Class2(this.Class57()) - 9 + this.Class232 + this.Class274, n, 33);
        }
        if (this.ID_HAIR >= 0) {
            this.Class13(mGraphics, this.cx + n3 + this.Class55(), this.cy - 18 + this.Class274 - this.Class54(), 1);
        }
        else {
            Game2.Class1(mGraphics, this.Class59(), this.cx + this.Class235 + this.Class229 * this.Class15, this.cy - Char.Class127[0][0][2] + game100.Class1[Char.Class127[0][0][0]].Class3 - 12 + this.Class230 + this.Class274, n, 17);
        }
        if (this.ID_MAT_NA >= 0) {
            this.Class14(mGraphics, this.cx + n3 + this.Class55(), this.cy - 18 + this.Class274 - this.Class54(), 1);
        }
    }
    
    public final void Class1(final short[] array) {
        this.ID_HAIR = array[0];
        this.ID_Body = array[1];
        this.ID_LEG = array[2];
        this.ID_WEA_PONE = array[3];
        this.ID_PP = array[4];
        this.ID_NAME = array[5];
        this.ID_HORSE = array[6];
        this.ID_RANK = array[7];
        this.ID_MAT_NA = array[8];
        this.ID_Bien_Hinh = array[9];
    }
    
    public static boolean QuetItemTrongHT(final int n) {
        final Item[] arrItemBag = getMyChar().arrItemBag;
        for (int i = 0; i < arrItemBag.length; ++i) {
            if (arrItemBag[i] != null && arrItemBag[i].template.id == n) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean Move(int cx, int cy) {
        final Char myChar = getMyChar();
        if (cx == -1) {
            cx = myChar.cx;
        }
        if (cy == -1) {
            cy = myChar.cy;
        }
        if (cx == myChar.cx && cy == myChar.cy) {
            return false;
        }
        int n = 0;
        int i = myChar.cx;
        final int n2 = TileMap.tileTypeAt(cx, cy - 12, 64) ? (TileMap.tileYofPixel(cy) - 24) : cy;
        if (cx > i) {
            Label_0120: {
                break Label_0120;
                do {
                    final Service gi = Service.gI();
                    final int n3 = i;
                    gi.charMove(n3, TileMap.pMove(n3, n2));
                    if (++n > 50) {
                        try {
                            Thread.sleep(200L);
                        }
                        catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                    i += 50;
                } while (i < cx);
            }
        }
        else {
            Label_0167: {
                break Label_0167;
                do {
                    final Service gi2 = Service.gI();
                    final int n4 = i;
                    gi2.charMove(n4, TileMap.pMove(n4, n2));
                    if (++n > 50) {
                        try {
                            Thread.sleep(200L);
                        }
                        catch (InterruptedException ex2) {
                            ex2.printStackTrace();
                        }
                    }
                    i -= 50;
                } while (i > cx);
            }
        }
        Service.gI().charMove(cx, cy);
        myChar.timeSendmove = System.currentTimeMillis();
        final Char char1 = myChar;
        final int n5 = cx;
        char1.cxSend = n5;
        char1.cx = n5;
        final Char char2 = myChar;
        final int n6 = cy;
        char2.cySend = n6;
        char2.cy = n6;
        return true;
    }
    
    public static TaskOrder FindTask(final int n) {
        for (int i = 0; i < getMyChar().taskOrder.size(); ++i) {
            final TaskOrder taskOrder;
            if ((taskOrder = (TaskOrder)getMyChar().taskOrder.elementAt(i)) != null && taskOrder.taskId == n) {
                return taskOrder;
            }
        }
        return null;
    }
    
    public static Item KiemTraiditem21(final int n) {
        final Item[] arrItemBag = getMyChar().arrItemBag;
        for (int i = 0; i < arrItemBag.length; ++i) {
            final Item item;
            if ((item = arrItemBag[i]) != null && item.template.id == n) {
                return item;
            }
        }
        return null;
    }
    
    public static void FixMove(final int n, final int n2) {
        final int n3 = Res.abs(n - Char.myChar.cx) / 50;
        int n4 = Res.abs(n2 - Char.myChar.cy) / 10;
        int cx = Char.myChar.cx;
        int cy = Char.myChar.cy;
        if (n4 < 3) {
            Service.gI().charMove(Char.myChar.cx, cy = n2 - 60);
            n4 = 3;
        }
        for (int i = 0; i < n3; ++i) {
            if (n > Char.myChar.cx) {
                cx += 50;
            }
            else {
                cx -= 50;
            }
            Service.gI().charMove(cx, cy);
        }
        Service.gI().charMove(n, cy);
        for (int j = 0; j < n4; ++j) {
            if (n2 > Char.myChar.cy) {
                cy += 10;
            }
            else {
                cy -= 10;
            }
            Service.gI().charMove(n, cy);
        }
        Service.gI().charMove(n, n2);
        Char.myChar.timeSendmove = System.currentTimeMillis();
        final Char myChar = Char.myChar;
        myChar.cxSend = n;
        myChar.cx = n;
        final Char myChar2 = Char.myChar;
        myChar2.cySend = n2;
        myChar2.cy = n2;
    }
    
    public static int SoLuong(final int n) {
        final Item[] arrItemBag = getMyChar().arrItemBag;
        for (int i = 0; i < arrItemBag.length; ++i) {
            if (arrItemBag[i] != null && arrItemBag[i].template.id == n) {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean gotoTOChar(int cx, int cy) {
        if (cx == -1) {
            cx = Char.myChar.cx;
        }
        if (cy == -1) {
            cy = Char.myChar.cy;
        }
        final int[] array = new int[2];
        return TileMap.pMove2(cx, cy, array) && Move(array[0], array[1]);
    }
    
    public static int KichThuocHanhTrang() {
        final Item[] arrItemBag = getMyChar().arrItemBag;
        int n = 0;
        for (int i = 0; i < arrItemBag.length; ++i) {
            if (arrItemBag[i] == null) {
                ++n;
            }
        }
        return n;
    }
    
    public static int Game11kk(final int n) {
        final Item[] arrItemBag = getMyChar().arrItemBag;
        int n2 = 0;
        for (int i = 0; i < arrItemBag.length; ++i) {
            if (arrItemBag[i] != null && arrItemBag[i].template.id == n) {
                if (arrItemBag[i].template.isUpToUp) {
                    n2 += arrItemBag[i].upgrade;
                }
                else {
                    ++n2;
                }
            }
        }
        return n2;
    }
    
    public static int QuetSLmuaBan(final int n) {
        final Item[] arrItemBag = getMyChar().arrItemBag;
        int n2 = 0;
        for (int i = 0; i < arrItemBag.length; ++i) {
            if (arrItemBag[i] != null && arrItemBag[i].template.id == n) {
                if (arrItemBag[i].template.isUpToUp) {
                    n2 += arrItemBag[i].quantity;
                }
                else {
                    ++n2;
                }
            }
        }
        return n2;
    }
    
    public static Item KTSLItemBan(final int n, final int n2) {
        final Item[] arrItemBag = getMyChar().arrItemBag;
        for (int i = 0; i < arrItemBag.length; ++i) {
            final Item item;
            if ((item = arrItemBag[i]) != null && item.template.id == n && item.quantity == n2) {
                return item;
            }
        }
        return null;
    }
    
    public static void Game5bb(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           " "
        //     4: invokestatic    Code.Game3:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //     7: dup            
        //     8: astore_0       
        //     9: arraylength    
        //    10: newarray        I
        //    12: astore_1       
        //    13: iconst_0       
        //    14: istore_2       
        //    15: goto            38
        //    18: aload_1        
        //    19: iload_2        
        //    20: aload_0        
        //    21: iload_2        
        //    22: aaload         
        //    23: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    26: iastore        
        //    27: goto            35
        //    30: pop            
        //    31: aload_1        
        //    32: iload_2        
        //    33: iconst_m1      
        //    34: iastore        
        //    35: iinc            2, 1
        //    38: iload_2        
        //    39: aload_0        
        //    40: arraylength    
        //    41: if_icmplt       18
        //    44: aload_1        
        //    45: putstatic       Code.DanhSachKhu:[I
        //    48: return         
        //    StackMap: 00 04 00 12 00 03 07 07 FB 07 01 8E 01 00 00 00 1E 00 03 07 07 FB 07 01 8E 01 00 01 07 01 55 00 23 00 03 07 07 FB 07 01 8E 01 00 00 00 26 00 03 07 07 FB 07 01 8E 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  18     27     30     35     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
