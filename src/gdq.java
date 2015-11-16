// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;

public final class gdq
{

    private final Context a;
    private final gdr b = new gdr(this);

    public gdq(Context context)
    {
        a = context;
        context = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        a.registerReceiver(b, context);
    }

    void a()
    {
        a.unregisterReceiver(b);
    }

    public void a(com.google.android.libraries.hangouts.video.Stats.GlobalStats globalstats)
    {
        globalstats.b(gkj.b());
        globalstats.c(gkj.d() / 1000);
        globalstats.d(gkj.e());
        globalstats.a(b.a());
        globalstats.e(b.b());
    }
}
