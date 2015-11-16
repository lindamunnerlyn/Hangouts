// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.PowerManager;
import android.util.SparseArray;

final class grj
{

    private static grj a;
    private final Context b;
    private final SparseArray c = new SparseArray();
    private int d;

    private grj(Context context)
    {
        b = context;
    }

    static grj a(Context context)
    {
        grj;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new grj(context);
        }
        context = a;
        grj;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    int a()
    {
        SparseArray sparsearray = c;
        sparsearray;
        JVM INSTR monitorenter ;
        int i;
        i = d + 1;
        d = i;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        d = 1;
        android.os.PowerManager.WakeLock wakelock = ((PowerManager)b.getSystemService("power")).newWakeLock(1, "BackgroundTaskService");
        wakelock.setReferenceCounted(false);
        wakelock.acquire(60000L);
        c.put(d, wakelock);
        sparsearray;
        JVM INSTR monitorexit ;
        return d;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void a(int i)
    {
        SparseArray sparsearray = c;
        sparsearray;
        JVM INSTR monitorenter ;
        android.os.PowerManager.WakeLock wakelock = (android.os.PowerManager.WakeLock)c.get(i);
        if (wakelock == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        wakelock.release();
        c.remove(i);
        sparsearray;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
