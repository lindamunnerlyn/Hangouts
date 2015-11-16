// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfk extends kwm
{

    public Long a;
    public Integer b;
    public Integer c;
    public int d[];
    public Integer e;
    public Boolean f;
    public int g[];
    public jdk requestHeader;

    public jfk()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = kwx.a;
        e = null;
        f = null;
        g = kwx.a;
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
            j = i + kwk.e(2, a.longValue());
        }
        int k = j;
        if (b != null)
        {
            k = j + kwk.e(3, b.intValue());
        }
        i = k;
        if (c != null)
        {
            i = k + kwk.e(4, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                j = 0;
                k = 0;
                for (; j < d.length; j++)
                {
                    k += kwk.e(d[j]);
                }

                j = i + k + d.length * 1;
            }
        }
        k = j;
        if (e != null)
        {
            k = j + kwk.e(6, e.intValue());
        }
        i = k;
        if (f != null)
        {
            f.booleanValue();
            i = k + (kwk.f(7) + 1);
        }
        j = i;
        if (g != null)
        {
            j = i;
            if (g.length > 0)
            {
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < g.length; j++)
                {
                    l += kwk.e(g[j]);
                }

                j = i + l + g.length * 1;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L13:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 11: default 108
    //                   0: 118
    //                   10: 120
    //                   16: 149
    //                   24: 163
    //                   32: 177
    //                   40: 191
    //                   42: 388
    //                   48: 618
    //                   56: 663
    //                   64: 677
    //                   66: 860;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new jdk();
        }
        kwj1.a(requestHeader);
          goto _L13
_L4:
        a = Long.valueOf(kwj1.e());
          goto _L13
_L5:
        b = Integer.valueOf(kwj1.f());
          goto _L13
_L6:
        c = Integer.valueOf(kwj1.f());
          goto _L13
_L7:
        int ai[];
        int j;
        int i1;
        i1 = kwx.a(kwj1, 40);
        ai = new int[i1];
        j = 0;
        i = 0;
_L20:
        if (j >= i1) goto _L15; else goto _L14
_L14:
        int j1;
        if (j != 0)
        {
            kwj1.a();
        }
        j1 = kwj1.f();
        j1;
        JVM INSTR tableswitch 0 5: default 272
    //                   0 281
    //                   1 281
    //                   2 281
    //                   3 281
    //                   4 281
    //                   5 281;
           goto _L16 _L17 _L17 _L17 _L17 _L17 _L17
_L16:
        j++;
          goto _L18
_L17:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L16; else goto _L18
_L18:
        if (true) goto _L20; else goto _L19
_L19:
_L15:
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
          goto _L13
_L8:
        int l;
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L26:
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
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
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
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        d = ai;
          goto _L22
        if (true) goto _L24; else goto _L23
_L23:
        if (true) goto _L26; else goto _L25
_L25:
_L22:
        kwj1.d(l);
          goto _L13
_L9:
        i = kwj1.f();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
            e = Integer.valueOf(i);
            break;
        }
          goto _L27
_L10:
        f = Boolean.valueOf(kwj1.i());
          goto _L27
_L11:
        i1 = kwx.a(kwj1, 64);
        ai = new int[i1];
        j = 0;
        i = 0;
_L34:
        if (j >= i1) goto _L29; else goto _L28
_L28:
        if (j != 0)
        {
            kwj1.a();
        }
        j1 = kwj1.f();
        j1;
        JVM INSTR tableswitch 0 1: default 744
    //                   0 753
    //                   1 753;
           goto _L30 _L31 _L31
_L30:
        j++;
          goto _L32
_L31:
        l = i + 1;
        ai[i] = j1;
        i = l;
        if (true) goto _L30; else goto _L29
_L29:
        if (i != 0)
        {
            if (g == null)
            {
                j = 0;
            } else
            {
                j = g.length;
            }
            if (j == 0 && i == ai.length)
            {
                g = ai;
            } else
            {
                int ai2[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(g, 0, ai2, 0, j);
                }
                System.arraycopy(ai, 0, ai2, j, i);
                g = ai2;
            }
        }
          goto _L27
_L32:
        if (true) goto _L34; else goto _L33
_L33:
_L12:
        l = kwj1.c(kwj1.p());
        i = kwj1.r();
        j = 0;
_L43:
        if (kwj1.q() <= 0) goto _L36; else goto _L35
_L35:
        switch (kwj1.f())
        {
        case 0: // '\0'
        case 1: // '\001'
            j++;
            break;
        }
          goto _L37
_L36:
        if (j == 0) goto _L39; else goto _L38
_L38:
        kwj1.e(i);
        if (g == null)
        {
            i = 0;
        } else
        {
            i = g.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(g, 0, ai, 0, i);
            j = i;
        }
_L41:
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
        g = ai;
_L39:
        kwj1.d(l);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L41; else goto _L40
_L40:
_L37:
        if (true) goto _L43; else goto _L42
_L42:
_L27:
        if (true) goto _L13; else goto _L44
_L44:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a.longValue());
        }
        if (b != null)
        {
            kwk1.a(3, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(4, c.intValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                kwk1.a(5, d[i]);
            }

        }
        if (e != null)
        {
            kwk1.a(6, e.intValue());
        }
        if (f != null)
        {
            kwk1.a(7, f.booleanValue());
        }
        if (g != null && g.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < g.length; j++)
            {
                kwk1.a(8, g[j]);
            }

        }
        super.writeTo(kwk1);
    }
}
