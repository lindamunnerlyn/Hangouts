// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljw extends kwm
{

    private static volatile ljw r[];
    public String a;
    public String b;
    public lhc c;
    public String d[];
    public lij e;
    public lij f;
    public lij g;
    public int h[];
    public Integer i;
    public String j;
    public String k;
    public String l;
    public Boolean m;
    public String n;
    public String o;
    public String p;
    public Boolean q;

    public ljw()
    {
        a = null;
        b = null;
        c = null;
        d = kwx.f;
        e = null;
        f = null;
        g = null;
        h = kwx.a;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ljw[] a()
    {
        if (r == null)
        {
            synchronized (kwq.a)
            {
                if (r == null)
                {
                    r = new ljw[0];
                }
            }
        }
        return r;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.d(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int i2;
                int j2;
                for (i2 = 0; j1 < d.length; i2 = j2)
                {
                    String s = d[j1];
                    int k2 = k1;
                    j2 = i2;
                    if (s != null)
                    {
                        j2 = i2 + 1;
                        k2 = k1 + kwk.a(s);
                    }
                    j1++;
                    k1 = k2;
                }

                j1 = i1 + k1 + i2 * 1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.d(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < h.length; j1++)
                {
                    l1 += kwk.e(h[j1]);
                }

                j1 = i1 + l1 + h.length * 1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.e(9, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.b(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            m.booleanValue();
            i1 = j1 + (kwk.f(13) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.b(14, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.b(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.b(16, p);
        }
        i1 = j1;
        if (q != null)
        {
            q.booleanValue();
            i1 = j1 + (kwk.f(17) + 1);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L35:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 19: default 172
    //                   0: 182
    //                   10: 184
    //                   18: 195
    //                   26: 206
    //                   34: 235
    //                   42: 344
    //                   50: 373
    //                   58: 402
    //                   64: 431
    //                   66: 612
    //                   72: 810
    //                   82: 824
    //                   90: 835
    //                   98: 846
    //                   104: 857
    //                   114: 871
    //                   122: 882
    //                   130: 893
    //                   136: 904;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L1:
        if (super.storeUnknownField(kwj1, i1))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        a = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new lhc();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        int j1 = kwx.a(kwj1, 34);
        String as[];
        if (d == null)
        {
            i1 = 0;
        } else
        {
            i1 = d.length;
        }
        as = new String[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(d, 0, as, 0, i1);
            j1 = i1;
        }
        for (; j1 < as.length - 1; j1++)
        {
            as[j1] = kwj1.j();
            kwj1.a();
        }

        as[j1] = kwj1.j();
        d = as;
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new lij();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new lij();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new lij();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        int ai[];
        int k1;
        int j2;
        j2 = kwx.a(kwj1, 64);
        ai = new int[j2];
        k1 = 0;
        i1 = 0;
_L27:
        if (k1 >= j2) goto _L22; else goto _L21
_L21:
        int k2;
        if (k1 != 0)
        {
            kwj1.a();
        }
        k2 = kwj1.f();
        k2;
        JVM INSTR tableswitch 0 1: default 496
    //                   0 505
    //                   1 505;
           goto _L23 _L24 _L24
_L23:
        k1++;
          goto _L25
_L24:
        int l1 = i1 + 1;
        ai[i1] = k2;
        i1 = l1;
        if (true) goto _L23; else goto _L25
_L25:
        if (true) goto _L27; else goto _L26
_L26:
_L22:
        if (i1 != 0)
        {
            if (h == null)
            {
                k1 = 0;
            } else
            {
                k1 = h.length;
            }
            if (k1 == 0 && i1 == ai.length)
            {
                h = ai;
            } else
            {
                int ai1[] = new int[k1 + i1];
                if (k1 != 0)
                {
                    System.arraycopy(h, 0, ai1, 0, k1);
                }
                System.arraycopy(ai, 0, ai1, k1, i1);
                h = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L11:
        int i2;
        i2 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        k1 = 0;
_L33:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k1 == 0) goto _L29; else goto _L28
_L28:
        kwj1.e(i1);
        if (h == null)
        {
            i1 = 0;
        } else
        {
            i1 = h.length;
        }
        ai = new int[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(h, 0, ai, 0, i1);
            k1 = i1;
        }
_L31:
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
                ai[k1] = i1;
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        h = ai;
          goto _L29
        if (true) goto _L31; else goto _L30
_L30:
        if (true) goto _L33; else goto _L32
_L32:
_L29:
        kwj1.d(i2);
        continue; /* Loop/switch isn't completed */
_L12:
        i = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L13:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L14:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        l = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L16:
        m = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        n = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        o = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        p = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L20:
        q = Boolean.valueOf(kwj1.i());
        if (true) goto _L35; else goto _L34
_L34:
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
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                String s = d[i1];
                if (s != null)
                {
                    kwk1.a(4, s);
                }
            }

        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < h.length; j1++)
            {
                kwk1.a(8, h[j1]);
            }

        }
        if (i != null)
        {
            kwk1.a(9, i.intValue());
        }
        if (j != null)
        {
            kwk1.a(10, j);
        }
        if (k != null)
        {
            kwk1.a(11, k);
        }
        if (l != null)
        {
            kwk1.a(12, l);
        }
        if (m != null)
        {
            kwk1.a(13, m.booleanValue());
        }
        if (n != null)
        {
            kwk1.a(14, n);
        }
        if (o != null)
        {
            kwk1.a(15, o);
        }
        if (p != null)
        {
            kwk1.a(16, p);
        }
        if (q != null)
        {
            kwk1.a(17, q.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
