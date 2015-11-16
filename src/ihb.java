// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihb extends kwm
{

    public Integer a;
    public Long b;
    public Long c;
    public kxx d[];
    public Integer e;
    public kyf f[];

    public ihb()
    {
        a = null;
        b = null;
        c = null;
        d = kxx.a();
        e = null;
        f = kyf.a();
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
            i = j + kwk.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    kxx kxx1 = d[j];
                    int l = i;
                    if (kxx1 != null)
                    {
                        l = i + kwk.d(4, kxx1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.e(5, e.intValue());
        }
        int i1 = i;
        if (f != null)
        {
            i1 = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    kyf kyf1 = f[k];
                    i1 = i;
                    if (kyf1 != null)
                    {
                        i1 = i + kwk.d(6, kyf1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L9:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   16: 138
    //                   24: 152
    //                   34: 166
    //                   40: 290
    //                   50: 304;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
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
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L5:
        c = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = kwx.a(kwj1, 34);
        kxx akxx[];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        akxx = new kxx[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, akxx, 0, k);
            i1 = k;
        }
        for (; i1 < akxx.length - 1; i1++)
        {
            akxx[i1] = new kxx();
            kwj1.a(akxx[i1]);
            kwj1.a();
        }

        akxx[i1] = new kxx();
        kwj1.a(akxx[i1]);
        d = akxx;
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kwx.a(kwj1, 50);
        kyf akyf[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        akyf = new kyf[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, akyf, 0, l);
            j1 = l;
        }
        for (; j1 < akyf.length - 1; j1++)
        {
            akyf[j1] = new kyf();
            kwj1.a(akyf[j1]);
            kwj1.a();
        }

        akyf[j1] = new kyf();
        kwj1.a(akyf[j1]);
        f = akyf;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        if (c != null)
        {
            kwk1.b(3, c.longValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                kxx kxx1 = d[i];
                if (kxx1 != null)
                {
                    kwk1.b(4, kxx1);
                }
            }

        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                kyf kyf1 = f[j];
                if (kyf1 != null)
                {
                    kwk1.b(6, kyf1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
