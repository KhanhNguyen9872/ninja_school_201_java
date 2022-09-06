// 
// Decompiled by Procyon v0.5.36
// 

public final class TuDanh extends Auto
{
    @Override
    public final void auto_D() {
        super.auto_D();
        super.iDMap = TileMap.mapID;
        super.khutheodanhsach = TileMap.zoneID;
        super.cxL = Char.getMyChar().cx;
        super.cyL = Char.getMyChar().cy;
    }
    
    public final void Run() {
        if (Auto.booleanChet()) {
            if (Char.ReMap) {
                Auto.HoiSinh(true);
            }
        }
        else {
            if (!Auto.Vancons && Char.getMyChar().isHuman) {
                this.PICKVAOAUTOS();
                return;
            }
            if (super.iDMap == TileMap.mapID && (super.DKcheckThem2 || super.khutheodanhsach == TileMap.zoneID)) {
                this.PickThemItmnua(-1);
                this.Attack(-1, -1);
                return;
            }
            if (Char.ReMap) {
                this.TuDanhPkTTDTN(super.iDMap, super.khutheodanhsach, super.cxL, super.cyL);
            }
        }
    }
    
    @Override
    protected final Mob HangDong(final Char char1, final int n, final int n2, final Char char2, final boolean b) {
        if (Code.BatTatDanhChuyenVitri && Code.avtx.size() > 0) {
            this.DanhCVT(n2, b);
            return Auto.PickMob(char1.cx, char1.cy);
        }
        return Auto.PickMob(char1.cx, char1.cy);
    }
    
    @Override
    public final String toString() {
        return "T\u1ef1 \u0111\u00e1nh";
    }
}
