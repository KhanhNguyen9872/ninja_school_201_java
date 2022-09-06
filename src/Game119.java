import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game119 extends mScreen implements IActionListener
{
    private static Game119 Class18;
    private int Class19;
    private int Class20;
    private int Class21;
    private int Class22;
    private int Class23;
    public int Class8;
    public int[] Class9;
    public int[] Class10;
    public int[] Class11;
    public int[] Class12;
    public int[] Class13;
    public String[] Class14;
    public String[] Class15;
    public byte[] Class16;
    private Command Class24;
    private int Class25;
    public boolean Class17;
    private int Class26;
    private int Class27;
    
    public static Game119 Class6() {
        if (Game119.Class18 == null) {
            Game119.Class18 = new Game119();
        }
        return Game119.Class18;
    }
    
    public Game119() {
        this.Class17 = true;
        final int class26 = GameCanvas.Class26;
        final int class27 = GameCanvas.Class26;
        this.Class19 = 48;
        this.Class20 = 85;
        if (GameCanvas.Class25 < 160) {
            this.Class19 = 32;
        }
        this.Class21 = 7;
        this.Class22 = (GameCanvas.Class25 - 3 * this.Class19 >> 1) - 5;
        this.Class23 = GameCanvas.Class28 - (this.Class20 >> 1) + 10;
        if (GameCanvas.Class6 && GameCanvas.Class25 > 200) {
            this.Class19 = 74;
            this.Class21 = 25;
            this.Class20 = 110;
            this.Class22 = (GameCanvas.Class25 - 3 * this.Class19 >> 1) - 20;
            this.Class23 = GameCanvas.Class28 - (this.Class20 >> 1);
            if (GameCanvas.Class25 < 320) {
                this.Class21 = 6;
                this.Class22 = (GameCanvas.Class25 - 3 * this.Class19 >> 1) - 6;
            }
        }
        super.left = null;
        this.Class24 = new Command(Game86.Class119, this, 1000, null);
        super.center = new Command("", this, 1000, null);
        super.right = new Command(Game86.Class74, this, 1001, null);
        super.left = this.Class24;
        if (GameCanvas.Class6) {
            super.center = null;
            super.left = null;
        }
        if (GameCanvas.Class6 && GameCanvas.Class25 >= 320) {
            super.right.Class6 = GameCanvas.Class25 / 2 + 88;
            super.right.Class7 = GameCanvas.Class26 - 26;
        }
    }
    
    private void Class7() {
        if (this.Class14[this.Class8] != null) {
            final Service gi = Service.gI();
            final String str = this.Class14[this.Class8];
            final Service service = gi;
            final Message message = new Message((byte)(-28));
            try {
                message.Class3.writeByte(-126);
                message.Class3.writeUTF(str);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            service.temple.Class1(message);
            GameCanvas.Class2(Game86.Class25);
            GameCanvas.isLoading = true;
            return;
        }
        Game35.Class6().switchToMe();
    }
    
    public final void Class5() {
        super.Class5();
        if (GameCanvas.Class12[6]) {
            ++this.Class8;
            if (this.Class8 >= 3) {
                this.Class8 = 0;
            }
        }
        if (GameCanvas.Class12[4]) {
            --this.Class8;
            if (this.Class8 < 0) {
                this.Class8 = 2;
            }
        }
        if (GameCanvas.Class14 && GameCanvas.Class2(this.Class22, this.Class23, 3 * (this.Class19 + this.Class21), this.Class20)) {
            int class8;
            if ((class8 = (GameCanvas.Class17 - this.Class22) / (this.Class19 + this.Class21)) > 2) {
                class8 = 2;
            }
            if (class8 < 0) {
                class8 = 0;
            }
            this.Class8 = class8;
        }
        if (GameCanvas.Class16) {
            if (GameCanvas.Class2(this.Class22, this.Class23, 3 * (this.Class19 + this.Class21), this.Class20)) {
                this.Class25 = 5;
            }
            else {
                this.Class8 = -1;
            }
        }
        GameCanvas.Class8();
        GameCanvas.Class7();
    }
    
    public final void Class4() {
        if (++GameScr.Class16 > GameCanvas.Class25 * 3 + 100) {
            GameScr.Class16 = 100;
        }
        if (this.Class25 > 0) {
            --this.Class25;
            if (this.Class25 == 0 && this.Class8 >= 0) {
                this.Class7();
            }
        }
    }
    
    public final void switchToMe() {
        TileMap.Class3();
        System.gc();
        super.switchToMe();
        for (int i = 0; i < this.Class14.length; ++i) {
            if (this.Class14[i] != null) {
                this.Class17 = false;
                break;
            }
        }
        if (this.Class17) {
            Game35.Class6().switchToMe();
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        GameCanvas.Class1(mGraphics);
        for (int i = 0; i < 3; ++i) {
            if (this.Class8 == i) {
                Game25.Class4(this.Class22 + i * (this.Class19 + this.Class21), this.Class23, this.Class19, this.Class20, mGraphics);
            }
            else {
                Game25.Class3(this.Class22 + i * (this.Class19 + this.Class21), this.Class23, this.Class19, this.Class20, mGraphics);
            }
            Game25.Class2(this.Class22 + i * (this.Class19 + this.Class21), this.Class23, this.Class19, this.Class20, mGraphics);
        }
        for (int j = 0; j < 3; ++j) {
            if (this.Class14[j] != null) {
                Game99 game99 = GameScr.Class28[this.Class9[j]];
                final Game99 game100 = GameScr.Class28[this.Class10[j]];
                final Game99 game101 = GameScr.Class28[this.Class11[j]];
                final Game99 game102 = GameScr.Class28[this.Class12[j]];
                if (game99.Class1 == null || game99.Class1.length < 8) {
                    Char.getMyChar();
                    game99 = Char.Class2(this.Class16[j]);
                }
                else {
                    for (int k = 0; k < game99.Class1.length; ++k) {
                        if (game99.Class1[k] == null || !Game2.Class1(game99.Class1[k].Class1)) {
                            Char.getMyChar();
                            game99 = Char.Class2(this.Class16[j]);
                            break;
                        }
                    }
                }
                final int n = this.Class22 + j * (this.Class19 + this.Class21) + this.Class19 / 2;
                if (!GameCanvas.Class6) {
                    final int n2 = this.Class23 + this.Class20 / 2 + 16;
                    Game2.Class1(mGraphics, game102.Class1[Char.Class127[0][3][0]].Class1, n + Char.Class127[0][3][1] + game102.Class1[Char.Class127[0][3][0]].Class2, n2 - Char.Class127[0][3][2] + game102.Class1[Char.Class127[0][3][0]].Class3, 0, 0);
                    Game2.Class1(mGraphics, game100.Class1[Char.Class127[0][1][0]].Class1, n + Char.Class127[0][1][1] + game100.Class1[Char.Class127[0][1][0]].Class2, n2 - Char.Class127[0][1][2] + game100.Class1[Char.Class127[0][1][0]].Class3, 0, 0);
                    Game2.Class1(mGraphics, game101.Class1[Char.Class127[0][2][0]].Class1, n + Char.Class127[0][2][1] + game101.Class1[Char.Class127[0][2][0]].Class2, n2 - Char.Class127[0][2][2] + game101.Class1[Char.Class127[0][2][0]].Class3, 0, 0);
                    Game2.Class1(mGraphics, game99.Class1[Char.Class127[0][0][0]].Class1, n + Char.Class127[0][0][1] + game99.Class1[Char.Class127[0][0][0]].Class2, n2 - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3, 0, 0);
                    if (this.Class8 == j) {
                        mFont.Class17.Class1(mGraphics, String.valueOf(Game86.Class355[0]) + ": " + this.Class14[j], GameCanvas.Class27, this.Class23 - 45, 2);
                        mFont.Class7.drawString(mGraphics, String.valueOf(Game86.Class355[1]) + ": " + this.Class13[j], GameCanvas.Class27, this.Class23 - 28, 2, mFont.Class4);
                        mFont.Class7.drawString(mGraphics, this.Class15[j], GameCanvas.Class27, this.Class23 - 16, 2, mFont.Class4);
                    }
                }
                else {
                    final int n3 = this.Class23 + this.Class20 / 2 - 5;
                    Game2.Class1(mGraphics, game102.Class1[Char.Class127[0][3][0]].Class1, n + Char.Class127[0][3][1] + game102.Class1[Char.Class127[0][3][0]].Class2, n3 - Char.Class127[0][3][2] + game102.Class1[Char.Class127[0][3][0]].Class3, 0, 0);
                    Game2.Class1(mGraphics, game100.Class1[Char.Class127[0][1][0]].Class1, n + Char.Class127[0][1][1] + game100.Class1[Char.Class127[0][1][0]].Class2, n3 - Char.Class127[0][1][2] + game100.Class1[Char.Class127[0][1][0]].Class3, 0, 0);
                    Game2.Class1(mGraphics, game101.Class1[Char.Class127[0][2][0]].Class1, n + Char.Class127[0][2][1] + game101.Class1[Char.Class127[0][2][0]].Class2, n3 - Char.Class127[0][2][2] + game101.Class1[Char.Class127[0][2][0]].Class3, 0, 0);
                    Game2.Class1(mGraphics, game99.Class1[Char.Class127[0][0][0]].Class1, n + Char.Class127[0][0][1] + game99.Class1[Char.Class127[0][0][0]].Class2, n3 - Char.Class127[0][0][2] + game99.Class1[Char.Class127[0][0][0]].Class3, 0, 0);
                    mFont.Class17.Class1(mGraphics, this.Class14[j], n, this.Class23 + this.Class20 / 2 + 5, 2);
                    mFont.Class7.Class1(mGraphics, String.valueOf(Game86.Class355[1]) + ": " + this.Class13[j], n, this.Class23 + this.Class20 / 2 + 22, 2);
                    if (GameCanvas.Class25 > 200) {
                        mFont.Class7.Class1(mGraphics, this.Class15[j], n, this.Class23 + this.Class20 / 2 + 34, 2);
                    }
                }
            }
        }
        super.Class1(mGraphics);
    }
    
    public final void perform(final int n, final Object o) {
        switch (n) {
            case 1000: {
                this.Class7();
            }
            case 1001: {
                Session_ME.gI().Class2();
                GameCanvas.instance.Class12();
                break;
            }
        }
    }
}
