// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;
import android.view.KeyEvent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

// Referenced classes of package org.chromium.base:
//            BaseChromiumApplication, ObserverList

class c
    implements InvocationHandler
{

    final BaseChromiumApplication a;
    private final android.view.roxy.b b;
    private final Activity c;

    public void a(boolean flag)
    {
        b.b(flag);
        for (Iterator iterator = BaseChromiumApplication.a(a).iterator(); iterator.hasNext(); ((stener)iterator.next()).a(c, flag)) { }
    }

    public boolean a(KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 82 && c.dispatchKeyEvent(keyevent))
        {
            return true;
        } else
        {
            return b.b(keyevent);
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

    public stener(BaseChromiumApplication basechromiumapplication, Activity activity, android.view.roxy roxy)
    {
        a = basechromiumapplication;
        super();
        b = roxy;
        c = activity;
    }
}
