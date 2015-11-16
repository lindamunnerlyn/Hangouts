// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdh extends koj
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public ins f;
    public iob g;
    public iod h;
    public iog i;
    public iom j;
    public ioa k;
    public ioi l;
    public ioh m;
    public String n[];
    public Boolean o;
    public Integer p;
    public String q;
    public String r;
    public Boolean s;
    public Long t;
    public Long u;

    public jdh()
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
        l = null;
        m = null;
        n = kou.f;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
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
            j1 = i1 + koh.b(2, b);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(3, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.d(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.d(5, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.d(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.d(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.d(8, j);
        }
        int k1 = j1;
        if (p != null)
        {
            k1 = j1 + koh.e(9, p.intValue());
        }
        i1 = k1;
        if (k != null)
        {
            i1 = k1 + koh.d(10, k);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1;
            if (n.length > 0)
            {
                int l1 = 0;
                int i2 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < n.length;)
                {
                    String s1 = n[j1];
                    int k2 = l1;
                    int j2 = i2;
                    if (s1 != null)
                    {
                        j2 = i2 + 1;
                        k2 = l1 + koh.a(s1);
                    }
                    j1++;
                    l1 = k2;
                    i2 = j2;
                }

                j1 = i1 + l1 + i2 * 1;
            }
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (koh.f(12) + 1);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.b(13, q);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(14, c);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.d(15, m);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.b(16, r);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(17, l);
        }
        i1 = j1;
        if (s != null)
        {
            s.booleanValue();
            i1 = j1 + (koh.f(18) + 1);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + koh.e(19, t.longValue());
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + koh.e(20, u.longValue());
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.b(21, d);
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
    //                   26: 225
    //                   34: 236
    //                   42: 265
    //                   50: 294
    //                   58: 323
    //                   66: 352
    //                   72: 381
    //                   82: 466
    //                   90: 495
    //                   96: 597
    //                   106: 611
    //                   114: 622
    //                   122: 633
    //                   130: 662
    //                   138: 673
    //                   144: 702
    //                   152: 716
    //                   160: 730
    //                   170: 744;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L24; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L24
_L4:
        b = kog1.j();
          goto _L24
_L5:
        e = kog1.j();
          goto _L24
_L6:
        if (f == null)
        {
            f = new ins();
        }
        kog1.a(f);
          goto _L24
_L7:
        if (g == null)
        {
            g = new iob();
        }
        kog1.a(g);
          goto _L24
_L8:
        if (h == null)
        {
            h = new iod();
        }
        kog1.a(h);
          goto _L24
_L9:
        if (i == null)
        {
            i = new iog();
        }
        kog1.a(i);
          goto _L24
_L10:
        if (j == null)
        {
            j = new iom();
        }
        kog1.a(j);
          goto _L24
_L11:
        int j1 = kog1.f();
        switch (j1)
        {
        case 37: // '%'
        case 42: // '*'
        case 43: // '+'
        case 55: // '7'
        case 58: // ':'
        case 59: // ';'
        case 60: // '<'
            p = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (k == null)
        {
            k = new ioa();
        }
        kog1.a(k);
        continue; /* Loop/switch isn't completed */
_L13:
        int l1 = kou.b(kog1, 90);
        String as[];
        int k1;
        if (n == null)
        {
            k1 = 0;
        } else
        {
            k1 = n.length;
        }
        as = new String[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(n, 0, as, 0, k1);
            l1 = k1;
        }
        for (; l1 < as.length - 1; l1++)
        {
            as[l1] = kog1.j();
            kog1.a();
        }

        as[l1] = kog1.j();
        n = as;
        continue; /* Loop/switch isn't completed */
_L14:
        o = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        q = kog1.j();
        continue; /* Loop/switch isn't completed */
_L16:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        if (m == null)
        {
            m = new ioh();
        }
        kog1.a(m);
        continue; /* Loop/switch isn't completed */
_L18:
        r = kog1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        if (l == null)
        {
            l = new ioi();
        }
        kog1.a(l);
        continue; /* Loop/switch isn't completed */
_L20:
        s = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L21:
        t = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L22:
        u = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L23:
        d = kog1.j();
        if (true) goto _L24; else goto _L25
_L25:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (e != null)
        {
            koh1.a(3, e);
        }
        if (f != null)
        {
            koh1.b(4, f);
        }
        if (g != null)
        {
            koh1.b(5, g);
        }
        if (h != null)
        {
            koh1.b(6, h);
        }
        if (i != null)
        {
            koh1.b(7, i);
        }
        if (j != null)
        {
            koh1.b(8, j);
        }
        if (p != null)
        {
            koh1.a(9, p.intValue());
        }
        if (k != null)
        {
            koh1.b(10, k);
        }
        if (n != null && n.length > 0)
        {
            for (int i1 = 0; i1 < n.length; i1++)
            {
                String s1 = n[i1];
                if (s1 != null)
                {
                    koh1.a(11, s1);
                }
            }

        }
        if (o != null)
        {
            koh1.a(12, o.booleanValue());
        }
        if (q != null)
        {
            koh1.a(13, q);
        }
        if (c != null)
        {
            koh1.a(14, c);
        }
        if (m != null)
        {
            koh1.b(15, m);
        }
        if (r != null)
        {
            koh1.a(16, r);
        }
        if (l != null)
        {
            koh1.b(17, l);
        }
        if (s != null)
        {
            koh1.a(18, s.booleanValue());
        }
        if (t != null)
        {
            koh1.b(19, t.longValue());
        }
        if (u != null)
        {
            koh1.b(20, u.longValue());
        }
        if (d != null)
        {
            koh1.a(21, d);
        }
        super.writeTo(koh1);
    }
}
