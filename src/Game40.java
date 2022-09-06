import java.util.Hashtable;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game40 extends Hashtable
{
    public final synchronized Object Class1(final String key, final Object value) {
        return super.put(key, value);
    }
    
    public final synchronized void clear() {
        super.clear();
    }
    
    public final synchronized Object remove(final Object key) {
        return super.remove(key);
    }
    
    public final synchronized Object Class1(final String key) {
        return super.get(key);
    }
}
