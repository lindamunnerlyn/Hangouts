// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

final class bvu extends boq
    implements hma, how, hox, hoy
{

    final Context a;
    bvm b;
    gdk c;
    private final boo d = boo.a();
    private bvv e;

    bvu(Context context, hof hof1)
    {
        a = context;
        hof1.a(this);
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        b = (bvm)hlp1.a(bvm);
    }

    public void a(gkq gkq, gap gap)
    {
        if (gap instanceof gko)
        {
            gap = (gko)gap;
            if (gap.c())
            {
                b.a(g.a(a, 2, gkq, gap.d(), l.ev, l.ew, l.eu));
            }
        } else
        if (gap instanceof gkv)
        {
            gap = (gkv)gap;
            b.a(g.a(a, 1, gkq, gap.b(), l.dM, l.dN, l.dL));
            return;
        }
    }

    public void a(gku gku)
    {
        c = (gdk)bnk.a().o().a(gdk);
        e = new bvv(this);
        c.a(e);
    }

    public void a(String s, int i, String s1, String s2)
    {
        if (i == 0)
        {
            b.a((new bvl()).a(s2).b());
        }
    }

    public void e()
    {
        bvm bvm1 = b;
        Context context = a;
        bvm1.a((new bvl()).a(context.getResources().getString(l.cA)).a(0).b());
        if (c != null)
        {
            c.b(e);
            e = null;
        }
    }

    public void k_()
    {
        d.a(this);
    }

    public void l_()
    {
        d.b(this);
    }
}
