// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdg extends kwm
{

    public ixl a;
    public Long b;
    public Integer c;
    public int d[];
    public jdk requestHeader;

    public jdg()
    {
        requestHeader = null;
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
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(2, a);
        }
        int k = j;
        if (c != null)
        {
            k = j + kwk.e(3, c.intValue());
        }
        i = k;
        if (b != null)
        {
            i = k + kwk.d(4, b.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < d.length; j++)
                {
                    l += kwk.e(d[j]);
                }

                j = i + l + d.length * 1;
            }
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
    //                   10: 88
    //                   18: 117
    //                   24: 146
    //                   32: 195
    //                   40: 209
    //                   42: 392;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
          goto _L9
_L4:
        if (a == null)
        {
            a = new ixl();
        }
        kwj1.a(a);
          goto _L9
_L5:
        i = kwj1.f();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(i);
            break;
        }
          goto _L10
_L6:
        b = Long.valueOf(kwj1.d());
          goto _L10
_L7:
        int ai[];
        int j;
        int i1;
        i1 = kwx.a(kwj1, 40);
        ai = new int[i1];
        j = 0;
        i = 0;
_L17:
        if (j >= i1) goto _L12; else goto _L11
_L11:
        int j1;
        if (j != 0)
        {
            kwj1.a();
        }
        j1 = kwj1.f();
        j1;
        JVM INSTR tableswitch 1 2: default 276
    //                   1 285
    //                   2 285;
           goto _L13 _L14 _L14
_L13:
        j++;
          goto _L15
_L14:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L13; else goto _L12
_L12:
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
          goto _L10
_L15:
        if (true) goto _L17; else goto _L16
_L16:
_L8:
        int l;
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L26:
        if (kwj1.q() <= 0) goto _L19; else goto _L18
_L18:
        switch (kwj1.f())
        {
        case 1: // '\001'
        case 2: // '\002'
            j++;
            break;
        }
          goto _L20
_L19:
        if (j == 0) goto _L22; else goto _L21
_L21:
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
_L24:
        if (kwj1.q() > 0)
        {
            i = kwj1.f();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        d = ai;
_L22:
        kwj1.d(l);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L24; else goto _L23
_L23:
_L20:
        if (true) goto _L26; else goto _L25
_L25:
_L10:
        if (true) goto _L9; else goto _L27
_L27:
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (b != null)
        {
            kwk1.a(4, b.longValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                kwk1.a(5, d[i]);
            }

        }
        super.writeTo(kwk1);
    }
}
