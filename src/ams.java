// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ams
    implements Runnable
{

    final amr a;

    ams(amr amr1)
    {
        a = amr1;
        super();
    }

    public void run()
    {
        amr amr1 = a;
        fzd.b(amr1.b.getContentResolver(), new String[] {
            amr1.a
        });
        synchronized (amr1.c)
        {
            amr1.d = true;
            amr1.c.notifyAll();
        }
        amr1.a();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
