// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

final class eb extends eu
    implements Runnable
{

    boolean a;
    final ea b;
    private final CountDownLatch g = new CountDownLatch(1);

    eb(ea ea1)
    {
        b = ea1;
        super();
    }

    private transient Object c()
    {
        Object obj;
        try
        {
            obj = b.e();
        }
        catch (gb gb1)
        {
            if (!super.e.isCancelled())
            {
                throw gb1;
            } else
            {
                return null;
            }
        }
        return obj;
    }

    protected Object a()
    {
        return c();
    }

    protected void a(Object obj)
    {
        b.b(this, obj);
        g.countDown();
        return;
        obj;
        g.countDown();
        throw obj;
    }

    protected void b(Object obj)
    {
        b.a(this, obj);
        g.countDown();
        return;
        obj;
        g.countDown();
        throw obj;
    }

    public void run()
    {
        a = false;
        b.c();
    }
}
