// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class bjw
    implements android.widget.TabHost.OnTabChangeListener
{

    final bjq a;

    bjw(bjq bjq1)
    {
        a = bjq1;
        super();
    }

    public void onTabChanged(String s)
    {
        int i = g.a((Integer)bjq.i(a).get(s), 0);
        bjq.a(a, i, false);
        bjq.j(a);
    }
}
