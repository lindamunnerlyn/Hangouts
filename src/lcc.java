// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lcc extends koj
{

    public jsv a;
    public Integer b;
    public jtw c;
    public String d;

    public lcc()
    {
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
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(4, d);
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
    //                   26: 170
    //                   34: 199;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new jsv();
        }
        kog1.a(a);
          goto _L7
_L4:
        int j = kog1.f();
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
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new jtw();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        d = kog1.j();
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        super.writeTo(koh1);
    }
}
