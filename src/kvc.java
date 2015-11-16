// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kvc extends koj
{

    public static final kok a = kok.a(kvc, 0x1660f49aL);
    private static final kvc d[] = new kvc[0];
    public Integer b;
    public kvb c;

    public kvc()
    {
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + koh.e(1, b.intValue());
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
    //                   18: 94;
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
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (c == null)
        {
            c = new kvb();
        }
        kog1.a(c);
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(1, b.intValue());
        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        super.writeTo(koh1);
    }

}
