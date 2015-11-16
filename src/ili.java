// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class ili
{

    private static final android.os.StrictMode.ThreadPolicy a = (new android.os.StrictMode.ThreadPolicy.Builder()).detectAll().penaltyDeath().penaltyLog().build();
    private static final android.os.StrictMode.ThreadPolicy b = (new android.os.StrictMode.ThreadPolicy.Builder()).detectNetwork().penaltyDeath().penaltyLog().build();

    public ili()
    {
    }

    static Executor a(jsl jsl)
    {
        return jsl;
    }

    static jsl a()
    {
        return g.a(Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors(), (new jss()).a().a("Lightweight Thread #%d").a(new ilj()).b()));
    }

    static Executor b(jsl jsl)
    {
        return jsl;
    }

    static jsl b()
    {
        return g.a(Executors.newScheduledThreadPool(0x7fffffff, (new jss()).a().a("Blocking Thread #%d").a(new ill()).b()));
    }

    static android.os.StrictMode.ThreadPolicy c()
    {
        return a;
    }

}
