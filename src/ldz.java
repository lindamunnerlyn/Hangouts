// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class ldz extends ldw
{

    private static final lcy A;
    private static final lcy B = new lea();
    private static final ldh k;
    private static final ldh l;
    private static final ldh m;
    private static final ldh n;
    private static final ldh o;
    private static final ldh p;
    private static final ldh q = new lfh(ldi.g(), 0x240c8400L);
    private static final lcy r;
    private static final lcy s;
    private static final long serialVersionUID = 0x72f3ed8da0b42f1fL;
    private static final lcy t;
    private static final lcy u;
    private static final lcy v;
    private static final lcy w;
    private static final lcy x;
    private static final lcy y;
    private static final lcy z;
    private final transient leb C[] = new leb[1024];
    private final int D;

    ldz(lcw lcw1, Object obj, int j)
    {
        super(lcw1, obj);
        if (j <= 0 || j > 7)
        {
            throw new IllegalArgumentException((new StringBuilder(43)).append("Invalid min days in first week: ").append(j).toString());
        } else
        {
            D = j;
            return;
        }
    }

    static ldh T()
    {
        return o;
    }

    static ldh U()
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

    public ldd a()
    {
        lcw lcw1 = super.a;
        if (lcw1 != null)
        {
            return lcw1.a();
        } else
        {
            return ldd.a;
        }
    }

    protected void a(ldx ldx1)
    {
        ldx1.a = k;
        ldx1.b = l;
        ldx1.c = m;
        ldx1.d = n;
        ldx1.e = o;
        ldx1.f = p;
        ldx1.g = q;
        ldx1.m = r;
        ldx1.n = s;
        ldx1.o = t;
        ldx1.p = u;
        ldx1.q = v;
        ldx1.r = w;
        ldx1.s = x;
        ldx1.u = y;
        ldx1.t = z;
        ldx1.v = A;
        ldx1.w = B;
        ldx1.E = new lei(this);
        ldx1.F = new len(ldx1.E, this);
        ldx1.H = new lfa(new lfe(ldx1.F), lcz.v());
        ldx1.G = new lfe(new lfi((lfa)ldx1.H), lcz.u());
        ldx1.I = new lek(this);
        ldx1.x = new lej(this, ldx1.f);
        ldx1.y = new lec(this, ldx1.f);
        ldx1.z = new led(this, ldx1.f);
        ldx1.D = new lem(this);
        ldx1.B = new leh(this);
        ldx1.A = new leg(this, ldx1.g);
        ldx1.C = new lfe(new lfi(ldx1.B, lcz.q()), lcz.q());
        ldx1.j = ldx1.E.d();
        ldx1.k = ldx1.H.d();
        ldx1.i = ldx1.D.d();
        ldx1.h = ldx1.B.d();
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
        leb leb1;
label0:
        {
            leb leb2 = C[j & 0x3ff];
            if (leb2 != null)
            {
                leb1 = leb2;
                if (leb2.a == j)
                {
                    break label0;
                }
            }
            leb1 = new leb(j, f(j));
            C[j & 0x3ff] = leb1;
        }
        return leb1.b;
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
                if (L() != ((ldz) (obj = (ldz)obj)).L() || !a().equals(((ldz) (obj)).a()))
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
            stringbuilder.append(((ldd) (obj)).b);
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
        k = lfd.a;
        l = new lfh(ldi.b(), 1000L);
        m = new lfh(ldi.c(), 60000L);
        n = new lfh(ldi.d(), 0x36ee80L);
        o = new lfh(ldi.e(), 0x2932e00L);
        p = new lfh(ldi.f(), 0x5265c00L);
        r = new lff(lcz.a(), k, l);
        s = new lff(lcz.b(), k, p);
        t = new lff(lcz.c(), l, m);
        u = new lff(lcz.d(), l, p);
        v = new lff(lcz.e(), m, n);
        w = new lff(lcz.f(), m, p);
        x = new lff(lcz.g(), n, p);
        y = new lff(lcz.i(), n, o);
        z = new lfm(x, lcz.h());
        A = new lfm(y, lcz.j());
    }
}
