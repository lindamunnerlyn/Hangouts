// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxj extends koj
{

    public Integer a;
    public Integer b;
    public Integer c;
    public Long d;
    public int e[];
    public hxi f;
    public Boolean g;
    public Boolean h;

    public hxj()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kou.a;
        f = null;
        g = null;
        h = null;
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
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.e(3, b.intValue());
        }
        int k = j;
        if (c != null)
        {
            k = j + koh.e(4, c.intValue());
        }
        i = k;
        if (d != null)
        {
            i = k + koh.e(5, d.longValue());
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < e.length; j++)
                {
                    l += koh.e(e[j]);
                }

                j = i + l + e.length * 1;
            }
        }
        i = j;
        if (f != null)
        {
            i = j + koh.d(8, f);
        }
        j = i;
        if (g != null)
        {
            g.booleanValue();
            j = i + (koh.f(9) + 1);
        }
        i = j;
        if (h != null)
        {
            h.booleanValue();
            i = j + (koh.f(10) + 1);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L12:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 10: default 100
    //                   0: 110
    //                   8: 112
    //                   24: 167
    //                   32: 181
    //                   40: 235
    //                   48: 249
    //                   50: 496
    //                   66: 822
    //                   72: 851
    //                   80: 865;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        i = kog1.f();
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            a = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Integer.valueOf(kog1.f());
        continue; /* Loop/switch isn't completed */
_L5:
        i = kog1.f();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            c = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L7:
        int ai[];
        int j;
        int i1;
        i1 = kou.b(kog1, 48);
        ai = new int[i1];
        j = 0;
        i = 0;
_L18:
        if (j >= i1) goto _L14; else goto _L13
_L13:
        int j1;
        if (j != 0)
        {
            kog1.a();
        }
        j1 = kog1.f();
        j1;
        JVM INSTR tableswitch 1 18: default 380
    //                   1 389
    //                   2 389
    //                   3 389
    //                   4 389
    //                   5 389
    //                   6 389
    //                   7 389
    //                   8 389
    //                   9 389
    //                   10 389
    //                   11 389
    //                   12 389
    //                   13 389
    //                   14 389
    //                   15 389
    //                   16 389
    //                   17 389
    //                   18 389;
           goto _L15 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16
_L15:
        j++;
        continue; /* Loop/switch isn't completed */
_L16:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L15; else goto _L14
_L14:
        if (i != 0)
        {
            if (e == null)
            {
                j = 0;
            } else
            {
                j = e.length;
            }
            if (j == 0 && i == ai.length)
            {
                e = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(e, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                e = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L18; else goto _L17
_L17:
_L8:
        int l;
        l = kog1.c(kog1.p());
        i = kog1.r();
        j = 0;
_L24:
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
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L20; else goto _L19
_L19:
        kog1.e(i);
        if (e == null)
        {
            i = 0;
        } else
        {
            i = e.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(e, 0, ai, 0, i);
            j = i;
        }
_L22:
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
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        e = ai;
_L20:
        kog1.d(l);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L22; else goto _L21
_L21:
        if (true) goto _L24; else goto _L23
_L23:
_L9:
        if (f == null)
        {
            f = new hxi();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L10:
        g = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L11:
        h = Boolean.valueOf(kog1.i());
        if (true) goto _L12; else goto _L25
_L25:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(3, b.intValue());
        }
        if (c != null)
        {
            koh1.a(4, c.intValue());
        }
        if (d != null)
        {
            koh1.b(5, d.longValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                koh1.a(6, e[i]);
            }

        }
        if (f != null)
        {
            koh1.b(8, f);
        }
        if (g != null)
        {
            koh1.a(9, g.booleanValue());
        }
        if (h != null)
        {
            koh1.a(10, h.booleanValue());
        }
        super.writeTo(koh1);
    }
}
