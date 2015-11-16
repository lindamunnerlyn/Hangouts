// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwx extends kwm
{

    public Boolean a;
    public Integer b;
    public Long c;
    public String d;
    public Boolean e;
    public Boolean f;
    public hvo g[];
    public Integer h;
    public Boolean i;
    public hvi j[];
    public Long k;
    public hvv l;
    public Boolean m;

    public hwx()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = hvo.a();
        h = null;
        i = null;
        j = hvi.a();
        k = null;
        l = null;
        m = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            a.booleanValue();
            i1 = j1 + (kwk.f(1) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.e(2, b.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            e.booleanValue();
            i1 = j1 + (kwk.f(3) + 1);
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (kwk.f(4) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.e(5, k.longValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.e(6, h.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (kwk.f(7) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.e(8, c.longValue());
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(9, d);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                for (j1 = 0; j1 < j.length;)
                {
                    hvi hvi1 = j[j1];
                    int l1 = i1;
                    if (hvi1 != null)
                    {
                        l1 = i1 + kwk.d(10, hvi1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        int i2 = j1;
        if (l != null)
        {
            i2 = j1 + kwk.d(11, l);
        }
        i1 = i2;
        if (m != null)
        {
            m.booleanValue();
            i1 = i2 + (kwk.f(12) + 1);
        }
        i2 = i1;
        if (g != null)
        {
            i2 = i1;
            if (g.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    i2 = i1;
                    if (k1 >= g.length)
                    {
                        break;
                    }
                    hvo hvo1 = g[k1];
                    i2 = i1;
                    if (hvo1 != null)
                    {
                        i2 = i1 + kwk.d(13, hvo1);
                    }
                    k1++;
                    i1 = i2;
                } while (true);
            }
        }
        return i2;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L16:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 14: default 128
    //                   0: 137
    //                   8: 139
    //                   16: 153
    //                   24: 218
    //                   32: 232
    //                   40: 246
    //                   48: 260
    //                   56: 306
    //                   64: 320
    //                   74: 334
    //                   82: 345
    //                   90: 469
    //                   96: 498
    //                   106: 512;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kwj1.i());
          goto _L16
_L4:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            b = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        e = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L6:
        f = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L7:
        k = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L8:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        i = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L10:
        c = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L11:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        int j2 = kwx.a(kwj1, 82);
        hvi ahvi[];
        int l1;
        if (j == null)
        {
            l1 = 0;
        } else
        {
            l1 = j.length;
        }
        ahvi = new hvi[j2 + l1];
        j2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(j, 0, ahvi, 0, l1);
            j2 = l1;
        }
        for (; j2 < ahvi.length - 1; j2++)
        {
            ahvi[j2] = new hvi();
            kwj1.a(ahvi[j2]);
            kwj1.a();
        }

        ahvi[j2] = new hvi();
        kwj1.a(ahvi[j2]);
        j = ahvi;
        continue; /* Loop/switch isn't completed */
_L13:
        if (l == null)
        {
            l = new hvv();
        }
        kwj1.a(l);
        continue; /* Loop/switch isn't completed */
_L14:
        m = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        int k2 = kwx.a(kwj1, 106);
        hvo ahvo[];
        int i2;
        if (g == null)
        {
            i2 = 0;
        } else
        {
            i2 = g.length;
        }
        ahvo = new hvo[k2 + i2];
        k2 = i2;
        if (i2 != 0)
        {
            System.arraycopy(g, 0, ahvo, 0, i2);
            k2 = i2;
        }
        for (; k2 < ahvo.length - 1; k2++)
        {
            ahvo[k2] = new hvo();
            kwj1.a(ahvo[k2]);
            kwj1.a();
        }

        ahvo[k2] = new hvo();
        kwj1.a(ahvo[k2]);
        g = ahvo;
        if (true) goto _L16; else goto _L17
_L17:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (e != null)
        {
            kwk1.a(3, e.booleanValue());
        }
        if (f != null)
        {
            kwk1.a(4, f.booleanValue());
        }
        if (k != null)
        {
            kwk1.b(5, k.longValue());
        }
        if (h != null)
        {
            kwk1.a(6, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(7, i.booleanValue());
        }
        if (c != null)
        {
            kwk1.b(8, c.longValue());
        }
        if (d != null)
        {
            kwk1.a(9, d);
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                hvi hvi1 = j[i1];
                if (hvi1 != null)
                {
                    kwk1.b(10, hvi1);
                }
            }

        }
        if (l != null)
        {
            kwk1.b(11, l);
        }
        if (m != null)
        {
            kwk1.a(12, m.booleanValue());
        }
        if (g != null && g.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < g.length; j1++)
            {
                hvo hvo1 = g[j1];
                if (hvo1 != null)
                {
                    kwk1.b(13, hvo1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
