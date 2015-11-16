// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jjl extends kwm
{

    private static volatile jjl j[];
    public Integer a;
    public Integer b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public jjm h;
    public jjr i;

    public jjl()
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

    public static jjl[] a()
    {
        if (j == null)
        {
            synchronized (kwq.a)
            {
                if (j == null)
                {
                    j = new jjl[0];
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
            k = l + kwk.e(1, a.intValue());
        }
        l = k;
        if (b != null)
        {
            l = k + kwk.e(2, b.intValue());
        }
        k = l;
        if (c != null)
        {
            k = l + kwk.b(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + kwk.b(4, d);
        }
        k = l;
        if (e != null)
        {
            k = l + kwk.b(5, e);
        }
        l = k;
        if (f != null)
        {
            l = k + kwk.b(6, f);
        }
        k = l;
        if (g != null)
        {
            k = l + kwk.b(7, g);
        }
        l = k;
        if (h != null)
        {
            l = k + kwk.d(8, h);
        }
        k = l;
        if (i != null)
        {
            k = l + kwk.d(9, i);
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
    //                   8: 107
    //                   16: 150
    //                   26: 202
    //                   34: 213
    //                   42: 224
    //                   50: 235
    //                   58: 246
    //                   66: 257
    //                   74: 286;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kwj1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int l = kwj1.f();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = kwj1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            b = Integer.valueOf(i1);
            break;
        }
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
        if (h == null)
        {
            h = new jjm();
        }
        kwj1.a(h);
        continue; /* Loop/switch isn't completed */
_L11:
        if (i == null)
        {
            i = new jjr();
        }
        kwj1.a(i);
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
            kwk1.a(2, b.intValue());
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
            kwk1.b(8, h);
        }
        if (i != null)
        {
            kwk1.b(9, i);
        }
        super.writeTo(kwk1);
    }
}
