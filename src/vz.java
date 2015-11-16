// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class vz
    implements Runnable
{

    final vw a;
    private wc b;

    public vz(vw vw1, wc wc1)
    {
        a = vw1;
        super();
        b = wc1;
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
