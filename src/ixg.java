// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixg extends kwm
{

    public ixl a;
    public izm b;
    public Integer c;
    public String d;
    public String e;
    public ixh f;
    public jga g[];
    public Boolean h;
    public Integer i;
    public Integer j;
    public jce k[];
    public ixn l[];
    public Boolean m;
    public Boolean n;
    public int o[];
    public Integer p;
    public byte q[][];
    public byte r[][];
    public Boolean s;

    public ixg()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = jga.a();
        h = null;
        i = null;
        j = null;
        k = jce.a();
        l = ixn.a();
        m = null;
        n = null;
        o = kwx.a;
        p = null;
        q = kwx.g;
        r = kwx.g;
        s = null;
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
            i1 = j1 + kwk.d(1, a);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.e(2, c.intValue());
        }
        int k1 = j1;
        if (d != null)
        {
            k1 = j1 + kwk.b(3, d);
        }
        i1 = k1;
        if (f != null)
        {
            i1 = k1 + kwk.d(4, f);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                j1 = 0;
                k1 = 0;
                int i2;
                int k2;
                for (i2 = 0; j1 < q.length; i2 = k2)
                {
                    byte abyte0[] = q[j1];
                    int i3 = k1;
                    k2 = i2;
                    if (abyte0 != null)
                    {
                        k2 = i2 + 1;
                        i3 = k1 + kwk.a(abyte0);
                    }
                    j1++;
                    k1 = i3;
                }

                j1 = i1 + k1 + i2 * 1;
            }
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1;
            if (r.length > 0)
            {
                i1 = 0;
                k1 = 0;
                int j2;
                int l2;
                for (j2 = 0; i1 < r.length; j2 = l2)
                {
                    byte abyte1[] = r[i1];
                    int j3 = k1;
                    l2 = j2;
                    if (abyte1 != null)
                    {
                        l2 = j2 + 1;
                        j3 = k1 + kwk.a(abyte1);
                    }
                    i1++;
                    k1 = j3;
                }

                i1 = j1 + k1 + j2 * 1;
            }
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                for (j1 = 0; j1 < g.length;)
                {
                    jga jga1 = g[j1];
                    k1 = i1;
                    if (jga1 != null)
                    {
                        k1 = i1 + kwk.d(8, jga1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (h != null)
        {
            h.booleanValue();
            i1 = j1 + (kwk.f(9) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.e(10, i.intValue());
        }
        k1 = j1;
        if (j != null)
        {
            k1 = j1 + kwk.e(11, j.intValue());
        }
        i1 = k1;
        if (s != null)
        {
            s.booleanValue();
            i1 = k1 + (kwk.f(12) + 1);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    jce jce1 = k[j1];
                    k1 = i1;
                    if (jce1 != null)
                    {
                        k1 = i1 + kwk.d(13, jce1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1;
            if (l.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < l.length;)
                {
                    ixn ixn1 = l[j1];
                    k1 = i1;
                    if (ixn1 != null)
                    {
                        k1 = i1 + kwk.d(14, ixn1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (m != null)
        {
            m.booleanValue();
            j1 = i1 + (kwk.f(15) + 1);
        }
        k1 = j1;
        if (n != null)
        {
            n.booleanValue();
            k1 = j1 + (kwk.f(16) + 1);
        }
        i1 = k1;
        if (b != null)
        {
            i1 = k1 + kwk.d(17, b);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1;
            if (o.length > 0)
            {
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < o.length; j1++)
                {
                    l1 += kwk.e(o[j1]);
                }

                j1 = i1 + l1 + o.length * 2;
            }
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.e(19, p.intValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.b(20, e);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L23:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 21: default 188
    //                   0: 198
    //                   10: 200
    //                   16: 229
    //                   26: 279
    //                   34: 290
    //                   42: 319
    //                   50: 428
    //                   66: 537
    //                   72: 668
    //                   80: 682
    //                   88: 727
    //                   96: 771
    //                   106: 785
    //                   114: 916
    //                   120: 1047
    //                   128: 1061
    //                   138: 1075
    //                   144: 1104
    //                   146: 1292
    //                   152: 1498
    //                   162: 1551;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L23; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new ixl();
        }
        kwj1.a(a);
          goto _L23
_L4:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        if (f == null)
        {
            f = new ixh();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L7:
        int k1 = kwx.a(kwj1, 42);
        byte abyte0[][];
        if (q == null)
        {
            i1 = 0;
        } else
        {
            i1 = q.length;
        }
        abyte0 = new byte[k1 + i1][];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(q, 0, abyte0, 0, i1);
            k1 = i1;
        }
        for (; k1 < abyte0.length - 1; k1++)
        {
            abyte0[k1] = kwj1.k();
            kwj1.a();
        }

        abyte0[k1] = kwj1.k();
        q = abyte0;
        continue; /* Loop/switch isn't completed */
_L8:
        int l1 = kwx.a(kwj1, 50);
        byte abyte1[][];
        if (r == null)
        {
            i1 = 0;
        } else
        {
            i1 = r.length;
        }
        abyte1 = new byte[l1 + i1][];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(r, 0, abyte1, 0, i1);
            l1 = i1;
        }
        for (; l1 < abyte1.length - 1; l1++)
        {
            abyte1[l1] = kwj1.k();
            kwj1.a();
        }

        abyte1[l1] = kwj1.k();
        r = abyte1;
        continue; /* Loop/switch isn't completed */
_L9:
        int i2 = kwx.a(kwj1, 66);
        jga ajga[];
        if (g == null)
        {
            i1 = 0;
        } else
        {
            i1 = g.length;
        }
        ajga = new jga[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(g, 0, ajga, 0, i1);
            i2 = i1;
        }
        for (; i2 < ajga.length - 1; i2++)
        {
            ajga[i2] = new jga();
            kwj1.a(ajga[i2]);
            kwj1.a();
        }

        ajga[i2] = new jga();
        kwj1.a(ajga[i2]);
        g = ajga;
        continue; /* Loop/switch isn't completed */
_L10:
        h = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L11:
        i1 = kwj1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
            i = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        i1 = kwj1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
            j = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        s = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L14:
        int j2 = kwx.a(kwj1, 106);
        jce ajce[];
        if (k == null)
        {
            i1 = 0;
        } else
        {
            i1 = k.length;
        }
        ajce = new jce[j2 + i1];
        j2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(k, 0, ajce, 0, i1);
            j2 = i1;
        }
        for (; j2 < ajce.length - 1; j2++)
        {
            ajce[j2] = new jce();
            kwj1.a(ajce[j2]);
            kwj1.a();
        }

        ajce[j2] = new jce();
        kwj1.a(ajce[j2]);
        k = ajce;
        continue; /* Loop/switch isn't completed */
_L15:
        int k2 = kwx.a(kwj1, 114);
        ixn aixn[];
        if (l == null)
        {
            i1 = 0;
        } else
        {
            i1 = l.length;
        }
        aixn = new ixn[k2 + i1];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(l, 0, aixn, 0, i1);
            k2 = i1;
        }
        for (; k2 < aixn.length - 1; k2++)
        {
            aixn[k2] = new ixn();
            kwj1.a(aixn[k2]);
            kwj1.a();
        }

        aixn[k2] = new ixn();
        kwj1.a(aixn[k2]);
        l = aixn;
        continue; /* Loop/switch isn't completed */
_L16:
        m = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        n = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L18:
        if (b == null)
        {
            b = new izm();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L19:
        int ai[];
        int l2;
        int k3;
        k3 = kwx.a(kwj1, 144);
        ai = new int[k3];
        l2 = 0;
        i1 = 0;
_L29:
        if (l2 >= k3) goto _L25; else goto _L24
_L24:
        int l3;
        if (l2 != 0)
        {
            kwj1.a();
        }
        l3 = kwj1.f();
        l3;
        JVM INSTR tableswitch 0 2: default 1176
    //                   0 1185
    //                   1 1185
    //                   2 1185;
           goto _L26 _L27 _L27 _L27
_L26:
        l2++;
        continue; /* Loop/switch isn't completed */
_L27:
        int i3 = i1 + 1;
        ai[i1] = l3;
        i1 = i3;
        if (true) goto _L26; else goto _L25
_L25:
        if (i1 != 0)
        {
            if (o == null)
            {
                l2 = 0;
            } else
            {
                l2 = o.length;
            }
            if (l2 == 0 && i1 == ai.length)
            {
                o = ai;
            } else
            {
                int ai1[] = new int[l2 + i1];
                if (l2 != 0)
                {
                    System.arraycopy(o, 0, ai1, 0, l2);
                }
                System.arraycopy(ai, 0, ai1, l2, i1);
                o = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L29; else goto _L28
_L28:
_L20:
        int j3;
        j3 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        l2 = 0;
_L35:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                l2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l2 == 0) goto _L31; else goto _L30
_L30:
        kwj1.e(i1);
        if (o == null)
        {
            i1 = 0;
        } else
        {
            i1 = o.length;
        }
        ai = new int[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(o, 0, ai, 0, i1);
            l2 = i1;
        }
_L33:
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                ai[l2] = i1;
                l2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        o = ai;
_L31:
        kwj1.d(j3);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L33; else goto _L32
_L32:
        if (true) goto _L35; else goto _L34
_L34:
_L21:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            p = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L22:
        e = kwj1.j();
        if (true) goto _L23; else goto _L36
_L36:
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
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (f != null)
        {
            kwk1.b(4, f);
        }
        if (q != null && q.length > 0)
        {
            for (int i1 = 0; i1 < q.length; i1++)
            {
                byte abyte0[] = q[i1];
                if (abyte0 != null)
                {
                    kwk1.a(5, abyte0);
                }
            }

        }
        if (r != null && r.length > 0)
        {
            for (int j1 = 0; j1 < r.length; j1++)
            {
                byte abyte1[] = r[j1];
                if (abyte1 != null)
                {
                    kwk1.a(6, abyte1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int k1 = 0; k1 < g.length; k1++)
            {
                jga jga1 = g[k1];
                if (jga1 != null)
                {
                    kwk1.b(8, jga1);
                }
            }

        }
        if (h != null)
        {
            kwk1.a(9, h.booleanValue());
        }
        if (i != null)
        {
            kwk1.a(10, i.intValue());
        }
        if (j != null)
        {
            kwk1.a(11, j.intValue());
        }
        if (s != null)
        {
            kwk1.a(12, s.booleanValue());
        }
        if (k != null && k.length > 0)
        {
            for (int l1 = 0; l1 < k.length; l1++)
            {
                jce jce1 = k[l1];
                if (jce1 != null)
                {
                    kwk1.b(13, jce1);
                }
            }

        }
        if (l != null && l.length > 0)
        {
            for (int i2 = 0; i2 < l.length; i2++)
            {
                ixn ixn1 = l[i2];
                if (ixn1 != null)
                {
                    kwk1.b(14, ixn1);
                }
            }

        }
        if (m != null)
        {
            kwk1.a(15, m.booleanValue());
        }
        if (n != null)
        {
            kwk1.a(16, n.booleanValue());
        }
        if (b != null)
        {
            kwk1.b(17, b);
        }
        if (o != null && o.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < o.length; j2++)
            {
                kwk1.a(18, o[j2]);
            }

        }
        if (p != null)
        {
            kwk1.a(19, p.intValue());
        }
        if (e != null)
        {
            kwk1.a(20, e);
        }
        super.writeTo(kwk1);
    }
}
