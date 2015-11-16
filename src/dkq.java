// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Html;

public final class dkq extends dkr
{

    private final String l;

    public dkq(dnd dnd1)
    {
        super(dnd1.c, dnd1.d, dnd1.e, dnd1.n, dnd1.m, dnd1.l, dnd1.f, dnd1.h, dnd1.i, dsu.e, dnd1.u);
        l = Html.fromHtml(dnd1.a).toString();
    }

    public dkq(String s, cgd cgd, long l1, long l2, String s1, 
            String s2, dsu dsu1)
    {
        super(s, cgd, l1, l2, s1, null, -1, 1, 0L, dsu1, null);
        l = Html.fromHtml(s2).toString();
    }

    private void c(aow aow1, dgk dgk1)
    {
        if (l != null)
        {
            long l1 = aow1.a(f, a, k, g, dsv.d, h, i, c, l, null);
            aow1.a(f, h, i, 5, g, l1, k, l, null);
            aoq.d(aow1, f);
            dgk1.a(h);
        }
    }

    public void a(aow aow1, dgk dgk1)
    {
        aow1.a();
        c(aow1, dgk1);
        a(aow1);
        if (l != null)
        {
            aow1.b(f, l);
        }
        aow1.b();
        aow1.c();
        return;
        dgk1;
        aow1.c();
        throw dgk1;
    }

    public void b(aow aow1, dgk dgk1)
    {
        c(aow1, dgk1);
        b(aow1);
    }
}
