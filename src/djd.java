// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Html;

public final class djd extends dje
{

    private final String l;

    public djd(cyx cyx1)
    {
        super(cyx1.c, cyx1.d, cyx1.e, cyx1.n, cyx1.m, cyx1.l, cyx1.f, cyx1.h, cyx1.i, dqb.e, cyx1.u);
        l = Html.fromHtml(cyx1.a).toString();
    }

    public djd(String s, cey cey, long l1, long l2, String s1, 
            String s2, dqb dqb1)
    {
        super(s, cey, l1, l2, s1, null, -1, 1, 0L, dqb1, null);
        l = Html.fromHtml(s2).toString();
    }

    private void c(aoe aoe1, dfb dfb1)
    {
        if (l != null)
        {
            long l1 = aoe1.a(f, a, k, g, dqc.d, h, i, c, l, null);
            aoe1.a(f, h, i, 5, g, l1, k, l, null);
            any.d(aoe1, f);
            dfb1.a(h);
        }
    }

    public void a(aoe aoe1, dfb dfb1)
    {
        aoe1.a();
        c(aoe1, dfb1);
        a(aoe1);
        if (l != null)
        {
            aoe1.b(f, l);
        }
        aoe1.b();
        aoe1.c();
        return;
        dfb1;
        aoe1.c();
        throw dfb1;
    }

    public void b(aoe aoe1, dfb dfb1)
    {
        c(aoe1, dfb1);
        b(aoe1);
    }
}
