// 
// Decompiled by Procyon v0.5.36
// 

public class LockGame
{
    private static boolean Game3;
    public static boolean isLockHoiSinh;
    public static boolean isPk;
    private static boolean Game4;
    private static boolean Game5;
    private static boolean Game6;
    private static boolean Game7;
    private static boolean Game8;
    private static boolean Game9;
    private static boolean Game10;
    private static boolean Game11;
    private static boolean Game12;
    private static boolean Game13;
    private static boolean Game14;
    private static boolean Game15;
    private static boolean Game16;
    private static Object Game17;
    private static int Game18;
    
    static {
        LockGame.Game3 = false;
        LockGame.isLockHoiSinh = false;
        LockGame.isPk = false;
        LockGame.Game4 = false;
        LockGame.Game5 = false;
        LockGame.Game6 = false;
        LockGame.Game7 = false;
        LockGame.Game8 = false;
        LockGame.Game9 = false;
        LockGame.Game10 = false;
        LockGame.Game11 = false;
        LockGame.Game12 = false;
        LockGame.Game13 = false;
        LockGame.Game14 = false;
        LockGame.Game15 = false;
        LockGame.Game16 = false;
        LockGame.Game17 = new Object();
    }
    
    public static void Lockspk() {
        if (LockGame.isPk) {
            synchronized (LockGame.Game17) {
                LockGame.Game17.notifyAll();
            }
            // monitorexit(LockGame.Game17)
            LockGame.isPk = false;
        }
    }
    
    public static void LOCKBUYITEM() {
        LockGame.Game5 = true;
        synchronized (LockGame.Game17) {
            try {
                LockGame.Game17.wait(2000L);
            }
            catch (InterruptedException ex) {}
        }
        // monitorexit(LockGame.Game17)
    }
    
    public static void LockZone() {
        LockGame.Game4 = true;
        synchronized (LockGame.Game17) {
            try {
                LockGame.Game17.wait(2000L);
            }
            catch (InterruptedException ex) {}
        }
        // monitorexit(LockGame.Game17)
    }
    
    public static boolean LockTSAK() {
        int i = 0;
    Label_0059:
        while (i < Code.Game8.size()) {
            final String anObject = (String)Code.Game8.elementAt(i);
            for (int j = 0; j < GameScr.vParty.size(); ++j) {
                if (((Party)GameScr.vParty.elementAt(j)).name.equals(anObject)) {
                    ++i;
                    continue Label_0059;
                }
            }
            return false;
        }
        return true;
    }
    
    public static boolean LockPk() {
        LockGame.isPk = true;
        final long currentTimeMillis = System.currentTimeMillis();
        synchronized (LockGame.Game17) {
            try {
                LockGame.Game17.wait(500L);
            }
            catch (InterruptedException ex) {}
        }
        // monitorexit(LockGame.Game17)
        return System.currentTimeMillis() - currentTimeMillis < 500L;
    }
    
    public static void LockPickNPCS() {
        LockGame.Game16 = true;
        synchronized (LockGame.Game17) {
            try {
                LockGame.Game17.wait(500L);
            }
            catch (InterruptedException ex) {}
        }
        // monitorexit(LockGame.Game17)
    }
    
    public static void LockAll() {
        synchronized (LockGame.Game17) {
            LockGame.Game17.notifyAll();
        }
        // monitorexit(LockGame.Game17)
        LockGame.isPk = false;
        LockGame.Game4 = false;
        LockGame.Game5 = false;
        LockGame.Game6 = false;
        LockGame.Game7 = false;
        LockGame.Game8 = false;
        LockGame.Game10 = false;
        LockGame.Game3 = false;
        LockGame.Game9 = false;
        LockGame.isLockHoiSinh = false;
        LockGame.Game11 = false;
        LockGame.Game12 = false;
        LockGame.Game13 = false;
        LockGame.Game14 = false;
        LockGame.Game15 = false;
        LockGame.Game16 = false;
        TileMap.IsDangGoMap = false;
        TileMap.HuyLockMap();
    }
    
    public static void Game18() {
        if (LockGame.Game9) {
            synchronized (LockGame.Game17) {
                LockGame.Game17.notifyAll();
            }
            // monitorexit(LockGame.Game17)
            LockGame.Game9 = false;
        }
    }
    
    public static void Game30() {
        if (LockGame.Game16) {
            synchronized (LockGame.Game17) {
                LockGame.Game17.notifyAll();
            }
            // monitorexit(LockGame.Game17)
            LockGame.Game16 = false;
        }
    }
    
    public static void Game6() {
        if (LockGame.Game4) {
            synchronized (LockGame.Game17) {
                LockGame.Game17.notifyAll();
            }
            // monitorexit(LockGame.Game17)
            LockGame.Game4 = false;
        }
    }
    
    public static void LockNVHN() {
        LockGame.Game6 = true;
        synchronized (LockGame.Game17) {
            try {
                LockGame.Game17.wait(2000L);
            }
            catch (InterruptedException ex) {}
        }
        // monitorexit(LockGame.Game17)
    }
    
    public static void HuyLockNVHN() {
        if (LockGame.Game6) {
            synchronized (LockGame.Game17) {
                LockGame.Game17.notifyAll();
            }
            // monitorexit(LockGame.Game17)
            LockGame.Game6 = false;
        }
    }
    
    public static void Game26() {
        if (LockGame.Game14) {
            synchronized (LockGame.Game17) {
                LockGame.Game17.notifyAll();
            }
            // monitorexit(LockGame.Game17)
            LockGame.Game14 = false;
        }
    }
    
    public static void Game1(final long n) {
        if (Code.CharPartyGrup == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        while (!LockTaThu() && System.currentTimeMillis() - currentTimeMillis < n) {
            Thread.sleep(2000L);
        }
    }
    
    public static boolean HuyLockTT() {
        int i = 0;
    Label_0104:
        while (i < Code.Game8.size()) {
            final String anObject = (String)Code.Game8.elementAt(i);
            int j = 0;
            while (j < GameScr.vParty.size()) {
                final Party party;
                if ((party = (Party)GameScr.vParty.elementAt(j)).name.equals(anObject)) {
                    if (party.c == null || Res.distance(Char.getMyChar().cx, Char.getMyChar().cy, party.c.cx, party.c.cy) > 100) {
                        return false;
                    }
                    ++i;
                    continue Label_0104;
                }
                else {
                    ++j;
                }
            }
            return false;
        }
        return true;
    }
    
    public static void LockTaThu(final long n) {
        if (Code.CharPartyGrup == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        while (!HuyLockTT() && System.currentTimeMillis() - currentTimeMillis < n) {
            Thread.sleep(2000L);
        }
    }
    
    public static boolean LockSell() {
        LockGame.Game15 = true;
        if (20000L < 0L) {
            synchronized (LockGame.Game17) {
                try {
                    LockGame.Game17.wait();
                }
                catch (InterruptedException ex) {}
            }
            // monitorexit(LockGame.Game17)
            return !AutoSell.cx2 || (AutoSell.cx2 = false);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        synchronized (LockGame.Game17) {
            try {
                LockGame.Game17.wait(20000L);
            }
            catch (InterruptedException ex2) {}
        }
        // monitorexit(LockGame.Game17)
        if (AutoSell.cx2) {
            return AutoSell.cx2 = false;
        }
        return System.currentTimeMillis() - currentTimeMillis < 20000L;
    }
    
    public static boolean LockSellBuy() {
        LockGame.Game11 = true;
        final long currentTimeMillis = System.currentTimeMillis();
        synchronized (LockGame.Game17) {
            try {
                LockGame.Game17.wait(7000L);
            }
            catch (InterruptedException ex) {}
        }
        // monitorexit(LockGame.Game17)
        return System.currentTimeMillis() - currentTimeMillis < 7000L;
    }
    
    public static void HuyLockSellBuy() {
        if (LockGame.Game11) {
            synchronized (LockGame.Game17) {
                LockGame.Game17.notifyAll();
            }
            // monitorexit(LockGame.Game17)
            LockGame.Game11 = false;
        }
    }
    
    public static void HuySella() {
        if (LockGame.Game15) {
            synchronized (LockGame.Game17) {
                LockGame.Game17.notifyAll();
            }
            // monitorexit(LockGame.Game17)
            LockGame.Game15 = false;
        }
    }
    
    public static void LockAS10() {
        LockGame.Game8 = true;
        synchronized (LockGame.Game17) {
            try {
                LockGame.Game17.wait(2000L);
            }
            catch (InterruptedException ex) {}
        }
        // monitorexit(LockGame.Game17)
    }
    
    public static void HuyLockAS10() {
        if (LockGame.Game8) {
            synchronized (LockGame.Game17) {
                LockGame.Game17.notifyAll();
            }
            // monitorexit(LockGame.Game17)
            LockGame.Game8 = false;
        }
    }
}
