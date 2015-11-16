// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class kad extends kac
    implements kak
{

    protected kad()
    {
    }

    protected Future a()
    {
        return b();
    }

    public void a(Runnable runnable, Executor executor)
    {
        b().a(runnable, executor);
    }

    protected abstract kak b();

    protected Object c()
    {
        return b();
    }
}
