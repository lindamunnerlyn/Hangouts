// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jae extends kwm
{

    public int a[];
    public int b[];
    public Boolean c;
    public jdk requestHeader;

    public jae()
    {
        requestHeader = null;
        a = kwx.a;
        b = kwx.a;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                j = 0;
                int k = 0;
                for (; j < a.length; j++)
                {
                    k += kwk.e(a[j]);
                }

                j = i + k + a.length * 1;
            }
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                int l = 0;
                for (i = ((flag) ? 1 : 0); i < b.length; i++)
                {
                    l += kwk.e(b[i]);
                }

                i = j + l + b.length * 1;
            }
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(4) + 1);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L36:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 7: default 76
    //                   0: 86
    //                   10: 88
    //                   16: 117
    //                   18: 380
    //                   24: 738
    //                   26: 1000
    //                   32: 1358;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
        continue; /* Loop/switch isn't completed */
_L4:
        int ai[];
        int j;
        int i1;
        i1 = kwx.a(kwj1, 16);
        ai = new int[i1];
        j = 0;
        i = 0;
_L15:
        if (j >= i1) goto _L10; else goto _L9
_L9:
        int j1;
        if (j != 0)
        {
            kwj1.a();
        }
        j1 = kwj1.f();
        j1;
        JVM INSTR tableswitch 1 22: default 264
    //                   1 273
    //                   2 273
    //                   3 273
    //                   4 273
    //                   5 273
    //                   6 273
    //                   7 273
    //                   8 273
    //                   9 273
    //                   10 273
    //                   11 273
    //                   12 273
    //                   13 273
    //                   14 273
    //                   15 273
    //                   16 273
    //                   17 273
    //                   18 273
    //                   19 273
    //                   20 273
    //                   21 273
    //                   22 273;
           goto _L11 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12
_L11:
        j++;
          goto _L13
_L12:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L11; else goto _L13
_L13:
        if (true) goto _L15; else goto _L14
_L14:
_L10:
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
_L5:
        int l;
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L21:
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
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L17; else goto _L16
_L16:
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
_L19:
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
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
          goto _L17
        if (true) goto _L19; else goto _L18
_L18:
        if (true) goto _L21; else goto _L20
_L20:
_L17:
        kwj1.d(l);
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = kwx.a(kwj1, 24);
        ai = new int[i1];
        j = 0;
        i = 0;
_L28:
        if (j >= i1) goto _L23; else goto _L22
_L22:
        if (j != 0)
        {
            kwj1.a();
        }
        j1 = kwj1.f();
        j1;
        JVM INSTR tableswitch 1 22: default 884
    //                   1 893
    //                   2 893
    //                   3 893
    //                   4 893
    //                   5 893
    //                   6 893
    //                   7 893
    //                   8 893
    //                   9 893
    //                   10 893
    //                   11 893
    //                   12 893
    //                   13 893
    //                   14 893
    //                   15 893
    //                   16 893
    //                   17 893
    //                   18 893
    //                   19 893
    //                   20 893
    //                   21 893
    //                   22 893;
           goto _L24 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25
_L24:
        j++;
          goto _L26
_L25:
        l = i + 1;
        ai[i] = j1;
        i = l;
        if (true) goto _L24; else goto _L26
_L26:
        if (true) goto _L28; else goto _L27
_L27:
_L23:
        if (i != 0)
        {
            if (b == null)
            {
                j = 0;
            } else
            {
                j = b.length;
            }
            if (j == 0 && i == ai.length)
            {
                b = ai;
            } else
            {
                int ai2[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(b, 0, ai2, 0, j);
                }
                System.arraycopy(ai, 0, ai2, j, i);
                b = ai2;
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L34:
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
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L30; else goto _L29
_L29:
        kwj1.e(i);
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ai, 0, i);
            j = i;
        }
_L32:
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
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L30
        if (true) goto _L32; else goto _L31
_L31:
        if (true) goto _L34; else goto _L33
_L33:
_L30:
        kwj1.d(l);
        continue; /* Loop/switch isn't completed */
_L8:
        c = Boolean.valueOf(kwj1.i());
        if (true) goto _L36; else goto _L35
_L35:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                kwk1.a(2, a[i]);
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                kwk1.a(3, b[j]);
            }

        }
        if (c != null)
        {
            kwk1.a(4, c.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
