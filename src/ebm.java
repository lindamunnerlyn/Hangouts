// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.util.TabHostEx;

public final class ebm extends lk
{

    final TabHostEx a;

    public ebm(TabHostEx tabhostex)
    {
        a = tabhostex;
        super();
    }

    public void a(int i)
    {
        a.setOnTabChangedListener(null);
        a.setCurrentTab(i);
        TabHostEx.a(a, i);
        a.setOnTabChangedListener(TabHostEx.a(a));
    }
}
