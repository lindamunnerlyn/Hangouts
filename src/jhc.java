// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhc extends kwm
{

    private static volatile jhc B[];
    public String A;
    public String a;
    public Integer b;
    public jhb c;
    public Boolean d;
    public Boolean e;
    public Integer f;
    public Long g;
    public Long h;
    public String i;
    public ixl j;
    public Boolean k;
    public Long l;
    public Long m;
    public String n;
    public Integer o;
    public String p[];
    public Boolean q;
    public Integer r;
    public jia s;
    public Boolean t;
    public Integer u;
    public jha v;
    public Integer w;
    public Integer x;
    public Integer y;
    public int z[];

    public jhc()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = kwx.f;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = kwx.a;
        A = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jhc[] a()
    {
        if (B == null)
        {
            synchronized (kwq.a)
            {
                if (B == null)
                {
                    B = new jhc[0];
                }
            }
        }
        return B;
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
            j1 = i1 + kwk.e(2, b.intValue());
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.d(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            d.booleanValue();
            j1 = i1 + (kwk.f(4) + 1);
        }
        i1 = j1;
        if (e != null)
        {
            e.booleanValue();
            i1 = j1 + (kwk.f(5) + 1);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.e(6, g.longValue());
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.e(7, h.longValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.b(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            k.booleanValue();
            j1 = i1 + (kwk.f(10) + 1);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.e(11, l.longValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.e(12, m.longValue());
        }
        int k1 = j1;
        if (n != null)
        {
            k1 = j1 + kwk.b(13, n);
        }
        i1 = k1;
        if (o != null)
        {
            i1 = k1 + kwk.e(14, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                j1 = 0;
                k1 = 0;
                int i2;
                int j2;
                for (i2 = 0; j1 < p.length; i2 = j2)
                {
                    String s1 = p[j1];
                    int k2 = k1;
                    j2 = i2;
                    if (s1 != null)
                    {
                        j2 = i2 + 1;
                        k2 = k1 + kwk.a(s1);
                    }
                    j1++;
                    k1 = k2;
                }

                j1 = i1 + k1 + i2 * 1;
            }
        }
        i1 = j1;
        if (q != null)
        {
            q.booleanValue();
            i1 = j1 + (kwk.f(16) + 1);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + kwk.d(17, s);
        }
        i1 = j1;
        if (t != null)
        {
            t.booleanValue();
            i1 = j1 + (kwk.f(18) + 1);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.d(19, v);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.e(20, f.intValue());
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + kwk.e(21, w.intValue());
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + kwk.e(22, x.intValue());
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + kwk.e(23, y.intValue());
        }
        k1 = j1;
        if (r != null)
        {
            k1 = j1 + kwk.e(24, r.intValue());
        }
        i1 = k1;
        if (u != null)
        {
            i1 = k1 + kwk.e(25, u.intValue());
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1;
            if (z.length > 0)
            {
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < z.length; j1++)
                {
                    l1 += kwk.e(z[j1]);
                }

                j1 = i1 + l1 + z.length * 2;
            }
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + kwk.b(27, A);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L31:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 29: default 252
    //                   0: 262
    //                   10: 264
    //                   16: 275
    //                   26: 343
    //                   32: 372
    //                   40: 386
    //                   48: 400
    //                   56: 414
    //                   66: 428
    //                   74: 439
    //                   80: 468
    //                   88: 482
    //                   96: 496
    //                   106: 510
    //                   112: 521
    //                   122: 571
    //                   128: 680
    //                   138: 694
    //                   144: 723
    //                   154: 737
    //                   160: 766
    //                   168: 815
    //                   176: 863
    //                   184: 911
    //                   192: 959
    //                   200: 1007
    //                   208: 1055
    //                   210: 1244
    //                   218: 1450;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L31; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L31
_L4:
        i1 = kwj1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            b = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new jhb();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        d = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L7:
        e = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        g = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L9:
        h = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L10:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        if (j == null)
        {
            j = new ixl();
        }
        kwj1.a(j);
        continue; /* Loop/switch isn't completed */
_L12:
        k = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L13:
        l = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L14:
        m = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L15:
        n = kwj1.j();
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
        int j1 = kwx.a(kwj1, 122);
        String as[];
        if (p == null)
        {
            i1 = 0;
        } else
        {
            i1 = p.length;
        }
        as = new String[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(p, 0, as, 0, i1);
            j1 = i1;
        }
        for (; j1 < as.length - 1; j1++)
        {
            as[j1] = kwj1.j();
            kwj1.a();
        }

        as[j1] = kwj1.j();
        p = as;
        continue; /* Loop/switch isn't completed */
_L18:
        q = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L19:
        if (s == null)
        {
            s = new jia();
        }
        kwj1.a(s);
        continue; /* Loop/switch isn't completed */
_L20:
        t = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L21:
        if (v == null)
        {
            v = new jha();
        }
        kwj1.a(v);
        continue; /* Loop/switch isn't completed */
_L22:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L23:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            w = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L24:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            x = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L25:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            y = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L26:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            r = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L27:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            u = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L28:
        int ai[];
        int k1;
        int j2;
        j2 = kwx.a(kwj1, 208);
        ai = new int[j2];
        k1 = 0;
        i1 = 0;
_L37:
        if (k1 >= j2) goto _L33; else goto _L32
_L32:
        int k2;
        if (k1 != 0)
        {
            kwj1.a();
        }
        k2 = kwj1.f();
        k2;
        JVM INSTR tableswitch 0 2: default 1128
    //                   0 1137
    //                   1 1137
    //                   2 1137;
           goto _L34 _L35 _L35 _L35
_L34:
        k1++;
        continue; /* Loop/switch isn't completed */
_L35:
        int l1 = i1 + 1;
        ai[i1] = k2;
        i1 = l1;
        if (true) goto _L34; else goto _L33
_L33:
        if (i1 != 0)
        {
            if (z == null)
            {
                k1 = 0;
            } else
            {
                k1 = z.length;
            }
            if (k1 == 0 && i1 == ai.length)
            {
                z = ai;
            } else
            {
                int ai1[] = new int[k1 + i1];
                if (k1 != 0)
                {
                    System.arraycopy(z, 0, ai1, 0, k1);
                }
                System.arraycopy(ai, 0, ai1, k1, i1);
                z = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L37; else goto _L36
_L36:
_L29:
        int i2;
        i2 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        k1 = 0;
_L43:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k1 == 0) goto _L39; else goto _L38
_L38:
        kwj1.e(i1);
        if (z == null)
        {
            i1 = 0;
        } else
        {
            i1 = z.length;
        }
        ai = new int[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(z, 0, ai, 0, i1);
            k1 = i1;
        }
_L41:
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                ai[k1] = i1;
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        z = ai;
_L39:
        kwj1.d(i2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L41; else goto _L40
_L40:
        if (true) goto _L43; else goto _L42
_L42:
_L30:
        A = kwj1.j();
        if (true) goto _L31; else goto _L44
_L44:
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
            kwk1.a(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.booleanValue());
        }
        if (g != null)
        {
            kwk1.b(6, g.longValue());
        }
        if (h != null)
        {
            kwk1.b(7, h.longValue());
        }
        if (i != null)
        {
            kwk1.a(8, i);
        }
        if (j != null)
        {
            kwk1.b(9, j);
        }
        if (k != null)
        {
            kwk1.a(10, k.booleanValue());
        }
        if (l != null)
        {
            kwk1.b(11, l.longValue());
        }
        if (m != null)
        {
            kwk1.b(12, m.longValue());
        }
        if (n != null)
        {
            kwk1.a(13, n);
        }
        if (o != null)
        {
            kwk1.a(14, o.intValue());
        }
        if (p != null && p.length > 0)
        {
            for (int i1 = 0; i1 < p.length; i1++)
            {
                String s1 = p[i1];
                if (s1 != null)
                {
                    kwk1.a(15, s1);
                }
            }

        }
        if (q != null)
        {
            kwk1.a(16, q.booleanValue());
        }
        if (s != null)
        {
            kwk1.b(17, s);
        }
        if (t != null)
        {
            kwk1.a(18, t.booleanValue());
        }
        if (v != null)
        {
            kwk1.b(19, v);
        }
        if (f != null)
        {
            kwk1.a(20, f.intValue());
        }
        if (w != null)
        {
            kwk1.a(21, w.intValue());
        }
        if (x != null)
        {
            kwk1.a(22, x.intValue());
        }
        if (y != null)
        {
            kwk1.a(23, y.intValue());
        }
        if (r != null)
        {
            kwk1.a(24, r.intValue());
        }
        if (u != null)
        {
            kwk1.a(25, u.intValue());
        }
        if (z != null && z.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < z.length; j1++)
            {
                kwk1.a(26, z[j1]);
            }

        }
        if (A != null)
        {
            kwk1.a(27, A);
        }
        super.writeTo(kwk1);
    }
}
