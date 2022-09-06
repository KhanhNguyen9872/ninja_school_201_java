// 
// Decompiled by Procyon v0.5.36
// 

public final class AutoSell extends Auto
{
    private int Game23;
    private int Pk;
    private boolean Game25;
    private boolean Thoigianchohoisinh;
    private boolean MyLenga;
    private String Game28;
    private MyVector Game29;
    private MyVector Game30;
    private long Game31;
    public static boolean cx2;
    
    public final void Game1(final String game28, final int n) {
        if (AutoBuy.Game3()) {
            Service.gI().acceptInviteTrade(n);
            this.Game28 = game28;
            this.MyLenga = true;
            this.Thoigianchohoisinh = true;
            this.Game29 = null;
            this.Game30 = null;
            this.Game25 = true;
            return;
        }
        Service.gI().cancelInviteTrade();
        Code.Game1(game28, "<Hi\u1ec7n mk ko mua vp n\u00e0o>");
    }
    
    public final void Run() {
        if (Auto.booleanChet()) {
            Auto.HoiSinh(true);
            return;
        }
        if (super.iDMap != TileMap.mapID || super.khutheodanhsach != TileMap.zoneID) {
            this.TuDanhPkTTDTN(super.iDMap, super.khutheodanhsach, -1, -1);
            return;
        }
        if (this.Game25) {
            final String game28 = this.Game28;
            int i = 0;
            while (true) {
                while (i < GameScr.vCharInMap.size()) {
                    final Char char1;
                    if ((char1 = (Char)GameScr.vCharInMap.elementAt(i)).cName.equals(game28)) {
                        final Char char3;
                        final Char char2 = char3 = char1;
                        final Char char4 = char3;
                        if (char2 == null) {
                            if (this.Game28 != null) {
                                Code.Game1(this.Game28, new StringBuffer("<H\u00e3y \u0111\u1ebfn ").append(TileMap.mapNames[TileMap.mapID]).append(" khu ").append(TileMap.zoneID).append(" \u0111\u1ec3 giao d\u1ecbch>").toString());
                            }
                            this.Game25 = false;
                            return;
                        }
                        if (this.MyLenga) {
                            this.Game5(char4);
                        }
                        else {
                            this.Game6(char4);
                        }
                        Thread.sleep(500L);
                        this.Game25 = false;
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                Char char3;
                final Char char2 = char3 = null;
                continue;
            }
        }
        if (Char.getMyChar().cx != this.Game23 || Char.getMyChar().cy != this.Pk) {
            Char.Move(this.Game23, this.Pk);
            Thread.sleep(500L);
        }
        final String game29;
        if (System.currentTimeMillis() - this.Game31 >= 5000L && !(game29 = AutoBuy.Game2()).equals("")) {
            Service.gI().chat(game29);
            this.Game31 = System.currentTimeMillis();
        }
    }
    
    public final void Game1(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             " "
        //     3: invokestatic    Code.Slip:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //     6: astore_2       
        //     7: aload_0        
        //     8: getfield        AutoSell.Game25:Z
        //    11: ifeq            27
        //    14: getstatic       GameScr.isPaintTrade:Z
        //    17: ifne            26
        //    20: aload_1        
        //    21: ldc             "<\u0110ang giao d\u1ecbch v\u1edbi ng\u01b0\u1eddi kh\u00e1c. Mong b\u1ea1n ch\u1edd gi\u00e2y l\u00e1t>"
        //    23: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //    26: return         
        //    27: aload_2        
        //    28: iconst_0       
        //    29: aaload         
        //    30: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    33: ldc             "buy"
        //    35: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    38: ifeq            405
        //    41: new             LMyVector;
        //    44: dup            
        //    45: invokespecial   MyVector.<init>:()V
        //    48: astore_3       
        //    49: new             LMyVector;
        //    52: dup            
        //    53: invokespecial   MyVector.<init>:()V
        //    56: astore          4
        //    58: iconst_0       
        //    59: istore          5
        //    61: iconst_1       
        //    62: istore          6
        //    64: aload_2        
        //    65: arraylength    
        //    66: iconst_1       
        //    67: isub           
        //    68: istore          7
        //    70: goto            356
        //    73: aload_2        
        //    74: iload           6
        //    76: aaload         
        //    77: astore          8
        //    79: aload_2        
        //    80: iload           6
        //    82: iconst_1       
        //    83: iadd           
        //    84: aaload         
        //    85: astore          9
        //    87: aload           8
        //    89: invokestatic    AutoBuy.Game1:(Ljava/lang/String;)LRMS;
        //    92: dup            
        //    93: astore          10
        //    95: ifnull          106
        //    98: aload           10
        //   100: getfield        RMS.Game3:I
        //   103: ifgt            135
        //   106: aload_1        
        //   107: new             Ljava/lang/StringBuffer;
        //   110: dup            
        //   111: ldc             "<"
        //   113: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   116: aload           8
        //   118: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   121: ldc             " ko t\u1ed3n t\u1ea1i ho\u1eb7c mk ko b\u00e1n vp n\u00e0y>"
        //   123: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   126: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   129: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   132: goto            353
        //   135: aload           10
        //   137: getfield        RMS.Game3:I
        //   140: ifle            191
        //   143: aload           10
        //   145: getfield        RMS.Game1:LItemTemplate;
        //   148: getfield        ItemTemplate.id:S
        //   151: invokestatic    Char.QuetSLmuaBan:(I)I
        //   154: aload           10
        //   156: getfield        RMS.Game5:I
        //   159: if_icmpgt       191
        //   162: aload_1        
        //   163: new             Ljava/lang/StringBuffer;
        //   166: dup            
        //   167: ldc             "<"
        //   169: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   172: aload           8
        //   174: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   177: ldc             " h\u1ebft h\u00e0ng>"
        //   179: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   182: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   185: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   188: goto            353
        //   191: aload           9
        //   193: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   196: istore          11
        //   198: goto            231
        //   201: pop            
        //   202: aload_1        
        //   203: new             Ljava/lang/StringBuffer;
        //   206: dup            
        //   207: ldc             "<"
        //   209: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   212: aload           8
        //   214: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   217: ldc             " s\u1ed1 l\u01b0\u1ee3ng l\u1ed7i>"
        //   219: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   222: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   225: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   228: goto            353
        //   231: aload           10
        //   233: invokevirtual   RMS.Game4:()I
        //   236: iload           11
        //   238: if_icmpge       271
        //   241: aload_1        
        //   242: new             Ljava/lang/StringBuffer;
        //   245: dup            
        //   246: ldc             "<"
        //   248: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   251: aload           8
        //   253: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   256: ldc_w           " s\u1ed1 l\u01b0\u1ee3ng Item n\u00e0y hi\u1ec7n kh\u00f4ng \u0111\u1ee7>"
        //   259: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   262: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   265: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   268: goto            353
        //   271: aload           10
        //   273: getfield        RMS.Game1:LItemTemplate;
        //   276: getfield        ItemTemplate.isUpToUp:Z
        //   279: ifeq            286
        //   282: iconst_1       
        //   283: goto            288
        //   286: iload           11
        //   288: istore          12
        //   290: iload           5
        //   292: iload           12
        //   294: iadd           
        //   295: bipush          12
        //   297: if_icmple       330
        //   300: aload_1        
        //   301: new             Ljava/lang/StringBuffer;
        //   304: dup            
        //   305: ldc             "<"
        //   307: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   310: aload           8
        //   312: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   315: ldc_w           " s\u1ed1 l\u01b0\u1ee3ng \u0111\u1ea7y. VP sau s\u1ebd k dc t\u00ednh>"
        //   318: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   321: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   324: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   327: goto            363
        //   330: iload           5
        //   332: iload           12
        //   334: iadd           
        //   335: istore          5
        //   337: aload_3        
        //   338: aload           10
        //   340: invokevirtual   MyVector.addElement:(Ljava/lang/Object;)V
        //   343: aload           4
        //   345: iload           11
        //   347: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   350: invokevirtual   MyVector.addElement:(Ljava/lang/Object;)V
        //   353: iinc            6, 2
        //   356: iload           6
        //   358: iload           7
        //   360: if_icmple       73
        //   363: aload_3        
        //   364: invokevirtual   java/util/Vector.size:()I
        //   367: ifne            378
        //   370: aload_1        
        //   371: ldc_w           "<Giao d\u1ecbch r\u1ed7ng>"
        //   374: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   377: return         
        //   378: aload_0        
        //   379: aload_1        
        //   380: putfield        AutoSell.Game28:Ljava/lang/String;
        //   383: aload_0        
        //   384: iconst_0       
        //   385: putfield        AutoSell.MyLenga:Z
        //   388: aload_0        
        //   389: aload_3        
        //   390: putfield        AutoSell.Game29:LMyVector;
        //   393: aload_0        
        //   394: aload           4
        //   396: putfield        AutoSell.Game30:LMyVector;
        //   399: aload_0        
        //   400: iconst_1       
        //   401: putfield        AutoSell.Game25:Z
        //   404: return         
        //   405: aload_2        
        //   406: iconst_0       
        //   407: aaload         
        //   408: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   411: ldc_w           "mua"
        //   414: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   417: ifeq            783
        //   420: new             LMyVector;
        //   423: dup            
        //   424: invokespecial   MyVector.<init>:()V
        //   427: astore_3       
        //   428: new             LMyVector;
        //   431: dup            
        //   432: invokespecial   MyVector.<init>:()V
        //   435: astore          4
        //   437: iconst_0       
        //   438: istore          5
        //   440: iconst_1       
        //   441: istore          6
        //   443: aload_2        
        //   444: arraylength    
        //   445: iconst_1       
        //   446: isub           
        //   447: istore          7
        //   449: goto            734
        //   452: aload_2        
        //   453: iload           6
        //   455: aaload         
        //   456: astore          8
        //   458: aload_2        
        //   459: iload           6
        //   461: iconst_1       
        //   462: iadd           
        //   463: aaload         
        //   464: dup            
        //   465: astore          9
        //   467: invokestatic    AutoBuy.Game1:(Ljava/lang/String;)LRMS;
        //   470: dup            
        //   471: astore          10
        //   473: ifnull          484
        //   476: aload           10
        //   478: getfield        RMS.Game3:I
        //   481: ifgt            513
        //   484: aload_1        
        //   485: new             Ljava/lang/StringBuffer;
        //   488: dup            
        //   489: ldc             "<"
        //   491: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   494: aload           9
        //   496: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   499: ldc             " ko t\u1ed3n t\u1ea1i ho\u1eb7c mk ko b\u00e1n vp n\u00e0y>"
        //   501: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   504: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   507: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   510: goto            731
        //   513: aload           10
        //   515: getfield        RMS.Game3:I
        //   518: ifle            569
        //   521: aload           10
        //   523: getfield        RMS.Game1:LItemTemplate;
        //   526: getfield        ItemTemplate.id:S
        //   529: invokestatic    Char.QuetSLmuaBan:(I)I
        //   532: aload           10
        //   534: getfield        RMS.Game5:I
        //   537: if_icmpgt       569
        //   540: aload_1        
        //   541: new             Ljava/lang/StringBuffer;
        //   544: dup            
        //   545: ldc             "<"
        //   547: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   550: aload           9
        //   552: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   555: ldc             " h\u1ebft h\u00e0ng>"
        //   557: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   560: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   563: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   566: goto            731
        //   569: aload           8
        //   571: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   574: istore          11
        //   576: goto            609
        //   579: pop            
        //   580: aload_1        
        //   581: new             Ljava/lang/StringBuffer;
        //   584: dup            
        //   585: ldc             "<"
        //   587: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   590: aload           9
        //   592: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   595: ldc             " s\u1ed1 l\u01b0\u1ee3ng l\u1ed7i>"
        //   597: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   600: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   603: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   606: goto            731
        //   609: aload           10
        //   611: invokevirtual   RMS.Game4:()I
        //   614: iload           11
        //   616: if_icmpge       649
        //   619: aload_1        
        //   620: new             Ljava/lang/StringBuffer;
        //   623: dup            
        //   624: ldc             "<"
        //   626: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   629: aload           9
        //   631: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   634: ldc_w           " s\u1ed1 l\u01b0\u1ee3ng Item n\u00e0y hi\u1ec7n kh\u00f4ng \u0111\u1ee7>"
        //   637: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   640: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   643: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   646: goto            731
        //   649: aload           10
        //   651: getfield        RMS.Game1:LItemTemplate;
        //   654: getfield        ItemTemplate.isUpToUp:Z
        //   657: ifeq            664
        //   660: iconst_1       
        //   661: goto            666
        //   664: iload           11
        //   666: istore          12
        //   668: iload           5
        //   670: iload           12
        //   672: iadd           
        //   673: bipush          12
        //   675: if_icmple       708
        //   678: aload_1        
        //   679: new             Ljava/lang/StringBuffer;
        //   682: dup            
        //   683: ldc             "<"
        //   685: invokespecial   java/lang/StringBuffer.<init>:(Ljava/lang/String;)V
        //   688: aload           9
        //   690: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   693: ldc_w           " s\u1ed1 l\u01b0\u1ee3ng \u0111\u1ea7y. VP sau s\u1ebd k dc t\u00ednh>"
        //   696: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   699: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   702: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   705: goto            741
        //   708: iload           5
        //   710: iload           12
        //   712: iadd           
        //   713: istore          5
        //   715: aload_3        
        //   716: aload           10
        //   718: invokevirtual   MyVector.addElement:(Ljava/lang/Object;)V
        //   721: aload           4
        //   723: iload           11
        //   725: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   728: invokevirtual   MyVector.addElement:(Ljava/lang/Object;)V
        //   731: iinc            6, 2
        //   734: iload           6
        //   736: iload           7
        //   738: if_icmple       452
        //   741: aload_3        
        //   742: invokevirtual   java/util/Vector.size:()I
        //   745: ifne            756
        //   748: aload_1        
        //   749: ldc_w           "<Giao d\u1ecbch r\u1ed7ng>"
        //   752: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   755: return         
        //   756: aload_0        
        //   757: aload_1        
        //   758: putfield        AutoSell.Game28:Ljava/lang/String;
        //   761: aload_0        
        //   762: iconst_0       
        //   763: putfield        AutoSell.MyLenga:Z
        //   766: aload_0        
        //   767: aload_3        
        //   768: putfield        AutoSell.Game29:LMyVector;
        //   771: aload_0        
        //   772: aload           4
        //   774: putfield        AutoSell.Game30:LMyVector;
        //   777: aload_0        
        //   778: iconst_1       
        //   779: putfield        AutoSell.Game25:Z
        //   782: return         
        //   783: aload_2        
        //   784: iconst_0       
        //   785: aaload         
        //   786: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   789: ldc_w           "donate"
        //   792: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   795: ifeq            824
        //   798: aload_0        
        //   799: aload_1        
        //   800: putfield        AutoSell.Game28:Ljava/lang/String;
        //   803: aload_0        
        //   804: iconst_0       
        //   805: putfield        AutoSell.MyLenga:Z
        //   808: aload_0        
        //   809: aconst_null    
        //   810: putfield        AutoSell.Game29:LMyVector;
        //   813: aload_0        
        //   814: aconst_null    
        //   815: putfield        AutoSell.Game30:LMyVector;
        //   818: aload_0        
        //   819: iconst_1       
        //   820: putfield        AutoSell.Game25:Z
        //   823: return         
        //   824: aload_2        
        //   825: iconst_0       
        //   826: aaload         
        //   827: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   830: ldc_w           "sell"
        //   833: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   836: ifeq            883
        //   839: invokestatic    AutoBuy.Game3:()Z
        //   842: ifeq            876
        //   845: aload_0        
        //   846: aload_1        
        //   847: putfield        AutoSell.Game28:Ljava/lang/String;
        //   850: aload_0        
        //   851: iconst_1       
        //   852: putfield        AutoSell.MyLenga:Z
        //   855: aload_0        
        //   856: iconst_0       
        //   857: putfield        AutoSell.Thoigianchohoisinh:Z
        //   860: aload_0        
        //   861: aconst_null    
        //   862: putfield        AutoSell.Game29:LMyVector;
        //   865: aload_0        
        //   866: aconst_null    
        //   867: putfield        AutoSell.Game30:LMyVector;
        //   870: aload_0        
        //   871: iconst_1       
        //   872: putfield        AutoSell.Game25:Z
        //   875: return         
        //   876: aload_1        
        //   877: ldc             "<Hi\u1ec7n mk ko mua vp n\u00e0o>"
        //   879: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   882: return         
        //   883: aload_1        
        //   884: ldc_w           "<B\u00e1n h\u00e0ng t\u1ef1 \u0111\u1ed9ng v4 By Leo>"
        //   887: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   890: aload_1        
        //   891: ldc_w           "<Danh s\u00e1ch h\u00e0ng>"
        //   894: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   897: aload_1        
        //   898: invokestatic    AutoBuy.Game2:(Ljava/lang/String;)V
        //   901: aload_1        
        //   902: ldc_w           "<-------------------------->"
        //   905: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   908: aload_1        
        //   909: invokestatic    AutoBuy.Game3:(Ljava/lang/String;)V
        //   912: aload_1        
        //   913: ldc_w           "<-------------------------->"
        //   916: invokestatic    Code.Game1:(Ljava/lang/String;Ljava/lang/String;)V
        //   919: return         
        //    StackMapTable: 00 23 FF 00 1A 00 03 07 00 02 07 00 6E 07 01 24 00 00 00 FF 00 2D 00 08 07 00 02 07 00 6E 07 01 24 07 00 63 07 00 63 01 01 01 00 00 FE 00 20 07 00 6E 07 00 6E 07 00 E1 1C 37 49 07 00 CB FC 00 1D 01 27 0E 41 01 FC 00 29 01 F9 00 16 F8 00 02 06 0E FF 00 1A 00 03 07 00 02 07 00 6E 07 01 24 00 00 FF 00 2E 00 08 07 00 02 07 00 6E 07 01 24 07 00 63 07 00 63 01 01 01 00 00 FE 00 1F 07 00 6E 07 00 6E 07 00 E1 1C 37 49 07 00 CB FC 00 1D 01 27 0E 41 01 FC 00 29 01 F9 00 16 F8 00 02 06 0E FF 00 1A 00 03 07 00 02 07 00 6E 07 01 24 00 00 28 33 06
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  191    198    201    231    Ljava/lang/Exception;
        //  569    576    579    609    Ljava/lang/Exception;
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
    
    @Override
    public final void auto_D() {
        super.auto_D();
        super.iDMap = TileMap.mapID;
        super.khutheodanhsach = TileMap.zoneID;
        this.Game23 = Char.getMyChar().cx;
        this.Pk = Char.getMyChar().cy;
        this.Game31 = 0L;
        this.Game25 = false;
        AutoBuy.Game1 = -1;
    }
    
    private void Game5(final Char char1) {
        final Item[] arrItemTradeMe = new Item[12];
        AutoSell.cx2 = false;
        if (!this.Thoigianchohoisinh) {
            if (!Char.gotoTOChar(char1.cx, char1.cy)) {
                Code.Game1(this.Game28, "<H\u00e3y \u0111\u1ee9ng \u1edf n\u01a1i d\u1ec5 GD>");
                return;
            }
            Service.gI().tradeInvite(char1.charID);
            if (!LockGame.LockSell()) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                    Thread.sleep(1000L);
                }
                Code.Game1(this.Game28, "<H\u00e3y \u0111\u1ed3ng \u00fd giao d\u1ecbch>");
                return;
            }
        }
        else {
            final long currentTimeMillis = System.currentTimeMillis();
            while (!GameScr.isPaintTrade || System.currentTimeMillis() - currentTimeMillis >= 10000L) {
                Thread.sleep(1000L);
            }
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        while (GameScr.gI().typeTradeOrder != 1) {
            if (AutoSell.cx2 || System.currentTimeMillis() - currentTimeMillis2 >= 20000L) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                    Thread.sleep(1000L);
                }
                Code.Game1(this.Game28, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                return;
            }
            Thread.sleep(200L);
        }
        final MyVector myVector = new MyVector();
        final MyVector myVector2 = new MyVector();
        for (int i = 0; i < GameScr.arrItemTradeOrder.length; ++i) {
            if (GameScr.arrItemTradeOrder[i] != null) {
                final RMS game1;
                if ((game1 = AutoBuy.Game1(GameScr.arrItemTradeOrder[i].template.id)) == null || !game1.Game3()) {
                    if (GameScr.isPaintTrade) {
                        Service.gI().cancelTrade();
                        Thread.sleep(1000L);
                    }
                    Code.Game1(this.Game28, new StringBuffer("<Item ").append(i).append(": b\u1ea1n \u0111\u00e3 GD vp mk ko mua>").toString());
                    return;
                }
                final int j = GameScr.arrItemTradeOrder[i].template.isUpToUp ? GameScr.arrItemTradeOrder[i].indexUI : 1;
                if (myVector.contains(game1)) {
                    final int index = myVector.indexOf(game1);
                    myVector2.setElementAt((int)myVector2.elementAt(index) + j, index);
                }
                else {
                    myVector.addElement(game1);
                    myVector2.addElement(j);
                }
            }
        }
        if (myVector.size() == 0) {
            if (GameScr.isPaintTrade) {
                Service.gI().cancelTrade();
                Thread.sleep(1000L);
            }
            Code.Game1(this.Game28, "<Giao d\u1ecbch tr\u1ed1ng>");
            return;
        }
        int coinTrade = 0;
        for (int k = 0; k < myVector.size(); ++k) {
            final RMS rms = (RMS)myVector.elementAt(k);
            final int intValue = (int)myVector2.elementAt(k);
            if (Char.QuetSLmuaBan(rms.Game1.id) + intValue > rms.Game8) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                    Thread.sleep(1000L);
                }
                Code.Game1(this.Game28, new StringBuffer("<").append(rms.Game1.name).append(" b\u1ea1n \u0111\u00e1 b\u00e1n qu\u00e1 s\u1ed1 mk c\u1ea7n mua>").toString());
                return;
            }
            coinTrade += intValue * rms.Game7 * 1000 / rms.Game6;
        }
        if (coinTrade > Char.getMyChar().xu) {
            if (GameScr.isPaintTrade) {
                Service.gI().cancelTrade();
            }
            Code.Game1(this.Game28, "<Hi\u1ec7n mk ko \u0111\u1ee7 xu, xin b\u1ea1n quay l\u1ea1i sau>");
            return;
        }
        GameScr.gI().coinTrade = coinTrade;
        GameScr.arrItemTradeMe = arrItemTradeMe;
        Service.gI().tradeItemLock(coinTrade, arrItemTradeMe);
        GameScr.gI().typeTrade = 1;
        final long currentTimeMillis3 = System.currentTimeMillis();
        while (System.currentTimeMillis() - currentTimeMillis3 < 5000L) {
            if (AutoSell.cx2) {
                Code.Game1(this.Game28, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                return;
            }
            Thread.sleep(200L);
        }
        Service.gI().tradeAccept();
        GameScr.gI().typeTrade = 2;
        while (GameScr.gI().coinTrade < 2) {
            if (AutoSell.cx2 || System.currentTimeMillis() - currentTimeMillis3 >= 20000L) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                    Thread.sleep(1000L);
                }
                Code.Game1(this.Game28, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                return;
            }
            Thread.sleep(200L);
        }
    }
    
    private void Game6(final Char char1) {
        final Item[] array = new Item[12];
        int n = 0;
        int n2 = 0;
        boolean b = false;
        if (this.Game29 != null) {
            for (int i = 0; i < this.Game29.size(); ++i) {
                final RMS rms = (RMS)this.Game29.elementAt(i);
                final int intValue = (int)this.Game30.elementAt(i);
                if (rms.Game1.isUpToUp) {
                    final Item kiemTraiditem21;
                    if ((kiemTraiditem21 = Char.KiemTraiditem21(rms.Game1.id)) == null) {
                        Code.Game1(this.Game28, "<Xin l\u1ed7i, c\u00f3 l\u1ed7i ch\u1ecdn item>");
                        return;
                    }
                    Service.gI().inputNumSplit(kiemTraiditem21.indexUI, intValue);
                    LockGame.LockSellBuy();
                    final Item ktslItemBan;
                    if ((ktslItemBan = Char.KTSLItemBan(rms.Game1.id, intValue)) == null) {
                        Code.Game1(this.Game28, "<Xin l\u1ed7i, c\u00f3 l\u1ed7i ch\u1ecdn item>");
                        return;
                    }
                    array[n++] = ktslItemBan;
                    b = true;
                }
                else {
                    final Char myChar = Char.getMyChar();
                    int j = 0;
                    int k = 0;
                Label_0250:
                    while (j < intValue) {
                        while (k < myChar.arrItemBag.length) {
                            final Item item;
                            if ((item = myChar.arrItemBag[k]) != null && item.template.id == rms.Game1.id) {
                                array[n++] = item;
                                ++k;
                                ++j;
                                continue Label_0250;
                            }
                            ++k;
                        }
                        Code.Game1(this.Game28, "<Xin l\u1ed7i, c\u00f3 l\u1ed7i ch\u1ecdn item>");
                        return;
                    }
                }
                n2 += intValue * rms.Game4 * 1000 / rms.Game3;
            }
            if (n2 == 0) {
                n2 = 1;
            }
        }
        AutoSell.cx2 = false;
        if (!Char.gotoTOChar(char1.cx, char1.cy)) {
            Code.Game1(this.Game28, "<H\u00e3y \u0111\u1ee9ng \u1edf n\u01a1i d\u1ec5 GD>");
            if (b) {
                Service.gI().bagSort();
                LockGame.LockSellBuy();
            }
            return;
        }
        Service.gI().tradeInvite(char1.charID);
        if (!LockGame.LockSell()) {
            if (GameScr.isPaintTrade) {
                Service.gI().cancelTrade();
                Thread.sleep(1000L);
            }
            if (b) {
                Service.gI().bagSort();
                LockGame.LockSellBuy();
            }
            Code.Game1(this.Game28, "<H\u00e3y \u0111\u1ed3ng \u00fd giao d\u1ecbch>");
            return;
        }
        GameScr.gI().coinTrade = 0;
        GameScr.arrItemTradeMe = new Item[12];
        for (int l = 0; l < 12; ++l) {
            GameScr.arrItemTradeMe[l] = array[l];
            if (array[l] != null && array[l].indexUI >= 0 && array[l].indexUI < Char.getMyChar().arrItemBag.length) {
                Char.getMyChar().arrItemBag[array[l].indexUI] = null;
            }
        }
        Service.gI().tradeItemLock(0, array);
        GameScr.gI().typeTrade = 1;
        final long currentTimeMillis = System.currentTimeMillis();
        while (GameScr.gI().typeTradeOrder != 1) {
            if (AutoSell.cx2 || System.currentTimeMillis() - currentTimeMillis >= 20000L) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                    Thread.sleep(1000L);
                }
                if (b) {
                    Service.gI().bagSort();
                    LockGame.LockSellBuy();
                }
                Code.Game1(this.Game28, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                return;
            }
            Thread.sleep(200L);
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        if (GameScr.gI().coinTradeOrder < n2) {
            if (GameScr.isPaintTrade) {
                Service.gI().cancelTrade();
                Thread.sleep(1000L);
            }
            if (b) {
                Service.gI().bagSort();
                LockGame.LockSellBuy();
            }
            Code.Game1(this.Game28, "<Kh\u00f4ng \u0111\u1ee7 xu>");
            return;
        }
        for (int n3 = 0; n3 < GameScr.arrItemTradeOrder.length; ++n3) {
            if (GameScr.arrItemTradeOrder[n3] != null && AutoBuy.Game1(GameScr.arrItemTradeOrder[n3].template.id) == null) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                    Thread.sleep(1000L);
                }
                if (b) {
                    Service.gI().bagSort();
                    LockGame.LockSellBuy();
                }
                Code.Game1(this.Game28, "<Ch\u1ec9 GD xu>");
                return;
            }
        }
        while (System.currentTimeMillis() - currentTimeMillis2 < 6000L) {
            if (AutoSell.cx2) {
                if (b) {
                    Service.gI().bagSort();
                    LockGame.LockSellBuy();
                }
                Code.Game1(this.Game28, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                return;
            }
            Thread.sleep(200L);
        }
        Service.gI().tradeAccept();
        GameScr.gI().typeTrade = 2;
        while (GameScr.gI().typeTradeOrder < 2) {
            if (AutoSell.cx2 || System.currentTimeMillis() - currentTimeMillis2 >= 20000L) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                    Thread.sleep(1000L);
                }
                if (b) {
                    Service.gI().bagSort();
                    LockGame.LockSellBuy();
                }
                Code.Game1(this.Game28, "<H\u00e3y giao d\u1ecbch l\u1ea1i>");
                return;
            }
            Thread.sleep(200L);
        }
    }
}
