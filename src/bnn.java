// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bnn
    implements Runnable
{

    final bnm a;

    bnn(bnm bnm1)
    {
        a = bnm1;
        super();
    }

    public void run()
    {
        bnm.a(a);
    }
}
