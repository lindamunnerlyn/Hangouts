// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class huh extends koj
{

    public int A;
    public String B;
    public int C;
    public khl D;
    public hut E;
    public int F;
    public String a;
    public String b;
    public String c;
    public Boolean d;
    public String e;
    public String f;
    public Boolean g;
    public String h;
    public String i;
    public huq j;
    public String k;
    public String l;
    public huj m;
    public Integer n;
    public hxl o;
    public Integer p;
    public Long q;
    public Long r;
    public Long s;
    public Long t;
    public huc u;
    public hud v;
    public String w;
    public String x;
    public hus y;
    public String z[];

    public huh()
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
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = kou.f;
        A = 0x80000000;
        B = null;
        C = 0x80000000;
        D = null;
        E = null;
        F = 0x80000000;
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
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.b(2, b);
        }
        i1 = j1;
        if (d != null)
        {
            d.booleanValue();
            i1 = j1 + (koh.f(3) + 1);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.b(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.b(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            g.booleanValue();
            j1 = i1 + (koh.f(6) + 1);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.b(7, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.b(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.b(10, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.b(11, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.d(12, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.e(13, n.intValue());
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.d(14, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.e(15, p.intValue());
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.d(16, q.longValue());
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + koh.d(17, u);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + koh.b(18, w);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + koh.d(19, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1;
            if (z.length > 0)
            {
                int k1 = 0;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < z.length;)
                {
                    String s1 = z[j1];
                    int j2 = k1;
                    int i2 = l1;
                    if (s1 != null)
                    {
                        i2 = l1 + 1;
                        j2 = k1 + koh.a(s1);
                    }
                    j1++;
                    k1 = j2;
                    l1 = i2;
                }

                j1 = i1 + k1 + l1 * 2;
            }
        }
        i1 = j1;
        if (A != 0x80000000)
        {
            i1 = j1 + koh.e(21, A);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.d(22, r.longValue());
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + koh.d(23, s.longValue());
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + koh.d(24, t.longValue());
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + koh.b(25, B);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + koh.d(26, v);
        }
        i1 = j1;
        if (C != 0x80000000)
        {
            i1 = j1 + koh.e(27, C);
        }
        j1 = i1;
        if (D != null)
        {
            j1 = i1 + koh.d(28, D);
        }
        i1 = j1;
        if (E != null)
        {
            i1 = j1 + koh.d(29, E);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + koh.b(30, x);
        }
        i1 = j1;
        if (F != 0x80000000)
        {
            i1 = j1 + koh.e(31, F);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(33, c);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L35:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 33: default 280
    //                   0: 289
    //                   10: 291
    //                   18: 302
    //                   24: 313
    //                   34: 327
    //                   42: 338
    //                   48: 349
    //                   58: 363
    //                   66: 374
    //                   74: 385
    //                   82: 414
    //                   90: 425
    //                   98: 436
    //                   104: 465
    //                   114: 479
    //                   120: 508
    //                   128: 522
    //                   138: 536
    //                   146: 565
    //                   154: 576
    //                   162: 605
    //                   168: 708
    //                   176: 751
    //                   184: 765
    //                   192: 779
    //                   202: 793
    //                   210: 804
    //                   216: 833
    //                   226: 879
    //                   234: 908
    //                   242: 937
    //                   248: 948
    //                   266: 995;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L35; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L35
_L4:
        b = kog1.j();
          goto _L35
_L5:
        d = Boolean.valueOf(kog1.i());
          goto _L35
_L6:
        e = kog1.j();
          goto _L35
_L7:
        f = kog1.j();
          goto _L35
_L8:
        g = Boolean.valueOf(kog1.i());
          goto _L35
_L9:
        h = kog1.j();
          goto _L35
_L10:
        i = kog1.j();
          goto _L35
_L11:
        if (j == null)
        {
            j = new huq();
        }
        kog1.a(j);
          goto _L35
_L12:
        k = kog1.j();
          goto _L35
_L13:
        l = kog1.j();
          goto _L35
_L14:
        if (m == null)
        {
            m = new huj();
        }
        kog1.a(m);
          goto _L35
_L15:
        n = Integer.valueOf(kog1.f());
          goto _L35
_L16:
        if (o == null)
        {
            o = new hxl();
        }
        kog1.a(o);
          goto _L35
_L17:
        p = Integer.valueOf(kog1.f());
          goto _L35
_L18:
        q = Long.valueOf(kog1.d());
          goto _L35
_L19:
        if (u == null)
        {
            u = new huc();
        }
        kog1.a(u);
          goto _L35
_L20:
        w = kog1.j();
          goto _L35
_L21:
        if (y == null)
        {
            y = new hus();
        }
        kog1.a(y);
          goto _L35
_L22:
        int j2 = kou.b(kog1, 162);
        String as[];
        int j1;
        if (z == null)
        {
            j1 = 0;
        } else
        {
            j1 = z.length;
        }
        as = new String[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(z, 0, as, 0, j1);
            j2 = j1;
        }
        for (; j2 < as.length - 1; j2++)
        {
            as[j2] = kog1.j();
            kog1.a();
        }

        as[j2] = kog1.j();
        z = as;
          goto _L35
_L23:
        int k1 = kog1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            A = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L24:
        r = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L25:
        s = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L26:
        t = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L27:
        B = kog1.j();
        continue; /* Loop/switch isn't completed */
_L28:
        if (v == null)
        {
            v = new hud();
        }
        kog1.a(v);
        continue; /* Loop/switch isn't completed */
_L29:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            C = l1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L30:
        if (D == null)
        {
            D = new khl();
        }
        kog1.a(D);
        continue; /* Loop/switch isn't completed */
_L31:
        if (E == null)
        {
            E = new hut();
        }
        kog1.a(E);
        continue; /* Loop/switch isn't completed */
_L32:
        x = kog1.j();
        continue; /* Loop/switch isn't completed */
_L33:
        int i2 = kog1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            F = i2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L34:
        c = kog1.j();
        if (true) goto _L35; else goto _L36
_L36:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (d != null)
        {
            koh1.a(3, d.booleanValue());
        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (f != null)
        {
            koh1.a(5, f);
        }
        if (g != null)
        {
            koh1.a(6, g.booleanValue());
        }
        if (h != null)
        {
            koh1.a(7, h);
        }
        if (i != null)
        {
            koh1.a(8, i);
        }
        if (j != null)
        {
            koh1.b(9, j);
        }
        if (k != null)
        {
            koh1.a(10, k);
        }
        if (l != null)
        {
            koh1.a(11, l);
        }
        if (m != null)
        {
            koh1.b(12, m);
        }
        if (n != null)
        {
            koh1.a(13, n.intValue());
        }
        if (o != null)
        {
            koh1.b(14, o);
        }
        if (p != null)
        {
            koh1.a(15, p.intValue());
        }
        if (q != null)
        {
            koh1.a(16, q.longValue());
        }
        if (u != null)
        {
            koh1.b(17, u);
        }
        if (w != null)
        {
            koh1.a(18, w);
        }
        if (y != null)
        {
            koh1.b(19, y);
        }
        if (z != null && z.length > 0)
        {
            for (int i1 = 0; i1 < z.length; i1++)
            {
                String s1 = z[i1];
                if (s1 != null)
                {
                    koh1.a(20, s1);
                }
            }

        }
        if (A != 0x80000000)
        {
            koh1.a(21, A);
        }
        if (r != null)
        {
            koh1.a(22, r.longValue());
        }
        if (s != null)
        {
            koh1.a(23, s.longValue());
        }
        if (t != null)
        {
            koh1.a(24, t.longValue());
        }
        if (B != null)
        {
            koh1.a(25, B);
        }
        if (v != null)
        {
            koh1.b(26, v);
        }
        if (C != 0x80000000)
        {
            koh1.a(27, C);
        }
        if (D != null)
        {
            koh1.b(28, D);
        }
        if (E != null)
        {
            koh1.b(29, E);
        }
        if (x != null)
        {
            koh1.a(30, x);
        }
        if (F != 0x80000000)
        {
            koh1.a(31, F);
        }
        if (c != null)
        {
            koh1.a(33, c);
        }
        super.writeTo(koh1);
    }
}
