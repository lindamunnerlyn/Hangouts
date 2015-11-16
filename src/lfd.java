// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lfd
{

    private static final double e[];
    public int a;
    private char b;
    private CharSequence c;
    private int d;

    public lfd(CharSequence charsequence)
    {
        c = charsequence;
        a = 0;
        d = charsequence.length();
        b = charsequence.charAt(0);
    }

    private static void a(char c1)
    {
        throw new RuntimeException((new StringBuilder(20)).append("Unexpected char '").append(c1).append("'.").toString());
    }

    private char d()
    {
        if (a < d)
        {
            a = a + 1;
        }
        if (a == d)
        {
            return '\0';
        } else
        {
            return c.charAt(a);
        }
    }

    public void a()
    {
        for (; a < d && Character.isWhitespace(c.charAt(a)); b()) { }
    }

    public void b()
    {
        b = d();
    }

    public float c()
    {
        int l1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag4 = true;
        flag2 = true;
        flag3 = true;
        l1 = 0;
        flag1 = false;
        a();
        b;
        JVM INSTR tableswitch 43 45: default 48
    //                   43 1519
    //                   44 48
    //                   45 186;
           goto _L1 _L2 _L1 _L3
_L1:
        boolean flag = true;
_L11:
        b;
        JVM INSTR tableswitch 46 57: default 116
    //                   46 204
    //                   47 116
    //                   48 325
    //                   49 472
    //                   50 472
    //                   51 472
    //                   52 472
    //                   53 472
    //                   54 472
    //                   55 472
    //                   56 472
    //                   57 472;
           goto _L4 _L5 _L4 _L6 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7
_L4:
        float f = (0.0F / 0.0F);
_L18:
        if (a >= d) goto _L9; else goto _L8
_L8:
        c.charAt(a);
        JVM INSTR lookupswitch 4: default 184
    //                   9: 1492
    //                   10: 1492
    //                   32: 1492
    //                   44: 1492;
           goto _L9 _L10 _L10 _L10 _L10
_L9:
        return f;
_L3:
        int i = 0;
_L41:
        b = d();
        flag = i;
          goto _L11
_L5:
        int j;
        int k;
        int k1;
        i = 0;
        k1 = 0;
        k = 0;
        j = 0;
_L21:
        int i1;
        int j1;
        j1 = i;
        i1 = j;
        if (b != '.') goto _L13; else goto _L12
_L12:
        b = d();
        b;
        JVM INSTR tableswitch 48 57: default 300
    //                   48 627
    //                   49 1516
    //                   50 1516
    //                   51 1516
    //                   52 1516
    //                   53 1516
    //                   54 1516
    //                   55 1516
    //                   56 1516
    //                   57 1516;
           goto _L14 _L15 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16
_L14:
        j1 = i;
        i1 = j;
        if (k1 != 0) goto _L13; else goto _L17
_L17:
        a(b);
        f = 0.0F;
          goto _L18
_L6:
        b = d();
        b;
        JVM INSTR lookupswitch 13: default 452
    //                   46: 457
    //                   48: 325
    //                   49: 472
    //                   50: 472
    //                   51: 472
    //                   52: 472
    //                   53: 472
    //                   54: 472
    //                   55: 472
    //                   56: 472
    //                   57: 472
    //                   69: 457
    //                   101: 457;
           goto _L19 _L20 _L6 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L20 _L20
_L19:
        f = 0.0F;
          goto _L18
_L20:
        i = 0;
        k1 = 1;
        k = 0;
        j = 0;
          goto _L21
_L7:
        j1 = 0;
        k1 = 0;
        i1 = 0;
label0:
        do
        {
            if (k1 < 9)
            {
                j = k1 + 1;
                k = i1 * 10 + (b - 48);
                i = j1;
            } else
            {
                i = j1 + 1;
                j = k1;
                k = i1;
            }
            b = d();
            j1 = i;
            k1 = j;
            i1 = k;
            switch (b)
            {
            default:
                i1 = k;
                break label0;

            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
            case 57: // '9'
                break;
            }
        } while (true);
        k1 = 1;
        k = j;
        j = i1;
          goto _L21
_L15:
        if (k != 0) goto _L16; else goto _L22
_L22:
        i1 = i;
_L24:
        b = d();
        i = i1 - 1;
        i1 = i;
        b;
        JVM INSTR tableswitch 48 57: default 712
    //                   48 636
    //                   49 730
    //                   50 730
    //                   51 730
    //                   52 730
    //                   53 730
    //                   54 730
    //                   55 730
    //                   56 730
    //                   57 730;
           goto _L23 _L24 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16
_L23:
        j1 = i;
        i1 = j;
        if (k1 != 0) goto _L13; else goto _L25
_L25:
        f = 0.0F;
          goto _L18
_L16:
label1:
        while (true) 
        {
            j1 = i;
            k1 = k;
            i1 = j;
            if (k < 9)
            {
                k1 = k + 1;
                i1 = j * 10 + (b - 48);
                j1 = i - 1;
            }
            b = d();
            i = j1;
            k = k1;
            j = i1;
            switch (b)
            {
            default:
                break label1;

            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
            case 57: // '9'
                break;
            }
        }
_L13:
        b;
        JVM INSTR lookupswitch 2: default 888
    //                   69: 944
    //                   101: 944;
           goto _L26 _L27 _L27
_L26:
        i = ((flag3) ? 1 : 0);
        j = ((flag1) ? 1 : 0);
_L35:
        int l = j;
        if (i == 0)
        {
            l = -j;
        }
        l += j1;
        if (!flag)
        {
            i = -i1;
        } else
        {
            i = i1;
        }
        if (l < -125 || i == 0)
        {
            f = 0.0F;
        } else
        {
            if (l >= 128)
            {
                if (i > 0)
                {
                    f = (1.0F / 0.0F);
                } else
                {
                    f = (-1.0F / 0.0F);
                }
            } else
            if (l == 0)
            {
                f = i;
            } else
            {
                j = i;
                if (i >= 0x4000000)
                {
                    j = i + 1;
                }
                double d1;
                if (l > 0)
                {
                    d1 = j;
                    d1 = e[l] * d1;
                } else
                {
                    d1 = (double)j / e[-l];
                }
                f = (float)d1;
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L18
_L27:
        b = d();
        j = ((flag4) ? 1 : 0);
        i = ((flag2) ? 1 : 0);
        b;
        JVM INSTR tableswitch 43 57: default 1040
    //                   43 1055
    //                   44 1040
    //                   45 1052
    //                   46 1040
    //                   47 1040
    //                   48 1136
    //                   49 1136
    //                   50 1136
    //                   51 1136
    //                   52 1136
    //                   53 1136
    //                   54 1136
    //                   55 1136
    //                   56 1136
    //                   57 1136;
           goto _L28 _L29 _L28 _L30 _L28 _L28 _L31 _L31 _L31 _L31 _L31 _L31 _L31 _L31 _L31 _L31
_L28:
        a(b);
        f = 0.0F;
          goto _L18
_L30:
        j = 0;
_L29:
        b = d();
        i = j;
        switch (b)
        {
        default:
            a(b);
            f = 0.0F;
            continue; /* Loop/switch isn't completed */

        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
            break;
        }
_L31:
        b;
        JVM INSTR tableswitch 48 57: default 1196
    //                   48 1203
    //                   49 1506
    //                   50 1506
    //                   51 1506
    //                   52 1506
    //                   53 1506
    //                   54 1506
    //                   55 1506
    //                   56 1506
    //                   57 1506;
           goto _L32 _L33 _L34 _L34 _L34 _L34 _L34 _L34 _L34 _L34 _L34
_L32:
        j = ((flag1) ? 1 : 0);
          goto _L35
_L33:
        b = d();
        b;
        JVM INSTR tableswitch 48 57: default 1268
    //                   48 1203
    //                   49 1275
    //                   50 1275
    //                   51 1275
    //                   52 1275
    //                   53 1275
    //                   54 1275
    //                   55 1275
    //                   56 1275
    //                   57 1275;
           goto _L36 _L33 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37
_L36:
        j = ((flag1) ? 1 : 0);
          goto _L35
_L37:
        j = 0;
        k1 = l1;
_L39:
        l1 = k1;
        l = j;
        if (k1 < 3)
        {
            l1 = k1 + 1;
            l = j * 10 + (b - 48);
        }
        b = d();
        k1 = l1;
        j = l;
        b;
        JVM INSTR tableswitch 48 57: default 1392
    //                   48 1282
    //                   49 1282
    //                   50 1282
    //                   51 1282
    //                   52 1282
    //                   53 1282
    //                   54 1282
    //                   55 1282
    //                   56 1282
    //                   57 1282;
           goto _L38 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39
_L38:
        j = l;
          goto _L35
_L10:
        b();
        continue; /* Loop/switch isn't completed */
_L34:
        j = 0;
        k1 = l1;
          goto _L39
        if (true) goto _L18; else goto _L40
_L40:
_L2:
        i = 1;
          goto _L41
    }

    static 
    {
        e = new double[128];
        for (int i = 0; i < e.length; i++)
        {
            e[i] = Math.pow(10D, i);
        }

    }
}
