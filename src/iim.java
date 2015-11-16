// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iim extends kwm
{

    private static volatile iim f[];
    public Integer a;
    public int b[];
    public Boolean c;
    public Boolean d;
    public Boolean e;

    public iim()
    {
        a = null;
        b = kwx.a;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iim[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new iim[0];
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
        int i = 0;
        int k = super.computeSerializedSize();
        int j;
        if (b != null && b.length > 0)
        {
            j = 0;
            for (; i < b.length; i++)
            {
                j += kwk.e(b[i]);
            }

            j = k + j + b.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (kwk.f(2) + 1);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(3) + 1);
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.e(4, a.intValue());
        }
        j = i;
        if (e != null)
        {
            e.booleanValue();
            j = i + (kwk.f(5) + 1);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L9:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 7: default 76
    //                   0: 86
    //                   8: 88
    //                   10: 296
    //                   16: 542
    //                   24: 556
    //                   32: 570
    //                   40: 735;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int ai[];
        int k;
        int j1;
        j1 = kwx.a(kwj1, 8);
        ai = new int[j1];
        k = 0;
        i = 0;
_L16:
        if (k >= j1) goto _L11; else goto _L10
_L10:
        int k1;
        if (k != 0)
        {
            kwj1.a();
        }
        k1 = kwj1.f();
        k1;
        JVM INSTR tableswitch 0 7: default 180
    //                   0 189
    //                   1 189
    //                   2 189
    //                   3 189
    //                   4 189
    //                   5 189
    //                   6 189
    //                   7 189;
           goto _L12 _L13 _L13 _L13 _L13 _L13 _L13 _L13 _L13
_L12:
        k++;
          goto _L14
_L13:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L12; else goto _L14
_L14:
        if (true) goto _L16; else goto _L15
_L15:
_L11:
        if (i != 0)
        {
            if (b == null)
            {
                k = 0;
            } else
            {
                k = b.length;
            }
            if (k == 0 && i == ai.length)
            {
                b = ai;
            } else
            {
                int ai1[] = new int[k + i];
                if (k != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, i);
                b = ai1;
            }
        }
          goto _L9
_L4:
        int i1;
        i1 = kwj1.c(kwj1.p());
        i = kwj1.r();
        k = 0;
_L22:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L18; else goto _L17
_L17:
        kwj1.e(i);
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ai = new int[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ai, 0, i);
            k = i;
        }
_L20:
        if (kwj1.q() > 0)
        {
            i = kwj1.f();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                ai[k] = i;
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L18
        if (true) goto _L20; else goto _L19
_L19:
        if (true) goto _L22; else goto _L21
_L21:
_L18:
        kwj1.d(i1);
          goto _L9
_L5:
        c = Boolean.valueOf(kwj1.i());
          goto _L9
_L6:
        d = Boolean.valueOf(kwj1.i());
          goto _L9
_L7:
        int j = kwj1.f();
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
        case 16: // '\020'
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
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        e = Boolean.valueOf(kwj1.i());
        if (true) goto _L9; else goto _L23
_L23:
    }

    public void writeTo(kwk kwk1)
    {
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kwk1.a(1, b[i]);
            }

        }
        if (c != null)
        {
            kwk1.a(2, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(3, d.booleanValue());
        }
        if (a != null)
        {
            kwk1.a(4, a.intValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
