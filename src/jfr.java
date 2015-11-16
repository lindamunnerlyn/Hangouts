// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfr extends koj
{

    public jfs a[];
    public jft b[];
    public int c[];

    public jfr()
    {
        a = jfs.a();
        b = jft.a();
        c = kou.a;
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
                    jfs jfs1 = a[j];
                    int k = i;
                    if (jfs1 != null)
                    {
                        k = i + koh.d(1, jfs1);
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
                for (j = 0; j < b.length;)
                {
                    jft jft1 = b[j];
                    int l = i;
                    if (jft1 != null)
                    {
                        l = i + koh.d(2, jft1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                int i1 = 0;
                for (i = ((flag) ? 1 : 0); i < c.length; i++)
                {
                    i1 += koh.e(c[i]);
                }

                i = j + i1 + c.length * 1;
            }
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L21:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 60
    //                   0: 70
    //                   10: 72
    //                   18: 203
    //                   24: 334
    //                   26: 536;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int j = kou.b(kog1, 10);
        jfs ajfs[];
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ajfs = new jfs[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ajfs, 0, i);
            j = i;
        }
        for (; j < ajfs.length - 1; j++)
        {
            ajfs[j] = new jfs();
            kog1.a(ajfs[j]);
            kog1.a();
        }

        ajfs[j] = new jfs();
        kog1.a(ajfs[j]);
        a = ajfs;
        continue; /* Loop/switch isn't completed */
_L4:
        int k = kou.b(kog1, 18);
        jft ajft[];
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ajft = new jft[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ajft, 0, i);
            k = i;
        }
        for (; k < ajft.length - 1; k++)
        {
            ajft[k] = new jft();
            kog1.a(ajft[k]);
            kog1.a();
        }

        ajft[k] = new jft();
        kog1.a(ajft[k]);
        b = ajft;
        continue; /* Loop/switch isn't completed */
_L5:
        int ai[];
        int l;
        int k1;
        k1 = kou.b(kog1, 24);
        ai = new int[k1];
        l = 0;
        i = 0;
_L13:
        if (l >= k1) goto _L8; else goto _L7
_L7:
        int l1;
        if (l != 0)
        {
            kog1.a();
        }
        l1 = kog1.f();
        l1;
        JVM INSTR tableswitch 0 6: default 420
    //                   0 429
    //                   1 429
    //                   2 429
    //                   3 429
    //                   4 429
    //                   5 429
    //                   6 429;
           goto _L9 _L10 _L10 _L10 _L10 _L10 _L10 _L10
_L9:
        l++;
          goto _L11
_L10:
        int i1 = i + 1;
        ai[i] = l1;
        i = i1;
        if (true) goto _L9; else goto _L11
_L11:
        if (true) goto _L13; else goto _L12
_L12:
_L8:
        if (i != 0)
        {
            if (c == null)
            {
                l = 0;
            } else
            {
                l = c.length;
            }
            if (l == 0 && i == ai.length)
            {
                c = ai;
            } else
            {
                int ai1[] = new int[l + i];
                if (l != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, l);
                }
                System.arraycopy(ai, 0, ai1, l, i);
                c = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int j1;
        j1 = kog1.c(kog1.p());
        i = kog1.r();
        l = 0;
_L19:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                l++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l == 0) goto _L15; else goto _L14
_L14:
        kog1.e(i);
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.length;
        }
        ai = new int[l + i];
        l = i;
        if (i != 0)
        {
            System.arraycopy(c, 0, ai, 0, i);
            l = i;
        }
_L17:
        if (kog1.q() > 0)
        {
            i = kog1.f();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                ai[l] = i;
                l++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        c = ai;
          goto _L15
        if (true) goto _L17; else goto _L16
_L16:
        if (true) goto _L19; else goto _L18
_L18:
_L15:
        kog1.d(j1);
        if (true) goto _L21; else goto _L20
_L20:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                jfs jfs1 = a[i];
                if (jfs1 != null)
                {
                    koh1.b(1, jfs1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                jft jft1 = b[j];
                if (jft1 != null)
                {
                    koh1.b(2, jft1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                koh1.a(3, c[k]);
            }

        }
        super.writeTo(koh1);
    }
}
