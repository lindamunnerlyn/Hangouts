// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzi extends koj
{

    private static volatile hzi q[];
    public String a;
    public String b;
    public Integer c;
    public hzf d;
    public String e;
    public iaz f;
    public String g;
    public Long h;
    public Long i;
    public String j;
    public String k;
    public hzg l;
    public String m;
    public iax n;
    public iah o[];
    public String p;

    public hzi()
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
        o = iah.a();
        p = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hzi[] a()
    {
        if (q == null)
        {
            synchronized (kon.a)
            {
                if (q == null)
                {
                    q = new hzi[0];
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
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.b(1, b);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.b(2, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.e(3, h.longValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.b(4, j);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.e(5, c.intValue());
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.d(6, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.b(7, m);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.d(8, d);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.d(9, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1;
            if (o.length > 0)
            {
                for (j1 = 0; j1 < o.length;)
                {
                    iah iah1 = o[j1];
                    int k1 = i1;
                    if (iah1 != null)
                    {
                        k1 = i1 + koh.d(10, iah1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.e(11, i.longValue());
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + koh.b(12, a);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(13, e);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.b(14, k);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.b(15, p);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.d(16, f);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L19:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   10: 163
    //                   18: 174
    //                   24: 185
    //                   34: 199
    //                   40: 210
    //                   50: 266
    //                   58: 295
    //                   66: 306
    //                   74: 335
    //                   82: 364
    //                   88: 488
    //                   98: 502
    //                   106: 513
    //                   114: 524
    //                   122: 535
    //                   130: 546;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        b = kog1.j();
          goto _L19
_L4:
        g = kog1.j();
          goto _L19
_L5:
        h = Long.valueOf(kog1.e());
          goto _L19
_L6:
        j = kog1.j();
          goto _L19
_L7:
        int j1 = kog1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            c = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (l == null)
        {
            l = new hzg();
        }
        kog1.a(l);
        continue; /* Loop/switch isn't completed */
_L9:
        m = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        if (d == null)
        {
            d = new hzf();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L11:
        if (n == null)
        {
            n = new iax();
        }
        kog1.a(n);
        continue; /* Loop/switch isn't completed */
_L12:
        int l1 = kou.b(kog1, 82);
        iah aiah[];
        int k1;
        if (o == null)
        {
            k1 = 0;
        } else
        {
            k1 = o.length;
        }
        aiah = new iah[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(o, 0, aiah, 0, k1);
            l1 = k1;
        }
        for (; l1 < aiah.length - 1; l1++)
        {
            aiah[l1] = new iah();
            kog1.a(aiah[l1]);
            kog1.a();
        }

        aiah[l1] = new iah();
        kog1.a(aiah[l1]);
        o = aiah;
        continue; /* Loop/switch isn't completed */
_L13:
        i = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L14:
        a = kog1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        e = kog1.j();
        continue; /* Loop/switch isn't completed */
_L16:
        k = kog1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        p = kog1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        if (f == null)
        {
            f = new iaz();
        }
        kog1.a(f);
        if (true) goto _L19; else goto _L20
_L20:
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(1, b);
        }
        if (g != null)
        {
            koh1.a(2, g);
        }
        if (h != null)
        {
            koh1.b(3, h.longValue());
        }
        if (j != null)
        {
            koh1.a(4, j);
        }
        if (c != null)
        {
            koh1.a(5, c.intValue());
        }
        if (l != null)
        {
            koh1.b(6, l);
        }
        if (m != null)
        {
            koh1.a(7, m);
        }
        if (d != null)
        {
            koh1.b(8, d);
        }
        if (n != null)
        {
            koh1.b(9, n);
        }
        if (o != null && o.length > 0)
        {
            for (int i1 = 0; i1 < o.length; i1++)
            {
                iah iah1 = o[i1];
                if (iah1 != null)
                {
                    koh1.b(10, iah1);
                }
            }

        }
        if (i != null)
        {
            koh1.b(11, i.longValue());
        }
        if (a != null)
        {
            koh1.a(12, a);
        }
        if (e != null)
        {
            koh1.a(13, e);
        }
        if (k != null)
        {
            koh1.a(14, k);
        }
        if (p != null)
        {
            koh1.a(15, p);
        }
        if (f != null)
        {
            koh1.b(16, f);
        }
        super.writeTo(koh1);
    }
}
