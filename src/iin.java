// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iin extends koj
{

    public static final kok a = kok.a(iin, 0x9776e0aL);
    private static final iin f[] = new iin[0];
    public Integer b;
    public String c;
    public iim d;
    public Integer e;

    public iin()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
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
        if (d != null)
        {
            i = j + koh.d(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.e(4, e.intValue());
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
    //                   18: 206
    //                   26: 217
    //                   32: 246;
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
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
            b = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c = kog1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        if (d == null)
        {
            d = new iim();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L6:
        int k = kog1.f();
        switch (k)
        {
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
        case 14: // '\016'
        case 15: // '\017'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
            e = Integer.valueOf(k);
            break;
        }
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
        if (d != null)
        {
            koh1.b(3, d);
        }
        if (e != null)
        {
            koh1.a(4, e.intValue());
        }
        super.writeTo(koh1);
    }

}
