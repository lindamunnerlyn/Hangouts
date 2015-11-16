// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cqd
    implements Runnable
{

    final Thread a;
    final Throwable b;
    final cqc c;

    cqd(cqc cqc1, Thread thread, Throwable throwable)
    {
        c = cqc1;
        a = thread;
        b = throwable;
        super();
    }

    public void run()
    {
        if (cqc.a(c) != null)
        {
            cqc.a(c).uncaughtException(a, b);
        }
    }
}
