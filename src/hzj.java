// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzj extends kwm
{

    public int a;
    public int b;
    public hzi c[];
    public kca d;

    public hzj()
    {
        a = 0x80000000;
        b = 0x80000000;
        c = hzi.a();
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
            j = i + kwk.e(1, a);
        }
        i = j;
        if (b != 0x80000000)
        {
            i = j + kwk.e(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    hzi hzi1 = c[j];
                    int k = i;
                    if (hzi1 != null)
                    {
                        k = i + kwk.d(3, hzi1);
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
            i = j + kwk.d(4, d);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 195
    //                   26: 235
    //                   34: 359;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
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
        int k = kwj1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            b = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = kwx.a(kwj1, 26);
        hzi ahzi[];
        int l;
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        ahzi = new hzi[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, ahzi, 0, l);
            i1 = l;
        }
        for (; i1 < ahzi.length - 1; i1++)
        {
            ahzi[i1] = new hzi();
            kwj1.a(ahzi[i1]);
            kwj1.a();
        }

        ahzi[i1] = new hzi();
        kwj1.a(ahzi[i1]);
        c = ahzi;
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new kca();
        }
        kwj1.a(d);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != 0x80000000)
        {
            kwk1.a(1, a);
        }
        if (b != 0x80000000)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                hzi hzi1 = c[i];
                if (hzi1 != null)
                {
                    kwk1.b(3, hzi1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        super.writeTo(kwk1);
    }
}
