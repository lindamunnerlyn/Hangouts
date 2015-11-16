// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lid extends kwm
{

    public String a;
    public lie b[];
    public lie c[];
    public Boolean d;
    public lfy e;

    public lid()
    {
        a = null;
        b = lie.a();
        c = lie.a();
        d = null;
        e = null;
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
            j = i + kwk.b(1, a);
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
                    lie lie1 = b[j];
                    int k = i;
                    if (lie1 != null)
                    {
                        k = i + kwk.d(2, lie1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    lie lie2 = c[l];
                    j = i;
                    if (lie2 != null)
                    {
                        j = i + kwk.d(3, lie2);
                    }
                    l++;
                    i = j;
                } while (true);
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
        return j;
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
                int l = kwx.a(kwj1, 18);
                lie alie[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alie = new lie[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alie, 0, j);
                    l = j;
                }
                for (; l < alie.length - 1; l++)
                {
                    alie[l] = new lie();
                    kwj1.a(alie[l]);
                    kwj1.a();
                }

                alie[l] = new lie();
                kwj1.a(alie[l]);
                b = alie;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                lie alie1[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                alie1 = new lie[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, alie1, 0, k);
                    i1 = k;
                }
                for (; i1 < alie1.length - 1; i1++)
                {
                    alie1[i1] = new lie();
                    kwj1.a(alie1[i1]);
                    kwj1.a();
                }

                alie1[i1] = new lie();
                kwj1.a(alie1[i1]);
                c = alie1;
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new lfy();
                }
                kwj1.a(e);
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
                lie lie1 = b[i];
                if (lie1 != null)
                {
                    kwk1.b(2, lie1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                lie lie2 = c[j];
                if (lie2 != null)
                {
                    kwk1.b(3, lie2);
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
        super.writeTo(kwk1);
    }
}
