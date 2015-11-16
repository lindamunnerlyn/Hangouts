// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class akv extends ea
{

    private final Context f;
    private final int g;
    private final boolean h = false;

    public akv(Context context)
    {
        super(context);
        f = context.getApplicationContext();
        g = ((gqu)hlp.a(context, gqu)).a();
    }

    public Object d()
    {
label0:
        {
label1:
            {
                if (!g.a(f, g))
                {
                    break label0;
                }
                ajl ajl1 = ajn.a(f, g);
                if (h && ajl1 != null)
                {
                    long l = System.currentTimeMillis();
                    long l1 = ((amo)hlp.a(f, amo)).a("babel_dialer_callerid_dialer_redisplay_interval_ms", ajs.b);
                    if (Long.valueOf(g.a(Long.valueOf(ajl1.b()), 0L)) != null && l - ajl1.b() < l1)
                    {
                        break label1;
                    }
                    ajl1.a(l);
                }
                return ajl1;
            }
            return null;
        }
        return null;
    }
}
