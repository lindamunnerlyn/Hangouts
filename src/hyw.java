// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyw extends koj
{

    public String a;
    public Integer b;
    public hyx c[];
    public Long d;
    public hys e;
    public String f;
    public Boolean g;
    public hyx h;
    public Integer i;
    public hyx j[];
    public int k[];

    public hyw()
    {
        a = null;
        b = null;
        c = hyx.a();
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = hyx.a();
        k = kou.a;
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
            i1 = l + koh.b(1, a);
        }
        l = i1;
        if (b != null)
        {
            l = i1 + koh.e(2, b.intValue());
        }
        i1 = l;
        if (c != null)
        {
            i1 = l;
            if (c.length > 0)
            {
                for (i1 = 0; i1 < c.length;)
                {
                    hyx hyx1 = c[i1];
                    int j1 = l;
                    if (hyx1 != null)
                    {
                        j1 = l + koh.d(3, hyx1);
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
            l = i1 + koh.e(4, d.longValue());
        }
        i1 = l;
        if (e != null)
        {
            i1 = l + koh.d(5, e);
        }
        l = i1;
        if (f != null)
        {
            l = i1 + koh.b(6, f);
        }
        i1 = l;
        if (g != null)
        {
            g.booleanValue();
            i1 = l + (koh.f(7) + 1);
        }
        int k1 = i1;
        if (h != null)
        {
            k1 = i1 + koh.d(8, h);
        }
        l = k1;
        if (i != null)
        {
            l = k1 + koh.e(9, i.intValue());
        }
        i1 = l;
        if (j != null)
        {
            i1 = l;
            if (j.length > 0)
            {
                for (i1 = 0; i1 < j.length;)
                {
                    hyx hyx2 = j[i1];
                    int l1 = l;
                    if (hyx2 != null)
                    {
                        l1 = l + koh.d(10, hyx2);
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
                    i2 += koh.e(k[l]);
                }

                l = i1 + i2 + k.length * 1;
            }
        }
        return l;
    }

    public kop mergeFrom(kog kog1)
    {
_L15:
        int l = kog1.a();
        l;
        JVM INSTR lookupswitch 13: default 124
    //                   0: 134
    //                   10: 136
    //                   16: 147
    //                   26: 203
    //                   32: 334
    //                   42: 348
    //                   50: 377
    //                   56: 388
    //                   66: 402
    //                   72: 431
    //                   82: 487
    //                   88: 618
    //                   90: 800;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(kog1, l)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L15
_L4:
        l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            b = Integer.valueOf(l);
            break;
        }
          goto _L16
_L5:
        int i1 = kou.b(kog1, 26);
        hyx ahyx[];
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        ahyx = new hyx[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, ahyx, 0, l);
            i1 = l;
        }
        for (; i1 < ahyx.length - 1; i1++)
        {
            ahyx[i1] = new hyx();
            kog1.a(ahyx[i1]);
            kog1.a();
        }

        ahyx[i1] = new hyx();
        kog1.a(ahyx[i1]);
        c = ahyx;
          goto _L16
_L6:
        d = Long.valueOf(kog1.e());
          goto _L16
_L7:
        if (e == null)
        {
            e = new hys();
        }
        kog1.a(e);
          goto _L16
_L8:
        f = kog1.j();
          goto _L16
_L9:
        g = Boolean.valueOf(kog1.i());
          goto _L16
_L10:
        if (h == null)
        {
            h = new hyx();
        }
        kog1.a(h);
          goto _L16
_L11:
        l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            i = Integer.valueOf(l);
            break;
        }
          goto _L16
_L12:
        int j1 = kou.b(kog1, 82);
        hyx ahyx1[];
        if (j == null)
        {
            l = 0;
        } else
        {
            l = j.length;
        }
        ahyx1 = new hyx[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(j, 0, ahyx1, 0, l);
            j1 = l;
        }
        for (; j1 < ahyx1.length - 1; j1++)
        {
            ahyx1[j1] = new hyx();
            kog1.a(ahyx1[j1]);
            kog1.a();
        }

        ahyx1[j1] = new hyx();
        kog1.a(ahyx1[j1]);
        j = ahyx1;
          goto _L16
_L13:
        int ai[];
        int k1;
        int j2;
        j2 = kou.b(kog1, 88);
        ai = new int[j2];
        k1 = 0;
        l = 0;
_L23:
        if (k1 >= j2) goto _L18; else goto _L17
_L17:
        int k2;
        if (k1 != 0)
        {
            kog1.a();
        }
        k2 = kog1.f();
        k2;
        JVM INSTR tableswitch 0 1: default 684
    //                   0 693
    //                   1 693;
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
        i2 = kog1.c(kog1.p());
        l = kog1.r();
        k1 = 0;
_L32:
        if (kog1.q() <= 0) goto _L25; else goto _L24
_L24:
        switch (kog1.f())
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
        kog1.e(l);
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
        if (kog1.q() > 0)
        {
            l = kog1.f();
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
        kog1.d(i2);
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

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int l = 0; l < c.length; l++)
            {
                hyx hyx1 = c[l];
                if (hyx1 != null)
                {
                    koh1.b(3, hyx1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(4, d.longValue());
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            koh1.b(8, h);
        }
        if (i != null)
        {
            koh1.a(9, i.intValue());
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                hyx hyx2 = j[i1];
                if (hyx2 != null)
                {
                    koh1.b(10, hyx2);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < k.length; j1++)
            {
                koh1.a(11, k[j1]);
            }

        }
        super.writeTo(koh1);
    }
}
