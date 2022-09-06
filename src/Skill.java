import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Skill
{
    public SkillTemplate template;
    public short Class2;
    public int Class3;
    public int Class4;
    public int coolDown;
    public long lastTimeUseThisSkill;
    public int dx;
    public int dy;
    public int maxFight;
    public int Class10;
    public Game72[] Class11;
    public boolean paintCanNotUseSkill;
    
    public Skill() {
        this.paintCanNotUseSkill = false;
    }
    
    public final void Class1(final int n, final int n2, final mGraphics mGraphics) {
        Game2.Class1(mGraphics, this.template.iconId, n, n2, 0, Game62.Class7);
        final long n3;
        if ((n3 = System.currentTimeMillis() - this.lastTimeUseThisSkill) < this.coolDown) {
            mGraphics.setColor(3355443);
            if (this.paintCanNotUseSkill && GameCanvas.gameTick % 6 > 2) {
                mGraphics.setColor(4473924);
            }
            final int n4 = (int)(n3 * 18L / this.coolDown);
            mGraphics.fillRect(n - 9, n2 - 9 + n4, 18, 18 - n4);
            return;
        }
        this.paintCanNotUseSkill = false;
    }
    
    public final boolean isCooldown() {
        return System.currentTimeMillis() - this.lastTimeUseThisSkill < this.coolDown;
    }
}
