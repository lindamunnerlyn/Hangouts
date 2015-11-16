// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jho extends kwm
{

    public String a;
    public String b;
    public Integer c;
    public jif d;
    public String e[];
    public jid f[];
    public jdk requestHeader;

    public jho()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = kwx.f;
        f = jid.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.b(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(3, b);
        }
        int l = i;
        if (d != null)
        {
            l = i + kwk.d(4, d);
        }
        j = l;
        if (c != null)
        {
            j = l + kwk.e(5, c.intValue());
        }
        i = j;
        if (e != null)
        {
            i = j;
            if (e.length > 0)
            {
                i = 0;
                l = 0;
                int i1;
                int j1;
                for (i1 = 0; i < e.length; i1 = j1)
                {
                    String s = e[i];
                    int k1 = l;
                    j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + kwk.a(s);
                    }
                    i++;
                    l = k1;
                }

                i = j + l + i1 * 1;
            }
        }
        l = i;
        if (f != null)
        {
            l = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    l = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    jid jid1 = f[k];
                    l = i;
                    if (jid1 != null)
                    {
                        l = i + kwk.d(7, jid1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L10:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   18: 120
    //                   26: 131
    //                   34: 142
    //                   40: 171
    //                   50: 618
    //                   58: 720;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
          goto _L10
_L4:
        a = kwj1.j();
          goto _L10
_L5:
        b = kwj1.j();
          goto _L10
_L6:
        if (d == null)
        {
            d = new jif();
        }
        kwj1.a(d);
          goto _L10
_L7:
        int j = kwj1.f();
        switch (j)
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
        case 102: // 'f'
            c = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int i1 = kwx.a(kwj1, 50);
        String as[];
        int k;
        if (e == null)
        {
            k = 0;
        } else
        {
            k = e.length;
        }
        as = new String[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(e, 0, as, 0, k);
            i1 = k;
        }
        for (; i1 < as.length - 1; i1++)
        {
            as[i1] = kwj1.j();
            kwj1.a();
        }

        as[i1] = kwj1.j();
        e = as;
        continue; /* Loop/switch isn't completed */
_L9:
        int j1 = kwx.a(kwj1, 58);
        jid ajid[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        ajid = new jid[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, ajid, 0, l);
            j1 = l;
        }
        for (; j1 < ajid.length - 1; j1++)
        {
            ajid[j1] = new jid();
            kwj1.a(ajid[j1]);
            kwj1.a();
        }

        ajid[j1] = new jid();
        kwj1.a(ajid[j1]);
        f = ajid;
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.a(2, a);
        }
        if (b != null)
        {
            kwk1.a(3, b);
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (c != null)
        {
            kwk1.a(5, c.intValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    kwk1.a(6, s);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                jid jid1 = f[j];
                if (jid1 != null)
                {
                    kwk1.b(7, jid1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
