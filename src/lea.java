// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lea extends kwm
{

    public String a;
    public String b;
    public String c;
    public lem d[];
    public lem e[];
    public String f;
    public leb g[];

    public lea()
    {
        a = null;
        b = null;
        c = null;
        d = lem.a();
        e = lem.a();
        f = null;
        g = leb.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize() + kwk.b(1, a) + kwk.b(2, b);
        int i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = j;
                for (j = 0; j < d.length;)
                {
                    lem lem1 = d[j];
                    int k = i;
                    if (lem1 != null)
                    {
                        k = i + kwk.d(3, lem1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (g != null)
        {
            j = i;
            if (g.length > 0)
            {
                for (j = 0; j < g.length;)
                {
                    leb leb1 = g[j];
                    int l = i;
                    if (leb1 != null)
                    {
                        l = i + kwk.d(4, leb1);
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
            i = j + kwk.b(5, c);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= e.length)
                    {
                        break;
                    }
                    lem lem2 = e[i1];
                    j = i;
                    if (lem2 != null)
                    {
                        j = i + kwk.d(7, lem2);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.b(8, f);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                lem alem[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                alem = new lem[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, alem, 0, j);
                    i1 = j;
                }
                for (; i1 < alem.length - 1; i1++)
                {
                    alem[i1] = new lem();
                    kwj1.a(alem[i1]);
                    kwj1.a();
                }

                alem[i1] = new lem();
                kwj1.a(alem[i1]);
                d = alem;
                break;

            case 34: // '"'
                int j1 = kwx.a(kwj1, 34);
                leb aleb[];
                int k;
                if (g == null)
                {
                    k = 0;
                } else
                {
                    k = g.length;
                }
                aleb = new leb[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(g, 0, aleb, 0, k);
                    j1 = k;
                }
                for (; j1 < aleb.length - 1; j1++)
                {
                    aleb[j1] = new leb();
                    kwj1.a(aleb[j1]);
                    kwj1.a();
                }

                aleb[j1] = new leb();
                kwj1.a(aleb[j1]);
                g = aleb;
                break;

            case 42: // '*'
                c = kwj1.j();
                break;

            case 58: // ':'
                int k1 = kwx.a(kwj1, 58);
                lem alem1[];
                int l;
                if (e == null)
                {
                    l = 0;
                } else
                {
                    l = e.length;
                }
                alem1 = new lem[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(e, 0, alem1, 0, l);
                    k1 = l;
                }
                for (; k1 < alem1.length - 1; k1++)
                {
                    alem1[k1] = new lem();
                    kwj1.a(alem1[k1]);
                    kwj1.a();
                }

                alem1[k1] = new lem();
                kwj1.a(alem1[k1]);
                e = alem1;
                break;

            case 66: // 'B'
                f = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        kwk1.a(1, a);
        kwk1.a(2, b);
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                lem lem1 = d[i];
                if (lem1 != null)
                {
                    kwk1.b(3, lem1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int j = 0; j < g.length; j++)
            {
                leb leb1 = g[j];
                if (leb1 != null)
                {
                    kwk1.b(4, leb1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(5, c);
        }
        if (e != null && e.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < e.length; k++)
            {
                lem lem2 = e[k];
                if (lem2 != null)
                {
                    kwk1.b(7, lem2);
                }
            }

        }
        if (f != null)
        {
            kwk1.a(8, f);
        }
        super.writeTo(kwk1);
    }
}
