// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class idi extends kwm
{

    private static volatile idi S[];
    public Integer A;
    public Integer B;
    public Boolean C;
    public String D;
    public String E;
    public String F[];
    public Integer G;
    public Integer H;
    public kyh I[];
    public iem J[];
    public Long K;
    public Long L;
    public String M[];
    public Boolean N;
    public idj O[];
    public iej P[];
    public Boolean Q;
    public Integer R;
    public Integer a;
    public idr b;
    public Boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public String i;
    public Integer j;
    public String k;
    public String l;
    public String m;
    public iir n;
    public ink o[];
    public idr p[];
    public String q[];
    public idy r;
    public Integer s;
    public Boolean t;
    public Integer u;
    public String v;
    public imq w[];
    public Integer x;
    public Integer y;
    public Boolean z;

    public idi()
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
        o = ink.a();
        p = idr.a();
        q = kwx.f;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = imq.a();
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
        I = kyh.a();
        J = iem.a();
        K = null;
        L = null;
        M = kwx.f;
        N = null;
        O = idj.a();
        P = iej.a();
        Q = null;
        R = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static idi[] a()
    {
        if (S == null)
        {
            synchronized (kwq.a)
            {
                if (S == null)
                {
                    S = new idi[0];
                }
            }
        }
        return S;
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
            i1 = j1 + kwk.e(1, a.intValue());
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
        if (j != null)
        {
            i1 = j1 + kwk.e(7, j.intValue());
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
                    idr idr1 = p[j1];
                    k1 = i1;
                    if (idr1 != null)
                    {
                        k1 = i1 + kwk.d(11, idr1);
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
                    ink ink1 = o[j1];
                    k1 = i1;
                    if (ink1 != null)
                    {
                        k1 = i1 + kwk.d(12, ink1);
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
        if (s != null)
        {
            i1 = k1 + kwk.e(15, s.intValue());
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
        if (u != null)
        {
            i1 = j1 + kwk.e(17, u.intValue());
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
                    imq imq1 = w[j1];
                    k1 = i1;
                    if (imq1 != null)
                    {
                        k1 = i1 + kwk.d(20, imq1);
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
                    kyh kyh1 = I[j1];
                    k1 = i1;
                    if (kyh1 != null)
                    {
                        k1 = i1 + kwk.d(30, kyh1);
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
                    iem iem1 = J[j1];
                    k1 = i1;
                    if (iem1 != null)
                    {
                        k1 = i1 + kwk.d(36, iem1);
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
                    idj idj1 = O[j1];
                    int l1 = i1;
                    if (idj1 != null)
                    {
                        l1 = i1 + kwk.d(38, idj1);
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
                    iej iej1 = P[i2];
                    j1 = i1;
                    if (iej1 != null)
                    {
                        j1 = i1 + kwk.d(39, iej1);
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
        if (R != null)
        {
            i1 = j1 + kwk.e(42, R.intValue());
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
    //                   18: 438
    //                   26: 467
    //                   34: 478
    //                   40: 489
    //                   50: 503
    //                   56: 514
    //                   66: 586
    //                   74: 597
    //                   82: 608
    //                   90: 619
    //                   98: 743
    //                   106: 867
    //                   114: 969
    //                   120: 998
    //                   130: 1058
    //                   136: 1161
    //                   146: 1218
    //                   152: 1229
    //                   162: 1243
    //                   168: 1368
    //                   176: 1382
    //                   184: 1396
    //                   192: 1410
    //                   200: 1424
    //                   208: 1438
    //                   218: 1452
    //                   224: 1463
    //                   232: 1477
    //                   242: 1491
    //                   250: 1616
    //                   256: 1627
    //                   264: 1641
    //                   272: 1655
    //                   282: 1669
    //                   290: 1772
    //                   296: 1897
    //                   306: 1911
    //                   314: 2036
    //                   322: 2161
    //                   328: 2172
    //                   336: 2186
    //                   346: 2238
    //                   354: 2267;
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
            a = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new idr();
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
            j = Integer.valueOf(k1);
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
        idr aidr[];
        int l1;
        if (p == null)
        {
            l1 = 0;
        } else
        {
            l1 = p.length;
        }
        aidr = new idr[i5 + l1];
        i5 = l1;
        if (l1 != 0)
        {
            System.arraycopy(p, 0, aidr, 0, l1);
            i5 = l1;
        }
        for (; i5 < aidr.length - 1; i5++)
        {
            aidr[i5] = new idr();
            kwj1.a(aidr[i5]);
            kwj1.a();
        }

        aidr[i5] = new idr();
        kwj1.a(aidr[i5]);
        p = aidr;
        continue; /* Loop/switch isn't completed */
_L14:
        int j5 = kwx.a(kwj1, 98);
        ink aink[];
        int i2;
        if (o == null)
        {
            i2 = 0;
        } else
        {
            i2 = o.length;
        }
        aink = new ink[j5 + i2];
        j5 = i2;
        if (i2 != 0)
        {
            System.arraycopy(o, 0, aink, 0, i2);
            j5 = i2;
        }
        for (; j5 < aink.length - 1; j5++)
        {
            aink[j5] = new ink();
            kwj1.a(aink[j5]);
            kwj1.a();
        }

        aink[j5] = new ink();
        kwj1.a(aink[j5]);
        o = aink;
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
            r = new idy();
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
            s = Integer.valueOf(k2);
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
            u = Integer.valueOf(i3);
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
        imq aimq[];
        int j3;
        if (w == null)
        {
            j3 = 0;
        } else
        {
            j3 = w.length;
        }
        aimq = new imq[i6 + j3];
        i6 = j3;
        if (j3 != 0)
        {
            System.arraycopy(w, 0, aimq, 0, j3);
            i6 = j3;
        }
        for (; i6 < aimq.length - 1; i6++)
        {
            aimq[i6] = new imq();
            kwj1.a(aimq[i6]);
            kwj1.a();
        }

        aimq[i6] = new imq();
        kwj1.a(aimq[i6]);
        w = aimq;
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
        kyh akyh[];
        int k3;
        if (I == null)
        {
            k3 = 0;
        } else
        {
            k3 = I.length;
        }
        akyh = new kyh[j6 + k3];
        j6 = k3;
        if (k3 != 0)
        {
            System.arraycopy(I, 0, akyh, 0, k3);
            j6 = k3;
        }
        for (; j6 < akyh.length - 1; j6++)
        {
            akyh[j6] = new kyh();
            kwj1.a(akyh[j6]);
            kwj1.a();
        }

        akyh[j6] = new kyh();
        kwj1.a(akyh[j6]);
        I = akyh;
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
        iem aiem[];
        int i4;
        if (J == null)
        {
            i4 = 0;
        } else
        {
            i4 = J.length;
        }
        aiem = new iem[l6 + i4];
        l6 = i4;
        if (i4 != 0)
        {
            System.arraycopy(J, 0, aiem, 0, i4);
            l6 = i4;
        }
        for (; l6 < aiem.length - 1; l6++)
        {
            aiem[l6] = new iem();
            kwj1.a(aiem[l6]);
            kwj1.a();
        }

        aiem[l6] = new iem();
        kwj1.a(aiem[l6]);
        J = aiem;
        continue; /* Loop/switch isn't completed */
_L39:
        N = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L40:
        int i7 = kwx.a(kwj1, 306);
        idj aidj[];
        int j4;
        if (O == null)
        {
            j4 = 0;
        } else
        {
            j4 = O.length;
        }
        aidj = new idj[i7 + j4];
        i7 = j4;
        if (j4 != 0)
        {
            System.arraycopy(O, 0, aidj, 0, j4);
            i7 = j4;
        }
        for (; i7 < aidj.length - 1; i7++)
        {
            aidj[i7] = new idj();
            kwj1.a(aidj[i7]);
            kwj1.a();
        }

        aidj[i7] = new idj();
        kwj1.a(aidj[i7]);
        O = aidj;
        continue; /* Loop/switch isn't completed */
_L41:
        int j7 = kwx.a(kwj1, 314);
        iej aiej[];
        int k4;
        if (P == null)
        {
            k4 = 0;
        } else
        {
            k4 = P.length;
        }
        aiej = new iej[j7 + k4];
        j7 = k4;
        if (k4 != 0)
        {
            System.arraycopy(P, 0, aiej, 0, k4);
            j7 = k4;
        }
        for (; j7 < aiej.length - 1; j7++)
        {
            aiej[j7] = new iej();
            kwj1.a(aiej[j7]);
            kwj1.a();
        }

        aiej[j7] = new iej();
        kwj1.a(aiej[j7]);
        P = aiej;
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
            R = Integer.valueOf(l4);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L45:
        if (n == null)
        {
            n = new iir();
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
        if (a != null)
        {
            kwk1.a(1, a.intValue());
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
        if (j != null)
        {
            kwk1.a(7, j.intValue());
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
                idr idr1 = p[i1];
                if (idr1 != null)
                {
                    kwk1.b(11, idr1);
                }
            }

        }
        if (o != null && o.length > 0)
        {
            for (int j1 = 0; j1 < o.length; j1++)
            {
                ink ink1 = o[j1];
                if (ink1 != null)
                {
                    kwk1.b(12, ink1);
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
        if (s != null)
        {
            kwk1.a(15, s.intValue());
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
        if (u != null)
        {
            kwk1.a(17, u.intValue());
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
                imq imq1 = w[i2];
                if (imq1 != null)
                {
                    kwk1.b(20, imq1);
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
                kyh kyh1 = I[j2];
                if (kyh1 != null)
                {
                    kwk1.b(30, kyh1);
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
                iem iem1 = J[l2];
                if (iem1 != null)
                {
                    kwk1.b(36, iem1);
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
                idj idj1 = O[i3];
                if (idj1 != null)
                {
                    kwk1.b(38, idj1);
                }
            }

        }
        if (P != null && P.length > 0)
        {
            for (int j3 = ((flag) ? 1 : 0); j3 < P.length; j3++)
            {
                iej iej1 = P[j3];
                if (iej1 != null)
                {
                    kwk1.b(39, iej1);
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
        if (R != null)
        {
            kwk1.a(42, R.intValue());
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
