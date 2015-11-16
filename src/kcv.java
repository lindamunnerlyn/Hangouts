// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kcv extends kwm
{

    public Integer a;
    public kcf b[];
    public long c[];
    public boolean d[];
    public kcg e[];
    public String f;
    public String g;
    public kdm h;
    public Integer i;
    public Integer j;

    public kcv()
    {
        a = null;
        b = kcf.a();
        c = kwx.b;
        d = kwx.e;
        e = kcg.a();
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int k = l;
        if (b != null)
        {
            k = l;
            if (b.length > 0)
            {
                k = l;
                for (l = 0; l < b.length;)
                {
                    kcf kcf1 = b[l];
                    int i1 = k;
                    if (kcf1 != null)
                    {
                        i1 = k + kwk.d(1, kcf1);
                    }
                    l++;
                    k = i1;
                }

            }
        }
        l = k;
        if (f != null)
        {
            l = k + kwk.b(2, f);
        }
        k = l;
        if (h != null)
        {
            k = l + kwk.d(3, h);
        }
        l = k;
        if (i != null)
        {
            l = k + kwk.e(4, i.intValue());
        }
        int j1 = l;
        if (j != null)
        {
            j1 = l + kwk.e(5, j.intValue());
        }
        k = j1;
        if (a != null)
        {
            k = j1 + kwk.e(6, a.intValue());
        }
        l = k;
        if (c != null)
        {
            l = k;
            if (c.length > 0)
            {
                l = 0;
                int k1 = 0;
                for (; l < c.length; l++)
                {
                    k1 += kwk.b(c[l]);
                }

                l = k + k1 + c.length * 1;
            }
        }
        k = l;
        if (d != null)
        {
            k = l;
            if (d.length > 0)
            {
                k = l + d.length * 1 + d.length * 1;
            }
        }
        l = k;
        if (e != null)
        {
            l = k;
            if (e.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    l = k;
                    if (l1 >= e.length)
                    {
                        break;
                    }
                    kcg kcg1 = e[l1];
                    l = k;
                    if (kcg1 != null)
                    {
                        l = k + kwk.d(9, kcg1);
                    }
                    l1++;
                    k = l;
                } while (true);
            }
        }
        k = l;
        if (g != null)
        {
            k = l + kwk.b(10, g);
        }
        return k;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int k = kwj1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(kwj1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int j2 = kwx.a(kwj1, 10);
                kcf akcf[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                akcf = new kcf[j2 + l];
                j2 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, akcf, 0, l);
                    j2 = l;
                }
                for (; j2 < akcf.length - 1; j2++)
                {
                    akcf[j2] = new kcf();
                    kwj1.a(akcf[j2]);
                    kwj1.a();
                }

                akcf[j2] = new kcf();
                kwj1.a(akcf[j2]);
                b = akcf;
                break;

            case 18: // '\022'
                f = kwj1.j();
                break;

            case 26: // '\032'
                if (h == null)
                {
                    h = new kdm();
                }
                kwj1.a(h);
                break;

            case 32: // ' '
                i = Integer.valueOf(kwj1.f());
                break;

            case 40: // '('
                j = Integer.valueOf(kwj1.f());
                break;

            case 48: // '0'
                a = Integer.valueOf(kwj1.f());
                break;

            case 56: // '8'
                int k2 = kwx.a(kwj1, 56);
                long al[];
                int i1;
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                al = new long[k2 + i1];
                k2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, al, 0, i1);
                    k2 = i1;
                }
                for (; k2 < al.length - 1; k2++)
                {
                    al[k2] = kwj1.e();
                    kwj1.a();
                }

                al[k2] = kwj1.e();
                c = al;
                break;

            case 58: // ':'
                int l3 = kwj1.c(kwj1.p());
                int j1 = kwj1.r();
                int l2;
                for (l2 = 0; kwj1.q() > 0; l2++)
                {
                    kwj1.e();
                }

                kwj1.e(j1);
                long al1[];
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                al1 = new long[l2 + j1];
                l2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, al1, 0, j1);
                    l2 = j1;
                }
                for (; l2 < al1.length; l2++)
                {
                    al1[l2] = kwj1.e();
                }

                c = al1;
                kwj1.d(l3);
                break;

            case 64: // '@'
                int i3 = kwx.a(kwj1, 64);
                boolean aflag[];
                int k1;
                if (d == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = d.length;
                }
                aflag = new boolean[i3 + k1];
                i3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(d, 0, aflag, 0, k1);
                    i3 = k1;
                }
                for (; i3 < aflag.length - 1; i3++)
                {
                    aflag[i3] = kwj1.i();
                    kwj1.a();
                }

                aflag[i3] = kwj1.i();
                d = aflag;
                break;

            case 66: // 'B'
                int i4 = kwj1.c(kwj1.p());
                int l1 = kwj1.r();
                int j3;
                for (j3 = 0; kwj1.q() > 0; j3++)
                {
                    kwj1.i();
                }

                kwj1.e(l1);
                boolean aflag1[];
                if (d == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = d.length;
                }
                aflag1 = new boolean[j3 + l1];
                j3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(d, 0, aflag1, 0, l1);
                    j3 = l1;
                }
                for (; j3 < aflag1.length; j3++)
                {
                    aflag1[j3] = kwj1.i();
                }

                d = aflag1;
                kwj1.d(i4);
                break;

            case 74: // 'J'
                int k3 = kwx.a(kwj1, 74);
                kcg akcg[];
                int i2;
                if (e == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = e.length;
                }
                akcg = new kcg[k3 + i2];
                k3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(e, 0, akcg, 0, i2);
                    k3 = i2;
                }
                for (; k3 < akcg.length - 1; k3++)
                {
                    akcg[k3] = new kcg();
                    kwj1.a(akcg[k3]);
                    kwj1.a();
                }

                akcg[k3] = new kcg();
                kwj1.a(akcg[k3]);
                e = akcg;
                break;

            case 82: // 'R'
                g = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (b != null && b.length > 0)
        {
            for (int k = 0; k < b.length; k++)
            {
                kcf kcf1 = b[k];
                if (kcf1 != null)
                {
                    kwk1.b(1, kcf1);
                }
            }

        }
        if (f != null)
        {
            kwk1.a(2, f);
        }
        if (h != null)
        {
            kwk1.b(3, h);
        }
        if (i != null)
        {
            kwk1.a(4, i.intValue());
        }
        if (j != null)
        {
            kwk1.a(5, j.intValue());
        }
        if (a != null)
        {
            kwk1.a(6, a.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int l = 0; l < c.length; l++)
            {
                kwk1.b(7, c[l]);
            }

        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                kwk1.a(8, d[i1]);
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < e.length; j1++)
            {
                kcg kcg1 = e[j1];
                if (kcg1 != null)
                {
                    kwk1.b(9, kcg1);
                }
            }

        }
        if (g != null)
        {
            kwk1.a(10, g);
        }
        super.writeTo(kwk1);
    }
}
