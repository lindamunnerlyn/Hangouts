// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibg extends kwm
{

    public String a;
    public iiw b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public String f[];
    public Integer g;

    public ibg()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = kwx.f;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(2) + 1);
        }
        int k = j;
        if (d != null)
        {
            d.booleanValue();
            k = j + (kwk.f(3) + 1);
        }
        i = k;
        if (e != null)
        {
            e.booleanValue();
            i = k + (kwk.f(4) + 1);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < f.length;)
                {
                    String s = f[j];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + kwk.a(s);
                    }
                    j++;
                    l = k1;
                    i1 = j1;
                }

                j = i + l + i1 * 1;
            }
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.e(6, g.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.d(7, b);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L10:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   16: 102
    //                   24: 116
    //                   32: 130
    //                   42: 144
    //                   48: 246
    //                   58: 306;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L10
_L4:
        c = Boolean.valueOf(kwj1.i());
          goto _L10
_L5:
        d = Boolean.valueOf(kwj1.i());
          goto _L10
_L6:
        e = Boolean.valueOf(kwj1.i());
          goto _L10
_L7:
        int l = kwx.a(kwj1, 42);
        String as[];
        int j;
        if (f == null)
        {
            j = 0;
        } else
        {
            j = f.length;
        }
        as = new String[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(f, 0, as, 0, j);
            l = j;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = kwj1.j();
            kwj1.a();
        }

        as[l] = kwj1.j();
        f = as;
          goto _L10
_L8:
        int k = kwj1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            g = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (b == null)
        {
            b = new iiw();
        }
        kwj1.a(b);
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (c != null)
        {
            kwk1.a(2, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(3, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(4, e.booleanValue());
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                String s = f[i];
                if (s != null)
                {
                    kwk1.a(5, s);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(6, g.intValue());
        }
        if (b != null)
        {
            kwk1.b(7, b);
        }
        super.writeTo(kwk1);
    }
}
