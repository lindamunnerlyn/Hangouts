// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class itq
    implements Runnable
{

    final itc a;
    final Runnable b;

    itq(itc itc, Runnable runnable)
    {
        a = itc;
        b = runnable;
        super();
    }

    public void run()
    {
        itc itc;
        itc = its.b();
        its.a(a);
        b.run();
        its.a(itc);
        return;
        Exception exception;
        exception;
        its.a(itc);
        throw exception;
    }
}
