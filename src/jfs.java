// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfs extends kwm
{

    public Integer a;
    public izp b[];
    public byte c[];
    public jdl responseHeader;

    public jfs()
    {
        responseHeader = null;
        a = null;
        b = izp.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (responseHeader != null)
        {
            j = i + kwk.d(1, responseHeader);
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.e(2, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    izp izp1 = b[j];
                    int k = i;
                    if (izp1 != null)
                    {
                        k = i + kwk.d(3, izp1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(4, c);
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
    //                   16: 96
    //                   26: 138
    //                   34: 262;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new jdl();
        }
        kwj1.a(responseHeader);
          goto _L7
_L4:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kwx.a(kwj1, 26);
        izp aizp[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aizp = new izp[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aizp, 0, k);
            l = k;
        }
        for (; l < aizp.length - 1; l++)
        {
            aizp[l] = new izp();
            kwj1.a(aizp[l]);
            kwj1.a();
        }

        aizp[l] = new izp();
        kwj1.a(aizp[l]);
        b = aizp;
        continue; /* Loop/switch isn't completed */
_L6:
        c = kwj1.k();
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (a != null)
        {
            kwk1.a(2, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                izp izp1 = b[i];
                if (izp1 != null)
                {
                    kwk1.b(3, izp1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        super.writeTo(kwk1);
    }
}
