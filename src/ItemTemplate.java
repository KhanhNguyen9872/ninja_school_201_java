// 
// Decompiled by Procyon v0.5.36
// 

public final class ItemTemplate
{
    public short id;
    public byte type;
    public byte Class3;
    public String name;
    public String description;
    public byte level;
    public short Class7;
    public short Class8;
    public boolean isUpToUp;
    
    public ItemTemplate(final short id, final byte type, final byte class3, final String name, final String description, final byte level, final short class4, final short class5, final boolean isUpToUp) {
        this.id = id;
        this.type = type;
        this.Class3 = class3;
        this.name = name;
        this.description = description;
        this.level = level;
        this.Class7 = class4;
        this.Class8 = class5;
        this.isUpToUp = isUpToUp;
    }
    
    public final boolean VPNV() {
        return this.type >= 0 && this.type <= 15;
    }
    
    public final boolean VPSK() {
        return this.type >= 23 && this.type <= 25;
    }
}
