import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

final class GM implements Runnable
{
    private final int Game1;
    
    GM(final int game1) {
        this.Game1 = game1;
    }
    
    @Override
    public final void run() {
        try {
            TileMap.GoMap(this.Game1);
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
