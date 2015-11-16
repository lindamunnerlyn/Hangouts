// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class irl extends koj
{

    public irg a;
    public ius b[];
    public Integer c;
    public String d;
    public byte e[][];

    public irl()
    {
        a = null;
        b = ius.a();
        c = null;
        d = null;
        e = kou.g;
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
            j = i + koh.d(1, a);
        }
        i = j;
        if (e != null)
        {
            i = j;
            if (e.length > 0)
            {
                i = 0;
                int k = 0;
                int i1;
                int j1;
                for (i1 = 0; i < e.length; i1 = j1)
                {
                    byte abyte0[] = e[i];
                    int k1 = k;
                    j1 = i1;
                    if (abyte0 != null)
                    {
                        j1 = i1 + 1;
                        k1 = k + koh.a(abyte0);
                    }
                    i++;
                    k = k1;
                }

                i = j + k + i1 * 1;
            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    ius ius1 = b[l];
                    j = i;
                    if (ius1 != null)
                    {
                        j = i + koh.d(3, ius1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(4, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(5, d);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L8:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   18: 104
    //                   26: 206
    //                   32: 330
    //                   42: 378;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new irg();
        }
        kog1.a(a);
          goto _L8
_L4:
        int i1 = kou.b(kog1, 18);
        byte abyte0[][];
        int j;
        if (e == null)
        {
            j = 0;
        } else
        {
            j = e.length;
        }
        abyte0 = new byte[i1 + j][];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(e, 0, abyte0, 0, j);
            i1 = j;
        }
        for (; i1 < abyte0.length - 1; i1++)
        {
            abyte0[i1] = kog1.k();
            kog1.a();
        }

        abyte0[i1] = kog1.k();
        e = abyte0;
          goto _L8
_L5:
        int j1 = kou.b(kog1, 26);
        ius aius[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aius = new ius[j1 + k];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aius, 0, k);
            j1 = k;
        }
        for (; j1 < aius.length - 1; j1++)
        {
            aius[j1] = new ius();
            kog1.a(aius[j1]);
            kog1.a();
        }

        aius[j1] = new ius();
        kog1.a(aius[j1]);
        b = aius;
          goto _L8
_L6:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        d = kog1.j();
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                byte abyte0[] = e[i];
                if (abyte0 != null)
                {
                    koh1.a(2, abyte0);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                ius ius1 = b[j];
                if (ius1 != null)
                {
                    koh1.b(3, ius1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(4, c.intValue());
        }
        if (d != null)
        {
            koh1.a(5, d);
        }
        super.writeTo(koh1);
    }
}
