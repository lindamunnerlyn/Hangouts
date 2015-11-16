// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivp extends koj
{

    public itb a;
    public Integer b;
    public byte c[];
    public Long d;
    public ixf requestHeader;

    public ivp()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + koh.d(1, requestHeader);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.b(2, c);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.e(3, b.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d.longValue());
        }
        i = j;
        if (a != null)
        {
            i = j + koh.d(5, a);
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
    //                   10: 75
    //                   18: 104
    //                   24: 115
    //                   32: 158
    //                   42: 172;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new ixf();
        }
        kog1.a(requestHeader);
          goto _L8
_L4:
        c = kog1.k();
          goto _L8
_L5:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L7:
        if (a == null)
        {
            a = new itb();
        }
        kog1.a(a);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (c != null)
        {
            koh1.a(2, c);
        }
        if (b != null)
        {
            koh1.a(3, b.intValue());
        }
        if (d != null)
        {
            koh1.a(4, d.longValue());
        }
        if (a != null)
        {
            koh1.b(5, a);
        }
        super.writeTo(koh1);
    }
}
