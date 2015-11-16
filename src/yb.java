// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class yb
    implements Runnable
{

    final ya a;

    yb(ya ya1)
    {
        a = ya1;
        super();
    }

    public void run()
    {
        View view = a.g();
        if (view != null && view.getWindowToken() != null)
        {
            a.c();
        }
    }
}
