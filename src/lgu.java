// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lgu extends kwm
{

    public lgs a[];
    public lgs b[];
    public Integer c;
    public Integer d;
    public Integer e;
    public lgs f[];
    public lgv g[];
    public lgy h[];

    public lgu()
    {
        a = lgs.a();
        b = lgs.a();
        c = null;
        d = null;
        e = null;
        f = lgs.a();
        g = lgv.a();
        h = lgy.a();
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
                    lgs lgs1 = a[j];
                    int k = i;
                    if (lgs1 != null)
                    {
                        k = i + kwk.d(1, lgs1);
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
                for (j = 0; j < b.length;)
                {
                    lgs lgs2 = b[j];
                    int l = i;
                    if (lgs2 != null)
                    {
                        l = i + kwk.d(2, lgs2);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                for (j = 0; j < f.length;)
                {
                    lgs lgs3 = f[j];
                    int i1 = i;
                    if (lgs3 != null)
                    {
                        i1 = i + kwk.d(4, lgs3);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        int j1 = j;
        if (g != null)
        {
            j1 = j;
            if (g.length > 0)
            {
                i = j;
                for (j = 0; j < g.length;)
                {
                    lgv lgv1 = g[j];
                    j1 = i;
                    if (lgv1 != null)
                    {
                        j1 = i + kwk.d(5, lgv1);
                    }
                    j++;
                    i = j1;
                }

                j1 = i;
            }
        }
        i = j1;
        if (d != null)
        {
            i = j1 + kwk.e(6, d.intValue());
        }
        j = i;
        if (h != null)
        {
            j = i;
            if (h.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (k1 >= h.length)
                    {
                        break;
                    }
                    lgy lgy1 = h[k1];
                    j = i;
                    if (lgy1 != null)
                    {
                        j = i + kwk.d(7, lgy1);
                    }
                    k1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.e(8, e.intValue());
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
                int k1 = kwx.a(kwj1, 10);
                lgs algs[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                algs = new lgs[k1 + j];
                k1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, algs, 0, j);
                    k1 = j;
                }
                for (; k1 < algs.length - 1; k1++)
                {
                    algs[k1] = new lgs();
                    kwj1.a(algs[k1]);
                    kwj1.a();
                }

                algs[k1] = new lgs();
                kwj1.a(algs[k1]);
                a = algs;
                break;

            case 18: // '\022'
                int l1 = kwx.a(kwj1, 18);
                lgs algs1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                algs1 = new lgs[l1 + k];
                l1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, algs1, 0, k);
                    l1 = k;
                }
                for (; l1 < algs1.length - 1; l1++)
                {
                    algs1[l1] = new lgs();
                    kwj1.a(algs1[l1]);
                    kwj1.a();
                }

                algs1[l1] = new lgs();
                kwj1.a(algs1[l1]);
                b = algs1;
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 34: // '"'
                int i2 = kwx.a(kwj1, 34);
                lgs algs2[];
                int l;
                if (f == null)
                {
                    l = 0;
                } else
                {
                    l = f.length;
                }
                algs2 = new lgs[i2 + l];
                i2 = l;
                if (l != 0)
                {
                    System.arraycopy(f, 0, algs2, 0, l);
                    i2 = l;
                }
                for (; i2 < algs2.length - 1; i2++)
                {
                    algs2[i2] = new lgs();
                    kwj1.a(algs2[i2]);
                    kwj1.a();
                }

                algs2[i2] = new lgs();
                kwj1.a(algs2[i2]);
                f = algs2;
                break;

            case 42: // '*'
                int j2 = kwx.a(kwj1, 42);
                lgv algv[];
                int i1;
                if (g == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = g.length;
                }
                algv = new lgv[j2 + i1];
                j2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(g, 0, algv, 0, i1);
                    j2 = i1;
                }
                for (; j2 < algv.length - 1; j2++)
                {
                    algv[j2] = new lgv();
                    kwj1.a(algv[j2]);
                    kwj1.a();
                }

                algv[j2] = new lgv();
                kwj1.a(algv[j2]);
                g = algv;
                break;

            case 48: // '0'
                d = Integer.valueOf(kwj1.f());
                break;

            case 58: // ':'
                int k2 = kwx.a(kwj1, 58);
                lgy algy[];
                int j1;
                if (h == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = h.length;
                }
                algy = new lgy[k2 + j1];
                k2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(h, 0, algy, 0, j1);
                    k2 = j1;
                }
                for (; k2 < algy.length - 1; k2++)
                {
                    algy[k2] = new lgy();
                    kwj1.a(algy[k2]);
                    kwj1.a();
                }

                algy[k2] = new lgy();
                kwj1.a(algy[k2]);
                h = algy;
                break;

            case 64: // '@'
                e = Integer.valueOf(kwj1.f());
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
                lgs lgs1 = a[i];
                if (lgs1 != null)
                {
                    kwk1.b(1, lgs1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                lgs lgs2 = b[j];
                if (lgs2 != null)
                {
                    kwk1.b(2, lgs2);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (f != null && f.length > 0)
        {
            for (int k = 0; k < f.length; k++)
            {
                lgs lgs3 = f[k];
                if (lgs3 != null)
                {
                    kwk1.b(4, lgs3);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int l = 0; l < g.length; l++)
            {
                lgv lgv1 = g[l];
                if (lgv1 != null)
                {
                    kwk1.b(5, lgv1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(6, d.intValue());
        }
        if (h != null && h.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < h.length; i1++)
            {
                lgy lgy1 = h[i1];
                if (lgy1 != null)
                {
                    kwk1.b(7, lgy1);
                }
            }

        }
        if (e != null)
        {
            kwk1.a(8, e.intValue());
        }
        super.writeTo(kwk1);
    }
}
