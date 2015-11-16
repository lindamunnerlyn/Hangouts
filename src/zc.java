// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class zc
    implements zb
{

    final yr a;

    zc(yr yr1)
    {
        a = yr1;
        super();
    }

    public void a(zq zq1)
    {
        zq1.a(true);
        if (!yr.c(a, zq1.a) && zq1.p())
        {
            a.removeDetachedView(zq1.a, false);
        }
    }

    public void b(zq zq1)
    {
        zq1.a(true);
        if (!zq.e(zq1))
        {
            yr.c(a, zq1.a);
        }
    }

    public void c(zq zq1)
    {
        zq1.a(true);
        if (!zq.e(zq1))
        {
            yr.c(a, zq1.a);
        }
    }

    public void d(zq zq1)
    {
        zq1.a(true);
        if (zq1.g != null && zq1.h == null)
        {
            zq1.g = null;
            zq1.a(-65, zq.f(zq1));
        }
        zq1.h = null;
        if (!zq.e(zq1))
        {
            yr.c(a, zq1.a);
        }
    }
}
