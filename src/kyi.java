// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyi extends koj
{

    public kye a;
    public kyq b[];

    public kyi()
    {
        a = null;
        b = kyq.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kyq kyq1 = b[j];
                    int k = i;
                    if (kyq1 != null)
                    {
                        k = i + koh.d(2, kyq1);
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
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new kye();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                kyq akyq[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akyq = new kyq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akyq, 0, j);
                    k = j;
                }
                for (; k < akyq.length - 1; k++)
                {
                    akyq[k] = new kyq();
                    kog1.a(akyq[k]);
                    kog1.a();
                }

                akyq[k] = new kyq();
                kog1.a(akyq[k]);
                b = akyq;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kyq kyq1 = b[i];
                if (kyq1 != null)
                {
                    koh1.b(2, kyq1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
