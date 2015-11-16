// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ifh extends kwm
{

    public String a;
    public int b;
    public ifi c[];
    public Long d;
    public ifd e;
    public String f;
    public Boolean g;
    public ifi h;
    public int i;
    public ifi j[];
    public int k[];

    public ifh()
    {
        a = null;
        b = 0x80000000;
        c = ifi.a();
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = 0x80000000;
        j = ifi.a();
        k = kwx.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int i1 = l;
        if (a != null)
        {
            i1 = l + kwk.b(1, a);
        }
        l = i1;
        if (b != 0x80000000)
        {
            l = i1 + kwk.e(2, b);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l;
            if (c.length > 0)
            {
                for (i1 = 0; i1 < c.length;)
                {
                    ifi ifi1 = c[i1];
                    int j1 = l;
                    if (ifi1 != null)
                    {
                        j1 = l + kwk.d(3, ifi1);
                    }
                    i1++;
                    l = j1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (d != null)
        {
            l = i1 + kwk.e(4, d.longValue());
        }
        i1 = l;
        if (e != null)
        {
            i1 = l + kwk.d(5, e);
        }
        l = i1;
        if (f != null)
        {
            l = i1 + kwk.b(6, f);
        }
        i1 = l;
        if (g != null)
        {
            g.booleanValue();
            i1 = l + (kwk.f(7) + 1);
        }
        int k1 = i1;
        if (h != null)
        {
            k1 = i1 + kwk.d(8, h);
        }
        l = k1;
        if (i != 0x80000000)
        {
            l = k1 + kwk.e(9, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l;
            if (j.length > 0)
            {
                for (i1 = 0; i1 < j.length;)
                {
                    ifi ifi2 = j[i1];
                    int l1 = l;
                    if (ifi2 != null)
                    {
                        l1 = l + kwk.d(10, ifi2);
                    }
                    i1++;
                    l = l1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (k != null)
        {
            l = i1;
            if (k.length > 0)
            {
                int i2 = 0;
                for (l = ((flag) ? 1 : 0); l < k.length; l++)
                {
                    i2 += kwk.e(k[l]);
                }

                l = i1 + i2 + k.length * 1;
            }
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L15:
        int l = kwj1.a();
        l;
        JVM INSTR lookupswitch 13: default 124
    //                   0: 134
    //                   10: 136
    //                   16: 147
    //                   26: 200
    //                   32: 331
    //                   42: 345
    //                   50: 374
    //                   56: 385
    //                   66: 399
    //                   72: 428
    //                   82: 484
    //                   88: 615
    //                   90: 796;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(kwj1, l)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L15
_L4:
        l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            b = l;
            break;
        }
          goto _L16
_L5:
        int i1 = kwx.a(kwj1, 26);
        ifi aifi[];
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        aifi = new ifi[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, aifi, 0, l);
            i1 = l;
        }
        for (; i1 < aifi.length - 1; i1++)
        {
            aifi[i1] = new ifi();
            kwj1.a(aifi[i1]);
            kwj1.a();
        }

        aifi[i1] = new ifi();
        kwj1.a(aifi[i1]);
        c = aifi;
          goto _L16
_L6:
        d = Long.valueOf(kwj1.e());
          goto _L16
_L7:
        if (e == null)
        {
            e = new ifd();
        }
        kwj1.a(e);
          goto _L16
_L8:
        f = kwj1.j();
          goto _L16
_L9:
        g = Boolean.valueOf(kwj1.i());
          goto _L16
_L10:
        if (h == null)
        {
            h = new ifi();
        }
        kwj1.a(h);
          goto _L16
_L11:
        l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            i = l;
            break;
        }
          goto _L16
_L12:
        int j1 = kwx.a(kwj1, 82);
        ifi aifi1[];
        if (j == null)
        {
            l = 0;
        } else
        {
            l = j.length;
        }
        aifi1 = new ifi[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(j, 0, aifi1, 0, l);
            j1 = l;
        }
        for (; j1 < aifi1.length - 1; j1++)
        {
            aifi1[j1] = new ifi();
            kwj1.a(aifi1[j1]);
            kwj1.a();
        }

        aifi1[j1] = new ifi();
        kwj1.a(aifi1[j1]);
        j = aifi1;
          goto _L16
_L13:
        int ai[];
        int k1;
        int j2;
        j2 = kwx.a(kwj1, 88);
        ai = new int[j2];
        k1 = 0;
        l = 0;
_L23:
        if (k1 >= j2) goto _L18; else goto _L17
_L17:
        int k2;
        if (k1 != 0)
        {
            kwj1.a();
        }
        k2 = kwj1.f();
        k2;
        JVM INSTR tableswitch 0 1: default 680
    //                   0 689
    //                   1 689;
           goto _L19 _L20 _L20
_L19:
        k1++;
          goto _L21
_L20:
        int l1 = l + 1;
        ai[l] = k2;
        l = l1;
        if (true) goto _L19; else goto _L18
_L18:
        if (l != 0)
        {
            if (k == null)
            {
                k1 = 0;
            } else
            {
                k1 = k.length;
            }
            if (k1 == 0 && l == ai.length)
            {
                k = ai;
            } else
            {
                int ai1[] = new int[k1 + l];
                if (k1 != 0)
                {
                    System.arraycopy(k, 0, ai1, 0, k1);
                }
                System.arraycopy(ai, 0, ai1, k1, l);
                k = ai1;
            }
        }
          goto _L16
_L21:
        if (true) goto _L23; else goto _L22
_L22:
_L14:
        int i2;
        i2 = kwj1.c(kwj1.p());
        l = kwj1.r();
        k1 = 0;
_L32:
        if (kwj1.q() <= 0) goto _L25; else goto _L24
_L24:
        switch (kwj1.f())
        {
        case 0: // '\0'
        case 1: // '\001'
            k1++;
            break;
        }
          goto _L26
_L25:
        if (k1 == 0) goto _L28; else goto _L27
_L27:
        kwj1.e(l);
        if (k == null)
        {
            l = 0;
        } else
        {
            l = k.length;
        }
        ai = new int[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(k, 0, ai, 0, l);
            k1 = l;
        }
_L30:
        if (kwj1.q() > 0)
        {
            l = kwj1.f();
            switch (l)
            {
            case 0: // '\0'
            case 1: // '\001'
                ai[k1] = l;
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        k = ai;
_L28:
        kwj1.d(i2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L30; else goto _L29
_L29:
_L26:
        if (true) goto _L32; else goto _L31
_L31:
_L16:
        if (true) goto _L15; else goto _L33
_L33:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != 0x80000000)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int l = 0; l < c.length; l++)
            {
                ifi ifi1 = c[l];
                if (ifi1 != null)
                {
                    kwk1.b(3, ifi1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(4, d.longValue());
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        if (g != null)
        {
            kwk1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            kwk1.b(8, h);
        }
        if (i != 0x80000000)
        {
            kwk1.a(9, i);
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                ifi ifi2 = j[i1];
                if (ifi2 != null)
                {
                    kwk1.b(10, ifi2);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < k.length; j1++)
            {
                kwk1.a(11, k[j1]);
            }

        }
        super.writeTo(kwk1);
    }
}
