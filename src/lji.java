// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lji extends kwm
{

    private static volatile lji d[];
    public Integer a;
    public ljf b;
    public ljf c[];

    public lji()
    {
        a = null;
        b = null;
        c = ljf.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lji[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new lji[0];
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
        int j = i;
        if (a != null)
        {
            j = i + kwk.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    ljf ljf1 = c[j];
                    int k = i;
                    if (ljf1 != null)
                    {
                        k = i + kwk.d(3, ljf1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L6:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 126
    //                   26: 155;
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
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new ljf();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kwx.a(kwj1, 26);
        ljf aljf[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        aljf = new ljf[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, aljf, 0, k);
            l = k;
        }
        for (; l < aljf.length - 1; l++)
        {
            aljf[l] = new ljf();
            kwj1.a(aljf[l]);
            kwj1.a();
        }

        aljf[l] = new ljf();
        kwj1.a(aljf[l]);
        c = aljf;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                ljf ljf1 = c[i];
                if (ljf1 != null)
                {
                    kwk1.b(3, ljf1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
