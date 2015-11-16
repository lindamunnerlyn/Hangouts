// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dls
    implements Runnable
{

    final dlp a;

    dls(dlp dlp1)
    {
        a = dlp1;
        super();
    }

    public void run()
    {
        dlp.a(a);
    }
}
