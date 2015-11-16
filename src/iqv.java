// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class iqv
{

    private static final android.os.StrictMode.ThreadPolicy a = (new android.os.StrictMode.ThreadPolicy.Builder()).detectAll().penaltyDeath().penaltyLog().build();
    private static final android.os.StrictMode.ThreadPolicy b = (new android.os.StrictMode.ThreadPolicy.Builder()).detectNetwork().penaltyDeath().penaltyLog().build();

    static Executor a(kal kal1)
    {
        return kal1;
    }

    static Executor a(kam kam1)
    {
        return kam1;
    }

    static kam a()
    {
        ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors(), (new kat()).a().a("Lightweight Thread #%d").a(new iqw()).b());
        if (scheduledexecutorservice instanceof kam)
        {
            return (kam)scheduledexecutorservice;
        } else
        {
            return new kap(scheduledexecutorservice);
        }
    }

    static kal b()
    {
        java.util.concurrent.ExecutorService executorservice = Executors.newCachedThreadPool((new kat()).a().a("Blocking Thread #%d").a(new iqy()).b());
        if (executorservice instanceof kal)
        {
            return (kal)executorservice;
        }
        if (executorservice instanceof ScheduledExecutorService)
        {
            return new kap((ScheduledExecutorService)executorservice);
        } else
        {
            return new kao(executorservice);
        }
    }

    static android.os.StrictMode.ThreadPolicy c()
    {
        return a;
    }

}
