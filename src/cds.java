// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.NetworkConnectionCheckingService;

class cds
    implements android.app.Application.ActivityLifecycleCallbacks, cdr
{

    private final Context a;
    private volatile cdq b;

    public cds(Context context)
    {
        b = cdq.a;
        a = context;
    }

    public cdq a()
    {
        if (cdq.a == b)
        {
            a(a, true);
        }
        return b;
    }

    public void a(Context context, boolean flag)
    {
        Intent intent = new Intent(context, com/google/android/apps/hangouts/service/NetworkConnectionCheckingService);
        if (flag)
        {
            intent.putExtra("update_type", "initialize_connection_state");
        } else
        {
            intent.putExtra("update_type", "update_connection_state");
        }
        context.startService(intent);
    }

    public void a(cdq cdq1)
    {
        if (cdq1 != b)
        {
            String s = String.valueOf(b);
            String s1 = String.valueOf(cdq1);
            eev.e("Babel", (new StringBuilder(String.valueOf(s).length() + 34 + String.valueOf(s1).length())).append("connection state changed from ").append(s).append(" to ").append(s1).toString());
            b = cdq1;
            if (((amo)hlp.a(a, amo)).a("babel_network_change_notification", false))
            {
                RealTimeChatService.h();
            }
        }
    }

    public void a(boolean flag)
    {
        if (b.a() == flag)
        {
            return;
        } else
        {
            Intent intent = new Intent(a, com/google/android/apps/hangouts/service/NetworkConnectionCheckingService);
            intent.putExtra("update_type", "verify_connection_state");
            intent.putExtra("expected_connectivity", flag);
            a.startService(intent);
            return;
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
        activity = activity.getApplicationContext();
        if (a() == cdq.c)
        {
            a(activity, false);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
