// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kcf extends kwm
{

    private static volatile kcf e[];
    public int a;
    public kco b;
    public kcg c;
    public kch d;

    public kcf()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kcf[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new kcf[0];
                }
            }
        }
        return e;
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
            j = i + kwk.d(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(4, d);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   18: 131
    //                   26: 160
    //                   34: 189;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
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
        case 7: // '\007'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new kco();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new kcg();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new kch();
        }
        kwj1.a(d);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        super.writeTo(kwk1);
    }
}
