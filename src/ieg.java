// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ieg extends kwm
{

    private static volatile ieg b[];
    public int a;

    public ieg()
    {
        a = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ieg[] a()
    {
        if (b == null)
        {
            synchronized (kwq.a)
            {
                if (b == null)
                {
                    b = new ieg[0];
                }
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + kwk.e(1, a);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L4:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 2: default 32
    //                   0: 41
    //                   8: 43;
           goto _L1 _L2 _L3
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L4; else goto _L2
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
            a = j;
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
        }
        super.writeTo(kwk1);
    }
}
