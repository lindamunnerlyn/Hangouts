// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class idg extends kwm
{

    private static volatile idg q[];
    public String a;
    public String b;
    public int c;
    public idd d;
    public String e;
    public ifu f;
    public String g;
    public Long h;
    public Long i;
    public String j;
    public String k;
    public ide l;
    public String m;
    public ifr n;
    public iee o[];
    public String p;

    public idg()
    {
        a = null;
        b = null;
        c = 0x80000000;
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
        o = iee.a();
        p = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static idg[] a()
    {
        if (q == null)
        {
            synchronized (kwq.a)
            {
                if (q == null)
                {
                    q = new idg[0];
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
            i1 = j1 + kwk.b(1, b);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(2, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.e(3, h.longValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(4, j);
        }
        i1 = j1;
        if (c != 0x80000000)
        {
            i1 = j1 + kwk.e(5, c);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.d(6, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.b(7, m);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.d(8, d);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.d(9, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1;
            if (o.length > 0)
            {
                for (j1 = 0; j1 < o.length;)
                {
                    iee iee1 = o[j1];
                    int k1 = i1;
                    if (iee1 != null)
                    {
                        k1 = i1 + kwk.d(10, iee1);
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
            i1 = j1 + kwk.e(11, i.longValue());
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + kwk.b(12, a);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(13, e);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.b(14, k);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.b(15, p);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(16, f);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L19:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   10: 163
    //                   18: 174
    //                   24: 185
    //                   34: 199
    //                   40: 210
    //                   50: 263
    //                   58: 292
    //                   66: 303
    //                   74: 332
    //                   82: 361
    //                   88: 485
    //                   98: 499
    //                   106: 510
    //                   114: 521
    //                   122: 532
    //                   130: 543;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        b = kwj1.j();
          goto _L19
_L4:
        g = kwj1.j();
          goto _L19
_L5:
        h = Long.valueOf(kwj1.e());
          goto _L19
_L6:
        j = kwj1.j();
          goto _L19
_L7:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            c = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (l == null)
        {
            l = new ide();
        }
        kwj1.a(l);
        continue; /* Loop/switch isn't completed */
_L9:
        m = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        if (d == null)
        {
            d = new idd();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L11:
        if (n == null)
        {
            n = new ifr();
        }
        kwj1.a(n);
        continue; /* Loop/switch isn't completed */
_L12:
        int l1 = kwx.a(kwj1, 82);
        iee aiee[];
        int k1;
        if (o == null)
        {
            k1 = 0;
        } else
        {
            k1 = o.length;
        }
        aiee = new iee[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(o, 0, aiee, 0, k1);
            l1 = k1;
        }
        for (; l1 < aiee.length - 1; l1++)
        {
            aiee[l1] = new iee();
            kwj1.a(aiee[l1]);
            kwj1.a();
        }

        aiee[l1] = new iee();
        kwj1.a(aiee[l1]);
        o = aiee;
        continue; /* Loop/switch isn't completed */
_L13:
        i = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L14:
        a = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L16:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L17:
        p = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        if (f == null)
        {
            f = new ifu();
        }
        kwj1.a(f);
        if (true) goto _L19; else goto _L20
_L20:
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b);
        }
        if (g != null)
        {
            kwk1.a(2, g);
        }
        if (h != null)
        {
            kwk1.b(3, h.longValue());
        }
        if (j != null)
        {
            kwk1.a(4, j);
        }
        if (c != 0x80000000)
        {
            kwk1.a(5, c);
        }
        if (l != null)
        {
            kwk1.b(6, l);
        }
        if (m != null)
        {
            kwk1.a(7, m);
        }
        if (d != null)
        {
            kwk1.b(8, d);
        }
        if (n != null)
        {
            kwk1.b(9, n);
        }
        if (o != null && o.length > 0)
        {
            for (int i1 = 0; i1 < o.length; i1++)
            {
                iee iee1 = o[i1];
                if (iee1 != null)
                {
                    kwk1.b(10, iee1);
                }
            }

        }
        if (i != null)
        {
            kwk1.b(11, i.longValue());
        }
        if (a != null)
        {
            kwk1.a(12, a);
        }
        if (e != null)
        {
            kwk1.a(13, e);
        }
        if (k != null)
        {
            kwk1.a(14, k);
        }
        if (p != null)
        {
            kwk1.a(15, p);
        }
        if (f != null)
        {
            kwk1.b(16, f);
        }
        super.writeTo(kwk1);
    }
}
