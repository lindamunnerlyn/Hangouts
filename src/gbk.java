// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.Executor;

public abstract class gbk extends AsyncTask
{

    public static long d = 40000L;
    private final long a;
    private boolean b;

    public gbk()
    {
        this(10000L);
    }

    public gbk(long l)
    {
        gbh.a();
        a = l;
    }

    public static void a(long l)
    {
        d = 10000L + l;
    }

    public static void a(Runnable runnable)
    {
        THREAD_POOL_EXECUTOR.execute(runnable);
    }

    public final transient gbk a(Object aobj[])
    {
        gbh.a();
        b = true;
        executeOnExecutor(THREAD_POOL_EXECUTOR, aobj);
        return this;
    }

    public transient abstract Object a();

    protected final transient Object doInBackground(Object aobj[])
    {
        long l;
        gbh.a(b);
        l = SystemClock.elapsedRealtime();
        Object obj = a();
        l = SystemClock.elapsedRealtime() - l;
        if (l > a)
        {
            if (getClass().isAnonymousClass())
            {
                aobj = toString();
            } else
            {
                aobj = getClass().getSimpleName();
            }
            Log.println(5, "Babel", String.format("%s TOOK TOO LONG! (%dms > %dms)", new Object[] {
                aobj, Long.valueOf(l), Long.valueOf(a)
            }));
        }
        return obj;
        Exception exception;
        exception;
        l = SystemClock.elapsedRealtime() - l;
        if (l > a)
        {
            if (getClass().isAnonymousClass())
            {
                aobj = toString();
            } else
            {
                aobj = getClass().getSimpleName();
            }
            Log.println(5, "Babel", String.format("%s TOOK TOO LONG! (%dms > %dms)", new Object[] {
                aobj, Long.valueOf(l), Long.valueOf(a)
            }));
        }
        throw exception;
    }

    public void onPostExecute(Object obj)
    {
        gbh.a("Use SafeAsyncTask.executeOnThreadPool");
    }

}
