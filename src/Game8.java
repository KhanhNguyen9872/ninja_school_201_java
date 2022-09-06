import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game8
{
    private short Class1;
    private short Class2;
    private short Class3;
    private short Class4;
    private int Class5;
    private int Class6;
    private int Class7;
    private Image Class8;
    private int[] Class9;
    private int Class10;
    
    private Game8() {
    }
    
    private Game8(final Image class8, final int class9, final int class10) {
        this.Class8 = class8;
        this.Class5 = class9;
        this.Class6 = class10;
        this.Class10 = class8.getHeight();
        this.Class7 = this.Class10 / class10;
        this.Class9 = new int[this.Class7];
        for (int i = 0; i < this.Class7; ++i) {
            final int[] class11 = this.Class9;
            final int n = i;
            class11[n] = n * class10;
        }
    }
    
    private void Class1(final int n, final int n2, final int n3, final int n4, final int n5, final mGraphics mGraphics) {
        if (n >= 0 && n < this.Class7) {
            mGraphics.Class1(this.Class8, 0, this.Class9[n], this.Class5, this.Class6, n4, n2, n3, n5);
        }
    }
}
