// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

public final class fau
    implements fbj
{

    private static final Status a = new Status(13);

    public fau()
    {
    }

    static Status a()
    {
        return a;
    }

    public ekd a(ejx ejx1, Activity activity, Intent intent)
    {
        android.graphics.Bitmap bitmap;
        if (g.rp)
        {
            bitmap = g.b(activity);
        } else
        {
            bitmap = null;
        }
        return ejx1.a(new fav(this, ejx1, intent, bitmap, activity));
    }

}
