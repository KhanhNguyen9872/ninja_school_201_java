import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game50
{
    private int Class9;
    private int Class10;
    public int Class1;
    public int Class2;
    private int Class11;
    private int Class12;
    private int Class13;
    private int Class14;
    public int Class3;
    public int Class4;
    public int Class5;
    public int Class6;
    private int Class15;
    private int Class16;
    public static Game50 Class7;
    private int Class17;
    private int Class18;
    private int[] Class19;
    private boolean Class20;
    private boolean Class21;
    private int Class22;
    private int Class23;
    public int Class8;
    private int Class24;
    private boolean Class25;
    
    public Game50() {
        this.Class19 = new int[3];
        this.Class25 = true;
    }
    
    public final void Class1() {
        this.Class9 = 0;
        this.Class10 = 0;
        this.Class1 = 0;
        this.Class2 = 0;
        this.Class11 = 0;
        this.Class12 = 0;
        this.Class13 = 0;
        this.Class14 = 0;
        this.Class15 = 0;
        this.Class16 = 0;
        this.Class5 = 0;
        this.Class6 = 0;
    }
    
    public final void Class1(final mGraphics mGraphics, final int n, final int n2, final int n3, final int n4) {
        mGraphics.Class4(n, n2, n3, n4 - 1);
        mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        mGraphics.Class1(-this.Class1, -this.Class2);
    }
    
    public final void Class1(final mGraphics mGraphics) {
        mGraphics.Class4(this.Class3, this.Class4, this.Class5, this.Class6 - 1);
        mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        mGraphics.Class1(-this.Class1, -this.Class2);
    }
    
    public final Game68 Class2() {
        if (this.Class25) {
            final int class3 = this.Class3;
            final int class4 = this.Class4;
            final int class5 = this.Class5;
            final int class6 = this.Class6;
            if (GameCanvas.Class14) {
                if (!this.Class20 && GameCanvas.Class3(class3, class4, class5, class6)) {
                    for (int i = 0; i < this.Class19.length; ++i) {
                        this.Class19[0] = GameCanvas.Class18;
                    }
                    this.Class18 = GameCanvas.Class18;
                    this.Class20 = true;
                    this.Class23 = -1;
                    this.Class21 = (this.Class22 != 0);
                    this.Class22 = 0;
                }
                else if (this.Class20) {
                    ++this.Class17;
                    if (this.Class17 > 5 && this.Class18 == GameCanvas.Class18 && !this.Class21) {
                        this.Class18 = -1000;
                        if (this.Class24 > 1) {
                            this.Class23 = (this.Class10 + GameCanvas.Class18 - class4) / this.Class8 * this.Class24 + (this.Class9 + GameCanvas.Class17 - class3) / this.Class8;
                        }
                        else {
                            this.Class23 = (this.Class10 + GameCanvas.Class18 - class4) / this.Class8;
                        }
                    }
                    int n;
                    if ((n = GameCanvas.Class18 - this.Class19[0]) != 0 && this.Class23 != -1) {
                        this.Class23 = -1;
                    }
                    for (int j = this.Class19.length - 1; j > 0; --j) {
                        final int n2 = j;
                        final int[] class7 = this.Class19;
                        class7[n2] = class7[j - 1];
                    }
                    this.Class19[0] = GameCanvas.Class18;
                    this.Class10 -= n;
                    if (this.Class10 < 0) {
                        this.Class10 = 0;
                    }
                    if (this.Class10 > this.Class16) {
                        this.Class10 = this.Class16;
                    }
                    if (this.Class2 < 0 || this.Class2 > this.Class16) {
                        n /= 2;
                    }
                    this.Class2 -= n;
                }
            }
            boolean class8 = false;
            if (GameCanvas.Class16 && this.Class20) {
                final int n3 = GameCanvas.Class18 - this.Class19[0];
                GameCanvas.Class16 = false;
                if (Res.abs(n3) < 20 && Res.abs(GameCanvas.Class18 - this.Class18) < 20 && !this.Class21) {
                    this.Class22 = 0;
                    this.Class10 = this.Class2;
                    this.Class18 = -1000;
                    if (this.Class24 > 1) {
                        this.Class23 = (this.Class10 + GameCanvas.Class18 - class4) / this.Class8 * this.Class24 + (this.Class9 + GameCanvas.Class17 - class3) / this.Class8;
                    }
                    else {
                        this.Class23 = (this.Class10 + GameCanvas.Class18 - class4) / this.Class8;
                    }
                    this.Class17 = 0;
                    class8 = true;
                }
                else if (this.Class23 != -1 && this.Class17 > 5) {
                    this.Class17 = 0;
                    class8 = true;
                }
                else if (this.Class23 == -1 && !this.Class21) {
                    if (this.Class2 < 0) {
                        this.Class10 = 0;
                    }
                    else if (this.Class2 > this.Class16) {
                        this.Class10 = this.Class16;
                    }
                    else {
                        final int n4;
                        int n5;
                        if ((n4 = GameCanvas.Class18 - this.Class19[0] + (this.Class19[0] - this.Class19[1]) + (this.Class19[1] - this.Class19[2])) > 10) {
                            n5 = 10;
                        }
                        else if (n4 < -10) {
                            n5 = -10;
                        }
                        else {
                            n5 = 0;
                        }
                        this.Class22 = -n5 * 100;
                    }
                }
                this.Class20 = false;
                this.Class17 = 0;
                GameCanvas.Class16 = false;
            }
            final Game68 game68;
            (game68 = new Game68()).Class2 = this.Class23;
            game68.Class3 = class8;
            game68.Class1 = this.Class20;
            return game68;
        }
        final int class9 = this.Class3;
        final int class10 = this.Class4;
        final int class11 = this.Class5;
        final int class12 = this.Class6;
        if (GameCanvas.Class14) {
            if (!this.Class20 && GameCanvas.Class3(class9, class10, class11, class12)) {
                for (int k = 0; k < this.Class19.length; ++k) {
                    this.Class19[0] = GameCanvas.Class17;
                }
                this.Class18 = GameCanvas.Class17;
                this.Class20 = true;
                this.Class23 = -1;
                this.Class21 = (this.Class22 != 0);
                this.Class22 = 0;
            }
            else if (this.Class20) {
                ++this.Class17;
                if (this.Class17 > 5 && this.Class18 == GameCanvas.Class17 && !this.Class21) {
                    this.Class18 = -1000;
                    this.Class23 = (this.Class9 + GameCanvas.Class17 - class9) / this.Class8;
                }
                int n6;
                if ((n6 = GameCanvas.Class17 - this.Class19[0]) != 0 && this.Class23 != -1) {
                    this.Class23 = -1;
                }
                for (int l = this.Class19.length - 1; l > 0; --l) {
                    final int n7 = l;
                    final int[] class13 = this.Class19;
                    class13[n7] = class13[l - 1];
                }
                this.Class19[0] = GameCanvas.Class17;
                this.Class9 -= n6;
                if (this.Class9 < 0) {
                    this.Class9 = 0;
                }
                if (this.Class9 > this.Class15) {
                    this.Class9 = this.Class15;
                }
                if (this.Class1 < 0 || this.Class1 > this.Class15) {
                    n6 /= 2;
                }
                this.Class1 -= n6;
            }
        }
        boolean class14 = false;
        if (GameCanvas.Class16 && this.Class20) {
            final int n8 = GameCanvas.Class17 - this.Class19[0];
            GameCanvas.Class16 = false;
            if (Res.abs(n8) < 20 && Res.abs(GameCanvas.Class17 - this.Class18) < 20 && !this.Class21) {
                this.Class22 = 0;
                this.Class9 = this.Class1;
                this.Class18 = -1000;
                this.Class23 = (this.Class9 + GameCanvas.Class17 - class9) / this.Class8;
                this.Class17 = 0;
                class14 = true;
            }
            else if (this.Class23 != -1 && this.Class17 > 5) {
                this.Class17 = 0;
                class14 = true;
            }
            else if (this.Class23 == -1 && !this.Class21) {
                if (this.Class1 < 0) {
                    this.Class9 = 0;
                }
                else if (this.Class1 > this.Class15) {
                    this.Class9 = this.Class15;
                }
                else {
                    final int n9;
                    int n10;
                    if ((n9 = GameCanvas.Class17 - this.Class19[0] + (this.Class19[0] - this.Class19[1]) + (this.Class19[1] - this.Class19[2])) > 10) {
                        n10 = 10;
                    }
                    else if (n9 < -10) {
                        n10 = -10;
                    }
                    else {
                        n10 = 0;
                    }
                    this.Class22 = -n10 * 100;
                }
            }
            this.Class20 = false;
            this.Class17 = 0;
            GameCanvas.Class16 = false;
        }
        final Game68 game69;
        (game69 = new Game68()).Class2 = this.Class23;
        game69.Class3 = class14;
        game69.Class1 = this.Class20;
        return game69;
    }
    
    public final void Class3() {
        if (this.Class22 != 0 && !this.Class20) {
            if (this.Class25) {
                this.Class10 += this.Class22 / 100;
                if (this.Class10 < 0) {
                    this.Class10 = 0;
                }
                else if (this.Class10 > this.Class16) {
                    this.Class10 = this.Class16;
                }
                else {
                    this.Class2 = this.Class10;
                }
            }
            else {
                this.Class9 += this.Class22 / 100;
                if (this.Class9 < 0) {
                    this.Class9 = 0;
                }
                else if (this.Class9 > this.Class15) {
                    this.Class9 = this.Class15;
                }
                else {
                    this.Class1 = this.Class9;
                }
            }
            this.Class22 = this.Class22 * 9 / 10;
            if (this.Class22 < 100 && this.Class22 > -100) {
                this.Class22 = 0;
            }
        }
        if (this.Class1 != this.Class9 && !this.Class20) {
            this.Class11 = this.Class9 - this.Class1 << 2;
            this.Class13 += this.Class11;
            this.Class1 += this.Class13 >> 4;
            this.Class13 &= 0xF;
        }
        if (this.Class2 != this.Class10 && !this.Class20) {
            this.Class12 = this.Class10 - this.Class2 << 2;
            this.Class14 += this.Class12;
            this.Class2 += this.Class14 >> 4;
            this.Class14 &= 0xF;
        }
    }
    
    public final void Class1(final int n, final int class8, final int class9, final int class10, final int class11, final int class12, final boolean class13, final int class14) {
        this.Class3 = class9;
        this.Class4 = class10;
        this.Class8 = class8;
        this.Class5 = class11;
        this.Class6 = class12;
        this.Class25 = class13;
        this.Class24 = class14;
        if (class13) {
            this.Class16 = n * class8 - class12;
        }
        else {
            this.Class15 = n * class8 - class11;
        }
        if (this.Class16 < 0) {
            this.Class16 = 0;
        }
        if (this.Class15 < 0) {
            this.Class15 = 0;
        }
    }
    
    public final void Class1(int n) {
        if (this.Class25) {
            n -= (this.Class6 - this.Class8) / 2;
            this.Class10 = n;
            if (this.Class10 < 0) {
                this.Class10 = 0;
            }
            if (this.Class10 > this.Class16) {
                this.Class10 = this.Class16;
            }
        }
        else {
            n -= (this.Class5 - this.Class8) / 2;
            this.Class9 = n;
            if (this.Class9 < 0) {
                this.Class9 = 0;
            }
            if (this.Class9 > this.Class15) {
                this.Class9 = this.Class15;
            }
        }
    }
}
