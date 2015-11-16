// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhw extends kwm
{

    public jhb a;
    public jax b[];
    public jhy c;
    public Boolean d;
    public Integer e;
    public String f;
    public jif g;
    public jdk requestHeader;

    public jhw()
    {
        requestHeader = null;
        a = null;
        b = jax.a();
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (requestHeader != null)
        {
            j = i + kwk.d(1, requestHeader);
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.d(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    jax jax1 = b[j];
                    int k = i;
                    if (jax1 != null)
                    {
                        k = i + kwk.d(3, jax1);
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
            i = j + kwk.d(4, c);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(5) + 1);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.e(6, e.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.b(7, f);
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.d(8, g);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L11:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   18: 128
    //                   26: 157
    //                   34: 281
    //                   40: 310
    //                   48: 324
    //                   58: 370
    //                   66: 381;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
          goto _L11
_L4:
        if (a == null)
        {
            a = new jhb();
        }
        kwj1.a(a);
          goto _L11
_L5:
        int l = kwx.a(kwj1, 26);
        jax ajax[];
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.length;
        }
        ajax = new jax[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(b, 0, ajax, 0, j);
            l = j;
        }
        for (; l < ajax.length - 1; l++)
        {
            ajax[l] = new jax();
            kwj1.a(ajax[l]);
            kwj1.a();
        }

        ajax[l] = new jax();
        kwj1.a(ajax[l]);
        b = ajax;
          goto _L11
_L6:
        if (c == null)
        {
            c = new jhy();
        }
        kwj1.a(c);
          goto _L11
_L7:
        d = Boolean.valueOf(kwj1.i());
          goto _L11
_L8:
        int k = kwj1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            e = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        if (g == null)
        {
            g = new jif();
        }
        kwj1.a(g);
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jax jax1 = b[i];
                if (jax1 != null)
                {
                    kwk1.b(3, jax1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(4, c);
        }
        if (d != null)
        {
            kwk1.a(5, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(6, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(7, f);
        }
        if (g != null)
        {
            kwk1.b(8, g);
        }
        super.writeTo(kwk1);
    }
}
