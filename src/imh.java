// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class imh extends kwm
{

    public Integer a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    public imh()
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
        int j1 = super.computeSerializedSize() + kwk.e(1, a.intValue());
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + kwk.b(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(3, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + kwk.b(4, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.b(5, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.b(6, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.b(7, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.b(8, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.b(9, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.b(10, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + kwk.b(11, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + kwk.b(12, l);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L15:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 13: default 120
    //                   0: 129
    //                   8: 131
    //                   18: 174
    //                   26: 185
    //                   34: 196
    //                   42: 207
    //                   50: 218
    //                   58: 229
    //                   66: 240
    //                   74: 251
    //                   82: 262
    //                   90: 273
    //                   98: 284;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
            a = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        g = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        i = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        j = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L13:
        k = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L14:
        l = kwj1.j();
        if (true) goto _L15; else goto _L16
_L16:
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a.intValue());
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.a(6, f);
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
        if (j != null)
        {
            kwk1.a(10, j);
        }
        if (k != null)
        {
            kwk1.a(11, k);
        }
        if (l != null)
        {
            kwk1.a(12, l);
        }
        super.writeTo(kwk1);
    }
}
