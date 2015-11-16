// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kuw extends koj
{

    public String a;
    public int b;

    public kuw()
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != 0x80000000)
        {
            j = i + koh.e(2, b);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L5:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   10: 51
    //                   16: 62;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L5
_L4:
        int j = kog1.f();
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
        case 91756137: 
        case 91760736: 
        case 92366587: 
        case 95298271: 
        case 96372017: 
        case 98979821: 
        case 101530918: 
            b = j;
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != 0x80000000)
        {
            koh1.a(2, b);
        }
        super.writeTo(koh1);
    }
}
