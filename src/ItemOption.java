// 
// Decompiled by Procyon v0.5.36
// 

public final class ItemOption
{
    public int param;
    public byte active;
    public ItemOptionTemplate optionTemplate;
    
    public ItemOption() {
    }
    
    public ItemOption(final int n, final int param) {
        this.param = param;
        this.optionTemplate = GameScr.Class48[n];
    }
    
    public final String Class1() {
        return Game20.Class1(this.optionTemplate.name, "#", new StringBuffer(String.valueOf(this.param)).toString());
    }
    
    public final String Class2() {
        String s;
        if (this.optionTemplate.id == 0 || this.optionTemplate.id == 1 || this.optionTemplate.id == 21 || this.optionTemplate.id == 22 || this.optionTemplate.id == 23 || this.optionTemplate.id == 24 || this.optionTemplate.id == 25 || this.optionTemplate.id == 26) {
            s = String.valueOf(Game20.Class1(this.optionTemplate.name, "#", new StringBuffer(String.valueOf(this.param)).toString())) + " (" + (this.param - 50 + 1) + "-" + this.param + ")";
        }
        else if (this.optionTemplate.id == 6 || this.optionTemplate.id == 7 || this.optionTemplate.id == 8 || this.optionTemplate.id == 9 || this.optionTemplate.id == 19) {
            s = String.valueOf(Game20.Class1(this.optionTemplate.name, "#", new StringBuffer(String.valueOf(this.param)).toString())) + " (" + (this.param - 10 + 1) + "-" + this.param + ")";
        }
        else if (this.optionTemplate.id == 2 || this.optionTemplate.id == 3 || this.optionTemplate.id == 4 || this.optionTemplate.id == 5 || this.optionTemplate.id == 10 || this.optionTemplate.id == 11 || this.optionTemplate.id == 12 || this.optionTemplate.id == 13 || this.optionTemplate.id == 14 || this.optionTemplate.id == 15 || this.optionTemplate.id == 17 || this.optionTemplate.id == 18 || this.optionTemplate.id == 20) {
            s = String.valueOf(Game20.Class1(this.optionTemplate.name, "#", new StringBuffer(String.valueOf(this.param)).toString())) + " (" + (this.param - 5 + 1) + "-" + this.param + ")";
        }
        else if (this.optionTemplate.id == 16) {
            s = String.valueOf(Game20.Class1(this.optionTemplate.name, "#", new StringBuffer(String.valueOf(this.param)).toString())) + " (" + (this.param - 3 + 1) + "-" + this.param + ")";
        }
        else {
            s = Game20.Class1(this.optionTemplate.name, "#", new StringBuffer(String.valueOf(this.param)).toString());
        }
        return s;
    }
}
