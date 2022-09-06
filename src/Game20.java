import main.GameMidlet;
import main.GameCanvas;
import java.io.DataInputStream;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game20
{
    private static Random Class1;
    
    static {
        Game20.Class1 = new Random();
    }
    
    public static int Class1(final int bound) {
        return Game20.Class1.nextInt(bound);
    }
    
    public static int Class1() {
        return -7 + Game20.Class1.nextInt(14);
    }
    
    public static byte[] Class145(final Message message) {
        try {
            final byte[] b = new byte[message.Class4.readInt()];
            message.Class4.read(b);
            return b;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static byte[] Class2(final Message message) {
        try {
            final byte[] b = new byte[message.Class4.readInt()];
            message.Class4.read(b);
            return b;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static byte[] Class123(final DataInputStream dataInputStream) {
        try {
            final byte[] b = new byte[dataInputStream.readInt()];
            dataInputStream.read(b);
            return b;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static String Class1(String substring, final String str, final String str2) {
        final StringBuffer sb = new StringBuffer();
        int index;
        while ((index = substring.indexOf(str)) != -1) {
            sb.append(String.valueOf(substring.substring(0, index)) + str2);
            substring = substring.substring(index + str.length());
        }
        sb.append(substring);
        return sb.toString();
    }
    
    public static String Class1(String substring) {
        String str = "";
        String obj = "";
        if (substring.equals("")) {
            return str;
        }
        if (substring.charAt(0) == '-') {
            obj = "-";
            substring = substring.substring(1);
        }
        for (int i = substring.length() - 1; i >= 0; --i) {
            if ((substring.length() - 1 - i) % 3 == 0 && substring.length() - 1 - i > 0) {
                str = String.valueOf(substring.charAt(i)) + "." + str;
            }
            else {
                str = String.valueOf(substring.charAt(i)) + str;
            }
        }
        return String.valueOf(obj) + str;
    }
    
    public static void Class1(final String s, final short i) {
        Game105.Class1(s, "sms://".concat(String.valueOf(i)), new Command("", GameCanvas.Class1(), 88827, null), new Command("", GameCanvas.Class1(), 88828, null));
    }
    
    public static void Class2(final String s) {
        try {
            GameMidlet.Class6.platformRequest(s);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            GameMidlet.Class6.notifyDestroyed();
        }
        GameMidlet.Class6.notifyDestroyed();
    }
    
    public static String Class2(int n) {
        int i = 0;
        if (n > 60) {
            i = n / 60;
            n %= 60;
        }
        int n2 = 0;
        if (i > 60) {
            n2 = i / 60;
            i %= 60;
        }
        int j = 0;
        if (n2 > 24) {
            j = n2 / 24;
            n2 %= 24;
        }
        final String s = "";
        String s2;
        if (j > 0) {
            s2 = String.valueOf(new StringBuffer(String.valueOf(new StringBuffer(String.valueOf(s)).append(j).toString())).append("d").toString()) + n2 + "h";
        }
        else if (n2 > 0) {
            s2 = String.valueOf(new StringBuffer(String.valueOf(new StringBuffer(String.valueOf(s)).append(n2).toString())).append("h").toString()) + i + "'";
        }
        else {
            String obj;
            if (i > 9) {
                obj = String.valueOf(s) + i;
            }
            else {
                obj = String.valueOf(s) + "0" + i;
            }
            final String string = String.valueOf(obj) + ":";
            if (n > 9) {
                s2 = String.valueOf(string) + n;
            }
            else {
                s2 = String.valueOf(string) + "0" + n;
            }
        }
        return s2;
    }
    
    public static String[] Class1(String substring, final String s) {
        final MyVector myVector = new MyVector();
        for (int i = substring.indexOf(s); i >= 0; i = (substring = substring.substring(i + s.length())).indexOf(s)) {
            myVector.addElement(substring.substring(0, i));
        }
        myVector.addElement(substring);
        final String[] array = new String[myVector.size()];
        if (myVector.size() > 0) {
            for (int j = 0; j < myVector.size(); ++j) {
                array[j] = (String)myVector.elementAt(j);
            }
        }
        return array;
    }
}
