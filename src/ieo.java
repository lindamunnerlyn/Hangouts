// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ieo extends kwm
{

    public Integer A;
    public Integer B;
    public Boolean C;
    public String D;
    public String E;
    public String F[];
    public Integer G;
    public Integer H;
    public kya I[];
    public idg J[];
    public Long K;
    public Long L;
    public String M[];
    public Boolean N;
    public iep O[];
    public idd P[];
    public Boolean Q;
    public int R;
    public int a;
    public iex b;
    public Boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public String i;
    public int j;
    public String k;
    public String l;
    public String m;
    public iic n;
    public ilv o[];
    public iex p[];
    public String q[];
    public iff r;
    public int s;
    public Boolean t;
    public int u;
    public String v;
    public ikm w[];
    public Integer x;
    public Integer y;
    public Boolean z;

    public ieo()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = 0x80000000;
        k = null;
        l = null;
        m = null;
        n = null;
        o = ilv.a();
        p = iex.a();
        q = kwx.f;
        r = null;
        s = 0x80000000;
        t = null;
        u = 0x80000000;
        v = null;
        w = ikm.a();
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        F = kwx.f;
        G = null;
        H = null;
        I = kya.a();
        J = idg.a();
        K = null;
        L = null;
        M = kwx.f;
        N = null;
        O = iep.a();
        P = idd.a();
        Q = null;
        R = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != 0x80000000)
        {
            i1 = j1 + kwk.e(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.d(2, b);
        }
        j1 += kwk.b(3, f);
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(4, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.e(5, h.intValue());
        }
        j1 += kwk.b(6, i);
        i1 = j1;
        if (j != 0x80000000)
        {
            i1 = j1 + kwk.e(7, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.b(8, k);
        }
        int k1 = j1;
        if (l != null)
        {
            k1 = j1 + kwk.b(9, l);
        }
        i1 = k1;
        if (m != null)
        {
            i1 = k1 + kwk.b(10, m);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                for (j1 = 0; j1 < p.length;)
                {
                    iex iex1 = p[j1];
                    k1 = i1;
                    if (iex1 != null)
                    {
                        k1 = i1 + kwk.d(11, iex1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1;
            if (o.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < o.length;)
                {
                    ilv ilv1 = o[j1];
                    k1 = i1;
                    if (ilv1 != null)
                    {
                        k1 = i1 + kwk.d(12, ilv1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                j1 = 0;
                k1 = 0;
                int j2;
                int i3;
                for (j2 = 0; j1 < q.length; j2 = i3)
                {
                    String s1 = q[j1];
                    int l3 = k1;
                    i3 = j2;
                    if (s1 != null)
                    {
                        i3 = j2 + 1;
                        l3 = k1 + kwk.a(s1);
                    }
                    j1++;
                    k1 = l3;
                }

                j1 = i1 + k1 + j2 * 1;
            }
        }
        k1 = j1;
        if (r != null)
        {
            k1 = j1 + kwk.d(14, r);
        }
        i1 = k1;
        if (s != 0x80000000)
        {
            i1 = k1 + kwk.e(15, s);
        }
        j1 = i1;
        if (F != null)
        {
            j1 = i1;
            if (F.length > 0)
            {
                j1 = 0;
                k1 = 0;
                int k2;
                int j3;
                for (k2 = 0; j1 < F.length; k2 = j3)
                {
                    String s2 = F[j1];
                    int i4 = k1;
                    j3 = k2;
                    if (s2 != null)
                    {
                        j3 = k2 + 1;
                        i4 = k1 + kwk.a(s2);
                    }
                    j1++;
                    k1 = i4;
                }

                j1 = i1 + k1 + k2 * 2;
            }
        }
        i1 = j1;
        if (u != 0x80000000)
        {
            i1 = j1 + kwk.e(17, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.b(18, v);
        }
        i1 = j1;
        if (t != null)
        {
            t.booleanValue();
            i1 = j1 + (kwk.f(19) + 1);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1;
            if (w.length > 0)
            {
                for (j1 = 0; j1 < w.length;)
                {
                    ikm ikm1 = w[j1];
                    k1 = i1;
                    if (ikm1 != null)
                    {
                        k1 = i1 + kwk.d(20, ikm1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + kwk.e(21, x.intValue());
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + kwk.e(22, y.intValue());
        }
        i1 = j1;
        if (z != null)
        {
            z.booleanValue();
            i1 = j1 + (kwk.f(23) + 1);
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1 + kwk.e(24, A.intValue());
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + kwk.e(25, B.intValue());
        }
        j1 = i1;
        if (C != null)
        {
            C.booleanValue();
            j1 = i1 + (kwk.f(26) + 1);
        }
        i1 = j1;
        if (E != null)
        {
            i1 = j1 + kwk.b(27, E);
        }
        j1 = i1;
        if (G != null)
        {
            j1 = i1 + kwk.e(28, G.intValue());
        }
        i1 = j1;
        if (H != null)
        {
            i1 = j1 + kwk.e(29, H.intValue());
        }
        j1 = i1;
        if (I != null)
        {
            j1 = i1;
            if (I.length > 0)
            {
                for (j1 = 0; j1 < I.length;)
                {
                    kya kya1 = I[j1];
                    k1 = i1;
                    if (kya1 != null)
                    {
                        k1 = i1 + kwk.d(30, kya1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + kwk.b(31, D);
        }
        j1 = i1;
        if (K != null)
        {
            j1 = i1 + kwk.e(32, K.longValue());
        }
        i1 = j1;
        if (c != null)
        {
            c.booleanValue();
            i1 = j1 + (kwk.f(33) + 1);
        }
        j1 = i1;
        if (L != null)
        {
            j1 = i1 + kwk.e(34, L.longValue());
        }
        i1 = j1;
        if (M != null)
        {
            i1 = j1;
            if (M.length > 0)
            {
                i1 = 0;
                k1 = 0;
                int l2;
                int k3;
                for (l2 = 0; i1 < M.length; l2 = k3)
                {
                    String s3 = M[i1];
                    int j4 = k1;
                    k3 = l2;
                    if (s3 != null)
                    {
                        k3 = l2 + 1;
                        j4 = k1 + kwk.a(s3);
                    }
                    i1++;
                    k1 = j4;
                }

                i1 = j1 + k1 + l2 * 2;
            }
        }
        k1 = i1;
        if (J != null)
        {
            k1 = i1;
            if (J.length > 0)
            {
                for (j1 = 0; j1 < J.length;)
                {
                    idg idg1 = J[j1];
                    k1 = i1;
                    if (idg1 != null)
                    {
                        k1 = i1 + kwk.d(36, idg1);
                    }
                    j1++;
                    i1 = k1;
                }

                k1 = i1;
            }
        }
        j1 = k1;
        if (N != null)
        {
            N.booleanValue();
            j1 = k1 + (kwk.f(37) + 1);
        }
        i1 = j1;
        if (O != null)
        {
            i1 = j1;
            if (O.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < O.length;)
                {
                    iep iep1 = O[j1];
                    int l1 = i1;
                    if (iep1 != null)
                    {
                        l1 = i1 + kwk.d(38, iep1);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (P != null)
        {
            j1 = i1;
            if (P.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= P.length)
                    {
                        break;
                    }
                    idd idd1 = P[i2];
                    j1 = i1;
                    if (idd1 != null)
                    {
                        j1 = i1 + kwk.d(39, idd1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(40, d);
        }
        j1 = i1;
        if (Q != null)
        {
            Q.booleanValue();
            j1 = i1 + (kwk.f(41) + 1);
        }
        i1 = j1;
        if (R != 0x80000000)
        {
            i1 = j1 + kwk.e(42, R);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.d(43, n);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(44, e);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L47:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 45: default 376
    //                   0: 385
    //                   8: 387
    //                   18: 435
    //                   26: 464
    //                   34: 475
    //                   40: 486
    //                   50: 500
    //                   56: 511
    //                   66: 579
    //                   74: 590
    //                   82: 601
    //                   90: 612
    //                   98: 736
    //                   106: 860
    //                   114: 962
    //                   120: 991
    //                   130: 1047
    //                   136: 1150
    //                   146: 1207
    //                   152: 1218
    //                   162: 1232
    //                   168: 1357
    //                   176: 1371
    //                   184: 1385
    //                   192: 1399
    //                   200: 1413
    //                   208: 1427
    //                   218: 1441
    //                   224: 1452
    //                   232: 1466
    //                   242: 1480
    //                   250: 1605
    //                   256: 1616
    //                   264: 1630
    //                   272: 1644
    //                   282: 1658
    //                   290: 1761
    //                   296: 1886
    //                   306: 1900
    //                   314: 2025
    //                   322: 2150
    //                   328: 2161
    //                   336: 2175
    //                   346: 2223
    //                   354: 2252;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L47; else goto _L2
_L2:
        return this;
_L3:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new iex();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        h = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            j = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        l = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        m = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L13:
        int i5 = kwx.a(kwj1, 90);
        iex aiex[];
        int l1;
        if (p == null)
        {
            l1 = 0;
        } else
        {
            l1 = p.length;
        }
        aiex = new iex[i5 + l1];
        i5 = l1;
        if (l1 != 0)
        {
            System.arraycopy(p, 0, aiex, 0, l1);
            i5 = l1;
        }
        for (; i5 < aiex.length - 1; i5++)
        {
            aiex[i5] = new iex();
            kwj1.a(aiex[i5]);
            kwj1.a();
        }

        aiex[i5] = new iex();
        kwj1.a(aiex[i5]);
        p = aiex;
        continue; /* Loop/switch isn't completed */
_L14:
        int j5 = kwx.a(kwj1, 98);
        ilv ailv[];
        int i2;
        if (o == null)
        {
            i2 = 0;
        } else
        {
            i2 = o.length;
        }
        ailv = new ilv[j5 + i2];
        j5 = i2;
        if (i2 != 0)
        {
            System.arraycopy(o, 0, ailv, 0, i2);
            j5 = i2;
        }
        for (; j5 < ailv.length - 1; j5++)
        {
            ailv[j5] = new ilv();
            kwj1.a(ailv[j5]);
            kwj1.a();
        }

        ailv[j5] = new ilv();
        kwj1.a(ailv[j5]);
        o = ailv;
        continue; /* Loop/switch isn't completed */
_L15:
        int k5 = kwx.a(kwj1, 106);
        String as[];
        int j2;
        if (q == null)
        {
            j2 = 0;
        } else
        {
            j2 = q.length;
        }
        as = new String[k5 + j2];
        k5 = j2;
        if (j2 != 0)
        {
            System.arraycopy(q, 0, as, 0, j2);
            k5 = j2;
        }
        for (; k5 < as.length - 1; k5++)
        {
            as[k5] = kwj1.j();
            kwj1.a();
        }

        as[k5] = kwj1.j();
        q = as;
        continue; /* Loop/switch isn't completed */
_L16:
        if (r == null)
        {
            r = new iff();
        }
        kwj1.a(r);
        continue; /* Loop/switch isn't completed */
_L17:
        int k2 = kwj1.f();
        switch (k2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            s = k2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L18:
        int l5 = kwx.a(kwj1, 130);
        String as1[];
        int l2;
        if (F == null)
        {
            l2 = 0;
        } else
        {
            l2 = F.length;
        }
        as1 = new String[l5 + l2];
        l5 = l2;
        if (l2 != 0)
        {
            System.arraycopy(F, 0, as1, 0, l2);
            l5 = l2;
        }
        for (; l5 < as1.length - 1; l5++)
        {
            as1[l5] = kwj1.j();
            kwj1.a();
        }

        as1[l5] = kwj1.j();
        F = as1;
        continue; /* Loop/switch isn't completed */
_L19:
        int i3 = kwj1.f();
        switch (i3)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            u = i3;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        v = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L21:
        t = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L22:
        int i6 = kwx.a(kwj1, 162);
        ikm aikm[];
        int j3;
        if (w == null)
        {
            j3 = 0;
        } else
        {
            j3 = w.length;
        }
        aikm = new ikm[i6 + j3];
        i6 = j3;
        if (j3 != 0)
        {
            System.arraycopy(w, 0, aikm, 0, j3);
            i6 = j3;
        }
        for (; i6 < aikm.length - 1; i6++)
        {
            aikm[i6] = new ikm();
            kwj1.a(aikm[i6]);
            kwj1.a();
        }

        aikm[i6] = new ikm();
        kwj1.a(aikm[i6]);
        w = aikm;
        continue; /* Loop/switch isn't completed */
_L23:
        x = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L24:
        y = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L25:
        z = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L26:
        A = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L27:
        B = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L28:
        C = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L29:
        E = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L30:
        G = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L31:
        H = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L32:
        int j6 = kwx.a(kwj1, 242);
        kya akya[];
        int k3;
        if (I == null)
        {
            k3 = 0;
        } else
        {
            k3 = I.length;
        }
        akya = new kya[j6 + k3];
        j6 = k3;
        if (k3 != 0)
        {
            System.arraycopy(I, 0, akya, 0, k3);
            j6 = k3;
        }
        for (; j6 < akya.length - 1; j6++)
        {
            akya[j6] = new kya();
            kwj1.a(akya[j6]);
            kwj1.a();
        }

        akya[j6] = new kya();
        kwj1.a(akya[j6]);
        I = akya;
        continue; /* Loop/switch isn't completed */
_L33:
        D = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L34:
        K = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L35:
        c = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L36:
        L = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L37:
        int k6 = kwx.a(kwj1, 282);
        String as2[];
        int l3;
        if (M == null)
        {
            l3 = 0;
        } else
        {
            l3 = M.length;
        }
        as2 = new String[k6 + l3];
        k6 = l3;
        if (l3 != 0)
        {
            System.arraycopy(M, 0, as2, 0, l3);
            k6 = l3;
        }
        for (; k6 < as2.length - 1; k6++)
        {
            as2[k6] = kwj1.j();
            kwj1.a();
        }

        as2[k6] = kwj1.j();
        M = as2;
        continue; /* Loop/switch isn't completed */
_L38:
        int l6 = kwx.a(kwj1, 290);
        idg aidg[];
        int i4;
        if (J == null)
        {
            i4 = 0;
        } else
        {
            i4 = J.length;
        }
        aidg = new idg[l6 + i4];
        l6 = i4;
        if (i4 != 0)
        {
            System.arraycopy(J, 0, aidg, 0, i4);
            l6 = i4;
        }
        for (; l6 < aidg.length - 1; l6++)
        {
            aidg[l6] = new idg();
            kwj1.a(aidg[l6]);
            kwj1.a();
        }

        aidg[l6] = new idg();
        kwj1.a(aidg[l6]);
        J = aidg;
        continue; /* Loop/switch isn't completed */
_L39:
        N = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L40:
        int i7 = kwx.a(kwj1, 306);
        iep aiep[];
        int j4;
        if (O == null)
        {
            j4 = 0;
        } else
        {
            j4 = O.length;
        }
        aiep = new iep[i7 + j4];
        i7 = j4;
        if (j4 != 0)
        {
            System.arraycopy(O, 0, aiep, 0, j4);
            i7 = j4;
        }
        for (; i7 < aiep.length - 1; i7++)
        {
            aiep[i7] = new iep();
            kwj1.a(aiep[i7]);
            kwj1.a();
        }

        aiep[i7] = new iep();
        kwj1.a(aiep[i7]);
        O = aiep;
        continue; /* Loop/switch isn't completed */
_L41:
        int j7 = kwx.a(kwj1, 314);
        idd aidd[];
        int k4;
        if (P == null)
        {
            k4 = 0;
        } else
        {
            k4 = P.length;
        }
        aidd = new idd[j7 + k4];
        j7 = k4;
        if (k4 != 0)
        {
            System.arraycopy(P, 0, aidd, 0, k4);
            j7 = k4;
        }
        for (; j7 < aidd.length - 1; j7++)
        {
            aidd[j7] = new idd();
            kwj1.a(aidd[j7]);
            kwj1.a();
        }

        aidd[j7] = new idd();
        kwj1.a(aidd[j7]);
        P = aidd;
        continue; /* Loop/switch isn't completed */
_L42:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L43:
        Q = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L44:
        int l4 = kwj1.f();
        switch (l4)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            R = l4;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L45:
        if (n == null)
        {
            n = new iic();
        }
        kwj1.a(n);
        continue; /* Loop/switch isn't completed */
_L46:
        e = kwj1.j();
        if (true) goto _L47; else goto _L48
_L48:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        kwk1.a(3, f);
        if (g != null)
        {
            kwk1.a(4, g);
        }
        if (h != null)
        {
            kwk1.a(5, h.intValue());
        }
        kwk1.a(6, i);
        if (j != 0x80000000)
        {
            kwk1.a(7, j);
        }
        if (k != null)
        {
            kwk1.a(8, k);
        }
        if (l != null)
        {
            kwk1.a(9, l);
        }
        if (m != null)
        {
            kwk1.a(10, m);
        }
        if (p != null && p.length > 0)
        {
            for (int i1 = 0; i1 < p.length; i1++)
            {
                iex iex1 = p[i1];
                if (iex1 != null)
                {
                    kwk1.b(11, iex1);
                }
            }

        }
        if (o != null && o.length > 0)
        {
            for (int j1 = 0; j1 < o.length; j1++)
            {
                ilv ilv1 = o[j1];
                if (ilv1 != null)
                {
                    kwk1.b(12, ilv1);
                }
            }

        }
        if (q != null && q.length > 0)
        {
            for (int k1 = 0; k1 < q.length; k1++)
            {
                String s1 = q[k1];
                if (s1 != null)
                {
                    kwk1.a(13, s1);
                }
            }

        }
        if (r != null)
        {
            kwk1.b(14, r);
        }
        if (s != 0x80000000)
        {
            kwk1.a(15, s);
        }
        if (F != null && F.length > 0)
        {
            for (int l1 = 0; l1 < F.length; l1++)
            {
                String s2 = F[l1];
                if (s2 != null)
                {
                    kwk1.a(16, s2);
                }
            }

        }
        if (u != 0x80000000)
        {
            kwk1.a(17, u);
        }
        if (v != null)
        {
            kwk1.a(18, v);
        }
        if (t != null)
        {
            kwk1.a(19, t.booleanValue());
        }
        if (w != null && w.length > 0)
        {
            for (int i2 = 0; i2 < w.length; i2++)
            {
                ikm ikm1 = w[i2];
                if (ikm1 != null)
                {
                    kwk1.b(20, ikm1);
                }
            }

        }
        if (x != null)
        {
            kwk1.a(21, x.intValue());
        }
        if (y != null)
        {
            kwk1.a(22, y.intValue());
        }
        if (z != null)
        {
            kwk1.a(23, z.booleanValue());
        }
        if (A != null)
        {
            kwk1.a(24, A.intValue());
        }
        if (B != null)
        {
            kwk1.a(25, B.intValue());
        }
        if (C != null)
        {
            kwk1.a(26, C.booleanValue());
        }
        if (E != null)
        {
            kwk1.a(27, E);
        }
        if (G != null)
        {
            kwk1.a(28, G.intValue());
        }
        if (H != null)
        {
            kwk1.a(29, H.intValue());
        }
        if (I != null && I.length > 0)
        {
            for (int j2 = 0; j2 < I.length; j2++)
            {
                kya kya1 = I[j2];
                if (kya1 != null)
                {
                    kwk1.b(30, kya1);
                }
            }

        }
        if (D != null)
        {
            kwk1.a(31, D);
        }
        if (K != null)
        {
            kwk1.b(32, K.longValue());
        }
        if (c != null)
        {
            kwk1.a(33, c.booleanValue());
        }
        if (L != null)
        {
            kwk1.b(34, L.longValue());
        }
        if (M != null && M.length > 0)
        {
            for (int k2 = 0; k2 < M.length; k2++)
            {
                String s3 = M[k2];
                if (s3 != null)
                {
                    kwk1.a(35, s3);
                }
            }

        }
        if (J != null && J.length > 0)
        {
            for (int l2 = 0; l2 < J.length; l2++)
            {
                idg idg1 = J[l2];
                if (idg1 != null)
                {
                    kwk1.b(36, idg1);
                }
            }

        }
        if (N != null)
        {
            kwk1.a(37, N.booleanValue());
        }
        if (O != null && O.length > 0)
        {
            for (int i3 = 0; i3 < O.length; i3++)
            {
                iep iep1 = O[i3];
                if (iep1 != null)
                {
                    kwk1.b(38, iep1);
                }
            }

        }
        if (P != null && P.length > 0)
        {
            for (int j3 = ((flag) ? 1 : 0); j3 < P.length; j3++)
            {
                idd idd1 = P[j3];
                if (idd1 != null)
                {
                    kwk1.b(39, idd1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(40, d);
        }
        if (Q != null)
        {
            kwk1.a(41, Q.booleanValue());
        }
        if (R != 0x80000000)
        {
            kwk1.a(42, R);
        }
        if (n != null)
        {
            kwk1.b(43, n);
        }
        if (e != null)
        {
            kwk1.a(44, e);
        }
        super.writeTo(kwk1);
    }
}
