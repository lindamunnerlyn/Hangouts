// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iua extends koj
{

    public iss a;
    public Boolean b;
    public iqv c[];
    public isk d;
    public isb e;
    public isc f;
    public iwb g;
    public iqx h[];
    public Boolean i;
    public Boolean j;
    public isd k;
    public ixj l;
    public Boolean m;
    public Boolean n;
    public Integer o;
    public ivz p[];
    public Integer q;
    public jti r;
    public ixg responseHeader;
    public itf s[];
    public izh t;

    public iua()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = iqv.a();
        d = null;
        e = null;
        f = null;
        g = null;
        h = iqx.a();
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = ivz.a();
        q = null;
        r = null;
        s = itf.a();
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
            i1 = j1 + koh.d(1, responseHeader);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + koh.d(2, a);
        }
        i1 = j1;
        if (b != null)
        {
            b.booleanValue();
            i1 = j1 + (koh.f(3) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                for (j1 = 0; j1 < c.length;)
                {
                    iqv iqv1 = c[j1];
                    int k1 = i1;
                    if (iqv1 != null)
                    {
                        k1 = i1 + koh.d(4, iqv1);
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
            i1 = j1 + koh.d(5, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.d(6, e);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                for (j1 = 0; j1 < h.length;)
                {
                    iqx iqx1 = h[j1];
                    int l1 = i1;
                    if (iqx1 != null)
                    {
                        l1 = i1 + koh.d(8, iqx1);
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
            i1 = j1 + koh.d(9, f);
        }
        j1 = i1;
        if (i != null)
        {
            i.booleanValue();
            j1 = i1 + (koh.f(10) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(12, l);
        }
        i1 = j1;
        if (j != null)
        {
            j.booleanValue();
            i1 = j1 + (koh.f(13) + 1);
        }
        j1 = i1;
        if (m != null)
        {
            m.booleanValue();
            j1 = i1 + (koh.f(14) + 1);
        }
        int i2 = j1;
        if (n != null)
        {
            n.booleanValue();
            i2 = j1 + (koh.f(15) + 1);
        }
        i1 = i2;
        if (o != null)
        {
            i1 = i2 + koh.e(16, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                for (j1 = 0; j1 < p.length;)
                {
                    ivz ivz1 = p[j1];
                    i2 = i1;
                    if (ivz1 != null)
                    {
                        i2 = i1 + koh.d(17, ivz1);
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
            i2 = j1 + koh.e(18, q.intValue());
        }
        i1 = i2;
        if (r != null)
        {
            i1 = i2 + koh.d(19, r);
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
                    itf itf1 = s[j2];
                    j1 = i1;
                    if (itf1 != null)
                    {
                        j1 = i1 + koh.d(20, itf1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + koh.d(22, t);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L24:
        int i1 = kog1.a();
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
        if (super.storeUnknownField(kog1, i1)) goto _L24; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new ixg();
        }
        kog1.a(responseHeader);
          goto _L24
_L4:
        if (a == null)
        {
            a = new iss();
        }
        kog1.a(a);
          goto _L24
_L5:
        b = Boolean.valueOf(kog1.i());
          goto _L24
_L6:
        int l2 = kou.b(kog1, 34);
        iqv aiqv[];
        int j1;
        if (c == null)
        {
            j1 = 0;
        } else
        {
            j1 = c.length;
        }
        aiqv = new iqv[l2 + j1];
        l2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(c, 0, aiqv, 0, j1);
            l2 = j1;
        }
        for (; l2 < aiqv.length - 1; l2++)
        {
            aiqv[l2] = new iqv();
            kog1.a(aiqv[l2]);
            kog1.a();
        }

        aiqv[l2] = new iqv();
        kog1.a(aiqv[l2]);
        c = aiqv;
          goto _L24
_L7:
        if (d == null)
        {
            d = new isk();
        }
        kog1.a(d);
          goto _L24
_L8:
        if (e == null)
        {
            e = new isb();
        }
        kog1.a(e);
          goto _L24
_L9:
        if (g == null)
        {
            g = new iwb();
        }
        kog1.a(g);
          goto _L24
_L10:
        int i3 = kou.b(kog1, 66);
        iqx aiqx[];
        int k1;
        if (h == null)
        {
            k1 = 0;
        } else
        {
            k1 = h.length;
        }
        aiqx = new iqx[i3 + k1];
        i3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(h, 0, aiqx, 0, k1);
            i3 = k1;
        }
        for (; i3 < aiqx.length - 1; i3++)
        {
            aiqx[i3] = new iqx();
            kog1.a(aiqx[i3]);
            kog1.a();
        }

        aiqx[i3] = new iqx();
        kog1.a(aiqx[i3]);
        h = aiqx;
          goto _L24
_L11:
        if (f == null)
        {
            f = new isc();
        }
        kog1.a(f);
          goto _L24
_L12:
        i = Boolean.valueOf(kog1.i());
          goto _L24
_L13:
        if (k == null)
        {
            k = new isd();
        }
        kog1.a(k);
          goto _L24
_L14:
        if (l == null)
        {
            l = new ixj();
        }
        kog1.a(l);
          goto _L24
_L15:
        j = Boolean.valueOf(kog1.i());
          goto _L24
_L16:
        m = Boolean.valueOf(kog1.i());
          goto _L24
_L17:
        n = Boolean.valueOf(kog1.i());
          goto _L24
_L18:
        int l1 = kog1.f();
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
        int j3 = kou.b(kog1, 138);
        ivz aivz[];
        int i2;
        if (p == null)
        {
            i2 = 0;
        } else
        {
            i2 = p.length;
        }
        aivz = new ivz[j3 + i2];
        j3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(p, 0, aivz, 0, i2);
            j3 = i2;
        }
        for (; j3 < aivz.length - 1; j3++)
        {
            aivz[j3] = new ivz();
            kog1.a(aivz[j3]);
            kog1.a();
        }

        aivz[j3] = new ivz();
        kog1.a(aivz[j3]);
        p = aivz;
        continue; /* Loop/switch isn't completed */
_L20:
        int j2 = kog1.f();
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
            r = new jti();
        }
        kog1.a(r);
        continue; /* Loop/switch isn't completed */
_L22:
        int k3 = kou.b(kog1, 162);
        itf aitf[];
        int k2;
        if (s == null)
        {
            k2 = 0;
        } else
        {
            k2 = s.length;
        }
        aitf = new itf[k3 + k2];
        k3 = k2;
        if (k2 != 0)
        {
            System.arraycopy(s, 0, aitf, 0, k2);
            k3 = k2;
        }
        for (; k3 < aitf.length - 1; k3++)
        {
            aitf[k3] = new itf();
            kog1.a(aitf[k3]);
            kog1.a();
        }

        aitf[k3] = new itf();
        kog1.a(aitf[k3]);
        s = aitf;
        continue; /* Loop/switch isn't completed */
_L23:
        if (t == null)
        {
            t = new izh();
        }
        kog1.a(t);
        if (true) goto _L24; else goto _L25
_L25:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (b != null)
        {
            koh1.a(3, b.booleanValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                iqv iqv1 = c[i1];
                if (iqv1 != null)
                {
                    koh1.b(4, iqv1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(5, d);
        }
        if (e != null)
        {
            koh1.b(6, e);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = 0; j1 < h.length; j1++)
            {
                iqx iqx1 = h[j1];
                if (iqx1 != null)
                {
                    koh1.b(8, iqx1);
                }
            }

        }
        if (f != null)
        {
            koh1.b(9, f);
        }
        if (i != null)
        {
            koh1.a(10, i.booleanValue());
        }
        if (k != null)
        {
            koh1.b(11, k);
        }
        if (l != null)
        {
            koh1.b(12, l);
        }
        if (j != null)
        {
            koh1.a(13, j.booleanValue());
        }
        if (m != null)
        {
            koh1.a(14, m.booleanValue());
        }
        if (n != null)
        {
            koh1.a(15, n.booleanValue());
        }
        if (o != null)
        {
            koh1.a(16, o.intValue());
        }
        if (p != null && p.length > 0)
        {
            for (int k1 = 0; k1 < p.length; k1++)
            {
                ivz ivz1 = p[k1];
                if (ivz1 != null)
                {
                    koh1.b(17, ivz1);
                }
            }

        }
        if (q != null)
        {
            koh1.a(18, q.intValue());
        }
        if (r != null)
        {
            koh1.b(19, r);
        }
        if (s != null && s.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < s.length; l1++)
            {
                itf itf1 = s[l1];
                if (itf1 != null)
                {
                    koh1.b(20, itf1);
                }
            }

        }
        if (t != null)
        {
            koh1.b(22, t);
        }
        super.writeTo(koh1);
    }
}
