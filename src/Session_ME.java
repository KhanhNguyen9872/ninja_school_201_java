import javax.microedition.io.Connection;
import java.io.IOException;
import main.GameMidlet;
import javax.microedition.io.SocketConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Session_ME
{
    protected static Session_ME Class1;
    private boolean Class15;
    private DataOutputStream Class16;
    public DataInputStream Class2;
    public Controller Class3;
    public SocketConnection Class4;
    public boolean connecting;
    public boolean Class6;
    private final Game17 Class17;
    public Thread Class7;
    public Thread Class8;
    public int Class9;
    public int Class10;
    public boolean Class11;
    public byte[] Class12;
    private byte Class18;
    private byte Class19;
    long Class13;
    private String Class20;
    public static boolean Class14;
    private MyVector Class21;
    public static boolean islock;
    private static Object objLock;
    
    static {
        Session_ME.Class1 = new Session_ME();
        Session_ME.objLock = new Object();
    }
    
    public Session_ME() {
        this.Class17 = new Game17(this);
        this.Class12 = null;
    }
    
    public static Session_ME gI() {
        return Session_ME.Class1;
    }
    
    private boolean Class3() {
        return this.connecting;
    }
    
    private void Class1(final Controller class3) {
        this.Class3 = class3;
    }
    
    private void Class1(final String str) {
        System.out.println("connect to " + str + ":" + GameMidlet.Class7);
        if (this.connecting || this.Class6) {
            return;
        }
        this.Class11 = false;
        this.Class4 = null;
        this.Class7 = new Thread(new Game46(this, str));
        Game105.Class1();
    }
    
    public final void Class1(final Message message) {
        this.Class17.Class1.Class21.addElement(message);
    }
    
    private synchronized void Class2(final Message message) {
        final byte[] byteArray = message.Class2.toByteArray();
        try {
            if (this.Class11) {
                this.Class16.writeByte(this.Class1(message.Class1));
            }
            else {
                this.Class16.writeByte(message.Class1);
            }
            new StringBuffer("cmd send ---> ").append(message.Class1);
            if (byteArray != null) {
                final int length = byteArray.length;
                if (message.Class1 != -31 && this.Class11) {
                    this.Class16.writeByte(this.Class1((byte)(length >> 8)));
                    this.Class16.writeByte(this.Class1((byte)length));
                }
                else {
                    this.Class16.writeShort(length);
                }
                if (this.Class11) {
                    for (int i = 0; i < byteArray.length; ++i) {
                        byteArray[i] = this.Class1(byteArray[i]);
                    }
                }
                this.Class16.write(byteArray);
                this.Class9 += 5 + byteArray.length;
            }
            else {
                this.Class16.writeShort(0);
                this.Class9 += 5;
            }
            this.Class16.flush();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private byte Class1(final byte b) {
        final byte[] class12 = this.Class12;
        final byte class13 = this.Class19;
        this.Class19 = (byte)(class13 + 1);
        final byte b2 = (byte)((class12[class13] & 0xFF) ^ (b & 0xFF));
        if (this.Class19 >= this.Class12.length) {
            this.Class19 %= (byte)this.Class12.length;
        }
        return b2;
    }
    
    public void EndQuit() {
        final Code code = Code.code;
        Code.End();
        this.Class2();
    }
    
    final void Class2() {
        this.Class12 = null;
        this.Class18 = 0;
        this.Class19 = 0;
        try {
            this.connecting = false;
            this.Class6 = false;
            if (this.Class4 != null) {
                ((Connection)this.Class4).close();
                this.Class4 = null;
            }
            if (this.Class16 != null) {
                this.Class16.close();
                this.Class16 = null;
            }
            if (this.Class2 != null) {
                this.Class2.close();
                this.Class2 = null;
            }
            this.Class8 = null;
            System.gc();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    static void Class1(final Session_ME session_ME, final DataOutputStream class16) {
        session_ME.Class16 = class16;
    }
    
    static Game17 Class1(final Session_ME session_ME) {
        return session_ME.Class17;
    }
    
    static void Class1(final Session_ME session_ME, final Message message) {
        session_ME.Class2(message);
    }
    
    static void Class1(final Session_ME session_ME, final MyVector class21) {
        session_ME.Class21 = class21;
    }
    
    static MyVector Class2(final Session_ME session_ME) {
        return session_ME.Class21;
    }
    
    static void Class3(final Session_ME session_ME) {
        session_ME.Class2();
    }
    
    static byte Class1(final Session_ME session_ME, final byte b) {
        final byte[] class12 = session_ME.Class12;
        final byte class13 = session_ME.Class18;
        session_ME.Class18 = (byte)(class13 + 1);
        final byte b2 = (byte)((class12[class13] & 0xFF) ^ (b & 0xFF));
        if (session_ME.Class18 >= session_ME.Class12.length) {
            session_ME.Class18 %= (byte)session_ME.Class12.length;
        }
        return b2;
    }
    
    public static void Huyobj() {
        synchronized (Session_ME.objLock) {
            Session_ME.objLock.notifyAll();
        }
        // monitorexit(Session_ME.objLock)
    }
}
