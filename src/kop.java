// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kop extends kwm
{

    public knl a[];
    public key b;
    public String c;
    public String d;
    public kfa e[];
    public kfe f[];
    public Long g;
    public int h;
    public Long i;
    public Long j;
    public Long k;
    public int l;
    public kfq m;
    public koj n;
    public kng o;
    public kqm p;
    public kse q[];
    public kor r;
    public kol s;
    public kou t;
    public kpq u[];
    public int v;

    public kop()
    {
        a = knl.a();
        b = null;
        c = null;
        d = null;
        e = kfa.a();
        f = kfe.a();
        g = null;
        h = 0x80000000;
        i = null;
        j = null;
        k = null;
        l = 0x80000000;
        m = null;
        n = null;
        o = null;
        p = null;
        q = kse.a();
        r = null;
        s = null;
        t = null;
        u = kpq.a();
        v = 0x80000000;
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
                    knl knl1 = a[j1];
                    int k1 = i1;
                    if (knl1 != null)
                    {
                        k1 = i1 + kwk.d(1, knl1);
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
                    kfa kfa1 = e[j1];
                    l1 = i1;
                    if (kfa1 != null)
                    {
                        l1 = i1 + kwk.d(5, kfa1);
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
                    kfe kfe1 = f[j1];
                    l1 = i1;
                    if (kfe1 != null)
                    {
                        l1 = i1 + kwk.d(6, kfe1);
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
        if (l != 0x80000000)
        {
            j1 = i1 + kwk.e(11, l);
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
                    kse kse1 = q[j1];
                    l1 = i1;
                    if (kse1 != null)
                    {
                        l1 = i1 + kwk.d(17, kse1);
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
        if (h != 0x80000000)
        {
            j1 = i1 + kwk.e(19, h);
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
                    kpq kpq1 = u[i2];
                    j1 = i1;
                    if (kpq1 != null)
                    {
                        j1 = i1 + kwk.d(23, kpq1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (v != 0x80000000)
        {
            i1 = j1 + kwk.e(24, v);
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
    //                   98: 751
    //                   106: 780
    //                   122: 809
    //                   130: 838
    //                   138: 867
    //                   146: 992
    //                   152: 1021
    //                   170: 1063
    //                   178: 1092
    //                   186: 1121
    //                   192: 1246;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L25; else goto _L2
_L2:
        return this;
_L3:
        int j3 = kwx.a(kwj1, 10);
        knl aknl[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        aknl = new knl[j3 + j1];
        j3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, aknl, 0, j1);
            j3 = j1;
        }
        for (; j3 < aknl.length - 1; j3++)
        {
            aknl[j3] = new knl();
            kwj1.a(aknl[j3]);
            kwj1.a();
        }

        aknl[j3] = new knl();
        kwj1.a(aknl[j3]);
        a = aknl;
          goto _L25
_L4:
        if (b == null)
        {
            b = new key();
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
        kfa akfa[];
        int k1;
        if (e == null)
        {
            k1 = 0;
        } else
        {
            k1 = e.length;
        }
        akfa = new kfa[k3 + k1];
        k3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(e, 0, akfa, 0, k1);
            k3 = k1;
        }
        for (; k3 < akfa.length - 1; k3++)
        {
            akfa[k3] = new kfa();
            kwj1.a(akfa[k3]);
            kwj1.a();
        }

        akfa[k3] = new kfa();
        kwj1.a(akfa[k3]);
        e = akfa;
          goto _L25
_L8:
        int l3 = kwx.a(kwj1, 50);
        kfe akfe[];
        int l1;
        if (f == null)
        {
            l1 = 0;
        } else
        {
            l1 = f.length;
        }
        akfe = new kfe[l3 + l1];
        l3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(f, 0, akfe, 0, l1);
            l3 = l1;
        }
        for (; l3 < akfe.length - 1; l3++)
        {
            akfe[l3] = new kfe();
            kwj1.a(akfe[l3]);
            kwj1.a();
        }

        akfe[l3] = new kfe();
        kwj1.a(akfe[l3]);
        f = akfe;
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
            l = i2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (m == null)
        {
            m = new kfq();
        }
        kwj1.a(m);
        continue; /* Loop/switch isn't completed */
_L15:
        if (n == null)
        {
            n = new koj();
        }
        kwj1.a(n);
        continue; /* Loop/switch isn't completed */
_L16:
        if (o == null)
        {
            o = new kng();
        }
        kwj1.a(o);
        continue; /* Loop/switch isn't completed */
_L17:
        if (p == null)
        {
            p = new kqm();
        }
        kwj1.a(p);
        continue; /* Loop/switch isn't completed */
_L18:
        int i4 = kwx.a(kwj1, 138);
        kse akse[];
        int j2;
        if (q == null)
        {
            j2 = 0;
        } else
        {
            j2 = q.length;
        }
        akse = new kse[i4 + j2];
        i4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(q, 0, akse, 0, j2);
            i4 = j2;
        }
        for (; i4 < akse.length - 1; i4++)
        {
            akse[i4] = new kse();
            kwj1.a(akse[i4]);
            kwj1.a();
        }

        akse[i4] = new kse();
        kwj1.a(akse[i4]);
        q = akse;
        continue; /* Loop/switch isn't completed */
_L19:
        if (r == null)
        {
            r = new kor();
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
            h = k2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L21:
        if (s == null)
        {
            s = new kol();
        }
        kwj1.a(s);
        continue; /* Loop/switch isn't completed */
_L22:
        if (t == null)
        {
            t = new kou();
        }
        kwj1.a(t);
        continue; /* Loop/switch isn't completed */
_L23:
        int j4 = kwx.a(kwj1, 186);
        kpq akpq[];
        int l2;
        if (u == null)
        {
            l2 = 0;
        } else
        {
            l2 = u.length;
        }
        akpq = new kpq[j4 + l2];
        j4 = l2;
        if (l2 != 0)
        {
            System.arraycopy(u, 0, akpq, 0, l2);
            j4 = l2;
        }
        for (; j4 < akpq.length - 1; j4++)
        {
            akpq[j4] = new kpq();
            kwj1.a(akpq[j4]);
            kwj1.a();
        }

        akpq[j4] = new kpq();
        kwj1.a(akpq[j4]);
        u = akpq;
        continue; /* Loop/switch isn't completed */
_L24:
        int i3 = kwj1.f();
        switch (i3)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            v = i3;
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
                knl knl1 = a[i1];
                if (knl1 != null)
                {
                    kwk1.b(1, knl1);
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
                kfa kfa1 = e[j1];
                if (kfa1 != null)
                {
                    kwk1.b(5, kfa1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int k1 = 0; k1 < f.length; k1++)
            {
                kfe kfe1 = f[k1];
                if (kfe1 != null)
                {
                    kwk1.b(6, kfe1);
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
        if (l != 0x80000000)
        {
            kwk1.a(11, l);
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
                kse kse1 = q[l1];
                if (kse1 != null)
                {
                    kwk1.b(17, kse1);
                }
            }

        }
        if (r != null)
        {
            kwk1.b(18, r);
        }
        if (h != 0x80000000)
        {
            kwk1.a(19, h);
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
                kpq kpq1 = u[i2];
                if (kpq1 != null)
                {
                    kwk1.b(23, kpq1);
                }
            }

        }
        if (v != 0x80000000)
        {
            kwk1.a(24, v);
        }
        super.writeTo(kwk1);
    }
}
