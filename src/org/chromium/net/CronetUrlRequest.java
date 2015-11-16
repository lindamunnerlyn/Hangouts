// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package org.chromium.net:
//            UrlRequest, UrlRequestException, UrlRequestListener, CronetUrlRequestContext, 
//            CronetUploadDataStream, StatusListener, UploadDataProvider

final class CronetUrlRequest
    implements UrlRequest
{

    private long a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final Object f = new Object();
    private final CronetUrlRequestContext g;
    private final Executor h;
    private final List i = new ArrayList();
    private final UrlRequestListener j;
    private final String k;
    private final int l;
    private String m;
    private final HeadersList n = new HeadersList();
    private CronetUploadDataStream o;
    private NativeResponseInfo p;
    private OnReadCompletedRunnable q;
    private Runnable r;

    CronetUrlRequest(CronetUrlRequestContext croneturlrequestcontext, String s, UrlRequestListener urlrequestlistener, Executor executor)
    {
        b = false;
        c = false;
        d = false;
        e = false;
        if (s == null)
        {
            throw new NullPointerException("URL is required");
        }
        if (urlrequestlistener == null)
        {
            throw new NullPointerException("Listener is required");
        }
        if (executor == null)
        {
            throw new NullPointerException("Executor is required");
        } else
        {
            g = croneturlrequestcontext;
            k = s;
            i.add(s);
            l = 3;
            j = urlrequestlistener;
            h = executor;
            return;
        }
    }

    static Object a(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.f;
    }

    private NativeResponseInfo a(int i1)
    {
label0:
        {
            synchronized (f)
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
        obj = new NativeResponseInfo((String[])i.toArray(new String[i.size()]), i1, nativeGetHttpStatusText(l1), nativeGetWasCached(l1), nativeGetNegotiatedProtocol(l1), nativeGetProxyServer(l1));
        nativePopulateResponseHeaders(l1, NativeResponseInfo.a(((NativeResponseInfo) (obj))));
        return ((NativeResponseInfo) (obj));
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
        c();
    }

    static void a(CronetUrlRequest croneturlrequest, Exception exception)
    {
        UrlRequestException urlrequestexception;
label0:
        {
            urlrequestexception = new UrlRequestException("CalledByNative method has thrown an exception", exception);
            Log.e("ChromiumNetwork", "Exception in CalledByNative method", exception);
            synchronized (croneturlrequest.f)
            {
                if (!croneturlrequest.d())
                {
                    break label0;
                }
            }
            return;
        }
        croneturlrequest.g();
        exception;
        JVM INSTR monitorexit ;
        try
        {
            croneturlrequest.j.a(croneturlrequest.p, urlrequestexception);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CronetUrlRequest croneturlrequest)
        {
            Log.e("ChromiumNetwork", "Exception notifying of failed request", croneturlrequest);
        }
        return;
        croneturlrequest;
        exception;
        JVM INSTR monitorexit ;
        throw croneturlrequest;
    }

    private void a(UrlRequestException urlrequestexception)
    {
        a(((Runnable) (new _cls2(urlrequestexception))));
    }

    static long b(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.a;
    }

    static boolean c(CronetUrlRequest croneturlrequest)
    {
        croneturlrequest.e = true;
        return true;
    }

    static NativeResponseInfo d(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.p;
    }

    static UrlRequestListener e(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.j;
    }

    private void f()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (b || d())
        {
            throw new IllegalStateException("Request is already started.");
        }
        break MISSING_BLOCK_LABEL_36;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    static void f(CronetUrlRequest croneturlrequest)
    {
        croneturlrequest.g();
    }

    private void g()
    {
label0:
        {
            synchronized (f)
            {
                if (a != 0L)
                {
                    break label0;
                }
            }
            return;
        }
        nativeDestroy(a);
        g.b();
        a = 0L;
        if (r != null)
        {
            r.run();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean g(CronetUrlRequest croneturlrequest)
    {
        croneturlrequest.d = true;
        return true;
    }

    private native boolean nativeAddRequestHeader(long l1, String s, String s1);

    private native long nativeCreateRequestAdapter(long l1, String s, int i1);

    private native void nativeDestroy(long l1);

    private native void nativeDisableCache(long l1);

    private native void nativeFollowDeferredRedirect(long l1);

    private native String nativeGetHttpStatusText(long l1);

    private native String nativeGetNegotiatedProtocol(long l1);

    private native String nativeGetProxyServer(long l1);

    private native void nativeGetStatus(long l1, StatusListener statuslistener);

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
        if (q == null)
        {
            q = new OnReadCompletedRunnable();
        }
        bytebuffer.limit(j1 + i1);
        q.a = bytebuffer;
        a(q);
    }

    private void onReceivedRedirect(String s, int i1)
    {
        NativeResponseInfo nativeresponseinfo = a(i1);
        i.add(s);
        a(new _cls3(nativeresponseinfo, s));
    }

    private void onResponseStarted(int i1)
    {
        p = a(i1);
        a(new _cls4());
    }

    private void onStatus(StatusListener statuslistener, int i1)
    {
        a(new _cls6(statuslistener, i1));
    }

    private void onSucceeded(long l1)
    {
        a(new _cls5(new NativeExtendedResponseInfo(p, l1)));
    }

    public void a()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        f();
        a = nativeCreateRequestAdapter(g.c(), k, l);
        g.a();
        if (m != null && !nativeSetHttpMethod(a, m))
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid http method ")).append(m).toString());
        }
        break MISSING_BLOCK_LABEL_103;
        Object obj1;
        obj1;
        g();
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        boolean flag = false;
        Iterator iterator = n.iterator();
_L2:
        Pair pair;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_241;
        }
        pair = (Pair)iterator.next();
        if (((String)pair.first).equalsIgnoreCase("Content-Type") && !((String)pair.second).isEmpty())
        {
            flag = true;
        }
        if (nativeAddRequestHeader(a, (String)pair.first, (String)pair.second)) goto _L2; else goto _L1
_L1:
        g();
        throw new IllegalArgumentException((new StringBuilder("Invalid header ")).append((String)pair.first).append("=").append((String)pair.second).toString());
        if (o == null)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        o.a(this, a);
        if (c)
        {
            nativeDisableCache(a);
        }
        b = true;
        nativeStart(a);
        obj;
        JVM INSTR monitorexit ;
    }

    void a(Exception exception)
    {
        UrlRequestException urlrequestexception = new UrlRequestException("Exception received from UploadDataProvider", exception);
        Log.e("ChromiumNetwork", "Exception in upload method", exception);
        a(urlrequestexception);
    }

    public void a(String s, String s1)
    {
        f();
        if (s == null)
        {
            throw new NullPointerException("Invalid header name.");
        }
        if (s1 == null)
        {
            throw new NullPointerException("Invalid header value.");
        } else
        {
            n.add(Pair.create(s, s1));
            return;
        }
    }

    public void a(ByteBuffer bytebuffer)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (bytebuffer.position() >= bytebuffer.capacity())
        {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        break MISSING_BLOCK_LABEL_34;
        bytebuffer;
        obj;
        JVM INSTR monitorexit ;
        throw bytebuffer;
        if (!e)
        {
            throw new IllegalStateException("Unexpected read attempt.");
        }
        e = false;
        if (!d())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        bytebuffer.limit(bytebuffer.position());
        if (!nativeReadData(a, bytebuffer, bytebuffer.position(), bytebuffer.capacity()))
        {
            e = true;
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(UploadDataProvider uploaddataprovider, Executor executor)
    {
        if (uploaddataprovider == null)
        {
            throw new NullPointerException("Invalid UploadDataProvider.");
        }
        if (m == null)
        {
            m = "POST";
        }
        o = new CronetUploadDataStream(uploaddataprovider, executor);
    }

    public void b()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (!d)
        {
            throw new IllegalStateException("No redirect to follow.");
        }
        break MISSING_BLOCK_LABEL_30;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        d = false;
        if (!d())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        nativeFollowDeferredRedirect(a);
        obj;
        JVM INSTR monitorexit ;
    }

    public void c()
    {
label0:
        {
            synchronized (f)
            {
                if (!d() && b)
                {
                    break label0;
                }
            }
            return;
        }
        g();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean d()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (b && a == 0L)
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

    public void e()
    {
        f();
        c = true;
    }

    private class HeadersList extends ArrayList
    {

        HeadersList()
        {
        }
    }


    private class NativeResponseInfo
        implements ResponseInfo
    {

        private final String a[];
        private final int b;
        private final String c;
        private final HeadersList d = new HeadersList();
        private final boolean e;
        private final String f;
        private final String g;
        private Map h;
        private List i;

        static HeadersList a(NativeResponseInfo nativeresponseinfo)
        {
            return nativeresponseinfo.d;
        }

        public int a()
        {
            return b;
        }

        public String b()
        {
            return c;
        }

        public List c()
        {
            if (i == null)
            {
                i = Collections.unmodifiableList(d);
            }
            return i;
        }

        public Map d()
        {
            if (h != null)
            {
                return h;
            }
            TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Pair pair;
            ArrayList arraylist;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); treemap.put(pair.first, Collections.unmodifiableList(arraylist)))
            {
                pair = (Pair)iterator.next();
                arraylist = new ArrayList();
                if (treemap.containsKey(pair.first))
                {
                    arraylist.addAll((Collection)treemap.get(pair.first));
                }
                arraylist.add(pair.second);
            }

            h = Collections.unmodifiableMap(treemap);
            return h;
        }

        NativeResponseInfo(String as[], int i1, String s, boolean flag, String s1, String s2)
        {
            a = as;
            b = i1;
            c = s;
            e = flag;
            f = s1;
            g = s2;
        }
    }


    private class _cls2
        implements Runnable
    {

        final UrlRequestException a;
        final CronetUrlRequest b;

        public void run()
        {
label0:
            {
                synchronized (CronetUrlRequest.a(b))
                {
                    if (!b.d())
                    {
                        break label0;
                    }
                }
                return;
            }
            CronetUrlRequest.f(b);
            obj;
            JVM INSTR monitorexit ;
            try
            {
                CronetUrlRequest.e(b).a(CronetUrlRequest.d(b), a);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("ChromiumNetwork", "Exception in onError method", ((Throwable) (obj)));
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls2(UrlRequestException urlrequestexception)
        {
            b = CronetUrlRequest.this;
            a = urlrequestexception;
            super();
        }
    }


    private class OnReadCompletedRunnable
        implements Runnable
    {

        ByteBuffer a;
        final CronetUrlRequest b;

        public void run()
        {
            if (b.d())
            {
                return;
            }
            synchronized (CronetUrlRequest.a(b))
            {
                if (CronetUrlRequest.b(b) != 0L)
                {
                    break MISSING_BLOCK_LABEL_51;
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                CronetUrlRequest.a(b, ((Exception) (obj)));
            }
            return;
            CronetUrlRequest.c(b);
            obj;
            JVM INSTR monitorexit ;
            a = null;
            CronetUrlRequest.e(b).b(CronetUrlRequest.d(b));
            return;
        }

        OnReadCompletedRunnable()
        {
            b = CronetUrlRequest.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final NativeResponseInfo a;
        final String b;
        final CronetUrlRequest c;

        public void run()
        {
label0:
            {
                synchronized (CronetUrlRequest.a(c))
                {
                    if (!c.d())
                    {
                        break label0;
                    }
                }
                return;
            }
            CronetUrlRequest.g(c);
            obj;
            JVM INSTR monitorexit ;
            try
            {
                CronetUrlRequest.e(c).a(a, b);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                CronetUrlRequest.a(c, ((Exception) (obj)));
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls3(NativeResponseInfo nativeresponseinfo, String s)
        {
            c = CronetUrlRequest.this;
            a = nativeresponseinfo;
            b = s;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final CronetUrlRequest a;

        public void run()
        {
label0:
            {
                synchronized (CronetUrlRequest.a(a))
                {
                    if (!a.d())
                    {
                        break label0;
                    }
                }
                return;
            }
            CronetUrlRequest.c(a);
            obj;
            JVM INSTR monitorexit ;
            try
            {
                CronetUrlRequest.e(a).a(CronetUrlRequest.d(a));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                CronetUrlRequest.a(a, ((Exception) (obj)));
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls4()
        {
            a = CronetUrlRequest.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final StatusListener a;
        final int b;
        final CronetUrlRequest c;

        public void run()
        {
            RequestStatus.a(b);
        }

        _cls6(StatusListener statuslistener, int i1)
        {
            c = CronetUrlRequest.this;
            a = statuslistener;
            b = i1;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final NativeExtendedResponseInfo a;
        final CronetUrlRequest b;

        public void run()
        {
label0:
            {
                synchronized (CronetUrlRequest.a(b))
                {
                    if (!b.d())
                    {
                        break label0;
                    }
                }
                return;
            }
            CronetUrlRequest.f(b);
            obj;
            JVM INSTR monitorexit ;
            try
            {
                CronetUrlRequest.e(b).a(a);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("ChromiumNetwork", "Exception in onComplete method", ((Throwable) (obj)));
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls5(NativeExtendedResponseInfo nativeextendedresponseinfo)
        {
            b = CronetUrlRequest.this;
            a = nativeextendedresponseinfo;
            super();
        }
    }


    private class NativeExtendedResponseInfo
        implements ExtendedResponseInfo
    {

        private final ResponseInfo a;
        private final long b;

        public ResponseInfo a()
        {
            return a;
        }

        NativeExtendedResponseInfo(ResponseInfo responseinfo, long l1)
        {
            a = responseinfo;
            b = l1;
        }
    }

}
