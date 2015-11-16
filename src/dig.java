// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dig extends aiu
{

    private static final boolean a = false;
    private static dig b;
    private static boolean c = false;

    private dig()
    {
    }

    public static dig c()
    {
        if (b == null)
        {
            b = new dig();
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
            ebw.b("Babel", "The last activity stopped, set recently active to false.");
        }
        c = false;
        if (g.a(g.nS, "babel_enable_last_seen_r2", true))
        {
            int ai[] = dbf.f();
            int j = ai.length;
            for (int i = 0; i < j; i++)
            {
                dii.a(dbf.e(ai[i]), false);
            }

        }
    }

    public void onActivityStarted(Activity activity)
    {
        boolean flag = false;
        super.onActivityStarted(activity);
        int i;
        if ((new dzu(activity, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.force_set_active")).a())
        {
            i = 1;
        } else
        if (!(new dzu(activity, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.block_set_active")).a() && !c && g.a(g.nS, "babel_enable_last_seen_r2", true) && (activity instanceof dih) && !g.u(activity.getApplicationContext()))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            c = true;
            activity = dbf.f();
            int j = activity.length;
            for (i = ((flag) ? 1 : 0); i < j; i++)
            {
                ani ani = dbf.e(activity[i]);
                if (ani != null)
                {
                    dii.a(ani, true);
                    RealTimeChatService.c(ani);
                }
            }

        }
    }

    static 
    {
        hik hik = ebw.n;
    }
}
