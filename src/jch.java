// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jch extends koj
{

    private static volatile jch j[];
    public Integer a;
    public Integer b;
    public String c;
    public Integer d;
    public Integer e;
    public Integer f;
    public String g;
    public Integer h;
    public Integer i;

    public jch()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jch[] a()
    {
        if (j == null)
        {
            synchronized (kon.a)
            {
                if (j == null)
                {
                    j = new jch[0];
                }
            }
        }
        return j;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (a != null)
        {
            k = l + koh.e(1, a.intValue());
        }
        l = k;
        if (b != null)
        {
            l = k + koh.e(2, b.intValue());
        }
        k = l;
        if (c != null)
        {
            k = l + koh.b(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + koh.e(4, d.intValue());
        }
        k = l;
        if (e != null)
        {
            k = l + koh.e(5, e.intValue());
        }
        l = k;
        if (f != null)
        {
            l = k + koh.e(6, f.intValue());
        }
        k = l;
        if (g != null)
        {
            k = l + koh.b(7, g);
        }
        l = k;
        if (h != null)
        {
            l = k + koh.e(8, h.intValue());
        }
        k = l;
        if (i != null)
        {
            k = l + koh.e(9, i.intValue());
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
_L12:
        int k = kog1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   8: 107
    //                   16: 150
    //                   26: 198
    //                   32: 209
    //                   40: 223
    //                   48: 274
    //                   58: 288
    //                   64: 299
    //                   72: 313;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kog1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int l = kog1.f();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = kog1.f();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            b = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = kog1.f();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            e = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        f = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L11:
        int k1 = kog1.f();
        switch (k1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            i = Integer.valueOf(k1);
            break;
        }
        if (true) goto _L12; else goto _L13
_L13:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.a(5, e.intValue());
        }
        if (f != null)
        {
            koh1.a(6, f.intValue());
        }
        if (g != null)
        {
            koh1.a(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h.intValue());
        }
        if (i != null)
        {
            koh1.a(9, i.intValue());
        }
        super.writeTo(koh1);
    }
}
