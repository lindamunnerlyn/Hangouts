// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dhs extends AsyncTask
{

    final RealTimeChatService a;

    public dhs(RealTimeChatService realtimechatservice)
    {
        a = realtimechatservice;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        long l = g.a(g.nU, "babel_rtcs_watchdog_warning", 0L);
        long l1 = g.a(g.nU, "babel_rtcs_watchdog_error", 0L);
        if (l > 0L || l1 > 0L)
        {
            RealTimeChatService.a(a, new dht(this, "RTCS-watchdog", l, l1));
        }
        return null;
    }
}
