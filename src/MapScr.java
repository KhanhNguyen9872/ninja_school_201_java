import main.GameCanvas;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class MapScr extends mScreen implements IActionListener
{
    private static MapScr Class8;
    private boolean Class9;
    private static Image Class10;
    private static Image Class11;
    private static Image Class12;
    private static int Class13;
    private static int Class14;
    private static int Class15;
    private static int Class16;
    private static int Class17;
    private static int Class18;
    private static int Class19;
    private static int Class20;
    private static int Class21;
    private static int Class22;
    private static int Class23;
    private static int Class24;
    private static int Class25;
    private static int Class26;
    private static int Class27;
    private static int Class28;
    private static int Class29;
    private static int Class30;
    private static int Class31;
    private static int[] Class32;
    private static int[] Class33;
    private int Class34;
    private int Class35;
    private int Class36;
    private int Class37;
    private boolean Class38;
    private int Class39;
    private int Class40;
    private static int Class41;
    
    static {
        MapScr.Class10 = null;
        MapScr.Class30 = 0;
        MapScr.Class31 = 0;
        MapScr.Class32 = new int[] { 1, 156, 140, 174, 196, 195, 125, 148, 156, 173, 199, 203, 222, 264, 283, 277, 298, 307, 311, 315, 116, 90, 59, 31, 252, 55, 81, 111, 148, 187, 219, 253, 278, 304, 311, 310, 284, 309, 294, 62, 92, 117, 99, 134, 154, 175, 34, 52, 40, 78, 59, 82, 114, 179, 158, 142, 1, 215, 291, 242, 147, 301, 71, 23, 116, 126, 305, 286, 264, 20, 46, 70, 78, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        MapScr.Class33 = new int[] { 1, 68, 75, 88, 80, 107, 87, 114, 136, 160, 168, 196, 216, 219, 248, 265, 276, 260, 232, 204, 111, 82, 79, 59, 168, 33, 28, 34, 45, 20, 54, 44, 19, 40, 60, 100, 175, 165, 134, 181, 199, 208, 221, 220, 219, 221, 195, 217, 246, 244, 250, 263, 262, 241, 252, 244, 2, 240, 197, 139, 16, 18, 208, 223, 239, 186, 120, 119, 135, 107, 125, 126, 148, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }
    
    public MapScr() {
        this.Class38 = false;
        super.right = new Command(Game86.CLOSE, this, 1000, null);
        super.center = new Command(Game86.Class157, this, 1001, null);
        super.left = new Command("", this, 14004, null);
        MapScr.Class41 = -1;
    }
    
    private void Class7() {
        final int class1 = mGraphics.Class1(TileMap.Class8);
        this.Class36 = (GameCanvas.Class25 - class1) / 2;
        this.Class37 = (GameCanvas.Class26 - 20 - mGraphics.Class2(TileMap.Class8)) / 2;
        if (this.Class36 < 0) {
            this.Class36 = 0;
        }
        if (this.Class37 < 0) {
            this.Class37 = 0;
        }
        if (this.Class9) {
            MapScr.Class27 = class1 + 20 - GameCanvas.Class25;
            MapScr.Class28 = mGraphics.Class2(TileMap.Class8) + 40 - GameCanvas.Class26;
            this.Class34 = class1 + 20;
            this.Class35 = class1 + 40;
            if (this.Class35 < GameCanvas.Class26 - 26) {
                this.Class35 = GameCanvas.Class26 - 26;
            }
            if (this.Class34 < GameCanvas.Class25) {
                this.Class34 = GameCanvas.Class25;
            }
            MapScr.Class15 = this.Class36 + Char.getMyChar().cx / 12;
            MapScr.Class16 = this.Class37 + Char.getMyChar().cy / 12;
        }
        else {
            MapScr.Class27 = 340 - GameCanvas.Class25;
            MapScr.Class28 = 340 - GameCanvas.Class26;
            MapScr.Class15 = MapScr.Class32[TileMap.mapID] + MapScr.Class30;
            MapScr.Class16 = MapScr.Class33[TileMap.mapID] + MapScr.Class31;
            this.Class34 = 330 + MapScr.Class30;
            this.Class35 = 310 + MapScr.Class31;
        }
        this.Class34 -= 10;
        this.Class35 -= 10;
        if (MapScr.Class27 < 0) {
            MapScr.Class27 = 0;
        }
        if (MapScr.Class28 < 0) {
            MapScr.Class28 = 0;
        }
        MapScr.Class25 = (MapScr.Class26 = 0);
        MapScr.Class19 = (MapScr.Class20 = 0);
        MapScr.Class19 = MapScr.Class15 - GameCanvas.Class27;
        MapScr.Class20 = MapScr.Class16 - GameCanvas.Class28;
    }
    
    public static MapScr Class6() {
        if (MapScr.Class8 == null) {
            MapScr.Class8 = new MapScr();
        }
        return MapScr.Class8;
    }
    
    public final void switchToMe() {
        super.switchToMe();
        Game2.Class2();
        TileMap.Class3();
        super.right = new Command(Game86.CLOSE, this, 1000, null);
        super.center = new Command(Game86.Class157, this, 1001, null);
        super.left = new Command("", this, 14004, null);
        if (MapScr.Class10 == null) {
            MapScr.Class10 = GameCanvas.Class3("/wm.png");
            MapScr.Class11 = GameCanvas.Class3("/u/x.png");
            MapScr.Class12 = GameCanvas.Class3("/u/wpt1.png");
            MapScr.Class13 = mGraphics.Class2(MapScr.Class10);
            MapScr.Class14 = mGraphics.Class2(MapScr.Class10);
        }
        if (GameCanvas.Class25 > MapScr.Class13) {
            MapScr.Class30 = GameCanvas.Class27 - MapScr.Class13 / 2 - 12;
        }
        if (GameCanvas.Class26 > MapScr.Class14) {
            MapScr.Class31 = GameCanvas.Class28 - MapScr.Class14 / 2;
        }
        this.Class7();
        Class8();
        mFont.Class20.Class2 = null;
        mFont.Class22.Class2 = null;
        mFont.Class19.Class2 = null;
        mFont.Class21.Class2 = null;
        mFont.Class21.Class2 = null;
        mFont.Class18.Class2 = null;
        mFont.Class9.Class2 = null;
        mFont.Class15.Class2 = null;
        mFont.Class10.Class2 = null;
        mFont.Class16.Class2 = null;
        mFont.Class14.Class2 = null;
        mFont.Class4.Class2 = null;
        mFont.Class5.Class2 = null;
        mFont.Class3.Class2 = null;
        mFont.Class7.Class2 = null;
        System.gc();
        MapScr.Class41 = -1;
        TileMap.Game16666 = TileMap.mapID;
    }
    
    public final void Class2() {
        super.Class2();
        MapScr.Class10 = null;
        MapScr.Class11 = null;
        System.gc();
        TileMap.Class6();
        Game2.Class3();
        mFont.Class20.Class1();
        mFont.Class22.Class1();
        mFont.Class19.Class1();
        mFont.Class21.Class1();
        mFont.Class21.Class1();
        mFont.Class18.Class1();
        mFont.Class9.Class1();
        mFont.Class15.Class1();
        mFont.Class10.Class1();
        mFont.Class16.Class1();
        mFont.Class14.Class1();
        mFont.Class4.Class1();
        mFont.Class5.Class1();
        mFont.Class3.Class1();
        mFont.Class7.Class1();
    }
    
    public final void Class1(final mGraphics mGraphics) {
        int n = 0;
        mGraphics.setColor(0);
        mGraphics.fillRect(0, 0, GameCanvas.Class25, GameCanvas.Class26);
        mGraphics.Class1(10, 10);
        mGraphics.Class1(-MapScr.Class25, -MapScr.Class26);
        if (this.Class9) {
            mGraphics.Class1(TileMap.Class8, this.Class36, this.Class37, 0);
            for (int i = 0; i < GameScr.vMob.size(); ++i) {
                final Mob mob;
                final int n2 = (mob = (Mob)GameScr.vMob.elementAt(i)).x / 12;
                final int n3 = mob.y / 12;
                if (mob.level < Char.getMyChar().Class22 - 2) {
                    mGraphics.setColor(11184810);
                }
                else if (mob.level > Char.getMyChar().Class22 + 2) {
                    mGraphics.setColor(16711680);
                }
                else {
                    mGraphics.setColor(16776960);
                }
                mGraphics.fillRect(this.Class36 + n2 - 1, this.Class37 + n3 - 1, 3, 3);
            }
            for (int j = 0; j < GameScr.vParty.size(); ++j) {
                final Party party;
                if ((party = (Party)GameScr.vParty.elementAt(j)).c != null && party.c != Char.getMyChar()) {
                    final int n4 = party.c.cx / 12;
                    final int n5 = party.c.cy / 12;
                    if (GameCanvas.gameTick % 10 < 8) {
                        mGraphics.setColor(16777215);
                        mGraphics.fillRect(this.Class36 + n4 - 2, this.Class37 + n5 - 2, 5, 5);
                        mGraphics.setColor(65280);
                        mGraphics.fillRect(this.Class36 + n4 - 1, this.Class37 + n5 - 1, 3, 3);
                    }
                }
            }
            GameScr.gI();
            GameScr.getTaskNpcId();
            for (int k = 0; k < GameScr.vNpc.size(); ++k) {
                final Npc npc;
                final int n6 = (npc = (Npc)GameScr.vNpc.elementAt(k)).cx / 12;
                final int n7 = npc.cy / 12;
                mGraphics.setColor(16777215);
                mGraphics.fillRect(this.Class36 + n6 - 2, this.Class37 + n7 - 2, 5, 5);
                mGraphics.setColor(65280);
                mGraphics.fillRect(this.Class36 + n6 - 1, this.Class37 + n7 - 1, 3, 3);
                mGraphics.Class1(MapScr.Class11, this.Class36 + n6, this.Class37 + n7, 3);
                n = 1;
            }
            for (int l = 0; l < TileMap.vGo.size(); l = (byte)(l + 1)) {
                final InfoDlg infoDlg;
                final int n8 = ((infoDlg = TileMap.vGo.elementAt(l)).minX + infoDlg.maxX) / 2 / 12;
                final int n9 = (infoDlg.minY + infoDlg.maxY) / 2 / 12;
                if (GameCanvas.gameTick % 10 < 8) {
                    mGraphics.setColor(0);
                    mGraphics.fillRect(this.Class36 + n8 - 2, this.Class37 + n9 - 2, 5, 5);
                    mGraphics.setColor(16777215);
                    mGraphics.fillRect(this.Class36 + n8 - 1, this.Class37 + n9 - 1, 3, 3);
                }
            }
            final int n10 = Char.getMyChar().cx / 12;
            final int n11 = Char.getMyChar().cy / 12;
            mGraphics.setColor(16777215);
            mGraphics.fillRect(this.Class36 + n10 - 2, this.Class37 + n11 - 2, 5, 5);
            if (GameCanvas.gameTick % 10 > 5) {
                mGraphics.setColor(255);
                mGraphics.fillRect(this.Class36 + n10 - 1, this.Class37 + n11 - 1, 3, 3);
            }
            mGraphics.Class1(MapScr.Class12, MapScr.Class15 - 2, MapScr.Class16, 0);
            super.Class1(mGraphics);
            if (n == 0) {
                mFont.number_red.Class1(mGraphics, TileMap.Class11, 10, GameCanvas.Class26 - 17, 0);
            }
        }
        else {
            if (GameCanvas.Class25 > MapScr.Class13 && GameCanvas.Class26 > MapScr.Class14) {
                mGraphics.Class1(MapScr.Class10, GameCanvas.Class27, GameCanvas.Class28, Game62.Class7);
            }
            else if (GameCanvas.Class25 > MapScr.Class13) {
                mGraphics.Class1(MapScr.Class10, GameCanvas.Class27, 0, Game62.Class1);
            }
            else if (GameCanvas.Class26 > MapScr.Class14) {
                mGraphics.Class1(MapScr.Class10, 0, GameCanvas.Class28, Game62.Class8);
            }
            else {
                mGraphics.Class1(MapScr.Class10, 0, 0, 0);
            }
            if (TileMap.mapID < TileMap.mapNames.length && TileMap.mapID >= 0) {
                int n12 = 0;
                if (MapScr.Class32[TileMap.mapID] != 1 || MapScr.Class33[TileMap.mapID] != 1) {
                    n12 = ((MapScr.Class32[TileMap.mapID] < 100) ? 0 : ((MapScr.Class32[TileMap.mapID] > 200) ? 1 : 2));
                    GameCanvas.Class1(MapScr.Class32[TileMap.mapID] + MapScr.Class30, MapScr.Class33[TileMap.mapID] + MapScr.Class31, mGraphics);
                }
                int n13 = 0;
                if (MapScr.Class29 >= 0) {
                    mFont.number_red.drawString(mGraphics, TileMap.mapNames[MapScr.Class29], MapScr.Class32[MapScr.Class29] + MapScr.Class30, MapScr.Class33[MapScr.Class29] + MapScr.Class31 - 20, (MapScr.Class32[MapScr.Class29] < 100) ? 0 : ((MapScr.Class32[MapScr.Class29] > 200) ? 1 : 2), mFont.Class13);
                    mGraphics.Class1(MapScr.Class11, MapScr.Class32[MapScr.Class29] + MapScr.Class30, MapScr.Class33[MapScr.Class29] + MapScr.Class31, 3);
                    n = 1;
                    n13 = MapScr.Class33[MapScr.Class29] - 20;
                }
                else if (MapScr.Class32[TileMap.mapID] != 1 || MapScr.Class33[TileMap.mapID] != 1) {
                    n13 = MapScr.Class33[TileMap.mapID] - 20;
                    mFont.Class12.drawString(mGraphics, TileMap.mapNames[TileMap.mapID], MapScr.Class32[TileMap.mapID] + MapScr.Class30, MapScr.Class33[TileMap.mapID] + MapScr.Class31 - 20, n12, mFont.Class13);
                }
                for (int n14 = 0; n14 < Char.getMyChar().taskOrder.size(); ++n14) {
                    final TaskOrder taskOrder;
                    if ((taskOrder = (TaskOrder)Char.getMyChar().taskOrder.elementAt(n14)).mapId >= 0 && taskOrder.mapId < MapScr.Class32.length) {
                        mGraphics.Class1(MapScr.Class11, MapScr.Class32[taskOrder.mapId] + MapScr.Class30, MapScr.Class33[taskOrder.mapId] + MapScr.Class31, 3);
                    }
                }
                if (MapScr.Class17 >= 0 && ((MapScr.Class29 < 0 && TileMap.mapID != MapScr.Class17) || (MapScr.Class29 >= 0 && MapScr.Class17 != MapScr.Class29))) {
                    final int n15 = (MapScr.Class32[MapScr.Class17] < 100) ? 0 : ((MapScr.Class32[MapScr.Class17] > 200) ? 1 : 2);
                    final int n16 = MapScr.Class32[MapScr.Class17];
                    int n17;
                    if ((n17 = MapScr.Class33[MapScr.Class17] - 20) > n13 && n17 - n13 < 30) {
                        n17 += 40;
                    }
                    if (n17 < n13 && n13 - n17 < 20) {
                        n17 -= 5;
                    }
                    mFont.Class12.drawString(mGraphics, TileMap.mapNames[MapScr.Class17], n16 + MapScr.Class30, n17 + MapScr.Class31, n15, mFont.Class13);
                }
            }
            mGraphics.Class1(MapScr.Class12, MapScr.Class15 - 2, MapScr.Class16, 0);
            mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
            super.Class1(mGraphics);
        }
        if (n != 0) {
            mGraphics.Class1(MapScr.Class11, 10, GameCanvas.Class26 - 12, 3);
            mFont.number_red.Class1(mGraphics, Game86.Class231, 20, GameCanvas.Class26 - 17, 0);
        }
    }
    
    public final void Class5() {
        super.Class5();
        if (++MapScr.Class18 > 10000) {
            MapScr.Class18 = 0;
        }
        if (MapScr.Class25 != MapScr.Class19 || MapScr.Class26 != MapScr.Class20) {
            MapScr.Class21 = MapScr.Class19 - MapScr.Class25 << 1;
            MapScr.Class22 = MapScr.Class20 - MapScr.Class26 << 1;
            MapScr.Class23 += MapScr.Class21;
            MapScr.Class25 += MapScr.Class23 >> 4;
            MapScr.Class23 &= 0xF;
            MapScr.Class24 += MapScr.Class22;
            MapScr.Class26 += MapScr.Class24 >> 4;
            MapScr.Class24 &= 0xF;
            if (MapScr.Class25 < 0) {
                MapScr.Class25 = 0;
            }
            if (MapScr.Class25 > MapScr.Class27) {
                MapScr.Class25 = MapScr.Class27;
            }
            if (MapScr.Class26 < 0) {
                MapScr.Class26 = 0;
            }
            if (MapScr.Class26 > MapScr.Class28) {
                MapScr.Class26 = MapScr.Class28;
            }
        }
        boolean b = false;
        if (GameCanvas.Class13[2]) {
            if ((MapScr.Class16 -= 4) < MapScr.Class31 - 10) {
                MapScr.Class16 = MapScr.Class31 - 10;
            }
            b = true;
        }
        if (GameCanvas.Class13[8]) {
            if ((MapScr.Class16 += 4) > this.Class35) {
                MapScr.Class16 = this.Class35;
            }
            b = true;
        }
        if (GameCanvas.Class13[4]) {
            if ((MapScr.Class15 -= 4) < MapScr.Class30 - 10) {
                MapScr.Class15 = MapScr.Class30 - 10;
            }
            b = true;
        }
        if (GameCanvas.Class13[6]) {
            if ((MapScr.Class15 += 4) > this.Class34) {
                MapScr.Class15 = this.Class34;
            }
            b = true;
        }
        if (b) {
            MapScr.Class19 = MapScr.Class15 - GameCanvas.Class27;
            MapScr.Class20 = MapScr.Class16 - GameCanvas.Class28;
            Class8();
        }
        GameScr.gI();
        MapScr.Class29 = GameScr.getTaskMapId();
        if (GameCanvas.Class15 && GameCanvas.Class18 < GameCanvas.Class26 - mScreen.Class6) {
            GameCanvas.Class15 = false;
            this.Class38 = true;
            this.Class39 = GameCanvas.Class17;
            this.Class40 = GameCanvas.Class18;
        }
        else if (GameCanvas.Class14 && this.Class38) {
            MapScr.Class19 -= GameCanvas.Class17 - this.Class39;
            MapScr.Class20 -= GameCanvas.Class18 - this.Class40;
            if (MapScr.Class19 < 0) {
                MapScr.Class19 = 0;
            }
            if (MapScr.Class20 < 0) {
                MapScr.Class20 = 0;
            }
            if (MapScr.Class19 > MapScr.Class27) {
                MapScr.Class19 = MapScr.Class27;
            }
            if (MapScr.Class20 > MapScr.Class28) {
                MapScr.Class20 = MapScr.Class28;
            }
            MapScr.Class25 = MapScr.Class19;
            MapScr.Class26 = MapScr.Class20;
            this.Class39 = GameCanvas.Class17;
            this.Class40 = GameCanvas.Class18;
        }
        if (GameCanvas.Class16) {
            final int n = GameCanvas.Class19 - GameCanvas.Class17;
            final int n2 = GameCanvas.Class20 - GameCanvas.Class18;
            if (n < 10 && n2 < 10) {
                MapScr.Class15 = MapScr.Class25 + GameCanvas.Class19 - 8;
                MapScr.Class16 = MapScr.Class26 + GameCanvas.Class20 - 8;
                Class8();
            }
            this.Class38 = false;
            GameCanvas.Class16 = false;
        }
        if (GameCanvas.Class6 && GameCanvas.Class25 >= 320) {
            super.left.Class6 = GameCanvas.Class25 / 2 - 160;
            super.center.Class6 = GameCanvas.Class25 / 2 - 35;
            super.right.Class6 = GameCanvas.Class25 / 2 + 88;
            final Command left = super.left;
            final Command center = super.center;
            final Command right = super.right;
            final int class7 = GameCanvas.Class26 - 26;
            right.Class7 = class7;
            center.Class7 = class7;
            left.Class7 = class7;
        }
    }
    
    private static void Class8() {
        MapScr.Class41 = MapScr.Class17;
        MapScr.Class17 = -1;
        int i = 0;
        while (i < MapScr.Class32.length) {
            if (Res.abs(MapScr.Class15 - (MapScr.Class32[i] + MapScr.Class30)) < 10 && Res.abs(MapScr.Class16 - (MapScr.Class33[i] + MapScr.Class31)) < 10) {
                MapScr.Class17 = i;
                if (MapScr.Class41 != -1 && MapScr.Class41 == MapScr.Class17) {
                    Service.gI().Class23(MapScr.Class17);
                    MapScr.Class41 = -1;
                    MapScr.Class17 = -1;
                    return;
                }
                break;
            }
            else {
                ++i;
            }
        }
    }
    
    public final void perform(final int n, final Object o) {
        switch (n) {
            case 1000: {
                if (Char.getMyChar().cHP <= 0 || Char.getMyChar().statusMe == 14) {
                    super.center = GameScr.gI().Class162;
                    Char.getMyChar().cHP = 0;
                }
                GameScr.gI().switchToMe();
            }
            case 1001: {
                this.Class9 = !this.Class9;
                this.Class7();
            }
            case 14004: {
                Service.gI().Class23(MapScr.Class17);
                break;
            }
        }
    }
}
