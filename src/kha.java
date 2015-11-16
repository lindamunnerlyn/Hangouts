// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kha extends kwm
{

    public String a;
    public khg b;
    public kjc c;
    public kjc d;
    public String e;
    public khk f;
    public Integer g;
    public Integer h;
    public Integer i;
    public khj j;
    public kjd k[];
    public kgv l;
    public kje m[];
    public kjk n;
    public String o;
    public String p;
    public kju q;
    public khc r;
    public kre s[];
    public khd t;
    public khi u;

    public kha()
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
        k = kjd.a();
        l = null;
        m = kje.a();
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = kre.a();
        t = null;
        u = null;
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
            i1 = j1 + kwk.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.d(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.d(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.d(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.e(7, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.e(8, h.intValue());
        }
        int k1 = j1;
        if (i != null)
        {
            k1 = j1 + kwk.e(9, i.intValue());
        }
        i1 = k1;
        if (j != null)
        {
            i1 = k1 + kwk.d(10, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    kjd kjd1 = k[j1];
                    int l1 = i1;
                    if (kjd1 != null)
                    {
                        l1 = i1 + kwk.d(11, kjd1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.d(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    kje kje1 = m[j1];
                    int i2 = i1;
                    if (kje1 != null)
                    {
                        i2 = i1 + kwk.d(13, kje1);
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
            i1 = j1 + kwk.d(14, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.b(15, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.b(16, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + kwk.d(17, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + kwk.d(18, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1;
            if (s.length > 0)
            {
                int j2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (j2 >= s.length)
                    {
                        break;
                    }
                    kre kre1 = s[j2];
                    j1 = i1;
                    if (kre1 != null)
                    {
                        j1 = i1 + kwk.d(19, kre1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + kwk.d(20, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + kwk.d(21, u);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L24:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 22: default 192
    //                   0: 201
    //                   10: 203
    //                   18: 214
    //                   26: 243
    //                   34: 272
    //                   42: 301
    //                   50: 312
    //                   56: 341
    //                   64: 355
    //                   72: 402
    //                   82: 416
    //                   90: 445
    //                   98: 569
    //                   106: 598
    //                   114: 722
    //                   122: 751
    //                   130: 762
    //                   138: 773
    //                   146: 802
    //                   154: 831
    //                   162: 956
    //                   170: 985;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L24; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L24
_L4:
        if (b == null)
        {
            b = new khg();
        }
        kwj1.a(b);
          goto _L24
_L5:
        if (c == null)
        {
            c = new kjc();
        }
        kwj1.a(c);
          goto _L24
_L6:
        if (d == null)
        {
            d = new kjc();
        }
        kwj1.a(d);
          goto _L24
_L7:
        e = kwj1.j();
          goto _L24
_L8:
        if (f == null)
        {
            f = new khk();
        }
        kwj1.a(f);
          goto _L24
_L9:
        g = Integer.valueOf(kwj1.f());
          goto _L24
_L10:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        i = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L12:
        if (j == null)
        {
            j = new khj();
        }
        kwj1.a(j);
        continue; /* Loop/switch isn't completed */
_L13:
        int j2 = kwx.a(kwj1, 90);
        kjd akjd[];
        int k1;
        if (k == null)
        {
            k1 = 0;
        } else
        {
            k1 = k.length;
        }
        akjd = new kjd[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(k, 0, akjd, 0, k1);
            j2 = k1;
        }
        for (; j2 < akjd.length - 1; j2++)
        {
            akjd[j2] = new kjd();
            kwj1.a(akjd[j2]);
            kwj1.a();
        }

        akjd[j2] = new kjd();
        kwj1.a(akjd[j2]);
        k = akjd;
        continue; /* Loop/switch isn't completed */
_L14:
        if (l == null)
        {
            l = new kgv();
        }
        kwj1.a(l);
        continue; /* Loop/switch isn't completed */
_L15:
        int k2 = kwx.a(kwj1, 106);
        kje akje[];
        int l1;
        if (m == null)
        {
            l1 = 0;
        } else
        {
            l1 = m.length;
        }
        akje = new kje[k2 + l1];
        k2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(m, 0, akje, 0, l1);
            k2 = l1;
        }
        for (; k2 < akje.length - 1; k2++)
        {
            akje[k2] = new kje();
            kwj1.a(akje[k2]);
            kwj1.a();
        }

        akje[k2] = new kje();
        kwj1.a(akje[k2]);
        m = akje;
        continue; /* Loop/switch isn't completed */
_L16:
        if (n == null)
        {
            n = new kjk();
        }
        kwj1.a(n);
        continue; /* Loop/switch isn't completed */
_L17:
        o = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        p = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        if (q == null)
        {
            q = new kju();
        }
        kwj1.a(q);
        continue; /* Loop/switch isn't completed */
_L20:
        if (r == null)
        {
            r = new khc();
        }
        kwj1.a(r);
        continue; /* Loop/switch isn't completed */
_L21:
        int l2 = kwx.a(kwj1, 154);
        kre akre[];
        int i2;
        if (s == null)
        {
            i2 = 0;
        } else
        {
            i2 = s.length;
        }
        akre = new kre[l2 + i2];
        l2 = i2;
        if (i2 != 0)
        {
            System.arraycopy(s, 0, akre, 0, i2);
            l2 = i2;
        }
        for (; l2 < akre.length - 1; l2++)
        {
            akre[l2] = new kre();
            kwj1.a(akre[l2]);
            kwj1.a();
        }

        akre[l2] = new kre();
        kwj1.a(akre[l2]);
        s = akre;
        continue; /* Loop/switch isn't completed */
_L22:
        if (t == null)
        {
            t = new khd();
        }
        kwj1.a(t);
        continue; /* Loop/switch isn't completed */
_L23:
        if (u == null)
        {
            u = new khi();
        }
        kwj1.a(u);
        if (true) goto _L24; else goto _L25
_L25:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g.intValue());
        }
        if (h != null)
        {
            kwk1.a(8, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(9, i.intValue());
        }
        if (j != null)
        {
            kwk1.b(10, j);
        }
        if (k != null && k.length > 0)
        {
            for (int i1 = 0; i1 < k.length; i1++)
            {
                kjd kjd1 = k[i1];
                if (kjd1 != null)
                {
                    kwk1.b(11, kjd1);
                }
            }

        }
        if (l != null)
        {
            kwk1.b(12, l);
        }
        if (m != null && m.length > 0)
        {
            for (int j1 = 0; j1 < m.length; j1++)
            {
                kje kje1 = m[j1];
                if (kje1 != null)
                {
                    kwk1.b(13, kje1);
                }
            }

        }
        if (n != null)
        {
            kwk1.b(14, n);
        }
        if (o != null)
        {
            kwk1.a(15, o);
        }
        if (p != null)
        {
            kwk1.a(16, p);
        }
        if (q != null)
        {
            kwk1.b(17, q);
        }
        if (r != null)
        {
            kwk1.b(18, r);
        }
        if (s != null && s.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < s.length; k1++)
            {
                kre kre1 = s[k1];
                if (kre1 != null)
                {
                    kwk1.b(19, kre1);
                }
            }

        }
        if (t != null)
        {
            kwk1.b(20, t);
        }
        if (u != null)
        {
            kwk1.b(21, u);
        }
        super.writeTo(kwk1);
    }
}
