// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixh extends kwm
{

    public Integer a;
    public Long b;
    public Integer c;
    public int d[];
    public jce e;
    public jbd f;
    public jga g;
    public Long h;
    public Long i;
    public Long j;
    public Integer k;
    public Boolean l;
    public ixi m[];
    public Integer n;
    public jfn o;

    public ixh()
    {
        a = null;
        b = null;
        c = null;
        d = kwx.a;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = ixi.a();
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
            i1 = j1 + kwk.d(2, b.longValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.d(7, g);
        }
        int k1 = j1;
        if (a != null)
        {
            k1 = j1 + kwk.e(8, a.intValue());
        }
        i1 = k1;
        if (c != null)
        {
            i1 = k1 + kwk.e(9, c.intValue());
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
                    k1 += kwk.e(d[j1]);
                }

                j1 = i1 + k1 + d.length * 1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.d(11, e);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.d(12, h.longValue());
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(13, j.longValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.d(14, i.longValue());
        }
        k1 = j1;
        if (k != null)
        {
            k1 = j1 + kwk.e(15, k.intValue());
        }
        i1 = k1;
        if (l != null)
        {
            l.booleanValue();
            i1 = k1 + (kwk.f(16) + 1);
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
                    ixi ixi1 = m[l1];
                    j1 = i1;
                    if (ixi1 != null)
                    {
                        j1 = i1 + kwk.d(17, ixi1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.e(18, n.intValue());
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(19, f);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.d(20, o);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L19:
        int i1 = kwj1.a();
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
        if (super.storeUnknownField(kwj1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        b = Long.valueOf(kwj1.d());
          goto _L19
_L4:
        if (g == null)
        {
            g = new jga();
        }
        kwj1.a(g);
          goto _L19
_L5:
        i1 = kwj1.f();
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
        i1 = kwj1.f();
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
        i3 = kwx.a(kwj1, 80);
        ai = new int[i3];
        i2 = 0;
        i1 = 0;
_L25:
        if (i2 >= i3) goto _L21; else goto _L20
_L20:
        int j3;
        if (i2 != 0)
        {
            kwj1.a();
        }
        j3 = kwj1.f();
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
        l2 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        i2 = 0;
_L31:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
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
        kwj1.e(i1);
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
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
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
        kwj1.d(l2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L29; else goto _L28
_L28:
        if (true) goto _L31; else goto _L30
_L30:
_L9:
        if (e == null)
        {
            e = new jce();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L10:
        h = Long.valueOf(kwj1.d());
        continue; /* Loop/switch isn't completed */
_L11:
        j = Long.valueOf(kwj1.d());
        continue; /* Loop/switch isn't completed */
_L12:
        i = Long.valueOf(kwj1.d());
        continue; /* Loop/switch isn't completed */
_L13:
        int j1 = kwj1.f();
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
        l = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        int j2 = kwx.a(kwj1, 138);
        ixi aixi[];
        int k1;
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.length;
        }
        aixi = new ixi[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(m, 0, aixi, 0, k1);
            j2 = k1;
        }
        for (; j2 < aixi.length - 1; j2++)
        {
            aixi[j2] = new ixi();
            kwj1.a(aixi[j2]);
            kwj1.a();
        }

        aixi[j2] = new ixi();
        kwj1.a(aixi[j2]);
        m = aixi;
        continue; /* Loop/switch isn't completed */
_L16:
        int l1 = kwj1.f();
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
            f = new jbd();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L18:
        if (o == null)
        {
            o = new jfn();
        }
        kwj1.a(o);
        if (true) goto _L19; else goto _L32
_L32:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (b != null)
        {
            kwk1.a(2, b.longValue());
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (a != null)
        {
            kwk1.a(8, a.intValue());
        }
        if (c != null)
        {
            kwk1.a(9, c.intValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                kwk1.a(10, d[i1]);
            }

        }
        if (e != null)
        {
            kwk1.b(11, e);
        }
        if (h != null)
        {
            kwk1.a(12, h.longValue());
        }
        if (j != null)
        {
            kwk1.a(13, j.longValue());
        }
        if (i != null)
        {
            kwk1.a(14, i.longValue());
        }
        if (k != null)
        {
            kwk1.a(15, k.intValue());
        }
        if (l != null)
        {
            kwk1.a(16, l.booleanValue());
        }
        if (m != null && m.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < m.length; j1++)
            {
                ixi ixi1 = m[j1];
                if (ixi1 != null)
                {
                    kwk1.b(17, ixi1);
                }
            }

        }
        if (n != null)
        {
            kwk1.a(18, n.intValue());
        }
        if (f != null)
        {
            kwk1.b(19, f);
        }
        if (o != null)
        {
            kwk1.b(20, o);
        }
        super.writeTo(kwk1);
    }
}
