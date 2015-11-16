// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class gah
    implements Runnable
{

    final gae a;

    gah(gae gae1)
    {
        a = gae1;
        super();
    }

    public void run()
    {
        gae gae1 = a;
        synchronized (gae1.b)
        {
            if (gae1.a)
            {
                gae1.c.a(TimeUnit.MILLISECONDS);
                gae1.b.d();
                gae1.a = false;
            }
        }
        return;
        exception;
        emy1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
