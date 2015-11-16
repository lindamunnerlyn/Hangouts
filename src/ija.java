// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ija extends koj
{

    public Boolean a;
    public int b[];

    public ija()
    {
        a = null;
        b = kou.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (koh.f(1) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < b.length; j++)
                {
                    k += koh.e(b[j]);
                }

                j = i + k + b.length * 1;
            }
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L20:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 4: default 52
    //                   0: 62
    //                   8: 64
    //                   16: 78
    //                   18: 280;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L4:
        int ai[];
        int j;
        int i1;
        i1 = kou.b(kog1, 16);
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
        JVM INSTR tableswitch 1 7: default 164
    //                   1 173
    //                   2 173
    //                   3 173
    //                   4 173
    //                   5 173
    //                   6 173
    //                   7 173;
           goto _L8 _L9 _L9 _L9 _L9 _L9 _L9 _L9
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
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                b = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l;
        l = kog1.c(kog1.p());
        i = kog1.r();
        j = 0;
_L18:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L14; else goto _L13
_L13:
        kog1.e(i);
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
_L16:
        if (kog1.q() > 0)
        {
            i = kog1.f();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L14
        if (true) goto _L16; else goto _L15
_L15:
        if (true) goto _L18; else goto _L17
_L17:
_L14:
        kog1.d(l);
        if (true) goto _L20; else goto _L19
_L19:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                koh1.a(2, b[i]);
            }

        }
        super.writeTo(koh1);
    }
}
