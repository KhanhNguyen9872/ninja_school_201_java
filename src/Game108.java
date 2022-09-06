import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class Game108
{
    Command Class3;
    Command Class4;
    Command Class5;
    
    public void Class1(final mGraphics mGraphics) {
        mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        mGraphics.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26);
        Game25.Class1(mGraphics);
        Game25.Class1(mGraphics, this.Class3, this.Class4, this.Class5);
    }
    
    public void Class1(final int n) {
        switch (n) {
            case -38:
            case -1: {
                GameCanvas.Class13[2] = true;
                GameCanvas.Class12[2] = true;
            }
            case -39:
            case -2: {
                GameCanvas.Class13[8] = true;
                GameCanvas.Class12[8] = true;
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
                GameCanvas.Class13[5] = true;
                GameCanvas.Class12[5] = true;
            }
            default: {}
        }
    }
    
    public void Class2() {
        if (this.Class4 != null && (GameCanvas.Class12[5] || mScreen.Class1(this.Class4))) {
            GameCanvas.Class12[5] = false;
            GameCanvas.Class15 = false;
            mScreen.Class7 = -1;
            GameCanvas.Class16 = false;
            if (this.Class4 != null) {
                this.Class4.Class1();
            }
            mScreen.Class7 = -1;
        }
        if (this.Class3 != null && (GameCanvas.Class12[12] || mScreen.Class1(this.Class3))) {
            GameCanvas.Class12[12] = false;
            GameCanvas.Class15 = false;
            mScreen.Class7 = -1;
            GameCanvas.Class16 = false;
            if (this.Class3 != null) {
                this.Class3.Class1();
            }
            mScreen.Class7 = -1;
        }
        if (this.Class5 != null && (GameCanvas.Class12[13] || mScreen.Class1(this.Class5))) {
            GameCanvas.Class12[13] = false;
            GameCanvas.Class15 = false;
            GameCanvas.Class16 = false;
            mScreen.Class7 = -1;
            if (this.Class5 != null) {
                this.Class5.Class1();
            }
            mScreen.Class7 = -1;
        }
        GameCanvas.Class7();
        GameCanvas.Class8();
    }
}
