// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ind extends kwm
{

    public Integer A;
    public img B;
    public Integer C;
    public inl D;
    public inc E;
    public inm F;
    public Boolean G;
    public ing H;
    public inf I;
    public Boolean J;
    public Boolean K;
    public Integer L;
    public Integer a;
    public Integer b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public Integer i;
    public String j;
    public String k;
    public imi l[];
    public Integer m;
    public imj n;
    public ikw o;
    public imt p;
    public Boolean q;
    public Integer r;
    public ine s[];
    public Long t;
    public Boolean u;
    public Integer v;
    public Integer w;
    public Integer x;
    public Boolean y;
    public Integer z;

    public ind()
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
        l = imi.a();
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = ine.a();
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
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
        L = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + kwk.e(1, a.intValue()) + kwk.e(2, b.intValue());
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(5, e);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.e(6, h.intValue());
        }
        int k1 = j1;
        if (j != null)
        {
            k1 = j1 + kwk.b(7, j);
        }
        i1 = k1;
        if (k != null)
        {
            i1 = k1 + kwk.b(8, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                for (j1 = 0; j1 < l.length;)
                {
                    imi imi1 = l[j1];
                    k1 = i1;
                    if (imi1 != null)
                    {
                        k1 = i1 + kwk.d(9, imi1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.e(10, m.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.d(11, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.d(12, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.d(13, p);
        }
        k1 = j1;
        if (q != null)
        {
            q.booleanValue();
            k1 = j1 + (kwk.f(14) + 1);
        }
        i1 = k1;
        if (r != null)
        {
            i1 = k1 + kwk.e(15, r.intValue());
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1;
            if (s.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= s.length)
                    {
                        break;
                    }
                    ine ine1 = s[l1];
                    j1 = i1;
                    if (ine1 != null)
                    {
                        j1 = i1 + kwk.d(16, ine1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + kwk.e(17, t.longValue());
        }
        j1 = i1;
        if (u != null)
        {
            u.booleanValue();
            j1 = i1 + (kwk.f(18) + 1);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + kwk.e(19, v.intValue());
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + kwk.e(20, w.intValue());
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + kwk.e(21, z.intValue());
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1 + kwk.e(22, A.intValue());
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + kwk.d(23, B);
        }
        j1 = i1;
        if (C != null)
        {
            j1 = i1 + kwk.e(24, C.intValue());
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + kwk.d(25, D);
        }
        j1 = i1;
        if (E != null)
        {
            j1 = i1 + kwk.d(26, E);
        }
        i1 = j1;
        if (F != null)
        {
            i1 = j1 + kwk.d(27, F);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.b(28, f);
        }
        i1 = j1;
        if (y != null)
        {
            y.booleanValue();
            i1 = j1 + (kwk.f(29) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.e(30, i.intValue());
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + kwk.e(31, x.intValue());
        }
        j1 = i1;
        if (G != null)
        {
            G.booleanValue();
            j1 = i1 + (kwk.f(32) + 1);
        }
        i1 = j1;
        if (H != null)
        {
            i1 = j1 + kwk.d(33, H);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(34, g);
        }
        i1 = j1;
        if (I != null)
        {
            i1 = j1 + kwk.d(35, I);
        }
        j1 = i1;
        if (J != null)
        {
            J.booleanValue();
            j1 = i1 + (kwk.f(36) + 1);
        }
        i1 = j1;
        if (K != null)
        {
            K.booleanValue();
            i1 = j1 + (kwk.f(37) + 1);
        }
        j1 = i1;
        if (L != null)
        {
            j1 = i1 + kwk.e(38, L.intValue());
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L41:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 39: default 328
    //                   0: 337
    //                   8: 339
    //                   16: 458
    //                   26: 502
    //                   34: 513
    //                   42: 524
    //                   48: 535
    //                   58: 549
    //                   66: 560
    //                   74: 571
    //                   80: 695
    //                   90: 750
    //                   98: 779
    //                   106: 808
    //                   112: 837
    //                   120: 851
    //                   130: 898
    //                   136: 1023
    //                   144: 1037
    //                   152: 1051
    //                   160: 1098
    //                   168: 1112
    //                   176: 1150
    //                   186: 1194
    //                   192: 1223
    //                   202: 1237
    //                   210: 1266
    //                   218: 1295
    //                   226: 1324
    //                   232: 1335
    //                   240: 1349
    //                   248: 1363
    //                   256: 1377
    //                   266: 1391
    //                   274: 1420
    //                   282: 1431
    //                   288: 1460
    //                   296: 1474
    //                   304: 1488;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L41; else goto _L2
_L2:
        return this;
_L3:
        int j1 = kwj1.f();
        switch (j1)
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
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
            a = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 1: // '\001'
        case 2: // '\002'
            b = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        h = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        int l3 = kwx.a(kwj1, 74);
        imi aimi[];
        int l1;
        if (l == null)
        {
            l1 = 0;
        } else
        {
            l1 = l.length;
        }
        aimi = new imi[l3 + l1];
        l3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(l, 0, aimi, 0, l1);
            l3 = l1;
        }
        for (; l3 < aimi.length - 1; l3++)
        {
            aimi[l3] = new imi();
            kwj1.a(aimi[l3]);
            kwj1.a();
        }

        aimi[l3] = new imi();
        kwj1.a(aimi[l3]);
        l = aimi;
        continue; /* Loop/switch isn't completed */
_L12:
        int i2 = kwj1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            m = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        if (n == null)
        {
            n = new imj();
        }
        kwj1.a(n);
        continue; /* Loop/switch isn't completed */
_L14:
        if (o == null)
        {
            o = new ikw();
        }
        kwj1.a(o);
        continue; /* Loop/switch isn't completed */
_L15:
        if (p == null)
        {
            p = new imt();
        }
        kwj1.a(p);
        continue; /* Loop/switch isn't completed */
_L16:
        q = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        int j2 = kwj1.f();
        switch (j2)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            r = Integer.valueOf(j2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L18:
        int i4 = kwx.a(kwj1, 130);
        ine aine[];
        int k2;
        if (s == null)
        {
            k2 = 0;
        } else
        {
            k2 = s.length;
        }
        aine = new ine[i4 + k2];
        i4 = k2;
        if (k2 != 0)
        {
            System.arraycopy(s, 0, aine, 0, k2);
            i4 = k2;
        }
        for (; i4 < aine.length - 1; i4++)
        {
            aine[i4] = new ine();
            kwj1.a(aine[i4]);
            kwj1.a();
        }

        aine[i4] = new ine();
        kwj1.a(aine[i4]);
        s = aine;
        continue; /* Loop/switch isn't completed */
_L19:
        t = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L20:
        u = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L21:
        int l2 = kwj1.f();
        switch (l2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            v = Integer.valueOf(l2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L22:
        w = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L23:
        int i3 = kwj1.f();
        switch (i3)
        {
        case 0: // '\0'
            z = Integer.valueOf(i3);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L24:
        int j3 = kwj1.f();
        switch (j3)
        {
        case 0: // '\0'
        case 1: // '\001'
            A = Integer.valueOf(j3);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L25:
        if (B == null)
        {
            B = new img();
        }
        kwj1.a(B);
        continue; /* Loop/switch isn't completed */
_L26:
        C = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L27:
        if (D == null)
        {
            D = new inl();
        }
        kwj1.a(D);
        continue; /* Loop/switch isn't completed */
_L28:
        if (E == null)
        {
            E = new inc();
        }
        kwj1.a(E);
        continue; /* Loop/switch isn't completed */
_L29:
        if (F == null)
        {
            F = new inm();
        }
        kwj1.a(F);
        continue; /* Loop/switch isn't completed */
_L30:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L31:
        y = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L32:
        i = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L33:
        x = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L34:
        G = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L35:
        if (H == null)
        {
            H = new ing();
        }
        kwj1.a(H);
        continue; /* Loop/switch isn't completed */
_L36:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L37:
        if (I == null)
        {
            I = new inf();
        }
        kwj1.a(I);
        continue; /* Loop/switch isn't completed */
_L38:
        J = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L39:
        K = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L40:
        int k3 = kwj1.f();
        switch (k3)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            L = Integer.valueOf(k3);
            break;
        }
        if (true) goto _L41; else goto _L42
_L42:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(1, a.intValue());
        kwk1.a(2, b.intValue());
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (h != null)
        {
            kwk1.a(6, h.intValue());
        }
        if (j != null)
        {
            kwk1.a(7, j);
        }
        if (k != null)
        {
            kwk1.a(8, k);
        }
        if (l != null && l.length > 0)
        {
            for (int i1 = 0; i1 < l.length; i1++)
            {
                imi imi1 = l[i1];
                if (imi1 != null)
                {
                    kwk1.b(9, imi1);
                }
            }

        }
        if (m != null)
        {
            kwk1.a(10, m.intValue());
        }
        if (n != null)
        {
            kwk1.b(11, n);
        }
        if (o != null)
        {
            kwk1.b(12, o);
        }
        if (p != null)
        {
            kwk1.b(13, p);
        }
        if (q != null)
        {
            kwk1.a(14, q.booleanValue());
        }
        if (r != null)
        {
            kwk1.a(15, r.intValue());
        }
        if (s != null && s.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < s.length; j1++)
            {
                ine ine1 = s[j1];
                if (ine1 != null)
                {
                    kwk1.b(16, ine1);
                }
            }

        }
        if (t != null)
        {
            kwk1.b(17, t.longValue());
        }
        if (u != null)
        {
            kwk1.a(18, u.booleanValue());
        }
        if (v != null)
        {
            kwk1.a(19, v.intValue());
        }
        if (w != null)
        {
            kwk1.a(20, w.intValue());
        }
        if (z != null)
        {
            kwk1.a(21, z.intValue());
        }
        if (A != null)
        {
            kwk1.a(22, A.intValue());
        }
        if (B != null)
        {
            kwk1.b(23, B);
        }
        if (C != null)
        {
            kwk1.a(24, C.intValue());
        }
        if (D != null)
        {
            kwk1.b(25, D);
        }
        if (E != null)
        {
            kwk1.b(26, E);
        }
        if (F != null)
        {
            kwk1.b(27, F);
        }
        if (f != null)
        {
            kwk1.a(28, f);
        }
        if (y != null)
        {
            kwk1.a(29, y.booleanValue());
        }
        if (i != null)
        {
            kwk1.a(30, i.intValue());
        }
        if (x != null)
        {
            kwk1.a(31, x.intValue());
        }
        if (G != null)
        {
            kwk1.a(32, G.booleanValue());
        }
        if (H != null)
        {
            kwk1.b(33, H);
        }
        if (g != null)
        {
            kwk1.a(34, g);
        }
        if (I != null)
        {
            kwk1.b(35, I);
        }
        if (J != null)
        {
            kwk1.a(36, J.booleanValue());
        }
        if (K != null)
        {
            kwk1.a(37, K.booleanValue());
        }
        if (L != null)
        {
            kwk1.a(38, L.intValue());
        }
        super.writeTo(kwk1);
    }
}
