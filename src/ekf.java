// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.hangouts.wearable.WearableService;

final class ekf
    implements Runnable
{

    final Uri a;
    final Bitmap b;
    final eke c;

    ekf(eke eke1, Uri uri, Bitmap bitmap)
    {
        c = eke1;
        a = uri;
        b = bitmap;
        super();
    }

    public void run()
    {
        c.a.a(a, b);
    }
}
