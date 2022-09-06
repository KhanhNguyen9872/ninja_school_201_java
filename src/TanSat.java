// 
// Decompiled by Procyon v0.5.36
// 

public final class TanSat extends Auto
{
    public int Game1;
    
    public final void update(final int game1, final int idMap, final int khutheodanhsach) {
        super.auto_D();
        super.iDMap = idMap;
        super.khutheodanhsach = khutheodanhsach;
        super.DKcheckThem2 = TileMap.Game7hend(idMap);
        this.Game1 = game1;
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
                if (Char.LuyenDa && Code.LuyenDa() && Char.KichThuocHanhTrang() < 5 && !TileMap.typePk(TileMap.mapID)) {
                    Auto.DoiKhu();
                    return;
                }
                this.Attack(this.Game1, this.CheckThem2(Char.DanhQuaiThuong, Char.DanhTA, Char.DanhTL));
                this.PickThemItmnua(-1);
            }
            else {
                this.TuDanhPkTTDTN(super.iDMap, super.khutheodanhsach, super.cxL, super.cyL);
            }
        }
    }
    
    @Override
    public final String toString() {
        if (this.Game1 >= 0 && this.Game1 < Mob.arrMobTemplate.length) {
            return "T\u00e0n s\u00e1t " + Mob.arrMobTemplate[this.Game1].name;
        }
        return "T\u00e0n s\u00e1t";
    }
}
