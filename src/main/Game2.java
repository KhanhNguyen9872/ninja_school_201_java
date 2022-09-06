// 
// Decompiled by Procyon v0.5.36
// 

package main;

import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Canvas;

public final class Game2 extends Canvas
{
    public static Game2 Class1;
    Game3 Class2;
    private int Class3;
    private int Class4;
    private int Class5;
    private static boolean Class6;
    
    static {
        Game2.Class6 = true;
    }
    
    public Game2() {
        this.Class3 = 1;
        this.setFullScreenMode(true);
        mGraphics.Class2 = 1;
        if (!Game2.Class6) {
            if (((Displayable)this).getWidth() * ((Displayable)this).getHeight() > 2073600) {
                final int n = 4;
                this.Class3 = n;
                mGraphics.Class2 = n;
                this.Class4 = ((Displayable)this).getWidth() / this.Class3 + 2;
                this.Class5 = ((Displayable)this).getHeight() / this.Class3 + 2;
                return;
            }
            if (((Displayable)this).getWidth() * ((Displayable)this).getHeight() > 153600) {
                final int n2 = 3;
                this.Class3 = n2;
                mGraphics.Class2 = n2;
                this.Class4 = ((Displayable)this).getWidth() / this.Class3 + 2;
                this.Class5 = ((Displayable)this).getHeight() / this.Class3 + 2;
                return;
            }
            final int n3 = 1;
            this.Class3 = n3;
            mGraphics.Class2 = n3;
        }
    }
    
    private void Class1(final Game3 class2) {
        this.Class2 = class2;
    }
    
    protected final void paint(final Graphics graphics) {
        this.Class2.Class1(graphics);
    }
    
    protected final void keyPressed(final int n) {
        this.Class2.Class3(n);
    }
    
    protected final void keyReleased(final int n) {
        this.Class2.Class4(n);
    }
    
    protected final void pointerDragged(int n, int n2) {
        n /= this.Class3;
        n2 /= this.Class3;
        this.Class2.Class1(n, n2);
    }
    
    protected final void pointerPressed(int n, int n2) {
        n /= this.Class3;
        n2 /= this.Class3;
        this.Class2.setPopupSize(n, n2);
    }
    
    protected final void pointerReleased(int n, int n2) {
        n /= this.Class3;
        n2 /= this.Class3;
        this.Class2.Class3(n, n2);
    }
    
    public final int Class1() {
        if (this.Class3 == 1) {
            return ((Displayable)this).getHeight();
        }
        return this.Class5;
    }
    
    public final int Class2() {
        if (this.Class3 == 1) {
            return ((Displayable)this).getWidth();
        }
        return this.Class4;
    }
}
