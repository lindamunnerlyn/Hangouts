// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class aky extends ea
{

    private final Context f;
    private final int g;
    private final boolean h = false;

    public aky(Context context)
    {
        super(context);
        f = context.getApplicationContext();
        g = ((gmo)hgx.a(context, gmo)).a();
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
                ajo ajo1 = ajq.a(f, g);
                if (h && ajo1 != null)
                {
                    long l = System.currentTimeMillis();
                    long l1 = ((alw)hgx.a(f, alw)).a("babel_dialer_callerid_dialer_redisplay_interval_ms", ajv.b);
                    if (Long.valueOf(g.a(Long.valueOf(ajo1.b()), 0L)) != null && l - ajo1.b() < l1)
                    {
                        break label1;
                    }
                    ajo1.a(l);
                }
                return ajo1;
            }
            return null;
        }
        return null;
    }
}
