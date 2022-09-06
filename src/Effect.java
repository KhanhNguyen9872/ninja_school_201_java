// 
// Decompiled by Procyon v0.5.36
// 

public final class Effect
{
    public static EffectTemplate[] Class1;
    public int timeStart;
    public int timeLenght;
    public short Class4;
    public EffectTemplate template;
    
    public Effect(final byte b, final int timeStart, final int n, final short class4) {
        this.template = Effect.Class1[b];
        this.timeStart = timeStart;
        this.timeLenght = n / 1000;
        this.Class4 = class4;
    }
}
