// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ioh extends kwm
{

    public kxd A[];
    public String B[];
    public int C[];
    public String a;
    public String b;
    public String c;
    public ioj d[];
    public ioj e[];
    public String f[];
    public int g;
    public String h;
    public Boolean i;
    public String j;
    public String k;
    public String l;
    public Boolean m;
    public ioi n;
    public Boolean o;
    public String p;
    public String q;
    public int r;
    public Boolean s;
    public Boolean t;
    public String u;
    public String v;
    public Boolean w;
    public kze x[];
    public String y;
    public Integer z;

    public ioh()
    {
        a = null;
        b = null;
        c = null;
        d = ioj.a();
        e = ioj.a();
        f = kwx.f;
        g = 0x80000000;
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
        r = 0x80000000;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = kze.a();
        y = null;
        z = null;
        A = kxd.a();
        B = kwx.f;
        C = kwx.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + kwk.b(1, a) + kwk.b(2, b);
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                for (j1 = 0; j1 < d.length;)
                {
                    ioj ioj1 = d[j1];
                    int k1 = i1;
                    if (ioj1 != null)
                    {
                        k1 = i1 + kwk.d(4, ioj1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1;
            if (e.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < e.length;)
                {
                    ioj ioj2 = e[j1];
                    int l1 = i1;
                    if (ioj2 != null)
                    {
                        l1 = i1 + kwk.d(5, ioj2);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                j1 = 0;
                int i2 = 0;
                int k3;
                int i4;
                for (k3 = 0; j1 < f.length; k3 = i4)
                {
                    String s1 = f[j1];
                    int k4 = i2;
                    i4 = k3;
                    if (s1 != null)
                    {
                        i4 = k3 + 1;
                        k4 = i2 + kwk.a(s1);
                    }
                    j1++;
                    i2 = k4;
                }

                j1 = i1 + i2 + k3 * 1;
            }
        }
        i1 = j1;
        if (g != 0x80000000)
        {
            i1 = j1 + kwk.e(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (kwk.f(9) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.b(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            m.booleanValue();
            i1 = j1 + (kwk.f(13) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.d(14, n);
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (kwk.f(15) + 1);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.b(16, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.b(17, q);
        }
        j1 = i1;
        if (r != 0x80000000)
        {
            j1 = i1 + kwk.e(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            s.booleanValue();
            i1 = j1 + (kwk.f(19) + 1);
        }
        j1 = i1;
        if (t != null)
        {
            t.booleanValue();
            j1 = i1 + (kwk.f(20) + 1);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + kwk.b(21, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.b(22, v);
        }
        i1 = j1;
        if (w != null)
        {
            w.booleanValue();
            i1 = j1 + (kwk.f(23) + 1);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1;
            if (x.length > 0)
            {
                for (j1 = 0; j1 < x.length;)
                {
                    kze kze1 = x[j1];
                    int j2 = i1;
                    if (kze1 != null)
                    {
                        j2 = i1 + kwk.d(24, kze1);
                    }
                    j1++;
                    i1 = j2;
                }

                j1 = i1;
            }
        }
        int k2 = j1;
        if (y != null)
        {
            k2 = j1 + kwk.b(25, y);
        }
        i1 = k2;
        if (z != null)
        {
            i1 = k2 + kwk.e(26, z.intValue());
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1;
            if (A.length > 0)
            {
                for (j1 = 0; j1 < A.length;)
                {
                    kxd kxd1 = A[j1];
                    int l2 = i1;
                    if (kxd1 != null)
                    {
                        l2 = i1 + kwk.d(27, kxd1);
                    }
                    j1++;
                    i1 = l2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1;
            if (B.length > 0)
            {
                i1 = 0;
                int i3 = 0;
                int l3;
                int j4;
                for (l3 = 0; i1 < B.length; l3 = j4)
                {
                    String s2 = B[i1];
                    int l4 = i3;
                    j4 = l3;
                    if (s2 != null)
                    {
                        j4 = l3 + 1;
                        l4 = i3 + kwk.a(s2);
                    }
                    i1++;
                    i3 = l4;
                }

                i1 = j1 + i3 + l3 * 2;
            }
        }
        j1 = i1;
        if (C != null)
        {
            j1 = i1;
            if (C.length > 0)
            {
                int j3 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < C.length; j1++)
                {
                    j3 += kwk.e(C[j1]);
                }

                j1 = i1 + j3 + C.length * 2;
            }
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L33:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 31: default 268
    //                   0: 278
    //                   10: 280
    //                   18: 291
    //                   26: 302
    //                   34: 313
    //                   42: 444
    //                   50: 575
    //                   56: 684
    //                   66: 736
    //                   72: 747
    //                   82: 761
    //                   90: 772
    //                   98: 783
    //                   104: 794
    //                   114: 808
    //                   120: 837
    //                   130: 851
    //                   138: 862
    //                   144: 873
    //                   152: 916
    //                   160: 930
    //                   170: 944
    //                   178: 955
    //                   184: 966
    //                   194: 980
    //                   202: 1112
    //                   208: 1123
    //                   218: 1137
    //                   226: 1269
    //                   232: 1379
    //                   234: 1564;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L33; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L33
_L4:
        b = kwj1.j();
          goto _L33
_L5:
        c = kwj1.j();
          goto _L33
_L6:
        int j1 = kwx.a(kwj1, 34);
        ioj aioj[];
        if (d == null)
        {
            i1 = 0;
        } else
        {
            i1 = d.length;
        }
        aioj = new ioj[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(d, 0, aioj, 0, i1);
            j1 = i1;
        }
        for (; j1 < aioj.length - 1; j1++)
        {
            aioj[j1] = new ioj();
            kwj1.a(aioj[j1]);
            kwj1.a();
        }

        aioj[j1] = new ioj();
        kwj1.a(aioj[j1]);
        d = aioj;
          goto _L33
_L7:
        int k1 = kwx.a(kwj1, 42);
        ioj aioj1[];
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        aioj1 = new ioj[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, aioj1, 0, i1);
            k1 = i1;
        }
        for (; k1 < aioj1.length - 1; k1++)
        {
            aioj1[k1] = new ioj();
            kwj1.a(aioj1[k1]);
            kwj1.a();
        }

        aioj1[k1] = new ioj();
        kwj1.a(aioj1[k1]);
        e = aioj1;
          goto _L33
_L8:
        int l1 = kwx.a(kwj1, 50);
        String as[];
        if (f == null)
        {
            i1 = 0;
        } else
        {
            i1 = f.length;
        }
        as = new String[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(f, 0, as, 0, i1);
            l1 = i1;
        }
        for (; l1 < as.length - 1; l1++)
        {
            as[l1] = kwj1.j();
            kwj1.a();
        }

        as[l1] = kwj1.j();
        f = as;
          goto _L33
_L9:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            g = i1;
            break;
        }
          goto _L34
_L10:
        h = kwj1.j();
          goto _L34
_L11:
        i = Boolean.valueOf(kwj1.i());
          goto _L34
_L12:
        j = kwj1.j();
          goto _L34
_L13:
        k = kwj1.j();
          goto _L34
_L14:
        l = kwj1.j();
          goto _L34
_L15:
        m = Boolean.valueOf(kwj1.i());
          goto _L34
_L16:
        if (n == null)
        {
            n = new ioi();
        }
        kwj1.a(n);
          goto _L34
_L17:
        o = Boolean.valueOf(kwj1.i());
          goto _L34
_L18:
        p = kwj1.j();
          goto _L34
_L19:
        q = kwj1.j();
          goto _L34
_L20:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
            r = i1;
            break;
        }
          goto _L34
_L21:
        s = Boolean.valueOf(kwj1.i());
          goto _L34
_L22:
        t = Boolean.valueOf(kwj1.i());
          goto _L34
_L23:
        u = kwj1.j();
          goto _L34
_L24:
        v = kwj1.j();
          goto _L34
_L25:
        w = Boolean.valueOf(kwj1.i());
          goto _L34
_L26:
        int i2 = kwx.a(kwj1, 194);
        kze akze[];
        if (x == null)
        {
            i1 = 0;
        } else
        {
            i1 = x.length;
        }
        akze = new kze[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(x, 0, akze, 0, i1);
            i2 = i1;
        }
        for (; i2 < akze.length - 1; i2++)
        {
            akze[i2] = new kze();
            kwj1.a(akze[i2]);
            kwj1.a();
        }

        akze[i2] = new kze();
        kwj1.a(akze[i2]);
        x = akze;
          goto _L34
_L27:
        y = kwj1.j();
          goto _L34
_L28:
        z = Integer.valueOf(kwj1.f());
          goto _L34
_L29:
        int j2 = kwx.a(kwj1, 218);
        kxd akxd[];
        if (A == null)
        {
            i1 = 0;
        } else
        {
            i1 = A.length;
        }
        akxd = new kxd[j2 + i1];
        j2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(A, 0, akxd, 0, i1);
            j2 = i1;
        }
        for (; j2 < akxd.length - 1; j2++)
        {
            akxd[j2] = new kxd();
            kwj1.a(akxd[j2]);
            kwj1.a();
        }

        akxd[j2] = new kxd();
        kwj1.a(akxd[j2]);
        A = akxd;
          goto _L34
_L30:
        int k2 = kwx.a(kwj1, 226);
        String as1[];
        if (B == null)
        {
            i1 = 0;
        } else
        {
            i1 = B.length;
        }
        as1 = new String[k2 + i1];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(B, 0, as1, 0, i1);
            k2 = i1;
        }
        for (; k2 < as1.length - 1; k2++)
        {
            as1[k2] = kwj1.j();
            kwj1.a();
        }

        as1[k2] = kwj1.j();
        B = as1;
          goto _L34
_L31:
        int ai[];
        int l2;
        int k3;
        k3 = kwx.a(kwj1, 232);
        ai = new int[k3];
        l2 = 0;
        i1 = 0;
_L41:
        if (l2 >= k3) goto _L36; else goto _L35
_L35:
        int l3;
        if (l2 != 0)
        {
            kwj1.a();
        }
        l3 = kwj1.f();
        l3;
        JVM INSTR tableswitch 0 1: default 1448
    //                   0 1457
    //                   1 1457;
           goto _L37 _L38 _L38
_L37:
        l2++;
          goto _L39
_L38:
        int i3 = i1 + 1;
        ai[i1] = l3;
        i1 = i3;
        if (true) goto _L37; else goto _L36
_L36:
        if (i1 != 0)
        {
            if (C == null)
            {
                l2 = 0;
            } else
            {
                l2 = C.length;
            }
            if (l2 == 0 && i1 == ai.length)
            {
                C = ai;
            } else
            {
                int ai1[] = new int[l2 + i1];
                if (l2 != 0)
                {
                    System.arraycopy(C, 0, ai1, 0, l2);
                }
                System.arraycopy(ai, 0, ai1, l2, i1);
                C = ai1;
            }
        }
          goto _L34
_L39:
        if (true) goto _L41; else goto _L40
_L40:
_L32:
        int j3;
        j3 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        l2 = 0;
_L50:
        if (kwj1.q() <= 0) goto _L43; else goto _L42
_L42:
        switch (kwj1.f())
        {
        case 0: // '\0'
        case 1: // '\001'
            l2++;
            break;
        }
          goto _L44
_L43:
        if (l2 == 0) goto _L46; else goto _L45
_L45:
        kwj1.e(i1);
        if (C == null)
        {
            i1 = 0;
        } else
        {
            i1 = C.length;
        }
        ai = new int[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(C, 0, ai, 0, i1);
            l2 = i1;
        }
_L48:
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
                ai[l2] = i1;
                l2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        C = ai;
_L46:
        kwj1.d(j3);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L48; else goto _L47
_L47:
_L44:
        if (true) goto _L50; else goto _L49
_L49:
_L34:
        if (true) goto _L33; else goto _L51
_L51:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(1, a);
        kwk1.a(2, b);
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                ioj ioj1 = d[i1];
                if (ioj1 != null)
                {
                    kwk1.b(4, ioj1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                ioj ioj2 = e[j1];
                if (ioj2 != null)
                {
                    kwk1.b(5, ioj2);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int k1 = 0; k1 < f.length; k1++)
            {
                String s1 = f[k1];
                if (s1 != null)
                {
                    kwk1.a(6, s1);
                }
            }

        }
        if (g != 0x80000000)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.a(9, i.booleanValue());
        }
        if (j != null)
        {
            kwk1.a(10, j);
        }
        if (k != null)
        {
            kwk1.a(11, k);
        }
        if (l != null)
        {
            kwk1.a(12, l);
        }
        if (m != null)
        {
            kwk1.a(13, m.booleanValue());
        }
        if (n != null)
        {
            kwk1.b(14, n);
        }
        if (o != null)
        {
            kwk1.a(15, o.booleanValue());
        }
        if (p != null)
        {
            kwk1.a(16, p);
        }
        if (q != null)
        {
            kwk1.a(17, q);
        }
        if (r != 0x80000000)
        {
            kwk1.a(18, r);
        }
        if (s != null)
        {
            kwk1.a(19, s.booleanValue());
        }
        if (t != null)
        {
            kwk1.a(20, t.booleanValue());
        }
        if (u != null)
        {
            kwk1.a(21, u);
        }
        if (v != null)
        {
            kwk1.a(22, v);
        }
        if (w != null)
        {
            kwk1.a(23, w.booleanValue());
        }
        if (x != null && x.length > 0)
        {
            for (int l1 = 0; l1 < x.length; l1++)
            {
                kze kze1 = x[l1];
                if (kze1 != null)
                {
                    kwk1.b(24, kze1);
                }
            }

        }
        if (y != null)
        {
            kwk1.a(25, y);
        }
        if (z != null)
        {
            kwk1.a(26, z.intValue());
        }
        if (A != null && A.length > 0)
        {
            for (int i2 = 0; i2 < A.length; i2++)
            {
                kxd kxd1 = A[i2];
                if (kxd1 != null)
                {
                    kwk1.b(27, kxd1);
                }
            }

        }
        if (B != null && B.length > 0)
        {
            for (int j2 = 0; j2 < B.length; j2++)
            {
                String s2 = B[j2];
                if (s2 != null)
                {
                    kwk1.a(28, s2);
                }
            }

        }
        if (C != null && C.length > 0)
        {
            for (int k2 = ((flag) ? 1 : 0); k2 < C.length; k2++)
            {
                kwk1.a(29, C[k2]);
            }

        }
        super.writeTo(kwk1);
    }
}
