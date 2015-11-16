// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzz extends kwm
{

    public idi a[];
    public idi b[];
    public Integer c;
    public String d;
    public idy e;
    public ige f[];

    public hzz()
    {
        a = idi.a();
        b = idi.a();
        c = null;
        d = null;
        e = null;
        f = ige.a();
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
                    idi idi1 = a[j];
                    int l = i;
                    if (idi1 != null)
                    {
                        l = i + kwk.d(1, idi1);
                    }
                    j++;
                    i = l;
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
                    idi idi2 = b[j];
                    int i1 = i;
                    if (idi2 != null)
                    {
                        i1 = i + kwk.d(2, idi2);
                    }
                    j++;
                    i = i1;
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
        if (e != null)
        {
            j = i + kwk.d(4, e);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(5, d);
        }
        int j1 = i;
        if (f != null)
        {
            j1 = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    ige ige1 = f[k];
                    j1 = i;
                    if (ige1 != null)
                    {
                        j1 = i + kwk.d(6, ige1);
                    }
                    k++;
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
                int i1 = kwx.a(kwj1, 10);
                idi aidi[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aidi = new idi[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aidi, 0, j);
                    i1 = j;
                }
                for (; i1 < aidi.length - 1; i1++)
                {
                    aidi[i1] = new idi();
                    kwj1.a(aidi[i1]);
                    kwj1.a();
                }

                aidi[i1] = new idi();
                kwj1.a(aidi[i1]);
                a = aidi;
                break;

            case 18: // '\022'
                int j1 = kwx.a(kwj1, 18);
                idi aidi1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aidi1 = new idi[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aidi1, 0, k);
                    j1 = k;
                }
                for (; j1 < aidi1.length - 1; j1++)
                {
                    aidi1[j1] = new idi();
                    kwj1.a(aidi1[j1]);
                    kwj1.a();
                }

                aidi1[j1] = new idi();
                kwj1.a(aidi1[j1]);
                b = aidi1;
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new idy();
                }
                kwj1.a(e);
                break;

            case 42: // '*'
                d = kwj1.j();
                break;

            case 50: // '2'
                int k1 = kwx.a(kwj1, 50);
                ige aige[];
                int l;
                if (f == null)
                {
                    l = 0;
                } else
                {
                    l = f.length;
                }
                aige = new ige[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(f, 0, aige, 0, l);
                    k1 = l;
                }
                for (; k1 < aige.length - 1; k1++)
                {
                    aige[k1] = new ige();
                    kwj1.a(aige[k1]);
                    kwj1.a();
                }

                aige[k1] = new ige();
                kwj1.a(aige[k1]);
                f = aige;
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
                idi idi1 = a[i];
                if (idi1 != null)
                {
                    kwk1.b(1, idi1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                idi idi2 = b[j];
                if (idi2 != null)
                {
                    kwk1.b(2, idi2);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (e != null)
        {
            kwk1.b(4, e);
        }
        if (d != null)
        {
            kwk1.a(5, d);
        }
        if (f != null && f.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < f.length; k++)
            {
                ige ige1 = f[k];
                if (ige1 != null)
                {
                    kwk1.b(6, ige1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
