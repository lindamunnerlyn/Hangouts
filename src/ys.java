// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ys
    implements Runnable
{

    final yr a;

    ys(yr yr1)
    {
        a = yr1;
        super();
    }

    public void run()
    {
        if (yr.a(a))
        {
            if (yr.b(a))
            {
                g.a("RV FullInvalidate");
                a.p();
                g.a();
                return;
            }
            if (a.b.d())
            {
                g.a("RV PartialInvalidate");
                a.e();
                a.b.b();
                if (!yr.c(a))
                {
                    a.t();
                }
                a.a(true);
                g.a();
                return;
            }
        }
    }
}
