// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iap extends kwm
{

    private static volatile iap n[];
    public ibg a;
    public ibg b;
    public Integer c;
    public Double d;
    public Double e;
    public Long f;
    public Integer g;
    public String h;
    public String i;
    public String j;
    public String k;
    public Long l;
    public iao m[];

    public iap()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = iao.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iap[] a()
    {
        if (n == null)
        {
            synchronized (kwq.a)
            {
                if (n == null)
                {
                    n = new iap[0];
                }
            }
        }
        return n;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.e(2, c.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            d.doubleValue();
            j1 = i1 + (kwk.f(3) + 8);
        }
        i1 = j1;
        if (e != null)
        {
            e.doubleValue();
            i1 = j1 + (kwk.f(4) + 8);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.e(5, f.longValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.e(6, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(9, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(10, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.e(11, l.longValue());
        }
        int k1 = j1;
        if (a != null)
        {
            k1 = j1 + kwk.d(12, a);
        }
        i1 = k1;
        if (b != null)
        {
            i1 = k1 + kwk.d(13, b);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    iao iao1 = m[j1];
                    int l1 = i1;
                    if (iao1 != null)
                    {
                        l1 = i1 + kwk.d(14, iao1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L16:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 14: default 128
    //                   0: 137
    //                   16: 139
    //                   25: 182
    //                   33: 196
    //                   40: 210
    //                   48: 224
    //                   58: 238
    //                   66: 249
    //                   74: 260
    //                   82: 271
    //                   88: 282
    //                   98: 296
    //                   106: 325
    //                   114: 354;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        d = Double.valueOf(kwj1.b());
        continue; /* Loop/switch isn't completed */
_L5:
        e = Double.valueOf(kwj1.b());
        continue; /* Loop/switch isn't completed */
_L6:
        f = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L7:
        g = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        h = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        l = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L13:
        if (a == null)
        {
            a = new ibg();
        }
        kwj1.a(a);
        continue; /* Loop/switch isn't completed */
_L14:
        if (b == null)
        {
            b = new ibg();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L15:
        int l1 = kwx.a(kwj1, 114);
        iao aiao[];
        int k1;
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.length;
        }
        aiao = new iao[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(m, 0, aiao, 0, k1);
            l1 = k1;
        }
        for (; l1 < aiao.length - 1; l1++)
        {
            aiao[l1] = new iao();
            kwj1.a(aiao[l1]);
            kwj1.a();
        }

        aiao[l1] = new iao();
        kwj1.a(aiao[l1]);
        m = aiao;
        if (true) goto _L16; else goto _L17
_L17:
    }

    public void writeTo(kwk kwk1)
    {
        if (c != null)
        {
            kwk1.a(2, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(3, d.doubleValue());
        }
        if (e != null)
        {
            kwk1.a(4, e.doubleValue());
        }
        if (f != null)
        {
            kwk1.b(5, f.longValue());
        }
        if (g != null)
        {
            kwk1.a(6, g.intValue());
        }
        if (h != null)
        {
            kwk1.a(7, h);
        }
        if (i != null)
        {
            kwk1.a(8, i);
        }
        if (j != null)
        {
            kwk1.a(9, j);
        }
        if (k != null)
        {
            kwk1.a(10, k);
        }
        if (l != null)
        {
            kwk1.b(11, l.longValue());
        }
        if (a != null)
        {
            kwk1.b(12, a);
        }
        if (b != null)
        {
            kwk1.b(13, b);
        }
        if (m != null && m.length > 0)
        {
            for (int i1 = 0; i1 < m.length; i1++)
            {
                iao iao1 = m[i1];
                if (iao1 != null)
                {
                    kwk1.b(14, iao1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
