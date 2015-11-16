// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krn extends kwm
{

    public Integer a;
    public String b;
    public Long c;
    public String d;
    public String e;
    public Long f;
    public String g;
    public String h;
    public String i;

    public krn()
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

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + kwk.e(1, a.intValue());
        }
        k = j;
        if (b != null)
        {
            k = j + kwk.b(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.e(3, c.longValue());
        }
        k = j;
        if (e != null)
        {
            k = j + kwk.b(4, e);
        }
        j = k;
        if (f != null)
        {
            j = k + kwk.e(5, f.longValue());
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.b(6, d);
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.b(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + kwk.b(8, h);
        }
        j = k;
        if (i != null)
        {
            j = k + kwk.b(9, i);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L12:
        int j = kwj1.a();
        j;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   8: 107
    //                   18: 174
    //                   24: 185
    //                   34: 199
    //                   40: 210
    //                   50: 224
    //                   58: 235
    //                   66: 246
    //                   74: 257;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, j)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            a = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        c = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L6:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        f = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L8:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        i = kwj1.j();
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c.longValue());
        }
        if (e != null)
        {
            kwk1.a(4, e);
        }
        if (f != null)
        {
            kwk1.b(5, f.longValue());
        }
        if (d != null)
        {
            kwk1.a(6, d);
        }
        if (g != null)
        {
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.a(9, i);
        }
        super.writeTo(kwk1);
    }
}
