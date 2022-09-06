import javax.microedition.io.InputConnection;
import javax.microedition.io.OutputConnection;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game46 implements Runnable
{
    private final String Class1;
    private Session_ME Class2;
    
    public Game46(final Session_ME class2, final String class3) {
        this.Class2 = class2;
        this.Class1 = class3;
    }
    
    public final void run() {
        Session_ME.Class14 = false;
        new Thread(new Game101()).start();
        this.Class2.Class6 = true;
        Thread.currentThread().setPriority(1);
        this.Class2.connecting = true;
        try {
            this.Class2.Class4 = (SocketConnection)Connector.open(this.Class1);
            Session_ME.Class1(this.Class2, ((OutputConnection)this.Class2.Class4).openDataOutputStream());
            this.Class2.Class2 = ((InputConnection)this.Class2.Class4).openDataInputStream();
            new Thread(Session_ME.Class1(this.Class2)).start();
            (this.Class2.Class8 = new Thread(new Game95(this.Class2))).start();
            this.Class2.Class13 = System.currentTimeMillis();
            Session_ME.Class1(this.Class2, new Message((byte)(-27)));
            this.Class2.Class6 = false;
            System.out.println("Connect ok");
        }
        catch (Exception ex) {
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException ex2) {}
            if (Session_ME.Class14) {
                return;
            }
            if (this.Class2.Class3 != null) {
                this.Class2.Class2();
                Controller.Class1();
            }
        }
    }
}
