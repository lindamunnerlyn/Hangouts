// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hvv extends kwm
{

    public hvw a[];
    public int b[];

    public hvv()
    {
        a = hvw.a();
        b = kwx.a;
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
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    hvw hvw1 = a[j];
                    int k = i;
                    if (hvw1 != null)
                    {
                        k = i + kwk.d(1, hvw1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < b.length; j++)
                {
                    l += kwk.e(b[j]);
                }

                j = i + l + b.length * 1;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L20:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 4: default 52
    //                   0: 62
    //                   10: 64
    //                   16: 195
    //                   18: 392;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int j = kwx.a(kwj1, 10);
        hvw ahvw[];
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ahvw = new hvw[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ahvw, 0, i);
            j = i;
        }
        for (; j < ahvw.length - 1; j++)
        {
            ahvw[j] = new hvw();
            kwj1.a(ahvw[j]);
            kwj1.a();
        }

        ahvw[j] = new hvw();
        kwj1.a(ahvw[j]);
        a = ahvw;
        continue; /* Loop/switch isn't completed */
_L4:
        int ai[];
        int k;
        int j1;
        j1 = kwx.a(kwj1, 16);
        ai = new int[j1];
        k = 0;
        i = 0;
_L12:
        if (k >= j1) goto _L7; else goto _L6
_L6:
        int k1;
        if (k != 0)
        {
            kwj1.a();
        }
        k1 = kwj1.f();
        k1;
        JVM INSTR tableswitch 0 5: default 276
    //                   0 285
    //                   1 285
    //                   2 285
    //                   3 285
    //                   4 285
    //                   5 285;
           goto _L8 _L9 _L9 _L9 _L9 _L9 _L9
_L8:
        k++;
          goto _L10
_L9:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L8; else goto _L10
_L10:
        if (true) goto _L12; else goto _L11
_L11:
_L7:
        if (i != 0)
        {
            if (b == null)
            {
                k = 0;
            } else
            {
                k = b.length;
            }
            if (k == 0 && i == ai.length)
            {
                b = ai;
            } else
            {
                int ai1[] = new int[k + i];
                if (k != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, i);
                b = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int i1;
        i1 = kwj1.c(kwj1.p());
        i = kwj1.r();
        k = 0;
_L18:
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
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L14; else goto _L13
_L13:
        kwj1.e(i);
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ai = new int[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ai, 0, i);
            k = i;
        }
_L16:
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
                ai[k] = i;
                k++;
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
        kwj1.d(i1);
        if (true) goto _L20; else goto _L19
_L19:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                hvw hvw1 = a[i];
                if (hvw1 != null)
                {
                    kwk1.b(1, hvw1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                kwk1.a(2, b[j]);
            }

        }
        super.writeTo(kwk1);
    }
}
