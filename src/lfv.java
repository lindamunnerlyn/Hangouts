// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lfv extends kwm
{

    public static final kwn a = kwn.a(lfv, 0x15ec49c2L);
    private static final lfv e[] = new lfv[0];
    public String b;
    public lfu c[];
    public Integer d;

    public lfv()
    {
        b = null;
        c = lfu.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (d != null)
        {
            j = i + kwk.e(1, d.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    lfu lfu1 = c[j];
                    int k = i;
                    if (lfu1 != null)
                    {
                        k = i + kwk.d(3, lfu1);
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
    //                   18: 154
    //                   26: 165;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 400: 
        case 403: 
        case 404: 
        case 409: 
        case 410: 
        case 412: 
        case 500: 
        case 503: 
            d = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kwx.a(kwj1, 26);
        lfu alfu[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        alfu = new lfu[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, alfu, 0, k);
            l = k;
        }
        for (; l < alfu.length - 1; l++)
        {
            alfu[l] = new lfu();
            kwj1.a(alfu[l]);
            kwj1.a();
        }

        alfu[l] = new lfu();
        kwj1.a(alfu[l]);
        c = alfu;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        if (d != null)
        {
            kwk1.a(1, d.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                lfu lfu1 = c[i];
                if (lfu1 != null)
                {
                    kwk1.b(3, lfu1);
                }
            }

        }
        super.writeTo(kwk1);
    }

}
