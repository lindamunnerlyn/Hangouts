// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbi extends koj
{

    private static volatile lbi r[];
    public String a;
    public String b;
    public kyo c;
    public String d[];
    public kzv e;
    public kzv f;
    public kzv g;
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

    public lbi()
    {
        a = null;
        b = null;
        c = null;
        d = kou.f;
        e = null;
        f = null;
        g = null;
        h = kou.a;
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

    public static lbi[] a()
    {
        if (r == null)
        {
            synchronized (kon.a)
            {
                if (r == null)
                {
                    r = new lbi[0];
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
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.d(3, c);
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
                        k2 = k1 + koh.a(s);
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
            i1 = j1 + koh.d(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.d(7, g);
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
                    l1 += koh.e(h[j1]);
                }

                j1 = i1 + l1 + h.length * 1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.e(9, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.b(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.b(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.b(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            m.booleanValue();
            i1 = j1 + (koh.f(13) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.b(14, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.b(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.b(16, p);
        }
        i1 = j1;
        if (q != null)
        {
            q.booleanValue();
            i1 = j1 + (koh.f(17) + 1);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L35:
        int i1 = kog1.a();
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
        if (super.storeUnknownField(kog1, i1))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        a = kog1.j();
        continue; /* Loop/switch isn't completed */
_L4:
        b = kog1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new kyo();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        int j1 = kou.b(kog1, 34);
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
            as[j1] = kog1.j();
            kog1.a();
        }

        as[j1] = kog1.j();
        d = as;
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new kzv();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new kzv();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new kzv();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        int ai[];
        int k1;
        int j2;
        j2 = kou.b(kog1, 64);
        ai = new int[j2];
        k1 = 0;
        i1 = 0;
_L27:
        if (k1 >= j2) goto _L22; else goto _L21
_L21:
        int k2;
        if (k1 != 0)
        {
            kog1.a();
        }
        k2 = kog1.f();
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
        i2 = kog1.c(kog1.p());
        i1 = kog1.r();
        k1 = 0;
_L33:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
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
        kog1.e(i1);
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
        if (kog1.q() > 0)
        {
            i1 = kog1.f();
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
        kog1.d(i2);
        continue; /* Loop/switch isn't completed */
_L12:
        i = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L13:
        j = kog1.j();
        continue; /* Loop/switch isn't completed */
_L14:
        k = kog1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        l = kog1.j();
        continue; /* Loop/switch isn't completed */
_L16:
        m = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        n = kog1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        o = kog1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        p = kog1.j();
        continue; /* Loop/switch isn't completed */
_L20:
        q = Boolean.valueOf(kog1.i());
        if (true) goto _L35; else goto _L34
_L34:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                String s = d[i1];
                if (s != null)
                {
                    koh1.a(4, s);
                }
            }

        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < h.length; j1++)
            {
                koh1.a(8, h[j1]);
            }

        }
        if (i != null)
        {
            koh1.a(9, i.intValue());
        }
        if (j != null)
        {
            koh1.a(10, j);
        }
        if (k != null)
        {
            koh1.a(11, k);
        }
        if (l != null)
        {
            koh1.a(12, l);
        }
        if (m != null)
        {
            koh1.a(13, m.booleanValue());
        }
        if (n != null)
        {
            koh1.a(14, n);
        }
        if (o != null)
        {
            koh1.a(15, o);
        }
        if (p != null)
        {
            koh1.a(16, p);
        }
        if (q != null)
        {
            koh1.a(17, q.booleanValue());
        }
        super.writeTo(koh1);
    }
}
