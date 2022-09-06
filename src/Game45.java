import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game45 extends Game108
{
    private String[] Class6;
    public boolean Class1;
    public int Class2;
    private int Class7;
    private int Class8;
    
    public Game45() {
        this.Class8 = 30;
        if (GameCanvas.Class25 <= 176) {
            this.Class8 = 10;
        }
    }
    
    public final void switchToMe() {
        this.Class1(Game86.Class25, null, null, null);
        GameCanvas.Class34 = this;
    }
    
    public final void Class1(final String s, final Command class3, final Command class4, final Command class5) {
        this.Class6 = mFont.Class17.Class2(s, GameCanvas.Class25 - ((this.Class8 << 1) + 40));
        super.Class3 = class3;
        super.Class4 = class4;
        super.Class5 = class5;
        if (class4 != null) {
            super.Class4.Class6 = GameCanvas.Class25 / 2 - 35;
            super.Class4.Class7 = GameCanvas.Class26 - 26;
            if (class3 != null) {
                super.Class3.Class6 = GameCanvas.Class25 / 2 - 115;
                super.Class3.Class7 = GameCanvas.Class26 - 26;
            }
            if (class5 != null) {
                super.Class5.Class6 = GameCanvas.Class25 / 2 + 45;
                super.Class5.Class7 = GameCanvas.Class26 - 26;
            }
        }
        else {
            if (class3 != null) {
                super.Class3.Class6 = GameCanvas.Class25 / 2 - 80;
                super.Class3.Class7 = GameCanvas.Class26 - 26;
            }
            if (class5 != null) {
                super.Class5.Class6 = GameCanvas.Class25 / 2 + 10;
                super.Class5.Class7 = GameCanvas.Class26 - 26;
            }
        }
        this.Class1 = false;
        this.Class7 = 80;
        if (this.Class6.length >= 5) {
            this.Class7 = this.Class6.length * mFont.Class17.Class1 + 20;
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        final int n = GameCanvas.Class26 - this.Class7 - 38;
        Game25.Class1(this.Class8, n, GameCanvas.Class25 - (this.Class8 << 1), this.Class7, mGraphics);
        int n2 = n + (this.Class7 - this.Class6.length * mFont.Class17.Class1) / 2 - 2;
        if (this.Class1) {
            n2 += 8;
            GameCanvas.Class1(GameCanvas.Class27, n2 - 12, mGraphics);
        }
        for (int i = 0; i < this.Class6.length; ++i, n2 += mFont.Class17.Class1) {
            mFont.Class17.Class1(mGraphics, this.Class6[i], GameCanvas.Class27, n2, 2);
        }
        super.Class1(mGraphics);
    }
    
    public final void Class2() {
        if (this.Class2 > 0) {
            --this.Class2;
            if (this.Class2 == 1) {
                GameCanvas.endDlg();
                this.Class2 = 0;
            }
        }
        super.Class2();
    }
}
