// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdq extends kwm
{

    public iyx a[];
    public Boolean b;
    public ixp c[];
    public jdl responseHeader;

    public jdq()
    {
        responseHeader = null;
        a = iyx.a();
        b = null;
        c = ixp.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + kwk.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    iyx iyx1 = a[j];
                    int l = i;
                    if (iyx1 != null)
                    {
                        l = i + kwk.d(2, iyx1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            b.booleanValue();
            i = j + (kwk.f(3) + 1);
        }
        int i1 = i;
        if (c != null)
        {
            i1 = i;
            if (c.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= c.length)
                    {
                        break;
                    }
                    ixp ixp1 = c[k];
                    i1 = i;
                    if (ixp1 != null)
                    {
                        i1 = i + kwk.d(4, ixp1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                iyx aiyx[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiyx = new iyx[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiyx, 0, j);
                    l = j;
                }
                for (; l < aiyx.length - 1; l++)
                {
                    aiyx[l] = new iyx();
                    kwj1.a(aiyx[l]);
                    kwj1.a();
                }

                aiyx[l] = new iyx();
                kwj1.a(aiyx[l]);
                a = aiyx;
                break;

            case 24: // '\030'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 34: // '"'
                int i1 = kwx.a(kwj1, 34);
                ixp aixp[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aixp = new ixp[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aixp, 0, k);
                    i1 = k;
                }
                for (; i1 < aixp.length - 1; i1++)
                {
                    aixp[i1] = new ixp();
                    kwj1.a(aixp[i1]);
                    kwj1.a();
                }

                aixp[i1] = new ixp();
                kwj1.a(aixp[i1]);
                c = aixp;
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
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iyx iyx1 = a[i];
                if (iyx1 != null)
                {
                    kwk1.b(2, iyx1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(3, b.booleanValue());
        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                ixp ixp1 = c[j];
                if (ixp1 != null)
                {
                    kwk1.b(4, ixp1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
