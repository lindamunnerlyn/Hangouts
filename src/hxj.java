// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxj extends kwm
{

    private static volatile hxj f[];
    public Integer a;
    public String b;
    public Boolean c;
    public Long d;
    public String e;

    public hxj()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hxj[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new hxj[0];
                }
            }
        }
        return f;
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
            j = i + kwk.e(4, d.longValue());
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.b(5, e);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L8:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   18: 142
    //                   24: 153
    //                   32: 167
    //                   42: 181;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
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
        d = Long.valueOf(kwj1.e());
        continue; /* Loop/switch isn't completed */
_L7:
        e = kwj1.j();
        if (true) goto _L8; else goto _L9
_L9:
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
            kwk1.b(4, d.longValue());
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        super.writeTo(kwk1);
    }
}
