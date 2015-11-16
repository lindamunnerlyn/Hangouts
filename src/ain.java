// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public class ain
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private Set a;
    private Set b;
    private Set c;

    public ain()
    {
        a = new HashSet();
        b = new HashSet();
        c = new HashSet();
    }

    public void a(Activity activity)
    {
    }

    public void b()
    {
    }

    public void c_()
    {
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        boolean flag;
        if (!a.contains(activity))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "activity being created that was already created: %s", new Object[] {
            activity
        });
        a.add(activity);
        if (a.size() == 1)
        {
            c_();
        }
    }

    public void onActivityDestroyed(Activity activity)
    {
        boolean flag;
        if (!c.contains(activity))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "activity being destroyed that wasn't paused: %s", new Object[] {
            activity
        });
        if (!b.contains(activity))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "activity being destroyed that wasn't stopped: %s", new Object[] {
            activity
        });
        n.b(a.contains(activity), "activity being destroyed that wasn't created: %s", new Object[] {
            activity
        });
        a.remove(activity);
        a.isEmpty();
    }

    public void onActivityPaused(Activity activity)
    {
        n.b(c.contains(activity), "activity being paused that wasn't started: %s", new Object[] {
            activity
        });
        n.b(b.contains(activity), "activity being paused that wasn't started: %s", new Object[] {
            activity
        });
        n.b(a.contains(activity), "activity being paused that wasn't created: %s", new Object[] {
            activity
        });
        c.remove(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        n.b(b.contains(activity), "activity being resumed that wasn't started: %s", new Object[] {
            activity
        });
        n.b(a.contains(activity), "activity being resumed that wasn't created: %s", new Object[] {
            activity
        });
        boolean flag;
        if (!c.contains(activity))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "activity being resumed that was already running: %s", new Object[] {
            activity
        });
        c.add(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        boolean flag;
        if (!b.contains(activity))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "activity being started that was already started: %s", new Object[] {
            activity
        });
        n.b(a.contains(activity), "activity being started that wasn't created: %s", new Object[] {
            activity
        });
        b.add(activity);
        if (b.size() == 1)
        {
            a(activity);
        }
    }

    public void onActivityStopped(Activity activity)
    {
        boolean flag;
        if (!c.contains(activity))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag, "activity being stopped that wasn't paused: %s", new Object[] {
            activity
        });
        n.b(b.contains(activity), "activity being stopped that wasn't started: %s", new Object[] {
            activity
        });
        n.b(a.contains(activity), "activity being stopped that wasn't created: %s", new Object[] {
            activity
        });
        b.remove(activity);
        if (b.isEmpty())
        {
            b();
        }
    }
}
