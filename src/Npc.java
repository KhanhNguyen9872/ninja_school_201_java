import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Npc extends Char
{
    public NpcTemplate template;
    public static NpcTemplate[] arrtemplate;
    
    public Npc(final int statusMe, final int cx, final int cy, final int n) {
        super.cx = cx;
        super.cy = cy;
        super.statusMe = statusMe;
        this.template = Npc.arrtemplate[n];
    }
    
    public static void Class31() {
        for (int i = 0; i < GameScr.vNpc.size(); ++i) {
            final Npc npc;
            (npc = (Npc)GameScr.vNpc.elementAt(i)).Class148 = null;
            npc.Class147 = -1;
        }
    }
    
    public final void Class8() {
        Label_0257: {
            if (super.Class148 == null) {
                final byte[] array = { -1, 9, 9, 10, 10, 11, 11 };
                Label_0252: {
                    if (Char.getMyChar().ctaskId >= 9 && Char.getMyChar().ctaskId <= 10 && Char.getMyChar().nClass.classId > 0 && array[Char.getMyChar().nClass.classId] == this.template.npcTemplateId) {
                        if (Char.getMyChar().taskMaint != null) {
                            if (Char.getMyChar().taskMaint != null && Char.getMyChar().taskMaint.index + 1 == Char.getMyChar().taskMaint.subNames.length) {
                                super.Class148 = GameScr.efs[62];
                                break Label_0252;
                            }
                            break Label_0257;
                        }
                    }
                    else {
                        GameScr.gI();
                        final byte taskNpcId = GameScr.getTaskNpcId();
                        if (Char.getMyChar().taskMaint != null || taskNpcId != this.template.npcTemplateId) {
                            if (Char.getMyChar().taskMaint == null || taskNpcId != this.template.npcTemplateId) {
                                break Label_0257;
                            }
                            if (Char.getMyChar().taskMaint.index + 1 == Char.getMyChar().taskMaint.subNames.length) {
                                super.Class148 = GameScr.efs[62];
                                break Label_0252;
                            }
                        }
                    }
                    super.Class148 = GameScr.efs[57];
                }
                super.Class147 = 0;
            }
        }
        super.Class8();
    }
    
    public final void Class1(final mGraphics mGraphics) {
        if (!this.Class17()) {
            return;
        }
        if (super.statusMe == 15) {
            return;
        }
        if (super.cTypePk != 0) {
            super.Class1(mGraphics);
            return;
        }
        if (this.template == null) {
            return;
        }
        if (this.template.npcTemplateId == 13) {
            if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.equals(this)) {
                Game2.Class1(mGraphics, 988, super.cx, super.cy - super.Class59 - 1, 0, 33);
            }
            Game2.Class1(mGraphics, 1060, super.cx, super.cy, 0, 33);
            mFont.number_red.Class1(mGraphics, new StringBuffer(String.valueOf(TileMap.zoneID)).toString(), super.cx, super.cy - 10 - 2 - mFont.Class9.Class1, 2);
            return;
        }
        if (this.template.npcTemplateId == 31) {
            if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.equals(this)) {
                Game2.Class1(mGraphics, 988, super.cx, super.cy - super.Class59 - 1, 0, 33);
            }
            Game2.Class1(mGraphics, 1291, super.cx, super.cy, 0, 33);
            return;
        }
        if (this.template.npcTemplateId == 27) {
            if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.equals(this)) {
                Game2.Class1(mGraphics, 988, super.cx, super.cy - super.Class59 - 1, 0, 33);
            }
            Game2.Class1(mGraphics, 1224, super.cx, super.cy, 0, 33);
            return;
        }
        final Game99 game99 = GameScr.Class28[this.template.headId];
        final Game99 game100 = GameScr.Class28[this.template.legId];
        final Game99 game101 = GameScr.Class28[this.template.bodyId];
        if (super.Class15 == 1) {
            Game2.Class1(mGraphics, game99.Class1[Char.Class127[super.Class62][0][0]].Class1, super.cx + Char.Class127[super.Class62][0][1] + game99.Class1[Char.Class127[super.Class62][0][0]].Class2, super.cy - Char.Class127[super.Class62][0][2] + game99.Class1[Char.Class127[super.Class62][0][0]].Class3, 0, 0);
            Game2.Class1(mGraphics, game100.Class1[Char.Class127[super.Class62][1][0]].Class1, super.cx + Char.Class127[super.Class62][1][1] + game100.Class1[Char.Class127[super.Class62][1][0]].Class2, super.cy - Char.Class127[super.Class62][1][2] + game100.Class1[Char.Class127[super.Class62][1][0]].Class3, 0, 0);
            Game2.Class1(mGraphics, game101.Class1[Char.Class127[super.Class62][2][0]].Class1, super.cx + Char.Class127[super.Class62][2][1] + game101.Class1[Char.Class127[super.Class62][2][0]].Class2, super.cy - Char.Class127[super.Class62][2][2] + game101.Class1[Char.Class127[super.Class62][2][0]].Class3, 0, 0);
        }
        else {
            Game2.Class1(mGraphics, game99.Class1[Char.Class127[super.Class62][0][0]].Class1, super.cx - Char.Class127[super.Class62][0][1] - game99.Class1[Char.Class127[super.Class62][0][0]].Class2, super.cy - Char.Class127[super.Class62][0][2] + game99.Class1[Char.Class127[super.Class62][0][0]].Class3, 2, 24);
            Game2.Class1(mGraphics, game100.Class1[Char.Class127[super.Class62][1][0]].Class1, super.cx - Char.Class127[super.Class62][1][1] - game100.Class1[Char.Class127[super.Class62][1][0]].Class2, super.cy - Char.Class127[super.Class62][1][2] + game100.Class1[Char.Class127[super.Class62][1][0]].Class3, 2, 24);
            Game2.Class1(mGraphics, game101.Class1[Char.Class127[super.Class62][2][0]].Class1, super.cx - Char.Class127[super.Class62][2][1] - game101.Class1[Char.Class127[super.Class62][2][0]].Class2, super.cy - Char.Class127[super.Class62][2][2] + game101.Class1[Char.Class127[super.Class62][2][0]].Class3, 2, 24);
        }
        if (super.Class147 >= 0 && super.Class148 != null && super.cTypePk == 0) {
            Game2.Class1(mGraphics, super.Class148.Class2[super.Class147].Class3, super.cx + super.Class148.Class2[super.Class147].Class1, super.cy + super.Class148.Class2[super.Class147].Class2, 0, 3);
            if (GameCanvas.gameTick % 2 == 0) {
                ++super.Class147;
                if (super.Class147 >= super.Class148.Class2.length) {
                    super.Class147 = 0;
                }
            }
        }
        if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.equals(this)) {
            mFont.Class12.drawString(mGraphics, this.template.name, super.cx, super.cy - super.Class59 - mFont.Class9.Class1 - 7, 2, mFont.Class13);
            Game2.Class1(mGraphics, 988, super.cx, super.cy - super.Class59 - 2, 0, 33);
            return;
        }
        mFont.Class12.drawString(mGraphics, this.template.name, super.cx, super.cy - super.Class59 - 3 - mFont.Class9.Class1, 2, mFont.Class13);
    }
}
