// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzy extends kwm
{

    private static volatile kzy h[];
    public String a;
    public String b;
    public String c[];
    public int d;
    public String e;
    public String f;
    public String g;

    public kzy()
    {
        a = null;
        b = null;
        c = kwx.f;
        d = 0x80000000;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kzy[] a()
    {
        if (h == null)
        {
            synchronized (kwq.a)
            {
                if (h == null)
                {
                    h = new kzy[0];
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
            j = i + kwk.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < c.length;)
                {
                    String s = c[j];
                    int j1 = k;
                    int i1 = l;
                    if (s != null)
                    {
                        i1 = l + 1;
                        j1 = k + kwk.a(s);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        i = j;
        if (d != 0x80000000)
        {
            i = j + kwk.e(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.b(5, e);
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.b(6, f);
        }
        j = i;
        if (g != null)
        {
            j = i + kwk.b(7, g);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L10:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   18: 102
    //                   26: 113
    //                   32: 215
    //                   42: 259
    //                   50: 270
    //                   58: 281;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L10
_L4:
        b = kwj1.j();
          goto _L10
_L5:
        int l = kwx.a(kwj1, 26);
        String as[];
        int j;
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.length;
        }
        as = new String[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(c, 0, as, 0, j);
            l = j;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = kwj1.j();
            kwj1.a();
        }

        as[l] = kwj1.j();
        c = as;
          goto _L10
_L6:
        int k = kwj1.f();
        switch (k)
        {
        case 1: // '\001'
        case 3: // '\003'
            d = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        g = kwj1.j();
        if (true) goto _L10; else goto _L11
_L11:
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
        if (d != 0x80000000)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        super.writeTo(kwk1);
    }
}
