// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jab extends koj
{

    public Integer a;
    public Long b;
    public Boolean c;

    public jab()
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
            i = j + koh.e(3, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.e(4, b.longValue());
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (koh.f(5) + 1);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L6:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   24: 59
    //                   32: 118
    //                   40: 132;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L5:
        c = Boolean.valueOf(kog1.i());
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(3, a.intValue());
        }
        if (b != null)
        {
            koh1.b(4, b.longValue());
        }
        if (c != null)
        {
            koh1.a(5, c.booleanValue());
        }
        super.writeTo(koh1);
    }
}
