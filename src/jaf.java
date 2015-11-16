// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jaf extends kwm
{

    public iyx a;
    public Boolean b;
    public ixa c[];
    public iyp d;
    public iyg e;
    public iyh f;
    public jcg g;
    public ixc h[];
    public Boolean i;
    public Boolean j;
    public iyi k;
    public jdo l;
    public Boolean m;
    public Boolean n;
    public Integer o;
    public jce p[];
    public Integer q;
    public kbl r;
    public jdl responseHeader;
    public izk s[];
    public jfm t;

    public jaf()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = ixa.a();
        d = null;
        e = null;
        f = null;
        g = null;
        h = ixc.a();
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = jce.a();
        q = null;
        r = null;
        s = izk.a();
        t = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (responseHeader != null)
        {
            i1 = j1 + kwk.d(1, responseHeader);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + kwk.d(2, a);
        }
        i1 = j1;
        if (b != null)
        {
            b.booleanValue();
            i1 = j1 + (kwk.f(3) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                for (j1 = 0; j1 < c.length;)
                {
                    ixa ixa1 = c[j1];
                    int k1 = i1;
                    if (ixa1 != null)
                    {
                        k1 = i1 + kwk.d(4, ixa1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.d(5, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.d(6, e);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                for (j1 = 0; j1 < h.length;)
                {
                    ixc ixc1 = h[j1];
                    int l1 = i1;
                    if (ixc1 != null)
                    {
                        l1 = i1 + kwk.d(8, ixc1);
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
            i1 = j1 + kwk.d(9, f);
        }
        j1 = i1;
        if (i != null)
        {
            i.booleanValue();
            j1 = i1 + (kwk.f(10) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.d(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.d(12, l);
        }
        i1 = j1;
        if (j != null)
        {
            j.booleanValue();
            i1 = j1 + (kwk.f(13) + 1);
        }
        j1 = i1;
        if (m != null)
        {
            m.booleanValue();
            j1 = i1 + (kwk.f(14) + 1);
        }
        int i2 = j1;
        if (n != null)
        {
            n.booleanValue();
            i2 = j1 + (kwk.f(15) + 1);
        }
        i1 = i2;
        if (o != null)
        {
            i1 = i2 + kwk.e(16, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                for (j1 = 0; j1 < p.length;)
                {
                    jce jce1 = p[j1];
                    i2 = i1;
                    if (jce1 != null)
                    {
                        i2 = i1 + kwk.d(17, jce1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i2 = j1;
        if (q != null)
        {
            i2 = j1 + kwk.e(18, q.intValue());
        }
        i1 = i2;
        if (r != null)
        {
            i1 = i2 + kwk.d(19, r);
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
                    izk izk1 = s[j2];
                    j1 = i1;
                    if (izk1 != null)
                    {
                        j1 = i1 + kwk.d(20, izk1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + kwk.d(22, t);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L24:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 22: default 192
    //                   0: 201
    //                   10: 203
    //                   18: 232
    //                   24: 261
    //                   34: 275
    //                   42: 399
    //                   50: 428
    //                   58: 457
    //                   66: 486
    //                   74: 610
    //                   80: 639
    //                   90: 653
    //                   98: 682
    //                   104: 711
    //                   112: 725
    //                   120: 739
    //                   128: 753
    //                   138: 798
    //                   144: 923
    //                   154: 974
    //                   162: 1003
    //                   178: 1128;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L24; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new jdl();
        }
        kwj1.a(responseHeader);
          goto _L24
_L4:
        if (a == null)
        {
            a = new iyx();
        }
        kwj1.a(a);
          goto _L24
_L5:
        b = Boolean.valueOf(kwj1.i());
          goto _L24
_L6:
        int l2 = kwx.a(kwj1, 34);
        ixa aixa[];
        int j1;
        if (c == null)
        {
            j1 = 0;
        } else
        {
            j1 = c.length;
        }
        aixa = new ixa[l2 + j1];
        l2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(c, 0, aixa, 0, j1);
            l2 = j1;
        }
        for (; l2 < aixa.length - 1; l2++)
        {
            aixa[l2] = new ixa();
            kwj1.a(aixa[l2]);
            kwj1.a();
        }

        aixa[l2] = new ixa();
        kwj1.a(aixa[l2]);
        c = aixa;
          goto _L24
_L7:
        if (d == null)
        {
            d = new iyp();
        }
        kwj1.a(d);
          goto _L24
_L8:
        if (e == null)
        {
            e = new iyg();
        }
        kwj1.a(e);
          goto _L24
_L9:
        if (g == null)
        {
            g = new jcg();
        }
        kwj1.a(g);
          goto _L24
_L10:
        int i3 = kwx.a(kwj1, 66);
        ixc aixc[];
        int k1;
        if (h == null)
        {
            k1 = 0;
        } else
        {
            k1 = h.length;
        }
        aixc = new ixc[i3 + k1];
        i3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(h, 0, aixc, 0, k1);
            i3 = k1;
        }
        for (; i3 < aixc.length - 1; i3++)
        {
            aixc[i3] = new ixc();
            kwj1.a(aixc[i3]);
            kwj1.a();
        }

        aixc[i3] = new ixc();
        kwj1.a(aixc[i3]);
        h = aixc;
          goto _L24
_L11:
        if (f == null)
        {
            f = new iyh();
        }
        kwj1.a(f);
          goto _L24
_L12:
        i = Boolean.valueOf(kwj1.i());
          goto _L24
_L13:
        if (k == null)
        {
            k = new iyi();
        }
        kwj1.a(k);
          goto _L24
_L14:
        if (l == null)
        {
            l = new jdo();
        }
        kwj1.a(l);
          goto _L24
_L15:
        j = Boolean.valueOf(kwj1.i());
          goto _L24
_L16:
        m = Boolean.valueOf(kwj1.i());
          goto _L24
_L17:
        n = Boolean.valueOf(kwj1.i());
          goto _L24
_L18:
        int l1 = kwj1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            o = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L19:
        int j3 = kwx.a(kwj1, 138);
        jce ajce[];
        int i2;
        if (p == null)
        {
            i2 = 0;
        } else
        {
            i2 = p.length;
        }
        ajce = new jce[j3 + i2];
        j3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(p, 0, ajce, 0, i2);
            j3 = i2;
        }
        for (; j3 < ajce.length - 1; j3++)
        {
            ajce[j3] = new jce();
            kwj1.a(ajce[j3]);
            kwj1.a();
        }

        ajce[j3] = new jce();
        kwj1.a(ajce[j3]);
        p = ajce;
        continue; /* Loop/switch isn't completed */
_L20:
        int j2 = kwj1.f();
        switch (j2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            q = Integer.valueOf(j2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L21:
        if (r == null)
        {
            r = new kbl();
        }
        kwj1.a(r);
        continue; /* Loop/switch isn't completed */
_L22:
        int k3 = kwx.a(kwj1, 162);
        izk aizk[];
        int k2;
        if (s == null)
        {
            k2 = 0;
        } else
        {
            k2 = s.length;
        }
        aizk = new izk[k3 + k2];
        k3 = k2;
        if (k2 != 0)
        {
            System.arraycopy(s, 0, aizk, 0, k2);
            k3 = k2;
        }
        for (; k3 < aizk.length - 1; k3++)
        {
            aizk[k3] = new izk();
            kwj1.a(aizk[k3]);
            kwj1.a();
        }

        aizk[k3] = new izk();
        kwj1.a(aizk[k3]);
        s = aizk;
        continue; /* Loop/switch isn't completed */
_L23:
        if (t == null)
        {
            t = new jfm();
        }
        kwj1.a(t);
        if (true) goto _L24; else goto _L25
_L25:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (b != null)
        {
            kwk1.a(3, b.booleanValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                ixa ixa1 = c[i1];
                if (ixa1 != null)
                {
                    kwk1.b(4, ixa1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(5, d);
        }
        if (e != null)
        {
            kwk1.b(6, e);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = 0; j1 < h.length; j1++)
            {
                ixc ixc1 = h[j1];
                if (ixc1 != null)
                {
                    kwk1.b(8, ixc1);
                }
            }

        }
        if (f != null)
        {
            kwk1.b(9, f);
        }
        if (i != null)
        {
            kwk1.a(10, i.booleanValue());
        }
        if (k != null)
        {
            kwk1.b(11, k);
        }
        if (l != null)
        {
            kwk1.b(12, l);
        }
        if (j != null)
        {
            kwk1.a(13, j.booleanValue());
        }
        if (m != null)
        {
            kwk1.a(14, m.booleanValue());
        }
        if (n != null)
        {
            kwk1.a(15, n.booleanValue());
        }
        if (o != null)
        {
            kwk1.a(16, o.intValue());
        }
        if (p != null && p.length > 0)
        {
            for (int k1 = 0; k1 < p.length; k1++)
            {
                jce jce1 = p[k1];
                if (jce1 != null)
                {
                    kwk1.b(17, jce1);
                }
            }

        }
        if (q != null)
        {
            kwk1.a(18, q.intValue());
        }
        if (r != null)
        {
            kwk1.b(19, r);
        }
        if (s != null && s.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < s.length; l1++)
            {
                izk izk1 = s[l1];
                if (izk1 != null)
                {
                    kwk1.b(20, izk1);
                }
            }

        }
        if (t != null)
        {
            kwk1.b(22, t);
        }
        super.writeTo(kwk1);
    }
}
