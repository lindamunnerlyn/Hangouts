// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iam extends kwm
{

    public icf a[];
    public icd b[];
    public icc c[];
    public ice d[];

    public iam()
    {
        a = icf.a();
        b = icd.a();
        c = icc.a();
        d = ice.a();
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
                    icf icf1 = a[j];
                    int i1 = i;
                    if (icf1 != null)
                    {
                        i1 = i + kwk.d(1, icf1);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    icd icd1 = b[j];
                    int j1 = i;
                    if (icd1 != null)
                    {
                        j1 = i + kwk.d(2, icd1);
                    }
                    j++;
                    i = j1;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (int k = 0; k < c.length;)
                {
                    icc icc1 = c[k];
                    int k1 = i;
                    if (icc1 != null)
                    {
                        k1 = i + kwk.d(3, icc1);
                    }
                    k++;
                    i = k1;
                }

            }
        }
        int l1 = i;
        if (d != null)
        {
            l1 = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    l1 = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    ice ice1 = d[l];
                    l1 = i;
                    if (ice1 != null)
                    {
                        l1 = i + kwk.d(4, ice1);
                    }
                    l++;
                    i = l1;
                } while (true);
            }
        }
        return l1;
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
                int j1 = kwx.a(kwj1, 10);
                icf aicf[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aicf = new icf[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aicf, 0, j);
                    j1 = j;
                }
                for (; j1 < aicf.length - 1; j1++)
                {
                    aicf[j1] = new icf();
                    kwj1.a(aicf[j1]);
                    kwj1.a();
                }

                aicf[j1] = new icf();
                kwj1.a(aicf[j1]);
                a = aicf;
                break;

            case 18: // '\022'
                int k1 = kwx.a(kwj1, 18);
                icd aicd[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aicd = new icd[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aicd, 0, k);
                    k1 = k;
                }
                for (; k1 < aicd.length - 1; k1++)
                {
                    aicd[k1] = new icd();
                    kwj1.a(aicd[k1]);
                    kwj1.a();
                }

                aicd[k1] = new icd();
                kwj1.a(aicd[k1]);
                b = aicd;
                break;

            case 26: // '\032'
                int l1 = kwx.a(kwj1, 26);
                icc aicc[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aicc = new icc[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aicc, 0, l);
                    l1 = l;
                }
                for (; l1 < aicc.length - 1; l1++)
                {
                    aicc[l1] = new icc();
                    kwj1.a(aicc[l1]);
                    kwj1.a();
                }

                aicc[l1] = new icc();
                kwj1.a(aicc[l1]);
                c = aicc;
                break;

            case 34: // '"'
                int i2 = kwx.a(kwj1, 34);
                ice aice[];
                int i1;
                if (d == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = d.length;
                }
                aice = new ice[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(d, 0, aice, 0, i1);
                    i2 = i1;
                }
                for (; i2 < aice.length - 1; i2++)
                {
                    aice[i2] = new ice();
                    kwj1.a(aice[i2]);
                    kwj1.a();
                }

                aice[i2] = new ice();
                kwj1.a(aice[i2]);
                d = aice;
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
                icf icf1 = a[i];
                if (icf1 != null)
                {
                    kwk1.b(1, icf1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                icd icd1 = b[j];
                if (icd1 != null)
                {
                    kwk1.b(2, icd1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = 0; k < c.length; k++)
            {
                icc icc1 = c[k];
                if (icc1 != null)
                {
                    kwk1.b(3, icc1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < d.length; l++)
            {
                ice ice1 = d[l];
                if (ice1 != null)
                {
                    kwk1.b(4, ice1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
