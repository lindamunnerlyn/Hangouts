// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iwu extends koj
{

    public String A;
    public String B;
    public Boolean C;
    public iyn D;
    public Integer a;
    public Integer b;
    public String c;
    public String d;
    public String e;
    public byte f[];
    public String g[];
    public String h;
    public Integer i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n[];
    public Long o;
    public String p;
    public String q[];
    public String r;
    public ixf requestHeader;
    public String s;
    public Integer t;
    public String u[];
    public String v;
    public String w;
    public String x[];
    public Integer y;
    public Integer z;

    public iwu()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = kou.f;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = kou.f;
        o = null;
        p = null;
        q = kou.f;
        r = null;
        s = null;
        t = null;
        u = kou.f;
        v = null;
        w = null;
        x = kou.f;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        D = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (requestHeader != null)
        {
            i1 = j1 + koh.d(1, requestHeader);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + koh.e(2, a.intValue());
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.e(3, b.intValue());
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(4, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(5, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.b(7, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.b(8, f);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.e(9, o.longValue());
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.b(10, p);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int k2;
                int l3;
                for (k2 = 0; j1 < g.length; k2 = l3)
                {
                    String s1 = g[j1];
                    int i5 = k1;
                    l3 = k2;
                    if (s1 != null)
                    {
                        l3 = k2 + 1;
                        i5 = k1 + koh.a(s1);
                    }
                    j1++;
                    k1 = i5;
                }

                j1 = i1 + k1 + k2 * 1;
            }
        }
        int l1 = j1;
        if (q != null)
        {
            l1 = j1;
            if (q.length > 0)
            {
                i1 = 0;
                l1 = 0;
                int l2;
                int i4;
                for (l2 = 0; i1 < q.length; l2 = i4)
                {
                    String s2 = q[i1];
                    int j5 = l1;
                    i4 = l2;
                    if (s2 != null)
                    {
                        i4 = l2 + 1;
                        j5 = l1 + koh.a(s2);
                    }
                    i1++;
                    l1 = j5;
                }

                l1 = j1 + l1 + l2 * 1;
            }
        }
        i1 = l1;
        if (w != null)
        {
            i1 = l1 + koh.b(13, w);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1;
            if (x.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int i3;
                int j4;
                for (i3 = 0; j1 < x.length; i3 = j4)
                {
                    String s3 = x[j1];
                    int k5 = l1;
                    j4 = i3;
                    if (s3 != null)
                    {
                        j4 = i3 + 1;
                        k5 = l1 + koh.a(s3);
                    }
                    j1++;
                    l1 = k5;
                }

                j1 = i1 + l1 + i3 * 1;
            }
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + koh.b(15, A);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.b(16, r);
        }
        l1 = j1;
        if (s != null)
        {
            l1 = j1 + koh.b(17, s);
        }
        i1 = l1;
        if (h != null)
        {
            i1 = l1 + koh.b(18, h);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1;
            if (u.length > 0)
            {
                j1 = 0;
                int i2 = 0;
                int j3;
                int k4;
                for (j3 = 0; j1 < u.length; j3 = k4)
                {
                    String s4 = u[j1];
                    int l5 = i2;
                    k4 = j3;
                    if (s4 != null)
                    {
                        k4 = j3 + 1;
                        l5 = i2 + koh.a(s4);
                    }
                    j1++;
                    i2 = l5;
                }

                j1 = i1 + i2 + j3 * 2;
            }
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + koh.b(20, v);
        }
        j1 = i1;
        if (B != null)
        {
            j1 = i1 + koh.b(21, B);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.e(22, i.intValue());
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + koh.e(23, t.intValue());
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.b(24, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.b(25, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.b(26, l);
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + koh.e(27, y.intValue());
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + koh.e(28, z.intValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.b(29, m);
        }
        i1 = j1;
        if (C != null)
        {
            C.booleanValue();
            i1 = j1 + (koh.f(30) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1;
            if (n.length > 0)
            {
                int j2 = 0;
                int k3 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < n.length;)
                {
                    String s5 = n[j1];
                    int i6 = j2;
                    int l4 = k3;
                    if (s5 != null)
                    {
                        l4 = k3 + 1;
                        i6 = j2 + koh.a(s5);
                    }
                    j1++;
                    j2 = i6;
                    k3 = l4;
                }

                j1 = i1 + j2 + k3 * 2;
            }
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + koh.d(32, D);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L34:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 32: default 272
    //                   0: 281
    //                   10: 283
    //                   16: 312
    //                   24: 362
    //                   34: 406
    //                   42: 417
    //                   58: 428
    //                   66: 439
    //                   72: 450
    //                   82: 464
    //                   90: 475
    //                   98: 577
    //                   106: 679
    //                   114: 690
    //                   122: 792
    //                   130: 803
    //                   138: 814
    //                   146: 825
    //                   154: 836
    //                   162: 939
    //                   170: 950
    //                   176: 961
    //                   184: 975
    //                   194: 989
    //                   202: 1000
    //                   210: 1011
    //                   216: 1022
    //                   224: 1036
    //                   234: 1050
    //                   240: 1061
    //                   250: 1075
    //                   258: 1178;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L34; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new ixf();
        }
        kog1.a(requestHeader);
          goto _L34
_L4:
        int j1 = kog1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            a = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = kog1.f();
        switch (k1)
        {
        case 1: // '\001'
        case 2: // '\002'
            b = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        e = kog1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        f = kog1.k();
        continue; /* Loop/switch isn't completed */
_L10:
        o = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L11:
        p = kog1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        int i3 = kou.b(kog1, 90);
        String as[];
        int l1;
        if (g == null)
        {
            l1 = 0;
        } else
        {
            l1 = g.length;
        }
        as = new String[i3 + l1];
        i3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(g, 0, as, 0, l1);
            i3 = l1;
        }
        for (; i3 < as.length - 1; i3++)
        {
            as[i3] = kog1.j();
            kog1.a();
        }

        as[i3] = kog1.j();
        g = as;
        continue; /* Loop/switch isn't completed */
_L13:
        int j3 = kou.b(kog1, 98);
        String as1[];
        int i2;
        if (q == null)
        {
            i2 = 0;
        } else
        {
            i2 = q.length;
        }
        as1 = new String[j3 + i2];
        j3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(q, 0, as1, 0, i2);
            j3 = i2;
        }
        for (; j3 < as1.length - 1; j3++)
        {
            as1[j3] = kog1.j();
            kog1.a();
        }

        as1[j3] = kog1.j();
        q = as1;
        continue; /* Loop/switch isn't completed */
_L14:
        w = kog1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        int k3 = kou.b(kog1, 114);
        String as2[];
        int j2;
        if (x == null)
        {
            j2 = 0;
        } else
        {
            j2 = x.length;
        }
        as2 = new String[k3 + j2];
        k3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(x, 0, as2, 0, j2);
            k3 = j2;
        }
        for (; k3 < as2.length - 1; k3++)
        {
            as2[k3] = kog1.j();
            kog1.a();
        }

        as2[k3] = kog1.j();
        x = as2;
        continue; /* Loop/switch isn't completed */
_L16:
        A = kog1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        r = kog1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        s = kog1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        h = kog1.j();
        continue; /* Loop/switch isn't completed */
_L20:
        int l3 = kou.b(kog1, 154);
        String as3[];
        int k2;
        if (u == null)
        {
            k2 = 0;
        } else
        {
            k2 = u.length;
        }
        as3 = new String[l3 + k2];
        l3 = k2;
        if (k2 != 0)
        {
            System.arraycopy(u, 0, as3, 0, k2);
            l3 = k2;
        }
        for (; l3 < as3.length - 1; l3++)
        {
            as3[l3] = kog1.j();
            kog1.a();
        }

        as3[l3] = kog1.j();
        u = as3;
        continue; /* Loop/switch isn't completed */
_L21:
        v = kog1.j();
        continue; /* Loop/switch isn't completed */
_L22:
        B = kog1.j();
        continue; /* Loop/switch isn't completed */
_L23:
        i = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L24:
        t = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L25:
        j = kog1.j();
        continue; /* Loop/switch isn't completed */
_L26:
        k = kog1.j();
        continue; /* Loop/switch isn't completed */
_L27:
        l = kog1.j();
        continue; /* Loop/switch isn't completed */
_L28:
        y = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L29:
        z = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L30:
        m = kog1.j();
        continue; /* Loop/switch isn't completed */
_L31:
        C = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L32:
        int i4 = kou.b(kog1, 250);
        String as4[];
        int l2;
        if (n == null)
        {
            l2 = 0;
        } else
        {
            l2 = n.length;
        }
        as4 = new String[i4 + l2];
        i4 = l2;
        if (l2 != 0)
        {
            System.arraycopy(n, 0, as4, 0, l2);
            i4 = l2;
        }
        for (; i4 < as4.length - 1; i4++)
        {
            as4[i4] = kog1.j();
            kog1.a();
        }

        as4[i4] = kog1.j();
        n = as4;
        continue; /* Loop/switch isn't completed */
_L33:
        if (D == null)
        {
            D = new iyn();
        }
        kog1.a(D);
        if (true) goto _L34; else goto _L35
_L35:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (a != null)
        {
            koh1.a(2, a.intValue());
        }
        if (b != null)
        {
            koh1.a(3, b.intValue());
        }
        if (c != null)
        {
            koh1.a(4, c);
        }
        if (d != null)
        {
            koh1.a(5, d);
        }
        if (e != null)
        {
            koh1.a(7, e);
        }
        if (f != null)
        {
            koh1.a(8, f);
        }
        if (o != null)
        {
            koh1.b(9, o.longValue());
        }
        if (p != null)
        {
            koh1.a(10, p);
        }
        if (g != null && g.length > 0)
        {
            for (int i1 = 0; i1 < g.length; i1++)
            {
                String s1 = g[i1];
                if (s1 != null)
                {
                    koh1.a(11, s1);
                }
            }

        }
        if (q != null && q.length > 0)
        {
            for (int j1 = 0; j1 < q.length; j1++)
            {
                String s2 = q[j1];
                if (s2 != null)
                {
                    koh1.a(12, s2);
                }
            }

        }
        if (w != null)
        {
            koh1.a(13, w);
        }
        if (x != null && x.length > 0)
        {
            for (int k1 = 0; k1 < x.length; k1++)
            {
                String s3 = x[k1];
                if (s3 != null)
                {
                    koh1.a(14, s3);
                }
            }

        }
        if (A != null)
        {
            koh1.a(15, A);
        }
        if (r != null)
        {
            koh1.a(16, r);
        }
        if (s != null)
        {
            koh1.a(17, s);
        }
        if (h != null)
        {
            koh1.a(18, h);
        }
        if (u != null && u.length > 0)
        {
            for (int l1 = 0; l1 < u.length; l1++)
            {
                String s4 = u[l1];
                if (s4 != null)
                {
                    koh1.a(19, s4);
                }
            }

        }
        if (v != null)
        {
            koh1.a(20, v);
        }
        if (B != null)
        {
            koh1.a(21, B);
        }
        if (i != null)
        {
            koh1.a(22, i.intValue());
        }
        if (t != null)
        {
            koh1.a(23, t.intValue());
        }
        if (j != null)
        {
            koh1.a(24, j);
        }
        if (k != null)
        {
            koh1.a(25, k);
        }
        if (l != null)
        {
            koh1.a(26, l);
        }
        if (y != null)
        {
            koh1.a(27, y.intValue());
        }
        if (z != null)
        {
            koh1.a(28, z.intValue());
        }
        if (m != null)
        {
            koh1.a(29, m);
        }
        if (C != null)
        {
            koh1.a(30, C.booleanValue());
        }
        if (n != null && n.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < n.length; i2++)
            {
                String s5 = n[i2];
                if (s5 != null)
                {
                    koh1.a(31, s5);
                }
            }

        }
        if (D != null)
        {
            koh1.b(32, D);
        }
        super.writeTo(koh1);
    }
}
