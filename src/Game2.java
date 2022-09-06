import main.GameMidlet;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import main.GameCanvas;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game2
{
    public static int[][] Class1;
    private static Image[] Class6;
    private static Hashtable Class7;
    public short Class2;
    public short Class3;
    public short Class4;
    public short Class5;
    
    static {
        Game2.Class7 = new Hashtable();
    }
    
    public Game2(final int n, final int n2, final int n3, final int n4) {
        this.Class2 = (short)n;
        this.Class3 = (short)n2;
        this.Class4 = (short)n3;
        this.Class5 = (short)n4;
    }
    
    public static void Class1() {
        try {
            final Enumeration<String> keys = Game2.Class7.keys();
            while (keys.hasMoreElements()) {
                final String s = keys.nextElement();
                if (System.currentTimeMillis() - ((Game11)Game2.Class7.get(s)).Class3 > 180000L) {
                    Game2.Class7.remove(s);
                }
            }
        }
        catch (Exception ex) {}
    }
    
    public static void Class2() {
        Game2.Class6 = null;
        System.gc();
    }
    
    public static void Class3() {
        Game2.Class6 = null;
        System.gc();
        Game2.Class6 = new Image[] { GameCanvas.Class3("/img/Big0.png"), GameCanvas.Class3("/img/Big1.png"), GameCanvas.Class3("/img/Big2.png"), GameCanvas.Class3("/img/Big3.png"), GameCanvas.Class3("/img/Big4.png") };
        Image.createRGBImage(new int[] { -2013265920 }, 1, 1, true);
    }
    
    public Game2() {
        Class5();
    }
    
    public static void Class4() {
        new Game2();
    }
    
    private static void Class5() {
        try {
            final DataInputStream dataInputStream;
            final short short1;
            Game2.Class1 = new int[short1 = (dataInputStream = new DataInputStream(new ByteArrayInputStream(TaskOrder.Loaddata("nj_image")))).readShort()][5];
            for (short n = 0; n < short1; ++n) {
                Game2.Class1[n][0] = dataInputStream.readUnsignedByte();
                Game2.Class1[n][1] = dataInputStream.readShort();
                Game2.Class1[n][2] = dataInputStream.readShort();
                Game2.Class1[n][3] = dataInputStream.readShort();
                Game2.Class1[n][4] = dataInputStream.readShort();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void Class1(final int i, final byte[] array) {
        Game11 value;
        if ((value = Game2.Class7.get(new StringBuffer(String.valueOf(i)).toString())) == null) {
            value = new Game11();
            Game2.Class7.put(new StringBuffer(String.valueOf(i)).toString(), value);
        }
        value.Class1 = Controller.Class1(array);
        if (GameMidlet.Class1 != 1) {
            TaskOrder.Class2(new StringBuffer(String.valueOf(i)).toString(), array);
        }
    }
    
    public static boolean Class1(final int i) {
        if (i >= Game2.Class1.length || Game2.Class1[i][1] >= Game2.Class6[Game2.Class1[i][0]].getWidth() || Game2.Class1[i][3] >= Game2.Class6[Game2.Class1[i][0]].getWidth() || Game2.Class1[i][2] >= Game2.Class6[Game2.Class1[i][0]].getHeight() || Game2.Class1[i][4] >= Game2.Class6[Game2.Class1[i][0]].getHeight()) {
            final Game11 game11;
            if ((game11 = Game2.Class7.get(new StringBuffer(String.valueOf(i)).toString())) == null) {
                final Game11 value = new Game11();
                Game2.Class7.put(new StringBuffer(String.valueOf(i)).toString(), value);
                value.Class1 = Controller.Class1(TaskOrder.Loaddata(new StringBuffer(String.valueOf(i)).toString()));
                if (value.Class1 == null) {
                    value.Class2 = System.currentTimeMillis();
                    Service.gI().Class24(i);
                }
                return false;
            }
            if (game11.Class1 != null) {
                return true;
            }
            if (game11.Class1 == null && System.currentTimeMillis() - game11.Class2 > 60000L) {
                game11.Class2 = System.currentTimeMillis();
                Service.gI().Class24(i);
                return false;
            }
        }
        return true;
    }
    
    public static int Class2(final int n) {
        return Game2.Class1[n][4];
    }
    
    public static void Class1(final mGraphics mGraphics, int width, final int n6, final int n7) {
        if (width >= Game2.Class1.length || Game2.Class1[width][1] >= Game2.Class6[Game2.Class1[width][0]].getWidth() || Game2.Class1[width][3] >= Game2.Class6[Game2.Class1[width][0]].getWidth() || Game2.Class1[width][2] >= Game2.Class6[Game2.Class1[width][0]].getHeight() || Game2.Class1[width][4] >= Game2.Class6[Game2.Class1[width][0]].getHeight()) {
            Game11 value;
            if ((value = Game2.Class7.get(new StringBuffer(String.valueOf(width)).toString())) == null) {
                value = new Game11();
                Game2.Class7.put(new StringBuffer(String.valueOf(width)).toString(), value);
                value.Class1 = Controller.Class1(TaskOrder.Loaddata(new StringBuffer(String.valueOf(width)).toString()));
                if (value.Class1 == null) {
                    value.Class2 = System.currentTimeMillis();
                    Service.gI().Class24(width);
                }
            }
            else if (value.Class1 == null && System.currentTimeMillis() - value.Class2 > 60000L) {
                value.Class2 = System.currentTimeMillis();
                Service.gI().Class24(width);
            }
            if (value != null) {
                if (value.Class1 != null) {
                    if (value.Class1.getHeight() > 35) {
                        width = value.Class1.getWidth();
                        final int n8 = value.Class1.getHeight() / 3;
                        if (GameCanvas.gameTick % 6 == 0) {
                            final Game11 game11 = value;
                            game11.Class4 = (byte)((game11.Class4 + 1) % 3);
                        }
                        mGraphics.Class1(value.Class1, 0, value.Class4 * n8, width, n8, 0, n6, n7, 3);
                    }
                    else {
                        mGraphics.Class1(value.Class1, 0, 0, value.Class1.getWidth(), value.Class1.getHeight(), 0, n6, n7, 3);
                    }
                }
                value.Class3 = System.currentTimeMillis();
            }
        }
        else {
            mGraphics.Class1(Game2.Class6[Game2.Class1[width][0]], Game2.Class1[width][1], Game2.Class1[width][2], Game2.Class1[width][3], Game2.Class1[width][4], 0, n6, n7, 3);
        }
    }
    
    public static void Class1(final mGraphics mGraphics, final int i, final int n, final int n2, final int n3, final int n4) {
        if (i >= Game2.Class1.length || Game2.Class1[i][1] >= Game2.Class6[Game2.Class1[i][0]].getWidth() || Game2.Class1[i][3] >= Game2.Class6[Game2.Class1[i][0]].getWidth() || Game2.Class1[i][2] >= Game2.Class6[Game2.Class1[i][0]].getHeight() || Game2.Class1[i][4] >= Game2.Class6[Game2.Class1[i][0]].getHeight()) {
            Game11 value;
            if ((value = Game2.Class7.get(new StringBuffer(String.valueOf(i)).toString())) == null) {
                value = new Game11();
                Game2.Class7.put(new StringBuffer(String.valueOf(i)).toString(), value);
                value.Class1 = Controller.Class1(TaskOrder.Loaddata(new StringBuffer(String.valueOf(i)).toString()));
                if (value.Class1 == null) {
                    value.Class2 = System.currentTimeMillis();
                    Service.gI().Class24(i);
                }
            }
            else if (value.Class1 == null && System.currentTimeMillis() - value.Class2 > 60000L) {
                value.Class2 = System.currentTimeMillis();
                Service.gI().Class24(i);
            }
            if (value != null) {
                if (value.Class1 != null) {
                    mGraphics.Class1(value.Class1, 0, 0, value.Class1.getWidth(), value.Class1.getHeight(), n3, n, n2, n4);
                }
                value.Class3 = System.currentTimeMillis();
            }
        }
        else {
            mGraphics.Class1(Game2.Class6[Game2.Class1[i][0]], Game2.Class1[i][1], Game2.Class1[i][2], Game2.Class1[i][3], Game2.Class1[i][4], n3, n, n2, n4);
        }
    }
    
    public static void Class2(final mGraphics mGraphics, int width, final int n6, final int n7) {
        if (width >= Game2.Class1.length || Game2.Class1[width][1] >= Game2.Class6[Game2.Class1[width][0]].getWidth() || Game2.Class1[width][3] >= Game2.Class6[Game2.Class1[width][0]].getWidth() || Game2.Class1[width][2] >= Game2.Class6[Game2.Class1[width][0]].getHeight() || Game2.Class1[width][4] >= Game2.Class6[Game2.Class1[width][0]].getHeight()) {
            Game11 value;
            if ((value = Game2.Class7.get(new StringBuffer(String.valueOf(width)).toString())) == null) {
                value = new Game11();
                Game2.Class7.put(new StringBuffer(String.valueOf(width)).toString(), value);
                value.Class1 = Controller.Class1(TaskOrder.Loaddata(new StringBuffer(String.valueOf(width)).toString()));
                if (value.Class1 == null) {
                    value.Class2 = System.currentTimeMillis();
                    Service.gI().Class24(width);
                }
            }
            else if (value.Class1 == null && System.currentTimeMillis() - value.Class2 > 60000L) {
                value.Class2 = System.currentTimeMillis();
                Service.gI().Class24(width);
            }
            if (value != null) {
                if (value.Class1 != null) {
                    if (value.Class1.getHeight() > 35) {
                        width = value.Class1.getWidth();
                        final int n8 = value.Class1.getHeight() / 3;
                        if (GameCanvas.gameTick % 6 == 0) {
                            final Game11 game11 = value;
                            game11.Class4 = (byte)((game11.Class4 + 1) % 3);
                        }
                        mGraphics.Class1(value.Class1, 0, value.Class4 * n8, width, n8, 0, n6, n7, 3);
                    }
                    else {
                        mGraphics.Class1(value.Class1, 0, 0, value.Class1.getWidth(), value.Class1.getHeight(), 0, n6, n7, 3);
                    }
                }
                value.Class3 = System.currentTimeMillis();
            }
        }
        else {
            mGraphics.Class1(Game2.Class6[Game2.Class1[width][0]], Game2.Class1[width][1], Game2.Class1[width][2], Game2.Class1[width][3], Game2.Class1[width][4], 0, n6, n7, 3);
        }
    }
}
