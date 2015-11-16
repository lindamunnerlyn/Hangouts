// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lfb extends kwm
{

    public leq a;
    public Integer b;
    public lfc c;
    public Integer d;
    public lev e[];

    public lfb()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = lev.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(5, b.intValue());
        }
        int k = j;
        if (c != null)
        {
            k = j + kwk.d(6, c);
        }
        i = k;
        if (d != null)
        {
            i = k + kwk.e(7, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    lev lev1 = e[j];
                    int l = i;
                    if (lev1 != null)
                    {
                        l = i + kwk.d(8, lev1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
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
    //                   18: 75
    //                   40: 104
    //                   50: 146
    //                   56: 175
    //                   66: 189;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new leq();
        }
        kwj1.a(a);
          goto _L8
_L4:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new lfc();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        d = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        int l = kwx.a(kwj1, 66);
        lev alev[];
        int k;
        if (e == null)
        {
            k = 0;
        } else
        {
            k = e.length;
        }
        alev = new lev[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(e, 0, alev, 0, k);
            l = k;
        }
        for (; l < alev.length - 1; l++)
        {
            alev[l] = new lev();
            kwj1.a(alev[l]);
            kwj1.a();
        }

        alev[l] = new lev();
        kwj1.a(alev[l]);
        e = alev;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (b != null)
        {
            kwk1.a(5, b.intValue());
        }
        if (c != null)
        {
            kwk1.b(6, c);
        }
        if (d != null)
        {
            kwk1.a(7, d.intValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                lev lev1 = e[i];
                if (lev1 != null)
                {
                    kwk1.b(8, lev1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
