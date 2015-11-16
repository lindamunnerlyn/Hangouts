// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jin extends kwm
{

    private static volatile jin i[];
    public Integer a;
    public String b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public jio h[];

    public jin()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = jio.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jin[] a()
    {
        if (i == null)
        {
            synchronized (kwq.a)
            {
                if (i == null)
                {
                    i = new jin[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + kwk.e(1, a.intValue());
        }
        k = j;
        if (b != null)
        {
            k = j + kwk.b(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.e(3, c.intValue());
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.e(4, d.intValue());
        }
        j = k;
        if (e != null)
        {
            j = k + kwk.e(5, e.intValue());
        }
        k = j;
        if (f != null)
        {
            k = j + kwk.e(6, f.intValue());
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.e(7, g.intValue());
        }
        k = j;
        if (h != null)
        {
            k = j;
            if (h.length > 0)
            {
                for (k = 0; k < h.length;)
                {
                    jio jio1 = h[k];
                    int l = j;
                    if (jio1 != null)
                    {
                        l = j + kwk.d(8, jio1);
                    }
                    k++;
                    j = l;
                }

                k = j;
            }
        }
        return k;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L11:
        int j = kwj1.a();
        j;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   8: 99
    //                   18: 113
    //                   24: 124
    //                   32: 174
    //                   40: 188
    //                   48: 202
    //                   56: 216
    //                   66: 230;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kwj1, j)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(kwj1.f());
          goto _L11
_L4:
        b = kwj1.j();
          goto _L11
_L5:
        int k = kwj1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            c = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        g = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L10:
        int i1 = kwx.a(kwj1, 66);
        jio ajio[];
        int l;
        if (h == null)
        {
            l = 0;
        } else
        {
            l = h.length;
        }
        ajio = new jio[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(h, 0, ajio, 0, l);
            i1 = l;
        }
        for (; i1 < ajio.length - 1; i1++)
        {
            ajio[i1] = new jio();
            kwj1.a(ajio[i1]);
            kwj1.a();
        }

        ajio[i1] = new jio();
        kwj1.a(ajio[i1]);
        h = ajio;
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(7, g.intValue());
        }
        if (h != null && h.length > 0)
        {
            for (int j = 0; j < h.length; j++)
            {
                jio jio1 = h[j];
                if (jio1 != null)
                {
                    kwk1.b(8, jio1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
