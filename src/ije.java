// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ije extends kwm
{

    private static volatile ije c[];
    public String a[];
    public ijf b[];

    public ije()
    {
        a = kwx.f;
        b = ijf.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ije[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new ije[0];
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
        int l1 = super.computeSerializedSize();
        int i;
        int i1;
        if (a != null && a.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int j1;
            for (l = 0; i < a.length; l = j1)
            {
                String s = a[i];
                int k1 = j;
                j1 = l;
                if (s != null)
                {
                    j1 = l + 1;
                    k1 = j + kwk.a(s);
                }
                i++;
                j = k1;
            }

            i = l1 + j + l * 1;
        } else
        {
            i = l1;
        }
        i1 = i;
        if (b != null)
        {
            i1 = i;
            if (b.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    ijf ijf1 = b[k];
                    i1 = i;
                    if (ijf1 != null)
                    {
                        i1 = i + kwk.d(2, ijf1);
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
                ijf aijf[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aijf = new ijf[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aijf, 0, k);
                    i1 = k;
                }
                for (; i1 < aijf.length - 1; i1++)
                {
                    aijf[i1] = new ijf();
                    kwj1.a(aijf[i1]);
                    kwj1.a();
                }

                aijf[i1] = new ijf();
                kwj1.a(aijf[i1]);
                b = aijf;
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
                ijf ijf1 = b[j];
                if (ijf1 != null)
                {
                    kwk1.b(2, ijf1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
