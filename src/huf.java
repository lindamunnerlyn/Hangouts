// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class huf extends koj
{

    public int a;
    public int b;
    public hue c[];
    public jtx d;

    public huf()
    {
        a = 0x80000000;
        b = 0x80000000;
        c = hue.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != 0x80000000)
        {
            j = i + koh.e(1, a);
        }
        i = j;
        if (b != 0x80000000)
        {
            i = j + koh.e(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    hue hue1 = c[j];
                    int k = i;
                    if (hue1 != null)
                    {
                        k = i + koh.d(3, hue1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(4, d);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L7:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 195
    //                   26: 235
    //                   34: 359;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
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
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            b = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = kou.b(kog1, 26);
        hue ahue[];
        int l;
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        ahue = new hue[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, ahue, 0, l);
            i1 = l;
        }
        for (; i1 < ahue.length - 1; i1++)
        {
            ahue[i1] = new hue();
            kog1.a(ahue[i1]);
            kog1.a();
        }

        ahue[i1] = new hue();
        kog1.a(ahue[i1]);
        c = ahue;
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new jtx();
        }
        kog1.a(d);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (a != 0x80000000)
        {
            koh1.a(1, a);
        }
        if (b != 0x80000000)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                hue hue1 = c[i];
                if (hue1 != null)
                {
                    koh1.b(3, hue1);
                }
            }

        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        super.writeTo(koh1);
    }
}
