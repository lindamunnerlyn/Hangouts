// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lef extends kwm
{

    public Boolean a;
    public Boolean b;
    public Integer c;
    public lem d[];
    public lej e;
    public len f[];
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public int j;

    public lef()
    {
        a = null;
        b = null;
        c = null;
        d = lem.a();
        e = null;
        f = len.a();
        g = null;
        h = null;
        i = null;
        j = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            a.booleanValue();
            k = l + (kwk.f(1) + 1);
        }
        l = k;
        if (b != null)
        {
            b.booleanValue();
            l = k + (kwk.f(2) + 1);
        }
        k = l + kwk.e(3, c.intValue());
        l = k;
        if (d != null)
        {
            l = k;
            if (d.length > 0)
            {
                for (l = 0; l < d.length;)
                {
                    lem lem1 = d[l];
                    int i1 = k;
                    if (lem1 != null)
                    {
                        i1 = k + kwk.d(4, lem1);
                    }
                    l++;
                    k = i1;
                }

                l = k;
            }
        }
        k = l;
        if (e != null)
        {
            k = l + kwk.d(5, e);
        }
        l = k;
        if (f != null)
        {
            l = k;
            if (f.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    l = k;
                    if (j1 >= f.length)
                    {
                        break;
                    }
                    len len1 = f[j1];
                    l = k;
                    if (len1 != null)
                    {
                        l = k + kwk.d(6, len1);
                    }
                    j1++;
                    k = l;
                } while (true);
            }
        }
        k = l;
        if (g != null)
        {
            g.booleanValue();
            k = l + (kwk.f(7) + 1);
        }
        l = k;
        if (h != null)
        {
            h.booleanValue();
            l = k + (kwk.f(8) + 1);
        }
        k = l;
        if (i != null)
        {
            i.booleanValue();
            k = l + (kwk.f(9) + 1);
        }
        l = k;
        if (j != 0x80000000)
        {
            l = k + kwk.e(10, j);
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L13:
        int k = kwj1.a();
        k;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   8: 115
    //                   16: 129
    //                   24: 143
    //                   34: 157
    //                   42: 281
    //                   50: 310
    //                   56: 434
    //                   64: 448
    //                   72: 462
    //                   80: 476;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kwj1.i());
          goto _L13
_L4:
        b = Boolean.valueOf(kwj1.i());
          goto _L13
_L5:
        c = Integer.valueOf(kwj1.f());
          goto _L13
_L6:
        int k1 = kwx.a(kwj1, 34);
        lem alem[];
        int l;
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.length;
        }
        alem = new lem[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(d, 0, alem, 0, l);
            k1 = l;
        }
        for (; k1 < alem.length - 1; k1++)
        {
            alem[k1] = new lem();
            kwj1.a(alem[k1]);
            kwj1.a();
        }

        alem[k1] = new lem();
        kwj1.a(alem[k1]);
        d = alem;
          goto _L13
_L7:
        if (e == null)
        {
            e = new lej();
        }
        kwj1.a(e);
          goto _L13
_L8:
        int l1 = kwx.a(kwj1, 50);
        len alen[];
        int i1;
        if (f == null)
        {
            i1 = 0;
        } else
        {
            i1 = f.length;
        }
        alen = new len[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(f, 0, alen, 0, i1);
            l1 = i1;
        }
        for (; l1 < alen.length - 1; l1++)
        {
            alen[l1] = new len();
            kwj1.a(alen[l1]);
            kwj1.a();
        }

        alen[l1] = new len();
        kwj1.a(alen[l1]);
        f = alen;
          goto _L13
_L9:
        g = Boolean.valueOf(kwj1.i());
          goto _L13
_L10:
        h = Boolean.valueOf(kwj1.i());
          goto _L13
_L11:
        i = Boolean.valueOf(kwj1.i());
          goto _L13
_L12:
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
            j = j1;
            break;
        }
        if (true) goto _L13; else goto _L14
_L14:
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
            kwk1.a(2, b.booleanValue());
        }
        kwk1.a(3, c.intValue());
        if (d != null && d.length > 0)
        {
            for (int k = 0; k < d.length; k++)
            {
                lem lem1 = d[k];
                if (lem1 != null)
                {
                    kwk1.b(4, lem1);
                }
            }

        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < f.length; l++)
            {
                len len1 = f[l];
                if (len1 != null)
                {
                    kwk1.b(6, len1);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            kwk1.a(8, h.booleanValue());
        }
        if (i != null)
        {
            kwk1.a(9, i.booleanValue());
        }
        if (j != 0x80000000)
        {
            kwk1.a(10, j);
        }
        super.writeTo(kwk1);
    }
}
