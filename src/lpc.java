// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

public final class lpc extends log
{

    private static final long serialVersionUID = 0xf105b3cbf0791080L;

    private lpc(lng lng1, lnn lnn1)
    {
        super(lng1, lnn1);
    }

    private lni a(lni lni1, HashMap hashmap)
    {
        if (lni1 == null || !lni1.c())
        {
            return lni1;
        }
        if (hashmap.containsKey(lni1))
        {
            return (lni)hashmap.get(lni1);
        } else
        {
            lpd lpd1 = new lpd(lni1, a(), a(lni1.d(), hashmap), a(lni1.e(), hashmap), a(lni1.f(), hashmap));
            hashmap.put(lni1, lpd1);
            return lpd1;
        }
    }

    private lnr a(lnr lnr1, HashMap hashmap)
    {
        if (lnr1 == null || !lnr1.b())
        {
            return lnr1;
        }
        if (hashmap.containsKey(lnr1))
        {
            return (lnr)hashmap.get(lnr1);
        } else
        {
            lpe lpe1 = new lpe(lnr1, a());
            hashmap.put(lnr1, lpe1);
            return lpe1;
        }
    }

    public static lpc a(lng lng1, lnn lnn1)
    {
        if (lng1 == null)
        {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        lng1 = lng1.b();
        if (lng1 == null)
        {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (lnn1 == null)
        {
            throw new IllegalArgumentException("DateTimeZone must not be null");
        } else
        {
            return new lpc(lng1, lnn1);
        }
    }

    static boolean a(lnr lnr1)
    {
        return lnr1 != null && lnr1.d() < 0x2932e00L;
    }

    public lng a(lnn lnn1)
    {
        lnn lnn2 = lnn1;
        if (lnn1 == null)
        {
            lnn2 = lnn.a();
        }
        if (lnn2 == super.b)
        {
            return this;
        }
        if (lnn2 == lnn.a)
        {
            return super.a;
        } else
        {
            return new lpc(super.a, lnn2);
        }
    }

    public lnn a()
    {
        return (lnn)super.b;
    }

    protected void a(loh loh1)
    {
        HashMap hashmap = new HashMap();
        loh1.l = a(loh1.l, hashmap);
        loh1.k = a(loh1.k, hashmap);
        loh1.j = a(loh1.j, hashmap);
        loh1.i = a(loh1.i, hashmap);
        loh1.h = a(loh1.h, hashmap);
        loh1.g = a(loh1.g, hashmap);
        loh1.f = a(loh1.f, hashmap);
        loh1.e = a(loh1.e, hashmap);
        loh1.d = a(loh1.d, hashmap);
        loh1.c = a(loh1.c, hashmap);
        loh1.b = a(loh1.b, hashmap);
        loh1.a = a(loh1.a, hashmap);
        loh1.E = a(loh1.E, hashmap);
        loh1.F = a(loh1.F, hashmap);
        loh1.G = a(loh1.G, hashmap);
        loh1.H = a(loh1.H, hashmap);
        loh1.I = a(loh1.I, hashmap);
        loh1.x = a(loh1.x, hashmap);
        loh1.y = a(loh1.y, hashmap);
        loh1.z = a(loh1.z, hashmap);
        loh1.D = a(loh1.D, hashmap);
        loh1.A = a(loh1.A, hashmap);
        loh1.B = a(loh1.B, hashmap);
        loh1.C = a(loh1.C, hashmap);
        loh1.m = a(loh1.m, hashmap);
        loh1.n = a(loh1.n, hashmap);
        loh1.o = a(loh1.o, hashmap);
        loh1.p = a(loh1.p, hashmap);
        loh1.q = a(loh1.q, hashmap);
        loh1.r = a(loh1.r, hashmap);
        loh1.s = a(loh1.s, hashmap);
        loh1.u = a(loh1.u, hashmap);
        loh1.t = a(loh1.t, hashmap);
        loh1.v = a(loh1.v, hashmap);
        loh1.w = a(loh1.w, hashmap);
    }

    public lng b()
    {
        return super.a;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof lpc))
            {
                return false;
            }
            obj = (lpc)obj;
            if (!super.a.equals(((log) (obj)).a) || !a().equals(((lpc) (obj)).a()))
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
        String s1 = String.valueOf(a().b);
        return (new StringBuilder(String.valueOf(s).length() + 19 + String.valueOf(s1).length())).append("ZonedChronology[").append(s).append(", ").append(s1).append("]").toString();
    }
}
