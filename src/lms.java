// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lms
    implements Runnable
{

    final lmq a;

    lms(lmq lmq1)
    {
        a = lmq1;
        super();
    }

    public void run()
    {
        lmq.a(a);
    }
}
