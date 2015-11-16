// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class agt extends koj
{

    public Integer a;
    public Integer b;
    public int c[];
    public Integer d;
    public Boolean e;

    public agt()
    {
        a = null;
        b = null;
        c = kou.a;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + koh.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < c.length; j++)
                {
                    k += koh.e(c[j]);
                }

                j = i + k + c.length * 1;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.e(4, d.intValue());
        }
        j = i;
        if (e != null)
        {
            e.booleanValue();
            j = i + (koh.f(5) + 1);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L9:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   16: 97
    //                   24: 111
    //                   26: 212
    //                   32: 340
    //                   40: 442;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(kog1.f());
          goto _L9
_L4:
        b = Integer.valueOf(kog1.f());
          goto _L9
_L5:
        int i1 = kou.b(kog1, 24);
        int ai[];
        int j;
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.length;
        }
        ai = new int[i1 + j];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(c, 0, ai, 0, j);
            i1 = j;
        }
        for (; i1 < ai.length - 1; i1++)
        {
            ai[i1] = kog1.f();
            kog1.a();
        }

        ai[i1] = kog1.f();
        c = ai;
          goto _L9
_L6:
        int k1 = kog1.c(kog1.p());
        int k = kog1.r();
        int j1;
        for (j1 = 0; kog1.q() > 0; j1++)
        {
            kog1.f();
        }

        kog1.e(k);
        int ai1[];
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        ai1 = new int[j1 + k];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, ai1, 0, k);
            j1 = k;
        }
        for (; j1 < ai1.length; j1++)
        {
            ai1[j1] = kog1.f();
        }

        c = ai1;
        kog1.d(k1);
          goto _L9
_L7:
        int l = kog1.f();
        switch (l)
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
            d = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        e = Boolean.valueOf(kog1.i());
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                koh1.a(3, c[i]);
            }

        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.a(5, e.booleanValue());
        }
        super.writeTo(koh1);
    }
}
