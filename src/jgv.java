// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jgv extends kwm
{

    private static volatile jgv l[];
    public String a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public String f[];
    public String g;
    public Integer h;
    public String i;
    public String j;
    public Integer k;

    public jgv()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = kwx.f;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jgv[] a()
    {
        if (l == null)
        {
            synchronized (kwq.a)
            {
                if (l == null)
                {
                    l = new jgv[0];
                }
            }
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.e(3, c.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                int k1 = 0;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < f.length;)
                {
                    String s = f[j1];
                    int j2 = k1;
                    int i2 = l1;
                    if (s != null)
                    {
                        i2 = l1 + 1;
                        j2 = k1 + kwk.a(s);
                    }
                    j1++;
                    k1 = j2;
                    l1 = i2;
                }

                j1 = i1 + k1 + l1 * 1;
            }
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.b(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.e(8, h.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.b(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.e(11, k.intValue());
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L14:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   10: 123
    //                   18: 134
    //                   24: 145
    //                   34: 190
    //                   42: 201
    //                   50: 212
    //                   58: 314
    //                   64: 325
    //                   74: 370
    //                   82: 381
    //                   88: 392;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L14
_L4:
        b = kwj1.j();
          goto _L14
_L5:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        int j2 = kwx.a(kwj1, 50);
        String as[];
        int k1;
        if (f == null)
        {
            k1 = 0;
        } else
        {
            k1 = f.length;
        }
        as = new String[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(f, 0, as, 0, k1);
            j2 = k1;
        }
        for (; j2 < as.length - 1; j2++)
        {
            as[j2] = kwj1.j();
            kwj1.a();
        }

        as[j2] = kwj1.j();
        f = as;
        continue; /* Loop/switch isn't completed */
_L9:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        int l1 = kwj1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L13:
        int i2 = kwj1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            k = Integer.valueOf(i2);
            break;
        }
        if (true) goto _L14; else goto _L15
_L15:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
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
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                String s = f[i1];
                if (s != null)
                {
                    kwk1.a(6, s);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(9, i);
        }
        if (j != null)
        {
            kwk1.a(10, j);
        }
        if (k != null)
        {
            kwk1.a(11, k.intValue());
        }
        super.writeTo(kwk1);
    }
}
