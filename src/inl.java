// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class inl extends kwm
{

    public int a[];

    public inl()
    {
        a = kwx.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = 0;
        int k = super.computeSerializedSize();
        if (a != null && a.length > 0)
        {
            int j = 0;
            for (; i < a.length; i++)
            {
                j += kwk.e(a[i]);
            }

            return k + j + a.length * 1;
        } else
        {
            return k;
        }
    }

    public kws mergeFrom(kwj kwj1)
    {
_L19:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   0: 54
    //                   8: 56
    //                   10: 336;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kwj1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int ai[];
        int j;
        int i1;
        i1 = kwx.a(kwj1, 8);
        ai = new int[i1];
        j = 0;
        i = 0;
_L11:
        if (j >= i1) goto _L6; else goto _L5
_L5:
        int j1;
        if (j != 0)
        {
            kwj1.a();
        }
        j1 = kwj1.f();
        j1;
        JVM INSTR tableswitch 1 26: default 220
    //                   1 229
    //                   2 229
    //                   3 229
    //                   4 229
    //                   5 229
    //                   6 229
    //                   7 229
    //                   8 229
    //                   9 229
    //                   10 229
    //                   11 229
    //                   12 229
    //                   13 229
    //                   14 229
    //                   15 229
    //                   16 220
    //                   17 229
    //                   18 229
    //                   19 229
    //                   20 229
    //                   21 229
    //                   22 229
    //                   23 229
    //                   24 229
    //                   25 229
    //                   26 229;
           goto _L7 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L7 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8
_L7:
        j++;
          goto _L9
_L8:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L7; else goto _L9
_L9:
        if (true) goto _L11; else goto _L10
_L10:
_L6:
        if (i != 0)
        {
            if (a == null)
            {
                j = 0;
            } else
            {
                j = a.length;
            }
            if (j == 0 && i == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                a = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l;
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L17:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
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
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L13; else goto _L12
_L12:
        kwj1.e(i);
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ai, 0, i);
            j = i;
        }
_L15:
        if (kwj1.q() > 0)
        {
            i = kwj1.f();
            switch (i)
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
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
          goto _L13
        if (true) goto _L15; else goto _L14
_L14:
        if (true) goto _L17; else goto _L16
_L16:
_L13:
        kwj1.d(l);
        if (true) goto _L19; else goto _L18
_L18:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                kwk1.a(1, a[i]);
            }

        }
        super.writeTo(kwk1);
    }
}
