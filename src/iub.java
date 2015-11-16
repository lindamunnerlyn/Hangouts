// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iub extends koj
{

    public ivz a[];
    public Integer b;
    public Boolean c;
    public Boolean d;
    public int e[];
    public iuc f;
    public iuc g;
    public iuc h;
    public iuc i;
    public iuc j;
    public iuc k;
    public byte l[][];
    public byte m[][];
    public Boolean n;
    public ixf requestHeader;

    public iub()
    {
        requestHeader = null;
        a = ivz.a();
        b = null;
        c = null;
        d = null;
        e = kou.a;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = kou.g;
        m = kou.g;
        n = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (requestHeader != null)
        {
            i1 = j1 + koh.d(1, requestHeader);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int l2;
                int j3;
                for (l2 = 0; j1 < l.length; l2 = j3)
                {
                    byte abyte0[] = l[j1];
                    int l3 = k1;
                    j3 = l2;
                    if (abyte0 != null)
                    {
                        j3 = l2 + 1;
                        l3 = k1 + koh.a(abyte0);
                    }
                    j1++;
                    k1 = l3;
                }

                j1 = i1 + k1 + l2 * 1;
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1;
            if (m.length > 0)
            {
                i1 = 0;
                int l1 = 0;
                int i3;
                int k3;
                for (i3 = 0; i1 < m.length; i3 = k3)
                {
                    byte abyte1[] = m[i1];
                    int i4 = l1;
                    k3 = i3;
                    if (abyte1 != null)
                    {
                        k3 = i3 + 1;
                        i4 = l1 + koh.a(abyte1);
                    }
                    i1++;
                    l1 = i4;
                }

                i1 = j1 + l1 + i3 * 1;
            }
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + koh.e(4, b.intValue());
        }
        i1 = j1;
        if (n != null)
        {
            n.booleanValue();
            i1 = j1 + (koh.f(5) + 1);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                for (j1 = 0; j1 < a.length;)
                {
                    ivz ivz1 = a[j1];
                    int i2 = i1;
                    if (ivz1 != null)
                    {
                        i2 = i1 + koh.d(6, ivz1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (c != null)
        {
            c.booleanValue();
            i1 = j1 + (koh.f(7) + 1);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.d(8, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.d(9, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.d(10, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.d(11, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + koh.d(12, k);
        }
        int j2 = j1;
        if (f != null)
        {
            j2 = j1 + koh.d(13, f);
        }
        i1 = j2;
        if (d != null)
        {
            d.booleanValue();
            i1 = j2 + (koh.f(14) + 1);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                int k2 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < e.length; j1++)
                {
                    k2 += koh.e(e[j1]);
                }

                j1 = i1 + k2 + e.length * 1;
            }
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L33:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 17: default 156
    //                   0: 166
    //                   10: 168
    //                   18: 197
    //                   26: 306
    //                   32: 415
    //                   40: 429
    //                   50: 443
    //                   56: 574
    //                   66: 588
    //                   74: 617
    //                   82: 646
    //                   90: 675
    //                   98: 704
    //                   106: 733
    //                   112: 762
    //                   120: 776
    //                   122: 964;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.storeUnknownField(kog1, i1))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new ixf();
        }
        kog1.a(requestHeader);
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = kou.b(kog1, 18);
        byte abyte0[][];
        if (l == null)
        {
            i1 = 0;
        } else
        {
            i1 = l.length;
        }
        abyte0 = new byte[j1 + i1][];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(l, 0, abyte0, 0, i1);
            j1 = i1;
        }
        for (; j1 < abyte0.length - 1; j1++)
        {
            abyte0[j1] = kog1.k();
            kog1.a();
        }

        abyte0[j1] = kog1.k();
        l = abyte0;
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = kou.b(kog1, 26);
        byte abyte1[][];
        if (m == null)
        {
            i1 = 0;
        } else
        {
            i1 = m.length;
        }
        abyte1 = new byte[k1 + i1][];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(m, 0, abyte1, 0, i1);
            k1 = i1;
        }
        for (; k1 < abyte1.length - 1; k1++)
        {
            abyte1[k1] = kog1.k();
            kog1.a();
        }

        abyte1[k1] = kog1.k();
        m = abyte1;
        continue; /* Loop/switch isn't completed */
_L6:
        b = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        n = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        int l1 = kou.b(kog1, 50);
        ivz aivz[];
        if (a == null)
        {
            i1 = 0;
        } else
        {
            i1 = a.length;
        }
        aivz = new ivz[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(a, 0, aivz, 0, i1);
            l1 = i1;
        }
        for (; l1 < aivz.length - 1; l1++)
        {
            aivz[l1] = new ivz();
            kog1.a(aivz[l1]);
            kog1.a();
        }

        aivz[l1] = new ivz();
        kog1.a(aivz[l1]);
        a = aivz;
        continue; /* Loop/switch isn't completed */
_L9:
        c = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L10:
        if (g == null)
        {
            g = new iuc();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L11:
        if (h == null)
        {
            h = new iuc();
        }
        kog1.a(h);
        continue; /* Loop/switch isn't completed */
_L12:
        if (i == null)
        {
            i = new iuc();
        }
        kog1.a(i);
        continue; /* Loop/switch isn't completed */
_L13:
        if (j == null)
        {
            j = new iuc();
        }
        kog1.a(j);
        continue; /* Loop/switch isn't completed */
_L14:
        if (k == null)
        {
            k = new iuc();
        }
        kog1.a(k);
        continue; /* Loop/switch isn't completed */
_L15:
        if (f == null)
        {
            f = new iuc();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L16:
        d = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        int ai[];
        int i2;
        int l2;
        l2 = kou.b(kog1, 120);
        ai = new int[l2];
        i2 = 0;
        i1 = 0;
_L25:
        if (i2 >= l2) goto _L20; else goto _L19
_L19:
        int i3;
        if (i2 != 0)
        {
            kog1.a();
        }
        i3 = kog1.f();
        i3;
        JVM INSTR tableswitch 0 2: default 848
    //                   0 857
    //                   1 857
    //                   2 857;
           goto _L21 _L22 _L22 _L22
_L21:
        i2++;
          goto _L23
_L22:
        int j2 = i1 + 1;
        ai[i1] = i3;
        i1 = j2;
        if (true) goto _L21; else goto _L23
_L23:
        if (true) goto _L25; else goto _L24
_L24:
_L20:
        if (i1 != 0)
        {
            if (e == null)
            {
                i2 = 0;
            } else
            {
                i2 = e.length;
            }
            if (i2 == 0 && i1 == ai.length)
            {
                e = ai;
            } else
            {
                int ai1[] = new int[i2 + i1];
                if (i2 != 0)
                {
                    System.arraycopy(e, 0, ai1, 0, i2);
                }
                System.arraycopy(ai, 0, ai1, i2, i1);
                e = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L18:
        int k2;
        k2 = kog1.c(kog1.p());
        i1 = kog1.r();
        i2 = 0;
_L31:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                i2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i2 == 0) goto _L27; else goto _L26
_L26:
        kog1.e(i1);
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        ai = new int[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, ai, 0, i1);
            i2 = i1;
        }
_L29:
        if (kog1.q() > 0)
        {
            i1 = kog1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                ai[i2] = i1;
                i2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        e = ai;
          goto _L27
        if (true) goto _L29; else goto _L28
_L28:
        if (true) goto _L31; else goto _L30
_L30:
_L27:
        kog1.d(k2);
        if (true) goto _L33; else goto _L32
_L32:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (l != null && l.length > 0)
        {
            for (int i1 = 0; i1 < l.length; i1++)
            {
                byte abyte0[] = l[i1];
                if (abyte0 != null)
                {
                    koh1.a(2, abyte0);
                }
            }

        }
        if (m != null && m.length > 0)
        {
            for (int j1 = 0; j1 < m.length; j1++)
            {
                byte abyte1[] = m[j1];
                if (abyte1 != null)
                {
                    koh1.a(3, abyte1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(4, b.intValue());
        }
        if (n != null)
        {
            koh1.a(5, n.booleanValue());
        }
        if (a != null && a.length > 0)
        {
            for (int k1 = 0; k1 < a.length; k1++)
            {
                ivz ivz1 = a[k1];
                if (ivz1 != null)
                {
                    koh1.b(6, ivz1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(7, c.booleanValue());
        }
        if (g != null)
        {
            koh1.b(8, g);
        }
        if (h != null)
        {
            koh1.b(9, h);
        }
        if (i != null)
        {
            koh1.b(10, i);
        }
        if (j != null)
        {
            koh1.b(11, j);
        }
        if (k != null)
        {
            koh1.b(12, k);
        }
        if (f != null)
        {
            koh1.b(13, f);
        }
        if (d != null)
        {
            koh1.a(14, d.booleanValue());
        }
        if (e != null && e.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < e.length; l1++)
            {
                koh1.a(15, e[l1]);
            }

        }
        super.writeTo(koh1);
    }
}
