// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

public final class p extends ef
{

    public static void a(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            activity.finishAffinity();
            return;
        } else
        {
            activity.finish();
            return;
        }
    }

    public static void a(Activity activity, String as[], int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            if (activity instanceof s)
            {
                ((s)activity).a_(i);
            }
            activity.requestPermissions(as, i);
        } else
        if (activity instanceof r)
        {
            (new Handler(Looper.getMainLooper())).post(new q(as, activity, i));
            return;
        }
    }
}
