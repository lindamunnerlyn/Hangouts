// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hvv extends koj
{

    private static volatile hvv j[];
    public hwc a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public String g[];
    public hxf h[];
    public Integer i;

    public hvv()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = kou.f;
        h = hxf.a();
        i = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hvv[] a()
    {
        if (j == null)
        {
            synchronized (kon.a)
            {
                if (j == null)
                {
                    j = new hvv[0];
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
        boolean flag = false;
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            k = l + koh.d(1, a);
        }
        l = k;
        if (b != null)
        {
            l = k + koh.b(2, b);
        }
        k = l;
        if (c != null)
        {
            k = l + koh.b(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + koh.b(4, d);
        }
        k = l;
        if (e != null)
        {
            k = l + koh.b(5, e);
        }
        l = k;
        if (f != null)
        {
            f.booleanValue();
            l = k + (koh.f(6) + 1);
        }
        k = l;
        if (g != null)
        {
            k = l;
            if (g.length > 0)
            {
                k = 0;
                int i1 = 0;
                int k1;
                int l1;
                for (k1 = 0; k < g.length; k1 = l1)
                {
                    String s = g[k];
                    int i2 = i1;
                    l1 = k1;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        i2 = i1 + koh.a(s);
                    }
                    k++;
                    i1 = i2;
                }

                k = l + i1 + k1 * 1;
            }
        }
        l = k;
        if (h != null)
        {
            l = k;
            if (h.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    l = k;
                    if (j1 >= h.length)
                    {
                        break;
                    }
                    hxf hxf1 = h[j1];
                    l = k;
                    if (hxf1 != null)
                    {
                        l = k + koh.d(8, hxf1);
                    }
                    j1++;
                    k = l;
                } while (true);
            }
        }
        k = l;
        if (i != null)
        {
            k = l + koh.e(9, i.intValue());
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
_L12:
        int k = kog1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 136
    //                   26: 147
    //                   34: 158
    //                   42: 169
    //                   48: 180
    //                   58: 194
    //                   66: 296
    //                   72: 420;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kog1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new hwc();
        }
        kog1.a(a);
          goto _L12
_L4:
        b = kog1.j();
          goto _L12
_L5:
        c = kog1.j();
          goto _L12
_L6:
        d = kog1.j();
          goto _L12
_L7:
        e = kog1.j();
          goto _L12
_L8:
        f = Boolean.valueOf(kog1.i());
          goto _L12
_L9:
        int k1 = kou.b(kog1, 58);
        String as[];
        int l;
        if (g == null)
        {
            l = 0;
        } else
        {
            l = g.length;
        }
        as = new String[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(g, 0, as, 0, l);
            k1 = l;
        }
        for (; k1 < as.length - 1; k1++)
        {
            as[k1] = kog1.j();
            kog1.a();
        }

        as[k1] = kog1.j();
        g = as;
          goto _L12
_L10:
        int l1 = kou.b(kog1, 66);
        hxf ahxf[];
        int i1;
        if (h == null)
        {
            i1 = 0;
        } else
        {
            i1 = h.length;
        }
        ahxf = new hxf[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(h, 0, ahxf, 0, i1);
            l1 = i1;
        }
        for (; l1 < ahxf.length - 1; l1++)
        {
            ahxf[l1] = new hxf();
            kog1.a(ahxf[l1]);
            kog1.a();
        }

        ahxf[l1] = new hxf();
        kog1.a(ahxf[l1]);
        h = ahxf;
          goto _L12
_L11:
        int j1 = kog1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            i = Integer.valueOf(j1);
            break;
        }
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f.booleanValue());
        }
        if (g != null && g.length > 0)
        {
            for (int k = 0; k < g.length; k++)
            {
                String s = g[k];
                if (s != null)
                {
                    koh1.a(7, s);
                }
            }

        }
        if (h != null && h.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < h.length; l++)
            {
                hxf hxf1 = h[l];
                if (hxf1 != null)
                {
                    koh1.b(8, hxf1);
                }
            }

        }
        if (i != null)
        {
            koh1.a(9, i.intValue());
        }
        super.writeTo(koh1);
    }
}
