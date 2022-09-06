import javax.microedition.io.Connection;

// 
// Decompiled by Procyon v0.5.36
// 

final class Game101 implements Runnable
{
    public final void run() {
        try {
            Thread.sleep(20000L);
        }
        catch (InterruptedException ex) {}
        if (Session_ME.Class1.Class6) {
            try {
                ((Connection)Session_ME.Class1.Class4).close();
            }
            catch (Exception ex2) {}
            Session_ME.Class14 = true;
            Session_ME.Class1.Class6 = false;
            Session_ME.Class1.connecting = false;
            final Session_ME class1 = Session_ME.Class1;
            Controller.Class1();
        }
    }
}
