import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Game123
{
    public long Class1;
    public MyVector Class2;
    Game2[] Class3;
    private byte[][] Class24;
    public byte[] Class4;
    byte Class5;
    byte Class6;
    public boolean Class7;
    public short Class8;
    byte Class9;
    private byte[] Class25;
    private boolean Class26;
    public boolean Class10;
    public byte[] Class11;
    public byte[] Class12;
    public byte[] Class13;
    public byte[] Class14;
    public byte[] Class15;
    public byte Class16;
    public byte Class17;
    public byte Class18;
    private MyVector Class27;
    private MyVector Class28;
    private MyVector Class29;
    private MyVector Class30;
    private MyVector Class31;
    public long Class19;
    long Class20;
    public int Class21;
    public boolean Class22;
    boolean Class23;
    
    static {
        new Game71();
    }
    
    public Game123() {
        this.Class2 = new MyVector();
        new MyVector();
        this.Class24 = new byte[4][];
        new MyVector();
        this.Class8 = 0;
        this.Class9 = 0;
        this.Class25 = new byte[4];
        this.Class10 = false;
        this.Class27 = new MyVector();
        this.Class28 = new MyVector();
        this.Class29 = new MyVector();
        this.Class30 = new MyVector();
        this.Class31 = new MyVector();
        new MyVector();
    }
    
    public Game123(final short class8, final boolean class9) {
        this.Class2 = new MyVector();
        new MyVector();
        this.Class24 = new byte[4][];
        new MyVector();
        this.Class8 = 0;
        this.Class9 = 0;
        this.Class25 = new byte[4];
        this.Class10 = false;
        this.Class27 = new MyVector();
        this.Class28 = new MyVector();
        this.Class29 = new MyVector();
        this.Class30 = new MyVector();
        this.Class31 = new MyVector();
        new MyVector();
        this.Class8 = class8;
        this.Class26 = class9;
        this.Class1((byte[])null);
    }
    
    private void Class1(byte[] class1) {
        try {
            final Game70 game70;
            if ((game70 = (Game70)Game75.Class2.Class1(new StringBuffer().append(this.Class8).toString())) != null && game70.Class1 != null) {
                class1 = game70.Class1;
            }
            if (game70 == null) {
                Game75.Class2.Class1(new StringBuffer().append(this.Class8).toString(), new Game70());
                Service.gI().Class30(this.Class8);
            }
            if (class1 != null && class1.length > 0) {
                this.Class2(class1);
            }
        }
        catch (Exception ex) {}
    }
    
    private void Class2(final byte[] buf) {
        if (buf == null) {
            return;
        }
        DataInputStream dataInputStream = null;
        try {
            this.Class2.removeAllElements();
            this.Class3 = null;
            final byte byte1 = (dataInputStream = new DataInputStream(new ByteArrayInputStream(buf))).readByte();
            this.Class3 = new Game2[byte1];
            for (byte b = 0; b < byte1; ++b) {
                final Game2[] class3 = this.Class3;
                final byte b2 = b;
                dataInputStream.readUnsignedByte();
                class3[b2] = new Game2(dataInputStream.readUnsignedByte(), dataInputStream.readUnsignedByte(), dataInputStream.readUnsignedByte(), dataInputStream.readUnsignedByte());
            }
            for (short short1 = dataInputStream.readShort(), n = 0; n < short1; ++n) {
                final byte byte2 = dataInputStream.readByte();
                final MyVector class4 = new MyVector();
                final MyVector class5 = new MyVector();
                for (byte b3 = 0; b3 < byte2; ++b3) {
                    final Game66 game66;
                    (game66 = new Game66(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readByte())).Class4 = dataInputStream.readByte();
                    game66.Class5 = dataInputStream.readByte();
                    if (game66.Class5 == 0) {
                        class4.addElement(game66);
                    }
                    else {
                        class5.addElement(game66);
                    }
                }
                this.Class2.addElement(new RMS(class4, class5));
            }
            final short n2 = (short)dataInputStream.readUnsignedByte();
            this.Class4 = new byte[n2];
            int n3 = 0;
            for (short n4 = 0; n4 < n2; ++n4) {
                this.Class4[n4] = (byte)dataInputStream.readShort();
                if (this.Class26) {
                    if (n3 == 2 && this.Class4[n4] != -1) {
                        this.Class27.addElement(new StringBuffer(String.valueOf(this.Class4[n4])).toString());
                    }
                    if (n3 == 3 && this.Class4[n4] != -1) {
                        this.Class28.addElement(new StringBuffer(String.valueOf(this.Class4[n4])).toString());
                    }
                    if (n3 == 4 && this.Class4[n4] != -1) {
                        this.Class29.addElement(new StringBuffer(String.valueOf(this.Class4[n4])).toString());
                    }
                    if (n3 == 5 && this.Class4[n4] != -1) {
                        this.Class30.addElement(new StringBuffer(String.valueOf(this.Class4[n4])).toString());
                    }
                    if (n3 == 6 && this.Class4[n4] != -1) {
                        this.Class31.addElement(new StringBuffer(String.valueOf(this.Class4[n4])).toString());
                    }
                    if (this.Class4[n4] == -1) {
                        ++n3;
                    }
                }
            }
            if (this.Class26) {
                this.Class16 = this.Class4[0];
                this.Class17 = this.Class4[2];
                this.Class18 = this.Class4[3];
                this.Class15 = Class1(this.Class27);
                this.Class11 = Class1(this.Class28);
                this.Class12 = Class1(this.Class29);
                this.Class13 = Class1(this.Class30);
                this.Class14 = Class1(this.Class31);
                this.Class27.removeAllElements();
                this.Class28.removeAllElements();
                this.Class29.removeAllElements();
                this.Class30.removeAllElements();
                this.Class31.removeAllElements();
            }
            dataInputStream.readByte();
            final byte byte3 = dataInputStream.readByte();
            this.Class24[0] = new byte[byte3];
            for (byte b4 = 0; b4 < byte3; ++b4) {
                this.Class24[0][b4] = dataInputStream.readByte();
            }
            final byte byte4 = dataInputStream.readByte();
            this.Class24[1] = new byte[byte4];
            for (byte b5 = 0; b5 < byte4; ++b5) {
                this.Class24[1][b5] = dataInputStream.readByte();
            }
            final byte byte5 = dataInputStream.readByte();
            this.Class24[3] = new byte[byte5];
            for (byte b6 = 0; b6 < byte5; ++b6) {
                this.Class24[3][b6] = dataInputStream.readByte();
            }
            this.Class7 = true;
            try {
                this.Class25[0] = (byte)(this.Class24[0].length - 7);
                this.Class25[1] = (byte)(this.Class24[1].length - 7);
                this.Class25[2] = (byte)(this.Class24[3].length - 7);
                this.Class25[3] = (byte)(this.Class24[3].length - 7);
            }
            catch (Exception ex) {}
            this.Class25[0] = dataInputStream.readByte();
            this.Class25[1] = dataInputStream.readByte();
            this.Class25[2] = dataInputStream.readByte();
            this.Class25[3] = this.Class25[2];
        }
        catch (Exception ex2) {}
        finally {
            try {
                dataInputStream.close();
            }
            catch (Exception ex3) {}
        }
        try {
            dataInputStream.close();
        }
        catch (Exception ex4) {}
    }
    
    public Game123(final short class8, final long class9, final int class10, final boolean class11) {
        this.Class2 = new MyVector();
        new MyVector();
        this.Class24 = new byte[4][];
        new MyVector();
        this.Class8 = 0;
        this.Class9 = 0;
        this.Class25 = new byte[4];
        this.Class10 = false;
        this.Class27 = new MyVector();
        this.Class28 = new MyVector();
        this.Class29 = new MyVector();
        this.Class30 = new MyVector();
        this.Class31 = new MyVector();
        new MyVector();
        this.Class8 = class8;
        this.Class19 = class9;
        this.Class21 = class10;
        this.Class10 = class11;
        this.Class1((byte[])null);
        if (class9 == -1L) {
            this.Class9 = 3;
            return;
        }
        if (class9 == 0L) {
            this.Class9 = 1;
            return;
        }
        this.Class19 += System.currentTimeMillis();
        this.Class9 = 2;
    }
    
    public final void Class1(final long n) {
        if (n == -1L) {
            this.Class9 = 3;
            return;
        }
        if (n == 0L) {
            this.Class9 = 1;
            return;
        }
        this.Class9 = 2;
    }
    
    private static byte[] Class1(final MyVector myVector) {
        final byte[] array = new byte[myVector.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = Byte.parseByte((String)myVector.elementAt(i));
        }
        return array;
    }
    
    final boolean Class1() {
        if (this.Class7) {
            return true;
        }
        this.Class1((byte[])null);
        return false;
    }
    
    public final void Class1(final mGraphics mGraphics, final int n, final int n2, final int n3, final int n4) {
        if (!this.Class1()) {
            return;
        }
        if (n3 < this.Class2.size()) {
            final RMS rms = (RMS)this.Class2.elementAt(n3);
            try {
                final MyVector class5 = rms.Class5;
                for (int i = 0; i < class5.size(); ++i) {
                    final Game66 game66 = (Game66)class5.elementAt(i);
                    final Game2 game67 = this.Class3[game66.Class1];
                    final Game82 class6;
                    if ((class6 = Game75.Class1(this.Class8)) != null && class6.Class1 != null) {
                        int class7 = game66.Class2;
                        int class8 = game67.Class4;
                        int class9 = game67.Class5;
                        int class10 = game67.Class2;
                        int class11 = game67.Class3;
                        final int width = class6.Class1.getWidth();
                        final int height = class6.Class1.getHeight();
                        if (class10 > width) {
                            class10 = 0;
                        }
                        if (class11 > height) {
                            class11 = 0;
                        }
                        if (class10 + class8 > width) {
                            class8 = width - class10;
                        }
                        if (class11 + class9 > height) {
                            class9 = height - class11;
                        }
                        int n5 = (game66.Class4 == 1) ? 2 : 0;
                        if (n4 == 2 || n4 == 6) {
                            if (n5 == 2) {
                                n5 = 0;
                            }
                            else {
                                n5 = 2;
                            }
                            class7 = -(class7 + class8);
                        }
                        mGraphics.Class1(class6.Class1, class10, class11, class8, class9, n5, n + class7, n2 + game66.Class3, 0);
                    }
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public final void Class2(final mGraphics mGraphics, final int n, final int n2, final int n3, final int n4) {
        if (!this.Class1()) {
            return;
        }
        if (n3 < this.Class2.size()) {
            final RMS rms = (RMS)this.Class2.elementAt(n3);
            try {
                final MyVector class4 = rms.Class4;
                for (int i = 0; i < class4.size(); ++i) {
                    final Game66 game66 = (Game66)class4.elementAt(i);
                    final Game2 game67 = this.Class3[game66.Class1];
                    final Game82 class5;
                    if ((class5 = Game75.Class1(this.Class8)) != null && class5.Class1 != null) {
                        int class6 = game66.Class2;
                        int class7 = game67.Class4;
                        int class8 = game67.Class5;
                        int class9 = game67.Class2;
                        int class10 = game67.Class3;
                        final int width = class5.Class1.getWidth();
                        final int height = class5.Class1.getHeight();
                        if (class9 > width) {
                            class9 = 0;
                        }
                        if (class10 > height) {
                            class10 = 0;
                        }
                        if (class9 + class7 > width) {
                            class7 = width - class9;
                        }
                        if (class10 + class8 > height) {
                            class8 = height - class10;
                        }
                        int n5 = (game66.Class4 == 1) ? 2 : 0;
                        if (n4 == 2 || n4 == 6) {
                            if (n5 == 2) {
                                n5 = 0;
                            }
                            else {
                                n5 = 2;
                            }
                            class6 = -(class6 + class7);
                        }
                        mGraphics.Class1(class5.Class1, class9, class10, class7, class8, n5, n + class6, n2 + game66.Class3, 0);
                    }
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void Class1(final mGraphics mGraphics, final int n, final int n2) {
        try {
            if (!this.Class1()) {
                return;
            }
            if (this.Class23) {
                return;
            }
            if (this.Class5 < this.Class2.size()) {
                final MyVector class4 = ((RMS)this.Class2.elementAt(this.Class5)).Class4;
                for (int i = 0; i < class4.size(); ++i) {
                    final Game66 game66 = (Game66)class4.elementAt(i);
                    final Game2 game67 = this.Class3[game66.Class1];
                    final Game82 class5;
                    if ((class5 = Game75.Class1(this.Class8)) != null && class5.Class1 != null) {
                        final short class6 = game66.Class2;
                        int class7 = game67.Class4;
                        int class8 = game67.Class5;
                        int class9 = game67.Class2;
                        int class10 = game67.Class3;
                        if (class9 > class5.Class1.getWidth()) {
                            class9 = 0;
                        }
                        if (class10 > class5.Class1.getHeight()) {
                            class10 = 0;
                        }
                        if (class9 + class7 > class5.Class1.getWidth()) {
                            class7 = class5.Class1.getWidth() - class9;
                        }
                        if (class10 + class8 > class5.Class1.getHeight()) {
                            class8 = class5.Class1.getHeight() - class10;
                        }
                        mGraphics.Class1(class5.Class1, class9, class10, class7, class8, (game66.Class4 == 1) ? 2 : 0, n + class6, n2 + game66.Class3, 0);
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Err DataSkillEff  paintBottomEff:" + this.Class8);
        }
    }
    
    private void Class2(final mGraphics mGraphics, final int n, final int n2) {
        try {
            if (!this.Class1()) {
                return;
            }
            if (this.Class23) {
                return;
            }
            if (this.Class5 < this.Class2.size()) {
                final MyVector class5 = ((RMS)this.Class2.elementAt(this.Class5)).Class5;
                for (int i = 0; i < class5.size(); ++i) {
                    final Game66 game66 = (Game66)class5.elementAt(i);
                    final Game2 game67 = this.Class3[game66.Class1];
                    final Game82 class6;
                    if ((class6 = Game75.Class1(this.Class8)) != null && class6.Class1 != null) {
                        final short class7 = game66.Class2;
                        int class8 = game67.Class4;
                        int class9 = game67.Class5;
                        int class10 = game67.Class2;
                        int class11 = game67.Class3;
                        if (class10 > class6.Class1.getWidth()) {
                            class10 = 0;
                        }
                        if (class11 > class6.Class1.getHeight()) {
                            class11 = 0;
                        }
                        if (class10 + class8 > class6.Class1.getWidth()) {
                            class8 = class6.Class1.getWidth() - class10;
                        }
                        if (class11 + class9 > class6.Class1.getHeight()) {
                            class9 = class6.Class1.getHeight() - class11;
                        }
                        mGraphics.Class1(class6.Class1, class10, class11, class8, class9, (game66.Class4 == 1) ? 2 : 0, n + class7, n2 + game66.Class3, 0);
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Err DataSkillEff  paintBottomEff:" + this.Class8);
        }
    }
    
    final void Class1(final boolean class23) {
        if (this.Class21 > 0) {
            this.Class23 = class23;
            if (this.Class23) {
                this.Class20 = System.currentTimeMillis() + this.Class21;
            }
        }
        else {
            this.Class23 = false;
        }
    }
    
    private void Class2() {
        if (this.Class2.size() <= 0) {
            return;
        }
        try {
            if (!this.Class23) {
                switch (this.Class9) {
                    case 0: {
                        ++this.Class6;
                        if (this.Class6 > this.Class4.length) {
                            this.Class22 = true;
                            this.Class6 = 0;
                        }
                        this.Class5 = this.Class4[this.Class6];
                    }
                    case 1: {
                        ++this.Class6;
                        if (this.Class6 > this.Class4.length) {
                            this.Class6 = 0;
                            this.Class22 = true;
                        }
                        this.Class5 = this.Class4[this.Class6];
                    }
                    case 2: {
                        ++this.Class6;
                        if (this.Class6 == (byte)(this.Class4.length - 1) && this.Class19 - System.currentTimeMillis() < 0L) {
                            this.Class22 = true;
                        }
                        if (this.Class6 > this.Class4.length) {
                            this.Class6 = 0;
                            this.Class1(true);
                        }
                        this.Class5 = this.Class4[this.Class6];
                    }
                    case 3: {
                        ++this.Class6;
                        if (this.Class6 > this.Class4.length) {
                            this.Class6 = 0;
                            this.Class1(true);
                        }
                        this.Class5 = this.Class4[this.Class6];
                    }
                    default: {}
                }
            }
            else if (this.Class20 - System.currentTimeMillis() < 0L) {
                this.Class1(false);
            }
        }
        catch (Exception ex) {}
    }
}
