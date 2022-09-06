// 
// Decompiled by Procyon v0.5.36
// 

public final class RMS
{
    public ItemTemplate Game1;
    public String Game2;
    public int Game3;
    public int Game4;
    public int Game5;
    public int Game6;
    public int Game7;
    public int Game8;
    public static int Class1;
    public static long Class2;
    public static boolean Class3;
    public MyVector Class4;
    public MyVector Class5;
    
    public RMS() {
    }
    
    public RMS(final MyVector class4, final MyVector class5) {
        this.Class4 = new MyVector();
        this.Class5 = new MyVector();
        this.Class4 = class4;
        this.Class5 = class5;
    }
    
    public static RMS Game1(final ItemTemplate p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   RMS.<init>:()V
        //     7: dup            
        //     8: astore_2       
        //     9: aload_0        
        //    10: putfield        RMS.Game1:LItemTemplate;
        //    13: aload_1        
        //    14: ldc             " "
        //    16: invokestatic    Code.Slip:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //    19: astore_0       
        //    20: aload_2        
        //    21: aload_0        
        //    22: iconst_0       
        //    23: aaload         
        //    24: putfield        RMS.Game2:Ljava/lang/String;
        //    27: aload_2        
        //    28: aload_0        
        //    29: iconst_1       
        //    30: aaload         
        //    31: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    34: putfield        RMS.Game4:I
        //    37: aload_2        
        //    38: aload_0        
        //    39: iconst_2       
        //    40: aaload         
        //    41: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    44: putfield        RMS.Game3:I
        //    47: aload_2        
        //    48: aload_0        
        //    49: iconst_3       
        //    50: aaload         
        //    51: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    54: putfield        RMS.Game5:I
        //    57: goto            71
        //    60: pop            
        //    61: aload_2        
        //    62: iconst_0       
        //    63: putfield        RMS.Game7:I
        //    66: aload_2        
        //    67: iconst_0       
        //    68: putfield        RMS.Game6:I
        //    71: aload_2        
        //    72: aload_0        
        //    73: iconst_4       
        //    74: aaload         
        //    75: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    78: putfield        RMS.Game7:I
        //    81: aload_2        
        //    82: aload_0        
        //    83: iconst_5       
        //    84: aaload         
        //    85: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    88: putfield        RMS.Game6:I
        //    91: aload_2        
        //    92: aload_0        
        //    93: bipush          6
        //    95: aaload         
        //    96: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    99: putfield        RMS.Game8:I
        //   102: goto            116
        //   105: pop            
        //   106: aload_2        
        //   107: iconst_0       
        //   108: putfield        RMS.Game7:I
        //   111: aload_2        
        //   112: iconst_0       
        //   113: putfield        RMS.Game6:I
        //   116: aload_2        
        //   117: getfield        RMS.Game3:I
        //   120: ifne            132
        //   123: aload_2        
        //   124: getfield        RMS.Game6:I
        //   127: ifne            132
        //   130: aconst_null    
        //   131: areturn        
        //   132: aload_2        
        //   133: areturn        
        //    StackMapTable: 00 05 FF 00 3C 00 03 07 00 4C 07 00 4E 07 00 02 00 01 07 00 2B 0A 61 07 00 2B 0A 0F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  27     57     60     71     Ljava/lang/Exception;
        //  71     102    105    116    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean Game2() {
        return this.Game3 > 0 && Char.QuetSLmuaBan(this.Game1.id) > this.Game5;
    }
    
    public final boolean Game3() {
        return this.Game6 > 0 && Char.QuetSLmuaBan(this.Game1.id) < this.Game8;
    }
    
    public final int Game4() {
        if (this.Game3 > 0 && Char.QuetSLmuaBan(this.Game1.id) > this.Game5) {
            return Char.QuetSLmuaBan(this.Game1.id) - this.Game5;
        }
        return 0;
    }
    
    public final String Game5() {
        return new StringBuffer(String.valueOf(this.Game2)).append(" ").append(this.Game4).append(" ").append(this.Game3).append(" ").append(this.Game5).append(" ").append(this.Game7).append(" ").append(this.Game6).append(" ").append(this.Game8).toString();
    }
}
