// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixu extends koj
{

    public iqq a[];
    public ixg responseHeader;

    public ixu()
    {
        responseHeader = null;
        a = iqq.a();
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
                    iqq iqq1 = a[k];
                    j = i;
                    if (iqq1 != null)
                    {
                        j = i + koh.d(1, iqq1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(2, responseHeader);
        }
        return i;
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
                int k = kou.b(kog1, 10);
                iqq aiqq[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiqq = new iqq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiqq, 0, j);
                    k = j;
                }
                for (; k < aiqq.length - 1; k++)
                {
                    aiqq[k] = new iqq();
                    kog1.a(aiqq[k]);
                    kog1.a();
                }

                aiqq[k] = new iqq();
                kog1.a(aiqq[k]);
                a = aiqq;
                break;

            case 18: // '\022'
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iqq iqq1 = a[i];
                if (iqq1 != null)
                {
                    koh1.b(1, iqq1);
                }
            }

        }
        if (responseHeader != null)
        {
            koh1.b(2, responseHeader);
        }
        super.writeTo(koh1);
    }
}
