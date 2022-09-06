// 
// Decompiled by Procyon v0.5.36
// 

public class Game19
{
    public MyVector Class1;
    
    public Game19() {
        this.Class1 = new MyVector();
    }
    
    public final void Class1(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        for (int i = 0; i < this.Class1.size(); ++i) {
            final Game123 game123;
            if ((game123 = (Game123)this.Class1.elementAt(i)) != null) {
                int n4 = n2;
                if (game123.Class10) {
                    n4 = n2 + n3 + 4;
                }
                final Game123 game124 = game123;
                final int n5 = n4;
                final Game123 game125 = game124;
                try {
                    if (game125.Class1()) {
                        if (!game125.Class23) {
                            if (game125.Class5 < game125.Class2.size()) {
                                final MyVector class4 = ((RMS)game125.Class2.elementAt(game125.Class5)).Class4;
                                for (int j = 0; j < class4.size(); ++j) {
                                    final Game66 game126 = (Game66)class4.elementAt(j);
                                    final Game2 game127 = game125.Class3[game126.Class1];
                                    final Game82 class5;
                                    if ((class5 = Game75.Class1(game125.Class8)) != null && class5.Class1 != null) {
                                        final short class6 = game126.Class2;
                                        int class7 = game127.Class4;
                                        int class8 = game127.Class5;
                                        int class9 = game127.Class2;
                                        int class10 = game127.Class3;
                                        if (class9 > class5.Class1.getWidth()) {
                                            class9 = 0;
                                        }
                                        if (class10 > class5.Class1.getHeight()) {
                                            class10 = 0;
                                        }
                                        if (class9 + class7 > class5.Class1.getWidth()) {
                                            class7 = class5.Class1.getWidth() - class9;
                                        }
                                        if (class10 + class8 > class5.Class1.getHeight()) {
                                            class8 = class5.Class1.getHeight() - class10;
                                        }
                                        mGraphics.Class1(class5.Class1, class9, class10, class7, class8, (game126.Class4 == 1) ? 2 : 0, n + class6, n5 + game126.Class3, 0);
                                    }
                                }
                            }
                        }
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    System.err.println("Err DataSkillEff  paintBottomEff:" + game125.Class8);
                }
            }
        }
    }
    
    public final void Class2(final mGraphics mGraphics, final int n, final int n2, final int n3) {
        for (int i = 0; i < this.Class1.size(); ++i) {
            final Game123 game123;
            if ((game123 = (Game123)this.Class1.elementAt(i)) != null) {
                int n4 = n2;
                if (game123.Class10) {
                    n4 = n2 + n3 + 4;
                }
                final Game123 game124 = game123;
                final int n5 = n4;
                final Game123 game125 = game124;
                try {
                    if (game125.Class1()) {
                        if (!game125.Class23) {
                            if (game125.Class5 < game125.Class2.size()) {
                                final MyVector class5 = ((RMS)game125.Class2.elementAt(game125.Class5)).Class5;
                                for (int j = 0; j < class5.size(); ++j) {
                                    final Game66 game126 = (Game66)class5.elementAt(j);
                                    final Game2 game127 = game125.Class3[game126.Class1];
                                    final Game82 class6;
                                    if ((class6 = Game75.Class1(game125.Class8)) != null && class6.Class1 != null) {
                                        final short class7 = game126.Class2;
                                        int class8 = game127.Class4;
                                        int class9 = game127.Class5;
                                        int class10 = game127.Class2;
                                        int class11 = game127.Class3;
                                        if (class10 > class6.Class1.getWidth()) {
                                            class10 = 0;
                                        }
                                        if (class11 > class6.Class1.getHeight()) {
                                            class11 = 0;
                                        }
                                        if (class10 + class8 > class6.Class1.getWidth()) {
                                            class8 = class6.Class1.getWidth() - class10;
                                        }
                                        if (class11 + class9 > class6.Class1.getHeight()) {
                                            class9 = class6.Class1.getHeight() - class11;
                                        }
                                        mGraphics.Class1(class6.Class1, class10, class11, class8, class9, (game126.Class4 == 1) ? 2 : 0, n + class7, n5 + game126.Class3, 0);
                                    }
                                }
                            }
                        }
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    System.err.println("Err DataSkillEff  paintBottomEff:" + game125.Class8);
                }
            }
        }
    }
    
    public final void Class1(final byte b, final int n) {
        for (int i = 0; i < this.Class1.size(); ++i) {
            final Game123 game123;
            if ((game123 = (Game123)this.Class1.elementAt(i)) != null) {
                final Game123 game124;
                if ((game124 = game123).Class2.size() > 0) {
                    try {
                        if (!game124.Class23) {
                            switch (game124.Class9) {
                                case 0: {
                                    final Game123 game125 = game124;
                                    ++game125.Class6;
                                    if (game124.Class6 > game124.Class4.length) {
                                        game124.Class22 = true;
                                        game124.Class6 = 0;
                                    }
                                    final Game123 game126 = game124;
                                    game126.Class5 = game126.Class4[game124.Class6];
                                    break;
                                }
                                case 1: {
                                    final Game123 game127 = game124;
                                    ++game127.Class6;
                                    if (game124.Class6 > game124.Class4.length) {
                                        game124.Class6 = 0;
                                        game124.Class22 = true;
                                    }
                                    final Game123 game128 = game124;
                                    game128.Class5 = game128.Class4[game124.Class6];
                                    break;
                                }
                                case 2: {
                                    final Game123 game129 = game124;
                                    ++game129.Class6;
                                    if (game124.Class6 == (byte)(game124.Class4.length - 1) && game124.Class19 - System.currentTimeMillis() < 0L) {
                                        game124.Class22 = true;
                                    }
                                    if (game124.Class6 > game124.Class4.length) {
                                        game124.Class6 = 0;
                                        game124.Class1(true);
                                    }
                                    final Game123 game130 = game124;
                                    game130.Class5 = game130.Class4[game124.Class6];
                                    break;
                                }
                                case 3: {
                                    final Game123 game131 = game124;
                                    ++game131.Class6;
                                    if (game124.Class6 > game124.Class4.length) {
                                        game124.Class6 = 0;
                                        game124.Class1(true);
                                    }
                                    final Game123 game132 = game124;
                                    game132.Class5 = game132.Class4[game124.Class6];
                                    break;
                                }
                            }
                        }
                        else if (game124.Class20 - System.currentTimeMillis() < 0L) {
                            game124.Class1(false);
                        }
                    }
                    catch (Exception ex) {}
                }
                if (game123.Class22) {
                    this.Class1.removeElement(game123);
                }
            }
        }
        if (b == 0 && n == 14) {
            this.Class1.removeAllElements();
        }
        if (b == 1 && n == 0) {
            this.Class1.removeAllElements();
        }
    }
}
