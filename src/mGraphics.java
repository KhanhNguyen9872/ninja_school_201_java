import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Graphics;

// 
// Decompiled by Procyon v0.5.36
// 

public final class mGraphics
{
    public Graphics Class1;
    public static int Class2;
    
    public mGraphics(final Graphics class1) {
        this.Class1 = class1;
    }
    
    public mGraphics() {
    }
    
    public final void Class1(final Image image, int n, int n2, final int n3) {
        n *= mGraphics.Class2;
        n2 *= mGraphics.Class2;
        this.Class1.drawImage(image, n, n2, n3);
    }
    
    public final void drawLine(int n, int n2, int n3, int n4) {
        n *= mGraphics.Class2;
        n2 *= mGraphics.Class2;
        n3 *= mGraphics.Class2;
        n4 *= mGraphics.Class2;
        this.Class1.drawLine(n, n2, n3, n4);
    }
    
    public final void Class2(int n, int n2, int n3, int n4) {
        n *= mGraphics.Class2;
        n2 *= mGraphics.Class2;
        n3 *= mGraphics.Class2;
        n4 *= mGraphics.Class2;
        this.Class1.drawRect(n, n2, n3, n4);
    }
    
    public final void Game5(int n, int n2, int n3, int n4) {
        n *= mGraphics.Class2;
        n2 *= mGraphics.Class2;
        n3 *= mGraphics.Class2;
        n4 *= mGraphics.Class2;
        this.Class1.fillRoundRect(n, n2, n3, n4, 0, 360);
    }
    
    public final void Class1(final Image image, int n, int n2, int n3, int n4, final int n5, int n6, int n7, final int n8) {
        n6 *= mGraphics.Class2;
        n7 *= mGraphics.Class2;
        n *= mGraphics.Class2;
        n2 *= mGraphics.Class2;
        n3 *= mGraphics.Class2;
        n4 *= mGraphics.Class2;
        this.Class1.drawRegion(image, n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public final void Class1(int n, int n2, int n3, int n4, int n5, int n6) {
        n *= mGraphics.Class2;
        n2 *= mGraphics.Class2;
        n3 *= mGraphics.Class2;
        n4 *= mGraphics.Class2;
        n5 *= mGraphics.Class2;
        n6 *= mGraphics.Class2;
        this.Class1.drawRoundRect(n, n2, n3, n4, n5, n6);
    }
    
    public final void fillRect(int n, int n2, int n3, int n4) {
        n *= mGraphics.Class2;
        n2 *= mGraphics.Class2;
        n3 *= mGraphics.Class2;
        n4 *= mGraphics.Class2;
        this.Class1.fillRect(n, n2, n3, n4);
    }
    
    public final void Class2(int n, int n2, int n3, int n4, int n5, int n6) {
        n *= mGraphics.Class2;
        n2 *= mGraphics.Class2;
        n3 *= mGraphics.Class2;
        n4 *= mGraphics.Class2;
        n5 *= mGraphics.Class2;
        n6 *= mGraphics.Class2;
        this.Class1.fillRoundRect(n, n2, n3, n4, n5, n6);
    }
    
    public final int Class1() {
        return this.Class1.getTranslateX() / mGraphics.Class2;
    }
    
    public final int Class2() {
        return this.Class1.getTranslateY() / mGraphics.Class2;
    }
    
    public final void Class4(int n, int n2, int n3, int n4) {
        n *= mGraphics.Class2;
        n2 *= mGraphics.Class2;
        n3 *= mGraphics.Class2;
        n4 *= mGraphics.Class2;
        this.Class1.setClip(n, n2, n3, n4);
    }
    
    public final void setColor(final int color) {
        this.Class1.setColor(color);
    }
    
    public final void Class1(int n, int n2) {
        n *= mGraphics.Class2;
        n2 *= mGraphics.Class2;
        this.Class1.translate(n, n2);
    }
    
    public static int Class1(final Image image) {
        return image.getWidth() / mGraphics.Class2;
    }
    
    public static int Class2(final Image image) {
        return image.getHeight() / mGraphics.Class2;
    }
    
    static {
        mGraphics.Class2 = 1;
    }
}
