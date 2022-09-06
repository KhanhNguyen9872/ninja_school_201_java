// 
// Decompiled by Procyon v0.5.36
// 

public final class EPosition
{
    public int Class1;
    public int Class2;
    public byte Class3;
    public byte Class4;
    public short Class5;
    
    public EPosition(final int class1, final int class2) {
        this.Class4 = 0;
        this.Class5 = -1;
        this.Class1 = class1;
        this.Class2 = class2;
    }
    
    public EPosition(final int class1, final int class2, final int n) {
        this.Class4 = 0;
        this.Class5 = -1;
        this.Class1 = class1;
        this.Class2 = class2;
        this.Class3 = (byte)n;
    }
    
    public EPosition() {
        this.Class4 = 0;
        this.Class5 = -1;
    }
}
