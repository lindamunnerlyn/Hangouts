// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzd extends kwm
{

    public hza a[];
    public hza b[];
    public String c;
    public String d;
    public hze e[];
    public hzc f;
    public hzb g;
    public Boolean h;

    public hzd()
    {
        a = hza.a();
        b = hza.a();
        c = null;
        d = null;
        e = hze.a();
        f = null;
        g = null;
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
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    hza hza1 = a[j];
                    int k = i;
                    if (hza1 != null)
                    {
                        k = i + kwk.d(1, hza1);
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
                    hza hza2 = b[j];
                    int l = i;
                    if (hza2 != null)
                    {
                        l = i + kwk.d(2, hza2);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        int i1 = j;
        if (c != null)
        {
            i1 = j + kwk.b(3, c);
        }
        i = i1;
        if (d != null)
        {
            i = i1 + kwk.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (j1 >= e.length)
                    {
                        break;
                    }
                    hze hze1 = e[j1];
                    j = i;
                    if (hze1 != null)
                    {
                        j = i + kwk.d(5, hze1);
                    }
                    j1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.d(6, f);
        }
        j = i;
        if (g != null)
        {
            j = i + kwk.d(7, g);
        }
        i = j;
        if (h != null)
        {
            h.booleanValue();
            i = j + (kwk.f(8) + 1);
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
                hza ahza[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ahza = new hza[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ahza, 0, j);
                    i1 = j;
                }
                for (; i1 < ahza.length - 1; i1++)
                {
                    ahza[i1] = new hza();
                    kwj1.a(ahza[i1]);
                    kwj1.a();
                }

                ahza[i1] = new hza();
                kwj1.a(ahza[i1]);
                a = ahza;
                break;

            case 18: // '\022'
                int j1 = kwx.a(kwj1, 18);
                hza ahza1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ahza1 = new hza[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ahza1, 0, k);
                    j1 = k;
                }
                for (; j1 < ahza1.length - 1; j1++)
                {
                    ahza1[j1] = new hza();
                    kwj1.a(ahza1[j1]);
                    kwj1.a();
                }

                ahza1[j1] = new hza();
                kwj1.a(ahza1[j1]);
                b = ahza1;
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                int k1 = kwx.a(kwj1, 42);
                hze ahze[];
                int l;
                if (e == null)
                {
                    l = 0;
                } else
                {
                    l = e.length;
                }
                ahze = new hze[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(e, 0, ahze, 0, l);
                    k1 = l;
                }
                for (; k1 < ahze.length - 1; k1++)
                {
                    ahze[k1] = new hze();
                    kwj1.a(ahze[k1]);
                    kwj1.a();
                }

                ahze[k1] = new hze();
                kwj1.a(ahze[k1]);
                e = ahze;
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new hzc();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new hzb();
                }
                kwj1.a(g);
                break;

            case 64: // '@'
                h = Boolean.valueOf(kwj1.i());
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
                hza hza1 = a[i];
                if (hza1 != null)
                {
                    kwk1.b(1, hza1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                hza hza2 = b[j];
                if (hza2 != null)
                {
                    kwk1.b(2, hza2);
                }
            }

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
            for (int k = ((flag) ? 1 : 0); k < e.length; k++)
            {
                hze hze1 = e[k];
                if (hze1 != null)
                {
                    kwk1.b(5, hze1);
                }
            }

        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.a(8, h.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
