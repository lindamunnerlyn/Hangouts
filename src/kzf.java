// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzf extends kwm
{

    public static final kwn a = kwn.a(kzf, 0xd44fb3aL);
    private static final kzf z[] = new kzf[0];
    public com.google.apps.gcomm.hangout.proto.Hangouts.HangoutStartContext b;
    public String c;
    public String d;
    public kxx e[];
    public Integer f;
    public Boolean g;
    public Integer h;
    public String i;
    public String j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public String n;
    public String o;
    public kzg p[];
    public String q;
    public Integer r;
    public kxc s[];
    public Integer t;
    public kxc u;
    public String v[];
    public int w[];
    public kxc x[];
    public Long y;

    public kzf()
    {
        b = null;
        c = null;
        d = null;
        e = kxx.a();
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = kzg.a();
        q = null;
        r = null;
        s = kxc.a();
        t = null;
        u = null;
        v = kwx.f;
        w = kwx.a;
        x = kxc.a();
        y = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.d(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(2, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    kxx kxx1 = e[j1];
                    int k1 = i1;
                    if (kxx1 != null)
                    {
                        k1 = i1 + kwk.d(4, kxx1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.e(5, f.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            g.booleanValue();
            j1 = i1 + (kwk.f(6) + 1);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.e(7, h.intValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.b(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.b(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            k.booleanValue();
            j1 = i1 + (kwk.f(10) + 1);
        }
        i1 = j1;
        if (l != null)
        {
            l.booleanValue();
            i1 = j1 + (kwk.f(11) + 1);
        }
        j1 = i1;
        if (m != null)
        {
            m.booleanValue();
            j1 = i1 + (kwk.f(12) + 1);
        }
        int l1 = j1;
        if (n != null)
        {
            l1 = j1 + kwk.b(13, n);
        }
        i1 = l1;
        if (o != null)
        {
            i1 = l1 + kwk.b(14, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                for (j1 = 0; j1 < p.length;)
                {
                    kzg kzg1 = p[j1];
                    l1 = i1;
                    if (kzg1 != null)
                    {
                        l1 = i1 + kwk.d(15, kzg1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        l1 = j1;
        if (q != null)
        {
            l1 = j1 + kwk.b(16, q);
        }
        i1 = l1;
        if (r != null)
        {
            i1 = l1 + kwk.e(17, r.intValue());
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1;
            if (s.length > 0)
            {
                for (j1 = 0; j1 < s.length;)
                {
                    kxc kxc1 = s[j1];
                    l1 = i1;
                    if (kxc1 != null)
                    {
                        l1 = i1 + kwk.d(18, kxc1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        l1 = j1;
        if (t != null)
        {
            l1 = j1 + kwk.e(19, t.intValue());
        }
        i1 = l1;
        if (u != null)
        {
            i1 = l1 + kwk.d(20, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1;
            if (v.length > 0)
            {
                j1 = 0;
                int i2 = 0;
                int l2;
                int i3;
                for (l2 = 0; j1 < v.length; l2 = i3)
                {
                    String s1 = v[j1];
                    int j3 = i2;
                    i3 = l2;
                    if (s1 != null)
                    {
                        i3 = l2 + 1;
                        j3 = i2 + kwk.a(s1);
                    }
                    j1++;
                    i2 = j3;
                }

                j1 = i1 + i2 + l2 * 2;
            }
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1;
            if (w.length > 0)
            {
                i1 = 0;
                int j2 = 0;
                for (; i1 < w.length; i1++)
                {
                    j2 += kwk.e(w[i1]);
                }

                i1 = j1 + j2 + w.length * 2;
            }
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1;
            if (x.length > 0)
            {
                int k2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (k2 >= x.length)
                    {
                        break;
                    }
                    kxc kxc2 = x[k2];
                    j1 = i1;
                    if (kxc2 != null)
                    {
                        j1 = i1 + kwk.d(23, kxc2);
                    }
                    k2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + kwk.e(24, y.longValue());
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L28:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 26: default 228
    //                   0: 238
    //                   10: 240
    //                   18: 269
    //                   26: 280
    //                   34: 291
    //                   40: 422
    //                   48: 467
    //                   56: 481
    //                   66: 495
    //                   74: 506
    //                   80: 517
    //                   88: 531
    //                   96: 545
    //                   106: 559
    //                   114: 570
    //                   122: 581
    //                   130: 712
    //                   136: 723
    //                   146: 737
    //                   152: 869
    //                   162: 883
    //                   170: 912
    //                   176: 1022
    //                   178: 1204
    //                   186: 1402
    //                   192: 1534;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L28; else goto _L2
_L2:
        return this;
_L3:
        if (b == null)
        {
            b = new com.google.apps.gcomm.hangout.proto.Hangouts.HangoutStartContext();
        }
        kwj1.a(b);
          goto _L28
_L4:
        c = kwj1.j();
          goto _L28
_L5:
        d = kwj1.j();
          goto _L28
_L6:
        int k1 = kwx.a(kwj1, 34);
        kxx akxx[];
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        akxx = new kxx[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, akxx, 0, i1);
            k1 = i1;
        }
        for (; k1 < akxx.length - 1; k1++)
        {
            akxx[k1] = new kxx();
            kwj1.a(akxx[k1]);
            kwj1.a();
        }

        akxx[k1] = new kxx();
        kwj1.a(akxx[k1]);
        e = akxx;
          goto _L28
_L7:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
            f = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        g = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L9:
        h = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L10:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        k = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L13:
        l = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L14:
        m = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        n = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L16:
        o = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        int l1 = kwx.a(kwj1, 122);
        kzg akzg[];
        if (p == null)
        {
            i1 = 0;
        } else
        {
            i1 = p.length;
        }
        akzg = new kzg[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(p, 0, akzg, 0, i1);
            l1 = i1;
        }
        for (; l1 < akzg.length - 1; l1++)
        {
            akzg[l1] = new kzg();
            kwj1.a(akzg[l1]);
            kwj1.a();
        }

        akzg[l1] = new kzg();
        kwj1.a(akzg[l1]);
        p = akzg;
        continue; /* Loop/switch isn't completed */
_L18:
        q = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        r = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L20:
        int i2 = kwx.a(kwj1, 146);
        kxc akxc[];
        if (s == null)
        {
            i1 = 0;
        } else
        {
            i1 = s.length;
        }
        akxc = new kxc[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(s, 0, akxc, 0, i1);
            i2 = i1;
        }
        for (; i2 < akxc.length - 1; i2++)
        {
            akxc[i2] = new kxc();
            kwj1.a(akxc[i2]);
            kwj1.a();
        }

        akxc[i2] = new kxc();
        kwj1.a(akxc[i2]);
        s = akxc;
        continue; /* Loop/switch isn't completed */
_L21:
        t = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L22:
        if (u == null)
        {
            u = new kxc();
        }
        kwj1.a(u);
        continue; /* Loop/switch isn't completed */
_L23:
        int j2 = kwx.a(kwj1, 170);
        String as[];
        if (v == null)
        {
            i1 = 0;
        } else
        {
            i1 = v.length;
        }
        as = new String[j2 + i1];
        j2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(v, 0, as, 0, i1);
            j2 = i1;
        }
        for (; j2 < as.length - 1; j2++)
        {
            as[j2] = kwj1.j();
            kwj1.a();
        }

        as[j2] = kwj1.j();
        v = as;
        continue; /* Loop/switch isn't completed */
_L24:
        int ai[];
        int k2;
        int k3;
        k3 = kwx.a(kwj1, 176);
        ai = new int[k3];
        k2 = 0;
        i1 = 0;
_L34:
        if (k2 >= k3) goto _L30; else goto _L29
_L29:
        int l3;
        if (k2 != 0)
        {
            kwj1.a();
        }
        l3 = kwj1.f();
        l3;
        JVM INSTR tableswitch 0 1: default 1088
    //                   0 1097
    //                   1 1097;
           goto _L31 _L32 _L32
_L31:
        k2++;
        continue; /* Loop/switch isn't completed */
_L32:
        int i3 = i1 + 1;
        ai[i1] = l3;
        i1 = i3;
        if (true) goto _L31; else goto _L30
_L30:
        if (i1 != 0)
        {
            if (w == null)
            {
                k2 = 0;
            } else
            {
                k2 = w.length;
            }
            if (k2 == 0 && i1 == ai.length)
            {
                w = ai;
            } else
            {
                int ai1[] = new int[k2 + i1];
                if (k2 != 0)
                {
                    System.arraycopy(w, 0, ai1, 0, k2);
                }
                System.arraycopy(ai, 0, ai1, k2, i1);
                w = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L34; else goto _L33
_L33:
_L25:
        int j3;
        j3 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        k2 = 0;
_L40:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
                k2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k2 == 0) goto _L36; else goto _L35
_L35:
        kwj1.e(i1);
        if (w == null)
        {
            i1 = 0;
        } else
        {
            i1 = w.length;
        }
        ai = new int[k2 + i1];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(w, 0, ai, 0, i1);
            k2 = i1;
        }
_L38:
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
                ai[k2] = i1;
                k2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        w = ai;
_L36:
        kwj1.d(j3);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L38; else goto _L37
_L37:
        if (true) goto _L40; else goto _L39
_L39:
_L26:
        int l2 = kwx.a(kwj1, 186);
        kxc akxc1[];
        int j1;
        if (x == null)
        {
            j1 = 0;
        } else
        {
            j1 = x.length;
        }
        akxc1 = new kxc[l2 + j1];
        l2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(x, 0, akxc1, 0, j1);
            l2 = j1;
        }
        for (; l2 < akxc1.length - 1; l2++)
        {
            akxc1[l2] = new kxc();
            kwj1.a(akxc1[l2]);
            kwj1.a();
        }

        akxc1[l2] = new kxc();
        kwj1.a(akxc1[l2]);
        x = akxc1;
        continue; /* Loop/switch isn't completed */
_L27:
        y = Long.valueOf(kwj1.e());
        if (true) goto _L28; else goto _L41
_L41:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (b != null)
        {
            kwk1.b(1, b);
        }
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i1 = 0; i1 < e.length; i1++)
            {
                kxx kxx1 = e[i1];
                if (kxx1 != null)
                {
                    kwk1.b(4, kxx1);
                }
            }

        }
        if (f != null)
        {
            kwk1.a(5, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(6, g.booleanValue());
        }
        if (h != null)
        {
            kwk1.a(7, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(8, i);
        }
        if (j != null)
        {
            kwk1.a(9, j);
        }
        if (k != null)
        {
            kwk1.a(10, k.booleanValue());
        }
        if (l != null)
        {
            kwk1.a(11, l.booleanValue());
        }
        if (m != null)
        {
            kwk1.a(12, m.booleanValue());
        }
        if (n != null)
        {
            kwk1.a(13, n);
        }
        if (o != null)
        {
            kwk1.a(14, o);
        }
        if (p != null && p.length > 0)
        {
            for (int j1 = 0; j1 < p.length; j1++)
            {
                kzg kzg1 = p[j1];
                if (kzg1 != null)
                {
                    kwk1.b(15, kzg1);
                }
            }

        }
        if (q != null)
        {
            kwk1.a(16, q);
        }
        if (r != null)
        {
            kwk1.a(17, r.intValue());
        }
        if (s != null && s.length > 0)
        {
            for (int k1 = 0; k1 < s.length; k1++)
            {
                kxc kxc1 = s[k1];
                if (kxc1 != null)
                {
                    kwk1.b(18, kxc1);
                }
            }

        }
        if (t != null)
        {
            kwk1.a(19, t.intValue());
        }
        if (u != null)
        {
            kwk1.b(20, u);
        }
        if (v != null && v.length > 0)
        {
            for (int l1 = 0; l1 < v.length; l1++)
            {
                String s1 = v[l1];
                if (s1 != null)
                {
                    kwk1.a(21, s1);
                }
            }

        }
        if (w != null && w.length > 0)
        {
            for (int i2 = 0; i2 < w.length; i2++)
            {
                kwk1.a(22, w[i2]);
            }

        }
        if (x != null && x.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < x.length; j2++)
            {
                kxc kxc2 = x[j2];
                if (kxc2 != null)
                {
                    kwk1.b(23, kxc2);
                }
            }

        }
        if (y != null)
        {
            kwk1.b(24, y.longValue());
        }
        super.writeTo(kwk1);
    }

}
