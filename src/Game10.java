import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game10
{
    private int Class1;
    private int Class2;
    private int Class3;
    private Image Class4;
    private int[] Class5;
    private int Class6;
    
    private Game10(final Image class4, final int class5, final int class6) {
        this.Class4 = class4;
        this.Class1 = class5;
        this.Class2 = class6;
        this.Class6 = class4.getHeight();
        this.Class3 = this.Class6 / class6;
        this.Class5 = new int[this.Class3];
        for (int i = 0; i < this.Class3; ++i) {
            final int[] class7 = this.Class5;
            final int n = i;
            class7[n] = n * class6;
        }
    }
    
    private void Class1(final int n, final int n2, final int n3, final int n4, final int n5, final mGraphics mGraphics) {
        if (n >= 0 && n < this.Class3) {
            mGraphics.Class1(this.Class4, 0, this.Class5[n], this.Class1, this.Class2, n4, n2, n3, n5);
        }
    }
}
