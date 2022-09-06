// 
// Decompiled by Procyon v0.5.36
// 

public final class ItemMap
{
    public int x;
    public int y;
    public int xEnd;
    public int yEnd;
    public int Class5;
    public int Class6;
    public int itemMapID;
    public ItemTemplate template;
    public byte status;
    public Game11 Class10;
    public boolean boolItem;
    public long TimeNhatItem;
    
    public ItemMap(final short class7, final short n, final int n2, final int class8, final int n3, final int class9) {
        this.boolItem = false;
        this.TimeNhatItem = 0L;
        this.itemMapID = class7;
        this.template = Game104.Class1(n);
        this.x = n3;
        this.y = class8;
        this.xEnd = n3;
        this.yEnd = class9;
        this.Class5 = n3 - n2 >> 2;
        this.Class6 = 5;
    }
    
    public ItemMap(final short class7, final short n, final int n2, final int n3) {
        this.boolItem = false;
        this.TimeNhatItem = 0L;
        this.itemMapID = class7;
        this.template = Game104.Class1(n);
        this.xEnd = n2;
        this.x = n2;
        this.yEnd = n3;
        this.y = n3;
        this.status = 1;
    }
    
    public final void Class1(final int class3, final int class4) {
        this.xEnd = class3;
        this.yEnd = class4;
        this.Class5 = class3 - this.x >> 2;
        this.Class6 = class4 - this.y >> 2;
        this.status = 2;
    }
}
