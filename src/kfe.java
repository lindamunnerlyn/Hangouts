// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kfe extends kwm
{

    private static volatile kfe h[];
    public int a;
    public String b;
    public kfg c;
    public kfh d;
    public kfi e;
    public kfj f;
    public kff g;

    public kfe()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kfe[] a()
    {
        if (h == null)
        {
            synchronized (kwq.a)
            {
                if (h == null)
                {
                    h = new kfe[0];
                }
            }
        }
        return h;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + kwk.e(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.d(6, f);
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.d(7, g);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L10:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   8: 91
    //                   18: 179
    //                   26: 190
    //                   34: 219
    //                   42: 248
    //                   50: 277
    //                   58: 306;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L10; else goto _L2
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
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new kfg();
        }
        kwj1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new kfh();
        }
        kwj1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new kfi();
        }
        kwj1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new kfj();
        }
        kwj1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new kff();
        }
        kwj1.a(g);
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        super.writeTo(kwk1);
    }
}
