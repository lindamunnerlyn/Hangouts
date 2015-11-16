// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izm extends koj
{

    public itl a[];
    public byte b[];
    public ixf requestHeader;

    public izm()
    {
        requestHeader = null;
        a = itl.a();
        b = null;
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
                    itl itl1 = a[j];
                    int k = i;
                    if (itl1 != null)
                    {
                        k = i + koh.d(2, itl1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(3, b);
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
                if (requestHeader == null)
                {
                    requestHeader = new ixf();
                }
                kog1.a(requestHeader);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                itl aitl[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aitl = new itl[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aitl, 0, j);
                    k = j;
                }
                for (; k < aitl.length - 1; k++)
                {
                    aitl[k] = new itl();
                    kog1.a(aitl[k]);
                    kog1.a();
                }

                aitl[k] = new itl();
                kog1.a(aitl[k]);
                a = aitl;
                break;

            case 26: // '\032'
                b = kog1.k();
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
                itl itl1 = a[i];
                if (itl1 != null)
                {
                    koh1.b(2, itl1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(3, b);
        }
        super.writeTo(koh1);
    }
}
