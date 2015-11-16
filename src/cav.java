// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class cav
    implements android.widget.AdapterView.OnItemClickListener
{

    final NavigationDrawerFragment a;

    public cav(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        gbh.a(NavigationDrawerFragment.d(a));
        NavigationDrawerFragment.e(a).i(a.getView());
        int j = NavigationDrawerFragment.f(a).a();
        switch (NavigationDrawerFragment.f(a).a())
        {
        default:
            NavigationDrawerFragment.a(a, null);
            gbh.a((new StringBuilder(36)).append("Unknown navigation mode: ").append(j).toString());
            return;

        case 0: // '\0'
            adapterview = (cbh)NavigationDrawerFragment.g(a).getItemAtPosition(i);
            gbh.b(adapterview);
            NavigationDrawerFragment.a(a, new caw(this, adapterview));
            return;

        case 1: // '\001'
            i -= NavigationDrawerFragment.g(a).getHeaderViewsCount();
            break;
        }
        j = NavigationDrawerFragment.h(a).getItemViewType(i);
        adapterview = NavigationDrawerFragment.h(a).a(i);
        NavigationDrawerFragment.a(a, new cax(this, j, adapterview));
    }
}
