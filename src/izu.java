// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izu extends koj
{

    public izr a[];
    public ixg responseHeader;

    public izu()
    {
        responseHeader = null;
        a = izr.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    izr izr1 = a[j];
                    int k = i;
                    if (izr1 != null)
                    {
                        k = i + koh.d(2, izr1);
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
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                izr aizr[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aizr = new izr[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aizr, 0, j);
                    k = j;
                }
                for (; k < aizr.length - 1; k++)
                {
                    aizr[k] = new izr();
                    kog1.a(aizr[k]);
                    kog1.a();
                }

                aizr[k] = new izr();
                kog1.a(aizr[k]);
                a = aizr;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                izr izr1 = a[i];
                if (izr1 != null)
                {
                    koh1.b(2, izr1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
