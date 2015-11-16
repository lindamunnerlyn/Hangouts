// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bdh
{

    public eei a;
    public ebh b;
    final bdf c;

    bdh(bdf bdf)
    {
        c = bdf;
        super();
        a = null;
        b = null;
    }

    public void a()
    {
        if (b != null)
        {
            b.b();
            b = null;
        }
        if (a != null)
        {
            a.c();
            a = null;
        }
    }
}
