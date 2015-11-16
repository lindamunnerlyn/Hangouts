// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class fdg extends fdj
{

    public byte a[];
    public String b;
    public double c;
    public float d;
    public long e;
    public int f;
    public int g;
    public boolean h;
    public fde i[];
    public fdf j[];
    public String k[];
    public long l[];
    public float m[];
    public long n;

    public fdg()
    {
        a = fdq.h;
        b = "";
        c = 0.0D;
        d = 0.0F;
        e = 0L;
        f = 0;
        g = 0;
        h = false;
        i = fde.b();
        j = fdf.b();
        k = fdq.f;
        l = fdq.b;
        m = fdq.c;
        n = 0L;
        o = null;
        p = -1;
    }

    protected int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (!Arrays.equals(a, fdq.h))
        {
            i1 = j1 + fdi.b(1, a);
        }
        j1 = i1;
        if (!b.equals(""))
        {
            j1 = i1 + fdi.b(2, b);
        }
        i1 = j1;
        if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
        {
            i1 = j1 + (fdi.c(3) + 8);
        }
        j1 = i1;
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            j1 = i1 + (fdi.c(4) + 4);
        }
        int k1 = j1;
        if (e != 0L)
        {
            k1 = j1 + fdi.b(5, e);
        }
        i1 = k1;
        if (f != 0)
        {
            i1 = k1 + fdi.b(6, f);
        }
        j1 = i1;
        if (g != 0)
        {
            j1 = g;
            int l1 = fdi.c(7);
            j1 = i1 + (fdi.e(fdi.f(j1)) + l1);
        }
        i1 = j1;
        if (h)
        {
            i1 = j1 + (fdi.c(8) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    fde fde1 = i[j1];
                    int i2 = i1;
                    if (fde1 != null)
                    {
                        i2 = i1 + fdi.b(9, fde1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1;
            if (j.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < j.length;)
                {
                    fdf fdf1 = j[j1];
                    int j2 = i1;
                    if (fdf1 != null)
                    {
                        j2 = i1 + fdi.b(10, fdf1);
                    }
                    j1++;
                    i1 = j2;
                }

            }
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                j1 = 0;
                int k2 = 0;
                int i3;
                int j3;
                for (i3 = 0; j1 < k.length; i3 = j3)
                {
                    String s = k[j1];
                    int k3 = k2;
                    j3 = i3;
                    if (s != null)
                    {
                        j3 = i3 + 1;
                        k3 = k2 + fdi.a(s);
                    }
                    j1++;
                    k2 = k3;
                }

                j1 = i1 + k2 + i3 * 1;
            }
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1;
            if (l.length > 0)
            {
                int l2 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < l.length; i1++)
                {
                    l2 += fdi.b(l[i1]);
                }

                i1 = j1 + l2 + l.length * 1;
            }
        }
        j1 = i1;
        if (n != 0L)
        {
            j1 = i1 + fdi.b(13, n);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1;
            if (m.length > 0)
            {
                i1 = j1 + m.length * 4 + m.length * 1;
            }
        }
        return i1;
    }

    public fdo a(fdh fdh1)
    {
        do
        {
            int i1 = fdh1.a();
            switch (i1)
            {
            default:
                if (a(fdh1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = fdh1.h();
                break;

            case 18: // '\022'
                b = fdh1.g();
                break;

            case 25: // '\031'
                c = fdh1.b();
                break;

            case 37: // '%'
                d = fdh1.c();
                break;

            case 40: // '('
                e = fdh1.d();
                break;

            case 48: // '0'
                f = fdh1.e();
                break;

            case 56: // '8'
                g = fdh1.i();
                break;

            case 64: // '@'
                h = fdh1.f();
                break;

            case 74: // 'J'
                int i3 = fdq.a(fdh1, 74);
                fde afde[];
                int j1;
                if (i == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = i.length;
                }
                afde = new fde[i3 + j1];
                i3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(i, 0, afde, 0, j1);
                    i3 = j1;
                }
                for (; i3 < afde.length - 1; i3++)
                {
                    afde[i3] = new fde();
                    fdh1.a(afde[i3]);
                    fdh1.a();
                }

                afde[i3] = new fde();
                fdh1.a(afde[i3]);
                i = afde;
                break;

            case 82: // 'R'
                int j3 = fdq.a(fdh1, 82);
                fdf afdf[];
                int k1;
                if (j == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = j.length;
                }
                afdf = new fdf[j3 + k1];
                j3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(j, 0, afdf, 0, k1);
                    j3 = k1;
                }
                for (; j3 < afdf.length - 1; j3++)
                {
                    afdf[j3] = new fdf();
                    fdh1.a(afdf[j3]);
                    fdh1.a();
                }

                afdf[j3] = new fdf();
                fdh1.a(afdf[j3]);
                j = afdf;
                break;

            case 90: // 'Z'
                int k3 = fdq.a(fdh1, 90);
                String as[];
                int l1;
                if (k == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = k.length;
                }
                as = new String[k3 + l1];
                k3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(k, 0, as, 0, l1);
                    k3 = l1;
                }
                for (; k3 < as.length - 1; k3++)
                {
                    as[k3] = fdh1.g();
                    fdh1.a();
                }

                as[k3] = fdh1.g();
                k = as;
                break;

            case 96: // '`'
                int l3 = fdq.a(fdh1, 96);
                long al[];
                int i2;
                if (l == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = l.length;
                }
                al = new long[l3 + i2];
                l3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(l, 0, al, 0, i2);
                    l3 = i2;
                }
                for (; l3 < al.length - 1; l3++)
                {
                    al[l3] = fdh1.d();
                    fdh1.a();
                }

                al[l3] = fdh1.d();
                l = al;
                break;

            case 98: // 'b'
                int l4 = fdh1.c(fdh1.k());
                int j2 = fdh1.m();
                int i4;
                for (i4 = 0; fdh1.l() > 0; i4++)
                {
                    fdh1.d();
                }

                fdh1.e(j2);
                long al1[];
                if (l == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = l.length;
                }
                al1 = new long[i4 + j2];
                i4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(l, 0, al1, 0, j2);
                    i4 = j2;
                }
                for (; i4 < al1.length; i4++)
                {
                    al1[i4] = fdh1.d();
                }

                l = al1;
                fdh1.d(l4);
                break;

            case 104: // 'h'
                n = fdh1.d();
                break;

            case 117: // 'u'
                int j4 = fdq.a(fdh1, 117);
                float af[];
                int k2;
                if (m == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = m.length;
                }
                af = new float[j4 + k2];
                j4 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(m, 0, af, 0, k2);
                    j4 = k2;
                }
                for (; j4 < af.length - 1; j4++)
                {
                    af[j4] = fdh1.c();
                    fdh1.a();
                }

                af[j4] = fdh1.c();
                m = af;
                break;

            case 114: // 'r'
                int l2 = fdh1.k();
                int i5 = fdh1.c(l2);
                int k4 = l2 / 4;
                float af1[];
                if (m == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = m.length;
                }
                af1 = new float[k4 + l2];
                k4 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(m, 0, af1, 0, l2);
                    k4 = l2;
                }
                for (; k4 < af1.length; k4++)
                {
                    af1[k4] = fdh1.c();
                }

                m = af1;
                fdh1.d(i5);
                break;
            }
        } while (true);
    }

    public void a(fdi fdi1)
    {
        boolean flag = false;
        if (!Arrays.equals(a, fdq.h))
        {
            fdi1.a(1, a);
        }
        if (!b.equals(""))
        {
            fdi1.a(2, b);
        }
        if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
        {
            fdi1.a(c);
        }
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            fdi1.a(4, d);
        }
        if (e != 0L)
        {
            fdi1.a(5, e);
        }
        if (f != 0)
        {
            fdi1.a(6, f);
        }
        if (g != 0)
        {
            fdi1.a(g);
        }
        if (h)
        {
            fdi1.a(8, h);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                fde fde1 = i[i1];
                if (fde1 != null)
                {
                    fdi1.a(9, fde1);
                }
            }

        }
        if (j != null && j.length > 0)
        {
            for (int j1 = 0; j1 < j.length; j1++)
            {
                fdf fdf1 = j[j1];
                if (fdf1 != null)
                {
                    fdi1.a(10, fdf1);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int k1 = 0; k1 < k.length; k1++)
            {
                String s = k[k1];
                if (s != null)
                {
                    fdi1.a(11, s);
                }
            }

        }
        if (l != null && l.length > 0)
        {
            for (int l1 = 0; l1 < l.length; l1++)
            {
                fdi1.a(12, l[l1]);
            }

        }
        if (n != 0L)
        {
            fdi1.a(13, n);
        }
        if (m != null && m.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < m.length; i2++)
            {
                fdi1.a(14, m[i2]);
            }

        }
        super.a(fdi1);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof fdg))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (fdg)obj;
        flag = flag1;
        if (!Arrays.equals(a, ((fdg) (obj)).a))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((fdg) (obj)).b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (Double.doubleToLongBits(c) == Double.doubleToLongBits(((fdg) (obj)).c))
        {
            flag = flag1;
            if (Float.floatToIntBits(d) == Float.floatToIntBits(((fdg) (obj)).d))
            {
                flag = flag1;
                if (e == ((fdg) (obj)).e)
                {
                    flag = flag1;
                    if (f == ((fdg) (obj)).f)
                    {
                        flag = flag1;
                        if (g == ((fdg) (obj)).g)
                        {
                            flag = flag1;
                            if (h == ((fdg) (obj)).h)
                            {
                                flag = flag1;
                                if (fdm.a(i, ((fdg) (obj)).i))
                                {
                                    flag = flag1;
                                    if (fdm.a(j, ((fdg) (obj)).j))
                                    {
                                        flag = flag1;
                                        if (fdm.a(k, ((fdg) (obj)).k))
                                        {
                                            flag = flag1;
                                            if (fdm.a(l, ((fdg) (obj)).l))
                                            {
                                                flag = flag1;
                                                if (fdm.a(m, ((fdg) (obj)).m))
                                                {
                                                    flag = flag1;
                                                    if (n == ((fdg) (obj)).n)
                                                    {
                                                        return a(((fdj) (obj)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!b.equals(((fdg) (obj)).b))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j1 = Arrays.hashCode(a);
        int i1;
        char c1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        long l2;
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.hashCode();
        }
        l2 = Double.doubleToLongBits(c);
        k1 = (int)(l2 ^ l2 >>> 32);
        l1 = Float.floatToIntBits(d);
        i2 = (int)(e ^ e >>> 32);
        j2 = f;
        k2 = g;
        if (h)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return (((((((c1 + ((((((i1 + (j1 + 527) * 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + fdm.a(i)) * 31 + fdm.a(j)) * 31 + fdm.a(k)) * 31 + fdm.a(l)) * 31 + fdm.a(m)) * 31 + (int)(n ^ n >>> 32)) * 31 + c();
    }
}
