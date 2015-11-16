// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivl extends koj
{

    public Integer a;
    public ivz b[];
    public Integer c;
    public byte d[][];

    public ivl()
    {
        a = null;
        b = ivz.a();
        c = null;
        d = kou.g;
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
            j = i + koh.e(1, a.intValue());
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = 0;
                int k = 0;
                int i1;
                int j1;
                for (i1 = 0; i < d.length; i1 = j1)
                {
                    byte abyte0[] = d[i];
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
                    ivz ivz1 = b[l];
                    j = i;
                    if (ivz1 != null)
                    {
                        j = i + koh.d(3, ivz1);
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
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L7:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   18: 110
    //                   26: 212
    //                   32: 336;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = kou.b(kog1, 18);
        byte abyte0[][];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        abyte0 = new byte[j1 + k][];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, abyte0, 0, k);
            j1 = k;
        }
        for (; j1 < abyte0.length - 1; j1++)
        {
            abyte0[j1] = kog1.k();
            kog1.a();
        }

        abyte0[j1] = kog1.k();
        d = abyte0;
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = kou.b(kog1, 26);
        ivz aivz[];
        int l;
        if (b == null)
        {
            l = 0;
        } else
        {
            l = b.length;
        }
        aivz = new ivz[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(b, 0, aivz, 0, l);
            k1 = l;
        }
        for (; k1 < aivz.length - 1; k1++)
        {
            aivz[k1] = new ivz();
            kog1.a(aivz[k1]);
            kog1.a();
        }

        aivz[k1] = new ivz();
        kog1.a(aivz[k1]);
        b = aivz;
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = kog1.f();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(i1);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                byte abyte0[] = d[i];
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
                ivz ivz1 = b[j];
                if (ivz1 != null)
                {
                    koh1.b(3, ivz1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(4, c.intValue());
        }
        super.writeTo(koh1);
    }
}
