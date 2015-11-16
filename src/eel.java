// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class eel
    implements android.view.View.OnLongClickListener
{

    final eem a;
    final eej b;

    eel(eej eej, eem eem1)
    {
        b = eej;
        a = eem1;
        super();
    }

    public boolean onLongClick(View view)
    {
        a.a(b);
        return true;
    }
}
