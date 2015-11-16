// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package org.chromium.net:
//            UrlRequestContext, CronetLibraryLoader, UrlRequestContextConfig, CronetUrlRequest, 
//            UrlRequestListener, UrlRequest

public class CronetUrlRequestContext extends UrlRequestContext
{

    private final Object a;
    private final ConditionVariable b;
    private final AtomicInteger c;
    private long d;
    private Thread e;

    public CronetUrlRequestContext(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        byte byte0;
        byte0 = 3;
        super();
        a = new Object();
        b = new ConditionVariable(false);
        c = new AtomicInteger(0);
        d = 0L;
        CronetLibraryLoader.a(context, urlrequestcontextconfig);
        if (!Log.isLoggable("ChromiumNetwork", 2)) goto _L2; else goto _L1
_L1:
        byte0 = -2;
_L4:
        nativeSetMinLogLevel(byte0);
        d = nativeCreateRequestContextAdapter(urlrequestcontextconfig.toString());
        if (d == 0L)
        {
            throw new NullPointerException("Context Adapter creation failed.");
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (Log.isLoggable("ChromiumNetwork", 3))
        {
            byte0 = -1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        context = new _cls1();
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            context.run();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(context);
            return;
        }
    }

    static Object a(CronetUrlRequestContext croneturlrequestcontext)
    {
        return croneturlrequestcontext.a;
    }

    static void a(CronetUrlRequestContext croneturlrequestcontext, long l)
    {
        croneturlrequestcontext.nativeInitRequestContextOnMainThread(l);
    }

    static long b(CronetUrlRequestContext croneturlrequestcontext)
    {
        return croneturlrequestcontext.d;
    }

    private void d()
    {
        boolean flag;
        if (d != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new IllegalStateException("Context is shut down.");
        } else
        {
            return;
        }
    }

    private void initNetworkThread()
    {
        synchronized (a)
        {
            e = Thread.currentThread();
            b.open();
        }
        Thread.currentThread().setName("ChromiumNet");
        Process.setThreadPriority(10);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static native long nativeCreateRequestContextAdapter(String s);

    private native void nativeDestroy(long l);

    private native void nativeInitRequestContextOnMainThread(long l);

    private static native int nativeSetMinLogLevel(int i);

    private native void nativeStartNetLogToFile(long l, String s, boolean flag);

    private native void nativeStopNetLog(long l);

    public UrlRequest a(String s, UrlRequestListener urlrequestlistener, Executor executor)
    {
        synchronized (a)
        {
            d();
            s = new CronetUrlRequest(this, s, urlrequestlistener, executor);
        }
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    void a()
    {
        c.incrementAndGet();
    }

    void b()
    {
        c.decrementAndGet();
    }

    long c()
    {
        long l;
        synchronized (a)
        {
            d();
            l = d;
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private class _cls1
        implements Runnable
    {

        final CronetUrlRequestContext a;

        public void run()
        {
            synchronized (CronetUrlRequestContext.a(a))
            {
                CronetUrlRequestContext.a(a, CronetUrlRequestContext.b(a));
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls1()
        {
            a = CronetUrlRequestContext.this;
            super();
        }
    }

}
