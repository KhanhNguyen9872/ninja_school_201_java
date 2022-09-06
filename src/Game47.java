// 
// Decompiled by Procyon v0.5.36
// 

public final class Game47
{
    public int Class1;
    public int Class2;
    public int Class3;
    public byte Class4;
    public int Class5;
    public static Mob Class6;
    
    public final boolean Class1() {
        return this.Class1 >= GameScr.Class16 && this.Class1 <= GameScr.Class16 + GameScr.Class9 && this.Class2 >= GameScr.Class17 && this.Class2 <= GameScr.Class17 + GameScr.Class10 + 30 && (Game47.Class6 == null || Game47.Class6.status != 8);
    }
    
    public Game47(final int class1, final int class2) {
        this.Class3 = 0;
        this.Class4 = 0;
        this.Class1 = class1;
        this.Class2 = class2;
        for (int i = 0; i < GameScr.vMob.size(); ++i) {
            final Mob class3;
            if ((class3 = (Mob)GameScr.vMob.elementAt(i)).templateId == 202) {
                Game47.Class6 = class3;
            }
        }
    }
}
