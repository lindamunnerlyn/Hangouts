// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcz extends kwm
{

    public Integer A;
    public Integer B;
    public String C;
    public String D;
    public Boolean E;
    public jes F;
    public Integer a;
    public Integer b;
    public String c;
    public String d;
    public String e;
    public byte f[];
    public byte g[];
    public String h;
    public String i[];
    public String j;
    public Integer k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p[];
    public Long q;
    public String r;
    public jdk requestHeader;
    public String s[];
    public String t;
    public String u;
    public Integer v;
    public String w[];
    public String x;
    public String y;
    public String z[];

    public jcz()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = kwx.f;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = kwx.f;
        q = null;
        r = null;
        s = kwx.f;
        t = null;
        u = null;
        v = null;
        w = kwx.f;
        x = null;
        y = null;
        z = kwx.f;
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        F = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (requestHeader != null)
        {
            i1 = j1 + kwk.d(1, requestHeader);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + kwk.e(2, a.intValue());
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.e(3, b.intValue());
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(4, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(5, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.b(7, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.b(8, f);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + kwk.e(9, q.longValue());
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + kwk.b(10, r);
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
                int l3;
                for (k2 = 0; j1 < i.length; k2 = l3)
                {
                    String s1 = i[j1];
                    int i5 = k1;
                    l3 = k2;
                    if (s1 != null)
                    {
                        l3 = k2 + 1;
                        i5 = k1 + kwk.a(s1);
                    }
                    j1++;
                    k1 = i5;
                }

                j1 = i1 + k1 + k2 * 1;
            }
        }
        int l1 = j1;
        if (s != null)
        {
            l1 = j1;
            if (s.length > 0)
            {
                i1 = 0;
                l1 = 0;
                int l2;
                int i4;
                for (l2 = 0; i1 < s.length; l2 = i4)
                {
                    String s2 = s[i1];
                    int j5 = l1;
                    i4 = l2;
                    if (s2 != null)
                    {
                        i4 = l2 + 1;
                        j5 = l1 + kwk.a(s2);
                    }
                    i1++;
                    l1 = j5;
                }

                l1 = j1 + l1 + l2 * 1;
            }
        }
        i1 = l1;
        if (y != null)
        {
            i1 = l1 + kwk.b(13, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1;
            if (z.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int i3;
                int j4;
                for (i3 = 0; j1 < z.length; i3 = j4)
                {
                    String s3 = z[j1];
                    int k5 = l1;
                    j4 = i3;
                    if (s3 != null)
                    {
                        j4 = i3 + 1;
                        k5 = l1 + kwk.a(s3);
                    }
                    j1++;
                    l1 = k5;
                }

                j1 = i1 + l1 + i3 * 1;
            }
        }
        i1 = j1;
        if (C != null)
        {
            i1 = j1 + kwk.b(15, C);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + kwk.b(16, t);
        }
        l1 = j1;
        if (u != null)
        {
            l1 = j1 + kwk.b(17, u);
        }
        i1 = l1;
        if (j != null)
        {
            i1 = l1 + kwk.b(18, j);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1;
            if (w.length > 0)
            {
                j1 = 0;
                int i2 = 0;
                int j3;
                int k4;
                for (j3 = 0; j1 < w.length; j3 = k4)
                {
                    String s4 = w[j1];
                    int l5 = i2;
                    k4 = j3;
                    if (s4 != null)
                    {
                        k4 = j3 + 1;
                        l5 = i2 + kwk.a(s4);
                    }
                    j1++;
                    i2 = l5;
                }

                j1 = i1 + i2 + j3 * 2;
            }
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + kwk.b(20, x);
        }
        j1 = i1;
        if (D != null)
        {
            j1 = i1 + kwk.b(21, D);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.e(22, k.intValue());
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.e(23, v.intValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.b(24, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.b(25, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.b(26, n);
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1 + kwk.e(27, A.intValue());
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + kwk.e(28, B.intValue());
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.b(29, o);
        }
        i1 = j1;
        if (E != null)
        {
            E.booleanValue();
            i1 = j1 + (kwk.f(30) + 1);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                int j2 = 0;
                int k3 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < p.length;)
                {
                    String s5 = p[j1];
                    int i6 = j2;
                    int l4 = k3;
                    if (s5 != null)
                    {
                        l4 = k3 + 1;
                        i6 = j2 + kwk.a(s5);
                    }
                    j1++;
                    j2 = i6;
                    k3 = l4;
                }

                j1 = i1 + j2 + k3 * 2;
            }
        }
        i1 = j1;
        if (F != null)
        {
            i1 = j1 + kwk.d(32, F);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(33, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(34, h);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L36:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 34: default 288
    //                   0: 297
    //                   10: 299
    //                   16: 328
    //                   24: 378
    //                   34: 422
    //                   42: 433
    //                   58: 444
    //                   66: 455
    //                   72: 466
    //                   82: 480
    //                   90: 491
    //                   98: 593
    //                   106: 695
    //                   114: 706
    //                   122: 808
    //                   130: 819
    //                   138: 830
    //                   146: 841
    //                   154: 852
    //                   162: 955
    //                   170: 966
    //                   176: 977
    //                   184: 991
    //                   194: 1005
    //                   202: 1016
    //                   210: 1027
    //                   216: 1038
    //                   224: 1052
    //                   234: 1066
    //                   240: 1077
    //                   250: 1091
    //                   258: 1194
    //                   266: 1223
    //                   274: 1234;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L36; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
          goto _L36
_L4:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            a = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 1: // '\001'
        case 2: // '\002'
            b = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        f = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L10:
        q = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L11:
        r = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        int i3 = kwx.a(kwj1, 90);
        String as[];
        int l1;
        if (i == null)
        {
            l1 = 0;
        } else
        {
            l1 = i.length;
        }
        as = new String[i3 + l1];
        i3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(i, 0, as, 0, l1);
            i3 = l1;
        }
        for (; i3 < as.length - 1; i3++)
        {
            as[i3] = kwj1.j();
            kwj1.a();
        }

        as[i3] = kwj1.j();
        i = as;
        continue; /* Loop/switch isn't completed */
_L13:
        int j3 = kwx.a(kwj1, 98);
        String as1[];
        int i2;
        if (s == null)
        {
            i2 = 0;
        } else
        {
            i2 = s.length;
        }
        as1 = new String[j3 + i2];
        j3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(s, 0, as1, 0, i2);
            j3 = i2;
        }
        for (; j3 < as1.length - 1; j3++)
        {
            as1[j3] = kwj1.j();
            kwj1.a();
        }

        as1[j3] = kwj1.j();
        s = as1;
        continue; /* Loop/switch isn't completed */
_L14:
        y = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        int k3 = kwx.a(kwj1, 114);
        String as2[];
        int j2;
        if (z == null)
        {
            j2 = 0;
        } else
        {
            j2 = z.length;
        }
        as2 = new String[k3 + j2];
        k3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(z, 0, as2, 0, j2);
            k3 = j2;
        }
        for (; k3 < as2.length - 1; k3++)
        {
            as2[k3] = kwj1.j();
            kwj1.a();
        }

        as2[k3] = kwj1.j();
        z = as2;
        continue; /* Loop/switch isn't completed */
_L16:
        C = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        t = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        u = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L20:
        int l3 = kwx.a(kwj1, 154);
        String as3[];
        int k2;
        if (w == null)
        {
            k2 = 0;
        } else
        {
            k2 = w.length;
        }
        as3 = new String[l3 + k2];
        l3 = k2;
        if (k2 != 0)
        {
            System.arraycopy(w, 0, as3, 0, k2);
            l3 = k2;
        }
        for (; l3 < as3.length - 1; l3++)
        {
            as3[l3] = kwj1.j();
            kwj1.a();
        }

        as3[l3] = kwj1.j();
        w = as3;
        continue; /* Loop/switch isn't completed */
_L21:
        x = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L22:
        D = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L23:
        k = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L24:
        v = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L25:
        l = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L26:
        m = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L27:
        n = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L28:
        A = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L29:
        B = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L30:
        o = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L31:
        E = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L32:
        int i4 = kwx.a(kwj1, 250);
        String as4[];
        int l2;
        if (p == null)
        {
            l2 = 0;
        } else
        {
            l2 = p.length;
        }
        as4 = new String[i4 + l2];
        i4 = l2;
        if (l2 != 0)
        {
            System.arraycopy(p, 0, as4, 0, l2);
            i4 = l2;
        }
        for (; i4 < as4.length - 1; i4++)
        {
            as4[i4] = kwj1.j();
            kwj1.a();
        }

        as4[i4] = kwj1.j();
        p = as4;
        continue; /* Loop/switch isn't completed */
_L33:
        if (F == null)
        {
            F = new jes();
        }
        kwj1.a(F);
        continue; /* Loop/switch isn't completed */
_L34:
        g = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L35:
        h = kwj1.j();
        if (true) goto _L36; else goto _L37
_L37:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.a(2, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(3, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        if (d != null)
        {
            kwk1.a(5, d);
        }
        if (e != null)
        {
            kwk1.a(7, e);
        }
        if (f != null)
        {
            kwk1.a(8, f);
        }
        if (q != null)
        {
            kwk1.b(9, q.longValue());
        }
        if (r != null)
        {
            kwk1.a(10, r);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                String s1 = i[i1];
                if (s1 != null)
                {
                    kwk1.a(11, s1);
                }
            }

        }
        if (s != null && s.length > 0)
        {
            for (int j1 = 0; j1 < s.length; j1++)
            {
                String s2 = s[j1];
                if (s2 != null)
                {
                    kwk1.a(12, s2);
                }
            }

        }
        if (y != null)
        {
            kwk1.a(13, y);
        }
        if (z != null && z.length > 0)
        {
            for (int k1 = 0; k1 < z.length; k1++)
            {
                String s3 = z[k1];
                if (s3 != null)
                {
                    kwk1.a(14, s3);
                }
            }

        }
        if (C != null)
        {
            kwk1.a(15, C);
        }
        if (t != null)
        {
            kwk1.a(16, t);
        }
        if (u != null)
        {
            kwk1.a(17, u);
        }
        if (j != null)
        {
            kwk1.a(18, j);
        }
        if (w != null && w.length > 0)
        {
            for (int l1 = 0; l1 < w.length; l1++)
            {
                String s4 = w[l1];
                if (s4 != null)
                {
                    kwk1.a(19, s4);
                }
            }

        }
        if (x != null)
        {
            kwk1.a(20, x);
        }
        if (D != null)
        {
            kwk1.a(21, D);
        }
        if (k != null)
        {
            kwk1.a(22, k.intValue());
        }
        if (v != null)
        {
            kwk1.a(23, v.intValue());
        }
        if (l != null)
        {
            kwk1.a(24, l);
        }
        if (m != null)
        {
            kwk1.a(25, m);
        }
        if (n != null)
        {
            kwk1.a(26, n);
        }
        if (A != null)
        {
            kwk1.a(27, A.intValue());
        }
        if (B != null)
        {
            kwk1.a(28, B.intValue());
        }
        if (o != null)
        {
            kwk1.a(29, o);
        }
        if (E != null)
        {
            kwk1.a(30, E.booleanValue());
        }
        if (p != null && p.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < p.length; i2++)
            {
                String s5 = p[i2];
                if (s5 != null)
                {
                    kwk1.a(31, s5);
                }
            }

        }
        if (F != null)
        {
            kwk1.b(32, F);
        }
        if (g != null)
        {
            kwk1.a(33, g);
        }
        if (h != null)
        {
            kwk1.a(34, h);
        }
        super.writeTo(kwk1);
    }
}
