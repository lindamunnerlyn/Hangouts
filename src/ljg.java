// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ljg extends kwm
{

    private static volatile ljg f[];
    public String a;
    public lhc b;
    public lhd c[];
    public lhd d;
    public lji e[];

    public ljg()
    {
        a = null;
        b = null;
        c = lhd.a();
        d = null;
        e = lji.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ljg[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new ljg[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
            i = j + kwk.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    lhd lhd1 = c[j];
                    int l = i;
                    if (lhd1 != null)
                    {
                        l = i + kwk.d(3, lhd1);
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
            i = j + kwk.d(4, d);
        }
        int i1 = i;
        if (e != null)
        {
            i1 = i;
            if (e.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= e.length)
                    {
                        break;
                    }
                    lji lji1 = e[k];
                    i1 = i;
                    if (lji1 != null)
                    {
                        i1 = i + kwk.d(5, lji1);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new lhc();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                int l = kwx.a(kwj1, 26);
                lhd alhd[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                alhd = new lhd[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, alhd, 0, j);
                    l = j;
                }
                for (; l < alhd.length - 1; l++)
                {
                    alhd[l] = new lhd();
                    kwj1.a(alhd[l]);
                    kwj1.a();
                }

                alhd[l] = new lhd();
                kwj1.a(alhd[l]);
                c = alhd;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new lhd();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                int i1 = kwx.a(kwj1, 42);
                lji alji[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                alji = new lji[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, alji, 0, k);
                    i1 = k;
                }
                for (; i1 < alji.length - 1; i1++)
                {
                    alji[i1] = new lji();
                    kwj1.a(alji[i1]);
                    kwj1.a();
                }

                alji[i1] = new lji();
                kwj1.a(alji[i1]);
                e = alji;
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
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                lhd lhd1 = c[i];
                if (lhd1 != null)
                {
                    kwk1.b(3, lhd1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                lji lji1 = e[j];
                if (lji1 != null)
                {
                    kwk1.b(5, lji1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
