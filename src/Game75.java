import javax.microedition.lcdui.Image;
import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game75
{
    private static int Class3;
    public static Game71 Class1;
    public static Game71 Class2;
    
    static {
        Game75.Class1 = new Game71();
        Game75.Class2 = new Game71();
    }
    
    public static Game82 Class1(final short v) {
        try {
            Game82 game82;
            if ((game82 = (Game82)Game75.Class1.Class1(new StringBuffer(String.valueOf(v)).toString())) == null || (game82 != null && game82.Class1 == null)) {
                if (game82 == null) {
                    game82 = new Game82();
                    Game75.Class1.Class1(new StringBuffer(String.valueOf(v)).toString(), game82);
                }
                game82.Class1 = Controller.Class1(TaskOrder.Loaddata("effect ".concat(String.valueOf(v))));
                if (game82.Class1 == null && System.currentTimeMillis() / 1000L - game82.Class2 > 10L) {
                    game82.Class2 = (int)(System.currentTimeMillis() / 1000L);
                    if (v >= 0) {
                        game82.Class1 = GameCanvas.Class3("/eff_auto/" + v + ".png");
                    }
                    if (game82.Class1 == null && Session_ME.gI().connecting) {
                        final Service gi = Service.gI();
                        Message message = null;
                        try {
                            (message = new Message((byte)125)).Class3.writeByte(1);
                            message.Class3.writeShort(v);
                            gi.temple.Class1(message);
                        }
                        catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        finally {
                            message.Class2();
                        }
                        message.Class2();
                        game82.Class2 = (int)(System.currentTimeMillis() / 1000L);
                    }
                }
            }
            return game82;
        }
        catch (Exception ex2) {
            return null;
        }
    }
    
    public static void Class1(final short n, final byte[] array) {
        try {
            Game82 game82;
            if ((game82 = (Game82)Game75.Class1.Class1(new StringBuffer(String.valueOf(n)).toString())) == null) {
                game82 = new Game82();
            }
            Game75.Class1.Class1(new StringBuffer(String.valueOf(n)).toString(), game82);
            if (array.length > 0) {
                game82.Class1 = Image.createImage(array, 0, array.length);
                return;
            }
            game82.Class2 = (int)(System.currentTimeMillis() / 1000L);
        }
        catch (Exception ex) {}
    }
}
