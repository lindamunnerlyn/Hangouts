// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dpd
    implements Runnable
{

    final fti a;
    final ftp b;
    final doy c;

    dpd(doy doy1, fti fti, ftp ftp)
    {
        c = doy1;
        a = fti;
        b = ftp;
        super();
    }

    public void run()
    {
        doy.a(c, a, b);
    }
}
