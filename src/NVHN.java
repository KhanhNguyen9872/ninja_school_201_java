// 
// Decompiled by Procyon v0.5.36
// 

public class NVHN extends Auto
{
    public static boolean cx2;
    private static String[] cy2;
    private static int Pk;
    private TaskOrder DanhTheoNhom;
    
    @Override
    public final String toString() {
        return "Auto Nhi\u1ec7m v\u1ee5 h\u1eb1ng ng\u00e0y: " + NVHN.Pk + "/20";
    }
    
    public final void Run() {
        if (NVHN.Pk <= 20 && (!(super.Landa instanceof SanBoss) || System.currentTimeMillis() - super.Thuanhiue < 3600000L)) {
            if (Char.getMyChar().cHP <= 0) {
                Auto.HoiSinh(false);
                return;
            }
            if (TileMap.isTruong(TileMap.mapID)) {
                if (this.DanhTheoNhom == null) {
                    GameScr.Paint(new StringBuffer("Nh\u1eadn NV ").append(NVHN.Pk + 1).append("/20").toString());
                    GameScr.PickNpca(25, GameScr.ci, 0);
                    LockGame.LockNVHN();
                    this.DanhTheoNhom = Char.FindTask(0);
                    return;
                }
                if (this.DanhTheoNhom.count < this.DanhTheoNhom.maxCount) {
                    GameScr.Paint(new StringBuffer("\u0110i l\u00e0m NV ").append(NVHN.Pk).append("/20").toString());
                    GameScr.PickNpca(25, GameScr.ci, 3);
                    TileMap.LockMap();
                    this.AutoTaThu(super.khutheodanhsach);
                    return;
                }
                if (Char.KichThuocHanhTrang() <= 0) {
                    GameScr.Paint("H\u00e0nh trang \u0111\u1ea7y");
                    return;
                }
                GameScr.Paint(new StringBuffer("Ho\u00e0n th\u00e0nh NV ").append(NVHN.Pk).append("/20").toString());
                GameScr.PickNpca(25, GameScr.ci, 2);
                this.DanhTheoNhom = null;
            }
            else if (this.DanhTheoNhom != null && TileMap.mapID == this.DanhTheoNhom.mapId) {
                if (this.DanhTheoNhom.count >= this.DanhTheoNhom.maxCount) {
                    Auto.DoiKhu();
                    return;
                }
                this.Attack(this.DanhTheoNhom.killId, 1);
                this.PickThemItmnua(-1);
                if (NVHN.cx2) {
                    GameScr.Paint(new StringBuffer("Nhi\u1ec7m v\u1ee5 ").append(NVHN.Pk).append("/20: ").append(this.DanhTheoNhom.count).append("/").append(this.DanhTheoNhom.maxCount).append(" ").append(Mob.arrMobTemplate[this.DanhTheoNhom.killId].name).toString());
                    NVHN.cx2 = false;
                }
            }
        }
        else {
            GameScr.Paint("Ho\u00e0n th\u00e0nh!");
            final Code code = Code.code;
            Code.Game3();
        }
    }
    
    public static void Game1(String trim) {
        if (trim.equals(NVHN.cy2[0])) {
            NVHN.Pk = 21;
            LockGame.HuyLockNVHN();
            return;
        }
        final int index;
        if ((index = trim.indexOf(NVHN.cy2[1])) >= 0) {
            trim = trim.substring(index + NVHN.cy2[1].length(), trim.indexOf(NVHN.cy2[2])).trim();
            try {
                NVHN.Pk = Integer.parseInt(trim);
            }
            catch (NumberFormatException ex) {}
        }
    }
    
    @Override
    public final void auto_D() {
        NVHN.Pk = 0;
        this.DanhTheoNhom = Char.FindTask(0);
        super.auto_D();
    }
    
    public final void Login() {
        this.DanhTheoNhom = Char.FindTask(0);
    }
    
    static {
        NVHN.cx2 = false;
        NVHN.cy2 = new String[] { "H\u00f4m nay con \u0111\u00e3 l\u00e0m h\u1ebft nhi\u1ec7m v\u1ee5 ta giao. H\u00e3y quay l\u1ea1i v\u00e0o ng\u00e0y h\u00f4m sau.", "\u0110\u00e2y l\u00e0 l\u1ea7n nh\u1eadn nhi\u1ec7m v\u1ee5 th\u1ee9 ", " trong ng\u00e0y h\u00f4m nay. M\u1ed7i ng\u00e0y \u0111\u01b0\u1ee3c nh\u1eadn t\u1ed1i \u0111a 20 l\u1ea7n con nh\u00e9." };
    }
}
