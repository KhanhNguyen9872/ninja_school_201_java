import main.GameCanvas;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Command
{
    public String Class1;
    public String[] Class2;
    public IActionListener Class3;
    public int Class4;
    private Image Class12;
    private Image Class13;
    public Image Class5;
    public int Class6;
    public int Class7;
    public int Class8;
    public int Class9;
    public boolean Class10;
    public Object Class11;
    
    public Command(final String class1, final IActionListener class2, final int class3, final Object class4, final int class5, final int class6) {
        this.Class6 = 0;
        this.Class7 = 0;
        this.Class8 = mScreen.Class5;
        this.Class9 = mScreen.Class6;
        this.Class10 = false;
        this.Class1 = class1;
        this.Class4 = class3;
        this.Class3 = class2;
        this.Class11 = class4;
        this.Class6 = class5;
        this.Class7 = class6;
        this.Class8 = mScreen.Class5;
        this.Class9 = mScreen.Class6;
    }
    
    public Command(final String class1, final IActionListener class2, final int class3, final Object class4) {
        this.Class6 = 0;
        this.Class7 = 0;
        this.Class8 = mScreen.Class5;
        this.Class9 = mScreen.Class6;
        this.Class10 = false;
        this.Class1 = class1;
        this.Class4 = class3;
        this.Class3 = class2;
        this.Class11 = class4;
    }
    
    public Command(final String class1, final int class2, final Object class3) {
        this.Class6 = 0;
        this.Class7 = 0;
        this.Class8 = mScreen.Class5;
        this.Class9 = mScreen.Class6;
        this.Class10 = false;
        this.Class1 = class1;
        this.Class4 = class2;
        this.Class11 = class3;
    }
    
    public Command(final String class1, final int class2) {
        this.Class6 = 0;
        this.Class7 = 0;
        this.Class8 = mScreen.Class5;
        this.Class9 = mScreen.Class6;
        this.Class10 = false;
        this.Class1 = class1;
        this.Class4 = class2;
    }
    
    public Command(final String class1, final int class2, final int class3) {
        this.Class6 = 0;
        this.Class7 = 0;
        this.Class8 = mScreen.Class5;
        this.Class9 = mScreen.Class6;
        this.Class10 = false;
        this.Class1 = class1;
        this.Class4 = 0;
        this.Class6 = class2;
        this.Class7 = class3;
    }
    
    public final void Class1() {
        if (this.Class4 > 0) {
            if (this.Class3 != null) {
                this.Class3.perform(this.Class4, this.Class11);
                return;
            }
            GameScr.gI().Class2(this.Class4, this.Class11);
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        if (this.Class5 != null) {
            mGraphics.Class1(this.Class5, this.Class6 + mGraphics.Class1(this.Class5) / 2, this.Class7 + mGraphics.Class2(this.Class5) / 2, 3);
            return;
        }
        if (this.Class1 != "") {
            if (!this.Class10) {
                mGraphics.Class1(GameScr.Class128, this.Class6, this.Class7, 0);
            }
            else {
                mGraphics.Class1(GameScr.Class129, this.Class6, this.Class7, 0);
            }
        }
        mFont.Class6.Class1(mGraphics, this.Class1, this.Class6 + 36, this.Class7 + 6, 2);
    }
    
    public final boolean Class2() {
        this.Class10 = false;
        if (GameCanvas.Class2(this.Class6 - 3, this.Class7 - 3, this.Class8 + 6, this.Class9 + 6)) {
            if (GameCanvas.Class14) {
                this.Class10 = true;
            }
            if (GameCanvas.Class16 && GameCanvas.Class15) {
                return true;
            }
        }
        return false;
    }
    
    public final void Class3() {
        if (this.Class6 > 0 && this.Class7 > 0 && this.Class2()) {
            this.Class1();
            GameCanvas.Class14 = false;
            this.Class10 = false;
        }
    }
}
