// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ldb extends kwm
{

    public String a;
    public Integer b;

    public ldb()
    {
        a = null;
        b = null;
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
            j = i + kwk.e(2, b.intValue());
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
    //                   10: 51
    //                   16: 62;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L5
_L4:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 73046798: 
        case 73046859: 
        case 73046960: 
        case 73047122: 
        case 73063113: 
        case 77630322: 
        case 78631618: 
        case 89449585: 
        case 91688171: 
        case 95298271: 
        case 96372017: 
        case 98979821: 
        case 101530918: 
        case 103685814: 
        case 103903807: 
        case 104208012: 
        case 104316901: 
        case 104320496: 
        case 105019679: 
            b = Integer.valueOf(j);
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        super.writeTo(kwk1);
    }
}
