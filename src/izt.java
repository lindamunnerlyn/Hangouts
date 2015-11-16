// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izt extends koj
{

    public izs a[];
    public ixf requestHeader;

    public izt()
    {
        requestHeader = null;
        a = izs.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + koh.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    izs izs1 = a[j];
                    int k = i;
                    if (izs1 != null)
                    {
                        k = i + koh.d(2, izs1);
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
                if (requestHeader == null)
                {
                    requestHeader = new ixf();
                }
                kog1.a(requestHeader);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                izs aizs[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aizs = new izs[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aizs, 0, j);
                    k = j;
                }
                for (; k < aizs.length - 1; k++)
                {
                    aizs[k] = new izs();
                    kog1.a(aizs[k]);
                    kog1.a();
                }

                aizs[k] = new izs();
                kog1.a(aizs[k]);
                a = aizs;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                izs izs1 = a[i];
                if (izs1 != null)
                {
                    koh1.b(2, izs1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
