// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ire
{

    final ReferenceQueue a = new ReferenceQueue();
    final Executor b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    ire(Executor executor)
    {
        b = executor;
    }

    public kak a(Object obj)
    {
        n.b(obj);
        if (c.compareAndSet(false, true))
        {
            b.execute(new irf(this));
        }
        kas kas1 = kas.j();
        kas1.a(new irg(obj, a, kas1), kan.a);
        return kas1;
    }
}
