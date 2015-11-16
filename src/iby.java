// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iby extends kwm
{

    public String a;
    public Integer b;
    public iah c;
    public iai d;
    public ici e;
    public ibm f;
    public String g;
    public ibx h;
    public String i;

    public iby()
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
            j = k + kwk.b(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + kwk.e(2, b.intValue());
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.d(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.d(4, d);
        }
        j = k;
        if (e != null)
        {
            j = k + kwk.d(5, e);
        }
        k = j;
        if (f != null)
        {
            k = j + kwk.d(6, f);
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.b(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + kwk.d(8, h);
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
    //                   10: 107
    //                   16: 118
    //                   26: 166
    //                   34: 195
    //                   42: 224
    //                   50: 253
    //                   58: 282
    //                   66: 293
    //                   74: 322;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, j)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L12
_L4:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            b = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new iah();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new iai();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new ici();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new ibm();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new ibx();
        }
        kwj1.a(h);
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
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.b(3, c);
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
            kwk1.a(7, g);
        }
        if (h != null)
        {
            kwk1.b(8, h);
        }
        if (i != null)
        {
            kwk1.a(9, i);
        }
        super.writeTo(kwk1);
    }
}
