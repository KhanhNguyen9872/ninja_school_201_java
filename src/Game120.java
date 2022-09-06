// 
// Decompiled by Procyon v0.5.36
// 

public final class Game120
{
    private int Class2;
    private int Class3;
    public int Class1;
    private int Class4;
    private int Class5;
    
    public Game120(final int class2, final int class3, final int class4) {
        this.Class1 = 0;
        this.Class5 = 0;
        this.Class2 = class2;
        this.Class3 = class3;
        this.Class4 = class4;
    }
    
    public final void Class1() {
        if (this.Class4 == 1) {
            ++this.Class5;
            if (this.Class5 % 2 == 0) {
                ++this.Class1;
            }
        }
        else {
            if (this.Class4 == 0) {
                ++this.Class1;
                return;
            }
            if (this.Class4 == 2 || this.Class4 == 3 || this.Class4 == 4 || this.Class4 == 5) {
                ++this.Class5;
                if (this.Class5 % 2 == 0) {
                    ++this.Class1;
                }
            }
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        if (this.Class4 == 0) {
            mGraphics.Class1(GameScr.Class130, 0, this.Class1 * 3, 3, 3, 0, this.Class2, this.Class3, 0);
            return;
        }
        if (this.Class4 == 1) {
            mGraphics.Class1(GameScr.Class131, 0, this.Class1 * 20, 20, 20, 0, this.Class2, this.Class3, 33);
            return;
        }
        if (this.Class4 == 2) {
            mGraphics.Class1(GameScr.Class149, 0, this.Class1 * 15, 14, 15, 0, this.Class2 + 20, this.Class3 + 4, 20);
            return;
        }
        if (this.Class4 == 3) {
            mGraphics.Class1(GameScr.Class146, 0, this.Class1 << 3, 8, 8, 0, this.Class2 + 20, this.Class3 + 4, 20);
            return;
        }
        if (this.Class4 == 4) {
            mGraphics.Class1(GameScr.Class147, 0, this.Class1 << 3, 8, 8, 0, this.Class2 + 20, this.Class3 + 4, 20);
            return;
        }
        if (this.Class4 == 5) {
            mGraphics.Class1(GameScr.Class148, 0, this.Class1 * 14, 14, 14, 0, this.Class2 + 20, this.Class3 + 4, 20);
        }
    }
}
