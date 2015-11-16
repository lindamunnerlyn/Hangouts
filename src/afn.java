// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.BlockingQueue;

final class afn
    implements Runnable
{

    final afw a;
    final afm b;

    afn(afm afm1, afw afw)
    {
        b = afm1;
        a = afw;
        super();
    }

    public void run()
    {
        try
        {
            b.a.put(a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
