// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class bjk
    implements android.widget.TabHost.OnTabChangeListener
{

    final bje a;

    bjk(bje bje1)
    {
        a = bje1;
        super();
    }

    public void onTabChanged(String s)
    {
        int i = g.a((Integer)bje.i(a).get(s), 0);
        bje.a(a, i, false);
        bje.j(a);
    }
}
