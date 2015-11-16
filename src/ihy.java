// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihy extends koj
{

    public int a[];
    public int b[];
    public Boolean c;
    public Boolean d;

    public ihy()
    {
        a = kou.a;
        b = kou.a;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int i;
        int k;
        if (a != null && a.length > 0)
        {
            i = 0;
            int j = 0;
            for (; i < a.length; i++)
            {
                j += koh.e(a[i]);
            }

            i = l + j + a.length * 1;
        } else
        {
            i = l;
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                l = 0;
                for (k = ((flag) ? 1 : 0); k < b.length; k++)
                {
                    l += koh.e(b[k]);
                }

                k = i + l + b.length * 1;
            }
        }
        i = k;
        if (c != null)
        {
            c.booleanValue();
            i = k + (koh.f(3) + 1);
        }
        k = i;
        if (d != null)
        {
            d.booleanValue();
            k = i + (koh.f(4) + 1);
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
_L36:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 76
    //                   0: 86
    //                   8: 88
    //                   10: 364
    //                   16: 746
    //                   18: 1592
    //                   24: 3118
    //                   32: 3132;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int ai[];
        int j;
        int i1;
        i1 = kou.b(kog1, 8);
        ai = new int[i1];
        j = 0;
        i = 0;
_L15:
        if (j >= i1) goto _L10; else goto _L9
_L9:
        int j1;
        if (j != 0)
        {
            kog1.a();
        }
        j1 = kog1.f();
        j1;
        JVM INSTR lookupswitch 13: default 248
    //                   0: 257
    //                   1: 257
    //                   2: 257
    //                   3: 257
    //                   5: 257
    //                   6: 257
    //                   7: 257
    //                   8: 257
    //                   9: 257
    //                   1001: 257
    //                   1002: 257
    //                   1003: 257
    //                   1004: 257;
           goto _L11 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12
_L11:
        j++;
          goto _L13
_L12:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L11; else goto _L13
_L13:
        if (true) goto _L15; else goto _L14
_L14:
_L10:
        if (i != 0)
        {
            if (a == null)
            {
                j = 0;
            } else
            {
                j = a.length;
            }
            if (j == 0 && i == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                a = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l;
        l = kog1.c(kog1.p());
        i = kog1.r();
        j = 0;
_L21:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 1001: 
            case 1002: 
            case 1003: 
            case 1004: 
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L17; else goto _L16
_L16:
        kog1.e(i);
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ai, 0, i);
            j = i;
        }
_L19:
        if (kog1.q() > 0)
        {
            i = kog1.f();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 1001: 
            case 1002: 
            case 1003: 
            case 1004: 
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
          goto _L17
        if (true) goto _L19; else goto _L18
_L18:
        if (true) goto _L21; else goto _L20
_L20:
_L17:
        kog1.d(l);
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = kou.b(kog1, 16);
        ai = new int[i1];
        j = 0;
        i = 0;
_L28:
        if (j >= i1) goto _L23; else goto _L22
_L22:
        if (j != 0)
        {
            kog1.a();
        }
        j1 = kog1.f();
        j1;
        JVM INSTR tableswitch 0 167: default 1476
    //                   0 1485
    //                   1 1476
    //                   2 1476
    //                   3 1476
    //                   4 1476
    //                   5 1476
    //                   6 1476
    //                   7 1476
    //                   8 1485
    //                   9 1476
    //                   10 1476
    //                   11 1476
    //                   12 1476
    //                   13 1476
    //                   14 1476
    //                   15 1476
    //                   16 1476
    //                   17 1476
    //                   18 1476
    //                   19 1485
    //                   20 1485
    //                   21 1485
    //                   22 1476
    //                   23 1476
    //                   24 1476
    //                   25 1476
    //                   26 1476
    //                   27 1476
    //                   28 1476
    //                   29 1476
    //                   30 1476
    //                   31 1476
    //                   32 1476
    //                   33 1476
    //                   34 1476
    //                   35 1476
    //                   36 1476
    //                   37 1476
    //                   38 1476
    //                   39 1476
    //                   40 1476
    //                   41 1476
    //                   42 1476
    //                   43 1476
    //                   44 1476
    //                   45 1476
    //                   46 1476
    //                   47 1476
    //                   48 1476
    //                   49 1476
    //                   50 1476
    //                   51 1476
    //                   52 1476
    //                   53 1476
    //                   54 1476
    //                   55 1476
    //                   56 1476
    //                   57 1476
    //                   58 1476
    //                   59 1476
    //                   60 1476
    //                   61 1476
    //                   62 1476
    //                   63 1476
    //                   64 1476
    //                   65 1476
    //                   66 1476
    //                   67 1476
    //                   68 1476
    //                   69 1476
    //                   70 1476
    //                   71 1476
    //                   72 1476
    //                   73 1476
    //                   74 1476
    //                   75 1476
    //                   76 1476
    //                   77 1476
    //                   78 1476
    //                   79 1476
    //                   80 1476
    //                   81 1476
    //                   82 1476
    //                   83 1476
    //                   84 1476
    //                   85 1476
    //                   86 1476
    //                   87 1476
    //                   88 1476
    //                   89 1476
    //                   90 1476
    //                   91 1476
    //                   92 1476
    //                   93 1476
    //                   94 1476
    //                   95 1476
    //                   96 1476
    //                   97 1476
    //                   98 1476
    //                   99 1476
    //                   100 1485
    //                   101 1485
    //                   102 1485
    //                   103 1485
    //                   104 1485
    //                   105 1485
    //                   106 1485
    //                   107 1485
    //                   108 1485
    //                   109 1485
    //                   110 1485
    //                   111 1485
    //                   112 1485
    //                   113 1485
    //                   114 1485
    //                   115 1485
    //                   116 1485
    //                   117 1485
    //                   118 1485
    //                   119 1485
    //                   120 1485
    //                   121 1485
    //                   122 1485
    //                   123 1485
    //                   124 1485
    //                   125 1485
    //                   126 1485
    //                   127 1485
    //                   128 1485
    //                   129 1485
    //                   130 1485
    //                   131 1485
    //                   132 1485
    //                   133 1485
    //                   134 1485
    //                   135 1485
    //                   136 1485
    //                   137 1485
    //                   138 1485
    //                   139 1485
    //                   140 1485
    //                   141 1485
    //                   142 1485
    //                   143 1485
    //                   144 1485
    //                   145 1485
    //                   146 1485
    //                   147 1485
    //                   148 1485
    //                   149 1485
    //                   150 1485
    //                   151 1485
    //                   152 1485
    //                   153 1485
    //                   154 1485
    //                   155 1485
    //                   156 1485
    //                   157 1485
    //                   158 1485
    //                   159 1485
    //                   160 1485
    //                   161 1485
    //                   162 1485
    //                   163 1485
    //                   164 1485
    //                   165 1485
    //                   166 1485
    //                   167 1485;
           goto _L24 _L25 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L25 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L25 _L25 _L25 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L24 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25
_L24:
        j++;
          goto _L26
_L25:
        l = i + 1;
        ai[i] = j1;
        i = l;
        if (true) goto _L24; else goto _L26
_L26:
        if (true) goto _L28; else goto _L27
_L27:
_L23:
        if (i != 0)
        {
            if (b == null)
            {
                j = 0;
            } else
            {
                j = b.length;
            }
            if (j == 0 && i == ai.length)
            {
                b = ai;
            } else
            {
                int ai2[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(b, 0, ai2, 0, j);
                }
                System.arraycopy(ai, 0, ai2, j, i);
                b = ai2;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        l = kog1.c(kog1.p());
        i = kog1.r();
        j = 0;
_L34:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 8: // '\b'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 100: // 'd'
            case 101: // 'e'
            case 102: // 'f'
            case 103: // 'g'
            case 104: // 'h'
            case 105: // 'i'
            case 106: // 'j'
            case 107: // 'k'
            case 108: // 'l'
            case 109: // 'm'
            case 110: // 'n'
            case 111: // 'o'
            case 112: // 'p'
            case 113: // 'q'
            case 114: // 'r'
            case 115: // 's'
            case 116: // 't'
            case 117: // 'u'
            case 118: // 'v'
            case 119: // 'w'
            case 120: // 'x'
            case 121: // 'y'
            case 122: // 'z'
            case 123: // '{'
            case 124: // '|'
            case 125: // '}'
            case 126: // '~'
            case 127: // '\177'
            case 128: 
            case 129: 
            case 130: 
            case 131: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 137: 
            case 138: 
            case 139: 
            case 140: 
            case 141: 
            case 142: 
            case 143: 
            case 144: 
            case 145: 
            case 146: 
            case 147: 
            case 148: 
            case 149: 
            case 150: 
            case 151: 
            case 152: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 167: 
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L30; else goto _L29
_L29:
        kog1.e(i);
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ai, 0, i);
            j = i;
        }
_L32:
        if (kog1.q() > 0)
        {
            i = kog1.f();
            switch (i)
            {
            case 0: // '\0'
            case 8: // '\b'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 100: // 'd'
            case 101: // 'e'
            case 102: // 'f'
            case 103: // 'g'
            case 104: // 'h'
            case 105: // 'i'
            case 106: // 'j'
            case 107: // 'k'
            case 108: // 'l'
            case 109: // 'm'
            case 110: // 'n'
            case 111: // 'o'
            case 112: // 'p'
            case 113: // 'q'
            case 114: // 'r'
            case 115: // 's'
            case 116: // 't'
            case 117: // 'u'
            case 118: // 'v'
            case 119: // 'w'
            case 120: // 'x'
            case 121: // 'y'
            case 122: // 'z'
            case 123: // '{'
            case 124: // '|'
            case 125: // '}'
            case 126: // '~'
            case 127: // '\177'
            case 128: 
            case 129: 
            case 130: 
            case 131: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 137: 
            case 138: 
            case 139: 
            case 140: 
            case 141: 
            case 142: 
            case 143: 
            case 144: 
            case 145: 
            case 146: 
            case 147: 
            case 148: 
            case 149: 
            case 150: 
            case 151: 
            case 152: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 167: 
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L30
        if (true) goto _L32; else goto _L31
_L31:
        if (true) goto _L34; else goto _L33
_L33:
_L30:
        kog1.d(l);
        continue; /* Loop/switch isn't completed */
_L7:
        c = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        d = Boolean.valueOf(kog1.i());
        if (true) goto _L36; else goto _L35
_L35:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                koh1.a(1, a[i]);
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                koh1.a(2, b[j]);
            }

        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        super.writeTo(koh1);
    }
}
