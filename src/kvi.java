// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kvi extends koj
{

    public int a;
    public byte b[];

    public kvi()
    {
        a = 0x80000000;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + koh.e(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
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
    //                   8: 51
    //                   18: 87;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kog1.k();
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(koh koh1)
    {
        if (a != 0x80000000)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        super.writeTo(koh1);
    }
}