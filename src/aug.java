// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class aug extends aux
{

    private aoa d;

    public aug(View view, auh auh1, dvi dvi, int i)
    {
        super(view, auh1, dvi);
        d = dcn.e(i);
    }

    public void a(boolean flag)
    {
        if (!((auh)c).b() && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super.a(flag);
    }

    protected boolean a()
    {
        boolean flag1 = g.e(((auh)c).a());
        boolean flag;
        if (d.q() && d.y())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag1 && flag && !((auh)c).c();
    }

    protected dvg b()
    {
        String s;
        int i;
        i = ((auh)c).a();
        s = null;
        if (!g.g(i)) goto _L2; else goto _L1
_L1:
        if (d.Y())
        {
            return e().a(b.getResources().getString(l.iL)).a();
        }
        s = d.z();
_L4:
        return e().a(b.getContext().getString(l.jp, new Object[] {
            eey.p(s)
        })).a();
_L2:
        if (g.d(i))
        {
            s = aoa.K();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
