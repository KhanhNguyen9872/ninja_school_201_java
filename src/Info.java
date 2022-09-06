import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Info
{
    private static MyVector Class2;
    private static Game77 Class3;
    private static int Class4;
    private static int Class5;
    private static int Class6;
    private static int Class7;
    private static int Class8;
    public static int Class1;
    
    static {
        Info.Class2 = new MyVector();
        Info.Class4 = 5;
        Info.Class8 = 2;
        Info.Class1 = 15;
    }
    
    public static void Class1(final mGraphics mGraphics) {
        final int n = GameCanvas.Class49 ? 16 : 0;
        final int class25 = GameCanvas.Class25;
        if (Info.Class3 == null) {
            return;
        }
        mGraphics.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26);
        if (!GameCanvas.Class6) {
            Game25.Class1(-6, n - 4, class25 + 10, Info.Class1 + 8, mGraphics);
        }
        else {
            mGraphics.setColor(0);
            mGraphics.fillRect(0, n, class25, Info.Class1);
        }
        mGraphics.Class4(0, n, class25, Info.Class1 + 5);
        Info.Class3.Class2.Class1(mGraphics, Info.Class3.Class1, Info.Class6, n + 5, 0);
    }
    
    public static void Class1() {
        if (GameCanvas.Class6) {
            Info.Class1 = 20;
        }
        if (Info.Class4 == 0) {
            if ((Info.Class6 += (Info.Class8 - Info.Class6) / 3) - Info.Class8 < 3) {
                Info.Class6 = Info.Class8 + 2;
                Info.Class4 = 2;
                Info.Class5 = 0;
            }
        }
        else if (Info.Class4 == 2) {
            if (++Info.Class5 > Info.Class3.Class3) {
                Info.Class4 = 3;
                Info.Class5 = 0;
            }
        }
        else if (Info.Class4 == 3) {
            if (Info.Class6 + Info.Class7 < Info.Class8 + GameCanvas.Class25 - 160) {
                Info.Class6 -= 6;
            }
            else {
                Info.Class6 -= 2;
            }
            if (Info.Class6 + Info.Class7 < Info.Class8) {
                Info.Class4 = 4;
                Info.Class5 = 0;
            }
        }
        else if (Info.Class4 == 4) {
            if (++Info.Class5 > 10) {
                Info.Class4 = 5;
                Info.Class5 = 0;
            }
        }
        else if (Info.Class4 == 5) {
            if (Info.Class2.size() > 0) {
                final Game77 class3 = Info.Class2.firstElement();
                Info.Class2.removeElementAt(0);
                if (Info.Class3 != null && class3.Class1.equals(Info.Class3.Class1)) {
                    return;
                }
                Info.Class7 = (Info.Class3 = class3).Class2.Class1(Info.Class3.Class1);
                Info.Class4 = (Info.Class5 = 0);
                Info.Class6 = GameCanvas.Class25;
            }
            else {
                Info.Class3 = null;
                if (GameCanvas.Class6) {
                    Info.Class1 = 0;
                }
            }
        }
    }
    
    public static void addInfo(final String s, final int n, final mFont mFont) {
        boolean b = false;
        Label_0399: {
            if (Info.Class3 != null && Info.Class3.Class1 != null && s.equals(Info.Class3.Class1)) {
                b = true;
            }
            else if (Info.Class2.size() > 0 && s.equals(Info.Class2.lastElement().Class1)) {
                b = true;
            }
            else {
                if (s.length() >= 8) {
                    if (Info.Class3 != null && Info.Class3.Class1 != null && Info.Class4 < 3 && Info.Class3.Class1.length() >= 8 && s.substring(0, 8).equals(Info.Class3.Class1.substring(0, 8))) {
                        int beginIndex;
                        for (beginIndex = 7; beginIndex < s.length() && beginIndex < Info.Class3.Class1.length() && s.charAt(beginIndex) == Info.Class3.Class1.charAt(beginIndex); ++beginIndex) {}
                        final String substring = s.substring(beginIndex, s.length());
                        final Game77 class3 = Info.Class3;
                        class3.Class1 = String.valueOf(class3.Class1) + ", " + substring;
                        Info.Class4 = 2;
                        Info.Class5 = 0;
                        b = true;
                        break Label_0399;
                    }
                    final String class4;
                    if (Info.Class2.size() > 0 && (class4 = Info.Class2.lastElement().Class1).length() >= 8 && s.substring(0, 8).equals(class4.substring(0, 8))) {
                        int beginIndex2;
                        for (beginIndex2 = 7; beginIndex2 < s.length() && beginIndex2 < class4.length() && s.charAt(beginIndex2) == class4.charAt(beginIndex2); ++beginIndex2) {}
                        new StringBuffer(String.valueOf(class4)).append(", ").append(s.substring(beginIndex2, s.length()));
                        b = true;
                        break Label_0399;
                    }
                }
                b = false;
            }
        }
        if (b) {
            return;
        }
        if (GameCanvas.Class25 == 128) {
            Info.Class8 = 1;
        }
        if (Info.Class2.size() > 10) {
            Info.Class2.removeElementAt(0);
        }
        Info.Class2.addElement(new Game77(s, mFont, n));
    }
}
