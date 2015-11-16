// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class dih extends dfy
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private long e;

    private dih(int j, long l, long l1)
    {
        super(dcn.e(j), l, l1);
        e = -1L;
    }

    public static dih b(int j)
    {
        dih dih2 = (dih)a.get(Integer.valueOf(j));
        dih dih1 = dih2;
        if (dih2 == null)
        {
            dih1 = new dih(j, g.a(g.nU, "babel_refresh_participants_lomark_seconds", 0x11940) * 1000, g.a(g.nU, "babel_refresh_participants_highmark_seconds", 0x15180) * 1000);
            a.putIfAbsent(Integer.valueOf(j), dih1);
            dih1 = (dih)a.get(Integer.valueOf(j));
        }
        return dih1;
    }

    public static dih c(int j)
    {
        return (dih)a.remove(Integer.valueOf(j));
    }

    public void a()
    {
        k();
        List list = (new aow(g.nU, super.b.a)).k();
        if (list.size() > 0)
        {
            a(((dmf) (new cwh(list, null, false, true))));
        }
    }

    protected void a(long l)
    {
        e = l;
        ((gqz)hlp.a(g.nU, gqz)).b(super.b.a).c("refresh_participants_time", e).d();
    }

    protected long i()
    {
        if (e == -1L)
        {
            e = ((gqz)hlp.a(g.nU, gqz)).a(super.b.a).a("refresh_participants_time", 0L);
        }
        return e;
    }

}
