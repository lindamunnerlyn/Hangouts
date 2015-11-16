// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kar extends jzm
    implements Runnable
{

    private final Runnable a;

    public kar(Runnable runnable)
    {
        a = (Runnable)n.b(runnable);
    }

    public void run()
    {
        try
        {
            a.run();
            return;
        }
        catch (Throwable throwable)
        {
            a(throwable);
            throw jok.a(throwable);
        }
    }
}
