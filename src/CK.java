// 
// Decompiled by Procyon v0.5.36
// 

final class CK implements Runnable
{
    private final int Game1;
    
    CK(final int game1) {
        this.Game1 = game1;
    }
    
    @Override
    public final void run() {
        final Npc findNpc = GameScr.FindNpc(13);
        int n = -1;
        if (findNpc != null && findNpc.statusMe != 15) {
            if (Math.abs(findNpc.cx - Char.getMyChar().cx) > 22 || Math.abs(findNpc.cy - Char.getMyChar().cy) > 22) {
                Char.Move(findNpc.cx, findNpc.cy);
            }
        }
        else {
            if (TileMap.mapID != 99 && TileMap.mapID != 103 && TileMap.mapID != 134 && TileMap.mapID != 135 && TileMap.mapID != 136 && TileMap.mapID != 137) {
                return;
            }
            if ((n = Char.SoLuong(37)) < 0 && (n = Char.SoLuong(35)) < 0) {
                return;
            }
        }
        Service.gI().requestChangeZone(this.Game1, n);
        TileMap.LockMap();
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
