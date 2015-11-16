// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iic extends kwm
{

    public iid a[];
    public igr b[];
    public iik c[];
    public igy d;

    public iic()
    {
        a = iid.a();
        b = igr.a();
        c = iik.a();
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
                    iid iid1 = a[j];
                    int k = i;
                    if (iid1 != null)
                    {
                        k = i + kwk.d(1, iid1);
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
                    igr igr1 = b[j];
                    int l = i;
                    if (igr1 != null)
                    {
                        l = i + kwk.d(2, igr1);
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
                    iik iik1 = c[i1];
                    j = i;
                    if (iik1 != null)
                    {
                        j = i + kwk.d(3, iik1);
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
                iid aiid[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiid = new iid[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiid, 0, j);
                    i1 = j;
                }
                for (; i1 < aiid.length - 1; i1++)
                {
                    aiid[i1] = new iid();
                    kwj1.a(aiid[i1]);
                    kwj1.a();
                }

                aiid[i1] = new iid();
                kwj1.a(aiid[i1]);
                a = aiid;
                break;

            case 18: // '\022'
                int j1 = kwx.a(kwj1, 18);
                igr aigr[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aigr = new igr[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aigr, 0, k);
                    j1 = k;
                }
                for (; j1 < aigr.length - 1; j1++)
                {
                    aigr[j1] = new igr();
                    kwj1.a(aigr[j1]);
                    kwj1.a();
                }

                aigr[j1] = new igr();
                kwj1.a(aigr[j1]);
                b = aigr;
                break;

            case 26: // '\032'
                int k1 = kwx.a(kwj1, 26);
                iik aiik[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aiik = new iik[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aiik, 0, l);
                    k1 = l;
                }
                for (; k1 < aiik.length - 1; k1++)
                {
                    aiik[k1] = new iik();
                    kwj1.a(aiik[k1]);
                    kwj1.a();
                }

                aiik[k1] = new iik();
                kwj1.a(aiik[k1]);
                c = aiik;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new igy();
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
                iid iid1 = a[i];
                if (iid1 != null)
                {
                    kwk1.b(1, iid1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                igr igr1 = b[j];
                if (igr1 != null)
                {
                    kwk1.b(2, igr1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                iik iik1 = c[k];
                if (iik1 != null)
                {
                    kwk1.b(3, iik1);
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
