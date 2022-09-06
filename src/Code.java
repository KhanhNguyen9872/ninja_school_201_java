import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Code implements Runnable
{
    public static Code code;
    private static boolean DKChay;
    private static Thread thread;
    public static Auto T;
    private static TanSat tansat;
    public static SanBoss sanbos;
    public static NVHN Game4;
    public static AutoTaThu tathu;
    private static TuDanh tudanh;
    public static boolean mMap;
    public static boolean mNpc;
    public static boolean mChar;
    private static Buff buff;
    public static AutoSell Game6;
    public static String CharPartyGrup;
    public static MyVector Game8;
    public static MyVector Game9;
    private static long Game50;
    private static long Game51;
    public static short[] ShortItemNhat;
    public static short[] Itemdell;
    public static short[] Clone;
    public static int KCNhatXa;
    public static int KCTSat;
    public static boolean Paint;
    public static boolean Line;
    public static int KCTScx;
    public static int KCTScy;
    public static boolean BatTatNhatXa;
    public static boolean BatTatDanhChuyenVitri;
    public static int intavt;
    public static MyVector avtx;
    public static MyVector avty;
    public static boolean DanhCK;
    public static int KhuMacDinh;
    public static int[] DanhSachKhu;
    public static boolean Game24;
    public static int Game25;
    private static long Log2a;
    private static MyVector Game53;
    private static MyVector Game54;
    private static long Game55;
    public static MyVector Game26;
    public static MyVector Game27;
    public static long log;
    public static long Game29;
    public static boolean Game30;
    public static boolean BangSkill;
    public static boolean Game32;
    public static int Game33;
    public static boolean Game34;
    public static int Game35;
    public static boolean Game36;
    public static int Game37;
    public static boolean Game38;
    public static int Game39;
    public static boolean BatTatPKAS;
    private static String[] Game56;
    private static String Game57;
    public static long Game41;
    public static int Game42;
    private static MyVector Game58;
    private static long Game59;
    public static short[] Boradat;
    private static boolean Game60;
    public static boolean BatTatHSL;
    public static boolean NhanVat;
    
    public final void Start() {
        if (!Code.DKChay) {
            if (Code.T != null) {
                Code.T.Login();
            }
            Code.Log2a = System.currentTimeMillis();
            Code.DKChay = true;
            (Code.thread = new Thread(Code.code)).start();
            Info.addInfo("NHK SONIC xin ch\u00e0o c\u00e1c b\u1ea1n!", 120, mFont.Class4);
        }
    }
    
    private static void Game2(final boolean b, final boolean b2) {
        Code.buff.update(TileMap.mapID, TileMap.zoneID, b, b2);
        S(Code.buff);
    }
    
    public static String[] Slip(final String s, final String s2) {
        int n = 0;
        final int length = s2.length();
        for (int i = s.indexOf(s2, 0); i != -1; i = s.indexOf(s2, i + length), ++n) {}
        final String[] array = new String[n + 1];
        int j;
        int n2;
        int n3;
        for (j = s.indexOf(s2), n2 = 0, n3 = 0; j != -1; j = s.indexOf(s2, n2), ++n3) {
            array[n3] = s.substring(n2, j);
            n2 = j + length;
        }
        array[n3] = s.substring(n2, s.length());
        return array;
    }
    
    public static void End() {
        Code.DKChay = false;
        if (Code.thread != null) {
            LockGame.LockAll();
            Code.thread.interrupt();
        }
    }
    
    private static String Game10(String s) {
        final InputStream game1 = TaskOrder.Game1("/".concat(String.valueOf(s)));
        try {
            final byte[] array = new byte[game1.available()];
            game1.read(array);
            s = new String(array, "UTF-8");
        }
        catch (Exception ex) {
            s = "";
        }
        return s;
    }
    
    public static void Game7(final String s) {
        for (int i = 0; i < Code.Game56.length; ++i) {
            Game1(s, Code.Game56[i].trim());
        }
    }
    
    private static void Game8(final String s) {
        if (!Code.Game9.contains(s)) {
            Code.Game9.addElement(s);
            Game19();
        }
    }
    
    private static void Game19() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeUTF((Code.CharPartyGrup == null) ? "" : Code.CharPartyGrup);
            dataOutputStream.writeByte(Code.Game8.size());
            for (int i = 0; i < Code.Game8.size(); ++i) {
                dataOutputStream.writeUTF((String)Code.Game8.elementAt(i));
            }
            dataOutputStream.writeInt(Code.Game9.size());
            for (int j = 0; j < Code.Game9.size(); ++j) {
                dataOutputStream.writeUTF((String)Code.Game9.elementAt(j));
            }
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            TaskOrder.save("V6Group", byteArrayOutputStream.toByteArray());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void Game1(final String s, final String s2) {
        ChatManager.gI().Chat(s, Char.getMyChar().cName, s2);
        Service.gI().chatPrivate(s, s2);
        sleep(20L);
    }
    
    public static void TS(final int n, final int n2) {
        Code.tansat.update(n, n2, Char.TSMTrrong ? -1 : TileMap.zoneID);
        S(Code.tansat);
    }
    
    public static void Game2(final short n) {
        for (int i = 0; i < Code.ShortItemNhat.length; ++i) {
            if (Code.ShortItemNhat[i] == n) {
                Code.ShortItemNhat[i] = -1;
            }
        }
    }
    
    public static void Game14() {
        final Char myChar = Char.getMyChar();
        if (Char.QuetItemTrongHT(37) || Char.QuetItemTrongHT(35)) {
            Char.Move(myChar.cx, TileMap.pxh);
            return;
        }
        final Npc findNpc;
        if ((findNpc = GameScr.FindNpc(13)) != null && Math.abs(findNpc.cx - myChar.cx) <= 200 && Math.abs(findNpc.cy - myChar.cy) <= 200) {
            Char.Move((findNpc.cx > 200) ? (findNpc.cx - 200) : (findNpc.cx + 200), findNpc.cy);
        }
        Service.gI().openUIZone();
    }
    
    @Override
    public final void run() {
        try {
            while (Code.DKChay) {
                final long num = System.currentTimeMillis();
                try {
                    if (Code.T != null) {
                        for (int j = 0; j < Char.getMyChar().arrItemBag.length; ++j) {
                            final Item item;
                            if (Game5(item = Char.getMyChar().arrItemBag[j])) {
                                item.Game21 = System.currentTimeMillis();
                                Service.gI().throwItem(item.indexUI);
                            }
                        }
                        for (int k = 0; k < Char.getMyChar().arrItemBag.length; ++k) {
                            final Item item2;
                            if (Game4(item2 = Char.getMyChar().arrItemBag[k])) {
                                item2.Game21 = System.currentTimeMillis();
                                Service.gI().saleItem(item2.indexUI, 1);
                            }
                        }
                        Code.T.Run();
                    }
                    if (Code.BatTatNhatXa) {
                        int n20 = 100;
                        ItemMap itemMap = null;
                        for (int n21 = 0; n21 < GameScr.vItemMap.size(); ++n21) {
                            final ItemMap itemMap2 = (ItemMap)GameScr.vItemMap.elementAt(n21);
                            final int distance = Res.distance(Char.getMyChar().cx, Char.getMyChar().cy, itemMap2.xEnd, itemMap2.yEnd);
                            if ((n20 == -1 || distance < n20) && (NhatItem(itemMap2.template) || (Char.getMyChar().nClass.classId == 1 && itemMap2.template.id == 218)) && (n20 > 2 || itemMap2.template.type == 19 || (itemMap2.template.isUpToUp && Char.QuetItemTrongHT(itemMap2.template.id)))) {
                                n20 = distance;
                                itemMap = itemMap2;
                            }
                        }
                        if (itemMap != null) {
                            Service.gI().pickItem(itemMap.itemMapID);
                            Thread.sleep(50L);
                        }
                    }
                    final long num2 = System.currentTimeMillis() - num;
                    if (System.currentTimeMillis() - num < 100L) {
                        Thread.sleep((int)(100L - num2));
                    }
                    else {
                        Thread.sleep(1L);
                    }
                }
                catch (Exception ex2) {
                    ex2.printStackTrace();
                }
            }
        }
        catch (Exception ex3) {
            ex3.printStackTrace();
        }
    }
    
    public static String[] Game3(final String s, final String s2) {
        int n = 0;
        final int length = s2.length();
        for (int i = s.indexOf(s2, 0); i != -1; i = s.indexOf(s2, i + length), ++n) {}
        final String[] array = new String[n + 1];
        int j;
        int n2;
        int n3;
        for (j = s.indexOf(s2), n2 = 0, n3 = 0; j != -1; j = s.indexOf(s2, n2), ++n3) {
            array[n3] = s.substring(n2, j);
            n2 = j + length;
        }
        array[n3] = s.substring(n2, s.length());
        return array;
    }
    
    public static void sleep(final long time) {
        try {
            Thread.sleep(time);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static boolean ChatMod(final String s2) {
        int int1 = 0;
        final StringBuffer sb = new StringBuffer();
        final StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < s2.length(); ++i) {
            final char char1;
            if (((char1 = s2.charAt(i)) >= '0' && char1 <= '9') || char1 == ' ') {
                char char2;
                while (i < s2.length() && (char2 = s2.charAt(i)) >= '0') {
                    if (char2 > '9') {
                        break;
                    }
                    sb2.append(char2);
                    ++i;
                }
                break;
            }
            sb.append(char1);
        }
        final String lowerCase = sb.toString().toLowerCase();
        if (sb2.length() > 0) {
            try {
                int1 = Integer.parseInt(sb2.toString());
            }
            catch (Exception ex9) {}
        }
        if (lowerCase.equals("ts")) {
            final Mob mobName;
            if ((mobName = Mob.MobName(int1)) == null) {
                GameScr.Paint("T\u00e0n s\u00e1t all");
                TS(-1, TileMap.mapID);
            }
            else {
                GameScr.Paint("T\u00e0n s\u00e1t " + mobName.getTemplate().name + " lv " + int1);
                TS(mobName.templateId, TileMap.mapID);
            }
            return true;
        }
        if (lowerCase.equals("bg")) {
            Code.Paint = !Code.Paint;
            GameScr.Paint(Code.Paint ? "B\u1eadt \u0110\u1ed3 H\u1ecda" : "T\u1eaft \u0110\u1ed3 H\u1ecda");
            return true;
        }
        if (lowerCase.equals("nm")) {
            GameScr.Paint("Next map: ".concat(String.valueOf(int1)));
            TileMap.NM(int1);
            return true;
        }
        if (lowerCase.equals("avt")) {
            GameScr.Paint("Th\u00eam v\u1ecb tr\u00ed " + Code.avtx.size());
            Code.avtx.addElement(new Integer(Char.getMyChar().cx));
            Code.avty.addElement(new Integer(Char.getMyChar().cy));
            if (Char.DanhTheoNhom) {
                Service.gI().chatParty("avt " + Char.getMyChar().cx + " " + Char.getMyChar().cy);
            }
            return true;
        }
        if (lowerCase.equals("dvt")) {
            GameScr.Paint("X\u00f3a h\u1ebft v\u1ecb tr\u00ed");
            Code.avtx.removeAllElements();
            Code.avty.removeAllElements();
            if (Char.DanhTheoNhom) {
                Service.gI().chatParty("dvt");
            }
            return true;
        }
        if (lowerCase.equals("dvtx")) {
            GameScr.Paint("X\u00f3a v\u1ecb tr\u00ed ".concat(String.valueOf(int1)));
            Code.avtx.removeElementAt(int1);
            Code.avty.removeElementAt(int1);
            if (Char.DanhTheoNhom) {
                Service.gI().chatParty("dtvx ".concat(String.valueOf(int1)));
            }
            return true;
        }
        if (s2.equals("as10")) {
            S(new Auto10());
            return true;
        }
        if (lowerCase.equals("gm")) {
            GameScr.Paint("Go to: " + TileMap.mapNames[int1]);
            TileMap.GM(int1);
            return true;
        }
        if (lowerCase.equals("dcvt")) {
            if (Code.BatTatDanhChuyenVitri) {
                GameScr.Paint("T\u1eaft \u0111\u00e1nh chuy\u1ec3n v\u1ecb tr\u00ed");
            }
            else {
                GameScr.Paint("B\u1eadt \u0111\u00e1nh chuy\u1ec3n v\u1ecb tr\u00ed");
            }
            Code.BatTatDanhChuyenVitri = !Code.BatTatDanhChuyenVitri;
            if (Char.DanhTheoNhom) {
                Service.gI().chatParty("dcvt " + (Code.BatTatDanhChuyenVitri ? 1 : 0));
            }
            return true;
        }
        if (lowerCase.equals("ak")) {
            if (Code.T == Code.tudanh) {
                GameScr.Paint("T\u1eaft t\u1ef1 \u0111\u00e1nh");
                Game6();
            }
            else {
                GameScr.Paint("B\u1eadt t\u1ef1 \u0111\u00e1nh");
                Game16();
            }
            return true;
        }
        if (lowerCase.equals("kpk")) {
            GameScr.Paint("Khu PK ".concat(String.valueOf(int1)));
            Auto.intPK = int1;
            return true;
        }
        if (lowerCase.equals("dc")) {
            final Char charFocus = (Char)GameScr.vCharInMap.elementAt(int1);
            Char.getMyChar().cx = charFocus.cx;
            Char.getMyChar().cy = charFocus.cy;
            GameScr.Paint("Tele \u0110\u1ebfn : " + charFocus.cName);
            return true;
        }
        if (lowerCase.equals("skin")) {
            if (Char.getMyChar().charFocus != null) {
                Char.getMyChar().head = Char.getMyChar().charFocus.head;
                Char.getMyChar().ID_HAIR = Char.getMyChar().charFocus.ID_HAIR;
                Char.getMyChar().ID_Body = Char.getMyChar().charFocus.ID_Body;
                Char.getMyChar().ID_LEG = Char.getMyChar().charFocus.ID_LEG;
                Char.getMyChar().ID_WEA_PONE = Char.getMyChar().charFocus.ID_WEA_PONE;
                Char.getMyChar().ID_PP = Char.getMyChar().charFocus.ID_PP;
                Char.getMyChar().ID_HORSE = Char.getMyChar().charFocus.ID_HORSE;
                Char.getMyChar().ID_MAT_NA = Char.getMyChar().charFocus.ID_MAT_NA;
                Char.getMyChar().ID_Bien_Hinh = Char.getMyChar().charFocus.ID_Bien_Hinh;
                Char.getMyChar().ID_RANK = Char.getMyChar().charFocus.ID_RANK;
                Char.getMyChar().ID_NAME = Char.getMyChar().charFocus.ID_NAME;
                Char.getMyChar().leg = Char.getMyChar().charFocus.leg;
                Char.getMyChar().body = Char.getMyChar().charFocus.body;
                Char.getMyChar().cName = Char.getMyChar().charFocus.cName;
                GameScr.Paint("Fake " + Char.getMyChar().charFocus.cName);
            }
            if (Char.getMyChar().npcFocus != null) {
                Char.getMyChar().head = (short)Char.getMyChar().npcFocus.template.headId;
                Char.getMyChar().leg = (short)Char.getMyChar().npcFocus.template.legId;
                Char.getMyChar().body = (short)Char.getMyChar().npcFocus.template.bodyId;
                Char.getMyChar().cName = Char.getMyChar().npcFocus.template.name;
                GameScr.Paint("\u0110\u00f3ng gi\u1ea3 " + Char.getMyChar().npcFocus.template.name);
            }
            return true;
        }
        if (lowerCase.equals("cItem")) {}
        if (lowerCase.equals("cpk")) {
            GameScr.Paint("X\u00f3a ds PK");
            DSPK.Game2();
            return true;
        }
        if (s2.startsWith("dpk")) {
            final String[] slip2;
            if ((slip2 = Slip(s2, " ")).length > 1) {
                GameScr.Paint("X\u00f3a " + slip2[1] + " kh\u1ecfi ds PK");
                DSPK.Game2(slip2[1]);
            }
            else if (Char.getMyChar().charFocus != null) {
                GameScr.Paint("X\u00f3a " + Char.getMyChar().charFocus.cName + " kh\u1ecfi ds PK");
                DSPK.Game2(Char.getMyChar().charFocus.cName);
            }
            return true;
        }
        if (lowerCase.equals("u")) {
            if (int1 == 0) {
                int1 = 50;
            }
            GameScr.Paint("Khinh k\u00f4ng ".concat(String.valueOf(int1)));
            Char.Move(Char.getMyChar().cx, Char.getMyChar().cy - int1);
            return true;
        }
        if (lowerCase.equals("d")) {
            if (int1 == 0) {
                int1 = 50;
            }
            GameScr.Paint("\u0110\u1ed9n th\u1ed5 ".concat(String.valueOf(int1)));
            Char.Move(Char.getMyChar().cx, Char.getMyChar().cy + int1);
            return true;
        }
        if (lowerCase.equals("l")) {
            if (int1 == 0) {
                int1 = 50;
            }
            GameScr.Paint("D\u1ecbch tr\u00e1i ".concat(String.valueOf(int1)));
            Char.Move(Char.getMyChar().cx - int1, Char.getMyChar().cy);
            return true;
        }
        if (lowerCase.equals("bang") || lowerCase.equals("fz")) {
            GameScr.Paint("\u0110\u00f3ng b\u0103ng");
            Code.Game30 = true;
            return Code.BangSkill = true;
        }
        if (lowerCase.equals("s")) {
            if (int1 == 0) {
                GameScr.Paint("Ch\u1ea1y \u0111i \u0111ou v\u1edbi t\u1ed1c \u0111\u1ed9 0?");
            }
            else if (int1 > 100) {
                GameScr.Paint("T\u1ed1c gi\u00e0y n\u00ean \u0111\u1ec3 <= 100 \u0111\u1ec3 ko b\u1ecb gi\u1eadt!");
            }
            else {
                GameScr.Paint("Fake t\u1ed1c ch\u1ea1y ".concat(String.valueOf(int1)));
                Code.Game33 = int1;
                Code.Game32 = true;
            }
            return true;
        }
        if (lowerCase.equals("r")) {
            if (int1 == 0) {
                int1 = 50;
            }
            GameScr.Paint("D\u1ecbch ph\u1ea3i ".concat(String.valueOf(int1)));
            Char.Move(Char.getMyChar().cx + int1, Char.getMyChar().cy);
            return true;
        }
        if (lowerCase.equals("g")) {
            final Char myChar;
            if ((myChar = Char.getMyChar()).charFocus != null) {
                GameScr.Paint("MoveTo " + myChar.charFocus.cName);
                Char.Move(myChar.charFocus.cx, myChar.charFocus.cy);
            }
            else if (myChar.npcFocus != null) {
                GameScr.Paint("MoveTo " + myChar.npcFocus.cName);
                Char.Move(myChar.npcFocus.cx, myChar.npcFocus.cy);
            }
            else if (myChar.mobFocus != null) {
                GameScr.Paint("MoveTo " + myChar.mobFocus.getTemplate().name);
                Char.Move(myChar.mobFocus.xFirst, myChar.mobFocus.yFirst);
            }
            else if (myChar.itemFocus != null) {
                GameScr.Paint("MoveTo " + myChar.itemFocus.template.name);
                Char.Move(myChar.itemFocus.x, myChar.itemFocus.y);
            }
            return true;
        }
        if (lowerCase.equals("chs")) {
            GameScr.Paint("X\u00f3a ds HS");
            Game18();
            return true;
        }
        if (s2.startsWith("hsl")) {
            GameScr.Paint((Code.BatTatHSL = (Code.BatTatHSL ? false : true)) ? " B\u1eadt HSL" : " T\u1eaft HSL");
            return true;
        }
        if (lowerCase.equals("pk")) {
            Code.BatTatPKAS = !Code.BatTatPKAS;
            GameScr.Paint(String.valueOf(Code.BatTatPKAS ? " B\u1eadt " : " T\u1eaft ") + "auto pk!");
            return true;
        }
        if (s2.startsWith("apk")) {
            final String[] slip3;
            if ((slip3 = Slip(s2, " ")).length > 1) {
                GameScr.Paint("Th\u00eam " + slip3[1] + " v\u00e0o ds PK");
                DSPK.Game1(slip3[1]);
            }
            else if (Char.getMyChar().charFocus != null) {
                GameScr.Paint("Th\u00eam " + Char.getMyChar().charFocus.cName + " v\u00e0o ds PK");
                DSPK.Game1(Char.getMyChar().charFocus.cName);
            }
            return true;
        }
        if (lowerCase.equals("hs")) {
            GameScr.Paint("Next to hirosaki");
            TileMap.GM(1);
            return true;
        }
        if (lowerCase.equals("hr")) {
            GameScr.Paint("Next to haruna");
            TileMap.GM(27);
            return true;
        }
        if (lowerCase.equals("tt")) {
            GameScr.Paint("Ng\u01b0\u1eddi Ch\u01a1i Xung Quang " + (Code.NhanVat ? "T\u1eaft" : "B\u1eadt"));
            Code.NhanVat = !Code.NhanVat;
            return true;
        }
        if (lowerCase.equals("k")) {
            GameScr.Paint("Chuy\u1ec3n Khu: ".concat(String.valueOf(int1)));
            GameScr.gI();
            GameScr.CK(int1);
            return true;
        }
        if (s2.startsWith("th")) {
            if (TileMap.mapID != 23) {
                GameScr.Paint("H\u00e3y V\u1ec1 : V\u00e1ch Ichidai");
                return true;
            }
            final String[] slip4 = Slip(s2, " ");
            int int2;
            try {
                int2 = Integer.parseInt(slip4[1]);
            }
            catch (Exception ex8) {
                return false;
            }
            GameScr.Paint("Auto T\u1eb7ng " + int2 + " B\u00f4ng Hoa");
            new Thread(new AutoSK(int2)).start();
            return true;
        }
        else {
            if (lowerCase.equals("oz")) {
                GameScr.Paint("Next to Ozawa(Oozaka)");
                TileMap.GM(72);
                return true;
            }
            if (lowerCase.equals("buff")) {
                GameScr.Paint("B\u1eadt Buff HS Xa");
                Game2(true, true);
                return true;
            }
            if (lowerCase.equals("bux")) {
                GameScr.Paint("B\u1eadt Buff Xa");
                Game2(true, false);
                return true;
            }
            if (lowerCase.equals("hsx")) {
                GameScr.Paint("B\u1eadt HS Xa");
                Game2(false, true);
                return true;
            }
            if (lowerCase.equals("kj")) {
                GameScr.Paint("Next to Kojin");
                TileMap.GM(10);
                return true;
            }
            if (s2.startsWith("ahs")) {
                final String[] slip5;
                if ((slip5 = Slip(s2, " ")).length > 1) {
                    GameScr.Paint("Th\u00eam " + slip5[1] + " v\u00e0o ds HS");
                    Game8(slip5[1]);
                }
                else if (Char.getMyChar().charFocus != null) {
                    GameScr.Paint("Th\u00eam " + Char.getMyChar().charFocus.cName + " v\u00e0o ds HS");
                    Game8(Char.getMyChar().charFocus.cName);
                }
                return true;
            }
            if (lowerCase.equals("dhs")) {
                final String[] slip6;
                if ((slip6 = Slip(s2, " ")).length > 1) {
                    GameScr.Paint("X\u00f3a " + slip6[1] + " kh\u1ecfi ds HS");
                    Game9(slip6[1]);
                }
                else if (Char.getMyChar().charFocus != null) {
                    GameScr.Paint("X\u00f3a " + Char.getMyChar().charFocus.cName + " kh\u1ecfi ds PK");
                    Game9(Char.getMyChar().charFocus.cName);
                }
                return true;
            }
            if (lowerCase.equals("sz")) {
                GameScr.Paint("Next to Sanzu");
                TileMap.GM(17);
                return true;
            }
            if (lowerCase.equals("tn")) {
                GameScr.Paint("Next to Tone");
                TileMap.GM(22);
                return true;
            }
            if (lowerCase.equals("lc")) {
                GameScr.Paint("Next to Ch\u00e0i");
                TileMap.GM(32);
                return true;
            }
            if (lowerCase.equals("sell")) {
                GameScr.Paint("Auto Sell");
                Game17();
                return true;
            }
            if (lowerCase.equals("xmap")) {
                Code.mMap = !Code.mMap;
                GameScr.Paint("X\u00f3a M\u00e1p " + (Code.mMap ? "B\u1eadt" : "T\u1eaft"));
                return true;
            }
            if (lowerCase.equals("xnpc")) {
                Code.mNpc = !Code.mNpc;
                GameScr.Paint("X\u00f3a Npc " + (Code.mNpc ? "B\u1eadt" : "T\u1eaft"));
                return true;
            }
            if (lowerCase.equals("xchar")) {
                Code.mChar = !Code.mChar;
                GameScr.Paint("X\u00f3a Ng\u01b0\u1eddi ch\u01a1i trong map " + (Code.mChar ? "B\u1eadt" : "T\u1eaft"));
                return true;
            }
            if (lowerCase.equals("line")) {
                Code.Line = !Code.Line;
                GameScr.Paint("Ch\u1ec9 \u0111\u01b0\u1eddng " + (Code.Line ? "B\u1eadt" : "T\u1eaft"));
                return true;
            }
            if (lowerCase.equals("ck")) {
                GameScr.Paint("Next to Chakumi");
                TileMap.GM(38);
                return true;
            }
            if (lowerCase.equals("eg")) {
                GameScr.Paint("Next to Echigo");
                TileMap.GM(43);
                return true;
            }
            if (lowerCase.equals("os")) {
                GameScr.Paint("Next to Oshin");
                TileMap.GM(48);
                return true;
            }
            return false;
        }
    }
    
    public static void S(final Auto t) {
        t.Landa = Code.T;
        Code.T = t;
    }
    
    public static boolean LuyenDa() {
        for (int i = 0; i < Char.LvLuyenDa - 1; ++i) {
            if (Char.Game11kk(i) >= 4) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean MoiVaoNhom(final String s) {
        if (s.equals(Char.getMyChar().cName)) {
            return true;
        }
        for (int i = 0; i < GameScr.vParty.size(); ++i) {
            if (((Party)GameScr.vParty.elementAt(i)).name.equals(s)) {
                return true;
            }
        }
        return false;
    }
    
    private static void Game9(final String s) {
        if (Code.Game9.contains(s)) {
            Code.Game9.removeElement(s);
            Game19();
        }
    }
    
    public static boolean NhatItem(final ItemTemplate itemTemplate) {
        if (Code.T instanceof Auto20) {
            if (itemTemplate.type == 19) {
                return true;
            }
            if ((itemTemplate.type == 16 || itemTemplate.type == 17) && itemTemplate.level == 10) {
                return true;
            }
            final Char myChar = Char.getMyChar();
            if (Char.KichThuocHanhTrang() <= 6) {
                return false;
            }
            if ((myChar.ctaskId < 13 || (myChar.ctaskId == 13 && myChar.arrItemBody[1] != null && myChar.arrItemBody[1].upgrade < 2)) && itemTemplate.type == 26 && itemTemplate.id > 0) {
                return true;
            }
            final int n = (myChar.cgender == 1) ? 124 : 125;
            return myChar.ctaskId <= 12 && ((itemTemplate.id == 174 && !Char.QuetItemTrongHT(174)) || (itemTemplate.id == n && !Char.QuetItemTrongHT(n)));
        }
        else {
            if (Code.T instanceof Auto10) {
                return itemTemplate.type == 19;
            }
            if (itemTemplate.type == 19) {
                return Char.isAPickYen;
            }
            if (itemTemplate.type == 16 || itemTemplate.type == 17) {
                return Char.NhatHPMP && itemTemplate.level >= Char.LvHPMP;
            }
            if (itemTemplate.type == 26) {
                return Char.NhatDa && itemTemplate.id >= Char.LvDa - 1;
            }
            if (itemTemplate.VPNV()) {
                return (Char.NhatTB || Code.T instanceof SanBoss) && itemTemplate.level >= Char.LvTrangBi;
            }
            if (itemTemplate.VPSK()) {
                return Char.NhatVPNV;
            }
            if (itemTemplate.type == 27) {
                if (itemTemplate.description.startsWith("V\u1eadt ph\u1ea9m s\u1ef1 ki\u1ec7n") || itemTemplate.description.startsWith("V\u1eadt ph\u1ea9m S\u1ef1 ki\u1ec7n")) {
                    return Char.NhatVPSK;
                }
                if (itemTemplate.name.startsWith("S\u00e1ch v\u00f5 c\u00f4ng")) {
                    return Char.NhatSVC;
                }
                if (TileMap.typePk(TileMap.mapID) && itemTemplate.id == 38) {
                    return false;
                }
            }
            for (int i = 0; i < Code.ShortItemNhat.length; ++i) {
                if (Code.ShortItemNhat[i] > 0 && itemTemplate.id == Code.ShortItemNhat[i]) {
                    return true;
                }
            }
            return Char.NhatAll;
        }
    }
    
    public static MyVector Game7() {
        final MyVector myVector = new MyVector();
        for (int i = 0; i < Code.Game9.size(); ++i) {
            myVector.addElement(String.valueOf(i) + ". " + (String)Code.Game9.elementAt(i));
        }
        return myVector;
    }
    
    public static void Game3() {
        LockGame.LockAll();
        Code.T = Code.T.Landa;
    }
    
    private static void Game16() {
        Code.tudanh.auto_D();
        S(Code.tudanh);
    }
    
    public static void Game4() {
        Code.Game4.auto_D();
        S(Code.Game4);
    }
    
    public static void Game6() {
        LockGame.LockAll();
        Code.T = null;
    }
    
    private static void Game18() {
        Code.Game9.removeAllElements();
        Game19();
    }
    
    public static void Game5() {
        Code.tathu.auto_D();
        S(Code.tathu);
    }
    
    public static void Game6(final short n) {
        for (int i = 0; i < Code.Boradat.length; ++i) {
            if (Code.Boradat[i] == n) {
                Code.Boradat[i] = -1;
            }
        }
    }
    
    public static void Game15() {
        for (int i = 0; i < Code.Boradat.length; ++i) {
            if (Code.Boradat[i] > 0) {
                for (int j = 0; j <= i; ++j) {
                    if (Code.Boradat[j] == -1) {
                        final int n = j;
                        final short[] boradat = Code.Boradat;
                        boradat[n] = boradat[i];
                        Code.Boradat[i] = -1;
                        break;
                    }
                }
            }
        }
    }
    
    public static void Game5(final short n) {
        for (int i = 0; i < Code.Boradat.length; ++i) {
            if (Code.Boradat[i] == n) {
                return;
            }
        }
        int length = -1;
        for (int j = 0; j < Code.Boradat.length; ++j) {
            if (Code.Boradat[j] < 0) {
                length = j;
                break;
            }
        }
        if (length == -1) {
            length = Code.Boradat.length;
            final short[] boradat;
            System.arraycopy(boradat = new short[Code.Boradat.length + 10], 0, Code.Boradat, 0, Code.Boradat.length);
            for (int k = Code.Boradat.length; k < boradat.length; ++k) {
                boradat[k] = -1;
            }
            Code.Boradat = boradat;
        }
        Code.Boradat[length] = n;
    }
    
    private static boolean Game5(final Item item) {
        if (Code.T instanceof Auto10) {
            return false;
        }
        if (item == null) {
            return false;
        }
        if (item.upgrade > 0) {
            item.Game22 = true;
            return false;
        }
        for (int i = 0; i < Code.Boradat.length; ++i) {
            if (Code.Boradat[i] > 0 && item.template.id == Code.Boradat[i]) {
                return true;
            }
        }
        if (item.Game22 || System.currentTimeMillis() - item.Game21 < 5000L) {
            return false;
        }
        if (Code.T instanceof SanBoss && !Char.NhatTB && item.template.type < 10 && item.template.level < 70) {
            return true;
        }
        if (item.template.type == 26 && item.template.id < (Char.NhatDa ? Char.LvDa : Char.LvLuyenDa) - 1) {
            return true;
        }
        if (item.template.type < 10 || (item.template.type >= 29 && item.template.type <= 32)) {
            if (item.template.type < 10 && !Char.NhatTB) {
                return item.template.level < 70;
            }
            if (!item.Game19 && System.currentTimeMillis() - item.Game20 > 5000L) {
                item.Game20 = System.currentTimeMillis();
                Service.gI().requestItemInfo(item.typeUI, item.playerId);
                if (!LockGame.LockSellBuy() || !item.Game19) {
                    return false;
                }
            }
            if (item.Game2(85)) {
                item.Game22 = true;
                return false;
            }
            if (item.template.type >= 29 && item.template.type <= 32) {
                if (item.saleCoinLock != 0) {
                    item.Game22 = true;
                    return false;
                }
                return true;
            }
            else {
                if (item.saleCoinLock == 5) {
                    return true;
                }
                boolean b = false;
                Label_0436: {
                    if (item.options != null) {
                        for (int j = 0; j < item.options.size(); ++j) {
                            final ItemOption itemOption;
                            if ((itemOption = (ItemOption)item.options.elementAt(j)) != null && itemOption.optionTemplate.type == 2) {
                                b = true;
                                break Label_0436;
                            }
                        }
                    }
                    b = false;
                }
                if (!b) {
                    return true;
                }
                if (item.template.type == 1) {
                    if (!item.Game2(0) || !item.Game2(1)) {
                        return true;
                    }
                    if (!item.Game2(8) && !item.Game2(9)) {
                        return true;
                    }
                    if (!item.Game2(10)) {
                        return true;
                    }
                    item.Game22 = true;
                    return false;
                }
                else {
                    if (!item.Game2(6) || !item.Game2(7)) {
                        return true;
                    }
                    if (item.Game3(0) < 2) {
                        return true;
                    }
                    if (item.template.type == 8 && !item.Game2(16)) {
                        return true;
                    }
                    if (Char.NhatTBLa) {
                        if (item.Game3(0) > 2 || item.Game3(1) > 2 || item.Game3(2) > 2 || item.Game3(3) > 1 || item.Game3(4) > 1 || item.Game3(5) > 1 || item.Game3(6) > 1 || item.Game3(7) > 1) {
                            item.Game22 = true;
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        item.Game22 = true;
        return false;
    }
    
    public static void Game1(final short n) {
        for (int i = 0; i < Code.ShortItemNhat.length; ++i) {
            if (Code.ShortItemNhat[i] == n) {
                return;
            }
        }
        int length = -1;
        for (int j = 0; j < Code.ShortItemNhat.length; ++j) {
            if (Code.ShortItemNhat[j] < 0) {
                length = j;
                break;
            }
        }
        if (length == -1) {
            length = Code.ShortItemNhat.length;
            final short[] shortItemNhat;
            System.arraycopy(shortItemNhat = new short[Code.ShortItemNhat.length + 10], 0, Code.ShortItemNhat, 0, Code.ShortItemNhat.length);
            for (int k = Code.ShortItemNhat.length; k < shortItemNhat.length; ++k) {
                shortItemNhat[k] = -1;
            }
            Code.ShortItemNhat = shortItemNhat;
        }
        Code.ShortItemNhat[length] = n;
    }
    
    public static boolean Game1(final String s) {
        return Code.Game9.contains(s);
    }
    
    public static void Game12() {
        for (int i = 0; i < Code.ShortItemNhat.length; ++i) {
            if (Code.ShortItemNhat[i] > 0) {
                for (int j = 0; j <= i; ++j) {
                    if (Code.ShortItemNhat[j] == -1) {
                        final int n = j;
                        final short[] shortItemNhat = Code.ShortItemNhat;
                        shortItemNhat[n] = shortItemNhat[i];
                        Code.ShortItemNhat[i] = -1;
                        break;
                    }
                }
            }
        }
    }
    
    public static boolean Game2(final String s) {
        if (Code.CharPartyGrup == null || MoiVaoNhom(s)) {
            return false;
        }
        final String cName;
        if ((cName = Char.getMyChar().cName).equals(Code.CharPartyGrup)) {
            if (Game3(s)) {
                return true;
            }
        }
        else if (GameScr.vParty.size() > 1 && cName.equals(GameScr.vParty.firstElement().name) && s.equals(Code.CharPartyGrup)) {
            return true;
        }
        return false;
    }
    
    public static boolean Game3(final String s) {
        for (int i = 0; i < Code.Game8.size(); ++i) {
            if (s.equals(Code.Game8.elementAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    public static String Game11() {
        String string = "";
        for (int i = 0; i < Code.DanhSachKhu.length; ++i) {
            string = String.valueOf(string) + ((i == Code.DanhSachKhu.length - 1) ? String.valueOf(Code.DanhSachKhu[i]) : (String.valueOf(Code.DanhSachKhu[i]) + " "));
        }
        return string;
    }
    
    private static void Game17() {
        Code.Game6.auto_D();
        S(Code.Game6);
    }
    
    public static void Game4(final String s, final String s2) {
        if (!Char.DanhTheoNhom || Code.CharPartyGrup == null || !s.equals(Code.CharPartyGrup) || Char.getMyChar().cName.equals(Code.CharPartyGrup)) {
            return;
        }
        final String[] game3 = Game3(s2, " ");
        try {
            if (game3[0].equals("dcvt")) {
                Code.BatTatDanhChuyenVitri = (Integer.parseInt(game3[1]) == 1);
                return;
            }
            if (game3[0].equals("avt")) {
                GameScr.Paint("Th\u00eam v\u1ecb tr\u00ed " + Code.avtx.size());
                Code.avtx.addElement(Integer.valueOf(game3[1]));
                Code.avty.addElement(Integer.valueOf(game3[2]));
                return;
            }
            if (game3[0].equals("dvt")) {
                GameScr.Paint("X\u00f3a h\u1ebft v\u1ecb tr\u00ed");
                Code.avtx.removeAllElements();
                Code.avty.removeAllElements();
                return;
            }
            if (game3[0].equals("dvtx")) {
                final int int1 = Integer.parseInt(game3[1]);
                GameScr.Paint("X\u00f3a v\u1ecb tr\u00ed ".concat(String.valueOf(int1)));
                Code.avtx.removeElementAt(int1);
                Code.avty.removeElementAt(int1);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void Game2(final String s, final String s2) {
        if (Code.T instanceof AutoSell) {
            Code.Game6.Game1(s, s2);
        }
    }
    
    public static void Game4(final short n) {
        for (int i = 0; i < Code.Itemdell.length; ++i) {
            if (Code.Itemdell[i] == n) {
                Code.Itemdell[i] = -1;
            }
        }
    }
    
    public static void Game13() {
        for (int i = 0; i < Code.Itemdell.length; ++i) {
            if (Code.Itemdell[i] > 0) {
                for (int j = 0; j <= i; ++j) {
                    if (Code.Itemdell[j] == -1) {
                        final int n = j;
                        final short[] itemdell = Code.Itemdell;
                        itemdell[n] = itemdell[i];
                        Code.Itemdell[i] = -1;
                        break;
                    }
                }
            }
        }
    }
    
    public static boolean Game4(final Item item) {
        if (Code.T instanceof Auto10) {
            return false;
        }
        if (item == null) {
            return false;
        }
        if (item.upgrade > 0) {
            item.Game22 = true;
            return false;
        }
        for (int i = 0; i < Code.Itemdell.length; ++i) {
            if (Code.Itemdell[i] > 0 && item.template.id == Code.Itemdell[i]) {
                return true;
            }
        }
        if (item.Game22 || System.currentTimeMillis() - item.Game21 < 5000L) {
            return false;
        }
        if (Code.T instanceof SanBoss && !Char.NhatTB && item.template.type < 10 && item.template.level < 70) {
            return true;
        }
        if (item.template.type == 26 && item.template.id < (Char.NhatDa ? Char.LvDa : Char.LvLuyenDa) - 1) {
            return true;
        }
        if (item.template.type < 10 || (item.template.type >= 29 && item.template.type <= 32)) {
            if (item.template.type < 10 && !Char.NhatTB) {
                return item.template.level < 70;
            }
            if (!item.Game19 && System.currentTimeMillis() - item.Game20 > 5000L) {
                item.Game20 = System.currentTimeMillis();
                Service.gI().requestItemInfo(item.typeUI, item.playerId);
                if (!LockGame.LockSellBuy() || !item.Game19) {
                    return false;
                }
            }
            if (item.Game2(85)) {
                item.Game22 = true;
                return false;
            }
            if (item.template.type >= 29 && item.template.type <= 32) {
                if (item.saleCoinLock != 0) {
                    item.Game22 = true;
                    return false;
                }
                return true;
            }
            else {
                if (item.saleCoinLock == 5) {
                    return true;
                }
                boolean b = false;
                Label_0436: {
                    if (item.options != null) {
                        for (int j = 0; j < item.options.size(); ++j) {
                            final ItemOption itemOption;
                            if ((itemOption = (ItemOption)item.options.elementAt(j)) != null && itemOption.optionTemplate.type == 2) {
                                b = true;
                                break Label_0436;
                            }
                        }
                    }
                    b = false;
                }
                if (!b) {
                    return true;
                }
                if (item.template.type == 1) {
                    if (!item.Game2(0) || !item.Game2(1)) {
                        return true;
                    }
                    if (!item.Game2(8) && !item.Game2(9)) {
                        return true;
                    }
                    if (!item.Game2(10)) {
                        return true;
                    }
                    item.Game22 = true;
                    return false;
                }
                else {
                    if (!item.Game2(6) || !item.Game2(7)) {
                        return true;
                    }
                    if (item.Game3(0) < 2) {
                        return true;
                    }
                    if (item.template.type == 8 && !item.Game2(16)) {
                        return true;
                    }
                    if (Char.NhatTBLa) {
                        if (item.Game3(0) > 2 || item.Game3(1) > 2 || item.Game3(2) > 2 || item.Game3(3) > 1 || item.Game3(4) > 1 || item.Game3(5) > 1 || item.Game3(6) > 1 || item.Game3(7) > 1) {
                            item.Game22 = true;
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        item.Game22 = true;
        return false;
    }
    
    public static void Game3(final short n) {
        for (int i = 0; i < Code.Itemdell.length; ++i) {
            if (Code.Itemdell[i] == n) {
                return;
            }
        }
        int length = -1;
        for (int j = 0; j < Code.Itemdell.length; ++j) {
            if (Code.Itemdell[j] < 0) {
                length = j;
                break;
            }
        }
        if (length == -1) {
            length = Code.Itemdell.length;
            final short[] itemdell;
            System.arraycopy(itemdell = new short[Code.Itemdell.length + 10], 0, Code.Itemdell, 0, Code.Itemdell.length);
            for (int k = Code.Itemdell.length; k < itemdell.length; ++k) {
                itemdell[k] = -1;
            }
            Code.Itemdell = itemdell;
        }
        Code.Itemdell[length] = n;
    }
    
    static {
        Code.Line = true;
        Code.code = new Code();
        Code.DKChay = false;
        Code.BatTatHSL = true;
        Code.tansat = new TanSat();
        Code.sanbos = new SanBoss();
        Code.Game4 = new NVHN();
        Code.tathu = new AutoTaThu();
        Code.tudanh = new TuDanh();
        Code.buff = new Buff();
        Code.Game6 = new AutoSell();
        Code.CharPartyGrup = null;
        Code.Game8 = new MyVector();
        Code.Game58 = new MyVector();
        Code.Game9 = new MyVector();
        try {
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TaskOrder.Loaddata("V6Group"));
            final DataInputStream dataInputStream;
            if ((Code.CharPartyGrup = (dataInputStream = new DataInputStream(byteArrayInputStream)).readUTF()).equals("")) {
                Code.CharPartyGrup = null;
            }
            for (byte byte1 = dataInputStream.readByte(), b = 0; b < byte1; ++b) {
                Code.Game8.addElement(dataInputStream.readUTF());
            }
            for (int int1 = dataInputStream.readInt(), i = 0; i < int1; ++i) {
                Code.Game9.addElement(dataInputStream.readUTF());
            }
            dataInputStream.close();
            byteArrayInputStream.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        Code.Game50 = 0L;
        Code.Game51 = 0L;
        Code.Game57 = new String(new char[] { 'T', 'i', 'M', 'i', 'B', 'l', 'o', 'g', '.', 'C', 'o', 'm' });
        Code.ShortItemNhat = new short[30];
        Code.Boradat = new short[30];
        Code.Itemdell = new short[30];
        Code.KCNhatXa = -1;
        Code.KCTSat = -1;
        Code.KCTScx = -1;
        Code.KCTScy = -1;
        Code.Game42 = 1;
        Code.Game41 = 100L;
        Code.BatTatNhatXa = false;
        Code.BatTatDanhChuyenVitri = false;
        Code.avtx = new MyVector();
        Code.avty = new MyVector();
        Code.DanhCK = false;
        Code.DanhSachKhu = new int[0];
        Code.Game24 = false;
        Code.Game25 = 40;
        Code.Log2a = 0L;
        Code.Game53 = new MyVector();
        Code.Game54 = new MyVector();
        Code.Game55 = 0L;
        Code.Game26 = new MyVector();
        Code.Game27 = new MyVector();
        for (int j = 0; j < Code.Boradat.length; ++j) {
            Code.Boradat[j] = -1;
        }
        for (int k = 0; k < Code.ShortItemNhat.length; ++k) {
            Code.ShortItemNhat[k] = -1;
        }
        for (int l = 0; l < Code.Itemdell.length; ++l) {
            Code.Itemdell[l] = -1;
        }
        Code.log = 0L;
        Code.Game29 = 0L;
        Code.Game30 = false;
        Code.BangSkill = false;
        Code.Game32 = false;
        Code.Game33 = 5;
        Code.Game34 = false;
        Code.Game35 = 100;
        Code.Game36 = false;
        Code.Game37 = 100;
        Code.Game38 = false;
        Code.Game39 = 100;
        Code.BatTatPKAS = false;
        try {
            Code.Game56 = Game3(Game10("text.txt"), "\n");
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
            Code.Game56 = new String[0];
        }
    }
}
