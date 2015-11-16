// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikz extends kwm
{

    public Integer a;
    public ila b[];

    public ikz()
    {
        a = null;
        b = ila.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ila ila1 = b[j];
                    int k = i;
                    if (ila1 != null)
                    {
                        k = i + kwk.d(2, ila1);
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
_L5:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   18: 98;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = kwx.a(kwj1, 18);
        ila aila[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aila = new ila[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aila, 0, k);
            l = k;
        }
        for (; l < aila.length - 1; l++)
        {
            aila[l] = new ila();
            kwj1.a(aila[l]);
            kwj1.a();
        }

        aila[l] = new ila();
        kwj1.a(aila[l]);
        b = aila;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ila ila1 = b[i];
                if (ila1 != null)
                {
                    kwk1.b(2, ila1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
