// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hza extends kwm
{

    private static volatile hza j[];
    public Integer a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public hza f[];
    public String g;
    public String h;
    public Integer i;

    public hza()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = a();
        g = null;
        h = null;
        i = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hza[] a()
    {
        if (j == null)
        {
            synchronized (kwq.a)
            {
                if (j == null)
                {
                    j = new hza[0];
                }
            }
        }
        return j;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            k = l + kwk.e(1, a.intValue());
        }
        l = k;
        if (b != null)
        {
            l = k + kwk.b(2, b);
        }
        k = l;
        if (c != null)
        {
            k = l + kwk.b(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + kwk.b(4, d);
        }
        k = l;
        if (e != null)
        {
            e.booleanValue();
            k = l + (kwk.f(5) + 1);
        }
        l = k;
        if (f != null)
        {
            l = k;
            if (f.length > 0)
            {
                for (l = 0; l < f.length;)
                {
                    hza hza1 = f[l];
                    int i1 = k;
                    if (hza1 != null)
                    {
                        i1 = k + kwk.d(6, hza1);
                    }
                    l++;
                    k = i1;
                }

                l = k;
            }
        }
        k = l;
        if (g != null)
        {
            k = l + kwk.b(7, g);
        }
        l = k;
        if (h != null)
        {
            l = k + kwk.b(8, h);
        }
        k = l;
        if (i != null)
        {
            k = l + kwk.e(9, i.intValue());
        }
        return k;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L12:
        int k = kwj1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   8: 107
    //                   18: 186
    //                   26: 197
    //                   34: 208
    //                   40: 219
    //                   50: 233
    //                   58: 357
    //                   66: 368
    //                   72: 379;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int l = kwj1.f();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
            a = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = kwx.a(kwj1, 50);
        hza ahza[];
        int i1;
        if (f == null)
        {
            i1 = 0;
        } else
        {
            i1 = f.length;
        }
        ahza = new hza[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(f, 0, ahza, 0, i1);
            j1 = i1;
        }
        for (; j1 < ahza.length - 1; j1++)
        {
            ahza[j1] = new hza();
            kwj1.a(ahza[j1]);
            kwj1.a();
        }

        ahza[j1] = new hza();
        kwj1.a(ahza[j1]);
        f = ahza;
        continue; /* Loop/switch isn't completed */
_L9:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        i = Integer.valueOf(kwj1.f());
        if (true) goto _L12; else goto _L13
_L13:
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
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e.booleanValue());
        }
        if (f != null && f.length > 0)
        {
            for (int k = 0; k < f.length; k++)
            {
                hza hza1 = f[k];
                if (hza1 != null)
                {
                    kwk1.b(6, hza1);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.a(9, i.intValue());
        }
        super.writeTo(kwk1);
    }
}
