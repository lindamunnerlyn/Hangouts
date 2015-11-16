// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibf extends kwm
{

    public ibg a;
    public String b;
    public String c[];
    public String d;
    public iaw e;
    public iaw f[];

    public ibf()
    {
        a = null;
        b = null;
        c = kwx.f;
        d = null;
        e = null;
        f = iaw.a();
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
            j = i + kwk.d(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                j = 0;
                int l = 0;
                int j1;
                int k1;
                for (j1 = 0; j < c.length; j1 = k1)
                {
                    String s = c[j];
                    int l1 = l;
                    k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = l + kwk.a(s);
                    }
                    j++;
                    l = l1;
                }

                j = i + l + j1 * 1;
            }
        }
        int i1 = j;
        if (d != null)
        {
            i1 = j + kwk.b(4, d);
        }
        i = i1;
        if (e != null)
        {
            i = i1 + kwk.d(5, e);
        }
        i1 = i;
        if (f != null)
        {
            i1 = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    iaw iaw1 = f[k];
                    i1 = i;
                    if (iaw1 != null)
                    {
                        i1 = i + kwk.d(6, iaw1);
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
                if (a == null)
                {
                    a = new ibg();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                int l = kwx.a(kwj1, 26);
                String as[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kwj1.j();
                    kwj1.a();
                }

                as[l] = kwj1.j();
                c = as;
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new iaw();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                int i1 = kwx.a(kwj1, 50);
                iaw aiaw[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                aiaw = new iaw[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, aiaw, 0, k);
                    i1 = k;
                }
                for (; i1 < aiaw.length - 1; i1++)
                {
                    aiaw[i1] = new iaw();
                    kwj1.a(aiaw[i1]);
                    kwj1.a();
                }

                aiaw[i1] = new iaw();
                kwj1.a(aiaw[i1]);
                f = aiaw;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                String s = c[i];
                if (s != null)
                {
                    kwk1.a(3, s);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                iaw iaw1 = f[j];
                if (iaw1 != null)
                {
                    kwk1.b(6, iaw1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
