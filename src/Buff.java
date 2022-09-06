// 
// Decompiled by Procyon v0.5.36
// 

public final class Buff extends Auto
{
    private boolean cx2;
    private boolean cy2;
    private long Pk;
    
    public Buff() {
        this.Pk = 0L;
    }
    
    public final void update(final int idMap, final int khutheodanhsach, final boolean cx2, final boolean cy2) {
        super.auto_D();
        super.iDMap = idMap;
        super.khutheodanhsach = khutheodanhsach;
        super.DKcheckThem2 = TileMap.Game7hend(idMap);
        this.cx2 = cx2;
        this.cy2 = cy2;
        super.DanhNhom = true;
    }
    
    public final void Run() {
        if (Auto.booleanChet()) {
            Auto.HoiSinh(true);
            return;
        }
        if (super.iDMap == TileMap.mapID && (TileMap.Game7hend(super.iDMap) || super.khutheodanhsach == TileMap.zoneID)) {
            final Char myChar = Char.getMyChar();
            if (this.cy2 && (GameScr.vParty.size() > 1 || Code.Game9.size() > 0) && myChar.nClass.classId == 6) {
                int i = 0;
                while (i < myChar.vSkillFight.size()) {
                    final Skill skill;
                    if ((skill = (Skill)myChar.vSkillFight.elementAt(i)) != null && skill.template.type == 4) {
                        if (System.currentTimeMillis() - this.Pk > 3000L) {
                            for (int j = 0; j < GameScr.vParty.size(); ++j) {
                                final Party party;
                                if ((party = (Party)GameScr.vParty.elementAt(j)).charId != myChar.charID && party.c != null && party.c.cHP <= 0) {
                                    final int cx = myChar.cx;
                                    final int cy = myChar.cy;
                                    final Char c;
                                    Char.Move((c = party.c).cx, c.cy);
                                    Code.sleep(500L);
                                    if (Auto.Chet(c)) {
                                        this.Pk = System.currentTimeMillis();
                                        Service.gI().buffLive(party.charId);
                                        skill.lastTimeUseThisSkill = System.currentTimeMillis();
                                        skill.paintCanNotUseSkill = true;
                                        myChar.setAutoSkillPaint(GameScr.sks[skill.template.id], 0);
                                        Code.sleep(1000L);
                                    }
                                    Char.Move(cx, cy);
                                    return;
                                }
                            }
                            for (int k = 0; k < GameScr.vCharInMap.size(); ++k) {
                                final Char char1;
                                if ((char1 = (Char)GameScr.vCharInMap.elementAt(k)) != null && Auto.Chet(char1) && Code.Game1(char1.cName)) {
                                    final int cx2 = myChar.cx;
                                    final int cy2 = myChar.cy;
                                    Char.Move(char1.cx, char1.cy);
                                    Code.sleep(500L);
                                    if (Auto.Chet(char1)) {
                                        this.Pk = System.currentTimeMillis();
                                        Service.gI().buffLive(char1.charID);
                                        skill.lastTimeUseThisSkill = System.currentTimeMillis();
                                        skill.paintCanNotUseSkill = true;
                                        myChar.setAutoSkillPaint(GameScr.sks[skill.template.id], 0);
                                        Code.sleep(1000L);
                                    }
                                    Char.Move(cx2, cy2);
                                    return;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    else {
                        ++i;
                    }
                }
            }
            final Char char2 = (GameScr.vParty.size() > 0) ? GameScr.vParty.firstElement().c : null;
            if (this.cx2 && this.ChiaSeVitri2() && char2 != null && myChar.nClass.classId == 6) {
                for (int l = 0; l < myChar.vSkillFight.size(); ++l) {
                    final Skill skill2;
                    if ((skill2 = (Skill)myChar.vSkillFight.elementAt(l)) != null && !skill2.isCooldown() && skill2.template.type == 2 && (skill2.template.id < 67 || skill2.template.id > 72) && (skill2.template.id != 47 || char2.cHP < char2.cMaxHP * Char.aHpValue / 100)) {
                        for (int n = 0; n < char2.vEff.size(); ++n) {
                            char2.vEff.elementAt(n);
                        }
                        final int cx3 = myChar.cx;
                        final int cy3 = myChar.cy;
                        Char.Move(char2.cx, char2.cy);
                        Service.gI().selectSkill(skill2.template.id);
                        Service.gI().sendUseSkillMyBuff();
                        skill2.lastTimeUseThisSkill = System.currentTimeMillis();
                        skill2.paintCanNotUseSkill = true;
                        myChar.setAutoSkillPaint(GameScr.sks[skill2.template.id], 0);
                        Code.sleep(1000L);
                        Char.Move(cx3, cy3);
                        return;
                    }
                }
            }
            if (Code.BatTatPKAS) {
                Char char3;
                if (((char3 = myChar.charFocus) == null || (!DSPK.Ten(char3.cName) && !Auto.boolCheckpkchar(myChar, char3))) && (char3 = this.QuetMap(myChar, -1)) == null) {
                    char3 = Auto.KhoangcachCharChar(myChar);
                }
                final boolean b = char3 != null && DSPK.Ten(char3.cName);
                if (char3 == null && super.batpk) {
                    Service.gI().changePk(0);
                    super.batpk = false;
                }
                if (myChar.cPk >= 5 && System.currentTimeMillis() - super.TimechoPKSK > 5000L) {
                    final Item kiemTraiditem21;
                    if ((kiemTraiditem21 = Char.KiemTraiditem21(257)) != null && kiemTraiditem21.template.id == 257) {
                        Service.gI().useItem(kiemTraiditem21.indexUI);
                    }
                    super.TimechoPKSK = System.currentTimeMillis();
                }
                if (char3 != null && char3 != null && !Auto.Chet(char3) && (b || Auto.boolCheckpkchar(myChar, char3))) {
                    final Skill kctsa = Auto.KCTSA;
                    if (b) {
                        if ((kctsa.template.type == 1 || kctsa.template.type == 3) && (Res.abs(myChar.cx - char3.cx) > kctsa.dx + 30 || Res.abs(myChar.cy - char3.cy) > kctsa.dy + 30) && System.currentTimeMillis() - super.TiemThemsa > 1500L) {
                            Auto.ApSatChar(char3);
                            super.TiemThemsa = System.currentTimeMillis();
                        }
                        if (char3.killCharId != myChar.charID && char3.cTypePk != 3) {
                            super.batpk = true;
                            Service.gI().changePk(3);
                        }
                    }
                    final int dx = kctsa.dx;
                    final int dy = kctsa.dy;
                    Auto.DanhQuai.removeAllElements();
                    Auto.DanhNguoi.removeAllElements();
                    Auto.DanhNguoi.addElement(char3);
                    for (int n2 = 0; n2 < GameScr.vCharInMap.size() && Auto.DanhQuai.size() + Auto.DanhNguoi.size() < kctsa.maxFight; ++n2) {
                        final Char char4;
                        if ((char4 = (Char)GameScr.vCharInMap.elementAt(n2)).cHP > 0 && char4.statusMe != 14 && char4.statusMe != 5 && char4.statusMe != 15 && !char4.equals(char3) && (char4.cTypePk == 3 || myChar.cTypePk == 3 || (char4.cTypePk == 1 && myChar.cTypePk == 1) || (myChar.killCharId >= 0 && myChar.killCharId == char4.charID) || (myChar.testCharId >= 0 && myChar.testCharId == char4.charID)) && !Code.MoiVaoNhom(char4.cName) && char3.cx - dx <= char4.cx && char4.cx <= char3.cx + dx && char3.cy - dy <= char4.cy && char4.cy <= char3.cy + dy) {
                            Auto.DanhNguoi.addElement(char4);
                        }
                    }
                    Service.gI().sendPlayerAttack(Auto.DanhQuai, Auto.DanhNguoi, 2);
                    if (System.currentTimeMillis() - kctsa.lastTimeUseThisSkill >= kctsa.coolDown) {
                        kctsa.lastTimeUseThisSkill = System.currentTimeMillis();
                        kctsa.paintCanNotUseSkill = true;
                        if (!Code.BangSkill) {
                            myChar.setAutoSkillPaint(GameScr.sks[kctsa.template.id], 0);
                        }
                    }
                    super.TimeDiHangDong = System.currentTimeMillis();
                }
            }
        }
        else {
            this.TuDanhPkTTDTN(super.iDMap, super.khutheodanhsach, -1, -1);
        }
    }
}
