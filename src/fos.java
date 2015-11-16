// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fos extends Thread
{

    final for a;

    public fos(for for1)
    {
        a = for1;
        super("PeopleAggregator-aggregator");
    }

    public final void run()
    {
        try
        {
            for.a(a);
            return;
        }
        catch (Exception exception)
        {
            g.a("PeopleAggregator", "Unknown exception during aggregation", exception);
        }
        for.b(a);
    }
}
