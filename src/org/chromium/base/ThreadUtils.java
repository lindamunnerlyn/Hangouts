// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;

public class ThreadUtils
{

    private static final Object a = new Object();
    private static boolean b = false;
    private static Handler c = null;

    public ThreadUtils()
    {
    }

    public static Looper a()
    {
        return b().getLooper();
    }

    public static void a(Runnable runnable)
    {
        boolean flag;
        if (b().getLooper() == Looper.myLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            runnable.run();
            return;
        } else
        {
            b().post(runnable);
            return;
        }
    }

    private static Handler b()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (b)
        {
            throw new RuntimeException("Did not yet override the UI thread");
        }
        break MISSING_BLOCK_LABEL_33;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        c = new Handler(Looper.getMainLooper());
        Handler handler = c;
        obj;
        JVM INSTR monitorexit ;
        return handler;
    }

    public static void b(Runnable runnable)
    {
        b().post(runnable);
    }

    private static boolean isThreadPriorityAudio(int i)
    {
        return Process.getThreadPriority(i) == -16;
    }

    public static void setThreadPriorityAudio(int i)
    {
        Process.setThreadPriority(i, -16);
    }

}
