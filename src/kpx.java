// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kpx extends koj
{

    private static final kpx K[] = new kpx[0];
    public static final kok a = kok.a(kpx, 0xcc8731aL);
    public kqo A[];
    public String B;
    public Long C;
    public int D;
    public String E;
    public kpq F[];
    public hoy G;
    public Boolean H;
    public Boolean I;
    public kpa J;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public krk g;
    public String h;
    public hoz i;
    public kqb j;
    public hpb k;
    public hpb l;
    public String m;
    public kpt n;
    public String o;
    public kqa p;
    public kpr q[];
    public hpl r;
    public kqu s;
    public hpa t;
    public hpk u;
    public kpq v;
    public Boolean w;
    public int x;
    public kpq y[];
    public Integer z;

    public kpx()
    {
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
        q = kpr.a();
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = 0x80000000;
        y = kpq.a();
        z = null;
        A = kqo.a();
        B = null;
        C = null;
        D = 0x80000000;
        E = null;
        F = kpq.a();
        G = null;
        H = null;
        I = null;
        J = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kpx[] a()
    {
        return K;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.b(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(2, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(3, d);
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
        if (E != null)
        {
            j1 = i1 + koh.b(6, E);
        }
        int k1 = j1;
        if (g != null)
        {
            k1 = j1 + koh.d(7, g);
        }
        i1 = k1;
        if (h != null)
        {
            i1 = k1 + koh.b(8, h);
        }
        j1 = i1;
        if (F != null)
        {
            j1 = i1;
            if (F.length > 0)
            {
                for (j1 = 0; j1 < F.length;)
                {
                    kpq kpq1 = F[j1];
                    k1 = i1;
                    if (kpq1 != null)
                    {
                        k1 = i1 + koh.d(9, kpq1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.d(10, i);
        }
        j1 = i1;
        if (G != null)
        {
            j1 = i1 + koh.d(11, G);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(12, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(13, l);
        }
        k1 = j1;
        if (m != null)
        {
            k1 = j1 + koh.b(14, m);
        }
        i1 = k1;
        if (p != null)
        {
            i1 = k1 + koh.d(15, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                for (j1 = 0; j1 < q.length;)
                {
                    kpr kpr1 = q[j1];
                    int l1 = i1;
                    if (kpr1 != null)
                    {
                        l1 = i1 + koh.d(16, kpr1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.d(17, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + koh.d(18, s);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + koh.d(19, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + koh.d(20, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + koh.d(21, v);
        }
        j1 = i1;
        if (H != null)
        {
            H.booleanValue();
            j1 = i1 + (koh.f(22) + 1);
        }
        i1 = j1;
        if (x != 0x80000000)
        {
            i1 = j1 + koh.e(23, x);
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1;
            if (y.length > 0)
            {
                for (j1 = 0; j1 < y.length;)
                {
                    kpq kpq2 = y[j1];
                    int i2 = i1;
                    if (kpq2 != null)
                    {
                        i2 = i1 + koh.d(24, kpq2);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.d(25, n);
        }
        j1 = i1;
        if (w != null)
        {
            w.booleanValue();
            j1 = i1 + (koh.f(26) + 1);
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + koh.e(27, z.intValue());
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1;
            if (A.length > 0)
            {
                int j2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (j2 >= A.length)
                    {
                        break;
                    }
                    kqo kqo1 = A[j2];
                    j1 = i1;
                    if (kqo1 != null)
                    {
                        j1 = i1 + koh.d(28, kqo1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (I != null)
        {
            I.booleanValue();
            i1 = j1 + (koh.f(29) + 1);
        }
        j1 = i1;
        if (J != null)
        {
            j1 = i1 + koh.d(30, J);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.b(31, o);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.d(32, j);
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + koh.b(33, B);
        }
        j1 = i1;
        if (C != null)
        {
            j1 = i1 + koh.e(34, C.longValue());
        }
        i1 = j1;
        if (D != 0x80000000)
        {
            i1 = j1 + koh.e(35, D);
        }
        return i1;
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
    //                   58: 381
    //                   66: 410
    //                   74: 421
    //                   82: 545
    //                   90: 574
    //                   98: 603
    //                   106: 632
    //                   114: 661
    //                   122: 672
    //                   130: 701
    //                   138: 826
    //                   146: 855
    //                   154: 884
    //                   162: 913
    //                   170: 942
    //                   176: 971
    //                   184: 985
    //                   194: 1031
    //                   202: 1156
    //                   208: 1185
    //                   216: 1199
    //                   226: 1213
    //                   232: 1338
    //                   242: 1352
    //                   250: 1381
    //                   258: 1392
    //                   266: 1421
    //                   272: 1432
    //                   280: 1446;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L38; else goto _L2
_L2:
        return this;
_L3:
        b = kog1.j();
          goto _L38
_L4:
        c = kog1.j();
          goto _L38
_L5:
        d = kog1.j();
          goto _L38
_L6:
        e = kog1.j();
          goto _L38
_L7:
        f = kog1.j();
          goto _L38
_L8:
        E = kog1.j();
          goto _L38
_L9:
        if (g == null)
        {
            g = new krk();
        }
        kog1.a(g);
          goto _L38
_L10:
        h = kog1.j();
          goto _L38
_L11:
        int l2 = kou.b(kog1, 74);
        kpq akpq[];
        int j1;
        if (F == null)
        {
            j1 = 0;
        } else
        {
            j1 = F.length;
        }
        akpq = new kpq[l2 + j1];
        l2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(F, 0, akpq, 0, j1);
            l2 = j1;
        }
        for (; l2 < akpq.length - 1; l2++)
        {
            akpq[l2] = new kpq();
            kog1.a(akpq[l2]);
            kog1.a();
        }

        akpq[l2] = new kpq();
        kog1.a(akpq[l2]);
        F = akpq;
          goto _L38
_L12:
        if (i == null)
        {
            i = new hoz();
        }
        kog1.a(i);
          goto _L38
_L13:
        if (G == null)
        {
            G = new hoy();
        }
        kog1.a(G);
          goto _L38
_L14:
        if (k == null)
        {
            k = new hpb();
        }
        kog1.a(k);
          goto _L38
_L15:
        if (l == null)
        {
            l = new hpb();
        }
        kog1.a(l);
          goto _L38
_L16:
        m = kog1.j();
          goto _L38
_L17:
        if (p == null)
        {
            p = new kqa();
        }
        kog1.a(p);
          goto _L38
_L18:
        int i3 = kou.b(kog1, 130);
        kpr akpr[];
        int k1;
        if (q == null)
        {
            k1 = 0;
        } else
        {
            k1 = q.length;
        }
        akpr = new kpr[i3 + k1];
        i3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(q, 0, akpr, 0, k1);
            i3 = k1;
        }
        for (; i3 < akpr.length - 1; i3++)
        {
            akpr[i3] = new kpr();
            kog1.a(akpr[i3]);
            kog1.a();
        }

        akpr[i3] = new kpr();
        kog1.a(akpr[i3]);
        q = akpr;
          goto _L38
_L19:
        if (r == null)
        {
            r = new hpl();
        }
        kog1.a(r);
          goto _L38
_L20:
        if (s == null)
        {
            s = new kqu();
        }
        kog1.a(s);
          goto _L38
_L21:
        if (t == null)
        {
            t = new hpa();
        }
        kog1.a(t);
          goto _L38
_L22:
        if (u == null)
        {
            u = new hpk();
        }
        kog1.a(u);
          goto _L38
_L23:
        if (v == null)
        {
            v = new kpq();
        }
        kog1.a(v);
          goto _L38
_L24:
        H = Boolean.valueOf(kog1.i());
          goto _L38
_L25:
        int l1 = kog1.f();
        switch (l1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            x = l1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L26:
        int j3 = kou.b(kog1, 194);
        kpq akpq1[];
        int i2;
        if (y == null)
        {
            i2 = 0;
        } else
        {
            i2 = y.length;
        }
        akpq1 = new kpq[j3 + i2];
        j3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(y, 0, akpq1, 0, i2);
            j3 = i2;
        }
        for (; j3 < akpq1.length - 1; j3++)
        {
            akpq1[j3] = new kpq();
            kog1.a(akpq1[j3]);
            kog1.a();
        }

        akpq1[j3] = new kpq();
        kog1.a(akpq1[j3]);
        y = akpq1;
        continue; /* Loop/switch isn't completed */
_L27:
        if (n == null)
        {
            n = new kpt();
        }
        kog1.a(n);
        continue; /* Loop/switch isn't completed */
_L28:
        w = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L29:
        z = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L30:
        int k3 = kou.b(kog1, 226);
        kqo akqo[];
        int j2;
        if (A == null)
        {
            j2 = 0;
        } else
        {
            j2 = A.length;
        }
        akqo = new kqo[k3 + j2];
        k3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(A, 0, akqo, 0, j2);
            k3 = j2;
        }
        for (; k3 < akqo.length - 1; k3++)
        {
            akqo[k3] = new kqo();
            kog1.a(akqo[k3]);
            kog1.a();
        }

        akqo[k3] = new kqo();
        kog1.a(akqo[k3]);
        A = akqo;
        continue; /* Loop/switch isn't completed */
_L31:
        I = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L32:
        if (J == null)
        {
            J = new kpa();
        }
        kog1.a(J);
        continue; /* Loop/switch isn't completed */
_L33:
        o = kog1.j();
        continue; /* Loop/switch isn't completed */
_L34:
        if (j == null)
        {
            j = new kqb();
        }
        kog1.a(j);
        continue; /* Loop/switch isn't completed */
_L35:
        B = kog1.j();
        continue; /* Loop/switch isn't completed */
_L36:
        C = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L37:
        int k2 = kog1.f();
        switch (k2)
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
            D = k2;
            break;
        }
        if (true) goto _L38; else goto _L39
_L39:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (b != null)
        {
            koh1.a(1, b);
        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (f != null)
        {
            koh1.a(5, f);
        }
        if (E != null)
        {
            koh1.a(6, E);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        if (F != null && F.length > 0)
        {
            for (int i1 = 0; i1 < F.length; i1++)
            {
                kpq kpq1 = F[i1];
                if (kpq1 != null)
                {
                    koh1.b(9, kpq1);
                }
            }

        }
        if (i != null)
        {
            koh1.b(10, i);
        }
        if (G != null)
        {
            koh1.b(11, G);
        }
        if (k != null)
        {
            koh1.b(12, k);
        }
        if (l != null)
        {
            koh1.b(13, l);
        }
        if (m != null)
        {
            koh1.a(14, m);
        }
        if (p != null)
        {
            koh1.b(15, p);
        }
        if (q != null && q.length > 0)
        {
            for (int j1 = 0; j1 < q.length; j1++)
            {
                kpr kpr1 = q[j1];
                if (kpr1 != null)
                {
                    koh1.b(16, kpr1);
                }
            }

        }
        if (r != null)
        {
            koh1.b(17, r);
        }
        if (s != null)
        {
            koh1.b(18, s);
        }
        if (t != null)
        {
            koh1.b(19, t);
        }
        if (u != null)
        {
            koh1.b(20, u);
        }
        if (v != null)
        {
            koh1.b(21, v);
        }
        if (H != null)
        {
            koh1.a(22, H.booleanValue());
        }
        if (x != 0x80000000)
        {
            koh1.a(23, x);
        }
        if (y != null && y.length > 0)
        {
            for (int k1 = 0; k1 < y.length; k1++)
            {
                kpq kpq2 = y[k1];
                if (kpq2 != null)
                {
                    koh1.b(24, kpq2);
                }
            }

        }
        if (n != null)
        {
            koh1.b(25, n);
        }
        if (w != null)
        {
            koh1.a(26, w.booleanValue());
        }
        if (z != null)
        {
            koh1.a(27, z.intValue());
        }
        if (A != null && A.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < A.length; l1++)
            {
                kqo kqo1 = A[l1];
                if (kqo1 != null)
                {
                    koh1.b(28, kqo1);
                }
            }

        }
        if (I != null)
        {
            koh1.a(29, I.booleanValue());
        }
        if (J != null)
        {
            koh1.b(30, J);
        }
        if (o != null)
        {
            koh1.a(31, o);
        }
        if (j != null)
        {
            koh1.b(32, j);
        }
        if (B != null)
        {
            koh1.a(33, B);
        }
        if (C != null)
        {
            koh1.b(34, C.longValue());
        }
        if (D != 0x80000000)
        {
            koh1.a(35, D);
        }
        super.writeTo(koh1);
    }

}
