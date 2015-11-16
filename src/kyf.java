// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyf extends kwm
{

    private static volatile kyf m[];
    public kxx a;
    public kzk b;
    public Integer c;
    public Integer d;
    public kxx e;
    public kzk f;
    public Boolean g;
    public kyi h[];
    public Boolean i;
    public String j;
    public Integer k;
    public hub l;

    public kyf()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = kyi.a();
        i = null;
        j = null;
        k = null;
        l = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kyf[] a()
    {
        if (m == null)
        {
            synchronized (kwq.a)
            {
                if (m == null)
                {
                    m = new kyf[0];
                }
            }
        }
        return m;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.d(1, a);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.e(2, c.intValue());
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.e(3, d.intValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.d(4, e);
        }
        i1 = j1;
        if (g != null)
        {
            g.booleanValue();
            i1 = j1 + (kwk.f(5) + 1);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                for (j1 = 0; j1 < h.length;)
                {
                    kyi kyi1 = h[j1];
                    int k1 = i1;
                    if (kyi1 != null)
                    {
                        k1 = i1 + kwk.d(6, kyi1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (kwk.f(7) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(8, j);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.d(9, b);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.d(10, l);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.d(11, f);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.e(12, k.intValue());
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L15:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 13: default 120
    //                   0: 129
    //                   10: 131
    //                   16: 160
    //                   24: 222
    //                   34: 236
    //                   40: 265
    //                   50: 279
    //                   56: 403
    //                   66: 417
    //                   74: 428
    //                   82: 457
    //                   90: 486
    //                   96: 515;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new kxx();
        }
        kwj1.a(a);
          goto _L15
_L4:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            c = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        if (e == null)
        {
            e = new kxx();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L7:
        g = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        int i2 = kwx.a(kwj1, 50);
        kyi akyi[];
        int k1;
        if (h == null)
        {
            k1 = 0;
        } else
        {
            k1 = h.length;
        }
        akyi = new kyi[i2 + k1];
        i2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(h, 0, akyi, 0, k1);
            i2 = k1;
        }
        for (; i2 < akyi.length - 1; i2++)
        {
            akyi[i2] = new kyi();
            kwj1.a(akyi[i2]);
            kwj1.a();
        }

        akyi[i2] = new kyi();
        kwj1.a(akyi[i2]);
        h = akyi;
        continue; /* Loop/switch isn't completed */
_L9:
        i = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L10:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        if (b == null)
        {
            b = new kzk();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L12:
        if (l == null)
        {
            l = new hub();
        }
        kwj1.a(l);
        continue; /* Loop/switch isn't completed */
_L13:
        if (f == null)
        {
            f = new kzk();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L14:
        int l1 = kwj1.f();
        switch (l1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            k = Integer.valueOf(l1);
            break;
        }
        if (true) goto _L15; else goto _L16
_L16:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (c != null)
        {
            kwk1.a(2, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(3, d.intValue());
        }
        if (e != null)
        {
            kwk1.b(4, e);
        }
        if (g != null)
        {
            kwk1.a(5, g.booleanValue());
        }
        if (h != null && h.length > 0)
        {
            for (int i1 = 0; i1 < h.length; i1++)
            {
                kyi kyi1 = h[i1];
                if (kyi1 != null)
                {
                    kwk1.b(6, kyi1);
                }
            }

        }
        if (i != null)
        {
            kwk1.a(7, i.booleanValue());
        }
        if (j != null)
        {
            kwk1.a(8, j);
        }
        if (b != null)
        {
            kwk1.b(9, b);
        }
        if (l != null)
        {
            kwk1.b(10, l);
        }
        if (f != null)
        {
            kwk1.b(11, f);
        }
        if (k != null)
        {
            kwk1.a(12, k.intValue());
        }
        super.writeTo(kwk1);
    }
}
