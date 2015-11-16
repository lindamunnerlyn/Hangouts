// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lir extends kwm
{

    public lkp a;
    public lio b[];
    public lis c[];

    public lir()
    {
        a = null;
        b = lio.a();
        c = lis.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.d(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (int k = 0; k < b.length;)
                {
                    lio lio1 = b[k];
                    int i1 = i;
                    if (lio1 != null)
                    {
                        i1 = i + kwk.d(2, lio1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (c != null)
        {
            j1 = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    lis lis1 = c[l];
                    j1 = i;
                    if (lis1 != null)
                    {
                        j1 = i + kwk.d(3, lis1);
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
                if (a == null)
                {
                    a = new lkp();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                lio alio[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alio = new lio[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alio, 0, j);
                    l = j;
                }
                for (; l < alio.length - 1; l++)
                {
                    alio[l] = new lio();
                    kwj1.a(alio[l]);
                    kwj1.a();
                }

                alio[l] = new lio();
                kwj1.a(alio[l]);
                b = alio;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                lis alis[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                alis = new lis[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, alis, 0, k);
                    i1 = k;
                }
                for (; i1 < alis.length - 1; i1++)
                {
                    alis[i1] = new lis();
                    kwj1.a(alis[i1]);
                    kwj1.a();
                }

                alis[i1] = new lis();
                kwj1.a(alis[i1]);
                c = alis;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lio lio1 = b[i];
                if (lio1 != null)
                {
                    kwk1.b(2, lio1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                lis lis1 = c[j];
                if (lis1 != null)
                {
                    kwk1.b(3, lis1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
