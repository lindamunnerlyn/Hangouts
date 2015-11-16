// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iyk extends kwm
{

    private static volatile iyk g[];
    public Integer a;
    public Double b;
    public Double c;
    public Long d;
    public Integer e;
    public String f;

    public iyk()
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

    public static iyk[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new iyk[0];
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
            i = j + kwk.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            b.doubleValue();
            j = i + (kwk.f(2) + 8);
        }
        i = j;
        if (c != null)
        {
            c.doubleValue();
            i = j + (kwk.f(3) + 8);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.e(4, d.longValue());
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.e(5, e.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.b(6, f);
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
    //                   8: 83
    //                   17: 126
    //                   25: 140
    //                   32: 154
    //                   40: 168
    //                   50: 182;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Double.valueOf(kwj1.b());
        continue; /* Loop/switch isn't completed */
_L5:
        c = Double.valueOf(kwj1.b());
        continue; /* Loop/switch isn't completed */
_L6:
        d = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        f = kwj1.j();
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.doubleValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.doubleValue());
        }
        if (d != null)
        {
            kwk1.b(4, d.longValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(6, f);
        }
        super.writeTo(kwk1);
    }
}
