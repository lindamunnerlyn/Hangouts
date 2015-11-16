// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iwk extends kwm
{

    public jaw a[];
    public iza b;
    public ixg c;
    public Integer d;
    public Long e;
    public String f;
    public jdl responseHeader;

    public iwk()
    {
        responseHeader = null;
        a = jaw.a();
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + kwk.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    jaw jaw1 = a[j];
                    int k = i;
                    if (jaw1 != null)
                    {
                        k = i + kwk.d(2, jaw1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(3, e.longValue());
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.b(4, f);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(5, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(6, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(8, d.intValue());
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L10:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   18: 120
    //                   24: 244
    //                   34: 258
    //                   42: 269
    //                   50: 298
    //                   64: 327;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new jdl();
        }
        kwj1.a(responseHeader);
          goto _L10
_L4:
        int l = kwx.a(kwj1, 18);
        jaw ajaw[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        ajaw = new jaw[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, ajaw, 0, j);
            l = j;
        }
        for (; l < ajaw.length - 1; l++)
        {
            ajaw[l] = new jaw();
            kwj1.a(ajaw[l]);
            kwj1.a();
        }

        ajaw[l] = new jaw();
        kwj1.a(ajaw[l]);
        a = ajaw;
          goto _L10
_L5:
        e = Long.valueOf(kwj1.d());
          goto _L10
_L6:
        f = kwj1.j();
          goto _L10
_L7:
        if (b == null)
        {
            b = new iza();
        }
        kwj1.a(b);
          goto _L10
_L8:
        if (c == null)
        {
            c = new ixg();
        }
        kwj1.a(c);
          goto _L10
_L9:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = Integer.valueOf(k);
            break;
        }
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(kwk kwk1)
    {
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                jaw jaw1 = a[i];
                if (jaw1 != null)
                {
                    kwk1.b(2, jaw1);
                }
            }

        }
        if (e != null)
        {
            kwk1.a(3, e.longValue());
        }
        if (f != null)
        {
            kwk1.a(4, f);
        }
        if (b != null)
        {
            kwk1.b(5, b);
        }
        if (c != null)
        {
            kwk1.b(6, c);
        }
        if (d != null)
        {
            kwk1.a(8, d.intValue());
        }
        super.writeTo(kwk1);
    }
}
