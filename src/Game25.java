import javax.microedition.lcdui.Image;
import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game25
{
    public static int Class1;
    public static int Class2;
    public static int Class3;
    public static int Class4;
    public static int Class5;
    public static int Class6;
    private static int Class7;
    
    static {
        Game25.Class1 = 6562304;
        Game25.Class2 = 9581056;
        Game25.Class3 = 3937280;
        Game25.Class4 = 15224576;
        Game25.Class5 = 16777215;
        Game25.Class6 = 24;
    }
    
    public Game25() {
        final int[] array = { 15970400, -844109861, 2250052, 16374659, 15906669, 12931125, 3108954 };
    }
    
    public static void Class1(final mGraphics mGraphics, final Command command, final Command command2, final Command command3) {
        final mFont mFont = GameCanvas.Class6 ? mFont.Class6 : mFont.Class17;
        final int n = GameCanvas.Class6 ? 3 : 1;
        if (!GameCanvas.Class6) {
            if (command != null) {
                mFont.Class1(mGraphics, command.Class1, 5, GameCanvas.Class26 - mScreen.Class6 + 4 + n, 0);
            }
            if (command2 != null) {
                mFont.Class1(mGraphics, command2.Class1, GameCanvas.Class27, GameCanvas.Class26 - mScreen.Class6 + 4 + n, 2);
            }
            if (command3 != null) {
                if (command3.Class5 != null) {
                    mGraphics.Class1(command3.Class5, GameCanvas.Class25 - 5, GameCanvas.Class26 - 11, 10);
                    return;
                }
                mFont.Class1(mGraphics, command3.Class1, GameCanvas.Class25 - 5, GameCanvas.Class26 - mScreen.Class6 + 4 + n, 1);
            }
        }
        else {
            if (command != null && mFont.Class1(command.Class1) > 0) {
                if (command.Class6 > 0 && command.Class7 > 0) {
                    command.Class1(mGraphics);
                }
                else {
                    if (mScreen.Class7 == 0) {
                        mGraphics.Class1(GameScr.Class129, 1, GameCanvas.Class26 - mScreen.Class6 + 1, 0);
                    }
                    else {
                        mGraphics.Class1(GameScr.Class128, 1, GameCanvas.Class26 - mScreen.Class6 + 1, 0);
                    }
                    mFont.Class1(mGraphics, command.Class1, 35, GameCanvas.Class26 - mScreen.Class6 + 4 + n, 2);
                }
            }
            if (command2 != null && mFont.Class1(command2.Class1) > 0) {
                if (command2.Class6 > 0 && command2.Class7 > 0) {
                    command2.Class1(mGraphics);
                }
                else {
                    if (mScreen.Class7 == 1) {
                        mGraphics.Class1(GameScr.Class129, GameCanvas.Class27 - 35, GameCanvas.Class26 - mScreen.Class6 + 1, 0);
                    }
                    else {
                        mGraphics.Class1(GameScr.Class128, GameCanvas.Class27 - 35, GameCanvas.Class26 - mScreen.Class6 + 1, 0);
                    }
                    mFont.Class1(mGraphics, command2.Class1, GameCanvas.Class27, GameCanvas.Class26 - mScreen.Class6 + 4 + n, 2);
                }
            }
            if (command3 != null && mFont.Class1(command3.Class1) > 0) {
                if (command3.Class6 > 0 && command3.Class7 > 0) {
                    command3.Class1(mGraphics);
                    return;
                }
                if (mScreen.Class7 == 2) {
                    mGraphics.Class1(GameScr.Class129, GameCanvas.Class25 - 71, GameCanvas.Class26 - mScreen.Class6 + 1, 0);
                }
                else {
                    mGraphics.Class1(GameScr.Class128, GameCanvas.Class25 - 71, GameCanvas.Class26 - mScreen.Class6 + 1, 0);
                }
                mFont.Class1(mGraphics, command3.Class1, GameCanvas.Class25 - 35, GameCanvas.Class26 - mScreen.Class6 + 4 + n, 2);
            }
        }
    }
    
    public static void Class1(final mGraphics mGraphics) {
        if (!GameCanvas.Class6) {
            mGraphics.setColor(0);
            mGraphics.fillRect(0, GameCanvas.Class26 - Game25.Class6, GameCanvas.Class25, Game25.Class6 + 1);
            mGraphics.setColor(8947848);
            mGraphics.fillRect(0, GameCanvas.Class26 - (Game25.Class6 - 1), GameCanvas.Class25, 1);
        }
    }
    
    public static void Class1(final mGraphics mGraphics, final boolean b, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final String s) {
        mGraphics.setColor(0);
        if (b) {
            mGraphics.Class1(GameScr.Class126, 0, 81, 29, 27, 0, n, n2, 0);
            mGraphics.Class1(GameScr.Class126, 0, 135, 29, 27, 0, n + n3 - 29, n2, 0);
            mGraphics.Class1(GameScr.Class126, 0, 108, 29, 27, 0, n + n3 - 58, n2, 0);
            for (int i = 0; i < (n3 - 58) / 29; ++i) {
                mGraphics.Class1(GameScr.Class126, 0, 108, 29, 27, 0, n + 29 + i * 29, n2, 0);
            }
        }
        else {
            mGraphics.Class1(GameScr.Class126, 0, 0, 29, 27, 0, n, n2, 0);
            mGraphics.Class1(GameScr.Class126, 0, 54, 29, 27, 0, n + n3 - 29, n2, 0);
            mGraphics.Class1(GameScr.Class126, 0, 27, 29, 27, 0, n + n3 - 58, n2, 0);
            for (int j = 0; j < (n3 - 58) / 29; ++j) {
                mGraphics.Class1(GameScr.Class126, 0, 27, 29, 27, 0, n + 29 + j * 29, n2, 0);
            }
        }
        mGraphics.Class4(n + 3, n2 + 1, n3 - 4, n4 - 4);
        mFont.Class17.Class1(mGraphics, s, n5, n6, 0);
    }
    
    public static void Class1(final mGraphics mGraphics, final boolean b, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        mGraphics.setColor(0);
        if (b) {
            mGraphics.Class1(GameScr.Class126, 0, 81, 29, 27, 0, n, n2, 0);
            mGraphics.Class1(GameScr.Class126, 0, 135, 29, 27, 0, n + n3 - 29, n2, 0);
            mGraphics.Class1(GameScr.Class126, 0, 108, 29, 27, 0, n + n3 - 58, n2, 0);
            for (int i = 0; i < (n3 - 58) / 29; ++i) {
                mGraphics.Class1(GameScr.Class126, 0, 108, 29, 27, 0, n + 29 + i * 29, n2, 0);
            }
        }
        else {
            mGraphics.Class1(GameScr.Class126, 0, 0, 29, 27, 0, n, n2, 0);
            mGraphics.Class1(GameScr.Class126, 0, 54, 29, 27, 0, n + n3 - 29, n2, 0);
            mGraphics.Class1(GameScr.Class126, 0, 27, 29, 27, 0, n + n3 - 58, n2, 0);
            for (int j = 0; j < (n3 - 58) / 29; ++j) {
                mGraphics.Class1(GameScr.Class126, 0, 27, 29, 27, 0, n + 29 + j * 29, n2, 0);
            }
        }
        mFont.Class17.Class1(mGraphics, s, n4, n5, 0);
    }
    
    public static void Class1(final mGraphics mGraphics, final int n, int i, final int n2, int n3, final String[] array, final Image image) {
        if (image == null) {
            Class1(n, i, n2, n3, mGraphics);
            for (n3 = i + 20 - mFont.Class17.Class1, i = 0; i < array.length; ++i, n3 += mFont.Class17.Class1) {
                mFont.Class17.Class1(mGraphics, array[i], n + n2 / 2, n3, 2);
            }
            return;
        }
        Class1(n, i - image.getHeight(), n2, n3 + image.getHeight(), mGraphics);
        mGraphics.Class1(image, n + n2 / 2, i + n3 / 2 - 4, 33);
        for (n3 = i + 20 - mFont.Class17.Class1, i = 0; i < array.length; ++i, n3 += mFont.Class17.Class1) {
            mFont.Class17.Class1(mGraphics, array[i], n + n2 / 2, n3 - image.getHeight(), 2);
        }
    }
    
    public static void Class1(final int n, final int n2, final int n3, final int n4, final mGraphics mGraphics) {
        mGraphics.setColor(Game25.Class1);
        mGraphics.fillRect(n, n2, n3, n4);
        mGraphics.setColor(0);
        mGraphics.Class2(n - 2, n2 - 2, n3 + 3, n4 + 3);
        mGraphics.setColor(13948116);
        mGraphics.Class2(n - 1, n2 - 1, n3 + 1, n4 + 1);
        mGraphics.setColor(5720393);
        mGraphics.Class2(n, n2, n3 - 1, n4 - 1);
        if (GameCanvas.Class6) {
            mGraphics.Class1(GameCanvas.Class41[0], n - 4, n2 - 3, 20);
            mGraphics.Class1(GameCanvas.Class41[0], 0, 0, GameCanvas.Class42, GameCanvas.Class43, 2, n + n3 + 4, n2 - 3, Game62.Class3);
            mGraphics.Class1(GameCanvas.Class41[0], 0, 0, GameCanvas.Class42, GameCanvas.Class43, 1, n - 4, n2 + n4 + 3, Game62.Class5);
            mGraphics.Class1(GameCanvas.Class41[0], 0, 0, GameCanvas.Class42, GameCanvas.Class43, 3, n + n3 + 4, n2 + n4 + 3, Game62.Class6);
            mGraphics.Class1(GameCanvas.Class41[1], n + n3 / 2, n2 - 4, Game62.Class1);
        }
    }
    
    public static void Class2(final int n, final int n2, final int n3, final int n4, final mGraphics mGraphics) {
        mGraphics.setColor(0);
        mGraphics.Class2(n - 2, n2 - 2, n3 + 3, n4 + 3);
        mGraphics.setColor(13948116);
        mGraphics.Class2(n - 1, n2 - 1, n3 + 1, n4 + 1);
        mGraphics.setColor(5720393);
        mGraphics.Class2(n, n2, n3 - 1, n4 - 1);
        if (GameCanvas.Class6) {
            mGraphics.Class1(GameCanvas.Class41[0], n - 4, n2 - 3, 20);
            mGraphics.Class1(GameCanvas.Class41[0], 0, 0, GameCanvas.Class42, GameCanvas.Class43, 2, n + n3 + 4, n2 - 3, Game62.Class3);
            mGraphics.Class1(GameCanvas.Class41[0], 0, 0, GameCanvas.Class42, GameCanvas.Class43, 1, n - 4, n2 + n4 + 3, Game62.Class5);
            mGraphics.Class1(GameCanvas.Class41[0], 0, 0, GameCanvas.Class42, GameCanvas.Class43, 3, n + n3 + 4, n2 + n4 + 3, Game62.Class6);
            mGraphics.Class1(GameCanvas.Class41[1], n + n3 / 2, n2 - 4, Game62.Class1);
        }
    }
    
    public static void Class3(final int n, final int n2, final int n3, final int n4, final mGraphics mGraphics) {
        mGraphics.setColor(Game25.Class1);
        mGraphics.fillRect(n, n2, n3, n4);
    }
    
    public static void Class4(final int n, final int n2, final int n3, final int n4, final mGraphics mGraphics) {
        mGraphics.setColor(Game25.Class2);
        mGraphics.fillRect(n, n2, n3, n4);
    }
}
