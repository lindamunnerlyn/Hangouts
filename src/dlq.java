// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dlq
    implements Runnable
{

    final dlt a;
    final dlp b;

    dlq(dlp dlp1, dlt dlt)
    {
        b = dlp1;
        a = dlt;
        super();
    }

    public void run()
    {
        b.a(a);
    }
}