// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

final class ex extends FutureTask
{

    final eu a;

    ex(eu eu1, Callable callable)
    {
        a = eu1;
        super(callable);
    }

    protected void done()
    {
        try
        {
            Object obj = get();
            eu.b(a, obj);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        catch (ExecutionException executionexception)
        {
            throw new RuntimeException("An error occurred while executing doInBackground()", executionexception.getCause());
        }
        catch (CancellationException cancellationexception)
        {
            eu.b(a, null);
        }
        catch (Throwable throwable)
        {
            throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
        }
    }
}
