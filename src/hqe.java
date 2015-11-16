// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hqe extends koj
{

    public int a[];
    public Integer b;
    public hqf c;
    public Integer d;
    public Integer e;
    public Integer f;
    public hqg g;

    public hqe()
    {
        a = kou.a;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = 0;
        int k = super.computeSerializedSize();
        int j;
        if (a != null && a.length > 0)
        {
            j = 0;
            for (; i < a.length; i++)
            {
                j += koh.e(a[i]);
            }

            j = k + j + a.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (b != null)
        {
            i = j + koh.e(8, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(14, c);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(15, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + koh.e(16, e.intValue());
        }
        i = j;
        if (f != null)
        {
            i = j + koh.e(17, f.intValue());
        }
        j = i;
        if (g != null)
        {
            j = i + koh.d(18, g);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L11:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 9: default 92
    //                   0: 102
    //                   56: 104
    //                   58: 324
    //                   64: 594
    //                   114: 639
    //                   120: 668
    //                   128: 719
    //                   136: 767
    //                   146: 815;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        int ai[];
        int j1;
        int i2;
        i2 = kou.b(kog1, 56);
        ai = new int[i2];
        j1 = 0;
        i = 0;
_L18:
        if (j1 >= i2) goto _L13; else goto _L12
_L12:
        int j2;
        if (j1 != 0)
        {
            kog1.a();
        }
        j2 = kog1.f();
        j2;
        JVM INSTR tableswitch 0 10: default 208
    //                   0 217
    //                   1 217
    //                   2 217
    //                   3 217
    //                   4 217
    //                   5 217
    //                   6 217
    //                   7 217
    //                   8 217
    //                   9 217
    //                   10 217;
           goto _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15
_L14:
        j1++;
          goto _L16
_L15:
        int k1 = i + 1;
        ai[i] = j2;
        i = k1;
        if (true) goto _L14; else goto _L16
_L16:
        if (true) goto _L18; else goto _L17
_L17:
_L13:
        if (i != 0)
        {
            if (a == null)
            {
                j1 = 0;
            } else
            {
                j1 = a.length;
            }
            if (j1 == 0 && i == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[j1 + i];
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, j1);
                }
                System.arraycopy(ai, 0, ai1, j1, i);
                a = ai1;
            }
        }
          goto _L11
_L4:
        int l1;
        l1 = kog1.c(kog1.p());
        i = kog1.r();
        j1 = 0;
_L24:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 0) goto _L20; else goto _L19
_L19:
        kog1.e(i);
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ai = new int[j1 + i];
        j1 = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ai, 0, i);
            j1 = i;
        }
_L22:
        if (kog1.q() > 0)
        {
            i = kog1.f();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
                ai[j1] = i;
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
          goto _L20
        if (true) goto _L22; else goto _L21
_L21:
        if (true) goto _L24; else goto _L23
_L23:
_L20:
        kog1.d(l1);
          goto _L11
_L5:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (c == null)
        {
            c = new hqf();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L7:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            e = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        int i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (g == null)
        {
            g = new hqg();
        }
        kog1.a(g);
        if (true) goto _L11; else goto _L25
_L25:
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                koh1.a(7, a[i]);
            }

        }
        if (b != null)
        {
            koh1.a(8, b.intValue());
        }
        if (c != null)
        {
            koh1.b(14, c);
        }
        if (d != null)
        {
            koh1.a(15, d.intValue());
        }
        if (e != null)
        {
            koh1.a(16, e.intValue());
        }
        if (f != null)
        {
            koh1.a(17, f.intValue());
        }
        if (g != null)
        {
            koh1.b(18, g);
        }
        super.writeTo(koh1);
    }
}
