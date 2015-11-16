// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

final class jsf
    implements Runnable
{

    final jsj a;
    final jse b;

    jsf(jse jse1, jsj jsj)
    {
        b = jse1;
        a = jsj;
        super();
    }

    public void run()
    {
        b.a(g.a(a));
        jse.a(b);
        return;
        Object obj;
        obj;
        b.cancel(false);
        jse.a(b);
        return;
        obj;
        b.a(((ExecutionException) (obj)).getCause());
        jse.a(b);
        return;
        obj;
        jse.a(b);
        throw obj;
    }
}
