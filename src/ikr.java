// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikr extends koj
{

    private static volatile ikr e[];
    public ika a;
    public Integer b;
    public String c;
    public Boolean d;

    public ikr()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ikr[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new ikr[0];
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
            i = j + koh.e(1, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.b(2, c);
        }
        i = j;
        if (a != null)
        {
            i = j + koh.d(3, a);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (koh.f(4) + 1);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L7:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   18: 122
    //                   26: 133
    //                   32: 162;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
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
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        if (a == null)
        {
            a = new ika();
        }
        kog1.a(a);
        continue; /* Loop/switch isn't completed */
_L6:
        d = Boolean.valueOf(kog1.i());
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.a(1, b.intValue());
        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (a != null)
        {
            koh1.b(3, a);
        }
        if (d != null)
        {
            koh1.a(4, d.booleanValue());
        }
        super.writeTo(koh1);
    }
}
