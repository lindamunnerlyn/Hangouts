// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.math.RoundingMode;

public final class jro
{

    static final byte a[] = {
        9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 
        6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 
        3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 
        0, 0, 0
    };
    static final int b[] = {
        1, 10, 100, 1000, 10000, 0x186a0, 0xf4240, 0x989680, 0x5f5e100, 0x3b9aca00
    };
    static final int c[] = {
        3, 31, 316, 3162, 31622, 0x4d343, 0x3040a5, 0x1e28678, 0x12d940b6, 0x7fffffff
    };
    static int d[] = {
        0x7fffffff, 0x7fffffff, 0x10000, 2345, 477, 193, 110, 75, 58, 49, 
        43, 39, 37, 35, 34, 34, 33
    };
    private static final int e[] = {
        1, 1, 2, 6, 24, 120, 720, 5040, 40320, 0x58980, 
        0x375f00, 0x2611500, 0x1c8cfc00
    };

    public static int a(int i, int j, RoundingMode roundingmode)
    {
        boolean flag;
        boolean flag1;
        int k;
        int l;
        int i1;
        boolean flag2;
        flag = true;
        flag2 = true;
        flag1 = false;
        n.b(roundingmode);
        if (j == 0)
        {
            throw new ArithmeticException("/ by zero");
        }
        k = i / j;
        i1 = i - j * k;
        if (i1 == 0)
        {
            return k;
        }
        l = (i ^ j) >> 31 | 1;
        i = ((flag) ? 1 : 0);
        jrp.a[roundingmode.ordinal()];
        JVM INSTR tableswitch 1 8: default 116
    //                   1 124
    //                   2 134
    //                   3 164
    //                   4 136
    //                   5 152
    //                   6 176
    //                   7 176
    //                   8 176;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L7 _L7
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        throw new AssertionError();
_L2:
        if (i1 != 0)
        {
            flag2 = false;
        }
        g.d(flag2);
_L3:
        i = 0;
_L8:
        if (i != 0)
        {
            return k + l;
        } else
        {
            return k;
        }
_L6:
        i = ((flag) ? 1 : 0);
        if (l <= 0)
        {
            i = 0;
        }
          goto _L8
_L4:
        i = ((flag) ? 1 : 0);
        if (l >= 0)
        {
            i = 0;
        }
          goto _L8
_L7:
        i = Math.abs(i1);
        j = i - (Math.abs(j) - i);
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        if (roundingmode == RoundingMode.HALF_UP) goto _L10; else goto _L9
_L9:
        if (roundingmode == RoundingMode.HALF_EVEN)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if ((k & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = ((flag1) ? 1 : 0);
        if ((flag & j) == 0) goto _L8; else goto _L10
_L10:
        i = 1;
          goto _L8
        i = ((flag) ? 1 : 0);
        if (j <= 0)
        {
            i = 0;
        }
          goto _L8
    }

    public static int a(int i, RoundingMode roundingmode)
    {
        boolean flag1 = true;
        g.d("x", i);
        switch (jrp.a[roundingmode.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((i - 1 & i) != 0)
            {
                flag1 = false;
            }
            g.d(flag1 & flag);
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return 31 - Integer.numberOfLeadingZeros(i);

        case 4: // '\004'
        case 5: // '\005'
            return 32 - Integer.numberOfLeadingZeros(i - 1);

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            int j = Integer.numberOfLeadingZeros(i);
            return (31 - j) + (~~((0xb504f333 >>> j) - i) >>> 31);
        }
    }

}
