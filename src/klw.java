// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class klw extends kwm
{

    public kjm a[];
    public kjc b;
    public String c;
    public String d;
    public kjd e[];
    public kje f[];
    public Long g;
    public Integer h;
    public Long i;
    public Long j;
    public Long k;
    public Integer l;
    public kjk m;
    public klu n;
    public klq o;
    public kmf p;
    public krf q[];
    public klx r;
    public klv s;
    public klz t;
    public kmd u[];
    public Integer v;

    public klw()
    {
        a = kjm.a();
        b = null;
        c = null;
        d = null;
        e = kjd.a();
        f = kje.a();
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
        q = krf.a();
        r = null;
        s = null;
        t = null;
        u = kmd.a();
        v = null;
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
            i1 = j1;
            if (a.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < a.length;)
                {
                    kjm kjm1 = a[j1];
                    int k1 = i1;
                    if (kjm1 != null)
                    {
                        k1 = i1 + kwk.d(1, kjm1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.d(2, b);
        }
        int l1 = j1;
        if (c != null)
        {
            l1 = j1 + kwk.b(3, c);
        }
        i1 = l1;
        if (d != null)
        {
            i1 = l1 + kwk.b(4, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    kjd kjd1 = e[j1];
                    l1 = i1;
                    if (kjd1 != null)
                    {
                        l1 = i1 + kwk.d(5, kjd1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1;
            if (f.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < f.length;)
                {
                    kje kje1 = f[j1];
                    l1 = i1;
                    if (kje1 != null)
                    {
                        l1 = i1 + kwk.d(6, kje1);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.e(7, g.longValue());
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.e(8, i.longValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.e(9, j.longValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.e(10, k.longValue());
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.e(11, l.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.d(12, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.d(13, n);
        }
        l1 = j1;
        if (o != null)
        {
            l1 = j1 + kwk.d(15, o);
        }
        i1 = l1;
        if (p != null)
        {
            i1 = l1 + kwk.d(16, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                for (j1 = 0; j1 < q.length;)
                {
                    krf krf1 = q[j1];
                    l1 = i1;
                    if (krf1 != null)
                    {
                        l1 = i1 + kwk.d(17, krf1);
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
            i1 = j1 + kwk.d(18, r);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.e(19, h.intValue());
        }
        l1 = j1;
        if (s != null)
        {
            l1 = j1 + kwk.d(21, s);
        }
        i1 = l1;
        if (t != null)
        {
            i1 = l1 + kwk.d(22, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1;
            if (u.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= u.length)
                    {
                        break;
                    }
                    kmd kmd1 = u[i2];
                    j1 = i1;
                    if (kmd1 != null)
                    {
                        j1 = i1 + kwk.d(23, kmd1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + kwk.e(24, v.intValue());
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L25:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 23: default 200
    //                   0: 209
    //                   10: 211
    //                   18: 335
    //                   26: 364
    //                   34: 375
    //                   42: 386
    //                   50: 510
    //                   56: 634
    //                   64: 648
    //                   72: 662
    //                   80: 676
    //                   88: 690
    //                   98: 754
    //                   106: 783
    //                   122: 812
    //                   130: 841
    //                   138: 870
    //                   146: 995
    //                   152: 1024
    //                   170: 1070
    //                   178: 1099
    //                   186: 1128
    //                   192: 1253;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L25; else goto _L2
_L2:
        return this;
_L3:
        int j3 = kwx.a(kwj1, 10);
        kjm akjm[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        akjm = new kjm[j3 + j1];
        j3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, akjm, 0, j1);
            j3 = j1;
        }
        for (; j3 < akjm.length - 1; j3++)
        {
            akjm[j3] = new kjm();
            kwj1.a(akjm[j3]);
            kwj1.a();
        }

        akjm[j3] = new kjm();
        kwj1.a(akjm[j3]);
        a = akjm;
          goto _L25
_L4:
        if (b == null)
        {
            b = new kjc();
        }
        kwj1.a(b);
          goto _L25
_L5:
        c = kwj1.j();
          goto _L25
_L6:
        d = kwj1.j();
          goto _L25
_L7:
        int k3 = kwx.a(kwj1, 42);
        kjd akjd[];
        int k1;
        if (e == null)
        {
            k1 = 0;
        } else
        {
            k1 = e.length;
        }
        akjd = new kjd[k3 + k1];
        k3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(e, 0, akjd, 0, k1);
            k3 = k1;
        }
        for (; k3 < akjd.length - 1; k3++)
        {
            akjd[k3] = new kjd();
            kwj1.a(akjd[k3]);
            kwj1.a();
        }

        akjd[k3] = new kjd();
        kwj1.a(akjd[k3]);
        e = akjd;
          goto _L25
_L8:
        int l3 = kwx.a(kwj1, 50);
        kje akje[];
        int l1;
        if (f == null)
        {
            l1 = 0;
        } else
        {
            l1 = f.length;
        }
        akje = new kje[l3 + l1];
        l3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(f, 0, akje, 0, l1);
            l3 = l1;
        }
        for (; l3 < akje.length - 1; l3++)
        {
            akje[l3] = new kje();
            kwj1.a(akje[l3]);
            kwj1.a();
        }

        akje[l3] = new kje();
        kwj1.a(akje[l3]);
        f = akje;
          goto _L25
_L9:
        g = Long.valueOf(kwj1.e());
          goto _L25
_L10:
        i = Long.valueOf(kwj1.e());
          goto _L25
_L11:
        j = Long.valueOf(kwj1.e());
          goto _L25
_L12:
        k = Long.valueOf(kwj1.e());
          goto _L25
_L13:
        int i2 = kwj1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 10: // '\n'
        case 20: // '\024'
        case 100: // 'd'
            l = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (m == null)
        {
            m = new kjk();
        }
        kwj1.a(m);
        continue; /* Loop/switch isn't completed */
_L15:
        if (n == null)
        {
            n = new klu();
        }
        kwj1.a(n);
        continue; /* Loop/switch isn't completed */
_L16:
        if (o == null)
        {
            o = new klq();
        }
        kwj1.a(o);
        continue; /* Loop/switch isn't completed */
_L17:
        if (p == null)
        {
            p = new kmf();
        }
        kwj1.a(p);
        continue; /* Loop/switch isn't completed */
_L18:
        int i4 = kwx.a(kwj1, 138);
        krf akrf[];
        int j2;
        if (q == null)
        {
            j2 = 0;
        } else
        {
            j2 = q.length;
        }
        akrf = new krf[i4 + j2];
        i4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(q, 0, akrf, 0, j2);
            i4 = j2;
        }
        for (; i4 < akrf.length - 1; i4++)
        {
            akrf[i4] = new krf();
            kwj1.a(akrf[i4]);
            kwj1.a();
        }

        akrf[i4] = new krf();
        kwj1.a(akrf[i4]);
        q = akrf;
        continue; /* Loop/switch isn't completed */
_L19:
        if (r == null)
        {
            r = new klx();
        }
        kwj1.a(r);
        continue; /* Loop/switch isn't completed */
_L20:
        int k2 = kwj1.f();
        switch (k2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = Integer.valueOf(k2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L21:
        if (s == null)
        {
            s = new klv();
        }
        kwj1.a(s);
        continue; /* Loop/switch isn't completed */
_L22:
        if (t == null)
        {
            t = new klz();
        }
        kwj1.a(t);
        continue; /* Loop/switch isn't completed */
_L23:
        int j4 = kwx.a(kwj1, 186);
        kmd akmd[];
        int l2;
        if (u == null)
        {
            l2 = 0;
        } else
        {
            l2 = u.length;
        }
        akmd = new kmd[j4 + l2];
        j4 = l2;
        if (l2 != 0)
        {
            System.arraycopy(u, 0, akmd, 0, l2);
            j4 = l2;
        }
        for (; j4 < akmd.length - 1; j4++)
        {
            akmd[j4] = new kmd();
            kwj1.a(akmd[j4]);
            kwj1.a();
        }

        akmd[j4] = new kmd();
        kwj1.a(akmd[j4]);
        u = akmd;
        continue; /* Loop/switch isn't completed */
_L24:
        int i3 = kwj1.f();
        switch (i3)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            v = Integer.valueOf(i3);
            break;
        }
        if (true) goto _L25; else goto _L26
_L26:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                kjm kjm1 = a[i1];
                if (kjm1 != null)
                {
                    kwk1.b(1, kjm1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                kjd kjd1 = e[j1];
                if (kjd1 != null)
                {
                    kwk1.b(5, kjd1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int k1 = 0; k1 < f.length; k1++)
            {
                kje kje1 = f[k1];
                if (kje1 != null)
                {
                    kwk1.b(6, kje1);
                }
            }

        }
        if (g != null)
        {
            kwk1.b(7, g.longValue());
        }
        if (i != null)
        {
            kwk1.b(8, i.longValue());
        }
        if (j != null)
        {
            kwk1.b(9, j.longValue());
        }
        if (k != null)
        {
            kwk1.b(10, k.longValue());
        }
        if (l != null)
        {
            kwk1.a(11, l.intValue());
        }
        if (m != null)
        {
            kwk1.b(12, m);
        }
        if (n != null)
        {
            kwk1.b(13, n);
        }
        if (o != null)
        {
            kwk1.b(15, o);
        }
        if (p != null)
        {
            kwk1.b(16, p);
        }
        if (q != null && q.length > 0)
        {
            for (int l1 = 0; l1 < q.length; l1++)
            {
                krf krf1 = q[l1];
                if (krf1 != null)
                {
                    kwk1.b(17, krf1);
                }
            }

        }
        if (r != null)
        {
            kwk1.b(18, r);
        }
        if (h != null)
        {
            kwk1.a(19, h.intValue());
        }
        if (s != null)
        {
            kwk1.b(21, s);
        }
        if (t != null)
        {
            kwk1.b(22, t);
        }
        if (u != null && u.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < u.length; i2++)
            {
                kmd kmd1 = u[i2];
                if (kmd1 != null)
                {
                    kwk1.b(23, kmd1);
                }
            }

        }
        if (v != null)
        {
            kwk1.a(24, v.intValue());
        }
        super.writeTo(kwk1);
    }
}
