import java.io.FilterInputStream;
import main.GameCanvas;
import java.io.IOException;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class mFont
{
    private int Class23;
    int Class1;
    Image Class2;
    private String Class24;
    private int[][] Class25;
    private static String Class26;
    public static mFont Class3;
    public static mFont Class4;
    public static mFont Class5;
    public static mFont Class6;
    public static mFont Class7;
    public static mFont Class8;
    public static mFont Class9;
    public static mFont Class10;
    public static mFont number_red;
    public static mFont Class12;
    public static mFont Class13;
    public static mFont Class14;
    public static mFont Class15;
    public static mFont Class16;
    public static mFont Class17;
    public static mFont Class18;
    public static mFont Class19;
    public static mFont Class20;
    public static mFont Class21;
    public static mFont Class22;
    private String Class27;
    
    static {
        mFont.Class26 = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():a\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb7bcd\u0111e\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec7fghi\u00ed\u00ec\u1ec9\u0129\u1ecbjklmno\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee3pqrstu\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef1vxy\u00fd\u1ef3\u1ef7\u1ef9\u1ef5zwA\u00c1\u00c0\u1ea2\u00c3\u1ea0\u0102\u1eb0\u1eae\u1eb2\u1eb4\u1eb6\u00c2\u1ea4\u1ea6\u1ea8\u1eaa\u1eacBCD\u0110E\u00c9\u00c8\u1eba\u1ebc\u1eb8\u00ca\u1ebe\u1ec0\u1ec2\u1ec4\u1ec6FGHI\u00cd\u00cc\u1ec8\u0128\u1ecaJKLMNO\u00d3\u00d2\u1ece\u00d5\u1ecc\u00d4\u1ed0\u1ed2\u1ed4\u1ed6\u1ed8\u01a0\u1eda\u1edc\u1ede\u1ee0\u1ee2PQRSTU\u00da\u00d9\u1ee6\u0168\u1ee4\u01af\u1ee8\u1eea\u1eec\u1eee\u1ef0VXY\u00dd\u1ef2\u1ef6\u1ef8\u1ef4ZW";
        mFont.Class3 = new mFont(mFont.Class26, "/font/tahoma_7b_red.png", "/font/tahoma_7b", 0);
        mFont.Class4 = new mFont(mFont.Class26, "/font/tahoma_7b_blue.png", "/font/tahoma_7b", 0);
        mFont.Class5 = new mFont(mFont.Class26, "/font/tahoma_7b_purple.png", "/font/tahoma_7b", 0);
        mFont.Class6 = new mFont(mFont.Class26, "/font/tahoma_7b_yellow.png", "/font/tahoma_7b", 0);
        mFont.Class7 = new mFont(mFont.Class26, "/font/tahoma_7b_white.png", "/font/tahoma_7b", 0);
        mFont.Class8 = new mFont(mFont.Class26, "/font/tahoma_7b_green.png", "/font/tahoma_7b", 0);
        mFont.Class9 = new mFont(mFont.Class26, "/font/tahoma_7.png", "/font/tahoma_7", 0);
        mFont.Class10 = new mFont(mFont.Class26, "/font/tahoma_7_blue1.png", "/font/tahoma_7", 0);
        mFont.number_red = new mFont(mFont.Class26, "/font/tahoma_7_white.png", "/font/tahoma_7", 0);
        mFont.Class12 = new mFont(mFont.Class26, "/font/tahoma_7_yellow.png", "/font/tahoma_7", 0);
        mFont.Class13 = new mFont(mFont.Class26, "/font/tahoma_7_grey.png", "/font/tahoma_7", 0);
        mFont.Class14 = new mFont(mFont.Class26, "/font/tahoma_7_red.png", "/font/tahoma_7", 0);
        mFont.Class15 = new mFont(mFont.Class26, "/font/tahoma_7_blue.png", "/font/tahoma_7", 0);
        mFont.Class16 = new mFont(mFont.Class26, "/font/tahoma_7_green.png", "/font/tahoma_7", 0);
        mFont.Class17 = new mFont(mFont.Class26, "/font/tahoma_8b.png", "/font/tahoma_8b", -1);
        mFont.Class18 = new mFont(" 0123456789+-", "/font/number_yellow.png", "/font/number", 0);
        mFont.Class19 = new mFont(" 0123456789+-", "/font/number_red.png", "/font/number", 0);
        mFont.Class20 = new mFont(" 0123456789+-", "/font/number_green.png", "/font/number", 0);
        mFont.Class21 = new mFont(" 0123456789+-", "/font/number_white.png", "/font/number", 0);
        mFont.Class22 = new mFont(" 0123456789+-", "/font/number_orange.png", "/font/number", 0);
    }
    
    private mFont(final String class24, String class25, final String name, final int class26) {
        try {
            this.Class24 = class24;
            this.Class23 = class26;
            this.Class27 = class25;
            class25 = null;
            this.Class1();
            try {
                class25 = (String)new DataInputStream(this.getClass().getResourceAsStream(name));
                this.Class25 = new int[((DataInputStream)class25).readShort()][];
                for (int i = 0; i < this.Class25.length; ++i) {
                    (this.Class25[i] = new int[4])[0] = ((DataInputStream)class25).readShort();
                    this.Class25[i][1] = ((DataInputStream)class25).readShort();
                    this.Class25[i][2] = ((DataInputStream)class25).readShort();
                    this.Class25[i][3] = ((DataInputStream)class25).readShort();
                    this.Class1 = this.Class25[i][3];
                }
            }
            catch (Exception ex3) {
                try {
                    ((FilterInputStream)class25).close();
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
        }
    }
    
    public final void Class1() {
        this.Class2 = GameCanvas.Class3(this.Class27);
    }
    
    private void Class2() {
        this.Class2 = null;
    }
    
    private int Class3() {
        return this.Class1;
    }
    
    public final int Class1(final String s) {
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            int index;
            if ((index = this.Class24.indexOf(s.charAt(i))) == -1) {
                index = 0;
            }
            n += this.Class25[index][2] + this.Class23;
        }
        return n;
    }
    
    public final void Class1(final mGraphics mGraphics, final String s, int index, final int n7, int n8) {
        final int length = s.length();
        if (n8 == 0) {
            n8 = index;
        }
        else if (n8 == 1) {
            n8 = index - this.Class1(s);
        }
        else {
            n8 = index - (this.Class1(s) >> 1);
        }
        for (int i = 0; i < length; ++i) {
            if ((index = this.Class24.indexOf(s.charAt(i))) == -1) {
                index = 0;
            }
            if (index >= 0) {
                mGraphics.Class1(this.Class2, this.Class25[index][0], this.Class25[index][1], this.Class25[index][2], this.Class25[index][3], 0, n8, n7, 20);
            }
            n8 += this.Class25[index][2] + this.Class23;
        }
    }
    
    public final void drawString(final mGraphics mGraphics, final String s, int index, final int n, int n2, final mFont mFont) {
        final int length = s.length();
        if (n2 == 0) {
            n2 = index;
        }
        else if (n2 == 1) {
            n2 = index - this.Class1(s);
        }
        else {
            n2 = index - (this.Class1(s) >> 1);
        }
        for (int i = 0; i < length; ++i) {
            if ((index = this.Class24.indexOf(s.charAt(i))) == -1) {
                index = 0;
            }
            if (index >= 0) {
                mGraphics.Class1(mFont.Class2, this.Class25[index][0], this.Class25[index][1], this.Class25[index][2], this.Class25[index][3], 0, n2 + 1, n, 20);
                mGraphics.Class1(mFont.Class2, this.Class25[index][0], this.Class25[index][1], this.Class25[index][2], this.Class25[index][3], 0, n2, n + 1, 20);
                mGraphics.Class1(this.Class2, this.Class25[index][0], this.Class25[index][1], this.Class25[index][2], this.Class25[index][3], 0, n2, n, 20);
            }
            n2 += this.Class25[index][2] + this.Class23;
        }
    }
    
    public final MyVector Class1(final String s, final int n) {
        final MyVector myVector = new MyVector();
        String string = "";
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '\n') {
                myVector.addElement(string);
                string = "";
            }
            else {
                string = String.valueOf(string) + s.charAt(i);
                if (this.Class1(string) > n) {
                    int n2;
                    for (n2 = string.length() - 1; n2 >= 0 && string.charAt(n2) != ' '; --n2) {}
                    if (n2 < 0) {
                        n2 = string.length() - 1;
                    }
                    myVector.addElement(string.substring(0, n2));
                    i = i - (string.length() - n2) + 1;
                    string = "";
                }
                if (i == s.length() - 1 && !string.trim().equals("")) {
                    myVector.addElement(string);
                }
            }
        }
        return myVector;
    }
    
    public final String[] Class2(final String s, int i) {
        MyVector class1;
        String[] array;
        for (array = new String[(class1 = this.Class1(s, i)).size()], i = 0; i < class1.size(); ++i) {
            array[i] = class1.elementAt(i).toString();
        }
        return array;
    }
}
