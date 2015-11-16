// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igp extends kwm
{

    public String a;
    public int b;
    public String c;
    public ign d;
    public String e;
    public String f;
    public Double g;
    public igq h;
    public String i;
    public String j;
    public String k;
    public igm l[];
    public Boolean m;
    public Boolean n;
    public String o;
    public String p;
    public String q;
    public Integer r;
    public Integer s;
    public igo t[];
    public Boolean u;
    public String v;
    public Boolean w;

    public igp()
    {
        a = null;
        b = 0x80000000;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = igm.a();
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = igo.a();
        u = null;
        v = null;
        w = null;
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
        if (b != 0x80000000)
        {
            j1 = i1 + kwk.e(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(3, c);
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
            j1 = i1 + kwk.b(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            g.doubleValue();
            i1 = j1 + (kwk.f(7) + 8);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.d(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(10, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(11, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(12, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                for (j1 = 0; j1 < l.length;)
                {
                    igm igm1 = l[j1];
                    int k1 = i1;
                    if (igm1 != null)
                    {
                        k1 = i1 + kwk.d(13, igm1);
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
            m.booleanValue();
            i1 = j1 + (kwk.f(14) + 1);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.b(15, o);
        }
        int l1 = j1;
        if (p != null)
        {
            l1 = j1 + kwk.b(16, p);
        }
        i1 = l1;
        if (r != null)
        {
            i1 = l1 + kwk.e(17, r.intValue());
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1;
            if (t.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= t.length)
                    {
                        break;
                    }
                    igo igo1 = t[i2];
                    j1 = i1;
                    if (igo1 != null)
                    {
                        j1 = i1 + kwk.d(18, igo1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (u != null)
        {
            u.booleanValue();
            i1 = j1 + (kwk.f(19) + 1);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + kwk.e(20, s.intValue());
        }
        i1 = j1;
        if (n != null)
        {
            n.booleanValue();
            i1 = j1 + (kwk.f(21) + 1);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + kwk.b(22, q);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + kwk.b(23, v);
        }
        j1 = i1;
        if (w != null)
        {
            w.booleanValue();
            j1 = i1 + (kwk.f(24) + 1);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L26:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 24: default 208
    //                   0: 217
    //                   10: 219
    //                   16: 230
    //                   26: 299
    //                   34: 310
    //                   42: 339
    //                   50: 350
    //                   57: 361
    //                   66: 375
    //                   82: 404
    //                   90: 415
    //                   98: 426
    //                   106: 437
    //                   112: 561
    //                   122: 575
    //                   130: 586
    //                   136: 597
    //                   146: 611
    //                   152: 736
    //                   160: 750
    //                   168: 764
    //                   178: 778
    //                   186: 789
    //                   192: 800;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L26; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L26
_L4:
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
            b = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new ign();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        g = Double.valueOf(kwj1.b());
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new igq();
        }
        kwj1.a(h);
        continue; /* Loop/switch isn't completed */
_L11:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L13:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L14:
        int i2 = kwx.a(kwj1, 106);
        igm aigm[];
        int k1;
        if (l == null)
        {
            k1 = 0;
        } else
        {
            k1 = l.length;
        }
        aigm = new igm[i2 + k1];
        i2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(l, 0, aigm, 0, k1);
            i2 = k1;
        }
        for (; i2 < aigm.length - 1; i2++)
        {
            aigm[i2] = new igm();
            kwj1.a(aigm[i2]);
            kwj1.a();
        }

        aigm[i2] = new igm();
        kwj1.a(aigm[i2]);
        l = aigm;
        continue; /* Loop/switch isn't completed */
_L15:
        m = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L16:
        o = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        p = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        r = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L19:
        int j2 = kwx.a(kwj1, 146);
        igo aigo[];
        int l1;
        if (t == null)
        {
            l1 = 0;
        } else
        {
            l1 = t.length;
        }
        aigo = new igo[j2 + l1];
        j2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(t, 0, aigo, 0, l1);
            j2 = l1;
        }
        for (; j2 < aigo.length - 1; j2++)
        {
            aigo[j2] = new igo();
            kwj1.a(aigo[j2]);
            kwj1.a();
        }

        aigo[j2] = new igo();
        kwj1.a(aigo[j2]);
        t = aigo;
        continue; /* Loop/switch isn't completed */
_L20:
        u = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L21:
        s = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L22:
        n = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L23:
        q = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L24:
        v = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L25:
        w = Boolean.valueOf(kwj1.i());
        if (true) goto _L26; else goto _L27
_L27:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != 0x80000000)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
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
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g.doubleValue());
        }
        if (h != null)
        {
            kwk1.b(8, h);
        }
        if (i != null)
        {
            kwk1.a(10, i);
        }
        if (j != null)
        {
            kwk1.a(11, j);
        }
        if (k != null)
        {
            kwk1.a(12, k);
        }
        if (l != null && l.length > 0)
        {
            for (int i1 = 0; i1 < l.length; i1++)
            {
                igm igm1 = l[i1];
                if (igm1 != null)
                {
                    kwk1.b(13, igm1);
                }
            }

        }
        if (m != null)
        {
            kwk1.a(14, m.booleanValue());
        }
        if (o != null)
        {
            kwk1.a(15, o);
        }
        if (p != null)
        {
            kwk1.a(16, p);
        }
        if (r != null)
        {
            kwk1.a(17, r.intValue());
        }
        if (t != null && t.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
            {
                igo igo1 = t[j1];
                if (igo1 != null)
                {
                    kwk1.b(18, igo1);
                }
            }

        }
        if (u != null)
        {
            kwk1.a(19, u.booleanValue());
        }
        if (s != null)
        {
            kwk1.a(20, s.intValue());
        }
        if (n != null)
        {
            kwk1.a(21, n.booleanValue());
        }
        if (q != null)
        {
            kwk1.a(22, q);
        }
        if (v != null)
        {
            kwk1.a(23, v);
        }
        if (w != null)
        {
            kwk1.a(24, w.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
