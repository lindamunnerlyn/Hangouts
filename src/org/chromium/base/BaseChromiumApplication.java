// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Application;

// Referenced classes of package org.chromium.base:
//            ObserverList, ApplicationStatus

public class BaseChromiumApplication extends Application
{

    private ObserverList a;

    public BaseChromiumApplication()
    {
        a = new ObserverList();
    }

    static ObserverList a(BaseChromiumApplication basechromiumapplication)
    {
        return basechromiumapplication.a;
    }

    public void a(WindowFocusChangedListener windowfocuschangedlistener)
    {
        a.a(windowfocuschangedlistener);
    }

    public void onCreate()
    {
        super.onCreate();
        ApplicationStatus.a(this);
        registerActivityLifecycleCallbacks(new _cls1());
    }

    private class _cls1
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final BaseChromiumApplication a;

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
            android.view.Window.Callback callback = activity.getWindow().getCallback();
            bundle = activity.getWindow();
            ClassLoader classloader = android/view/Window$Callback.getClassLoader();
            activity = a. new WindowCallbackProxy(activity, callback);
            bundle.setCallback((android.view.Window.Callback)Proxy.newProxyInstance(classloader, new Class[] {
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

        _cls1()
        {
            a = BaseChromiumApplication.this;
            super();
        }

        private class WindowCallbackProxy
            implements InvocationHandler
        {

            final BaseChromiumApplication a;
            private final android.view.Window.Callback b;
            private final Activity c;

            public void a(boolean flag)
            {
                b.onWindowFocusChanged(flag);
                for (Iterator iterator = BaseChromiumApplication.a(a).iterator(); iterator.hasNext(); ((WindowFocusChangedListener)iterator.next()).a(c, flag)) { }
            }

            public boolean a(KeyEvent keyevent)
            {
                if (keyevent.getKeyCode() == 82 && c.dispatchKeyEvent(keyevent))
                {
                    return true;
                } else
                {
                    return b.dispatchKeyEvent(keyevent);
                }
            }

            public Object invoke(Object obj, Method method, Object aobj[])
            {
                if (method.getName().equals("onWindowFocusChanged") && aobj.length == 1 && (aobj[0] instanceof Boolean))
                {
                    a(((Boolean)aobj[0]).booleanValue());
                    return null;
                }
                if (method.getName().equals("dispatchKeyEvent") && aobj.length == 1 && (aobj[0] instanceof KeyEvent))
                {
                    return Boolean.valueOf(a((KeyEvent)aobj[0]));
                }
                try
                {
                    obj = method.invoke(b, aobj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (((InvocationTargetException) (obj)).getCause() instanceof AbstractMethodError)
                    {
                        throw ((InvocationTargetException) (obj)).getCause();
                    } else
                    {
                        throw obj;
                    }
                }
                return obj;
            }

            public WindowCallbackProxy(Activity activity, android.view.Window.Callback callback)
            {
                a = BaseChromiumApplication.this;
                super();
                b = callback;
                c = activity;
            }

            private class WindowFocusChangedListener
            {

                public abstract void a(Activity activity, boolean flag);
            }

        }

    }

}
