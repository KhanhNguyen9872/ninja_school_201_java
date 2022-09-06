import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game15 extends mScreen implements IActionListener
{
    public static Game15 Class8;
    private int Class10;
    private int Class11;
    private int Class12;
    private int Class13;
    private int Class14;
    private int Class15;
    private int Class16;
    private TField[] Class17;
    private String[] Class18;
    private String[] Class19;
    public Game50 Class9;
    
    public Game15() {
        this.Class17 = new TField[7];
        this.Class18 = new String[] { "H\u1ecd v\u00e0 t\u00ean", "Ng\u00e0y-th\u00e1ng-n\u0103m sinh", "\u0110\u1ecba ch\u1ec9 th\u01b0\u1eddng tr\u00fa", "CMND", "Ng\u00e0y c\u1ea5p(dd-mm-yyyy)", "N\u01a1i c\u1ea5p", "S\u1ed1 \u0111i\u1ec7n tho\u1ea1i, \u0111\u1ecba ch\u1ec9 th\u01b0 \u0111i\u1ec7n t\u1eed (n\u1ebfu c\u00f3).", "* D\u01b0\u1edbi 18 tu\u1ed5i ch\u1ec9 c\u00f3 th\u1ec3 ch\u01a1i 180p 1 ng\u00e0y" };
        this.Class19 = new String[] { "", "", "", "", "", "", "", "" };
        this.Class9 = new Game50();
        Game15.Class8 = this;
        this.Class10 = GameCanvas.Class27 - 100;
        this.Class11 = 10;
        this.Class12 = 200;
        this.Class13 = GameCanvas.Class26 - 40;
        this.Class14 = this.Class12 - 40;
        this.Class15 = GameCanvas.Class27 - this.Class14 / 2;
        for (int i = 0; i < this.Class17.length; ++i) {
            this.Class17[i] = new TField();
            this.Class17[i].Class22 = this.Class18[i];
            this.Class17[i].Class1 = this.Class15;
            this.Class17[i].Class2 = (i + 1) * 50;
            this.Class17[i].Class3 = this.Class14;
            this.Class17[i].Class4 = mScreen.Class4 + 2;
            this.Class17[i].Class5 = false;
            this.Class17[i].Class18 = 3;
            this.Class17[i].setText(this.Class19[i]);
            if (i == 0) {
                this.Class17[i].Class5 = true;
            }
        }
        super.left = new Command(Game86.Class87, this, 1, null);
    }
    
    public final void Class4() {
        super.Class4();
        if (++GameScr.Class16 > GameCanvas.Class25 * 3 + 100) {
            GameScr.Class16 = 100;
        }
        for (int i = 0; i < this.Class17.length; ++i) {
            this.Class17[i].Class3();
        }
        new Game68();
        final Game68 class2;
        if ((class2 = this.Class9.Class2()).Class1 || class2.Class3) {
            this.Class16 = (byte)class2.Class2;
        }
        this.Class9.Class3();
        class2.getClass();
        if (this.Class16 == -1) {
            for (int j = 0; j < this.Class17.length; ++j) {
                this.Class17[j].Class5 = false;
            }
        }
    }
    
    public final void Class1(final int n) {
        super.Class1(n);
        for (int i = 0; i < this.Class17.length; ++i) {
            if (this.Class17[i].Class5) {
                this.Class17[i].Class1(n);
            }
        }
    }
    
    public final void Class5() {
        if (GameCanvas.Class12[2]) {
            --this.Class16;
            if (this.Class16 < 0) {
                this.Class16 = this.Class18.length;
            }
            this.Class9.Class1(this.Class16 * this.Class9.Class8);
        }
        else if (GameCanvas.Class12[8]) {
            ++this.Class16;
            if (this.Class16 > this.Class18.length) {
                this.Class16 = 0;
            }
            this.Class9.Class1(this.Class16 * this.Class9.Class8);
        }
        if (GameCanvas.Class12[2] || GameCanvas.Class12[8]) {
            GameCanvas.Class7();
            for (int i = 0; i < this.Class17.length; ++i) {
                this.Class17[i].Class5 = false;
            }
            if (this.Class16 < this.Class17.length) {
                this.Class17[this.Class16].Class5 = true;
            }
            this.Class9.Class1(this.Class16 * this.Class9.Class8);
        }
        if (GameCanvas.Class2(this.Class10, this.Class11, this.Class12, this.Class13) && GameCanvas.Class16) {
            for (int j = 0; j < this.Class17.length; ++j) {
                if (GameCanvas.Class2(this.Class17[j].Class1, this.Class17[j].Class2, this.Class17[j].Class3, this.Class17[j].Class4)) {
                    this.Class16 = j;
                }
            }
        }
        super.Class5();
        GameCanvas.Class7();
    }
    
    public final void Class1(final mGraphics mGraphics) {
        mGraphics.setColor(0);
        mGraphics.fillRect(0, 0, GameCanvas.Class25, GameCanvas.Class26);
        GameCanvas.Class1(mGraphics);
        Game25.Class1(this.Class10, this.Class11, this.Class12, this.Class13, mGraphics);
        mFont.Class7.Class1(mGraphics, Game86.Class87, GameCanvas.Class27, this.Class11 + 10, 2);
        this.Class9.Class1(this.Class18.length, 50, this.Class10, this.Class11 + 25, this.Class12, this.Class13 - 25, true, 0);
        this.Class9.Class1(mGraphics, this.Class10, this.Class11 + 25, this.Class12, this.Class13 - 25);
        for (int i = 0; i < this.Class18.length; ++i) {
            if (i != this.Class18.length - 1) {
                mFont.Class12.Class1(mGraphics, this.Class18[i], GameCanvas.Class27, (i + 1) * 50 - 13, 2);
            }
            else {
                mFont.Class14.Class1(mGraphics, this.Class18[i], GameCanvas.Class27, (i + 1) * 50 - 13, 2);
            }
        }
        for (int j = 0; j < this.Class17.length; ++j) {
            final TField tField;
            final boolean class5 = (tField = this.Class17[j]).Class5;
            if (tField.Class18 == 2) {
                final TField tField2 = tField;
                tField2.Class11 = tField2.Class10;
            }
            else {
                final TField tField3 = tField;
                tField3.Class11 = tField3.Class9;
            }
            if (tField.Class11.equals("")) {
                final TField tField4 = tField;
                tField4.Class11 = tField4.Class8;
            }
            Game25.Class1(mGraphics, class5, tField.Class1, tField.Class2, tField.Class3, 4 + tField.Class15 + tField.Class1, tField.Class2 + (tField.Class4 - mFont.Class17.Class1) / 2, tField.Class11);
            mGraphics.setColor(0);
            if (tField.Class5 && tField.Class16 == 0 && (tField.Class17 > 0 || tField.Class13 / 5 % 2 == 0)) {
                mGraphics.setColor(11184810);
                mGraphics.fillRect(5 + tField.Class15 + tField.Class1 + mFont.Class17.Class1(tField.Class11.substring(0, tField.Class12)) - 1, tField.Class2 + (tField.Class4 - TField.Class6) / 2 + 1, 1, TField.Class6);
            }
        }
        super.Class1(mGraphics);
    }
    
    public final void switchToMe() {
        super.switchToMe();
        this.Class9.Class1();
    }
    
    public final void perform(final int n, final Object o) {
        switch (n) {
            case 1: {
                final Service gi = Service.gI();
                final String class9 = this.Class17[0].Class9;
                final String class10 = this.Class17[1].Class9;
                final String class11 = this.Class17[2].Class9;
                final String class12 = this.Class17[3].Class9;
                final String class13 = this.Class17[4].Class9;
                final String class14 = this.Class17[5].Class9;
                final String class15 = this.Class17[6].Class9;
                final String str = class14;
                final String str2 = class13;
                final String str3 = class12;
                final String str4 = class11;
                final String str5 = class10;
                final String str6 = class9;
                final Service service = gi;
                try {
                    final Message message;
                    (message = new Message((byte)123)).Class3.writeUTF(str6);
                    message.Class3.writeUTF(str5);
                    message.Class3.writeUTF(str4);
                    message.Class3.writeUTF(str3);
                    message.Class3.writeUTF(str2);
                    message.Class3.writeUTF(str);
                    message.Class3.writeUTF(class15);
                    service.temple.Class1(message);
                    message.Class2();
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                GameCanvas.Class50 = false;
                GameScr.gI().switchToMe();
                break;
            }
        }
    }
}
