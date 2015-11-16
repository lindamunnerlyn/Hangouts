// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import java.util.Collections;

public final class bpc
{

    final HangoutFragment a;

    public bpc(HangoutFragment hangoutfragment)
    {
        a = hangoutfragment;
        super();
    }

    aoa a()
    {
        return HangoutFragment.a(a);
    }

    void a(int i1)
    {
        HangoutFragment.e(a).setVisibility(i1);
        if (i1 == 0 && a.b != null)
        {
            eep.a(HangoutFragment.f(a), a.b, b().getString(l.c));
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
        eev.c("Babel_calls", (new StringBuilder(53)).append("Switch camera menu item visibility is now ").append(i1).toString());
        a.b();
    }

    public int c()
    {
        return HangoutFragment.c(a);
    }

    void d()
    {
        a.a.v();
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
        return a.s();
    }

    public int h()
    {
        boolean flag = true;
        bpm bpm1 = a.a.s();
        int i1;
        if (HangoutFragment.a(a).l())
        {
            i1 = 0;
        } else
        {
            i1 = ((flag) ? 1 : 0);
            if (bpm1 != null)
            {
                i1 = ((flag) ? 1 : 0);
                if (bpm1.B())
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
        eev.e("Babel_calls", (new StringBuilder(46)).append("HangoutFragment onExit with state: ").append(i1).toString());
        bpm bpm1 = a.a.s();
        if (bpm1 != null)
        {
            bpm1.c(1004);
            return;
        } else
        {
            HangoutFragment.b(a).n();
            return;
        }
    }

    public void m()
    {
        if (HangoutFragment.g(a).a("android.permission.CAMERA"))
        {
            HangoutFragment.h(a);
            return;
        } else
        {
            HangoutFragment.i(a).a(HangoutFragment.t(), Collections.singletonList("android.permission.CAMERA"), 2657, null);
            return;
        }
    }
}
