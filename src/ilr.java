// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ilr
{

    final ReferenceQueue a = new ReferenceQueue();
    final Executor b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    ilr(Executor executor)
    {
        b = executor;
    }

    public jsj a(Object obj)
    {
        n.b(obj);
        if (c.compareAndSet(false, true))
        {
            b.execute(new ils(this));
        }
        jsr jsr1 = jsr.a();
        jsr1.a(new ilt(obj, a, jsr1), jsm.a);
        return jsr1;
    }
}
