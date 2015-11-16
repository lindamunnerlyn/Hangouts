// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kzi extends koj
{

    public Integer a;
    public kzh b[];
    public Integer c;

    public kzi()
    {
        a = null;
        b = kzh.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kzh kzh1 = b[j];
                    int k = i;
                    if (kzh1 != null)
                    {
                        k = i + koh.d(2, kzh1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(3, c.intValue());
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L6:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 102
    //                   24: 226;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
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
        int i1 = kou.b(kog1, 18);
        kzh akzh[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        akzh = new kzh[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, akzh, 0, k);
            i1 = k;
        }
        for (; i1 < akzh.length - 1; i1++)
        {
            akzh[i1] = new kzh();
            kog1.a(akzh[i1]);
            kog1.a();
        }

        akzh[i1] = new kzh();
        kog1.a(akzh[i1]);
        b = akzh;
        continue; /* Loop/switch isn't completed */
_L5:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            c = Integer.valueOf(l);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kzh kzh1 = b[i];
                if (kzh1 != null)
                {
                    koh1.b(2, kzh1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        super.writeTo(koh1);
    }
}
