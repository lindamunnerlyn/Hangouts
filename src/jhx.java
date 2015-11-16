// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhx extends kwm
{

    public String a;
    public Integer b;
    public String c;
    public jif d;
    public jdl responseHeader;

    public jhx()
    {
        responseHeader = null;
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
        if (responseHeader != null)
        {
            i = j + kwk.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.b(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(3, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.b(4, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(5, d);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L8:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   18: 104
    //                   24: 115
    //                   34: 162
    //                   42: 173;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new jdl();
        }
        kwj1.a(responseHeader);
          goto _L8
_L4:
        a = kwj1.j();
          goto _L8
_L5:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        if (d == null)
        {
            d = new jif();
        }
        kwj1.a(d);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(kwk kwk1)
    {
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (a != null)
        {
            kwk1.a(2, a);
        }
        if (b != null)
        {
            kwk1.a(3, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        if (d != null)
        {
            kwk1.b(5, d);
        }
        super.writeTo(kwk1);
    }
}
