// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iuz extends kwm
{

    private static volatile iuz g[];
    public Integer a;
    public Integer b;
    public iva c;
    public Integer d;
    public Integer e;
    public ivb f;

    public iuz()
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

    public static iuz[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new iuz[0];
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
        i = j;
        if (e != null)
        {
            i = j + kwk.e(5, e.intValue());
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
    //                   8: 83
    //                   16: 166
    //                   26: 180
    //                   32: 209
    //                   40: 254
    //                   50: 314;
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
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new iva();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        int k = kwj1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int l = kwj1.f();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            e = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new ivb();
        }
        kwj1.a(f);
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
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        super.writeTo(kwk1);
    }
}
