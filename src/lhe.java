// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhe extends kwm
{

    private static volatile lhe n[];
    public Integer a;
    public lhf b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Integer g;
    public String h;
    public Integer i;
    public lhg j;
    public lhf k[];
    public ljl l;
    public String m;

    public lhe()
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
        k = lhf.a();
        l = null;
        m = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lhe[] a()
    {
        if (n == null)
        {
            synchronized (kwq.a)
            {
                if (n == null)
                {
                    n = new lhe[0];
                }
            }
        }
        return n;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.e(1, a.intValue());
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.d(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(4, d);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.b(5, f);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(6, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.e(7, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.d(8, j);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.e(9, g.intValue());
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    lhf lhf1 = k[j1];
                    int k1 = i1;
                    if (lhf1 != null)
                    {
                        k1 = i1 + kwk.d(10, lhf1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.d(11, l);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.b(12, e);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.b(13, m);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L16:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 14: default 128
    //                   0: 137
    //                   8: 139
    //                   18: 182
    //                   26: 211
    //                   34: 222
    //                   42: 233
    //                   50: 244
    //                   56: 255
    //                   66: 269
    //                   72: 298
    //                   82: 312
    //                   90: 436
    //                   98: 465
    //                   106: 476;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
            a = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new lhf();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        h = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        i = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L10:
        if (j == null)
        {
            j = new lhg();
        }
        kwj1.a(j);
        continue; /* Loop/switch isn't completed */
_L11:
        g = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L12:
        int l1 = kwx.a(kwj1, 82);
        lhf alhf[];
        int k1;
        if (k == null)
        {
            k1 = 0;
        } else
        {
            k1 = k.length;
        }
        alhf = new lhf[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(k, 0, alhf, 0, k1);
            l1 = k1;
        }
        for (; l1 < alhf.length - 1; l1++)
        {
            alhf[l1] = new lhf();
            kwj1.a(alhf[l1]);
            kwj1.a();
        }

        alhf[l1] = new lhf();
        kwj1.a(alhf[l1]);
        k = alhf;
        continue; /* Loop/switch isn't completed */
_L13:
        if (l == null)
        {
            l = new ljl();
        }
        kwj1.a(l);
        continue; /* Loop/switch isn't completed */
_L14:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L15:
        m = kwj1.j();
        if (true) goto _L16; else goto _L17
_L17:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (f != null)
        {
            kwk1.a(5, f);
        }
        if (h != null)
        {
            kwk1.a(6, h);
        }
        if (i != null)
        {
            kwk1.a(7, i.intValue());
        }
        if (j != null)
        {
            kwk1.b(8, j);
        }
        if (g != null)
        {
            kwk1.a(9, g.intValue());
        }
        if (k != null && k.length > 0)
        {
            for (int i1 = 0; i1 < k.length; i1++)
            {
                lhf lhf1 = k[i1];
                if (lhf1 != null)
                {
                    kwk1.b(10, lhf1);
                }
            }

        }
        if (l != null)
        {
            kwk1.b(11, l);
        }
        if (e != null)
        {
            kwk1.a(12, e);
        }
        if (m != null)
        {
            kwk1.a(13, m);
        }
        super.writeTo(kwk1);
    }
}
