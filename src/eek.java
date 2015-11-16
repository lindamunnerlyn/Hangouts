// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.util.TabHostEx;

public final class eek extends lk
{

    final TabHostEx a;

    public eek(TabHostEx tabhostex)
    {
        a = tabhostex;
        super();
    }

    public void a(int i)
    {
        a.setOnTabChangedListener(null);
        a.setCurrentTab(i);
        a.a(i);
        a.setOnTabChangedListener(a.c);
    }
}
