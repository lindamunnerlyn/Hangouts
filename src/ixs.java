// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixs extends koj
{

    public Integer a;
    public Long b;
    public Long c;
    public ixg responseHeader;

    public ixs()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.e(2, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(4, c.longValue());
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
    //                   10: 67
    //                   16: 96
    //                   24: 134
    //                   32: 148;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new ixg();
        }
        kog1.a(responseHeader);
          goto _L7
_L4:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        b = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L6:
        c = Long.valueOf(kog1.d());
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null)
        {
            koh1.a(2, a.intValue());
        }
        if (b != null)
        {
            koh1.a(3, b.longValue());
        }
        if (c != null)
        {
            koh1.a(4, c.longValue());
        }
        super.writeTo(koh1);
    }
}
