// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ifb extends kwm
{

    private static volatile ifb r[];
    public String a;
    public iff b;
    public ifu c;
    public int d;
    public iez e;
    public ifa f;
    public iff g;
    public ifu h;
    public String i[];
    public iff j[];
    public ifu k[];
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public int o;
    public ifj p;
    public String q;

    public ifb()
    {
        a = null;
        b = null;
        c = null;
        d = 0x80000000;
        e = null;
        f = null;
        g = null;
        h = null;
        i = kwx.f;
        j = iff.a();
        k = ifu.a();
        l = null;
        m = null;
        n = null;
        o = 0x80000000;
        p = null;
        q = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ifb[] a()
    {
        if (r == null)
        {
            synchronized (kwq.a)
            {
                if (r == null)
                {
                    r = new ifb[0];
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
        int j1 = super.computeSerializedSize() + kwk.b(1, a);
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.d(2, b);
        }
        j1 = i1;
        if (d != 0x80000000)
        {
            j1 = i1 + kwk.e(3, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.d(4, e);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.d(5, g);
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
                        i3 = l1 + kwk.a(s);
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
                    iff iff1 = j[j1];
                    int i2 = i1;
                    if (iff1 != null)
                    {
                        i2 = i1 + kwk.d(7, iff1);
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
            i1 = j1 + (kwk.f(8) + 1);
        }
        j1 = i1;
        if (m != null)
        {
            m.booleanValue();
            j1 = i1 + (kwk.f(9) + 1);
        }
        i1 = j1;
        if (o != 0x80000000)
        {
            i1 = j1 + kwk.e(10, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + kwk.d(11, p);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.d(12, f);
        }
        j1 = i1;
        if (n != null)
        {
            n.booleanValue();
            j1 = i1 + (kwk.f(13) + 1);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + kwk.b(14, q);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.d(15, c);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.d(16, h);
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
                    ifu ifu1 = k[k1];
                    j2 = i1;
                    if (ifu1 != null)
                    {
                        j2 = i1 + kwk.d(17, ifu1);
                    }
                    k1++;
                    i1 = j2;
                } while (true);
            }
        }
        return j2;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L20:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 18: default 160
    //                   0: 169
    //                   10: 171
    //                   18: 182
    //                   24: 211
    //                   34: 267
    //                   42: 296
    //                   50: 325
    //                   58: 427
    //                   64: 551
    //                   72: 565
    //                   80: 579
    //                   90: 619
    //                   98: 648
    //                   104: 677
    //                   114: 691
    //                   122: 702
    //                   130: 731
    //                   138: 760;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L20
_L4:
        if (b == null)
        {
            b = new iff();
        }
        kwj1.a(b);
          goto _L20
_L5:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            d = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (e == null)
        {
            e = new iez();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L7:
        if (g == null)
        {
            g = new iff();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L8:
        int k2 = kwx.a(kwj1, 50);
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
            as[k2] = kwj1.j();
            kwj1.a();
        }

        as[k2] = kwj1.j();
        i = as;
        continue; /* Loop/switch isn't completed */
_L9:
        int l2 = kwx.a(kwj1, 58);
        iff aiff[];
        int l1;
        if (j == null)
        {
            l1 = 0;
        } else
        {
            l1 = j.length;
        }
        aiff = new iff[l2 + l1];
        l2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(j, 0, aiff, 0, l1);
            l2 = l1;
        }
        for (; l2 < aiff.length - 1; l2++)
        {
            aiff[l2] = new iff();
            kwj1.a(aiff[l2]);
            kwj1.a();
        }

        aiff[l2] = new iff();
        kwj1.a(aiff[l2]);
        j = aiff;
        continue; /* Loop/switch isn't completed */
_L10:
        l = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L11:
        m = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L12:
        int i2 = kwj1.f();
        switch (i2)
        {
        case 1: // '\001'
        case 2: // '\002'
            o = i2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        if (p == null)
        {
            p = new ifj();
        }
        kwj1.a(p);
        continue; /* Loop/switch isn't completed */
_L14:
        if (f == null)
        {
            f = new ifa();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L15:
        n = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L16:
        q = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        if (c == null)
        {
            c = new ifu();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L18:
        if (h == null)
        {
            h = new ifu();
        }
        kwj1.a(h);
        continue; /* Loop/switch isn't completed */
_L19:
        int i3 = kwx.a(kwj1, 138);
        ifu aifu[];
        int j2;
        if (k == null)
        {
            j2 = 0;
        } else
        {
            j2 = k.length;
        }
        aifu = new ifu[i3 + j2];
        i3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(k, 0, aifu, 0, j2);
            i3 = j2;
        }
        for (; i3 < aifu.length - 1; i3++)
        {
            aifu[i3] = new ifu();
            kwj1.a(aifu[i3]);
            kwj1.a();
        }

        aifu[i3] = new ifu();
        kwj1.a(aifu[i3]);
        k = aifu;
        if (true) goto _L20; else goto _L21
_L21:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(1, a);
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (d != 0x80000000)
        {
            kwk1.a(3, d);
        }
        if (e != null)
        {
            kwk1.b(4, e);
        }
        if (g != null)
        {
            kwk1.b(5, g);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                String s = i[i1];
                if (s != null)
                {
                    kwk1.a(6, s);
                }
            }

        }
        if (j != null && j.length > 0)
        {
            for (int j1 = 0; j1 < j.length; j1++)
            {
                iff iff1 = j[j1];
                if (iff1 != null)
                {
                    kwk1.b(7, iff1);
                }
            }

        }
        if (l != null)
        {
            kwk1.a(8, l.booleanValue());
        }
        if (m != null)
        {
            kwk1.a(9, m.booleanValue());
        }
        if (o != 0x80000000)
        {
            kwk1.a(10, o);
        }
        if (p != null)
        {
            kwk1.b(11, p);
        }
        if (f != null)
        {
            kwk1.b(12, f);
        }
        if (n != null)
        {
            kwk1.a(13, n.booleanValue());
        }
        if (q != null)
        {
            kwk1.a(14, q);
        }
        if (c != null)
        {
            kwk1.b(15, c);
        }
        if (h != null)
        {
            kwk1.b(16, h);
        }
        if (k != null && k.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < k.length; k1++)
            {
                ifu ifu1 = k[k1];
                if (ifu1 != null)
                {
                    kwk1.b(17, ifu1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
