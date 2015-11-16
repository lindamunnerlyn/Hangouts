// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class cbf
    implements android.view.View.OnApplyWindowInsetsListener
{

    final NavigationDrawerFragment a;

    public cbf(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        int i = windowinsets.getSystemWindowInsetTop();
        NavigationDrawerFragment.p(a).a(i);
        NavigationDrawerFragment.f(a).a(i);
        return windowinsets;
    }
}
