import main.GameCanvas;
import java.util.Vector;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game97 extends Game21
{
    private int Class5;
    private int Class6;
    private int Class7;
    private short Class8;
    private int Class9;
    private int Class10;
    private int Class11;
    private boolean Class12;
    private int Class13;
    private int Class14;
    private int Class15;
    private Char Class16;
    private Game92 Class17;
    private boolean Class18;
    private int Class19;
    private int Class20;
    private static int Class21;
    private static Vector Class22;
    private static int Class23;
    private int Class24;
    private int Class25;
    private static byte[] Class26;
    private static int[] Class27;
    private static int[] Class28;
    
    static {
        Game97.Class22 = new Vector();
        Game97.Class23 = 0;
        Game97.Class26 = new byte[] { 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0 };
        Game97.Class27 = new int[] { 0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1 };
        Game97.Class28 = new int[] { 0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370 };
    }
    
    private void Class1(final int class5) {
        this.Class5 = class5;
        this.Class6 = this.Class8 * Res.Class2(class5) >> 10;
        this.Class7 = this.Class8 * Res.Class1(class5) >> 10;
    }
    
    public static void Class1(final int n, final int n2, final boolean b, final short class21, final int n3, final int n4, final int n5, final Char char1) {
        Game97.Class21 = class21;
        Game21.Class1.addElement(new Game97(n, n2, b, n3, n4, n5, char1));
    }
    
    public static void Class1(final int n, final int n2, final Game92 game92) {
        Game21.Class1.addElement(new Game97(n, n2, game92));
    }
    
    private Game97(final int class9, final int class10, final boolean class11, final int class12, final int class13, final int class14, final Char class15) {
        this.Class8 = 256;
        this.Class20 = 1;
        this.Class24 = 0;
        this.Class15 = 0;
        this.Class9 = class9;
        this.Class10 = class10;
        this.Class18 = class11;
        this.Class19 = class12;
        this.Class13 = class13;
        this.Class14 = class14;
        this.Class16 = class15;
        if (class11) {
            this.Class1(this.Class20 * 90);
            ++this.Class20;
            if (this.Class20 > 3) {
                this.Class20 = 1;
            }
        }
        else {
            if (class9 > class15.cx) {
                this.Class1(240);
                return;
            }
            this.Class1(300);
        }
    }
    
    private Game97(final int class9, final int class10, final Game92 class11) {
        this.Class8 = 256;
        this.Class20 = 1;
        this.Class24 = 0;
        this.Class15 = 1;
        this.Class9 = class9;
        this.Class10 = class10;
        this.Class17 = class11;
        if (class9 > class11.Class1) {
            this.Class1(240);
        }
        else {
            this.Class1(300);
        }
        this.Class8 = 256;
        this.Class5 = 180;
        this.Class6 = this.Class8 * Res.Class2(this.Class5) >> 10;
        this.Class7 = this.Class8 * Res.Class1(this.Class5) >> 10;
    }
    
    public final void switchToMe() {
        if (Game97.Class21 > 100) {
            Game97.Class22.addElement(new Game120(this.Class9, this.Class10, 2));
        }
        else if (Game97.Class21 > 50 && Game97.Class21 <= 100) {
            Game97.Class22.addElement(new Game120(this.Class9, this.Class10, 5));
        }
        else if (Game97.Class21 > 30 && Game97.Class21 <= 50) {
            Game97.Class22.addElement(new Game120(this.Class9, this.Class10, 4));
        }
        else if (Game97.Class21 > 0 && Game97.Class21 <= 30) {
            Game97.Class22.addElement(new Game120(this.Class9, this.Class10, 3));
        }
        Label_0557: {
            if (this.Class16 != null) {
                final int n = this.Class16.cx - this.Class9;
                final int n2 = this.Class16.cy - (this.Class16.Class59 >> 1) - this.Class10;
                ++this.Class11;
                if ((Res.abs(n) >= 16 || Res.abs(n2) >= 16) && this.Class11 <= 60) {
                    Label_0369: {
                        final int class1;
                        if (Math.abs((class1 = Res.Class1(n, n2)) - this.Class5) >= 90) {
                            final int n3 = n;
                            final int n4 = n3 * n3;
                            final int n5 = n2;
                            if (n4 + n5 * n5 <= 4096) {
                                break Label_0369;
                            }
                        }
                        if (Math.abs(class1 - this.Class5) < 15) {
                            this.Class5 = class1;
                        }
                        else if ((class1 - this.Class5 >= 0 && class1 - this.Class5 < 180) || class1 - this.Class5 < -180) {
                            this.Class5 = Res.Class3(this.Class5 + 15);
                        }
                        else {
                            this.Class5 = Res.Class3(this.Class5 - 15);
                        }
                    }
                    if (this.Class8 < 8192) {
                        this.Class8 += 1024;
                    }
                    this.Class6 = this.Class8 * Res.Class2(this.Class5) >> 10;
                    this.Class7 = this.Class8 * Res.Class1(this.Class5) >> 10;
                    final int n6 = n + this.Class6 >> 10;
                    this.Class9 += n6;
                    final int n7 = n2 + this.Class7 >> 10;
                    this.Class10 += n7;
                    final int class2 = Res.Class1(n6, -n7);
                    while (true) {
                        for (int i = 0; i < Game97.Class28.length - 1; ++i) {
                            if (class2 >= Game97.Class28[i] && class2 <= Game97.Class28[i + 1]) {
                                final int class3 = (i >= 16) ? 0 : i;
                                this.Class25 = class3;
                                this.Class24 = Game97.Class26[this.Class25];
                                Game97.Class23 = Game97.Class27[this.Class25];
                                break Label_0557;
                            }
                        }
                        final int class3 = 0;
                        continue;
                    }
                }
            }
        }
        int n8 = 0;
        int n9 = 0;
        if (this.Class15 == 0) {
            n8 = this.Class16.cx - this.Class9;
            n9 = this.Class16.cy - 10 - this.Class10;
            ++this.Class11;
            if (this.Class16.statusMe == 5 || this.Class16.statusMe == 14) {
                this.Class9 += (this.Class16.cx - this.Class9) / 2;
                this.Class10 += (this.Class16.cy - this.Class10) / 2;
            }
            if ((Res.abs(n8) < 16 && Res.abs(n9) < 16) || this.Class11 > 60) {
                this.Class16.Class1(this.Class13, this.Class14, this.Class18, this.Class19);
                Game21.Class1.removeElement(this);
                return;
            }
        }
        else if (this.Class15 == 1) {
            n8 = this.Class17.Class1 - this.Class9;
            n9 = this.Class17.Class2 - 10 - this.Class10;
            ++this.Class11;
            if ((Res.abs(n8) < 16 && Res.abs(n9) < 16) || this.Class11 > 60) {
                this.Class17.Class4 = true;
                Game21.Class1.removeElement(this);
                return;
            }
        }
        Label_0945: {
            final int class4;
            if (Math.abs((class4 = Res.Class1(n8, n9)) - this.Class5) >= 90) {
                final int n10 = n8;
                final int n11 = n10 * n10;
                final int n12 = n9;
                if (n11 + n12 * n12 <= 4096) {
                    break Label_0945;
                }
            }
            if (Math.abs(class4 - this.Class5) < 15) {
                this.Class5 = class4;
            }
            else if ((class4 - this.Class5 >= 0 && class4 - this.Class5 < 180) || class4 - this.Class5 < -180) {
                this.Class5 = Res.Class3(this.Class5 + 15);
            }
            else {
                this.Class5 = Res.Class3(this.Class5 - 15);
            }
        }
        this.Class9 += n8 + this.Class6 >> 10;
        this.Class10 += n9 + this.Class7 >> 10;
        for (int j = 0; j < Game97.Class22.size(); ++j) {
            final Game120 game120;
            (game120 = Game97.Class22.elementAt(j)).Class1();
            if (game120.Class1 > 3) {
                Game97.Class22.removeElementAt(j);
            }
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        if (this.Class18) {
            final int n = GameCanvas.gameTick % 7;
            if (this.Class19 == 114) {
                if (n < 4) {
                    Game2.Class1(mGraphics, 1299, this.Class9, this.Class10, 0, 3);
                    return;
                }
                Game2.Class1(mGraphics, 1307, this.Class9, this.Class10, 0, 3);
            }
            else if (this.Class19 == 115) {
                final int n2;
                if ((n2 = GameCanvas.gameTick % 20) < 4) {
                    Game2.Class1(mGraphics, 1379, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n2 < 8) {
                    Game2.Class1(mGraphics, 1380, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n2 < 12) {
                    Game2.Class1(mGraphics, 1379, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n2 < 16) {
                    Game2.Class1(mGraphics, 1382, this.Class9, this.Class10, 0, 3);
                }
            }
            else if (this.Class19 == 116) {
                final int n3;
                if ((n3 = GameCanvas.gameTick % 17) < 4) {
                    Game2.Class1(mGraphics, 1399, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n3 < 8) {
                    Game2.Class1(mGraphics, 1400, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n3 < 12) {
                    Game2.Class1(mGraphics, 1401, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n3 < 16) {
                    Game2.Class1(mGraphics, 1402, this.Class9, this.Class10, 0, 3);
                }
            }
            else if (this.Class19 == 139) {
                final int n4;
                if ((n4 = GameCanvas.gameTick % 20) < 4) {
                    Game2.Class1(mGraphics, 1459, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n4 < 8) {
                    Game2.Class1(mGraphics, 1380, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n4 < 12) {
                    Game2.Class1(mGraphics, 1461, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n4 < 16) {
                    Game2.Class1(mGraphics, 1382, this.Class9, this.Class10, 0, 3);
                }
            }
            else if (this.Class19 == 144 || this.Class19 == 163) {
                final int n5;
                if ((n5 = GameCanvas.gameTick % 20) < 4) {
                    Game2.Class1(mGraphics, 1459, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n5 < 8) {
                    Game2.Class1(mGraphics, 1380, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n5 < 12) {
                    Game2.Class1(mGraphics, 1461, this.Class9, this.Class10, 0, 3);
                    return;
                }
                if (n5 < 16) {
                    Game2.Class1(mGraphics, 1382, this.Class9, this.Class10, 0, 3);
                }
            }
        }
        else {
            if (Game97.Class21 > 100) {
                mGraphics.Class1(GameScr.Class145, 0, this.Class24 * 23, 31, 23, Game97.Class23, this.Class9, this.Class10, 0);
            }
            else if (Game97.Class21 > 50 && Game97.Class21 <= 100) {
                mGraphics.Class1(GameScr.Class145, 0, 0, 14, 14, Game97.Class23, this.Class9, this.Class10, 0);
            }
            else if (Game97.Class21 > 30 && Game97.Class21 <= 50) {
                mGraphics.Class1(GameScr.Class145, 0, 0, 8, 8, Game97.Class23, this.Class9, this.Class10, 0);
            }
            else if (Game97.Class21 > 0 && Game97.Class21 <= 30) {
                mGraphics.Class1(GameScr.Class145, 0, 0, 8, 8, Game97.Class23, this.Class9, this.Class10, 0);
            }
            for (int i = 0; i < Game97.Class22.size(); ++i) {
                final Game120 game120;
                if ((game120 = Game97.Class22.elementAt(i)) != null) {
                    game120.Class1(mGraphics);
                }
            }
        }
    }
}
