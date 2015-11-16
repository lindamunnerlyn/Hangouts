// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;

public final class dkf extends dfy
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();

    private dkf(aoa aoa1, long l, long l1)
    {
        super(aoa1, l, l1);
    }

    public static dkf a(aoa aoa1)
    {
        String s = aoa1.a();
        dkf dkf2 = (dkf)a.get(s);
        dkf dkf1 = dkf2;
        if (dkf2 == null)
        {
            aoa1 = new dkf(aoa1, g.a(g.nU, "babel_sms_background_sync_lowmark_millis", 0x5265c00L), g.a(g.nU, "babel_sms_background_sync_highmark_millis", 0xa4cb800L));
            a.putIfAbsent(s, aoa1);
            dkf1 = (dkf)a.get(s);
        }
        return dkf1;
    }

    public void a()
    {
        if (dcn.j() && super.b.b != null && super.b.b.q())
        {
            dur.c(super.b.b);
        }
    }

    protected void a(long l)
    {
    }

    protected long i()
    {
        long l = -1L;
        if (super.b.b != null)
        {
            l = aoc.a(g.nU, super.b.a, "sms_last_full_sync_time_millis", -1L);
        }
        return l;
    }

}
