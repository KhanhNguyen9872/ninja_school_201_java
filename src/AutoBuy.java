// 
// Decompiled by Procyon v0.5.36
// 

public class AutoBuy
{
    private static MyVector Game2;
    public static int Game1;
    
    public static void Game1(final ItemTemplate itemTemplate, final String s) {
        final RMS game1;
        if ((game1 = RMS.Game1(itemTemplate, s)) != null) {
            for (int i = 0; i < AutoBuy.Game2.size(); ++i) {
                if (((RMS)AutoBuy.Game2.elementAt(i)).Game1.id == itemTemplate.id) {
                    AutoBuy.Game2.setElementAt(game1, i);
                    return;
                }
            }
            AutoBuy.Game2.addElement(game1);
        }
    }
    
    public static void Game1(final ItemTemplate itemTemplate) {
        for (int i = 0; i < AutoBuy.Game2.size(); ++i) {
            if (((RMS)AutoBuy.Game2.elementAt(i)).Game1.id == itemTemplate.id) {
                AutoBuy.Game2.removeElementAt(i);
                return;
            }
        }
    }
    
    public static RMS Game1(final short n) {
        for (int i = 0; i < AutoBuy.Game2.size(); ++i) {
            final RMS rms;
            if ((rms = (RMS)AutoBuy.Game2.elementAt(i)).Game1.id == n) {
                return rms;
            }
        }
        return null;
    }
    
    public static RMS Game1(final String s) {
        for (int i = 0; i < AutoBuy.Game2.size(); ++i) {
            final RMS rms;
            if ((rms = (RMS)AutoBuy.Game2.elementAt(i)).Game2.equals(s)) {
                return rms;
            }
        }
        return null;
    }
    
    public static MyVector Game1() {
        final MyVector myVector = new MyVector();
        for (int i = 0; i < AutoBuy.Game2.size(); ++i) {
            final RMS rms = (RMS)AutoBuy.Game2.elementAt(i);
            myVector.addElement(String.valueOf(i) + ". " + rms.Game1.name + " id " + rms.Game2);
            if (rms.Game6 > 0) {
                myVector.addElement("[Ninja School 2.0.1] Mua " + rms.Game7 + "k/" + rms.Game6 + " max " + rms.Game8);
            }
            if (rms.Game3 > 0) {
                myVector.addElement("[Ninja School 2.0.1] B\u00e1n " + rms.Game4 + "k/" + rms.Game3 + " min " + rms.Game5);
            }
        }
        return myVector;
    }
    
    public static String Game2() {
        if (AutoBuy.Game2.size() == 0) {
            return "";
        }
        if (AutoBuy.Game1 >= AutoBuy.Game2.size() || AutoBuy.Game1 < 0) {
            AutoBuy.Game1 = 0;
        }
        do {
            final RMS rms;
            final boolean game2 = (rms = (RMS)AutoBuy.Game2.elementAt(AutoBuy.Game1 = (AutoBuy.Game1 + 1) % AutoBuy.Game2.size())).Game2();
            final boolean game3 = rms.Game3();
            if (game2 && game3) {
                return "[Ninja School 2.0.1] @" + Char.getMyChar().cName + " b\u00e1n " + rms.Game2 + " " + rms.Game4 + "k " + rms.Game3 + " c\u00e1i, mua " + rms.Game7 + "k " + rms.Game6 + " cai, mua b\u00e1n pm";
            }
            if (game2) {
                return "[Ninja School 2.0.1] @" + Char.getMyChar().cName + " b\u00e1n " + rms.Game2 + " " + rms.Game4 + "k " + rms.Game3 + " c\u00e1i, mua pm";
            }
            if (game3) {
                return "[Ninja School 2.0.1] @" + Char.getMyChar().cName + " mua " + rms.Game2 + " " + rms.Game7 + "k " + rms.Game6 + " c\u00e1i, b\u00e1n pm ho\u1eb7c gd";
            }
        } while (AutoBuy.Game1 != AutoBuy.Game1);
        return "";
    }
    
    public static void Game2(final String s) {
        for (int i = 0; i < AutoBuy.Game2.size(); ++i) {
            final RMS rms;
            if (Char.KiemTraiditem21((rms = (RMS)AutoBuy.Game2.elementAt(i)).Game1.id) != null) {
                final boolean game2 = rms.Game2();
                final boolean game3 = rms.Game3();
                if (game2 && game3) {
                    Code.Game1(s, "[Ninja School 2.0.1] id: " + rms.Game2 + " " + rms.Game1.name + " b\u00e1n: " + rms.Game4 + "k/" + rms.Game3 + "c\u00e1i, mua: " + rms.Game7 + "k/" + rms.Game6 + " c\u00e1i. C\u00f2n " + rms.Game4() + " c\u00e1i.");
                }
                else if (game2) {
                    Code.Game1(s, "[Ninja School 2.0.1] id: " + rms.Game2 + " " + rms.Game1.name + " b\u00e1n: " + rms.Game4 + "k/" + rms.Game3 + "c\u00e1i. C\u00f2n " + rms.Game4() + " c\u00e1i.");
                }
                else if (game3) {
                    Code.Game1(s, "[Ninja School 2.0.1] id: " + rms.Game2 + " " + rms.Game1.name + " mua: " + rms.Game7 + "k/" + rms.Game6 + " c\u00e1i. C\u00f2n mua: " + ((rms.Game6 > 0 && Char.QuetSLmuaBan(rms.Game1.id) < rms.Game8) ? (rms.Game8 - Char.QuetSLmuaBan(rms.Game1.id)) : 0));
                }
            }
        }
    }
    
    public static boolean Game3() {
        for (int i = 0; i < AutoBuy.Game2.size(); ++i) {
            if (((RMS)AutoBuy.Game2.elementAt(i)).Game3()) {
                return true;
            }
        }
        return false;
    }
    
    public static void Game3(final String s) {
        final MyVector myVector = new MyVector();
        for (int i = 0; i < AutoBuy.Game2.size(); ++i) {
            final RMS rms;
            if ((rms = (RMS)AutoBuy.Game2.elementAt(i)).Game2()) {
                myVector.addElement(rms);
            }
        }
        if (myVector.size() > 0) {
            if (myVector.size() == 1) {
                final RMS rms2 = myVector.firstElement();
                Code.Game1(s, "[Ninja School 2.0.1] - \u0110\u1ec3 mua h\u00e0ng chat buy idvp solg ho\u1eb7c mua solg idvp");
                Code.Game1(s, "[Ninja School 2.0.1]      Vd mua 12 " + rms2.Game1.name);
                Code.Game1(s, "[Ninja School 2.0.1]      chat mua 12 " + rms2.Game2 + " ho\u1eb7c buy " + rms2.Game2 + " 12");
            }
            else {
                final RMS rms3 = (RMS)myVector.elementAt(0);
                final RMS rms4 = (RMS)myVector.elementAt(1);
                Code.Game1(s, "[Ninja School 2.0.1] - \u0110\u1ec3 mua h\u00e0ng chat buy idvp1 solg1 idvp2 solg2.... ho\u1eb7c mua solg1 idvp1 solg2 idvp2...");
                Code.Game1(s, "[Ninja School 2.0.1]      Vd mua 5 " + rms3.Game1.name + " 5 " + rms4.Game1.name);
                Code.Game1(s, "[Ninja School 2.0.1]      chat mua 5 " + rms3.Game2 + " 5 " + rms4.Game2 + " ho\u1eb7c buy " + rms3.Game2 + " 5 " + rms4.Game2 + " 5");
            }
        }
        if (Game3()) {
            Code.Game1(s, "[Ninja School 2.0.1] - \u0110\u1ec3 b\u00e1n h\u00e0ng chat sell ho\u1eb7c giao d\u1ecbch");
        }
        Code.Game1(s, "[Ninja School 2.0.1] - \u0110\u1ec3 Donate chat donate. Thank");
    }
    
    static {
        AutoBuy.Game2 = new MyVector();
        AutoBuy.Game1 = -1;
    }
}
