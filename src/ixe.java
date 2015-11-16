// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixe extends kwm
{

    public ixc a[];
    public iyi b;
    public Boolean c;
    public Integer d;

    public ixe()
    {
        a = ixc.a();
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    ixc ixc1 = a[k];
                    j = i;
                    if (ixc1 != null)
                    {
                        j = i + kwk.d(1, ixc1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(3) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(4, d.intValue());
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   18: 191
    //                   24: 220
    //                   32: 234;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int l = kwx.a(kwj1, 10);
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
          goto _L7
_L4:
        if (b == null)
        {
            b = new iyi();
        }
        kwj1.a(b);
          goto _L7
_L5:
        c = Boolean.valueOf(kwj1.i());
          goto _L7
_L6:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = Integer.valueOf(k);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                ixc ixc1 = a[i];
                if (ixc1 != null)
                {
                    kwk1.b(1, ixc1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        super.writeTo(kwk1);
    }
}
