// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jgc extends kwm
{

    private static volatile jgc n[];
    public String a;
    public String b;
    public String c;
    public Integer d;
    public String e;
    public String f;
    public jgl g;
    public Integer h;
    public jgh i;
    public jgf j;
    public jgg k;
    public jgi l;
    public Integer m;

    public jgc()
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
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jgc[] a()
    {
        if (n == null)
        {
            synchronized (kwq.a)
            {
                if (n == null)
                {
                    n = new jgc[0];
                }
            }
        }
        return n;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + kwk.b(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.e(4, d.intValue());
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + kwk.b(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + kwk.d(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + kwk.e(7, h.intValue());
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + kwk.d(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + kwk.d(9, j);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + kwk.b(10, e);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.d(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + kwk.d(12, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + kwk.e(13, m.intValue());
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L16:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 14: default 128
    //                   0: 137
    //                   10: 139
    //                   18: 150
    //                   26: 161
    //                   32: 172
    //                   42: 222
    //                   50: 233
    //                   56: 262
    //                   66: 314
    //                   74: 343
    //                   82: 372
    //                   90: 383
    //                   98: 412
    //                   104: 441;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L16
_L4:
        b = kwj1.j();
          goto _L16
_L5:
        c = kwj1.j();
          goto _L16
_L6:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        f = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        if (g == null)
        {
            g = new jgl();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L9:
        int k1 = kwj1.f();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            h = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (i == null)
        {
            i = new jgh();
        }
        kwj1.a(i);
        continue; /* Loop/switch isn't completed */
_L11:
        if (j == null)
        {
            j = new jgf();
        }
        kwj1.a(j);
        continue; /* Loop/switch isn't completed */
_L12:
        e = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L13:
        if (k == null)
        {
            k = new jgg();
        }
        kwj1.a(k);
        continue; /* Loop/switch isn't completed */
_L14:
        if (l == null)
        {
            l = new jgi();
        }
        kwj1.a(l);
        continue; /* Loop/switch isn't completed */
_L15:
        int l1 = kwj1.f();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
            m = Integer.valueOf(l1);
            break;
        }
        if (true) goto _L16; else goto _L17
_L17:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
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
            kwk1.a(4, d.intValue());
        }
        if (f != null)
        {
            kwk1.a(5, f);
        }
        if (g != null)
        {
            kwk1.b(6, g);
        }
        if (h != null)
        {
            kwk1.a(7, h.intValue());
        }
        if (i != null)
        {
            kwk1.b(8, i);
        }
        if (j != null)
        {
            kwk1.b(9, j);
        }
        if (e != null)
        {
            kwk1.a(10, e);
        }
        if (k != null)
        {
            kwk1.b(11, k);
        }
        if (l != null)
        {
            kwk1.b(12, l);
        }
        if (m != null)
        {
            kwk1.a(13, m.intValue());
        }
        super.writeTo(kwk1);
    }
}
