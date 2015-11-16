// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class inu extends koj
{

    private static volatile inu q[];
    public Integer a;
    public inx b[];
    public inv c[];
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Float l;
    public Integer m;
    public Integer n;
    public Boolean o;
    public Integer p;

    public inu()
    {
        a = null;
        b = inx.a();
        c = inv.a();
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
        p = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static inu[] a()
    {
        if (q == null)
        {
            synchronized (kon.a)
            {
                if (q == null)
                {
                    q = new inu[0];
                }
            }
        }
        return q;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + koh.e(6, a.intValue());
        int i1 = j1;
        if (b != null)
        {
            i1 = j1;
            if (b.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < b.length;)
                {
                    inx inx1 = b[j1];
                    int k1 = i1;
                    if (inx1 != null)
                    {
                        k1 = i1 + koh.c(7, inx1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= c.length)
                    {
                        break;
                    }
                    inv inv1 = c[l1];
                    j1 = i1;
                    if (inv1 != null)
                    {
                        j1 = i1 + koh.c(18, inv1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.e(39, d.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.e(40, h.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.e(41, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(59, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.e(71, k.intValue());
        }
        j1 = i1;
        if (l != null)
        {
            l.floatValue();
            j1 = i1 + (koh.f(76) + 4);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.e(77, m.intValue());
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.e(78, n.intValue());
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (koh.f(79) + 1);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + koh.e(80, p.intValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.e(97, e.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.e(98, g.intValue());
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.e(99, f.intValue());
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L19:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   48: 163
    //                   59: 177
    //                   147: 305
    //                   312: 434
    //                   320: 448
    //                   328: 462
    //                   472: 476
    //                   568: 490
    //                   613: 546
    //                   616: 560
    //                   624: 574
    //                   632: 588
    //                   640: 602
    //                   776: 616
    //                   784: 630
    //                   792: 644;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(kog1.f());
          goto _L19
_L4:
        int i2 = kou.b(kog1, 59);
        inx ainx[];
        int j1;
        if (b == null)
        {
            j1 = 0;
        } else
        {
            j1 = b.length;
        }
        ainx = new inx[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(b, 0, ainx, 0, j1);
            i2 = j1;
        }
        for (; i2 < ainx.length - 1; i2++)
        {
            ainx[i2] = new inx();
            kog1.a(ainx[i2], 7);
            kog1.a();
        }

        ainx[i2] = new inx();
        kog1.a(ainx[i2], 7);
        b = ainx;
          goto _L19
_L5:
        int j2 = kou.b(kog1, 147);
        inv ainv[];
        int k1;
        if (c == null)
        {
            k1 = 0;
        } else
        {
            k1 = c.length;
        }
        ainv = new inv[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(c, 0, ainv, 0, k1);
            j2 = k1;
        }
        for (; j2 < ainv.length - 1; j2++)
        {
            ainv[j2] = new inv();
            kog1.a(ainv[j2], 18);
            kog1.a();
        }

        ainv[j2] = new inv();
        kog1.a(ainv[j2], 18);
        c = ainv;
          goto _L19
_L6:
        d = Integer.valueOf(kog1.f());
          goto _L19
_L7:
        h = Integer.valueOf(kog1.f());
          goto _L19
_L8:
        i = Integer.valueOf(kog1.f());
          goto _L19
_L9:
        j = Integer.valueOf(kog1.f());
          goto _L19
_L10:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            k = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        l = Float.valueOf(kog1.c());
        continue; /* Loop/switch isn't completed */
_L12:
        m = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L13:
        n = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L14:
        o = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        p = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L16:
        e = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L17:
        g = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L18:
        f = Integer.valueOf(kog1.f());
        if (true) goto _L19; else goto _L20
_L20:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        koh1.a(6, a.intValue());
        if (b != null && b.length > 0)
        {
            for (int i1 = 0; i1 < b.length; i1++)
            {
                inx inx1 = b[i1];
                if (inx1 != null)
                {
                    koh1.a(7, inx1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < c.length; j1++)
            {
                inv inv1 = c[j1];
                if (inv1 != null)
                {
                    koh1.a(18, inv1);
                }
            }

        }
        if (d != null)
        {
            koh1.a(39, d.intValue());
        }
        if (h != null)
        {
            koh1.a(40, h.intValue());
        }
        if (i != null)
        {
            koh1.a(41, i.intValue());
        }
        if (j != null)
        {
            koh1.a(59, j.intValue());
        }
        if (k != null)
        {
            koh1.a(71, k.intValue());
        }
        if (l != null)
        {
            koh1.a(76, l.floatValue());
        }
        if (m != null)
        {
            koh1.a(77, m.intValue());
        }
        if (n != null)
        {
            koh1.a(78, n.intValue());
        }
        if (o != null)
        {
            koh1.a(79, o.booleanValue());
        }
        if (p != null)
        {
            koh1.a(80, p.intValue());
        }
        if (e != null)
        {
            koh1.a(97, e.intValue());
        }
        if (g != null)
        {
            koh1.a(98, g.intValue());
        }
        if (f != null)
        {
            koh1.a(99, f.intValue());
        }
        super.writeTo(koh1);
    }
}
