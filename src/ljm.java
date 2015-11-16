// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljm extends kwm
{

    public Integer a;
    public String b;
    public String c;
    public lhc d;

    public ljm()
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
            i = j + kwk.e(1, a.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(2, d);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.b(4, c);
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
    //                   8: 67
    //                   18: 118
    //                   26: 147
    //                   34: 158;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (d == null)
        {
            d = new lhc();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L5:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        c = kwj1.j();
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (d != null)
        {
            kwk1.b(2, d);
        }
        if (b != null)
        {
            kwk1.a(3, b);
        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        super.writeTo(kwk1);
    }
}
