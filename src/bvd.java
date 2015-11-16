// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bvd
    implements Runnable
{

    final bvc a;

    bvd(bvc bvc1)
    {
        a = bvc1;
        super();
    }

    public void run()
    {
        bvc.a(a);
    }
}
