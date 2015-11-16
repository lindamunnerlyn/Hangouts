// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class qc
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

    public static qd a(Activity activity, Drawable drawable, int i)
    {
        qd qd1 = new qd(activity);
        if (qd1.a != null)
        {
            try
            {
                activity = activity.getActionBar();
                qd1.a.invoke(activity, new Object[] {
                    drawable
                });
                qd1.b.invoke(activity, new Object[] {
                    Integer.valueOf(i)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                return qd1;
            }
        } else
        if (qd1.c != null)
        {
            qd1.c.setImageDrawable(drawable);
            return qd1;
        }
        return qd1;
    }

    public static qd a(qd qd1, Activity activity, int i)
    {
        qd qd2 = qd1;
        if (qd1 == null)
        {
            qd2 = new qd(activity);
        }
        if (qd2.a != null)
        {
            try
            {
                qd1 = activity.getActionBar();
                qd2.b.invoke(qd1, new Object[] {
                    Integer.valueOf(i)
                });
                if (android.os.Build.VERSION.SDK_INT <= 19)
                {
                    qd1.setSubtitle(qd1.getSubtitle());
                }
            }
            // Misplaced declaration of an exception variable
            catch (qd qd1)
            {
                return qd2;
            }
        }
        return qd2;
    }

}
