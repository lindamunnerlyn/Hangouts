// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class its extends koj
{

    public ist a[];
    public int b[];
    public ist c;
    public ixf requestHeader;

    public its()
    {
        requestHeader = null;
        a = ist.a();
        b = kou.a;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (requestHeader != null)
        {
            j = i + koh.d(1, requestHeader);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(2, c);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    ist ist1 = a[j];
                    int k = i;
                    if (ist1 != null)
                    {
                        k = i + koh.d(3, ist1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                int l = 0;
                for (i = ((flag) ? 1 : 0); i < b.length; i++)
                {
                    l += koh.e(b[i]);
                }

                i = j + l + b.length * 1;
            }
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L22:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 6: default 68
    //                   0: 78
    //                   10: 80
    //                   18: 109
    //                   26: 138
    //                   32: 269
    //                   34: 456;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        if (requestHeader == null)
        {
            requestHeader = new ixf();
        }
        kog1.a(requestHeader);
        continue; /* Loop/switch isn't completed */
_L4:
        if (c == null)
        {
            c = new ist();
        }
        kog1.a(c);
        continue; /* Loop/switch isn't completed */
_L5:
        int j = kou.b(kog1, 26);
        ist aist[];
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        aist = new ist[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, aist, 0, i);
            j = i;
        }
        for (; j < aist.length - 1; j++)
        {
            aist[j] = new ist();
            kog1.a(aist[j]);
            kog1.a();
        }

        aist[j] = new ist();
        kog1.a(aist[j]);
        a = aist;
        continue; /* Loop/switch isn't completed */
_L6:
        int ai[];
        int k;
        int j1;
        j1 = kou.b(kog1, 32);
        ai = new int[j1];
        k = 0;
        i = 0;
_L14:
        if (k >= j1) goto _L9; else goto _L8
_L8:
        int k1;
        if (k != 0)
        {
            kog1.a();
        }
        k1 = kog1.f();
        k1;
        JVM INSTR tableswitch 0 2: default 340
    //                   0 349
    //                   1 349
    //                   2 349;
           goto _L10 _L11 _L11 _L11
_L10:
        k++;
          goto _L12
_L11:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L10; else goto _L12
_L12:
        if (true) goto _L14; else goto _L13
_L13:
_L9:
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
_L7:
        int i1;
        i1 = kog1.c(kog1.p());
        i = kog1.r();
        k = 0;
_L20:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L16; else goto _L15
_L15:
        kog1.e(i);
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
_L18:
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
        b = ai;
          goto _L16
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
_L16:
        kog1.d(i1);
        if (true) goto _L22; else goto _L21
_L21:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                ist ist1 = a[i];
                if (ist1 != null)
                {
                    koh1.b(3, ist1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                koh1.a(4, b[j]);
            }

        }
        super.writeTo(koh1);
    }
}
