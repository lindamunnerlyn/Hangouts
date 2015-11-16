// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cgz
    implements asn
{

    final cgy a;

    cgz(cgy cgy1)
    {
        a = cgy1;
        super();
    }

    public void a()
    {
    }

    public void a(String s)
    {
        boolean flag = true;
        bjp bjp1;
        byte byte0;
        if (cgy.b(a).b() > 1)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        bjp1 = cgy.e(a);
        if (cgy.d(a) != atu.d)
        {
            flag = false;
        }
        bjp1.a(s, byte0, flag, cgy.b(a).a());
    }

    public void a(boolean flag)
    {
        if (flag && !cgy.a(a) && cgy.b(a).b() == 1)
        {
            cgy.c(a);
        }
    }
}
