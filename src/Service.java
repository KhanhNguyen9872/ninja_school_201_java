import java.io.IOException;
import main.GameCanvas;
import main.GameMidlet;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Service
{
    public Session_ME temple;
    private static Service Class2;
    private int Class3;
    private int Class4;
    
    public Service() {
        this.temple = Session_ME.gI();
    }
    
    public static Service gI() {
        if (Service.Class2 == null) {
            Service.Class2 = new Service();
        }
        return Service.Class2;
    }
    
    static Message Class1(final byte v) {
        final Message message;
        (message = new Message((byte)(-29))).Class3.writeByte(v);
        return message;
    }
    
    public static Message Class2(final byte v) {
        final Message message;
        (message = new Message((byte)(-28))).Class3.writeByte(v);
        return message;
    }
    
    public static Message Class3(final byte v) {
        final Message message;
        (message = new Message((byte)(-30))).Class3.writeByte(v);
        return message;
    }
    
    public final void Class2() {
        try {
            final Message class1;
            (class1 = Class1((byte)(-125))).Class3.writeByte(GameMidlet.Class1);
            class1.Class3.writeByte(mGraphics.Class2);
            class1.Class3.writeBoolean(GameCanvas.Class3);
            class1.Class3.writeInt(GameCanvas.Class25);
            class1.Class3.writeInt(GameCanvas.Class26);
            class1.Class3.writeBoolean(TField.Class19);
            class1.Class3.writeBoolean(GameCanvas.Class6);
            class1.Class3.writeUTF(System.getProperty("microedition.platform"));
            class1.Class3.writeByte(0);
            class1.Class3.writeInt(0);
            class1.Class3.writeByte(Game86.Class1);
            class1.Class3.writeInt(GameMidlet.Class4);
            class1.Class3.writeUTF(GameMidlet.Class5);
            this.temple.Class1(class1);
            class1.Class2();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public final void Class1(final String str, final String str2, final String str3) {
        gI().Class2();
        try {
            final Message class1;
            (class1 = Class1((byte)(-127))).Class3.writeUTF(str);
            class1.Class3.writeUTF(str2);
            class1.Class3.writeUTF(str3);
            class1.Class3.writeUTF("");
            class1.Class3.writeUTF("");
            class1.Class3.writeUTF(TaskOrder.Class2("random"));
            class1.Class3.writeByte(GameMidlet.Class7);
            this.temple.Class1(class1);
            class1.Class2();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void Class2(final String str, final String str2, final String str3) {
        try {
            final Message message;
            (message = new Message((byte)118)).Class3.writeUTF(str);
            message.Class3.writeUTF(str2);
            message.Class3.writeUTF(str3);
            this.temple.Class1(message);
            message.Class2();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void Class11(final String str) {
        try {
            final Message class1;
            (class1 = Class1((byte)(-122))).Class3.writeUTF(str);
            this.temple.Class1(class1);
            class1.Class2();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public final void requestChangeMap() {
        final Message message = new Message((byte)(-17));
        this.temple.Class1(message);
        message.Class2();
    }
    
    public final void requestChangeZone(final int v, final int v2) {
        final Message message = new Message((byte)28);
        try {
            message.Class3.writeByte(v);
            message.Class3.writeByte(v2);
            this.temple.Class1(message);
            message.Class2();
        }
        catch (Exception ex) {}
    }
    
    public final void charMove(final int n, final int n2) {
        try {
            if (n - this.Class3 != 0 || n2 - this.Class4 != 0) {
                final Message message;
                (message = new Message((byte)1)).Class3.writeShort(n);
                message.Class3.writeShort(n2);
                this.Class3 = n;
                this.Class4 = n2;
                this.temple.Class1(message);
                message.Class2();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void Class12(final String str) {
        final Message message = new Message((byte)(-28));
        try {
            message.Class3.writeByte(-126);
            message.Class3.writeUTF(str);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        this.temple.Class1(message);
    }
    
    private void Class1(final String str, final int v, final int v2) {
        final Message message = new Message((byte)(-28));
        try {
            message.Class3.writeByte(-125);
            message.Class3.writeUTF(str);
            message.Class3.writeByte(v);
            message.Class3.writeByte(v2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        this.temple.Class1(message);
    }
    
    private void requestModTemplate(final int v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-108))).Class3.writeByte(v);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void requestItemInfo(final int v, final int v2) {
        Message message = null;
        try {
            (message = new Message((byte)42)).Class3.writeByte(v);
            message.Class3.writeByte(v2);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class4(final int v, final int v2) {
        Message message = null;
        try {
            (message = new Message((byte)94)).Class3.writeInt(v);
            message.Class3.writeByte(v2);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class5(final int v, final int v2) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-109))).Class3.writeByte(v);
            class3.Class3.writeShort(v2);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class6(final int v, final int v2) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-108))).Class3.writeShort(v);
            class3.Class3.writeByte(v2);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class1(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)15)).Class3.writeByte(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class2(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)108)).Class3.writeByte(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class3(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)16)).Class3.writeByte(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class4(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)17)).Class3.writeByte(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void useItem(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)11)).Class3.writeByte(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
        if (Char.getMyChar().arrItemBag[v] != null && Char.getMyChar().arrItemBag[v].template.type == 24) {
            GameScr.gI().Class22();
            InfoDlg.Class1("");
        }
    }
    
    public final void saleItem(final int v, final int v2) {
        Message message = null;
        try {
            (message = new Message((byte)14)).Class3.writeByte(v);
            if (v2 > 1) {
                message.Class3.writeInt(v2);
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void buyItem(final int v, final int v2, final int v3) {
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            (message = new Message((byte)13)).Class3.writeByte(v);
            message.Class3.writeByte(v2);
            if (v3 > 1) {
                message.Class3.writeShort(v3);
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void selectSkill(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)41)).Class3.writeShort(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class4() {
        Message class3 = null;
        try {
            class3 = Class3((byte)(-77));
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void openUIZone() {
        Message message = null;
        try {
            message = new Message((byte)36);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class8(final int v, final int v2) {
        Message message = null;
        try {
            (message = new Message((byte)12)).Class3.writeByte(v);
            message.Class3.writeByte(v2);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void openMenu(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)40)).Class3.writeShort(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void menu(final byte b, final int v, final int v2, final int v3) {
        Message message = null;
        try {
            (message = new Message((byte)29)).Class3.writeByte(v);
            message.Class3.writeByte(v2);
            message.Class3.writeByte(v3);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class1(final short v) {
        Message message = null;
        try {
            (message = new Message((byte)34)).Class3.writeShort(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class1(final short v, final String str) {
        Message message = null;
        try {
            (message = new Message((byte)92)).Class3.writeShort(v);
            message.Class3.writeUTF(str);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void requestItem(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-103))).Class3.writeByte(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void bagSort() {
        Message class3 = null;
        try {
            class3 = Class3((byte)(-107));
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class7() {
        Message class3 = null;
        try {
            class3 = Class3((byte)(-106));
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class9(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-105))).Class3.writeInt(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class10(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-104))).Class3.writeInt(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class1(final Item[] array) {
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            message = new Message((byte)19);
            for (int i = 0; i < array.length; ++i) {
                if (array[i] != null) {
                    message.Class3.writeByte(array[i].indexUI);
                }
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class1(final Item item, final Item[] array, final boolean v) {
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            (message = new Message((byte)21)).Class3.writeBoolean(v);
            message.Class3.writeByte(item.indexUI);
            for (int i = 0; i < array.length; ++i) {
                if (array[i] != null) {
                    message.Class3.writeByte(array[i].indexUI);
                }
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class2(final Item[] array) {
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            message = new Message((byte)20);
            for (int i = 0; i < array.length; ++i) {
                if (array[i] != null) {
                    message.Class3.writeByte(array[i].indexUI);
                }
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class1(final Item item) {
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            (message = new Message((byte)22)).Class3.writeByte(item.indexUI);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public void acceptInviteTrade(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)44)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class33(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)99)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class34(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)106)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class11(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)107)).Class3.writeByte(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class35(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)66)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public void cancelInviteTrade() {
        Message message = null;
        try {
            message = new Message((byte)56);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void cancelTrade() {
        Message message = null;
        try {
            message = new Message((byte)57);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void tradeAccept() {
        Message message = null;
        try {
            message = new Message((byte)46);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void tradeItemLock(int n, final Item[] array) {
        Message message = null;
        try {
            (message = new Message((byte)45)).Class3.writeInt(n);
            n = 0;
            for (int i = 0; i < array.length; ++i) {
                if (array[i] != null) {
                    ++n;
                }
            }
            message.Class3.writeByte(n);
            for (int j = 0; j < array.length; ++j) {
                if (array[j] != null) {
                    message.Class3.writeByte(array[j].indexUI);
                }
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void sendPlayerAttack(final MyVector myVector, final MyVector myVector2, int i) {
        Message message = null;
        if (i == 0) {
            return;
        }
        try {
            if (myVector.size() > 0 && myVector2.size() > 0) {
                if (i == 1) {
                    message = new Message((byte)4);
                }
                else if (i == 2) {
                    message = new Message((byte)73);
                }
                message.Class3.writeByte(myVector.size());
                for (i = 0; i < myVector.size(); ++i) {
                    message.Class3.writeByte(((Mob)myVector.elementAt(i)).mobId);
                }
                Char char1;
                for (i = 0; i < myVector2.size(); ++i) {
                    if ((char1 = (Char)myVector2.elementAt(i)) != null) {
                        message.Class3.writeInt(char1.charID);
                    }
                    else {
                        message.Class3.writeInt(-1);
                    }
                }
            }
            else if (myVector.size() > 0) {
                message = new Message((byte)60);
                for (i = 0; i < myVector.size(); ++i) {
                    message.Class3.writeByte(((Mob)myVector.elementAt(i)).mobId);
                }
            }
            else if (myVector2.size() > 0) {
                message = new Message((byte)61);
                for (i = 0; i < myVector2.size(); ++i) {
                    message.Class3.writeInt(((Char)myVector2.elementAt(i)).charID);
                }
            }
            if (message == null) {
                return;
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {}
    }
    
    public final void pickItem(final int v) {
        Message message = null;
        for (int i = 0; i < GameScr.vItemMap.size(); ++i) {
            GameScr.vItemMap.elementAt(i);
        }
        try {
            (message = new Message((byte)(-14))).Class3.writeShort(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void throwItem(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)(-12))).Class3.writeByte(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void returnTownFromDead() {
        Message message = null;
        try {
            message = new Message((byte)(-9));
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void wakeUpFromDead() {
        Message message = null;
        try {
            message = new Message((byte)(-10));
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void getTask(final int v, final int v2) {
        Message message = null;
        try {
            (message = new Message((byte)47)).Class3.writeByte(v);
            message.Class3.writeByte(v2);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public void chat(final String str) {
        Message message = null;
        try {
            (message = new Message((byte)(-23))).Class3.writeUTF(str);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class1(final String str) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-78))).Class3.writeUTF(str);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class12() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-122));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class13() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-121));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class14() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-120));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class15() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-119));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class16() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-101));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void tradeInvite(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)43)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class2(final String str) {
        Message message = null;
        try {
            (message = new Message((byte)59)).Class3.writeUTF(str);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class36(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)80)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class37(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)81)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class15(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)65)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class16(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)68)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void buffLive(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-79))).Class3.writeInt(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void addParty(final String str) {
        Message message = null;
        try {
            (message = new Message((byte)79)).Class3.writeUTF(str);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class18(final int v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-109))).Class3.writeByte(v);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void changePk(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-93))).Class3.writeByte(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class20(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-87))).Class3.writeByte(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class21(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-86))).Class3.writeByte(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void sendUseSkillMyBuff() {
        Message message = null;
        try {
            (message = new Message((byte)74)).Class3.writeByte(Char.getMyChar().Class15);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class18() {
        Message class3 = null;
        try {
            class3 = Class3((byte)(-88));
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class1(final boolean v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-76))).Class3.writeBoolean(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void outParty() {
        Message message = null;
        try {
            message = new Message((byte)83);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class33() {
        Message class3 = null;
        try {
            class3 = Class3((byte)(-85));
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class22(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)100)).Class3.writeByte(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class1(final MyVector myVector) {
        Message message = null;
        try {
            (message = new Message((byte)25)).Class3.writeByte(myVector.size());
            for (int i = 0; i < myVector.size(); ++i) {
                message.Class3.writeInt(((Char)myVector.elementAt(i)).charID);
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class34() {
        Message class3 = null;
        try {
            class3 = Class3((byte)(-84));
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class4(final String str) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-83))).Class3.writeUTF(str);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class5(final String str) {
        Message message = null;
        try {
            (message = new Message((byte)23)).Class3.writeUTF(str);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class14(final String str) {
        Message message = null;
        try {
            (message = new Message((byte)24)).Class3.writeUTF(str);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class6(final String str) {
        Message message = null;
        try {
            (message = new Message((byte)93)).Class3.writeUTF(str);
            message.Class3.writeByte(0);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public void chatParty(final String str) {
        Message message = null;
        try {
            (message = new Message((byte)(-20))).Class3.writeUTF(str);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class16(final String str) {
        Message message = null;
        try {
            (message = new Message((byte)(-21))).Class3.writeUTF(str);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public void chatPrivate(final String str, final String str2) {
        Message message = null;
        try {
            (message = new Message((byte)(-22))).Class3.writeUTF(str);
            message.Class3.writeUTF(str2);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class17(final String str) {
        Message message = null;
        try {
            (message = new Message((byte)(-19))).Class3.writeUTF(str);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class2(final String str, final String str2) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-99))).Class3.writeUTF(str);
            class2.Class3.writeUTF(str2);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class1(final String str, final byte[] b, final byte b2) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-67))).Class3.writeUTF(str);
            class3.Class3.writeInt(b.length);
            class3.Class3.write(b);
            class3.Class3.write(b2);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class7(final String str) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-65))).Class3.writeUTF(str);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class23(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-70))).Class3.writeByte(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    private void Class2(final String str, final int v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-97))).Class3.writeInt(v);
            class2.Class3.writeUTF(str);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class24(final int v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-115))).Class3.writeInt(v);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class20() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-113));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class21() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-112));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class22() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-111));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class23() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-114));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class25(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-63))).Class3.writeInt(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    public final void Class26(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-61))).Class3.writeInt(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    private void Class38(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-62))).Class3.writeInt(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    private void Class39(final int v) {
        Message class3 = null;
        try {
            (class3 = Class3((byte)(-60))).Class3.writeInt(v);
            this.temple.Class1(class3);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class3.Class2();
        }
        class3.Class2();
    }
    
    private void Class18(final String str) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-95))).Class3.writeUTF(str);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class1(final String str, final int v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-94))).Class3.writeUTF(str);
            class2.Class3.writeByte(v);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class8(final String str) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-93))).Class3.writeUTF(str);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class24() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-92));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    private void Class40(final int v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-90))).Class3.writeInt(v);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    private void Class41(final int v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-89))).Class3.writeInt(v);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class25() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-91));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class2(final int v, final int v2, final int v3) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-88))).Class3.writeByte(v);
            class2.Class3.writeByte(v2);
            class2.Class3.writeByte(v3);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class9(final String str) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-87))).Class3.writeUTF(str);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class10(final String str) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-70))).Class3.writeUTF(str);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    private void Class35() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-68));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class26() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-69));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class27() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-62));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public void inputNumSplit(final int v, final int v2) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-85))).Class3.writeByte(v);
            class2.Class3.writeInt(v2);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    private void Class42(final int v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-105))).Class3.writeInt(v);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    private void Class43(final int v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-102))).Class3.writeInt(v);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    private void Class11(final int v, final int v2) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-104))).Class3.writeInt(v);
            class2.Class3.writeInt(v2);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    private void Class44(final int v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-103))).Class3.writeInt(v);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class28() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-82));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class29() {
        Message class2 = null;
        try {
            class2 = Class2((byte)(-79));
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class1(final Item item, final int v) {
        Message message = null;
        try {
            (message = new Message((byte)102)).Class3.writeByte(item.indexUI);
            message.Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class27(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)104)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class28(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)105)).Class3.writeInt(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class30() {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-72))).Class3.writeByte(GameScr.indexSelect);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    private void Class19(final String str) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-61))).Class3.writeByte(GameScr.indexSelect);
            class2.Class3.writeUTF(str);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class31() {
        Message class2 = null;
        try {
            (class2 = Class2((byte)(-60))).Class3.writeByte(GameScr.indexSelect);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    private void Class4(final Item[] array) {
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            message = new Message((byte)110);
            for (int i = 0; i < array.length; ++i) {
                if (array[i] != null && (array[i].template.id == 10 || array[i].template.id == 11)) {
                    message.Class3.writeByte(array[i].indexUI);
                    break;
                }
            }
            for (int j = 0; j < array.length; ++j) {
                if (array[j] != null && (array[j].template.id == 455 || array[j].template.id == 456)) {
                    message.Class3.writeByte(array[j].indexUI);
                }
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class1(final Item item, final Item[] array) {
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            (message = new Message((byte)111)).Class3.writeByte(item.indexUI);
            for (int i = 0; i < array.length; ++i) {
                if (array[i] != null && (array[i].template.id == 455 || array[i].template.id == 456 || array[i].template.id == 457)) {
                    message.Class3.writeByte(array[i].indexUI);
                }
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class2(final Item item, final Item[] array) {
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            (message = new Message((byte)112)).Class3.writeByte(item.indexUI);
            int n = 0;
            for (int i = 0; i < array.length; ++i) {
                if (array[i] != null && array[i].template.id == 454) {
                    message.Class3.writeByte(array[i].indexUI);
                    ++n;
                }
            }
            if (n < 20) {
                GameCanvas.setText(Game86.Class488);
                return;
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class29(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)113)).Class3.writeShort(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class1(String string, final String str, final byte v) {
        Message message = null;
        string = String.valueOf(string) + " " + str;
        try {
            (message = new Message((byte)(-21))).Class3.writeUTF(string);
            message.Class3.writeByte(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {}
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class2(final short v, final String str) {
        Message message = null;
        try {
            (message = new Message((byte)118)).Class3.writeUTF(str);
            message.Class3.writeShort(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public void sendAttackMobFast(final short v) {
        Message message = null;
        try {
            (message = new Message((byte)119)).Class3.writeByte(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class1(final byte v, final String str) {
        Message message = null;
        try {
            (message = new Message((byte)121)).Class3.writeByte(v);
            message.Class3.writeUTF(str);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class1(final byte v, final short v2) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)122)).Class3.writeByte(v);
            class2.Class3.writeByte(v2);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class1(final short v, final String str, final byte v2) {
        Message message = null;
        try {
            (message = new Message((byte)92)).Class3.writeShort(v);
            message.Class3.writeUTF(str);
            message.Class3.writeByte(v2);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class1(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        try {
            final Message message;
            (message = new Message((byte)123)).Class3.writeUTF(str);
            message.Class3.writeUTF(str2);
            message.Class3.writeUTF(str3);
            message.Class3.writeUTF(str4);
            message.Class3.writeUTF(str5);
            message.Class3.writeUTF(str6);
            message.Class3.writeUTF(str7);
            this.temple.Class1(message);
            message.Class2();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final void Class4(final byte v) {
        Message class2 = null;
        try {
            (class2 = Class2((byte)122)).Class3.writeByte(4);
            class2.Class3.writeByte(v);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            class2.Class2();
        }
        class2.Class2();
    }
    
    public final void Class1(final byte v, final Item item, final Item item2, final Item[] array) {
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            (message = new Message((byte)124)).Class3.writeByte(v);
            if (v == 0) {
                message.Class3.writeByte(item.indexUI);
                message.Class3.writeByte(item2.indexUI);
                for (int i = 0; i < array.length; ++i) {
                    if (array[i] != null) {
                        message.Class3.writeByte(array[i].indexUI);
                    }
                }
            }
            else if (v == 1) {
                message.Class3.writeByte(item2.indexUI);
                for (int j = 0; j < array.length; ++j) {
                    if (array[j] != null) {
                        message.Class3.writeByte(array[j].indexUI);
                    }
                }
            }
            else if (v == 2 || v == 3) {
                message.Class3.writeByte(item2.indexUI);
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class3(final Item[] array) {
        GameCanvas.Class35.switchToMe();
        Message message = null;
        try {
            message = new Message((byte)126);
            for (int i = 0; i < array.length; ++i) {
                if (array[i] != null) {
                    message.Class3.writeByte(array[i].indexUI);
                }
            }
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class3(final short v) {
        Message message = null;
        try {
            (message = new Message((byte)125)).Class3.writeByte(1);
            message.Class3.writeShort(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    public final void Class30(final int v) {
        Message message = null;
        try {
            (message = new Message((byte)125)).Class3.writeByte(2);
            message.Class3.writeShort(v);
            this.temple.Class1(message);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            message.Class2();
        }
        message.Class2();
    }
    
    private void Class36() {
        try {
            final Message class2;
            (class2 = Class2((byte)(-59))).Class3.writeUTF(GameMidlet.Class10);
            class2.Class3.writeUTF(GameMidlet.Class9);
            this.temple.Class1(class2);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
