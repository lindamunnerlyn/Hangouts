// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kxt extends kwm
{

    private static volatile kxt m[];
    public kxw a;
    public kzj b;
    public int c;
    public Integer d;
    public kxw e;
    public kzj f;
    public Boolean g;
    public kyb h[];
    public Boolean i;
    public String j;
    public int k;
    public htx l;

    public kxt()
    {
        a = null;
        b = null;
        c = 0x80000000;
        d = null;
        e = null;
        f = null;
        g = null;
        h = kyb.a();
        i = null;
        j = null;
        k = 0x80000000;
        l = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kxt[] a()
    {
        if (m == null)
        {
            synchronized (kwq.a)
            {
                if (m == null)
                {
                    m = new kxt[0];
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
        if (c != 0x80000000)
        {
            j1 = i1 + kwk.e(2, c);
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
                    kyb kyb1 = h[j1];
                    int k1 = i1;
                    if (kyb1 != null)
                    {
                        k1 = i1 + kwk.d(6, kyb1);
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
        if (k != 0x80000000)
        {
            j1 = i1 + kwk.e(12, k);
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
    //                   24: 219
    //                   34: 233
    //                   40: 262
    //                   50: 276
    //                   56: 400
    //                   66: 414
    //                   74: 425
    //                   82: 454
    //                   90: 483
    //                   96: 512;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new kxw();
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
            c = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        if (e == null)
        {
            e = new kxw();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L7:
        g = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        int i2 = kwx.a(kwj1, 50);
        kyb akyb[];
        int k1;
        if (h == null)
        {
            k1 = 0;
        } else
        {
            k1 = h.length;
        }
        akyb = new kyb[i2 + k1];
        i2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(h, 0, akyb, 0, k1);
            i2 = k1;
        }
        for (; i2 < akyb.length - 1; i2++)
        {
            akyb[i2] = new kyb();
            kwj1.a(akyb[i2]);
            kwj1.a();
        }

        akyb[i2] = new kyb();
        kwj1.a(akyb[i2]);
        h = akyb;
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
            b = new kzj();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L12:
        if (l == null)
        {
            l = new htx();
        }
        kwj1.a(l);
        continue; /* Loop/switch isn't completed */
_L13:
        if (f == null)
        {
            f = new kzj();
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
            k = l1;
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
        if (c != 0x80000000)
        {
            kwk1.a(2, c);
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
                kyb kyb1 = h[i1];
                if (kyb1 != null)
                {
                    kwk1.b(6, kyb1);
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
        if (k != 0x80000000)
        {
            kwk1.a(12, k);
        }
        super.writeTo(kwk1);
    }
}
