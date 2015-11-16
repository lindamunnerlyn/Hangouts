// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class afn
    implements Runnable
{

    final agb a;
    private final afu b;
    private final afy c;
    private final Runnable d;

    public afn(agb agb, afu afu1, afy afy1, Runnable runnable)
    {
        a = agb;
        super();
        b = afu1;
        c = afy1;
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
