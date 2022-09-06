import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game35 extends mScreen implements IActionListener
{
    private static Game35 Class8;
    private static TField Class9;
    private static int Class10;
    private static int Class11;
    private static int Class12;
    private static int[][] Class13;
    private static int[] Class14;
    private static int[] Class15;
    private Command Class16;
    private Command Class17;
    private int Class18;
    
    static {
        Game35.Class13 = new int[][] { { 11, 26, 27, 28 }, { 2, 23, 24, 25 } };
        Game35.Class14 = new int[] { 9, 0 };
        Game35.Class15 = new int[] { 10, 1 };
    }
    
    public static Game35 Class6() {
        if (Game35.Class8 == null) {
            Game35.Class8 = new Game35();
        }
        return Game35.Class8;
    }
    
    public Game35() {
        this.Class18 = 0;
        if (GameCanvas.Class25 == 128) {
            GameScr.setPopupSize(128, 120);
            GameScr.Class157 = (GameCanvas.Class25 - 128) / 2;
            GameScr.Class156 = 0;
        }
        else {
            GameScr.setPopupSize(170, 190);
            GameScr.Class157 = (GameCanvas.Class25 - 170) / 2;
            GameScr.Class156 = (GameCanvas.Class26 - 220) / 2;
        }
        Game35.Class10 = 1;
        (Game35.Class9 = new TField()).Class22 = Game86.Class131;
        Game35.Class9.Class3 = 100;
        Game35.Class9.Class1 = GameScr.Class157 + 45;
        Game35.Class9.Class1 = GameScr.Class157 + GameScr.Class158 / 2 - Game35.Class9.Class3 / 2;
        Game35.Class9.Class2 = GameScr.Class156 + 62;
        if (GameCanvas.Class25 == 128) {
            Game35.Class9.Class3 = 60;
        }
        Game35.Class9.Class4 = 26;
        Game35.Class9.Class5 = true;
        Game35.Class9.Class18 = 0;
        Game35.Class10 = 1;
        Game35.Class11 = 0;
        super.center = new Command(Game86.Class130, this, 8000, null);
        super.left = new Command(Game86.Class135, this, 8001, null);
        this.Class16 = new Command("", this, 8002, null, GameScr.Class157 + GameScr.Class158 / 2 - mScreen.Class5 / 2, GameScr.Class156 + 70 + 30);
        this.Class17 = new Command("", this, 8003, null, GameScr.Class157 + GameScr.Class158 / 2 - mScreen.Class5 / 2, GameScr.Class156 + 70 + 70);
        super.right = Game35.Class9.Class23;
    }
    
    public final void switchToMe() {
        Game35.Class10 = GameCanvas.gameTick % 2;
        Game35.Class11 = GameCanvas.gameTick % 4;
        super.switchToMe();
    }
    
    public final void Class1(final int n) {
        Game35.Class9.Class1(n);
    }
    
    public final void Class4() {
        if (++GameScr.Class16 > GameCanvas.Class25 * 3 + 100) {
            GameScr.Class16 = 100;
        }
        if (GameCanvas.Class6 && GameCanvas.Class25 >= 320) {
            if (super.left != null) {
                super.left.Class6 = GameCanvas.Class25 / 2 - 160;
                super.left.Class7 = GameCanvas.Class26 - 26;
            }
            if (super.center != null) {
                super.center.Class6 = GameCanvas.Class25 / 2 - 35;
                super.center.Class7 = GameCanvas.Class26 - 26;
            }
            if (super.right != null) {
                super.right.Class6 = GameCanvas.Class25 / 2 + 88;
                super.right.Class7 = GameCanvas.Class26 - 26;
            }
        }
        if (this.Class17 != null) {
            this.Class17.Class3();
        }
        if (this.Class16 != null) {
            this.Class16.Class3();
        }
    }
    
    public final void Class5() {
        if (GameCanvas.Class12[2] && --Game35.Class12 < 0) {
            Game35.Class12 = Game86.Class253.length - 1;
        }
        if (GameCanvas.Class12[8] && ++Game35.Class12 >= Game86.Class253.length) {
            Game35.Class12 = 0;
        }
        if (Game35.Class12 == 0) {
            super.right = Game35.Class9.Class23;
            Game35.Class9.Class3();
        }
        if (Game35.Class12 == 1) {
            if (GameCanvas.Class12[4] && --Game35.Class10 < 0) {
                Game35.Class10 = Game86.Class254.length - 1;
            }
            if (GameCanvas.Class12[6] && ++Game35.Class10 > Game86.Class254.length - 1) {
                Game35.Class10 = 0;
            }
            super.right = null;
        }
        if (Game35.Class12 == 2) {
            if (GameCanvas.Class12[4] && --Game35.Class11 < 0) {
                Game35.Class11 = Game86.Class162[0].length - 1;
            }
            if (GameCanvas.Class12[6] && ++Game35.Class11 > Game86.Class162[0].length - 1) {
                Game35.Class11 = 0;
            }
        }
        if (GameCanvas.Class16 && GameCanvas.Class2(GameScr.Class157 + 5, GameScr.Class156 + 65, GameScr.Class158 - 5, mScreen.Class4)) {
            Game35.Class12 = 0;
        }
        super.Class5();
        GameCanvas.Class8();
        GameCanvas.Class7();
    }
    
    public final void Class1(final mGraphics mGraphics) {
        int i = 0;
        try {
            GameCanvas.Class1(mGraphics);
            i = 1;
            Game25.Class1(GameScr.Class157, GameScr.Class156, GameScr.Class158, GameScr.Class159, mGraphics);
            int n = 40;
            if (GameCanvas.Class25 == 128) {
                n = 20;
            }
            i = 2;
            final int n2 = Game35.Class13[Game35.Class10][Game35.Class11];
            final int n3 = Game35.Class14[Game35.Class10];
            final int n4 = Game35.Class15[Game35.Class10];
            i = 3;
            final Game99 game99 = GameScr.Class28[n2];
            final Game99 game100 = GameScr.Class28[n3];
            final Game99 game101 = GameScr.Class28[n4];
            final int n5 = GameCanvas.Class25 / 2;
            final int n6 = GameScr.Class156 + 50;
            i = 4;
            Game2.Class1(mGraphics, game100.Class1[Char.Class127[0][1][0]].Class1, n5 + Char.Class127[0][1][1] + game100.Class1[Char.Class127[0][1][0]].Class2, n6 - Char.Class127[0][1][2] + game100.Class1[Char.Class127[0][1][0]].Class3, 0, 0);
            Game2.Class1(mGraphics, game101.Class1[Char.Class127[0][2][0]].Class1, n5 + Char.Class127[0][2][1] + game101.Class1[Char.Class127[0][2][0]].Class2, n6 - Char.Class127[0][2][2] + game101.Class1[Char.Class127[0][2][0]].Class3, 0, 0);
            Game2.Class1(mGraphics, game99.Class1[Char.Class127[0][0][0]].Class1, n5 + Char.Class127[0][0][1] + game99.Class1[Char.Class127[0][0][0]].Class2, n6 - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3, 0, 0);
            i = 5;
            if (!GameCanvas.Class6) {
                for (int j = 0; j < Game86.Class253.length; ++j) {
                    if (Game35.Class12 == j) {
                        final int n7 = (j > 0) ? -5 : 0;
                        Game2.Class1(mGraphics, 989, GameScr.Class157 + 10 + ((GameCanvas.gameTick % 7 > 3) ? 1 : 0), GameScr.Class156 + 76 + j * n + n7, 2, Game62.Class7);
                        Game2.Class1(mGraphics, 989, GameScr.Class157 + GameScr.Class158 - 15 - ((GameCanvas.gameTick % 7 > 3) ? 1 : 0), GameScr.Class156 + 76 + j * n + n7, 0, Game62.Class7);
                    }
                }
            }
            i = 7;
            if (GameCanvas.Class6) {
                this.Class16.Class1 = Game86.Class254[Game35.Class10];
                this.Class16.Class1(mGraphics);
                this.Class17.Class1 = Game86.Class162[Game35.Class10][Game35.Class11];
                this.Class17.Class1(mGraphics);
            }
            else {
                Game25.Class2(this.Class16.Class6, this.Class16.Class7, this.Class16.Class8, this.Class16.Class9, mGraphics);
                if (Game35.Class12 == 1) {
                    mGraphics.setColor(Game25.Class2);
                    mGraphics.fillRect(this.Class16.Class6, this.Class16.Class7, this.Class16.Class8, this.Class16.Class9);
                    Game25.Class2(this.Class16.Class6, this.Class16.Class7, this.Class16.Class8, this.Class16.Class9, mGraphics);
                }
                Game25.Class2(this.Class17.Class6, this.Class17.Class7, this.Class17.Class8, this.Class17.Class9, mGraphics);
                if (Game35.Class12 == 2) {
                    mGraphics.setColor(Game25.Class2);
                    mGraphics.fillRect(this.Class17.Class6, this.Class17.Class7, this.Class17.Class8, this.Class17.Class9);
                    Game25.Class2(this.Class17.Class6, this.Class17.Class7, this.Class17.Class8, this.Class17.Class9, mGraphics);
                }
                mFont.Class7.Class1(mGraphics, Game86.Class254[Game35.Class10], GameScr.Class157 + 85, GameScr.Class156 + 66 + n, 2);
                mFont.Class7.Class1(mGraphics, Game86.Class162[Game35.Class10][Game35.Class11], GameScr.Class157 + 85, GameScr.Class156 + 66 + (n << 1), 2);
            }
            Game35.Class9.Class1 = GameScr.Class157 + GameScr.Class158 / 2 - Game35.Class9.Class3 / 2;
            Game35.Class9.Class2 = GameScr.Class156 + 62;
            Game35.Class9.Class8 = Game86.Class131;
            Game35.Class9.Class1(mGraphics);
            super.Class1(mGraphics);
            mGraphics.setColor(0);
        }
        catch (Exception ex) {
            System.out.println("CreateCharScr.paint(): ".concat(String.valueOf(i)));
            ex.printStackTrace();
        }
    }
    
    public final void perform(int n2, final Object o) {
        switch (n) {
            case 8000: {
                final Service gi = Service.gI();
                final String class9 = Game35.Class9.Class9;
                final int class10 = Game35.Class10;
                final int v = Game35.Class13[Game35.Class10][Game35.Class11];
                final int v2 = class10;
                final String str = class9;
                n2 = (int)gi;
                final Message message = new Message((byte)(-28));
                try {
                    message.Class3.writeByte(-125);
                    message.Class3.writeUTF(str);
                    message.Class3.writeByte(v2);
                    message.Class3.writeByte(v);
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                ((Service)n2).temple.Class1(message);
            }
            case 8001: {
                if (Game119.Class6().Class17) {
                    GameCanvas.Class31.switchToMe();
                    return;
                }
                Game119.Class6().switchToMe();
            }
            case 8002: {
                this.Class18 = 1;
                Game35.Class12 = 1;
                if (this.Class18 == Game35.Class12 && --Game35.Class10 < 0) {
                    Game35.Class10 = Game86.Class254.length - 1;
                    return;
                }
                break;
            }
            case 8003: {
                this.Class18 = 2;
                Game35.Class12 = 2;
                if (this.Class18 == Game35.Class12 && ++Game35.Class11 > Game86.Class162[0].length - 1) {
                    Game35.Class11 = 0;
                    break;
                }
                break;
            }
        }
    }
}
