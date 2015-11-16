// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gmj extends gmo
{

    final gmi a;

    gmj(gmi gmi1)
    {
        a = gmi1;
        super();
    }

    public void c(gmt gmt1)
    {
        if (gmt1.a().equals(a.d) && a.e != gmt1.e())
        {
            a.b(gmt1.e());
            a.e = gmt1.e();
        }
    }

    public void d(gmt gmt1)
    {
        a.d = gmt1.a();
        a.a(gmt1.e());
        a.e = gmt1.e();
        a.b();
    }
}
