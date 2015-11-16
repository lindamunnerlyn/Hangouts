// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class inm
    implements Runnable
{

    final imy a;
    final Runnable b;

    inm(imy imy, Runnable runnable)
    {
        a = imy;
        b = runnable;
        super();
    }

    public void run()
    {
        imy imy;
        imy = ino.b();
        ino.a(a);
        b.run();
        ino.a(imy);
        return;
        Exception exception;
        exception;
        ino.a(imy);
        throw exception;
    }
}
