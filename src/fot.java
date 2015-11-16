// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fot extends Thread
{

    final for a;

    public fot(for for1)
    {
        a = for1;
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
