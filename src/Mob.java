import main.GameCanvas;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Mob extends Game19
{
    public static MobTemplate[] arrMobTemplate;
    public int hp;
    public int maxHp;
    public int x;
    public int y;
    private int Class32;
    public int dir;
    private int Class33;
    public int status;
    private int Class34;
    private int Class35;
    private int Class36;
    public int xFirst;
    public int yFirst;
    public int Class11;
    public int Class12;
    int Class13;
    public short mobId;
    public boolean Class15;
    public boolean Class16;
    public boolean isFire;
    public boolean isIce;
    public boolean isWind;
    private MyVector Class37;
    public int templateId;
    private Char Class38;
    private Game92 Class39;
    public int Class21;
    public int Class22;
    public int Class23;
    private int Class40;
    public short levelBoss;
    public short level;
    public boolean isBoss;
    private long Class42;
    private int Class43;
    public static Char Class26;
    public static MyVector Class27;
    private static Game47 Class44;
    private static long Class45;
    private boolean Class46;
    public boolean Class28;
    private long Class47;
    public Char Class29;
    private boolean Class48;
    private boolean Class49;
    public Char Class30;
    public boolean Class31;
    private Mob Class50;
    private Char Class51;
    private short Class52;
    private byte Class53;
    private byte Class54;
    private byte Class55;
    private static byte[][] Class56;
    private static byte[][] Class57;
    private static byte[][] Class58;
    private int Class59;
    
    static {
        Mob.Class27 = new MyVector();
        Mob.Class56 = new byte[][] { { 3, 4, 5, 6 }, new byte[1], { 2, 2, 2, 2, 3, 3, 3, 3 }, { 0, 1 }, { 0, 1 }, { 3, 4, 5 }, new byte[1], { 3, 3, 4, 4, 5, 5 }, new byte[1], { 3, 4, 5 }, { 0, 1, 2, 3, 4 }, { 3, 4, 5 }, { 4, 5, 6 }, new byte[1], { 0, 1 }, { 0, 1 }, { 3, 3, 4, 4, 5, 5 }, { 0, 1, 2 }, { 0, 1, 2 }, { 5, 6, 7, 8 }, { 0, 1, 2 }, { 0, 1, 2 }, { 0, 1, 2 }, { 3, 4, 5, 6 }, { 0, 1, 2 }, { 0, 1, 2, 3 }, { 0, 1, 2 }, { 0, 1, 2 }, { 0, 1, 2 }, { 0, 1, 2 }, new byte[1], new byte[1], new byte[1], new byte[1], { 0, 1, 2 }, new byte[1], new byte[1], { 0, 0, 1, 1, 2, 2 }, { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 1 }, { 0, 1 } };
        Mob.Class57 = new byte[][] { { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, new byte[1] };
        Mob.Class58 = new byte[][] { { 5, 4, 3, 2, 1 }, new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], { 5, 4, 3, 2, 1 }, { 5, 4, 3, 2, 1 }, { 5, 4, 3, 2, 1 }, new byte[0], { 5, 4, 3, 2, 1 }, new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, new byte[1] };
    }
    
    public Mob(final short mobId, final boolean class15, boolean class17, final boolean isFire, final boolean isIce, final boolean isWind, final int n, final int class18, final int hp, final int n2, final int maxHp, final short n3, final short n4, final byte status, final byte levelBoss, final boolean isBoss, final boolean class19) {
        this.dir = 1;
        this.Class33 = 1;
        this.Class37 = new MyVector();
        this.Class42 = 0L;
        this.Class43 = 0;
        this.Class28 = true;
        final byte[] array = { -1, 1 };
        this.Class31 = false;
        this.Class55 = -1;
        this.Class59 = 0;
        this.Class15 = class15;
        this.Class16 = class16;
        this.isFire = isFire;
        this.isIce = isIce;
        this.isWind = isWind;
        this.Class23 = class18;
        this.mobId = mobId;
        this.templateId = n;
        this.hp = hp;
        this.level = (short)n2;
        this.x = n3;
        this.xFirst = n3;
        this.y = n4;
        this.yFirst = n4;
        if (n == 168 || n == 179 || n == 175 || n == 177 || n == 202) {
            this.status = 8;
        }
        else {
            this.status = status;
        }
        this.maxHp = maxHp;
        this.levelBoss = levelBoss;
        this.isBoss = isBoss;
        if (n == 202) {
            Mob.Class44 = new Game47(this.xFirst, this.yFirst - 100);
            Mob.Class27.addElement(Mob.Class44);
            Game47.Class6 = this;
        }
        if (Mob.arrMobTemplate[n].Class8 == null) {
            Mob.arrMobTemplate[n].Class8 = new Image[0];
            final Service gi = Service.gI();
            class17 = (int)null;
            try {
                ((Message)(class17 = (int)Service.Class2((byte)(-108)))).Class3.writeByte(n);
                gi.temple.Class1((Message)class17);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            finally {
                ((Message)class17).Class2();
            }
            ((Message)class17).Class2();
        }
        Mob.Class45 = Res.Class2(2000, 3500);
        this.Class46 = class19;
    }
    
    public final void Class1() {
        boolean b = false;
        Label_0100: {
            if (Mob.arrMobTemplate[this.templateId] == null) {
                b = false;
            }
            else if (Mob.arrMobTemplate[this.templateId].Class8 == null) {
                b = false;
            }
            else {
                if (!this.isBoss) {
                    if (this.Class32 >= Mob.arrMobTemplate[this.templateId].Class8.length) {
                        b = false;
                        break Label_0100;
                    }
                    if (Mob.arrMobTemplate[this.templateId].Class8[this.Class32] == null) {
                        b = false;
                        break Label_0100;
                    }
                }
                b = (this.status != 0);
            }
        }
        if (!b) {
            return;
        }
        if (this.Class38 == null && (this.templateId == 168 || this.templateId == 179 || this.templateId == 175)) {
            this.status = 8;
        }
        if (this.Class37 == null && Mob.arrMobTemplate[this.templateId].Class1 != 0) {
            return;
        }
        if (this.status != 3 && this.Class28) {
            if (this.Class38 != null) {
                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                this.Class38 = null;
            }
            this.Class28 = false;
        }
        if (this.hp <= 0 && this.mobId != -1) {
            this.status = 1;
        }
        switch (this.status) {
            case 9: {
                this.Class32 = this.Class5(GameCanvas.gameTick);
                if (this.Class32 == 1) {
                    this.status = 8;
                }
                break;
            }
            case 8: {
                this.Class32 = 0;
                break;
            }
            case 1: {
                this.Class15 = false;
                this.Class16 = false;
                this.isFire = false;
                this.isIce = false;
                this.isWind = false;
                if (this.templateId != 98 && this.templateId != 99) {
                    ++this.Class34;
                    this.y += this.Class34;
                    if (Mob.Class26 != null) {
                        if (Mob.Class26.myskill != null) {
                            if (Mob.Class26.myskill.template.id > 72) {
                                if (GameCanvas.gameTick % 9 == 0) {
                                    if (this.Class35 > 1) {
                                        this.Class35 += 5;
                                    }
                                    else if (this.Class35 < -1) {
                                        this.Class35 -= 5;
                                    }
                                }
                            }
                            else if (GameCanvas.gameTick % 2 == 0) {
                                if (this.Class35 > 1) {
                                    --this.Class35;
                                }
                                else if (this.Class35 < -1) {
                                    ++this.Class35;
                                }
                            }
                        }
                    }
                    else if (Char.getMyChar() != null && Char.getMyChar().myskill != null) {
                        if (Char.getMyChar().myskill.template.id > 72) {
                            if (GameCanvas.gameTick % 9 == 0) {
                                if (this.Class35 > 1) {
                                    this.Class35 += 5;
                                }
                                else if (this.Class35 < -1) {
                                    this.Class35 -= 5;
                                }
                            }
                        }
                        else if (GameCanvas.gameTick % 2 == 0) {
                            if (this.Class35 > 1) {
                                --this.Class35;
                            }
                            else if (this.Class35 < -1) {
                                ++this.Class35;
                            }
                        }
                    }
                    this.x += this.Class35;
                    Mob mob;
                    int class32;
                    if (this.templateId == 209 || this.templateId == 210) {
                        mob = this;
                        class32 = 6;
                    }
                    else if (this.templateId == 168 || this.templateId == 176 || this.templateId == 177 || this.templateId == 179 || this.templateId == 180 || this.templateId == 191) {
                        mob = this;
                        class32 = 7;
                    }
                    else if (this.templateId == 178 || this.templateId == 181 || this.templateId == 183 || this.templateId == 185 || this.templateId == 188 || this.templateId == 192 || this.templateId == 194) {
                        mob = this;
                        class32 = 4;
                    }
                    else if (this.templateId == 173 || this.templateId == 184) {
                        mob = this;
                        class32 = 6;
                    }
                    else if (this.templateId == 175) {
                        mob = this;
                        class32 = 8;
                    }
                    else if (this.templateId == 170 || this.templateId == 195 || this.templateId == 196 || this.templateId == 197 || this.templateId == 186 || this.templateId == 189 || this.templateId == 190) {
                        mob = this;
                        class32 = 3;
                    }
                    else if (this.templateId == 187) {
                        mob = this;
                        class32 = 9;
                    }
                    else if (this.templateId == 193) {
                        mob = this;
                        class32 = 5;
                    }
                    else if (this.templateId == 174) {
                        mob = this;
                        class32 = 10;
                    }
                    else {
                        mob = this;
                        class32 = (this.isBoss ? 10 : 2);
                    }
                    mob.Class32 = class32;
                    if (this.y > GameScr.Class23 * 24 || this.x < GameScr.Class20 * 24 || this.x > GameScr.Class22 * 24) {
                        this.Class34 = 0;
                        this.Class35 = 0;
                        final int n = 0;
                        this.y = n;
                        this.x = n;
                        this.hp = this.getTemplate().hp;
                        this.status = 0;
                        if (this.templateId < 168) {
                            this.Class32 = 0;
                        }
                        else {
                            this.Class32 = this.Class3(GameCanvas.gameTick);
                        }
                        this.Class13 = 0;
                        return;
                    }
                    if (this.Class36 == 0 && (TileMap.tileTypeAtPixel(this.x, this.y) & 0x2) == 0x2) {
                        this.Class34 = ((this.Class34 > 4) ? -4 : (-this.Class34));
                        this.Class36 = 16;
                    }
                    if (this.Class36 > 0) {
                        --this.Class36;
                        break;
                    }
                    break;
                }
                else {
                    if (System.currentTimeMillis() - this.Class42 > 1200L) {
                        this.status = 0;
                        break;
                    }
                    break;
                }
                break;
            }
            case 2: {
                this.Class13 = 0;
                if (this.isBoss && this.templateId > 210) {
                    if (Mob.arrMobTemplate[this.templateId].Class11 != null) {
                        ++this.Class34;
                        if (GameCanvas.gameTick % 2 == 0) {
                            ++this.Class43;
                        }
                        if (this.Class43 >= Mob.arrMobTemplate[this.templateId].Class11.length) {
                            this.Class43 = 0;
                        }
                        this.Class32 = Mob.arrMobTemplate[this.templateId].Class11[this.Class43];
                        if (this.Class34 > 10 + this.mobId % 10 && System.currentTimeMillis() - (this.Class47 + Mob.Class45) >= 0L) {
                            this.status = 5;
                            this.Class34 = 0;
                        }
                    }
                    break;
                }
                switch (Mob.arrMobTemplate[this.templateId].Class3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3: {
                        if (this.templateId == 209 || this.templateId == 210) {
                            this.Class32 = 1;
                        }
                        else if (this.templateId == 173 || this.templateId == 175 || this.templateId == 176 || this.templateId == 177 || this.templateId == 179 || this.templateId == 180 || this.templateId == 181 || this.templateId == 183 || this.templateId == 184 || this.templateId == 185) {
                            this.Class32 = 1;
                        }
                        else if (this.templateId == 168 || this.templateId == 179) {
                            this.Class32 = 6;
                        }
                        else if (this.templateId == 174) {
                            this.Class32 = 4;
                        }
                        else {
                            this.Class32 = 0;
                        }
                        ++this.Class34;
                        if (this.Class34 > 10 + this.mobId % 10 && System.currentTimeMillis() - (this.Class47 + Mob.Class45) >= 0L) {
                            this.status = 5;
                        }
                        if (this.isBoss) {
                            this.Class32 = ((GameCanvas.gameTick % 101 <= 1) ? 1 : 0);
                            break;
                        }
                        break;
                    }
                    case 4:
                    case 5: {
                        if (!this.isBoss) {
                            if (this.templateId < 168) {
                                this.Class32 = ((GameCanvas.gameTick % 4 <= 1) ? 1 : 0);
                            }
                            else {
                                this.Class32 = this.Class2(GameCanvas.gameTick);
                            }
                        }
                        else {
                            this.Class32 = Mob.arrMobTemplate[this.templateId].Class11[this.Class43];
                        }
                        ++this.Class34;
                        if (this.Class34 > this.mobId % 3) {
                            this.status = 5;
                            break;
                        }
                        break;
                    }
                }
                break;
            }
            case 4: {
                this.Class13 = 0;
                this.Class32 = 0;
                ++this.Class34;
                if (this.Class34 > 40 + this.mobId % 5) {
                    this.y -= 2;
                    this.status = 5;
                    this.Class34 = 0;
                    break;
                }
                break;
            }
            case 3: {
                if (this.Class50 != null || this.Class51 != null) {
                    this.Class12();
                    break;
                }
                if (this.Class52 >= 0) {
                    this.Class9();
                    break;
                }
                if (this.isBoss && this.templateId > 210) {
                    if (Mob.arrMobTemplate[this.templateId].Class12 != null) {
                        if (this.Class34 == 0) {
                            int n2 = 0;
                            int n3 = 0;
                            if (this.Class40 == 0) {
                                n2 = this.Class38.cx;
                                n3 = this.Class38.cy;
                            }
                            else if (this.Class40 == 1) {
                                n2 = this.Class39.Class1;
                                n3 = this.Class39.Class2;
                            }
                            if (GameCanvas.gameTick % 2 == 0) {
                                ++this.Class43;
                            }
                            if (Res.abs(n2 - this.x) < 48 || Res.abs(n3 - this.y) < 10) {
                                if (this.Class43 >= Mob.arrMobTemplate[this.templateId].Class12[0].length) {
                                    this.Class34 = 1;
                                    this.Class43 = 0;
                                }
                                this.Class32 = Mob.arrMobTemplate[this.templateId].Class12[0][this.Class43];
                            }
                            else {
                                if (this.Class43 >= Mob.arrMobTemplate[this.templateId].Class12[1].length) {
                                    this.Class34 = 1;
                                    this.Class43 = 0;
                                }
                                this.Class32 = Mob.arrMobTemplate[this.templateId].Class12[1][this.Class43];
                            }
                        }
                        else if (this.Class34 == 1) {
                            if (Mob.arrMobTemplate[this.templateId].Class3 != 0 && !this.Class16 && !this.isIce && !this.isWind) {
                                this.x += (this.xFirst - this.x) / 4;
                                this.y += (this.yFirst - this.y) / 4;
                            }
                            if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
                                this.status = 2;
                                this.Class43 = 0;
                                this.Class34 = 0;
                                this.Class35 = 0;
                            }
                        }
                    }
                    break;
                }
                Mob mob2;
                int class33;
                if (this.templateId == 209 || this.templateId == 210) {
                    mob2 = this;
                    class33 = 6;
                }
                else if (this.templateId == 176 || this.templateId == 177 || this.templateId == 179) {
                    mob2 = this;
                    class33 = 6;
                }
                else if (this.templateId == 175) {
                    mob2 = this;
                    class33 = 7;
                }
                else if (this.templateId == 180 || this.templateId == 181 || this.templateId == 183 || this.templateId == 184 || this.templateId == 173 || this.templateId == 188 || this.templateId == 192 || this.templateId == 194 || this.templateId == 202) {
                    mob2 = this;
                    class33 = 3;
                }
                else if (this.templateId == 193) {
                    mob2 = this;
                    class33 = 4;
                }
                else if (this.templateId == 187 || this.templateId == 168 || this.templateId == 175 || this.templateId == 176 || this.templateId == 179 || this.templateId == 174) {
                    mob2 = this;
                    class33 = this.Class4(GameCanvas.gameTick);
                }
                else {
                    mob2 = this;
                    class33 = ((GameCanvas.gameTick % 4 > 1) ? ((Mob.arrMobTemplate[this.templateId].Class3 == 5) ? 3 : 0) : 1);
                }
                mob2.Class32 = class33;
                if (this.Class34 == 0) {
                    int n4 = 0;
                    int n5 = 0;
                    if (this.Class40 == 0) {
                        n4 = this.Class38.cx;
                        n5 = this.Class38.cy;
                    }
                    else if (this.Class40 == 1) {
                        n4 = this.Class39.Class1;
                        n5 = this.Class39.Class2;
                    }
                    if (Res.abs(n4 - this.x) < 24 || Res.abs(n4 - this.x) < 5 || Mob.arrMobTemplate[this.templateId].Class3 == 0) {
                        Mob mob3 = null;
                        int class34 = 0;
                        Label_2878: {
                            if (this.templateId == 168 || this.templateId == 176 || this.templateId == 177 || this.templateId == 179) {
                                mob3 = this;
                                class34 = 6;
                            }
                            else if (this.templateId == 175) {
                                mob3 = this;
                                class34 = 7;
                            }
                            else {
                                if (this.templateId == 180 || this.templateId == 181 || this.templateId == 183 || this.templateId == 184 || this.templateId == 173 || this.templateId == 202) {
                                    mob3 = this;
                                }
                                else {
                                    if (this.templateId == 187 || this.templateId == 168 || this.templateId == 179 || this.templateId == 174) {
                                        mob3 = this;
                                        class34 = this.Class4(GameCanvas.gameTick);
                                        break Label_2878;
                                    }
                                    mob3 = this;
                                    if (Mob.arrMobTemplate[this.templateId].Class8.length == 3) {
                                        class34 = 0;
                                        break Label_2878;
                                    }
                                }
                                class34 = 3;
                            }
                        }
                        mob3.Class32 = class34;
                    }
                    if (this.isBoss && (Res.abs(n4 - this.x) < 48 || Res.abs(n4 - this.x) < 10 || Mob.arrMobTemplate[this.templateId].Class3 == 0)) {
                        this.Class32 = ((Mob.arrMobTemplate[this.templateId].Class8.length == 3) ? 0 : 3);
                    }
                    if (this.isBoss) {
                        ++this.Class43;
                        if (Res.abs(n4 - this.x) < 48 || Res.abs(n5 - this.y) < 10) {
                            if (this.Class43 >= Mob.arrMobTemplate[this.templateId].Class12[0].length) {
                                this.Class43 = 0;
                            }
                            this.Class32 = Mob.arrMobTemplate[this.templateId].Class12[0][this.Class43];
                        }
                        else {
                            if (this.Class43 >= Mob.arrMobTemplate[this.templateId].Class12[1].length) {
                                this.Class43 = 0;
                            }
                            this.Class32 = Mob.arrMobTemplate[this.templateId].Class12[1][this.Class43];
                        }
                    }
                    if (this.Class32 == 3 || this.Class32 == 6 || this.Class32 == 7) {
                        this.Class34 = 1;
                    }
                    if (Mob.arrMobTemplate[this.templateId].Class3 != 0 && !this.Class16 && this.isIce && this.isWind) {
                        this.x += (n4 - this.x) / 3;
                    }
                    if (this.x > this.xFirst + Mob.arrMobTemplate[this.templateId].Class1) {
                        this.Class34 = 1;
                    }
                    if (this.x < this.xFirst - Mob.arrMobTemplate[this.templateId].Class1) {
                        this.Class34 = 1;
                    }
                    if ((Mob.arrMobTemplate[this.templateId].Class3 == 4 || Mob.arrMobTemplate[this.templateId].Class3 == 5) && !this.Class16) {
                        this.y += (n5 - this.y) / 20;
                    }
                    ++this.Class35;
                    Label_7381: {
                        if ((this.isBoss && Res.abs(n4 - this.x) < 48 && Res.abs(n5 - this.y) < 15) || (Res.abs(n4 - this.x) < 12 && Res.abs(n5 - this.y) < 12) || this.Class35 > 12 || this.Class34 == 1 || (Mob.arrMobTemplate != null && Mob.arrMobTemplate[this.templateId].Class12 != null && this.Class43 == Mob.arrMobTemplate[this.templateId].Class12[0].length - 2 && (this.getTemplate().Class5 == 166 || this.getTemplate().Class5 == 167))) {
                            this.Class34 = 1;
                            if (this.Class40 == 0) {
                                if (this.isBoss && Res.abs(n4 - this.x) < 48 && Res.abs(n5 - this.y) < 15) {
                                    this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                    this.Class28 = false;
                                    if (this.getTemplate().Class5 == 210) {
                                        if (this.Class38.cx > this.x) {
                                            Game16.Class1(142, this.x, this.y, 1);
                                            break Label_7381;
                                        }
                                        Game16.Class1(142, this.x, this.y, 1, (byte)(-1));
                                        break Label_7381;
                                    }
                                    else if (this.getTemplate().Class5 == 209) {
                                        if (this.Class38.cx > this.x) {
                                            Game16.Class1(108, this.x, this.y, 1);
                                            break Label_7381;
                                        }
                                        Game16.Class1(108, this.x, this.y, 1, (byte)(-1));
                                        break Label_7381;
                                    }
                                    else {
                                        if (this.getTemplate().Class5 == 114) {
                                            Game16.Class1(79, this.Class38, 3);
                                            break Label_7381;
                                        }
                                        if (this.getTemplate().Class5 == 115) {
                                            if (this.Class38 == Char.getMyChar()) {
                                                GameScr.Class152 = 1;
                                            }
                                            GameScr.Class153 = 0;
                                            Game16.Class1(81, this.Class38.cx, this.yFirst + TileMap.Class9, 2);
                                            Game16.Class1(81, this.Class38.cx - 40, this.yFirst + TileMap.Class9, 2);
                                            Game16.Class1(81, this.Class38.cx + 40, this.yFirst + TileMap.Class9, 2);
                                            break Label_7381;
                                        }
                                        if (this.getTemplate().Class5 == 116) {
                                            if (this.Class38 == Char.getMyChar()) {
                                                GameScr.Class152 = 1;
                                                GameScr.Class153 = 0;
                                            }
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(86, this.x, this.y - this.Class12 / 2 + 5, 1);
                                            }
                                            else {
                                                Game16.Class1(88, this.x, this.y - this.Class12 / 2 + 5, 1);
                                            }
                                            Game16.Class1(87, this.Class38.cx, this.Class38.cy - this.Class38.Class59 / 2, 2);
                                            Game16.Class1(87, this.Class38.cx - 40, this.Class38.cy - this.Class38.Class59 / 2, 2);
                                            Game16.Class1(87, this.Class38.cx + 40, this.Class38.cy - this.Class38.Class59 / 2, 2);
                                            break Label_7381;
                                        }
                                        if (this.getTemplate().Class5 == 138) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(89, this.x + this.Class11 / 2, this.y - this.Class12 / 2 - 5, 1);
                                            }
                                            else {
                                                Game16.Class1(89, this.x - this.Class11 / 2, this.y - this.Class12 / 2 - 5, 1, (byte)(-1));
                                            }
                                            Game16.Class1(90, this.Class38, 2);
                                            break Label_7381;
                                        }
                                        if (this.getTemplate().Class5 == 139) {
                                            if (this.Class38 == Char.getMyChar()) {
                                                GameScr.Class152 = 1;
                                                GameScr.Class153 = 0;
                                            }
                                            Game16.Class1(91, this.Class38, 2);
                                            break Label_7381;
                                        }
                                        if (this.getTemplate().Class5 == 140 || this.getTemplate().Class5 == 161) {
                                            if (this.Class38 == Char.getMyChar()) {
                                                GameScr.Class152 = 1;
                                                GameScr.Class153 = 0;
                                            }
                                            Game16.Class1(112, this.Class38, 2);
                                            Game16.Class1(109, this.Class38.cx - 40, this.Class38.cy - 40, 1);
                                            Game16.Class1(109, this.Class38.cx + 40, this.Class38.cy - 40, 1);
                                            Game16.Class1(109, this.Class38.cx - 20, this.Class38.cy, 2);
                                            Game16.Class1(109, this.Class38.cx + 20, this.Class38.cy, 2);
                                            break Label_7381;
                                        }
                                        if (this.getTemplate().Class5 == 141 || this.getTemplate().Class5 == 162) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(108, this.x + this.Class11 / 2, this.y, 1);
                                            }
                                            else {
                                                Game16.Class1(108, this.x - this.Class11 / 2, this.y, 1, (byte)(-1));
                                            }
                                            Game16.Class1(122, this.x, this.y, 1, (byte)this.dir);
                                            Game16.Class1(91, this.Class38, 1);
                                            break Label_7381;
                                        }
                                        if (this.getTemplate().Class5 == 144 || this.getTemplate().Class5 == 163) {
                                            if (this.Class38 == Char.getMyChar()) {
                                                GameScr.Class152 = 1;
                                                GameScr.Class153 = 0;
                                            }
                                            Game16.Class1(112, this.Class38, 2);
                                            Game16.Class1(109, this.Class38.cx - 40, this.Class38.cy - 40, 1);
                                            Game16.Class1(109, this.Class38.cx + 40, this.Class38.cy - 40, 1);
                                            Game16.Class1(109, this.Class38.cx - 20, this.Class38.cy, 2);
                                            Game16.Class1(109, this.Class38.cx + 20, this.Class38.cy, 2);
                                            break Label_7381;
                                        }
                                        if (this.getTemplate().Class5 == 160) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(123, this.x + this.Class11 / 2, this.y - 5, 1);
                                            }
                                            else {
                                                Game16.Class1(123, this.x - this.Class11 / 2, this.y - 5, 1, (byte)(-1));
                                            }
                                            Game16.Class1(91, this.Class38, 1);
                                            break Label_7381;
                                        }
                                        if (this.getTemplate().Class5 == 164 || this.getTemplate().Class5 == 165) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(125, this.x + this.Class11 / 2, this.y, 1);
                                            }
                                            else {
                                                Game16.Class1(125, this.x - this.Class11 / 2, this.y, 1, (byte)(-1));
                                            }
                                            Game16.Class1(90, this.Class38, 1);
                                            break Label_7381;
                                        }
                                        if (this.getTemplate().Class5 == 167) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(125, this.x + this.Class11 / 2, this.y, 1);
                                                break Label_7381;
                                            }
                                            Game16.Class1(125, this.x - this.Class11 / 2, this.y, 1, (byte)(-1));
                                            break Label_7381;
                                        }
                                        else if (this.getTemplate().Class5 == 166) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(108, this.x + this.Class11 / 2, this.y, 1);
                                                break Label_7381;
                                            }
                                            Game16.Class1(108, this.x - this.Class11 / 2, this.y, 1, (byte)(-1));
                                            break Label_7381;
                                        }
                                        else if (this.getTemplate().Class5 == 198) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(143, this.x + this.Class11 / 2, this.y, 1);
                                                break Label_7381;
                                            }
                                            Game16.Class1(143, this.x - this.Class11 / 2, this.y, 1, (byte)(-1));
                                            break Label_7381;
                                        }
                                        else if (this.getTemplate().Class5 == 199) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(144, this.x + this.Class11 / 2, this.y, 1);
                                                break Label_7381;
                                            }
                                            Game16.Class1(144, this.x - this.Class11 / 2, this.y, 1, (byte)(-1));
                                            break Label_7381;
                                        }
                                        else if (this.getTemplate().Class5 == 200) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(142, this.x + this.Class11 / 2, this.y, 1);
                                                break Label_7381;
                                            }
                                            Game16.Class1(142, this.x - this.Class11 / 2, this.y, 1, (byte)(-1));
                                            break Label_7381;
                                        }
                                        else if (this.getTemplate().Class5 == 201) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(144, this.x + this.Class11 / 2, this.y, 1);
                                                break Label_7381;
                                            }
                                            Game16.Class1(144, this.x - this.Class11 / 2, this.y, 1, (byte)(-1));
                                            break Label_7381;
                                        }
                                        else if (this.getTemplate().Class5 == 203) {
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(159, this.x + this.Class11 / 2, this.y, 1);
                                                Game16.Class1(156, this.Class38.cx, this.Class38.cy, 1);
                                                break Label_7381;
                                            }
                                            Game16.Class1(159, this.x - this.Class11 / 2, this.y, 1, (byte)(-1));
                                            Game16.Class1(156, this.Class38.cx, this.Class38.cy, -1);
                                            break Label_7381;
                                        }
                                        else {
                                            if (this.getTemplate().Class5 != 204) {
                                                break Label_7381;
                                            }
                                            if (this.Class38.cx > this.x) {
                                                Game16.Class1(159, this.x + this.Class11 / 2, this.y, 1);
                                                Game16.Class1(173, this.Class38.cx, this.Class38.cy, 1);
                                                break Label_7381;
                                            }
                                            Game16.Class1(159, this.x - this.Class11 / 2, this.y, 1, (byte)(-1));
                                            Game16.Class1(173, this.Class38.cx, this.Class38.cy, -1);
                                            break Label_7381;
                                        }
                                    }
                                }
                                else {
                                    if (Res.abs(n4 - this.x) >= 24 || Res.abs(n5 - this.y) >= 15) {
                                        if (this.isBoss) {
                                            if (this.getTemplate().Class5 == 210) {
                                                if (this.Class38.cx > this.x) {
                                                    Game16.Class1(178, this.Class38.cx, this.Class38.cy, 1);
                                                }
                                                else {
                                                    Game16.Class1(178, this.Class38.cx, this.Class38.cy, 1, (byte)(-1));
                                                }
                                            }
                                            else if (this.getTemplate().Class5 == 209) {
                                                if (this.Class38.cx > this.x) {
                                                    Game16.Class1(179, this.Class38.cx, this.Class38.cy, 1);
                                                }
                                                else {
                                                    Game16.Class1(179, this.Class38.cx, this.Class38.cy, 1, (byte)(-1));
                                                }
                                            }
                                            else if (this.getTemplate().Class5 == 114 || this.getTemplate().Class5 == 115) {
                                                Game97.Class1(this.x + (this.dir - 1) * 15, this.y - 20, this.isBoss, this.levelBoss, this.getTemplate().Class5, this.Class21, this.Class22, this.Class38);
                                            }
                                            else if (this.getTemplate().Class5 == 116) {
                                                Game16.Class1(84, this.Class38, 2);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 138) {
                                                if (this.Class38 == Char.getMyChar()) {
                                                    GameScr.Class152 = 1;
                                                    GameScr.Class153 = 0;
                                                }
                                                Game16.Class1(83, this.Class38, 2);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 139) {
                                                Game97.Class1(this.x + (this.dir - 1) * 30, this.y - 30, this.isBoss, this.levelBoss, this.getTemplate().Class5, this.Class21, this.Class22, this.Class38);
                                            }
                                            else if (this.getTemplate().Class5 == 140 || this.getTemplate().Class5 == 161) {
                                                if (this.Class38 == Char.getMyChar()) {
                                                    GameScr.Class152 = 1;
                                                    GameScr.Class153 = 0;
                                                }
                                                Game16.Class1(110, this.Class38, 2);
                                                Game16.Class1(104, this.Class38.cx - 20, this.Class38.cy, 2);
                                                Game16.Class1(104, this.Class38.cx + 20, this.Class38.cy, 2);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 141 || this.getTemplate().Class5 == 162) {
                                                if (this.Class38 == Char.getMyChar()) {
                                                    GameScr.Class152 = 1;
                                                    GameScr.Class153 = 0;
                                                }
                                                Game16.Class1(121, this.Class38, 1);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 144 || this.getTemplate().Class5 == 163) {
                                                Game97.Class1(this.x + (this.dir - 1) * 15, this.y - 20, this.isBoss, this.levelBoss, this.getTemplate().Class5, this.Class21, this.Class22, this.Class38);
                                            }
                                            else if (this.getTemplate().Class5 == 160) {
                                                Game16.Class1(124, this.Class38, 2);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 164 || this.getTemplate().Class5 == 165) {
                                                Game16.Class1(126, this.Class38, 1);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 167) {
                                                Game16.Class1(112, this.Class38.cx + 5, this.Class38.cy, 1);
                                                Game16.Class1(112, this.Class38.cx - 5, this.Class38.cy, 1);
                                                Game16.Class1(112, this.Class38, 1);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 166) {
                                                Game16.Class1(92, this.Class38.cx + 5, this.Class38.cy, 1);
                                                Game16.Class1(92, this.Class38.cx - 5, this.Class38.cy, 1);
                                                Game16.Class1(92, this.Class38, 1);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 198) {
                                                Game16.Class1(142, this.Class38.cx + 5, this.Class38.cy, 1);
                                                Game16.Class1(142, this.Class38.cx - 5, this.Class38.cy, 1);
                                                Game16.Class1(142, this.Class38, 1);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 199) {
                                                Game16.Class1(143, this.Class38.cx + 5, this.Class38.cy, 1);
                                                Game16.Class1(143, this.Class38.cx - 5, this.Class38.cy, 1);
                                                Game16.Class1(143, this.Class38, 1);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 200) {
                                                Game16.Class1(144, this.Class38.cx + 5, this.Class38.cy, 1);
                                                Game16.Class1(144, this.Class38.cx - 5, this.Class38.cy, 1);
                                                Game16.Class1(144, this.Class38, 1);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 201) {
                                                Game16.Class1(108, this.Class38.cx + 5, this.Class38.cy, 1);
                                                Game16.Class1(108, this.Class38.cx - 5, this.Class38.cy, 1);
                                                Game16.Class1(108, this.Class38, 1);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 203) {
                                                Game16.Class1(149, this.Class38.cx + 5, this.Class38.cy, 1);
                                                Game16.Class1(149, this.Class38.cx - 5, this.Class38.cy, 1);
                                                Game16.Class1(149, this.Class38, 1);
                                                Game16.Class1(156, this.Class38, 1);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                            else if (this.getTemplate().Class5 == 204) {
                                                Game16.Class1(153, this.Class38.cx + 5, this.Class38.cy, 1);
                                                Game16.Class1(153, this.Class38.cx - 5, this.Class38.cy, 1);
                                                Game16.Class1(153, this.Class38, 1);
                                                Game16.Class1(173, this.Class38, 1);
                                                this.Class28 = false;
                                                this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                            }
                                        }
                                        else {
                                            Game97.Class1(this.x - 5, this.y + this.dir * 10, this.isBoss, this.level, this.getTemplate().Class5, this.Class21, this.Class22, this.Class38);
                                        }
                                        this.Class28 = false;
                                        break Label_7381;
                                    }
                                    this.Class38.Class1(this.Class21, this.Class22, this.isBoss, this.getTemplate().Class5);
                                }
                            }
                            else {
                                if (this.Class40 != 1) {
                                    break Label_7381;
                                }
                                if (Res.abs(n4 - this.x) < 24 && Res.abs(n5 - this.y) < 15) {
                                    this.Class39.Class4 = true;
                                }
                                else if (this.isBoss) {
                                    Game97.Class1(this.x - 5, this.y + this.dir * 10 - 20, this.Class39);
                                }
                                else {
                                    Game97.Class1(this.x - 5, this.y + this.dir * 10, this.Class39);
                                }
                            }
                            this.Class28 = false;
                        }
                    }
                    this.dir = ((this.x < n4) ? 1 : -1);
                    break;
                }
                if (this.Class34 == 1) {
                    if (Mob.arrMobTemplate[this.templateId].Class3 != 0 && !this.Class16 && !this.isIce && !this.isWind) {
                        this.x += (this.xFirst - this.x) / 4;
                        this.y += (this.yFirst - this.y) / 4;
                    }
                    if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
                        this.status = 2;
                        this.Class34 = 0;
                        this.Class35 = 0;
                    }
                }
                break;
            }
            case 5: {
                try {
                    if (GameCanvas.gameTick % 4 == 0 && this.isBoss) {
                        ++this.Class43;
                        if (this.Class43 > Mob.arrMobTemplate[this.templateId].Class11.length - 1) {
                            this.Class43 = 0;
                        }
                    }
                }
                catch (Exception ex) {}
                this.Class13 = 0;
                this.Class10();
                break;
            }
            case 6: {
                this.Class13 = 0;
                ++this.Class34;
                this.y += this.Class34;
                if (this.y >= this.yFirst) {
                    this.y = this.yFirst;
                    this.Class34 = 0;
                    this.status = 5;
                    break;
                }
                break;
            }
            case 7: {
                this.Class8();
                break;
            }
        }
        this.Class11();
        if (this.Class46 && this.hp <= 0) {
            GameScr.vMob.removeElement(this);
        }
        this.Class1((byte)1, this.status);
    }
    
    private void Class7() {
        if (this.hp > 0) {
            this.Class13 = 4;
            this.status = 7;
        }
    }
    
    public final void Class1(final Char class38) {
        this.Class28 = true;
        this.Class38 = class38;
        this.Class34 = 0;
        this.Class35 = 0;
        this.status = 3;
        if (this.templateId == 209 || this.templateId == 210) {
            this.Class43 = 0;
        }
        else if (this.templateId == 168 || this.templateId == 176 || this.templateId == 177 || this.templateId == 179) {
            this.Class43 = 6;
        }
        else if (this.templateId == 169 || this.templateId == 171 || this.templateId == 172 || this.templateId == 182) {
            this.Class43 = 2;
        }
        else if (this.templateId == 175) {
            this.Class43 = 7;
        }
        else if (this.templateId == 181 || this.templateId == 185 || this.templateId == 188 || this.templateId == 194 || this.templateId == 192) {
            this.Class43 = 3;
        }
        else if (this.templateId == 183 || this.templateId == 170 || this.templateId == 193) {
            this.Class43 = 4;
        }
        else if (this.templateId == 187 || this.templateId == 168 || this.templateId == 175 || this.templateId == 176 || this.templateId == 179 || this.templateId == 174) {
            this.Class43 = this.Class4(GameCanvas.gameTick);
        }
        else {
            this.Class43 = 0;
        }
        this.Class40 = 0;
    }
    
    public final void Class1(final Game92 class39) {
        this.Class39 = class39;
        this.Class34 = 0;
        this.Class35 = 0;
        this.status = 3;
        this.Class40 = 1;
    }
    
    private void Class8() {
        if (Code.Game30) {
            return;
        }
        this.Class32 = (this.isBoss ? ((this.getTemplate().Class5 == 204) ? 9 : ((this.getTemplate().Class5 == 203) ? 9 : ((this.getTemplate().Class5 == 139) ? 4 : ((this.getTemplate().Class5 == 160) ? 12 : 10)))) : 2);
        if (this.getTemplate().Class5 == 209 || this.getTemplate().Class5 == 210) {
            this.Class32 = 3;
        }
        else if (this.getTemplate().Class5 == 141) {
            this.Class32 = 13;
        }
        else if (this.getTemplate().Class5 == 169 || this.getTemplate().Class5 == 170 || this.getTemplate().Class5 == 171 || this.getTemplate().Class5 == 172 || this.getTemplate().Class5 == 182) {
            this.Class32 = 3;
        }
        else if (this.getTemplate().Class5 == 168 || this.getTemplate().Class5 == 176 || this.getTemplate().Class5 == 177 || this.getTemplate().Class5 == 179 || this.getTemplate().Class5 == 180) {
            this.Class32 = 7;
        }
        else if (this.getTemplate().Class5 == 173 || this.getTemplate().Class5 == 184) {
            this.Class32 = 6;
        }
        else if (this.getTemplate().Class5 == 181 || this.getTemplate().Class5 == 178 || this.getTemplate().Class5 == 185 || this.getTemplate().Class5 == 202) {
            this.Class32 = 4;
        }
        else if (this.getTemplate().Class5 == 174) {
            this.Class32 = 10;
        }
        else if (this.getTemplate().Class5 == 183) {
            this.Class32 = 5;
        }
        else if (this.getTemplate().Class5 == 175) {
            this.Class32 = 8;
        }
        --this.Class13;
        if (this.Class13 <= 0) {
            if ((this.Class30 != null && this.Class31) || this.hp == 0) {
                this.status = 1;
                this.Class35 = this.Class30.Class15 << 3;
                this.Class34 = -5;
                this.Class36 = 0;
            }
            else {
                this.status = 5;
                if (this.Class30 != null) {
                    this.dir = -this.Class30.Class15;
                    if (Res.abs(this.x - this.Class30.cx) < 24) {
                        this.status = 2;
                    }
                }
                final int class34 = 0;
                this.Class36 = class34;
                this.Class35 = class34;
                this.Class34 = class34;
                this.Class13 = 0;
            }
            this.Class30 = null;
            return;
        }
        if (Mob.arrMobTemplate[this.templateId].Class3 != 0 && this.x > this.xFirst - Mob.arrMobTemplate[this.templateId].Class1) {
            Mob.arrMobTemplate[this.templateId].getClass();
        }
    }
    
    private void Class9() {
        if (this.Class34 == 0) {
            final int cx = this.Class38.cx;
            final int cy = this.Class38.cy;
            this.Class40 = this.Class53;
            this.dir = ((this.x < cx) ? 1 : 0);
            if (this.isBoss) {
                ++this.Class43;
                if (this.Class43 >= Mob.arrMobTemplate[this.templateId].Class12[this.Class40].length) {
                    this.Class43 = 0;
                    this.status = 2;
                    this.Class50 = null;
                    this.Class51 = null;
                    this.Class34 = 0;
                    this.Class35 = 0;
                }
                if (this.Class43 == Mob.arrMobTemplate[this.templateId].Class12[this.Class40].length - 1) {
                    if (this.Class54 == 0) {
                        Game16.Class1(this.Class52, cx, cy, 1, (byte)((this.dir == 0) ? -1 : 1));
                    }
                    else if (this.Class54 == 1 && this.Class52 >= 0) {
                        Game39.Class1(this.Class52, cx, cy, (byte)1, (short)(-1), (this.dir == 0) ? -1 : 1);
                    }
                }
                this.Class32 = Mob.arrMobTemplate[this.templateId].Class12[this.Class53][this.Class43];
            }
            else {
                Game16.Class1(this.Class52, cx, cy, 1, (byte)((this.dir == 0) ? -1 : 1));
            }
            if (Mob.arrMobTemplate[this.templateId].Class3 != 0 && !this.Class16 && this.isIce && this.isWind) {
                this.x += (cx - this.x) / 3;
            }
            if (this.x > this.xFirst + Mob.arrMobTemplate[this.templateId].Class1) {
                this.Class34 = 1;
            }
            if (this.x < this.xFirst - Mob.arrMobTemplate[this.templateId].Class1) {
                this.Class34 = 1;
            }
        }
        else if (this.Class34 == 1) {
            if (Mob.arrMobTemplate[this.templateId].Class3 != 0 && !this.Class16 && !this.isIce && !this.isWind) {
                this.x += (this.xFirst - this.x) / 4;
                this.y += (this.yFirst - this.y) / 4;
            }
            if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
                this.status = 2;
                this.Class43 = 0;
                this.Class34 = 0;
                this.Class35 = 0;
            }
        }
    }
    
    private void Class10() {
        try {
            if (Code.Game30) {
                return;
            }
            if (this.Class16 || this.isWind) {
                this.Class32 = 0;
                return;
            }
            switch (Mob.arrMobTemplate[this.templateId].Class3) {
                case 0: {
                    if (this.templateId == 176) {
                        this.status = 9;
                    }
                    this.Class32 = 0;
                }
                case 1:
                case 2:
                case 3: {
                    byte class2;
                    if ((class2 = Mob.arrMobTemplate[this.templateId].Class2) == 1) {
                        if (GameCanvas.gameTick % 2 == 1) {
                            return;
                        }
                    }
                    else if (class2 > 2) {
                        class2 += (byte)(this.mobId % 2);
                    }
                    else if (GameCanvas.gameTick % 2 == 1 && Mob.arrMobTemplate[this.templateId].Class2 != 0) {
                        --class2;
                    }
                    this.x += class2 * this.dir;
                    if (Res.Class2(0, Mob.arrMobTemplate[this.templateId].Class1) == Mob.arrMobTemplate[this.templateId].Class1 / 3) {
                        this.status = 2;
                        this.Class47 = System.currentTimeMillis();
                    }
                    if (this.x > this.xFirst + Mob.arrMobTemplate[this.templateId].Class1) {
                        this.dir = -1;
                        if (this.templateId == 168 || this.templateId == 177) {
                            this.status = 9;
                            this.Class34 = 0;
                        }
                    }
                    else if (this.x < this.xFirst - Mob.arrMobTemplate[this.templateId].Class1) {
                        this.dir = 1;
                        if (this.templateId == 168 || this.templateId == 177) {
                            this.status = 9;
                            this.Class34 = 0;
                        }
                    }
                    if (this.isBoss) {
                        this.Class32 = Mob.arrMobTemplate[this.templateId].Class11[this.Class43];
                        return;
                    }
                    if (this.templateId < 168) {
                        this.Class32 = ((GameCanvas.gameTick % 4 <= 1) ? 1 : 0);
                        return;
                    }
                    this.Class32 = this.Class2(GameCanvas.gameTick);
                }
                case 4: {
                    if (this.templateId >= 236) {
                        if (this.Class29 != null) {
                            byte class3 = Mob.arrMobTemplate[this.templateId].Class2;
                            final byte class4 = Mob.arrMobTemplate[this.templateId].Class2;
                            if (this.Class29.statusMe != 1 && this.Class29.statusMe != 6) {
                                final int x = this.x;
                                final int y = this.y;
                                final int cx = this.Class29.cx;
                                final int cy = this.Class29.cy;
                                final int n = cx;
                                final int n2 = y;
                                final int n3 = x - n;
                                final int n4 = n2 - cy;
                                final int n5 = n3 * n3;
                                final int n6 = n4;
                                final int n7;
                                byte b;
                                if ((n7 = n5 + n6 * n6) <= 0) {
                                    b = 0;
                                }
                                else {
                                    int n8 = (n7 + 1) / 2;
                                    byte b2;
                                    do {
                                        b2 = (byte)n8;
                                        n8 = n8 / 2 + n7 / (n8 << 1);
                                    } while (Math.abs(b2 - n8) > 1);
                                    b = (byte)n8;
                                }
                                if (b > Mob.arrMobTemplate[this.templateId].Class1) {
                                    class3 = (byte)(Mob.arrMobTemplate[this.templateId].Class2 + 2);
                                }
                            }
                            final byte b3 = (byte)(class3 + this.mobId % 2);
                            final byte b4 = (byte)(class4 + this.mobId % 2);
                            if (this.Class29.statusMe == 1 || this.Class29.statusMe == 6) {
                                if (this.x - this.xFirst >= Mob.arrMobTemplate[this.templateId].Class1) {
                                    this.Class48 = true;
                                    this.Class49 = false;
                                }
                                else if (this.xFirst - this.x >= Mob.arrMobTemplate[this.templateId].Class1) {
                                    this.Class49 = true;
                                    this.Class48 = false;
                                }
                            }
                            else {
                                this.Class49 = false;
                                this.Class48 = false;
                                if (this.x > this.xFirst + Mob.arrMobTemplate[this.templateId].Class1) {
                                    this.dir = -1;
                                    if (this.templateId == 179 || this.templateId == 175) {
                                        this.status = 9;
                                    }
                                    this.Class34 = 0;
                                }
                                else if (this.x < this.xFirst - Mob.arrMobTemplate[this.templateId].Class1) {
                                    this.dir = 1;
                                    if (this.templateId == 179 || this.templateId == 175) {
                                        this.status = 9;
                                    }
                                    this.Class34 = 0;
                                }
                            }
                            if (this.Class48) {
                                this.dir = -1;
                            }
                            if (this.Class49) {
                                this.dir = 1;
                            }
                            this.x += b3 * this.dir;
                            if (GameCanvas.gameTick % 10 > 2 && this.templateId != 205 && this.templateId != 206 && this.templateId != 207 && this.templateId != 208) {
                                this.Class55 = -1;
                                this.y += b4 * this.Class33;
                            }
                            if (this.y > this.yFirst + 24) {
                                this.Class33 = -1;
                            }
                            else if (this.y < this.yFirst - (20 + GameCanvas.gameTick % 10)) {
                                this.Class33 = 1;
                            }
                            if (!this.isBoss) {
                                if (this.templateId < 168) {
                                    this.Class32 = ((GameCanvas.gameTick % 4 <= 1) ? 1 : 0);
                                    return;
                                }
                                this.Class32 = this.Class2(GameCanvas.gameTick);
                            }
                        }
                        return;
                    }
                    final byte b5 = (byte)(Mob.arrMobTemplate[this.templateId].Class2 + this.mobId % 2);
                    this.x += b5 * this.dir;
                    if (GameCanvas.gameTick % 10 > 2 && this.templateId != 205 && this.templateId != 206 && this.templateId != 207 && this.templateId != 208) {
                        this.Class55 = -1;
                        this.y += b5 * this.Class33;
                    }
                    if (this.x > this.xFirst + Mob.arrMobTemplate[this.templateId].Class1) {
                        this.dir = -1;
                        if (this.templateId == 179 || this.templateId == 175) {
                            this.status = 9;
                        }
                        this.Class34 = 0;
                    }
                    else if (this.x < this.xFirst - Mob.arrMobTemplate[this.templateId].Class1) {
                        this.dir = 1;
                        if (this.templateId == 179 || this.templateId == 175) {
                            this.status = 9;
                        }
                        this.Class34 = 0;
                    }
                    if (this.y > this.yFirst + 24) {
                        this.Class33 = -1;
                    }
                    else if (this.y < this.yFirst - (20 + GameCanvas.gameTick % 10)) {
                        this.Class33 = 1;
                    }
                    if (this.isBoss) {
                        this.Class32 = Mob.arrMobTemplate[this.templateId].Class11[this.Class43];
                        return;
                    }
                    if (this.templateId < 168) {
                        this.Class32 = ((GameCanvas.gameTick % 4 <= 1) ? 1 : 0);
                        return;
                    }
                    this.Class32 = this.Class2(GameCanvas.gameTick);
                }
                case 5: {
                    final byte b6 = (byte)(Mob.arrMobTemplate[this.templateId].Class2 + this.mobId % 2);
                    this.x += b6 * this.dir;
                    final byte b7 = (byte)(b6 + (GameCanvas.gameTick + this.mobId) % 2);
                    if (GameCanvas.gameTick % 10 > 2) {
                        this.y += b7 * this.Class33;
                    }
                    if (this.x > this.xFirst + Mob.arrMobTemplate[this.templateId].Class1) {
                        this.dir = -1;
                        if (this.templateId == 179 || this.templateId == 175) {
                            this.status = 9;
                        }
                        else {
                            this.status = 2;
                        }
                        this.Class34 = 0;
                    }
                    else if (this.x < this.xFirst - Mob.arrMobTemplate[this.templateId].Class1) {
                        this.dir = 1;
                        if (this.templateId == 179 || this.templateId == 175) {
                            this.status = 9;
                        }
                        else {
                            this.status = 2;
                        }
                        this.Class34 = 0;
                    }
                    if (this.y > this.yFirst + 24) {
                        this.Class33 = -1;
                    }
                    else if (this.y < this.yFirst - (20 + GameCanvas.gameTick % 10)) {
                        this.Class33 = 1;
                    }
                    if (TileMap.tileTypeAt(this.x, this.y, 2)) {
                        if (GameCanvas.gameTick % 10 > 5) {
                            this.y = TileMap.tileYofPixel(this.y);
                            this.status = 4;
                            this.Class34 = 0;
                        }
                        this.Class33 = -1;
                    }
                    if (this.isBoss) {
                        this.Class32 = Mob.arrMobTemplate[this.templateId].Class11[this.Class43];
                        break;
                    }
                    if (this.templateId < 168) {
                        this.Class32 = ((GameCanvas.gameTick % 4 > 1) ? 3 : 1);
                        return;
                    }
                    this.Class32 = this.Class2(GameCanvas.gameTick);
                }
            }
        }
        catch (Exception ex) {}
    }
    
    public final MobTemplate getTemplate() {
        return Mob.arrMobTemplate[this.templateId];
    }
    
    public final boolean Class3() {
        if (this.x < GameScr.Class16) {
            return false;
        }
        if (this.x > GameScr.Class16 + GameScr.Class9) {
            return false;
        }
        if (this.y < GameScr.Class17) {
            return false;
        }
        if (this.y > GameScr.Class17 + GameScr.Class10 + 30) {
            return false;
        }
        if (Mob.arrMobTemplate[this.templateId] == null) {
            return false;
        }
        if (!this.isBoss) {
            if (this.Class32 >= Mob.arrMobTemplate[this.templateId].Class8.length) {
                return false;
            }
            if (Mob.arrMobTemplate[this.templateId].Class8[this.Class32] == null) {
                return false;
            }
            if (this.templateId == 179 || this.templateId == 175 || this.templateId == 202) {
                if (this.status == 8) {
                    return false;
                }
            }
            else if (this.templateId == 176 && (this.Class32 == 1 || this.Class32 == 0)) {
                return false;
            }
        }
        return this.status != 0;
    }
    
    public final void Class1(final mGraphics mGraphics) {
        if (!this.Class3()) {
            return;
        }
        int y = this.y;
        if (this.templateId == 205 || this.templateId == 206 || this.templateId == 207 || this.templateId == 208) {
            ++this.Class55;
            if (this.Class55 > Char.Class140.length - 1) {
                this.Class55 = 0;
            }
        }
        if (this.Class55 >= 0) {
            y += Char.Class140[this.Class55];
        }
        final MobTemplate mobTemplate = Mob.arrMobTemplate[this.templateId];
        if (!this.isBoss) {
            if (this.Class11 == 0) {
                this.Class11 = mGraphics.Class1(mobTemplate.Class8[0]);
            }
            if (this.Class12 == 0) {
                this.Class12 = mGraphics.Class2(mobTemplate.Class8[0]);
            }
        }
        else {
            this.Class11 = 40;
            this.Class12 = 40;
        }
        this.Class2(mGraphics, this.x, y, 0);
        try {
            int n = (this.dir > 0) ? 0 : 2;
            if (this.templateId == 219) {
                n = 0;
            }
            if ((this.templateId == 98 || this.templateId == 99) && this.status == 1) {
                final long currentTimeMillis;
                if ((currentTimeMillis = System.currentTimeMillis()) - this.Class42 < 400L) {
                    mGraphics.Class1(mobTemplate.Class8[this.Class32], 0, 0, mGraphics.Class1(mobTemplate.Class8[this.Class32]), mGraphics.Class2(mobTemplate.Class8[this.Class32]), n, this.x, y, Game62.Class4);
                }
                else if (currentTimeMillis - this.Class42 < 800L) {
                    mGraphics.Class1(mobTemplate.Class8[this.Class32], 0, 0, mGraphics.Class1(mobTemplate.Class8[this.Class32]), 3 * mGraphics.Class2(mobTemplate.Class8[this.Class32]) / 5, n, this.x, y, Game62.Class4);
                }
                else if (currentTimeMillis - this.Class42 < 1200L) {
                    mGraphics.Class1(mobTemplate.Class8[this.Class32], 0, 0, mGraphics.Class1(mobTemplate.Class8[this.Class32]), mGraphics.Class2(mobTemplate.Class8[this.Class32]) / 3, n, this.x, y, Game62.Class4);
                }
                if (GameCanvas.gameTick % 8 < 2) {
                    Game2.Class1(mGraphics, 457, this.x, y, 0, Game62.Class4);
                }
                else if (GameCanvas.gameTick % 8 < 4) {
                    Game2.Class1(mGraphics, 458, this.x, y, 0, Game62.Class4);
                }
                else if (GameCanvas.gameTick % 8 < 6) {
                    Game2.Class1(mGraphics, 459, this.x, y, 0, Game62.Class4);
                }
            }
            else if (this.isBoss) {
                if (this.getTemplate().Class10 != null) {
                    if (this.templateId < 236) {
                        final Game74 game74 = this.getTemplate().Class10[this.Class32];
                        for (int i = 0; i < game74.Class1.length; ++i) {
                            final Game76 game75 = this.getTemplate().Class9[game74.Class3[i]];
                            if (this.dir > 0) {
                                mGraphics.Class1(this.getTemplate().Class8[0], game75.Class1, game75.Class2, game75.Class3, game75.Class4, 0, this.x + game74.Class1[i], y + game74.Class2[i] - 1, 20);
                            }
                            else {
                                mGraphics.Class1(this.getTemplate().Class8[0], game75.Class1, game75.Class2, game75.Class3, game75.Class4, 2, this.x - game74.Class1[i], y + game74.Class2[i] - 1, 24);
                            }
                        }
                    }
                    else {
                        try {
                            if (GameCanvas.gameTick % 2 == 0 && this.status != 3) {
                                ++this.Class59;
                                if (this.Class59 > this.getTemplate().Class11.length - 1) {
                                    this.Class59 = 0;
                                }
                                this.Class32 = this.getTemplate().Class11[this.Class59];
                            }
                            final Game74 game76 = this.getTemplate().Class10[this.Class32];
                            for (int j = 0; j < game76.Class1.length; ++j) {
                                if (game76.Class5[j] != 0) {
                                    final Game76 game77;
                                    int class1 = (game77 = this.getTemplate().Class9[game76.Class3[j]]).Class1;
                                    int class2 = game77.Class2;
                                    int class3 = game77.Class3;
                                    int class4 = game77.Class4;
                                    int n2 = game76.Class1[j];
                                    final short n3 = game76.Class2[j];
                                    if (class1 > this.getTemplate().Class8[0].getWidth()) {
                                        class1 = 0;
                                    }
                                    if (class2 > this.getTemplate().Class8[0].getHeight()) {
                                        class2 = 0;
                                    }
                                    if (class1 + class3 > this.getTemplate().Class8[0].getWidth()) {
                                        class3 = this.getTemplate().Class8[0].getWidth() - class1;
                                    }
                                    if (class2 + class4 > this.getTemplate().Class8[0].getHeight()) {
                                        class4 = this.getTemplate().Class8[0].getHeight() - class2;
                                    }
                                    int n4 = (game76.Class4[j] == 1) ? 2 : 0;
                                    if (this.dir == 1) {
                                        if (n4 == 2) {
                                            n4 = 0;
                                            n2 += class3;
                                        }
                                        else {
                                            n4 = 2;
                                            n2 = -(n2 + class3);
                                        }
                                    }
                                    mGraphics.Class1(this.getTemplate().Class8[0], class1, class2, class3, class4, n4, this.x + n2, this.y + n3, 0);
                                }
                            }
                        }
                        catch (Exception ex) {
                            ex.printStackTrace();
                            System.err.println("Err paintTopMobNew:" + this.templateId);
                        }
                        this.Class2(mGraphics);
                    }
                }
            }
            else {
                mGraphics.Class1(mobTemplate.Class8[this.Class32], 0, 0, mGraphics.Class1(mobTemplate.Class8[this.Class32]), mGraphics.Class2(mobTemplate.Class8[this.Class32]), n, this.x, y, Game62.Class4);
            }
            this.Class1(mGraphics, this.x, y, 0);
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
        }
        int n5 = y;
        if (Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.equals(this) && this.status != 1) {
            if (this.isBoss) {
                int n6;
                if ((n6 = this.maxHp) < this.hp) {
                    n6 = this.hp;
                }
                final int n7 = (int)(this.hp * 100L / n6);
                int class5 = this.Class11;
                int n8 = 4;
                if (this.levelBoss == 1 || this.levelBoss == 2 || this.levelBoss == 3 || this.isBoss) {
                    n8 = 6;
                    final int n9 = class5;
                    class5 = n9 + n9 / 2;
                }
                class5 += 2;
                int n10;
                if ((n10 = class5 * n7 / 100) < 2) {
                    n10 = 2;
                }
                if (this.templateId == 140 || this.templateId == 160) {
                    n5 -= 20;
                }
                if (this.templateId != 142 && this.templateId != 143) {
                    mGraphics.setColor(16777215);
                    mGraphics.fillRect(this.x - class5 / 2 - 1, n5 - this.Class12 - 12, class5, n8);
                    mGraphics.setColor(this.Class4());
                    mGraphics.fillRect(this.x - class5 / 2 - 1, n5 - this.Class12 - 12, n10, n8);
                    mGraphics.setColor(0);
                    mGraphics.Class2(this.x - class5 / 2 - 1, n5 - this.Class12 - 12, class5, n8);
                }
                else {
                    Game2.Class1(mGraphics, 988, this.x, n5 - this.Class12, 0, 33);
                }
            }
            else {
                int n11;
                if ((n11 = this.maxHp) < this.hp) {
                    n11 = this.hp;
                }
                final int n12 = (int)(this.hp * 100L / n11);
                int class6 = this.Class11;
                if (this.templateId > 167) {
                    class6 = this.Class11 / 2;
                }
                int n13 = 4;
                if (this.levelBoss == 1 || this.levelBoss == 2 || this.levelBoss == 3 || this.isBoss) {
                    n13 = 6;
                    final int n14 = class6;
                    class6 = n14 + n14 / 2;
                }
                class6 += 2;
                int n15;
                if ((n15 = class6 * n12 / 100) < 2) {
                    n15 = 2;
                }
                if (this.templateId == 140 || this.templateId == 160) {
                    n5 -= 20;
                }
                if (this.templateId != 142 && this.templateId != 143) {
                    mGraphics.setColor(16777215);
                    mGraphics.fillRect(this.x - class6 / 2 - 1, n5 - this.Class12 - 12, class6, n13);
                    mGraphics.setColor(this.Class4());
                    mGraphics.fillRect(this.x - class6 / 2 - 1, n5 - this.Class12 - 12, n15, n13);
                    mGraphics.setColor(0);
                    mGraphics.Class2(this.x - class6 / 2 - 1, n5 - this.Class12 - 12, class6, n13);
                }
                else {
                    Game2.Class1(mGraphics, 988, this.x, n5 - this.Class12, 0, 33);
                }
            }
            if (this.levelBoss > 0) {
                if (this.levelBoss == 1) {
                    mFont.Class12.drawString(mGraphics, Game86.Class261[this.levelBoss], this.x, n5 - this.Class12 - 26, 2, mFont.Class13);
                }
                else if (this.levelBoss == 2) {
                    mFont.Class12.drawString(mGraphics, Game86.Class261[this.levelBoss], this.x, n5 - this.Class12 - 26, 2, mFont.Class13);
                }
                else if (this.levelBoss == 3) {
                    mFont.Class10.drawString(mGraphics, Game86.Class261[this.levelBoss], this.x, n5 - this.Class12 - 26, 2, mFont.Class13);
                }
                if (this.Class15) {
                    Game2.Class1(mGraphics, 494, this.x, n5 - this.Class12 - 28, 0, 33);
                }
            }
            else if (this.Class15) {
                Game2.Class1(mGraphics, 494, this.x, n5 - this.Class12 - 15, 0, 33);
            }
        }
        else if (this.levelBoss > 0) {
            if (this.levelBoss == 1) {
                mFont.Class12.drawString(mGraphics, Game86.Class261[this.levelBoss], this.x, n5 - this.Class12 - 20, 2, mFont.Class13);
            }
            else if (this.levelBoss == 2) {
                mFont.Class12.drawString(mGraphics, Game86.Class261[this.levelBoss], this.x, n5 - this.Class12 - 20, 2, mFont.Class13);
            }
            else if (this.levelBoss == 3) {
                mFont.Class10.drawString(mGraphics, Game86.Class261[this.levelBoss], this.x, n5 - this.Class12 - 20, 2, mFont.Class13);
            }
            if (this.Class15) {
                Game2.Class1(mGraphics, 494, this.x, n5 - this.Class12 - 22, 0, 33);
            }
        }
        else if (this.Class15) {
            Game2.Class1(mGraphics, 494, this.x, y - this.Class12 - 5, 0, 33);
        }
        if (this.Class16) {
            if (GameCanvas.gameTick % 2 == 0) {
                Game2.Class1(mGraphics, 1082, this.x, y - this.Class12 / 2, 0, 3);
            }
            else {
                Game2.Class1(mGraphics, 1084, this.x, y - this.Class12 / 2, 0, 3);
            }
        }
        if (this.isIce) {
            Game2.Class1(mGraphics, 290, this.x, y, 0, 33);
        }
        if (this.isWind) {
            final int n16;
            if ((n16 = GameCanvas.gameTick % 6) == 0 || n16 == 1) {
                Game2.Class1(mGraphics, 998, this.x, y - this.Class12 - 5, 0, 3);
            }
            else if (n16 == 2 || n16 == 3) {
                Game2.Class1(mGraphics, 999, this.x, y - this.Class12 - 5, 0, 3);
            }
            else if (n16 == 4 || n16 == 5) {
                Game2.Class1(mGraphics, 1000, this.x, y - this.Class12 - 5, 0, 3);
            }
        }
        if (this.isFire) {
            final int n17;
            if ((n17 = GameCanvas.gameTick % 16) == 0) {
                Game2.Class1(mGraphics, 1013, this.x - this.Class11 / 2, y - this.Class12 + this.Class12 / 4, 0, 3);
                return;
            }
            if (n17 == 1) {
                Game2.Class1(mGraphics, 1014, this.x - this.Class11 / 2, y - this.Class12 + this.Class12 / 4, 0, 3);
                return;
            }
            if (n17 == 2) {
                Game2.Class1(mGraphics, 1015, this.x - this.Class11 / 2, y - this.Class12 + this.Class12 / 4, 0, 3);
                return;
            }
            if (n17 == 3) {
                Game2.Class1(mGraphics, 1016, this.x - this.Class11 / 2, y - this.Class12 + this.Class12 / 4, 0, 3);
                return;
            }
            if (n17 == 4) {
                Game2.Class1(mGraphics, 1013, this.x + this.Class11 / 2, y - this.Class12, 0, 3);
                return;
            }
            if (n17 == 5) {
                Game2.Class1(mGraphics, 1014, this.x + this.Class11 / 2, y - this.Class12, 0, 3);
                return;
            }
            if (n17 == 6) {
                Game2.Class1(mGraphics, 1015, this.x + this.Class11 / 2, y - this.Class12, 0, 3);
                return;
            }
            if (n17 == 7) {
                Game2.Class1(mGraphics, 1016, this.x + this.Class11 / 2, y - this.Class12, 0, 3);
                return;
            }
            if (n17 == 8) {
                Game2.Class1(mGraphics, 1013, this.x - this.Class11 / 2, y, 0, 3);
                return;
            }
            if (n17 == 9) {
                Game2.Class1(mGraphics, 1014, this.x - this.Class11 / 2, y, 0, 3);
                return;
            }
            if (n17 == 10) {
                Game2.Class1(mGraphics, 1015, this.x - this.Class11 / 2, y, 0, 3);
                return;
            }
            if (n17 == 11) {
                Game2.Class1(mGraphics, 1016, this.x - this.Class11 / 2, y, 0, 3);
                return;
            }
            if (n17 == 12) {
                Game2.Class1(mGraphics, 1013, this.x + this.Class11 / 2, y - this.Class12 / 4, 0, 3);
                return;
            }
            if (n17 == 13) {
                Game2.Class1(mGraphics, 1014, this.x + this.Class11 / 2, y - this.Class12 / 4, 0, 3);
                return;
            }
            if (n17 == 14) {
                Game2.Class1(mGraphics, 1015, this.x + this.Class11 / 2, y - this.Class12 / 4, 0, 3);
                return;
            }
            if (n17 == 15) {
                Game2.Class1(mGraphics, 1016, this.x + this.Class11 / 2, y - this.Class12 / 4, 0, 3);
            }
        }
    }
    
    public final int Class4() {
        if (this.Class23 <= 1) {
            return 16711680;
        }
        if (this.Class23 == 2) {
            return 33023;
        }
        if (this.Class23 == 3) {
            return 7443811;
        }
        return 16711680;
    }
    
    public final void Class5() {
        this.hp = 0;
        this.Class42 = System.currentTimeMillis();
        if (this.Class30 != null) {
            this.Class31 = true;
            return;
        }
        this.Class31 = true;
        this.hp = 0;
        this.status = 1;
        this.Class34 = -5;
        this.Class35 = -this.dir << 2;
        this.Class36 = 0;
    }
    
    public final void Class1(final Mob class50) {
        this.Class50 = class50;
    }
    
    public final void Class2(final Char class51) {
        this.Class51 = class51;
    }
    
    private void Class11() {
        if (this.Class50 != null) {
            if (this.isBoss) {
                this.status = 3;
            }
            else {
                final int n = this.Class50.x - this.x;
                final int n2 = this.Class50.y - this.y;
                this.x += n / 4;
                this.y += n2 / 4;
                this.dir = ((this.x < this.Class50.x) ? 1 : 0);
                if (this.Class50.status == 1 || this.Class50.status == 0 || (Res.abs(n) < 20 && Res.abs(n2) < 20)) {
                    if (this.Class54 == 0) {
                        Game16.Class1((this.Class52 == -1) ? 59 : this.Class52, this.Class50.x, this.Class50.y, (this.dir == 0) ? -1 : 1);
                    }
                    else if (this.Class54 == 1 && this.Class52 >= 0) {
                        Game39.Class1(this.Class52, this.Class50.x, this.Class50.y, (byte)1, (short)(-1), (this.dir == 0) ? -1 : 1);
                    }
                    this.Class50 = null;
                }
            }
        }
        if (this.Class51 != null) {
            if (this.isBoss) {
                this.status = 3;
                return;
            }
            final int n3 = this.Class51.cx - this.x;
            final int n4 = this.Class51.cy - this.y;
            this.x += n3 / 4;
            this.y += n4 / 4;
            this.dir = ((this.x < this.Class51.cx) ? 1 : 0);
            if (this.Class51.statusMe == 5 || this.Class51.statusMe == 14 || (Res.abs(n3) < 20 && Res.abs(n4) < 20)) {
                if (this.Class54 == 0) {
                    Game16.Class1((this.Class52 == -1) ? 59 : this.Class52, this.Class51.cx, this.Class51.cy, (this.dir == 0) ? -1 : 1);
                }
                else if (this.Class54 == 1 && this.Class52 >= 0) {
                    Game39.Class1(this.Class52, this.Class51.cx, this.Class51.cy, (byte)1, (short)(-1), (this.dir == 0) ? -1 : 1);
                }
                this.Class51 = null;
            }
        }
    }
    
    public final void Class1(final short class52, final byte class53, final byte class54) {
        this.Class52 = class52;
        this.Class53 = class53;
        this.Class54 = class54;
    }
    
    public final void Class6() {
        if (this.templateId == 116) {
            Game16.Class1(84, Char.getMyChar(), 1);
            return;
        }
        if (this.templateId == 115) {
            Game16.Class1(81, Char.getMyChar(), 1);
            return;
        }
        if (this.templateId == 138) {
            Game16.Class1(90, Char.getMyChar(), 1);
            return;
        }
        if (this.templateId == 139) {
            Game16.Class1(91, Char.getMyChar(), 1);
            return;
        }
        if (this.templateId == 140 || this.templateId == 161) {
            Game16.Class1(110, Char.getMyChar(), 2);
            return;
        }
        if (this.templateId == 141 || this.templateId == 162) {
            Game16.Class1(121, Char.getMyChar(), 1);
            return;
        }
        if (this.templateId == 144 || this.templateId == 163) {
            Game16.Class1(121, Char.getMyChar(), 1);
            return;
        }
        if (this.templateId == 160) {
            Game16.Class1(124, Char.getMyChar(), 1);
            return;
        }
        if (this.templateId == 164 || this.templateId == 165) {
            Game16.Class1(126, this.Class38, 1);
            return;
        }
        if (this.templateId == 166) {
            Game16.Class1(103, this.Class38, 1);
            return;
        }
        if (this.templateId == 166) {
            Game16.Class1(105, this.Class38, 1);
        }
    }
    
    private int Class2(int n) {
        n %= Mob.Class56[this.templateId - 168].length;
        if (this.templateId != 198 && this.templateId != 199 && this.templateId != 200 && this.templateId != 201 && this.templateId != 203 && this.templateId != 204) {
            return Mob.Class56[this.templateId - 168][n];
        }
        return 0;
    }
    
    private int Class3(int n) {
        try {
            n %= Mob.Class57[this.templateId - 168].length;
            return Mob.Class57[this.templateId - 168][n];
        }
        catch (Exception ex) {
            return 0;
        }
    }
    
    private int Class4(int n) {
        n %= 5;
        if (this.templateId == 178) {
            switch (n) {
                case 0: {
                    return 5;
                }
                case 1: {
                    return 6;
                }
                case 2: {
                    return 7;
                }
                case 3: {
                    return 8;
                }
            }
        }
        else if (this.templateId == 168) {
            switch (n) {
                case 0: {
                    return 1;
                }
                case 1: {
                    return 2;
                }
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                case 4: {
                    return 5;
                }
            }
        }
        else if (this.templateId == 179) {
            switch (n) {
                case 0: {
                    return 0;
                }
                case 1: {
                    return 2;
                }
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                case 4: {
                    return 5;
                }
            }
        }
        else if (this.templateId == 175) {
            switch (n) {
                case 0: {
                    return 0;
                }
                case 1: {
                    return 2;
                }
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                case 4: {
                    return 5;
                }
            }
        }
        else if (this.templateId == 176) {
            switch (n) {
                case 0: {
                    return 2;
                }
                case 1: {
                    return 3;
                }
                case 2: {
                    return 4;
                }
                case 3: {
                    return 5;
                }
                case 4: {
                    return 6;
                }
            }
        }
        else if (this.templateId == 177) {
            switch (n) {
                case 0: {
                    return 1;
                }
                case 1: {
                    return 2;
                }
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                case 4: {
                    return 5;
                }
            }
        }
        else if (this.templateId == 174) {
            switch (n) {
                case 0: {
                    return 5;
                }
                case 1: {
                    return 6;
                }
                case 2: {
                    return 7;
                }
                case 3: {
                    return 8;
                }
                case 4: {
                    return 9;
                }
            }
        }
        return 0;
    }
    
    private int Class5(int n) {
        try {
            n %= Mob.Class58[this.templateId - 168].length;
            return Mob.Class58[this.templateId - 168][n];
        }
        catch (Exception ex) {
            return 0;
        }
    }
    
    private void Class12() {
        if (this.Class34 == 0) {
            int n = 0;
            int n2 = 0;
            if (this.Class50 != null) {
                n = this.Class50.x;
                n2 = this.Class50.y;
            }
            if (this.Class51 != null) {
                n = this.Class51.cx;
                n2 = this.Class51.cy;
            }
            this.Class40 = this.Class53;
            this.dir = ((this.x < n) ? 1 : 0);
            if (this.isBoss) {
                ++this.Class43;
                if (this.Class43 >= Mob.arrMobTemplate[this.templateId].Class12[this.Class40].length) {
                    this.Class43 = 0;
                    this.status = 2;
                    this.Class50 = null;
                    this.Class51 = null;
                    this.Class34 = 0;
                    this.Class35 = 0;
                }
                if (this.Class43 == Mob.arrMobTemplate[this.templateId].Class12[this.Class40].length - 2) {
                    if (this.Class54 == 0) {
                        Game16.Class1((this.Class52 == -1) ? 59 : this.Class52, n, n2, 1, (byte)((this.dir == 0) ? -1 : 1));
                    }
                    else if (this.Class54 == 1 && this.Class52 >= 0) {
                        Game39.Class1(this.Class52, n, n2, (byte)1, (short)(-1), (this.dir == 0) ? -1 : 1);
                    }
                }
                this.Class32 = Mob.arrMobTemplate[this.templateId].Class12[this.Class53][this.Class43];
            }
            if (Mob.arrMobTemplate[this.templateId].Class3 != 0 && !this.Class16 && this.isIce && this.isWind) {
                this.x += (n - this.x) / 3;
            }
            if (this.x > this.xFirst + Mob.arrMobTemplate[this.templateId].Class1) {
                this.Class34 = 1;
            }
            if (this.x < this.xFirst - Mob.arrMobTemplate[this.templateId].Class1) {
                this.Class34 = 1;
            }
        }
        else if (this.Class34 == 1) {
            if (Mob.arrMobTemplate[this.templateId].Class3 != 0 && !this.Class16 && !this.isIce && !this.isWind) {
                this.x += (this.xFirst - this.x) / 4;
                this.y += (this.yFirst - this.y) / 4;
            }
            if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
                this.status = 2;
                this.Class43 = 0;
                this.Class34 = 0;
                this.Class35 = 0;
            }
        }
    }
    
    public static Mob Class1(final int n) {
        for (int i = GameScr.vMob.size() - 1; i >= 0; --i) {
            final Mob mob;
            if ((mob = (Mob)GameScr.vMob.elementAt(i)) != null && mob.mobId == n) {
                return mob;
            }
        }
        return null;
    }
    
    private void Class2(final mGraphics mGraphics) {
        try {
            final Game74 game74 = this.getTemplate().Class10[this.Class32];
            for (int i = 0; i < game74.Class1.length; ++i) {
                if (game74.Class5[i] == 0) {
                    final Game76 game75;
                    int class1 = (game75 = this.getTemplate().Class9[game74.Class3[i]]).Class1;
                    int class2 = game75.Class2;
                    int class3 = game75.Class3;
                    int class4 = game75.Class4;
                    int n = game74.Class1[i];
                    final short n2 = game74.Class2[i];
                    if (class1 > this.getTemplate().Class8[0].getWidth()) {
                        class1 = 0;
                    }
                    if (class2 > this.getTemplate().Class8[0].getHeight()) {
                        class2 = 0;
                    }
                    if (class1 + class3 > this.getTemplate().Class8[0].getWidth()) {
                        class3 = this.getTemplate().Class8[0].getWidth() - class1;
                    }
                    if (class2 + class4 > this.getTemplate().Class8[0].getHeight()) {
                        class4 = this.getTemplate().Class8[0].getHeight() - class2;
                    }
                    int n3 = (game74.Class4[i] == 1) ? 2 : 0;
                    if (this.dir == 1) {
                        if (n3 == 2) {
                            n3 = 0;
                            n += class3;
                        }
                        else {
                            n3 = 2;
                            n = -(n + class3);
                        }
                    }
                    mGraphics.Class1(this.getTemplate().Class8[0], class1, class2, class3, class4, n3, this.x + n, this.y + n2, 0);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Err DataSkillEff  paintBottomEff:" + this.templateId);
        }
    }
    
    public boolean zisBoss() {
        return this.isBoss;
    }
    
    public static Mob MobName(final int n) {
        for (int i = GameScr.vMob.size() - 1; i >= 0; --i) {
            final Mob mob;
            if ((mob = (Mob)GameScr.vMob.elementAt(i)) != null && mob.level == n && !mob.isBoss) {
                return mob;
            }
        }
        return null;
    }
}
