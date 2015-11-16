// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class yy
    implements wk
{

    final yt a;

    yy(yt yt1)
    {
        a = yt1;
        super();
    }

    private void c(wl wl1)
    {
        switch (wl1.a)
        {
        default:
            return;

        case 0: // '\0'
            yt.e(a);
            return;

        case 1: // '\001'
            yt.e(a);
            return;

        case 2: // '\002'
            yt.e(a);
            return;

        case 3: // '\003'
            yt.e(a);
            break;
        }
    }

    public zs a(int i)
    {
        zs zs1;
        for (zs1 = a.b(i); zs1 == null || a.c.d(zs1.a);)
        {
            return null;
        }

        return zs1;
    }

    public void a(int i, int j)
    {
        a.a(i, j, true);
        a.f = true;
        zq zq1 = a.e;
        zq1.h = zq1.h + j;
    }

    public void a(int i, int j, Object obj)
    {
        a.a(i, j, obj);
        a.g = true;
    }

    public void a(wl wl1)
    {
        c(wl1);
    }

    public void b(int i, int j)
    {
        a.a(i, j, false);
        a.f = true;
    }

    public void b(wl wl1)
    {
        c(wl1);
    }

    public void c(int i, int j)
    {
        a.e(i, j);
        a.f = true;
    }

    public void d(int i, int j)
    {
        a.d(i, j);
        a.f = true;
    }
}
