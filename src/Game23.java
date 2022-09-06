import main.Game2;
import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game23 implements IActionListener
{
    private static Game23 Class7;
    public TField Class1;
    public boolean Class2;
    GameScr Class3;
    private long Class8;
    public Command Class4;
    public Command Class5;
    public Command Class6;
    private String Class9;
    
    public static Game23 Class1() {
        if (Game23.Class7 == null) {
            return Game23.Class7 = new Game23();
        }
        return Game23.Class7;
    }
    
    protected Game23() {
        this.Class2 = false;
        this.Class8 = 0L;
        this.Class4 = new Command(Game86.Class75, this, 8000, null, 1, GameCanvas.Class26 - mScreen.Class6 + 1);
        this.Class5 = new Command(Game86.Class49, this, 8001, null, GameCanvas.Class25 - 53, GameCanvas.Class26 - mScreen.Class6 + 1);
        this.Class6 = null;
        this.Class1 = new TField();
        this.Class1.Class22 = "chat";
        this.Class1.Class1 = 16;
        this.Class1.Class3 = Game2.Class1.Class2() - 32;
        this.Class1.Class4 = mScreen.Class4 + 2;
        this.Class1.Class5 = true;
        this.Class1.Class14 = 40;
    }
    
    public final void Class1(final int n, final GameScr class3, final String s) {
        this.Class5.Class1 = Game86.CLOSE;
        this.Class9 = s;
        this.Class1.Class1(n);
        if (!this.Class1.Class9.equals("") && GameCanvas.Class34 == null) {
            this.Class3 = class3;
            this.Class2 = true;
        }
        this.Class1.Class8 = s;
    }
    
    public final void setText(final String s) {
        this.Class5.Class1 = Game86.CLOSE;
        this.Class9 = s;
        if (GameCanvas.Class34 == null) {
            this.Class2 = true;
            if (GameCanvas.Class6) {
                this.Class1.switchToMe();
            }
        }
        this.Class1.Class8 = s;
    }
    
    public final void perform(final int n, final Object o) {
        switch (n) {
            case 8000: {
                if (this.Class3 == null) {
                    break;
                }
                final long currentTimeMillis;
                if ((currentTimeMillis = System.currentTimeMillis()) - this.Class8 < 1000L) {
                    return;
                }
                this.Class8 = currentTimeMillis;
                GameScr.Class1(this.Class1.Class9, this.Class9);
                this.Class1.setText("");
                this.Class5.Class1 = Game86.CLOSE;
            }
            case 8001: {
                this.Class1.Class2();
                if (!this.Class1.Class9.equals("")) {
                    break;
                }
                this.Class2 = false;
                final GameScr class3 = this.Class3;
                if (GameScr.Class96) {
                    class3.Class34();
                    GameScr.Class96 = false;
                    Class1().Class6 = null;
                    break;
                }
                break;
            }
        }
    }
}
