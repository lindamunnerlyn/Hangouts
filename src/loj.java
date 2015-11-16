// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class loj extends log
{

    private static final lni A;
    private static final lni B = new lok();
    private static final lnr k;
    private static final lnr l;
    private static final lnr m;
    private static final lnr n;
    private static final lnr o;
    private static final lnr p;
    private static final lnr q = new lpr(lns.g(), 0x240c8400L);
    private static final lni r;
    private static final lni s;
    private static final long serialVersionUID = 0x72f3ed8da0b42f1fL;
    private static final lni t;
    private static final lni u;
    private static final lni v;
    private static final lni w;
    private static final lni x;
    private static final lni y;
    private static final lni z;
    private final transient lol C[] = new lol[1024];
    private final int D;

    loj(lng lng1, Object obj, int j)
    {
        super(lng1, obj);
        if (j <= 0 || j > 7)
        {
            throw new IllegalArgumentException((new StringBuilder(43)).append("Invalid min days in first week: ").append(j).toString());
        } else
        {
            D = j;
            return;
        }
    }

    static lnr T()
    {
        return o;
    }

    static lnr U()
    {
        return p;
    }

    public int L()
    {
        return D;
    }

    int M()
    {
        return 366;
    }

    int N()
    {
        return 31;
    }

    abstract int O();

    abstract int P();

    int Q()
    {
        return 12;
    }

    abstract long R();

    abstract long S();

    int a(int j)
    {
        return !e(j) ? 365 : 366;
    }

    int a(long l1)
    {
        long l4 = 0x757b12c00L;
        long l5 = (l1 >> 1) + 0x1c4536cce9c0L;
        long l2 = l5;
        if (l5 < 0L)
        {
            l2 = (l5 - 0x3ac786fe0L) + 1L;
        }
        int i1 = (int)(l2 / 0x3ac786fe0L);
        l5 = d(i1);
        l2 = l1 - l5;
        int j;
        if (l2 < 0L)
        {
            j = i1 - 1;
        } else
        {
            j = i1;
            if (l2 >= 0x757b12c00L)
            {
                long l3 = l4;
                if (e(i1))
                {
                    l3 = 0x75cd78800L;
                }
                j = i1;
                if (l3 + l5 <= l1)
                {
                    return i1 + 1;
                }
            }
        }
        return j;
    }

    abstract int a(long l1, int j);

    int a(long l1, int j, int i1)
    {
        return (int)((l1 - (d(j) + c(j, i1))) / 0x5265c00L) + 1;
    }

    long a(int j, int i1)
    {
        return d(j) + c(j, i1);
    }

    long a(int j, int i1, int j1)
    {
        return d(j) + c(j, i1) + (long)(j1 - 1) * 0x5265c00L;
    }

    public lnn a()
    {
        lng lng1 = super.a;
        if (lng1 != null)
        {
            return lng1.a();
        } else
        {
            return lnn.a;
        }
    }

    protected void a(loh loh1)
    {
        loh1.a = k;
        loh1.b = l;
        loh1.c = m;
        loh1.d = n;
        loh1.e = o;
        loh1.f = p;
        loh1.g = q;
        loh1.m = r;
        loh1.n = s;
        loh1.o = t;
        loh1.p = u;
        loh1.q = v;
        loh1.r = w;
        loh1.s = x;
        loh1.u = y;
        loh1.t = z;
        loh1.v = A;
        loh1.w = B;
        loh1.E = new los(this);
        loh1.F = new lox(loh1.E, this);
        loh1.H = new lpk(new lpo(loh1.F), lnj.v());
        loh1.G = new lpo(new lps((lpk)loh1.H), lnj.u());
        loh1.I = new lou(this);
        loh1.x = new lot(this, loh1.f);
        loh1.y = new lom(this, loh1.f);
        loh1.z = new lon(this, loh1.f);
        loh1.D = new low(this);
        loh1.B = new lor(this);
        loh1.A = new loq(this, loh1.g);
        loh1.C = new lpo(new lps(loh1.B, lnj.q()), lnj.q());
        loh1.j = loh1.E.d();
        loh1.k = loh1.H.d();
        loh1.i = loh1.D.d();
        loh1.h = loh1.B.d();
    }

    int b(int j)
    {
        long l1 = c(j);
        return (int)((c(j + 1) - l1) / 0x240c8400L);
    }

    abstract int b(int j, int i1);

    int b(long l1)
    {
        return a(l1, a(l1));
    }

    int b(long l1, int j)
    {
        return a(l1, j, a(l1, j));
    }

    int c(long l1)
    {
        int j = a(l1);
        return a(l1, j, a(l1, j));
    }

    int c(long l1, int j)
    {
        return (int)((l1 - d(j)) / 0x5265c00L) + 1;
    }

    long c(int j)
    {
        long l1 = d(j);
        j = g(l1);
        if (j > 8 - D)
        {
            return l1 + (long)(8 - j) * 0x5265c00L;
        } else
        {
            return l1 - (long)(j - 1) * 0x5265c00L;
        }
    }

    abstract long c(int j, int i1);

    int d(long l1)
    {
        return c(l1, a(l1));
    }

    int d(long l1, int j)
    {
        long l2 = c(j);
        if (l1 < l2)
        {
            return b(j - 1);
        }
        if (l1 >= c(j + 1))
        {
            return 1;
        } else
        {
            return (int)((l1 - l2) / 0x240c8400L) + 1;
        }
    }

    long d(int j)
    {
        lol lol1;
label0:
        {
            lol lol2 = C[j & 0x3ff];
            if (lol2 != null)
            {
                lol1 = lol2;
                if (lol2.a == j)
                {
                    break label0;
                }
            }
            lol1 = new lol(j, f(j));
            C[j & 0x3ff] = lol1;
        }
        return lol1.b;
    }

    int e(long l1)
    {
        int j = a(l1);
        int i1 = d(l1, j);
        if (i1 == 1)
        {
            j = a(0x240c8400L + l1);
        } else
        if (i1 > 51)
        {
            return a(l1 - 0x48190800L);
        }
        return j;
    }

    int e(long l1, int j)
    {
        return i(l1);
    }

    abstract boolean e(int j);

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj != null && getClass() == obj.getClass())
            {
                if (L() != ((loj) (obj = (loj)obj)).L() || !a().equals(((loj) (obj)).a()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    int f(long l1)
    {
        return d(l1, a(l1));
    }

    abstract long f(int j);

    abstract long f(long l1, int j);

    int g(long l1)
    {
        if (l1 >= 0L)
        {
            l1 /= 0x5265c00L;
        } else
        {
            long l2 = (l1 - 0x5265bffL) / 0x5265c00L;
            l1 = l2;
            if (l2 < -3L)
            {
                return (int)((l2 + 4L) % 7L) + 7;
            }
        }
        return (int)((l1 + 3L) % 7L) + 1;
    }

    int h(long l1)
    {
        if (l1 >= 0L)
        {
            return (int)(l1 % 0x5265c00L);
        } else
        {
            return 0x5265bff + (int)((1L + l1) % 0x5265c00L);
        }
    }

    public int hashCode()
    {
        return getClass().getName().hashCode() * 11 + a().hashCode() + L();
    }

    int i(long l1)
    {
        int j = a(l1);
        return b(j, a(l1, j));
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(60);
        String s1 = getClass().getName();
        int j = s1.lastIndexOf('.');
        Object obj = s1;
        if (j >= 0)
        {
            obj = s1.substring(j + 1);
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append('[');
        obj = a();
        if (obj != null)
        {
            stringbuilder.append(((lnn) (obj)).b);
        }
        if (L() != 4)
        {
            stringbuilder.append(",mdfw=");
            stringbuilder.append(L());
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    static 
    {
        k = lpn.a;
        l = new lpr(lns.b(), 1000L);
        m = new lpr(lns.c(), 60000L);
        n = new lpr(lns.d(), 0x36ee80L);
        o = new lpr(lns.e(), 0x2932e00L);
        p = new lpr(lns.f(), 0x5265c00L);
        r = new lpp(lnj.a(), k, l);
        s = new lpp(lnj.b(), k, p);
        t = new lpp(lnj.c(), l, m);
        u = new lpp(lnj.d(), l, p);
        v = new lpp(lnj.e(), m, n);
        w = new lpp(lnj.f(), m, p);
        x = new lpp(lnj.g(), n, p);
        y = new lpp(lnj.i(), n, o);
        z = new lpw(x, lnj.h());
        A = new lpw(y, lnj.j());
    }
}
