// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class djr extends ain
{

    private static final boolean a = false;
    private static djr b;
    private static boolean c = false;

    private djr()
    {
    }

    public static djr c()
    {
        if (b == null)
        {
            b = new djr();
        }
        return b;
    }

    public static final boolean d()
    {
        return c;
    }

    protected void b()
    {
        if (a)
        {
            eev.b("Babel", "The last activity stopped, set recently active to false.");
        }
        c = false;
        int ai[] = dcn.f();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            djt.a(dcn.e(ai[i]), false);
        }

    }

    public void onActivityStarted(Activity activity)
    {
        boolean flag = false;
        super.onActivityStarted(activity);
        int i;
        if ((new ecy(activity, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.force_set_active")).a())
        {
            i = 1;
        } else
        if (!(new ecy(activity, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.block_set_active")).a() && !c && (activity instanceof djs) && !g.u(activity.getApplicationContext()))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            c = true;
            activity = dcn.f();
            int j = activity.length;
            for (i = ((flag) ? 1 : 0); i < j; i++)
            {
                aoa aoa = dcn.e(activity[i]);
                if (aoa != null)
                {
                    djt.a(aoa, true);
                    RealTimeChatService.c(aoa);
                }
            }

        }
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
