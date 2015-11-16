// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class kac extends jrt
    implements Future
{

    protected kac()
    {
    }

    protected abstract Future a();

    protected Object c()
    {
        return a();
    }

    public boolean cancel(boolean flag)
    {
        return a().cancel(flag);
    }

    public Object get()
    {
        return a().get();
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return a().get(l, timeunit);
    }

    public boolean isCancelled()
    {
        return a().isCancelled();
    }

    public boolean isDone()
    {
        return a().isDone();
    }
}
