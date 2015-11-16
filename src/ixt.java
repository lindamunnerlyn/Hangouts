// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixt extends koj
{

    public iqo a[];
    public ixf requestHeader;

    public ixt()
    {
        requestHeader = null;
        a = iqo.a();
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
                    iqo iqo1 = a[j];
                    int k = i;
                    if (iqo1 != null)
                    {
                        k = i + koh.d(2, iqo1);
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
                iqo aiqo[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiqo = new iqo[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiqo, 0, j);
                    k = j;
                }
                for (; k < aiqo.length - 1; k++)
                {
                    aiqo[k] = new iqo();
                    kog1.a(aiqo[k]);
                    kog1.a();
                }

                aiqo[k] = new iqo();
                kog1.a(aiqo[k]);
                a = aiqo;
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
                iqo iqo1 = a[i];
                if (iqo1 != null)
                {
                    koh1.b(2, iqo1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
