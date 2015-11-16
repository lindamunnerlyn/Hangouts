// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ioe extends koj
{

    private static volatile ioe n[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Integer f;
    public Integer g;
    public iof h[];
    public iof i[];
    public iof j[];
    public iof k[];
    public iof l[];
    public iof m[];

    public ioe()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = iof.a();
        i = iof.a();
        j = iof.a();
        k = iof.a();
        l = iof.a();
        m = iof.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ioe[] a()
    {
        if (n == null)
        {
            synchronized (kon.a)
            {
                if (n == null)
                {
                    n = new ioe[0];
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
            i1 = j1 + koh.b(2, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.b(3, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + koh.b(4, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.b(5, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + koh.b(6, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + koh.e(7, f.intValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + koh.e(8, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                for (j1 = 0; j1 < h.length;)
                {
                    iof iof1 = h[j1];
                    int j2 = i1;
                    if (iof1 != null)
                    {
                        j2 = i1 + koh.d(9, iof1);
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
                    iof iof2 = i[j1];
                    int k2 = i1;
                    if (iof2 != null)
                    {
                        k2 = i1 + koh.d(10, iof2);
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
                    iof iof3 = j[j1];
                    int l2 = i1;
                    if (iof3 != null)
                    {
                        l2 = i1 + koh.d(11, iof3);
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
                    iof iof4 = k[k1];
                    i3 = i1;
                    if (iof4 != null)
                    {
                        i3 = i1 + koh.d(12, iof4);
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
                    iof iof5 = l[l1];
                    i3 = i1;
                    if (iof5 != null)
                    {
                        i3 = i1 + koh.d(13, iof5);
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
                    iof iof6 = m[i2];
                    i3 = i1;
                    if (iof6 != null)
                    {
                        i3 = i1 + koh.d(14, iof6);
                    }
                    i2++;
                    i1 = i3;
                } while (true);
            }
        }
        return i3;
    }

    public kop mergeFrom(kog kog1)
    {
_L16:
        int i1 = kog1.a();
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
        if (super.storeUnknownField(kog1, i1)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L16
_L4:
        b = kog1.j();
          goto _L16
_L5:
        c = kog1.j();
          goto _L16
_L6:
        d = kog1.j();
          goto _L16
_L7:
        e = kog1.j();
          goto _L16
_L8:
        int j1 = kog1.f();
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
        int k1 = kog1.f();
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
        int j3 = kou.b(kog1, 74);
        iof aiof[];
        int l1;
        if (h == null)
        {
            l1 = 0;
        } else
        {
            l1 = h.length;
        }
        aiof = new iof[j3 + l1];
        j3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(h, 0, aiof, 0, l1);
            j3 = l1;
        }
        for (; j3 < aiof.length - 1; j3++)
        {
            aiof[j3] = new iof();
            kog1.a(aiof[j3]);
            kog1.a();
        }

        aiof[j3] = new iof();
        kog1.a(aiof[j3]);
        h = aiof;
        continue; /* Loop/switch isn't completed */
_L11:
        int k3 = kou.b(kog1, 82);
        iof aiof1[];
        int i2;
        if (i == null)
        {
            i2 = 0;
        } else
        {
            i2 = i.length;
        }
        aiof1 = new iof[k3 + i2];
        k3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(i, 0, aiof1, 0, i2);
            k3 = i2;
        }
        for (; k3 < aiof1.length - 1; k3++)
        {
            aiof1[k3] = new iof();
            kog1.a(aiof1[k3]);
            kog1.a();
        }

        aiof1[k3] = new iof();
        kog1.a(aiof1[k3]);
        i = aiof1;
        continue; /* Loop/switch isn't completed */
_L12:
        int l3 = kou.b(kog1, 90);
        iof aiof2[];
        int j2;
        if (j == null)
        {
            j2 = 0;
        } else
        {
            j2 = j.length;
        }
        aiof2 = new iof[l3 + j2];
        l3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(j, 0, aiof2, 0, j2);
            l3 = j2;
        }
        for (; l3 < aiof2.length - 1; l3++)
        {
            aiof2[l3] = new iof();
            kog1.a(aiof2[l3]);
            kog1.a();
        }

        aiof2[l3] = new iof();
        kog1.a(aiof2[l3]);
        j = aiof2;
        continue; /* Loop/switch isn't completed */
_L13:
        int i4 = kou.b(kog1, 98);
        iof aiof3[];
        int k2;
        if (k == null)
        {
            k2 = 0;
        } else
        {
            k2 = k.length;
        }
        aiof3 = new iof[i4 + k2];
        i4 = k2;
        if (k2 != 0)
        {
            System.arraycopy(k, 0, aiof3, 0, k2);
            i4 = k2;
        }
        for (; i4 < aiof3.length - 1; i4++)
        {
            aiof3[i4] = new iof();
            kog1.a(aiof3[i4]);
            kog1.a();
        }

        aiof3[i4] = new iof();
        kog1.a(aiof3[i4]);
        k = aiof3;
        continue; /* Loop/switch isn't completed */
_L14:
        int j4 = kou.b(kog1, 106);
        iof aiof4[];
        int l2;
        if (l == null)
        {
            l2 = 0;
        } else
        {
            l2 = l.length;
        }
        aiof4 = new iof[j4 + l2];
        j4 = l2;
        if (l2 != 0)
        {
            System.arraycopy(l, 0, aiof4, 0, l2);
            j4 = l2;
        }
        for (; j4 < aiof4.length - 1; j4++)
        {
            aiof4[j4] = new iof();
            kog1.a(aiof4[j4]);
            kog1.a();
        }

        aiof4[j4] = new iof();
        kog1.a(aiof4[j4]);
        l = aiof4;
        continue; /* Loop/switch isn't completed */
_L15:
        int k4 = kou.b(kog1, 114);
        iof aiof5[];
        int i3;
        if (m == null)
        {
            i3 = 0;
        } else
        {
            i3 = m.length;
        }
        aiof5 = new iof[k4 + i3];
        k4 = i3;
        if (i3 != 0)
        {
            System.arraycopy(m, 0, aiof5, 0, i3);
            k4 = i3;
        }
        for (; k4 < aiof5.length - 1; k4++)
        {
            aiof5[k4] = new iof();
            kog1.a(aiof5[k4]);
            kog1.a();
        }

        aiof5[k4] = new iof();
        kog1.a(aiof5[k4]);
        m = aiof5;
        if (true) goto _L16; else goto _L17
_L17:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(2, a);
        }
        if (b != null)
        {
            koh1.a(3, b);
        }
        if (c != null)
        {
            koh1.a(4, c);
        }
        if (d != null)
        {
            koh1.a(5, d);
        }
        if (e != null)
        {
            koh1.a(6, e);
        }
        if (f != null)
        {
            koh1.a(7, f.intValue());
        }
        if (g != null)
        {
            koh1.a(8, g.intValue());
        }
        if (h != null && h.length > 0)
        {
            for (int i1 = 0; i1 < h.length; i1++)
            {
                iof iof1 = h[i1];
                if (iof1 != null)
                {
                    koh1.b(9, iof1);
                }
            }

        }
        if (i != null && i.length > 0)
        {
            for (int j1 = 0; j1 < i.length; j1++)
            {
                iof iof2 = i[j1];
                if (iof2 != null)
                {
                    koh1.b(10, iof2);
                }
            }

        }
        if (j != null && j.length > 0)
        {
            for (int k1 = 0; k1 < j.length; k1++)
            {
                iof iof3 = j[k1];
                if (iof3 != null)
                {
                    koh1.b(11, iof3);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int l1 = 0; l1 < k.length; l1++)
            {
                iof iof4 = k[l1];
                if (iof4 != null)
                {
                    koh1.b(12, iof4);
                }
            }

        }
        if (l != null && l.length > 0)
        {
            for (int i2 = 0; i2 < l.length; i2++)
            {
                iof iof5 = l[i2];
                if (iof5 != null)
                {
                    koh1.b(13, iof5);
                }
            }

        }
        if (m != null && m.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < m.length; j2++)
            {
                iof iof6 = m[j2];
                if (iof6 != null)
                {
                    koh1.b(14, iof6);
                }
            }

        }
        super.writeTo(koh1);
    }
}
