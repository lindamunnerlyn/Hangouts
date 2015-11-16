// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import lmb;

// Referenced classes of package org.chromium.net:
//            CronetLibraryLoader, UrlRequestContextConfig

public class ChromiumUrlRequestContext
{

    public long a;

    protected ChromiumUrlRequestContext(Context context, String s, UrlRequestContextConfig urlrequestcontextconfig)
    {
        byte byte0 = 3;
        super();
        CronetLibraryLoader.a(context, urlrequestcontextconfig);
        if (Log.isLoggable("ChromiumNetwork", 2))
        {
            byte0 = -2;
        } else
        if (Log.isLoggable("ChromiumNetwork", 3))
        {
            byte0 = -1;
        }
        a = nativeCreateRequestContextAdapter(s, byte0, urlrequestcontextconfig.toString());
        if (a == 0L)
        {
            throw new NullPointerException("Context Adapter creation failed");
        } else
        {
            context = new lmb(this);
            (new Handler(Looper.getMainLooper())).post(context);
            return;
        }
    }

    public static void a(ChromiumUrlRequestContext chromiumurlrequestcontext, long l)
    {
        chromiumurlrequestcontext.nativeInitRequestContextOnMainThread(l);
    }

    private void initNetworkThread()
    {
        Thread.currentThread().setName("ChromiumNet");
        Process.setThreadPriority(10);
    }

    private native long nativeCreateRequestContextAdapter(String s, int i, String s1);

    private native String nativeGetStatisticsJSON(String s);

    private native void nativeInitRequestContextOnMainThread(long l);

    private native void nativeInitializeStatistics();

    private native void nativeReleaseRequestContextAdapter(long l);

    private native void nativeStartNetLogToFile(long l, String s, boolean flag);

    private native void nativeStopNetLog(long l);

    protected long a()
    {
        return a;
    }

    protected void finalize()
    {
        if (a != 0L)
        {
            nativeReleaseRequestContextAdapter(a);
        }
        super.finalize();
    }
}
