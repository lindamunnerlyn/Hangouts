// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.os.Vibrator;

public final class bmr
{

    private long a[];
    private Vibrator b;
    private boolean c;
    private ContentResolver d;
    private boolean e;

    public bmr()
    {
    }

    public void a()
    {
        if (!c)
        {
            return;
        }
        boolean flag;
        if (android.provider.Settings.System.getInt(d, "haptic_feedback_enabled", 0) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            e = flag;
            return;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            ebw.e("Babel_dialer", "Could not retrieve system setting.", notfoundexception);
        }
        e = false;
        return;
    }

    public void a(Context context, boolean flag)
    {
        c = flag;
        if (flag)
        {
            b = (Vibrator)context.getSystemService("vibrator");
            a = (new long[] {
                0L, 10L, 20L, 30L
            });
            d = context.getContentResolver();
        }
    }

    public void b()
    {
        if (!c || !e)
        {
            return;
        }
        if (a != null && a.length == 1)
        {
            b.vibrate(a[0]);
            return;
        } else
        {
            b.vibrate(a, -1);
            return;
        }
    }
}
