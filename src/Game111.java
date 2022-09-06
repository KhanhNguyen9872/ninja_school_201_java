import main.GameMidlet;
import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game111 extends mScreen implements IActionListener
{
    private int Class8;
    private int Class9;
    private int Class10;
    private int Class11;
    private int Class12;
    
    public Game111() {
        this.Class12 = -1;
    }
    
    public final void switchToMe() {
        GameScr.Class10 = GameCanvas.Class26;
        if (GameCanvas.Class44 == 2) {
            GameCanvas.Class2(0);
        }
        else {
            GameCanvas.Class2(TileMap.Class13);
        }
        super.switchToMe();
        if (GameScr.Class8 != null) {
            GameScr.Class8 = null;
        }
        if ((TileMap.Class13 = (byte)(System.currentTimeMillis() % 9L)) == 5 || TileMap.Class13 == 6) {
            TileMap.Class13 = 4;
        }
        GameScr.Class1(true);
        GameScr.Class16 = 100;
        this.Class8 = 170;
        this.Class9 = 175;
        if (GameCanvas.Class25 == 128 || GameCanvas.Class26 <= 208) {
            this.Class8 = 126;
            this.Class9 = 160;
        }
        this.Class10 = GameCanvas.Class25 / 2 - this.Class8 / 2;
        this.Class11 = GameCanvas.Class26 / 2 - this.Class9 / 2;
        if (GameCanvas.Class26 <= 250) {
            this.Class11 -= 10;
        }
        super.center = new Command(GameCanvas.Class6 ? "" : Game86.Class76, this, 1000, null);
        super.right = new Command(Game86.Class74, GameCanvas.instance, 8885, null);
        this.Class12 = -1;
        if (!GameCanvas.Class6) {
            this.Class12 = 0;
        }
        if (GameCanvas.Class6 && GameCanvas.Class25 >= 320) {
            super.center.Class6 = GameCanvas.Class25 / 2 - 35;
            super.right.Class6 = GameCanvas.Class25 / 2 + 88;
            final Command center = super.center;
            final Command right = super.right;
            final int n = GameCanvas.Class26 - 26;
            right.Class7 = n;
            center.Class7 = n;
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        mGraphics.setColor(0);
        mGraphics.fillRect(0, 0, GameCanvas.Class25, GameCanvas.Class26);
        GameCanvas.Class1(mGraphics);
        Game25.Class1(this.Class10, this.Class11, this.Class8, this.Class9, mGraphics);
        mGraphics.setColor(Game25.Class3);
        mGraphics.Class2(GameCanvas.Class27 - mFont.Class17.Class1(Game86.Class30) / 2 - 12, this.Class11 + 7, mFont.Class17.Class1(Game86.Class30) + 22, 24, 6, 6);
        mGraphics.setColor(Game25.Class2);
        mGraphics.Class1(GameCanvas.Class27 - mFont.Class17.Class1(Game86.Class30) / 2 - 12, this.Class11 + 7, mFont.Class17.Class1(Game86.Class30) + 22, 24, 6, 6);
        mFont.Class17.Class1(mGraphics, Game86.Class30, GameCanvas.Class27, this.Class11 + 12, 2);
        final String[] class32 = Game86.Class32;
        final int n = this.Class11 + 50;
        for (int i = 0; i < class32.length; ++i) {
            mGraphics.setColor(Game25.Class3);
            mGraphics.fillRect(this.Class10 + 10, n + i * 35, this.Class8 - 20, 28);
            mGraphics.setColor(5720393);
            mGraphics.Class2(this.Class10 + 10, n + i * 35, this.Class8 - 20, 28);
            if (i == this.Class12) {
                mGraphics.setColor(Game25.Class2);
                mGraphics.fillRect(this.Class10 + 10, n + i * 35, this.Class8 - 20, 28);
                mGraphics.setColor(11053224);
                mGraphics.Class2(this.Class10 + 10, n + i * 35, this.Class8 - 20, 28);
            }
            mFont.Class7.Class1(mGraphics, class32[i], this.Class10 + this.Class8 / 2, n + i * 35 + 8, 2);
        }
        super.Class1(mGraphics);
        Game25.Class1(mGraphics, super.left, super.center, super.right);
    }
    
    public static void Class2(final int n) {
        TaskOrder.Class1("indLanguage", n);
    }
    
    private static int Class6() {
        return TaskOrder.Class3("indLanguage");
    }
    
    public final void Class4() {
        if (++GameScr.Class16 > GameCanvas.Class25 * 3 + 100) {
            GameScr.Class16 = 100;
        }
        super.Class4();
    }
    
    public final void Class5() {
        if (GameCanvas.Class12[2] || GameCanvas.Class12[4] || GameCanvas.Class12[6] || GameCanvas.Class12[8]) {
            this.Class12 = ((this.Class12 == 0) ? 1 : 0);
        }
        if (GameCanvas.Class16 && GameCanvas.Class2(this.Class10 + 10, this.Class11 + 45, this.Class8 - 10, 70)) {
            if (GameCanvas.Class15) {
                this.Class12 = (GameCanvas.Class18 - (this.Class11 + 45)) / 35;
            }
            this.perform(1000, null);
        }
        super.Class5();
        GameCanvas.Class7();
    }
    
    public final void perform(final int n, final Object o) {
        switch (n) {
            case 1000: {
                GameCanvas.Class34 = null;
                TaskOrder.Class1();
                GameCanvas.Class2();
                GameMidlet.Class8 = (this.Class12 != 0);
                Game69.Class2(GameMidlet.Class4());
                GameCanvas.Class31.switchToMe();
                break;
            }
        }
    }
}
