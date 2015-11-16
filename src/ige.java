// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ige extends kwm
{

    private static volatile ige l[];
    public String a;
    public String b;
    public String c[];
    public String d;
    public idp e;
    public String f;
    public idy g;
    public igd h;
    public Boolean i;
    public ige j[];
    public Integer k;

    public ige()
    {
        a = null;
        b = null;
        c = kwx.f;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = a();
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ige[] a()
    {
        if (l == null)
        {
            synchronized (kwq.a)
            {
                if (l == null)
                {
                    l = new ige[0];
                }
            }
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int j1 = i1;
        if (a != null)
        {
            j1 = i1 + kwk.b(1, a);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.b(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int j2;
                int k2;
                for (j2 = 0; j1 < c.length; j2 = k2)
                {
                    String s = c[j1];
                    int l2 = k1;
                    k2 = j2;
                    if (s != null)
                    {
                        k2 = j2 + 1;
                        l2 = k1 + kwk.a(s);
                    }
                    j1++;
                    k1 = l2;
                }

                j1 = i1 + k1 + j2 * 1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(4, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.d(5, e);
        }
        int l1 = j1;
        if (f != null)
        {
            l1 = j1 + kwk.b(6, f);
        }
        i1 = l1;
        if (i != null)
        {
            i.booleanValue();
            i1 = l1 + (kwk.f(7) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= j.length)
                    {
                        break;
                    }
                    ige ige1 = j[i2];
                    j1 = i1;
                    if (ige1 != null)
                    {
                        j1 = i1 + kwk.d(8, ige1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.e(9, k.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.d(10, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.d(11, h);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L14:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   10: 123
    //                   18: 134
    //                   26: 145
    //                   34: 247
    //                   42: 258
    //                   50: 287
    //                   56: 298
    //                   66: 312
    //                   72: 436
    //                   82: 546
    //                   90: 575;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L14
_L4:
        b = kwj1.j();
          goto _L14
_L5:
        int i2 = kwx.a(kwj1, 26);
        String as[];
        int j1;
        if (c == null)
        {
            j1 = 0;
        } else
        {
            j1 = c.length;
        }
        as = new String[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(c, 0, as, 0, j1);
            i2 = j1;
        }
        for (; i2 < as.length - 1; i2++)
        {
            as[i2] = kwj1.j();
            kwj1.a();
        }

        as[i2] = kwj1.j();
        c = as;
          goto _L14
_L6:
        d = kwj1.j();
          goto _L14
_L7:
        if (e == null)
        {
            e = new idp();
        }
        kwj1.a(e);
          goto _L14
_L8:
        f = kwj1.j();
          goto _L14
_L9:
        i = Boolean.valueOf(kwj1.i());
          goto _L14
_L10:
        int j2 = kwx.a(kwj1, 66);
        ige aige[];
        int k1;
        if (j == null)
        {
            k1 = 0;
        } else
        {
            k1 = j.length;
        }
        aige = new ige[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(j, 0, aige, 0, k1);
            j2 = k1;
        }
        for (; j2 < aige.length - 1; j2++)
        {
            aige[j2] = new ige();
            kwj1.a(aige[j2]);
            kwj1.a();
        }

        aige[j2] = new ige();
        kwj1.a(aige[j2]);
        j = aige;
          goto _L14
_L11:
        int l1 = kwj1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 100: // 'd'
        case 101: // 'e'
        case 110: // 'n'
            k = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (g == null)
        {
            g = new idy();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L13:
        if (h == null)
        {
            h = new igd();
        }
        kwj1.a(h);
        if (true) goto _L14; else goto _L15
_L15:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                String s = c[i1];
                if (s != null)
                {
                    kwk1.a(3, s);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (i != null)
        {
            kwk1.a(7, i.booleanValue());
        }
        if (j != null && j.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < j.length; j1++)
            {
                ige ige1 = j[j1];
                if (ige1 != null)
                {
                    kwk1.b(8, ige1);
                }
            }

        }
        if (k != null)
        {
            kwk1.a(9, k.intValue());
        }
        if (g != null)
        {
            kwk1.b(10, g);
        }
        if (h != null)
        {
            kwk1.b(11, h);
        }
        super.writeTo(kwk1);
    }
}
