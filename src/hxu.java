// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxu extends kwm
{

    public String a;
    public String b;
    public Integer c;
    public String d;
    public Boolean e;
    public Integer f;

    public hxu()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.b(4, d);
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (kwk.f(5) + 1);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.e(6, f.intValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L9:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 94
    //                   24: 105
    //                   34: 119
    //                   40: 130
    //                   48: 144;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L9
_L4:
        b = kwj1.j();
          goto _L9
_L5:
        c = Integer.valueOf(kwj1.f());
          goto _L9
_L6:
        d = kwj1.j();
          goto _L9
_L7:
        e = Boolean.valueOf(kwj1.i());
          goto _L9
_L8:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 99: // 'c'
            f = Integer.valueOf(j);
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
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
            kwk1.a(3, c.intValue());
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
            kwk1.a(6, f.intValue());
        }
        super.writeTo(kwk1);
    }
}
