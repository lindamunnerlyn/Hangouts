// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kxs extends kwm
{

    private static final kxs T[] = new kxs[0];
    public static final kwn a = kwn.a(kxs, 0x13332a4aL);
    public static final kwn b = kwn.a(kxs, 0x13332a4aL);
    public Boolean A;
    public String B;
    public String C;
    public String D;
    public String E;
    public kxc F;
    public kxc G[];
    public Integer H;
    public kxc I;
    public String J;
    public String K;
    public kxc L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public kxo h;
    public String i;
    public kxc j[];
    public kxc k;
    public String l;
    public kxc m[];
    public String n;
    public String o;
    public String p[];
    public String q[];
    public String r[];
    public String s[];
    public kxc t;
    public String u;
    public String v;
    public Integer w;
    public Integer x;
    public String y;
    public kxc z[];

    public kxs()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = kxc.a();
        k = null;
        l = null;
        m = kxc.a();
        n = null;
        o = null;
        p = kwx.f;
        q = kwx.f;
        r = kwx.f;
        s = kwx.f;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = kxc.a();
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        F = null;
        G = kxc.a();
        H = null;
        I = null;
        J = null;
        K = null;
        L = null;
        M = null;
        N = null;
        O = null;
        P = null;
        Q = null;
        R = null;
        S = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(1, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(2, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.b(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(5, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.d(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                for (j1 = 0; j1 < j.length;)
                {
                    kxc kxc1 = j[j1];
                    int k1 = i1;
                    if (kxc1 != null)
                    {
                        k1 = i1 + kwk.d(8, kxc1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        int l1 = j1;
        if (k != null)
        {
            l1 = j1 + kwk.d(9, k);
        }
        i1 = l1;
        if (l != null)
        {
            i1 = l1 + kwk.b(10, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    kxc kxc2 = m[j1];
                    l1 = i1;
                    if (kxc2 != null)
                    {
                        l1 = i1 + kwk.d(11, kxc2);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        l1 = j1;
        if (n != null)
        {
            l1 = j1 + kwk.b(12, n);
        }
        i1 = l1;
        if (o != null)
        {
            i1 = l1 + kwk.b(13, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int j2;
                int j3;
                for (j2 = 0; j1 < p.length; j2 = j3)
                {
                    String s1 = p[j1];
                    int j4 = l1;
                    j3 = j2;
                    if (s1 != null)
                    {
                        j3 = j2 + 1;
                        j4 = l1 + kwk.a(s1);
                    }
                    j1++;
                    l1 = j4;
                }

                j1 = i1 + l1 + j2 * 1;
            }
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1;
            if (q.length > 0)
            {
                i1 = 0;
                l1 = 0;
                int k2;
                int k3;
                for (k2 = 0; i1 < q.length; k2 = k3)
                {
                    String s2 = q[i1];
                    int k4 = l1;
                    k3 = k2;
                    if (s2 != null)
                    {
                        k3 = k2 + 1;
                        k4 = l1 + kwk.a(s2);
                    }
                    i1++;
                    l1 = k4;
                }

                i1 = j1 + l1 + k2 * 1;
            }
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1;
            if (r.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int l2;
                int l3;
                for (l2 = 0; j1 < r.length; l2 = l3)
                {
                    String s3 = r[j1];
                    int l4 = l1;
                    l3 = l2;
                    if (s3 != null)
                    {
                        l3 = l2 + 1;
                        l4 = l1 + kwk.a(s3);
                    }
                    j1++;
                    l1 = l4;
                }

                j1 = i1 + l1 + l2 * 2;
            }
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1;
            if (s.length > 0)
            {
                i1 = 0;
                l1 = 0;
                int i3;
                int i4;
                for (i3 = 0; i1 < s.length; i3 = i4)
                {
                    String s4 = s[i1];
                    int i5 = l1;
                    i4 = i3;
                    if (s4 != null)
                    {
                        i4 = i3 + 1;
                        i5 = l1 + kwk.a(s4);
                    }
                    i1++;
                    l1 = i5;
                }

                i1 = j1 + l1 + i3 * 2;
            }
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + kwk.d(18, t);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + kwk.b(19, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.b(20, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.e(21, w.intValue());
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + kwk.e(22, x.intValue());
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + kwk.b(23, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1;
            if (z.length > 0)
            {
                for (j1 = 0; j1 < z.length;)
                {
                    kxc kxc3 = z[j1];
                    l1 = i1;
                    if (kxc3 != null)
                    {
                        l1 = i1 + kwk.d(42, kxc3);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (A != null)
        {
            A.booleanValue();
            i1 = j1 + (kwk.f(65) + 1);
        }
        j1 = i1;
        if (B != null)
        {
            j1 = i1 + kwk.b(66, B);
        }
        i1 = j1;
        if (C != null)
        {
            i1 = j1 + kwk.b(67, C);
        }
        j1 = i1;
        if (D != null)
        {
            j1 = i1 + kwk.b(68, D);
        }
        l1 = j1;
        if (E != null)
        {
            l1 = j1 + kwk.b(75, E);
        }
        i1 = l1;
        if (F != null)
        {
            i1 = l1 + kwk.d(82, F);
        }
        j1 = i1;
        if (G != null)
        {
            j1 = i1;
            if (G.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= G.length)
                    {
                        break;
                    }
                    kxc kxc4 = G[i2];
                    j1 = i1;
                    if (kxc4 != null)
                    {
                        j1 = i1 + kwk.d(83, kxc4);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (H != null)
        {
            i1 = j1 + kwk.e(90, H.intValue());
        }
        j1 = i1;
        if (I != null)
        {
            j1 = i1 + kwk.d(96, I);
        }
        i1 = j1;
        if (J != null)
        {
            i1 = j1 + kwk.b(111, J);
        }
        j1 = i1;
        if (K != null)
        {
            j1 = i1 + kwk.b(112, K);
        }
        i1 = j1;
        if (L != null)
        {
            i1 = j1 + kwk.d(185, L);
        }
        j1 = i1;
        if (M != null)
        {
            j1 = i1 + kwk.b(188, M);
        }
        i1 = j1;
        if (N != null)
        {
            i1 = j1 + kwk.b(189, N);
        }
        j1 = i1;
        if (O != null)
        {
            j1 = i1 + kwk.b(190, O);
        }
        i1 = j1;
        if (P != null)
        {
            i1 = j1 + kwk.b(191, P);
        }
        j1 = i1;
        if (Q != null)
        {
            j1 = i1 + kwk.b(249, Q);
        }
        i1 = j1;
        if (R != null)
        {
            i1 = j1 + kwk.b(252, R);
        }
        j1 = i1;
        if (S != null)
        {
            j1 = i1 + kwk.b(254, S);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L46:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 44: default 368
    //                   0: 377
    //                   10: 379
    //                   18: 390
    //                   26: 401
    //                   34: 412
    //                   42: 423
    //                   50: 434
    //                   58: 463
    //                   66: 474
    //                   74: 598
    //                   82: 627
    //                   90: 638
    //                   98: 762
    //                   106: 773
    //                   114: 784
    //                   122: 886
    //                   130: 988
    //                   138: 1091
    //                   146: 1194
    //                   154: 1223
    //                   162: 1234
    //                   168: 1245
    //                   176: 1259
    //                   186: 1273
    //                   338: 1284
    //                   520: 1409
    //                   530: 1423
    //                   538: 1434
    //                   546: 1445
    //                   602: 1456
    //                   658: 1467
    //                   666: 1496
    //                   720: 1621
    //                   770: 1662
    //                   890: 1691
    //                   898: 1702
    //                   1482: 1713
    //                   1506: 1742
    //                   1514: 1753
    //                   1522: 1764
    //                   1530: 1775
    //                   1994: 1786
    //                   2018: 1797
    //                   2034: 1808;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L46; else goto _L2
_L2:
        return this;
_L3:
        c = kwj1.j();
          goto _L46
_L4:
        d = kwj1.j();
          goto _L46
_L5:
        e = kwj1.j();
          goto _L46
_L6:
        f = kwj1.j();
          goto _L46
_L7:
        g = kwj1.j();
          goto _L46
_L8:
        if (h == null)
        {
            h = new kxo();
        }
        kwj1.a(h);
          goto _L46
_L9:
        i = kwj1.j();
          goto _L46
_L10:
        int k3 = kwx.a(kwj1, 66);
        kxc akxc[];
        int j1;
        if (j == null)
        {
            j1 = 0;
        } else
        {
            j1 = j.length;
        }
        akxc = new kxc[k3 + j1];
        k3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(j, 0, akxc, 0, j1);
            k3 = j1;
        }
        for (; k3 < akxc.length - 1; k3++)
        {
            akxc[k3] = new kxc();
            kwj1.a(akxc[k3]);
            kwj1.a();
        }

        akxc[k3] = new kxc();
        kwj1.a(akxc[k3]);
        j = akxc;
          goto _L46
_L11:
        if (k == null)
        {
            k = new kxc();
        }
        kwj1.a(k);
          goto _L46
_L12:
        l = kwj1.j();
          goto _L46
_L13:
        int l3 = kwx.a(kwj1, 90);
        kxc akxc1[];
        int k1;
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.length;
        }
        akxc1 = new kxc[l3 + k1];
        l3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(m, 0, akxc1, 0, k1);
            l3 = k1;
        }
        for (; l3 < akxc1.length - 1; l3++)
        {
            akxc1[l3] = new kxc();
            kwj1.a(akxc1[l3]);
            kwj1.a();
        }

        akxc1[l3] = new kxc();
        kwj1.a(akxc1[l3]);
        m = akxc1;
          goto _L46
_L14:
        n = kwj1.j();
          goto _L46
_L15:
        o = kwj1.j();
          goto _L46
_L16:
        int i4 = kwx.a(kwj1, 114);
        String as[];
        int l1;
        if (p == null)
        {
            l1 = 0;
        } else
        {
            l1 = p.length;
        }
        as = new String[i4 + l1];
        i4 = l1;
        if (l1 != 0)
        {
            System.arraycopy(p, 0, as, 0, l1);
            i4 = l1;
        }
        for (; i4 < as.length - 1; i4++)
        {
            as[i4] = kwj1.j();
            kwj1.a();
        }

        as[i4] = kwj1.j();
        p = as;
          goto _L46
_L17:
        int j4 = kwx.a(kwj1, 122);
        String as1[];
        int i2;
        if (q == null)
        {
            i2 = 0;
        } else
        {
            i2 = q.length;
        }
        as1 = new String[j4 + i2];
        j4 = i2;
        if (i2 != 0)
        {
            System.arraycopy(q, 0, as1, 0, i2);
            j4 = i2;
        }
        for (; j4 < as1.length - 1; j4++)
        {
            as1[j4] = kwj1.j();
            kwj1.a();
        }

        as1[j4] = kwj1.j();
        q = as1;
          goto _L46
_L18:
        int k4 = kwx.a(kwj1, 130);
        String as2[];
        int j2;
        if (r == null)
        {
            j2 = 0;
        } else
        {
            j2 = r.length;
        }
        as2 = new String[k4 + j2];
        k4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(r, 0, as2, 0, j2);
            k4 = j2;
        }
        for (; k4 < as2.length - 1; k4++)
        {
            as2[k4] = kwj1.j();
            kwj1.a();
        }

        as2[k4] = kwj1.j();
        r = as2;
          goto _L46
_L19:
        int l4 = kwx.a(kwj1, 138);
        String as3[];
        int k2;
        if (s == null)
        {
            k2 = 0;
        } else
        {
            k2 = s.length;
        }
        as3 = new String[l4 + k2];
        l4 = k2;
        if (k2 != 0)
        {
            System.arraycopy(s, 0, as3, 0, k2);
            l4 = k2;
        }
        for (; l4 < as3.length - 1; l4++)
        {
            as3[l4] = kwj1.j();
            kwj1.a();
        }

        as3[l4] = kwj1.j();
        s = as3;
          goto _L46
_L20:
        if (t == null)
        {
            t = new kxc();
        }
        kwj1.a(t);
          goto _L46
_L21:
        u = kwj1.j();
          goto _L46
_L22:
        v = kwj1.j();
          goto _L46
_L23:
        w = Integer.valueOf(kwj1.f());
          goto _L46
_L24:
        x = Integer.valueOf(kwj1.f());
          goto _L46
_L25:
        y = kwj1.j();
          goto _L46
_L26:
        int i5 = kwx.a(kwj1, 338);
        kxc akxc2[];
        int l2;
        if (z == null)
        {
            l2 = 0;
        } else
        {
            l2 = z.length;
        }
        akxc2 = new kxc[i5 + l2];
        i5 = l2;
        if (l2 != 0)
        {
            System.arraycopy(z, 0, akxc2, 0, l2);
            i5 = l2;
        }
        for (; i5 < akxc2.length - 1; i5++)
        {
            akxc2[i5] = new kxc();
            kwj1.a(akxc2[i5]);
            kwj1.a();
        }

        akxc2[i5] = new kxc();
        kwj1.a(akxc2[i5]);
        z = akxc2;
          goto _L46
_L27:
        A = Boolean.valueOf(kwj1.i());
          goto _L46
_L28:
        B = kwj1.j();
          goto _L46
_L29:
        C = kwj1.j();
          goto _L46
_L30:
        D = kwj1.j();
          goto _L46
_L31:
        E = kwj1.j();
          goto _L46
_L32:
        if (F == null)
        {
            F = new kxc();
        }
        kwj1.a(F);
          goto _L46
_L33:
        int j5 = kwx.a(kwj1, 666);
        kxc akxc3[];
        int i3;
        if (G == null)
        {
            i3 = 0;
        } else
        {
            i3 = G.length;
        }
        akxc3 = new kxc[j5 + i3];
        j5 = i3;
        if (i3 != 0)
        {
            System.arraycopy(G, 0, akxc3, 0, i3);
            j5 = i3;
        }
        for (; j5 < akxc3.length - 1; j5++)
        {
            akxc3[j5] = new kxc();
            kwj1.a(akxc3[j5]);
            kwj1.a();
        }

        akxc3[j5] = new kxc();
        kwj1.a(akxc3[j5]);
        G = akxc3;
          goto _L46
_L34:
        int j3 = kwj1.f();
        switch (j3)
        {
        case 0: // '\0'
        case 1: // '\001'
            H = Integer.valueOf(j3);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L35:
        if (I == null)
        {
            I = new kxc();
        }
        kwj1.a(I);
        continue; /* Loop/switch isn't completed */
_L36:
        J = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L37:
        K = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L38:
        if (L == null)
        {
            L = new kxc();
        }
        kwj1.a(L);
        continue; /* Loop/switch isn't completed */
_L39:
        M = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L40:
        N = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L41:
        O = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L42:
        P = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L43:
        Q = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L44:
        R = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L45:
        S = kwj1.j();
        if (true) goto _L46; else goto _L47
_L47:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (c != null)
        {
            kwk1.a(1, c);
        }
        if (d != null)
        {
            kwk1.a(2, d);
        }
        if (e != null)
        {
            kwk1.a(3, e);
        }
        if (f != null)
        {
            kwk1.a(4, f);
        }
        if (g != null)
        {
            kwk1.a(5, g);
        }
        if (h != null)
        {
            kwk1.b(6, h);
        }
        if (i != null)
        {
            kwk1.a(7, i);
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                kxc kxc1 = j[i1];
                if (kxc1 != null)
                {
                    kwk1.b(8, kxc1);
                }
            }

        }
        if (k != null)
        {
            kwk1.b(9, k);
        }
        if (l != null)
        {
            kwk1.a(10, l);
        }
        if (m != null && m.length > 0)
        {
            for (int j1 = 0; j1 < m.length; j1++)
            {
                kxc kxc2 = m[j1];
                if (kxc2 != null)
                {
                    kwk1.b(11, kxc2);
                }
            }

        }
        if (n != null)
        {
            kwk1.a(12, n);
        }
        if (o != null)
        {
            kwk1.a(13, o);
        }
        if (p != null && p.length > 0)
        {
            for (int k1 = 0; k1 < p.length; k1++)
            {
                String s1 = p[k1];
                if (s1 != null)
                {
                    kwk1.a(14, s1);
                }
            }

        }
        if (q != null && q.length > 0)
        {
            for (int l1 = 0; l1 < q.length; l1++)
            {
                String s2 = q[l1];
                if (s2 != null)
                {
                    kwk1.a(15, s2);
                }
            }

        }
        if (r != null && r.length > 0)
        {
            for (int i2 = 0; i2 < r.length; i2++)
            {
                String s3 = r[i2];
                if (s3 != null)
                {
                    kwk1.a(16, s3);
                }
            }

        }
        if (s != null && s.length > 0)
        {
            for (int j2 = 0; j2 < s.length; j2++)
            {
                String s4 = s[j2];
                if (s4 != null)
                {
                    kwk1.a(17, s4);
                }
            }

        }
        if (t != null)
        {
            kwk1.b(18, t);
        }
        if (u != null)
        {
            kwk1.a(19, u);
        }
        if (v != null)
        {
            kwk1.a(20, v);
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
            kwk1.a(23, y);
        }
        if (z != null && z.length > 0)
        {
            for (int k2 = 0; k2 < z.length; k2++)
            {
                kxc kxc3 = z[k2];
                if (kxc3 != null)
                {
                    kwk1.b(42, kxc3);
                }
            }

        }
        if (A != null)
        {
            kwk1.a(65, A.booleanValue());
        }
        if (B != null)
        {
            kwk1.a(66, B);
        }
        if (C != null)
        {
            kwk1.a(67, C);
        }
        if (D != null)
        {
            kwk1.a(68, D);
        }
        if (E != null)
        {
            kwk1.a(75, E);
        }
        if (F != null)
        {
            kwk1.b(82, F);
        }
        if (G != null && G.length > 0)
        {
            for (int l2 = ((flag) ? 1 : 0); l2 < G.length; l2++)
            {
                kxc kxc4 = G[l2];
                if (kxc4 != null)
                {
                    kwk1.b(83, kxc4);
                }
            }

        }
        if (H != null)
        {
            kwk1.a(90, H.intValue());
        }
        if (I != null)
        {
            kwk1.b(96, I);
        }
        if (J != null)
        {
            kwk1.a(111, J);
        }
        if (K != null)
        {
            kwk1.a(112, K);
        }
        if (L != null)
        {
            kwk1.b(185, L);
        }
        if (M != null)
        {
            kwk1.a(188, M);
        }
        if (N != null)
        {
            kwk1.a(189, N);
        }
        if (O != null)
        {
            kwk1.a(190, O);
        }
        if (P != null)
        {
            kwk1.a(191, P);
        }
        if (Q != null)
        {
            kwk1.a(249, Q);
        }
        if (R != null)
        {
            kwk1.a(252, R);
        }
        if (S != null)
        {
            kwk1.a(254, S);
        }
        super.writeTo(kwk1);
    }

}
