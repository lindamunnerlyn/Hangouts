// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzs extends kwm
{

    public String A;
    public String B;
    public Boolean C;
    public int D[];
    public String E[];
    public Long F;
    public String G;
    public String H;
    public String I[];
    public int J;
    public String K;
    public Boolean L;
    public String M[];
    public String N;
    public String O;
    public kzt P[];
    public String Q;
    public Boolean R;
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g[];
    public String h;
    public String i;
    public String j;
    public Boolean k;
    public Boolean l;
    public int m;
    public kzu n;
    public Boolean o;
    public String p;
    public kzx q;
    public int r;
    public kzr s;
    public kzv t[];
    public Boolean u;
    public String v;
    public Boolean w;
    public String x;
    public String y;
    public String z;

    public kzs()
    {
        a = null;
        b = null;
        c = 0x80000000;
        d = null;
        e = null;
        f = null;
        g = kwx.f;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = 0x80000000;
        n = null;
        o = null;
        p = null;
        q = null;
        r = 0x80000000;
        s = null;
        t = kzv.a();
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        D = kwx.a;
        E = kwx.f;
        F = null;
        G = null;
        H = null;
        I = kwx.f;
        J = 0x80000000;
        K = null;
        L = null;
        M = kwx.f;
        N = null;
        O = null;
        P = kzt.a();
        Q = null;
        R = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + kwk.b(1, a) + kwk.e(2, c);
        int i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.b(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.b(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int j2;
                int j3;
                for (j2 = 0; j1 < g.length; j2 = j3)
                {
                    String s1 = g[j1];
                    int j4 = k1;
                    j3 = j2;
                    if (s1 != null)
                    {
                        j3 = j2 + 1;
                        j4 = k1 + kwk.a(s1);
                    }
                    j1++;
                    k1 = j4;
                }

                j1 = i1 + k1 + j2 * 1;
            }
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(7, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.b(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.b(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            k.booleanValue();
            j1 = i1 + (kwk.f(10) + 1);
        }
        i1 = j1;
        if (l != null)
        {
            l.booleanValue();
            i1 = j1 + (kwk.f(11) + 1);
        }
        j1 = i1;
        if (m != 0x80000000)
        {
            j1 = i1 + kwk.e(12, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.d(13, n);
        }
        j1 = i1;
        if (o != null)
        {
            o.booleanValue();
            j1 = i1 + (kwk.f(14) + 1);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.b(15, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + kwk.d(16, q);
        }
        int l1 = j1;
        if (r != 0x80000000)
        {
            l1 = j1 + kwk.e(17, r);
        }
        i1 = l1;
        if (s != null)
        {
            i1 = l1 + kwk.d(18, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1;
            if (t.length > 0)
            {
                for (j1 = 0; j1 < t.length;)
                {
                    kzv kzv1 = t[j1];
                    l1 = i1;
                    if (kzv1 != null)
                    {
                        l1 = i1 + kwk.d(19, kzv1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (u != null)
        {
            u.booleanValue();
            i1 = j1 + (kwk.f(20) + 1);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.b(21, v);
        }
        i1 = j1;
        if (w != null)
        {
            w.booleanValue();
            i1 = j1 + (kwk.f(22) + 1);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + kwk.b(23, x);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + kwk.b(24, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1 + kwk.b(25, z);
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + kwk.b(26, A);
        }
        l1 = i1;
        if (B != null)
        {
            l1 = i1 + kwk.b(27, B);
        }
        j1 = l1;
        if (C != null)
        {
            C.booleanValue();
            j1 = l1 + (kwk.f(28) + 1);
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1;
            if (D.length > 0)
            {
                i1 = 0;
                l1 = 0;
                for (; i1 < D.length; i1++)
                {
                    l1 += kwk.e(D[i1]);
                }

                i1 = j1 + l1 + D.length * 2;
            }
        }
        j1 = i1;
        if (E != null)
        {
            j1 = i1;
            if (E.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int k2;
                int k3;
                for (k2 = 0; j1 < E.length; k2 = k3)
                {
                    String s2 = E[j1];
                    int k4 = l1;
                    k3 = k2;
                    if (s2 != null)
                    {
                        k3 = k2 + 1;
                        k4 = l1 + kwk.a(s2);
                    }
                    j1++;
                    l1 = k4;
                }

                j1 = i1 + l1 + k2 * 2;
            }
        }
        i1 = j1;
        if (F != null)
        {
            i1 = j1 + kwk.e(31, F.longValue());
        }
        j1 = i1;
        if (G != null)
        {
            j1 = i1 + kwk.b(32, G);
        }
        i1 = j1;
        if (H != null)
        {
            i1 = j1 + kwk.b(33, H);
        }
        j1 = i1;
        if (I != null)
        {
            j1 = i1;
            if (I.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int l2;
                int l3;
                for (l2 = 0; j1 < I.length; l2 = l3)
                {
                    String s3 = I[j1];
                    int l4 = l1;
                    l3 = l2;
                    if (s3 != null)
                    {
                        l3 = l2 + 1;
                        l4 = l1 + kwk.a(s3);
                    }
                    j1++;
                    l1 = l4;
                }

                j1 = i1 + l1 + l2 * 2;
            }
        }
        i1 = j1;
        if (J != 0x80000000)
        {
            i1 = j1 + kwk.e(35, J);
        }
        j1 = i1;
        if (K != null)
        {
            j1 = i1 + kwk.b(36, K);
        }
        i1 = j1;
        if (L != null)
        {
            L.booleanValue();
            i1 = j1 + (kwk.f(37) + 1);
        }
        j1 = i1;
        if (M != null)
        {
            j1 = i1;
            if (M.length > 0)
            {
                j1 = 0;
                l1 = 0;
                int i3;
                int i4;
                for (i3 = 0; j1 < M.length; i3 = i4)
                {
                    String s4 = M[j1];
                    int i5 = l1;
                    i4 = i3;
                    if (s4 != null)
                    {
                        i4 = i3 + 1;
                        i5 = l1 + kwk.a(s4);
                    }
                    j1++;
                    l1 = i5;
                }

                j1 = i1 + l1 + i3 * 2;
            }
        }
        l1 = j1;
        if (N != null)
        {
            l1 = j1 + kwk.b(39, N);
        }
        i1 = l1;
        if (O != null)
        {
            i1 = l1 + kwk.b(40, O);
        }
        j1 = i1;
        if (P != null)
        {
            j1 = i1;
            if (P.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= P.length)
                    {
                        break;
                    }
                    kzt kzt1 = P[i2];
                    j1 = i1;
                    if (kzt1 != null)
                    {
                        j1 = i1 + kwk.d(41, kzt1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (Q != null)
        {
            i1 = j1 + kwk.b(42, Q);
        }
        j1 = i1;
        if (R != null)
        {
            R.booleanValue();
            j1 = i1 + (kwk.f(43) + 1);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.b(44, b);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L48:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 46: default 388
    //                   0: 398
    //                   10: 400
    //                   16: 411
    //                   26: 472
    //                   34: 483
    //                   42: 494
    //                   50: 505
    //                   58: 614
    //                   66: 625
    //                   74: 636
    //                   80: 647
    //                   88: 661
    //                   96: 675
    //                   106: 1192
    //                   112: 1221
    //                   122: 1235
    //                   130: 1246
    //                   136: 1275
    //                   146: 1320
    //                   154: 1349
    //                   160: 1481
    //                   170: 1495
    //                   176: 1506
    //                   186: 1520
    //                   194: 1531
    //                   202: 1542
    //                   210: 1553
    //                   218: 1564
    //                   224: 1575
    //                   232: 1589
    //                   234: 1772
    //                   242: 1970
    //                   248: 2080
    //                   258: 2094
    //                   266: 2105
    //                   274: 2116
    //                   280: 2226
    //                   290: 2268
    //                   296: 2279
    //                   306: 2293
    //                   314: 2403
    //                   322: 2414
    //                   330: 2425
    //                   338: 2557
    //                   344: 2568
    //                   354: 2582;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L48; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L48
_L4:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            c = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        int k2 = kwx.a(kwj1, 50);
        String as[];
        if (g == null)
        {
            i1 = 0;
        } else
        {
            i1 = g.length;
        }
        as = new String[k2 + i1];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(g, 0, as, 0, i1);
            k2 = i1;
        }
        for (; k2 < as.length - 1; k2++)
        {
            as[k2] = kwj1.j();
            kwj1.a();
        }

        as[k2] = kwj1.j();
        g = as;
        continue; /* Loop/switch isn't completed */
_L9:
        h = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        k = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L13:
        l = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L14:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
        case 47: // '/'
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
        case 58: // ':'
        case 59: // ';'
        case 60: // '<'
        case 61: // '='
        case 62: // '>'
        case 63: // '?'
        case 64: // '@'
        case 65: // 'A'
        case 66: // 'B'
        case 67: // 'C'
        case 68: // 'D'
        case 69: // 'E'
        case 70: // 'F'
        case 71: // 'G'
        case 72: // 'H'
        case 73: // 'I'
        case 74: // 'J'
        case 75: // 'K'
        case 76: // 'L'
        case 77: // 'M'
        case 78: // 'N'
        case 79: // 'O'
        case 80: // 'P'
        case 81: // 'Q'
        case 82: // 'R'
        case 83: // 'S'
        case 84: // 'T'
        case 85: // 'U'
        case 86: // 'V'
        case 87: // 'W'
        case 88: // 'X'
        case 89: // 'Y'
        case 90: // 'Z'
        case 91: // '['
        case 92: // '\\'
        case 93: // ']'
        case 94: // '^'
        case 95: // '_'
        case 96: // '`'
        case 97: // 'a'
        case 98: // 'b'
        case 99: // 'c'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        case 106: // 'j'
        case 107: // 'k'
        case 108: // 'l'
        case 109: // 'm'
        case 110: // 'n'
        case 111: // 'o'
        case 112: // 'p'
        case 113: // 'q'
        case 114: // 'r'
        case 115: // 's'
        case 116: // 't'
        case 117: // 'u'
        case 118: // 'v'
        case 119: // 'w'
        case 120: // 'x'
            m = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        if (n == null)
        {
            n = new kzu();
        }
        kwj1.a(n);
        continue; /* Loop/switch isn't completed */
_L16:
        o = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        p = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        if (q == null)
        {
            q = new kzx();
        }
        kwj1.a(q);
        continue; /* Loop/switch isn't completed */
_L19:
        i1 = kwj1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            r = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        if (s == null)
        {
            s = new kzr();
        }
        kwj1.a(s);
        continue; /* Loop/switch isn't completed */
_L21:
        int l2 = kwx.a(kwj1, 154);
        kzv akzv[];
        if (t == null)
        {
            i1 = 0;
        } else
        {
            i1 = t.length;
        }
        akzv = new kzv[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(t, 0, akzv, 0, i1);
            l2 = i1;
        }
        for (; l2 < akzv.length - 1; l2++)
        {
            akzv[l2] = new kzv();
            kwj1.a(akzv[l2]);
            kwj1.a();
        }

        akzv[l2] = new kzv();
        kwj1.a(akzv[l2]);
        t = akzv;
        continue; /* Loop/switch isn't completed */
_L22:
        u = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L23:
        v = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L24:
        w = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L25:
        x = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L26:
        y = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L27:
        z = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L28:
        A = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L29:
        B = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L30:
        C = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L31:
        int ai[];
        int i3;
        int l4;
        l4 = kwx.a(kwj1, 232);
        ai = new int[l4];
        i3 = 0;
        i1 = 0;
_L54:
        if (i3 >= l4) goto _L50; else goto _L49
_L49:
        int i5;
        if (i3 != 0)
        {
            kwj1.a();
        }
        i5 = kwj1.f();
        i5;
        JVM INSTR tableswitch 0 1: default 1656
    //                   0 1665
    //                   1 1665;
           goto _L51 _L52 _L52
_L51:
        i3++;
        continue; /* Loop/switch isn't completed */
_L52:
        int j4 = i1 + 1;
        ai[i1] = i5;
        i1 = j4;
        if (true) goto _L51; else goto _L50
_L50:
        if (i1 != 0)
        {
            if (D == null)
            {
                i3 = 0;
            } else
            {
                i3 = D.length;
            }
            if (i3 == 0 && i1 == ai.length)
            {
                D = ai;
            } else
            {
                int ai1[] = new int[i3 + i1];
                if (i3 != 0)
                {
                    System.arraycopy(D, 0, ai1, 0, i3);
                }
                System.arraycopy(ai, 0, ai1, i3, i1);
                D = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L54; else goto _L53
_L53:
_L32:
        int k4;
        k4 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        i3 = 0;
_L60:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
                i3++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i3 == 0) goto _L56; else goto _L55
_L55:
        kwj1.e(i1);
        if (D == null)
        {
            i1 = 0;
        } else
        {
            i1 = D.length;
        }
        ai = new int[i3 + i1];
        i3 = i1;
        if (i1 != 0)
        {
            System.arraycopy(D, 0, ai, 0, i1);
            i3 = i1;
        }
_L58:
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
                ai[i3] = i1;
                i3++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        D = ai;
_L56:
        kwj1.d(k4);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L58; else goto _L57
_L57:
        if (true) goto _L60; else goto _L59
_L59:
_L33:
        int j3 = kwx.a(kwj1, 242);
        String as1[];
        int j1;
        if (E == null)
        {
            j1 = 0;
        } else
        {
            j1 = E.length;
        }
        as1 = new String[j3 + j1];
        j3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(E, 0, as1, 0, j1);
            j3 = j1;
        }
        for (; j3 < as1.length - 1; j3++)
        {
            as1[j3] = kwj1.j();
            kwj1.a();
        }

        as1[j3] = kwj1.j();
        E = as1;
        continue; /* Loop/switch isn't completed */
_L34:
        F = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L35:
        G = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L36:
        H = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L37:
        int k3 = kwx.a(kwj1, 274);
        String as2[];
        int k1;
        if (I == null)
        {
            k1 = 0;
        } else
        {
            k1 = I.length;
        }
        as2 = new String[k3 + k1];
        k3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(I, 0, as2, 0, k1);
            k3 = k1;
        }
        for (; k3 < as2.length - 1; k3++)
        {
            as2[k3] = kwj1.j();
            kwj1.a();
        }

        as2[k3] = kwj1.j();
        I = as2;
        continue; /* Loop/switch isn't completed */
_L38:
        int l1 = kwj1.f();
        switch (l1)
        {
        case 1: // '\001'
        case 2: // '\002'
            J = l1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L39:
        K = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L40:
        L = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L41:
        int l3 = kwx.a(kwj1, 306);
        String as3[];
        int i2;
        if (M == null)
        {
            i2 = 0;
        } else
        {
            i2 = M.length;
        }
        as3 = new String[l3 + i2];
        l3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(M, 0, as3, 0, i2);
            l3 = i2;
        }
        for (; l3 < as3.length - 1; l3++)
        {
            as3[l3] = kwj1.j();
            kwj1.a();
        }

        as3[l3] = kwj1.j();
        M = as3;
        continue; /* Loop/switch isn't completed */
_L42:
        N = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L43:
        O = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L44:
        int i4 = kwx.a(kwj1, 330);
        kzt akzt[];
        int j2;
        if (P == null)
        {
            j2 = 0;
        } else
        {
            j2 = P.length;
        }
        akzt = new kzt[i4 + j2];
        i4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(P, 0, akzt, 0, j2);
            i4 = j2;
        }
        for (; i4 < akzt.length - 1; i4++)
        {
            akzt[i4] = new kzt();
            kwj1.a(akzt[i4]);
            kwj1.a();
        }

        akzt[i4] = new kzt();
        kwj1.a(akzt[i4]);
        P = akzt;
        continue; /* Loop/switch isn't completed */
_L45:
        Q = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L46:
        R = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L47:
        b = kwj1.j();
        if (true) goto _L48; else goto _L61
_L61:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(1, a);
        kwk1.a(2, c);
        if (d != null)
        {
            kwk1.a(3, d);
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (f != null)
        {
            kwk1.a(5, f);
        }
        if (g != null && g.length > 0)
        {
            for (int i1 = 0; i1 < g.length; i1++)
            {
                String s1 = g[i1];
                if (s1 != null)
                {
                    kwk1.a(6, s1);
                }
            }

        }
        if (h != null)
        {
            kwk1.a(7, h);
        }
        if (i != null)
        {
            kwk1.a(8, i);
        }
        if (j != null)
        {
            kwk1.a(9, j);
        }
        if (k != null)
        {
            kwk1.a(10, k.booleanValue());
        }
        if (l != null)
        {
            kwk1.a(11, l.booleanValue());
        }
        if (m != 0x80000000)
        {
            kwk1.a(12, m);
        }
        if (n != null)
        {
            kwk1.b(13, n);
        }
        if (o != null)
        {
            kwk1.a(14, o.booleanValue());
        }
        if (p != null)
        {
            kwk1.a(15, p);
        }
        if (q != null)
        {
            kwk1.b(16, q);
        }
        if (r != 0x80000000)
        {
            kwk1.a(17, r);
        }
        if (s != null)
        {
            kwk1.b(18, s);
        }
        if (t != null && t.length > 0)
        {
            for (int j1 = 0; j1 < t.length; j1++)
            {
                kzv kzv1 = t[j1];
                if (kzv1 != null)
                {
                    kwk1.b(19, kzv1);
                }
            }

        }
        if (u != null)
        {
            kwk1.a(20, u.booleanValue());
        }
        if (v != null)
        {
            kwk1.a(21, v);
        }
        if (w != null)
        {
            kwk1.a(22, w.booleanValue());
        }
        if (x != null)
        {
            kwk1.a(23, x);
        }
        if (y != null)
        {
            kwk1.a(24, y);
        }
        if (z != null)
        {
            kwk1.a(25, z);
        }
        if (A != null)
        {
            kwk1.a(26, A);
        }
        if (B != null)
        {
            kwk1.a(27, B);
        }
        if (C != null)
        {
            kwk1.a(28, C.booleanValue());
        }
        if (D != null && D.length > 0)
        {
            for (int k1 = 0; k1 < D.length; k1++)
            {
                kwk1.a(29, D[k1]);
            }

        }
        if (E != null && E.length > 0)
        {
            for (int l1 = 0; l1 < E.length; l1++)
            {
                String s2 = E[l1];
                if (s2 != null)
                {
                    kwk1.a(30, s2);
                }
            }

        }
        if (F != null)
        {
            kwk1.b(31, F.longValue());
        }
        if (G != null)
        {
            kwk1.a(32, G);
        }
        if (H != null)
        {
            kwk1.a(33, H);
        }
        if (I != null && I.length > 0)
        {
            for (int i2 = 0; i2 < I.length; i2++)
            {
                String s3 = I[i2];
                if (s3 != null)
                {
                    kwk1.a(34, s3);
                }
            }

        }
        if (J != 0x80000000)
        {
            kwk1.a(35, J);
        }
        if (K != null)
        {
            kwk1.a(36, K);
        }
        if (L != null)
        {
            kwk1.a(37, L.booleanValue());
        }
        if (M != null && M.length > 0)
        {
            for (int j2 = 0; j2 < M.length; j2++)
            {
                String s4 = M[j2];
                if (s4 != null)
                {
                    kwk1.a(38, s4);
                }
            }

        }
        if (N != null)
        {
            kwk1.a(39, N);
        }
        if (O != null)
        {
            kwk1.a(40, O);
        }
        if (P != null && P.length > 0)
        {
            for (int k2 = ((flag) ? 1 : 0); k2 < P.length; k2++)
            {
                kzt kzt1 = P[k2];
                if (kzt1 != null)
                {
                    kwk1.b(41, kzt1);
                }
            }

        }
        if (Q != null)
        {
            kwk1.a(42, Q);
        }
        if (R != null)
        {
            kwk1.a(43, R.booleanValue());
        }
        if (b != null)
        {
            kwk1.a(44, b);
        }
        super.writeTo(kwk1);
    }
}
