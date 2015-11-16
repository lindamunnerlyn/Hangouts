// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcq extends kwm
{

    public Integer a;
    public String b;
    public int c[];

    public jcq()
    {
        a = null;
        b = null;
        c = kwx.a;
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
            j = i + kwk.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(2, b);
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
                    k += kwk.e(c[j]);
                }

                j = i + k + c.length * 1;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 60
    //                   0: 70
    //                   8: 72
    //                   18: 127
    //                   24: 138
    //                   26: 352;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        i = kwj1.f();
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            a = Integer.valueOf(i);
            break;
        }
          goto _L8
_L4:
        b = kwj1.j();
          goto _L8
_L5:
        int ai[];
        int j;
        int i1;
        i1 = kwx.a(kwj1, 24);
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
        JVM INSTR tableswitch 1 10: default 236
    //                   1 245
    //                   2 245
    //                   3 245
    //                   4 245
    //                   5 245
    //                   6 245
    //                   7 245
    //                   8 245
    //                   9 245
    //                   10 245;
           goto _L11 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12 _L12
_L11:
        j++;
          goto _L13
_L12:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L11; else goto _L10
_L10:
        if (i != 0)
        {
            if (c == null)
            {
                j = 0;
            } else
            {
                j = c.length;
            }
            if (j == 0 && i == ai.length)
            {
                c = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                c = ai1;
            }
        }
          goto _L8
_L13:
        if (true) goto _L15; else goto _L14
_L14:
_L6:
        int l;
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L24:
        if (kwj1.q() <= 0) goto _L17; else goto _L16
_L16:
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
            j++;
            break;
        }
          goto _L18
_L17:
        if (j == 0) goto _L20; else goto _L19
_L19:
        kwj1.e(i);
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(c, 0, ai, 0, i);
            j = i;
        }
_L22:
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
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        c = ai;
_L20:
        kwj1.d(l);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L22; else goto _L21
_L21:
_L18:
        if (true) goto _L24; else goto _L23
_L23:
_L8:
        if (true) goto _L7; else goto _L25
_L25:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kwk1.a(3, c[i]);
            }

        }
        super.writeTo(kwk1);
    }
}
