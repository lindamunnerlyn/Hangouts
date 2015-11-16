// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzm extends koj
{

    public kyp a[];
    public Integer b;
    public Integer c;

    public kzm()
    {
        a = kyp.a();
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    kyp kyp1 = a[k];
                    j = i;
                    if (kyp1 != null)
                    {
                        j = i + koh.d(1, kyp1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i + koh.e(3, c.intValue());
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L6:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   16: 183
    //                   24: 226;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int i1 = kou.b(kog1, 10);
        kyp akyp[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        akyp = new kyp[i1 + j];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, akyp, 0, j);
            i1 = j;
        }
        for (; i1 < akyp.length - 1; i1++)
        {
            akyp[i1] = new kyp();
            kog1.a(akyp[i1]);
            kog1.a();
        }

        akyp[i1] = new kyp();
        kog1.a(akyp[i1]);
        a = akyp;
          goto _L6
_L4:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            b = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
            c = Integer.valueOf(l);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                kyp kyp1 = a[i];
                if (kyp1 != null)
                {
                    koh1.b(1, kyp1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(2, b.intValue());
        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        super.writeTo(koh1);
    }
}
