// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfn extends kwm
{

    public Integer a;
    public String b;
    public Integer c;

    public jfn()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.intValue());
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
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L6:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 106
    //                   24: 117;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            c = Integer.valueOf(k);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        super.writeTo(kwk1);
    }
}
