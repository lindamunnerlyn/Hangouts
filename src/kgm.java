// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kgm extends koj
{

    public kfi a[];
    public jwv b;
    public String c;
    public String d;
    public jwx e[];
    public jxb f[];
    public Long g;
    public int h;
    public Long i;
    public Long j;
    public Long k;
    public int l;
    public jxn m;
    public kgg n;
    public kfd o;
    public kij p;
    public kkb q[];
    public kgo r;
    public kgi s;
    public kgr t;
    public khn u[];
    public int v;

    public kgm()
    {
        a = kfi.a();
        b = null;
        c = null;
        d = null;
        e = jwx.a();
        f = jxb.a();
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
        q = kkb.a();
        r = null;
        s = null;
        t = null;
        u = khn.a();
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
                    kfi kfi1 = a[j1];
                    int k1 = i1;
                    if (kfi1 != null)
                    {
                        k1 = i1 + koh.d(1, kfi1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.d(2, b);
        }
        int l1 = j1;
        if (c != null)
        {
            l1 = j1 + koh.b(3, c);
        }
        i1 = l1;
        if (d != null)
        {
            i1 = l1 + koh.b(4, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    jwx jwx1 = e[j1];
                    l1 = i1;
                    if (jwx1 != null)
                    {
                        l1 = i1 + koh.d(5, jwx1);
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
                    jxb jxb1 = f[j1];
                    l1 = i1;
                    if (jxb1 != null)
                    {
                        l1 = i1 + koh.d(6, jxb1);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.e(7, g.longValue());
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.e(8, i.longValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(9, j.longValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.e(10, k.longValue());
        }
        j1 = i1;
        if (l != 0x80000000)
        {
            j1 = i1 + koh.e(11, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(12, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.d(13, n);
        }
        l1 = j1;
        if (o != null)
        {
            l1 = j1 + koh.d(15, o);
        }
        i1 = l1;
        if (p != null)
        {
            i1 = l1 + koh.d(16, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                for (j1 = 0; j1 < q.length;)
                {
                    kkb kkb1 = q[j1];
                    l1 = i1;
                    if (kkb1 != null)
                    {
                        l1 = i1 + koh.d(17, kkb1);
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
            i1 = j1 + koh.d(18, r);
        }
        j1 = i1;
        if (h != 0x80000000)
        {
            j1 = i1 + koh.e(19, h);
        }
        l1 = j1;
        if (s != null)
        {
            l1 = j1 + koh.d(21, s);
        }
        i1 = l1;
        if (t != null)
        {
            i1 = l1 + koh.d(22, t);
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
                    khn khn1 = u[i2];
                    j1 = i1;
                    if (khn1 != null)
                    {
                        j1 = i1 + koh.d(23, khn1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (v != 0x80000000)
        {
            i1 = j1 + koh.e(24, v);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L25:
        int i1 = kog1.a();
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
        if (super.storeUnknownField(kog1, i1)) goto _L25; else goto _L2
_L2:
        return this;
_L3:
        int j3 = kou.b(kog1, 10);
        kfi akfi[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        akfi = new kfi[j3 + j1];
        j3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, akfi, 0, j1);
            j3 = j1;
        }
        for (; j3 < akfi.length - 1; j3++)
        {
            akfi[j3] = new kfi();
            kog1.a(akfi[j3]);
            kog1.a();
        }

        akfi[j3] = new kfi();
        kog1.a(akfi[j3]);
        a = akfi;
          goto _L25
_L4:
        if (b == null)
        {
            b = new jwv();
        }
        kog1.a(b);
          goto _L25
_L5:
        c = kog1.j();
          goto _L25
_L6:
        d = kog1.j();
          goto _L25
_L7:
        int k3 = kou.b(kog1, 42);
        jwx ajwx[];
        int k1;
        if (e == null)
        {
            k1 = 0;
        } else
        {
            k1 = e.length;
        }
        ajwx = new jwx[k3 + k1];
        k3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(e, 0, ajwx, 0, k1);
            k3 = k1;
        }
        for (; k3 < ajwx.length - 1; k3++)
        {
            ajwx[k3] = new jwx();
            kog1.a(ajwx[k3]);
            kog1.a();
        }

        ajwx[k3] = new jwx();
        kog1.a(ajwx[k3]);
        e = ajwx;
          goto _L25
_L8:
        int l3 = kou.b(kog1, 50);
        jxb ajxb[];
        int l1;
        if (f == null)
        {
            l1 = 0;
        } else
        {
            l1 = f.length;
        }
        ajxb = new jxb[l3 + l1];
        l3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(f, 0, ajxb, 0, l1);
            l3 = l1;
        }
        for (; l3 < ajxb.length - 1; l3++)
        {
            ajxb[l3] = new jxb();
            kog1.a(ajxb[l3]);
            kog1.a();
        }

        ajxb[l3] = new jxb();
        kog1.a(ajxb[l3]);
        f = ajxb;
          goto _L25
_L9:
        g = Long.valueOf(kog1.e());
          goto _L25
_L10:
        i = Long.valueOf(kog1.e());
          goto _L25
_L11:
        j = Long.valueOf(kog1.e());
          goto _L25
_L12:
        k = Long.valueOf(kog1.e());
          goto _L25
_L13:
        int i2 = kog1.f();
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
            m = new jxn();
        }
        kog1.a(m);
        continue; /* Loop/switch isn't completed */
_L15:
        if (n == null)
        {
            n = new kgg();
        }
        kog1.a(n);
        continue; /* Loop/switch isn't completed */
_L16:
        if (o == null)
        {
            o = new kfd();
        }
        kog1.a(o);
        continue; /* Loop/switch isn't completed */
_L17:
        if (p == null)
        {
            p = new kij();
        }
        kog1.a(p);
        continue; /* Loop/switch isn't completed */
_L18:
        int i4 = kou.b(kog1, 138);
        kkb akkb[];
        int j2;
        if (q == null)
        {
            j2 = 0;
        } else
        {
            j2 = q.length;
        }
        akkb = new kkb[i4 + j2];
        i4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(q, 0, akkb, 0, j2);
            i4 = j2;
        }
        for (; i4 < akkb.length - 1; i4++)
        {
            akkb[i4] = new kkb();
            kog1.a(akkb[i4]);
            kog1.a();
        }

        akkb[i4] = new kkb();
        kog1.a(akkb[i4]);
        q = akkb;
        continue; /* Loop/switch isn't completed */
_L19:
        if (r == null)
        {
            r = new kgo();
        }
        kog1.a(r);
        continue; /* Loop/switch isn't completed */
_L20:
        int k2 = kog1.f();
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
            s = new kgi();
        }
        kog1.a(s);
        continue; /* Loop/switch isn't completed */
_L22:
        if (t == null)
        {
            t = new kgr();
        }
        kog1.a(t);
        continue; /* Loop/switch isn't completed */
_L23:
        int j4 = kou.b(kog1, 186);
        khn akhn[];
        int l2;
        if (u == null)
        {
            l2 = 0;
        } else
        {
            l2 = u.length;
        }
        akhn = new khn[j4 + l2];
        j4 = l2;
        if (l2 != 0)
        {
            System.arraycopy(u, 0, akhn, 0, l2);
            j4 = l2;
        }
        for (; j4 < akhn.length - 1; j4++)
        {
            akhn[j4] = new khn();
            kog1.a(akhn[j4]);
            kog1.a();
        }

        akhn[j4] = new khn();
        kog1.a(akhn[j4]);
        u = akhn;
        continue; /* Loop/switch isn't completed */
_L24:
        int i3 = kog1.f();
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

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                kfi kfi1 = a[i1];
                if (kfi1 != null)
                {
                    koh1.b(1, kfi1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                jwx jwx1 = e[j1];
                if (jwx1 != null)
                {
                    koh1.b(5, jwx1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int k1 = 0; k1 < f.length; k1++)
            {
                jxb jxb1 = f[k1];
                if (jxb1 != null)
                {
                    koh1.b(6, jxb1);
                }
            }

        }
        if (g != null)
        {
            koh1.b(7, g.longValue());
        }
        if (i != null)
        {
            koh1.b(8, i.longValue());
        }
        if (j != null)
        {
            koh1.b(9, j.longValue());
        }
        if (k != null)
        {
            koh1.b(10, k.longValue());
        }
        if (l != 0x80000000)
        {
            koh1.a(11, l);
        }
        if (m != null)
        {
            koh1.b(12, m);
        }
        if (n != null)
        {
            koh1.b(13, n);
        }
        if (o != null)
        {
            koh1.b(15, o);
        }
        if (p != null)
        {
            koh1.b(16, p);
        }
        if (q != null && q.length > 0)
        {
            for (int l1 = 0; l1 < q.length; l1++)
            {
                kkb kkb1 = q[l1];
                if (kkb1 != null)
                {
                    koh1.b(17, kkb1);
                }
            }

        }
        if (r != null)
        {
            koh1.b(18, r);
        }
        if (h != 0x80000000)
        {
            koh1.a(19, h);
        }
        if (s != null)
        {
            koh1.b(21, s);
        }
        if (t != null)
        {
            koh1.b(22, t);
        }
        if (u != null && u.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < u.length; i2++)
            {
                khn khn1 = u[i2];
                if (khn1 != null)
                {
                    koh1.b(23, khn1);
                }
            }

        }
        if (v != 0x80000000)
        {
            koh1.a(24, v);
        }
        super.writeTo(koh1);
    }
}
