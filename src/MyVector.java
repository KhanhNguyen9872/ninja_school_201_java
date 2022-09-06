import java.util.Vector;

// 
// Decompiled by Procyon v0.5.36
// 

public final class MyVector extends Vector
{
    public final synchronized void addElement(final Object obj) {
        super.addElement(obj);
    }
    
    public final synchronized Object elementAt(final int index) {
        return super.elementAt(index);
    }
    
    public final synchronized void removeAllElements() {
        super.removeAllElements();
    }
    
    public final synchronized boolean removeElement(final Object obj) {
        return super.removeElement(obj);
    }
    
    public final synchronized void insertElementAt(final Object obj, final int index) {
        super.insertElementAt(obj, index);
    }
    
    public final synchronized void removeElementAt(final int index) {
        super.removeElementAt(index);
    }
}
