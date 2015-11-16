// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzc extends koj
{

    private static volatile kzc h[];
    public kye a;
    public Boolean b;
    public String c;
    public Integer d;
    public kzc e[];
    public kzb f[];
    public Integer g;

    public kzc()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = a();
        f = kzb.a();
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kzc[] a()
    {
        if (h == null)
        {
            synchronized (kon.a)
            {
                if (h == null)
                {
                    h = new kzc[0];
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
            i = j + koh.d(1, a);
        }
        int k = i;
        if (c != null)
        {
            k = i + koh.b(2, c);
        }
        j = k;
        if (d != null)
        {
            j = k + koh.e(3, d.intValue());
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
                    kzc kzc1 = e[j];
                    int l = i;
                    if (kzc1 != null)
                    {
                        l = i + koh.d(4, kzc1);
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
                    kzb kzb1 = f[i1];
                    j = i;
                    if (kzb1 != null)
                    {
                        j = i + koh.d(5, kzb1);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (g != null)
        {
            i = j + koh.e(6, g.intValue());
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (koh.f(7) + 1);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L10:
        int i = kog1.a();
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
        if (super.storeUnknownField(kog1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new kye();
        }
        kog1.a(a);
          goto _L10
_L4:
        c = kog1.j();
          goto _L10
_L5:
        d = Integer.valueOf(kog1.f());
          goto _L10
_L6:
        int i1 = kou.b(kog1, 34);
        kzc akzc[];
        int j;
        if (e == null)
        {
            j = 0;
        } else
        {
            j = e.length;
        }
        akzc = new kzc[i1 + j];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(e, 0, akzc, 0, j);
            i1 = j;
        }
        for (; i1 < akzc.length - 1; i1++)
        {
            akzc[i1] = new kzc();
            kog1.a(akzc[i1]);
            kog1.a();
        }

        akzc[i1] = new kzc();
        kog1.a(akzc[i1]);
        e = akzc;
          goto _L10
_L7:
        int j1 = kou.b(kog1, 42);
        kzb akzb[];
        int k;
        if (f == null)
        {
            k = 0;
        } else
        {
            k = f.length;
        }
        akzb = new kzb[j1 + k];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(f, 0, akzb, 0, k);
            j1 = k;
        }
        for (; j1 < akzb.length - 1; j1++)
        {
            akzb[j1] = new kzb();
            kog1.a(akzb[j1]);
            kog1.a();
        }

        akzb[j1] = new kzb();
        kog1.a(akzb[j1]);
        f = akzb;
          goto _L10
_L8:
        int l = kog1.f();
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
        b = Boolean.valueOf(kog1.i());
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (d != null)
        {
            koh1.a(3, d.intValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                kzc kzc1 = e[i];
                if (kzc1 != null)
                {
                    koh1.b(4, kzc1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                kzb kzb1 = f[j];
                if (kzb1 != null)
                {
                    koh1.b(5, kzb1);
                }
            }

        }
        if (g != null)
        {
            koh1.a(6, g.intValue());
        }
        if (b != null)
        {
            koh1.a(7, b.booleanValue());
        }
        super.writeTo(koh1);
    }
}
