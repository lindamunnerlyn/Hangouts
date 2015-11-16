// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jlc extends kwm
{

    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Integer d;
    public Long e;
    public String f;
    public Boolean g;
    public Long h;
    public Long i;
    public Long j;

    public jlc()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            a.booleanValue();
            k = l + (kwk.f(1) + 1);
        }
        l = k;
        if (b != null)
        {
            b.booleanValue();
            l = k + (kwk.f(2) + 1);
        }
        k = l;
        if (c != null)
        {
            c.booleanValue();
            k = l + (kwk.f(3) + 1);
        }
        l = k;
        if (d != null)
        {
            l = k + kwk.e(4, d.intValue());
        }
        k = l;
        if (e != null)
        {
            k = l + kwk.e(5, e.longValue());
        }
        l = k;
        if (f != null)
        {
            l = k + kwk.b(6, f);
        }
        k = l;
        if (g != null)
        {
            g.booleanValue();
            k = l + (kwk.f(7) + 1);
        }
        l = k;
        if (h != null)
        {
            l = k + kwk.e(8, h.longValue());
        }
        k = l;
        if (i != null)
        {
            k = l + kwk.e(9, i.longValue());
        }
        l = k;
        if (j != null)
        {
            l = k + kwk.e(10, j.longValue());
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L13:
        int k = kwj1.a();
        k;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   8: 115
    //                   16: 129
    //                   24: 143
    //                   32: 157
    //                   40: 210
    //                   50: 224
    //                   56: 235
    //                   64: 249
    //                   72: 263
    //                   80: 277;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kwj1.i());
          goto _L13
_L4:
        b = Boolean.valueOf(kwj1.i());
          goto _L13
_L5:
        c = Boolean.valueOf(kwj1.i());
          goto _L13
_L6:
        int l = kwj1.f();
        switch (l)
        {
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
            d = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        e = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L8:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        g = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L10:
        h = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L11:
        i = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L12:
        j = Long.valueOf(kwj1.e());
        if (true) goto _L13; else goto _L14
_L14:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null)
        {
            kwk1.b(5, e.longValue());
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            kwk1.b(8, h.longValue());
        }
        if (i != null)
        {
            kwk1.b(9, i.longValue());
        }
        if (j != null)
        {
            kwk1.b(10, j.longValue());
        }
        super.writeTo(kwk1);
    }
}
