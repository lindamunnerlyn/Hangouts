// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

public final class les extends ldw
{

    private static final long serialVersionUID = 0xf105b3cbf0791080L;

    private les(lcw lcw1, ldd ldd1)
    {
        super(lcw1, ldd1);
    }

    private lcy a(lcy lcy1, HashMap hashmap)
    {
        if (lcy1 == null || !lcy1.c())
        {
            return lcy1;
        }
        if (hashmap.containsKey(lcy1))
        {
            return (lcy)hashmap.get(lcy1);
        } else
        {
            let let1 = new let(lcy1, a(), a(lcy1.d(), hashmap), a(lcy1.e(), hashmap), a(lcy1.f(), hashmap));
            hashmap.put(lcy1, let1);
            return let1;
        }
    }

    private ldh a(ldh ldh1, HashMap hashmap)
    {
        if (ldh1 == null || !ldh1.b())
        {
            return ldh1;
        }
        if (hashmap.containsKey(ldh1))
        {
            return (ldh)hashmap.get(ldh1);
        } else
        {
            leu leu1 = new leu(ldh1, a());
            hashmap.put(ldh1, leu1);
            return leu1;
        }
    }

    public static les a(lcw lcw1, ldd ldd1)
    {
        if (lcw1 == null)
        {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        lcw1 = lcw1.b();
        if (lcw1 == null)
        {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (ldd1 == null)
        {
            throw new IllegalArgumentException("DateTimeZone must not be null");
        } else
        {
            return new les(lcw1, ldd1);
        }
    }

    static boolean a(ldh ldh1)
    {
        return ldh1 != null && ldh1.d() < 0x2932e00L;
    }

    public lcw a(ldd ldd1)
    {
        ldd ldd2 = ldd1;
        if (ldd1 == null)
        {
            ldd2 = ldd.a();
        }
        if (ldd2 == super.b)
        {
            return this;
        }
        if (ldd2 == ldd.a)
        {
            return super.a;
        } else
        {
            return new les(super.a, ldd2);
        }
    }

    public ldd a()
    {
        return (ldd)super.b;
    }

    protected void a(ldx ldx1)
    {
        HashMap hashmap = new HashMap();
        ldx1.l = a(ldx1.l, hashmap);
        ldx1.k = a(ldx1.k, hashmap);
        ldx1.j = a(ldx1.j, hashmap);
        ldx1.i = a(ldx1.i, hashmap);
        ldx1.h = a(ldx1.h, hashmap);
        ldx1.g = a(ldx1.g, hashmap);
        ldx1.f = a(ldx1.f, hashmap);
        ldx1.e = a(ldx1.e, hashmap);
        ldx1.d = a(ldx1.d, hashmap);
        ldx1.c = a(ldx1.c, hashmap);
        ldx1.b = a(ldx1.b, hashmap);
        ldx1.a = a(ldx1.a, hashmap);
        ldx1.E = a(ldx1.E, hashmap);
        ldx1.F = a(ldx1.F, hashmap);
        ldx1.G = a(ldx1.G, hashmap);
        ldx1.H = a(ldx1.H, hashmap);
        ldx1.I = a(ldx1.I, hashmap);
        ldx1.x = a(ldx1.x, hashmap);
        ldx1.y = a(ldx1.y, hashmap);
        ldx1.z = a(ldx1.z, hashmap);
        ldx1.D = a(ldx1.D, hashmap);
        ldx1.A = a(ldx1.A, hashmap);
        ldx1.B = a(ldx1.B, hashmap);
        ldx1.C = a(ldx1.C, hashmap);
        ldx1.m = a(ldx1.m, hashmap);
        ldx1.n = a(ldx1.n, hashmap);
        ldx1.o = a(ldx1.o, hashmap);
        ldx1.p = a(ldx1.p, hashmap);
        ldx1.q = a(ldx1.q, hashmap);
        ldx1.r = a(ldx1.r, hashmap);
        ldx1.s = a(ldx1.s, hashmap);
        ldx1.u = a(ldx1.u, hashmap);
        ldx1.t = a(ldx1.t, hashmap);
        ldx1.v = a(ldx1.v, hashmap);
        ldx1.w = a(ldx1.w, hashmap);
    }

    public lcw b()
    {
        return super.a;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof les))
            {
                return false;
            }
            obj = (les)obj;
            if (!super.a.equals(((ldw) (obj)).a) || !a().equals(((les) (obj)).a()))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return 0x4fba5 + a().hashCode() * 11 + super.a.hashCode() * 7;
    }

    public String toString()
    {
        String s = String.valueOf(super.a);
        String s1 = a().b;
        return (new StringBuilder(String.valueOf(s).length() + 19 + String.valueOf(s1).length())).append("ZonedChronology[").append(s).append(", ").append(s1).append("]").toString();
    }
}
