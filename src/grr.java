// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class grr
    implements Runnable
{

    final grq a;

    grr(grq grq1)
    {
        a = grq1;
        super();
    }

    public void run()
    {
        grq.a(a);
    }
}
