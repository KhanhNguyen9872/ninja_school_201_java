import java.io.InputStream;
import java.io.ByteArrayInputStream;
import main.GameMidlet;
import javax.microedition.lcdui.Image;
import java.io.DataInputStream;
import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Controller
{
    public static Controller Class1;
    private Message Class2;
    private static String[] Game3;
    private static String Game4;
    private static String Game5;
    private static String Game6;
    private static String Game7;
    private static String Game8;
    private static String Game9;
    public static MyVector tansat;
    
    private static Controller Class2() {
        if (Controller.Class1 == null) {
            Controller.Class1 = new Controller();
        }
        return Controller.Class1;
    }
    
    public static void Class1() {
        GameCanvas.Class1(Game86.Class129, 8884);
    }
    
    private static void Class2(final Message message) {
        try {
            final Item item;
            (item = GameScr.Class97.arrItemBody[message.Class4.readUnsignedByte()]).Class6 = message.Class4.readLong();
            item.saleCoinLock = message.Class4.readInt();
            item.Class8 = message.Class4.readByte();
            item.options = new MyVector();
            try {
                while (true) {
                    item.options.addElement(new ItemOption(message.Class4.readUnsignedByte(), message.Class4.readInt()));
                }
            }
            catch (Exception ex2) {}
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void Class3(final Message message) {
        try {
            Item class1 = null;
            final int int1 = message.Class4.readInt();
            for (int i = 0; i < GameScr.Class81.length; ++i) {
                if (GameScr.Class81[i].Class1.Class3 == int1) {
                    class1 = GameScr.Class81[i].Class1;
                    break;
                }
            }
            class1.typeUI = 37;
            class1.Class6 = -1L;
            class1.saleCoinLock = message.Class4.readInt();
            if (class1.Class2() || class1.Class4()) {
                class1.options = new MyVector();
                try {
                    class1.upgrade = message.Class4.readByte();
                    class1.Class8 = message.Class4.readByte();
                    while (true) {
                        class1.options.addElement(new ItemOption(message.Class4.readUnsignedByte(), message.Class4.readInt()));
                    }
                }
                catch (Exception ex2) {}
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final void Class1(final Message class2) {
        Label_18109: {
            try {
                Label_1136: {
                    switch (class2.Class1) {
                        case 125: {
                            final byte byte1;
                            if ((byte1 = class2.Class1().readByte()) == 0) {
                                Class14(class2);
                                break Label_18109;
                            }
                            if (byte1 == 1) {
                                Class15(class2);
                                break Label_18109;
                            }
                            if (byte1 == 2) {
                                Class16(class2);
                            }
                            break Label_18109;
                        }
                        case 124: {
                            Class13(class2);
                            break Label_18109;
                        }
                        case 123: {
                            final byte byte2;
                            if ((byte2 = class2.Class1().readByte()) == 0) {
                                GameCanvas.Class50 = true;
                                break Label_18109;
                            }
                            if (byte2 == 1) {
                                GameCanvas.Class50 = false;
                                break Label_18109;
                            }
                            if (byte2 == 2) {
                                GameCanvas.Class49 = true;
                                TaskOrder.Class1("isKiemduyet", 0);
                                break Label_18109;
                            }
                            GameCanvas.Class49 = false;
                            TaskOrder.Class1("isKiemduyet", 1);
                            break Label_18109;
                        }
                        case 122: {
                            final byte byte3;
                            if ((byte3 = class2.Class1().readByte()) == 0) {
                                Class9(class2);
                                break Label_18109;
                            }
                            if (byte3 == 1) {
                                Class10(class2);
                                break Label_18109;
                            }
                            if (byte3 == 2) {
                                Class12(class2);
                                break Label_18109;
                            }
                            if (byte3 == 3) {
                                Class11(class2);
                            }
                            break Label_18109;
                        }
                        case 121: {
                            GameScr.Class35.removeAllElements();
                            for (int unsignedByte = class2.Class1().readUnsignedByte(), i = 0; i < unsignedByte; ++i) {
                                try {
                                    final Game60 game60;
                                    (game60 = new Game60()).Class2 = class2.Class1().readUTF();
                                    game60.Class1 = class2.Class1().readInt();
                                    game60.Class3 = class2.Class1().readUTF();
                                    GameScr.Class35.addElement(game60);
                                }
                                catch (Exception ex8) {}
                            }
                            GameScr.gI().Class17();
                            break Label_18109;
                        }
                        case 119: {
                            final byte byte4;
                            if ((byte4 = class2.Class1().readByte()) == -1) {
                                GameScr.Class1(GameScr.Class150 = true);
                                if ((GameScr.Class167 = class2.Class1().readInt()) > 360) {
                                    GameScr.Class151 = true;
                                    break Label_18109;
                                }
                                GameScr.Class151 = false;
                                GameScr.Class165 = Char.getMyChar().cx;
                                GameScr.Class166 = Char.getMyChar().cy;
                                break Label_18109;
                            }
                            else {
                                if (byte4 != 0) {
                                    GameScr.Class150 = false;
                                    GameScr.Class154 = 0;
                                    break Label_18109;
                                }
                                final Char class3;
                                if ((class3 = GameScr.Class5(class2.Class1().readInt())) != null) {
                                    Game16.Class1(141, class3.cx, class3.cy, 2);
                                    class3.Class130 = class2.Class1().readShort();
                                    class3.Class131 = class2.Class1().readShort();
                                    Game16.Class1(141, class3.cx, class3.cy, 2);
                                }
                                break Label_18109;
                            }
                            break;
                        }
                        case 118: {
                            final String utf = class2.Class1().readUTF();
                            TaskOrder.Class1("acc", utf);
                            final String utf2 = class2.Class1().readUTF();
                            TaskOrder.Class1("pass", utf2);
                            Game69.Class8 = utf;
                            Game69.Class9 = utf2;
                            Game69.Class10 = "";
                            Game69.Class11 = "";
                            if (!utf.startsWith("tmpusr")) {
                                GameScr.gI().switchToMe();
                            }
                            break Label_18109;
                        }
                        case 117: {
                            if (GameCanvas.Class1) {
                                break;
                            }
                            try {
                                Mob.Class27.removeAllElements();
                                TileMap.Class23.clear();
                                GameScr.Class143.removeAllElements();
                                GameScr.Class144.removeAllElements();
                                GameScr.Class142.removeAllElements();
                                for (byte byte5 = class2.Class1().readByte(), b = 0; b < byte5; ++b) {
                                    final String string = new StringBuffer(String.valueOf(class2.Class1().readShort())).toString();
                                    final byte[] b2 = new byte[class2.Class1().readInt()];
                                    class2.Class1().read(b2);
                                    TileMap.Class23.Class1(string, Class1(b2));
                                }
                                for (int unsignedByte2 = class2.Class1().readUnsignedByte(), j = 0; j < unsignedByte2; ++j) {
                                    final Game54 game61;
                                    (game61 = new Game54(class2.Class1().readUnsignedByte(), class2.Class1().readUnsignedByte())).Class1 = class2.Class1().readUnsignedByte();
                                    GameScr.Class143.addElement(game61);
                                }
                                for (int unsignedByte3 = class2.Class1().readUnsignedByte(), k = 0; k < unsignedByte3; ++k) {
                                    final Game54 game62;
                                    (game62 = new Game54(class2.Class1().readUnsignedByte(), class2.Class1().readUnsignedByte())).Class1 = class2.Class1().readUnsignedByte();
                                    GameScr.Class144.addElement(game62);
                                }
                                for (int unsignedByte4 = class2.Class1().readUnsignedByte(), l = 0; l < unsignedByte4; ++l) {
                                    final Game54 game63;
                                    (game63 = new Game54(class2.Class1().readUnsignedByte(), class2.Class1().readUnsignedByte())).Class1 = class2.Class1().readUnsignedByte();
                                    GameScr.Class142.addElement(game63);
                                }
                            }
                            catch (Exception ex) {
                                ex.printStackTrace();
                            }
                            break Label_18109;
                        }
                        case -21: {
                            final String utf3 = class2.Class1().readUTF();
                            final String utf4 = class2.Class1().readUTF();
                            ChatManager.gI().Chat(Game86.Class402[0], utf3, utf4);
                            if (!ChatManager.Class4) {
                                Info.addInfo(String.valueOf(utf3) + ": " + utf4, 80, mFont.Class6);
                            }
                            break Label_18109;
                        }
                        case -20: {
                            ChatManager.gI().Chat(Game86.Class401[0], class2.Class1().readUTF(), class2.Class1().readUTF());
                            if (!GameScr.Class96 || ChatManager.gI().Class5().Class1 != 1) {
                                ChatManager.gI();
                                ChatManager.Class7 = true;
                            }
                            break Label_18109;
                        }
                        case -22: {
                            final String utf5 = class2.Class1().readUTF();
                            final String utf6 = class2.Class1().readUTF();
                            final ChatManager gi = ChatManager.gI();
                            final String s = utf5;
                            gi.Chat(s, s, utf6);
                            if ((!GameScr.Class96 || !ChatManager.gI().Class5().Class2.equals(utf5)) && !ChatManager.Class5) {
                                ChatManager.gI().Class3(utf5);
                            }
                            final Code code = Code.code;
                            Code.Game2(utf5, utf6);
                            break Label_18109;
                        }
                        case -19: {
                            ChatManager.gI().Chat(Game86.Class403[0], class2.Class1().readUTF(), class2.Class1().readUTF());
                            if (!GameScr.Class96 || ChatManager.gI().Class5().Class1 != 4) {
                                ChatManager.Class6 = true;
                            }
                            break Label_18109;
                        }
                        case -26: {
                            final String utf7;
                            GameCanvas.setText(utf7 = class2.Class1().readUTF());
                            boolean equals = false;
                            boolean equals2 = false;
                            if (utf7.startsWith(Controller.Game3[0])) {
                                int int1 = 0;
                                try {
                                    int1 = Integer.parseInt(utf7.substring(Controller.Game3[0].length(), utf7.indexOf(Controller.Game3[1])).trim());
                                }
                                catch (Exception ex2) {
                                    ex2.printStackTrace();
                                }
                                Session_ME.gI().EndQuit();
                                Session_ME.islock = false;
                                Session_ME.Huyobj();
                                GameCanvas.intkeyn = int1;
                                GameCanvas.Log2 = (GameCanvas.Log1 = System.currentTimeMillis());
                                break Label_18109;
                            }
                            if (utf7.equals(Controller.Game9)) {
                                LockGame.Game18();
                                break Label_18109;
                            }
                            if (TileMap.isLockMap && (utf7.equals(Controller.Game4) || (equals = utf7.equals(Controller.Game5)) || (equals2 = utf7.equals(Controller.Game6)) || utf7.equals(Controller.Game8) || utf7.startsWith(Controller.Game7))) {
                                if (Code.T != null && TileMap.Game7hend(TileMap.mapID)) {
                                    if (equals) {
                                        final int game9ad;
                                        if ((game9ad = TileMap.Game9ad(Code.T.iDMap)) > 0) {
                                            Code.T.iDMap = game9ad;
                                        }
                                        Code.T.cxL = -1;
                                    }
                                    else if (equals2) {
                                        final int vitriHaDong;
                                        if ((vitriHaDong = TileMap.VitriHaDong(Code.T.iDMap)) > 0) {
                                            Code.T.iDMap = vitriHaDong;
                                        }
                                        Code.T.cxL = -1;
                                    }
                                }
                                if (TileMap.IsDangGoMap) {
                                    TileMap.IsDangGoMap = false;
                                }
                                else {
                                    GameCanvas.endDlg();
                                }
                                TileMap.HuyLockMap();
                            }
                            break Label_18109;
                        }
                        case -24: {
                            final String utf8;
                            if ((utf8 = class2.Class1().readUTF()).indexOf("\u0111ang \u0111\u1ee9ng nh\u00ecn b\u1ea1n") > 0) {
                                Code.Game7(utf8.substring(0, utf8.indexOf("\u0111ang \u0111\u1ee9ng nh\u00ecn b\u1ea1n")).trim());
                            }
                            else if (Char.TuSat && Code.T != null && utf8.equals("Kh\u00f4ng \u0111\u1ee7 MP \u0111\u1ec3 s\u1eed d\u1ee5ng")) {
                                Auto.Login2 = true;
                            }
                            else if (LockGame.isPk && utf8.equals("V\u1eadt ph\u1ea9m c\u1ee7a ng\u01b0\u1eddi kh\u00e1c")) {
                                LockGame.Lockspk();
                                final ItemMap itemFocus;
                                if ((itemFocus = Char.getMyChar().itemFocus) != null) {
                                    itemFocus.boolItem = true;
                                }
                            }
                            else if (Code.T instanceof SanBoss) {
                                if (Code.sanbos.Game1 == 2 && utf8.equals("C\u1eeda hang \u0111\u1ed9ng \u0111\u00e3 \u0111\u01b0\u1ee3c kh\u00e9p l\u1ea1i.")) {
                                    SanBoss.Game25 = true;
                                }
                                else if (Code.sanbos.Game1 == 4 && utf8.equals("Chi\u1ebfn tr\u01b0\u1eddng \u0111\u00e3 kh\u00e9p l\u1ea1i, xem k\u1ebft qu\u1ea3 t\u1ea1i Npc Rikudou.")) {
                                    SanBoss.MyLenga = true;
                                    TileMap.HuyLockMap();
                                }
                            }
                            else if (Code.CharPartyGrup != null && !Code.CharPartyGrup.equals(Char.getMyChar().cName) && utf8.equals("\u0110\u1ed1i ph\u01b0\u01a1ng \u0111ang \u1edf trong nh\u00f3m kh\u00e1c.")) {
                                Service.gI().outParty();
                            }
                            InfoMe.addInfo(utf8, 50, mFont.Class12);
                            break Label_18109;
                        }
                        case -25: {
                            final String utf9;
                            Info.addInfo(utf9 = class2.Class1().readUTF(), 150, mFont.Class6);
                            ChatManager.gI().Chat(Game86.Class402[0], Game86.Class458, utf9);
                            break Label_18109;
                        }
                        case 53: {
                            GameScr.gI().Class22();
                            final String utf10;
                            if (!(utf10 = class2.Class1().readUTF()).equals("typemoi")) {
                                GameScr.gI().showAlert(utf10, class2.Class1().readUTF(), false);
                                break Label_18109;
                            }
                            GameScr.gI().Class1(class2.Class1().readUTF(), class2.Class1().readShort(), class2.Class1().readUTF(), class2.Class1().readShort(), class2.Class1().readUTF(), class2.Class1().readShort(), class2.Class1().readUTF(), class2.Class1().readUTF(), class2.Class1().readByte());
                            break Label_18109;
                        }
                        case 54: {
                            GameCanvas.Class1().Class1(class2.Class1().readUTF(), class2.Class1().readUTF(), class2.Class1().readUTF(), class2.Class1().readUTF());
                            break Label_18109;
                        }
                        case 55: {
                            GameCanvas.Class1().Class1(class2.Class1().readUTF(), class2.Class1().readUTF(), class2.Class1().readShort(), class2.Class1().readUTF(), class2.Class1().readUTF());
                            break Label_18109;
                        }
                        case 57: {
                            GameCanvas.endDlg();
                            GameScr.gI().Class22();
                            AutoSell.cx2 = true;
                            LockGame.HuySella();
                            break Label_18109;
                        }
                        case 58: {
                            GameScr.arrItemTradeMe = null;
                            GameScr.arrItemTradeOrder = null;
                            if (GameScr.gI().coinTradeOrder > 0) {
                                final GameScr gi2 = GameScr.gI();
                                gi2.Class133 = String.valueOf(gi2.Class133) + ", " + GameScr.gI().coinTradeOrder + " " + Game86.Class287;
                                GameScr.Class1("+" + GameScr.gI().coinTradeOrder, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().Class59 - 10, 6);
                            }
                            final GameScr gi3 = GameScr.gI();
                            final GameScr gi4 = GameScr.gI();
                            final int n = 0;
                            gi4.coinTradeOrder = n;
                            gi3.coinTrade = n;
                            GameScr.gI().Class22();
                            Char.getMyChar().xu = class2.Class1().readInt();
                            InfoDlg.hide();
                            if (!GameScr.gI().Class133.equals("")) {
                                InfoMe.Class1(String.valueOf(Game86.Class299) + " " + GameScr.gI().Class133);
                            }
                            LockGame.HuySella();
                            break Label_18109;
                        }
                        case 59: {
                            final String utf11 = class2.Class1().readUTF();
                            final Game80 game64 = new Game80(utf11, (byte)4);
                            GameScr.Class36.addElement(game64);
                            InfoMe.addInfo(String.valueOf(utf11) + " " + Game86.Class243, 20, mFont.number_red);
                            if (!GameScr.Class91) {
                                break Label_18109;
                            }
                            boolean b3 = false;
                            for (int n2 = 0; n2 < GameScr.Class34.size(); ++n2) {
                                if (((Game80)GameScr.Class34.elementAt(n2)).Class1.equals(utf11)) {
                                    b3 = true;
                                    break;
                                }
                            }
                            if (!b3) {
                                GameScr.Class34.addElement(game64);
                                GameScr.gI();
                                GameScr.Class3(0);
                                GameScr.indexRow = 0;
                                GameScr.Class50.Class1();
                            }
                            break Label_18109;
                        }
                        case 79: {
                            final int int2 = class2.Class1().readInt();
                            GameCanvas.Class1(String.valueOf(class2.Class1().readUTF()) + " " + Game86.Class337, 8887, int2, 8888, int2);
                            break Label_18109;
                        }
                        case 82: {
                            GameScr.vParty.removeAllElements();
                            final boolean boolean1 = class2.Class1().readBoolean();
                            try {
                                for (int n3 = 0; n3 < 6; ++n3) {
                                    GameScr.vParty.addElement(new Party(class2.Class1().readInt(), class2.Class1().readByte(), class2.Class1().readUTF(), boolean1));
                                }
                            }
                            catch (Exception ex9) {}
                            GameScr.gI().Class20();
                            break Label_18109;
                        }
                        case 83: {
                            GameScr.vParty.removeAllElements();
                            GameScr.gI().Class20();
                            break Label_18109;
                        }
                        case 84: {
                            final Game80 game65 = new Game80(class2.Class1().readUTF(), class2.Class1().readByte());
                            GameScr.gI();
                            GameScr.setText(game65.Class1);
                            if (game65.Class2 == 0) {
                                InfoMe.Class1(String.valueOf(Game86.Class244) + " " + game65.Class1 + " " + Game86.Class245);
                                GameScr.Class34.addElement(game65);
                            }
                            else if (game65.Class2 == 1) {
                                for (int n4 = 0; n4 < GameScr.Class34.size(); ++n4) {
                                    if (((Game80)GameScr.Class34.elementAt(n4)).Class1.equals(game65.Class1)) {
                                        GameScr.Class34.removeElementAt(n4);
                                        break;
                                    }
                                }
                                InfoMe.Class1(String.valueOf(Game86.Class246) + " " + game65.Class1 + " " + Game86.Class133);
                                game65.Class2 = 3;
                                GameScr.Class34.insertElementAt(game65, 0);
                            }
                            if (GameScr.Class91) {
                                GameScr.gI();
                                GameScr.Class3(0);
                                GameScr.indexRow = 0;
                                GameScr.Class50.Class1();
                            }
                            break Label_18109;
                        }
                        case 85: {
                            final Mob class4;
                            if ((class4 = Mob.Class1(class2.Class1().readUnsignedByte())) != null) {
                                class4.Class15 = class2.Class1().readBoolean();
                            }
                            break Label_18109;
                        }
                        case 86: {
                            final Mob class5;
                            if ((class5 = Mob.Class1(class2.Class1().readUnsignedByte())) != null) {
                                class5.Class16 = class2.Class1().readBoolean();
                            }
                            break Label_18109;
                        }
                        case 89: {
                            final Mob class6;
                            if ((class6 = Mob.Class1(class2.Class1().readUnsignedByte())) != null) {
                                class6.isFire = class2.Class1().readBoolean();
                            }
                            break Label_18109;
                        }
                        case 90: {
                            final Mob class7;
                            if ((class7 = Mob.Class1(class2.Class1().readUnsignedByte())) != null && !(class7.isIce = class2.Class1().readBoolean())) {
                                Game16.Class1(77, class7.x, class7.y - 9, 1);
                            }
                            break Label_18109;
                        }
                        case 91: {
                            final Mob class8;
                            if ((class8 = Mob.Class1(class2.Class1().readUnsignedByte())) != null) {
                                class8.isWind = class2.Class1().readBoolean();
                            }
                            break Label_18109;
                        }
                        case 62: {
                            final int int3;
                            if ((int3 = class2.Class1().readInt()) == Char.getMyChar().charID) {
                                final Char myChar;
                                (myChar = Char.getMyChar()).cHP = class2.Class1().readInt();
                                final int int4 = class2.Class1().readInt();
                                int int5 = 0;
                                try {
                                    myChar.cMP = class2.Class1().readInt();
                                    int5 = class2.Class1().readInt();
                                }
                                catch (Exception ex10) {}
                                final int m;
                                if ((m = int4 + int5) == 0) {
                                    GameScr.Class1("", myChar.cx, myChar.cy - myChar.Class59, 7);
                                    break Label_18109;
                                }
                                if (m < 0) {
                                    GameScr.Class1("-".concat(String.valueOf(-m)), myChar.cx, myChar.cy - myChar.Class59, 8);
                                    break Label_18109;
                                }
                                GameScr.Class1("-".concat(String.valueOf(m)), myChar.cx, myChar.cy - myChar.Class59, 0);
                                break Label_18109;
                            }
                            else {
                                final Char class9;
                                if ((class9 = GameScr.Class5(int3)) == null) {
                                    break;
                                }
                                class9.cHP = class2.Class1().readInt();
                                final int int6 = class2.Class1().readInt();
                                int int7 = 0;
                                try {
                                    class9.cMP = class2.Class1().readInt();
                                    int7 = class2.Class1().readInt();
                                }
                                catch (Exception ex11) {}
                                final int i2;
                                if ((i2 = int6 + int7) == 0) {
                                    GameScr.Class1("", class9.cx, class9.cy - class9.Class59, 4);
                                    break Label_18109;
                                }
                                if (i2 < 0) {
                                    GameScr.Class1("-".concat(String.valueOf(-i2)), class9.cx, class9.cy - class9.Class59, 3);
                                    break Label_18109;
                                }
                                GameScr.Class1("-".concat(String.valueOf(i2)), class9.cx, class9.cy - class9.Class59, 5);
                                break Label_18109;
                            }
                            break;
                        }
                        case 23: {
                            final String utf12 = class2.Class1().readUTF();
                            GameCanvas.Class1(String.valueOf(utf12) + " " + Game86.Class338, 8889, utf12, 8882, null);
                            break Label_18109;
                        }
                        case 87: {
                            final int int8;
                            Char char1;
                            if ((int8 = class2.Class1().readInt()) == Char.getMyChar().charID) {
                                char1 = Char.getMyChar();
                            }
                            else {
                                char1 = GameScr.Class5(int8);
                            }
                            if (char1 != null) {
                                final int unsignedByte5 = class2.Class1().readUnsignedByte();
                                final short short1 = class2.Class1().readShort();
                                final byte byte6 = class2.Class1().readByte();
                                final byte byte7 = class2.Class1().readByte();
                                byte byte8 = 0;
                                int int9 = -1;
                                try {
                                    if ((byte8 = class2.Class1().readByte()) == 1) {
                                        int9 = class2.Class1().readInt();
                                    }
                                }
                                catch (Exception ex3) {
                                    ex3.printStackTrace();
                                }
                                if (char1.Class94 != null) {
                                    if (byte8 == 0) {
                                        char1.Class94.Class1(Mob.Class1(unsignedByte5));
                                    }
                                    else {
                                        char1.Class94.Class2(GameScr.Class5(int9));
                                    }
                                }
                                char1.Class94.Class1(short1, byte6, byte7);
                                break Label_18109;
                            }
                            break;
                        }
                        case 88: {
                            final int int10;
                            Char char2;
                            if ((int10 = class2.Class1().readInt()) == Char.getMyChar().charID) {
                                char2 = Char.getMyChar();
                            }
                            else if ((char2 = GameScr.Class5(int10)) == null) {
                                break;
                            }
                            final Char char3 = char2;
                            char3.cHP = char3.cMaxHP;
                            final Char char4 = char2;
                            char4.cMP = char4.cMaxMP;
                            char2.cx = class2.Class1().readShort();
                            char2.cy = class2.Class1().readShort();
                            char2.Class24();
                            break Label_18109;
                        }
                        case 52: {
                            Char.Class133 = false;
                            Char.Class134 = false;
                            Char.getMyChar().cx = class2.Class1().readShort();
                            Char.getMyChar().cy = class2.Class1().readShort();
                            Char.getMyChar().cxSend = Char.getMyChar().cx;
                            Char.getMyChar().cySend = Char.getMyChar().cy;
                            break Label_18109;
                        }
                        case -29: {
                            Class6(class2);
                            break Label_18109;
                        }
                        case -28: {
                            this.Class5(class2);
                            break Label_18109;
                        }
                        case -30: {
                            Class7(class2);
                            break Label_18109;
                        }
                        case 8: {
                            final byte byte9 = class2.Class1().readByte();
                            Char.getMyChar().arrItemBag[byte9] = new Item();
                            Char.getMyChar().arrItemBag[byte9].typeUI = 3;
                            Char.getMyChar().arrItemBag[byte9].indexUI = byte9;
                            Char.getMyChar().arrItemBag[byte9].template = Game104.Class1(class2.Class1().readShort());
                            Char.getMyChar().arrItemBag[byte9].Class7 = class2.Class1().readBoolean();
                            if (Char.getMyChar().arrItemBag[byte9].Class2() || Char.getMyChar().arrItemBag[byte9].Class4()) {
                                Char.getMyChar().arrItemBag[byte9].upgrade = class2.Class1().readByte();
                            }
                            Char.getMyChar().arrItemBag[byte9].Class15 = class2.Class1().readBoolean();
                            try {
                                Char.getMyChar().arrItemBag[byte9].quantity = class2.Class1().readUnsignedShort();
                            }
                            catch (Exception ex12) {
                                Char.getMyChar().arrItemBag[byte9].quantity = 1;
                            }
                            if (Char.getMyChar().arrItemBag[byte9].template.type == 16) {
                                GameScr.Class25 += Char.getMyChar().arrItemBag[byte9].quantity;
                            }
                            if (Char.getMyChar().arrItemBag[byte9].template.type == 17) {
                                GameScr.Class24 += Char.getMyChar().arrItemBag[byte9].quantity;
                            }
                            if (Char.getMyChar().arrItemBag[byte9].template.id == 340) {
                                final GameScr gi5 = GameScr.gI();
                                gi5.Class83 += Char.getMyChar().arrItemBag[byte9].quantity;
                            }
                            if (GameScr.isPaintTrade) {
                                if (GameScr.gI().Class133.equals("")) {
                                    final GameScr gi6 = GameScr.gI();
                                    gi6.Class133 = String.valueOf(gi6.Class133) + Char.getMyChar().arrItemBag[byte9].template.name;
                                    break Label_18109;
                                }
                                final GameScr gi7 = GameScr.gI();
                                gi7.Class133 = String.valueOf(gi7.Class133) + ", " + Char.getMyChar().arrItemBag[byte9].template.name;
                                LockGame.HuyLockSellBuy();
                                break Label_18109;
                            }
                            else {
                                if (Char.getMyChar().arrItemBag[byte9].template.type != 20) {
                                    InfoMe.Class1(String.valueOf(Game86.Class299) + " " + Char.getMyChar().arrItemBag[byte9].template.name);
                                }
                                break Label_18109;
                            }
                            break;
                        }
                        case 10: {
                            final byte byte10 = class2.Class1().readByte();
                            if (Char.getMyChar().arrItemBag[byte10].template.type == 16) {
                                GameScr.Class25 -= Char.getMyChar().arrItemBag[byte10].quantity;
                            }
                            if (Char.getMyChar().arrItemBag[byte10].template.type == 17) {
                                GameScr.Class24 -= Char.getMyChar().arrItemBag[byte10].quantity;
                            }
                            Char.getMyChar().arrItemBag[byte10] = null;
                            GameScr.gI();
                            if (GameScr.Class27()) {
                                final GameScr gi8 = GameScr.gI();
                                final GameScr gi9 = GameScr.gI();
                                final Command command = null;
                                gi9.center = command;
                                gi8.left = command;
                                break Label_18109;
                            }
                            GameScr.gI().Class22();
                            break Label_18109;
                        }
                        case 18: {
                            final byte byte11 = class2.Class1().readByte();
                            int short2 = 1;
                            try {
                                short2 = class2.Class1().readShort();
                            }
                            catch (Exception ex13) {}
                            if (Char.getMyChar().arrItemBag[byte11].template.type == 24) {
                                InfoDlg.hide();
                            }
                            if (Char.getMyChar().arrItemBag[byte11].template.type == 16) {
                                --GameScr.Class25;
                            }
                            if (Char.getMyChar().arrItemBag[byte11].template.type == 17) {
                                --GameScr.Class24;
                            }
                            if (Char.getMyChar().arrItemBag[byte11].quantity > short2) {
                                final Item item = Char.getMyChar().arrItemBag[byte11];
                                item.quantity -= short2;
                            }
                            else {
                                Char.getMyChar().arrItemBag[byte11] = null;
                            }
                            if (GameScr.Class93) {
                                GameScr.gI().Class36();
                            }
                            break Label_18109;
                        }
                        case 9: {
                            final Item item2 = Char.getMyChar().arrItemBag[class2.Class1().readUnsignedByte()];
                            short short3;
                            try {
                                short3 = class2.Class1().readShort();
                            }
                            catch (Exception ex14) {
                                short3 = 1;
                            }
                            final Item item3 = item2;
                            item3.quantity += short3;
                            if (item2.template.type == 16) {
                                GameScr.Class25 += short3;
                            }
                            if (item2.template.type == 17) {
                                GameScr.Class24 += short3;
                            }
                            if (item2.template.id == 340) {
                                final GameScr gi10 = GameScr.gI();
                                gi10.Class83 += short3;
                            }
                            GameCanvas.endDlg();
                            if (GameScr.isPaintTrade) {
                                if (GameScr.gI().Class133.equals("")) {
                                    final GameScr gi11 = GameScr.gI();
                                    gi11.Class133 = String.valueOf(gi11.Class133) + item2.template.name;
                                    break Label_18109;
                                }
                                final GameScr gi12 = GameScr.gI();
                                gi12.Class133 = String.valueOf(gi12.Class133) + ", " + item2.template.name;
                                break Label_18109;
                            }
                            else {
                                if (item2.template.type != 20) {
                                    InfoMe.Class1(String.valueOf(Game86.Class299) + " " + item2.template.name);
                                }
                                break Label_18109;
                            }
                            break;
                        }
                        case 15: {
                            Char.getMyChar().Class3(class2);
                            break Label_18109;
                        }
                        case 16: {
                            Char.getMyChar().Class5(class2);
                            break Label_18109;
                        }
                        case 108: {
                            Char.getMyChar().Class2(class2);
                            break Label_18109;
                        }
                        case 114: {
                            GameScr.gI().Class140 = class2.Class1().readByte();
                            break Label_18109;
                        }
                        case 17: {
                            Char.getMyChar().Class4(class2);
                            break Label_18109;
                        }
                        case 19: {
                            Char.getMyChar();
                            Char.Class1(class2, true);
                            break Label_18109;
                        }
                        case 20: {
                            Char.getMyChar();
                            Char.Class1(class2, false);
                            break Label_18109;
                        }
                        case 21: {
                            final byte byte12 = class2.Class1().readByte();
                            Char.getMyChar().luong = class2.Class1().readInt();
                            Char.getMyChar().xu = class2.Class1().readInt();
                            Char.getMyChar().yen = class2.Class1().readInt();
                            if (GameScr.Class84 != null) {
                                GameScr.Class84.upgrade = class2.Class1().readByte();
                                GameScr.Class84.Class7 = true;
                                GameScr.Class84.Class7();
                                if (byte12 == 1) {
                                    GameScr.Class161 = GameScr.efs[53];
                                    GameScr.Class160 = 0;
                                }
                            }
                            if (GameScr.Class76 != null) {
                                for (int n5 = 0; n5 < GameScr.Class76.length; ++n5) {
                                    GameScr.Class76[n5] = null;
                                }
                            }
                            if (byte12 == 5 || byte12 == 6) {
                                if (GameScr.Class85 != null) {
                                    GameScr.Class85 = null;
                                }
                                if (GameScr.Class77 != null) {
                                    for (int n6 = 0; n6 < GameScr.Class77.length; ++n6) {
                                        GameScr.Class77[n6] = null;
                                    }
                                }
                            }
                            final GameScr gi13 = GameScr.gI();
                            final GameScr gi14 = GameScr.gI();
                            final Command command2 = null;
                            gi14.center = command2;
                            gi13.left = command2;
                            GameScr.gI().Class28();
                            GameCanvas.endDlg();
                            if (byte12 == 5) {
                                InfoMe.addInfo(String.valueOf(Game86.Class306[0]) + GameScr.Class84.upgrade, 20, mFont.number_red);
                                break Label_18109;
                            }
                            if (byte12 == 6) {
                                InfoMe.addInfo(String.valueOf(Game86.Class306[1]) + GameScr.Class84.upgrade, 20, mFont.Class14);
                                break Label_18109;
                            }
                            if (byte12 == 1) {
                                InfoMe.addInfo(String.valueOf(Game86.Class305[0]) + GameScr.Class84.upgrade, 20, mFont.number_red);
                                break Label_18109;
                            }
                            InfoMe.addInfo(String.valueOf(Game86.Class305[1]) + GameScr.Class84.upgrade, 20, mFont.Class14);
                            break Label_18109;
                        }
                        case 112: {
                            final Item item4;
                            (item4 = Char.getMyChar().arrItemBag[class2.Class1().readByte()]).upgrade = class2.Class1().readByte();
                            item4.Class6 = 0L;
                            break Label_18109;
                        }
                        case 22: {
                            final byte byte13 = class2.Class1().readByte();
                            String s2 = Game86.Class59;
                            for (int n7 = 0; n7 < GameScr.Class77.length; ++n7) {
                                GameScr.Class77[n7] = null;
                            }
                            for (byte b4 = 0; b4 < byte13; ++b4) {
                                final Item item5;
                                (item5 = new Item()).typeUI = 3;
                                item5.indexUI = class2.Class1().readByte();
                                item5.template = Game104.Class1(class2.Class1().readShort());
                                item5.Class6 = -1L;
                                item5.quantity = 1;
                                item5.Class7 = GameScr.Class85.Class7;
                                Char.getMyChar().arrItemBag[item5.indexUI] = item5;
                                s2 = String.valueOf(s2) + item5.template.name;
                                if (b4 < byte13 - 1) {
                                    s2 = String.valueOf(s2) + ", ";
                                }
                            }
                            GameScr.Class85.upgrade = 0;
                            GameScr.Class85.Class7();
                            final GameScr gi15 = GameScr.gI();
                            final GameScr gi16 = GameScr.gI();
                            final Command command3 = null;
                            gi16.center = command3;
                            gi15.left = command3;
                            GameScr.gI().Class29();
                            GameCanvas.endDlg();
                            InfoMe.Class1(s2);
                            GameScr.Class161 = GameScr.efs[66];
                            GameScr.Class160 = 0;
                            break Label_18109;
                        }
                        case 11: {
                            final byte byte14 = class2.Class1().readByte();
                            if (Char.getMyChar().arrItemBag[byte14].template.type == 24) {
                                InfoDlg.hide();
                            }
                            Char.getMyChar().Class1(byte14);
                            Char.getMyChar().Class1(class2);
                            Char.getMyChar().Class28 = class2.Class1().readShort();
                            Char.getMyChar().Class29 = class2.Class1().readShort();
                            GameScr.gI().Class36();
                            break Label_18109;
                        }
                        case 107: {
                            GameCanvas.Class1(class2.Class1().readUTF(), 8890, (int)class2.Class1().readByte(), 8891, null);
                            break Label_18109;
                        }
                        case 43: {
                            final Integer n8;
                            final Char class10;
                            if ((class10 = GameScr.Class5(n8 = new Integer(class2.Class1().readInt()))) == null) {
                                break Label_18109;
                            }
                            if (Code.T instanceof AutoSell) {
                                Code.Game6.Game1(class10.cName, n8);
                                break Label_18109;
                            }
                            GameCanvas.Class1(String.valueOf(class10.cName) + " " + Game86.Class332, 88810, n8, 88811, null);
                            break Label_18109;
                        }
                        case 65: {
                            final Char class11;
                            if ((class11 = GameScr.Class5(class2.Class1().readInt())) != null) {
                                GameCanvas.Class1(String.valueOf(class11.cName) + " " + Game86.Class335, 88812, class11, 8882, null);
                            }
                            break Label_18109;
                        }
                        case 99: {
                            final Char class12;
                            if ((class12 = GameScr.Class5(class2.Class1().readInt())) != null) {
                                GameCanvas.Class1(String.valueOf(class12.cName) + " " + Game86.Class336, 88840, class12, 8882, null);
                            }
                            break Label_18109;
                        }
                        case 106: {
                            final Char class13;
                            if ((class13 = GameScr.Class5(class2.Class1().readInt())) != null) {
                                GameCanvas.Class1(String.valueOf(class13.cName) + " " + Game86.Class462, 88841, class13, 8882, null);
                            }
                            break Label_18109;
                        }
                        case 100: {
                            GameScr.Class35.removeAllElements();
                            for (byte byte15 = class2.Class1().readByte(), b5 = 0; b5 < byte15; ++b5) {
                                try {
                                    final Game103 game66;
                                    (game66 = new Game103()).Class1 = class2.Class1().readByte();
                                    game66.Class2 = class2.Class1().readUTF();
                                    game66.Class3 = class2.Class1().readUTF();
                                    GameScr.Class35.addElement(game66);
                                }
                                catch (Exception ex15) {}
                            }
                            GameScr.gI().Class18();
                            break Label_18109;
                        }
                        case 66: {
                            final int int11 = class2.Class1().readInt();
                            final int int12 = class2.Class1().readInt();
                            if (int11 != Char.getMyChar().charID && int12 != Char.getMyChar().charID) {
                                GameScr.Class5(int11).testCharId = int12;
                                GameScr.Class5(int12).testCharId = int11;
                                break Label_18109;
                            }
                            if (int11 == Char.getMyChar().charID) {
                                Char.getMyChar().testCharId = int12;
                                Char.getMyChar().npcFocus = null;
                                Char.getMyChar().mobFocus = null;
                                Char.getMyChar().itemFocus = null;
                                Char.getMyChar().charFocus = GameScr.Class5(Char.getMyChar().testCharId);
                                Char.getMyChar().charFocus.testCharId = Char.getMyChar().charID;
                                GameScr.gI().Class115 = GameScr.gI().Class114;
                                GameScr.gI().Class114 = int12;
                                Char.Class165 = true;
                                break Label_18109;
                            }
                            if (int12 == Char.getMyChar().charID) {
                                Char.getMyChar().testCharId = int11;
                                Char.getMyChar().npcFocus = null;
                                Char.getMyChar().mobFocus = null;
                                Char.getMyChar().itemFocus = null;
                                Char.getMyChar().charFocus = GameScr.Class5(Char.getMyChar().testCharId);
                                Char.getMyChar().charFocus.testCharId = Char.getMyChar().charID;
                                GameScr.gI().Class115 = GameScr.gI().Class114;
                                GameScr.gI().Class114 = int11;
                                Char.Class165 = true;
                            }
                            break Label_18109;
                        }
                        case 67: {
                            final int int13 = class2.Class1().readInt();
                            final int int14 = class2.Class1().readInt();
                            int int15 = 0;
                            try {
                                int15 = class2.Class1().readInt();
                            }
                            catch (Exception ex16) {}
                            if (int13 == Char.getMyChar().charID) {
                                final Char class14 = GameScr.Class5(int14);
                                if (int15 > 0) {
                                    InfoMe.Class1(Game86.Class1(Game86.Class259, class14.cName));
                                    Char.getMyChar().cHP = int15;
                                    Char.getMyChar().Class104 = 29;
                                    if (class14 != null) {
                                        class14.Class104 = 89;
                                    }
                                }
                                else {
                                    if (class14 != null) {
                                        class14.Class104 = 59;
                                    }
                                    Char.getMyChar().Class104 = 59;
                                    InfoMe.Class1(Game86.Class1(Game86.Class260, class14.cName));
                                }
                                Char.getMyChar().testCharId = -9999;
                                Char.getMyChar().charFocus = null;
                                if (GameScr.gI().Class115 >= 0) {
                                    GameScr.gI().Class114 = GameScr.gI().Class115;
                                    GameScr.gI().Class115 = -1;
                                }
                                else {
                                    GameScr.gI().Class114 = -1;
                                }
                                if (class14 != null) {
                                    class14.testCharId = -9999;
                                }
                                break Label_18109;
                            }
                            else if (int14 == Char.getMyChar().charID) {
                                final Char class15 = GameScr.Class5(int13);
                                if (int15 > 0) {
                                    if (class15 != null) {
                                        class15.cHP = int15;
                                    }
                                    if (class15 != null) {
                                        class15.Class104 = 29;
                                    }
                                    Char.getMyChar().Class104 = 89;
                                    InfoMe.Class1(Game86.Class1(Game86.Class258, class15.cName));
                                }
                                else {
                                    if (class15 != null) {
                                        class15.Class104 = 59;
                                    }
                                    Char.getMyChar().Class104 = 59;
                                    InfoMe.Class1(Game86.Class1(Game86.Class260, class15.cName));
                                }
                                if (class15 != null) {
                                    class15.testCharId = -9999;
                                }
                                Char.getMyChar().testCharId = -9999;
                                Char.getMyChar().charFocus = null;
                                if (GameScr.gI().Class115 >= 0) {
                                    GameScr.gI().Class114 = GameScr.gI().Class115;
                                    GameScr.gI().Class115 = -1;
                                    break Label_18109;
                                }
                                GameScr.gI().Class114 = -1;
                                break Label_18109;
                            }
                            else {
                                final Char class16 = GameScr.Class5(int13);
                                final Char class17 = GameScr.Class5(int14);
                                if (int15 > 0) {
                                    if (class16 != null) {
                                        class16.cHP = int15;
                                    }
                                    if (class16 != null) {
                                        class16.Class104 = 29;
                                    }
                                    if (class17 != null) {
                                        class17.Class104 = 89;
                                    }
                                }
                                else {
                                    if (class16 != null) {
                                        class16.Class104 = 59;
                                    }
                                    if (class17 != null) {
                                        class17.Class104 = 59;
                                    }
                                }
                                if (class16 != null) {
                                    class16.testCharId = -9999;
                                }
                                if (class17 != null) {
                                    class17.testCharId = -9999;
                                }
                                break Label_18109;
                            }
                            break;
                        }
                        case 68: {
                            final Char class18;
                            if ((class18 = GameScr.Class5(class2.Class1().readInt())) != null) {
                                class18.killCharId = Char.getMyChar().charID;
                                Char.getMyChar().npcFocus = null;
                                Char.getMyChar().mobFocus = null;
                                Char.getMyChar().itemFocus = null;
                                Char.getMyChar().charFocus = class18;
                                Char.Class165 = true;
                                InfoMe.addInfo(String.valueOf(class18.cName) + Game86.Class262, 20, mFont.Class14);
                            }
                            break Label_18109;
                        }
                        case 69: {
                            Char.getMyChar().killCharId = class2.Class1().readInt();
                            Char.getMyChar().npcFocus = null;
                            Char.getMyChar().mobFocus = null;
                            Char.getMyChar().itemFocus = null;
                            Char.getMyChar().charFocus = GameScr.Class5(Char.getMyChar().killCharId);
                            Char.Class165 = true;
                            break Label_18109;
                        }
                        case 70: {
                            Char char5 = Char.getMyChar();
                            try {
                                char5 = GameScr.Class5(class2.Class1().readInt());
                            }
                            catch (Exception ex17) {}
                            char5.killCharId = -9999;
                            break Label_18109;
                        }
                        case 46: {
                            GameScr.gI().typeTradeOrder = 2;
                            if (GameScr.gI().typeTrade >= 2 && GameScr.gI().typeTradeOrder >= 2) {
                                InfoDlg.Class1();
                                LockGame.HuySella();
                            }
                            break Label_18109;
                        }
                        case 45: {
                            GameScr.gI().typeTradeOrder = 1;
                            GameScr.gI().coinTradeOrder = class2.Class1().readInt();
                            GameScr.arrItemTradeOrder = new Item[12];
                            for (byte byte16 = class2.Class1().readByte(), indexUI = 0; indexUI < byte16; ++indexUI) {
                                GameScr.arrItemTradeOrder[indexUI] = new Item();
                                GameScr.arrItemTradeOrder[indexUI].typeUI = 3;
                                GameScr.arrItemTradeOrder[indexUI].indexUI = indexUI;
                                GameScr.arrItemTradeOrder[indexUI].template = Game104.Class1(class2.Class1().readShort());
                                GameScr.arrItemTradeOrder[indexUI].Class7 = false;
                                if (GameScr.arrItemTradeOrder[indexUI].Class2() || GameScr.arrItemTradeOrder[indexUI].Class4()) {
                                    GameScr.arrItemTradeOrder[indexUI].upgrade = class2.Class1().readByte();
                                }
                                GameScr.arrItemTradeOrder[indexUI].Class15 = class2.Class1().readBoolean();
                                GameScr.arrItemTradeOrder[indexUI].quantity = class2.Class1().readShort();
                            }
                            if (GameScr.gI().typeTrade == 1 && GameScr.gI().typeTradeOrder == 1) {
                                GameScr.gI().Class113 = (int)(System.currentTimeMillis() / 1000L + 5L);
                            }
                            break Label_18109;
                        }
                        case 63: {
                            final MyVector myVector = new MyVector();
                            try {
                                while (true) {
                                    myVector.addElement(new Command(class2.Class1().readUTF(), GameCanvas.instance, 88817, null));
                                }
                            }
                            catch (Exception ex18) {
                                GameCanvas.Class30.Class1(myVector);
                                break Label_18109;
                            }
                        }
                        case 27: {
                            final Mob class19 = Mob.Class1(class2.Class1().readUnsignedByte());
                            final int int16;
                            Char char6;
                            if ((int16 = class2.Class1().readInt()) == Char.getMyChar().charID) {
                                char6 = Char.getMyChar();
                            }
                            else {
                                char6 = GameScr.Class5(int16);
                            }
                            (char6.Class101 = new short[3])[0] = 0;
                            char6.Class101[1] = (short)class19.x;
                            char6.Class101[2] = (short)class19.y;
                            char6.Class137 = false;
                            break Label_18109;
                        }
                        case 64: {
                            final int int17;
                            Char char7;
                            if ((int17 = class2.Class1().readInt()) == Char.getMyChar().charID) {
                                char7 = Char.getMyChar();
                            }
                            else {
                                char7 = GameScr.Class5(int17);
                            }
                            (char7.Class101 = new short[3])[0] = 0;
                            final short short4 = class2.Class1().readShort();
                            final short short5 = class2.Class1().readShort();
                            char7.Class101[1] = short4;
                            char7.Class101[2] = short5;
                            char7.Class137 = false;
                            try {
                                final int int18;
                                Char char8;
                                if ((int18 = class2.Class1().readInt()) == Char.getMyChar().charID) {
                                    char8 = Char.getMyChar();
                                }
                                else {
                                    char8 = GameScr.Class5(int18);
                                }
                                char8.cx = short4;
                                char8.cy = short5;
                            }
                            catch (Exception ex4) {
                                ex4.printStackTrace();
                            }
                            break Label_18109;
                        }
                        case 92: {
                            GameCanvas.inputDlg.show(class2.Class1().readUTF(), new Command(Game86.Class107, GameCanvas.instance, 88818, new Short(class2.Class1().readShort())), 0);
                            break Label_18109;
                        }
                        case 34: {
                            final MyVector myVector2 = new MyVector();
                            final String utf13;
                            if (!(utf13 = class2.Class1().readUTF()).equals("")) {
                                GameScr.gI().showAlert(null, utf13, true);
                            }
                            for (byte byte17 = class2.Class1().readByte(), b6 = 0; b6 < byte17; ++b6) {
                                myVector2.addElement(new Command(class2.Class1().readUTF(), GameCanvas.instance, 88819, new Short(class2.Class1().readShort())));
                            }
                            GameCanvas.Class30.Class1(myVector2);
                            break Label_18109;
                        }
                        case 40: {
                            InfoDlg.hide();
                            GameCanvas.Class8();
                            GameCanvas.Class7();
                            final MyVector myVector3 = new MyVector();
                            try {
                                while (true) {
                                    myVector3.addElement(new Command(class2.Class1().readUTF(), GameCanvas.instance, 88822, null));
                                }
                            }
                            catch (Exception ex19) {
                                if (Char.getMyChar().npcFocus != null) {
                                    for (int n9 = 0; n9 < Char.getMyChar().npcFocus.template.menu.length; ++n9) {
                                        final String[] array = Char.getMyChar().npcFocus.template.menu[n9];
                                        myVector3.addElement(new Command(array[0], GameCanvas.instance, 88820, array));
                                    }
                                    GameCanvas.Class30.Class1(myVector3);
                                    GameCanvas.Class30.Class16 = true;
                                    break Label_18109;
                                }
                                break;
                            }
                        }
                        case 109: {
                            InfoDlg.hide();
                            GameCanvas.Class8();
                            GameCanvas.Class7();
                            final MyVector myVector4 = new MyVector();
                            try {
                                for (byte byte18 = class2.Class1().readByte(), b7 = 0; b7 < byte18; ++b7) {
                                    final String[] array2 = new String[class2.Class1().readByte()];
                                    for (int n10 = 0; n10 < array2.length; ++n10) {
                                        array2[n10] = class2.Class1().readUTF();
                                    }
                                    myVector4.addElement(new Command(array2[0], GameCanvas.instance, 88820, array2));
                                }
                            }
                            catch (Exception ex20) {}
                            if (Char.getMyChar().npcFocus != null) {
                                GameCanvas.Class30.Class1(myVector4);
                                break Label_18109;
                            }
                            break;
                        }
                        case 47: {
                            GameCanvas.Class22 = 150;
                            class2.Class1().readShort();
                            final byte byte19 = class2.Class1().readByte();
                            final String utf14 = class2.Class1().readUTF();
                            final String utf15 = class2.Class1().readUTF();
                            final String[] array4;
                            final short[] array3 = new short[(array4 = new String[class2.Class1().readByte()]).length];
                            short short6 = -1;
                            for (int n11 = 0; n11 < array4.length; ++n11) {
                                final String utf16 = class2.Class1().readUTF();
                                array3[n11] = -1;
                                if (!utf16.equals("")) {
                                    array4[n11] = utf16;
                                }
                            }
                            try {
                                short6 = class2.Class1().readShort();
                                for (int n12 = 0; n12 < array4.length; ++n12) {
                                    array3[n12] = class2.Class1().readShort();
                                }
                            }
                            catch (Exception ex21) {}
                            Char.getMyChar().taskMaint = new Task(byte19, utf14, utf15, array4, array3, short6);
                            Char.getMyChar().Class10(21);
                            if (Char.getMyChar().npcFocus != null) {
                                Npc.Class31();
                            }
                            LockGame.HuyLockAS10();
                            break Label_18109;
                        }
                        case 48: {
                            if (Char.getMyChar().taskMaint != null) {
                                GameCanvas.Class22 = 100;
                                final Task taskMaint = Char.getMyChar().taskMaint;
                                ++taskMaint.index;
                                Char.getMyChar().taskMaint.count = 0;
                                if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.Class6 != null && Char.getMyChar().taskMaint.index >= 2) {
                                    Char.getMyChar().npcFocus.Class6 = null;
                                }
                                if (Char.getMyChar().taskMaint.index >= Char.getMyChar().taskMaint.subNames.length - 1) {
                                    Char.getMyChar().Class10(61);
                                }
                                else {
                                    Char.getMyChar().Class10(21);
                                }
                                Npc.Class31();
                            }
                            LockGame.HuyLockAS10();
                            break Label_18109;
                        }
                        case 49: {
                            final Char myChar2 = Char.getMyChar();
                            ++myChar2.ctaskId;
                            Char.getMyChar();
                            Char.Class25();
                            break Label_18109;
                        }
                        case 50: {
                            GameCanvas.Class22 = 50;
                            Char.getMyChar().taskMaint.count = class2.Class1().readShort();
                            if (Char.getMyChar().npcFocus != null) {
                                Npc.Class31();
                            }
                            break Label_18109;
                        }
                        case 93: {
                            final int int19 = class2.Class1().readInt();
                            GameScr.Class97 = new Char();
                            if (Char.getMyChar().charID == int19) {
                                GameScr.Class97 = Char.getMyChar();
                            }
                            else {
                                final Char class20;
                                if ((class20 = GameScr.Class5(int19)) == null) {
                                    GameScr.Class97 = new Char();
                                }
                                else {
                                    GameScr.Class97 = class20;
                                }
                                GameScr.Class97.charID = int19;
                                GameScr.Class97.statusMe = 1;
                                GameScr.gI().Class37();
                            }
                            GameScr.Class97.cName = class2.Class1().readUTF();
                            GameScr.Class97.head = class2.Class1().readShort();
                            GameScr.Class97.cgender = class2.Class1().readByte();
                            GameScr.Class97.nClass = GameScr.Class43[class2.Class1().readByte()];
                            GameScr.Class97.cPk = class2.Class1().readByte();
                            GameScr.Class97.cHP = class2.Class1().readInt();
                            GameScr.Class97.cMaxHP = class2.Class1().readInt();
                            GameScr.Class97.cMP = class2.Class1().readInt();
                            GameScr.Class97.cMaxMP = class2.Class1().readInt();
                            GameScr.Class97.Class19 = class2.Class1().readByte();
                            GameScr.Class97.Class82 = class2.Class1().readShort();
                            GameScr.Class97.Class83 = class2.Class1().readShort();
                            GameScr.Class97.Class84 = class2.Class1().readShort();
                            GameScr.Class97.Class20 = class2.Class1().readInt();
                            GameScr.Class97.Class21 = class2.Class1().readInt();
                            GameScr.Class97.Class86 = class2.Class1().readShort();
                            GameScr.Class97.Class85 = class2.Class1().readShort();
                            GameScr.Class97.Class87 = class2.Class1().readShort();
                            GameScr.Class97.Class90 = class2.Class1().readShort();
                            GameScr.Class97.Class91 = class2.Class1().readShort();
                            GameScr.Class97.Class92 = class2.Class1().readShort();
                            GameScr.Class97.Class22 = class2.Class1().readUnsignedByte();
                            GameScr.Class97.Class33 = class2.Class1().readShort();
                            GameScr.Class97.Class55 = class2.Class1().readUTF();
                            if (!GameScr.Class97.Class55.equals("")) {
                                GameScr.Class97.Class56 = class2.Class1().readByte();
                            }
                            GameScr.Class97.Class33 = class2.Class1().readShort();
                            GameScr.Class97.Class34 = class2.Class1().readShort();
                            GameScr.Class97.Class36 = class2.Class1().readShort();
                            GameScr.Class97.Class38 = class2.Class1().readShort();
                            GameScr.Class97.Class40 = class2.Class1().readShort();
                            GameScr.Class97.Class42 = class2.Class1().readShort();
                            GameScr.Class97.Class35 = class2.Class1().readShort();
                            GameScr.Class97.Class37 = class2.Class1().readShort();
                            GameScr.Class97.Class39 = class2.Class1().readShort();
                            GameScr.Class97.Class41 = class2.Class1().readShort();
                            GameScr.Class97.Class43 = class2.Class1().readShort();
                            GameScr.Class97.Class45 = class2.Class1().readByte();
                            GameScr.Class97.Class46 = class2.Class1().readByte();
                            GameScr.Class97.Class51 = class2.Class1().readByte();
                            GameScr.Class97.Class47 = class2.Class1().readByte();
                            GameScr.Class97.Class48 = class2.Class1().readByte();
                            GameScr.Class97.arrItemBody = new Item[32];
                            try {
                                GameScr.Class97.Class10();
                                for (int n13 = 0; n13 < 16; ++n13) {
                                    final short short7;
                                    if ((short7 = class2.Class1().readShort()) >= 0) {
                                        final ItemTemplate class21;
                                        final byte type = (class21 = Game104.Class1(short7)).type;
                                        GameScr.Class97.arrItemBody[type] = new Item();
                                        GameScr.Class97.arrItemBody[type].indexUI = type;
                                        GameScr.Class97.arrItemBody[type].typeUI = 5;
                                        GameScr.Class97.arrItemBody[type].template = class21;
                                        GameScr.Class97.arrItemBody[type].Class7 = true;
                                        GameScr.Class97.arrItemBody[type].upgrade = class2.Class1().readByte();
                                        GameScr.Class97.arrItemBody[type].Class8 = class2.Class1().readByte();
                                        if (type == 1) {
                                            final Char class22 = GameScr.Class97;
                                            class22.Class144 = class22.arrItemBody[type].template.Class8;
                                        }
                                        else if (type == 2) {
                                            final Char class23 = GameScr.Class97;
                                            class23.body = class23.arrItemBody[type].template.Class8;
                                        }
                                        else if (type == 6) {
                                            final Char class24 = GameScr.Class97;
                                            class24.leg = class24.arrItemBody[type].template.Class8;
                                        }
                                    }
                                }
                            }
                            catch (Exception ex22) {}
                            try {
                                for (int n14 = 0; n14 < 16; ++n14) {
                                    final short short8;
                                    if ((short8 = class2.Class1().readShort()) >= 0) {
                                        final ItemTemplate class25;
                                        final int indexUI2 = (class25 = Game104.Class1(short8)).type + 16;
                                        GameScr.Class97.arrItemBody[indexUI2] = new Item();
                                        GameScr.Class97.arrItemBody[indexUI2].indexUI = indexUI2;
                                        GameScr.Class97.arrItemBody[indexUI2].typeUI = 5;
                                        GameScr.Class97.arrItemBody[indexUI2].template = class25;
                                        GameScr.Class97.arrItemBody[indexUI2].Class7 = true;
                                        GameScr.Class97.arrItemBody[indexUI2].upgrade = class2.Class1().readByte();
                                        GameScr.Class97.arrItemBody[indexUI2].Class8 = class2.Class1().readByte();
                                        if (indexUI2 == 1) {
                                            final Char class26 = GameScr.Class97;
                                            class26.Class144 = class26.arrItemBody[indexUI2].template.Class8;
                                        }
                                        else if (indexUI2 == 2) {
                                            final Char class27 = GameScr.Class97;
                                            class27.body = class27.arrItemBody[indexUI2].template.Class8;
                                        }
                                        else if (indexUI2 == 6) {
                                            final Char class28 = GameScr.Class97;
                                            class28.leg = class28.arrItemBody[indexUI2].template.Class8;
                                        }
                                    }
                                }
                            }
                            catch (Exception ex23) {}
                            break Label_18109;
                        }
                        case 101: {
                            try {
                                GameScr.Class97.Class44 = class2.Class1().readInt();
                                GameScr.Class97.Class49 = class2.Class1().readByte();
                                GameScr.Class97.Class50 = class2.Class1().readByte();
                            }
                            catch (Exception ex5) {
                                ex5.printStackTrace();
                            }
                            break Label_18109;
                        }
                        case 42: {
                            Class8(class2);
                            break Label_18109;
                        }
                        case 94: {
                            Class2(class2);
                            break Label_18109;
                        }
                        case 36: {
                            GameScr.gI().Class1(class2);
                            LockGame.Game6();
                            break Label_18109;
                        }
                        case 37: {
                            GameScr.gI().Class132 = class2.Class1().readUTF();
                            GameScr.gI().Class21();
                            LockGame.HuySella();
                            break Label_18109;
                        }
                        case -15: {
                            final short short9 = class2.Class1().readShort();
                            for (int n15 = 0; n15 < GameScr.vItemMap.size(); ++n15) {
                                if (((ItemMap)GameScr.vItemMap.elementAt(n15)).itemMapID == short9) {
                                    GameScr.vItemMap.removeElementAt(n15);
                                    break;
                                }
                            }
                            break Label_18109;
                        }
                        case -14: {
                            Char.getMyChar().itemFocus = null;
                            final short short10 = class2.Class1().readShort();
                            int n16 = 0;
                            while (n16 < GameScr.vItemMap.size()) {
                                final ItemMap itemMap;
                                if ((itemMap = (ItemMap)GameScr.vItemMap.elementAt(n16)).itemMapID == short10) {
                                    itemMap.Class1(Char.getMyChar().cx, Char.getMyChar().cy - 10);
                                    if (itemMap.template.type == 19) {
                                        final int unsignedShort = class2.Class1().readUnsignedShort();
                                        final Char myChar3 = Char.getMyChar();
                                        myChar3.yen += unsignedShort;
                                        if (itemMap.template.id != 238) {
                                            InfoMe.Class1(String.valueOf(Game86.Class299) + " " + unsignedShort + " " + Game86.Class288);
                                            break;
                                        }
                                        break;
                                    }
                                    else {
                                        if (itemMap.template.type == 25 && itemMap.template.id != 238) {
                                            InfoMe.addInfo(String.valueOf(Game86.Class299) + " " + itemMap.template.name, 15, mFont.Class12);
                                            break;
                                        }
                                        break;
                                    }
                                }
                                else {
                                    ++n16;
                                }
                            }
                            break Label_18109;
                        }
                        case -13: {
                            final short short11 = class2.Class1().readShort();
                            int n17 = 0;
                            while (n17 < GameScr.vItemMap.size()) {
                                final ItemMap itemMap2;
                                if ((itemMap2 = (ItemMap)GameScr.vItemMap.elementAt(n17)).itemMapID == short11) {
                                    final Char class29;
                                    if ((class29 = GameScr.Class5(class2.Class1().readInt())) == null) {
                                        break Label_1136;
                                    }
                                    itemMap2.Class1(class29.cx, class29.cy - 10);
                                    if (itemMap2.x < class29.cx) {
                                        class29.Class15 = -1;
                                        break;
                                    }
                                    if (itemMap2.x > class29.cx) {
                                        class29.Class15 = 1;
                                        break;
                                    }
                                    break;
                                }
                                else {
                                    ++n17;
                                }
                            }
                            break Label_18109;
                        }
                        case -12: {
                            final byte byte20 = class2.Class1().readByte();
                            GameScr.vItemMap.addElement(new ItemMap(class2.Class1().readShort(), Char.getMyChar().arrItemBag[byte20].template.id, Char.getMyChar().cx, Char.getMyChar().cy, class2.Class1().readShort(), class2.Class1().readShort()));
                            Char.getMyChar().arrItemBag[byte20] = null;
                            break Label_18109;
                        }
                        case 6: {
                            final ItemMap itemMap3 = new ItemMap(class2.Class1().readShort(), class2.Class1().readShort(), class2.Class1().readShort(), class2.Class1().readShort());
                            final byte[] class30;
                            if ((class30 = Game20.Class145(class2)) != null && class30.length > 0) {
                                itemMap3.Class10 = new Game11();
                                itemMap3.Class10.Class1 = Class1(class30);
                            }
                            GameScr.vItemMap.addElement(itemMap3);
                            break Label_18109;
                        }
                        case 7: {
                            Char.getMyChar().arrItemBag[class2.Class1().readByte()].quantity = class2.Class1().readShort();
                            break Label_18109;
                        }
                        case 75: {
                            final Game92 game67 = new Game92(class2.Class1().readUTF(), class2.Class1().readShort(), class2.Class1().readShort());
                            GameScr.Class42.addElement(game67);
                            Game16.Class1(60, game67.Class1, game67.Class2, 1);
                            break Label_18109;
                        }
                        case 76: {
                            final Mob class31;
                            if ((class31 = Mob.Class1(class2.Class1().readUnsignedByte())) == null) {
                                break Label_18109;
                            }
                            final Game92 class32;
                            if ((class32 = GameScr.Class6(class2.Class1().readShort())) != null) {
                                final short short12 = class2.Class1().readShort();
                                final byte byte21 = class2.Class1().readByte();
                                final byte byte22 = class2.Class1().readByte();
                                class31.Class1(class32);
                                class31.Class1(short12, byte21, byte22);
                                break Label_18109;
                            }
                            break;
                        }
                        case 77: {
                            final Game92 game68 = (Game92)GameScr.Class42.elementAt(class2.Class1().readShort());
                            GameScr.Class42.removeElement(game68);
                            Game16.Class1(60, game68.Class1, game68.Class2, 1);
                            break Label_18109;
                        }
                        case -6: {
                            final Char class33;
                            if ((class33 = GameScr.Class5(class2.Class1().readInt())) != null) {
                                GameScr.vItemMap.addElement(new ItemMap(class2.Class1().readShort(), class2.Class1().readShort(), class33.cx, class33.cy, class2.Class1().readShort(), class2.Class1().readShort()));
                                break Label_18109;
                            }
                            break;
                        }
                        case -16: {
                            Char.Class134 = true;
                            Char.Class133 = true;
                            Mob.Class27.removeAllElements();
                            GameScr.gI().Class135 = 0;
                            GameScr.gI().Class134 = 0;
                            Char.getMyChar().mobFocus = null;
                            Char.getMyChar().npcFocus = null;
                            Char.getMyChar().charFocus = null;
                            Char.getMyChar().itemFocus = null;
                            Char.getMyChar().Class98.removeAllElements();
                            Char.getMyChar().testCharId = -9999;
                            Char.getMyChar().killCharId = -9999;
                            GameScr.Class6();
                            GameCanvas.Class5();
                            if (GameScr.vParty.size() <= 1) {
                                GameScr.vParty.removeAllElements();
                            }
                            GameScr.gI().Class22();
                            GameScr.gI().center = null;
                            break Label_18109;
                        }
                        case 30: {
                            final byte byte23 = class2.Class1().readByte();
                            try {
                                GameScr.Class163 = class2.Class1().readUTF();
                                GameScr.Class164 = class2.Class1().readUTF();
                            }
                            catch (Exception ex24) {}
                            GameScr.gI().Class4((int)byte23);
                            break Label_18109;
                        }
                        case 38: {
                            final short short13 = class2.Class1().readShort();
                            for (int n18 = 0; n18 < GameScr.vNpc.size(); ++n18) {
                                final Npc npc;
                                if ((npc = (Npc)GameScr.vNpc.elementAt(n18)).template.npcTemplateId == short13 && npc.equals(Char.getMyChar().npcFocus)) {
                                    ChatPopup.addChatPopupMultiLine(class2.Class1().readUTF(), npc);
                                    break;
                                }
                            }
                            break Label_18109;
                        }
                        case 39: {
                            final short short14 = class2.Class1().readShort();
                            for (int n19 = 0; n19 < GameScr.vNpc.size(); ++n19) {
                                final Npc npc2;
                                if ((npc2 = (Npc)GameScr.vNpc.elementAt(n19)).template.npcTemplateId == short14 && npc2.equals(Char.getMyChar().npcFocus)) {
                                    ChatPopup.Class1(class2.Class1().readUTF(), 1000, npc2);
                                    final String[] array5 = new String[class2.Class1().readByte()];
                                    for (int n20 = 0; n20 < array5.length; ++n20) {
                                        array5[n20] = class2.Class1().readUTF();
                                    }
                                    GameScr.gI();
                                    GameScr.Class1(array5, npc2);
                                    break;
                                }
                            }
                            break Label_18109;
                        }
                        case 31: {
                            Char.getMyChar().Class68 = class2.Class1().readInt();
                            Char.getMyChar().Class78 = new Item[class2.Class1().readUnsignedByte()];
                            for (int indexUI3 = 0; indexUI3 < Char.getMyChar().Class78.length; ++indexUI3) {
                                final short short15;
                                if ((short15 = class2.Class1().readShort()) != -1) {
                                    Char.getMyChar().Class78[indexUI3] = new Item();
                                    Char.getMyChar().Class78[indexUI3].typeUI = 4;
                                    Char.getMyChar().Class78[indexUI3].indexUI = indexUI3;
                                    Char.getMyChar().Class78[indexUI3].template = Game104.Class1(short15);
                                    Char.getMyChar().Class78[indexUI3].Class7 = class2.Class1().readBoolean();
                                    if (Char.getMyChar().Class78[indexUI3].Class2() || Char.getMyChar().Class78[indexUI3].Class4()) {
                                        Char.getMyChar().Class78[indexUI3].upgrade = class2.Class1().readByte();
                                    }
                                    Char.getMyChar().Class78[indexUI3].Class15 = class2.Class1().readBoolean();
                                    Char.getMyChar().Class78[indexUI3].quantity = class2.Class1().readShort();
                                }
                            }
                            LockGame.HuyLockSellBuy();
                            break Label_18109;
                        }
                        case 13: {
                            Char.getMyChar().xu = class2.Class1().readInt();
                            Char.getMyChar().yen = class2.Class1().readInt();
                            Char.getMyChar().luong = class2.Class1().readInt();
                            GameCanvas.endDlg();
                            break Label_18109;
                        }
                        case 33: {
                            final byte byte24;
                            if ((byte24 = class2.Class1().readByte()) == 14) {
                                GameScr.Class70 = new Item[class2.Class1().readByte()];
                                for (int n21 = 0; n21 < GameScr.Class70.length; ++n21) {
                                    GameScr.Class70[n21] = new Item();
                                    GameScr.Class70[n21].typeUI = 14;
                                    GameScr.Class70[n21].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class70[n21].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 15) {
                                GameScr.Class73 = new Item[class2.Class1().readByte()];
                                for (int n22 = 0; n22 < GameScr.Class73.length; ++n22) {
                                    GameScr.Class73[n22] = new Item();
                                    GameScr.Class73[n22].typeUI = 15;
                                    GameScr.Class73[n22].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class73[n22].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 32) {
                                GameScr.Class74 = new Item[class2.Class1().readByte()];
                                for (int n23 = 0; n23 < GameScr.Class74.length; ++n23) {
                                    GameScr.Class74[n23] = new Item();
                                    GameScr.Class74[n23].typeUI = 32;
                                    GameScr.Class74[n23].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class74[n23].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 34) {
                                GameScr.Class72 = new Item[class2.Class1().readByte()];
                                for (int n24 = 0; n24 < GameScr.Class72.length; ++n24) {
                                    GameScr.Class72[n24] = new Item();
                                    GameScr.Class72[n24].typeUI = 34;
                                    GameScr.Class72[n24].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class72[n24].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 35) {
                                GameScr.Class71 = new Item[class2.Class1().readByte()];
                                for (int n25 = 0; n25 < GameScr.Class71.length; ++n25) {
                                    GameScr.Class71[n25] = new Item();
                                    GameScr.Class71[n25].typeUI = 35;
                                    GameScr.Class71[n25].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class71[n25].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 20) {
                                GameScr.Class51 = new Item[class2.Class1().readByte()];
                                for (int n26 = 0; n26 < GameScr.Class51.length; ++n26) {
                                    GameScr.Class51[n26] = new Item();
                                    GameScr.Class51[n26].typeUI = byte24;
                                    GameScr.Class51[n26].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class51[n26].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 21) {
                                GameScr.Class52 = new Item[class2.Class1().readByte()];
                                for (int n27 = 0; n27 < GameScr.Class52.length; ++n27) {
                                    GameScr.Class52[n27] = new Item();
                                    GameScr.Class52[n27].typeUI = byte24;
                                    GameScr.Class52[n27].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class52[n27].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 22) {
                                GameScr.Class53 = new Item[class2.Class1().readByte()];
                                for (int n28 = 0; n28 < GameScr.Class53.length; ++n28) {
                                    GameScr.Class53[n28] = new Item();
                                    GameScr.Class53[n28].typeUI = byte24;
                                    GameScr.Class53[n28].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class53[n28].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 23) {
                                GameScr.Class54 = new Item[class2.Class1().readByte()];
                                for (int n29 = 0; n29 < GameScr.Class54.length; ++n29) {
                                    GameScr.Class54[n29] = new Item();
                                    GameScr.Class54[n29].typeUI = byte24;
                                    GameScr.Class54[n29].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class54[n29].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 24) {
                                GameScr.Class55 = new Item[class2.Class1().readByte()];
                                for (int n30 = 0; n30 < GameScr.Class55.length; ++n30) {
                                    GameScr.Class55[n30] = new Item();
                                    GameScr.Class55[n30].typeUI = byte24;
                                    GameScr.Class55[n30].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class55[n30].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 25) {
                                GameScr.Class56 = new Item[class2.Class1().readByte()];
                                for (int n31 = 0; n31 < GameScr.Class56.length; ++n31) {
                                    GameScr.Class56[n31] = new Item();
                                    GameScr.Class56[n31].typeUI = byte24;
                                    GameScr.Class56[n31].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class56[n31].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 26) {
                                GameScr.Class57 = new Item[class2.Class1().readByte()];
                                for (int n32 = 0; n32 < GameScr.Class57.length; ++n32) {
                                    GameScr.Class57[n32] = new Item();
                                    GameScr.Class57[n32].typeUI = byte24;
                                    GameScr.Class57[n32].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class57[n32].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 27) {
                                GameScr.Class58 = new Item[class2.Class1().readByte()];
                                for (int n33 = 0; n33 < GameScr.Class58.length; ++n33) {
                                    GameScr.Class58[n33] = new Item();
                                    GameScr.Class58[n33].typeUI = byte24;
                                    GameScr.Class58[n33].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class58[n33].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 28) {
                                GameScr.Class59 = new Item[class2.Class1().readByte()];
                                for (int n34 = 0; n34 < GameScr.Class59.length; ++n34) {
                                    GameScr.Class59[n34] = new Item();
                                    GameScr.Class59[n34].typeUI = byte24;
                                    GameScr.Class59[n34].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class59[n34].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 29) {
                                GameScr.Class60 = new Item[class2.Class1().readByte()];
                                for (int n35 = 0; n35 < GameScr.Class60.length; ++n35) {
                                    GameScr.Class60[n35] = new Item();
                                    GameScr.Class60[n35].typeUI = byte24;
                                    GameScr.Class60[n35].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class60[n35].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 16) {
                                GameScr.Class61 = new Item[class2.Class1().readByte()];
                                for (int n36 = 0; n36 < GameScr.Class61.length; ++n36) {
                                    GameScr.Class61[n36] = new Item();
                                    GameScr.Class61[n36].typeUI = byte24;
                                    GameScr.Class61[n36].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class61[n36].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 17) {
                                GameScr.Class62 = new Item[class2.Class1().readByte()];
                                for (int n37 = 0; n37 < GameScr.Class62.length; ++n37) {
                                    GameScr.Class62[n37] = new Item();
                                    GameScr.Class62[n37].typeUI = byte24;
                                    GameScr.Class62[n37].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class62[n37].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 18) {
                                GameScr.Class63 = new Item[class2.Class1().readByte()];
                                for (int n38 = 0; n38 < GameScr.Class63.length; ++n38) {
                                    GameScr.Class63[n38] = new Item();
                                    GameScr.Class63[n38].typeUI = byte24;
                                    GameScr.Class63[n38].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class63[n38].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 19) {
                                GameScr.Class64 = new Item[class2.Class1().readByte()];
                                for (int n39 = 0; n39 < GameScr.Class64.length; ++n39) {
                                    GameScr.Class64[n39] = new Item();
                                    GameScr.Class64[n39].typeUI = byte24;
                                    GameScr.Class64[n39].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class64[n39].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 2) {
                                GameScr.Class65 = new Item[class2.Class1().readByte()];
                                for (int n40 = 0; n40 < GameScr.Class65.length; ++n40) {
                                    GameScr.Class65[n40] = new Item();
                                    GameScr.Class65[n40].typeUI = byte24;
                                    GameScr.Class65[n40].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class65[n40].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 6) {
                                GameScr.Class66 = new Item[class2.Class1().readByte()];
                                for (int n41 = 0; n41 < GameScr.Class66.length; ++n41) {
                                    GameScr.Class66[n41] = new Item();
                                    GameScr.Class66[n41].typeUI = byte24;
                                    GameScr.Class66[n41].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class66[n41].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 7) {
                                GameScr.Class67 = new Item[class2.Class1().readByte()];
                                for (int n42 = 0; n42 < GameScr.Class67.length; ++n42) {
                                    GameScr.Class67[n42] = new Item();
                                    GameScr.Class67[n42].typeUI = byte24;
                                    GameScr.Class67[n42].Class7 = true;
                                    GameScr.Class67[n42].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class67[n42].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 8) {
                                GameScr.Class68 = new Item[class2.Class1().readByte()];
                                for (int n43 = 0; n43 < GameScr.Class68.length; ++n43) {
                                    GameScr.Class68[n43] = new Item();
                                    GameScr.Class68[n43].typeUI = byte24;
                                    GameScr.Class68[n43].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class68[n43].template = Game104.Class1(class2.Class1().readShort());
                                }
                                break Label_18109;
                            }
                            if (byte24 == 9) {
                                GameScr.Class69 = new Item[class2.Class1().readByte()];
                                for (int n44 = 0; n44 < GameScr.Class69.length; ++n44) {
                                    GameScr.Class69[n44] = new Item();
                                    GameScr.Class69[n44].typeUI = byte24;
                                    GameScr.Class69[n44].Class7 = true;
                                    GameScr.Class69[n44].indexUI = class2.Class1().readUnsignedByte();
                                    GameScr.Class69[n44].template = Game104.Class1(class2.Class1().readShort());
                                }
                            }
                            break Label_18109;
                        }
                        case 103: {
                            GameScr.indexMenu = class2.Class1().readByte();
                            GameScr.Class81 = new Game48[class2.Class1().readInt()];
                            for (int n45 = 0; n45 < GameScr.Class81.length; ++n45) {
                                GameScr.Class81[n45] = new Game48();
                                GameScr.Class81[n45].Class1 = new Item();
                                GameScr.Class81[n45].Class1.Class3 = class2.Class1().readInt();
                                GameScr.Class81[n45].Class4 = (int)(System.currentTimeMillis() / 1000L);
                                GameScr.Class81[n45].Class3 = class2.Class1().readInt();
                                GameScr.Class81[n45].Class1.quantity = class2.Class1().readUnsignedShort();
                                GameScr.Class81[n45].Class5 = class2.Class1().readUTF();
                                GameScr.Class81[n45].Class2 = class2.Class1().readInt();
                                GameScr.Class81[n45].Class1.template = Game104.Class1(class2.Class1().readShort());
                            }
                            GameScr.gI().Class4(37);
                            break Label_18109;
                        }
                        case 104: {
                            Class3(class2);
                            break Label_18109;
                        }
                        case 102: {
                            final Item class34;
                            if ((class34 = Char.getMyChar().arrItemBag[class2.Class1().readByte()]) != null) {
                                GameScr.Class86 = class34;
                            }
                            Char.getMyChar().xu = class2.Class1().readInt();
                            if (GameScr.Class86 != null) {
                                if (GameScr.Class86.template.type == 16) {
                                    GameScr.Class25 -= GameScr.Class86.quantity;
                                }
                                if (GameScr.Class86.template.type == 17) {
                                    GameScr.Class24 -= GameScr.Class86.quantity;
                                }
                                Char.getMyChar().arrItemBag[GameScr.Class86.indexUI] = null;
                                GameScr.Class86 = null;
                                GameScr.gI().Class22();
                                InfoMe.Class1(Game86.Class448);
                            }
                            GameCanvas.endDlg();
                            break Label_18109;
                        }
                        case 14: {
                            final Item item6 = Char.getMyChar().arrItemBag[class2.Class1().readByte()];
                            Char.getMyChar().yen = class2.Class1().readInt();
                            short short16;
                            try {
                                short16 = class2.Class1().readShort();
                            }
                            catch (Exception ex25) {
                                short16 = 1;
                            }
                            final Item item7 = item6;
                            item7.quantity -= short16;
                            if (item6.template.type == 16) {
                                GameScr.Class25 -= short16;
                            }
                            if (item6.template.type == 17) {
                                GameScr.Class24 -= short16;
                            }
                            if (item6.quantity <= 0) {
                                Char.getMyChar().arrItemBag[item6.indexUI] = null;
                            }
                            final GameScr gi17 = GameScr.gI();
                            final GameScr gi18 = GameScr.gI();
                            final Command command4 = null;
                            gi18.center = command4;
                            gi17.left = command4;
                            GameScr.gI().Class29();
                            LockGame.HuyLockSellBuy();
                            GameCanvas.endDlg();
                            break Label_18109;
                        }
                        case -18: {
                            GameCanvas.isLoading = true;
                            GameScr.Class6();
                            TileMap.vGo.removeAllElements();
                            System.gc();
                            TileMap.mapID = (short)class2.Class1().readUnsignedByte();
                            TileMap.Class5 = class2.Class1().readByte();
                            TileMap.Class13 = class2.Class1().readByte();
                            TileMap.Class14 = class2.Class1().readByte();
                            TileMap.Class11 = class2.Class1().readUTF();
                            TileMap.zoneID = class2.Class1().readByte();
                            TileMap.Class6();
                            try {
                                TileMap.Class5();
                            }
                            catch (Exception ex26) {
                                Service.gI().Class18(TileMap.mapID);
                                this.Class2 = class2;
                                break;
                            }
                            loadInfoMap(class2);
                            if (Char.getMyChar().Class94 != null) {
                                Char.getMyChar().Class94.x = Char.getMyChar().cx;
                                Char.getMyChar().Class94.y = Char.getMyChar().cy - 40;
                            }
                            break Label_18109;
                        }
                        case 4: {
                            final Char class35;
                            if ((class35 = GameScr.Class5(class2.Class1().readInt())) == null) {
                                break;
                            }
                            if ((TileMap.tileTypeAtPixel(class35.cx, class35.cy) & 0x2) == 0x2) {
                                class35.Class1(GameScr.sks[class2.Class1().readByte()], 0);
                            }
                            else {
                                class35.Class1(GameScr.sks[class2.Class1().readByte()], 1);
                            }
                            if (class35.Class64) {
                                class35.Class64 = false;
                                class35.Class126 = System.currentTimeMillis();
                                Game16.Class1(60, class35, 1);
                            }
                            if (class35.Class63) {
                                class35.Class63 = false;
                                class35.Class65 = true;
                            }
                            class35.Class99 = new Mob[class2.Class1().readByte()];
                            for (int n46 = 0; n46 < class35.Class99.length; ++n46) {
                                final Mob class36 = Mob.Class1(class2.Class1().readUnsignedByte());
                                class35.Class99[n46] = class36;
                                if (n46 == 0) {
                                    if (class35.cx <= class36.x) {
                                        class35.Class15 = 1;
                                    }
                                    else {
                                        class35.Class15 = -1;
                                    }
                                }
                            }
                            final Char char9 = class35;
                            char9.mobFocus = char9.Class99[0];
                            final Char[] array6 = new Char[10];
                            int n47 = 0;
                            try {
                                for (n47 = 0; n47 < 10; ++n47) {
                                    final int int20;
                                    Char char10;
                                    if ((int20 = class2.Class1().readInt()) == Char.getMyChar().charID) {
                                        char10 = Char.getMyChar();
                                    }
                                    else {
                                        char10 = GameScr.Class5(int20);
                                    }
                                    array6[n47] = char10;
                                    if (n47 == 0) {
                                        if (class35.cx <= char10.cx) {
                                            class35.Class15 = 1;
                                        }
                                        else {
                                            class35.Class15 = -1;
                                        }
                                    }
                                }
                            }
                            catch (Exception ex27) {}
                            if (n47 > 0) {
                                class35.Class100 = new Char[n47];
                                for (int n48 = 0; n48 < class35.Class100.length; ++n48) {
                                    class35.Class100[n48] = array6[n48];
                                }
                                final Char char11 = class35;
                                char11.charFocus = char11.Class100[0];
                            }
                            break Label_18109;
                        }
                        case 60: {
                            final Char class37;
                            if ((class37 = GameScr.Class5(class2.Class1().readInt())) != null) {
                                Mob.Class26 = class37;
                            }
                            if (class37 == null) {
                                break;
                            }
                            if ((TileMap.tileTypeAtPixel(class37.cx, class37.cy) & 0x2) == 0x2) {
                                class37.Class1(GameScr.sks[class2.Class1().readByte()], 0);
                            }
                            else {
                                class37.Class1(GameScr.sks[class2.Class1().readByte()], 1);
                            }
                            if (class37.Class64 && class37.Class139 >= 500) {
                                class37.Class64 = false;
                                class37.Class126 = System.currentTimeMillis();
                                Game16.Class1(60, class37, 1);
                            }
                            if (class37.Class63) {
                                class37.Class63 = false;
                                class37.Class65 = true;
                                if (class37.Class139 > 500) {
                                    Game16.Class1(60, class37, 1);
                                }
                            }
                            final Mob[] array7 = new Mob[10];
                            int n49 = 0;
                            try {
                                for (n49 = 0; n49 < 10; ++n49) {
                                    final Mob class38 = Mob.Class1(class2.Class1().readUnsignedByte());
                                    array7[n49] = class38;
                                    if (n49 == 0) {
                                        if (class37.cx <= class38.x) {
                                            class37.Class15 = 1;
                                        }
                                        else {
                                            class37.Class15 = -1;
                                        }
                                    }
                                }
                            }
                            catch (Exception ex28) {}
                            if (n49 > 0) {
                                class37.Class99 = new Mob[n49];
                                for (int n50 = 0; n50 < class37.Class99.length; ++n50) {
                                    class37.Class99[n50] = array7[n50];
                                }
                                final Char char12 = class37;
                                char12.mobFocus = char12.Class99[0];
                            }
                            break Label_18109;
                        }
                        case 61: {
                            final Char class39;
                            if ((class39 = GameScr.Class5(class2.Class1().readInt())) == null) {
                                break;
                            }
                            if ((TileMap.tileTypeAtPixel(class39.cx, class39.cy) & 0x2) == 0x2) {
                                class39.Class1(GameScr.sks[class2.Class1().readByte()], 0);
                            }
                            else {
                                class39.Class1(GameScr.sks[class2.Class1().readByte()], 1);
                            }
                            if (class39.Class64) {
                                class39.Class64 = false;
                                class39.Class126 = System.currentTimeMillis();
                                if (class39.Class139 >= 500) {
                                    Game16.Class1(60, class39, 1);
                                }
                            }
                            if (class39.Class63) {
                                class39.Class63 = false;
                                class39.Class65 = true;
                                Game16.Class1(60, class39, 1);
                            }
                            final Char[] array8 = new Char[10];
                            int n51 = 0;
                            try {
                                for (n51 = 0; n51 < 10; ++n51) {
                                    final int int21;
                                    Char char13;
                                    if ((int21 = class2.Class1().readInt()) == Char.getMyChar().charID) {
                                        char13 = Char.getMyChar();
                                    }
                                    else {
                                        char13 = GameScr.Class5(int21);
                                    }
                                    array8[n51] = char13;
                                    if (n51 == 0) {
                                        if (class39.cx <= char13.cx) {
                                            class39.Class15 = 1;
                                        }
                                        else {
                                            class39.Class15 = -1;
                                        }
                                    }
                                }
                            }
                            catch (Exception ex29) {}
                            if (n51 > 0) {
                                class39.Class100 = new Char[n51];
                                for (int n52 = 0; n52 < class39.Class100.length; ++n52) {
                                    class39.Class100[n52] = array8[n52];
                                }
                                final Char char14 = class39;
                                char14.charFocus = char14.Class100[0];
                            }
                            break Label_18109;
                        }
                        case -8: {
                            final int int22 = class2.Class1().readInt();
                            final Char myChar4 = Char.getMyChar();
                            myChar4.yen += int22;
                            GameScr.gI().Class139 = int22;
                            GameScr.Class1((int22 > 0) ? "+".concat(String.valueOf(int22)) : String.valueOf(int22), Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().Class59 - 10, 1);
                            break Label_18109;
                        }
                        case 95: {
                            final int int23 = class2.Class1().readInt();
                            final Char myChar5 = Char.getMyChar();
                            myChar5.xu += int23;
                            GameScr.Class1((int23 > 0) ? "+".concat(String.valueOf(int23)) : String.valueOf(int23), Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().Class59 - 10, 1);
                            break Label_18109;
                        }
                        case 96: {
                            Char.getMyChar().taskOrder.addElement(new TaskOrder(class2.Class1().readByte(), class2.Class1().readInt(), class2.Class1().readInt(), class2.Class1().readUTF(), class2.Class1().readUTF(), class2.Class1().readUnsignedByte(), class2.Class1().readUnsignedByte()));
                            Char.getMyChar().Class10(21);
                            LockGame.HuyLockNVHN();
                            break Label_18109;
                        }
                        case 97: {
                            final byte byte25 = class2.Class1().readByte();
                            int n53 = 0;
                            while (n53 < Char.getMyChar().taskOrder.size()) {
                                final TaskOrder taskOrder;
                                if ((taskOrder = (TaskOrder)Char.getMyChar().taskOrder.elementAt(n53)).taskId == byte25) {
                                    taskOrder.count = class2.Class1().readInt();
                                    if (taskOrder.count == taskOrder.maxCount) {
                                        Char.getMyChar().Class10(61);
                                        break;
                                    }
                                    break;
                                }
                                else {
                                    ++n53;
                                }
                            }
                            break Label_18109;
                        }
                        case 98: {
                            final byte byte26 = class2.Class1().readByte();
                            for (int n54 = 0; n54 < Char.getMyChar().taskOrder.size(); ++n54) {
                                if (((TaskOrder)Char.getMyChar().taskOrder.elementAt(n54)).taskId == byte26) {
                                    Char.getMyChar().taskOrder.removeElementAt(n54);
                                    break;
                                }
                            }
                            Char.getMyChar().Class10(21);
                            break Label_18109;
                        }
                        case -7: {
                            final int int24 = class2.Class1().readInt();
                            final Char myChar6 = Char.getMyChar();
                            myChar6.xu += int24;
                            final Char myChar7 = Char.getMyChar();
                            myChar7.yen -= int24;
                            GameScr.Class1("+".concat(String.valueOf(int24)), Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().Class59 - 10, 1);
                            break Label_18109;
                        }
                        case 5: {
                            final long long1 = class2.Class1().readLong();
                            Char.getMyChar().Class8 = 0L;
                            final Char myChar8 = Char.getMyChar();
                            myChar8.cEXP += long1;
                            final int class40 = Char.getMyChar().Class22;
                            GameScr.Class1(Char.getMyChar().cEXP);
                            if (class40 != Char.getMyChar().Class22) {
                                Game16.Class1(58, Char.getMyChar(), 1);
                            }
                            GameScr.Class1("+".concat(String.valueOf(long1)), Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().Class59, 2);
                            if (long1 >= 1000000L) {
                                InfoMe.addInfo(String.valueOf(Game86.Class299) + " " + long1 + " " + Game86.Class208, 20, mFont.Class12);
                            }
                            break Label_18109;
                        }
                        case 71: {
                            final long long2 = class2.Class1().readLong();
                            final Char myChar9 = Char.getMyChar();
                            myChar9.Class8 -= long2;
                            GameScr.Class1("+".concat(String.valueOf(long2)), Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().Class59, 2);
                            break Label_18109;
                        }
                        case 116: {
                            final Char class41;
                            if ((class41 = GameScr.Class5(class2.Class1().readInt())) != null) {
                                Class1(class41, class2);
                            }
                            break Label_18109;
                        }
                        case 3: {
                            final Char char15;
                            (char15 = new Char()).charID = class2.Class1().readInt();
                            if (!Class1(char15, class2)) {
                                break Label_18109;
                            }
                            GameScr.vCharInMap.addElement(char15);
                            Auto.KiemTraPk(char15);
                            if (!char15.zisHuman() && char15.cName.equals(Char.getMyChar().cName)) {
                                Char.getMyChar().ThemChar1 = char15;
                                LockGame.Game30();
                            }
                            if (char15.charID == -Char.getMyChar().charID) {
                                Char.getMyChar().ThemChar2 = char15;
                            }
                            if (Code.Game2(char15.cName) && !Code.sanbos.Game13()) {
                                Service.gI().addParty(char15.cName);
                            }
                            break Label_18109;
                        }
                        case 1: {
                            final int int25 = class2.Class1().readInt();
                            for (int n55 = 0; n55 < GameScr.vCharInMap.size(); ++n55) {
                                Char char16 = null;
                                try {
                                    char16 = (Char)GameScr.vCharInMap.elementAt(n55);
                                }
                                catch (Exception ex30) {}
                                if (char16 == null) {
                                    break;
                                }
                                if (char16.charID == int25) {
                                    char16.Class130 = class2.Class1().readShort();
                                    char16.Class131 = class2.Class1().readShort();
                                    final Char char17 = char16;
                                    char17.Class1(char17.Class130, char16.Class131);
                                    char16.Class5 = System.currentTimeMillis();
                                    break;
                                }
                            }
                            break Label_18109;
                        }
                        case 2: {
                            final int int26 = class2.Class1().readInt();
                            for (int n56 = 0; n56 < GameScr.vCharInMap.size(); ++n56) {
                                final Char char18;
                                if ((char18 = (Char)GameScr.vCharInMap.elementAt(n56)) != null && char18.charID == int26) {
                                    if (!char18.Class108 && char18.isHuman && !char18.Class3) {
                                        Game16.Class1(60, char18.cx, char18.cy, 1);
                                    }
                                    else if (!char18.Class108 && char18.Class28() && !char18.isHuman) {
                                        Game16.Class1(141, char18.cx, char18.cy, 0);
                                    }
                                    GameScr.vCharInMap.removeElementAt(n56);
                                    Party.Class1(int26);
                                    break Label_1136;
                                }
                            }
                            break Label_18109;
                        }
                        case -5: {
                            try {
                                final Mob class42;
                                (class42 = Mob.Class1(class2.Class1().readUnsignedByte())).Class23 = class2.Class1().readByte();
                                class42.levelBoss = class2.Class1().readByte();
                                final Mob mob = class42;
                                mob.x = mob.xFirst;
                                final Mob mob2 = class42;
                                mob2.y = mob2.yFirst;
                                class42.status = 5;
                                class42.Class31 = false;
                                class42.hp = class2.Class1().readInt();
                                final Mob mob3 = class42;
                                mob3.maxHp = mob3.hp;
                                if (class42.getTemplate().Class5 == 202) {
                                    Game16.Class1(148, class42.x, class42.y, 0);
                                }
                                else {
                                    Game16.Class1(60, class42.x, class42.y, 1);
                                }
                                Auto.KiemtraMob(class42);
                            }
                            catch (Exception ex6) {
                                ex6.printStackTrace();
                            }
                            break Label_18109;
                        }
                        case -1: {
                            Mob class43 = null;
                            try {
                                class43 = Mob.Class1(class2.Class1().readUnsignedByte());
                            }
                            catch (Exception ex31) {}
                            if (class43 == null) {
                                break Label_18109;
                            }
                            class43.hp = class2.Class1().readInt();
                            int int27;
                            if ((int27 = class2.Class1().readInt()) < 0) {
                                int27 = Res.abs(int27) + 32767;
                            }
                            final boolean boolean2 = class2.Class1().readBoolean();
                            try {
                                Auto.KiemtraMob(class43);
                                class43.levelBoss = class2.Class1().readByte();
                                class43.maxHp = class2.Class1().readInt();
                            }
                            catch (Exception ex32) {}
                            if (boolean2) {
                                GameScr.Class1("-".concat(String.valueOf(int27)), class43.x, class43.y - class43.Class12, 3);
                                break Label_18109;
                            }
                            GameScr.Class1("-".concat(String.valueOf(int27)), class43.x, class43.y - class43.Class12, 5);
                            break Label_18109;
                        }
                        case 51: {
                            Mob class44 = null;
                            try {
                                class44 = Mob.Class1(class2.Class1().readUnsignedByte());
                            }
                            catch (Exception ex33) {}
                            if (class44 != null) {
                                class44.hp = class2.Class1().readInt();
                                GameScr.Class1("", class44.x, class44.y - class44.Class12, 4);
                            }
                            break Label_18109;
                        }
                        case -4: {
                            Mob class45 = null;
                            try {
                                class45 = Mob.Class1(class2.Class1().readUnsignedByte());
                            }
                            catch (Exception ex34) {}
                            if (class45 != null && class45.status != 0 && class45.status != 0) {
                                class45.Class5();
                                try {
                                    int int28;
                                    if ((int28 = class2.Class1().readInt()) < 0) {
                                        int28 = Res.abs(int28) + 32767;
                                    }
                                    if (class2.Class1().readBoolean()) {
                                        GameScr.Class1("-".concat(String.valueOf(int28)), class45.x, class45.y - class45.Class12, 3);
                                    }
                                    else {
                                        GameScr.Class1("-".concat(String.valueOf(int28)), class45.x, class45.y - class45.Class12, 5);
                                    }
                                    final ItemMap itemMap4 = new ItemMap(class2.Class1().readShort(), class2.Class1().readShort(), class45.x, class45.y, class2.Class1().readShort(), class2.Class1().readShort());
                                    GameScr.vItemMap.addElement(itemMap4);
                                    if (Res.abs(itemMap4.y - Char.getMyChar().cy) < 24 && Res.abs(itemMap4.x - Char.getMyChar().cx) < 24) {
                                        Char.getMyChar().charFocus = null;
                                    }
                                }
                                catch (Exception ex35) {}
                            }
                            break Label_18109;
                        }
                        case 78: {
                            Mob class46 = null;
                            try {
                                class46 = Mob.Class1(class2.Class1().readUnsignedByte());
                            }
                            catch (Exception ex36) {}
                            if (class46 == null || class46.status == 0 || class46.status == 0) {
                                break Label_18109;
                            }
                            class46.status = 0;
                            Game16.Class1(60, class46.x, class46.y, 1);
                            final ItemMap itemMap5 = new ItemMap(class2.Class1().readShort(), class2.Class1().readShort(), class46.x, class46.y, class2.Class1().readShort(), class2.Class1().readShort());
                            GameScr.vItemMap.addElement(itemMap5);
                            if (Res.abs(itemMap5.y - Char.getMyChar().cy) < 24 && Res.abs(itemMap5.x - Char.getMyChar().cx) < 24) {
                                Char.getMyChar().charFocus = null;
                            }
                            break Label_18109;
                        }
                        case -3: {
                            Mob class47 = null;
                            try {
                                class47 = Mob.Class1(class2.Class1().readUnsignedByte());
                            }
                            catch (Exception ex37) {}
                            if (class47 != null) {
                                final int int29 = class2.Class1().readInt();
                                int int30;
                                try {
                                    int30 = class2.Class1().readInt();
                                }
                                catch (Exception ex38) {
                                    int30 = 0;
                                }
                                if (class47.Class28) {
                                    Char.getMyChar().Class1(int29, int30, false, -1);
                                    class47.Class6();
                                }
                                else {
                                    class47.Class21 = int29;
                                    class47.Class22 = int30;
                                    class47.Class1(Char.getMyChar());
                                }
                                class47.Class1(class2.Class1().readShort(), class2.Class1().readByte(), class2.Class1().readByte());
                            }
                            break Label_18109;
                        }
                        case -2: {
                            Mob class48 = null;
                            try {
                                class48 = Mob.Class1(class2.Class1().readUnsignedByte());
                            }
                            catch (Exception ex39) {}
                            if (class48 == null) {
                                break Label_18109;
                            }
                            final Char class49;
                            if ((class49 = GameScr.Class5(class2.Class1().readInt())) != null) {
                                final int int31 = class2.Class1().readInt();
                                class48.Class21 = class49.cHP - int31;
                                class49.Class26 = int31;
                                try {
                                    class49.cMP = class2.Class1().readInt();
                                }
                                catch (Exception ex40) {}
                                if (class48.Class28) {
                                    class49.Class1(class48.Class21, 0, false, -1);
                                    class48.Class6();
                                }
                                else {
                                    class48.Class1(class49);
                                }
                                class48.Class1(class2.Class1().readShort(), class2.Class1().readByte(), class2.Class1().readByte());
                                break Label_18109;
                            }
                            break;
                        }
                        case -11: {
                            Char.getMyChar().cPk = class2.Class1().readByte();
                            Char.getMyChar().Class1(class2.Class1().readShort(), class2.Class1().readShort());
                            try {
                                GameScr.Class1(Char.getMyChar().cEXP = class2.Class1().readLong());
                            }
                            catch (Exception ex41) {}
                            Char.getMyChar().Class105 = 0;
                            break Label_18109;
                        }
                        case 72: {
                            Char.getMyChar().cPk = class2.Class1().readByte();
                            Char.getMyChar().Class1(class2.Class1().readShort(), class2.Class1().readShort());
                            Char.getMyChar().cEXP = GameScr.Class2(Char.getMyChar().Class22 - 1);
                            Char.getMyChar().Class8 = class2.Class1().readLong();
                            GameScr.Class1(Char.getMyChar().cEXP);
                            break Label_18109;
                        }
                        case 0: {
                            final Char class50;
                            if ((class50 = GameScr.Class5(class2.Class1().readInt())) == null) {
                                break;
                            }
                            class50.cPk = class2.Class1().readByte();
                            if (class50.charID == Char.Class122) {
                                Char.Class118 = true;
                            }
                            class50.Class1(class2.Class1().readShort(), class2.Class1().readShort());
                            if (Char.getMyChar().charFocus == class50) {
                                Char.getMyChar().charFocus = null;
                            }
                            break Label_18109;
                        }
                        case -10: {
                            if (Char.getMyChar().Class166 != 0 || Char.getMyChar().Class167 != 0) {
                                Char.getMyChar().cx = Char.getMyChar().Class166;
                                Char.getMyChar().cy = Char.getMyChar().Class167;
                                final Char myChar10 = Char.getMyChar();
                                final Char myChar11 = Char.getMyChar();
                                final short n57 = 0;
                                myChar11.Class167 = n57;
                                myChar10.Class166 = n57;
                            }
                            Char.getMyChar().Class24();
                            Char.Class134 = false;
                            break Label_18109;
                        }
                        case -23: {
                            final int int32 = class2.Class1().readInt();
                            final String utf17 = class2.Class1().readUTF();
                            Char char19;
                            if (Char.getMyChar().charID == int32) {
                                char19 = Char.getMyChar();
                            }
                            else {
                                char19 = GameScr.Class5(int32);
                            }
                            if (char19 != null) {
                                ChatPopup.Class1(utf17, 100, char19);
                                ChatManager.gI().Chat(Game86.Class400[0], char19.cName, utf17);
                                break Label_18109;
                            }
                            break;
                        }
                        case 25: {
                            for (byte byte27 = class2.Class1().readByte(), b8 = 0; b8 < byte27; ++b8) {
                                final int int33 = class2.Class1().readInt();
                                final short short17 = class2.Class1().readShort();
                                final short short18 = class2.Class1().readShort();
                                final int int34 = class2.Class1().readInt();
                                final Char class51;
                                if ((class51 = GameScr.Class5(int33)) != null) {
                                    class51.cx = short17;
                                    class51.cy = short18;
                                    class51.cHP = int34;
                                    class51.Class5 = System.currentTimeMillis();
                                }
                            }
                            break Label_18109;
                        }
                        case 26: {
                            Char.getMyChar().Class105 = class2.Class1().readUnsignedShort();
                            Char.getMyChar().Class106 = class2.Class1().readUnsignedShort();
                            break Label_18109;
                        }
                        case 126: {
                            final byte byte28 = class2.Class1().readByte();
                            GameCanvas.endDlg();
                            if (byte28 == 0) {
                                GameScr.Class8.Class22();
                            }
                            break Label_18109;
                        }
                    }
                }
                return;
            }
            catch (Exception ex7) {
                System.out.println("ERROR COMAND: " + class2.Class1);
                ex7.printStackTrace();
            }
            finally {
                class2.Class2();
            }
        }
        class2.Class2();
    }
    
    private static void Class1(final DataInputStream dataInputStream) {
        GameScr.Class121 = (byte)dataInputStream.readUnsignedByte();
        GameScr.Class48 = new ItemOptionTemplate[dataInputStream.readUnsignedByte()];
        for (int i = 0; i < GameScr.Class48.length; ++i) {
            GameScr.Class48[i] = new ItemOptionTemplate();
            GameScr.Class48[i].id = i;
            GameScr.Class48[i].name = dataInputStream.readUTF();
            GameScr.Class48[i].type = dataInputStream.readByte();
        }
        for (short short1 = dataInputStream.readShort(), n = 0; n < short1; ++n) {
            Game104.Class1(new ItemTemplate(n, dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readByte(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readBoolean()));
        }
    }
    
    private static void Class2(final DataInputStream dataInputStream) {
        GameScr.Class120 = dataInputStream.readByte();
        GameScr.Class49 = new Game67[dataInputStream.readByte()];
        for (int i = 0; i < GameScr.Class49.length; ++i) {
            GameScr.Class49[i] = new Game67();
            GameScr.Class49[i].Class1 = i;
            GameScr.Class49[i].Class2 = dataInputStream.readUTF();
        }
        GameScr.Class43 = new NClass[dataInputStream.readUnsignedByte()];
        for (int j = 0; j < GameScr.Class43.length; ++j) {
            GameScr.Class43[j] = new NClass();
            GameScr.Class43[j].classId = j;
            GameScr.Class43[j].Class2 = dataInputStream.readUTF();
            GameScr.Class43[j].Class3 = new SkillTemplate[dataInputStream.readByte()];
            for (int k = 0; k < GameScr.Class43[j].Class3.length; ++k) {
                GameScr.Class43[j].Class3[k] = new SkillTemplate();
                GameScr.Class43[j].Class3[k].id = dataInputStream.readByte();
                GameScr.Class43[j].Class3[k].Class2 = dataInputStream.readUTF();
                GameScr.Class43[j].Class3[k].Class3 = dataInputStream.readByte();
                GameScr.Class43[j].Class3[k].type = dataInputStream.readByte();
                GameScr.Class43[j].Class3[k].iconId = dataInputStream.readShort();
                int n = 150;
                if (GameCanvas.Class25 == 128 || GameCanvas.Class26 <= 208) {
                    n = 100;
                }
                GameScr.Class43[j].Class3[k].Class6 = mFont.number_red.Class2(dataInputStream.readUTF(), n);
                GameScr.Class43[j].Class3[k].Class7 = new Skill[dataInputStream.readByte()];
                for (int l = 0; l < GameScr.Class43[j].Class3[k].Class7.length; ++l) {
                    GameScr.Class43[j].Class3[k].Class7[l] = new Skill();
                    GameScr.Class43[j].Class3[k].Class7[l].Class2 = dataInputStream.readShort();
                    GameScr.Class43[j].Class3[k].Class7[l].template = GameScr.Class43[j].Class3[k];
                    GameScr.Class43[j].Class3[k].Class7[l].Class3 = dataInputStream.readByte();
                    GameScr.Class43[j].Class3[k].Class7[l].Class4 = dataInputStream.readByte();
                    GameScr.Class43[j].Class3[k].Class7[l].Class10 = dataInputStream.readShort();
                    GameScr.Class43[j].Class3[k].Class7[l].coolDown = dataInputStream.readInt();
                    GameScr.Class43[j].Class3[k].Class7[l].dx = dataInputStream.readShort();
                    GameScr.Class43[j].Class3[k].Class7[l].dy = dataInputStream.readShort();
                    GameScr.Class43[j].Class3[k].Class7[l].maxFight = dataInputStream.readByte();
                    GameScr.Class43[j].Class3[k].Class7[l].Class11 = new Game72[dataInputStream.readByte()];
                    for (int n2 = 0; n2 < GameScr.Class43[j].Class3[k].Class7[l].Class11.length; ++n2) {
                        GameScr.Class43[j].Class3[k].Class7[l].Class11[n2] = new Game72();
                        GameScr.Class43[j].Class3[k].Class7[l].Class11[n2].Class1 = dataInputStream.readShort();
                        GameScr.Class43[j].Class3[k].Class7[l].Class11[n2].Class2 = GameScr.Class49[dataInputStream.readByte()];
                    }
                    Game30.Class1(GameScr.Class43[j].Class3[k].Class7[l]);
                }
            }
        }
    }
    
    private static void Class3(final DataInputStream dataInputStream) {
        GameScr.Class119 = dataInputStream.readByte();
        TileMap.mapNames = new String[dataInputStream.readUnsignedByte()];
        for (int i = 0; i < TileMap.mapNames.length; ++i) {
            TileMap.mapNames[i] = dataInputStream.readUTF();
        }
        Npc.arrtemplate = new NpcTemplate[dataInputStream.readByte()];
        for (int j = 0; j < Npc.arrtemplate.length; j = (byte)(j + 1)) {
            Npc.arrtemplate[j] = new NpcTemplate();
            Npc.arrtemplate[j].npcTemplateId = j;
            Npc.arrtemplate[j].name = dataInputStream.readUTF();
            Npc.arrtemplate[j].headId = dataInputStream.readShort();
            Npc.arrtemplate[j].bodyId = dataInputStream.readShort();
            Npc.arrtemplate[j].legId = dataInputStream.readShort();
            Npc.arrtemplate[j].menu = new String[dataInputStream.readByte()][];
            for (int k = 0; k < Npc.arrtemplate[j].menu.length; ++k) {
                Npc.arrtemplate[j].menu[k] = new String[dataInputStream.readByte()];
                for (int l = 0; l < Npc.arrtemplate[j].menu[k].length; ++l) {
                    Npc.arrtemplate[j].menu[k][l] = dataInputStream.readUTF();
                }
            }
        }
        final int unsignedByte;
        Mob.arrMobTemplate = new MobTemplate[unsignedByte = dataInputStream.readUnsignedByte()];
        for (int n = 0; n < unsignedByte; ++n) {
            Mob.arrMobTemplate[n] = new MobTemplate();
            Mob.arrMobTemplate[n].Class5 = (short)n;
            Mob.arrMobTemplate[n].Class3 = dataInputStream.readByte();
            Mob.arrMobTemplate[n].name = dataInputStream.readUTF();
            Mob.arrMobTemplate[n].hp = dataInputStream.readInt();
            Mob.arrMobTemplate[n].Class1 = dataInputStream.readByte();
            Mob.arrMobTemplate[n].Class2 = dataInputStream.readByte();
        }
    }
    
    private static void Class4(final DataInputStream dataInputStream) {
        GameScr.Class118 = dataInputStream.readByte();
        TaskOrder.save("nj_arrow", Game20.Class123(dataInputStream));
        TaskOrder.save("nj_effect", Game20.Class123(dataInputStream));
        TaskOrder.save("nj_image", Game20.Class123(dataInputStream));
        TaskOrder.save("nj_part", Game20.Class123(dataInputStream));
        TaskOrder.save("nj_skill", Game20.Class123(dataInputStream));
        GameScr.Class117 = new byte[(GameScr.Class116 = new byte[dataInputStream.readByte()][]).length][];
        for (int i = 0; i < GameScr.Class116.length; ++i) {
            GameScr.Class116[i] = new byte[dataInputStream.readByte()];
            GameScr.Class117[i] = new byte[GameScr.Class116[i].length];
            for (int j = 0; j < GameScr.Class116[i].length; ++j) {
                GameScr.Class116[i][j] = dataInputStream.readByte();
                GameScr.Class117[i][j] = dataInputStream.readByte();
            }
        }
        GameScr.Class98 = new long[dataInputStream.readUnsignedByte()];
        for (int k = 0; k < GameScr.Class98.length; ++k) {
            GameScr.Class98[k] = dataInputStream.readLong();
        }
        GameScr.Class99 = new int[dataInputStream.readByte()];
        for (int l = 0; l < GameScr.Class99.length; ++l) {
            GameScr.Class99[l] = dataInputStream.readInt();
        }
        GameScr.Class100 = new int[dataInputStream.readByte()];
        for (int n = 0; n < GameScr.Class100.length; ++n) {
            GameScr.Class100[n] = dataInputStream.readInt();
        }
        GameScr.Class101 = new int[dataInputStream.readByte()];
        for (int n2 = 0; n2 < GameScr.Class101.length; ++n2) {
            GameScr.Class101[n2] = dataInputStream.readInt();
        }
        GameScr.Class102 = new int[dataInputStream.readByte()];
        for (int n3 = 0; n3 < GameScr.Class102.length; ++n3) {
            GameScr.Class102[n3] = dataInputStream.readInt();
        }
        GameScr.Class103 = new int[dataInputStream.readByte()];
        for (int n4 = 0; n4 < GameScr.Class103.length; ++n4) {
            GameScr.Class103[n4] = dataInputStream.readInt();
        }
        GameScr.Class104 = new int[dataInputStream.readByte()];
        for (int n5 = 0; n5 < GameScr.Class104.length; ++n5) {
            GameScr.Class104[n5] = dataInputStream.readInt();
        }
        GameScr.Class105 = new int[dataInputStream.readByte()];
        for (int n6 = 0; n6 < GameScr.Class105.length; ++n6) {
            GameScr.Class105[n6] = dataInputStream.readInt();
        }
        GameScr.Class106 = new int[dataInputStream.readByte()];
        for (int n7 = 0; n7 < GameScr.Class106.length; ++n7) {
            GameScr.Class106[n7] = dataInputStream.readInt();
        }
        GameScr.Class108 = new int[dataInputStream.readByte()];
        for (int n8 = 0; n8 < GameScr.Class108.length; ++n8) {
            GameScr.Class108[n8] = dataInputStream.readInt();
        }
        GameScr.Class107 = new int[dataInputStream.readByte()];
        for (int n9 = 0; n9 < GameScr.Class107.length; ++n9) {
            GameScr.Class107[n9] = dataInputStream.readInt();
        }
        Effect.Class1 = new EffectTemplate[dataInputStream.readByte()];
        for (int n10 = 0; n10 < Effect.Class1.length; ++n10) {
            Effect.Class1[n10] = new EffectTemplate();
            Effect.Class1[n10].id = dataInputStream.readByte();
            Effect.Class1[n10].type = dataInputStream.readByte();
            dataInputStream.readUTF();
            Effect.Class1[n10].iconId = dataInputStream.readShort();
        }
    }
    
    public static Image Class1(final byte[] array) {
        try {
            return Image.createImage(array, 0, array.length);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    private static void loadInfoMap(final Message message) {
        try {
            Auto.XoaMob();
            Auto.XoaPk();
            Auto.Login2 = false;
            final Char myChar = Char.getMyChar();
            final Char myChar2 = Char.getMyChar();
            Char.getMyChar();
            final short short1 = message.Class4.readShort();
            myChar2.cxSend = short1;
            myChar.cx = short1;
            final Char myChar3 = Char.getMyChar();
            final Char myChar4 = Char.getMyChar();
            Char.getMyChar();
            final short short2 = message.Class4.readShort();
            myChar4.cySend = short2;
            myChar3.cy = short2;
            for (byte byte1 = message.Class4.readByte(), b = 0; b < byte1; ++b) {
                TileMap.vGo.addElement(new InfoDlg(message.Class4.readShort(), message.Class4.readShort(), message.Class4.readShort(), message.Class4.readShort()));
            }
            Auto.XoaMob();
            for (byte byte2 = message.Class4.readByte(), b2 = 0; b2 < byte2; ++b2) {
                final Mob mob = new Mob(b2, message.Class4.readBoolean(), message.Class4.readBoolean(), message.Class4.readBoolean(), message.Class4.readBoolean(), message.Class4.readBoolean(), message.Class4.readUnsignedByte(), message.Class4.readByte(), message.Class4.readInt(), message.Class4.readUnsignedByte(), message.Class4.readInt(), message.Class4.readShort(), message.Class4.readShort(), message.Class4.readByte(), message.Class4.readByte(), message.Class4.readBoolean(), false);
                final MobTemplate o;
                if ((o = Mob.arrMobTemplate[mob.templateId]).Class3 != 0) {
                    if (b2 % 3 == 0) {
                        mob.dir = -1;
                    }
                    else {
                        mob.dir = 1;
                    }
                    final Mob mob2 = mob;
                    mob2.x += 10 - b2 % 20;
                }
                Auto.KiemtraMob(mob);
                if (!Controller.tansat.contains(o) && !mob.isBoss && ((mob.templateId != 179 && mob.templateId != 175 && mob.templateId != 202) || mob.status != 8)) {
                    Controller.tansat.addElement(o);
                }
                GameScr.vMob.addElement(mob);
            }
            for (byte byte3 = message.Class4.readByte(), b3 = 0; b3 < byte3; ++b3) {
                GameScr.Class42.addElement(new Game92(message.Class4.readUTF(), message.Class4.readShort(), message.Class4.readShort()));
            }
            for (byte byte4 = message.Class4.readByte(), b4 = 0; b4 < byte4; ++b4) {
                GameScr.vNpc.addElement(new Npc(message.Class4.readByte(), message.Class4.readShort(), message.Class4.readShort(), message.Class4.readByte()));
            }
            for (byte byte5 = message.Class4.readByte(), b5 = 0; b5 < byte5; ++b5) {
                final ItemMap itemMap = new ItemMap(message.Class4.readShort(), message.Class4.readShort(), message.Class4.readShort(), message.Class4.readShort());
                boolean b6 = false;
                for (int i = 0; i < GameScr.vItemMap.size(); ++i) {
                    if (((ItemMap)GameScr.vItemMap.elementAt(i)).itemMapID == itemMap.itemMapID) {
                        b6 = true;
                        break;
                    }
                }
                if (!b6) {
                    GameScr.vItemMap.addElement(itemMap);
                }
            }
            GameScr.Class1(false);
            try {
                TileMap.Class10 = null;
                TileMap.Class11 = (TileMap.Class10 = message.Class4.readUTF());
            }
            catch (Exception ex2) {}
            try {
                TileMap.Class22.clear();
                for (int unsignedByte = message.Class4.readUnsignedByte(), j = 0; j < unsignedByte; ++j) {
                    TileMap.Class22.Class1(new StringBuffer(String.valueOf((short)(message.Class4.readUnsignedByte() * TileMap.Class1 + message.Class4.readUnsignedByte()))).toString(), "location");
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            TileMap.Class1(TileMap.Class5);
            Char.getMyChar().Class11 = 0;
            Char.getMyChar().statusMe = 4;
            GameScr.gI().Class16();
            GameCanvas.Class2(TileMap.Class13);
            Char.Class134 = false;
            Char.Class133 = false;
            GameCanvas.Class8();
            GameCanvas.Class7();
            if (!TileMap.IsDangGoMap || TileMap.MapMod == TileMap.mapID) {
                GameScr.gI().switchToMe();
                InfoDlg.hide();
                InfoDlg.Class1(TileMap.Class11, String.valueOf(Game86.Class341) + " " + TileMap.zoneID, 30);
                Party.Class1();
                GameCanvas.endDlg();
            }
            Session_ME.Huyobj();
            GameCanvas.isLoading = false;
        }
        catch (Exception ex3) {}
        TileMap.HuyLockMap();
    }
    
    private void Class5(Message class2) {
        Label_4405: {
            try {
                switch (class2.Class4.readByte()) {
                    case -127: {
                        break Label_4405;
                    }
                    case -59: {
                        final GameMidlet class3 = GameMidlet.Class6;
                        GameMidlet.Class1();
                        break Label_4405;
                    }
                    case -98: {
                        Char.getMyChar();
                        Char.Class25();
                        break Label_4405;
                    }
                    case -99: {
                        GameCanvas.Class37.Class1(Game86.Class41, Game86.Class42);
                        GameCanvas.Class37.Class1(class2.Class4.readUTF(), new Command(Game86.CLOSE, GameCanvas.instance, 8882, null), new Command(Game86.Class46, GameCanvas.instance, 88816, null), 0, 1);
                        break Label_4405;
                    }
                    case -97: {
                        GameCanvas.isLoading = false;
                        GameCanvas.endDlg();
                        GameCanvas.inputDlg.show(Game86.Class128, new Command(Game86.Class76, GameCanvas.instance, 88829, new Integer(class2.Class4.readInt())), 0);
                        break Label_4405;
                    }
                    case -115: {
                        Game2.Class1(class2.Class4.readInt(), Game20.Class2(class2));
                        break Label_4405;
                    }
                    case -117: {
                        Char.getMyChar().cPk = class2.Class4.readByte();
                        Info.addInfo(String.valueOf(Game86.Class239) + " " + Char.getMyChar().cPk, 15, mFont.Class12);
                        Char.getMyChar().Class10(21);
                        break Label_4405;
                    }
                    case -96: {
                        Char.getMyChar().Class55 = class2.Class4.readUTF();
                        Char.getMyChar().Class56 = 4;
                        Char.getMyChar().luong = class2.Class4.readInt();
                        Char.getMyChar().Class10(21);
                        break Label_4405;
                    }
                    case -113: {
                        if (Char.Class57 == null) {
                            Char.Class57 = new Game117();
                        }
                        Char.Class57.Class1 = class2.Class4.readUTF();
                        Char.Class57.Class10 = class2.Class4.readUTF();
                        class2.Class4.readUTF();
                        Char.Class57.Class14 = class2.Class4.readShort();
                        Char.Class57.Class6 = class2.Class4.readByte();
                        Char.Class57.Class4 = class2.Class4.readByte();
                        Char.Class57.Class2 = class2.Class4.readInt();
                        Char.Class57.Class3 = class2.Class4.readInt();
                        Char.Class57.Class7 = class2.Class4.readInt();
                        Char.Class57.Class8 = class2.Class4.readInt();
                        Char.Class57.Class9 = class2.Class4.readInt();
                        Char.Class57.Class11 = class2.Class4.readUTF();
                        Char.Class57.Class13 = class2.Class4.readUTF();
                        Char.Class57.Class15 = class2.Class4.readInt();
                        Char.Class57.Class5 = class2.Class4.readByte();
                        break Label_4405;
                    }
                    case -93: {
                        final int int1;
                        if ((int1 = class2.Class4.readInt()) == Char.getMyChar().charID) {
                            GameScr.Class31.removeAllElements();
                            Char.getMyChar().Class55 = "";
                            Char.getMyChar().Class56 = -1;
                            Char.Class57 = null;
                            break Label_4405;
                        }
                        GameScr.Class31.removeAllElements();
                        final Char class4;
                        (class4 = GameScr.Class5(int1)).Class55 = "";
                        class4.Class56 = -1;
                        break Label_4405;
                    }
                    case -114: {
                        if (Char.Class57 == null) {
                            Char.Class57 = new Game117();
                        }
                        Char.Class57.Class1(class2.Class4.readUTF());
                        break Label_4405;
                    }
                    case -62: {
                        Char.Class57.Class5 = class2.Class4.readByte();
                        break Label_4405;
                    }
                    case -81: {
                        Char.Class125 = class2.Class4.readShort();
                        break Label_4405;
                    }
                    case -77: {
                        GameCanvas.Class2(TileMap.Class13 = class2.Class4.readByte());
                        break Label_4405;
                    }
                    case -70: {
                        GameCanvas.Class1(Game20.Class1(Game86.Class466, "#", class2.Class4.readUTF()), new Command(Game86.Class60, GameCanvas.instance, 88842, null), new Command(Game86.Class73, GameCanvas.instance, 8882, null));
                        break Label_4405;
                    }
                    case -72: {
                        GameScr.gI().Class141 = new String[9];
                        GameScr.Class82 = new short[9];
                        if (GameScr.indexSelect < 0 || GameScr.indexSelect > 8) {
                            GameScr.indexSelect = (GameScr.Class47 = 0);
                        }
                        for (int i = 0; i < 9; ++i) {
                            GameScr.Class82[i] = class2.Class4.readShort();
                            GameScr.gI().Class141[i] = GameScr.gI().Class138[Game20.Class1(9)];
                        }
                        GameScr.gI().left = new Command(Game86.Class51, null, 1506, null);
                        GameScr.gI().Class137 = System.currentTimeMillis();
                        final GameScr gi = GameScr.gI();
                        --gi.Class83;
                        GameCanvas.endDlg();
                        break Label_4405;
                    }
                    case -88: {
                        GameScr.gI().Class22();
                        final Item item;
                        (item = Char.getMyChar().arrItemBag[class2.Class4.readByte()]).Class7();
                        item.Class7 = true;
                        item.upgrade = class2.Class4.readByte();
                        final Item item2;
                        (item2 = Char.getMyChar().arrItemBag[class2.Class4.readByte()]).Class7();
                        item2.Class7 = true;
                        item2.upgrade = class2.Class4.readByte();
                        Info.addInfo(Game86.Class339, 20, mFont.Class6);
                        break Label_4405;
                    }
                    case -112: {
                        GameScr.Class31.removeAllElements();
                        final short short1 = class2.Class4.readShort();
                        for (short n = 0; n < short1; ++n) {
                            GameScr.Class31.addElement(new Game41(class2.Class4.readByte(), class2.Class4.readByte(), class2.Class4.readByte(), class2.Class4.readUTF(), class2.Class4.readInt(), class2.Class4.readBoolean()));
                        }
                        try {
                            for (short n2 = 0; n2 < short1; ++n2) {
                                ((Game41)GameScr.Class31.elementAt(n2)).Class7 = class2.Class4.readInt();
                            }
                        }
                        catch (Exception ex2) {}
                        GameScr.gI();
                        GameScr.Class25();
                        break Label_4405;
                    }
                    case -111: {
                        Char.Class57.Class16 = new Item[30];
                        for (byte byte1 = class2.Class4.readByte(), indexUI = 0; indexUI < byte1; ++indexUI) {
                            Char.Class57.Class16[indexUI] = new Item();
                            Char.Class57.Class16[indexUI].typeUI = 39;
                            Char.Class57.Class16[indexUI].indexUI = indexUI;
                            Char.Class57.Class16[indexUI].quantity = class2.Class4.readShort();
                            Char.Class57.Class16[indexUI].template = Game104.Class1(class2.Class4.readShort());
                        }
                        GameScr.gI().Class169.removeAllElements();
                        for (byte byte2 = class2.Class4.readByte(), b = 0; b < byte2; ++b) {
                            final String utf = class2.Class4.readUTF();
                            final short short2 = class2.Class4.readShort();
                            final short short3 = class2.Class4.readShort();
                            final int int2 = class2.Class4.readInt();
                            String utf2 = "";
                            final MyVector myVector = new MyVector();
                            int int3 = -1;
                            int int4 = -1;
                            final byte byte3 = class2.Class4.readByte();
                            if (int2 >= 0) {
                                utf2 = class2.Class4.readUTF();
                            }
                            else {
                                for (byte b2 = 0; b2 < byte3; ++b2) {
                                    myVector.addElement(class2.Class4.readUTF());
                                }
                                int3 = class2.Class4.readInt();
                                int4 = class2.Class4.readInt();
                            }
                            GameScr.gI().Class169.addElement(new Game114(utf, class2.Class4.readByte(), short2, short3, int2, utf2, myVector, int3, int4));
                        }
                        break Label_4405;
                    }
                    case -116: {
                        Char.getMyChar().xu = class2.Class4.readInt();
                        Char.Class57.Class7 = class2.Class4.readInt();
                        break Label_4405;
                    }
                    case -90: {
                        Char.getMyChar().xu = class2.Class4.readInt();
                        GameScr.gI().Class22();
                        break Label_4405;
                    }
                    case -86: {
                        GameCanvas.endDlg();
                        GameScr.gI().Class22();
                        InfoMe.addInfo(class2.Class4.readUTF(), 20, mFont.Class12);
                        break Label_4405;
                    }
                    case -106: {
                        GameScr.Class136 = class2.Class4.readByte();
                        break Label_4405;
                    }
                    case -84: {
                        Char.Class124 = class2.Class4.readShort();
                        break Label_4405;
                    }
                    case -80: {
                        GameScr.gI().showAlert(Game86.Class123, class2.Class4.readUTF(), false);
                        if (class2.Class4.readBoolean()) {
                            GameScr.gI().left = new Command(Game86.Class136, 2000);
                        }
                        break Label_4405;
                    }
                    case -83: {
                        final short short4 = class2.Class4.readShort();
                        final short short5 = class2.Class4.readShort();
                        final byte byte4 = class2.Class4.readByte();
                        final short short6 = class2.Class4.readShort();
                        if (short4 == 0) {
                            GameScr.gI().showAlert(Game86.Class124, "          " + Game86.Class379, false);
                            break Label_4405;
                        }
                        final String string = String.valueOf(Game86.Class113) + ": " + short4 + "\n\n";
                        String obj;
                        if (short5 == 0) {
                            obj = String.valueOf(string) + Game86.Class116 + "\n\n";
                        }
                        else {
                            obj = String.valueOf(string) + Game86.Class117 + ": " + Game20.Class2(short5) + "\n\n";
                        }
                        GameScr.gI().showAlert(Game86.Class124, String.valueOf(new StringBuffer(String.valueOf(obj)).append(Game86.Class118).append(": ").append(byte4).append("\n\n").toString()) + Game86.Class136 + ": " + short6 + " " + Game86.Class137 + "\n\n", false);
                        if (short6 > 0) {
                            GameScr.gI().left = new Command(Game86.Class136, 1000);
                        }
                        break Label_4405;
                    }
                    case -95: {
                        if (Char.Class57 != null) {
                            Char.Class57.Class13 = class2.Class4.readUTF();
                        }
                        break Label_4405;
                    }
                    case -126: {
                        final byte byte5 = class2.Class4.readByte();
                        Game83.Class9 = false;
                        final Game119 class5;
                        (class5 = Game119.Class6()).Class14 = new String[3];
                        class5.Class9 = new int[3];
                        class5.Class10 = new int[3];
                        class5.Class11 = new int[3];
                        class5.Class12 = new int[3];
                        class5.Class13 = new int[3];
                        class5.Class15 = new String[3];
                        class5.Class16 = new byte[3];
                        if (GameCanvas.Class6) {
                            class5.Class8 = -1;
                        }
                        else {
                            class5.Class8 = 0;
                        }
                        GameScr.gI();
                        GameScr.Class10();
                        Game2.Class4();
                        for (byte b3 = 0; b3 < byte5; ++b3) {
                            Game119.Class6().Class16[b3] = class2.Class4.readByte();
                            Game119.Class6().Class14[b3] = class2.Class4.readUTF();
                            Game119.Class6().Class15[b3] = class2.Class4.readUTF();
                            Game119.Class6().Class13[b3] = class2.Class4.readUnsignedByte();
                            Game119.Class6().Class9[b3] = class2.Class4.readShort();
                            Game119.Class6().Class12[b3] = class2.Class4.readShort();
                            Game119.Class6().Class11[b3] = class2.Class4.readShort();
                            Game119.Class6().Class10[b3] = class2.Class4.readShort();
                            if (Game119.Class6().Class12[b3] == -1) {
                                Game119.Class6().Class12[b3] = 15;
                            }
                            if (Game119.Class6().Class11[b3] == -1) {
                                if (Game119.Class6().Class16[b3] == 0) {
                                    Game119.Class6().Class11[b3] = 10;
                                }
                                else {
                                    Game119.Class6().Class11[b3] = 1;
                                }
                            }
                            if (Game119.Class6().Class10[b3] == -1) {
                                if (Game119.Class6().Class16[b3] == 0) {
                                    Game119.Class6().Class10[b3] = 9;
                                }
                                else {
                                    Game119.Class6().Class10[b3] = 0;
                                }
                            }
                        }
                        Game119.Class6().switchToMe();
                        GameCanvas.endDlg();
                        break Label_4405;
                    }
                    case -123: {
                        GameScr.Class122 = class2.Class4.readByte();
                        GameScr.Class123 = class2.Class4.readByte();
                        GameScr.Class124 = class2.Class4.readByte();
                        GameScr.Class125 = class2.Class4.readByte();
                        System.out.println("****** DATA VERSION: Server " + GameScr.Class122 + " Client " + GameScr.Class118);
                        System.out.println("****** MAP VERSION: Server " + GameScr.Class123 + " Client " + GameScr.Class119);
                        System.out.println("****** SKILL VERSION: Server " + GameScr.Class124 + " Client " + GameScr.Class120);
                        System.out.println("****** ITEM VERSION: Server " + GameScr.Class125 + " Client " + GameScr.Class121);
                        if (GameScr.Class122 != GameScr.Class118) {
                            Service.gI().Class12();
                        }
                        else {
                            try {
                                Class4(new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("data"))));
                            }
                            catch (Exception ex3) {
                                GameScr.Class118 = -1;
                                Service.gI().Class12();
                            }
                        }
                        if (GameScr.Class123 != GameScr.Class119) {
                            Service.gI().Class13();
                        }
                        else {
                            try {
                                Class3(new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("map"))));
                            }
                            catch (Exception ex4) {
                                GameScr.Class119 = -1;
                                Service.gI().Class13();
                            }
                        }
                        if (GameScr.Class124 != GameScr.Class120) {
                            Service.gI().Class14();
                        }
                        else {
                            try {
                                Class2(new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("skill"))));
                            }
                            catch (Exception ex5) {
                                GameScr.Class120 = -1;
                                Service.gI().Class14();
                            }
                        }
                        if (GameScr.Class125 != GameScr.Class121) {
                            Service.gI().Class15();
                        }
                        else {
                            try {
                                Class1(new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("item"))));
                            }
                            catch (Exception ex6) {
                                GameScr.Class121 = -1;
                                Service.gI().Class15();
                            }
                        }
                        if (GameScr.Class122 == GameScr.Class118 && GameScr.Class123 == GameScr.Class119 && GameScr.Class124 == GameScr.Class120 && GameScr.Class125 == GameScr.Class121) {
                            GameScr.gI();
                            GameScr.startWaitDlgWithoutCancel();
                            GameScr.gI();
                            GameScr.Class12();
                            GameScr.gI();
                            GameScr.Class13();
                            Service.gI().Class16();
                        }
                        Game94.Class1(class2);
                        break Label_4405;
                    }
                    case -122: {
                        System.out.println("GET UPDATE_DATA " + class2.Class4.available() + " bytes");
                        class2.Class4.mark(100000);
                        Class4(class2.Class4);
                        class2.Class4.reset();
                        final byte[] b4 = new byte[class2.Class4.available()];
                        class2.Class4.readFully(b4);
                        TaskOrder.save("data", b4);
                        TaskOrder.save("dataVersion", new byte[] { GameScr.Class118 });
                        if (GameScr.Class122 == GameScr.Class118 && GameScr.Class123 == GameScr.Class119 && GameScr.Class124 == GameScr.Class120 && GameScr.Class125 == GameScr.Class121) {
                            GameScr.gI();
                            GameScr.startWaitDlgWithoutCancel();
                            GameScr.gI();
                            GameScr.Class12();
                            GameScr.gI();
                            GameScr.Class13();
                            Service.gI().Class16();
                            break;
                        }
                        break Label_4405;
                    }
                    case -121: {
                        System.out.println("GET UPDATE_MAP " + class2.Class4.available() + " bytes");
                        class2.Class4.mark(100000);
                        Class3(class2.Class4);
                        class2.Class4.reset();
                        final byte[] b5 = new byte[class2.Class4.available()];
                        class2.Class4.readFully(b5);
                        TaskOrder.save("map", b5);
                        TaskOrder.save("mapVersion", new byte[] { GameScr.Class119 });
                        if (GameScr.Class122 == GameScr.Class118 && GameScr.Class123 == GameScr.Class119 && GameScr.Class124 == GameScr.Class120 && GameScr.Class125 == GameScr.Class121) {
                            GameScr.gI();
                            GameScr.startWaitDlgWithoutCancel();
                            GameScr.gI();
                            GameScr.Class12();
                            GameScr.gI();
                            GameScr.Class13();
                            Service.gI().Class16();
                            break;
                        }
                        break Label_4405;
                    }
                    case -120: {
                        System.out.println("GET UPDATE_SKILL " + class2.Class4.available() + " bytes");
                        class2.Class4.mark(100000);
                        Class2(class2.Class4);
                        class2.Class4.reset();
                        final byte[] b6 = new byte[class2.Class4.available()];
                        class2.Class4.readFully(b6);
                        if (Char.getMyChar().isHuman) {
                            TaskOrder.save("skill", b6);
                        }
                        else {
                            TaskOrder.save("skillnhanban", b6);
                        }
                        TaskOrder.save("skillVersion", new byte[] { GameScr.Class120 });
                        if (GameScr.Class122 == GameScr.Class118 && GameScr.Class123 == GameScr.Class119 && GameScr.Class124 == GameScr.Class120 && GameScr.Class125 == GameScr.Class121) {
                            GameScr.gI();
                            GameScr.startWaitDlgWithoutCancel();
                            GameScr.gI();
                            GameScr.Class12();
                            GameScr.gI();
                            GameScr.Class13();
                            Service.gI().Class16();
                            break;
                        }
                        break Label_4405;
                    }
                    case -119: {
                        System.out.println("GET UPDATE_ITEM " + class2.Class4.available() + " bytes");
                        class2.Class4.mark(100000);
                        Class1(class2.Class4);
                        class2.Class4.reset();
                        final byte[] b7 = new byte[class2.Class4.available()];
                        class2.Class4.readFully(b7);
                        TaskOrder.save("item", b7);
                        TaskOrder.save("itemVersion", new byte[] { GameScr.Class121 });
                        if (GameScr.Class122 == GameScr.Class118 && GameScr.Class123 == GameScr.Class119 && GameScr.Class124 == GameScr.Class120 && GameScr.Class125 == GameScr.Class121) {
                            GameScr.gI();
                            GameScr.startWaitDlgWithoutCancel();
                            GameScr.gI();
                            GameScr.Class12();
                            GameScr.gI();
                            GameScr.Class13();
                            Service.gI().Class16();
                            break;
                        }
                        break Label_4405;
                    }
                    case -108: {
                        final short short7 = class2.Class4.readShort();
                        try {
                            Mob.arrMobTemplate[short7].Class4 = class2.Class4.readByte();
                        }
                        catch (Exception ex7) {}
                        Mob.arrMobTemplate[short7].Class8 = new Image[class2.Class4.readByte()];
                        if (short7 == 98 || short7 == 99) {
                            Mob.arrMobTemplate[short7].Class8 = new Image[3];
                            final Image class6 = Class1(Game20.Class2(class2));
                            for (int j = 0; j < Mob.arrMobTemplate[short7].Class8.length; ++j) {
                                Mob.arrMobTemplate[short7].Class8[j] = class6;
                            }
                        }
                        else {
                            for (int k = 0; k < Mob.arrMobTemplate[short7].Class8.length; ++k) {
                                Mob.arrMobTemplate[short7].Class8[k] = Class1(Game20.Class2(class2));
                            }
                        }
                        if (class2.Class4.readBoolean()) {
                            final byte byte6 = class2.Class4.readByte();
                            Mob.arrMobTemplate[short7].Class11 = new byte[byte6];
                            for (byte b8 = 0; b8 < byte6; ++b8) {
                                Mob.arrMobTemplate[short7].Class11[b8] = class2.Class4.readByte();
                            }
                            final byte byte7 = class2.Class4.readByte();
                            Mob.arrMobTemplate[short7].Class12 = new byte[byte7][];
                            for (byte b9 = 0; b9 < byte7; ++b9) {
                                Mob.arrMobTemplate[short7].Class12[b9] = new byte[class2.Class4.readByte()];
                                for (int l = 0; l < Mob.arrMobTemplate[short7].Class12[b9].length; ++l) {
                                    Mob.arrMobTemplate[short7].Class12[b9][l] = class2.Class4.readByte();
                                }
                            }
                        }
                        if (class2.Class4.readInt() <= 0) {
                            break Label_4405;
                        }
                        if (short7 < 236) {
                            Class1(class2, short7);
                            break Label_4405;
                        }
                        Class2(class2, short7);
                        break Label_4405;
                    }
                    case -109: {
                        try {
                            GameCanvas.isLoading = true;
                            TileMap.Class6 = null;
                            TileMap.Class7 = null;
                            System.gc();
                            TileMap.Class1 = class2.Class4.readByte();
                            TileMap.Class2 = class2.Class4.readByte();
                            TileMap.Class6 = new char[TileMap.Class1 * TileMap.Class2];
                            for (int n3 = 0; n3 < TileMap.Class6.length; ++n3) {
                                int byte8;
                                if ((byte8 = class2.Class4.readByte()) < 0) {
                                    byte8 += 256;
                                }
                                TileMap.Class6[n3] = (char)byte8;
                            }
                            TileMap.Class7 = new int[TileMap.Class6.length];
                            loadInfoMap(class2 = this.Class2);
                        }
                        catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        class2.Class2();
                        this.Class2.Class2();
                        final Message class7 = null;
                        this.Class2 = class7;
                        class2 = class7;
                    }
                    case -107: {}
                    case -110: {
                        break Label_4405;
                    }
                    case -67: {
                        Mob class8 = null;
                        try {
                            class8 = Mob.Class1(class2.Class4.readUnsignedByte());
                        }
                        catch (Exception ex8) {}
                        if (class8 == null) {
                            break Label_4405;
                        }
                        final int int5;
                        if ((int5 = class2.Class4.readInt()) == Char.getMyChar().charID) {
                            GameScr.Class30.addElement(new Game38(class8.x, class8.y, Char.getMyChar()));
                            break Label_4405;
                        }
                        final Char class9;
                        if ((class9 = GameScr.Class5(int5)) != null) {
                            GameScr.Class30.addElement(new Game38(class8.x, class8.y, class9));
                        }
                        break Label_4405;
                    }
                    case -66: {
                        final int int6 = class2.Class4.readInt();
                        if (Char.getMyChar().charID == int6) {
                            GameScr.Class30.addElement(new Game38(Char.getMyChar().cx, Char.getMyChar().cy));
                            break Label_4405;
                        }
                        final Char class10;
                        if ((class10 = GameScr.Class5(int6)) != null) {
                            GameScr.Class30.addElement(new Game38(class10.cx, class10.cy));
                        }
                        break Label_4405;
                    }
                }
                return;
            }
            catch (Exception ex9) {}
            finally {
                if (class2 != null) {
                    class2.Class2();
                }
            }
        }
        if (class2 != null) {
            class2.Class2();
        }
    }
    
    private static void Class6(final Message message) {
        try {
            switch (message.Class4.readByte()) {
                case -124: {
                    System.out.println("SEND SMS");
                    Game105.Class1(message.Class4.readUTF(), "sms://".concat(String.valueOf(message.Class4.readUTF())), new Command("", GameCanvas.Class1(), 88825, null), new Command("", GameCanvas.Class1(), 88826, null));
                    break;
                }
                case 2: {
                    TaskOrder.Class1();
                    break;
                }
            }
        }
        catch (Exception ex) {}
        finally {
            if (message != null) {
                message.Class2();
            }
        }
        if (message != null) {
            message.Class2();
        }
    }
    
    private static void Class7(final Message message) {
        Label_10064: {
            try {
                Label_10046: {
                    switch (message.Class1().readByte()) {
                        case -126: {
                            Char.getMyChar().Class1(message);
                            Char.getMyChar().Class52[0] = message.Class1().readShort();
                            Char.getMyChar().Class52[1] = message.Class1().readShort();
                            Char.getMyChar().Class52[2] = message.Class1().readInt();
                            Char.getMyChar().Class52[3] = message.Class1().readInt();
                            Char.getMyChar().Class10(61);
                            Char.getMyChar().nClass = GameScr.Class43[message.Class1().readByte()];
                            Char.getMyChar().Class32 = message.Class1().readShort();
                            Char.getMyChar().Class31 = message.Class1().readShort();
                            Char.getMyChar().vSkill.removeAllElements();
                            Char.getMyChar().vSkillFight.removeAllElements();
                            Char.getMyChar().myskill = null;
                            break Label_10064;
                        }
                        case -125: {
                            Char.getMyChar().Class1(message);
                            if (Char.getMyChar().statusMe != 14 && Char.getMyChar().statusMe != 5) {
                                Char.getMyChar().cHP = Char.getMyChar().cMaxHP;
                                Char.getMyChar().cMP = Char.getMyChar().cMaxMP;
                            }
                            try {
                                Char.getMyChar().Class32 = message.Class1().readShort();
                                Char.getMyChar().vSkill.removeAllElements();
                                Char.getMyChar().vSkillFight.removeAllElements();
                                for (byte byte1 = message.Class1().readByte(), b = 0; b < byte1; ++b) {
                                    final Skill class1 = Game30.Class1(message.Class1().readShort());
                                    if (Char.getMyChar().myskill == null) {
                                        Char.getMyChar().myskill = class1;
                                    }
                                    else if (class1.template.equals(Char.getMyChar().myskill.template)) {
                                        Char.getMyChar().myskill = class1;
                                    }
                                    if (Code.T != null && Auto.KCTSA != null && class1.template.id == Auto.KCTSA.template.id) {
                                        Auto.KCTSA = class1;
                                    }
                                    Char.getMyChar().vSkill.addElement(class1);
                                    if ((class1.template.type == 1 || class1.template.type == 4 || class1.template.type == 2 || class1.template.type == 3) && (class1.template.Class3 == 0 || (class1.template.Class3 > 0 && class1.Class3 > 0))) {
                                        final byte id = class1.template.id;
                                        Char.getMyChar();
                                        if (id == 0) {
                                            final Service gi = Service.gI();
                                            Char.getMyChar();
                                            gi.selectSkill(0);
                                        }
                                        Char.getMyChar().vSkillFight.addElement(class1);
                                    }
                                }
                                GameScr.gI();
                                GameScr.Class26();
                                if (GameScr.Class93) {
                                    GameScr.indexRow = -1;
                                    GameScr.gI().Class36();
                                }
                            }
                            catch (Exception ex) {
                                ex.printStackTrace();
                            }
                            break Label_10064;
                        }
                        case -109: {
                            Char.getMyChar().Class1(message);
                            if (Char.getMyChar().statusMe != 14 && Char.getMyChar().statusMe != 5) {
                                Char.getMyChar().cHP = Char.getMyChar().cMaxHP;
                                Char.getMyChar().cMP = Char.getMyChar().cMaxMP;
                            }
                            Char.getMyChar().Class31 = message.Class1().readShort();
                            Char.getMyChar().Class52[0] = message.Class1().readShort();
                            Char.getMyChar().Class52[1] = message.Class1().readShort();
                            Char.getMyChar().Class52[2] = message.Class1().readInt();
                            Char.getMyChar().Class52[3] = message.Class1().readInt();
                            break Label_10064;
                        }
                        case -107: {
                            Char.getMyChar().Class6();
                            break Label_10064;
                        }
                        case -106: {
                            Char.getMyChar().Class7();
                            break Label_10064;
                        }
                        case -105: {
                            final int int1 = message.Class1().readInt();
                            final Char myChar = Char.getMyChar();
                            myChar.xu -= int1;
                            final Char myChar2 = Char.getMyChar();
                            myChar2.Class68 += int1;
                            break Label_10064;
                        }
                        case -104: {
                            final int int2 = message.Class1().readInt();
                            final Char myChar3 = Char.getMyChar();
                            myChar3.Class68 -= int2;
                            final Char myChar4 = Char.getMyChar();
                            myChar4.xu += int2;
                            break Label_10064;
                        }
                        case -102: {
                            Char.getMyChar().arrItemBag[message.Class1().readByte()] = null;
                            final Skill class2 = Game30.Class1(message.Class1().readShort());
                            Char.getMyChar().vSkill.addElement(class2);
                            if ((class2.template.type == 1 || class2.template.type == 4 || class2.template.type == 2 || class2.template.type == 3) && (class2.template.Class3 == 0 || (class2.template.Class3 > 0 && class2.Class3 > 0))) {
                                final byte id2 = class2.template.id;
                                Char.getMyChar();
                                if (id2 == 0) {
                                    final Service gi2 = Service.gI();
                                    Char.getMyChar();
                                    gi2.selectSkill(0);
                                }
                                Char.getMyChar().vSkillFight.addElement(class2);
                            }
                            GameScr.gI();
                            GameScr.Class26();
                            GameScr.gI();
                            GameScr.Class1(class2);
                            GameScr.gI().Class36();
                            InfoMe.Class1(String.valueOf(Game86.Class423) + " " + class2.template.Class2);
                            break Label_10064;
                        }
                        case 115: {
                            System.out.println("UPDATE INFO ME");
                            GameScr.Class97 = Char.getMyChar();
                            Char.getMyChar().Class169 = null;
                            Char.getMyChar().charID = message.Class1().readInt();
                            Char.getMyChar().Class55 = message.Class1().readUTF();
                            if (!Char.getMyChar().Class55.equals("")) {
                                Char.getMyChar().Class56 = message.Class1().readByte();
                            }
                            Char.getMyChar().ctaskId = message.Class1().readByte();
                            Char.getMyChar().cgender = message.Class1().readByte();
                            Char.getMyChar().head = message.Class1().readShort();
                            Char.getMyChar().Class19 = message.Class1().readByte();
                            Char.getMyChar().cName = message.Class1().readUTF();
                            Char.getMyChar().cPk = message.Class1().readByte();
                            Char.getMyChar().cTypePk = message.Class1().readByte();
                            Char.getMyChar().cMaxHP = message.Class1().readInt();
                            Char.getMyChar().cHP = message.Class1().readInt();
                            Char.getMyChar().cMaxMP = message.Class1().readInt();
                            Char.getMyChar().cMP = message.Class1().readInt();
                            Char.getMyChar().cEXP = message.Class1().readLong();
                            Char.getMyChar().Class8 = message.Class1().readLong();
                            GameScr.Class1(Char.getMyChar().cEXP);
                            Char.getMyChar().Class28 = message.Class1().readShort();
                            Char.getMyChar().Class29 = message.Class1().readShort();
                            Char.getMyChar().nClass = GameScr.Class43[message.Class1().readByte()];
                            Char.getMyChar().Class31 = message.Class1().readShort();
                            Char.getMyChar().Class52[0] = message.Class1().readShort();
                            Char.getMyChar().Class52[1] = message.Class1().readShort();
                            Char.getMyChar().Class52[2] = message.Class1().readInt();
                            Char.getMyChar().Class52[3] = message.Class1().readInt();
                            Char.getMyChar().Class32 = message.Class1().readShort();
                            Char.getMyChar().vSkill.removeAllElements();
                            Char.getMyChar().vSkillFight.removeAllElements();
                            for (byte byte2 = message.Class1().readByte(), b2 = 0; b2 < byte2; ++b2) {
                                final Skill class3 = Game30.Class1(message.Class1().readShort());
                                if (Char.getMyChar().myskill == null) {
                                    Char.getMyChar().myskill = class3;
                                }
                                if (Code.T != null && Auto.KCTSA != null && class3.template.id == Auto.KCTSA.template.id) {
                                    Auto.KCTSA = class3;
                                }
                                Char.getMyChar().vSkill.addElement(class3);
                                if ((class3.template.type == 1 || class3.template.type == 4 || class3.template.type == 2 || class3.template.type == 3) && (class3.template.Class3 == 0 || (class3.template.Class3 > 0 && class3.Class3 > 0))) {
                                    final byte id3 = class3.template.id;
                                    Char.getMyChar();
                                    if (id3 == 0) {
                                        final Service gi3 = Service.gI();
                                        Char.getMyChar();
                                        gi3.selectSkill(0);
                                    }
                                    Char.getMyChar().vSkillFight.addElement(class3);
                                }
                            }
                            GameScr.gI();
                            GameScr.Class26();
                            Char.getMyChar().xu = message.Class1().readInt();
                            Char.getMyChar().yen = message.Class1().readInt();
                            Char.getMyChar().luong = message.Class1().readInt();
                            Char.getMyChar().arrItemBag = new Item[message.Class1().readUnsignedByte()];
                            GameScr.Class25 = (GameScr.Class24 = 0);
                            for (int i = 0; i < Char.getMyChar().arrItemBag.length; ++i) {
                                final short short1;
                                if ((short1 = message.Class1().readShort()) != -1) {
                                    Char.getMyChar().arrItemBag[i] = new Item();
                                    Char.getMyChar().arrItemBag[i].typeUI = 3;
                                    Char.getMyChar().arrItemBag[i].indexUI = i;
                                    Char.getMyChar().arrItemBag[i].template = Game104.Class1(short1);
                                    Char.getMyChar().arrItemBag[i].Class7 = message.Class1().readBoolean();
                                    if (Char.getMyChar().arrItemBag[i].Class2() || Char.getMyChar().arrItemBag[i].Class3() || Char.getMyChar().arrItemBag[i].Class4()) {
                                        Char.getMyChar().arrItemBag[i].upgrade = message.Class1().readByte();
                                    }
                                    Char.getMyChar().arrItemBag[i].Class15 = message.Class1().readBoolean();
                                    Char.getMyChar().arrItemBag[i].quantity = message.Class1().readUnsignedShort();
                                    if (Char.getMyChar().arrItemBag[i].template.type == 16) {
                                        GameScr.Class25 += Char.getMyChar().arrItemBag[i].quantity;
                                    }
                                    if (Char.getMyChar().arrItemBag[i].template.type == 17) {
                                        GameScr.Class24 += Char.getMyChar().arrItemBag[i].quantity;
                                    }
                                    if (Char.getMyChar().arrItemBag[i].template.id == 340) {
                                        final GameScr gi4 = GameScr.gI();
                                        gi4.Class83 += Char.getMyChar().arrItemBag[i].quantity;
                                    }
                                }
                            }
                            Char.getMyChar().arrItemBody = new Item[32];
                            try {
                                Char.getMyChar().Class10();
                                for (int j = 0; j < 16; ++j) {
                                    final short short2;
                                    if ((short2 = message.Class1().readShort()) != -1) {
                                        final ItemTemplate class4;
                                        final byte type = (class4 = Game104.Class1(short2)).type;
                                        Char.getMyChar().arrItemBody[type] = new Item();
                                        Char.getMyChar().arrItemBody[type].indexUI = type;
                                        Char.getMyChar().arrItemBody[type].typeUI = 5;
                                        Char.getMyChar().arrItemBody[type].template = class4;
                                        Char.getMyChar().arrItemBody[type].Class7 = true;
                                        Char.getMyChar().arrItemBody[type].upgrade = message.Class1().readByte();
                                        Char.getMyChar().arrItemBody[type].Class8 = message.Class1().readByte();
                                        if (type == 1) {
                                            Char.getMyChar().Class144 = Char.getMyChar().arrItemBody[type].template.Class8;
                                        }
                                        else if (type == 2) {
                                            Char.getMyChar().body = Char.getMyChar().arrItemBody[type].template.Class8;
                                        }
                                        else if (type == 6) {
                                            Char.getMyChar().leg = Char.getMyChar().arrItemBody[type].template.Class8;
                                        }
                                    }
                                }
                            }
                            catch (Exception ex2) {
                                ex2.printStackTrace();
                            }
                            Char.getMyChar().isHuman = message.Class1().readBoolean();
                            Char.getMyChar().Class3 = message.Class1().readBoolean();
                            final short[] array;
                            if ((array = new short[] { message.Class1().readShort(), message.Class1().readShort(), message.Class1().readShort(), message.Class1().readShort() })[0] >= 0) {
                                Char.getMyChar().head = array[0];
                            }
                            if (array[1] >= 0) {
                                Char.getMyChar().Class144 = array[1];
                            }
                            if (array[2] >= 0) {
                                Char.getMyChar().body = array[2];
                            }
                            if (array[3] >= 0) {
                                Char.getMyChar().leg = array[3];
                            }
                            short[] array2 = new short[10];
                            try {
                                for (int k = 0; k < 10; ++k) {
                                    array2[k] = message.Class1().readShort();
                                }
                            }
                            catch (Exception ex7) {
                                array2 = null;
                            }
                            if (array2 != null) {
                                Char.getMyChar().Class1(array2);
                            }
                            GameScr.gI();
                            GameScr.Class26();
                            if (Char.getMyChar().isHuman) {
                                GameScr.gI();
                                GameScr.Class7();
                            }
                            else if (Char.getMyChar().Class3) {
                                GameScr.gI();
                                GameScr.Class8();
                            }
                            Char.getMyChar().statusMe = 4;
                            GameScr.Class87 = (TaskOrder.Class3(String.valueOf(Char.getMyChar().cName) + "vci") > 0);
                            Service.gI().Class7("KSkill");
                            Service.gI().Class7("OSkill");
                            Service.gI().Class7("CSkill");
                            try {
                                for (int l = 0; l < 16; ++l) {
                                    final short short3;
                                    if ((short3 = message.Class1().readShort()) != -1) {
                                        final ItemTemplate class5;
                                        final int indexUI = (class5 = Game104.Class1(short3)).type + 16;
                                        Char.getMyChar().arrItemBody[indexUI] = new Item();
                                        Char.getMyChar().arrItemBody[indexUI].indexUI = indexUI;
                                        Char.getMyChar().arrItemBody[indexUI].typeUI = 5;
                                        Char.getMyChar().arrItemBody[indexUI].template = class5;
                                        Char.getMyChar().arrItemBody[indexUI].Class7 = true;
                                        Char.getMyChar().arrItemBody[indexUI].upgrade = message.Class1().readByte();
                                        Char.getMyChar().arrItemBody[indexUI].Class8 = message.Class1().readByte();
                                        if (indexUI == 1) {
                                            Char.getMyChar().Class144 = Char.getMyChar().arrItemBody[indexUI].template.Class8;
                                        }
                                        else if (indexUI == 2) {
                                            Char.getMyChar().body = Char.getMyChar().arrItemBody[indexUI].template.Class8;
                                        }
                                        else if (indexUI == 6) {
                                            Char.getMyChar().leg = Char.getMyChar().arrItemBody[indexUI].template.Class8;
                                        }
                                    }
                                }
                            }
                            catch (Exception ex3) {
                                ex3.printStackTrace();
                            }
                            break Label_10064;
                        }
                        case -127: {
                            GameScr.vCharInMap.removeAllElements();
                            GameScr.vItemMap.removeAllElements();
                            GameScr.Class30();
                            GameScr.Class97 = Char.getMyChar();
                            Char.getMyChar().charID = message.Class1().readInt();
                            Char.getMyChar().Class55 = message.Class1().readUTF();
                            if (!Char.getMyChar().Class55.equals("")) {
                                Char.getMyChar().Class56 = message.Class1().readByte();
                            }
                            Char.getMyChar().ctaskId = message.Class1().readByte();
                            Char.getMyChar().cgender = message.Class1().readByte();
                            Char.getMyChar().head = message.Class1().readShort();
                            Char.getMyChar().Class19 = message.Class1().readByte();
                            Char.getMyChar().cName = message.Class1().readUTF();
                            Char.getMyChar().cPk = message.Class1().readByte();
                            Char.getMyChar().cTypePk = message.Class1().readByte();
                            Char.getMyChar().cMaxHP = message.Class1().readInt();
                            Char.getMyChar().cHP = message.Class1().readInt();
                            Char.getMyChar().cMaxMP = message.Class1().readInt();
                            Char.getMyChar().cMP = message.Class1().readInt();
                            Char.getMyChar().cEXP = message.Class1().readLong();
                            Char.getMyChar().Class8 = message.Class1().readLong();
                            GameScr.Class1(Char.getMyChar().cEXP);
                            Char.getMyChar().Class28 = message.Class1().readShort();
                            Char.getMyChar().Class29 = message.Class1().readShort();
                            Char.getMyChar().nClass = GameScr.Class43[message.Class1().readByte()];
                            Char.getMyChar().Class31 = message.Class1().readShort();
                            Char.getMyChar().Class52[0] = message.Class1().readShort();
                            Char.getMyChar().Class52[1] = message.Class1().readShort();
                            Char.getMyChar().Class52[2] = message.Class1().readInt();
                            Char.getMyChar().Class52[3] = message.Class1().readInt();
                            Char.getMyChar().Class32 = message.Class1().readShort();
                            Char.getMyChar().vSkill.removeAllElements();
                            Char.getMyChar().vSkillFight.removeAllElements();
                            for (byte byte3 = message.Class1().readByte(), b3 = 0; b3 < byte3; ++b3) {
                                final Skill class6 = Game30.Class1(message.Class1().readShort());
                                if (Char.getMyChar().myskill == null) {
                                    Char.getMyChar().myskill = class6;
                                }
                                if (Code.T != null && Auto.KCTSA != null && class6.template.id == Auto.KCTSA.template.id) {
                                    Auto.KCTSA = class6;
                                }
                                Char.getMyChar().vSkill.addElement(class6);
                                if ((class6.template.type == 1 || class6.template.type == 4 || class6.template.type == 2 || class6.template.type == 3) && (class6.template.Class3 == 0 || (class6.template.Class3 > 0 && class6.Class3 > 0))) {
                                    final byte id4 = class6.template.id;
                                    Char.getMyChar();
                                    if (id4 == 0) {
                                        final Service gi5 = Service.gI();
                                        Char.getMyChar();
                                        gi5.selectSkill(0);
                                    }
                                    Char.getMyChar().vSkillFight.addElement(class6);
                                }
                            }
                            GameScr.gI();
                            GameScr.Class26();
                            Char.getMyChar().xu = message.Class1().readInt();
                            Char.getMyChar().yen = message.Class1().readInt();
                            Char.getMyChar().luong = message.Class1().readInt();
                            Char.getMyChar().arrItemBag = new Item[message.Class1().readUnsignedByte()];
                            GameScr.Class25 = (GameScr.Class24 = 0);
                            for (int indexUI2 = 0; indexUI2 < Char.getMyChar().arrItemBag.length; ++indexUI2) {
                                final short short4;
                                if ((short4 = message.Class1().readShort()) != -1) {
                                    Char.getMyChar().arrItemBag[indexUI2] = new Item();
                                    Char.getMyChar().arrItemBag[indexUI2].typeUI = 3;
                                    Char.getMyChar().arrItemBag[indexUI2].indexUI = indexUI2;
                                    Char.getMyChar().arrItemBag[indexUI2].template = Game104.Class1(short4);
                                    Char.getMyChar().arrItemBag[indexUI2].Class7 = message.Class1().readBoolean();
                                    if (Char.getMyChar().arrItemBag[indexUI2].Class2() || Char.getMyChar().arrItemBag[indexUI2].Class3() || Char.getMyChar().arrItemBag[indexUI2].Class4()) {
                                        Char.getMyChar().arrItemBag[indexUI2].upgrade = message.Class1().readByte();
                                    }
                                    Char.getMyChar().arrItemBag[indexUI2].Class15 = message.Class1().readBoolean();
                                    Char.getMyChar().arrItemBag[indexUI2].quantity = message.Class1().readUnsignedShort();
                                    if (Char.getMyChar().arrItemBag[indexUI2].template.type == 16) {
                                        GameScr.Class25 += Char.getMyChar().arrItemBag[indexUI2].quantity;
                                    }
                                    if (Char.getMyChar().arrItemBag[indexUI2].template.type == 17) {
                                        GameScr.Class24 += Char.getMyChar().arrItemBag[indexUI2].quantity;
                                    }
                                    if (Char.getMyChar().arrItemBag[indexUI2].template.id == 340) {
                                        final GameScr gi6 = GameScr.gI();
                                        gi6.Class83 += Char.getMyChar().arrItemBag[indexUI2].quantity;
                                    }
                                }
                            }
                            Char.getMyChar().arrItemBody = new Item[32];
                            try {
                                Char.getMyChar().Class10();
                                for (int n = 0; n < 16; ++n) {
                                    final short short5;
                                    if ((short5 = message.Class1().readShort()) != -1) {
                                        final ItemTemplate class7;
                                        final byte type2 = (class7 = Game104.Class1(short5)).type;
                                        Char.getMyChar().arrItemBody[type2] = new Item();
                                        Char.getMyChar().arrItemBody[type2].indexUI = type2;
                                        Char.getMyChar().arrItemBody[type2].typeUI = 5;
                                        Char.getMyChar().arrItemBody[type2].template = class7;
                                        Char.getMyChar().arrItemBody[type2].Class7 = true;
                                        Char.getMyChar().arrItemBody[type2].upgrade = message.Class1().readByte();
                                        Char.getMyChar().arrItemBody[type2].Class8 = message.Class1().readByte();
                                        if (type2 == 1) {
                                            Char.getMyChar().Class144 = Char.getMyChar().arrItemBody[type2].template.Class8;
                                        }
                                        else if (type2 == 2) {
                                            Char.getMyChar().body = Char.getMyChar().arrItemBody[type2].template.Class8;
                                        }
                                        else if (type2 == 6) {
                                            Char.getMyChar().leg = Char.getMyChar().arrItemBody[type2].template.Class8;
                                        }
                                    }
                                }
                            }
                            catch (Exception ex4) {
                                ex4.printStackTrace();
                            }
                            Char.getMyChar().isHuman = message.Class1().readBoolean();
                            Char.getMyChar().Class3 = message.Class1().readBoolean();
                            final short[] array3;
                            if ((array3 = new short[] { message.Class1().readShort(), message.Class1().readShort(), message.Class1().readShort(), message.Class1().readShort() })[0] >= 0) {
                                Char.getMyChar().head = array3[0];
                            }
                            if (array3[1] >= 0) {
                                Char.getMyChar().Class144 = array3[1];
                            }
                            if (array3[2] >= 0) {
                                Char.getMyChar().body = array3[2];
                            }
                            if (array3[3] >= 0) {
                                Char.getMyChar().leg = array3[3];
                            }
                            short[] array4 = new short[10];
                            try {
                                for (int n2 = 0; n2 < 10; ++n2) {
                                    array4[n2] = message.Class1().readShort();
                                }
                            }
                            catch (Exception ex8) {
                                array4 = null;
                            }
                            if (array4 != null) {
                                Char.getMyChar().Class1(array4);
                            }
                            try {
                                for (int n3 = 0; n3 < 16; ++n3) {
                                    final short short6;
                                    if ((short6 = message.Class1().readShort()) != -1) {
                                        final ItemTemplate class8;
                                        final int indexUI3 = (class8 = Game104.Class1(short6)).type + 16;
                                        Char.getMyChar().arrItemBody[indexUI3] = new Item();
                                        Char.getMyChar().arrItemBody[indexUI3].indexUI = indexUI3;
                                        Char.getMyChar().arrItemBody[indexUI3].typeUI = 5;
                                        Char.getMyChar().arrItemBody[indexUI3].template = class8;
                                        Char.getMyChar().arrItemBody[indexUI3].Class7 = true;
                                        Char.getMyChar().arrItemBody[indexUI3].upgrade = message.Class1().readByte();
                                        Char.getMyChar().arrItemBody[indexUI3].Class8 = message.Class1().readByte();
                                        if (indexUI3 == 1) {
                                            Char.getMyChar().Class144 = Char.getMyChar().arrItemBody[indexUI3].template.Class8;
                                        }
                                        else if (indexUI3 == 2) {
                                            Char.getMyChar().body = Char.getMyChar().arrItemBody[indexUI3].template.Class8;
                                        }
                                        else if (indexUI3 == 6) {
                                            Char.getMyChar().leg = Char.getMyChar().arrItemBody[indexUI3].template.Class8;
                                        }
                                    }
                                }
                            }
                            catch (Exception ex5) {
                                ex5.printStackTrace();
                            }
                            if (Char.getMyChar().isHuman) {
                                GameScr.gI();
                                GameScr.Class7();
                            }
                            else if (Char.getMyChar().Class3) {
                                GameScr.gI();
                                GameScr.Class8();
                            }
                            Char.getMyChar().statusMe = 4;
                            GameScr.Class87 = (TaskOrder.Class3(String.valueOf(Char.getMyChar().cName) + "vci") > 0);
                            if (Char.getMyChar().zisHuman()) {
                                Class2(new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("skill"))));
                            }
                            else {
                                Class2(new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("skillnhanban"))));
                            }
                            Service.gI().Class7("KSkill");
                            Service.gI().Class7("OSkill");
                            Service.gI().Class7("CSkill");
                            break Label_10064;
                        }
                        case -124: {
                            Char.getMyChar().Class1(message);
                            GameScr.Class1(Char.getMyChar().cEXP = message.Class1().readLong());
                            Char.getMyChar().Class32 = message.Class1().readShort();
                            Char.getMyChar().Class31 = message.Class1().readShort();
                            Char.getMyChar().Class52[0] = message.Class1().readShort();
                            Char.getMyChar().Class52[1] = message.Class1().readShort();
                            Char.getMyChar().Class52[2] = message.Class1().readInt();
                            Char.getMyChar().Class52[3] = message.Class1().readInt();
                            break Label_10064;
                        }
                        case -123: {
                            Char.getMyChar().xu = message.Class1().readInt();
                            Char.getMyChar().yen = message.Class1().readInt();
                            Char.getMyChar().luong = message.Class1().readInt();
                            Char.getMyChar().cHP = message.Class1().readInt();
                            Char.getMyChar().cMP = message.Class1().readInt();
                            if (message.Class1().readByte() == 1) {
                                GameScr.gI().Class39();
                                Char.getMyChar().Class4 = true;
                                break Label_10064;
                            }
                            Char.getMyChar().Class4 = false;
                            break Label_10064;
                        }
                        case -122: {
                            Char.getMyChar().cHP = message.Class1().readInt();
                            break Label_10064;
                        }
                        case -121: {
                            Char.getMyChar().cMP = message.Class1().readInt();
                            break Label_10064;
                        }
                        case -120: {
                            final Char class9;
                            if ((class9 = GameScr.Class5(message.Class1().readInt())) != null) {
                                Class1(class9, message);
                            }
                            break Label_10064;
                        }
                        case -119: {
                            final Char class10;
                            if ((class10 = GameScr.Class5(message.Class1().readInt())) == null) {
                                break;
                            }
                            class10.cHP = message.Class1().readInt();
                            class10.cMaxHP = message.Class1().readInt();
                            break Label_10064;
                        }
                        case Byte.MIN_VALUE: {
                            final Char class11;
                            if ((class11 = GameScr.Class5(message.Class1().readInt())) != null) {
                                class11.cHP = message.Class1().readInt();
                                class11.cMaxHP = message.Class1().readInt();
                                class11.Class22 = message.Class1().readUnsignedByte();
                                break Label_10064;
                            }
                            break;
                        }
                        case -117: {
                            final Char class12;
                            if ((class12 = GameScr.Class5(message.Class1().readInt())) == null) {
                                break;
                            }
                            class12.cHP = message.Class1().readInt();
                            class12.cMaxHP = message.Class1().readInt();
                            class12.Class28 = message.Class1().readShort();
                            class12.Class29 = message.Class1().readShort();
                            class12.Class144 = message.Class1().readShort();
                            if (class12.Class144 == -1) {
                                class12.Class11();
                            }
                            break Label_10064;
                        }
                        case -116: {
                            final Char class13;
                            if ((class13 = GameScr.Class5(message.Class1().readInt())) == null) {
                                break;
                            }
                            class13.cHP = message.Class1().readInt();
                            class13.cMaxHP = message.Class1().readInt();
                            class13.Class28 = message.Class1().readShort();
                            class13.Class29 = message.Class1().readShort();
                            class13.body = message.Class1().readShort();
                            if (class13.body == -1) {
                                class13.Class12();
                            }
                            break Label_10064;
                        }
                        case -113: {
                            final Char class14;
                            if ((class14 = GameScr.Class5(message.Class1().readInt())) == null) {
                                break;
                            }
                            class14.cHP = message.Class1().readInt();
                            class14.cMaxHP = message.Class1().readInt();
                            class14.Class28 = message.Class1().readShort();
                            class14.Class29 = message.Class1().readShort();
                            class14.leg = message.Class1().readShort();
                            if (class14.leg == -1) {
                                class14.Class13();
                            }
                            break Label_10064;
                        }
                        case -64: {
                            final Char class15;
                            if ((class15 = GameScr.Class5(message.Class1().readInt())) != null) {
                                class15.cHP = message.Class1().readInt();
                                class15.cMaxHP = message.Class1().readInt();
                                class15.Class28 = message.Class1().readShort();
                                class15.Class29 = message.Class1().readShort();
                                class15.head = message.Class1().readShort();
                                break Label_10064;
                            }
                            break;
                        }
                        case -63: {
                            final Integer n4;
                            final Char class16;
                            if ((class16 = GameScr.Class5(n4 = new Integer(message.Class1().readInt()))) != null) {
                                GameCanvas.Class1(String.valueOf(class16.cName) + " " + Game86.Class1(Game86.Class333, message.Class1().readUTF()), 88830, n4, 88811, null);
                            }
                            break Label_10064;
                        }
                        case -61: {
                            final Integer n5;
                            final Char class17;
                            if (GameScr.Class87 && (class17 = GameScr.Class5(n5 = new Integer(message.Class1().readInt()))) != null) {
                                GameCanvas.Class1(String.valueOf(class17.cName) + " " + Game86.Class334, 88831, n5, 88811, null);
                            }
                            break Label_10064;
                        }
                        case -62: {
                            final int int3 = message.Class1().readInt();
                            if (Char.getMyChar().charID == int3) {
                                Char.getMyChar().Class55 = message.Class1().readUTF();
                                Char.getMyChar().Class56 = message.Class1().readByte();
                                Char.getMyChar().Class10(21);
                                break Label_10064;
                            }
                            final Char class18;
                            (class18 = GameScr.Class5(int3)).Class55 = message.Class1().readUTF();
                            class18.Class56 = message.Class1().readByte();
                            break Label_10064;
                        }
                        case -112: {
                            final Char class19;
                            if ((class19 = GameScr.Class5(message.Class1().readInt())) != null) {
                                class19.cHP = message.Class1().readInt();
                                class19.cMaxHP = message.Class1().readInt();
                                class19.Class28 = message.Class1().readShort();
                                class19.Class29 = message.Class1().readShort();
                                break Label_10064;
                            }
                            break;
                        }
                        case -111: {
                            final Char class20;
                            if ((class20 = GameScr.Class5(message.Class1().readInt())) != null) {
                                class20.cHP = message.Class1().readInt();
                                break Label_10064;
                            }
                            break;
                        }
                        case -110: {
                            final Char class21;
                            if ((class21 = GameScr.Class5(message.Class1().readInt())) != null) {
                                class21.cHP = message.Class1().readInt();
                                class21.cMaxHP = message.Class1().readInt();
                                final Char char1 = class21;
                                final short short7 = message.Class1().readShort();
                                char1.Class130 = short7;
                                char1.cx = short7;
                                final Char char2 = class21;
                                final short short8 = message.Class1().readShort();
                                char2.Class131 = short8;
                                char2.cy = short8;
                                class21.statusMe = 1;
                                Game16.Class1(20, class21, 2);
                                break Label_10064;
                            }
                            break;
                        }
                        case -101: {
                            final Effect effect = new Effect(message.Class1().readByte(), (int)(System.currentTimeMillis() / 1000L) - message.Class1().readInt(), message.Class1().readInt(), message.Class1().readShort());
                            Char.getMyChar().vEff.addElement(effect);
                            if (effect.template.type == 7) {
                                final Char myChar5 = Char.getMyChar();
                                myChar5.Class85 += effect.Class4;
                                break Label_10064;
                            }
                            if (effect.template.type == 12 || effect.template.type == 11) {
                                Char.getMyChar().Class108 = true;
                                Game16.Class1(60, Char.getMyChar().cx, Char.getMyChar().cy, 1);
                                break Label_10064;
                            }
                            if (effect.template.type == 14) {
                                GameCanvas.Class7();
                                GameCanvas.Class8();
                                Char.getMyChar().cx = message.Class1().readShort();
                                Char.getMyChar().cy = message.Class1().readShort();
                                Char.getMyChar().statusMe = 1;
                                Char.getMyChar().Class135 = true;
                                Game16.Class2(76, Char.getMyChar(), effect.timeLenght);
                                break Label_10064;
                            }
                            if (effect.template.type == 1) {
                                Game16.Class2(48, Char.getMyChar(), effect.timeLenght);
                                break Label_10064;
                            }
                            if (effect.template.type == 2) {
                                GameCanvas.Class7();
                                GameCanvas.Class8();
                                Char.getMyChar().cx = message.Class1().readShort();
                                Char.getMyChar().cy = message.Class1().readShort();
                                Char.getMyChar().statusMe = 1;
                                Char.getMyChar().Class135 = true;
                                Char.getMyChar().Class136 = true;
                                break Label_10064;
                            }
                            if (effect.template.type == 3) {
                                GameCanvas.Class7();
                                GameCanvas.Class8();
                                Char.getMyChar().cx = message.Class1().readShort();
                                Char.getMyChar().cy = message.Class1().readShort();
                                Char.getMyChar().statusMe = 1;
                                Char.Class134 = true;
                                Game16.Class2(43, Char.getMyChar(), effect.timeLenght);
                            }
                            break Label_10064;
                        }
                        case -98: {
                            try {
                                final Char class22;
                                if ((class22 = GameScr.Class5(message.Class1().readInt())) == null) {
                                    break;
                                }
                                final Effect effect2 = new Effect(message.Class1().readByte(), (int)(System.currentTimeMillis() / 1000L) - message.Class1().readInt(), message.Class1().readInt(), message.Class1().readShort());
                                class22.vEff.addElement(effect2);
                                if (effect2.template.type == 12 || effect2.template.type == 11) {
                                    class22.Class108 = true;
                                    Game16.Class1(60, class22.cx, class22.cy, 1);
                                }
                                else if (effect2.template.type == 14) {
                                    final Char char3 = class22;
                                    final short short9 = message.Class1().readShort();
                                    char3.Class130 = short9;
                                    char3.cx = short9;
                                    final Char char4 = class22;
                                    final short short10 = message.Class1().readShort();
                                    char4.Class131 = short10;
                                    char4.cy = short10;
                                    class22.statusMe = 1;
                                    Game16.Class2(76, class22, effect2.timeLenght);
                                }
                                else if (effect2.template.type == 1) {
                                    Game16.Class2(48, class22, effect2.timeLenght);
                                }
                                else if (effect2.template.type == 2) {
                                    final Char char5 = class22;
                                    final short short11 = message.Class1().readShort();
                                    char5.Class130 = short11;
                                    char5.cx = short11;
                                    final Char char6 = class22;
                                    final short short12 = message.Class1().readShort();
                                    char6.Class131 = short12;
                                    char6.cy = short12;
                                    class22.statusMe = 1;
                                    class22.Class136 = true;
                                }
                                else if (effect2.template.type == 3) {
                                    final Char char7 = class22;
                                    final short short13 = message.Class1().readShort();
                                    char7.Class130 = short13;
                                    char7.cx = short13;
                                    final Char char8 = class22;
                                    final short short14 = message.Class1().readShort();
                                    char8.Class131 = short14;
                                    char8.cy = short14;
                                    class22.statusMe = 1;
                                    Game16.Class2(43, class22, effect2.timeLenght);
                                }
                            }
                            catch (Exception ex9) {}
                            break Label_10064;
                        }
                        case -100: {
                            final EffectTemplate template = Effect.Class1[message.Class1().readByte()];
                            int n6 = 0;
                            while (n6 < Char.getMyChar().vEff.size()) {
                                final Effect effect3;
                                if ((effect3 = (Effect)Char.getMyChar().vEff.elementAt(n6)).template.type == template.type) {
                                    if (effect3.template.type == 7) {
                                        final Char myChar6 = Char.getMyChar();
                                        myChar6.Class85 -= effect3.Class4;
                                    }
                                    effect3.template = template;
                                    effect3.timeStart = (int)(System.currentTimeMillis() / 1000L) - message.Class1().readInt();
                                    effect3.timeLenght = message.Class1().readInt() / 1000;
                                    effect3.Class4 = message.Class1().readShort();
                                    if (effect3.template.type == 7) {
                                        final Char myChar7 = Char.getMyChar();
                                        myChar7.Class85 += effect3.Class4;
                                        break;
                                    }
                                    break;
                                }
                                else {
                                    ++n6;
                                }
                            }
                            if (!GameScr.Class93) {
                                GameScr.gI().Class22();
                            }
                            break Label_10064;
                        }
                        case -97: {
                            try {
                                final Char class23;
                                if ((class23 = GameScr.Class5(message.Class1().readInt())) == null) {
                                    break;
                                }
                                final EffectTemplate template2 = Effect.Class1[message.Class1().readByte()];
                                for (int n7 = 0; n7 < class23.vEff.size(); ++n7) {
                                    final Effect effect4 = (Effect)class23.vEff.elementAt(n7);
                                    if (template2.type == template2.type) {
                                        effect4.template = template2;
                                        effect4.timeStart = (int)(System.currentTimeMillis() / 1000L) - message.Class1().readInt();
                                        effect4.timeLenght = message.Class1().readInt() / 1000;
                                        effect4.Class4 = message.Class1().readShort();
                                        break;
                                    }
                                }
                            }
                            catch (Exception ex10) {}
                            break Label_10064;
                        }
                        case -99: {
                            final byte byte4 = message.Class1().readByte();
                            Effect effect5 = null;
                            for (int n8 = 0; n8 < Char.getMyChar().vEff.size(); ++n8) {
                                if ((effect5 = (Effect)Char.getMyChar().vEff.elementAt(n8)).template.id == byte4) {
                                    if (effect5.template.type == 7) {
                                        final Char myChar8 = Char.getMyChar();
                                        myChar8.Class85 -= effect5.Class4;
                                    }
                                    Char.getMyChar().vEff.removeElementAt(n8);
                                    break;
                                }
                            }
                            if (effect5.template.type == 0 || effect5.template.type == 12) {
                                Char.getMyChar().cHP = message.Class1().readInt();
                                Char.getMyChar().cMP = message.Class1().readInt();
                                if (effect5.template.type == 0) {
                                    InfoMe.Class1(Game86.Class362);
                                    break Label_10064;
                                }
                                if (effect5.template.type == 12) {
                                    Char.getMyChar().Class108 = false;
                                    Game16.Class1(60, Char.getMyChar().cx, Char.getMyChar().cy, 1);
                                }
                                break Label_10064;
                            }
                            else {
                                if (effect5.template.type == 4 || effect5.template.type == 13 || effect5.template.type == 17) {
                                    Char.getMyChar().cHP = message.Class1().readInt();
                                    break Label_10064;
                                }
                                if (effect5.template.type == 23) {
                                    Char.getMyChar().cHP = message.Class1().readInt();
                                    Char.getMyChar().cMaxHP = message.Class1().readInt();
                                    break Label_10064;
                                }
                                if (effect5.template.type == 11) {
                                    Char.getMyChar().Class108 = false;
                                    Game16.Class1(60, Char.getMyChar().cx, Char.getMyChar().cy, 1);
                                    break Label_10064;
                                }
                                if (effect5.template.type == 14) {
                                    Char.getMyChar().Class135 = false;
                                    break Label_10064;
                                }
                                if (effect5.template.type == 2) {
                                    Char.getMyChar().Class135 = false;
                                    Char.getMyChar().Class136 = false;
                                    Game16.Class1(77, Char.getMyChar().cx, Char.getMyChar().cy - 9, 1);
                                    break Label_10064;
                                }
                                if (effect5.template.type == 3) {
                                    Char.Class134 = false;
                                }
                                break Label_10064;
                            }
                            break;
                        }
                        case -96: {
                            final Char class24;
                            if ((class24 = GameScr.Class5(message.Class1().readInt())) == null) {
                                break;
                            }
                            final byte byte5 = message.Class1().readByte();
                            Effect effect6 = null;
                            for (int n9 = 0; n9 < class24.vEff.size(); ++n9) {
                                if ((effect6 = (Effect)class24.vEff.elementAt(n9)).template.id == byte5) {
                                    class24.vEff.removeElementAt(n9);
                                    break;
                                }
                            }
                            if (effect6 == null) {
                                break Label_10064;
                            }
                            if (effect6.template.type == 0) {
                                class24.cHP = message.Class1().readInt();
                                class24.cMP = message.Class1().readInt();
                                break Label_10064;
                            }
                            if (effect6.template.type == 11) {
                                final Char char9 = class24;
                                final int unsignedShort = message.Class1().readUnsignedShort();
                                char9.Class130 = unsignedShort;
                                char9.cx = unsignedShort;
                                final Char char10 = class24;
                                final int unsignedShort2 = message.Class1().readUnsignedShort();
                                char10.Class131 = unsignedShort2;
                                char10.cy = unsignedShort2;
                                class24.Class108 = false;
                                Game16.Class1(60, class24.cx, class24.cy, 1);
                                break Label_10064;
                            }
                            if (effect6.template.type == 12) {
                                class24.cHP = message.Class1().readInt();
                                class24.cMP = message.Class1().readInt();
                                class24.Class108 = false;
                                Game16.Class1(60, class24.cx, class24.cy, 1);
                                break Label_10064;
                            }
                            if (effect6.template.type == 4 || effect6.template.type == 13 || effect6.template.type == 17) {
                                class24.cHP = message.Class1().readInt();
                                break Label_10064;
                            }
                            if (effect6.template.type == 23) {
                                Char.getMyChar().cHP = message.Class1().readInt();
                                Char.getMyChar().cMaxHP = message.Class1().readInt();
                                break Label_10064;
                            }
                            if (effect6.template.type == 2) {
                                class24.Class136 = false;
                                Game16.Class1(77, class24.cx, class24.cy - 9, 1);
                            }
                            break Label_10064;
                        }
                        case -95: {
                            GameScr.gI().Class134 = message.Class1().readInt();
                            GameScr.gI().Class135 = (int)(System.currentTimeMillis() / 1000L);
                            break Label_10064;
                        }
                        case -94: {
                            final Npc npc;
                            (npc = (Npc)GameScr.vNpc.elementAt(message.Class1().readByte())).statusMe = message.Class1().readByte();
                            if (npc.template.npcTemplateId == 31 && npc.statusMe == 15) {
                                GameScr.Class1(npc.cx, npc.cy);
                            }
                            break Label_10064;
                        }
                        case -92: {
                            final int int4;
                            Char char11;
                            if ((int4 = message.Class1().readInt()) == Char.getMyChar().charID) {
                                char11 = Char.getMyChar();
                            }
                            else {
                                char11 = GameScr.Class5(int4);
                            }
                            if (char11 == null) {
                                break Label_10064;
                            }
                            char11.cTypePk = message.Class1().readByte();
                            Auto.KiemTraPk(char11);
                            if (char11 != Char.getMyChar()) {
                                break Label_10064;
                            }
                            if (char11.cTypePk == 4) {
                                GameScr.cj = true;
                                break Label_10064;
                            }
                            if (char11.cTypePk == 5) {
                                GameScr.cj = false;
                            }
                            break Label_10064;
                        }
                        case -59: {
                            final int int5;
                            Char char12;
                            if ((int5 = message.Class1().readInt()) == Char.getMyChar().charID) {
                                char12 = Char.getMyChar();
                            }
                            else {
                                char12 = GameScr.Class5(int5);
                            }
                            char12.cHP = message.Class1().readInt();
                            char12.cMaxHP = message.Class1().readInt();
                            break Label_10064;
                        }
                        case -58: {
                            GameScr.gI().Class22();
                            GameCanvas.Class40 = 70;
                            GameCanvas.Class4 = true;
                            Game16.Class1(119, GameScr.Class11 + GameScr.Class16, GameScr.Class13 + GameScr.Class17, 1);
                            break Label_10064;
                        }
                        case -57: {
                            GameCanvas.Class40 = 40;
                            GameCanvas.Class4 = true;
                            break Label_10064;
                        }
                        case -56: {
                            final Char class25;
                            if ((class25 = GameScr.Class5(message.Class1().readInt())) != null) {
                                class25.cHP = message.Class1().readInt();
                                class25.cMaxHP = message.Class1().readInt();
                                class25.Class145 = (short)message.Class1().readUnsignedShort();
                            }
                            break Label_10064;
                        }
                        case -55: {
                            final Char class26;
                            if ((class26 = GameScr.Class5(message.Class1().readInt())) != null) {
                                class26.cHP = message.Class1().readInt();
                                class26.cMaxHP = message.Class1().readInt();
                                class26.Class146 = (short)message.Class1().readUnsignedShort();
                            }
                            break Label_10064;
                        }
                        case -54: {
                            final int int6 = message.Class1().readInt();
                            Char char13;
                            if (Char.getMyChar().charID == int6) {
                                char13 = Char.getMyChar();
                            }
                            else {
                                char13 = GameScr.Class5(int6);
                            }
                            if (char13 != null) {
                                char13.Class80 = new Item[5];
                                final Char char14 = char13;
                                final Char char15 = char13;
                                final boolean b4 = false;
                                char15.Class65 = b4;
                                char15.Class63 = b4;
                                char14.Class64 = b4;
                                char14.Class66 = b4;
                                for (int indexUI4 = 0; indexUI4 < char13.Class80.length; ++indexUI4) {
                                    final short short15;
                                    if ((short15 = message.Class1().readShort()) != -1) {
                                        char13.Class80[indexUI4] = new Item();
                                        char13.Class80[indexUI4].typeUI = 41;
                                        char13.Class80[indexUI4].indexUI = indexUI4;
                                        char13.Class80[indexUI4].template = Game104.Class1(short15);
                                        char13.Class80[indexUI4].upgrade = message.Class1().readByte();
                                        char13.Class80[indexUI4].Class6 = message.Class1().readLong();
                                        char13.Class80[indexUI4].Class8 = message.Class1().readByte();
                                        char13.Class80[indexUI4].Class7 = true;
                                        if (indexUI4 == 4) {
                                            if (char13.Class80[indexUI4].template.id == 485 || char13.Class80[indexUI4].template.id == 524) {
                                                char13.Class63 = true;
                                            }
                                            else if (char13.Class80[indexUI4].template.id == 443 || char13.Class80[indexUI4].template.id == 523) {
                                                char13.Class64 = true;
                                            }
                                            else {
                                                char13.Class66 = true;
                                                char13.Class29();
                                            }
                                        }
                                        final byte byte6 = message.Class1().readByte();
                                        char13.Class80[indexUI4].options = new MyVector();
                                        for (byte b5 = 0; b5 < byte6; ++b5) {
                                            char13.Class80[indexUI4].options.addElement(new ItemOption(message.Class1().readUnsignedByte(), message.Class1().readInt()));
                                        }
                                    }
                                }
                            }
                            break Label_10064;
                        }
                        case -78: {
                            Game16.Class1(message.Class1().readShort(), Char.getMyChar().cx, Char.getMyChar().cy, 1);
                            break Label_10064;
                        }
                        case -73: {
                            final Mob class27 = Mob.Class1(message.Class1().readUnsignedByte());
                            Game16.Class1(67, class27.x, class27.y, 1);
                            break Label_10064;
                        }
                        case -72: {
                            Char.getMyChar().luong = message.Class1().readInt();
                            break Label_10064;
                        }
                        case -71: {
                            final int int7 = message.Class1().readInt();
                            final Char myChar9 = Char.getMyChar();
                            myChar9.luong += int7;
                            GameScr.Class1("+".concat(String.valueOf(int7)), Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().Class59 - 10, 6);
                            InfoMe.addInfo(String.valueOf(Game86.Class299) + " " + int7 + " " + Game86.Class222, 20, mFont.Class12);
                            break Label_10064;
                        }
                        case -68: {
                            final Char class28;
                            if ((class28 = GameScr.Class5(message.Class1().readInt())) == null) {
                                break;
                            }
                            final short short16 = message.Class1().readShort();
                            final byte byte7 = message.Class1().readByte();
                            if (short16 > 0) {
                                class28.Class94 = new Mob((short)(-1), false, false, false, false, false, short16, 1, 0, 0, 0, (short)class28.cx, (short)(class28.cy - 40), (byte)4, (byte)0, byte7 != 0, false);
                                class28.Class94.status = 5;
                                break Label_10064;
                            }
                            class28.Class94 = null;
                            break Label_10064;
                        }
                        case -65: {
                            final String utf = message.Class1().readUTF();
                            byte[] b6 = new byte[message.Class1().readInt()];
                            message.Class1().read(b6);
                            if (b6.length == 0) {
                                b6 = null;
                            }
                            try {
                                message.Class1().readByte();
                            }
                            catch (Exception ex6) {
                                ex6.printStackTrace();
                            }
                            if (utf.equals("KSkill")) {
                                GameScr.gI();
                                GameScr.Class2(b6);
                                break Label_10064;
                            }
                            if (utf.equals("OSkill")) {
                                GameScr.gI();
                                GameScr.Class1(b6);
                                break Label_10064;
                            }
                            if (utf.equals("CSkill")) {
                                GameScr.gI();
                                GameScr.Class3(b6);
                            }
                            break Label_10064;
                        }
                        case -69: {
                            final short short17 = message.Class1().readShort();
                            final byte byte8 = message.Class1().readByte();
                            if (short17 > 0) {
                                Char.getMyChar().Class94 = new Mob((short)(-1), false, false, false, false, false, short17, 1, 0, 0, 0, (short)Char.getMyChar().cx, (short)(Char.getMyChar().cy - 40), (byte)4, (byte)0, byte8 != 0, false);
                                Char.getMyChar().Class94.status = 5;
                                break Label_10064;
                            }
                            Char.getMyChar().Class94 = null;
                            break Label_10064;
                        }
                        case -77: {
                            try {
                                GameScr.Class33.removeAllElements();
                                while (true) {
                                    GameScr.Class33.addElement(new Party(message.Class1().readByte(), message.Class1().readUnsignedByte(), message.Class1().readUTF(), message.Class1().readByte()));
                                }
                            }
                            catch (Exception ex11) {
                                GameScr.gI().Class19();
                                break Label_10064;
                            }
                        }
                        case -76: {
                            GameScr.vParty.firstElement().Class5 = message.Class1().readBoolean();
                            break Label_10064;
                        }
                        case -75: {
                            Char.getMyChar().Class78[message.Class1().readByte()] = null;
                            break Label_10064;
                        }
                        case -74: {
                            InfoDlg.Class1(message.Class1().readUTF());
                            break Label_10064;
                        }
                        case -80: {
                            Char.getMyChar().arrItemBody[message.Class1().readByte()] = null;
                            break Label_10064;
                        }
                        case -91: {
                            final Item[] arrItemBag = new Item[message.Class1().readUnsignedByte()];
                            for (int n10 = 0; n10 < Char.getMyChar().arrItemBag.length; ++n10) {
                                arrItemBag[n10] = Char.getMyChar().arrItemBag[n10];
                            }
                            (Char.getMyChar().arrItemBag = arrItemBag)[message.Class1().readUnsignedByte()] = null;
                            InfoMe.Class1(String.valueOf(Game86.Class138) + " " + Char.getMyChar().arrItemBag.length + " " + Game86.Class158);
                            break Label_10064;
                        }
                        case -90: {
                            for (int n11 = 0; n11 < GameScr.vNpc.size(); ++n11) {
                                final Npc npc2;
                                if ((npc2 = (Npc)GameScr.vNpc.elementAt(n11)).statusMe == 15) {
                                    npc2.statusMe = 1;
                                    break;
                                }
                            }
                            final byte byte9;
                            if ((byte9 = message.Class1().readByte()) == 1) {
                                InfoMe.addInfo(Game86.Class139, 20, mFont.Class12);
                                break Label_10064;
                            }
                            if (byte9 == 2) {
                                InfoMe.addInfo(Game86.Class140, 20, mFont.Class12);
                            }
                            break Label_10064;
                        }
                        case -89: {
                            GameCanvas.isLoading = false;
                            try {
                                InfoMe.addInfo(message.Class1().readUTF(), 20, mFont.Class12);
                            }
                            catch (Exception ex12) {}
                            InfoDlg.hide();
                            GameCanvas.endDlg();
                            break Label_10064;
                        }
                        case -87: {
                            final byte byte10 = message.Class1().readByte();
                            final Party obj = (Party)GameScr.vParty.elementAt(byte10);
                            final MyVector vParty = GameScr.vParty;
                            vParty.setElementAt(vParty.elementAt(0), byte10);
                            GameScr.vParty.setElementAt(obj, 0);
                            GameScr.gI().Class20();
                            InfoMe.addInfo(String.valueOf(obj.name) + Game86.Class389, 20, mFont.Class12);
                            break Label_10064;
                        }
                        case -86: {
                            GameScr.vParty.removeAllElements();
                            GameScr.gI().Class20();
                            InfoMe.addInfo(Game86.Class390, 20, mFont.Class12);
                            break Label_10064;
                        }
                        case -85: {
                            GameScr.Class34.removeAllElements();
                            try {
                                while (true) {
                                    GameScr.Class34.addElement(new Game80(message.Class1().readUTF(), message.Class1().readByte()));
                                }
                            }
                            catch (Exception ex13) {
                                for (int n12 = 0; n12 < GameScr.Class36.size(); ++n12) {
                                    GameScr.Class34.addElement(GameScr.Class36.elementAt(n12));
                                }
                                GameScr.gI();
                                GameScr.Class3(0);
                                break Label_10064;
                            }
                        }
                        case -84: {
                            GameScr.Class37.removeAllElements();
                            try {
                                while (true) {
                                    GameScr.Class37.addElement(new Game80(message.Class1().readUTF(), message.Class1().readByte()));
                                }
                            }
                            catch (Exception ex14) {
                                GameScr.gI();
                                GameScr.Class3(1);
                                break Label_10064;
                            }
                        }
                        case -83: {
                            final String utf2 = message.Class1().readUTF();
                            for (int n13 = 0; n13 < GameScr.Class34.size(); ++n13) {
                                if (((Game80)GameScr.Class34.elementAt(n13)).Class1.equals(utf2)) {
                                    GameScr.indexRow = 0;
                                    GameScr.Class34.removeElementAt(n13);
                                    GameScr.gI();
                                    GameScr.setText(utf2);
                                    break;
                                }
                            }
                            if (GameScr.Class91) {
                                GameScr.gI();
                                GameScr.Class3(0);
                                GameScr.indexRow = 0;
                                GameScr.Class50.Class1();
                            }
                            break Label_10064;
                        }
                        case -82: {
                            final String utf3 = message.Class1().readUTF();
                            for (int n14 = 0; n14 < GameScr.Class37.size(); ++n14) {
                                if (((Game80)GameScr.Class37.elementAt(n14)).Class1.equals(utf3)) {
                                    GameScr.indexRow = 0;
                                    GameScr.Class37.removeElementAt(n14);
                                    break;
                                }
                            }
                            GameScr.gI();
                            GameScr.Class3(1);
                            break Label_10064;
                        }
                        case -81: {
                            Char.getMyChar().cPk = message.Class1().readByte();
                            Char.getMyChar().charFocus = null;
                            break Label_10046;
                        }
                    }
                    return;
                }
            }
            catch (Exception ex15) {}
            finally {
                if (message != null) {
                    message.Class2();
                }
            }
        }
        if (message != null) {
            message.Class2();
        }
    }
    
    private static boolean Class1(final Char c, final Message message) {
        try {
            c.Class55 = message.Class4.readUTF();
            if (!c.Class55.equals("")) {
                c.Class56 = message.Class4.readByte();
            }
            c.Class108 = message.Class4.readBoolean();
            c.cTypePk = message.Class4.readByte();
            c.nClass = GameScr.Class43[message.Class4.readByte()];
            c.cgender = message.Class4.readByte();
            c.head = message.Class4.readShort();
            c.cName = message.Class4.readUTF();
            c.cHP = message.Class4.readInt();
            c.cMaxHP = message.Class4.readInt();
            c.Class22 = message.Class4.readUnsignedByte();
            c.Class144 = message.Class4.readShort();
            c.body = message.Class4.readShort();
            c.leg = message.Class4.readShort();
            final byte byte1 = message.Class4.readByte();
            if (c.Class144 == -1) {
                c.Class144 = 15;
            }
            if (c.body == -1) {
                c.Class12();
            }
            if (c.leg == -1) {
                c.Class13();
            }
            if (byte1 == -1) {
                c.Class94 = null;
            }
            else {
                c.Class94 = new Mob((short)(-1), false, false, false, false, false, byte1, 1, 0, 0, 0, (short)c.cx, (short)(c.cy - 40), (byte)4, (byte)0, false, false);
                c.Class94.status = 5;
            }
            final short short1 = message.Class4.readShort();
            c.Class130 = short1;
            c.cx = short1;
            final short short2 = message.Class4.readShort();
            c.Class131 = short2;
            c.cy = short2;
            c.Class28 = message.Class4.readShort();
            c.Class29 = message.Class4.readShort();
            for (byte byte2 = message.Class4.readByte(), b = 0; b < byte2; ++b) {
                final Effect effect = new Effect(message.Class4.readByte(), message.Class4.readInt(), message.Class4.readInt(), message.Class4.readShort());
                c.vEff.addElement(effect);
                if (effect.template.type == 12 || effect.template.type == 11) {
                    c.Class108 = true;
                }
            }
            if (!c.Class108) {
                Game16.Class1(60, c, 1);
            }
            if (c.cHP == 0) {
                c.statusMe = 14;
                if (Char.getMyChar().charID == c.charID) {
                    GameScr.gI().Class22();
                }
            }
            if (c.charID == -Char.getMyChar().charID) {
                for (int i = 0; i < GameScr.vNpc.size(); ++i) {
                    final Npc npc;
                    if ((npc = (Npc)GameScr.vNpc.elementAt(i)).template.name.equals(c.cName)) {
                        npc.statusMe = 15;
                        npc.Class6 = null;
                        break;
                    }
                }
            }
            c.isHuman = message.Class4.readBoolean();
            c.Class3 = message.Class4.readBoolean();
            if (c.Class3) {
                Game16.Class1(141, c.cx, c.cy, 0);
            }
            final short[] array;
            if ((array = new short[] { message.Class4.readShort(), message.Class4.readShort(), message.Class4.readShort(), message.Class4.readShort() })[0] >= 0) {
                c.head = array[0];
            }
            if (array[1] >= 0) {
                c.Class144 = array[1];
            }
            if (array[2] >= 0) {
                c.body = array[2];
            }
            if (array[3] >= 0) {
                c.leg = array[3];
            }
            final short[] array2 = new short[10];
            try {
                for (int j = 0; j < 10; ++j) {
                    array2[j] = message.Class4.readShort();
                }
            }
            catch (Exception ex) {}
            c.Class1(array2);
            for (int k = 0; k < GameScr.vParty.size(); ++k) {
                final Party party;
                if ((party = (Party)GameScr.vParty.elementAt(k)).charId == c.charID) {
                    party.c = c;
                    break;
                }
            }
            return true;
        }
        catch (Exception ex2) {
            return false;
        }
    }
    
    private static void Class8(final Message message) {
        try {
            final byte byte1 = message.Class4.readByte();
            final int unsignedByte = message.Class4.readUnsignedByte();
            Item item = null;
            switch (byte1) {
                case 3: {
                    if ((item = Char.getMyChar().arrItemBag[unsignedByte]) != null) {
                        break;
                    }
                    if (GameScr.Class85 != null && GameScr.Class85.indexUI == unsignedByte) {
                        item = GameScr.Class85;
                    }
                    if (GameScr.Class84 != null && GameScr.Class84.indexUI == unsignedByte) {
                        item = GameScr.Class84;
                    }
                    if (GameScr.Class86 != null && GameScr.Class86.indexUI == unsignedByte) {
                        item = GameScr.Class86;
                    }
                    if (item == null && GameScr.Class76 != null) {
                        for (int i = 0; i < GameScr.Class76.length; ++i) {
                            if (GameScr.Class76[i] != null && GameScr.Class76[i].indexUI == unsignedByte) {
                                item = GameScr.Class76[i];
                                break;
                            }
                        }
                    }
                    if (item == null && GameScr.Class80 != null) {
                        for (int j = 0; j < GameScr.Class80.length; ++j) {
                            if (GameScr.Class80[j] != null && GameScr.Class80[j].indexUI == unsignedByte) {
                                item = GameScr.Class80[j];
                                break;
                            }
                        }
                    }
                    if (item == null && GameScr.Class75 != null) {
                        for (int k = 0; k < GameScr.Class75.length; ++k) {
                            if (GameScr.Class75[k] != null && GameScr.Class75[k].indexUI == unsignedByte) {
                                item = GameScr.Class75[k];
                                break;
                            }
                        }
                    }
                    if (item == null && GameScr.arrItemTradeMe != null) {
                        for (int l = 0; l < GameScr.arrItemTradeMe.length; ++l) {
                            if (GameScr.arrItemTradeMe[l] != null && GameScr.arrItemTradeMe[l].indexUI == unsignedByte) {
                                item = GameScr.arrItemTradeMe[l];
                                break;
                            }
                        }
                    }
                    if (item == null && GameScr.Class77 != null) {
                        for (int n = 0; n < GameScr.Class77.length; ++n) {
                            if (GameScr.Class77[n] != null && GameScr.Class77[n].indexUI == unsignedByte) {
                                item = GameScr.Class77[n];
                                break;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 4: {
                    item = Char.getMyChar().Class78[unsignedByte];
                    break;
                }
                case 39: {
                    item = Char.Class57.Class16[GameScr.indexSelect];
                    break;
                }
                case 5: {
                    item = Char.getMyChar().arrItemBody[unsignedByte];
                    break;
                }
                case 20: {
                    item = GameScr.Class51[unsignedByte];
                    break;
                }
                case 21: {
                    item = GameScr.Class52[unsignedByte];
                    break;
                }
                case 22: {
                    item = GameScr.Class53[unsignedByte];
                    break;
                }
                case 23: {
                    item = GameScr.Class54[unsignedByte];
                    break;
                }
                case 24: {
                    item = GameScr.Class55[unsignedByte];
                    break;
                }
                case 25: {
                    item = GameScr.Class56[unsignedByte];
                    break;
                }
                case 26: {
                    item = GameScr.Class57[unsignedByte];
                    break;
                }
                case 27: {
                    item = GameScr.Class58[unsignedByte];
                    break;
                }
                case 28: {
                    item = GameScr.Class59[unsignedByte];
                    break;
                }
                case 29: {
                    item = GameScr.Class60[unsignedByte];
                    break;
                }
                case 16: {
                    item = GameScr.Class61[unsignedByte];
                    break;
                }
                case 17: {
                    item = GameScr.Class62[unsignedByte];
                    break;
                }
                case 18: {
                    item = GameScr.Class63[unsignedByte];
                    break;
                }
                case 19: {
                    item = GameScr.Class64[unsignedByte];
                    break;
                }
                case 2: {
                    item = GameScr.Class65[unsignedByte];
                    break;
                }
                case 6: {
                    item = GameScr.Class66[unsignedByte];
                    break;
                }
                case 7: {
                    item = GameScr.Class67[unsignedByte];
                    break;
                }
                case 8: {
                    item = GameScr.Class68[unsignedByte];
                    break;
                }
                case 9: {
                    item = GameScr.Class69[unsignedByte];
                    break;
                }
                case 14: {
                    item = GameScr.Class70[unsignedByte];
                    break;
                }
                case 35: {
                    item = GameScr.Class71[unsignedByte];
                    break;
                }
                case 15: {
                    item = GameScr.Class73[unsignedByte];
                    break;
                }
                case 32: {
                    item = GameScr.Class74[unsignedByte];
                    break;
                }
                case 34: {
                    item = GameScr.Class72[unsignedByte];
                    break;
                }
                case 30: {
                    item = GameScr.arrItemTradeOrder[unsignedByte];
                    break;
                }
            }
            item.Class6 = message.Class4.readLong();
            if (item.Class8()) {
                item.saleCoinLock = message.Class4.readInt();
            }
            else if (item.Class10() || item.Class11() || item.Class12() || item.Class13() || item.Class14() || item.Class15()) {
                item.Class10 = message.Class4.readInt();
                item.Class11 = message.Class4.readInt();
                item.Class12 = message.Class4.readInt();
            }
            Label_1083: {
                if (item.Class2() || item.Class3() || item.Class4()) {
                    item.Class8 = message.Class4.readByte();
                    item.options = new MyVector();
                    try {
                        while (true) {
                            item.options.addElement(new ItemOption(message.Class4.readUnsignedByte(), message.Class4.readInt()));
                        }
                    }
                    catch (Exception ex2) {
                        break Label_1083;
                    }
                }
                if (item.template.id == 233) {
                    item.Class18 = Class1(Game20.Class2(message));
                }
                else if (item.template.id == 234) {
                    item.Class18 = Class1(Game20.Class2(message));
                }
                else if (item.template.id == 235) {
                    item.Class18 = Class1(Game20.Class2(message));
                }
            }
            if (byte1 == 5) {
                Char.getMyChar().Class23();
                return;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Controller.requestItemInfo()");
        }
        LockGame.HuyLockSellBuy();
    }
    
    private static void Class9(final Message message) {
        try {
            for (byte byte1 = message.Class4.readByte(), b = 0; b < byte1; ++b) {
                final Mob mob = new Mob((short)message.Class4.readUnsignedByte(), message.Class4.readBoolean(), message.Class4.readBoolean(), message.Class4.readBoolean(), message.Class4.readBoolean(), message.Class4.readBoolean(), message.Class4.readUnsignedByte(), message.Class4.readByte(), message.Class4.readInt(), message.Class4.readUnsignedByte(), message.Class4.readInt(), message.Class4.readShort(), message.Class4.readShort(), message.Class4.readByte(), message.Class4.readByte(), message.Class4.readBoolean(), true);
                final MobTemplate o;
                if ((o = Mob.arrMobTemplate[mob.templateId]).Class3 != 0) {
                    if (b % 3 == 0) {
                        mob.dir = -1;
                    }
                    else {
                        mob.dir = 1;
                    }
                    final Mob mob2 = mob;
                    mob2.x += 10 - b % 20;
                }
                Auto.KiemtraMob(mob);
                if (!Controller.tansat.contains(o) && !mob.isBoss && ((mob.templateId != 179 && mob.templateId != 175 && mob.templateId != 202) || mob.status != 8)) {
                    Controller.tansat.addElement(o);
                }
                GameScr.vMob.addElement(mob);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("err addMob");
        }
    }
    
    private static void Class10(final Message message) {
        try {
            Game39.Class1((short)message.Class4.readUnsignedByte(), message.Class4.readShort(), message.Class4.readShort(), message.Class4.readByte(), message.Class4.readShort(), 1);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("err add effAuto");
        }
    }
    
    private static void Class11(final Message message) {
        try {
            final short n = (short)message.Class4.readUnsignedByte();
            final short short1 = message.Class4.readShort();
            byte[] b = null;
            if (short1 > 0) {
                b = new byte[short1];
                message.Class4.read(b);
            }
            Game39.Class1(n, b);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("err add effAuto");
        }
    }
    
    private static void Class12(final Message message) {
        try {
            Game39.Class2((short)message.Class4.readUnsignedByte(), Game20.Class145(message));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("err getImgEffAuto");
        }
    }
    
    private static void Class13(final Message message) {
        try {
            final byte byte1 = message.Class4.readByte();
            Char.getMyChar().luong = message.Class4.readInt();
            Char.getMyChar().xu = message.Class4.readInt();
            Char.getMyChar().yen = message.Class4.readInt();
            if (byte1 == 0) {
                if (GameScr.Class85 != null) {
                    GameScr.Class85 = null;
                }
                if (GameScr.Class77 != null) {
                    for (int i = 0; i < GameScr.Class77.length; ++i) {
                        GameScr.Class77[i] = null;
                    }
                }
            }
            else if (byte1 == 1) {
                if (GameScr.Class85 != null) {
                    GameScr.Class85.Class7 = true;
                    GameScr.Class85.upgrade = message.Class4.readByte();
                    GameScr.Class161 = GameScr.efs[53];
                    GameScr.Class160 = 0;
                }
                if (GameScr.Class77 != null) {
                    for (int j = 0; j < GameScr.Class77.length; ++j) {
                        GameScr.Class77[j] = null;
                    }
                }
            }
            else if ((byte1 == 2 || byte1 == 3) && GameScr.Class77 != null) {
                for (int k = 0; k < GameScr.Class77.length; ++k) {
                    GameScr.Class77[k] = null;
                }
            }
            final GameScr gi = GameScr.gI();
            final GameScr gi2 = GameScr.gI();
            final Command command = null;
            gi2.center = command;
            gi.left = command;
            GameScr.gI().Class28();
            GameCanvas.endDlg();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("err getImgEffAuto");
        }
    }
    
    private static void Class14(final Message message) {
        try {
            Game19 game19;
            if (message.Class4.readByte() == 1) {
                game19 = Mob.Class1(message.Class4.readUnsignedByte());
            }
            else {
                final int int1;
                if ((int1 = message.Class4.readInt()) == Char.getMyChar().charID) {
                    game19 = Char.getMyChar();
                }
                else {
                    game19 = GameScr.Class5(int1);
                }
            }
            if (game19 == null) {
                return;
            }
            final short short1 = message.Class4.readShort();
            final int int2 = message.Class4.readInt();
            final byte byte1 = message.Class4.readByte();
            final boolean b = message.Class4.readByte() != 0;
            final Game19 game20 = game19;
            final short n = short1;
            final long n2 = int2;
            final int n3 = byte1 * 1000;
            final boolean b2 = b;
            final int class21 = n3;
            final long n4 = n2;
            final short n5 = n;
            final Game19 game21 = game20;
            for (int i = 0; i < game21.Class1.size(); ++i) {
                final Game123 game22;
                if ((game22 = (Game123)game21.Class1.elementAt(i)) != null && game22.Class8 == n5) {
                    game22.Class19 = n4 + System.currentTimeMillis();
                    game22.Class21 = class21;
                    game22.Class1(n4);
                    return;
                }
            }
            game21.Class1.addElement(new Game123(n5, n4, class21, b2));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void Class15(final Message message) {
        try {
            final short i = (short)message.Class4.readUnsignedByte();
            final byte[] class145 = Game20.Class145(message);
            Game75.Class1(i, class145);
            Game82 game82;
            if ((game82 = (Game82)Game75.Class1.Class1(String.valueOf(i))) == null) {
                game82 = new Game82();
                Game75.Class1.Class1(new StringBuffer(String.valueOf(i)).toString(), game82);
            }
            game82.Class1 = Class1(class145);
            if (GameMidlet.Class1 != 1) {
                TaskOrder.Class2("ImgEffect ".concat(String.valueOf(i)), class145);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("err getImgEffect");
        }
    }
    
    private static void Class16(final Message message) {
        try {
            final short i = (short)message.Class4.readUnsignedByte();
            final short short1 = message.Class4.readShort();
            byte[] b = null;
            if (short1 > 0) {
                b = new byte[short1];
                message.Class4.read(b);
            }
            final Game70 game70;
            if ((game70 = (Game70)Game75.Class2.Class1(String.valueOf(i))) != null) {
                final Game70 game71 = game70;
                final byte[] class1 = b;
                final Game70 game72 = game71;
                if (class1 != null) {
                    game72.Class1 = class1;
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("err getDataEffect ");
        }
    }
    
    private static void Class1(final Message message, final int n) {
        try {
            Mob.arrMobTemplate[n].Class9 = new Game76[message.Class4.readByte()];
            for (int i = 0; i < Mob.arrMobTemplate[n].Class9.length; ++i) {
                Mob.arrMobTemplate[n].Class9[i] = new Game76();
                message.Class4.readByte();
                Mob.arrMobTemplate[n].Class9[i].Class1 = message.Class4.readUnsignedByte();
                Mob.arrMobTemplate[n].Class9[i].Class2 = message.Class4.readUnsignedByte();
                Mob.arrMobTemplate[n].Class9[i].Class3 = message.Class4.readUnsignedByte();
                Mob.arrMobTemplate[n].Class9[i].Class4 = message.Class4.readUnsignedByte();
            }
            Mob.arrMobTemplate[n].Class10 = new Game74[message.Class4.readShort()];
            for (int j = 0; j < Mob.arrMobTemplate[n].Class10.length; ++j) {
                Mob.arrMobTemplate[n].Class10[j] = new Game74();
                final byte byte1 = message.Class4.readByte();
                Mob.arrMobTemplate[n].Class10[j].Class1 = new short[byte1];
                Mob.arrMobTemplate[n].Class10[j].Class2 = new short[byte1];
                Mob.arrMobTemplate[n].Class10[j].Class3 = new byte[byte1];
                for (byte b = 0; b < byte1; ++b) {
                    Mob.arrMobTemplate[n].Class10[j].Class1[b] = message.Class4.readShort();
                    Mob.arrMobTemplate[n].Class10[j].Class2[b] = message.Class4.readShort();
                    Mob.arrMobTemplate[n].Class10[j].Class3[b] = message.Class4.readByte();
                }
            }
            for (short short1 = message.Class4.readShort(), n2 = 0; n2 < short1; ++n2) {
                message.Class4.readShort();
            }
        }
        catch (Exception ex) {}
    }
    
    private static void Class2(final Message message, final int i) {
        try {
            Mob.arrMobTemplate[i].Class9 = new Game76[message.Class4.readByte()];
            for (int j = 0; j < Mob.arrMobTemplate[i].Class9.length; ++j) {
                Mob.arrMobTemplate[i].Class9[j] = new Game76();
                message.Class4.readByte();
                Mob.arrMobTemplate[i].Class9[j].Class1 = message.Class4.readUnsignedByte();
                Mob.arrMobTemplate[i].Class9[j].Class2 = message.Class4.readUnsignedByte();
                Mob.arrMobTemplate[i].Class9[j].Class3 = message.Class4.readUnsignedByte();
                Mob.arrMobTemplate[i].Class9[j].Class4 = message.Class4.readUnsignedByte();
            }
            Mob.arrMobTemplate[i].Class10 = new Game74[message.Class4.readShort()];
            for (int k = 0; k < Mob.arrMobTemplate[i].Class10.length; ++k) {
                Mob.arrMobTemplate[i].Class10[k] = new Game74();
                final byte byte1 = message.Class4.readByte();
                Mob.arrMobTemplate[i].Class10[k].Class1 = new short[byte1];
                Mob.arrMobTemplate[i].Class10[k].Class2 = new short[byte1];
                Mob.arrMobTemplate[i].Class10[k].Class3 = new byte[byte1];
                Mob.arrMobTemplate[i].Class10[k].Class4 = new byte[byte1];
                Mob.arrMobTemplate[i].Class10[k].Class5 = new byte[byte1];
                for (byte b = 0; b < byte1; ++b) {
                    Mob.arrMobTemplate[i].Class10[k].Class1[b] = message.Class4.readShort();
                    Mob.arrMobTemplate[i].Class10[k].Class2[b] = message.Class4.readShort();
                    Mob.arrMobTemplate[i].Class10[k].Class3[b] = message.Class4.readByte();
                    Mob.arrMobTemplate[i].Class10[k].Class4[b] = message.Class4.readByte();
                    Mob.arrMobTemplate[i].Class10[k].Class5[b] = message.Class4.readByte();
                }
            }
            final short n = (short)message.Class4.readUnsignedByte();
            Mob.arrMobTemplate[i].Class14 = new byte[n];
            for (short n2 = 0; n2 < n; ++n2) {
                Mob.arrMobTemplate[i].Class14[n2] = (byte)message.Class4.readShort();
            }
            message.Class4.readByte();
            for (int l = 0; l < 4; ++l) {
                if (l != 2) {
                    final byte byte2 = message.Class4.readByte();
                    Mob.arrMobTemplate[i].Class13[l] = new byte[byte2];
                    for (byte b2 = 0; b2 < byte2; ++b2) {
                        Mob.arrMobTemplate[i].Class13[l][b2] = message.Class4.readByte();
                    }
                }
            }
            try {
                Mob.arrMobTemplate[i].Class15[0] = (byte)(Mob.arrMobTemplate[i].Class13[0].length - 7);
                Mob.arrMobTemplate[i].Class15[1] = (byte)(Mob.arrMobTemplate[i].Class13[1].length - 7);
                Mob.arrMobTemplate[i].Class15[2] = (byte)(Mob.arrMobTemplate[i].Class13[3].length - 7);
                Mob.arrMobTemplate[i].Class15[3] = (byte)(Mob.arrMobTemplate[i].Class13[3].length - 7);
            }
            catch (Exception ex) {
                System.out.println("loi read data mod " + ex.toString());
            }
            for (int n3 = 0; n3 < 3; ++n3) {
                Mob.arrMobTemplate[i].Class15[n3] = message.Class4.readByte();
            }
            Mob.arrMobTemplate[i].Class15[3] = Mob.arrMobTemplate[i].Class15[2];
        }
        catch (Exception ex2) {
            System.out.println("loi ham read data new mob " + i + " " + ex2.toString());
        }
    }
    
    static {
        Controller.Game3 = new String[] { "B\u1ea1n ch\u1ec9 c\u00f3 th\u1ec3 v\u00e0o l\u1ea1i game sau ", " gi\u00e2y n\u1eefa" };
        Controller.Game4 = "B\u1ea1n ch\u01b0a th\u1ec3 \u0111i \u0111\u1ebfn khu v\u1ef1c n\u00e0y.H\u00e3y ho\u00e0n th\u00e0nh nhi\u1ec7m v\u1ee5 tr\u01b0\u1edbc.";
        Controller.Game5 = "C\u1eeda n\u00e0y v\u1eabn ch\u01b0a \u0111\u01b0\u1ee3c m\u1edf.";
        Controller.Game6 = "C\u1eeda n\u00e0y ch\u1ec9 ch\u1ee9a \u0111\u01b0\u1ee3c t\u1ed1i \u0111a 2 ng\u01b0\u1eddi.";
        Controller.Game7 = "S\u1ed1 nh\u00f3m c\u1ee7a khu v\u1ef1c n\u00e0y";
        Controller.Game8 = "Khu v\u1ef1c n\u00e0y \u0111\u00e3 \u0111\u1ea7y.";
        Controller.Game9 = "Thao t\u00e1c qu\u00e1 nhanh.";
        Controller.tansat = new MyVector();
    }
}
