// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Window;

final class rh
    implements to
{

    final ra a;

    rh(ra ra1)
    {
        a = ra1;
        super();
    }

    public void a(sy sy, boolean flag)
    {
        a.b(sy);
    }

    public boolean a(sy sy)
    {
        android.view.Window.Callback callback = ((qs) (a)).b.getCallback();
        if (callback != null)
        {
            callback.onMenuOpened(108, sy);
        }
        return true;
    }
}
