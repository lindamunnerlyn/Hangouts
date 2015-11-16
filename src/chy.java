// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

class chy extends cje
{

    private int b;
    final chn c;

    public chy(chn chn1, int i, boolean flag, boolean flag1)
    {
        this(chn1, i, flag, true, ehq.a);
    }

    public chy(chn chn1, int i, boolean flag, boolean flag1, int j)
    {
        c = chn1;
        super(chn1, i - 1, cib.f - 1, flag, flag1);
        b = j;
    }

    protected void a(zs zs1)
    {
    }

    protected void a(zs zs1, anb anb1)
    {
        zs1 = (ehl)zs1.a;
        zs1.j();
        zs1.k();
        anb1 = anb1.a();
        anb1.a = c.i;
        boolean flag = c.f.c(anb1);
        boolean flag1 = c.f.b(anb1);
        zs1.a(anb1, c.i, flag1, b);
        zs1.a(flag, false);
    }

    protected volatile void a(zs zs1, Cursor cursor)
    {
        a(zs1, (anb)cursor);
    }
}
