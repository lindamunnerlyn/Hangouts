// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.google.android.apps.hangouts.realtimechat.BackgroundWarmSyncService;

public final class ddd extends ain
{

    private static final boolean a = false;
    private static ddd b = null;

    private ddd()
    {
    }

    public static ddd c()
    {
        if (b == null)
        {
            b = new ddd();
        }
        return b;
    }

    protected void a(Activity activity)
    {
        if (a)
        {
            eev.b("Babel", "The first activity of Hangout got started.");
        }
        if (BackgroundWarmSyncService.a(g.nU))
        {
            BackgroundWarmSyncService.a(g.nU, false);
        }
    }

    protected void b()
    {
        boolean flag1 = false;
        if (a)
        {
            eev.b("Babel", "The last activity of Hangout got stopped.");
        }
        int ai[] = dcn.e();
        int j = ai.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!dcz.g(ai[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                if (flag && !BackgroundWarmSyncService.a(g.nU))
                {
                    BackgroundWarmSyncService.a(g.nU, true);
                }
                return;
            }
            i++;
        } while (true);
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
