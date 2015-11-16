// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhh extends kwm
{

    private static volatile jhh y[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public Boolean g;
    public jhi h[];
    public String i[];
    public Boolean j;
    public String k;
    public String l;
    public Integer m;
    public Integer n;
    public Integer o;
    public jhz p;
    public Integer q;
    public Boolean r;
    public int s[];
    public Boolean t;
    public kbg u;
    public Long v;
    public Integer w;
    public String x;

    public jhh()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = jhi.a();
        i = kwx.f;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = kwx.a;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jhh[] a()
    {
        if (y == null)
        {
            synchronized (kwq.a)
            {
                if (y == null)
                {
                    y = new jhh[0];
                }
            }
        }
        return y;
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
            i1 = j1 + kwk.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (kwk.f(6) + 1);
        }
        i1 = j1;
        if (g != null)
        {
            g.booleanValue();
            i1 = j1 + (kwk.f(7) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int k2;
                int l2;
                for (k2 = 0; j1 < i.length; k2 = l2)
                {
                    String s1 = i[j1];
                    int i3 = k1;
                    l2 = k2;
                    if (s1 != null)
                    {
                        l2 = k2 + 1;
                        i3 = k1 + kwk.a(s1);
                    }
                    j1++;
                    k1 = i3;
                }

                j1 = i1 + k1 + k2 * 1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            j.booleanValue();
            i1 = j1 + (kwk.f(9) + 1);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.b(10, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.b(11, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.e(12, m.intValue());
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.e(13, n.intValue());
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.e(14, o.intValue());
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.d(16, p);
        }
        int l1 = i1;
        if (q != null)
        {
            l1 = i1 + kwk.e(17, q.intValue());
        }
        j1 = l1;
        if (r != null)
        {
            r.booleanValue();
            j1 = l1 + (kwk.f(18) + 1);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1;
            if (s.length > 0)
            {
                i1 = 0;
                int i2 = 0;
                for (; i1 < s.length; i1++)
                {
                    i2 += kwk.e(s[i1]);
                }

                i1 = j1 + i2 + s.length * 2;
            }
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                int j2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (j2 >= h.length)
                    {
                        break;
                    }
                    jhi jhi1 = h[j2];
                    j1 = i1;
                    if (jhi1 != null)
                    {
                        j1 = i1 + kwk.d(20, jhi1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (t != null)
        {
            t.booleanValue();
            i1 = j1 + (kwk.f(21) + 1);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + kwk.d(22, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + kwk.e(23, v.longValue());
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + kwk.e(24, w.intValue());
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + kwk.b(25, x);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L28:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 26: default 228
    //                   0: 238
    //                   10: 240
    //                   18: 251
    //                   26: 262
    //                   34: 273
    //                   42: 284
    //                   48: 295
    //                   56: 309
    //                   66: 323
    //                   72: 432
    //                   82: 446
    //                   90: 457
    //                   96: 468
    //                   104: 527
    //                   112: 587
    //                   130: 635
    //                   136: 664
    //                   144: 771
    //                   152: 785
    //                   154: 980
    //                   162: 1202
    //                   168: 1334
    //                   178: 1348
    //                   184: 1377
    //                   192: 1391
    //                   202: 1439;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L28; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L28
_L4:
        b = kwj1.j();
          goto _L28
_L5:
        c = kwj1.j();
          goto _L28
_L6:
        d = kwj1.j();
          goto _L28
_L7:
        e = kwj1.j();
          goto _L28
_L8:
        f = Boolean.valueOf(kwj1.i());
          goto _L28
_L9:
        g = Boolean.valueOf(kwj1.i());
          goto _L28
_L10:
        int l1 = kwx.a(kwj1, 66);
        String as[];
        if (i == null)
        {
            i1 = 0;
        } else
        {
            i1 = i.length;
        }
        as = new String[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(i, 0, as, 0, i1);
            l1 = i1;
        }
        for (; l1 < as.length - 1; l1++)
        {
            as[l1] = kwj1.j();
            kwj1.a();
        }

        as[l1] = kwj1.j();
        i = as;
          goto _L28
_L11:
        j = Boolean.valueOf(kwj1.i());
          goto _L28
_L12:
        k = kwj1.j();
          goto _L28
_L13:
        l = kwj1.j();
          goto _L28
_L14:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            m = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        i1 = kwj1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            n = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L16:
        i1 = kwj1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            o = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        if (p == null)
        {
            p = new jhz();
        }
        kwj1.a(p);
        continue; /* Loop/switch isn't completed */
_L18:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
            q = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L19:
        r = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L20:
        int ai[];
        int i2;
        int i3;
        i3 = kwx.a(kwj1, 152);
        ai = new int[i3];
        i2 = 0;
        i1 = 0;
_L34:
        if (i2 >= i3) goto _L30; else goto _L29
_L29:
        int j3;
        if (i2 != 0)
        {
            kwj1.a();
        }
        j3 = kwj1.f();
        j3;
        JVM INSTR tableswitch 0 4: default 864
    //                   0 873
    //                   1 873
    //                   2 873
    //                   3 873
    //                   4 873;
           goto _L31 _L32 _L32 _L32 _L32 _L32
_L31:
        i2++;
        continue; /* Loop/switch isn't completed */
_L32:
        int k2 = i1 + 1;
        ai[i1] = j3;
        i1 = k2;
        if (true) goto _L31; else goto _L30
_L30:
        if (i1 != 0)
        {
            if (s == null)
            {
                i2 = 0;
            } else
            {
                i2 = s.length;
            }
            if (i2 == 0 && i1 == ai.length)
            {
                s = ai;
            } else
            {
                int ai1[] = new int[i2 + i1];
                if (i2 != 0)
                {
                    System.arraycopy(s, 0, ai1, 0, i2);
                }
                System.arraycopy(ai, 0, ai1, i2, i1);
                s = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L34; else goto _L33
_L33:
_L21:
        int l2;
        l2 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        i2 = 0;
_L40:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                i2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i2 == 0) goto _L36; else goto _L35
_L35:
        kwj1.e(i1);
        if (s == null)
        {
            i1 = 0;
        } else
        {
            i1 = s.length;
        }
        ai = new int[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(s, 0, ai, 0, i1);
            i2 = i1;
        }
_L38:
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                ai[i2] = i1;
                i2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        s = ai;
_L36:
        kwj1.d(l2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L38; else goto _L37
_L37:
        if (true) goto _L40; else goto _L39
_L39:
_L22:
        int j2 = kwx.a(kwj1, 162);
        jhi ajhi[];
        int j1;
        if (h == null)
        {
            j1 = 0;
        } else
        {
            j1 = h.length;
        }
        ajhi = new jhi[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(h, 0, ajhi, 0, j1);
            j2 = j1;
        }
        for (; j2 < ajhi.length - 1; j2++)
        {
            ajhi[j2] = new jhi();
            kwj1.a(ajhi[j2]);
            kwj1.a();
        }

        ajhi[j2] = new jhi();
        kwj1.a(ajhi[j2]);
        h = ajhi;
        continue; /* Loop/switch isn't completed */
_L23:
        t = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L24:
        if (u == null)
        {
            u = new kbg();
        }
        kwj1.a(u);
        continue; /* Loop/switch isn't completed */
_L25:
        v = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L26:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            w = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L27:
        x = kwj1.j();
        if (true) goto _L28; else goto _L41
_L41:
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
        if (g != null)
        {
            kwk1.a(7, g.booleanValue());
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                String s1 = i[i1];
                if (s1 != null)
                {
                    kwk1.a(8, s1);
                }
            }

        }
        if (j != null)
        {
            kwk1.a(9, j.booleanValue());
        }
        if (k != null)
        {
            kwk1.a(10, k);
        }
        if (l != null)
        {
            kwk1.a(11, l);
        }
        if (m != null)
        {
            kwk1.a(12, m.intValue());
        }
        if (n != null)
        {
            kwk1.a(13, n.intValue());
        }
        if (o != null)
        {
            kwk1.a(14, o.intValue());
        }
        if (p != null)
        {
            kwk1.b(16, p);
        }
        if (q != null)
        {
            kwk1.a(17, q.intValue());
        }
        if (r != null)
        {
            kwk1.a(18, r.booleanValue());
        }
        if (s != null && s.length > 0)
        {
            for (int j1 = 0; j1 < s.length; j1++)
            {
                kwk1.a(19, s[j1]);
            }

        }
        if (h != null && h.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < h.length; k1++)
            {
                jhi jhi1 = h[k1];
                if (jhi1 != null)
                {
                    kwk1.b(20, jhi1);
                }
            }

        }
        if (t != null)
        {
            kwk1.a(21, t.booleanValue());
        }
        if (u != null)
        {
            kwk1.b(22, u);
        }
        if (v != null)
        {
            kwk1.b(23, v.longValue());
        }
        if (w != null)
        {
            kwk1.a(24, w.intValue());
        }
        if (x != null)
        {
            kwk1.a(25, x);
        }
        super.writeTo(kwk1);
    }
}
