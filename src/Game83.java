import java.io.IOException;
import javax.microedition.io.ConnectionNotFoundException;
import main.Game2;
import main.GameMidlet;
import main.GameCanvas;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game83 extends mScreen implements IActionListener
{
    private TField Class10;
    private TField Class11;
    private TField Class12;
    private TField Class13;
    private static Game83 Class14;
    private int Class15;
    private int Class16;
    private int Class17;
    private int Class18;
    private boolean Class19;
    private boolean Class20;
    private Command Class21;
    private Command Class22;
    private Command Class23;
    private Command Class24;
    public static Image Class8;
    private int Class25;
    private String[] Class26;
    private int Class27;
    private int Class28;
    private int Class29;
    private int Class30;
    private int Class31;
    public static boolean Class9;
    private String Class32;
    
    static {
        Game83.Class8 = GameCanvas.Class3("/tt.png");
    }
    
    public final void switchToMe() {
        if (TaskOrder.Class2("random") == null) {
            TaskOrder.Class1("random", Game69.Class8());
        }
        this.Class17 = -50;
        this.Class20 = false;
        GameScr.Class10 = GameCanvas.Class26;
        if (GameCanvas.Class44 == 2) {
            GameCanvas.Class2(0);
        }
        else {
            GameCanvas.Class2(TileMap.Class13);
        }
        super.switchToMe();
        if (GameScr.Class8 != null) {
            GameScr.Class8 = null;
        }
        if (GameCanvas.Class30 != null) {
            GameCanvas.Class30 = new Game100();
        }
        GameCanvas.Class3 = false;
        final Command command = new Command(Game86.Class88, this, 2005, null);
        this.Class24 = command;
        super.left = command;
    }
    
    public final void Class6() {
        this.Class20 = true;
        this.Class17 = -50;
        GameScr.Class10 = GameCanvas.Class26;
        if (GameCanvas.Class44 == 2) {
            GameCanvas.Class2(0);
        }
        else {
            GameCanvas.Class2(TileMap.Class13);
        }
        super.switchToMe();
        if (GameScr.Class8 != null) {
            GameScr.Class8 = null;
        }
        if (GameCanvas.Class30 != null) {
            GameCanvas.Class30 = new Game100();
        }
        GameCanvas.Class3 = false;
        final Command command = new Command("H\u1ee7y", this, 20051, null);
        this.Class24 = command;
        super.left = command;
    }
    
    public Game83() {
        this.Class19 = false;
        this.Class20 = false;
        this.Class27 = -1;
        this.Class28 = 2;
        this.Class29 = 0;
        this.Class30 = -40;
        this.Class31 = 1;
        this.Class32 = "";
        Game83.Class14 = this;
        this.Class20 = false;
        if ((TileMap.Class13 = (byte)(System.currentTimeMillis() % 9L)) == 5 || TileMap.Class13 == 6) {
            TileMap.Class13 = 4;
        }
        GameScr.Class1(true);
        GameScr.Class16 = 100;
        if (GameCanvas.Class26 > 200) {
            this.Class18 = GameCanvas.Class28 - 80;
        }
        else {
            this.Class18 = GameCanvas.Class28 - 65;
        }
        this.Class17 = -50;
        this.Class16 = GameCanvas.Class25 - 30;
        if (this.Class16 < 135) {
            this.Class16 = 135;
        }
        if (this.Class16 > 155) {
            this.Class16 = 155;
        }
        this.Class25 = GameCanvas.Class28 - mScreen.Class4 - 5;
        if (GameCanvas.Class26 <= 160) {
            this.Class25 = 20;
        }
        this.Class10 = new TField();
        this.Class10.Class22 = Game86.Class77;
        this.Class10.Class1 = GameCanvas.Class27 - 20 - 57;
        this.Class10.Class2 = this.Class25;
        this.Class10.Class3 = this.Class16;
        this.Class10.Class4 = mScreen.Class4 + 2;
        this.Class10.Class5 = true;
        this.Class10.Class18 = 3;
        TField.Class21 = GameMidlet.Class6;
        TField.Class20 = Game2.Class1;
        this.Class11 = new TField();
        this.Class11.Class22 = Game86.Class78;
        this.Class11.Class1 = GameCanvas.Class27 - 20 - 57;
        final TField class11 = this.Class11;
        final int n = this.Class25 + 35;
        this.Class25 = n;
        class11.Class2 = n;
        this.Class11.Class3 = this.Class16;
        this.Class11.Class4 = mScreen.Class4 + 2;
        this.Class11.Class5 = false;
        this.Class11.Class18 = 2;
        this.Class12 = new TField();
        this.Class12.Class22 = Game86.Class84;
        this.Class12.Class1 = GameCanvas.Class27 - 20 - 57;
        final TField class12 = this.Class12;
        final int n2 = this.Class25 + 35;
        this.Class25 = n2;
        class12.Class2 = n2;
        this.Class12.Class3 = this.Class16;
        this.Class12.Class4 = mScreen.Class4 + 2;
        this.Class12.Class5 = false;
        this.Class12.Class18 = 2;
        this.Class13 = new TField();
        this.Class13.Class22 = "Email/S\u1ed1 di \u0111\u1ed9ng";
        this.Class13.Class1 = GameCanvas.Class27 - 20 - 57;
        final TField class13 = this.Class13;
        final int n3 = this.Class25 + 35;
        this.Class25 = n3;
        class13.Class2 = n3;
        this.Class13.Class3 = this.Class16;
        this.Class13.Class4 = mScreen.Class4 + 2;
        this.Class13.Class5 = false;
        this.Class13.Class18 = 3;
        this.Class19 = true;
        if (Game69.Class8 != null) {
            if (Game69.Class8.startsWith("tmpusr")) {
                this.Class10.setText("");
                this.Class11.setText("");
            }
            else {
                this.Class10.setText(Game69.Class8);
                this.Class11.setText(Game69.Class9);
            }
        }
        this.Class15 = 0;
        this.Class21 = new Command(Game86.Class76, this, 2000, null);
        this.Class22 = new Command(Game86.Class85, this, 2001, null);
        this.Class23 = new Command(Game86.Class87, this, 2002, null);
        new Command(Game86.Class88, this, 2004, null);
        if (!this.Class20) {
            final Command command = new Command(Game86.Class88, this, 2005, null);
            this.Class24 = command;
            super.left = command;
        }
        else {
            final Command command2 = new Command(Game86.Class108, this, 20051, null);
            this.Class24 = command2;
            super.left = command2;
        }
        if (GameCanvas.Class6 && GameCanvas.Class25 >= 320) {
            super.center = null;
            super.right = this.Class21;
            return;
        }
        super.center = this.Class21;
        super.right = this.Class10.Class23;
    }
    
    public static Game83 Class7() {
        return Game83.Class14;
    }
    
    private static void Class1(final boolean class3) {
        GameCanvas.Class3 = class3;
        TaskOrder.Class1("isGPRS", class3 ? 1 : 2);
    }
    
    private void setText(final String str) {
        GameMidlet.Class3 = GameMidlet.Class12[GameMidlet.Class4()];
        GameCanvas.Class2(Game86.Class114);
        GameCanvas.Class1(3);
        GameCanvas.Class2(Game86.Class115);
        Service.gI().Class2();
        final Service gi = Service.gI();
        final String class9 = this.Class11.Class9;
        final String class10 = this.Class13.Class9;
        final String str2 = class9;
        final Service service = gi;
        try {
            final Message message;
            (message = new Message((byte)118)).Class3.writeUTF(str);
            message.Class3.writeUTF(str2);
            message.Class3.writeUTF(class10);
            service.temple.Class1(message);
            message.Class2();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final void Class4() {
        if (++GameScr.Class16 > GameCanvas.Class25 * 3 + 100) {
            GameScr.Class16 = 100;
        }
        this.Class10.Class3();
        this.Class11.Class3();
        if (this.Class20) {
            this.Class12.Class3();
            this.Class13.Class3();
        }
        if (this.Class18 != this.Class17) {
            this.Class17 += this.Class18 - this.Class17 >> 1;
        }
        if (GameCanvas.Class6) {
            super.center = null;
            if (this.Class20) {
                super.right = this.Class23;
            }
            else {
                super.right = this.Class21;
            }
        }
        else if (this.Class20) {
            super.center = this.Class23;
        }
        else if (this.Class15 == 2) {
            super.center = this.Class22;
            if (this.Class19) {
                super.center.Class1 = Game86.Class86;
            }
            else {
                super.center.Class1 = Game86.Class85;
            }
        }
        else {
            super.center = this.Class21;
        }
        if (this.Class29 >= 0) {
            this.Class30 += this.Class31 * this.Class29;
            this.Class29 += this.Class31 * this.Class28;
            if (this.Class29 <= 0) {
                this.Class31 = -this.Class31;
            }
            if (this.Class30 > 0) {
                this.Class31 = -this.Class31;
                this.Class29 -= 2 * this.Class28;
            }
        }
        if (this.Class27 >= 0 && GameCanvas.gameTick % 100 == 0) {
            ++this.Class27;
            if (this.Class27 >= Game86.Class24.length) {
                this.Class27 = 0;
            }
            this.Class26 = mFont.number_red.Class2(Game86.Class24[this.Class27], GameCanvas.Class25 - 40);
        }
    }
    
    public final void Class1(final int n) {
        if (this.Class10.Class5) {
            this.Class10.Class1(n);
        }
        else if (this.Class11.Class5) {
            this.Class11.Class1(n);
        }
        else if (this.Class20 && this.Class12.Class5) {
            this.Class12.Class1(n);
        }
        else if (this.Class20 && this.Class13.Class5) {
            this.Class13.Class1(n);
        }
        super.Class1(n);
    }
    
    public final void Class2() {
        super.Class2();
    }
    
    public final void Class1(final mGraphics mGraphics) {
        mGraphics.setColor(0);
        mGraphics.fillRect(0, 0, GameCanvas.Class25, GameCanvas.Class26);
        GameCanvas.Class1(mGraphics);
        int n = this.Class10.Class2 - 45;
        if (GameCanvas.Class26 <= 220) {
            n += 5;
        }
        if (GameCanvas.Class34 == null) {
            if (this.Class20) {
                Game25.Class1(GameCanvas.Class27 - 85, this.Class10.Class2 - 15, 170, 150, mGraphics);
            }
            else {
                Game25.Class1(GameCanvas.Class27 - 85, this.Class10.Class2 - 15, 170, 90, mGraphics);
            }
            if (GameCanvas.Class26 > 160 && Game83.Class8 != null) {
                mGraphics.Class1(Game83.Class8, GameCanvas.Class27, n - 2, 3);
            }
            this.Class10.Class1(mGraphics);
            this.Class11.Class1(mGraphics);
            if (this.Class20) {
                this.Class12.Class1(mGraphics);
                this.Class13.Class1(mGraphics);
            }
            mGraphics.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26);
            if (GameCanvas.Class25 > 200) {
                if (this.Class10.Class9.equals("")) {
                    if (!this.Class10.Class5) {
                        mFont.Class7.Class1(mGraphics, Game86.Class77, this.Class10.Class1 + 5, this.Class10.Class2 + 7, 0);
                    }
                    else {
                        mFont.Class13.Class1(mGraphics, Game86.Class77, this.Class10.Class1 + 5, this.Class10.Class2 + 7, 0);
                    }
                }
                if (this.Class11.Class9.equals("")) {
                    if (!this.Class11.Class5) {
                        mFont.Class7.Class1(mGraphics, Game86.Class78, this.Class11.Class1 + 5, this.Class11.Class2 + 7, 0);
                    }
                    else {
                        mFont.Class13.Class1(mGraphics, Game86.Class78, this.Class11.Class1 + 5, this.Class11.Class2 + 7, 0);
                    }
                }
                if (this.Class20) {
                    if (this.Class12.Class9.equals("")) {
                        if (!this.Class12.Class5) {
                            mFont.Class7.Class1(mGraphics, Game86.Class79, this.Class12.Class1 + 5, this.Class12.Class2 + 7, 0);
                            mFont.Class7.Class1(mGraphics, Game86.Class78, this.Class12.Class1 + 50, this.Class12.Class2 + 7, 0);
                        }
                        else {
                            mFont.Class13.Class1(mGraphics, Game86.Class79, this.Class12.Class1 + 5, this.Class12.Class2 + 7, 0);
                            mFont.Class13.Class1(mGraphics, Game86.Class78, this.Class12.Class1 + 50, this.Class12.Class2 + 7, 0);
                        }
                    }
                    if (this.Class13.Class9.equals("")) {
                        if (!this.Class13.Class5) {
                            mFont.Class7.Class1(mGraphics, "Email/s\u1ed1 di \u0111\u1ed9ng", this.Class13.Class1 + 5, this.Class13.Class2 + 5, 0);
                        }
                        else {
                            mFont.Class13.Class1(mGraphics, "Email/s\u1ed1 di \u0111\u1ed9ng", this.Class13.Class1 + 5, this.Class13.Class2 + 5, 0);
                        }
                    }
                }
            }
            else {
                if (this.Class10.Class9.equals("")) {
                    mFont.Class7.Class1(mGraphics, Game86.Class80, this.Class10.Class1 - 35, this.Class10.Class2 + 7, 0);
                }
                if (this.Class11.Class9.equals("")) {
                    mFont.Class7.Class1(mGraphics, Game86.Class81, this.Class11.Class1 - 35, this.Class11.Class2 + 7, 0);
                }
                if (this.Class20) {
                    mFont.Class7.Class1(mGraphics, Game86.Class82, this.Class12.Class1 - 35, this.Class12.Class2 - 1, 0);
                    mFont.Class7.Class1(mGraphics, Game86.Class81, this.Class12.Class1 - 35, this.Class12.Class2 + 13, 0);
                    mFont.Class7.Class1(mGraphics, "Email/s\u1ed1 di \u0111\u1ed9ng", this.Class13.Class1 - 35, this.Class13.Class2 + 5, 0);
                }
            }
        }
        else if (this.Class26 != null) {
            for (int i = 0; i < this.Class26.length; ++i) {
                mFont.number_red.drawString(mGraphics, this.Class26[i], GameCanvas.Class25 / 2, this.Class10.Class2 - 15 + i * 10, 2, mFont.Class13);
            }
        }
        mFont.Class13.Class1(mGraphics, "2.0.1", GameCanvas.Class25 - 5, 5, 1);
        super.Class1(mGraphics);
    }
    
    public final void Class5() {
        if (GameCanvas.Class12[2]) {
            --this.Class15;
            if (this.Class15 < 0) {
                this.Class15 = 3;
            }
        }
        else if (GameCanvas.Class12[8]) {
            ++this.Class15;
            if (this.Class15 > 3) {
                this.Class15 = 0;
            }
        }
        if (GameCanvas.Class12[2] || GameCanvas.Class12[8]) {
            GameCanvas.Class7();
            if (this.Class15 == 1) {
                this.Class10.Class5 = false;
                this.Class11.Class5 = true;
                this.Class12.Class5 = false;
                this.Class13.Class5 = false;
                super.right = this.Class11.Class23;
            }
            else if (this.Class15 == 0) {
                this.Class10.Class5 = true;
                this.Class11.Class5 = false;
                this.Class12.Class5 = false;
                this.Class13.Class5 = false;
                super.right = this.Class10.Class23;
            }
            else {
                this.Class10.Class5 = false;
                this.Class11.Class5 = false;
                if (this.Class20) {
                    if (this.Class15 == 2) {
                        this.Class12.Class5 = true;
                        this.Class13.Class5 = false;
                        super.right = this.Class12.Class23;
                    }
                    else if (this.Class15 == 3) {
                        this.Class13.Class5 = true;
                        this.Class12.Class5 = false;
                        super.right = this.Class13.Class23;
                    }
                }
            }
        }
        if (GameCanvas.Class16) {
            if (GameCanvas.Class2(this.Class10.Class1, this.Class10.Class2, this.Class10.Class3, this.Class10.Class4)) {
                this.Class15 = 0;
            }
            else if (GameCanvas.Class2(this.Class11.Class1, this.Class11.Class2, this.Class11.Class3, this.Class11.Class4)) {
                this.Class15 = 1;
            }
            else {
                if (this.Class20) {
                    if (GameCanvas.Class2(this.Class12.Class1, this.Class12.Class2, this.Class12.Class3, this.Class12.Class4)) {
                        this.Class15 = 2;
                    }
                    else if (GameCanvas.Class2(this.Class13.Class1, this.Class13.Class2, this.Class13.Class3, this.Class13.Class4)) {
                        this.Class15 = 3;
                    }
                }
                else if (GameCanvas.Class2(this.Class10.Class1 - 20, GameCanvas.Class28 + 40, 80, 20)) {
                    this.Class19 = !this.Class19;
                }
                this.Class15 = 2;
            }
        }
        super.Class5();
        GameCanvas.Class7();
    }
    
    public final void perform(final int n, final Object o) {
        switch (n) {
            case 1002: {
                this.Class20 = true;
                this.Class12.Class5 = false;
                this.Class13.Class5 = false;
                this.Class11.Class5 = false;
                this.Class10.Class5 = true;
                super.right = this.Class10.Class23;
                super.left = new Command(Game86.Class108, this, 10021, null);
            }
            case 10021: {
                this.Class20 = false;
                this.Class12.Class5 = false;
                this.Class11.Class5 = false;
                this.Class10.Class5 = true;
                super.right = this.Class10.Class23;
                super.left = this.Class24;
            }
            case 1003: {
                try {
                    GameMidlet.Class6.platformRequest("http://ninjaschool.vn");
                }
                catch (ConnectionNotFoundException ex) {
                    ((Throwable)ex).printStackTrace();
                }
            }
            case 1004: {
                final MyVector myVector = new MyVector();
                final int class3 = TaskOrder.Class3("lowGraphic");
                if (!GameCanvas.Class6) {
                    if (class3 == 1) {
                        myVector.addElement(new Command(Game86.Class89, this, 10041, null));
                    }
                    else {
                        myVector.addElement(new Command(Game86.Class90, this, 10042, null));
                    }
                }
                myVector.addElement(new Command(Game86.Class30, this, 1006, null));
                if (GameCanvas.Class29 == this) {
                    myVector.addElement(new Command(Game86.Class31, this, 1009, null));
                }
                GameCanvas.Class30.Class1(myVector);
            }
            case 10041: {
                TaskOrder.Class1("lowGraphic", 0);
                GameCanvas.Class1(Game86.Class83, 8885);
            }
            case 10042: {
                TaskOrder.Class1("lowGraphic", 1);
                GameCanvas.Class1(Game86.Class83, 8885);
            }
            case 1005: {
                GameCanvas.Class1(Game86.Class98, new Command("3G/Wifi", this, 3000, null), new Command("GPRS", this, 3001, null));
            }
            case 1006: {
                GameCanvas.Class1(Game86.Class33, new Command(Game86.Class107, this, 10061, null), new Command(Game86.Class73, GameCanvas.Class1(), 8882, null));
            }
            case 10061: {
                GameCanvas.endDlg();
                TaskOrder.Class1("indLanguage", -1);
                GameMidlet.Class6.notifyDestroyed();
            }
            case 1009: {
                TaskOrder.Class1();
            }
            case 2000: {
                if (!this.Class10.Class9.equals("") && !this.Class11.Class9.equals("")) {
                    Game69.Class10 = this.Class10.Class9;
                    Game69.Class11 = this.Class11.Class9;
                }
                GameCanvas.Class31.switchToMe();
            }
            case 2001: {
                if (this.Class19) {
                    this.Class19 = false;
                    return;
                }
                this.Class19 = true;
            }
            case 2002: {
                if (this.Class10.Class9.equals("")) {
                    GameCanvas.setText(Game86.Class91);
                    return;
                }
                final char[] charArray = this.Class10.Class9.toCharArray();
                for (int i = 0; i < charArray.length; ++i) {
                    if (!TField.Class1(charArray[i])) {
                        GameCanvas.setText(Game86.Class92);
                        return;
                    }
                }
                if (this.Class11.Class9.equals("")) {
                    GameCanvas.setText(Game86.Class93);
                    return;
                }
                if (this.Class12.Class9.equals("")) {
                    GameCanvas.setText(Game86.Class94);
                    return;
                }
                if (this.Class10.Class9.length() < 5) {
                    GameCanvas.setText(Game86.Class95);
                    return;
                }
                if (!this.Class11.Class9.equals(this.Class12.Class9)) {
                    GameCanvas.setText(Game86.Class96);
                    return;
                }
                if (this.Class13.Class9.equals("")) {
                    GameCanvas.Class1("B\u1ea1n ch\u01b0a nh\u1eadp Email/s\u1ed1 di \u0111\u1ed9ng, Email/s\u1ed1 di \u0111\u1ed9ng gi\u00fap b\u1ea1n l\u1ea5y l\u1ea1i m\u1eadt kh\u1ea9u khi m\u1ea5t m\u1eadt kh\u1ea9u", new Command(Game86.Class51, this, 4001, null), new Command(Game86.Class73, GameCanvas.instance, 8882, null));
                    return;
                }
                GameCanvas.Class35.Class1(String.valueOf(Game86.Class97[0]) + " " + this.Class10.Class9 + ", " + Game86.Class97[1], new Command(Game86.Class107, this, 4000, null), null, new Command(Game86.Class73, GameCanvas.instance, 8882, null));
                GameCanvas.Class34 = GameCanvas.Class35;
            }
            case 2003: {
                GameMidlet.text("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
            }
            case 2004: {
                GameCanvas.inputDlg.show(Game86.Class286, new Command(Game86.Class76, this, 20041, null), 0);
            }
            case 2005: {
                GameCanvas.Class1("B\u1ea1n c\u00f3 mu\u1ed1n reset m\u1eadt kh\u1ea9u kh\u00f4ng?", new Command(Game86.Class76, this, 20052, null), new Command(Game86.Class73, GameCanvas.instance, 8882, null));
            }
            case 20051: {
                GameScr.gI().switchToMe();
            }
            case 20052: {
                GameMidlet.text("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
            }
            case 20041: {
                this.Class32 = GameCanvas.inputDlg.tfInput.Class9.toString();
                GameCanvas.endDlg();
                if (this.Class32.equals("")) {
                    GameCanvas.setText(Game86.Class91);
                    return;
                }
                GameCanvas.Class1(Game86.Class99, new Command(Game86.Class60, this, 200421, null), new Command(Game86.Class73, this, 200422, null));
            }
            case 200421: {
                GameCanvas.endDlg();
                final String class4 = this.Class32;
                GameMidlet.Class3 = GameMidlet.Class12[GameMidlet.Class4()];
                GameCanvas.Class2(Game86.Class114);
                GameCanvas.Class1(1);
                GameCanvas.Class2(Game86.Class25);
                final Service gi = Service.gI();
                final String str = class4;
                final Service service = gi;
                try {
                    final Message class5;
                    (class5 = Service.Class1((byte)(-122))).Class3.writeUTF(str);
                    service.temple.Class1(class5);
                    class5.Class2();
                }
                catch (IOException ex2) {
                    ex2.printStackTrace();
                }
            }
            case 200422: {
                GameCanvas.setText(Game86.Class1(Game86.Class418, this.Class32));
            }
            case 3000: {
                Class1(false);
                GameCanvas.endDlg();
            }
            case 3001: {
                Class1(true);
                GameCanvas.endDlg();
            }
            case 4000: {
                this.setText(this.Class10.Class9);
            }
            case 4001: {
                this.setText(this.Class10.Class9);
                break;
            }
        }
    }
}
