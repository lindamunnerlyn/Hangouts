// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jsq extends jrr
    implements Runnable
{

    private final Runnable b;

    public jsq(Runnable runnable)
    {
        b = (Runnable)n.b(runnable);
    }

    public void run()
    {
        try
        {
            b.run();
            return;
        }
        catch (Throwable throwable)
        {
            a(throwable);
            throw l.a(throwable);
        }
    }
}
