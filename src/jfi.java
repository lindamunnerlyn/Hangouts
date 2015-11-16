// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfi extends kwm
{

    public Boolean a;
    public Long b;
    public ixr c[];
    public Boolean d;
    public jar e;
    public iyx f[];
    public iwr g;
    public jdl responseHeader;

    public jfi()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = ixr.a();
        d = null;
        e = null;
        f = iyx.a();
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (responseHeader != null)
        {
            j = i + kwk.d(1, responseHeader);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    ixr ixr1 = c[j];
                    int k = i;
                    if (ixr1 != null)
                    {
                        k = i + kwk.d(3, ixr1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (kwk.f(4) + 1);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.d(5, e);
        }
        i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (kwk.f(6) + 1);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= f.length)
                    {
                        break;
                    }
                    iyx iyx1 = f[l];
                    j = i;
                    if (iyx1 != null)
                    {
                        j = i + kwk.d(7, iyx1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.d(8, g);
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
                if (responseHeader == null)
                {
                    responseHeader = new jdl();
                }
                kwj1.a(responseHeader);
                break;

            case 16: // '\020'
                b = Long.valueOf(kwj1.d());
                break;

            case 26: // '\032'
                int l = kwx.a(kwj1, 26);
                ixr aixr[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aixr = new ixr[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aixr, 0, j);
                    l = j;
                }
                for (; l < aixr.length - 1; l++)
                {
                    aixr[l] = new ixr();
                    kwj1.a(aixr[l]);
                    kwj1.a();
                }

                aixr[l] = new ixr();
                kwj1.a(aixr[l]);
                c = aixr;
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new jar();
                }
                kwj1.a(e);
                break;

            case 48: // '0'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 58: // ':'
                int i1 = kwx.a(kwj1, 58);
                iyx aiyx[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                aiyx = new iyx[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, aiyx, 0, k);
                    i1 = k;
                }
                for (; i1 < aiyx.length - 1; i1++)
                {
                    aiyx[i1] = new iyx();
                    kwj1.a(aiyx[i1]);
                    kwj1.a();
                }

                aiyx[i1] = new iyx();
                kwj1.a(aiyx[i1]);
                f = aiyx;
                break;

            case 66: // 'B'
                if (g == null)
                {
                    g = new iwr();
                }
                kwj1.a(g);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (b != null)
        {
            kwk1.a(2, b.longValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                ixr ixr1 = c[i];
                if (ixr1 != null)
                {
                    kwk1.b(3, ixr1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (a != null)
        {
            kwk1.a(6, a.booleanValue());
        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                iyx iyx1 = f[j];
                if (iyx1 != null)
                {
                    kwk1.b(7, iyx1);
                }
            }

        }
        if (g != null)
        {
            kwk1.b(8, g);
        }
        super.writeTo(kwk1);
    }
}
