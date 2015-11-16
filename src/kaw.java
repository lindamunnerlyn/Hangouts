// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class kaw extends kaj
{

    final kav c;
    private final Callable d;

    kaw(kav kav1, Callable callable)
    {
        c = kav1;
        super();
        d = (Callable)n.b(callable);
    }

    void a()
    {
        if (c.isDone())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        c.a(d.call());
        return;
        Throwable throwable;
        throwable;
        c.a(throwable);
        return;
    }

    boolean b()
    {
        return c.b();
    }
}
