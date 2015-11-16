// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.PopupWindow;

final class re
    implements Runnable
{

    final ra a;

    re(ra ra1)
    {
        a = ra1;
        super();
    }

    public void run()
    {
        a.q.showAtLocation(a.p, 55, 0, 0);
        a.m();
        kb.c(a.p, 0.0F);
        a.s = kb.o(a.p).a(1.0F);
        a.s.a(new rf(this));
    }
}
