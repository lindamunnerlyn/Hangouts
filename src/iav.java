// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iav extends koj
{

    private static volatile iav c[];
    public int a[];
    public String b;

    public iav()
    {
        a = kou.a;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iav[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new iav[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int i = 0;
        int l = super.computeSerializedSize();
        int k;
        if (a != null && a.length > 0)
        {
            int j = 0;
            for (; i < a.length; i++)
            {
                j += koh.e(a[i]);
            }

            i = l + j + a.length * 1;
        } else
        {
            i = l;
        }
        k = i;
        if (b != null)
        {
            k = i + koh.b(2, b);
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
_L20:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 4: default 52
    //                   0: 62
    //                   8: 64
    //                   10: 296
    //                   18: 590;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int ai[];
        int j;
        int i1;
        i1 = kou.b(kog1, 8);
        ai = new int[i1];
        j = 0;
        i = 0;
_L12:
        if (j >= i1) goto _L7; else goto _L6
_L6:
        int j1;
        if (j != 0)
        {
            kog1.a();
        }
        j1 = kog1.f();
        j1;
        JVM INSTR tableswitch 0 13: default 180
    //                   0 189
    //                   1 189
    //                   2 189
    //                   3 189
    //                   4 189
    //                   5 189
    //                   6 189
    //                   7 189
    //                   8 189
    //                   9 189
    //                   10 189
    //                   11 189
    //                   12 189
    //                   13 189;
           goto _L8 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9
_L8:
        j++;
          goto _L10
_L9:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L8; else goto _L10
_L10:
        if (true) goto _L12; else goto _L11
_L11:
_L7:
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
        l = kog1.c(kog1.p());
        i = kog1.r();
        j = 0;
_L18:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
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
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L14; else goto _L13
_L13:
        kog1.e(i);
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
_L16:
        if (kog1.q() > 0)
        {
            i = kog1.f();
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
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
          goto _L14
        if (true) goto _L16; else goto _L15
_L15:
        if (true) goto _L18; else goto _L17
_L17:
_L14:
        kog1.d(l);
        continue; /* Loop/switch isn't completed */
_L5:
        b = kog1.j();
        if (true) goto _L20; else goto _L19
_L19:
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                koh1.a(1, a[i]);
            }

        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        super.writeTo(koh1);
    }
}
