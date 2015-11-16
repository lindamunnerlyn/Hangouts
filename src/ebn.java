// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.util.TabHostEx;
import com.google.android.apps.hangouts.views.MainViewPager;

public final class ebn
    implements android.widget.TabHost.OnTabChangeListener
{

    final TabHostEx a;

    public ebn(TabHostEx tabhostex)
    {
        a = tabhostex;
        super();
    }

    public void onTabChanged(String s)
    {
        eet eet1 = TabHostEx.b(a).i();
        int i = eet1.a(s);
        TabHostEx.b(a).a(i);
        TabHostEx.a(a, i);
        g.a(dbf.e(TabHostEx.c(a).a()), eet1.d(i).c);
    }
}
