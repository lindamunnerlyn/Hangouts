// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ijw extends kwm
{

    public int a;
    public ikm b[];
    public Integer c;
    public String d;
    public ijr e[];

    public ijw()
    {
        a = 0x80000000;
        b = ikm.a();
        c = null;
        d = null;
        e = ijr.a();
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
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ikm ikm1 = b[j];
                    int l = i;
                    if (ikm1 != null)
                    {
                        l = i + kwk.d(2, ikm1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        int i1 = j;
        if (c != null)
        {
            i1 = j + kwk.e(3, c.intValue());
        }
        i = i1;
        if (d != null)
        {
            i = i1 + kwk.b(4, d);
        }
        i1 = i;
        if (e != null)
        {
            i1 = i;
            if (e.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= e.length)
                    {
                        break;
                    }
                    ijr ijr1 = e[k];
                    i1 = i;
                    if (ijr1 != null)
                    {
                        i1 = i + kwk.d(5, ijr1);
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
_L8:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   18: 383
    //                   24: 507
    //                   34: 521
    //                   42: 532;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 200: 
        case 201: 
        case 202: 
        case 203: 
        case 204: 
        case 205: 
        case 206: 
        case 207: 
        case 300: 
        case 401: 
        case 402: 
        case 500: 
        case 600: 
        case 601: 
        case 602: 
        case 603: 
        case 604: 
        case 605: 
        case 606: 
        case 700: 
        case 701: 
        case 800: 
        case 801: 
        case 802: 
        case 803: 
        case 900: 
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = kwx.a(kwj1, 18);
        ikm aikm[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aikm = new ikm[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aikm, 0, k);
            i1 = k;
        }
        for (; i1 < aikm.length - 1; i1++)
        {
            aikm[i1] = new ikm();
            kwj1.a(aikm[i1]);
            kwj1.a();
        }

        aikm[i1] = new ikm();
        kwj1.a(aikm[i1]);
        b = aikm;
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = kwx.a(kwj1, 42);
        ijr aijr[];
        int l;
        if (e == null)
        {
            l = 0;
        } else
        {
            l = e.length;
        }
        aijr = new ijr[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(e, 0, aijr, 0, l);
            j1 = l;
        }
        for (; j1 < aijr.length - 1; j1++)
        {
            aijr[j1] = new ijr();
            kwj1.a(aijr[j1]);
            kwj1.a();
        }

        aijr[j1] = new ijr();
        kwj1.a(aijr[j1]);
        e = aijr;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ikm ikm1 = b[i];
                if (ikm1 != null)
                {
                    kwk1.b(2, ikm1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                ijr ijr1 = e[j];
                if (ijr1 != null)
                {
                    kwk1.b(5, ijr1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
