// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jiz extends kwm
{

    private static volatile jiz i[];
    public String a;
    public String b;
    public String c;
    public Integer d;
    public jjb e;
    public jja f;
    public jjd g;
    public jjc h;

    public jiz()
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

    public static jiz[] a()
    {
        if (i == null)
        {
            synchronized (kwq.a)
            {
                if (i == null)
                {
                    i = new jiz[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
            k = j + kwk.b(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + kwk.b(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + kwk.e(4, d.intValue());
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
            j = k + kwk.d(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + kwk.d(8, h);
        }
        return k;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L11:
        int j = kwj1.a();
        j;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   18: 110
    //                   26: 121
    //                   32: 132
    //                   42: 182
    //                   50: 211
    //                   58: 240
    //                   66: 269;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kwj1, j)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L11
_L4:
        b = kwj1.j();
          goto _L11
_L5:
        c = kwj1.j();
          goto _L11
_L6:
        int k = kwj1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            d = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new jjb();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new jja();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new jjd();
        }
        kwj1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new jjc();
        }
        kwj1.a(h);
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
            kwk1.b(8, h);
        }
        super.writeTo(kwk1);
    }
}
