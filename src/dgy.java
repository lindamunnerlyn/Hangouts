// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class dgy extends dep
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private long d;

    private dgy(int j, long l, long l1)
    {
        super(dbf.e(j), l, l1);
        d = -1L;
    }

    public static dgy b(int j)
    {
        dgy dgy2 = (dgy)a.get(Integer.valueOf(j));
        dgy dgy1 = dgy2;
        if (dgy2 == null)
        {
            dgy1 = new dgy(j, g.a(g.nS, "babel_refresh_participants_lomark_seconds", 0x11940) * 1000, g.a(g.nS, "babel_refresh_participants_highmark_seconds", 0x15180) * 1000);
            a.putIfAbsent(Integer.valueOf(j), dgy1);
            dgy1 = (dgy)a.get(Integer.valueOf(j));
        }
        return dgy1;
    }

    public static dgy c(int j)
    {
        return (dgy)a.remove(Integer.valueOf(j));
    }

    public void a()
    {
        c.c().clear();
        Object obj = (new aoe(g.nS, b.h())).k();
        if (((List) (obj)).size() > 0)
        {
            obj = new cud(((List) (obj)), null, false, true);
            c.a(((dko) (obj)));
        }
    }

    protected void a(long l)
    {
        d = l;
        ((gms)hgx.a(g.nS, gms)).b(b.h()).c("refresh_participants_time", d).d();
    }

    protected long i()
    {
        if (d == -1L)
        {
            d = ((gms)hgx.a(g.nS, gms)).a(b.h()).a("refresh_participants_time", 0L);
        }
        return d;
    }

}
