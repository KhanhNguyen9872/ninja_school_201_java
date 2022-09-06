import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

final class Game17 implements Runnable
{
    final Session_ME Class1;
    
    public Game17(final Session_ME class1) {
        Session_ME.Class1(this.Class1 = class1, new MyVector());
    }
    
    public final void run() {
        while (this.Class1.connecting) {
            try {
                if (this.Class1.Class11) {
                    while (Session_ME.Class2(this.Class1).size() > 0) {
                        GameScr.gI();
                        final Message message = (Message)Session_ME.Class2(this.Class1).elementAt(0);
                        Session_ME.Class2(this.Class1).removeElementAt(0);
                        Session_ME.Class1(this.Class1, message);
                    }
                }
                try {
                    Thread.sleep(10L);
                }
                catch (InterruptedException ex2) {}
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
