// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhr extends kwm
{

    public lhq a[];
    public lhq b[];

    public lhr()
    {
        a = lhq.a();
        b = lhq.a();
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
                for (int k = 0; k < a.length;)
                {
                    lhq lhq1 = a[k];
                    int i1 = i;
                    if (lhq1 != null)
                    {
                        i1 = i + kwk.d(1, lhq1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (b != null)
        {
            j1 = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    lhq lhq2 = b[l];
                    j1 = i;
                    if (lhq2 != null)
                    {
                        j1 = i + kwk.d(2, lhq2);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int l = kwx.a(kwj1, 10);
                lhq alhq[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alhq = new lhq[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alhq, 0, j);
                    l = j;
                }
                for (; l < alhq.length - 1; l++)
                {
                    alhq[l] = new lhq();
                    kwj1.a(alhq[l]);
                    kwj1.a();
                }

                alhq[l] = new lhq();
                kwj1.a(alhq[l]);
                a = alhq;
                break;

            case 18: // '\022'
                int i1 = kwx.a(kwj1, 18);
                lhq alhq1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                alhq1 = new lhq[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, alhq1, 0, k);
                    i1 = k;
                }
                for (; i1 < alhq1.length - 1; i1++)
                {
                    alhq1[i1] = new lhq();
                    kwj1.a(alhq1[i1]);
                    kwj1.a();
                }

                alhq1[i1] = new lhq();
                kwj1.a(alhq1[i1]);
                b = alhq1;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                lhq lhq1 = a[i];
                if (lhq1 != null)
                {
                    kwk1.b(1, lhq1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                lhq lhq2 = b[j];
                if (lhq2 != null)
                {
                    kwk1.b(2, lhq2);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
