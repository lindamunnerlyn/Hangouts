// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibd extends kwm
{

    public ibb a;
    public ibn b;
    public iad c;
    public String d;
    public Integer e;
    public lgx f;
    public Integer g;
    public hzd h;
    public ibe i;
    public Boolean j;
    public inb k;

    public ibd()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + kwk.d(1, a);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + kwk.d(3, b);
        }
        l = i1;
        if (c != null)
        {
            l = i1 + kwk.d(4, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + kwk.b(5, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + kwk.e(6, e.intValue());
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + kwk.d(8, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + kwk.e(9, g.intValue());
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + kwk.d(10, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + kwk.d(11, i);
        }
        i1 = l;
        if (j != null)
        {
            j.booleanValue();
            i1 = l + (kwk.f(12) + 1);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + kwk.d(13, k);
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L14:
        int l = kwj1.a();
        l;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   10: 123
    //                   26: 152
    //                   34: 181
    //                   42: 210
    //                   48: 221
    //                   66: 266
    //                   72: 295
    //                   82: 342
    //                   90: 371
    //                   96: 400
    //                   106: 414;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (super.storeUnknownField(kwj1, l)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new ibb();
        }
        kwj1.a(a);
          goto _L14
_L4:
        if (b == null)
        {
            b = new ibn();
        }
        kwj1.a(b);
          goto _L14
_L5:
        if (c == null)
        {
            c = new iad();
        }
        kwj1.a(c);
          goto _L14
_L6:
        d = kwj1.j();
          goto _L14
_L7:
        int i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            e = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new lgx();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            g = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new hzd();
        }
        kwj1.a(h);
        continue; /* Loop/switch isn't completed */
_L11:
        if (i == null)
        {
            i = new ibe();
        }
        kwj1.a(i);
        continue; /* Loop/switch isn't completed */
_L12:
        j = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L13:
        if (k == null)
        {
            k = new inb();
        }
        kwj1.a(k);
        if (true) goto _L14; else goto _L15
_L15:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        if (c != null)
        {
            kwk1.b(4, c);
        }
        if (d != null)
        {
            kwk1.a(5, d);
        }
        if (e != null)
        {
            kwk1.a(6, e.intValue());
        }
        if (f != null)
        {
            kwk1.b(8, f);
        }
        if (g != null)
        {
            kwk1.a(9, g.intValue());
        }
        if (h != null)
        {
            kwk1.b(10, h);
        }
        if (i != null)
        {
            kwk1.b(11, i);
        }
        if (j != null)
        {
            kwk1.a(12, j.booleanValue());
        }
        if (k != null)
        {
            kwk1.b(13, k);
        }
        super.writeTo(kwk1);
    }
}
