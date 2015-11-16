// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

class cgs extends chy
{

    private int b;
    final cgh c;

    public cgs(cgh cgh1, int i, boolean flag, boolean flag1)
    {
        this(cgh1, i, flag, true, eeo.a);
    }

    public cgs(cgh cgh1, int i, boolean flag, boolean flag1, int j)
    {
        c = cgh1;
        super(cgh1, i - 1, cgv.f - 1, flag, flag1);
        b = j;
    }

    protected void a(zq zq1)
    {
    }

    protected void a(zq zq1, amj amj1)
    {
        zq1 = (eej)zq1.a;
        zq1.j();
        zq1.k();
        amj1 = amj1.a();
        amj1.a = cgh.d(c);
        boolean flag = cgh.e(c).c(amj1);
        boolean flag1 = cgh.e(c).b(amj1);
        zq1.a(amj1, cgh.d(c), flag1, b);
        zq1.a(flag, false);
    }

    protected volatile void a(zq zq1, Cursor cursor)
    {
        a(zq1, (amj)cursor);
    }
}
