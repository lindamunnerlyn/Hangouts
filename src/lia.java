// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lia extends kwm
{

    public lhd a[];
    public Integer b;
    public Integer c;

    public lia()
    {
        a = lhd.a();
        b = null;
        c = null;
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
                    lhd lhd1 = a[k];
                    j = i;
                    if (lhd1 != null)
                    {
                        j = i + kwk.d(1, lhd1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.e(3, c.intValue());
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
    //                   10: 59
    //                   16: 183
    //                   24: 226;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int i1 = kwx.a(kwj1, 10);
        lhd alhd[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        alhd = new lhd[i1 + j];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, alhd, 0, j);
            i1 = j;
        }
        for (; i1 < alhd.length - 1; i1++)
        {
            alhd[i1] = new lhd();
            kwj1.a(alhd[i1]);
            kwj1.a();
        }

        alhd[i1] = new lhd();
        kwj1.a(alhd[i1]);
        a = alhd;
          goto _L6
_L4:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            b = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
            c = Integer.valueOf(l);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                lhd lhd1 = a[i];
                if (lhd1 != null)
                {
                    kwk1.b(1, lhd1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        super.writeTo(kwk1);
    }
}
