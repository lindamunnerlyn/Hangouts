// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzu extends kwm
{

    public Long a;
    public String b;
    public int c;
    public String d;
    public Boolean e;
    public String f;
    public String g;
    public Boolean h;
    public Boolean i;
    public Boolean j;

    public kzu()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize() + kwk.e(1, a.longValue()) + kwk.b(2, b);
        int k = l;
        if (c != 0x80000000)
        {
            k = l + kwk.e(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + kwk.b(4, d);
        }
        k = l;
        if (e != null)
        {
            e.booleanValue();
            k = l + (kwk.f(5) + 1);
        }
        l = k;
        if (f != null)
        {
            l = k + kwk.b(6, f);
        }
        k = l;
        if (g != null)
        {
            k = l + kwk.b(7, g);
        }
        l = k;
        if (h != null)
        {
            h.booleanValue();
            l = k + (kwk.f(8) + 1);
        }
        k = l;
        if (i != null)
        {
            i.booleanValue();
            k = l + (kwk.f(9) + 1);
        }
        l = k;
        if (j != null)
        {
            j.booleanValue();
            l = k + (kwk.f(10) + 1);
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
    //                   18: 129
    //                   24: 140
    //                   34: 183
    //                   40: 194
    //                   50: 208
    //                   58: 219
    //                   64: 230
    //                   72: 244
    //                   80: 258;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        a = Long.valueOf(kwj1.e());
          goto _L13
_L4:
        b = kwj1.j();
          goto _L13
_L5:
        int l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = l;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L11:
        i = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L12:
        j = Boolean.valueOf(kwj1.i());
        if (true) goto _L13; else goto _L14
_L14:
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.b(1, a.longValue());
        kwk1.a(2, b);
        if (c != 0x80000000)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e.booleanValue());
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h.booleanValue());
        }
        if (i != null)
        {
            kwk1.a(9, i.booleanValue());
        }
        if (j != null)
        {
            kwk1.a(10, j.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
