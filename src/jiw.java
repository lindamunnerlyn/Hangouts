// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jiw extends kwm
{

    private static volatile jiw g[];
    public String a;
    public jip b[];
    public jip c[];
    public jjq d[];
    public String e[];
    public Integer f;

    public jiw()
    {
        a = null;
        b = jip.a();
        c = jip.a();
        d = jjq.a();
        e = kwx.f;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jiw[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new jiw[0];
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
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    jip jip1 = b[j];
                    int k = i;
                    if (jip1 != null)
                    {
                        k = i + kwk.d(3, jip1);
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
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (j = 0; j < c.length;)
                {
                    jip jip2 = c[j];
                    int l = i;
                    if (jip2 != null)
                    {
                        l = i + kwk.d(4, jip2);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    jjq jjq1 = d[j];
                    int i1 = i;
                    if (jjq1 != null)
                    {
                        i1 = i + kwk.d(5, jjq1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j;
            if (e.length > 0)
            {
                int j1 = 0;
                int k1 = 0;
                for (i = ((flag) ? 1 : 0); i < e.length;)
                {
                    String s = e[i];
                    int i2 = j1;
                    int l1 = k1;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        i2 = j1 + kwk.a(s);
                    }
                    i++;
                    j1 = i2;
                    k1 = l1;
                }

                i = j + j1 + k1 * 1;
            }
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.e(7, f.intValue());
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
    //                   10: 83
    //                   26: 94
    //                   34: 218
    //                   42: 342
    //                   50: 466
    //                   56: 568;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L9
_L4:
        int k1 = kwx.a(kwj1, 26);
        jip ajip[];
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.length;
        }
        ajip = new jip[k1 + j];
        k1 = j;
        if (j != 0)
        {
            System.arraycopy(b, 0, ajip, 0, j);
            k1 = j;
        }
        for (; k1 < ajip.length - 1; k1++)
        {
            ajip[k1] = new jip();
            kwj1.a(ajip[k1]);
            kwj1.a();
        }

        ajip[k1] = new jip();
        kwj1.a(ajip[k1]);
        b = ajip;
          goto _L9
_L5:
        int l1 = kwx.a(kwj1, 34);
        jip ajip1[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ajip1 = new jip[l1 + k];
        l1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ajip1, 0, k);
            l1 = k;
        }
        for (; l1 < ajip1.length - 1; l1++)
        {
            ajip1[l1] = new jip();
            kwj1.a(ajip1[l1]);
            kwj1.a();
        }

        ajip1[l1] = new jip();
        kwj1.a(ajip1[l1]);
        c = ajip1;
          goto _L9
_L6:
        int i2 = kwx.a(kwj1, 42);
        jjq ajjq[];
        int l;
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.length;
        }
        ajjq = new jjq[i2 + l];
        i2 = l;
        if (l != 0)
        {
            System.arraycopy(d, 0, ajjq, 0, l);
            i2 = l;
        }
        for (; i2 < ajjq.length - 1; i2++)
        {
            ajjq[i2] = new jjq();
            kwj1.a(ajjq[i2]);
            kwj1.a();
        }

        ajjq[i2] = new jjq();
        kwj1.a(ajjq[i2]);
        d = ajjq;
          goto _L9
_L7:
        int j2 = kwx.a(kwj1, 50);
        String as[];
        int i1;
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        as = new String[j2 + i1];
        j2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, as, 0, i1);
            j2 = i1;
        }
        for (; j2 < as.length - 1; j2++)
        {
            as[j2] = kwj1.j();
            kwj1.a();
        }

        as[j2] = kwj1.j();
        e = as;
          goto _L9
_L8:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
            f = Integer.valueOf(j1);
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jip jip1 = b[i];
                if (jip1 != null)
                {
                    kwk1.b(3, jip1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                jip jip2 = c[j];
                if (jip2 != null)
                {
                    kwk1.b(4, jip2);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = 0; k < d.length; k++)
            {
                jjq jjq1 = d[k];
                if (jjq1 != null)
                {
                    kwk1.b(5, jjq1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < e.length; l++)
            {
                String s = e[l];
                if (s != null)
                {
                    kwk1.a(6, s);
                }
            }

        }
        if (f != null)
        {
            kwk1.a(7, f.intValue());
        }
        super.writeTo(kwk1);
    }
}
