// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aqw
    implements bzh
{

    final boolean a;
    final String b;
    final aqu c;

    aqw(aqu aqu1, boolean flag, String s)
    {
        c = aqu1;
        a = flag;
        b = s;
        super();
    }

    public void a()
    {
        aoa aoa = dcn.e(((gqu)aqu.a(c).getBinder().a(gqu)).a());
        char c1;
        if (a)
        {
            c1 = '\u09D7';
        } else
        {
            c1 = '\u078E';
        }
        g.a(aoa, c1, b);
        if (a)
        {
            c1 = '\u0A67';
        } else
        {
            c1 = '\u0A66';
        }
        aqu.a(c).c(c1);
    }

    public void a(String s)
    {
        aqu.a(c).d(s);
    }
}
