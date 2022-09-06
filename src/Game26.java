import main.GameCanvas;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game26 extends Game21
{
    private static Game105 Class5;
    private static Game105 Class6;
    private static Image Class7;
    private static Image Class8;
    private byte Class9;
    private int Class10;
    private MyVector Class11;
    
    static {
        new Game50();
        Game26.Class7 = GameCanvas.Class3("/u/tuyet.png");
        Game26.Class8 = GameCanvas.Class3("/u/cobay.png");
    }
    
    public Game26(final byte class9, int class10) {
        this.Class9 = 0;
        this.Class10 = 0;
        this.Class11 = new MyVector();
        this.Class9 = class9;
        this.Class10 = class10;
        switch (class9) {
            case 1: {
                class10 = 10;
                if (Game26.Class5 == null) {
                    Game26.Class5 = new Game105(Game26.Class8, 16, 10);
                    break;
                }
                break;
            }
            case 3: {
                if (Game26.Class6 == null) {
                    Game26.Class6 = new Game105(Game26.Class7, 5, 5);
                    break;
                }
                break;
            }
        }
        for (int i = 0; i < class10; ++i) {
            final Game65 game65 = new Game65((GameScr.Class16 - 20 + Res.Class4((GameCanvas.Class25 + 40) / 5) * 5) * 10, (GameScr.Class17 - 20 + Res.Class4(GameCanvas.Class26 / 5) * 5) * 10);
            if (class9 == 3) {
                game65.Class4 = Res.Class4(3);
            }
            else {
                game65.Class4 = Res.Class4(4);
            }
            game65.Class6 = 16 + (Res.Class4(3) << 2);
            game65.Class3 = Res.Class2(-1, 1);
            final Game65 game66 = game65;
            game66.Class5 = Res.Class4(game66.Class6);
            this.Class11.addElement(game65);
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        mGraphics.Class4(0, -200, GameCanvas.Class25, 200 + GameCanvas.Class26);
        switch (this.Class9) {
            case 1: {
                for (int i = 0; i < this.Class10; ++i) {
                    final Game65 game65 = (Game65)this.Class11.elementAt(i);
                    Game26.Class5.Class1(game65.Class5 / (game65.Class6 / 4), game65.Class1 / 10 - GameScr.Class16, game65.Class2 / 10 - GameScr.Class17, 0, 3, mGraphics);
                }
            }
            case 3: {
                for (int j = 0; j < this.Class10; ++j) {
                    final Game65 game66;
                    if ((game66 = (Game65)this.Class11.elementAt(j)).Class4 > 0) {
                        GameScr.gI();
                        if (Game50.Class7 == null) {
                            Game50.Class7 = new Game50();
                        }
                        Game26.Class6.Class1(game66.Class4, Game50.Class7.Class1 * ((2 - game66.Class4) * 20) / 120 - GameScr.Class16 + game66.Class1 / 10, game66.Class2 / 10 - GameScr.Class17, 2, 0, mGraphics);
                    }
                }
                break;
            }
        }
    }
    
    public final void switchToMe() {
        switch (this.Class9) {
            case 1: {
                for (int i = 0; i < this.Class10; ++i) {
                    final Game65 game66;
                    final Game65 game65 = game66 = (Game65)this.Class11.elementAt(i);
                    game65.Class2 += 10;
                    final Game65 game67 = game66;
                    game67.Class1 += game66.Class3 * 10;
                    final Game65 game68 = game66;
                    ++game68.Class5;
                    if (game66.Class5 >= game66.Class6) {
                        game66.Class5 = 0;
                    }
                    if (game66.Class2 / 10 > GameScr.Class17 + GameCanvas.Class26 - (3 - game66.Class4) * 40 || game66.Class1 / 10 < GameScr.Class16 - GameCanvas.Class27 || game66.Class1 / 10 > GameScr.Class16 + GameCanvas.Class25 + GameCanvas.Class27) {
                        if (game66.Class2 / 10 > 24) {
                            new Game65(game66.Class1 / 10 + GameScr.Class16, game66.Class2 / 10 + GameScr.Class17).Class6 = 200;
                            Res.Class4(4);
                            new Game37();
                        }
                        this.Class1(game66);
                    }
                }
            }
            case 3: {
                for (int j = 0; j < this.Class10; ++j) {
                    final Game65 game70;
                    final Game65 game69 = game70 = (Game65)this.Class11.elementAt(j);
                    game69.Class2 += (game70.Class4 + 1) * 5;
                    final Game65 game71 = game70;
                    game71.Class1 += game70.Class4 + 1 << 1;
                    if (game70.Class2 / 10 > GameScr.Class17 + GameCanvas.Class26 - (3 - game70.Class4) * 30) {
                        this.Class1(game70);
                    }
                    final int n = GameScr.Class16 * ((2 - game70.Class4) * 20) / 120;
                    if (game70.Class1 / 10 + n < GameScr.Class16 - 10) {
                        final Game65 game72 = game70;
                        game72.Class1 += (GameCanvas.Class25 + 20) * 10;
                    }
                    if (game70.Class1 / 10 + n > GameScr.Class16 + GameCanvas.Class25 + 10) {
                        final Game65 game73 = game70;
                        game73.Class1 -= (GameCanvas.Class25 + 20) * 10;
                    }
                }
                break;
            }
        }
    }
    
    private void Class1(final Game65 game65) {
        game65.Class1 = (GameScr.Class16 - 20 + Res.Class4((GameCanvas.Class25 + 40) / 5) * 5) * 10;
        game65.Class2 = (GameScr.Class17 - GameCanvas.Class28 + Res.Class4(GameCanvas.Class26 / 5) * 5) * 10;
        if (this.Class9 == 3) {
            game65.Class4 = Res.Class4(3);
            return;
        }
        game65.Class4 = Res.Class4(4);
    }
}
