// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.hangouts.settings.SettingsActivity;

public final class cct extends ccm
{

    public cct()
    {
    }

    public int a()
    {
        return l.iM;
    }

    public void a(Activity activity)
    {
        g.a(a, 1606);
        aoa aoa1 = a;
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/settings/SettingsActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("account_id", aoa1.h());
        activity.startActivity(intent);
    }

    public int b()
    {
        return com.google.android.apps.hangouts.R.drawable.cm;
    }

    public int c()
    {
        return 7;
    }

    public int d()
    {
        return 2;
    }

    public int e()
    {
        return 7;
    }
}
