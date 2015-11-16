// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class gnl
    implements android.app.Application.ActivityLifecycleCallbacks
{

    static AtomicBoolean a = new AtomicBoolean(false);
    private gnm b;
    private gnn c;
    private final Application d;
    private boolean e;
    private int f;

    public gnl(Application application, gnm gnm1, gnn gnn1)
    {
        e = false;
        b = gnm1;
        c = gnn1;
        d = application;
        f = application.getResources().getConfiguration().orientation;
    }

    private void a(Activity activity)
    {
        Object obj;
        activity = activity.getApplicationContext();
        obj = ((ActivityManager)activity.getSystemService("activity")).getRunningAppProcesses();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L5:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L3
_L3:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        if (!runningappprocessinfo.processName.contains(activity.getPackageName()) || runningappprocessinfo.importance != 100) goto _L5; else goto _L4
_L4:
        boolean flag = true;
_L11:
        if (flag) goto _L7; else goto _L6
_L6:
        if (a.get())
        {
            a.getAndSet(false);
            b.a();
        }
_L9:
        return;
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L7:
        if (a.get()) goto _L9; else goto _L8
_L8:
        a.getAndSet(true);
        c.a();
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private boolean a()
    {
        boolean flag = false;
        int i = d.getResources().getConfiguration().orientation;
        if (f != i)
        {
            flag = true;
            f = i;
        }
        return flag;
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
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        if (!e)
        {
            a(activity);
            return;
        } else
        {
            e = a();
            return;
        }
    }

    public void onActivityStopped(Activity activity)
    {
        e = a();
        if (!e)
        {
            a(activity);
        }
    }

}
