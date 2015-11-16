// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lay extends kwm
{

    public lbc a[];
    public Long b;
    public lax c;
    public int d;
    public laz e;

    public lay()
    {
        a = lbc.a();
        b = null;
        c = null;
        d = 0x80000000;
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
                    lbc lbc1 = a[k];
                    j = i;
                    if (lbc1 != null)
                    {
                        j = i + kwk.d(1, lbc1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(3, c);
        }
        i = j;
        if (d != 0x80000000)
        {
            i = j + kwk.e(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(5, e);
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
    //                   10: 75
    //                   16: 199
    //                   26: 213
    //                   32: 242
    //                   42: 291;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int l = kwx.a(kwj1, 10);
        lbc albc[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        albc = new lbc[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, albc, 0, j);
            l = j;
        }
        for (; l < albc.length - 1; l++)
        {
            albc[l] = new lbc();
            kwj1.a(albc[l]);
            kwj1.a();
        }

        albc[l] = new lbc();
        kwj1.a(albc[l]);
        a = albc;
          goto _L8
_L4:
        b = Long.valueOf(kwj1.e());
          goto _L8
_L5:
        if (c == null)
        {
            c = new lax();
        }
        kwj1.a(c);
          goto _L8
_L6:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new laz();
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
                lbc lbc1 = a[i];
                if (lbc1 != null)
                {
                    kwk1.b(1, lbc1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != 0x80000000)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        super.writeTo(kwk1);
    }
}
