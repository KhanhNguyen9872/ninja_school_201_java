import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.CommandListener;

// 
// Decompiled by Procyon v0.5.36
// 

final class Game29 implements CommandListener
{
    private TField Class1;
    private final TextBox Class2;
    
    Game29(final TField class1, final TextBox class2) {
        this.Class1 = class1;
        this.Class2 = class2;
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (command.getLabel().equals(Game86.Class76)) {
            this.Class1.setText(this.Class2.getString());
        }
        Display.getDisplay(TField.Class21).setCurrent((Displayable)TField.Class20);
        TField.Class20.setFullScreenMode(true);
    }
}
