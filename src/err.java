// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public final class err
    implements erp
{

    private static err a;

    public err()
    {
    }

    public static erp c()
    {
        err;
        JVM INSTR monitorenter ;
        err err1;
        if (a == null)
        {
            a = new err();
        }
        err1 = a;
        err;
        JVM INSTR monitorexit ;
        return err1;
        Exception exception;
        exception;
        throw exception;
    }

    public long a()
    {
        return System.currentTimeMillis();
    }

    public long b()
    {
        return SystemClock.elapsedRealtime();
    }
}
