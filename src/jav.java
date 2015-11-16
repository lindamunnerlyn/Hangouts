// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jav extends koj
{

    private static volatile jav B[];
    public String A;
    public String a;
    public Integer b;
    public jau c;
    public Boolean d;
    public Boolean e;
    public Integer f;
    public Long g;
    public Long h;
    public String i;
    public irg j;
    public Boolean k;
    public Long l;
    public Long m;
    public String n;
    public Integer o;
    public String p[];
    public Boolean q;
    public Integer r;
    public jbr s;
    public Boolean t;
    public Integer u;
    public jat v;
    public Integer w;
    public Integer x;
    public Integer y;
    public int z[];

    public jav()
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
        n = null;
        o = null;
        p = kou.f;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = kou.a;
        A = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jav[] a()
    {
        if (B == null)
        {
            synchronized (kon.a)
            {
                if (B == null)
                {
                    B = new jav[0];
                }
            }
        }
        return B;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
            i1 = j1 + koh.d(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            d.booleanValue();
            j1 = i1 + (koh.f(4) + 1);
        }
        i1 = j1;
        if (e != null)
        {
            e.booleanValue();
            i1 = j1 + (koh.f(5) + 1);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.e(6, g.longValue());
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.e(7, h.longValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.b(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            k.booleanValue();
            j1 = i1 + (koh.f(10) + 1);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + koh.e(11, l.longValue());
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.e(12, m.longValue());
        }
        int k1 = j1;
        if (n != null)
        {
            k1 = j1 + koh.b(13, n);
        }
        i1 = k1;
        if (o != null)
        {
            i1 = k1 + koh.e(14, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                j1 = 0;
                k1 = 0;
                int i2;
                int j2;
                for (i2 = 0; j1 < p.length; i2 = j2)
                {
                    String s1 = p[j1];
                    int k2 = k1;
                    j2 = i2;
                    if (s1 != null)
                    {
                        j2 = i2 + 1;
                        k2 = k1 + koh.a(s1);
                    }
                    j1++;
                    k1 = k2;
                }

                j1 = i1 + k1 + i2 * 1;
            }
        }
        i1 = j1;
        if (q != null)
        {
            q.booleanValue();
            i1 = j1 + (koh.f(16) + 1);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + koh.d(17, s);
        }
        i1 = j1;
        if (t != null)
        {
            t.booleanValue();
            i1 = j1 + (koh.f(18) + 1);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + koh.d(19, v);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.e(20, f.intValue());
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1 + koh.e(21, w.intValue());
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + koh.e(22, x.intValue());
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + koh.e(23, y.intValue());
        }
        k1 = j1;
        if (r != null)
        {
            k1 = j1 + koh.e(24, r.intValue());
        }
        i1 = k1;
        if (u != null)
        {
            i1 = k1 + koh.e(25, u.intValue());
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1;
            if (z.length > 0)
            {
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < z.length; j1++)
                {
                    l1 += koh.e(z[j1]);
                }

                j1 = i1 + l1 + z.length * 2;
            }
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + koh.b(27, A);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L31:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 29: default 252
    //                   0: 262
    //                   10: 264
    //                   16: 275
    //                   26: 339
    //                   32: 368
    //                   40: 382
    //                   48: 396
    //                   56: 410
    //                   66: 424
    //                   74: 435
    //                   80: 464
    //                   88: 478
    //                   96: 492
    //                   106: 506
    //                   112: 517
    //                   122: 567
    //                   128: 676
    //                   138: 690
    //                   144: 719
    //                   154: 733
    //                   160: 762
    //                   168: 811
    //                   176: 859
    //                   184: 907
    //                   192: 955
    //                   200: 1003
    //                   208: 1051
    //                   210: 1240
    //                   218: 1446;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L31; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L31
_L4:
        i1 = kog1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            b = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new jau();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        d = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L7:
        e = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        g = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L9:
        h = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L10:
        i = kog1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        if (j == null)
        {
            j = new irg();
        }
        kog1.a(j);
        continue; /* Loop/switch isn't completed */
_L12:
        k = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L13:
        l = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L14:
        m = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L15:
        n = kog1.j();
        continue; /* Loop/switch isn't completed */
_L16:
        i1 = kog1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            o = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        int j1 = kou.b(kog1, 122);
        String as[];
        if (p == null)
        {
            i1 = 0;
        } else
        {
            i1 = p.length;
        }
        as = new String[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(p, 0, as, 0, i1);
            j1 = i1;
        }
        for (; j1 < as.length - 1; j1++)
        {
            as[j1] = kog1.j();
            kog1.a();
        }

        as[j1] = kog1.j();
        p = as;
        continue; /* Loop/switch isn't completed */
_L18:
        q = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L19:
        if (s == null)
        {
            s = new jbr();
        }
        kog1.a(s);
        continue; /* Loop/switch isn't completed */
_L20:
        t = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L21:
        if (v == null)
        {
            v = new jat();
        }
        kog1.a(v);
        continue; /* Loop/switch isn't completed */
_L22:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L23:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            w = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L24:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            x = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L25:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            y = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L26:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            r = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L27:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            u = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L28:
        int ai[];
        int k1;
        int j2;
        j2 = kou.b(kog1, 208);
        ai = new int[j2];
        k1 = 0;
        i1 = 0;
_L37:
        if (k1 >= j2) goto _L33; else goto _L32
_L32:
        int k2;
        if (k1 != 0)
        {
            kog1.a();
        }
        k2 = kog1.f();
        k2;
        JVM INSTR tableswitch 0 2: default 1124
    //                   0 1133
    //                   1 1133
    //                   2 1133;
           goto _L34 _L35 _L35 _L35
_L34:
        k1++;
        continue; /* Loop/switch isn't completed */
_L35:
        int l1 = i1 + 1;
        ai[i1] = k2;
        i1 = l1;
        if (true) goto _L34; else goto _L33
_L33:
        if (i1 != 0)
        {
            if (z == null)
            {
                k1 = 0;
            } else
            {
                k1 = z.length;
            }
            if (k1 == 0 && i1 == ai.length)
            {
                z = ai;
            } else
            {
                int ai1[] = new int[k1 + i1];
                if (k1 != 0)
                {
                    System.arraycopy(z, 0, ai1, 0, k1);
                }
                System.arraycopy(ai, 0, ai1, k1, i1);
                z = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L37; else goto _L36
_L36:
_L29:
        int i2;
        i2 = kog1.c(kog1.p());
        i1 = kog1.r();
        k1 = 0;
_L43:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k1 == 0) goto _L39; else goto _L38
_L38:
        kog1.e(i1);
        if (z == null)
        {
            i1 = 0;
        } else
        {
            i1 = z.length;
        }
        ai = new int[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(z, 0, ai, 0, i1);
            k1 = i1;
        }
_L41:
        if (kog1.q() > 0)
        {
            i1 = kog1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                ai[k1] = i1;
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        z = ai;
_L39:
        kog1.d(i2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L41; else goto _L40
_L40:
        if (true) goto _L43; else goto _L42
_L42:
_L30:
        A = kog1.j();
        if (true) goto _L31; else goto _L44
_L44:
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
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            koh1.a(5, e.booleanValue());
        }
        if (g != null)
        {
            koh1.b(6, g.longValue());
        }
        if (h != null)
        {
            koh1.b(7, h.longValue());
        }
        if (i != null)
        {
            koh1.a(8, i);
        }
        if (j != null)
        {
            koh1.b(9, j);
        }
        if (k != null)
        {
            koh1.a(10, k.booleanValue());
        }
        if (l != null)
        {
            koh1.b(11, l.longValue());
        }
        if (m != null)
        {
            koh1.b(12, m.longValue());
        }
        if (n != null)
        {
            koh1.a(13, n);
        }
        if (o != null)
        {
            koh1.a(14, o.intValue());
        }
        if (p != null && p.length > 0)
        {
            for (int i1 = 0; i1 < p.length; i1++)
            {
                String s1 = p[i1];
                if (s1 != null)
                {
                    koh1.a(15, s1);
                }
            }

        }
        if (q != null)
        {
            koh1.a(16, q.booleanValue());
        }
        if (s != null)
        {
            koh1.b(17, s);
        }
        if (t != null)
        {
            koh1.a(18, t.booleanValue());
        }
        if (v != null)
        {
            koh1.b(19, v);
        }
        if (f != null)
        {
            koh1.a(20, f.intValue());
        }
        if (w != null)
        {
            koh1.a(21, w.intValue());
        }
        if (x != null)
        {
            koh1.a(22, x.intValue());
        }
        if (y != null)
        {
            koh1.a(23, y.intValue());
        }
        if (r != null)
        {
            koh1.a(24, r.intValue());
        }
        if (u != null)
        {
            koh1.a(25, u.intValue());
        }
        if (z != null && z.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < z.length; j1++)
            {
                koh1.a(26, z[j1]);
            }

        }
        if (A != null)
        {
            koh1.a(27, A);
        }
        super.writeTo(koh1);
    }
}
