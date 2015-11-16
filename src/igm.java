// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igm extends koj
{

    public int a;
    public igo b[];

    public igm()
    {
        a = 0x80000000;
        b = igo.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + koh.e(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    igo igo1 = b[j];
                    int k = i;
                    if (igo1 != null)
                    {
                        k = i + koh.d(2, igo1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L5:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   18: 95;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = kou.b(kog1, 18);
        igo aigo[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aigo = new igo[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aigo, 0, k);
            l = k;
        }
        for (; l < aigo.length - 1; l++)
        {
            aigo[l] = new igo();
            kog1.a(aigo[l]);
            kog1.a();
        }

        aigo[l] = new igo();
        kog1.a(aigo[l]);
        b = aigo;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(koh koh1)
    {
        if (a != 0x80000000)
        {
            koh1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                igo igo1 = b[i];
                if (igo1 != null)
                {
                    koh1.b(2, igo1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
