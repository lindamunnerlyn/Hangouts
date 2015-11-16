// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ktk extends kwm
{

    private static volatile ktk d[];
    public byte a[];
    public Integer b;
    public int c;

    public ktk()
    {
        a = null;
        b = null;
        c = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ktk[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new ktk[0];
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
            j = i + kwk.f(2, b.intValue());
        }
        i = j;
        if (c != 0x80000000)
        {
            i = j + kwk.e(3, c);
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
    //                   16: 70
    //                   24: 84;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.k();
          goto _L6
_L4:
        b = Integer.valueOf(kwj1.l());
          goto _L6
_L5:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            c = j;
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
            kwk1.c(2, b.intValue());
        }
        if (c != 0x80000000)
        {
            kwk1.a(3, c);
        }
        super.writeTo(kwk1);
    }
}
