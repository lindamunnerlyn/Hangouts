// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivp extends kwm
{

    public byte a[];
    public byte b[];
    public Integer c;
    public Boolean d;
    public Long e;
    public Long f;
    public Integer g;
    public Boolean h;
    public Long i;
    public Long j;
    public String k;
    public String l;
    public String m;
    public String n;
    public Integer o;
    public Integer p;
    public int q[];

    public ivp()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
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
        q = kwx.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + kwk.b(1, a);
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.b(2, b);
        }
        j1 = i1 + kwk.f(3, c.intValue());
        i1 = j1;
        if (d != null)
        {
            d.booleanValue();
            i1 = j1 + (kwk.f(5) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.d(6, i.longValue());
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.d(8, f.longValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.d(9, e.longValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.f(10, g.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.d(11, j.longValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(13, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.b(14, l);
        }
        i1 = j1;
        if (h != null)
        {
            h.booleanValue();
            i1 = j1 + (kwk.f(15) + 1);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + kwk.b(16, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + kwk.b(17, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + kwk.f(18, o.intValue());
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + kwk.e(19, p.intValue());
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                int k1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < q.length; j1++)
                {
                    k1 += kwk.e(q[j1]);
                }

                j1 = i1 + k1 + q.length * 2;
            }
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L21:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 19: default 172
    //                   0: 182
    //                   10: 184
    //                   18: 195
    //                   24: 206
    //                   40: 220
    //                   48: 234
    //                   64: 248
    //                   72: 262
    //                   80: 276
    //                   88: 290
    //                   106: 304
    //                   114: 315
    //                   120: 326
    //                   130: 340
    //                   138: 351
    //                   144: 362
    //                   152: 376
    //                   160: 443
    //                   162: 852;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L21; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.k();
          goto _L21
_L4:
        b = kwj1.k();
          goto _L21
_L5:
        c = Integer.valueOf(kwj1.l());
          goto _L21
_L6:
        d = Boolean.valueOf(kwj1.i());
          goto _L21
_L7:
        i = Long.valueOf(kwj1.d());
          goto _L21
_L8:
        f = Long.valueOf(kwj1.d());
          goto _L21
_L9:
        e = Long.valueOf(kwj1.d());
          goto _L21
_L10:
        g = Integer.valueOf(kwj1.l());
          goto _L21
_L11:
        j = Long.valueOf(kwj1.d());
          goto _L21
_L12:
        k = kwj1.j();
          goto _L21
_L13:
        l = kwj1.j();
          goto _L21
_L14:
        h = Boolean.valueOf(kwj1.i());
          goto _L21
_L15:
        m = kwj1.j();
          goto _L21
_L16:
        n = kwj1.j();
          goto _L21
_L17:
        o = Integer.valueOf(kwj1.l());
          goto _L21
_L18:
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
            p = Integer.valueOf(i1);
            break;
        }
          goto _L22
_L19:
        int ai[];
        int j1;
        int i2;
        i2 = kwx.a(kwj1, 160);
        ai = new int[i2];
        j1 = 0;
        i1 = 0;
_L29:
        if (j1 >= i2) goto _L24; else goto _L23
_L23:
        int j2;
        if (j1 != 0)
        {
            kwj1.a();
        }
        j2 = kwj1.f();
        j2;
        JVM INSTR tableswitch 0 57: default 736
    //                   0 745
    //                   1 745
    //                   2 745
    //                   3 745
    //                   4 745
    //                   5 745
    //                   6 745
    //                   7 745
    //                   8 745
    //                   9 745
    //                   10 745
    //                   11 745
    //                   12 745
    //                   13 745
    //                   14 745
    //                   15 745
    //                   16 745
    //                   17 745
    //                   18 745
    //                   19 745
    //                   20 745
    //                   21 745
    //                   22 745
    //                   23 745
    //                   24 745
    //                   25 745
    //                   26 745
    //                   27 745
    //                   28 745
    //                   29 745
    //                   30 736
    //                   31 745
    //                   32 745
    //                   33 745
    //                   34 745
    //                   35 745
    //                   36 745
    //                   37 745
    //                   38 745
    //                   39 745
    //                   40 745
    //                   41 745
    //                   42 745
    //                   43 745
    //                   44 745
    //                   45 745
    //                   46 745
    //                   47 745
    //                   48 745
    //                   49 745
    //                   50 745
    //                   51 745
    //                   52 745
    //                   53 745
    //                   54 745
    //                   55 745
    //                   56 745
    //                   57 745;
           goto _L25 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L25 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26 _L26
_L25:
        j1++;
          goto _L27
_L26:
        int k1 = i1 + 1;
        ai[i1] = j2;
        i1 = k1;
        if (true) goto _L25; else goto _L24
_L24:
        if (i1 != 0)
        {
            if (q == null)
            {
                j1 = 0;
            } else
            {
                j1 = q.length;
            }
            if (j1 == 0 && i1 == ai.length)
            {
                q = ai;
            } else
            {
                int ai1[] = new int[j1 + i1];
                if (j1 != 0)
                {
                    System.arraycopy(q, 0, ai1, 0, j1);
                }
                System.arraycopy(ai, 0, ai1, j1, i1);
                q = ai1;
            }
        }
          goto _L22
_L27:
        if (true) goto _L29; else goto _L28
_L28:
_L20:
        int l1;
        l1 = kwj1.c(kwj1.p());
        i1 = kwj1.r();
        j1 = 0;
_L38:
        if (kwj1.q() <= 0) goto _L31; else goto _L30
_L30:
        switch (kwj1.f())
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
            j1++;
            break;
        }
          goto _L32
_L31:
        if (j1 == 0) goto _L34; else goto _L33
_L33:
        kwj1.e(i1);
        if (q == null)
        {
            i1 = 0;
        } else
        {
            i1 = q.length;
        }
        ai = new int[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(q, 0, ai, 0, i1);
            j1 = i1;
        }
_L36:
        if (kwj1.q() > 0)
        {
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
                ai[j1] = i1;
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        q = ai;
_L34:
        kwj1.d(l1);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L36; else goto _L35
_L35:
_L32:
        if (true) goto _L38; else goto _L37
_L37:
_L22:
        if (true) goto _L21; else goto _L39
_L39:
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a);
        if (b != null)
        {
            kwk1.a(2, b);
        }
        kwk1.c(3, c.intValue());
        if (d != null)
        {
            kwk1.a(5, d.booleanValue());
        }
        if (i != null)
        {
            kwk1.a(6, i.longValue());
        }
        if (f != null)
        {
            kwk1.a(8, f.longValue());
        }
        if (e != null)
        {
            kwk1.a(9, e.longValue());
        }
        if (g != null)
        {
            kwk1.c(10, g.intValue());
        }
        if (j != null)
        {
            kwk1.a(11, j.longValue());
        }
        if (k != null)
        {
            kwk1.a(13, k);
        }
        if (l != null)
        {
            kwk1.a(14, l);
        }
        if (h != null)
        {
            kwk1.a(15, h.booleanValue());
        }
        if (m != null)
        {
            kwk1.a(16, m);
        }
        if (n != null)
        {
            kwk1.a(17, n);
        }
        if (o != null)
        {
            kwk1.c(18, o.intValue());
        }
        if (p != null)
        {
            kwk1.a(19, p.intValue());
        }
        if (q != null && q.length > 0)
        {
            for (int i1 = 0; i1 < q.length; i1++)
            {
                kwk1.a(20, q[i1]);
            }

        }
        super.writeTo(kwk1);
    }
}
