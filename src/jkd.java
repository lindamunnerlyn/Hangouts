// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jkd extends kwm
{

    public jif a;
    public jhh b[];
    public jid c[];
    public Integer d;
    public jid e;
    public Integer f;

    public jkd()
    {
        a = null;
        b = jhh.a();
        c = jid.a();
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.d(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (j = 0; j < b.length;)
                {
                    jhh jhh1 = b[j];
                    int k = i;
                    if (jhh1 != null)
                    {
                        k = i + kwk.d(2, jhh1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    jid jid1 = c[l];
                    j = i;
                    if (jid1 != null)
                    {
                        j = i + kwk.d(3, jid1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(4, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(5, e);
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.e(6, f.intValue());
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L9:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 112
    //                   26: 236
    //                   32: 360
    //                   42: 806
    //                   48: 835;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new jif();
        }
        kwj1.a(a);
          goto _L9
_L4:
        int j1 = kwx.a(kwj1, 18);
        jhh ajhh[];
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.length;
        }
        ajhh = new jhh[j1 + j];
        j1 = j;
        if (j != 0)
        {
            System.arraycopy(b, 0, ajhh, 0, j);
            j1 = j;
        }
        for (; j1 < ajhh.length - 1; j1++)
        {
            ajhh[j1] = new jhh();
            kwj1.a(ajhh[j1]);
            kwj1.a();
        }

        ajhh[j1] = new jhh();
        kwj1.a(ajhh[j1]);
        b = ajhh;
          goto _L9
_L5:
        int k1 = kwx.a(kwj1, 26);
        jid ajid[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ajid = new jid[k1 + k];
        k1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ajid, 0, k);
            k1 = k;
        }
        for (; k1 < ajid.length - 1; k1++)
        {
            ajid[k1] = new jid();
            kwj1.a(ajid[k1]);
            kwj1.a();
        }

        ajid[k1] = new jid();
        kwj1.a(ajid[k1]);
        c = ajid;
          goto _L9
_L6:
        int l = kwj1.f();
        switch (l)
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
            d = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new jid();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        int i1 = kwj1.f();
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
            f = Integer.valueOf(i1);
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jhh jhh1 = b[i];
                if (jhh1 != null)
                {
                    kwk1.b(2, jhh1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                jid jid1 = c[j];
                if (jid1 != null)
                {
                    kwk1.b(3, jid1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f.intValue());
        }
        super.writeTo(kwk1);
    }
}
