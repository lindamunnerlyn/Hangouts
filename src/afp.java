// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class afp
    implements Runnable
{

    final agd a;
    private final afw b;
    private final aga c;
    private final Runnable d;

    public afp(agd agd, afw afw1, aga aga1, Runnable runnable)
    {
        a = agd;
        super();
        b = afw1;
        c = aga1;
        d = runnable;
    }

    public void run()
    {
        if (b.f())
        {
            b.b("canceled-at-delivery");
        } else
        {
            if (c.a())
            {
                b.a(c.a);
            } else
            {
                b.b(c.c);
            }
            if (c.d)
            {
                b.a("intermediate-response");
            } else
            {
                b.b("done");
            }
            if (d != null)
            {
                d.run();
                return;
            }
        }
    }
}
