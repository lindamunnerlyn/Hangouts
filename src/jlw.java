// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jlw extends kwm
{

    public String a;
    public String b;
    public String c;
    public Integer d;
    public Long e;
    public Boolean f;
    public String g;
    public Integer h;
    public Boolean i;

    public jlw()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + kwk.b(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + kwk.b(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.b(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.e(4, d.intValue());
        }
        j = k;
        if (e != null)
        {
            j = k + kwk.e(5, e.longValue());
        }
        k = j;
        if (f != null)
        {
            f.booleanValue();
            k = j + (kwk.f(6) + 1);
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.b(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + kwk.e(8, h.intValue());
        }
        j = k;
        if (i != null)
        {
            i.booleanValue();
            j = k + (kwk.f(9) + 1);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L12:
        int j = kwj1.a();
        j;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 118
    //                   26: 129
    //                   32: 140
    //                   40: 186
    //                   48: 200
    //                   58: 214
    //                   64: 225
    //                   72: 270;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, j)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L12
_L4:
        b = kwj1.j();
          goto _L12
_L5:
        c = kwj1.j();
          goto _L12
_L6:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        e = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L9:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        int l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        i = Boolean.valueOf(kwj1.i());
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
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
            kwk1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(9, i.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
