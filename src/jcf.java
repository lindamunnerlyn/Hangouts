// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcf extends koj
{

    private static volatile jcf h[];
    public Integer a;
    public jdc b;
    public jcd c[];
    public jcg d[];
    public jcl e[];
    public jck f[];
    public jcc g;

    public jcf()
    {
        a = null;
        b = null;
        c = jcd.a();
        d = jcg.a();
        e = jcl.a();
        f = jck.a();
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jcf[] a()
    {
        if (h == null)
        {
            synchronized (kon.a)
            {
                if (h == null)
                {
                    h = new jcf[0];
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
            j = i + koh.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    jcd jcd1 = c[j];
                    int k = i;
                    if (jcd1 != null)
                    {
                        k = i + koh.d(3, jcd1);
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
                    jcg jcg1 = d[j];
                    l = i;
                    if (jcg1 != null)
                    {
                        l = i + koh.d(4, jcg1);
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
                    jcl jcl1 = e[j];
                    int i1 = i;
                    if (jcl1 != null)
                    {
                        i1 = i + koh.d(5, jcl1);
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
                    jck jck1 = f[j1];
                    j = i;
                    if (jck1 != null)
                    {
                        j = i + koh.d(6, jck1);
                    }
                    j1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (g != null)
        {
            i = j + koh.d(7, g);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L10:
        int i = kog1.a();
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
        if (super.storeUnknownField(kog1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
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
            b = new jdc();
        }
        kog1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = kou.b(kog1, 26);
        jcd ajcd[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ajcd = new jcd[k1 + k];
        k1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ajcd, 0, k);
            k1 = k;
        }
        for (; k1 < ajcd.length - 1; k1++)
        {
            ajcd[k1] = new jcd();
            kog1.a(ajcd[k1]);
            kog1.a();
        }

        ajcd[k1] = new jcd();
        kog1.a(ajcd[k1]);
        c = ajcd;
        continue; /* Loop/switch isn't completed */
_L6:
        int l1 = kou.b(kog1, 34);
        jcg ajcg[];
        int l;
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.length;
        }
        ajcg = new jcg[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(d, 0, ajcg, 0, l);
            l1 = l;
        }
        for (; l1 < ajcg.length - 1; l1++)
        {
            ajcg[l1] = new jcg();
            kog1.a(ajcg[l1]);
            kog1.a();
        }

        ajcg[l1] = new jcg();
        kog1.a(ajcg[l1]);
        d = ajcg;
        continue; /* Loop/switch isn't completed */
_L7:
        int i2 = kou.b(kog1, 42);
        jcl ajcl[];
        int i1;
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        ajcl = new jcl[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, ajcl, 0, i1);
            i2 = i1;
        }
        for (; i2 < ajcl.length - 1; i2++)
        {
            ajcl[i2] = new jcl();
            kog1.a(ajcl[i2]);
            kog1.a();
        }

        ajcl[i2] = new jcl();
        kog1.a(ajcl[i2]);
        e = ajcl;
        continue; /* Loop/switch isn't completed */
_L8:
        int j2 = kou.b(kog1, 50);
        jck ajck[];
        int j1;
        if (f == null)
        {
            j1 = 0;
        } else
        {
            j1 = f.length;
        }
        ajck = new jck[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(f, 0, ajck, 0, j1);
            j2 = j1;
        }
        for (; j2 < ajck.length - 1; j2++)
        {
            ajck[j2] = new jck();
            kog1.a(ajck[j2]);
            kog1.a();
        }

        ajck[j2] = new jck();
        kog1.a(ajck[j2]);
        f = ajck;
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new jcc();
        }
        kog1.a(g);
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jcd jcd1 = c[i];
                if (jcd1 != null)
                {
                    koh1.b(3, jcd1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                jcg jcg1 = d[j];
                if (jcg1 != null)
                {
                    koh1.b(4, jcg1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k = 0; k < e.length; k++)
            {
                jcl jcl1 = e[k];
                if (jcl1 != null)
                {
                    koh1.b(5, jcl1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < f.length; l++)
            {
                jck jck1 = f[l];
                if (jck1 != null)
                {
                    koh1.b(6, jck1);
                }
            }

        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        super.writeTo(koh1);
    }
}
