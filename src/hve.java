// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hve extends kwm
{

    public String a;
    public Integer b;
    public Integer c;
    public hvf d;
    public String e[];
    public hva f;
    public int g[];
    public hvd h;

    public hve()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kwx.f;
        f = null;
        g = kwx.a;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize() + kwk.b(1, a) + kwk.e(2, b.intValue());
        int j = i;
        if (c != null)
        {
            j = i + kwk.e(3, c.intValue());
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                j = 0;
                int k = 0;
                int i1;
                int j1;
                for (i1 = 0; j < e.length; i1 = j1)
                {
                    String s = e[j];
                    int k1 = k;
                    j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = k + kwk.a(s);
                    }
                    j++;
                    k = k1;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.d(6, f);
        }
        j = i;
        if (g != null)
        {
            j = i;
            if (g.length > 0)
            {
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < g.length; j++)
                {
                    l += kwk.e(g[j]);
                }

                j = i + l + g.length * 1;
            }
        }
        i = j;
        if (h != null)
        {
            i = j + kwk.d(8, h);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L12:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 10: default 100
    //                   0: 110
    //                   10: 112
    //                   16: 123
    //                   24: 171
    //                   34: 215
    //                   42: 244
    //                   50: 353
    //                   56: 382
    //                   58: 572
    //                   66: 786;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L12
_L4:
        i = kwj1.f();
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            b = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i = kwj1.f();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
            c = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new hvf();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        int j = kwx.a(kwj1, 42);
        String as[];
        if (e == null)
        {
            i = 0;
        } else
        {
            i = e.length;
        }
        as = new String[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(e, 0, as, 0, i);
            j = i;
        }
        for (; j < as.length - 1; j++)
        {
            as[j] = kwj1.j();
            kwj1.a();
        }

        as[j] = kwj1.j();
        e = as;
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new hva();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        int ai[];
        int k;
        int j1;
        j1 = kwx.a(kwj1, 56);
        ai = new int[j1];
        k = 0;
        i = 0;
_L18:
        if (k >= j1) goto _L14; else goto _L13
_L13:
        int k1;
        if (k != 0)
        {
            kwj1.a();
        }
        k1 = kwj1.f();
        k1;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 465
    //                   1 465
    //                   2 465
    //                   3 465;
           goto _L15 _L16 _L16 _L16 _L16
_L15:
        k++;
        continue; /* Loop/switch isn't completed */
_L16:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L15; else goto _L14
_L14:
        if (i != 0)
        {
            if (g == null)
            {
                k = 0;
            } else
            {
                k = g.length;
            }
            if (k == 0 && i == ai.length)
            {
                g = ai;
            } else
            {
                int ai1[] = new int[k + i];
                if (k != 0)
                {
                    System.arraycopy(g, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, i);
                g = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L18; else goto _L17
_L17:
_L10:
        int i1;
        i1 = kwj1.c(kwj1.p());
        i = kwj1.r();
        k = 0;
_L24:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L20; else goto _L19
_L19:
        kwj1.e(i);
        if (g == null)
        {
            i = 0;
        } else
        {
            i = g.length;
        }
        ai = new int[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(g, 0, ai, 0, i);
            k = i;
        }
_L22:
        if (kwj1.q() > 0)
        {
            i = kwj1.f();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                ai[k] = i;
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        g = ai;
_L20:
        kwj1.d(i1);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L22; else goto _L21
_L21:
        if (true) goto _L24; else goto _L23
_L23:
_L11:
        if (h == null)
        {
            h = new hvd();
        }
        kwj1.a(h);
        if (true) goto _L12; else goto _L25
_L25:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(1, a);
        kwk1.a(2, b.intValue());
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    kwk1.a(5, s);
                }
            }

        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null && g.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < g.length; j++)
            {
                kwk1.a(7, g[j]);
            }

        }
        if (h != null)
        {
            kwk1.b(8, h);
        }
        super.writeTo(kwk1);
    }
}
