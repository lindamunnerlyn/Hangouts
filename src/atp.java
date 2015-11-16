// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class atp extends aug
{

    private ani d;

    public atp(View view, atq atq1, dsp dsp, int i)
    {
        super(view, atq1, dsp);
        d = dbf.e(i);
    }

    public void a(boolean flag)
    {
        if (!((atq)c).b() && flag)
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
        boolean flag1 = g.e(((atq)c).a());
        boolean flag;
        if (d.s() && d.A())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag1 && flag && !((atq)c).c();
    }

    protected dsn b()
    {
        String s;
        int i;
        i = ((atq)c).a();
        s = null;
        if (!g.g(i)) goto _L2; else goto _L1
_L1:
        if (d.ab())
        {
            return e().a(b.getResources().getString(l.jt)).a();
        }
        s = d.B();
_L4:
        return e().a(b.getContext().getString(l.jW, new Object[] {
            ebz.p(s)
        })).a();
_L2:
        if (g.d(i))
        {
            s = ani.N();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
