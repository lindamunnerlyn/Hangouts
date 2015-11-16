// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class irc extends koj
{

    public Integer a;
    public Long b;
    public Integer c;
    public int d[];
    public ivz e;
    public iuy f;
    public izv g;
    public Long h;
    public Long i;
    public Long j;
    public Integer k;
    public Boolean l;
    public ird m[];
    public Integer n;
    public izi o;

    public irc()
    {
        a = null;
        b = null;
        c = null;
        d = kou.a;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = ird.a();
        n = null;
        o = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.d(2, b.longValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.d(7, g);
        }
        int k1 = j1;
        if (a != null)
        {
            k1 = j1 + koh.e(8, a.intValue());
        }
        i1 = k1;
        if (c != null)
        {
            i1 = k1 + koh.e(9, c.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                j1 = 0;
                k1 = 0;
                for (; j1 < d.length; j1++)
                {
                    k1 += koh.e(d[j1]);
                }

                j1 = i1 + k1 + d.length * 1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.d(11, e);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.d(12, h.longValue());
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(13, j.longValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.d(14, i.longValue());
        }
        k1 = j1;
        if (k != null)
        {
            k1 = j1 + koh.e(15, k.intValue());
        }
        i1 = k1;
        if (l != null)
        {
            l.booleanValue();
            i1 = k1 + (koh.f(16) + 1);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= m.length)
                    {
                        break;
                    }
                    ird ird1 = m[l1];
                    j1 = i1;
                    if (ird1 != null)
                    {
                        j1 = i1 + koh.d(17, ird1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.e(18, n.intValue());
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.d(19, f);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.d(20, o);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L19:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 17: default 156
    //                   0: 166
    //                   16: 168
    //                   58: 182
    //                   64: 211
    //                   72: 263
    //                   80: 319
    //                   82: 504
    //                   90: 710
    //                   96: 739
    //                   104: 753
    //                   112: 767
    //                   120: 781
    //                   128: 831
    //                   138: 845
    //                   144: 977
    //                   154: 1031
    //                   162: 1060;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        b = Long.valueOf(kog1.d());
          goto _L19
_L4:
        if (g == null)
        {
            g = new izv();
        }
        kog1.a(g);
          goto _L19
_L5:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = kog1.f();
        switch (i1)
        {
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
            c = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int ai[];
        int i2;
        int i3;
        i3 = kou.b(kog1, 80);
        ai = new int[i3];
        i2 = 0;
        i1 = 0;
_L25:
        if (i2 >= i3) goto _L21; else goto _L20
_L20:
        int j3;
        if (i2 != 0)
        {
            kog1.a();
        }
        j3 = kog1.f();
        j3;
        JVM INSTR tableswitch 0 2: default 388
    //                   0 397
    //                   1 397
    //                   2 397;
           goto _L22 _L23 _L23 _L23
_L22:
        i2++;
        continue; /* Loop/switch isn't completed */
_L23:
        int k2 = i1 + 1;
        ai[i1] = j3;
        i1 = k2;
        if (true) goto _L22; else goto _L21
_L21:
        if (i1 != 0)
        {
            if (d == null)
            {
                i2 = 0;
            } else
            {
                i2 = d.length;
            }
            if (i2 == 0 && i1 == ai.length)
            {
                d = ai;
            } else
            {
                int ai1[] = new int[i2 + i1];
                if (i2 != 0)
                {
                    System.arraycopy(d, 0, ai1, 0, i2);
                }
                System.arraycopy(ai, 0, ai1, i2, i1);
                d = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L25; else goto _L24
_L24:
_L8:
        int l2;
        l2 = kog1.c(kog1.p());
        i1 = kog1.r();
        i2 = 0;
_L31:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                i2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i2 == 0) goto _L27; else goto _L26
_L26:
        kog1.e(i1);
        if (d == null)
        {
            i1 = 0;
        } else
        {
            i1 = d.length;
        }
        ai = new int[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(d, 0, ai, 0, i1);
            i2 = i1;
        }
_L29:
        if (kog1.q() > 0)
        {
            i1 = kog1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                ai[i2] = i1;
                i2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        d = ai;
_L27:
        kog1.d(l2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L29; else goto _L28
_L28:
        if (true) goto _L31; else goto _L30
_L30:
_L9:
        if (e == null)
        {
            e = new ivz();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L10:
        h = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L11:
        j = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L12:
        i = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L13:
        int j1 = kog1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            k = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        l = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        int j2 = kou.b(kog1, 138);
        ird aird[];
        int k1;
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.length;
        }
        aird = new ird[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(m, 0, aird, 0, k1);
            j2 = k1;
        }
        for (; j2 < aird.length - 1; j2++)
        {
            aird[j2] = new ird();
            kog1.a(aird[j2]);
            kog1.a();
        }

        aird[j2] = new ird();
        kog1.a(aird[j2]);
        m = aird;
        continue; /* Loop/switch isn't completed */
_L16:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            n = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        if (f == null)
        {
            f = new iuy();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L18:
        if (o == null)
        {
            o = new izi();
        }
        kog1.a(o);
        if (true) goto _L19; else goto _L32
_L32:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (b != null)
        {
            koh1.a(2, b.longValue());
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (a != null)
        {
            koh1.a(8, a.intValue());
        }
        if (c != null)
        {
            koh1.a(9, c.intValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                koh1.a(10, d[i1]);
            }

        }
        if (e != null)
        {
            koh1.b(11, e);
        }
        if (h != null)
        {
            koh1.a(12, h.longValue());
        }
        if (j != null)
        {
            koh1.a(13, j.longValue());
        }
        if (i != null)
        {
            koh1.a(14, i.longValue());
        }
        if (k != null)
        {
            koh1.a(15, k.intValue());
        }
        if (l != null)
        {
            koh1.a(16, l.booleanValue());
        }
        if (m != null && m.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < m.length; j1++)
            {
                ird ird1 = m[j1];
                if (ird1 != null)
                {
                    koh1.b(17, ird1);
                }
            }

        }
        if (n != null)
        {
            koh1.a(18, n.intValue());
        }
        if (f != null)
        {
            koh1.b(19, f);
        }
        if (o != null)
        {
            koh1.b(20, o);
        }
        super.writeTo(koh1);
    }
}
