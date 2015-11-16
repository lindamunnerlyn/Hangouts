// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyr extends koj
{

    private static volatile hyr r[];
    public String a;
    public hyu b;
    public iaz c;
    public Integer d;
    public hyp e;
    public hyq f;
    public hyu g;
    public iaz h;
    public String i[];
    public hyu j[];
    public iaz k[];
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public Integer o;
    public hyy p;
    public String q;

    public hyr()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = kou.f;
        j = hyu.a();
        k = iaz.a();
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hyr[] a()
    {
        if (r == null)
        {
            synchronized (kon.a)
            {
                if (r == null)
                {
                    r = new hyr[0];
                }
            }
        }
        return r;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + koh.b(1, a);
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.d(2, b);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.e(3, d.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.d(4, e);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.d(5, g);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1;
            if (i.length > 0)
            {
                i1 = 0;
                int l1 = 0;
                int k2;
                int l2;
                for (k2 = 0; i1 < i.length; k2 = l2)
                {
                    String s = i[i1];
                    int i3 = l1;
                    l2 = k2;
                    if (s != null)
                    {
                        l2 = k2 + 1;
                        i3 = l1 + koh.a(s);
                    }
                    i1++;
                    l1 = i3;
                }

                i1 = j1 + l1 + k2 * 1;
            }
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                for (j1 = 0; j1 < j.length;)
                {
                    hyu hyu1 = j[j1];
                    int i2 = i1;
                    if (hyu1 != null)
                    {
                        i2 = i1 + koh.d(7, hyu1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (l != null)
        {
            l.booleanValue();
            i1 = j1 + (koh.f(8) + 1);
        }
        j1 = i1;
        if (m != null)
        {
            m.booleanValue();
            j1 = i1 + (koh.f(9) + 1);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.e(10, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.d(11, p);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.d(12, f);
        }
        j1 = i1;
        if (n != null)
        {
            n.booleanValue();
            j1 = i1 + (koh.f(13) + 1);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + koh.b(14, q);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.d(15, c);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.d(16, h);
        }
        int j2 = i1;
        if (k != null)
        {
            j2 = i1;
            if (k.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    j2 = i1;
                    if (k1 >= k.length)
                    {
                        break;
                    }
                    iaz iaz1 = k[k1];
                    j2 = i1;
                    if (iaz1 != null)
                    {
                        j2 = i1 + koh.d(17, iaz1);
                    }
                    k1++;
                    i1 = j2;
                } while (true);
            }
        }
        return j2;
    }

    public kop mergeFrom(kog kog1)
    {
_L20:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 18: default 160
    //                   0: 169
    //                   10: 171
    //                   18: 182
    //                   24: 211
    //                   34: 270
    //                   42: 299
    //                   50: 328
    //                   58: 430
    //                   64: 554
    //                   72: 568
    //                   80: 582
    //                   90: 626
    //                   98: 655
    //                   104: 684
    //                   114: 698
    //                   122: 709
    //                   130: 738
    //                   138: 767;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L20
_L4:
        if (b == null)
        {
            b = new hyu();
        }
        kog1.a(b);
          goto _L20
_L5:
        int j1 = kog1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            d = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (e == null)
        {
            e = new hyp();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L7:
        if (g == null)
        {
            g = new hyu();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L8:
        int k2 = kou.b(kog1, 50);
        String as[];
        int k1;
        if (i == null)
        {
            k1 = 0;
        } else
        {
            k1 = i.length;
        }
        as = new String[k2 + k1];
        k2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(i, 0, as, 0, k1);
            k2 = k1;
        }
        for (; k2 < as.length - 1; k2++)
        {
            as[k2] = kog1.j();
            kog1.a();
        }

        as[k2] = kog1.j();
        i = as;
        continue; /* Loop/switch isn't completed */
_L9:
        int l2 = kou.b(kog1, 58);
        hyu ahyu[];
        int l1;
        if (j == null)
        {
            l1 = 0;
        } else
        {
            l1 = j.length;
        }
        ahyu = new hyu[l2 + l1];
        l2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(j, 0, ahyu, 0, l1);
            l2 = l1;
        }
        for (; l2 < ahyu.length - 1; l2++)
        {
            ahyu[l2] = new hyu();
            kog1.a(ahyu[l2]);
            kog1.a();
        }

        ahyu[l2] = new hyu();
        kog1.a(ahyu[l2]);
        j = ahyu;
        continue; /* Loop/switch isn't completed */
_L10:
        l = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L11:
        m = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L12:
        int i2 = kog1.f();
        switch (i2)
        {
        case 1: // '\001'
        case 2: // '\002'
            o = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        if (p == null)
        {
            p = new hyy();
        }
        kog1.a(p);
        continue; /* Loop/switch isn't completed */
_L14:
        if (f == null)
        {
            f = new hyq();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L15:
        n = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L16:
        q = kog1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        if (c == null)
        {
            c = new iaz();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L18:
        if (h == null)
        {
            h = new iaz();
        }
        kog1.a(h);
        continue; /* Loop/switch isn't completed */
_L19:
        int i3 = kou.b(kog1, 138);
        iaz aiaz[];
        int j2;
        if (k == null)
        {
            j2 = 0;
        } else
        {
            j2 = k.length;
        }
        aiaz = new iaz[i3 + j2];
        i3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(k, 0, aiaz, 0, j2);
            i3 = j2;
        }
        for (; i3 < aiaz.length - 1; i3++)
        {
            aiaz[i3] = new iaz();
            kog1.a(aiaz[i3]);
            kog1.a();
        }

        aiaz[i3] = new iaz();
        kog1.a(aiaz[i3]);
        k = aiaz;
        if (true) goto _L20; else goto _L21
_L21:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        koh1.a(1, a);
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (d != null)
        {
            koh1.a(3, d.intValue());
        }
        if (e != null)
        {
            koh1.b(4, e);
        }
        if (g != null)
        {
            koh1.b(5, g);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                String s = i[i1];
                if (s != null)
                {
                    koh1.a(6, s);
                }
            }

        }
        if (j != null && j.length > 0)
        {
            for (int j1 = 0; j1 < j.length; j1++)
            {
                hyu hyu1 = j[j1];
                if (hyu1 != null)
                {
                    koh1.b(7, hyu1);
                }
            }

        }
        if (l != null)
        {
            koh1.a(8, l.booleanValue());
        }
        if (m != null)
        {
            koh1.a(9, m.booleanValue());
        }
        if (o != null)
        {
            koh1.a(10, o.intValue());
        }
        if (p != null)
        {
            koh1.b(11, p);
        }
        if (f != null)
        {
            koh1.b(12, f);
        }
        if (n != null)
        {
            koh1.a(13, n.booleanValue());
        }
        if (q != null)
        {
            koh1.a(14, q);
        }
        if (c != null)
        {
            koh1.b(15, c);
        }
        if (h != null)
        {
            koh1.b(16, h);
        }
        if (k != null && k.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < k.length; k1++)
            {
                iaz iaz1 = k[k1];
                if (iaz1 != null)
                {
                    koh1.b(17, iaz1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
