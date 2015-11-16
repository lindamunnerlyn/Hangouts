// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iui extends kwm
{

    public iuj a[];
    public Integer b;
    public Integer c;
    public Integer d;
    public iub e;

    public iui()
    {
        a = iuj.a();
        b = null;
        c = null;
        d = null;
        e = null;
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
                    iuj iuj1 = a[k];
                    j = i;
                    if (iuj1 != null)
                    {
                        j = i + kwk.c(1, iuj1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(15, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.e(16, c.intValue());
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(17, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(18, e);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L8:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   11: 75
    //                   120: 201
    //                   128: 246
    //                   136: 260
    //                   146: 274;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int l = kwx.a(kwj1, 11);
        iuj aiuj[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        aiuj = new iuj[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, aiuj, 0, j);
            l = j;
        }
        for (; l < aiuj.length - 1; l++)
        {
            aiuj[l] = new iuj();
            kwj1.a(aiuj[l], 1);
            kwj1.a();
        }

        aiuj[l] = new iuj();
        kwj1.a(aiuj[l], 1);
        a = aiuj;
          goto _L8
_L4:
        int k = kwj1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            b = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        d = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new iub();
        }
        kwj1.a(e);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iuj iuj1 = a[i];
                if (iuj1 != null)
                {
                    kwk1.a(1, iuj1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(15, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(16, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(17, d.intValue());
        }
        if (e != null)
        {
            kwk1.b(18, e);
        }
        super.writeTo(kwk1);
    }
}
