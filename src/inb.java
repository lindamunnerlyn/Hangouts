// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class inb extends kwm
{

    public ink a[];
    public ipa b[];
    public String c;
    public ind d;
    public String e;
    public ilz f[];
    public ims g;
    public Integer h;
    public ijc i;
    public byte j[];
    public iji k;
    public ijc l[];
    public inh m;

    public inb()
    {
        a = ink.a();
        b = ipa.a();
        c = null;
        d = null;
        e = null;
        f = ilz.a();
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = ijc.a();
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
                    ink ink1 = a[j1];
                    int k1 = i1;
                    if (ink1 != null)
                    {
                        k1 = i1 + kwk.d(1, ink1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(2, c);
        }
        int l1 = j1;
        if (d != null)
        {
            l1 = j1 + kwk.d(3, d);
        }
        i1 = l1;
        if (e != null)
        {
            i1 = l1 + kwk.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                for (j1 = 0; j1 < f.length;)
                {
                    ilz ilz1 = f[j1];
                    l1 = i1;
                    if (ilz1 != null)
                    {
                        l1 = i1 + kwk.d(5, ilz1);
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
            l1 = j1 + kwk.d(6, g);
        }
        i1 = l1;
        if (h != null)
        {
            i1 = l1 + kwk.e(7, h.intValue());
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1;
            if (b.length > 0)
            {
                for (j1 = 0; j1 < b.length;)
                {
                    ipa ipa1 = b[j1];
                    int i2 = i1;
                    if (ipa1 != null)
                    {
                        i2 = i1 + kwk.d(8, ipa1);
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
            i1 = j1 + kwk.d(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.d(11, k);
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
                    ijc ijc1 = l[j2];
                    j1 = i1;
                    if (ijc1 != null)
                    {
                        j1 = i1 + kwk.d(12, ijc1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.d(13, m);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L16:
        int i1 = kwj1.a();
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
        if (super.storeUnknownField(kwj1, i1)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        int k2 = kwx.a(kwj1, 10);
        ink aink[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        aink = new ink[k2 + j1];
        k2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, aink, 0, j1);
            k2 = j1;
        }
        for (; k2 < aink.length - 1; k2++)
        {
            aink[k2] = new ink();
            kwj1.a(aink[k2]);
            kwj1.a();
        }

        aink[k2] = new ink();
        kwj1.a(aink[k2]);
        a = aink;
          goto _L16
_L4:
        c = kwj1.j();
          goto _L16
_L5:
        if (d == null)
        {
            d = new ind();
        }
        kwj1.a(d);
          goto _L16
_L6:
        e = kwj1.j();
          goto _L16
_L7:
        int l2 = kwx.a(kwj1, 42);
        ilz ailz[];
        int k1;
        if (f == null)
        {
            k1 = 0;
        } else
        {
            k1 = f.length;
        }
        ailz = new ilz[l2 + k1];
        l2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(f, 0, ailz, 0, k1);
            l2 = k1;
        }
        for (; l2 < ailz.length - 1; l2++)
        {
            ailz[l2] = new ilz();
            kwj1.a(ailz[l2]);
            kwj1.a();
        }

        ailz[l2] = new ilz();
        kwj1.a(ailz[l2]);
        f = ailz;
          goto _L16
_L8:
        if (g == null)
        {
            g = new ims();
        }
        kwj1.a(g);
          goto _L16
_L9:
        int l1 = kwj1.f();
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
        int i3 = kwx.a(kwj1, 66);
        ipa aipa[];
        int i2;
        if (b == null)
        {
            i2 = 0;
        } else
        {
            i2 = b.length;
        }
        aipa = new ipa[i3 + i2];
        i3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(b, 0, aipa, 0, i2);
            i3 = i2;
        }
        for (; i3 < aipa.length - 1; i3++)
        {
            aipa[i3] = new ipa();
            kwj1.a(aipa[i3]);
            kwj1.a();
        }

        aipa[i3] = new ipa();
        kwj1.a(aipa[i3]);
        b = aipa;
        continue; /* Loop/switch isn't completed */
_L11:
        if (i == null)
        {
            i = new ijc();
        }
        kwj1.a(i);
        continue; /* Loop/switch isn't completed */
_L12:
        j = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L13:
        if (k == null)
        {
            k = new iji();
        }
        kwj1.a(k);
        continue; /* Loop/switch isn't completed */
_L14:
        int j3 = kwx.a(kwj1, 98);
        ijc aijc[];
        int j2;
        if (l == null)
        {
            j2 = 0;
        } else
        {
            j2 = l.length;
        }
        aijc = new ijc[j3 + j2];
        j3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(l, 0, aijc, 0, j2);
            j3 = j2;
        }
        for (; j3 < aijc.length - 1; j3++)
        {
            aijc[j3] = new ijc();
            kwj1.a(aijc[j3]);
            kwj1.a();
        }

        aijc[j3] = new ijc();
        kwj1.a(aijc[j3]);
        l = aijc;
        continue; /* Loop/switch isn't completed */
_L15:
        if (m == null)
        {
            m = new inh();
        }
        kwj1.a(m);
        if (true) goto _L16; else goto _L17
_L17:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                ink ink1 = a[i1];
                if (ink1 != null)
                {
                    kwk1.b(1, ink1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (d != null)
        {
            kwk1.b(3, d);
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (f != null && f.length > 0)
        {
            for (int j1 = 0; j1 < f.length; j1++)
            {
                ilz ilz1 = f[j1];
                if (ilz1 != null)
                {
                    kwk1.b(5, ilz1);
                }
            }

        }
        if (g != null)
        {
            kwk1.b(6, g);
        }
        if (h != null)
        {
            kwk1.a(7, h.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int k1 = 0; k1 < b.length; k1++)
            {
                ipa ipa1 = b[k1];
                if (ipa1 != null)
                {
                    kwk1.b(8, ipa1);
                }
            }

        }
        if (i != null)
        {
            kwk1.b(9, i);
        }
        if (j != null)
        {
            kwk1.a(10, j);
        }
        if (k != null)
        {
            kwk1.b(11, k);
        }
        if (l != null && l.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < l.length; l1++)
            {
                ijc ijc1 = l[l1];
                if (ijc1 != null)
                {
                    kwk1.b(12, ijc1);
                }
            }

        }
        if (m != null)
        {
            kwk1.b(13, m);
        }
        super.writeTo(kwk1);
    }
}
