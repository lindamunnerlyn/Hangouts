// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jmh extends kwm
{

    public jmi a[];
    public jmj b[];
    public int c[];

    public jmh()
    {
        a = jmi.a();
        b = jmj.a();
        c = kwx.a;
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
                    jmi jmi1 = a[j];
                    int k = i;
                    if (jmi1 != null)
                    {
                        k = i + kwk.d(1, jmi1);
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
                    jmj jmj1 = b[j];
                    int l = i;
                    if (jmj1 != null)
                    {
                        l = i + kwk.d(2, jmj1);
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
                    i1 += kwk.e(c[i]);
                }

                i = j + i1 + c.length * 1;
            }
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L21:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 60
    //                   0: 70
    //                   10: 72
    //                   18: 203
    //                   24: 334
    //                   26: 564;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int j = kwx.a(kwj1, 10);
        jmi ajmi[];
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ajmi = new jmi[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ajmi, 0, i);
            j = i;
        }
        for (; j < ajmi.length - 1; j++)
        {
            ajmi[j] = new jmi();
            kwj1.a(ajmi[j]);
            kwj1.a();
        }

        ajmi[j] = new jmi();
        kwj1.a(ajmi[j]);
        a = ajmi;
        continue; /* Loop/switch isn't completed */
_L4:
        int k = kwx.a(kwj1, 18);
        jmj ajmj[];
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ajmj = new jmj[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ajmj, 0, i);
            k = i;
        }
        for (; k < ajmj.length - 1; k++)
        {
            ajmj[k] = new jmj();
            kwj1.a(ajmj[k]);
            kwj1.a();
        }

        ajmj[k] = new jmj();
        kwj1.a(ajmj[k]);
        b = ajmj;
        continue; /* Loop/switch isn't completed */
_L5:
        int ai[];
        int l;
        int k1;
        k1 = kwx.a(kwj1, 24);
        ai = new int[k1];
        l = 0;
        i = 0;
_L13:
        if (l >= k1) goto _L8; else goto _L7
_L7:
        int l1;
        if (l != 0)
        {
            kwj1.a();
        }
        l1 = kwj1.f();
        l1;
        JVM INSTR tableswitch 0 13: default 448
    //                   0 457
    //                   1 457
    //                   2 457
    //                   3 457
    //                   4 457
    //                   5 457
    //                   6 457
    //                   7 457
    //                   8 457
    //                   9 457
    //                   10 457
    //                   11 457
    //                   12 457
    //                   13 457;
           goto _L9 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10
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
        j1 = kwj1.c(kwj1.p());
        i = kwj1.r();
        l = 0;
_L19:
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
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
                l++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l == 0) goto _L15; else goto _L14
_L14:
        kwj1.e(i);
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
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
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
        kwj1.d(j1);
        if (true) goto _L21; else goto _L20
_L20:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                jmi jmi1 = a[i];
                if (jmi1 != null)
                {
                    kwk1.b(1, jmi1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                jmj jmj1 = b[j];
                if (jmj1 != null)
                {
                    kwk1.b(2, jmj1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                kwk1.a(3, c[k]);
            }

        }
        super.writeTo(kwk1);
    }
}
