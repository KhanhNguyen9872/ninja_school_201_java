import main.GameCanvas;

// 
// Decompiled by Procyon v0.5.36
// 

final class Game95 implements Runnable
{
    private Session_ME Class1;
    
    Game95(final Session_ME class1) {
        this.Class1 = class1;
    }
    
    public final void run() {
        try {
            while (this.Class1.connecting) {
                byte b = this.Class1.Class2.readByte();
                if (this.Class1.Class11) {
                    b = Session_ME.Class1(this.Class1, b);
                }
                int unsignedShort;
                if (b == -32) {
                    b = this.Class1.Class2.readByte();
                    if (this.Class1.Class11) {
                        b = Session_ME.Class1(this.Class1, b);
                    }
                    unsignedShort = ((Session_ME.Class1(this.Class1, this.Class1.Class2.readByte()) & 0xFF) << 24 | (Session_ME.Class1(this.Class1, this.Class1.Class2.readByte()) & 0xFF) << 16 | (Session_ME.Class1(this.Class1, this.Class1.Class2.readByte()) & 0xFF) << 8 | (Session_ME.Class1(this.Class1, this.Class1.Class2.readByte()) & 0xFF));
                }
                else if (this.Class1.Class11) {
                    unsignedShort = ((Session_ME.Class1(this.Class1, this.Class1.Class2.readByte()) & 0xFF) << 8 | (Session_ME.Class1(this.Class1, this.Class1.Class2.readByte()) & 0xFF));
                }
                else {
                    unsignedShort = this.Class1.Class2.readUnsignedShort();
                }
                final byte[] b2 = new byte[unsignedShort];
                int read = 0;
                int off = 0;
                while (read != -1 && off < unsignedShort) {
                    if ((read = this.Class1.Class2.read(b2, off, unsignedShort - off)) > 0) {
                        off += read;
                        final Session_ME class1 = this.Class1;
                        class1.Class10 += off + 5;
                        final int n = Session_ME.gI().Class10 + Session_ME.gI().Class9;
                        new StringBuffer(String.valueOf(n / 1024)).append(".").append(n % 1024 / 102).append("Kb");
                    }
                }
                if (this.Class1.Class11) {
                    for (int i = 0; i < b2.length; ++i) {
                        b2[i] = Session_ME.Class1(this.Class1, b2[i]);
                    }
                }
                final Message message = new Message(b, b2);
                try {
                    if (message.Class1 == -27) {
                        this.Class1(message);
                    }
                    else {
                        this.Class1.Class3.Class1(message);
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        catch (Exception ex2) {}
        if (this.Class1.connecting) {
            if (this.Class1.Class3 != null) {
                if (System.currentTimeMillis() - this.Class1.Class13 > 500L) {
                    GameCanvas.instance.Class12();
                }
                else {
                    Controller.Class1();
                }
            }
            if (this.Class1.Class4 != null) {
                Session_ME.Class3(this.Class1);
            }
        }
    }
    
    private void Class1(final Message message) {
        final byte byte1 = message.Class4.readByte();
        this.Class1.Class12 = new byte[byte1];
        for (byte b = 0; b < byte1; ++b) {
            this.Class1.Class12[b] = message.Class4.readByte();
        }
        for (int i = 0; i < this.Class1.Class12.length - 1; ++i) {
            final byte[] class12 = this.Class1.Class12;
            final int n = i + 1;
            class12[n] ^= this.Class1.Class12[i];
        }
        this.Class1.Class11 = true;
    }
}
