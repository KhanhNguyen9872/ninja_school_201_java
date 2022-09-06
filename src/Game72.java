// 
// Decompiled by Procyon v0.5.36
// 

public final class Game72
{
    public int Class1;
    public Game67 Class2;
    private String Class3;
    
    public final String Class1() {
        if (this.Class3 == null) {
            if (this.Class2.Class1 == 62 || this.Class2.Class1 == 64 || this.Class2.Class1 == 70) {
                this.Class3 = Game20.Class1(this.Class2.Class2, "#", new StringBuffer(String.valueOf(this.Class1 / 1000.0f)).toString());
            }
            else {
                this.Class3 = Game20.Class1(this.Class2.Class2, "#", new StringBuffer(String.valueOf(this.Class1)).toString());
            }
        }
        return this.Class3;
    }
}
