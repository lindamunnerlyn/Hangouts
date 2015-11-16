// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iyr extends kwm
{

    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public String e;
    public Boolean f;
    public Integer g;
    public byte h[];
    public Integer i;
    public Integer j;
    public Integer k;
    public Boolean l;

    public iyr()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            a.booleanValue();
            i1 = j1 + (kwk.f(1) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            b.booleanValue();
            j1 = i1 + (kwk.f(2) + 1);
        }
        i1 = j1;
        if (c != null)
        {
            c.booleanValue();
            i1 = j1 + (kwk.f(3) + 1);
        }
        j1 = i1;
        if (d != null)
        {
            d.booleanValue();
            j1 = i1 + (kwk.f(4) + 1);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (kwk.f(6) + 1);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.e(7, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + kwk.e(9, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.e(10, j.intValue());
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.e(11, k.intValue());
        }
        j1 = i1;
        if (l != null)
        {
            l.booleanValue();
            j1 = i1 + (kwk.f(12) + 1);
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L15:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 13: default 120
    //                   0: 129
    //                   8: 131
    //                   16: 145
    //                   24: 159
    //                   32: 173
    //                   42: 187
    //                   48: 198
    //                   56: 212
    //                   66: 262
    //                   72: 273
    //                   80: 318
    //                   88: 366
    //                   96: 414;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kwj1.i());
          goto _L15
_L4:
        b = Boolean.valueOf(kwj1.i());
          goto _L15
_L5:
        c = Boolean.valueOf(kwj1.i());
          goto _L15
_L6:
        d = Boolean.valueOf(kwj1.i());
          goto _L15
_L7:
        e = kwj1.j();
          goto _L15
_L8:
        f = Boolean.valueOf(kwj1.i());
          goto _L15
_L9:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            g = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        h = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L11:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            i = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        int l1 = kwj1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            j = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        int i2 = kwj1.f();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            k = Integer.valueOf(i2);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        l = Boolean.valueOf(kwj1.i());
        if (true) goto _L15; else goto _L16
_L16:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            kwk1.a(7, g.intValue());
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.a(9, i.intValue());
        }
        if (j != null)
        {
            kwk1.a(10, j.intValue());
        }
        if (k != null)
        {
            kwk1.a(11, k.intValue());
        }
        if (l != null)
        {
            kwk1.a(12, l.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
