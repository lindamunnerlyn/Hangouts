// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ze
    implements zd
{

    final yt a;

    ze(yt yt1)
    {
        a = yt1;
        super();
    }

    public void a(zs zs1)
    {
        zs1.a(true);
        if (!yt.c(a, zs1.a) && zs1.p())
        {
            a.removeDetachedView(zs1.a, false);
        }
    }

    public void b(zs zs1)
    {
        zs1.a(true);
        if (!zs.e(zs1))
        {
            yt.c(a, zs1.a);
        }
    }

    public void c(zs zs1)
    {
        zs1.a(true);
        if (!zs.e(zs1))
        {
            yt.c(a, zs1.a);
        }
    }

    public void d(zs zs1)
    {
        zs1.a(true);
        if (zs1.g != null && zs1.h == null)
        {
            zs1.g = null;
            zs1.a(-65, zs.f(zs1));
        }
        zs1.h = null;
        if (!zs.e(zs1))
        {
            yt.c(a, zs1.a);
        }
    }
}
