// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class huh extends kwm
{

    public Integer a;
    public hui b[];
    public htu c[];
    public huj d;

    public huh()
    {
        a = null;
        b = hui.a();
        c = htu.a();
        d = null;
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
            j = i + kwk.e(1, a.intValue());
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
                    hui hui1 = b[j];
                    int k = i;
                    if (hui1 != null)
                    {
                        k = i + kwk.d(2, hui1);
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
                    htu htu1 = c[l];
                    j = i;
                    if (htu1 != null)
                    {
                        j = i + kwk.d(3, htu1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(4, d);
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
                a = Integer.valueOf(kwj1.f());
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                hui ahui[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahui = new hui[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahui, 0, j);
                    l = j;
                }
                for (; l < ahui.length - 1; l++)
                {
                    ahui[l] = new hui();
                    kwj1.a(ahui[l]);
                    kwj1.a();
                }

                ahui[l] = new hui();
                kwj1.a(ahui[l]);
                b = ahui;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                htu ahtu[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ahtu = new htu[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ahtu, 0, k);
                    i1 = k;
                }
                for (; i1 < ahtu.length - 1; i1++)
                {
                    ahtu[i1] = new htu();
                    kwj1.a(ahtu[i1]);
                    kwj1.a();
                }

                ahtu[i1] = new htu();
                kwj1.a(ahtu[i1]);
                c = ahtu;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new huj();
                }
                kwj1.a(d);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                hui hui1 = b[i];
                if (hui1 != null)
                {
                    kwk1.b(2, hui1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                htu htu1 = c[j];
                if (htu1 != null)
                {
                    kwk1.b(3, htu1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        super.writeTo(kwk1);
    }
}
