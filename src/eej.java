// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.util.TabHostEx;

public final class eej
    implements android.widget.TabHost.TabContentFactory
{

    final TabHostEx a;

    public eej(TabHostEx tabhostex)
    {
        a = tabhostex;
        super();
    }

    public View createTabContent(String s)
    {
        s = new View(a.getContext());
        s.setMinimumWidth(0);
        s.setMinimumHeight(0);
        return s;
    }
}
