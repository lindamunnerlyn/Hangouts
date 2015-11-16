// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jlv extends kwm
{

    private static volatile jlv j[];
    public String a;
    public jlw b;
    public jlu c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Long g;
    public Integer h;
    public Long i;

    public jlv()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jlv[] a()
    {
        if (j == null)
        {
            synchronized (kwq.a)
            {
                if (j == null)
                {
                    j = new jlv[0];
                }
            }
        }
        return j;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            k = l + kwk.b(1, a);
        }
        l = k;
        if (b != null)
        {
            l = k + kwk.d(2, b);
        }
        k = l;
        if (c != null)
        {
            k = l + kwk.d(5, c);
        }
        l = k;
        if (d != null)
        {
            l = k + kwk.e(6, d.intValue());
        }
        k = l;
        if (e != null)
        {
            k = l + kwk.e(7, e.intValue());
        }
        l = k;
        if (f != null)
        {
            l = k + kwk.e(8, f.intValue());
        }
        k = l;
        if (g != null)
        {
            k = l + kwk.d(9, g.longValue());
        }
        l = k;
        if (h != null)
        {
            l = k + kwk.e(10, h.intValue());
        }
        k = l;
        if (i != null)
        {
            k = l + kwk.d(11, i.longValue());
        }
        return k;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L12:
        int k = kwj1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 118
    //                   42: 147
    //                   48: 176
    //                   56: 190
    //                   64: 302
    //                   72: 518
    //                   80: 532
    //                   88: 578;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L12
_L4:
        if (b == null)
        {
            b = new jlw();
        }
        kwj1.a(b);
          goto _L12
_L5:
        if (c == null)
        {
            c = new jlu();
        }
        kwj1.a(c);
          goto _L12
_L6:
        d = Integer.valueOf(kwj1.f());
          goto _L12
_L7:
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
        case 18: // '\022'
            e = Integer.valueOf(l);
            break;
        }
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
            f = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        g = Long.valueOf(kwj1.d());
        continue; /* Loop/switch isn't completed */
_L10:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        i = Long.valueOf(kwj1.d());
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.b(5, c);
        }
        if (d != null)
        {
            kwk1.a(6, d.intValue());
        }
        if (e != null)
        {
            kwk1.a(7, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(8, f.intValue());
        }
        if (g != null)
        {
            kwk1.a(9, g.longValue());
        }
        if (h != null)
        {
            kwk1.a(10, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(11, i.longValue());
        }
        super.writeTo(kwk1);
    }
}
