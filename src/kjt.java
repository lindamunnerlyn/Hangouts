// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kjt extends koj
{

    private static volatile kjt f[];
    public Integer a;
    public kjv b;
    public String c;
    public String d;
    public keg e;

    public kjt()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kjt[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new kjt[0];
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
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(4, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(5, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(6, e);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L8:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   18: 134
    //                   34: 163
    //                   42: 174
    //                   50: 185;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
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
        case 5: // '\005'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new kjv();
        }
        kog1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        d = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new keg();
        }
        kog1.a(e);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.a(4, c);
        }
        if (d != null)
        {
            koh1.a(5, d);
        }
        if (e != null)
        {
            koh1.b(6, e);
        }
        super.writeTo(koh1);
    }
}
