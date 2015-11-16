// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kvd extends koj
{

    public static final kok a = kok.a(kvd, 0x1660f49aL);
    private static final kvd d[] = new kvd[0];
    public int b;
    public kva c;

    public kvd()
    {
        b = 0x80000000;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != 0x80000000)
        {
            i = j + koh.e(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(2, c);
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
    //                   18: 91;
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
        case 1: // '\001'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (c == null)
        {
            c = new kva();
        }
        kog1.a(c);
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(koh koh1)
    {
        if (b != 0x80000000)
        {
            koh1.a(1, b);
        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        super.writeTo(koh1);
    }

}
