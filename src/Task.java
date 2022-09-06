// 
// Decompiled by Procyon v0.5.36
// 

public final class Task
{
    public int index;
    public short[] counts;
    public String[] names;
    public String[] details;
    public String[] subNames;
    public short count;
    
    public Task(final byte index, final String s, final String s2, final String[] subNames, final short[] counts, final short count) {
        this.index = index;
        this.names = mFont.Class7.Class2(s, 155);
        this.details = mFont.Class9.Class2(s2, 155);
        this.subNames = subNames;
        this.counts = counts;
        this.count = count;
    }
}
