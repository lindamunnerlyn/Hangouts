// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

final class bvh extends boh
    implements fsn, hhi, hkc, hkd
{

    final Context a;
    buz b;
    gaw c;
    private final bof d = bof.a();
    private bvi e;

    bvh(Context context, hjm hjm1)
    {
        a = context;
        hjm1.a(this);
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        b = (buz)hgx1.a(buz);
    }

    public void a(gho gho, fyb fyb)
    {
        if (fyb instanceof ghm)
        {
            fyb = (ghm)fyb;
            if (fyb.c())
            {
                b.a(g.a(a, 2, gho, fyb.d(), l.eM, l.eN, l.eL));
            }
        } else
        if (fyb instanceof ght)
        {
            fyb = (ght)fyb;
            b.a(g.a(a, 1, gho, fyb.b(), l.ed, l.ee, l.ec));
            return;
        }
    }

    public void a(ghs ghs)
    {
        c = (gaw)bnd.a().p().a(gaw);
        e = new bvi(this);
        c.a(e);
    }

    public void a(String s, int i, String s1, String s2)
    {
        if (i == 0)
        {
            b.a((new buy()).a(s2).b());
        }
    }

    public void e()
    {
        buz buz1 = b;
        Context context = a;
        buz1.a((new buy()).a(context.getResources().getString(l.cR)).a(0).b());
        if (c != null)
        {
            c.b(e);
            e = null;
        }
    }

    public void j()
    {
        buz buz1 = b;
        Context context = a;
        buz1.a((new buy()).a(0).a(context.getResources().getString(l.cD)).b());
    }

    public void j_()
    {
        d.a(this);
    }

    public void k()
    {
        buz buz1 = b;
        Context context = a;
        buz1.a((new buy()).a(0).a(context.getResources().getString(l.cC)).b());
    }

    public void k_()
    {
        d.b(this);
    }
}
