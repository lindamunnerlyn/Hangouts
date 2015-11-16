// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jpk
    implements Runnable
{

    final Object a;
    final int b;
    final jpg c;
    final kak d;
    final jpj e;

    jpk(jpj jpj1, Object obj, int i, jpg jpg1, kak kak)
    {
        e = jpj1;
        a = obj;
        b = i;
        c = jpg1;
        d = kak;
        super();
    }

    public void run()
    {
        try
        {
            e.a(a, b, c, d);
            return;
        }
        catch (Throwable throwable)
        {
            LocalCache.a.log(Level.WARNING, "Exception thrown during refresh", throwable);
            c.a(throwable);
            return;
        }
    }
}
