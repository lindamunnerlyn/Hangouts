// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class atl
    implements efk
{

    final atk a;

    atl(atk atk1)
    {
        a = atk1;
        super();
    }

    public void a()
    {
        if (a.b != null)
        {
            a.b.a();
        }
        g.a(dcn.e(((gqu)hlp.a(a.a, gqu)).a()), 2563);
        ((ast)hlp.a(a.a, ast)).a();
    }

    public void a(int i)
    {
        ast ast1 = (ast)hlp.a(a.a, ast);
        aoa aoa = dcn.e(((gqu)hlp.a(a.a, gqu)).a());
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            g.a(aoa, 2565);
            ast1.a(3);
            return;

        case 1: // '\001'
            g.a(aoa, 2564);
            break;
        }
        ast1.a(2);
    }
}
