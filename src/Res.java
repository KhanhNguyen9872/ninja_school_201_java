import main.GameCanvas;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public final class Res
{
    private static short[] Class1;
    private static short[] Class2;
    private static int[] Class3;
    private static Random Class4;
    
    static {
        Res.Class1 = new short[] { 0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024 };
        Res.Class4 = new Random();
    }
    
    public static void Class1() {
        Res.Class2 = new short[91];
        Res.Class3 = new int[91];
        for (int i = 0; i <= 90; ++i) {
            Res.Class2[i] = Res.Class1[90 - i];
            if (Res.Class2[i] == 0) {
                Res.Class3[i] = Integer.MAX_VALUE;
            }
            else {
                Res.Class3[i] = (Res.Class1[i] << 10) / Res.Class2[i];
            }
        }
    }
    
    public static final int Class1(int class3) {
        if ((class3 = Class3(class3)) >= 0 && class3 < 90) {
            return Res.Class1[class3];
        }
        if (class3 >= 90 && class3 < 180) {
            return Res.Class1[180 - class3];
        }
        if (class3 >= 180 && class3 < 270) {
            return -Res.Class1[class3 - 180];
        }
        return -Res.Class1[360 - class3];
    }
    
    public static final int Class2(int class3) {
        if ((class3 = Class3(class3)) >= 0 && class3 < 90) {
            return Res.Class2[class3];
        }
        if (class3 >= 90 && class3 < 180) {
            return -Res.Class2[180 - class3];
        }
        if (class3 >= 180 && class3 < 270) {
            return -Res.Class2[class3 - 180];
        }
        return Res.Class2[360 - class3];
    }
    
    public static final int Class1(final int n, final int n2) {
        if (n != 0) {
            final int abs = Math.abs((n2 << 10) / n);
            int i = 0;
            while (true) {
                while (i <= 90) {
                    if (Res.Class3[i] >= abs) {
                        final int n3 = i;
                        int n4 = n3;
                        if (n2 >= 0 && n < 0) {
                            n4 = 180 - n4;
                        }
                        if (n2 < 0 && n < 0) {
                            n4 += 180;
                        }
                        if (n2 < 0 && n >= 0) {
                            return 360 - n4;
                        }
                        return n4;
                    }
                    else {
                        ++i;
                    }
                }
                final int n3 = 0;
                continue;
            }
        }
        final int n5 = (n2 > 0) ? 90 : 270;
        return n5;
    }
    
    public static final int Class3(int n) {
        if (n >= 360) {
            n -= 360;
        }
        if (n < 0) {
            n += 360;
        }
        return n;
    }
    
    private static int Class3(final int n, final int n2) {
        return Class2(Class3(n)) * n2 >> 10;
    }
    
    private static int Class4(final int n, final int n2) {
        return Class1(Class3(n)) * n2 >> 10;
    }
    
    public static int Class2(final int n, final int n2) {
        return n + Res.Class4.nextInt(n2 - n);
    }
    
    public static int distance(int n, int n2, int n3, final int n4) {
        if ((n = (n - n3) * (n - n3) + (n2 - n4) * (n2 - n4)) <= 0) {
            return 0;
        }
        n2 = (n + 1) / 2;
        do {
            n3 = n2;
            n2 = n2 / 2 + n / (n2 << 1);
        } while (Math.abs(n3 - n2) > 1);
        return n2;
    }
    
    public static int Class4(final int bound) {
        return Res.Class4.nextInt(bound);
    }
    
    public static int abs(final int n) {
        if (n > 0) {
            return n;
        }
        return -n;
    }
    
    public static void Class1(final mGraphics mGraphics) {
        mGraphics.Class1(-mGraphics.Class1(), -mGraphics.Class2());
        mGraphics.Class4(0, 0, GameCanvas.Class25, GameCanvas.Class26);
    }
    
    public static String[] Class1(final String s, final String str, final int n) {
        int endIndex;
        String[] class1;
        if ((endIndex = s.indexOf(str)) >= 0) {
            class1 = Class1(s.substring(endIndex + str.length()), str, n + 1);
        }
        else {
            class1 = new String[n + 1];
            endIndex = s.length();
        }
        class1[n] = s.substring(0, endIndex);
        return class1;
    }
    
    public static String Class1(final long n, final int n2) {
        String s = "";
        final long n3;
        if ((n3 = (n + n2 - System.currentTimeMillis()) / 1000L) <= 0L) {
            return "";
        }
        long n4 = 0L;
        long n5 = 0L;
        long n6 = n3 / 60L;
        long n7 = n3;
        if (n3 >= 86400L) {
            n4 = n3 / 86400L;
            n5 = n3 % 86400L / 3600L;
        }
        else if (n3 >= 3600L) {
            n5 = n3 / 3600L;
            n6 = n3 % 3600L / 60L;
        }
        else if (n3 >= 60L) {
            n6 = n3 / 60L;
            n7 = n3 % 60L;
        }
        else {
            n7 = n3;
        }
        String s2;
        if (n4 > 0L) {
            if (n4 >= 10L) {
                s2 = ((n5 < 1L) ? (String.valueOf(n4) + "d") : ((n5 < 10L) ? (String.valueOf(n4) + "d0" + n5 + "h") : (String.valueOf(n4) + "d" + n5 + "h")));
            }
            else {
                if (n4 >= 10L) {
                    return s;
                }
                s2 = ((n5 < 1L) ? (String.valueOf(n4) + "d") : ((n5 < 10L) ? (String.valueOf(n4) + "d0" + n5 + "h") : (String.valueOf(n4) + "d" + n5 + "h")));
            }
        }
        else if (n5 > 0L) {
            if (n5 >= 10L) {
                s2 = ((n6 < 1L) ? (String.valueOf(n5) + "h") : ((n6 < 10L) ? (String.valueOf(n5) + "h0" + n6 + "m") : (String.valueOf(n5) + "h" + n6 + "m")));
            }
            else {
                if (n5 >= 10L) {
                    return s;
                }
                s2 = ((n6 < 1L) ? (String.valueOf(n5) + "h") : ((n6 < 10L) ? (String.valueOf(n5) + "h0" + n6 + "m") : (String.valueOf(n5) + "h" + n6 + "m")));
            }
        }
        else if (n6 > 0L) {
            if (n6 >= 10L) {
                if (n7 >= 10L) {
                    s2 = String.valueOf(n6) + "m" + n7 + "s";
                }
                else {
                    if (n7 >= 10L) {
                        return s;
                    }
                    s2 = String.valueOf(n6) + "m0" + n7 + "s";
                }
            }
            else {
                if (n6 >= 10L) {
                    return s;
                }
                if (n7 >= 10L) {
                    s2 = String.valueOf(n6) + "m" + n7 + "s";
                }
                else {
                    if (n7 >= 10L) {
                        return s;
                    }
                    s2 = String.valueOf(n6) + "m0" + n7 + "s";
                }
            }
        }
        else {
            s2 = ((n7 < 10L) ? ("0" + n7 + "s") : (String.valueOf(n7) + "s"));
        }
        s = s2;
        return s;
    }
}
