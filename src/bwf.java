// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bwf
{

    public bwf()
    {
    }

    public gog a(Context context)
    {
        boolean flag = g.a(context, "babel_healthcheck_memory_enabled", false);
        eev.e("Babel_Prime", (new StringBuilder(21)).append("isMemoryEnabled=").append(flag).toString());
        return new bwg(this, flag);
    }

    public goh b(Context context)
    {
        boolean flag = g.a(context, "babel_healthcheck_timer_enabled", false);
        eev.e("Babel_Prime", (new StringBuilder(20)).append("isTimerEnabled=").append(flag).toString());
        return new bwh(this, flag);
    }
}
