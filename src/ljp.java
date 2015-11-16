// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljp extends kwm
{

    public lkp a;
    public ljo b[];
    public lhc c[];
    public lhc d;

    public ljp()
    {
        a = null;
        b = ljo.a();
        c = lhc.a();
        d = null;
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
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ljo ljo1 = b[j];
                    int l = i;
                    if (ljo1 != null)
                    {
                        l = i + kwk.d(2, ljo1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(3, d);
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
                    lhc lhc1 = c[k];
                    i1 = i;
                    if (lhc1 != null)
                    {
                        i1 = i + kwk.d(4, lhc1);
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
                    a = new lkp();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                ljo aljo[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aljo = new ljo[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aljo, 0, j);
                    l = j;
                }
                for (; l < aljo.length - 1; l++)
                {
                    aljo[l] = new ljo();
                    kwj1.a(aljo[l]);
                    kwj1.a();
                }

                aljo[l] = new ljo();
                kwj1.a(aljo[l]);
                b = aljo;
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new lhc();
                }
                kwj1.a(d);
                break;

            case 34: // '"'
                int i1 = kwx.a(kwj1, 34);
                lhc alhc[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                alhc = new lhc[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, alhc, 0, k);
                    i1 = k;
                }
                for (; i1 < alhc.length - 1; i1++)
                {
                    alhc[i1] = new lhc();
                    kwj1.a(alhc[i1]);
                    kwj1.a();
                }

                alhc[i1] = new lhc();
                kwj1.a(alhc[i1]);
                c = alhc;
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
                ljo ljo1 = b[i];
                if (ljo1 != null)
                {
                    kwk1.b(2, ljo1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(3, d);
        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                lhc lhc1 = c[j];
                if (lhc1 != null)
                {
                    kwk1.b(4, lhc1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
