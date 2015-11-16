// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lsc extends kwm
{

    public ktc a[];
    public Integer b;
    public Integer c;
    public lrt d[];

    public lsc()
    {
        a = ktc.a();
        b = null;
        c = null;
        d = lrt.a();
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
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    ktc ktc1 = a[j];
                    int l = i;
                    if (ktc1 != null)
                    {
                        l = i + kwk.d(1, ktc1);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.intValue());
        }
        int i1 = i;
        if (d != null)
        {
            i1 = i;
            if (d.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= d.length)
                    {
                        break;
                    }
                    lrt lrt1 = d[k];
                    i1 = i;
                    if (lrt1 != null)
                    {
                        i1 = i + kwk.d(4, lrt1);
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
                int l = kwx.a(kwj1, 10);
                ktc aktc[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aktc = new ktc[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aktc, 0, j);
                    l = j;
                }
                for (; l < aktc.length - 1; l++)
                {
                    aktc[l] = new ktc();
                    kwj1.a(aktc[l]);
                    kwj1.a();
                }

                aktc[l] = new ktc();
                kwj1.a(aktc[l]);
                a = aktc;
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
                break;

            case 24: // '\030'
                c = Integer.valueOf(kwj1.f());
                break;

            case 34: // '"'
                int i1 = kwx.a(kwj1, 34);
                lrt alrt[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                alrt = new lrt[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, alrt, 0, k);
                    i1 = k;
                }
                for (; i1 < alrt.length - 1; i1++)
                {
                    alrt[i1] = new lrt();
                    kwj1.a(alrt[i1]);
                    kwj1.a();
                }

                alrt[i1] = new lrt();
                kwj1.a(alrt[i1]);
                d = alrt;
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
                ktc ktc1 = a[i];
                if (ktc1 != null)
                {
                    kwk1.b(1, ktc1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.intValue());
        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                lrt lrt1 = d[j];
                if (lrt1 != null)
                {
                    kwk1.b(4, lrt1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
