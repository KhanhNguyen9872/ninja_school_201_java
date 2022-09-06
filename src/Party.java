// 
// Decompiled by Procyon v0.5.36
// 

public final class Party
{
    public int charId;
    public int Class2;
    public short Class3;
    public String name;
    public boolean Class5;
    public Char c;
    public int Class7;
    
    public Party(final byte b, final int class2, final String name, final int class3) {
        switch (b) {
            case 0: {
                this.Class3 = 647;
                break;
            }
            case 1: {
                this.Class3 = 1182;
                break;
            }
            case 2: {
                this.Class3 = 1181;
                break;
            }
            case 3: {
                this.Class3 = 643;
                break;
            }
            case 4: {
                this.Class3 = 645;
                break;
            }
            case 5: {
                this.Class3 = 676;
                break;
            }
            case 6: {
                this.Class3 = 1119;
                break;
            }
        }
        this.name = name;
        this.Class2 = class2;
        this.Class7 = class3;
    }
    
    public Party(final int charId, final byte b, final String name, final boolean class5) {
        this.charId = charId;
        this.Class5 = class5;
        switch (b) {
            case 0: {
                this.Class3 = 647;
                break;
            }
            case 1: {
                this.Class3 = 1182;
                break;
            }
            case 2: {
                this.Class3 = 1181;
                break;
            }
            case 3: {
                this.Class3 = 643;
                break;
            }
            case 4: {
                this.Class3 = 645;
                break;
            }
            case 5: {
                this.Class3 = 676;
                break;
            }
            case 6: {
                this.Class3 = 1119;
                break;
            }
        }
        this.name = name;
        if (charId == Char.getMyChar().charID) {
            this.c = Char.getMyChar();
            return;
        }
        this.c = GameScr.Class5(charId);
    }
    
    public static void Class1() {
        for (int i = 0; i < GameScr.vParty.size(); ++i) {
            final Party party;
            if ((party = (Party)GameScr.vParty.elementAt(i)).charId != Char.getMyChar().charID) {
                final Party party2 = party;
                party2.c = GameScr.Class5(party2.charId);
            }
        }
    }
    
    public static void Class1(final int n) {
        for (int i = 0; i < GameScr.vParty.size(); ++i) {
            final Party party;
            if ((party = (Party)GameScr.vParty.elementAt(i)).charId == n) {
                party.c = null;
                return;
            }
        }
    }
}
