// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fgp extends fgh
{

    public String a[];
    public String b[];
    public int c[];
    public long d[];

    public fgp()
    {
        a = fgo.f;
        b = fgo.f;
        c = fgo.a;
        d = fgo.b;
        o = null;
        p = -1;
    }

    protected int a()
    {
        boolean flag = false;
        int l2 = super.a();
        int i;
        int k;
        if (a != null && a.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int l1;
            for (l = 0; i < a.length; l = l1)
            {
                String s = a[i];
                int j2 = j;
                l1 = l;
                if (s != null)
                {
                    l1 = l + 1;
                    j2 = j + fgg.a(s);
                }
                i++;
                j = j2;
            }

            i = l2 + j + l * 1;
        } else
        {
            i = l2;
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                k = 0;
                int i1 = 0;
                int i2;
                int k2;
                for (i2 = 0; k < b.length; i2 = k2)
                {
                    String s1 = b[k];
                    l2 = i1;
                    k2 = i2;
                    if (s1 != null)
                    {
                        k2 = i2 + 1;
                        l2 = i1 + fgg.a(s1);
                    }
                    k++;
                    i1 = l2;
                }

                k = i + i1 + i2 * 1;
            }
        }
        i = k;
        if (c != null)
        {
            i = k;
            if (c.length > 0)
            {
                i = 0;
                int j1 = 0;
                for (; i < c.length; i++)
                {
                    j1 += fgg.b(c[i]);
                }

                i = k + j1 + c.length * 1;
            }
        }
        k = i;
        if (d != null)
        {
            k = i;
            if (d.length > 0)
            {
                int k1 = 0;
                for (k = ((flag) ? 1 : 0); k < d.length; k++)
                {
                    k1 += fgg.b(d[k]);
                }

                k = i + k1 + d.length * 1;
            }
        }
        return k;
    }

    public fgm a(fgf fgf1)
    {
        do
        {
            int i = fgf1.a();
            switch (i)
            {
            default:
                if (a(fgf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int l1 = fgo.a(fgf1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[l1 + j];
                l1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    l1 = j;
                }
                for (; l1 < as.length - 1; l1++)
                {
                    as[l1] = fgf1.g();
                    fgf1.a();
                }

                as[l1] = fgf1.g();
                a = as;
                break;

            case 18: // '\022'
                int i2 = fgo.a(fgf1, 18);
                String as1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                as1 = new String[i2 + k];
                i2 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, as1, 0, k);
                    i2 = k;
                }
                for (; i2 < as1.length - 1; i2++)
                {
                    as1[i2] = fgf1.g();
                    fgf1.a();
                }

                as1[i2] = fgf1.g();
                b = as1;
                break;

            case 24: // '\030'
                int j2 = fgo.a(fgf1, 24);
                int ai[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                ai = new int[j2 + l];
                j2 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, ai, 0, l);
                    j2 = l;
                }
                for (; j2 < ai.length - 1; j2++)
                {
                    ai[j2] = fgf1.e();
                    fgf1.a();
                }

                ai[j2] = fgf1.e();
                c = ai;
                break;

            case 26: // '\032'
                int j3 = fgf1.c(fgf1.k());
                int i1 = fgf1.m();
                int k2;
                for (k2 = 0; fgf1.l() > 0; k2++)
                {
                    fgf1.e();
                }

                fgf1.e(i1);
                int ai1[];
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                ai1 = new int[k2 + i1];
                k2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, i1);
                    k2 = i1;
                }
                for (; k2 < ai1.length; k2++)
                {
                    ai1[k2] = fgf1.e();
                }

                c = ai1;
                fgf1.d(j3);
                break;

            case 32: // ' '
                int l2 = fgo.a(fgf1, 32);
                long al[];
                int j1;
                if (d == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = d.length;
                }
                al = new long[l2 + j1];
                l2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(d, 0, al, 0, j1);
                    l2 = j1;
                }
                for (; l2 < al.length - 1; l2++)
                {
                    al[l2] = fgf1.d();
                    fgf1.a();
                }

                al[l2] = fgf1.d();
                d = al;
                break;

            case 34: // '"'
                int k3 = fgf1.c(fgf1.k());
                int k1 = fgf1.m();
                int i3;
                for (i3 = 0; fgf1.l() > 0; i3++)
                {
                    fgf1.d();
                }

                fgf1.e(k1);
                long al1[];
                if (d == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = d.length;
                }
                al1 = new long[i3 + k1];
                i3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(d, 0, al1, 0, k1);
                    i3 = k1;
                }
                for (; i3 < al1.length; i3++)
                {
                    al1[i3] = fgf1.d();
                }

                d = al1;
                fgf1.d(k3);
                break;
            }
        } while (true);
    }

    public void a(fgg fgg1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    fgg1.a(1, s);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                String s1 = b[j];
                if (s1 != null)
                {
                    fgg1.a(2, s1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = 0; k < c.length; k++)
            {
                fgg1.a(3, c[k]);
            }

        }
        if (d != null && d.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < d.length; l++)
            {
                fgg1.a(4, d[l]);
            }

        }
        super.a(fgg1);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof fgp)
            {
                obj = (fgp)obj;
                flag = flag1;
                if (fgk.a(a, ((fgp) (obj)).a))
                {
                    flag = flag1;
                    if (fgk.a(b, ((fgp) (obj)).b))
                    {
                        flag = flag1;
                        if (fgk.a(c, ((fgp) (obj)).c))
                        {
                            flag = flag1;
                            if (fgk.a(d, ((fgp) (obj)).d))
                            {
                                return a(((fgh) (obj)));
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ((((fgk.a(a) + 527) * 31 + fgk.a(b)) * 31 + fgk.a(c)) * 31 + fgk.a(d)) * 31 + c();
    }
}
