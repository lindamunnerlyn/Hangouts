// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixt extends kwm
{

    public Integer a;
    public izm b;
    public Long c;
    public String d;
    public String e;
    public jax f[];
    public iyf g;
    public jau h;
    public Integer i;
    public jdk requestHeader;

    public ixt()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = jax.a();
        g = null;
        h = null;
        i = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (requestHeader != null)
        {
            j = k + kwk.d(1, requestHeader);
        }
        k = j;
        if (a != null)
        {
            k = j + kwk.e(2, a.intValue());
        }
        int l = k;
        if (c != null)
        {
            l = k + kwk.d(3, c.longValue());
        }
        j = l;
        if (d != null)
        {
            j = l + kwk.b(4, d);
        }
        k = j;
        if (f != null)
        {
            k = j;
            if (f.length > 0)
            {
                for (k = 0; k < f.length;)
                {
                    jax jax1 = f[k];
                    int i1 = j;
                    if (jax1 != null)
                    {
                        i1 = j + kwk.d(5, jax1);
                    }
                    k++;
                    j = i1;
                }

                k = j;
            }
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.d(11, g);
        }
        k = j;
        if (h != null)
        {
            k = j + kwk.d(12, h);
        }
        j = k;
        if (b != null)
        {
            j = k + kwk.d(13, b);
        }
        k = j;
        if (e != null)
        {
            k = j + kwk.b(14, e);
        }
        j = k;
        if (i != null)
        {
            j = k + kwk.e(15, i.intValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L13:
        int j = kwj1.a();
        j;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   16: 144
    //                   24: 190
    //                   34: 204
    //                   42: 215
    //                   90: 339
    //                   98: 368
    //                   106: 397
    //                   114: 426
    //                   120: 437;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kwj1, j)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
          goto _L13
_L4:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = Long.valueOf(kwj1.d());
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = kwx.a(kwj1, 42);
        jax ajax[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        ajax = new jax[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, ajax, 0, l);
            j1 = l;
        }
        for (; j1 < ajax.length - 1; j1++)
        {
            ajax[j1] = new jax();
            kwj1.a(ajax[j1]);
            kwj1.a();
        }

        ajax[j1] = new jax();
        kwj1.a(ajax[j1]);
        f = ajax;
        continue; /* Loop/switch isn't completed */
_L8:
        if (g == null)
        {
            g = new iyf();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L9:
        if (h == null)
        {
            h = new jau();
        }
        kwj1.a(h);
        continue; /* Loop/switch isn't completed */
_L10:
        if (b == null)
        {
            b = new izm();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L11:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        int i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            i = Integer.valueOf(i1);
            break;
        }
        if (true) goto _L13; else goto _L14
_L14:
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.a(2, a.intValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.longValue());
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (f != null && f.length > 0)
        {
            for (int j = 0; j < f.length; j++)
            {
                jax jax1 = f[j];
                if (jax1 != null)
                {
                    kwk1.b(5, jax1);
                }
            }

        }
        if (g != null)
        {
            kwk1.b(11, g);
        }
        if (h != null)
        {
            kwk1.b(12, h);
        }
        if (b != null)
        {
            kwk1.b(13, b);
        }
        if (e != null)
        {
            kwk1.a(14, e);
        }
        if (i != null)
        {
            kwk1.a(15, i.intValue());
        }
        super.writeTo(kwk1);
    }
}
