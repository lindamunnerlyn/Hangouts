// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeoutException;

final class bgu
    implements Runnable
{

    final bgs a;

    bgu(bgs bgs1)
    {
        a = bgs1;
        super();
    }

    public void run()
    {
        synchronized (a.c)
        {
            if (a.a >= 0)
            {
                a.a = -1;
                a.a(new TimeoutException());
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
