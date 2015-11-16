// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kqz extends koj
{

    private static final kqz L[] = new kqz[0];
    public static final kok a = kok.a(kqz, 0x1325b252L);
    public static final kok b = kok.a(kqz, 0x1325b252L);
    public koz A;
    public String B;
    public String C;
    public koz D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public kpl h;
    public String i;
    public koz j[];
    public koz k;
    public String l;
    public koz m[];
    public String n;
    public String o;
    public String p[];
    public String q[];
    public String r[];
    public String s[];
    public koz t;
    public koz u[];
    public Boolean v;
    public String w;
    public koz x;
    public koz y[];
    public Integer z;

    public kqz()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = koz.a();
        k = null;
        l = null;
        m = koz.a();
        n = null;
        o = null;
        p = kou.f;
        q = kou.f;
        r = kou.f;
        s = kou.f;
        t = null;
        u = koz.a();
        v = null;
        w = null;
        x = null;
        y = koz.a();
        z = null;
        A = null;
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
            i1 = j1 + koh.b(1, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.b(2, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.b(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.b(5, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.d(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                for (j1 = 0; j1 < j.length;)
                {
                    koz koz1 = j[j1];
                    int k1 = i1;
                    if (koz1 != null)
                    {
                        k1 = i1 + koh.d(8, koz1);
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
            l1 = j1 + koh.d(9, k);
        }
        i1 = l1;
        if (l != null)
        {
            i1 = l1 + koh.b(10, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    koz koz2 = m[j1];
                    l1 = i1;
                    if (koz2 != null)
                    {
                        l1 = i1 + koh.d(11, koz2);
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
            l1 = j1 + koh.b(12, n);
        }
        i1 = l1;
        if (o != null)
        {
            i1 = l1 + koh.b(13, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int k2;
                int k3;
                for (k2 = 0; j1 < p.length; k2 = k3)
                {
                    String s1 = p[j1];
                    int k4 = l1;
                    k3 = k2;
                    if (s1 != null)
                    {
                        k3 = k2 + 1;
                        k4 = l1 + koh.a(s1);
                    }
                    j1++;
                    l1 = k4;
                }

                j1 = i1 + l1 + k2 * 1;
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
                int l2;
                int l3;
                for (l2 = 0; i1 < q.length; l2 = l3)
                {
                    String s2 = q[i1];
                    int l4 = l1;
                    l3 = l2;
                    if (s2 != null)
                    {
                        l3 = l2 + 1;
                        l4 = l1 + koh.a(s2);
                    }
                    i1++;
                    l1 = l4;
                }

                i1 = j1 + l1 + l2 * 1;
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
                int i3;
                int i4;
                for (i3 = 0; j1 < r.length; i3 = i4)
                {
                    String s3 = r[j1];
                    int i5 = l1;
                    i4 = i3;
                    if (s3 != null)
                    {
                        i4 = i3 + 1;
                        i5 = l1 + koh.a(s3);
                    }
                    j1++;
                    l1 = i5;
                }

                j1 = i1 + l1 + i3 * 2;
            }
        }
        l1 = j1;
        if (s != null)
        {
            l1 = j1;
            if (s.length > 0)
            {
                i1 = 0;
                l1 = 0;
                int j3;
                int j4;
                for (j3 = 0; i1 < s.length; j3 = j4)
                {
                    String s4 = s[i1];
                    int j5 = l1;
                    j4 = j3;
                    if (s4 != null)
                    {
                        j4 = j3 + 1;
                        j5 = l1 + koh.a(s4);
                    }
                    i1++;
                    l1 = j5;
                }

                l1 = j1 + l1 + j3 * 2;
            }
        }
        i1 = l1;
        if (t != null)
        {
            i1 = l1 + koh.d(18, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1;
            if (u.length > 0)
            {
                for (j1 = 0; j1 < u.length;)
                {
                    koz koz3 = u[j1];
                    int i2 = i1;
                    if (koz3 != null)
                    {
                        i2 = i1 + koh.d(42, koz3);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (v != null)
        {
            v.booleanValue();
            i1 = j1 + (koh.f(65) + 1);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + koh.b(75, w);
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + koh.d(82, x);
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1;
            if (y.length > 0)
            {
                int j2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (j2 >= y.length)
                    {
                        break;
                    }
                    koz koz4 = y[j2];
                    j1 = i1;
                    if (koz4 != null)
                    {
                        j1 = i1 + koh.d(83, koz4);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + koh.e(90, z.intValue());
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1 + koh.d(96, A);
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + koh.b(111, B);
        }
        j1 = i1;
        if (C != null)
        {
            j1 = i1 + koh.b(112, C);
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + koh.d(185, D);
        }
        j1 = i1;
        if (E != null)
        {
            j1 = i1 + koh.b(188, E);
        }
        i1 = j1;
        if (F != null)
        {
            i1 = j1 + koh.b(189, F);
        }
        j1 = i1;
        if (G != null)
        {
            j1 = i1 + koh.b(190, G);
        }
        i1 = j1;
        if (H != null)
        {
            i1 = j1 + koh.b(191, H);
        }
        j1 = i1;
        if (I != null)
        {
            j1 = i1 + koh.b(249, I);
        }
        i1 = j1;
        if (J != null)
        {
            i1 = j1 + koh.b(252, J);
        }
        j1 = i1;
        if (K != null)
        {
            j1 = i1 + koh.b(254, K);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L38:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 36: default 304
    //                   0: 313
    //                   10: 315
    //                   18: 326
    //                   26: 337
    //                   34: 348
    //                   42: 359
    //                   50: 370
    //                   58: 399
    //                   66: 410
    //                   74: 534
    //                   82: 563
    //                   90: 574
    //                   98: 698
    //                   106: 709
    //                   114: 720
    //                   122: 822
    //                   130: 924
    //                   138: 1027
    //                   146: 1130
    //                   338: 1159
    //                   520: 1284
    //                   602: 1298
    //                   658: 1309
    //                   666: 1338
    //                   720: 1463
    //                   770: 1506
    //                   890: 1535
    //                   898: 1546
    //                   1482: 1557
    //                   1506: 1586
    //                   1514: 1597
    //                   1522: 1608
    //                   1530: 1619
    //                   1994: 1630
    //                   2018: 1641
    //                   2034: 1652;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L38; else goto _L2
_L2:
        return this;
_L3:
        c = kog1.j();
          goto _L38
_L4:
        d = kog1.j();
          goto _L38
_L5:
        e = kog1.j();
          goto _L38
_L6:
        f = kog1.j();
          goto _L38
_L7:
        g = kog1.j();
          goto _L38
_L8:
        if (h == null)
        {
            h = new kpl();
        }
        kog1.a(h);
          goto _L38
_L9:
        i = kog1.j();
          goto _L38
_L10:
        int k3 = kou.b(kog1, 66);
        koz akoz[];
        int j1;
        if (j == null)
        {
            j1 = 0;
        } else
        {
            j1 = j.length;
        }
        akoz = new koz[k3 + j1];
        k3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(j, 0, akoz, 0, j1);
            k3 = j1;
        }
        for (; k3 < akoz.length - 1; k3++)
        {
            akoz[k3] = new koz();
            kog1.a(akoz[k3]);
            kog1.a();
        }

        akoz[k3] = new koz();
        kog1.a(akoz[k3]);
        j = akoz;
          goto _L38
_L11:
        if (k == null)
        {
            k = new koz();
        }
        kog1.a(k);
          goto _L38
_L12:
        l = kog1.j();
          goto _L38
_L13:
        int l3 = kou.b(kog1, 90);
        koz akoz1[];
        int k1;
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.length;
        }
        akoz1 = new koz[l3 + k1];
        l3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(m, 0, akoz1, 0, k1);
            l3 = k1;
        }
        for (; l3 < akoz1.length - 1; l3++)
        {
            akoz1[l3] = new koz();
            kog1.a(akoz1[l3]);
            kog1.a();
        }

        akoz1[l3] = new koz();
        kog1.a(akoz1[l3]);
        m = akoz1;
          goto _L38
_L14:
        n = kog1.j();
          goto _L38
_L15:
        o = kog1.j();
          goto _L38
_L16:
        int i4 = kou.b(kog1, 114);
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
            as[i4] = kog1.j();
            kog1.a();
        }

        as[i4] = kog1.j();
        p = as;
          goto _L38
_L17:
        int j4 = kou.b(kog1, 122);
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
            as1[j4] = kog1.j();
            kog1.a();
        }

        as1[j4] = kog1.j();
        q = as1;
          goto _L38
_L18:
        int k4 = kou.b(kog1, 130);
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
            as2[k4] = kog1.j();
            kog1.a();
        }

        as2[k4] = kog1.j();
        r = as2;
          goto _L38
_L19:
        int l4 = kou.b(kog1, 138);
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
            as3[l4] = kog1.j();
            kog1.a();
        }

        as3[l4] = kog1.j();
        s = as3;
          goto _L38
_L20:
        if (t == null)
        {
            t = new koz();
        }
        kog1.a(t);
          goto _L38
_L21:
        int i5 = kou.b(kog1, 338);
        koz akoz2[];
        int l2;
        if (u == null)
        {
            l2 = 0;
        } else
        {
            l2 = u.length;
        }
        akoz2 = new koz[i5 + l2];
        i5 = l2;
        if (l2 != 0)
        {
            System.arraycopy(u, 0, akoz2, 0, l2);
            i5 = l2;
        }
        for (; i5 < akoz2.length - 1; i5++)
        {
            akoz2[i5] = new koz();
            kog1.a(akoz2[i5]);
            kog1.a();
        }

        akoz2[i5] = new koz();
        kog1.a(akoz2[i5]);
        u = akoz2;
          goto _L38
_L22:
        v = Boolean.valueOf(kog1.i());
          goto _L38
_L23:
        w = kog1.j();
          goto _L38
_L24:
        if (x == null)
        {
            x = new koz();
        }
        kog1.a(x);
          goto _L38
_L25:
        int j5 = kou.b(kog1, 666);
        koz akoz3[];
        int i3;
        if (y == null)
        {
            i3 = 0;
        } else
        {
            i3 = y.length;
        }
        akoz3 = new koz[j5 + i3];
        j5 = i3;
        if (i3 != 0)
        {
            System.arraycopy(y, 0, akoz3, 0, i3);
            j5 = i3;
        }
        for (; j5 < akoz3.length - 1; j5++)
        {
            akoz3[j5] = new koz();
            kog1.a(akoz3[j5]);
            kog1.a();
        }

        akoz3[j5] = new koz();
        kog1.a(akoz3[j5]);
        y = akoz3;
          goto _L38
_L26:
        int j3 = kog1.f();
        switch (j3)
        {
        case 0: // '\0'
        case 1: // '\001'
            z = Integer.valueOf(j3);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L27:
        if (A == null)
        {
            A = new koz();
        }
        kog1.a(A);
        continue; /* Loop/switch isn't completed */
_L28:
        B = kog1.j();
        continue; /* Loop/switch isn't completed */
_L29:
        C = kog1.j();
        continue; /* Loop/switch isn't completed */
_L30:
        if (D == null)
        {
            D = new koz();
        }
        kog1.a(D);
        continue; /* Loop/switch isn't completed */
_L31:
        E = kog1.j();
        continue; /* Loop/switch isn't completed */
_L32:
        F = kog1.j();
        continue; /* Loop/switch isn't completed */
_L33:
        G = kog1.j();
        continue; /* Loop/switch isn't completed */
_L34:
        H = kog1.j();
        continue; /* Loop/switch isn't completed */
_L35:
        I = kog1.j();
        continue; /* Loop/switch isn't completed */
_L36:
        J = kog1.j();
        continue; /* Loop/switch isn't completed */
_L37:
        K = kog1.j();
        if (true) goto _L38; else goto _L39
_L39:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (c != null)
        {
            koh1.a(1, c);
        }
        if (d != null)
        {
            koh1.a(2, d);
        }
        if (e != null)
        {
            koh1.a(3, e);
        }
        if (f != null)
        {
            koh1.a(4, f);
        }
        if (g != null)
        {
            koh1.a(5, g);
        }
        if (h != null)
        {
            koh1.b(6, h);
        }
        if (i != null)
        {
            koh1.a(7, i);
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                koz koz1 = j[i1];
                if (koz1 != null)
                {
                    koh1.b(8, koz1);
                }
            }

        }
        if (k != null)
        {
            koh1.b(9, k);
        }
        if (l != null)
        {
            koh1.a(10, l);
        }
        if (m != null && m.length > 0)
        {
            for (int j1 = 0; j1 < m.length; j1++)
            {
                koz koz2 = m[j1];
                if (koz2 != null)
                {
                    koh1.b(11, koz2);
                }
            }

        }
        if (n != null)
        {
            koh1.a(12, n);
        }
        if (o != null)
        {
            koh1.a(13, o);
        }
        if (p != null && p.length > 0)
        {
            for (int k1 = 0; k1 < p.length; k1++)
            {
                String s1 = p[k1];
                if (s1 != null)
                {
                    koh1.a(14, s1);
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
                    koh1.a(15, s2);
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
                    koh1.a(16, s3);
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
                    koh1.a(17, s4);
                }
            }

        }
        if (t != null)
        {
            koh1.b(18, t);
        }
        if (u != null && u.length > 0)
        {
            for (int k2 = 0; k2 < u.length; k2++)
            {
                koz koz3 = u[k2];
                if (koz3 != null)
                {
                    koh1.b(42, koz3);
                }
            }

        }
        if (v != null)
        {
            koh1.a(65, v.booleanValue());
        }
        if (w != null)
        {
            koh1.a(75, w);
        }
        if (x != null)
        {
            koh1.b(82, x);
        }
        if (y != null && y.length > 0)
        {
            for (int l2 = ((flag) ? 1 : 0); l2 < y.length; l2++)
            {
                koz koz4 = y[l2];
                if (koz4 != null)
                {
                    koh1.b(83, koz4);
                }
            }

        }
        if (z != null)
        {
            koh1.a(90, z.intValue());
        }
        if (A != null)
        {
            koh1.b(96, A);
        }
        if (B != null)
        {
            koh1.a(111, B);
        }
        if (C != null)
        {
            koh1.a(112, C);
        }
        if (D != null)
        {
            koh1.b(185, D);
        }
        if (E != null)
        {
            koh1.a(188, E);
        }
        if (F != null)
        {
            koh1.a(189, F);
        }
        if (G != null)
        {
            koh1.a(190, G);
        }
        if (H != null)
        {
            koh1.a(191, H);
        }
        if (I != null)
        {
            koh1.a(249, I);
        }
        if (J != null)
        {
            koh1.a(252, J);
        }
        if (K != null)
        {
            koh1.a(254, K);
        }
        super.writeTo(koh1);
    }

}
