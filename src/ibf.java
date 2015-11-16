// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibf extends koj
{

    public String a;
    public Integer b;
    public String c;
    public ibd d;
    public String e;
    public String f;
    public Double g;
    public ibg h;
    public String i;
    public String j;
    public String k;
    public ibc l[];
    public Boolean m;
    public Boolean n;
    public String o;
    public String p;
    public String q;
    public Integer r;
    public Integer s;
    public ibe t[];
    public Boolean u;
    public String v;
    public Boolean w;

    public ibf()
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
        l = ibc.a();
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = ibe.a();
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
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.e(2, b.intValue());
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.d(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.b(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            g.doubleValue();
            i1 = j1 + (koh.f(7) + 8);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.d(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(10, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.b(11, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.b(12, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                for (j1 = 0; j1 < l.length;)
                {
                    ibc ibc1 = l[j1];
                    int k1 = i1;
                    if (ibc1 != null)
                    {
                        k1 = i1 + koh.d(13, ibc1);
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
            i1 = j1 + (koh.f(14) + 1);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.b(15, o);
        }
        int l1 = j1;
        if (p != null)
        {
            l1 = j1 + koh.b(16, p);
        }
        i1 = l1;
        if (r != null)
        {
            i1 = l1 + koh.e(17, r.intValue());
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
                    ibe ibe1 = t[i2];
                    j1 = i1;
                    if (ibe1 != null)
                    {
                        j1 = i1 + koh.d(18, ibe1);
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
            i1 = j1 + (koh.f(19) + 1);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + koh.e(20, s.intValue());
        }
        i1 = j1;
        if (n != null)
        {
            n.booleanValue();
            i1 = j1 + (koh.f(21) + 1);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.b(22, q);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + koh.b(23, v);
        }
        j1 = i1;
        if (w != null)
        {
            w.booleanValue();
            j1 = i1 + (koh.f(24) + 1);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L26:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 24: default 208
    //                   0: 217
    //                   10: 219
    //                   16: 230
    //                   26: 302
    //                   34: 313
    //                   42: 342
    //                   50: 353
    //                   57: 364
    //                   66: 378
    //                   82: 407
    //                   90: 418
    //                   98: 429
    //                   106: 440
    //                   112: 564
    //                   122: 578
    //                   130: 589
    //                   136: 600
    //                   146: 614
    //                   152: 739
    //                   160: 753
    //                   168: 767
    //                   178: 781
    //                   186: 792
    //                   192: 803;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L26; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L26
_L4:
        int j1 = kog1.f();
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
            b = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new ibd();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        e = kog1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        f = kog1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        g = Double.valueOf(kog1.b());
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new ibg();
        }
        kog1.a(h);
        continue; /* Loop/switch isn't completed */
_L11:
        i = kog1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        j = kog1.j();
        continue; /* Loop/switch isn't completed */
_L13:
        k = kog1.j();
        continue; /* Loop/switch isn't completed */
_L14:
        int i2 = kou.b(kog1, 106);
        ibc aibc[];
        int k1;
        if (l == null)
        {
            k1 = 0;
        } else
        {
            k1 = l.length;
        }
        aibc = new ibc[i2 + k1];
        i2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(l, 0, aibc, 0, k1);
            i2 = k1;
        }
        for (; i2 < aibc.length - 1; i2++)
        {
            aibc[i2] = new ibc();
            kog1.a(aibc[i2]);
            kog1.a();
        }

        aibc[i2] = new ibc();
        kog1.a(aibc[i2]);
        l = aibc;
        continue; /* Loop/switch isn't completed */
_L15:
        m = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L16:
        o = kog1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        p = kog1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        r = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L19:
        int j2 = kou.b(kog1, 146);
        ibe aibe[];
        int l1;
        if (t == null)
        {
            l1 = 0;
        } else
        {
            l1 = t.length;
        }
        aibe = new ibe[j2 + l1];
        j2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(t, 0, aibe, 0, l1);
            j2 = l1;
        }
        for (; j2 < aibe.length - 1; j2++)
        {
            aibe[j2] = new ibe();
            kog1.a(aibe[j2]);
            kog1.a();
        }

        aibe[j2] = new ibe();
        kog1.a(aibe[j2]);
        t = aibe;
        continue; /* Loop/switch isn't completed */
_L20:
        u = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L21:
        s = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L22:
        n = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L23:
        q = kog1.j();
        continue; /* Loop/switch isn't completed */
_L24:
        v = kog1.j();
        continue; /* Loop/switch isn't completed */
_L25:
        w = Boolean.valueOf(kog1.i());
        if (true) goto _L26; else goto _L27
_L27:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.a(7, g.doubleValue());
        }
        if (h != null)
        {
            koh1.b(8, h);
        }
        if (i != null)
        {
            koh1.a(10, i);
        }
        if (j != null)
        {
            koh1.a(11, j);
        }
        if (k != null)
        {
            koh1.a(12, k);
        }
        if (l != null && l.length > 0)
        {
            for (int i1 = 0; i1 < l.length; i1++)
            {
                ibc ibc1 = l[i1];
                if (ibc1 != null)
                {
                    koh1.b(13, ibc1);
                }
            }

        }
        if (m != null)
        {
            koh1.a(14, m.booleanValue());
        }
        if (o != null)
        {
            koh1.a(15, o);
        }
        if (p != null)
        {
            koh1.a(16, p);
        }
        if (r != null)
        {
            koh1.a(17, r.intValue());
        }
        if (t != null && t.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
            {
                ibe ibe1 = t[j1];
                if (ibe1 != null)
                {
                    koh1.b(18, ibe1);
                }
            }

        }
        if (u != null)
        {
            koh1.a(19, u.booleanValue());
        }
        if (s != null)
        {
            koh1.a(20, s.intValue());
        }
        if (n != null)
        {
            koh1.a(21, n.booleanValue());
        }
        if (q != null)
        {
            koh1.a(22, q);
        }
        if (v != null)
        {
            koh1.a(23, v);
        }
        if (w != null)
        {
            koh1.a(24, w.booleanValue());
        }
        super.writeTo(koh1);
    }
}
