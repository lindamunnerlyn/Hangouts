// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class frp extends Thread
{

    final frn a;

    public frp(frn frn1)
    {
        a = frn1;
        super("PeopleAggregator-contacts");
    }

    public final void run()
    {
        a.h.a("contacts query start");
        try
        {
            a.a(a.c(), null);
            return;
        }
        catch (Exception exception)
        {
            g.a("PeopleAggregator", "Error while quering contacts", exception);
            a.a(null, exception);
            return;
        }
    }
}
