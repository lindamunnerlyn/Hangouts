// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.lang.ref.WeakReference;

final class lt
    implements Runnable
{

    WeakReference a;
    lr b;
    final ls c;

    lt(ls ls1, lr lr, View view)
    {
        c = ls1;
        super();
        a = new WeakReference(view);
        b = lr;
    }

    public void run()
    {
        View view = (View)a.get();
        if (view != null)
        {
            c.c(b, view);
        }
    }
}
