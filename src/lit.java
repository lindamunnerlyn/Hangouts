// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lit extends kwm
{

    public lkp a;
    public lio b[];
    public lhc c[];
    public lhc d;

    public lit()
    {
        a = null;
        b = lio.a();
        c = lhc.a();
        d = null;
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
                for (j = 0; j < b.length;)
                {
                    lio lio1 = b[j];
                    int k = i;
                    if (lio1 != null)
                    {
                        k = i + kwk.d(2, lio1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    lhc lhc1 = c[l];
                    j = i;
                    if (lhc1 != null)
                    {
                        j = i + kwk.d(3, lhc1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(4, d);
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
                lhc alhc[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                alhc = new lhc[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, alhc, 0, k);
                    i1 = k;
                }
                for (; i1 < alhc.length - 1; i1++)
                {
                    alhc[i1] = new lhc();
                    kwj1.a(alhc[i1]);
                    kwj1.a();
                }

                alhc[i1] = new lhc();
                kwj1.a(alhc[i1]);
                c = alhc;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new lhc();
                }
                kwj1.a(d);
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
                lhc lhc1 = c[j];
                if (lhc1 != null)
                {
                    kwk1.b(3, lhc1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        super.writeTo(kwk1);
    }
}
