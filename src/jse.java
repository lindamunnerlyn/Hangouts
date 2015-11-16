// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class jse extends jrr
    implements Runnable
{

    private jru b;
    private jsj c;
    private volatile jsj d;

    jse(jru jru1, jsj jsj1)
    {
        b = (jru)n.b(jru1);
        c = (jsj)n.b(jsj1);
    }

    static jsj a(jse jse1)
    {
        jse1.d = null;
        return null;
    }

    private static void a(Future future, boolean flag)
    {
        if (future != null)
        {
            future.cancel(flag);
        }
    }

    public boolean cancel(boolean flag)
    {
        if (super.cancel(flag))
        {
            a(c, flag);
            a(d, flag);
            return true;
        } else
        {
            return false;
        }
    }

    public void run()
    {
        Object obj = g.a(c);
        obj = (jsj)n.b(b.a(obj), "AsyncFunction may not return null.");
        d = ((jsj) (obj));
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        ((jsj) (obj)).cancel(super.a.d());
        d = null;
        b = null;
        c = null;
        return;
        obj;
        cancel(false);
        b = null;
        c = null;
        return;
        obj;
        a(((ExecutionException) (obj)).getCause());
        b = null;
        c = null;
        return;
        ((jsj) (obj)).a(new jsf(this, ((jsj) (obj))), g.A());
        b = null;
        c = null;
        return;
        Object obj1;
        obj1;
        a(((UndeclaredThrowableException) (obj1)).getCause());
        b = null;
        c = null;
        return;
        obj1;
        a(((Throwable) (obj1)));
        b = null;
        c = null;
        return;
        obj1;
        b = null;
        c = null;
        throw obj1;
    }
}
