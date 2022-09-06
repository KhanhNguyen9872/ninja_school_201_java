// 
// Decompiled by Procyon v0.5.36
// 

public abstract class Auto
{
    public boolean DanhNhom;
    public int iDMap;
    public int khutheodanhsach;
    public boolean DKcheckThem2;
    public int cxL;
    public int cyL;
    private int cx2;
    private int cy2;
    public int badaA;
    public long SXkail;
    public long Thuanhiue;
    public Auto Landa;
    public static boolean Vancons;
    public static Skill KCTSA;
    public static boolean Login2;
    public static MyVector AddMob;
    private static MyVector Pk;
    public static int intPK;
    private static boolean DanhTheoNhom;
    private static long Thoigianchohoisinh;
    public static MyVector DanhQuai;
    public static MyVector DanhNguoi;
    protected long TimeDiHangDong;
    protected long TiemThemsa;
    protected long TimechoPKSK;
    protected boolean batpk;
    private static MyVector MyLenga;
    private static String Game28;
    
    public Auto() {
        this.TimeDiHangDong = 0L;
        this.TiemThemsa = 0L;
        this.TimechoPKSK = 0L;
        this.batpk = false;
    }
    
    public static void KiemtraMob(final Mob o) {
        if (o.isBoss || (o.status != 0 && o.levelBoss != 3 && o.maxHp != o.getTemplate().hp)) {
            if (!o.isBoss && o.levelBoss == 0) {
                if (o.maxHp == 10 * o.getTemplate().hp) {
                    o.levelBoss = 1;
                }
                else {
                    if (o.maxHp != 100 * o.getTemplate().hp && o.templateId != 89) {
                        return;
                    }
                    o.levelBoss = 2;
                }
            }
            if (!Auto.AddMob.contains(o)) {
                Auto.AddMob.addElement(o);
            }
        }
    }
    
    public static void XoaMob() {
        Auto.AddMob.removeAllElements();
    }
    
    public static void KiemTraPk(final Char o) {
        if (o != Char.getMyChar()) {
            if (Auto.Pk.contains(o)) {
                if (o.cTypePk != 3 && o.killCharId != Char.getMyChar().charID) {
                    Auto.Pk.removeElement(o);
                }
            }
            else if (o.cTypePk == 3 || o.killCharId == Char.getMyChar().charID) {
                Auto.Pk.addElement(o);
                if (LockGame.isPk && Res.abs(Char.getMyChar().cx - o.cx) <= 300 && Res.abs(Char.getMyChar().cy - o.cy) <= 300) {
                    LockGame.Lockspk();
                }
            }
        }
    }
    
    public static void XoaPk() {
        Auto.Pk.removeAllElements();
    }
    
    public void auto_D() {
        this.iDMap = -1;
        this.khutheodanhsach = -1;
        this.DKcheckThem2 = false;
        this.Landa = null;
        this.badaA = Char.getMyChar().yen;
        this.SXkail = Char.getMyChar().cEXP;
        this.Thuanhiue = System.currentTimeMillis();
        this.DanhNhom = false;
        Code.intavt = -1;
        Code.KhuMacDinh = 0;
        Auto.Vancons = Char.getMyChar().isHuman;
        Auto.KCTSA = Char.getMyChar().myskill;
        this.Login();
    }
    
    protected void Login() {
        Auto.Login2 = false;
        Code.log = System.currentTimeMillis();
    }
    
    protected static boolean Chet(final Char char1) {
        return char1.cHP <= 0 || char1.statusMe == 14 || char1.statusMe == 5;
    }
    
    protected static boolean booleanChet() {
        return Chet(Char.getMyChar());
    }
    
    protected static void DoiKhu() {
        final Char myChar = Char.getMyChar();
        if (!Char.QuetItemTrongHT(37) && !Char.QuetItemTrongHT(35)) {
            final Npc findNpc;
            if ((findNpc = GameScr.FindNpc(13)) != null && Math.abs(findNpc.cx - myChar.cx) <= 400 && Math.abs(findNpc.cy - myChar.cy) <= 400) {
                Char.Move((findNpc.cx > 400) ? (findNpc.cx - 400) : (findNpc.cx + 400), findNpc.cy);
            }
            Service.gI().openUIZone();
        }
        else {
            Char.Move(myChar.cx, TileMap.pxh);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        while (myChar.cHP > 0 && System.currentTimeMillis() - currentTimeMillis < 5000L) {
            Thread.sleep(100L);
        }
    }
    
    protected final void TuDanhPkTTDTN(int n, int intPK, int n2, int n3) {
        if ((n < 139 || n > 148) && TileMap.mapID >= 139 && TileMap.mapID <= 148) {
            DoiKhu();
            return;
        }
        if (TileMap.typePk(n) && Char.getMyChar().cPk > 0) {
            n = 23;
            intPK = Auto.intPK;
            n3 = -1;
            n2 = -1;
            if (Char.getMyChar().cTypePk != 3) {
                this.batpk = true;
                Service.gI().changePk(3);
            }
        }
        if (TileMap.mapID != n) {
            if (!TileMap.GoMap(n)) {
                if (TileMap.typePk(n)) {
                    Thread.sleep(100L);
                }
                return;
            }
            Thread.sleep(100L);
        }
        if (intPK == -1) {
            if (Code.DanhCK) {
                final int[] danhSachKhu = Code.DanhSachKhu;
                Code.KhuMacDinh = 0;
                DanhChuyenKhu(this.khutheodanhsach = danhSachKhu[0]);
            }
            else {
                this.AutoTaThu(intPK);
            }
        }
        else if (intPK >= 0) {
            DanhChuyenKhu(intPK);
        }
        if (n2 > 0 && n3 > 0) {
            if (this instanceof TuDanh || this instanceof PKBoss) {
                Char.Move(n2, n3);
                return;
            }
            this.FocusMob(PickMob(n2, n3));
        }
    }
    
    protected final void DanhCVT(final int n, final boolean b) {
        if (Code.intavt < 0 || Code.intavt >= Code.avtx.size()) {
            Code.intavt = 0;
        }
        int intValue;
        int intValue2;
        Mob pickMob;
        while (true) {
            intValue = (int)Code.avtx.elementAt(Code.intavt);
            intValue2 = (int)Code.avty.elementAt(Code.intavt);
            pickMob = PickMob(intValue, intValue2);
            if (!this.QuetMob(n, intValue, intValue2) && !this.NePk(intValue, intValue2) && pickMob != null && !this.QuetMob(n, pickMob.x, pickMob.y)) {
                break;
            }
            if (++Code.intavt != Code.avtx.size()) {
                continue;
            }
            Code.intavt = 0;
            if (!Char.ChuyenMapHetBos || !b) {
                continue;
            }
            this.GuiKhuVaoNhom();
        }
        this.cx2 = Char.getMyChar().cx;
        this.cy2 = Char.getMyChar().cy;
        Char.Move(intValue, intValue2);
        Char.getMyChar().mobFocus = pickMob;
        Service.gI().sendAttackMobFast(pickMob.mobId);
        Thread.sleep(100L);
    }
    
    protected Mob HangDong(final Char char1, int cx, int cy, final Char char2, final boolean b) {
        if (Code.BatTatDanhChuyenVitri && Code.avtx.size() > 0) {
            this.DanhCVT(cy, b);
            return PickMob(char1.cx, char1.cy);
        }
        final int n = cy;
        final int n2 = cx;
        cy = char1.cy;
        cx = char1.cx;
        int yFirst = -1;
        int xFirst = -1;
        short levelBoss = -1;
        Mob mob = null;
        final MyVector vMob = GameScr.vMob;
        while (true) {
            for (int i = 0; i < vMob.size(); ++i) {
                final Mob mob2;
                if ((mob2 = (Mob)vMob.elementAt(i)) != null && mob2.hp > 0 && mob2.status != 0 && mob2.status != 1 && boolCheckmob(mob2, n2) && booleCheckthem(mob2.levelBoss, n) && (char2 == null || char2.charID == Char.getMyChar().charID || Res.distance(mob2.xFirst, mob2.yFirst, char2.cx, char2.cy) <= 1000) && !this.QuetMob(n, mob2.x, mob2.y) && !this.NePk(mob2.x, mob2.y)) {
                    if (this.DKcheckThem2) {
                        if (this.iDMap != 157 && this.iDMap != 158 && this.iDMap != 159) {
                            if (yFirst == -1 || mob2.levelBoss < levelBoss || mob2.yFirst < yFirst || (mob2.yFirst == yFirst && mob2.xFirst < xFirst)) {
                                levelBoss = mob2.levelBoss;
                                yFirst = mob2.yFirst;
                                xFirst = mob2.xFirst;
                                mob = mob2;
                            }
                        }
                        else if (mob2.isBoss) {
                            final Mob mob3 = mob2;
                            final Mob mob4 = mob3;
                            if (mob3 != null) {
                                this.FocusMob(mob4);
                                return mob4;
                            }
                            if (System.currentTimeMillis() - this.TimeDiHangDong > 1000L && !this.LengtNhatXaaA()) {
                                if (this.DKcheckThem2) {
                                    final int vitriHaDong;
                                    if ((vitriHaDong = TileMap.VitriHaDong(TileMap.mapID)) >= 0) {
                                        this.iDMap = vitriHaDong;
                                    }
                                    final int n3 = -1;
                                    this.cyL = n3;
                                    this.cxL = n3;
                                    Thread.sleep(500L);
                                }
                                else if (b && Char.ChuyenMapHetBos) {
                                    this.GuiKhuVaoNhom();
                                }
                            }
                            return null;
                        }
                    }
                    else if (Code.KCTSat == -1 || Res.distance(Code.KCTScx, Code.KCTScy, mob2.xFirst, mob2.yFirst) <= Code.KCTSat) {
                        final MyVector myVector = vMob;
                        final Mob mob5 = mob2;
                        int maxFight = 0;
                        for (int j = 0; j < myVector.size(); ++j) {
                            final Mob mob6;
                            if ((mob6 = (Mob)myVector.elementAt(j)) != null && mob6.hp > 0 && mob6.status != 0 && mob6.status != 1 && boolCheckmob(mob5, n2) && booleCheckthem(mob5.levelBoss, n) && Res.abs(mob6.x - mob5.x) <= 100 && Res.abs(mob6.y - mob5.y) <= 50) {
                                ++maxFight;
                            }
                        }
                        if (maxFight > Auto.KCTSA.maxFight) {
                            maxFight = Auto.KCTSA.maxFight;
                        }
                        final int n4 = mob5.levelBoss << 4 | (maxFight & 0xF);
                        final int n5 = (char2 != null && char2.charID != Char.getMyChar().charID) ? Res.distance(char2.cx, char2.cy, mob2.xFirst, mob2.yFirst) : Res.distance(cx, cy, mob2.xFirst, mob2.yFirst);
                        if (n4 > levelBoss || (n4 == levelBoss && n5 < yFirst)) {
                            levelBoss = (short)n4;
                            yFirst = n5;
                            mob = mob2;
                        }
                    }
                }
            }
            final Mob mob3 = mob;
            continue;
        }
    }
    
    protected final Char QuetMap(final Char char1, final int n) {
        for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
            final Char char2;
            if ((char2 = (Char)GameScr.vCharInMap.elementAt(i)) != null && !Chet(char2) && !this.QuetMob(n, char2.cx, char2.cy) && !this.NePk(char2.cx, char2.cy) && !Code.MoiVaoNhom(char2.cName) && DSPK.Ten(char2.cName) && (char2.cTypePk == 1 || char2.killCharId == char1.charID || char1.cPk < 15)) {
                return char2;
            }
        }
        return null;
    }
    
    protected static Char KhoangcachCharChar(Char charFocus) {
        final Char char1 = charFocus;
        final int cy = charFocus.cy;
        final int cx = charFocus.cx;
        charFocus = null;
        final Char myChar = Char.getMyChar();
        final int n = cx - myChar.getdxSkill() - 10;
        final int n2 = cx + myChar.getdxSkill() + 10;
        final int n3 = cy - myChar.getdySkill() - ((myChar.nClass.classId != 0 && myChar.nClass.classId != 1 && myChar.nClass.classId != 3 && myChar.nClass.classId != 5) ? 0 : 40);
        final int n4 = cy + myChar.getdySkill() + ((myChar.nClass.classId != 0 && myChar.nClass.classId != 1 && myChar.nClass.classId != 3 && myChar.nClass.classId != 5) ? 0 : 40);
        int n5 = -1;
        for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
            final Char char2 = (Char)GameScr.vCharInMap.elementAt(i);
            final int abs = Math.abs(cx - char2.cx);
            final int abs2 = Math.abs(cy - char2.cy);
            final int n6 = (abs > abs2) ? abs : abs2;
            if (char2 != null && n <= char2.cx && char2.cx <= n2 && n3 <= char2.cy && char2.cy <= n4 && !Chet(char2) && boolCheckpkchar(myChar, char2) && !Code.MoiVaoNhom(char2.cName) && (n5 == -1 || n6 < n5)) {
                charFocus = char2;
                n5 = n6;
            }
        }
        return char1.charFocus = charFocus;
    }
    
    protected static boolean CheckTemple() {
        final Char myChar;
        if ((myChar = Char.getMyChar()).isHuman && myChar.cHP < myChar.cMaxHP) {
            for (int i = 0; i < myChar.vEff.size(); ++i) {
                final Effect effect;
                if ((effect = (Effect)myChar.vEff.elementAt(i)) != null && effect.template.type == 12) {
                    return true;
                }
            }
        }
        return false;
    }
    
    protected final void Attack(final int n, final int n2) {
        final Char myChar = Char.getMyChar();
        if (!CheckTemple()) {
            final Char char1 = (this.DanhNhom && GameScr.vParty.size() > 0) ? GameScr.vParty.firstElement().c : null;
            final boolean b = !this.DanhNhom || Code.CharPartyGrup == null || (myChar.cName.equals(Code.CharPartyGrup) && LockGame.LockTSAK());
            Mob mob = myChar.mobFocus;
            Char char2 = myChar.charFocus;
            if (Code.BatTatPKAS && (char2 == null || Code.MoiVaoNhom(char2.cName) || (!DSPK.Ten(char2.cName) && !boolCheckpkchar(myChar, char2))) && (char2 = this.QuetMap(myChar, n2)) == null) {
                char2 = KhoangcachCharChar(myChar);
            }
            final boolean b2 = char2 != null && DSPK.Ten(char2.cName);
            if (char2 == null && this.batpk) {
                Service.gI().changePk(0);
                this.batpk = false;
            }
            if (Code.BatTatPKAS && myChar.cPk >= 5 && System.currentTimeMillis() - this.TimechoPKSK > 5000L) {
                final Item kiemTraiditem21;
                if ((kiemTraiditem21 = Char.KiemTraiditem21(257)) != null && kiemTraiditem21.template.id == 257) {
                    Service.gI().useItem(kiemTraiditem21.indexUI);
                }
                this.TimechoPKSK = System.currentTimeMillis();
            }
            if (Code.BatTatDanhChuyenVitri && Code.avtx.size() > 0 && Code.intavt < 0) {
                this.DanhCVT(n2, b);
                return;
            }
            boolean b3 = false;
            if (this.QuetMob(n2, myChar.cx, myChar.cy) || this.NePk(myChar.cx, myChar.cy) || (mob != null && this.QuetMob(n2, mob.x, mob.y))) {
                GameScr.Paint("N\u00e9");
                boolean b4;
                if (Char.ChuyenMapHetBos && b) {
                    this.GuiKhuVaoNhom();
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                if (b4) {
                    return;
                }
                b3 = true;
                mob = null;
            }
            if (mob == null || mob.status == 0 || !boolCheckmob(mob, n) || !booleCheckthem(mob.levelBoss, n2) || System.currentTimeMillis() - this.TimeDiHangDong > 5000L) {
                mob = this.HangDong(myChar, n, n2, char1, b);
            }
            if (mob == null && b3 && this.cx2 > 0 && this.cy2 > 0) {
                Char.Move(this.cx2, this.cy2);
            }
            if (Char.DanhTheoNhom && GameScr.vParty.size() > 0 && myChar.nClass.classId == 6 && myChar.cHP > 0) {
                int i = 0;
                while (i < myChar.vSkillFight.size()) {
                    final Skill skill;
                    if ((skill = (Skill)myChar.vSkillFight.elementAt(i)) != null && skill.template.type == 4) {
                        if (!skill.isCooldown()) {
                            for (int j = 0; j < GameScr.vParty.size(); ++j) {
                                final Party party;
                                if ((party = (Party)GameScr.vParty.elementAt(j)).charId != myChar.charID && party.c != null && party.c.cHP <= 0) {
                                    final Char c = party.c;
                                    if (Math.abs(myChar.cx - c.cx) > 50 || Math.abs(myChar.cy - c.cy) > 50) {
                                        Char.Move(c.cx, c.cy);
                                    }
                                    Thread.sleep(500L);
                                    Service.gI().buffLive(party.charId);
                                    skill.lastTimeUseThisSkill = System.currentTimeMillis();
                                    skill.paintCanNotUseSkill = true;
                                    myChar.setAutoSkillPaint(GameScr.sks[skill.template.id], 0);
                                    Thread.sleep(1000L);
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
            if (Char.SanTATL && !this.DKcheckThem2 && (mob == null || (mob.levelBoss == 0 && (n2 & 0x6) != 0x0))) {
                final boolean b5 = (n2 & 0x2) != 0x0;
                final boolean b6 = (n2 & 0x4) != 0x0;
                for (int k = 0; k < Auto.AddMob.size(); ++k) {
                    final Mob mob2;
                    if ((mob2 = (Mob)Auto.AddMob.elementAt(k)).hp > 0 && mob2.status != 0 && mob2.status != 1 && !this.QuetMob(n2, mob2.x, mob2.y) && !this.NePk(mob2.x, mob2.y) && boolCheckmob(mob2, n) && ((b5 && mob2.levelBoss == 1) || (b6 && mob2.levelBoss == 2))) {
                        mob = mob2;
                        this.FocusMob(mob2);
                        break;
                    }
                }
            }
            if (Auto.KCTSA != null) {
                Skill kctsa;
                if ((kctsa = Auto.KCTSA).isCooldown() && (Char.isABuff || this instanceof Auto20)) {
                Label_1567:
                    for (int l = 0; l < myChar.vSkillFight.size(); ++l) {
                        final Skill skill2;
                        if ((skill2 = (Skill)myChar.vSkillFight.elementAt(l)) != null && System.currentTimeMillis() - skill2.lastTimeUseThisSkill >= skill2.coolDown - 300L) {
                            if (skill2.template.type == 2) {
                                if (((myChar.ThemChar1 != null || !Char.DungPhanThan) && skill2.template.id >= 67 && skill2.template.id <= 72) || (!Char.DungKhiem && skill2.template.id == 31) || (skill2.template.id == 15 && Char.DungDQAT && (myChar.cHP >= myChar.cMaxHP * Char.aHpValue / 100 || !myChar.isHuman)) || (skill2.template.id == 6 && !myChar.isHuman)) {
                                    continue;
                                }
                                final int n3 = (int)(System.currentTimeMillis() / 1000L);
                                for (int n4 = 0; n4 < myChar.vEff.size(); ++n4) {
                                    final Effect effect;
                                    if ((effect = (Effect)myChar.vEff.elementAt(n4)) != null && (effect.template.iconId == skill2.template.iconId || (skill2.template.id == 58 && effect.template.type == 7)) && effect.timeLenght - (n3 - effect.timeStart) >= 2) {
                                        continue Label_1567;
                                    }
                                }
                            }
                            else if (skill2.template.type == 3 && mob != null && mob.levelBoss == 0 && mob.hp > mob.maxHp / 2) {
                                if (skill2.template.id == 4) {
                                    if (!Char.DungDQAT || myChar.cHP >= myChar.cMaxHP * Char.aHpValue / 100) {
                                        continue;
                                    }
                                }
                            }
                            else if ((skill2.template.id != 7 && skill2.template.id != 16 && skill2.template.id != 25 && skill2.template.id != 34 && skill2.template.id != 43) || mob == null || (mob.levelBoss == 0 && mob.hp < mob.maxHp / 2) || ((skill2.template.id == 7 || skill2.template.id == 16) && mob.isFire) || ((skill2.template.id == 25 || skill2.template.id == 34) && !mob.isIce) || (skill2.template.id == 43 && !mob.isWind)) {
                                continue;
                            }
                            kctsa = skill2;
                            Thread.sleep(500L);
                            break;
                        }
                    }
                }
                Service.gI().selectSkill(kctsa.template.id);
                if (kctsa.template.type == 2) {
                    Service.gI().sendUseSkillMyBuff();
                }
                else if (!Code.BatTatPKAS || char2 == null || Chet(char2) || (!b2 && !boolCheckpkchar(myChar, char2))) {
                    if (mob == null || (n != -1 && mob.templateId != n) || !booleCheckthem(mob.levelBoss, n2)) {
                        return;
                    }
                    if ((kctsa.template.type == 1 || kctsa.template.type == 3) && (Res.abs(myChar.cx - mob.xFirst) > kctsa.dx + 30 || Res.abs(myChar.cy - mob.yFirst) > kctsa.dy + 30)) {
                        myChar.mobFocus = null;
                        return;
                    }
                    final int dx = kctsa.dx;
                    final int dy = kctsa.dy;
                    Auto.DanhQuai.removeAllElements();
                    Auto.DanhNguoi.removeAllElements();
                    Auto.DanhQuai.addElement(mob);
                    for (int n5 = 0; n5 < GameScr.vMob.size() && Auto.DanhQuai.size() + Auto.DanhNguoi.size() < kctsa.maxFight; ++n5) {
                        final Mob mob3;
                        if ((mob3 = (Mob)GameScr.vMob.elementAt(n5)).status != 0 && mob3.status != 1 && !mob3.equals(mob) && mob.xFirst - 100 <= mob3.xFirst && mob3.xFirst <= mob.xFirst + 100 && mob.yFirst - 50 <= mob3.yFirst && mob3.yFirst <= mob.yFirst + 50 && booleCheckthem(mob3.levelBoss, n2) && (n == -1 || mob3.templateId == n)) {
                            Auto.DanhQuai.addElement(mob3);
                        }
                    }
                    for (int n6 = 0; n6 < GameScr.vCharInMap.size() && Auto.DanhQuai.size() + Auto.DanhNguoi.size() < kctsa.maxFight; ++n6) {
                        final Char char3;
                        if ((char3 = (Char)GameScr.vCharInMap.elementAt(n6)).cHP > 0 && char3.statusMe != 14 && char3.statusMe != 5 && char3.statusMe != 15 && (char3.cTypePk == 3 || myChar.cTypePk == 3 || (char3.cTypePk == 1 && myChar.cTypePk == 1) || (myChar.killCharId >= 0 && myChar.killCharId == char3.charID) || (myChar.testCharId >= 0 && myChar.testCharId == char3.charID) || char3.killCharId == myChar.charID) && !Code.MoiVaoNhom(char3.cName) && mob.x - dx <= char3.cx && char3.cx <= mob.x + dx && mob.y - dy <= char3.cy && char3.cy <= mob.y + dy) {
                            Auto.DanhNguoi.addElement(char3);
                        }
                    }
                    Service.gI().sendPlayerAttack(Auto.DanhQuai, Auto.DanhNguoi, 1);
                }
                else {
                    if (b2) {
                        if ((kctsa.template.type == 1 || kctsa.template.type == 3) && (Res.abs(myChar.cx - char2.cx) > kctsa.dx + 30 || Res.abs(myChar.cy - char2.cy) > kctsa.dy + 30) && System.currentTimeMillis() - this.TiemThemsa > 1500L) {
                            ApSatChar(char2);
                            this.TiemThemsa = System.currentTimeMillis();
                        }
                        if (char2.killCharId != myChar.charID && char2.cTypePk != 3) {
                            this.batpk = true;
                            Service.gI().changePk(3);
                        }
                    }
                    final int dx2 = kctsa.dx;
                    final int dy2 = kctsa.dy;
                    Auto.DanhQuai.removeAllElements();
                    Auto.DanhNguoi.removeAllElements();
                    Auto.DanhNguoi.addElement(char2);
                    for (int n7 = 0; n7 < GameScr.vCharInMap.size() && Auto.DanhQuai.size() + Auto.DanhNguoi.size() < kctsa.maxFight; ++n7) {
                        final Char char4;
                        if ((char4 = (Char)GameScr.vCharInMap.elementAt(n7)).cHP > 0 && char4.statusMe != 14 && char4.statusMe != 5 && char4.statusMe != 15 && !char4.equals(char2) && (char4.cTypePk == 3 || myChar.cTypePk == 3 || (char4.cTypePk == 1 && myChar.cTypePk == 1) || (myChar.killCharId >= 0 && myChar.killCharId == char4.charID) || (myChar.testCharId >= 0 && myChar.testCharId == char4.charID) || char4.killCharId == myChar.charID) && !Code.MoiVaoNhom(char4.cName) && char2.cx - dx2 <= char4.cx && char4.cx <= char2.cx + dx2 && char2.cy - dy2 <= char4.cy && char4.cy <= char2.cy + dy2) {
                            Auto.DanhNguoi.addElement(char4);
                        }
                    }
                    for (int n8 = 0; n8 < GameScr.vMob.size() && Auto.DanhQuai.size() + Auto.DanhNguoi.size() < kctsa.maxFight; ++n8) {
                        final Mob mob4;
                        if ((mob4 = (Mob)GameScr.vMob.elementAt(n8)).status != 0 && mob4.status != 1 && char2.cx - dx2 <= mob4.x && mob4.x <= char2.cx + dx2 && char2.cy - dy2 <= mob4.y && mob4.y <= char2.cy + dy2 && booleCheckthem(mob4.levelBoss, n2) && (n == -1 || mob4.templateId == n)) {
                            Auto.DanhQuai.addElement(mob4);
                        }
                    }
                    Service.gI().sendPlayerAttack(Auto.DanhQuai, Auto.DanhNguoi, 2);
                }
                if (System.currentTimeMillis() - kctsa.lastTimeUseThisSkill >= kctsa.coolDown) {
                    kctsa.lastTimeUseThisSkill = System.currentTimeMillis();
                    kctsa.paintCanNotUseSkill = true;
                    if (!Code.BangSkill) {
                        myChar.setAutoSkillPaint(GameScr.sks[kctsa.template.id], 0);
                    }
                }
                this.TimeDiHangDong = System.currentTimeMillis();
                if (kctsa.template.id == 15) {
                    Thread.sleep(2000L);
                }
            }
        }
    }
    
    protected boolean LengtNhatXaaA() {
        if (!(this instanceof AutoTaThu) && !Code.BatTatNhatXa) {
            final Char myChar = Char.getMyChar();
            final int n = (Code.KCNhatXa < 0) ? -1 : Code.KCNhatXa;
            for (int i = 0; i < GameScr.vItemMap.size(); ++i) {
                final ItemMap itemMap;
                if (!(itemMap = (ItemMap)GameScr.vItemMap.elementAt(i)).boolItem && ((myChar.nClass.classId == 1 && itemMap.template.id == 218) || itemMap.template.type == 19 || (Code.NhatItem(itemMap.template) && (Char.KichThuocHanhTrang() > 2 || (itemMap.template.isUpToUp && Char.QuetItemTrongHT(itemMap.template.id))))) && (n < 0 || Res.distance(myChar.cx, myChar.cy, itemMap.xEnd, itemMap.yEnd) < n) && !this.NePk(itemMap.x, itemMap.y)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    protected final void PickThemItmnua(final int n) {
        if (!Code.BatTatNhatXa) {
            final Char myChar = Char.getMyChar();
            if (!CheckTemple()) {
                Auto.MyLenga.removeAllElements();
                final int checkThem2 = this.CheckThem2(Char.DanhQuaiThuong, Char.DanhTA, Char.DanhTL);
                for (int i = 0; i < GameScr.vItemMap.size(); ++i) {
                    final ItemMap itemMap;
                    if (!(itemMap = (ItemMap)GameScr.vItemMap.elementAt(i)).boolItem && ((myChar.nClass.classId == 1 && itemMap.template.id == 218) || ((Code.NhatItem(itemMap.template) || itemMap.template.id == n) && (Char.KichThuocHanhTrang() > 2 || itemMap.template.type == 19 || (itemMap.template.isUpToUp && Char.QuetItemTrongHT(itemMap.template.id))))) && !this.QuetMob(checkThem2, itemMap.xEnd, itemMap.yEnd) && !this.NePk(itemMap.xEnd, itemMap.yEnd) && (Code.KCNhatXa < 0 || Res.distance(myChar.cx, myChar.cy, itemMap.xEnd, itemMap.yEnd) < Code.KCNhatXa)) {
                        Auto.MyLenga.addElement(itemMap);
                    }
                }
                if (Auto.MyLenga.size() > 0) {
                    final int cx = myChar.cx;
                    final int cy = myChar.cy;
                    final Mob mobFocus = myChar.mobFocus;
                Label_0413:
                    for (int j = 0; j < Auto.MyLenga.size(); ++j) {
                        final ItemMap itemFocus;
                        Char.Move((itemFocus = (ItemMap)Auto.MyLenga.elementAt(j)).xEnd, TileMap.GoVaoCharA(itemFocus.xEnd, itemFocus.yEnd));
                        myChar.itemFocus = itemFocus;
                        for (int n2 = 0; n2 < 4 && itemFocus.status != 2 && !itemFocus.boolItem; ++n2) {
                            Service.gI().pickItem(itemFocus.itemMapID);
                            if (LockGame.LockPk()) {
                                break;
                            }
                            if (this.NePk(myChar.cx, myChar.cy) || myChar.cHP <= 0) {
                                break Label_0413;
                            }
                        }
                        itemFocus.boolItem = true;
                        itemFocus.TimeNhatItem = System.currentTimeMillis();
                    }
                    Char.Move(cx, cy);
                    myChar.mobFocus = mobFocus;
                }
            }
        }
    }
    
    protected final void PICKVAOAUTOS() {
        if (TileMap.mapID != 22) {
            this.TuDanhPkTTDTN(22, -2, -1, -1);
            return;
        }
        final Char myChar;
        if ((myChar = Char.getMyChar()).ThemChar1 != null) {
            GameScr.PickNpca(12, 3, 0);
            LockGame.LockPickNPCS();
            return;
        }
        for (int i = 0; i < myChar.vSkillFight.size(); ++i) {
            final Skill skill;
            if ((skill = (Skill)myChar.vSkillFight.elementAt(i)) != null && !skill.isCooldown() && skill.template.id >= 67 && skill.template.id <= 72) {
                Service.gI().selectSkill(skill.template.id);
                Service.gI().sendUseSkillMyBuff();
                LockGame.LockPickNPCS();
                break;
            }
        }
        Thread.sleep(200L);
    }
    
    protected abstract void Run();
    
    @Override
    public String toString() {
        return "";
    }
    
    protected final void FocusMob(final Mob mobFocus) {
        if (mobFocus != null) {
            final Char myChar = Char.getMyChar();
            if (Char.gotoTOChar(mobFocus.xFirst, mobFocus.yFirst)) {
                this.cx2 = this.cxL;
                this.cy2 = this.cyL;
                this.cxL = myChar.cx;
                this.cyL = myChar.cy;
                myChar.mobFocus = mobFocus;
                Thread.sleep(200L);
                return;
            }
            myChar.mobFocus = null;
        }
    }
    
    protected static Mob PickMob(final int n, final int n2) {
        Mob mob = null;
        final Char myChar = Char.getMyChar();
        final int n3 = n - myChar.getdxSkill() - 10;
        final int n4 = n + myChar.getdxSkill() + 10;
        final int n5 = n2 - myChar.getdySkill() - ((myChar.nClass.classId != 0 && myChar.nClass.classId != 1 && myChar.nClass.classId != 3 && myChar.nClass.classId != 5) ? 0 : 40);
        int n6;
        if ((n6 = n2 + myChar.getdySkill()) > n2 + 30) {
            n6 = n2 + 30;
        }
        int n7 = -1;
        for (int i = 0; i < GameScr.vMob.size(); ++i) {
            final Mob mob2 = (Mob)GameScr.vMob.elementAt(i);
            final int abs = Math.abs(n - mob2.x);
            final int abs2 = Math.abs(n2 - mob2.y);
            final int n8 = (abs > abs2) ? abs : abs2;
            if (n3 <= mob2.x && mob2.x <= n4 && n5 <= mob2.y && mob2.y <= n6 && mob2.status != 0 && mob2.status != 1 && (n7 == -1 || n8 < n7)) {
                mob = mob2;
                n7 = n8;
            }
        }
        return mob;
    }
    
    protected static void ApSatChar(final Char charFocus) {
        if (charFocus != null) {
            final Char myChar = Char.getMyChar();
            Char.Move(charFocus.cx, TileMap.GoVaoCharA(charFocus.cx, charFocus.cy));
            myChar.charFocus = charFocus;
            Thread.sleep(100L);
        }
    }
    
    protected static void DanhChuyenKhu(final int n) {
        if (TileMap.zoneID != n) {
            final Npc findNpc = GameScr.FindNpc(13);
            int n2 = -1;
            if (findNpc != null && findNpc.statusMe != 15) {
                if (Math.abs(findNpc.cx - Char.getMyChar().cx) > 22 || Math.abs(findNpc.cy - Char.getMyChar().cy) > 22) {
                    Char.Move(findNpc.cx, findNpc.cy);
                }
            }
            else {
                if (TileMap.mapID != 99 && TileMap.mapID != 103 && TileMap.mapID != 134 && TileMap.mapID != 135 && TileMap.mapID != 136 && TileMap.mapID != 137) {
                    return;
                }
                if ((n2 = Char.SoLuong(37)) < 0 && (n2 = Char.SoLuong(35)) < 0) {
                    return;
                }
            }
            Service.gI().requestChangeZone(n, n2);
            TileMap.LockMap();
            Thread.sleep(100L);
        }
    }
    
    public static void HieuUngDonDanh(final SkillPaint skillPaint) {
        if (Auto.DanhQuai.size() > 0 || Auto.DanhNguoi.size() > 0) {
            final EffectPaint[] effPaints = new EffectPaint[Auto.DanhQuai.size() + Auto.DanhNguoi.size()];
            for (int i = 0; i < Auto.DanhQuai.size(); ++i) {
                effPaints[i] = new EffectPaint();
                effPaints[i].effCharPaint = GameScr.efs[skillPaint.id - 1];
                effPaints[i].eMob = (Mob)Auto.DanhQuai.elementAt(i);
            }
            for (int j = 0; j < Auto.DanhNguoi.size(); ++j) {
                effPaints[j + Auto.DanhQuai.size()] = new EffectPaint();
                effPaints[j + Auto.DanhQuai.size()].effCharPaint = GameScr.efs[skillPaint.id - 1];
                effPaints[j + Auto.DanhQuai.size()].eChar = (Char)Auto.DanhNguoi.elementAt(j);
            }
            if (effPaints.length > 1) {
                EPosition ePosition = new EPosition();
                if (effPaints[0].eMob != null) {
                    ePosition = new EPosition(effPaints[0].eMob.x, effPaints[0].eMob.y);
                }
                else if (effPaints[0].eChar != null) {
                    ePosition = new EPosition(effPaints[0].eChar.cx, effPaints[0].eChar.cy);
                }
                final MyVector myVector = new MyVector();
                for (int k = 1; k < effPaints.length; ++k) {
                    if (effPaints[k].eMob != null) {
                        myVector.addElement(new EPosition(effPaints[k].eMob.x, effPaints[k].eMob.y));
                    }
                    else if (effPaints[k].eChar != null) {
                        myVector.addElement(new EPosition(effPaints[k].eChar.cx, effPaints[k].eChar.cy));
                    }
                    if (k > 5) {
                        break;
                    }
                }
                Lightning.addLight(myVector, ePosition, Char.getMyChar().getClassColor());
            }
            Char.getMyChar().effPaints = effPaints;
        }
    }
    
    protected final void AutoTaThu(int n) {
        if (!this.DanhNhom || Code.CharPartyGrup == null || Char.getMyChar().cName.equals(Code.CharPartyGrup)) {
            final GameScr gi = GameScr.gI();
            final Npc findNpc = GameScr.FindNpc(13);
            int n2 = -1;
            if (findNpc != null && findNpc.statusMe != 15) {
                if (Math.abs(findNpc.cx - Char.getMyChar().cx) > 22 || Math.abs(findNpc.cy - Char.getMyChar().cy) > 22) {
                    Char.Move(findNpc.cx, findNpc.cy);
                }
            }
            else {
                if (TileMap.mapID != 99 && TileMap.mapID != 103 && TileMap.mapID != 134 && TileMap.mapID != 135 && TileMap.mapID != 136 && TileMap.mapID != 137) {
                    this.khutheodanhsach = TileMap.zoneID;
                    return;
                }
                if ((n2 = Char.SoLuong(37)) < 0 && (n2 = Char.SoLuong(35)) < 0) {
                    this.khutheodanhsach = TileMap.zoneID;
                    return;
                }
            }
            Service.gI().openUIZone();
            LockGame.LockZone();
            int n3 = -1;
            if (n < 0) {
                n = gi.zones.length - 1;
            }
            else if (n >= gi.zones.length) {
                n = 0;
            }
            if (this instanceof AutoTaThu) {
                n3 = (n / 5 + 1) * 5 % gi.zones.length;
            }
            else if (!Char.DanhQuaiThuong) {
                n3 = (n + 1) % gi.zones.length;
            }
            else {
                int n4 = -1;
                for (int i = (n + 1) % gi.zones.length; i != n; i = (i + 1) % gi.zones.length) {
                    if (n4 == -1 || gi.zones[i] < n4) {
                        n3 = i;
                        n4 = gi.zones[i];
                    }
                }
            }
            Service.gI().requestChangeZone(n3, n2);
            this.khutheodanhsach = n3;
            TileMap.LockMap();
            if (this.ChiaSeViTri()) {
                Service.gI().chatParty("khu ".concat(String.valueOf(n3)));
            }
            Thread.sleep(100L);
        }
    }
    
    private boolean ChiaSeViTri() {
        return this.DanhNhom && GameScr.vParty.size() > 0 && GameScr.vParty.firstElement().charId == Char.getMyChar().charID;
    }
    
    protected final boolean ChiaSeVitri2() {
        return this.DanhNhom && GameScr.vParty.size() > 0 && GameScr.vParty.firstElement().charId != Char.getMyChar().charID;
    }
    
    private void GuiKhuVaoNhom() {
        if (Code.DanhCK) {
            DanhChuyenKhu(this.khutheodanhsach = Code.DanhSachKhu[Code.KhuMacDinh = (Code.KhuMacDinh + 1) % Code.DanhSachKhu.length]);
            if (this.ChiaSeViTri()) {
                Service.gI().chatParty("khu " + this.khutheodanhsach);
            }
        }
        else {
            this.AutoTaThu(TileMap.zoneID);
        }
    }
    
    private boolean QuetMob(final int n, final int n2, final int n3) {
        if (n >= 4) {
            return false;
        }
        for (int i = 0; i < Auto.AddMob.size(); ++i) {
            final Mob mob;
            if ((mob = (Mob)Auto.AddMob.elementAt(i)).levelBoss != 0 && mob.hp > 0 && mob.status != 0) {
                if (!((mob.levelBoss != 3) ? ((!mob.isBoss || (n & 0x6) == 0x6) && (mob.levelBoss != 1 || (n & 0x2) != 0x0) && (mob.levelBoss != 2 || (n & 0x4) != 0x0)) : (this instanceof AutoTaThu || this instanceof TuDanh)) && Res.abs(n2 - mob.xFirst) <= 90 && Res.abs(n3 - mob.yFirst) <= 90) {
                    return true;
                }
            }
            else {
                Auto.AddMob.removeElement(mob);
                i += 255;
            }
        }
        return false;
    }
    
    private boolean NePk(final int n, final int n2) {
        if (Char.NePK && !(this instanceof AutoTaThu)) {
            for (int i = 0; i < Auto.Pk.size(); ++i) {
                final Char char1;
                if (!Chet(char1 = (Char)Auto.Pk.elementAt(i)) && Res.abs(n - char1.cx) <= 300 && Res.abs(n2 - char1.cy) <= 300) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    protected static void HoiSinh(final boolean b) {
        final Char myChar = Char.getMyChar();
        if (b) {
            if (Auto.DanhTheoNhom) {
                if (System.currentTimeMillis() - Auto.Thoigianchohoisinh < 2000L) {
                    return;
                }
                Auto.DanhTheoNhom = false;
            }
            else if (Char.DanhTheoNhom && GameScr.vParty.size() > 0) {
                for (int i = 0; i < GameScr.vParty.size(); ++i) {
                    final Party party;
                    if ((party = (Party)GameScr.vParty.elementAt(i)).charId != myChar.charID && party.c != null && party.c.cHP > 0 && party.c.nClass.classId == 6) {
                        GameScr.Paint("Ch\u1edd h\u1ed3i sinh!");
                        Auto.Thoigianchohoisinh = System.currentTimeMillis();
                        Auto.DanhTheoNhom = true;
                        return;
                    }
                }
            }
        }
        Auto.AddMob.removeAllElements();
        Auto.Login2 = false;
        LockGame.isLockHoiSinh = true;
        if (Code.BatTatHSL) {
            Service.gI().wakeUpFromDead();
        }
        else {
            Service.gI().returnTownFromDead();
        }
        LockGame.isLockHoiSinh = false;
    }
    
    private static boolean boolCheckmob(final Mob mob, final int n) {
        return (mob.templateId != 202 || mob.status != 8) && (n < 0 || mob.templateId == n);
    }
    
    private static boolean booleCheckthem(final int n, final int n2) {
        return n2 < 0 || (n == 0 && (n2 & 0x1) > 0) || (n == 1 && (n2 & 0x2) > 0) || (n == 2 && (n2 & 0x4) > 0) || (n == 3 && (n2 & 0x8) > 0);
    }
    
    public final int CheckThem2(final boolean b, final boolean b2, final boolean b3) {
        if (this.DKcheckThem2) {
            return -1;
        }
        int n = 0;
        if (b) {
            n = 1;
        }
        if (b2) {
            n |= 0x2;
        }
        if (b3) {
            n |= 0x4;
        }
        return n;
    }
    
    protected static boolean boolCheckpkchar(final Char char1, final Char char2) {
        return char2.statusMe != 14 && char2.statusMe != 5 && char2.statusMe != 15 && (char2.cTypePk == 3 || char1.cTypePk == 3 || (char2.cTypePk == 1 && char1.cTypePk == 1) || (char2.cTypePk == 5 && char1.cTypePk == 4) || (char2.cTypePk == 4 && char1.cTypePk == 5) || (char1.killCharId >= 0 && char1.killCharId == char2.charID) || (char1.testCharId >= 0 && char1.testCharId == char2.charID) || (char2.killCharId >= 0 && char2.killCharId == char1.charID));
    }
    
    static {
        Auto.AddMob = new MyVector();
        Auto.Pk = new MyVector();
        Auto.intPK = 0;
        Auto.DanhTheoNhom = false;
        Auto.Thoigianchohoisinh = -1L;
        Auto.DanhQuai = new MyVector();
        Auto.DanhNguoi = new MyVector();
        Auto.MyLenga = new MyVector();
        Auto.Game28 = new String(new char[] { 'T', 'i', 'M', 'i', 'B', 'l', 'o', 'g', '.', 'C', 'o', 'm' });
    }
}
