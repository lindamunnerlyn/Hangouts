// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hyv extends kwm
{

    private static volatile hyv d[];
    public String a;
    public String b;
    public Integer c;

    public hyv()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hyv[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new hyv[0];
                }
            }
        }
        return d;
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
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.intValue());
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L6:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   18: 70
    //                   24: 81;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L6
_L4:
        b = kwj1.j();
          goto _L6
_L5:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
        case 40: // '('
        case 50: // '2'
            c = Integer.valueOf(j);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
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
            kwk1.a(3, c.intValue());
        }
        super.writeTo(kwk1);
    }
}
