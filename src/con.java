// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class con
    implements Runnable
{

    final Thread a;
    final Throwable b;
    final com c;

    con(com com1, Thread thread, Throwable throwable)
    {
        c = com1;
        a = thread;
        b = throwable;
        super();
    }

    public void run()
    {
        if (com.a(c) != null)
        {
            com.a(c).uncaughtException(a, b);
        }
    }
}
