// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

public final class dge extends ain
{

    private static final boolean a = false;
    private static dge b = null;
    private Handler c;

    private dge()
    {
    }

    static Handler a(dge dge1)
    {
        return dge1.c;
    }

    public static dge c()
    {
        if (b == null)
        {
            b = new dge();
        }
        return b;
    }

    protected void a(Activity activity)
    {
        if (g.a(g.nU, "babel_poll_parasite_operations_periodically", false))
        {
            if (a)
            {
                eev.b("Babel", "Start polling parasite operations when the first activity of Hangout starts.");
            }
            if (c == null)
            {
                c = new Handler(Looper.getMainLooper());
            }
            long l = g.a(g.nU, "babel_poll_parasite_operations_interval_ms", dlb.l);
            c.postDelayed(new dgf(this, l), l);
        }
    }

    protected void b()
    {
        if (a)
        {
            eev.b("Babel", "Stop polling parasite operations when the last activity of Hangout got stops.");
        }
        if (c != null)
        {
            c.removeCallbacksAndMessages(null);
        }
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
