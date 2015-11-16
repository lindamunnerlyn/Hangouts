// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jea extends kwm
{

    public ixc a[];
    public iyi b;
    public Boolean c;
    public Integer d;
    public jdk requestHeader;

    public jea()
    {
        requestHeader = null;
        a = ixc.a();
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    ixc ixc1 = a[j];
                    int k = i;
                    if (ixc1 != null)
                    {
                        k = i + kwk.d(2, ixc1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(3, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(4) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(5, d.intValue());
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L8:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   18: 104
    //                   26: 228
    //                   32: 257
    //                   40: 271;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
          goto _L8
_L4:
        int l = kwx.a(kwj1, 18);
        ixc aixc[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        aixc = new ixc[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, aixc, 0, j);
            l = j;
        }
        for (; l < aixc.length - 1; l++)
        {
            aixc[l] = new ixc();
            kwj1.a(aixc[l]);
            kwj1.a();
        }

        aixc[l] = new ixc();
        kwj1.a(aixc[l]);
        a = aixc;
          goto _L8
_L5:
        if (b == null)
        {
            b = new iyi();
        }
        kwj1.a(b);
          goto _L8
_L6:
        c = Boolean.valueOf(kwj1.i());
          goto _L8
_L7:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = Integer.valueOf(k);
            break;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                ixc ixc1 = a[i];
                if (ixc1 != null)
                {
                    kwk1.b(2, ixc1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        if (c != null)
        {
            kwk1.a(4, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(5, d.intValue());
        }
        super.writeTo(kwk1);
    }
}
