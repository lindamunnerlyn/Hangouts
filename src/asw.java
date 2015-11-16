// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class asw
    implements eci
{

    final asv a;

    asw(asv asv1)
    {
        a = asv1;
        super();
    }

    public void a()
    {
        if (a.b != null)
        {
            a.b.a();
        }
        g.a(dbf.e(((gmo)hgx.a(a.a, gmo)).a()), 2563);
        ((ase)hgx.a(a.a, ase)).a();
    }

    public void a(int i)
    {
        ase ase1 = (ase)hgx.a(a.a, ase);
        ani ani = dbf.e(((gmo)hgx.a(a.a, gmo)).a());
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            g.a(ani, 2565);
            ase1.a(3);
            return;

        case 1: // '\001'
            g.a(ani, 2564);
            break;
        }
        ase1.a(2);
    }
}
