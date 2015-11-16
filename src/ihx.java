// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihx extends koj
{

    public iig a[];
    public ijw b[];
    public String c;
    public ihz d;
    public String e;
    public igv f[];
    public iho g;
    public Integer h;
    public idy i;
    public byte j[];
    public iee k;
    public idy l[];
    public iid m;

    public ihx()
    {
        a = iig.a();
        b = ijw.a();
        c = null;
        d = null;
        e = null;
        f = igv.a();
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = idy.a();
        m = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1;
            if (a.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < a.length;)
                {
                    iig iig1 = a[j1];
                    int k1 = i1;
                    if (iig1 != null)
                    {
                        k1 = i1 + koh.d(1, iig1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(2, c);
        }
        int l1 = j1;
        if (d != null)
        {
            l1 = j1 + koh.d(3, d);
        }
        i1 = l1;
        if (e != null)
        {
            i1 = l1 + koh.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                for (j1 = 0; j1 < f.length;)
                {
                    igv igv1 = f[j1];
                    l1 = i1;
                    if (igv1 != null)
                    {
                        l1 = i1 + koh.d(5, igv1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        l1 = j1;
        if (g != null)
        {
            l1 = j1 + koh.d(6, g);
        }
        i1 = l1;
        if (h != null)
        {
            i1 = l1 + koh.e(7, h.intValue());
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1;
            if (b.length > 0)
            {
                for (j1 = 0; j1 < b.length;)
                {
                    ijw ijw1 = b[j1];
                    int i2 = i1;
                    if (ijw1 != null)
                    {
                        i2 = i1 + koh.d(8, ijw1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.d(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.b(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.d(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                int j2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (j2 >= l.length)
                    {
                        break;
                    }
                    idy idy1 = l[j2];
                    j1 = i1;
                    if (idy1 != null)
                    {
                        j1 = i1 + koh.d(12, idy1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(13, m);
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L16:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 14: default 128
    //                   0: 137
    //                   10: 139
    //                   18: 263
    //                   26: 274
    //                   34: 303
    //                   42: 314
    //                   50: 438
    //                   56: 467
    //                   66: 522
    //                   74: 646
    //                   82: 675
    //                   90: 686
    //                   98: 715
    //                   106: 839;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        int k2 = kou.b(kog1, 10);
        iig aiig[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        aiig = new iig[k2 + j1];
        k2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, aiig, 0, j1);
            k2 = j1;
        }
        for (; k2 < aiig.length - 1; k2++)
        {
            aiig[k2] = new iig();
            kog1.a(aiig[k2]);
            kog1.a();
        }

        aiig[k2] = new iig();
        kog1.a(aiig[k2]);
        a = aiig;
          goto _L16
_L4:
        c = kog1.j();
          goto _L16
_L5:
        if (d == null)
        {
            d = new ihz();
        }
        kog1.a(d);
          goto _L16
_L6:
        e = kog1.j();
          goto _L16
_L7:
        int l2 = kou.b(kog1, 42);
        igv aigv[];
        int k1;
        if (f == null)
        {
            k1 = 0;
        } else
        {
            k1 = f.length;
        }
        aigv = new igv[l2 + k1];
        l2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(f, 0, aigv, 0, k1);
            l2 = k1;
        }
        for (; l2 < aigv.length - 1; l2++)
        {
            aigv[l2] = new igv();
            kog1.a(aigv[l2]);
            kog1.a();
        }

        aigv[l2] = new igv();
        kog1.a(aigv[l2]);
        f = aigv;
          goto _L16
_L8:
        if (g == null)
        {
            g = new iho();
        }
        kog1.a(g);
          goto _L16
_L9:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            h = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        int i3 = kou.b(kog1, 66);
        ijw aijw[];
        int i2;
        if (b == null)
        {
            i2 = 0;
        } else
        {
            i2 = b.length;
        }
        aijw = new ijw[i3 + i2];
        i3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(b, 0, aijw, 0, i2);
            i3 = i2;
        }
        for (; i3 < aijw.length - 1; i3++)
        {
            aijw[i3] = new ijw();
            kog1.a(aijw[i3]);
            kog1.a();
        }

        aijw[i3] = new ijw();
        kog1.a(aijw[i3]);
        b = aijw;
        continue; /* Loop/switch isn't completed */
_L11:
        if (i == null)
        {
            i = new idy();
        }
        kog1.a(i);
        continue; /* Loop/switch isn't completed */
_L12:
        j = kog1.k();
        continue; /* Loop/switch isn't completed */
_L13:
        if (k == null)
        {
            k = new iee();
        }
        kog1.a(k);
        continue; /* Loop/switch isn't completed */
_L14:
        int j3 = kou.b(kog1, 98);
        idy aidy[];
        int j2;
        if (l == null)
        {
            j2 = 0;
        } else
        {
            j2 = l.length;
        }
        aidy = new idy[j3 + j2];
        j3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(l, 0, aidy, 0, j2);
            j3 = j2;
        }
        for (; j3 < aidy.length - 1; j3++)
        {
            aidy[j3] = new idy();
            kog1.a(aidy[j3]);
            kog1.a();
        }

        aidy[j3] = new idy();
        kog1.a(aidy[j3]);
        l = aidy;
        continue; /* Loop/switch isn't completed */
_L15:
        if (m == null)
        {
            m = new iid();
        }
        kog1.a(m);
        if (true) goto _L16; else goto _L17
_L17:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                iig iig1 = a[i1];
                if (iig1 != null)
                {
                    koh1.b(1, iig1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (d != null)
        {
            koh1.b(3, d);
        }
        if (e != null)
        {
            koh1.a(4, e);
        }
        if (f != null && f.length > 0)
        {
            for (int j1 = 0; j1 < f.length; j1++)
            {
                igv igv1 = f[j1];
                if (igv1 != null)
                {
                    koh1.b(5, igv1);
                }
            }

        }
        if (g != null)
        {
            koh1.b(6, g);
        }
        if (h != null)
        {
            koh1.a(7, h.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int k1 = 0; k1 < b.length; k1++)
            {
                ijw ijw1 = b[k1];
                if (ijw1 != null)
                {
                    koh1.b(8, ijw1);
                }
            }

        }
        if (i != null)
        {
            koh1.b(9, i);
        }
        if (j != null)
        {
            koh1.a(10, j);
        }
        if (k != null)
        {
            koh1.b(11, k);
        }
        if (l != null && l.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < l.length; l1++)
            {
                idy idy1 = l[l1];
                if (idy1 != null)
                {
                    koh1.b(12, idy1);
                }
            }

        }
        if (m != null)
        {
            koh1.b(13, m);
        }
        super.writeTo(koh1);
    }
}
