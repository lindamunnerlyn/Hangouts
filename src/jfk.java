// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfk extends koj
{

    public jfi A;
    public Long B;
    public String C;
    public String D;
    public jfg E[];
    public Integer a;
    public jfm b;
    public String c;
    public Integer d;
    public int e[];
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public String j;
    public String k;
    public jfn l[];
    public jfn m;
    public Long n;
    public String o;
    public Long p;
    public Integer q;
    public Integer r;
    public Boolean s;
    public Long t;
    public Integer u;
    public jfg v;
    public Integer w;
    public jfl x;
    public String y;
    public jfj z[];

    public jfk()
    {
        a = null;
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
        l = jfn.a();
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = jfj.a();
        A = null;
        B = null;
        C = null;
        D = null;
        E = jfg.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + koh.e(1, a.intValue());
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.d(2, b);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.e(3, d.intValue());
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.e(4, f.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.e(5, g.intValue());
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.e(6, h.intValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.e(7, i.intValue());
        }
        int l1 = j1;
        if (j != null)
        {
            l1 = j1 + koh.b(8, j);
        }
        i1 = l1;
        if (k != null)
        {
            i1 = l1 + koh.b(9, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                for (j1 = 0; j1 < l.length;)
                {
                    jfn jfn1 = l[j1];
                    l1 = i1;
                    if (jfn1 != null)
                    {
                        l1 = i1 + koh.d(10, jfn1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.d(11, n.longValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                j1 = 0;
                l1 = 0;
                for (; j1 < e.length; j1++)
                {
                    l1 += koh.e(e[j1]);
                }

                j1 = i1 + l1 + e.length * 1;
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + koh.d(13, m);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + koh.b(14, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + koh.d(15, p.longValue());
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + koh.f(16, q.intValue());
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + koh.e(17, r.intValue());
        }
        j1 = i1;
        if (s != null)
        {
            s.booleanValue();
            j1 = i1 + (koh.f(18) + 1);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + koh.d(19, t.longValue());
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(20, c);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + koh.e(21, u.intValue());
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + koh.d(22, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + koh.e(23, w.intValue());
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + koh.d(24, x);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + koh.b(25, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1;
            if (z.length > 0)
            {
                for (j1 = 0; j1 < z.length;)
                {
                    jfj jfj1 = z[j1];
                    l1 = i1;
                    if (jfj1 != null)
                    {
                        l1 = i1 + koh.d(26, jfj1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + koh.d(27, A);
        }
        j1 = i1;
        if (B != null)
        {
            j1 = i1 + koh.d(28, B.longValue());
        }
        l1 = j1;
        if (C != null)
        {
            l1 = j1 + koh.b(29, C);
        }
        i1 = l1;
        if (D != null)
        {
            i1 = l1 + koh.b(30, D);
        }
        l1 = i1;
        if (E != null)
        {
            l1 = i1;
            if (E.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    l1 = i1;
                    if (k1 >= E.length)
                    {
                        break;
                    }
                    jfg jfg1 = E[k1];
                    l1 = i1;
                    if (jfg1 != null)
                    {
                        l1 = i1 + koh.d(31, jfg1);
                    }
                    k1++;
                    i1 = l1;
                } while (true);
            }
        }
        return l1;
    }

    public kop mergeFrom(kog kog1)
    {
_L35:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 33: default 284
    //                   0: 294
    //                   8: 296
    //                   18: 523
    //                   24: 552
    //                   32: 643
    //                   40: 751
    //                   48: 975
    //                   56: 989
    //                   66: 1047
    //                   74: 1058
    //                   82: 1069
    //                   88: 1200
    //                   96: 1214
    //                   98: 1816
    //                   106: 2854
    //                   114: 2883
    //                   120: 2894
    //                   128: 2908
    //                   136: 2922
    //                   144: 3143
    //                   152: 3157
    //                   162: 3171
    //                   168: 3182
    //                   178: 3235
    //                   184: 3264
    //                   194: 3327
    //                   202: 3356
    //                   210: 3367
    //                   218: 3499
    //                   224: 3528
    //                   234: 3542
    //                   242: 3553
    //                   250: 3564;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L35; else goto _L2
_L2:
        return this;
_L3:
        i1 = kog1.f();
        switch (i1)
        {
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
            a = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new jfm();
        }
        kog1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = kog1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 701: 
        case 702: 
        case 703: 
        case 704: 
            d = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = kog1.f();
        switch (i1)
        {
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
            f = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = kog1.f();
        switch (i1)
        {
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
            g = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        h = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        i1 = kog1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            i = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        j = kog1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        k = kog1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        int k2 = kou.b(kog1, 82);
        jfn ajfn[];
        if (l == null)
        {
            i1 = 0;
        } else
        {
            i1 = l.length;
        }
        ajfn = new jfn[k2 + i1];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(l, 0, ajfn, 0, i1);
            k2 = i1;
        }
        for (; k2 < ajfn.length - 1; k2++)
        {
            ajfn[k2] = new jfn();
            kog1.a(ajfn[k2]);
            kog1.a();
        }

        ajfn[k2] = new jfn();
        kog1.a(ajfn[k2]);
        l = ajfn;
        continue; /* Loop/switch isn't completed */
_L13:
        n = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L14:
        int ai[];
        int l2;
        int i4;
        i4 = kou.b(kog1, 96);
        ai = new int[i4];
        l2 = 0;
        i1 = 0;
_L41:
        if (l2 >= i4) goto _L37; else goto _L36
_L36:
        int j4;
        if (l2 != 0)
        {
            kog1.a();
        }
        j4 = kog1.f();
        j4;
        JVM INSTR lookupswitch 54: default 1700
    //                   0: 1709
    //                   100: 1709
    //                   101: 1709
    //                   102: 1709
    //                   103: 1709
    //                   104: 1709
    //                   105: 1709
    //                   106: 1709
    //                   107: 1709
    //                   108: 1709
    //                   109: 1709
    //                   110: 1709
    //                   111: 1709
    //                   112: 1709
    //                   113: 1709
    //                   114: 1709
    //                   115: 1709
    //                   116: 1709
    //                   117: 1709
    //                   118: 1709
    //                   119: 1709
    //                   300: 1709
    //                   301: 1709
    //                   302: 1709
    //                   303: 1709
    //                   304: 1709
    //                   305: 1709
    //                   501: 1709
    //                   502: 1709
    //                   503: 1709
    //                   504: 1709
    //                   505: 1709
    //                   506: 1709
    //                   507: 1709
    //                   701: 1709
    //                   702: 1709
    //                   703: 1709
    //                   704: 1709
    //                   705: 1709
    //                   706: 1709
    //                   801: 1709
    //                   802: 1709
    //                   803: 1709
    //                   901: 1709
    //                   902: 1709
    //                   903: 1709
    //                   904: 1709
    //                   905: 1709
    //                   1001: 1709
    //                   1002: 1709
    //                   1003: 1709
    //                   1004: 1709
    //                   1100: 1709
    //                   1101: 1709;
           goto _L38 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39
_L38:
        l2++;
        continue; /* Loop/switch isn't completed */
_L39:
        int k3 = i1 + 1;
        ai[i1] = j4;
        i1 = k3;
        if (true) goto _L38; else goto _L37
_L37:
        if (i1 != 0)
        {
            if (e == null)
            {
                l2 = 0;
            } else
            {
                l2 = e.length;
            }
            if (l2 == 0 && i1 == ai.length)
            {
                e = ai;
            } else
            {
                int ai1[] = new int[l2 + i1];
                if (l2 != 0)
                {
                    System.arraycopy(e, 0, ai1, 0, l2);
                }
                System.arraycopy(ai, 0, ai1, l2, i1);
                e = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L41; else goto _L40
_L40:
_L15:
        int l3;
        l3 = kog1.c(kog1.p());
        i1 = kog1.r();
        l2 = 0;
_L47:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
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
            case 300: 
            case 301: 
            case 302: 
            case 303: 
            case 304: 
            case 305: 
            case 501: 
            case 502: 
            case 503: 
            case 504: 
            case 505: 
            case 506: 
            case 507: 
            case 701: 
            case 702: 
            case 703: 
            case 704: 
            case 705: 
            case 706: 
            case 801: 
            case 802: 
            case 803: 
            case 901: 
            case 902: 
            case 903: 
            case 904: 
            case 905: 
            case 1001: 
            case 1002: 
            case 1003: 
            case 1004: 
            case 1100: 
            case 1101: 
                l2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l2 == 0) goto _L43; else goto _L42
_L42:
        kog1.e(i1);
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        ai = new int[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, ai, 0, i1);
            l2 = i1;
        }
_L45:
        if (kog1.q() > 0)
        {
            i1 = kog1.f();
            switch (i1)
            {
            case 0: // '\0'
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
            case 300: 
            case 301: 
            case 302: 
            case 303: 
            case 304: 
            case 305: 
            case 501: 
            case 502: 
            case 503: 
            case 504: 
            case 505: 
            case 506: 
            case 507: 
            case 701: 
            case 702: 
            case 703: 
            case 704: 
            case 705: 
            case 706: 
            case 801: 
            case 802: 
            case 803: 
            case 901: 
            case 902: 
            case 903: 
            case 904: 
            case 905: 
            case 1001: 
            case 1002: 
            case 1003: 
            case 1004: 
            case 1100: 
            case 1101: 
                ai[l2] = i1;
                l2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        e = ai;
_L43:
        kog1.d(l3);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L45; else goto _L44
_L44:
        if (true) goto _L47; else goto _L46
_L46:
_L16:
        if (m == null)
        {
            m = new jfn();
        }
        kog1.a(m);
        continue; /* Loop/switch isn't completed */
_L17:
        o = kog1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        p = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L19:
        q = Integer.valueOf(kog1.l());
        continue; /* Loop/switch isn't completed */
_L20:
        int j1 = kog1.f();
        switch (j1)
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
            r = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L21:
        s = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L22:
        t = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L23:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L24:
        int k1 = kog1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            u = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L25:
        if (v == null)
        {
            v = new jfg();
        }
        kog1.a(v);
        continue; /* Loop/switch isn't completed */
_L26:
        int l1 = kog1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            w = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L27:
        if (x == null)
        {
            x = new jfl();
        }
        kog1.a(x);
        continue; /* Loop/switch isn't completed */
_L28:
        y = kog1.j();
        continue; /* Loop/switch isn't completed */
_L29:
        int i3 = kou.b(kog1, 210);
        jfj ajfj[];
        int i2;
        if (z == null)
        {
            i2 = 0;
        } else
        {
            i2 = z.length;
        }
        ajfj = new jfj[i3 + i2];
        i3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(z, 0, ajfj, 0, i2);
            i3 = i2;
        }
        for (; i3 < ajfj.length - 1; i3++)
        {
            ajfj[i3] = new jfj();
            kog1.a(ajfj[i3]);
            kog1.a();
        }

        ajfj[i3] = new jfj();
        kog1.a(ajfj[i3]);
        z = ajfj;
        continue; /* Loop/switch isn't completed */
_L30:
        if (A == null)
        {
            A = new jfi();
        }
        kog1.a(A);
        continue; /* Loop/switch isn't completed */
_L31:
        B = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L32:
        C = kog1.j();
        continue; /* Loop/switch isn't completed */
_L33:
        D = kog1.j();
        continue; /* Loop/switch isn't completed */
_L34:
        int j3 = kou.b(kog1, 250);
        jfg ajfg[];
        int j2;
        if (E == null)
        {
            j2 = 0;
        } else
        {
            j2 = E.length;
        }
        ajfg = new jfg[j3 + j2];
        j3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(E, 0, ajfg, 0, j2);
            j3 = j2;
        }
        for (; j3 < ajfg.length - 1; j3++)
        {
            ajfg[j3] = new jfg();
            kog1.a(ajfg[j3]);
            kog1.a();
        }

        ajfg[j3] = new jfg();
        kog1.a(ajfg[j3]);
        E = ajfg;
        if (true) goto _L35; else goto _L48
_L48:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        koh1.a(1, a.intValue());
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (d != null)
        {
            koh1.a(3, d.intValue());
        }
        if (f != null)
        {
            koh1.a(4, f.intValue());
        }
        if (g != null)
        {
            koh1.a(5, g.intValue());
        }
        if (h != null)
        {
            koh1.a(6, h.intValue());
        }
        if (i != null)
        {
            koh1.a(7, i.intValue());
        }
        if (j != null)
        {
            koh1.a(8, j);
        }
        if (k != null)
        {
            koh1.a(9, k);
        }
        if (l != null && l.length > 0)
        {
            for (int i1 = 0; i1 < l.length; i1++)
            {
                jfn jfn1 = l[i1];
                if (jfn1 != null)
                {
                    koh1.b(10, jfn1);
                }
            }

        }
        if (n != null)
        {
            koh1.a(11, n.longValue());
        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                koh1.a(12, e[j1]);
            }

        }
        if (m != null)
        {
            koh1.b(13, m);
        }
        if (o != null)
        {
            koh1.a(14, o);
        }
        if (p != null)
        {
            koh1.a(15, p.longValue());
        }
        if (q != null)
        {
            koh1.c(16, q.intValue());
        }
        if (r != null)
        {
            koh1.a(17, r.intValue());
        }
        if (s != null)
        {
            koh1.a(18, s.booleanValue());
        }
        if (t != null)
        {
            koh1.a(19, t.longValue());
        }
        if (c != null)
        {
            koh1.a(20, c);
        }
        if (u != null)
        {
            koh1.a(21, u.intValue());
        }
        if (v != null)
        {
            koh1.b(22, v);
        }
        if (w != null)
        {
            koh1.a(23, w.intValue());
        }
        if (x != null)
        {
            koh1.b(24, x);
        }
        if (y != null)
        {
            koh1.a(25, y);
        }
        if (z != null && z.length > 0)
        {
            for (int k1 = 0; k1 < z.length; k1++)
            {
                jfj jfj1 = z[k1];
                if (jfj1 != null)
                {
                    koh1.b(26, jfj1);
                }
            }

        }
        if (A != null)
        {
            koh1.b(27, A);
        }
        if (B != null)
        {
            koh1.a(28, B.longValue());
        }
        if (C != null)
        {
            koh1.a(29, C);
        }
        if (D != null)
        {
            koh1.a(30, D);
        }
        if (E != null && E.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < E.length; l1++)
            {
                jfg jfg1 = E[l1];
                if (jfg1 != null)
                {
                    koh1.b(31, jfg1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
