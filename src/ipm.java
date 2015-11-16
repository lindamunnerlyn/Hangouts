// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipm extends koj
{

    private static volatile ipm l[];
    public int a;
    public Long b;
    public Long c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Integer k;

    public ipm()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ipm[] a()
    {
        if (l == null)
        {
            synchronized (kon.a)
            {
                if (l == null)
                {
                    l = new ipm[0];
                }
            }
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize() + koh.e(1, a);
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.e(2, b.longValue());
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.e(4, e.intValue());
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.e(5, f.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            g.booleanValue();
            j1 = i1 + (koh.f(6) + 1);
        }
        i1 = j1;
        if (h != null)
        {
            h.booleanValue();
            i1 = j1 + (koh.f(7) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            i.booleanValue();
            j1 = i1 + (koh.f(8) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.e(11, k.intValue());
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + koh.e(12, d.intValue());
        }
        i1 = j1;
        if (j != null)
        {
            j.booleanValue();
            i1 = j1 + (koh.f(13) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.e(14, c.longValue());
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
_L14:
        int i1 = kog1.a();
        i1;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   8: 123
    //                   16: 183
    //                   32: 197
    //                   40: 211
    //                   48: 225
    //                   56: 239
    //                   64: 253
    //                   88: 267
    //                   96: 281
    //                   104: 295
    //                   112: 309;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (super.storeUnknownField(kog1, i1)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        int j1 = kog1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 6: // '\006'
        case 7: // '\007'
            a = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L5:
        e = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        f = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        g = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        h = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L9:
        i = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L10:
        k = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L11:
        d = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L12:
        j = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L13:
        c = Long.valueOf(kog1.e());
        if (true) goto _L14; else goto _L15
_L15:
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a);
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        if (e != null)
        {
            koh1.a(4, e.intValue());
        }
        if (f != null)
        {
            koh1.a(5, f.intValue());
        }
        if (g != null)
        {
            koh1.a(6, g.booleanValue());
        }
        if (h != null)
        {
            koh1.a(7, h.booleanValue());
        }
        if (i != null)
        {
            koh1.a(8, i.booleanValue());
        }
        if (k != null)
        {
            koh1.a(11, k.intValue());
        }
        if (d != null)
        {
            koh1.a(12, d.intValue());
        }
        if (j != null)
        {
            koh1.a(13, j.booleanValue());
        }
        if (c != null)
        {
            koh1.b(14, c.longValue());
        }
        super.writeTo(koh1);
    }
}
