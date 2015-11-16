// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

public final class cbp extends cbh
{

    public cbp()
    {
    }

    public int a()
    {
        return l.bC;
    }

    public void a(Activity activity)
    {
        g.a(a, 1604);
        if (a != null)
        {
            ((doq)hgx.a(activity, doq)).a(activity, a.h(), null);
            return;
        } else
        {
            ebw.g("Babel", "Unexpected null account in dnd_item");
            return;
        }
    }

    public int b()
    {
        return com.google.android.apps.hangouts.R.drawable.co;
    }

    public int c()
    {
        return 2;
    }

    public int d()
    {
        return 0;
    }

    public int e()
    {
        return 2;
    }
}
