// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gmg
    implements Runnable
{

    final gmf a;

    gmg(gmf gmf1)
    {
        a = gmf1;
        super();
    }

    public void run()
    {
        if (a.a != null)
        {
            gdv.a();
            a.a.d();
            a.b = false;
            a.c = false;
        }
    }
}
