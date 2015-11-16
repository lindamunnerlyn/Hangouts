// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhh extends kwm
{

    public byte a[];
    public String b;
    public lhi c[];
    public lhi d;
    public lhc e;
    public Integer f;

    public lhh()
    {
        a = null;
        b = null;
        c = lhi.a();
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.b(1, a);
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
                    lhi lhi1 = c[j];
                    int k = i;
                    if (lhi1 != null)
                    {
                        k = i + kwk.d(3, lhi1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(5, e);
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.e(6, f.intValue());
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L9:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 94
    //                   26: 105
    //                   34: 229
    //                   42: 258
    //                   48: 287;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.k();
          goto _L9
_L4:
        b = kwj1.j();
          goto _L9
_L5:
        int l = kwx.a(kwj1, 26);
        lhi alhi[];
        int j;
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.length;
        }
        alhi = new lhi[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(c, 0, alhi, 0, j);
            l = j;
        }
        for (; l < alhi.length - 1; l++)
        {
            alhi[l] = new lhi();
            kwj1.a(alhi[l]);
            kwj1.a();
        }

        alhi[l] = new lhi();
        kwj1.a(alhi[l]);
        c = alhi;
          goto _L9
_L6:
        if (d == null)
        {
            d = new lhi();
        }
        kwj1.a(d);
          goto _L9
_L7:
        if (e == null)
        {
            e = new lhc();
        }
        kwj1.a(e);
          goto _L9
_L8:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = Integer.valueOf(k);
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                lhi lhi1 = c[i];
                if (lhi1 != null)
                {
                    kwk1.b(3, lhi1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f.intValue());
        }
        super.writeTo(kwk1);
    }
}
