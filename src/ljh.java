// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljh extends kwm
{

    public ljg a[];
    public ljg b[];
    public String c;

    public ljh()
    {
        a = ljg.a();
        b = ljg.a();
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
                    ljg ljg1 = a[j];
                    int k = i;
                    if (ljg1 != null)
                    {
                        k = i + kwk.d(1, ljg1);
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
                    ljg ljg2 = b[l];
                    j = i;
                    if (ljg2 != null)
                    {
                        j = i + kwk.d(2, ljg2);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(3, c);
        }
        return i;
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
                ljg aljg[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aljg = new ljg[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aljg, 0, j);
                    l = j;
                }
                for (; l < aljg.length - 1; l++)
                {
                    aljg[l] = new ljg();
                    kwj1.a(aljg[l]);
                    kwj1.a();
                }

                aljg[l] = new ljg();
                kwj1.a(aljg[l]);
                a = aljg;
                break;

            case 18: // '\022'
                int i1 = kwx.a(kwj1, 18);
                ljg aljg1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aljg1 = new ljg[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aljg1, 0, k);
                    i1 = k;
                }
                for (; i1 < aljg1.length - 1; i1++)
                {
                    aljg1[i1] = new ljg();
                    kwj1.a(aljg1[i1]);
                    kwj1.a();
                }

                aljg1[i1] = new ljg();
                kwj1.a(aljg1[i1]);
                b = aljg1;
                break;

            case 26: // '\032'
                c = kwj1.j();
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
                ljg ljg1 = a[i];
                if (ljg1 != null)
                {
                    kwk1.b(1, ljg1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                ljg ljg2 = b[j];
                if (ljg2 != null)
                {
                    kwk1.b(2, ljg2);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        super.writeTo(kwk1);
    }
}
