// 
// Decompiled by Procyon v0.5.36
// 

public final class Game94
{
    public static Game71 Class1;
    public static Game71 Class2;
    public static Game71 Class3;
    public static Game71 Class4;
    public static Game71 Class5;
    public static Game71 Class6;
    private static Game71 Class12;
    public Game71 Class7;
    public static Game71 Class8;
    public int Class9;
    public int Class10;
    public int Class11;
    
    static {
        Game94.Class1 = new Game71();
        Game94.Class2 = new Game71();
        Game94.Class3 = new Game71();
        Game94.Class4 = new Game71();
        Game94.Class5 = new Game71();
        Game94.Class6 = new Game71();
        Game94.Class12 = new Game71();
        Game94.Class8 = new Game71();
    }
    
    public Game94() {
        this.Class7 = new Game71();
        this.Class9 = 0;
        this.Class10 = 0;
    }
    
    public static void Class1(final Message message) {
        try {
            Game94.Class3.Class1.clear();
            Game94.Class1.Class1.clear();
            Game94.Class2.Class1.clear();
            Game94.Class6.Class1.clear();
            Game94.Class4.Class1.clear();
            Game94.Class5.Class1.clear();
            Game94.Class8.Class1.clear();
            final int unsignedByte = message.Class4.readUnsignedByte();
            for (int i = 0; i < unsignedByte; ++i) {
                final byte byte1 = message.Class4.readByte();
                final short short1 = message.Class4.readShort();
                final Game94 game94;
                (game94 = new Game94()).Class11 = message.Class4.readShort();
                for (int j = 0; j < byte1 - 2; j += 3) {
                    final short short2 = message.Class4.readShort();
                    final short short3 = message.Class4.readShort();
                    final short short4 = message.Class4.readShort();
                    final Game94 game95;
                    (game95 = new Game94()).Class9 = short3;
                    game95.Class10 = short4;
                    game94.Class7.Class1(new StringBuffer(String.valueOf(short2)).toString(), game95);
                }
                Game94.Class1.Class1(new StringBuffer(String.valueOf(short1)).toString(), game94);
            }
            for (int k = 0; k < unsignedByte; ++k) {
                final byte byte2 = message.Class4.readByte();
                final short short5 = message.Class4.readShort();
                final Game94 game96;
                (game96 = new Game94()).Class11 = message.Class4.readShort();
                for (int l = 0; l < byte2 - 2; l += 3) {
                    final short short6 = message.Class4.readShort();
                    final short short7 = message.Class4.readShort();
                    final short short8 = message.Class4.readShort();
                    final Game94 game97;
                    (game97 = new Game94()).Class9 = short7;
                    game97.Class10 = short8;
                    game96.Class7.Class1(new StringBuffer(String.valueOf(short6)).toString(), game97);
                }
                Game94.Class2.Class1(new StringBuffer(String.valueOf(short5)).toString(), game96);
            }
            for (int n = 0; n < unsignedByte; ++n) {
                final byte byte3 = message.Class4.readByte();
                final short short9 = message.Class4.readShort();
                final Game94 game98;
                (game98 = new Game94()).Class11 = message.Class4.readShort();
                for (int n2 = 0; n2 < byte3 - 2; n2 += 3) {
                    final short short10 = message.Class4.readShort();
                    final short short11 = message.Class4.readShort();
                    final short short12 = message.Class4.readShort();
                    final Game94 game99;
                    (game99 = new Game94()).Class9 = short11;
                    game99.Class10 = short12;
                    game98.Class7.Class1(new StringBuffer(String.valueOf(short10)).toString(), game99);
                }
                Game94.Class3.Class1(new StringBuffer(String.valueOf(short9)).toString(), game98);
            }
            for (int unsignedByte2 = message.Class4.readUnsignedByte(), n3 = 0; n3 < unsignedByte2; n3 += 2) {
                final short short13 = message.Class4.readShort();
                final Game94 game100;
                (game100 = new Game94()).Class11 = message.Class4.readShort();
                Game94.Class12.Class1(new StringBuffer(String.valueOf(short13)).toString(), game100);
            }
            final int unsignedByte3 = message.Class4.readUnsignedByte();
            for (int n4 = 0; n4 < unsignedByte3; ++n4) {
                final byte byte4 = message.Class4.readByte();
                final short short14 = message.Class4.readShort();
                final Game94 game101;
                (game101 = new Game94()).Class11 = message.Class4.readShort();
                for (int n5 = 0; n5 < byte4 - 2; n5 += 3) {
                    final short short15 = message.Class4.readShort();
                    final short short16 = message.Class4.readShort();
                    final short short17 = message.Class4.readShort();
                    final Game94 game102;
                    (game102 = new Game94()).Class9 = short16;
                    game102.Class10 = short17;
                    game101.Class7.Class1(new StringBuffer(String.valueOf(short15)).toString(), game102);
                }
                Game94.Class4.Class1(new StringBuffer(String.valueOf(short14)).toString(), game101);
            }
            for (int n6 = 0; n6 < unsignedByte3; ++n6) {
                final byte byte5 = message.Class4.readByte();
                final short short18 = message.Class4.readShort();
                final Game94 game103;
                (game103 = new Game94()).Class11 = message.Class4.readShort();
                for (int n7 = 0; n7 < byte5 - 2; n7 += 3) {
                    final short short19 = message.Class4.readShort();
                    final short short20 = message.Class4.readShort();
                    final short short21 = message.Class4.readShort();
                    final Game94 game104;
                    (game104 = new Game94()).Class9 = short20;
                    game104.Class10 = short21;
                    game103.Class7.Class1(new StringBuffer(String.valueOf(short19)).toString(), game104);
                }
                Game94.Class5.Class1(new StringBuffer(String.valueOf(short18)).toString(), game103);
            }
            for (int n8 = 0; n8 < unsignedByte3; ++n8) {
                final byte byte6 = message.Class4.readByte();
                final short short22 = message.Class4.readShort();
                final Game94 game105;
                (game105 = new Game94()).Class11 = message.Class4.readShort();
                for (int n9 = 0; n9 < byte6 - 2; n9 += 3) {
                    final short short23 = message.Class4.readShort();
                    final short short24 = message.Class4.readShort();
                    final short short25 = message.Class4.readShort();
                    final Game94 game106;
                    (game106 = new Game94()).Class9 = short24;
                    game106.Class10 = short25;
                    game105.Class7.Class1(new StringBuffer(String.valueOf(short23)).toString(), game106);
                }
                Game94.Class6.Class1(new StringBuffer(String.valueOf(short22)).toString(), game105);
            }
            for (byte byte7 = message.Class4.readByte(), b = 0; b < byte7; ++b) {
                final short short26 = message.Class4.readShort();
                final int[][] array = new int[6][];
                for (int n10 = 0; n10 < 6; ++n10) {
                    final byte byte8 = message.Class4.readByte();
                    array[n10] = new int[byte8];
                    for (byte b2 = 0; b2 < byte8; ++b2) {
                        array[n10][b2] = message.Class4.readShort();
                    }
                }
                Game94.Class8.Class1(new StringBuffer(String.valueOf(short26)).toString(), array);
            }
        }
        catch (Exception ex) {}
    }
}
