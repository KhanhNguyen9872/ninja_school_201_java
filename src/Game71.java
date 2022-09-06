import java.util.Hashtable;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game71
{
    public Hashtable Class1;
    
    public Game71() {
        this.Class1 = new Hashtable();
    }
    
    public final Object Class1(final Object key) {
        return this.Class1.get(key);
    }
    
    public final boolean equals(final Object obj) {
        return this.Class1.equals(obj);
    }
    
    public final void Class1(final Object key, final Object value) {
        this.Class1.put(key, value);
    }
}
