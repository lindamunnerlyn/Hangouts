// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kdt extends koj
{

    public kbj a[];
    public kaz b;
    public String c;
    public String d;
    public kba e[];
    public kbb f[];
    public Long g;
    public Integer h;
    public Long i;
    public Long j;
    public Long k;
    public Integer l;
    public kbh m;
    public kdr n;
    public kdn o;
    public kec p;
    public kjc q[];
    public kdu r;
    public kds s;
    public kdw t;
    public kea u[];
    public Integer v;

    public kdt()
    {
        a = kbj.a();
        b = null;
        c = null;
        d = null;
        e = kba.a();
        f = kbb.a();
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = kjc.a();
        r = null;
        s = null;
        t = null;
        u = kea.a();
        v = null;
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
                    kbj kbj1 = a[j1];
                    int k1 = i1;
                    if (kbj1 != null)
                    {
                        k1 = i1 + koh.d(1, kbj1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.d(2, b);
        }
        int l1 = j1;
        if (c != null)
        {
            l1 = j1 + koh.b(3, c);
        }
        i1 = l1;
        if (d != null)
        {
            i1 = l1 + koh.b(4, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    kba kba1 = e[j1];
                    l1 = i1;
                    if (kba1 != null)
                    {
                        l1 = i1 + koh.d(5, kba1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1;
            if (f.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < f.length;)
                {
                    kbb kbb1 = f[j1];
                    l1 = i1;
                    if (kbb1 != null)
                    {
                        l1 = i1 + koh.d(6, kbb1);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.e(7, g.longValue());
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + koh.e(8, i.longValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + koh.e(9, j.longValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.e(10, k.longValue());
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.e(11, l.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(12, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + koh.d(13, n);
        }
        l1 = j1;
        if (o != null)
        {
            l1 = j1 + koh.d(15, o);
        }
        i1 = l1;
        if (p != null)
        {
            i1 = l1 + koh.d(16, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                for (j1 = 0; j1 < q.length;)
                {
                    kjc kjc1 = q[j1];
                    l1 = i1;
                    if (kjc1 != null)
                    {
                        l1 = i1 + koh.d(17, kjc1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.d(18, r);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + koh.e(19, h.intValue());
        }
        l1 = j1;
        if (s != null)
        {
            l1 = j1 + koh.d(21, s);
        }
        i1 = l1;
        if (t != null)
        {
            i1 = l1 + koh.d(22, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1;
            if (u.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= u.length)
                    {
                        break;
                    }
                    kea kea1 = u[i2];
                    j1 = i1;
                    if (kea1 != null)
                    {
                        j1 = i1 + koh.d(23, kea1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + koh.e(24, v.intValue());
        }
        return i1;
    }

    public kop mergeFrom(kog kog1)
    {
_L25:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 23: default 200
    //                   0: 209
    //                   10: 211
    //                   18: 335
    //                   26: 364
    //                   34: 375
    //                   42: 386
    //                   50: 510
    //                   56: 634
    //                   64: 648
    //                   72: 662
    //                   80: 676
    //                   88: 690
    //                   98: 754
    //                   106: 783
    //                   122: 812
    //                   130: 841
    //                   138: 870
    //                   146: 995
    //                   152: 1024
    //                   170: 1070
    //                   178: 1099
    //                   186: 1128
    //                   192: 1253;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L25; else goto _L2
_L2:
        return this;
_L3:
        int j3 = kou.b(kog1, 10);
        kbj akbj[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        akbj = new kbj[j3 + j1];
        j3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, akbj, 0, j1);
            j3 = j1;
        }
        for (; j3 < akbj.length - 1; j3++)
        {
            akbj[j3] = new kbj();
            kog1.a(akbj[j3]);
            kog1.a();
        }

        akbj[j3] = new kbj();
        kog1.a(akbj[j3]);
        a = akbj;
          goto _L25
_L4:
        if (b == null)
        {
            b = new kaz();
        }
        kog1.a(b);
          goto _L25
_L5:
        c = kog1.j();
          goto _L25
_L6:
        d = kog1.j();
          goto _L25
_L7:
        int k3 = kou.b(kog1, 42);
        kba akba[];
        int k1;
        if (e == null)
        {
            k1 = 0;
        } else
        {
            k1 = e.length;
        }
        akba = new kba[k3 + k1];
        k3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(e, 0, akba, 0, k1);
            k3 = k1;
        }
        for (; k3 < akba.length - 1; k3++)
        {
            akba[k3] = new kba();
            kog1.a(akba[k3]);
            kog1.a();
        }

        akba[k3] = new kba();
        kog1.a(akba[k3]);
        e = akba;
          goto _L25
_L8:
        int l3 = kou.b(kog1, 50);
        kbb akbb[];
        int l1;
        if (f == null)
        {
            l1 = 0;
        } else
        {
            l1 = f.length;
        }
        akbb = new kbb[l3 + l1];
        l3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(f, 0, akbb, 0, l1);
            l3 = l1;
        }
        for (; l3 < akbb.length - 1; l3++)
        {
            akbb[l3] = new kbb();
            kog1.a(akbb[l3]);
            kog1.a();
        }

        akbb[l3] = new kbb();
        kog1.a(akbb[l3]);
        f = akbb;
          goto _L25
_L9:
        g = Long.valueOf(kog1.e());
          goto _L25
_L10:
        i = Long.valueOf(kog1.e());
          goto _L25
_L11:
        j = Long.valueOf(kog1.e());
          goto _L25
_L12:
        k = Long.valueOf(kog1.e());
          goto _L25
_L13:
        int i2 = kog1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 10: // '\n'
        case 20: // '\024'
        case 100: // 'd'
            l = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (m == null)
        {
            m = new kbh();
        }
        kog1.a(m);
        continue; /* Loop/switch isn't completed */
_L15:
        if (n == null)
        {
            n = new kdr();
        }
        kog1.a(n);
        continue; /* Loop/switch isn't completed */
_L16:
        if (o == null)
        {
            o = new kdn();
        }
        kog1.a(o);
        continue; /* Loop/switch isn't completed */
_L17:
        if (p == null)
        {
            p = new kec();
        }
        kog1.a(p);
        continue; /* Loop/switch isn't completed */
_L18:
        int i4 = kou.b(kog1, 138);
        kjc akjc[];
        int j2;
        if (q == null)
        {
            j2 = 0;
        } else
        {
            j2 = q.length;
        }
        akjc = new kjc[i4 + j2];
        i4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(q, 0, akjc, 0, j2);
            i4 = j2;
        }
        for (; i4 < akjc.length - 1; i4++)
        {
            akjc[i4] = new kjc();
            kog1.a(akjc[i4]);
            kog1.a();
        }

        akjc[i4] = new kjc();
        kog1.a(akjc[i4]);
        q = akjc;
        continue; /* Loop/switch isn't completed */
_L19:
        if (r == null)
        {
            r = new kdu();
        }
        kog1.a(r);
        continue; /* Loop/switch isn't completed */
_L20:
        int k2 = kog1.f();
        switch (k2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = Integer.valueOf(k2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L21:
        if (s == null)
        {
            s = new kds();
        }
        kog1.a(s);
        continue; /* Loop/switch isn't completed */
_L22:
        if (t == null)
        {
            t = new kdw();
        }
        kog1.a(t);
        continue; /* Loop/switch isn't completed */
_L23:
        int j4 = kou.b(kog1, 186);
        kea akea[];
        int l2;
        if (u == null)
        {
            l2 = 0;
        } else
        {
            l2 = u.length;
        }
        akea = new kea[j4 + l2];
        j4 = l2;
        if (l2 != 0)
        {
            System.arraycopy(u, 0, akea, 0, l2);
            j4 = l2;
        }
        for (; j4 < akea.length - 1; j4++)
        {
            akea[j4] = new kea();
            kog1.a(akea[j4]);
            kog1.a();
        }

        akea[j4] = new kea();
        kog1.a(akea[j4]);
        u = akea;
        continue; /* Loop/switch isn't completed */
_L24:
        int i3 = kog1.f();
        switch (i3)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            v = Integer.valueOf(i3);
            break;
        }
        if (true) goto _L25; else goto _L26
_L26:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                kbj kbj1 = a[i1];
                if (kbj1 != null)
                {
                    koh1.b(1, kbj1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                kba kba1 = e[j1];
                if (kba1 != null)
                {
                    koh1.b(5, kba1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int k1 = 0; k1 < f.length; k1++)
            {
                kbb kbb1 = f[k1];
                if (kbb1 != null)
                {
                    koh1.b(6, kbb1);
                }
            }

        }
        if (g != null)
        {
            koh1.b(7, g.longValue());
        }
        if (i != null)
        {
            koh1.b(8, i.longValue());
        }
        if (j != null)
        {
            koh1.b(9, j.longValue());
        }
        if (k != null)
        {
            koh1.b(10, k.longValue());
        }
        if (l != null)
        {
            koh1.a(11, l.intValue());
        }
        if (m != null)
        {
            koh1.b(12, m);
        }
        if (n != null)
        {
            koh1.b(13, n);
        }
        if (o != null)
        {
            koh1.b(15, o);
        }
        if (p != null)
        {
            koh1.b(16, p);
        }
        if (q != null && q.length > 0)
        {
            for (int l1 = 0; l1 < q.length; l1++)
            {
                kjc kjc1 = q[l1];
                if (kjc1 != null)
                {
                    koh1.b(17, kjc1);
                }
            }

        }
        if (r != null)
        {
            koh1.b(18, r);
        }
        if (h != null)
        {
            koh1.a(19, h.intValue());
        }
        if (s != null)
        {
            koh1.b(21, s);
        }
        if (t != null)
        {
            koh1.b(22, t);
        }
        if (u != null && u.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < u.length; i2++)
            {
                kea kea1 = u[i2];
                if (kea1 != null)
                {
                    koh1.b(23, kea1);
                }
            }

        }
        if (v != null)
        {
            koh1.a(24, v.intValue());
        }
        super.writeTo(koh1);
    }
}
