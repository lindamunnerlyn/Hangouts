// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class geh
    implements Runnable
{

    final geg a;

    geh(geg geg1)
    {
        a = geg1;
        super();
    }

    public void run()
    {
        gne.a(3, "vclib", "Getting new token.");
        gji gji1 = geg.a(a).a();
        if (gji1 != null)
        {
            gji1.b(geg.b(a), geg.c(a));
            geg.a(a, new gem(a, gji1, false, null));
            geg.d(a).a(new Void[0]);
            g.a(this, geg.d());
            return;
        } else
        {
            gne.a(5, "vclib", "Account name is null.");
            return;
        }
    }
}
