// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iwb extends koj
{

    public iwa a[];
    public iqq b[];
    public Integer c;

    public iwb()
    {
        a = iwa.a();
        b = iqq.a();
        c = null;
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
                    iwa iwa1 = a[j];
                    int k = i;
                    if (iwa1 != null)
                    {
                        k = i + koh.d(1, iwa1);
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
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    iqq iqq1 = b[l];
                    j = i;
                    if (iqq1 != null)
                    {
                        j = i + koh.d(2, iqq1);
                    }
                    l++;
                    i = j;
                } while (true);
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
    //                   10: 59
    //                   18: 183
    //                   24: 307;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int i1 = kou.b(kog1, 10);
        iwa aiwa[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        aiwa = new iwa[i1 + j];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, aiwa, 0, j);
            i1 = j;
        }
        for (; i1 < aiwa.length - 1; i1++)
        {
            aiwa[i1] = new iwa();
            kog1.a(aiwa[i1]);
            kog1.a();
        }

        aiwa[i1] = new iwa();
        kog1.a(aiwa[i1]);
        a = aiwa;
          goto _L6
_L4:
        int j1 = kou.b(kog1, 18);
        iqq aiqq[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        aiqq = new iqq[j1 + k];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, aiqq, 0, k);
            j1 = k;
        }
        for (; j1 < aiqq.length - 1; j1++)
        {
            aiqq[j1] = new iqq();
            kog1.a(aiqq[j1]);
            kog1.a();
        }

        aiqq[j1] = new iqq();
        kog1.a(aiqq[j1]);
        b = aiqq;
          goto _L6
_L5:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = Integer.valueOf(l);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iwa iwa1 = a[i];
                if (iwa1 != null)
                {
                    koh1.b(1, iwa1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                iqq iqq1 = b[j];
                if (iqq1 != null)
                {
                    koh1.b(2, iqq1);
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
