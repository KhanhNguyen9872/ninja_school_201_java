import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Message
{
    public byte Class1;
    ByteArrayOutputStream Class2;
    public DataOutputStream Class3;
    private ByteArrayInputStream Class5;
    DataInputStream Class4;
    
    public Message() {
        this.Class2 = null;
        this.Class3 = null;
        this.Class5 = null;
        this.Class4 = null;
    }
    
    public Message(final byte class1) {
        this.Class2 = null;
        this.Class3 = null;
        this.Class5 = null;
        this.Class4 = null;
        this.Class1 = class1;
        this.Class2 = new ByteArrayOutputStream();
        this.Class3 = new DataOutputStream(this.Class2);
    }
    
    public Message(final byte class1, final byte[] buf) {
        this.Class2 = null;
        this.Class3 = null;
        this.Class5 = null;
        this.Class4 = null;
        this.Class1 = class1;
        this.Class5 = new ByteArrayInputStream(buf);
        this.Class4 = new DataInputStream(this.Class5);
    }
    
    private byte[] Class3() {
        return this.Class2.toByteArray();
    }
    
    public final DataInputStream Class1() {
        return this.Class4;
    }
    
    private DataOutputStream Class4() {
        return this.Class3;
    }
    
    public final void Class2() {
        try {
            if (this.Class4 != null) {
                this.Class4.close();
            }
            if (this.Class3 != null) {
                this.Class3.close();
            }
        }
        catch (IOException ex) {}
    }
}
