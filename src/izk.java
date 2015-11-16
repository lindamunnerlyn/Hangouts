// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izk extends kwm
{

    private static volatile izk e[];
    public String a;
    public Integer b;
    public izl c;
    public Integer d;

    public izk()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static izk[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new izk[0];
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c);
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
    //                   10: 67
    //                   16: 78
    //                   26: 130
    //                   32: 159;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        a = kwj1.j();
          goto _L7
_L4:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new izl();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = Integer.valueOf(k);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        super.writeTo(kwk1);
    }
}
