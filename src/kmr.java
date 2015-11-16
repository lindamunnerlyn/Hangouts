// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kmr extends kwm
{

    public String a;
    public kmc b[];
    public khn c[];
    public kjw d[];
    public kmo e[];

    public kmr()
    {
        a = null;
        b = kmc.a();
        c = khn.a();
        d = kjw.a();
        e = kmo.a();
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kmc kmc1 = b[j];
                    int j1 = i;
                    if (kmc1 != null)
                    {
                        j1 = i + kwk.d(2, kmc1);
                    }
                    j++;
                    i = j1;
                }

                j = i;
            }
        }
        int k1 = j;
        if (c != null)
        {
            k1 = j;
            if (c.length > 0)
            {
                i = j;
                for (int k = 0; k < c.length;)
                {
                    khn khn1 = c[k];
                    k1 = i;
                    if (khn1 != null)
                    {
                        k1 = i + kwk.d(3, khn1);
                    }
                    k++;
                    i = k1;
                }

                k1 = i;
            }
        }
        i = k1;
        if (d != null)
        {
            i = k1;
            if (d.length > 0)
            {
                i = k1;
                for (int l = 0; l < d.length;)
                {
                    kjw kjw1 = d[l];
                    k1 = i;
                    if (kjw1 != null)
                    {
                        k1 = i + kwk.d(4, kjw1);
                    }
                    l++;
                    i = k1;
                }

            }
        }
        k1 = i;
        if (e != null)
        {
            k1 = i;
            if (e.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (i1 >= e.length)
                    {
                        break;
                    }
                    kmo kmo1 = e[i1];
                    k1 = i;
                    if (kmo1 != null)
                    {
                        k1 = i + kwk.d(5, kmo1);
                    }
                    i1++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                int j1 = kwx.a(kwj1, 18);
                kmc akmc[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akmc = new kmc[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akmc, 0, j);
                    j1 = j;
                }
                for (; j1 < akmc.length - 1; j1++)
                {
                    akmc[j1] = new kmc();
                    kwj1.a(akmc[j1]);
                    kwj1.a();
                }

                akmc[j1] = new kmc();
                kwj1.a(akmc[j1]);
                b = akmc;
                break;

            case 26: // '\032'
                int k1 = kwx.a(kwj1, 26);
                khn akhn[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                akhn = new khn[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, akhn, 0, k);
                    k1 = k;
                }
                for (; k1 < akhn.length - 1; k1++)
                {
                    akhn[k1] = new khn();
                    kwj1.a(akhn[k1]);
                    kwj1.a();
                }

                akhn[k1] = new khn();
                kwj1.a(akhn[k1]);
                c = akhn;
                break;

            case 34: // '"'
                int l1 = kwx.a(kwj1, 34);
                kjw akjw[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                akjw = new kjw[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, akjw, 0, l);
                    l1 = l;
                }
                for (; l1 < akjw.length - 1; l1++)
                {
                    akjw[l1] = new kjw();
                    kwj1.a(akjw[l1]);
                    kwj1.a();
                }

                akjw[l1] = new kjw();
                kwj1.a(akjw[l1]);
                d = akjw;
                break;

            case 42: // '*'
                int i2 = kwx.a(kwj1, 42);
                kmo akmo[];
                int i1;
                if (e == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = e.length;
                }
                akmo = new kmo[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(e, 0, akmo, 0, i1);
                    i2 = i1;
                }
                for (; i2 < akmo.length - 1; i2++)
                {
                    akmo[i2] = new kmo();
                    kwj1.a(akmo[i2]);
                    kwj1.a();
                }

                akmo[i2] = new kmo();
                kwj1.a(akmo[i2]);
                e = akmo;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kmc kmc1 = b[i];
                if (kmc1 != null)
                {
                    kwk1.b(2, kmc1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                khn khn1 = c[j];
                if (khn1 != null)
                {
                    kwk1.b(3, khn1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = 0; k < d.length; k++)
            {
                kjw kjw1 = d[k];
                if (kjw1 != null)
                {
                    kwk1.b(4, kjw1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < e.length; l++)
            {
                kmo kmo1 = e[l];
                if (kmo1 != null)
                {
                    kwk1.b(5, kmo1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
