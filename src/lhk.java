// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhk extends kwm
{

    private static volatile lhk c[];
    public lhd a[];
    public String b[];

    public lhk()
    {
        a = lhd.a();
        b = kwx.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lhk[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new lhk[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
                    lhd lhd1 = a[j];
                    int k = i;
                    if (lhd1 != null)
                    {
                        k = i + kwk.d(1, lhd1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < b.length;)
                {
                    String s = b[j];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + kwk.a(s);
                    }
                    j++;
                    l = k1;
                    i1 = j1;
                }

                j = i + l + i1 * 1;
            }
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
                int l = kwx.a(kwj1, 10);
                lhd alhd[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                alhd = new lhd[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, alhd, 0, j);
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
                a = alhd;
                break;

            case 18: // '\022'
                int i1 = kwx.a(kwj1, 18);
                String as[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                as = new String[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, as, 0, k);
                    i1 = k;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = kwj1.j();
                    kwj1.a();
                }

                as[i1] = kwj1.j();
                b = as;
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
                lhd lhd1 = a[i];
                if (lhd1 != null)
                {
                    kwk1.b(1, lhd1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                String s = b[j];
                if (s != null)
                {
                    kwk1.a(2, s);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
