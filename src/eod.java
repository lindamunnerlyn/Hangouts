// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.Lock;

abstract class eod
    implements Runnable
{

    final enq b;

    private eod(enq enq1)
    {
        b = enq1;
        super();
    }

    eod(enq enq1, byte byte0)
    {
        this(enq1);
    }

    protected abstract void a();

    public void run()
    {
        b.b.lock();
        boolean flag = Thread.interrupted();
        if (flag)
        {
            b.b.unlock();
            return;
        }
        a();
        b.b.unlock();
        return;
        Object obj;
        obj;
        b.a.a(((RuntimeException) (obj)));
        b.b.unlock();
        return;
        obj;
        b.b.unlock();
        throw obj;
    }
}
