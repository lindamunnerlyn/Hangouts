// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jaw extends kwm
{

    private static volatile jaw g[];
    public jax a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public byte f[];

    public jaw()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jaw[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new jaw[0];
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
            i = j + kwk.d(1, a);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.b(2, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.b(3, e);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.b(4, f);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(5, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.e(6, c.intValue());
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
    //                   18: 112
    //                   26: 123
    //                   34: 134
    //                   42: 145
    //                   48: 156;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new jax();
        }
        kwj1.a(a);
          goto _L9
_L4:
        d = kwj1.j();
          goto _L9
_L5:
        e = kwj1.j();
          goto _L9
_L6:
        f = kwj1.k();
          goto _L9
_L7:
        b = kwj1.j();
          goto _L9
_L8:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            c = Integer.valueOf(j);
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (d != null)
        {
            kwk1.a(2, d);
        }
        if (e != null)
        {
            kwk1.a(3, e);
        }
        if (f != null)
        {
            kwk1.a(4, f);
        }
        if (b != null)
        {
            kwk1.a(5, b);
        }
        if (c != null)
        {
            kwk1.a(6, c.intValue());
        }
        super.writeTo(kwk1);
    }
}
