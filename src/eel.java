// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.util.TabHostEx;
import com.google.android.apps.hangouts.views.MainViewPager;

public final class eel
    implements android.widget.TabHost.OnTabChangeListener
{

    final TabHostEx a;

    public eel(TabHostEx tabhostex)
    {
        a = tabhostex;
        super();
    }

    public void onTabChanged(String s)
    {
        ehv ehv1 = a.a.i();
        int i = ehv1.a(s);
        a.a.a(i);
        a.a(i);
        g.a(dcn.e(a.b.a()), ehv1.d(i).c);
    }
}
