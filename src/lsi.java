// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lsi extends kwm
{

    public lrr a;
    public kss b;
    public keu c;
    public kbs d;
    public Integer e;
    public Integer f;
    public ltb g;
    public Float h;
    public Boolean i;

    public lsi()
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
            j = k + kwk.d(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + kwk.d(2, b);
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
            j = k + kwk.e(5, e.intValue());
        }
        k = j;
        if (f != null)
        {
            k = j + kwk.e(6, f.intValue());
        }
        j = k;
        if (g != null)
        {
            j = k + kwk.d(7, g);
        }
        k = j;
        if (h != null)
        {
            h.floatValue();
            k = j + (kwk.f(10) + 4);
        }
        j = k;
        if (i != null)
        {
            i.booleanValue();
            j = k + (kwk.f(11) + 1);
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
    //                   18: 136
    //                   26: 165
    //                   34: 194
    //                   40: 223
    //                   48: 237
    //                   58: 282
    //                   85: 311
    //                   88: 325;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, j)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new lrr();
        }
        kwj1.a(a);
          goto _L12
_L4:
        if (b == null)
        {
            b = new kss();
        }
        kwj1.a(b);
          goto _L12
_L5:
        if (c == null)
        {
            c = new keu();
        }
        kwj1.a(c);
          goto _L12
_L6:
        if (d == null)
        {
            d = new kbs();
        }
        kwj1.a(d);
          goto _L12
_L7:
        e = Integer.valueOf(kwj1.f());
          goto _L12
_L8:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new ltb();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        h = Float.valueOf(kwj1.c());
        continue; /* Loop/switch isn't completed */
_L11:
        i = Boolean.valueOf(kwj1.i());
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
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
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.intValue());
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.a(10, h.floatValue());
        }
        if (i != null)
        {
            kwk1.a(11, i.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
