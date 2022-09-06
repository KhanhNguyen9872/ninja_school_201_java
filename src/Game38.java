import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game38
{
    int Class1;
    int Class2;
    int Class3;
    int Class4;
    int Class5;
    int Class6;
    int Class7;
    Char Class8;
    int[] Class9;
    int[] Class10;
    int[] Class11;
    
    public Game38(final int n, final int class2, final Char class3) {
        this.Class1 = n;
        this.Class2 = class2;
        this.Class3 = n;
        this.Class4 = class2 - (Res.Class4(40) + 20);
        this.Class5 = 1;
        this.Class7 = 1;
        this.Class8 = class3;
    }
    
    public Game38(final int class3, final int class4) {
        this.Class5 = 1;
        this.Class7 = 2;
        this.Class3 = class3;
        this.Class4 = class4;
        this.Class9 = new int[5];
        this.Class10 = new int[5];
        this.Class11 = new int[5];
        this.Class6 = 300;
        for (int i = 0; i < this.Class9.length; ++i) {
            this.Class9[i] = Res.Class2(class3 - 20, class3 + 20);
            this.Class10[i] = class4 - 10;
            final int[] class5 = this.Class11;
            final int n = i;
            class5[n] = ((n % 2 == 0) ? 1 : -1);
        }
    }
    
    private void Class1() {
        if (this.Class7 == 1) {
            if (this.Class8 == null) {
                GameScr.Class30.removeElement(this);
                return;
            }
            if (this.Class5 == 1) {
                if (this.Class2 > this.Class4) {
                    this.Class2 -= 2;
                    this.Class1 += 1 - GameCanvas.gameTick % 3;
                }
                else {
                    this.Class5 = 2;
                }
                this.Class6 = 100;
                return;
            }
            --this.Class6;
            if (Res.abs(this.Class8.cx - this.Class1) < 50 || Res.abs(this.Class8.cy - this.Class2) < 50) {
                this.Class1 += (this.Class8.cx - this.Class1) / 4;
                this.Class2 += (this.Class8.cy - this.Class2) / 4;
            }
            else {
                this.Class1 += (this.Class8.cx - this.Class1) / 10;
                this.Class2 += (this.Class8.cy - this.Class2) / 10;
            }
            if (this.Class6 < 0) {
                this.Class1 = this.Class8.cx;
                this.Class2 = this.Class8.cy - this.Class8.Class59 / 2;
                if (this.Class6 < -5) {
                    GameScr.Class30.removeElement(this);
                }
            }
            else if (Res.abs(this.Class8.cx - this.Class1) < 10 && Res.abs(this.Class8.cy - this.Class2) < 10) {
                GameScr.Class30.removeElement(this);
            }
        }
        else if (this.Class7 == 2) {
            for (int i = 0; i < this.Class9.length; ++i) {
                final int[] class10 = this.Class10;
                final int n = i;
                class10[n] -= GameCanvas.gameTick % 5;
                if (this.Class11[i] == -1) {
                    final int[] class11 = this.Class9;
                    final int n2 = i;
                    --class11[n2];
                }
                else {
                    final int[] class12 = this.Class9;
                    final int n3 = i;
                    ++class12[n3];
                }
                if (this.Class9[i] <= this.Class3 - 20 || this.Class9[i] >= this.Class3 + 20) {
                    final int n4 = i;
                    final int[] class13 = this.Class11;
                    class13[n4] = -class13[i];
                }
                if (this.Class10[i] < 0) {
                    GameScr.Class30.removeElement(this);
                }
            }
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        if (this.Class7 != 1) {
            for (int i = 0; i < this.Class9.length; ++i) {
                if (GameCanvas.gameTick % 5 > 2) {
                    Game2.Class1(mGraphics, 1433, this.Class9[i], this.Class10[i], 0, 3);
                }
                else {
                    Game2.Class1(mGraphics, 1434, this.Class9[i], this.Class10[i], 0, 3);
                }
            }
            return;
        }
        if (GameCanvas.gameTick % 5 > 2) {
            Game2.Class1(mGraphics, 1433, this.Class1, this.Class2, 0, 3);
            return;
        }
        Game2.Class1(mGraphics, 1434, this.Class1, this.Class2, 0, 3);
    }
}
