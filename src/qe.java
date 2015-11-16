// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class qe
{

    private static final int a[] = {
        0x101030b
    };

    public static Drawable a(Activity activity)
    {
        activity = activity.obtainStyledAttributes(a);
        Drawable drawable = activity.getDrawable(0);
        activity.recycle();
        return drawable;
    }

    public static qf a(Activity activity, Drawable drawable, int i)
    {
        qf qf1 = new qf(activity);
        if (qf1.a != null)
        {
            try
            {
                activity = activity.getActionBar();
                qf1.a.invoke(activity, new Object[] {
                    drawable
                });
                qf1.b.invoke(activity, new Object[] {
                    Integer.valueOf(i)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                return qf1;
            }
        } else
        if (qf1.c != null)
        {
            qf1.c.setImageDrawable(drawable);
            return qf1;
        }
        return qf1;
    }

    public static qf a(qf qf1, Activity activity, int i)
    {
        qf qf2 = qf1;
        if (qf1 == null)
        {
            qf2 = new qf(activity);
        }
        if (qf2.a != null)
        {
            try
            {
                qf1 = activity.getActionBar();
                qf2.b.invoke(qf1, new Object[] {
                    Integer.valueOf(i)
                });
                if (android.os.Build.VERSION.SDK_INT <= 19)
                {
                    qf1.setSubtitle(qf1.getSubtitle());
                }
            }
            // Misplaced declaration of an exception variable
            catch (qf qf1)
            {
                return qf2;
            }
        }
        return qf2;
    }

}
