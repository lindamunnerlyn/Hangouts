// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ijf extends kwm
{

    private static volatile ijf e[];
    public Integer a;
    public String b;
    public Boolean c;
    public Integer d;

    public ijf()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ijf[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new ijf[0];
                }
            }
        }
        return e;
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
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (kwk.f(3) + 1);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.e(4, d.intValue());
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   18: 114
    //                   24: 125
    //                   32: 139;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        c = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L6:
        d = Integer.valueOf(kwj1.f());
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        super.writeTo(kwk1);
    }
}
