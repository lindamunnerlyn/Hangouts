// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package org.chromium.net:
//            UploadDataSink, UploadDataProvider, CronetUrlRequest

final class CronetUploadDataStream
    implements UploadDataSink
{

    private final Executor a;
    private final UploadDataProvider b;
    private final long c;
    private CronetUrlRequest d;
    private final Runnable e = new _cls1();
    private ByteBuffer f;
    private final Object g = new Object();
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;

    public CronetUploadDataStream(UploadDataProvider uploaddataprovider, Executor executor)
    {
        f = null;
        h = 0L;
        i = false;
        j = false;
        k = false;
        a = executor;
        b = uploaddataprovider;
        c = b.a();
    }

    static Object a(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.g;
    }

    private void a(Runnable runnable)
    {
        try
        {
            a.execute(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            d.a(runnable);
        }
    }

    static void a(CronetUploadDataStream cronetuploaddatastream, Exception exception)
    {
        cronetuploaddatastream.b(exception);
    }

    static long b(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.h;
    }

    private void b()
    {
label0:
        {
            synchronized (g)
            {
                if (!i)
                {
                    break label0;
                }
                k = true;
            }
            return;
        }
        if (h != 0L)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        nativeDestroyAdapter(h);
        h = 0L;
        obj;
        JVM INSTR monitorexit ;
    }

    private void b(Exception exception)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!i && !j)
        {
            throw new IllegalStateException("There is no read or rewind in progress.");
        }
        break MISSING_BLOCK_LABEL_36;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        i = false;
        j = false;
        f = null;
        c();
        obj;
        JVM INSTR monitorexit ;
        d.a(exception);
        return;
    }

    private void c()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (i)
        {
            throw new IllegalStateException("Method should not be called when read has not completed.");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (k)
        {
            b();
        }
        obj;
        JVM INSTR monitorexit ;
    }

    static boolean c(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.i;
    }

    static boolean d(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.j;
    }

    static ByteBuffer e(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.f;
    }

    static boolean f(CronetUploadDataStream cronetuploaddatastream)
    {
        cronetuploaddatastream.i = true;
        return true;
    }

    static UploadDataProvider g(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.b;
    }

    static boolean h(CronetUploadDataStream cronetuploaddatastream)
    {
        cronetuploaddatastream.j = true;
        return true;
    }

    static void i(CronetUploadDataStream cronetuploaddatastream)
    {
        cronetuploaddatastream.b();
    }

    private native long nativeAttachUploadDataToRequest(long l, long l1);

    private native long nativeCreateAdapterForTesting();

    private native long nativeCreateUploadDataStreamForTesting(long l, long l1);

    private static native void nativeDestroyAdapter(long l);

    private native void nativeOnReadSucceeded(long l, int i1, boolean flag);

    private native void nativeOnRewindSucceeded(long l);

    public void a()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Non-existent rewind succeeded.");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        j = false;
        if (h != 0L)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        nativeOnRewindSucceeded(h);
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(Exception exception)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Non-existent rewind failed.");
        }
        break MISSING_BLOCK_LABEL_29;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        b(exception);
        obj;
        JVM INSTR monitorexit ;
    }

    void a(CronetUrlRequest croneturlrequest, long l)
    {
        d = croneturlrequest;
        h = nativeAttachUploadDataToRequest(l, c);
    }

    public void a(boolean flag)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!i)
        {
            throw new IllegalStateException("Non-existent read succeeded.");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (c >= 0L)
        {
            throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
        }
        int l;
        l = f.position();
        f = null;
        i = false;
        c();
        if (h != 0L)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        nativeOnReadSucceeded(h, l, flag);
        obj;
        JVM INSTR monitorexit ;
    }

    void onUploadDataStreamDestroyed()
    {
        a(new _cls3());
    }

    void readData(ByteBuffer bytebuffer)
    {
        f = bytebuffer;
        a(e);
    }

    void rewind()
    {
        a(new _cls2());
    }

    private class _cls1
        implements Runnable
    {

        final CronetUploadDataStream a;

        public void run()
        {
label0:
            {
                synchronized (CronetUploadDataStream.a(a))
                {
                    if (CronetUploadDataStream.b(a) != 0L)
                    {
                        break label0;
                    }
                }
                return;
            }
            if (CronetUploadDataStream.c(a))
            {
                throw new IllegalStateException("Unexpected readData call. Already reading.");
            }
            break MISSING_BLOCK_LABEL_50;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
            if (CronetUploadDataStream.d(a))
            {
                throw new IllegalStateException("Unexpected readData call. Already rewinding.");
            }
            if (CronetUploadDataStream.e(a) == null)
            {
                throw new IllegalStateException("Unexpected readData call. Buffer is null");
            }
            CronetUploadDataStream.f(a);
            obj;
            JVM INSTR monitorexit ;
            try
            {
                CronetUploadDataStream.g(a).a(a, CronetUploadDataStream.e(a));
                return;
            }
            catch (Exception exception)
            {
                CronetUploadDataStream.a(a, exception);
            }
            return;
        }

        _cls1()
        {
            a = CronetUploadDataStream.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final CronetUploadDataStream a;

        public void run()
        {
            CronetUploadDataStream.i(a);
        }

        _cls3()
        {
            a = CronetUploadDataStream.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final CronetUploadDataStream a;

        public void run()
        {
label0:
            {
                synchronized (CronetUploadDataStream.a(a))
                {
                    if (CronetUploadDataStream.b(a) != 0L)
                    {
                        break label0;
                    }
                }
                return;
            }
            if (CronetUploadDataStream.c(a))
            {
                throw new IllegalStateException("Unexpected rewind call. Already reading");
            }
            break MISSING_BLOCK_LABEL_50;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
            if (CronetUploadDataStream.d(a))
            {
                throw new IllegalStateException("Unexpected rewind call. Already rewinding");
            }
            CronetUploadDataStream.h(a);
            obj;
            JVM INSTR monitorexit ;
            try
            {
                CronetUploadDataStream.g(a).a(a);
                return;
            }
            catch (Exception exception)
            {
                CronetUploadDataStream.a(a, exception);
            }
            return;
        }

        _cls2()
        {
            a = CronetUploadDataStream.this;
            super();
        }
    }

}
