import javax.microedition.lcdui.Image;
import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game85 extends Game108 implements IActionListener
{
    private String[] Class6;
    public TField Class1;
    public TField Class2;
    private int Class7;
    private int Class8;
    private int Class9;
    private int Class10;
    
    public Game85() {
        new Command("", 1000, null);
        this.Class1 = new TField();
        this.Class2 = new TField();
    }
    
    public final void Class1(final String class7, final String class8) {
        this.Class10 = ((mFont.Class17.Class1(class7) > mFont.Class17.Class1(class8)) ? mFont.Class17.Class1(class7) : mFont.Class17.Class1(class8));
        this.Class7 = 40;
        this.Class8 = 0;
        if (GameCanvas.Class25 <= 176) {
            this.Class7 = 10;
        }
        this.Class1.Class1 = this.Class7 + this.Class10 + 10;
        this.Class1.Class2 = GameCanvas.Class26 - 2 * mScreen.Class4 - 50;
        this.Class1.Class3 = GameCanvas.Class25 - 2 * this.Class7 - this.Class10 - 20;
        this.Class1.Class4 = mScreen.Class4 + 2;
        this.Class1.Class5 = true;
        this.Class1.Class7 = class7;
        this.Class2.Class1 = this.Class7 + this.Class10 + 10;
        this.Class2.Class2 = GameCanvas.Class26 - mScreen.Class4 - 43;
        this.Class2.Class3 = GameCanvas.Class25 - 2 * this.Class7 - this.Class10 - 20;
        this.Class2.Class4 = mScreen.Class4 + 2;
        this.Class2.Class7 = class8;
        super.Class5 = this.Class1.Class23;
    }
    
    public final void Class1(final String s, final Command class3, final Command class4, final int class5, final int class6) {
        this.Class1.setText("");
        this.Class1.Class18 = class5;
        this.Class2.setText("");
        this.Class2.Class18 = class6;
        this.Class6 = mFont.Class17.Class2(s, GameCanvas.Class25 - this.Class7 * 3);
        this.Class9 = mFont.Class17.Class1(s, GameCanvas.Class25 - this.Class7 * 3).size();
        super.Class3 = class3;
        super.Class4 = class4;
        GameCanvas.Class34 = this;
    }
    
    public final void Class1(final mGraphics mGraphics) {
        final Game25 class38 = GameCanvas.Class38;
        Game25.Class1(mGraphics, this.Class7, GameCanvas.Class26 - 85 - mScreen.Class6 - this.Class9 * 13, GameCanvas.Class25 - (this.Class7 << 1), 80 + this.Class9 * 13, this.Class6, null);
        mFont.Class17.Class1(mGraphics, String.valueOf(this.Class1.Class7) + ": ", this.Class1.Class1 - this.Class10 - 5, this.Class1.Class2 + 5, 0);
        this.Class1.Class1(mGraphics);
        mGraphics.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26);
        mFont.Class17.Class1(mGraphics, String.valueOf(this.Class2.Class7) + ": ", this.Class2.Class1 - this.Class10 - 5, this.Class2.Class2 + 5, 0);
        this.Class2.Class1(mGraphics);
        super.Class1(mGraphics);
    }
    
    public final void Class1(final int n) {
        if (this.Class8 == 0) {
            this.Class1.Class1(n);
        }
        else {
            this.Class2.Class1(n);
        }
        super.Class1(n);
    }
    
    public final void Class2() {
        if (GameCanvas.Class12[2]) {
            this.Class8 = 0;
        }
        if (GameCanvas.Class12[8]) {
            this.Class8 = 1;
        }
        if (this.Class8 == 0) {
            this.Class1.Class5 = true;
            this.Class2.Class5 = false;
            super.Class5 = this.Class1.Class23;
            this.Class1.Class3();
        }
        else {
            this.Class1.Class5 = false;
            this.Class2.Class5 = true;
            super.Class5 = this.Class2.Class23;
            this.Class2.Class3();
        }
        if (GameCanvas.Class6 && GameCanvas.Class16 && GameCanvas.Class15) {
            if (GameCanvas.Class2(this.Class1.Class1, this.Class1.Class2, this.Class1.Class3, this.Class1.Class4)) {
                this.Class8 = 0;
            }
            if (GameCanvas.Class2(this.Class2.Class1, this.Class2.Class2, this.Class2.Class3, this.Class2.Class4)) {
                this.Class8 = 1;
            }
        }
        if (super.Class3 != null) {
            super.Class3.Class6 = GameCanvas.Class25 / 2 - 160;
            super.Class3.Class7 = GameCanvas.Class26 - 26;
        }
        if (super.Class4 != null) {
            super.Class4.Class6 = GameCanvas.Class25 / 2 - 35;
            super.Class4.Class7 = GameCanvas.Class26 - 26;
        }
        if (super.Class5 != null) {
            super.Class5.Class6 = GameCanvas.Class25 / 2 + 88;
            super.Class5.Class7 = GameCanvas.Class26 - 26;
        }
        super.Class2();
    }
    
    public final void perform(final int n, final Object o) {
    }
}
