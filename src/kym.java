// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kym extends kwm
{

    public kyg a;
    public kxx b[];
    public kxx c;
    public Integer d;

    public kym()
    {
        a = null;
        b = kxx.a();
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kxx kxx1 = b[j];
                    int k = i;
                    if (kxx1 != null)
                    {
                        k = i + kwk.d(2, kxx1);
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
            i = j + kwk.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.e(4, d.intValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   18: 96
    //                   26: 220
    //                   32: 249;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new kyg();
        }
        kwj1.a(a);
          goto _L7
_L4:
        int l = kwx.a(kwj1, 18);
        kxx akxx[];
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.length;
        }
        akxx = new kxx[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(b, 0, akxx, 0, j);
            l = j;
        }
        for (; l < akxx.length - 1; l++)
        {
            akxx[l] = new kxx();
            kwj1.a(akxx[l]);
            kwj1.a();
        }

        akxx[l] = new kxx();
        kwj1.a(akxx[l]);
        b = akxx;
          goto _L7
_L5:
        if (c == null)
        {
            c = new kxx();
        }
        kwj1.a(c);
          goto _L7
_L6:
        int k = kwj1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            d = Integer.valueOf(k);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kxx kxx1 = b[i];
                if (kxx1 != null)
                {
                    kwk1.b(2, kxx1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        super.writeTo(kwk1);
    }
}
