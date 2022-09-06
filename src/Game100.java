import main.GameCanvas;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game100 implements IActionListener
{
    public boolean Class1;
    public MyVector Class2;
    public int Class3;
    public int Class4;
    public int Class5;
    public int Class6;
    public int Class7;
    public int Class8;
    public static int Class9;
    public static int Class10;
    public static int Class11;
    public static int Class12;
    private Command Class23;
    private Command Class24;
    private Command Class25;
    public static Image Class13;
    public static Image Class14;
    boolean Class15;
    public boolean Class16;
    private int Class26;
    private int Class27;
    private int Class28;
    private int[] Class29;
    public boolean Class17;
    private boolean Class30;
    public int Class18;
    public int Class19;
    public byte Class20;
    public int Class21;
    public int Class22;
    
    static {
        Game100.Class13 = GameCanvas.Class3("/hd/btnlBig0.png");
        Game100.Class14 = GameCanvas.Class3("/hd/btnlBig1.png");
    }
    
    public Game100() {
        this.Class23 = new Command(Game86.Class119, 0);
        this.Class24 = (GameCanvas.Class6 ? null : new Command(Game86.CLOSE, GameCanvas.Class25 - 71, GameCanvas.Class26 - mScreen.Class6 + 1));
        this.Class25 = null;
        this.Class29 = new int[3];
    }
    
    public final void Class1(final MyVector class2) {
        this.Class15 = false;
        this.Class16 = false;
        ChatPopup.Class6 = null;
        InfoDlg.hide();
        if (class2.size() == 0) {
            return;
        }
        this.Class2 = class2;
        this.Class6 = 60;
        this.Class7 = 60;
        for (int i = 0; i < class2.size(); ++i) {
            final Command command = (Command)class2.elementAt(i);
            if (mFont.Class12.Class1(command.Class1) > this.Class6 - 8) {
                command.Class2 = mFont.Class12.Class2(command.Class1, this.Class6 - 8);
            }
        }
        this.Class4 = (GameCanvas.Class25 - class2.size() * this.Class6) / 2;
        if (this.Class4 <= 0) {
            this.Class4 = 1;
        }
        this.Class5 = GameCanvas.Class26 - this.Class7 - (Game25.Class6 + 1);
        if (GameCanvas.Class6) {
            this.Class5 -= 3;
        }
        this.Class8 = this.Class5;
        this.Class1 = true;
        this.Class3 = 0;
        if ((Game100.Class11 = this.Class2.size() * this.Class6 - GameCanvas.Class25) < 0) {
            Game100.Class11 = 0;
        }
        Game100.Class9 = 0;
        Game100.Class10 = 0;
        Game100.Class12 = 50;
        this.Class26 = class2.size() * this.Class6 - 1;
        if (this.Class26 > GameCanvas.Class25 - 2) {
            this.Class26 = GameCanvas.Class25 - 2;
        }
        if (GameCanvas.Class6) {
            this.Class3 = -1;
        }
    }
    
    public final void switchToMe() {
        if (!this.Class1) {
            return;
        }
        if (this.Class20 > 0) {
            --this.Class20;
        }
        boolean b = false;
        if (GameCanvas.Class12[2] || GameCanvas.Class12[4]) {
            b = true;
            --this.Class3;
            if (this.Class3 < 0) {
                this.Class3 = this.Class2.size() - 1;
            }
        }
        else if (GameCanvas.Class12[8] || GameCanvas.Class12[6]) {
            b = true;
            ++this.Class3;
            if (this.Class3 > this.Class2.size() - 1) {
                this.Class3 = 0;
            }
        }
        else if (GameCanvas.Class12[5]) {
            if (this.Class25 != null) {
                if (this.Class25.Class4 > 0) {
                    if (this.Class25.Class3 == GameScr.gI()) {
                        GameScr.gI().Class2(this.Class25.Class4, this.Class25.Class11);
                    }
                    else {
                        this.perform(this.Class25.Class4, this.Class25.Class11);
                    }
                }
            }
            else {
                this.Class18 = 2;
            }
        }
        else if (GameCanvas.Class12[12]) {
            if (this.Class23.Class4 > 0) {
                this.perform(this.Class23.Class4, this.Class23.Class11);
            }
            else {
                this.Class18 = 2;
            }
        }
        else if (!this.Class15 && (GameCanvas.Class12[13] || mScreen.Class1(this.Class24))) {
            this.Class1 = false;
            InfoDlg.hide();
            if (this.Class16) {
                Service.gI().menu((byte)1, Char.getMyChar().npcFocus.template.npcTemplateId, GameCanvas.Class30.Class3, 0);
                this.Class16 = false;
            }
        }
        this.Class25 = null;
        final Game44 class1;
        if (GameScr.Class88 && !GameCanvas.Class6 && this.Class3 != -1 && (class1 = ChatManager.gI().Class1(((Command)this.Class2.elementAt(this.Class3)).Class1)) != null && class1.Class1 == 2) {
            this.Class25 = new Command(Game86.Class35, this, 1000, class1);
        }
        if (b) {
            if ((Game100.Class9 = this.Class3 * this.Class6 + this.Class6 - GameCanvas.Class25 / 2) > Game100.Class11) {
                Game100.Class9 = Game100.Class11;
            }
            if (Game100.Class9 < 0) {
                Game100.Class9 = 0;
            }
            if (this.Class3 == this.Class2.size() - 1 || this.Class3 == 0) {
                Game100.Class10 = Game100.Class9;
            }
        }
        if (this.Class20 <= 0 && !this.Class15 && GameCanvas.Class16 && !GameCanvas.Class3(this.Class4, this.Class5, this.Class26, this.Class7) && !this.Class17) {
            final int n = 0;
            this.Class28 = n;
            this.Class27 = n;
            this.Class17 = false;
            this.Class1 = false;
            GameCanvas.Class16 = false;
            if (this.Class16) {
                Service.gI().menu((byte)1, Char.getMyChar().npcFocus.template.npcTemplateId, GameCanvas.Class30.Class3, 0);
                System.out.println("send dong ne ");
                this.Class16 = false;
            }
            return;
        }
        if (GameCanvas.Class14) {
            if (!this.Class17 && GameCanvas.Class3(this.Class4, this.Class5, this.Class26, this.Class7)) {
                for (int i = 0; i < this.Class29.length; ++i) {
                    this.Class29[0] = GameCanvas.Class17;
                }
                this.Class28 = GameCanvas.Class17;
                this.Class17 = true;
                this.Class30 = (this.Class19 != 0);
                this.Class19 = 0;
            }
            else if (this.Class17) {
                ++this.Class27;
                if (this.Class27 > 5 && this.Class28 == GameCanvas.Class17 && !this.Class30) {
                    this.Class28 = -1000;
                    this.Class3 = (Game100.Class9 + GameCanvas.Class17 - this.Class4) / this.Class6;
                }
                int n2;
                if ((n2 = GameCanvas.Class17 - this.Class29[0]) != 0 && this.Class3 != -1) {
                    this.Class3 = -1;
                }
                for (int j = this.Class29.length - 1; j > 0; --j) {
                    final int n3 = j;
                    final int[] class2 = this.Class29;
                    class2[n3] = class2[j - 1];
                }
                this.Class29[0] = GameCanvas.Class17;
                if ((Game100.Class9 -= n2) < 0) {
                    Game100.Class9 = 0;
                }
                if (Game100.Class9 > Game100.Class11) {
                    Game100.Class9 = Game100.Class11;
                }
                if (Game100.Class10 < 0 || Game100.Class10 > Game100.Class11) {
                    n2 /= 2;
                }
                Game100.Class10 -= n2;
            }
        }
        if (GameCanvas.Class16 && this.Class17) {
            final int n4 = GameCanvas.Class17 - this.Class29[0];
            GameCanvas.Class16 = false;
            if (Res.abs(n4) < 20 && Res.abs(GameCanvas.Class17 - this.Class28) < 20 && !this.Class30) {
                this.Class19 = 0;
                Game100.Class9 = Game100.Class10;
                this.Class28 = -1000;
                this.Class3 = (Game100.Class9 + GameCanvas.Class17 - this.Class4) / this.Class6;
                this.Class27 = 0;
                this.Class18 = 10;
            }
            else if (this.Class3 != -1 && this.Class27 > 5) {
                this.Class27 = 0;
                this.Class18 = 1;
            }
            else if (this.Class3 == -1 && !this.Class30) {
                if (Game100.Class10 < 0) {
                    Game100.Class9 = 0;
                }
                else if (Game100.Class10 > Game100.Class11) {
                    Game100.Class9 = Game100.Class11;
                }
                else {
                    final int n5;
                    int n6;
                    if ((n5 = GameCanvas.Class17 - this.Class29[0] + (this.Class29[0] - this.Class29[1]) + (this.Class29[1] - this.Class29[2])) > 10) {
                        n6 = 10;
                    }
                    else if (n5 < -10) {
                        n6 = -10;
                    }
                    else {
                        n6 = 0;
                    }
                    this.Class19 = -n6 * 100;
                }
            }
            this.Class17 = false;
            this.Class27 = 0;
            GameCanvas.Class16 = false;
        }
        GameCanvas.Class7();
        GameCanvas.Class8();
    }
    
    private void Class1(final mGraphics mGraphics) {
        try {
            mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
            mGraphics.Class1(-Game100.Class10, 0);
            if (GameCanvas.Class6) {
                for (int i = 0; i < this.Class2.size(); ++i) {
                    if (i == this.Class3) {
                        mGraphics.Class1(Game100.Class14, this.Class4 + i * this.Class6 + 1, this.Class8 + 1, 0);
                    }
                    else {
                        mGraphics.Class1(Game100.Class13, this.Class4 + i * this.Class6 + 1, this.Class8 + 1, 0);
                    }
                    String[] class2;
                    if ((class2 = ((Command)this.Class2.elementAt(i)).Class2) == null) {
                        class2 = new String[] { ((Command)this.Class2.elementAt(i)).Class1 };
                    }
                    final int n = this.Class8 + (this.Class7 - class2.length * 14) / 2 + 1;
                    for (int j = 0; j < class2.length; ++j) {
                        if (GameScr.Class88) {
                            if (ChatManager.gI().Class4(class2[j])) {
                                if (GameCanvas.gameTick % 10 > 5) {
                                    mFont.Class14.Class1(mGraphics, class2[j], this.Class4 + i * this.Class6 + this.Class6 / 2 - 2, n + j * 14, 2);
                                }
                                else {
                                    mFont.Class12.Class1(mGraphics, class2[j], this.Class4 + i * this.Class6 + this.Class6 / 2 - 2, n + j * 14, 2);
                                }
                            }
                            else {
                                mFont.Class12.Class1(mGraphics, class2[j], this.Class4 + i * this.Class6 + this.Class6 / 2 - 2, n + j * 14, 2);
                            }
                        }
                        else {
                            mFont.Class12.Class1(mGraphics, class2[j], this.Class4 + i * this.Class6 + this.Class6 / 2 - 2, n + j * 14, 2);
                        }
                    }
                }
            }
            else {
                for (int k = 0; k < this.Class2.size(); ++k) {
                    if (k == this.Class3) {
                        mGraphics.Class1(Game100.Class14, this.Class4 + k * this.Class6 + 1, this.Class8 + 1 - 23, 0);
                    }
                    else {
                        mGraphics.Class1(Game100.Class13, this.Class4 + k * this.Class6 + 1, this.Class8 + 1 - 23, 0);
                    }
                    String[] class3;
                    if ((class3 = ((Command)this.Class2.elementAt(k)).Class2) == null) {
                        class3 = new String[] { ((Command)this.Class2.elementAt(k)).Class1 };
                    }
                    final int n2 = this.Class8 + (this.Class7 - class3.length * 14) / 2 + 1 - 23;
                    for (int l = 0; l < class3.length; ++l) {
                        if (GameScr.Class88) {
                            if (ChatManager.gI().Class4(class3[l])) {
                                if (GameCanvas.gameTick % 10 > 5) {
                                    mFont.Class14.Class1(mGraphics, class3[l], this.Class4 + k * this.Class6 + this.Class6 / 2 - 2, n2 + l * 14, 2);
                                }
                                else {
                                    mFont.Class12.Class1(mGraphics, class3[l], this.Class4 + k * this.Class6 + this.Class6 / 2 - 2, n2 + l * 14, 2);
                                }
                            }
                            else {
                                mFont.Class12.Class1(mGraphics, class3[l], this.Class4 + k * this.Class6 + this.Class6 / 2 - 2, n2 + l * 14, 2);
                            }
                        }
                        else {
                            mFont.Class12.Class1(mGraphics, class3[l], this.Class4 + k * this.Class6 + this.Class6 / 2 - 2, n2 + l * 14, 2);
                        }
                    }
                }
            }
            mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void Class2() {
        if (this.Class19 != 0 && !this.Class17) {
            if ((Game100.Class9 += this.Class19 / 100) < 0) {
                Game100.Class9 = 0;
            }
            else if (Game100.Class9 > Game100.Class11) {
                Game100.Class9 = Game100.Class11;
            }
            else {
                Game100.Class10 = Game100.Class9;
            }
            this.Class19 = this.Class19 * 9 / 10;
            if (this.Class19 < 100 && this.Class19 > -100) {
                this.Class19 = 0;
            }
        }
        if (Game100.Class10 != Game100.Class9 && !this.Class17) {
            this.Class21 = Game100.Class9 - Game100.Class10 << 2;
            this.Class22 += this.Class21;
            Game100.Class10 += this.Class22 >> 4;
            this.Class22 &= 0xF;
        }
        if (this.Class8 > this.Class5) {
            int n;
            if ((n = this.Class8 - this.Class5 >> 1) <= 0) {
                n = 1;
            }
            this.Class8 -= n;
        }
        if (Game100.Class12 != 0 && (Game100.Class12 >>= 1) < 0) {
            Game100.Class12 = 0;
        }
        if (this.Class18 > 0) {
            --this.Class18;
            GameScr.Class88 = false;
            if (this.Class18 == 0) {
                this.Class1 = false;
                final Command command;
                if (this.Class3 >= 0 && (command = (Command)this.Class2.elementAt(this.Class3)) != null) {
                    command.Class1();
                }
            }
        }
    }
    
    public final void perform(int i, final Object o) {
        if (i == 1000) {
            final Game44 game44 = (Game44)o;
            this.Class2.removeAllElements();
            ChatManager.gI().Class5(game44.Class2);
            ChatManager.gI().Class1.removeElement(game44);
            for (i = 0; i < ChatManager.gI().Class1.size(); ++i) {
                this.Class2.addElement(new Command(((Game44)ChatManager.gI().Class1.elementAt(i)).Class2, null, 12001, i));
            }
            this.Class2.addElement(new Command(Game86.Class434, null, 12006, null));
            this.Class2.addElement(new Command(Game86.Class435, null, 12008, null));
            Command command;
            for (i = 0; i < this.Class2.size(); ++i) {
                command = (Command)this.Class2.elementAt(i);
                if (mFont.Class12.Class1(command.Class1) > this.Class6 - 8) {
                    command.Class2 = mFont.Class12.Class2(command.Class1, this.Class6 - 8);
                }
            }
            Game100.Class11 = this.Class2.size() * this.Class6 - GameCanvas.Class25;
            if ((Game100.Class9 = this.Class3 * this.Class6 + this.Class6 - GameCanvas.Class25 / 2) > Game100.Class11) {
                Game100.Class9 = Game100.Class11;
            }
            if (Game100.Class9 < 0) {
                Game100.Class9 = 0;
            }
            if (this.Class3 == this.Class2.size() - 1 || this.Class3 == 0) {
                Game100.Class10 = Game100.Class9;
            }
        }
    }
}
