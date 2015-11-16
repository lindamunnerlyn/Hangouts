// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyh extends kwm
{

    private static final kyh K[] = new kyh[0];
    public static final kwn a = kwn.a(kyh, 0xcc8731aL);
    public kys A[];
    public String B;
    public Long C;
    public Integer D;
    public String E;
    public kyf F[];
    public hty G;
    public Boolean H;
    public Boolean I;
    public kxc J;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public kzo g;
    public String h;
    public htz i;
    public kyl j;
    public hub k;
    public hub l;
    public String m;
    public kxx n;
    public String o;
    public kyk p;
    public kyg q[];
    public hud r;
    public kyo s;
    public hua t;
    public huc u;
    public kyf v;
    public Boolean w;
    public Integer x;
    public kyf y[];
    public Integer z;

    public kyh()
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
        q = kyg.a();
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = kyf.a();
        z = null;
        A = kys.a();
        B = null;
        C = null;
        D = null;
        E = null;
        F = kyf.a();
        G = null;
        H = null;
        I = null;
        J = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kyh[] a()
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
            i1 = j1 + kwk.b(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(2, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.b(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.b(5, f);
        }
        j1 = i1;
        if (E != null)
        {
            j1 = i1 + kwk.b(6, E);
        }
        int k1 = j1;
        if (g != null)
        {
            k1 = j1 + kwk.d(7, g);
        }
        i1 = k1;
        if (h != null)
        {
            i1 = k1 + kwk.b(8, h);
        }
        j1 = i1;
        if (F != null)
        {
            j1 = i1;
            if (F.length > 0)
            {
                for (j1 = 0; j1 < F.length;)
                {
                    kyf kyf1 = F[j1];
                    k1 = i1;
                    if (kyf1 != null)
                    {
                        k1 = i1 + kwk.d(9, kyf1);
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
            i1 = j1 + kwk.d(10, i);
        }
        j1 = i1;
        if (G != null)
        {
            j1 = i1 + kwk.d(11, G);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.d(12, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.d(13, l);
        }
        k1 = j1;
        if (m != null)
        {
            k1 = j1 + kwk.b(14, m);
        }
        i1 = k1;
        if (p != null)
        {
            i1 = k1 + kwk.d(15, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                for (j1 = 0; j1 < q.length;)
                {
                    kyg kyg1 = q[j1];
                    int l1 = i1;
                    if (kyg1 != null)
                    {
                        l1 = i1 + kwk.d(16, kyg1);
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
            i1 = j1 + kwk.d(17, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + kwk.d(18, s);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + kwk.d(19, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + kwk.d(20, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + kwk.d(21, v);
        }
        j1 = i1;
        if (H != null)
        {
            H.booleanValue();
            j1 = i1 + (kwk.f(22) + 1);
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + kwk.e(23, x.intValue());
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1;
            if (y.length > 0)
            {
                for (j1 = 0; j1 < y.length;)
                {
                    kyf kyf2 = y[j1];
                    int i2 = i1;
                    if (kyf2 != null)
                    {
                        i2 = i1 + kwk.d(24, kyf2);
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
            i1 = j1 + kwk.d(25, n);
        }
        j1 = i1;
        if (w != null)
        {
            w.booleanValue();
            j1 = i1 + (kwk.f(26) + 1);
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + kwk.e(27, z.intValue());
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
                    kys kys1 = A[j2];
                    j1 = i1;
                    if (kys1 != null)
                    {
                        j1 = i1 + kwk.d(28, kys1);
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
            i1 = j1 + (kwk.f(29) + 1);
        }
        j1 = i1;
        if (J != null)
        {
            j1 = i1 + kwk.d(30, J);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.b(31, o);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.d(32, j);
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + kwk.b(33, B);
        }
        j1 = i1;
        if (C != null)
        {
            j1 = i1 + kwk.e(34, C.longValue());
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + kwk.e(35, D.intValue());
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L38:
        int i1 = kwj1.a();
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
    //                   194: 1034
    //                   202: 1159
    //                   208: 1188
    //                   216: 1202
    //                   226: 1216
    //                   232: 1341
    //                   242: 1355
    //                   250: 1384
    //                   258: 1395
    //                   266: 1424
    //                   272: 1435
    //                   280: 1449;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L38; else goto _L2
_L2:
        return this;
_L3:
        b = kwj1.j();
          goto _L38
_L4:
        c = kwj1.j();
          goto _L38
_L5:
        d = kwj1.j();
          goto _L38
_L6:
        e = kwj1.j();
          goto _L38
_L7:
        f = kwj1.j();
          goto _L38
_L8:
        E = kwj1.j();
          goto _L38
_L9:
        if (g == null)
        {
            g = new kzo();
        }
        kwj1.a(g);
          goto _L38
_L10:
        h = kwj1.j();
          goto _L38
_L11:
        int l2 = kwx.a(kwj1, 74);
        kyf akyf[];
        int j1;
        if (F == null)
        {
            j1 = 0;
        } else
        {
            j1 = F.length;
        }
        akyf = new kyf[l2 + j1];
        l2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(F, 0, akyf, 0, j1);
            l2 = j1;
        }
        for (; l2 < akyf.length - 1; l2++)
        {
            akyf[l2] = new kyf();
            kwj1.a(akyf[l2]);
            kwj1.a();
        }

        akyf[l2] = new kyf();
        kwj1.a(akyf[l2]);
        F = akyf;
          goto _L38
_L12:
        if (i == null)
        {
            i = new htz();
        }
        kwj1.a(i);
          goto _L38
_L13:
        if (G == null)
        {
            G = new hty();
        }
        kwj1.a(G);
          goto _L38
_L14:
        if (k == null)
        {
            k = new hub();
        }
        kwj1.a(k);
          goto _L38
_L15:
        if (l == null)
        {
            l = new hub();
        }
        kwj1.a(l);
          goto _L38
_L16:
        m = kwj1.j();
          goto _L38
_L17:
        if (p == null)
        {
            p = new kyk();
        }
        kwj1.a(p);
          goto _L38
_L18:
        int i3 = kwx.a(kwj1, 130);
        kyg akyg[];
        int k1;
        if (q == null)
        {
            k1 = 0;
        } else
        {
            k1 = q.length;
        }
        akyg = new kyg[i3 + k1];
        i3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(q, 0, akyg, 0, k1);
            i3 = k1;
        }
        for (; i3 < akyg.length - 1; i3++)
        {
            akyg[i3] = new kyg();
            kwj1.a(akyg[i3]);
            kwj1.a();
        }

        akyg[i3] = new kyg();
        kwj1.a(akyg[i3]);
        q = akyg;
          goto _L38
_L19:
        if (r == null)
        {
            r = new hud();
        }
        kwj1.a(r);
          goto _L38
_L20:
        if (s == null)
        {
            s = new kyo();
        }
        kwj1.a(s);
          goto _L38
_L21:
        if (t == null)
        {
            t = new hua();
        }
        kwj1.a(t);
          goto _L38
_L22:
        if (u == null)
        {
            u = new huc();
        }
        kwj1.a(u);
          goto _L38
_L23:
        if (v == null)
        {
            v = new kyf();
        }
        kwj1.a(v);
          goto _L38
_L24:
        H = Boolean.valueOf(kwj1.i());
          goto _L38
_L25:
        int l1 = kwj1.f();
        switch (l1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            x = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L26:
        int j3 = kwx.a(kwj1, 194);
        kyf akyf1[];
        int i2;
        if (y == null)
        {
            i2 = 0;
        } else
        {
            i2 = y.length;
        }
        akyf1 = new kyf[j3 + i2];
        j3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(y, 0, akyf1, 0, i2);
            j3 = i2;
        }
        for (; j3 < akyf1.length - 1; j3++)
        {
            akyf1[j3] = new kyf();
            kwj1.a(akyf1[j3]);
            kwj1.a();
        }

        akyf1[j3] = new kyf();
        kwj1.a(akyf1[j3]);
        y = akyf1;
        continue; /* Loop/switch isn't completed */
_L27:
        if (n == null)
        {
            n = new kxx();
        }
        kwj1.a(n);
        continue; /* Loop/switch isn't completed */
_L28:
        w = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L29:
        z = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L30:
        int k3 = kwx.a(kwj1, 226);
        kys akys[];
        int j2;
        if (A == null)
        {
            j2 = 0;
        } else
        {
            j2 = A.length;
        }
        akys = new kys[k3 + j2];
        k3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(A, 0, akys, 0, j2);
            k3 = j2;
        }
        for (; k3 < akys.length - 1; k3++)
        {
            akys[k3] = new kys();
            kwj1.a(akys[k3]);
            kwj1.a();
        }

        akys[k3] = new kys();
        kwj1.a(akys[k3]);
        A = akys;
        continue; /* Loop/switch isn't completed */
_L31:
        I = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L32:
        if (J == null)
        {
            J = new kxc();
        }
        kwj1.a(J);
        continue; /* Loop/switch isn't completed */
_L33:
        o = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L34:
        if (j == null)
        {
            j = new kyl();
        }
        kwj1.a(j);
        continue; /* Loop/switch isn't completed */
_L35:
        B = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L36:
        C = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L37:
        int k2 = kwj1.f();
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
            D = Integer.valueOf(k2);
            break;
        }
        if (true) goto _L38; else goto _L39
_L39:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (b != null)
        {
            kwk1.a(1, b);
        }
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (f != null)
        {
            kwk1.a(5, f);
        }
        if (E != null)
        {
            kwk1.a(6, E);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (F != null && F.length > 0)
        {
            for (int i1 = 0; i1 < F.length; i1++)
            {
                kyf kyf1 = F[i1];
                if (kyf1 != null)
                {
                    kwk1.b(9, kyf1);
                }
            }

        }
        if (i != null)
        {
            kwk1.b(10, i);
        }
        if (G != null)
        {
            kwk1.b(11, G);
        }
        if (k != null)
        {
            kwk1.b(12, k);
        }
        if (l != null)
        {
            kwk1.b(13, l);
        }
        if (m != null)
        {
            kwk1.a(14, m);
        }
        if (p != null)
        {
            kwk1.b(15, p);
        }
        if (q != null && q.length > 0)
        {
            for (int j1 = 0; j1 < q.length; j1++)
            {
                kyg kyg1 = q[j1];
                if (kyg1 != null)
                {
                    kwk1.b(16, kyg1);
                }
            }

        }
        if (r != null)
        {
            kwk1.b(17, r);
        }
        if (s != null)
        {
            kwk1.b(18, s);
        }
        if (t != null)
        {
            kwk1.b(19, t);
        }
        if (u != null)
        {
            kwk1.b(20, u);
        }
        if (v != null)
        {
            kwk1.b(21, v);
        }
        if (H != null)
        {
            kwk1.a(22, H.booleanValue());
        }
        if (x != null)
        {
            kwk1.a(23, x.intValue());
        }
        if (y != null && y.length > 0)
        {
            for (int k1 = 0; k1 < y.length; k1++)
            {
                kyf kyf2 = y[k1];
                if (kyf2 != null)
                {
                    kwk1.b(24, kyf2);
                }
            }

        }
        if (n != null)
        {
            kwk1.b(25, n);
        }
        if (w != null)
        {
            kwk1.a(26, w.booleanValue());
        }
        if (z != null)
        {
            kwk1.a(27, z.intValue());
        }
        if (A != null && A.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < A.length; l1++)
            {
                kys kys1 = A[l1];
                if (kys1 != null)
                {
                    kwk1.b(28, kys1);
                }
            }

        }
        if (I != null)
        {
            kwk1.a(29, I.booleanValue());
        }
        if (J != null)
        {
            kwk1.b(30, J);
        }
        if (o != null)
        {
            kwk1.a(31, o);
        }
        if (j != null)
        {
            kwk1.b(32, j);
        }
        if (B != null)
        {
            kwk1.a(33, B);
        }
        if (C != null)
        {
            kwk1.b(34, C.longValue());
        }
        if (D != null)
        {
            kwk1.a(35, D.intValue());
        }
        super.writeTo(kwk1);
    }

}
