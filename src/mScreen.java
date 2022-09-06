import main.Game2;
import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public class mScreen
{
    public Command left;
    public Command center;
    public Command right;
    public static final int Class4;
    public static int Class5;
    public static int Class6;
    public static int Class7;
    
    static {
        Class4 = mFont.Class17.Class1 + 8;
        mScreen.Class5 = 70 * mGraphics.Class2;
        mScreen.Class6 = 22;
        mScreen.Class7 = -1;
    }
    
    public void switchToMe() {
        GameCanvas.Class7();
        GameCanvas.Class8();
        if (GameCanvas.Class29 != null) {
            GameCanvas.Class29.Class2();
        }
        GameCanvas.Class29 = this;
        Game2.Class1.setFullScreenMode(true);
    }
    
    public void Class2() {
    }
    
    public static void Class3() {
        if (GameCanvas.Class6) {
            mScreen.Class6 = 26;
            return;
        }
        mScreen.Class6 = 24;
    }
    
    public void Class1(final int n) {
    }
    
    public void Class4() {
    }
    
    public void Class5() {
        if (GameCanvas.Class12[5] || Class1(GameCanvas.Class29.center)) {
            GameCanvas.Class12[5] = false;
            mScreen.Class7 = -1;
            GameCanvas.Class16 = false;
            if (this.center != null) {
                this.center.Class1();
            }
        }
        if (GameCanvas.Class12[12] || Class1(GameCanvas.Class29.left)) {
            GameCanvas.Class12[12] = false;
            mScreen.Class7 = -1;
            GameCanvas.Class16 = false;
            if (Game23.Class1().Class2) {
                if (Game23.Class1().Class4 != null) {
                    Game23.Class1().Class4.Class1();
                }
            }
            else if (this.left != null) {
                this.left.Class1();
            }
        }
        if (GameCanvas.Class12[13] || Class1(GameCanvas.Class29.right)) {
            GameCanvas.Class12[13] = false;
            mScreen.Class7 = -1;
            GameCanvas.Class16 = false;
            if (Game23.Class1().Class2) {
                if (Game23.Class1().Class5 != null) {
                    Game23.Class1().Class5.Class1();
                }
            }
            else if (this.right != null) {
                this.right.Class1();
            }
        }
    }
    
    public static boolean Class1(final Command command) {
        if (command == null) {
            return false;
        }
        if (command.Class6 != 0 && command.Class7 != 0) {
            return command.Class2();
        }
        if (GameCanvas.Class34 != null) {
            if (GameCanvas.Class34.Class4 != null && GameCanvas.Class2(GameCanvas.Class25 - mScreen.Class5 >> 1, GameCanvas.Class26 - mScreen.Class6 - 5, mScreen.Class5, mScreen.Class6 + 10)) {
                mScreen.Class7 = 1;
                if (command == GameCanvas.Class34.Class4 && GameCanvas.Class15 && GameCanvas.Class16) {
                    return true;
                }
            }
            if (GameCanvas.Class34.Class3 != null && GameCanvas.Class2(0, GameCanvas.Class26 - mScreen.Class6 - 5, mScreen.Class5, mScreen.Class6 + 10)) {
                mScreen.Class7 = 0;
                if (command == GameCanvas.Class34.Class3 && GameCanvas.Class15 && GameCanvas.Class16) {
                    return true;
                }
            }
            if (GameCanvas.Class34.Class5 != null && GameCanvas.Class2(GameCanvas.Class25 - mScreen.Class5, GameCanvas.Class26 - mScreen.Class6 - 5, mScreen.Class5, mScreen.Class6 + 10)) {
                mScreen.Class7 = 2;
                if ((command == GameCanvas.Class34.Class5 || command == Game23.Class1().Class5) && GameCanvas.Class15 && GameCanvas.Class16) {
                    return true;
                }
            }
        }
        else {
            if (command == GameCanvas.Class29.left && GameCanvas.Class2(0, GameCanvas.Class26 - mScreen.Class6 - 5, mScreen.Class5, mScreen.Class6 + 10)) {
                mScreen.Class7 = 0;
                if (GameCanvas.Class15 && GameCanvas.Class16) {
                    return true;
                }
            }
            if (command == GameCanvas.Class29.right && GameCanvas.Class2(GameCanvas.Class25 - mScreen.Class5, GameCanvas.Class26 - mScreen.Class6 - 5, mScreen.Class5, mScreen.Class6 + 10)) {
                mScreen.Class7 = 2;
                if (GameCanvas.Class15 && GameCanvas.Class16) {
                    return true;
                }
            }
            if ((command == GameCanvas.Class29.center || ChatPopup.Class6 != null) && GameCanvas.Class2(GameCanvas.Class25 - mScreen.Class5 >> 1, GameCanvas.Class26 - mScreen.Class6 - 5, mScreen.Class5, mScreen.Class6 + 10)) {
                mScreen.Class7 = 1;
                if (GameCanvas.Class15 && GameCanvas.Class16) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void Class1(final mGraphics mGraphics) {
        mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        mGraphics.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26 + 1);
        Game25.Class1(mGraphics);
        if (ChatPopup.Class6 != null) {
            Game25.Class1(mGraphics, null, ChatPopup.Class6.Class5, null);
            return;
        }
        if (Game23.Class1().Class2) {
            Game25.Class1(mGraphics, Game23.Class1().Class4, Game23.Class1().Class6, Game23.Class1().Class5);
            return;
        }
        if (GameCanvas.Class34 == null && !GameCanvas.Class30.Class1) {
            Game25.Class1(mGraphics, this.left, this.center, this.right);
        }
    }
}
