// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.BlockingQueue;

final class afl
    implements Runnable
{

    final afu a;
    final afk b;

    afl(afk afk1, afu afu)
    {
        b = afk1;
        a = afu;
        super();
    }

    public void run()
    {
        try
        {
            afk.a(b).put(a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
