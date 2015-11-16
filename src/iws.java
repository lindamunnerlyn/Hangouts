// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iws extends koj
{

    public iqg a[];
    public iuh b[];
    public Long c;
    public ixf requestHeader;

    public iws()
    {
        requestHeader = null;
        a = iqg.a();
        b = iuh.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (requestHeader != null)
        {
            j = i + koh.d(1, requestHeader);
        }
        i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    iqg iqg1 = a[j];
                    int k = i;
                    if (iqg1 != null)
                    {
                        k = i + koh.d(2, iqg1);
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
                    iuh iuh1 = b[l];
                    j = i;
                    if (iuh1 != null)
                    {
                        j = i + koh.d(3, iuh1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(4, c.longValue());
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
                int l = kou.b(kog1, 18);
                iqg aiqg[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiqg = new iqg[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiqg, 0, j);
                    l = j;
                }
                for (; l < aiqg.length - 1; l++)
                {
                    aiqg[l] = new iqg();
                    kog1.a(aiqg[l]);
                    kog1.a();
                }

                aiqg[l] = new iqg();
                kog1.a(aiqg[l]);
                a = aiqg;
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                iuh aiuh[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aiuh = new iuh[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aiuh, 0, k);
                    i1 = k;
                }
                for (; i1 < aiuh.length - 1; i1++)
                {
                    aiuh[i1] = new iuh();
                    kog1.a(aiuh[i1]);
                    kog1.a();
                }

                aiuh[i1] = new iuh();
                kog1.a(aiuh[i1]);
                b = aiuh;
                break;

            case 32: // ' '
                c = Long.valueOf(kog1.d());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iqg iqg1 = a[i];
                if (iqg1 != null)
                {
                    koh1.b(2, iqg1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                iuh iuh1 = b[j];
                if (iuh1 != null)
                {
                    koh1.b(3, iuh1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(4, c.longValue());
        }
        super.writeTo(koh1);
    }
}
