// 
// Decompiled by Procyon v0.5.36
// 

package main;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameCanvas extends Game3 implements IActionListener, Runnable
{
    public static boolean Class1;
    private static Image Class52;
    public static boolean Class2;
    public static boolean Class3;
    public static boolean Class4;
    public static boolean isLoading;
    public static boolean Class6;
    public static boolean Class7;
    public static boolean Class8;
    public static boolean Class9;
    public static GameCanvas instance;
    public static boolean Class11;
    public static boolean[] Class12;
    private static boolean[] Class53;
    public static boolean[] Class13;
    public static boolean Class14;
    public static boolean Class15;
    public static boolean Class16;
    public static int Class17;
    public static int Class18;
    public static int Class19;
    public static int Class20;
    private static Game65[] Class54;
    public static int gameTick;
    public static int Class22;
    public static boolean Class23;
    public static boolean Class24;
    private static long Class55;
    private static long Class56;
    private static boolean Class57;
    public static int Class25;
    public static int Class26;
    public static int Class27;
    public static int Class28;
    public static mScreen Class29;
    public static Game100 Class30;
    public static Game69 Class31;
    public static Game83 Class32;
    public static Game111 Class33;
    public static Game108 Class34;
    public static Game45 Class35;
    public static InputDlg inputDlg;
    public static Game85 Class37;
    public static Game25 Class38;
    public static Game15 Class39;
    private static Image[] Class58;
    private static int Class59;
    private static int Class60;
    public static int Class40;
    private static int[] Class61;
    private mGraphics Class62;
    private static boolean Class63;
    private static int Class64;
    private static int Class65;
    private static int Class66;
    private static int Class67;
    private static int Class68;
    private static int Class69;
    private static int Class70;
    private static Image Class71;
    private static Image Class72;
    public static Image[] Class41;
    public static int Class42;
    public static int Class43;
    private static int[] Class73;
    private static int[] Class74;
    private static int Class75;
    private static int Class76;
    public static int Class44;
    private static long Class77;
    public static int Class45;
    private static int[] Class78;
    public int[] Class46;
    public int[] Class47;
    public int[] Class48;
    private static int[] Class79;
    private static int[] Class80;
    private static int[] Class81;
    private static Image[] Class82;
    private static Image Class83;
    private static Image[][] Class84;
    private boolean Class85;
    public static boolean Class49;
    public static boolean Class50;
    public static Image Class51;
    private static int Class86;
    private static int Class87;
    private static int Class88;
    public static int intkeyn;
    public static long Log1;
    public static long Log2;
    
    static {
        GameCanvas.Class1 = false;
        GameCanvas.Class2 = true;
        GameCanvas.Class3 = true;
        GameCanvas.Class4 = false;
        GameCanvas.Class6 = false;
        GameCanvas.Class12 = new boolean[14];
        GameCanvas.Class53 = new boolean[14];
        GameCanvas.Class13 = new boolean[14];
        GameCanvas.Class54 = new Game65[4];
        GameCanvas.Class30 = new Game100();
        new MyVector();
        GameCanvas.Class60 = 0;
        GameCanvas.Class41 = new Image[2];
        GameCanvas.Class44 = -1;
        GameCanvas.Class77 = 0L;
        new MyVector();
        GameCanvas.Class49 = false;
        GameCanvas.Class50 = false;
        GameCanvas.Class86 = GameCanvas.Class25;
    }
    
    public GameCanvas() {
        this.Class62 = new mGraphics();
        Game2.Class1.setFullScreenMode(true);
        Game2.Class1.Class2 = this;
        GameCanvas.Class25 = Game2.Class1.Class2();
        GameCanvas.Class26 = Game2.Class1.Class1();
        GameCanvas.Class27 = GameCanvas.Class25 / 2;
        GameCanvas.Class28 = GameCanvas.Class26 / 2;
        GameCanvas.Class57 = (System.getProperty("microedition.platform").indexOf("RIM") == 0);
        if (Game2.Class1.hasPointerEvents()) {
            GameCanvas.Class6 = true;
            if (GameCanvas.Class25 >= 240) {
                GameCanvas.Class7 = true;
            }
            if (GameCanvas.Class25 < 320) {
                GameCanvas.Class8 = true;
            }
            if (GameCanvas.Class25 >= 320) {
                GameCanvas.Class9 = true;
            }
        }
        GameCanvas.Class35 = new Game45();
        if (GameCanvas.Class26 <= 160) {
            Game25.Class6 = 15;
            mScreen.Class6 = 17;
        }
        GameCanvas.instance = this;
        System.gc();
        GameCanvas.Class38 = new Game25();
        if (!GameCanvas.Class1) {
            if (GameCanvas.Class84 == null) {
                GameCanvas.Class84 = new Image[2][5];
                for (int i = 0; i < 2; ++i) {
                    for (int j = 0; j < 5; ++j) {
                        GameCanvas.Class84[i][j] = Class3("/e/d" + i + j + ".png");
                    }
                }
            }
            this.Class46 = new int[2];
            this.Class47 = new int[2];
            (this.Class48 = new int[2])[0] = (this.Class48[1] = -1);
        }
        Class14();
        GameMidlet.Class3();
        GameCanvas.Class83 = Class3("/u/f.png");
        if (GameCanvas.Class6) {
            for (int k = 0; k < 2; ++k) {
                GameCanvas.Class41[k] = Class3("/hd/bd" + k + ".png");
            }
            GameCanvas.Class42 = mGraphics.Class1(GameCanvas.Class41[0]);
            GameCanvas.Class43 = mGraphics.Class2(GameCanvas.Class41[0]);
            mGraphics.Class1(GameCanvas.Class41[1]);
            mGraphics.Class2(GameCanvas.Class41[1]);
        }
        else if (TaskOrder.Class3("lowGraphic") == 1) {
            GameCanvas.Class1 = true;
        }
        Game2.Class3();
        if (Game2.Class1.hasPointerEvents()) {
            new MyVector();
        }
        mScreen.Class3();
        GameCanvas.Class33 = new Game111();
    }
    
    public static GameCanvas Class1() {
        if (GameCanvas.instance == null) {
            GameCanvas.instance = new GameCanvas();
        }
        return GameCanvas.instance;
    }
    
    public static void Class1(final int i) {
        String str = "socket://" + GameMidlet.Class3 + ":" + GameMidlet.Class2;
        System.out.println("connect: " + i + " | isWorldver: " + GameMidlet.Class8);
        if (GameCanvas.Class57) {
            if (!GameCanvas.Class3) {
                str = String.valueOf(str) + ";interface=wifi";
            }
            else {
                str = String.valueOf(str) + ";deviceside=true";
            }
        }
        final Session_ME gi = Session_ME.gI();
        System.out.println("connect to " + str + ":" + GameMidlet.Class7);
        if (gi.connecting || gi.Class6) {
            return;
        }
        gi.Class11 = false;
        gi.Class4 = null;
        gi.Class7 = new Thread(new Game46(gi, str));
        Game105.Class1();
    }
    
    public static void Class2() {
        GameCanvas.Class25 = Game2.Class1.Class2();
        GameCanvas.Class26 = Game2.Class1.Class1();
        GameCanvas.Class27 = GameCanvas.Class25 / 2;
        GameCanvas.Class28 = GameCanvas.Class26 / 2;
        GameCanvas.Class32 = new Game83();
        GameCanvas.Class31 = new Game69();
        GameCanvas.Class39 = new Game15();
        GameCanvas.inputDlg = new InputDlg();
        GameCanvas.Class37 = new Game85();
    }
    
    private void Class13() {
        new Thread(this).start();
    }
    
    public final void run() {
        try {
            Thread.sleep(10L);
        }
        catch (InterruptedException ex5) {}
        GameCanvas.Class11 = true;
        while (GameCanvas.Class11) {
            try {
                final long currentTimeMillis;
                if ((currentTimeMillis = System.currentTimeMillis()) - GameCanvas.Class55 >= 780L && !GameCanvas.Class23) {
                    GameCanvas.Class55 = currentTimeMillis;
                    GameCanvas.Class23 = true;
                }
                else {
                    GameCanvas.Class23 = false;
                }
                if (currentTimeMillis - GameCanvas.Class56 >= 7800L && !GameCanvas.Class24) {
                    GameCanvas.Class56 = currentTimeMillis;
                    GameCanvas.Class24 = true;
                }
                else {
                    GameCanvas.Class24 = false;
                }
                if (GameCanvas.Class22 > 0) {
                    --GameCanvas.Class22;
                }
                if (++GameCanvas.gameTick > 10000) {
                    if (System.currentTimeMillis() - GameCanvas.Class77 > 20000L && GameCanvas.Class29 == GameCanvas.Class32) {
                        GameMidlet.Class6.notifyDestroyed();
                    }
                    GameCanvas.gameTick = 0;
                }
                if (GameCanvas.Class29 != null) {
                    if (GameCanvas.Class34 != null) {
                        GameCanvas.Class34.Class2();
                    }
                    else if (GameCanvas.Class30.Class1) {
                        final Game100 class30;
                        final Game100 game100;
                        if ((game100 = (class30 = GameCanvas.Class30)).Class19 != 0 && !game100.Class17) {
                            if ((Game100.Class9 += game100.Class19 / 100) < 0) {
                                Game100.Class9 = 0;
                            }
                            else if (Game100.Class9 > Game100.Class11) {
                                Game100.Class9 = Game100.Class11;
                            }
                            else {
                                Game100.Class10 = Game100.Class9;
                            }
                            final Game100 game101 = game100;
                            game101.Class19 = game101.Class19 * 9 / 10;
                            if (game100.Class19 < 100 && game100.Class19 > -100) {
                                game100.Class19 = 0;
                            }
                        }
                        if (Game100.Class10 != Game100.Class9 && !game100.Class17) {
                            game100.Class21 = Game100.Class9 - Game100.Class10 << 2;
                            final Game100 game102 = game100;
                            game102.Class22 += game100.Class21;
                            Game100.Class10 += game100.Class22 >> 4;
                            final Game100 game103 = game100;
                            game103.Class22 &= 0xF;
                        }
                        if (class30.Class8 > class30.Class5) {
                            int n;
                            if ((n = class30.Class8 - class30.Class5 >> 1) <= 0) {
                                n = 1;
                            }
                            final Game100 game104 = class30;
                            game104.Class8 -= n;
                        }
                        if (Game100.Class12 != 0 && (Game100.Class12 >>= 1) < 0) {
                            Game100.Class12 = 0;
                        }
                        if (class30.Class18 > 0) {
                            final Game100 game105 = class30;
                            --game105.Class18;
                            GameScr.Class88 = false;
                            if (class30.Class18 == 0) {
                                class30.Class1 = false;
                                final Command command;
                                if (class30.Class3 >= 0 && (command = (Command)class30.Class2.elementAt(class30.Class3)) != null) {
                                    command.Class1();
                                }
                            }
                        }
                        GameCanvas.Class30.switchToMe();
                    }
                    if (!GameCanvas.isLoading) {
                        GameCanvas.Class29.Class4();
                    }
                    GameCanvas.Class29.Class5();
                }
                final long currentTimeMillis2 = System.currentTimeMillis();
                if (RMS.Class3 && currentTimeMillis2 > RMS.Class2) {
                    RMS.Class3 = false;
                    try {
                        if (RMS.Class1 > 0) {
                            GameScr.gI().perform(RMS.Class1, null);
                        }
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                if (InfoDlg.Class4 > 0 && --InfoDlg.Class4 == 0) {
                    InfoDlg.hide();
                }
                if (this.Class85) {
                    this.Class85 = false;
                    GameCanvas.Class31.switchToMe();
                    try {
                        Char.Class5();
                        GameScr.Class15();
                        GameScr.Class6();
                        endDlg();
                        InfoDlg.hide();
                        GameScr.Class1(true);
                        GameScr.Class16 = 100;
                        Class2(TileMap.Class13);
                        GameScr.vParty.removeAllElements();
                        GameScr.Class31.removeAllElements();
                        GameScr.Class34.removeAllElements();
                        GameScr.Class37.removeAllElements();
                        Char.Class57 = null;
                    }
                    catch (Exception ex2) {
                        ex2.printStackTrace();
                    }
                }
                Game2.Class1.repaint();
                Game2.Class1.serviceRepaints();
                final long n2 = System.currentTimeMillis() - currentTimeMillis;
                try {
                    if (n2 < 40L) {
                        Thread.sleep(1L * (40L - n2));
                    }
                    else {
                        Thread.sleep(1L);
                    }
                }
                catch (InterruptedException ex6) {}
            }
            catch (Exception ex4) {
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException ex3) {
                    ex3.printStackTrace();
                }
                ex4.printStackTrace();
            }
        }
    }
    
    public static void Class3() {
        if (GameCanvas.Class4 && --GameCanvas.Class40 < 0) {
            GameCanvas.Class4 = false;
        }
    }
    
    public static void Class4() {
        if (GameCanvas.Class1) {
            return;
        }
        if (GameCanvas.Class71 == null) {
            return;
        }
        for (int i = 0; i < GameCanvas.Class73.length; ++i) {
            if (GameCanvas.gameTick % (i + 2 << 3) == 0) {
                final int[] class73 = GameCanvas.Class73;
                final int n = i;
                ++class73[n];
                if (GameCanvas.Class73[i] > GameScr.Class9 + (mGraphics.Class1(GameCanvas.Class71) >> 1)) {
                    GameCanvas.Class73[i] = -(mGraphics.Class1(GameCanvas.Class71) >> 1);
                }
            }
        }
    }
    
    public static void Class1(final mGraphics mGraphics) {
        if (Code.Paint) {
            if (GameCanvas.Class4) {
                if (GameCanvas.gameTick % 10 > 7) {
                    mGraphics.setColor(16777215);
                }
                else {
                    mGraphics.setColor(0);
                }
                mGraphics.fillRect(0, 0, GameScr.Class9, GameScr.Class10);
                return;
            }
            if (GameCanvas.Class63 && !GameCanvas.Class1 && GameCanvas.Class58 != null) {
                mGraphics.setColor(GameCanvas.Class59);
                mGraphics.fillRect(0, 0, GameScr.Class9, GameCanvas.Class64);
                if (GameCanvas.Class44 >= 0 && GameCanvas.Class44 <= 1) {
                    if (GameCanvas.Class58[0] != null) {
                        for (int i = -((GameScr.Class16 >> 1) % 24); i < GameScr.Class9; i += 24) {
                            mGraphics.Class1(GameCanvas.Class58[0], i, GameCanvas.Class65, 0);
                        }
                    }
                    if (GameCanvas.Class58[1] != null) {
                        for (int j = -((GameScr.Class16 >> 2) % 24); j < GameScr.Class9; j += 24) {
                            mGraphics.Class1(GameCanvas.Class58[1], j, GameCanvas.Class66, 0);
                        }
                    }
                    if (GameCanvas.Class58[3] != null) {
                        for (int k = -((GameScr.Class16 >> 4) % 64); k < GameScr.Class9; k += 64) {
                            mGraphics.Class1(GameCanvas.Class58[3], k, GameCanvas.Class68, 0);
                        }
                    }
                    if (GameCanvas.Class72 != null) {
                        mGraphics.Class1(GameCanvas.Class72, GameCanvas.Class75, GameCanvas.Class76, 3);
                    }
                    if (GameCanvas.Class71 != null) {
                        for (int l = 0; l < 2; ++l) {
                            mGraphics.Class1(GameCanvas.Class71, GameCanvas.Class73[l], GameCanvas.Class74[l], 3);
                        }
                    }
                    if (GameCanvas.Class58[2] != null) {
                        for (int n = -((GameScr.Class16 >> 3) % 192); n < GameScr.Class9; n += 192) {
                            mGraphics.Class1(GameCanvas.Class58[2], n, GameCanvas.Class67, 0);
                        }
                    }
                    return;
                }
                else if (GameCanvas.Class44 >= 2 && GameCanvas.Class44 <= 6) {
                    if (GameCanvas.Class72 != null) {
                        mGraphics.Class1(GameCanvas.Class72, GameCanvas.Class75, GameCanvas.Class76, 3);
                    }
                    if (GameCanvas.Class71 != null) {
                        for (int n2 = 0; n2 < GameCanvas.Class73.length; ++n2) {
                            mGraphics.Class1(GameCanvas.Class71, GameCanvas.Class73[n2], GameCanvas.Class74[n2], 3);
                        }
                    }
                    if (GameCanvas.Class44 == 2) {
                        return;
                    }
                    if (GameCanvas.Class58[3] != null) {
                        for (int n3 = -((GameScr.Class16 >> GameCanvas.Class78[3]) % GameCanvas.Class61[3]); n3 < GameScr.Class9; n3 += GameCanvas.Class61[3]) {
                            mGraphics.Class1(GameCanvas.Class58[3], n3, GameCanvas.Class68, 0);
                        }
                    }
                    if (GameCanvas.Class58[2] != null) {
                        for (int n4 = -((GameScr.Class16 >> GameCanvas.Class78[2]) % GameCanvas.Class61[2]); n4 < GameScr.Class9; n4 += GameCanvas.Class61[2]) {
                            mGraphics.Class1(GameCanvas.Class58[2], n4, GameCanvas.Class67, 0);
                        }
                    }
                    if (GameCanvas.Class58[1] != null) {
                        for (int n5 = -((GameScr.Class16 >> GameCanvas.Class78[1]) % GameCanvas.Class61[1]); n5 < GameScr.Class9; n5 += GameCanvas.Class61[1]) {
                            mGraphics.Class1(GameCanvas.Class58[1], n5, GameCanvas.Class70, 0);
                        }
                    }
                    if (GameCanvas.Class58[0] != null) {
                        for (int n6 = -((GameScr.Class16 >> GameCanvas.Class78[0]) % GameCanvas.Class61[0]); n6 < GameScr.Class9; n6 += GameCanvas.Class61[0]) {
                            mGraphics.Class1(GameCanvas.Class58[0], n6, GameCanvas.Class69, 0);
                        }
                    }
                    return;
                }
                else {
                    if (GameCanvas.Class44 < 7 || GameCanvas.Class44 > 16) {
                        return;
                    }
                    mGraphics.setColor(GameCanvas.Class59);
                    mGraphics.fillRect(0, 0, GameScr.Class9, GameScr.Class10);
                    if (GameCanvas.Class44 != 8 && GameCanvas.Class58[3] != null) {
                        for (int n7 = -((GameScr.Class16 >> GameCanvas.Class78[3]) % GameCanvas.Class61[3]); n7 < GameScr.Class9; n7 += GameCanvas.Class61[3]) {
                            if (GameCanvas.Class44 == 11 || GameCanvas.Class44 == 12) {
                                mGraphics.Class1(GameCanvas.Class58[3], n7, GameScr.Class10 - mGraphics.Class2(GameCanvas.Class58[3]), 0);
                            }
                            else {
                                mGraphics.Class1(GameCanvas.Class58[3], n7, GameCanvas.Class68, 0);
                            }
                        }
                    }
                    if (GameCanvas.Class44 != 8 && GameCanvas.Class44 != 11 && GameCanvas.Class44 != 12 && GameCanvas.Class58[2] != null) {
                        if (TileMap.mapID == 45) {
                            mGraphics.Class1(GameCanvas.Class58[2], GameScr.Class9, GameCanvas.Class67, 0);
                        }
                        else {
                            for (int n8 = -((GameScr.Class16 >> GameCanvas.Class78[2]) % GameCanvas.Class61[2]); n8 < GameScr.Class9; n8 += GameCanvas.Class61[2]) {
                                if (GameCanvas.Class44 == 14) {
                                    mGraphics.Class1(GameCanvas.Class58[2], n8, GameCanvas.Class67 + 12, 0);
                                }
                                else {
                                    mGraphics.Class1(GameCanvas.Class58[2], n8, GameCanvas.Class67, 0);
                                }
                            }
                        }
                    }
                    if (GameCanvas.Class44 != 11 && GameCanvas.Class44 != 12 && GameCanvas.Class58[1] != null && TileMap.mapID != 52) {
                        for (int n9 = -((GameScr.Class16 >> GameCanvas.Class78[1]) % GameCanvas.Class61[1]); n9 < GameScr.Class9; n9 += GameCanvas.Class61[1]) {
                            mGraphics.Class1(GameCanvas.Class58[1], n9, GameCanvas.Class70, 0);
                        }
                    }
                    if (TileMap.mapID == 45 || TileMap.mapID == 55) {
                        mGraphics.setColor(1114112);
                        mGraphics.fillRect(0, GameCanvas.Class69 + 20, GameScr.Class9, GameScr.Class10);
                    }
                    if (GameCanvas.Class58[0] != null) {
                        for (int n10 = -((GameScr.Class16 >> GameCanvas.Class78[0]) % GameCanvas.Class61[0]); n10 < GameScr.Class9; n10 += GameCanvas.Class61[0]) {
                            mGraphics.Class1(GameCanvas.Class58[0], n10, GameCanvas.Class69, 0);
                        }
                    }
                    if (GameCanvas.Class71 == null) {
                        return;
                    }
                    if (GameCanvas.Class44 == 13 || GameCanvas.Class44 == 15) {
                        for (int n11 = 0; n11 < 2; ++n11) {
                            mGraphics.Class1(GameCanvas.Class71, GameCanvas.Class73[n11], GameCanvas.Class74[n11] - 130, 3);
                        }
                        return;
                    }
                    for (int n12 = 0; n12 < 2; ++n12) {
                        mGraphics.Class1(GameCanvas.Class71, GameCanvas.Class73[n12], GameCanvas.Class74[n12], 3);
                    }
                    return;
                }
            }
        }
        mGraphics.setColor(0);
        mGraphics.fillRect(0, 0, GameScr.Class9, GameScr.Class10);
    }
    
    public static void Class5() {
        GameCanvas.Class58 = null;
        GameCanvas.Class71 = null;
        GameCanvas.Class72 = null;
    }
    
    public static void Class2(final int class44) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            switch (GameCanvas.Class44 = class44) {
                case 2: {
                    GameCanvas.Class78 = new int[] { 1, 2, 3, 4 };
                    break;
                }
                case 3: {
                    GameCanvas.Class78 = new int[] { 1, 2, 3, 4 };
                    break;
                }
                case 5: {
                    GameCanvas.Class78 = new int[] { 1, 1, 1, 1 };
                    break;
                }
                case 12: {
                    GameCanvas.Class78 = new int[] { 1, 2, 3, 4 };
                    break;
                }
                case 11: {
                    GameCanvas.Class78 = new int[] { 1, 2, 3, 4 };
                    break;
                }
                case 10: {
                    GameCanvas.Class78 = new int[] { 1, 1, 1, 1 };
                    break;
                }
                case 8: {
                    GameCanvas.Class78 = new int[] { 1, 2, 3, 4 };
                    break;
                }
                case 7: {
                    GameCanvas.Class78 = new int[] { 1, 2, 3, 4 };
                    break;
                }
                case 14: {
                    GameCanvas.Class78 = new int[] { 1, 2, 3, 4 };
                    break;
                }
                case 15: {
                    GameCanvas.Class78 = new int[] { 1, 2, 3, 4 };
                    break;
                }
                case 16: {
                    GameCanvas.Class78 = new int[] { 1, 2, 3, 4 };
                    break;
                }
                case 4: {
                    n = 9;
                    n2 = 6;
                    continue;
                }
                case 6: {
                    n = 12;
                    continue;
                }
                case 9: {
                    n = 16;
                    n2 = 10;
                    n3 = 6;
                    continue;
                }
                case 13: {
                    n = 60;
                    continue;
                }
            }
            break;
        }
        GameCanvas.Class59 = Game62.Class10[GameCanvas.Class44];
        try {
            if (!GameCanvas.Class1) {
                GameCanvas.Class58 = new Image[4];
                GameCanvas.Class61 = new int[4];
                for (int i = 0; i < 4; ++i) {
                    try {
                        if (Game62.Class9[GameCanvas.Class44][i] != -1) {
                            GameCanvas.Class58[i] = Class3("/bg/bg" + i + Game62.Class9[GameCanvas.Class44][i] + ".png");
                        }
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    if (GameCanvas.Class58[i] != null) {
                        GameCanvas.Class61[i] = mGraphics.Class1(GameCanvas.Class58[i]);
                    }
                }
                if (GameCanvas.Class44 == 10) {
                    GameCanvas.Class58[1] = Class3("/bg/bg09.png");
                    GameCanvas.Class58[2] = Class3("/bg/bg09.png");
                    GameCanvas.Class61[1] = mGraphics.Class1(GameCanvas.Class58[1]);
                    GameCanvas.Class61[2] = mGraphics.Class1(GameCanvas.Class58[2]);
                }
                if (GameCanvas.Class44 == 12) {
                    GameCanvas.Class58[3] = Class3("/bg/bg39.png");
                    GameCanvas.Class61[3] = mGraphics.Class1(GameCanvas.Class58[3]);
                }
                if (GameCanvas.Class44 == 14) {
                    if (GameCanvas.Class6) {
                        GameCanvas.Class70 = (GameCanvas.Class69 = GameCanvas.Class26 - mGraphics.Class2(GameCanvas.Class58[0])) - mGraphics.Class2(GameCanvas.Class58[1]);
                    }
                    else {
                        GameCanvas.Class70 = (GameCanvas.Class69 = GameCanvas.Class26 - mGraphics.Class2(GameCanvas.Class58[0]) - 45) - mGraphics.Class2(GameCanvas.Class58[1]);
                    }
                }
                if (GameCanvas.Class44 == 15 && GameCanvas.Class6) {
                    GameCanvas.Class70 = (GameCanvas.Class69 = GameCanvas.Class26 - mGraphics.Class2(GameCanvas.Class58[0])) - mGraphics.Class2(GameCanvas.Class58[1]) + 100;
                }
                if (GameCanvas.Class44 == 16) {
                    if (GameCanvas.Class6) {
                        GameCanvas.Class70 = (GameCanvas.Class69 = GameCanvas.Class26 - mGraphics.Class2(GameCanvas.Class58[0])) - mGraphics.Class2(GameCanvas.Class58[1]) + 100;
                    }
                    else {
                        GameCanvas.Class70 = (GameCanvas.Class69 = GameCanvas.Class26 - mGraphics.Class2(GameCanvas.Class58[0]) - 40) - mGraphics.Class2(GameCanvas.Class58[1]) + 100;
                    }
                }
            }
            if (GameCanvas.Class44 >= 0 && GameCanvas.Class44 <= 1) {
                GameCanvas.Class71 = Class3("/bg/cl0.png");
                GameCanvas.Class72 = Class3("/bg/sun0.png");
            }
            else {
                GameCanvas.Class71 = null;
                GameCanvas.Class72 = null;
            }
            if (GameCanvas.Class44 == 2) {
                GameCanvas.Class71 = Class3("/bg/cl1.png");
                GameCanvas.Class72 = Class3("/bg/sun1.png");
            }
            if (GameCanvas.Class44 == 7 || GameCanvas.Class44 == 11 || GameCanvas.Class44 == 12) {
                if (TileMap.mapID == 20) {
                    GameCanvas.Class71 = null;
                }
                else {
                    GameCanvas.Class71 = Class3("/bg/cl0.png");
                }
            }
            if (class44 == 13 || class44 == 15) {
                GameCanvas.Class71 = Class3("/bg/cl2.png");
            }
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
        }
        GameCanvas.Class63 = false;
        if (!GameCanvas.Class1) {
            GameCanvas.Class63 = true;
            if (GameCanvas.Class58[0] != null && GameCanvas.Class58[1] != null && GameCanvas.Class58[2] != null) {
                GameCanvas.Class64 = GameScr.Class10 - (mGraphics.Class2(GameCanvas.Class58[0]) + mGraphics.Class2(GameCanvas.Class58[1]) + mGraphics.Class2(GameCanvas.Class58[2])) + 11;
            }
            if (GameCanvas.Class58[0] != null) {
                GameCanvas.Class65 = GameScr.Class10 - mGraphics.Class2(GameCanvas.Class58[0]);
            }
            if (GameCanvas.Class58[1] != null) {
                GameCanvas.Class66 = GameCanvas.Class65 - mGraphics.Class2(GameCanvas.Class58[1]);
            }
            if (GameCanvas.Class58[2] != null) {
                GameCanvas.Class67 = GameCanvas.Class66 - mGraphics.Class2(GameCanvas.Class58[2]);
            }
            if (GameCanvas.Class58[3] != null) {
                GameCanvas.Class68 = GameCanvas.Class66 - mGraphics.Class2(GameCanvas.Class58[3]) - 10;
            }
            if (GameCanvas.Class44 >= 2 && GameCanvas.Class44 <= 13) {
                int class45 = GameCanvas.Class69 = GameScr.Class10 - mGraphics.Class2(GameCanvas.Class58[0]);
                if (GameCanvas.Class58[1] != null) {
                    class45 = class45 - mGraphics.Class2(GameCanvas.Class58[1]) + n;
                }
                GameCanvas.Class70 = class45;
                if (GameCanvas.Class58[3] != null) {
                    class45 = class45 - mGraphics.Class2(GameCanvas.Class58[3]) + n3;
                }
                GameCanvas.Class68 = class45;
                GameCanvas.Class64 = class45;
                if (GameCanvas.Class58[2] != null) {
                    GameCanvas.Class67 = GameCanvas.Class70 - mGraphics.Class2(GameCanvas.Class58[2]) + n2;
                }
                if (GameCanvas.Class44 == 2) {
                    GameCanvas.Class64 = GameCanvas.Class26;
                }
            }
        }
        int n4;
        if (GameCanvas.Class44 >= 2 && GameCanvas.Class44 <= 12) {
            n4 = 2 * GameScr.Class10 / 3 - GameCanvas.Class70;
        }
        else {
            n4 = 2 * GameScr.Class10 / 3 - GameCanvas.Class66;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if (TileMap.mapID == 48 && TileMap.mapID == 51) {
            GameCanvas.Class69 += n4;
        }
        if (GameCanvas.Class44 >= 2 && GameCanvas.Class44 <= 6) {
            GameCanvas.Class70 += n4;
        }
        GameCanvas.Class64 += n4;
        GameCanvas.Class65 += n4;
        GameCanvas.Class66 += n4;
        GameCanvas.Class67 += n4;
        GameCanvas.Class68 += n4;
        GameCanvas.Class75 = 3 * GameScr.Class9 / 4;
        GameCanvas.Class76 = GameCanvas.Class64 / 3;
        GameCanvas.Class73 = new int[2];
        GameCanvas.Class74 = new int[2];
        GameCanvas.Class73[0] = GameScr.Class9 / 3;
        GameCanvas.Class74[0] = GameCanvas.Class64 / 2 - 8;
        GameCanvas.Class73[1] = 2 * GameScr.Class9 / 3;
        GameCanvas.Class74[1] = GameCanvas.Class64 / 2 + 8;
        if (GameCanvas.Class44 == 2) {
            GameCanvas.Class76 = GameCanvas.Class64 / 5;
            GameCanvas.Class73 = new int[5];
            GameCanvas.Class74 = new int[5];
            GameCanvas.Class73[0] = GameScr.Class9 / 3;
            GameCanvas.Class74[0] = GameCanvas.Class64 / 3 - 35;
            GameCanvas.Class73[1] = 3 * GameScr.Class9 / 4;
            GameCanvas.Class74[1] = GameCanvas.Class64 / 3 + 12;
            GameCanvas.Class73[2] = GameScr.Class9 / 3 - 15;
            GameCanvas.Class74[2] = GameCanvas.Class64 / 3 + 12;
            GameCanvas.Class73[3] = GameScr.Class9 / 15;
            GameCanvas.Class74[3] = GameCanvas.Class64 / 2 + 12;
            GameCanvas.Class73[4] = 2 * GameScr.Class9 / 3 + 25;
            GameCanvas.Class74[4] = GameCanvas.Class64 / 3 + 12;
        }
        if (!GameCanvas.Class1) {
            if (GameCanvas.Class44 == 8) {
                GameCanvas.Class69 = (GameCanvas.Class70 = GameScr.Class13 - 50);
            }
            if (GameCanvas.Class44 == 10 && GameCanvas.Class58[3] != null) {
                GameCanvas.Class68 = GameCanvas.Class67 - mGraphics.Class2(GameCanvas.Class58[3]);
            }
            if (GameCanvas.Class44 == 11 || GameCanvas.Class44 == 12) {
                GameCanvas.Class68 = 0;
            }
        }
    }
    
    protected final void Class3(final int class45) {
        GameCanvas.Class77 = System.currentTimeMillis();
        if ((class45 >= 48 && class45 <= 57) || (class45 >= 65 && class45 <= 122) || class45 == 10 || class45 == 8 || class45 == 13 || class45 == 32) {
            GameCanvas.Class45 = class45;
        }
        if (GameCanvas.Class34 != null) {
            GameCanvas.Class34.Class1(class45);
            GameCanvas.Class45 = 0;
            return;
        }
        GameCanvas.Class29.Class1(class45);
        switch (class45) {
            case 48: {
                GameCanvas.Class13[0] = true;
                GameCanvas.Class12[0] = true;
            }
            case 49: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2) {
                    GameCanvas.Class13[1] = true;
                    GameCanvas.Class12[1] = true;
                }
            }
            case 51: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2) {
                    GameCanvas.Class13[3] = true;
                    GameCanvas.Class12[3] = true;
                }
            }
            case 55: {
                GameCanvas.Class13[7] = true;
                GameCanvas.Class12[7] = true;
            }
            case 57: {
                GameCanvas.Class13[9] = true;
                GameCanvas.Class12[9] = true;
            }
            case 42: {
                GameCanvas.Class13[10] = true;
                GameCanvas.Class12[10] = true;
            }
            case 35: {
                GameCanvas.Class13[11] = true;
                GameCanvas.Class12[11] = true;
            }
            case -21:
            case -6: {
                GameCanvas.Class13[12] = true;
                GameCanvas.Class12[12] = true;
            }
            case -22:
            case -7: {
                GameCanvas.Class13[13] = true;
                GameCanvas.Class12[13] = true;
            }
            case -5:
            case 10: {
                if (GameCanvas.Class29 instanceof GameScr) {
                    Char.getMyChar();
                }
                GameCanvas.Class13[5] = true;
                GameCanvas.Class12[5] = true;
            }
            case -38:
            case -1: {
                if (GameCanvas.Class29 instanceof GameScr) {
                    Char.getMyChar();
                }
                GameCanvas.Class13[2] = true;
                GameCanvas.Class12[2] = true;
            }
            case -39:
            case -2: {
                if (GameCanvas.Class29 instanceof GameScr) {
                    Char.getMyChar();
                }
                GameCanvas.Class13[8] = true;
                GameCanvas.Class12[8] = true;
            }
            case -3: {
                if (GameCanvas.Class29 instanceof GameScr) {
                    Char.getMyChar();
                }
                GameCanvas.Class13[4] = true;
                GameCanvas.Class12[4] = true;
            }
            case -4: {
                if (GameCanvas.Class29 instanceof GameScr) {
                    Char.getMyChar();
                }
                GameCanvas.Class13[6] = true;
                GameCanvas.Class12[6] = true;
            }
            case 50: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2 && !GameScr.Class89) {
                    GameCanvas.Class13[2] = true;
                    GameCanvas.Class12[2] = true;
                }
            }
            case 52: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2 && !GameScr.Class89) {
                    GameCanvas.Class13[4] = true;
                    GameCanvas.Class12[4] = true;
                }
            }
            case 54: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2 && !GameScr.Class89) {
                    GameCanvas.Class13[6] = true;
                    GameCanvas.Class12[6] = true;
                }
            }
            case 56: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2 && !GameScr.Class89) {
                    GameCanvas.Class13[8] = true;
                    GameCanvas.Class12[8] = true;
                }
            }
            case 53: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2 && !GameScr.Class89) {
                    GameCanvas.Class13[5] = true;
                    GameCanvas.Class12[5] = true;
                    break;
                }
                break;
            }
        }
    }
    
    protected final void Class4(final int n) {
        GameCanvas.Class45 = 0;
        switch (n) {
            case 48: {
                GameCanvas.Class13[0] = false;
                GameCanvas.Class53[0] = true;
            }
            case 49: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2) {
                    GameCanvas.Class13[1] = false;
                    GameCanvas.Class53[1] = true;
                }
            }
            case 51: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2) {
                    GameCanvas.Class13[3] = false;
                    GameCanvas.Class53[3] = true;
                }
            }
            case 55: {
                GameCanvas.Class13[7] = false;
                GameCanvas.Class53[7] = true;
            }
            case 57: {
                GameCanvas.Class13[9] = false;
                GameCanvas.Class53[9] = true;
            }
            case 42: {
                GameCanvas.Class13[10] = false;
                GameCanvas.Class53[10] = true;
            }
            case 35: {
                GameCanvas.Class13[11] = false;
                GameCanvas.Class53[11] = true;
            }
            case -21:
            case -6: {
                GameCanvas.Class13[12] = false;
                GameCanvas.Class53[12] = true;
            }
            case -22:
            case -7: {
                GameCanvas.Class13[13] = false;
                GameCanvas.Class53[13] = true;
            }
            case -5:
            case 10: {
                GameCanvas.Class13[5] = false;
                GameCanvas.Class53[5] = true;
            }
            case -38:
            case -1: {
                GameCanvas.Class13[2] = false;
            }
            case -39:
            case -2: {
                GameCanvas.Class13[8] = false;
            }
            case -3: {
                GameCanvas.Class13[4] = false;
            }
            case -4: {
                GameCanvas.Class13[6] = false;
            }
            case 50: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2) {
                    GameCanvas.Class13[2] = false;
                    GameCanvas.Class53[2] = true;
                }
            }
            case 52: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2) {
                    GameCanvas.Class13[4] = false;
                    GameCanvas.Class53[4] = true;
                }
            }
            case 54: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2) {
                    GameCanvas.Class13[6] = false;
                    GameCanvas.Class53[6] = true;
                }
            }
            case 56: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2) {
                    GameCanvas.Class13[8] = false;
                    GameCanvas.Class53[8] = true;
                }
            }
            case 53: {
                if (GameCanvas.Class29 == GameScr.Class8 && GameCanvas.Class2 && !Game23.Class1().Class2) {
                    GameCanvas.Class13[5] = false;
                    GameCanvas.Class53[5] = true;
                    break;
                }
                break;
            }
        }
    }
    
    protected final void Class1(final int class17, final int class18) {
        if (Res.abs(class17 - GameCanvas.Class19) >= 10 || Res.abs(class18 - GameCanvas.Class20) >= 10) {
            GameCanvas.Class15 = false;
        }
        GameCanvas.Class17 = class17;
        GameCanvas.Class18 = class18;
        if (++GameCanvas.Class60 > 3) {
            GameCanvas.Class60 = 0;
        }
        GameCanvas.Class54[GameCanvas.Class60] = new Game65(class17, class18);
    }
    
    public static boolean Class6() {
        return System.currentTimeMillis() - GameCanvas.Class77 >= 800L;
    }
    
    protected final void setPopupSize(final int n, final int n2) {
        GameCanvas.Class14 = true;
        GameCanvas.Class15 = true;
        GameCanvas.Class77 = System.currentTimeMillis();
        GameCanvas.Class19 = n;
        GameCanvas.Class20 = n2;
        GameCanvas.Class17 = n;
        GameCanvas.Class18 = n2;
    }
    
    protected final void Class3(final int class17, final int class18) {
        GameCanvas.Class14 = false;
        GameCanvas.Class16 = true;
        mScreen.Class7 = -1;
        GameCanvas.Class17 = class17;
        GameCanvas.Class18 = class18;
    }
    
    public static boolean Class1(final int n, final int n2, final int n3, final int n4) {
        final int n5 = GameCanvas.Class17 + GameScr.Class16;
        final int n6 = GameScr.Class17 + GameCanvas.Class18;
        return (GameCanvas.Class14 || GameCanvas.Class16) && (n5 >= n && n5 <= n + n3 && n6 >= n2 && n6 <= n2 + n4);
    }
    
    public static boolean Class1(final int n, final int n2, final int n3, final int n4, final Game50 game50) {
        final int n5 = GameCanvas.Class17 + game50.Class1;
        final int n6 = game50.Class2 + GameCanvas.Class18;
        return (GameCanvas.Class14 || GameCanvas.Class16) && (n5 >= n && n5 <= n + n3 && n6 >= n2 && n6 <= n2 + n4);
    }
    
    public static boolean Class2(final int n, final int n2, final int n3, final int n4) {
        return (GameCanvas.Class14 || GameCanvas.Class16) && (GameCanvas.Class17 >= n && GameCanvas.Class17 <= n + n3 && GameCanvas.Class18 >= n2 && GameCanvas.Class18 <= n2 + n4);
    }
    
    public static void Class7() {
        for (int i = 0; i < 14; ++i) {
            GameCanvas.Class12[i] = false;
        }
        GameCanvas.Class16 = false;
    }
    
    public static void Class8() {
        for (int i = 0; i < 14; ++i) {
            GameCanvas.Class13[i] = false;
        }
    }
    
    protected final void Class1(final Graphics class1) {
        this.Class62.Class1 = class1;
        try {
            if (GameCanvas.Class29 != null && !GameCanvas.isLoading) {
                GameCanvas.Class29.Class1(this.Class62);
                this.Class62.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26);
            }
            this.Class62.Class1(-this.Class62.Class1(), -this.Class62.Class2());
            this.Class62.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26);
            final mGraphics class2 = this.Class62;
            String s = InfoDlg.Class2;
            if (TileMap.Class10 != null) {
                s = TileMap.Class10;
            }
            if (InfoDlg.Class1 && (!InfoDlg.Class5 || InfoDlg.Class4 <= 4990) && !GameScr.isPaintAlert) {
                Game25.Class1(GameCanvas.Class27 - 64, 10, 128, 40, class2);
                if (InfoDlg.Class5) {
                    Class1(GameCanvas.Class27 - mFont.Class17.Class1(s) / 2 - 10, 30, class2);
                    mFont.Class17.Class1(class2, s, GameCanvas.Class27 + 5, 23, 2);
                }
                else if (InfoDlg.Class3 != null) {
                    mFont.Class17.Class1(class2, s, GameCanvas.Class27, 18, 2);
                    mFont.number_red.Class1(class2, InfoDlg.Class3, GameCanvas.Class27, 32, 2);
                }
                else {
                    mFont.Class17.Class1(class2, s, GameCanvas.Class27, 23, 2);
                }
            }
            if (GameCanvas.Class34 != null) {
                GameCanvas.Class34.Class1(this.Class62);
            }
            else if (GameCanvas.Class30.Class1) {
                final Game100 class3 = GameCanvas.Class30;
                final mGraphics class4 = this.Class62;
                final Game100 game100 = class3;
                try {
                    final mGraphics mGraphics = class4;
                    mGraphics.Class1(-mGraphics.Class1(), -class4.Class2());
                    class4.Class1(-Game100.Class10, 0);
                    if (GameCanvas.Class6) {
                        for (int i = 0; i < game100.Class2.size(); ++i) {
                            if (i == game100.Class3) {
                                class4.Class1(Game100.Class14, game100.Class4 + i * game100.Class6 + 1, game100.Class8 + 1, 0);
                            }
                            else {
                                class4.Class1(Game100.Class13, game100.Class4 + i * game100.Class6 + 1, game100.Class8 + 1, 0);
                            }
                            String[] class5;
                            if ((class5 = ((Command)game100.Class2.elementAt(i)).Class2) == null) {
                                class5 = new String[] { ((Command)game100.Class2.elementAt(i)).Class1 };
                            }
                            final int n = game100.Class8 + (game100.Class7 - class5.length * 14) / 2 + 1;
                            for (int j = 0; j < class5.length; ++j) {
                                if (GameScr.Class88) {
                                    if (ChatManager.gI().Class4(class5[j])) {
                                        if (GameCanvas.gameTick % 10 > 5) {
                                            mFont.Class14.Class1(class4, class5[j], game100.Class4 + i * game100.Class6 + game100.Class6 / 2 - 2, n + j * 14, 2);
                                        }
                                        else {
                                            mFont.Class12.Class1(class4, class5[j], game100.Class4 + i * game100.Class6 + game100.Class6 / 2 - 2, n + j * 14, 2);
                                        }
                                    }
                                    else {
                                        mFont.Class12.Class1(class4, class5[j], game100.Class4 + i * game100.Class6 + game100.Class6 / 2 - 2, n + j * 14, 2);
                                    }
                                }
                                else {
                                    mFont.Class12.Class1(class4, class5[j], game100.Class4 + i * game100.Class6 + game100.Class6 / 2 - 2, n + j * 14, 2);
                                }
                            }
                        }
                    }
                    else {
                        for (int k = 0; k < game100.Class2.size(); ++k) {
                            if (k == game100.Class3) {
                                class4.Class1(Game100.Class14, game100.Class4 + k * game100.Class6 + 1, game100.Class8 + 1 - 23, 0);
                            }
                            else {
                                class4.Class1(Game100.Class13, game100.Class4 + k * game100.Class6 + 1, game100.Class8 + 1 - 23, 0);
                            }
                            String[] class6;
                            if ((class6 = ((Command)game100.Class2.elementAt(k)).Class2) == null) {
                                class6 = new String[] { ((Command)game100.Class2.elementAt(k)).Class1 };
                            }
                            final int n2 = game100.Class8 + (game100.Class7 - class6.length * 14) / 2 + 1 - 23;
                            for (int l = 0; l < class6.length; ++l) {
                                if (GameScr.Class88) {
                                    if (ChatManager.gI().Class4(class6[l])) {
                                        if (GameCanvas.gameTick % 10 > 5) {
                                            mFont.Class14.Class1(class4, class6[l], game100.Class4 + k * game100.Class6 + game100.Class6 / 2 - 2, n2 + l * 14, 2);
                                        }
                                        else {
                                            mFont.Class12.Class1(class4, class6[l], game100.Class4 + k * game100.Class6 + game100.Class6 / 2 - 2, n2 + l * 14, 2);
                                        }
                                    }
                                    else {
                                        mFont.Class12.Class1(class4, class6[l], game100.Class4 + k * game100.Class6 + game100.Class6 / 2 - 2, n2 + l * 14, 2);
                                    }
                                }
                                else {
                                    mFont.Class12.Class1(class4, class6[l], game100.Class4 + k * game100.Class6 + game100.Class6 / 2 - 2, n2 + l * 14, 2);
                                }
                            }
                        }
                    }
                    final mGraphics mGraphics2 = class4;
                    mGraphics2.Class1(-mGraphics2.Class1(), -class4.Class2());
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            GameScr.Class2(this.Class62);
            final mGraphics class7 = this.Class62;
            if (GameCanvas.Class49) {
                if (mFont.Class6.Class1(Game86.Class503) > GameCanvas.Class25 && --GameCanvas.Class86 < -440) {
                    GameCanvas.Class86 = GameCanvas.Class25;
                }
                class7.setColor(0);
                class7.fillRect(0, 0, GameCanvas.Class25, 16);
                mFont.Class6.Class1(class7, Game86.Class503, GameCanvas.Class86 + 20, 3, 0);
                class7.Class1(GameCanvas.Class51, 0, 0, 0);
            }
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
        }
    }
    
    public static void endDlg() {
        if (GameCanvas.inputDlg != null) {
            GameCanvas.inputDlg.tfInput.Class14 = 500;
        }
        if (GameCanvas.Class37 != null) {
            GameCanvas.Class37.Class1.Class14 = 500;
            GameCanvas.Class37.Class2.Class14 = 500;
        }
        GameCanvas.Class34 = null;
    }
    
    public static void setText(final String s) {
        GameCanvas.Class35.Class1(s, null, new Command(Game86.Class76, GameCanvas.instance, 8882, null), null);
        GameCanvas.Class34 = GameCanvas.Class35;
    }
    
    public static void Class2(final String s) {
        GameCanvas.Class35.Class1(s, null, new Command(Game86.Class108, GameCanvas.instance, 8882, null), null);
        GameCanvas.Class34 = GameCanvas.Class35;
        GameCanvas.Class35.Class1 = true;
    }
    
    public static void Class10() {
        Class2(Game86.Class25);
    }
    
    public static void startWaitDlgWithoutCancel() {
        GameCanvas.Class35.Class2 = 500;
        GameCanvas.Class35.Class1(Game86.Class25, null, null, null);
        GameCanvas.Class34 = GameCanvas.Class35;
        GameCanvas.Class35.Class1 = true;
    }
    
    public final void Class1(final String s, final String s2, final String s3, final String s4) {
        GameCanvas.Class35.Class1(s4, new Command(s, this, 8881, s3), null, new Command(s2, this, 8882, null));
        GameCanvas.Class34 = GameCanvas.Class35;
    }
    
    public final void Class1(final String s, final String s2, final short s3, final String s4, final String s5) {
        final MyVector myVector;
        (myVector = new MyVector()).addElement(s3);
        myVector.addElement(s4);
        GameCanvas.Class35.Class1(s5, new Command(s, this, 8883, myVector), null, new Command(s2, this, 8882, null));
        GameCanvas.Class34 = GameCanvas.Class35;
    }
    
    public static void Class1(final String s, final int n) {
        GameCanvas.Class35.Class1(s, null, new Command(Game86.Class76, GameCanvas.instance, n, null, GameCanvas.Class25 / 2 - 35, GameCanvas.Class26 - 50), null);
        GameCanvas.Class34 = GameCanvas.Class35;
    }
    
    public static void Class1(final String s, final int n, final Object o, final int i, final Object o2) {
        System.out.println("yeso no dilog ".concat(String.valueOf(i)));
        GameCanvas.Class35.Class1(s, new Command(Game86.Class60, GameCanvas.instance, n, o), new Command("", GameCanvas.instance, n, o), new Command(Game86.Class73, GameCanvas.instance, i, o2));
        GameCanvas.Class34 = GameCanvas.Class35;
    }
    
    public static void Class1(final String s, final Command command, final Command command2) {
        GameCanvas.Class35.Class1(s, command, null, command2);
        GameCanvas.Class34 = GameCanvas.Class35;
    }
    
    public static Image Class3(String string) {
        string = "/x" + mGraphics.Class2 + string;
        Image image = null;
        try {
            image = Image.createImage(string);
        }
        catch (IOException ex) {}
        return image;
    }
    
    public final boolean Class1(int n, final int n2, final int n3) {
        if (GameCanvas.Class1) {
            return false;
        }
        n = ((n != 1) ? 1 : 0);
        if (this.Class48[n] != -1) {
            return false;
        }
        this.Class48[n] = 0;
        this.Class46[n] = n2;
        this.Class47[n] = n3;
        return true;
    }
    
    private static void Class14() {
        if (GameCanvas.Class1) {
            return;
        }
        GameCanvas.Class82 = new Image[3];
        for (int i = 0; i < 3; ++i) {
            GameCanvas.Class82[i] = Class3("/e/w" + i + ".png");
        }
        GameCanvas.Class79 = new int[2];
        GameCanvas.Class80 = new int[2];
        (GameCanvas.Class81 = new int[2])[0] = (GameCanvas.Class81[1] = -1);
    }
    
    public static boolean Class4(final int n, final int n2) {
        if (GameCanvas.Class1) {
            return false;
        }
        final int n3 = (GameCanvas.Class81[0] != -1) ? 1 : 0;
        if (GameCanvas.Class81[n3] != -1) {
            return false;
        }
        GameCanvas.Class81[n3] = 0;
        GameCanvas.Class79[n3] = n;
        GameCanvas.Class80[n3] = n2;
        return true;
    }
    
    private void Class15() {
        if (GameCanvas.Class1) {
            return;
        }
        for (int i = 0; i < 2; ++i) {
            if (this.Class48[i] != -1) {
                final int[] class48 = this.Class48;
                final int n = i;
                ++class48[n];
                if (this.Class48[i] >= 5) {
                    this.Class48[i] = -1;
                }
                if (i == 0) {
                    final int[] class49 = this.Class46;
                    final int n2 = i;
                    --class49[n2];
                }
                else {
                    final int[] class50 = this.Class46;
                    final int n3 = i;
                    ++class50[n3];
                }
                final int[] class51 = this.Class47;
                final int n4 = i;
                --class51[n4];
            }
        }
    }
    
    public static boolean Class5(final int n, final int n2) {
        return n >= GameScr.Class16 && n <= GameScr.Class16 + GameScr.Class9 && n2 >= GameScr.Class17 && n2 <= GameScr.Class17 + GameScr.Class10 + 30;
    }
    
    public final void Class2(final mGraphics mGraphics) {
        if (GameCanvas.Class1) {
            return;
        }
        for (int i = 0; i < 2; ++i) {
            if (this.Class48[i] != -1 && Class5(this.Class46[i], this.Class47[i])) {
                mGraphics.Class1(GameCanvas.Class84[i][this.Class48[i]], this.Class46[i], this.Class47[i], 3);
            }
        }
    }
    
    public static void Class1(final int n6, final int n7, final mGraphics mGraphics) {
        mGraphics.Class1(GameCanvas.Class83, 0, GameCanvas.gameTick % 3 << 4, 16, 16, 0, n6, n7, 3);
    }
    
    public final void Class12() {
        GameCanvas.isLoading = false;
        this.Class85 = true;
    }
    
    public static boolean Class3(final int n, final int n2, final int n3, final int n4) {
        return (GameCanvas.Class14 || GameCanvas.Class16) && (GameCanvas.Class17 >= n && GameCanvas.Class17 <= n + n3 && GameCanvas.Class18 >= n2 && GameCanvas.Class18 <= n2 + n4);
    }
    
    public final void perform(int n, Object class2) {
        Label_2034: {
            switch (n) {
                case 8891: {
                    Service.gI().Class11(0);
                    GameCanvas.Class34 = null;
                }
                case 8881: {
                    Game20.Class2((String)class2);
                    GameCanvas.Class34 = null;
                }
                case 8882: {
                    GameCanvas.Class34 = null;
                }
                case 8883: {
                    Game20.Class1((String)((MyVector)class2).elementAt(0), (short)((MyVector)class2).elementAt(0));
                    GameCanvas.Class34 = null;
                }
                case 8884: {
                    endDlg();
                    GameCanvas.Class31.switchToMe();
                }
                case 8885: {
                    GameMidlet.Class6.notifyDestroyed();
                }
                case 8886: {
                    Class1(Game86.Class497, new Command(Game86.Class502, GameCanvas.instance, 8880, null), new Command(Game86.Class73, GameCanvas.instance, 8882, null));
                }
                case 8880: {
                    endDlg();
                    GameCanvas.Class33.switchToMe();
                }
                case 8887: {
                    endDlg();
                    final int intValue = (int)class2;
                    final Service gi = Service.gI();
                    Message message = null;
                    try {
                        (message = new Message((byte)80)).Class3.writeInt(intValue);
                        gi.temple.Class1(message);
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    finally {
                        message.Class2();
                    }
                    message.Class2();
                }
                case 8888: {
                    final int intValue2 = (int)class2;
                    final Service gi2 = Service.gI();
                    Message message2 = null;
                    try {
                        (message2 = new Message((byte)81)).Class3.writeInt(intValue2);
                        gi2.temple.Class1(message2);
                    }
                    catch (Exception ex2) {
                        ex2.printStackTrace();
                    }
                    finally {
                        message2.Class2();
                    }
                    message2.Class2();
                    endDlg();
                }
                case 8889: {
                    final String s = (String)class2;
                    endDlg();
                    final Service gi3 = Service.gI();
                    final String str = s;
                    final Service service = gi3;
                    Message message3 = null;
                    try {
                        (message3 = new Message((byte)24)).Class3.writeUTF(str);
                        service.temple.Class1(message3);
                    }
                    catch (Exception ex3) {
                        ex3.printStackTrace();
                    }
                    finally {
                        message3.Class2();
                    }
                    message3.Class2();
                }
                case 88810: {
                    final int intValue3 = (int)class2;
                    endDlg();
                    final Service gi4 = Service.gI();
                    Message message4 = null;
                    try {
                        (message4 = new Message((byte)44)).Class3.writeInt(intValue3);
                        gi4.temple.Class1(message4);
                    }
                    catch (Exception ex4) {
                        ex4.printStackTrace();
                    }
                    finally {
                        message4.Class2();
                    }
                    message4.Class2();
                }
                case 88811: {
                    endDlg();
                    final Service gi5 = Service.gI();
                    class2 = null;
                    try {
                        class2 = new Message((byte)56);
                        gi5.temple.Class1((Message)class2);
                    }
                    catch (Exception ex5) {
                        ex5.printStackTrace();
                    }
                    finally {
                        ((Message)class2).Class2();
                    }
                    ((Message)class2).Class2();
                }
                case 88812: {
                    final Char char1 = (Char)class2;
                    endDlg();
                    final Service gi6 = Service.gI();
                    final int charID = char1.charID;
                    final Service service2 = gi6;
                    Message message5 = null;
                    try {
                        (message5 = new Message((byte)66)).Class3.writeInt(charID);
                        service2.temple.Class1(message5);
                    }
                    catch (Exception ex6) {
                        ex6.printStackTrace();
                    }
                    finally {
                        message5.Class2();
                    }
                    message5.Class2();
                }
                case 88813: {
                    endDlg();
                    Service.gI().Class1((Item[])class2);
                }
                case 88814: {
                    final Item[] array = (Item[])class2;
                    endDlg();
                    Service.gI().Class2(array);
                }
                case 88815: {
                    GameScr.gI();
                    GameScr.Class33();
                }
                case 88816: {
                    final Service gi7 = Service.gI();
                    final String class3 = GameCanvas.Class37.Class1.Class9;
                    final String class4 = GameCanvas.Class37.Class2.Class9;
                    final String str2 = class3;
                    final Service service3 = gi7;
                    Message class5 = null;
                    try {
                        (class5 = Service.Class2((byte)(-99))).Class3.writeUTF(str2);
                        class5.Class3.writeUTF(class4);
                        service3.temple.Class1(class5);
                    }
                    catch (Exception ex7) {
                        ex7.printStackTrace();
                    }
                    finally {
                        class5.Class2();
                    }
                    class5.Class2();
                    endDlg();
                }
                case 88817: {
                    if (Char.getMyChar().npcFocus != null) {
                        Service.gI().menu((byte)0, Char.getMyChar().npcFocus.template.npcTemplateId, GameCanvas.Class30.Class3, 0);
                        return;
                    }
                    Service.gI().menu((byte)0, 0, GameCanvas.Class30.Class3, 0);
                }
                case 888181: {
                    final short shortValue = (short)class2;
                    final Service gi8 = Service.gI();
                    final String class6 = GameCanvas.inputDlg.tfInput.Class9;
                    final Service service4 = gi8;
                    Message message6 = null;
                    try {
                        (message6 = new Message((byte)118)).Class3.writeUTF(class6);
                        message6.Class3.writeShort(shortValue);
                        service4.temple.Class1(message6);
                    }
                    catch (Exception ex8) {
                        ex8.printStackTrace();
                    }
                    finally {
                        message6.Class2();
                    }
                    message6.Class2();
                    endDlg();
                }
                case 88818: {
                    Service.gI().Class1((short)class2, GameCanvas.inputDlg.tfInput.Class9);
                    endDlg();
                }
                case 88819: {
                    final short shortValue2 = (short)class2;
                    final Service gi9 = Service.gI();
                    Message message7 = null;
                    try {
                        (message7 = new Message((byte)34)).Class3.writeShort(shortValue2);
                        gi9.temple.Class1(message7);
                    }
                    catch (Exception ex9) {
                        ex9.printStackTrace();
                    }
                    finally {
                        message7.Class2();
                    }
                    message7.Class2();
                    GameScr.gI().Class34();
                }
                case 88820: {
                    final String[] array2 = (String[])class2;
                    if (Char.getMyChar().npcFocus == null) {
                        return;
                    }
                    final Integer n2 = new Integer(GameCanvas.Class30.Class3);
                    if (array2.length > 1) {
                        final MyVector myVector = new MyVector();
                        for (int i = 0; i < array2.length - 1; ++i) {
                            myVector.addElement(new Command(array2[i + 1], GameCanvas.instance, 88821, n2));
                        }
                        GameCanvas.Class30.Class1(myVector);
                        return;
                    }
                    ChatPopup.Class1("", 1, Char.getMyChar().npcFocus);
                    Service.gI().menu((byte)0, Char.getMyChar().npcFocus.template.npcTemplateId, n2, 0);
                }
                case 88821: {
                    final int intValue4 = (int)class2;
                    ChatPopup.Class1("", 1, Char.getMyChar().npcFocus);
                    Service.gI().menu((byte)0, Char.getMyChar().npcFocus.template.npcTemplateId, intValue4, GameCanvas.Class30.Class3);
                }
                case 88822: {
                    ChatPopup.Class1("", 1, Char.getMyChar().npcFocus);
                    Service.gI().menu((byte)0, Char.getMyChar().npcFocus.template.npcTemplateId, GameCanvas.Class30.Class3, 0);
                }
                case 88823: {
                    setText(Game86.Class149);
                }
                case 88824: {
                    setText(Game86.Class150);
                }
                case 88825: {
                    setText(Game86.Class437);
                }
                case 88826: {
                    setText(Game86.Class439);
                }
                case 88827: {
                    setText(Game86.Class438);
                }
                case 88828: {
                    setText(Game86.Class440);
                }
                case 88829: {
                    final String class7;
                    if ((class7 = GameCanvas.inputDlg.tfInput.Class9).equals("")) {
                        return;
                    }
                    final Service gi10 = Service.gI();
                    final String s2 = class7;
                    final int intValue5 = (int)class2;
                    final String str3 = s2;
                    final Service service5 = gi10;
                    Message class8 = null;
                    try {
                        (class8 = Service.Class2((byte)(-97))).Class3.writeInt(intValue5);
                        class8.Class3.writeUTF(str3);
                        service5.temple.Class1(class8);
                    }
                    catch (Exception ex10) {
                        ex10.printStackTrace();
                    }
                    finally {
                        class8.Class2();
                    }
                    class8.Class2();
                    Class2(Game86.Class25);
                }
                case 88830: {
                    final int intValue6 = (int)class2;
                    endDlg();
                    final Service gi11 = Service.gI();
                    Message class9 = null;
                    try {
                        (class9 = Service.Class3((byte)(-62))).Class3.writeInt(intValue6);
                        gi11.temple.Class1(class9);
                    }
                    catch (Exception ex11) {
                        ex11.printStackTrace();
                    }
                    finally {
                        class9.Class2();
                    }
                    class9.Class2();
                }
                case 88831: {
                    final int intValue7 = (int)class2;
                    endDlg();
                    final Service gi12 = Service.gI();
                    Message class10 = null;
                    try {
                        (class10 = Service.Class3((byte)(-60))).Class3.writeInt(intValue7);
                        gi12.temple.Class1(class10);
                    }
                    catch (Exception ex12) {
                        ex12.printStackTrace();
                    }
                    finally {
                        class10.Class2();
                    }
                    class10.Class2();
                }
                case 88832: {
                    final String class11 = GameCanvas.inputDlg.tfInput.Class9;
                    endDlg();
                    if (!class11.equals("")) {
                        final Service gi13 = Service.gI();
                        final String str4 = class11;
                        final Service service6 = gi13;
                        Message class12 = null;
                        try {
                            (class12 = Service.Class2((byte)(-95))).Class3.writeUTF(str4);
                            service6.temple.Class1(class12);
                        }
                        catch (Exception ex13) {
                            ex13.printStackTrace();
                        }
                        finally {
                            class12.Class2();
                        }
                        class12.Class2();
                        return;
                    }
                    break;
                }
                case 88833: {
                    final String class13 = GameCanvas.inputDlg.tfInput.Class9;
                    endDlg();
                    if (!class13.equals("")) {
                        try {
                            final int int1 = Integer.parseInt(class13);
                            if (Char.getMyChar().xu < int1 || int1 < 0) {
                                InfoMe.addInfo(Game86.Class441, 20, mFont.Class12);
                                return;
                            }
                            final Service gi14 = Service.gI();
                            Message class14 = null;
                            try {
                                (class14 = Service.Class2((byte)(-90))).Class3.writeInt(int1);
                                gi14.temple.Class1(class14);
                            }
                            catch (Exception ex14) {
                                ex14.printStackTrace();
                            }
                            finally {
                                class14.Class2();
                            }
                            class14.Class2();
                            return;
                        }
                        catch (Exception ex25) {
                            return;
                        }
                        break Label_2034;
                    }
                    break;
                }
                case 88834: {
                    final String class15 = GameCanvas.inputDlg.tfInput.Class9;
                    endDlg();
                    if (!class15.equals("")) {
                        try {
                            final int int2;
                            if ((int2 = Integer.parseInt(class15)) <= 0) {
                                return;
                            }
                            final Service gi15 = Service.gI();
                            Message class16 = null;
                            try {
                                (class16 = Service.Class2((byte)(-89))).Class3.writeInt(int2);
                                gi15.temple.Class1(class16);
                            }
                            catch (Exception ex15) {
                                ex15.printStackTrace();
                            }
                            finally {
                                class16.Class2();
                            }
                            class16.Class2();
                            return;
                        }
                        catch (Exception ex26) {
                            return;
                        }
                        break Label_2034;
                    }
                    break;
                }
                case 88835: {
                    final int int3 = Integer.parseInt((String)class2);
                    n = Integer.parseInt(GameCanvas.inputDlg.tfInput.Class9);
                    GameCanvas.Class34 = null;
                    if (n <= 0 || n >= Char.getMyChar().arrItemBag[int3].quantity) {
                        setText(Game86.Class442);
                        return;
                    }
                    final Service gi16 = Service.gI();
                    final int v = n;
                    final Service service7 = gi16;
                    Message class17 = null;
                    try {
                        (class17 = Service.Class2((byte)(-85))).Class3.writeByte(int3);
                        class17.Class3.writeInt(v);
                        service7.temple.Class1(class17);
                    }
                    catch (Exception ex16) {
                        ex16.printStackTrace();
                    }
                    finally {
                        class17.Class2();
                    }
                    class17.Class2();
                }
                case 88836: {
                    GameCanvas.inputDlg.tfInput.Class14 = 6;
                    GameCanvas.inputDlg.show(Game86.Class415, new Command(Game86.Class107, GameCanvas.instance, 888361, null), 1);
                }
                case 888361: {
                    final String class18 = GameCanvas.inputDlg.tfInput.Class9;
                    endDlg();
                    if (class18.length() < 6 || class18.equals("")) {
                        setText(Game86.Class409);
                        return;
                    }
                    try {
                        final Service gi17 = Service.gI();
                        final int int4 = Integer.parseInt(class18);
                        final Service service8 = gi17;
                        Message class19 = null;
                        try {
                            (class19 = Service.Class2((byte)(-105))).Class3.writeInt(int4);
                            service8.temple.Class1(class19);
                        }
                        catch (Exception ex17) {
                            ex17.printStackTrace();
                        }
                        finally {
                            class19.Class2();
                        }
                        class19.Class2();
                        return;
                    }
                    catch (Exception ex27) {
                        setText(Game86.Class410);
                        return;
                    }
                }
                case 88837: {
                    final String class20 = GameCanvas.inputDlg.tfInput.Class9;
                    endDlg();
                    try {
                        final Service gi18 = Service.gI();
                        final int int5 = Integer.parseInt(class20.trim());
                        final Service service9 = gi18;
                        Message class21 = null;
                        try {
                            (class21 = Service.Class2((byte)(-103))).Class3.writeInt(int5);
                            service9.temple.Class1(class21);
                        }
                        catch (Exception ex18) {
                            ex18.printStackTrace();
                        }
                        finally {
                            class21.Class2();
                        }
                        class21.Class2();
                    }
                    catch (Exception ex28) {}
                }
                case 88838: {
                    final String trim = GameCanvas.Class37.Class1.Class9.trim();
                    final String trim2 = GameCanvas.Class37.Class2.Class9.trim();
                    endDlg();
                    if (trim.length() < 6 || trim2.length() < 6) {
                        setText(Game86.Class409);
                        return;
                    }
                    try {
                        final int int6 = Integer.parseInt(trim);
                        n = Integer.parseInt(trim2);
                        if (int6 < 99999 || n < 99999) {
                            setText(Game86.Class411);
                            return;
                        }
                        final Service gi19 = Service.gI();
                        final int v2 = n;
                        final Service service10 = gi19;
                        Message class22 = null;
                        try {
                            (class22 = Service.Class2((byte)(-104))).Class3.writeInt(int6);
                            class22.Class3.writeInt(v2);
                            service10.temple.Class1(class22);
                        }
                        catch (Exception ex19) {
                            ex19.printStackTrace();
                        }
                        finally {
                            class22.Class2();
                        }
                        class22.Class2();
                        return;
                    }
                    catch (Exception ex29) {
                        setText(Game86.Class410);
                        return;
                    }
                }
                case 88839: {
                    final String class23 = GameCanvas.inputDlg.tfInput.Class9;
                    endDlg();
                    try {
                        Integer.parseInt(class23);
                        Class1(Game86.Class444, 888391, class23, 8882, null);
                    }
                    catch (Exception ex30) {
                        InfoMe.addInfo(Game86.Class412, 20, mFont.Class12);
                    }
                }
                case 888391: {
                    try {
                        endDlg();
                        n = Integer.parseInt((String)class2);
                        final Service gi20 = Service.gI();
                        final int v3 = n;
                        final Service service11 = gi20;
                        Message class24 = null;
                        try {
                            (class24 = Service.Class2((byte)(-102))).Class3.writeInt(v3);
                            service11.temple.Class1(class24);
                        }
                        catch (Exception ex20) {
                            ex20.printStackTrace();
                        }
                        finally {
                            class24.Class2();
                        }
                        class24.Class2();
                    }
                    catch (Exception ex31) {}
                }
                case 88840: {
                    final Char char2 = (Char)class2;
                    endDlg();
                    final Service gi21 = Service.gI();
                    final int charID2 = char2.charID;
                    final Service service12 = gi21;
                    Message message8 = null;
                    try {
                        (message8 = new Message((byte)99)).Class3.writeInt(charID2);
                        service12.temple.Class1(message8);
                    }
                    catch (Exception ex21) {
                        ex21.printStackTrace();
                    }
                    finally {
                        message8.Class2();
                    }
                    message8.Class2();
                }
                case 88841: {
                    final Char char3 = (Char)class2;
                    endDlg();
                    final Service gi22 = Service.gI();
                    final int charID3 = char3.charID;
                    final Service service13 = gi22;
                    Message message9 = null;
                    try {
                        (message9 = new Message((byte)106)).Class3.writeInt(charID3);
                        service13.temple.Class1(message9);
                    }
                    catch (Exception ex22) {
                        ex22.printStackTrace();
                    }
                    finally {
                        message9.Class2();
                    }
                    message9.Class2();
                }
                case 88842: {
                    final Service gi23 = Service.gI();
                    class2 = null;
                    try {
                        class2 = Service.Class2((byte)(-68));
                        gi23.temple.Class1((Message)class2);
                    }
                    catch (Exception ex23) {
                        ex23.printStackTrace();
                    }
                    finally {
                        ((Message)class2).Class2();
                    }
                    ((Message)class2).Class2();
                }
                case 88843: {
                    final String class25 = GameCanvas.inputDlg.tfInput.Class9;
                    endDlg();
                    if (class25.equals("")) {
                        setText(Game86.Class443);
                        return;
                    }
                    final Service gi24 = Service.gI();
                    final String str5 = class25;
                    final Service service14 = gi24;
                    Message class26 = null;
                    try {
                        (class26 = Service.Class2((byte)(-61))).Class3.writeByte(GameScr.indexSelect);
                        class26.Class3.writeUTF(str5);
                        service14.temple.Class1(class26);
                    }
                    catch (Exception ex24) {
                        ex24.printStackTrace();
                    }
                    finally {
                        class26.Class2();
                    }
                    class26.Class2();
                }
                case 8890: {
                    endDlg();
                    Service.gI().Class11((int)class2);
                }
                case 1608: {
                    Service.gI().Class1(GameCanvas.Class37.Class1.Class9, GameCanvas.Class37.Class2.Class9, (byte)0);
                    endDlg();
                }
                case 16081: {
                    Service.gI().Class1(GameCanvas.Class37.Class1.Class9, GameCanvas.Class37.Class2.Class9, (byte)1);
                    endDlg();
                }
                case 1700: {
                    Service.gI().Class1((short)100, GameCanvas.inputDlg.tfInput.Class9, GameScr.Class168);
                    endDlg();
                    break;
                }
            }
        }
    }
    
    public static void GM(final int game1) {
        startWaitDlgWithoutCancel();
        new Thread(new GM(game1)).start();
    }
}
