// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iaz extends kwm
{

    private static volatile iaz j[];
    public ibg a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public String g[];
    public icj h[];
    public Integer i;

    public iaz()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = kwx.f;
        h = icj.a();
        i = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iaz[] a()
    {
        if (j == null)
        {
            synchronized (kwq.a)
            {
                if (j == null)
                {
                    j = new iaz[0];
                }
            }
        }
        return j;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            k = l + kwk.d(1, a);
        }
        l = k;
        if (b != null)
        {
            l = k + kwk.b(2, b);
        }
        k = l;
        if (c != null)
        {
            k = l + kwk.b(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + kwk.b(4, d);
        }
        k = l;
        if (e != null)
        {
            k = l + kwk.b(5, e);
        }
        l = k;
        if (f != null)
        {
            f.booleanValue();
            l = k + (kwk.f(6) + 1);
        }
        k = l;
        if (g != null)
        {
            k = l;
            if (g.length > 0)
            {
                k = 0;
                int i1 = 0;
                int k1;
                int l1;
                for (k1 = 0; k < g.length; k1 = l1)
                {
                    String s = g[k];
                    int i2 = i1;
                    l1 = k1;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        i2 = i1 + kwk.a(s);
                    }
                    k++;
                    i1 = i2;
                }

                k = l + i1 + k1 * 1;
            }
        }
        l = k;
        if (h != null)
        {
            l = k;
            if (h.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    l = k;
                    if (j1 >= h.length)
                    {
                        break;
                    }
                    icj icj1 = h[j1];
                    l = k;
                    if (icj1 != null)
                    {
                        l = k + kwk.d(8, icj1);
                    }
                    j1++;
                    k = l;
                } while (true);
            }
        }
        k = l;
        if (i != null)
        {
            k = l + kwk.e(9, i.intValue());
        }
        return k;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L12:
        int k = kwj1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 136
    //                   26: 147
    //                   34: 158
    //                   42: 169
    //                   48: 180
    //                   58: 194
    //                   66: 296
    //                   72: 420;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new ibg();
        }
        kwj1.a(a);
          goto _L12
_L4:
        b = kwj1.j();
          goto _L12
_L5:
        c = kwj1.j();
          goto _L12
_L6:
        d = kwj1.j();
          goto _L12
_L7:
        e = kwj1.j();
          goto _L12
_L8:
        f = Boolean.valueOf(kwj1.i());
          goto _L12
_L9:
        int k1 = kwx.a(kwj1, 58);
        String as[];
        int l;
        if (g == null)
        {
            l = 0;
        } else
        {
            l = g.length;
        }
        as = new String[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(g, 0, as, 0, l);
            k1 = l;
        }
        for (; k1 < as.length - 1; k1++)
        {
            as[k1] = kwj1.j();
            kwj1.a();
        }

        as[k1] = kwj1.j();
        g = as;
          goto _L12
_L10:
        int l1 = kwx.a(kwj1, 66);
        icj aicj[];
        int i1;
        if (h == null)
        {
            i1 = 0;
        } else
        {
            i1 = h.length;
        }
        aicj = new icj[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(h, 0, aicj, 0, i1);
            l1 = i1;
        }
        for (; l1 < aicj.length - 1; l1++)
        {
            aicj[l1] = new icj();
            kwj1.a(aicj[l1]);
            kwj1.a();
        }

        aicj[l1] = new icj();
        kwj1.a(aicj[l1]);
        h = aicj;
          goto _L12
_L11:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            i = Integer.valueOf(j1);
            break;
        }
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f.booleanValue());
        }
        if (g != null && g.length > 0)
        {
            for (int k = 0; k < g.length; k++)
            {
                String s = g[k];
                if (s != null)
                {
                    kwk1.a(7, s);
                }
            }

        }
        if (h != null && h.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < h.length; l++)
            {
                icj icj1 = h[l];
                if (icj1 != null)
                {
                    kwk1.b(8, icj1);
                }
            }

        }
        if (i != null)
        {
            kwk1.a(9, i.intValue());
        }
        super.writeTo(kwk1);
    }
}
