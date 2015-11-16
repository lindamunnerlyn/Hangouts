// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import java.util.Collections;

public final class bot
{

    final HangoutFragment a;

    public bot(HangoutFragment hangoutfragment)
    {
        a = hangoutfragment;
        super();
    }

    ani a()
    {
        return HangoutFragment.a(a);
    }

    void a(int i1)
    {
        HangoutFragment.e(a).setVisibility(i1);
        if (i1 == 0 && a.b != null)
        {
            ebr.a(HangoutFragment.f(a), a.b, b().getString(l.c));
        }
    }

    public void a(String s)
    {
        HangoutFragment hangoutfragment = a;
        boolean flag;
        if (!HangoutFragment.d(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        HangoutFragment.a(hangoutfragment, s, flag);
    }

    ai b()
    {
        return HangoutFragment.b(a);
    }

    public void b(int i1)
    {
        HangoutFragment.b(a, i1);
        ebw.c("Babel_calls", (new StringBuilder(53)).append("Switch camera menu item visibility is now ").append(i1).toString());
        a.b();
    }

    public int c()
    {
        return HangoutFragment.c(a);
    }

    void d()
    {
        a.a.x();
        if (HangoutFragment.c(a) == 0 || HangoutFragment.c(a) == 1)
        {
            HangoutFragment.a(a, 2);
        }
    }

    public ap e()
    {
        return a.getFragmentManager();
    }

    bq f()
    {
        return a.getLoaderManager();
    }

    public int g()
    {
        return a.t();
    }

    public int h()
    {
        boolean flag = true;
        bpd bpd1 = a.a.t();
        int i1;
        if (HangoutFragment.a(a).n())
        {
            i1 = 0;
        } else
        {
            i1 = ((flag) ? 1 : 0);
            if (bpd1 != null)
            {
                i1 = ((flag) ? 1 : 0);
                if (bpd1.C())
                {
                    return 2;
                }
            }
        }
        return i1;
    }

    boolean i()
    {
        return HangoutFragment.d(a);
    }

    public void j()
    {
        a.b();
    }

    void k()
    {
        a.c();
    }

    public void l()
    {
        int i1 = HangoutFragment.c(a);
        ebw.e("Babel_calls", (new StringBuilder(46)).append("HangoutFragment onExit with state: ").append(i1).toString());
        bpd bpd1 = a.a.t();
        if (bpd1 != null)
        {
            bpd1.c(1004);
        }
        HangoutFragment.b(a).n();
    }

    public void m()
    {
        if (HangoutFragment.g(a).a("android.permission.CAMERA"))
        {
            HangoutFragment.h(a);
            return;
        } else
        {
            HangoutFragment.i(a).a(HangoutFragment.u(), Collections.singletonList("android.permission.CAMERA"), 2657, null);
            return;
        }
    }
}
