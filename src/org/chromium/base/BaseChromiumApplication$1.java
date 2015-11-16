// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import java.lang.reflect.Proxy;

// Referenced classes of package org.chromium.base:
//            BaseChromiumApplication

class a
    implements android.app.cleCallbacks
{

    final BaseChromiumApplication a;

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        android.view.on on = activity.getWindow().getCallback();
        bundle = activity.getWindow();
        ClassLoader classloader = android/view/Window$Callback.getClassLoader();
        activity = new ndowCallbackProxy(a, activity, on);
        bundle.setCallback((android.view.on)Proxy.newProxyInstance(classloader, new Class[] {
            android/view/Window$Callback
        }, activity));
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
    }

    public void onActivityStopped(Activity activity)
    {
    }

    ndowCallbackProxy(BaseChromiumApplication basechromiumapplication)
    {
        a = basechromiumapplication;
        super();
    }
}
