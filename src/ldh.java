// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ldh extends kwm
{

    public static final kwn a = kwn.a(ldh, 0x1660f49aL);
    private static final ldh d[] = new ldh[0];
    public int b;
    public lde c;

    public ldh()
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
            i = j + kwk.e(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(2, c);
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
    //                   18: 91;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
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
            c = new lde();
        }
        kwj1.a(c);
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(kwk kwk1)
    {
        if (b != 0x80000000)
        {
            kwk1.a(1, b);
        }
        if (c != null)
        {
            kwk1.b(2, c);
        }
        super.writeTo(kwk1);
    }

}
