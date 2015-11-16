// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

final class qb
    implements pw
{

    final Activity a;
    qf b;

    qb(Activity activity)
    {
        a = activity;
    }

    public Drawable a()
    {
        return qe.a(a);
    }

    public void a(int i)
    {
        b = qe.a(b, a, i);
    }

    public void a(Drawable drawable, int i)
    {
        a.getActionBar().setDisplayShowHomeEnabled(true);
        b = qe.a(a, drawable, i);
        a.getActionBar().setDisplayShowHomeEnabled(false);
    }

    public Context b()
    {
        ActionBar actionbar = a.getActionBar();
        if (actionbar != null)
        {
            return actionbar.getThemedContext();
        } else
        {
            return a;
        }
    }

    public boolean c()
    {
        ActionBar actionbar = a.getActionBar();
        return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
    }
}
