// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyg extends kwm
{

    private static volatile kyg h[];
    public Integer a;
    public Integer b;
    public kyf c[];
    public Boolean d;
    public Integer e;
    public String f;
    public Boolean g;

    public kyg()
    {
        a = null;
        b = null;
        c = kyf.a();
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kyg[] a()
    {
        if (h == null)
        {
            synchronized (kwq.a)
            {
                if (h == null)
                {
                    h = new kyg[0];
                }
            }
        }
        return h;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    kyf kyf1 = c[j];
                    int k = i;
                    if (kyf1 != null)
                    {
                        k = i + kwk.d(3, kyf1);
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
            d.booleanValue();
            i = j + (kwk.f(4) + 1);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.e(5, e.intValue());
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.b(6, f);
        }
        j = i;
        if (g != null)
        {
            g.booleanValue();
            j = i + (kwk.f(7) + 1);
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
    //                   8: 91
    //                   16: 154
    //                   26: 168
    //                   32: 292
    //                   40: 306
    //                   50: 320
    //                   56: 331;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kwx.a(kwj1, 26);
        kyf akyf[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        akyf = new kyf[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, akyf, 0, k);
            l = k;
        }
        for (; l < akyf.length - 1; l++)
        {
            akyf[l] = new kyf();
            kwj1.a(akyf[l]);
            kwj1.a();
        }

        akyf[l] = new kyf();
        kwj1.a(akyf[l]);
        c = akyf;
        continue; /* Loop/switch isn't completed */
_L6:
        d = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        g = Boolean.valueOf(kwj1.i());
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kyf kyf1 = c[i];
                if (kyf1 != null)
                {
                    kwk1.b(3, kyf1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
