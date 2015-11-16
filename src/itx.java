// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itx extends kwm
{

    public String a;
    public String b;
    public Integer c;
    public Integer d;
    public Long e;
    public Long f;
    public String g;
    public String h;
    public itz i[];
    public Boolean j;
    public Integer k;
    public Integer l;
    public String m;
    public Integer n;
    public String o;
    public Integer p;
    public ity q;
    public Long r;
    public iue s[];

    public itx()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = itz.a();
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = iue.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + kwk.b(1, a) + kwk.b(2, b) + kwk.e(3, c.intValue());
        int i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(4, g);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    itz itz1 = i[j1];
                    int k1 = i1;
                    if (itz1 != null)
                    {
                        k1 = i1 + kwk.c(5, itz1);
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
            i1 = j1 + (kwk.f(28) + 1);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.e(29, k.intValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.e(30, l.intValue());
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + kwk.e(42, r.longValue());
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(43, h);
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
                    iue iue1 = s[l1];
                    j1 = i1;
                    if (iue1 != null)
                    {
                        j1 = i1 + kwk.d(52, iue1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.e(68, p.intValue());
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + kwk.d(69, q);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + kwk.b(100, o);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.e(104, f.longValue());
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.e(105, d.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + kwk.e(106, n.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.e(107, e.longValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.b(112, m);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L22:
        int i1 = kwj1.a();
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
        if (super.storeUnknownField(kwj1, i1)) goto _L22; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L22
_L4:
        b = kwj1.j();
          goto _L22
_L5:
        c = Integer.valueOf(kwj1.f());
          goto _L22
_L6:
        g = kwj1.j();
          goto _L22
_L7:
        int i2 = kwx.a(kwj1, 43);
        itz aitz[];
        int j1;
        if (i == null)
        {
            j1 = 0;
        } else
        {
            j1 = i.length;
        }
        aitz = new itz[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(i, 0, aitz, 0, j1);
            i2 = j1;
        }
        for (; i2 < aitz.length - 1; i2++)
        {
            aitz[i2] = new itz();
            kwj1.a(aitz[i2], 5);
            kwj1.a();
        }

        aitz[i2] = new itz();
        kwj1.a(aitz[i2], 5);
        i = aitz;
          goto _L22
_L8:
        j = Boolean.valueOf(kwj1.i());
          goto _L22
_L9:
        k = Integer.valueOf(kwj1.f());
          goto _L22
_L10:
        l = Integer.valueOf(kwj1.f());
          goto _L22
_L11:
        r = Long.valueOf(kwj1.e());
          goto _L22
_L12:
        h = kwj1.j();
          goto _L22
_L13:
        int j2 = kwx.a(kwj1, 418);
        iue aiue[];
        int k1;
        if (s == null)
        {
            k1 = 0;
        } else
        {
            k1 = s.length;
        }
        aiue = new iue[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(s, 0, aiue, 0, k1);
            j2 = k1;
        }
        for (; j2 < aiue.length - 1; j2++)
        {
            aiue[j2] = new iue();
            kwj1.a(aiue[j2]);
            kwj1.a();
        }

        aiue[j2] = new iue();
        kwj1.a(aiue[j2]);
        s = aiue;
          goto _L22
_L14:
        p = Integer.valueOf(kwj1.f());
          goto _L22
_L15:
        if (q == null)
        {
            q = new ity();
        }
        kwj1.a(q);
          goto _L22
_L16:
        o = kwj1.j();
          goto _L22
_L17:
        f = Long.valueOf(kwj1.e());
          goto _L22
_L18:
        int l1 = kwj1.f();
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
        n = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L20:
        e = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L21:
        m = kwj1.j();
        if (true) goto _L22; else goto _L23
_L23:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(1, a);
        kwk1.a(2, b);
        kwk1.a(3, c.intValue());
        if (g != null)
        {
            kwk1.a(4, g);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                itz itz1 = i[i1];
                if (itz1 != null)
                {
                    kwk1.a(5, itz1);
                }
            }

        }
        if (j != null)
        {
            kwk1.a(28, j.booleanValue());
        }
        if (k != null)
        {
            kwk1.a(29, k.intValue());
        }
        if (l != null)
        {
            kwk1.a(30, l.intValue());
        }
        if (r != null)
        {
            kwk1.b(42, r.longValue());
        }
        if (h != null)
        {
            kwk1.a(43, h);
        }
        if (s != null && s.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < s.length; j1++)
            {
                iue iue1 = s[j1];
                if (iue1 != null)
                {
                    kwk1.b(52, iue1);
                }
            }

        }
        if (p != null)
        {
            kwk1.a(68, p.intValue());
        }
        if (q != null)
        {
            kwk1.b(69, q);
        }
        if (o != null)
        {
            kwk1.a(100, o);
        }
        if (f != null)
        {
            kwk1.b(104, f.longValue());
        }
        if (d != null)
        {
            kwk1.a(105, d.intValue());
        }
        if (n != null)
        {
            kwk1.a(106, n.intValue());
        }
        if (e != null)
        {
            kwk1.b(107, e.longValue());
        }
        if (m != null)
        {
            kwk1.a(112, m);
        }
        super.writeTo(kwk1);
    }
}
