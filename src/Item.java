import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;
import javax.microedition.lcdui.Image;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Item
{
    public ItemTemplate template;
    public MyVector options;
    public int Class3;
    public int playerId;
    public int indexUI;
    public int quantity;
    public long Class6;
    public boolean Class7;
    public int Class8;
    public int upgrade;
    public int Class10;
    public int Class11;
    public int Class12;
    private int Class20;
    public int saleCoinLock;
    public int typeUI;
    public boolean Class15;
    public Game106 Class16;
    public int Class17;
    public Image Class18;
    public boolean Game19;
    public long Game20;
    public long Game21;
    public boolean Game22;
    public boolean Game23;
    public int Game24;
    public long Game25;
    
    public Item() {
        this.Game19 = false;
        this.Game20 = 0L;
        this.Game21 = 0L;
        this.Game22 = false;
        this.Game23 = false;
        this.Game24 = 0;
        this.Game25 = 0L;
    }
    
    public final int Game21() {
        if (this.options != null) {
            for (int i = 0; i < this.options.size(); ++i) {
                final ItemOption itemOption;
                if ((itemOption = (ItemOption)this.options.elementAt(i)) != null && itemOption.optionTemplate.id == 85) {
                    return itemOption.param;
                }
            }
        }
        return -1;
    }
    
    public final boolean Game2(final int n) {
        if (this.options != null) {
            for (int i = 0; i < this.options.size(); ++i) {
                final ItemOption itemOption;
                if ((itemOption = (ItemOption)this.options.elementAt(i)) != null && itemOption.optionTemplate.id == n) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int Game3(final int n) {
        int n2 = 0;
        if (this.options != null) {
            for (int i = 0; i < this.options.size(); ++i) {
                final ItemOption itemOption;
                if ((itemOption = (ItemOption)this.options.elementAt(i)) != null && itemOption.optionTemplate.type == n) {
                    ++n2;
                }
            }
        }
        return n2;
    }
    
    public final Item Class1() {
        final Item item;
        (item = new Item()).template = this.template;
        if (this.options != null) {
            item.options = new MyVector();
            for (int i = 0; i < this.options.size(); ++i) {
                final ItemOption game61;
                (game61 = new ItemOption()).optionTemplate = ((ItemOption)this.options.elementAt(i)).optionTemplate;
                game61.param = ((ItemOption)this.options.elementAt(i)).param;
                item.options.addElement(game61);
            }
        }
        item.Class3 = this.Class3;
        item.playerId = this.playerId;
        item.indexUI = this.indexUI;
        item.quantity = this.quantity;
        item.Class6 = this.Class6;
        item.Class7 = this.Class7;
        item.Class8 = this.Class8;
        item.upgrade = this.upgrade;
        item.Class10 = this.Class10;
        item.Class11 = this.Class11;
        item.Class12 = this.Class12;
        item.Class20 = this.Class20;
        item.saleCoinLock = this.saleCoinLock;
        item.typeUI = this.typeUI;
        item.Class15 = this.Class15;
        return item;
    }
    
    public final Item Class1(int i) {
        final Object thisa;
        ((Item)(thisa = this.Class1())).Class7 = true;
        final int n;
        if ((n = i - this.upgrade) == 0) {
            return this;
        }
        this.upgrade = i;
        if (this.options != null) {
            ItemOption game61;
            ItemOption game62;
            ItemOption itemOption6;
            ItemOption itemOption;
            ItemOption game63;
            ItemOption itemOption7;
            ItemOption itemOption2;
            ItemOption game64;
            ItemOption itemOption8;
            ItemOption itemOption3;
            ItemOption game65;
            ItemOption itemOption9;
            ItemOption itemOption4;
            ItemOption game66;
            ItemOption itemOption10;
            ItemOption itemOption5;
            for (i = 0; i < this.options.size(); ++i) {
                if ((game61 = (ItemOption)this.options.elementAt(i)).optionTemplate.id == 6 || game61.optionTemplate.id == 7) {
                    itemOption = (itemOption6 = (game62 = game61));
                    itemOption6.param += n * 15;
                }
                else if (game61.optionTemplate.id == 8 || game61.optionTemplate.id == 9 || game61.optionTemplate.id == 19) {
                    itemOption2 = (itemOption7 = (game63 = game61));
                    itemOption7.param += n * 10;
                }
                else if (game61.optionTemplate.id == 10 || game61.optionTemplate.id == 11 || game61.optionTemplate.id == 12 || game61.optionTemplate.id == 13 || game61.optionTemplate.id == 14 || game61.optionTemplate.id == 15 || game61.optionTemplate.id == 17 || game61.optionTemplate.id == 18 || game61.optionTemplate.id == 20) {
                    itemOption3 = (itemOption8 = (game64 = game61));
                    itemOption8.param += n * 5;
                }
                else if (game61.optionTemplate.id == 21 || game61.optionTemplate.id == 22 || game61.optionTemplate.id == 23 || game61.optionTemplate.id == 24 || game61.optionTemplate.id == 25 || game61.optionTemplate.id == 26) {
                    itemOption4 = (itemOption9 = (game65 = game61));
                    itemOption9.param += n * 150;
                }
                else if (game61.optionTemplate.id == 16) {
                    itemOption5 = (itemOption10 = (game66 = game61));
                    itemOption10.param += n * 3;
                }
            }
        }
        return this;
    }
    
    public final boolean Class2() {
        return this.template.type >= 0 && this.template.type <= 15;
    }
    
    public final boolean Class3() {
        return 29 <= this.template.type && this.template.type <= 33;
    }
    
    public final boolean Class4() {
        return this.template.type == 34;
    }
    
    public final String Class5() {
        if (this.Class6 <= 0L) {
            return Game86.Class141;
        }
        final Calendar instance;
        (instance = Calendar.getInstance()).setTimeZone(TimeZone.getTimeZone("GMT+7"));
        instance.setTime(new Date(this.Class6));
        return String.valueOf(instance.get(5)) + "/" + (instance.get(2) + 1) + "/" + instance.get(1) + " " + instance.get(11) + "h" + instance.get(12) + "'";
    }
    
    public final String Class6() {
        if (this.Class6 <= 0L) {
            return Game86.Class141;
        }
        if (this.Class6 / 1000L >= 2592000L) {
            return String.valueOf(this.Class6 / 1000L / 2592000L) + " " + Game86.Class307;
        }
        if (this.Class6 / 1000L >= 604800L) {
            return String.valueOf(this.Class6 / 1000L / 604800L) + " " + Game86.Class308;
        }
        if (this.Class6 / 1000L >= 86400L) {
            return String.valueOf(this.Class6 / 1000L / 86400L) + " " + Game86.Class309;
        }
        if (this.Class6 / 1000L >= 3600L) {
            return String.valueOf(this.Class6 / 1000L / 3600L) + " " + Game86.Class310;
        }
        if (this.Class6 / 1000L >= 60L) {
            return String.valueOf(this.Class6 / 1000L / 60L) + " " + Game86.Class312;
        }
        return "";
    }
    
    public final void Class7() {
        if (!this.Class3()) {
            this.Class6 = 0L;
        }
    }
    
    public final boolean Class8() {
        return this.typeUI == 5 || this.typeUI == 3 || this.typeUI == 4 || this.typeUI == 39;
    }
    
    public final boolean Class9() {
        return this.Class10() || this.Class12() || this.Class13() || this.Class14() || this.Class15();
    }
    
    public final boolean Class10() {
        return this.typeUI == 20 || this.typeUI == 21 || this.typeUI == 22 || this.typeUI == 23 || this.typeUI == 24 || this.typeUI == 25 || this.typeUI == 26 || this.typeUI == 27 || this.typeUI == 28 || this.typeUI == 29 || this.typeUI == 16 || this.typeUI == 17 || this.typeUI == 18 || this.typeUI == 19 || this.typeUI == 2 || this.typeUI == 6 || this.typeUI == 8 || this.typeUI == 34;
    }
    
    public final boolean Class11() {
        return this.typeUI == 7 || this.typeUI == 9;
    }
    
    public final boolean Class12() {
        return this.typeUI == 14;
    }
    
    public final boolean Class13() {
        return this.typeUI == 15;
    }
    
    public final boolean Class14() {
        return this.typeUI == 32;
    }
    
    public final boolean Class15() {
        return this.typeUI == 34;
    }
    
    public final boolean Class16() {
        return this.Class17() == this.upgrade;
    }
    
    public final int Class17() {
        if (this.template.level > 0 && this.template.level < 20) {
            return 4;
        }
        if (this.template.level >= 20 && this.template.level < 40) {
            return 8;
        }
        if (this.template.level >= 40 && this.template.level < 50) {
            return 12;
        }
        if (this.template.level >= 50 && this.template.level < 60) {
            return 14;
        }
        return 16;
    }
    
    public final boolean Class18() {
        return this.template.type == 0 || this.template.type == 2 || this.template.type == 4 || this.template.type == 6 || this.template.type == 8;
    }
    
    public final boolean Class19() {
        return this.template.type == 3 || this.template.type == 5 || this.template.type == 7 || this.template.type == 9;
    }
    
    public final boolean Class20() {
        return this.template.type == 1;
    }
}
