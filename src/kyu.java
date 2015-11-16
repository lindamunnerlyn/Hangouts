// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyu extends kwm
{

    public Long a;
    public String b;
    public String c;
    public String d;
    public String e[];
    public kyv f[];
    public kxg g[];
    public byte h[];

    public kyu()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kwx.f;
        f = kyv.a();
        g = kxg.a();
        h = null;
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
            i = j + kwk.d(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        int k = j;
        if (c != null)
        {
            k = j + kwk.b(3, c);
        }
        i = k;
        if (d != null)
        {
            i = k + kwk.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                j = 0;
                int l = 0;
                int k1;
                int l1;
                for (k1 = 0; j < e.length; k1 = l1)
                {
                    String s = e[j];
                    int i2 = l;
                    l1 = k1;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        i2 = l + kwk.a(s);
                    }
                    j++;
                    l = i2;
                }

                j = i + l + k1 * 1;
            }
        }
        i = j;
        if (f != null)
        {
            i = j;
            if (f.length > 0)
            {
                i = j;
                for (j = 0; j < f.length;)
                {
                    kyv kyv1 = f[j];
                    int i1 = i;
                    if (kyv1 != null)
                    {
                        i1 = i + kwk.d(6, kyv1);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (g != null)
        {
            j = i;
            if (g.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (j1 >= g.length)
                    {
                        break;
                    }
                    kxg kxg1 = g[j1];
                    j = i;
                    if (kxg1 != null)
                    {
                        j = i + kwk.d(7, kxg1);
                    }
                    j1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (h != null)
        {
            i = j + kwk.b(8, h);
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

            case 8: // '\b'
                a = Long.valueOf(kwj1.d());
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                int i1 = kwx.a(kwj1, 42);
                String as[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                as = new String[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, as, 0, j);
                    i1 = j;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = kwj1.j();
                    kwj1.a();
                }

                as[i1] = kwj1.j();
                e = as;
                break;

            case 50: // '2'
                int j1 = kwx.a(kwj1, 50);
                kyv akyv[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                akyv = new kyv[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, akyv, 0, k);
                    j1 = k;
                }
                for (; j1 < akyv.length - 1; j1++)
                {
                    akyv[j1] = new kyv();
                    kwj1.a(akyv[j1]);
                    kwj1.a();
                }

                akyv[j1] = new kyv();
                kwj1.a(akyv[j1]);
                f = akyv;
                break;

            case 58: // ':'
                int k1 = kwx.a(kwj1, 58);
                kxg akxg[];
                int l;
                if (g == null)
                {
                    l = 0;
                } else
                {
                    l = g.length;
                }
                akxg = new kxg[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(g, 0, akxg, 0, l);
                    k1 = l;
                }
                for (; k1 < akxg.length - 1; k1++)
                {
                    akxg[k1] = new kxg();
                    kwj1.a(akxg[k1]);
                    kwj1.a();
                }

                akxg[k1] = new kxg();
                kwj1.a(akxg[k1]);
                g = akxg;
                break;

            case 66: // 'B'
                h = kwj1.k();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a.longValue());
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    kwk1.a(5, s);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j = 0; j < f.length; j++)
            {
                kyv kyv1 = f[j];
                if (kyv1 != null)
                {
                    kwk1.b(6, kyv1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < g.length; k++)
            {
                kxg kxg1 = g[k];
                if (kxg1 != null)
                {
                    kwk1.b(7, kxg1);
                }
            }

        }
        if (h != null)
        {
            kwk1.a(8, h);
        }
        super.writeTo(kwk1);
    }
}
