// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikd extends koj
{

    public ikf A;
    public int B[];
    public ikm C;
    public ikl D[];
    public iks E[];
    public ike F[];
    public String G[];
    public String H;
    public String I;
    public iko J[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public String i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public String n;
    public Integer o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public Integer y;
    public String z[];

    public ikd()
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
        A = null;
        B = kou.a;
        C = null;
        D = ikl.a();
        E = iks.a();
        F = ike.a();
        G = kou.f;
        H = null;
        I = null;
        J = iko.a();
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
        if (g != null)
        {
            g.doubleValue();
            j1 = i1 + (koh.f(4) + 8);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(5, i);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(6, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(7, d);
        }
        j1 = i1;
        if (j != null)
        {
            j.booleanValue();
            j1 = i1 + (koh.f(8) + 1);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(9, e);
        }
        j1 = i1;
        if (l != null)
        {
            l.booleanValue();
            j1 = i1 + (koh.f(11) + 1);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + koh.b(12, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + koh.b(13, t);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + koh.b(14, u);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + koh.b(15, w);
        }
        int k1 = j1;
        if (y != null)
        {
            k1 = j1 + koh.e(16, y.intValue());
        }
        i1 = k1;
        if (p != null)
        {
            p.booleanValue();
            i1 = k1 + (koh.f(17) + 1);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1;
            if (z.length > 0)
            {
                j1 = 0;
                k1 = 0;
                int i3;
                int k3;
                for (i3 = 0; j1 < z.length; i3 = k3)
                {
                    String s1 = z[j1];
                    int i4 = k1;
                    k3 = i3;
                    if (s1 != null)
                    {
                        k3 = i3 + 1;
                        i4 = k1 + koh.a(s1);
                    }
                    j1++;
                    k1 = i4;
                }

                j1 = i1 + k1 + i3 * 2;
            }
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + koh.d(19, A);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(20, h);
        }
        k1 = j1;
        if (q != null)
        {
            q.booleanValue();
            k1 = j1 + (koh.f(21) + 1);
        }
        i1 = k1;
        if (x != null)
        {
            i1 = k1 + koh.b(22, x);
        }
        j1 = i1;
        if (B != null)
        {
            j1 = i1;
            if (B.length > 0)
            {
                j1 = 0;
                k1 = 0;
                for (; j1 < B.length; j1++)
                {
                    k1 += koh.e(B[j1]);
                }

                j1 = i1 + k1 + B.length * 2;
            }
        }
        k1 = j1;
        if (C != null)
        {
            k1 = j1 + koh.d(24, C);
        }
        i1 = k1;
        if (f != null)
        {
            i1 = k1 + koh.b(25, f);
        }
        j1 = i1;
        if (D != null)
        {
            j1 = i1;
            if (D.length > 0)
            {
                for (j1 = 0; j1 < D.length;)
                {
                    ikl ikl1 = D[j1];
                    int l1 = i1;
                    if (ikl1 != null)
                    {
                        l1 = i1 + koh.d(26, ikl1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (E != null)
        {
            i1 = j1;
            if (E.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < E.length;)
                {
                    iks iks1 = E[j1];
                    int i2 = i1;
                    if (iks1 != null)
                    {
                        i2 = i1 + koh.d(27, iks1);
                    }
                    j1++;
                    i1 = i2;
                }

            }
        }
        j1 = i1;
        if (r != null)
        {
            r.booleanValue();
            j1 = i1 + (koh.f(28) + 1);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.e(29, o.intValue());
        }
        j1 = i1;
        if (m != null)
        {
            m.booleanValue();
            j1 = i1 + (koh.f(30) + 1);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.b(31, b);
        }
        j1 = i1;
        if (F != null)
        {
            j1 = i1;
            if (F.length > 0)
            {
                for (j1 = 0; j1 < F.length;)
                {
                    ike ike1 = F[j1];
                    int j2 = i1;
                    if (ike1 != null)
                    {
                        j2 = i1 + koh.d(32, ike1);
                    }
                    j1++;
                    i1 = j2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (G != null)
        {
            i1 = j1;
            if (G.length > 0)
            {
                i1 = 0;
                int k2 = 0;
                int j3;
                int l3;
                for (j3 = 0; i1 < G.length; j3 = l3)
                {
                    String s2 = G[i1];
                    int j4 = k2;
                    l3 = j3;
                    if (s2 != null)
                    {
                        l3 = j3 + 1;
                        j4 = k2 + koh.a(s2);
                    }
                    i1++;
                    k2 = j4;
                }

                i1 = j1 + k2 + j3 * 2;
            }
        }
        j1 = i1;
        if (H != null)
        {
            j1 = i1 + koh.b(35, H);
        }
        i1 = j1;
        if (k != null)
        {
            k.booleanValue();
            i1 = j1 + (koh.f(36) + 1);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + koh.b(37, v);
        }
        i1 = j1;
        if (I != null)
        {
            i1 = j1 + koh.b(38, I);
        }
        j1 = i1;
        if (J != null)
        {
            j1 = i1;
            if (J.length > 0)
            {
                int l2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l2 >= J.length)
                    {
                        break;
                    }
                    iko iko1 = J[l2];
                    j1 = i1;
                    if (iko1 != null)
                    {
                        j1 = i1 + koh.d(39, iko1);
                    }
                    l2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.b(40, n);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L40:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 38: default 324
    //                   0: 334
    //                   10: 336
    //                   33: 347
    //                   42: 361
    //                   50: 372
    //                   58: 383
    //                   64: 394
    //                   74: 408
    //                   88: 419
    //                   98: 433
    //                   106: 444
    //                   114: 455
    //                   122: 466
    //                   128: 477
    //                   136: 527
    //                   146: 541
    //                   154: 651
    //                   162: 680
    //                   168: 691
    //                   178: 705
    //                   184: 716
    //                   186: 900
    //                   194: 1098
    //                   202: 1127
    //                   210: 1138
    //                   218: 1270
    //                   224: 1402
    //                   232: 1416
    //                   240: 1475
    //                   250: 1489
    //                   258: 1500
    //                   274: 1632
    //                   282: 1742
    //                   288: 1753
    //                   298: 1767
    //                   306: 1778
    //                   314: 1789
    //                   322: 1921;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L40; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L40
_L4:
        g = Double.valueOf(kog1.b());
          goto _L40
_L5:
        i = kog1.j();
          goto _L40
_L6:
        c = kog1.j();
          goto _L40
_L7:
        d = kog1.j();
          goto _L40
_L8:
        j = Boolean.valueOf(kog1.i());
          goto _L40
_L9:
        e = kog1.j();
          goto _L40
_L10:
        l = Boolean.valueOf(kog1.i());
          goto _L40
_L11:
        s = kog1.j();
          goto _L40
_L12:
        t = kog1.j();
          goto _L40
_L13:
        u = kog1.j();
          goto _L40
_L14:
        w = kog1.j();
          goto _L40
_L15:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            y = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L16:
        p = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        int l2 = kou.b(kog1, 146);
        String as[];
        if (z == null)
        {
            i1 = 0;
        } else
        {
            i1 = z.length;
        }
        as = new String[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(z, 0, as, 0, i1);
            l2 = i1;
        }
        for (; l2 < as.length - 1; l2++)
        {
            as[l2] = kog1.j();
            kog1.a();
        }

        as[l2] = kog1.j();
        z = as;
        continue; /* Loop/switch isn't completed */
_L18:
        if (A == null)
        {
            A = new ikf();
        }
        kog1.a(A);
        continue; /* Loop/switch isn't completed */
_L19:
        h = kog1.j();
        continue; /* Loop/switch isn't completed */
_L20:
        q = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L21:
        x = kog1.j();
        continue; /* Loop/switch isn't completed */
_L22:
        int ai[];
        int i3;
        int i5;
        i5 = kou.b(kog1, 184);
        ai = new int[i5];
        i3 = 0;
        i1 = 0;
_L46:
        if (i3 >= i5) goto _L42; else goto _L41
_L41:
        int j5;
        if (i3 != 0)
        {
            kog1.a();
        }
        j5 = kog1.f();
        j5;
        JVM INSTR tableswitch 1 2: default 784
    //                   1 793
    //                   2 793;
           goto _L43 _L44 _L44
_L43:
        i3++;
        continue; /* Loop/switch isn't completed */
_L44:
        int k4 = i1 + 1;
        ai[i1] = j5;
        i1 = k4;
        if (true) goto _L43; else goto _L42
_L42:
        if (i1 != 0)
        {
            if (B == null)
            {
                i3 = 0;
            } else
            {
                i3 = B.length;
            }
            if (i3 == 0 && i1 == ai.length)
            {
                B = ai;
            } else
            {
                int ai1[] = new int[i3 + i1];
                if (i3 != 0)
                {
                    System.arraycopy(B, 0, ai1, 0, i3);
                }
                System.arraycopy(ai, 0, ai1, i3, i1);
                B = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L46; else goto _L45
_L45:
_L23:
        int l4;
        l4 = kog1.c(kog1.p());
        i1 = kog1.r();
        i3 = 0;
_L52:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 1: // '\001'
            case 2: // '\002'
                i3++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i3 == 0) goto _L48; else goto _L47
_L47:
        kog1.e(i1);
        if (B == null)
        {
            i1 = 0;
        } else
        {
            i1 = B.length;
        }
        ai = new int[i3 + i1];
        i3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(B, 0, ai, 0, i1);
            i3 = i1;
        }
_L50:
        if (kog1.q() > 0)
        {
            i1 = kog1.f();
            switch (i1)
            {
            case 1: // '\001'
            case 2: // '\002'
                ai[i3] = i1;
                i3++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        B = ai;
_L48:
        kog1.d(l4);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L50; else goto _L49
_L49:
        if (true) goto _L52; else goto _L51
_L51:
_L24:
        if (C == null)
        {
            C = new ikm();
        }
        kog1.a(C);
        continue; /* Loop/switch isn't completed */
_L25:
        f = kog1.j();
        continue; /* Loop/switch isn't completed */
_L26:
        int j3 = kou.b(kog1, 210);
        ikl aikl[];
        int j1;
        if (D == null)
        {
            j1 = 0;
        } else
        {
            j1 = D.length;
        }
        aikl = new ikl[j3 + j1];
        j3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(D, 0, aikl, 0, j1);
            j3 = j1;
        }
        for (; j3 < aikl.length - 1; j3++)
        {
            aikl[j3] = new ikl();
            kog1.a(aikl[j3]);
            kog1.a();
        }

        aikl[j3] = new ikl();
        kog1.a(aikl[j3]);
        D = aikl;
        continue; /* Loop/switch isn't completed */
_L27:
        int k3 = kou.b(kog1, 218);
        iks aiks[];
        int k1;
        if (E == null)
        {
            k1 = 0;
        } else
        {
            k1 = E.length;
        }
        aiks = new iks[k3 + k1];
        k3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(E, 0, aiks, 0, k1);
            k3 = k1;
        }
        for (; k3 < aiks.length - 1; k3++)
        {
            aiks[k3] = new iks();
            kog1.a(aiks[k3]);
            kog1.a();
        }

        aiks[k3] = new iks();
        kog1.a(aiks[k3]);
        E = aiks;
        continue; /* Loop/switch isn't completed */
_L28:
        r = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L29:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            o = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L30:
        m = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L31:
        b = kog1.j();
        continue; /* Loop/switch isn't completed */
_L32:
        int l3 = kou.b(kog1, 258);
        ike aike[];
        int i2;
        if (F == null)
        {
            i2 = 0;
        } else
        {
            i2 = F.length;
        }
        aike = new ike[l3 + i2];
        l3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(F, 0, aike, 0, i2);
            l3 = i2;
        }
        for (; l3 < aike.length - 1; l3++)
        {
            aike[l3] = new ike();
            kog1.a(aike[l3]);
            kog1.a();
        }

        aike[l3] = new ike();
        kog1.a(aike[l3]);
        F = aike;
        continue; /* Loop/switch isn't completed */
_L33:
        int i4 = kou.b(kog1, 274);
        String as1[];
        int j2;
        if (G == null)
        {
            j2 = 0;
        } else
        {
            j2 = G.length;
        }
        as1 = new String[i4 + j2];
        i4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(G, 0, as1, 0, j2);
            i4 = j2;
        }
        for (; i4 < as1.length - 1; i4++)
        {
            as1[i4] = kog1.j();
            kog1.a();
        }

        as1[i4] = kog1.j();
        G = as1;
        continue; /* Loop/switch isn't completed */
_L34:
        H = kog1.j();
        continue; /* Loop/switch isn't completed */
_L35:
        k = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L36:
        v = kog1.j();
        continue; /* Loop/switch isn't completed */
_L37:
        I = kog1.j();
        continue; /* Loop/switch isn't completed */
_L38:
        int j4 = kou.b(kog1, 314);
        iko aiko[];
        int k2;
        if (J == null)
        {
            k2 = 0;
        } else
        {
            k2 = J.length;
        }
        aiko = new iko[j4 + k2];
        j4 = k2;
        if (k2 != 0)
        {
            System.arraycopy(J, 0, aiko, 0, k2);
            j4 = k2;
        }
        for (; j4 < aiko.length - 1; j4++)
        {
            aiko[j4] = new iko();
            kog1.a(aiko[j4]);
            kog1.a();
        }

        aiko[j4] = new iko();
        kog1.a(aiko[j4]);
        J = aiko;
        continue; /* Loop/switch isn't completed */
_L39:
        n = kog1.j();
        if (true) goto _L40; else goto _L53
_L53:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (g != null)
        {
            koh1.a(4, g.doubleValue());
        }
        if (i != null)
        {
            koh1.a(5, i);
        }
        if (c != null)
        {
            koh1.a(6, c);
        }
        if (d != null)
        {
            koh1.a(7, d);
        }
        if (j != null)
        {
            koh1.a(8, j.booleanValue());
        }
        if (e != null)
        {
            koh1.a(9, e);
        }
        if (l != null)
        {
            koh1.a(11, l.booleanValue());
        }
        if (s != null)
        {
            koh1.a(12, s);
        }
        if (t != null)
        {
            koh1.a(13, t);
        }
        if (u != null)
        {
            koh1.a(14, u);
        }
        if (w != null)
        {
            koh1.a(15, w);
        }
        if (y != null)
        {
            koh1.a(16, y.intValue());
        }
        if (p != null)
        {
            koh1.a(17, p.booleanValue());
        }
        if (z != null && z.length > 0)
        {
            for (int i1 = 0; i1 < z.length; i1++)
            {
                String s1 = z[i1];
                if (s1 != null)
                {
                    koh1.a(18, s1);
                }
            }

        }
        if (A != null)
        {
            koh1.b(19, A);
        }
        if (h != null)
        {
            koh1.a(20, h);
        }
        if (q != null)
        {
            koh1.a(21, q.booleanValue());
        }
        if (x != null)
        {
            koh1.a(22, x);
        }
        if (B != null && B.length > 0)
        {
            for (int j1 = 0; j1 < B.length; j1++)
            {
                koh1.a(23, B[j1]);
            }

        }
        if (C != null)
        {
            koh1.b(24, C);
        }
        if (f != null)
        {
            koh1.a(25, f);
        }
        if (D != null && D.length > 0)
        {
            for (int k1 = 0; k1 < D.length; k1++)
            {
                ikl ikl1 = D[k1];
                if (ikl1 != null)
                {
                    koh1.b(26, ikl1);
                }
            }

        }
        if (E != null && E.length > 0)
        {
            for (int l1 = 0; l1 < E.length; l1++)
            {
                iks iks1 = E[l1];
                if (iks1 != null)
                {
                    koh1.b(27, iks1);
                }
            }

        }
        if (r != null)
        {
            koh1.a(28, r.booleanValue());
        }
        if (o != null)
        {
            koh1.a(29, o.intValue());
        }
        if (m != null)
        {
            koh1.a(30, m.booleanValue());
        }
        if (b != null)
        {
            koh1.a(31, b);
        }
        if (F != null && F.length > 0)
        {
            for (int i2 = 0; i2 < F.length; i2++)
            {
                ike ike1 = F[i2];
                if (ike1 != null)
                {
                    koh1.b(32, ike1);
                }
            }

        }
        if (G != null && G.length > 0)
        {
            for (int j2 = 0; j2 < G.length; j2++)
            {
                String s2 = G[j2];
                if (s2 != null)
                {
                    koh1.a(34, s2);
                }
            }

        }
        if (H != null)
        {
            koh1.a(35, H);
        }
        if (k != null)
        {
            koh1.a(36, k.booleanValue());
        }
        if (v != null)
        {
            koh1.a(37, v);
        }
        if (I != null)
        {
            koh1.a(38, I);
        }
        if (J != null && J.length > 0)
        {
            for (int k2 = ((flag) ? 1 : 0); k2 < J.length; k2++)
            {
                iko iko1 = J[k2];
                if (iko1 != null)
                {
                    koh1.b(39, iko1);
                }
            }

        }
        if (n != null)
        {
            koh1.a(40, n);
        }
        super.writeTo(koh1);
    }
}
