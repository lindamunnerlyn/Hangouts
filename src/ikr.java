// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikr extends kwm
{

    public Integer a;
    public int b;

    public ikr()
    {
        a = null;
        b = 0x80000000;
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
        if (b != 0x80000000)
        {
            j = i + kwk.e(2, b);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L5:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   16: 65;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(kwj1.f());
          goto _L5
_L4:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            b = j;
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != 0x80000000)
        {
            kwk1.a(2, b);
        }
        super.writeTo(kwk1);
    }
}
