// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Window;

final class rj
    implements tq
{

    final rc a;

    rj(rc rc1)
    {
        a = rc1;
        super();
    }

    public void a(ta ta, boolean flag)
    {
        a.b(ta);
    }

    public boolean a(ta ta)
    {
        android.view.Window.Callback callback = ((qu) (a)).b.getCallback();
        if (callback != null)
        {
            callback.onMenuOpened(108, ta);
        }
        return true;
    }
}
