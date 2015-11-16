// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickContactView;

final class bey
    implements android.view.View.OnClickListener
{

    final ben a;

    bey(ben ben1)
    {
        a = ben1;
        super();
    }

    public void onClick(View view)
    {
        view = (QuickContactView)view;
        g.a(ben.g(a), 2293);
        ben.a(a, view.c(), view.a(), view.b());
    }
}
