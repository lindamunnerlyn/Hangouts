// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jkf extends kwm
{

    public jif a;
    public jhc b[];
    public jkc c[];
    public jkc d;

    public jkf()
    {
        a = null;
        b = jhc.a();
        c = jkc.a();
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
            j = i + kwk.d(1, a);
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
                    jhc jhc1 = b[j];
                    int k = i;
                    if (jhc1 != null)
                    {
                        k = i + kwk.d(2, jhc1);
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
                    jkc jkc1 = c[l];
                    j = i;
                    if (jkc1 != null)
                    {
                        j = i + kwk.d(3, jkc1);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new jif();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                jhc ajhc[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajhc = new jhc[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajhc, 0, j);
                    l = j;
                }
                for (; l < ajhc.length - 1; l++)
                {
                    ajhc[l] = new jhc();
                    kwj1.a(ajhc[l]);
                    kwj1.a();
                }

                ajhc[l] = new jhc();
                kwj1.a(ajhc[l]);
                b = ajhc;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                jkc ajkc[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ajkc = new jkc[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ajkc, 0, k);
                    i1 = k;
                }
                for (; i1 < ajkc.length - 1; i1++)
                {
                    ajkc[i1] = new jkc();
                    kwj1.a(ajkc[i1]);
                    kwj1.a();
                }

                ajkc[i1] = new jkc();
                kwj1.a(ajkc[i1]);
                c = ajkc;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jkc();
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
            kwk1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jhc jhc1 = b[i];
                if (jhc1 != null)
                {
                    kwk1.b(2, jhc1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                jkc jkc1 = c[j];
                if (jkc1 != null)
                {
                    kwk1.b(3, jkc1);
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
