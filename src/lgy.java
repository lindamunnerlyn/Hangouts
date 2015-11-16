// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lgy extends kwm
{

    private static volatile lgy F[];
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public lgs a;
    public Boolean b;
    public Integer c;
    public Boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public lkr j;
    public lgz k;
    public lhc l;
    public String m[];
    public String n[];
    public String o;
    public String p;
    public Boolean q;
    public lhc r;
    public lgz s;
    public lhb t;
    public lhf u[];
    public lhe v[];
    public lhw w;
    public lkh x;
    public lkg y;
    public Integer z;

    public lgy()
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
        m = kwx.f;
        n = kwx.f;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = lhf.a();
        v = lhe.a();
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lgy[] a()
    {
        if (F == null)
        {
            synchronized (kwq.a)
            {
                if (F == null)
                {
                    F = new lgy[0];
                }
            }
        }
        return F;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.d(1, a);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.e(2, c.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.b(4, f);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(5, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.b(6, i);
        }
        int k1 = j1;
        if (k != null)
        {
            k1 = j1 + kwk.d(7, k);
        }
        i1 = k1;
        if (l != null)
        {
            i1 = k1 + kwk.d(8, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                j1 = 0;
                int l1 = 0;
                int l2;
                int j3;
                for (l2 = 0; j1 < m.length; l2 = j3)
                {
                    String s1 = m[j1];
                    int l3 = l1;
                    j3 = l2;
                    if (s1 != null)
                    {
                        j3 = l2 + 1;
                        l3 = l1 + kwk.a(s1);
                    }
                    j1++;
                    l1 = l3;
                }

                j1 = i1 + l1 + l2 * 1;
            }
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1;
            if (n.length > 0)
            {
                i1 = 0;
                int i2 = 0;
                int i3;
                int k3;
                for (i3 = 0; i1 < n.length; i3 = k3)
                {
                    String s2 = n[i1];
                    int i4 = i2;
                    k3 = i3;
                    if (s2 != null)
                    {
                        k3 = i3 + 1;
                        i4 = i2 + kwk.a(s2);
                    }
                    i1++;
                    i2 = i4;
                }

                i1 = j1 + i2 + i3 * 1;
            }
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.b(11, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.b(12, p);
        }
        j1 = i1;
        if (q != null)
        {
            q.booleanValue();
            j1 = i1 + (kwk.f(13) + 1);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + kwk.d(14, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + kwk.d(15, s);
        }
        i1 = j1;
        if (d != null)
        {
            d.booleanValue();
            i1 = j1 + (kwk.f(16) + 1);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1;
            if (u.length > 0)
            {
                for (j1 = 0; j1 < u.length;)
                {
                    lhf lhf1 = u[j1];
                    int j2 = i1;
                    if (lhf1 != null)
                    {
                        j2 = i1 + kwk.d(17, lhf1);
                    }
                    j1++;
                    i1 = j2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.d(18, w);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + kwk.d(19, x);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + kwk.d(20, y);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.d(25, j);
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + kwk.e(26, z.intValue());
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + kwk.d(27, t);
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + kwk.b(28, A);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1;
            if (v.length > 0)
            {
                int k2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (k2 >= v.length)
                    {
                        break;
                    }
                    lhe lhe1 = v[k2];
                    j1 = i1;
                    if (lhe1 != null)
                    {
                        j1 = i1 + kwk.d(29, lhe1);
                    }
                    k2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + kwk.b(30, B);
        }
        j1 = i1;
        if (C != null)
        {
            j1 = i1 + kwk.b(31, C);
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + kwk.b(32, D);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(33, g);
        }
        i1 = j1;
        if (E != null)
        {
            i1 = j1 + kwk.b(34, E);
        }
        j1 = i1;
        if (b != null)
        {
            b.booleanValue();
            j1 = i1 + (kwk.f(35) + 1);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L34:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 32: default 272
    //                   0: 281
    //                   10: 283
    //                   16: 312
    //                   26: 326
    //                   34: 337
    //                   42: 348
    //                   50: 359
    //                   58: 370
    //                   66: 399
    //                   74: 428
    //                   82: 530
    //                   90: 632
    //                   98: 643
    //                   104: 654
    //                   114: 668
    //                   122: 697
    //                   128: 726
    //                   138: 740
    //                   146: 865
    //                   154: 894
    //                   162: 923
    //                   202: 952
    //                   208: 981
    //                   218: 1026
    //                   226: 1055
    //                   234: 1066
    //                   242: 1191
    //                   250: 1202
    //                   258: 1213
    //                   266: 1224
    //                   274: 1235
    //                   280: 1246;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L34; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new lgs();
        }
        kwj1.a(a);
          goto _L34
_L4:
        c = Integer.valueOf(kwj1.f());
          goto _L34
_L5:
        e = kwj1.j();
          goto _L34
_L6:
        f = kwj1.j();
          goto _L34
_L7:
        h = kwj1.j();
          goto _L34
_L8:
        i = kwj1.j();
          goto _L34
_L9:
        if (k == null)
        {
            k = new lgz();
        }
        kwj1.a(k);
          goto _L34
_L10:
        if (l == null)
        {
            l = new lhc();
        }
        kwj1.a(l);
          goto _L34
_L11:
        int k2 = kwx.a(kwj1, 74);
        String as[];
        int j1;
        if (m == null)
        {
            j1 = 0;
        } else
        {
            j1 = m.length;
        }
        as = new String[k2 + j1];
        k2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(m, 0, as, 0, j1);
            k2 = j1;
        }
        for (; k2 < as.length - 1; k2++)
        {
            as[k2] = kwj1.j();
            kwj1.a();
        }

        as[k2] = kwj1.j();
        m = as;
          goto _L34
_L12:
        int l2 = kwx.a(kwj1, 82);
        String as1[];
        int k1;
        if (n == null)
        {
            k1 = 0;
        } else
        {
            k1 = n.length;
        }
        as1 = new String[l2 + k1];
        l2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(n, 0, as1, 0, k1);
            l2 = k1;
        }
        for (; l2 < as1.length - 1; l2++)
        {
            as1[l2] = kwj1.j();
            kwj1.a();
        }

        as1[l2] = kwj1.j();
        n = as1;
          goto _L34
_L13:
        o = kwj1.j();
          goto _L34
_L14:
        p = kwj1.j();
          goto _L34
_L15:
        q = Boolean.valueOf(kwj1.i());
          goto _L34
_L16:
        if (r == null)
        {
            r = new lhc();
        }
        kwj1.a(r);
          goto _L34
_L17:
        if (s == null)
        {
            s = new lgz();
        }
        kwj1.a(s);
          goto _L34
_L18:
        d = Boolean.valueOf(kwj1.i());
          goto _L34
_L19:
        int i3 = kwx.a(kwj1, 138);
        lhf alhf[];
        int l1;
        if (u == null)
        {
            l1 = 0;
        } else
        {
            l1 = u.length;
        }
        alhf = new lhf[i3 + l1];
        i3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(u, 0, alhf, 0, l1);
            i3 = l1;
        }
        for (; i3 < alhf.length - 1; i3++)
        {
            alhf[i3] = new lhf();
            kwj1.a(alhf[i3]);
            kwj1.a();
        }

        alhf[i3] = new lhf();
        kwj1.a(alhf[i3]);
        u = alhf;
          goto _L34
_L20:
        if (w == null)
        {
            w = new lhw();
        }
        kwj1.a(w);
          goto _L34
_L21:
        if (x == null)
        {
            x = new lkh();
        }
        kwj1.a(x);
          goto _L34
_L22:
        if (y == null)
        {
            y = new lkg();
        }
        kwj1.a(y);
          goto _L34
_L23:
        if (j == null)
        {
            j = new lkr();
        }
        kwj1.a(j);
          goto _L34
_L24:
        int i2 = kwj1.f();
        switch (i2)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            z = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L25:
        if (t == null)
        {
            t = new lhb();
        }
        kwj1.a(t);
        continue; /* Loop/switch isn't completed */
_L26:
        A = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L27:
        int j3 = kwx.a(kwj1, 234);
        lhe alhe[];
        int j2;
        if (v == null)
        {
            j2 = 0;
        } else
        {
            j2 = v.length;
        }
        alhe = new lhe[j3 + j2];
        j3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(v, 0, alhe, 0, j2);
            j3 = j2;
        }
        for (; j3 < alhe.length - 1; j3++)
        {
            alhe[j3] = new lhe();
            kwj1.a(alhe[j3]);
            kwj1.a();
        }

        alhe[j3] = new lhe();
        kwj1.a(alhe[j3]);
        v = alhe;
        continue; /* Loop/switch isn't completed */
_L28:
        B = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L29:
        C = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L30:
        D = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L31:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L32:
        E = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L33:
        b = Boolean.valueOf(kwj1.i());
        if (true) goto _L34; else goto _L35
_L35:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (c != null)
        {
            kwk1.a(2, c.intValue());
        }
        if (e != null)
        {
            kwk1.a(3, e);
        }
        if (f != null)
        {
            kwk1.a(4, f);
        }
        if (h != null)
        {
            kwk1.a(5, h);
        }
        if (i != null)
        {
            kwk1.a(6, i);
        }
        if (k != null)
        {
            kwk1.b(7, k);
        }
        if (l != null)
        {
            kwk1.b(8, l);
        }
        if (m != null && m.length > 0)
        {
            for (int i1 = 0; i1 < m.length; i1++)
            {
                String s1 = m[i1];
                if (s1 != null)
                {
                    kwk1.a(9, s1);
                }
            }

        }
        if (n != null && n.length > 0)
        {
            for (int j1 = 0; j1 < n.length; j1++)
            {
                String s2 = n[j1];
                if (s2 != null)
                {
                    kwk1.a(10, s2);
                }
            }

        }
        if (o != null)
        {
            kwk1.a(11, o);
        }
        if (p != null)
        {
            kwk1.a(12, p);
        }
        if (q != null)
        {
            kwk1.a(13, q.booleanValue());
        }
        if (r != null)
        {
            kwk1.b(14, r);
        }
        if (s != null)
        {
            kwk1.b(15, s);
        }
        if (d != null)
        {
            kwk1.a(16, d.booleanValue());
        }
        if (u != null && u.length > 0)
        {
            for (int k1 = 0; k1 < u.length; k1++)
            {
                lhf lhf1 = u[k1];
                if (lhf1 != null)
                {
                    kwk1.b(17, lhf1);
                }
            }

        }
        if (w != null)
        {
            kwk1.b(18, w);
        }
        if (x != null)
        {
            kwk1.b(19, x);
        }
        if (y != null)
        {
            kwk1.b(20, y);
        }
        if (j != null)
        {
            kwk1.b(25, j);
        }
        if (z != null)
        {
            kwk1.a(26, z.intValue());
        }
        if (t != null)
        {
            kwk1.b(27, t);
        }
        if (A != null)
        {
            kwk1.a(28, A);
        }
        if (v != null && v.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < v.length; l1++)
            {
                lhe lhe1 = v[l1];
                if (lhe1 != null)
                {
                    kwk1.b(29, lhe1);
                }
            }

        }
        if (B != null)
        {
            kwk1.a(30, B);
        }
        if (C != null)
        {
            kwk1.a(31, C);
        }
        if (D != null)
        {
            kwk1.a(32, D);
        }
        if (g != null)
        {
            kwk1.a(33, g);
        }
        if (E != null)
        {
            kwk1.a(34, E);
        }
        if (b != null)
        {
            kwk1.a(35, b.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
