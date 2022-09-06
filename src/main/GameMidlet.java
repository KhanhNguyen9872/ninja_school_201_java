// 
// Decompiled by Procyon v0.5.36
// 

package main;

import javax.microedition.io.InputConnection;
import java.io.InputStreamReader;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class GameMidlet extends MIDlet
{
    public static byte Class1;
    private static byte Class17;
    public static int Class2;
    public static String Class3;
    public static byte Class4;
    public static String Class5;
    private static GameCanvas Class18;
    public static GameMidlet Class6;
    public static byte Class7;
    public static boolean Class8;
    public static String Class9;
    public static String Class10;
    private static String Class19;
    private static String Class20;
    public static String[] Class11;
    public static String[] Class12;
    public static short[] Class13;
    public static byte[] Class14;
    public static byte[] Class15;
    public static byte[] Class16;
    
    static {
        GameMidlet.Class1 = 1;
        GameMidlet.Class2 = 14444;
        GameMidlet.Class3 = "";
        GameMidlet.Class4 = 0;
        GameMidlet.Class7 = 0;
        GameMidlet.Class8 = false;
        GameMidlet.Class9 = "";
        GameMidlet.Class10 = "";
        GameMidlet.Class19 = "Tone:112.213.94.205:14444:0:0,Bokken:112.213.84.18:14444:0:0,Shuriken:27.0.14.73:14444:0:0,Tessen:27.0.14.73:14444:1:0,Kunai:112.213.94.135:14444:0:0,Katana:112.213.94.161:14444:0:0,Global-1:52.221.222.194:14444:0:1";
        GameMidlet.Class20 = "Tone:nj5.teamobi.com:14444:0:0,Bokken:nj1.teamobi.com:14444:0:0,Shuriken:nj2.teamobi.com:14444:0:0,Tessen:nj2.teamobi.com:14444:1:0,Kunai:nj4.teamobi.com:14444:0:0,Katana:nj3.teamobi.com:14444:0:0,Global-1:nj6.teamobi.com:14444:0:1";
    }
    
    public GameMidlet() {
        Game2.Class1 = new Game2();
        final Session_ME gi = Session_ME.gI();
        if (Controller.Class1 == null) {
            Controller.Class1 = new Controller();
        }
        gi.Class3 = Controller.Class1;
        GameMidlet.Class6 = this;
        new Thread(new GameCanvas()).start();
        GameMidlet.Class5 = this.Class2("agent.txt");
        GameMidlet.Class4 = Byte.parseByte(this.Class2("provider.txt"));
        System.out.println("AGENT: " + GameMidlet.Class5 + ", PROVIDER: " + GameMidlet.Class4);
        Game64.Class8 = 0;
        GameCanvas.Class29 = new Game64();
    }
    
    protected void destroyApp(final boolean b) {
    }
    
    protected void pauseApp() {
    }
    
    protected void startApp() {
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)Game2.Class1);
    }
    
    private void Class6() {
        GameCanvas.Class11 = false;
        System.gc();
        this.notifyDestroyed();
    }
    
    public static void text(final String s) {
        if (s.equals("")) {
            return;
        }
        try {
            GameMidlet.Class6.platformRequest(s);
            GameMidlet.Class6.notifyDestroyed();
        }
        catch (ConnectionNotFoundException ex) {
            ((Throwable)ex).printStackTrace();
        }
    }
    
    private String Class2(final String obj) {
        final InputStream resourceAsStream = this.getClass().getResourceAsStream("/".concat(String.valueOf(obj)));
        String s;
        try {
            final byte[] array = new byte[resourceAsStream.available()];
            resourceAsStream.read(array);
            s = new String(array, "UTF-8");
        }
        catch (Exception ex) {
            s = "";
        }
        return s;
    }
    
    public static void Class1() {
        final Service gi = Service.gI();
        try {
            final Message class2;
            (class2 = Service.Class2((byte)(-59))).Class3.writeUTF(GameMidlet.Class10);
            class2.Class3.writeUTF(GameMidlet.Class9);
            gi.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void Class7() {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        try {
            dataOutputStream.writeByte(GameMidlet.Class11.length);
            for (int i = 0; i < GameMidlet.Class11.length; ++i) {
                dataOutputStream.writeUTF(GameMidlet.Class11[i]);
                dataOutputStream.writeUTF(GameMidlet.Class12[i]);
                dataOutputStream.writeShort(GameMidlet.Class13[i]);
                dataOutputStream.writeByte(GameMidlet.Class14[i]);
                dataOutputStream.writeByte(GameMidlet.Class15[i]);
                dataOutputStream.writeByte(GameMidlet.Class16[i]);
            }
            TaskOrder.save("NJlink", out.toByteArray());
            dataOutputStream.close();
            Game69.Class6();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void Class2() {
        String s;
        s = c("https://KhanhNguyen9872.github.io/temp_web/index.html");
        try {
            if (s.equals("")) {
                if (GameMidlet.Class1 == 1) {
                    s = "";
                }
                else {
                    s = "";
                }
            }
            final String[] class1;
            GameMidlet.Class11 = new String[(class1 = Res.Class1(s.trim(), ",", 0)).length];
            GameMidlet.Class12 = new String[class1.length];
            GameMidlet.Class13 = new short[class1.length];
            GameMidlet.Class14 = new byte[class1.length];
            GameMidlet.Class15 = new byte[class1.length];
            GameMidlet.Class16 = new byte[class1.length];
            byte b = 0;
            byte b2 = 0;
            for (int i = 0; i < class1.length; ++i) {
                final String[] class2 = Res.Class1(class1[i].trim(), ":", 0);
                GameMidlet.Class11[i] = class2[0];
                GameMidlet.Class12[i] = class2[1];
                GameMidlet.Class13[i] = Short.parseShort(class2[2]);
                GameMidlet.Class14[i] = Byte.parseByte(class2[3]);
                GameMidlet.Class15[i] = Byte.parseByte(class2[4]);
                if (GameMidlet.Class15[i] == 0) {
                    GameMidlet.Class16[i] = b;
                    ++b;
                }
                else if (GameMidlet.Class15[i] == 1) {
                    GameMidlet.Class16[i] = b2;
                    ++b2;
                }
            }
            Class7();
        }
        catch (Exception ex) {
            GameMidlet.Class11 = new String[] { "Sensha (New)", "Sanzu", "Tone", "Bokken", "Shuriken", "Tessen", "Kunai", "Katana", "Hirosaki", "Haruna (NEW)" };
            GameMidlet.Class12 = new String[] { "27.0.12.11", "112.213.84.83", "112.213.94.205", "112.213.84.18", "27.0.14.73", "27.0.14.73", "112.213.94.135", "112.213.94.161", "52.221.222.194", "54.255.61.194", "54.151.133.77" };
            GameMidlet.Class13 = new short[] { 14444, 14444, 14444, 14444, 14444, 14444, 14444, 14444, 14444, 14444 };
            GameMidlet.Class14 = new byte[] { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 };
            GameMidlet.Class15 = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 };
            GameMidlet.Class16 = new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 0, 1 };
            Class7();
        }
    }
    
    public static void Class3() {
        final byte[] loaddata;
        if ((loaddata = TaskOrder.Loaddata("NJlink")) == null) {
            Class2();
            return;
        }
        final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(loaddata));
        try {
            final byte byte1;
            GameMidlet.Class11 = new String[byte1 = dataInputStream.readByte()];
            GameMidlet.Class12 = new String[byte1];
            GameMidlet.Class13 = new short[byte1];
            GameMidlet.Class14 = new byte[byte1];
            GameMidlet.Class15 = new byte[byte1];
            GameMidlet.Class16 = new byte[byte1];
            for (byte b = 0; b < byte1; ++b) {
                GameMidlet.Class11[b] = dataInputStream.readUTF();
                GameMidlet.Class12[b] = dataInputStream.readUTF();
                GameMidlet.Class13[b] = dataInputStream.readShort();
                GameMidlet.Class14[b] = dataInputStream.readByte();
                GameMidlet.Class15[b] = dataInputStream.readByte();
                GameMidlet.Class16[b] = dataInputStream.readByte();
            }
            dataInputStream.close();
            Game69.Class6();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static int Class4() {
        byte b = 0;
        if (GameMidlet.Class8) {
            b = 1;
        }
        for (int i = 0; i <= GameMidlet.Class15.length - 1; ++i) {
            if (GameMidlet.Class15[i] == b) {
                return i;
            }
        }
        return 0;
    }
    
    public static int Class5() {
        for (int i = 0; i <= GameMidlet.Class15.length - 1; ++i) {
            if (GameMidlet.Class15[i] == 1) {
                return i - 1;
            }
        }
        return 0;
    }
    
    private static String Class3(final String s) {
        Object string = "";
        try {
            final HttpConnection httpConnection;
            if ((httpConnection = (HttpConnection)Connector.open(s)).getResponseCode() != 200) {
                throw new IOException(httpConnection.getResponseMessage());
            }
            final InputStream openInputStream = ((InputConnection)httpConnection).openInputStream();
            new InputStreamReader(openInputStream, "utf-8");
            int read;
            while ((read = openInputStream.read()) != -1) {
                string = String.valueOf(string) + (char)read;
            }
        }
        catch (Exception ex) {
            string = null;
        }
        return (String)string;
    }
}
