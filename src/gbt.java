// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gbt
    implements Runnable
{

    final gbs a;

    gbt(gbs gbs1)
    {
        a = gbs1;
        super();
    }

    public void run()
    {
        gkc.b("vclib", "Getting new token.");
        ggi ggi1 = gbs.a(a).a();
        if (ggi1 != null)
        {
            ggi1.b(gbs.b(a), gbs.c(a));
            gbs.a(a, new gby(a, ggi1, false, null));
            gbs.d(a).a(new Void[0]);
            g.a(this, gbs.f());
            return;
        } else
        {
            gkc.d("vclib", "Account name is null.");
            return;
        }
    }
}
