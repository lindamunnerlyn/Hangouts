// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iir extends kwm
{

    public iis a[];
    public iim b[];
    public iix c[];
    public iio d;

    public iir()
    {
        a = iis.a();
        b = iim.a();
        c = iix.a();
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
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    iis iis1 = a[j];
                    int k = i;
                    if (iis1 != null)
                    {
                        k = i + kwk.d(1, iis1);
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
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (j = 0; j < b.length;)
                {
                    iim iim1 = b[j];
                    int l = i;
                    if (iim1 != null)
                    {
                        l = i + kwk.d(2, iim1);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= c.length)
                    {
                        break;
                    }
                    iix iix1 = c[i1];
                    j = i;
                    if (iix1 != null)
                    {
                        j = i + kwk.d(3, iix1);
                    }
                    i1++;
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
                int i1 = kwx.a(kwj1, 10);
                iis aiis[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiis = new iis[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiis, 0, j);
                    i1 = j;
                }
                for (; i1 < aiis.length - 1; i1++)
                {
                    aiis[i1] = new iis();
                    kwj1.a(aiis[i1]);
                    kwj1.a();
                }

                aiis[i1] = new iis();
                kwj1.a(aiis[i1]);
                a = aiis;
                break;

            case 18: // '\022'
                int j1 = kwx.a(kwj1, 18);
                iim aiim[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aiim = new iim[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aiim, 0, k);
                    j1 = k;
                }
                for (; j1 < aiim.length - 1; j1++)
                {
                    aiim[j1] = new iim();
                    kwj1.a(aiim[j1]);
                    kwj1.a();
                }

                aiim[j1] = new iim();
                kwj1.a(aiim[j1]);
                b = aiim;
                break;

            case 26: // '\032'
                int k1 = kwx.a(kwj1, 26);
                iix aiix[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aiix = new iix[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aiix, 0, l);
                    k1 = l;
                }
                for (; k1 < aiix.length - 1; k1++)
                {
                    aiix[k1] = new iix();
                    kwj1.a(aiix[k1]);
                    kwj1.a();
                }

                aiix[k1] = new iix();
                kwj1.a(aiix[k1]);
                c = aiix;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new iio();
                }
                kwj1.a(d);
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
                iis iis1 = a[i];
                if (iis1 != null)
                {
                    kwk1.b(1, iis1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                iim iim1 = b[j];
                if (iim1 != null)
                {
                    kwk1.b(2, iim1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                iix iix1 = c[k];
                if (iix1 != null)
                {
                    kwk1.b(3, iix1);
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
