// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

public final class epy
    implements android.content.DialogInterface.OnClickListener
{

    private final Activity a;
    private final ad b;
    private final Intent c;
    private final int d;

    public epy(ad ad1, Intent intent, int i)
    {
        a = null;
        b = ad1;
        c = intent;
        d = i;
    }

    public epy(Activity activity, Intent intent, int i)
    {
        a = activity;
        b = null;
        c = intent;
        d = i;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (c == null || b == null) goto _L2; else goto _L1
_L1:
        b.startActivityForResult(c, d);
_L4:
        dialoginterface.dismiss();
        return;
_L2:
        if (c != null)
        {
            a.startActivityForResult(c, d);
        }
        if (true) goto _L4; else goto _L3
_L3:
        dialoginterface;
        Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        return;
    }
}
