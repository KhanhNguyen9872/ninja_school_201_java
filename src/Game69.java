import main.GameCanvas;
import main.GameMidlet;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game69 extends mScreen implements IActionListener
{
    private int Class12;
    private int Class13;
    private int Class14;
    private int Class15;
    private int Class16;
    private static String[] Class17;
    public static String Class8;
    public static String Class9;
    public static String Class10;
    public static String Class11;
    private static Command Class18;
    private static Command Class19;
    private static Command Class20;
    private static Command Class21;
    private static Command Class22;
    private static Command[][] Class23;
    private static int Class24;
    
    static {
        Game69.Class10 = "";
        Game69.Class11 = "";
        Game69.Class18 = null;
        Game69.Class19 = null;
        Game69.Class20 = null;
        Game69.Class21 = null;
        Game69.Class22 = null;
        Game69.Class23 = null;
    }
    
    public Game69() {
        this.Class16 = -1;
    }
    
    public static void Class6() {
        if ((Game69.Class24 = TaskOrder.Class3("indServer")) < 0 || Game69.Class24 > GameMidlet.Class11.length - 1) {
            Class2(GameMidlet.Class4());
            return;
        }
        Class2(Game69.Class24);
    }
    
    public static void Class2(int class24) {
        if (Session_ME.gI().connecting) {
            Session_ME.gI().Class2();
        }
        class24 = (Game69.Class24 = class24);
        TaskOrder.Class1("indServer", class24);
        GameMidlet.Class3 = GameMidlet.Class12[Game69.Class24];
        GameMidlet.Class2 = GameMidlet.Class13[Game69.Class24];
        GameMidlet.Class7 = GameMidlet.Class14[Game69.Class24];
        Game86.Class1(GameMidlet.Class15[Game69.Class24]);
        GameCanvas.Class30.Class3 = GameMidlet.Class16[Game69.Class24];
        GameCanvas.Class1(7);
    }
    
    public final void switchToMe() {
        if (TaskOrder.Class3("isKiemduyet") == 0) {
            GameCanvas.Class49 = true;
        }
        else {
            GameCanvas.Class49 = false;
        }
        GameScr.Class10 = GameCanvas.Class26;
        if (GameCanvas.Class44 == 2) {
            GameCanvas.Class2(0);
        }
        else {
            GameCanvas.Class2(TileMap.Class13);
        }
        super.switchToMe();
        if (GameScr.Class8 != null) {
            GameScr.Class8 = null;
        }
        if ((TileMap.Class13 = (byte)(System.currentTimeMillis() % 9L)) == 5 || TileMap.Class13 == 6) {
            TileMap.Class13 = 4;
        }
        GameScr.Class1(true);
        GameScr.Class16 = 100;
        this.Class12 = 170;
        this.Class13 = 175;
        if (GameCanvas.Class25 == 128 || GameCanvas.Class26 <= 208) {
            this.Class12 = 126;
            this.Class13 = 160;
        }
        this.Class14 = GameCanvas.Class25 / 2 - this.Class12 / 2;
        this.Class15 = GameCanvas.Class26 / 2 - this.Class13 / 2;
        if (GameCanvas.Class26 <= 250) {
            this.Class15 -= 10;
        }
        super.right = new Command(Game86.Class74, GameCanvas.instance, 8885, null);
        super.left = new Command(Game86.Class30, GameCanvas.instance, 8886, null);
        this.Class16 = -1;
        if (!GameCanvas.Class6) {
            this.Class16 = 0;
        }
        if (GameCanvas.Class6 && GameCanvas.Class25 >= 320) {
            super.right.Class6 = GameCanvas.Class25 / 2 + 88;
        }
        if (Game69.Class18 == null) {
            Game69.Class18 = new Command(GameCanvas.Class6 ? "" : Game86.Class76, this, 1000, null);
            Game69.Class19 = new Command(GameCanvas.Class6 ? "" : Game86.Class76, this, 1001, null);
            Game69.Class21 = new Command(GameCanvas.Class6 ? "" : Game86.Class76, this, 1002, null);
            Game69.Class20 = new Command(GameCanvas.Class6 ? "" : Game86.Class76, this, 1003, null);
            Game69.Class22 = new Command(GameCanvas.Class6 ? "" : Game86.Class76, this, 20100, null);
            Game69.Class23 = new Command[][] { { Game69.Class18, Game69.Class19, Game69.Class21, Game69.Class22 }, { Game69.Class20, Game69.Class18, Game69.Class19, Game69.Class21, Game69.Class22 } };
        }
        Game69.Class8 = TaskOrder.Class2("acc");
        Game69.Class9 = TaskOrder.Class2("pass");
        if (Game69.Class8 == null) {
            Game69.Class8 = "";
        }
        if (Game69.Class9 == null) {
            Game69.Class9 = "";
        }
        if ((Game69.Class8 == null || Game69.Class8.equals("")) && Game69.Class10.equals("")) {
            Game69.Class17 = new String[] { Game86.Class498, Game86.Class500, Game86.Class501, Game86.Class506 };
        }
        else {
            Game69.Class17 = new String[] { Game86.Class499, Game86.Class498, Game86.Class500, Game86.Class501, Game86.Class506 };
        }
        GameCanvas.Class30.Class3 = GameMidlet.Class4();
        GameMidlet.Class3 = GameMidlet.Class12[GameMidlet.Class4()];
        if (TaskOrder.Class3("indServer") >= 0 && TaskOrder.Class3("indServer") < GameMidlet.Class12.length) {
            GameCanvas.Class30.Class3 = TaskOrder.Class3("indServer");
            GameMidlet.Class3 = GameMidlet.Class12[TaskOrder.Class3("indServer")];
        }
        if (TaskOrder.Class2("random") == null) {
            TaskOrder.Class1("random", Class8());
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        mGraphics.setColor(0);
        mGraphics.fillRect(0, 0, GameCanvas.Class25, GameCanvas.Class26);
        GameCanvas.Class1(mGraphics);
        mGraphics.Class1(Game83.Class8, GameCanvas.Class27 - Game83.Class8.getWidth() / 2, this.Class15 + 10 - Game83.Class8.getHeight() / 2, 0);
        if (!GameCanvas.Class6 && GameCanvas.Class30.Class3 == -1) {
            GameCanvas.Class30.Class3 = 0;
        }
        final int n = this.Class15 + 50;
        for (int i = 0; i < Game69.Class17.length; ++i) {
            mGraphics.setColor(Game25.Class3);
            mGraphics.fillRect(this.Class14 + 10, n + i * 35, this.Class12 - 20, 28);
            Game25.Class2(this.Class14 + 10, n + i * 35, this.Class12 - 20, 28, mGraphics);
            if (i == this.Class16) {
                mGraphics.setColor(Game25.Class2);
                mGraphics.fillRect(this.Class14 + 10, n + i * 35, this.Class12 - 20, 28);
                Game25.Class2(this.Class14 + 10, n + i * 35, this.Class12 - 20, 28, mGraphics);
            }
            if (i < Game69.Class17.length) {
                if (Game69.Class8.equals("") && Game69.Class10.equals("")) {
                    if (i == 2) {
                        mFont.Class7.Class1(mGraphics, String.valueOf(Game69.Class17[i]) + GameMidlet.Class11[TaskOrder.Class3("indServer")], this.Class14 + this.Class12 / 2, n + i * 35 + 8, 2);
                    }
                    else {
                        mFont.Class7.Class1(mGraphics, Game69.Class17[i], this.Class14 + this.Class12 / 2, n + i * 35 + 8, 2);
                    }
                }
                else if (i == 0) {
                    mFont.Class7.Class1(mGraphics, String.valueOf(Game69.Class17[i]) + (Game69.Class10.equals("") ? (Game69.Class8.startsWith("tmpusr") ? "" : (": " + Game69.Class8)) : (": " + Game69.Class10)), this.Class14 + this.Class12 / 2, n + i * 35 + 8, 2);
                }
                else if (i == 3) {
                    mFont.Class7.Class1(mGraphics, String.valueOf(Game69.Class17[i]) + GameMidlet.Class11[TaskOrder.Class3("indServer")], this.Class14 + this.Class12 / 2, n + i * 35 + 8, 2);
                }
                else {
                    mFont.Class7.Class1(mGraphics, Game69.Class17[i], this.Class14 + this.Class12 / 2, n + i * 35 + 8, 2);
                }
            }
        }
        if (GameCanvas.Class34 == null) {
            Game25.Class1(mGraphics, super.left, super.center, super.right);
        }
        super.Class1(mGraphics);
    }
    
    public final void Class4() {
        if (Game69.Class8.equals("") && Game69.Class10.equals("")) {
            if (this.Class16 >= 0 && this.Class16 < Game69.Class23[0].length) {
                super.center = Game69.Class23[0][this.Class16];
            }
        }
        else if (this.Class16 >= 0 && this.Class16 < Game69.Class23[1].length) {
            super.center = Game69.Class23[1][this.Class16];
        }
        if (++GameScr.Class16 > GameCanvas.Class25 * 3 + 100) {
            GameScr.Class16 = 100;
        }
        super.Class4();
    }
    
    public final void Class5() {
        if (GameCanvas.Class12[2] || GameCanvas.Class12[4]) {
            --this.Class16;
            if (this.Class16 < 0) {
                this.Class16 = Game69.Class17.length - 1;
            }
        }
        else if (GameCanvas.Class12[8] || GameCanvas.Class12[6]) {
            ++this.Class16;
            if (this.Class16 > Game69.Class17.length - 1) {
                this.Class16 = 0;
            }
        }
        if (GameCanvas.Class16 && GameCanvas.Class2(this.Class14 + 10, this.Class15 + 45, this.Class12 - 10, 170)) {
            if (GameCanvas.Class15) {
                this.Class16 = (GameCanvas.Class18 - (this.Class15 + 45)) / 35;
            }
            if (Game69.Class8.equals("") && Game69.Class10.equals("")) {
                if (this.Class16 >= 0 && this.Class16 < Game69.Class23[0].length) {
                    Game69.Class23[0][this.Class16].Class1();
                }
            }
            else if (this.Class16 >= 0 && this.Class16 < Game69.Class23[1].length) {
                Game69.Class23[1][this.Class16].Class1();
            }
        }
        super.Class5();
        GameCanvas.Class7();
    }
    
    private static void endDlg() {
        if (!Session_ME.gI().connecting) {
            GameCanvas.Class1(5);
        }
        GameCanvas.Class10();
    }
    
    public static boolean Class7() {
        return Game69.Class8 != null && (Game69.Class8.startsWith("tmpusr") || Game69.Class8.equals(""));
    }
    
    public static String Class8() {
        String string = "";
        for (int i = 0; i < 12; ++i) {
            string = String.valueOf(string) + Integer.toString(Res.Class2(0, 9));
        }
        return string;
    }
    
    public final void perform(int n, final Object o) {
        switch (n) {
            case 1000: {
                if (Class7() && !Game69.Class8.equals("")) {
                    GameCanvas.Class1(Game86.Class497, new Command(Game86.Class499, this, 10001, null), new Command(Game86.Class73, GameCanvas.instance, 8882, null));
                    return;
                }
                endDlg();
                Service.gI().Class1("-1", "12345", "2.0.1");
            }
            case 10001: {
                endDlg();
                Service.gI().Class1("-1", "12345", "2.0.1");
                if (!Game69.Class10.equals("")) {
                    Game69.Class8 = Game69.Class10;
                    Game69.Class9 = Game69.Class11;
                    Game69.Class10 = "";
                    Game69.Class11 = "";
                    TaskOrder.Class1("acc", Game69.Class8);
                    TaskOrder.Class1("pass", Game69.Class9);
                    return;
                }
                break;
            }
            case 1001: {
                if (Class7() && !Game69.Class8.equals("") && Game69.Class10.equals("")) {
                    GameCanvas.Class1(Game86.Class497, new Command(Game86.Class502, this, 10004, null), new Command(Game86.Class73, GameCanvas.instance, 8882, null));
                    return;
                }
                GameCanvas.Class32.switchToMe();
            }
            case 10004: {
                GameCanvas.Class34 = null;
                GameCanvas.Class32.switchToMe();
            }
            case 100041: {}
            case 1002: {
                final MyVector myVector = new MyVector();
                if (GameMidlet.Class8) {
                    for (int i = GameMidlet.Class5() + 1; i <= GameMidlet.Class15.length - 1; ++i) {
                        myVector.addElement(new Command(GameMidlet.Class11[i], this, i + 20000, null));
                    }
                }
                else {
                    for (int j = 0; j <= GameMidlet.Class5(); ++j) {
                        myVector.addElement(new Command(GameMidlet.Class11[j], this, j + 20000, null));
                    }
                }
                GameCanvas.Class30.Class1(myVector);
                if (TaskOrder.Class3("indServer") != -1) {
                    GameCanvas.Class30.Class3 = GameMidlet.Class16[TaskOrder.Class3("indServer")];
                }
            }
            case 1003: {
                endDlg();
                if (!Game69.Class10.equals("")) {
                    Game69.Class8 = Game69.Class10;
                    Game69.Class9 = Game69.Class11;
                    Game69.Class10 = "";
                    Game69.Class11 = "";
                    TaskOrder.Class1("acc", Game69.Class8);
                    TaskOrder.Class1("pass", Game69.Class9);
                }
                Service.gI().Class1(Game69.Class8, Game69.Class9, "2.0.1");
            }
            case 20000:
            case 20001:
            case 20002:
            case 20003:
            case 20004:
            case 20005:
            case 20006:
            case 20007:
            case 20008:
            case 20009:
            case 20010:
            case 20011:
            case 20012:
            case 20013:
            case 20014:
            case 20015:
            case 20016:
            case 20017:
            case 20018:
            case 20019: {
                if (Session_ME.gI().connecting) {
                    Session_ME.gI().Class2();
                }
                final int n2 = n - 20000;
                GameCanvas.Class30.Class1 = false;
                GameMidlet.Class3 = GameMidlet.Class12[n2];
                GameMidlet.Class2 = GameMidlet.Class13[n2];
                GameMidlet.Class7 = GameMidlet.Class14[n2];
                n = n2;
                TaskOrder.Class1("indServer", n);
                GameCanvas.Class30.Class3 = GameMidlet.Class16[n2];
                GameCanvas.Class1(6);
            }
            case 20100: {
                GameCanvas.Class10();
                GameMidlet.Class2();
                GameCanvas.endDlg();
                break;
            }
        }
    }
}
