import javax.microedition.lcdui.Image;
import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game54
{
    public int Class1;
    private int Class2;
    private int Class3;
    
    public Game54(final int n, final int n2) {
        this.Class2 = n * 24 + 12;
        this.Class3 = n2 * 24 + 24 + 3;
    }
    
    private Object Class1() {
        final Object class1;
        if ((class1 = TileMap.Class23.Class1(new StringBuffer(String.valueOf(this.Class1)).toString())) != null) {
            return class1;
        }
        return null;
    }
    
    public final void Class1(final mGraphics mGraphics) {
        if (GameCanvas.Class1) {
            return;
        }
        if (this.Class1() != null) {
            mGraphics.Class1((Image)this.Class1(), this.Class2, this.Class3, 33);
        }
    }
}
