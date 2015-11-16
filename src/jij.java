// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jij extends kwm
{

    private static volatile jij j[];
    public String a;
    public String b;
    public String c[];
    public Long d;
    public Integer e;
    public jih f;
    public jil g;
    public jik h;
    public Boolean i;

    public jij()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jij[] a()
    {
        if (j == null)
        {
            synchronized (kwq.a)
            {
                if (j == null)
                {
                    j = new jij[0];
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
        int k = super.computeSerializedSize();
        int l = k;
        if (a != null)
        {
            l = k + kwk.b(1, a);
        }
        k = l;
        if (b != null)
        {
            k = l + kwk.b(2, b);
        }
        l = k;
        if (c != null)
        {
            l = k;
            if (c.length > 0)
            {
                int i1 = 0;
                int j1 = 0;
                for (l = ((flag) ? 1 : 0); l < c.length;)
                {
                    String s = c[l];
                    int l1 = i1;
                    int k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = i1 + kwk.a(s);
                    }
                    l++;
                    i1 = l1;
                    j1 = k1;
                }

                l = k + i1 + j1 * 1;
            }
        }
        k = l;
        if (e != null)
        {
            k = l + kwk.e(4, e.intValue());
        }
        l = k;
        if (f != null)
        {
            l = k + kwk.d(5, f);
        }
        k = l;
        if (i != null)
        {
            i.booleanValue();
            k = l + (kwk.f(6) + 1);
        }
        l = k;
        if (g != null)
        {
            l = k + kwk.d(7, g);
        }
        k = l;
        if (h != null)
        {
            k = l + kwk.d(8, h);
        }
        l = k;
        if (d != null)
        {
            l = k + kwk.e(9, d.longValue());
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L12:
        int k = kwj1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 118
    //                   26: 129
    //                   32: 231
    //                   42: 286
    //                   48: 315
    //                   58: 329
    //                   66: 358
    //                   72: 387;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L12
_L4:
        b = kwj1.j();
          goto _L12
_L5:
        int j1 = kwx.a(kwj1, 26);
        String as[];
        int l;
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        as = new String[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, as, 0, l);
            j1 = l;
        }
        for (; j1 < as.length - 1; j1++)
        {
            as[j1] = kwj1.j();
            kwj1.a();
        }

        as[j1] = kwj1.j();
        c = as;
          goto _L12
_L6:
        int i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            e = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (f == null)
        {
            f = new jih();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L8:
        i = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new jil();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new jik();
        }
        kwj1.a(h);
        continue; /* Loop/switch isn't completed */
_L11:
        d = Long.valueOf(kwj1.e());
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(kwk kwk1)
    {
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
            for (int k = 0; k < c.length; k++)
            {
                String s = c[k];
                if (s != null)
                {
                    kwk1.a(3, s);
                }
            }

        }
        if (e != null)
        {
            kwk1.a(4, e.intValue());
        }
        if (f != null)
        {
            kwk1.b(5, f);
        }
        if (i != null)
        {
            kwk1.a(6, i.booleanValue());
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.b(8, h);
        }
        if (d != null)
        {
            kwk1.b(9, d.longValue());
        }
        super.writeTo(kwk1);
    }
}
