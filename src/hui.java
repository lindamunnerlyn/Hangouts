// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hui extends kwm
{

    private static volatile hui d[];
    public int a;
    public int b;
    public String c;

    public hui()
    {
        a = 0x80000000;
        b = 0x80000000;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hui[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new hui[0];
                }
            }
        }
        return d;
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
        j = i;
        if (b != 0x80000000)
        {
            j = i + kwk.e(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(3, c);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L6:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   16: 107
    //                   26: 163;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = kwj1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            b = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = kwj1.j();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
        }
        if (b != 0x80000000)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        super.writeTo(kwk1);
    }
}
