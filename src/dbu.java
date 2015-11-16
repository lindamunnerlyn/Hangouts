// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.google.android.apps.hangouts.realtimechat.BackgroundWarmSyncService;

public final class dbu extends aiu
{

    private static final boolean a = false;
    private static dbu b = null;

    private dbu()
    {
    }

    public static dbu c()
    {
        if (b == null)
        {
            b = new dbu();
        }
        return b;
    }

    protected void a(Activity activity)
    {
        if (a)
        {
            ebw.b("Babel", "The first activity of Hangout got started.");
        }
        if (BackgroundWarmSyncService.a(g.nS))
        {
            BackgroundWarmSyncService.a(g.nS, false);
        }
    }

    protected void b()
    {
        boolean flag1 = false;
        if (a)
        {
            ebw.b("Babel", "The last activity of Hangout got stopped.");
        }
        int ai[] = dbf.e();
        int j = ai.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!dbq.g(ai[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                if (flag && !BackgroundWarmSyncService.a(g.nS))
                {
                    BackgroundWarmSyncService.a(g.nS, true);
                }
                return;
            }
            i++;
        } while (true);
    }

    static 
    {
        hik hik = ebw.n;
    }
}
