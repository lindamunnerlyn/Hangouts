// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kdw extends kwm
{

    private static volatile kdw g[];
    public int a[];
    public kdy b;
    public kdy c;
    public kdx d;
    public double e[];
    public kdt f;

    public kdw()
    {
        a = kwx.a;
        b = null;
        c = null;
        d = null;
        e = kwx.d;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kdw[] a()
    {
        if (g == null)
        {
            synchronized (kwq.a)
            {
                if (g == null)
                {
                    g = new kdw[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int i = 0;
        int k = super.computeSerializedSize();
        int j;
        if (a != null && a.length > 0)
        {
            j = 0;
            for (; i < a.length; i++)
            {
                j += kwk.e(a[i]);
            }

            j = k + j + a.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(3, c);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                j = i + e.length * 8 + e.length * 1;
            }
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.d(6, f);
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

            case 8: // '\b'
                int j1 = kwx.a(kwj1, 8);
                int ai[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ai = new int[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ai, 0, j);
                    j1 = j;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = kwj1.f();
                    kwj1.a();
                }

                ai[j1] = kwj1.f();
                a = ai;
                break;

            case 10: // '\n'
                int j2 = kwj1.c(kwj1.p());
                int k = kwj1.r();
                int k1;
                for (k1 = 0; kwj1.q() > 0; k1++)
                {
                    kwj1.f();
                }

                kwj1.e(k);
                int ai1[];
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ai1 = new int[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, k);
                    k1 = k;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = kwj1.f();
                }

                a = ai1;
                kwj1.d(j2);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new kdy();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kdy();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new kdx();
                }
                kwj1.a(d);
                break;

            case 41: // ')'
                int l1 = kwx.a(kwj1, 41);
                double ad[];
                int l;
                if (e == null)
                {
                    l = 0;
                } else
                {
                    l = e.length;
                }
                ad = new double[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(e, 0, ad, 0, l);
                    l1 = l;
                }
                for (; l1 < ad.length - 1; l1++)
                {
                    ad[l1] = kwj1.b();
                    kwj1.a();
                }

                ad[l1] = kwj1.b();
                e = ad;
                break;

            case 42: // '*'
                int i1 = kwj1.p();
                int k2 = kwj1.c(i1);
                int i2 = i1 / 8;
                double ad1[];
                if (e == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = e.length;
                }
                ad1 = new double[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(e, 0, ad1, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ad1.length; i2++)
                {
                    ad1[i2] = kwj1.b();
                }

                e = ad1;
                kwj1.d(k2);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new kdt();
                }
                kwj1.a(f);
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
                kwk1.a(1, a[i]);
            }

        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                kwk1.a(5, e[j]);
            }

        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        super.writeTo(kwk1);
    }
}
