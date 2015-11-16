// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

abstract class jzz extends jzu
    implements Runnable
{

    kak a;
    Object b;

    jzz(kak kak1, Object obj)
    {
        a = (kak)n.b(kak1);
        b = n.b(obj);
    }

    static kak a(kak kak1, jnn jnn)
    {
        n.b(jnn);
        jnn = new kaa(kak1, jnn);
        kak1.a(jnn, kan.a);
        return jnn;
    }

    abstract void a(Object obj, Object obj1);

    final void c()
    {
        a(a);
        a = null;
        b = null;
    }

    public final void run()
    {
        boolean flag1 = true;
        Object obj;
        Object obj1;
        boolean flag2;
        obj1 = a;
        obj = b;
        flag2 = isCancelled();
        boolean flag;
        if (obj1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj != null)
        {
            flag1 = false;
        }
        if (flag1 | (flag | flag2))
        {
            return;
        }
          goto _L1
_L3:
        a = null;
        b = null;
        obj1 = g.a(((java.util.concurrent.Future) (obj1)));
        a(obj, obj1);
        return;
        obj;
        try
        {
            cancel(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((UndeclaredThrowableException) (obj)).getCause());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Throwable) (obj)));
        }
        return;
        obj;
        a(((ExecutionException) (obj)).getCause());
        return;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }
}
