// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class yv
    implements Runnable
{

    final yt a;

    yv(yt yt1)
    {
        a = yt1;
        super();
    }

    public void run()
    {
        if (a.d != null)
        {
            a.d.a();
        }
        yt.d(a);
    }
}
