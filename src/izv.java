// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izv extends kwm
{

    public ixq a;
    public Boolean b;
    public Boolean c;
    public ize d;
    public ize e;
    public Integer f;
    public Integer g;
    public Boolean h;
    public jdk requestHeader;

    public izv()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(2, a);
        }
        i = j;
        if (b != null)
        {
            b.booleanValue();
            i = j + (kwk.f(3) + 1);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(4) + 1);
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.e(6, f.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(7, d);
        }
        i = j;
        if (h != null)
        {
            h.booleanValue();
            i = j + (kwk.f(8) + 1);
        }
        j = i;
        if (g != null)
        {
            j = i + kwk.e(9, g.intValue());
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(11, e);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L12:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 136
    //                   24: 165
    //                   32: 179
    //                   48: 193
    //                   58: 207
    //                   64: 236
    //                   72: 250
    //                   90: 294;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
          goto _L12
_L4:
        if (a == null)
        {
            a = new ixq();
        }
        kwj1.a(a);
          goto _L12
_L5:
        b = Boolean.valueOf(kwj1.i());
          goto _L12
_L6:
        c = Boolean.valueOf(kwj1.i());
          goto _L12
_L7:
        f = Integer.valueOf(kwj1.f());
          goto _L12
_L8:
        if (d == null)
        {
            d = new ize();
        }
        kwj1.a(d);
          goto _L12
_L9:
        h = Boolean.valueOf(kwj1.i());
          goto _L12
_L10:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            g = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (e == null)
        {
            e = new ize();
        }
        kwj1.a(e);
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (b != null)
        {
            kwk1.a(3, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(4, c.booleanValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.intValue());
        }
        if (d != null)
        {
            kwk1.b(7, d);
        }
        if (h != null)
        {
            kwk1.a(8, h.booleanValue());
        }
        if (g != null)
        {
            kwk1.a(9, g.intValue());
        }
        if (e != null)
        {
            kwk1.b(11, e);
        }
        super.writeTo(kwk1);
    }
}
