// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class icl extends kwm
{

    private static volatile icl d[];
    public Integer a;
    public ich b[];
    public Boolean c;

    public icl()
    {
        a = null;
        b = ich.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static icl[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new icl[0];
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
        int i = super.computeSerializedSize();
        i = kwk.e(1, a.intValue()) + i;
        int j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    ich ich1 = b[k];
                    j = i;
                    if (ich1 != null)
                    {
                        j = i + kwk.d(2, ich1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (kwk.f(3) + 1);
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
    //                   18: 122
    //                   24: 246;
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
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = kwx.a(kwj1, 18);
        ich aich[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aich = new ich[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aich, 0, k);
            l = k;
        }
        for (; l < aich.length - 1; l++)
        {
            aich[l] = new ich();
            kwj1.a(aich[l]);
            kwj1.a();
        }

        aich[l] = new ich();
        kwj1.a(aich[l]);
        b = aich;
        continue; /* Loop/switch isn't completed */
_L5:
        c = Boolean.valueOf(kwj1.i());
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a.intValue());
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ich ich1 = b[i];
                if (ich1 != null)
                {
                    kwk1.b(2, ich1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
