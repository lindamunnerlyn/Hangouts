// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import lmd;
import lme;

// Referenced classes of package org.chromium.net:
//            UploadDataSink, CronetUrlRequest

public final class CronetUploadDataStream
    implements UploadDataSink
{

    public final Object a;
    public long b;
    public boolean c;
    public boolean d;
    private final Executor e;
    private CronetUrlRequest f;
    private final Runnable g;
    private ByteBuffer h;
    private boolean i;

    private void a(Runnable runnable)
    {
        try
        {
            e.execute(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            f.a(runnable);
        }
    }

    public static void a(CronetUploadDataStream cronetuploaddatastream)
    {
label0:
        {
            synchronized (cronetuploaddatastream.a)
            {
                if (!cronetuploaddatastream.c)
                {
                    break label0;
                }
                cronetuploaddatastream.i = true;
            }
            return;
        }
        if (cronetuploaddatastream.b != 0L)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        cronetuploaddatastream;
        obj;
        JVM INSTR monitorexit ;
        throw cronetuploaddatastream;
        nativeDestroyAdapter(cronetuploaddatastream.b);
        cronetuploaddatastream.b = 0L;
        obj;
        JVM INSTR monitorexit ;
    }

    private native long nativeAttachUploadDataToRequest(long l, long l1);

    private native long nativeCreateAdapterForTesting();

    private native long nativeCreateUploadDataStreamForTesting(long l, long l1);

    private static native void nativeDestroyAdapter(long l);

    private native void nativeOnReadSucceeded(long l, int j, boolean flag);

    private native void nativeOnRewindSucceeded(long l);

    void onUploadDataStreamDestroyed()
    {
        a(new lme(this));
    }

    void readData(ByteBuffer bytebuffer)
    {
        h = bytebuffer;
        a(g);
    }

    void rewind()
    {
        a(new lmd(this));
    }
}
