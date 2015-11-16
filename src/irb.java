// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class irb extends koj
{

    public irg a;
    public ith b;
    public Integer c;
    public String d;
    public String e;
    public irc f;
    public izv g[];
    public Boolean h;
    public Integer i;
    public Integer j;
    public ivz k[];
    public iri l[];
    public Boolean m;
    public Boolean n;
    public int o[];
    public Integer p;
    public byte q[][];
    public byte r[][];
    public Boolean s;

    public irb()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = izv.a();
        h = null;
        i = null;
        j = null;
        k = ivz.a();
        l = iri.a();
        m = null;
        n = null;
        o = kou.a;
        p = null;
        q = kou.g;
        r = kou.g;
        s = null;
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
            i1 = j1 + koh.d(1, a);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.e(2, c.intValue());
        }
        int k1 = j1;
        if (d != null)
        {
            k1 = j1 + koh.b(3, d);
        }
        i1 = k1;
        if (f != null)
        {
            i1 = k1 + koh.d(4, f);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                j1 = 0;
                k1 = 0;
                int i2;
                int k2;
                for (i2 = 0; j1 < q.length; i2 = k2)
                {
                    byte abyte0[] = q[j1];
                    int i3 = k1;
                    k2 = i2;
                    if (abyte0 != null)
                    {
                        k2 = i2 + 1;
                        i3 = k1 + koh.a(abyte0);
                    }
                    j1++;
                    k1 = i3;
                }

                j1 = i1 + k1 + i2 * 1;
            }
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1;
            if (r.length > 0)
            {
                i1 = 0;
                k1 = 0;
                int j2;
                int l2;
                for (j2 = 0; i1 < r.length; j2 = l2)
                {
                    byte abyte1[] = r[i1];
                    int j3 = k1;
                    l2 = j2;
                    if (abyte1 != null)
                    {
                        l2 = j2 + 1;
                        j3 = k1 + koh.a(abyte1);
                    }
                    i1++;
                    k1 = j3;
                }

                i1 = j1 + k1 + j2 * 1;
            }
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                for (j1 = 0; j1 < g.length;)
                {
                    izv izv1 = g[j1];
                    k1 = i1;
                    if (izv1 != null)
                    {
                        k1 = i1 + koh.d(8, izv1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (h != null)
        {
            h.booleanValue();
            i1 = j1 + (koh.f(9) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.e(10, i.intValue());
        }
        k1 = j1;
        if (j != null)
        {
            k1 = j1 + koh.e(11, j.intValue());
        }
        i1 = k1;
        if (s != null)
        {
            s.booleanValue();
            i1 = k1 + (koh.f(12) + 1);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    ivz ivz1 = k[j1];
                    k1 = i1;
                    if (ivz1 != null)
                    {
                        k1 = i1 + koh.d(13, ivz1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1;
            if (l.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < l.length;)
                {
                    iri iri1 = l[j1];
                    k1 = i1;
                    if (iri1 != null)
                    {
                        k1 = i1 + koh.d(14, iri1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (m != null)
        {
            m.booleanValue();
            j1 = i1 + (koh.f(15) + 1);
        }
        k1 = j1;
        if (n != null)
        {
            n.booleanValue();
            k1 = j1 + (koh.f(16) + 1);
        }
        i1 = k1;
        if (b != null)
        {
            i1 = k1 + koh.d(17, b);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1;
            if (o.length > 0)
            {
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < o.length; j1++)
                {
                    l1 += koh.e(o[j1]);
                }

                j1 = i1 + l1 + o.length * 2;
            }
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.e(19, p.intValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.b(20, e);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L23:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 21: default 188
    //                   0: 198
    //                   10: 200
    //                   16: 229
    //                   26: 279
    //                   34: 290
    //                   42: 319
    //                   50: 428
    //                   66: 537
    //                   72: 668
    //                   80: 682
    //                   88: 727
    //                   96: 771
    //                   106: 785
    //                   114: 916
    //                   120: 1047
    //                   128: 1061
    //                   138: 1075
    //                   144: 1104
    //                   146: 1292
    //                   152: 1498
    //                   162: 1551;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L23; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new irg();
        }
        kog1.a(a);
          goto _L23
_L4:
        i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        if (f == null)
        {
            f = new irc();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L7:
        int k1 = kou.b(kog1, 42);
        byte abyte0[][];
        if (q == null)
        {
            i1 = 0;
        } else
        {
            i1 = q.length;
        }
        abyte0 = new byte[k1 + i1][];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(q, 0, abyte0, 0, i1);
            k1 = i1;
        }
        for (; k1 < abyte0.length - 1; k1++)
        {
            abyte0[k1] = kog1.k();
            kog1.a();
        }

        abyte0[k1] = kog1.k();
        q = abyte0;
        continue; /* Loop/switch isn't completed */
_L8:
        int l1 = kou.b(kog1, 50);
        byte abyte1[][];
        if (r == null)
        {
            i1 = 0;
        } else
        {
            i1 = r.length;
        }
        abyte1 = new byte[l1 + i1][];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(r, 0, abyte1, 0, i1);
            l1 = i1;
        }
        for (; l1 < abyte1.length - 1; l1++)
        {
            abyte1[l1] = kog1.k();
            kog1.a();
        }

        abyte1[l1] = kog1.k();
        r = abyte1;
        continue; /* Loop/switch isn't completed */
_L9:
        int i2 = kou.b(kog1, 66);
        izv aizv[];
        if (g == null)
        {
            i1 = 0;
        } else
        {
            i1 = g.length;
        }
        aizv = new izv[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(g, 0, aizv, 0, i1);
            i2 = i1;
        }
        for (; i2 < aizv.length - 1; i2++)
        {
            aizv[i2] = new izv();
            kog1.a(aizv[i2]);
            kog1.a();
        }

        aizv[i2] = new izv();
        kog1.a(aizv[i2]);
        g = aizv;
        continue; /* Loop/switch isn't completed */
_L10:
        h = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L11:
        i1 = kog1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
            i = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        i1 = kog1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
            j = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        s = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L14:
        int j2 = kou.b(kog1, 106);
        ivz aivz[];
        if (k == null)
        {
            i1 = 0;
        } else
        {
            i1 = k.length;
        }
        aivz = new ivz[j2 + i1];
        j2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(k, 0, aivz, 0, i1);
            j2 = i1;
        }
        for (; j2 < aivz.length - 1; j2++)
        {
            aivz[j2] = new ivz();
            kog1.a(aivz[j2]);
            kog1.a();
        }

        aivz[j2] = new ivz();
        kog1.a(aivz[j2]);
        k = aivz;
        continue; /* Loop/switch isn't completed */
_L15:
        int k2 = kou.b(kog1, 114);
        iri airi[];
        if (l == null)
        {
            i1 = 0;
        } else
        {
            i1 = l.length;
        }
        airi = new iri[k2 + i1];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(l, 0, airi, 0, i1);
            k2 = i1;
        }
        for (; k2 < airi.length - 1; k2++)
        {
            airi[k2] = new iri();
            kog1.a(airi[k2]);
            kog1.a();
        }

        airi[k2] = new iri();
        kog1.a(airi[k2]);
        l = airi;
        continue; /* Loop/switch isn't completed */
_L16:
        m = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        n = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L18:
        if (b == null)
        {
            b = new ith();
        }
        kog1.a(b);
        continue; /* Loop/switch isn't completed */
_L19:
        int ai[];
        int l2;
        int k3;
        k3 = kou.b(kog1, 144);
        ai = new int[k3];
        l2 = 0;
        i1 = 0;
_L29:
        if (l2 >= k3) goto _L25; else goto _L24
_L24:
        int l3;
        if (l2 != 0)
        {
            kog1.a();
        }
        l3 = kog1.f();
        l3;
        JVM INSTR tableswitch 0 2: default 1176
    //                   0 1185
    //                   1 1185
    //                   2 1185;
           goto _L26 _L27 _L27 _L27
_L26:
        l2++;
        continue; /* Loop/switch isn't completed */
_L27:
        int i3 = i1 + 1;
        ai[i1] = l3;
        i1 = i3;
        if (true) goto _L26; else goto _L25
_L25:
        if (i1 != 0)
        {
            if (o == null)
            {
                l2 = 0;
            } else
            {
                l2 = o.length;
            }
            if (l2 == 0 && i1 == ai.length)
            {
                o = ai;
            } else
            {
                int ai1[] = new int[l2 + i1];
                if (l2 != 0)
                {
                    System.arraycopy(o, 0, ai1, 0, l2);
                }
                System.arraycopy(ai, 0, ai1, l2, i1);
                o = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L29; else goto _L28
_L28:
_L20:
        int j3;
        j3 = kog1.c(kog1.p());
        i1 = kog1.r();
        l2 = 0;
_L35:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                l2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l2 == 0) goto _L31; else goto _L30
_L30:
        kog1.e(i1);
        if (o == null)
        {
            i1 = 0;
        } else
        {
            i1 = o.length;
        }
        ai = new int[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(o, 0, ai, 0, i1);
            l2 = i1;
        }
_L33:
        if (kog1.q() > 0)
        {
            i1 = kog1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                ai[l2] = i1;
                l2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        o = ai;
_L31:
        kog1.d(j3);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L33; else goto _L32
_L32:
        if (true) goto _L35; else goto _L34
_L34:
_L21:
        int j1 = kog1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            p = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L22:
        e = kog1.j();
        if (true) goto _L23; else goto _L36
_L36:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (c != null)
        {
            koh1.a(2, c.intValue());
        }
        if (d != null)
        {
            koh1.a(3, d);
        }
        if (f != null)
        {
            koh1.b(4, f);
        }
        if (q != null && q.length > 0)
        {
            for (int i1 = 0; i1 < q.length; i1++)
            {
                byte abyte0[] = q[i1];
                if (abyte0 != null)
                {
                    koh1.a(5, abyte0);
                }
            }

        }
        if (r != null && r.length > 0)
        {
            for (int j1 = 0; j1 < r.length; j1++)
            {
                byte abyte1[] = r[j1];
                if (abyte1 != null)
                {
                    koh1.a(6, abyte1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int k1 = 0; k1 < g.length; k1++)
            {
                izv izv1 = g[k1];
                if (izv1 != null)
                {
                    koh1.b(8, izv1);
                }
            }

        }
        if (h != null)
        {
            koh1.a(9, h.booleanValue());
        }
        if (i != null)
        {
            koh1.a(10, i.intValue());
        }
        if (j != null)
        {
            koh1.a(11, j.intValue());
        }
        if (s != null)
        {
            koh1.a(12, s.booleanValue());
        }
        if (k != null && k.length > 0)
        {
            for (int l1 = 0; l1 < k.length; l1++)
            {
                ivz ivz1 = k[l1];
                if (ivz1 != null)
                {
                    koh1.b(13, ivz1);
                }
            }

        }
        if (l != null && l.length > 0)
        {
            for (int i2 = 0; i2 < l.length; i2++)
            {
                iri iri1 = l[i2];
                if (iri1 != null)
                {
                    koh1.b(14, iri1);
                }
            }

        }
        if (m != null)
        {
            koh1.a(15, m.booleanValue());
        }
        if (n != null)
        {
            koh1.a(16, n.booleanValue());
        }
        if (b != null)
        {
            koh1.b(17, b);
        }
        if (o != null && o.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < o.length; j2++)
            {
                koh1.a(18, o[j2]);
            }

        }
        if (p != null)
        {
            koh1.a(19, p.intValue());
        }
        if (e != null)
        {
            koh1.a(20, e);
        }
        super.writeTo(koh1);
    }
}
