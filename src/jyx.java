// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jyx extends koj
{

    public String a;
    public jzd b;
    public kaz c;
    public kaz d;
    public String e;
    public jzh f;
    public Integer g;
    public Integer h;
    public Integer i;
    public jzg j;
    public kba k[];
    public jys l;
    public kbb m[];
    public kbh n;
    public String o;
    public String p;
    public kbr q;
    public jyz r;
    public kjb s[];
    public jza t;
    public jzf u;

    public jyx()
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
        k = kba.a();
        l = null;
        m = kbb.a();
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = kjb.a();
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
            i1 = j1 + koh.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.d(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.d(3, c);
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
            j1 = i1 + koh.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.e(7, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.e(8, h.intValue());
        }
        int k1 = j1;
        if (i != null)
        {
            k1 = j1 + koh.e(9, i.intValue());
        }
        i1 = k1;
        if (j != null)
        {
            i1 = k1 + koh.d(10, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    kba kba1 = k[j1];
                    int l1 = i1;
                    if (kba1 != null)
                    {
                        l1 = i1 + koh.d(11, kba1);
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
            i1 = j1 + koh.d(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    kbb kbb1 = m[j1];
                    int i2 = i1;
                    if (kbb1 != null)
                    {
                        i2 = i1 + koh.d(13, kbb1);
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
            i1 = j1 + koh.d(14, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.b(15, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.b(16, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.d(17, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.d(18, r);
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
                    kjb kjb1 = s[j2];
                    j1 = i1;
                    if (kjb1 != null)
                    {
                        j1 = i1 + koh.d(19, kjb1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + koh.d(20, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + koh.d(21, u);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L24:
        int i1 = kog1.a();
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
        if (super.storeUnknownField(kog1, i1)) goto _L24; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L24
_L4:
        if (b == null)
        {
            b = new jzd();
        }
        kog1.a(b);
          goto _L24
_L5:
        if (c == null)
        {
            c = new kaz();
        }
        kog1.a(c);
          goto _L24
_L6:
        if (d == null)
        {
            d = new kaz();
        }
        kog1.a(d);
          goto _L24
_L7:
        e = kog1.j();
          goto _L24
_L8:
        if (f == null)
        {
            f = new jzh();
        }
        kog1.a(f);
          goto _L24
_L9:
        g = Integer.valueOf(kog1.f());
          goto _L24
_L10:
        int j1 = kog1.f();
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
        i = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L12:
        if (j == null)
        {
            j = new jzg();
        }
        kog1.a(j);
        continue; /* Loop/switch isn't completed */
_L13:
        int j2 = kou.b(kog1, 90);
        kba akba[];
        int k1;
        if (k == null)
        {
            k1 = 0;
        } else
        {
            k1 = k.length;
        }
        akba = new kba[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(k, 0, akba, 0, k1);
            j2 = k1;
        }
        for (; j2 < akba.length - 1; j2++)
        {
            akba[j2] = new kba();
            kog1.a(akba[j2]);
            kog1.a();
        }

        akba[j2] = new kba();
        kog1.a(akba[j2]);
        k = akba;
        continue; /* Loop/switch isn't completed */
_L14:
        if (l == null)
        {
            l = new jys();
        }
        kog1.a(l);
        continue; /* Loop/switch isn't completed */
_L15:
        int k2 = kou.b(kog1, 106);
        kbb akbb[];
        int l1;
        if (m == null)
        {
            l1 = 0;
        } else
        {
            l1 = m.length;
        }
        akbb = new kbb[k2 + l1];
        k2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(m, 0, akbb, 0, l1);
            k2 = l1;
        }
        for (; k2 < akbb.length - 1; k2++)
        {
            akbb[k2] = new kbb();
            kog1.a(akbb[k2]);
            kog1.a();
        }

        akbb[k2] = new kbb();
        kog1.a(akbb[k2]);
        m = akbb;
        continue; /* Loop/switch isn't completed */
_L16:
        if (n == null)
        {
            n = new kbh();
        }
        kog1.a(n);
        continue; /* Loop/switch isn't completed */
_L17:
        o = kog1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        p = kog1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        if (q == null)
        {
            q = new kbr();
        }
        kog1.a(q);
        continue; /* Loop/switch isn't completed */
_L20:
        if (r == null)
        {
            r = new jyz();
        }
        kog1.a(r);
        continue; /* Loop/switch isn't completed */
_L21:
        int l2 = kou.b(kog1, 154);
        kjb akjb[];
        int i2;
        if (s == null)
        {
            i2 = 0;
        } else
        {
            i2 = s.length;
        }
        akjb = new kjb[l2 + i2];
        l2 = i2;
        if (i2 != 0)
        {
            System.arraycopy(s, 0, akjb, 0, i2);
            l2 = i2;
        }
        for (; l2 < akjb.length - 1; l2++)
        {
            akjb[l2] = new kjb();
            kog1.a(akjb[l2]);
            kog1.a();
        }

        akjb[l2] = new kjb();
        kog1.a(akjb[l2]);
        s = akjb;
        continue; /* Loop/switch isn't completed */
_L22:
        if (t == null)
        {
            t = new jza();
        }
        kog1.a(t);
        continue; /* Loop/switch isn't completed */
_L23:
        if (u == null)
        {
            u = new jzf();
        }
        kog1.a(u);
        if (true) goto _L24; else goto _L25
_L25:
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
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
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
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.a(7, g.intValue());
        }
        if (h != null)
        {
            koh1.a(8, h.intValue());
        }
        if (i != null)
        {
            koh1.a(9, i.intValue());
        }
        if (j != null)
        {
            koh1.b(10, j);
        }
        if (k != null && k.length > 0)
        {
            for (int i1 = 0; i1 < k.length; i1++)
            {
                kba kba1 = k[i1];
                if (kba1 != null)
                {
                    koh1.b(11, kba1);
                }
            }

        }
        if (l != null)
        {
            koh1.b(12, l);
        }
        if (m != null && m.length > 0)
        {
            for (int j1 = 0; j1 < m.length; j1++)
            {
                kbb kbb1 = m[j1];
                if (kbb1 != null)
                {
                    koh1.b(13, kbb1);
                }
            }

        }
        if (n != null)
        {
            koh1.b(14, n);
        }
        if (o != null)
        {
            koh1.a(15, o);
        }
        if (p != null)
        {
            koh1.a(16, p);
        }
        if (q != null)
        {
            koh1.b(17, q);
        }
        if (r != null)
        {
            koh1.b(18, r);
        }
        if (s != null && s.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < s.length; k1++)
            {
                kjb kjb1 = s[k1];
                if (kjb1 != null)
                {
                    koh1.b(19, kjb1);
                }
            }

        }
        if (t != null)
        {
            koh1.b(20, t);
        }
        if (u != null)
        {
            koh1.b(21, u);
        }
        super.writeTo(koh1);
    }
}
