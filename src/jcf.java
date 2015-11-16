// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcf extends kwm
{

    private static volatile jcf g[];
    public kbm a;
    public Boolean b;
    public Integer c;
    public Boolean d;
    public Integer e;
    public Boolean f;

    public jcf()
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

    public static jcf[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new jcf[0];
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
        if (b != null)
        {
            b.booleanValue();
            j = i + (kwk.f(2) + 1);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(4) + 1);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.e(5, e.intValue());
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (kwk.f(6) + 1);
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
    //                   16: 112
    //                   24: 126
    //                   32: 170
    //                   40: 184
    //                   48: 234;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new kbm();
        }
        kwj1.a(a);
          goto _L9
_L4:
        b = Boolean.valueOf(kwj1.i());
          goto _L9
_L5:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            c = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L7:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            e = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        f = Boolean.valueOf(kwj1.i());
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(6, f.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
