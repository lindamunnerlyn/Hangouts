// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kun extends koj
{

    private static volatile kun g[];
    public int a;
    public String b;
    public kuk c;
    public kum d;
    public kuv e;
    public kul f;

    public kun()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kun[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new kun[0];
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
        if (a != 0x80000000)
        {
            i = j + koh.e(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.d(6, f);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L9:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   18: 135
    //                   26: 146
    //                   34: 175
    //                   42: 204
    //                   50: 233;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kog1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new kuk();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new kum();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new kuv();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new kul();
        }
        kog1.a(f);
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(koh koh1)
    {
        if (a != 0x80000000)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        super.writeTo(koh1);
    }
}