// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jep extends kwm
{

    public ixl a;
    public jce b;
    public Long c;
    public Integer d;

    public jep()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.e(4, d.intValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   18: 96
    //                   24: 125
    //                   32: 139;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new ixl();
        }
        kwj1.a(a);
          goto _L7
_L4:
        if (b == null)
        {
            b = new jce();
        }
        kwj1.a(b);
          goto _L7
_L5:
        c = Long.valueOf(kwj1.d());
          goto _L7
_L6:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = Integer.valueOf(j);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.longValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        super.writeTo(kwk1);
    }
}
