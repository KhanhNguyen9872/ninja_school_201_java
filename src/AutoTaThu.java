// 
// Decompiled by Procyon v0.5.36
// 

public final class AutoTaThu extends Auto
{
    private TaskOrder DanhTheoNhom;
    public int Game1;
    public static boolean cy2;
    public static long Pk;
    
    public final void Run() {
        if (super.iDMap < 0 || (super.Landa instanceof SanBoss && System.currentTimeMillis() - super.Thuanhiue >= 3600000L)) {
            final Code code = Code.code;
            Code.Game3();
            return;
        }
        if (Auto.booleanChet()) {
            boolean b = false;
            Label_0165: {
                if (!Char.DanhTheoNhom || TileMap.mapID != super.iDMap || TileMap.zoneID != super.khutheodanhsach || Char.getMyChar().mobFocus == null || Char.getMyChar().mobFocus.hp >= Char.getMyChar().mobFocus.maxHp / 20) {
                    b = false;
                }
                else {
                    for (int i = 0; i < GameScr.vParty.size(); ++i) {
                        final Party party;
                        if ((party = (Party)GameScr.vParty.elementAt(i)).c != null && party.c.cHP > 0) {
                            b = true;
                            break Label_0165;
                        }
                    }
                    b = false;
                }
            }
            if (!b) {
                Auto.HoiSinh(true);
            }
        }
        else if (TileMap.mapID == super.iDMap && TileMap.zoneID == super.khutheodanhsach) {
            if (this.DanhTheoNhom != null && this.DanhTheoNhom.count >= this.DanhTheoNhom.maxCount) {
                GameScr.Paint("Xong T\u00e0 Th\u00fa");
                final Code code2 = Code.code;
                Code.Game3();
                return;
            }
            boolean cy2;
            if (Char.getMyChar().cName.equals(Code.CharPartyGrup)) {
                if (Char.getMyChar().mobFocus == null || Char.getMyChar().mobFocus.hp >= Char.getMyChar().mobFocus.maxHp / 10) {
                    cy2 = false;
                }
                else {
                    if (!LockGame.HuyLockTT()) {
                        Service.gI().chatParty("waitGr");
                        LockGame.LockTaThu(200000L);
                        Service.gI().chatParty("notifyGr");
                    }
                    cy2 = false;
                }
            }
            else {
                if (AutoTaThu.cy2 && System.currentTimeMillis() - AutoTaThu.Pk > 120000L) {
                    AutoTaThu.cy2 = false;
                }
                cy2 = AutoTaThu.cy2;
            }
            if (!cy2) {
                this.Attack(this.Game1, 8);
            }
            if (Char.getMyChar().cMP < Char.getMyChar().cMaxMP * Char.aMpValue / 100) {
                Char.getMyChar().doUsePotion(17);
            }
            if (Char.getMyChar().cHP < Char.getMyChar().cMaxHP * Char.aHpValue / 100) {
                final int n = (int)(System.currentTimeMillis() / 1000L);
                for (int j = 0; j < Char.getMyChar().vEff.size(); ++j) {
                    final Effect effect;
                    if ((effect = (Effect)Char.getMyChar().vEff.elementAt(j)).template.id == 21 && effect.timeLenght - (n - effect.timeStart) >= 2) {
                        return;
                    }
                }
                Char.getMyChar().doUsePotion(16);
            }
        }
        else {
            this.TuDanhPkTTDTN(super.iDMap, super.khutheodanhsach, super.cxL, super.cyL);
        }
    }
    
    @Override
    public final void auto_D() {
        GameScr.Paint(" ");
        super.auto_D();
        this.DanhTheoNhom = Char.FindTask(1);
        if (this.DanhTheoNhom != null) {
            this.Game1 = this.DanhTheoNhom.killId;
            super.iDMap = this.DanhTheoNhom.mapId;
            if (TileMap.mapID == this.DanhTheoNhom.mapId && TileMap.zoneID % 5 == 0) {
                super.khutheodanhsach = TileMap.zoneID;
                return;
            }
        }
        super.khutheodanhsach = 5;
        AutoTaThu.cy2 = false;
    }
    
    @Override
    public final String toString() {
        return "Auto T\u00e0 Th\u00fa";
    }
    
    public final void Login() {
        this.DanhTheoNhom = Char.FindTask(1);
        super.Login();
    }
    
    public final void Game3(final int idMap, final int game1) {
        super.auto_D();
        this.DanhTheoNhom = null;
        this.Game1 = game1;
        super.iDMap = idMap;
        if (TileMap.mapID == idMap && TileMap.zoneID % 5 == 0) {
            super.khutheodanhsach = TileMap.zoneID;
            return;
        }
        super.khutheodanhsach = 5;
    }
}
