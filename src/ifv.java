// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ifv extends koj
{

    public Integer a;
    public ifw b[];

    public ifv()
    {
        a = null;
        b = ifw.a();
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
                    ifw ifw1 = b[j];
                    int k = i;
                    if (ifw1 != null)
                    {
                        k = i + koh.d(2, ifw1);
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
    //                   18: 98;
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
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = kou.b(kog1, 18);
        ifw aifw[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aifw = new ifw[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aifw, 0, k);
            l = k;
        }
        for (; l < aifw.length - 1; l++)
        {
            aifw[l] = new ifw();
            kog1.a(aifw[l]);
            kog1.a();
        }

        aifw[l] = new ifw();
        kog1.a(aifw[l]);
        b = aifw;
        if (true) goto _L5; else goto _L6
_L6:
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
                ifw ifw1 = b[i];
                if (ifw1 != null)
                {
                    koh1.b(2, ifw1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
