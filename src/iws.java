// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iws extends kwm
{

    public Boolean a;
    public Boolean b;
    public Integer c;
    public int d[];

    public iws()
    {
        a = null;
        b = null;
        c = null;
        d = kwx.a;
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
            i = j + (kwk.f(1) + 1);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (kwk.f(2) + 1);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < d.length; j++)
                {
                    k += kwk.e(d[j]);
                }

                j = i + k + d.length * 1;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L22:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 6: default 68
    //                   0: 78
    //                   8: 80
    //                   16: 94
    //                   24: 108
    //                   32: 122
    //                   34: 304;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kwj1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L4:
        b = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        int ai[];
        int j;
        int i1;
        i1 = kwx.a(kwj1, 32);
        ai = new int[i1];
        j = 0;
        i = 0;
_L14:
        if (j >= i1) goto _L9; else goto _L8
_L8:
        int j1;
        if (j != 0)
        {
            kwj1.a();
        }
        j1 = kwj1.f();
        j1;
        JVM INSTR tableswitch 0 1: default 188
    //                   0 197
    //                   1 197;
           goto _L10 _L11 _L11
_L10:
        j++;
          goto _L12
_L11:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L10; else goto _L12
_L12:
        if (true) goto _L14; else goto _L13
_L13:
_L9:
        if (i != 0)
        {
            if (d == null)
            {
                j = 0;
            } else
            {
                j = d.length;
            }
            if (j == 0 && i == ai.length)
            {
                d = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(d, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                d = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int l;
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L20:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L16; else goto _L15
_L15:
        kwj1.e(i);
        if (d == null)
        {
            i = 0;
        } else
        {
            i = d.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(d, 0, ai, 0, i);
            j = i;
        }
_L18:
        if (kwj1.q() > 0)
        {
            i = kwj1.f();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        d = ai;
          goto _L16
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
_L16:
        kwj1.d(l);
        if (true) goto _L22; else goto _L21
_L21:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                kwk1.a(4, d[i]);
            }

        }
        super.writeTo(kwk1);
    }
}
