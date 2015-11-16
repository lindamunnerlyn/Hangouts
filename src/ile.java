// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ile extends kwm
{

    private static volatile ile g[];
    public String a;
    public ijy b;
    public int c;
    public ike d;
    public ino e;
    public ika f;

    public ile()
    {
        a = null;
        b = null;
        c = 0x80000000;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ile[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new ile[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
            j = i + kwk.d(2, b);
        }
        i = j;
        if (c != 0x80000000)
        {
            i = j + kwk.e(3, c);
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
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L9:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 94
    //                   24: 123
    //                   34: 175
    //                   42: 204
    //                   50: 233;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L9
_L4:
        if (b == null)
        {
            b = new ijy();
        }
        kwj1.a(b);
          goto _L9
_L5:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            c = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new ike();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new ino();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new ika();
        }
        kwj1.a(f);
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != 0x80000000)
        {
            kwk1.a(3, c);
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
        super.writeTo(kwk1);
    }
}
