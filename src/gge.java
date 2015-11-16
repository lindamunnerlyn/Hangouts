// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;

public final class gge
{

    private final Context a;
    private final ggf b = new ggf(this);

    public gge(Context context)
    {
        a = context;
        IntentFilter intentfilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        context.registerReceiver(b, intentfilter);
    }

    void a()
    {
        a.unregisterReceiver(b);
    }

    public void a(com.google.android.libraries.hangouts.video.Stats.GlobalStats globalstats)
    {
        globalstats.b(gfi.b());
        globalstats.c(gfi.d() / 1000);
        globalstats.d(gfi.e());
        globalstats.a(b.a());
        globalstats.e(b.b());
    }
}
