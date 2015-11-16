// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jda extends kwm
{

    public Integer a;
    public String b;
    public String c;
    public String d;
    public Integer e;
    public jdl responseHeader;

    public jda()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
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
            j = i + kwk.e(2, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.b(5, c);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.e(6, e.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.b(7, d);
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
    //                   16: 112
    //                   26: 154
    //                   42: 165
    //                   48: 176
    //                   58: 190;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new jdl();
        }
        kwj1.a(responseHeader);
          goto _L9
_L4:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        d = kwj1.j();
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (a != null)
        {
            kwk1.a(2, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(3, b);
        }
        if (c != null)
        {
            kwk1.a(5, c);
        }
        if (e != null)
        {
            kwk1.a(6, e.intValue());
        }
        if (d != null)
        {
            kwk1.a(7, d);
        }
        super.writeTo(kwk1);
    }
}
