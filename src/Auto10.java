// 
// Decompiled by Procyon v0.5.36
// 

public class Auto10 extends Auto
{
    public Auto10() {
        super.auto_D();
    }
    
    public boolean Game5(final Char char1) {
        return char1.ctaskId >= 9;
    }
    
    public final void Run() {
        final Char myChar = Char.getMyChar();
        if (this.Game5(myChar)) {
            GameScr.Paint("Xong!");
            final Code code = Code.code;
            Code.Game6();
            return;
        }
        final byte taskMapId = GameScr.getTaskMapId();
        final byte taskNpcId = GameScr.getTaskNpcId();
        if (Char.getMyChar().cHP <= 0) {
            Auto.HoiSinh(false);
            return;
        }
        if (myChar.taskMaint == null) {
            if (TileMap.mapID != taskMapId) {
                super.TuDanhPkTTDTN(taskMapId, -2, -1, -1);
                return;
            }
            GameScr.PickNpca(taskNpcId, 0, 0);
            Service.gI().getTask(taskNpcId, 0);
            LockGame.LockAS10();
            super.khutheodanhsach = -1;
        }
        else {
            if (myChar.taskMaint.index < myChar.taskMaint.subNames.length - 1) {
                this.Game1(myChar, taskMapId, taskNpcId);
                return;
            }
            if (TileMap.mapID != taskMapId) {
                super.TuDanhPkTTDTN(taskMapId, -2, -1, -1);
                return;
            }
            GameScr.PickNpca(taskNpcId, 0, 0);
            Service.gI().getTask(taskNpcId, 0);
            LockGame.LockAS10();
            super.khutheodanhsach = -1;
        }
    }
    
    public void Game1(final Char char1, final byte b, final byte b2) {
        switch (char1.ctaskId) {
            case 0: {
                final NpcTemplate npcTemplate = Npc.arrtemplate[b2];
                for (int i = 0; i < npcTemplate.menu.length; ++i) {
                    if (npcTemplate.menu[i][0].equals("N\u00f3i chuy\u1ec7n")) {
                        GameScr.PickNpca(b2, i, 0);
                        LockGame.LockAS10();
                        return;
                    }
                }
            }
            case 1: {
                if (char1.taskMaint.index == 0) {
                    GameScr.PickNpca(b2, 0, 0);
                    Service.gI().getTask(b2, 1);
                    LockGame.LockAS10();
                    return;
                }
                if (char1.taskMaint.index == 1) {
                    Service.gI().getTask(b2, 0);
                    LockGame.LockAS10();
                    return;
                }
                if (char1.taskMaint.index == 2) {
                    Service.gI().getTask(b2, 1);
                    LockGame.LockAS10();
                    return;
                }
                if (char1.taskMaint.index == 3) {
                    Service.gI().getTask(b2, 2);
                    LockGame.LockAS10();
                    return;
                }
                if (char1.taskMaint.index == 4) {
                    Service.gI().getTask(b2, 0);
                    LockGame.LockAS10();
                    return;
                }
                break;
            }
            case 2: {
                if (char1.taskMaint.index == 0) {
                    if (char1.arrItemBag[0] != null) {
                        Service.gI().useItem(0);
                    }
                    LockGame.LockAS10();
                    return;
                }
                if (char1.taskMaint.index != 1) {
                    break;
                }
                if (TileMap.mapID == 22) {
                    this.PickThemItmnua(-1);
                    this.Attack(0, 1);
                    return;
                }
                this.TuDanhPkTTDTN(22, -1, -1, -1);
            }
            case 3: {
                if (char1.taskMaint.index == 0) {
                    Thread.sleep(2000L);
                    GameScr.PickNpca(4, 0, 0);
                    Service.gI().buyItem(9, 0, 3);
                    LockGame.LockAS10();
                    return;
                }
                if (char1.taskMaint.index == 1) {
                    if (char1.arrItemBag[0] != null) {
                        Service.gI().useItem(0);
                    }
                    LockGame.LockAS10();
                    return;
                }
                if (char1.taskMaint.index == 2) {
                    if (TileMap.mapID == 23) {
                        this.PickThemItmnua(-1);
                        this.Attack(1, 1);
                        return;
                    }
                    this.TuDanhPkTTDTN(23, -1, -1, -1);
                    return;
                }
                else {
                    if (char1.taskMaint.index != 3) {
                        break;
                    }
                    if (TileMap.mapID == 23) {
                        this.PickThemItmnua(-1);
                        this.Attack(2, 1);
                        return;
                    }
                    this.TuDanhPkTTDTN(23, -1, -1, -1);
                    return;
                }
                break;
            }
            case 4: {
                if (char1.taskMaint.index == 0) {
                    if (TileMap.mapID == 21) {
                        this.PickThemItmnua(-1);
                        this.Attack(-1, 1);
                        return;
                    }
                    this.TuDanhPkTTDTN(21, -1, -1, -1);
                    return;
                }
                else if (char1.taskMaint.index == 1) {
                    if (TileMap.mapID == 21) {
                        this.PickThemItmnua(209);
                        this.Attack(3, 1);
                        return;
                    }
                    this.TuDanhPkTTDTN(21, -1, -1, -1);
                    return;
                }
                else {
                    if (char1.taskMaint.index != 2) {
                        break;
                    }
                    if (TileMap.mapID == 23) {
                        this.PickThemItmnua(210);
                        this.Attack(4, 1);
                        return;
                    }
                    this.TuDanhPkTTDTN(23, -1, -1, -1);
                    return;
                }
                break;
            }
            case 5: {
                if (char1.taskMaint.index == 0) {
                    if (TileMap.mapID == 20) {
                        this.PickThemItmnua(-1);
                        this.Attack(3, 1);
                        return;
                    }
                    this.TuDanhPkTTDTN(20, -1, -1, -1);
                    return;
                }
                else {
                    if (char1.taskMaint.index != 1) {
                        break;
                    }
                    if (TileMap.mapID == 20) {
                        this.PickThemItmnua(211);
                        this.Attack(54, 1);
                        return;
                    }
                    this.TuDanhPkTTDTN(20, -1, -1, -1);
                    return;
                }
                break;
            }
            case 6: {
                if (char1.taskMaint.index == 0) {
                    if (TileMap.mapID == 26) {
                        this.PickThemItmnua(-1);
                        this.Attack(-1, 1);
                        return;
                    }
                    this.TuDanhPkTTDTN(26, -1, -1, -1);
                    return;
                }
                else {
                    if (char1.taskMaint.index == 1) {
                        super.TuDanhPkTTDTN(2, -2, -1, -1);
                        Thread.sleep(500L);
                        return;
                    }
                    if (char1.taskMaint.index == 2) {
                        super.TuDanhPkTTDTN(71, -2, -1, -1);
                        Thread.sleep(500L);
                        return;
                    }
                    if (char1.taskMaint.index == 3) {
                        super.TuDanhPkTTDTN(26, -2, -1, -1);
                        Thread.sleep(500L);
                        return;
                    }
                    break;
                }
                break;
            }
            case 7: {
                if (char1.taskMaint.index == 0) {
                    if (TileMap.mapID == 71) {
                        this.PickThemItmnua(-1);
                        this.Attack(-1, 1);
                        return;
                    }
                    this.TuDanhPkTTDTN(71, -1, -1, -1);
                    return;
                }
                else {
                    if (char1.taskMaint.index == 1) {
                        super.TuDanhPkTTDTN(b, -2, -1, -1);
                        GameScr.PickNpca(b2, 0, 0);
                        Service.gI().getTask(b2, 1);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 2) {
                        Service.gI().getTask(b2, 0);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 3) {
                        Service.gI().getTask(b2, 1);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 4) {
                        Service.gI().getTask(b2, 1);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 5) {
                        Service.gI().getTask(b2, 2);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 6) {
                        GameScr.PickNpca(b2, 0, 0);
                        Service.gI().getTask(b2, 2);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 7) {
                        Service.gI().getTask(b2, 0);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 8) {
                        Service.gI().getTask(b2, 2);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 9) {
                        Service.gI().getTask(b2, 2);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 10) {
                        Service.gI().getTask(b2, 1);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 11) {
                        GameScr.PickNpca(b2, 0, 0);
                        Service.gI().getTask(b2, 0);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 12) {
                        Service.gI().getTask(b2, 1);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 13) {
                        Service.gI().getTask(b2, 2);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 14) {
                        Service.gI().getTask(b2, 2);
                        LockGame.LockAS10();
                        return;
                    }
                    if (char1.taskMaint.index == 15) {
                        Service.gI().getTask(b2, 1);
                        LockGame.LockAS10();
                        return;
                    }
                    break;
                }
                break;
            }
            case 8: {
                if (char1.taskMaint.index != 0) {
                    super.TuDanhPkTTDTN(b, -2, -1, -1);
                    GameScr.FindNpc2(b2);
                    final NpcTemplate npcTemplate2 = Npc.arrtemplate[b2];
                    for (int j = 0; j < npcTemplate2.menu.length; ++j) {
                        if (npcTemplate2.menu[j][0].equals("N\u00f3i chuy\u1ec7n")) {
                            GameScr.PickNpca(b2, j, 0);
                            LockGame.LockAS10();
                            Thread.sleep(1000L);
                            return;
                        }
                    }
                    break;
                }
                if (TileMap.mapID == 26) {
                    this.PickThemItmnua(-1);
                    this.Attack(-1, 1);
                    return;
                }
                this.TuDanhPkTTDTN(26, -1, -1, -1);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Auto Nhi\u1ec7m V\u1ee5 10";
    }
}
