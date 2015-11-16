// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class irp extends koj
{

    public Integer a;
    public irb b;
    public iur c[];
    public Boolean d;
    public Long e;
    public String f;
    public byte g[][];
    public ixg responseHeader;

    public irp()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = iur.a();
        d = null;
        e = null;
        f = null;
        g = kou.g;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (responseHeader != null)
        {
            j = i + koh.d(1, responseHeader);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    iur iur1 = c[j];
                    int k = i;
                    if (iur1 != null)
                    {
                        k = i + koh.d(3, iur1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        int l = j;
        if (e != null)
        {
            l = j + koh.d(4, e.longValue());
        }
        i = l;
        if (f != null)
        {
            i = l + koh.b(5, f);
        }
        j = i;
        if (g != null)
        {
            j = i;
            if (g.length > 0)
            {
                int i1 = 0;
                int j1 = 0;
                for (j = ((flag) ? 1 : 0); j < g.length;)
                {
                    byte abyte0[] = g[j];
                    int l1 = i1;
                    int k1 = j1;
                    if (abyte0 != null)
                    {
                        k1 = j1 + 1;
                        l1 = i1 + koh.a(abyte0);
                    }
                    j++;
                    i1 = l1;
                    j1 = k1;
                }

                j = i + i1 + j1 * 1;
            }
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (koh.f(7) + 1);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.e(8, a.intValue());
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L11:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   18: 128
    //                   26: 157
    //                   32: 281
    //                   42: 295
    //                   50: 306
    //                   56: 408
    //                   64: 422;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (responseHeader == null)
        {
            responseHeader = new ixg();
        }
        kog1.a(responseHeader);
          goto _L11
_L4:
        if (b == null)
        {
            b = new irb();
        }
        kog1.a(b);
          goto _L11
_L5:
        int i1 = kou.b(kog1, 26);
        iur aiur[];
        int j;
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.length;
        }
        aiur = new iur[i1 + j];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(c, 0, aiur, 0, j);
            i1 = j;
        }
        for (; i1 < aiur.length - 1; i1++)
        {
            aiur[i1] = new iur();
            kog1.a(aiur[i1]);
            kog1.a();
        }

        aiur[i1] = new iur();
        kog1.a(aiur[i1]);
        c = aiur;
          goto _L11
_L6:
        e = Long.valueOf(kog1.d());
          goto _L11
_L7:
        f = kog1.j();
          goto _L11
_L8:
        int j1 = kou.b(kog1, 50);
        byte abyte0[][];
        int k;
        if (g == null)
        {
            k = 0;
        } else
        {
            k = g.length;
        }
        abyte0 = new byte[j1 + k][];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(g, 0, abyte0, 0, k);
            j1 = k;
        }
        for (; j1 < abyte0.length - 1; j1++)
        {
            abyte0[j1] = kog1.k();
            kog1.a();
        }

        abyte0[j1] = kog1.k();
        g = abyte0;
          goto _L11
_L9:
        d = Boolean.valueOf(kog1.i());
          goto _L11
_L10:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(l);
            break;
        }
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                iur iur1 = c[i];
                if (iur1 != null)
                {
                    koh1.b(3, iur1);
                }
            }

        }
        if (e != null)
        {
            koh1.a(4, e.longValue());
        }
        if (f != null)
        {
            koh1.a(5, f);
        }
        if (g != null && g.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < g.length; j++)
            {
                byte abyte0[] = g[j];
                if (abyte0 != null)
                {
                    koh1.a(6, abyte0);
                }
            }

        }
        if (d != null)
        {
            koh1.a(7, d.booleanValue());
        }
        if (a != null)
        {
            koh1.a(8, a.intValue());
        }
        super.writeTo(koh1);
    }
}
