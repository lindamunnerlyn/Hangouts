// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lkw extends kwm
{

    private static volatile lkw f[];
    public String a[];
    public String b;
    public lkv c[];
    public Boolean d;
    public Boolean e;

    public lkw()
    {
        a = kwx.f;
        b = null;
        c = lkv.a();
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lkw[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new lkw[0];
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
        int l1 = super.computeSerializedSize();
        int j;
        int k;
        if (a != null && a.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int j1;
            for (l = 0; i < a.length; l = j1)
            {
                String s = a[i];
                int k1 = k;
                j1 = l;
                if (s != null)
                {
                    j1 = l + 1;
                    k1 = k + kwk.a(s);
                }
                i++;
                k = k1;
            }

            k = l1 + k + l * 1;
        } else
        {
            k = l1;
        }
        j = k;
        if (b != null)
        {
            j = k + kwk.b(2, b);
        }
        k = j;
        if (c != null)
        {
            k = j;
            if (c.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k = j;
                    if (i1 >= c.length)
                    {
                        break;
                    }
                    lkv lkv1 = c[i1];
                    k = j;
                    if (lkv1 != null)
                    {
                        k = j + kwk.d(3, lkv1);
                    }
                    i1++;
                    j = k;
                } while (true);
            }
        }
        j = k;
        if (d != null)
        {
            d.booleanValue();
            j = k + (kwk.f(4) + 1);
        }
        k = j;
        if (e != null)
        {
            e.booleanValue();
            k = j + (kwk.f(5) + 1);
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
                b = kwj1.j();
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                lkv alkv[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                alkv = new lkv[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, alkv, 0, k);
                    i1 = k;
                }
                for (; i1 < alkv.length - 1; i1++)
                {
                    alkv[i1] = new lkv();
                    kwj1.a(alkv[i1]);
                    kwj1.a();
                }

                alkv[i1] = new lkv();
                kwj1.a(alkv[i1]);
                c = alkv;
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
                break;

            case 40: // '('
                e = Boolean.valueOf(kwj1.i());
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
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                lkv lkv1 = c[j];
                if (lkv1 != null)
                {
                    kwk1.b(3, lkv1);
                }
            }

        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
