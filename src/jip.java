// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jip extends kwm
{

    private static volatile jip h[];
    public Integer a;
    public jjo b;
    public jin c[];
    public jiq d[];
    public jiv e[];
    public jiu f[];
    public jim g;

    public jip()
    {
        a = null;
        b = null;
        c = jin.a();
        d = jiq.a();
        e = jiv.a();
        f = jiu.a();
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jip[] a()
    {
        if (h == null)
        {
            synchronized (kwq.a)
            {
                if (h == null)
                {
                    h = new jip[0];
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
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    jin jin1 = c[j];
                    int k = i;
                    if (jin1 != null)
                    {
                        k = i + kwk.d(3, jin1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        int l = j;
        if (d != null)
        {
            l = j;
            if (d.length > 0)
            {
                i = j;
                for (j = 0; j < d.length;)
                {
                    jiq jiq1 = d[j];
                    l = i;
                    if (jiq1 != null)
                    {
                        l = i + kwk.d(4, jiq1);
                    }
                    j++;
                    i = l;
                }

                l = i;
            }
        }
        i = l;
        if (e != null)
        {
            i = l;
            if (e.length > 0)
            {
                i = l;
                for (j = 0; j < e.length;)
                {
                    jiv jiv1 = e[j];
                    int i1 = i;
                    if (jiv1 != null)
                    {
                        i1 = i + kwk.d(5, jiv1);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (j1 >= f.length)
                    {
                        break;
                    }
                    jiu jiu1 = f[j1];
                    j = i;
                    if (jiu1 != null)
                    {
                        j = i + kwk.d(6, jiu1);
                    }
                    j1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.d(7, g);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L10:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   8: 91
    //                   18: 142
    //                   26: 171
    //                   34: 295
    //                   42: 419
    //                   50: 543
    //                   58: 667;
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
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new jjo();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = kwx.a(kwj1, 26);
        jin ajin[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ajin = new jin[k1 + k];
        k1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ajin, 0, k);
            k1 = k;
        }
        for (; k1 < ajin.length - 1; k1++)
        {
            ajin[k1] = new jin();
            kwj1.a(ajin[k1]);
            kwj1.a();
        }

        ajin[k1] = new jin();
        kwj1.a(ajin[k1]);
        c = ajin;
        continue; /* Loop/switch isn't completed */
_L6:
        int l1 = kwx.a(kwj1, 34);
        jiq ajiq[];
        int l;
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.length;
        }
        ajiq = new jiq[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(d, 0, ajiq, 0, l);
            l1 = l;
        }
        for (; l1 < ajiq.length - 1; l1++)
        {
            ajiq[l1] = new jiq();
            kwj1.a(ajiq[l1]);
            kwj1.a();
        }

        ajiq[l1] = new jiq();
        kwj1.a(ajiq[l1]);
        d = ajiq;
        continue; /* Loop/switch isn't completed */
_L7:
        int i2 = kwx.a(kwj1, 42);
        jiv ajiv[];
        int i1;
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        ajiv = new jiv[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, ajiv, 0, i1);
            i2 = i1;
        }
        for (; i2 < ajiv.length - 1; i2++)
        {
            ajiv[i2] = new jiv();
            kwj1.a(ajiv[i2]);
            kwj1.a();
        }

        ajiv[i2] = new jiv();
        kwj1.a(ajiv[i2]);
        e = ajiv;
        continue; /* Loop/switch isn't completed */
_L8:
        int j2 = kwx.a(kwj1, 50);
        jiu ajiu[];
        int j1;
        if (f == null)
        {
            j1 = 0;
        } else
        {
            j1 = f.length;
        }
        ajiu = new jiu[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(f, 0, ajiu, 0, j1);
            j2 = j1;
        }
        for (; j2 < ajiu.length - 1; j2++)
        {
            ajiu[j2] = new jiu();
            kwj1.a(ajiu[j2]);
            kwj1.a();
        }

        ajiu[j2] = new jiu();
        kwj1.a(ajiu[j2]);
        f = ajiu;
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new jim();
        }
        kwj1.a(g);
        if (true) goto _L10; else goto _L11
_L11:
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
            kwk1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jin jin1 = c[i];
                if (jin1 != null)
                {
                    kwk1.b(3, jin1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                jiq jiq1 = d[j];
                if (jiq1 != null)
                {
                    kwk1.b(4, jiq1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k = 0; k < e.length; k++)
            {
                jiv jiv1 = e[k];
                if (jiv1 != null)
                {
                    kwk1.b(5, jiv1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < f.length; l++)
            {
                jiu jiu1 = f[l];
                if (jiu1 != null)
                {
                    kwk1.b(6, jiu1);
                }
            }

        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        super.writeTo(kwk1);
    }
}
