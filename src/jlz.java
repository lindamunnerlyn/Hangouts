// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jlz extends kwm
{

    public jlx A;
    public Long B;
    public String C;
    public String D;
    public jlv E[];
    public Integer a;
    public jmb b;
    public String c;
    public Integer d;
    public int e[];
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public String j;
    public String k;
    public jmc l[];
    public jmc m;
    public Long n;
    public String o;
    public Long p;
    public Integer q;
    public Integer r;
    public Boolean s;
    public Long t;
    public Integer u;
    public jlv v;
    public Integer w;
    public jma x;
    public String y;
    public jly z[];

    public jlz()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kwx.a;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = jmc.a();
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
        z = jly.a();
        A = null;
        B = null;
        C = null;
        D = null;
        E = jlv.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + kwk.e(1, a.intValue());
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.d(2, b);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.e(3, d.intValue());
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.e(4, f.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.e(5, g.intValue());
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.e(6, h.intValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.e(7, i.intValue());
        }
        int l1 = j1;
        if (j != null)
        {
            l1 = j1 + kwk.b(8, j);
        }
        i1 = l1;
        if (k != null)
        {
            i1 = l1 + kwk.b(9, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                for (j1 = 0; j1 < l.length;)
                {
                    jmc jmc1 = l[j1];
                    l1 = i1;
                    if (jmc1 != null)
                    {
                        l1 = i1 + kwk.d(10, jmc1);
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
            i1 = j1 + kwk.d(11, n.longValue());
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
                    l1 += kwk.e(e[j1]);
                }

                j1 = i1 + l1 + e.length * 1;
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.d(13, m);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.b(14, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.d(15, p.longValue());
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + kwk.f(16, q.intValue());
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + kwk.e(17, r.intValue());
        }
        j1 = i1;
        if (s != null)
        {
            s.booleanValue();
            j1 = i1 + (kwk.f(18) + 1);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + kwk.d(19, t.longValue());
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(20, c);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + kwk.e(21, u.intValue());
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + kwk.d(22, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + kwk.e(23, w.intValue());
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + kwk.d(24, x);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + kwk.b(25, y);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1;
            if (z.length > 0)
            {
                for (j1 = 0; j1 < z.length;)
                {
                    jly jly1 = z[j1];
                    l1 = i1;
                    if (jly1 != null)
                    {
                        l1 = i1 + kwk.d(26, jly1);
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
            i1 = j1 + kwk.d(27, A);
        }
        j1 = i1;
        if (B != null)
        {
            j1 = i1 + kwk.d(28, B.longValue());
        }
        l1 = j1;
        if (C != null)
        {
            l1 = j1 + kwk.b(29, C);
        }
        i1 = l1;
        if (D != null)
        {
            i1 = l1 + kwk.b(30, D);
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
                    jlv jlv1 = E[k1];
                    l1 = i1;
                    if (jlv1 != null)
                    {
                        l1 = i1 + kwk.d(31, jlv1);
                    }
                    k1++;
                    i1 = l1;
                } while (true);
            }
        }
        return l1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L35:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 33: default 284
    //                   0: 294
    //                   8: 296
    //                   18: 527
    //                   24: 556
    //                   32: 647
    //                   40: 755
    //                   48: 983
    //                   56: 997
    //                   66: 1055
    //                   74: 1066
    //                   82: 1077
    //                   88: 1208
    //                   96: 1222
    //                   98: 1824
    //                   106: 2862
    //                   114: 2891
    //                   120: 2902
    //                   128: 2916
    //                   136: 2930
    //                   144: 3151
    //                   152: 3165
    //                   162: 3179
    //                   168: 3190
    //                   178: 3243
    //                   184: 3272
    //                   194: 3335
    //                   202: 3364
    //                   210: 3375
    //                   218: 3507
    //                   224: 3536
    //                   234: 3550
    //                   242: 3561
    //                   250: 3572;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L35; else goto _L2
_L2:
        return this;
_L3:
        i1 = kwj1.f();
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
        case 48: // '0'
            a = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new jmb();
        }
        kwj1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = kwj1.f();
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
        i1 = kwj1.f();
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
        i1 = kwj1.f();
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
        case 48: // '0'
            g = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        h = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        i1 = kwj1.f();
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
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        int k2 = kwx.a(kwj1, 82);
        jmc ajmc[];
        if (l == null)
        {
            i1 = 0;
        } else
        {
            i1 = l.length;
        }
        ajmc = new jmc[k2 + i1];
        k2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(l, 0, ajmc, 0, i1);
            k2 = i1;
        }
        for (; k2 < ajmc.length - 1; k2++)
        {
            ajmc[k2] = new jmc();
            kwj1.a(ajmc[k2]);
            kwj1.a();
        }

        ajmc[k2] = new jmc();
        kwj1.a(ajmc[k2]);
        l = ajmc;
        continue; /* Loop/switch isn't completed */
_L13:
        n = Long.valueOf(kwj1.d());
        continue; /* Loop/switch isn't completed */
_L14:
        int ai[];
        int l2;
        int i4;
        i4 = kwx.a(kwj1, 96);
        ai = new int[i4];
        l2 = 0;
        i1 = 0;
_L41:
        if (l2 >= i4) goto _L37; else goto _L36
_L36:
        int j4;
        if (l2 != 0)
        {
            kwj1.a();
        }
        j4 = kwj1.f();
        j4;
        JVM INSTR lookupswitch 54: default 1708
    //                   0: 1717
    //                   100: 1717
    //                   101: 1717
    //                   102: 1717
    //                   103: 1717
    //                   104: 1717
    //                   105: 1717
    //                   106: 1717
    //                   107: 1717
    //                   108: 1717
    //                   109: 1717
    //                   110: 1717
    //                   111: 1717
    //                   112: 1717
    //                   113: 1717
    //                   114: 1717
    //                   115: 1717
    //                   116: 1717
    //                   117: 1717
    //                   118: 1717
    //                   119: 1717
    //                   300: 1717
    //                   301: 1717
    //                   302: 1717
    //                   303: 1717
    //                   304: 1717
    //                   305: 1717
    //                   501: 1717
    //                   502: 1717
    //                   503: 1717
    //                   504: 1717
    //                   505: 1717
    //                   506: 1717
    //                   507: 1717
    //                   701: 1717
    //                   702: 1717
    //                   703: 1717
    //                   704: 1717
    //                   705: 1717
    //                   706: 1717
    //                   801: 1717
    //                   802: 1717
    //                   803: 1717
    //                   901: 1717
    //                   902: 1717
    //                   903: 1717
    //                   904: 1717
    //                   905: 1717
    //                   1001: 1717
    //                   1002: 1717
    //                   1003: 1717
    //                   1004: 1717
    //                   1100: 1717
    //                   1101: 1717;
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
        l3 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        l2 = 0;
_L47:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
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
        kwj1.e(i1);
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
        if (kwj1.q() > 0)
        {
            i1 = kwj1.f();
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
        kwj1.d(l3);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L45; else goto _L44
_L44:
        if (true) goto _L47; else goto _L46
_L46:
_L16:
        if (m == null)
        {
            m = new jmc();
        }
        kwj1.a(m);
        continue; /* Loop/switch isn't completed */
_L17:
        o = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        p = Long.valueOf(kwj1.d());
        continue; /* Loop/switch isn't completed */
_L19:
        q = Integer.valueOf(kwj1.l());
        continue; /* Loop/switch isn't completed */
_L20:
        int j1 = kwj1.f();
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
        s = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L22:
        t = Long.valueOf(kwj1.d());
        continue; /* Loop/switch isn't completed */
_L23:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L24:
        int k1 = kwj1.f();
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
            v = new jlv();
        }
        kwj1.a(v);
        continue; /* Loop/switch isn't completed */
_L26:
        int l1 = kwj1.f();
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
            x = new jma();
        }
        kwj1.a(x);
        continue; /* Loop/switch isn't completed */
_L28:
        y = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L29:
        int i3 = kwx.a(kwj1, 210);
        jly ajly[];
        int i2;
        if (z == null)
        {
            i2 = 0;
        } else
        {
            i2 = z.length;
        }
        ajly = new jly[i3 + i2];
        i3 = i2;
        if (i2 != 0)
        {
            System.arraycopy(z, 0, ajly, 0, i2);
            i3 = i2;
        }
        for (; i3 < ajly.length - 1; i3++)
        {
            ajly[i3] = new jly();
            kwj1.a(ajly[i3]);
            kwj1.a();
        }

        ajly[i3] = new jly();
        kwj1.a(ajly[i3]);
        z = ajly;
        continue; /* Loop/switch isn't completed */
_L30:
        if (A == null)
        {
            A = new jlx();
        }
        kwj1.a(A);
        continue; /* Loop/switch isn't completed */
_L31:
        B = Long.valueOf(kwj1.d());
        continue; /* Loop/switch isn't completed */
_L32:
        C = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L33:
        D = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L34:
        int j3 = kwx.a(kwj1, 250);
        jlv ajlv[];
        int j2;
        if (E == null)
        {
            j2 = 0;
        } else
        {
            j2 = E.length;
        }
        ajlv = new jlv[j3 + j2];
        j3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(E, 0, ajlv, 0, j2);
            j3 = j2;
        }
        for (; j3 < ajlv.length - 1; j3++)
        {
            ajlv[j3] = new jlv();
            kwj1.a(ajlv[j3]);
            kwj1.a();
        }

        ajlv[j3] = new jlv();
        kwj1.a(ajlv[j3]);
        E = ajlv;
        if (true) goto _L35; else goto _L48
_L48:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(1, a.intValue());
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (d != null)
        {
            kwk1.a(3, d.intValue());
        }
        if (f != null)
        {
            kwk1.a(4, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(5, g.intValue());
        }
        if (h != null)
        {
            kwk1.a(6, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(7, i.intValue());
        }
        if (j != null)
        {
            kwk1.a(8, j);
        }
        if (k != null)
        {
            kwk1.a(9, k);
        }
        if (l != null && l.length > 0)
        {
            for (int i1 = 0; i1 < l.length; i1++)
            {
                jmc jmc1 = l[i1];
                if (jmc1 != null)
                {
                    kwk1.b(10, jmc1);
                }
            }

        }
        if (n != null)
        {
            kwk1.a(11, n.longValue());
        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                kwk1.a(12, e[j1]);
            }

        }
        if (m != null)
        {
            kwk1.b(13, m);
        }
        if (o != null)
        {
            kwk1.a(14, o);
        }
        if (p != null)
        {
            kwk1.a(15, p.longValue());
        }
        if (q != null)
        {
            kwk1.c(16, q.intValue());
        }
        if (r != null)
        {
            kwk1.a(17, r.intValue());
        }
        if (s != null)
        {
            kwk1.a(18, s.booleanValue());
        }
        if (t != null)
        {
            kwk1.a(19, t.longValue());
        }
        if (c != null)
        {
            kwk1.a(20, c);
        }
        if (u != null)
        {
            kwk1.a(21, u.intValue());
        }
        if (v != null)
        {
            kwk1.b(22, v);
        }
        if (w != null)
        {
            kwk1.a(23, w.intValue());
        }
        if (x != null)
        {
            kwk1.b(24, x);
        }
        if (y != null)
        {
            kwk1.a(25, y);
        }
        if (z != null && z.length > 0)
        {
            for (int k1 = 0; k1 < z.length; k1++)
            {
                jly jly1 = z[k1];
                if (jly1 != null)
                {
                    kwk1.b(26, jly1);
                }
            }

        }
        if (A != null)
        {
            kwk1.b(27, A);
        }
        if (B != null)
        {
            kwk1.a(28, B.longValue());
        }
        if (C != null)
        {
            kwk1.a(29, C);
        }
        if (D != null)
        {
            kwk1.a(30, D);
        }
        if (E != null && E.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < E.length; l1++)
            {
                jlv jlv1 = E[l1];
                if (jlv1 != null)
                {
                    kwk1.b(31, jlv1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
