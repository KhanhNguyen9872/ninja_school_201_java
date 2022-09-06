import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class DSPK
{
    private static MyVector Game1;
    
    private static void Game3() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(DSPK.Game1.size());
            for (int i = 0; i < DSPK.Game1.size(); ++i) {
                dataOutputStream.writeUTF((String)DSPK.Game1.elementAt(i));
            }
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            TaskOrder.save("V6PKS", byteArrayOutputStream.toByteArray());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static MyVector Game1() {
        final MyVector myVector = new MyVector();
        for (int i = 0; i < DSPK.Game1.size(); ++i) {
            myVector.addElement(String.valueOf(i) + ". " + (String)DSPK.Game1.elementAt(i));
        }
        return myVector;
    }
    
    public static void Game1(final String s) {
        if (!DSPK.Game1.contains(s)) {
            DSPK.Game1.addElement(s);
            Game3();
        }
    }
    
    public static void Game2(final String s) {
        if (DSPK.Game1.contains(s)) {
            DSPK.Game1.removeElement(s);
            Game3();
        }
    }
    
    public static void Game2() {
        DSPK.Game1.removeAllElements();
        Game3();
    }
    
    public static boolean Ten(final String s) {
        return DSPK.Game1.contains(s);
    }
    
    static {
        (DSPK.Game1 = new MyVector()).removeAllElements();
        try {
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TaskOrder.Loaddata("V6PKS"));
            DataInputStream dataInputStream;
            for (int int1 = (dataInputStream = new DataInputStream(byteArrayInputStream)).readInt(), i = 0; i < int1; ++i) {
                DSPK.Game1.addElement(dataInputStream.readUTF());
            }
            dataInputStream.close();
            byteArrayInputStream.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
