import main.GameCanvas;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class TField implements IActionListener
{
    public int Class1;
    public int Class2;
    public int Class3;
    public int Class4;
    public boolean Class5;
    private boolean Class24;
    private static int Class25;
    private static final int[] Class26;
    static int Class6;
    private static String[] Class27;
    private static String[] Class28;
    public String Class7;
    public String Class8;
    public String Class9;
    String Class10;
    String Class11;
    int Class12;
    int Class13;
    public int Class14;
    int Class15;
    private int Class29;
    int Class16;
    private int Class30;
    int Class17;
    int Class18;
    public static boolean Class19;
    private static int Class31;
    private int Class32;
    private static int Class33;
    public static Canvas Class20;
    public static MIDlet Class21;
    public String Class22;
    public Command Class23;
    
    static {
        TField.Class25 = 2;
        Class26 = new int[] { 18, 14, 11, 9, 6, 4, 2 };
        TField.Class6 = 0;
        TField.Class27 = new String[] { " 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb72", "def3\u0111\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec73", "ghi4\u00ed\u00ec\u1ec9\u0129\u1ecb4", "jkl5", "mno6\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee36", "pqrs7", "tuv8\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef18", "wxyz9\u00fd\u1ef3\u1ef7\u1ef9\u1ef59", "*", "#" };
        TField.Class28 = new String[] { "0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0" };
        final String[] array = { "abc", "Abc", "ABC", "123" };
        TField.Class33 = 11;
        final int[][] array2 = { { 32, 48 }, { 49, 69 }, { 50, 84 }, { 51, 85 }, { 52, 68 }, { 53, 71 }, { 54, 74 }, { 55, 67 }, { 56, 66 }, { 57, 77 }, { 42, 128 }, { 35, 137 }, { 33, 113 }, { 63, 97 }, { 64, 121, 122 }, { 46, 111 }, { 44, 108 } };
    }
    
    public final void switchToMe() {
        final TextBox current;
        ((Displayable)(current = new TextBox(this.Class22, "", this.Class14, 0))).addCommand(new javax.microedition.lcdui.Command(Game86.Class76, 4, 0));
        ((Displayable)current).addCommand(new javax.microedition.lcdui.Command("Cancel", 3, 0));
        ((Displayable)current).setCommandListener((CommandListener)new Game29(this, current));
        try {
            if (this.Class18 == 2) {
                current.setConstraints(65536);
            }
            else if (this.Class18 == 1) {
                current.setConstraints(2);
            }
            else {
                current.setConstraints(0);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        current.setString(this.Class9);
        current.setMaxSize(this.Class14);
        Display.getDisplay(TField.Class21).setCurrent((Displayable)current);
    }
    
    public static boolean Class1(final char c) {
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
    
    public TField() {
        this.Class7 = "";
        this.Class8 = "";
        this.Class9 = "";
        this.Class10 = "";
        this.Class11 = "";
        this.Class12 = 0;
        this.Class13 = 0;
        this.Class14 = 500;
        this.Class15 = 0;
        this.Class29 = -1984;
        this.Class16 = 0;
        this.Class30 = 0;
        this.Class17 = 10;
        this.Class18 = 0;
        this.Class32 = 0;
        this.Class22 = "";
        this.Class9 = "";
        TField.Class6 = mFont.Class17.Class1 + 1;
        this.Class23 = new Command(Game86.Class49, this, 1000, null);
        if (TaskOrder.Class3("qwerty") == 1) {
            TField.Class19 = true;
        }
    }
    
    public final void Class2() {
        if (this.Class12 > 0 && this.Class9.length() > 0) {
            this.Class9 = String.valueOf(this.Class9.substring(0, this.Class12 - 1)) + this.Class9.substring(this.Class12, this.Class9.length());
            --this.Class12;
            this.Class5();
            this.Class6();
        }
    }
    
    private void Class5() {
        if (this.Class18 == 2) {
            this.Class11 = this.Class10;
        }
        else {
            this.Class11 = this.Class9;
        }
        if (this.Class15 < 0 && mFont.Class17.Class1(this.Class11) + this.Class15 < this.Class3 - 4 - 13) {
            this.Class15 = this.Class3 - 10 - mFont.Class17.Class1(this.Class11);
        }
        if (this.Class15 + mFont.Class17.Class1(this.Class11.substring(0, this.Class12)) <= 0) {
            this.Class15 = -mFont.Class17.Class1(this.Class11.substring(0, this.Class12));
            this.Class15 += 40;
        }
        else if (this.Class15 + mFont.Class17.Class1(this.Class11.substring(0, this.Class12)) >= this.Class3 - 12) {
            this.Class15 = this.Class3 - 10 - mFont.Class17.Class1(this.Class11.substring(0, this.Class12)) - 8;
        }
        if (this.Class15 > 0) {
            this.Class15 = 0;
        }
    }
    
    private void Class3(final int n) {
        if ((this.Class18 == 2 || this.Class18 == 3) && (n < 48 || n > 57) && (n < 65 || n > 90) && (n < 97 || n > 122)) {
            return;
        }
        if (this.Class9.length() < this.Class14) {
            String s = String.valueOf(this.Class9.substring(0, this.Class12)) + (char)n;
            if (this.Class12 < this.Class9.length()) {
                s = String.valueOf(s) + this.Class9.substring(this.Class12, this.Class9.length());
            }
            this.Class9 = s;
            ++this.Class12;
            this.Class6();
            this.Class5();
        }
    }
    
    public final boolean Class1(int class29) {
        if (class29 == 8 || class29 == -8 || class29 == 204) {
            this.Class2();
            return true;
        }
        if (class29 >= 65 && class29 <= 122 && !TField.Class19) {
            TField.Class19 = true;
            TaskOrder.Class1("qwerty", 1);
        }
        if (TField.Class19) {
            if (class29 == 45) {
                if (class29 == this.Class29 && this.Class16 < TField.Class26[TField.Class25]) {
                    this.Class9 = String.valueOf(this.Class9.substring(0, this.Class12 - 1)) + '_';
                    this.Class11 = this.Class9;
                    this.Class6();
                    this.Class5();
                    this.Class29 = -1984;
                    return false;
                }
                this.Class29 = 45;
            }
            if (class29 >= 32) {
                this.Class3(class29);
                return false;
            }
        }
        if (class29 == TField.Class33) {
            ++this.Class32;
            if (this.Class32 > 3) {
                this.Class32 = 0;
            }
            this.Class16 = 1;
            this.Class29 = class29;
            return false;
        }
        if (class29 == 42) {
            class29 = 58;
        }
        if (class29 == 35) {
            class29 = 59;
        }
        if (class29 >= 48 && class29 <= 59) {
            if (this.Class18 == 0 || this.Class18 == 2 || this.Class18 == 3) {
                String[] array;
                if (this.Class18 == 2 || this.Class18 == 3) {
                    array = TField.Class28;
                }
                else {
                    array = TField.Class27;
                }
                if (class29 == this.Class29) {
                    this.Class30 = (this.Class30 + 1) % array[class29 - 48].length();
                    final char char1 = array[class29 - 48].charAt(this.Class30);
                    char c;
                    if (this.Class32 == 0) {
                        c = Character.toLowerCase(char1);
                    }
                    else if (this.Class32 == 1) {
                        c = Character.toUpperCase(char1);
                    }
                    else if (this.Class32 == 2) {
                        c = Character.toUpperCase(char1);
                    }
                    else {
                        c = array[class29 - 48].charAt(array[class29 - 48].length() - 1);
                    }
                    String s = String.valueOf(this.Class9.substring(0, this.Class12 - 1)) + c;
                    if (this.Class12 < this.Class9.length()) {
                        s = String.valueOf(s) + this.Class9.substring(this.Class12, this.Class9.length());
                    }
                    this.Class9 = s;
                    this.Class16 = TField.Class26[TField.Class25];
                    this.Class6();
                }
                else if (this.Class9.length() < this.Class14) {
                    if (this.Class32 == 1 && this.Class29 != -1984) {
                        this.Class32 = 0;
                    }
                    this.Class30 = 0;
                    final char char2 = array[class29 - 48].charAt(this.Class30);
                    char c2;
                    if (this.Class32 == 0) {
                        c2 = Character.toLowerCase(char2);
                    }
                    else if (this.Class32 == 1) {
                        c2 = Character.toUpperCase(char2);
                    }
                    else if (this.Class32 == 2) {
                        c2 = Character.toUpperCase(char2);
                    }
                    else {
                        c2 = array[class29 - 48].charAt(array[class29 - 48].length() - 1);
                    }
                    String s2 = String.valueOf(this.Class9.substring(0, this.Class12)) + c2;
                    if (this.Class12 < this.Class9.length()) {
                        s2 = String.valueOf(s2) + this.Class9.substring(this.Class12, this.Class9.length());
                    }
                    this.Class9 = s2;
                    this.Class16 = TField.Class26[TField.Class25];
                    ++this.Class12;
                    this.Class6();
                    this.Class5();
                }
                this.Class29 = class29;
            }
            else if (this.Class18 == 1) {
                this.Class3(class29);
                this.Class16 = 1;
            }
        }
        else {
            this.Class30 = 0;
            this.Class29 = -1984;
            if (class29 == 14) {
                if (this.Class12 > 0) {
                    --this.Class12;
                    this.Class5();
                    this.Class17 = 10;
                    return false;
                }
            }
            else if (class29 == 15) {
                if (this.Class12 < this.Class9.length()) {
                    ++this.Class12;
                    this.Class5();
                    this.Class17 = 10;
                    return false;
                }
            }
            else {
                if (class29 == 19) {
                    this.Class2();
                    return false;
                }
                this.Class29 = class29;
            }
        }
        return true;
    }
    
    public final void Class1(final mGraphics mGraphics) {
        mGraphics.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26);
        final boolean class5 = this.Class5;
        if (this.Class18 == 2) {
            this.Class11 = this.Class10;
        }
        else {
            this.Class11 = this.Class9;
        }
        if (this.Class11.equals("")) {
            this.Class11 = this.Class8;
        }
        Game25.Class1(mGraphics, class5, this.Class1, this.Class2, this.Class3, this.Class4, 4 + this.Class15 + this.Class1, this.Class2 + (this.Class4 - mFont.Class17.Class1) / 2, this.Class11);
        mGraphics.Class4(this.Class1 + 3, this.Class2 + 1, this.Class3 - 4, this.Class4 - 4);
        mGraphics.setColor(0);
        if (this.Class5 && this.Class16 == 0 && (this.Class17 > 0 || this.Class13 / 5 % 2 == 0)) {
            mGraphics.setColor(11184810);
            mGraphics.fillRect(5 + this.Class15 + this.Class1 + mFont.Class17.Class1(this.Class11.substring(0, this.Class12)) - 1, this.Class2 + (this.Class4 - TField.Class6) / 2 + 1, 1, TField.Class6);
        }
    }
    
    private void Class2(final mGraphics mGraphics) {
        final boolean class5 = this.Class5;
        if (this.Class18 == 2) {
            this.Class11 = this.Class10;
        }
        else {
            this.Class11 = this.Class9;
        }
        if (this.Class11.equals("")) {
            this.Class11 = this.Class8;
        }
        Game25.Class1(mGraphics, class5, this.Class1, this.Class2, this.Class3, 4 + this.Class15 + this.Class1, this.Class2 + (this.Class4 - mFont.Class17.Class1) / 2, this.Class11);
        mGraphics.setColor(0);
        if (this.Class5 && this.Class16 == 0 && (this.Class17 > 0 || this.Class13 / 5 % 2 == 0)) {
            mGraphics.setColor(11184810);
            mGraphics.fillRect(5 + this.Class15 + this.Class1 + mFont.Class17.Class1(this.Class11.substring(0, this.Class12)) - 1, this.Class2 + (this.Class4 - TField.Class6) / 2 + 1, 1, TField.Class6);
        }
    }
    
    private void Class6() {
        if (this.Class18 == 2) {
            this.Class10 = "";
            for (int i = 0; i < this.Class9.length(); ++i) {
                this.Class10 = String.valueOf(this.Class10) + "*";
            }
            if (this.Class16 > 0 && this.Class12 > 0) {
                this.Class10 = String.valueOf(this.Class10.substring(0, this.Class12 - 1)) + this.Class9.charAt(this.Class12 - 1) + this.Class10.substring(this.Class12, this.Class10.length());
            }
        }
    }
    
    public final void Class3() {
        final TField tField = this;
        ++tField.Class13;
        if (this.Class16 > 0) {
            final TField tField2 = this;
            --tField2.Class16;
            if (this.Class16 == 0) {
                this.Class30 = 0;
                if (this.Class32 == 1 && this.Class29 != TField.Class33) {
                    this.Class32 = 0;
                }
                this.Class29 = -1984;
                this.Class6();
            }
        }
        if (this.Class17 > 0) {
            final TField tField3 = this;
            --tField3.Class17;
        }
        if (GameCanvas.Class16) {
            if (GameCanvas.Class29 == Game15.Class8) {
                final TField tField4 = this;
                if (Game15.Class8 == null) {
                    Game15.Class8 = new Game15();
                }
                final int class2 = Game15.Class8.Class9.Class2;
                this = tField4;
                if (GameCanvas.Class2(tField4.Class1, this.Class2 - class2, this.Class3, this.Class4)) {
                    this.switchToMe();
                    return;
                }
                this.Class5 = false;
            }
            else {
                if (GameCanvas.Class2(this.Class1, this.Class2, this.Class3, this.Class4)) {
                    this.switchToMe();
                    return;
                }
                this.Class5 = false;
            }
        }
    }
    
    public final String getText() {
        return this.Class9;
    }
    
    public final void setText(final String s) {
        if (s == null) {
            return;
        }
        this.Class29 = -1984;
        this.Class16 = 0;
        this.Class30 = 0;
        this.Class9 = s;
        this.Class11 = s;
        this.Class6();
        this.Class12 = s.length();
        this.Class5();
    }
    
    public final void Class2(final int class14) {
        this.Class14 = class14;
    }
    
    private void Class4(final int class18) {
        this.Class18 = class18;
    }
    
    public final void perform(final int n, final Object o) {
        switch (n) {
            case 1000: {
                this.Class2();
                break;
            }
        }
    }
}
