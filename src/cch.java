// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class cch extends pv
{

    final NavigationDrawerFragment b;

    public cch(NavigationDrawerFragment navigationdrawerfragment)
    {
        b = navigationdrawerfragment;
        super(navigationdrawerfragment.getActivity(), NavigationDrawerFragment.e(navigationdrawerfragment), l.gz, l.gy);
    }

    private aoa e()
    {
        return dcn.e(NavigationDrawerFragment.p(b).a());
    }

    public void a(int i)
    {
        super.a(i);
        if (NavigationDrawerFragment.d(b) != null)
        {
            NavigationDrawerFragment.a(b, null);
        }
        if (i != 0)
        {
            NavigationDrawerFragment.o(b).a(true);
        }
    }

    public final void a(View view)
    {
        super.a(view);
        b.getActivity().q_();
        NavigationDrawerFragment.c(b);
        g.a(e(), 1558);
    }

    public final void a(View view, float f)
    {
        super.a(view, f);
        if (f == 0.0F)
        {
            NavigationDrawerFragment.a(b, false);
        } else
        if (!NavigationDrawerFragment.n(b) && f > 0.0F)
        {
            NavigationDrawerFragment.a(b, true);
            h.a(b.getActivity().getCurrentFocus());
            return;
        }
    }

    public final void b(View view)
    {
        super.b(view);
        NavigationDrawerFragment.o(b).a();
        NavigationDrawerFragment.o(b).a(false);
        view = b.getActivity();
        if (view != null)
        {
            view.q_();
        }
        g.a(e(), 1559);
        if (NavigationDrawerFragment.d(b) != null)
        {
            NavigationDrawerFragment.d(b).run();
            NavigationDrawerFragment.a(b, null);
        }
        NavigationDrawerFragment.f(b).b(0);
        NavigationDrawerFragment.a(b, NavigationDrawerFragment.f(b));
    }
}
