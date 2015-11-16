// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kqp extends koj
{

    public static final kok a = kok.a(kqp, 0xd2e04aaL);
    private static final kqp u[] = new kqp[0];
    public krf b;
    public String c;
    public String d;
    public String e;
    public String f[];
    public Boolean g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public Integer o;
    public koz p;
    public String q;
    public String r;
    public String s;
    public String t;

    public kqp()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = kou.f;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kqp[] a()
    {
        return u;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.d(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(2, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.b(4, e);
        }
        i1 = j1;
        if (g != null)
        {
            g.booleanValue();
            i1 = j1 + (koh.f(5) + 1);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.b(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.b(7, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.b(8, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.b(9, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.b(10, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.b(11, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.b(12, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + koh.e(13, o.intValue());
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                int k1 = 0;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < f.length;)
                {
                    String s1 = f[j1];
                    int j2 = k1;
                    int i2 = l1;
                    if (s1 != null)
                    {
                        i2 = l1 + 1;
                        j2 = k1 + koh.a(s1);
                    }
                    j1++;
                    k1 = j2;
                    l1 = i2;
                }

                j1 = i1 + k1 + l1 * 1;
            }
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.d(15, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.b(16, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.b(17, r);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + koh.b(18, s);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + koh.b(19, t);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L22:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 20: default 176
    //                   0: 185
    //                   10: 187
    //                   18: 216
    //                   26: 227
    //                   34: 238
    //                   40: 249
    //                   50: 263
    //                   58: 274
    //                   66: 285
    //                   74: 296
    //                   82: 307
    //                   90: 318
    //                   98: 329
    //                   104: 340
    //                   114: 394
    //                   122: 496
    //                   130: 525
    //                   138: 536
    //                   146: 547
    //                   154: 558;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L22; else goto _L2
_L2:
        return this;
_L3:
        if (b == null)
        {
            b = new krf();
        }
        kog1.a(b);
          goto _L22
_L4:
        c = kog1.j();
          goto _L22
_L5:
        d = kog1.j();
          goto _L22
_L6:
        e = kog1.j();
          goto _L22
_L7:
        g = Boolean.valueOf(kog1.i());
          goto _L22
_L8:
        h = kog1.j();
          goto _L22
_L9:
        i = kog1.j();
          goto _L22
_L10:
        j = kog1.j();
          goto _L22
_L11:
        k = kog1.j();
          goto _L22
_L12:
        l = kog1.j();
          goto _L22
_L13:
        m = kog1.j();
          goto _L22
_L14:
        n = kog1.j();
          goto _L22
_L15:
        int j1 = kog1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            o = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L16:
        int l1 = kou.b(kog1, 114);
        String as[];
        int k1;
        if (f == null)
        {
            k1 = 0;
        } else
        {
            k1 = f.length;
        }
        as = new String[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(f, 0, as, 0, k1);
            l1 = k1;
        }
        for (; l1 < as.length - 1; l1++)
        {
            as[l1] = kog1.j();
            kog1.a();
        }

        as[l1] = kog1.j();
        f = as;
        continue; /* Loop/switch isn't completed */
_L17:
        if (p == null)
        {
            p = new koz();
        }
        kog1.a(p);
        continue; /* Loop/switch isn't completed */
_L18:
        q = kog1.j();
        continue; /* Loop/switch isn't completed */
_L19:
        r = kog1.j();
        continue; /* Loop/switch isn't completed */
_L20:
        s = kog1.j();
        continue; /* Loop/switch isn't completed */
_L21:
        t = kog1.j();
        if (true) goto _L22; else goto _L23
_L23:
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.b(1, b);
        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (g != null)
        {
            koh1.a(5, g.booleanValue());
        }
        if (h != null)
        {
            koh1.a(6, h);
        }
        if (i != null)
        {
            koh1.a(7, i);
        }
        if (j != null)
        {
            koh1.a(8, j);
        }
        if (k != null)
        {
            koh1.a(9, k);
        }
        if (l != null)
        {
            koh1.a(10, l);
        }
        if (m != null)
        {
            koh1.a(11, m);
        }
        if (n != null)
        {
            koh1.a(12, n);
        }
        if (o != null)
        {
            koh1.a(13, o.intValue());
        }
        if (f != null && f.length > 0)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                String s1 = f[i1];
                if (s1 != null)
                {
                    koh1.a(14, s1);
                }
            }

        }
        if (p != null)
        {
            koh1.b(15, p);
        }
        if (q != null)
        {
            koh1.a(16, q);
        }
        if (r != null)
        {
            koh1.a(17, r);
        }
        if (s != null)
        {
            koh1.a(18, s);
        }
        if (t != null)
        {
            koh1.a(19, t);
        }
        super.writeTo(koh1);
    }

}
