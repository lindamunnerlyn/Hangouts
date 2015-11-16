// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class qc
    implements pw
{

    final Activity a;

    qc(Activity activity)
    {
        a = activity;
    }

    public Drawable a()
    {
        TypedArray typedarray = b().obtainStyledAttributes(null, new int[] {
            0x101030b
        }, 0x10102ce, 0);
        Drawable drawable = typedarray.getDrawable(0);
        typedarray.recycle();
        return drawable;
    }

    public void a(int i)
    {
        ActionBar actionbar = a.getActionBar();
        if (actionbar != null)
        {
            actionbar.setHomeActionContentDescription(i);
        }
    }

    public void a(Drawable drawable, int i)
    {
        ActionBar actionbar = a.getActionBar();
        if (actionbar != null)
        {
            actionbar.setHomeAsUpIndicator(drawable);
            actionbar.setHomeActionContentDescription(i);
        }
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
