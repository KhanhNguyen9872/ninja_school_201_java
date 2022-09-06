import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class InfoMe
{
    private static MyVector Class1;
    private static Game77 Class2;
    private static int Class3;
    private static int Class4;
    private static int Class5;
    private static int Class6;
    private static int Class7;
    private static int Class8;
    
    static {
        InfoMe.Class1 = new MyVector();
        InfoMe.Class3 = 5;
        InfoMe.Class7 = 2;
        InfoMe.Class8 = 20;
    }
    
    public static void Class1(final mGraphics mGraphics) {
        int class7 = InfoMe.Class7;
        int n = GameCanvas.Class26 - 23;
        int class8 = GameCanvas.Class25;
        if (GameCanvas.Class6) {
            if (GameCanvas.Class25 >= 450) {
                class7 = 130;
                class8 = GameCanvas.Class25 - 260;
            }
            else {
                class7 = 80;
                class8 = GameCanvas.Class25 - 160 - 10;
            }
            n = GameCanvas.Class26 - 60;
            InfoMe.Class7 = class7 + 2;
        }
        if (InfoMe.Class2 == null) {
            return;
        }
        if (GameCanvas.Class34 != null && GameCanvas.Class34.Class4 != null) {
            return;
        }
        mGraphics.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26);
        if (GameCanvas.Class6) {
            Game25.Class1(class7, n - 4, class8 + 10, InfoMe.Class8 + 8, mGraphics);
        }
        else {
            mGraphics.setColor(0);
            mGraphics.fillRect(class7 - 2, n, class8 + 2, InfoMe.Class8);
        }
        mGraphics.Class4(class7, n, class8, InfoMe.Class8);
        InfoMe.Class2.Class2.Class1(mGraphics, InfoMe.Class2.Class1, InfoMe.Class5, n + 3, 0);
    }
    
    public static void Class1() {
        if (InfoMe.Class3 == 0) {
            if ((InfoMe.Class5 += (InfoMe.Class7 - InfoMe.Class5) / 3) - InfoMe.Class7 < 3) {
                InfoMe.Class5 = InfoMe.Class7 + 2;
                InfoMe.Class3 = 2;
                InfoMe.Class4 = 0;
            }
        }
        else if (InfoMe.Class3 == 2) {
            if (++InfoMe.Class4 > InfoMe.Class2.Class3) {
                InfoMe.Class3 = 3;
                InfoMe.Class4 = 0;
            }
        }
        else if (InfoMe.Class3 == 3) {
            if (InfoMe.Class5 + InfoMe.Class6 < InfoMe.Class7 + GameCanvas.Class25 - 20) {
                InfoMe.Class5 -= 6;
            }
            else {
                InfoMe.Class5 -= 2;
            }
            if (InfoMe.Class5 + InfoMe.Class6 < InfoMe.Class7) {
                InfoMe.Class3 = 4;
                InfoMe.Class4 = 0;
            }
        }
        else if (InfoMe.Class3 == 4) {
            if (++InfoMe.Class4 > 10) {
                InfoMe.Class3 = 5;
                InfoMe.Class4 = 0;
            }
        }
        else if (InfoMe.Class3 == 5) {
            if (InfoMe.Class1.size() > 0) {
                final Game77 class2 = InfoMe.Class1.firstElement();
                InfoMe.Class1.removeElementAt(0);
                if (InfoMe.Class2 != null && class2.Class1.equals(InfoMe.Class2.Class1)) {
                    return;
                }
                InfoMe.Class6 = (InfoMe.Class2 = class2).Class2.Class1(InfoMe.Class2.Class1);
                InfoMe.Class3 = (InfoMe.Class4 = 0);
                InfoMe.Class5 = GameCanvas.Class25;
            }
            else {
                InfoMe.Class2 = null;
            }
        }
    }
    
    public static void Class1(final String s) {
        if (Class2(s)) {
            return;
        }
        if (GameCanvas.Class25 == 128) {
            InfoMe.Class7 = 1;
        }
        if (InfoMe.Class1.size() > 10) {
            InfoMe.Class1.removeElementAt(0);
        }
        InfoMe.Class1.addElement(new Game77(s));
    }
    
    private static boolean Class2(String substring) {
        if (InfoMe.Class2 != null && InfoMe.Class2.Class1 != null && substring.equals(InfoMe.Class2.Class1)) {
            return true;
        }
        if (InfoMe.Class1.size() > 0 && substring.equals(InfoMe.Class1.lastElement().Class1)) {
            return true;
        }
        if (substring.length() < 8) {
            return false;
        }
        if (InfoMe.Class2 != null && InfoMe.Class2.Class1 != null && InfoMe.Class3 < 3 && InfoMe.Class2.Class1.length() >= 8 && substring.substring(0, 8).equals(InfoMe.Class2.Class1.substring(0, 8))) {
            int beginIndex;
            for (beginIndex = 7; beginIndex < substring.length() && beginIndex < InfoMe.Class2.Class1.length() && ((substring.charAt(beginIndex) < '0' || substring.charAt(beginIndex) > '9') && substring.charAt(beginIndex) == InfoMe.Class2.Class1.charAt(beginIndex)); ++beginIndex) {}
            final String substring2 = substring.substring(beginIndex, substring.length());
            final Game77 class2 = InfoMe.Class2;
            class2.Class1 = String.valueOf(class2.Class1) + ", " + substring2;
            InfoMe.Class3 = 2;
            InfoMe.Class4 = 0;
            return true;
        }
        final String class3;
        if (InfoMe.Class1.size() > 0 && (class3 = InfoMe.Class1.lastElement().Class1).length() >= 8 && substring.substring(0, 8).equals(class3.substring(0, 8))) {
            int beginIndex2;
            for (beginIndex2 = 7; beginIndex2 < substring.length() && beginIndex2 < class3.length() && ((substring.charAt(beginIndex2) < '0' || substring.charAt(beginIndex2) > '9') && substring.charAt(beginIndex2) == class3.charAt(beginIndex2)); ++beginIndex2) {}
            substring = substring.substring(beginIndex2, substring.length());
            new StringBuffer(String.valueOf(class3)).append(", ").append(substring);
            return true;
        }
        return false;
    }
    
    public static void addInfo(final String s, final int n, final mFont mFont) {
        if (Class2(s)) {
            return;
        }
        if (GameCanvas.Class25 == 128) {
            InfoMe.Class7 = 1;
        }
        if (InfoMe.Class1.size() > 10) {
            InfoMe.Class1.removeElementAt(0);
        }
        InfoMe.Class1.addElement(new Game77(s, mFont, n));
    }
    
    public static boolean Class2() {
        return InfoMe.Class3 == 5 && InfoMe.Class1.size() == 0;
    }
}
