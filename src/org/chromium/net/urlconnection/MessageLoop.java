// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net.urlconnection;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;

class MessageLoop
    implements Executor
{

    private final BlockingQueue a = new LinkedBlockingQueue();
    private boolean b;
    private boolean c;
    private long d;

    MessageLoop()
    {
        b = false;
        c = false;
        d = -1L;
    }

    public void a()
    {
        if (c)
        {
            throw new IllegalStateException("Cannot run loop as an exception has occurred previously.");
        }
        if (b)
        {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        }
        b = true;
_L2:
        if (!b)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Runnable)a.take()).run();
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
_L3:
        b = false;
        c = true;
        if (obj instanceof InterruptedException)
        {
            throw new IOException(((Throwable) (obj)));
        }
        if (obj instanceof RuntimeException)
        {
            throw (RuntimeException)obj;
        }
        if (true) goto _L2; else goto _L1
_L1:
        return;
        obj;
          goto _L3
    }

    public void b()
    {
        b = false;
    }

    public void execute(Runnable runnable)
    {
        if (runnable == null)
        {
            throw new IllegalArgumentException();
        }
        try
        {
            a.put(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            throw new RejectedExecutionException(runnable);
        }
    }
}
