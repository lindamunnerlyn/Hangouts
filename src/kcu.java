// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kcu extends kwm
{

    private static volatile kcu d[];
    public int a;
    public Float b;
    public Float c;

    public kcu()
    {
        a = 0x80000000;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kcu[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new kcu[0];
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
        if (b != null)
        {
            b.floatValue();
            j = i + (kwk.f(2) + 4);
        }
        i = j;
        if (c != null)
        {
            c.floatValue();
            i = j + (kwk.f(3) + 4);
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
    //                   21: 103
    //                   29: 117;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Float.valueOf(kwj1.c());
        continue; /* Loop/switch isn't completed */
_L5:
        c = Float.valueOf(kwj1.c());
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.floatValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.floatValue());
        }
        super.writeTo(kwk1);
    }
}
