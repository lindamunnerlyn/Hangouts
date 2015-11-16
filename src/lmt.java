// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lmt
    implements Runnable
{

    final lmq a;

    lmt(lmq lmq1)
    {
        a = lmq1;
        super();
    }

    public void run()
    {
        lmq.b(a);
    }
}
