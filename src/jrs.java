// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

final class jrs extends AbstractQueuedSynchronizer
{

    private static final long serialVersionUID = 0L;
    private Object a;
    private Throwable b;

    jrs()
    {
    }

    private boolean a(Object obj, Throwable throwable, int i)
    {
        boolean flag = compareAndSetState(0, 1);
        if (flag)
        {
            a = obj;
            if ((i & 0xc) != 0)
            {
                throwable = new CancellationException("Future.cancel() was called.");
            }
            b = throwable;
            releaseShared(i);
        } else
        if (getState() == 1)
        {
            acquireShared(-1);
            return flag;
        }
        return flag;
    }

    private Object e()
    {
        int i = getState();
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Error, synchronizer in invalid state: ")).append(i).toString());

        case 2: // '\002'
            if (b != null)
            {
                throw new ExecutionException(b);
            } else
            {
                return a;
            }

        case 4: // '\004'
        case 8: // '\b'
            throw jrr.a("Task was cancelled.", b);
        }
    }

    Object a()
    {
        acquireSharedInterruptibly(-1);
        return e();
    }

    Object a(long l)
    {
        if (!tryAcquireSharedNanos(-1, l))
        {
            throw new TimeoutException("Timeout waiting for task.");
        } else
        {
            return e();
        }
    }

    boolean a(Object obj)
    {
        return a(obj, null, 2);
    }

    boolean a(Throwable throwable)
    {
        return a(null, throwable, 2);
    }

    boolean a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 4;
        }
        return a(null, null, byte0);
    }

    boolean b()
    {
        return (getState() & 0xe) != 0;
    }

    boolean c()
    {
        return (getState() & 0xc) != 0;
    }

    boolean d()
    {
        return getState() == 8;
    }

    protected int tryAcquireShared(int i)
    {
        return !b() ? -1 : 1;
    }

    protected boolean tryReleaseShared(int i)
    {
        setState(i);
        return true;
    }
}
