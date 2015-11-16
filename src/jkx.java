// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jkx extends kwm
{

    private static volatile jkx k[];
    public String a;
    public Long b;
    public Integer c;
    public Long d;
    public Long e;
    public Long f;
    public String g;
    public String h;
    public jky i[];
    public String j;

    public jkx()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = jky.a();
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jkx[] a()
    {
        if (k == null)
        {
            synchronized (kwq.a)
            {
                if (k == null)
                {
                    k = new jkx[0];
                }
            }
        }
        return k;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int l = i1;
        if (a != null)
        {
            l = i1 + kwk.b(1, a);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + kwk.e(2, b.longValue());
        }
        l = i1;
        if (c != null)
        {
            l = i1 + kwk.e(4, c.intValue());
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + kwk.e(5, d.longValue());
        }
        l = i1;
        if (e != null)
        {
            l = i1 + kwk.e(6, e.longValue());
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + kwk.e(7, f.longValue());
        }
        int j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(8, g);
        }
        l = j1;
        if (h != null)
        {
            l = j1 + kwk.b(9, h);
        }
        i1 = l;
        if (i != null)
        {
            i1 = l;
            if (i.length > 0)
            {
                for (i1 = 0; i1 < i.length;)
                {
                    jky jky1 = i[i1];
                    int k1 = l;
                    if (jky1 != null)
                    {
                        k1 = l + kwk.d(10, jky1);
                    }
                    i1++;
                    l = k1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (j != null)
        {
            l = i1 + kwk.b(11, j);
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L13:
        int l = kwj1.a();
        l;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   16: 126
    //                   32: 140
    //                   40: 190
    //                   48: 204
    //                   56: 218
    //                   66: 232
    //                   74: 243
    //                   82: 254
    //                   90: 378;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kwj1, l)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L13
_L4:
        b = Long.valueOf(kwj1.e());
          goto _L13
_L5:
        int i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            c = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L7:
        e = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L9:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        int k1 = kwx.a(kwj1, 82);
        jky ajky[];
        int j1;
        if (i == null)
        {
            j1 = 0;
        } else
        {
            j1 = i.length;
        }
        ajky = new jky[k1 + j1];
        k1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(i, 0, ajky, 0, j1);
            k1 = j1;
        }
        for (; k1 < ajky.length - 1; k1++)
        {
            ajky[k1] = new jky();
            kwj1.a(ajky[k1]);
            kwj1.a();
        }

        ajky[k1] = new jky();
        kwj1.a(ajky[k1]);
        i = ajky;
        continue; /* Loop/switch isn't completed */
_L12:
        j = kwj1.j();
        if (true) goto _L13; else goto _L14
_L14:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b.longValue());
        }
        if (c != null)
        {
            kwk1.a(4, c.intValue());
        }
        if (d != null)
        {
            kwk1.b(5, d.longValue());
        }
        if (e != null)
        {
            kwk1.b(6, e.longValue());
        }
        if (f != null)
        {
            kwk1.b(7, f.longValue());
        }
        if (g != null)
        {
            kwk1.a(8, g);
        }
        if (h != null)
        {
            kwk1.a(9, h);
        }
        if (i != null && i.length > 0)
        {
            for (int l = 0; l < i.length; l++)
            {
                jky jky1 = i[l];
                if (jky1 != null)
                {
                    kwk1.b(10, jky1);
                }
            }

        }
        if (j != null)
        {
            kwk1.a(11, j);
        }
        super.writeTo(kwk1);
    }
}
