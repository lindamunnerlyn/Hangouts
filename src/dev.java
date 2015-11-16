// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

public final class dev extends aiu
{

    private static final boolean a = false;
    private static dev b = null;
    private Handler c;

    private dev()
    {
    }

    static Handler a(dev dev1)
    {
        return dev1.c;
    }

    public static dev c()
    {
        if (b == null)
        {
            b = new dev();
        }
        return b;
    }

    protected void a(Activity activity)
    {
        if (g.a(g.nS, "babel_poll_parasite_operations_periodically", false))
        {
            if (a)
            {
                ebw.b("Babel", "Start polling parasite operations when the first activity of Hangout starts.");
            }
            if (c == null)
            {
                c = new Handler(Looper.getMainLooper());
            }
            long l = g.a(g.nS, "babel_poll_parasite_operations_interval_ms", djk.l);
            c.postDelayed(new dew(this, l), l);
        }
    }

    protected void b()
    {
        if (a)
        {
            ebw.b("Babel", "Stop polling parasite operations when the last activity of Hangout got stops.");
        }
        if (c != null)
        {
            c.removeCallbacksAndMessages(null);
        }
    }

    static 
    {
        hik hik = ebw.n;
    }
}
