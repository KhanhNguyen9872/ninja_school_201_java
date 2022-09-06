import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game64 extends mScreen
{
    public static int Class8;
    
    public final void Class4() {
        if (Game64.Class8 > 5) {
            if (TaskOrder.Class3("indLanguage") >= 0) {
                GameCanvas.Class2();
                GameCanvas.Class31.switchToMe();
            }
            else {
                GameCanvas.Class2();
                GameCanvas.Class33.switchToMe();
            }
        }
        ++Game64.Class8;
    }
}
