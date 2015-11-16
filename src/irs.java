// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class irs extends koj
{

    public irt a[];
    public ixf requestHeader;

    public irs()
    {
        requestHeader = null;
        a = irt.a();
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
                    irt irt1 = a[j];
                    int k = i;
                    if (irt1 != null)
                    {
                        k = i + koh.d(2, irt1);
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
                irt airt[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                airt = new irt[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, airt, 0, j);
                    k = j;
                }
                for (; k < airt.length - 1; k++)
                {
                    airt[k] = new irt();
                    kog1.a(airt[k]);
                    kog1.a();
                }

                airt[k] = new irt();
                kog1.a(airt[k]);
                a = airt;
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
                irt irt1 = a[i];
                if (irt1 != null)
                {
                    koh1.b(2, irt1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
