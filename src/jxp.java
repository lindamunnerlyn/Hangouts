// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jxp extends koj
{

    public int a;
    public int b;
    public jxr c;
    public String d;

    public jxp()
    {
        a = 0x80000000;
        b = 0x80000000;
        c = null;
        d = null;
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
        if (c != null)
        {
            j = i + koh.d(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.b(3, d);
        }
        j = i;
        if (b != 0x80000000)
        {
            j = i + koh.e(4, b);
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
    //                   8: 67
    //                   18: 127
    //                   26: 156
    //                   32: 167;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
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
        case 6: // '\006'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (c == null)
        {
            c = new jxr();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L5:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            b = k;
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (a != 0x80000000)
        {
            koh1.a(1, a);
        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (b != 0x80000000)
        {
            koh1.a(4, b);
        }
        super.writeTo(koh1);
    }
}
