import javax.microedition.lcdui.Image;
import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class InputDlg extends Game108
{
    private String[] Class2;
    public TField tfInput;
    private int Class6;
    
    public InputDlg() {
        this.Class6 = 40;
        if (GameCanvas.Class25 <= 176) {
            this.Class6 = 10;
        }
        this.tfInput = new TField();
        this.tfInput.Class1 = this.Class6 + 10;
        this.tfInput.Class2 = GameCanvas.Class26 - mScreen.Class4 - 43;
        this.tfInput.Class3 = GameCanvas.Class25 - 2 * (this.Class6 + 10);
        this.tfInput.Class4 = mScreen.Class4 + 2;
        this.tfInput.Class5 = true;
        super.Class5 = this.tfInput.Class23;
    }
    
    public final void show(final String s, final Command class4, final int class5) {
        try {
            this.tfInput.setText("");
            this.tfInput.Class18 = class5;
            this.Class2 = mFont.Class17.Class2(s, GameCanvas.Class25 - (this.Class6 << 1));
            super.Class3 = new Command(Game86.CLOSE, GameCanvas.Class1(), 8882, null);
            super.Class4 = class4;
            if (super.Class3 != null) {
                super.Class3.Class6 = GameCanvas.Class25 / 2 - 160;
                super.Class3.Class7 = GameCanvas.Class26 - 26;
            }
            if (super.Class4 != null) {
                super.Class4.Class6 = GameCanvas.Class25 / 2 - 35;
                super.Class4.Class7 = GameCanvas.Class26 - 26;
            }
            if (super.Class5 != null) {
                super.Class5.Class6 = GameCanvas.Class25 / 2 + 88;
                super.Class5.Class7 = GameCanvas.Class26 - 26;
            }
            GameCanvas.Class34 = this;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        final Game25 class38 = GameCanvas.Class38;
        Game25.Class1(mGraphics, this.Class6, GameCanvas.Class26 - 77 - mScreen.Class6, GameCanvas.Class25 - (this.Class6 << 1), 69, this.Class2, null);
        this.tfInput.Class1(mGraphics);
        super.Class1(mGraphics);
    }
    
    public final void Class1(final int n) {
        this.tfInput.Class1(n);
        super.Class1(n);
    }
    
    public final void Class2() {
        this.tfInput.Class3();
        super.Class2();
    }
}
