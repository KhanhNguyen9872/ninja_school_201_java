import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class ChatPopup extends Game21 implements IActionListener
{
    private int Class7;
    private int Class8;
    private int Class9;
    private String[] Class10;
    private int Class11;
    private int Class12;
    private int Class13;
    private Char Class14;
    private boolean Class15;
    private int Class16;
    private String[] Class17;
    public Command Class5;
    public static ChatPopup Class6;
    
    public ChatPopup() {
        this.Class7 = 100;
    }
    
    public static void addChatPopupMultiLine(final String s, final Char char1) {
        final String[] class1;
        if ((class1 = Res.Class1(s, "\n", 0)).length == 1) {
            Class1(class1[0], 1000, char1);
            return;
        }
        (ChatPopup.Class6 = Class1(class1[0], 1000, char1)).Class16 = 0;
        ChatPopup.Class6.Class17 = class1;
        ChatPopup.Class6.Class5 = new Command(Game86.Class54, ChatPopup.Class6, 8000, null);
    }
    
    public static ChatPopup Class1(final String s, final int class8, final Char class9) {
        final ChatPopup class10 = new ChatPopup();
        if (s.length() < 10) {
            class10.Class7 = 64;
        }
        if (GameCanvas.Class25 == 128) {
            class10.Class7 = 128;
        }
        class10.Class10 = mFont.Class14.Class2(s, class10.Class7 - 10);
        class10.Class8 = class8;
        class10.Class14 = class9;
        class10.Class11 = class9.cx;
        class10.Class12 = class9.cy;
        class9.Class6 = class10;
        class10.Class9 = 7;
        Game21.Class1.addElement(class10);
        return class10;
    }
    
    public final void switchToMe() {
        if (this.Class14 != null) {
            this.Class11 = this.Class14.cx;
            this.Class12 = this.Class14.cy;
            this.Class13 = this.Class14.Class59 + 10;
        }
        if (this.Class8 > 0) {
            --this.Class8;
        }
        if (this.Class9 > 1) {
            --this.Class9;
        }
        if ((this.Class14 != null && this.Class14.Class6 != null && this.Class14.Class6 != this) || (this.Class14 != null && this.Class14.Class6 == null) || this.Class8 == 0) {
            Game21.Class3.removeElement(this);
            Game21.Class1.removeElement(this);
        }
    }
    
    public final void Class1(final mGraphics mGraphics) {
        final int class11 = this.Class11;
        final int class12 = this.Class12;
        mGraphics.setColor(16777215);
        mGraphics.Class2(class11 - this.Class7 / 2 - 1, class12 - this.Class13 - 15 + this.Class9 - this.Class10.length * 12 - 10, this.Class7 + 2, (this.Class10.length + 1) * 12 + 1, 12, 12);
        mGraphics.setColor(0);
        mGraphics.Class1(class11 - this.Class7 / 2 - 1, class12 - this.Class13 - 15 + this.Class9 - this.Class10.length * 12 - 10, this.Class7 + 1, (this.Class10.length + 1) * 12, 12, 12);
        Game2.Class1(mGraphics, 941, class11 - 3, class12 - this.Class13 - 15 + this.Class9 + 2, 0, 17);
        for (int i = 0; i < this.Class10.length; ++i) {
            mFont.Class9.Class1(mGraphics, this.Class10[i], class11, class12 - this.Class13 - 15 + this.Class9 + i * 12 - this.Class10.length * 12 - 4, 2);
        }
    }
    
    public final void perform(final int n, final Object o) {
        if (n == 8000) {
            int class16 = ChatPopup.Class6.Class16;
            if (++class16 >= ChatPopup.Class6.Class17.length) {
                ChatPopup.Class6.Class14.Class6 = null;
                ChatPopup.Class6 = null;
                return;
            }
            final ChatPopup class17;
            (class17 = Class1(ChatPopup.Class6.Class17[class16], ChatPopup.Class6.Class8, ChatPopup.Class6.Class14)).Class16 = class16;
            class17.Class17 = ChatPopup.Class6.Class17;
            class17.Class5 = ChatPopup.Class6.Class5;
            ChatPopup.Class6 = class17;
        }
    }
}
