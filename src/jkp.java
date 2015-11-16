// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jkp extends kwm
{

    public Long a;
    public String b;
    public jax c;
    public jku d[];
    public Integer e;
    public Boolean f;
    public Integer g;
    public jks h;
    public String i;
    public String j;

    public jkp()
    {
        a = null;
        b = null;
        c = null;
        d = jku.a();
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (b != null)
        {
            k = l + kwk.b(1, b);
        }
        l = k;
        if (c != null)
        {
            l = k + kwk.d(2, c);
        }
        k = l;
        if (e != null)
        {
            k = l + kwk.e(3, e.intValue());
        }
        l = k;
        if (f != null)
        {
            f.booleanValue();
            l = k + (kwk.f(4) + 1);
        }
        k = l;
        if (g != null)
        {
            k = l + kwk.e(6, g.intValue());
        }
        l = k;
        if (h != null)
        {
            l = k + kwk.d(7, h);
        }
        int i1 = l;
        if (a != null)
        {
            i1 = l + kwk.e(8, a.longValue());
        }
        k = i1;
        if (i != null)
        {
            k = i1 + kwk.b(9, i);
        }
        l = k;
        if (d != null)
        {
            l = k;
            if (d.length > 0)
            {
                for (l = 0; l < d.length;)
                {
                    jku jku1 = d[l];
                    int j1 = k;
                    if (jku1 != null)
                    {
                        j1 = k + kwk.d(11, jku1);
                    }
                    l++;
                    k = j1;
                }

                l = k;
            }
        }
        k = l;
        if (j != null)
        {
            k = l + kwk.b(99, j);
        }
        return k;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L13:
        int k = kwj1.a();
        k;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   18: 126
    //                   24: 155
    //                   32: 206
    //                   48: 220
    //                   58: 278
    //                   64: 307
    //                   74: 321
    //                   90: 332
    //                   794: 456;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        b = kwj1.j();
          goto _L13
_L4:
        if (c == null)
        {
            c = new jax();
        }
        kwj1.a(c);
          goto _L13
_L5:
        int l = kwj1.f();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            e = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        f = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            g = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (h == null)
        {
            h = new jks();
        }
        kwj1.a(h);
        continue; /* Loop/switch isn't completed */
_L9:
        a = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L10:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        int k1 = kwx.a(kwj1, 90);
        jku ajku[];
        int j1;
        if (d == null)
        {
            j1 = 0;
        } else
        {
            j1 = d.length;
        }
        ajku = new jku[k1 + j1];
        k1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(d, 0, ajku, 0, j1);
            k1 = j1;
        }
        for (; k1 < ajku.length - 1; k1++)
        {
            ajku[k1] = new jku();
            kwj1.a(ajku[k1]);
            kwj1.a();
        }

        ajku[k1] = new jku();
        kwj1.a(ajku[k1]);
        d = ajku;
        continue; /* Loop/switch isn't completed */
_L12:
        j = kwj1.j();
        if (true) goto _L13; else goto _L14
_L14:
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b);
        }
        if (c != null)
        {
            kwk1.b(2, c);
        }
        if (e != null)
        {
            kwk1.a(3, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(4, f.booleanValue());
        }
        if (g != null)
        {
            kwk1.a(6, g.intValue());
        }
        if (h != null)
        {
            kwk1.b(7, h);
        }
        if (a != null)
        {
            kwk1.b(8, a.longValue());
        }
        if (i != null)
        {
            kwk1.a(9, i);
        }
        if (d != null && d.length > 0)
        {
            for (int k = 0; k < d.length; k++)
            {
                jku jku1 = d[k];
                if (jku1 != null)
                {
                    kwk1.b(11, jku1);
                }
            }

        }
        if (j != null)
        {
            kwk1.a(99, j);
        }
        super.writeTo(kwk1);
    }
}
