// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jmm extends kwm
{

    public static final kwn a = kwn.a(jmm, 0x2e58344aL);
    private static final jmm d[] = new jmm[0];
    public Integer b;
    public Integer c;

    public jmm()
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
            i = j + kwk.e(1, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.e(2, c.intValue());
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
    //                   16: 114;
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
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            c = Integer.valueOf(k);
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(2, c.intValue());
        }
        super.writeTo(kwk1);
    }

}
