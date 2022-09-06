import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class ChatManager
{
    public MyVector Class1;
    static ChatManager Class2;
    public int Class3;
    public static boolean Class4;
    public static boolean Class5;
    public static boolean Class6;
    public static boolean Class7;
    public MyVector Class8;
    
    public final void Class1() {
        ++this.Class3;
        if (this.Class3 > this.Class1.size() - 1) {
            this.Class3 = 0;
        }
    }
    
    public final void Class2() {
        --this.Class3;
        if (this.Class3 < 0) {
            this.Class3 = this.Class1.size() - 1;
        }
    }
    
    public final void Class1(final int class3) {
        this.Class3 = class3;
    }
    
    public final void Class1(final Game44 o) {
        this.Class3 = this.Class1.indexOf(o);
    }
    
    public final void Class3() {
        this.Class3 = this.Class1.size() - 1;
    }
    
    public static ChatManager gI() {
        if (ChatManager.Class2 == null) {
            return ChatManager.Class2 = new ChatManager();
        }
        return ChatManager.Class2;
    }
    
    public ChatManager() {
        this.Class3 = 0;
        this.Class8 = new MyVector();
        (this.Class1 = new MyVector()).addElement(new Game44(Game86.Class400[0], 0));
        this.Class1.addElement(new Game44(Game86.Class401[0], 1));
        this.Class1.addElement(new Game44(Game86.Class402[0], 3));
        this.Class1.addElement(new Game44(Game86.Class403[0], 4));
        final Game44 class1;
        (class1 = this.Class1(Game86.Class402[0])).Class1("c8" + Game86.Class402[1]);
        class1.Class1("c8" + Game86.Class402[2]);
        class1.Class1("c8" + Game86.Class402[3]);
        this.Class1(Game86.Class401[0]).Class1("c8" + Game86.Class401[1]);
        this.Class1(Game86.Class403[0]).Class1("c8" + Game86.Class403[1]);
        this.Class1(Game86.Class400[0]).Class1("c8" + Game86.Class400[1]);
    }
    
    public final Game44 Class1(final String anObject) {
        for (int i = 0; i < this.Class1.size(); ++i) {
            final Game44 game44;
            if ((game44 = (Game44)this.Class1.elementAt(i)).Class2.equals(anObject)) {
                return game44;
            }
        }
        return null;
    }
    
    public final void Chat(final String s, final String s2, final String s3) {
        Game44 game44;
        if ((game44 = this.Class1(s)) == null) {
            game44 = this.Class2(s);
        }
        game44.Class1(s2, s3);
    }
    
    public final Game44 Class5() {
        return (Game44)this.Class1.elementAt(this.Class3);
    }
    
    public final Game44 Class2(final String s) {
        final Game44 game44 = new Game44(s, 2);
        if (!GameCanvas.Class6) {
            game44.Class1("c2" + Game86.Class399);
        }
        this.Class1.addElement(game44);
        return game44;
    }
    
    public final void Class3(final String anObject) {
        for (int i = 0; i < this.Class8.size(); ++i) {
            if (((String)this.Class8.elementAt(i)).equals(anObject)) {
                return;
            }
        }
        this.Class8.addElement(anObject);
    }
    
    public final boolean Class4(final String anObject) {
        for (int i = 0; i < this.Class8.size(); ++i) {
            if (((String)this.Class8.elementAt(i)).equals(anObject)) {
                return true;
            }
        }
        return false;
    }
    
    public final void Class5(final String anObject) {
        for (int i = 0; i < this.Class8.size(); ++i) {
            if (((String)this.Class8.elementAt(i)).equals(anObject)) {
                this.Class8.removeElementAt(i);
                return;
            }
        }
    }
    
    private static void Class6() {
        ChatManager.Class2 = null;
    }
}
