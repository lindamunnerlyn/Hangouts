// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class aqf
    implements bye
{

    final boolean a;
    final String b;
    final aqd c;

    aqf(aqd aqd1, boolean flag, String s)
    {
        c = aqd1;
        a = flag;
        b = s;
        super();
    }

    public void a()
    {
        ani ani = dbf.e(((gmo)aqd.a(c).getBinder().a(gmo)).a());
        char c1;
        if (a)
        {
            c1 = '\u09D7';
        } else
        {
            c1 = '\u078E';
        }
        g.a(ani, c1, b);
        if (a)
        {
            c1 = '\u0A67';
        } else
        {
            c1 = '\u0A66';
        }
        aqd.a(c).c(c1);
    }

    public void a(String s)
    {
        aqd.a(c).d(s);
    }
}
