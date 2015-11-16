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
import java.util.concurrent.atomic.AtomicInteger;
import lmn;

// Referenced classes of package org.chromium.net:
//            UrlRequestContext, CronetLibraryLoader, UrlRequestContextConfig

public class CronetUrlRequestContext extends UrlRequestContext
{

    public final Object a;
    public long b;
    private final ConditionVariable c;
    private final AtomicInteger d;
    private Thread e;

    public CronetUrlRequestContext(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        byte byte0;
        byte0 = 3;
        super();
        a = new Object();
        c = new ConditionVariable(false);
        d = new AtomicInteger(0);
        b = 0L;
        CronetLibraryLoader.a(context, urlrequestcontextconfig);
        if (!Log.isLoggable("ChromiumNetwork", 2)) goto _L2; else goto _L1
_L1:
        byte0 = -2;
_L4:
        nativeSetMinLogLevel(byte0);
        b = nativeCreateRequestContextAdapter(urlrequestcontextconfig.toString());
        if (b == 0L)
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
        context = new lmn(this);
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

    public static void a(CronetUrlRequestContext croneturlrequestcontext, long l)
    {
        croneturlrequestcontext.nativeInitRequestContextOnMainThread(l);
    }

    private void initNetworkThread()
    {
        synchronized (a)
        {
            e = Thread.currentThread();
            c.open();
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

    void a()
    {
        d.decrementAndGet();
    }
}
