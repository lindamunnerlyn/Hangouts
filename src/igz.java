// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igz extends kwm
{

    public int a;
    public Long b;
    public Long c;
    public kxw d[];
    public Integer e;
    public kxt f[];

    public igz()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = kxw.a();
        e = null;
        f = kxt.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + kwk.e(1, a);
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
                    kxw kxw1 = d[j];
                    int l = i;
                    if (kxw1 != null)
                    {
                        l = i + kwk.d(4, kxw1);
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
                    kxt kxt1 = f[k];
                    i1 = i;
                    if (kxt1 != null)
                    {
                        i1 = i + kwk.d(6, kxt1);
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
    //                   16: 135
    //                   24: 149
    //                   34: 163
    //                   40: 287
    //                   50: 301;
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
            a = j;
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
        kxw akxw[];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        akxw = new kxw[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, akxw, 0, k);
            i1 = k;
        }
        for (; i1 < akxw.length - 1; i1++)
        {
            akxw[i1] = new kxw();
            kwj1.a(akxw[i1]);
            kwj1.a();
        }

        akxw[i1] = new kxw();
        kwj1.a(akxw[i1]);
        d = akxw;
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kwx.a(kwj1, 50);
        kxt akxt[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        akxt = new kxt[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, akxt, 0, l);
            j1 = l;
        }
        for (; j1 < akxt.length - 1; j1++)
        {
            akxt[j1] = new kxt();
            kwj1.a(akxt[j1]);
            kwj1.a();
        }

        akxt[j1] = new kxt();
        kwj1.a(akxt[j1]);
        f = akxt;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
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
                kxw kxw1 = d[i];
                if (kxw1 != null)
                {
                    kwk1.b(4, kxw1);
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
                kxt kxt1 = f[j];
                if (kxt1 != null)
                {
                    kwk1.b(6, kxt1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
