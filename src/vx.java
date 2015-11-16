// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class vx
    implements Runnable
{

    final vu a;
    private wa b;

    public vx(vu vu1, wa wa1)
    {
        a = vu1;
        super();
        b = wa1;
    }

    public void run()
    {
        a.c.f();
        View view = (View)a.f;
        if (view != null && view.getWindowToken() != null && b.e())
        {
            a.h = b;
        }
        a.j = null;
    }
}
