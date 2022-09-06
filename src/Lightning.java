import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Lightning extends Game21
{
    private int[] Class5;
    private MyVector Class6;
    private MyVector[] Class7;
    private EPosition Class8;
    private long Class9;
    private boolean Class10;
    private boolean Class11;
    private int Class12;
    private int Class13;
    private int Class14;
    private int Class15;
    
    public static void addLight(final MyVector myVector, final EPosition ePosition, int i) {
        final Lightning lightning;
        (lightning = new Lightning()).Class5[1] = i;
        EPosition ePosition2;
        for (i = 0; i < myVector.size(); ++i) {
            if ((ePosition2 = (EPosition)myVector.elementAt(i)) != null && (Res.abs(ePosition2.Class1 - ePosition.Class1) >= 100 || Res.abs(ePosition2.Class2 - ePosition.Class2) >= 50)) {
                myVector.removeElementAt(i);
            }
        }
        lightning.Class1(myVector, ePosition, true);
        Game21.Class1.addElement(lightning);
    }
    
    public Lightning() {
        this.Class5 = new int[] { 16579837, 11188220 };
        this.Class6 = new MyVector();
        this.Class9 = 0L;
        this.Class10 = false;
        this.Class11 = true;
        this.Class12 = 0;
        this.Class13 = 0;
        this.Class14 = 0;
        this.Class15 = 7;
    }
    
    private void Class1(final MyVector class6, final EPosition class7, final boolean class8) {
        if (class6.size() == 0) {
            return;
        }
        if (!(this.Class10 = class8)) {
            for (int size = class6.size(), i = 0; i < size - 1; ++i) {
                EPosition obj = (EPosition)class6.elementAt(i);
                for (int j = i + 1; j < size; ++j) {
                    final EPosition obj2 = (EPosition)class6.elementAt(j);
                    if (obj.Class1 > obj2.Class1) {
                        class6.setElementAt(obj, j);
                        class6.setElementAt(obj2, i);
                        obj = obj2;
                    }
                }
            }
        }
        this.Class6 = class6;
        this.Class8 = class7;
        this.Class7 = new MyVector[class6.size()];
        for (int k = 0; k < this.Class7.length; ++k) {
            this.Class7[k] = new MyVector();
        }
        class7.Class3 = -1;
        this.Class7[0].addElement(class7);
        int n = -1;
        for (int l = 0; l < class6.size(); ++l) {
            int n2 = class7.Class1;
            int n3 = class7.Class2;
            if (class8 && n != -1) {
                final EPosition ePosition;
                n2 = (ePosition = (EPosition)class6.elementAt(n)).Class1;
                n3 = ePosition.Class2;
            }
            if (!class8) {
                int n4 = 0;
                for (int n5 = 0; n5 < class6.size(); ++n5) {
                    if (((EPosition)class6.elementAt(n5)).Class5 == -1) {
                        ++n4;
                    }
                }
                int n8 = 0;
                Label_0378: {
                    if (n4 != 0) {
                        final int class9 = Res.Class4(n4);
                        int n6 = 0;
                        for (int n7 = 0; n7 < class6.size(); ++n7) {
                            final EPosition ePosition2;
                            if ((ePosition2 = (EPosition)class6.elementAt(n7)).Class5 == -1) {
                                if (class9 == n6) {
                                    ePosition2.Class5 = 0;
                                    n8 = n7;
                                    break Label_0378;
                                }
                                ++n6;
                            }
                        }
                        n8 = -1;
                    }
                    else {
                        n8 = -1;
                    }
                }
                n = n8;
            }
            else {
                ++n;
            }
            int n9 = this.Class7[n].size() - 1;
            final EPosition ePosition3;
            final int class10 = Res.Class1((ePosition3 = (EPosition)class6.elementAt(n)).Class1 - n2, -(ePosition3.Class2 - n3));
            final int n10 = Res.Class4(15) + 10;
            int n11 = 0;
            while (true) {
                int n12 = 0;
                if (n11 != 0) {
                    n12 = class10 - 5 + Res.Class4(10);
                }
                final int class11 = Res.Class3(n12);
                final int n13 = n10 * n11 * Res.Class2(class11) >> 10;
                final int n14 = -(n10 * n11 * Res.Class1(class11)) >> 10;
                this.Class7[n].addElement(new EPosition(n2 + n13, n3 + n14, n9++));
                if (Res.distance(n2, n3, n2 + n13, n3 + n14) >= Res.distance(n2, n3, ePosition3.Class1, ePosition3.Class2) - 20) {
                    break;
                }
                ++n11;
            }
        }
        for (int n15 = 0; n15 < this.Class7.length; ++n15) {
            final int size2 = this.Class7[n15].size();
            final EPosition ePosition4;
            (ePosition4 = (EPosition)class6.elementAt(n15)).Class3 = (byte)(this.Class7[n15].size() - 1);
            ePosition4.Class5 = -1;
            final EPosition ePosition5;
            (ePosition5 = new EPosition(ePosition4.Class1, ePosition4.Class2, ePosition4.Class3)).Class5 = -1;
            this.Class7[n15].addElement(ePosition5);
            for (int n16 = 1; n16 < size2; ++n16) {
                final EPosition ePosition6 = (EPosition)this.Class7[n15].elementAt(n16);
                for (int class12 = Res.Class4(2), n17 = 0; n17 < class12; ++n17) {
                    final int n18 = 180 + Res.Class4(180);
                    final int n19 = 5 + Res.Class4(10);
                    final EPosition ePosition7;
                    (ePosition7 = new EPosition(ePosition6.Class1 + (n19 * Res.Class2(Res.Class3(n18)) >> 10), ePosition6.Class2 + (-(n19 * Res.Class1(Res.Class3(n18))) >> 10), n16)).Class5 = 0;
                    this.Class7[n15].addElement(ePosition7);
                }
            }
        }
    }
    
    public final void switchToMe() {
        if (this.Class8 == null) {
            Game21.Class2.addElement(this);
            return;
        }
        try {
            if (GameCanvas.gameTick % 2 == 1) {
                this.Class8.Class3 = -1;
                this.Class8.Class5 = -1;
                for (int i = 0; i < this.Class6.size(); ++i) {
                    final EPosition ePosition;
                    (ePosition = (EPosition)this.Class6.elementAt(i)).Class5 = -1;
                    ePosition.Class3 = -1;
                }
                if (this.Class10 && this.Class11 && this.Class6.size() > 1 && System.currentTimeMillis() / 10L - this.Class9 > 30L) {
                    this.Class9 = System.currentTimeMillis() / 10L;
                    this.Class8 = (EPosition)this.Class6.elementAt(0);
                    this.Class6.removeElementAt(0);
                }
                this.Class1(this.Class6, this.Class8, this.Class10);
                if (this.Class12 > 3) {
                    this.Class15 = 7;
                    Game21.Class1.removeElement(this);
                }
                ++this.Class12;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        this.Class14 = 0;
        ++this.Class13;
        if (this.Class13 >= 12) {
            this.Class13 = 0;
        }
        if (this.Class7 != null) {
            for (int i = 0; i < this.Class7.length; ++i) {
                for (int j = 0; j < this.Class7[i].size(); ++j) {
                    final EPosition ePosition;
                    if ((ePosition = (EPosition)this.Class7[i].elementAt(j)).Class3 >= 0 && ePosition.Class3 < this.Class7[i].size()) {
                        final EPosition ePosition2 = (EPosition)this.Class7[i].elementAt(ePosition.Class3);
                        if (GameCanvas.Class5(ePosition.Class1, ePosition.Class2) && GameCanvas.Class5(ePosition2.Class1, ePosition2.Class2)) {
                            final EPosition ePosition3 = ePosition;
                            final EPosition ePosition4 = ePosition2;
                            final EPosition ePosition5 = ePosition3;
                            mGraphics.setColor(this.Class5[0]);
                            mGraphics.drawLine(ePosition5.Class1, ePosition5.Class2, ePosition4.Class1, ePosition4.Class2);
                            if (ePosition5.Class5 == -1) {
                                mGraphics.setColor(this.Class5[1]);
                                mGraphics.drawLine(ePosition5.Class1 - 1, ePosition5.Class2, ePosition4.Class1 - 1, ePosition4.Class2);
                                if (this.Class10 && this.Class11) {
                                    mGraphics.drawLine(ePosition5.Class1 + 1, ePosition5.Class2, ePosition4.Class1 + 1, ePosition4.Class2);
                                }
                            }
                        }
                        if (this.Class10 && this.Class11) {
                            ++this.Class14;
                            if (this.Class14 >= this.Class15) {
                                this.Class15 += 7;
                                return;
                            }
                        }
                    }
                }
                final EPosition ePosition7;
                final EPosition ePosition6 = ePosition7 = (EPosition)this.Class6.elementAt(i);
                ++ePosition6.Class4;
                if (ePosition7.Class4 >= 12) {
                    ePosition7.Class4 = 0;
                }
            }
        }
    }
}
