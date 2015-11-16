// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwy extends kwm
{

    public Boolean a;
    public String b[];
    public String c[];
    public String d;
    public String e[];
    public int f[];
    public long g[];
    public Integer h;
    public Integer i;
    public int j[];
    public hvi k[];
    public long l[];
    public long m[];
    public Boolean n;
    public int o[];
    public Boolean p;
    public String q[];
    public Long r;
    public hxc s;
    public hxm t;
    public hwd u;
    public Integer v;

    public hwy()
    {
        a = null;
        b = kwx.f;
        c = kwx.f;
        d = null;
        e = kwx.f;
        f = kwx.a;
        g = kwx.b;
        h = null;
        i = null;
        j = kwx.a;
        k = hvi.a();
        l = kwx.b;
        m = kwx.b;
        n = null;
        o = kwx.a;
        p = null;
        q = kwx.f;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
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
            a.booleanValue();
            i1 = j1 + (kwk.f(1) + 1);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                for (; j1 < l.length; j1++)
                {
                    k1 += kwk.b(l[j1]);
                }

                j1 = i1 + k1 + l.length * 1;
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1;
            if (m.length > 0)
            {
                i1 = 0;
                int l1 = 0;
                for (; i1 < m.length; i1++)
                {
                    l1 += kwk.b(m[i1]);
                }

                i1 = j1 + l1 + m.length * 1;
            }
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(4, d);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.e(5, h.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                j1 = 0;
                int i2 = 0;
                for (; j1 < g.length; j1++)
                {
                    i2 += kwk.b(g[j1]);
                }

                j1 = i1 + i2 + g.length * 1;
            }
        }
        i1 = j1;
        if (n != null)
        {
            n.booleanValue();
            i1 = j1 + (kwk.f(7) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1;
            if (b.length > 0)
            {
                j1 = 0;
                int j2 = 0;
                int j4;
                int j5;
                for (j4 = 0; j1 < b.length; j4 = j5)
                {
                    String s1 = b[j1];
                    int j6 = j2;
                    j5 = j4;
                    if (s1 != null)
                    {
                        j5 = j4 + 1;
                        j6 = j2 + kwk.a(s1);
                    }
                    j1++;
                    j2 = j6;
                }

                j1 = i1 + j2 + j4 * 1;
            }
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1;
            if (c.length > 0)
            {
                i1 = 0;
                int k2 = 0;
                int k4;
                int k5;
                for (k4 = 0; i1 < c.length; k4 = k5)
                {
                    String s2 = c[i1];
                    int k6 = k2;
                    k5 = k4;
                    if (s2 != null)
                    {
                        k5 = k4 + 1;
                        k6 = k2 + kwk.a(s2);
                    }
                    i1++;
                    k2 = k6;
                }

                i1 = j1 + k2 + k4 * 1;
            }
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                j1 = 0;
                int l2 = 0;
                for (; j1 < j.length; j1++)
                {
                    l2 += kwk.e(j[j1]);
                }

                j1 = i1 + l2 + j.length * 1;
            }
        }
        int i3 = j1;
        if (o != null)
        {
            i3 = j1;
            if (o.length > 0)
            {
                i1 = 0;
                i3 = 0;
                for (; i1 < o.length; i1++)
                {
                    i3 += kwk.e(o[i1]);
                }

                i3 = j1 + i3 + o.length * 1;
            }
        }
        i1 = i3;
        if (p != null)
        {
            p.booleanValue();
            i1 = i3 + (kwk.f(12) + 1);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                j1 = 0;
                int j3 = 0;
                for (; j1 < f.length; j1++)
                {
                    j3 += kwk.e(f[j1]);
                }

                j1 = i1 + j3 + f.length * 1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.e(14, i.intValue());
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                j1 = 0;
                int k3 = 0;
                int l4;
                int l5;
                for (l4 = 0; j1 < q.length; l4 = l5)
                {
                    String s3 = q[j1];
                    int l6 = k3;
                    l5 = l4;
                    if (s3 != null)
                    {
                        l5 = l4 + 1;
                        l6 = k3 + kwk.a(s3);
                    }
                    j1++;
                    k3 = l6;
                }

                j1 = i1 + k3 + l4 * 1;
            }
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + kwk.e(16, r.longValue());
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    hvi hvi1 = k[j1];
                    int l3 = i1;
                    if (hvi1 != null)
                    {
                        l3 = i1 + kwk.d(17, hvi1);
                    }
                    j1++;
                    i1 = l3;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1;
            if (e.length > 0)
            {
                int i4 = 0;
                int i5 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < e.length;)
                {
                    String s4 = e[i1];
                    int i7 = i4;
                    int i6 = i5;
                    if (s4 != null)
                    {
                        i6 = i5 + 1;
                        i7 = i4 + kwk.a(s4);
                    }
                    i1++;
                    i4 = i7;
                    i5 = i6;
                }

                i1 = j1 + i4 + i5 * 2;
            }
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + kwk.d(20, t);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + kwk.d(21, s);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + kwk.d(22, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + kwk.e(23, v.intValue());
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L31:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 29: default 252
    //                   0: 262
    //                   8: 264
    //                   16: 278
    //                   18: 386
    //                   24: 523
    //                   26: 631
    //                   34: 768
    //                   40: 779
    //                   48: 827
    //                   50: 935
    //                   56: 1072
    //                   66: 1086
    //                   74: 1195
    //                   80: 1304
    //                   82: 1496
    //                   88: 1710
    //                   90: 1900
    //                   96: 2114
    //                   104: 2128
    //                   106: 2320
    //                   112: 2534
    //                   122: 2579
    //                   128: 2688
    //                   138: 2702
    //                   154: 2834
    //                   162: 2944
    //                   170: 2973
    //                   178: 3002
    //                   184: 3031;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L31; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kwj1.i());
          goto _L31
_L4:
        int k2 = kwx.a(kwj1, 16);
        long al[];
        if (l == null)
        {
            i1 = 0;
        } else
        {
            i1 = l.length;
        }
        al = new long[k2 + i1];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(l, 0, al, 0, i1);
            k2 = i1;
        }
        for (; k2 < al.length - 1; k2++)
        {
            al[k2] = kwj1.e();
            kwj1.a();
        }

        al[k2] = kwj1.e();
        l = al;
          goto _L31
_L5:
        int k5 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        int l2;
        for (l2 = 0; kwj1.q() > 0; l2++)
        {
            kwj1.e();
        }

        kwj1.e(i1);
        long al1[];
        if (l == null)
        {
            i1 = 0;
        } else
        {
            i1 = l.length;
        }
        al1 = new long[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(l, 0, al1, 0, i1);
            l2 = i1;
        }
        for (; l2 < al1.length; l2++)
        {
            al1[l2] = kwj1.e();
        }

        l = al1;
        kwj1.d(k5);
          goto _L31
_L6:
        int i3 = kwx.a(kwj1, 24);
        long al2[];
        if (m == null)
        {
            i1 = 0;
        } else
        {
            i1 = m.length;
        }
        al2 = new long[i3 + i1];
        i3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(m, 0, al2, 0, i1);
            i3 = i1;
        }
        for (; i3 < al2.length - 1; i3++)
        {
            al2[i3] = kwj1.e();
            kwj1.a();
        }

        al2[i3] = kwj1.e();
        m = al2;
          goto _L31
_L7:
        int l5 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        int j3;
        for (j3 = 0; kwj1.q() > 0; j3++)
        {
            kwj1.e();
        }

        kwj1.e(i1);
        long al3[];
        if (m == null)
        {
            i1 = 0;
        } else
        {
            i1 = m.length;
        }
        al3 = new long[j3 + i1];
        j3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(m, 0, al3, 0, i1);
            j3 = i1;
        }
        for (; j3 < al3.length; j3++)
        {
            al3[j3] = kwj1.e();
        }

        m = al3;
        kwj1.d(l5);
          goto _L31
_L8:
        d = kwj1.j();
          goto _L31
_L9:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        int k3 = kwx.a(kwj1, 48);
        long al4[];
        if (g == null)
        {
            i1 = 0;
        } else
        {
            i1 = g.length;
        }
        al4 = new long[k3 + i1];
        k3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(g, 0, al4, 0, i1);
            k3 = i1;
        }
        for (; k3 < al4.length - 1; k3++)
        {
            al4[k3] = kwj1.e();
            kwj1.a();
        }

        al4[k3] = kwj1.e();
        g = al4;
        continue; /* Loop/switch isn't completed */
_L11:
        int i6 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        int l3;
        for (l3 = 0; kwj1.q() > 0; l3++)
        {
            kwj1.e();
        }

        kwj1.e(i1);
        long al5[];
        if (g == null)
        {
            i1 = 0;
        } else
        {
            i1 = g.length;
        }
        al5 = new long[l3 + i1];
        l3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(g, 0, al5, 0, i1);
            l3 = i1;
        }
        for (; l3 < al5.length; l3++)
        {
            al5[l3] = kwj1.e();
        }

        g = al5;
        kwj1.d(i6);
        continue; /* Loop/switch isn't completed */
_L12:
        n = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L13:
        int i4 = kwx.a(kwj1, 66);
        String as[];
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.length;
        }
        as = new String[i4 + i1];
        i4 = i1;
        if (i1 != 0)
        {
            System.arraycopy(b, 0, as, 0, i1);
            i4 = i1;
        }
        for (; i4 < as.length - 1; i4++)
        {
            as[i4] = kwj1.j();
            kwj1.a();
        }

        as[i4] = kwj1.j();
        b = as;
        continue; /* Loop/switch isn't completed */
_L14:
        int j4 = kwx.a(kwj1, 74);
        String as1[];
        if (c == null)
        {
            i1 = 0;
        } else
        {
            i1 = c.length;
        }
        as1 = new String[j4 + i1];
        j4 = i1;
        if (i1 != 0)
        {
            System.arraycopy(c, 0, as1, 0, i1);
            j4 = i1;
        }
        for (; j4 < as1.length - 1; j4++)
        {
            as1[j4] = kwj1.j();
            kwj1.a();
        }

        as1[j4] = kwj1.j();
        c = as1;
        continue; /* Loop/switch isn't completed */
_L15:
        int ai[];
        int k4;
        int l6;
        l6 = kwx.a(kwj1, 80);
        ai = new int[l6];
        k4 = 0;
        i1 = 0;
_L37:
        if (k4 >= l6) goto _L33; else goto _L32
_L32:
        int i7;
        if (k4 != 0)
        {
            kwj1.a();
        }
        i7 = kwj1.f();
        i7;
        JVM INSTR tableswitch 0 3: default 1380
    //                   0 1389
    //                   1 1380
    //                   2 1389
    //                   3 1389;
           goto _L34 _L35 _L34 _L35 _L35
_L34:
        k4++;
        continue; /* Loop/switch isn't completed */
_L35:
        int j6 = i1 + 1;
        ai[i1] = i7;
        i1 = j6;
        if (true) goto _L34; else goto _L33
_L33:
        if (i1 != 0)
        {
            if (j == null)
            {
                k4 = 0;
            } else
            {
                k4 = j.length;
            }
            if (k4 == 0 && i1 == ai.length)
            {
                j = ai;
            } else
            {
                int ai1[] = new int[k4 + i1];
                if (k4 != 0)
                {
                    System.arraycopy(j, 0, ai1, 0, k4);
                }
                System.arraycopy(ai, 0, ai1, k4, i1);
                j = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L37; else goto _L36
_L36:
_L16:
        int k6;
        k6 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        k4 = 0;
_L43:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 2: // '\002'
            case 3: // '\003'
                k4++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k4 == 0) goto _L39; else goto _L38
_L38:
        kwj1.e(i1);
        if (j == null)
        {
            i1 = 0;
        } else
        {
            i1 = j.length;
        }
        ai = new int[k4 + i1];
        k4 = i1;
        if (i1 != 0)
        {
            System.arraycopy(j, 0, ai, 0, i1);
            k4 = i1;
        }
_L41:
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 2: // '\002'
            case 3: // '\003'
                ai[k4] = i1;
                k4++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        j = ai;
_L39:
        kwj1.d(k6);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L41; else goto _L40
_L40:
        if (true) goto _L43; else goto _L42
_L42:
_L17:
        l6 = kwx.a(kwj1, 88);
        ai = new int[l6];
        k4 = 0;
        i1 = 0;
_L49:
        if (k4 >= l6) goto _L45; else goto _L44
_L44:
        if (k4 != 0)
        {
            kwj1.a();
        }
        i7 = kwj1.f();
        i7;
        JVM INSTR tableswitch 0 3: default 1784
    //                   0 1793
    //                   1 1784
    //                   2 1793
    //                   3 1793;
           goto _L46 _L47 _L46 _L47 _L47
_L46:
        k4++;
        continue; /* Loop/switch isn't completed */
_L47:
        k6 = i1 + 1;
        ai[i1] = i7;
        i1 = k6;
        if (true) goto _L46; else goto _L45
_L45:
        if (i1 != 0)
        {
            if (o == null)
            {
                k4 = 0;
            } else
            {
                k4 = o.length;
            }
            if (k4 == 0 && i1 == ai.length)
            {
                o = ai;
            } else
            {
                int ai2[] = new int[k4 + i1];
                if (k4 != 0)
                {
                    System.arraycopy(o, 0, ai2, 0, k4);
                }
                System.arraycopy(ai, 0, ai2, k4, i1);
                o = ai2;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L49; else goto _L48
_L48:
_L18:
        k6 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        k4 = 0;
_L55:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 2: // '\002'
            case 3: // '\003'
                k4++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k4 == 0) goto _L51; else goto _L50
_L50:
        kwj1.e(i1);
        if (o == null)
        {
            i1 = 0;
        } else
        {
            i1 = o.length;
        }
        ai = new int[k4 + i1];
        k4 = i1;
        if (i1 != 0)
        {
            System.arraycopy(o, 0, ai, 0, i1);
            k4 = i1;
        }
_L53:
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 2: // '\002'
            case 3: // '\003'
                ai[k4] = i1;
                k4++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        o = ai;
_L51:
        kwj1.d(k6);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L53; else goto _L52
_L52:
        if (true) goto _L55; else goto _L54
_L54:
_L19:
        p = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L20:
        l6 = kwx.a(kwj1, 104);
        ai = new int[l6];
        k4 = 0;
        i1 = 0;
_L61:
        if (k4 >= l6) goto _L57; else goto _L56
_L56:
        if (k4 != 0)
        {
            kwj1.a();
        }
        i7 = kwj1.f();
        i7;
        JVM INSTR tableswitch 0 3: default 2204
    //                   0 2213
    //                   1 2213
    //                   2 2213
    //                   3 2213;
           goto _L58 _L59 _L59 _L59 _L59
_L58:
        k4++;
        continue; /* Loop/switch isn't completed */
_L59:
        k6 = i1 + 1;
        ai[i1] = i7;
        i1 = k6;
        if (true) goto _L58; else goto _L57
_L57:
        if (i1 != 0)
        {
            if (f == null)
            {
                k4 = 0;
            } else
            {
                k4 = f.length;
            }
            if (k4 == 0 && i1 == ai.length)
            {
                f = ai;
            } else
            {
                int ai3[] = new int[k4 + i1];
                if (k4 != 0)
                {
                    System.arraycopy(f, 0, ai3, 0, k4);
                }
                System.arraycopy(ai, 0, ai3, k4, i1);
                f = ai3;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L61; else goto _L60
_L60:
_L21:
        k6 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        k4 = 0;
_L67:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                k4++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k4 == 0) goto _L63; else goto _L62
_L62:
        kwj1.e(i1);
        if (f == null)
        {
            i1 = 0;
        } else
        {
            i1 = f.length;
        }
        ai = new int[k4 + i1];
        k4 = i1;
        if (i1 != 0)
        {
            System.arraycopy(f, 0, ai, 0, i1);
            k4 = i1;
        }
_L65:
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                ai[k4] = i1;
                k4++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        f = ai;
_L63:
        kwj1.d(k6);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L65; else goto _L64
_L64:
        if (true) goto _L67; else goto _L66
_L66:
_L22:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
            i = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L23:
        int l4 = kwx.a(kwj1, 122);
        String as2[];
        int k1;
        if (q == null)
        {
            k1 = 0;
        } else
        {
            k1 = q.length;
        }
        as2 = new String[l4 + k1];
        l4 = k1;
        if (k1 != 0)
        {
            System.arraycopy(q, 0, as2, 0, k1);
            l4 = k1;
        }
        for (; l4 < as2.length - 1; l4++)
        {
            as2[l4] = kwj1.j();
            kwj1.a();
        }

        as2[l4] = kwj1.j();
        q = as2;
        continue; /* Loop/switch isn't completed */
_L24:
        r = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L25:
        int i5 = kwx.a(kwj1, 138);
        hvi ahvi[];
        int l1;
        if (k == null)
        {
            l1 = 0;
        } else
        {
            l1 = k.length;
        }
        ahvi = new hvi[i5 + l1];
        i5 = l1;
        if (l1 != 0)
        {
            System.arraycopy(k, 0, ahvi, 0, l1);
            i5 = l1;
        }
        for (; i5 < ahvi.length - 1; i5++)
        {
            ahvi[i5] = new hvi();
            kwj1.a(ahvi[i5]);
            kwj1.a();
        }

        ahvi[i5] = new hvi();
        kwj1.a(ahvi[i5]);
        k = ahvi;
        continue; /* Loop/switch isn't completed */
_L26:
        int j5 = kwx.a(kwj1, 154);
        String as3[];
        int i2;
        if (e == null)
        {
            i2 = 0;
        } else
        {
            i2 = e.length;
        }
        as3 = new String[j5 + i2];
        j5 = i2;
        if (i2 != 0)
        {
            System.arraycopy(e, 0, as3, 0, i2);
            j5 = i2;
        }
        for (; j5 < as3.length - 1; j5++)
        {
            as3[j5] = kwj1.j();
            kwj1.a();
        }

        as3[j5] = kwj1.j();
        e = as3;
        continue; /* Loop/switch isn't completed */
_L27:
        if (t == null)
        {
            t = new hxm();
        }
        kwj1.a(t);
        continue; /* Loop/switch isn't completed */
_L28:
        if (s == null)
        {
            s = new hxc();
        }
        kwj1.a(s);
        continue; /* Loop/switch isn't completed */
_L29:
        if (u == null)
        {
            u = new hwd();
        }
        kwj1.a(u);
        continue; /* Loop/switch isn't completed */
_L30:
        int j2 = kwj1.f();
        switch (j2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            v = Integer.valueOf(j2);
            break;
        }
        if (true) goto _L31; else goto _L68
_L68:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (l != null && l.length > 0)
        {
            for (int i1 = 0; i1 < l.length; i1++)
            {
                kwk1.b(2, l[i1]);
            }

        }
        if (m != null && m.length > 0)
        {
            for (int j1 = 0; j1 < m.length; j1++)
            {
                kwk1.b(3, m[j1]);
            }

        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (h != null)
        {
            kwk1.a(5, h.intValue());
        }
        if (g != null && g.length > 0)
        {
            for (int k1 = 0; k1 < g.length; k1++)
            {
                kwk1.b(6, g[k1]);
            }

        }
        if (n != null)
        {
            kwk1.a(7, n.booleanValue());
        }
        if (b != null && b.length > 0)
        {
            for (int l1 = 0; l1 < b.length; l1++)
            {
                String s1 = b[l1];
                if (s1 != null)
                {
                    kwk1.a(8, s1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int i2 = 0; i2 < c.length; i2++)
            {
                String s2 = c[i2];
                if (s2 != null)
                {
                    kwk1.a(9, s2);
                }
            }

        }
        if (j != null && j.length > 0)
        {
            for (int j2 = 0; j2 < j.length; j2++)
            {
                kwk1.a(10, j[j2]);
            }

        }
        if (o != null && o.length > 0)
        {
            for (int k2 = 0; k2 < o.length; k2++)
            {
                kwk1.a(11, o[k2]);
            }

        }
        if (p != null)
        {
            kwk1.a(12, p.booleanValue());
        }
        if (f != null && f.length > 0)
        {
            for (int l2 = 0; l2 < f.length; l2++)
            {
                kwk1.a(13, f[l2]);
            }

        }
        if (i != null)
        {
            kwk1.a(14, i.intValue());
        }
        if (q != null && q.length > 0)
        {
            for (int i3 = 0; i3 < q.length; i3++)
            {
                String s3 = q[i3];
                if (s3 != null)
                {
                    kwk1.a(15, s3);
                }
            }

        }
        if (r != null)
        {
            kwk1.b(16, r.longValue());
        }
        if (k != null && k.length > 0)
        {
            for (int j3 = 0; j3 < k.length; j3++)
            {
                hvi hvi1 = k[j3];
                if (hvi1 != null)
                {
                    kwk1.b(17, hvi1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k3 = ((flag) ? 1 : 0); k3 < e.length; k3++)
            {
                String s4 = e[k3];
                if (s4 != null)
                {
                    kwk1.a(19, s4);
                }
            }

        }
        if (t != null)
        {
            kwk1.b(20, t);
        }
        if (s != null)
        {
            kwk1.b(21, s);
        }
        if (u != null)
        {
            kwk1.b(22, u);
        }
        if (v != null)
        {
            kwk1.a(23, v.intValue());
        }
        super.writeTo(kwk1);
    }
}
