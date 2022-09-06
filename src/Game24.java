// 
// Decompiled by Procyon v0.5.36
// 

public final class Game24
{
    public int Class1;
    public int Class2;
    public int Class3;
    int Class4;
    int Class5;
    private int Class10;
    private int Class11;
    private int Class12;
    private int Class13;
    private Char Class14;
    Game51 Class6;
    static byte[] Class7;
    static int[] Class8;
    static int[] Class9;
    
    static {
        Game24.Class7 = new byte[] { 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0 };
        Game24.Class8 = new int[] { 0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370 };
        Game24.Class9 = new int[] { 0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1 };
    }
    
    public Game24(final Char class14, final Game51 class15) {
        this.Class1 = 0;
        this.Class6 = null;
        this.Class14 = class14;
        this.Class6 = class15;
    }
    
    public final void Class1() {
        if (this.Class14.mobFocus != null || this.Class14.charFocus != null) {
            if (this.Class14.mobFocus != null) {
                this.Class4 = this.Class14.mobFocus.x;
                this.Class5 = this.Class14.mobFocus.y - this.Class14.mobFocus.Class12 / 4;
            }
            else if (this.Class14.charFocus != null) {
                this.Class4 = this.Class14.charFocus.cx;
                this.Class5 = this.Class14.charFocus.cy - this.Class14.charFocus.Class59 / 4;
            }
            final int n = this.Class4 - this.Class2;
            final int n2 = this.Class5 - this.Class3;
            int n3 = 4;
            if (n + n2 < 60) {
                n3 = 3;
            }
            else if (n + n2 < 30) {
                n3 = 2;
            }
            if (this.Class2 != this.Class4) {
                if (n > 0 && n < 5) {
                    this.Class2 = this.Class4;
                }
                else if (n < 0 && n > -5) {
                    this.Class2 = this.Class4;
                }
                else {
                    this.Class10 = this.Class4 - this.Class2 << 2;
                    this.Class12 += this.Class10;
                    this.Class2 += this.Class12 >> n3;
                    this.Class12 &= 0xF;
                }
            }
            if (this.Class3 != this.Class5) {
                if (n2 > 0 && n2 < 5) {
                    this.Class3 = this.Class5;
                }
                else if (n2 < 0 && n2 > -5) {
                    this.Class3 = this.Class5;
                }
                else {
                    this.Class11 = this.Class5 - this.Class3 << 2;
                    this.Class13 += this.Class11;
                    this.Class3 += this.Class13 >> n3;
                    this.Class13 &= 0xF;
                }
            }
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            if (this.Class14.mobFocus != null) {
                n4 = this.Class4 - this.Class14.mobFocus.Class11 / 4;
                n6 = this.Class4 + this.Class14.mobFocus.Class11 / 4;
                n5 = this.Class5 - this.Class14.mobFocus.Class12 / 4;
                n7 = this.Class5 + this.Class14.mobFocus.Class12 / 4;
            }
            else if (this.Class14.charFocus != null) {
                n4 = this.Class4 - this.Class14.charFocus.Class58 / 4;
                n6 = this.Class4 + this.Class14.charFocus.Class58 / 4;
                n5 = this.Class5 - this.Class14.charFocus.Class59 / 4;
                n7 = this.Class5 + this.Class14.charFocus.Class59 / 4;
            }
            if (this.Class1 > 0) {
                --this.Class1;
            }
            if (this.Class1 != 0 && (this.Class2 < n4 || this.Class2 > n6 || this.Class3 < n5 || this.Class3 > n7)) {
                return;
            }
        }
        this.Class14.Class149 = null;
        final int n8 = 0;
        this.Class13 = n8;
        this.Class12 = n8;
        this.Class11 = n8;
        this.Class10 = n8;
        this.Class5 = n8;
        this.Class4 = n8;
        this.Class3 = n8;
        this.Class2 = n8;
        this.Class14.Class14();
        if (this.Class14.Class61) {
            this.Class14.Class9();
        }
    }
    
    private void Class2() {
        this.Class14.Class149 = null;
        final int n = 0;
        this.Class13 = n;
        this.Class12 = n;
        this.Class11 = n;
        this.Class10 = n;
        this.Class5 = n;
        this.Class4 = n;
        this.Class3 = n;
        this.Class2 = n;
        this.Class14.Class14();
        if (this.Class14.Class61) {
            this.Class14.Class9();
        }
    }
    
    private void Class1(final mGraphics mGraphics) {
        final int class1 = Res.Class1(this.Class4 - this.Class2, -(this.Class5 - this.Class3));
        while (true) {
            for (int i = 0; i < Game24.Class8.length - 1; ++i) {
                if (class1 >= Game24.Class8[i] && class1 <= Game24.Class8[i + 1]) {
                    final int n = (i >= 16) ? 0 : i;
                    final int n2 = n;
                    Game2.Class1(mGraphics, this.Class6.Class1[Game24.Class7[n2]], this.Class2, this.Class3, Game24.Class9[n2], 3);
                    return;
                }
            }
            final int n = 0;
            continue;
        }
    }
}
