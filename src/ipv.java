// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipv extends kwm
{

    private static volatile ipv e[];
    public ipe a;
    public Integer b;
    public String c;
    public Boolean d;

    public ipv()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ipv[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new ipv[0];
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
        if (b != null)
        {
            i = j + kwk.e(1, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.b(2, c);
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.d(3, a);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(4) + 1);
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
    //                   18: 122
    //                   26: 133
    //                   32: 162;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        if (a == null)
        {
            a = new ipe();
        }
        kwj1.a(a);
        continue; /* Loop/switch isn't completed */
_L6:
        d = Boolean.valueOf(kwj1.i());
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null)
        {
            kwk1.a(1, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(2, c);
        }
        if (a != null)
        {
            kwk1.b(3, a);
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
