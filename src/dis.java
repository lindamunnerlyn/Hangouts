// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;

public final class dis extends dep
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();

    private dis(ani ani1, long l, long l1)
    {
        super(ani1, l, l1);
    }

    public static dis a(ani ani1)
    {
        String s = ani1.a();
        dis dis2 = (dis)a.get(s);
        dis dis1 = dis2;
        if (dis2 == null)
        {
            ani1 = new dis(ani1, g.a(g.nS, "babel_sms_background_sync_lowmark_millis", 0x5265c00L), g.a(g.nS, "babel_sms_background_sync_highmark_millis", 0xa4cb800L));
            a.putIfAbsent(s, ani1);
            dis1 = (dis)a.get(s);
        }
        return dis1;
    }

    public void a()
    {
        if (dbf.j() && b != null && b.s())
        {
            dry.c(b);
        }
    }

    protected void a(long l)
    {
    }

    protected long i()
    {
        long l = -1L;
        if (b != null)
        {
            l = ank.a(g.nS, b.h(), "sms_last_full_sync_time_millis", -1L);
        }
        return l;
    }

}
