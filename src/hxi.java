// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hxi extends kwm
{

    public String a;
    public String b;
    public String c;
    public hvi d[];

    public hxi()
    {
        a = null;
        b = null;
        c = null;
        d = hvi.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.b(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(2, b);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    hvi hvi1 = d[j];
                    int k = i;
                    if (hvi1 != null)
                    {
                        k = i + kwk.d(3, hvi1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(4, c);
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
                int k = kwx.a(kwj1, 26);
                hvi ahvi[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                ahvi = new hvi[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, ahvi, 0, j);
                    k = j;
                }
                for (; k < ahvi.length - 1; k++)
                {
                    ahvi[k] = new hvi();
                    kwj1.a(ahvi[k]);
                    kwj1.a();
                }

                ahvi[k] = new hvi();
                kwj1.a(ahvi[k]);
                d = ahvi;
                break;

            case 34: // '"'
                c = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                hvi hvi1 = d[i];
                if (hvi1 != null)
                {
                    kwk1.b(3, hvi1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(4, c);
        }
        super.writeTo(kwk1);
    }
}
