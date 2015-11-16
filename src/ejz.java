// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ejz
    implements Runnable
{

    final ejx a;
    final ejy b;

    ejz(ejy ejy1, ejx ejx)
    {
        b = ejy1;
        a = ejx;
        super();
    }

    public void run()
    {
        if (b.a.isFinishing() || b.a.t_().e())
        {
            return;
        } else
        {
            b.a(elv.b(b.a), a);
            return;
        }
    }
}
