// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ins extends koj
{

    public String a;
    public String b;
    public Integer c;
    public Integer d;
    public Long e;
    public Long f;
    public String g;
    public String h;
    public inu i[];
    public Boolean j;
    public Integer k;
    public Integer l;
    public String m;
    public Integer n;
    public String o;
    public Integer p;
    public int q;
    public Long r;
    public inz s[];

    public ins()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = inu.a();
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = inz.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + koh.b(1, a) + koh.b(2, b) + koh.e(3, c.intValue());
        int i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.b(4, g);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    inu inu1 = i[j1];
                    int k1 = i1;
                    if (inu1 != null)
                    {
                        k1 = i1 + koh.c(5, inu1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            j.booleanValue();
            i1 = j1 + (koh.f(28) + 1);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.e(29, k.intValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.e(30, l.intValue());
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + koh.e(42, r.longValue());
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.b(43, h);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1;
            if (s.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= s.length)
                    {
                        break;
                    }
                    inz inz1 = s[l1];
                    j1 = i1;
                    if (inz1 != null)
                    {
                        j1 = i1 + koh.d(52, inz1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.e(68, p.intValue());
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.d(69, q);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.b(100, o);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.e(104, f.longValue());
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.e(105, d.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.e(106, n.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.e(107, e.longValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.b(112, m);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L22:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 20: default 176
    //                   0: 185
    //                   10: 187
    //                   18: 198
    //                   24: 209
    //                   34: 223
    //                   43: 234
    //                   224: 360
    //                   232: 374
    //                   240: 388
    //                   336: 402
    //                   346: 416
    //                   418: 427
    //                   544: 552
    //                   554: 566
    //                   802: 595
    //                   832: 606
    //                   840: 620
    //                   848: 674
    //                   856: 688
    //                   898: 702;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L22; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L22
_L4:
        b = kog1.j();
          goto _L22
_L5:
        c = Integer.valueOf(kog1.f());
          goto _L22
_L6:
        g = kog1.j();
          goto _L22
_L7:
        int i2 = kou.b(kog1, 43);
        inu ainu[];
        int j1;
        if (i == null)
        {
            j1 = 0;
        } else
        {
            j1 = i.length;
        }
        ainu = new inu[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(i, 0, ainu, 0, j1);
            i2 = j1;
        }
        for (; i2 < ainu.length - 1; i2++)
        {
            ainu[i2] = new inu();
            kog1.a(ainu[i2], 5);
            kog1.a();
        }

        ainu[i2] = new inu();
        kog1.a(ainu[i2], 5);
        i = ainu;
          goto _L22
_L8:
        j = Boolean.valueOf(kog1.i());
          goto _L22
_L9:
        k = Integer.valueOf(kog1.f());
          goto _L22
_L10:
        l = Integer.valueOf(kog1.f());
          goto _L22
_L11:
        r = Long.valueOf(kog1.e());
          goto _L22
_L12:
        h = kog1.j();
          goto _L22
_L13:
        int j2 = kou.b(kog1, 418);
        inz ainz[];
        int k1;
        if (s == null)
        {
            k1 = 0;
        } else
        {
            k1 = s.length;
        }
        ainz = new inz[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(s, 0, ainz, 0, k1);
            j2 = k1;
        }
        for (; j2 < ainz.length - 1; j2++)
        {
            ainz[j2] = new inz();
            kog1.a(ainz[j2]);
            kog1.a();
        }

        ainz[j2] = new inz();
        kog1.a(ainz[j2]);
        s = ainz;
          goto _L22
_L14:
        p = Integer.valueOf(kog1.f());
          goto _L22
_L15:
        if (q == null)
        {
            q = new int();
        }
        kog1.a(q);
          goto _L22
_L16:
        o = kog1.j();
          goto _L22
_L17:
        f = Long.valueOf(kog1.e());
          goto _L22
_L18:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            d = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L19:
        n = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L20:
        e = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L21:
        m = kog1.j();
        if (true) goto _L22; else goto _L23
_L23:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        koh1.a(1, a);
        koh1.a(2, b);
        koh1.a(3, c.intValue());
        if (g != null)
        {
            koh1.a(4, g);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                inu inu1 = i[i1];
                if (inu1 != null)
                {
                    koh1.a(5, inu1);
                }
            }

        }
        if (j != null)
        {
            koh1.a(28, j.booleanValue());
        }
        if (k != null)
        {
            koh1.a(29, k.intValue());
        }
        if (l != null)
        {
            koh1.a(30, l.intValue());
        }
        if (r != null)
        {
            koh1.b(42, r.longValue());
        }
        if (h != null)
        {
            koh1.a(43, h);
        }
        if (s != null && s.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < s.length; j1++)
            {
                inz inz1 = s[j1];
                if (inz1 != null)
                {
                    koh1.b(52, inz1);
                }
            }

        }
        if (p != null)
        {
            koh1.a(68, p.intValue());
        }
        if (q != null)
        {
            koh1.b(69, q);
        }
        if (o != null)
        {
            koh1.a(100, o);
        }
        if (f != null)
        {
            koh1.b(104, f.longValue());
        }
        if (d != null)
        {
            koh1.a(105, d.intValue());
        }
        if (n != null)
        {
            koh1.a(106, n.intValue());
        }
        if (e != null)
        {
            koh1.b(107, e.longValue());
        }
        if (m != null)
        {
            koh1.a(112, m);
        }
        super.writeTo(koh1);
    }
}
