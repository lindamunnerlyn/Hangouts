// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kaz extends kwm
{

    private static volatile kaz g[];
    public Integer a;
    public kbf b[];
    public Integer c;
    public kax d;
    public kbb e;
    public ltc f;

    public kaz()
    {
        a = null;
        b = kbf.a();
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kaz[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new kaz[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kbf kbf1 = b[j];
                    int k = i;
                    if (kbf1 != null)
                    {
                        k = i + kwk.d(3, kbf1);
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
            i = j + kwk.e(4, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(5, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(6, e);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.d(15, f);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L9:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   26: 158
    //                   32: 282
    //                   42: 296
    //                   50: 325
    //                   122: 354;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 17: // '\021'
        case 18: // '\022'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = kwx.a(kwj1, 26);
        kbf akbf[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        akbf = new kbf[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, akbf, 0, k);
            l = k;
        }
        for (; l < akbf.length - 1; l++)
        {
            akbf[l] = new kbf();
            kwj1.a(akbf[l]);
            kwj1.a();
        }

        akbf[l] = new kbf();
        kwj1.a(akbf[l]);
        b = akbf;
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new kax();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new kbb();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new ltc();
        }
        kwj1.a(f);
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kbf kbf1 = b[i];
                if (kbf1 != null)
                {
                    kwk1.b(3, kbf1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(4, c.intValue());
        }
        if (d != null)
        {
            kwk1.b(5, d);
        }
        if (e != null)
        {
            kwk1.b(6, e);
        }
        if (f != null)
        {
            kwk1.b(15, f);
        }
        super.writeTo(kwk1);
    }
}
