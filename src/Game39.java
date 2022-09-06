import java.util.Enumeration;
import main.GameMidlet;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.util.Hashtable;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game39 extends Game21
{
    private short Class5;
    private Game11 Class6;
    private int Class7;
    private int Class8;
    private int Class9;
    private int Class10;
    private byte Class11;
    private long Class12;
    private static Game57[] Class13;
    private static Hashtable Class14;
    private static Hashtable Class15;
    private boolean Class16;
    
    static {
        Game39.Class13 = new Game57[20];
        Game39.Class14 = new Hashtable();
        Game39.Class15 = new Hashtable();
    }
    
    public Game39() {
        this.Class11 = 0;
        this.Class12 = 0L;
    }
    
    public static void Class1(final short class5, final int class6, final int class7, final byte class8, final short n, final int class9) {
        final Game39 game39;
        (game39 = new Game39()).Class5 = class5;
        game39.Class7 = class6;
        game39.Class8 = class7;
        game39.Class11 = class8;
        if (game39.Class11 < 0) {
            game39.Class16 = true;
        }
        else {
            game39.Class16 = false;
        }
        if (n > 0) {
            game39.Class12 = System.currentTimeMillis() + n * 1000;
        }
        else {
            game39.Class12 = -1L;
        }
        game39.Class10 = class9;
        Game21.Class1.addElement(game39);
    }
    
    private Game57 Class4() {
        return Game39.Class13[this.Class5];
    }
    
    public final void Class1(final mGraphics mGraphics) {
        if (this.Class6 != null && this.Class6.Class1 != null && this.Class4().Class3 != null) {
            final Game74 game74 = this.Class4().Class2[this.Class4().Class3[this.Class9]];
            for (int i = 0; i < game74.Class1.length; ++i) {
                final Game76 game75 = this.Class4().Class1[game74.Class3[i]];
                if (this.Class10 > 0) {
                    mGraphics.Class1(this.Class6.Class1, game75.Class1, game75.Class2, game75.Class3, game75.Class4, 0, this.Class7 + game74.Class1[i], this.Class8 + game74.Class2[i] - 1, 20);
                }
                else {
                    mGraphics.Class1(this.Class6.Class1, game75.Class1, game75.Class2, game75.Class3, game75.Class4, 2, this.Class7 - game74.Class1[i], this.Class8 + game74.Class2[i] - 1, 24);
                }
            }
        }
    }
    
    public final void switchToMe() {
        try {
            Game39.Class13[this.Class5] = Game39.Class15.get(new StringBuffer(String.valueOf(this.Class5)).toString());
            if (Game39.Class13[this.Class5] == null) {
                Game39.Class13[this.Class5] = new Game57();
                Game39.Class15.put(new StringBuffer(String.valueOf(this.Class5)).toString(), Game39.Class13[this.Class5]);
                this.Class4().Class4 = System.currentTimeMillis();
                Service.gI().Class1((byte)1, this.Class5);
            }
            else if (this.Class4().Class3 == null && System.currentTimeMillis() - this.Class4().Class4 > 3000L) {
                this.Class4().Class4 = System.currentTimeMillis();
                Service.gI().Class1((byte)1, this.Class5);
            }
            if (this.Class4().Class3 != null) {
                this.Class6 = Game39.Class14.get(new StringBuffer(String.valueOf(this.Class5)).toString());
                if (this.Class6 == null) {
                    this.Class6 = new Game11();
                    Game39.Class14.put(new StringBuffer(String.valueOf(this.Class5)).toString(), this.Class6);
                    this.Class6.Class1 = Controller.Class1(TaskOrder.Loaddata("effauto " + this.Class5));
                    if (this.Class6.Class1 == null) {
                        this.Class6.Class2 = System.currentTimeMillis();
                        Service.gI().Class1((byte)0, this.Class5);
                    }
                }
                else if (this.Class6.Class1 == null && System.currentTimeMillis() - this.Class6.Class2 > 6000L) {
                    this.Class6.Class2 = System.currentTimeMillis();
                    Service.gI().Class1((byte)0, this.Class5);
                }
            }
            if (this.Class6 != null && this.Class6.Class1 != null && this.Class4().Class3 != null) {
                ++this.Class9;
                Label_0502: {
                    if (this.Class9 >= this.Class4().Class3.length) {
                        if (this.Class12 != -1L) {
                            if (this.Class12 - System.currentTimeMillis() <= 0L) {
                                Game21.Class1.removeElement(this);
                            }
                            else {
                                this.Class9 = 0;
                            }
                        }
                        else {
                            if (!this.Class16) {
                                --this.Class11;
                                if (this.Class11 <= 0) {
                                    Game21.Class1.removeElement(this);
                                    break Label_0502;
                                }
                            }
                            this.Class9 = 0;
                        }
                    }
                }
                this.Class6.Class3 = System.currentTimeMillis();
            }
        }
        catch (Exception ex) {
            System.out.println("Err update effauto:" + ex.toString());
        }
    }
    
    public static void Class1(final short n, final byte[] array) {
        if (Game39.Class15.get(new StringBuffer(String.valueOf(n)).toString()).Class3 == null) {
            new Game57();
            Game39.Class15.put(new StringBuffer(String.valueOf(n)).toString(), Class1(array));
        }
    }
    
    private static Game57 Class1(final byte[] buf) {
        try {
            final Game57 game57 = new Game57();
            final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(buf));
            game57.Class1 = new Game76[dataInputStream.readByte()];
            for (int i = 0; i < game57.Class1.length; ++i) {
                game57.Class1[i] = new Game76();
                dataInputStream.readByte();
                game57.Class1[i].Class1 = dataInputStream.readUnsignedByte();
                game57.Class1[i].Class2 = dataInputStream.readUnsignedByte();
                game57.Class1[i].Class3 = dataInputStream.readUnsignedByte();
                game57.Class1[i].Class4 = dataInputStream.readUnsignedByte();
            }
            game57.Class2 = new Game74[dataInputStream.readShort()];
            for (int j = 0; j < game57.Class2.length; ++j) {
                game57.Class2[j] = new Game74();
                final byte byte1 = dataInputStream.readByte();
                game57.Class2[j].Class1 = new short[byte1];
                game57.Class2[j].Class2 = new short[byte1];
                game57.Class2[j].Class3 = new byte[byte1];
                for (byte b = 0; b < byte1; ++b) {
                    game57.Class2[j].Class1[b] = dataInputStream.readShort();
                    game57.Class2[j].Class2[b] = dataInputStream.readShort();
                    game57.Class2[j].Class3[b] = dataInputStream.readByte();
                }
            }
            final short short1 = dataInputStream.readShort();
            game57.Class3 = new short[short1];
            for (short n = 0; n < short1; ++n) {
                game57.Class3[n] = dataInputStream.readShort();
            }
            return game57;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static void Class2(final short i, final byte[] array) {
        Game11 value;
        if ((value = Game39.Class14.get(new StringBuffer(String.valueOf(i)).toString())) == null) {
            value = new Game11();
            Game39.Class14.put(new StringBuffer(String.valueOf(i)).toString(), value);
        }
        value.Class1 = Controller.Class1(array);
        if (GameMidlet.Class1 != 1) {
            TaskOrder.Class2("effauto ".concat(String.valueOf(i)), array);
        }
    }
    
    public static void Class2() {
        try {
            final Enumeration<String> keys = Game39.Class14.keys();
            while (keys.hasMoreElements()) {
                final String s = keys.nextElement();
                if (System.currentTimeMillis() - ((Game11)Game39.Class14.get(s)).Class3 > 60000L) {
                    Game39.Class14.remove(s);
                }
            }
        }
        catch (Exception ex) {}
    }
    
    public static void Class3() {
        try {
            final Enumeration<String> keys = Game39.Class15.keys();
            while (keys.hasMoreElements()) {
                final String s = keys.nextElement();
                if (System.currentTimeMillis() - ((Game57)Game39.Class15.get(s)).Class5 > 600000L) {
                    Game39.Class15.remove(s);
                }
            }
        }
        catch (Exception ex) {}
    }
}
