// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lku extends kwm
{

    private static volatile lku g[];
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public Integer e;
    public Long f;

    public lku()
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

    public static lku[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new lku[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
            c.booleanValue();
            i = j + (kwk.f(3) + 1);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(4) + 1);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.e(5, e.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.e(6, f.longValue());
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
    //                   32: 119
    //                   40: 133
    //                   48: 178;
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
        c = Boolean.valueOf(kwj1.i());
          goto _L9
_L6:
        d = Boolean.valueOf(kwj1.i());
          goto _L9
_L7:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            e = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        f = Long.valueOf(kwj1.e());
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
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.b(6, f.longValue());
        }
        super.writeTo(kwk1);
    }
}
