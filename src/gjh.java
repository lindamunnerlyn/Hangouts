// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gjh extends gjm
{

    final gjg a;

    gjh(gjg gjg1)
    {
        a = gjg1;
        super();
    }

    public void c(gjr gjr1)
    {
        if (gjr1.a().equals(a.a) && a.b != gjr1.e())
        {
            a.b(gjr1.e());
            a.b = gjr1.e();
        }
    }

    public void d(gjr gjr1)
    {
        a.a = gjr1.a();
        a.a(gjr1.e());
        a.b = gjr1.e();
        a.b();
    }
}
