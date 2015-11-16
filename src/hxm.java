// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxm extends koj
{

    public String a;
    public hxn b;
    public int c;
    public hxl d;
    public Integer e;

    public hxm()
    {
        a = null;
        b = null;
        c = 0x80000000;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(2, b);
        }
        i = j;
        if (c != 0x80000000)
        {
            i = j + koh.e(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.e(5, e.intValue());
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
    //                   18: 86
    //                   24: 115
    //                   34: 155
    //                   40: 184;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L8
_L4:
        if (b == null)
        {
            b = new hxn();
        }
        kog1.a(b);
          goto _L8
_L5:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            c = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new hxl();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(kog1.f());
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != 0x80000000)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e.intValue());
        }
        super.writeTo(koh1);
    }
}
