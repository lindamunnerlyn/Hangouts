// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package org.chromium.base:
//            ObserverList, BaseChromiumApplication, ThreadUtils

public class ApplicationStatus
{

    private static Application a;
    private static Object b = new Object();
    private static Integer c;
    private static Activity d;
    private static ApplicationStateListener e;
    private static final Map f = new ConcurrentHashMap();
    private static final ObserverList g = new ObserverList();
    private static final ObserverList h = new ObserverList();

    private ApplicationStatus()
    {
    }

    public static int a(Activity activity)
    {
        activity = (ActivityInfo)f.get(activity);
        if (activity != null)
        {
            return activity.a();
        } else
        {
            return 6;
        }
    }

    public static Activity a()
    {
        return d;
    }

    static void a(int i)
    {
        nativeOnApplicationStateChange(i);
    }

    static void a(Activity activity, int i)
    {
        int j;
        if (activity == null)
        {
            throw new IllegalArgumentException("null activity is not supported");
        }
        if (d == null || i == 1 || i == 3 || i == 2)
        {
            d = activity;
        }
        j = c();
        if (i == 1)
        {
            f.put(activity, new ActivityInfo());
        }
        synchronized (b)
        {
            c = null;
        }
        obj = (ActivityInfo)f.get(activity);
        ((ActivityInfo) (obj)).a(i);
        for (obj = ((ActivityInfo) (obj)).b().iterator(); ((Iterator) (obj)).hasNext(); ((Iterator) (obj)).next()) { }
        break MISSING_BLOCK_LABEL_127;
        activity;
        obj;
        JVM INSTR monitorexit ;
        throw activity;
        for (Iterator iterator = g.iterator(); iterator.hasNext(); iterator.next()) { }
        int k = c();
        if (k != j)
        {
            for (Iterator iterator1 = h.iterator(); iterator1.hasNext(); ((ApplicationStateListener)iterator1.next()).a(k)) { }
        }
        if (i == 6)
        {
            f.remove(activity);
            if (activity == d)
            {
                d = null;
            }
        }
        return;
    }

    public static void a(ApplicationStateListener applicationstatelistener)
    {
        h.a(applicationstatelistener);
    }

    public static void a(BaseChromiumApplication basechromiumapplication)
    {
        a = basechromiumapplication;
        basechromiumapplication.a(new _cls1());
        basechromiumapplication.registerActivityLifecycleCallbacks(new _cls2());
    }

    static Activity b(Activity activity)
    {
        d = activity;
        return activity;
    }

    public static Context b()
    {
        if (a != null)
        {
            return a.getApplicationContext();
        } else
        {
            return null;
        }
    }

    static ApplicationStateListener b(ApplicationStateListener applicationstatelistener)
    {
        e = applicationstatelistener;
        return applicationstatelistener;
    }

    public static int c()
    {
        int i;
        boolean flag1;
        i = 0;
        flag1 = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (c != null) goto _L2; else goto _L1
_L1:
        Iterator iterator = f.values().iterator();
        boolean flag = false;
_L5:
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        j = ((ActivityInfo)iterator.next()).a();
        if (j == 4 || j == 5 || j == 6) goto _L4; else goto _L3
_L3:
        i = ((flag1) ? 1 : 0);
_L6:
        c = Integer.valueOf(i);
_L2:
        i = c.intValue();
        obj;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        if (j == 4)
        {
            flag = true;
        } else
        if (j == 5)
        {
            i = 1;
        }
          goto _L5
        if (flag)
        {
            i = 2;
        } else
        if (i != 0)
        {
            i = 3;
        } else
        {
            i = 4;
        }
          goto _L6
    }

    static Activity d()
    {
        return d;
    }

    static ApplicationStateListener e()
    {
        return e;
    }

    private static native void nativeOnApplicationStateChange(int i);

    private static void registerThreadSafeNativeApplicationStateListener()
    {
        ThreadUtils.a(new _cls3());
    }


    private class ActivityInfo
    {

        private int a;
        private ObserverList b;

        public int a()
        {
            return a;
        }

        public void a(int i)
        {
            a = i;
        }

        public ObserverList b()
        {
            return b;
        }

        ActivityInfo()
        {
            a = 6;
            b = new ObserverList();
        }
    }


    private class ApplicationStateListener
    {

        public abstract void a(int i);
    }


    private class _cls1
        implements BaseChromiumApplication.WindowFocusChangedListener
    {

        public void a(Activity activity, boolean flag)
        {
            int i;
            if (flag && activity != ApplicationStatus.d())
            {
                if ((i = ApplicationStatus.a(activity)) != 6 && i != 5)
                {
                    ApplicationStatus.b(activity);
                    return;
                }
            }
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
            ApplicationStatus.a(activity, 1);
        }

        public void onActivityDestroyed(Activity activity)
        {
            ApplicationStatus.a(activity, 6);
        }

        public void onActivityPaused(Activity activity)
        {
            ApplicationStatus.a(activity, 4);
        }

        public void onActivityResumed(Activity activity)
        {
            ApplicationStatus.a(activity, 3);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
        }

        public void onActivityStarted(Activity activity)
        {
            ApplicationStatus.a(activity, 2);
        }

        public void onActivityStopped(Activity activity)
        {
            ApplicationStatus.a(activity, 5);
        }

        _cls2()
        {
        }
    }


    private class _cls3
        implements Runnable
    {

        public void run()
        {
            if (ApplicationStatus.e() != null)
            {
                return;
            } else
            {
                class _cls1
                    implements ApplicationStateListener
                {

                    final _cls3 a;

                    public void a(int i)
                    {
                        ApplicationStatus.a(i);
                    }

                _cls1()
                {
                    a = _cls3.this;
                    super();
                }
                }

                ApplicationStatus.b(new _cls1());
                ApplicationStatus.a(ApplicationStatus.e());
                return;
            }
        }

        _cls3()
        {
        }
    }

}
