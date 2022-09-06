import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game16 extends Game21
{
    private Game106 Class5;
    private int Class6;
    private int Class7;
    private int Class8;
    private int Class9;
    private Char Class10;
    private short Class11;
    private long Class12;
    
    public Game16() {
        this.Class9 = 1;
        this.Class11 = 0;
        this.Class12 = 0L;
    }
    
    public static void Class1(final int n, final int class7, final int class8, final int n2) {
        final Game16 game16;
        (game16 = new Game16()).Class5 = GameScr.efs[n];
        game16.Class7 = class7;
        game16.Class8 = class8;
        game16.Class11 = (short)n2;
        Game21.Class1.addElement(game16);
    }
    
    public static void Class1(final int n, final int class7, final int class8, final int n2, final byte class9) {
        final Game16 game16;
        (game16 = new Game16()).Class5 = GameScr.efs[n];
        game16.Class7 = class7;
        game16.Class8 = class8;
        game16.Class11 = (short)n2;
        game16.Class9 = class9;
        Game21.Class1.addElement(game16);
    }
    
    public static void Class1(final int n, final Char class10, final int n2) {
        final Game16 game16;
        (game16 = new Game16()).Class5 = GameScr.efs[n];
        game16.Class10 = class10;
        game16.Class11 = (short)n2;
        Game21.Class1.addElement(game16);
    }
    
    public static void Class2(final int n, final Char class10, final int n2) {
        final Game16 game16;
        (game16 = new Game16()).Class5 = GameScr.efs[n];
        game16.Class10 = class10;
        game16.Class12 = System.currentTimeMillis() + n2 * 1000;
        Game21.Class1.addElement(game16);
    }
    
    public final void Class1(final mGraphics mGraphics) {
        if (this.Class10 != null) {
            this.Class7 = this.Class10.cx;
            this.Class8 = this.Class10.cy;
        }
        final int n = this.Class7 + this.Class5.Class2[this.Class6].Class1 * this.Class9;
        final int n2 = this.Class8 + this.Class5.Class2[this.Class6].Class2;
        if (GameCanvas.Class5(n, n2)) {
            Game2.Class1(mGraphics, this.Class5.Class2[this.Class6].Class3, n, n2, (this.Class9 == 1) ? 0 : 2, 3);
        }
    }
    
    public final void switchToMe() {
        if (this.Class12 != 0L) {
            ++this.Class6;
            if (this.Class6 >= this.Class5.Class2.length) {
                this.Class6 = 0;
            }
            if (System.currentTimeMillis() - this.Class12 > 0L) {
                if (this.Class5.Class1 == 120) {
                    GameCanvas.Class4 = false;
                }
                Game21.Class1.removeElement(this);
            }
        }
        else {
            ++this.Class6;
            if (this.Class6 >= this.Class5.Class2.length) {
                --this.Class11;
                if (this.Class11 <= 0) {
                    if (this.Class5.Class1 == 120) {
                        GameCanvas.Class4 = false;
                    }
                    Game21.Class1.removeElement(this);
                }
                else {
                    this.Class6 = 0;
                }
            }
        }
        if (GameCanvas.gameTick % 11 == 0 && this.Class10 != null && this.Class10 != Char.getMyChar() && !GameScr.vCharInMap.contains(this.Class10)) {
            Game21.Class1.removeElement(this);
        }
    }
}
