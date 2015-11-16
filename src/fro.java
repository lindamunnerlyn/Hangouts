// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fro extends Thread
{

    final frn a;

    public fro(frn frn1)
    {
        a = frn1;
        super("PeopleAggregator-aggregator");
    }

    public final void run()
    {
        try
        {
            frn.a(a);
            return;
        }
        catch (Exception exception)
        {
            g.a("PeopleAggregator", "Unknown exception during aggregation", exception);
        }
        a.d();
    }
}
