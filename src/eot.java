// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public final class eot
    implements eor
{

    private static eot a;

    public eot()
    {
    }

    public static eor c()
    {
        eot;
        JVM INSTR monitorenter ;
        eot eot1;
        if (a == null)
        {
            a = new eot();
        }
        eot1 = a;
        eot;
        JVM INSTR monitorexit ;
        return eot1;
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
