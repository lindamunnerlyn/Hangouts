// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhq extends kwm
{

    private static volatile lhq h[];
    public lgs a;
    public Boolean b;
    public String c;
    public Integer d;
    public lhq e[];
    public lhp f[];
    public Integer g;

    public lhq()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = a();
        f = lhp.a();
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lhq[] a()
    {
        if (h == null)
        {
            synchronized (kwq.a)
            {
                if (h == null)
                {
                    h = new lhq[0];
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
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        int k = i;
        if (c != null)
        {
            k = i + kwk.b(2, c);
        }
        j = k;
        if (d != null)
        {
            j = k + kwk.e(3, d.intValue());
        }
        i = j;
        if (e != null)
        {
            i = j;
            if (e.length > 0)
            {
                i = j;
                for (j = 0; j < e.length;)
                {
                    lhq lhq1 = e[j];
                    int l = i;
                    if (lhq1 != null)
                    {
                        l = i + kwk.d(4, lhq1);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= f.length)
                    {
                        break;
                    }
                    lhp lhp1 = f[i1];
                    j = i;
                    if (lhp1 != null)
                    {
                        j = i + kwk.d(5, lhp1);
                    }
                    i1++;
                    i = j;
                } while (true);
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
            b.booleanValue();
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
    //                   10: 91
    //                   18: 120
    //                   24: 131
    //                   34: 145
    //                   42: 269
    //                   48: 393
    //                   56: 438;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new lgs();
        }
        kwj1.a(a);
          goto _L10
_L4:
        c = kwj1.j();
          goto _L10
_L5:
        d = Integer.valueOf(kwj1.f());
          goto _L10
_L6:
        int i1 = kwx.a(kwj1, 34);
        lhq alhq[];
        int j;
        if (e == null)
        {
            j = 0;
        } else
        {
            j = e.length;
        }
        alhq = new lhq[i1 + j];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(e, 0, alhq, 0, j);
            i1 = j;
        }
        for (; i1 < alhq.length - 1; i1++)
        {
            alhq[i1] = new lhq();
            kwj1.a(alhq[i1]);
            kwj1.a();
        }

        alhq[i1] = new lhq();
        kwj1.a(alhq[i1]);
        e = alhq;
          goto _L10
_L7:
        int j1 = kwx.a(kwj1, 42);
        lhp alhp[];
        int k;
        if (f == null)
        {
            k = 0;
        } else
        {
            k = f.length;
        }
        alhp = new lhp[j1 + k];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(f, 0, alhp, 0, k);
            j1 = k;
        }
        for (; j1 < alhp.length - 1; j1++)
        {
            alhp[j1] = new lhp();
            kwj1.a(alhp[j1]);
            kwj1.a();
        }

        alhp[j1] = new lhp();
        kwj1.a(alhp[j1]);
        f = alhp;
          goto _L10
_L8:
        int l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            g = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        b = Boolean.valueOf(kwj1.i());
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (d != null)
        {
            kwk1.a(3, d.intValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                lhq lhq1 = e[i];
                if (lhq1 != null)
                {
                    kwk1.b(4, lhq1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                lhp lhp1 = f[j];
                if (lhp1 != null)
                {
                    kwk1.b(5, lhp1);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(6, g.intValue());
        }
        if (b != null)
        {
            kwk1.a(7, b.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
