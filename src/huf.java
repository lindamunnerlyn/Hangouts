// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class huf extends kwm
{

    public String a[];
    public String b[];

    public huf()
    {
        a = kwx.f;
        b = kwx.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int k2 = super.computeSerializedSize();
        int i;
        int k;
        if (a != null && a.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int j1;
            for (l = 0; i < a.length; l = j1)
            {
                String s = a[i];
                int l1 = j;
                j1 = l;
                if (s != null)
                {
                    j1 = l + 1;
                    l1 = j + kwk.a(s);
                }
                i++;
                j = l1;
            }

            i = k2 + j + l * 1;
        } else
        {
            i = k2;
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                int i1 = 0;
                int k1 = 0;
                for (k = ((flag) ? 1 : 0); k < b.length;)
                {
                    String s1 = b[k];
                    int j2 = i1;
                    int i2 = k1;
                    if (s1 != null)
                    {
                        i2 = k1 + 1;
                        j2 = i1 + kwk.a(s1);
                    }
                    k++;
                    i1 = j2;
                    k1 = i2;
                }

                k = i + i1 + k1 * 1;
            }
        }
        return k;
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
                int l = kwx.a(kwj1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kwj1.j();
                    kwj1.a();
                }

                as[l] = kwj1.j();
                a = as;
                break;

            case 18: // '\022'
                int i1 = kwx.a(kwj1, 18);
                String as1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                as1 = new String[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, as1, 0, k);
                    i1 = k;
                }
                for (; i1 < as1.length - 1; i1++)
                {
                    as1[i1] = kwj1.j();
                    kwj1.a();
                }

                as1[i1] = kwj1.j();
                b = as1;
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
                String s = a[i];
                if (s != null)
                {
                    kwk1.a(1, s);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                String s1 = b[j];
                if (s1 != null)
                {
                    kwk1.a(2, s1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
