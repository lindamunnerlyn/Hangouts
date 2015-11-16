// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jio
    implements Runnable
{

    final Object a;
    final int b;
    final jik c;
    final jsj d;
    final jin e;

    jio(jin jin1, Object obj, int i, jik jik1, jsj jsj)
    {
        e = jin1;
        a = obj;
        b = i;
        c = jik1;
        d = jsj;
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
