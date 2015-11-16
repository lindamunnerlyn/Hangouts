// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikw extends kwm
{

    public String a;
    public Integer b;
    public Integer c;
    public iks d;
    public iku e;
    public ikz f;
    public ikt g;
    public Integer h;

    public ikw()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.d(6, f);
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.d(7, g);
        }
        j = i;
        if (h != null)
        {
            j = i + kwk.e(8, h.intValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L11:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   16: 110
    //                   24: 194
    //                   34: 238
    //                   42: 267
    //                   50: 296
    //                   58: 325
    //                   64: 354;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L11
_L4:
        int j = kwj1.f();
        switch (j)
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
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k = kwj1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new iks();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new iku();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new ikz();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new ikt();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        int l = kwj1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = Integer.valueOf(l);
            break;
        }
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h.intValue());
        }
        super.writeTo(kwk1);
    }
}
