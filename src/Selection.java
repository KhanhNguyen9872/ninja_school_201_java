import java.io.InputStream;
import main.GameCanvas;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class Selection implements IActionListener
{
    private static Selection select;
    
    public static Selection gI() {
        if (Selection.select == null) {
            Selection.select = new Selection();
        }
        return Selection.select;
    }
    
    public static void savedata() {
        System.out.println("Save Auto");
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            int n = 0;
            for (int i = 0; i < Code.ShortItemNhat.length; ++i) {
                if (Code.ShortItemNhat[i] >= 0) {
                    ++n;
                }
            }
            System.out.println("lent Nh\u1eb7t: ".concat(String.valueOf(n)));
            dataOutputStream.writeInt(n);
            for (int j = 0; j < Code.ShortItemNhat.length; ++j) {
                if (Code.ShortItemNhat[j] >= 0) {
                    dataOutputStream.writeShort(Code.ShortItemNhat[j]);
                }
            }
            int n2 = 0;
            for (int n3 = 0; n3 < Code.Itemdell.length; ++n3) {
                if (Code.Itemdell[n3] >= 0) {
                    ++n2;
                }
            }
            System.out.println("lent Del: ".concat(String.valueOf(n2)));
            dataOutputStream.writeInt(n2);
            for (int n4 = 0; n4 < Code.Itemdell.length; ++n4) {
                if (Code.Itemdell[n4] >= 0) {
                    dataOutputStream.writeShort(Code.Itemdell[n4]);
                }
            }
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            TaskOrder.save("V7ProSetting", byteArrayOutputStream.toByteArray());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static final int[] lines(final int i1, final int i2, final int i3, final int i4) {
        return new int[] { i1, i2 - 8, i3, i4 - 8 };
    }
    
    public static final void Line(final mGraphics m) {
        if (Code.Line) {
            if (Char.getMyChar().charFocus != null) {
                m.setColor(65280);
                final int[] line = lines(Char.getMyChar().cx, Char.getMyChar().cy, Char.getMyChar().charFocus.cx, Char.getMyChar().charFocus.cy);
                m.drawLine(line[0], line[1], line[2], line[3]);
            }
            if (Char.getMyChar().npcFocus != null) {
                m.setColor(16711680);
                final int[] line = lines(Char.getMyChar().cx, Char.getMyChar().cy, Char.getMyChar().npcFocus.cx, Char.getMyChar().npcFocus.cy);
                m.drawLine(line[0], line[1], line[2], line[3]);
            }
            if (Char.getMyChar().mobFocus != null) {
                m.setColor(7798784);
                final int[] line = lines(Char.getMyChar().cx, Char.getMyChar().cy, Char.getMyChar().mobFocus.xFirst, Char.getMyChar().mobFocus.yFirst);
                m.drawLine(line[0], line[1], line[2], line[3]);
            }
        }
    }
    
    @Override
    public void perform(final int idAction, final Object p) {
        if (idAction == 1) {
            MenuAuto();
            return;
        }
        if (idAction == 2) {
            final Code code3 = Code.code;
            Code.Game6();
            return;
        }
        if (idAction == 3) {
            final Code code4 = Code.code;
            Code.Game4();
            return;
        }
        if (idAction == 4) {
            final MyVector myVector = new MyVector();
            myVector.addElement(new Command("T\u00e0n s\u00e1t", gI(), 5, null));
            for (int i = 0; i < Controller.tansat.size(); ++i) {
                final MobTemplate mobTemplate = (MobTemplate)Controller.tansat.elementAt(i);
                myVector.addElement(new Command(mobTemplate.name, gI(), 5, mobTemplate));
            }
            GameCanvas.Class30.Class1(myVector);
            return;
        }
        if (idAction == 5) {
            final MobTemplate mobTemplate2 = (MobTemplate)p;
            final Code code5 = Code.code;
            Code.TS((mobTemplate2 != null) ? mobTemplate2.Class5 : -1, TileMap.mapID);
        }
        if (idAction == 6) {
            final Code code6 = Code.code;
            Code.Game5();
            return;
        }
        if (idAction == 7) {
            final MyVector myVector2 = new MyVector();
            final MyVector myVector3 = new MyVector();
            for (int j = 0; j < GameScr.vNpc.size(); ++j) {
                final Npc npc2 = (Npc)GameScr.vNpc.elementAt(j);
                if (!myVector3.contains(npc2.template)) {
                    myVector3.addElement(npc2.template);
                    myVector2.addElement(new Command(npc2.template.name, gI(), 8, npc2));
                }
            }
            GameCanvas.Class30.Class1(myVector2);
            return;
        }
        final Npc npc3;
        if (idAction == 8 && (npc3 = (Npc)p) != null) {
            if (Math.abs(npc3.cx - Char.getMyChar().cx) > 22) {
                Char.Move(npc3.cx, npc3.cy);
            }
            Service.gI().openMenu(npc3.template.npcTemplateId);
        }
        if (idAction == 9) {
            GameScr.gI().DSPK();
            return;
        }
        if (idAction == 10) {
            GameScr.gI().DSHS();
            return;
        }
        if (idAction == 11) {
            try {
                GameCanvas.inputDlg.show("\u0110\u1eb7t gi\u00e1" + ((GameScr.getItemFocus(3) != null) ? (" " + GameScr.getItemFocus(3).template.name) : ""), new Command("\u0110\u1eb7t", gI(), 12, 0), 1);
                GameCanvas.inputDlg.tfInput.setText(AutoBuy.Game1(GameScr.getItemFocus(3).template.id).Game5());
            }
            catch (Exception ex) {}
            return;
        }
        if (idAction == 12) {
            if (GameScr.getItemFocus(3) != null) {
                AutoBuy.Game1(GameScr.getItemFocus(3).template, GameCanvas.inputDlg.tfInput.getText());
            }
            GameCanvas.endDlg();
        }
        if (idAction == 13 && GameScr.getItemFocus(3) != null) {
            AutoBuy.Game1(GameScr.getItemFocus(3).template);
            return;
        }
        if (idAction == 14) {
            GameScr.gI().DSMB();
            return;
        }
        if (idAction == 15) {
            Code.BatTatNhatXa = !Code.BatTatNhatXa;
            return;
        }
        if (idAction == 16) {
            GameCanvas.inputDlg.show("KC Nh\u1eb7t", new Command("\u0110\u1eb7t", gI(), 17, 0), 1);
            GameCanvas.inputDlg.tfInput.setText(String.valueOf(Code.KCNhatXa));
            return;
        }
        if (idAction == 17) {
            try {
                Code.KCNhatXa = Integer.parseInt(GameCanvas.inputDlg.tfInput.getText());
            }
            catch (Exception ex2) {}
            GameCanvas.endDlg();
            return;
        }
        if (idAction == 18) {
            GameCanvas.inputDlg.show("KC Nh\u1eb7t", new Command("\u0110\u1eb7t", gI(), 19, 0), 1);
            GameCanvas.inputDlg.tfInput.setText(String.valueOf(Code.KCTSat));
            return;
        }
        if (idAction == 19) {
            try {
                Code.KCTSat = Integer.parseInt(GameCanvas.inputDlg.tfInput.getText());
            }
            catch (Exception ex3) {}
            GameCanvas.endDlg();
        }
        if (idAction == 20) {
            Code.BatTatDanhChuyenVitri = !Code.BatTatDanhChuyenVitri;
            return;
        }
        if (idAction == 21) {
            if (Code.DanhCK = !Code.DanhCK) {
                GameCanvas.inputDlg.show("Khu-M\u1ed7i khu c\u00e1ch nhau b\u1eb1ng d\u1ea5u c\u00e1ch", new Command("\u0110\u1eb7t", gI(), 22, 0), 1);
                GameCanvas.inputDlg.tfInput.setText(String.valueOf(Code.Game11()));
            }
            return;
        }
        if (idAction == 22) {
            Char.Game5bb(GameCanvas.inputDlg.tfInput.getText());
            GameCanvas.endDlg();
            return;
        }
        if (idAction == 23) {
            GameScr.gI().Class4(40);
            return;
        }
        if (idAction == 24) {
            GameScr.gI();
            final Npc findNpc;
            if ((findNpc = GameScr.FindNpc(5)) != null && (Math.abs(findNpc.cx - Char.getMyChar().cx) > 22 || Math.abs(findNpc.cy - Char.getMyChar().cy) > 22)) {
                Char.Move(findNpc.cx, findNpc.cy);
            }
            GameScr.gI().Class4(4);
            return;
        }
        if (idAction == 25) {
            final Code code7 = Code.code;
            Code.Game14();
            return;
        }
        if (idAction != 26) {
            if (idAction == 27) {
                GameScr.gI().showAlert("H\u01b0\u1edbng d\u1eabn", this.text("hd.txt"), true);
            }
            return;
        }
        GameScr.gI();
        final Npc findNpc2;
        if ((findNpc2 = GameScr.FindNpc(13)) != null && findNpc2.statusMe != 15) {
            if (Math.abs(findNpc2.cx - Char.getMyChar().cx) > 22 || Math.abs(findNpc2.cy - Char.getMyChar().cy) > 22) {
                Char.Move(findNpc2.cx, findNpc2.cy);
            }
            Service.gI().openUIZone();
            return;
        }
        Service.gI().openUIZone();
    }
    
    private String text(final String s) {
        final InputStream resourceAsStream = this.getClass().getResourceAsStream("/".concat(String.valueOf(s)));
        String s2;
        try {
            final byte[] array = new byte[resourceAsStream.available()];
            resourceAsStream.read(array);
            s2 = new String(array, "UTF-8");
        }
        catch (Exception ex) {
            s2 = "";
        }
        return s2;
    }
    
    public static void MenuAuto() {
        final MyVector myVector = new MyVector();
        if (Code.T != null) {
            myVector.addElement(new Command("T\u1eaft Auto", gI(), 2, 0));
        }
        else if (TileMap.mapID == 1 || TileMap.mapID == 27 || TileMap.mapID == 72) {
            myVector.addElement(new Command("Auto NV", gI(), 3, 0));
        }
        myVector.addElement(new Command("T\u00e0n s\u00e1t", gI(), 4, 0));
        myVector.addElement(new Command("Auto T\u00e0 Th\u00fa", gI(), 6, 0));
        myVector.addElement(new Command("NPC", gI(), 7, 0));
        myVector.addElement(new Command("DSPK", gI(), 9, 0));
        myVector.addElement(new Command("DSHS", gI(), 10, 0));
        myVector.addElement(new Command("Item Sell", gI(), 14, 0));
        myVector.addElement(new Command("Item Nh\u1eb7t", GameScr.gI(), 10, 0));
        myVector.addElement(new Command("Item B\u00e1n", GameScr.gI(), 11, 0));
        myVector.addElement(new Command("Item Throw", GameScr.gI(), 12, 0));
        myVector.addElement(new Command(Code.BatTatNhatXa ? "H\u00fat VP" : "Nh\u1eb7t Xa", gI(), 15, 0));
        myVector.addElement(new Command((Code.KCNhatXa > 0) ? ("KC Nh\u1eb7t: " + Code.KCNhatXa) : "Nh\u1eb7t Full", gI(), 16, 0));
        myVector.addElement(new Command((Code.KCNhatXa > 0) ? ("KCTS: " + Code.KCNhatXa) : "TS Full", gI(), 18, 0));
        myVector.addElement(new Command(Code.BatTatDanhChuyenVitri ? "\u0110\u00e1nh CVT : B\u1eadt" : "\u0110\u00e1nh CVT : T\u1eaft", gI(), 20, 0));
        myVector.addElement(new Command(Code.BatTatDanhChuyenVitri ? "\u0110\u00e1nh CK : B\u1eadt" : "\u0110\u00e1nh CK : T\u1eaft", gI(), 21, 0));
        myVector.addElement(new Command("T\u1ef1 \u0110\u1ed9ng", gI(), 23, 0));
        GameCanvas.Class30.Class1(myVector);
    }
    
    public static void NVTM(final mGraphics g, final int n, int n2) {
        if (Code.NhanVat) {
            mFont.Class8.Class1(g, "Nh\u00e2n v\u1eadt trong khu", n, n2, 0);
            final int num = 210;
            for (int num2 = 0; num2 < GameScr.vCharInMap.size(); ++num2) {
                final Char charfocus = (Char)GameScr.vCharInMap.elementAt(num2);
                final String s = Char.getMyChar().npcFocus.template.name + " ID: " + Char.getMyChar().npcFocus.template.npcTemplateId;
                n2 += 15;
                mFont.Class12.Class1(g, s, n, n2, 0);
            }
        }
    }
    
    public static void Function() {
        final MyVector myVector = new MyVector();
        if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
            final RMS game1 = AutoBuy.Game1(Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id);
            myVector.addElement(new Command((game1 == null) ? "\u0110\u1eb7t gi\u00e1" : game1.Game2, gI(), 11, 0));
            if (game1 != null) {
                myVector.addElement(new Command("H\u1ee7y Mua B\u00e1n", gI(), 13, 0));
            }
        }
        GameCanvas.Class30.Class1(myVector);
    }
}
