// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lab extends kwm
{

    private static volatile lab l[];
    public Long a;
    public int b;
    public String c;
    public byte d[];
    public byte e[];
    public lak f;
    public laa g;
    public byte h[];
    public Integer i;
    public byte j[];
    public byte k[];

    public lab()
    {
        a = null;
        b = 0x80000000;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lab[] a()
    {
        if (l == null)
        {
            synchronized (kwq.a)
            {
                if (l == null)
                {
                    l = new lab[0];
                }
            }
        }
        return l;
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
            i1 = j1 + kwk.e(1, a.longValue());
        }
        j1 = i1;
        if (b != 0x80000000)
        {
            j1 = i1 + kwk.e(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + kwk.b(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + kwk.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + kwk.d(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + kwk.d(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.b(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i.intValue();
            i1 = j1 + (kwk.f(9) + 4);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + kwk.b(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + kwk.b(11, k);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L14:
        int i1 = kwj1.a();
        i1;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   8: 123
    //                   16: 137
    //                   26: 187
    //                   34: 198
    //                   42: 209
    //                   50: 220
    //                   58: 249
    //                   66: 278
    //                   77: 289
    //                   82: 303
    //                   90: 314;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (super.storeUnknownField(kwj1, i1)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        a = Long.valueOf(kwj1.e());
          goto _L14
_L4:
        int j1 = kwj1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            b = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L7:
        e = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new lak();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new laa();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        h = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L11:
        i = Integer.valueOf(kwj1.h());
        continue; /* Loop/switch isn't completed */
_L12:
        j = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L13:
        k = kwj1.k();
        if (true) goto _L14; else goto _L15
_L15:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a.longValue());
        }
        if (b != 0x80000000)
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
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        if (i != null)
        {
            kwk1.b(9, i.intValue());
        }
        if (j != null)
        {
            kwk1.a(10, j);
        }
        if (k != null)
        {
            kwk1.a(11, k);
        }
        super.writeTo(kwk1);
    }
}
