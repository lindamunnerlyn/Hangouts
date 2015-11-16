// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivw extends kwm
{

    public int A[];
    public Integer B;
    public Integer C;
    public Integer D;
    public Integer E;
    public Integer F;
    public Integer G;
    public Integer H;
    public Integer I;
    public Integer J;
    public Integer K;
    public Integer L;
    public Integer M;
    public Integer N;
    public Integer O;
    public iwc P;
    public ivz Q;
    public Integer R;
    public ivs S[];
    public Integer T;
    public iwe U;
    public String V;
    public String W;
    public iuy X;
    public ivt Y;
    public iwi Z[];
    public Boolean a;
    public iwg aa;
    public byte ab[];
    public String b[];
    public int c[];
    public Integer d;
    public Integer e;
    public Integer f;
    public byte g[];
    public String h;
    public String i;
    public String j;
    public String k;
    public iwh l;
    public Long m;
    public int n;
    public String o[];
    public String p[];
    public String q;
    public String r[];
    public Integer s;
    public Integer t;
    public String u;
    public int v[];
    public String w;
    public int x;
    public agu y;
    public ivx z;

    public ivw()
    {
        a = null;
        b = kwx.f;
        c = kwx.a;
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
        n = 0x80000000;
        o = kwx.f;
        p = kwx.f;
        q = null;
        r = kwx.f;
        s = null;
        t = null;
        u = null;
        v = kwx.a;
        w = null;
        x = 0x80000000;
        y = null;
        z = null;
        A = kwx.a;
        B = null;
        C = null;
        D = null;
        E = null;
        F = null;
        G = null;
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
        S = ivs.a();
        T = null;
        U = null;
        V = null;
        W = null;
        X = null;
        Y = null;
        Z = iwi.a();
        aa = null;
        ab = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        a.booleanValue();
        int j1 = i1 + (kwk.f(2) + 1);
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.f(3, d.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(6, j);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.d(7, l);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1;
            if (v.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                for (; j1 < v.length; j1++)
                {
                    k1 += kwk.h(v[j1]);
                }

                j1 = i1 + k1 + v.length * 1;
            }
        }
        i1 = j1;
        if (m != null)
        {
            m.longValue();
            i1 = j1 + (kwk.f(12) + 8);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(14, g);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.f(15, f.intValue());
        }
        j1 = i1;
        if (n != 0x80000000)
        {
            j1 = i1 + kwk.e(16, n);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(18, k);
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + kwk.d(19, y);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + kwk.e(21, s.intValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.b(22, i);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.b(23, w);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1;
            if (o.length > 0)
            {
                j1 = 0;
                int l1 = 0;
                int i4;
                int i5;
                for (i4 = 0; j1 < o.length; i4 = i5)
                {
                    String s1 = o[j1];
                    int i6 = l1;
                    i5 = i4;
                    if (s1 != null)
                    {
                        i5 = i4 + 1;
                        i6 = l1 + kwk.a(s1);
                    }
                    j1++;
                    l1 = i6;
                }

                j1 = i1 + l1 + i4 * 2;
            }
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.b(25, q);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1;
            if (b.length > 0)
            {
                j1 = 0;
                int i2 = 0;
                int j4;
                int j5;
                for (j4 = 0; j1 < b.length; j4 = j5)
                {
                    String s2 = b[j1];
                    int j6 = i2;
                    j5 = j4;
                    if (s2 != null)
                    {
                        j5 = j4 + 1;
                        j6 = i2 + kwk.a(s2);
                    }
                    j1++;
                    i2 = j6;
                }

                j1 = i1 + i2 + j4 * 2;
            }
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + kwk.d(29, z);
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1;
            if (A.length > 0)
            {
                j1 = 0;
                int j2 = 0;
                for (; j1 < A.length; j1++)
                {
                    j2 += kwk.e(A[j1]);
                }

                j1 = i1 + j2 + A.length * 2;
            }
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + kwk.e(32, B.intValue());
        }
        j1 = i1;
        if (C != null)
        {
            j1 = i1 + kwk.e(33, C.intValue());
        }
        i1 = j1;
        if (J != null)
        {
            i1 = j1 + kwk.e(34, J.intValue());
        }
        j1 = i1;
        if (K != null)
        {
            j1 = i1 + kwk.e(35, K.intValue());
        }
        i1 = j1;
        if (N != null)
        {
            i1 = j1 + kwk.e(36, N.intValue());
        }
        j1 = i1;
        if (P != null)
        {
            j1 = i1 + kwk.d(37, P);
        }
        i1 = j1;
        if (Q != null)
        {
            i1 = j1 + kwk.d(38, Q);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + kwk.e(39, t.intValue());
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + kwk.b(40, u);
        }
        j1 = i1;
        if (D != null)
        {
            j1 = i1 + kwk.e(41, D.intValue());
        }
        i1 = j1;
        if (E != null)
        {
            i1 = j1 + kwk.e(42, E.intValue());
        }
        j1 = i1;
        if (F != null)
        {
            j1 = i1 + kwk.e(43, F.intValue());
        }
        i1 = j1;
        if (G != null)
        {
            i1 = j1 + kwk.e(44, G.intValue());
        }
        j1 = i1;
        if (L != null)
        {
            j1 = i1 + kwk.e(45, L.intValue());
        }
        i1 = j1;
        if (M != null)
        {
            i1 = j1 + kwk.e(46, M.intValue());
        }
        j1 = i1;
        if (H != null)
        {
            j1 = i1 + kwk.e(47, H.intValue());
        }
        i1 = j1;
        if (I != null)
        {
            i1 = j1 + kwk.e(48, I.intValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.f(49, e.intValue());
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(50, h);
        }
        j1 = i1;
        if (R != null)
        {
            j1 = i1 + kwk.f(51, R.intValue());
        }
        i1 = j1;
        if (x != 0x80000000)
        {
            i1 = j1 + kwk.e(52, x);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1;
            if (r.length > 0)
            {
                j1 = 0;
                int k2 = 0;
                int k4;
                int k5;
                for (k4 = 0; j1 < r.length; k4 = k5)
                {
                    String s3 = r[j1];
                    int k6 = k2;
                    k5 = k4;
                    if (s3 != null)
                    {
                        k5 = k4 + 1;
                        k6 = k2 + kwk.a(s3);
                    }
                    j1++;
                    k2 = k6;
                }

                j1 = i1 + k2 + k4 * 2;
            }
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1;
            if (c.length > 0)
            {
                i1 = 0;
                int l2 = 0;
                for (; i1 < c.length; i1++)
                {
                    l2 += kwk.e(c[i1]);
                }

                i1 = j1 + l2 + c.length * 2;
            }
        }
        j1 = i1;
        if (O != null)
        {
            j1 = i1 + kwk.e(56, O.intValue());
        }
        i1 = j1;
        if (T != null)
        {
            i1 = j1 + kwk.f(57, T.intValue());
        }
        j1 = i1;
        if (S != null)
        {
            j1 = i1;
            if (S.length > 0)
            {
                for (j1 = 0; j1 < S.length;)
                {
                    ivs ivs1 = S[j1];
                    int i3 = i1;
                    if (ivs1 != null)
                    {
                        i3 = i1 + kwk.d(58, ivs1);
                    }
                    j1++;
                    i1 = i3;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (U != null)
        {
            i1 = j1 + kwk.d(59, U);
        }
        int j3 = i1;
        if (V != null)
        {
            j3 = i1 + kwk.b(60, V);
        }
        j1 = j3;
        if (Y != null)
        {
            j1 = j3 + kwk.d(61, Y);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1;
            if (p.length > 0)
            {
                i1 = 0;
                int k3 = 0;
                int l4;
                int l5;
                for (l4 = 0; i1 < p.length; l4 = l5)
                {
                    String s4 = p[i1];
                    int l6 = k3;
                    l5 = l4;
                    if (s4 != null)
                    {
                        l5 = l4 + 1;
                        l6 = k3 + kwk.a(s4);
                    }
                    i1++;
                    k3 = l6;
                }

                i1 = j1 + k3 + l4 * 2;
            }
        }
        j1 = i1;
        if (Z != null)
        {
            j1 = i1;
            if (Z.length > 0)
            {
                int l3 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l3 >= Z.length)
                    {
                        break;
                    }
                    iwi iwi1 = Z[l3];
                    j1 = i1;
                    if (iwi1 != null)
                    {
                        j1 = i1 + kwk.d(63, iwi1);
                    }
                    l3++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (W != null)
        {
            i1 = j1 + kwk.b(64, W);
        }
        j1 = i1;
        if (X != null)
        {
            j1 = i1 + kwk.d(65, X);
        }
        i1 = j1;
        if (aa != null)
        {
            i1 = j1 + kwk.d(66, aa);
        }
        j1 = i1;
        if (ab != null)
        {
            j1 = i1 + kwk.b(67, ab);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L60:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 58: default 484
    //                   0: 494
    //                   16: 496
    //                   24: 510
    //                   50: 524
    //                   58: 535
    //                   64: 564
    //                   66: 672
    //                   97: 809
    //                   114: 823
    //                   120: 834
    //                   128: 848
    //                   146: 896
    //                   154: 907
    //                   168: 936
    //                   178: 950
    //                   186: 961
    //                   194: 972
    //                   202: 1082
    //                   210: 1093
    //                   234: 1203
    //                   240: 1232
    //                   242: 1341
    //                   256: 1478
    //                   264: 1492
    //                   272: 1506
    //                   280: 1520
    //                   288: 1534
    //                   298: 1548
    //                   306: 1577
    //                   312: 1606
    //                   322: 1620
    //                   328: 1631
    //                   336: 1645
    //                   344: 1659
    //                   352: 1673
    //                   360: 1687
    //                   368: 1701
    //                   376: 1715
    //                   384: 1729
    //                   392: 1743
    //                   402: 1757
    //                   408: 1768
    //                   416: 1782
    //                   426: 1884
    //                   432: 1994
    //                   434: 2400
    //                   448: 3046
    //                   456: 3060
    //                   466: 3074
    //                   474: 3206
    //                   482: 3235
    //                   490: 3246
    //                   498: 3275
    //                   506: 3385
    //                   514: 3517
    //                   522: 3528
    //                   530: 3557
    //                   538: 3586;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L60; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kwj1.i());
          goto _L60
_L4:
        d = Integer.valueOf(kwj1.l());
          goto _L60
_L5:
        j = kwj1.j();
          goto _L60
_L6:
        if (l == null)
        {
            l = new iwh();
        }
        kwj1.a(l);
          goto _L60
_L7:
        int i2 = kwx.a(kwj1, 64);
        int ai[];
        if (v == null)
        {
            i1 = 0;
        } else
        {
            i1 = v.length;
        }
        ai = new int[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(v, 0, ai, 0, i1);
            i2 = i1;
        }
        for (; i2 < ai.length - 1; i2++)
        {
            ai[i2] = kwj1.l();
            kwj1.a();
        }

        ai[i2] = kwj1.l();
        v = ai;
          goto _L60
_L8:
        int l4 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        int j2;
        for (j2 = 0; kwj1.q() > 0; j2++)
        {
            kwj1.l();
        }

        kwj1.e(i1);
        int ai1[];
        if (v == null)
        {
            i1 = 0;
        } else
        {
            i1 = v.length;
        }
        ai1 = new int[j2 + i1];
        j2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(v, 0, ai1, 0, i1);
            j2 = i1;
        }
        for (; j2 < ai1.length; j2++)
        {
            ai1[j2] = kwj1.l();
        }

        v = ai1;
        kwj1.d(l4);
          goto _L60
_L9:
        m = Long.valueOf(kwj1.g());
          goto _L60
_L10:
        g = kwj1.k();
          goto _L60
_L11:
        f = Integer.valueOf(kwj1.l());
          goto _L60
_L12:
        i1 = kwj1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            n = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L14:
        if (y == null)
        {
            y = new agu();
        }
        kwj1.a(y);
        continue; /* Loop/switch isn't completed */
_L15:
        s = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L16:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        w = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        int k2 = kwx.a(kwj1, 194);
        String as[];
        if (o == null)
        {
            i1 = 0;
        } else
        {
            i1 = o.length;
        }
        as = new String[k2 + i1];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(o, 0, as, 0, i1);
            k2 = i1;
        }
        for (; k2 < as.length - 1; k2++)
        {
            as[k2] = kwj1.j();
            kwj1.a();
        }

        as[k2] = kwj1.j();
        o = as;
        continue; /* Loop/switch isn't completed */
_L19:
        q = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L20:
        int l2 = kwx.a(kwj1, 210);
        String as1[];
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.length;
        }
        as1 = new String[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(b, 0, as1, 0, i1);
            l2 = i1;
        }
        for (; l2 < as1.length - 1; l2++)
        {
            as1[l2] = kwj1.j();
            kwj1.a();
        }

        as1[l2] = kwj1.j();
        b = as1;
        continue; /* Loop/switch isn't completed */
_L21:
        if (z == null)
        {
            z = new ivx();
        }
        kwj1.a(z);
        continue; /* Loop/switch isn't completed */
_L22:
        int i3 = kwx.a(kwj1, 240);
        int ai2[];
        if (A == null)
        {
            i1 = 0;
        } else
        {
            i1 = A.length;
        }
        ai2 = new int[i3 + i1];
        i3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(A, 0, ai2, 0, i1);
            i3 = i1;
        }
        for (; i3 < ai2.length - 1; i3++)
        {
            ai2[i3] = kwj1.f();
            kwj1.a();
        }

        ai2[i3] = kwj1.f();
        A = ai2;
        continue; /* Loop/switch isn't completed */
_L23:
        int i5 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        int j3;
        for (j3 = 0; kwj1.q() > 0; j3++)
        {
            kwj1.f();
        }

        kwj1.e(i1);
        int ai3[];
        if (A == null)
        {
            i1 = 0;
        } else
        {
            i1 = A.length;
        }
        ai3 = new int[j3 + i1];
        j3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(A, 0, ai3, 0, i1);
            j3 = i1;
        }
        for (; j3 < ai3.length; j3++)
        {
            ai3[j3] = kwj1.f();
        }

        A = ai3;
        kwj1.d(i5);
        continue; /* Loop/switch isn't completed */
_L24:
        B = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L25:
        C = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L26:
        J = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L27:
        K = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L28:
        N = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L29:
        if (P == null)
        {
            P = new iwc();
        }
        kwj1.a(P);
        continue; /* Loop/switch isn't completed */
_L30:
        if (Q == null)
        {
            Q = new ivz();
        }
        kwj1.a(Q);
        continue; /* Loop/switch isn't completed */
_L31:
        t = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L32:
        u = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L33:
        D = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L34:
        E = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L35:
        F = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L36:
        G = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L37:
        L = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L38:
        M = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L39:
        H = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L40:
        I = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L41:
        e = Integer.valueOf(kwj1.l());
        continue; /* Loop/switch isn't completed */
_L42:
        h = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L43:
        R = Integer.valueOf(kwj1.l());
        continue; /* Loop/switch isn't completed */
_L44:
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
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
            x = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L45:
        int k3 = kwx.a(kwj1, 426);
        String as2[];
        if (r == null)
        {
            i1 = 0;
        } else
        {
            i1 = r.length;
        }
        as2 = new String[k3 + i1];
        k3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(r, 0, as2, 0, i1);
            k3 = i1;
        }
        for (; k3 < as2.length - 1; k3++)
        {
            as2[k3] = kwj1.j();
            kwj1.a();
        }

        as2[k3] = kwj1.j();
        r = as2;
        continue; /* Loop/switch isn't completed */
_L46:
        int ai4[];
        int l3;
        int l5;
        l5 = kwx.a(kwj1, 432);
        ai4 = new int[l5];
        l3 = 0;
        i1 = 0;
_L66:
        if (l3 >= l5) goto _L62; else goto _L61
_L61:
        int i6;
        if (l3 != 0)
        {
            kwj1.a();
        }
        i6 = kwj1.f();
        i6;
        JVM INSTR tableswitch 0 57: default 2284
    //                   0 2293
    //                   1 2293
    //                   2 2293
    //                   3 2293
    //                   4 2293
    //                   5 2293
    //                   6 2293
    //                   7 2293
    //                   8 2293
    //                   9 2293
    //                   10 2293
    //                   11 2293
    //                   12 2293
    //                   13 2293
    //                   14 2293
    //                   15 2293
    //                   16 2293
    //                   17 2293
    //                   18 2293
    //                   19 2293
    //                   20 2293
    //                   21 2293
    //                   22 2293
    //                   23 2293
    //                   24 2293
    //                   25 2293
    //                   26 2293
    //                   27 2293
    //                   28 2293
    //                   29 2293
    //                   30 2284
    //                   31 2293
    //                   32 2293
    //                   33 2293
    //                   34 2293
    //                   35 2293
    //                   36 2293
    //                   37 2293
    //                   38 2293
    //                   39 2293
    //                   40 2293
    //                   41 2293
    //                   42 2293
    //                   43 2293
    //                   44 2293
    //                   45 2293
    //                   46 2293
    //                   47 2293
    //                   48 2293
    //                   49 2293
    //                   50 2293
    //                   51 2293
    //                   52 2293
    //                   53 2293
    //                   54 2293
    //                   55 2293
    //                   56 2293
    //                   57 2293;
           goto _L63 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L63 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64 _L64
_L63:
        l3++;
        continue; /* Loop/switch isn't completed */
_L64:
        int j5 = i1 + 1;
        ai4[i1] = i6;
        i1 = j5;
        if (true) goto _L63; else goto _L62
_L62:
        if (i1 != 0)
        {
            if (c == null)
            {
                l3 = 0;
            } else
            {
                l3 = c.length;
            }
            if (l3 == 0 && i1 == ai4.length)
            {
                c = ai4;
            } else
            {
                int ai5[] = new int[l3 + i1];
                if (l3 != 0)
                {
                    System.arraycopy(c, 0, ai5, 0, l3);
                }
                System.arraycopy(ai4, 0, ai5, l3, i1);
                c = ai5;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L66; else goto _L65
_L65:
_L47:
        int k5;
        k5 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        l3 = 0;
_L72:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
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
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
            case 35: // '#'
            case 36: // '$'
            case 37: // '%'
            case 38: // '&'
            case 39: // '\''
            case 40: // '('
            case 41: // ')'
            case 42: // '*'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
            case 57: // '9'
                l3++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l3 == 0) goto _L68; else goto _L67
_L67:
        kwj1.e(i1);
        if (c == null)
        {
            i1 = 0;
        } else
        {
            i1 = c.length;
        }
        ai4 = new int[l3 + i1];
        l3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(c, 0, ai4, 0, i1);
            l3 = i1;
        }
_L70:
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
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
            case 35: // '#'
            case 36: // '$'
            case 37: // '%'
            case 38: // '&'
            case 39: // '\''
            case 40: // '('
            case 41: // ')'
            case 42: // '*'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
            case 57: // '9'
                ai4[l3] = i1;
                l3++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        c = ai4;
_L68:
        kwj1.d(k5);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L70; else goto _L69
_L69:
        if (true) goto _L72; else goto _L71
_L71:
_L48:
        O = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L49:
        T = Integer.valueOf(kwj1.l());
        continue; /* Loop/switch isn't completed */
_L50:
        int i4 = kwx.a(kwj1, 466);
        ivs aivs[];
        int j1;
        if (S == null)
        {
            j1 = 0;
        } else
        {
            j1 = S.length;
        }
        aivs = new ivs[i4 + j1];
        i4 = j1;
        if (j1 != 0)
        {
            System.arraycopy(S, 0, aivs, 0, j1);
            i4 = j1;
        }
        for (; i4 < aivs.length - 1; i4++)
        {
            aivs[i4] = new ivs();
            kwj1.a(aivs[i4]);
            kwj1.a();
        }

        aivs[i4] = new ivs();
        kwj1.a(aivs[i4]);
        S = aivs;
        continue; /* Loop/switch isn't completed */
_L51:
        if (U == null)
        {
            U = new iwe();
        }
        kwj1.a(U);
        continue; /* Loop/switch isn't completed */
_L52:
        V = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L53:
        if (Y == null)
        {
            Y = new ivt();
        }
        kwj1.a(Y);
        continue; /* Loop/switch isn't completed */
_L54:
        int j4 = kwx.a(kwj1, 498);
        String as3[];
        int k1;
        if (p == null)
        {
            k1 = 0;
        } else
        {
            k1 = p.length;
        }
        as3 = new String[j4 + k1];
        j4 = k1;
        if (k1 != 0)
        {
            System.arraycopy(p, 0, as3, 0, k1);
            j4 = k1;
        }
        for (; j4 < as3.length - 1; j4++)
        {
            as3[j4] = kwj1.j();
            kwj1.a();
        }

        as3[j4] = kwj1.j();
        p = as3;
        continue; /* Loop/switch isn't completed */
_L55:
        int k4 = kwx.a(kwj1, 506);
        iwi aiwi[];
        int l1;
        if (Z == null)
        {
            l1 = 0;
        } else
        {
            l1 = Z.length;
        }
        aiwi = new iwi[k4 + l1];
        k4 = l1;
        if (l1 != 0)
        {
            System.arraycopy(Z, 0, aiwi, 0, l1);
            k4 = l1;
        }
        for (; k4 < aiwi.length - 1; k4++)
        {
            aiwi[k4] = new iwi();
            kwj1.a(aiwi[k4]);
            kwj1.a();
        }

        aiwi[k4] = new iwi();
        kwj1.a(aiwi[k4]);
        Z = aiwi;
        continue; /* Loop/switch isn't completed */
_L56:
        W = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L57:
        if (X == null)
        {
            X = new iuy();
        }
        kwj1.a(X);
        continue; /* Loop/switch isn't completed */
_L58:
        if (aa == null)
        {
            aa = new iwg();
        }
        kwj1.a(aa);
        continue; /* Loop/switch isn't completed */
_L59:
        ab = kwj1.k();
        if (true) goto _L60; else goto _L73
_L73:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(2, a.booleanValue());
        if (d != null)
        {
            kwk1.c(3, d.intValue());
        }
        if (j != null)
        {
            kwk1.a(6, j);
        }
        if (l != null)
        {
            kwk1.b(7, l);
        }
        if (v != null && v.length > 0)
        {
            for (int i1 = 0; i1 < v.length; i1++)
            {
                kwk1.c(8, v[i1]);
            }

        }
        if (m != null)
        {
            kwk1.c(12, m.longValue());
        }
        if (g != null)
        {
            kwk1.a(14, g);
        }
        if (f != null)
        {
            kwk1.c(15, f.intValue());
        }
        if (n != 0x80000000)
        {
            kwk1.a(16, n);
        }
        if (k != null)
        {
            kwk1.a(18, k);
        }
        if (y != null)
        {
            kwk1.b(19, y);
        }
        if (s != null)
        {
            kwk1.a(21, s.intValue());
        }
        if (i != null)
        {
            kwk1.a(22, i);
        }
        if (w != null)
        {
            kwk1.a(23, w);
        }
        if (o != null && o.length > 0)
        {
            for (int j1 = 0; j1 < o.length; j1++)
            {
                String s1 = o[j1];
                if (s1 != null)
                {
                    kwk1.a(24, s1);
                }
            }

        }
        if (q != null)
        {
            kwk1.a(25, q);
        }
        if (b != null && b.length > 0)
        {
            for (int k1 = 0; k1 < b.length; k1++)
            {
                String s2 = b[k1];
                if (s2 != null)
                {
                    kwk1.a(26, s2);
                }
            }

        }
        if (z != null)
        {
            kwk1.b(29, z);
        }
        if (A != null && A.length > 0)
        {
            for (int l1 = 0; l1 < A.length; l1++)
            {
                kwk1.a(30, A[l1]);
            }

        }
        if (B != null)
        {
            kwk1.a(32, B.intValue());
        }
        if (C != null)
        {
            kwk1.a(33, C.intValue());
        }
        if (J != null)
        {
            kwk1.a(34, J.intValue());
        }
        if (K != null)
        {
            kwk1.a(35, K.intValue());
        }
        if (N != null)
        {
            kwk1.a(36, N.intValue());
        }
        if (P != null)
        {
            kwk1.b(37, P);
        }
        if (Q != null)
        {
            kwk1.b(38, Q);
        }
        if (t != null)
        {
            kwk1.a(39, t.intValue());
        }
        if (u != null)
        {
            kwk1.a(40, u);
        }
        if (D != null)
        {
            kwk1.a(41, D.intValue());
        }
        if (E != null)
        {
            kwk1.a(42, E.intValue());
        }
        if (F != null)
        {
            kwk1.a(43, F.intValue());
        }
        if (G != null)
        {
            kwk1.a(44, G.intValue());
        }
        if (L != null)
        {
            kwk1.a(45, L.intValue());
        }
        if (M != null)
        {
            kwk1.a(46, M.intValue());
        }
        if (H != null)
        {
            kwk1.a(47, H.intValue());
        }
        if (I != null)
        {
            kwk1.a(48, I.intValue());
        }
        if (e != null)
        {
            kwk1.c(49, e.intValue());
        }
        if (h != null)
        {
            kwk1.a(50, h);
        }
        if (R != null)
        {
            kwk1.c(51, R.intValue());
        }
        if (x != 0x80000000)
        {
            kwk1.a(52, x);
        }
        if (r != null && r.length > 0)
        {
            for (int i2 = 0; i2 < r.length; i2++)
            {
                String s3 = r[i2];
                if (s3 != null)
                {
                    kwk1.a(53, s3);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j2 = 0; j2 < c.length; j2++)
            {
                kwk1.a(54, c[j2]);
            }

        }
        if (O != null)
        {
            kwk1.a(56, O.intValue());
        }
        if (T != null)
        {
            kwk1.c(57, T.intValue());
        }
        if (S != null && S.length > 0)
        {
            for (int k2 = 0; k2 < S.length; k2++)
            {
                ivs ivs1 = S[k2];
                if (ivs1 != null)
                {
                    kwk1.b(58, ivs1);
                }
            }

        }
        if (U != null)
        {
            kwk1.b(59, U);
        }
        if (V != null)
        {
            kwk1.a(60, V);
        }
        if (Y != null)
        {
            kwk1.b(61, Y);
        }
        if (p != null && p.length > 0)
        {
            for (int l2 = 0; l2 < p.length; l2++)
            {
                String s4 = p[l2];
                if (s4 != null)
                {
                    kwk1.a(62, s4);
                }
            }

        }
        if (Z != null && Z.length > 0)
        {
            for (int i3 = ((flag) ? 1 : 0); i3 < Z.length; i3++)
            {
                iwi iwi1 = Z[i3];
                if (iwi1 != null)
                {
                    kwk1.b(63, iwi1);
                }
            }

        }
        if (W != null)
        {
            kwk1.a(64, W);
        }
        if (X != null)
        {
            kwk1.b(65, X);
        }
        if (aa != null)
        {
            kwk1.b(66, aa);
        }
        if (ab != null)
        {
            kwk1.a(67, ab);
        }
        super.writeTo(kwk1);
    }
}
