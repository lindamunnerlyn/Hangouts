// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdt extends kwm
{

    public Integer a;
    public jbp b[];
    public iza c;
    public ixg d;
    public Long e;
    public String f;
    public byte g[];
    public jdl responseHeader;

    public jdt()
    {
        responseHeader = null;
        a = null;
        b = jbp.a();
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
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
        if (e != null)
        {
            j = i + kwk.d(2, e.longValue());
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.b(3, f);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    jbp jbp1 = b[j];
                    int k = i;
                    if (jbp1 != null)
                    {
                        k = i + kwk.d(4, jbp1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.b(5, g);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(6, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(7, d);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.e(8, a.intValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L11:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   16: 128
    //                   26: 142
    //                   34: 153
    //                   42: 277
    //                   50: 288
    //                   58: 317
    //                   64: 346;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new jdl();
        }
        kwj1.a(responseHeader);
          goto _L11
_L4:
        e = Long.valueOf(kwj1.d());
          goto _L11
_L5:
        f = kwj1.j();
          goto _L11
_L6:
        int l = kwx.a(kwj1, 34);
        jbp ajbp[];
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.length;
        }
        ajbp = new jbp[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(b, 0, ajbp, 0, j);
            l = j;
        }
        for (; l < ajbp.length - 1; l++)
        {
            ajbp[l] = new jbp();
            kwj1.a(ajbp[l]);
            kwj1.a();
        }

        ajbp[l] = new jbp();
        kwj1.a(ajbp[l]);
        b = ajbp;
          goto _L11
_L7:
        g = kwj1.k();
          goto _L11
_L8:
        if (c == null)
        {
            c = new iza();
        }
        kwj1.a(c);
          goto _L11
_L9:
        if (d == null)
        {
            d = new ixg();
        }
        kwj1.a(d);
          goto _L11
_L10:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            a = Integer.valueOf(k);
            break;
        }
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(kwk kwk1)
    {
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (e != null)
        {
            kwk1.a(2, e.longValue());
        }
        if (f != null)
        {
            kwk1.a(3, f);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jbp jbp1 = b[i];
                if (jbp1 != null)
                {
                    kwk1.b(4, jbp1);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(5, g);
        }
        if (c != null)
        {
            kwk1.b(6, c);
        }
        if (d != null)
        {
            kwk1.b(7, d);
        }
        if (a != null)
        {
            kwk1.a(8, a.intValue());
        }
        super.writeTo(kwk1);
    }
}
