// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class yw
    implements wi
{

    final yr a;

    yw(yr yr1)
    {
        a = yr1;
        super();
    }

    private void c(wj wj1)
    {
        switch (wj1.a)
        {
        default:
            return;

        case 0: // '\0'
            yr.e(a);
            return;

        case 1: // '\001'
            yr.e(a);
            return;

        case 2: // '\002'
            yr.e(a);
            return;

        case 3: // '\003'
            yr.e(a);
            break;
        }
    }

    public zq a(int i)
    {
        zq zq1;
        for (zq1 = a.b(i); zq1 == null || a.c.d(zq1.a);)
        {
            return null;
        }

        return zq1;
    }

    public void a(int i, int j)
    {
        a.a(i, j, true);
        a.f = true;
        zo zo1 = a.e;
        zo1.h = zo1.h + j;
    }

    public void a(int i, int j, Object obj)
    {
        a.a(i, j, obj);
        a.g = true;
    }

    public void a(wj wj1)
    {
        c(wj1);
    }

    public void b(int i, int j)
    {
        a.a(i, j, false);
        a.f = true;
    }

    public void b(wj wj1)
    {
        c(wj1);
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
