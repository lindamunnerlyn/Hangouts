// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfl extends kwm
{

    public Long a;
    public ixr b[];
    public Long c;
    public jar d;
    public iyx e[];
    public iwr f;
    public jdl responseHeader;

    public jfl()
    {
        responseHeader = null;
        a = null;
        b = ixr.a();
        c = null;
        d = null;
        e = iyx.a();
        f = null;
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
        if (a != null)
        {
            i = j + kwk.d(2, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ixr ixr1 = b[j];
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
        int l = j;
        if (c != null)
        {
            l = j + kwk.d(4, c.longValue());
        }
        i = l;
        if (d != null)
        {
            i = l + kwk.d(5, d);
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
                    iyx iyx1 = e[i1];
                    j = i;
                    if (iyx1 != null)
                    {
                        j = i + kwk.d(6, iyx1);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.d(7, f);
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
                a = Long.valueOf(kwj1.d());
                break;

            case 26: // '\032'
                int l = kwx.a(kwj1, 26);
                ixr aixr[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aixr = new ixr[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aixr, 0, j);
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
                b = aixr;
                break;

            case 32: // ' '
                c = Long.valueOf(kwj1.d());
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new jar();
                }
                kwj1.a(d);
                break;

            case 50: // '2'
                int i1 = kwx.a(kwj1, 50);
                iyx aiyx[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aiyx = new iyx[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, aiyx, 0, k);
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
                e = aiyx;
                break;

            case 58: // ':'
                if (f == null)
                {
                    f = new iwr();
                }
                kwj1.a(f);
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
        if (a != null)
        {
            kwk1.a(2, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ixr ixr1 = b[i];
                if (ixr1 != null)
                {
                    kwk1.b(3, ixr1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(4, c.longValue());
        }
        if (d != null)
        {
            kwk1.b(5, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                iyx iyx1 = e[j];
                if (iyx1 != null)
                {
                    kwk1.b(6, iyx1);
                }
            }

        }
        if (f != null)
        {
            kwk1.b(7, f);
        }
        super.writeTo(kwk1);
    }
}
