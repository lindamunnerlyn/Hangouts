// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jjo extends kwm
{

    public Integer a;
    public jjp b;
    public String c[];
    public String d;
    public String e;
    public jir f[];

    public jjo()
    {
        a = null;
        b = null;
        c = kwx.f;
        d = null;
        e = null;
        f = jir.a();
        unknownFieldData = null;
        cachedSize = -1;
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
                j = 0;
                int l = 0;
                int j1;
                int k1;
                for (j1 = 0; j < c.length; j1 = k1)
                {
                    String s = c[j];
                    int l1 = l;
                    k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = l + kwk.a(s);
                    }
                    j++;
                    l = l1;
                }

                j = i + l + j1 * 1;
            }
        }
        int i1 = j;
        if (d != null)
        {
            i1 = j + kwk.b(4, d);
        }
        i = i1;
        if (e != null)
        {
            i = i1 + kwk.b(5, e);
        }
        i1 = i;
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
                    jir jir1 = f[k];
                    i1 = i;
                    if (jir1 != null)
                    {
                        i1 = i + kwk.d(6, jir1);
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
    //                   18: 126
    //                   26: 155
    //                   34: 257
    //                   42: 268
    //                   50: 279;
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
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new jjp();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = kwx.a(kwj1, 26);
        String as[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        as = new String[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, as, 0, k);
            i1 = k;
        }
        for (; i1 < as.length - 1; i1++)
        {
            as[i1] = kwj1.j();
            kwj1.a();
        }

        as[i1] = kwj1.j();
        c = as;
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kwx.a(kwj1, 50);
        jir ajir[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        ajir = new jir[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, ajir, 0, l);
            j1 = l;
        }
        for (; j1 < ajir.length - 1; j1++)
        {
            ajir[j1] = new jir();
            kwj1.a(ajir[j1]);
            kwj1.a();
        }

        ajir[j1] = new jir();
        kwj1.a(ajir[j1]);
        f = ajir;
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
            kwk1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                String s = c[i];
                if (s != null)
                {
                    kwk1.a(3, s);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                jir jir1 = f[j];
                if (jir1 != null)
                {
                    kwk1.b(6, jir1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
