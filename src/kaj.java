// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

abstract class kaj
    implements Runnable
{

    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(kaj, java/lang/Thread, "a");
    volatile Thread a;
    volatile boolean b;

    kaj()
    {
    }

    abstract void a();

    abstract boolean b();

    public final void run()
    {
        if (c.compareAndSet(this, null, Thread.currentThread())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a();
        if (b())
        {
            while (!b) 
            {
                Thread.yield();
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        if (b())
        {
            while (!b) 
            {
                Thread.yield();
            }
        }
        throw exception;
    }

}
