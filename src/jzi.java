// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jzi extends kwm
{

    public byte a[];
    public int b[];
    public byte c[][];
    public byte d[][];
    public int e[];
    public Long f;

    public jzi()
    {
        a = null;
        b = kwx.a;
        c = kwx.g;
        d = kwx.g;
        e = kwx.a;
        f = null;
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
            j = i + kwk.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = 0;
                int k = 0;
                for (; i < b.length; i++)
                {
                    k += kwk.e(b[i]);
                }

                i = j + k + b.length * 1;
            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                j = 0;
                int l = 0;
                int j1;
                int l1;
                for (j1 = 0; j < c.length; j1 = l1)
                {
                    byte abyte0[] = c[j];
                    int j2 = l;
                    l1 = j1;
                    if (abyte0 != null)
                    {
                        l1 = j1 + 1;
                        j2 = l + kwk.a(abyte0);
                    }
                    j++;
                    l = j2;
                }

                j = i + l + j1 * 1;
            }
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                int i1 = 0;
                int k1 = 0;
                for (i = ((flag) ? 1 : 0); i < d.length;)
                {
                    byte abyte1[] = d[i];
                    int k2 = i1;
                    int i2 = k1;
                    if (abyte1 != null)
                    {
                        i2 = k1 + 1;
                        k2 = i1 + kwk.a(abyte1);
                    }
                    i++;
                    i1 = k2;
                    k1 = i2;
                }

                i = j + i1 + k1 * 1;
            }
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                j = i + e.length * 4 + e.length * 1;
            }
        }
        i = j;
        if (f != null)
        {
            f.longValue();
            i = j + (kwk.f(6) + 8);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L25:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 9: default 92
    //                   0: 102
    //                   10: 104
    //                   16: 115
    //                   18: 300
    //                   26: 506
    //                   34: 615
    //                   42: 832
    //                   45: 724
    //                   49: 943;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kwj1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        a = kwj1.k();
        continue; /* Loop/switch isn't completed */
_L4:
        int ai[];
        int j1;
        int j3;
        j3 = kwx.a(kwj1, 16);
        ai = new int[j3];
        j1 = 0;
        i = 0;
_L17:
        if (j1 >= j3) goto _L12; else goto _L11
_L11:
        int k3;
        if (j1 != 0)
        {
            kwj1.a();
        }
        k3 = kwj1.f();
        k3;
        JVM INSTR tableswitch 1 3: default 184
    //                   1 193
    //                   2 193
    //                   3 193;
           goto _L13 _L14 _L14 _L14
_L13:
        j1++;
          goto _L15
_L14:
        int k2 = i + 1;
        ai[i] = k3;
        i = k2;
        if (true) goto _L13; else goto _L15
_L15:
        if (true) goto _L17; else goto _L16
_L16:
_L12:
        if (i != 0)
        {
            if (b == null)
            {
                j1 = 0;
            } else
            {
                j1 = b.length;
            }
            if (j1 == 0 && i == ai.length)
            {
                b = ai;
            } else
            {
                int ai3[] = new int[j1 + i];
                if (j1 != 0)
                {
                    System.arraycopy(b, 0, ai3, 0, j1);
                }
                System.arraycopy(ai, 0, ai3, j1, i);
                b = ai3;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l2;
        l2 = kwj1.c(kwj1.p());
        i = kwj1.r();
        j1 = 0;
_L23:
        if (kwj1.q() > 0)
        {
            switch (kwj1.f())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 0) goto _L19; else goto _L18
_L18:
        kwj1.e(i);
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ai = new int[j1 + i];
        j1 = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ai, 0, i);
            j1 = i;
        }
_L21:
        if (kwj1.q() > 0)
        {
            i = kwj1.f();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                ai[j1] = i;
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L19
        if (true) goto _L21; else goto _L20
_L20:
        if (true) goto _L23; else goto _L22
_L22:
_L19:
        kwj1.d(l2);
        continue; /* Loop/switch isn't completed */
_L6:
        int k1 = kwx.a(kwj1, 26);
        byte abyte0[][];
        int j;
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.length;
        }
        abyte0 = new byte[k1 + j][];
        k1 = j;
        if (j != 0)
        {
            System.arraycopy(c, 0, abyte0, 0, j);
            k1 = j;
        }
        for (; k1 < abyte0.length - 1; k1++)
        {
            abyte0[k1] = kwj1.k();
            kwj1.a();
        }

        abyte0[k1] = kwj1.k();
        c = abyte0;
        continue; /* Loop/switch isn't completed */
_L7:
        int l1 = kwx.a(kwj1, 34);
        byte abyte1[][];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        abyte1 = new byte[l1 + k][];
        l1 = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, abyte1, 0, k);
            l1 = k;
        }
        for (; l1 < abyte1.length - 1; l1++)
        {
            abyte1[l1] = kwj1.k();
            kwj1.a();
        }

        abyte1[l1] = kwj1.k();
        d = abyte1;
        continue; /* Loop/switch isn't completed */
_L9:
        int i2 = kwx.a(kwj1, 45);
        int ai1[];
        int l;
        if (e == null)
        {
            l = 0;
        } else
        {
            l = e.length;
        }
        ai1 = new int[i2 + l];
        i2 = l;
        if (l != 0)
        {
            System.arraycopy(e, 0, ai1, 0, l);
            i2 = l;
        }
        for (; i2 < ai1.length - 1; i2++)
        {
            ai1[i2] = kwj1.h();
            kwj1.a();
        }

        ai1[i2] = kwj1.h();
        e = ai1;
        continue; /* Loop/switch isn't completed */
_L8:
        int i1 = kwj1.p();
        int i3 = kwj1.c(i1);
        int j2 = i1 / 4;
        int ai2[];
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        ai2 = new int[j2 + i1];
        j2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, ai2, 0, i1);
            j2 = i1;
        }
        for (; j2 < ai2.length; j2++)
        {
            ai2[j2] = kwj1.h();
        }

        e = ai2;
        kwj1.d(i3);
        continue; /* Loop/switch isn't completed */
_L10:
        f = Long.valueOf(kwj1.g());
        if (true) goto _L25; else goto _L24
_L24:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kwk1.a(2, b[i]);
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                byte abyte0[] = c[j];
                if (abyte0 != null)
                {
                    kwk1.a(3, abyte0);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = 0; k < d.length; k++)
            {
                byte abyte1[] = d[k];
                if (abyte1 != null)
                {
                    kwk1.a(4, abyte1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < e.length; l++)
            {
                kwk1.b(5, e[l]);
            }

        }
        if (f != null)
        {
            kwk1.c(6, f.longValue());
        }
        super.writeTo(kwk1);
    }
}
