// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdp extends kwm
{

    public String a;
    public Integer b;
    public Integer c;
    public Boolean d;
    public Boolean e;
    public int f[];
    public byte g[][];
    public Boolean h;
    public jdk requestHeader;

    public jdp()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = kwx.a;
        g = kwx.g;
        h = null;
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
        if (g != null)
        {
            j = i;
            if (g.length > 0)
            {
                j = 0;
                int k = 0;
                int i1;
                int j1;
                for (i1 = 0; j < g.length; i1 = j1)
                {
                    byte abyte0[] = g[j];
                    int k1 = k;
                    j1 = i1;
                    if (abyte0 != null)
                    {
                        j1 = i1 + 1;
                        k1 = k + kwk.a(abyte0);
                    }
                    j++;
                    k = k1;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (a != null)
        {
            i = j + kwk.b(3, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(4, b.intValue());
        }
        i = j;
        if (h != null)
        {
            h.booleanValue();
            i = j + (kwk.f(5) + 1);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(6) + 1);
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (kwk.f(7) + 1);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < f.length; j++)
                {
                    l += kwk.e(f[j]);
                }

                j = i + l + f.length * 1;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(9, c.intValue());
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L27:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 11: default 108
    //                   0: 118
    //                   10: 120
    //                   18: 149
    //                   26: 258
    //                   32: 269
    //                   40: 283
    //                   48: 297
    //                   56: 311
    //                   64: 325
    //                   66: 512
    //                   72: 718;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
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
        int j = kwx.a(kwj1, 18);
        byte abyte0[][];
        if (g == null)
        {
            i = 0;
        } else
        {
            i = g.length;
        }
        abyte0 = new byte[j + i][];
        j = i;
        if (i != 0)
        {
            System.arraycopy(g, 0, abyte0, 0, i);
            j = i;
        }
        for (; j < abyte0.length - 1; j++)
        {
            abyte0[j] = kwj1.k();
            kwj1.a();
        }

        abyte0[j] = kwj1.k();
        g = abyte0;
        continue; /* Loop/switch isn't completed */
_L5:
        a = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        b = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        h = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        d = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L9:
        e = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L10:
        int ai[];
        int k;
        int j1;
        j1 = kwx.a(kwj1, 64);
        ai = new int[j1];
        k = 0;
        i = 0;
_L19:
        if (k >= j1) goto _L14; else goto _L13
_L13:
        int k1;
        if (k != 0)
        {
            kwj1.a();
        }
        k1 = kwj1.f();
        k1;
        JVM INSTR tableswitch 0 2: default 396
    //                   0 405
    //                   1 405
    //                   2 405;
           goto _L15 _L16 _L16 _L16
_L15:
        k++;
          goto _L17
_L16:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L15; else goto _L17
_L17:
        if (true) goto _L19; else goto _L18
_L18:
_L14:
        if (i != 0)
        {
            if (f == null)
            {
                k = 0;
            } else
            {
                k = f.length;
            }
            if (k == 0 && i == ai.length)
            {
                f = ai;
            } else
            {
                int ai1[] = new int[k + i];
                if (k != 0)
                {
                    System.arraycopy(f, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, i);
                f = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L11:
        int i1;
        i1 = kwj1.c(kwj1.p());
        i = kwj1.r();
        k = 0;
_L25:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L21; else goto _L20
_L20:
        kwj1.e(i);
        if (f == null)
        {
            i = 0;
        } else
        {
            i = f.length;
        }
        ai = new int[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(f, 0, ai, 0, i);
            k = i;
        }
_L23:
        if (kwj1.q() > 0)
        {
            i = kwj1.f();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                ai[k] = i;
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        f = ai;
          goto _L21
        if (true) goto _L23; else goto _L22
_L22:
        if (true) goto _L25; else goto _L24
_L24:
_L21:
        kwj1.d(i1);
        continue; /* Loop/switch isn't completed */
_L12:
        c = Integer.valueOf(kwj1.f());
        if (true) goto _L27; else goto _L26
_L26:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (g != null && g.length > 0)
        {
            for (int i = 0; i < g.length; i++)
            {
                byte abyte0[] = g[i];
                if (abyte0 != null)
                {
                    kwk1.a(2, abyte0);
                }
            }

        }
        if (a != null)
        {
            kwk1.a(3, a);
        }
        if (b != null)
        {
            kwk1.a(4, b.intValue());
        }
        if (h != null)
        {
            kwk1.a(5, h.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(6, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(7, e.booleanValue());
        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                kwk1.a(8, f[j]);
            }

        }
        if (c != null)
        {
            kwk1.a(9, c.intValue());
        }
        super.writeTo(kwk1);
    }
}
