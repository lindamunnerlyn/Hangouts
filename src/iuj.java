// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iuj extends kwm
{

    private static volatile iuj n[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Integer f;
    public Integer g;
    public iuk h[];
    public iuk i[];
    public iuk j[];
    public iuk k[];
    public iuk l[];
    public iuk m[];

    public iuj()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = iuk.a();
        i = iuk.a();
        j = iuk.a();
        k = iuk.a();
        l = iuk.a();
        m = iuk.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iuj[] a()
    {
        if (n == null)
        {
            synchronized (kwq.a)
            {
                if (n == null)
                {
                    n = new iuj[0];
                }
            }
        }
        return n;
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
            i1 = j1 + kwk.b(2, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.b(3, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(4, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(5, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(6, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.e(7, f.intValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.e(8, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                for (j1 = 0; j1 < h.length;)
                {
                    iuk iuk1 = h[j1];
                    int j2 = i1;
                    if (iuk1 != null)
                    {
                        j2 = i1 + kwk.d(9, iuk1);
                    }
                    j1++;
                    i1 = j2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1;
            if (i.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < i.length;)
                {
                    iuk iuk2 = i[j1];
                    int k2 = i1;
                    if (iuk2 != null)
                    {
                        k2 = i1 + kwk.d(10, iuk2);
                    }
                    j1++;
                    i1 = k2;
                }

            }
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                for (j1 = 0; j1 < j.length;)
                {
                    iuk iuk3 = j[j1];
                    int l2 = i1;
                    if (iuk3 != null)
                    {
                        l2 = i1 + kwk.d(11, iuk3);
                    }
                    j1++;
                    i1 = l2;
                }

                j1 = i1;
            }
        }
        int i3 = j1;
        if (k != null)
        {
            i3 = j1;
            if (k.length > 0)
            {
                i1 = j1;
                for (int k1 = 0; k1 < k.length;)
                {
                    iuk iuk4 = k[k1];
                    i3 = i1;
                    if (iuk4 != null)
                    {
                        i3 = i1 + kwk.d(12, iuk4);
                    }
                    k1++;
                    i1 = i3;
                }

                i3 = i1;
            }
        }
        i1 = i3;
        if (l != null)
        {
            i1 = i3;
            if (l.length > 0)
            {
                i1 = i3;
                for (int l1 = 0; l1 < l.length;)
                {
                    iuk iuk5 = l[l1];
                    i3 = i1;
                    if (iuk5 != null)
                    {
                        i3 = i1 + kwk.d(13, iuk5);
                    }
                    l1++;
                    i1 = i3;
                }

            }
        }
        i3 = i1;
        if (m != null)
        {
            i3 = i1;
            if (m.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    i3 = i1;
                    if (i2 >= m.length)
                    {
                        break;
                    }
                    iuk iuk6 = m[i2];
                    i3 = i1;
                    if (iuk6 != null)
                    {
                        i3 = i1 + kwk.d(14, iuk6);
                    }
                    i2++;
                    i1 = i3;
                } while (true);
            }
        }
        return i3;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L16:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 14: default 128
    //                   0: 137
    //                   18: 139
    //                   26: 150
    //                   34: 161
    //                   42: 172
    //                   50: 183
    //                   56: 194
    //                   64: 246
    //                   74: 294
    //                   82: 418
    //                   90: 542
    //                   98: 666
    //                   106: 790
    //                   114: 914;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L16
_L4:
        b = kwj1.j();
          goto _L16
_L5:
        c = kwj1.j();
          goto _L16
_L6:
        d = kwj1.j();
          goto _L16
_L7:
        e = kwj1.j();
          goto _L16
_L8:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            f = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            g = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        int j3 = kwx.a(kwj1, 74);
        iuk aiuk[];
        int l1;
        if (h == null)
        {
            l1 = 0;
        } else
        {
            l1 = h.length;
        }
        aiuk = new iuk[j3 + l1];
        j3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(h, 0, aiuk, 0, l1);
            j3 = l1;
        }
        for (; j3 < aiuk.length - 1; j3++)
        {
            aiuk[j3] = new iuk();
            kwj1.a(aiuk[j3]);
            kwj1.a();
        }

        aiuk[j3] = new iuk();
        kwj1.a(aiuk[j3]);
        h = aiuk;
        continue; /* Loop/switch isn't completed */
_L11:
        int k3 = kwx.a(kwj1, 82);
        iuk aiuk1[];
        int i2;
        if (i == null)
        {
            i2 = 0;
        } else
        {
            i2 = i.length;
        }
        aiuk1 = new iuk[k3 + i2];
        k3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(i, 0, aiuk1, 0, i2);
            k3 = i2;
        }
        for (; k3 < aiuk1.length - 1; k3++)
        {
            aiuk1[k3] = new iuk();
            kwj1.a(aiuk1[k3]);
            kwj1.a();
        }

        aiuk1[k3] = new iuk();
        kwj1.a(aiuk1[k3]);
        i = aiuk1;
        continue; /* Loop/switch isn't completed */
_L12:
        int l3 = kwx.a(kwj1, 90);
        iuk aiuk2[];
        int j2;
        if (j == null)
        {
            j2 = 0;
        } else
        {
            j2 = j.length;
        }
        aiuk2 = new iuk[l3 + j2];
        l3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(j, 0, aiuk2, 0, j2);
            l3 = j2;
        }
        for (; l3 < aiuk2.length - 1; l3++)
        {
            aiuk2[l3] = new iuk();
            kwj1.a(aiuk2[l3]);
            kwj1.a();
        }

        aiuk2[l3] = new iuk();
        kwj1.a(aiuk2[l3]);
        j = aiuk2;
        continue; /* Loop/switch isn't completed */
_L13:
        int i4 = kwx.a(kwj1, 98);
        iuk aiuk3[];
        int k2;
        if (k == null)
        {
            k2 = 0;
        } else
        {
            k2 = k.length;
        }
        aiuk3 = new iuk[i4 + k2];
        i4 = k2;
        if (k2 != 0)
        {
            System.arraycopy(k, 0, aiuk3, 0, k2);
            i4 = k2;
        }
        for (; i4 < aiuk3.length - 1; i4++)
        {
            aiuk3[i4] = new iuk();
            kwj1.a(aiuk3[i4]);
            kwj1.a();
        }

        aiuk3[i4] = new iuk();
        kwj1.a(aiuk3[i4]);
        k = aiuk3;
        continue; /* Loop/switch isn't completed */
_L14:
        int j4 = kwx.a(kwj1, 106);
        iuk aiuk4[];
        int l2;
        if (l == null)
        {
            l2 = 0;
        } else
        {
            l2 = l.length;
        }
        aiuk4 = new iuk[j4 + l2];
        j4 = l2;
        if (l2 != 0)
        {
            System.arraycopy(l, 0, aiuk4, 0, l2);
            j4 = l2;
        }
        for (; j4 < aiuk4.length - 1; j4++)
        {
            aiuk4[j4] = new iuk();
            kwj1.a(aiuk4[j4]);
            kwj1.a();
        }

        aiuk4[j4] = new iuk();
        kwj1.a(aiuk4[j4]);
        l = aiuk4;
        continue; /* Loop/switch isn't completed */
_L15:
        int k4 = kwx.a(kwj1, 114);
        iuk aiuk5[];
        int i3;
        if (m == null)
        {
            i3 = 0;
        } else
        {
            i3 = m.length;
        }
        aiuk5 = new iuk[k4 + i3];
        k4 = i3;
        if (i3 != 0)
        {
            System.arraycopy(m, 0, aiuk5, 0, i3);
            k4 = i3;
        }
        for (; k4 < aiuk5.length - 1; k4++)
        {
            aiuk5[k4] = new iuk();
            kwj1.a(aiuk5[k4]);
            kwj1.a();
        }

        aiuk5[k4] = new iuk();
        kwj1.a(aiuk5[k4]);
        m = aiuk5;
        if (true) goto _L16; else goto _L17
_L17:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(2, a);
        }
        if (b != null)
        {
            kwk1.a(3, b);
        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        if (d != null)
        {
            kwk1.a(5, d);
        }
        if (e != null)
        {
            kwk1.a(6, e);
        }
        if (f != null)
        {
            kwk1.a(7, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(8, g.intValue());
        }
        if (h != null && h.length > 0)
        {
            for (int i1 = 0; i1 < h.length; i1++)
            {
                iuk iuk1 = h[i1];
                if (iuk1 != null)
                {
                    kwk1.b(9, iuk1);
                }
            }

        }
        if (i != null && i.length > 0)
        {
            for (int j1 = 0; j1 < i.length; j1++)
            {
                iuk iuk2 = i[j1];
                if (iuk2 != null)
                {
                    kwk1.b(10, iuk2);
                }
            }

        }
        if (j != null && j.length > 0)
        {
            for (int k1 = 0; k1 < j.length; k1++)
            {
                iuk iuk3 = j[k1];
                if (iuk3 != null)
                {
                    kwk1.b(11, iuk3);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int l1 = 0; l1 < k.length; l1++)
            {
                iuk iuk4 = k[l1];
                if (iuk4 != null)
                {
                    kwk1.b(12, iuk4);
                }
            }

        }
        if (l != null && l.length > 0)
        {
            for (int i2 = 0; i2 < l.length; i2++)
            {
                iuk iuk5 = l[i2];
                if (iuk5 != null)
                {
                    kwk1.b(13, iuk5);
                }
            }

        }
        if (m != null && m.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < m.length; j2++)
            {
                iuk iuk6 = m[j2];
                if (iuk6 != null)
                {
                    kwk1.b(14, iuk6);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
