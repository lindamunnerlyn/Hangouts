// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

public final class fds
    implements feh
{

    private static final Status a = new Status(13);

    public fds()
    {
    }

    static Status a()
    {
        return a;
    }

    public ene a(emy emy1, Activity activity, Intent intent)
    {
        android.graphics.Bitmap bitmap;
        if (g.rr)
        {
            bitmap = g.b(activity);
        } else
        {
            bitmap = null;
        }
        return emy1.a(new fdt(this, emy1, intent, bitmap, activity));
    }

}
