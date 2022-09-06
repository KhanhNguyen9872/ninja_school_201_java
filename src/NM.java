import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

final class NM implements Runnable
{
    private final int next;
    
    NM(final int next) {
        this.next = next;
    }
    
    @Override
    public final void run() {
        try {
            int next;
            if ((next = this.next) < 0) {
                next = 0;
            }
            if (next >= TileMap.vGo.size()) {
                next = TileMap.vGo.size() - 1;
            }
            TileMap.NextMap(next);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        System.gc();
        if (Session_ME.gI().connecting) {
            GameScr.gI().switchToMe();
        }
        GameCanvas.endDlg();
        GameCanvas.isLoading = false;
    }
}
