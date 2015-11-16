// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.PopupWindow;

final class rg
    implements Runnable
{

    final rc a;

    rg(rc rc1)
    {
        a = rc1;
        super();
    }

    public void run()
    {
        a.q.showAtLocation(a.p, 55, 0, 0);
        a.m();
        kb.c(a.p, 0.0F);
        a.s = kb.p(a.p).a(1.0F);
        a.s.a(new rh(this));
    }
}
