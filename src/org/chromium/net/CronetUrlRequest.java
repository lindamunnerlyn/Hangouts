// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import lmf;
import lmg;
import lmh;
import lmi;
import lmj;
import lmk;
import lml;
import lmm;

// Referenced classes of package org.chromium.net:
//            UrlRequest, UrlRequestException, CronetUrlRequestContext

public final class CronetUrlRequest
    implements UrlRequest
{

    public long a;
    public boolean b;
    public boolean c;
    public final Object d;
    private boolean e;
    private boolean f;
    private final CronetUrlRequestContext g;
    private final Executor h;
    private final List i;
    private lml j;
    private lmm k;
    private Runnable l;

    private lml a(int i1)
    {
label0:
        {
            synchronized (d)
            {
                if (a != 0L)
                {
                    break label0;
                }
            }
            return null;
        }
        long l1 = a;
        obj;
        JVM INSTR monitorexit ;
        obj = new lml((String[])i.toArray(new String[i.size()]), i1, nativeGetHttpStatusText(l1), nativeGetWasCached(l1), nativeGetNegotiatedProtocol(l1), nativeGetProxyServer(l1));
        nativePopulateResponseHeaders(l1, ((lml) (obj)).a);
        return ((lml) (obj));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Runnable runnable)
    {
        try
        {
            h.execute(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            Log.e("ChromiumNetwork", "Exception posting task to executor", runnable);
        }
        synchronized (d)
        {
            if (!a() && e)
            {
                break MISSING_BLOCK_LABEL_50;
            }
        }
        return;
        exception;
        runnable;
        JVM INSTR monitorexit ;
        throw exception;
        b();
        runnable;
        JVM INSTR monitorexit ;
    }

    public static void a(CronetUrlRequest croneturlrequest)
    {
        croneturlrequest.b();
    }

    public static void a(CronetUrlRequest croneturlrequest, Exception exception)
    {
label0:
        {
            new UrlRequestException("CalledByNative method has thrown an exception", exception);
            Log.e("ChromiumNetwork", "Exception in CalledByNative method", exception);
            synchronized (croneturlrequest.d)
            {
                if (!croneturlrequest.a())
                {
                    break label0;
                }
            }
            return;
        }
        croneturlrequest.b();
        exception;
        JVM INSTR monitorexit ;
        return;
        croneturlrequest;
        exception;
        JVM INSTR monitorexit ;
        throw croneturlrequest;
    }

    private void a(UrlRequestException urlrequestexception)
    {
        a(((Runnable) (new lmf(this, urlrequestexception))));
    }

    private void b()
    {
label0:
        {
            synchronized (d)
            {
                if (a != 0L)
                {
                    break label0;
                }
            }
            return;
        }
        nativeDestroy(a);
        g.a();
        a = 0L;
        if (l != null)
        {
            l.run();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private native boolean nativeAddRequestHeader(long l1, String s, String s1);

    private native long nativeCreateRequestAdapter(long l1, String s, int i1);

    private native void nativeDestroy(long l1);

    private native void nativeDisableCache(long l1);

    private native void nativeFollowDeferredRedirect(long l1);

    private native String nativeGetHttpStatusText(long l1);

    private native String nativeGetNegotiatedProtocol(long l1);

    private native String nativeGetProxyServer(long l1);

    private native void nativeGetStatus(long l1, UrlRequest.StatusListener statuslistener);

    private native boolean nativeGetWasCached(long l1);

    private native void nativePopulateResponseHeaders(long l1, HeadersList headerslist);

    private native boolean nativeReadData(long l1, ByteBuffer bytebuffer, int i1, int j1);

    private native boolean nativeSetHttpMethod(long l1, String s);

    private native void nativeStart(long l1);

    private void onAppendResponseHeader(HeadersList headerslist, String s, String s1)
    {
        headerslist.add(Pair.create(s, s1));
    }

    private void onError(int i1, String s)
    {
        a(new UrlRequestException((new StringBuilder("Exception in CronetUrlRequest: ")).append(s).toString(), i1));
    }

    private void onReadCompleted(ByteBuffer bytebuffer, int i1, int j1)
    {
        if (bytebuffer.position() != j1)
        {
            a(new UrlRequestException("ByteBuffer modified externally during read", null));
            return;
        }
        if (k == null)
        {
            k = new lmm(this);
        }
        if (f)
        {
            bytebuffer.limit(j1 + i1);
        } else
        {
            bytebuffer.position(j1 + i1);
        }
        k.a = bytebuffer;
        a(k);
    }

    private void onReceivedRedirect(String s, int i1)
    {
        lml lml1 = a(i1);
        i.add(s);
        a(new lmg(this, lml1, s));
    }

    private void onResponseStarted(int i1)
    {
        j = a(i1);
        a(new lmh(this));
    }

    private void onStatus(UrlRequest.StatusListener statuslistener, int i1)
    {
        a(new lmj(this, statuslistener, i1));
    }

    private void onSucceeded(long l1)
    {
        a(new lmi(this, new lmk(j, l1)));
    }

    void a(Exception exception)
    {
        UrlRequestException urlrequestexception = new UrlRequestException("Exception received from UploadDataProvider", exception);
        Log.e("ChromiumNetwork", "Exception in upload method", exception);
        a(urlrequestexception);
    }

    public boolean a()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (e && a == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private class HeadersList extends ArrayList
    {

        public HeadersList()
        {
        }
    }

}
