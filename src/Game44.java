// 
// Decompiled by Procyon v0.5.36
// 

public final class Game44
{
    public int Class1;
    public String Class2;
    public MyVector Class3;
    
    public Game44(final String class2, final int class3) {
        this.Class3 = new MyVector();
        this.Class2 = class2;
        this.Class1 = class3;
    }
    
    public Game44() {
        this.Class3 = new MyVector();
    }
    
    public final void Class1(final String obj, final String s) {
        boolean b = false;
        if (GameScr.Class96 && ChatManager.gI().Class5() == this && GameScr.indexRow == this.Class3.size() - 1) {
            b = true;
        }
        this.Class3.addElement("c3@".concat(String.valueOf(obj)));
        final MyVector class1 = mFont.number_red.Class1(s, 160);
        for (int i = 0; i < class1.size(); ++i) {
            this.Class3.addElement("c0" + class1.elementAt(i));
        }
        if (b) {
            GameScr.gI().Class35();
        }
        this.Class1();
    }
    
    private void Class1() {
        while (this.Class3.size() > 50) {
            this.Class3.removeElementAt(1);
        }
    }
    
    public final void Class1(final String s) {
        boolean b = false;
        if (GameScr.Class96 && ChatManager.gI().Class5() == this && GameScr.indexRow == this.Class3.size() - 1) {
            b = true;
        }
        final MyVector class1 = mFont.number_red.Class1(s, 160);
        for (int i = 0; i < class1.size(); ++i) {
            this.Class3.addElement(class1.elementAt(i));
        }
        if (b) {
            GameScr.gI().Class35();
        }
        this.Class1();
    }
}
