// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jvt extends koj
{

    private static volatile jvt g[];
    public int a[];
    public jvv b;
    public jvv c;
    public jvu d;
    public double e[];
    public jvq f;

    public jvt()
    {
        a = kou.a;
        b = null;
        c = null;
        d = null;
        e = kou.d;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jvt[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new jvt[0];
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
                j += koh.e(a[i]);
            }

            j = k + j + a.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(3, c);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(4, d);
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
            i = j + koh.d(6, f);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                int j1 = kou.b(kog1, 8);
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
                    ai[j1] = kog1.f();
                    kog1.a();
                }

                ai[j1] = kog1.f();
                a = ai;
                break;

            case 10: // '\n'
                int j2 = kog1.c(kog1.p());
                int k = kog1.r();
                int k1;
                for (k1 = 0; kog1.q() > 0; k1++)
                {
                    kog1.f();
                }

                kog1.e(k);
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
                    ai1[k1] = kog1.f();
                }

                a = ai1;
                kog1.d(j2);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new jvv();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new jvv();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jvu();
                }
                kog1.a(d);
                break;

            case 41: // ')'
                int l1 = kou.b(kog1, 41);
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
                    ad[l1] = kog1.b();
                    kog1.a();
                }

                ad[l1] = kog1.b();
                e = ad;
                break;

            case 42: // '*'
                int i1 = kog1.p();
                int k2 = kog1.c(i1);
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
                    ad1[i2] = kog1.b();
                }

                e = ad1;
                kog1.d(k2);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new jvq();
                }
                kog1.a(f);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                koh1.a(1, a[i]);
            }

        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                koh1.a(5, e[j]);
            }

        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        super.writeTo(koh1);
    }
}
