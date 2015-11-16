// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bve
    implements Runnable
{

    final bvc a;

    bve(bvc bvc1)
    {
        a = bvc1;
        super();
    }

    public void run()
    {
        bvc.b(a);
        bvc.c(a);
    }
}
