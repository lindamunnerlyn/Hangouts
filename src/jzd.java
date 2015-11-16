// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jzd extends kwm
{

    public Integer a;
    public Integer b;
    public int c[];
    public Integer d;
    public jzf e;
    public jzf f;
    public jzf g;
    public String h[];
    public Boolean i;
    public Long j;
    public Integer k;
    public Integer l;
    public Integer m;
    public long n[];
    public String o;
    public jzg p[];
    public Boolean q;
    public int r[];
    public Integer s;
    public jze t;
    public String u;
    public Integer v;
    public Integer w;
    public Integer x;
    public Integer y;
    public jzh z[];

    public jzd()
    {
        a = null;
        b = null;
        c = kwx.a;
        d = null;
        e = null;
        f = null;
        g = null;
        h = kwx.f;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = kwx.b;
        o = null;
        p = jzg.a();
        q = null;
        r = kwx.a;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = jzh.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int j1 = i1;
        if (a != null)
        {
            a.intValue();
            j1 = i1 + (kwk.f(1) + 4);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.e(2, b.intValue());
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                j1 = 0;
                int l1 = 0;
                for (; j1 < c.length; j1++)
                {
                    l1 += kwk.e(c[j1]);
                }

                j1 = i1 + l1 + c.length * 1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.e(4, d.intValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.d(5, e);
        }
        int i2 = j1;
        if (f != null)
        {
            i2 = j1 + kwk.d(6, f);
        }
        i1 = i2;
        if (g != null)
        {
            i1 = i2 + kwk.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                j1 = 0;
                i2 = 0;
                int j2;
                int k2;
                for (j2 = 0; j1 < h.length; j2 = k2)
                {
                    String s1 = h[j1];
                    int l2 = i2;
                    k2 = j2;
                    if (s1 != null)
                    {
                        k2 = j2 + 1;
                        l2 = i2 + kwk.a(s1);
                    }
                    j1++;
                    i2 = l2;
                }

                j1 = i1 + i2 + j2 * 1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (kwk.f(9) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.e(10, j.longValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.e(11, k.intValue());
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.e(12, l.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.e(13, m.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1;
            if (n.length > 0)
            {
                j1 = 0;
                i2 = 0;
                for (; j1 < n.length; j1++)
                {
                    i2 += kwk.b(n[j1]);
                }

                j1 = i1 + i2 + n.length * 1;
            }
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.b(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                for (j1 = 0; j1 < p.length;)
                {
                    jzg jzg1 = p[j1];
                    i2 = i1;
                    if (jzg1 != null)
                    {
                        i2 = i1 + kwk.d(16, jzg1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (q != null)
        {
            q.booleanValue();
            i1 = j1 + (kwk.f(17) + 1);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1;
            if (r.length > 0)
            {
                j1 = 0;
                i2 = 0;
                for (; j1 < r.length; j1++)
                {
                    i2 += kwk.e(r[j1]);
                }

                j1 = i1 + i2 + r.length * 2;
            }
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + kwk.e(19, s.intValue());
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + kwk.d(20, t);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + kwk.b(21, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.e(22, v.intValue());
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.e(23, w.intValue());
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + kwk.e(24, x.intValue());
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + kwk.e(25, y.intValue());
        }
        i2 = i1;
        if (z != null)
        {
            i2 = i1;
            if (z.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    i2 = i1;
                    if (k1 >= z.length)
                    {
                        break;
                    }
                    jzh jzh1 = z[k1];
                    i2 = i1;
                    if (jzh1 != null)
                    {
                        i2 = i1 + kwk.d(26, jzh1);
                    }
                    k1++;
                    i1 = i2;
                } while (true);
            }
        }
        return i2;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L32:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 30: default 256
    //                   0: 265
    //                   13: 267
    //                   16: 281
    //                   24: 295
    //                   26: 396
    //                   32: 524
    //                   42: 538
    //                   50: 567
    //                   58: 596
    //                   66: 625
    //                   72: 727
    //                   80: 741
    //                   88: 755
    //                   96: 769
    //                   104: 783
    //                   112: 826
    //                   114: 927
    //                   122: 1055
    //                   130: 1066
    //                   136: 1191
    //                   144: 1205
    //                   146: 1307
    //                   152: 1435
    //                   162: 1449
    //                   170: 1478
    //                   176: 1489
    //                   184: 1503
    //                   192: 1517
    //                   200: 1531
    //                   210: 1545;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L32; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(kwj1.h());
          goto _L32
_L4:
        b = Integer.valueOf(kwj1.f());
          goto _L32
_L5:
        int l3 = kwx.a(kwj1, 24);
        int ai[];
        int j1;
        if (c == null)
        {
            j1 = 0;
        } else
        {
            j1 = c.length;
        }
        ai = new int[l3 + j1];
        l3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(c, 0, ai, 0, j1);
            l3 = j1;
        }
        for (; l3 < ai.length - 1; l3++)
        {
            ai[l3] = kwj1.f();
            kwj1.a();
        }

        ai[l3] = kwj1.f();
        c = ai;
          goto _L32
_L6:
        int i6 = kwj1.c(kwj1.p());
        int k1 = kwj1.r();
        int i4;
        for (i4 = 0; kwj1.q() > 0; i4++)
        {
            kwj1.f();
        }

        kwj1.e(k1);
        int ai1[];
        if (c == null)
        {
            k1 = 0;
        } else
        {
            k1 = c.length;
        }
        ai1 = new int[i4 + k1];
        i4 = k1;
        if (k1 != 0)
        {
            System.arraycopy(c, 0, ai1, 0, k1);
            i4 = k1;
        }
        for (; i4 < ai1.length; i4++)
        {
            ai1[i4] = kwj1.f();
        }

        c = ai1;
        kwj1.d(i6);
          goto _L32
_L7:
        d = Integer.valueOf(kwj1.f());
          goto _L32
_L8:
        if (e == null)
        {
            e = new jzf();
        }
        kwj1.a(e);
          goto _L32
_L9:
        if (f == null)
        {
            f = new jzf();
        }
        kwj1.a(f);
          goto _L32
_L10:
        if (g == null)
        {
            g = new jzf();
        }
        kwj1.a(g);
          goto _L32
_L11:
        int j4 = kwx.a(kwj1, 66);
        String as[];
        int l1;
        if (h == null)
        {
            l1 = 0;
        } else
        {
            l1 = h.length;
        }
        as = new String[j4 + l1];
        j4 = l1;
        if (l1 != 0)
        {
            System.arraycopy(h, 0, as, 0, l1);
            j4 = l1;
        }
        for (; j4 < as.length - 1; j4++)
        {
            as[j4] = kwj1.j();
            kwj1.a();
        }

        as[j4] = kwj1.j();
        h = as;
          goto _L32
_L12:
        i = Boolean.valueOf(kwj1.i());
          goto _L32
_L13:
        j = Long.valueOf(kwj1.e());
          goto _L32
_L14:
        k = Integer.valueOf(kwj1.f());
          goto _L32
_L15:
        l = Integer.valueOf(kwj1.f());
          goto _L32
_L16:
        int i2 = kwj1.f();
        switch (i2)
        {
        case 1: // '\001'
        case 2: // '\002'
            m = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        int k4 = kwx.a(kwj1, 112);
        long al[];
        int j2;
        if (n == null)
        {
            j2 = 0;
        } else
        {
            j2 = n.length;
        }
        al = new long[k4 + j2];
        k4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(n, 0, al, 0, j2);
            k4 = j2;
        }
        for (; k4 < al.length - 1; k4++)
        {
            al[k4] = kwj1.e();
            kwj1.a();
        }

        al[k4] = kwj1.e();
        n = al;
        continue; /* Loop/switch isn't completed */
_L18:
        int j6 = kwj1.c(kwj1.p());
        int k2 = kwj1.r();
        int l4;
        for (l4 = 0; kwj1.q() > 0; l4++)
        {
            kwj1.e();
        }

        kwj1.e(k2);
        long al1[];
        if (n == null)
        {
            k2 = 0;
        } else
        {
            k2 = n.length;
        }
        al1 = new long[l4 + k2];
        l4 = k2;
        if (k2 != 0)
        {
            System.arraycopy(n, 0, al1, 0, k2);
            l4 = k2;
        }
        for (; l4 < al1.length; l4++)
        {
            al1[l4] = kwj1.e();
        }

        n = al1;
        kwj1.d(j6);
        continue; /* Loop/switch isn't completed */
_L19:
        o = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L20:
        int i5 = kwx.a(kwj1, 130);
        jzg ajzg[];
        int l2;
        if (p == null)
        {
            l2 = 0;
        } else
        {
            l2 = p.length;
        }
        ajzg = new jzg[i5 + l2];
        i5 = l2;
        if (l2 != 0)
        {
            System.arraycopy(p, 0, ajzg, 0, l2);
            i5 = l2;
        }
        for (; i5 < ajzg.length - 1; i5++)
        {
            ajzg[i5] = new jzg();
            kwj1.a(ajzg[i5]);
            kwj1.a();
        }

        ajzg[i5] = new jzg();
        kwj1.a(ajzg[i5]);
        p = ajzg;
        continue; /* Loop/switch isn't completed */
_L21:
        q = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L22:
        int j5 = kwx.a(kwj1, 144);
        int ai2[];
        int i3;
        if (r == null)
        {
            i3 = 0;
        } else
        {
            i3 = r.length;
        }
        ai2 = new int[j5 + i3];
        j5 = i3;
        if (i3 != 0)
        {
            System.arraycopy(r, 0, ai2, 0, i3);
            j5 = i3;
        }
        for (; j5 < ai2.length - 1; j5++)
        {
            ai2[j5] = kwj1.f();
            kwj1.a();
        }

        ai2[j5] = kwj1.f();
        r = ai2;
        continue; /* Loop/switch isn't completed */
_L23:
        int k6 = kwj1.c(kwj1.p());
        int j3 = kwj1.r();
        int k5;
        for (k5 = 0; kwj1.q() > 0; k5++)
        {
            kwj1.f();
        }

        kwj1.e(j3);
        int ai3[];
        if (r == null)
        {
            j3 = 0;
        } else
        {
            j3 = r.length;
        }
        ai3 = new int[k5 + j3];
        k5 = j3;
        if (j3 != 0)
        {
            System.arraycopy(r, 0, ai3, 0, j3);
            k5 = j3;
        }
        for (; k5 < ai3.length; k5++)
        {
            ai3[k5] = kwj1.f();
        }

        r = ai3;
        kwj1.d(k6);
        continue; /* Loop/switch isn't completed */
_L24:
        s = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L25:
        if (t == null)
        {
            t = new jze();
        }
        kwj1.a(t);
        continue; /* Loop/switch isn't completed */
_L26:
        u = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L27:
        v = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L28:
        w = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L29:
        x = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L30:
        y = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L31:
        int l5 = kwx.a(kwj1, 210);
        jzh ajzh[];
        int k3;
        if (z == null)
        {
            k3 = 0;
        } else
        {
            k3 = z.length;
        }
        ajzh = new jzh[l5 + k3];
        l5 = k3;
        if (k3 != 0)
        {
            System.arraycopy(z, 0, ajzh, 0, k3);
            l5 = k3;
        }
        for (; l5 < ajzh.length - 1; l5++)
        {
            ajzh[l5] = new jzh();
            kwj1.a(ajzh[l5]);
            kwj1.a();
        }

        ajzh[l5] = new jzh();
        kwj1.a(ajzh[l5]);
        z = ajzh;
        if (true) goto _L32; else goto _L33
_L33:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                kwk1.a(3, c[i1]);
            }

        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = 0; j1 < h.length; j1++)
            {
                String s1 = h[j1];
                if (s1 != null)
                {
                    kwk1.a(8, s1);
                }
            }

        }
        if (i != null)
        {
            kwk1.a(9, i.booleanValue());
        }
        if (j != null)
        {
            kwk1.b(10, j.longValue());
        }
        if (k != null)
        {
            kwk1.a(11, k.intValue());
        }
        if (l != null)
        {
            kwk1.a(12, l.intValue());
        }
        if (m != null)
        {
            kwk1.a(13, m.intValue());
        }
        if (n != null && n.length > 0)
        {
            for (int k1 = 0; k1 < n.length; k1++)
            {
                kwk1.b(14, n[k1]);
            }

        }
        if (o != null)
        {
            kwk1.a(15, o);
        }
        if (p != null && p.length > 0)
        {
            for (int l1 = 0; l1 < p.length; l1++)
            {
                jzg jzg1 = p[l1];
                if (jzg1 != null)
                {
                    kwk1.b(16, jzg1);
                }
            }

        }
        if (q != null)
        {
            kwk1.a(17, q.booleanValue());
        }
        if (r != null && r.length > 0)
        {
            for (int i2 = 0; i2 < r.length; i2++)
            {
                kwk1.a(18, r[i2]);
            }

        }
        if (s != null)
        {
            kwk1.a(19, s.intValue());
        }
        if (t != null)
        {
            kwk1.b(20, t);
        }
        if (u != null)
        {
            kwk1.a(21, u);
        }
        if (v != null)
        {
            kwk1.a(22, v.intValue());
        }
        if (w != null)
        {
            kwk1.a(23, w.intValue());
        }
        if (x != null)
        {
            kwk1.a(24, x.intValue());
        }
        if (y != null)
        {
            kwk1.a(25, y.intValue());
        }
        if (z != null && z.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < z.length; j2++)
            {
                jzh jzh1 = z[j2];
                if (jzh1 != null)
                {
                    kwk1.b(26, jzh1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
