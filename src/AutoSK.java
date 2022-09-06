// 
// Decompiled by Procyon v0.5.36
// 

public final class AutoSK implements Runnable
{
    private final int Game1;
    
    AutoSK(final int game1) {
        this.Game1 = game1;
    }
    
    @Override
    public final void run() {
        for (int i = 0; i < this.Game1; ++i) {
            GameScr.FindNpc(48);
            Service.gI().openMenu(48);
            GameScr.gI();
            GameScr.PickNpca(48, 0, 0);
            Code.sleep(1000L);
            TileMap.GM(26);
            Code.sleep(1000L);
            new Thread(new CK(i + 1)).start();
            Code.sleep(4000L);
            GameScr.FindNpc(29);
            Service.gI().openMenu(29);
            GameScr.gI();
            GameScr.PickNpca(29, 0, 0);
            Code.sleep(1000L);
            TileMap.GM(23);
            Code.sleep(4000L);
            GameScr.FindNpc(48);
            Service.gI().openMenu(48);
            GameScr.gI();
            GameScr.PickNpca(48, 0, 0);
            Code.sleep(2000L);
            for (int j = 1; j < 31; ++j) {
                ChatPopup.addChatPopupMultiLine("Ch\u1edd " + (30 - j) + "s", Char.getMyChar());
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException ex) {}
            }
        }
    }
}
