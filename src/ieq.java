// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ieq extends kwm
{

    private static volatile ieq o[];
    public String a;
    public String b;
    public String c;
    public inp d;
    public ijv e;
    public lcy f;
    public String g;
    public Long h;
    public Long i;
    public iff j;
    public int k;
    public int l;
    public String m;
    public igp n;

    public ieq()
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
        k = 0x80000000;
        l = 0x80000000;
        m = null;
        n = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ieq[] a()
    {
        if (o == null)
        {
            synchronized (kwq.a)
            {
                if (o == null)
                {
                    o = new ieq[0];
                }
            }
        }
        return o;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize() + kwk.b(1, a) + kwk.b(2, b) + kwk.b(3, g);
        int i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(4, j);
        }
        j1 = i1;
        if (k != 0x80000000)
        {
            j1 = i1 + kwk.e(5, k);
        }
        i1 = j1;
        if (l != 0x80000000)
        {
            i1 = j1 + kwk.e(6, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.b(7, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.d(8, n);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(9, c);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.e(10, h.longValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.e(11, i.longValue());
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.d(12, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.d(13, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.d(14, f);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L17:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 15: default 136
    //                   0: 145
    //                   10: 147
    //                   18: 158
    //                   26: 169
    //                   34: 180
    //                   40: 209
    //                   48: 255
    //                   58: 295
    //                   66: 306
    //                   74: 335
    //                   80: 346
    //                   88: 360
    //                   98: 374
    //                   106: 403
    //                   114: 432;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L17; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L17
_L4:
        b = kwj1.j();
          goto _L17
_L5:
        g = kwj1.j();
          goto _L17
_L6:
        if (j == null)
        {
            j = new iff();
        }
        kwj1.a(j);
          goto _L17
_L7:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            k = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 1: // '\001'
        case 2: // '\002'
            l = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        m = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        if (n == null)
        {
            n = new igp();
        }
        kwj1.a(n);
        continue; /* Loop/switch isn't completed */
_L11:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        h = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L13:
        i = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L14:
        if (d == null)
        {
            d = new inp();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L15:
        if (e == null)
        {
            e = new ijv();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L16:
        if (f == null)
        {
            f = new lcy();
        }
        kwj1.a(f);
        if (true) goto _L17; else goto _L18
_L18:
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a);
        kwk1.a(2, b);
        kwk1.a(3, g);
        if (j != null)
        {
            kwk1.b(4, j);
        }
        if (k != 0x80000000)
        {
            kwk1.a(5, k);
        }
        if (l != 0x80000000)
        {
            kwk1.a(6, l);
        }
        if (m != null)
        {
            kwk1.a(7, m);
        }
        if (n != null)
        {
            kwk1.b(8, n);
        }
        if (c != null)
        {
            kwk1.a(9, c);
        }
        if (h != null)
        {
            kwk1.b(10, h.longValue());
        }
        if (i != null)
        {
            kwk1.b(11, i.longValue());
        }
        if (d != null)
        {
            kwk1.b(12, d);
        }
        if (e != null)
        {
            kwk1.b(13, e);
        }
        if (f != null)
        {
            kwk1.b(14, f);
        }
        super.writeTo(kwk1);
    }
}
