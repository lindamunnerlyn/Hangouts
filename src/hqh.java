// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hqh extends koj
{

    public String a;
    public Integer b;
    public Integer c;
    public hqi d;
    public String e[];
    public hqe f;
    public int g[];

    public hqh()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kou.f;
        f = null;
        g = kou.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize() + koh.b(1, a) + koh.e(2, b.intValue());
        int j = i;
        if (c != null)
        {
            j = i + koh.e(3, c.intValue());
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                j = 0;
                int k = 0;
                int i1;
                int j1;
                for (i1 = 0; j < e.length; i1 = j1)
                {
                    String s = e[j];
                    int k1 = k;
                    j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = k + koh.a(s);
                    }
                    j++;
                    k = k1;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (f != null)
        {
            i = j + koh.d(6, f);
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
                    l += koh.e(g[j]);
                }

                j = i + l + g.length * 1;
            }
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L11:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 9: default 92
    //                   0: 102
    //                   10: 104
    //                   16: 115
    //                   24: 163
    //                   34: 207
    //                   42: 236
    //                   50: 345
    //                   56: 374
    //                   58: 560;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L11
_L4:
        i = kog1.f();
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            b = Integer.valueOf(i);
            break;
        }
          goto _L12
_L5:
        i = kog1.f();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
            c = Integer.valueOf(i);
            break;
        }
          goto _L12
_L6:
        if (d == null)
        {
            d = new hqi();
        }
        kog1.a(d);
          goto _L12
_L7:
        int j = kou.b(kog1, 42);
        String as[];
        if (e == null)
        {
            i = 0;
        } else
        {
            i = e.length;
        }
        as = new String[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(e, 0, as, 0, i);
            j = i;
        }
        for (; j < as.length - 1; j++)
        {
            as[j] = kog1.j();
            kog1.a();
        }

        as[j] = kog1.j();
        e = as;
          goto _L12
_L8:
        if (f == null)
        {
            f = new hqe();
        }
        kog1.a(f);
          goto _L12
_L9:
        int ai[];
        int k;
        int j1;
        j1 = kou.b(kog1, 56);
        ai = new int[j1];
        k = 0;
        i = 0;
_L19:
        if (k >= j1) goto _L14; else goto _L13
_L13:
        int k1;
        if (k != 0)
        {
            kog1.a();
        }
        k1 = kog1.f();
        k1;
        JVM INSTR tableswitch 0 2: default 444
    //                   0 453
    //                   1 453
    //                   2 453;
           goto _L15 _L16 _L16 _L16
_L15:
        k++;
          goto _L17
_L16:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L15; else goto _L14
_L14:
        if (i != 0)
        {
            if (g == null)
            {
                k = 0;
            } else
            {
                k = g.length;
            }
            if (k == 0 && i == ai.length)
            {
                g = ai;
            } else
            {
                int ai1[] = new int[k + i];
                if (k != 0)
                {
                    System.arraycopy(g, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, i);
                g = ai1;
            }
        }
          goto _L12
_L17:
        if (true) goto _L19; else goto _L18
_L18:
_L10:
        int i1;
        i1 = kog1.c(kog1.p());
        i = kog1.r();
        k = 0;
_L28:
        if (kog1.q() <= 0) goto _L21; else goto _L20
_L20:
        switch (kog1.f())
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            k++;
            break;
        }
          goto _L22
_L21:
        if (k == 0) goto _L24; else goto _L23
_L23:
        kog1.e(i);
        if (g == null)
        {
            i = 0;
        } else
        {
            i = g.length;
        }
        ai = new int[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(g, 0, ai, 0, i);
            k = i;
        }
_L26:
        if (kog1.q() > 0)
        {
            i = kog1.f();
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
        g = ai;
_L24:
        kog1.d(i1);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L26; else goto _L25
_L25:
_L22:
        if (true) goto _L28; else goto _L27
_L27:
_L12:
        if (true) goto _L11; else goto _L29
_L29:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        koh1.a(1, a);
        koh1.a(2, b.intValue());
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    koh1.a(5, s);
                }
            }

        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null && g.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < g.length; j++)
            {
                koh1.a(7, g[j]);
            }

        }
        super.writeTo(koh1);
    }
}
