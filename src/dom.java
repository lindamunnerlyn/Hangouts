// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.hangouts.service.NetworkConnectivityChangeReceiver;

public final class dom extends ain
{

    private static final boolean b = false;
    private final Context a;

    public dom(Context context)
    {
        a = context;
    }

    protected void a(Activity activity)
    {
        if (b)
        {
            eev.b("Babel", "Enable foreground broadcast receivers");
        }
        a.getPackageManager().setComponentEnabledSetting(new ComponentName(a, com/google/android/apps/hangouts/service/NetworkConnectivityChangeReceiver), 1, 1);
    }

    protected void b()
    {
        if (b)
        {
            eev.b("Babel", "Disable foreground broadcast receivers");
        }
        a.getPackageManager().setComponentEnabledSetting(new ComponentName(a, com/google/android/apps/hangouts/service/NetworkConnectivityChangeReceiver), 2, 1);
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
