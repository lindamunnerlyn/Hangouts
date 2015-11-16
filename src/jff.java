// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jff extends koj
{

    public Integer a;
    public Integer b;
    public Integer c;
    public Boolean d;

    public jff()
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
        if (b != null)
        {
            i = j + koh.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.e(3, c.intValue());
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (koh.f(4) + 1);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.e(21, a.intValue());
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L7:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   16: 67
    //                   24: 110
    //                   32: 166
    //                   168: 180;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = kog1.f();
        switch (k)
        {
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
            c = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L6:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = Integer.valueOf(l);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        if (a != null)
        {
            koh1.a(21, a.intValue());
        }
        super.writeTo(koh1);
    }
}
