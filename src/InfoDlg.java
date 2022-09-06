import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class InfoDlg
{
    public static boolean Class1;
    public static String Class2;
    public static String Class3;
    public static int Class4;
    public static boolean Class5;
    public short minX;
    public short minY;
    public short maxX;
    public short maxY;
    
    public InfoDlg() {
    }
    
    public static void Class1(final String class2, final String class3, final int class4) {
        if (class2 == null) {
            return;
        }
        InfoDlg.Class1 = true;
        InfoDlg.Class2 = class2;
        InfoDlg.Class3 = class3;
        InfoDlg.Class4 = class4;
    }
    
    public static void Class1() {
        Class1(Game86.Class25, null, 5000);
        InfoDlg.Class5 = true;
    }
    
    public static void Class1(final String s) {
        Class1(s, null, 5000);
        InfoDlg.Class5 = true;
    }
    
    private static void Class1(final mGraphics mGraphics) {
        String s = InfoDlg.Class2;
        if (TileMap.Class10 != null) {
            s = TileMap.Class10;
        }
        if (!InfoDlg.Class1) {
            return;
        }
        if (InfoDlg.Class5 && InfoDlg.Class4 > 4990) {
            return;
        }
        if (GameScr.isPaintAlert) {
            return;
        }
        Game25.Class1(GameCanvas.Class27 - 64, 10, 128, 40, mGraphics);
        if (InfoDlg.Class5) {
            GameCanvas.Class1(GameCanvas.Class27 - mFont.Class17.Class1(s) / 2 - 10, 30, mGraphics);
            mFont.Class17.Class1(mGraphics, s, GameCanvas.Class27 + 5, 23, 2);
            return;
        }
        if (InfoDlg.Class3 != null) {
            mFont.Class17.Class1(mGraphics, s, GameCanvas.Class27, 18, 2);
            mFont.number_red.Class1(mGraphics, InfoDlg.Class3, GameCanvas.Class27, 32, 2);
            return;
        }
        mFont.Class17.Class1(mGraphics, s, GameCanvas.Class27, 23, 2);
    }
    
    public static void hide() {
        InfoDlg.Class2 = "";
        InfoDlg.Class3 = null;
        InfoDlg.Class5 = false;
        InfoDlg.Class4 = 0;
        InfoDlg.Class1 = false;
    }
    
    public InfoDlg(final short minX, final short minY, final short maxX, final short maxY) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }
}
